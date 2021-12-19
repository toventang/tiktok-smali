package com.ss.avframework.livestreamv2.core;

import android.content.Context;
import android.content.Intent;
import android.graphics.Bitmap;
import android.graphics.SurfaceTexture;
import android.media.AudioManager;
import android.os.Build;
import android.os.Bundle;
import android.os.Handler;
import android.os.Looper;
import android.text.TextUtils;
import android.util.AndroidRuntimeException;
import android.util.Log;
import android.view.Surface;
import android.view.View;
import com.bytedance.android.livesdk.livesetting.pullstream.LiveNetAdaptiveHurryTimeSetting;
import com.bytedance.covode.number.Covode;
import com.bytedance.frameworks.apm.trace.MethodCollector;
import com.ss.avframework.buffer.SurfaceTextureHelper;
import com.ss.avframework.buffer.SurfaceTextureSharedHandler;
import com.ss.avframework.buffer.VideoFrame;
import com.ss.avframework.capture.audio.AudioRecordThread;
import com.ss.avframework.effect.EffectWrapper;
import com.ss.avframework.effect.IVideoEffectProcessor;
import com.ss.avframework.engine.AudioDeviceModule;
import com.ss.avframework.engine.MediaEngineFactory;
import com.ss.avframework.engine.MediaSource;
import com.ss.avframework.engine.MediaTrack;
import com.ss.avframework.engine.VideoSink;
import com.ss.avframework.engine.VsyncModule;
import com.ss.avframework.livestreamv2.IDualGameEngine;
import com.ss.avframework.livestreamv2.IInputAudioStream;
import com.ss.avframework.livestreamv2.IInputVideoStream;
import com.ss.avframework.livestreamv2.ILiveStream;
import com.ss.avframework.livestreamv2.LiveStream;
import com.ss.avframework.livestreamv2.LiveStreamBuilder;
import com.ss.avframework.livestreamv2.LiveStreamOption;
import com.ss.avframework.livestreamv2.LiveStreamReport;
import com.ss.avframework.livestreamv2.RenderView;
import com.ss.avframework.livestreamv2.control.IVideoCapturerControl;
import com.ss.avframework.livestreamv2.core.Client;
import com.ss.avframework.livestreamv2.core.DirectVideoMixer;
import com.ss.avframework.livestreamv2.core.IGameEngineExt;
import com.ss.avframework.livestreamv2.core.ILayerControlExt;
import com.ss.avframework.livestreamv2.core.LiveCore;
import com.ss.avframework.livestreamv2.core.audiorecord.IAudioRecordManager;
import com.ss.avframework.livestreamv2.core.interact.model.Config;
import com.ss.avframework.livestreamv2.core.interact.model.Region;
import com.ss.avframework.livestreamv2.filter.FilterManager;
import com.ss.avframework.livestreamv2.filter.IAudioFilterManager;
import com.ss.avframework.livestreamv2.filter.IFilterManager;
import com.ss.avframework.livestreamv2.ktv.IKaraokeMovie;
import com.ss.avframework.livestreamv2.log.LiveStreamLogService;
import com.ss.avframework.livestreamv2.recorder.IRecorderManager;
import com.ss.avframework.livestreamv2.utils.PrivacyCertManager;
import com.ss.avframework.livestreamv2.utils.TimerTaskUtils;
import com.ss.avframework.livestreamv2.utils.ZlibCompressUtils;
import com.ss.avframework.mixer.VideoMixer;
import com.ss.avframework.opengl.GLRenderVideoSink;
import com.ss.avframework.opengl.GLThread;
import com.ss.avframework.opengl.GLThreadManager;
import com.ss.avframework.player.IAVPlayer;
import com.ss.avframework.utils.AVLog;
import com.ss.avframework.utils.MiscUtils;
import com.ss.avframework.utils.SafeHandlerThread;
import com.ss.avframework.utils.SafeHandlerThreadPoolExecutor;
import com.ss.avframework.utils.TEBundle;
import com.ss.avframework.utils.ThreadUtils;
import com.ss.optimizer.live.sdk.dns.e;
import java.lang.reflect.Method;
import java.nio.Buffer;
import java.nio.ByteBuffer;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.UUID;
import java.util.Vector;
import java.util.concurrent.ConcurrentLinkedQueue;
import java.util.concurrent.Executor;
import javax.microedition.khronos.egl.EGLContext;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

public class LiveCoreImpl extends LiveCore implements AudioDeviceModule.Observer, ILiveStream.IAudioFrameAvailableListener, ILiveStream.ITextureFrameAvailableListener {
    private static ConcurrentLinkedQueue<String> callStatcks = new ConcurrentLinkedQueue<>();
    private String currentCallStack;
    private boolean isInteracting;
    private IAudioDeviceControl mAudioDeviceControl;
    protected final AudioDeviceModule mAudioDeviceModule;
    private List<ILiveStream.IAudioFrameAvailableListener> mAudioFrameListeners = new ArrayList();
    private final Object mAudioFrameListenersFence = new Object();
    public boolean mCameraFirstReport = true;
    public ILayerControlExt.ILayerExt mCameraStreamLayer;
    private VideoSink mCameraVideoSink;
    private LiveCore.InteractConfig mConfig;
    private View mDisplayView;
    private boolean mEnableAutoGlRecycler;
    protected ILiveStream.ILiveStreamErrorListener mErrorListener;
    private IGameEngineExt mGameEngine;
    public IGameEngineExt.GameVideoSink mGameVideoConsumer;
    protected ILiveStream.ILiveStreamInfoListener mInfoListener;
    private InteractEngine mInteractEngine;
    private InteractEngineBuilder mInteractEngineBuilder;
    public LiveCore.ILiveForInteractListener mInteractEngineListener;
    private boolean mIsPause = false;
    public ILayerControlExt mLayerControl;
    private ILayerControlExt.ILayerExt mLayerDualGame;
    protected ILiveStream mLiveStream;
    public LiveStreamLogService mLiveStreamLogService;
    protected SafeHandlerThread mLogUploadThread;
    protected Handler mLogUploadThreadHandler;
    private Config.MixStreamType mMixStreamType;
    private boolean mPushedOnce;
    protected RenderView mRenderView;
    private LiveCoreRoiSwitch mRoiSwitch;
    protected LiveCore.RtcExtraDataListener mRtcExtraDataListener;
    public ScreenAudioPlaybackObserver mScreenAudioPlaybackObserver;
    private long mStartTimeMs;
    private List<ILiveStream.ITextureFrameAvailableListener> mTextureFrameListeners = new ArrayList();
    private final Object mTextureFrameListenersFence = new Object();
    protected Handler mVideoCaptureHandler;
    protected GLThread mVideoCaptureThread;
    protected SafeHandlerThread mWorkThread;
    protected Handler mWorkThreadHandler;

    @Override // com.ss.avframework.livestreamv2.core.LiveCore
    public AudioDeviceModule getADM() {
        return this.mAudioDeviceModule;
    }

    @Override // com.ss.avframework.livestreamv2.core.LiveCore
    public IAudioDeviceControl getAudioDeviceControl() {
        return this.mAudioDeviceControl;
    }

    @Override // com.ss.avframework.livestreamv2.core.LiveCore
    public View getCurrentDisplay() {
        return this.mDisplayView;
    }

    @Override // com.ss.avframework.livestreamv2.core.LiveCore
    public ILayerControl getLayerControl() {
        return this.mLayerControl;
    }

    /* access modifiers changed from: protected */
    @Override // com.ss.avframework.livestreamv2.core.LiveCore
    public Handler getWorkThreadHandler() {
        return this.mWorkThreadHandler;
    }

    private void stopReportNetworkQuality() {
        TimerTaskUtils.removeTask("ReportNetworkQuality");
    }

    @Override // com.ss.avframework.livestreamv2.core.LiveCore
    public void interactStart() {
        toggleInteractSatus(true);
    }

    @Override // com.ss.avframework.livestreamv2.core.LiveCore
    public void interactStop() {
        resetPushLayout();
        toggleInteractSatus(false);
    }

    @Override // com.ss.avframework.livestreamv2.core.LiveCore
    public void startInternalAudioCapture() {
        ILiveStream iLiveStream = this.mLiveStream;
        if (iLiveStream != null) {
            iLiveStream.startAudioCapture();
        }
    }

    @Override // com.ss.avframework.livestreamv2.ILiveStream
    public void startTransportInDebug() {
        ILiveStream iLiveStream = this.mLiveStream;
        if (iLiveStream != null) {
            iLiveStream.startTransportInDebug();
        }
    }

    @Override // com.ss.avframework.livestreamv2.ILiveStream
    public void startVideoCapture() {
        ILiveStream iLiveStream = this.mLiveStream;
        if (iLiveStream != null) {
            iLiveStream.startVideoCapture();
        }
    }

    @Override // com.ss.avframework.livestreamv2.core.LiveCore
    public void stopInternal() {
        ILiveStream iLiveStream = this.mLiveStream;
        if (iLiveStream != null) {
            iLiveStream.stop();
        }
    }

    @Override // com.ss.avframework.livestreamv2.core.LiveCore
    public void stopInternalAudioCapture() {
        ILiveStream iLiveStream = this.mLiveStream;
        if (iLiveStream != null) {
            iLiveStream.stopAudioCapture();
        }
    }

    @Override // com.ss.avframework.livestreamv2.ILiveStream
    public void stopTransportInDebug() {
        ILiveStream iLiveStream = this.mLiveStream;
        if (iLiveStream != null) {
            iLiveStream.stopTransportInDebug();
        }
    }

    @Override // com.ss.avframework.livestreamv2.ILiveStream
    public void stopVideoCapture() {
        ILiveStream iLiveStream = this.mLiveStream;
        if (iLiveStream != null) {
            iLiveStream.stopVideoCapture();
        }
    }

    public class ControlIPushFrameAfterCapture implements LiveCore.IPushFrameAfterCapture {
        private int cameraCaptureHeight;
        private int cameraCaptureWidth;
        private SurfaceTextureHelper.OnTextureFrameAvailableListener mListener;
        private boolean mStartPushFrameThroughLivecore;
        private Surface mSurface;
        public SurfaceTextureSharedHandler.SurfaceInternal mSurfaceShared;
        private SurfaceTextureHelper mSurfaceTextureHelper;
        private SurfaceTexture texture;

        static {
            Covode.recordClassIndex(100116);
        }

        @Override // com.ss.avframework.livestreamv2.core.LiveCore.IPushFrameAfterCapture
        public void stop() {
            this.mStartPushFrameThroughLivecore = false;
            this.mSurfaceShared = null;
            AVLog.iod("LiveCoreImpl", "mStartPushFrameThroughLivecore is set to false");
        }

        @Override // com.ss.avframework.livestreamv2.core.LiveCore.IPushFrameAfterCapture
        public void release() {
            Surface surface = this.mSurface;
            if (surface != null) {
                surface.release();
                AVLog.iod("LiveCoreImpl", "mSurface is released");
            }
            SurfaceTexture surfaceTexture = this.texture;
            if (surfaceTexture != null) {
                surfaceTexture.release();
                AVLog.iod("LiveCoreImpl", "texture is released");
            }
            this.mSurfaceTextureHelper = null;
        }

        @Override // com.ss.avframework.livestreamv2.core.LiveCore.IPushFrameAfterCapture
        public void toAddSurfaceViewCallback() {
            AVLog.iod("LiveCoreImpl", "toAddSurfaceViewCallback");
            ILayerControlExt iLayerControlExt = LiveCoreImpl.this.mLayerControl;
            if (iLayerControlExt != null) {
                RenderView renderView = iLayerControlExt.getRenderView();
                if (renderView != null && (renderView instanceof DirectVideoMixer.SurfaceViewWithoutCallback)) {
                    ((DirectVideoMixer.SurfaceViewWithoutCallback) renderView).addViewCallback();
                    return;
                }
                return;
            }
            AVLog.ioe("LiveCoreImpl", "layerControl is null!");
        }

        @Override // com.ss.avframework.livestreamv2.core.LiveCore.IPushFrameAfterCapture
        public void toRemoveSurfaceViewCallback() {
            AVLog.iod("LiveCoreImpl", "toRemoveSurfaceViewCallback");
            ILayerControlExt iLayerControlExt = LiveCoreImpl.this.mLayerControl;
            if (iLayerControlExt != null) {
                RenderView renderView = iLayerControlExt.getRenderView();
                if (renderView != null && (renderView instanceof DirectVideoMixer.SurfaceViewWithoutCallback)) {
                    ((DirectVideoMixer.SurfaceViewWithoutCallback) renderView).removeViewCallback();
                    return;
                }
                return;
            }
            AVLog.ioe("LiveCoreImpl", "layerControl is null!");
        }

        @Override // com.ss.avframework.livestreamv2.core.LiveCore.IPushFrameAfterCapture
        public void start(Surface surface) {
            if (surface == null || !(surface instanceof SurfaceTextureSharedHandler.SurfaceInternal)) {
                throw new AndroidRuntimeException("BUG surface ".concat(String.valueOf(surface)));
            }
            if (this.mSurfaceShared != null) {
                AVLog.logToIODevice(6, "LiveCoreImpl", "Bug memory leak!, Surface not release.", null);
                this.mSurfaceShared = null;
            }
            SurfaceTextureSharedHandler.SurfaceInternal surfaceInternal = (SurfaceTextureSharedHandler.SurfaceInternal) surface;
            this.mSurfaceShared = surfaceInternal;
            this.mSurfaceTextureHelper = surfaceInternal.getSurfaceTextureHelper();
            this.mSurfaceShared.setListener(new SurfaceTextureHelper.OnTextureFrameAvailableListener() {
                /* class com.ss.avframework.livestreamv2.core.LiveCoreImpl.ControlIPushFrameAfterCapture.AnonymousClass1 */

                static {
                    Covode.recordClassIndex(100117);
                }

                @Override // com.ss.avframework.buffer.SurfaceTextureHelper.OnTextureFrameAvailableListener
                public void onTextureFrameAvailable(int i2, float[] fArr, long j2) {
                    SurfaceTextureSharedHandler.SurfaceInternal surfaceInternal = ControlIPushFrameAfterCapture.this.mSurfaceShared;
                    if (surfaceInternal != null) {
                        LiveCoreImpl.this.pushVideoFrame(i2, true, surfaceInternal.getWidth(), surfaceInternal.getHeight(), 0, fArr, j2 / 1000);
                    }
                }
            });
            this.mStartPushFrameThroughLivecore = true;
            AVLog.iod("LiveCoreImpl", "mStartPushFrameThoughLivecore is set to true");
        }

        public ControlIPushFrameAfterCapture(int i2, int i3) {
            this.cameraCaptureWidth = i2;
            this.cameraCaptureHeight = i3;
        }
    }

    static {
        Covode.recordClassIndex(100095);
    }

    private void startReportNetworkQuality() {
        TimerTaskUtils.addTask(new LiveCoreImpl$$Lambda$1(this), LiveNetAdaptiveHurryTimeSetting.DEFAULT, "ReportNetworkQuality");
    }

    @Override // com.ss.avframework.livestreamv2.ILiveStream
    public boolean audioMute() {
        ILiveStream iLiveStream = this.mLiveStream;
        if (iLiveStream == null || !iLiveStream.audioMute()) {
            return false;
        }
        return true;
    }

    @Override // com.ss.avframework.livestreamv2.ILiveStream
    public IInputAudioStream createInputAudioStream() {
        ILiveStream iLiveStream = this.mLiveStream;
        if (iLiveStream == null) {
            return null;
        }
        return iLiveStream.createInputAudioStream();
    }

    @Override // com.ss.avframework.livestreamv2.ILiveStream
    public IInputVideoStream createInputVideoStream() {
        ILiveStream iLiveStream = this.mLiveStream;
        if (iLiveStream == null) {
            return null;
        }
        return iLiveStream.createInputVideoStream();
    }

    @Override // com.ss.avframework.livestreamv2.ILiveStream
    public IAudioFilterManager getAudioFilterMgr() {
        ILiveStream iLiveStream = this.mLiveStream;
        if (iLiveStream == null) {
            return null;
        }
        return iLiveStream.getAudioFilterMgr();
    }

    @Override // com.ss.avframework.livestreamv2.ILiveStream
    public IAudioRecordManager getAudioRecorMgr() {
        ILiveStream iLiveStream = this.mLiveStream;
        if (iLiveStream == null) {
            return null;
        }
        return iLiveStream.getAudioRecorMgr();
    }

    @Override // com.ss.avframework.livestreamv2.ILiveStream
    public LiveStreamOption getOption() {
        ILiveStream iLiveStream = this.mLiveStream;
        if (iLiveStream == null) {
            return null;
        }
        return iLiveStream.getOption();
    }

    @Override // com.ss.avframework.livestreamv2.ILiveStream
    public IInputAudioStream getOriginInputAudioStream() {
        ILiveStream iLiveStream = this.mLiveStream;
        if (iLiveStream == null) {
            return null;
        }
        return iLiveStream.getOriginInputAudioStream();
    }

    @Override // com.ss.avframework.livestreamv2.ILiveStream
    public IInputVideoStream getOriginInputVideoStream() {
        ILiveStream iLiveStream = this.mLiveStream;
        if (iLiveStream == null) {
            return null;
        }
        return iLiveStream.getOriginInputVideoStream();
    }

    @Override // com.ss.avframework.livestreamv2.ILiveStream
    public IRecorderManager getRecorderMgr() {
        ILiveStream iLiveStream = this.mLiveStream;
        if (iLiveStream == null) {
            return null;
        }
        return iLiveStream.getRecorderMgr();
    }

    @Override // com.ss.avframework.livestreamv2.core.LiveCore
    public List<String> getUrls() {
        LiveStream liveStream = (LiveStream) this.mLiveStream;
        if (liveStream != null) {
            return liveStream.getUrls();
        }
        return null;
    }

    @Override // com.ss.avframework.livestreamv2.ILiveStream
    public String getVersion() {
        ILiveStream iLiveStream = this.mLiveStream;
        if (iLiveStream == null) {
            return "";
        }
        return iLiveStream.getVersion();
    }

    @Override // com.ss.avframework.livestreamv2.ILiveStream
    public IVideoCapturerControl getVideoCapturerControl() {
        ILiveStream iLiveStream = this.mLiveStream;
        if (iLiveStream == null) {
            return null;
        }
        return iLiveStream.getVideoCapturerControl();
    }

    @Override // com.ss.avframework.livestreamv2.ILiveStream
    public IFilterManager getVideoFilterMgr() {
        ILiveStream iLiveStream = this.mLiveStream;
        if (iLiveStream == null) {
            return null;
        }
        return iLiveStream.getVideoFilterMgr();
    }

    @Override // com.ss.avframework.livestreamv2.core.LiveCore
    public VsyncModule getVsyncModule() {
        LiveStream liveStream = (LiveStream) this.mLiveStream;
        if (liveStream != null) {
            return liveStream.getEncodeStreamVsyncModule();
        }
        return null;
    }

    @Override // com.ss.avframework.livestreamv2.ILiveStream
    public void requestKeyFrame() {
        LiveStream liveStream = (LiveStream) this.mLiveStream;
        if (liveStream != null) {
            liveStream.requestKeyFrame();
        }
    }

    @Override // com.ss.avframework.livestreamv2.ILiveStream
    public void startAudioCapture() {
        ILiveStream iLiveStream = this.mLiveStream;
        if (iLiveStream != null) {
            iLiveStream.startAudioCapture();
            this.mInteractEngineBuilder.setStatusLiveStreamIsAudioCaptured(true);
        }
    }

    @Override // com.ss.avframework.livestreamv2.core.LiveCore
    public int startAudioPlayer() {
        this.mWorkThreadHandler.post(new Runnable() {
            /* class com.ss.avframework.livestreamv2.core.LiveCoreImpl.AnonymousClass9 */

            static {
                Covode.recordClassIndex(100115);
            }

            public void run() {
                if (LiveCoreImpl.this.mAudioDeviceModule != null) {
                    int startPlayer = LiveCoreImpl.this.mAudioDeviceModule.startPlayer();
                    if (startPlayer != 0) {
                        if (LiveCoreImpl.this.mErrorListener != null) {
                            LiveCoreImpl.this.mErrorListener.onError(8, startPlayer, new Exception("ADM startPlayer error"));
                        }
                    } else if (LiveCoreImpl.this.mInfoListener != null) {
                        LiveCoreImpl.this.mInfoListener.onInfo(18, 0, 0);
                    }
                }
            }
        });
        return 0;
    }

    @Override // com.ss.avframework.livestreamv2.ILiveStream
    public void stopAudioCapture() {
        ILiveStream iLiveStream = this.mLiveStream;
        if (iLiveStream != null) {
            iLiveStream.stopAudioCapture();
            this.mInteractEngineBuilder.setStatusLiveStreamIsAudioCaptured(false);
        }
    }

    @Override // com.ss.avframework.livestreamv2.core.LiveCore
    public int stopAudioPlayer() {
        this.mWorkThreadHandler.post(new Runnable() {
            /* class com.ss.avframework.livestreamv2.core.LiveCoreImpl.AnonymousClass10 */

            static {
                Covode.recordClassIndex(100100);
            }

            public void run() {
                if (LiveCoreImpl.this.mAudioDeviceModule != null) {
                    int stopPlayer = LiveCoreImpl.this.mAudioDeviceModule.stopPlayer();
                    if (stopPlayer != 0) {
                        if (LiveCoreImpl.this.mErrorListener != null) {
                            LiveCoreImpl.this.mErrorListener.onError(8, stopPlayer, new Exception("ADM stopPlayer error"));
                        }
                    } else if (LiveCoreImpl.this.mInfoListener != null) {
                        LiveCoreImpl.this.mInfoListener.onInfo(19, 0, 0);
                    }
                }
            }
        });
        return 0;
    }

    @Override // com.ss.avframework.livestreamv2.ILiveStream
    public void unregisterScreenAudioPlayBack() {
        if (this.mScreenAudioPlaybackObserver != null) {
            this.mWorkThreadHandler.post(new Runnable() {
                /* class com.ss.avframework.livestreamv2.core.LiveCoreImpl.AnonymousClass6 */

                static {
                    Covode.recordClassIndex(100112);
                }

                public void run() {
                    if (LiveCoreImpl.this.mScreenAudioPlaybackObserver != null) {
                        LiveCoreImpl.this.mScreenAudioPlaybackObserver.release();
                        LiveCoreImpl.this.mScreenAudioPlaybackObserver = null;
                    }
                    LiveCoreImpl.this.mLiveStream.unregisterScreenAudioPlayBack();
                }
            });
        }
    }

    /* access modifiers changed from: package-private */
    public static class LiveCoreRoiSwitch extends LiveStream.RoiSwitch {
        private volatile HashSet<Integer> roiMap = new HashSet<>();

        static {
            Covode.recordClassIndex(100118);
        }

        @Override // com.ss.avframework.livestreamv2.LiveStream.RoiSwitch
        public boolean shouldOpenRoi() {
            if (super.shouldOpenRoi() || !this.roiMap.isEmpty()) {
                return true;
            }
            return false;
        }

        LiveCoreRoiSwitch(LiveStream liveStream) {
            super(liveStream);
        }

        /* access modifiers changed from: package-private */
        public void changeRoiMap(int i2, boolean z) {
            MethodCollector.i(13289);
            synchronized (this.roiMap) {
                if (z) {
                    try {
                        this.roiMap.add(Integer.valueOf(i2));
                    } catch (Throwable th) {
                        MethodCollector.o(13289);
                        throw th;
                    }
                } else {
                    this.roiMap.remove(Integer.valueOf(i2));
                }
            }
            checkRoiSwitch();
            MethodCollector.o(13289);
        }
    }

    private void resetPushLayout() {
        IInputVideoStream originInputVideoStream = getOriginInputVideoStream();
        if (originInputVideoStream != null) {
            originInputVideoStream.setMixerDescription(VideoMixer.VideoMixerDescription.FILL().setMode(2));
        }
    }

    public void cameraFirstNotify() {
        ILiveStream.ILiveStreamInfoListener iLiveStreamInfoListener = this.mInfoListener;
        if (iLiveStreamInfoListener != null) {
            iLiveStreamInfoListener.onInfo(28, getBuilder().getVideoCaptureDevice(), 0);
        }
    }

    @Override // com.ss.avframework.livestreamv2.core.LiveCore
    public IDualGameEngine getDualGameEngine() {
        ILiveStream iLiveStream = this.mLiveStream;
        if (iLiveStream instanceof LiveStream) {
            return ((LiveStream) iLiveStream).getDualGameEngine(this.mLayerControl);
        }
        return null;
    }

    @Override // com.ss.avframework.livestreamv2.core.LiveCore
    public IGameEngine getGameEngine() {
        if (this.mGameEngine == null && this.mLiveStream != null) {
            createGameEngine(getBuilder(), this.mAudioDeviceModule, getVideoFilterMgr());
        }
        return this.mGameEngine;
    }

    /* access modifiers changed from: protected */
    @Override // com.ss.avframework.livestreamv2.core.LiveCore
    public LiveCore.Builder getInternalBuilder() {
        LiveStream liveStream = (LiveStream) this.mLiveStream;
        if (liveStream != null) {
            return (LiveCore.Builder) liveStream.getLiveStreamBuilder();
        }
        AVLog.ioe("LiveCoreImpl", "getInternalBuilder() while LiveStream is null", new AndroidRuntimeException("getInternalBuilder() while LiveStream is null"));
        return new LiveCore.Builder();
    }

    public synchronized Object[] getLiveCoreCallStacks() {
        Object[] array;
        MethodCollector.i(14499);
        array = callStatcks.toArray();
        MethodCollector.o(14499);
        return array;
    }

    @Override // com.ss.avframework.livestreamv2.core.LiveCore
    public boolean getPreviewFitMode() {
        RenderView renderView = this.mRenderView;
        if (renderView != null) {
            return renderView.isFitMode();
        }
        ILayerControlExt iLayerControlExt = this.mLayerControl;
        if (iLayerControlExt != null) {
            return iLayerControlExt.isFitMode();
        }
        return false;
    }

    @Override // com.ss.avframework.livestreamv2.ILiveStream
    public void stop() {
        ILiveStream iLiveStream = this.mLiveStream;
        if (iLiveStream != null) {
            iLiveStream.stop();
            this.mInteractEngineBuilder.setStatusLiveStreamIsPushed(false);
        }
        stopReportNetworkQuality();
    }

    /* access modifiers changed from: package-private */
    public final /* synthetic */ void lambda$startReportNetworkQuality$1$LiveCoreImpl() {
        if (this.mInteractEngine != null && !this.isInteracting) {
            LiveStreamReport liveStreamReport = new LiveStreamReport();
            getLiveStreamInfo(liveStreamReport);
            int videoFps = getBuilder().getVideoFps();
            int videoTransportRealFps = (int) liveStreamReport.getVideoTransportRealFps();
            int i2 = 3;
            int i3 = (videoFps * 2) / 3;
            if (videoTransportRealFps > i3) {
                i2 = 1;
            } else if (i3 >= videoTransportRealFps && videoTransportRealFps > videoFps / 3) {
                i2 = 2;
            }
            ILiveStream.ILiveStreamInfoListener iLiveStreamInfoListener = this.mInfoListener;
            if (iLiveStreamInfoListener != null) {
                iLiveStreamInfoListener.onInfo(101, 1, i2);
            }
            liveStreamReport.release();
        }
    }

    @Override // com.ss.avframework.livestreamv2.ILiveStream
    public void pause() {
        AVLog.ioi("LiveCoreImpl", "begin pause");
        this.mIsPause = true;
        ILiveStream iLiveStream = this.mLiveStream;
        if (iLiveStream != null) {
            iLiveStream.pause();
        }
        LiveCore.ILiveForInteractListener iLiveForInteractListener = this.mInteractEngineListener;
        if (iLiveForInteractListener != null) {
            iLiveForInteractListener.onPause();
        }
        ILayerControlExt iLayerControlExt = this.mLayerControl;
        if (iLayerControlExt != null) {
            iLayerControlExt.pause();
        }
        AVLog.ioi("LiveCoreImpl", "end pause");
    }

    @Override // com.ss.avframework.livestreamv2.ILiveStream
    public void resume() {
        AVLog.ioi("LiveCoreImpl", "begin resume");
        this.mIsPause = false;
        ILiveStream iLiveStream = this.mLiveStream;
        if (iLiveStream != null) {
            iLiveStream.resume();
        }
        LiveCore.ILiveForInteractListener iLiveForInteractListener = this.mInteractEngineListener;
        if (iLiveForInteractListener != null) {
            iLiveForInteractListener.onResume();
        }
        ILayerControlExt iLayerControlExt = this.mLayerControl;
        if (iLayerControlExt != null) {
            iLayerControlExt.resume();
        }
        AVLog.ioi("LiveCoreImpl", "end resume");
    }

    private void configCameraLayer() {
        String uuid = MiscUtils.getUUID("cam");
        ILayerControlExt.ILayerExt createLayerExt = this.mLayerControl.createLayerExt(uuid, null, getBuilder().getVideoCaptureWidth(), getBuilder().getVideoCaptureHeight(), 2);
        this.mLayerControl.setLocalOrigin(uuid);
        VideoMixer.VideoMixerDescription FILL = VideoMixer.VideoMixerDescription.FILL();
        FILL.setMode(2);
        createLayerExt.updateDescription(FILL);
        createLayerExt.setEnable(true);
        this.mCameraStreamLayer = createLayerExt;
        AnonymousClass17 r1 = new VideoSink() {
            /* class com.ss.avframework.livestreamv2.core.LiveCoreImpl.AnonymousClass17 */

            static {
                Covode.recordClassIndex(100107);
            }

            @Override // com.ss.avframework.engine.VideoSink
            public void OnDiscardedFrame() {
            }

            @Override // com.ss.avframework.engine.VideoSink
            public void onFrame(VideoFrame videoFrame) {
                if (LiveCoreImpl.this.mCameraFirstReport) {
                    LiveCoreImpl.this.cameraFirstNotify();
                    LiveCoreImpl.this.mCameraFirstReport = false;
                }
                if (LiveCoreImpl.this.mLiveStream != null) {
                    ((LiveStream) LiveCoreImpl.this.mLiveStream).captureFirstFrameNotify();
                }
                ILayerControlExt.ILayerExt iLayerExt = LiveCoreImpl.this.mCameraStreamLayer;
                if (iLayerExt != null) {
                    iLayerExt.renderFrame(videoFrame);
                }
                if (LiveCoreImpl.this.mGameVideoConsumer != null) {
                    LiveCoreImpl.this.mGameVideoConsumer.onVideoFrame(0, videoFrame, 2);
                }
            }
        };
        this.mCameraVideoSink = r1;
        this.mLiveStream.setRenderSink(r1);
    }

    @Override // com.ss.avframework.livestreamv2.core.LiveCore
    public IAVPlayer createPlayer() {
        try {
            return (IAVPlayer) Class.forName("com.ss.avframework.livestreamv2.player.AVPlayer").getConstructor(IAudioDeviceControl.class, Integer.TYPE, Integer.TYPE).newInstance(this.mAudioDeviceControl, Integer.valueOf(getBuilder().getAudioSampleHZ()), Integer.valueOf(getBuilder().getAudioChannel()));
        } catch (Exception e2) {
            AVLog.ioe("LiveCoreImpl", "Not found AVPlayer", e2);
            return null;
        }
    }

    @Override // com.ss.avframework.livestreamv2.ILiveStream
    public synchronized void release() {
        Looper looper;
        Thread thread;
        ILiveStream iLiveStream;
        MethodCollector.i(14152);
        AVLog.ioi("LiveCoreImpl", "begin release ".concat(String.valueOf(this)));
        postLiveCoreLog(false);
        unregisterScreenAudioPlayBack();
        this.mDisplayView = null;
        LiveCore.ILiveForInteractListener iLiveForInteractListener = this.mInteractEngineListener;
        if (iLiveForInteractListener != null) {
            iLiveForInteractListener.onDispose();
        }
        ILiveStream iLiveStream2 = this.mLiveStream;
        if (iLiveStream2 != null) {
            iLiveStream2.setAudioFrameAvailableListener(null);
            this.mLiveStream.setTextureFrameAvailableListener(null);
            this.mLiveStream.setRenderSink(null);
            IFilterManager videoFilterMgr = this.mLiveStream.getVideoFilterMgr();
            if (videoFilterMgr != null) {
                videoFilterMgr.setFindContourListener(null);
            }
        }
        synchronized (this.mTextureFrameListenersFence) {
            try {
                this.mTextureFrameListeners.clear();
            } finally {
                MethodCollector.o(14152);
            }
        }
        synchronized (this.mAudioFrameListenersFence) {
            try {
                this.mAudioFrameListeners.clear();
            } finally {
                MethodCollector.o(14152);
            }
        }
        stopAudioCapture();
        stopVideoCapture();
        stopAudioPlayer();
        if (!(this.mRenderView == null || (iLiveStream = this.mLiveStream) == null)) {
            iLiveStream.setRenderSink(null);
        }
        IGameEngineExt iGameEngineExt = this.mGameEngine;
        if (iGameEngineExt != null) {
            this.mGameVideoConsumer = null;
            iGameEngineExt.release();
        }
        stop();
        ILiveStream iLiveStream3 = this.mLiveStream;
        if (iLiveStream3 != null) {
            iLiveStream3.release();
        }
        RenderView renderView = this.mRenderView;
        if (renderView != null) {
            renderView.release();
            this.mRenderView = null;
        }
        this.mWorkThreadHandler.post(new Runnable() {
            /* class com.ss.avframework.livestreamv2.core.LiveCoreImpl.AnonymousClass3 */

            static {
                Covode.recordClassIndex(100109);
            }

            public void run() {
                LiveCoreImpl.this.mAudioDeviceModule.stopPlayer();
                LiveCoreImpl.this.mAudioDeviceModule.stopRecording();
                LiveCoreImpl.this.mAudioDeviceModule.release();
            }
        });
        final Object obj = new Object();
        final boolean[] zArr = {true};
        synchronized (obj) {
            try {
                this.mWorkThreadHandler.post(new Runnable() {
                    /* class com.ss.avframework.livestreamv2.core.LiveCoreImpl.AnonymousClass4 */

                    static {
                        Covode.recordClassIndex(100110);
                    }

                    public void run() {
                        MethodCollector.i(13376);
                        synchronized (obj) {
                            try {
                                zArr[0] = false;
                                obj.notifyAll();
                            } finally {
                                MethodCollector.o(13376);
                            }
                        }
                    }
                });
                try {
                    obj.wait(500);
                    if (!(!zArr[0] || (looper = this.mWorkThreadHandler.getLooper()) == null || (thread = looper.getThread()) == null)) {
                        LiveStream.dumpJavaThreadStackIfNeed(thread, "LiveCoreImpl");
                    }
                } catch (InterruptedException unused) {
                }
            } finally {
                MethodCollector.o(14152);
            }
        }
        SafeHandlerThread safeHandlerThread = this.mWorkThread;
        if (safeHandlerThread != null) {
            SafeHandlerThreadPoolExecutor.unlockThread(safeHandlerThread);
            this.mWorkThread = null;
        }
        GLThread gLThread = this.mVideoCaptureThread;
        if (gLThread != null) {
            SafeHandlerThreadPoolExecutor.unlockThread(gLThread);
            this.mVideoCaptureThread = null;
        }
        SafeHandlerThread safeHandlerThread2 = this.mLogUploadThread;
        if (safeHandlerThread2 != null) {
            SafeHandlerThreadPoolExecutor.unlockThread(safeHandlerThread2);
            this.mLogUploadThread = null;
        }
        IAudioDeviceControl iAudioDeviceControl = this.mAudioDeviceControl;
        if (iAudioDeviceControl != null) {
            ((AudioDeviceControl) iAudioDeviceControl).release();
            this.mAudioDeviceControl = null;
        }
        ILayerControlExt iLayerControlExt = this.mLayerControl;
        if (iLayerControlExt != null) {
            ((LayerControl) iLayerControlExt).release();
            this.mLayerControl = null;
        }
        VideoSink videoSink = this.mCameraVideoSink;
        if (videoSink != null) {
            videoSink.release();
            this.mCameraVideoSink = null;
        }
        this.mWorkThread = null;
        this.mVideoCaptureThread = null;
        this.mLogUploadThread = null;
        this.mInfoListener = null;
        this.mErrorListener = null;
        this.mRtcExtraDataListener = null;
        this.mLiveStream = null;
        this.mWarningListener = null;
        this.mGameEngine = null;
        if (!this.mEnableAutoGlRecycler) {
            GLThreadManager.dispose();
        }
        synchronized (callStatcks) {
            try {
                String str = this.currentCallStack;
                if (str != null) {
                    callStatcks.remove(str);
                    this.currentCallStack = null;
                }
                Iterator<String> it = callStatcks.iterator();
                while (it.hasNext()) {
                    AVLog.ioi("LiveCoreImpl", "current remain livecores:".concat(String.valueOf(it.next())));
                }
            } catch (Throwable th) {
                throw th;
            }
        }
        AVLog.ioi("LiveCoreImpl", "end release " + this + ": " + callStatcks.size());
        MethodCollector.o(14152);
    }

    @Override // com.ss.avframework.livestreamv2.core.LiveCore
    public void registerInteractListener(LiveCore.ILiveForInteractListener iLiveForInteractListener) {
        this.mInteractEngineListener = iLiveForInteractListener;
    }

    @Override // com.ss.avframework.livestreamv2.core.LiveCore
    public void setInteractStatus(boolean z) {
        this.isInteracting = z;
    }

    @Override // com.ss.avframework.livestreamv2.core.LiveCore
    public void setMixStreamType(Config.MixStreamType mixStreamType) {
        this.mMixStreamType = mixStreamType;
    }

    @Override // com.ss.avframework.livestreamv2.ILiveStream
    public void setRadioModeBgBitmap(Bitmap bitmap) {
        setBackGroundPhotoPath(bitmap);
    }

    @Override // com.ss.avframework.livestreamv2.core.LiveCore
    public void setRtcExtraDataListener(LiveCore.RtcExtraDataListener rtcExtraDataListener) {
        this.mRtcExtraDataListener = rtcExtraDataListener;
    }

    @Override // com.ss.avframework.livestreamv2.ILiveStream
    public void sendSdkControlMsg(String str) {
        ILiveStream iLiveStream = this.mLiveStream;
        if (iLiveStream != null) {
            iLiveStream.sendSdkControlMsg(str);
        }
    }

    @Override // com.ss.avframework.livestreamv2.ILiveStream
    public void setAudioMute(boolean z) {
        ILiveStream iLiveStream = this.mLiveStream;
        if (iLiveStream != null) {
            iLiveStream.setAudioMute(z);
        }
    }

    @Override // com.ss.avframework.livestreamv2.ILiveStream
    public void setAudioRecordPath(String str) {
        ILiveStream iLiveStream = this.mLiveStream;
        if (iLiveStream != null) {
            iLiveStream.setAudioRecordPath(str);
        }
    }

    @Override // com.ss.avframework.livestreamv2.ILiveStream
    public void setAudioScenario(int i2) {
        ILiveStream iLiveStream = this.mLiveStream;
        if (iLiveStream != null) {
            iLiveStream.setAudioScenario(i2);
        }
    }

    @Override // com.ss.avframework.livestreamv2.ILiveStream
    public void setBackGroundPhotoPath(Bitmap bitmap) {
        ILiveStream iLiveStream = this.mLiveStream;
        if (iLiveStream != null) {
            iLiveStream.setBackGroundPhotoPath(bitmap);
        }
    }

    @Override // com.ss.avframework.livestreamv2.ILiveStream
    public void setDataListener(ILiveStream.ILiveStreamDataListener iLiveStreamDataListener) {
        ILiveStream iLiveStream = this.mLiveStream;
        if (iLiveStream != null) {
            iLiveStream.setDataListener(iLiveStreamDataListener);
        }
    }

    @Override // com.ss.avframework.livestreamv2.core.LiveCore
    public void setDisplay(View view) {
        setDisplay(view, 0);
    }

    @Override // com.ss.avframework.livestreamv2.ILiveStream
    public void setDns(e eVar) {
        ILiveStream iLiveStream = this.mLiveStream;
        if (iLiveStream != null) {
            iLiveStream.setDns(eVar);
        }
    }

    @Override // com.ss.avframework.livestreamv2.ILiveStream
    public void setOption(LiveStreamOption liveStreamOption) {
        ILiveStream iLiveStream = this.mLiveStream;
        if (iLiveStream != null) {
            iLiveStream.setOption(liveStreamOption);
        }
    }

    @Override // com.ss.avframework.livestreamv2.ILiveStream
    public void setOriginVideoTrack(String str) {
        ILiveStream iLiveStream = this.mLiveStream;
        if (iLiveStream != null) {
            iLiveStream.setOriginVideoTrack(str);
        }
    }

    @Override // com.ss.avframework.livestreamv2.ILiveStream, com.ss.avframework.livestreamv2.core.LiveCore
    public void setRenderSink(VideoSink videoSink) {
        ILiveStream iLiveStream = this.mLiveStream;
        if (iLiveStream != null) {
            iLiveStream.setRenderSink(videoSink);
        }
    }

    @Override // com.ss.avframework.livestreamv2.ILiveStream
    public void setScreenIntent(Intent intent) {
        ILiveStream iLiveStream = this.mLiveStream;
        if (iLiveStream != null) {
            iLiveStream.setScreenIntent(intent);
        }
    }

    @Override // com.ss.avframework.livestreamv2.ILiveStream
    public void setSeiCurrentShiftDiffTime(long j2) {
        ILiveStream iLiveStream = this.mLiveStream;
        if (iLiveStream != null) {
            iLiveStream.setSeiCurrentShiftDiffTime(j2);
        }
    }

    @Override // com.ss.avframework.livestreamv2.ILiveStream
    public void setTimeInterval(int i2) {
        ILiveStream iLiveStream = this.mLiveStream;
        if (iLiveStream != null) {
            iLiveStream.setTimeInterval(i2);
        }
    }

    @Override // com.ss.avframework.livestreamv2.core.LiveCore
    public void startInternal(List<String> list) {
        ILiveStream iLiveStream = this.mLiveStream;
        if (iLiveStream != null) {
            iLiveStream.start(list);
        }
    }

    @Override // com.ss.avframework.livestreamv2.ILiveStream
    public void switchAudioCapture(int i2) {
        ILiveStream iLiveStream = this.mLiveStream;
        if (iLiveStream != null) {
            iLiveStream.switchAudioCapture(i2);
        }
    }

    @Override // com.ss.avframework.livestreamv2.ILiveStream
    public void switchAudioMode(int i2) {
        ILiveStream iLiveStream = this.mLiveStream;
        if (iLiveStream != null) {
            iLiveStream.switchAudioMode(i2);
        }
    }

    @Override // com.ss.avframework.livestreamv2.ILiveStream
    public void updateSdkParams(TEBundle tEBundle) {
        ILiveStream iLiveStream = this.mLiveStream;
        if (iLiveStream != null) {
            iLiveStream.updateSdkParams(tEBundle);
        }
    }

    @Override // com.ss.avframework.livestreamv2.ILiveStream
    public boolean getAdaptedVideoResolution(int[] iArr) {
        ILiveStream iLiveStream = this.mLiveStream;
        if (iLiveStream != null) {
            return iLiveStream.getAdaptedVideoResolution(iArr);
        }
        return false;
    }

    @Override // com.ss.avframework.livestreamv2.ILiveStream
    public boolean isEnableMixer(boolean z) {
        ILiveStream iLiveStream = this.mLiveStream;
        if (iLiveStream == null || !iLiveStream.isEnableMixer(z)) {
            return false;
        }
        return true;
    }

    @Override // com.ss.avframework.livestreamv2.ILiveStream
    public boolean isMirror(boolean z) {
        ILiveStream iLiveStream = this.mLiveStream;
        if (iLiveStream == null || !iLiveStream.isMirror(z)) {
            return false;
        }
        return true;
    }

    /* access modifiers changed from: package-private */
    public final /* synthetic */ void lambda$getLiveStreamInfo$2$LiveCoreImpl(LiveStreamReport liveStreamReport) {
        AudioDeviceModule audioDeviceModule = this.mAudioDeviceModule;
        if (audioDeviceModule != null) {
            liveStreamReport.setADMMicVolumedB((int) audioDeviceModule.getMicVolumedB());
        }
    }

    @Override // com.ss.avframework.livestreamv2.ILiveStream
    public int sendSeiMsg(String str) {
        ILiveStream iLiveStream = this.mLiveStream;
        if (iLiveStream == null) {
            return 0;
        }
        return iLiveStream.sendSeiMsg(str);
    }

    @Override // com.ss.avframework.livestreamv2.ILiveStream
    public void setBackGroundPhotoPath(String str) {
        ILiveStream iLiveStream = this.mLiveStream;
        if (iLiveStream != null) {
            iLiveStream.setBackGroundPhotoPath(str);
        }
    }

    @Override // com.ss.avframework.livestreamv2.core.LiveCore
    public void setDisplayPlanarRender(final boolean z) {
        this.mWorkThread.post(new Runnable() {
            /* class com.ss.avframework.livestreamv2.core.LiveCoreImpl.AnonymousClass15 */

            static {
                Covode.recordClassIndex(100105);
            }

            public void run() {
                AVLog.logKibana(4, "LiveCoreImpl", "setDisplayPlanarRender:" + z, null);
                VideoMixer videoMixer = LiveCoreImpl.this.mLayerControl.getVideoMixer();
                if (videoMixer != null) {
                    TEBundle tEBundle = new TEBundle();
                    videoMixer.getParameter(tEBundle);
                    tEBundle.setBool("vmixer_planar_render", z);
                    videoMixer.setParameter(tEBundle);
                    tEBundle.release();
                }
            }
        });
    }

    @Override // com.ss.avframework.livestreamv2.ILiveStream
    public void setErrorListener(ILiveStream.ILiveStreamErrorListener iLiveStreamErrorListener) {
        this.mErrorListener = iLiveStreamErrorListener;
        ILiveStream iLiveStream = this.mLiveStream;
        if (iLiveStream != null) {
            iLiveStream.setErrorListener(new ILiveStream.ILiveStreamErrorListener() {
                /* class com.ss.avframework.livestreamv2.core.LiveCoreImpl.AnonymousClass8 */

                static {
                    Covode.recordClassIndex(100114);
                }

                @Override // com.ss.avframework.livestreamv2.ILiveStream.ILiveStreamErrorListener
                public void onError(int i2, int i3, Exception exc) {
                    LiveStreamLogService liveStreamLogService = LiveCoreImpl.this.mLiveStreamLogService;
                    if (liveStreamLogService != null) {
                        liveStreamLogService.extError(i2, i3, exc);
                    }
                    ILiveStream.ILiveStreamErrorListener iLiveStreamErrorListener = LiveCoreImpl.this.mErrorListener;
                    if (iLiveStreamErrorListener != null) {
                        iLiveStreamErrorListener.onError(i2, i3, exc);
                    }
                }
            });
        }
    }

    @Override // com.ss.avframework.livestreamv2.ILiveStream
    public void setInfoListener(final ILiveStream.ILiveStreamInfoListener iLiveStreamInfoListener) {
        AnonymousClass7 r1 = new ILiveStream.ILiveStreamInfoListener() {
            /* class com.ss.avframework.livestreamv2.core.LiveCoreImpl.AnonymousClass7 */

            static {
                Covode.recordClassIndex(100113);
            }

            @Override // com.ss.avframework.livestreamv2.ILiveStream.ILiveStreamInfoListener
            public void onInfo(int i2, int i3, int i4) {
                if ((i2 == 2 || i2 == 15) && LiveCoreImpl.this.mInteractEngineListener != null) {
                    LiveCoreImpl.this.mInteractEngineListener.stopInteract();
                }
                ILiveStream.ILiveStreamInfoListener iLiveStreamInfoListener = iLiveStreamInfoListener;
                if (iLiveStreamInfoListener != null) {
                    iLiveStreamInfoListener.onInfo(i2, i3, i4);
                }
            }
        };
        this.mInfoListener = r1;
        ILiveStream iLiveStream = this.mLiveStream;
        if (iLiveStream != null) {
            iLiveStream.setInfoListener(r1);
        }
    }

    @Override // com.ss.avframework.livestreamv2.ILiveStream
    public void setLowPowerLevel(final int i2) {
        this.mWorkThreadHandler.post(new Runnable() {
            /* class com.ss.avframework.livestreamv2.core.LiveCoreImpl.AnonymousClass13 */

            static {
                Covode.recordClassIndex(100103);
            }

            public void run() {
                if (LiveCoreImpl.this.mLiveStream != null) {
                    LiveCoreImpl.this.mLiveStream.setLowPowerLevel(i2);
                }
            }
        });
    }

    @Override // com.ss.avframework.livestreamv2.core.LiveCore
    public void setPreviewFitMode(boolean z) {
        RenderView renderView = this.mRenderView;
        if (renderView != null) {
            renderView.setFitMode(z);
            return;
        }
        ILayerControlExt iLayerControlExt = this.mLayerControl;
        if (iLayerControlExt != null) {
            iLayerControlExt.setFitMode(z);
        }
    }

    @Override // com.ss.avframework.livestreamv2.ILiveStream
    public void setPublishPlanarRender(final boolean z) {
        this.mWorkThread.post(new Runnable() {
            /* class com.ss.avframework.livestreamv2.core.LiveCoreImpl.AnonymousClass16 */

            static {
                Covode.recordClassIndex(100106);
            }

            public void run() {
                if (LiveCoreImpl.this.mLiveStream != null) {
                    LiveCoreImpl.this.mLiveStream.setPublishPlanarRender(z);
                }
            }
        });
    }

    @Override // com.ss.avframework.livestreamv2.ILiveStream
    public void unRegisterAudioRecordingCallback(AudioManager.AudioRecordingCallback audioRecordingCallback) {
        ILiveStream iLiveStream = this.mLiveStream;
        if (iLiveStream != null && audioRecordingCallback != null) {
            iLiveStream.unRegisterAudioRecordingCallback(audioRecordingCallback);
        }
    }

    private void setEffectLogCallback(final LiveCore.Builder builder) {
        ILiveStream iLiveStream = this.mLiveStream;
        if (iLiveStream != null) {
            IFilterManager videoFilterMgr = iLiveStream.getVideoFilterMgr();
            if (videoFilterMgr instanceof FilterManager) {
                ((FilterManager) videoFilterMgr).setEffectLogUploader(new FilterManager.IEffectLogUploader() {
                    /* class com.ss.avframework.livestreamv2.core.LiveCoreImpl.AnonymousClass2 */

                    static {
                        Covode.recordClassIndex(100108);
                    }

                    @Override // com.ss.avframework.livestreamv2.filter.FilterManager.IEffectLogUploader
                    public void upload(String str, JSONObject jSONObject) {
                        builder.getLogMonitor().onLogMonitor(str, jSONObject);
                    }
                });
            }
        }
    }

    @Override // com.ss.avframework.livestreamv2.core.LiveCore
    public void addAudioFrameAvailableListener(ILiveStream.IAudioFrameAvailableListener iAudioFrameAvailableListener) {
        MethodCollector.i(14518);
        synchronized (this.mAudioFrameListenersFence) {
            try {
                if (!this.mAudioFrameListeners.contains(iAudioFrameAvailableListener)) {
                    this.mAudioFrameListeners.add(iAudioFrameAvailableListener);
                }
            } finally {
                MethodCollector.o(14518);
            }
        }
    }

    @Override // com.ss.avframework.livestreamv2.ILiveStream
    public void changeVideoFps(int i2) {
        if (this.mLiveStream != null) {
            AVLog.logKibana(5, "LiveCoreImpl", "changeVideoFps to fps:".concat(String.valueOf(i2)), null);
            this.mLiveStream.changeVideoFps(i2);
        }
    }

    @Override // com.ss.avframework.livestreamv2.core.LiveCore
    public boolean getPreviewMirror(boolean z) {
        RenderView renderView = this.mRenderView;
        if (renderView != null) {
            return renderView.isMirror(z);
        }
        ILayerControlExt iLayerControlExt = this.mLayerControl;
        if (iLayerControlExt != null) {
            return iLayerControlExt.isMirror(z);
        }
        return false;
    }

    @Override // com.ss.avframework.livestreamv2.core.LiveCore
    public void removeAudioFrameAvailableListener(ILiveStream.IAudioFrameAvailableListener iAudioFrameAvailableListener) {
        MethodCollector.i(14519);
        synchronized (this.mAudioFrameListenersFence) {
            try {
                this.mAudioFrameListeners.remove(iAudioFrameAvailableListener);
            } finally {
                MethodCollector.o(14519);
            }
        }
    }

    @Override // com.ss.avframework.livestreamv2.core.LiveCore
    public void startAudioCapture(Object obj) {
        PrivacyCertManager.getInstance().saveCert(1, obj, "LiveCoreImpl.startAudioCapture");
        startAudioCapture();
        PrivacyCertManager.getInstance().popCert(1);
    }

    @Override // com.ss.avframework.livestreamv2.core.LiveCore
    public void startVideoCapture(Object obj) {
        PrivacyCertManager.getInstance().saveCert(0, obj, "LiveCoreImpl.startVideoCapture");
        startVideoCapture();
        PrivacyCertManager.getInstance().popCert(0);
    }

    @Override // com.ss.avframework.livestreamv2.core.LiveCore
    public void stopAudioCapture(Object obj) {
        PrivacyCertManager.getInstance().saveCert(1, obj, "LiveCoreImpl.stopAudioCapture");
        stopAudioCapture();
        PrivacyCertManager.getInstance().popCert(1);
    }

    @Override // com.ss.avframework.livestreamv2.core.LiveCore
    public void stopVideoCapture(Object obj) {
        PrivacyCertManager.getInstance().saveCert(0, obj, "LiveCoreImpl.stopVideoCapture");
        stopVideoCapture();
        PrivacyCertManager.getInstance().popCert(0);
    }

    @Override // com.ss.avframework.livestreamv2.ILiveStream
    public void switchVideoCapture(int i2) {
        if (this.mIsPause) {
            AVLog.iow("LiveCoreImpl", "can't switchVideoCapture when pause.");
            return;
        }
        ILiveStream iLiveStream = this.mLiveStream;
        if (iLiveStream != null) {
            iLiveStream.switchVideoCapture(i2);
        }
    }

    @Override // com.ss.avframework.livestreamv2.ILiveStream
    public void updateSdkParams(final String str) {
        this.mWorkThreadHandler.post(new Runnable() {
            /* class com.ss.avframework.livestreamv2.core.LiveCoreImpl.AnonymousClass12 */

            static {
                Covode.recordClassIndex(100102);
            }

            public void run() {
                AudioDeviceModule audioDeviceModule = LiveCoreImpl.this.mAudioDeviceModule;
                if (audioDeviceModule != null && audioDeviceModule.getAdmType() == 1) {
                    try {
                        LiveCoreImpl.this.updateByteAudioConfig(new JSONObject(str).getJSONObject("PushBase").getJSONObject("adm_server_cfg"));
                    } catch (JSONException e2) {
                        e2.printStackTrace();
                    }
                }
            }
        });
        ILiveStream iLiveStream = this.mLiveStream;
        if (iLiveStream != null) {
            iLiveStream.updateSdkParams(str);
        }
    }

    private String getContourInfoFromRTC(ByteBuffer byteBuffer) {
        String parseStringFromByteBuffer;
        if (byteBuffer == null || (parseStringFromByteBuffer = EffectWrapper.AlgorithmResult.parseStringFromByteBuffer(0, byteBuffer)) == null) {
            return null;
        }
        try {
            JSONObject jSONObject = new JSONObject(parseStringFromByteBuffer);
            if (jSONObject.has("contour_info")) {
                return jSONObject.getJSONObject("contour_info").toString();
            }
        } catch (Exception e2) {
            e2.printStackTrace();
        }
        return null;
    }

    @Override // com.ss.avframework.livestreamv2.core.LiveCore
    public void addTextureFrameAvailableListener(ILiveStream.ITextureFrameAvailableListener iTextureFrameAvailableListener) {
        IFilterManager videoFilterMgr;
        MethodCollector.i(14516);
        synchronized (this.mTextureFrameListenersFence) {
            if (iTextureFrameAvailableListener != null) {
                try {
                    if (!this.mTextureFrameListeners.contains(iTextureFrameAvailableListener)) {
                        if (this.mTextureFrameListeners.isEmpty() && (videoFilterMgr = getVideoFilterMgr()) != null) {
                            videoFilterMgr.forceOutput2DTex(true);
                        }
                        this.mTextureFrameListeners.add(iTextureFrameAvailableListener);
                    }
                } catch (Throwable th) {
                    MethodCollector.o(14516);
                    throw th;
                }
            }
        }
        MethodCollector.o(14516);
    }

    /* access modifiers changed from: protected */
    public void createLogServer(LiveStreamBuilder liveStreamBuilder) {
        if (this.mLiveStreamLogService == null) {
            LiveStreamLogService liveStreamLogService = new LiveStreamLogService((LiveStream) this.mLiveStream, liveStreamBuilder.getLogUploader(), liveStreamBuilder.getUploadLogInterval(), this, this.mWorkThread, this.mLogUploadThread);
            ((LiveStream) this.mLiveStream).setupLogServer(liveStreamLogService);
            this.mLiveStreamLogService = liveStreamLogService;
        }
    }

    @Override // com.ss.avframework.livestreamv2.core.LiveCore
    public void release(Object obj) {
        PrivacyCertManager.getInstance().saveCert(0, obj, "LiveCoreImpl.release");
        PrivacyCertManager.getInstance().saveCert(1, obj, "LiveCoreImpl.release");
        release();
        PrivacyCertManager.getInstance().popCert(0);
        PrivacyCertManager.getInstance().popCert(1);
    }

    @Override // com.ss.avframework.livestreamv2.core.LiveCore
    public void removeTextureFrameAvailableListener(ILiveStream.ITextureFrameAvailableListener iTextureFrameAvailableListener) {
        IFilterManager videoFilterMgr;
        MethodCollector.i(14517);
        synchronized (this.mTextureFrameListenersFence) {
            if (iTextureFrameAvailableListener != null) {
                try {
                    this.mTextureFrameListeners.remove(iTextureFrameAvailableListener);
                    if (this.mTextureFrameListeners.isEmpty() && (videoFilterMgr = getVideoFilterMgr()) != null) {
                        videoFilterMgr.forceOutput2DTex(false);
                    }
                } catch (Throwable th) {
                    MethodCollector.o(14517);
                    throw th;
                }
            }
        }
        MethodCollector.o(14517);
    }

    @Override // com.ss.avframework.livestreamv2.ILiveStream
    public void start(String str) {
        this.mPushedOnce = true;
        if (this.mInteractEngine == null || !this.isInteracting || this.mMixStreamType != Config.MixStreamType.SERVER_MIX) {
            ILiveStream iLiveStream = this.mLiveStream;
            if (iLiveStream != null) {
                iLiveStream.start(str);
                this.mInteractEngineBuilder.setStatusLiveStreamIsPushed(true);
            }
            startReportNetworkQuality();
        }
    }

    private void initLogFile(Context context) {
        AVLog.initLogFile(context, 10485760);
        AVLog.ioi("LiveCoreImpl", "SDK version: 10.6.1.9-a/release, native SDK version: " + MediaEngineFactory.getVersion());
        AVLog.ioi("LiveCoreImpl", "Android OS: " + Build.VERSION.SDK_INT + "(" + Build.VERSION.RELEASE + ")");
        AVLog.ioi("LiveCoreImpl", "DevicesName: " + Build.MODEL);
    }

    @Override // com.ss.avframework.livestreamv2.ILiveStream
    public boolean getLiveStreamInfo(LiveStreamReport liveStreamReport) {
        Handler handler;
        ILiveStream iLiveStream = this.mLiveStream;
        if (iLiveStream == null) {
            return false;
        }
        boolean liveStreamInfo = iLiveStream.getLiveStreamInfo(liveStreamReport);
        IGameEngineExt iGameEngineExt = this.mGameEngine;
        if (iGameEngineExt != null) {
            liveStreamReport.setMiniGameRenderFps((double) iGameEngineExt.getRenderFps());
        } else {
            ILayerControlExt iLayerControlExt = this.mLayerControl;
            if (iLayerControlExt != null) {
                liveStreamReport.setMiniGameRenderFps((double) iLayerControlExt.getRealRenderFps());
            }
        }
        if (!getBuilder().getPushBase().getLiveStreamInfoSyncGetMicDB) {
            AudioDeviceModule audioDeviceModule = this.mAudioDeviceModule;
            if (audioDeviceModule != null) {
                liveStreamReport.setADMMicVolumedB((int) audioDeviceModule.getMicVolumedB());
            }
        } else if (!(this.mAudioDeviceModule == null || (handler = this.mWorkThreadHandler) == null)) {
            ThreadUtils.invokeAtFrontUninterruptibly(handler, new LiveCoreImpl$$Lambda$2(this, liveStreamReport));
        }
        return liveStreamInfo;
    }

    @Override // com.ss.avframework.livestreamv2.core.LiveCore
    public void pause(Object obj) {
        PrivacyCertManager.getInstance().saveCert(1, obj, "LiveCoreImpl.pause");
        PrivacyCertManager.getInstance().saveCert(0, obj, "LiveCoreImpl.pause");
        pause();
        PrivacyCertManager.getInstance().popCert(0);
        PrivacyCertManager.getInstance().popCert(1);
    }

    @Override // com.ss.avframework.livestreamv2.core.LiveCore
    public void resume(Object obj) {
        PrivacyCertManager.getInstance().saveCert(1, obj, "LiveCoreImpl.resume");
        PrivacyCertManager.getInstance().saveCert(0, obj, "LiveCoreImpl.resume");
        resume();
        PrivacyCertManager.getInstance().popCert(0);
        PrivacyCertManager.getInstance().popCert(1);
    }

    @Override // com.ss.avframework.livestreamv2.ILiveStream
    public void start(List<String> list) {
        this.mPushedOnce = true;
        if (this.mInteractEngine == null || !this.isInteracting || this.mMixStreamType != Config.MixStreamType.SERVER_MIX) {
            ILiveStream iLiveStream = this.mLiveStream;
            if (iLiveStream != null) {
                iLiveStream.start(list);
                this.mInteractEngineBuilder.setStatusLiveStreamIsPushed(true);
            }
            startReportNetworkQuality();
        }
    }

    public void updateByteAudioConfig(JSONObject jSONObject) {
        String str;
        AudioDeviceModule audioDeviceModule = this.mAudioDeviceModule;
        if (audioDeviceModule != null && getBuilder().getPushBase().needUpdateByteAudioConfig) {
            TEBundle parameter = audioDeviceModule.getParameter();
            if (jSONObject != null) {
                str = jSONObject.toString();
            } else {
                str = "";
            }
            parameter.setString("adm_server_cfg", str);
            audioDeviceModule.setParameter(parameter);
            parameter.release();
            AVLog.logKibana(4, "LiveCoreImpl", "updateByteAudioConfig:".concat(String.valueOf(str)), null);
            AVLog.w("LiveCoreImpl", "updateByteAudioConfig:".concat(String.valueOf(str)));
        }
    }

    private void postLiveCoreLog(boolean z) {
        LiveCore.Builder builder = getBuilder();
        if (builder != null) {
            try {
                long currentTimeMillis = System.currentTimeMillis();
                JSONObject put = new JSONObject().put("version", "2.0.0").put("report_version", 5).put("product_line", "live").put("timestamp", currentTimeMillis).put("project_key", builder.mProjectKey);
                if (z) {
                    this.mStartTimeMs = currentTimeMillis;
                    put.put("event_key", "live_core_start");
                } else {
                    put.put("event_key", "live_core_end");
                    long j2 = this.mStartTimeMs;
                    if (j2 != 0) {
                        put.put("push_duration", currentTimeMillis - j2);
                    }
                    if (this.mPushedOnce) {
                        put.put("mode", "push");
                    }
                    LiveStream liveStream = (LiveStream) this.mLiveStream;
                    if (liveStream != null) {
                        put.put("create_encode_count", liveStream.getCreateEncodeCount());
                        put.put("change_video_fps_count", liveStream.getChangeVideoFpsCount());
                        LiveStreamLogService liveStreamLogService = this.mLiveStreamLogService;
                        if (liveStreamLogService != null) {
                            liveStreamLogService.getLiveCoreEndLog(put);
                        }
                    }
                }
                LiveCore.Builder.ILogMonitor logMonitor = builder.getLogMonitor();
                if (logMonitor != null) {
                    logMonitor.onLogMonitor("live_client_monitor_log", put);
                }
            } catch (Exception e2) {
                e2.printStackTrace();
                AVLog.ioe("LiveCoreImpl", "Create live core log error: " + e2.toString());
            }
        }
    }

    @Override // com.ss.avframework.livestreamv2.core.LiveCore
    public Client create(LiveCore.InteractConfig interactConfig) {
        if (interactConfig.getRtcABTestConfig() != null) {
            try {
                JSONObject jSONObject = new JSONObject(interactConfig.getRtcExtInfo());
                jSONObject.put("rtc.ab_label", interactConfig.getRtcABTestConfig());
                interactConfig.setRtcExtInfo(jSONObject.toString());
            } catch (Exception e2) {
                e2.printStackTrace();
            }
        }
        interactConfig.setCreateClientStack(Log.getStackTraceString(new Throwable()));
        if (interactConfig.isAlignTo16() && !getBuilder().isAlignTo16()) {
            interactConfig.setAlignTo16(false);
        }
        InteractEngine interactEngine = this.mInteractEngine;
        LiveStream liveStream = (LiveStream) this.mLiveStream;
        this.mConfig = interactConfig;
        if (interactEngine == null || liveStream == null) {
            return null;
        }
        LiveCore.ILiveForInteractListener iLiveForInteractListener = this.mInteractEngineListener;
        if (iLiveForInteractListener != null) {
            iLiveForInteractListener.updateOriginUrl(liveStream.getOriginUrl());
            this.mInteractEngineListener.updateStreamUrl(liveStream.getLiveStreamUrl());
        }
        this.mInteractEngineBuilder.setOriginUrl(liveStream.getOriginUrl());
        this.mInteractEngineBuilder.setStreamUrl(liveStream.getLiveStreamUrl());
        Client create = interactEngine.create(interactConfig);
        liveStream.setVideoMixBgColor(interactConfig.getBackgroundColorValue());
        return create;
    }

    /* access modifiers changed from: protected */
    public void initInteractClientParams(LiveCore.Builder builder) {
        String replace;
        this.mInteractEngineBuilder = new InteractEngineBuilder();
        if (!TextUtils.isEmpty(builder.getSessionID())) {
            replace = builder.getSessionID();
        } else {
            replace = UUID.randomUUID().toString().replace("-", "");
        }
        this.mInteractEngine = this.mInteractEngineBuilder.setUUID(replace).setLiveCoreBuilder(builder).setLiveCore(this).setStatusLiveStreamIsAudioCaptured(false).setStatusLiveStreamIsPushed(false).setVideoThreadHandler(this.mVideoCaptureHandler).setWorkThreadHandler(this.mWorkThreadHandler).setLogUploadThreadHandler(this.mLogUploadThreadHandler).setRenderOffInFMMode(builder.isRenderOffInFMMode()).setPushStreamSwitchAfterServerMixStream(builder.getPushStreamSwitchAfterServerMixStream()).setPkAudienceSetUpConnectionOptimize(builder.getPkAudienceSetUpConnectionOptimize()).setDumpFrameParams(builder.getDumpFrameParams()).setRtcPushStatics(builder.enableInteractPushFrameStatics()).setRtcOnLoggerMessageLevel(builder.getRtcOnLoggerMessageLevel()).setAdjustStreamResolutionOnInteract(builder.getAdjustStreamResolutionOnInteract()).setEnableSendContourInfoToRtc(builder.isEnableSendContourInfoToRtc()).create();
        ((LiveStream) this.mLiveStream).setStreamUniqueIdentifier(replace);
    }

    /* JADX WARNING: Code restructure failed: missing block: B:29:0x0093, code lost:
        if (r8 == false) goto L_0x0095;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void toggleInteractSatus(boolean r8) {
        /*
        // Method dump skipped, instructions count: 171
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ss.avframework.livestreamv2.core.LiveCoreImpl.toggleInteractSatus(boolean):void");
    }

    protected LiveCoreImpl(LiveCore.Builder builder) {
        boolean z;
        String str;
        boolean z2;
        MethodCollector.i(13839);
        JSONObject jSONObject = null;
        this.mLayerDualGame = null;
        this.mEnableAutoGlRecycler = false;
        this.isInteracting = false;
        if (builder.getContext() != null) {
            initLogFile(builder.getContext());
        }
        AVLog.ioi("LiveCoreImpl", "create livecore ".concat(String.valueOf(this)));
        this.mEnableAutoGlRecycler = builder.getAutoGlRecycler();
        AVLog.iow("LiveCoreImpl", "GLThreadManager using auto recycler " + this.mEnableAutoGlRecycler);
        if (!this.mEnableAutoGlRecycler) {
            AVLog.iow("LiveCoreImpl", "GLThreadManager using auto recycler " + this.mEnableAutoGlRecycler);
            GLThreadManager.addRefWithEnableAutoGlRecycler(this.mEnableAutoGlRecycler);
        }
        synchronized (callStatcks) {
            try {
                String stackTraceString = Log.getStackTraceString(new Throwable());
                this.currentCallStack = stackTraceString;
                callStatcks.add(stackTraceString);
            } catch (Throwable th) {
                MethodCollector.o(13839);
                throw th;
            }
        }
        SafeHandlerThread lockThread = SafeHandlerThreadPoolExecutor.lockThread("LiveCoreWorkThread");
        this.mWorkThread = lockThread;
        lockThread.start();
        this.mWorkThreadHandler = this.mWorkThread.getHandler();
        SafeHandlerThread lockThread2 = SafeHandlerThreadPoolExecutor.lockThread("LiveCoreLogUploadThread");
        this.mLogUploadThread = lockThread2;
        lockThread2.setPriority(1);
        this.mLogUploadThread.start();
        this.mLogUploadThreadHandler = this.mLogUploadThread.getHandler();
        GLThread lockGLThread = SafeHandlerThreadPoolExecutor.lockGLThread("LiveCoreVideoCaptureThread");
        this.mVideoCaptureThread = lockGLThread;
        lockGLThread.start();
        this.mVideoCaptureHandler = this.mVideoCaptureThread.getHandler();
        AudioDeviceModule audioDeviceModule = new AudioDeviceModule(this, builder.getContext(), this.mWorkThreadHandler, builder.getAdmType());
        this.mAudioDeviceModule = audioDeviceModule;
        builder.setAdmType(audioDeviceModule.getAdmType(), builder.getAdmServerCfg());
        audioDeviceModule.enableAecOnHeadSetMode(builder.isEnableAecOnHeadsetMode());
        audioDeviceModule.enableAecAutoSwitch(builder.isEnableAecAutoSwitch());
        if (builder.isEnableAecAutoSwitch()) {
            audioDeviceModule.enableBuiltInAEC(false);
        } else {
            audioDeviceModule.enableBuiltInAEC(true);
        }
        audioDeviceModule.enableEchoMode(false);
        audioDeviceModule.getRenderMixer().setEnable(true);
        TEBundle tEBundle = new TEBundle();
        audioDeviceModule.getRenderMixer().getParameter(tEBundle);
        tEBundle.setBool("adm_render_mix_enable_read_mode", builder.isEnableADMRenderReadMode());
        audioDeviceModule.getRenderMixer().setParameter(tEBundle);
        tEBundle.release();
        audioDeviceModule.setupHeadsetListener();
        TEBundle parameter = audioDeviceModule.getParameter();
        parameter.setInt("audio_sample", builder.getAudioCaptureSampleHZ());
        parameter.setInt("audio_channels", builder.getAudioCaptureChannel());
        parameter.setInt("adm_audio_cap_sample_voip_mode", builder.getAudioCaptureSampleHZOnVoIP());
        parameter.setInt("adm_audio_cap_channel_voip_mode", builder.getAudioCaptureChannelOnVoIP());
        if (builder.usingAecV2Algorithm()) {
            parameter.setInt("adm_enable_agc", builder.usingAudioAgcOnAecV2Mode() ? 1 : 0);
            parameter.setInt("adm_enable_ns", builder.usingAudioRNNoise());
            parameter.setBool("enable_aec_v2", true);
        } else {
            parameter.setDouble("adm_aec_volume_coeff", 2.0d);
        }
        parameter.setDouble("noise_suppress", builder.getNoiseSuppress());
        parameter.setBool("enable_auto_volume", builder.isEnableAutoVolume());
        if (builder.getAudioCaptureDevice() == 5) {
            parameter.setBool("adm_enable_audio_high_quality", builder.isEnableAudioHighQuality());
            parameter.setBool("adm_using_direct_echo", true);
            if (builder.getAudioQuantizeGapPeriod() > 0) {
                parameter.setInt("adm_audio_record_power_gap_ms", builder.getAudioQuantizeGapPeriod());
            }
        }
        StringBuilder sb = new StringBuilder("ADM: Using audio adm as captuer [");
        if (builder.getAudioCaptureDevice() == 5) {
            z = true;
        } else {
            z = false;
        }
        AVLog.iod("LiveCoreImpl", sb.append(z).append("]").toString());
        AVLog.iod("LiveCoreImpl", "ADM: Using audio echo at adm [" + parameter.getBool("adm_using_direct_echo") + "]");
        AVLog.iod("LiveCoreImpl", "ADM: Using audio high quality [" + builder.isEnableAudioHighQuality() + "]");
        AVLog.iod("LiveCoreImpl", "ADM: Using audio AecV2 [" + builder.usingAecV2Algorithm() + " ns " + builder.usingAudioRNNoise() + "]");
        AVLog.iod("LiveCoreImpl", "ADM: audio capture config  " + builder.getAudioCaptureSampleHZOnVoIP() + "HZ@" + builder.getAudioCaptureChannelOnVoIP() + "c on VoIP mode");
        parameter.setInt("adm_audio_player_channel", builder.getAudioChannel());
        parameter.setInt("adm_audio_player_sample", builder.getAudioSampleHZ());
        parameter.setInt("audio_bit_width", builder.getAudioBitwidth());
        parameter.setInt("audio_aec_auto_switch", builder.isEnableAecAutoSwitch() ? 1 : 0);
        JSONObject admServerCfg = builder.getAdmServerCfg();
        if (builder.getAdmType() == 1 && admServerCfg != null) {
            JSONObject optJSONObject = admServerCfg.optJSONObject("engine_BAC");
            if (optJSONObject == null || (jSONObject = optJSONObject.optJSONObject("loudnorm")) == null || !jSONObject.optBoolean("enable")) {
                z2 = false;
            } else {
                z2 = true;
            }
            if (z2 != builder.isEnableAutoVolume()) {
                if (!z2 && optJSONObject != null) {
                    if (jSONObject == null) {
                        try {
                            jSONObject = new JSONObject();
                        } catch (Exception unused) {
                        }
                    }
                    jSONObject.put("enable", true);
                    optJSONObject.put("loudnorm", jSONObject);
                }
                builder.setEnableAutoVolume(true);
            }
            if (builder.getPushBase().settinsByteAudioConfigLevel) {
                parameter.setInt("byteaudio_engine_opt_set_config_level", 1);
            }
        }
        if (admServerCfg != null) {
            str = admServerCfg.toString();
        } else {
            str = "";
        }
        parameter.setString("adm_server_cfg", str);
        parameter.setBool("adm_audio_player_force_media_mode", true);
        if (builder.getAdmApiType(true) != null) {
            parameter.setString("adm_recording_type", builder.getAdmApiType(true));
        }
        if (builder.getAdmApiType(false) != null) {
            parameter.setString("adm_player_type", builder.getAdmApiType(false));
        }
        this.mAudioDeviceModule.setParameter(parameter);
        parameter.release();
        IVideoEffectProcessor videoEffectProcessor = builder.getVideoEffectProcessor();
        if (videoEffectProcessor != null) {
            AVLog.ioi("LiveCoreImpl", "Using extern video effect handler.");
        }
        this.mLiveStream = builder.createLiveStream(this.mWorkThreadHandler, this.mVideoCaptureHandler, this.mAudioDeviceModule, videoEffectProcessor);
        setEffectLogCallback(builder);
        MethodCollector.i(13839);
        createLogServer(builder);
        if (builder.getVideoCaptureDevice() != 3) {
            this.mLiveStream.getVideoFilterMgr().enable(true);
        }
        LiveCoreRoiSwitch liveCoreRoiSwitch = new LiveCoreRoiSwitch((LiveStream) this.mLiveStream);
        this.mRoiSwitch = liveCoreRoiSwitch;
        ((LiveStream) this.mLiveStream).setRoiSwitch(liveCoreRoiSwitch);
        this.mLiveStream.setTextureFrameAvailableListener(this);
        this.mLiveStream.setAudioFrameAvailableListener(this);
        this.mLayerControl = new LayerControl();
        this.mAudioDeviceControl = new AudioDeviceControl(this.mAudioDeviceModule);
        initInteractClientParams(builder);
        enableMixer(true, true);
        enableMixer(false, true);
        postLiveCoreLog(true);
        this.mLiveStream.getVideoFilterMgr().setFindContourListener(new IFilterManager.FindContourListener() {
            /* class com.ss.avframework.livestreamv2.core.LiveCoreImpl.AnonymousClass1 */

            static {
                Covode.recordClassIndex(100099);
            }

            @Override // com.ss.avframework.livestreamv2.filter.IFilterManager.FindContourListener
            public void onSendFindContourSei(ByteBuffer byteBuffer, long j2, int i2) {
                if (i2 == 2) {
                    LiveCoreImpl.this.addSeiFieldWithNs(null, byteBuffer, 1, false, false, 0, j2);
                } else if (i2 == 1) {
                    byte[] bArr = new byte[byteBuffer.remaining()];
                    byteBuffer.get(bArr);
                    byteBuffer.position(0);
                    String bytesToHexString = ZlibCompressUtils.bytesToHexString(bArr);
                    JSONObject jSONObject = new JSONObject();
                    try {
                        jSONObject.put("data", bytesToHexString);
                    } catch (JSONException e2) {
                        e2.printStackTrace();
                    }
                    if (bytesToHexString != null) {
                        LiveCoreImpl.this.addSeiFieldWithNs("contour_info", jSONObject.toString(), 1, false, false, 0, j2);
                    }
                }
            }
        });
        AVLog.ioi("LiveCoreImpl", "create livecore done ".concat(String.valueOf(this)));
        MethodCollector.o(13839);
    }

    class SurfaceTextureSharedHandler extends SurfaceTextureHelper {
        static {
            Covode.recordClassIndex(100119);
        }

        @Override // com.ss.avframework.buffer.SurfaceTextureHelper
        public void handlerExit() {
        }

        public SurfaceTextureSharedHandler(Handler handler) {
            super(handler);
        }
    }

    private void needSaveSei(String str, Object obj) {
        LiveCore.ILiveForInteractListener iLiveForInteractListener = this.mInteractEngineListener;
        if (iLiveForInteractListener != null) {
            iLiveForInteractListener.updateSei(str, obj);
        }
    }

    @Override // com.ss.avframework.livestreamv2.ILiveStream
    public void adaptedVideoResolution(int i2, int i3) {
        adaptedVideoResolution(i2, i3, 0);
    }

    @Override // com.ss.avframework.livestreamv2.ILiveStream
    public void catchMediaData(Bundle bundle, ILiveStream.CatchMediaDataCallback catchMediaDataCallback) {
        ILiveStream iLiveStream = this.mLiveStream;
        if (iLiveStream != null) {
            iLiveStream.catchMediaData(bundle, catchMediaDataCallback);
        }
    }

    @Override // com.ss.avframework.livestreamv2.ILiveStream
    public void catchVideo(Bundle bundle, ILiveStream.CatchVideoCallback catchVideoCallback) {
        ILiveStream iLiveStream = this.mLiveStream;
        if (iLiveStream != null) {
            iLiveStream.catchVideo(bundle, catchVideoCallback);
        }
    }

    @Override // com.ss.avframework.livestreamv2.ILiveStream
    public void enableMirror(boolean z, boolean z2) {
        ILiveStream iLiveStream = this.mLiveStream;
        if (iLiveStream != null) {
            iLiveStream.enableMirror(z, z2);
        }
    }

    @Override // com.ss.avframework.livestreamv2.ILiveStream
    public void enableMixer(boolean z, boolean z2) {
        ILiveStream iLiveStream = this.mLiveStream;
        if (iLiveStream != null) {
            iLiveStream.enableMixer(z, z2);
        }
    }

    @Override // com.ss.avframework.livestreamv2.ILiveStream
    public void catchMediaData(Bundle bundle, ILiveStream.CatchPicCallback catchPicCallback) {
        ILiveStream iLiveStream = this.mLiveStream;
        if (iLiveStream != null) {
            iLiveStream.catchMediaData(bundle, catchPicCallback);
        }
    }

    @Override // com.ss.avframework.livestreamv2.core.LiveCore
    public void changeToKTVMode(boolean z, IKaraokeMovie iKaraokeMovie) {
        ILiveStream iLiveStream = this.mLiveStream;
        if (iLiveStream != null) {
            ((LiveStream) iLiveStream).changeToKTVMode(z, iKaraokeMovie);
        }
    }

    @Override // com.ss.avframework.livestreamv2.core.LiveCore
    public MediaTrack createTrack(MediaSource mediaSource, String str) {
        LiveStream liveStream = (LiveStream) this.mLiveStream;
        if (liveStream != null) {
            return liveStream.createTrack(mediaSource, str);
        }
        return null;
    }

    @Override // com.ss.avframework.livestreamv2.ILiveStream
    public void registerAudioRecordingCallback(Executor executor, AudioManager.AudioRecordingCallback audioRecordingCallback) {
        ILiveStream iLiveStream = this.mLiveStream;
        if (iLiveStream != null && audioRecordingCallback != null) {
            iLiveStream.registerAudioRecordingCallback(executor, audioRecordingCallback);
        }
    }

    @Override // com.ss.avframework.livestreamv2.ILiveStream
    public void registerScreenAudioPlayBack(final AudioRecordThread.IAudioRecordThreadObserver iAudioRecordThreadObserver, final int i2) {
        this.mWorkThreadHandler.post(new Runnable() {
            /* class com.ss.avframework.livestreamv2.core.LiveCoreImpl.AnonymousClass5 */

            static {
                Covode.recordClassIndex(100111);
            }

            public void run() {
                if (LiveCoreImpl.this.mLiveStream != null) {
                    if (LiveCoreImpl.this.mScreenAudioPlaybackObserver != null) {
                        LiveCoreImpl.this.mScreenAudioPlaybackObserver.release();
                        LiveCoreImpl.this.mScreenAudioPlaybackObserver = null;
                    }
                    if (i2 == 1) {
                        LiveCoreImpl.this.mScreenAudioPlaybackObserver = new ScreenAudioPlaybackObserver(LiveCoreImpl.this.createInputAudioStream(), iAudioRecordThreadObserver);
                    }
                    LiveCoreImpl.this.mLiveStream.registerScreenAudioPlayBack(LiveCoreImpl.this.mScreenAudioPlaybackObserver, i2);
                }
            }
        });
    }

    @Override // com.ss.avframework.livestreamv2.core.LiveCore
    public void setPreviewMirror(boolean z, boolean z2) {
        RenderView renderView = this.mRenderView;
        if (renderView != null) {
            renderView.setMirror(z, z2);
            return;
        }
        ILayerControlExt iLayerControlExt = this.mLayerControl;
        if (iLayerControlExt != null) {
            iLayerControlExt.setMirror(z, z2);
        }
    }

    public void processSEI(String str, ByteBuffer byteBuffer) {
        String parseStringFromByteBuffer;
        LiveCore.RtcExtraDataListener rtcExtraDataListener = this.mRtcExtraDataListener;
        if (rtcExtraDataListener != null && byteBuffer != null && (parseStringFromByteBuffer = EffectWrapper.AlgorithmResult.parseStringFromByteBuffer(0, byteBuffer)) != null) {
            rtcExtraDataListener.onRtcData(str, parseStringFromByteBuffer);
        }
    }

    @Override // com.ss.avframework.livestreamv2.core.LiveCore
    public void setAudioMute(boolean z, Object obj) {
        PrivacyCertManager.getInstance().saveCert(1, obj, "LiveCoreImpl.setAudioMute");
        setAudioMute(z);
        PrivacyCertManager.getInstance().popCert(1);
    }

    @Override // com.ss.avframework.livestreamv2.core.LiveCore
    public void switchAudioCapture(int i2, Object obj) {
        PrivacyCertManager.getInstance().saveCert(1, obj, "LiveCoreImpl.switchAudioCapture");
        switchAudioCapture(i2);
        PrivacyCertManager.getInstance().popCert(1);
    }

    @Override // com.ss.avframework.livestreamv2.ILiveStream
    public void changeVideoResolution(int i2, int i3) {
        if (this.mLiveStream != null) {
            AVLog.logKibana(5, "LiveCoreImpl", "changeVideoResolution to width:" + i2 + ",height:" + i3, null);
            this.mLiveStream.changeVideoResolution(i2, i3);
        }
    }

    @Override // com.ss.avframework.livestreamv2.core.LiveCore
    public LiveCore.IPushFrameAfterCapture createControlPushFrameAfterCapture(int i2, int i3) {
        ControlIPushFrameAfterCapture controlIPushFrameAfterCapture = new ControlIPushFrameAfterCapture(i2, i3);
        AVLog.iod("LiveCoreImpl", "create controlPushFrameAfterCapture object, width: " + i2 + " height: " + i3);
        return controlIPushFrameAfterCapture;
    }

    @Override // com.ss.avframework.livestreamv2.core.LiveCore
    public void setDisplay(View view, long j2) {
        this.mDisplayView = view;
        ILayerControlExt iLayerControlExt = this.mLayerControl;
        if (iLayerControlExt instanceof LayerControl) {
            ((LayerControl) iLayerControlExt).setDisplay(view, j2);
            RenderView renderView = this.mLayerControl.getRenderView();
            if (renderView != null) {
                renderView.setGlRenderInfoListener(new GLRenderVideoSink.GlRenderInfoListener() {
                    /* class com.ss.avframework.livestreamv2.core.LiveCoreImpl.AnonymousClass14 */

                    static {
                        Covode.recordClassIndex(100104);
                    }

                    @Override // com.ss.avframework.opengl.GLRenderVideoSink.GlRenderInfoListener
                    public void onInfo(int i2, int i3, int i4) {
                        ILiveStream.ILiveStreamInfoListener iLiveStreamInfoListener = LiveCoreImpl.this.mInfoListener;
                        if (iLiveStreamInfoListener == null) {
                            return;
                        }
                        if (i2 == 1) {
                            iLiveStreamInfoListener.onInfo(301, i3, i4);
                            AVLog.ioi("LiveCoreImpl", "MSG_EGL_SURFACE_DESTROYED  from livecore");
                        } else if (i2 == 2) {
                            iLiveStreamInfoListener.onInfo(302, i3, i4);
                            AVLog.ioi("LiveCoreImpl", "MSG_EGL_SURFACE_WILL_BE_CREATED  from livecore");
                        }
                    }
                });
            }
        }
        if (this.mCameraStreamLayer == null) {
            configCameraLayer();
        }
    }

    @Override // com.ss.avframework.livestreamv2.core.LiveCore
    public void switchVideoCapture(int i2, Object obj) {
        PrivacyCertManager.getInstance().saveCert(0, obj, "LiveCoreImpl.switchVideoCapture");
        switchVideoCapture(i2);
        PrivacyCertManager.getInstance().popCert(0);
    }

    /* access modifiers changed from: package-private */
    /* JADX WARNING: Code restructure failed: missing block: B:9:0x0024, code lost:
        if (r9 != null) goto L_0x0026;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final /* synthetic */ void lambda$pushSeiData$0$LiveCoreImpl(java.nio.ByteBuffer r14, java.lang.String r15) {
        /*
            r13 = this;
            com.ss.avframework.livestreamv2.core.LiveCore$Builder r0 = r13.getBuilder()
            com.ss.avframework.livestreamv2.ILiveStream r3 = r13.mLiveStream
            if (r3 == 0) goto L_0x0056
            com.ss.avframework.livestreamv2.filter.IFilterManager r2 = r3.getVideoFilterMgr()
        L_0x000c:
            r5 = r14
            java.lang.String r9 = r13.getContourInfoFromRTC(r5)
            java.lang.String r1 = ""
            if (r3 == 0) goto L_0x0024
            if (r0 == 0) goto L_0x0044
            boolean r0 = r0.needMergeRtcExtraDataToLiveStream()
            if (r0 == 0) goto L_0x0044
            r4 = 0
            r6 = 1
            r7 = 0
            r8 = 0
            r3.addSeiField(r4, r5, r6, r7, r8)
        L_0x0024:
            if (r9 == 0) goto L_0x003f
        L_0x0026:
            boolean r0 = r9.equals(r1)
            if (r0 != 0) goto L_0x003f
            boolean r0 = r2 instanceof com.ss.avframework.livestreamv2.filter.FilterManager
            if (r0 == 0) goto L_0x003f
            com.ss.avframework.livestreamv2.filter.FindContourInfo r1 = com.ss.avframework.livestreamv2.utils.ZlibCompressUtils.getContourInfoFromString(r9)
            com.ss.avframework.livestreamv2.filter.FilterManager r2 = (com.ss.avframework.livestreamv2.filter.FilterManager) r2
            com.ss.avframework.livestreamv2.filter.IFilterManager$ContourDataCallBack r0 = r2.getContourDataCallBack()
            if (r0 == 0) goto L_0x003f
            r0.onReceivedRemoteData(r1)
        L_0x003f:
            r0 = r15
            r13.processSEI(r0, r5)
            return
        L_0x0044:
            if (r9 == 0) goto L_0x003f
            boolean r0 = r9.equals(r1)
            if (r0 != 0) goto L_0x0026
            r10 = 1
            r11 = 0
            r12 = 0
            java.lang.String r8 = "contour_info"
            r7 = r3
            r7.addSeiField(r8, r9, r10, r11, r12)
            goto L_0x0026
        L_0x0056:
            r2 = 0
            goto L_0x000c
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ss.avframework.livestreamv2.core.LiveCoreImpl.lambda$pushSeiData$0$LiveCoreImpl(java.nio.ByteBuffer, java.lang.String):void");
    }

    @Override // com.ss.avframework.livestreamv2.ILiveStream
    public void adaptedVideoResolution(int i2, int i3, int i4) {
        ILiveStream iLiveStream = this.mLiveStream;
        if (iLiveStream != null) {
            iLiveStream.adaptedVideoResolution(i2, i3, i4);
        }
    }

    @Override // com.ss.avframework.livestreamv2.ILiveStream
    public int addSeiField(String str, Object obj, int i2) {
        return addSeiField(str, obj, i2, true, true);
    }

    @Override // com.ss.avframework.livestreamv2.ILiveStream
    public void addUserMetaData(String str, String str2, int i2) {
        ILiveStream iLiveStream = this.mLiveStream;
        if (iLiveStream != null) {
            iLiveStream.addUserMetaData(str, str2, i2);
        }
        if (this.mInteractEngineListener != null && !str.isEmpty() && !str2.isEmpty() && i2 == 1) {
            try {
                JSONObject jSONObject = new JSONObject();
                jSONObject.put(str, new JSONObject(str2));
                this.mInteractEngineListener.updateAuthInfo(jSONObject, Client.FrameType.METADATA);
            } catch (Exception e2) {
                AVLog.ioe("LiveCoreImpl", "send interact encrypt metadata failed", e2);
                e2.printStackTrace();
            }
        }
    }

    @Override // com.ss.avframework.livestreamv2.ILiveStream
    public void changeVideoBitrate(int i2, int i3, int i4) {
        if (this.mLiveStream != null) {
            AVLog.logKibana(5, "LiveCoreImpl", "changeVideoBitrate to:" + i3 + "/" + i2 + "/" + i4, null);
            this.mLiveStream.changeVideoBitrate(i2, i3, i4);
        }
    }

    @Override // com.ss.avframework.livestreamv2.core.LiveCore
    public void notifyLiveStreamAdjustResolution(boolean z, int i2, int i3) {
        LiveCore.Builder builder = getBuilder();
        if (builder != null && (this.mLiveStream instanceof LiveStream)) {
            int videoWidth = builder.getVideoWidth();
            int videoHeight = builder.getVideoHeight();
            int max = Math.max(videoWidth / 2, i2);
            int max2 = Math.max(videoHeight / 2, i3);
            int videoFps = builder.getVideoFps();
            if (z) {
                adaptedVideoResolution(videoWidth, videoHeight, videoFps);
            } else {
                adaptedVideoResolution(max, max2, videoFps);
            }
        }
    }

    @Override // com.ss.avframework.engine.AudioDeviceModule.Observer
    public void onADMInfo(int i2, int i3, long j2) {
        if (i2 == 5) {
            LiveStream liveStream = (LiveStream) this.mLiveStream;
            if (liveStream != null) {
                liveStream.onCalculatePcmPowerEvent(i3);
                return;
            }
            return;
        }
        ILiveStream.ILiveStreamInfoListener iLiveStreamInfoListener = this.mInfoListener;
        if (iLiveStreamInfoListener != null) {
            if (i2 == 2) {
                iLiveStreamInfoListener.onInfo(22, i3, 0);
            } else if (i2 == 3) {
                iLiveStreamInfoListener.onInfo(23, i3, 0);
            } else if (i2 == 4) {
                iLiveStreamInfoListener.onInfo(24, i3, 0);
            } else if (i2 == 6) {
                iLiveStreamInfoListener.onInfo(25, i3, 0);
            } else if (i2 == 7) {
                iLiveStreamInfoListener.onInfo(26, i3, 0);
            }
        }
    }

    private void createGameEngine(LiveCore.Builder builder, AudioDeviceModule audioDeviceModule, IFilterManager iFilterManager) {
        Class<?> cls;
        Method method;
        Exception e2;
        Vector vector = new Vector();
        vector.add(builder);
        vector.add(this);
        vector.add(audioDeviceModule);
        vector.add(iFilterManager);
        vector.add(this.mLayerControl);
        vector.add(this.mAudioDeviceControl);
        vector.add(Boolean.valueOf(getBuilder().getSdkSetting().switchParams.getGamePublishV2()));
        try {
            cls = Class.forName("com.ss.avframework.livestreamv2.gameplugin.GameEngine");
            try {
                method = cls.getMethod("create", vector.getClass());
            } catch (Exception e3) {
                e2 = e3;
                method = null;
                e2.printStackTrace();
                AVLog.ioe("LiveCoreImpl", "BUG, Create game engine failed(class:" + cls + "cons:" + method + " builder:" + builder + " m:" + audioDeviceModule + " filter:" + iFilterManager + " layerctr:" + this.mLayerControl + " audioctr:" + this.mAudioDeviceControl + " args size:" + vector.size() + " cause:" + e2.getMessage(), e2);
            }
            try {
                this.mGameEngine = (IGameEngineExt) method.invoke(null, vector);
                createLogServer(builder);
                LiveStreamLogService liveStreamLogService = this.mLiveStreamLogService;
                if (liveStreamLogService != null) {
                    liveStreamLogService.setupLayerControl((LayerControl) this.mLayerControl);
                    this.mGameEngine.setupLogServer(this.mLiveStreamLogService);
                }
                this.mGameVideoConsumer = this.mGameEngine.getVideoSink();
                this.mGameEngine.setInteractEngine(this.mInteractEngine);
                this.mGameEngine.setGamePipelineObserver(new IGameEngineExt.IGamePipelineEventObserver() {
                    /* class com.ss.avframework.livestreamv2.core.LiveCoreImpl.AnonymousClass11 */

                    static {
                        Covode.recordClassIndex(100101);
                    }

                    /* JADX DEBUG: Multi-variable search result rejected for r4v0, resolved type: boolean */
                    /* JADX WARN: Multi-variable type inference failed */
                    @Override // com.ss.avframework.livestreamv2.core.IGameEngineExt.IGamePipelineEventObserver
                    public void notifyLiveCoreToToggleCamera(boolean z, boolean z2) {
                        if (LiveCoreImpl.this.mInfoListener != null && !z2) {
                            LiveCoreImpl.this.mInfoListener.onInfo(201, z, 0);
                        }
                        LiveCoreImpl.this.switchVideoCapture(z ? 1 : 0);
                    }

                    @Override // com.ss.avframework.livestreamv2.core.IGameEngineExt.IGamePipelineEventObserver
                    public void notifyLiveCoreToChangeCameraAdaptedParams(int i2, int i3, int i4) {
                        if (LiveCoreImpl.this.mLiveStream instanceof LiveStream) {
                            ((LiveStream) LiveCoreImpl.this.mLiveStream).adaptedVideoResolution(i2, i3, i4);
                        }
                    }
                });
            } catch (Exception e4) {
                e2 = e4;
                e2.printStackTrace();
                AVLog.ioe("LiveCoreImpl", "BUG, Create game engine failed(class:" + cls + "cons:" + method + " builder:" + builder + " m:" + audioDeviceModule + " filter:" + iFilterManager + " layerctr:" + this.mLayerControl + " audioctr:" + this.mAudioDeviceControl + " args size:" + vector.size() + " cause:" + e2.getMessage(), e2);
            }
        } catch (ClassNotFoundException e5) {
            try {
                AVLog.ioe("LiveCoreImpl", "Not found GameEngine", e5);
            } catch (Exception e6) {
                e2 = e6;
                method = null;
                cls = null;
                e2.printStackTrace();
                AVLog.ioe("LiveCoreImpl", "BUG, Create game engine failed(class:" + cls + "cons:" + method + " builder:" + builder + " m:" + audioDeviceModule + " filter:" + iFilterManager + " layerctr:" + this.mLayerControl + " audioctr:" + this.mAudioDeviceControl + " args size:" + vector.size() + " cause:" + e2.getMessage(), e2);
            }
        }
    }

    @Override // com.ss.avframework.livestreamv2.ILiveStream
    public int pushVideoFrame(ByteBuffer byteBuffer, int i2, int i3, int i4, long j2) {
        ILiveStream iLiveStream = this.mLiveStream;
        if (iLiveStream == null) {
            return 0;
        }
        return iLiveStream.pushVideoFrame(byteBuffer, i2, i3, i4, j2);
    }

    @Override // com.ss.avframework.livestreamv2.ILiveStream
    public int addSeiField(String str, Object obj, int i2, boolean z, boolean z2) {
        return addSeiField(str, obj, i2, z, z2, 0);
    }

    @Override // com.ss.avframework.livestreamv2.ILiveStream.IAudioFrameAvailableListener
    public void onAudioFrameAvailable(Buffer buffer, int i2, int i3, int i4, long j2) {
        ArrayList<ILiveStream.IAudioFrameAvailableListener> arrayList;
        MethodCollector.i(14537);
        synchronized (this.mAudioFrameListenersFence) {
            try {
                arrayList = new ArrayList(this.mAudioFrameListeners);
            } finally {
                MethodCollector.o(14537);
            }
        }
        for (ILiveStream.IAudioFrameAvailableListener iAudioFrameAvailableListener : arrayList) {
            iAudioFrameAvailableListener.onAudioFrameAvailable(buffer, i2, i3, i4, j2);
        }
    }

    private static /* synthetic */ String lambda$create$3(JSONObject jSONObject, Client.StreamMixer streamMixer, int i2, int i3, List list) {
        String sb = new StringBuilder().append(list.size()).toString();
        try {
            if (!jSONObject.isNull(sb) && jSONObject.optJSONArray(sb).length() == list.size()) {
                JSONArray jSONArray = jSONObject.getJSONArray(sb);
                for (int i4 = 0; i4 < jSONArray.length(); i4++) {
                    JSONObject jSONObject2 = jSONArray.getJSONObject(i4);
                    Region region = (Region) list.get(i4);
                    if (!(region == null || jSONObject2 == null)) {
                        region.size((double) ((float) jSONObject2.getDouble("width")), (double) ((float) jSONObject2.getDouble("height")));
                        region.position((double) ((float) jSONObject2.getDouble("x")), (double) ((float) jSONObject2.getDouble("y")));
                    }
                }
                return "";
            }
        } catch (Exception e2) {
            e2.printStackTrace();
        }
        if (streamMixer != null) {
            return streamMixer.mixStream(i2, i3, list);
        }
        return "";
    }

    @Override // com.ss.avframework.livestreamv2.ILiveStream
    public int pushAudioFrame(ByteBuffer byteBuffer, int i2, int i3, int i4, int i5, long j2) {
        ILiveStream iLiveStream = this.mLiveStream;
        if (iLiveStream == null) {
            return 0;
        }
        return iLiveStream.pushAudioFrame(byteBuffer, i2, i3, i4, i5, j2);
    }

    @Override // com.ss.avframework.livestreamv2.ILiveStream
    public int addSeiField(String str, Object obj, int i2, boolean z, boolean z2, int i3) {
        if (obj != null && i3 == 0) {
            needSaveSei(str, obj);
        }
        if (!str.isEmpty() && obj != null && i3 == 1 && this.mInteractEngineListener != null) {
            try {
                JSONObject jSONObject = new JSONObject();
                jSONObject.put(str, obj);
                this.mInteractEngineListener.updateAuthInfo(jSONObject, Client.FrameType.SEI);
            } catch (Exception e2) {
                AVLog.ioe("LiveCoreImpl", "send interact encrypt sei failed", e2);
                e2.printStackTrace();
            }
        }
        ILiveStream iLiveStream = this.mLiveStream;
        if (iLiveStream == null) {
            return 0;
        }
        return iLiveStream.addSeiField(str, obj, i2, z, z2, i3);
    }

    @Override // com.ss.avframework.livestreamv2.core.LiveCore
    public void interactInfoReport(String str, Object obj, int i2, long j2, String str2, Object... objArr) {
        int i3 = 0;
        int i4 = 3;
        if (i2 != 12) {
            if (i2 == 13 && getBuilder().getSdkSetting().switchParams.getImPerfAlarm() && objArr.length == 3) {
                int parseInt = Integer.parseInt(objArr[0].toString());
                int parseInt2 = Integer.parseInt(objArr[1].toString());
                int parseInt3 = Integer.parseInt(objArr[2].toString());
                TEBundle tEBundle = new TEBundle();
                tEBundle.setInt("width", parseInt);
                tEBundle.setInt("height", parseInt2);
                tEBundle.setInt("fps", parseInt3);
                this.mLiveStream.updateSdkParams(tEBundle);
                tEBundle.release();
            }
        } else if (objArr[0].toString().equals(str)) {
            int intValue = ((Integer) objArr[1]).intValue();
            if (intValue == 1 || intValue == 2) {
                i3 = 1;
            } else if (intValue == 3) {
                i3 = 2;
            } else if (intValue == 4) {
                i3 = 3;
            }
            if (this.mInfoListener != null) {
                if (obj == Config.MixStreamType.CLIENT_MIX) {
                    i4 = 2;
                }
                this.mInfoListener.onInfo(101, i4, i3);
            }
        }
    }

    @Override // com.ss.avframework.livestreamv2.ILiveStream
    public int pushVideoFrame(int i2, boolean z, int i3, int i4, int i5, float[] fArr, long j2) {
        ILiveStream iLiveStream = this.mLiveStream;
        if (iLiveStream == null) {
            return 0;
        }
        return iLiveStream.pushVideoFrame(i2, z, i3, i4, i5, fArr, j2);
    }

    /* JADX WARNING: Removed duplicated region for block: B:23:0x0048 A[RETURN] */
    /* JADX WARNING: Removed duplicated region for block: B:24:0x004a  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public int addSeiFieldWithNs(java.lang.String r13, java.lang.Object r14, int r15, boolean r16, boolean r17, int r18, long r19) {
        /*
            r12 = this;
            r3 = r12
            com.ss.avframework.livestreamv2.core.LiveCore$Builder r0 = r12.getBuilder()
            r5 = r14
            r9 = r18
            r4 = r13
            if (r0 == 0) goto L_0x0018
            boolean r0 = r0.isEnableSendContourInfoToRtc()
            if (r0 == 0) goto L_0x0018
            if (r5 == 0) goto L_0x0018
            if (r9 != 0) goto L_0x0018
            r12.needSaveSei(r4, r5)
        L_0x0018:
            boolean r0 = r4.isEmpty()
            if (r0 != 0) goto L_0x0044
            if (r5 == 0) goto L_0x0044
            r0 = 1
            if (r9 != r0) goto L_0x0044
            com.ss.avframework.livestreamv2.core.LiveCore$ILiveForInteractListener r0 = r3.mInteractEngineListener
            if (r0 == 0) goto L_0x0044
            org.json.JSONObject r2 = new org.json.JSONObject     // Catch:{ Exception -> 0x0039 }
            r2.<init>()     // Catch:{ Exception -> 0x0039 }
            r2.put(r4, r5)     // Catch:{ Exception -> 0x0037 }
            com.ss.avframework.livestreamv2.core.LiveCore$ILiveForInteractListener r1 = r3.mInteractEngineListener     // Catch:{ Exception -> 0x0037 }
            com.ss.avframework.livestreamv2.core.Client$FrameType r0 = com.ss.avframework.livestreamv2.core.Client.FrameType.SEI     // Catch:{ Exception -> 0x0037 }
            r1.updateAuthInfo(r2, r0)     // Catch:{ Exception -> 0x0037 }
            goto L_0x0044
        L_0x0037:
            r2 = move-exception
            goto L_0x003a
        L_0x0039:
            r2 = move-exception
        L_0x003a:
            java.lang.String r1 = "LiveCoreImpl"
            java.lang.String r0 = "send interact encrypt sei failed"
            com.ss.avframework.utils.AVLog.ioe(r1, r0, r2)
            r2.printStackTrace()
        L_0x0044:
            com.ss.avframework.livestreamv2.ILiveStream r3 = r3.mLiveStream
            if (r3 != 0) goto L_0x004a
            r0 = 0
            return r0
        L_0x004a:
            com.ss.avframework.livestreamv2.LiveStream r3 = (com.ss.avframework.livestreamv2.LiveStream) r3
            r7 = r16
            r6 = r15
            r10 = r19
            r8 = r17
            int r0 = r3.addSeiFieldWithNs(r4, r5, r6, r7, r8, r9, r10)
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ss.avframework.livestreamv2.core.LiveCoreImpl.addSeiFieldWithNs(java.lang.String, java.lang.Object, int, boolean, boolean, int, long):int");
    }

    @Override // com.ss.avframework.livestreamv2.ILiveStream
    public int pushVideoFrame(int i2, boolean z, int i3, int i4, int i5, float[] fArr, long j2, Bundle bundle) {
        ILiveStream iLiveStream = this.mLiveStream;
        if (iLiveStream == null) {
            return 0;
        }
        return iLiveStream.pushVideoFrame(i2, z, i3, i4, i5, fArr, j2, bundle);
    }

    @Override // com.ss.avframework.livestreamv2.ILiveStream.ITextureFrameAvailableListener
    public void onTextureFrameAvailable(EGLContext eGLContext, int i2, boolean z, int i3, int i4, long j2, float[] fArr, Object... objArr) {
        ArrayList<ILiveStream.ITextureFrameAvailableListener> arrayList;
        MethodCollector.i(14528);
        synchronized (this.mTextureFrameListenersFence) {
            try {
                arrayList = new ArrayList(this.mTextureFrameListeners);
            } finally {
                MethodCollector.o(14528);
            }
        }
        for (ILiveStream.ITextureFrameAvailableListener iTextureFrameAvailableListener : arrayList) {
            if (iTextureFrameAvailableListener instanceof LiveCore.ILiveCoreTextureFrameAvailableListener) {
                ((LiveCore.ILiveCoreTextureFrameAvailableListener) iTextureFrameAvailableListener).onTextureFrameAvailable(GLThreadManager.getEGLContext(), i2, z, i3, i4, j2, fArr, objArr);
            } else {
                iTextureFrameAvailableListener.onTextureFrameAvailable(eGLContext, i2, z, i3, i4, j2, fArr, objArr);
            }
        }
    }

    @Override // com.ss.avframework.livestreamv2.core.LiveCore
    public void pushSeiData(int i2, String str, int i3, int i4, int i5, float[] fArr, int i6, long j2, ByteBuffer byteBuffer) {
        Handler handler = this.mWorkThreadHandler;
        if (handler != null) {
            handler.post(new LiveCoreImpl$$Lambda$0(this, byteBuffer, str));
        }
        if (this.mGameVideoConsumer != null && i3 > 0) {
            this.mGameVideoConsumer.onVideoFrame(i2, new VideoMixer.VideoMixerTexture(i4, i5, 0, VideoMixer.TEXTURE_TYPE_2D, new int[]{i3, 0, 0}, null), byteBuffer);
        }
    }
}
