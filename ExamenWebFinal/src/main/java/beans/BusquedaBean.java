/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package beans;

import java.io.Serializable;

/**
 *
 * @author Dell
 */
public class BusquedaBean implements  Serializable{
    
    private String search;

    /**
     * @return the search
     */
    public String getSearch() {
        return search;
    }

    /**
     * @param search the search to set
     */
    public void setSearch(String search) {
        this.search = search;
    }

    @Override
    public String toString() {
        return "BusquedaBean{" + "search=" + search + '}';
    }
    
    
    
}
