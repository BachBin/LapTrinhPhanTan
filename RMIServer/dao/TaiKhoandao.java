/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dao;

import bean.TaiKhoanbean;
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.ArrayList;

/**
 *
 * @author BachBin
 */
public class TaiKhoandao {

    String sql;

    public ArrayList<TaiKhoanbean> getTaiKhoan() {
        ArrayList<TaiKhoanbean> ds = new ArrayList<TaiKhoanbean>();
        sql = "select * from TaiKhoan";
        try {
            Connection con = new DungChung().getConnection();
            Statement st = con.createStatement();
            ResultSet rs = st.executeQuery(sql);
            while (rs.next()) {
                ds.add(new TaiKhoanbean(rs.getString(1), rs.getString(2), rs.getLong(3), rs.getString(4)));
            }
            rs.close();
            st.close();
        } catch (Exception e) {
            e.printStackTrace();
        }
        return ds;
    }
}
