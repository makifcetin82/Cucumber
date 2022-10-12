package _JDBC.Gun2;

import _JDBC.Gun1.JDBCParent;
import org.testng.annotations.Test;

import java.sql.ResultSet;
import java.sql.SQLException;

public class _01_SqlExample extends JDBCParent {

    //last,first, getrow,getInd,getDouble
    @Test

    public void test1() throws SQLException {
        ResultSet rs = statement.executeQuery("select city_id,city,country_id from city;");

        rs.last();// sonuncu row a gider.

        String id = rs.getString(1);//city id
        System.out.println("id=" + id);


        int idInt = rs.getInt(1);
        System.out.println("idInt=" + idInt);


        String name = rs.getString(2);//city id
        System.out.println("name=" + name);


        int nameInt = rs.getInt(2);
        System.out.println("nameInt=" + nameInt);


//tipi uygun olan döşüle mesela string alabilirsin
        //ancak tipi uygun olmayan işlemler int olarak zaten alınmaz


        int kacinciSatir = rs.getRow();
        //dolayısıyla bir sorgunun sonucuna kac satır geldigini
        //rs.last() dedikten sorna  rs.getRow() ile alabiliriz.

        rs.first();// ilk satıra gider


    }


}
