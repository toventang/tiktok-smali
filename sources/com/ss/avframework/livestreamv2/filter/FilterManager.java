package com.ss.avframework.livestreamv2.filter;

import android.content.Context;
import android.content.res.AssetManager;
import android.graphics.Bitmap;
import android.graphics.Matrix;
import android.opengl.GLES20;
import android.os.Bundle;
import android.os.Handler;
import android.os.SystemClock;
import android.text.TextUtils;
import android.util.AndroidRuntimeException;
import android.view.OrientationEventListener;
import com.bytedance.covode.number.Covode;
import com.bytedance.frameworks.apm.trace.MethodCollector;
import com.bytedance.librarian.Librarian;
import com.ss.android.ugc.aweme.lancet.m;
import com.ss.avframework.buffer.GlTextureFrameBuffer;
import com.ss.avframework.buffer.RoiInfo;
import com.ss.avframework.buffer.TextureBufferImpl;
import com.ss.avframework.buffer.VideoFrame;
import com.ss.avframework.effect.EffectWrapper;
import com.ss.avframework.effect.IVideoEffectProcessor;
import com.ss.avframework.engine.AudioDeviceModule;
import com.ss.avframework.engine.MediaEngineFactory;
import com.ss.avframework.engine.VideoProcessor;
import com.ss.avframework.livestreamv2.IInputAudioStream;
import com.ss.avframework.livestreamv2.ILiveStream;
import com.ss.avframework.livestreamv2.filter.FilterVideoBufferPool;
import com.ss.avframework.livestreamv2.filter.IFilterManager;
import com.ss.avframework.livestreamv2.filter.VideoCatcher;
import com.ss.avframework.livestreamv2.utils.ImageLoadUtils;
import com.ss.avframework.livestreamv2.utils.VideoDumpProxy;
import com.ss.avframework.mixer.AudioMixer;
import com.ss.avframework.opengl.GLThread;
import com.ss.avframework.opengl.GlRenderDrawer;
import com.ss.avframework.opengl.GlUtil;
import com.ss.avframework.opengl.YuvConverter;
import com.ss.avframework.utils.AVLog;
import com.ss.avframework.utils.SafeHandlerThreadPoolExecutor;
import com.ss.avframework.utils.ThreadUtils;
import java.lang.ref.WeakReference;
import java.nio.Buffer;
import java.nio.ByteBuffer;
import java.util.Map;
import org.json.JSONObject;

public class FilterManager extends VideoProcessor implements TextureBufferImpl.ToI420Interface, ILiveStream.IAudioFrameAvailableListener, IFilterManager, VideoCatcher.VideoCatcherCallback {
    private long effectAlgorithmRequirment;
    private long effectAlgorithmRequirmentParams;
    private boolean mAudioRecognizing;
    public IInputAudioStream mAudioStreamObserver;
    public FilterVideoBufferPool mBufferPool;
    private int mBufferPoolMaxSize = 4;
    public ILiveStream.CatchMediaDataCallback mCatchVideoCallback;
    public int mCatchVideoFrameCount;
    public int mCatchVideoFrameInterval;
    public final Context mContext;
    private IFilterManager.ContourDataCallBack mContourDataCallBack;
    private int mContourDataSendInterval = 1;
    private IFilterManager.ContourInfoListener mContourInfoListener;
    public IVideoEffectProcessor mEffect;
    private long mEffectAudioTimestampMs;
    public float mEffectAudioVolume = 1.0f;
    public EffectEdgeLog mEffectEdgeLog;
    public VideoCatcher mEffectFrameCatcher;
    private boolean mEnableFindContour;
    private boolean mEnabled;
    public IFilterManager.ErrorListener mErrorListener;
    private long mExtrDataFlags;
    private int mExtraDataGop;
    private IFilterManager.FindContourListener mFindContourListener;
    private boolean mForceOutput2DTex;
    public boolean mForceSticker;
    private GLThread mGLThread;
    private int mGetContourDataTime;
    public Handler mHandler;
    public boolean mIsEdgeRender;
    public boolean mKeepVideoCatcherAlive;
    private long mLastCatchTimestamp;
    public IVideoEffectProcessor.EffectMsgListener mMsgListener;
    private int mNoExtraSendFrameCounts;
    public GlRenderDrawer mOffscreenDraw;
    public int mOrientation;
    private AlbumOrientationEventListener mOrientationListener;
    public VideoCatcher mOriginFrameCatcher;
    public FilterVideoBufferPool.Recycle mOut2DTexRecycle;
    public ILiveStream.CatchPicCallback mPicCallback;
    private VideoDumpProxy.RawVideoDumperProxy[] mRawVideoDumpers = new VideoDumpProxy.RawVideoDumperProxy[2];
    private boolean mReleased;
    protected boolean mRoiEnabled;
    private int mSendContourInfoType = 1;
    private boolean mShouldCatch;
    private boolean mShowRoiRegion;
    private boolean mStretchRoi;
    public FilterVideoBufferPool.Recycle mTextureFrameBufferRecycle;
    private boolean mVpassEnableFindContour = true;
    private Handler mYuvConvertHandler;
    private GLThread mYuvConvertThread;
    private YuvConverter mYuvConverter;
    private int mYuvHeight;
    public int[] mYuvTexs;
    private int mYuvWidth;

    public interface IEffectLogUploader {
        static {
            Covode.recordClassIndex(100378);
        }

        void upload(String str, JSONObject jSONObject);
    }

    private void dumpOriginFrame(VideoFrame.Buffer buffer) {
    }

    private String getCallInfo(Object... objArr) {
        return "";
    }

    private void onTextureFrame(VideoDumpProxy.RawVideoDumperProxy rawVideoDumperProxy, int i2, boolean z, int i3, int i4, int i5, float[] fArr, String str) {
    }

    private void showRoiRegion(RoiInfo roiInfo, int i2, int i3) {
    }

    public void releaseRawVideoDumpers() {
    }

    public void setDumpFrameParams(JSONObject jSONObject) {
    }

    @Override // com.ss.avframework.livestreamv2.filter.IFilterManager
    public int startEffectAudio() {
        return -1;
    }

    @Override // com.ss.avframework.livestreamv2.filter.IFilterManager
    public int stopEffectAudio() {
        return -1;
    }

    public IFilterManager.ContourDataCallBack getContourDataCallBack() {
        return this.mContourDataCallBack;
    }

    @Override // com.ss.avframework.livestreamv2.filter.IFilterManager
    public float getEffectAudioVolume() {
        return this.mEffectAudioVolume;
    }

    @Override // com.ss.avframework.livestreamv2.filter.IFilterManager
    public IVideoEffectProcessor getVideoEffectProcessor() {
        return this.mEffect;
    }

    @Override // com.ss.avframework.livestreamv2.filter.IFilterManager
    public boolean isEnable() {
        return this.mEnabled;
    }

    public boolean isEnableFindContour() {
        return this.mEnableFindContour;
    }

    public static IFilterManager createDummy() {
        return new IFilterManager() {
            /* class com.ss.avframework.livestreamv2.filter.FilterManager.AnonymousClass1 */

            static {
                Covode.recordClassIndex(100314);
            }

            @Override // com.ss.avframework.livestreamv2.filter.IFilterManager
            public final int composerAppendNodes(String[] strArr, int i2) {
                return 0;
            }

            @Override // com.ss.avframework.livestreamv2.filter.IFilterManager
            public final int composerAppendNodesWithTags(String[] strArr, int i2, String[] strArr2) {
                return 0;
            }

            @Override // com.ss.avframework.livestreamv2.filter.IFilterManager
            public final int composerCheckNodeExclusion(String str, String str2, int[] iArr) {
                return 0;
            }

            @Override // com.ss.avframework.livestreamv2.filter.IFilterManager
            public final int composerExclusionCompare(String str, String str2, String str3, int[] iArr) {
                return 0;
            }

            @Override // com.ss.avframework.livestreamv2.filter.IFilterManager
            public final int composerReloadNodes(String[] strArr, int i2) {
                return 0;
            }

            @Override // com.ss.avframework.livestreamv2.filter.IFilterManager
            public final int composerReloadNodesWithTags(String[] strArr, int i2, String[] strArr2) {
                return 0;
            }

            @Override // com.ss.avframework.livestreamv2.filter.IFilterManager
            public final int composerRemoveNodes(String[] strArr, int i2) {
                return 0;
            }

            @Override // com.ss.avframework.livestreamv2.filter.IFilterManager
            public final int composerReplaceNodesWithTags(String[] strArr, int i2, String[] strArr2, int i3, String[] strArr3) {
                return 0;
            }

            @Override // com.ss.avframework.livestreamv2.filter.IFilterManager
            public final int composerSetMode(int i2, int i3) {
                return 0;
            }

            @Override // com.ss.avframework.livestreamv2.filter.IFilterManager
            public final int composerSetNodes(String[] strArr, int i2) {
                return 0;
            }

            @Override // com.ss.avframework.livestreamv2.filter.IFilterManager
            public final int composerSetNodesWithTags(String[] strArr, int i2, String[] strArr2) {
                return 0;
            }

            @Override // com.ss.avframework.livestreamv2.filter.IFilterManager
            public final int composerUpdateNode(String str, String str2, float f2) {
                return 0;
            }

            @Override // com.ss.avframework.livestreamv2.filter.IFilterManager
            public final IAudioStrangeVoice createAudioStrangeVoice(AudioDeviceModule.AudioRenderSink audioRenderSink, int i2, int i3) {
                return null;
            }

            @Override // com.ss.avframework.livestreamv2.filter.IFilterManager
            public final boolean detectFaceFromBitMap(Bitmap bitmap) {
                return false;
            }

            @Override // com.ss.avframework.livestreamv2.filter.IFilterManager
            public final void enable(boolean z) {
            }

            @Override // com.ss.avframework.livestreamv2.filter.IFilterManager
            public final void enableExpressionDetect(boolean z, boolean z2, boolean z3, boolean z4, boolean z5, boolean z6) {
            }

            @Override // com.ss.avframework.livestreamv2.filter.IFilterManager
            public final int enableFindContour(boolean z, String str) {
                return 0;
            }

            @Override // com.ss.avframework.livestreamv2.filter.IFilterManager
            public final int enableMockFace(boolean z) {
                return 0;
            }

            @Override // com.ss.avframework.livestreamv2.filter.IFilterManager
            public final void forceOutput2DTex(boolean z) {
            }

            @Override // com.ss.avframework.livestreamv2.filter.IFilterManager
            public final String getABDefaultInfoFromEffect(String str) {
                return null;
            }

            @Override // com.ss.avframework.livestreamv2.filter.IFilterManager
            public final long getEffectAudioQuirk() {
                return 0;
            }

            @Override // com.ss.avframework.livestreamv2.filter.IFilterManager
            public final float getEffectAudioVolume() {
                return 0.0f;
            }

            @Override // com.ss.avframework.livestreamv2.filter.IFilterManager
            public final long getEffectNativeHandler() {
                return 0;
            }

            @Override // com.ss.avframework.livestreamv2.filter.IFilterManager
            public final String getEffectVersion() {
                return null;
            }

            @Override // com.ss.avframework.livestreamv2.filter.IFilterManager
            public final float getFilterIntensity(String str) {
                return 0.0f;
            }

            @Override // com.ss.avframework.livestreamv2.filter.IFilterManager
            public final String getVersion() {
                return "";
            }

            @Override // com.ss.avframework.livestreamv2.filter.IFilterManager
            public final IVideoEffectProcessor getVideoEffectProcessor() {
                return null;
            }

            @Override // com.ss.avframework.livestreamv2.filter.IFilterManager
            public final boolean isEnable() {
                return true;
            }

            @Override // com.ss.avframework.livestreamv2.filter.IFilterManager
            public final boolean isValid() {
                return false;
            }

            @Override // com.ss.avframework.livestreamv2.filter.IFilterManager
            public final String name() {
                return "DummyFilter";
            }

            @Override // com.ss.avframework.livestreamv2.filter.IFilterManager
            public final int pauseEffect() {
                return 0;
            }

            @Override // com.ss.avframework.livestreamv2.filter.IFilterManager
            public final void processDoubleClickEvent(float f2, float f3) {
            }

            @Override // com.ss.avframework.livestreamv2.filter.IFilterManager
            public final void processLongPressEvent(float f2, float f3) {
            }

            @Override // com.ss.avframework.livestreamv2.filter.IFilterManager
            public final void processPanEvent(float f2, float f3, float f4, float f5, float f6) {
            }

            @Override // com.ss.avframework.livestreamv2.filter.IFilterManager
            public final void processRotationEvent(float f2, float f3) {
            }

            @Override // com.ss.avframework.livestreamv2.filter.IFilterManager
            public final void processScaleEvent(float f2, float f3) {
            }

            @Override // com.ss.avframework.livestreamv2.filter.IFilterManager
            public final void processTouchDownEvent(float f2, float f3, int i2) {
            }

            @Override // com.ss.avframework.livestreamv2.filter.IFilterManager
            public final void processTouchEvent(float f2, float f3) {
            }

            @Override // com.ss.avframework.livestreamv2.filter.IFilterManager
            public final void processTouchEventWithTouchType(long j2, float f2, float f3, float f4, float f5, int i2, int i3) {
            }

            @Override // com.ss.avframework.livestreamv2.filter.IFilterManager
            public final void processTouchUpEvent(float f2, float f3, int i2) {
            }

            @Override // com.ss.avframework.livestreamv2.filter.IFilterManager
            public final void releaseContetDetector() {
            }

            @Override // com.ss.avframework.livestreamv2.filter.IFilterManager
            public final int resumeEffect() {
                return 0;
            }

            @Override // com.ss.avframework.livestreamv2.filter.IFilterManager
            public final int sendEffectMsg(int i2, int i3, int i4, String str) {
                return 0;
            }

            @Override // com.ss.avframework.livestreamv2.filter.IFilterManager
            public final void setABInfoToEffect(JSONObject jSONObject, String str) {
            }

            @Override // com.ss.avframework.livestreamv2.filter.IFilterManager
            public final int setAudioRecognizeDict(Map<String, String[]> map) {
                return 0;
            }

            @Override // com.ss.avframework.livestreamv2.filter.IFilterManager
            public final int setBeautify(String str, float f2, float f3) {
                return 0;
            }

            @Override // com.ss.avframework.livestreamv2.filter.IFilterManager
            public final int setBeautify(String str, float f2, float f3, float f4) {
                return 0;
            }

            @Override // com.ss.avframework.livestreamv2.filter.IFilterManager
            public final void setContourDataCallBack(IFilterManager.ContourDataCallBack contourDataCallBack) {
            }

            @Override // com.ss.avframework.livestreamv2.filter.IFilterManager
            public final void setContourDataSendInterval(int i2) {
            }

            @Override // com.ss.avframework.livestreamv2.filter.IFilterManager
            public final int setCustomEffect(String str, String str2) {
                return 0;
            }

            @Override // com.ss.avframework.livestreamv2.filter.IFilterManager
            public final int setCustomEffectOrientation(String str, int i2) {
                return 0;
            }

            @Override // com.ss.avframework.livestreamv2.filter.IFilterManager
            public final int setCustomEffectWithUri(String str, String str2, int i2, int i3) {
                return 0;
            }

            @Override // com.ss.avframework.livestreamv2.filter.IFilterManager
            public final void setDoubleViewRect(double d2, double d3, double d4, double d5) {
            }

            @Override // com.ss.avframework.livestreamv2.filter.IFilterManager
            public final int setEffect(String str) {
                return 0;
            }

            @Override // com.ss.avframework.livestreamv2.filter.IFilterManager
            public final int setEffect(String str, boolean z) {
                return 0;
            }

            @Override // com.ss.avframework.livestreamv2.filter.IFilterManager
            public final void setEffectAudioQuirk(long j2) {
            }

            @Override // com.ss.avframework.livestreamv2.filter.IFilterManager
            public final void setEffectAudioVolume(float f2) {
            }

            @Override // com.ss.avframework.livestreamv2.filter.IFilterManager
            public final void setEffectInfoChangeListener(IVideoEffectProcessor.IEffectInfoChangeListener iEffectInfoChangeListener) {
            }

            @Override // com.ss.avframework.livestreamv2.filter.IFilterManager
            public final void setEffectMsgListener(IFilterManager.EffectMsgListener effectMsgListener) {
            }

            @Override // com.ss.avframework.livestreamv2.filter.IFilterManager
            public final void setErrorListener(IFilterManager.ErrorListener errorListener) {
            }

            @Override // com.ss.avframework.livestreamv2.filter.IFilterManager
            public final void setExpressionDetectListener(IFilterManager.ExpressionDetectListener expressionDetectListener) {
            }

            @Override // com.ss.avframework.livestreamv2.filter.IFilterManager
            public final int setFaceAttribute(boolean z) {
                return 0;
            }

            @Override // com.ss.avframework.livestreamv2.filter.IFilterManager
            public final void setFaceDetectListener(IFilterManager.FaceDetectListener faceDetectListener) {
            }

            @Override // com.ss.avframework.livestreamv2.filter.IFilterManager
            public final int setFilter(String str, float f2) {
                return 0;
            }

            @Override // com.ss.avframework.livestreamv2.filter.IFilterManager
            public final int setFilter(String str, float f2, boolean z) {
                return 0;
            }

            @Override // com.ss.avframework.livestreamv2.filter.IFilterManager
            public final int setFilter(String str, String str2, float f2, float f3, float f4) {
                return 0;
            }

            @Override // com.ss.avframework.livestreamv2.filter.IFilterManager
            public final int setFilter(String str, String str2, float f2, float f3, float f4, boolean z) {
                return 0;
            }

            @Override // com.ss.avframework.livestreamv2.filter.IFilterManager
            public final void setFindContourListener(IFilterManager.FindContourListener findContourListener) {
            }

            @Override // com.ss.avframework.livestreamv2.filter.IFilterManager
            public final void setLicenseToEffect(String str) {
            }

            @Override // com.ss.avframework.livestreamv2.filter.IFilterManager
            public final void setMicrophoneDetectListener(IFilterManager.MicrophoneDetectListener microphoneDetectListener) {
            }

            @Override // com.ss.avframework.livestreamv2.filter.IFilterManager
            public final void setMusicNodeFilePath(String str) {
            }

            @Override // com.ss.avframework.livestreamv2.filter.IFilterManager
            public final void setRenderCacheString(String str, String str2) {
            }

            @Override // com.ss.avframework.livestreamv2.filter.IFilterManager
            public final int setReshape(String str, float f2, float f3) {
                return 0;
            }

            @Override // com.ss.avframework.livestreamv2.filter.IFilterManager
            public final void setSendContourInfoType(int i2) {
            }

            @Override // com.ss.avframework.livestreamv2.filter.IFilterManager
            public final int startAudioRecognize() {
                return 0;
            }

            @Override // com.ss.avframework.livestreamv2.filter.IFilterManager
            public final int startEffectAudio() {
                return 0;
            }

            @Override // com.ss.avframework.livestreamv2.filter.IFilterManager
            public final int stopAudioRecognize() {
                return 0;
            }

            @Override // com.ss.avframework.livestreamv2.filter.IFilterManager
            public final int stopEffectAudio() {
                return 0;
            }

            @Override // com.ss.avframework.livestreamv2.filter.IFilterManager
            public final void updateEffAudioTimestampMs(long j2) {
            }
        };
    }

    static {
        Covode.recordClassIndex(100308);
        try {
            com_ss_avframework_livestreamv2_filter_FilterManager_com_ss_android_ugc_aweme_lancet_LoadSoLancet_loadLibrary("effect");
        } catch (Throwable unused) {
        }
    }

    @Override // com.ss.avframework.livestreamv2.filter.IFilterManager
    public String getEffectVersion() {
        IVideoEffectProcessor iVideoEffectProcessor = this.mEffect;
        if (iVideoEffectProcessor == null) {
            return "";
        }
        return iVideoEffectProcessor.getEffectVersion();
    }

    @Override // com.ss.avframework.livestreamv2.filter.IFilterManager
    public String getVersion() {
        if (isValid()) {
            return this.mEffect.getEffectVersion();
        }
        return "";
    }

    @Override // com.ss.avframework.livestreamv2.filter.IFilterManager
    public boolean isValid() {
        IVideoEffectProcessor iVideoEffectProcessor = this.mEffect;
        if (iVideoEffectProcessor == null || !iVideoEffectProcessor.valid()) {
            return false;
        }
        return true;
    }

    /* access modifiers changed from: package-private */
    public final /* synthetic */ void lambda$releaseContetDetector$2$FilterManager() {
        if (isValid()) {
            this.mEffect.releaseContetDetector();
        }
    }

    @Override // com.ss.avframework.livestreamv2.filter.IFilterManager
    public String name() {
        if (isValid()) {
            return this.mEffect.name();
        }
        return "";
    }

    @Override // com.ss.avframework.livestreamv2.filter.IFilterManager
    public void releaseContetDetector() {
        this.mHandler.post(new FilterManager$$Lambda$2(this));
    }

    @Override // com.ss.avframework.livestreamv2.filter.IFilterManager
    public long getEffectAudioQuirk() {
        AudioDeviceModule.AudioRenderSink audioRenderSink;
        IVideoEffectProcessor iVideoEffectProcessor = this.mEffect;
        if (iVideoEffectProcessor != null) {
            audioRenderSink = iVideoEffectProcessor.getEffectAudioRender();
        } else {
            audioRenderSink = null;
        }
        if (audioRenderSink != null) {
            return audioRenderSink.getQuirks() & 3;
        }
        return 0;
    }

    @Override // com.ss.avframework.livestreamv2.filter.IFilterManager
    public long getEffectNativeHandler() {
        IVideoEffectProcessor iVideoEffectProcessor;
        if (!isValid() || (iVideoEffectProcessor = this.mEffect) == null || !(iVideoEffectProcessor instanceof EffectWrapper)) {
            return 0;
        }
        return ((EffectWrapper) iVideoEffectProcessor).getEffectNativeHandler();
    }

    @Override // com.ss.avframework.livestreamv2.filter.IFilterManager
    public int pauseEffect() {
        final String callInfo = getCallInfo(new Object[0]);
        this.mHandler.post(new Runnable() {
            /* class com.ss.avframework.livestreamv2.filter.FilterManager.AnonymousClass45 */

            static {
                Covode.recordClassIndex(100354);
            }

            public void run() {
                int pauseEffect;
                if (FilterManager.this.isValid() && (pauseEffect = FilterManager.this.mEffect.pauseEffect()) != 0) {
                    FilterManager.this.mErrorListener.onError(pauseEffect, callInfo);
                }
            }
        });
        return 0;
    }

    @Override // com.ss.avframework.livestreamv2.filter.IFilterManager
    public int resumeEffect() {
        final String callInfo = getCallInfo(new Object[0]);
        this.mHandler.post(new Runnable() {
            /* class com.ss.avframework.livestreamv2.filter.FilterManager.AnonymousClass46 */

            static {
                Covode.recordClassIndex(100355);
            }

            public void run() {
                int resumeEffect;
                if (FilterManager.this.isValid() && (resumeEffect = FilterManager.this.mEffect.resumeEffect()) != 0) {
                    FilterManager.this.mErrorListener.onError(resumeEffect, callInfo);
                }
            }
        });
        return 0;
    }

    @Override // com.ss.avframework.livestreamv2.filter.IFilterManager
    public int startAudioRecognize() {
        if (this.mAudioRecognizing) {
            return -1;
        }
        IVideoEffectProcessor.EffectMsgListener effectMsgListener = this.mMsgListener;
        if (effectMsgListener != null) {
            effectMsgListener.onMessageReceived(20, 2139095043, 0, "");
        }
        this.mAudioRecognizing = true;
        return 0;
    }

    @Override // com.ss.avframework.livestreamv2.filter.IFilterManager
    public int stopAudioRecognize() {
        if (!this.mAudioRecognizing) {
            return -1;
        }
        IVideoEffectProcessor.EffectMsgListener effectMsgListener = this.mMsgListener;
        if (effectMsgListener != null) {
            effectMsgListener.onMessageReceived(20, 2139095044, 0, "");
        }
        this.mAudioRecognizing = false;
        return 0;
    }

    @Override // com.ss.avframework.engine.NativeObject
    public synchronized void release() {
        Handler handler;
        MethodCollector.i(14423);
        if (this.mReleased) {
            MethodCollector.o(14423);
            return;
        }
        if (this.mEnableFindContour) {
            enableFindContour(false, null);
        }
        AVLog.ioi("FilterManager", "Release filterManager ".concat(String.valueOf(this)));
        this.mReleased = true;
        stopEffectAudio();
        YuvConverter yuvConverter = this.mYuvConverter;
        this.mYuvConverter = null;
        if (yuvConverter != null && ((handler = this.mYuvConvertHandler) == null || this.mYuvConvertThread == null || !handler.post(new FilterManager$$Lambda$1(yuvConverter)))) {
            AVLog.ioe("FilterManager", "YuvConverter mem leak!");
        }
        GLThread gLThread = this.mYuvConvertThread;
        if (gLThread != null) {
            SafeHandlerThreadPoolExecutor.unlockThread(gLThread);
            this.mYuvConvertThread = null;
        }
        this.mHandler.post(new Runnable() {
            /* class com.ss.avframework.livestreamv2.filter.FilterManager.AnonymousClass4 */

            static {
                Covode.recordClassIndex(100347);
            }

            public void run() {
                FilterManager.this.stopCatchTask(-100, "Video catching is interrupted.");
                if (FilterManager.this.mEffect != null) {
                    FilterManager.this.mEffect.release();
                    FilterManager.this.mEffect.setEffectMsgListener(null);
                    FilterManager.this.mEffect = null;
                    IVideoEffectProcessor.EffectMsgListener effectMsgListener = FilterManager.this.mMsgListener;
                    if (effectMsgListener != null) {
                        effectMsgListener.onMessageReceived(2139095042, 0, 0, null);
                    }
                }
                FilterManager.this.mMsgListener = null;
                FilterManager.this.mErrorListener = FilterManager$4$$Lambda$0.$instance;
                if (FilterManager.this.mOffscreenDraw != null) {
                    FilterManager.this.mOffscreenDraw.release();
                    FilterManager.this.mOffscreenDraw = null;
                }
                if (FilterManager.this.mBufferPool != null) {
                    FilterVideoBufferPool.Recycle pop = FilterManager.this.mBufferPool.pop();
                    while (pop != null) {
                        if (pop.getRefCounts() != 0) {
                            AVLog.e("FilterManager", "Texture buffer(" + pop.toString() + ") not release");
                        }
                        GlTextureFrameBuffer buffer = pop.getBuffer();
                        pop.release();
                        buffer.release();
                        if (pop.getExtraData() != null) {
                            pop.getExtraData().releaseExtraData(pop.getExtraData());
                        }
                        pop = FilterManager.this.mBufferPool.pop();
                    }
                }
                if (FilterManager.this.mYuvTexs != null) {
                    GLES20.glDeleteTextures(FilterManager.this.mYuvTexs.length, FilterManager.this.mYuvTexs, 0);
                    FilterManager.this.mYuvTexs = null;
                }
                FilterManager.this.releaseRawVideoDumpers();
            }
        });
        GLThread gLThread2 = this.mGLThread;
        if (gLThread2 != null) {
            SafeHandlerThreadPoolExecutor.unlockThread(gLThread2);
            this.mGLThread = null;
        } else {
            ThreadUtils.invokeAtFrontUninterruptibly(this.mHandler, new Runnable() {
                /* class com.ss.avframework.livestreamv2.filter.FilterManager.AnonymousClass5 */

                static {
                    Covode.recordClassIndex(100359);
                }

                public void run() {
                }
            });
        }
        AlbumOrientationEventListener albumOrientationEventListener = this.mOrientationListener;
        if (albumOrientationEventListener != null) {
            albumOrientationEventListener.disable();
            this.mOrientationListener = null;
        }
        IInputAudioStream iInputAudioStream = this.mAudioStreamObserver;
        if (iInputAudioStream != null) {
            iInputAudioStream.release();
            this.mAudioStreamObserver = null;
        }
        if (this.mFindContourListener != null) {
            this.mFindContourListener = null;
        }
        if (this.mContourDataCallBack != null) {
            this.mContourDataCallBack = null;
        }
        super.release();
        MethodCollector.o(14423);
    }

    @Override // com.ss.avframework.livestreamv2.filter.IFilterManager
    public int enableMockFace(boolean z) {
        this.mForceSticker = z;
        return 0;
    }

    public void enableRoi(boolean z) {
        this.mRoiEnabled = z;
    }

    @Override // com.ss.avframework.livestreamv2.filter.IFilterManager
    public void forceOutput2DTex(boolean z) {
        this.mForceOutput2DTex = z;
    }

    @Override // com.ss.avframework.livestreamv2.filter.IFilterManager
    public void setContourDataCallBack(IFilterManager.ContourDataCallBack contourDataCallBack) {
        this.mContourDataCallBack = contourDataCallBack;
    }

    public void setContourInfoListener(IFilterManager.ContourInfoListener contourInfoListener) {
        this.mContourInfoListener = contourInfoListener;
    }

    @Override // com.ss.avframework.livestreamv2.filter.IFilterManager
    public void setErrorListener(IFilterManager.ErrorListener errorListener) {
        this.mErrorListener = errorListener;
    }

    @Override // com.ss.avframework.livestreamv2.filter.IFilterManager
    public void setFindContourListener(IFilterManager.FindContourListener findContourListener) {
        this.mFindContourListener = findContourListener;
    }

    @Override // com.ss.avframework.livestreamv2.filter.IFilterManager
    public void updateEffAudioTimestampMs(long j2) {
        this.mEffectAudioTimestampMs = j2;
    }

    static class EffectEdgeLog implements EffectWrapper.IEffectEdgeRenderLoga {
        private IEffectLogUploader mEffectLogUpLoader;

        static {
            Covode.recordClassIndex(100377);
        }

        EffectEdgeLog(IEffectLogUploader iEffectLogUploader) {
            this.mEffectLogUpLoader = iEffectLogUploader;
        }

        @Override // com.ss.avframework.effect.EffectWrapper.IEffectEdgeRenderLoga
        public void onEdgeRenderLog(String str, String str2) {
            IEffectLogUploader iEffectLogUploader = this.mEffectLogUpLoader;
            if (iEffectLogUploader != null) {
                JSONObject jSONObject = new JSONObject();
                try {
                    jSONObject = new JSONObject(str2);
                } catch (Exception unused) {
                }
                iEffectLogUploader.upload(str, jSONObject);
            }
        }
    }

    @Override // com.ss.avframework.livestreamv2.filter.IFilterManager
    public boolean detectFaceFromBitMap(Bitmap bitmap) {
        return this.mEffect.detectFaceFromBitMap(bitmap);
    }

    @Override // com.ss.avframework.livestreamv2.filter.IFilterManager
    public float getFilterIntensity(String str) {
        return this.mEffect.getFilterIntensity(str);
    }

    public VideoFrame processOnJava(VideoFrame videoFrame) {
        return process(videoFrame);
    }

    @Override // com.ss.avframework.livestreamv2.filter.IFilterManager
    public void setContourDataSendInterval(int i2) {
        this.mContourDataSendInterval = i2;
        this.mGetContourDataTime = 0;
    }

    public static void com_ss_avframework_livestreamv2_filter_FilterManager_com_ss_android_ugc_aweme_lancet_LoadSoLancet_loadLibrary(String str) {
        long uptimeMillis = SystemClock.uptimeMillis();
        Librarian.a(str, false, (Context) null);
        m.a(uptimeMillis, str);
    }

    static final /* synthetic */ void lambda$release$1$FilterManager(YuvConverter yuvConverter) {
        yuvConverter.release();
        AVLog.iow("FilterManager", "YuvConverter release");
    }

    /* access modifiers changed from: package-private */
    public final /* synthetic */ void lambda$setEffectInfoChangeListener$3$FilterManager(IVideoEffectProcessor.IEffectInfoChangeListener iEffectInfoChangeListener) {
        IVideoEffectProcessor iVideoEffectProcessor = this.mEffect;
        if (iVideoEffectProcessor != null && (iVideoEffectProcessor instanceof EffectWrapper)) {
            ((EffectWrapper) iVideoEffectProcessor).setEffectInfoChangeListener(iEffectInfoChangeListener);
        }
    }

    public void setEffectAlgorithmAB(final boolean z) {
        this.mHandler.post(new Runnable() {
            /* class com.ss.avframework.livestreamv2.filter.FilterManager.AnonymousClass7 */

            static {
                Covode.recordClassIndex(100373);
            }

            public void run() {
                if (FilterManager.this.isValid()) {
                    FilterManager.this.mEffect.setAlgorithmAB(z);
                }
            }
        });
    }

    @Override // com.ss.avframework.livestreamv2.filter.IFilterManager
    public void setEffectInfoChangeListener(IVideoEffectProcessor.IEffectInfoChangeListener iEffectInfoChangeListener) {
        this.mHandler.post(new FilterManager$$Lambda$3(this, iEffectInfoChangeListener));
    }

    public void setEffectLogUploader(IEffectLogUploader iEffectLogUploader) {
        if (this.mEffectEdgeLog == null) {
            this.mEffectEdgeLog = new EffectEdgeLog(iEffectLogUploader);
        }
    }

    @Override // com.ss.avframework.livestreamv2.filter.IFilterManager
    public void setEffectMsgListener(final IFilterManager.EffectMsgListener effectMsgListener) {
        this.mMsgListener = effectMsgListener;
        this.mHandler.post(new Runnable() {
            /* class com.ss.avframework.livestreamv2.filter.FilterManager.AnonymousClass48 */

            static {
                Covode.recordClassIndex(100357);
            }

            public void run() {
                if (FilterManager.this.mEffect != null) {
                    FilterManager.this.mEffect.setEffectMsgListener(effectMsgListener);
                }
            }
        });
    }

    @Override // com.ss.avframework.livestreamv2.filter.IFilterManager
    public void setExpressionDetectListener(final IFilterManager.ExpressionDetectListener expressionDetectListener) {
        this.mHandler.post(new Runnable() {
            /* class com.ss.avframework.livestreamv2.filter.FilterManager.AnonymousClass51 */

            static {
                Covode.recordClassIndex(100361);
            }

            public void run() {
                if (FilterManager.this.mEffect != null) {
                    FilterManager.this.mEffect.setExpressionDetectListener(expressionDetectListener);
                }
            }
        });
    }

    @Override // com.ss.avframework.livestreamv2.filter.IFilterManager
    public void setFaceDetectListener(final IFilterManager.FaceDetectListener faceDetectListener) {
        this.mHandler.post(new Runnable() {
            /* class com.ss.avframework.livestreamv2.filter.FilterManager.AnonymousClass49 */

            static {
                Covode.recordClassIndex(100358);
            }

            public void run() {
                if (FilterManager.this.mEffect != null) {
                    FilterManager.this.mEffect.setFaceDetectListener(faceDetectListener);
                }
            }
        });
    }

    @Override // com.ss.avframework.livestreamv2.filter.IFilterManager
    public void setMicrophoneDetectListener(final IFilterManager.MicrophoneDetectListener microphoneDetectListener) {
        this.mHandler.post(new Runnable() {
            /* class com.ss.avframework.livestreamv2.filter.FilterManager.AnonymousClass52 */

            static {
                Covode.recordClassIndex(100362);
            }

            public void run() {
                if (FilterManager.this.mEffect != null) {
                    FilterManager.this.mEffect.setMicrophoneDetectListener(microphoneDetectListener);
                }
            }
        });
    }

    @Override // com.ss.avframework.livestreamv2.filter.IFilterManager
    public void setMusicNodeFilePath(final String str) {
        if (str == null) {
            str = "";
        }
        this.mHandler.post(new Runnable() {
            /* class com.ss.avframework.livestreamv2.filter.FilterManager.AnonymousClass53 */

            static {
                Covode.recordClassIndex(100363);
            }

            public void run() {
                if (FilterManager.this.mEffect != null) {
                    FilterManager.this.mEffect.setMusicNodeFilePath(str);
                }
            }
        });
    }

    class AlbumOrientationEventListener extends OrientationEventListener {
        static {
            Covode.recordClassIndex(100376);
        }

        public void onOrientationChanged(int i2) {
            int i3;
            if (i2 != -1 && (i3 = (((i2 + 45) / 90) * 90) % 360) != FilterManager.this.mOrientation) {
                FilterManager.this.mOrientation = i3;
            }
        }

        public AlbumOrientationEventListener(Context context) {
            super(context);
            try {
                if (canDetectOrientation()) {
                    enable();
                } else {
                    AVLog.e("FilterManager", "Can't Detect Orientation");
                }
            } catch (Exception e2) {
                AVLog.logKibana(6, "FilterManager", "AlbumOrientationEventListener register failed:", e2);
            }
        }
    }

    @Override // com.ss.avframework.livestreamv2.filter.IFilterManager
    public String getABDefaultInfoFromEffect(String str) {
        IVideoEffectProcessor iVideoEffectProcessor = this.mEffect;
        if (iVideoEffectProcessor == null || !(iVideoEffectProcessor instanceof EffectWrapper)) {
            return null;
        }
        return ((EffectWrapper) iVideoEffectProcessor).getEffectABInfo(str);
    }

    @Override // com.ss.avframework.livestreamv2.filter.VideoCatcher.VideoCatcherCallback
    public void onCatchedBuffer(VideoCatcher videoCatcher) {
        ILiveStream.CatchPicCallback catchPicCallback = this.mPicCallback;
        if (catchPicCallback == null) {
            return;
        }
        if (videoCatcher == this.mOriginFrameCatcher) {
            catchPicCallback.onCatchedPic(false, videoCatcher);
        } else if (videoCatcher == this.mEffectFrameCatcher) {
            catchPicCallback.onCatchedPic(true, videoCatcher);
        }
    }

    @Override // com.ss.avframework.livestreamv2.filter.IFilterManager
    public int setAudioRecognizeDict(final Map<String, String[]> map) {
        final String callInfo = getCallInfo(map);
        this.mHandler.post(new Runnable() {
            /* class com.ss.avframework.livestreamv2.filter.FilterManager.AnonymousClass21 */

            static {
                Covode.recordClassIndex(100327);
            }

            public void run() {
                int audioRecognizeDict;
                if (FilterManager.this.isValid() && (audioRecognizeDict = FilterManager.this.mEffect.setAudioRecognizeDict(map)) != 0) {
                    FilterManager.this.mErrorListener.onError(audioRecognizeDict, callInfo);
                }
            }
        });
        return 0;
    }

    @Override // com.ss.avframework.livestreamv2.filter.IFilterManager
    public int setEffect(final String str) {
        final String callInfo = getCallInfo(str);
        this.mHandler.post(new Runnable() {
            /* class com.ss.avframework.livestreamv2.filter.FilterManager.AnonymousClass13 */

            static {
                Covode.recordClassIndex(100318);
            }

            public void run() {
                int effect;
                if (FilterManager.this.isValid() && (effect = FilterManager.this.mEffect.setEffect(str)) != 0) {
                    FilterManager.this.mErrorListener.onError(effect, callInfo);
                }
            }
        });
        return 0;
    }

    @Override // com.ss.avframework.livestreamv2.filter.IFilterManager
    public void setEffectAudioQuirk(long j2) {
        AudioDeviceModule.AudioRenderSink effectAudioRender;
        IVideoEffectProcessor iVideoEffectProcessor = this.mEffect;
        if (iVideoEffectProcessor != null && (effectAudioRender = iVideoEffectProcessor.getEffectAudioRender()) != null) {
            effectAudioRender.setQuirks(j2 & 3);
        }
    }

    @Override // com.ss.avframework.livestreamv2.filter.IFilterManager
    public void setEffectAudioVolume(float f2) {
        AudioDeviceModule.AudioRenderSink effectAudioRender;
        IVideoEffectProcessor iVideoEffectProcessor = this.mEffect;
        if (!(iVideoEffectProcessor == null || (effectAudioRender = iVideoEffectProcessor.getEffectAudioRender()) == null)) {
            this.mEffectAudioVolume = f2;
            effectAudioRender.setVolume(f2);
        }
        IInputAudioStream iInputAudioStream = this.mAudioStreamObserver;
        if (iInputAudioStream != null) {
            AudioMixer.AudioMixerDescription mixerDescription = iInputAudioStream.getMixerDescription();
            mixerDescription.volumeCoeff = f2;
            iInputAudioStream.setMixerDescription(mixerDescription);
        }
    }

    public void setEnableVpassEnableFindContour(boolean z) {
        this.mVpassEnableFindContour = z;
        AVLog.ioi("FilterManager", "setEnableVpassEnableFindContour. enable = ".concat(String.valueOf(z)));
    }

    @Override // com.ss.avframework.livestreamv2.filter.IFilterManager
    public int setFaceAttribute(final boolean z) {
        final String callInfo = getCallInfo(Boolean.valueOf(z));
        this.mHandler.post(new Runnable() {
            /* class com.ss.avframework.livestreamv2.filter.FilterManager.AnonymousClass11 */

            static {
                Covode.recordClassIndex(100316);
            }

            public void run() {
                int faceAttribute;
                if (FilterManager.this.isValid() && (faceAttribute = FilterManager.this.mEffect.setFaceAttribute(z)) != 0) {
                    FilterManager.this.mErrorListener.onError(faceAttribute, callInfo);
                }
            }
        });
        return 0;
    }

    @Override // com.ss.avframework.livestreamv2.filter.IFilterManager
    public void setLicenseToEffect(final String str) {
        final String callInfo = getCallInfo(str);
        this.mHandler.post(new Runnable() {
            /* class com.ss.avframework.livestreamv2.filter.FilterManager.AnonymousClass55 */

            static {
                Covode.recordClassIndex(100365);
            }

            public void run() {
                int effectLicense;
                if (FilterManager.this.isValid() && (effectLicense = FilterManager.this.mEffect.setEffectLicense(str)) != 0) {
                    FilterManager.this.mErrorListener.onError(effectLicense, callInfo);
                }
            }
        });
    }

    @Override // com.ss.avframework.livestreamv2.filter.IFilterManager
    public void enable(boolean z) {
        AudioDeviceModule.AudioRenderSink effectAudioRender;
        AVLog.iod("FilterManager", "enable " + this.mEnabled + " -> " + z);
        this.mEnabled = z;
        IVideoEffectProcessor iVideoEffectProcessor = this.mEffect;
        if (iVideoEffectProcessor != null && (effectAudioRender = iVideoEffectProcessor.getEffectAudioRender()) != null) {
            effectAudioRender.setMute(!z);
        }
    }

    @Override // com.ss.avframework.livestreamv2.filter.IFilterManager
    public void setSendContourInfoType(int i2) {
        if (i2 == 1 || i2 == 2) {
            this.mEffect.setSendContourInfoType(i2);
            this.mSendContourInfoType = i2;
            AVLog.ioi("FilterManager", "setSendContourInfoType success. type = ".concat(String.valueOf(i2)));
        }
        AVLog.iow("FilterManager", "setSendContourInfoType fail. type = ".concat(String.valueOf(i2)));
    }

    @Override // com.ss.avframework.buffer.TextureBufferImpl.ToI420Interface
    public VideoFrame.I420Buffer toI420(VideoFrame.TextureBuffer textureBuffer) {
        VideoFrame.I420Buffer[] i420BufferArr = new VideoFrame.I420Buffer[1];
        if (this.mYuvConvertThread == null && this.mYuvConvertHandler == null) {
            GLThread lockGLThread = SafeHandlerThreadPoolExecutor.lockGLThread("YuvConvertThread");
            this.mYuvConvertThread = lockGLThread;
            lockGLThread.start();
            this.mYuvConvertHandler = this.mYuvConvertThread.getHandler();
        }
        Handler handler = this.mYuvConvertHandler;
        if (!(handler == null || this.mYuvConvertThread == null)) {
            ThreadUtils.invokeAtFrontUninterruptibly(handler, new FilterManager$$Lambda$4(this, i420BufferArr, textureBuffer));
        }
        return i420BufferArr[0];
    }

    /* JADX WARNING: Code restructure failed: missing block: B:22:0x0053, code lost:
        if (r0 == false) goto L_0x0055;
     */
    @Override // com.ss.avframework.engine.VideoProcessor
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public com.ss.avframework.buffer.VideoFrame process(final com.ss.avframework.buffer.VideoFrame r11) {
        /*
        // Method dump skipped, instructions count: 142
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ss.avframework.livestreamv2.filter.FilterManager.process(com.ss.avframework.buffer.VideoFrame):com.ss.avframework.buffer.VideoFrame");
    }

    /* JADX WARNING: Removed duplicated region for block: B:42:0x0143  */
    /* JADX WARNING: Removed duplicated region for block: B:44:0x0149  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public com.ss.avframework.buffer.VideoFrame onProcess(com.ss.avframework.buffer.VideoFrame r27) {
        /*
        // Method dump skipped, instructions count: 1148
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ss.avframework.livestreamv2.filter.FilterManager.onProcess(com.ss.avframework.buffer.VideoFrame):com.ss.avframework.buffer.VideoFrame");
    }

    public void onCatchError(int i2, String str) {
        stopCatchTask(i2, str);
    }

    @Override // com.ss.avframework.livestreamv2.filter.VideoCatcher.VideoCatcherCallback
    public void onError(int i2, String str) {
        onCatchError(i2, str);
    }

    public void catchPic(final Bundle bundle, final ILiveStream.CatchPicCallback catchPicCallback) {
        this.mHandler.post(new Runnable() {
            /* class com.ss.avframework.livestreamv2.filter.FilterManager.AnonymousClass56 */

            static {
                Covode.recordClassIndex(100366);
            }

            public void run() {
                int i2 = bundle.getInt("width");
                int i3 = bundle.getInt("height");
                boolean z = bundle.getBoolean("outputPixelBufferOrigin");
                boolean z2 = bundle.getBoolean("outputPixelBufferWithEffect");
                FilterManager.this.mKeepVideoCatcherAlive = bundle.getBoolean("keepVideoCatcherAlive");
                FilterManager.this.mPicCallback = catchPicCallback;
                if (z) {
                    if (FilterManager.this.mOriginFrameCatcher == null) {
                        FilterManager.this.mOriginFrameCatcher = new VideoCatcher();
                        VideoCatcher videoCatcher = FilterManager.this.mOriginFrameCatcher;
                        FilterManager filterManager = FilterManager.this;
                        videoCatcher.start(i2, i3, filterManager, filterManager.mHandler);
                    }
                } else if (FilterManager.this.mOriginFrameCatcher != null) {
                    FilterManager.this.mOriginFrameCatcher.stop(0);
                    FilterManager.this.mOriginFrameCatcher = null;
                }
                if (z2) {
                    if (FilterManager.this.mEffectFrameCatcher == null) {
                        FilterManager.this.mEffectFrameCatcher = new VideoCatcher();
                        VideoCatcher videoCatcher2 = FilterManager.this.mEffectFrameCatcher;
                        FilterManager filterManager2 = FilterManager.this;
                        videoCatcher2.start(i2, i3, filterManager2, filterManager2.mHandler);
                    }
                } else if (FilterManager.this.mEffectFrameCatcher != null) {
                    FilterManager.this.mEffectFrameCatcher.stop(0);
                    FilterManager.this.mEffectFrameCatcher = null;
                }
                if (z || z2) {
                    FilterManager.this.mCatchVideoFrameCount = bundle.getInt("frameCount");
                    FilterManager.this.mCatchVideoFrameInterval = (int) (bundle.getFloat("interval") * 1000.0f);
                }
            }
        });
    }

    @Override // com.ss.avframework.livestreamv2.filter.IFilterManager
    public void processDoubleClickEvent(final float f2, final float f3) {
        this.mHandler.post(new Runnable() {
            /* class com.ss.avframework.livestreamv2.filter.FilterManager.AnonymousClass40 */

            static {
                Covode.recordClassIndex(100349);
            }

            public void run() {
                if (FilterManager.this.isValid()) {
                    FilterManager.this.mEffect.processDoubleClickEvent(f2, f3);
                }
            }
        });
    }

    @Override // com.ss.avframework.livestreamv2.filter.IFilterManager
    public void processLongPressEvent(final float f2, final float f3) {
        this.mHandler.post(new Runnable() {
            /* class com.ss.avframework.livestreamv2.filter.FilterManager.AnonymousClass39 */

            static {
                Covode.recordClassIndex(100346);
            }

            public void run() {
                if (FilterManager.this.isValid()) {
                    FilterManager.this.mEffect.processLongPressEvent(f2, f3);
                }
            }
        });
    }

    @Override // com.ss.avframework.livestreamv2.filter.IFilterManager
    public void processRotationEvent(final float f2, final float f3) {
        this.mHandler.post(new Runnable() {
            /* class com.ss.avframework.livestreamv2.filter.FilterManager.AnonymousClass44 */

            static {
                Covode.recordClassIndex(100353);
            }

            public void run() {
                if (FilterManager.this.isValid()) {
                    FilterManager.this.mEffect.processRotationEvent(f2, f3);
                }
            }
        });
    }

    @Override // com.ss.avframework.livestreamv2.filter.IFilterManager
    public void processScaleEvent(final float f2, final float f3) {
        this.mHandler.post(new Runnable() {
            /* class com.ss.avframework.livestreamv2.filter.FilterManager.AnonymousClass43 */

            static {
                Covode.recordClassIndex(100352);
            }

            public void run() {
                if (FilterManager.this.isValid()) {
                    FilterManager.this.mEffect.processScaleEvent(f2, f3);
                }
            }
        });
    }

    @Override // com.ss.avframework.livestreamv2.filter.IFilterManager
    public void processTouchEvent(final float f2, final float f3) {
        this.mHandler.post(new Runnable() {
            /* class com.ss.avframework.livestreamv2.filter.FilterManager.AnonymousClass36 */

            static {
                Covode.recordClassIndex(100343);
            }

            public void run() {
                if (FilterManager.this.isValid()) {
                    FilterManager.this.mEffect.processTouchEvent(f2, f3);
                }
            }
        });
    }

    @Override // com.ss.avframework.livestreamv2.filter.IFilterManager
    public void setRenderCacheString(String str, String str2) {
        if (isValid()) {
            this.mEffect.setRenderCacheString(str, str2);
        }
    }

    @Override // com.ss.avframework.livestreamv2.filter.IFilterManager
    public int composerAppendNodes(final String[] strArr, final int i2) {
        final String callInfo = getCallInfo(strArr, Integer.valueOf(i2));
        this.mHandler.post(new Runnable() {
            /* class com.ss.avframework.livestreamv2.filter.FilterManager.AnonymousClass27 */

            static {
                Covode.recordClassIndex(100333);
            }

            public void run() {
                int composerAppendNodes;
                if (FilterManager.this.isValid() && (composerAppendNodes = FilterManager.this.mEffect.composerAppendNodes(strArr, i2)) != 0) {
                    FilterManager.this.mErrorListener.onError(composerAppendNodes, callInfo);
                }
            }
        });
        return 0;
    }

    @Override // com.ss.avframework.livestreamv2.filter.IFilterManager
    public int composerReloadNodes(final String[] strArr, final int i2) {
        final String callInfo = getCallInfo(strArr, Integer.valueOf(i2));
        this.mHandler.post(new Runnable() {
            /* class com.ss.avframework.livestreamv2.filter.FilterManager.AnonymousClass26 */

            static {
                Covode.recordClassIndex(100332);
            }

            public void run() {
                int composerReloadNodes;
                if (FilterManager.this.isValid() && (composerReloadNodes = FilterManager.this.mEffect.composerReloadNodes(strArr, i2)) != 0) {
                    FilterManager.this.mErrorListener.onError(composerReloadNodes, callInfo);
                }
            }
        });
        return 0;
    }

    @Override // com.ss.avframework.livestreamv2.filter.IFilterManager
    public int composerRemoveNodes(final String[] strArr, final int i2) {
        final String callInfo = getCallInfo(strArr, Integer.valueOf(i2));
        this.mHandler.post(new Runnable() {
            /* class com.ss.avframework.livestreamv2.filter.FilterManager.AnonymousClass28 */

            static {
                Covode.recordClassIndex(100334);
            }

            public void run() {
                int composerRemoveNodes;
                if (FilterManager.this.isValid() && (composerRemoveNodes = FilterManager.this.mEffect.composerRemoveNodes(strArr, i2)) != 0) {
                    FilterManager.this.mErrorListener.onError(composerRemoveNodes, callInfo);
                }
            }
        });
        return 0;
    }

    @Override // com.ss.avframework.livestreamv2.filter.IFilterManager
    public int composerSetMode(final int i2, final int i3) {
        final String callInfo = getCallInfo(Integer.valueOf(i2), Integer.valueOf(i3));
        this.mHandler.post(new Runnable() {
            /* class com.ss.avframework.livestreamv2.filter.FilterManager.AnonymousClass23 */

            static {
                Covode.recordClassIndex(100329);
            }

            public void run() {
                int composerSetMode;
                if (FilterManager.this.isValid() && (composerSetMode = FilterManager.this.mEffect.composerSetMode(i2, i3)) != 0) {
                    FilterManager.this.mErrorListener.onError(composerSetMode, callInfo);
                }
            }
        });
        return 0;
    }

    @Override // com.ss.avframework.livestreamv2.filter.IFilterManager
    public int composerSetNodes(final String[] strArr, final int i2) {
        final String callInfo = getCallInfo(strArr, Integer.valueOf(i2));
        this.mHandler.post(new Runnable() {
            /* class com.ss.avframework.livestreamv2.filter.FilterManager.AnonymousClass24 */

            static {
                Covode.recordClassIndex(100330);
            }

            public void run() {
                int composerSetNodes;
                if (FilterManager.this.isValid() && (composerSetNodes = FilterManager.this.mEffect.composerSetNodes(strArr, i2)) != 0) {
                    FilterManager.this.mErrorListener.onError(composerSetNodes, callInfo);
                }
            }
        });
        return 0;
    }

    /* access modifiers changed from: package-private */
    public final /* synthetic */ void lambda$toI420$4$FilterManager(VideoFrame.I420Buffer[] i420BufferArr, VideoFrame.TextureBuffer textureBuffer) {
        if (this.mEffect != null && this.mYuvConverter == null) {
            this.mYuvConverter = new YuvConverter();
        }
        YuvConverter yuvConverter = this.mYuvConverter;
        if (yuvConverter != null) {
            i420BufferArr[0] = yuvConverter.convert(textureBuffer);
        }
    }

    @Override // com.ss.avframework.livestreamv2.filter.IFilterManager
    public void setABInfoToEffect(final JSONObject jSONObject, final String str) {
        final String callInfo = getCallInfo(jSONObject.toString(), str);
        this.mHandler.post(new Runnable() {
            /* class com.ss.avframework.livestreamv2.filter.FilterManager.AnonymousClass54 */

            static {
                Covode.recordClassIndex(100364);
            }

            public void run() {
                int effectABInfo;
                if (FilterManager.this.isValid() && (effectABInfo = FilterManager.this.mEffect.setEffectABInfo(jSONObject, str)) != 0) {
                    FilterManager.this.mErrorListener.onError(effectABInfo, callInfo);
                }
            }
        });
    }

    @Override // com.ss.avframework.livestreamv2.filter.IFilterManager
    public int setCustomEffect(final String str, final String str2) {
        final String callInfo = getCallInfo(str, str2);
        this.mHandler.post(new Runnable() {
            /* class com.ss.avframework.livestreamv2.filter.FilterManager.AnonymousClass14 */

            static {
                Covode.recordClassIndex(100319);
            }

            public void run() {
                int customEffect;
                if (FilterManager.this.isValid() && (customEffect = FilterManager.this.mEffect.setCustomEffect(str, str2)) != 0) {
                    FilterManager.this.mErrorListener.onError(customEffect, callInfo);
                }
            }
        });
        return 0;
    }

    @Override // com.ss.avframework.livestreamv2.filter.IFilterManager
    public int setCustomEffectOrientation(final String str, final int i2) {
        final String callInfo = getCallInfo(str, Integer.valueOf(i2));
        this.mHandler.post(new Runnable() {
            /* class com.ss.avframework.livestreamv2.filter.FilterManager.AnonymousClass16 */

            static {
                Covode.recordClassIndex(100321);
            }

            public void run() {
                int customEffectOrientation;
                if (FilterManager.this.isValid() && (customEffectOrientation = FilterManager.this.mEffect.setCustomEffectOrientation(str, i2)) != 0) {
                    FilterManager.this.mErrorListener.onError(customEffectOrientation, callInfo);
                }
            }
        });
        return 0;
    }

    @Override // com.ss.avframework.livestreamv2.filter.IFilterManager
    public int setFilter(final String str, final float f2) {
        final String callInfo = getCallInfo(str, Float.valueOf(f2));
        this.mHandler.post(new Runnable() {
            /* class com.ss.avframework.livestreamv2.filter.FilterManager.AnonymousClass17 */

            static {
                Covode.recordClassIndex(100322);
            }

            public void run() {
                int filter;
                if (FilterManager.this.isValid() && (filter = FilterManager.this.mEffect.setFilter(str, f2)) != 0) {
                    FilterManager.this.mErrorListener.onError(filter, callInfo);
                }
            }
        });
        return 0;
    }

    public void enableExtData(long j2, int i2) {
        this.mExtrDataFlags = j2;
        this.mExtraDataGop = i2;
        AVLog.iod("FilterManager", "enableExtData " + j2 + " gop " + i2);
    }

    @Override // com.ss.avframework.livestreamv2.filter.IFilterManager
    public int enableFindContour(boolean z, String str) {
        if (!this.mVpassEnableFindContour) {
            return -2;
        }
        int i2 = -1;
        if (isValid() && (i2 = this.mEffect.enableFindContour(z, str)) == 0) {
            this.mEnableFindContour = z;
            AVLog.ioi("FilterManager", "enableFindContour. enable = ".concat(String.valueOf(z)));
        }
        return i2;
    }

    @Override // com.ss.avframework.livestreamv2.filter.IFilterManager
    public int setEffect(final String str, final boolean z) {
        final String callInfo = getCallInfo(str, Boolean.valueOf(z));
        this.mHandler.post(new Runnable() {
            /* class com.ss.avframework.livestreamv2.filter.FilterManager.AnonymousClass12 */

            static {
                Covode.recordClassIndex(100317);
            }

            public void run() {
                if (FilterManager.this.isValid()) {
                    FilterManager.this.mForceSticker = z;
                    int effect = FilterManager.this.mEffect.setEffect(str);
                    if (effect != 0) {
                        FilterManager.this.mErrorListener.onError(effect, callInfo);
                    }
                }
            }
        });
        return 0;
    }

    public void stopCatchTask(final int i2, final String str) {
        if (Thread.currentThread() != this.mHandler.getLooper().getThread()) {
            this.mHandler.post(new Runnable() {
                /* class com.ss.avframework.livestreamv2.filter.FilterManager.AnonymousClass58 */

                static {
                    Covode.recordClassIndex(100369);
                }

                public void run() {
                    FilterManager.this.stopCatchTask(i2, str);
                }
            });
            return;
        }
        VideoCatcher videoCatcher = this.mOriginFrameCatcher;
        if (videoCatcher != null) {
            videoCatcher.stop(i2);
            this.mOriginFrameCatcher = null;
        }
        VideoCatcher videoCatcher2 = this.mEffectFrameCatcher;
        if (videoCatcher2 != null) {
            videoCatcher2.stop(i2);
            this.mEffectFrameCatcher = null;
        }
        ILiveStream.CatchMediaDataCallback catchMediaDataCallback = this.mCatchVideoCallback;
        if (catchMediaDataCallback != null) {
            if (i2 == 0) {
                catchMediaDataCallback.onComplete();
            } else {
                catchMediaDataCallback.onError(i2, str);
            }
            this.mCatchVideoCallback = null;
        }
        this.mCatchVideoFrameCount = 0;
    }

    public void catchVideo(MediaEngineFactory mediaEngineFactory, final Bundle bundle, final ILiveStream.CatchMediaDataCallback catchMediaDataCallback) {
        final WeakReference weakReference = new WeakReference(mediaEngineFactory);
        this.mHandler.post(new Runnable() {
            /* class com.ss.avframework.livestreamv2.filter.FilterManager.AnonymousClass57 */

            static {
                Covode.recordClassIndex(100367);
            }

            public void run() {
                if (FilterManager.this.mOriginFrameCatcher == null && FilterManager.this.mEffectFrameCatcher == null) {
                    MediaEngineFactory mediaEngineFactory = (MediaEngineFactory) weakReference.get();
                    int i2 = bundle.getInt("mode", -1);
                    int i3 = bundle.getInt("width");
                    int i4 = bundle.getInt("height");
                    int i5 = bundle.getInt("fps");
                    boolean z = bundle.getBoolean("hardwareEncode", true);
                    String string = bundle.getString("outputPathOrigin");
                    String string2 = bundle.getString("outputPathWithEffect");
                    FilterManager.this.mCatchVideoFrameCount = bundle.getInt("frameCount");
                    if (i2 == 0 && bundle.containsKey("duration")) {
                        FilterManager.this.mCatchVideoFrameCount = (int) (bundle.getFloat("duration") * ((float) i5));
                    }
                    FilterManager.this.mCatchVideoFrameInterval = (int) (bundle.getFloat("interval") * 1000.0f);
                    FilterManager.this.mCatchVideoCallback = catchMediaDataCallback;
                    new ILiveStream.CatchMediaDataCallback() {
                        /* class com.ss.avframework.livestreamv2.filter.FilterManager.AnonymousClass57.AnonymousClass1 */

                        static {
                            Covode.recordClassIndex(100368);
                        }

                        @Override // com.ss.avframework.livestreamv2.ILiveStream.CatchMediaDataCallback
                        public void onComplete() {
                        }

                        @Override // com.ss.avframework.livestreamv2.ILiveStream.CatchMediaDataCallback
                        public void onError(int i2, String str) {
                            FilterManager.this.onCatchError(i2, str);
                        }
                    };
                    if (!TextUtils.isEmpty(string)) {
                        FilterManager.this.mOriginFrameCatcher = new VideoCatcher();
                        VideoCatcher videoCatcher = FilterManager.this.mOriginFrameCatcher;
                        FilterManager filterManager = FilterManager.this;
                        videoCatcher.start(i2, i3, i4, i5, z, string, filterManager, mediaEngineFactory, filterManager.mHandler);
                    }
                    if (!TextUtils.isEmpty(string2)) {
                        FilterManager.this.mEffectFrameCatcher = new VideoCatcher();
                        VideoCatcher videoCatcher2 = FilterManager.this.mEffectFrameCatcher;
                        FilterManager filterManager2 = FilterManager.this;
                        videoCatcher2.start(i2, i3, i4, i5, z, string2, filterManager2, mediaEngineFactory, filterManager2.mHandler);
                        return;
                    }
                    return;
                }
                ILiveStream.CatchMediaDataCallback catchMediaDataCallback = catchMediaDataCallback;
                if (catchMediaDataCallback != null) {
                    catchMediaDataCallback.onError(-2, "Already started a catching task");
                }
            }
        });
    }

    @Override // com.ss.avframework.livestreamv2.filter.IFilterManager
    public void processTouchDownEvent(final float f2, final float f3, final int i2) {
        this.mHandler.post(new Runnable() {
            /* class com.ss.avframework.livestreamv2.filter.FilterManager.AnonymousClass41 */

            static {
                Covode.recordClassIndex(100350);
            }

            public void run() {
                if (FilterManager.this.isValid()) {
                    FilterManager.this.mEffect.processTouchDownEvent(f2, f3, i2);
                }
            }
        });
    }

    @Override // com.ss.avframework.livestreamv2.filter.IFilterManager
    public void processTouchUpEvent(final float f2, final float f3, final int i2) {
        this.mHandler.post(new Runnable() {
            /* class com.ss.avframework.livestreamv2.filter.FilterManager.AnonymousClass42 */

            static {
                Covode.recordClassIndex(100351);
            }

            public void run() {
                if (FilterManager.this.isValid()) {
                    FilterManager.this.mEffect.processTouchUpEvent(f2, f3, i2);
                }
            }
        });
    }

    @Override // com.ss.avframework.livestreamv2.filter.IFilterManager
    public int composerAppendNodesWithTags(final String[] strArr, final int i2, final String[] strArr2) {
        final String callInfo = getCallInfo(strArr, strArr2);
        this.mHandler.post(new Runnable() {
            /* class com.ss.avframework.livestreamv2.filter.FilterManager.AnonymousClass31 */

            static {
                Covode.recordClassIndex(100338);
            }

            public void run() {
                int composerAppendNodesWithTags;
                if (FilterManager.this.isValid() && (composerAppendNodesWithTags = FilterManager.this.mEffect.composerAppendNodesWithTags(strArr, i2, strArr2)) != 0) {
                    FilterManager.this.mErrorListener.onError(composerAppendNodesWithTags, callInfo);
                }
            }
        });
        return 0;
    }

    @Override // com.ss.avframework.livestreamv2.filter.IFilterManager
    public IAudioStrangeVoice createAudioStrangeVoice(AudioDeviceModule.AudioRenderSink audioRenderSink, int i2, int i3) {
        IVideoEffectProcessor iVideoEffectProcessor = this.mEffect;
        if (iVideoEffectProcessor == null || !(iVideoEffectProcessor instanceof EffectWrapper)) {
            return null;
        }
        return new AudioStrangeVoice(audioRenderSink, (EffectWrapper) this.mEffect, i2, i3);
    }

    @Override // com.ss.avframework.livestreamv2.filter.IFilterManager
    public int composerCheckNodeExclusion(final String str, final String str2, final int[] iArr) {
        final String callInfo = getCallInfo(str, str2, iArr);
        if (isValid() && iArr.length > 0) {
            ThreadUtils.invokeAtFrontUninterruptibly(this.mHandler, new Runnable() {
                /* class com.ss.avframework.livestreamv2.filter.FilterManager.AnonymousClass33 */

                static {
                    Covode.recordClassIndex(100340);
                }

                public void run() {
                    int composerCheckNodeExclusion = FilterManager.this.mEffect.composerCheckNodeExclusion(str, str2, iArr);
                    if (composerCheckNodeExclusion != 0) {
                        FilterManager.this.mErrorListener.onError(composerCheckNodeExclusion, callInfo);
                    }
                }
            });
        }
        return 0;
    }

    @Override // com.ss.avframework.livestreamv2.filter.IFilterManager
    public int composerReloadNodesWithTags(final String[] strArr, final int i2, final String[] strArr2) {
        final String callInfo = getCallInfo(strArr, Integer.valueOf(i2), strArr2);
        this.mHandler.post(new Runnable() {
            /* class com.ss.avframework.livestreamv2.filter.FilterManager.AnonymousClass30 */

            static {
                Covode.recordClassIndex(100337);
            }

            public void run() {
                int composerReloadNodesWithTags;
                if (FilterManager.this.isValid() && (composerReloadNodesWithTags = FilterManager.this.mEffect.composerReloadNodesWithTags(strArr, i2, strArr2)) != 0) {
                    FilterManager.this.mErrorListener.onError(composerReloadNodesWithTags, callInfo);
                }
            }
        });
        return 0;
    }

    @Override // com.ss.avframework.livestreamv2.filter.IFilterManager
    public int composerSetNodesWithTags(final String[] strArr, final int i2, final String[] strArr2) {
        final String callInfo = getCallInfo(strArr, Integer.valueOf(i2), strArr2);
        this.mHandler.post(new Runnable() {
            /* class com.ss.avframework.livestreamv2.filter.FilterManager.AnonymousClass29 */

            static {
                Covode.recordClassIndex(100335);
            }

            public void run() {
                int composerSetNodesWithTags;
                if (FilterManager.this.isValid() && (composerSetNodesWithTags = FilterManager.this.mEffect.composerSetNodesWithTags(strArr, i2, strArr2)) != 0) {
                    FilterManager.this.mErrorListener.onError(composerSetNodesWithTags, callInfo);
                }
            }
        });
        return 0;
    }

    @Override // com.ss.avframework.livestreamv2.filter.IFilterManager
    public int composerUpdateNode(final String str, final String str2, final float f2) {
        final String callInfo = getCallInfo(str, str2, Float.valueOf(f2));
        this.mHandler.post(new Runnable() {
            /* class com.ss.avframework.livestreamv2.filter.FilterManager.AnonymousClass25 */

            static {
                Covode.recordClassIndex(100331);
            }

            public void run() {
                int composerUpdateNode;
                if (FilterManager.this.isValid() && (composerUpdateNode = FilterManager.this.mEffect.composerUpdateNode(str, str2, f2)) != 0) {
                    FilterManager.this.mErrorListener.onError(composerUpdateNode, callInfo);
                }
            }
        });
        return 0;
    }

    @Override // com.ss.avframework.livestreamv2.filter.IFilterManager
    public int setBeautify(final String str, final float f2, final float f3) {
        final String callInfo = getCallInfo(str, Float.valueOf(f2), Float.valueOf(f3));
        this.mHandler.post(new Runnable() {
            /* class com.ss.avframework.livestreamv2.filter.FilterManager.AnonymousClass8 */

            static {
                Covode.recordClassIndex(100374);
            }

            public void run() {
                int beautify;
                if (FilterManager.this.isValid() && (beautify = FilterManager.this.mEffect.setBeautify(str, f2, f3)) != 0) {
                    FilterManager.this.mErrorListener.onError(beautify, callInfo);
                }
            }
        });
        return 0;
    }

    @Override // com.ss.avframework.livestreamv2.filter.IFilterManager
    public int setFilter(final String str, final float f2, final boolean z) {
        final String callInfo = getCallInfo(str, Float.valueOf(f2), Boolean.valueOf(z));
        this.mHandler.post(new Runnable() {
            /* class com.ss.avframework.livestreamv2.filter.FilterManager.AnonymousClass18 */

            static {
                Covode.recordClassIndex(100323);
            }

            public void run() {
                int filter;
                if (FilterManager.this.isValid() && (filter = FilterManager.this.mEffect.setFilter(str, f2, z)) != 0) {
                    FilterManager.this.mErrorListener.onError(filter, callInfo);
                }
            }
        });
        return 0;
    }

    @Override // com.ss.avframework.livestreamv2.filter.IFilterManager
    public int setReshape(final String str, final float f2, final float f3) {
        final String callInfo = getCallInfo(str, Float.valueOf(f2), Float.valueOf(f3));
        this.mHandler.post(new Runnable() {
            /* class com.ss.avframework.livestreamv2.filter.FilterManager.AnonymousClass10 */

            static {
                Covode.recordClassIndex(100315);
            }

            public void run() {
                int reshape;
                if (FilterManager.this.isValid() && (reshape = FilterManager.this.mEffect.setReshape(str, f2, f3)) != 0) {
                    FilterManager.this.mErrorListener.onError(reshape, callInfo);
                }
            }
        });
        return 0;
    }

    public void setConfig(String[] strArr, boolean[] zArr, JSONObject jSONObject) {
        long j2;
        long j3;
        IVideoEffectProcessor iVideoEffectProcessor = this.mEffect;
        if (iVideoEffectProcessor != null) {
            if (iVideoEffectProcessor instanceof EffectWrapper) {
                if (strArr != null) {
                    if (zArr != null) {
                        long algorithmRequirment = ((EffectWrapper) iVideoEffectProcessor).getAlgorithmRequirment();
                        this.effectAlgorithmRequirment = algorithmRequirment;
                        long algorithmRequirmentParams = ((EffectWrapper) this.mEffect).getAlgorithmRequirmentParams();
                        this.effectAlgorithmRequirmentParams = algorithmRequirmentParams;
                        AVLog.iod("FilterManager", "Current requirment " + Long.toHexString(algorithmRequirment));
                        for (String str : strArr) {
                            for (boolean z : zArr) {
                                AVLog.ioi("FilterManager", "Requirment name " + str + " enable " + z);
                                if (str.equalsIgnoreCase("")) {
                                    if (z) {
                                        j3 = 17592186044416L;
                                    } else {
                                        j2 = -17592186044417L;
                                        algorithmRequirment &= j2;
                                    }
                                } else if (!str.equalsIgnoreCase("faceinfo")) {
                                    if (str.equalsIgnoreCase("mouthPout")) {
                                        algorithmRequirmentParams |= 67108864;
                                    }
                                } else if (z) {
                                    j3 = 1;
                                } else {
                                    j2 = -2;
                                    algorithmRequirment &= j2;
                                }
                                algorithmRequirment |= j3;
                            }
                        }
                        AVLog.iod("FilterManager", "update requirment " + Long.toHexString(algorithmRequirment) + ", flagsParams:" + Long.toHexString(algorithmRequirmentParams));
                        ((EffectWrapper) this.mEffect).refreshAlgorithmRequirment(algorithmRequirment, algorithmRequirmentParams);
                        AVLog.iod("FilterManager", "after requirment " + Long.toHexString(((EffectWrapper) this.mEffect).getAlgorithmRequirment()) + ", flagsParams:" + Long.toHexString(((EffectWrapper) this.mEffect).getAlgorithmRequirmentParams()));
                        return;
                    }
                    return;
                }
            } else if (strArr != null) {
                return;
            }
            AVLog.iod("FilterManager", "restore requirment " + Long.toHexString(this.effectAlgorithmRequirment) + ",flagsParams:" + Long.toHexString(this.effectAlgorithmRequirmentParams));
            ((EffectWrapper) this.mEffect).refreshAlgorithmRequirment(this.effectAlgorithmRequirment, this.effectAlgorithmRequirmentParams);
        }
    }

    @Override // com.ss.avframework.livestreamv2.filter.IFilterManager
    public int composerExclusionCompare(final String str, final String str2, final String str3, final int[] iArr) {
        final String callInfo = getCallInfo(str, str2, str3, iArr);
        if (isValid() && iArr.length > 0) {
            ThreadUtils.invokeAtFrontUninterruptibly(this.mHandler, new Runnable() {
                /* class com.ss.avframework.livestreamv2.filter.FilterManager.AnonymousClass34 */

                static {
                    Covode.recordClassIndex(100341);
                }

                public void run() {
                    int composerExclusionCompare = FilterManager.this.mEffect.composerExclusionCompare(str, str2, str3, iArr);
                    if (composerExclusionCompare != 0) {
                        FilterManager.this.mErrorListener.onError(composerExclusionCompare, callInfo);
                    }
                }
            });
        }
        return 0;
    }

    @Override // com.ss.avframework.livestreamv2.filter.IFilterManager
    public int sendEffectMsg(final int i2, final int i3, final int i4, final String str) {
        final String callInfo = getCallInfo(Integer.valueOf(i2), Integer.valueOf(i3), Integer.valueOf(i4), str);
        this.mHandler.post(new Runnable() {
            /* class com.ss.avframework.livestreamv2.filter.FilterManager.AnonymousClass47 */

            static {
                Covode.recordClassIndex(100356);
            }

            public void run() {
                int sendEffectMsg;
                if (FilterManager.this.isValid() && (sendEffectMsg = FilterManager.this.mEffect.sendEffectMsg(i2, i3, i4, str)) != 0) {
                    FilterManager.this.mErrorListener.onError(sendEffectMsg, callInfo);
                }
            }
        });
        return 0;
    }

    @Override // com.ss.avframework.livestreamv2.filter.IFilterManager
    public int setCustomEffectWithUri(final String str, final String str2, final int i2, final int i3) {
        final String callInfo = getCallInfo(str, str2, Integer.valueOf(i2), Integer.valueOf(i3));
        this.mHandler.post(new Runnable() {
            /* class com.ss.avframework.livestreamv2.filter.FilterManager.AnonymousClass15 */

            static {
                Covode.recordClassIndex(100320);
            }

            public void run() {
                if (FilterManager.this.isValid()) {
                    Bitmap loadBitmapCompat = ImageLoadUtils.loadBitmapCompat(FilterManager.this.mContext, str2, i2, i3);
                    if (loadBitmapCompat == null) {
                        AVLog.ioe("FilterManager", "loadBitmapCompat failed");
                        return;
                    }
                    int customEffectBitmap = FilterManager.this.mEffect.setCustomEffectBitmap(str, loadBitmapCompat);
                    if (customEffectBitmap != 0) {
                        FilterManager.this.mErrorListener.onError(customEffectBitmap, callInfo);
                    }
                }
            }
        });
        return 0;
    }

    @Override // com.ss.avframework.livestreamv2.filter.IFilterManager
    public void setDoubleViewRect(final double d2, final double d3, final double d4, final double d5) {
        getCallInfo(Double.valueOf(d2), Double.valueOf(d3), Double.valueOf(d4), Double.valueOf(d5));
        this.mHandler.post(new Runnable() {
            /* class com.ss.avframework.livestreamv2.filter.FilterManager.AnonymousClass35 */

            static {
                Covode.recordClassIndex(100342);
            }

            public void run() {
                if (FilterManager.this.isValid()) {
                    FilterManager.this.mEffect.setDoubleViewRect(d2, d3, d4, d5);
                }
            }
        });
    }

    private VideoFrame wrapperFrame(int i2, VideoFrame videoFrame, RoiInfo roiInfo, EffectWrapper.AlgorithmResult algorithmResult) {
        FilterVideoBufferPool.Recycle recycle;
        Matrix matrix = new Matrix();
        matrix.reset();
        matrix.preTranslate(0.5f, 0.5f);
        matrix.preScale(1.0f, -1.0f);
        matrix.preTranslate(-0.5f, -0.5f);
        FilterVideoBufferPool.Recycle recycle2 = this.mOut2DTexRecycle;
        if (recycle2 == null || i2 != recycle2.getBuffer().getTextureId()) {
            recycle = this.mTextureFrameBufferRecycle;
        } else {
            recycle = this.mOut2DTexRecycle;
        }
        recycle.addRef();
        TextureBufferImpl textureBufferImpl = new TextureBufferImpl(videoFrame.getRotatedWidth(), videoFrame.getRotatedHeight(), VideoFrame.TextureBuffer.Type.RGB, i2, matrix, this, recycle, algorithmResult);
        textureBufferImpl.updateCaptureMs(videoFrame.getBuffer().getCaptureMs());
        textureBufferImpl.setROIInfo(roiInfo);
        return new VideoFrame(textureBufferImpl, 0, videoFrame.getTimestampNs());
    }

    @Override // com.ss.avframework.livestreamv2.filter.IFilterManager
    public int setBeautify(final String str, final float f2, final float f3, final float f4) {
        final String callInfo = getCallInfo(str, Float.valueOf(f2), Float.valueOf(f3), Float.valueOf(f4));
        this.mHandler.post(new Runnable() {
            /* class com.ss.avframework.livestreamv2.filter.FilterManager.AnonymousClass9 */

            static {
                Covode.recordClassIndex(100375);
            }

            public void run() {
                int beautify;
                if (FilterManager.this.isValid() && (beautify = FilterManager.this.mEffect.setBeautify(str, f2, f3, f4)) != 0) {
                    FilterManager.this.mErrorListener.onError(beautify, callInfo);
                }
            }
        });
        return 0;
    }

    public static IFilterManager create(IInputAudioStream iInputAudioStream, Context context, Handler handler, IVideoEffectProcessor iVideoEffectProcessor, AudioDeviceModule audioDeviceModule) {
        return new FilterManager(iInputAudioStream, context, handler, iVideoEffectProcessor, audioDeviceModule, false);
    }

    @Override // com.ss.avframework.livestreamv2.filter.IFilterManager
    public void processPanEvent(final float f2, final float f3, final float f4, final float f5, final float f6) {
        this.mHandler.post(new Runnable() {
            /* class com.ss.avframework.livestreamv2.filter.FilterManager.AnonymousClass38 */

            static {
                Covode.recordClassIndex(100345);
            }

            public void run() {
                if (FilterManager.this.isValid()) {
                    FilterManager.this.mEffect.processPanEvent(f2, f3, f4, f5, f6);
                }
            }
        });
    }

    @Override // com.ss.avframework.livestreamv2.filter.IFilterManager
    public int composerReplaceNodesWithTags(final String[] strArr, final int i2, final String[] strArr2, final int i3, final String[] strArr3) {
        final String callInfo = getCallInfo(strArr, Integer.valueOf(i2), strArr2, Integer.valueOf(i3), strArr3);
        this.mHandler.post(new Runnable() {
            /* class com.ss.avframework.livestreamv2.filter.FilterManager.AnonymousClass32 */

            static {
                Covode.recordClassIndex(100339);
            }

            public void run() {
                int composerReplaceNodesWithTags;
                if (FilterManager.this.isValid() && (composerReplaceNodesWithTags = FilterManager.this.mEffect.composerReplaceNodesWithTags(strArr, i2, strArr2, i3, strArr3)) != 0) {
                    FilterManager.this.mErrorListener.onError(composerReplaceNodesWithTags, callInfo);
                }
            }
        });
        return 0;
    }

    @Override // com.ss.avframework.livestreamv2.ILiveStream.IAudioFrameAvailableListener
    public void onAudioFrameAvailable(final Buffer buffer, final int i2, final int i3, final int i4, long j2) {
        if (!(buffer instanceof ByteBuffer) || !buffer.isDirect()) {
            throw new AndroidRuntimeException("Audio buffer should be a direct byte buffer!");
        } else if (i2 * 100 != i3) {
            throw new AndroidRuntimeException("Audio data should be 10ms per frame!");
        } else if (this.mAudioRecognizing) {
            this.mHandler.post(new Runnable() {
                /* class com.ss.avframework.livestreamv2.filter.FilterManager.AnonymousClass22 */

                static {
                    Covode.recordClassIndex(100328);
                }

                public void run() {
                    int startAudioRecognize;
                    if (FilterManager.this.isValid() && FilterManager.this.mEffect.isAudioRecognizeAvailable() && (startAudioRecognize = FilterManager.this.mEffect.startAudioRecognize((ByteBuffer) buffer, i2, i3, i4)) != 0) {
                        FilterManager.this.mErrorListener.onError(startAudioRecognize, "startAudioRecognize(ByteBuffer, " + i2 + ", " + i3 + ", " + i4 + ")");
                    }
                }
            });
        }
    }

    @Override // com.ss.avframework.livestreamv2.filter.IFilterManager
    public int setFilter(final String str, final String str2, final float f2, final float f3, final float f4) {
        final String callInfo = getCallInfo(str, str2, Float.valueOf(f2), Float.valueOf(f3), Float.valueOf(f4));
        this.mHandler.post(new Runnable() {
            /* class com.ss.avframework.livestreamv2.filter.FilterManager.AnonymousClass19 */

            static {
                Covode.recordClassIndex(100324);
            }

            public void run() {
                int filter;
                if (FilterManager.this.isValid() && (filter = FilterManager.this.mEffect.setFilter(str, str2, f3, f4, f2)) != 0) {
                    FilterManager.this.mErrorListener.onError(filter, callInfo);
                }
            }
        });
        return 0;
    }

    public static IFilterManager create(IInputAudioStream iInputAudioStream, Context context, Handler handler, IVideoEffectProcessor iVideoEffectProcessor, AudioDeviceModule audioDeviceModule, boolean z) {
        return new FilterManager(iInputAudioStream, context, handler, iVideoEffectProcessor, audioDeviceModule, z);
    }

    @Override // com.ss.avframework.livestreamv2.filter.IFilterManager
    public void enableExpressionDetect(final boolean z, final boolean z2, final boolean z3, final boolean z4, final boolean z5, final boolean z6) {
        this.mHandler.post(new Runnable() {
            /* class com.ss.avframework.livestreamv2.filter.FilterManager.AnonymousClass50 */

            static {
                Covode.recordClassIndex(100360);
            }

            public void run() {
                if (FilterManager.this.mEffect != null) {
                    FilterManager.this.mEffect.enableExpressionDetect(z, z2, z3, z4, z5, z6);
                }
            }
        });
    }

    public FilterManager(IInputAudioStream iInputAudioStream, Context context, Handler handler, final IVideoEffectProcessor iVideoEffectProcessor, final AudioDeviceModule audioDeviceModule, final boolean z) {
        this.mHandler = handler;
        this.mContext = context;
        if (handler != null) {
            ThreadUtils.invokeAtFrontUninterruptibly(handler, new Runnable() {
                /* class com.ss.avframework.livestreamv2.filter.FilterManager.AnonymousClass2 */

                static {
                    Covode.recordClassIndex(100325);
                }

                public void run() {
                    MethodCollector.i(13346);
                    if (!GlUtil.nativeIsOpenGlThread()) {
                        FilterManager.this.mHandler = null;
                    }
                    MethodCollector.o(13346);
                }
            });
        }
        if (this.mHandler == null) {
            GLThread lockGLThread = SafeHandlerThreadPoolExecutor.lockGLThread("LiveFilterThread");
            this.mGLThread = lockGLThread;
            lockGLThread.start();
            this.mHandler = this.mGLThread.getHandler();
        }
        this.mAudioStreamObserver = iInputAudioStream;
        this.mOrientationListener = new AlbumOrientationEventListener(context);
        this.mErrorListener = FilterManager$$Lambda$0.$instance;
        ThreadUtils.invokeAtFrontUninterruptibly(this.mHandler, new Runnable() {
            /* class com.ss.avframework.livestreamv2.filter.FilterManager.AnonymousClass3 */

            static {
                Covode.recordClassIndex(100336);
            }

            public void run() {
                IVideoEffectProcessor iVideoEffectProcessor = iVideoEffectProcessor;
                if (iVideoEffectProcessor != null) {
                    FilterManager.this.mEffect = iVideoEffectProcessor;
                } else {
                    if (z) {
                        EffectWrapper.setEffectEdgeLog(FilterManager.this.mEffectEdgeLog);
                    }
                    FilterManager.this.mEffect = new EffectWrapper(audioDeviceModule, z);
                    FilterManager.this.mIsEdgeRender = z;
                }
                if (!FilterManager.this.mEffect.valid()) {
                    FilterManager.this.mEffect.release();
                    FilterManager.this.mEffect = null;
                    return;
                }
                AudioDeviceModule.AudioRenderSink effectAudioRender = FilterManager.this.mEffect.getEffectAudioRender();
                if (!(effectAudioRender == null || FilterManager.this.mAudioStreamObserver == null)) {
                    effectAudioRender.setAudioTrack(FilterManager.this.mAudioStreamObserver.getAudioTrack());
                    effectAudioRender.setVolume(FilterManager.this.mEffectAudioVolume);
                    FilterManager.this.mAudioStreamObserver.getMixerDescription().volumeCoeff = FilterManager.this.mEffectAudioVolume;
                    FilterManager.this.mAudioStreamObserver.start();
                }
                AVLog.iow("FilterManager", "Using Effect info " + FilterManager.this.mEffect.name() + " " + FilterManager.this.mEffect.getEffectVersion());
                FilterManager.this.mOffscreenDraw = new GlRenderDrawer();
            }
        });
        this.mBufferPool = new FilterVideoBufferPool(this.mBufferPoolMaxSize);
    }

    @Override // com.ss.avframework.livestreamv2.filter.IFilterManager
    public int setFilter(final String str, final String str2, final float f2, final float f3, final float f4, final boolean z) {
        final String callInfo = getCallInfo(str, str2, Float.valueOf(f2), Float.valueOf(f3), Float.valueOf(f4), Boolean.valueOf(z));
        this.mHandler.post(new Runnable() {
            /* class com.ss.avframework.livestreamv2.filter.FilterManager.AnonymousClass20 */

            static {
                Covode.recordClassIndex(100326);
            }

            public void run() {
                int filter;
                if (FilterManager.this.isValid() && (filter = FilterManager.this.mEffect.setFilter(str, str2, f3, f4, f2, z)) != 0) {
                    FilterManager.this.mErrorListener.onError(filter, callInfo);
                }
            }
        });
        return 0;
    }

    @Override // com.ss.avframework.livestreamv2.filter.IFilterManager
    public void processTouchEventWithTouchType(final long j2, final float f2, final float f3, final float f4, final float f5, final int i2, final int i3) {
        this.mHandler.post(new Runnable() {
            /* class com.ss.avframework.livestreamv2.filter.FilterManager.AnonymousClass37 */

            static {
                Covode.recordClassIndex(100344);
            }

            public void run() {
                if (FilterManager.this.isValid()) {
                    FilterManager.this.mEffect.processTouchEventWithTouchType(j2, f2, f3, f4, f5, i2, i3);
                }
            }
        });
    }

    public void configEffect(final int i2, final int i3, final String str, final String str2, final boolean z, final boolean z2, final String str3, final AssetManager assetManager, final Object obj) {
        this.mHandler.post(new Runnable() {
            /* class com.ss.avframework.livestreamv2.filter.FilterManager.AnonymousClass6 */

            static {
                Covode.recordClassIndex(100371);
            }

            public void run() {
                if (FilterManager.this.isValid()) {
                    if (obj != null) {
                        FilterManager.this.mEffect.setResourceFinder(obj);
                    }
                    if (assetManager != null) {
                        FilterManager.this.mEffect.setAssetManager(assetManager);
                    }
                    FilterManager.this.mEffect.configEffect(i2, i3, str, str2, z, z2, str3);
                    IVideoEffectProcessor.EffectMsgListener effectMsgListener = FilterManager.this.mMsgListener;
                    if (effectMsgListener != null) {
                        effectMsgListener.onMessageReceived(2139095041, 0, 0, null);
                    }
                }
            }
        });
    }
}
