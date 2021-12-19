package com.ss.android.medialib.model;

import com.bytedance.covode.number.Covode;

public class Point {
    long left;
    long right;

    static {
        Covode.recordClassIndex(36909);
    }

    public long getLeft() {
        return this.left;
    }

    public long getRight() {
        return this.right;
    }

    public void setLeft(long j2) {
        this.left = j2;
    }

    public void setRight(long j2) {
        this.right = j2;
    }

    public Point(long j2, long j3) {
        this.left = j2;
        this.right = j3;
    }
}
