package com.example.bluetooth.bean;

import java.util.List;

public class DataBean {
    private List<DatabaseBean> database;

    public List<DatabaseBean> getDatabase() {
        return database;
    }

    public void setDatabase(List<DatabaseBean> database) {
        this.database = database;
    }

    public static class DatabaseBean {
        /**
         * date : 2019-11-03 13:29:14
         * name : Jessica
         * period : 5.86422E8
         */

        private String date;
        private String name;
        private String period;

        public String getDate() {
            return date;
        }

        public void setDate(String date) {
            this.date = date;
        }

        public String getName() {
            return name;
        }

        public void setName(String name) {
            this.name = name;
        }

        public String getPeriod() {
            return period;
        }

        public void setPeriod(String period) {
            this.period = period;
        }
    }

//    private List<UserBean> list;
//
//    public DataBean() {
//    }
//
//    public DataBean(List<UserBean> list) {
//        this.list = list;
//    }
//
//    public List<UserBean> getList() {
//        return list;
//    }
//
//    public void setList(List<UserBean> list) {
//        this.list = list;
//    }



}
