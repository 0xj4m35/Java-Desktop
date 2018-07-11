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
public class SortByDienthoai implements Comparator<BanDoc>{
    public int compare(BanDoc o1, BanDoc o2) {
        int result = o1.getDienthoai().compareTo(o2.getDienthoai());
        return result;
    }        
}
