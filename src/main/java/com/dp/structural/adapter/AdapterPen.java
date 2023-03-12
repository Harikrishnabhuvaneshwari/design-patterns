package com.dp.structural.adapter;

import com.dp.structural.adapter.thirdparty.ParkerPen;

public class AdapterPen implements Pen{

    ParkerPen parkerPen;

    public ParkerPen getParkerPen() {
        return parkerPen;
    }

    public void setParkerPen(ParkerPen parkerPen) {
        this.parkerPen = parkerPen;
    }

    @Override
    public void write(String str) {
        parkerPen.write(str);
    }

}
