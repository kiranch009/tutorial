package com.dao.impl;

import java.util.List;

import com.beans.User;
import com.beans.UserAddress;
import com.dao.UserDao;

public class UserDAOImpl implements UserDao
{

    public static final String SQL_CHECK_USER = "select * from user where login_id=? and login_password=?";

    @Override
    public List<User> getUser(String userName, String password)
    {
        //        Connection conn=null;
        //        PreparedStatement pstmt = null;
        //        try
        //        {
        //            Class.forName("com.mysql.jdbc.Driver");
        //            conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/online_exam", "root", "root");
        //            pstmt = conn.prepareStatement(SQL_CHECK_USER);
        //            pstmt.setString(1, userName);
        //            pstmt.setString(2, password);
        //            ResultSet rs = pstmt.executeQuery();
        //            User user = null;
        //            while (rs.next())
        //            {
        //                user = new User();
        //                user.setUserId(rs.getInt("user_id"));
        //                user.setUserName(rs.getString("user_name"));
        //                user.setLoginId(rs.getString("login_id"));
        //                user.setQualification(rs.getString("qualification"));
        //                user.setEmailId(rs.getString("email_id"));
        //                user.setMobile(rs.getString("mobile"));
        //                return user;
        //            }
        //
        //        } catch (ClassNotFoundException e)
        //        {
        //            e.printStackTrace();
        //        } catch (SQLException e)
        //        {
        //            e.printStackTrace();
        //        } finally
        //        {
        //            try
        //            {
        //                conn.close();
        //            } catch (SQLException e)
        //            {
        //                e.printStackTrace();
        //            }
        //        }
        return null;

    }

    @Override
    public void saveUser(User user)
    {
        // TODO Auto-generated method stub

    }

    @Override
    public Integer saveUserAddress(UserAddress userAddress)
    {
        // TODO Auto-generated method stub
        return null;

    }

    @Override
    public UserAddress getUserAddress(Integer addressId)
    {
        return null;
    }

}
