package com.ss.android.vesdk.f;

import com.bytedance.covode.number.Covode;
import com.ss.android.vesdk.ROTATE_DEGREE;
import com.ss.android.vesdk.VEListener;
import com.ss.android.vesdk.clipparam.VEAlgorithmPath;
import com.ss.android.vesdk.clipparam.VEClipAlgorithmParam;
import com.ss.android.vesdk.x;
import java.util.List;

public interface b {
    static {
        Covode.recordClassIndex(99434);
    }

    int beginGenVideoFrames(int i2, int i3, boolean z, VEListener.i iVar);

    int cancelGenVideoFrame(int i2);

    void clearNativeFromBingo();

    int genRandomSolve();

    int genSmartCutting();

    List<VEClipAlgorithmParam> getAllVideoRangeData();

    int initBingoAlgorithm();

    int initWithAlgorithm(String[] strArr, x.l lVar);

    int removeAllVideoSound();

    int removeMusic(int i2);

    int restoreAllVideoSound();

    int setAIRotation(int i2, ROTATE_DEGREE rotate_degree);

    int setMusicAndResult(String str, int i2, int i3, VEAlgorithmPath vEAlgorithmPath);

    int updateAlgorithmFromNormal();
}
