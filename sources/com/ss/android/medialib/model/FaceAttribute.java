package com.ss.android.medialib.model;

import com.bytedance.covode.number.Covode;

public class FaceAttribute {
    float age;
    float angryScore;
    float arousal;
    float attractive;
    float blurScore;
    float boyProb;
    float[] expProbs;
    int expType;
    float happyScore;
    float illumination;
    float lipstickProb;
    float maskProb;
    float mustacheProb;
    float quality;
    float realFaceProb;
    float sadScore;
    float surpriseScore;
    float valence;
    float wearGlassProb;
    float wearHatProb;
    float wearSunglassProb;

    static {
        Covode.recordClassIndex(36903);
    }

    public static int getExpressionNum() {
        return 7;
    }

    public float getAge() {
        return this.age;
    }

    public float getAngryScore() {
        return this.angryScore;
    }

    public float getArousal() {
        return this.arousal;
    }

    public float getAttractive() {
        return this.attractive;
    }

    public float getBlurScore() {
        return this.blurScore;
    }

    public float getBoyProb() {
        return this.boyProb;
    }

    public float[] getExpProbs() {
        return this.expProbs;
    }

    public int getExpType() {
        return this.expType;
    }

    public float getHappyScore() {
        return this.happyScore;
    }

    public float getIllumination() {
        return this.illumination;
    }

    public float getLipstickProb() {
        return this.lipstickProb;
    }

    public float getMaskProb() {
        return this.maskProb;
    }

    public float getMustacheProb() {
        return this.mustacheProb;
    }

    public float getQuality() {
        return this.quality;
    }

    public float getRealFaceProb() {
        return this.realFaceProb;
    }

    public float getSadScore() {
        return this.sadScore;
    }

    public float getSurpriseScore() {
        return this.surpriseScore;
    }

    public float getValence() {
        return this.valence;
    }

    public float getWearGlassProb() {
        return this.wearGlassProb;
    }

    public float getWearHatProb() {
        return this.wearHatProb;
    }

    public float getWearSunglassProb() {
        return this.wearSunglassProb;
    }

    public void setAge(float f2) {
        this.age = f2;
    }

    public void setAngryScore(float f2) {
        this.angryScore = f2;
    }

    public void setArousal(float f2) {
        this.arousal = f2;
    }

    public void setAttractive(float f2) {
        this.attractive = f2;
    }

    public void setBlurScore(float f2) {
        this.blurScore = f2;
    }

    public void setBoyProb(float f2) {
        this.boyProb = f2;
    }

    public void setExpProbs(float[] fArr) {
        this.expProbs = fArr;
    }

    public void setExpType(int i2) {
        this.expType = i2;
    }

    public void setHappyScore(float f2) {
        this.happyScore = f2;
    }

    public void setIllumination(float f2) {
        this.illumination = f2;
    }

    public void setLipstickProb(float f2) {
        this.lipstickProb = f2;
    }

    public void setMaskProb(float f2) {
        this.maskProb = f2;
    }

    public void setMustacheProb(float f2) {
        this.mustacheProb = f2;
    }

    public void setQuality(float f2) {
        this.quality = f2;
    }

    public void setRealFaceProb(float f2) {
        this.realFaceProb = f2;
    }

    public void setSadScore(float f2) {
        this.sadScore = f2;
    }

    public void setSurpriseScore(float f2) {
        this.surpriseScore = f2;
    }

    public void setValence(float f2) {
        this.valence = f2;
    }

    public void setWearGlassProb(float f2) {
        this.wearGlassProb = f2;
    }

    public void setWearHatProb(float f2) {
        this.wearHatProb = f2;
    }

    public void setWearSunglassProb(float f2) {
        this.wearSunglassProb = f2;
    }
}
