package com.ss.android.medialib.model;

import android.graphics.PointF;
import android.graphics.Rect;
import com.bytedance.covode.number.Covode;

public class FaceDetect {
    private int action;
    private float eyeDistance;
    private FaceExtInfo faceExtInfo;
    private int faceID;
    private float pitch;
    private float[] pointVisibility;
    private PointF[] points;
    private Rect rect;
    private float roll;
    private float score;
    private int trackCount;
    private float yaw;

    public static class FaceExtInfo {
        public PointF[] eyeBrowLeftPoints;
        public PointF[] eyeBrowRightPoints;
        public int eyeCount;
        public PointF[] eyeLeftPoints;
        public PointF[] eyeRightPoints;
        public int eyebrowCount;
        public int irisCount;
        public PointF[] irisLeftPoints;
        public PointF[] irisRightPoints;
        public int lipCount;
        public PointF[] lipPoints;

        static {
            Covode.recordClassIndex(36907);
        }
    }

    static {
        Covode.recordClassIndex(36906);
    }

    public int getAction() {
        return this.action;
    }

    public float getEyeDistance() {
        return this.eyeDistance;
    }

    public FaceExtInfo getFaceExtInfo() {
        return this.faceExtInfo;
    }

    public int getFaceID() {
        return this.faceID;
    }

    public float getPitch() {
        return this.pitch;
    }

    public float[] getPointVisibility() {
        return this.pointVisibility;
    }

    public PointF[] getPoints() {
        return this.points;
    }

    public Rect getRect() {
        return this.rect;
    }

    public float getRoll() {
        return this.roll;
    }

    public float getScore() {
        return this.score;
    }

    public int getTrackCount() {
        return this.trackCount;
    }

    public float getYaw() {
        return this.yaw;
    }

    public void setAction(int i2) {
        this.action = i2;
    }

    public void setEyeDistance(float f2) {
        this.eyeDistance = f2;
    }

    public void setFaceExtInfo(FaceExtInfo faceExtInfo2) {
        this.faceExtInfo = faceExtInfo2;
    }

    public void setFaceID(int i2) {
        this.faceID = i2;
    }

    public void setPitch(float f2) {
        this.pitch = f2;
    }

    public void setPointVisibility(float[] fArr) {
        this.pointVisibility = fArr;
    }

    public void setPoints(PointF[] pointFArr) {
        this.points = pointFArr;
    }

    public void setRect(Rect rect2) {
        this.rect = rect2;
    }

    public void setRoll(float f2) {
        this.roll = f2;
    }

    public void setScore(float f2) {
        this.score = f2;
    }

    public void setTrackCount(int i2) {
        this.trackCount = i2;
    }

    public void setYaw(float f2) {
        this.yaw = f2;
    }
}
