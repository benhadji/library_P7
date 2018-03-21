package org.WebService.consumer.impl.DAO;

import org.WebService.consumer.contract.DAO.UserAccountDAO;
import org.WebService.consumer.impl.RowMapper.UserAccountRM;
import org.WebService.model.UserAccount;
import org.springframework.dao.EmptyResultDataAccessException;
import org.springframework.jdbc.core.namedparam.MapSqlParameterSource;
import org.springframework.jdbc.core.namedparam.NamedParameterJdbcTemplate;

import javax.inject.Inject;
import java.sql.Types;

public class UserAccountDaoImpl extends AbstractDaoImpl implements UserAccountDAO{

    @Inject
    private UserAccountRM userAccountRM;

    public UserAccountRM getUserAccountRM() {
        return userAccountRM;
    }

    public void setUserAccountRM(UserAccountRM userAccountRM) {
        this.userAccountRM = userAccountRM;
    }

    @Override
    public void create(UserAccount user) {

        String vSQL = "INSERT INTO public.useraccount (email, password, firstname, lastname, birthdate, address, city, postcode, phonenumber) " +
                "VALUES(:email, :password, :firstName, :lastName, :birthDate, :address, :city, :postCode, :phoneNumber)";

        MapSqlParameterSource vParams = new MapSqlParameterSource();
        vParams.addValue("email", user.getEmail(), Types.VARCHAR);
        vParams.addValue("password", user.getPassword(), Types.VARCHAR);
        vParams.addValue("firstName", user.getFirstName(), Types.VARCHAR);
        vParams.addValue("lastName", user.getLastName(), Types.VARCHAR);
        vParams.addValue("birthDate", user.getBirthDate(), Types.DATE);
        vParams.addValue("address", user.getAddress(), Types.VARCHAR);
        vParams.addValue("city", user.getCity(), Types.VARCHAR);
        vParams.addValue("postCode", user.getPostCode(), Types.INTEGER);
        vParams.addValue("phoneNumber", user.getPhoneNumber(), Types.VARCHAR);


        NamedParameterJdbcTemplate vJdbcTemplate = new NamedParameterJdbcTemplate(getDataSource());
        vJdbcTemplate.update(vSQL, vParams);


    }

    @Override
    public void update(UserAccount user) {

        String vSQL = "UPDATE public.useraccount " +
                "SET email=:email, password=:password, firstname=:firstName, lastname=:lastName, birthdate=:birthDate, address=:address, city=:city, postcode=:postCode, phonenumber=:phoneNumber " +
                "WHERE id=:id";

        MapSqlParameterSource vParams = new MapSqlParameterSource();

        vParams.addValue("email", user.getEmail(), Types.VARCHAR);
        vParams.addValue("password", user.getPassword(), Types.VARCHAR);
        vParams.addValue("firstName", user.getFirstName(), Types.VARCHAR);
        vParams.addValue("lastName", user.getLastName(), Types.VARCHAR);
        vParams.addValue("bithDate", user.getBirthDate(), Types.DATE);
        vParams.addValue("address", user.getAddress(), Types.VARCHAR);
        vParams.addValue("city", user.getCity(), Types.VARCHAR);
        vParams.addValue("postCode", user.getPostCode(), Types.INTEGER);
        vParams.addValue("phoneNumber", user.getPhoneNumber(), Types.VARCHAR);


        NamedParameterJdbcTemplate vJdbcTemplate = new NamedParameterJdbcTemplate(getDataSource());
        vJdbcTemplate.update(vSQL, vParams);



    }



    @Override
    public UserAccount getByEmail(String email) {

        String vSQL = "SELECT * FROM public.userAccount WHERE email = :email";
        NamedParameterJdbcTemplate vJdbcTemplate = new NamedParameterJdbcTemplate(getDataSource());
        MapSqlParameterSource vParams = new MapSqlParameterSource("email", email);
        try {
            UserAccount userAccount =  vJdbcTemplate.queryForObject(vSQL, vParams, userAccountRM);
            return  userAccount;
        } catch (EmptyResultDataAccessException vEx) {
            return null;
        }


    }

    @Override
    public UserAccount findByLogin(String username) {
        return null;
    }
}
