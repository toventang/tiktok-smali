package com.ss.android.ugc.aweme.sticker.data;

import com.bytedance.covode.number.Covode;
import com.google.gson.a.c;

public class NormalTrackTimeStamp extends BaseTrackTimeStamp {
    @c(a = "end_time")
    private float endTime = -1.0f;
    @c(a = "h")
    private float height;
    @c(a = "r")
    private float rotation;
    private Float scale;
    @c(a = "s")
    private Float scaleForIos;
    @c(a = "start_time")
    private float startTime = -1.0f;
    @c(a = "w")
    private float width;
    private float x;
    private float y;

    static {
        Covode.recordClassIndex(88102);
    }

    public float getEndTime() {
        return this.endTime;
    }

    public float getHeight() {
        return this.height;
    }

    public float getRotation() {
        return this.rotation;
    }

    public Float getScaleForIos() {
        return this.scaleForIos;
    }

    public float getStartTime() {
        return this.startTime;
    }

    public float getWidth() {
        return this.width;
    }

    public float getX() {
        return this.x;
    }

    public float getY() {
        return this.y;
    }

    public NormalTrackTimeStamp() {
    }

    public boolean isWholeDuration() {
        if (!timeIsValid()) {
            return true;
        }
        return false;
    }

    public Float getScale() {
        Float f2 = this.scale;
        if (f2 != null) {
            return f2;
        }
        Float f3 = this.scaleForIos;
        if (f3 != null) {
            return f3;
        }
        return Float.valueOf(1.0f);
    }

    public boolean timeIsValid() {
        float f2 = this.startTime;
        if (f2 < 0.0f) {
            return false;
        }
        float f3 = this.endTime;
        if (f3 <= 0.0f || f2 > f3) {
            return false;
        }
        return true;
    }

    public void setEndTime(float f2) {
        this.endTime = f2;
    }

    public void setHeight(float f2) {
        this.height = f2;
    }

    public void setRotation(float f2) {
        this.rotation = f2;
    }

    public void setScale(Float f2) {
        this.scaleForIos = f2;
    }

    public void setScaleForIos(Float f2) {
        this.scaleForIos = f2;
    }

    public void setStartTime(float f2) {
        this.startTime = f2;
    }

    public void setWidth(float f2) {
        this.width = f2;
    }

    public void setX(float f2) {
        this.x = f2;
    }

    public void setY(float f2) {
        this.y = f2;
    }

    public NormalTrackTimeStamp(int i2) {
        super(i2);
    }
}
