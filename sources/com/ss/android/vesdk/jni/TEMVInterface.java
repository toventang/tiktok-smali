package com.ss.android.vesdk.jni;

import android.text.TextUtils;
import com.bytedance.covode.number.Covode;
import com.bytedance.frameworks.apm.trace.MethodCollector;
import com.ss.android.ttve.model.VEMVAudioAlgorithmResult;
import com.ss.android.vesdk.VESize;
import com.ss.android.vesdk.an;
import java.util.Arrays;

public class TEMVInterface {
    private int mHostTrackIndex = -1;
    private long mNative;

    static {
        Covode.recordClassIndex(99523);
    }

    private native int nativeAddAudioTrackMV(long j2, String str, int i2, int i3, int i4, int i5, int i6, boolean z, float f2);

    private native int nativeAddVideoTrack(long j2, String[] strArr, String[] strArr2, int[] iArr, int[] iArr2, int[] iArr3, int[] iArr4, int[] iArr5, int i2, VESize[] vESizeArr, int i3, int i4, boolean[] zArr, float f2);

    private native Object nativeGetMVOriginalBackgroundAudio(long j2);

    private native Object nativeGetServerAlgorithmConfig(long j2);

    private native Object nativeInitMVResources(long j2, String str, String[] strArr, String[] strArr2, int[] iArr, String str2, int i2, int i3, boolean z, boolean z2, boolean z3, int i4, int i5, int i6, int i7);

    private native int nativeInitVideoEditorMV(long j2, String[] strArr, int[] iArr, int[] iArr2, int[] iArr3, int[] iArr4, String[] strArr2, int[] iArr5, int[] iArr6, int[] iArr7, int[] iArr8, int[] iArr9, String[] strArr3, String[][] strArr4, float[] fArr, int i2, boolean z);

    private native int nativeInitVideoEditorMVLoadCache(long j2, String[] strArr, int[] iArr, int[] iArr2, int[] iArr3, int[] iArr4, String[] strArr2, int[] iArr5, int[] iArr6, int[] iArr7, int[] iArr8, int[] iArr9, String[] strArr3, String[][] strArr4, float[] fArr, int i2, boolean[] zArr, String[] strArr5);

    private native int nativeSetAudioBeatAlgorithmResult(long j2, VEMVAudioAlgorithmResult vEMVAudioAlgorithmResult);

    private native int nativeSetExternalAlgorithmResult(long j2, String str, String str2, String str3, int i2);

    private native int nativeSetMVDataJson(long j2, String str);

    public void clearNative() {
        this.mNative = 0;
    }

    public Object getMVOriginalBackgroundAudio() {
        MethodCollector.i(11270);
        long j2 = this.mNative;
        if (j2 == 0) {
            an.d("TEMVInterface", "getMVOriginalBackgroundAudio error, mNative == 0");
            MethodCollector.o(11270);
            return null;
        }
        Object nativeGetMVOriginalBackgroundAudio = nativeGetMVOriginalBackgroundAudio(j2);
        MethodCollector.o(11270);
        return nativeGetMVOriginalBackgroundAudio;
    }

    public Object getServerAlgorithmConfig() {
        MethodCollector.i(11601);
        long j2 = this.mNative;
        if (j2 == 0) {
            an.d("TEMVInterface", "getServerAlgorithmConfig error, mNative == 0");
            MethodCollector.o(11601);
            return null;
        }
        Object nativeGetServerAlgorithmConfig = nativeGetServerAlgorithmConfig(j2);
        MethodCollector.o(11601);
        return nativeGetServerAlgorithmConfig;
    }

    public TEMVInterface(long j2) {
        this.mNative = j2;
    }

    public int setMVAudioBeatAlgorithmResult(VEMVAudioAlgorithmResult vEMVAudioAlgorithmResult) {
        MethodCollector.i(11117);
        long j2 = this.mNative;
        if (j2 == 0) {
            an.d("TEMVInterface", "setExternalAlgorithmResult error, mNative == 0");
            MethodCollector.o(11117);
            return -112;
        }
        int nativeSetAudioBeatAlgorithmResult = nativeSetAudioBeatAlgorithmResult(j2, vEMVAudioAlgorithmResult);
        MethodCollector.o(11117);
        return nativeSetAudioBeatAlgorithmResult;
    }

    public int setMVDataJson(String str) {
        MethodCollector.i(10957);
        long j2 = this.mNative;
        if (j2 == 0) {
            an.d("TEMVInterface", "setExternalAlgorithmResult error, mNative == 0");
            MethodCollector.o(10957);
            return -112;
        }
        int nativeSetMVDataJson = nativeSetMVDataJson(j2, str);
        MethodCollector.o(10957);
        return nativeSetMVDataJson;
    }

    public int setExternalAlgorithmResult(String str, String str2, String str3, int i2) {
        MethodCollector.i(11424);
        long j2 = this.mNative;
        if (j2 == 0) {
            an.d("TEMVInterface", "setExternalAlgorithmResult error, mNative == 0");
            MethodCollector.o(11424);
            return -112;
        }
        int nativeSetExternalAlgorithmResult = nativeSetExternalAlgorithmResult(j2, str, str2, str3, i2);
        MethodCollector.o(11424);
        return nativeSetExternalAlgorithmResult;
    }

    public int addAudioTrackForMV(String str, int i2, int i3, int i4, int i5, int i6, boolean z, float f2) {
        MethodCollector.i(10786);
        if (this.mNative == 0) {
            MethodCollector.o(10786);
            return -1;
        } else if (TextUtils.isEmpty(str)) {
            MethodCollector.o(10786);
            return -100;
        } else {
            int nativeAddAudioTrackMV = nativeAddAudioTrackMV(this.mNative, str, i2, i3, i4, i5, i6, z, f2);
            MethodCollector.o(10786);
            return nativeAddAudioTrackMV;
        }
    }

    public int addVideoTrackForMV(String[] strArr, String[] strArr2, int[] iArr, int[] iArr2, int[] iArr3, int[] iArr4, int[] iArr5, int i2, VESize[] vESizeArr, int i3, boolean[] zArr, float f2) {
        MethodCollector.i(10783);
        long j2 = this.mNative;
        if (j2 == 0) {
            MethodCollector.o(10783);
            return -1;
        }
        int i4 = this.mHostTrackIndex;
        if (i4 < 0) {
            MethodCollector.o(10783);
            return -105;
        }
        int nativeAddVideoTrack = nativeAddVideoTrack(j2, strArr, strArr2, iArr, iArr2, iArr3, iArr4, iArr5, i2, vESizeArr, i4, i3, zArr, f2);
        MethodCollector.o(10783);
        return nativeAddVideoTrack;
    }

    public Object initMVResources(String str, String[] strArr, String[] strArr2, int[] iArr, String str2, int i2, int i3, boolean z, boolean z2, boolean z3, int i4, int i5, int i6, int i7) {
        MethodCollector.i(10634);
        Object nativeInitMVResources = nativeInitMVResources(this.mNative, str, strArr, strArr2, iArr, str2, i2, i3, z, z2, z3, i4, i5, i6, i7);
        MethodCollector.o(10634);
        return nativeInitMVResources;
    }

    public int initVideoEditor2(String[] strArr, int[] iArr, int[] iArr2, int[] iArr3, int[] iArr4, String[] strArr2, int[] iArr5, int[] iArr6, int[] iArr7, int[] iArr8, int[] iArr9, String[] strArr3, String[][] strArr4, float[] fArr, int i2, boolean z) {
        float[] fArr2 = fArr;
        MethodCollector.i(10001);
        if (this.mNative == 0) {
            MethodCollector.o(10001);
            return -112;
        }
        if (fArr2 == null) {
            fArr2 = new float[strArr.length];
            Arrays.fill(fArr2, 1.0f);
        }
        int nativeInitVideoEditorMV = nativeInitVideoEditorMV(this.mNative, strArr, iArr, iArr2, iArr3, iArr4, strArr2, iArr5, iArr6, iArr7, iArr8, iArr9, strArr3, strArr4, fArr2, i2, z);
        if (nativeInitVideoEditorMV < 0) {
            MethodCollector.o(10001);
            return nativeInitVideoEditorMV;
        }
        this.mHostTrackIndex = nativeInitVideoEditorMV;
        MethodCollector.o(10001);
        return 0;
    }

    public int initVideoEditor2(String[] strArr, int[] iArr, int[] iArr2, int[] iArr3, int[] iArr4, String[] strArr2, int[] iArr5, int[] iArr6, int[] iArr7, int[] iArr8, int[] iArr9, String[] strArr3, String[][] strArr4, float[] fArr, int i2, boolean[] zArr, String[] strArr5) {
        float[] fArr2 = fArr;
        MethodCollector.i(10473);
        if (this.mNative == 0) {
            MethodCollector.o(10473);
            return -112;
        }
        if (fArr2 == null) {
            fArr2 = new float[strArr.length];
            Arrays.fill(fArr2, 1.0f);
        }
        int nativeInitVideoEditorMVLoadCache = nativeInitVideoEditorMVLoadCache(this.mNative, strArr, iArr, iArr2, iArr3, iArr4, strArr2, iArr5, iArr6, iArr7, iArr8, iArr9, strArr3, strArr4, fArr2, i2, zArr, strArr5);
        if (nativeInitVideoEditorMVLoadCache < 0) {
            MethodCollector.o(10473);
            return nativeInitVideoEditorMVLoadCache;
        }
        this.mHostTrackIndex = nativeInitVideoEditorMVLoadCache;
        MethodCollector.o(10473);
        return 0;
    }
}
