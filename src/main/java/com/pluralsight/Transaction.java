package com.pluralsight;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.Date;
import java.util.Timer;

public class Transaction {

    //private String date;
    private LocalDate date;
    private String time;
    private String note;
    private String agent;
    private float amount;


    //displays the transaction line as text
    public String display() {
        return (this.getDate() + "|" + this.getTime() + "|" + this.getNote() + "|" + this.getAgent() + "|" + this.getAmount());
    }

    public Transaction(LocalDate date, String time, String note, String agent, float amount) {

        this.date = date;
        this.time = time;
        this.note = note;
        this.agent = agent;
        this.amount = amount;

    }

    public LocalDate getDate() {
        return date;
    }

    public void setDate(LocalDate date) {
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

} // closes transaction class
