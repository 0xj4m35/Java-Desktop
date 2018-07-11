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
public class SortByMa implements Comparator<BanDoc>{
    public int compare(BanDoc o1, BanDoc o2) {
        int result = o1.getMaBD().compareTo(o2.getMaBD());
        return result;
    }        
}
