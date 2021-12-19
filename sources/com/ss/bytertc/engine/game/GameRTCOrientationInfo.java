package com.ss.bytertc.engine.game;

import com.bytedance.covode.number.Covode;

public class GameRTCOrientationInfo {
    public float x_axis_0;
    public float x_axis_1;
    public float x_axis_2 = 0.0f;
    public float y_axis_0;
    public float y_axis_1;
    public float y_axis_2;
    public float z_axis_0;
    public float z_axis_1;
    public float z_axis_2;

    static {
        Covode.recordClassIndex(100893);
    }

    public GameRTCOrientationInfo(int i2) {
        double d2 = (double) ((((float) i2) / 180.0f) * 3.14f);
        this.x_axis_0 = (float) Math.cos(d2);
        this.x_axis_1 = -((float) Math.sin(d2));
        this.y_axis_0 = (float) Math.sin(d2);
        this.y_axis_1 = (float) Math.cos(d2);
        this.y_axis_2 = 0.0f;
        this.z_axis_0 = 0.0f;
        this.z_axis_1 = 0.0f;
        this.z_axis_2 = 1.0f;
    }
}
