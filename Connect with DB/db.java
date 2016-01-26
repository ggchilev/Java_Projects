import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.Statement;
import java.sql.ResultSet;
import java.sql.SQLException;

public class jiktak{
  // ����� ����� �� ������� ��� SQL ������� � ����� ������ (������) ��� ����,
  // � ��� ����������� � ���������, �� ����� NULL
  private static Connection connect(String url, String user, String password){
    Connection result = null;
    try{
      result = DriverManager.getConnection(url, user, password);
    }
    catch(SQLException e){
      e.printStackTrace();
    }
    return result;
  }

  public static void main(String[] args){
	  
	  
    // localhost � IP �� �������, 3306 � �����, mydb � ������
    String url = "jdbc:mysql://localhost:3306/tv";
    String user = "pesho";
    String pass = "1234";

    Connection link = jiktak.connect(url, user, pass);

    if(link == null){
      System.out.println("���, MySQL �� � ������!");
      return;
    }
    else{
      System.out.println("������� �� � MySQL �������!");
    }

    // � JDBC Statement � ��������, � ResultSet � ��������� �� ���
    Statement stmt = null;
    ResultSet resultSet = null;

    try{
      stmt = link.createStatement();
      resultSet = stmt.executeQuery("SELECT number, name, secondname FROM televisions");

      // ��������� ������������ ������� ��� �� ��� � ����������� �� ������
      while (resultSet.next()) {
        System.out.print("FN: "+resultSet.getLong("number"));
        System.out.print(", Name: "+resultSet.getString("name"));
        System.out.println(", Group: "+resultSet.getString("secondname"));
      }
    }
    catch(SQLException e){
      e.printStackTrace();
    }
    finally{
      try{
        if(stmt != null) stmt.close();
        if(resultSet != null) resultSet.close();
        if(link != null) link.close();
      }
      catch(SQLException e2){
        e2.printStackTrace();
      }
    }
  }
}