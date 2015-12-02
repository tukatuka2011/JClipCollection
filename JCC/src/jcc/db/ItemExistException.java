/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package jcc.db;

/**
 *
 * @author ЗолотаревичОВ
 */
public class ItemExistException extends Exception {

    private Integer existId = -1;

    ItemExistException(String s, Integer existId) {
        super(s);
        this.existId = existId;
    }

    public Integer getExistId() {
        return existId;
    }
}
