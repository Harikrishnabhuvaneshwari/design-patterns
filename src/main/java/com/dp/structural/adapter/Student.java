package com.dp.structural.adapter;

import com.dp.structural.adapter.thirdparty.ParkerPen;

public class Student {

    // Allows for two incompatible classes to work together by wrapping an interface
    // around one of the existing classes.
    public static void main(String[] args) {
        AdapterPen adapterPen = new AdapterPen();
        adapterPen.setParkerPen(new ParkerPen());
        AssignmentWork assignmentWork = new AssignmentWork();
        assignmentWork.setPen(adapterPen);
        assignmentWork.writeAssignmentWork("I'm ready to start my adapter assignment");
    }

}
