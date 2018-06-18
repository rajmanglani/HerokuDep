/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package cont;

import java.util.ArrayList;
import java.util.List;
import javax.inject.Named;
import javax.enterprise.context.RequestScoped;
import org.primefaces.context.RequestContext;

/**
 *
 * @author rmanglani
 */
@Named(value = "controller1")
@RequestScoped
public class Controller1 {

    private List<Integer> numList;
    /**
     * Creates a new instance of Controller1
     */
    public Controller1() {
        numList = new ArrayList<>();
    }
    
    public void onClickB(){
        for(int i =1; i<=10; i++){
            numList.add(i);
        }
        RequestContext.getCurrentInstance().update("form2:table1");
        
    }

    public List<Integer> getNumList() {
        return numList;
    }

    public void setNumList(List<Integer> numList) {
        this.numList = numList;
    }
    
    
}
