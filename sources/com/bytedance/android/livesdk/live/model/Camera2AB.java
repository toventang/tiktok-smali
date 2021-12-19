package com.bytedance.android.livesdk.live.model;

import com.bytedance.covode.number.Covode;
import com.google.gson.a.c;

public class Camera2AB {
    @c(a = "camera_hw_level")
    private int cameraHWLevel;
    @c(a = "camera_type")
    private int cameraType = 1;

    static {
        Covode.recordClassIndex(10463);
    }

    public int getCameraHWLevel() {
        return this.cameraHWLevel;
    }

    public int getCameraType() {
        return this.cameraType;
    }

    public Camera2AB() {
    }

    public void setCameraHWLevel(int i2) {
        this.cameraHWLevel = i2;
    }

    public void setCameraType(int i2) {
        this.cameraType = i2;
    }

    public Camera2AB(int i2, int i3) {
        this.cameraType = i2;
        this.cameraHWLevel = i3;
    }
}
