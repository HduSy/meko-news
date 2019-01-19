package cn.meko.model;

import java.util.List;

/**
 * Created by chu on 2017/6/2.
 */
public class TypeModel {
    private int id;
    private String name;
    private List<TypeModel> items;

    public int getId(){
        return this.id;
    }
    public void setId(int id){
        this.id = id;
    }

    public String getName(){
        return this.name;
    }
    public void setName(String name){
        this.name = name;
    }

    public List<TypeModel> getItems(){
        return this.items;
    }
    public void setItems(List<TypeModel> items){
        this.items = items;
    }
}
