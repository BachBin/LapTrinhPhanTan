/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package bo;

import bean.ChiTietTaiKhoanbean;
import dao.ChiTietTaiKhoandao;
import java.util.ArrayList;

/**
 *
 * @author BachBin
 */
public class ChiTietTaiKhoanbo {
    ChiTietTaiKhoandao tkd = new ChiTietTaiKhoandao();
    public ArrayList<ChiTietTaiKhoanbean> getChiTiet() {
        return tkd.getChiTiet();
    }
    public ArrayList<ChiTietTaiKhoanbean> getChiTietbyID(String stk) {
        ArrayList<ChiTietTaiKhoanbean> ds = new ArrayList<ChiTietTaiKhoanbean>();
        for (ChiTietTaiKhoanbean e : getChiTiet()) {
            if(e.getSoTaiKhoan().equals(stk)) 
                ds.add(e);
        }
        return ds;
    }
}
