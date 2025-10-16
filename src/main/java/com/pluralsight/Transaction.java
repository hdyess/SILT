package com.pluralsight;

import java.time.format.DateTimeFormatter;

public class Transaction {

    private String date;
    private String time;
    //private final LocalTime time;

    private String note;
    private String agent;
    private float amount;

    /*
    @Override
    public String toString() {

        DateTimeFormatter timeFormatter = DateTimeFormatter.ofPattern("HH:mm:ss");

        return time.format(timeFormatter);
    }
    */

    public Transaction(String date, String time, String note, String agent, float amount) {

        this.date = date;
        this.time = time;
        this.note = note;
        this.agent = agent;
        this.amount = amount;

    }

    public String getDate() {
        return date;
    }

    public void setDate(String date) {
        this.date = date;
    }

    public String getTime() {
        return time;
    }

    public void setTime(String time) {
        this.time = time;
    }

    public String getNote() {
        return note;
    }

    public void setNote(String note) {
        this.note = note;
    }

    public String getAgent() {
        return agent;
    }

    public void setAgent(String agent) {
        this.agent = agent;
    }

    public float getAmount() {
        return amount;
    }

    public void setAmount(float amount) {
        this.amount = amount;
    }
}
