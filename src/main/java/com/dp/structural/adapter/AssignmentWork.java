package com.dp.structural.adapter;

public class AssignmentWork {

    private Pen pen;

    public void setPen(Pen pen) {
        this.pen = pen;
    }

    public Pen getPen() {
        return pen;
    }

    public void writeAssignmentWork(String str){
        pen.write(str);
    }



}
