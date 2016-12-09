package com.okd.eleme;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by Vin on 08/12/2016.
 */

public class Model {

    private int cId;
    private String cName;
    private List<SubModel> subModelList;


    private int badge;

    public Model(int cId, String cName, List<SubModel> subModelList) {
        this.cId = cId;
        this.cName = cName;
        this.subModelList = subModelList;
    }

    public int getcId() {
        return cId;
    }

    public void setcId(int cId) {
        this.cId = cId;
    }

    public String getcName() {
        return cName;
    }

    public void setcName(String cName) {
        this.cName = cName;
    }

    public List<SubModel> getSubModelList() {
        return subModelList;
    }

    public void setSubModelList(List<SubModel> subModelList) {
        this.subModelList = subModelList;
    }

    public int getBadge() {
        return badge;
    }

    public void setBadge(int badge) {
        this.badge = badge;
    }

    public static class SubModel {

        /*****tag*****/
        private int cId;
        private String cName;
        /*************/

        private int num;

        private String name;
        private int age;

        public int getcId() {
            return cId;
        }

        public void setcId(int cId) {
            this.cId = cId;
        }

        public String getcName() {
            return cName;
        }

        public void setcName(String cName) {
            this.cName = cName;
        }

        public String getName() {
            return name;
        }

        public void setName(String name) {
            this.name = name;
        }

        public int getAge() {
            return age;
        }

        public void setAge(int age) {
            this.age = age;
        }

        public SubModel(String name, int age) {
            this.name = name;
            this.age = age;
        }

        public int getNum() {
            return num;
        }

        public void setNum(int num) {
            this.num = num;
        }
    }


    public static List<Model> initData(){

        List<Model> list = new ArrayList<>();

        List<SubModel> men = new ArrayList<>();
        men.add(new SubModel("Sesshoumaru",20));
        men.add(new SubModel("Inuyasha",18));
        men.add(new SubModel("Miroku",22));
        men.add(new SubModel("Myouga",60));
        men.add(new SubModel("Kouga",20));
        men.add(new SubModel("Shippo",10));
        men.add(new SubModel("mugenobyakuya",23));
        men.add(new SubModel("Naraku",25));
        men.add(new SubModel("Kohaku",14));
        men.add(new SubModel("Bankotsu",17));
        men.add(new SubModel("Toutousai",60));
        men.add(new SubModel("Mouryomaru",24));

        List<SubModel> women = new ArrayList<>();
        women.add(new SubModel("RIN",10));
        women.add(new SubModel("HigurashiKagome",18));
        women.add(new SubModel("Sango",21));
        women.add(new SubModel("KAGURA",21));
        women.add(new SubModel("Kanna",11));
        women.add(new SubModel("Kikyou",18));
        women.add(new SubModel("Kaede",58));


        list.add(new Model(1,"Men",men));
        list.add(new Model(2,"Women",women));

        return list;
    }
}
