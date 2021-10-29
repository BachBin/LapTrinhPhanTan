/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package bo;

import bean.TaiKhoanbean;
import dao.TaiKhoandao;
import java.util.ArrayList;

/**
 *
 * @author BachBin
 */
public class TaiKhoanbo {

    TaiKhoandao tkd = new TaiKhoandao();

    public ArrayList<TaiKhoanbean> getTaiKhoan() {
        return tkd.getTaiKhoan();
    }

    public TaiKhoanbean checkLogin(String stk, String mk) {
        for (TaiKhoanbean e : getTaiKhoan()) {
            if (e.getSoTaiKhoan().equals(stk) && e.getMatKhau().equals(mk)) {
                return e;
            }
        }
        return null;
    }
}
