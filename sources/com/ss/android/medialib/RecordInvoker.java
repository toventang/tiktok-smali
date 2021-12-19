package com.ss.android.medialib;

import android.content.Context;
import android.content.pm.PackageManager;
import android.content.res.AssetManager;
import android.graphics.Bitmap;
import android.opengl.EGLContext;
import android.os.Build;
import android.text.TextUtils;
import android.util.Pair;
import android.view.Surface;
import com.bef.effectsdk.message.MessageCenter;
import com.bytedance.covode.number.Covode;
import com.bytedance.frameworks.apm.trace.MethodCollector;
import com.ss.android.medialib.a;
import com.ss.android.medialib.b.a;
import com.ss.android.medialib.camera.ImageFrame;
import com.ss.android.medialib.listener.AudioManagerCallback;
import com.ss.android.medialib.listener.DistortionInfoCallback;
import com.ss.android.medialib.listener.SmallWindowSnapshotListener;
import com.ss.android.medialib.listener.d;
import com.ss.android.medialib.model.EnigmaResult;
import com.ss.android.medialib.model.FaceAttributeInfo;
import com.ss.android.medialib.model.FaceDetectInfo;
import com.ss.android.medialib.model.SceneDetectInfo;
import com.ss.android.medialib.model.SkeletonInfo;
import com.ss.android.medialib.presenter.IStickerRequestCallback;
import com.ss.android.medialib.presenter.g;
import com.ss.android.medialib.qr.ScanSettings;
import com.ss.android.medialib.style.StyleActionListener;
import com.ss.android.medialib.style.StylePathConvertCallback;
import com.ss.android.ttve.monitor.h;
import com.ss.android.vesdk.LandMarkFrame;
import com.ss.android.vesdk.VEARCoreParam;
import com.ss.android.vesdk.VEDebugSettings;
import com.ss.android.vesdk.VEEffectParams;
import com.ss.android.vesdk.VESafeAreaParams;
import com.ss.android.vesdk.af;
import com.ss.android.vesdk.al;
import com.ss.android.vesdk.an;
import com.ss.android.vesdk.bh;
import com.ss.android.vesdk.lens.VEAdaptiveSharpenParams;
import com.ss.android.vesdk.lens.VEBaseRecorderLensParams;
import com.ss.android.vesdk.lens.VELumaDetectParams;
import com.ss.android.vesdk.lens.VETaintSceneDetectParams;
import com.ss.android.vesdk.model.BefTextLayout;
import com.ss.android.vesdk.model.BefTextLayoutResult;
import com.ss.android.vesdk.runtime.VEMapBufferInfo;
import com.ss.android.vesdk.u;
import java.lang.ref.WeakReference;
import java.lang.reflect.Array;
import java.nio.ByteBuffer;
import java.nio.ByteOrder;
import java.util.ArrayList;
import java.util.List;
import java.util.UUID;
import org.json.JSONException;
import org.json.JSONObject;

public class RecordInvoker implements MessageCenter.Listener {
    private static a mRecordStopCallback;
    private static Runnable sDuetCompleteRunable = null;
    private static com.ss.android.medialib.listener.a sFaceDetectListener;
    private static MessageCenter.Listener sMessageListener;
    private static com.ss.android.medialib.listener.b sNativeInitListener;
    private static List<com.ss.android.medialib.listener.c> sSlamDetectListeners = new ArrayList();
    public a mAVCEncoder;
    private b mAVCEncoderInterface;
    private Runnable mDuetCompleteRunable;
    private b mEncoderCaller;
    private com.ss.android.medialib.listener.a mFaceDetectListener;
    private a.AbstractC1301a mGetTimestampCallback;
    public long mHandler;
    private boolean mIsDuringScreenshot;
    private boolean mIsRenderReady;
    private List<al> mLandmarkDetectListeners = new ArrayList();
    private MessageCenter.Listener mMessageListener;
    private com.ss.android.medialib.listener.b mNativeInitListener;
    private a.b mOpenGLCallback;
    private a.c mShotScreenCallback;
    private List<com.ss.android.medialib.listener.c> mSlamDetectListeners = new ArrayList();
    public b mStyleAudioProxyImpl;
    private c mStyleProxyImpl;
    private d mTextureTimeListener;
    g.a onDuetProcessListener;
    g.b onVideoEOFListener;

    public interface EffectAlgorithmCallback {
        static {
            Covode.recordClassIndex(36833);
        }

        void onResult(int[] iArr, long[] jArr, float f2);
    }

    public interface FaceResultCallback {
        static {
            Covode.recordClassIndex(36834);
        }

        void onResult(FaceAttributeInfo faceAttributeInfo, FaceDetectInfo faceDetectInfo);
    }

    public interface OnARTextBitmapCallback {
        static {
            Covode.recordClassIndex(36835);
        }

        BefTextLayoutResult onResult(String str, BefTextLayout befTextLayout);
    }

    public interface OnARTextContentCallback {
        static {
            Covode.recordClassIndex(36836);
        }

        void onResult(String[] strArr);
    }

    public interface OnARTextCountCallback {
        static {
            Covode.recordClassIndex(36837);
        }

        void onResult(int i2);
    }

    public interface OnCherEffectParmaCallback {
        static {
            Covode.recordClassIndex(36838);
        }

        void onCherEffect(String[] strArr, double[] dArr, boolean[] zArr);
    }

    public interface OnFrameCallback {
        static {
            Covode.recordClassIndex(36839);
        }

        void onFrame(int i2, double d2);

        void onFrame(ByteBuffer byteBuffer, int i2, int i3, int i4, double d2);

        void onInit(EGLContext eGLContext, int i2, int i3, int i4, long j2);
    }

    public interface OnHandDetectCallback {
        static {
            Covode.recordClassIndex(36840);
        }

        void onResult(int[] iArr);
    }

    public interface OnLensResultCallback {
        static {
            Covode.recordClassIndex(36841);
        }

        void onError(int i2, int i3, String str);

        void onInfo(int i2, int i3, int i4, String str);

        void onSuccess(int i2, float f2, int i3);
    }

    public interface OnPictureCallback {
        static {
            Covode.recordClassIndex(36842);
        }

        void onResult(int[] iArr, int i2, int i3);
    }

    public interface OnPictureCallbackV2 {
        static {
            Covode.recordClassIndex(36843);
        }

        void onImage(int[] iArr, int i2, int i3);

        void onResult(int i2, int i3);
    }

    public interface OnPreviewRadioListener {
        static {
            Covode.recordClassIndex(36844);
        }

        void onInfo(int i2, int i3);
    }

    public interface OnRunningErrorCallback {
        static {
            Covode.recordClassIndex(36845);
        }

        void onAccurateInfo(int i2, double d2);

        void onError(int i2);

        void onInfo(int i2, int i3);
    }

    public interface OnSceneDetectCallback {
        static {
            Covode.recordClassIndex(36846);
        }

        void onResult(SceneDetectInfo sceneDetectInfo);
    }

    public interface OnSkeletonDetectCallback {
        static {
            Covode.recordClassIndex(36847);
        }

        void onResult(SkeletonInfo skeletonInfo);
    }

    public interface OnSmartBeautyCallback {
        static {
            Covode.recordClassIndex(36848);
        }

        void onResult(com.ss.android.medialib.model.b bVar);
    }

    public interface a {
        static {
            Covode.recordClassIndex(36849);
        }

        void a();
    }

    public static class b implements com.ss.android.medialib.style.a {

        /* renamed from: a  reason: collision with root package name */
        public long f59647a = -1;

        /* renamed from: b  reason: collision with root package name */
        long f59648b = -1;

        /* renamed from: c  reason: collision with root package name */
        public String f59649c = "";

        /* renamed from: d  reason: collision with root package name */
        WeakReference<RecordInvoker> f59650d;

        static {
            Covode.recordClassIndex(36850);
        }
    }

    public static class c implements com.ss.android.medialib.style.b {

        /* renamed from: a  reason: collision with root package name */
        long f59651a = -1;

        /* renamed from: b  reason: collision with root package name */
        WeakReference<RecordInvoker> f59652b;

        static {
            Covode.recordClassIndex(36851);
        }
    }

    private native int nativeAddMetadata(long j2, String str, String str2);

    private native int nativeAddPCMData(long j2, byte[] bArr, int i2, long j3);

    private native int nativeAddPipRenderTargetSurface(long j2, Surface surface, int i2, int i3, Bitmap bitmap, boolean z);

    private native int nativeAddTrack(long j2, int i2, String str, long j3, long j4);

    private native int nativeAnimateImagesToPreview(long j2, String[] strArr, ByteBuffer[] byteBufferArr, int[] iArr, int[] iArr2);

    private native int nativeBindEffectAudioProcessor(long j2, int i2, int i3, boolean z);

    private native void nativeCancelAll(long j2);

    private native int nativeChangeDuetVideo(long j2, String str, String str2);

    private native int nativeChangeMusicPath(long j2, String str);

    private native void nativeChangeOutputVideoSize(long j2, int i2, int i3);

    private native void nativeChangePreviewRadioMode(long j2, int i2);

    private native int nativeChangeSurface(long j2, Surface surface);

    private native int[] nativeCheckComposerNodeExclusion(long j2, String str, String str2, String str3);

    private native void nativeChooseAreaFromRatio34(long j2, float f2);

    private native void nativeChooseSlamFace(long j2, int i2);

    private native int nativeClearFragFile(long j2);

    private native int nativeCloseWavFile(long j2, boolean z);

    private native int nativeConcat(long j2, String str, String str2, int i2, String str3, String str4, boolean z, int i3);

    private native long nativeConfigStyleResourceFinder(long j2, AssetManager assetManager);

    private native long nativeCreate();

    private native int nativeDeleteLastFrag(long j2);

    private native void nativeDisableRender(long j2, boolean z);

    private native void nativeEnableAbandonFirstFrame(long j2, boolean z);

    private native int nativeEnableAudio(long j2, int i2);

    private native void nativeEnableAudioAlgorithmParam(long j2, boolean z, String str, String str2);

    private native void nativeEnableAudioLoudnessBalanceFilter(long j2, boolean z, double d2);

    private native int nativeEnableAudioPlayerFromVE(long j2, int i2);

    private native int nativeEnableAutoTestLog(long j2, boolean z);

    private native void nativeEnableBachAlgorithm(long j2, boolean z, String str, String str2);

    private native void nativeEnableEffect(long j2, boolean z);

    private native void nativeEnableEffectBGM(long j2, boolean z);

    private native void nativeEnableFaceBeautifyDetect(long j2, int i2);

    private native void nativeEnableFaceExtInfo(int i2);

    private native void nativeEnableLandMark(long j2, boolean z);

    private native void nativeEnableLensProcess(long j2, int i2, boolean z);

    private native void nativeEnablePBO(boolean z);

    private native void nativeEnablePictureTestMode(long j2, boolean z);

    private native void nativeEnablePreloadEffectResource(long j2, boolean z);

    private native void nativeEnableRecordBGMToMp4(long j2, boolean z);

    private native int nativeEnableRecordFlip(long j2, int i2);

    private native void nativeEnableRecordingMp4(long j2, boolean z);

    private native void nativeEnableScan(long j2, boolean z, long j3);

    private native void nativeEnableSceneRecognition(long j2, boolean z);

    private native void nativeEnableShotScreenUseOesTexture(long j2, boolean z);

    private native void nativeEnableSkeletonDetect(long j2, boolean z);

    private native void nativeEnableSmartBeauty(long j2, boolean z);

    private native void nativeEnableStickerRecognition(long j2, boolean z);

    private native int nativeEnableTimestampCallback(long j2, boolean z);

    private native void nativeEnableUse16BitAlign(long j2, boolean z);

    private native void nativeEnableWaterMark(long j2, boolean z);

    private native int nativeExpandPreviewAndRecordInterval(long j2, boolean z);

    private native int nativeFetchDistortionInfo(long j2, DistortionInfoCallback distortionInfoCallback);

    private native long nativeGetAudioEndTime(long j2);

    private native long nativeGetEndFrameTime(long j2);

    private native EnigmaResult nativeGetEnigmaResult(long j2);

    private native float nativeGetFilterIntensity(long j2, String str);

    private native String[] nativeGetFragVideoPaths(long j2);

    private native long nativeGetLastAudioLength(long j2);

    private native int nativeGetLastRecordFrameNum(long j2);

    private native int nativeGetPreviewRenderRect(long j2, int[] iArr);

    private native float nativeGetReactionCamRotation(long j2);

    private native int[] nativeGetReactionCameraPosInRecordPixel(long j2);

    private native int[] nativeGetReactionCameraPosInViewPixel(long j2);

    private native int[] nativeGetReactionPosMarginInViewPixel(long j2);

    private native String nativeGetResourceMultiViewTag(long j2, String str);

    private native void nativeGetSequencePreviewFrame(long j2, int i2, int i3, boolean z, int i4, String str);

    private native int nativeGetSlamFaceCount(long j2);

    private native int nativeGetSmallWindowSnapshot(long j2, int i2, int i3, Bitmap bitmap, SmallWindowSnapshotListener smallWindowSnapshotListener);

    private native void nativeHandleEffectAudio(long j2, boolean z, long j3);

    private native int nativeHideSlamKeyBoard(long j2, boolean z);

    private native int nativeInitAudioConfig(long j2, int i2, int i3, int i4, int i5, int i6);

    private native int nativeInitAudioPlayer(long j2, String str, int i2, int i3, long j3, boolean z, boolean z2, int i4);

    private native int nativeInitBeautyPlay(long j2, int i2, int i3, String str, int i4, int i5, String str2, int i6, boolean z, boolean z2, boolean z3, boolean z4);

    private native int nativeInitBeautyPlayOnlyPreview(long j2, ScanSettings scanSettings);

    private native int nativeInitDuet(long j2, String str, float f2, float f3, float f4, boolean z, boolean z2, int i2);

    private native void nativeInitFaceBeautifyDetectExtParam(long j2, boolean z, boolean z2, boolean z3);

    private native void nativeInitFaceBeautyDetectExtParam(long j2, boolean z);

    private native void nativeInitFaceDetectExtParam(long j2, int i2, boolean z, boolean z2);

    private native void nativeInitHDRNetDetectExtParam(long j2, boolean z, String str);

    private native void nativeInitHandDetectExtParam(long j2, int i2, int i3, int i4);

    private native int nativeInitImageDrawer(long j2, int i2);

    private native int nativeInitMediaCodecSurface(long j2, Surface surface);

    private native int nativeInitReaction(long j2, String str);

    private native int nativeInitWavFile(long j2, int i2, int i3, double d2);

    private native boolean nativeIsQualcomm(long j2);

    private native boolean nativeIsSmallWinCameraRender(long j2);

    private native boolean nativeIsStickerEnabled(long j2);

    private native int nativeMarkPlayDone(long j2);

    private native int nativeOnAudioCallback(long j2, byte[] bArr, int i2);

    private native int nativeOnDrawFrameBuffer(long j2, byte[] bArr, int i2, int i3, int i4, boolean z);

    private native int nativeOnDrawFrameBuffer2(long j2, ByteBuffer byteBuffer, int[] iArr, ByteBuffer byteBuffer2, int[] iArr2, ByteBuffer byteBuffer3, int[] iArr3, int i2, int i3, int i4, boolean z);

    private native int nativeOnDrawFrameBuffer3(long j2, byte[] bArr, int i2, int i3, int i4, int i5, boolean z);

    private native int nativeOnDrawFrameBuffer4(long j2, ByteBuffer byteBuffer, int[] iArr, ByteBuffer byteBuffer2, int[] iArr2, ByteBuffer byteBuffer3, int[] iArr3, int i2, int i3, int i4, int i5, boolean z);

    private native int nativeOnFrameAvailable(long j2, int i2, float[] fArr, boolean z);

    private native int nativeOnFrameTime(long j2, double d2);

    private native int nativePauseEffectAudio(long j2, boolean z);

    private native int nativePauseRender(long j2);

    private native boolean nativePosInReactionRegion(long j2, int i2, int i3);

    private native int nativePostDuetAction(long j2, int i2, long j3);

    private native void nativePreviewVideoBg(long j2);

    private native int nativeProcessTouchEvent(long j2, float f2, float f3);

    private native void nativeRecoverCherEffect(long j2, String[] strArr, double[] dArr, boolean[] zArr);

    private native int nativeRegBachAlgorithmCallback(long j2, List<Object> list);

    private native void nativeRegisterCherEffectParamCallback(long j2, OnCherEffectParmaCallback onCherEffectParmaCallback);

    private native void nativeRegisterEffectAlgorithmCallback(long j2, EffectAlgorithmCallback effectAlgorithmCallback);

    private native void nativeRegisterFaceResultCallback(long j2, boolean z, FaceResultCallback faceResultCallback);

    private native void nativeRegisterHandDetectCallback(long j2, int[] iArr, OnHandDetectCallback onHandDetectCallback);

    private native void nativeRegisterSceneDetectCallback(long j2, OnSceneDetectCallback onSceneDetectCallback);

    private native void nativeRegisterSkeletonDetectCallback(long j2, OnSkeletonDetectCallback onSkeletonDetectCallback);

    private native void nativeRegisterSmartBeautyCallback(long j2, OnSmartBeautyCallback onSmartBeautyCallback);

    private native void nativeReleaseGPUResources(long j2);

    private native int nativeRemoveTrack(long j2, int i2, int i3);

    private native boolean nativeRenderFrameForNightEnhance(long j2, int i2, int i3, int i4, int i5, String str, String str2, byte[] bArr, byte[] bArr2, boolean z);

    private native int nativeRenderPicture(long j2, byte[] bArr, int i2, int i3, int i4, OnPictureCallbackV2 onPictureCallbackV2);

    private native int nativeRenderPicture2(long j2, ByteBuffer byteBuffer, int[] iArr, ByteBuffer byteBuffer2, int[] iArr2, ByteBuffer byteBuffer3, int[] iArr3, int i2, int i3, int i4, int i5, int i6, OnPictureCallbackV2 onPictureCallbackV2, Bitmap bitmap);

    private native int nativeRenderPicture3(long j2, Bitmap bitmap, int i2, int i3, OnPictureCallbackV2 onPictureCallbackV2);

    private native int nativeRenderPictureToBitmap(long j2, byte[] bArr, int i2, int i3, int i4, int i5, int i6, int i7, OnPictureCallbackV2 onPictureCallbackV2, Bitmap bitmap);

    private native void nativeResetPerfStats(long j2);

    private native int nativeResetStartTime(long j2, long j3, long j4);

    private native float nativeRotateReactionWindow(long j2, float f2);

    private native int nativeSave(long j2);

    private native int[] nativeScaleReactionWindow(long j2, float f2);

    private native int nativeSeekTrack(long j2, int i2, int i3, long j3);

    private native void nativeSendEffectMsg(long j2, int i2, long j3, long j4, String str, boolean z);

    private native void nativeSetARCoreParam(long j2, VEARCoreParam vEARCoreParam);

    private native void nativeSetAdaptiveSharpenParams(long j2, VEAdaptiveSharpenParams vEAdaptiveSharpenParams, OnLensResultCallback onLensResultCallback);

    private native void nativeSetAlgorithmChangeMsg(long j2, int i2, boolean z);

    private native int nativeSetBGMVolume(long j2, float f2, int i2);

    private native int nativeSetBeautyFace(long j2, int i2, String str);

    private native int nativeSetBeautyFaceIntensity(long j2, float f2, float f3);

    private native int nativeSetBgmMute(long j2, boolean z);

    private native void nativeSetCamPreviewSize(long j2, int i2, int i3);

    private native void nativeSetCameraClose(long j2, boolean z);

    private native void nativeSetCameraFirstFrameOptimize(long j2, boolean z, int i2);

    private native void nativeSetCustomVideoBg(long j2, String str, String str2, String str3, int i2, int i3, long j3, boolean z, int i4);

    private native void nativeSetCustomVideoBgGif(long j2, String str, String str2);

    private native int nativeSetDLEEnable(long j2, boolean z);

    private native void nativeSetDebugSettings(long j2, VEDebugSettings vEDebugSettings);

    private native void nativeSetDetectInterval(long j2, int i2);

    private native void nativeSetDetectionMode(long j2, boolean z);

    private native int nativeSetDeviceRotationWithStamp(long j2, float[] fArr, double d2);

    private native int nativeSetDoubleFilterNew(long j2, String str, String str2, float f2, float f3, float f4);

    private native void nativeSetDuetCameraPaused(long j2, boolean z);

    private native void nativeSetEffectAlgorithmRequirement(long j2, long j3);

    private native boolean nativeSetEffectAudioManagerCallback(long j2, int i2, int i3, AudioManagerCallback audioManagerCallback);

    private native void nativeSetEffectBuildChainType(long j2, int i2);

    private native int nativeSetEnableDuetV2(long j2, boolean z);

    private native int nativeSetEnableEffCtrl(long j2, boolean z);

    private native void nativeSetEnigmaDetectParams(long j2, boolean z, float f2, float f3, float f4, float f5, boolean z2, int i2, long j3, int i3, boolean z3, boolean z4, boolean z5);

    private native int nativeSetFaceMakeUp(long j2, String str, float f2, float f3);

    private native int nativeSetFaceMakeUp2(long j2, String str);

    private native int nativeSetFilter(long j2, String str, String str2, float f2);

    private native int nativeSetFilterIntensity(long j2, float f2);

    private native int nativeSetFilterNew(long j2, String str, float f2);

    private native void nativeSetForceAlgorithmEnableCount(long j2, int i2);

    private native int nativeSetFrameCallback(long j2, OnFrameCallback onFrameCallback, boolean z, int i2);

    private native int nativeSetHandDetectLowpower(long j2, boolean z);

    private native int nativeSetHardEncoderStatus(long j2, boolean z);

    private native int nativeSetInitHardEncodeRet(long j2, int i2);

    private native int nativeSetIntensityByType(long j2, int i2, float f2);

    private native int nativeSetKaraoke(long j2, boolean z, boolean z2);

    private native void nativeSetLandMarkInfo(long j2, LandMarkFrame landMarkFrame);

    private native void nativeSetLumaDetectParams(long j2, VELumaDetectParams vELumaDetectParams, OnLensResultCallback onLensResultCallback);

    private native void nativeSetMemoryOpt(long j2, boolean z);

    private native void nativeSetModeChangeState(long j2, int i2);

    private native int nativeSetMusicNodes(long j2, String str);

    private native int nativeSetMusicTime(long j2, long j3, long j4, long j5);

    private native void nativeSetNativeLibraryDir(String str);

    private native void nativeSetPaddingBottomInRatio34(long j2, float f2);

    private native int nativeSetPlayLength(long j2, long j3);

    private native void nativeSetPreviewSizeRatio(long j2, float f2, int i2, int i3);

    private native void nativeSetReactionBorderParam(long j2, int i2, int i3);

    private native boolean nativeSetReactionMaskImage(long j2, String str, boolean z);

    private native void nativeSetReactionPosMargin(long j2, int i2, int i3, int i4, int i5);

    private native int nativeSetRecordMode(long j2, int i2);

    private native int nativeSetRecordPrepareTime(long j2, long j3);

    private native void nativeSetRenderCacheString(long j2, String str, String str2);

    private native void nativeSetRenderCacheTexture(long j2, String str, String str2);

    private native int nativeSetReshape(long j2, String str, float f2, float f3);

    private native int nativeSetReshapeResource(long j2, String str);

    private native int nativeSetRunningErrorCallback(long j2, OnRunningErrorCallback onRunningErrorCallback);

    private native int nativeSetSafeArea(long j2, int i2, VESafeAreaParams[] vESafeAreaParamsArr, int i3);

    private native void nativeSetScale(long j2, float f2);

    private native boolean nativeSetSharedTextureStatus(boolean z);

    private native int nativeSetSkinTone(long j2, String str);

    private native int nativeSetSlamFace(long j2, Bitmap bitmap);

    private native int nativeSetSlamInputText(long j2, String str, int i2, int i3, String str2);

    private native int nativeSetSticker(long j2, Bitmap bitmap, int i2, int i3);

    private native int nativeSetStickerPathWithTag(long j2, int i2, String str, int i3, int i4, String str2, String[] strArr, float[] fArr, boolean z, boolean z2);

    private native int nativeSetSwapDuetRegion(long j2, boolean z);

    private native int nativeSetSwapReactionRegion(long j2, boolean z);

    private native void nativeSetTaintSceneDetectParams(long j2, VETaintSceneDetectParams vETaintSceneDetectParams, OnLensResultCallback onLensResultCallback);

    private native void nativeSetUseMultiPreviewRatio(long j2, boolean z);

    private native int nativeSetUseMusic(long j2, int i2);

    private native void nativeSetVideoBgSpeed(long j2, double d2);

    private native void nativeSetVideoEncodeRotation(long j2, int i2);

    private native int nativeSetVideoQuality(long j2, int i2, int i3);

    private native void nativeSetWaterMark(long j2, String[] strArr, int i2, int i3, int i4, int i5, int i6, int i7, int i8);

    private native void nativeSetWaterMark2(long j2, Bitmap bitmap, int i2, int i3, int i4, int i5, int i6, int i7, int i8);

    private native int nativeShotHDScreen(long j2, String str, int[] iArr, boolean z, int i2, OnPictureCallback onPictureCallback, boolean z2, OnPictureCallback onPictureCallback2, Bitmap bitmap, boolean z3);

    private native int nativeShotScreen(long j2, String str, int[] iArr, boolean z, int i2, OnPictureCallback onPictureCallback, boolean z2);

    private native int nativeSlamDeviceConfig(long j2, boolean z, boolean z2, boolean z3, boolean z4);

    private native int nativeSlamGetTextBitmap(long j2, OnARTextBitmapCallback onARTextBitmapCallback);

    private native int nativeSlamGetTextLimitCount(long j2, OnARTextCountCallback onARTextCountCallback);

    private native int nativeSlamGetTextParagraphContent(long j2, OnARTextContentCallback onARTextContentCallback);

    private native int nativeSlamProcessDoubleClickEvent(long j2, float f2, float f3);

    private native int nativeSlamProcessIngestAcc(long j2, double d2, double d3, double d4, double d5);

    private native int nativeSlamProcessIngestGra(long j2, double d2, double d3, double d4, double d5);

    private native int nativeSlamProcessIngestGyr(long j2, double d2, double d3, double d4, double d5);

    private native int nativeSlamProcessIngestOri(long j2, double[] dArr, double d2);

    private native int nativeSlamProcessPanEvent(long j2, float f2, float f3, float f4, float f5, float f6);

    private native int nativeSlamProcessRotationEvent(long j2, float f2, float f3);

    private native int nativeSlamProcessScaleEvent(long j2, float f2, float f3);

    private native int nativeSlamProcessTouchEvent(long j2, float f2, float f3);

    private native int nativeSlamProcessTouchEventByType(long j2, int i2, float f2, float f3, int i3);

    private native int nativeSlamSetLanguge(long j2, String str);

    private native int nativeStartPlay(long j2, Surface surface, int i2, int i3, String str);

    private native int nativeStartPlay2(long j2, int i2, int i3, int i4, int i5, String str);

    private native int nativeStartPrePlay(long j2, boolean z, int i2, boolean z2);

    private native int nativeStartRecord(long j2, double d2, boolean z, int i2, int i3, int i4, String str, String str2, boolean z2);

    private native int nativeStartRender(long j2);

    private native int nativeStopPlay(long j2);

    private native int nativeStopPrePlay(long j2);

    private native int nativeStopRecord(long j2, boolean z);

    private native int nativeSwapMainAndPipRenderTarget(long j2, boolean z);

    private native int nativeSwitchEffectInGLTask(long j2, boolean z);

    private native int nativeTryRestore(long j2, int i2, String str);

    private native void nativeUnRegisterEffectAlgorithmCallback(long j2);

    private native void nativeUnRegisterFaceResultCallback(long j2);

    private native int nativeUninitAudioPlayer(long j2);

    private native int nativeUninitBeautyPlay(long j2);

    private native int nativeUnregBachAlgorithmCallback(long j2);

    private native void nativeUpdateAlgorithmRuntimeParam(long j2, int i2, float f2);

    private native void nativeUpdateReactionBGAlpha(long j2, float f2);

    private native int[] nativeUpdateReactionCameraPos(long j2, int i2, int i3, int i4, int i5);

    private native int[] nativeUpdateReactionCameraPosWithRotation(long j2, int i2, int i3, int i4, int i5, float f2);

    private native void nativeUpdateRotation(long j2, float f2, float f3, float f4);

    private native void nativeUpdateRotationAndFront(long j2, int i2, boolean z, boolean z2);

    private native void nativeUseLargeMattingModel(long j2, boolean z);

    private native int natvieEnableGetPropTrack(long j2, boolean z);

    private native int natvieSetExternalFaceMakeupOpacity(long j2, String str, float f2, float f3);

    private native void setCaptureMirror(long j2, boolean z);

    private native void setCaptureMirror2(long j2, int i2);

    private native void setCaptureResize(long j2, boolean z, int[] iArr, int[] iArr2);

    private native void setImageExposure(long j2, float f2);

    public native long flushData(long j2, long j3);

    public native long nativeAllocateStyleEngine(long j2, int i2, int i3, int i4, StyleActionListener styleActionListener);

    public native long nativeAllocateStyleManager(long j2, long j3, StyleActionListener styleActionListener);

    public native int nativeAnimateImageToPreview(long j2, String str, String str2, int i2);

    public native int nativeAppendComposerNodes(long j2, String[] strArr, int i2);

    public native void nativeAttachExtFrameData(long j2, Object obj);

    public native void nativeClearDisplayColor(long j2, float f2, float f3, float f4, float f5);

    public native int nativeDrawStyleToBitmap(long j2, long j3, long j4, Bitmap bitmap, StyleActionListener styleActionListener);

    public native void nativeEnable3buffer(long j2, boolean z);

    public native void nativeEnableClearColorAfterRender(long j2, boolean z);

    public native int nativeEnableDuetGlFinish(long j2, boolean z);

    public native void nativeEnableEffectRT(long j2, boolean z);

    public native void nativeEnableMakeUpBackground(long j2, boolean z);

    public native int nativeEnableRecordMaxDuration(long j2, boolean z);

    public native void nativeForceFirstFrameHasEffect(long j2, boolean z);

    public native float[] nativeGetAECSuggestVolume(long j2);

    public native String nativeGetComposerNodePaths(long j2);

    public native float nativeGetComposerNodeValue(long j2, String str, String str2);

    public native long nativeGetEffectHandler(long j2);

    public native String nativeGetEvents(long j2, long j3);

    public native String nativeGetFeatureParam(long j2, long j3, long j4, int i2, boolean z);

    public native float nativeGetFeatureRotation(long j2, long j3, long j4, int i2);

    public native long[] nativeGetFeatures(long j2, long j3);

    public native ImageFrame nativeGetFrameByKey(long j2, String str);

    public native VEMapBufferInfo nativeGetMapBuffer(long j2);

    public native String nativeGetStickerVersion(long j2, long j3);

    public native String nativeGetStyleRenderRect(long j2, long j3);

    public native boolean nativeIsGestureRegistered(long j2, int i2);

    public native void nativeOnSwapGlBuffers(long j2);

    public native long nativeOperateFeature(long j2, long j3, long j4, int i2, String str, boolean z, boolean z2, StyleActionListener styleActionListener);

    public native String[] nativeOperateFeatureGroup(long j2, long j3, long[] jArr, int[] iArr, String[] strArr, boolean z, boolean z2);

    public native void nativeOperateStyleAudio(long j2, long j3, int i2);

    public native long nativeOperateStyleManager(long j2, long j3, int i2, long j4, String str, String str2, String str3, boolean z, StyleActionListener styleActionListener);

    public native boolean nativePreviewDuetVideo(long j2);

    public native boolean nativeProcessTouchEvent2(long j2, int i2, float f2, float f3, float f4, float f5, int i3, int i4);

    public native int nativeRefreshEvent(long j2, long j3);

    public native long nativeReleaseStyleEngine(long j2, long j3, boolean z, StyleActionListener styleActionListener);

    public native long nativeReleaseStyleManager(long j2, long j3, boolean z, StyleActionListener styleActionListener);

    public native int nativeReloadComposerNodes(long j2, String[] strArr, int i2);

    public native int nativeRemoveComposerNodes(long j2, String[] strArr, int i2);

    public native int nativeReplaceComposerNodes(long j2, String[] strArr, int i2, String[] strArr2, int i3);

    public native void nativeRestoreStyleContext(long j2, long j3, String str);

    public native int nativeSetAlgorithmPreConfig(long j2, int i2, int i3);

    public native int nativeSetAudioDataInterface(long j2, long j3);

    public native void nativeSetCaptureRenderWidth(long j2, int i2, int i3);

    public native void nativeSetClientState(long j2, int i2);

    public native int nativeSetCodecConfig(long j2, ByteBuffer byteBuffer, int i2);

    public native int nativeSetCodecType(long j2, int i2);

    public native int nativeSetColorFormat(long j2, int i2);

    public native int nativeSetComposerMode(long j2, int i2, int i3);

    public native int nativeSetComposerNodes(long j2, String[] strArr, int i2);

    public native int nativeSetComposerResourcePath(long j2, String str);

    public native int nativeSetDisplaySettings(long j2, int i2, long j3, float f2, int i3, int i4, int i5, int i6, float f3, int i7, int i8, int i9, int i10, int i11, int i12, boolean z, int i13);

    public native void nativeSetDropFrames(long j2, int i2);

    public native int nativeSetEffectMaxMemoryCache(long j2, int i2);

    public native int nativeSetEnableAEC(long j2, boolean z, String str);

    public native int nativeSetEnableEarBack(long j2, boolean z);

    public native int nativeSetEventEnable(long j2, long j3, boolean z);

    public native long nativeSetEvents(long j2, long j3, String str);

    public native void nativeSetForceAlgorithmCnt(long j2, int i2);

    public native int nativeSetLoudness(long j2, boolean z, int i2);

    public native int nativeSetMaleMakeupState(long j2, boolean z);

    public native void nativeSetPreviewDuetVideoPaused(long j2, boolean z);

    public native int nativeSetPreviewRadioListener(long j2, OnPreviewRadioListener onPreviewRadioListener);

    public native void nativeSetRecordContentType(long j2, boolean z);

    public native int nativeSetRecordMaxDuration(long j2, long j3);

    public native int nativeSetStickerRequestCallback(long j2, IStickerRequestCallback iStickerRequestCallback);

    public native int nativeSetStylePictureOffset(long j2, long j3, float f2, float f3, float f4, float f5);

    public native int nativeSetVEEffectParams(long j2, VEEffectParams vEEffectParams);

    public native void nativeStyleEnableAudioEncode(long j2, long j3, boolean z);

    public native void nativeStyleEnableBGM(long j2, long j3, boolean z);

    public native long nativeStyleMusicSeek(long j2, long j3, long j4);

    public native long nativeStyleRenderEnable(long j2, long j3, boolean z);

    public native void nativeStyleSetMute(long j2, long j3, boolean z, int i2);

    public native void nativeStyleSetVolume(long j2, long j3, double d2, int i2);

    public native boolean nativeSuspendGestureRecognizer(long j2, int i2, boolean z);

    public native int nativeTurnToOffScreenRender(long j2);

    public native int nativeUpdateComposerNode(long j2, String str, String str2, float f2);

    public native long nativeUpdateEvents(long j2, long j3, String str);

    public native int nativeUpdateMultiComposerNodes(long j2, int i2, String[] strArr, String[] strArr2, float[] fArr);

    public native int nativeWriteFile(long j2, ByteBuffer byteBuffer, int i2, int i3, int i4);

    public native int nativeWriteFile2(long j2, ByteBuffer byteBuffer, int i2, long j3, long j4, int i3, boolean z);

    public void onDestroy() {
    }

    public void onNativeDuetProcess(long j2, boolean z) {
    }

    public native long registerStylePathsConverter(long j2, long j3, StylePathConvertCallback stylePathConvertCallback);

    public static com.ss.android.medialib.listener.b getNativeInitListener() {
        return sNativeInitListener;
    }

    private boolean isRenderReady() {
        return this.mIsRenderReady;
    }

    public void destroyMessageCenter() {
        MessageCenter.removeListener(this);
    }

    public long getHandler() {
        return this.mHandler;
    }

    public com.ss.android.medialib.style.a getStyleAudioProxy() {
        return this.mStyleAudioProxyImpl;
    }

    public com.ss.android.medialib.style.b getStyleProxy() {
        return this.mStyleProxyImpl;
    }

    public void initMessageCenter() {
        MessageCenter.addListener(this);
    }

    public void onNativeRecordStop() {
        a aVar = mRecordStopCallback;
        if (aVar != null) {
            aVar.a();
        }
    }

    public void onNativeVideoBgEOF() {
        g.b bVar = this.onVideoEOFListener;
        if (bVar != null) {
            bVar.a();
        }
    }

    public void releaseEncoder() {
        a aVar = this.mAVCEncoder;
        if (aVar != null) {
            aVar.d();
        }
    }

    public void initHardEncoderInAdvance() {
        if (this.mAVCEncoder == null) {
            this.mAVCEncoder = new a();
        }
    }

    public void onDuetVideoComplete() {
        Runnable runnable = this.mDuetCompleteRunable;
        if (runnable != null) {
            runnable.run();
        }
        Runnable runnable2 = sDuetCompleteRunable;
        if (runnable2 != null) {
            runnable2.run();
        }
    }

    public String onNativeCall_GenerateUUID() {
        return UUID.randomUUID().toString();
    }

    public void onNativeCallback_onOpenGLCreate() {
        an.a("RecordInvoker", "onNativeCallback_onOpenGLCreate");
        a.b bVar = this.mOpenGLCallback;
        if (bVar != null) {
            bVar.a();
        }
    }

    public void onNativeCallback_onOpenGLDestroy() {
        an.a("RecordInvoker", "onNativeCallback_onOpenGLDestroy");
        a.b bVar = this.mOpenGLCallback;
        if (bVar != null) {
            bVar.c();
        }
    }

    public void onPause() {
        an.b("RecordInvoker", "reset screenshot flag for next capture");
        this.mIsDuringScreenshot = false;
    }

    static {
        Covode.recordClassIndex(36830);
        com.ss.android.ttve.nativePort.d.c();
    }

    public RecordInvoker() {
        AnonymousClass1 r0 = new b() {
            /* class com.ss.android.medialib.RecordInvoker.AnonymousClass1 */

            static {
                Covode.recordClassIndex(36831);
            }

            @Override // com.ss.android.medialib.b
            public final int getProfile() {
                return RecordInvoker.this.mAVCEncoder.f59662i;
            }

            @Override // com.ss.android.medialib.b
            public final void onSwapGlBuffers() {
                MethodCollector.i(4386);
                if (RecordInvoker.this.mHandler == 0) {
                    MethodCollector.o(4386);
                    return;
                }
                RecordInvoker recordInvoker = RecordInvoker.this;
                recordInvoker.nativeOnSwapGlBuffers(recordInvoker.mHandler);
                MethodCollector.o(4386);
            }

            @Override // com.ss.android.medialib.b
            public final void onUninitHardEncoder() {
                an.a("RecordInvoker", "FaceBeautyManager onUninitHardEncoder == enter");
                if (RecordInvoker.this.mAVCEncoder != null) {
                    RecordInvoker.this.mAVCEncoder.c();
                    RecordInvoker.this.mAVCEncoder = null;
                    an.a("RecordInvoker", "====== uninitAVCEncoder ======");
                }
                an.a("RecordInvoker", "FaceBeautyManager onUninitHardEncoder == exit");
            }

            @Override // com.ss.android.medialib.b
            public final void setColorFormat(int i2) {
                MethodCollector.i(3971);
                if (RecordInvoker.this.mHandler == 0) {
                    MethodCollector.o(3971);
                    return;
                }
                RecordInvoker recordInvoker = RecordInvoker.this;
                recordInvoker.nativeSetColorFormat(recordInvoker.mHandler, i2);
                MethodCollector.o(3971);
            }

            @Override // com.ss.android.medialib.b
            public final void onSetCodecConfig(ByteBuffer byteBuffer) {
                MethodCollector.i(4388);
                an.b("RecordInvoker", "onSetCodecConfig: data size = " + byteBuffer.remaining());
                if (RecordInvoker.this.mHandler == 0) {
                    MethodCollector.o(4388);
                    return;
                }
                RecordInvoker recordInvoker = RecordInvoker.this;
                recordInvoker.nativeSetCodecConfig(recordInvoker.mHandler, byteBuffer, byteBuffer.remaining());
                MethodCollector.o(4388);
            }

            @Override // com.ss.android.medialib.b
            public final void onEncoderData(byte[] bArr, int i2, boolean z) {
                an.b("RecordInvoker", "FaceBeautyManager onEncoderData == enter");
                if (RecordInvoker.this.mAVCEncoder != null) {
                    RecordInvoker.this.mAVCEncoder.a(bArr, i2, z);
                }
                an.b("RecordInvoker", "FaceBeautyManager onEncoderData == exit");
            }

            @Override // com.ss.android.medialib.b
            public final int onEncoderData(int i2, int i3, int i4, boolean z) {
                an.b("RecordInvoker", "onEncoderData: ...");
                if (RecordInvoker.this.mAVCEncoder != null) {
                    return RecordInvoker.this.mAVCEncoder.a(i2, i3, i4, z);
                }
                return 0;
            }

            @Override // com.ss.android.medialib.b
            public final void onWriteFile(ByteBuffer byteBuffer, int i2, int i3, int i4) {
                MethodCollector.i(4382);
                if (RecordInvoker.this.mHandler == 0) {
                    MethodCollector.o(4382);
                    return;
                }
                RecordInvoker recordInvoker = RecordInvoker.this;
                recordInvoker.nativeWriteFile(recordInvoker.mHandler, byteBuffer, byteBuffer.remaining(), i2, i4);
                MethodCollector.o(4382);
            }

            @Override // com.ss.android.medialib.b
            public final void onWriteFile(ByteBuffer byteBuffer, long j2, long j3, int i2, boolean z) {
                MethodCollector.i(4384);
                if (RecordInvoker.this.mHandler == 0) {
                    MethodCollector.o(4384);
                    return;
                }
                RecordInvoker recordInvoker = RecordInvoker.this;
                recordInvoker.nativeWriteFile2(recordInvoker.mHandler, byteBuffer, byteBuffer.remaining(), j2, j3, i2, z);
                MethodCollector.o(4384);
            }

            @Override // com.ss.android.medialib.b
            public final Surface onInitHardEncoder(int i2, int i3, int i4, int i5, int i6, int i7, boolean z, int i8) {
                an.a("RecordInvoker", "FaceBeautyManager onInitHardEncoder == enter");
                an.a("RecordInvoker", "width = " + i2 + "\theight = " + i3 + "\tcodecType = " + i8);
                if (RecordInvoker.this.mAVCEncoder == null) {
                    RecordInvoker.this.mAVCEncoder = new a();
                }
                RecordInvoker.this.mAVCEncoder.a(i8);
                a.f59653a = this;
                Surface a2 = RecordInvoker.this.mAVCEncoder.a(i2, i3, i4, i5, i6, i7, z);
                RecordInvoker recordInvoker = RecordInvoker.this;
                recordInvoker.setInitHardEncodeRet(recordInvoker.mAVCEncoder.f59664k);
                if (a2 == null) {
                    if (i8 == a.EnumC1299a.ByteVC1.ordinal()) {
                        RecordInvoker.this.mAVCEncoder.c();
                        RecordInvoker.this.mAVCEncoder.a(a.EnumC1299a.H264.ordinal());
                        a2 = RecordInvoker.this.mAVCEncoder.a(i2, i3, i4, i5, i6, i7, z);
                        if (a2 != null) {
                            RecordInvoker.this.setCodecType(a.EnumC1299a.H264.ordinal());
                            RecordInvoker.this.setHardEncoderStatus(true);
                        }
                    }
                    RecordInvoker.this.mAVCEncoder.c();
                    RecordInvoker.this.mAVCEncoder = null;
                    RecordInvoker.this.setHardEncoderStatus(false);
                    return null;
                }
                an.d("RecordInvoker", "====== initAVCEncoder succeed ======");
                RecordInvoker.this.setHardEncoderStatus(true);
                an.a("RecordInvoker", "FaceBeautyManager onInitHardEncoder == exit");
                return a2;
            }
        };
        this.mAVCEncoderInterface = r0;
        this.mEncoderCaller = r0;
    }

    public static synchronized void clearSlamDetectListener() {
        synchronized (RecordInvoker.class) {
            MethodCollector.i(5865);
            sSlamDetectListeners.clear();
            MethodCollector.o(5865);
        }
    }

    private int onNativeCallback_GetHardEncoderProfile() {
        if (this.mEncoderCaller == null) {
            return -1;
        }
        an.a("RecordInvoker", "GetHardEncoderProfile");
        return this.mEncoderCaller.getProfile();
    }

    public void cancelAll() {
        MethodCollector.i(5615);
        long j2 = this.mHandler;
        if (j2 == 0) {
            MethodCollector.o(5615);
            return;
        }
        nativeCancelAll(j2);
        MethodCollector.o(5615);
    }

    public int clearFragFile() {
        MethodCollector.i(5508);
        long j2 = this.mHandler;
        if (j2 == 0) {
            MethodCollector.o(5508);
            return -100000;
        }
        int nativeClearFragFile = nativeClearFragFile(j2);
        MethodCollector.o(5508);
        return nativeClearFragFile;
    }

    public synchronized void clearLandMarkDetectListener() {
        MethodCollector.i(5771);
        this.mLandmarkDetectListeners.clear();
        MethodCollector.o(5771);
    }

    public synchronized void clearSlamDetectListener2() {
        MethodCollector.i(5875);
        this.mSlamDetectListeners.clear();
        MethodCollector.o(5875);
    }

    public void createEncoder() {
        if (this.mAVCEncoder == null) {
            this.mAVCEncoder = new a();
        }
        this.mAVCEncoder.b();
    }

    public int deleteLastFrag() {
        MethodCollector.i(5506);
        long j2 = this.mHandler;
        if (j2 == 0) {
            MethodCollector.o(5506);
            return -100000;
        }
        int nativeDeleteLastFrag = nativeDeleteLastFrag(j2);
        MethodCollector.o(5506);
        return nativeDeleteLastFrag;
    }

    public long getAudioEndTime() {
        MethodCollector.i(5019);
        long j2 = this.mHandler;
        if (j2 == 0) {
            MethodCollector.o(5019);
            return -100000;
        }
        long nativeGetAudioEndTime = nativeGetAudioEndTime(j2);
        MethodCollector.o(5019);
        return nativeGetAudioEndTime;
    }

    public long getEndFrameTime() {
        MethodCollector.i(5501);
        long j2 = this.mHandler;
        if (j2 == 0) {
            MethodCollector.o(5501);
            return -100000;
        }
        long nativeGetEndFrameTime = nativeGetEndFrameTime(j2);
        MethodCollector.o(5501);
        return nativeGetEndFrameTime;
    }

    public long getLastAudioLength() {
        MethodCollector.i(5503);
        long j2 = this.mHandler;
        if (j2 == 0) {
            MethodCollector.o(5503);
            return -100000;
        }
        long nativeGetLastAudioLength = nativeGetLastAudioLength(j2);
        MethodCollector.o(5503);
        return nativeGetLastAudioLength;
    }

    public int getLastRecordFrameNum() {
        MethodCollector.i(5505);
        long j2 = this.mHandler;
        if (j2 == 0) {
            MethodCollector.o(5505);
            return -100000;
        }
        int nativeGetLastRecordFrameNum = nativeGetLastRecordFrameNum(j2);
        MethodCollector.o(5505);
        return nativeGetLastRecordFrameNum;
    }

    public int[] getPreviewRenderRect() {
        MethodCollector.i(5544);
        long j2 = this.mHandler;
        if (j2 == 0) {
            MethodCollector.o(5544);
            return null;
        }
        int[] iArr = new int[4];
        int nativeGetPreviewRenderRect = nativeGetPreviewRenderRect(j2, iArr);
        MethodCollector.o(5544);
        if (nativeGetPreviewRenderRect == 0) {
            return iArr;
        }
        return null;
    }

    public float getReactionCamRotation() {
        MethodCollector.i(6955);
        long j2 = this.mHandler;
        if (j2 == 0) {
            MethodCollector.o(6955);
            return -100000.0f;
        }
        float nativeGetReactionCamRotation = nativeGetReactionCamRotation(j2);
        MethodCollector.o(6955);
        return nativeGetReactionCamRotation;
    }

    public int[] getReactionCameraPosInRecordPixel() {
        MethodCollector.i(7069);
        long j2 = this.mHandler;
        if (j2 == 0) {
            MethodCollector.o(7069);
            return null;
        }
        int[] nativeGetReactionCameraPosInRecordPixel = nativeGetReactionCameraPosInRecordPixel(j2);
        MethodCollector.o(7069);
        return nativeGetReactionCameraPosInRecordPixel;
    }

    public int[] getReactionCameraPosInViewPixel() {
        MethodCollector.i(7020);
        long j2 = this.mHandler;
        if (j2 == 0) {
            MethodCollector.o(7020);
            return null;
        }
        int[] nativeGetReactionCameraPosInViewPixel = nativeGetReactionCameraPosInViewPixel(j2);
        MethodCollector.o(7020);
        return nativeGetReactionCameraPosInViewPixel;
    }

    public int[] getReactionPosMarginInViewPixel() {
        MethodCollector.i(7114);
        long j2 = this.mHandler;
        if (j2 == 0) {
            MethodCollector.o(7114);
            return null;
        }
        int[] nativeGetReactionPosMarginInViewPixel = nativeGetReactionPosMarginInViewPixel(j2);
        MethodCollector.o(7114);
        return nativeGetReactionPosMarginInViewPixel;
    }

    public String[] getRecordedVideoPaths() {
        MethodCollector.i(4225);
        long j2 = this.mHandler;
        if (j2 == 0) {
            MethodCollector.o(4225);
            return null;
        }
        String[] nativeGetFragVideoPaths = nativeGetFragVideoPaths(j2);
        MethodCollector.o(4225);
        return nativeGetFragVideoPaths;
    }

    public boolean isSmallWinCameraRender() {
        MethodCollector.i(5553);
        long j2 = this.mHandler;
        if (j2 == 0) {
            MethodCollector.o(5553);
            return false;
        }
        boolean nativeIsSmallWinCameraRender = nativeIsSmallWinCameraRender(j2);
        MethodCollector.o(5553);
        return nativeIsSmallWinCameraRender;
    }

    public int markPlayDone() {
        MethodCollector.i(4305);
        long j2 = this.mHandler;
        if (j2 == 0) {
            MethodCollector.o(4305);
            return -100000;
        }
        int nativeMarkPlayDone = nativeMarkPlayDone(j2);
        MethodCollector.o(4305);
        return nativeMarkPlayDone;
    }

    public void onNativeCallback_UninitHardEncoder() {
        an.a("RecordInvoker", " onUninitHardEncoder == enter");
        b bVar = this.mEncoderCaller;
        if (bVar != null) {
            bVar.onUninitHardEncoder();
        }
        an.a("RecordInvoker", " onUninitHardEncoder == exit");
    }

    public int onNativeCallback_onOpenGLRunning() {
        an.b("RecordInvoker", "onNativeCallback_onOpenGLRunning");
        a.b bVar = this.mOpenGLCallback;
        if (bVar != null) {
            return bVar.b();
        }
        return 0;
    }

    public boolean previewDuetVideo() {
        MethodCollector.i(6497);
        long j2 = this.mHandler;
        if (j2 == 0) {
            MethodCollector.o(6497);
            return false;
        }
        boolean nativePreviewDuetVideo = nativePreviewDuetVideo(j2);
        MethodCollector.o(6497);
        return nativePreviewDuetVideo;
    }

    public void previewVideoBg() {
        MethodCollector.i(7415);
        long j2 = this.mHandler;
        if (j2 == 0) {
            MethodCollector.o(7415);
            return;
        }
        nativePreviewVideoBg(j2);
        MethodCollector.o(7415);
    }

    public void releaseGPUResources() {
        MethodCollector.i(4249);
        long j2 = this.mHandler;
        if (j2 == 0) {
            MethodCollector.o(4249);
            return;
        }
        nativeReleaseGPUResources(j2);
        MethodCollector.o(4249);
    }

    public void resetPerfStats() {
        MethodCollector.i(5510);
        long j2 = this.mHandler;
        if (j2 == 0) {
            MethodCollector.o(5510);
            return;
        }
        nativeResetPerfStats(j2);
        MethodCollector.o(5510);
    }

    public int save() {
        MethodCollector.i(4247);
        long j2 = this.mHandler;
        if (j2 == 0) {
            MethodCollector.o(4247);
            return -100000;
        }
        int nativeSave = nativeSave(j2);
        MethodCollector.o(4247);
        return nativeSave;
    }

    public int stopPrePlay() {
        MethodCollector.i(4240);
        long j2 = this.mHandler;
        if (j2 == 0) {
            MethodCollector.o(4240);
            return -100000;
        }
        int nativeStopPrePlay = nativeStopPrePlay(j2);
        MethodCollector.o(4240);
        return nativeStopPrePlay;
    }

    public void unRegisterEffectAlgorithmCallback() {
        MethodCollector.i(5758);
        long j2 = this.mHandler;
        if (j2 == 0) {
            an.d("RecordInvoker", "invalid handle");
            MethodCollector.o(5758);
            return;
        }
        nativeUnRegisterEffectAlgorithmCallback(j2);
        MethodCollector.o(5758);
    }

    public void unRegisterFaceResultCallback() {
        MethodCollector.i(5488);
        long j2 = this.mHandler;
        if (j2 == 0) {
            an.d("RecordInvoker", "invalid handle");
            MethodCollector.o(5488);
            return;
        }
        nativeUnRegisterFaceResultCallback(j2);
        MethodCollector.o(5488);
    }

    public void uninitAudioPlayer() {
        MethodCollector.i(5609);
        long j2 = this.mHandler;
        if (j2 == 0) {
            MethodCollector.o(5609);
            return;
        }
        nativeUninitAudioPlayer(j2);
        MethodCollector.o(5609);
    }

    public void unregBachAlgorithmCallback() {
        MethodCollector.i(7567);
        long j2 = this.mHandler;
        if (j2 == 0) {
            an.d("RecordInvoker", "Native instance handle == 0 invalid.");
            MethodCollector.o(7567);
            return;
        }
        nativeUnregBachAlgorithmCallback(j2);
        MethodCollector.o(7567);
    }

    private int getOptFirstFrameBypassEffectFrameCnt() {
        int intValue;
        u.d a2 = u.a().a("ve_opt_first_frame_bypass_effect_frame_cnt");
        if (a2 == null || a2.f151496b == null || !(a2.f151496b instanceof Integer) || (intValue = ((Integer) a2.f151496b).intValue()) <= 0 || intValue >= 100) {
            return 3;
        }
        return intValue;
    }

    public float[] getAECSuggestVolume() {
        MethodCollector.i(6949);
        long j2 = this.mHandler;
        if (j2 == 0) {
            an.d("RecordInvoker", "Native instance handle == 0 invalid.");
            float[] fArr = {0.0f, 0.0f};
            MethodCollector.o(6949);
            return fArr;
        }
        float[] nativeGetAECSuggestVolume = nativeGetAECSuggestVolume(j2);
        if (nativeGetAECSuggestVolume == null) {
            nativeGetAECSuggestVolume = new float[]{0.0f, 0.0f};
        }
        MethodCollector.o(6949);
        return nativeGetAECSuggestVolume;
    }

    public String getComposerNodePaths() {
        MethodCollector.i(6533);
        long j2 = this.mHandler;
        if (j2 == 0) {
            an.d("RecordInvoker", "Native instance handle == 0 invalid.");
            MethodCollector.o(6533);
            return "";
        }
        String nativeGetComposerNodePaths = nativeGetComposerNodePaths(j2);
        MethodCollector.o(6533);
        return nativeGetComposerNodePaths;
    }

    public long getEffectHandler() {
        MethodCollector.i(7115);
        long j2 = this.mHandler;
        if (j2 == 0) {
            an.d("RecordInvoker", "Native instance handle == 0 invalid.");
            MethodCollector.o(7115);
            return -100000;
        }
        long nativeGetEffectHandler = nativeGetEffectHandler(j2);
        MethodCollector.o(7115);
        return nativeGetEffectHandler;
    }

    public EnigmaResult getEnigmaResult() {
        MethodCollector.i(5766);
        long j2 = this.mHandler;
        if (j2 == 0) {
            an.d("RecordInvoker", "invalid handle");
            MethodCollector.o(5766);
            return null;
        }
        EnigmaResult nativeGetEnigmaResult = nativeGetEnigmaResult(j2);
        MethodCollector.o(5766);
        return nativeGetEnigmaResult;
    }

    public VEMapBufferInfo getMapBuffer() {
        MethodCollector.i(7131);
        long j2 = this.mHandler;
        if (j2 == 0) {
            an.d("RecordInvoker", "Native instance handle == 0 invalid.");
            MethodCollector.o(7131);
            return null;
        }
        VEMapBufferInfo nativeGetMapBuffer = nativeGetMapBuffer(j2);
        MethodCollector.o(7131);
        return nativeGetMapBuffer;
    }

    public int getSlamFaceCount() {
        MethodCollector.i(5240);
        long j2 = this.mHandler;
        if (j2 == 0) {
            an.d("RecordInvoker", "invalid handle");
            MethodCollector.o(5240);
            return -100000;
        }
        int nativeGetSlamFaceCount = nativeGetSlamFaceCount(j2);
        MethodCollector.o(5240);
        return nativeGetSlamFaceCount;
    }

    public boolean isStickerEnabled() {
        MethodCollector.i(5384);
        long j2 = this.mHandler;
        if (j2 == 0) {
            an.d("RecordInvoker", "invalid handle");
            MethodCollector.o(5384);
            return false;
        }
        boolean nativeIsStickerEnabled = nativeIsStickerEnabled(j2);
        MethodCollector.o(5384);
        return nativeIsStickerEnabled;
    }

    public int pauseRender() {
        MethodCollector.i(7314);
        long j2 = this.mHandler;
        if (j2 == 0) {
            an.d("RecordInvoker", "Native instance handle == 0 invalid.");
            MethodCollector.o(7314);
            return -100000;
        }
        int nativePauseRender = nativePauseRender(j2);
        MethodCollector.o(7314);
        return nativePauseRender;
    }

    public int startRender() {
        MethodCollector.i(7324);
        long j2 = this.mHandler;
        if (j2 == 0) {
            an.d("RecordInvoker", "Native instance handle == 0 invalid.");
            MethodCollector.o(7324);
            return -100000;
        }
        int nativeStartRender = nativeStartRender(j2);
        MethodCollector.o(7324);
        return nativeStartRender;
    }

    public int stopPlay() {
        MethodCollector.i(4301);
        this.mIsRenderReady = false;
        if (this.mHandler == 0) {
            an.d("RecordInvoker", "exit stopPlay due to INVALID_HANDLE.");
            MethodCollector.o(4301);
            return -100000;
        }
        destroyMessageCenter();
        int nativeStopPlay = nativeStopPlay(this.mHandler);
        MethodCollector.o(4301);
        return nativeStopPlay;
    }

    public int turnToOffScreenRender() {
        MethodCollector.i(7127);
        long j2 = this.mHandler;
        if (j2 == 0) {
            an.d("RecordInvoker", "Native instance handle == 0 invalid.");
            MethodCollector.o(7127);
            return -100000;
        }
        int nativeTurnToOffScreenRender = nativeTurnToOffScreenRender(j2);
        MethodCollector.o(7127);
        return nativeTurnToOffScreenRender;
    }

    public int uninitBeautyPlay() {
        int nativeUninitBeautyPlay;
        MethodCollector.i(4307);
        if (this.mHandler == 0) {
            MethodCollector.o(4307);
            return -100000;
        }
        an.a("RecordInvoker", "uninitBeautyPlay...");
        synchronized (this) {
            try {
                long j2 = this.mHandler;
                this.mHandler = 0;
                this.mTextureTimeListener = null;
                this.mShotScreenCallback = null;
                mRecordStopCallback = null;
                this.mNativeInitListener = null;
                this.mFaceDetectListener = null;
                this.mMessageListener = null;
                sMessageListener = null;
                this.mGetTimestampCallback = null;
                nativeUninitBeautyPlay = nativeUninitBeautyPlay(j2);
            } finally {
                MethodCollector.o(4307);
            }
        }
        return nativeUninitBeautyPlay;
    }

    public static void setDuetVideoCompleteCallback(Runnable runnable) {
        sDuetCompleteRunable = runnable;
    }

    public static void setFaceDetectListener(com.ss.android.medialib.listener.a aVar) {
        sFaceDetectListener = aVar;
    }

    public static void setNativeInitListener(com.ss.android.medialib.listener.b bVar) {
        sNativeInitListener = bVar;
    }

    public static void setRecordStopCallback(a aVar) {
        mRecordStopCallback = aVar;
    }

    public void setDuetVideoCompleteCallback2(Runnable runnable) {
        this.mDuetCompleteRunable = runnable;
    }

    public void setFaceDetectListener2(com.ss.android.medialib.listener.a aVar) {
        this.mFaceDetectListener = aVar;
    }

    public void setIsDuringScreenshot(boolean z) {
        this.mIsDuringScreenshot = z;
    }

    public void setMessageListenerV2(MessageCenter.Listener listener) {
        this.mMessageListener = listener;
    }

    public void setNativeInitListener2(com.ss.android.medialib.listener.b bVar) {
        this.mNativeInitListener = bVar;
    }

    public void setOnDuetProcessListener(g.a aVar) {
        this.onDuetProcessListener = aVar;
    }

    public void setOnOpenGLCallback(a.b bVar) {
        this.mOpenGLCallback = bVar;
    }

    public void setTextureTimeListener(d dVar) {
        this.mTextureTimeListener = dVar;
    }

    public void setVEOnVideoEOFListener(g.b bVar) {
        this.onVideoEOFListener = bVar;
    }

    public ByteBuffer allocateFrame(int i2) {
        return ByteBuffer.allocateDirect(i2).order(ByteOrder.LITTLE_ENDIAN);
    }

    public void enableFaceBeautifyDetect(int i2) {
        MethodCollector.i(4158);
        nativeEnableFaceBeautifyDetect(this.mHandler, i2);
        MethodCollector.o(4158);
    }

    public void enableFaceExtInfo(int i2) {
        MethodCollector.i(4870);
        nativeEnableFaceExtInfo(i2);
        MethodCollector.o(4870);
    }

    public void enablePreloadEffectRes(boolean z) {
        MethodCollector.i(4288);
        nativeEnablePreloadEffectResource(this.mHandler, z);
        MethodCollector.o(4288);
    }

    public void enableSceneRecognition(boolean z) {
        MethodCollector.i(3981);
        nativeEnableSceneRecognition(this.mHandler, z);
        MethodCollector.o(3981);
    }

    public void enableSkeletonDetect(boolean z) {
        MethodCollector.i(4155);
        nativeEnableSkeletonDetect(this.mHandler, z);
        MethodCollector.o(4155);
    }

    public void enableSmartBeauty(boolean z) {
        MethodCollector.i(4157);
        nativeEnableSmartBeauty(this.mHandler, z);
        MethodCollector.o(4157);
    }

    public void enableStickerRecognition(boolean z) {
        MethodCollector.i(4154);
        nativeEnableStickerRecognition(this.mHandler, z);
        MethodCollector.o(4154);
    }

    public long getTextureDeltaTime(boolean z) {
        d dVar = this.mTextureTimeListener;
        if (dVar != null) {
            return dVar.a();
        }
        return 0;
    }

    public void setCaptureMirror(int i2) {
        MethodCollector.i(6232);
        setCaptureMirror2(this.mHandler, i2);
        MethodCollector.o(6232);
    }

    public void setDeviceRotation(float[] fArr) {
        if (isRenderReady()) {
            setDeviceRotation(fArr, -1.0d);
        }
    }

    public void setEffectAlgorithmRequirement(long j2) {
        MethodCollector.i(4362);
        nativeSetEffectAlgorithmRequirement(this.mHandler, j2);
        MethodCollector.o(4362);
    }

    public int setEnableEffCtrl(boolean z) {
        MethodCollector.i(7545);
        int nativeSetEnableEffCtrl = nativeSetEnableEffCtrl(this.mHandler, z);
        MethodCollector.o(7545);
        return nativeSetEnableEffCtrl;
    }

    public int setFilterPos(float f2) {
        if (this.mHandler == 0) {
            return -100000;
        }
        return 0;
    }

    public void setImageExposure(float f2) {
        MethodCollector.i(6309);
        setImageExposure(this.mHandler, f2);
        MethodCollector.o(6309);
    }

    public static synchronized void addSlamDetectListener(com.ss.android.medialib.listener.c cVar) {
        synchronized (RecordInvoker.class) {
            MethodCollector.i(5632);
            if (cVar != null) {
                sSlamDetectListeners.add(cVar);
            }
            MethodCollector.o(5632);
        }
    }

    public static synchronized void removeSlamDetectListener(com.ss.android.medialib.listener.c cVar) {
        synchronized (RecordInvoker.class) {
            MethodCollector.i(5827);
            sSlamDetectListeners.remove(cVar);
            MethodCollector.o(5827);
        }
    }

    public static synchronized void setMessageListener(MessageCenter.Listener listener) {
        synchronized (RecordInvoker.class) {
            MethodCollector.i(3867);
            sMessageListener = listener;
            MethodCollector.o(3867);
        }
    }

    public static synchronized void setSlamDetectListener(com.ss.android.medialib.listener.c cVar) {
        synchronized (RecordInvoker.class) {
            MethodCollector.i(5868);
            addSlamDetectListener(cVar);
            MethodCollector.o(5868);
        }
    }

    public synchronized void addLandMarkDetectListener(al alVar) {
        MethodCollector.i(5634);
        this.mLandmarkDetectListeners.add(alVar);
        MethodCollector.o(5634);
    }

    public synchronized void addSlamDetectListener2(com.ss.android.medialib.listener.c cVar) {
        MethodCollector.i(5869);
        if (cVar != null) {
            this.mSlamDetectListeners.add(cVar);
        }
        MethodCollector.o(5869);
    }

    public void attachExtFrameData(Object obj) {
        MethodCollector.i(7400);
        long j2 = this.mHandler;
        if (j2 == 0) {
            an.d("RecordInvoker", "Native instance handle == 0 invalid.");
            MethodCollector.o(7400);
            return;
        }
        nativeAttachExtFrameData(j2, obj);
        MethodCollector.o(7400);
    }

    public synchronized void changePreviewRadioMode(int i2) {
        MethodCollector.i(4745);
        long j2 = this.mHandler;
        if (j2 == 0) {
            MethodCollector.o(4745);
            return;
        }
        nativeChangePreviewRadioMode(j2, i2);
        MethodCollector.o(4745);
    }

    public void chooseAreaFromRatio34(float f2) {
        MethodCollector.i(5620);
        long j2 = this.mHandler;
        if (j2 == 0) {
            MethodCollector.o(5620);
            return;
        }
        nativeChooseAreaFromRatio34(j2, f2);
        MethodCollector.o(5620);
    }

    public void chooseSlamFace(int i2) {
        MethodCollector.i(5242);
        long j2 = this.mHandler;
        if (j2 == 0) {
            an.d("RecordInvoker", "invalid handle");
            MethodCollector.o(5242);
            return;
        }
        nativeChooseSlamFace(j2, i2);
        MethodCollector.o(5242);
    }

    public int closeWavFile(boolean z) {
        MethodCollector.i(5435);
        long j2 = this.mHandler;
        if (j2 == 0) {
            MethodCollector.o(5435);
            return -100000;
        }
        int nativeCloseWavFile = nativeCloseWavFile(j2, z);
        save();
        MethodCollector.o(5435);
        return nativeCloseWavFile;
    }

    public int configStyleResourceFinder(AssetManager assetManager) {
        MethodCollector.i(3876);
        long j2 = this.mHandler;
        if (j2 == 0) {
            MethodCollector.o(3876);
            return -100000;
        }
        int nativeConfigStyleResourceFinder = (int) nativeConfigStyleResourceFinder(j2, assetManager);
        MethodCollector.o(3876);
        return nativeConfigStyleResourceFinder;
    }

    public void disableRender(boolean z) {
        MethodCollector.i(5210);
        long j2 = this.mHandler;
        if (j2 == 0) {
            an.d("RecordInvoker", "invalid handle");
            MethodCollector.o(5210);
            return;
        }
        nativeDisableRender(j2, z);
        MethodCollector.o(5210);
    }

    public void enable3buffer(boolean z) {
        MethodCollector.i(5895);
        long j2 = this.mHandler;
        if (j2 == 0) {
            MethodCollector.o(5895);
            return;
        }
        nativeEnable3buffer(j2, z);
        MethodCollector.o(5895);
    }

    public void enableAbandonFirstFrame(boolean z) {
        MethodCollector.i(5215);
        long j2 = this.mHandler;
        if (j2 == 0) {
            MethodCollector.o(5215);
            return;
        }
        nativeEnableAbandonFirstFrame(j2, z);
        MethodCollector.o(5215);
    }

    public synchronized void enableAudio(int i2) {
        MethodCollector.i(4423);
        long j2 = this.mHandler;
        if (j2 == 0) {
            MethodCollector.o(4423);
            return;
        }
        nativeEnableAudio(j2, i2);
        MethodCollector.o(4423);
    }

    public synchronized void enableAudioPlayerFromVE(int i2) {
        MethodCollector.i(4431);
        long j2 = this.mHandler;
        if (j2 == 0) {
            MethodCollector.o(4431);
            return;
        }
        nativeEnableAudioPlayerFromVE(j2, i2);
        MethodCollector.o(4431);
    }

    public synchronized void enableAutoTestLog(boolean z) {
        MethodCollector.i(4482);
        long j2 = this.mHandler;
        if (j2 == 0) {
            MethodCollector.o(4482);
            return;
        }
        nativeEnableAutoTestLog(j2, z);
        MethodCollector.o(4482);
    }

    public void enableClearColorAfterRender(boolean z) {
        MethodCollector.i(5900);
        long j2 = this.mHandler;
        if (j2 == 0) {
            MethodCollector.o(5900);
            return;
        }
        nativeEnableClearColorAfterRender(j2, z);
        MethodCollector.o(5900);
    }

    public void enableEffect(boolean z) {
        MethodCollector.i(5206);
        long j2 = this.mHandler;
        if (j2 == 0) {
            an.d("RecordInvoker", "invalid handle");
            MethodCollector.o(5206);
            return;
        }
        nativeEnableEffect(j2, z);
        MethodCollector.o(5206);
    }

    public void enableEffectBGM(boolean z) {
        MethodCollector.i(5202);
        long j2 = this.mHandler;
        if (j2 == 0) {
            an.d("RecordInvoker", "invalid handle");
            MethodCollector.o(5202);
            return;
        }
        nativeEnableEffectBGM(j2, z);
        MethodCollector.o(5202);
    }

    public void enableEffectRT(boolean z) {
        MethodCollector.i(5896);
        long j2 = this.mHandler;
        if (j2 == 0) {
            MethodCollector.o(5896);
            return;
        }
        nativeEnableEffectRT(j2, z);
        MethodCollector.o(5896);
    }

    public void enableLandMark(boolean z) {
        MethodCollector.i(5981);
        long j2 = this.mHandler;
        if (j2 == 0) {
            an.d("RecordInvoker", "invalid handle");
            MethodCollector.o(5981);
            return;
        }
        nativeEnableLandMark(j2, z);
        MethodCollector.o(5981);
    }

    public void enableMakeUpBackground(boolean z) {
        MethodCollector.i(5898);
        long j2 = this.mHandler;
        if (j2 == 0) {
            MethodCollector.o(5898);
            return;
        }
        nativeEnableMakeUpBackground(j2, z);
        MethodCollector.o(5898);
    }

    public void enablePBO(boolean z) {
        MethodCollector.i(4596);
        if (this.mHandler == 0) {
            an.d("RecordInvoker", "invalid handle");
        }
        nativeEnablePBO(z);
        MethodCollector.o(4596);
    }

    public void enablePictureTestModel(boolean z) {
        MethodCollector.i(4600);
        long j2 = this.mHandler;
        if (j2 == 0) {
            an.d("RecordInvoker", "invalid handle");
            MethodCollector.o(4600);
            return;
        }
        nativeEnablePictureTestMode(j2, z);
        MethodCollector.o(4600);
    }

    public void enableRecordBGMToMp4(boolean z) {
        MethodCollector.i(4657);
        long j2 = this.mHandler;
        if (j2 == 0) {
            an.d("RecordInvoker", "invalid handle");
            MethodCollector.o(4657);
            return;
        }
        nativeEnableRecordBGMToMp4(j2, z);
        MethodCollector.o(4657);
    }

    public synchronized void enableRecordFlip(int i2) {
        MethodCollector.i(4425);
        long j2 = this.mHandler;
        if (j2 == 0) {
            MethodCollector.o(4425);
            return;
        }
        nativeEnableRecordFlip(j2, i2);
        MethodCollector.o(4425);
    }

    public void enableRecordingMp4(boolean z) {
        MethodCollector.i(4192);
        long j2 = this.mHandler;
        if (j2 == 0) {
            MethodCollector.o(4192);
            return;
        }
        nativeEnableRecordingMp4(j2, z);
        MethodCollector.o(4192);
    }

    public void enableShotScreenUseOesTexture(boolean z) {
        MethodCollector.i(4219);
        long j2 = this.mHandler;
        if (j2 == 0) {
            MethodCollector.o(4219);
            return;
        }
        nativeEnableShotScreenUseOesTexture(j2, z);
        MethodCollector.o(4219);
    }

    public synchronized void enableTimestampCallback(boolean z) {
        MethodCollector.i(4479);
        long j2 = this.mHandler;
        if (j2 == 0) {
            MethodCollector.o(4479);
            return;
        }
        nativeEnableTimestampCallback(j2, z);
        MethodCollector.o(4479);
    }

    public void enableWaterMark(boolean z) {
        MethodCollector.i(4598);
        long j2 = this.mHandler;
        if (j2 == 0) {
            an.d("RecordInvoker", "invalid handle");
            MethodCollector.o(4598);
            return;
        }
        nativeEnableWaterMark(j2, z);
        MethodCollector.o(4598);
    }

    public void forceFirstFrameHasEffect(boolean z) {
        MethodCollector.i(5893);
        long j2 = this.mHandler;
        if (j2 == 0) {
            MethodCollector.o(5893);
            return;
        }
        nativeForceFirstFrameHasEffect(j2, z);
        MethodCollector.o(5893);
    }

    public float getFilterIntensity(String str) {
        MethodCollector.i(3979);
        long j2 = this.mHandler;
        if (j2 == 0) {
            MethodCollector.o(3979);
            return -100000.0f;
        }
        float nativeGetFilterIntensity = nativeGetFilterIntensity(j2, str);
        MethodCollector.o(3979);
        return nativeGetFilterIntensity;
    }

    public ImageFrame getFrameByKey(String str) {
        ImageFrame nativeGetFrameByKey;
        MethodCollector.i(7091);
        long j2 = this.mHandler;
        if (j2 == 0) {
            nativeGetFrameByKey = null;
        } else {
            nativeGetFrameByKey = nativeGetFrameByKey(j2, str);
        }
        MethodCollector.o(7091);
        return nativeGetFrameByKey;
    }

    public int initBeautyPlayOnlyPreview(ScanSettings scanSettings) {
        MethodCollector.i(3877);
        long nativeCreate = nativeCreate();
        this.mHandler = nativeCreate;
        if (nativeCreate == 0) {
            MethodCollector.o(3877);
            return -100000;
        }
        int nativeInitBeautyPlayOnlyPreview = nativeInitBeautyPlayOnlyPreview(nativeCreate, scanSettings);
        MethodCollector.o(3877);
        return nativeInitBeautyPlayOnlyPreview;
    }

    public void initFaceBeautyDetectExtParam(boolean z) {
        MethodCollector.i(4846);
        long j2 = this.mHandler;
        if (j2 == 0) {
            MethodCollector.o(4846);
            return;
        }
        nativeInitFaceBeautyDetectExtParam(j2, z);
        MethodCollector.o(4846);
    }

    public int onDrawFrameTime(double d2) {
        MethodCollector.i(5145);
        long j2 = this.mHandler;
        if (j2 == 0) {
            MethodCollector.o(5145);
            return -100000;
        }
        int nativeOnFrameTime = nativeOnFrameTime(j2, d2);
        MethodCollector.o(5145);
        return nativeOnFrameTime;
    }

    public void regBachAlgorithmCallback(List<Object> list) {
        MethodCollector.i(7565);
        long j2 = this.mHandler;
        if (j2 == 0) {
            an.d("RecordInvoker", "Native instance handle == 0 invalid.");
            MethodCollector.o(7565);
            return;
        }
        nativeRegBachAlgorithmCallback(j2, list);
        MethodCollector.o(7565);
    }

    public void registerCherEffectParamCallback(OnCherEffectParmaCallback onCherEffectParmaCallback) {
        MethodCollector.i(6131);
        long j2 = this.mHandler;
        if (j2 == 0) {
            an.d("RecordInvoker", "invalid handle");
            MethodCollector.o(6131);
            return;
        }
        nativeRegisterCherEffectParamCallback(j2, onCherEffectParmaCallback);
        MethodCollector.o(6131);
    }

    public void registerEffectAlgorithmCallback(EffectAlgorithmCallback effectAlgorithmCallback) {
        MethodCollector.i(5600);
        long j2 = this.mHandler;
        if (j2 == 0) {
            an.d("RecordInvoker", "invalid handle");
            MethodCollector.o(5600);
            return;
        }
        nativeRegisterEffectAlgorithmCallback(j2, effectAlgorithmCallback);
        MethodCollector.o(5600);
    }

    public void registerSceneDetectCallback(OnSceneDetectCallback onSceneDetectCallback) {
        MethodCollector.i(6016);
        long j2 = this.mHandler;
        if (j2 == 0) {
            an.d("RecordInvoker", "invalid handle");
            MethodCollector.o(6016);
            return;
        }
        nativeRegisterSceneDetectCallback(j2, onSceneDetectCallback);
        MethodCollector.o(6016);
    }

    public void registerSkeletonDetectCallback(OnSkeletonDetectCallback onSkeletonDetectCallback) {
        MethodCollector.i(6023);
        long j2 = this.mHandler;
        if (j2 == 0) {
            an.d("RecordInvoker", "invalid handle");
            MethodCollector.o(6023);
            return;
        }
        nativeRegisterSkeletonDetectCallback(j2, onSkeletonDetectCallback);
        MethodCollector.o(6023);
    }

    public void registerSmartBeautyCallback(OnSmartBeautyCallback onSmartBeautyCallback) {
        MethodCollector.i(6120);
        long j2 = this.mHandler;
        if (j2 == 0) {
            an.d("RecordInvoker", "invalid handle");
            MethodCollector.o(6120);
            return;
        }
        nativeRegisterSmartBeautyCallback(j2, onSmartBeautyCallback);
        MethodCollector.o(6120);
    }

    public synchronized void removeLandMarkDetectListener(al alVar) {
        MethodCollector.i(5635);
        this.mLandmarkDetectListeners.remove(alVar);
        MethodCollector.o(5635);
    }

    public synchronized void removeSlamDetectListener2(com.ss.android.medialib.listener.c cVar) {
        MethodCollector.i(5871);
        this.mSlamDetectListeners.remove(cVar);
        MethodCollector.o(5871);
    }

    public float rotateReactionWindow(float f2) {
        MethodCollector.i(6873);
        long j2 = this.mHandler;
        if (j2 == 0) {
            MethodCollector.o(6873);
            return -100000.0f;
        }
        float nativeRotateReactionWindow = nativeRotateReactionWindow(j2, f2);
        MethodCollector.o(6873);
        return nativeRotateReactionWindow;
    }

    public int[] scaleReactionWindow(float f2) {
        MethodCollector.i(6870);
        long j2 = this.mHandler;
        if (j2 == 0) {
            MethodCollector.o(6870);
            return null;
        }
        int[] nativeScaleReactionWindow = nativeScaleReactionWindow(j2, f2);
        MethodCollector.o(6870);
        return nativeScaleReactionWindow;
    }

    public void setARCoreParam(VEARCoreParam vEARCoreParam) {
        MethodCollector.i(7517);
        long j2 = this.mHandler;
        if (j2 == 0) {
            an.d("RecordInvoker", "Native instance handle == 0 invalid.");
            MethodCollector.o(7517);
            return;
        }
        nativeSetARCoreParam(j2, vEARCoreParam);
        MethodCollector.o(7517);
    }

    public void setBgmMute(boolean z) {
        MethodCollector.i(7395);
        long j2 = this.mHandler;
        if (j2 == 0) {
            an.d("RecordInvoker", "Native instance handle == 0 invalid.");
            MethodCollector.o(7395);
            return;
        }
        nativeSetBgmMute(j2, z);
        MethodCollector.o(7395);
    }

    public void setCameraClose(boolean z) {
        MethodCollector.i(4605);
        long j2 = this.mHandler;
        if (j2 == 0) {
            MethodCollector.o(4605);
            return;
        }
        nativeSetCameraClose(j2, z);
        MethodCollector.o(4605);
    }

    public void setCaptureMirror(boolean z) {
        MethodCollector.i(6167);
        setCaptureMirror(this.mHandler, z);
        MethodCollector.o(6167);
    }

    public void setClientState(int i2) {
        MethodCollector.i(5213);
        if (this.mHandler == 0) {
            an.d("RecordInvoker", "invalid handle");
        }
        nativeSetClientState(this.mHandler, i2);
        MethodCollector.o(5213);
    }

    public void setDLEEnable(boolean z) {
        MethodCollector.i(7286);
        long j2 = this.mHandler;
        if (j2 == 0) {
            MethodCollector.o(7286);
            return;
        }
        nativeSetDLEEnable(j2, z);
        MethodCollector.o(7286);
    }

    public void setDebugSettings(VEDebugSettings vEDebugSettings) {
        MethodCollector.i(5636);
        long j2 = this.mHandler;
        if (j2 == 0) {
            an.d("RecordInvoker", "setDebugSettings failed, handler is null");
            MethodCollector.o(5636);
            return;
        }
        nativeSetDebugSettings(j2, vEDebugSettings);
        MethodCollector.o(5636);
    }

    public void setDetectInterval(int i2) {
        MethodCollector.i(5193);
        long j2 = this.mHandler;
        if (j2 == 0) {
            an.d("RecordInvoker", "invalid handle");
            MethodCollector.o(5193);
            return;
        }
        nativeSetDetectInterval(j2, i2);
        MethodCollector.o(5193);
    }

    public void setDetectionMode(boolean z) {
        MethodCollector.i(4072);
        long j2 = this.mHandler;
        if (j2 == 0) {
            MethodCollector.o(4072);
            return;
        }
        nativeSetDetectionMode(j2, z);
        MethodCollector.o(4072);
    }

    public void setDropFrames(int i2) {
        MethodCollector.i(5216);
        long j2 = this.mHandler;
        if (j2 == 0) {
            an.d("RecordInvoker", "invalid handle");
            MethodCollector.o(5216);
            return;
        }
        nativeSetDropFrames(j2, i2);
        MethodCollector.o(5216);
    }

    public void setDuetCameraPaused(boolean z) {
        MethodCollector.i(6658);
        long j2 = this.mHandler;
        if (j2 == 0) {
            MethodCollector.o(6658);
            return;
        }
        nativeSetDuetCameraPaused(j2, z);
        MethodCollector.o(6658);
    }

    public void setEffectBuildChainType(int i2) {
        MethodCollector.i(7569);
        long j2 = this.mHandler;
        if (j2 == 0) {
            MethodCollector.o(7569);
            return;
        }
        nativeSetEffectBuildChainType(j2, i2);
        MethodCollector.o(7569);
    }

    public void setEnableDuetV2(boolean z) {
        MethodCollector.i(5878);
        long j2 = this.mHandler;
        if (j2 == 0) {
            an.d("RecordInvoker", "invalid handle");
            MethodCollector.o(5878);
            return;
        }
        nativeSetEnableDuetV2(j2, z);
        MethodCollector.o(5878);
    }

    public int setFilterIntensity(float f2) {
        MethodCollector.i(4437);
        long j2 = this.mHandler;
        if (j2 == 0) {
            MethodCollector.o(4437);
            return -100000;
        }
        int nativeSetFilterIntensity = nativeSetFilterIntensity(j2, f2);
        MethodCollector.o(4437);
        return nativeSetFilterIntensity;
    }

    public void setForceAlgorithmCnt(int i2) {
        MethodCollector.i(6208);
        long j2 = this.mHandler;
        if (j2 == 0) {
            an.d("RecordInvoker", "invalid handle");
            MethodCollector.o(6208);
            return;
        }
        nativeSetForceAlgorithmCnt(j2, i2);
        MethodCollector.o(6208);
    }

    public void setForceAlgorithmEnableCount(int i2) {
        MethodCollector.i(5638);
        long j2 = this.mHandler;
        if (j2 == 0) {
            an.d("RecordInvoker", "setForceAlgorithmEnableCount failed, handler is null");
            MethodCollector.o(5638);
            return;
        }
        nativeSetForceAlgorithmEnableCount(j2, i2);
        MethodCollector.o(5638);
    }

    public int setHardEncoderStatus(boolean z) {
        MethodCollector.i(5279);
        long j2 = this.mHandler;
        if (j2 == 0) {
            MethodCollector.o(5279);
            return -100000;
        }
        int nativeSetHardEncoderStatus = nativeSetHardEncoderStatus(j2, z);
        MethodCollector.o(5279);
        return nativeSetHardEncoderStatus;
    }

    public int setInitHardEncodeRet(int i2) {
        MethodCollector.i(5280);
        long j2 = this.mHandler;
        if (j2 == 0) {
            MethodCollector.o(5280);
            return -100000;
        }
        int nativeSetInitHardEncodeRet = nativeSetInitHardEncodeRet(j2, i2);
        MethodCollector.o(5280);
        return nativeSetInitHardEncodeRet;
    }

    public void setLandMarkInfo(LandMarkFrame landMarkFrame) {
        MethodCollector.i(3389);
        if (this.mHandler == 0) {
            MethodCollector.o(3389);
            return;
        }
        if (isRenderReady()) {
            nativeSetLandMarkInfo(this.mHandler, landMarkFrame);
        }
        MethodCollector.o(3389);
    }

    public int setMaleMakeupState(boolean z) {
        MethodCollector.i(5906);
        long j2 = this.mHandler;
        if (j2 == 0) {
            MethodCollector.o(5906);
            return -100000;
        }
        int nativeSetMaleMakeupState = nativeSetMaleMakeupState(j2, z);
        MethodCollector.o(5906);
        return nativeSetMaleMakeupState;
    }

    public void setMemoryOpt(boolean z) {
        MethodCollector.i(4674);
        long j2 = this.mHandler;
        if (j2 == 0) {
            MethodCollector.o(4674);
            return;
        }
        nativeSetMemoryOpt(j2, z);
        MethodCollector.o(4674);
    }

    public synchronized void setModeChangeState(int i2) {
        MethodCollector.i(4483);
        long j2 = this.mHandler;
        if (j2 == 0) {
            MethodCollector.o(4483);
            return;
        }
        nativeSetModeChangeState(j2, i2);
        MethodCollector.o(4483);
    }

    public void setNativeLibraryDir(String str) {
        MethodCollector.i(4678);
        if (TextUtils.isEmpty(str)) {
            MethodCollector.o(4678);
            return;
        }
        nativeSetNativeLibraryDir(str);
        MethodCollector.o(4678);
    }

    public void setPaddingBottomInRatio34(float f2) {
        MethodCollector.i(5622);
        long j2 = this.mHandler;
        if (j2 == 0) {
            MethodCollector.o(5622);
            return;
        }
        nativeSetPaddingBottomInRatio34(j2, f2);
        MethodCollector.o(5622);
    }

    public int setPlayLength(long j2) {
        MethodCollector.i(5606);
        long j3 = this.mHandler;
        if (j3 == 0) {
            MethodCollector.o(5606);
            return -100000;
        }
        int nativeSetPlayLength = nativeSetPlayLength(j3, j2);
        MethodCollector.o(5606);
        return nativeSetPlayLength;
    }

    public void setPreviewDuetVideoPaused(boolean z) {
        MethodCollector.i(6617);
        long j2 = this.mHandler;
        if (j2 != 0) {
            nativeSetPreviewDuetVideoPaused(j2, z);
        }
        MethodCollector.o(6617);
    }

    public void setPreviewRadioListener(OnPreviewRadioListener onPreviewRadioListener) {
        MethodCollector.i(5904);
        long j2 = this.mHandler;
        if (j2 == 0) {
            MethodCollector.o(5904);
            return;
        }
        nativeSetPreviewRadioListener(j2, onPreviewRadioListener);
        MethodCollector.o(5904);
    }

    public void setRecordContentType(boolean z) {
        MethodCollector.i(6092);
        long j2 = this.mHandler;
        if (j2 != 0) {
            nativeSetRecordContentType(j2, z);
        }
        MethodCollector.o(6092);
    }

    public int setRecordMode(int i2) {
        MethodCollector.i(5775);
        long j2 = this.mHandler;
        if (j2 == 0) {
            MethodCollector.o(5775);
            return -1;
        }
        int nativeSetRecordMode = nativeSetRecordMode(j2, i2);
        MethodCollector.o(5775);
        return nativeSetRecordMode;
    }

    public void setRunningErrorCallback(OnRunningErrorCallback onRunningErrorCallback) {
        MethodCollector.i(5629);
        long j2 = this.mHandler;
        if (j2 == 0) {
            MethodCollector.o(5629);
            return;
        }
        nativeSetRunningErrorCallback(j2, onRunningErrorCallback);
        MethodCollector.o(5629);
    }

    public void setScale(float f2) {
        MethodCollector.i(5125);
        long j2 = this.mHandler;
        if (j2 == 0) {
            MethodCollector.o(5125);
            return;
        }
        nativeSetScale(j2, f2);
        MethodCollector.o(5125);
    }

    public int setStickerRequestCallback(IStickerRequestCallback iStickerRequestCallback) {
        MethodCollector.i(5884);
        long j2 = this.mHandler;
        if (j2 == 0) {
            MethodCollector.o(5884);
            return -100000;
        }
        int nativeSetStickerRequestCallback = nativeSetStickerRequestCallback(j2, iStickerRequestCallback);
        MethodCollector.o(5884);
        return nativeSetStickerRequestCallback;
    }

    public void setSwapDuetRegion(boolean z) {
        MethodCollector.i(6428);
        long j2 = this.mHandler;
        if (j2 == 0) {
            MethodCollector.o(6428);
            return;
        }
        nativeSetSwapDuetRegion(j2, z);
        MethodCollector.o(6428);
    }

    public void setSwapReactionRegion(boolean z) {
        MethodCollector.i(6430);
        long j2 = this.mHandler;
        if (j2 == 0) {
            MethodCollector.o(6430);
            return;
        }
        nativeSetSwapReactionRegion(j2, z);
        MethodCollector.o(6430);
    }

    public void setSwitchEffectInGLTask(boolean z) {
        MethodCollector.i(6093);
        long j2 = this.mHandler;
        if (j2 != 0) {
            nativeSwitchEffectInGLTask(j2, z);
        }
        MethodCollector.o(6093);
    }

    public void setUseMultiPreviewRatio(boolean z) {
        MethodCollector.i(5640);
        long j2 = this.mHandler;
        if (j2 == 0) {
            an.d("RecordInvoker", "setUseMultiPreviewRatio failed, handler is null");
            MethodCollector.o(5640);
            return;
        }
        nativeSetUseMultiPreviewRatio(j2, z);
        MethodCollector.o(5640);
    }

    public synchronized void setUseMusic(int i2) {
        MethodCollector.i(4308);
        long j2 = this.mHandler;
        if (j2 == 0) {
            MethodCollector.o(4308);
            return;
        }
        nativeSetUseMusic(j2, i2);
        MethodCollector.o(4308);
    }

    public void setVideoBgSpeed(double d2) {
        MethodCollector.i(7488);
        long j2 = this.mHandler;
        if (j2 == 0) {
            MethodCollector.o(7488);
            return;
        }
        nativeSetVideoBgSpeed(j2, d2);
        MethodCollector.o(7488);
    }

    public int slamGetTextBitmap(OnARTextBitmapCallback onARTextBitmapCallback) {
        MethodCollector.i(5189);
        long j2 = this.mHandler;
        if (j2 == 0) {
            MethodCollector.o(5189);
            return -100000;
        }
        int nativeSlamGetTextBitmap = nativeSlamGetTextBitmap(j2, onARTextBitmapCallback);
        MethodCollector.o(5189);
        return nativeSlamGetTextBitmap;
    }

    public int stopRecord(boolean z) {
        MethodCollector.i(4235);
        long j2 = this.mHandler;
        if (j2 == 0) {
            MethodCollector.o(4235);
            return -100000;
        }
        int nativeStopRecord = nativeStopRecord(j2, z);
        MethodCollector.o(4235);
        return nativeStopRecord;
    }

    public void updateReactionBGAlpha(float f2) {
        MethodCollector.i(7203);
        long j2 = this.mHandler;
        if (j2 == 0) {
            MethodCollector.o(7203);
            return;
        }
        nativeUpdateReactionBGAlpha(j2, f2);
        MethodCollector.o(7203);
    }

    public void useLargeMattingModel(boolean z) {
        MethodCollector.i(6139);
        long j2 = this.mHandler;
        if (j2 == 0) {
            an.d("RecordInvoker", "invalid handle");
            MethodCollector.o(6139);
            return;
        }
        nativeUseLargeMattingModel(j2, z);
        MethodCollector.o(6139);
    }

    private void onNativeCallback_Init(int i2) {
        if (i2 < 0) {
            an.d("RecordInvoker", "onNativeCallback_Init error = ".concat(String.valueOf(i2)));
        } else {
            this.mIsRenderReady = true;
            an.a("RecordInvoker", "onNativeCallback_Init success = ".concat(String.valueOf(i2)));
        }
        com.ss.android.medialib.listener.b bVar = this.mNativeInitListener;
        if (bVar != null) {
            bVar.a(i2);
        }
        com.ss.android.medialib.listener.b bVar2 = sNativeInitListener;
        if (bVar2 != null) {
            bVar2.a(i2);
        }
        this.mIsRenderReady = true;
    }

    public synchronized int changeMusicPath(String str) {
        MethodCollector.i(4861);
        long j2 = this.mHandler;
        if (j2 == 0) {
            MethodCollector.o(4861);
            return -100000;
        }
        int nativeChangeMusicPath = nativeChangeMusicPath(j2, str);
        MethodCollector.o(4861);
        return nativeChangeMusicPath;
    }

    public synchronized int changeSurface(Surface surface) {
        MethodCollector.i(4670);
        long j2 = this.mHandler;
        if (j2 == 0) {
            MethodCollector.o(4670);
            return -100000;
        }
        int nativeChangeSurface = nativeChangeSurface(j2, surface);
        MethodCollector.o(4670);
        return nativeChangeSurface;
    }

    public int enableDuetGlFinish(boolean z) {
        MethodCollector.i(7123);
        long j2 = this.mHandler;
        if (j2 == 0) {
            an.d("RecordInvoker", "Native instance handle == 0 invalid.");
            MethodCollector.o(7123);
            return -100000;
        }
        int nativeEnableDuetGlFinish = nativeEnableDuetGlFinish(j2, z);
        MethodCollector.o(7123);
        return nativeEnableDuetGlFinish;
    }

    public int enableGetPropTrack(boolean z) {
        MethodCollector.i(7151);
        long j2 = this.mHandler;
        if (j2 == 0) {
            an.d("RecordInvoker", "Native instance handle == 0 invalid.");
            MethodCollector.o(7151);
            return -100000;
        }
        int natvieEnableGetPropTrack = natvieEnableGetPropTrack(j2, z);
        MethodCollector.o(7151);
        return natvieEnableGetPropTrack;
    }

    public int enableRecordMaxDuration(boolean z) {
        MethodCollector.i(7110);
        long j2 = this.mHandler;
        if (j2 == 0) {
            an.d("RecordInvoker", "Native instance handle == 0 invalid.");
            MethodCollector.o(7110);
            return -100000;
        }
        int nativeEnableRecordMaxDuration = nativeEnableRecordMaxDuration(j2, z);
        MethodCollector.o(7110);
        return nativeEnableRecordMaxDuration;
    }

    public boolean fetchDistortionInfo(DistortionInfoCallback distortionInfoCallback) {
        MethodCollector.i(5551);
        long j2 = this.mHandler;
        if (j2 == 0) {
            MethodCollector.o(5551);
            return false;
        } else if (nativeFetchDistortionInfo(j2, distortionInfoCallback) == 0) {
            MethodCollector.o(5551);
            return true;
        } else {
            MethodCollector.o(5551);
            return false;
        }
    }

    public String getResourceMultiViewTag(String str) {
        MethodCollector.i(5195);
        long j2 = this.mHandler;
        if (j2 == 0) {
            an.d("RecordInvoker", "invalid handle");
            MethodCollector.o(5195);
            return null;
        }
        String nativeGetResourceMultiViewTag = nativeGetResourceMultiViewTag(j2, str);
        MethodCollector.o(5195);
        return nativeGetResourceMultiViewTag;
    }

    public int initImageDrawer(int i2) {
        MethodCollector.i(6143);
        long j2 = this.mHandler;
        if (j2 == 0) {
            an.d("RecordInvoker", "invalid handle");
            MethodCollector.o(6143);
            return -100000;
        }
        int nativeInitImageDrawer = nativeInitImageDrawer(j2, i2);
        MethodCollector.o(6143);
        return nativeInitImageDrawer;
    }

    public int initMediaCodecSurface(Surface surface) {
        MethodCollector.i(7297);
        long j2 = this.mHandler;
        if (j2 == 0) {
            an.d("RecordInvoker", "invalid handle");
            MethodCollector.o(7297);
            return -100000;
        }
        int nativeInitMediaCodecSurface = nativeInitMediaCodecSurface(j2, surface);
        MethodCollector.o(7297);
        return nativeInitMediaCodecSurface;
    }

    public boolean isGestureRegistered(af afVar) {
        int ordinal;
        MethodCollector.i(6858);
        if (this.mHandler == 0) {
            an.d("RecordInvoker", "Native instance handle == 0 invalid.");
            MethodCollector.o(6858);
            return false;
        }
        if (afVar.ordinal() == af.ANY_SUPPORTED.ordinal()) {
            ordinal = -1;
        } else {
            ordinal = afVar.ordinal();
        }
        boolean nativeIsGestureRegistered = nativeIsGestureRegistered(this.mHandler, ordinal);
        MethodCollector.o(6858);
        return nativeIsGestureRegistered;
    }

    public void pauseEffectAudio(boolean z) {
        MethodCollector.i(5197);
        if (this.mHandler == 0) {
            an.d("RecordInvoker", "invalid handle");
            MethodCollector.o(5197);
            return;
        }
        if (isRenderReady()) {
            nativePauseEffectAudio(this.mHandler, z);
        }
        MethodCollector.o(5197);
    }

    public int setAudioDataInterface(long j2) {
        MethodCollector.i(7089);
        long j3 = this.mHandler;
        if (j3 == 0) {
            an.d("RecordInvoker", "Native instance handle == 0 invalid.");
            MethodCollector.o(7089);
            return -100000;
        }
        int nativeSetAudioDataInterface = nativeSetAudioDataInterface(j3, j2);
        MethodCollector.o(7089);
        return nativeSetAudioDataInterface;
    }

    public void setCameraFirstFrameOptimize(boolean z) {
        int i2;
        MethodCollector.i(4671);
        if (this.mHandler == 0) {
            MethodCollector.o(4671);
            return;
        }
        if (z) {
            i2 = getOptFirstFrameBypassEffectFrameCnt();
        } else {
            i2 = 3;
        }
        nativeSetCameraFirstFrameOptimize(this.mHandler, z, i2);
        MethodCollector.o(4671);
    }

    public int setCodecType(int i2) {
        MethodCollector.i(7094);
        long j2 = this.mHandler;
        if (j2 == 0) {
            an.d("RecordInvoker", "Native instance handle == 0 invalid.");
            MethodCollector.o(7094);
            return -100000;
        }
        int nativeSetCodecType = nativeSetCodecType(j2, i2);
        MethodCollector.o(7094);
        return nativeSetCodecType;
    }

    public int setComposerResourcePath(String str) {
        MethodCollector.i(6210);
        long j2 = this.mHandler;
        if (j2 == 0) {
            an.d("RecordInvoker", "Native instance handle == 0 invalid.");
            MethodCollector.o(6210);
            return -100000;
        }
        int nativeSetComposerResourcePath = nativeSetComposerResourcePath(j2, str);
        MethodCollector.o(6210);
        return nativeSetComposerResourcePath;
    }

    public int setEffectMaxMemoryCache(int i2) {
        MethodCollector.i(5212);
        long j2 = this.mHandler;
        if (j2 == 0) {
            an.d("RecordInvoker", "invalid handle");
            MethodCollector.o(5212);
            return -100000;
        }
        int nativeSetEffectMaxMemoryCache = nativeSetEffectMaxMemoryCache(j2, i2);
        MethodCollector.o(5212);
        return nativeSetEffectMaxMemoryCache;
    }

    public int setEnableEarBack(boolean z) {
        MethodCollector.i(7079);
        long j2 = this.mHandler;
        if (j2 == 0) {
            an.d("RecordInvoker", "Native instance handle == 0 invalid.");
            MethodCollector.o(7079);
            return -100000;
        }
        int nativeSetEnableEarBack = nativeSetEnableEarBack(j2, z);
        MethodCollector.o(7079);
        return nativeSetEnableEarBack;
    }

    public int setFaceMakeUp(String str) {
        MethodCollector.i(4587);
        long j2 = this.mHandler;
        if (j2 == 0) {
            an.d("RecordInvoker", "invalid handle");
            MethodCollector.o(4587);
            return -100000;
        }
        int nativeSetFaceMakeUp2 = nativeSetFaceMakeUp2(j2, str);
        MethodCollector.o(4587);
        return nativeSetFaceMakeUp2;
    }

    public int setFilter(String str) {
        MethodCollector.i(3734);
        long j2 = this.mHandler;
        if (j2 == 0) {
            MethodCollector.o(3734);
            return -100000;
        }
        int nativeSetFilter = nativeSetFilter(j2, str, str, 1.0f);
        MethodCollector.o(3734);
        return nativeSetFilter;
    }

    public int setHandDetectLowpower(boolean z) {
        MethodCollector.i(5378);
        long j2 = this.mHandler;
        if (j2 == 0) {
            an.d("RecordInvoker", "invalid handle");
            MethodCollector.o(5378);
            return -100000;
        }
        int nativeSetHandDetectLowpower = nativeSetHandDetectLowpower(j2, z);
        MethodCollector.o(5378);
        return nativeSetHandDetectLowpower;
    }

    public int setMusicNodes(String str) {
        MethodCollector.i(6135);
        long j2 = this.mHandler;
        if (j2 == 0) {
            an.d("RecordInvoker", "invalid handle");
            MethodCollector.o(6135);
            return -100000;
        }
        int nativeSetMusicNodes = nativeSetMusicNodes(j2, str);
        MethodCollector.o(6135);
        return nativeSetMusicNodes;
    }

    public int setRecordMaxDuration(long j2) {
        MethodCollector.i(7105);
        long j3 = this.mHandler;
        if (j3 == 0) {
            an.d("RecordInvoker", "Native instance handle == 0 invalid.");
            MethodCollector.o(7105);
            return -100000;
        }
        int nativeSetRecordMaxDuration = nativeSetRecordMaxDuration(j3, j2);
        MethodCollector.o(7105);
        return nativeSetRecordMaxDuration;
    }

    public int setRecordPrepareTime(long j2) {
        MethodCollector.i(5221);
        long j3 = this.mHandler;
        if (j3 == 0) {
            an.d("RecordInvoker", "invalid handle");
            MethodCollector.o(5221);
            return -108;
        }
        int nativeSetRecordPrepareTime = nativeSetRecordPrepareTime(j3, j2);
        MethodCollector.o(5221);
        return nativeSetRecordPrepareTime;
    }

    public int setReshapeResource(String str) {
        MethodCollector.i(4516);
        long j2 = this.mHandler;
        if (j2 == 0) {
            an.d("RecordInvoker", "invalid handle");
            MethodCollector.o(4516);
            return -100000;
        }
        int nativeSetReshapeResource = nativeSetReshapeResource(j2, str);
        MethodCollector.o(4516);
        return nativeSetReshapeResource;
    }

    public boolean setSharedTextureStatus(boolean z) {
        MethodCollector.i(4595);
        if (this.mHandler == 0) {
            an.d("RecordInvoker", "invalid handle");
            MethodCollector.o(4595);
            return false;
        }
        boolean nativeSetSharedTextureStatus = nativeSetSharedTextureStatus(z);
        MethodCollector.o(4595);
        return nativeSetSharedTextureStatus;
    }

    public int setSkinTone(String str) {
        MethodCollector.i(4593);
        long j2 = this.mHandler;
        if (j2 == 0) {
            an.d("RecordInvoker", "invalid handle");
            MethodCollector.o(4593);
            return -100000;
        }
        int nativeSetSkinTone = nativeSetSkinTone(j2, str);
        MethodCollector.o(4593);
        return nativeSetSkinTone;
    }

    public int setSlamFace(Bitmap bitmap) {
        MethodCollector.i(5224);
        long j2 = this.mHandler;
        if (j2 == 0) {
            an.d("RecordInvoker", "invalid handle");
            MethodCollector.o(5224);
            return -100000;
        }
        int nativeSetSlamFace = nativeSetSlamFace(j2, bitmap);
        MethodCollector.o(5224);
        return nativeSetSlamFace;
    }

    public int setVEEffectParams(VEEffectParams vEEffectParams) {
        MethodCollector.i(5214);
        long j2 = this.mHandler;
        if (j2 == 0) {
            an.d("RecordInvoker", "invalid handle");
            MethodCollector.o(5214);
            return -100000;
        }
        int nativeSetVEEffectParams = nativeSetVEEffectParams(j2, vEEffectParams);
        MethodCollector.o(5214);
        return nativeSetVEEffectParams;
    }

    public void setVideoEncodeRotation(int i2) {
        MethodCollector.i(4655);
        if (this.mHandler == 0) {
            an.d("RecordInvoker", "invalid handle");
            MethodCollector.o(4655);
            return;
        }
        a.f59655c = i2;
        nativeSetVideoEncodeRotation(this.mHandler, i2);
        MethodCollector.o(4655);
    }

    public int slamGetTextLimitCount(OnARTextCountCallback onARTextCountCallback) {
        MethodCollector.i(5183);
        long j2 = this.mHandler;
        if (j2 == 0) {
            an.d("RecordInvoker", "invalid handle");
            MethodCollector.o(5183);
            return -100000;
        }
        int nativeSlamGetTextLimitCount = nativeSlamGetTextLimitCount(j2, onARTextCountCallback);
        MethodCollector.o(5183);
        return nativeSlamGetTextLimitCount;
    }

    public int slamGetTextParagraphContent(OnARTextContentCallback onARTextContentCallback) {
        MethodCollector.i(5187);
        long j2 = this.mHandler;
        if (j2 == 0) {
            an.d("RecordInvoker", "invalid handle");
            MethodCollector.o(5187);
            return -100000;
        }
        int nativeSlamGetTextParagraphContent = nativeSlamGetTextParagraphContent(j2, onARTextContentCallback);
        MethodCollector.o(5187);
        return nativeSlamGetTextParagraphContent;
    }

    public int slamNotifyHideKeyBoard(boolean z) {
        MethodCollector.i(5178);
        long j2 = this.mHandler;
        if (j2 == 0) {
            an.d("RecordInvoker", "invalid handle");
            MethodCollector.o(5178);
            return -100000;
        }
        int nativeHideSlamKeyBoard = nativeHideSlamKeyBoard(j2, z);
        MethodCollector.o(5178);
        return nativeHideSlamKeyBoard;
    }

    public int slamSetLanguge(String str) {
        MethodCollector.i(5181);
        long j2 = this.mHandler;
        if (j2 == 0) {
            an.d("RecordInvoker", "invalid handle");
            MethodCollector.o(5181);
            return -100000;
        }
        int nativeSlamSetLanguge = nativeSlamSetLanguge(j2, str);
        MethodCollector.o(5181);
        return nativeSlamSetLanguge;
    }

    public boolean swapMainAndPipRenderTarget(boolean z) {
        MethodCollector.i(5630);
        long j2 = this.mHandler;
        if (j2 == 0) {
            an.d("ae_style", "ae_style, swap failed, no proxy");
            MethodCollector.o(5630);
            return false;
        } else if (nativeSwapMainAndPipRenderTarget(j2, z) == 0) {
            MethodCollector.o(5630);
            return true;
        } else {
            MethodCollector.o(5630);
            return false;
        }
    }

    public void onNativeCallback_onLandMarkDetect(boolean z) {
        MethodCollector.i(5434);
        ArrayList<al> arrayList = new ArrayList();
        synchronized (RecordInvoker.class) {
            try {
                for (al alVar : this.mLandmarkDetectListeners) {
                    arrayList.add(alVar);
                }
            } finally {
                MethodCollector.o(5434);
            }
        }
        for (al alVar2 : arrayList) {
            if (alVar2 != null) {
                alVar2.a(z);
            }
        }
    }

    public void onNativeCallback_onSlamDetect(boolean z) {
        MethodCollector.i(5262);
        ArrayList<com.ss.android.medialib.listener.c> arrayList = new ArrayList();
        synchronized (RecordInvoker.class) {
            try {
                for (com.ss.android.medialib.listener.c cVar : sSlamDetectListeners) {
                    arrayList.add(cVar);
                }
                for (com.ss.android.medialib.listener.c cVar2 : this.mSlamDetectListeners) {
                    arrayList.add(cVar2);
                }
            } finally {
                MethodCollector.o(5262);
            }
        }
        for (com.ss.android.medialib.listener.c cVar3 : arrayList) {
            if (cVar3 != null) {
                cVar3.a();
            }
        }
    }

    public void setCustomVideoBg(String str, String str2) {
        MethodCollector.i(7329);
        nativeSetCustomVideoBgGif(this.mHandler, str, str2);
        MethodCollector.o(7329);
    }

    public void changeDuetVideo(String str, String str2) {
        MethodCollector.i(6553);
        long j2 = this.mHandler;
        if (j2 == 0) {
            MethodCollector.o(6553);
            return;
        }
        nativeChangeDuetVideo(j2, str, str2);
        MethodCollector.o(6553);
    }

    public void changeOutputVideoSize(int i2, int i3) {
        MethodCollector.i(5618);
        long j2 = this.mHandler;
        if (j2 == 0) {
            MethodCollector.o(5618);
            return;
        }
        nativeChangeOutputVideoSize(j2, i2, i3);
        MethodCollector.o(5618);
    }

    public void enableLensProcess(int i2, boolean z) {
        MethodCollector.i(7432);
        long j2 = this.mHandler;
        if (j2 == 0) {
            an.d("RecordInvoker", "Native instance handle == 0 invalid.");
            MethodCollector.o(7432);
            return;
        }
        nativeEnableLensProcess(j2, i2, z);
        MethodCollector.o(7432);
    }

    public void initHDRNetDetectExtParam(boolean z, String str) {
        MethodCollector.i(4859);
        long j2 = this.mHandler;
        if (j2 == 0) {
            MethodCollector.o(4859);
            return;
        }
        nativeInitHDRNetDetectExtParam(j2, z, str);
        MethodCollector.o(4859);
    }

    public void onAudioCallback(byte[] bArr, int i2) {
        MethodCollector.i(5613);
        if (this.mHandler == 0) {
            MethodCollector.o(5613);
            return;
        }
        if (isRenderReady()) {
            nativeOnAudioCallback(this.mHandler, bArr, i2);
        }
        MethodCollector.o(5613);
    }

    public void onNativeCallback_onFaceDetect(int i2, int i3) {
        an.b("RecordInvoker", "BeautyInvoker onFaceDetect ".concat(String.valueOf(i3)));
        com.ss.android.medialib.listener.a aVar = sFaceDetectListener;
        if (aVar != null) {
            aVar.a(i2, i3);
        }
        com.ss.android.medialib.listener.a aVar2 = this.mFaceDetectListener;
        if (aVar2 != null) {
            aVar2.a(i2, i3);
        }
    }

    public boolean posInReactionRegion(int i2, int i3) {
        MethodCollector.i(7129);
        long j2 = this.mHandler;
        if (j2 == 0) {
            MethodCollector.o(7129);
            return false;
        }
        boolean nativePosInReactionRegion = nativePosInReactionRegion(j2, i2, i3);
        MethodCollector.o(7129);
        return nativePosInReactionRegion;
    }

    public int postDuetAction(int i2, long j2) {
        MethodCollector.i(7491);
        int nativePostDuetAction = nativePostDuetAction(this.mHandler, i2, j2);
        MethodCollector.o(7491);
        return nativePostDuetAction;
    }

    public void registerFaceResultCallback(boolean z, FaceResultCallback faceResultCallback) {
        MethodCollector.i(5386);
        long j2 = this.mHandler;
        if (j2 == 0) {
            an.d("RecordInvoker", "invalid handle");
            MethodCollector.o(5386);
            return;
        }
        nativeRegisterFaceResultCallback(j2, z, faceResultCallback);
        MethodCollector.o(5386);
    }

    public void registerHandDetectCallback(int[] iArr, OnHandDetectCallback onHandDetectCallback) {
        MethodCollector.i(6013);
        long j2 = this.mHandler;
        if (j2 == 0) {
            an.d("RecordInvoker", "invalid handle");
            MethodCollector.o(6013);
            return;
        }
        nativeRegisterHandDetectCallback(j2, iArr, onHandDetectCallback);
        MethodCollector.o(6013);
    }

    public void setAlgorithmChangeMsg(int i2, boolean z) {
        MethodCollector.i(5375);
        long j2 = this.mHandler;
        if (j2 == 0) {
            an.d("RecordInvoker", "invalid handle");
            MethodCollector.o(5375);
            return;
        }
        nativeSetAlgorithmChangeMsg(j2, i2, z);
        MethodCollector.o(5375);
    }

    public int setBGMVolume(float f2, int i2) {
        MethodCollector.i(5276);
        long j2 = this.mHandler;
        if (j2 == 0) {
            MethodCollector.o(5276);
            return -100000;
        }
        int nativeSetBGMVolume = nativeSetBGMVolume(j2, f2, i2);
        MethodCollector.o(5276);
        return nativeSetBGMVolume;
    }

    public void setCamPreviewSize(int i2, int i3) {
        MethodCollector.i(4754);
        long j2 = this.mHandler;
        if (j2 == 0) {
            MethodCollector.o(4754);
            return;
        }
        try {
            nativeSetCamPreviewSize(j2, i2, i3);
            MethodCollector.o(4754);
        } catch (Throwable unused) {
            MethodCollector.o(4754);
        }
    }

    public void setCaptureRenderWidth(int i2, int i3) {
        MethodCollector.i(5902);
        long j2 = this.mHandler;
        if (j2 == 0) {
            MethodCollector.o(5902);
            return;
        }
        nativeSetCaptureRenderWidth(j2, i2, i3);
        MethodCollector.o(5902);
    }

    public int setFilterNew(String str, float f2) {
        MethodCollector.i(3392);
        long j2 = this.mHandler;
        if (j2 == 0) {
            MethodCollector.o(3392);
            return -100000;
        }
        int nativeSetFilterNew = nativeSetFilterNew(j2, str, f2);
        MethodCollector.o(3392);
        return nativeSetFilterNew;
    }

    public void setKaraoke(boolean z, boolean z2) {
        MethodCollector.i(5223);
        long j2 = this.mHandler;
        if (j2 == 0) {
            an.d("RecordInvoker", "invalid handle");
            MethodCollector.o(5223);
            return;
        }
        nativeSetKaraoke(j2, z, z2);
        MethodCollector.o(5223);
    }

    public void setReactionBorderParam(int i2, int i3) {
        MethodCollector.i(7118);
        long j2 = this.mHandler;
        if (j2 == 0) {
            MethodCollector.o(7118);
            return;
        }
        nativeSetReactionBorderParam(j2, i2, i3);
        MethodCollector.o(7118);
    }

    public boolean setReactionMaskImage(String str, boolean z) {
        MethodCollector.i(7121);
        long j2 = this.mHandler;
        if (j2 == 0) {
            MethodCollector.o(7121);
            return false;
        }
        boolean nativeSetReactionMaskImage = nativeSetReactionMaskImage(j2, str, z);
        MethodCollector.o(7121);
        return nativeSetReactionMaskImage;
    }

    public void setRenderCacheString(String str, String str2) {
        MethodCollector.i(6206);
        long j2 = this.mHandler;
        if (j2 == 0) {
            an.d("RecordInvoker", "invalid handle");
            MethodCollector.o(6206);
            return;
        }
        nativeSetRenderCacheString(j2, str, str2);
        MethodCollector.o(6206);
    }

    public void setRenderCacheTexture(String str, String str2) {
        MethodCollector.i(6203);
        long j2 = this.mHandler;
        if (j2 == 0) {
            an.d("RecordInvoker", "invalid handle");
            MethodCollector.o(6203);
            return;
        }
        nativeSetRenderCacheTexture(j2, str, str2);
        MethodCollector.o(6203);
    }

    public int setVideoQuality(int i2, int i3) {
        MethodCollector.i(5273);
        long j2 = this.mHandler;
        if (j2 == 0) {
            MethodCollector.o(5273);
            return -100000;
        }
        int nativeSetVideoQuality = nativeSetVideoQuality(j2, i2, i3);
        MethodCollector.o(5273);
        return nativeSetVideoQuality;
    }

    public int tryRestore(int i2, String str) {
        MethodCollector.i(4233);
        long j2 = this.mHandler;
        if (j2 == 0) {
            MethodCollector.o(4233);
            return -100000;
        }
        int nativeTryRestore = nativeTryRestore(j2, i2, str);
        MethodCollector.o(4233);
        return nativeTryRestore;
    }

    public void updateAlgorithmRuntimeParam(int i2, float f2) {
        MethodCollector.i(4746);
        long j2 = this.mHandler;
        if (j2 == 0) {
            MethodCollector.o(4746);
            return;
        }
        nativeUpdateAlgorithmRuntimeParam(j2, i2, f2);
        MethodCollector.o(4746);
    }

    public boolean addMetadata(String str, String str2) {
        MethodCollector.i(5549);
        long j2 = this.mHandler;
        if (j2 == 0) {
            an.d("RecordInvoker", "recorder add metadata failed, no env...");
            MethodCollector.o(5549);
            return false;
        } else if (nativeAddMetadata(j2, str, str2) == 0) {
            MethodCollector.o(5549);
            return true;
        } else {
            MethodCollector.o(5549);
            return false;
        }
    }

    public synchronized int animateImageToPreview(String str, String str2) {
        MethodCollector.i(6630);
        if (this.mHandler == 0) {
            an.d("RecordInvoker", "Native instance handle == 0 invalid.");
            MethodCollector.o(6630);
            return -100000;
        }
        int nativeAnimateImageToPreview = nativeAnimateImageToPreview(this.mHandler, str, str2, com.ss.android.medialib.b.b.a(str2));
        MethodCollector.o(6630);
        return nativeAnimateImageToPreview;
    }

    public int appendComposerNodes(String[] strArr, int i2) {
        MethodCollector.i(6400);
        long j2 = this.mHandler;
        if (j2 == 0) {
            an.d("RecordInvoker", "Native instance handle == 0 invalid.");
            MethodCollector.o(6400);
            return -100000;
        }
        int nativeAppendComposerNodes = nativeAppendComposerNodes(j2, strArr, i2);
        MethodCollector.o(6400);
        return nativeAppendComposerNodes;
    }

    public int[] checkComposerNodeExclusion(String str, String str2) {
        MethodCollector.i(6538);
        long j2 = this.mHandler;
        if (j2 == 0) {
            an.d("RecordInvoker", "Native instance handle == 0 invalid.");
            int[] iArr = {-1, 0};
            MethodCollector.o(6538);
            return iArr;
        }
        int[] nativeCheckComposerNodeExclusion = nativeCheckComposerNodeExclusion(j2, str, null, str2);
        MethodCollector.o(6538);
        return nativeCheckComposerNodeExclusion;
    }

    public void enableAudioLoudnessBalanceFilter(boolean z, double d2) {
        MethodCollector.i(7513);
        long j2 = this.mHandler;
        if (j2 == 0) {
            an.d("RecordInvoker", "Native instance handle == 0 invalid.");
            MethodCollector.o(7513);
            return;
        }
        nativeEnableAudioLoudnessBalanceFilter(j2, z, d2);
        MethodCollector.o(7513);
    }

    public void enableScan(boolean z, long j2) {
        MethodCollector.i(5769);
        long j3 = this.mHandler;
        if (j3 == 0) {
            an.d("RecordInvoker", "invalid handle");
            MethodCollector.o(5769);
            return;
        }
        nativeEnableScan(j3, z, j2);
        MethodCollector.o(5769);
    }

    public float getComposerNodeValue(String str, String str2) {
        MethodCollector.i(6530);
        long j2 = this.mHandler;
        if (j2 == 0) {
            an.d("RecordInvoker", "Native instance handle == 0 invalid.");
            MethodCollector.o(6530);
            return -100000.0f;
        }
        float nativeGetComposerNodeValue = nativeGetComposerNodeValue(j2, str, str2);
        MethodCollector.o(6530);
        return nativeGetComposerNodeValue;
    }

    public void handleEffectAudio(boolean z, long j2) {
        MethodCollector.i(5199);
        if (this.mHandler == 0) {
            an.d("RecordInvoker", "invalid handle");
            MethodCollector.o(5199);
            return;
        }
        if (isRenderReady()) {
            nativeHandleEffectAudio(this.mHandler, z, j2);
        }
        MethodCollector.o(5199);
    }

    public void onNativeCallback_InitHardEncoderRet(int i2, int i3) {
        an.a("RecordInvoker", "onInitHardEncoderRet");
        an.a("RecordInvoker", "isCPUEncode = ".concat(String.valueOf(i2)));
        com.ss.android.medialib.listener.b bVar = this.mNativeInitListener;
        if (bVar != null) {
            bVar.a(i2, i3);
        }
        com.ss.android.medialib.listener.b bVar2 = sNativeInitListener;
        if (bVar2 != null) {
            bVar2.a(i2, i3);
        }
    }

    public synchronized void onNativeCallback_onShotScreen(int i2, long j2) {
        MethodCollector.i(5447);
        an.b("RecordInvoker", "onNativeCallback_onShotScreen: ret = " + i2 + ", timeStamp = " + j2);
        this.mIsDuringScreenshot = false;
        a.c cVar = this.mShotScreenCallback;
        if (cVar != null) {
            cVar.a(i2);
        }
        MethodCollector.o(5447);
    }

    public int processTouchEvent(float f2, float f3) {
        MethodCollector.i(5155);
        if (this.mHandler == 0) {
            an.d("RecordInvoker", "invalid handle");
            MethodCollector.o(5155);
            return -100000;
        } else if (!isRenderReady()) {
            MethodCollector.o(5155);
            return -100001;
        } else {
            int nativeProcessTouchEvent = nativeProcessTouchEvent(this.mHandler, f2, f3);
            MethodCollector.o(5155);
            return nativeProcessTouchEvent;
        }
    }

    public int reloadComposerNodes(String[] strArr, int i2) {
        MethodCollector.i(6399);
        long j2 = this.mHandler;
        if (j2 == 0) {
            an.d("RecordInvoker", "Native instance handle == 0 invalid.");
            MethodCollector.o(6399);
            return -100000;
        }
        int nativeReloadComposerNodes = nativeReloadComposerNodes(j2, strArr, i2);
        MethodCollector.o(6399);
        return nativeReloadComposerNodes;
    }

    public int removeComposerNodes(String[] strArr, int i2) {
        MethodCollector.i(6444);
        long j2 = this.mHandler;
        if (j2 == 0) {
            an.d("RecordInvoker", "Native instance handle == 0 invalid.");
            MethodCollector.o(6444);
            return -100000;
        }
        int nativeRemoveComposerNodes = nativeRemoveComposerNodes(j2, strArr, i2);
        MethodCollector.o(6444);
        return nativeRemoveComposerNodes;
    }

    public int removeTrack(int i2, int i3) {
        MethodCollector.i(5218);
        long j2 = this.mHandler;
        if (j2 == 0) {
            an.d("RecordInvoker", "invalid handle");
            MethodCollector.o(5218);
            return -108;
        }
        int nativeRemoveTrack = nativeRemoveTrack(j2, i2, i3);
        MethodCollector.o(5218);
        return nativeRemoveTrack;
    }

    public int setAlgorithmPreConfig(int i2, int i3) {
        MethodCollector.i(6391);
        long j2 = this.mHandler;
        if (j2 == 0) {
            an.d("RecordInvoker", "Native instance handle == 0 invalid.");
            MethodCollector.o(6391);
            return -100000;
        }
        int nativeSetAlgorithmPreConfig = nativeSetAlgorithmPreConfig(j2, i2, i3);
        MethodCollector.o(6391);
        return nativeSetAlgorithmPreConfig;
    }

    public int setBeautyFace(int i2, String str) {
        MethodCollector.i(4506);
        long j2 = this.mHandler;
        if (j2 == 0) {
            an.d("RecordInvoker", "invalid handle");
            MethodCollector.o(4506);
            return -100000;
        }
        int nativeSetBeautyFace = nativeSetBeautyFace(j2, i2, str);
        MethodCollector.o(4506);
        return nativeSetBeautyFace;
    }

    public int setBeautyFaceIntensity(float f2, float f3) {
        MethodCollector.i(4511);
        long j2 = this.mHandler;
        if (j2 == 0) {
            an.d("RecordInvoker", "invalid handle");
            MethodCollector.o(4511);
            return -100000;
        }
        int nativeSetBeautyFaceIntensity = nativeSetBeautyFaceIntensity(j2, f2, f3);
        MethodCollector.o(4511);
        return nativeSetBeautyFaceIntensity;
    }

    public int setComposerMode(int i2, int i3) {
        MethodCollector.i(6396);
        long j2 = this.mHandler;
        if (j2 == 0) {
            an.d("RecordInvoker", "Native instance handle == 0 invalid.");
            MethodCollector.o(6396);
            return -100000;
        }
        int nativeSetComposerMode = nativeSetComposerMode(j2, i2, i3);
        MethodCollector.o(6396);
        return nativeSetComposerMode;
    }

    public int setComposerNodes(String[] strArr, int i2) {
        MethodCollector.i(6214);
        long j2 = this.mHandler;
        if (j2 == 0) {
            an.d("RecordInvoker", "Native instance handle == 0 invalid.");
            MethodCollector.o(6214);
            return -100000;
        }
        int nativeSetComposerNodes = nativeSetComposerNodes(j2, strArr, i2);
        MethodCollector.o(6214);
        return nativeSetComposerNodes;
    }

    public void setDeviceRotation(float[] fArr, double d2) {
        MethodCollector.i(7579);
        if (this.mHandler == 0) {
            MethodCollector.o(7579);
            return;
        }
        if (isRenderReady()) {
            nativeSetDeviceRotationWithStamp(this.mHandler, fArr, d2);
        }
        MethodCollector.o(7579);
    }

    public int setEnableAEC(boolean z, String str) {
        MethodCollector.i(7019);
        long j2 = this.mHandler;
        if (j2 == 0) {
            an.d("RecordInvoker", "Native instance handle == 0 invalid.");
            MethodCollector.o(7019);
            return -100000;
        }
        int nativeSetEnableAEC = nativeSetEnableAEC(j2, z, str);
        MethodCollector.o(7019);
        return nativeSetEnableAEC;
    }

    public int setIntensityByType(int i2, float f2) {
        MethodCollector.i(4873);
        long j2 = this.mHandler;
        if (j2 == 0) {
            an.d("RecordInvoker", "invalid handle");
            MethodCollector.o(4873);
            return -100000;
        }
        int nativeSetIntensityByType = nativeSetIntensityByType(j2, i2, f2);
        MethodCollector.o(4873);
        return nativeSetIntensityByType;
    }

    public int setLoudness(boolean z, int i2) {
        MethodCollector.i(7073);
        long j2 = this.mHandler;
        if (j2 == 0) {
            an.d("RecordInvoker", "Native instance handle == 0 invalid.");
            MethodCollector.o(7073);
            return -100000;
        }
        int nativeSetLoudness = nativeSetLoudness(j2, z, i2);
        MethodCollector.o(7073);
        return nativeSetLoudness;
    }

    public int setSafeArea(int i2, VESafeAreaParams[] vESafeAreaParamsArr) {
        MethodCollector.i(7504);
        long j2 = this.mHandler;
        if (j2 == 0) {
            an.d("RecordInvoker", "set safearea invalid handle");
            MethodCollector.o(7504);
            return -100000;
        } else if (vESafeAreaParamsArr == null) {
            int nativeSetSafeArea = nativeSetSafeArea(j2, i2, null, 0);
            MethodCollector.o(7504);
            return nativeSetSafeArea;
        } else {
            int nativeSetSafeArea2 = nativeSetSafeArea(j2, i2, vESafeAreaParamsArr, vESafeAreaParamsArr.length);
            MethodCollector.o(7504);
            return nativeSetSafeArea2;
        }
    }

    public int slamProcessDoubleClickEvent(float f2, float f3) {
        MethodCollector.i(5174);
        if (this.mHandler == 0) {
            an.d("RecordInvoker", "invalid handle");
            MethodCollector.o(5174);
            return -100000;
        } else if (!isRenderReady()) {
            MethodCollector.o(5174);
            return -100001;
        } else {
            int nativeSlamProcessDoubleClickEvent = nativeSlamProcessDoubleClickEvent(this.mHandler, f2, f3);
            MethodCollector.o(5174);
            return nativeSlamProcessDoubleClickEvent;
        }
    }

    public int slamProcessIngestOri(double[] dArr, double d2) {
        MethodCollector.i(5139);
        if (this.mHandler == 0) {
            an.d("RecordInvoker", "invalid handle");
            MethodCollector.o(5139);
            return -100000;
        } else if (!isRenderReady()) {
            MethodCollector.o(5139);
            return -100001;
        } else {
            int nativeSlamProcessIngestOri = nativeSlamProcessIngestOri(this.mHandler, dArr, d2);
            MethodCollector.o(5139);
            return nativeSlamProcessIngestOri;
        }
    }

    public int slamProcessRotationEvent(float f2, float f3) {
        MethodCollector.i(5170);
        if (this.mHandler == 0) {
            an.d("RecordInvoker", "invalid handle");
            MethodCollector.o(5170);
            return -100000;
        } else if (!isRenderReady()) {
            MethodCollector.o(5170);
            return -100001;
        } else {
            int nativeSlamProcessRotationEvent = nativeSlamProcessRotationEvent(this.mHandler, f2, f3);
            MethodCollector.o(5170);
            return nativeSlamProcessRotationEvent;
        }
    }

    public int slamProcessScaleEvent(float f2, float f3) {
        MethodCollector.i(5167);
        if (this.mHandler == 0) {
            an.d("RecordInvoker", "invalid handle");
            MethodCollector.o(5167);
            return -100000;
        } else if (!isRenderReady()) {
            MethodCollector.o(5167);
            return -100001;
        } else {
            int nativeSlamProcessScaleEvent = nativeSlamProcessScaleEvent(this.mHandler, f2, f3);
            MethodCollector.o(5167);
            return nativeSlamProcessScaleEvent;
        }
    }

    public int slamProcessTouchEvent(float f2, float f3) {
        MethodCollector.i(5148);
        if (this.mHandler == 0) {
            an.d("RecordInvoker", "invalid handle");
            MethodCollector.o(5148);
            return -100000;
        } else if (!isRenderReady()) {
            MethodCollector.o(5148);
            return -100001;
        } else {
            int nativeSlamProcessTouchEvent = nativeSlamProcessTouchEvent(this.mHandler, f2, f3);
            MethodCollector.o(5148);
            return nativeSlamProcessTouchEvent;
        }
    }

    public boolean suspendGestureRecognizer(af afVar, boolean z) {
        int ordinal;
        MethodCollector.i(6946);
        if (this.mHandler == 0) {
            an.d("RecordInvoker", "Native instance handle == 0 invalid.");
            MethodCollector.o(6946);
            return false;
        }
        if (afVar.ordinal() == af.ANY_SUPPORTED.ordinal()) {
            ordinal = -1;
        } else {
            ordinal = afVar.ordinal();
        }
        boolean nativeSuspendGestureRecognizer = nativeSuspendGestureRecognizer(this.mHandler, ordinal, z);
        MethodCollector.o(6946);
        return nativeSuspendGestureRecognizer;
    }

    public boolean processTouchEvent(bh bhVar, int i2) {
        MethodCollector.i(6709);
        long j2 = this.mHandler;
        if (j2 == 0) {
            an.d("RecordInvoker", "Native instance handle == 0 invalid.");
            MethodCollector.o(6709);
            return false;
        }
        boolean nativeProcessTouchEvent2 = nativeProcessTouchEvent2(j2, bhVar.f151096a, bhVar.f151098c, bhVar.f151099d, bhVar.f151100e, bhVar.f151101f, bhVar.f151097b.ordinal(), i2);
        MethodCollector.o(6709);
        return nativeProcessTouchEvent2;
    }

    public void setLensParams(VEBaseRecorderLensParams vEBaseRecorderLensParams, OnLensResultCallback onLensResultCallback) {
        MethodCollector.i(7406);
        if (this.mHandler == 0) {
            an.d("RecordInvoker", "Native instance handle == 0 invalid.");
            MethodCollector.o(7406);
            return;
        }
        int i2 = vEBaseRecorderLensParams.algorithmFlag;
        if (i2 == 21) {
            nativeSetTaintSceneDetectParams(this.mHandler, (VETaintSceneDetectParams) vEBaseRecorderLensParams, onLensResultCallback);
            MethodCollector.o(7406);
        } else if (i2 == 24) {
            nativeSetAdaptiveSharpenParams(this.mHandler, (VEAdaptiveSharpenParams) vEBaseRecorderLensParams, onLensResultCallback);
            MethodCollector.o(7406);
        } else if (i2 != 27) {
            MethodCollector.o(7406);
        } else {
            nativeSetLumaDetectParams(this.mHandler, (VELumaDetectParams) vEBaseRecorderLensParams, onLensResultCallback);
            MethodCollector.o(7406);
        }
    }

    public int onDrawFrame(ImageFrame imageFrame, boolean z) {
        MethodCollector.i(5136);
        if (this.mHandler == 0) {
            MethodCollector.o(5136);
            return -100000;
        }
        if (imageFrame.getBuf() != null) {
            nativeOnDrawFrameBuffer(this.mHandler, imageFrame.getBuf(), imageFrame.getBuf().length, imageFrame.getWidth(), imageFrame.getHeight(), z);
        } else {
            int i2 = Build.VERSION.SDK_INT;
            if (imageFrame.getFormat() == -2) {
                int[][] iArr = (int[][]) Array.newInstance(int.class, 3, 3);
                ByteBuffer[] byteBufferArr = new ByteBuffer[3];
                if (new g(imageFrame).a(iArr, byteBufferArr)) {
                    int nativeOnDrawFrameBuffer2 = nativeOnDrawFrameBuffer2(this.mHandler, byteBufferArr[0], iArr[0], byteBufferArr[1], iArr[1], byteBufferArr[2], iArr[2], imageFrame.getFormat(), imageFrame.getWidth(), imageFrame.getHeight(), z);
                    MethodCollector.o(5136);
                    return nativeOnDrawFrameBuffer2;
                }
            }
        }
        MethodCollector.o(5136);
        return -1;
    }

    public static void onNativeCallback_onMonitorLogFloat(String str, String str2, float f2) {
        h.a(str, str2, f2);
    }

    public static void onNativeCallback_onMonitorLogInt(String str, String str2, int i2) {
        h.a(str, str2, (long) i2);
    }

    public void onNativeCallback_encodeData(byte[] bArr, int i2, boolean z) {
        b bVar = this.mEncoderCaller;
        if (bVar != null) {
            bVar.onEncoderData(bArr, i2, z);
        }
    }

    public int initAudioPlayer(Context context, String str, long j2) {
        return initAudioPlayer(context, str, j2, false, false);
    }

    public int onNativeCallback_encodeTexture(int i2, int i3, boolean z) {
        b bVar = this.mEncoderCaller;
        if (bVar != null) {
            return bVar.onEncoderData(i2, i3, 0, z);
        }
        return 0;
    }

    public void initFaceBeautifyDetectExtParam(boolean z, boolean z2, boolean z3) {
        MethodCollector.i(4858);
        long j2 = this.mHandler;
        if (j2 == 0) {
            MethodCollector.o(4858);
            return;
        }
        nativeInitFaceBeautifyDetectExtParam(j2, z, z2, z3);
        MethodCollector.o(4858);
    }

    public void initFaceDetectExtParam(int i2, boolean z, boolean z2) {
        MethodCollector.i(4838);
        long j2 = this.mHandler;
        if (j2 == 0) {
            MethodCollector.o(4838);
            return;
        }
        nativeInitFaceDetectExtParam(j2, i2, z, z2);
        MethodCollector.o(4838);
    }

    public void initHandDetectExtParam(int i2, int i3, int i4) {
        MethodCollector.i(4844);
        long j2 = this.mHandler;
        if (j2 == 0) {
            MethodCollector.o(4844);
            return;
        }
        nativeInitHandDetectExtParam(j2, i2, i3, i4);
        MethodCollector.o(4844);
    }

    public void initReaction(Context context, String str, String str2) {
        MethodCollector.i(6724);
        long j2 = this.mHandler;
        if (j2 == 0) {
            MethodCollector.o(6724);
            return;
        }
        nativeInitReaction(j2, str);
        MethodCollector.o(6724);
    }

    public int initWavFile(int i2, int i3, double d2) {
        MethodCollector.i(5285);
        long j2 = this.mHandler;
        if (j2 == 0) {
            MethodCollector.o(5285);
            return -100000;
        }
        int nativeInitWavFile = nativeInitWavFile(j2, i2, i3, d2);
        MethodCollector.o(5285);
        return nativeInitWavFile;
    }

    public int onDrawFrame(int i2, float[] fArr, boolean z) {
        MethodCollector.i(5119);
        long j2 = this.mHandler;
        if (j2 == 0) {
            MethodCollector.o(5119);
            return -100000;
        }
        int nativeOnFrameAvailable = nativeOnFrameAvailable(j2, i2, fArr, z);
        MethodCollector.o(5119);
        return nativeOnFrameAvailable;
    }

    public void setCaptureResize(boolean z, int[] iArr, int[] iArr2) {
        MethodCollector.i(6303);
        setCaptureResize(this.mHandler, z, iArr, iArr2);
        MethodCollector.o(6303);
    }

    public int setFilter(String str, String str2, float f2) {
        MethodCollector.i(3737);
        long j2 = this.mHandler;
        if (j2 == 0) {
            MethodCollector.o(3737);
            return -100000;
        }
        int nativeSetFilter = nativeSetFilter(j2, str, str2, f2);
        MethodCollector.o(3737);
        return nativeSetFilter;
    }

    public void setPreviewSizeRatio(float f2, int i2, int i3) {
        MethodCollector.i(5112);
        long j2 = this.mHandler;
        if (j2 == 0) {
            MethodCollector.o(5112);
            return;
        }
        nativeSetPreviewSizeRatio(j2, f2, i2, i3);
        MethodCollector.o(5112);
    }

    public int setSticker(Bitmap bitmap, int i2, int i3) {
        MethodCollector.i(5625);
        long j2 = this.mHandler;
        if (j2 == 0) {
            MethodCollector.o(5625);
            return -100000;
        }
        int nativeSetSticker = nativeSetSticker(j2, bitmap, i2, i3);
        MethodCollector.o(5625);
        return nativeSetSticker;
    }

    public int startPrePlay(boolean z, int i2, boolean z2) {
        MethodCollector.i(4237);
        long j2 = this.mHandler;
        if (j2 == 0) {
            MethodCollector.o(4237);
            return -100000;
        }
        int nativeStartPrePlay = nativeStartPrePlay(j2, z, i2, z2);
        MethodCollector.o(4237);
        return nativeStartPrePlay;
    }

    public void updateRotation(float f2, float f3, float f4) {
        MethodCollector.i(7571);
        long j2 = this.mHandler;
        if (j2 == 0) {
            MethodCollector.o(7571);
            return;
        }
        nativeUpdateRotation(j2, f2, f3, f4);
        MethodCollector.o(7571);
    }

    public int bindEffectAudioProcessor(int i2, int i3, boolean z) {
        MethodCollector.i(6199);
        long j2 = this.mHandler;
        if (j2 == 0) {
            an.d("RecordInvoker", "invalid handle");
            MethodCollector.o(6199);
            return -100000;
        }
        int nativeBindEffectAudioProcessor = nativeBindEffectAudioProcessor(j2, i2, i3, z);
        MethodCollector.o(6199);
        return nativeBindEffectAudioProcessor;
    }

    public void enableAudioAlgorithmParam(boolean z, String str, String str2) {
        MethodCollector.i(7511);
        long j2 = this.mHandler;
        if (j2 == 0) {
            an.d("RecordInvoker", "Native instance handle == 0 invalid.");
            MethodCollector.o(7511);
            return;
        }
        nativeEnableAudioAlgorithmParam(j2, z, str, str2);
        MethodCollector.o(7511);
    }

    public void enableBachAlgorithm(boolean z, String str, String str2) {
        MethodCollector.i(7560);
        long j2 = this.mHandler;
        if (j2 == 0) {
            an.d("RecordInvoker", "Native instance handle == 0 invalid.");
            MethodCollector.o(7560);
            return;
        }
        nativeEnableBachAlgorithm(j2, z, str, str2);
        MethodCollector.o(7560);
    }

    public void recoverCherEffect(String[] strArr, double[] dArr, boolean[] zArr) {
        MethodCollector.i(6134);
        long j2 = this.mHandler;
        if (j2 == 0) {
            an.d("RecordInvoker", "invalid handle");
            MethodCollector.o(6134);
            return;
        }
        nativeRecoverCherEffect(j2, strArr, dArr, zArr);
        MethodCollector.o(6134);
    }

    public int seekTrack(int i2, int i3, long j2) {
        MethodCollector.i(5220);
        long j3 = this.mHandler;
        if (j3 == 0) {
            an.d("RecordInvoker", "invalid handle");
            MethodCollector.o(5220);
            return -108;
        }
        int nativeSeekTrack = nativeSeekTrack(j3, i2, i3, j2);
        MethodCollector.o(5220);
        return nativeSeekTrack;
    }

    public int setExternalFaceMakeupOpacity(String str, float f2, float f3) {
        MethodCollector.i(7193);
        long j2 = this.mHandler;
        if (j2 == 0) {
            an.d("RecordInvoker", "Native instance handle == 0 invalid.");
            MethodCollector.o(7193);
            return -100000;
        }
        int natvieSetExternalFaceMakeupOpacity = natvieSetExternalFaceMakeupOpacity(j2, str, f2, f3);
        MethodCollector.o(7193);
        return natvieSetExternalFaceMakeupOpacity;
    }

    public int setFrameCallback(OnFrameCallback onFrameCallback, boolean z, int i2) {
        MethodCollector.i(5626);
        long j2 = this.mHandler;
        if (j2 == 0) {
            MethodCollector.o(5626);
            return -100000;
        }
        try {
            int nativeSetFrameCallback = nativeSetFrameCallback(j2, onFrameCallback, z, i2);
            MethodCollector.o(5626);
            return nativeSetFrameCallback;
        } catch (Throwable unused) {
            MethodCollector.o(5626);
            return -1;
        }
    }

    public synchronized int setMusicTime(long j2, long j3, long j4) {
        MethodCollector.i(4974);
        long j5 = this.mHandler;
        if (j5 == 0) {
            MethodCollector.o(4974);
            return -100000;
        }
        int nativeSetMusicTime = nativeSetMusicTime(j5, j2, j3, j4);
        MethodCollector.o(4974);
        return nativeSetMusicTime;
    }

    public int setReshape(String str, float f2, float f3) {
        MethodCollector.i(4514);
        long j2 = this.mHandler;
        if (j2 == 0) {
            an.d("RecordInvoker", "invalid handle");
            MethodCollector.o(4514);
            return -100000;
        }
        int nativeSetReshape = nativeSetReshape(j2, str, f2, f3);
        MethodCollector.o(4514);
        return nativeSetReshape;
    }

    public int updateComposerNode(String str, String str2, float f2) {
        MethodCollector.i(6300);
        long j2 = this.mHandler;
        if (j2 == 0) {
            an.d("RecordInvoker", "Native instance handle == 0 invalid.");
            MethodCollector.o(6300);
            return -100000;
        }
        int nativeUpdateComposerNode = nativeUpdateComposerNode(j2, str, str2, f2);
        MethodCollector.o(6300);
        return nativeUpdateComposerNode;
    }

    public void updateRotation(int i2, boolean z, boolean z2) {
        MethodCollector.i(5121);
        long j2 = this.mHandler;
        if (j2 == 0) {
            MethodCollector.o(5121);
            return;
        }
        nativeUpdateRotationAndFront(j2, i2, z, z2);
        MethodCollector.o(5121);
    }

    public int addPCMData(byte[] bArr, int i2, long j2) {
        MethodCollector.i(5288);
        long j3 = 0;
        if (this.mHandler == 0) {
            MethodCollector.o(5288);
            return -100000;
        }
        if (j2 != 0) {
            long nanoTime = System.nanoTime() / 1000;
            j3 = nanoTime - j2;
            an.b("RecordInvoker", "nativeAddPCMData: delay = " + j3 + ", sysTime = " + nanoTime);
        }
        int nativeAddPCMData = nativeAddPCMData(this.mHandler, bArr, i2, j3);
        MethodCollector.o(5288);
        return nativeAddPCMData;
    }

    public int[] checkComposerNodeExclusion(String str, String str2, String str3) {
        MethodCollector.i(6612);
        long j2 = this.mHandler;
        if (j2 == 0) {
            an.d("RecordInvoker", "Native instance handle == 0 invalid.");
            int[] iArr = {-1, 0};
            MethodCollector.o(6612);
            return iArr;
        }
        int[] nativeCheckComposerNodeExclusion = nativeCheckComposerNodeExclusion(j2, str, str2, str3);
        MethodCollector.o(6612);
        return nativeCheckComposerNodeExclusion;
    }

    public void onFirstFrameRenderInfo(int i2, int i3, double d2) {
        if (i2 == 0) {
            double d3 = (double) com.ss.android.medialib.log.a.f59739a;
            Double.isNaN(d3);
            h.a(0, "te_preview_first_frame_screen_time", d2 - d3);
            StringBuilder sb = new StringBuilder("Camera Preview First Frame Cost: ");
            double d4 = (double) com.ss.android.medialib.log.a.f59739a;
            Double.isNaN(d4);
            an.a("RecordInvoker", sb.append(d2 - d4).toString());
        } else if (i2 == 1) {
            double d5 = (double) com.ss.android.medialib.log.a.f59740b;
            Double.isNaN(d5);
            h.a(0, "te_preview_switch_camera_screen_time", d2 - d5);
            double d6 = (double) com.ss.android.medialib.log.a.f59740b;
            Double.isNaN(d6);
            Double.valueOf(d2 - d6);
        }
    }

    public int setFaceMakeUp(String str, float f2, float f3) {
        MethodCollector.i(4590);
        long j2 = this.mHandler;
        if (j2 == 0) {
            an.d("RecordInvoker", "invalid handle");
            MethodCollector.o(4590);
            return -100000;
        }
        int nativeSetFaceMakeUp = nativeSetFaceMakeUp(j2, str, f2, f3);
        MethodCollector.o(4590);
        return nativeSetFaceMakeUp;
    }

    public int onDrawFrame(ImageFrame imageFrame, int i2, boolean z) {
        MethodCollector.i(5142);
        if (this.mHandler == 0) {
            MethodCollector.o(5142);
            return -100000;
        }
        if (imageFrame.getBuf() != null) {
            nativeOnDrawFrameBuffer3(this.mHandler, imageFrame.getBuf(), imageFrame.getBuf().length, imageFrame.getWidth(), imageFrame.getHeight(), i2, z);
        } else {
            int i3 = Build.VERSION.SDK_INT;
            if (imageFrame.getFormat() == -2) {
                int[][] iArr = (int[][]) Array.newInstance(int.class, 3, 3);
                ByteBuffer[] byteBufferArr = new ByteBuffer[3];
                if (new g(imageFrame).a(iArr, byteBufferArr)) {
                    int nativeOnDrawFrameBuffer4 = nativeOnDrawFrameBuffer4(this.mHandler, byteBufferArr[0], iArr[0], byteBufferArr[1], iArr[1], byteBufferArr[2], iArr[2], imageFrame.getFormat(), imageFrame.getWidth(), imageFrame.getHeight(), i2, z);
                    MethodCollector.o(5142);
                    return nativeOnDrawFrameBuffer4;
                }
            }
        }
        MethodCollector.o(5142);
        return -1;
    }

    public void sendEffectMsg(int i2, long j2, long j3, String str) {
        sendEffectMsg(i2, j2, j3, str, false);
    }

    public int slamSetTextBitmapResult(Bitmap bitmap, int i2, int i3, int i4) {
        if (this.mHandler == 0) {
            return -100000;
        }
        return 0;
    }

    public void setReactionPosMargin(int i2, int i3, int i4, int i5) {
        MethodCollector.i(7124);
        long j2 = this.mHandler;
        if (j2 == 0) {
            MethodCollector.o(7124);
            return;
        }
        nativeSetReactionPosMargin(j2, i2, i3, i4, i5);
        MethodCollector.o(7124);
    }

    public int[] updateReactionCameraPos(int i2, int i3, int i4, int i5) {
        MethodCollector.i(6868);
        long j2 = this.mHandler;
        if (j2 == 0) {
            MethodCollector.o(6868);
            return null;
        }
        int[] nativeUpdateReactionCameraPos = nativeUpdateReactionCameraPos(j2, i2, i3, i4, i5);
        MethodCollector.o(6868);
        return nativeUpdateReactionCameraPos;
    }

    public int addTrack(int i2, String str, long j2, long j3) {
        MethodCollector.i(5217);
        long j4 = this.mHandler;
        if (j4 == 0) {
            an.d("RecordInvoker", "invalid handle");
            MethodCollector.o(5217);
            return -108;
        }
        int nativeAddTrack = nativeAddTrack(j4, i2, str, j2, j3);
        MethodCollector.o(5217);
        return nativeAddTrack;
    }

    public synchronized int animateImagesToPreview(String[] strArr, ByteBuffer[] byteBufferArr, int[] iArr, int[] iArr2) {
        MethodCollector.i(6634);
        long j2 = this.mHandler;
        if (j2 == 0) {
            an.d("RecordInvoker", "Native instance handle == 0 invalid.");
            MethodCollector.o(6634);
            return -100000;
        }
        int nativeAnimateImagesToPreview = nativeAnimateImagesToPreview(j2, strArr, byteBufferArr, iArr, iArr2);
        MethodCollector.o(6634);
        return nativeAnimateImagesToPreview;
    }

    public void clearDisplayColor(float f2, float f3, float f4, float f5) {
        MethodCollector.i(6037);
        long j2 = this.mHandler;
        if (j2 == 0) {
            an.d("RecordInvoker", "clearDisplayColor failed, no native layer");
            MethodCollector.o(6037);
            return;
        }
        nativeClearDisplayColor(j2, f2, f3, f4, f5);
        MethodCollector.o(6037);
    }

    public boolean getSmallWindowSnapshot(int i2, int i3, Bitmap bitmap, SmallWindowSnapshotListener smallWindowSnapshotListener) {
        MethodCollector.i(5623);
        long j2 = this.mHandler;
        if (j2 == 0) {
            MethodCollector.o(5623);
            return false;
        } else if (nativeGetSmallWindowSnapshot(j2, i2, i3, bitmap, smallWindowSnapshotListener) == 0) {
            MethodCollector.o(5623);
            return true;
        } else {
            MethodCollector.o(5623);
            return false;
        }
    }

    public int replaceComposerNodes(String[] strArr, int i2, String[] strArr2, int i3) {
        MethodCollector.i(6449);
        long j2 = this.mHandler;
        if (j2 == 0) {
            an.d("RecordInvoker", "Native instance handle == 0 invalid.");
            MethodCollector.o(6449);
            return -100000;
        }
        int nativeReplaceComposerNodes = nativeReplaceComposerNodes(j2, strArr, i2, strArr2, i3);
        MethodCollector.o(6449);
        return nativeReplaceComposerNodes;
    }

    public boolean setEffectAudioManagerCallback(int i2, int i3, final boolean z, final AudioManagerCallback audioManagerCallback) {
        MethodCollector.i(5643);
        if (this.mHandler == 0) {
            MethodCollector.o(5643);
            return false;
        }
        if (this.mStyleAudioProxyImpl == null) {
            this.mStyleAudioProxyImpl = new b();
        }
        b bVar = this.mStyleAudioProxyImpl;
        bVar.f59648b = getHandler();
        bVar.f59650d = new WeakReference<>(this);
        boolean nativeSetEffectAudioManagerCallback = nativeSetEffectAudioManagerCallback(this.mHandler, i2, i3, new AudioManagerCallback() {
            /* class com.ss.android.medialib.RecordInvoker.AnonymousClass2 */

            static {
                Covode.recordClassIndex(36832);
            }
        });
        MethodCollector.o(5643);
        return nativeSetEffectAudioManagerCallback;
    }

    public int slamDeviceConfig(boolean z, boolean z2, boolean z3, boolean z4) {
        MethodCollector.i(5054);
        if (this.mHandler == 0) {
            an.d("RecordInvoker", "invalid handle");
            MethodCollector.o(5054);
            return -100000;
        } else if (!isRenderReady()) {
            MethodCollector.o(5054);
            return -100001;
        } else {
            int nativeSlamDeviceConfig = nativeSlamDeviceConfig(this.mHandler, z, z2, z3, z4);
            MethodCollector.o(5054);
            return nativeSlamDeviceConfig;
        }
    }

    public int slamProcessIngestAcc(double d2, double d3, double d4, double d5) {
        MethodCollector.i(5127);
        if (this.mHandler == 0) {
            an.d("RecordInvoker", "invalid handle");
            MethodCollector.o(5127);
            return -100000;
        } else if (!isRenderReady()) {
            MethodCollector.o(5127);
            return -100001;
        } else {
            int nativeSlamProcessIngestAcc = nativeSlamProcessIngestAcc(this.mHandler, d2, d3, d4, d5);
            MethodCollector.o(5127);
            return nativeSlamProcessIngestAcc;
        }
    }

    public int slamProcessIngestGra(double d2, double d3, double d4, double d5) {
        MethodCollector.i(5137);
        if (this.mHandler == 0) {
            an.d("RecordInvoker", "invalid handle");
            MethodCollector.o(5137);
            return -100000;
        } else if (!isRenderReady()) {
            MethodCollector.o(5137);
            return -100001;
        } else {
            int nativeSlamProcessIngestGra = nativeSlamProcessIngestGra(this.mHandler, d2, d3, d4, d5);
            MethodCollector.o(5137);
            return nativeSlamProcessIngestGra;
        }
    }

    public int slamProcessIngestGyr(double d2, double d3, double d4, double d5) {
        MethodCollector.i(5134);
        if (this.mHandler == 0) {
            an.d("RecordInvoker", "invalid handle");
            MethodCollector.o(5134);
            return -100000;
        } else if (!isRenderReady()) {
            MethodCollector.o(5134);
            return -100001;
        } else {
            int nativeSlamProcessIngestGyr = nativeSlamProcessIngestGyr(this.mHandler, d2, d3, d4, d5);
            MethodCollector.o(5134);
            return nativeSlamProcessIngestGyr;
        }
    }

    public int slamProcessTouchEventByType(int i2, float f2, float f3, int i3) {
        MethodCollector.i(5162);
        if (this.mHandler == 0) {
            an.d("RecordInvoker", "invalid handle");
            MethodCollector.o(5162);
            return -100000;
        } else if (!isRenderReady()) {
            MethodCollector.o(5162);
            return -100001;
        } else {
            int nativeSlamProcessTouchEventByType = nativeSlamProcessTouchEventByType(this.mHandler, i2, f2, f3, i3);
            MethodCollector.o(5162);
            return nativeSlamProcessTouchEventByType;
        }
    }

    public int slamSetInputText(String str, int i2, int i3, String str2) {
        MethodCollector.i(5176);
        long j2 = this.mHandler;
        if (j2 == 0) {
            an.d("RecordInvoker", "invalid handle");
            MethodCollector.o(5176);
            return -100000;
        }
        int nativeSetSlamInputText = nativeSetSlamInputText(j2, str, i2, i3, str2);
        MethodCollector.o(5176);
        return nativeSetSlamInputText;
    }

    public int updateMultiComposerNodes(int i2, String[] strArr, String[] strArr2, float[] fArr) {
        MethodCollector.i(6305);
        long j2 = this.mHandler;
        if (j2 == 0) {
            an.d("RecordInvoker", "Native instance handle == 0 invalid.");
            MethodCollector.o(6305);
            return -100000;
        }
        int nativeUpdateMultiComposerNodes = nativeUpdateMultiComposerNodes(j2, i2, strArr, strArr2, fArr);
        MethodCollector.o(6305);
        return nativeUpdateMultiComposerNodes;
    }

    public int writeFile(ByteBuffer byteBuffer, int i2, int i3, int i4) {
        MethodCollector.i(5278);
        long j2 = this.mHandler;
        if (j2 == 0) {
            MethodCollector.o(5278);
            return -100000;
        }
        int nativeWriteFile = nativeWriteFile(j2, byteBuffer, i2, i3, i4);
        MethodCollector.o(5278);
        return nativeWriteFile;
    }

    public int concat(String str, String str2, String str3, String str4) {
        MethodCollector.i(5281);
        long j2 = this.mHandler;
        if (j2 == 0) {
            MethodCollector.o(5281);
            return -100000;
        }
        int nativeConcat = nativeConcat(j2, str, str2, 0, str3, str4, false, -1);
        MethodCollector.o(5281);
        return nativeConcat;
    }

    @Override // com.bef.effectsdk.message.MessageCenter.Listener
    public void onMessageReceived(int i2, int i3, int i4, String str) {
        MethodCollector.i(5891);
        synchronized (RecordInvoker.class) {
            try {
                MessageCenter.Listener listener = this.mMessageListener;
                if (listener != null) {
                    listener.onMessageReceived(i2, i3, i4, str);
                }
                MessageCenter.Listener listener2 = sMessageListener;
                if (listener2 != null) {
                    listener2.onMessageReceived(i2, i3, i4, str);
                }
                an.b("RecordInvoker", "msg:" + i2 + ",arg3:" + str);
                if (i2 == 72) {
                    try {
                        sendEffectMsg(i2, (long) i3, (long) i4, String.valueOf(new JSONObject(str).getDouble("recordRate")), true);
                    } catch (JSONException e2) {
                        e2.printStackTrace();
                    }
                } else if (i2 == 58) {
                    sendEffectMsg(i2, (long) i3, (long) i4, str, true);
                }
            } finally {
                MethodCollector.o(5891);
            }
        }
    }

    public void setBeautyFace(int i2, String str, float f2, float f3) {
        MethodCollector.i(4445);
        an.b("RecordInvoker", "nativeSetBeautyFace: ".concat(String.valueOf(i2)));
        if (this.mHandler == 0) {
            an.d("RecordInvoker", "invalid handle");
            MethodCollector.o(4445);
        } else if (i2 != 3 || e.a(str)) {
            nativeSetBeautyFace(this.mHandler, i2, str);
            nativeSetBeautyFaceIntensity(this.mHandler, f2, f3);
            MethodCollector.o(4445);
        } else {
            nativeSetBeautyFace(this.mHandler, 0, "");
            nativeSetBeautyFaceIntensity(this.mHandler, 0.0f, 0.0f);
            MethodCollector.o(4445);
        }
    }

    public int startPlay(Surface surface, String str, int i2, int i3) {
        MethodCollector.i(4074);
        if (this.mHandler == 0) {
            MethodCollector.o(4074);
            return -100000;
        }
        initMessageCenter();
        int nativeStartPlay = nativeStartPlay(this.mHandler, surface, i2, i3, str);
        MethodCollector.o(4074);
        return nativeStartPlay;
    }

    public int renderPicture(ImageFrame imageFrame, int i2, int i3, OnPictureCallbackV2 onPictureCallbackV2) {
        MethodCollector.i(6338);
        if (this.mHandler == 0) {
            MethodCollector.o(6338);
            return -100000;
        } else if (imageFrame.getBuf() != null) {
            int nativeRenderPicture = nativeRenderPicture(this.mHandler, imageFrame.getBuf(), imageFrame.getBuf().length, i2, i3, onPictureCallbackV2);
            MethodCollector.o(6338);
            return nativeRenderPicture;
        } else {
            int i4 = Build.VERSION.SDK_INT;
            if (imageFrame.getFormat() == -2) {
                int[][] iArr = (int[][]) Array.newInstance(int.class, 3, 3);
                ByteBuffer[] byteBufferArr = new ByteBuffer[3];
                if (new g(imageFrame).a(iArr, byteBufferArr)) {
                    int nativeRenderPicture2 = nativeRenderPicture2(this.mHandler, byteBufferArr[0], iArr[0], byteBufferArr[1], iArr[1], byteBufferArr[2], iArr[2], imageFrame.getFormat(), imageFrame.getWidth(), imageFrame.getHeight(), i2, i3, onPictureCallbackV2, null);
                    MethodCollector.o(6338);
                    return nativeRenderPicture2;
                }
                MethodCollector.o(6338);
                return -1;
            } else if (imageFrame.getBitmap() != null) {
                int nativeRenderPicture3 = nativeRenderPicture3(this.mHandler, imageFrame.getBitmap(), i2, i3, onPictureCallbackV2);
                MethodCollector.o(6338);
                return nativeRenderPicture3;
            } else {
                int nativeRenderPicture4 = nativeRenderPicture(this.mHandler, null, 0, 0, 0, null);
                MethodCollector.o(6338);
                return nativeRenderPicture4;
            }
        }
    }

    public int startPlay(Surface surface, String str, boolean z, int i2, int i3) {
        int startPlay = startPlay(surface, str, i2, i3);
        if (startPlay == 0 && z) {
            initHardEncoderInAdvance();
        }
        return startPlay;
    }

    public boolean addPipRenderTarget(Surface surface, int i2, int i3, Bitmap bitmap, boolean z) {
        MethodCollector.i(5627);
        long j2 = this.mHandler;
        if (j2 == 0) {
            an.d("ae_style", "ae_style, addPipRenderTarget failed, no proxy");
            MethodCollector.o(5627);
            return false;
        } else if (nativeAddPipRenderTargetSurface(j2, surface, i2, i3, bitmap, z) == 0) {
            MethodCollector.o(5627);
            return true;
        } else {
            MethodCollector.o(5627);
            return false;
        }
    }

    public int initAudioConfig(int i2, int i3, int i4, int i5, int i6) {
        MethodCollector.i(5284);
        long j2 = this.mHandler;
        if (j2 == 0) {
            MethodCollector.o(5284);
            return -100000;
        }
        int nativeInitAudioConfig = nativeInitAudioConfig(j2, i2, i3, i4, i5, i6);
        MethodCollector.o(5284);
        return nativeInitAudioConfig;
    }

    public void sendEffectMsg(int i2, long j2, long j3, String str, boolean z) {
        MethodCollector.i(5383);
        long j4 = this.mHandler;
        if (j4 == 0) {
            an.d("RecordInvoker", "invalid handle");
            MethodCollector.o(5383);
            return;
        }
        nativeSendEffectMsg(j4, i2, j2, j3, str, z);
        MethodCollector.o(5383);
    }

    public int setFilterNew(String str, String str2, float f2, float f3, float f4) {
        MethodCollector.i(3975);
        long j2 = this.mHandler;
        if (j2 == 0) {
            MethodCollector.o(3975);
            return -100000;
        }
        int nativeSetDoubleFilterNew = nativeSetDoubleFilterNew(j2, str, str2, f2, f3, f4);
        MethodCollector.o(3975);
        return nativeSetDoubleFilterNew;
    }

    public int slamProcessPanEvent(float f2, float f3, float f4, float f5, float f6) {
        MethodCollector.i(5164);
        if (this.mHandler == 0) {
            an.d("RecordInvoker", "invalid handle");
            MethodCollector.o(5164);
            return -100000;
        } else if (!isRenderReady()) {
            MethodCollector.o(5164);
            return -100001;
        } else {
            int nativeSlamProcessPanEvent = nativeSlamProcessPanEvent(this.mHandler, f2, f3, f4, f5, f6);
            MethodCollector.o(5164);
            return nativeSlamProcessPanEvent;
        }
    }

    public int startPlay(int i2, int i3, String str, int i4, int i5) {
        MethodCollector.i(4087);
        if (this.mHandler == 0) {
            MethodCollector.o(4087);
            return -100000;
        }
        initMessageCenter();
        int nativeStartPlay2 = nativeStartPlay2(this.mHandler, i2, i3, i4, i5, str);
        MethodCollector.o(4087);
        return nativeStartPlay2;
    }

    public int[] updateReactionCameraPosWithRotation(int i2, int i3, int i4, int i5, float f2) {
        MethodCollector.i(6730);
        long j2 = this.mHandler;
        if (j2 == 0) {
            MethodCollector.o(6730);
            return null;
        }
        int[] nativeUpdateReactionCameraPosWithRotation = nativeUpdateReactionCameraPosWithRotation(j2, i2, i3, i4, i5, f2);
        MethodCollector.o(6730);
        return nativeUpdateReactionCameraPosWithRotation;
    }

    public int initAudioPlayer(Context context, String str, long j2, boolean z, boolean z2) {
        Pair<Integer, Integer> a2;
        int i2;
        MethodCollector.i(4860);
        PackageManager packageManager = context.getPackageManager();
        boolean z3 = false;
        if (packageManager != null && packageManager.hasSystemFeature("android.hardware.audio.low_latency")) {
            z3 = true;
        }
        an.b("RecordInvoker", "has low latency ? ".concat(String.valueOf(z3)));
        if (z2) {
            a2 = new Pair<>(0, 0);
        } else {
            a2 = com.ss.android.medialib.c.a.a(context);
        }
        an.b("RecordInvoker", "nativeSampleRate ? " + a2.first + " nativeSamleBufferSize? " + a2.second);
        boolean equals = "SM-A710F".equals(Build.MODEL);
        synchronized (this) {
            try {
                long j3 = this.mHandler;
                if (j3 == 0) {
                    return -100000;
                }
                int intValue = ((Integer) a2.first).intValue();
                int intValue2 = ((Integer) a2.second).intValue();
                if (z3) {
                    i2 = 45;
                } else {
                    i2 = -1;
                }
                int nativeInitAudioPlayer = nativeInitAudioPlayer(j3, str, intValue, intValue2, j2, z, equals, i2);
                MethodCollector.o(4860);
                return nativeInitAudioPlayer;
            } finally {
                MethodCollector.o(4860);
            }
        }
    }

    public int renderPictureToBitmap(ImageFrame imageFrame, int i2, int i3, OnPictureCallbackV2 onPictureCallbackV2, Bitmap bitmap) {
        MethodCollector.i(6348);
        if (this.mHandler == 0) {
            MethodCollector.o(6348);
            return -100000;
        } else if (imageFrame.getBuf() != null) {
            int nativeRenderPictureToBitmap = nativeRenderPictureToBitmap(this.mHandler, imageFrame.getBuf(), imageFrame.getBuf().length, imageFrame.getFormat(), imageFrame.width, imageFrame.height, i2, i3, onPictureCallbackV2, bitmap);
            MethodCollector.o(6348);
            return nativeRenderPictureToBitmap;
        } else {
            if (imageFrame.getFormat() == -2) {
                int[][] iArr = (int[][]) Array.newInstance(int.class, 3, 3);
                ByteBuffer[] byteBufferArr = new ByteBuffer[3];
                if (new g(imageFrame).a(iArr, byteBufferArr)) {
                    int nativeRenderPicture2 = nativeRenderPicture2(this.mHandler, byteBufferArr[0], iArr[0], byteBufferArr[1], iArr[1], byteBufferArr[2], iArr[2], imageFrame.getFormat(), imageFrame.getWidth(), imageFrame.getHeight(), i2, i3, onPictureCallbackV2, bitmap);
                    MethodCollector.o(6348);
                    return nativeRenderPicture2;
                }
            }
            MethodCollector.o(6348);
            return -1;
        }
    }

    public int getSequencePreviewFrame(int i2, int i3, boolean z, int i4, String str, a.AbstractC1301a aVar) {
        MethodCollector.i(6108);
        long j2 = this.mHandler;
        if (j2 == 0) {
            MethodCollector.o(6108);
            return -100000;
        }
        this.mGetTimestampCallback = aVar;
        nativeGetSequencePreviewFrame(j2, i2, i3, z, i4, str);
        MethodCollector.o(6108);
        return 0;
    }

    public int initBeautyPlay(int i2, int i3, String str, int i4, int i5, String str2, int i6) {
        return initBeautyPlay(i2, i3, str, i4, i5, str2, i6, false, false, false);
    }

    public int concat(String str, String str2, int i2, String str3, String str4, boolean z, int i3) {
        MethodCollector.i(5283);
        synchronized (this) {
            try {
                long j2 = this.mHandler;
                if (j2 == 0) {
                    return -100000;
                }
                int nativeConcat = nativeConcat(j2, str, str2, i2, str3, str4, z, i3);
                MethodCollector.o(5283);
                return nativeConcat;
            } finally {
                MethodCollector.o(5283);
            }
        }
    }

    public void initDuet(String str, float f2, float f3, float f4, boolean z, boolean z2, int i2) {
        MethodCollector.i(6350);
        long j2 = this.mHandler;
        if (j2 == 0) {
            MethodCollector.o(6350);
            return;
        }
        nativeInitDuet(j2, str, f2, f3, f4, z, z2, i2);
        MethodCollector.o(6350);
    }

    public synchronized int shotScreen(String str, int[] iArr, boolean z, int i2, OnPictureCallback onPictureCallback, a.c cVar, boolean z2) {
        MethodCollector.i(6094);
        if (!this.mIsDuringScreenshot) {
            this.mIsDuringScreenshot = true;
            this.mShotScreenCallback = cVar;
            long j2 = this.mHandler;
            if (j2 == 0) {
                MethodCollector.o(6094);
                return -100000;
            }
            int nativeShotScreen = nativeShotScreen(j2, str, iArr, z, i2, onPictureCallback, z2);
            MethodCollector.o(6094);
            return nativeShotScreen;
        }
        an.c("RecordInvoker", "Last screenshot not complete");
        cVar.a(-1);
        MethodCollector.o(6094);
        return -1;
    }

    public void setCustomVideoBg(Context context, String str, String str2, String str3, long j2, boolean z, boolean z2) {
        boolean z3;
        Pair<Integer, Integer> a2;
        int i2;
        MethodCollector.i(7325);
        if (this.mHandler == 0) {
            MethodCollector.o(7325);
        } else if (TextUtils.isEmpty(str2)) {
            nativeSetCustomVideoBg(this.mHandler, null, null, null, 0, 0, 0, false, 0);
            MethodCollector.o(7325);
        } else {
            PackageManager packageManager = context.getPackageManager();
            if (packageManager == null || !packageManager.hasSystemFeature("android.hardware.audio.low_latency")) {
                z3 = false;
            } else {
                z3 = true;
            }
            if (z2) {
                a2 = new Pair<>(0, 0);
            } else {
                a2 = com.ss.android.medialib.c.a.a(context);
            }
            long j3 = this.mHandler;
            int intValue = ((Integer) a2.first).intValue();
            int intValue2 = ((Integer) a2.second).intValue();
            if (z3) {
                i2 = 45;
            } else {
                i2 = -1;
            }
            nativeSetCustomVideoBg(j3, str, str2, str3, intValue, intValue2, j2, z, i2);
            MethodCollector.o(7325);
        }
    }

    public Surface onNativeCallback_InitHardEncoder(int i2, int i3, int i4, int i5, int i6, int i7, boolean z, int i8) {
        if (this.mEncoderCaller == null) {
            return null;
        }
        an.a("RecordInvoker", "InitHardEncoder");
        return this.mEncoderCaller.onInitHardEncoder(i2, i3, i4, i5, i6, i7, z, i8);
    }

    public void setWaterMark(Bitmap bitmap, int i2, int i3, int i4, int i5, int i6, int i7, int i8) {
        MethodCollector.i(4652);
        long j2 = this.mHandler;
        if (j2 == 0) {
            an.d("RecordInvoker", "invalid handle");
            MethodCollector.o(4652);
            return;
        }
        nativeSetWaterMark2(j2, bitmap, i2, i3, i4, i5, i6, i7, i8);
        MethodCollector.o(4652);
    }

    public int startRecord(double d2, boolean z, float f2, int i2, int i3, String str, String str2, boolean z2) {
        MethodCollector.i(4230);
        int i4 = (int) (4000000.0f * f2);
        long j2 = this.mHandler;
        if (j2 == 0) {
            MethodCollector.o(4230);
            return -100000;
        }
        int nativeStartRecord = nativeStartRecord(j2, d2, z, i4, i2, i3, str, str2, z2);
        MethodCollector.o(4230);
        return nativeStartRecord;
    }

    public byte[] renderFrameForNightEnhance(int i2, int i3, int i4, int i5, String str, String str2, byte[] bArr, boolean z) {
        byte[] bArr2;
        MethodCollector.i(5642);
        long j2 = this.mHandler;
        byte[] bArr3 = null;
        if (j2 == 0) {
            an.d("ae_style", "render frame for night enhance failed...");
            MethodCollector.o(5642);
            return null;
        }
        if (z) {
            bArr2 = new byte[(((i2 * i3) * 3) / 2)];
        } else {
            bArr2 = null;
        }
        boolean nativeRenderFrameForNightEnhance = nativeRenderFrameForNightEnhance(j2, i2, i3, i4, i5, str, str2, bArr, bArr2, z);
        if (!z || nativeRenderFrameForNightEnhance) {
            bArr3 = bArr2;
        }
        MethodCollector.o(5642);
        return bArr3;
    }

    public void setWaterMark(String[] strArr, int i2, int i3, int i4, int i5, int i6, int i7, int i8) {
        MethodCollector.i(4603);
        long j2 = this.mHandler;
        if (j2 == 0) {
            an.d("RecordInvoker", "invalid handle");
            MethodCollector.o(4603);
            return;
        }
        nativeSetWaterMark(j2, strArr, i2, i3, i4, i5, i6, i7, i8);
        MethodCollector.o(4603);
    }

    public int setStickerPathWithTag(int i2, String str, int i3, int i4, String str2, String[] strArr, float[] fArr, boolean z, boolean z2) {
        MethodCollector.i(5051);
        if (this.mHandler == 0) {
            an.d("RecordInvoker", "invalid handle");
            MethodCollector.o(5051);
            return -100000;
        } else if (!isRenderReady()) {
            MethodCollector.o(5051);
            return -100001;
        } else {
            int nativeSetStickerPathWithTag = nativeSetStickerPathWithTag(this.mHandler, i2, str, i3, i4, str2, strArr, fArr, z, z2);
            MethodCollector.o(5051);
            return nativeSetStickerPathWithTag;
        }
    }

    public synchronized int shotHDScreen(String str, int[] iArr, boolean z, int i2, OnPictureCallback onPictureCallback, a.c cVar, boolean z2, OnPictureCallback onPictureCallback2, Bitmap bitmap, boolean z3) {
        MethodCollector.i(6102);
        if (!this.mIsDuringScreenshot) {
            this.mIsDuringScreenshot = true;
            this.mShotScreenCallback = cVar;
            long j2 = this.mHandler;
            if (j2 == 0) {
                an.d("RecordInvoker", "shot hd screen failed, handle not ready...");
                onNativeCallback_onShotScreen(-1, -1);
                MethodCollector.o(6102);
                return -100000;
            }
            int nativeShotHDScreen = nativeShotHDScreen(j2, str, iArr, z, i2, onPictureCallback, z2, onPictureCallback2, bitmap, z3);
            if (nativeShotHDScreen != 0) {
                an.d("RecordInvoker", "shot hd screen failed, rect = ".concat(String.valueOf(nativeShotHDScreen)));
                onNativeCallback_onShotScreen(nativeShotHDScreen, 0);
            }
            MethodCollector.o(6102);
            return nativeShotHDScreen;
        }
        an.c("RecordInvoker", "Last screenshot not complete");
        cVar.a(-1);
        MethodCollector.o(6102);
        return -1;
    }

    public int initBeautyPlay(int i2, int i3, String str, int i4, int i5, String str2, int i6, boolean z, boolean z2, boolean z3) {
        MethodCollector.i(3875);
        this.mHandler = nativeCreate();
        a.f59654b = 5000;
        synchronized (this) {
            try {
                long j2 = this.mHandler;
                if (j2 == 0) {
                    return -100000;
                }
                int nativeInitBeautyPlay = nativeInitBeautyPlay(j2, i2, i3, str, i4, i5, str2, i6, false, z, z2, z3);
                if (nativeInitBeautyPlay == 0 && Build.MODEL.contains("OPPO R7")) {
                    nativeExpandPreviewAndRecordInterval(this.mHandler, true);
                }
                if (z3) {
                    if (this.mStyleProxyImpl == null) {
                        this.mStyleProxyImpl = new c();
                    }
                    c cVar = this.mStyleProxyImpl;
                    cVar.f59651a = getHandler();
                    cVar.f59652b = new WeakReference<>(this);
                    an.a("RecordInvoker", "[ae_style], attach native layer: " + cVar.f59651a + ", invoker: " + cVar.hashCode());
                }
                MethodCollector.o(3875);
                return nativeInitBeautyPlay;
            } finally {
                MethodCollector.o(3875);
            }
        }
    }

    public void setEnigmaDetectParams(boolean z, float f2, float f3, float f4, float f5, boolean z2, int i2, long j2, int i3, boolean z3, boolean z4, boolean z5) {
        MethodCollector.i(5761);
        long j3 = this.mHandler;
        if (j3 == 0) {
            an.d("RecordInvoker", "invalid handle");
            MethodCollector.o(5761);
            return;
        }
        nativeSetEnigmaDetectParams(j3, z, f2, f3, f4, f5, z2, i2, j2, i3, z3, z4, z5);
        MethodCollector.o(5761);
    }

    public int setDisplaySettings(int i2, long j2, float f2, int i3, int i4, int i5, int i6, float f3, int i7, int i8, int i9, int i10, int i11, int i12, boolean z, int i13) {
        MethodCollector.i(5970);
        long j3 = this.mHandler;
        if (j3 == 0) {
            an.d("RecordInvoker", "setDisplaySettings failed...");
            MethodCollector.o(5970);
            return -100000;
        }
        int nativeSetDisplaySettings = nativeSetDisplaySettings(j3, i2, j2, f2, i3, i4, i5, i6, f3, i7, i8, i9, i10, i11, i12, z, i13);
        MethodCollector.o(5970);
        return nativeSetDisplaySettings;
    }
}
