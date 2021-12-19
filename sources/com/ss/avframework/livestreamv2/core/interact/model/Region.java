package com.ss.avframework.livestreamv2.core.interact.model;

import com.bytedance.covode.number.Covode;

public class Region {
    private double mHeight = 1.0d;
    private String mInteractId;
    private int mMediaType;
    private boolean mMuteAudio;
    private boolean mMuteVideo;
    private boolean mNeedWriteToSei = true;
    private int mStatus;
    private boolean mTalking;
    private long mUserId;
    private double mWidth = 1.0d;
    private double mX;
    private double mY;
    private int mZorder;

    static {
        Covode.recordClassIndex(100257);
    }

    public double getHeight() {
        return this.mHeight;
    }

    public String getInteractId() {
        return this.mInteractId;
    }

    public int getMediaType() {
        return this.mMediaType;
    }

    public int getStatus() {
        return this.mStatus;
    }

    public long getUserId() {
        return this.mUserId;
    }

    public double getWidth() {
        return this.mWidth;
    }

    public double getX() {
        return this.mX;
    }

    public double getY() {
        return this.mY;
    }

    public int getZorder() {
        return this.mZorder;
    }

    public boolean isMuteAudio() {
        return this.mMuteAudio;
    }

    public boolean isMuteVideo() {
        return this.mMuteVideo;
    }

    public boolean isTalking() {
        return this.mTalking;
    }

    public boolean needWriteToSei() {
        return this.mNeedWriteToSei;
    }

    public Region interactId(String str) {
        this.mInteractId = str;
        return this;
    }

    public Region mediaType(int i2) {
        this.mMediaType = i2;
        return this;
    }

    public Region muteAudio(boolean z) {
        this.mMuteAudio = z;
        return this;
    }

    public Region muteVideo(boolean z) {
        this.mMuteVideo = z;
        return this;
    }

    public Region status(int i2) {
        this.mStatus = i2;
        return this;
    }

    public Region talking(boolean z) {
        this.mTalking = z;
        return this;
    }

    public Region userId(long j2) {
        this.mUserId = j2;
        return this;
    }

    public Region writeToSei(boolean z) {
        this.mNeedWriteToSei = z;
        return this;
    }

    public Region zOrder(int i2) {
        this.mZorder = i2;
        return this;
    }

    public Region position(double d2, double d3) {
        this.mX = d2;
        this.mY = d3;
        return this;
    }

    public Region size(double d2, double d3) {
        this.mWidth = d2;
        this.mHeight = d3;
        return this;
    }
}
