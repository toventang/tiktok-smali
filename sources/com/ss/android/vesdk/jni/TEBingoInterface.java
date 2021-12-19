package com.ss.android.vesdk.jni;

import com.bytedance.covode.number.Covode;
import com.bytedance.frameworks.apm.trace.MethodCollector;
import com.ss.android.ttve.nativePort.NativeCallbacks;
import com.ss.android.ttve.nativePort.TEInterface;
import com.ss.android.ttve.nativePort.TENativeServiceBase;
import com.ss.android.vesdk.VEListener;
import com.ss.android.vesdk.clipparam.VEClipAlgorithmParam;
import java.nio.ByteBuffer;
import java.util.List;

public class TEBingoInterface extends TENativeServiceBase {
    private int mHostTrackIndex = -1;
    private long mNative;
    private TEInterface mNativeEditor;

    static {
        Covode.recordClassIndex(99521);
    }

    private native int nativeAddVidoeClipWithAlgorithm(long j2, String[] strArr);

    private native int nativeCancelExtractVideoFrames(long j2, int i2);

    private native int nativeCheckScoresFile(long j2, String str);

    private native int nativeDeleteVideoClipWithAlgorithm(long j2, int i2);

    private native int nativeExtractVideoFrames(long j2, int i2, int i3, int i4, int i5, int i6);

    private native int nativeGenAISolve(long j2);

    private native int nativeGenRandomSolve(long j2);

    private native List<VEClipAlgorithmParam> nativeGetAllVideoRangeData(long j2);

    private native String nativeGetClipPath(long j2, int i2);

    private native int nativeInitBingoAlgorithm(long j2);

    private native int nativeInitVideoEditorWithAlgorithm(long j2, String[] strArr, int i2);

    private native int nativeInitVideoEditorWithAlgorithmLoadCache(long j2, String[] strArr, int i2, boolean[] zArr, String[] strArr2);

    private native int nativeMoveVideoClipWithAlgorithm(long j2, int i2, int i3);

    private native int nativeProcessBingoFrames(long j2, ByteBuffer byteBuffer, ByteBuffer byteBuffer2, int i2, int i3, float f2, String str);

    private native int nativeRemoveAllVideoSound(long j2);

    private native int nativeRemoveMusic(long j2, int i2);

    private native int nativeRestoreAllVideoSound(long j2);

    private native int nativeSetAIRotation(long j2, int i2, int i3);

    private native int nativeSetInterimScoresToFile(long j2, String str);

    private native int nativeSetMusicAndResult(long j2, int i2, int i3, String str, String str2, String str3, String str4, String str5, String str6, int i4, int i5);

    private native int nativeSetMusicAndResultLoadCache(long j2, int i2, int i3, String str, String str2, String str3, String str4, String str5, String str6, int i4, int i5, boolean[] zArr, String[] strArr);

    private native int nativeSetMusicCropRatio(long j2, int i2);

    private native int nativeUpdateAlgorithmFromNormal(long j2);

    public void clearNative() {
        this.mNative = 0;
    }

    public int genAISolve() {
        MethodCollector.i(9659);
        long j2 = this.mNative;
        if (j2 == 0) {
            MethodCollector.o(9659);
            return -112;
        }
        int nativeGenAISolve = nativeGenAISolve(j2);
        MethodCollector.o(9659);
        return nativeGenAISolve;
    }

    public List<VEClipAlgorithmParam> getAllVideoRangeData() {
        MethodCollector.i(9830);
        long j2 = this.mNative;
        if (j2 == 0) {
            MethodCollector.o(9830);
            return null;
        }
        List<VEClipAlgorithmParam> nativeGetAllVideoRangeData = nativeGetAllVideoRangeData(j2);
        MethodCollector.o(9830);
        return nativeGetAllVideoRangeData;
    }

    public int getRandomSolve() {
        MethodCollector.i(9829);
        long j2 = this.mNative;
        if (j2 == 0) {
            MethodCollector.o(9829);
            return -112;
        }
        int nativeGenRandomSolve = nativeGenRandomSolve(j2);
        MethodCollector.o(9829);
        return nativeGenRandomSolve;
    }

    public int initBingoAlgorithm() {
        MethodCollector.i(8740);
        long j2 = this.mNative;
        if (j2 == 0) {
            MethodCollector.o(8740);
            return -112;
        }
        int nativeInitBingoAlgorithm = nativeInitBingoAlgorithm(j2);
        MethodCollector.o(8740);
        return nativeInitBingoAlgorithm;
    }

    public int removeAllVideoSound() {
        MethodCollector.i(9511);
        long j2 = this.mNative;
        if (j2 == 0) {
            MethodCollector.o(9511);
            return -112;
        }
        int nativeRemoveAllVideoSound = nativeRemoveAllVideoSound(j2);
        MethodCollector.o(9511);
        return nativeRemoveAllVideoSound;
    }

    public int restoreAllVideoSound() {
        MethodCollector.i(9658);
        long j2 = this.mNative;
        if (j2 == 0) {
            MethodCollector.o(9658);
            return -112;
        }
        int nativeRestoreAllVideoSound = nativeRestoreAllVideoSound(j2);
        MethodCollector.o(9658);
        return nativeRestoreAllVideoSound;
    }

    public int updateAlgorithmFromNormal() {
        MethodCollector.i(9831);
        long j2 = this.mNative;
        if (j2 == 0) {
            MethodCollector.o(9831);
            return -112;
        }
        int nativeUpdateAlgorithmFromNormal = nativeUpdateAlgorithmFromNormal(j2);
        MethodCollector.o(9831);
        return nativeUpdateAlgorithmFromNormal;
    }

    public TEBingoInterface(TEInterface tEInterface) {
        this.mNativeEditor = tEInterface;
        this.mNative = tEInterface.getNativeHandler();
    }

    public int addVidoeClipWithAlgorithm(String[] strArr) {
        MethodCollector.i(8942);
        long j2 = this.mNative;
        if (j2 == 0) {
            MethodCollector.o(8942);
            return -112;
        }
        int nativeAddVidoeClipWithAlgorithm = nativeAddVidoeClipWithAlgorithm(j2, strArr);
        MethodCollector.o(8942);
        return nativeAddVidoeClipWithAlgorithm;
    }

    public int cancelExtractVideoFrames(int i2) {
        MethodCollector.i(10000);
        long j2 = this.mNative;
        if (j2 == 0) {
            MethodCollector.o(10000);
            return -112;
        }
        int nativeCancelExtractVideoFrames = nativeCancelExtractVideoFrames(j2, i2);
        MethodCollector.o(10000);
        return nativeCancelExtractVideoFrames;
    }

    public int checkScoresFile(String str) {
        MethodCollector.i(9998);
        long j2 = this.mNative;
        if (j2 == 0) {
            MethodCollector.o(9998);
            return -112;
        }
        int nativeCheckScoresFile = nativeCheckScoresFile(j2, str);
        MethodCollector.o(9998);
        return nativeCheckScoresFile;
    }

    public int deleteVideoClipWithAlgorithm(int i2) {
        MethodCollector.i(9141);
        long j2 = this.mNative;
        if (j2 == 0) {
            MethodCollector.o(9141);
            return -112;
        }
        int nativeDeleteVideoClipWithAlgorithm = nativeDeleteVideoClipWithAlgorithm(j2, i2);
        MethodCollector.o(9141);
        return nativeDeleteVideoClipWithAlgorithm;
    }

    public String getClipPath(int i2) {
        MethodCollector.i(9999);
        long j2 = this.mNative;
        if (j2 == 0) {
            MethodCollector.o(9999);
            return "";
        }
        String nativeGetClipPath = nativeGetClipPath(j2, i2);
        MethodCollector.o(9999);
        return nativeGetClipPath;
    }

    public int removeMusic(int i2) {
        MethodCollector.i(9341);
        long j2 = this.mNative;
        if (j2 == 0) {
            MethodCollector.o(9341);
            return -112;
        }
        int nativeRemoveMusic = nativeRemoveMusic(j2, i2);
        MethodCollector.o(9341);
        return nativeRemoveMusic;
    }

    public int setInterimScoresToFile(String str) {
        MethodCollector.i(9997);
        long j2 = this.mNative;
        if (j2 == 0) {
            MethodCollector.o(9997);
            return -112;
        }
        int nativeSetInterimScoresToFile = nativeSetInterimScoresToFile(j2, str);
        MethodCollector.o(9997);
        return nativeSetInterimScoresToFile;
    }

    public int setMusicCropRatio(int i2) {
        MethodCollector.i(9833);
        long j2 = this.mNative;
        if (j2 == 0) {
            MethodCollector.o(9833);
            return -112;
        }
        int nativeSetMusicCropRatio = nativeSetMusicCropRatio(j2, i2);
        MethodCollector.o(9833);
        return nativeSetMusicCropRatio;
    }

    public int moveVideoClipWithAlgorithm(int i2, int i3) {
        MethodCollector.i(9142);
        long j2 = this.mNative;
        if (j2 == 0) {
            MethodCollector.o(9142);
            return -112;
        }
        int nativeMoveVideoClipWithAlgorithm = nativeMoveVideoClipWithAlgorithm(j2, i2, i3);
        MethodCollector.o(9142);
        return nativeMoveVideoClipWithAlgorithm;
    }

    public int setAIRotation(int i2, int i3) {
        MethodCollector.i(9832);
        long j2 = this.mNative;
        if (j2 == 0) {
            MethodCollector.o(9832);
            return -112;
        }
        int nativeSetAIRotation = nativeSetAIRotation(j2, i2, i3);
        MethodCollector.o(9832);
        return nativeSetAIRotation;
    }

    public int initVideoEditorWithAlgorithm(String[] strArr, int i2) {
        MethodCollector.i(8939);
        long j2 = this.mNative;
        if (j2 == 0) {
            MethodCollector.o(8939);
            return -112;
        }
        int nativeInitVideoEditorWithAlgorithm = nativeInitVideoEditorWithAlgorithm(j2, strArr, i2);
        if (nativeInitVideoEditorWithAlgorithm < 0) {
            MethodCollector.o(8939);
            return nativeInitVideoEditorWithAlgorithm;
        }
        this.mHostTrackIndex = nativeInitVideoEditorWithAlgorithm;
        MethodCollector.o(8939);
        return 0;
    }

    public int initVideoEditorWithAlgorithm(String[] strArr, int i2, boolean[] zArr, String[] strArr2) {
        MethodCollector.i(8940);
        long j2 = this.mNative;
        if (j2 == 0) {
            MethodCollector.o(8940);
            return -112;
        }
        int nativeInitVideoEditorWithAlgorithmLoadCache = nativeInitVideoEditorWithAlgorithmLoadCache(j2, strArr, i2, zArr, strArr2);
        if (nativeInitVideoEditorWithAlgorithmLoadCache < 0) {
            MethodCollector.o(8940);
            return nativeInitVideoEditorWithAlgorithmLoadCache;
        }
        this.mHostTrackIndex = nativeInitVideoEditorWithAlgorithmLoadCache;
        MethodCollector.o(8940);
        return 0;
    }

    public int extractVideoFrames(int i2, int i3, int i4, int i5, int i6, final VEListener.i iVar) {
        MethodCollector.i(10157);
        if (this.mNative == 0) {
            MethodCollector.o(10157);
            return -112;
        }
        this.mNativeEditor.setExtractFrameProcessCallback(new NativeCallbacks.b() {
            /* class com.ss.android.vesdk.jni.TEBingoInterface.AnonymousClass1 */

            static {
                Covode.recordClassIndex(99522);
            }

            @Override // com.ss.android.ttve.nativePort.NativeCallbacks.b
            public final void a(float f2) {
                VEListener.i iVar = iVar;
                if (iVar != null) {
                    iVar.a(f2);
                }
            }
        });
        int nativeExtractVideoFrames = nativeExtractVideoFrames(this.mNative, i2, i3, i4, i5, i6);
        MethodCollector.o(10157);
        return nativeExtractVideoFrames;
    }

    public int processBingoFrames(ByteBuffer byteBuffer, ByteBuffer byteBuffer2, int i2, int i3, float f2, String str) {
        MethodCollector.i(10326);
        long j2 = this.mNative;
        if (j2 == 0) {
            MethodCollector.o(10326);
            return -112;
        }
        int nativeProcessBingoFrames = nativeProcessBingoFrames(j2, byteBuffer, byteBuffer2, i2, i3, f2, str);
        MethodCollector.o(10326);
        return nativeProcessBingoFrames;
    }

    public int setMusicAndResult(String str, int i2, int i3, String str2, String str3, String str4, String str5, String str6, int i4, int i5) {
        MethodCollector.i(9339);
        long j2 = this.mNative;
        if (j2 == 0) {
            MethodCollector.o(9339);
            return -112;
        }
        int nativeSetMusicAndResult = nativeSetMusicAndResult(j2, i2, i3, str, str2, str3, str4, str5, str6, i4, i5);
        MethodCollector.o(9339);
        return nativeSetMusicAndResult;
    }

    public int setMusicAndResultLoadCache(String str, int i2, int i3, String str2, String str3, String str4, String str5, String str6, int i4, int i5, boolean[] zArr, String[] strArr) {
        MethodCollector.i(9340);
        long j2 = this.mNative;
        if (j2 == 0) {
            MethodCollector.o(9340);
            return -112;
        }
        int nativeSetMusicAndResultLoadCache = nativeSetMusicAndResultLoadCache(j2, i2, i3, str, str2, str3, str4, str5, str6, i4, i5, zArr, strArr);
        MethodCollector.o(9340);
        return nativeSetMusicAndResultLoadCache;
    }
}
