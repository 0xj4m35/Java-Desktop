/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package jtable.controller;

import java.util.Comparator;
import jtable.model.BanDoc;

/**
 *
 * @author vip
 */
public class SortByHoten implements Comparator<BanDoc>{
    public int compare(BanDoc o1, BanDoc o2) {      
        String s1 = o1.getTenBD().trim().substring(o1.getTenBD().trim().lastIndexOf(" ")+1)+o1.getTenBD().trim();
        String s2 = o2.getTenBD().trim().substring(o2.getTenBD().trim().lastIndexOf(" ")+1)+o2.getTenBD().trim();
        int result = s1.compareTo(s2);
        return result;
    }        
}
