package com.ss.android.medialib.model;

import com.bytedance.covode.number.Covode;
import java.util.List;

public class Segment {
    String path;
    List<Point> points;
    int rotateAngle;
    float speed;

    static {
        Covode.recordClassIndex(36912);
    }

    public Segment() {
    }

    public String getPath() {
        return this.path;
    }

    public List<Point> getPoints() {
        return this.points;
    }

    public int getRotateAngle() {
        return this.rotateAngle;
    }

    public float getSpeed() {
        return this.speed;
    }

    public Point[] getPointsArray() {
        List<Point> list = this.points;
        if (list == null || list.isEmpty()) {
            return null;
        }
        Point[] pointArr = new Point[this.points.size()];
        this.points.toArray(pointArr);
        return pointArr;
    }

    public void setPath(String str) {
        this.path = str;
    }

    public void setPoints(List<Point> list) {
        this.points = list;
    }

    public void setRotateAngle(int i2) {
        this.rotateAngle = i2;
    }

    public void setSpeed(float f2) {
        this.speed = f2;
    }

    public Segment(String str, float f2, List<Point> list, int i2) {
        this.path = str;
        this.speed = f2;
        this.points = list;
        this.rotateAngle = i2;
    }
}
