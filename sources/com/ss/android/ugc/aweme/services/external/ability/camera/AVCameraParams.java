package com.ss.android.ugc.aweme.services.external.ability.camera;

import android.content.Context;
import android.graphics.Point;
import com.bytedance.covode.number.Covode;

public class AVCameraParams {
    public static final String[] sCameraSceneMode = {"auto", "portrait", "party", "sunset", "candlelight", "night", "hdr", "action", "landscape", "snow"};
    public boolean enableFallBack;
    public boolean enableMTKZsl;
    private boolean enableTakePictureOpt;
    public boolean enableVideoStabilization;
    public boolean isMTKPlatform;
    public int mCameraHardwareSupportLevel;
    private Point mCameraPictureSize;
    public Context mContext;
    public int mFpsRangeMax;
    public int mFpsRangeMin;
    public int mHeight;
    public byte mOptionFlags;
    public int mOutputType;
    public int mPicHeight;
    public int mPicWidth;
    public String mSceneMode;
    public int mType;
    public int mWidth;

    public interface CameraMode {
        static {
            Covode.recordClassIndex(79673);
        }
    }

    public Point getCameraPictureSize() {
        return this.mCameraPictureSize;
    }

    public boolean isEnableTakePictrueOpt() {
        return this.enableTakePictureOpt;
    }

    public boolean isValid() {
        int i2;
        if (this.mContext == null || this.mWidth <= 0 || this.mHeight <= 0 || (i2 = this.mFpsRangeMin) <= 0 || this.mFpsRangeMax < i2) {
            return false;
        }
        return true;
    }

    static {
        Covode.recordClassIndex(79672);
    }

    public void setCameraPictureSize(Point point) {
        this.mCameraPictureSize = point;
    }

    public void setOutputMode(int i2) {
        this.mOutputType = i2;
    }

    public AVCameraParams(Context context, int i2) {
        this.mType = 1;
        this.mFpsRangeMin = 7;
        this.mFpsRangeMax = 30;
        this.mWidth = 1280;
        this.mHeight = 720;
        this.mPicWidth = -1;
        this.mPicHeight = -1;
        this.mOutputType = 1;
        this.mCameraHardwareSupportLevel = 1;
        this.mOptionFlags = 1;
        this.mSceneMode = "auto";
        this.enableFallBack = true;
        this.mContext = context;
        this.mType = i2;
    }

    public AVCameraParams(Context context, int i2, int i3, int i4) {
        this.mType = 1;
        this.mFpsRangeMin = 7;
        this.mFpsRangeMax = 30;
        this.mWidth = 1280;
        this.mHeight = 720;
        this.mPicWidth = -1;
        this.mPicHeight = -1;
        this.mOutputType = 1;
        this.mCameraHardwareSupportLevel = 1;
        this.mOptionFlags = 1;
        this.mSceneMode = "auto";
        this.enableFallBack = true;
        this.mContext = context;
        this.mType = i2;
        this.mWidth = i3;
        this.mHeight = i4;
    }

    public AVCameraParams(Context context, int i2, int i3, int i4, int i5, int i6) {
        this(context, i2, i3, i4, i5, i6, false);
    }

    public AVCameraParams(Context context, int i2, int i3, int i4, int i5, int i6, boolean z) {
        boolean z2 = true;
        this.mType = 1;
        this.mFpsRangeMin = 7;
        this.mFpsRangeMax = 30;
        this.mWidth = 1280;
        this.mHeight = 720;
        this.mPicWidth = -1;
        this.mPicHeight = -1;
        this.mOutputType = 1;
        this.mCameraHardwareSupportLevel = 1;
        this.mOptionFlags = 1;
        this.mSceneMode = "auto";
        this.enableFallBack = true;
        this.mContext = context;
        this.mType = i2;
        this.mWidth = i3;
        this.mHeight = i4;
        this.mPicWidth = i5;
        this.mPicHeight = i6;
        this.enableTakePictureOpt = (i5 <= 0 || i6 <= 0) ? false : z2;
        this.enableMTKZsl = z;
    }
}
