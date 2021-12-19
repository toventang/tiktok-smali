package com.ss.android.ttve.nativePort;

import android.graphics.Bitmap;
import android.os.Build;
import android.text.TextUtils;
import android.view.Surface;
import com.bytedance.android.livesdk.livesetting.wallet.LiveRechargeAgeThresholdSetting;
import com.bytedance.covode.number.Covode;
import com.bytedance.frameworks.apm.trace.MethodCollector;
import com.ss.android.ttve.mediacodec.TEAvcEncoder;
import com.ss.android.ttve.monitor.b;
import com.ss.android.ttve.nativePort.NativeCallbacks;
import com.ss.android.ugc.playerkit.model.v;
import com.ss.android.vesdk.LoudnessDetectResult;
import com.ss.android.vesdk.ROTATE_DEGREE;
import com.ss.android.vesdk.VEEffectParams;
import com.ss.android.vesdk.VEListener;
import com.ss.android.vesdk.VEMusicSRTEffectParam;
import com.ss.android.vesdk.VESize;
import com.ss.android.vesdk.VEStickerAnimator;
import com.ss.android.vesdk.VEWatermarkParam;
import com.ss.android.vesdk.af;
import com.ss.android.vesdk.ag;
import com.ss.android.vesdk.an;
import com.ss.android.vesdk.ay;
import com.ss.android.vesdk.az;
import com.ss.android.vesdk.bg;
import com.ss.android.vesdk.bh;
import com.ss.android.vesdk.bj;
import com.ss.android.vesdk.clipparam.VEAICutOutClipParam;
import com.ss.android.vesdk.clipparam.VEClipAuxiliaryParam;
import com.ss.android.vesdk.clipparam.VEClipParam;
import com.ss.android.vesdk.clipparam.VEClipSourceParam;
import com.ss.android.vesdk.clipparam.VEClipTimelineParam;
import com.ss.android.vesdk.clipparam.VEClipVideoFileInfoParam;
import com.ss.android.vesdk.clipparam.VECommonClipParam;
import com.ss.android.vesdk.filterparam.VEAmazingFilterParam;
import com.ss.android.vesdk.filterparam.VEBaseFilterParam;
import com.ss.android.vesdk.filterparam.VEBeautyFilterParam;
import com.ss.android.vesdk.filterparam.VECanvasFilterParam;
import com.ss.android.vesdk.filterparam.VEColorFilterParam;
import com.ss.android.vesdk.filterparam.VEColorHslFilterParam;
import com.ss.android.vesdk.filterparam.VEComposerFilterParam;
import com.ss.android.vesdk.filterparam.VEEffectFilterParam;
import com.ss.android.vesdk.filterparam.VEEffectHdrFilterParam;
import com.ss.android.vesdk.filterparam.VEImageAddFilterParam;
import com.ss.android.vesdk.filterparam.VEImageTransformFilterParam;
import com.ss.android.vesdk.filterparam.VELensHdrFilterParam;
import com.ss.android.vesdk.filterparam.VEMultiComposerFilterParam;
import com.ss.android.vesdk.filterparam.VEReshapeFilterParam;
import com.ss.android.vesdk.filterparam.VETransitionFilterParam;
import com.ss.android.vesdk.filterparam.VEVideoAjustmentFilterParam;
import com.ss.android.vesdk.filterparam.VEVideoCropFilterParam;
import com.ss.android.vesdk.filterparam.VEVideoLensOneKeyHdrParam;
import com.ss.android.vesdk.filterparam.VEVideoStableFilterParam;
import com.ss.android.vesdk.filterparam.VEVideoTransformFilterParam;
import com.ss.android.vesdk.runtime.VERuntime;
import com.ss.android.vesdk.u;
import java.util.Arrays;
import java.util.List;

public final class TEInterface extends TENativeServiceBase {
    public static boolean m_IsConfigedAB = false;
    private int mHostTrackIndex = -1;
    private long mNative;

    private native int nativeAddAudioTrack(long j2, String str, int i2, int i3, int i4, int i5, boolean z);

    private native int nativeAddAudioTrack2(long j2, String str, int i2, int i3, int i4, int i5, boolean z, int i6, int i7);

    private native int nativeAddAudioTrackForClips(long j2, String[] strArr, int[] iArr, int[] iArr2, float[] fArr);

    private native int nativeAddAudioTrackWithNeedPrepare(long j2, String str, String str2, int i2, int i3, int i4, int i5, boolean z, boolean z2);

    private native int nativeAddAudioTrackWithStruct(long j2, VECommonClipParam vECommonClipParam, boolean z);

    private native int nativeAddClipAuxiliaryParam(long j2, int i2, int i3, VEClipAuxiliaryParam[] vEClipAuxiliaryParamArr);

    private native String nativeAddFileInfoCache(long j2, String str);

    private native int[] nativeAddFilters(long j2, int[] iArr, String[] strArr, int[] iArr2, int[] iArr3, int[] iArr4, int[] iArr5, int[] iArr6);

    private native void nativeAddMetaData(long j2, String str, String str2);

    private native int nativeAddSubTrack(long j2, String[] strArr, String[] strArr2, int[] iArr, int[] iArr2, int[] iArr3, int[] iArr4, double d2, double d3, double d4, double d5, int i2, int i3);

    private native int nativeAddSubVideoTrack(long j2, String[] strArr, String[] strArr2, int[] iArr, int[] iArr2, int[] iArr3, int[] iArr4, int i2);

    private native int nativeAdjustFilterInOut(long j2, int i2, int i3, int i4);

    private native int nativeAppendComposerNodes(long j2, String[] strArr);

    private static native String nativeAudioExtend(String str, float f2, float f3, float f4);

    private static native int nativeAudioHwEncoder(boolean z);

    private native int nativeBeginAudioExtendToFile(long j2, String str, String str2, String str3, float f2, float f3, float f4);

    private static native int nativeBingoRefactor(boolean z);

    private native int nativeCancelAudioExtendToFile(long j2);

    private native int nativeCancelGetImages(long j2);

    private native int nativeChangeResWithEffect(long j2, boolean[] zArr, String[] strArr, String[] strArr2, int[] iArr, int[] iArr2, float[] fArr, String[] strArr3, String[] strArr4, int[] iArr3, int[] iArr4, float[] fArr2, int[] iArr5);

    private native int nativeChangeTransitonAt(long j2, int i2, VETransitionFilterParam vETransitionFilterParam);

    private native int[] nativeCheckComposerNodeExclusion(long j2, String str, String str2, String str3);

    private native void nativeClearDisplay(long j2, int i2);

    private native int nativeClearFilter(long j2);

    private native int nativeConcatShootVideo(long j2, String str, String[] strArr, long[] jArr, boolean z);

    private static native int nativeConfigMaxCacheFrameCount(int i2);

    private native long nativeCreateEngine(String[] strArr, int[] iArr, int[] iArr2);

    private native int nativeCreateTimeline(long j2);

    private native int nativeDeleteAudioTrack(long j2, int i2, boolean z);

    private native int nativeDeleteClip(long j2, int i2, int i3, int i4);

    private native int nativeDeleteKeyFrameParam(long j2, int i2, int i3, int i4);

    private native int nativeDeleteSubVideoTrack(long j2, int i2);

    private native int nativeDestroyEngine(long j2);

    private static native LoudnessDetectResult[] nativeDetectAudioLoudness(String[] strArr, int[] iArr, int[] iArr2);

    private native int nativeDoLensOneKeyHdrDetect(long j2);

    private static native int nativeEnableAGFXCtx(boolean z);

    private static native int nativeEnableAndroidHdr2SDRSupport(boolean z);

    private static native int nativeEnableAndroidHdrPreviewSupport(boolean z);

    private native int nativeEnableAudioDisplayCallBack(long j2, boolean z);

    private static native int nativeEnableAudioGBU(boolean z);

    private static native int nativeEnableColorSpace2020(boolean z);

    private static native int nativeEnableCompileGLContextReuse(boolean z);

    private static native int nativeEnableConcurrentPreloadOpt(int i2);

    private static native int nativeEnableCreateDecoderByName(boolean z);

    private static native int nativeEnableCrossplatformGLBaseFBO(boolean z);

    private static native int nativeEnableDecoderDispatch(int i2);

    private static native int nativeEnableDecoderResourceScheduleOptHw(int i2);

    private static native int nativeEnableDeviceCapabilityOpt(boolean z);

    private static native int nativeEnableDisplayP3ReEncode(boolean z);

    private static native int nativeEnableDisplayP3Render(boolean z);

    private native int nativeEnableEffect(long j2, boolean z);

    private native int nativeEnableEffectAmazing(long j2, boolean z);

    private static native int nativeEnableEffectAmazingMV(boolean z);

    private static native int nativeEnableEffectCanvas(boolean z);

    private static native int nativeEnableEffectRenderWithoutGlreadpixels(boolean z);

    private static native int nativeEnableEffectTransiton(boolean z);

    private static native int nativeEnableEngineResourceOpt(boolean z);

    private native int nativeEnableFaceDetect(long j2, boolean z);

    private static native int nativeEnableFileInfoCache(boolean z);

    private static native int nativeEnableFirstFrameOpt(boolean z);

    private native int nativeEnableGenderDetect(long j2, boolean z);

    private native int nativeEnableHDRSetting(long j2, boolean z);

    private static native int nativeEnableHighSpeed(boolean z);

    private native int nativeEnableHighSpeedForSingle(long j2, boolean z);

    private static native int nativeEnableImageAlgorithmReuseAndOptForAmazing(boolean z);

    private native int nativeEnableImageEditor(long j2, boolean z);

    private static native int nativeEnableLensAsyncInitialize(boolean z);

    private static native int nativeEnableMultiThreadDecode(boolean z);

    private static native int nativeEnableNewAudioMixer(boolean z);

    private static native int nativeEnableOptGLFlush(boolean z);

    private static native int nativeEnableOptPlayBackDropFrame(boolean z);

    private static native int nativeEnableOutResolutionAlign4(boolean z);

    private static native int nativeEnableParallDecodeMatting(boolean z);

    private static native int nativeEnablePinRefactor(boolean z);

    private static native int nativeEnablePipResolutionOpt(boolean z);

    private native void nativeEnableReEncodeOpt(long j2, boolean z);

    private static native int nativeEnableReaderManagerRefactor(boolean z);

    private static native int nativeEnableReaderRefactor(boolean z);

    private static native int nativeEnableRefaComposer(boolean z);

    private static native int nativeEnableRenderLib(boolean z);

    private static native int nativeEnableSeekAndPreloadOpt(boolean z);

    private static native int nativeEnableSmartTransDetect(boolean z);

    private static native int nativeEnableTitanUseReaderFactory(boolean z);

    private native int nativeExcAICutOutTask(long j2);

    private native int nativeExpandTimeline(long j2, int i2);

    private native int nativeFaceCoverClear(long j2, int i2, String str, boolean z);

    private native int nativeFaceCoverClearCache(long j2);

    private native int nativeFaceCoverLoad(long j2, int i2, String[] strArr, int i3, String str, boolean z);

    private native int nativeFaceCoverRestoreAll(long j2);

    private native int nativeFaceCoverScale(long j2, int i2, double d2, double d3, double d4, String str, boolean z);

    private native int nativeFaceCoverSet(long j2, int i2, double d2, double d3, String str, boolean z);

    private native int nativeFaceCoverSetDir(long j2, String str);

    private native int nativeFlushSeekCmd(long j2);

    private static native int nativeForceCompileBytevc1SWdecode(boolean z);

    private static native int nativeForceEditBytevc1SWdecode(boolean z);

    private native int nativeFrameTrace(long j2, String str, int i2);

    private native long nativeGenEditorStatus(long j2);

    private native Object nativeGetAllAudioTracks(long j2);

    private native List<VEClipParam> nativeGetAllClips(long j2, int i2, int i3);

    private native List<VEClipVideoFileInfoParam> nativeGetAllVideoFileInfos(long j2);

    private native byte[] nativeGetAudioCommonFilterPreprocessResult(long j2, long j3);

    private native String nativeGetClipInfoString(long j2, int i2, int i3, int i4);

    private native String nativeGetClipInfoStringWithPath(long j2, int i2, int i3, int i4, String str);

    private native float nativeGetClipProgress(long j2, int i2);

    private native long nativeGetClipSequenceOut(long j2, int i2, int i3, int i4);

    private native float nativeGetColorFilterIntensity(long j2, String str);

    private native int nativeGetCurPosition(long j2);

    private native int nativeGetCurState(long j2);

    private native int[] nativeGetDecodeDumpInfo(long j2, int i2, int i3);

    private native int nativeGetDecodeImage(long j2, Bitmap bitmap, int i2, int i3);

    private native int[] nativeGetDisplayDumpSize(long j2);

    private native int nativeGetDisplayImage(long j2, Bitmap bitmap);

    private native int nativeGetDuration(long j2);

    private native long nativeGetDurationUs(long j2);

    private native int nativeGetImages(long j2, int[] iArr, int i2, int i3, int i4);

    private native int[] nativeGetInitResolution(long j2);

    private static native Object nativeGetMVInfoStatic(String str);

    private native String nativeGetMetaData(long j2, String str);

    private native long nativeGetPCMDeliverHandle(long j2);

    private native int nativeGetProcessedImage(long j2, Bitmap bitmap);

    private native float nativeGetProjectProgress(long j2);

    private native int nativeGetRuntimeGLVersion(long j2);

    private native int nativeGetSingleTrackProcessedImage(long j2, int i2, Bitmap bitmap);

    private native int nativeGetTimeEffectCurPosition(long j2);

    private native int nativeGetTimeEffectDuration(long j2);

    private native float nativeGetTrackVolume(long j2, int i2, int i3, int i4);

    private native int nativeGetTransparentImage(long j2, Bitmap bitmap);

    private native int nativeInitAudioEditor(long j2, String str, String[] strArr, int[] iArr, int[] iArr2, float[] fArr);

    private native int nativeInitAudioExtendToFile(long j2);

    private native int nativeInitImageEditor(long j2, Bitmap[] bitmapArr, int[] iArr, int[] iArr2, String[] strArr, int[] iArr3, int[] iArr4, String[] strArr2, String[][] strArr3, float[] fArr, int[] iArr5, int i2);

    private native int nativeInitVideoEditor(long j2, String str, String[] strArr, String[] strArr2, String[] strArr3, String[][] strArr4, int i2);

    private native int nativeInitVideoEditor2(long j2, String[] strArr, int[] iArr, int[] iArr2, String[] strArr2, int[] iArr3, int[] iArr4, String[] strArr3, String[][] strArr4, float[] fArr, float[] fArr2, int[] iArr5, int i2, boolean z);

    private native int nativeInitVideoEditor2LoadCache(long j2, String[] strArr, int[] iArr, int[] iArr2, String[] strArr2, int[] iArr3, int[] iArr4, String[] strArr3, String[][] strArr4, float[] fArr, float[] fArr2, int[] iArr5, int i2, boolean z, boolean[] zArr, String[] strArr5);

    private native int nativeInitVideoEditorLoadCache(long j2, String str, String[] strArr, String[] strArr2, String[] strArr3, String[][] strArr4, int i2, boolean[] zArr, String[] strArr5);

    private native int nativeInitVideoEditorWithCanvas(long j2, String[] strArr, Bitmap[] bitmapArr, String[] strArr2, int[] iArr, int[] iArr2, String[] strArr3, String[] strArr4, int[] iArr3, int[] iArr4, String[] strArr5, int[] iArr5, int[] iArr6, String[][] strArr6, float[] fArr, int i2, VESize[] vESizeArr);

    private native int nativeInitVideoEditorWithStruct(long j2, VECommonClipParam[] vECommonClipParamArr, VECommonClipParam[] vECommonClipParamArr2, String[] strArr, int i2);

    private native int nativeInsertClip(long j2, int i2, int i3, int i4, VEClipSourceParam vEClipSourceParam, VEClipTimelineParam vEClipTimelineParam);

    private native boolean nativeIsAudioExtendToFileProcessing(long j2);

    private native int nativeIsCompileEncode(long j2);

    private native boolean nativeIsGestureRegistered(long j2, int i2);

    private native int nativeIsWatermarkCompileEncode(long j2);

    private native int nativeLockSeekVideoClip(long j2, int i2);

    private native int nativeMoveClip(long j2, int i2, int i3, int i4, boolean z);

    private static native int nativeOpenEditorFpsLog(boolean z);

    private static native int nativeOpenOutputCallback(boolean z);

    private native int nativePause(long j2, int i2);

    private native int nativePauseSync(long j2);

    private native int nativePrepareEngine(long j2, int i2);

    private native int nativePreprocessAudioTrackForFilter(long j2, int i2, int i3, String str, byte[] bArr, long[] jArr);

    private native int nativeProcessDoubleClickEvent(long j2, float f2, float f3);

    private native int nativeProcessLongPressEvent(long j2, float f2, float f3);

    private native int nativeProcessPanEvent(long j2, float f2, float f3, float f4, float f5, float f6);

    private native int nativeProcessRotationEvent(long j2, float f2, float f3);

    private native int nativeProcessScaleEvent(long j2, float f2, float f3);

    private native int nativeProcessTouchDownEvent(long j2, float f2, float f3, int i2);

    private native int nativeProcessTouchEvent(long j2, float f2, float f3);

    private native boolean nativeProcessTouchEvent2(long j2, int i2, float f2, float f3, float f4, float f5, int i3, int i4);

    private native int nativeProcessTouchMoveEvent(long j2, float f2, float f3);

    private native int nativeProcessTouchUpEvent(long j2, float f2, float f3, int i2);

    private native int nativePushImageToBuffer(long j2, String str);

    private native int nativeRefreshCurrentFrame(long j2, int i2);

    private native int nativeReleaseEngine(long j2);

    private native int nativeReleaseEngineAsync(long j2);

    private native void nativeReleasePreviewSurface(long j2);

    private native int nativeReloadComposerNodes(long j2, String[] strArr);

    private native int nativeRemoveAICutOutClipParam(long j2, int i2);

    private native int nativeRemoveComposerNodes(long j2, String[] strArr);

    private native int nativeRemoveEffectCallback(long j2);

    private native int nativeRemoveFilter(long j2, int[] iArr);

    private native int nativeReplaceClip(long j2, int i2, int i3, VEClipSourceParam vEClipSourceParam, VEClipTimelineParam vEClipTimelineParam);

    private native int nativeReplaceComposerNodesWithTag(long j2, String[] strArr, int i2, String[] strArr2, int i3, String[] strArr3);

    private native void nativeResetCallback(long j2);

    private native int nativeSeek(long j2, int i2, int i3, int i4, int i5);

    private static native int nativeSeekPredictOpt(boolean z);

    private native int nativeSeekWithResult(long j2, int i2);

    private native int nativeSeekWithTolerance(long j2, int i2, int i3, int i4, int i5, int i6);

    private native int nativeSetAlgorithmPreConfig(long j2, int i2, int i3);

    private native int nativeSetAlgorithmSyncAndNum(long j2, boolean z, int i2);

    private native void nativeSetBackGroundColor(long j2, int i2);

    private native int nativeSetClientState(long j2, int i2);

    private native int nativeSetClipAttr(long j2, int i2, int i3, int i4, String str, String str2);

    private native int nativeSetCompileAudioDriver(long j2, String str, int i2, int i3, String str2);

    private static native int nativeSetCompileReport(int i2);

    private native int nativeSetComposerMode(long j2, int i2, int i3);

    private native int nativeSetComposerNodes(long j2, String[] strArr);

    private native int nativeSetDestroyVersion(long j2, boolean z);

    private native int nativeSetDeviceRotation(long j2, float[] fArr, double d2);

    private native void nativeSetDisplayState(long j2, float f2, float f3, float f4, float f5, int i2, int i3, int i4);

    private native int nativeSetDldEnabled(long j2, boolean z);

    private native int nativeSetDldThrVal(long j2, int i2);

    private native int nativeSetDleEnabled(long j2, boolean z);

    private native int nativeSetDleEnabledPreview(long j2, boolean z);

    private static native int nativeSetDropFrameParam(boolean z, long j2, long j3);

    private static native int nativeSetEditorFirstFrameDelay(int i2);

    private native int nativeSetEffectCacheInt(long j2, String str, int i2);

    private native int nativeSetEffectCallback(long j2, VEListener.VEEditorEffectListener vEEditorEffectListener);

    private native int nativeSetEffectMaxMemoryCache(long j2, int i2);

    private native int nativeSetEffectParams(long j2, VEEffectParams vEEffectParams);

    private native void nativeSetEnableMultipleAudioFilter(long j2, boolean z);

    private native void nativeSetEnableRemuxVideo(long j2, boolean z);

    private native void nativeSetEncoderParallel(long j2, boolean z);

    private native void nativeSetExpandLastFrame(long j2, boolean z);

    private native int nativeSetFilterParam(long j2, int i2, String str, VEMusicSRTEffectParam vEMusicSRTEffectParam);

    private native int nativeSetFilterParam(long j2, int i2, String str, VEStickerAnimator vEStickerAnimator);

    private native int nativeSetFilterParam(long j2, int i2, String str, VEEffectFilterParam vEEffectFilterParam);

    private native int nativeSetFilterParam(long j2, int i2, String str, String str2);

    private native int nativeSetFilterParam2(long j2, int i2, String str, byte[] bArr);

    private static native int nativeSetForceDropFrameWithoutAudio(boolean z);

    private static native int nativeSetImageBufferLimit(int i2, int i3, int i4);

    private static native int nativeSetInfoStickerTransEnable(boolean z);

    private native int nativeSetKeyFrameParam(long j2, int i2, int i3, int i4, String str);

    private native int nativeSetMaleMakeupState(long j2, boolean z);

    private static native int nativeSetMaxAudioReaderCount(int i2);

    private static native void nativeSetMaxDetectFrameCount(int i2);

    private static native int nativeSetMaxSoftwareVideoReaderCount(int i2, int i3, int i4, int i5);

    private static native int nativeSetOptVersion(int i2);

    private native void nativeSetOption(long j2, int i2, String str, float f2);

    private native void nativeSetOption(long j2, int i2, String str, long j3);

    private native void nativeSetOption(long j2, int i2, String str, String str2);

    private native void nativeSetOptionArray(long j2, int i2, String[] strArr, long[] jArr);

    private native void nativeSetOptionIntArray(long j2, int i2, String str, int[] iArr);

    private native void nativeSetOptionLongArray(long j2, int i2, String str, long[] jArr);

    private native void nativeSetPreviewFps(long j2, int i2);

    private native int nativeSetPreviewScaleMode(long j2, int i2);

    private native void nativeSetPreviewSurface(long j2, Surface surface);

    private native void nativeSetPreviewSurfaceBitmap(long j2, Bitmap bitmap);

    private native void nativeSetSpeedRatio(long j2, float f2);

    private native int nativeSetSubTrackSeqIn(long j2, int i2, int i3, int i4);

    private native void nativeSetSurfaceSize(long j2, int i2, int i3);

    private static native int nativeSetTexturePoolLimit(int i2, int i3);

    private native int nativeSetTimeRange(long j2, int i2, int i3, int i4);

    private native int nativeSetTrackDurationType(long j2, int i2, int i3, int i4);

    private native int nativeSetTrackFilterEnable(long j2, int i2, boolean z, boolean z2);

    private native int nativeSetTrackLayer(long j2, int i2, int i3, int i4);

    private native int nativeSetTrackMinMaxDuration(long j2, int i2, int i3, int i4, int i5);

    private native boolean nativeSetTrackVolume(long j2, int i2, int i3, float f2);

    private native int nativeSetTransitionAt(long j2, int i2, long j3, String str);

    private native void nativeSetVideoBackGroundColor(long j2, int i2);

    private native void nativeSetViewPort(long j2, int i2, int i3, int i4, int i5);

    private native void nativeSetWaterMark(long j2, VEWatermarkParam.VEWatermarkEntity[] vEWatermarkEntityArr, VEWatermarkParam.VEWatermarkMask vEWatermarkMask);

    private native int nativeStart(long j2);

    private native int nativeStartEffectMonitor(long j2);

    private native int nativeStop(long j2);

    private native int nativeStopEffectMonitor(long j2);

    private native boolean nativeSuspendGestureRecognizer(long j2, int i2, boolean z);

    private native int nativeSwitchResourceLoadMode(long j2, boolean z, int i2);

    private native int nativeUninitAudioExtendToFile(long j2);

    private native int nativeUpdateAICutOutClipParam(long j2, int i2, int i3, VEAICutOutClipParam vEAICutOutClipParam);

    private native int nativeUpdateAlgorithmRuntimeParam(long j2, int i2, float f2);

    private native int nativeUpdateAmazingFilterParam(long j2, int i2, int i3, VEAmazingFilterParam vEAmazingFilterParam);

    private native int nativeUpdateAudioTrack(long j2, int i2, int i3, int i4, int i5, int i6, boolean z, boolean z2);

    private native int nativeUpdateAudioTrack2(long j2, int i2, int i3, int i4, int i5, int i6, boolean z, int i7, int i8);

    private native int nativeUpdateBeautyFilterParam(long j2, int i2, int i3, VEBeautyFilterParam vEBeautyFilterParam);

    private native int nativeUpdateCanvasFilterParam(long j2, int i2, int i3, VECanvasFilterParam vECanvasFilterParam);

    private native int nativeUpdateCanvasResolution(long j2, int i2, int i3);

    private native int nativeUpdateClipsSourceParam(long j2, int i2, int i3, int[] iArr, VEClipSourceParam[] vEClipSourceParamArr);

    private native int nativeUpdateClipsTimelineParam(long j2, int i2, int i3, int[] iArr, VEClipTimelineParam[] vEClipTimelineParamArr);

    private native int nativeUpdateColorAdjustHslFilterParam(long j2, int i2, int i3, VEColorHslFilterParam vEColorHslFilterParam);

    private native int nativeUpdateColorFilterParam(long j2, int i2, int i3, VEColorFilterParam vEColorFilterParam);

    private native int nativeUpdateComposerNode(long j2, String str, String str2, float f2);

    private native int nativeUpdateCropFilterParam(long j2, int i2, int i3, VEVideoCropFilterParam vEVideoCropFilterParam);

    private native int nativeUpdateEffectComposerParam(long j2, int i2, int i3, VEComposerFilterParam vEComposerFilterParam);

    private native int nativeUpdateEffectFilterParam(long j2, int i2, int i3, VEEffectFilterParam vEEffectFilterParam);

    private native int nativeUpdateEffectHdrFilterParam(long j2, int i2, int i3, VEEffectHdrFilterParam vEEffectHdrFilterParam);

    private native int nativeUpdateFilterTime(long j2, int i2, int i3, int i4, int i5);

    private native int nativeUpdateImageAddFilterParam(long j2, int i2, int i3, VEImageAddFilterParam vEImageAddFilterParam);

    private native int nativeUpdateImageTransformFilterParam(long j2, int i2, int i3, VEImageTransformFilterParam vEImageTransformFilterParam);

    private native int nativeUpdateLensHdrFilterParam(long j2, int i2, int i3, VELensHdrFilterParam vELensHdrFilterParam);

    private native int nativeUpdateLensOneKeyHdrFilterParam(long j2, int i2, int i3, VEVideoLensOneKeyHdrParam vEVideoLensOneKeyHdrParam);

    private native int nativeUpdateMultiComposerNodes(long j2, int i2, String[] strArr, String[] strArr2, float[] fArr);

    private native int nativeUpdateMultiEffectComposerParam(long j2, int i2, int i3, VEMultiComposerFilterParam vEMultiComposerFilterParam);

    private native int nativeUpdateQualityFilterParam(long j2, int i2, int i3, VEVideoAjustmentFilterParam vEVideoAjustmentFilterParam);

    private native int nativeUpdateReshapeFilterParam(long j2, int i2, int i3, VEReshapeFilterParam vEReshapeFilterParam);

    private native int nativeUpdateScene(long j2, String[] strArr, int[] iArr, int[] iArr2);

    private native int nativeUpdateSceneFileOrder(long j2, int[] iArr);

    private native int nativeUpdateSceneLoadCache(long j2, String[] strArr, int[] iArr, int[] iArr2, boolean[] zArr, String[] strArr2);

    private native int nativeUpdateSceneTime(long j2, boolean[] zArr, int[] iArr, int[] iArr2, int[] iArr3, double[] dArr);

    private native int nativeUpdateTrackClip(long j2, int i2, int i3, String[] strArr);

    private native int nativeUpdateTrackFilter(long j2, int i2, int i3, boolean z);

    private native int nativeUpdateTrackFilterDuration(long j2, int i2, int i3, boolean z, long j3);

    private native int nativeUpdateVideoStabFilterParam(long j2, int i2, int i3, VEVideoStableFilterParam vEVideoStableFilterParam);

    private native int nativeUpdateVideoTransformFilterParam(long j2, int i2, int i3, VEVideoTransformFilterParam vEVideoTransformFilterParam);

    public final native int nativeSetAudioOffset(long j2, int i2, int i3);

    public final native String stringFromJNI();

    public final int getHostTrackIndex() {
        return this.mHostTrackIndex;
    }

    public final long getNativeHandler() {
        return this.mNative;
    }

    public static TEInterface createEngine() {
        return createEngine((bj) null);
    }

    static {
        Covode.recordClassIndex(37723);
        d.a();
    }

    public final int cancelAudioExtendToFile() {
        MethodCollector.i(8314);
        int nativeCancelAudioExtendToFile = nativeCancelAudioExtendToFile(this.mNative);
        MethodCollector.o(8314);
        return nativeCancelAudioExtendToFile;
    }

    public final int cancelGetImages() {
        MethodCollector.i(13158);
        int nativeCancelGetImages = nativeCancelGetImages(this.mNative);
        MethodCollector.o(13158);
        return nativeCancelGetImages;
    }

    public final long genEditorStatus() {
        MethodCollector.i(7583);
        long nativeGenEditorStatus = nativeGenEditorStatus(this.mNative);
        MethodCollector.o(7583);
        return nativeGenEditorStatus;
    }

    public final boolean isAudioExtendToFileProcessing() {
        MethodCollector.i(8320);
        boolean nativeIsAudioExtendToFileProcessing = nativeIsAudioExtendToFileProcessing(this.mNative);
        MethodCollector.o(8320);
        return nativeIsAudioExtendToFileProcessing;
    }

    public final int uninitAudioExtendToFile() {
        MethodCollector.i(8317);
        int nativeUninitAudioExtendToFile = nativeUninitAudioExtendToFile(this.mNative);
        MethodCollector.o(8317);
        return nativeUninitAudioExtendToFile;
    }

    private TEInterface() {
        if (!m_IsConfigedAB) {
            configABforEditor();
            m_IsConfigedAB = true;
        }
    }

    public final int clearFilter() {
        MethodCollector.i(11413);
        long j2 = this.mNative;
        if (j2 == 0) {
            MethodCollector.o(11413);
            return -112;
        }
        int nativeClearFilter = nativeClearFilter(j2);
        MethodCollector.o(11413);
        return nativeClearFilter;
    }

    public final int createTimeline() {
        MethodCollector.i(11834);
        long j2 = this.mNative;
        if (j2 == 0) {
            MethodCollector.o(11834);
            return -112;
        }
        int nativeCreateTimeline = nativeCreateTimeline(j2);
        MethodCollector.o(11834);
        return nativeCreateTimeline;
    }

    public final int destroyEngine() {
        MethodCollector.i(7393);
        long j2 = this.mNative;
        if (j2 == 0) {
            MethodCollector.o(7393);
            return -112;
        }
        int nativeDestroyEngine = nativeDestroyEngine(j2);
        this.mNative = 0;
        MethodCollector.o(7393);
        return nativeDestroyEngine;
    }

    public final int doLensOneKeyHdrDetect() {
        MethodCollector.i(7858);
        long j2 = this.mNative;
        if (j2 == 0) {
            MethodCollector.o(7858);
            return -112;
        }
        int nativeDoLensOneKeyHdrDetect = nativeDoLensOneKeyHdrDetect(j2);
        MethodCollector.o(7858);
        return nativeDoLensOneKeyHdrDetect;
    }

    public final int excAICutOutTask() {
        MethodCollector.i(7854);
        long j2 = this.mNative;
        if (j2 == 0) {
            MethodCollector.o(7854);
            return -112;
        }
        int nativeExcAICutOutTask = nativeExcAICutOutTask(j2);
        MethodCollector.o(7854);
        return nativeExcAICutOutTask;
    }

    public final int faceCoverClearCache() {
        MethodCollector.i(8203);
        long j2 = this.mNative;
        if (j2 == 0) {
            MethodCollector.o(8203);
            return -112;
        }
        int nativeFaceCoverClearCache = nativeFaceCoverClearCache(j2);
        MethodCollector.o(8203);
        return nativeFaceCoverClearCache;
    }

    public final int faceCoverRestoreAll() {
        MethodCollector.i(8199);
        long j2 = this.mNative;
        if (j2 == 0) {
            MethodCollector.o(8199);
            return -112;
        }
        int nativeFaceCoverRestoreAll = nativeFaceCoverRestoreAll(j2);
        MethodCollector.o(8199);
        return nativeFaceCoverRestoreAll;
    }

    public final int flushSeekCmd() {
        MethodCollector.i(13803);
        long j2 = this.mNative;
        if (j2 == 0) {
            MethodCollector.o(13803);
            return -112;
        }
        int nativeFlushSeekCmd = nativeFlushSeekCmd(j2);
        MethodCollector.o(13803);
        return nativeFlushSeekCmd;
    }

    public final Object getAllAudioTracks() {
        MethodCollector.i(10702);
        long j2 = this.mNative;
        if (j2 == 0) {
            MethodCollector.o(10702);
            return null;
        }
        Object nativeGetAllAudioTracks = nativeGetAllAudioTracks(j2);
        MethodCollector.o(10702);
        return nativeGetAllAudioTracks;
    }

    public final List<VEClipVideoFileInfoParam> getAllVideoFileInfos() {
        MethodCollector.i(7722);
        long j2 = this.mNative;
        if (j2 == 0) {
            MethodCollector.o(7722);
            return null;
        }
        List<VEClipVideoFileInfoParam> nativeGetAllVideoFileInfos = nativeGetAllVideoFileInfos(j2);
        MethodCollector.o(7722);
        return nativeGetAllVideoFileInfos;
    }

    public final int getCurPosition() {
        MethodCollector.i(9540);
        long j2 = this.mNative;
        if (j2 == 0) {
            MethodCollector.o(9540);
            return -1;
        }
        int nativeGetCurPosition = nativeGetCurPosition(j2);
        MethodCollector.o(9540);
        return nativeGetCurPosition;
    }

    public final int getCurState() {
        MethodCollector.i(9694);
        long j2 = this.mNative;
        if (j2 == 0) {
            MethodCollector.o(9694);
            return -1;
        }
        int nativeGetCurState = nativeGetCurState(j2);
        MethodCollector.o(9694);
        return nativeGetCurState;
    }

    public final int getDuration() {
        MethodCollector.i(8487);
        long j2 = this.mNative;
        if (j2 == 0) {
            MethodCollector.o(8487);
            return -1;
        }
        int nativeGetDuration = nativeGetDuration(j2);
        MethodCollector.o(8487);
        return nativeGetDuration;
    }

    public final long getDurationUs() {
        MethodCollector.i(8753);
        long j2 = this.mNative;
        if (j2 == 0) {
            MethodCollector.o(8753);
            return -1;
        }
        long nativeGetDurationUs = nativeGetDurationUs(j2);
        MethodCollector.o(8753);
        return nativeGetDurationUs;
    }

    public final long getPCMDeliverHandle() {
        MethodCollector.i(7475);
        long j2 = this.mNative;
        if (j2 == 0) {
            MethodCollector.o(7475);
            return -112;
        }
        long nativeGetPCMDeliverHandle = nativeGetPCMDeliverHandle(j2);
        MethodCollector.o(7475);
        return nativeGetPCMDeliverHandle;
    }

    public final float getProjectMattingProgress() {
        MethodCollector.i(7857);
        long j2 = this.mNative;
        if (j2 == 0) {
            MethodCollector.o(7857);
            return -112.0f;
        }
        float nativeGetProjectProgress = nativeGetProjectProgress(j2);
        MethodCollector.o(7857);
        return nativeGetProjectProgress;
    }

    public final int getRuntimeGLVersion() {
        MethodCollector.i(10773);
        long j2 = this.mNative;
        if (j2 == 0) {
            MethodCollector.o(10773);
            return -112;
        }
        int nativeGetRuntimeGLVersion = nativeGetRuntimeGLVersion(j2);
        MethodCollector.o(10773);
        return nativeGetRuntimeGLVersion;
    }

    public final int initAudioExtendToFile() {
        MethodCollector.i(8248);
        long j2 = this.mNative;
        if (j2 == 0) {
            MethodCollector.o(8248);
            return -112;
        }
        int nativeInitAudioExtendToFile = nativeInitAudioExtendToFile(j2);
        MethodCollector.o(8248);
        return nativeInitAudioExtendToFile;
    }

    public final int isCompileEncode() {
        MethodCollector.i(8946);
        long j2 = this.mNative;
        if (j2 == 0) {
            MethodCollector.o(8946);
            return -1;
        }
        int nativeIsCompileEncode = nativeIsCompileEncode(j2);
        MethodCollector.o(8946);
        return nativeIsCompileEncode;
    }

    public final int isWatermarkCompileEncode() {
        MethodCollector.i(9537);
        long j2 = this.mNative;
        if (j2 == 0) {
            MethodCollector.o(9537);
            return -1;
        }
        int nativeIsWatermarkCompileEncode = nativeIsWatermarkCompileEncode(j2);
        MethodCollector.o(9537);
        return nativeIsWatermarkCompileEncode;
    }

    public final int pauseSync() {
        MethodCollector.i(8460);
        long j2 = this.mNative;
        if (j2 == 0) {
            MethodCollector.o(8460);
            return -112;
        }
        int nativePauseSync = nativePauseSync(j2);
        MethodCollector.o(8460);
        return nativePauseSync;
    }

    public final int releaseEngine() {
        MethodCollector.i(7319);
        long j2 = this.mNative;
        if (j2 == 0) {
            MethodCollector.o(7319);
            return -112;
        }
        int nativeReleaseEngine = nativeReleaseEngine(j2);
        MethodCollector.o(7319);
        return nativeReleaseEngine;
    }

    public final int releaseEngineAsync() {
        MethodCollector.i(7322);
        long j2 = this.mNative;
        if (j2 == 0) {
            MethodCollector.o(7322);
            return -112;
        }
        int nativeReleaseEngineAsync = nativeReleaseEngineAsync(j2);
        MethodCollector.o(7322);
        return nativeReleaseEngineAsync;
    }

    public final void releasePreviewSurface() {
        MethodCollector.i(14142);
        long j2 = this.mNative;
        if (j2 == 0) {
            MethodCollector.o(14142);
            return;
        }
        nativeReleasePreviewSurface(j2);
        MethodCollector.o(14142);
    }

    public final int removeEffectCallback() {
        MethodCollector.i(7551);
        long j2 = this.mNative;
        if (j2 == 0) {
            MethodCollector.o(7551);
            return -112;
        }
        int nativeRemoveEffectCallback = nativeRemoveEffectCallback(j2);
        MethodCollector.o(7551);
        return nativeRemoveEffectCallback;
    }

    public final int start() {
        MethodCollector.i(7903);
        long j2 = this.mNative;
        if (j2 == 0) {
            MethodCollector.o(7903);
            return -112;
        }
        int nativeStart = nativeStart(j2);
        MethodCollector.o(7903);
        return nativeStart;
    }

    public final int startEffectMonitor() {
        MethodCollector.i(7834);
        long j2 = this.mNative;
        if (j2 == 0) {
            MethodCollector.o(7834);
            return -112;
        }
        nativeStartEffectMonitor(j2);
        MethodCollector.o(7834);
        return 0;
    }

    public final int stop() {
        MethodCollector.i(8481);
        long j2 = this.mNative;
        if (j2 == 0) {
            MethodCollector.o(8481);
            return -112;
        }
        int nativeStop = nativeStop(j2);
        MethodCollector.o(8481);
        return nativeStop;
    }

    public final int stopEffectMonitor() {
        MethodCollector.i(7884);
        long j2 = this.mNative;
        if (j2 == 0) {
            MethodCollector.o(7884);
            return -112;
        }
        nativeStopEffectMonitor(j2);
        MethodCollector.o(7884);
        return 0;
    }

    public final ay getDisplayRect() {
        MethodCollector.i(7731);
        long j2 = this.mNative;
        if (j2 == 0) {
            ay ayVar = new ay(0, 0, 0, 0);
            MethodCollector.o(7731);
            return ayVar;
        }
        int[] nativeGetDisplayDumpSize = nativeGetDisplayDumpSize(j2);
        ay ayVar2 = new ay(nativeGetDisplayDumpSize[0], nativeGetDisplayDumpSize[1], nativeGetDisplayDumpSize[2], nativeGetDisplayDumpSize[3]);
        MethodCollector.o(7731);
        return ayVar2;
    }

    public final int[] getInitResolution() {
        MethodCollector.i(7897);
        int[] iArr = {-1, -1, -1, -1};
        long j2 = this.mNative;
        if (j2 == 0) {
            MethodCollector.o(7897);
            return iArr;
        }
        int[] nativeGetInitResolution = nativeGetInitResolution(j2);
        MethodCollector.o(7897);
        return nativeGetInitResolution;
    }

    private void configABforEditor() {
        boolean booleanValue;
        boolean booleanValue2;
        boolean booleanValue3;
        boolean booleanValue4;
        boolean booleanValue5;
        boolean booleanValue6;
        boolean booleanValue7;
        boolean booleanValue8;
        boolean booleanValue9;
        int intValue;
        boolean booleanValue10;
        MethodCollector.i(7822);
        u.d a2 = u.a().a("mv_use_amazing_engine");
        if (a2 != null && a2.f151496b != null && (a2.f151496b instanceof Boolean) && (booleanValue10 = ((Boolean) a2.f151496b).booleanValue())) {
            enableEffectAmazingMV(booleanValue10);
        }
        u.d a3 = u.a().a("vesdk_max_cache_count");
        if (a3 != null && a3.f151496b != null && (a3.f151496b instanceof Integer) && (intValue = ((Integer) a3.f151496b).intValue()) > 0) {
            configMaxCacheFrameCount(intValue);
        }
        u.d a4 = u.a().a("vesdk_seek_predict_opt");
        if (a4 != null && a4.f151496b != null && (a4.f151496b instanceof Boolean) && (booleanValue9 = ((Boolean) a4.f151496b).booleanValue())) {
            enableSeekPredictOpt(booleanValue9);
        }
        u.d a5 = u.a().a("create_by_codec_name");
        if (a5 != null && a5.f151496b != null && (a5.f151496b instanceof Boolean) && (booleanValue8 = ((Boolean) a5.f151496b).booleanValue())) {
            enableCreateDecoderByName(booleanValue8);
        }
        u.d a6 = u.a().a("enable_android_hdr2sdr_support");
        if (!(a6 == null || a6.f151496b == null || !(a6.f151496b instanceof Boolean))) {
            boolean booleanValue11 = ((Boolean) a6.f151496b).booleanValue();
            an.a("TEInterface", "enableAndroidHdr2SdrSupport: ".concat(String.valueOf(booleanValue11)));
            if (booleanValue11) {
                enableAndroidHdr2SDRSupport(booleanValue11);
            }
        }
        u.d a7 = u.a().a("enable_android_hdr_preview_support");
        if (a7 != null && a7.f151496b != null && (a7.f151496b instanceof Boolean) && (booleanValue7 = ((Boolean) a7.f151496b).booleanValue())) {
            enableAndroidHdr2SDRSupport(booleanValue7);
        }
        u.d a8 = u.a().a("ve_force_edit_bytevc1_swdecode");
        if (!(a8 == null || a8.f151496b == null || !(a8.f151496b instanceof Boolean))) {
            boolean booleanValue12 = ((Boolean) a8.f151496b).booleanValue();
            an.a("TEInterface", "forceEditBytevc1SWdecode: ".concat(String.valueOf(booleanValue12)));
            if (booleanValue12) {
                forceEditBytevc1SWdecode(booleanValue12);
            }
        }
        u.d a9 = u.a().a("ve_force_compile_bytevc1_swdecode");
        if (!(a9 == null || a9.f151496b == null || !(a9.f151496b instanceof Boolean))) {
            boolean booleanValue13 = ((Boolean) a9.f151496b).booleanValue();
            an.a("TEInterface", "forceCompileBytevc1SWdecode: ".concat(String.valueOf(booleanValue13)));
            if (booleanValue13) {
                forceCompileBytevc1SWdecode(booleanValue13);
            }
        }
        u.d a10 = u.a().a("vesdk_audiomix_replace");
        if (a10 != null && a10.f151496b != null && (a10.f151496b instanceof Boolean) && (booleanValue6 = ((Boolean) a10.f151496b).booleanValue())) {
            enableNewAudioMixer(booleanValue6);
        }
        u.d a11 = u.a().a("ve_color_space_for_2020");
        if (a11 != null && a11.f151496b != null && (a11.f151496b instanceof Boolean) && (booleanValue5 = ((Boolean) a11.f151496b).booleanValue())) {
            enableColorSpace2020(booleanValue5);
        }
        u.d a12 = u.a().a("ve_enable_bingo_refactor");
        if (a12 != null && a12.f151496b != null && (a12.f151496b instanceof Boolean) && (booleanValue4 = ((Boolean) a12.f151496b).booleanValue())) {
            az.f151042f = true;
            enableBingoRefactor(booleanValue4);
        }
        u.d a13 = u.a().a("vesdk_audio_hw_encoder");
        if (a13 != null && a13.f151496b != null && (a13.f151496b instanceof Boolean) && (booleanValue3 = ((Boolean) a13.f151496b).booleanValue())) {
            enableAudioHwEncoder(booleanValue3);
        }
        u.d a14 = u.a().a("crossplat_glbase_fbo");
        if (!(a14 == null || a14.f151496b == null || !(a14.f151496b instanceof Boolean))) {
            boolean booleanValue14 = ((Boolean) a14.f151496b).booleanValue();
            an.d("TEInterface", "KEY_CROSSPLAT_GLBASE_FBO: ".concat(String.valueOf(booleanValue14)));
            if (booleanValue14) {
                enableCrossplatformGLBaseFBO(booleanValue14);
            }
        }
        u.d a15 = u.a().a("enable_render_lib");
        if (!(a15 == null || a15.f151496b == null || !(a15.f151496b instanceof Boolean))) {
            boolean booleanValue15 = ((Boolean) a15.f151496b).booleanValue();
            an.d("TEInterface", "KEY_ENABLE_RENDER_LIB: ".concat(String.valueOf(booleanValue15)));
            if (booleanValue15) {
                enableRenderLib(booleanValue15);
            }
        }
        u.d a16 = u.a().a("vesdk_use_agfxcontext");
        if (!(a16 == null || a16.f151496b == null || !(a16.f151496b instanceof Boolean))) {
            boolean booleanValue16 = ((Boolean) a16.f151496b).booleanValue();
            an.d("TEInterface", "KEY_ENABLE_AGFX_CTX: ".concat(String.valueOf(booleanValue16)));
            if (booleanValue16) {
                enableAGFXCtx(booleanValue16);
            }
        }
        u.d a17 = u.a().a("vesdk_enable_reader_refactor");
        if (a17 != null && a17.f151496b != null && (a17.f151496b instanceof Boolean) && (booleanValue2 = ((Boolean) a17.f151496b).booleanValue())) {
            enableReaderRefactor(booleanValue2);
        }
        u.d a18 = u.a().a("ve_enable_engine_resource_opt");
        if (!(a18 == null || a18.f151496b == null || !(a18.f151496b instanceof Boolean))) {
            enableEngineResourceOpt(((Boolean) a18.f151496b).booleanValue());
        }
        u.d a19 = u.a().a("ve_enable_concurrent_preload");
        if (!(a19 == null || a19.f151496b == null || !(a19.f151496b instanceof Integer))) {
            nativeEnableConcurrentPreloadOpt(((Integer) a19.f151496b).intValue());
        }
        u.d a20 = u.a().a("ve_enable_decoder_dispatch");
        if (!(a20 == null || a20.f151496b == null || !(a20.f151496b instanceof Integer))) {
            nativeEnableDecoderDispatch(((Integer) a20.f151496b).intValue());
        }
        u.d a21 = u.a().a("ve_enable_decoder_schedule_opt_hw");
        if (!(a21 == null || a21.f151496b == null || !(a21.f151496b instanceof Integer))) {
            Integer num = (Integer) a21.f151496b;
            if (num.intValue() > 0) {
                u.a().b("ve_enable_engine_resource_opt", (Object) true);
                enableEngineResourceOpt(true);
                u.a().b("vesdk_enable_reader_refactor", (Object) true);
                enableReaderRefactor(true);
                enableDecoderResourceScheduleOptHw(num.intValue());
            }
        }
        u.d a22 = u.a().a("ve_enable_readermanager_refactor");
        if (a22 != null && a22.f151496b != null && (a22.f151496b instanceof Boolean) && ((Boolean) a22.f151496b).booleanValue()) {
            an.a("TEInterface", "enable ReaderManager refactortrue");
            enableReaderManagerRefactor(true);
        }
        u.d a23 = u.a().a("ve_enable_device_capability_opt");
        if (a23 != null && a23.f151496b != null && (a23.f151496b instanceof Boolean) && ((Boolean) a23.f151496b).booleanValue()) {
            an.a("TEInterface", "enable_device_capability_opttrue");
            enableCapabilityOpt(true);
        }
        u.a().a("ve_enable_audio_gbu_refactor");
        enableAudioGBU(true);
        u.d a24 = u.a().a("ve_enable_render_encode_resolution_align4");
        if (a24 != null && a24.f151496b != null && (a24.f151496b instanceof Boolean) && ((Boolean) a24.f151496b).booleanValue() && Build.VERSION.SDK_INT >= 24) {
            an.a("TEInterface", "enableRenderEncodeAlign4: true");
            enableOutResolutionAlign4(true);
            TEAvcEncoder.setEncodeResolutionAlign(4);
        }
        u.d a25 = u.a().a("ve_enable_pin_refactor");
        if (a25 != null && a25.f151496b != null && (a25.f151496b instanceof Boolean) && (booleanValue = ((Boolean) a25.f151496b).booleanValue())) {
            enablePinRefactor(booleanValue);
        }
        u.d a26 = u.a().a("ve_enable_hwdecode_playback_dropframe_opt");
        if (!(a26 == null || a26.f151496b == null || !(a26.f151496b instanceof Boolean))) {
            boolean booleanValue17 = ((Boolean) a26.f151496b).booleanValue();
            an.a("TEInterface", "hwdecodePlaybackDropFrameOpt: ".concat(String.valueOf(booleanValue17)));
            if (booleanValue17) {
                enableOptPlayBackDropFrame(booleanValue17);
            }
        }
        u.d a27 = u.a().a("ve_enable_mpeg24vp89_hwdecoder2");
        if (!(a27 == null || a27.f151496b == null || !(a27.f151496b instanceof Boolean))) {
            boolean booleanValue18 = ((Boolean) a27.f151496b).booleanValue();
            an.a("TEInterface", "enableMpeg24VP89HWDecoder: ".concat(String.valueOf(booleanValue18)));
            if (booleanValue18) {
                VERuntime vERuntime = VERuntime.a.INSTANCE.veRuntime;
                if (!vERuntime.f151406k) {
                    an.d("VERuntime", "runtime not init");
                } else {
                    vERuntime.nativeEnableHDMpeg24VP89HWDecoder(booleanValue18);
                }
            }
        }
        u.d a28 = u.a().a("ve_enable_glflush_opt");
        if (!(a28 == null || a28.f151496b == null || !(a28.f151496b instanceof Boolean))) {
            boolean booleanValue19 = ((Boolean) a28.f151496b).booleanValue();
            an.a("TEInterface", "glFlushOpt: ".concat(String.valueOf(booleanValue19)));
            if (booleanValue19) {
                enableOptGlFlush(booleanValue19);
            }
        }
        u.d a29 = u.a().a("vesdk_high_speed_change_opt");
        if (!(a29 == null || a29.f151496b == null || !(a29.f151496b instanceof Boolean))) {
            boolean booleanValue20 = ((Boolean) a29.f151496b).booleanValue();
            an.a("TEInterface", "highSpeedChangeOpt: ".concat(String.valueOf(booleanValue20)));
            if (booleanValue20) {
                enableHighSpeed(booleanValue20);
            }
        }
        u.d a30 = u.a().a("ve_enable_p3_re_encode");
        if (!(a30 == null || a30.f151496b == null || !(a30.f151496b instanceof Boolean))) {
            boolean booleanValue21 = ((Boolean) a30.f151496b).booleanValue();
            an.a("TEInterface", "p3ReEncodeOpt: ".concat(String.valueOf(booleanValue21)));
            if (booleanValue21) {
                enableDisplayP3ReEncode(booleanValue21);
            }
        }
        u.d a31 = u.a().a("ve_enable_imageAlgorithmReuseAndOptForAmazing");
        if (!(a31 == null || a31.f151496b == null || !(a31.f151496b instanceof Boolean))) {
            boolean booleanValue22 = ((Boolean) a31.f151496b).booleanValue();
            an.a("TEInterface", "imageAlgorithmReuseAndOptForAmazing: ".concat(String.valueOf(booleanValue22)));
            if (booleanValue22) {
                enableImageAlgorithmReuseAndOptForAmazing(booleanValue22);
            }
        }
        u.d a32 = u.a().a("ve_enable_parallelDecodeMatting");
        if (!(a32 == null || a32.f151496b == null || !(a32.f151496b instanceof Boolean))) {
            boolean booleanValue23 = ((Boolean) a32.f151496b).booleanValue();
            an.a("TEInterface", "parall Encode Matting: ".concat(String.valueOf(booleanValue23)));
            if (booleanValue23) {
                enableParallDecodeMatting(booleanValue23);
            }
        }
        u.d a33 = u.a().a("ve_enable_pip_resolution_opt");
        if (!(a33 == null || a33.f151496b == null || !(a33.f151496b instanceof Boolean))) {
            boolean booleanValue24 = ((Boolean) a33.f151496b).booleanValue();
            an.a("TEInterface", "pip resolution opt: ".concat(String.valueOf(booleanValue24)));
            if (booleanValue24) {
                enablePipResolutionOpt(booleanValue24);
            }
        }
        u.d a34 = u.a().a("ve_hardware_encode_fallback");
        if (!(a34 == null || a34.f151496b == null || !(a34.f151496b instanceof Integer))) {
            Integer num2 = (Integer) a34.f151496b;
            if (num2.intValue() != 0) {
                an.c("TEInterface", "ATTENTION!!! TESTING, HARDWARE ENCODE WILL FALLBACK TO SOFT, MODE = ".concat(String.valueOf(num2)));
                az.f151043g = num2.intValue();
            }
        }
        u.d a35 = u.a().a("ve_enable_effect_render_without_glreadpixels");
        if (!(a35 == null || a35.f151496b == null || !(a35.f151496b instanceof Boolean))) {
            boolean booleanValue25 = ((Boolean) a35.f151496b).booleanValue();
            an.a("TEInterface", "effect render without glreadpixels: ".concat(String.valueOf(booleanValue25)));
            if (booleanValue25) {
                enableEffectRenderWithoutGlreadpixels(booleanValue25);
            }
        }
        u.d a36 = u.a().a("ve_smart_trans_detect");
        if (!(a36 == null || a36.f151496b == null || !(a36.f151496b instanceof Boolean))) {
            boolean booleanValue26 = ((Boolean) a36.f151496b).booleanValue();
            an.a("TEInterface", "smart trans detect: ".concat(String.valueOf(booleanValue26)));
            if (booleanValue26) {
                enableSmartTransDetect(booleanValue26);
            }
        }
        u.d a37 = u.a().a("ve_enable_l_async_initialize");
        if (!(a37 == null || a37.f151496b == null || !(a37.f151496b instanceof Boolean))) {
            boolean booleanValue27 = ((Boolean) a37.f151496b).booleanValue();
            an.a("TEInterface", "lens async initialize: ".concat(String.valueOf(booleanValue27)));
            if (booleanValue27) {
                enableLensAsyncInitialize(booleanValue27);
            }
        }
        u.d a38 = u.a().a("ve_enable_tian_use_reader_factory");
        if (!(a38 == null || a38.f151496b == null || !(a38.f151496b instanceof Boolean))) {
            boolean booleanValue28 = ((Boolean) a38.f151496b).booleanValue();
            an.a("TEInterface", "titan use readerfactory: ".concat(String.valueOf(booleanValue28)));
            if (booleanValue28) {
                enableTitanUseReaderFactory(booleanValue28);
            }
        }
        MethodCollector.o(7822);
    }

    public final void setHostTrackIndex(int i2) {
        this.mHostTrackIndex = i2;
    }

    public final void setCompileFps(int i2) {
        setOption(0, "CompileFps", (long) i2);
    }

    public final void setCompileHardwareEncodeOptions(int i2) {
        setOption(0, "CompileHardwareBitrate", (long) i2);
    }

    public final void setCompileType(int i2) {
        setOption(0, "CompileType", (long) i2);
    }

    public final void setEncGopSize(int i2) {
        setOption(0, "video gop size", (long) i2);
    }

    public final void setPageMode(int i2) {
        setOption(0, "engine page mode", (long) i2);
    }

    public final void setScaleMode(int i2) {
        setOption(0, "filter mode", (long) i2);
    }

    public static int configMaxCacheFrameCount(int i2) {
        MethodCollector.i(8011);
        int nativeConfigMaxCacheFrameCount = nativeConfigMaxCacheFrameCount(i2);
        MethodCollector.o(8011);
        return nativeConfigMaxCacheFrameCount;
    }

    public static int enableAGFXCtx(boolean z) {
        MethodCollector.i(9673);
        int nativeEnableAGFXCtx = nativeEnableAGFXCtx(z);
        MethodCollector.o(9673);
        return nativeEnableAGFXCtx;
    }

    public static int enableAndroidHdr2SDRSupport(boolean z) {
        MethodCollector.i(8227);
        int nativeEnableAndroidHdr2SDRSupport = nativeEnableAndroidHdr2SDRSupport(z);
        MethodCollector.o(8227);
        return nativeEnableAndroidHdr2SDRSupport;
    }

    public static int enableAndroidHdrPreviewSupport(boolean z) {
        MethodCollector.i(8285);
        int nativeEnableAndroidHdrPreviewSupport = nativeEnableAndroidHdrPreviewSupport(z);
        MethodCollector.o(8285);
        return nativeEnableAndroidHdrPreviewSupport;
    }

    public static int enableAudioGBU(boolean z) {
        MethodCollector.i(10018);
        int nativeEnableAudioGBU = nativeEnableAudioGBU(z);
        MethodCollector.o(10018);
        return nativeEnableAudioGBU;
    }

    public static int enableAudioHwEncoder(boolean z) {
        MethodCollector.i(8749);
        int nativeAudioHwEncoder = nativeAudioHwEncoder(z);
        MethodCollector.o(8749);
        return nativeAudioHwEncoder;
    }

    public static int enableBingoRefactor(boolean z) {
        MethodCollector.i(8747);
        int nativeBingoRefactor = nativeBingoRefactor(z);
        MethodCollector.o(8747);
        return nativeBingoRefactor;
    }

    public static int enableCapabilityOpt(boolean z) {
        MethodCollector.i(9672);
        int nativeEnableDeviceCapabilityOpt = nativeEnableDeviceCapabilityOpt(z);
        MethodCollector.o(9672);
        return nativeEnableDeviceCapabilityOpt;
    }

    public static int enableColorSpace2020(boolean z) {
        MethodCollector.i(8744);
        int nativeEnableColorSpace2020 = nativeEnableColorSpace2020(z);
        MethodCollector.o(8744);
        return nativeEnableColorSpace2020;
    }

    public static int enableCreateDecoderByName(boolean z) {
        MethodCollector.i(8180);
        int nativeEnableCreateDecoderByName = nativeEnableCreateDecoderByName(z);
        MethodCollector.o(8180);
        return nativeEnableCreateDecoderByName;
    }

    public static int enableCrossplatformGLBaseFBO(boolean z) {
        MethodCollector.i(10017);
        int nativeEnableCrossplatformGLBaseFBO = nativeEnableCrossplatformGLBaseFBO(z);
        MethodCollector.o(10017);
        return nativeEnableCrossplatformGLBaseFBO;
    }

    public static int enableDecoderResourceScheduleOptHw(int i2) {
        MethodCollector.i(10015);
        int nativeEnableDecoderResourceScheduleOptHw = nativeEnableDecoderResourceScheduleOptHw(i2);
        MethodCollector.o(10015);
        return nativeEnableDecoderResourceScheduleOptHw;
    }

    public static int enableDisplayP3ReEncode(boolean z) {
        MethodCollector.i(11451);
        int nativeEnableDisplayP3ReEncode = nativeEnableDisplayP3ReEncode(z);
        MethodCollector.o(11451);
        return nativeEnableDisplayP3ReEncode;
    }

    public static int enableDisplayP3Render(boolean z) {
        MethodCollector.i(11624);
        int nativeEnableDisplayP3Render = nativeEnableDisplayP3Render(z);
        MethodCollector.o(11624);
        return nativeEnableDisplayP3Render;
    }

    public static int enableEffectAmazingMV(boolean z) {
        MethodCollector.i(8009);
        int nativeEnableEffectAmazingMV = nativeEnableEffectAmazingMV(z);
        MethodCollector.o(8009);
        return nativeEnableEffectAmazingMV;
    }

    public static int enableEffectRenderWithoutGlreadpixels(boolean z) {
        MethodCollector.i(10806);
        int nativeEnableEffectRenderWithoutGlreadpixels = nativeEnableEffectRenderWithoutGlreadpixels(z);
        MethodCollector.o(10806);
        return nativeEnableEffectRenderWithoutGlreadpixels;
    }

    public static int enableEngineResourceOpt(boolean z) {
        MethodCollector.i(10014);
        int nativeEnableEngineResourceOpt = nativeEnableEngineResourceOpt(z);
        MethodCollector.o(10014);
        return nativeEnableEngineResourceOpt;
    }

    public static int enableFileInfoCache(boolean z) {
        MethodCollector.i(10019);
        int nativeEnableFileInfoCache = nativeEnableFileInfoCache(z);
        MethodCollector.o(10019);
        return nativeEnableFileInfoCache;
    }

    public static int enableFirstFrameOpt(boolean z) {
        MethodCollector.i(11298);
        int nativeEnableFirstFrameOpt = nativeEnableFirstFrameOpt(z);
        MethodCollector.o(11298);
        return nativeEnableFirstFrameOpt;
    }

    public static int enableHighSpeed(boolean z) {
        MethodCollector.i(7954);
        int nativeEnableHighSpeed = nativeEnableHighSpeed(z);
        MethodCollector.o(7954);
        return nativeEnableHighSpeed;
    }

    public static int enableImageAlgorithmReuseAndOptForAmazing(boolean z) {
        MethodCollector.i(10346);
        int nativeEnableImageAlgorithmReuseAndOptForAmazing = nativeEnableImageAlgorithmReuseAndOptForAmazing(z);
        MethodCollector.o(10346);
        return nativeEnableImageAlgorithmReuseAndOptForAmazing;
    }

    public static int enableLensAsyncInitialize(boolean z) {
        MethodCollector.i(12528);
        int nativeEnableLensAsyncInitialize = nativeEnableLensAsyncInitialize(z);
        MethodCollector.o(12528);
        return nativeEnableLensAsyncInitialize;
    }

    public static int enableMultiThreadDecode(boolean z) {
        MethodCollector.i(10020);
        int nativeEnableMultiThreadDecode = nativeEnableMultiThreadDecode(z);
        MethodCollector.o(10020);
        return nativeEnableMultiThreadDecode;
    }

    public static int enableNewAudioMixer(boolean z) {
        MethodCollector.i(8943);
        int nativeEnableNewAudioMixer = nativeEnableNewAudioMixer(z);
        MethodCollector.o(8943);
        return nativeEnableNewAudioMixer;
    }

    public static int enableOptGlFlush(boolean z) {
        MethodCollector.i(10344);
        int nativeEnableOptGLFlush = nativeEnableOptGLFlush(z);
        MethodCollector.o(10344);
        return nativeEnableOptGLFlush;
    }

    public static int enableOptPlayBackDropFrame(boolean z) {
        MethodCollector.i(10180);
        int nativeEnableOptPlayBackDropFrame = nativeEnableOptPlayBackDropFrame(z);
        MethodCollector.o(10180);
        return nativeEnableOptPlayBackDropFrame;
    }

    public static int enableOutResolutionAlign4(boolean z) {
        MethodCollector.i(10808);
        int nativeEnableOutResolutionAlign4 = nativeEnableOutResolutionAlign4(z);
        MethodCollector.o(10808);
        return nativeEnableOutResolutionAlign4;
    }

    public static int enableParallDecodeMatting(boolean z) {
        MethodCollector.i(10506);
        int nativeEnableParallDecodeMatting = nativeEnableParallDecodeMatting(z);
        MethodCollector.o(10506);
        return nativeEnableParallDecodeMatting;
    }

    public static int enablePinRefactor(boolean z) {
        MethodCollector.i(10016);
        int nativeEnablePinRefactor = nativeEnablePinRefactor(z);
        MethodCollector.o(10016);
        return nativeEnablePinRefactor;
    }

    public static int enablePipResolutionOpt(boolean z) {
        MethodCollector.i(10655);
        int nativeEnablePipResolutionOpt = nativeEnablePipResolutionOpt(z);
        MethodCollector.o(10655);
        return nativeEnablePipResolutionOpt;
    }

    public static int enableReaderManagerRefactor(boolean z) {
        MethodCollector.i(9148);
        int nativeEnableReaderManagerRefactor = nativeEnableReaderManagerRefactor(z);
        MethodCollector.o(9148);
        return nativeEnableReaderManagerRefactor;
    }

    public static int enableReaderRefactor(boolean z) {
        MethodCollector.i(9844);
        int nativeEnableReaderRefactor = nativeEnableReaderRefactor(z);
        MethodCollector.o(9844);
        return nativeEnableReaderRefactor;
    }

    public static int enableRenderLib(boolean z) {
        MethodCollector.i(8945);
        int nativeEnableRenderLib = nativeEnableRenderLib(z);
        MethodCollector.o(8945);
        return nativeEnableRenderLib;
    }

    public static int enableSeekAndPreloadOpt(boolean z) {
        MethodCollector.i(10021);
        int nativeEnableSeekAndPreloadOpt = nativeEnableSeekAndPreloadOpt(z);
        MethodCollector.o(10021);
        return nativeEnableSeekAndPreloadOpt;
    }

    public static int enableSeekPredictOpt(boolean z) {
        MethodCollector.i(8120);
        int nativeSeekPredictOpt = nativeSeekPredictOpt(z);
        MethodCollector.o(8120);
        return nativeSeekPredictOpt;
    }

    public static int enableSmartTransDetect(boolean z) {
        MethodCollector.i(10807);
        int nativeEnableSmartTransDetect = nativeEnableSmartTransDetect(z);
        MethodCollector.o(10807);
        return nativeEnableSmartTransDetect;
    }

    public static int enableTitanUseReaderFactory(boolean z) {
        MethodCollector.i(12633);
        int nativeEnableTitanUseReaderFactory = nativeEnableTitanUseReaderFactory(z);
        MethodCollector.o(12633);
        return nativeEnableTitanUseReaderFactory;
    }

    public static int forceCompileBytevc1SWdecode(boolean z) {
        MethodCollector.i(8475);
        int nativeForceCompileBytevc1SWdecode = nativeForceCompileBytevc1SWdecode(z);
        MethodCollector.o(8475);
        return nativeForceCompileBytevc1SWdecode;
    }

    public static int forceEditBytevc1SWdecode(boolean z) {
        MethodCollector.i(8289);
        int nativeForceEditBytevc1SWdecode = nativeForceEditBytevc1SWdecode(z);
        MethodCollector.o(8289);
        return nativeForceEditBytevc1SWdecode;
    }

    public static Object getMVInfoStatic(String str) {
        MethodCollector.i(10540);
        Object nativeGetMVInfoStatic = nativeGetMVInfoStatic(str);
        MethodCollector.o(10540);
        return nativeGetMVInfoStatic;
    }

    public static int openEditorFpsLog(boolean z) {
        MethodCollector.i(10976);
        int nativeOpenEditorFpsLog = nativeOpenEditorFpsLog(z);
        MethodCollector.o(10976);
        return nativeOpenEditorFpsLog;
    }

    public static int openOutputCallback(boolean z) {
        MethodCollector.i(10977);
        int nativeOpenOutputCallback = nativeOpenOutputCallback(z);
        MethodCollector.o(10977);
        return nativeOpenOutputCallback;
    }

    public static int setCompileGLContextReuse(boolean z) {
        MethodCollector.i(12527);
        int nativeEnableCompileGLContextReuse = nativeEnableCompileGLContextReuse(z);
        MethodCollector.o(12527);
        return nativeEnableCompileGLContextReuse;
    }

    public static int setCompileReportState(int i2) {
        MethodCollector.i(12243);
        int nativeSetCompileReport = nativeSetCompileReport(i2);
        MethodCollector.o(12243);
        return nativeSetCompileReport;
    }

    public static int setEnableEffectCanvas(boolean z) {
        MethodCollector.i(11942);
        int nativeEnableEffectCanvas = nativeEnableEffectCanvas(z);
        MethodCollector.o(11942);
        return nativeEnableEffectCanvas;
    }

    public static int setEnableEffectTransition(boolean z) {
        MethodCollector.i(11940);
        int nativeEnableEffectTransiton = nativeEnableEffectTransiton(z);
        MethodCollector.o(11940);
        return nativeEnableEffectTransiton;
    }

    public static int setEnableOpt(int i2) {
        MethodCollector.i(7843);
        int nativeSetOptVersion = nativeSetOptVersion(i2);
        MethodCollector.o(7843);
        return nativeSetOptVersion;
    }

    public static int setEnableRefaComposer(boolean z) {
        MethodCollector.i(12088);
        int nativeEnableRefaComposer = nativeEnableRefaComposer(z);
        MethodCollector.o(12088);
        return nativeEnableRefaComposer;
    }

    public static int setForceDropFrameWithoutAudio(boolean z) {
        MethodCollector.i(11941);
        int nativeSetForceDropFrameWithoutAudio = nativeSetForceDropFrameWithoutAudio(z);
        MethodCollector.o(11941);
        return nativeSetForceDropFrameWithoutAudio;
    }

    public static int setInfoStickerTransEnable(boolean z) {
        MethodCollector.i(7826);
        int nativeSetInfoStickerTransEnable = nativeSetInfoStickerTransEnable(z);
        MethodCollector.o(7826);
        return nativeSetInfoStickerTransEnable;
    }

    public static void setLensOneKeyHdrMaxCacheSize(int i2) {
        MethodCollector.i(7859);
        nativeSetMaxDetectFrameCount(i2);
        MethodCollector.o(7859);
    }

    public static int setMaxAudioReaderCount(int i2) {
        MethodCollector.i(11142);
        int nativeSetMaxAudioReaderCount = nativeSetMaxAudioReaderCount(i2);
        MethodCollector.o(11142);
        return nativeSetMaxAudioReaderCount;
    }

    public final void clearDisplay(int i2) {
        MethodCollector.i(7835);
        nativeClearDisplay(this.mNative, i2);
        MethodCollector.o(7835);
    }

    public final void enableSimpleProcessor(boolean z) {
        long j2;
        if (z) {
            j2 = 1;
        } else {
            j2 = 0;
        }
        setOption(0, "engine processor mode", j2);
    }

    public final int expandTimeline(int i2) {
        MethodCollector.i(11591);
        int nativeExpandTimeline = nativeExpandTimeline(this.mNative, i2);
        MethodCollector.o(11591);
        return nativeExpandTimeline;
    }

    public final int setEditorFirstFrameDelay(int i2) {
        MethodCollector.i(11299);
        int nativeSetEditorFirstFrameDelay = nativeSetEditorFirstFrameDelay(i2);
        MethodCollector.o(11299);
        return nativeSetEditorFirstFrameDelay;
    }

    public final void setForceDetectForFirstFrameByClip(boolean z) {
        long j2;
        if (z) {
            j2 = 1;
        } else {
            j2 = 0;
        }
        setOption(0, "force detect for first frame by clip", j2);
    }

    public final void setHeightWidthRatio(float f2) {
        if (f2 > 0.0f) {
            setOption(0, "engine height width ratio", f2);
        }
    }

    public final void setLooping(boolean z) {
        long j2;
        if (z) {
            j2 = 1;
        } else {
            j2 = 0;
        }
        setOption(1, "engine loop play", j2);
    }

    public final void setMultiComposer(boolean z) {
        long j2;
        if (z) {
            j2 = 1;
        } else {
            j2 = 0;
        }
        setOption(0, "is multi composer filter", j2);
    }

    public final void setUseHwEnc(boolean z) {
        long j2;
        if (z) {
            j2 = 1;
        } else {
            j2 = 0;
        }
        setOption(0, "HardwareVideo", j2);
    }

    public final void setUseLargeMattingModel(boolean z) {
        long j2;
        if (z) {
            j2 = 1;
        } else {
            j2 = 0;
        }
        setOption(0, "UseLargeMattingModel", j2);
    }

    public final String addFileInfoCache(String str) {
        MethodCollector.i(10030);
        long j2 = this.mNative;
        if (j2 == 0) {
            MethodCollector.o(10030);
            return "";
        }
        String nativeAddFileInfoCache = nativeAddFileInfoCache(j2, str);
        MethodCollector.o(10030);
        return nativeAddFileInfoCache;
    }

    public final int appendComposerNodes(String[] strArr) {
        MethodCollector.i(8268);
        long j2 = this.mNative;
        if (j2 == 0) {
            MethodCollector.o(8268);
            return -112;
        }
        int nativeAppendComposerNodes = nativeAppendComposerNodes(j2, strArr);
        MethodCollector.o(8268);
        return nativeAppendComposerNodes;
    }

    public final int deleteAICutOutClipParam(int i2) {
        MethodCollector.i(7809);
        long j2 = this.mNative;
        if (j2 == 0) {
            MethodCollector.o(7809);
            return -112;
        }
        int nativeRemoveAICutOutClipParam = nativeRemoveAICutOutClipParam(j2, i2);
        MethodCollector.o(7809);
        return nativeRemoveAICutOutClipParam;
    }

    public final int deleteExternalVideoTrack(int i2) {
        MethodCollector.i(10623);
        long j2 = this.mNative;
        if (j2 == 0) {
            MethodCollector.o(10623);
            return -1;
        }
        int nativeDeleteSubVideoTrack = nativeDeleteSubVideoTrack(j2, i2);
        MethodCollector.o(10623);
        return nativeDeleteSubVideoTrack;
    }

    public final int enableAudioDisplayCallBack(boolean z) {
        MethodCollector.i(7898);
        long j2 = this.mNative;
        if (j2 == 0) {
            MethodCollector.o(7898);
            return -112;
        }
        int nativeEnableAudioDisplayCallBack = nativeEnableAudioDisplayCallBack(j2, z);
        MethodCollector.o(7898);
        return nativeEnableAudioDisplayCallBack;
    }

    public final int enableEffect(boolean z) {
        MethodCollector.i(7941);
        long j2 = this.mNative;
        if (j2 == 0) {
            MethodCollector.o(7941);
            return -112;
        }
        int nativeEnableEffect = nativeEnableEffect(j2, z);
        MethodCollector.o(7941);
        return nativeEnableEffect;
    }

    public final int enableEffectAmazing(boolean z) {
        MethodCollector.i(7543);
        long j2 = this.mNative;
        if (j2 == 0) {
            MethodCollector.o(7543);
            return -112;
        }
        int nativeEnableEffectAmazing = nativeEnableEffectAmazing(j2, z);
        MethodCollector.o(7543);
        return nativeEnableEffectAmazing;
    }

    public final int enableFaceDetect(boolean z) {
        MethodCollector.i(7066);
        long j2 = this.mNative;
        if (j2 == 0) {
            MethodCollector.o(7066);
            return -112;
        }
        int nativeEnableFaceDetect = nativeEnableFaceDetect(j2, z);
        MethodCollector.o(7066);
        return nativeEnableFaceDetect;
    }

    public final int enableGenderDetect(boolean z) {
        MethodCollector.i(7070);
        long j2 = this.mNative;
        if (j2 == 0) {
            MethodCollector.o(7070);
            return -112;
        }
        int nativeEnableGenderDetect = nativeEnableGenderDetect(j2, z);
        MethodCollector.o(7070);
        return nativeEnableGenderDetect;
    }

    public final int enableHighSpeedForSingle(boolean z) {
        MethodCollector.i(7117);
        long j2 = this.mNative;
        if (j2 == 0) {
            MethodCollector.o(7117);
            return -112;
        }
        int nativeEnableHighSpeedForSingle = nativeEnableHighSpeedForSingle(j2, z);
        MethodCollector.o(7117);
        return nativeEnableHighSpeedForSingle;
    }

    public final int enableImageEditor(boolean z) {
        MethodCollector.i(7887);
        long j2 = this.mNative;
        if (j2 == 0) {
            MethodCollector.o(7887);
            return -112;
        }
        int nativeEnableImageEditor = nativeEnableImageEditor(j2, z);
        MethodCollector.o(7887);
        return nativeEnableImageEditor;
    }

    public final void enableReEncodeOpt(boolean z) {
        MethodCollector.i(14211);
        long j2 = this.mNative;
        if (j2 == 0) {
            MethodCollector.o(14211);
            return;
        }
        nativeEnableReEncodeOpt(j2, z);
        MethodCollector.o(14211);
    }

    public final int faceCoverSetDir(String str) {
        MethodCollector.i(8029);
        long j2 = this.mNative;
        if (j2 == 0) {
            MethodCollector.o(8029);
            return -112;
        }
        int nativeFaceCoverSetDir = nativeFaceCoverSetDir(j2, str);
        MethodCollector.o(8029);
        return nativeFaceCoverSetDir;
    }

    public final byte[] getAudioCommonFilterPreprocessResult(long j2) {
        MethodCollector.i(11996);
        long j3 = this.mNative;
        if (j3 == 0) {
            MethodCollector.o(11996);
            return null;
        }
        byte[] nativeGetAudioCommonFilterPreprocessResult = nativeGetAudioCommonFilterPreprocessResult(j3, j2);
        MethodCollector.o(11996);
        return nativeGetAudioCommonFilterPreprocessResult;
    }

    public final float getClipMattingProgress(int i2) {
        MethodCollector.i(7856);
        long j2 = this.mNative;
        if (j2 == 0) {
            MethodCollector.o(7856);
            return -112.0f;
        }
        float nativeGetClipProgress = nativeGetClipProgress(j2, i2);
        MethodCollector.o(7856);
        return nativeGetClipProgress;
    }

    public final float getColorFilterIntensity(String str) {
        MethodCollector.i(7634);
        long j2 = this.mNative;
        if (j2 == 0) {
            MethodCollector.o(7634);
            return -112.0f;
        }
        float nativeGetColorFilterIntensity = nativeGetColorFilterIntensity(j2, str);
        MethodCollector.o(7634);
        return nativeGetColorFilterIntensity;
    }

    public final int getDisplayImage(Bitmap bitmap) {
        MethodCollector.i(7195);
        long j2 = this.mNative;
        if (j2 == 0) {
            MethodCollector.o(7195);
            return -112;
        }
        int nativeGetDisplayImage = nativeGetDisplayImage(j2, bitmap);
        MethodCollector.o(7195);
        return nativeGetDisplayImage;
    }

    public final String getMetaData(String str) {
        MethodCollector.i(10029);
        long j2 = this.mNative;
        if (j2 == 0) {
            MethodCollector.o(10029);
            return "";
        }
        String nativeGetMetaData = nativeGetMetaData(j2, str);
        MethodCollector.o(10029);
        return nativeGetMetaData;
    }

    public final int getProcessedImage(Bitmap bitmap) {
        MethodCollector.i(7747);
        long j2 = this.mNative;
        if (j2 == 0) {
            MethodCollector.o(7747);
            return -112;
        }
        int nativeGetProcessedImage = nativeGetProcessedImage(j2, bitmap);
        MethodCollector.o(7747);
        return nativeGetProcessedImage;
    }

    public final int getTransparentImage(Bitmap bitmap) {
        MethodCollector.i(7764);
        long j2 = this.mNative;
        if (j2 == 0) {
            MethodCollector.o(7764);
            return -112;
        }
        int nativeGetTransparentImage = nativeGetTransparentImage(j2, bitmap);
        MethodCollector.o(7764);
        return nativeGetTransparentImage;
    }

    public final int lockSeekVideoClip(int i2) {
        MethodCollector.i(13860);
        long j2 = this.mNative;
        if (j2 == 0) {
            MethodCollector.o(13860);
            return -112;
        }
        int nativeLockSeekVideoClip = nativeLockSeekVideoClip(j2, i2);
        MethodCollector.o(13860);
        return nativeLockSeekVideoClip;
    }

    public final int pause(int i2) {
        MethodCollector.i(8465);
        long j2 = this.mNative;
        if (j2 == 0) {
            MethodCollector.o(8465);
            return -112;
        }
        int nativePause = nativePause(j2, i2);
        MethodCollector.o(8465);
        return nativePause;
    }

    public final int prepareEngine(int i2) {
        MethodCollector.i(12969);
        long j2 = this.mNative;
        if (j2 == 0) {
            MethodCollector.o(12969);
            return -112;
        }
        int nativePrepareEngine = nativePrepareEngine(j2, i2);
        MethodCollector.o(12969);
        return nativePrepareEngine;
    }

    public final int pushImageToBuffer(String str) {
        MethodCollector.i(12756);
        long j2 = this.mNative;
        if (j2 == 0) {
            MethodCollector.o(12756);
            return -112;
        }
        int nativePushImageToBuffer = nativePushImageToBuffer(j2, str);
        MethodCollector.o(12756);
        return nativePushImageToBuffer;
    }

    public final int refreshCurrentFrame(int i2) {
        MethodCollector.i(8469);
        long j2 = this.mNative;
        if (j2 == 0) {
            MethodCollector.o(8469);
            return -112;
        }
        int nativeRefreshCurrentFrame = nativeRefreshCurrentFrame(j2, i2);
        MethodCollector.o(8469);
        return nativeRefreshCurrentFrame;
    }

    public final int reloadComposerNodes(String[] strArr) {
        MethodCollector.i(8217);
        long j2 = this.mNative;
        if (j2 == 0) {
            MethodCollector.o(8217);
            return -112;
        }
        int nativeReloadComposerNodes = nativeReloadComposerNodes(j2, strArr);
        MethodCollector.o(8217);
        return nativeReloadComposerNodes;
    }

    public final int removeComposerNodes(String[] strArr) {
        MethodCollector.i(8271);
        long j2 = this.mNative;
        if (j2 == 0) {
            MethodCollector.o(8271);
            return -112;
        }
        int nativeRemoveComposerNodes = nativeRemoveComposerNodes(j2, strArr);
        MethodCollector.o(8271);
        return nativeRemoveComposerNodes;
    }

    public final int removeFilter(int[] iArr) {
        MethodCollector.i(11913);
        long j2 = this.mNative;
        if (j2 == 0) {
            MethodCollector.o(11913);
            return -112;
        }
        int nativeRemoveFilter = nativeRemoveFilter(j2, iArr);
        MethodCollector.o(11913);
        return nativeRemoveFilter;
    }

    public final int seekWithResult(int i2) {
        MethodCollector.i(13693);
        long j2 = this.mNative;
        if (j2 == 0) {
            MethodCollector.o(13693);
            return -112;
        }
        int nativeSeekWithResult = nativeSeekWithResult(j2, i2);
        MethodCollector.o(13693);
        return nativeSeekWithResult;
    }

    public final void setBackGroundColor(int i2) {
        MethodCollector.i(7772);
        long j2 = this.mNative;
        if (j2 == 0) {
            MethodCollector.o(7772);
            return;
        }
        nativeSetBackGroundColor(j2, i2);
        MethodCollector.o(7772);
    }

    public final int setClientState(int i2) {
        MethodCollector.i(10055);
        long j2 = this.mNative;
        if (j2 == 0) {
            MethodCollector.o(10055);
            return -112;
        }
        int nativeSetClientState = nativeSetClientState(j2, i2);
        MethodCollector.o(10055);
        return nativeSetClientState;
    }

    public final void setCompileSoftInfo(boolean z) {
        long j2 = 0;
        if (this.mNative != 0) {
            if (z) {
                j2 = 1;
            }
            setOption(0, "CompileSoftInfo", j2);
        }
    }

    public final int setComposerNodes(String[] strArr) {
        MethodCollector.i(8148);
        long j2 = this.mNative;
        if (j2 == 0) {
            MethodCollector.o(8148);
            return -112;
        }
        int nativeSetComposerNodes = nativeSetComposerNodes(j2, strArr);
        MethodCollector.o(8148);
        return nativeSetComposerNodes;
    }

    public final int setDestroyVersion(boolean z) {
        MethodCollector.i(12615);
        long j2 = this.mNative;
        if (j2 == 0) {
            MethodCollector.o(12615);
            return -112;
        }
        int nativeSetDestroyVersion = nativeSetDestroyVersion(j2, z);
        MethodCollector.o(12615);
        return nativeSetDestroyVersion;
    }

    public final int setDldEnabled(boolean z) {
        MethodCollector.i(7405);
        long j2 = this.mNative;
        if (j2 == 0) {
            MethodCollector.o(7405);
            return -112;
        }
        int nativeSetDldEnabled = nativeSetDldEnabled(j2, z);
        MethodCollector.o(7405);
        return nativeSetDldEnabled;
    }

    public final int setDldThrVal(int i2) {
        MethodCollector.i(7469);
        long j2 = this.mNative;
        if (j2 == 0) {
            MethodCollector.o(7469);
            return -112;
        }
        int nativeSetDldThrVal = nativeSetDldThrVal(j2, i2);
        MethodCollector.o(7469);
        return nativeSetDldThrVal;
    }

    public final int setDleEnabled(boolean z) {
        MethodCollector.i(7323);
        long j2 = this.mNative;
        if (j2 == 0) {
            MethodCollector.o(7323);
            return -112;
        }
        int nativeSetDleEnabled = nativeSetDleEnabled(j2, z);
        MethodCollector.o(7323);
        return nativeSetDleEnabled;
    }

    public final int setDleEnabledPreview(boolean z) {
        MethodCollector.i(7401);
        long j2 = this.mNative;
        if (j2 == 0) {
            MethodCollector.o(7401);
            return -112;
        }
        int nativeSetDleEnabledPreview = nativeSetDleEnabledPreview(j2, z);
        MethodCollector.o(7401);
        return nativeSetDleEnabledPreview;
    }

    public final int setEffectCallback(VEListener.VEEditorEffectListener vEEditorEffectListener) {
        MethodCollector.i(7547);
        long j2 = this.mNative;
        if (j2 == 0) {
            MethodCollector.o(7547);
            return -112;
        }
        int nativeSetEffectCallback = nativeSetEffectCallback(j2, vEEditorEffectListener);
        MethodCollector.o(7547);
        return nativeSetEffectCallback;
    }

    public final int setEffectMaxMemoryCache(int i2) {
        MethodCollector.i(7781);
        long j2 = this.mNative;
        if (j2 == 0) {
            MethodCollector.o(7781);
            return -112;
        }
        int nativeSetEffectMaxMemoryCache = nativeSetEffectMaxMemoryCache(j2, i2);
        MethodCollector.o(7781);
        return nativeSetEffectMaxMemoryCache;
    }

    public final int setEffectParams(VEEffectParams vEEffectParams) {
        MethodCollector.i(10221);
        long j2 = this.mNative;
        if (j2 == 0) {
            MethodCollector.o(10221);
            return -112;
        }
        int nativeSetEffectParams = nativeSetEffectParams(j2, vEEffectParams);
        MethodCollector.o(10221);
        return nativeSetEffectParams;
    }

    public final void setEnableCompileVboost(boolean z) {
        long j2 = 0;
        if (this.mNative != 0) {
            if (z) {
                j2 = 1;
            }
            setOption(0, "EnableCompileVboost", j2);
        }
    }

    public final void setEnableInterLeave(boolean z) {
        long j2 = 0;
        if (this.mNative != 0) {
            if (z) {
                j2 = 1;
            }
            setOption(0, "CompileInterleave", j2);
        }
    }

    public final void setEnableMultipleAudioFilter(boolean z) {
        MethodCollector.i(11747);
        long j2 = this.mNative;
        if (j2 == 0) {
            MethodCollector.o(11747);
            return;
        }
        nativeSetEnableMultipleAudioFilter(j2, z);
        MethodCollector.o(11747);
    }

    public final void setEnableRemuxVideo(boolean z) {
        MethodCollector.i(14236);
        long j2 = this.mNative;
        if (j2 == 0) {
            MethodCollector.o(14236);
            return;
        }
        nativeSetEnableRemuxVideo(j2, z);
        MethodCollector.o(14236);
    }

    public final void setEncoderParallel(boolean z) {
        MethodCollector.i(14176);
        long j2 = this.mNative;
        if (j2 == 0) {
            MethodCollector.o(14176);
            return;
        }
        nativeSetEncoderParallel(j2, z);
        MethodCollector.o(14176);
    }

    public final void setExpandLastFrame(boolean z) {
        MethodCollector.i(14139);
        long j2 = this.mNative;
        if (j2 == 0) {
            MethodCollector.o(14139);
            return;
        }
        nativeSetExpandLastFrame(j2, z);
        MethodCollector.o(14139);
    }

    public final int setMaleMakeupState(boolean z) {
        MethodCollector.i(7936);
        long j2 = this.mNative;
        if (j2 == 0) {
            MethodCollector.o(7936);
            return -112;
        }
        int nativeSetMaleMakeupState = nativeSetMaleMakeupState(j2, z);
        MethodCollector.o(7936);
        return nativeSetMaleMakeupState;
    }

    public final int setPreviewFps(int i2) {
        MethodCollector.i(13561);
        long j2 = this.mNative;
        if (j2 == 0) {
            MethodCollector.o(13561);
            return -112;
        }
        nativeSetPreviewFps(j2, i2);
        MethodCollector.o(13561);
        return 0;
    }

    public final int setPreviewScaleMode(int i2) {
        MethodCollector.i(13626);
        long j2 = this.mNative;
        if (j2 == 0) {
            MethodCollector.o(13626);
            return -112;
        }
        int nativeSetPreviewScaleMode = nativeSetPreviewScaleMode(j2, i2);
        MethodCollector.o(13626);
        return nativeSetPreviewScaleMode;
    }

    public final void setPreviewSurface(Surface surface) {
        MethodCollector.i(14103);
        long j2 = this.mNative;
        if (j2 == 0) {
            MethodCollector.o(14103);
            return;
        }
        nativeSetPreviewSurface(j2, surface);
        MethodCollector.o(14103);
    }

    public final void setPreviewSurfaceBitmap(Bitmap bitmap) {
        MethodCollector.i(14105);
        long j2 = this.mNative;
        if (j2 == 0) {
            MethodCollector.o(14105);
            return;
        }
        nativeSetPreviewSurfaceBitmap(j2, bitmap);
        MethodCollector.o(14105);
    }

    public final void setSpeedRatio(float f2) {
        MethodCollector.i(14235);
        long j2 = this.mNative;
        if (j2 == 0) {
            MethodCollector.o(14235);
            return;
        }
        nativeSetSpeedRatio(j2, f2);
        MethodCollector.o(14235);
    }

    public final void setVideoBackGroundColor(int i2) {
        MethodCollector.i(7779);
        long j2 = this.mNative;
        if (j2 == 0) {
            MethodCollector.o(7779);
            return;
        }
        nativeSetVideoBackGroundColor(j2, i2);
        MethodCollector.o(7779);
    }

    public final int updateSceneFileOrder(bg bgVar) {
        MethodCollector.i(8404);
        long j2 = this.mNative;
        if (j2 == 0) {
            MethodCollector.o(8404);
            return -112;
        }
        int nativeUpdateSceneFileOrder = nativeUpdateSceneFileOrder(j2, bgVar.f151085b);
        MethodCollector.o(8404);
        return nativeUpdateSceneFileOrder;
    }

    public final boolean isGestureRegistered(af afVar) {
        int ordinal;
        MethodCollector.i(10379);
        if (this.mNative == 0) {
            MethodCollector.o(10379);
            return false;
        }
        if (afVar.ordinal() == af.ANY_SUPPORTED.ordinal()) {
            ordinal = -1;
        } else {
            ordinal = afVar.ordinal();
        }
        boolean nativeIsGestureRegistered = nativeIsGestureRegistered(this.mNative, ordinal);
        MethodCollector.o(10379);
        return nativeIsGestureRegistered;
    }

    public final void setCompileWatermark(VEWatermarkParam vEWatermarkParam) {
        if (vEWatermarkParam.needExtFile) {
            setOption(0, "SingleWayCompileWithWatermark", 0L);
            setOption(0, "CompilePathWatermark", vEWatermarkParam.extFile);
        } else {
            setOption(0, "SingleWayCompileWithWatermark", 1L);
        }
        setOption(0, "CompilePathWavWatermark", "");
    }

    public final void setKeyFramePoints(int[] iArr) {
        if (this.mNative != 0) {
            long[] jArr = new long[iArr.length];
            for (int i2 = 0; i2 < iArr.length; i2++) {
                jArr[i2] = (long) (iArr[i2] * 1000);
            }
            setOption(0, "compileKeyFramePoints", jArr);
        }
    }

    public final void setUsrRotate(int i2) {
        if (i2 == 0) {
            setOption(0, "usr rotate", 0L);
        } else if (i2 == 90) {
            setOption(0, "usr rotate", 1L);
        } else if (i2 == 180) {
            setOption(0, "usr rotate", 2L);
        } else if (i2 != 270) {
            setOption(0, "usr rotate", 0L);
        } else {
            setOption(0, "usr rotate", 3L);
        }
    }

    public final int updateSenceTime(bg bgVar) {
        MethodCollector.i(8403);
        long j2 = this.mNative;
        if (j2 == 0) {
            MethodCollector.o(8403);
            return -112;
        }
        int nativeUpdateSceneTime = nativeUpdateSceneTime(j2, bgVar.f151093j, bgVar.f151088e, bgVar.f151089f, ROTATE_DEGREE.toIntArray(bgVar.f151094k), bgVar.f151092i);
        MethodCollector.o(8403);
        return nativeUpdateSceneTime;
    }

    public static TEInterface createEngine(long j2) {
        int i2;
        MethodCollector.i(7935);
        TEInterface tEInterface = new TEInterface();
        if (VERuntime.a.INSTANCE.veRuntime.f151400e) {
            i2 = 3;
        } else {
            i2 = 2;
        }
        TEGLGlobalContext.nativeSetGLVersion(i2);
        TEGLGlobalContext.nativeSetMaxRenderSize(VERuntime.a.INSTANCE.veRuntime.f151402g.width, VERuntime.a.INSTANCE.veRuntime.f151402g.height);
        if (j2 == 0) {
            MethodCollector.o(7935);
            return null;
        }
        tEInterface.mNative = j2;
        tEInterface.nativeResetCallback(j2);
        b.a("vesdk_event_editor_init", null, "behavior");
        MethodCollector.o(7935);
        return tEInterface;
    }

    public final int enableHDRSetting(boolean z) {
        MethodCollector.i(7279);
        if (this.mNative == 0) {
            MethodCollector.o(7279);
            return -112;
        }
        u.d a2 = u.a().a("enable_android_hdr_preview_support");
        if (a2 == null || a2.f151496b == null || !(a2.f151496b instanceof Boolean) || ((Boolean) a2.f151496b).booleanValue()) {
            int i2 = Build.VERSION.SDK_INT;
            int nativeEnableHDRSetting = nativeEnableHDRSetting(this.mNative, z);
            MethodCollector.o(7279);
            return nativeEnableHDRSetting;
        }
        MethodCollector.o(7279);
        return -1;
    }

    public static TEInterface createEngine(bj bjVar) {
        int[] iArr;
        String[] strArr;
        int[] iArr2;
        int i2;
        int length;
        MethodCollector.i(7933);
        if (bjVar == null || (length = bjVar.a().length) <= 0) {
            iArr2 = null;
            iArr = null;
            strArr = null;
        } else {
            iArr = new int[length];
            strArr = new String[length];
            iArr2 = new int[length];
            for (int i3 = 0; i3 < bjVar.a().length; i3++) {
                strArr[i3] = bjVar.a()[i3].f151109c.value();
                iArr2[i3] = bjVar.a()[i3].f151107a.value();
                if (iArr2[i3] == 0) {
                    iArr[i3] = bjVar.a()[i3].f151108b.booleanValue() ? 1 : 0;
                } else if (iArr2[i3] == 1) {
                    iArr[i3] = bjVar.a()[i3].f151108b.intValue();
                } else {
                    an.d("setUserConfig", "illegal type");
                    iArr[i3] = -1;
                }
            }
        }
        TEInterface tEInterface = new TEInterface();
        if (VERuntime.a.INSTANCE.veRuntime.f151400e) {
            i2 = 3;
        } else {
            i2 = 2;
        }
        TEGLGlobalContext.nativeSetGLVersion(i2);
        TEGLGlobalContext.nativeSetMaxRenderSize(VERuntime.a.INSTANCE.veRuntime.f151402g.width, VERuntime.a.INSTANCE.veRuntime.f151402g.height);
        long nativeCreateEngine = tEInterface.nativeCreateEngine(strArr, iArr2, iArr);
        if (nativeCreateEngine == 0) {
            MethodCollector.o(7933);
            return null;
        }
        tEInterface.mNative = nativeCreateEngine;
        b.a("vesdk_event_editor_init", null, "behavior");
        MethodCollector.o(7933);
        return tEInterface;
    }

    public static int setTexturePoolLimit(int i2, int i3) {
        MethodCollector.i(11783);
        int nativeSetTexturePoolLimit = nativeSetTexturePoolLimit(i2, i3);
        MethodCollector.o(11783);
        return nativeSetTexturePoolLimit;
    }

    public final void setCompileCommonEncodeOptions(int i2, int i3) {
        setOption(0, "CompileBitrateMode", (long) i2);
        setOption(0, "CompileEncodeProfile", (long) i3);
    }

    public final void setEngineCompilePath(String str, String str2) {
        setOption(0, "CompilePath", str);
        setOption(0, "CompilePathWav", str2);
    }

    public final void setVideoCompileBitrate(int i2, int i3) {
        setOption(0, "CompileBitrateMode", (long) i2);
        setOption(0, "CompileBitrateValue", (long) i3);
    }

    public final void addMetaData(String str, String str2) {
        MethodCollector.i(9861);
        long j2 = this.mNative;
        if (j2 == 0) {
            MethodCollector.o(9861);
            return;
        }
        nativeAddMetaData(j2, str, str2);
        MethodCollector.o(9861);
    }

    public final int changeTransitionAt(int i2, VETransitionFilterParam vETransitionFilterParam) {
        MethodCollector.i(9267);
        long j2 = this.mNative;
        if (j2 == 0) {
            MethodCollector.o(9267);
            return -112;
        }
        int nativeChangeTransitonAt = nativeChangeTransitonAt(j2, i2, vETransitionFilterParam);
        MethodCollector.o(9267);
        return nativeChangeTransitonAt;
    }

    public final int deleteAudioTrack(int i2, boolean z) {
        MethodCollector.i(10468);
        long j2 = this.mNative;
        if (j2 == 0) {
            MethodCollector.o(10468);
            return -1;
        }
        int nativeDeleteAudioTrack = nativeDeleteAudioTrack(j2, i2, z);
        MethodCollector.o(10468);
        return nativeDeleteAudioTrack;
    }

    public final List<VEClipParam> getAllClips(int i2, int i3) {
        MethodCollector.i(7719);
        long j2 = this.mNative;
        if (j2 == 0) {
            MethodCollector.o(7719);
            return null;
        }
        List<VEClipParam> nativeGetAllClips = nativeGetAllClips(j2, i2, i3);
        MethodCollector.o(7719);
        return nativeGetAllClips;
    }

    public final int[] getDecodeInfo(int i2, int i3) {
        MethodCollector.i(7769);
        int[] iArr = {0};
        long j2 = this.mNative;
        if (j2 == 0) {
            MethodCollector.o(7769);
            return iArr;
        }
        int[] nativeGetDecodeDumpInfo = nativeGetDecodeDumpInfo(j2, i2, i3);
        MethodCollector.o(7769);
        return nativeGetDecodeDumpInfo;
    }

    public final int getSingleTrackProcessedImage(int i2, Bitmap bitmap) {
        MethodCollector.i(7754);
        long j2 = this.mNative;
        if (j2 == 0) {
            MethodCollector.o(7754);
            return -112;
        }
        int nativeGetSingleTrackProcessedImage = nativeGetSingleTrackProcessedImage(j2, i2, bitmap);
        MethodCollector.o(7754);
        return nativeGetSingleTrackProcessedImage;
    }

    public final int processDoubleClickEvent(float f2, float f3) {
        MethodCollector.i(12907);
        long j2 = this.mNative;
        if (j2 == 0) {
            MethodCollector.o(12907);
            return -112;
        }
        int nativeProcessDoubleClickEvent = nativeProcessDoubleClickEvent(j2, f2, f3);
        MethodCollector.o(12907);
        return nativeProcessDoubleClickEvent;
    }

    public final int processLongPressEvent(float f2, float f3) {
        MethodCollector.i(12906);
        long j2 = this.mNative;
        if (j2 == 0) {
            MethodCollector.o(12906);
            return -112;
        }
        int nativeProcessLongPressEvent = nativeProcessLongPressEvent(j2, f2, f3);
        MethodCollector.o(12906);
        return nativeProcessLongPressEvent;
    }

    public final int processRotationEvent(float f2, float f3) {
        MethodCollector.i(12797);
        long j2 = this.mNative;
        if (j2 == 0) {
            MethodCollector.o(12797);
            return -112;
        }
        int nativeProcessRotationEvent = nativeProcessRotationEvent(j2, f2, f3);
        MethodCollector.o(12797);
        return nativeProcessRotationEvent;
    }

    public final int processScaleEvent(float f2, float f3) {
        MethodCollector.i(12674);
        long j2 = this.mNative;
        if (j2 == 0) {
            MethodCollector.o(12674);
            return -112;
        }
        int nativeProcessScaleEvent = nativeProcessScaleEvent(j2, f2, f3);
        MethodCollector.o(12674);
        return nativeProcessScaleEvent;
    }

    public final int processTouchEvent(float f2, float f3) {
        MethodCollector.i(8046);
        long j2 = this.mNative;
        if (j2 == 0) {
            MethodCollector.o(8046);
            return -112;
        }
        int nativeProcessTouchEvent = nativeProcessTouchEvent(j2, f2, f3);
        MethodCollector.o(8046);
        return nativeProcessTouchEvent;
    }

    public final int processTouchMoveEvent(float f2, float f3) {
        MethodCollector.i(12284);
        long j2 = this.mNative;
        if (j2 == 0) {
            MethodCollector.o(12284);
            return -112;
        }
        int nativeProcessTouchMoveEvent = nativeProcessTouchMoveEvent(j2, f2, f3);
        MethodCollector.o(12284);
        return nativeProcessTouchMoveEvent;
    }

    public final int setAlgorithmPreConfig(int i2, int i3) {
        MethodCollector.i(8145);
        long j2 = this.mNative;
        if (j2 == 0) {
            MethodCollector.o(8145);
            return -112;
        }
        int nativeSetAlgorithmPreConfig = nativeSetAlgorithmPreConfig(j2, i2, i3);
        MethodCollector.o(8145);
        return nativeSetAlgorithmPreConfig;
    }

    public final void setAlgorithmReplay(int i2, String str) {
        if (this.mNative != 0) {
            setOption(0, "AlgorithmReplayMode", (long) i2);
            setOption(0, "AlgorithmReplayFilePath", str);
        }
    }

    public final int setAlgorithmSyncAndNum(boolean z, int i2) {
        MethodCollector.i(8048);
        long j2 = this.mNative;
        if (j2 == 0) {
            MethodCollector.o(8048);
            return -112;
        }
        int nativeSetAlgorithmSyncAndNum = nativeSetAlgorithmSyncAndNum(j2, z, i2);
        MethodCollector.o(8048);
        return nativeSetAlgorithmSyncAndNum;
    }

    public final int setAudioOffset(int i2, int i3) {
        MethodCollector.i(14010);
        long j2 = this.mNative;
        if (j2 == 0) {
            MethodCollector.o(14010);
            return -112;
        }
        int nativeSetAudioOffset = nativeSetAudioOffset(j2, i2, i3);
        MethodCollector.o(14010);
        return nativeSetAudioOffset;
    }

    public final int setComposerMode(int i2, int i3) {
        MethodCollector.i(8151);
        long j2 = this.mNative;
        if (j2 == 0) {
            MethodCollector.o(8151);
            return -112;
        }
        int nativeSetComposerMode = nativeSetComposerMode(j2, i2, i3);
        MethodCollector.o(8151);
        return nativeSetComposerMode;
    }

    public final int setDeviceRotation(float[] fArr, double d2) {
        MethodCollector.i(13003);
        long j2 = this.mNative;
        if (j2 == 0) {
            MethodCollector.o(13003);
            return -112;
        }
        int nativeSetDeviceRotation = nativeSetDeviceRotation(j2, fArr, d2);
        MethodCollector.o(13003);
        return nativeSetDeviceRotation;
    }

    public final int setEffectCacheInt(String str, int i2) {
        MethodCollector.i(7830);
        long j2 = this.mNative;
        if (j2 == 0) {
            MethodCollector.o(7830);
            return -112;
        }
        int nativeSetEffectCacheInt = nativeSetEffectCacheInt(j2, str, i2);
        MethodCollector.o(7830);
        return nativeSetEffectCacheInt;
    }

    public final void setMaxWidthHeight(int i2, int i3) {
        if (i2 > 0) {
            setOption(0, "engine max video width", (long) i2);
        }
        if (i3 > 0) {
            setOption(0, "engine max video height", (long) i3);
        }
    }

    public final void setSurfaceSize(int i2, int i3) {
        MethodCollector.i(14234);
        long j2 = this.mNative;
        if (j2 == 0) {
            MethodCollector.o(14234);
            return;
        }
        nativeSetSurfaceSize(j2, i2, i3);
        MethodCollector.o(14234);
    }

    public final void setWaterMark(VEWatermarkParam.VEWatermarkEntity[] vEWatermarkEntityArr, VEWatermarkParam.VEWatermarkMask vEWatermarkMask) {
        MethodCollector.i(14177);
        long j2 = this.mNative;
        if (j2 == 0) {
            MethodCollector.o(14177);
            return;
        }
        nativeSetWaterMark(j2, vEWatermarkEntityArr, vEWatermarkMask);
        MethodCollector.o(14177);
    }

    public final void setWatermarkWidthHeight(int i2, int i3) {
        if (i2 > 0) {
            setOption(0, "engine watermark video width", (long) i2);
        }
        if (i3 > 0) {
            setOption(0, "engine watermark video height", (long) i3);
        }
    }

    public final void setWidthHeight(int i2, int i3) {
        if (i2 > 0) {
            setOption(0, "engine video width", (long) i2);
        }
        if (i3 > 0) {
            setOption(0, "engine video height", (long) i3);
        }
    }

    public final int switchResourceLoadMode(boolean z, int i2) {
        MethodCollector.i(8049);
        long j2 = this.mNative;
        if (j2 == 0) {
            MethodCollector.o(8049);
            return -112;
        }
        int nativeSwitchResourceLoadMode = nativeSwitchResourceLoadMode(j2, z, i2);
        MethodCollector.o(8049);
        return nativeSwitchResourceLoadMode;
    }

    public final int updateAlgorithmRuntimeParam(int i2, float f2) {
        MethodCollector.i(7938);
        long j2 = this.mNative;
        if (j2 == 0) {
            MethodCollector.o(7938);
            return -112;
        }
        int nativeUpdateAlgorithmRuntimeParam = nativeUpdateAlgorithmRuntimeParam(j2, i2, f2);
        MethodCollector.o(7938);
        return nativeUpdateAlgorithmRuntimeParam;
    }

    public final int updateCanvasResolution(int i2, int i3) {
        MethodCollector.i(7581);
        long j2 = this.mNative;
        if (j2 == 0) {
            MethodCollector.o(7581);
            return -112;
        }
        int nativeUpdateCanvasResolution = nativeUpdateCanvasResolution(j2, i2, i3);
        MethodCollector.o(7581);
        return nativeUpdateCanvasResolution;
    }

    public final int addAudioTrackWithStruct(VECommonClipParam vECommonClipParam, boolean z) {
        MethodCollector.i(8879);
        if (this.mNative == 0) {
            MethodCollector.o(8879);
            return -1;
        } else if (TextUtils.isEmpty(vECommonClipParam.path)) {
            MethodCollector.o(8879);
            return -100;
        } else {
            int nativeAddAudioTrackWithStruct = nativeAddAudioTrackWithStruct(this.mNative, vECommonClipParam, z);
            MethodCollector.o(8879);
            return nativeAddAudioTrackWithStruct;
        }
    }

    public final ay getDecodeRect(int i2, int i3) {
        MethodCollector.i(7767);
        long j2 = this.mNative;
        if (j2 == 0) {
            ay ayVar = new ay(0, 0, 0, 0);
            MethodCollector.o(7767);
            return ayVar;
        }
        int[] nativeGetDecodeDumpInfo = nativeGetDecodeDumpInfo(j2, i2, i3);
        ay ayVar2 = new ay(nativeGetDecodeDumpInfo[0], nativeGetDecodeDumpInfo[1], nativeGetDecodeDumpInfo[2], nativeGetDecodeDumpInfo[3]);
        MethodCollector.o(7767);
        return ayVar2;
    }

    public final boolean processTouchEvent(bh bhVar, int i2) {
        MethodCollector.i(10378);
        long j2 = this.mNative;
        if (j2 == 0) {
            MethodCollector.o(10378);
            return false;
        }
        boolean nativeProcessTouchEvent2 = nativeProcessTouchEvent2(j2, bhVar.f151096a, bhVar.f151098c, bhVar.f151099d, bhVar.f151100e, bhVar.f151101f, bhVar.f151097b.ordinal(), i2);
        MethodCollector.o(10378);
        return nativeProcessTouchEvent2;
    }

    public final boolean setFrameTrace(String str, int i2) {
        MethodCollector.i(7017);
        long j2 = this.mNative;
        if (j2 == 0) {
            MethodCollector.o(7017);
            return false;
        } else if (nativeFrameTrace(j2, str, i2) == 0) {
            MethodCollector.o(7017);
            return true;
        } else {
            MethodCollector.o(7017);
            return false;
        }
    }

    public final boolean suspendGestureRecognizer(af afVar, boolean z) {
        int ordinal;
        MethodCollector.i(10539);
        if (this.mNative == 0) {
            MethodCollector.o(10539);
            return false;
        }
        if (afVar.ordinal() == af.ANY_SUPPORTED.ordinal()) {
            ordinal = -1;
        } else {
            ordinal = afVar.ordinal();
        }
        boolean nativeSuspendGestureRecognizer = nativeSuspendGestureRecognizer(this.mNative, ordinal, z);
        MethodCollector.o(10539);
        return nativeSuspendGestureRecognizer;
    }

    public static LoudnessDetectResult[] detectAudioLoudness(String[] strArr, int[] iArr, int[] iArr2) {
        MethodCollector.i(11912);
        LoudnessDetectResult[] nativeDetectAudioLoudness = nativeDetectAudioLoudness(strArr, iArr, iArr2);
        MethodCollector.o(11912);
        return nativeDetectAudioLoudness;
    }

    public static int setDropFrameParam(boolean z, long j2, long j3) {
        MethodCollector.i(11297);
        int nativeSetDropFrameParam = nativeSetDropFrameParam(z, j2, j3);
        MethodCollector.o(11297);
        return nativeSetDropFrameParam;
    }

    public static int setImageBufferLimit(int i2, int i3, int i4) {
        MethodCollector.i(11782);
        int nativeSetImageBufferLimit = nativeSetImageBufferLimit(i2, i3, i4);
        MethodCollector.o(11782);
        return nativeSetImageBufferLimit;
    }

    public final int addClipAuxiliaryParam(int i2, int i3, VEClipAuxiliaryParam[] vEClipAuxiliaryParamArr) {
        MethodCollector.i(7627);
        long j2 = this.mNative;
        if (j2 == 0) {
            MethodCollector.o(7627);
            return -112;
        }
        int nativeAddClipAuxiliaryParam = nativeAddClipAuxiliaryParam(j2, i2, i3, vEClipAuxiliaryParamArr);
        MethodCollector.o(7627);
        return nativeAddClipAuxiliaryParam;
    }

    public final int adjustFilterInOut(int i2, int i3, int i4) {
        MethodCollector.i(12507);
        int nativeAdjustFilterInOut = nativeAdjustFilterInOut(this.mNative, i2, i3, i4);
        MethodCollector.o(12507);
        return nativeAdjustFilterInOut;
    }

    public final int deleteClip(int i2, int i3, int i4) {
        MethodCollector.i(7056);
        long j2 = this.mNative;
        if (j2 == 0) {
            MethodCollector.o(7056);
            return -112;
        }
        int nativeDeleteClip = nativeDeleteClip(j2, i2, i3, i4);
        MethodCollector.o(7056);
        return nativeDeleteClip;
    }

    public final int deleteKeyFrameParam(int i2, int i3, int i4) {
        MethodCollector.i(7860);
        long j2 = this.mNative;
        if (j2 == 0) {
            MethodCollector.o(7860);
            return -112;
        }
        int nativeDeleteKeyFrameParam = nativeDeleteKeyFrameParam(j2, i2, i3, i4);
        MethodCollector.o(7860);
        return nativeDeleteKeyFrameParam;
    }

    public final int faceCoverClear(int i2, String str, boolean z) {
        MethodCollector.i(8135);
        long j2 = this.mNative;
        if (j2 == 0) {
            MethodCollector.o(8135);
            return -112;
        }
        int nativeFaceCoverClear = nativeFaceCoverClear(j2, i2, str, z);
        MethodCollector.o(8135);
        return nativeFaceCoverClear;
    }

    public final String getClipInfoString(int i2, int i3, int i4) {
        MethodCollector.i(10523);
        long j2 = this.mNative;
        if (j2 == 0) {
            MethodCollector.o(10523);
            return "";
        }
        String nativeGetClipInfoString = nativeGetClipInfoString(j2, i2, i3, i4);
        MethodCollector.o(10523);
        return nativeGetClipInfoString;
    }

    public final long getClipSequenceOut(int i2, int i3, int i4) {
        MethodCollector.i(9454);
        long j2 = this.mNative;
        if (j2 == 0) {
            MethodCollector.o(9454);
            return -112;
        }
        long nativeGetClipSequenceOut = nativeGetClipSequenceOut(j2, i2, i3, i4);
        MethodCollector.o(9454);
        return nativeGetClipSequenceOut;
    }

    public final int getDecodeImage(Bitmap bitmap, int i2, int i3) {
        MethodCollector.i(7744);
        long j2 = this.mNative;
        if (j2 == 0) {
            MethodCollector.o(7744);
            return -112;
        }
        int nativeGetDecodeImage = nativeGetDecodeImage(j2, bitmap, i2, i3);
        MethodCollector.o(7744);
        return nativeGetDecodeImage;
    }

    public final float getTrackVolume(int i2, int i3, int i4) {
        MethodCollector.i(11503);
        long j2 = this.mNative;
        if (j2 == 0) {
            MethodCollector.o(11503);
            return 0.0f;
        }
        float nativeGetTrackVolume = nativeGetTrackVolume(j2, i2, i3, i4);
        MethodCollector.o(11503);
        return nativeGetTrackVolume;
    }

    public final void setAudioCompileSetting(int i2, int i3, int i4) {
        if (this.mNative != 0) {
            setOption(0, "AudioSampleRate", (long) i2);
            setOption(0, "AudioChannels", (long) i3);
            setOption(0, "AudioBitrate", (long) i4);
        }
    }

    public final int setExtTrackSeqIn(int i2, int i3, int i4) {
        MethodCollector.i(11253);
        long j2 = this.mNative;
        if (j2 == 0) {
            MethodCollector.o(11253);
            return -112;
        }
        int nativeSetSubTrackSeqIn = nativeSetSubTrackSeqIn(j2, i2, i3, i4);
        MethodCollector.o(11253);
        return nativeSetSubTrackSeqIn;
    }

    public final int setFilterParam(int i2, String str, VEMusicSRTEffectParam vEMusicSRTEffectParam) {
        MethodCollector.i(12368);
        long j2 = this.mNative;
        if (j2 == 0) {
            MethodCollector.o(12368);
            return -112;
        }
        int nativeSetFilterParam = nativeSetFilterParam(j2, i2, str, vEMusicSRTEffectParam);
        MethodCollector.o(12368);
        return nativeSetFilterParam;
    }

    public final void setOption(int i2, String str, float f2) {
        MethodCollector.i(11174);
        long j2 = this.mNative;
        if (j2 == 0) {
            MethodCollector.o(11174);
            return;
        }
        nativeSetOption(j2, i2, str, f2);
        MethodCollector.o(11174);
    }

    public final void setResizer(int i2, float f2, float f3) {
        setOption(0, "filter mode", (long) i2);
        setOption(0, "resizer offset x percent", f2);
        setOption(0, "resizer offset y percent", f3);
    }

    public final int setTimeRange(int i2, int i3, int i4) {
        MethodCollector.i(12873);
        long j2 = this.mNative;
        if (j2 == 0) {
            MethodCollector.o(12873);
            return -112;
        }
        int nativeSetTimeRange = nativeSetTimeRange(j2, i2, i3, i4);
        MethodCollector.o(12873);
        return nativeSetTimeRange;
    }

    public final int setTrackDurationType(int i2, int i3, int i4) {
        MethodCollector.i(6909);
        long j2 = this.mNative;
        if (j2 == 0) {
            MethodCollector.o(6909);
            return -112;
        }
        int nativeSetTrackDurationType = nativeSetTrackDurationType(j2, i2, i3, i4);
        MethodCollector.o(6909);
        return nativeSetTrackDurationType;
    }

    public final int setTrackFilterEnable(int i2, boolean z, boolean z2) {
        MethodCollector.i(7697);
        long j2 = this.mNative;
        if (j2 == 0) {
            MethodCollector.o(7697);
            return -112;
        }
        int nativeSetTrackFilterEnable = nativeSetTrackFilterEnable(j2, i2, z, z2);
        MethodCollector.o(7697);
        return nativeSetTrackFilterEnable;
    }

    public final int setTrackLayer(int i2, int i3, int i4) {
        MethodCollector.i(11094);
        long j2 = this.mNative;
        if (j2 == 0) {
            MethodCollector.o(11094);
            return -112;
        }
        int nativeSetTrackLayer = nativeSetTrackLayer(j2, i2, i3, i4);
        MethodCollector.o(11094);
        return nativeSetTrackLayer;
    }

    public final boolean setTrackVolume(int i2, int i3, float f2) {
        MethodCollector.i(11501);
        long j2 = this.mNative;
        if (j2 == 0) {
            MethodCollector.o(11501);
            return false;
        }
        boolean nativeSetTrackVolume = nativeSetTrackVolume(j2, i2, i3, f2);
        MethodCollector.o(11501);
        return nativeSetTrackVolume;
    }

    public final int setTransitionAt(int i2, long j2, String str) {
        MethodCollector.i(9453);
        long j3 = this.mNative;
        if (j3 == 0) {
            MethodCollector.o(9453);
            return -112;
        }
        int nativeSetTransitionAt = nativeSetTransitionAt(j3, i2, j2, str);
        MethodCollector.o(9453);
        return nativeSetTransitionAt;
    }

    public final int updateAICutOutClipParam(int i2, int i3, VEAICutOutClipParam vEAICutOutClipParam) {
        MethodCollector.i(7761);
        long j2 = this.mNative;
        if (j2 == 0) {
            MethodCollector.o(7761);
            return -112;
        }
        int nativeUpdateAICutOutClipParam = nativeUpdateAICutOutClipParam(j2, i2, i3, vEAICutOutClipParam);
        MethodCollector.o(7761);
        return nativeUpdateAICutOutClipParam;
    }

    public final int updateComposerNode(String str, String str2, float f2) {
        MethodCollector.i(8266);
        long j2 = this.mNative;
        if (j2 == 0) {
            MethodCollector.o(8266);
            return -112;
        }
        int nativeUpdateComposerNode = nativeUpdateComposerNode(j2, str, str2, f2);
        MethodCollector.o(8266);
        return nativeUpdateComposerNode;
    }

    public final int updateTrackClips(int i2, int i3, String[] strArr) {
        MethodCollector.i(11504);
        long j2 = this.mNative;
        if (j2 == 0) {
            MethodCollector.o(11504);
            return -112;
        }
        int nativeUpdateTrackClip = nativeUpdateTrackClip(j2, i2, i3, strArr);
        MethodCollector.o(11504);
        return nativeUpdateTrackClip;
    }

    public final int updateTrackFilter(int i2, int i3, boolean z) {
        MethodCollector.i(11667);
        long j2 = this.mNative;
        if (j2 == 0) {
            MethodCollector.o(11667);
            return -112;
        }
        int nativeUpdateTrackFilter = nativeUpdateTrackFilter(j2, i2, i3, z);
        MethodCollector.o(11667);
        return nativeUpdateTrackFilter;
    }

    public final int[] checkComposerNodeExclusion(String str, String str2, String str3) {
        MethodCollector.i(9711);
        long j2 = this.mNative;
        if (j2 == 0) {
            int[] iArr = {-1, 0};
            MethodCollector.o(9711);
            return iArr;
        }
        int[] nativeCheckComposerNodeExclusion = nativeCheckComposerNodeExclusion(j2, str, str2, str3);
        MethodCollector.o(9711);
        return nativeCheckComposerNodeExclusion;
    }

    public final int processTouchDownEvent(float f2, float f3, ag agVar) {
        MethodCollector.i(12140);
        long j2 = this.mNative;
        if (j2 == 0) {
            MethodCollector.o(12140);
            return -112;
        }
        int nativeProcessTouchDownEvent = nativeProcessTouchDownEvent(j2, f2, f3, agVar.ordinal());
        MethodCollector.o(12140);
        return nativeProcessTouchDownEvent;
    }

    public final int processTouchUpEvent(float f2, float f3, ag agVar) {
        MethodCollector.i(12433);
        long j2 = this.mNative;
        if (j2 == 0) {
            MethodCollector.o(12433);
            return -112;
        }
        int nativeProcessTouchUpEvent = nativeProcessTouchUpEvent(j2, f2, f3, agVar.ordinal());
        MethodCollector.o(12433);
        return nativeProcessTouchUpEvent;
    }

    public final int setFilterParam(int i2, String str, VEStickerAnimator vEStickerAnimator) {
        MethodCollector.i(12367);
        long j2 = this.mNative;
        if (j2 == 0) {
            MethodCollector.o(12367);
            return -112;
        }
        int nativeSetFilterParam = nativeSetFilterParam(j2, i2, str, vEStickerAnimator);
        MethodCollector.o(12367);
        return nativeSetFilterParam;
    }

    public final void setOption(int i2, String str, long j2) {
        MethodCollector.i(11012);
        long j3 = this.mNative;
        if (j3 == 0) {
            MethodCollector.o(11012);
            return;
        }
        nativeSetOption(j3, i2, str, j2);
        MethodCollector.o(11012);
    }

    public final int updateScene(String[] strArr, int[] iArr, int[] iArr2) {
        MethodCollector.i(8323);
        long j2 = this.mNative;
        if (j2 == 0) {
            MethodCollector.o(8323);
            return -112;
        }
        int nativeUpdateScene = nativeUpdateScene(j2, strArr, iArr, iArr2);
        if (nativeUpdateScene < 0) {
            MethodCollector.o(8323);
            return nativeUpdateScene;
        }
        this.mHostTrackIndex = nativeUpdateScene;
        MethodCollector.o(8323);
        return 0;
    }

    public final int setFilterParam(int i2, String str, VEEffectFilterParam vEEffectFilterParam) {
        MethodCollector.i(12221);
        long j2 = this.mNative;
        if (j2 == 0) {
            MethodCollector.o(12221);
            return -112;
        }
        int nativeSetFilterParam = nativeSetFilterParam(j2, i2, str, vEEffectFilterParam);
        MethodCollector.o(12221);
        return nativeSetFilterParam;
    }

    public final void setOption(int i2, String str, String str2) {
        MethodCollector.i(10682);
        long j2 = this.mNative;
        if (j2 == 0) {
            MethodCollector.o(10682);
            return;
        }
        nativeSetOption(j2, i2, str, str2);
        MethodCollector.o(10682);
    }

    public final int setFilterParam(int i2, String str, String str2) {
        MethodCollector.i(12061);
        long j2 = this.mNative;
        if (j2 == 0) {
            MethodCollector.o(12061);
            return -112;
        }
        int nativeSetFilterParam = nativeSetFilterParam(j2, i2, str, str2);
        MethodCollector.o(12061);
        return nativeSetFilterParam;
    }

    public final void setOption(int i2, String str, int[] iArr) {
        MethodCollector.i(10838);
        long j2 = this.mNative;
        if (j2 == 0) {
            MethodCollector.o(10838);
            return;
        }
        nativeSetOptionIntArray(j2, i2, str, iArr);
        MethodCollector.o(10838);
    }

    public final int setFilterParam(int i2, String str, byte[] bArr) {
        MethodCollector.i(12062);
        long j2 = this.mNative;
        if (j2 == 0) {
            MethodCollector.o(12062);
            return -112;
        }
        int nativeSetFilterParam2 = nativeSetFilterParam2(j2, i2, str, bArr);
        MethodCollector.o(12062);
        return nativeSetFilterParam2;
    }

    public final void setOption(int i2, String str, long[] jArr) {
        MethodCollector.i(11335);
        long j2 = this.mNative;
        if (j2 == 0) {
            MethodCollector.o(11335);
            return;
        }
        nativeSetOptionLongArray(j2, i2, str, jArr);
        MethodCollector.o(11335);
    }

    /* JADX INFO: Can't fix incorrect switch cases order, some code will duplicate */
    public final int updateFilterParam(int i2, int i3, VEBaseFilterParam vEBaseFilterParam) {
        MethodCollector.i(7692);
        if (this.mNative == 0) {
            MethodCollector.o(7692);
            return -112;
        }
        int i4 = vEBaseFilterParam.filterType;
        if (i4 == 7) {
            int nativeUpdateColorFilterParam = nativeUpdateColorFilterParam(this.mNative, i2, i3, (VEColorFilterParam) vEBaseFilterParam);
            MethodCollector.o(7692);
            return nativeUpdateColorFilterParam;
        } else if (i4 == 8) {
            int nativeUpdateEffectFilterParam = nativeUpdateEffectFilterParam(this.mNative, i2, i3, (VEEffectFilterParam) vEBaseFilterParam);
            MethodCollector.o(7692);
            return nativeUpdateEffectFilterParam;
        } else if (i4 == 12) {
            int nativeUpdateBeautyFilterParam = nativeUpdateBeautyFilterParam(this.mNative, i2, i3, (VEBeautyFilterParam) vEBaseFilterParam);
            MethodCollector.o(7692);
            return nativeUpdateBeautyFilterParam;
        } else if (i4 == 13) {
            int nativeUpdateReshapeFilterParam = nativeUpdateReshapeFilterParam(this.mNative, i2, i3, (VEReshapeFilterParam) vEBaseFilterParam);
            MethodCollector.o(7692);
            return nativeUpdateReshapeFilterParam;
        } else if (i4 == 27) {
            int nativeUpdateVideoStabFilterParam = nativeUpdateVideoStabFilterParam(this.mNative, i2, i3, (VEVideoStableFilterParam) vEBaseFilterParam);
            MethodCollector.o(7692);
            return nativeUpdateVideoStabFilterParam;
        } else if (i4 == 33) {
            int nativeUpdateLensHdrFilterParam = nativeUpdateLensHdrFilterParam(this.mNative, i2, i3, (VELensHdrFilterParam) vEBaseFilterParam);
            MethodCollector.o(7692);
            return nativeUpdateLensHdrFilterParam;
        } else if (i4 == 35) {
            int nativeUpdateLensOneKeyHdrFilterParam = nativeUpdateLensOneKeyHdrFilterParam(this.mNative, i2, i3, (VEVideoLensOneKeyHdrParam) vEBaseFilterParam);
            MethodCollector.o(7692);
            return nativeUpdateLensOneKeyHdrFilterParam;
        } else if (i4 != 36) {
            switch (i4) {
                case 15:
                    if (vEBaseFilterParam instanceof VEVideoTransformFilterParam) {
                        int nativeUpdateVideoTransformFilterParam = nativeUpdateVideoTransformFilterParam(this.mNative, i2, i3, (VEVideoTransformFilterParam) vEBaseFilterParam);
                        MethodCollector.o(7692);
                        return nativeUpdateVideoTransformFilterParam;
                    } else if (vEBaseFilterParam instanceof VECanvasFilterParam) {
                        int nativeUpdateCanvasFilterParam = nativeUpdateCanvasFilterParam(this.mNative, i2, i3, (VECanvasFilterParam) vEBaseFilterParam);
                        MethodCollector.o(7692);
                        return nativeUpdateCanvasFilterParam;
                    }
                    break;
                case 16:
                    int nativeUpdateEffectHdrFilterParam = nativeUpdateEffectHdrFilterParam(this.mNative, i2, i3, (VEEffectHdrFilterParam) vEBaseFilterParam);
                    MethodCollector.o(7692);
                    return nativeUpdateEffectHdrFilterParam;
                case 17:
                    int nativeUpdateQualityFilterParam = nativeUpdateQualityFilterParam(this.mNative, i2, i3, (VEVideoAjustmentFilterParam) vEBaseFilterParam);
                    MethodCollector.o(7692);
                    return nativeUpdateQualityFilterParam;
                case LiveRechargeAgeThresholdSetting.DEFAULT:
                    break;
                case 19:
                    int nativeUpdateCropFilterParam = nativeUpdateCropFilterParam(this.mNative, i2, i3, (VEVideoCropFilterParam) vEBaseFilterParam);
                    MethodCollector.o(7692);
                    return nativeUpdateCropFilterParam;
                case v.U /*{ENCODED_INT: 20}*/:
                    int nativeUpdateImageTransformFilterParam = nativeUpdateImageTransformFilterParam(this.mNative, i2, i3, (VEImageTransformFilterParam) vEBaseFilterParam);
                    MethodCollector.o(7692);
                    return nativeUpdateImageTransformFilterParam;
                case 21:
                    int nativeUpdateImageAddFilterParam = nativeUpdateImageAddFilterParam(this.mNative, i2, i3, (VEImageAddFilterParam) vEBaseFilterParam);
                    MethodCollector.o(7692);
                    return nativeUpdateImageAddFilterParam;
                case 22:
                    int nativeUpdateAmazingFilterParam = nativeUpdateAmazingFilterParam(this.mNative, i2, i3, (VEAmazingFilterParam) vEBaseFilterParam);
                    MethodCollector.o(7692);
                    return nativeUpdateAmazingFilterParam;
                default:
                    MethodCollector.o(7692);
                    return -100;
            }
            VEComposerFilterParam vEComposerFilterParam = (VEComposerFilterParam) vEBaseFilterParam;
            if (!vEComposerFilterParam.isValid()) {
                MethodCollector.o(7692);
                return -100;
            } else if (vEComposerFilterParam.isOverallComposer()) {
                int nativeUpdateEffectComposerParam = nativeUpdateEffectComposerParam(this.mNative, i2, i3, vEComposerFilterParam);
                MethodCollector.o(7692);
                return nativeUpdateEffectComposerParam;
            } else {
                int nativeUpdateMultiEffectComposerParam = nativeUpdateMultiEffectComposerParam(this.mNative, i2, i3, (VEMultiComposerFilterParam) vEComposerFilterParam);
                MethodCollector.o(7692);
                return nativeUpdateMultiEffectComposerParam;
            }
        } else {
            int nativeUpdateColorAdjustHslFilterParam = nativeUpdateColorAdjustHslFilterParam(this.mNative, i2, i3, (VEColorHslFilterParam) vEBaseFilterParam);
            MethodCollector.o(7692);
            return nativeUpdateColorAdjustHslFilterParam;
        }
    }

    public final void setOption(int i2, String[] strArr, long[] jArr) {
        MethodCollector.i(11176);
        long j2 = this.mNative;
        if (j2 == 0) {
            MethodCollector.o(11176);
            return;
        }
        nativeSetOptionArray(j2, i2, strArr, jArr);
        MethodCollector.o(11176);
    }

    public static String audioExtend(String str, float f2, float f3, float f4) {
        MethodCollector.i(8205);
        String nativeAudioExtend = nativeAudioExtend(str, f2, f3, f4);
        MethodCollector.o(8205);
        return nativeAudioExtend;
    }

    public static int setMaxSoftWareVideoReaderCount(int i2, int i3, int i4, int i5) {
        MethodCollector.i(11296);
        int nativeSetMaxSoftwareVideoReaderCount = nativeSetMaxSoftwareVideoReaderCount(i2, i3, i4, i5);
        MethodCollector.o(11296);
        return nativeSetMaxSoftwareVideoReaderCount;
    }

    public final int concatShootVideo(String str, String[] strArr, long[] jArr, boolean z) {
        MethodCollector.i(7664);
        long j2 = this.mNative;
        if (j2 == 0) {
            MethodCollector.o(7664);
            return -112;
        }
        int nativeConcatShootVideo = nativeConcatShootVideo(j2, str, strArr, jArr, z);
        MethodCollector.o(7664);
        return nativeConcatShootVideo;
    }

    public final String getClipInfoStringWithPath(int i2, int i3, int i4, String str) {
        MethodCollector.i(10524);
        long j2 = this.mNative;
        if (j2 == 0) {
            MethodCollector.o(10524);
            return "";
        }
        String nativeGetClipInfoStringWithPath = nativeGetClipInfoStringWithPath(j2, i2, i3, i4, str);
        MethodCollector.o(10524);
        return nativeGetClipInfoStringWithPath;
    }

    public final int getImages(int[] iArr, int i2, int i3, int i4) {
        MethodCollector.i(13062);
        int nativeGetImages = nativeGetImages(this.mNative, iArr, i2, i3, i4);
        MethodCollector.o(13062);
        return nativeGetImages;
    }

    public final int moveClip(int i2, int i3, int i4, boolean z) {
        MethodCollector.i(7052);
        long j2 = this.mNative;
        if (j2 == 0) {
            MethodCollector.o(7052);
            return -112;
        }
        int nativeMoveClip = nativeMoveClip(j2, i2, i3, i4, z);
        MethodCollector.o(7052);
        return nativeMoveClip;
    }

    public final int replaceClip(int i2, int i3, VEClipSourceParam vEClipSourceParam, VEClipTimelineParam vEClipTimelineParam) {
        MethodCollector.i(7055);
        long j2 = this.mNative;
        if (j2 == 0) {
            MethodCollector.o(7055);
            return -112;
        }
        int nativeReplaceClip = nativeReplaceClip(j2, i2, i3, vEClipSourceParam, vEClipTimelineParam);
        MethodCollector.o(7055);
        return nativeReplaceClip;
    }

    public final int seek(int i2, int i3, int i4, int i5) {
        MethodCollector.i(13753);
        long j2 = this.mNative;
        if (j2 == 0) {
            MethodCollector.o(13753);
            return -112;
        }
        int nativeSeek = nativeSeek(j2, i2, i3, i4, i5);
        MethodCollector.o(13753);
        return nativeSeek;
    }

    public final int setCompileAudioDriver(String str, int i2, int i3, String str2) {
        MethodCollector.i(7486);
        long j2 = this.mNative;
        if (j2 == 0) {
            MethodCollector.o(7486);
            return -112;
        }
        int nativeSetCompileAudioDriver = nativeSetCompileAudioDriver(j2, str, i2, i3, str2);
        MethodCollector.o(7486);
        return nativeSetCompileAudioDriver;
    }

    public final void setCompileSoftwareEncodeOptions(int i2, long j2, int i3, int i4) {
        setOption(0, "CompileSoftwareCrf", (long) i2);
        setOption(0, "CompileSoftwareMaxrate", j2);
        setOption(0, "CompileSoftwarePreset", (long) i3);
        setOption(0, "CompileSoftwareQp", (long) i4);
    }

    public final int setKeyFrameParam(int i2, int i3, int i4, String str) {
        MethodCollector.i(7703);
        long j2 = this.mNative;
        if (j2 == 0) {
            MethodCollector.o(7703);
            return -112;
        }
        int nativeSetKeyFrameParam = nativeSetKeyFrameParam(j2, i2, i3, i4, str);
        MethodCollector.o(7703);
        return nativeSetKeyFrameParam;
    }

    public final int setTrackMinMaxDuration(int i2, int i3, int i4, int i5) {
        MethodCollector.i(6907);
        long j2 = this.mNative;
        if (j2 == 0) {
            MethodCollector.o(6907);
            return -112;
        }
        int nativeSetTrackMinMaxDuration = nativeSetTrackMinMaxDuration(j2, i2, i3, i4, i5);
        MethodCollector.o(6907);
        return nativeSetTrackMinMaxDuration;
    }

    public final void setViewPort(int i2, int i3, int i4, int i5) {
        MethodCollector.i(14212);
        long j2 = this.mNative;
        if (j2 == 0) {
            MethodCollector.o(14212);
            return;
        }
        nativeSetViewPort(j2, i2, i3, i4, i5);
        MethodCollector.o(14212);
    }

    public final int updateClipsSourceParam(int i2, int i3, int[] iArr, VEClipSourceParam[] vEClipSourceParamArr) {
        MethodCollector.i(7113);
        long j2 = this.mNative;
        if (j2 == 0) {
            MethodCollector.o(7113);
            return -112;
        }
        int nativeUpdateClipsSourceParam = nativeUpdateClipsSourceParam(j2, i2, i3, iArr, vEClipSourceParamArr);
        MethodCollector.o(7113);
        return nativeUpdateClipsSourceParam;
    }

    public final int updateClipsTimelineParam(int i2, int i3, int[] iArr, VEClipTimelineParam[] vEClipTimelineParamArr) {
        MethodCollector.i(7102);
        long j2 = this.mNative;
        if (j2 == 0) {
            MethodCollector.o(7102);
            return -112;
        }
        int nativeUpdateClipsTimelineParam = nativeUpdateClipsTimelineParam(j2, i2, i3, iArr, vEClipTimelineParamArr);
        MethodCollector.o(7102);
        return nativeUpdateClipsTimelineParam;
    }

    public final int updateFilterTime(int i2, int i3, int i4, int i5) {
        MethodCollector.i(7905);
        long j2 = this.mNative;
        if (j2 == 0) {
            MethodCollector.o(7905);
            return -112;
        }
        int nativeUpdateFilterTime = nativeUpdateFilterTime(j2, i2, i3, i4, i5);
        MethodCollector.o(7905);
        return nativeUpdateFilterTime;
    }

    public final int updateMultiComposerNodes(int i2, String[] strArr, String[] strArr2, float[] fArr) {
        MethodCollector.i(9556);
        long j2 = this.mNative;
        if (j2 == 0) {
            MethodCollector.o(9556);
            return -112;
        }
        int nativeUpdateMultiComposerNodes = nativeUpdateMultiComposerNodes(j2, i2, strArr, strArr2, fArr);
        MethodCollector.o(9556);
        return nativeUpdateMultiComposerNodes;
    }

    public final int addAudioTrackForClips(String[] strArr, int[] iArr, int[] iArr2, float[] fArr) {
        MethodCollector.i(8882);
        long j2 = this.mNative;
        if (j2 == 0) {
            MethodCollector.o(8882);
            return -1;
        } else if (strArr == null || strArr.length == 0) {
            MethodCollector.o(8882);
            return -100;
        } else {
            int nativeAddAudioTrackForClips = nativeAddAudioTrackForClips(j2, strArr, iArr, iArr2, fArr);
            MethodCollector.o(8882);
            return nativeAddAudioTrackForClips;
        }
    }

    public final int initVideoEditorWithStruct(VECommonClipParam[] vECommonClipParamArr, VECommonClipParam[] vECommonClipParamArr2, String[] strArr, int i2) {
        MethodCollector.i(7715);
        long j2 = this.mNative;
        if (j2 == 0) {
            MethodCollector.o(7715);
            return -112;
        }
        int nativeInitVideoEditorWithStruct = nativeInitVideoEditorWithStruct(j2, vECommonClipParamArr, vECommonClipParamArr2, strArr, i2);
        if (nativeInitVideoEditorWithStruct < 0) {
            MethodCollector.o(7715);
            return nativeInitVideoEditorWithStruct;
        }
        this.mHostTrackIndex = nativeInitVideoEditorWithStruct;
        MethodCollector.o(7715);
        return 0;
    }

    public final void setCrop(int i2, int i3, int i4, int i5) {
        setOption(1, new String[]{"engine crop x", "engine crop y", "engine crop width", "engine crop height"}, new long[]{(long) i2, (long) i3, (long) i4, (long) i5});
    }

    public final void updateResolution(int i2, int i3, int i4, int i5) {
        setOption(1, new String[]{"engine preivew width", "engine preivew height", "engine preivew width percent", "engine preivew height percent"}, new long[]{(long) i2, (long) i3, (long) i4, (long) i5});
    }

    public final int updateTrackFilterDuration(int i2, int i3, boolean z, long j2) {
        MethodCollector.i(11668);
        long j3 = this.mNative;
        if (j3 == 0) {
            MethodCollector.o(11668);
            return -112;
        }
        int nativeUpdateTrackFilterDuration = nativeUpdateTrackFilterDuration(j3, i2, i3, z, j2);
        MethodCollector.o(11668);
        return nativeUpdateTrackFilterDuration;
    }

    public final int setClipAttr(int i2, int i3, int i4, String str, String str2) {
        MethodCollector.i(11835);
        int nativeSetClipAttr = nativeSetClipAttr(this.mNative, i2, i3, i4, str, str2);
        MethodCollector.o(11835);
        return nativeSetClipAttr;
    }

    public final int faceCoverLoad(int i2, String[] strArr, int i3, String str, boolean z) {
        MethodCollector.i(8031);
        long j2 = this.mNative;
        if (j2 == 0) {
            MethodCollector.o(8031);
            return -112;
        }
        int nativeFaceCoverLoad = nativeFaceCoverLoad(j2, i2, strArr, i3, str, z);
        MethodCollector.o(8031);
        return nativeFaceCoverLoad;
    }

    public final int faceCoverSet(int i2, double d2, double d3, String str, boolean z) {
        MethodCollector.i(8192);
        long j2 = this.mNative;
        if (j2 == 0) {
            MethodCollector.o(8192);
            return -112;
        }
        int nativeFaceCoverSet = nativeFaceCoverSet(j2, i2, d2, d3, str, z);
        MethodCollector.o(8192);
        return nativeFaceCoverSet;
    }

    public final int initAudioEditor(String str, String[] strArr, int[] iArr, int[] iArr2, float[] fArr) {
        MethodCollector.i(7541);
        long j2 = this.mNative;
        if (j2 == 0) {
            MethodCollector.o(7541);
            return -112;
        }
        int nativeInitAudioEditor = nativeInitAudioEditor(j2, str, strArr, iArr, iArr2, fArr);
        if (nativeInitAudioEditor < 0) {
            MethodCollector.o(7541);
            return nativeInitAudioEditor;
        }
        this.mHostTrackIndex = nativeInitAudioEditor;
        MethodCollector.o(7541);
        return 0;
    }

    public final int insertClip(int i2, int i3, int i4, VEClipSourceParam vEClipSourceParam, VEClipTimelineParam vEClipTimelineParam) {
        MethodCollector.i(13094);
        long j2 = this.mNative;
        if (j2 == 0) {
            MethodCollector.o(13094);
            return -112;
        }
        int nativeInsertClip = nativeInsertClip(j2, i2, i3, i4, vEClipSourceParam, vEClipTimelineParam);
        MethodCollector.o(13094);
        return nativeInsertClip;
    }

    public final int preprocessAudioTrackForFilter(int i2, int i3, String str, byte[] bArr, long[] jArr) {
        MethodCollector.i(11994);
        long j2 = this.mNative;
        if (j2 == 0) {
            MethodCollector.o(11994);
            return -112;
        }
        int nativePreprocessAudioTrackForFilter = nativePreprocessAudioTrackForFilter(j2, i2, i3, str, bArr, jArr);
        MethodCollector.o(11994);
        return nativePreprocessAudioTrackForFilter;
    }

    public final int processPanEvent(float f2, float f3, float f4, float f5, float f6) {
        MethodCollector.i(12564);
        long j2 = this.mNative;
        if (j2 == 0) {
            MethodCollector.o(12564);
            return -112;
        }
        int nativeProcessPanEvent = nativeProcessPanEvent(j2, f2, f3, f4, f5, f6);
        MethodCollector.o(12564);
        return nativeProcessPanEvent;
    }

    public final int replaceComposerNodesWithTag(String[] strArr, int i2, String[] strArr2, int i3, String[] strArr3) {
        MethodCollector.i(9883);
        long j2 = this.mNative;
        if (j2 == 0) {
            MethodCollector.o(9883);
            return -112;
        }
        int nativeReplaceComposerNodesWithTag = nativeReplaceComposerNodesWithTag(j2, strArr, i2, strArr2, i3, strArr3);
        MethodCollector.o(9883);
        return nativeReplaceComposerNodesWithTag;
    }

    public final int seekWithTolerance(int i2, int i3, int i4, int i5, int i6) {
        MethodCollector.i(13859);
        long j2 = this.mNative;
        if (j2 == 0) {
            MethodCollector.o(13859);
            return -112;
        }
        int nativeSeekWithTolerance = nativeSeekWithTolerance(j2, i2, i3, i4, i5, i6);
        MethodCollector.o(13859);
        return nativeSeekWithTolerance;
    }

    public final int updateScene(String[] strArr, int[] iArr, int[] iArr2, boolean[] zArr, String[] strArr2) {
        MethodCollector.i(8401);
        long j2 = this.mNative;
        if (j2 == 0) {
            MethodCollector.o(8401);
            return -112;
        }
        int nativeUpdateSceneLoadCache = nativeUpdateSceneLoadCache(j2, strArr, iArr, iArr2, zArr, strArr2);
        if (nativeUpdateSceneLoadCache < 0) {
            MethodCollector.o(8401);
            return nativeUpdateSceneLoadCache;
        }
        this.mHostTrackIndex = nativeUpdateSceneLoadCache;
        MethodCollector.o(8401);
        return 0;
    }

    public final int[] addFilters(int[] iArr, String[] strArr, int[] iArr2, int[] iArr3, int[] iArr4, int[] iArr5) {
        return addFilters(iArr, strArr, iArr2, iArr3, iArr4, iArr5, null);
    }

    public final int addAudioTrack(String str, int i2, int i3, int i4, int i5, boolean z) {
        MethodCollector.i(8553);
        if (this.mNative == 0) {
            MethodCollector.o(8553);
            return -1;
        } else if (TextUtils.isEmpty(str)) {
            MethodCollector.o(8553);
            return -100;
        } else {
            int nativeAddAudioTrack = nativeAddAudioTrack(this.mNative, str, i2, i3, i4, i5, z);
            MethodCollector.o(8553);
            return nativeAddAudioTrack;
        }
    }

    public final int faceCoverScale(int i2, double d2, double d3, double d4, String str, boolean z) {
        MethodCollector.i(8196);
        long j2 = this.mNative;
        if (j2 == 0) {
            MethodCollector.o(8196);
            return -112;
        }
        int nativeFaceCoverScale = nativeFaceCoverScale(j2, i2, d2, d3, d4, str, z);
        MethodCollector.o(8196);
        return nativeFaceCoverScale;
    }

    public final int initVideoEditor(String str, String[] strArr, String[] strArr2, String[] strArr3, String[][] strArr4, int i2) {
        MethodCollector.i(7445);
        long j2 = this.mNative;
        if (j2 == 0) {
            MethodCollector.o(7445);
            return -112;
        }
        int nativeInitVideoEditor = nativeInitVideoEditor(j2, str, strArr, strArr2, strArr3, strArr4, i2);
        if (nativeInitVideoEditor < 0) {
            MethodCollector.o(7445);
            return nativeInitVideoEditor;
        }
        this.mHostTrackIndex = nativeInitVideoEditor;
        MethodCollector.o(7445);
        return 0;
    }

    public final int addExternalVideoTrack(String[] strArr, String[] strArr2, int[] iArr, int[] iArr2, int[] iArr3, int[] iArr4, int i2) {
        MethodCollector.i(11093);
        long j2 = this.mNative;
        if (j2 == 0) {
            MethodCollector.o(11093);
            return -112;
        }
        int nativeAddSubVideoTrack = nativeAddSubVideoTrack(j2, strArr, strArr2, iArr, iArr2, iArr3, iArr4, i2);
        MethodCollector.o(11093);
        return nativeAddSubVideoTrack;
    }

    public final int[] addFilters(int[] iArr, String[] strArr, int[] iArr2, int[] iArr3, int[] iArr4, int[] iArr5, int[] iArr6) {
        MethodCollector.i(11255);
        long j2 = this.mNative;
        if (j2 == 0) {
            int[] iArr7 = {-1};
            MethodCollector.o(11255);
            return iArr7;
        }
        int[] nativeAddFilters = nativeAddFilters(j2, iArr, strArr, iArr2, iArr3, iArr4, iArr5, iArr6);
        MethodCollector.o(11255);
        return nativeAddFilters;
    }

    public final int beginAudioExtendToFile(String str, String str2, String str3, float f2, float f3, float f4, final VEListener.ae aeVar) {
        MethodCollector.i(8252);
        if (this.mNative == 0) {
            MethodCollector.o(8252);
            return -112;
        }
        setAudioExtendToFileCallback(new NativeCallbacks.a() {
            /* class com.ss.android.ttve.nativePort.TEInterface.AnonymousClass1 */

            static {
                Covode.recordClassIndex(37724);
            }
        });
        int nativeBeginAudioExtendToFile = nativeBeginAudioExtendToFile(this.mNative, str, str2, str3, f2, f3, f4);
        MethodCollector.o(8252);
        return nativeBeginAudioExtendToFile;
    }

    public final void setDisplayState(float f2, float f3, float f4, float f5, int i2, int i3, int i4) {
        MethodCollector.i(7192);
        long j2 = this.mNative;
        if (j2 == 0) {
            MethodCollector.o(7192);
            return;
        }
        nativeSetDisplayState(j2, f2, f3, f4, f5, i2, i3, i4);
        MethodCollector.o(7192);
    }

    public final int updateAudioTrack(int i2, int i3, int i4, int i5, int i6, boolean z, boolean z2) {
        MethodCollector.i(10463);
        long j2 = this.mNative;
        if (j2 == 0) {
            MethodCollector.o(10463);
            return -1;
        } else if (i2 < 0) {
            MethodCollector.o(10463);
            return -100;
        } else {
            int nativeUpdateAudioTrack = nativeUpdateAudioTrack(j2, i2, i3, i4, i5, i6, z, z2);
            MethodCollector.o(10463);
            return nativeUpdateAudioTrack;
        }
    }

    public final int addWaterMark(String[] strArr, String[] strArr2, int[] iArr, int[] iArr2, double d2, double d3, double d4, double d5) {
        MethodCollector.i(11092);
        long j2 = this.mNative;
        if (j2 == 0) {
            MethodCollector.o(11092);
            return -112;
        }
        int i2 = this.mHostTrackIndex;
        if (i2 < 0) {
            MethodCollector.o(11092);
            return -105;
        }
        int nativeAddSubTrack = nativeAddSubTrack(j2, strArr, strArr2, iArr, iArr2, iArr, iArr2, d2, d3, d4, d5, 5, i2);
        MethodCollector.o(11092);
        return nativeAddSubTrack;
    }

    public final int updateAudioTrack(int i2, int i3, int i4, int i5, int i6, boolean z, int i7, int i8) {
        MethodCollector.i(10464);
        long j2 = this.mNative;
        if (j2 == 0) {
            MethodCollector.o(10464);
            return -1;
        } else if (i2 < 0) {
            MethodCollector.o(10464);
            return -100;
        } else {
            int nativeUpdateAudioTrack2 = nativeUpdateAudioTrack2(j2, i2, i3, i4, i5, i6, z, i7, i8);
            MethodCollector.o(10464);
            return nativeUpdateAudioTrack2;
        }
    }

    public final int addAudioTrack(String str, int i2, int i3, int i4, int i5, boolean z, int i6, int i7) {
        MethodCollector.i(10312);
        if (this.mNative == 0) {
            MethodCollector.o(10312);
            return -1;
        } else if (TextUtils.isEmpty(str)) {
            MethodCollector.o(10312);
            return -100;
        } else {
            int nativeAddAudioTrack2 = nativeAddAudioTrack2(this.mNative, str, i2, i3, i4, i5, z, i6, i7);
            MethodCollector.o(10312);
            return nativeAddAudioTrack2;
        }
    }

    public final int initVideoEditor(String str, String[] strArr, String[] strArr2, String[] strArr3, String[][] strArr4, int i2, boolean[] zArr, String[] strArr5) {
        MethodCollector.i(7534);
        long j2 = this.mNative;
        if (j2 == 0) {
            MethodCollector.o(7534);
            return -112;
        }
        int nativeInitVideoEditorLoadCache = nativeInitVideoEditorLoadCache(j2, str, strArr, strArr2, strArr3, strArr4, i2, zArr, strArr5);
        if (nativeInitVideoEditorLoadCache < 0) {
            MethodCollector.o(7534);
            return nativeInitVideoEditorLoadCache;
        }
        this.mHostTrackIndex = nativeInitVideoEditorLoadCache;
        MethodCollector.o(7534);
        return 0;
    }

    public final int addAudioTrack(String str, String str2, int i2, int i3, int i4, int i5, boolean z, boolean z2) {
        MethodCollector.i(8555);
        if (this.mNative == 0) {
            MethodCollector.o(8555);
            return -1;
        } else if (TextUtils.isEmpty(str)) {
            MethodCollector.o(8555);
            return -100;
        } else {
            int nativeAddAudioTrackWithNeedPrepare = nativeAddAudioTrackWithNeedPrepare(this.mNative, str, str2, i2, i3, i4, i5, z, z2);
            MethodCollector.o(8555);
            return nativeAddAudioTrackWithNeedPrepare;
        }
    }

    public final int initVideoEditor2(String[] strArr, int[] iArr, int[] iArr2, String[] strArr2, int[] iArr3, int[] iArr4, String[] strArr3, String[][] strArr4, float[] fArr, int i2) {
        return initVideoEditor2(strArr, iArr, iArr2, strArr2, iArr3, iArr4, strArr3, strArr4, fArr, fArr, null, i2, false);
    }

    public final int initImageEditor(Bitmap[] bitmapArr, int[] iArr, int[] iArr2, String[] strArr, int[] iArr3, int[] iArr4, String[] strArr2, String[][] strArr3, float[] fArr, int[] iArr5, int i2) {
        float[] fArr2 = fArr;
        MethodCollector.i(8013);
        if (this.mNative == 0) {
            MethodCollector.o(8013);
            return -112;
        }
        if (fArr2 == null) {
            fArr2 = new float[bitmapArr.length];
            Arrays.fill(fArr2, 1.0f);
        }
        int nativeInitImageEditor = nativeInitImageEditor(this.mNative, bitmapArr, iArr, iArr2, strArr, iArr3, iArr4, strArr2, strArr3, fArr2, iArr5, i2);
        if (nativeInitImageEditor < 0) {
            MethodCollector.o(8013);
            return nativeInitImageEditor;
        }
        this.mHostTrackIndex = nativeInitImageEditor;
        MethodCollector.o(8013);
        return 0;
    }

    public final int initVideoEditor2(String[] strArr, int[] iArr, int[] iArr2, String[] strArr2, int[] iArr3, int[] iArr4, String[] strArr3, String[][] strArr4, float[] fArr, int i2, boolean[] zArr, String[] strArr5) {
        return initVideoEditor2(strArr, iArr, iArr2, strArr2, iArr3, iArr4, strArr3, strArr4, fArr, fArr, null, i2, false, zArr, strArr5);
    }

    public final int changeResWithEffect(boolean[] zArr, String[] strArr, String[] strArr2, int[] iArr, int[] iArr2, float[] fArr, String[] strArr3, String[] strArr4, int[] iArr3, int[] iArr4, float[] fArr2, int[] iArr5) {
        float[] fArr3 = fArr;
        float[] fArr4 = fArr2;
        MethodCollector.i(8027);
        if (this.mNative == 0) {
            MethodCollector.o(8027);
            return -112;
        }
        if (fArr3 == null) {
            fArr3 = new float[strArr.length];
            Arrays.fill(fArr3, 1.0f);
        }
        if (fArr4 == null && strArr3 != null) {
            fArr4 = new float[strArr3.length];
            Arrays.fill(fArr4, 1.0f);
        }
        int nativeChangeResWithEffect = nativeChangeResWithEffect(this.mNative, zArr, strArr, strArr2, iArr, iArr2, fArr3, strArr3, strArr4, iArr3, iArr4, fArr4, iArr5);
        MethodCollector.o(8027);
        return nativeChangeResWithEffect;
    }

    public final int initVideoEditor2(String[] strArr, int[] iArr, int[] iArr2, String[] strArr2, int[] iArr3, int[] iArr4, String[] strArr3, String[][] strArr4, float[] fArr, float[] fArr2, int[] iArr5, int i2, boolean z) {
        float[] fArr3 = fArr2;
        float[] fArr4 = fArr;
        MethodCollector.i(7783);
        if (this.mNative == 0) {
            MethodCollector.o(7783);
            return -112;
        }
        if (fArr4 == null) {
            fArr4 = new float[strArr.length];
            Arrays.fill(fArr4, 1.0f);
        }
        if (fArr3 == null && strArr2 != null) {
            fArr3 = new float[strArr2.length];
            Arrays.fill(fArr3, 1.0f);
        }
        int nativeInitVideoEditor2 = nativeInitVideoEditor2(this.mNative, strArr, iArr, iArr2, strArr2, iArr3, iArr4, strArr3, strArr4, fArr4, fArr3, iArr5, i2, z);
        if (nativeInitVideoEditor2 < 0) {
            MethodCollector.o(7783);
            return nativeInitVideoEditor2;
        }
        this.mHostTrackIndex = nativeInitVideoEditor2;
        MethodCollector.o(7783);
        return 0;
    }

    public final int initVideoEditor2(String[] strArr, int[] iArr, int[] iArr2, String[] strArr2, int[] iArr3, int[] iArr4, String[] strArr3, String[][] strArr4, float[] fArr, float[] fArr2, int[] iArr5, int i2, boolean z, boolean[] zArr, String[] strArr5) {
        float[] fArr3 = fArr2;
        float[] fArr4 = fArr;
        MethodCollector.i(7950);
        if (this.mNative == 0) {
            MethodCollector.o(7950);
            return -112;
        }
        if (fArr4 == null) {
            fArr4 = new float[strArr.length];
            Arrays.fill(fArr4, 1.0f);
        }
        if (fArr3 == null && strArr2 != null) {
            fArr3 = new float[strArr2.length];
            Arrays.fill(fArr3, 1.0f);
        }
        int nativeInitVideoEditor2LoadCache = nativeInitVideoEditor2LoadCache(this.mNative, strArr, iArr, iArr2, strArr2, iArr3, iArr4, strArr3, strArr4, fArr4, fArr3, iArr5, i2, z, zArr, strArr5);
        if (nativeInitVideoEditor2LoadCache < 0) {
            MethodCollector.o(7950);
            return nativeInitVideoEditor2LoadCache;
        }
        this.mHostTrackIndex = nativeInitVideoEditor2LoadCache;
        MethodCollector.o(7950);
        return 0;
    }

    public final int initVideoEditorWithCanvas(String[] strArr, Bitmap[] bitmapArr, int i2, String[] strArr2, int[] iArr, int[] iArr2, String[] strArr3, String[] strArr4, int[] iArr3, int[] iArr4, String[] strArr5, int[] iArr5, int[] iArr6, String[][] strArr6, float[] fArr, int i3, VESize[] vESizeArr) {
        float[] fArr2 = fArr;
        MethodCollector.i(8021);
        if (this.mNative == 0) {
            MethodCollector.o(8021);
            return -112;
        } else if (i2 <= 0) {
            MethodCollector.o(8021);
            return -100;
        } else {
            if (fArr2 == null) {
                fArr2 = new float[i2];
                Arrays.fill(fArr2, 1.0f);
            }
            int nativeInitVideoEditorWithCanvas = nativeInitVideoEditorWithCanvas(this.mNative, strArr, bitmapArr, strArr2, iArr, iArr2, strArr3, strArr4, iArr3, iArr4, strArr5, iArr5, iArr6, strArr6, fArr2, i3, vESizeArr);
            if (nativeInitVideoEditorWithCanvas < 0) {
                MethodCollector.o(8021);
                return nativeInitVideoEditorWithCanvas;
            }
            this.mHostTrackIndex = nativeInitVideoEditorWithCanvas;
            MethodCollector.o(8021);
            return 0;
        }
    }
}
