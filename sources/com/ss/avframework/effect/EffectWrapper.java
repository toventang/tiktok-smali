package com.ss.avframework.effect;

import android.content.res.AssetManager;
import android.graphics.Bitmap;
import android.text.TextUtils;
import android.util.AndroidRuntimeException;
import com.bef.effectsdk.EffectABConfig;
import com.bytedance.covode.number.Covode;
import com.bytedance.frameworks.apm.trace.MethodCollector;
import com.ss.avframework.buffer.RoiInfo;
import com.ss.avframework.buffer.VideoFrame;
import com.ss.avframework.effect.IVideoEffectProcessor;
import com.ss.avframework.engine.AudioDeviceModule;
import com.ss.avframework.engine.NativeObject;
import com.ss.avframework.utils.AVLog;
import com.ss.avframework.utils.TEBundle;
import java.nio.Buffer;
import java.nio.ByteBuffer;
import java.util.Map;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

public class EffectWrapper extends NativeObject implements IVideoEffectProcessor {
    private static IEffectEdgeRenderLoga mEffectEdgeLog;
    private AudioDeviceModule.AudioRenderSink mAudioRenderSink;
    public Long mDetectFlag = new Long(0);
    private IVideoEffectProcessor.EffectMsgListener mEffectMsgListener;
    private ExpressionBundleImpl[] mExpressionBundles;
    private IVideoEffectProcessor.ExpressionDetectListener mExpressionListener;
    private TEBundle[] mExpressionTEBundles;
    private IVideoEffectProcessor.FaceDetectListener mFaceListener;
    private int mFrameRate;
    private boolean mFromExtern;
    private IVideoEffectProcessor.IEffectInfoChangeListener mIEffectInfoChangeListener;
    private int mMaxKbps;
    private IVideoEffectProcessor.MicrophoneDetectListener mMicrophoneListener;
    private boolean mValid;

    /* renamed from: com.ss.avframework.effect.EffectWrapper$1  reason: invalid class name */
    static /* synthetic */ class AnonymousClass1 {
        static {
            Covode.recordClassIndex(99770);
        }
    }

    public interface IEffectEdgeRenderLoga {
        static {
            Covode.recordClassIndex(99773);
        }

        void onEdgeRenderLog(String str, String str2);
    }

    static {
        Covode.recordClassIndex(99769);
    }

    private static String NonNull(String str) {
        return str == null ? "" : str;
    }

    public static native String nativeAlgorithmResultGameSizeCheck(long j2);

    private native int nativeAudioStrangeVoiceProcess(Buffer buffer, int i2, int i3, int i4, long j2);

    public static native int nativeBuildBufferFromString(int i2, String str, ByteBuffer byteBuffer);

    private native int nativeComposerAppendNodes(String[] strArr, int i2);

    private native int nativeComposerAppendNodesWithTags(String[] strArr, int i2, String[] strArr2);

    private native int nativeComposerCheckNodeExclusion(String str, String str2, int[] iArr);

    private native int nativeComposerExclusionCompare(String str, String str2, String str3, int[] iArr);

    private native int nativeComposerReloadNodes(String[] strArr, int i2);

    private native int nativeComposerReloadNodesWithTags(String[] strArr, int i2, String[] strArr2);

    private native int nativeComposerRemoveNodes(String[] strArr, int i2);

    private native int nativeComposerReplaceNodesWithTags(String[] strArr, int i2, String[] strArr2, int i3, String[] strArr3);

    private native int nativeComposerSetMode(int i2, int i3);

    private native int nativeComposerSetNodes(String[] strArr, int i2);

    private native int nativeComposerSetNodesWithTags(String[] strArr, int i2, String[] strArr2);

    private native int nativeComposerUpdateNode(String str, String str2, float f2);

    private static native int nativeConfigABBooleanValue(String str, boolean z);

    private static native int nativeConfigABFloatValue(String str, float f2);

    private static native int nativeConfigABIntValue(String str, int i2);

    private static native int nativeConfigABStringValue(String str, String str2);

    private native int nativeConfigEffect(int i2, int i3, String str, String str2, boolean z, boolean z2, String str3);

    private native AlgorithmResult nativeCreateAlgorithmResult();

    private native void nativeCreateEffectWrapper(AudioDeviceModule audioDeviceModule, AudioDeviceModule.AudioRenderSink audioRenderSink, boolean z);

    private native int nativeDetectFaceFromBitMap(Bitmap bitmap);

    private native long nativeEffectNativeHandler();

    private native void nativeEnableExpressionDetect(boolean z, boolean z2, boolean z3, boolean z4, boolean z5, boolean z6);

    private native int nativeEnableFindContour(boolean z, String str);

    private native long nativeGetAlgorithmRequirment();

    private native long nativeGetAlgorithmRequirmentParams();

    private native long nativeGetAlgorithmResult(AlgorithmResult algorithmResult, long j2);

    private native boolean nativeGetAudioRecognizeStatus();

    private static native String nativeGetEffectVersion();

    private native boolean nativeGetExpressionDetectResult(TEBundle[] tEBundleArr, int i2);

    private native float nativeGetFilterIntensity(String str);

    private native int nativeGetMattingResult(ByteBuffer byteBuffer);

    private native String nativeName();

    public static native AlgorithmResult nativeParseParcelBuffer(AlgorithmResult algorithmResult, long j2, ByteBuffer byteBuffer, int i2, int i3);

    public static native String nativeParseStringFromByteBuffer(int i2, ByteBuffer byteBuffer);

    private native int nativePauseEffect();

    public static native int nativePeekParcelSize();

    private native int nativeProcess(int i2, int i3, int i4, int i5, long j2, Long l2, RoiInfo roiInfo, boolean z, int i6, long j3);

    private native void nativeProcessDoubleClickEvent(float f2, float f3);

    private native void nativeProcessLongPressEvent(float f2, float f3);

    private native void nativeProcessPanEvent(float f2, float f3, float f4, float f5, float f6);

    private native void nativeProcessRotationEvent(float f2, float f3);

    private native void nativeProcessScaleEvent(float f2, float f3);

    private native void nativeProcessTouchDownEvent(float f2, float f3, int i2);

    private native void nativeProcessTouchEvent(float f2, float f3);

    private native void nativeProcessTouchEventWithTouchType(long j2, float f2, float f3, float f4, float f5, int i2, int i3);

    private native void nativeProcessTouchUpEvent(float f2, float f3, int i2);

    public static native int nativeReadParcel(long j2, ByteBuffer byteBuffer);

    private native int nativeRefreshAlgorithmRequirment(long j2, long j3);

    private native void nativeReleaseContetDetector();

    private native int nativeRenderCacheBitmap(String str, Bitmap bitmap);

    private native int nativeRenderCacheString(String str, String str2);

    private native int nativeRenderCacheTexture(String str, String str2);

    private native int nativeResumeEffect();

    private native int nativeSendEffectMsg(int i2, int i3, int i4, String str);

    private native int nativeSetABLicense(String str);

    private native void nativeSetAlgorithmAB(boolean z);

    private native int nativeSetAlgorithmRequirment(long j2);

    private native int nativeSetAssetManager(AssetManager assetManager);

    private native int nativeSetAudioRecognizeDict(String str);

    private native int nativeSetBeautify(String str, float f2, float f3);

    private native int nativeSetBeautifyWithSharp(String str, float f2, float f3, float f4);

    private native int nativeSetCustomEffectOrientation(String str, int i2);

    private native void nativeSetDoubleViewRect(double d2, double d3, double d4, double d5);

    private native int nativeSetEffect(String str);

    private native int nativeSetFaceAttribute(boolean z);

    private native int nativeSetFilter(String str, float f2, boolean z);

    private native int nativeSetMusicNodeFilePath(String str);

    private native int nativeSetReshape(String str, float f2, float f3);

    private native int nativeSetResourceFinder(Object obj);

    private native int nativeSetSendContourInfoType(int i2);

    private native int nativeSetTwoFilters(String str, String str2, float f2, float f3, float f4, boolean z);

    private native int nativeStartAudioRecognize(ByteBuffer byteBuffer, int i2, int i3, int i4);

    private native int nativeUpdateAudioConfig(String str);

    /* access modifiers changed from: protected */
    public void createEffectAudioSource(AudioDeviceModule audioDeviceModule) {
    }

    @Override // com.ss.avframework.effect.IVideoEffectProcessor
    public int enableMockFace(boolean z) {
        return 0;
    }

    @Override // com.ss.avframework.effect.IVideoEffectProcessor
    public int setEffect(String str, boolean z) {
        return 0;
    }

    @Override // com.ss.avframework.effect.IVideoEffectProcessor
    public int startEffectAudio() {
        return 0;
    }

    @Override // com.ss.avframework.effect.IVideoEffectProcessor
    public int stopEffectAudio() {
        return 0;
    }

    public static class AlgorithmResult extends NativeObject implements VideoFrame.IExtraData {
        public long mFlags;
        public long mMiniGameResult;
        public long mStRoiInfo;

        static {
            Covode.recordClassIndex(99771);
        }

        public long getMiniGameResult() {
            return this.mMiniGameResult;
        }

        public long mStRoiInfo() {
            return this.mStRoiInfo;
        }

        @Override // com.ss.avframework.buffer.VideoFrame.IExtraData
        public int peekParcelSize() {
            MethodCollector.i(13606);
            int nativePeekParcelSize = EffectWrapper.nativePeekParcelSize();
            MethodCollector.o(13606);
            return nativePeekParcelSize;
        }

        private void setMiniGmeResult(long j2) {
            this.mMiniGameResult = j2;
        }

        private void setStRoiInfo(long j2) {
            this.mStRoiInfo = j2;
        }

        @Override // com.ss.avframework.buffer.VideoFrame.IExtraData
        public void releaseExtraData(Object obj) {
            release();
        }

        public AlgorithmResult(long j2) {
            setNativeObj(j2);
        }

        public static String checkGameSize(long j2) {
            MethodCollector.i(13539);
            String nativeAlgorithmResultGameSizeCheck = EffectWrapper.nativeAlgorithmResultGameSizeCheck(j2);
            MethodCollector.o(13539);
            return nativeAlgorithmResultGameSizeCheck;
        }

        @Override // com.ss.avframework.buffer.VideoFrame.IExtraData
        public int readParcel(ByteBuffer byteBuffer) {
            MethodCollector.i(13607);
            int nativeReadParcel = EffectWrapper.nativeReadParcel(this.mNativeObj, byteBuffer);
            MethodCollector.o(13607);
            return nativeReadParcel;
        }

        public static int buildBufferFromString(String str, ByteBuffer byteBuffer) {
            MethodCollector.i(13611);
            int nativeBuildBufferFromString = EffectWrapper.nativeBuildBufferFromString(0, str, byteBuffer);
            MethodCollector.o(13611);
            return nativeBuildBufferFromString;
        }

        public static String parseStringFromByteBuffer(int i2, ByteBuffer byteBuffer) {
            MethodCollector.i(13612);
            String nativeParseStringFromByteBuffer = EffectWrapper.nativeParseStringFromByteBuffer(i2, byteBuffer);
            MethodCollector.o(13612);
            return nativeParseStringFromByteBuffer;
        }

        public static AlgorithmResult parseParcel(int i2, int i3, ByteBuffer byteBuffer, AlgorithmResult algorithmResult) {
            long j2;
            MethodCollector.i(13609);
            if (algorithmResult == null) {
                j2 = 0;
            } else {
                j2 = algorithmResult.mNativeObj;
            }
            AlgorithmResult nativeParseParcelBuffer = EffectWrapper.nativeParseParcelBuffer(algorithmResult, j2, byteBuffer, i2, i3);
            MethodCollector.o(13609);
            return nativeParseParcelBuffer;
        }
    }

    class ExpressionBundleImpl implements IVideoEffectProcessor.ExpressionBundle {
        float age;
        float angry_score;
        float arousal;
        float attractive;
        float blur_score;
        float boy_prob;
        int exp_type;
        float happy_score;
        float illumination;
        float lipstick_prob;
        float mask_prob;
        float mustache_prob;
        float quality;
        float real_face_prob;
        float sad_score;
        float surprise_score;
        float valence;
        float wear_glass_prob;
        float wear_hat_prob;
        float wear_sunglass_prob;

        static {
            Covode.recordClassIndex(99772);
        }

        @Override // com.ss.avframework.effect.IVideoEffectProcessor.ExpressionBundle
        public float getAngryScore() {
            return this.angry_score;
        }

        @Override // com.ss.avframework.effect.IVideoEffectProcessor.ExpressionBundle
        public float getArousal() {
            return this.arousal;
        }

        @Override // com.ss.avframework.effect.IVideoEffectProcessor.ExpressionBundle
        public float getAttractive() {
            return this.attractive;
        }

        @Override // com.ss.avframework.effect.IVideoEffectProcessor.ExpressionBundle
        public float getBlurScore() {
            return this.blur_score;
        }

        @Override // com.ss.avframework.effect.IVideoEffectProcessor.ExpressionBundle
        public float getBoyProb() {
            return this.boy_prob;
        }

        @Override // com.ss.avframework.effect.IVideoEffectProcessor.ExpressionBundle
        public float getEge() {
            return this.age;
        }

        @Override // com.ss.avframework.effect.IVideoEffectProcessor.ExpressionBundle
        public int getExpressionType() {
            return this.exp_type;
        }

        @Override // com.ss.avframework.effect.IVideoEffectProcessor.ExpressionBundle
        public float getHappyScore() {
            return this.happy_score;
        }

        @Override // com.ss.avframework.effect.IVideoEffectProcessor.ExpressionBundle
        public float getIllumination() {
            return this.illumination;
        }

        @Override // com.ss.avframework.effect.IVideoEffectProcessor.ExpressionBundle
        public float getLipstickProb() {
            return this.lipstick_prob;
        }

        @Override // com.ss.avframework.effect.IVideoEffectProcessor.ExpressionBundle
        public float getMaskProb() {
            return this.mask_prob;
        }

        @Override // com.ss.avframework.effect.IVideoEffectProcessor.ExpressionBundle
        public float getMustacheProb() {
            return this.mustache_prob;
        }

        @Override // com.ss.avframework.effect.IVideoEffectProcessor.ExpressionBundle
        public float getQuality() {
            return this.quality;
        }

        @Override // com.ss.avframework.effect.IVideoEffectProcessor.ExpressionBundle
        public float getRealFaceProb() {
            return this.real_face_prob;
        }

        @Override // com.ss.avframework.effect.IVideoEffectProcessor.ExpressionBundle
        public float getSadScore() {
            return this.sad_score;
        }

        @Override // com.ss.avframework.effect.IVideoEffectProcessor.ExpressionBundle
        public float getSurpriseScore() {
            return this.surprise_score;
        }

        @Override // com.ss.avframework.effect.IVideoEffectProcessor.ExpressionBundle
        public float getValence() {
            return this.valence;
        }

        @Override // com.ss.avframework.effect.IVideoEffectProcessor.ExpressionBundle
        public float getWearGlassProb() {
            return this.wear_glass_prob;
        }

        @Override // com.ss.avframework.effect.IVideoEffectProcessor.ExpressionBundle
        public float getWearHatProb() {
            return this.wear_hat_prob;
        }

        @Override // com.ss.avframework.effect.IVideoEffectProcessor.ExpressionBundle
        public float getWearSunglassProb() {
            return this.wear_sunglass_prob;
        }

        private ExpressionBundleImpl() {
        }

        /* synthetic */ ExpressionBundleImpl(EffectWrapper effectWrapper, AnonymousClass1 r2) {
            this();
        }
    }

    @Override // com.ss.avframework.effect.IVideoEffectProcessor
    public AudioDeviceModule.AudioRenderSink getEffectAudioRender() {
        return this.mAudioRenderSink;
    }

    public int getFrameRate() {
        return this.mFrameRate;
    }

    public int getMaxKbps() {
        return this.mMaxKbps;
    }

    @Override // com.ss.avframework.effect.IVideoEffectProcessor
    public boolean valid() {
        return this.mValid;
    }

    public long getAlgorithmRequirment() {
        MethodCollector.i(11584);
        long nativeGetAlgorithmRequirment = nativeGetAlgorithmRequirment();
        MethodCollector.o(11584);
        return nativeGetAlgorithmRequirment;
    }

    public long getAlgorithmRequirmentParams() {
        MethodCollector.i(11745);
        long nativeGetAlgorithmRequirmentParams = nativeGetAlgorithmRequirmentParams();
        MethodCollector.o(11745);
        return nativeGetAlgorithmRequirmentParams;
    }

    @Override // com.ss.avframework.effect.IVideoEffectProcessor
    public String getEffectVersion() {
        MethodCollector.i(14288);
        String nativeGetEffectVersion = nativeGetEffectVersion();
        MethodCollector.o(14288);
        return nativeGetEffectVersion;
    }

    protected EffectWrapper() {
        if (!checkVersion()) {
            this.mFromExtern = false;
            return;
        }
        throw new AndroidRuntimeException("unsupport");
    }

    public long getEffectNativeHandler() {
        MethodCollector.i(14444);
        if (this.mValid) {
            long nativeEffectNativeHandler = nativeEffectNativeHandler();
            MethodCollector.o(14444);
            return nativeEffectNativeHandler;
        }
        MethodCollector.o(14444);
        return 0;
    }

    @Override // com.ss.avframework.effect.IVideoEffectProcessor
    public boolean isAudioRecognizeAvailable() {
        MethodCollector.i(13295);
        if (!this.mValid) {
            MethodCollector.o(13295);
            return false;
        }
        boolean nativeGetAudioRecognizeStatus = nativeGetAudioRecognizeStatus();
        MethodCollector.o(13295);
        return nativeGetAudioRecognizeStatus;
    }

    @Override // com.ss.avframework.effect.IVideoEffectProcessor
    public String name() {
        MethodCollector.i(14285);
        if (!this.mValid) {
            MethodCollector.o(14285);
            return "Dummy Effect";
        }
        String nativeName = nativeName();
        MethodCollector.o(14285);
        return nativeName;
    }

    @Override // com.ss.avframework.effect.IVideoEffectProcessor
    public int pauseEffect() {
        MethodCollector.i(13930);
        if (!this.mValid) {
            MethodCollector.o(13930);
            return 0;
        }
        int nativePauseEffect = nativePauseEffect();
        MethodCollector.o(13930);
        return nativePauseEffect;
    }

    @Override // com.ss.avframework.effect.IVideoEffectProcessor
    public void releaseContetDetector() {
        MethodCollector.i(12948);
        if (!this.mValid) {
            MethodCollector.o(12948);
            return;
        }
        nativeReleaseContetDetector();
        MethodCollector.o(12948);
    }

    @Override // com.ss.avframework.effect.IVideoEffectProcessor
    public int resumeEffect() {
        MethodCollector.i(13931);
        if (!this.mValid) {
            MethodCollector.o(13931);
            return 0;
        }
        int nativeResumeEffect = nativeResumeEffect();
        MethodCollector.o(13931);
        return nativeResumeEffect;
    }

    private boolean checkVersion() {
        boolean z;
        try {
            String effectVersion = getEffectVersion();
            if (!TextUtils.isEmpty(effectVersion)) {
                z = true;
            } else {
                z = false;
            }
            this.mValid = z;
            if (z) {
                AVLog.ioe("EffectWrapper", "Effect Version:".concat(String.valueOf(effectVersion)));
            }
        } catch (Throwable unused) {
            this.mValid = false;
        }
        return this.mValid;
    }

    @Override // com.ss.avframework.effect.IVideoEffectProcessor, com.ss.avframework.engine.NativeObject
    public synchronized void release() {
        MethodCollector.i(11242);
        mEffectEdgeLog = null;
        IVideoEffectProcessor.EffectMsgListener effectMsgListener = this.mEffectMsgListener;
        if (effectMsgListener != null) {
            VideoEffectUtilsWrapper.removeMessageCenterListener(effectMsgListener);
            this.mEffectMsgListener = null;
        }
        this.mFaceListener = null;
        this.mExpressionListener = null;
        if (!this.mFromExtern) {
            super.release();
        }
        AudioDeviceModule.AudioRenderSink audioRenderSink = this.mAudioRenderSink;
        if (audioRenderSink != null) {
            audioRenderSink.setQuirks(0);
            this.mAudioRenderSink.setAudioTrack(null);
            this.mAudioRenderSink.release();
            this.mAudioRenderSink = null;
        }
        MethodCollector.o(11242);
    }

    public static void setEffectEdgeLog(IEffectEdgeRenderLoga iEffectEdgeRenderLoga) {
        mEffectEdgeLog = iEffectEdgeRenderLoga;
    }

    public void setEffectInfoChangeListener(IVideoEffectProcessor.IEffectInfoChangeListener iEffectInfoChangeListener) {
        this.mIEffectInfoChangeListener = iEffectInfoChangeListener;
    }

    @Override // com.ss.avframework.engine.NativeObject
    public void setNativeObj(long j2) {
        super.setNativeObj(j2);
    }

    public String getEffectABInfo(String str) {
        return EffectABConfig.requestABInfoWithLicense(str);
    }

    @Override // com.ss.avframework.effect.IVideoEffectProcessor
    public void setExpressionDetectListener(IVideoEffectProcessor.ExpressionDetectListener expressionDetectListener) {
        if (this.mValid) {
            this.mExpressionListener = expressionDetectListener;
        }
    }

    @Override // com.ss.avframework.effect.IVideoEffectProcessor
    public void setFaceDetectListener(IVideoEffectProcessor.FaceDetectListener faceDetectListener) {
        if (this.mValid) {
            this.mFaceListener = faceDetectListener;
        }
    }

    @Override // com.ss.avframework.effect.IVideoEffectProcessor
    public void setMicrophoneDetectListener(IVideoEffectProcessor.MicrophoneDetectListener microphoneDetectListener) {
        if (this.mValid) {
            this.mMicrophoneListener = microphoneDetectListener;
        }
    }

    public void onMicrophoneDetectResultCallback(float f2) {
        IVideoEffectProcessor.MicrophoneDetectListener microphoneDetectListener;
        if (this.mValid && (microphoneDetectListener = this.mMicrophoneListener) != null) {
            microphoneDetectListener.onMicrophoneDetectResultCallback(f2);
        }
    }

    public int setAlgorithmRequirment(long j2) {
        MethodCollector.i(11407);
        int nativeSetAlgorithmRequirment = nativeSetAlgorithmRequirment(j2);
        MethodCollector.o(11407);
        return nativeSetAlgorithmRequirment;
    }

    @Override // com.ss.avframework.effect.IVideoEffectProcessor
    public int setAssetManager(AssetManager assetManager) {
        MethodCollector.i(11245);
        int nativeSetAssetManager = nativeSetAssetManager(assetManager);
        MethodCollector.o(11245);
        return nativeSetAssetManager;
    }

    public int setAudioEffectConfig(String str) {
        MethodCollector.i(14443);
        int nativeUpdateAudioConfig = nativeUpdateAudioConfig(str);
        MethodCollector.o(14443);
        return nativeUpdateAudioConfig;
    }

    @Override // com.ss.avframework.effect.IVideoEffectProcessor
    public int setResourceFinder(Object obj) {
        MethodCollector.i(11247);
        int nativeSetResourceFinder = nativeSetResourceFinder(obj);
        MethodCollector.o(11247);
        return nativeSetResourceFinder;
    }

    @Override // com.ss.avframework.effect.IVideoEffectProcessor
    public boolean detectFaceFromBitMap(Bitmap bitmap) {
        MethodCollector.i(12852);
        if (!this.mValid) {
            MethodCollector.o(12852);
            return false;
        } else if (nativeDetectFaceFromBitMap(bitmap) == 0) {
            MethodCollector.o(12852);
            return true;
        } else {
            MethodCollector.o(12852);
            return false;
        }
    }

    public AlgorithmResult getAlgorithmResult(long j2) {
        MethodCollector.i(14321);
        AlgorithmResult nativeCreateAlgorithmResult = nativeCreateAlgorithmResult();
        nativeCreateAlgorithmResult.mFlags = nativeGetAlgorithmResult(nativeCreateAlgorithmResult, j2);
        MethodCollector.o(14321);
        return nativeCreateAlgorithmResult;
    }

    @Override // com.ss.avframework.effect.IVideoEffectProcessor
    public float getFilterIntensity(String str) {
        MethodCollector.i(13140);
        if (!this.mValid) {
            MethodCollector.o(13140);
            return -1.0f;
        }
        float nativeGetFilterIntensity = nativeGetFilterIntensity(str);
        MethodCollector.o(13140);
        return nativeGetFilterIntensity;
    }

    @Override // com.ss.avframework.effect.IVideoEffectProcessor
    public int getMattingResult(ByteBuffer byteBuffer) {
        MethodCollector.i(14410);
        if (!this.mValid) {
            MethodCollector.o(14410);
            return 0;
        }
        int nativeGetMattingResult = nativeGetMattingResult(byteBuffer);
        MethodCollector.o(14410);
        return nativeGetMattingResult;
    }

    public void onFaceDetectResultCallback(int i2) {
        if (this.mValid) {
            try {
                IVideoEffectProcessor.FaceDetectListener faceDetectListener = this.mFaceListener;
                if (faceDetectListener != null) {
                    faceDetectListener.onFaceDetectResultCallback(i2);
                }
            } catch (Throwable th) {
                AVLog.logToIODevice2(6, "EffectWrapper", "onFaceDetectResultCallback exception. ", th, "EffectWrapper.onFaceDetectResultCallback", 30000);
            }
        }
    }

    @Override // com.ss.avframework.effect.IVideoEffectProcessor
    public void setAlgorithmAB(boolean z) {
        MethodCollector.i(11908);
        if (!this.mValid) {
            MethodCollector.o(11908);
            return;
        }
        nativeSetAlgorithmAB(z);
        MethodCollector.o(11908);
    }

    @Override // com.ss.avframework.effect.IVideoEffectProcessor
    public int setEffect(String str) {
        MethodCollector.i(12608);
        if (!this.mValid) {
            MethodCollector.o(12608);
            return 0;
        }
        int nativeSetEffect = nativeSetEffect(NonNull(str));
        MethodCollector.o(12608);
        return nativeSetEffect;
    }

    @Override // com.ss.avframework.effect.IVideoEffectProcessor
    public int setEffectLicense(String str) {
        MethodCollector.i(14391);
        if (str != null) {
            int nativeSetABLicense = nativeSetABLicense(str);
            IVideoEffectProcessor.IEffectInfoChangeListener iEffectInfoChangeListener = this.mIEffectInfoChangeListener;
            if (iEffectInfoChangeListener != null) {
                iEffectInfoChangeListener.onLicenseInfoChange(str, nativeSetABLicense);
            }
        }
        MethodCollector.o(14391);
        return 0;
    }

    @Override // com.ss.avframework.effect.IVideoEffectProcessor
    public void setEffectMsgListener(IVideoEffectProcessor.EffectMsgListener effectMsgListener) {
        if (this.mValid) {
            IVideoEffectProcessor.EffectMsgListener effectMsgListener2 = this.mEffectMsgListener;
            if (effectMsgListener2 != null) {
                VideoEffectUtilsWrapper.removeMessageCenterListener(effectMsgListener2);
                this.mEffectMsgListener = null;
            }
            if (effectMsgListener != null) {
                this.mEffectMsgListener = effectMsgListener;
                VideoEffectUtilsWrapper.addMessageCenterListener(effectMsgListener);
            }
        }
    }

    @Override // com.ss.avframework.effect.IVideoEffectProcessor
    public int setFaceAttribute(boolean z) {
        MethodCollector.i(12058);
        if (!this.mValid) {
            MethodCollector.o(12058);
            return 0;
        }
        int nativeSetFaceAttribute = nativeSetFaceAttribute(z);
        MethodCollector.o(12058);
        return nativeSetFaceAttribute;
    }

    @Override // com.ss.avframework.effect.IVideoEffectProcessor
    public void setMusicNodeFilePath(String str) {
        MethodCollector.i(14083);
        if (!this.mValid) {
            MethodCollector.o(14083);
            return;
        }
        nativeSetMusicNodeFilePath(str);
        MethodCollector.o(14083);
    }

    @Override // com.ss.avframework.effect.IVideoEffectProcessor
    public int setSendContourInfoType(int i2) {
        MethodCollector.i(14428);
        if (!this.mValid) {
            MethodCollector.o(14428);
            return -1;
        }
        int nativeSetSendContourInfoType = nativeSetSendContourInfoType(i2);
        MethodCollector.o(14428);
        return nativeSetSendContourInfoType;
    }

    protected EffectWrapper(long j2) {
        this.mNativeObj = j2;
        this.mFromExtern = true;
        if (checkVersion()) {
            createEffectAudioSource(null);
        }
    }

    @Override // com.ss.avframework.effect.IVideoEffectProcessor
    public int setAudioRecognizeDict(Map<String, String[]> map) {
        String str;
        MethodCollector.i(13297);
        if (!this.mValid) {
            MethodCollector.o(13297);
            return 0;
        }
        String str2 = "";
        if (map != null) {
            String str3 = str2;
            for (Map.Entry<String, String[]> entry : map.entrySet()) {
                String[] value = entry.getValue();
                for (String str4 : value) {
                    StringBuilder append = new StringBuilder().append(str3);
                    if (str3.isEmpty()) {
                        str = str2;
                    } else {
                        str = ",";
                    }
                    str3 = append.append(str).append(entry.getKey()).append(":").append(str4).toString();
                }
            }
            str2 = str3;
        }
        int nativeSetAudioRecognizeDict = nativeSetAudioRecognizeDict(str2);
        MethodCollector.o(13297);
        return nativeSetAudioRecognizeDict;
    }

    public void onExpressionDetectResultCallback(int i2) {
        MethodCollector.i(14282);
        if (!this.mValid) {
            MethodCollector.o(14282);
            return;
        }
        if (this.mExpressionListener != null && i2 > 0) {
            TEBundle[] tEBundleArr = this.mExpressionTEBundles;
            int i3 = 0;
            if (tEBundleArr != null && tEBundleArr.length < i2) {
                for (TEBundle tEBundle : tEBundleArr) {
                    tEBundle.release();
                }
                this.mExpressionTEBundles = null;
            }
            if (this.mExpressionTEBundles == null) {
                this.mExpressionTEBundles = new TEBundle[i2];
                int i4 = 0;
                do {
                    this.mExpressionTEBundles[i4] = new TEBundle();
                    i4++;
                } while (i4 < i2);
            }
            if (!nativeGetExpressionDetectResult(this.mExpressionTEBundles, i2)) {
                MethodCollector.o(14282);
                return;
            }
            ExpressionBundleImpl[] expressionBundleImplArr = this.mExpressionBundles;
            if (expressionBundleImplArr == null || expressionBundleImplArr.length != i2) {
                this.mExpressionBundles = new ExpressionBundleImpl[i2];
                int i5 = 0;
                do {
                    this.mExpressionBundles[i5] = new ExpressionBundleImpl(this, null);
                    i5++;
                } while (i5 < i2);
                do {
                    this.mExpressionBundles[i3].age = (float) this.mExpressionTEBundles[i3].getDouble("age");
                    this.mExpressionBundles[i3].boy_prob = (float) this.mExpressionTEBundles[i3].getDouble("boy_prob");
                    this.mExpressionBundles[i3].attractive = (float) this.mExpressionTEBundles[i3].getDouble("attractive");
                    this.mExpressionBundles[i3].happy_score = (float) this.mExpressionTEBundles[i3].getDouble("happy_score");
                    this.mExpressionBundles[i3].exp_type = this.mExpressionTEBundles[i3].getInt("exp_type");
                    this.mExpressionBundles[i3].real_face_prob = (float) this.mExpressionTEBundles[i3].getDouble("real_face_prob");
                    this.mExpressionBundles[i3].quality = (float) this.mExpressionTEBundles[i3].getDouble("quality");
                    this.mExpressionBundles[i3].arousal = (float) this.mExpressionTEBundles[i3].getDouble("arousal");
                    this.mExpressionBundles[i3].valence = (float) this.mExpressionTEBundles[i3].getDouble("valence");
                    this.mExpressionBundles[i3].sad_score = (float) this.mExpressionTEBundles[i3].getDouble("sad_score");
                    this.mExpressionBundles[i3].angry_score = (float) this.mExpressionTEBundles[i3].getDouble("angry_score");
                    this.mExpressionBundles[i3].surprise_score = (float) this.mExpressionTEBundles[i3].getDouble("surprise_score");
                    this.mExpressionBundles[i3].mask_prob = (float) this.mExpressionTEBundles[i3].getDouble("mask_prob");
                    this.mExpressionBundles[i3].wear_hat_prob = (float) this.mExpressionTEBundles[i3].getDouble("wear_hat_prob");
                    this.mExpressionBundles[i3].mustache_prob = (float) this.mExpressionTEBundles[i3].getDouble("mustache_prob");
                    this.mExpressionBundles[i3].lipstick_prob = (float) this.mExpressionTEBundles[i3].getDouble("lipstick_prob");
                    this.mExpressionBundles[i3].wear_glass_prob = (float) this.mExpressionTEBundles[i3].getDouble("wear_glass_prob");
                    this.mExpressionBundles[i3].wear_sunglass_prob = (float) this.mExpressionTEBundles[i3].getDouble("wear_sunglass_prob");
                    this.mExpressionBundles[i3].blur_score = (float) this.mExpressionTEBundles[i3].getDouble("blur_score");
                    this.mExpressionBundles[i3].illumination = (float) this.mExpressionTEBundles[i3].getDouble("illumination");
                    i3++;
                } while (i3 < i2);
                try {
                    this.mExpressionListener.onExpressionDetectResultCallback(this.mExpressionBundles);
                    MethodCollector.o(14282);
                    return;
                } catch (Throwable th) {
                    AVLog.logToIODevice2(6, "EffectWrapper", "onExpressionDetectResultCallback exception. ", th, "EffectWrapper.onExpressionDetectResultCallback", 30000);
                }
            } else {
                do {
                    this.mExpressionBundles[i3].age = (float) this.mExpressionTEBundles[i3].getDouble("age");
                    this.mExpressionBundles[i3].boy_prob = (float) this.mExpressionTEBundles[i3].getDouble("boy_prob");
                    this.mExpressionBundles[i3].attractive = (float) this.mExpressionTEBundles[i3].getDouble("attractive");
                    this.mExpressionBundles[i3].happy_score = (float) this.mExpressionTEBundles[i3].getDouble("happy_score");
                    this.mExpressionBundles[i3].exp_type = this.mExpressionTEBundles[i3].getInt("exp_type");
                    this.mExpressionBundles[i3].real_face_prob = (float) this.mExpressionTEBundles[i3].getDouble("real_face_prob");
                    this.mExpressionBundles[i3].quality = (float) this.mExpressionTEBundles[i3].getDouble("quality");
                    this.mExpressionBundles[i3].arousal = (float) this.mExpressionTEBundles[i3].getDouble("arousal");
                    this.mExpressionBundles[i3].valence = (float) this.mExpressionTEBundles[i3].getDouble("valence");
                    this.mExpressionBundles[i3].sad_score = (float) this.mExpressionTEBundles[i3].getDouble("sad_score");
                    this.mExpressionBundles[i3].angry_score = (float) this.mExpressionTEBundles[i3].getDouble("angry_score");
                    this.mExpressionBundles[i3].surprise_score = (float) this.mExpressionTEBundles[i3].getDouble("surprise_score");
                    this.mExpressionBundles[i3].mask_prob = (float) this.mExpressionTEBundles[i3].getDouble("mask_prob");
                    this.mExpressionBundles[i3].wear_hat_prob = (float) this.mExpressionTEBundles[i3].getDouble("wear_hat_prob");
                    this.mExpressionBundles[i3].mustache_prob = (float) this.mExpressionTEBundles[i3].getDouble("mustache_prob");
                    this.mExpressionBundles[i3].lipstick_prob = (float) this.mExpressionTEBundles[i3].getDouble("lipstick_prob");
                    this.mExpressionBundles[i3].wear_glass_prob = (float) this.mExpressionTEBundles[i3].getDouble("wear_glass_prob");
                    this.mExpressionBundles[i3].wear_sunglass_prob = (float) this.mExpressionTEBundles[i3].getDouble("wear_sunglass_prob");
                    this.mExpressionBundles[i3].blur_score = (float) this.mExpressionTEBundles[i3].getDouble("blur_score");
                    this.mExpressionBundles[i3].illumination = (float) this.mExpressionTEBundles[i3].getDouble("illumination");
                    i3++;
                } while (i3 < i2);
                this.mExpressionListener.onExpressionDetectResultCallback(this.mExpressionBundles);
                MethodCollector.o(14282);
                return;
            }
        }
        MethodCollector.o(14282);
    }

    public void setParamsForEdgeRender(int i2, int i3) {
        this.mFrameRate = i2;
        this.mMaxKbps = i3;
    }

    private static <T> boolean CheckCount(T[] tArr, int i2) {
        int length;
        if (tArr == null) {
            length = 0;
        } else {
            length = tArr.length;
        }
        if (i2 == length) {
            return true;
        }
        return false;
    }

    public void getAlgorithmResult(AlgorithmResult algorithmResult, long j2) {
        MethodCollector.i(14324);
        algorithmResult.mFlags = nativeGetAlgorithmResult(algorithmResult, j2);
        MethodCollector.o(14324);
    }

    public int refreshAlgorithmRequirment(long j2, long j3) {
        MethodCollector.i(11409);
        int nativeRefreshAlgorithmRequirment = nativeRefreshAlgorithmRequirment(j2, j3);
        MethodCollector.o(11409);
        return nativeRefreshAlgorithmRequirment;
    }

    @Override // com.ss.avframework.effect.IVideoEffectProcessor
    public int composerSetMode(int i2, int i3) {
        MethodCollector.i(13370);
        if (!this.mValid) {
            MethodCollector.o(13370);
            return 0;
        }
        int nativeComposerSetMode = nativeComposerSetMode(i2, i3);
        MethodCollector.o(13370);
        return nativeComposerSetMode;
    }

    @Override // com.ss.avframework.effect.IVideoEffectProcessor
    public int enableFindContour(boolean z, String str) {
        MethodCollector.i(14043);
        if (!this.mValid) {
            MethodCollector.o(14043);
            return 0;
        }
        int nativeEnableFindContour = nativeEnableFindContour(z, str);
        MethodCollector.o(14043);
        return nativeEnableFindContour;
    }

    @Override // com.ss.avframework.effect.IVideoEffectProcessor
    public void processDoubleClickEvent(float f2, float f3) {
        MethodCollector.i(14372);
        if (!this.mValid) {
            MethodCollector.o(14372);
            return;
        }
        nativeProcessDoubleClickEvent(f2, f3);
        MethodCollector.o(14372);
    }

    @Override // com.ss.avframework.effect.IVideoEffectProcessor
    public void processLongPressEvent(float f2, float f3) {
        MethodCollector.i(14348);
        if (!this.mValid) {
            MethodCollector.o(14348);
            return;
        }
        nativeProcessLongPressEvent(f2, f3);
        MethodCollector.o(14348);
    }

    @Override // com.ss.avframework.effect.IVideoEffectProcessor
    public void processRotationEvent(float f2, float f3) {
        MethodCollector.i(14427);
        if (!this.mValid) {
            MethodCollector.o(14427);
            return;
        }
        nativeProcessRotationEvent(f2, f3);
        MethodCollector.o(14427);
    }

    @Override // com.ss.avframework.effect.IVideoEffectProcessor
    public void processScaleEvent(float f2, float f3) {
        MethodCollector.i(14409);
        if (!this.mValid) {
            MethodCollector.o(14409);
            return;
        }
        nativeProcessScaleEvent(f2, f3);
        MethodCollector.o(14409);
    }

    @Override // com.ss.avframework.effect.IVideoEffectProcessor
    public void processTouchEvent(float f2, float f3) {
        MethodCollector.i(13834);
        if (!this.mValid) {
            MethodCollector.o(13834);
            return;
        }
        nativeProcessTouchEvent(f2, f3);
        MethodCollector.o(13834);
    }

    @Override // com.ss.avframework.effect.IVideoEffectProcessor
    public int setCustomEffect(String str, String str2) {
        MethodCollector.i(12730);
        if (!this.mValid) {
            MethodCollector.o(12730);
            return 0;
        }
        int nativeRenderCacheTexture = nativeRenderCacheTexture(NonNull(str), NonNull(str2));
        MethodCollector.o(12730);
        return nativeRenderCacheTexture;
    }

    @Override // com.ss.avframework.effect.IVideoEffectProcessor
    public int setCustomEffectBitmap(String str, Bitmap bitmap) {
        MethodCollector.i(12850);
        if (!this.mValid) {
            MethodCollector.o(12850);
            return 0;
        }
        int nativeRenderCacheBitmap = nativeRenderCacheBitmap(NonNull(str), bitmap);
        MethodCollector.o(12850);
        return nativeRenderCacheBitmap;
    }

    @Override // com.ss.avframework.effect.IVideoEffectProcessor
    public int setCustomEffectOrientation(String str, int i2) {
        MethodCollector.i(12851);
        if (!this.mValid) {
            MethodCollector.o(12851);
            return 0;
        }
        int nativeSetCustomEffectOrientation = nativeSetCustomEffectOrientation(NonNull(str), i2);
        MethodCollector.o(12851);
        return nativeSetCustomEffectOrientation;
    }

    @Override // com.ss.avframework.effect.IVideoEffectProcessor
    public int setFilter(String str, float f2) {
        MethodCollector.i(12949);
        if (!this.mValid) {
            MethodCollector.o(12949);
            return 0;
        }
        int nativeSetFilter = nativeSetFilter(NonNull(str), f2, false);
        MethodCollector.o(12949);
        return nativeSetFilter;
    }

    @Override // com.ss.avframework.effect.IVideoEffectProcessor
    public void setRenderCacheString(String str, String str2) {
        MethodCollector.i(14392);
        if (!this.mValid) {
            MethodCollector.o(14392);
            return;
        }
        nativeRenderCacheString(NonNull(str), NonNull(str2));
        MethodCollector.o(14392);
    }

    public static void onEdgeRenderLog(String str, String str2) {
        IEffectEdgeRenderLoga iEffectEdgeRenderLoga = mEffectEdgeLog;
        if (iEffectEdgeRenderLoga == null) {
            return;
        }
        if (str.equals("live_webrtc_monitor_log")) {
            iEffectEdgeRenderLoga.onEdgeRenderLog(str, str2);
            return;
        }
        try {
            JSONObject jSONObject = new JSONObject(str2);
            try {
                jSONObject.put("server", str);
                jSONObject.put("mode", "effect");
                iEffectEdgeRenderLoga.onEdgeRenderLog("live_client_monitor_log", jSONObject.toString());
            } catch (Exception unused) {
            }
        } catch (Exception unused2) {
            AVLog.ioe("EffectWrapper", "exception occurs when change effect log to jsonObject: ".concat(String.valueOf(str2)));
        }
    }

    @Override // com.ss.avframework.effect.IVideoEffectProcessor
    public int composerAppendNodes(String[] strArr, int i2) {
        MethodCollector.i(13454);
        if (!this.mValid) {
            MethodCollector.o(13454);
            return 0;
        } else if (!CheckCount(strArr, i2)) {
            MethodCollector.o(13454);
            return -1;
        } else {
            int nativeComposerAppendNodes = nativeComposerAppendNodes(strArr, i2);
            MethodCollector.o(13454);
            return nativeComposerAppendNodes;
        }
    }

    @Override // com.ss.avframework.effect.IVideoEffectProcessor
    public int composerReloadNodes(String[] strArr, int i2) {
        MethodCollector.i(13452);
        if (!this.mValid) {
            MethodCollector.o(13452);
            return 0;
        } else if (!CheckCount(strArr, i2)) {
            MethodCollector.o(13452);
            return -1;
        } else {
            int nativeComposerReloadNodes = nativeComposerReloadNodes(strArr, i2);
            MethodCollector.o(13452);
            return nativeComposerReloadNodes;
        }
    }

    @Override // com.ss.avframework.effect.IVideoEffectProcessor
    public int composerRemoveNodes(String[] strArr, int i2) {
        MethodCollector.i(13458);
        if (!this.mValid) {
            MethodCollector.o(13458);
            return 0;
        } else if (!CheckCount(strArr, i2)) {
            MethodCollector.o(13458);
            return -1;
        } else {
            int nativeComposerRemoveNodes = nativeComposerRemoveNodes(strArr, i2);
            MethodCollector.o(13458);
            return nativeComposerRemoveNodes;
        }
    }

    @Override // com.ss.avframework.effect.IVideoEffectProcessor
    public int composerSetNodes(String[] strArr, int i2) {
        MethodCollector.i(13371);
        if (!this.mValid) {
            MethodCollector.o(13371);
            return 0;
        } else if (!CheckCount(strArr, i2)) {
            MethodCollector.o(13371);
            return -1;
        } else {
            int nativeComposerSetNodes = nativeComposerSetNodes(strArr, i2);
            MethodCollector.o(13371);
            return nativeComposerSetNodes;
        }
    }

    public EffectWrapper(AudioDeviceModule audioDeviceModule, boolean z) {
        MethodCollector.i(11079);
        if (checkVersion()) {
            if (audioDeviceModule != null) {
                AudioDeviceModule.AudioRenderSink createRenderSink = audioDeviceModule.createRenderSink();
                this.mAudioRenderSink = createRenderSink;
                createRenderSink.setQuirks(0);
            }
            nativeCreateEffectWrapper(audioDeviceModule, this.mAudioRenderSink, z);
        }
        this.mFromExtern = false;
        MethodCollector.o(11079);
    }

    @Override // com.ss.avframework.effect.IVideoEffectProcessor
    public int setEffectABInfo(JSONObject jSONObject, String str) {
        String str2;
        MethodCollector.i(14373);
        try {
            JSONArray jSONArray = new JSONArray(EffectABConfig.requestABInfoWithLicense(str));
            for (int i2 = 0; i2 < jSONArray.length(); i2++) {
                JSONObject jSONObject2 = jSONArray.getJSONObject(i2);
                String string = jSONObject2.getString("key");
                if (jSONObject.has(string)) {
                    int i3 = jSONObject2.getInt("dataType");
                    if (i3 == 0) {
                        int nativeConfigABBooleanValue = nativeConfigABBooleanValue(string, jSONObject.getBoolean(string));
                        IVideoEffectProcessor.IEffectInfoChangeListener iEffectInfoChangeListener = this.mIEffectInfoChangeListener;
                        if (iEffectInfoChangeListener != null) {
                            if (jSONObject.getBoolean(string)) {
                                str2 = "TRUE";
                            } else {
                                str2 = "FALSE";
                            }
                            iEffectInfoChangeListener.onEffectInfoChange(string, str2, 0, nativeConfigABBooleanValue);
                        }
                    } else if (i3 == 1) {
                        int i4 = jSONObject.getInt(string);
                        int nativeConfigABIntValue = nativeConfigABIntValue(string, i4);
                        IVideoEffectProcessor.IEffectInfoChangeListener iEffectInfoChangeListener2 = this.mIEffectInfoChangeListener;
                        if (iEffectInfoChangeListener2 != null) {
                            iEffectInfoChangeListener2.onEffectInfoChange(string, String.valueOf(i4), 1, nativeConfigABIntValue);
                        }
                    } else if (i3 == 2) {
                        float f2 = (float) jSONObject.getDouble(string);
                        int nativeConfigABFloatValue = nativeConfigABFloatValue(string, f2);
                        IVideoEffectProcessor.IEffectInfoChangeListener iEffectInfoChangeListener3 = this.mIEffectInfoChangeListener;
                        if (iEffectInfoChangeListener3 != null) {
                            iEffectInfoChangeListener3.onEffectInfoChange(string, String.valueOf(f2), 2, nativeConfigABFloatValue);
                        }
                    } else if (i3 == 3) {
                        String string2 = jSONObject.getString(string);
                        int nativeConfigABStringValue = nativeConfigABStringValue(string, string2);
                        IVideoEffectProcessor.IEffectInfoChangeListener iEffectInfoChangeListener4 = this.mIEffectInfoChangeListener;
                        if (iEffectInfoChangeListener4 != null) {
                            iEffectInfoChangeListener4.onEffectInfoChange(string, string2, 3, nativeConfigABStringValue);
                        }
                    }
                }
            }
            MethodCollector.o(14373);
            return 0;
        } catch (JSONException unused) {
            MethodCollector.o(14373);
            return -1;
        }
    }

    @Override // com.ss.avframework.effect.IVideoEffectProcessor
    public int composerCheckNodeExclusion(String str, String str2, int[] iArr) {
        MethodCollector.i(13596);
        if (!this.mValid) {
            MethodCollector.o(13596);
            return 0;
        }
        int nativeComposerCheckNodeExclusion = nativeComposerCheckNodeExclusion(str, str2, iArr);
        MethodCollector.o(13596);
        return nativeComposerCheckNodeExclusion;
    }

    @Override // com.ss.avframework.effect.IVideoEffectProcessor
    public int composerUpdateNode(String str, String str2, float f2) {
        MethodCollector.i(13372);
        if (!this.mValid) {
            MethodCollector.o(13372);
            return 0;
        }
        int nativeComposerUpdateNode = nativeComposerUpdateNode(NonNull(str), NonNull(str2), f2);
        MethodCollector.o(13372);
        return nativeComposerUpdateNode;
    }

    @Override // com.ss.avframework.effect.IVideoEffectProcessor
    public void processTouchDownEvent(float f2, float f3, int i2) {
        MethodCollector.i(14389);
        if (!this.mValid) {
            MethodCollector.o(14389);
            return;
        }
        nativeProcessTouchDownEvent(f2, f3, i2);
        MethodCollector.o(14389);
    }

    @Override // com.ss.avframework.effect.IVideoEffectProcessor
    public void processTouchUpEvent(float f2, float f3, int i2) {
        MethodCollector.i(14408);
        if (!this.mValid) {
            MethodCollector.o(14408);
            return;
        }
        nativeProcessTouchUpEvent(f2, f3, i2);
        MethodCollector.o(14408);
    }

    @Override // com.ss.avframework.effect.IVideoEffectProcessor
    public int setBeautify(String str, float f2, float f3) {
        MethodCollector.i(12216);
        if (!this.mValid) {
            MethodCollector.o(12216);
            return 0;
        }
        int nativeSetBeautify = nativeSetBeautify(NonNull(str), f2, f3);
        MethodCollector.o(12216);
        return nativeSetBeautify;
    }

    @Override // com.ss.avframework.effect.IVideoEffectProcessor
    public int setReshape(String str, float f2, float f3) {
        MethodCollector.i(12502);
        if (!this.mValid) {
            MethodCollector.o(12502);
            return 0;
        }
        int nativeSetReshape = nativeSetReshape(NonNull(str), f2, f3);
        MethodCollector.o(12502);
        return nativeSetReshape;
    }

    @Override // com.ss.avframework.effect.IVideoEffectProcessor
    public int composerAppendNodesWithTags(String[] strArr, int i2, String[] strArr2) {
        MethodCollector.i(13461);
        if (!this.mValid) {
            MethodCollector.o(13461);
            return 0;
        } else if (!CheckCount(strArr, i2) || !CheckCount(strArr2, i2)) {
            MethodCollector.o(13461);
            return -1;
        } else {
            int nativeComposerAppendNodesWithTags = nativeComposerAppendNodesWithTags(strArr, i2, strArr2);
            MethodCollector.o(13461);
            return nativeComposerAppendNodesWithTags;
        }
    }

    @Override // com.ss.avframework.effect.IVideoEffectProcessor
    public int composerReloadNodesWithTags(String[] strArr, int i2, String[] strArr2) {
        MethodCollector.i(13460);
        if (!this.mValid) {
            MethodCollector.o(13460);
            return 0;
        } else if (!CheckCount(strArr, i2) || !CheckCount(strArr2, i2)) {
            MethodCollector.o(13460);
            return -1;
        } else {
            int nativeComposerReloadNodesWithTags = nativeComposerReloadNodesWithTags(strArr, i2, strArr2);
            MethodCollector.o(13460);
            return nativeComposerReloadNodesWithTags;
        }
    }

    @Override // com.ss.avframework.effect.IVideoEffectProcessor
    public int composerSetNodesWithTags(String[] strArr, int i2, String[] strArr2) {
        MethodCollector.i(13459);
        if (!this.mValid) {
            MethodCollector.o(13459);
            return 0;
        } else if (!CheckCount(strArr, i2) || !CheckCount(strArr2, i2)) {
            MethodCollector.o(13459);
            return -1;
        } else {
            int nativeComposerSetNodesWithTags = nativeComposerSetNodesWithTags(strArr, i2, strArr2);
            MethodCollector.o(13459);
            return nativeComposerSetNodesWithTags;
        }
    }

    @Override // com.ss.avframework.effect.IVideoEffectProcessor
    public int setFilter(String str, float f2, boolean z) {
        MethodCollector.i(12950);
        if (!this.mValid) {
            MethodCollector.o(12950);
            return 0;
        }
        int nativeSetFilter = nativeSetFilter(NonNull(str), f2, z);
        MethodCollector.o(12950);
        return nativeSetFilter;
    }

    public int onReceiveEffectMessage(int i2, int i3, int i4, String str) {
        if (!this.mValid) {
            return -1;
        }
        return 0;
    }

    @Override // com.ss.avframework.effect.IVideoEffectProcessor
    public void setDoubleViewRect(double d2, double d3, double d4, double d5) {
        MethodCollector.i(13737);
        if (this.mValid) {
            nativeSetDoubleViewRect(d2, d3, d4, d5);
        }
        MethodCollector.o(13737);
    }

    @Override // com.ss.avframework.effect.IVideoEffectProcessor
    public int composerExclusionCompare(String str, String str2, String str3, int[] iArr) {
        MethodCollector.i(13597);
        if (!this.mValid) {
            MethodCollector.o(13597);
            return 0;
        }
        int nativeComposerExclusionCompare = nativeComposerExclusionCompare(str, str2, str3, iArr);
        MethodCollector.o(13597);
        return nativeComposerExclusionCompare;
    }

    @Override // com.ss.avframework.effect.IVideoEffectProcessor
    public int sendEffectMsg(int i2, int i3, int i4, String str) {
        MethodCollector.i(13982);
        if (!this.mValid) {
            MethodCollector.o(13982);
            return 0;
        }
        int nativeSendEffectMsg = nativeSendEffectMsg(i2, i3, i4, NonNull(str));
        MethodCollector.o(13982);
        return nativeSendEffectMsg;
    }

    @Override // com.ss.avframework.effect.IVideoEffectProcessor
    public int startAudioRecognize(ByteBuffer byteBuffer, int i2, int i3, int i4) {
        MethodCollector.i(13222);
        if (!this.mValid) {
            MethodCollector.o(13222);
            return 0;
        }
        int nativeStartAudioRecognize = nativeStartAudioRecognize(byteBuffer, i2, i3, i4);
        MethodCollector.o(13222);
        return nativeStartAudioRecognize;
    }

    @Override // com.ss.avframework.effect.IVideoEffectProcessor
    public int setBeautify(String str, float f2, float f3, float f4) {
        MethodCollector.i(12360);
        if (!this.mValid) {
            MethodCollector.o(12360);
            return 0;
        }
        int nativeSetBeautifyWithSharp = nativeSetBeautifyWithSharp(NonNull(str), f2, f3, f4);
        MethodCollector.o(12360);
        return nativeSetBeautifyWithSharp;
    }

    public int processStrangeVoice(Buffer buffer, int i2, int i3, int i4, long j2) {
        MethodCollector.i(10241);
        int nativeAudioStrangeVoiceProcess = nativeAudioStrangeVoiceProcess(buffer, i2, i3, i4, j2);
        MethodCollector.o(10241);
        return nativeAudioStrangeVoiceProcess;
    }

    @Override // com.ss.avframework.effect.IVideoEffectProcessor
    public void processPanEvent(float f2, float f3, float f4, float f5, float f6) {
        MethodCollector.i(14316);
        if (!this.mValid) {
            MethodCollector.o(14316);
            return;
        }
        nativeProcessPanEvent(f2, f3, f4, f5, f6);
        MethodCollector.o(14316);
    }

    @Override // com.ss.avframework.effect.IVideoEffectProcessor
    public int composerReplaceNodesWithTags(String[] strArr, int i2, String[] strArr2, int i3, String[] strArr3) {
        MethodCollector.i(13532);
        if (!this.mValid) {
            MethodCollector.o(13532);
            return 0;
        } else if (!CheckCount(strArr, i2) || !CheckCount(strArr2, i3) || !CheckCount(strArr3, i3)) {
            MethodCollector.o(13532);
            return -1;
        } else {
            int nativeComposerReplaceNodesWithTags = nativeComposerReplaceNodesWithTags(strArr, i2, strArr2, i3, strArr3);
            MethodCollector.o(13532);
            return nativeComposerReplaceNodesWithTags;
        }
    }

    @Override // com.ss.avframework.effect.IVideoEffectProcessor
    public int setFilter(String str, String str2, float f2, float f3, float f4) {
        MethodCollector.i(13047);
        if (!this.mValid) {
            MethodCollector.o(13047);
            return 0;
        }
        int nativeSetTwoFilters = nativeSetTwoFilters(NonNull(str), NonNull(str2), f4, f2, f3, false);
        MethodCollector.o(13047);
        return nativeSetTwoFilters;
    }

    @Override // com.ss.avframework.effect.IVideoEffectProcessor
    public void enableExpressionDetect(boolean z, boolean z2, boolean z3, boolean z4, boolean z5, boolean z6) {
        MethodCollector.i(14153);
        if (!this.mValid) {
            MethodCollector.o(14153);
            return;
        }
        nativeEnableExpressionDetect(z, z2, z3, z4, z5, z6);
        MethodCollector.o(14153);
    }

    public int process(int i2, int i3, int i4, int i5, long j2, boolean z) {
        MethodCollector.i(14155);
        if (!this.mValid) {
            MethodCollector.o(14155);
            return 0;
        }
        int nativeProcess = nativeProcess(i2, i3, i4, i5, j2, null, null, z, 0, 0);
        MethodCollector.o(14155);
        return nativeProcess;
    }

    @Override // com.ss.avframework.effect.IVideoEffectProcessor
    public int setFilter(String str, String str2, float f2, float f3, float f4, boolean z) {
        MethodCollector.i(13048);
        if (!this.mValid) {
            MethodCollector.o(13048);
            return 0;
        }
        int nativeSetTwoFilters = nativeSetTwoFilters(NonNull(str), NonNull(str2), f4, f2, f3, z);
        MethodCollector.o(13048);
        return nativeSetTwoFilters;
    }

    @Override // com.ss.avframework.effect.IVideoEffectProcessor
    public void processTouchEventWithTouchType(long j2, float f2, float f3, float f4, float f5, int i2, int i3) {
        MethodCollector.i(13840);
        if (!this.mValid) {
            MethodCollector.o(13840);
            return;
        }
        nativeProcessTouchEventWithTouchType(j2, f2, f3, f4, f5, i2, i3);
        MethodCollector.o(13840);
    }

    @Override // com.ss.avframework.effect.IVideoEffectProcessor
    public void configEffect(int i2, int i3, String str, String str2, boolean z, boolean z2, String str3) {
        MethodCollector.i(11406);
        if (!this.mValid) {
            MethodCollector.o(11406);
            return;
        }
        nativeConfigEffect(i2, i3, NonNull(str), NonNull(str2), z, z2, NonNull(str3));
        MethodCollector.o(11406);
    }

    @Override // com.ss.avframework.effect.IVideoEffectProcessor
    public int process(int i2, int i3, int i4, int i5, int i6, long j2, boolean z) {
        MethodCollector.i(14222);
        if (!this.mValid) {
            MethodCollector.o(14222);
            return 0;
        }
        int nativeProcess = nativeProcess(i2, i3, i4, i5, j2, null, null, z, i6, 0);
        MethodCollector.o(14222);
        return nativeProcess;
    }

    public int process(int i2, int i3, int i4, int i5, long j2, boolean z, long j3) {
        MethodCollector.i(14193);
        if (!this.mValid) {
            MethodCollector.o(14193);
            return 0;
        }
        int nativeProcess = nativeProcess(i2, i3, i4, i5, j2, null, null, z, 0, 0);
        MethodCollector.o(14193);
        return nativeProcess;
    }

    @Override // com.ss.avframework.effect.IVideoEffectProcessor
    public int process(int i2, int i3, int i4, int i5, int i6, RoiInfo roiInfo, long j2, boolean z, long j3) {
        MethodCollector.i(14250);
        if (!this.mValid) {
            MethodCollector.o(14250);
            return 0;
        }
        int nativeProcess = nativeProcess(i2, i3, i4, i5, j2, null, roiInfo, z, i6, j3);
        MethodCollector.o(14250);
        return nativeProcess;
    }
}
