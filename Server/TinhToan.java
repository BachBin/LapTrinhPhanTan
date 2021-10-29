/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author bachv
 */
public class TinhToan implements ITinhToan{

    @Override
    public int Cong(int a, int b) throws Exception {
        int s = a + b;    
        System.out.println("Cong: "+s);
        return s;
    }

    @Override
    public int Tru(int a, int b) throws Exception {
        int s = a - b; 
        System.out.println("Tru: "+s);
        return s;
    }

    @Override
    public int Nhan(int a, int b) throws Exception {
        int s = a * b;   
        System.out.println("Nhan: "+s);
        return s; 
    }

    @Override
    public int Chia(int a, int b) throws Exception {
        int s = a / b;   
        System.out.println("Chia: "+s);
        return s;
    }   
}
