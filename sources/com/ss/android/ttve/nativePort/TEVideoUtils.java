package com.ss.android.ttve.nativePort;

import android.graphics.Bitmap;
import android.text.TextUtils;
import com.bytedance.covode.number.Covode;
import com.bytedance.frameworks.apm.trace.MethodCollector;
import com.ss.android.ttve.model.VEMusicWaveBean;
import com.ss.android.vesdk.an;
import com.ss.android.vesdk.z;
import java.io.File;
import java.nio.ByteBuffer;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

public final class TEVideoUtils {
    private static long getFrameInterval = 1000;

    public interface CompileProbeListener {
        static {
            Covode.recordClassIndex(37734);
        }

        void onCompileProbeResult(int i2, int i3, float f2, int i4, int i5, int i6, int i7, float f3);
    }

    public interface CompileProbeListener2 {
        static {
            Covode.recordClassIndex(37735);
        }

        void onCompileProbeResult2(int i2, int i3, float f2, float f3, int i4, int i5, int i6, int i7, float f4);
    }

    public interface ExecuteCommandAndDumpInfoListener {
        static {
            Covode.recordClassIndex(37736);
        }

        void updateFFmpegInfo(String str);
    }

    public interface ExecuteCommandListener {
        static {
            Covode.recordClassIndex(37737);
        }

        void onProgressChanged(int i2);
    }

    public static native void nativeCancelCompileProbe();

    private static native int nativeCheckAudioFile(String str);

    private static native int nativeCheckMVResourceIntegrity(String str);

    private static native int nativeCheckMp3File(String str);

    private static native int nativeClearWavSeg(String str, int i2, int i3);

    public static native int nativeCompileProbe(String str, String str2, int i2, int i3, long j2, long j3, int i4, int i5, int i6, long j4, double d2, CompileProbeListener compileProbeListener, CompileProbeListener2 compileProbeListener2, int i7);

    private static native int nativeConcat(String[] strArr, String str, int i2);

    public static native int nativeConcatRecordFrag(String[] strArr, long[] jArr, String[] strArr2, long[] jArr2, boolean z, int i2, String str, String str2, String str3, String str4);

    public static native int nativeConverBitmapToRGBA(Bitmap bitmap, String str);

    public static native int nativeConverRGBAToIMG(String str, String str2, int i2, int i3);

    public static native int nativeConvertJpegToMp4(String str, String str2, int i2, boolean z);

    public static native long nativeCreateCurveSpeedUtils(float[] fArr, float[] fArr2);

    private static native long nativeCreateGetFrameHandler(String str);

    private static native long nativeCreateRTAudioWaveformMgr(int i2, int i3, float f2, int i4);

    public static native void nativeCurveSpeedDestroy(long j2);

    private static native int nativeDeleteRTAudioWaveformMgr(long j2);

    public static native int nativeDetachAudioFromVideos(String str, String[] strArr, long[] jArr, long[] jArr2, long j2, long j3, float[] fArr, int i2, int i3, int i4, int i5);

    private static native int nativeExecuteFFmpegCommand(String str, ExecuteCommandListener executeCommandListener);

    private static native int nativeExecuteFFmpegCommandAndDumpInfo(String str, ExecuteCommandListener executeCommandListener, ExecuteCommandAndDumpInfoListener executeCommandAndDumpInfoListener);

    private static native int nativeExtractVideo(String str, String str2);

    public static native int nativeFindAudioSegmentStartTimeInOrigin(String str, int i2, String str2, int i3, int i4);

    private static native String nativeFindBestRemuxSuffix(String str);

    private static native int nativeGenerateMuteWav(String str, int i2, int i3, int i4);

    private static native int nativeGetAVFileInfoFromXml(String str, int[] iArr);

    private static native Object nativeGetAudioAlgorithmResult(String str, String str2, int i2, int i3);

    private static native int nativeGetAudioFileInfo(String str, int[] iArr);

    private static native int nativeGetAudioFileInfoForAllTracks(String str, int[][] iArr);

    private static native double nativeGetAudioVolume(byte[] bArr, int i2, int i3, int i4);

    private static native VEMusicWaveBean nativeGetAudioWaveData(String str, int i2, int i3, int i4, int i5, int i6);

    public static native double nativeGetAveCurveSpeed(long j2);

    public static native double nativeGetCurveSpeedWithSeqDelta(long j2, long j3);

    private static native void nativeGetDstBitmapSize(long j2, int i2, int i3, int[] iArr);

    private static native int nativeGetFileAudio(String str, String str2, ArrayList<String> arrayList, boolean z);

    private static native Object nativeGetFileInfo(String str, int[] iArr);

    private static native int nativeGetFileType(String str);

    private static native int nativeGetFrameWithHandler(long j2, Bitmap bitmap, int i2, int i3, int i4, boolean z);

    private static native String nativeGetInfostickerConvertTotemplate(String str);

    private static native Object nativeGetMVAlgorithmConfigs(String str, String[] strArr, int i2);

    private static native int nativeGetMetaData(String str, ArrayList<String> arrayList);

    private static native int nativeGetMusicDefaultAlgorithm(String str, String str2);

    private static native VEMusicWaveBean nativeGetResampleMusicWaveData(float[] fArr, int i2, int i3);

    private static native Object nativeGetVEFileInfo(String str);

    private static native int nativeGetVideoFrame(String str, int[] iArr, int i2, int i3, boolean z, Object obj, int i4);

    private static native int nativeGetVideoFrame2(String str, int[] iArr, int i2, int i3, boolean z, Object obj);

    private static native int nativeGetVideoFrame3(String str, int[] iArr, int i2, int i3, boolean z, Object obj);

    private static native int nativeGetVideoFrameData(String str, int i2, int i3, int i4, int i5, int i6, Object obj);

    private static native int nativeGetVideoFrameMore(String str, int[] iArr, int i2, int i3, boolean z, boolean z2, int i4, boolean z3, Object obj);

    private static native int nativeGetVideoThumb(String str, int i2, Object obj, boolean z, int i3, int i4, long j2, int i5);

    private static native long nativeInitResampleContext(int i2, int i3, int i4, int i5);

    private static native int nativeIsByteVC110Bit(byte[] bArr);

    private static native int nativeIsCanImport(String str);

    private static native int nativeIsCanImportFd(int i2, long j2, long j3);

    private static native int nativeIsCanTransCode(String str, int i2, int i3);

    private static native int nativeIsCanTransCodeWithResult(String str, int i2, int i3, String[] strArr);

    private static native boolean nativeIsFrameCanDrop(ByteBuffer byteBuffer, int i2, boolean z);

    private static native boolean nativeIsSupportGLES3();

    private static native long nativeLoadModel(int i2, String str);

    public static native long nativeMapSeqDeltaToTrimDelta(long j2, long j3);

    public static native long nativeMapTrimDeltaToSeqDelta(long j2, long j3);

    private static native int nativeMixAudio(ArrayList<String> arrayList, String str, Object obj);

    private static native int nativeMux(String str, String str2, String str3);

    private static native int nativePcmResampleFilter(long j2, byte[] bArr, byte[] bArr2, int i2, int i3);

    private static native int nativeProcessAudioTuning(String[] strArr, int[] iArr, int[] iArr2, float f2, float f3, String str, String str2);

    private static native int nativeRTAudioWaveformFinish(long j2);

    private static native int nativeRTAudioWaveformGetPoints(long j2, float[] fArr, int i2, int i3);

    private static native int nativeRTAudioWaveformProcess(long j2, float[][] fArr, int i2, int i3);

    private static native int nativeRTAudioWaveformReset(long j2);

    private static native void nativeReleaseGetFrameHandler(long j2);

    private static native int nativeReleaseGetFramesReader();

    private static native void nativeReleaseResampleContext(long j2);

    private static native void nativeResetModel(long j2);

    private static native int nativeReverseAllIFrameVideoAndMuxAudio(String str, String str2, String str3);

    private static native int nativeReverseAllIFrameVideoAndMuxAudio2(String str, String str2, String str3, TEReverseCallback tEReverseCallback);

    private static native int nativeReverseAllIVideo(String str, String str2);

    private static native int nativeReverseAllIVideo2(String str, String str2, TEReverseCallback tEReverseCallback);

    private static native int nativeSaveVideoFrames(String str, int[] iArr, int i2, int i3, boolean z, String str2, int i4, int i5);

    public static native int nativeSetCurveSpeedData(long j2, float[] fArr, float[] fArr2);

    public static native void nativeSetSeqDuration(long j2, long j3);

    private static native int nativeSplitVideo(String str, String[] strArr, int[] iArr, boolean z);

    private static native int nativeTransCodecAudioFile(String str, int i2, int i3, String str2, int i4, int i5, int i6);

    private static native int nativeTrimFile(String str, String str2, int[] iArr, int[] iArr2);

    private static native double nativeVoiceActivityDetection(byte[] bArr, long j2, int i2, int i3);

    public enum a {
        YUV(0),
        Y(1),
        U(2),
        V(3);
        
        private final int value;

        public final int getValue() {
            return this.value;
        }

        static {
            Covode.recordClassIndex(37738);
        }

        private a(int i2) {
            this.value = i2;
        }
    }

    static {
        Covode.recordClassIndex(37733);
        d.a();
    }

    public static boolean isSupportGLES3() {
        MethodCollector.i(3121);
        boolean nativeIsSupportGLES3 = nativeIsSupportGLES3();
        MethodCollector.o(3121);
        return nativeIsSupportGLES3;
    }

    public static int releaseGetFramesReader() {
        MethodCollector.i(3201);
        int nativeReleaseGetFramesReader = nativeReleaseGetFramesReader();
        MethodCollector.o(3201);
        return nativeReleaseGetFramesReader;
    }

    public static int checkAudioFile(String str) {
        MethodCollector.i(2490);
        int nativeCheckAudioFile = nativeCheckAudioFile(str);
        MethodCollector.o(2490);
        return nativeCheckAudioFile;
    }

    public static int checkMVResourceIntegrity(String str) {
        MethodCollector.i(785);
        int nativeCheckMVResourceIntegrity = nativeCheckMVResourceIntegrity(str);
        MethodCollector.o(785);
        return nativeCheckMVResourceIntegrity;
    }

    public static int checkMp3File(String str) {
        MethodCollector.i(2489);
        int nativeCheckMp3File = nativeCheckMp3File(str);
        MethodCollector.o(2489);
        return nativeCheckMp3File;
    }

    public static long createGetFrameHandler(String str) {
        MethodCollector.i(3348);
        long nativeCreateGetFrameHandler = nativeCreateGetFrameHandler(str);
        MethodCollector.o(3348);
        return nativeCreateGetFrameHandler;
    }

    public static int deleteRTAudioWaveformMgr(long j2) {
        MethodCollector.i(2533);
        int nativeDeleteRTAudioWaveformMgr = nativeDeleteRTAudioWaveformMgr(j2);
        MethodCollector.o(2533);
        return nativeDeleteRTAudioWaveformMgr;
    }

    public static int getFileType(String str) {
        MethodCollector.i(3223);
        int nativeGetFileType = nativeGetFileType(str);
        MethodCollector.o(3223);
        return nativeGetFileType;
    }

    public static String getInfostickerConvertTotemplate(String str) {
        MethodCollector.i(418);
        String nativeGetInfostickerConvertTotemplate = nativeGetInfostickerConvertTotemplate(str);
        MethodCollector.o(418);
        return nativeGetInfostickerConvertTotemplate;
    }

    public static Object getVEVideoFileInfo(String str) {
        MethodCollector.i(2478);
        Object nativeGetVEFileInfo = nativeGetVEFileInfo(str);
        MethodCollector.o(2478);
        return nativeGetVEFileInfo;
    }

    public static int isByteVC110Bit(byte[] bArr) {
        MethodCollector.i(3132);
        int nativeIsByteVC110Bit = nativeIsByteVC110Bit(bArr);
        MethodCollector.o(3132);
        return nativeIsByteVC110Bit;
    }

    public static void releaseGetFrameHandler(long j2) {
        MethodCollector.i(3397);
        nativeReleaseGetFrameHandler(j2);
        MethodCollector.o(3397);
    }

    public static void releaseResampleContext(long j2) {
        MethodCollector.i(328);
        nativeReleaseResampleContext(j2);
        MethodCollector.o(328);
    }

    public static void resetModel(long j2) {
        MethodCollector.i(2509);
        nativeResetModel(j2);
        MethodCollector.o(2509);
    }

    public static int rtAudioWaveformFinish(long j2) {
        MethodCollector.i(3116);
        int nativeRTAudioWaveformFinish = nativeRTAudioWaveformFinish(j2);
        MethodCollector.o(3116);
        return nativeRTAudioWaveformFinish;
    }

    public static int rtAudioWaveformReset(long j2) {
        MethodCollector.i(3113);
        int nativeRTAudioWaveformReset = nativeRTAudioWaveformReset(j2);
        MethodCollector.o(3113);
        return nativeRTAudioWaveformReset;
    }

    public static int isCanImport(String str) {
        MethodCollector.i(3128);
        if (TextUtils.isEmpty(str)) {
            MethodCollector.o(3128);
            return -100;
        }
        int nativeIsCanImport = nativeIsCanImport(str);
        MethodCollector.o(3128);
        return nativeIsCanImport;
    }

    public static String findBestRemuxSuffix(String str) {
        MethodCollector.i(3163);
        if (str.length() > 0) {
            String nativeFindBestRemuxSuffix = nativeFindBestRemuxSuffix(str);
            if (nativeFindBestRemuxSuffix.length() > 0) {
                MethodCollector.o(3163);
                return nativeFindBestRemuxSuffix;
            }
            z zVar = new z(-205, "This file does not support re-packaging for the time being!");
            MethodCollector.o(3163);
            throw zVar;
        }
        z zVar2 = new z(-100, "Please check the input parameters!");
        MethodCollector.o(3163);
        throw zVar2;
    }

    /* JADX DEBUG: Multi-variable search result rejected for r3v0, resolved type: java.util.HashMap<java.lang.String, java.lang.String> */
    /* JADX WARN: Multi-variable type inference failed */
    public static HashMap<String, String> getMetaData(String str) {
        MethodCollector.i(1082);
        ArrayList arrayList = new ArrayList();
        if (nativeGetMetaData(str, arrayList) != 0) {
            an.d("TEVideoUtils", "failed to get MetaData");
            MethodCollector.o(1082);
            return null;
        }
        HashMap<String, String> hashMap = new HashMap<>();
        for (int i2 = 0; i2 < arrayList.size() / 2; i2++) {
            int i3 = i2 * 2;
            hashMap.put(arrayList.get(i3), arrayList.get(i3 + 1));
        }
        MethodCollector.o(1082);
        return hashMap;
    }

    public static int ConverBitmapToRGBA(Bitmap bitmap, String str) {
        MethodCollector.i(408);
        int nativeConverBitmapToRGBA = nativeConverBitmapToRGBA(bitmap, str);
        MethodCollector.o(408);
        return nativeConverBitmapToRGBA;
    }

    public static int concat(String[] strArr, String str) {
        MethodCollector.i(2449);
        int nativeConcat = nativeConcat(strArr, str, 0);
        MethodCollector.o(2449);
        return nativeConcat;
    }

    public static long createCurveSpeedUtils(float[] fArr, float[] fArr2) {
        MethodCollector.i(2520);
        long nativeCreateCurveSpeedUtils = nativeCreateCurveSpeedUtils(fArr, fArr2);
        MethodCollector.o(2520);
        return nativeCreateCurveSpeedUtils;
    }

    public static int executeFFmpegCommand(String str, ExecuteCommandListener executeCommandListener) {
        MethodCollector.i(311);
        int nativeExecuteFFmpegCommand = nativeExecuteFFmpegCommand(str, executeCommandListener);
        MethodCollector.o(311);
        return nativeExecuteFFmpegCommand;
    }

    public static int extractVideo(String str, String str2) {
        MethodCollector.i(3174);
        int nativeExtractVideo = nativeExtractVideo(str, str2);
        MethodCollector.o(3174);
        return nativeExtractVideo;
    }

    public static int getAVFileInfoFromXml(String str, int[] iArr) {
        MethodCollector.i(2487);
        int nativeGetAVFileInfoFromXml = nativeGetAVFileInfoFromXml(str, iArr);
        MethodCollector.o(2487);
        return nativeGetAVFileInfoFromXml;
    }

    public static int getAudioFileInfo(String str, int[] iArr) {
        MethodCollector.i(2488);
        int nativeGetAudioFileInfo = nativeGetAudioFileInfo(str, iArr);
        MethodCollector.o(2488);
        return nativeGetAudioFileInfo;
    }

    public static int getAudioFileInfoForAllTracks(String str, int[][] iArr) {
        MethodCollector.i(2510);
        int nativeGetAudioFileInfoForAllTracks = nativeGetAudioFileInfoForAllTracks(str, iArr);
        MethodCollector.o(2510);
        return nativeGetAudioFileInfoForAllTracks;
    }

    public static int getMusicDefaultAlgorithm(String str, String str2) {
        MethodCollector.i(379);
        int nativeGetMusicDefaultAlgorithm = nativeGetMusicDefaultAlgorithm(str, str2);
        MethodCollector.o(379);
        return nativeGetMusicDefaultAlgorithm;
    }

    public static Object getVideoFileInfo(String str, int[] iArr) {
        MethodCollector.i(2482);
        Object nativeGetFileInfo = nativeGetFileInfo(str, iArr);
        MethodCollector.o(2482);
        return nativeGetFileInfo;
    }

    public static long loadModel(int i2, String str) {
        MethodCollector.i(2497);
        long nativeLoadModel = nativeLoadModel(i2, str);
        MethodCollector.o(2497);
        return nativeLoadModel;
    }

    public static int reverseAllIVideo(String str, String str2) {
        MethodCollector.i(330);
        int nativeReverseAllIVideo = nativeReverseAllIVideo(str, str2);
        MethodCollector.o(330);
        return nativeReverseAllIVideo;
    }

    public static Object getMVAlgorithmConfigs(String str, List<String> list) {
        MethodCollector.i(446);
        int size = list.size();
        String[] strArr = new String[size];
        list.toArray(strArr);
        Object nativeGetMVAlgorithmConfigs = nativeGetMVAlgorithmConfigs(str, strArr, size);
        MethodCollector.o(446);
        return nativeGetMVAlgorithmConfigs;
    }

    public static int clearWavSeg(String str, int i2, int i3) {
        MethodCollector.i(3185);
        int nativeClearWavSeg = nativeClearWavSeg(str, i2, i3);
        MethodCollector.o(3185);
        return nativeClearWavSeg;
    }

    public static int executeFFmpegCommandAndDumpInfo(String str, ExecuteCommandListener executeCommandListener, ExecuteCommandAndDumpInfoListener executeCommandAndDumpInfoListener) {
        MethodCollector.i(317);
        int nativeExecuteFFmpegCommandAndDumpInfo = nativeExecuteFFmpegCommandAndDumpInfo(str, executeCommandListener, executeCommandAndDumpInfoListener);
        MethodCollector.o(317);
        return nativeExecuteFFmpegCommandAndDumpInfo;
    }

    public static VEMusicWaveBean getResampleMusicWaveData(float[] fArr, int i2, int i3) {
        MethodCollector.i(2516);
        VEMusicWaveBean nativeGetResampleMusicWaveData = nativeGetResampleMusicWaveData(fArr, i2, i3);
        MethodCollector.o(2516);
        return nativeGetResampleMusicWaveData;
    }

    public static int isCanTransCode(String str, int i2, int i3) {
        MethodCollector.i(319);
        int nativeIsCanTransCode = nativeIsCanTransCode(str, i2, i3);
        MethodCollector.o(319);
        return nativeIsCanTransCode;
    }

    public static boolean isFrameCanDrop(ByteBuffer byteBuffer, int i2, boolean z) {
        MethodCollector.i(3157);
        boolean nativeIsFrameCanDrop = nativeIsFrameCanDrop(byteBuffer, i2, z);
        MethodCollector.o(3157);
        return nativeIsFrameCanDrop;
    }

    public static int mixAudio(ArrayList<String> arrayList, String str, Object obj) {
        MethodCollector.i(3176);
        int nativeMixAudio = nativeMixAudio(arrayList, str, obj);
        MethodCollector.o(3176);
        return nativeMixAudio;
    }

    public static int mux(String str, String str2, String str3) {
        MethodCollector.i(2471);
        int nativeMux = nativeMux(str, str2, str3);
        MethodCollector.o(2471);
        return nativeMux;
    }

    public static int reverseAllIVideoAndMuxAudio(String str, String str2, String str3) {
        MethodCollector.i(335);
        int nativeReverseAllIFrameVideoAndMuxAudio = nativeReverseAllIFrameVideoAndMuxAudio(str, str2, str3);
        MethodCollector.o(335);
        return nativeReverseAllIFrameVideoAndMuxAudio;
    }

    public static int concat(String[] strArr, String str, int i2) {
        MethodCollector.i(2448);
        int nativeConcat = nativeConcat(strArr, str, i2);
        MethodCollector.o(2448);
        return nativeConcat;
    }

    public static int isCanImportFd(int i2, long j2, long j3) {
        MethodCollector.i(3140);
        if (i2 <= 0) {
            MethodCollector.o(3140);
            return -100;
        }
        int nativeIsCanImportFd = nativeIsCanImportFd(i2, j2, j3);
        MethodCollector.o(3140);
        return nativeIsCanImportFd;
    }

    public static int reverseAllIVideo(String str, String str2, TEReverseCallback tEReverseCallback) {
        MethodCollector.i(336);
        int nativeReverseAllIVideo2 = nativeReverseAllIVideo2(str, str2, tEReverseCallback);
        MethodCollector.o(336);
        return nativeReverseAllIVideo2;
    }

    public static int ConverRGBAToIMG(String str, String str2, int i2, int i3) {
        MethodCollector.i(405);
        int nativeConverRGBAToIMG = nativeConverRGBAToIMG(str, str2, i2, i3);
        MethodCollector.o(405);
        return nativeConverRGBAToIMG;
    }

    public static int convertJpegToMp4(String str, String str2, int i2, boolean z) {
        MethodCollector.i(412);
        int nativeConvertJpegToMp4 = nativeConvertJpegToMp4(str, str2, i2, z);
        MethodCollector.o(412);
        return nativeConvertJpegToMp4;
    }

    public static long createRTAudioWaveformMgr(int i2, int i3, float f2, int i4) {
        MethodCollector.i(2532);
        long nativeCreateRTAudioWaveformMgr = nativeCreateRTAudioWaveformMgr(i2, i3, f2, i4);
        MethodCollector.o(2532);
        return nativeCreateRTAudioWaveformMgr;
    }

    public static int generateMuteWav(String str, int i2, int i3, int i4) {
        MethodCollector.i(3178);
        int nativeGenerateMuteWav = nativeGenerateMuteWav(str, i2, i3, i4);
        MethodCollector.o(3178);
        return nativeGenerateMuteWav;
    }

    public static Object getAudioAlgorithmResult(String str, String str2, int i2, int i3) {
        MethodCollector.i(386);
        Object nativeGetAudioAlgorithmResult = nativeGetAudioAlgorithmResult(str, str2, i2, i3);
        MethodCollector.o(386);
        return nativeGetAudioAlgorithmResult;
    }

    public static double getAudioVolume(byte[] bArr, int i2, int i3, int i4) {
        MethodCollector.i(2494);
        double nativeGetAudioVolume = nativeGetAudioVolume(bArr, i2, i3, i4);
        MethodCollector.o(2494);
        return nativeGetAudioVolume;
    }

    public static int getFileAudio(String str, String str2, ArrayList<String> arrayList, boolean z) {
        MethodCollector.i(3173);
        int nativeGetFileAudio = nativeGetFileAudio(str, str2, arrayList, z);
        MethodCollector.o(3173);
        return nativeGetFileAudio;
    }

    public static long initResampleContext(int i2, int i3, int i4, int i5) {
        MethodCollector.i(324);
        long nativeInitResampleContext = nativeInitResampleContext(i2, i3, i4, i5);
        MethodCollector.o(324);
        return nativeInitResampleContext;
    }

    public static int isCanTransCodeWithResult(String str, int i2, int i3, String[] strArr) {
        MethodCollector.i(322);
        int nativeIsCanTransCodeWithResult = nativeIsCanTransCodeWithResult(str, i2, i3, strArr);
        MethodCollector.o(322);
        return nativeIsCanTransCodeWithResult;
    }

    public static int rtAudioWaveformGetPoints(long j2, float[] fArr, int i2, int i3) {
        MethodCollector.i(3109);
        int nativeRTAudioWaveformGetPoints = nativeRTAudioWaveformGetPoints(j2, fArr, i2, i3);
        MethodCollector.o(3109);
        return nativeRTAudioWaveformGetPoints;
    }

    public static int rtAudioWaveformProcess(long j2, float[][] fArr, int i2, int i3) {
        MethodCollector.i(3105);
        int nativeRTAudioWaveformProcess = nativeRTAudioWaveformProcess(j2, fArr, i2, i3);
        MethodCollector.o(3105);
        return nativeRTAudioWaveformProcess;
    }

    public static int splitVideo(String str, String[] strArr, int[] iArr, boolean z) {
        MethodCollector.i(2475);
        int nativeSplitVideo = nativeSplitVideo(str, strArr, iArr, z);
        MethodCollector.o(2475);
        return nativeSplitVideo;
    }

    public static int trimVideoFile(String str, int[] iArr, String str2, int[] iArr2) {
        MethodCollector.i(378);
        int nativeTrimFile = nativeTrimFile(str, str2, iArr, iArr2);
        MethodCollector.o(378);
        return nativeTrimFile;
    }

    public static double voiceActivityDetection(byte[] bArr, long j2, int i2, int i3) {
        MethodCollector.i(2502);
        double nativeVoiceActivityDetection = nativeVoiceActivityDetection(bArr, j2, i2, i3);
        MethodCollector.o(2502);
        return nativeVoiceActivityDetection;
    }

    public static int reverseAllIVideoAndMuxAudio(String str, String str2, String str3, TEReverseCallback tEReverseCallback) {
        MethodCollector.i(356);
        int nativeReverseAllIFrameVideoAndMuxAudio2 = nativeReverseAllIFrameVideoAndMuxAudio2(str, str2, str3, tEReverseCallback);
        MethodCollector.o(356);
        return nativeReverseAllIFrameVideoAndMuxAudio2;
    }

    public static int findAudioSegmentStartTimeInOrigin(String str, int i2, String str2, int i3, int i4) {
        MethodCollector.i(398);
        int nativeFindAudioSegmentStartTimeInOrigin = nativeFindAudioSegmentStartTimeInOrigin(str, i2, str2, i3, i4);
        MethodCollector.o(398);
        return nativeFindAudioSegmentStartTimeInOrigin;
    }

    public static int pcmResampleFilter(long j2, byte[] bArr, byte[] bArr2, int i2, int i3) {
        MethodCollector.i(327);
        int nativePcmResampleFilter = nativePcmResampleFilter(j2, bArr, bArr2, i2, i3);
        MethodCollector.o(327);
        return nativePcmResampleFilter;
    }

    public static Bitmap getFrameWithHandler(long j2, int i2, int i3, int i4, boolean z) {
        MethodCollector.i(3382);
        int[] iArr = new int[2];
        nativeGetDstBitmapSize(j2, i3, i4, iArr);
        Bitmap createBitmap = Bitmap.createBitmap(iArr[0], iArr[1], Bitmap.Config.ARGB_8888);
        if (createBitmap == null) {
            MethodCollector.o(3382);
            return null;
        }
        if (nativeGetFrameWithHandler(j2, createBitmap, i2, iArr[0], iArr[1], z) != 0) {
            if (!createBitmap.isRecycled()) {
                createBitmap.recycle();
            }
            createBitmap = null;
        }
        MethodCollector.o(3382);
        return createBitmap;
    }

    public static VEMusicWaveBean getAudioWaveData(String str, int i2, int i3, int i4, int i5, int i6) {
        MethodCollector.i(2515);
        VEMusicWaveBean nativeGetAudioWaveData = nativeGetAudioWaveData(str, i2, i3, i4, i5, i6);
        MethodCollector.o(2515);
        return nativeGetAudioWaveData;
    }

    public static int getVideoFrames2(String str, int[] iArr, int i2, int i3, boolean z, Object obj) {
        MethodCollector.i(3195);
        int nativeGetVideoFrame2 = nativeGetVideoFrame2(str, iArr, i2, i3, z, obj);
        MethodCollector.o(3195);
        return nativeGetVideoFrame2;
    }

    public static int getVideoFrames3(String str, int[] iArr, int i2, int i3, boolean z, Object obj) {
        MethodCollector.i(3200);
        int nativeGetVideoFrame3 = nativeGetVideoFrame3(str, iArr, i2, i3, z, obj);
        MethodCollector.o(3200);
        return nativeGetVideoFrame3;
    }

    public static int getVideoFrames(String str, int[] iArr, int i2, int i3, boolean z, Object obj, int i4) {
        MethodCollector.i(3191);
        int nativeGetVideoFrame = nativeGetVideoFrame(str, iArr, i2, i3, z, obj, i4);
        MethodCollector.o(3191);
        return nativeGetVideoFrame;
    }

    public static int processAudioTuning(String[] strArr, int[] iArr, int[] iArr2, float f2, float f3, String str, String str2) {
        MethodCollector.i(3171);
        int nativeProcessAudioTuning = nativeProcessAudioTuning(strArr, iArr, iArr2, f2, f3, str, str2);
        MethodCollector.o(3171);
        return nativeProcessAudioTuning;
    }

    public static int getVideoFrameData(String str, int i2, int i3, int i4, int i5, a aVar, Object obj) {
        MethodCollector.i(3188);
        int nativeGetVideoFrameData = nativeGetVideoFrameData(str, i2, i3, i4, i5, aVar.getValue(), obj);
        MethodCollector.o(3188);
        return nativeGetVideoFrameData;
    }

    public static int transCodeAudioFile(String str, int i2, int i3, String str2, int i4, int i5, int i6) {
        MethodCollector.i(3166);
        if (TextUtils.isEmpty(str)) {
            MethodCollector.o(3166);
            return -100;
        } else if (TextUtils.isEmpty(str2)) {
            MethodCollector.o(3166);
            return -100;
        } else {
            int nativeTransCodecAudioFile = nativeTransCodecAudioFile(str, i2, i3, str2, i4, i5, i6);
            MethodCollector.o(3166);
            return nativeTransCodecAudioFile;
        }
    }

    public static int getVideoThumb(String str, int i2, Object obj, boolean z, int i3, int i4, long j2, int i5) {
        MethodCollector.i(20);
        int nativeGetVideoThumb = nativeGetVideoThumb(str, i2, obj, z, i3, i4, j2, i5);
        MethodCollector.o(20);
        return nativeGetVideoThumb;
    }

    public static int saveVideoFrames(String str, int[] iArr, int i2, int i3, boolean z, String str2, int i4, int i5) {
        MethodCollector.i(3218);
        int nativeSaveVideoFrames = nativeSaveVideoFrames(str, iArr, i2, i3, z, str2, i4, i5);
        MethodCollector.o(3218);
        return nativeSaveVideoFrames;
    }

    public static int getVideoFramesMore(String str, int[] iArr, int i2, int i3, boolean z, boolean z2, int i4, boolean z3, Object obj) {
        MethodCollector.i(3250);
        int nativeGetVideoFrameMore = nativeGetVideoFrameMore(str, iArr, i2, i3, z, z2, i4, z3, obj);
        MethodCollector.o(3250);
        return nativeGetVideoFrameMore;
    }

    public static int detachAudioFromVideos(String str, String[] strArr, long[] jArr, long[] jArr2, long j2, long j3, float[] fArr, int i2, int i3, int i4) {
        MethodCollector.i(25);
        int nativeDetachAudioFromVideos = nativeDetachAudioFromVideos(str, strArr, jArr, jArr2, j2, j3, fArr, i2, i3, i4, 0);
        MethodCollector.o(25);
        return nativeDetachAudioFromVideos;
    }

    public static int concatRecordFrag(String[] strArr, long[] jArr, String[] strArr2, long[] jArr2, boolean z, int i2, String str, String str2, String str3, String str4) {
        MethodCollector.i(949);
        if (TextUtils.isEmpty(str3) || TextUtils.isEmpty(str4) || strArr.length == 0 || jArr.length != strArr.length || strArr.length != strArr2.length || strArr.length != jArr2.length) {
            an.d("TEVideoUtils", "ConmatRecordFrag parameter error!");
            MethodCollector.o(949);
            return -100;
        }
        File file = new File(str3.substring(0, str3.lastIndexOf("/")));
        if (file.exists() || file.mkdirs()) {
            File file2 = new File(str4.substring(0, str4.lastIndexOf("/")));
            if (file2.exists() || file2.mkdirs()) {
                int nativeConcatRecordFrag = nativeConcatRecordFrag(strArr, jArr, strArr2, jArr2, z, i2, str, str2, str3, str4);
                MethodCollector.o(949);
                return nativeConcatRecordFrag;
            }
            an.d("TEVideoUtils", "create audio output dir failed. Output audio Directory: ".concat(String.valueOf(str4)));
            MethodCollector.o(949);
            return -114;
        }
        an.d("TEVideoUtils", "create video output dir failed. Output Video Directory: ".concat(String.valueOf(str3)));
        MethodCollector.o(949);
        return -114;
    }

    public static int detachAudioFromVideos(String str, String[] strArr, long[] jArr, long[] jArr2, long j2, long j3, float[] fArr, int i2, int i3, int i4, int i5) {
        MethodCollector.i(310);
        int nativeDetachAudioFromVideos = nativeDetachAudioFromVideos(str, strArr, jArr, jArr2, j2, j3, fArr, i2, i3, i4, i5);
        MethodCollector.o(310);
        return nativeDetachAudioFromVideos;
    }
}
