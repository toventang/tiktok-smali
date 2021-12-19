package com.ss.android.vesdk.f;

import com.bytedance.covode.number.Covode;
import com.ss.android.vesdk.VEListener;
import com.ss.android.vesdk.VEMVAlgorithmConfig;
import com.ss.android.vesdk.VEMVAudioInfo;
import com.ss.android.vesdk.VEMVParams;
import com.ss.android.vesdk.clipparam.VEClipSourceParam;
import com.ss.android.vesdk.clipparam.VEClipTimelineParam;

public interface d {
    static {
        Covode.recordClassIndex(99436);
    }

    void addMVFilterInternal(int i2);

    int changeMvUserVideoInfoInternal(int i2, int[] iArr, VEClipTimelineParam[] vEClipTimelineParamArr, VEClipSourceParam[] vEClipSourceParamArr);

    void clearNativeFromMV();

    int getMVBackgroundAudioTrackIndex();

    VEMVAudioInfo getMVOriginalBackgroundAudio();

    int initMV(VEMVParams vEMVParams);

    int initMV(String str, String[] strArr, String[] strArr2, String str2, int i2, int i3);

    boolean isMVInitialedInternal();

    int setExternalAlgorithmResult(String str, String str2, String str3, VEMVAlgorithmConfig.MV_REESULT_IN_TYPE mv_reesult_in_type);

    void setListenerForMV(VEListener.aa aaVar);

    int setMvOriginalAudio(boolean z, float f2);

    int updateMVBackgroundAudioTrack(String str, int i2, int i3);

    int updateMVResources(VEMVParams vEMVParams);

    int updateMVResources(String str, String[] strArr, String[] strArr2);
}
