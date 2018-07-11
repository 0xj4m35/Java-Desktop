/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package jtable.controller;

import java.util.ArrayList;
import jtable.model.BanDoc;


/**
 *
 * @author NguyenBach
 */
public class Search {
    public ArrayList<BanDoc> searchByMa (String s, ArrayList<BanDoc> list){
        ArrayList<BanDoc> bd = new ArrayList<BanDoc>();
         int check  = 0;
            for(BanDoc b : list){
                if (b.getMaBD().indexOf(s)>= 0){
                    bd.add(b);
                    check = 1;
                }
            }
        if(check == 1){
            return bd;
        }
        else 
         return null;
    }
    public ArrayList<BanDoc> searchByHoten (String s, ArrayList<BanDoc> list){
        ArrayList<BanDoc> bd = new ArrayList<BanDoc>();
         int check  = 0;
            for(BanDoc b : list){
                if (b.getTenBD().indexOf(s)>= 0){
                    bd.add(b);
                    check = 1;
                }
            }
        if(check == 1){
            return bd;
        }
        else 
         return null;
    }
    public ArrayList<BanDoc> searchByDchi (String s, ArrayList<BanDoc> list){
        ArrayList<BanDoc> bd = new ArrayList<BanDoc>();
         int check  = 0;
            for(BanDoc b : list){
                if (b.getDiachi().indexOf(s)>= 0){
                    bd.add(b);
                    check = 1;
                }
            }
        if(check == 1){
            return bd;
        }
        else 
         return null;
    }
    public ArrayList<BanDoc> searchByDthoai (String s, ArrayList<BanDoc> list){
        ArrayList<BanDoc> bd = new ArrayList<BanDoc>();
         int check  = 0;
            for(BanDoc b : list){
                if (b.getDienthoai().indexOf(s)>= 0){
                    bd.add(b);
                    check = 1;
                }
            }
        if(check == 1){
            return bd;
        }
        else 
         return null;
    }
    public ArrayList<BanDoc> searchByBatky (String s, ArrayList<BanDoc> list){
        ArrayList<BanDoc> bd = new ArrayList<BanDoc>();
         int check  = 0;
            for(BanDoc b : list){
                if ((b.getMaBD().indexOf(s)>= 0)||(b.getTenBD().indexOf(s)>= 0)||(b.getDiachi().indexOf(s)>= 0)||(b.getDienthoai().indexOf(s)>= 0)){
                    bd.add(b);
                    check = 1;
                }
            }
        if(check == 1){
            return bd;
        }
        else 
         return null;
    }
}