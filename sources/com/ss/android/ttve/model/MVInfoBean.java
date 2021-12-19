package com.ss.android.ttve.model;

import com.bytedance.covode.number.Covode;
import java.util.ArrayList;

public class MVInfoBean {
    public int fps;
    public int height;
    public ArrayList<MVResourceBean> resources;
    public int width;

    static {
        Covode.recordClassIndex(37641);
    }
}
