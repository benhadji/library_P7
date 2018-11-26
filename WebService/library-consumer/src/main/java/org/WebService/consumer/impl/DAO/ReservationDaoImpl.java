package org.WebService.consumer.impl.DAO;

import org.WebService.consumer.contract.DAO.ReservationDAO;
import org.WebService.consumer.impl.RowMapper.ReservationRM;
import org.WebService.model.Book;
import org.WebService.model.Reservation;
import org.WebService.model.UserAccount;
import org.springframework.jdbc.core.namedparam.BeanPropertySqlParameterSource;
import org.springframework.jdbc.core.namedparam.MapSqlParameterSource;
import org.springframework.jdbc.core.namedparam.NamedParameterJdbcTemplate;
import org.springframework.jdbc.core.namedparam.SqlParameterSource;


import javax.inject.Inject;
import java.sql.Types;
import java.util.List;

public class ReservationDaoImpl extends AbstractDaoImpl implements ReservationDAO {

    @Inject
    private ReservationRM reservationRM;

    public ReservationRM getReservationRM() {
        return reservationRM;
    }

    public void setReservationRM(ReservationRM reservationRM) {
        this.reservationRM = reservationRM;
    }


    @Override
    public void addReservation(Reservation reservation) {

        String vSQL = "INSERT INTO reservation (isbn, email, reservationdate, position) " +
                "VALUES(:isbn, :email, :reservationdate, :position)";

        MapSqlParameterSource vParams = new MapSqlParameterSource();
        vParams.addValue("isbn", reservation.getISBN(), Types.INTEGER);
        vParams.addValue("email", reservation.getEmail(), Types.VARCHAR);
        vParams.addValue("reservationdate", reservation.getReservationDate(), Types.DATE);
        vParams.addValue("position", reservation.getPosition(), Types.INTEGER);

        NamedParameterJdbcTemplate vJdbcTemplate = new NamedParameterJdbcTemplate(getDataSource());
        vJdbcTemplate.update(vSQL, vParams);

    }



    @Override
    public void updateReservation(Reservation reservation) {

        String vSQL = "UPDATE public.reservation " +
                "SET isbn=:isbn, email=:email, reservationdate=:reservationdate, position=:position " +
                "WHERE id=:id";

        MapSqlParameterSource vParams = new MapSqlParameterSource();

        vParams.addValue("id", reservation.getId(), Types.INTEGER);
        vParams.addValue("isbn", reservation.getISBN(), Types.INTEGER);
        vParams.addValue("email", reservation.getEmail(), Types.VARCHAR);
        vParams.addValue("reservationdate", reservation.getReservationDate(), Types.DATE);
        vParams.addValue("position", reservation.getPosition(), Types.INTEGER);


        NamedParameterJdbcTemplate vJdbcTemplate = new NamedParameterJdbcTemplate(getDataSource());
        vJdbcTemplate.update(vSQL, vParams);

    }


    @Override
    public void deleteReservation(Reservation reservation) {

        String vSQL = "DELETE FROM public.reservation WHERE id=:id";

        MapSqlParameterSource vParams = new MapSqlParameterSource();
        vParams.addValue("id", reservation.getId(), Types.INTEGER);

        NamedParameterJdbcTemplate vJdbcTemplate = new NamedParameterJdbcTemplate(getDataSource());
        vJdbcTemplate.update(vSQL, vParams);

    }

    @Override
    public List<Reservation> listResaByBook(Book book) {


        String vSQL = "SELECT reservation.* FROM public.reservation JOIN public.book " +
                "ON reservation.ISBN = book.ISBN WHERE book.title = :title";

        SqlParameterSource vParams = new BeanPropertySqlParameterSource(book);
        NamedParameterJdbcTemplate vJdbcTemplate = new NamedParameterJdbcTemplate(getDataSource());

        return vJdbcTemplate.query(vSQL,vParams,reservationRM);
    }

    @Override
    public List<Reservation> listResaByUser(UserAccount utilisateur) {


        String vSQL = "SELECT reservation.* FROM public.reservation JOIN public.useraccount " +
                "ON reservation.email = useraccount.email WHERE useraccount.email = :email";

        SqlParameterSource vParams = new BeanPropertySqlParameterSource(utilisateur);
        NamedParameterJdbcTemplate vJdbcTemplate = new NamedParameterJdbcTemplate(getDataSource());

        return vJdbcTemplate.query(vSQL,vParams,reservationRM);
    }



}