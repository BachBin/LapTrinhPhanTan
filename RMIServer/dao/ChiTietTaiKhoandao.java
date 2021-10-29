/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dao;

import bean.ChiTietTaiKhoanbean;
import bean.TaiKhoanbean;
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.ArrayList;

/**
 *
 * @author BachBin
 */
public class ChiTietTaiKhoandao {
   String sql;

    public ArrayList<ChiTietTaiKhoanbean> getChiTiet() {
        ArrayList<ChiTietTaiKhoanbean> ds = new ArrayList<ChiTietTaiKhoanbean>();
        sql = "select * from ChiTietTaiKhoan";
        try {
            Connection con = new DungChung().getConnection();
            Statement st = con.createStatement();
            ResultSet rs = st.executeQuery(sql);
            while (rs.next()) {
                ds.add(new ChiTietTaiKhoanbean(rs.getLong(1),rs.getDate(2),rs.getLong(3),rs.getString(4),rs.getString(5)));
            }
            rs.close();
            st.close();
        } catch (Exception e) {
            e.printStackTrace();
        }
        return ds;
    } 
}
