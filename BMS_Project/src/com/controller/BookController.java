/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.controller;

import com.dal.AuthorDAO;
import com.dal.BookDAO;
import com.dal.PublisherDAO;
import com.dal.UsersDAO;
import com.entity.Author;
import com.entity.Book;
import com.entity.BookData;
import com.entity.Publisher;
import com.entity.Users;
import java.util.ArrayList;

/**
 *
 * @author Nguyen Thai Bao
 */
public class BookController {
    
    public Users getUserLogin(String userName, String password) throws Exception {
        return new UsersDAO().getUserLogin(userName, password);
    }
    
    public ArrayList<BookData> getListBookData(Users user) throws Exception {
        ArrayList<BookData> listBookData = new ArrayList<>();
        ArrayList<Book> listBook = new BookDAO().getAllBooks(user);
        for (Book b : listBook) {
            
            String titID = b.getTitID();
            
            String title = b.getTitle();
            
            Publisher p = new PublisherDAO().getPubByID(b.getPubID());
            String pub = p.getPubName();
            
            Author a = new AuthorDAO().getAutByBookID(titID);
            String auth = a.getAuName();
            
            String notes = b.getNotes();
            
            listBookData.add(new BookData(titID, title, pub, auth, notes));
        }
        return listBookData;
    }
    
    public ArrayList<BookData> getListFound(Users user, String keyword, int type) throws Exception {
        ArrayList<BookData> listBookData = getListBookData(user);
        ArrayList<BookData> listFound = new ArrayList<>();
        switch(type) {
            case 1: {
                for (BookData b : listBookData) {
                    if (b.getTitle_id().toLowerCase().contains(keyword.toLowerCase())) {
                        listFound.add(b);
                    }
                }
                break;
            }
            case 2: {
                for (BookData b : listBookData) {
                    if (b.getTitle().toLowerCase().contains(keyword.toLowerCase())) {
                        listFound.add(b);
                    }
                }
                break;
            }
            case 3: {
                for (BookData b : listBookData) {
                    if (b.getPub().toLowerCase().contains(keyword.toLowerCase())) {
                        listFound.add(b);
                    }
                }
                break;
            }
            case 4: {
                for (BookData b : listBookData) {
                    if (b.getAuthor().toLowerCase().contains(keyword.toLowerCase())) {
                        listFound.add(b);
                    }
                }
                break;
            }
            case 5: {
                for (BookData b : listBookData) {
                    if (b.getNotes().toLowerCase().contains(keyword.toLowerCase())) {
                        listFound.add(b);
                    }
                }
                break;
            }
            default:break;
        }
        return listFound;
    }
}
