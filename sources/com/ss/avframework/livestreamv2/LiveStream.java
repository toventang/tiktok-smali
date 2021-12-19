package com.ss.avframework.livestreamv2;

import android.content.Context;
import android.content.Intent;
import android.content.res.AssetManager;
import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.Rect;
import android.media.AudioManager;
import android.media.AudioRecordingConfiguration;
import android.os.Build;
import android.os.Bundle;
import android.os.Handler;
import android.os.SystemClock;
import android.text.TextUtils;
import android.util.AndroidRuntimeException;
import android.util.Log;
import com.a;
import com.bytedance.android.livesdk.livesetting.wallet.LiveRechargeAgeThresholdSetting;
import com.bytedance.covode.number.Covode;
import com.bytedance.frameworks.apm.trace.MethodCollector;
import com.bytedance.librarian.Librarian;
import com.bytedance.vcloud.abrmodule.ABRConfig;
import com.kakao.usermgmt.StringSet;
import com.ss.android.ugc.aweme.lancet.d;
import com.ss.android.ugc.aweme.lancet.m;
import com.ss.avframework.capture.audio.AudioCapturer;
import com.ss.avframework.capture.audio.AudioCapturerAudioRecord;
import com.ss.avframework.capture.audio.AudioCapturerOpensles;
import com.ss.avframework.capture.audio.AudioRecordThread;
import com.ss.avframework.codec.DefaultAudioEncoderFactory;
import com.ss.avframework.codec.DefaultVideoEncoderFactory;
import com.ss.avframework.effect.EffectWrapper;
import com.ss.avframework.effect.IVideoEffectProcessor;
import com.ss.avframework.engine.AudioDeviceModule;
import com.ss.avframework.engine.AudioEncoderFactory;
import com.ss.avframework.engine.AudioSource;
import com.ss.avframework.engine.AudioTrack;
import com.ss.avframework.engine.MediaEncodeStream;
import com.ss.avframework.engine.MediaEngineFactory;
import com.ss.avframework.engine.MediaSource;
import com.ss.avframework.engine.MediaTrack;
import com.ss.avframework.engine.NativeObject;
import com.ss.avframework.engine.SITICalculator;
import com.ss.avframework.engine.Transport;
import com.ss.avframework.engine.VideoEncoderFactory;
import com.ss.avframework.engine.VideoFrameStatistics;
import com.ss.avframework.engine.VideoProcessor;
import com.ss.avframework.engine.VideoSink;
import com.ss.avframework.engine.VideoSource;
import com.ss.avframework.engine.VideoTrack;
import com.ss.avframework.engine.VsyncModule;
import com.ss.avframework.livestreamv2.ILiveStream;
import com.ss.avframework.livestreamv2.InputAudioStream;
import com.ss.avframework.livestreamv2.InputVideoStream;
import com.ss.avframework.livestreamv2.audioeffect.AudioCatcher;
import com.ss.avframework.livestreamv2.capture.AudioCapturerExternal;
import com.ss.avframework.livestreamv2.capture.LiveStreamAudioCapture;
import com.ss.avframework.livestreamv2.capture.LiveStreamAudioCaptureFromADM;
import com.ss.avframework.livestreamv2.capture.LiveStreamVideoCapture;
import com.ss.avframework.livestreamv2.control.IVideoCapturerControl;
import com.ss.avframework.livestreamv2.core.ILayerControlExt;
import com.ss.avframework.livestreamv2.core.audiorecord.AudioRecordManager;
import com.ss.avframework.livestreamv2.core.audiorecord.IAudioRecordManager;
import com.ss.avframework.livestreamv2.filter.FilterManager;
import com.ss.avframework.livestreamv2.filter.IAudioFilterManager;
import com.ss.avframework.livestreamv2.filter.IFilterManager;
import com.ss.avframework.livestreamv2.ktv.IKaraokeMovie;
import com.ss.avframework.livestreamv2.log.LiveStreamLogService;
import com.ss.avframework.livestreamv2.recorder.IRecorderManager;
import com.ss.avframework.livestreamv2.recorder.RecorderManager;
import com.ss.avframework.livestreamv2.sdkparams.KcpParams;
import com.ss.avframework.livestreamv2.sdkparams.LiveSdkSetting;
import com.ss.avframework.livestreamv2.sdkparams.NodeOptParams;
import com.ss.avframework.livestreamv2.sdkparams.QuicParams;
import com.ss.avframework.livestreamv2.sdkparams.RtmpCacheConfig;
import com.ss.avframework.livestreamv2.sdkparams.SandboxParams;
import com.ss.avframework.livestreamv2.sdkparams.SitiConfig;
import com.ss.avframework.livestreamv2.strategy.EncodeFpsAdjustStrategy;
import com.ss.avframework.livestreamv2.strategy.EncoderFpsAdjustStrategyAvg;
import com.ss.avframework.livestreamv2.tinyjson.NumberInitializer;
import com.ss.avframework.livestreamv2.utils.PrivacyCertManager;
import com.ss.avframework.livestreamv2.utils.UrlUtils;
import com.ss.avframework.livestreamv2.utils.VideoDumpProxy;
import com.ss.avframework.mixer.AudioMixer;
import com.ss.avframework.mixer.VideoMixer;
import com.ss.avframework.opengl.GLThread;
import com.ss.avframework.strategy.LiveStreamBaseStrategy;
import com.ss.avframework.transport.LibRTMPTransport;
import com.ss.avframework.utils.AVLog;
import com.ss.avframework.utils.MiscUtils;
import com.ss.avframework.utils.SafeHandlerThread;
import com.ss.avframework.utils.SafeHandlerThreadPoolExecutor;
import com.ss.avframework.utils.TEBundle;
import com.ss.avframework.utils.ThreadUtils;
import com.ss.optimizer.live.sdk.dns.e;
import com.ss.videoarch.strategy.LiveStrategyManager;
import java.io.File;
import java.lang.ref.WeakReference;
import java.lang.reflect.Constructor;
import java.nio.ByteBuffer;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.concurrent.Executor;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicInteger;
import java.util.concurrent.locks.ReentrantReadWriteLock;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

public class LiveStream implements AudioCapturer.AudioCaptureObserver, AudioSource.PowerObserver, MediaEncodeStream.Observer, Transport.EventObserver, ILiveStream, LiveStreamVideoCapture.Observer, LiveStreamBaseStrategy.IStrategyNotify {
    protected final int STATUS_END;
    protected final int STATUS_ERROR;
    protected final int STATUS_INIT;
    protected final int STATUS_STARTED;
    protected final int STATUS_STARTING;
    protected final int STATUS_STOPED;
    private final int TRI_STATE_DEFAULT;
    private final int TRI_STATE_FALSE;
    private final int TRI_STATE_TRUE;
    private SafeHandlerThread dataNotifyThread;
    private final IVideoEffectProcessor effectProcessor;
    private long lastEstBitrate;
    private int mAddSeiCount;
    private volatile long mAdjustBitrate;
    public AudioCapturer mAudioCapture;
    public AudioDeviceModule mAudioDeviceModule;
    public String mAudioEncodeVsyncName;
    private AudioEncoderFactory mAudioEncoderFactory;
    private IAudioFilterManager mAudioFilterManager;
    public AudioFrameAvailableSink mAudioFrameAvailableSink;
    private boolean mAudioMixer;
    private IAudioRecordManager mAudioRecordManager;
    private int mAudioRecordMode;
    private AudioManager.AudioRecordingCallback mAudioRecordingCallback;
    public AudioTrack mAudioTrack;
    private String[] mAvailableAudioEncoders;
    private String[] mAvailableVideoEncoders;
    private long mCreateEncodeCount;
    public ILiveStream.ILiveStreamDataListener mDataListener;
    private final Handler mDataNotifyThreadHandler;
    public e mDns;
    private boolean mDnsOptHit;
    public boolean mDnsOptOpen;
    private IDualGameEngine mDualGameEngine;
    public int mEanbleReportStallLog;
    private boolean mEffectInited;
    public boolean mEnableDualGame;
    private boolean mEnableUrlFallBack;
    EncodeFpsAdjustStrategy mEncodeFpsAdjustStrategy;
    private VideoDumpProxy.RawVideoDumperProxy mEncodeFrameDumper;
    private VideoSink mEncodeFrameSink;
    private TEBundle mEncodeStreamOpt;
    public ILiveStream.ILiveStreamErrorListener mErrorListener;
    private String mEvaluatorSymbol;
    private JSONObject mEvaluatorSymbolMap;
    public ILiveStream.IAudioFrameAvailableListener mExternalAudioFrameListener;
    protected IFilterManager mFilterManager;
    public boolean mFirstConnect;
    private boolean mFirstFrameRendered;
    public ILiveStream.ILiveStreamInfoListener mInfoListener;
    public ArrayList<IInputAudioStream> mInputAudioStreams;
    public Object mInputStreamListFence;
    public ArrayList<IInputVideoStream> mInputVideoStreams;
    private final String mInvalidOptUrl;
    public boolean mIsKaraokeMovie;
    private boolean mIsRadioMode;
    public IKaraokeMovie mKaraokeMovie;
    private long mLastAddSeiStatTime;
    private int[] mLiveBitrateSave;
    protected LiveStreamBuilder mLiveStreamBuilder;
    private LiveStreamBaseStrategy mLiveStreamStrategy;
    protected MediaEncodeStream mMediaEncodeStream;
    private MediaEngineFactory mMediaEngineFactory;
    private int mNodeIndex;
    public HashMap<String, String> mOptUrlMap;
    private int mOptUrlReachable;
    public AudioMixer.AudioMixerDescription mOriginAudioStreamDescription;
    public VideoMixer.VideoMixerDescription mOriginVideoStreamDescription;
    private HashMap<String, List<String>> mPreparedIpList;
    private int mQuicFlag;
    public Transport mRTMPTransport;
    public RecorderManager mRecorderManager;
    public Object mReleaseFence;
    public VideoSink mRenderView;
    private ReentrantReadWriteLock mReportFence;
    private String mRequestId;
    private RoiSwitch mRoiSwitch;
    public int mRtmpReConnectCounts;
    private SITICalculator mSITICalculator;
    private long mSeiCurrentShiftDiffTime;
    protected AtomicInteger mStatus;
    private boolean mStrategyDnsOptOpen;
    public LiveStreamLogService mStreamLogService;
    private String mStreamUuid;
    protected TextureFrameAvailableSink mTextureFrameAvailableSink;
    private TEBundle mTransportOpt;
    private long mUploadLogInterval;
    private String mUri;
    private int mUriReachable;
    private List<String> mUris;
    private long mUrlPriority;
    private final HashMap<String, UserMetadata> mUserMetadata;
    private final Handler mVideoCaptureHandler;
    public LiveStreamVideoCapture mVideoCapturer;
    public String mVideoEncodeVsyncName;
    private VideoEncoderFactory mVideoEncoderFactory;
    private VideoFrameStatistics mVideoFrameStatics;
    private int mVideoMixBgColor;
    private boolean mVideoMixer;
    public VideoTrack mVideoTrack;
    protected final Handler mWorkThreadHandler;
    private Runnable rtmpReconnectRunnable;
    private boolean tryOpenAudioCaptureOnLater;
    private GLThread workThread;

    static {
        Covode.recordClassIndex(99873);
    }

    private void setupDumpEncodeFrames() {
    }

    public int getResolutionLevel(int i2, int i3) {
        long j2 = (long) (i2 * i3);
        if (j2 < 307200) {
            return 1;
        }
        if (j2 < 451200) {
            return 2;
        }
        return j2 < 720000 ? 3 : 4;
    }

    @Override // com.ss.avframework.livestreamv2.ILiveStream
    public String getVersion() {
        return "10.6.1.9-a";
    }

    /* access modifiers changed from: package-private */
    public class SharedEncoderRecorder implements IRecorderManager {
        private IRecorderManager.Config mConfig;
        private String mFile;
        private IRecorderManager.IRecorderListener mIRecorderListener;
        private WeakReference<LiveStream> mLiveStreamWeak;

        static {
            Covode.recordClassIndex(99937);
        }

        @Override // com.ss.avframework.livestreamv2.recorder.IRecorderManager
        public void addAudioTrack(AudioTrack audioTrack) {
        }

        @Override // com.ss.avframework.livestreamv2.recorder.IRecorderManager
        public Canvas lock(Rect rect) {
            return null;
        }

        @Override // com.ss.avframework.livestreamv2.recorder.IRecorderManager
        public void removeAudioTrack(AudioTrack audioTrack) {
        }

        @Override // com.ss.avframework.livestreamv2.recorder.IRecorderManager
        public void unlockAndPost(Canvas canvas) {
        }

        @Override // com.ss.avframework.livestreamv2.recorder.IRecorderManager
        public IRecorderManager.Config getConfig() {
            return this.mConfig;
        }

        @Override // com.ss.avframework.livestreamv2.recorder.IRecorderManager
        public void stop() {
            if (this.mLiveStreamWeak.get() != null) {
                this.mLiveStreamWeak.get().stopRecorder();
            } else {
                onEvent(11, 0, 0, "stream publish no start.");
            }
        }

        public SharedEncoderRecorder(WeakReference<LiveStream> weakReference) {
            this.mLiveStreamWeak = weakReference;
        }

        @Override // com.ss.avframework.livestreamv2.recorder.IRecorderManager
        public void start(String str, IRecorderManager.IRecorderListener iRecorderListener, IRecorderManager.Config config, int i2) {
            this.mFile = str;
            this.mIRecorderListener = iRecorderListener;
            this.mConfig = config;
            if (this.mLiveStreamWeak.get() != null) {
                this.mLiveStreamWeak.get().startRecorder(this.mFile);
            }
        }

        public void onEvent(int i2, int i3, long j2, String str) {
            IRecorderManager.IRecorderListener iRecorderListener = this.mIRecorderListener;
            if (iRecorderListener != null) {
                switch (i2) {
                    case ABRConfig.ABR_STALL_PENALTY_PARAMETER_KEY:
                        iRecorderListener.onRecorderStarted();
                        return;
                    case ABRConfig.ABR_SWITCH_PENALTY_PARAMETER_KEY:
                        if (!new File(this.mFile).canRead()) {
                            this.mIRecorderListener.onRecorderError(i3, new Exception("Unknown record error event(" + i2 + "," + i3 + "," + j2 + "," + str + ")"));
                            return;
                        } else {
                            this.mIRecorderListener.onRecorderStoped(this.mFile);
                            return;
                        }
                    case ABRConfig.ABR_BANDWIDTH_PARAMETER_KEY:
                        iRecorderListener.onRecorderError(i3, new Exception(str));
                        return;
                    default:
                        return;
                }
            }
        }
    }

    @Override // com.ss.avframework.livestreamv2.ILiveStream
    public IAudioFilterManager getAudioFilterMgr() {
        return this.mAudioFilterManager;
    }

    public long getCreateEncodeCount() {
        return this.mCreateEncodeCount;
    }

    public String getEvaluatorSymbol() {
        return this.mEvaluatorSymbol;
    }

    public int[] getLiveStreamBitrateSave() {
        return this.mLiveBitrateSave;
    }

    public LiveStreamBuilder getLiveStreamBuilder() {
        return this.mLiveStreamBuilder;
    }

    public HashMap<String, List<String>> getPreparedList() {
        return this.mPreparedIpList;
    }

    public int getQuicFlag() {
        return this.mQuicFlag;
    }

    @Override // com.ss.avframework.livestreamv2.ILiveStream
    public IRecorderManager getRecorderMgr() {
        return this.mRecorderManager;
    }

    public String getRequestId() {
        return this.mRequestId;
    }

    @Override // com.ss.avframework.livestreamv2.ILiveStream
    public IFilterManager getVideoFilterMgr() {
        return this.mFilterManager;
    }

    public long getVideoMetaBitRate() {
        return this.mAdjustBitrate;
    }

    public boolean isDnsOptHit() {
        return this.mDnsOptHit;
    }

    public boolean isDnsOptOpen() {
        return this.mDnsOptOpen;
    }

    private void updateUrlPriority() {
        this.mUrlPriority = System.currentTimeMillis();
    }

    @Override // com.ss.avframework.livestreamv2.ILiveStream
    public IInputAudioStream getOriginInputAudioStream() {
        return new IInputAudioStream() {
            /* class com.ss.avframework.livestreamv2.LiveStream.AnonymousClass34 */

            static {
                Covode.recordClassIndex(99920);
            }

            @Override // com.ss.avframework.livestreamv2.IInputAudioStream
            public void release() {
            }

            @Override // com.ss.avframework.livestreamv2.IInputAudioStream
            public int start() {
                return 0;
            }

            @Override // com.ss.avframework.livestreamv2.IInputAudioStream
            public int stop() {
                return 0;
            }

            @Override // com.ss.avframework.livestreamv2.IInputAudioStream
            public AudioTrack getAudioTrack() {
                return LiveStream.this.mAudioTrack;
            }

            @Override // com.ss.avframework.livestreamv2.IInputAudioStream
            public AudioMixer.AudioMixerDescription getMixerDescription() {
                return LiveStream.this.mOriginAudioStreamDescription;
            }

            @Override // com.ss.avframework.livestreamv2.IInputAudioStream
            public int getChannel() {
                return LiveStream.this.mLiveStreamBuilder.getAudioChannel();
            }

            @Override // com.ss.avframework.livestreamv2.IInputAudioStream
            public int getSample() {
                return LiveStream.this.mLiveStreamBuilder.getAudioSampleHZ();
            }

            @Override // com.ss.avframework.livestreamv2.IInputAudioStream
            public String name() {
                if (LiveStream.this.mAudioTrack != null) {
                    return LiveStream.this.mAudioTrack.id();
                }
                return "";
            }

            @Override // com.ss.avframework.livestreamv2.IInputAudioStream
            public void setMixerDescription(AudioMixer.AudioMixerDescription audioMixerDescription) {
                LiveStream.this.mOriginAudioStreamDescription = audioMixerDescription;
                if (LiveStream.this.mMediaEncodeStream != null) {
                    LiveStream.this.mMediaEncodeStream.setAudioMixerDescription(name(), LiveStream.this.mOriginAudioStreamDescription);
                }
            }

            @Override // com.ss.avframework.livestreamv2.IInputAudioStream
            public int pushAudioFrame(ByteBuffer byteBuffer, int i2, int i3, int i4, int i5, long j2) {
                return LiveStream.this.pushAudioFrame(byteBuffer, i2, i3, i4, i5, j2);
            }
        };
    }

    @Override // com.ss.avframework.livestreamv2.ILiveStream
    public IInputVideoStream getOriginInputVideoStream() {
        return new IInputVideoStream() {
            /* class com.ss.avframework.livestreamv2.LiveStream.AnonymousClass35 */

            static {
                Covode.recordClassIndex(99921);
            }

            @Override // com.ss.avframework.livestreamv2.IInputVideoStream
            public void release() {
            }

            @Override // com.ss.avframework.livestreamv2.IInputVideoStream
            public int start() {
                return 0;
            }

            @Override // com.ss.avframework.livestreamv2.IInputVideoStream
            public int stop() {
                return 0;
            }

            @Override // com.ss.avframework.livestreamv2.IInputVideoStream
            public VideoMixer.VideoMixerDescription getMixerDescription() {
                return LiveStream.this.mOriginVideoStreamDescription;
            }

            @Override // com.ss.avframework.livestreamv2.IInputVideoStream
            public int fps() {
                return LiveStream.this.mLiveStreamBuilder.getVideoFps();
            }

            @Override // com.ss.avframework.livestreamv2.IInputVideoStream
            public int getHeight() {
                return LiveStream.this.mLiveStreamBuilder.getVideoHeight();
            }

            @Override // com.ss.avframework.livestreamv2.IInputVideoStream
            public int getWidth() {
                return LiveStream.this.mLiveStreamBuilder.getVideoWidth();
            }

            @Override // com.ss.avframework.livestreamv2.IInputVideoStream
            public String name() {
                if (LiveStream.this.mVideoTrack != null) {
                    return LiveStream.this.mVideoTrack.id();
                }
                return "";
            }

            @Override // com.ss.avframework.livestreamv2.IInputVideoStream
            public void setMixerDescription(VideoMixer.VideoMixerDescription videoMixerDescription) {
                LiveStream.this.mOriginVideoStreamDescription.copy(videoMixerDescription);
                AVLog.iow("LiveStream", "update origin mix description:" + videoMixerDescription.toString());
                if (LiveStream.this.mMediaEncodeStream != null) {
                    LiveStream.this.mMediaEncodeStream.setVideoMixerDescription(name(), LiveStream.this.mOriginVideoStreamDescription);
                }
            }

            @Override // com.ss.avframework.livestreamv2.IInputVideoStream
            public int pushVideoFrame(ByteBuffer byteBuffer, int i2, int i3, int i4, long j2) {
                return LiveStream.this.pushVideoFrame(byteBuffer, i2, i3, i4, j2);
            }

            @Override // com.ss.avframework.livestreamv2.IInputVideoStream
            public int pushVideoFrame(int i2, boolean z, int i3, int i4, int i5, float[] fArr, long j2) {
                return LiveStream.this.pushVideoFrame(i2, z, i3, i4, i5, fArr, j2);
            }
        };
    }

    public void onRtmpSendTooSlow() {
        AVLog.d("LiveStream", "Net is too weak.");
    }

    @Override // com.ss.avframework.livestreamv2.ILiveStream
    public void startTransportInDebug() {
        Transport transport = this.mRTMPTransport;
        if (transport != null) {
            transport.startTransportInDebug();
        }
    }

    public int status() {
        return this.mStatus.get();
    }

    @Override // com.ss.avframework.livestreamv2.ILiveStream
    public void stopTransportInDebug() {
        Transport transport = this.mRTMPTransport;
        if (transport != null) {
            transport.stopTransportInDebug();
        }
    }

    private int getCurrentCaptureStatus() {
        LiveStreamVideoCapture liveStreamVideoCapture = this.mVideoCapturer;
        if (liveStreamVideoCapture != null) {
            return liveStreamVideoCapture.status();
        }
        return -1;
    }

    @Override // com.ss.avframework.livestreamv2.ILiveStream
    public boolean audioMute() {
        AudioCapturer audioCapturer = this.mAudioCapture;
        if (audioCapturer != null) {
            return audioCapturer.isMute();
        }
        return false;
    }

    public int getChangeVideoFpsCount() {
        EncodeFpsAdjustStrategy encodeFpsAdjustStrategy = this.mEncodeFpsAdjustStrategy;
        if (encodeFpsAdjustStrategy != null) {
            return encodeFpsAdjustStrategy.getChangeVideoFpsCount();
        }
        return 0;
    }

    public int getCurCplxCategory() {
        SITICalculator sITICalculator = this.mSITICalculator;
        if (sITICalculator != null) {
            return sITICalculator.getCurPlxCategory();
        }
        return -1;
    }

    @Override // com.ss.avframework.livestreamv2.ILiveStream
    public IVideoCapturerControl getVideoCapturerControl() {
        LiveStreamVideoCapture liveStreamVideoCapture = this.mVideoCapturer;
        if (liveStreamVideoCapture != null) {
            return liveStreamVideoCapture.getISPControl();
        }
        return null;
    }

    public boolean isAudioLive() {
        AudioCapturer audioCapturer = this.mAudioCapture;
        if (audioCapturer == null || audioCapturer.status() != 1) {
            return false;
        }
        return true;
    }

    public boolean isVideoLive() {
        LiveStreamVideoCapture liveStreamVideoCapture = this.mVideoCapturer;
        if (liveStreamVideoCapture == null || liveStreamVideoCapture.status() != 1) {
            return false;
        }
        return true;
    }

    /* access modifiers changed from: package-private */
    public final /* synthetic */ void lambda$startVideoCapture$2$LiveStream() {
        if (this.mStatus.get() != 7) {
            doStartVideoSource();
        }
    }

    /* access modifiers changed from: package-private */
    public final /* synthetic */ void lambda$stopVideoCapture$4$LiveStream() {
        if (this.mStatus.get() != 7) {
            doStopVideoSource();
        }
    }

    @Override // com.ss.avframework.livestreamv2.ILiveStream
    public void unregisterScreenAudioPlayBack() {
        LiveStreamVideoCapture liveStreamVideoCapture = this.mVideoCapturer;
        if (liveStreamVideoCapture != null) {
            liveStreamVideoCapture.registerScreenAudioPlayBack(null, 0);
        }
    }

    public static class RoiSwitch {
        private WeakReference<LiveStream> liveStreamWeakReference;

        static {
            Covode.recordClassIndex(99936);
        }

        /* access modifiers changed from: protected */
        public void checkRoiSwitch() {
            IFilterManager videoFilterMgr;
            LiveStream liveStream = this.liveStreamWeakReference.get();
            if (liveStream != null && (videoFilterMgr = liveStream.getVideoFilterMgr()) != null && (videoFilterMgr instanceof FilterManager)) {
                ((FilterManager) videoFilterMgr).enableRoi(shouldOpenRoi());
            }
        }

        public boolean shouldOpenRoi() {
            LiveStreamBuilder liveStreamBuilder;
            LiveStream liveStream = this.liveStreamWeakReference.get();
            if (liveStream != null) {
                liveStreamBuilder = liveStream.getLiveStreamBuilder();
            } else {
                liveStreamBuilder = null;
            }
            if (liveStreamBuilder == null || liveStreamBuilder.getRoiOn() != 1) {
                return false;
            }
            return true;
        }

        public RoiSwitch(LiveStream liveStream) {
            this.liveStreamWeakReference = new WeakReference<>(liveStream);
        }
    }

    private int chooseAudioProfileLevel() {
        int audioProfile = this.mLiveStreamBuilder.getAudioProfile();
        if (audioProfile == 1) {
            return 1;
        }
        if (audioProfile == 2 || audioProfile != 3) {
            return 3;
        }
        return 4;
    }

    /* access modifiers changed from: private */
    /* renamed from: doTriggerEncoderParams */
    public void bridge$lambda$2$LiveStream() {
        setTransportBaseParams();
        setupEncodeBaseParam();
        if (this.mLiveStreamBuilder.getPushBase().needChangeModeWhenTriggetEncoder) {
            changeToKTVMode(this.mIsKaraokeMovie, this.mKaraokeMovie);
        }
    }

    private void stopRecord() {
        if (this.mStatus.get() != 7) {
            this.mWorkThreadHandler.post(new Runnable() {
                /* class com.ss.avframework.livestreamv2.LiveStream.AnonymousClass13 */

                static {
                    Covode.recordClassIndex(99893);
                }

                public void run() {
                    if (LiveStream.this.mRecorderManager != null) {
                        LiveStream.this.mRecorderManager.stop();
                        LiveStream.this.mRecorderManager.release();
                        LiveStream.this.mRecorderManager = null;
                    }
                }
            });
        }
    }

    public void captureFirstFrameNotify() {
        ILiveStream.ILiveStreamInfoListener iLiveStreamInfoListener;
        if (!this.mFirstFrameRendered && (iLiveStreamInfoListener = this.mInfoListener) != null) {
            iLiveStreamInfoListener.onInfo(30, getLiveStreamBuilder().getVideoCaptureDevice(), 0);
            this.mFirstFrameRendered = true;
        }
    }

    /* access modifiers changed from: protected */
    public void doStopVideoSource() {
        AVLog.logKibana(4, "LiveStream", "Call stopVideoCapture. VideoCaptureDevice: " + this.mLiveStreamBuilder.getVideoCaptureDevice(), null);
        destroyVideoTrack();
    }

    @Override // com.ss.avframework.livestreamv2.ILiveStream
    public IAudioRecordManager getAudioRecorMgr() {
        MediaEngineFactory mediaEngineFactory = this.mMediaEngineFactory;
        AudioCapturer audioCapturer = this.mAudioCapture;
        IVideoEffectProcessor iVideoEffectProcessor = this.effectProcessor;
        if (iVideoEffectProcessor == null) {
            iVideoEffectProcessor = this.mFilterManager.getVideoEffectProcessor();
        }
        AudioRecordManager audioRecordManager = new AudioRecordManager(mediaEngineFactory, audioCapturer, iVideoEffectProcessor);
        this.mAudioRecordManager = audioRecordManager;
        return audioRecordManager;
    }

    public VsyncModule getEncodeStreamVsyncModule() {
        final VsyncModule[] vsyncModuleArr = new VsyncModule[1];
        ThreadUtils.invokeAtFrontUninterruptibly(this.mWorkThreadHandler, new Runnable() {
            /* class com.ss.avframework.livestreamv2.LiveStream.AnonymousClass38 */

            static {
                Covode.recordClassIndex(99924);
            }

            public void run() {
                if (LiveStream.this.mMediaEncodeStream != null) {
                    vsyncModuleArr[0] = LiveStream.this.mMediaEncodeStream.getVsyncModule();
                }
            }
        });
        return vsyncModuleArr[0];
    }

    @Override // com.ss.avframework.livestreamv2.ILiveStream
    public LiveStreamOption getOption() {
        final LiveStreamOption[] liveStreamOptionArr = new LiveStreamOption[1];
        if (this.mStatus.get() != 7) {
            ThreadUtils.invokeAtFrontUninterruptibly(this.mWorkThreadHandler, new Runnable() {
                /* class com.ss.avframework.livestreamv2.LiveStream.AnonymousClass16 */

                static {
                    Covode.recordClassIndex(99896);
                }

                public void run() {
                    if (LiveStream.this.mMediaEncodeStream != null) {
                        liveStreamOptionArr[0] = new LiveStreamOption(LiveStream.this.mMediaEncodeStream.getParameter());
                    }
                }
            });
        }
        return liveStreamOptionArr[0];
    }

    public String getOriginUrl() {
        String str;
        String str2 = this.mUri;
        if (str2 != null) {
            return str2;
        }
        List<String> list = this.mUris;
        if (list == null || list.isEmpty() || (str = this.mUris.get(0)) == null) {
            return "";
        }
        return str;
    }

    public String getRtmpTcUrl() {
        if (!isUsingOptimizedUrl()) {
            return null;
        }
        String originUrl = getOriginUrl();
        try {
            return originUrl.substring(0, originUrl.lastIndexOf(47) + 1);
        } catch (Throwable unused) {
            return null;
        }
    }

    public List<String> getUrls() {
        ArrayList arrayList = new ArrayList();
        String str = this.mUri;
        if (str != null) {
            arrayList.add(str);
            return arrayList;
        }
        List<String> list = this.mUris;
        if (list == null || list.isEmpty()) {
            return arrayList;
        }
        return this.mUris;
    }

    /* access modifiers changed from: package-private */
    public final /* synthetic */ void lambda$release$6$LiveStream() {
        VideoEncoderFactory videoEncoderFactory = this.mVideoEncoderFactory;
        if (videoEncoderFactory != null) {
            videoEncoderFactory.release();
            this.mVideoEncoderFactory = null;
        }
        AudioDeviceModule audioDeviceModule = this.mAudioDeviceModule;
        if (audioDeviceModule != null) {
            audioDeviceModule.setAudioProcessor(null);
        }
        IDualGameEngine iDualGameEngine = this.mDualGameEngine;
        if (iDualGameEngine != null) {
            iDualGameEngine.release();
            this.mDualGameEngine = null;
        }
    }

    /* access modifiers changed from: package-private */
    public final /* synthetic */ void lambda$startAudioCapture$3$LiveStream() {
        if (this.mStatus.get() != 7 && checkAudioCaptureCert(true)) {
            doStartAudioSource();
        }
    }

    /* access modifiers changed from: package-private */
    public final /* synthetic */ void lambda$stopAudioCapture$5$LiveStream() {
        if (this.mStatus.get() != 7) {
            checkAudioCaptureCert(false);
            doStopAudioSource();
        }
    }

    @Override // com.ss.avframework.livestreamv2.capture.LiveStreamVideoCapture.Observer
    public void onVideoCaptureStoped() {
        if (this.mStatus.get() != 7) {
            this.mWorkThreadHandler.post(new Runnable() {
                /* class com.ss.avframework.livestreamv2.LiveStream.AnonymousClass21 */

                static {
                    Covode.recordClassIndex(99902);
                }

                public void run() {
                    LiveStream.this.mInfoListener.onInfo(6, 0, 0);
                }
            });
        }
        this.mFirstFrameRendered = false;
        RecorderManager recorderManager = this.mRecorderManager;
        if (recorderManager != null) {
            recorderManager.setupVideoSource(null);
        }
    }

    @Override // com.ss.avframework.livestreamv2.ILiveStream
    public void stopAudioCapture() {
        if (this.mStatus.get() != 7) {
            this.mWorkThreadHandler.post(new PrivacyCertManager.RunnableWithCert(new LiveStream$$Lambda$5(this), new int[]{1}));
        }
    }

    public void stopRecorder() {
        if (this.mStatus.get() != 7) {
            this.mWorkThreadHandler.post(new Runnable() {
                /* class com.ss.avframework.livestreamv2.LiveStream.AnonymousClass37 */

                static {
                    Covode.recordClassIndex(99923);
                }

                public void run() {
                    if (LiveStream.this.mMediaEncodeStream != null) {
                        LiveStream.this.mMediaEncodeStream.stopRecord();
                    }
                }
            });
        }
    }

    @Override // com.ss.avframework.livestreamv2.ILiveStream
    public void stopVideoCapture() {
        if (this.mStatus.get() != 7) {
            this.mWorkThreadHandler.post(new PrivacyCertManager.RunnableWithCert(new LiveStream$$Lambda$4(this), new int[]{0}));
        }
    }

    private int chooseProfileLevel() {
        int videoProfile = this.mLiveStreamBuilder.getVideoProfile();
        if (this.mLiveStreamBuilder.getVideoEncoder() == 1) {
            if (videoProfile != 1) {
                if (videoProfile == 2) {
                    return 2;
                }
                if (videoProfile == 3) {
                    return 3;
                }
                this.mLiveStreamBuilder.setVideoProfile(1);
            }
            return 1;
        } else if (this.mLiveStreamBuilder.getVideoEncoder() != 2) {
            return -1;
        } else {
            if (videoProfile != 4) {
                this.mLiveStreamBuilder.setVideoProfile(4);
            }
            return 4;
        }
    }

    private boolean isUsingOptimizedUrl() {
        HashMap<String, String> hashMap;
        String originUrl = getOriginUrl();
        if (TextUtils.isEmpty(originUrl) || !this.mDnsOptOpen || !this.mDnsOptHit || (hashMap = this.mOptUrlMap) == null || !hashMap.containsKey(originUrl)) {
            return false;
        }
        String str = this.mOptUrlMap.get(originUrl);
        if (TextUtils.isEmpty(str) || str.equals("INVALID_URL")) {
            return false;
        }
        return true;
    }

    private void removeCapturedAudioFrameSinks() {
        AudioFrameAvailableSink audioFrameAvailableSink;
        AudioDeviceModule audioDeviceModule = this.mAudioDeviceModule;
        if (audioDeviceModule == null || !audioDeviceModule.isSeperateRecordingCallback()) {
            AudioTrack audioTrack = this.mAudioTrack;
            if (audioTrack != null && (audioFrameAvailableSink = this.mAudioFrameAvailableSink) != null) {
                audioTrack.removeAudioSink(audioFrameAvailableSink);
                return;
            }
            return;
        }
        AudioFrameAvailableSink audioFrameAvailableSink2 = this.mAudioFrameAvailableSink;
        if (audioFrameAvailableSink2 != null) {
            this.mAudioDeviceModule.removeAudioSink(3, audioFrameAvailableSink2);
        }
    }

    private void setupVsyncParameter() {
        VsyncModule vsyncModule = this.mMediaEncodeStream.getVsyncModule();
        if (vsyncModule != null) {
            vsyncModule.setEnable(true);
            TEBundle option = vsyncModule.getOption();
            option.setInt("vsync_max_intveval_than_frame_ms", this.mLiveStreamBuilder.getVsyncModuleMaxIntevalOnFrameMs());
            option.setInt("vsync_max_intveval_than_now_ms", this.mLiveStreamBuilder.getVsyncModuleMaxIntevalOnNowMs());
            vsyncModule.setOption(option);
            vsyncModule.registerObserver(new VsyncModule.Observer() {
                /* class com.ss.avframework.livestreamv2.LiveStream.AnonymousClass5 */

                static {
                    Covode.recordClassIndex(99930);
                }

                @Override // com.ss.avframework.engine.VsyncModule.Observer
                public void onEvent(int i2, int i3, long j2, String str) {
                    VsyncModule vsyncModule;
                    if (LiveStream.this.mMediaEncodeStream != null && (vsyncModule = LiveStream.this.mMediaEncodeStream.getVsyncModule()) != null) {
                        LiveStream.this.vsyncEvent(vsyncModule, i2, i3, j2, str);
                    }
                }
            });
        }
    }

    public void addCapturedAudioFrameSinks() {
        AudioFrameAvailableSink audioFrameAvailableSink;
        AudioDeviceModule audioDeviceModule = this.mAudioDeviceModule;
        if (audioDeviceModule == null || !audioDeviceModule.isSeperateRecordingCallback()) {
            AudioTrack audioTrack = this.mAudioTrack;
            if (audioTrack != null && (audioFrameAvailableSink = this.mAudioFrameAvailableSink) != null) {
                audioTrack.addAudioSink(audioFrameAvailableSink);
                return;
            }
            return;
        }
        AudioFrameAvailableSink audioFrameAvailableSink2 = this.mAudioFrameAvailableSink;
        if (audioFrameAvailableSink2 != null) {
            this.mAudioDeviceModule.addAudioSink(3, audioFrameAvailableSink2);
        }
    }

    @Override // com.ss.avframework.livestreamv2.ILiveStream
    public IInputAudioStream createInputAudioStream() {
        MethodCollector.i(11766);
        final InputAudioStream inputAudioStream = new InputAudioStream(this.mMediaEngineFactory, new InputAudioStream.Observer() {
            /* class com.ss.avframework.livestreamv2.LiveStream.AnonymousClass30 */

            static {
                Covode.recordClassIndex(99912);
            }

            @Override // com.ss.avframework.livestreamv2.InputAudioStream.Observer
            public void updateVolume(final InputAudioStream inputAudioStream) {
                LiveStream.this.mWorkThreadHandler.post(new Runnable() {
                    /* class com.ss.avframework.livestreamv2.LiveStream.AnonymousClass30.AnonymousClass2 */

                    static {
                        Covode.recordClassIndex(99914);
                    }

                    public void run() {
                        if (inputAudioStream != null && LiveStream.this.mMediaEncodeStream != null) {
                            LiveStream.this.mMediaEncodeStream.setAudioMixerDescription(inputAudioStream.name(), inputAudioStream.getMixerDescription());
                        }
                    }
                });
            }

            @Override // com.ss.avframework.livestreamv2.InputAudioStream.Observer
            public void releaseInputStream(final InputAudioStream inputAudioStream) {
                MethodCollector.i(13502);
                synchronized (LiveStream.this.mInputStreamListFence) {
                    try {
                        LiveStream.this.mInputAudioStreams.remove(inputAudioStream);
                    } catch (Throwable th) {
                        MethodCollector.o(13502);
                        throw th;
                    }
                }
                ThreadUtils.invokeAtFrontUninterruptibly(LiveStream.this.mWorkThreadHandler, new Runnable() {
                    /* class com.ss.avframework.livestreamv2.LiveStream.AnonymousClass30.AnonymousClass1 */

                    static {
                        Covode.recordClassIndex(99913);
                    }

                    public void run() {
                        AudioTrack audioTrack = inputAudioStream.getAudioTrack();
                        if (audioTrack != null && LiveStream.this.mMediaEncodeStream != null) {
                            LiveStream.this.mMediaEncodeStream.removeTrack(audioTrack);
                        }
                    }
                });
                MethodCollector.o(13502);
            }
        }, this.mLiveStreamBuilder.getAudioSampleHZ(), this.mLiveStreamBuilder.getAudioChannel(), null);
        synchronized (this.mInputStreamListFence) {
            try {
                this.mInputAudioStreams.add(inputAudioStream);
            } catch (Throwable th) {
                MethodCollector.o(11766);
                throw th;
            }
        }
        ThreadUtils.invokeAtFrontUninterruptibly(this.mWorkThreadHandler, new Runnable() {
            /* class com.ss.avframework.livestreamv2.LiveStream.AnonymousClass31 */

            static {
                Covode.recordClassIndex(99915);
            }

            public void run() {
                if (LiveStream.this.mMediaEncodeStream != null) {
                    LiveStream.this.mMediaEncodeStream.addTrack(inputAudioStream.getAudioTrack());
                    LiveStream.this.mMediaEncodeStream.setAudioMixerDescription(inputAudioStream.name(), inputAudioStream.getMixerDescription());
                }
            }
        });
        MethodCollector.o(11766);
        return inputAudioStream;
    }

    /* access modifiers changed from: protected */
    public Transport createTransport() {
        boolean z;
        boolean z2 = true;
        if (this.mLiveStreamBuilder.getVideoCaptureDevice() != 0) {
            z = true;
        } else {
            z = false;
        }
        if (this.mLiveStreamBuilder.getAudioCaptureDevice() == 0) {
            z2 = false;
        }
        return new LibRTMPTransport(z, z2, isRtsUrl(getOriginUrl()));
    }

    /* access modifiers changed from: protected */
    public void doStop() {
        if (this.mStatus.get() != 4) {
            this.mPreparedIpList = null;
            this.mNodeIndex = 0;
            destroyEncodeStream();
            this.mWorkThreadHandler.removeCallbacks(this.rtmpReconnectRunnable);
            if (this.mStatus.get() != 8) {
                this.mStatus.set(4);
                this.mInfoListener.onInfo(3, 0, 0);
                return;
            }
            AVLog.iow("LiveStream", "Try to stop live stream while mStatus is STATUS_ERROR");
        }
    }

    public void doStopAudioSource() {
        AudioManager.AudioRecordingCallback audioRecordingCallback;
        if (this.mAudioCapture != null) {
            AudioDeviceModule audioDeviceModule = this.mAudioDeviceModule;
            if (!(audioDeviceModule == null || (audioRecordingCallback = this.mAudioRecordingCallback) == null)) {
                audioDeviceModule.unRegisterAudioRecordingCallback(audioRecordingCallback);
            }
            destroyAudioTrack();
            RecorderManager recorderManager = this.mRecorderManager;
            if (recorderManager != null) {
                recorderManager.setupAudioSource(null);
            }
            this.mInfoListener.onInfo(9, 0, 0);
        }
    }

    public String getStreamUniqueId() {
        if (!TextUtils.isEmpty(this.mStreamUuid)) {
            return this.mStreamUuid + "." + this.mUrlPriority;
        }
        return "";
    }

    public int getVideoGop() {
        LiveStreamBuilder liveStreamBuilder = this.mLiveStreamBuilder;
        if (liveStreamBuilder == null) {
            return 0;
        }
        float videoGopSec = liveStreamBuilder.getVideoGopSec();
        int videoGop = this.mLiveStreamBuilder.getVideoGop();
        int videoFps = this.mLiveStreamBuilder.getVideoFps();
        if (videoGopSec > 0.0f) {
            return Math.round(videoGopSec * ((float) videoFps));
        }
        if (videoGop > 0) {
            return videoGop;
        }
        this.mLiveStreamBuilder.setVideoGopSec(2.0f);
        int i2 = videoFps * 2;
        this.mLiveStreamBuilder.setVideoGop(i2);
        return i2;
    }

    public boolean onCanEncodeStream() {
        boolean z = false;
        if (this.mStatus.get() != 2) {
            return false;
        }
        boolean z2 = true;
        if (this.mLiveStreamBuilder.getVideoCaptureDevice() != 0) {
            LiveStreamVideoCapture liveStreamVideoCapture = this.mVideoCapturer;
            if (liveStreamVideoCapture == null || liveStreamVideoCapture.status() != 1) {
                return false;
            }
            z2 = true;
        }
        if (this.mLiveStreamBuilder.getAudioCaptureDevice() == 0) {
            return z2;
        }
        AudioCapturer audioCapturer = this.mAudioCapture;
        if (audioCapturer != null && audioCapturer.status() == 1) {
            z = true;
        }
        return z;
    }

    /* access modifiers changed from: protected */
    public void onRtmpConncted() {
        this.mStatus.set(2);
        if (onCanEncodeStream()) {
            addTrackToEncodeStream();
        }
        this.mRtmpReConnectCounts = 0;
        this.mFirstConnect = false;
        if (isUsingOptimizedUrl()) {
            this.mOptUrlReachable = 1;
        } else {
            this.mUriReachable = 1;
        }
        this.mInfoListener.onInfo(2, 0, 0);
    }

    @Override // com.ss.avframework.livestreamv2.capture.LiveStreamVideoCapture.Observer
    public void onVideoCaptureStarted() {
        RecorderManager recorderManager = this.mRecorderManager;
        if (recorderManager != null) {
            VideoSink sharedSink = recorderManager.getSharedSink();
            VideoTrack videoTrack = this.mVideoTrack;
            if (!(videoTrack == null || sharedSink == null)) {
                videoTrack.addVideoSink(sharedSink);
            }
        }
        this.mWorkThreadHandler.post(new Runnable() {
            /* class com.ss.avframework.livestreamv2.LiveStream.AnonymousClass19 */

            static {
                Covode.recordClassIndex(99899);
            }

            public void run() {
                if (LiveStream.this.onCanEncodeStream()) {
                    LiveStream.this.addTrackToEncodeStream();
                    LiveStream liveStream = LiveStream.this;
                    liveStream.switchVideoSinkForDualGame(liveStream.mEnableDualGame);
                }
            }
        });
        if (this.mStatus.get() != 7) {
            this.mWorkThreadHandler.post(new Runnable() {
                /* class com.ss.avframework.livestreamv2.LiveStream.AnonymousClass20 */

                static {
                    Covode.recordClassIndex(99901);
                }

                public void run() {
                    int i2;
                    if (LiveStream.this.mVideoCapturer != null) {
                        i2 = LiveStream.this.mVideoCapturer.getValidCaptureFps();
                    } else {
                        i2 = 0;
                    }
                    LiveStream.this.mInfoListener.onInfo(5, LiveStream.this.mLiveStreamBuilder.getVideoCaptureDevice(), i2);
                }
            });
        }
    }

    @Override // com.ss.avframework.livestreamv2.ILiveStream
    public void pause() {
        if (this.mStatus.get() != 7) {
            this.mWorkThreadHandler.post(new PrivacyCertManager.RunnableWithCert(new LiveStream$$Lambda$7(this), new int[]{0, 1}));
        }
    }

    @Override // com.ss.avframework.livestreamv2.ILiveStream
    public void requestKeyFrame() {
        if (Thread.currentThread() != this.mWorkThreadHandler.getLooper().getThread()) {
            this.mWorkThreadHandler.post(new LiveStream$$Lambda$12(this));
            return;
        }
        MediaEncodeStream mediaEncodeStream = this.mMediaEncodeStream;
        if (mediaEncodeStream != null) {
            mediaEncodeStream.requestIDRFrame();
        }
    }

    @Override // com.ss.avframework.livestreamv2.ILiveStream
    public void resume() {
        if (this.mStatus.get() != 7) {
            this.mWorkThreadHandler.post(new PrivacyCertManager.RunnableWithCert(new LiveStream$$Lambda$6(this), new int[]{1, 0}));
        }
    }

    /* access modifiers changed from: protected */
    public void setupTransport() {
        Transport transport = this.mRTMPTransport;
        if (transport != null) {
            transport.setEventObserver(this);
            String liveStreamUrl = getLiveStreamUrl();
            AVLog.iod("LiveStream", "Rtmp(" + this.mRTMPTransport + ") setUrl " + liveStreamUrl);
            this.mRTMPTransport.setupUrl(liveStreamUrl);
        }
    }

    @Override // com.ss.avframework.livestreamv2.ILiveStream
    public void startAudioCapture() {
        if (this.mStatus.get() != 7) {
            this.mWorkThreadHandler.post(new PrivacyCertManager.RunnableWithCert(new LiveStream$$Lambda$3(this), new int[]{1}));
            return;
        }
        AVLog.ioe("LiveStream", "Try to start audio capture while mStatus is STATUS_END");
    }

    @Override // com.ss.avframework.livestreamv2.ILiveStream
    public void startVideoCapture() {
        if (this.mStatus.get() != 7) {
            this.mWorkThreadHandler.post(new PrivacyCertManager.RunnableWithCert(new LiveStream$$Lambda$2(this), new int[]{0}));
            return;
        }
        AVLog.ioe("LiveStream", "Try to start video capture while mStatus is STATUS_END");
    }

    @Override // com.ss.avframework.livestreamv2.ILiveStream
    public void stop() {
        AVLog.logKibana(4, "LiveStream", "stop,status:" + this.mStatus.get(), null);
        if (this.mStatus.get() != 7) {
            this.mWorkThreadHandler.post(new Runnable() {
                /* class com.ss.avframework.livestreamv2.LiveStream.AnonymousClass7 */

                static {
                    Covode.recordClassIndex(99932);
                }

                public void run() {
                    LiveStream.this.doStop();
                    LiveStreamLogService liveStreamLogService = LiveStream.this.mStreamLogService;
                    if (liveStreamLogService != null) {
                        liveStreamLogService.addOrRemoveStatus(1, true);
                    }
                }
            });
        }
    }

    private void destroyAudioTrack() {
        AudioTrack audioTrack;
        this.mReportFence.writeLock().lock();
        IAudioRecordManager iAudioRecordManager = this.mAudioRecordManager;
        if (iAudioRecordManager != null) {
            iAudioRecordManager.release();
            this.mAudioRecordManager = null;
        }
        MediaEncodeStream mediaEncodeStream = this.mMediaEncodeStream;
        if (!(mediaEncodeStream == null || (audioTrack = this.mAudioTrack) == null)) {
            mediaEncodeStream.removeTrack(audioTrack);
            removeStreamsFromEncodeStream(false);
        }
        AudioCapturer audioCapturer = this.mAudioCapture;
        if (audioCapturer != null) {
            audioCapturer.setCalculatePcmPowerEventObserver(null);
            this.mAudioCapture.pause();
            this.mAudioCapture.stop();
            AudioDeviceModule audioDeviceModule = this.mAudioDeviceModule;
            if (audioDeviceModule != null && audioDeviceModule.isExternalRecording()) {
                this.mAudioDeviceModule.stopRecording();
            }
            this.mAudioCapture.release();
            this.mAudioCapture = null;
            AVLog.ioi("LiveStream", "Stop audio capture success");
        }
        if (this.mAudioTrack != null) {
            removeCapturedAudioFrameSinks();
            this.mAudioTrack.setAudioProcessor(null);
            this.mAudioTrack.release();
            this.mAudioTrack = null;
        }
        this.mReportFence.writeLock().unlock();
    }

    private void destroyVideoTrack() {
        VideoTrack videoTrack;
        changeToKTVMode(false, this.mKaraokeMovie);
        this.mReportFence.writeLock().lock();
        MediaEncodeStream mediaEncodeStream = this.mMediaEncodeStream;
        if (!(mediaEncodeStream == null || (videoTrack = this.mVideoTrack) == null)) {
            mediaEncodeStream.removeTrack(videoTrack);
            removeStreamsFromEncodeStream(true);
        }
        VideoTrack videoTrack2 = this.mVideoTrack;
        if (videoTrack2 != null) {
            VideoSink videoSink = this.mRenderView;
            if (videoSink != null) {
                videoTrack2.removeVideoSink(videoSink);
            }
            TextureFrameAvailableSink textureFrameAvailableSink = this.mTextureFrameAvailableSink;
            if (textureFrameAvailableSink != null) {
                this.mVideoTrack.removeVideoSink(textureFrameAvailableSink);
            }
            RecorderManager recorderManager = this.mRecorderManager;
            if (recorderManager != null) {
                this.mVideoTrack.removeVideoSink(recorderManager.getSharedSink());
            }
        }
        LiveStreamVideoCapture liveStreamVideoCapture = this.mVideoCapturer;
        if (liveStreamVideoCapture != null) {
            liveStreamVideoCapture.stop();
            this.mVideoCapturer.release();
            this.mVideoCapturer = null;
        }
        VideoTrack videoTrack3 = this.mVideoTrack;
        if (videoTrack3 != null) {
            videoTrack3.setVideoProcessor(null);
            this.mVideoTrack.release();
            this.mVideoTrack = null;
        }
        this.mReportFence.writeLock().unlock();
    }

    private String getSoftVideoCodec() {
        LiveStreamBuilder liveStreamBuilder = this.mLiveStreamBuilder;
        String str = null;
        if (liveStreamBuilder == null) {
            return null;
        }
        boolean isSelfInnovateSoftEncode = liveStreamBuilder.isSelfInnovateSoftEncode();
        String[] strArr = this.mAvailableVideoEncoders;
        int length = strArr.length;
        int i2 = 0;
        boolean z = false;
        boolean z2 = false;
        while (true) {
            if (i2 < length) {
                String str2 = strArr[i2];
                if (!str2.contains("video_enable_accelera=true")) {
                    if (str2.contains("video_type=video/x264")) {
                        if (!isSelfInnovateSoftEncode) {
                            str = "video/x264";
                            break;
                        }
                        z = true;
                    } else if (!str2.contains("video_type=video/bytevc0")) {
                        continue;
                    } else if (isSelfInnovateSoftEncode) {
                        str = "video/bytevc0";
                        break;
                    } else {
                        z2 = true;
                    }
                }
                i2++;
            } else if (z) {
                liveStreamBuilder.setUseSelfInnovateSoftEncode(false);
                return "video/x264";
            } else if (z2) {
                liveStreamBuilder.setUseSelfInnovateSoftEncode(true);
                return "video/bytevc0";
            }
        }
        return str;
    }

    private void invalidateOptimizedUrl() {
        HashMap<String, String> hashMap;
        if (this.mDns != null && (hashMap = this.mOptUrlMap) != null && !hashMap.isEmpty()) {
            String originUrl = getOriginUrl();
            if (!TextUtils.isEmpty(originUrl) && this.mOptUrlMap.containsKey(originUrl) && !this.mOptUrlMap.get(originUrl).equals("INVALID_URL")) {
                this.mOptUrlMap.put(originUrl, "INVALID_URL");
                this.mOptUrlReachable = 0;
                this.mDnsOptOpen = false;
                this.mDnsOptHit = false;
                this.mEvaluatorSymbol = "";
                AVLog.iow("LiveStream", "optimized url " + this.mOptUrlMap.get(originUrl) + " is invalidated.");
            }
        }
    }

    private void setTransportBaseParams() {
        TEBundle tEBundle;
        Transport transport = this.mRTMPTransport;
        if (transport != null && (tEBundle = this.mTransportOpt) != null) {
            tEBundle.setLong("rtmp_init_video_bitrate", (long) this.mLiveStreamBuilder.getVideoBitrate());
            this.mTransportOpt.setLong("rtmp_max_video_bitrate", (long) this.mLiveStreamBuilder.getVideoMaxBitrate());
            this.mTransportOpt.setLong("rtmp_min_video_bitrate", (long) this.mLiveStreamBuilder.getVideoMinBitrate());
            this.mTransportOpt.setInt("video_width", this.mLiveStreamBuilder.getVideoWidth());
            this.mTransportOpt.setInt("video_height", this.mLiveStreamBuilder.getVideoHeight());
            this.mTransportOpt.setInt("video_fps", this.mLiveStreamBuilder.getVideoFps());
            this.mTransportOpt.setBool("transport_enable_new_update_send_cache_config", this.mLiveStreamBuilder.getPushBase().newSendCacheConfig);
            this.mTransportOpt.setBool("video_enable_accelera", this.mLiveStreamBuilder.isEnableVideoEncodeAccelera());
            transport.setParameter(this.mTransportOpt);
        }
    }

    private void setupEncodeBaseParam() {
        TEBundle tEBundle;
        MediaEncodeStream mediaEncodeStream = this.mMediaEncodeStream;
        if (mediaEncodeStream != null && (tEBundle = this.mEncodeStreamOpt) != null) {
            tEBundle.setString("video_type", chooseVideoEncode());
            this.mEncodeStreamOpt.setBool("video_enable_accelera", this.mLiveStreamBuilder.isEnableVideoEncodeAccelera());
            this.mEncodeStreamOpt.setInt("video_width", this.mLiveStreamBuilder.getVideoWidth());
            this.mEncodeStreamOpt.setInt("video_height", this.mLiveStreamBuilder.getVideoHeight());
            this.mEncodeStreamOpt.setLong("video_min_bitrate", (long) this.mLiveStreamBuilder.getVideoMinBitrate());
            this.mEncodeStreamOpt.setLong("video_max_bitrate", (long) this.mLiveStreamBuilder.getVideoMaxBitrate());
            this.mEncodeStreamOpt.setInt("video_fps", this.mLiveStreamBuilder.getVideoFps());
            mediaEncodeStream.setParameter(this.mEncodeStreamOpt);
        }
    }

    private void setupMixerParameter() {
        AudioMixer audioMixer = this.mMediaEncodeStream.getAudioMixer();
        VideoMixer videoMixer = this.mMediaEncodeStream.getVideoMixer();
        audioMixer.setEnable(this.mAudioMixer);
        videoMixer.setEnable(this.mVideoMixer);
        if (this.mLiveStreamBuilder.getPushBase().isScreenRecordDisableMixer && this.mLiveStreamBuilder.getVideoCaptureDevice() == 3) {
            videoMixer.setEnable(false);
        }
        TEBundle tEBundle = new TEBundle();
        videoMixer.getParameter(tEBundle);
        tEBundle.setInt("vmixer_bg_color", this.mVideoMixBgColor);
        videoMixer.setParameter(tEBundle);
        tEBundle.release();
    }

    @Override // com.ss.avframework.livestreamv2.ILiveStream
    public IInputVideoStream createInputVideoStream() {
        MethodCollector.i(11929);
        Handler handler = this.mVideoCaptureHandler;
        if (handler == null) {
            AVLog.logKibana(6, "LiveStream", "createInputVideoStream error: mVideoCaptureHandler is null", null);
            MethodCollector.o(11929);
            return null;
        }
        final InputVideoStream inputVideoStream = new InputVideoStream(this.mMediaEngineFactory, handler, new InputVideoStream.Observer() {
            /* class com.ss.avframework.livestreamv2.LiveStream.AnonymousClass32 */

            static {
                Covode.recordClassIndex(99916);
            }

            @Override // com.ss.avframework.livestreamv2.InputVideoStream.Observer
            public void releaseInputStream(final InputVideoStream inputVideoStream) {
                MethodCollector.i(14022);
                synchronized (LiveStream.this.mInputStreamListFence) {
                    try {
                        LiveStream.this.mInputVideoStreams.remove(inputVideoStream);
                    } catch (Throwable th) {
                        MethodCollector.o(14022);
                        throw th;
                    }
                }
                ThreadUtils.invokeAtFrontUninterruptibly(LiveStream.this.mWorkThreadHandler, new Runnable() {
                    /* class com.ss.avframework.livestreamv2.LiveStream.AnonymousClass32.AnonymousClass2 */

                    static {
                        Covode.recordClassIndex(99918);
                    }

                    public void run() {
                        VideoTrack videoTrack = inputVideoStream.getVideoTrack();
                        if (videoTrack != null && LiveStream.this.mMediaEncodeStream != null) {
                            LiveStream.this.mMediaEncodeStream.removeTrack(videoTrack);
                        }
                    }
                });
                MethodCollector.o(14022);
            }

            @Override // com.ss.avframework.livestreamv2.InputVideoStream.Observer
            public void onMixerDescriptionChange(final InputVideoStream inputVideoStream, final VideoMixer.VideoMixerDescription videoMixerDescription) {
                ThreadUtils.invokeAtFrontUninterruptibly(LiveStream.this.mWorkThreadHandler, new Runnable() {
                    /* class com.ss.avframework.livestreamv2.LiveStream.AnonymousClass32.AnonymousClass1 */

                    static {
                        Covode.recordClassIndex(99917);
                    }

                    public void run() {
                        if (inputVideoStream.getVideoTrack() != null && LiveStream.this.mMediaEncodeStream != null) {
                            LiveStream.this.mMediaEncodeStream.setVideoMixerDescription(inputVideoStream.name(), videoMixerDescription);
                        }
                    }
                });
            }
        }, this.mLiveStreamBuilder.getVideoWidth(), this.mLiveStreamBuilder.getVideoHeight(), this.mLiveStreamBuilder.getVideoFps());
        synchronized (this.mInputStreamListFence) {
            try {
                this.mInputVideoStreams.add(inputVideoStream);
            } catch (Throwable th) {
                MethodCollector.o(11929);
                throw th;
            }
        }
        ThreadUtils.invokeAtFrontUninterruptibly(this.mWorkThreadHandler, new Runnable() {
            /* class com.ss.avframework.livestreamv2.LiveStream.AnonymousClass33 */

            static {
                Covode.recordClassIndex(99919);
            }

            public void run() {
                if (LiveStream.this.mMediaEncodeStream != null) {
                    LiveStream.this.mMediaEncodeStream.addTrack(inputVideoStream.getVideoTrack());
                    LiveStream.this.mMediaEncodeStream.setVideoMixerDescription(inputVideoStream.name(), inputVideoStream.getMixerDescription());
                }
            }
        });
        MethodCollector.o(11929);
        return inputVideoStream;
    }

    /* access modifiers changed from: protected */
    public void doStart() {
        boolean z = true;
        if (this.mStatus.get() == 8) {
            AVLog.ioe("LiveStream", "Try to start live stream while mStatus is STATUS_ERROR");
            this.mErrorListener.onError(1, -102, new Exception("Error status call on start"));
        } else if (this.mStatus.get() != 3 && this.mStatus.get() != 2) {
            this.mStatus.set(3);
            this.mRtmpReConnectCounts = 0;
            this.mFirstConnect = true;
            this.mUriReachable = -1;
            this.mOptUrlReachable = -1;
            NodeOptParams nodeOptParams = this.mLiveStreamBuilder.getNodeOptParams();
            if (nodeOptParams != null) {
                boolean strategyNodeOpt = nodeOptParams.getStrategyNodeOpt();
                this.mStrategyDnsOptOpen = strategyNodeOpt;
                if (strategyNodeOpt && this.mOptUrlMap == null) {
                    this.mOptUrlMap = new HashMap<>();
                }
            }
            if (this.mDns == null && !this.mStrategyDnsOptOpen) {
                z = false;
            }
            this.mDnsOptOpen = z;
            this.mDnsOptHit = false;
            this.mEvaluatorSymbol = "";
            getOptimizedUrl();
            updateUrlPriority();
            createEncoderStream();
            setupTransport();
        }
    }

    public String getLiveStreamUrl() {
        HashMap<String, String> hashMap;
        String originUrl = getOriginUrl();
        if (!TextUtils.isEmpty(originUrl) && this.mDnsOptOpen && this.mDnsOptHit && (hashMap = this.mOptUrlMap) != null && hashMap.containsKey(originUrl)) {
            String str = this.mOptUrlMap.get(originUrl);
            if (!TextUtils.isEmpty(str) && !str.equals("INVALID_URL")) {
                originUrl = str;
            }
        }
        String disPatchedUrl = getDisPatchedUrl(originUrl);
        if (!TextUtils.isEmpty(disPatchedUrl)) {
            long j2 = this.mUrlPriority;
            if (j2 != 0) {
                disPatchedUrl = UrlUtils.AddParam(disPatchedUrl, "pri", String.valueOf(j2));
            }
        }
        if (TextUtils.isEmpty(disPatchedUrl) || TextUtils.isEmpty(getStreamUniqueId())) {
            return disPatchedUrl;
        }
        return UrlUtils.AddParam(disPatchedUrl, "_session_id", getStreamUniqueId());
    }

    public void onReleaseSafe() {
        AudioFrameAvailableSink audioFrameAvailableSink = this.mAudioFrameAvailableSink;
        if (audioFrameAvailableSink != null) {
            audioFrameAvailableSink.release();
            this.mAudioFrameAvailableSink = null;
        }
        TextureFrameAvailableSink textureFrameAvailableSink = this.mTextureFrameAvailableSink;
        if (textureFrameAvailableSink != null) {
            textureFrameAvailableSink.release();
            this.mTextureFrameAvailableSink = null;
        }
        IFilterManager iFilterManager = this.mFilterManager;
        if (iFilterManager != null) {
            if (iFilterManager instanceof FilterManager) {
                AudioFrameAvailableSink audioFrameAvailableSink2 = this.mAudioFrameAvailableSink;
                if (audioFrameAvailableSink2 != null) {
                    audioFrameAvailableSink2.removeListener((FilterManager) iFilterManager);
                }
                ((NativeObject) this.mFilterManager).release();
                this.mEffectInited = false;
            }
            this.mFilterManager = null;
        }
        MediaEngineFactory mediaEngineFactory = this.mMediaEngineFactory;
        if (mediaEngineFactory != null) {
            mediaEngineFactory.release();
            this.mMediaEngineFactory = null;
        }
        IAudioFilterManager iAudioFilterManager = this.mAudioFilterManager;
        if (iAudioFilterManager != null) {
            iAudioFilterManager.release();
            this.mAudioFilterManager = null;
        }
        this.mStatus.set(7);
    }

    private String chooseAudioEncode() {
        boolean z;
        if (this.mAvailableAudioEncoders == null) {
            String GetSupportedFormats = this.mAudioEncoderFactory.GetSupportedFormats();
            if (GetSupportedFormats != null) {
                AVLog.d("LiveStream", "Supports audio encoder list: ".concat(String.valueOf(GetSupportedFormats)));
                this.mAvailableAudioEncoders = GetSupportedFormats.split(":");
            } else {
                throw new AndroidRuntimeException("Not found any valid audio encoder");
            }
        }
        String[] strArr = this.mAvailableAudioEncoders;
        int length = strArr.length;
        int i2 = 0;
        while (true) {
            if (i2 >= length) {
                z = false;
                break;
            } else if (!TextUtils.isEmpty(strArr[i2])) {
                z = true;
                break;
            } else {
                i2++;
            }
        }
        if (!z) {
            return null;
        }
        while (this.mLiveStreamBuilder.getAudioEncoder() != 3) {
            if (this.mLiveStreamBuilder.getAudioEncoder() == 1) {
                for (String str : this.mAvailableAudioEncoders) {
                    if (str.contains("audio_type=audio/mp4a-latm")) {
                        return "audio/mp4a-latm";
                    }
                }
                AVLog.iow("LiveStream", "MediaCodec aac encoder not found, try ffmpeg aac encoder.");
                this.mLiveStreamBuilder.setAudioEncoder(3);
                this.mLiveStreamBuilder.setAudioProfile(1);
            } else if (this.mLiveStreamBuilder.getAudioEncoder() == 2) {
                AVLog.iow("LiveStream", "fdk-aac audio encoder not found, try MediaCodec.");
                this.mLiveStreamBuilder.setAudioEncoder(1);
            }
        }
        for (String str2 : this.mAvailableAudioEncoders) {
            if (str2.contains("audio_type=audio/aac")) {
                return "audio/aac";
            }
        }
        AVLog.iow("LiveStream", "ffmpeg audio encoder not found, break.");
        return null;
    }

    private void creatVideoTrack() {
        AssetManager assetManager;
        boolean z;
        int videoCaptureDevice = this.mLiveStreamBuilder.getVideoCaptureDevice();
        if (videoCaptureDevice != 0) {
            if (videoCaptureDevice == 5) {
                z = true;
            } else {
                z = false;
            }
            this.mIsRadioMode = z;
            LiveStreamVideoCapture liveStreamVideoCapture = new LiveStreamVideoCapture(videoCaptureDevice, this.mVideoCaptureHandler, this, this.mLiveStreamBuilder);
            this.mVideoCapturer = liveStreamVideoCapture;
            liveStreamVideoCapture.setBackgroundPolicy(this.mLiveStreamBuilder.getBgMode());
            this.mVideoCapturer.setDumpFrameParams(this.mLiveStreamBuilder.getDumpFrameParams());
        }
        LiveStreamVideoCapture liveStreamVideoCapture2 = this.mVideoCapturer;
        if (liveStreamVideoCapture2 != null) {
            this.mVideoTrack = this.mMediaEngineFactory.createVideoTrack(liveStreamVideoCapture2);
            IFilterManager iFilterManager = this.mFilterManager;
            if ((iFilterManager instanceof FilterManager) && !this.mEffectInited) {
                FilterManager filterManager = (FilterManager) iFilterManager;
                filterManager.setEffectAlgorithmAB(this.mLiveStreamBuilder.getEffectAlgorithmAB());
                this.mRoiSwitch.checkRoiSwitch();
                if (this.mLiveStreamBuilder.getAssetManager() instanceof AssetManager) {
                    assetManager = (AssetManager) this.mLiveStreamBuilder.getAssetManager();
                } else {
                    assetManager = null;
                }
                filterManager.configEffect(this.mLiveStreamBuilder.getVideoWidth(), this.mLiveStreamBuilder.getVideoHeight(), this.mLiveStreamBuilder.getEffectModePath(), Build.MODEL, this.mLiveStreamBuilder.isUseTTFaceDetect(), this.mLiveStreamBuilder.isUseNewEffectEngine(), this.mLiveStreamBuilder.getEffectPlatformConfig(), assetManager, this.mLiveStreamBuilder.getEffectResourceFinder());
                this.mEffectInited = true;
                filterManager.setDumpFrameParams(this.mLiveStreamBuilder.getDumpFrameParams());
            }
            IFilterManager iFilterManager2 = this.mFilterManager;
            if (iFilterManager2 instanceof FilterManager) {
                this.mVideoTrack.setVideoProcessor((VideoProcessor) iFilterManager2);
            }
            TextureFrameAvailableSink textureFrameAvailableSink = this.mTextureFrameAvailableSink;
            if (textureFrameAvailableSink != null) {
                this.mVideoTrack.addVideoSink(textureFrameAvailableSink);
            }
        }
        changeToKTVMode(this.mIsKaraokeMovie, this.mKaraokeMovie);
    }

    /* access modifiers changed from: private */
    /* renamed from: doBackgroundPause */
    public void bridge$lambda$1$LiveStream() {
        int bgMode;
        StringBuilder append = new StringBuilder("Switch to background: VideoCaptureDevice ").append(getCurrentCaptureDevice(true)).append(", AudioCaptureDevice ").append(getCurrentCaptureDevice(false)).append(", BgMode ");
        LiveStreamBuilder liveStreamBuilder = this.mLiveStreamBuilder;
        if (liveStreamBuilder == null) {
            bgMode = -1;
        } else {
            bgMode = liveStreamBuilder.getBgMode();
        }
        String sb = append.append(bgMode).append(", status ").append(this.mStatus.get()).append(", VideoCaptureStatus ").append(getCurrentCaptureStatus()).toString();
        AVLog.ioi("LiveStream", sb);
        AVLog.logKibana(5, "LiveStream", sb, null);
        LiveStreamBuilder liveStreamBuilder2 = this.mLiveStreamBuilder;
        LiveStreamVideoCapture liveStreamVideoCapture = this.mVideoCapturer;
        if (!(liveStreamVideoCapture == null || liveStreamVideoCapture.getBackgroundPolicy() == liveStreamBuilder2.getBgMode())) {
            this.mVideoCapturer.setBackgroundPolicy(liveStreamBuilder2.getBgMode());
        }
        if (this.mStatus.get() != 7 && liveStreamBuilder2 != null) {
            if (!(this.mVideoCapturer == null || liveStreamBuilder2.getBgMode() == 1)) {
                this.mVideoCapturer.pause();
            }
            if (!this.mLiveStreamBuilder.isAllowMicCaptureOnBackground()) {
                AudioCapturer audioCapturer = this.mAudioCapture;
                if (!(audioCapturer == null || !(audioCapturer instanceof LiveStreamAudioCapture) || this.mLiveStreamBuilder.getBgMode() == 1)) {
                    checkAudioCaptureCert(false);
                    ((LiveStreamAudioCapture) this.mAudioCapture).toBackground();
                }
            } else {
                AVLog.iod("LiveStream", "Allow audio capture with ignore pause");
            }
            IFilterManager iFilterManager = this.mFilterManager;
            if (iFilterManager != null) {
                iFilterManager.pauseEffect();
            }
        }
    }

    /* access modifiers changed from: private */
    /* renamed from: doBackgroundResume */
    public void bridge$lambda$0$LiveStream() {
        int bgMode;
        StringBuilder append = new StringBuilder("Switch to frontground: VideoCaptureDevice ").append(getCurrentCaptureDevice(true)).append(", AudioCaptureDevice ").append(getCurrentCaptureDevice(false)).append(", BgMode ");
        LiveStreamBuilder liveStreamBuilder = this.mLiveStreamBuilder;
        if (liveStreamBuilder == null) {
            bgMode = -1;
        } else {
            bgMode = liveStreamBuilder.getBgMode();
        }
        String sb = append.append(bgMode).append(", status ").append(this.mStatus.get()).append(", VideoCaptureStatus ").append(getCurrentCaptureStatus()).toString();
        AVLog.ioi("LiveStream", sb);
        AVLog.logKibana(5, "LiveStream", sb, null);
        LiveStreamBuilder liveStreamBuilder2 = this.mLiveStreamBuilder;
        if (this.mStatus.get() != 7 && liveStreamBuilder2 != null) {
            if (!(this.mVideoCapturer == null || liveStreamBuilder2.getBgMode() == 1)) {
                this.mVideoCapturer.resume();
            }
            if (!this.mLiveStreamBuilder.isAllowMicCaptureOnBackground()) {
                AudioCapturer audioCapturer = this.mAudioCapture;
                if (!(audioCapturer == null || !(audioCapturer instanceof LiveStreamAudioCapture) || this.mLiveStreamBuilder.getBgMode() == 1)) {
                    if (checkAudioCaptureCert(true)) {
                        ((LiveStreamAudioCapture) this.mAudioCapture).toFront();
                    } else {
                        return;
                    }
                }
            } else {
                AVLog.iod("LiveStream", "Allow audio capture with ignore resume");
            }
            IFilterManager iFilterManager = this.mFilterManager;
            if (iFilterManager != null) {
                iFilterManager.resumeEffect();
            }
        }
    }

    private void setupSITIParameter() {
        TEBundle tEBundle = new TEBundle();
        try {
            LiveSdkSetting sdkSetting = this.mLiveStreamBuilder.getSdkSetting();
            if (sdkSetting.enableSiti) {
                TEBundle tEBundle2 = new TEBundle();
                tEBundle2.setInt("resize_width", this.mLiveStreamBuilder.getVideoWidth());
                tEBundle2.setInt("resize_height", this.mLiveStreamBuilder.getVideoHeight());
                tEBundle2.setInt("publish_width", this.mLiveStreamBuilder.getVideoWidth());
                tEBundle2.setInt("publish_height", this.mLiveStreamBuilder.getVideoHeight());
                TEBundle tEBundle3 = new TEBundle();
                tEBundle3.setInt("cur_cplx_category", -1);
                tEBundle3.setInt("publish_width", this.mLiveStreamBuilder.getVideoWidth());
                tEBundle3.setInt("publish_height", this.mLiveStreamBuilder.getVideoHeight());
                tEBundle3.setInt("publish_def_bitrate", this.mLiveStreamBuilder.getVideoBitrate());
                tEBundle3.setInt("publish_min_bitrate", this.mLiveStreamBuilder.getVideoMinBitrate());
                tEBundle3.setInt("publish_max_bitrate", this.mLiveStreamBuilder.getVideoMaxBitrate());
                tEBundle3.setInt("qulity_mode", sdkSetting.encStrategyConfig.getQualityMode());
                SitiConfig sitiConfig = sdkSetting.sitiConfig;
                tEBundle2.setBool("using_gpu", sitiConfig.getUsingGpu());
                tEBundle2.setInt("thread_count", sitiConfig.getThreadCount());
                tEBundle2.setInt("period_ms", sitiConfig.getPeriodMs());
                int videoFps = this.mLiveStreamBuilder.getVideoFps() / (sitiConfig.getFramesCountsCalcSiti() / sitiConfig.getExtractDuration());
                tEBundle2.setInt("extract_frame_gap", videoFps);
                tEBundle2.setInt("frames_counts_calc_siti", sitiConfig.getFramesCountsCalcSiti());
                tEBundle.setBundle("siti_config", tEBundle2);
                tEBundle.setBundle("enc_strategy_config", tEBundle3);
                this.mSITICalculator.setParameters(tEBundle);
                AVLog.iod("LiveStream", "SITIStrategy siti config extract_frame_gap:".concat(String.valueOf(videoFps)));
            }
        } catch (Exception unused) {
        }
        tEBundle.release();
    }

    public void addTrackToEncodeStream() {
        AudioTrack audioTrack;
        VideoTrack videoTrack;
        MediaEncodeStream mediaEncodeStream = this.mMediaEncodeStream;
        if (!(mediaEncodeStream == null || (videoTrack = this.mVideoTrack) == null)) {
            mediaEncodeStream.removeTrack(videoTrack);
            removeStreamsFromEncodeStream(true);
            this.mMediaEncodeStream.addTrack(this.mVideoTrack);
            this.mMediaEncodeStream.setOriginVideoTrack(this.mVideoTrack.id());
            AVLog.iow("LiveStream-StreamTrace", "setOriginVideoTrack to:" + this.mVideoTrack.id() + ",Orig Track is:" + getOriginInputVideoStream().name());
            addStreamsToEncodeStream(true);
            this.mMediaEncodeStream.setVideoMixerDescription(this.mVideoTrack.id(), this.mOriginVideoStreamDescription);
        }
        MediaEncodeStream mediaEncodeStream2 = this.mMediaEncodeStream;
        if (!(mediaEncodeStream2 == null || (audioTrack = this.mAudioTrack) == null)) {
            mediaEncodeStream2.removeTrack(audioTrack);
            removeStreamsFromEncodeStream(false);
            this.mMediaEncodeStream.addTrack(this.mAudioTrack);
            this.mMediaEncodeStream.setOriginAudioTrack(this.mAudioTrack.id());
            addStreamsToEncodeStream(false);
            this.mMediaEncodeStream.setAudioMixerDescription(this.mAudioTrack.id(), this.mOriginAudioStreamDescription);
            AudioCapturer audioCapturer = this.mAudioCapture;
            if (audioCapturer != null) {
                audioCapturer.resume();
            }
        }
        IAudioFilterManager iAudioFilterManager = this.mAudioFilterManager;
        if (iAudioFilterManager != null) {
            iAudioFilterManager.start();
        }
        changeToKTVMode(this.mIsKaraokeMovie, this.mKaraokeMovie);
    }

    /* access modifiers changed from: protected */
    public void createEncoderStream() {
        if (this.mVideoEncoderFactory == null) {
            this.mVideoEncoderFactory = new DefaultVideoEncoderFactory();
        }
        if (this.mAudioEncoderFactory == null) {
            this.mAudioEncoderFactory = new DefaultAudioEncoderFactory();
        }
        if (this.mRTMPTransport == null) {
            this.mRTMPTransport = createTransport();
            for (Map.Entry<String, UserMetadata> entry : this.mUserMetadata.entrySet()) {
                UserMetadata value = entry.getValue();
                this.mRTMPTransport.addUserMetaData(value.key, value.value, value.flag);
            }
            this.mTransportOpt = this.mRTMPTransport.getParameter();
        }
        if (this.mMediaEncodeStream == null) {
            MediaEncodeStream createMediaEncodeStream = this.mMediaEngineFactory.createMediaEncodeStream(this.mVideoEncoderFactory, this.mAudioEncoderFactory, this.mRTMPTransport);
            this.mMediaEncodeStream = createMediaEncodeStream;
            this.mEncodeStreamOpt = createMediaEncodeStream.getParameter();
            this.mMediaEncodeStream.setIsAddCropInfo(this.mLiveStreamBuilder.isAddCropSeiInfo());
            this.mMediaEncodeStream.registerObserver(this);
            this.mMediaEncodeStream.setEstimateTimeInterval((int) this.mUploadLogInterval);
            this.mMediaEncodeStream.start();
        }
        if (this.mLiveStreamStrategy == null) {
            LiveStreamStrategy liveStreamStrategy = new LiveStreamStrategy(this.mEncodeStreamOpt, this.mTransportOpt, this);
            liveStreamStrategy.setLiveStreamBuilder(this.mLiveStreamBuilder);
            this.mLiveStreamStrategy = liveStreamStrategy;
        }
        setupParameter();
    }

    /* access modifiers changed from: protected */
    public void destroyEncodeStream() {
        AudioTrack audioTrack;
        VideoTrack videoTrack;
        LiveStreamBaseStrategy liveStreamBaseStrategy = this.mLiveStreamStrategy;
        if (liveStreamBaseStrategy != null) {
            liveStreamBaseStrategy.release();
            this.mLiveStreamStrategy = null;
        }
        MediaEncodeStream mediaEncodeStream = this.mMediaEncodeStream;
        if (mediaEncodeStream != null) {
            mediaEncodeStream.stop();
        }
        MediaEncodeStream mediaEncodeStream2 = this.mMediaEncodeStream;
        if (!(mediaEncodeStream2 == null || (videoTrack = this.mVideoTrack) == null)) {
            mediaEncodeStream2.removeTrack(videoTrack);
            removeStreamsFromEncodeStream(true);
        }
        MediaEncodeStream mediaEncodeStream3 = this.mMediaEncodeStream;
        if (!(mediaEncodeStream3 == null || (audioTrack = this.mAudioTrack) == null)) {
            mediaEncodeStream3.removeTrack(audioTrack);
            removeStreamsFromEncodeStream(false);
        }
        this.mReportFence.writeLock().lock();
        TEBundle tEBundle = this.mEncodeStreamOpt;
        if (tEBundle != null) {
            tEBundle.release();
            this.mEncodeStreamOpt = null;
        }
        if (this.mEncodeFrameSink != null) {
            VideoMixer videoMixer = this.mMediaEncodeStream.getVideoMixer();
            if (videoMixer != null) {
                videoMixer.removeVideoSink(this.mEncodeFrameSink);
            }
            this.mEncodeFrameSink.release();
            this.mEncodeFrameSink = null;
        }
        VideoDumpProxy.RawVideoDumperProxy rawVideoDumperProxy = this.mEncodeFrameDumper;
        if (rawVideoDumperProxy != null) {
            rawVideoDumperProxy.release();
            this.mEncodeFrameDumper = null;
        }
        MediaEncodeStream mediaEncodeStream4 = this.mMediaEncodeStream;
        if (mediaEncodeStream4 != null) {
            mediaEncodeStream4.registerObserver(null);
            this.mMediaEncodeStream.release();
            this.mMediaEncodeStream = null;
        }
        AudioEncoderFactory audioEncoderFactory = this.mAudioEncoderFactory;
        if (audioEncoderFactory != null) {
            audioEncoderFactory.release();
            this.mAudioEncoderFactory = null;
        }
        TEBundle tEBundle2 = this.mTransportOpt;
        if (tEBundle2 != null) {
            tEBundle2.release();
            this.mTransportOpt = null;
        }
        Transport transport = this.mRTMPTransport;
        if (transport != null) {
            transport.release();
            this.mRTMPTransport = null;
        }
        this.mReportFence.writeLock().unlock();
        IAudioFilterManager iAudioFilterManager = this.mAudioFilterManager;
        if (iAudioFilterManager != null) {
            iAudioFilterManager.stop();
        }
        LiveStreamLogService liveStreamLogService = this.mStreamLogService;
        if (liveStreamLogService != null) {
            liveStreamLogService.onConnectEnd(this.mStatus.get());
        }
    }

    /* access modifiers changed from: protected */
    public void doStartVideoSource() {
        VideoSink videoSink;
        if (this.mStatus.get() == 8) {
            AVLog.ioe("LiveStream", "Try to start video capture while mStatus is STATUS_ERROR");
            this.mErrorListener.onError(1, -101, new Exception("Error status call on start"));
            return;
        }
        LiveStreamVideoCapture liveStreamVideoCapture = this.mVideoCapturer;
        if (liveStreamVideoCapture == null || liveStreamVideoCapture.status() != 1) {
            AVLog.logKibana(4, "LiveStream", "Call startVideoCapture. VideoCaptureDevice" + this.mLiveStreamBuilder.getVideoCaptureDevice(), null);
            creatVideoTrack();
            VideoTrack videoTrack = this.mVideoTrack;
            if (!(videoTrack == null || (videoSink = this.mRenderView) == null)) {
                videoTrack.addVideoSink(videoSink);
            }
            if (this.mVideoCapturer != null) {
                ILiveStream.ILiveStreamInfoListener iLiveStreamInfoListener = this.mInfoListener;
                if (iLiveStreamInfoListener != null) {
                    iLiveStreamInfoListener.onInfo(4, 0, 0);
                }
                this.mVideoCapturer.updateScreenIntent(this.mLiveStreamBuilder.getScreenCaptureIntent());
                adaptedVideoResolution(this.mLiveStreamBuilder.getCaptureAdaptedWidth(), this.mLiveStreamBuilder.getCaptureAdaptedHeight(), this.mLiveStreamBuilder.getVideoFps());
                this.mVideoCapturer.start(this.mLiveStreamBuilder.getVideoCaptureWidth(), this.mLiveStreamBuilder.getVideoCaptureHeight(), this.mLiveStreamBuilder.getVideoCaptureFps());
                return;
            }
            return;
        }
        AVLog.iow("LiveStream", "Already start video capture");
    }

    /* access modifiers changed from: protected */
    public void getOptimizedUrl() {
        HashMap<String, String> hashMap;
        String originUrl = getOriginUrl();
        if (!TextUtils.isEmpty(originUrl)) {
            if ((this.mDns == null && !this.mStrategyDnsOptOpen) || isNodeOptDisabled(originUrl)) {
                if (this.mDns != null) {
                    AVLog.iow("LiveStream", "Dns optimize disabled via vpass.");
                }
                this.mDnsOptOpen = false;
            }
            if (this.mDnsOptOpen && (hashMap = this.mOptUrlMap) != null && hashMap.containsKey(originUrl) && this.mOptUrlMap.get(originUrl).equals("INVALID_URL")) {
                this.mDnsOptOpen = false;
            }
            this.mDnsOptHit = false;
            this.mEvaluatorSymbol = "";
            if (this.mDnsOptOpen && this.mOptUrlMap != null) {
                try {
                    String[] optUrlAndEvaluateSymbol = getOptUrlAndEvaluateSymbol(this.mDns, originUrl);
                    if (optUrlAndEvaluateSymbol != null && optUrlAndEvaluateSymbol.length == 2) {
                        if (!TextUtils.isEmpty(optUrlAndEvaluateSymbol[0])) {
                            this.mOptUrlMap.put(originUrl, optUrlAndEvaluateSymbol[0]);
                            this.mDnsOptHit = true;
                            AVLog.ioi("LiveStream", "Dns optimize hit: optimized url " + optUrlAndEvaluateSymbol[0] + ", evaluate symbol " + optUrlAndEvaluateSymbol[1]);
                            String str = optUrlAndEvaluateSymbol[1];
                            this.mEvaluatorSymbol = str;
                            if (TextUtils.isEmpty(str)) {
                                this.mEvaluatorSymbol = "sdk_previous_dns";
                            }
                        }
                    }
                } catch (Exception e2) {
                    e2.printStackTrace();
                }
            }
        }
    }

    /* JADX WARNING: Failed to process nested try/catch */
    /* JADX WARNING: Missing exception handler attribute for start block: B:36:0x009a */
    @Override // com.ss.avframework.livestreamv2.ILiveStream
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public synchronized void release() {
        /*
        // Method dump skipped, instructions count: 247
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ss.avframework.livestreamv2.LiveStream.release():void");
    }

    public void rtmpReconnect() {
        if (this.mStatus.get() == 8 || this.mStatus.get() == 7) {
            AVLog.ioe("LiveStream", "Try to reconnect rtmp while mStatus is " + this.mStatus.get());
            this.mErrorListener.onError(1, -103, new Exception("Error status call on rtmpReconnect"));
            return;
        }
        this.mStatus.set(3);
        this.mStreamLogService.onReconnect();
        int i2 = this.mRtmpReConnectCounts + 1;
        this.mRtmpReConnectCounts = i2;
        this.mInfoListener.onInfo(15, i2, 0);
        AVLog.ioi("LiveStream", "Reconnect with " + getLiveStreamUrl() + ", current reconnect count " + this.mRtmpReConnectCounts);
        if (this.mStatus.get() == 2 || this.mStatus.get() == 3) {
            destroyEncodeStream();
            getOptimizedUrl();
            createEncoderStream();
            setupTransport();
            return;
        }
        AVLog.ioe("LiveStream", "mStatus status is " + this.mStatus.get() + " on rtmpReconnect");
        doStop();
    }

    private String chooseVideoEncode() {
        String str;
        loop0:
        while (true) {
            if (this.mAvailableVideoEncoders == null) {
                String GetSupportedFormats = this.mVideoEncoderFactory.GetSupportedFormats();
                if (GetSupportedFormats != null) {
                    AVLog.d("LiveStream", "Supports video encoder list:".concat(String.valueOf(GetSupportedFormats)));
                    this.mAvailableVideoEncoders = GetSupportedFormats.split(":");
                } else {
                    throw new AndroidRuntimeException("Not found any valid video encoder");
                }
            }
            str = null;
            boolean isEnableVideoEncodeAccelera = this.mLiveStreamBuilder.isEnableVideoEncodeAccelera();
            boolean isHWEncodeOesDirectly = this.mLiveStreamBuilder.isHWEncodeOesDirectly();
            if (this.mLiveStreamBuilder.getVideoEncoder() != 1) {
                if (this.mLiveStreamBuilder.getVideoEncoder() != 2) {
                    break;
                }
                String[] strArr = this.mAvailableVideoEncoders;
                for (String str2 : strArr) {
                    if (!str2.contains("video_type=video/bytevc1") || isEnableVideoEncodeAccelera != str2.contains("video_enable_accelera=true") || (isHWEncodeOesDirectly && isEnableVideoEncodeAccelera && !str2.contains("oes_texture_frame=true"))) {
                    }
                }
                String str3 = "ByteVC1 hardware";
                String str4 = "hardware";
                if (this.mLiveStreamBuilder.getEncoderDowngradeOptimize()) {
                    StringBuilder sb = new StringBuilder("ByteVC1 ");
                    if (!isEnableVideoEncodeAccelera) {
                        str4 = "software";
                    }
                    AVLog.iow("LiveStream", sb.append(str4).append(" encoder not found, use H.264 hardware encoder instead.").toString());
                    if (!isEnableVideoEncodeAccelera) {
                        str3 = "ByteVC1 software";
                    }
                    uploadVideoEncoderChangeLog(str3, "h264 hardware");
                    this.mLiveStreamBuilder.setVideoEncoder(1);
                    this.mLiveStreamBuilder.setEnableVideoEncodeAccelera(true);
                    this.mLiveStreamBuilder.setVideoProfile(3);
                } else {
                    StringBuilder sb2 = new StringBuilder("ByteVC1 ");
                    if (!isEnableVideoEncodeAccelera) {
                        str4 = "software";
                    }
                    AVLog.iow("LiveStream", sb2.append(str4).append(" encoder not found, use H.264 software encoder instead.").toString());
                    if (!isEnableVideoEncodeAccelera) {
                        str3 = "ByteVC1 software";
                    }
                    uploadVideoEncoderChangeLog(str3, "h264 software");
                    this.mLiveStreamBuilder.setVideoEncoder(1);
                    this.mLiveStreamBuilder.setEnableVideoEncodeAccelera(false);
                    if (getResolutionLevel(this.mLiveStreamBuilder.getVideoWidth(), this.mLiveStreamBuilder.getVideoHeight()) >= 4) {
                        this.mLiveStreamBuilder.setVideoProfile(1);
                    } else {
                        this.mLiveStreamBuilder.setVideoProfile(3);
                    }
                }
            } else {
                if (isEnableVideoEncodeAccelera) {
                    String[] strArr2 = this.mAvailableVideoEncoders;
                    int length = strArr2.length;
                    int i2 = 0;
                    while (true) {
                        if (i2 >= length) {
                            break;
                        }
                        String str5 = strArr2[i2];
                        if (!str5.contains("video_enable_accelera=true") || !str5.contains("video_type=video/avc") || (isHWEncodeOesDirectly && !str5.contains("oes_texture_frame=true"))) {
                            i2++;
                        }
                    }
                    str = "video/avc";
                }
                str = getSoftVideoCodec();
                if (str != null) {
                    this.mLiveStreamBuilder.setEnableVideoEncodeAccelera(false);
                    AVLog.iow("LiveStream", a.a("Hardware video encoder not found, use %s instead.", new Object[]{str}));
                    uploadVideoEncoderChangeLog("h264 hardware", "h264 software");
                }
            }
        }
        str = "video/bytevc1";
        AVLog.ioi("LiveStream", "Use video encoder: ".concat(String.valueOf(str)));
        return str;
    }

    private void createAudioTrack() {
        int audioCaptureDevice = this.mLiveStreamBuilder.getAudioCaptureDevice();
        if (audioCaptureDevice == 1) {
            this.mAudioCapture = new LiveStreamAudioCapture(this.mAudioRecordMode, audioCaptureDevice, this.mLiveStreamBuilder.getAudioCaptureSampleHZ(), this.mLiveStreamBuilder.getAudioCaptureChannel(), this.mLiveStreamBuilder.getAudioCaptureBitwidth(), null, this, this.mMediaEngineFactory, this.mLiveStreamBuilder.getBgMode());
        } else if (audioCaptureDevice == 4) {
            this.mAudioCapture = new AudioCapturerExternal(this.mLiveStreamBuilder.getAudioCaptureSampleHZ(), this.mLiveStreamBuilder.getAudioCaptureChannel(), this.mLiveStreamBuilder.getAudioCaptureBitwidth(), null, this);
        } else {
            this.mAudioCapture = new LiveStreamAudioCaptureFromADM(this.mAudioRecordMode, audioCaptureDevice, this.mLiveStreamBuilder.getAudioCaptureSampleHZ(), this.mLiveStreamBuilder.getAudioCaptureChannel(), this.mLiveStreamBuilder.getAudioCaptureBitwidth(), null, this, this.mMediaEngineFactory, this.mLiveStreamBuilder.getBgMode(), this.mAudioDeviceModule);
        }
        if (this.mAudioDeviceModule != null) {
            if (Build.VERSION.SDK_INT >= 24) {
                AnonymousClass9 r3 = new AudioManager.AudioRecordingCallback() {
                    /* class com.ss.avframework.livestreamv2.LiveStream.AnonymousClass9 */

                    static {
                        Covode.recordClassIndex(99934);
                    }

                    @Override // android.media.AudioManager.AudioRecordingCallback
                    public void onRecordingConfigChanged(List<AudioRecordingConfiguration> list) {
                        super.onRecordingConfigChanged(list);
                        if (list.size() > 0) {
                            AudioRecordingConfiguration audioRecordingConfiguration = list.get(0);
                            if (Build.VERSION.SDK_INT >= 29 && LiveStream.this.mStreamLogService != null && audioRecordingConfiguration != null) {
                                LiveStream.this.mStreamLogService.onSessionInterrupt(audioRecordingConfiguration.isClientSilenced());
                            }
                        }
                    }
                };
                this.mAudioRecordingCallback = r3;
                this.mAudioDeviceModule.registerAudioRecordingCallback(r3, this.mWorkThreadHandler);
            }
            this.mAudioCapture.setAudioDeviceModule(this.mAudioDeviceModule);
        }
        AudioCapturer audioCapturer = this.mAudioCapture;
        if (audioCapturer != null) {
            this.mAudioTrack = this.mMediaEngineFactory.createAudioTrack(audioCapturer);
            if (this.mAudioDeviceModule != null) {
                if (this.mLiveStreamBuilder.getAudioCaptureDevice() == 5) {
                    this.mAudioDeviceModule.setExternalRecording(false);
                } else {
                    this.mAudioDeviceModule.setExternalRecording(true, this.mAudioCapture);
                }
            }
            this.mAudioCapture.setCalculatePcmPowerEventObserver(this);
            this.mAudioCapture.setAudioQuantizeGapPeriod((long) this.mLiveStreamBuilder.getAudioQuantizeGapPeriod());
        }
        AudioCapturer audioCapturer2 = this.mAudioCapture;
        if (audioCapturer2 != null) {
            audioCapturer2.setOutputFormat(this.mLiveStreamBuilder.getAudioSampleHZ(), this.mLiveStreamBuilder.getAudioChannel(), this.mLiveStreamBuilder.getAudioBitwidth());
            AudioDeviceModule audioDeviceModule = this.mAudioDeviceModule;
            if (audioDeviceModule != null) {
                TEBundle parameter = audioDeviceModule.getParameter();
                parameter.setInt("audio_sample", this.mLiveStreamBuilder.getAudioCaptureSampleHZ());
                parameter.setInt("audio_channels", this.mLiveStreamBuilder.getAudioCaptureChannel());
                parameter.setInt("audio_bit_width", this.mLiveStreamBuilder.getAudioBitwidth());
                this.mAudioDeviceModule.setParameter(parameter);
            }
        }
    }

    public void doStartAudioSource() {
        int startRecording;
        if (this.mStatus.get() == 8) {
            AVLog.ioe("LiveStream", "Try to start audio capture while mStatus is STATUS_ERROR");
            this.mErrorListener.onError(1, -100, new Exception("Error status call on start"));
        } else if (this.mStatus.get() != 7) {
            AudioCapturer audioCapturer = this.mAudioCapture;
            if (audioCapturer == null || audioCapturer.status() != 1) {
                createAudioTrack();
                AudioDeviceModule audioDeviceModule = this.mAudioDeviceModule;
                if (audioDeviceModule == null || !audioDeviceModule.isExternalRecording() || (startRecording = this.mAudioDeviceModule.startRecording()) == 0) {
                    if (this.mAudioTrack != null) {
                        this.mInfoListener.onInfo(7, 0, 0);
                        try {
                            this.mAudioCapture.start();
                            int updateChannel = this.mAudioCapture.updateChannel();
                            if (updateChannel != this.mLiveStreamBuilder.getAudioCaptureChannel()) {
                                this.mInfoListener.onInfo(17, updateChannel, 0);
                            }
                            this.mLiveStreamBuilder.setAudioCaptureChannel(updateChannel);
                            this.tryOpenAudioCaptureOnLater = true;
                        } catch (Exception e2) {
                            if (this.tryOpenAudioCaptureOnLater) {
                                this.tryOpenAudioCaptureOnLater = false;
                                AVLog.iow("LiveStream", "Open capture failed(" + e2.getCause() + "(" + Log.getStackTraceString(e2) + ")) with try open audio capture at after 400 ms later");
                                this.mWorkThreadHandler.postDelayed(new Runnable() {
                                    /* class com.ss.avframework.livestreamv2.LiveStream.AnonymousClass8 */

                                    static {
                                        Covode.recordClassIndex(99933);
                                    }

                                    public void run() {
                                        LiveStream.this.doStopAudioSource();
                                        LiveStream.this.doStartAudioSource();
                                    }
                                }, 400);
                                return;
                            }
                            this.mStatus.set(8);
                            AVLog.ioe("LiveStream", "Start audio capture failed: " + e2.toString());
                            this.mErrorListener.onError(3, -300, e2);
                        }
                        if (this.mAudioCapture.status() == 1) {
                            RecorderManager recorderManager = this.mRecorderManager;
                            if (recorderManager != null) {
                                recorderManager.setupAudioSource(this.mAudioCapture);
                            }
                            addCapturedAudioFrameSinks();
                            if (this.mAudioFrameAvailableSink != null) {
                                this.mAudioCapture.resume();
                            }
                            AVLog.ioi("LiveStream", "Start audio capture success");
                            this.mInfoListener.onInfo(8, 0, 0);
                        } else {
                            this.mStatus.set(8);
                            AVLog.ioe("LiveStream", "Start audio capture failed: mAudioCapture's status is " + this.mAudioCapture.status());
                            this.mErrorListener.onError(3, -301, new Exception("Audio capture start fail"));
                        }
                    }
                    if (onCanEncodeStream()) {
                        addTrackToEncodeStream();
                        return;
                    }
                    return;
                }
                this.mStatus.set(8);
                AVLog.ioe("LiveStream", "AudioDeviceModule.startRecording() failed: ".concat(String.valueOf(startRecording)));
                this.mErrorListener.onError(7, startRecording, new Exception("ADM startRecording error."));
                return;
            }
            AVLog.iow("LiveStream", "Already start audio capture");
        }
    }

    private void setupParameter() {
        boolean z;
        int i2;
        String str;
        String chooseVideoEncode = chooseVideoEncode();
        boolean isEnableVideoEncodeAccelera = this.mLiveStreamBuilder.isEnableVideoEncodeAccelera();
        int chooseProfileLevel = chooseProfileLevel();
        String chooseAudioEncode = chooseAudioEncode();
        boolean isEnableAudioEncodeAccelera = this.mLiveStreamBuilder.isEnableAudioEncodeAccelera();
        int chooseAudioProfileLevel = chooseAudioProfileLevel();
        if (this.mRTMPTransport != null) {
            AVLog.d("LiveStream", "Dump default rtmp config:");
            this.mTransportOpt.dump();
            this.mTransportOpt.setLong("sei_ntp_time_shift", this.mSeiCurrentShiftDiffTime);
            this.mTransportOpt.setLong("rtmp_init_audio_bitrate", (long) this.mLiveStreamBuilder.getAudioBitrate());
            this.mTransportOpt.setLong("rtmp_init_video_bitrate", (long) this.mLiveStreamBuilder.getVideoBitrate());
            this.mTransportOpt.setLong("rtmp_max_video_bitrate", (long) this.mLiveStreamBuilder.getVideoMaxBitrate());
            this.mTransportOpt.setLong("rtmp_min_video_bitrate", (long) this.mLiveStreamBuilder.getVideoMinBitrate());
            this.mTransportOpt.setInt("rtmp_bw_est_strategy", this.mLiveStreamBuilder.getBitrateAdaptStrategy());
            this.mTransportOpt.setBool("rtmp_use_self_developed", this.mLiveStreamBuilder.isUseSelfDevelopedRtmp());
            this.mTransportOpt.setString("qos_id", this.mLiveStreamBuilder.getQosId());
            this.mTransportOpt.setBool("transport_enable_new_update_send_cache_config", this.mLiveStreamBuilder.getPushBase().newSendCacheConfig);
            this.mTransportOpt.setBool("enable_rtmp_stop_poll", this.mLiveStreamBuilder.getEnableRtmpStopPoll());
            this.mTransportOpt.setInt("rtmp_time_poll_rotation", this.mLiveStreamBuilder.getRmtpTimeRotation());
            if (this.mLiveStreamBuilder.getLiveAuthString() != null) {
                this.mTransportOpt.setString("live_auth_string", this.mLiveStreamBuilder.getLiveAuthString());
            }
            if (this.mLiveStreamBuilder.isEnableVideoNtp()) {
                List<String> ntpServers = this.mLiveStreamBuilder.getNtpServers();
                String str2 = "";
                int i3 = 0;
                while (ntpServers != null && i3 < ntpServers.size()) {
                    if (!TextUtils.isEmpty(ntpServers.get(i3))) {
                        StringBuilder append = new StringBuilder().append(str2);
                        if (str2.isEmpty()) {
                            str = str2;
                        } else {
                            str = "\n";
                        }
                        str2 = append.append(str).append(ntpServers.get(i3)).toString();
                    }
                    i3++;
                }
                if (!TextUtils.isEmpty(str2)) {
                    this.mTransportOpt.setBool("video_enable_ntp", true);
                    this.mTransportOpt.setString("ntp_servers", str2);
                }
            } else {
                this.mTransportOpt.setBool("video_enable_ntp", false);
            }
            this.mTransportOpt.setString("video_type", chooseVideoEncode);
            this.mTransportOpt.setBool("video_enable_accelera", isEnableVideoEncodeAccelera);
            this.mTransportOpt.setInt("video_width", this.mLiveStreamBuilder.getVideoWidth());
            this.mTransportOpt.setInt("video_height", this.mLiveStreamBuilder.getVideoHeight());
            this.mTransportOpt.setInt("video_profileLevel", chooseProfileLevel);
            this.mTransportOpt.setInt("video_fps", this.mLiveStreamBuilder.getVideoFps());
            this.mTransportOpt.setInt("video_gop", getVideoGop());
            this.mTransportOpt.setString("audio_type", chooseAudioEncode);
            this.mTransportOpt.setBool("audio_enable_accelera", isEnableAudioEncodeAccelera);
            this.mTransportOpt.setInt("audio_channels", this.mLiveStreamBuilder.getAudioChannel());
            this.mTransportOpt.setInt("audio_sample", this.mLiveStreamBuilder.getAudioSampleHZ());
            this.mTransportOpt.setInt("audio_bit_width", this.mLiveStreamBuilder.getAudioBitwidth());
            this.mTransportOpt.setLong("audio_bit_rate", (long) this.mLiveStreamBuilder.getAudioBitrate());
            this.mTransportOpt.setInt("audio_profileLevel", chooseAudioProfileLevel);
            this.mTransportOpt.setBool("hit_node_optimize", this.mDnsOptHit);
            String rtmpTcUrl = getRtmpTcUrl();
            if (!TextUtils.isEmpty(rtmpTcUrl)) {
                this.mTransportOpt.setString("rtmp_tc_url", rtmpTcUrl);
            }
            this.mTransportOpt.setString("session_id", getStreamUniqueId());
            this.mTransportOpt.setBool("rts_support_video_rtx", this.mLiveStreamBuilder.rtsSupportVideoRtx());
            this.mTransportOpt.setBool("rts_enable_dtls", this.mLiveStreamBuilder.rtsEnableDtls());
            this.mTransportOpt.setBool("rts_allow_ignore_br_adjust", this.mLiveStreamBuilder.rtsAllowIgnoreBrAdjust());
            this.mTransportOpt.setInt("rts_start_no_br_adjust_ms", this.mLiveStreamBuilder.rtsStartNoBrAdjustMs());
            if (this.mLiveStreamBuilder.getKcpParams() != null) {
                KcpParams kcpParams = this.mLiveStreamBuilder.getKcpParams();
                TEBundle tEBundle = new TEBundle();
                if (NumberInitializer.isDefined(Integer.valueOf(kcpParams.wndRecv))) {
                    tEBundle.setInt("wnd_recv", kcpParams.wndRecv);
                }
                if (NumberInitializer.isDefined(Integer.valueOf(kcpParams.wndSend))) {
                    tEBundle.setInt("wnd_send", kcpParams.wndSend);
                }
                if (NumberInitializer.isDefined(Integer.valueOf(kcpParams.mtuSize))) {
                    tEBundle.setInt("mtu_size", kcpParams.mtuSize);
                }
                if (NumberInitializer.isDefined(Integer.valueOf(kcpParams.fastAck))) {
                    tEBundle.setInt("fast_ack", kcpParams.fastAck);
                }
                if (NumberInitializer.isDefined(Integer.valueOf(kcpParams.bwinit))) {
                    tEBundle.setInt("bwinit", kcpParams.bwinit);
                }
                if (NumberInitializer.isDefined(Integer.valueOf(kcpParams.bwmin))) {
                    tEBundle.setInt("bwmin", kcpParams.bwmin);
                }
                if (NumberInitializer.isDefined(Integer.valueOf(kcpParams.window))) {
                    tEBundle.setInt("window", kcpParams.window);
                }
                if (NumberInitializer.isDefined(Integer.valueOf(kcpParams.probebw))) {
                    tEBundle.setInt("probebw", kcpParams.probebw);
                }
                if (NumberInitializer.isDefined(Integer.valueOf(kcpParams.preempt))) {
                    tEBundle.setInt("preempt", kcpParams.preempt);
                }
                if (NumberInitializer.isDefined(Integer.valueOf(kcpParams.jitter))) {
                    tEBundle.setInt("jitter", kcpParams.jitter);
                }
                if (NumberInitializer.isDefined(Integer.valueOf(kcpParams.timeout))) {
                    tEBundle.setInt("timeout", kcpParams.timeout);
                }
                if (NumberInitializer.isDefined(Integer.valueOf(kcpParams.retrans))) {
                    tEBundle.setInt("retrans", kcpParams.retrans);
                }
                if (NumberInitializer.isDefined(Integer.valueOf(kcpParams.report))) {
                    tEBundle.setInt("report", kcpParams.report);
                }
                if (NumberInitializer.isDefined(Double.valueOf(kcpParams.lost))) {
                    tEBundle.setDouble("lost", kcpParams.lost);
                }
                if (NumberInitializer.isDefined(Integer.valueOf(kcpParams.fec))) {
                    tEBundle.setInt("fec", kcpParams.fec);
                }
                if (NumberInitializer.isDefined(Integer.valueOf(kcpParams.logMask))) {
                    tEBundle.setInt("logmask", kcpParams.logMask);
                }
                this.mTransportOpt.setBundle("kcp_params", tEBundle);
                tEBundle.release();
            }
            if (this.mLiveStreamBuilder.getQuicParams() != null) {
                QuicParams quicParams = this.mLiveStreamBuilder.getQuicParams();
                TEBundle tEBundle2 = new TEBundle();
                if (NumberInitializer.isDefined(Integer.valueOf(quicParams.getEnableSaveScfg()))) {
                    tEBundle2.setString("scfg_address", com_ss_avframework_livestreamv2_LiveStream_com_ss_android_ugc_aweme_lancet_ContextLancet_getFilesDir(com_ss_avframework_livestreamv2_LiveStream_com_ss_android_ugc_aweme_lancet_launch_ApplicationContextLancet_getApplicationContext(this.mLiveStreamBuilder.getContext())).getAbsolutePath() + File.separator + "pushstream.scfg");
                }
                if (NumberInitializer.isDefined(Integer.valueOf(quicParams.getCongestionType()))) {
                    tEBundle2.setInt("congestion_type", quicParams.getCongestionType());
                }
                if (NumberInitializer.isDefined(Integer.valueOf(quicParams.getLossDetectionType()))) {
                    tEBundle2.setInt("loss_detection_type", quicParams.getLossDetectionType());
                }
                if (NumberInitializer.isDefined(Integer.valueOf(quicParams.getQuicVersion()))) {
                    tEBundle2.setInt("quic_version", quicParams.getQuicVersion());
                }
                if (NumberInitializer.isDefined(Integer.valueOf(quicParams.getLogLevel()))) {
                    tEBundle2.setInt("log_level", quicParams.getLogLevel());
                }
                if (NumberInitializer.isDefined(Integer.valueOf(quicParams.getAdatEstBwToQuicBw()))) {
                    tEBundle2.setInt("adapt_est_bw_to_quic_bw", quicParams.getAdatEstBwToQuicBw());
                }
                if (NumberInitializer.isDefined(Integer.valueOf(quicParams.getEnableCertVerify()))) {
                    int enableCertVerify = quicParams.getEnableCertVerify();
                    tEBundle2.setInt("enable_cert_verify", enableCertVerify);
                    this.mStreamLogService.setEnableCertVerify(enableCertVerify);
                }
                if (NumberInitializer.isDefined(Integer.valueOf(quicParams.getInitMtu()))) {
                    tEBundle2.setInt("init_mtu", quicParams.getInitMtu());
                }
                if (NumberInitializer.isDefined(Integer.valueOf(quicParams.getEnableMtuDiscovery()))) {
                    tEBundle2.setInt("enable_mtu_discovery", quicParams.getEnableMtuDiscovery());
                }
                if (NumberInitializer.isDefined(Integer.valueOf(quicParams.getInitCwnd()))) {
                    tEBundle2.setInt("init_cwnd", quicParams.getInitCwnd());
                }
                if (NumberInitializer.isDefined(Integer.valueOf(quicParams.getDefaultRetransmitTime()))) {
                    tEBundle2.setInt("default_retransmit_time", quicParams.getDefaultRetransmitTime());
                }
                if (NumberInitializer.isDefined(Integer.valueOf(quicParams.getFixStreamFinAndRst()))) {
                    tEBundle2.setInt("fix_stream_fin_and_rst", quicParams.getFixStreamFinAndRst());
                }
                if (NumberInitializer.isDefined(Integer.valueOf(quicParams.getSendBufferSize()))) {
                    tEBundle2.setInt("send_buffer_size", quicParams.getSendBufferSize());
                }
                if (NumberInitializer.isDefined(Integer.valueOf(quicParams.getRecvBufferSize()))) {
                    tEBundle2.setInt("recv_buffer_size", quicParams.getRecvBufferSize());
                }
                if (NumberInitializer.isDefined(Integer.valueOf(quicParams.getFixPacketWriter()))) {
                    tEBundle2.setInt("fix_packet_writer", quicParams.getFixPacketWriter());
                }
                if (NumberInitializer.isDefined(Integer.valueOf(quicParams.getIgnoreSocketWriterError()))) {
                    tEBundle2.setInt("ignore_socket_write_error", quicParams.getIgnoreSocketWriterError());
                }
                if (NumberInitializer.isDefined(Integer.valueOf(quicParams.getBwWindowSize()))) {
                    tEBundle2.setInt("bw_window_size", quicParams.getBwWindowSize());
                }
                if (NumberInitializer.isDefined(Integer.valueOf(quicParams.getRttWindowSize()))) {
                    tEBundle2.setInt("rtt_window_size", quicParams.getBwWindowSize());
                }
                if (NumberInitializer.isDefined(Integer.valueOf(quicParams.getProbeBwRandomCycleLength()))) {
                    tEBundle2.setInt("probe_bw_random_cycle_length", quicParams.getProbeBwRandomCycleLength());
                }
                if (NumberInitializer.isDefined(Integer.valueOf(quicParams.getProbeRttGain()))) {
                    tEBundle2.setInt("probe_rtt_gain", quicParams.getProbeRttGain());
                }
                this.mTransportOpt.setBundle("quic_params", tEBundle2);
                tEBundle2.release();
            }
            if (this.mLiveStreamBuilder.getRtmpCacheCfgParams() != null) {
                RtmpCacheConfig rtmpCacheCfgParams = this.mLiveStreamBuilder.getRtmpCacheCfgParams();
                TEBundle tEBundle3 = new TEBundle();
                int videoFps = this.mLiveStreamBuilder.getVideoFps();
                tEBundle3.setInt("init_video_fps", videoFps);
                if (NumberInitializer.isDefined(Integer.valueOf(rtmpCacheCfgParams.getMinVideoFps()))) {
                    tEBundle3.setInt("min_video_fps", Math.min(rtmpCacheCfgParams.getMinVideoFps(), videoFps));
                }
                if (NumberInitializer.isDefined(Integer.valueOf(rtmpCacheCfgParams.getMaxVideoFps()))) {
                    tEBundle3.setInt("max_video_fps", Math.max(rtmpCacheCfgParams.getMaxVideoFps(), videoFps));
                }
                if (NumberInitializer.isDefined(Integer.valueOf(rtmpCacheCfgParams.getMaxInterLeaveDelta()))) {
                    tEBundle3.setInt("max_interleave_delta", rtmpCacheCfgParams.getMaxInterLeaveDelta());
                }
                if (NumberInitializer.isDefined(Integer.valueOf(rtmpCacheCfgParams.getDropVideoFrameThresholdI()))) {
                    tEBundle3.setInt("drop_video_frame_threshold_I", rtmpCacheCfgParams.getDropVideoFrameThresholdI());
                }
                if (NumberInitializer.isDefined(Integer.valueOf(rtmpCacheCfgParams.getDropVideoFrameThresholdP()))) {
                    tEBundle3.setInt("drop_video_frame_threshold_P", rtmpCacheCfgParams.getDropVideoFrameThresholdP());
                }
                if (NumberInitializer.isDefined(Integer.valueOf(rtmpCacheCfgParams.getDropVideoFrameThresholdB()))) {
                    tEBundle3.setInt("drop_video_frame_threshold_B", rtmpCacheCfgParams.getDropVideoFrameThresholdB());
                }
                if (NumberInitializer.isDefined(Integer.valueOf(rtmpCacheCfgParams.getAudioSendStallThreshold()))) {
                    tEBundle3.setInt("audio_send_stall_threshold", rtmpCacheCfgParams.getAudioSendStallThreshold());
                }
                if (NumberInitializer.isDefined(Integer.valueOf(rtmpCacheCfgParams.getVideoSendStallThreshold()))) {
                    tEBundle3.setInt("video_send_stall_threshold", rtmpCacheCfgParams.getVideoSendStallThreshold());
                }
                if (NumberInitializer.isDefined(Integer.valueOf(rtmpCacheCfgParams.getEnableReportStallLog()))) {
                    int enableReportStallLog = rtmpCacheCfgParams.getEnableReportStallLog();
                    this.mEanbleReportStallLog = enableReportStallLog;
                    tEBundle3.setInt("enable_report_stall_log", enableReportStallLog);
                }
                this.mTransportOpt.setBundle("rtmp_cache_cfg", tEBundle3);
            }
            this.mTransportOpt.setBool("rtmp_tcp_cork", this.mLiveStreamBuilder.getPushBase().enableTcpCork);
            if (this.mLiveStreamBuilder.getSandboxParams() != null) {
                SandboxParams sandboxParams = this.mLiveStreamBuilder.getSandboxParams();
                if (NumberInitializer.isDefined(Integer.valueOf(sandboxParams.getEnable()))) {
                    this.mTransportOpt.setInt("transport_enable_sandbox_proceed", sandboxParams.getEnable());
                }
            }
            this.mRTMPTransport.setParameter(this.mTransportOpt);
            AVLog.d("LiveStream", "Dump update rtmp config:");
            this.mTransportOpt.dump();
        }
        TEBundle tEBundle4 = this.mEncodeStreamOpt;
        if (tEBundle4 != null) {
            tEBundle4.setString("video_type", chooseVideoEncode);
            TEBundle tEBundle5 = this.mEncodeStreamOpt;
            if (!isEnableVideoEncodeAccelera || !this.mLiveStreamBuilder.isHWEncodeOesDirectly()) {
                z = false;
            } else {
                z = true;
            }
            tEBundle5.setBool("oes_texture_frame", z);
            this.mEncodeStreamOpt.setBool("video_enable_accelera", isEnableVideoEncodeAccelera);
            this.mEncodeStreamOpt.setInt("video_width", this.mLiveStreamBuilder.getVideoWidth());
            this.mEncodeStreamOpt.setInt("video_height", this.mLiveStreamBuilder.getVideoHeight());
            this.mEncodeStreamOpt.setInt("video_profileLevel", chooseProfileLevel);
            this.mEncodeStreamOpt.setInt("video_fps", this.mLiveStreamBuilder.getVideoFps());
            this.mEncodeStreamOpt.setLong("video_bitrate", (long) this.mLiveStreamBuilder.getVideoBitrate());
            this.mEncodeStreamOpt.setInt("video_gop", getVideoGop());
            this.mEncodeStreamOpt.setBool("video_enable_bframe", this.mLiveStreamBuilder.isEnableVideoBFrame());
            this.mEncodeStreamOpt.setBundle("roi_settings", this.mLiveStreamBuilder.getRoiSettings());
            TEBundle tEBundle6 = this.mEncodeStreamOpt;
            if (this.mLiveStreamBuilder.getVideoBitrateMode() == 2) {
                i2 = 1;
            } else {
                i2 = 0;
            }
            tEBundle6.setInt("video_is_cbr", i2);
            this.mEncodeStreamOpt.setInt("configuration_type", 1);
            this.mEncodeStreamOpt.setBool("video_no_drop_frame", this.mLiveStreamBuilder.isDropFramesDisabled());
            this.mEncodeStreamOpt.setBool("video_fix_hardware_enc_dts", this.mLiveStreamBuilder.isEnableFixHardwareEncodeDts());
            this.mEncodeStreamOpt.setInt("check_encode_fps_interval", this.mLiveStreamBuilder.getCheckEncodeFpsInterval());
            this.mEncodeStreamOpt.setInt("change_encode_fps_threshold", this.mLiveStreamBuilder.getChangeEncodeFpsThreshold());
            this.mEncodeStreamOpt.setInt("bytevc1_mosaic_issue_optimize_level", this.mLiveStreamBuilder.getByteVC1MosaicIssueOptimize());
            this.mEncodeStreamOpt.setInt("frame_rate_mode", this.mLiveStreamBuilder.getFrameRateMode());
            this.mEncodeStreamOpt.setInt("software_encoder_min_max_bitrate_adjust", this.mLiveStreamBuilder.getSoftwareEncoderMinMaxBitrateAdjust());
            this.mEncodeStreamOpt.setInt("video_min_bitrate", this.mLiveStreamBuilder.getVideoMinBitrate());
            this.mEncodeStreamOpt.setInt("video_max_bitrate", this.mLiveStreamBuilder.getVideoMaxBitrate());
            this.mEncodeStreamOpt.setString("audio_type", chooseAudioEncode);
            this.mEncodeStreamOpt.setBool("audio_enable_accelera", isEnableAudioEncodeAccelera);
            this.mEncodeStreamOpt.setInt("audio_channels", this.mLiveStreamBuilder.getAudioChannel());
            this.mEncodeStreamOpt.setInt("audio_sample", this.mLiveStreamBuilder.getAudioSampleHZ());
            this.mEncodeStreamOpt.setInt("audio_bit_width", this.mLiveStreamBuilder.getAudioBitwidth());
            this.mEncodeStreamOpt.setInt("audio_profileLevel", chooseAudioProfileLevel);
            this.mEncodeStreamOpt.setLong("audio_bit_rate", (long) this.mLiveStreamBuilder.getAudioBitrate());
            this.mEncodeStreamOpt.setBool("estream_psnr_enable", this.mLiveStreamBuilder.isEnablePSNR());
            this.mEncodeStreamOpt.setBool("estream_siti_enable", this.mLiveStreamBuilder.getSdkSetting().enableSiti);
            this.mEncodeStreamOpt.setBool("estream_transport_delay_enable", this.mLiveStreamBuilder.getPushBase().enableRenderStallStats);
            if (this.mLiveStreamBuilder.isEnablePSNR()) {
                setupPSNRParameter(this.mEncodeStreamOpt);
            }
            if (this.mLiveStreamBuilder.isEnableConstantTimePeriodGop()) {
                this.mEncodeStreamOpt.setBool("video_const_time_period_gop", true);
            } else if (this.mLiveStreamBuilder.getEnableMaxTimePeriodGopSec() > 0.0d) {
                this.mEncodeStreamOpt.setDouble("video_gop_sec_max", this.mLiveStreamBuilder.getEnableMaxTimePeriodGopSec());
            }
            SITICalculator sITICalculator = this.mSITICalculator;
            if (sITICalculator != null) {
                this.mMediaEncodeStream.setSITICaculator(sITICalculator);
            }
            AVLog.iod("LiveStream", "Dump all encodeStream config:" + this.mEncodeStreamOpt.toString());
            this.mMediaEncodeStream.setParameter(this.mEncodeStreamOpt);
            setupMixerParameter();
            setupVsyncParameter();
            setupDumpEncodeFrames();
        }
    }

    @Override // com.ss.avframework.livestreamv2.ILiveStream
    public void setDataListener(ILiveStream.ILiveStreamDataListener iLiveStreamDataListener) {
        this.mDataListener = iLiveStreamDataListener;
    }

    @Override // com.ss.avframework.livestreamv2.ILiveStream
    public void setErrorListener(ILiveStream.ILiveStreamErrorListener iLiveStreamErrorListener) {
        this.mErrorListener = iLiveStreamErrorListener;
    }

    @Override // com.ss.avframework.livestreamv2.ILiveStream
    public void setInfoListener(ILiveStream.ILiveStreamInfoListener iLiveStreamInfoListener) {
        this.mInfoListener = iLiveStreamInfoListener;
    }

    @Override // com.ss.avframework.livestreamv2.ILiveStream
    public void setRadioModeBgBitmap(Bitmap bitmap) {
        setBackGroundPhotoPath(bitmap);
    }

    public void setStreamUniqueIdentifier(String str) {
        this.mStreamUuid = str;
    }

    public void setupLogServer(LiveStreamLogService liveStreamLogService) {
        this.mStreamLogService = liveStreamLogService;
    }

    public void setupTextureFrameAvailableListener(TextureFrameAvailableSink textureFrameAvailableSink) {
        this.mTextureFrameAvailableSink = textureFrameAvailableSink;
    }

    public class ResolutionLevel {
        static {
            Covode.recordClassIndex(99935);
        }

        public ResolutionLevel() {
        }
    }

    protected LiveStream(LiveStreamBuilder liveStreamBuilder) {
        this(liveStreamBuilder, null, null);
    }

    @Override // com.ss.avframework.livestreamv2.ILiveStream
    public void setAudioRecordPath(String str) {
        IAudioRecordManager iAudioRecordManager = this.mAudioRecordManager;
        if (iAudioRecordManager != null) {
            iAudioRecordManager.setRecordPath(str);
        }
    }

    @Override // com.ss.avframework.livestreamv2.ILiveStream
    public void setBackGroundPhotoPath(Bitmap bitmap) {
        LiveStreamVideoCapture liveStreamVideoCapture = this.mVideoCapturer;
        if (liveStreamVideoCapture != null) {
            liveStreamVideoCapture.setBackGroundPhotoPath(bitmap);
        }
    }

    public void setRoiSwitch(RoiSwitch roiSwitch) {
        if (roiSwitch != null) {
            this.mRoiSwitch = roiSwitch;
        }
    }

    @Override // com.ss.avframework.livestreamv2.ILiveStream
    public void setScreenIntent(Intent intent) {
        this.mLiveStreamBuilder.setScreenCaptureIntent(intent);
    }

    @Override // com.ss.avframework.livestreamv2.ILiveStream
    public void setTimeInterval(int i2) {
        MediaEncodeStream mediaEncodeStream = this.mMediaEncodeStream;
        if (mediaEncodeStream != null) {
            mediaEncodeStream.setEstimateTimeInterval(i2);
        }
    }

    private boolean checkAudioCaptureCert(boolean z) {
        return checkAudioCaptureCert(this.mLiveStreamBuilder.getAudioCaptureDevice(), z);
    }

    public static void com_ss_avframework_livestreamv2_LiveStream_com_ss_android_ugc_aweme_lancet_LoadSoLancet_loadLibrary(String str) {
        long uptimeMillis = SystemClock.uptimeMillis();
        Librarian.a(str, false, (Context) null);
        m.a(uptimeMillis, str);
    }

    public static Context com_ss_avframework_livestreamv2_LiveStream_com_ss_android_ugc_aweme_lancet_launch_ApplicationContextLancet_getApplicationContext(Context context) {
        Context applicationContext = context.getApplicationContext();
        if (com.ss.android.ugc.aweme.lancet.a.a.f107168c && applicationContext == null) {
            return com.ss.android.ugc.aweme.lancet.a.a.f107166a;
        }
        return applicationContext;
    }

    private boolean enableUrlFallBack(int i2) {
        if (this.mEnableUrlFallBack || i2 == 10) {
            return true;
        }
        return false;
    }

    public long getInt64Value(int i2) {
        Transport transport;
        if (i2 == 1 && (transport = this.mRTMPTransport) != null) {
            return transport.getInt64Value(i2);
        }
        return 0;
    }

    public String getStringValue(int i2) {
        SITICalculator sITICalculator;
        if (i2 == 3 && (sITICalculator = this.mSITICalculator) != null) {
            return sITICalculator.GetPerformance();
        }
        return null;
    }

    @Override // com.ss.avframework.livestreamv2.ILiveStream
    public boolean isMirror(boolean z) {
        LiveStreamVideoCapture liveStreamVideoCapture = this.mVideoCapturer;
        if (liveStreamVideoCapture != null) {
            return liveStreamVideoCapture.isMirror(z);
        }
        return false;
    }

    @Override // com.ss.avframework.engine.AudioSource.PowerObserver
    public void onCalculatePcmPowerEvent(final int i2) {
        Handler handler = this.mDataNotifyThreadHandler;
        if (handler != null) {
            handler.post(new Runnable() {
                /* class com.ss.avframework.livestreamv2.LiveStream.AnonymousClass23 */

                static {
                    Covode.recordClassIndex(99904);
                }

                public void run() {
                    if (LiveStream.this.mDataListener != null) {
                        LiveStream.this.mDataListener.onData(1, i2, 0);
                    }
                }
            });
        }
    }

    @Override // com.ss.avframework.livestreamv2.ILiveStream
    public int sendSeiMsg(String str) {
        Transport transport = this.mRTMPTransport;
        if (transport != null) {
            return transport.sendSeiMsg(str);
        }
        return -1;
    }

    @Override // com.ss.avframework.livestreamv2.ILiveStream
    public void setAudioFrameAvailableListener(final ILiveStream.IAudioFrameAvailableListener iAudioFrameAvailableListener) {
        Handler handler = this.mWorkThreadHandler;
        if (handler != null) {
            handler.post(new Runnable() {
                /* class com.ss.avframework.livestreamv2.LiveStream.AnonymousClass29 */

                static {
                    Covode.recordClassIndex(99910);
                }

                public void run() {
                    if (LiveStream.this.mStatus.get() != 7) {
                        if (iAudioFrameAvailableListener != null) {
                            if (LiveStream.this.mAudioFrameAvailableSink == null) {
                                LiveStream.this.mAudioFrameAvailableSink = new AudioFrameAvailableSink();
                            }
                            LiveStream.this.mExternalAudioFrameListener = iAudioFrameAvailableListener;
                            LiveStream.this.mAudioFrameAvailableSink.addListener(iAudioFrameAvailableListener);
                            LiveStream.this.addCapturedAudioFrameSinks();
                            if (LiveStream.this.mAudioCapture != null) {
                                LiveStream.this.mAudioCapture.resume();
                            }
                        } else if (LiveStream.this.mExternalAudioFrameListener != null) {
                            if (LiveStream.this.mAudioFrameAvailableSink != null) {
                                LiveStream.this.mAudioFrameAvailableSink.removeListener(LiveStream.this.mExternalAudioFrameListener);
                            }
                            LiveStream.this.mExternalAudioFrameListener = null;
                        }
                    }
                }
            });
        }
    }

    @Override // com.ss.avframework.livestreamv2.ILiveStream
    public void setBackGroundPhotoPath(String str) {
        LiveStreamVideoCapture liveStreamVideoCapture = this.mVideoCapturer;
        if (liveStreamVideoCapture != null) {
            liveStreamVideoCapture.setBackGroundPhotoPath(str);
        }
    }

    @Override // com.ss.avframework.livestreamv2.ILiveStream
    public void setDns(final e eVar) {
        Handler handler = this.mWorkThreadHandler;
        if (handler != null) {
            handler.post(new Runnable() {
                /* class com.ss.avframework.livestreamv2.LiveStream.AnonymousClass27 */

                static {
                    Covode.recordClassIndex(99908);
                }

                public void run() {
                    boolean z;
                    LiveStream.this.mDns = eVar;
                    LiveStream liveStream = LiveStream.this;
                    if (liveStream.mDns != null) {
                        z = true;
                    } else {
                        z = false;
                    }
                    liveStream.mDnsOptOpen = z;
                    LiveStream.this.mOptUrlMap = new HashMap<>();
                    AVLog.ioi("LiveStream", "execute setDns, mDnsOptOpen " + LiveStream.this.mDnsOptOpen);
                }
            });
        }
    }

    @Override // com.ss.avframework.livestreamv2.ILiveStream
    public void setOriginVideoTrack(final String str) {
        this.mWorkThreadHandler.post(new Runnable() {
            /* class com.ss.avframework.livestreamv2.LiveStream.AnonymousClass6 */

            static {
                Covode.recordClassIndex(99931);
            }

            public void run() {
                if (LiveStream.this.mMediaEncodeStream != null) {
                    AVLog.iow("LiveStream-StreamTrace", "setOriginVideoTrack to:" + str + ",Orig Track is:" + LiveStream.this.getOriginInputVideoStream().name());
                    LiveStream.this.mMediaEncodeStream.setOriginVideoTrack(str);
                }
            }
        });
    }

    @Override // com.ss.avframework.livestreamv2.ILiveStream
    public void setTextureFrameAvailableListener(final ILiveStream.ITextureFrameAvailableListener iTextureFrameAvailableListener) {
        Handler handler = this.mWorkThreadHandler;
        if (handler != null) {
            handler.post(new Runnable() {
                /* class com.ss.avframework.livestreamv2.LiveStream.AnonymousClass28 */

                static {
                    Covode.recordClassIndex(99909);
                }

                public void run() {
                    if (LiveStream.this.mStatus.get() != 7) {
                        if (iTextureFrameAvailableListener != null) {
                            if (LiveStream.this.mTextureFrameAvailableSink == null) {
                                LiveStream.this.setupTextureFrameAvailableListener(new TextureFrameAvailableSink());
                            }
                            LiveStream.this.mTextureFrameAvailableSink.setListener(iTextureFrameAvailableListener);
                            if (LiveStream.this.mVideoTrack == null) {
                                return;
                            }
                            if (!LiveStream.this.mLiveStreamBuilder.isEnableKTV() || !LiveStream.this.mIsKaraokeMovie) {
                                LiveStream.this.mVideoTrack.addVideoSink(LiveStream.this.mTextureFrameAvailableSink);
                                return;
                            }
                            LiveStream liveStream = LiveStream.this;
                            liveStream.changeToKTVMode(liveStream.mIsKaraokeMovie, LiveStream.this.mKaraokeMovie);
                        } else if (LiveStream.this.mTextureFrameAvailableSink != null) {
                            LiveStream.this.mTextureFrameAvailableSink.setListener(null);
                        }
                    }
                }
            });
        }
    }

    @Override // com.ss.avframework.livestreamv2.ILiveStream
    public void unRegisterAudioRecordingCallback(AudioManager.AudioRecordingCallback audioRecordingCallback) {
        AudioCapturer audioCapturer = this.mAudioCapture;
        if (audioCapturer != null && (audioCapturer instanceof LiveStreamAudioCapture)) {
            ((LiveStreamAudioCapture) audioCapturer).unRegisterAudioRecordingCallback(audioRecordingCallback);
        }
    }

    private int align(int i2) {
        int i3;
        if (this.mLiveStreamBuilder.isAlignTo16()) {
            i3 = 16;
        } else {
            i3 = 2;
        }
        return (((i2 + i3) - 1) / i3) * i3;
    }

    public static File com_ss_avframework_livestreamv2_LiveStream_com_ss_android_ugc_aweme_lancet_ContextLancet_getFilesDir(Context context) {
        if (d.f107195c != null && d.f107197e) {
            return d.f107195c;
        }
        File filesDir = context.getFilesDir();
        d.f107195c = filesDir;
        return filesDir;
    }

    private boolean isRtsUrl(String str) {
        String[] split = str.split("\\?");
        if (split == null || split.length <= 0) {
            return false;
        }
        return split[0].contains(".sdp");
    }

    private void setupPSNRParameter(TEBundle tEBundle) {
        int pSNRPeriodSeconds = this.mLiveStreamBuilder.getPSNRPeriodSeconds();
        tEBundle.setInt("psnr_statistic_frames", this.mLiveStreamBuilder.getPSNRStatisticsFrames());
        tEBundle.setInt("psnr_statistic_period_seconds", pSNRPeriodSeconds);
    }

    private boolean tryLoadQuicLibrary(String str) {
        if (str.startsWith("rtmpq")) {
            try {
                com_ss_avframework_livestreamv2_LiveStream_com_ss_android_ugc_aweme_lancet_LoadSoLancet_loadLibrary("ttquic");
                this.mQuicFlag = 1;
            } catch (Throwable unused) {
                this.mQuicFlag = 0;
                return false;
            }
        }
        return true;
    }

    @Override // com.ss.avframework.livestreamv2.ILiveStream
    public void changeVideoFps(int i2) {
        TEBundle tEBundle = new TEBundle();
        tEBundle.setInt("fps", i2);
        updateSdkParams(tEBundle);
        tEBundle.release();
    }

    @Override // com.ss.avframework.livestreamv2.ILiveStream
    public boolean getAdaptedVideoResolution(int[] iArr) {
        LiveStreamVideoCapture liveStreamVideoCapture = this.mVideoCapturer;
        if (liveStreamVideoCapture == null || iArr == null || iArr.length <= 1) {
            return false;
        }
        iArr[0] = liveStreamVideoCapture.getAdaptedWidth();
        iArr[1] = liveStreamVideoCapture.getAdaptedHeight();
        return true;
    }

    @Override // com.ss.avframework.livestreamv2.ILiveStream
    public boolean isEnableMixer(boolean z) {
        MediaEncodeStream mediaEncodeStream = this.mMediaEncodeStream;
        if (mediaEncodeStream == null) {
            return false;
        }
        if (z) {
            return mediaEncodeStream.getAudioMixer().enable();
        }
        return mediaEncodeStream.getVideoMixer().enable();
    }

    /* access modifiers changed from: package-private */
    public final /* synthetic */ void lambda$setAudioMute$8$LiveStream(boolean z) {
        if (this.mAudioCapture == null) {
            return;
        }
        if (checkAudioCaptureCert(!z) || z) {
            this.mAudioCapture.mute(z);
        }
    }

    public void setAudioRecordMode(int i2) {
        LiveStreamAudioCapture liveStreamAudioCapture;
        this.mAudioRecordMode = i2;
        AudioCapturer audioCapturer = this.mAudioCapture;
        if (audioCapturer != null && (audioCapturer instanceof LiveStreamAudioCapture) && (liveStreamAudioCapture = (LiveStreamAudioCapture) audioCapturer) != null) {
            liveStreamAudioCapture.setMode(i2);
        }
    }

    @Override // com.ss.avframework.livestreamv2.ILiveStream
    public void setOption(LiveStreamOption liveStreamOption) {
        final TEBundle opt = liveStreamOption.getOpt();
        if (this.mStatus.get() != 7) {
            ThreadUtils.invokeAtFrontUninterruptibly(this.mWorkThreadHandler, new Runnable() {
                /* class com.ss.avframework.livestreamv2.LiveStream.AnonymousClass17 */

                static {
                    Covode.recordClassIndex(99897);
                }

                public void run() {
                    if (LiveStream.this.mMediaEncodeStream != null) {
                        LiveStream.this.mMediaEncodeStream.setParameter(opt);
                    }
                }
            });
        }
    }

    @Override // com.ss.avframework.livestreamv2.ILiveStream
    public void setRenderSink(final VideoSink videoSink) {
        if (this.mStatus.get() != 7) {
            this.mWorkThreadHandler.post(new Runnable() {
                /* class com.ss.avframework.livestreamv2.LiveStream.AnonymousClass15 */

                static {
                    Covode.recordClassIndex(99895);
                }

                public void run() {
                    VideoSink videoSink = videoSink;
                    if (!(LiveStream.this.mVideoTrack == null || LiveStream.this.mRenderView == null)) {
                        LiveStream.this.mVideoTrack.removeVideoSink(LiveStream.this.mRenderView);
                        LiveStream.this.mRenderView.release();
                        LiveStream.this.mRenderView = null;
                    }
                    if (LiveStream.this.mRenderView != null) {
                        LiveStream.this.mRenderView.release();
                        LiveStream.this.mRenderView = null;
                    }
                    LiveStream.this.mRenderView = videoSink;
                    if (LiveStream.this.mVideoTrack != null && LiveStream.this.mRenderView != null) {
                        LiveStream.this.mVideoTrack.addVideoSink(LiveStream.this.mRenderView);
                    }
                }
            });
        }
    }

    @Override // com.ss.avframework.livestreamv2.ILiveStream
    public void setSeiCurrentShiftDiffTime(long j2) {
        TEBundle tEBundle;
        if (this.mLiveStreamBuilder.isEnableSeiShift()) {
            this.mSeiCurrentShiftDiffTime = j2;
            if (this.mRTMPTransport != null && (tEBundle = this.mTransportOpt) != null) {
                tEBundle.setLong("sei_ntp_time_shift", j2);
                this.mRTMPTransport.setParameter(this.mTransportOpt);
            }
        }
    }

    public void setVideoMixBgColor(int i2) {
        VideoMixer videoMixer;
        this.mVideoMixBgColor = i2;
        MediaEncodeStream mediaEncodeStream = this.mMediaEncodeStream;
        if (mediaEncodeStream != null && (videoMixer = mediaEncodeStream.getVideoMixer()) != null) {
            TEBundle tEBundle = new TEBundle();
            videoMixer.getParameter(tEBundle);
            tEBundle.setInt("vmixer_bg_color", i2);
            videoMixer.setParameter(tEBundle);
            tEBundle.release();
        }
    }

    @Override // com.ss.avframework.livestreamv2.ILiveStream
    public void switchAudioCapture(int i2) {
        AudioCapturer audioCapturer = this.mAudioCapture;
        if (audioCapturer != null && (audioCapturer instanceof LiveStreamAudioCapture) && checkAudioCaptureCert(i2, true)) {
            ((LiveStreamAudioCapture) this.mAudioCapture).switchSource(i2);
        }
    }

    private int getCurrentCaptureDevice(boolean z) {
        if (z) {
            LiveStreamVideoCapture liveStreamVideoCapture = this.mVideoCapturer;
            if (liveStreamVideoCapture != null) {
                return liveStreamVideoCapture.getCurrentCaptureDevice();
            }
            return 0;
        }
        AudioCapturer audioCapturer = this.mAudioCapture;
        if (audioCapturer == null) {
            return 0;
        }
        if (audioCapturer instanceof LiveStreamAudioCapture) {
            return ((LiveStreamAudioCapture) audioCapturer).getCurrentCaptureDevice();
        }
        if (audioCapturer instanceof AudioCapturerOpensles) {
            return 2;
        }
        if (audioCapturer instanceof AudioCapturerAudioRecord) {
            return 1;
        }
        return 0;
    }

    private String getDisPatchedUrl(String str) {
        LiveStreamBuilder liveStreamBuilder = getLiveStreamBuilder();
        if (liveStreamBuilder == null || isRtsUrl(str)) {
            return str;
        }
        String pushUrlPrefix = liveStreamBuilder.getPushUrlPrefix();
        int rtmpPort = liveStreamBuilder.getRtmpPort();
        if (pushUrlPrefix.length() <= 0 || rtmpPort <= 0) {
            return str;
        }
        String urlPrefixAndPort = setUrlPrefixAndPort(pushUrlPrefix, rtmpPort, str);
        return !tryLoadQuicLibrary(urlPrefixAndPort) ? str : urlPrefixAndPort;
    }

    @Override // com.ss.avframework.livestreamv2.ILiveStream
    public void setAudioMute(boolean z) {
        AVLog.logKibana(4, "LiveStream", "setAudioMute(" + z + ")", null);
        if (this.mStatus.get() != 7) {
            this.mWorkThreadHandler.post(new PrivacyCertManager.RunnableWithCert(new LiveStream$$Lambda$10(this, z), new int[]{1}));
        }
    }

    @Override // com.ss.avframework.livestreamv2.ILiveStream
    public void setAudioScenario(final int i2) {
        AVLog.ioi("LiveStream", "setAudioScenario(" + i2 + ")");
        if (this.mStatus.get() != 7) {
            this.mWorkThreadHandler.post(new Runnable() {
                /* class com.ss.avframework.livestreamv2.LiveStream.AnonymousClass14 */

                static {
                    Covode.recordClassIndex(99894);
                }

                public void run() {
                    if (LiveStream.this.mAudioDeviceModule != null) {
                        LiveStream.this.mAudioDeviceModule.setAudioScenario(i2);
                    }
                }
            });
        }
    }

    @Override // com.ss.avframework.livestreamv2.ILiveStream
    public void setLowPowerLevel(int i2) {
        LiveStreamBaseStrategy liveStreamBaseStrategy = this.mLiveStreamStrategy;
        if (liveStreamBaseStrategy == null) {
            return;
        }
        if (i2 == 1 || i2 == 2 || i2 == 3) {
            liveStreamBaseStrategy.onInfo(1, 1, i2);
            AVLog.logKibana(6, "LiveStream", "setLowPowerLevel with level: ".concat(String.valueOf(i2)), null);
            return;
        }
        AVLog.logKibana(6, "LiveStream", "setLowPowerLevel wrong level:".concat(String.valueOf(i2)), null);
    }

    @Override // com.ss.avframework.livestreamv2.ILiveStream
    public void setPublishPlanarRender(boolean z) {
        VideoMixer videoMixer;
        MediaEncodeStream mediaEncodeStream = this.mMediaEncodeStream;
        if (mediaEncodeStream != null && (videoMixer = mediaEncodeStream.getVideoMixer()) != null) {
            AVLog.logKibana(4, "LiveStream", "setPublishPlanarRender:".concat(String.valueOf(z)), null);
            TEBundle tEBundle = new TEBundle();
            videoMixer.getParameter(tEBundle);
            tEBundle.setBool("vmixer_planar_render", z);
            videoMixer.setParameter(tEBundle);
            tEBundle.release();
        }
    }

    @Override // com.ss.avframework.livestreamv2.ILiveStream
    public void start(String str) {
        if (this.mStatus.get() != 7) {
            this.mUri = str;
            AVLog.ioi("LiveStream", "Try to start live stream with ".concat(String.valueOf(str)));
            this.mWorkThreadHandler.post(new Runnable() {
                /* class com.ss.avframework.livestreamv2.LiveStream.AnonymousClass3 */

                static {
                    Covode.recordClassIndex(99911);
                }

                public void run() {
                    LiveStream.this.doStart();
                    LiveStream.this.mStreamLogService.reset();
                    LiveStream.this.mStreamLogService.addOrRemoveStatus(1, false);
                    LiveStream.this.mStreamLogService.setReportStallLog(LiveStream.this.mEanbleReportStallLog);
                }
            });
            return;
        }
        AVLog.ioe("LiveStream", "Try to start live stream while mStatus is STATUS_END");
    }

    public void switchVideoSinkForDualGame(boolean z) {
        if (this.mDualGameEngine != null) {
            AVLog.iod("LiveStream", "DualGame status changed: ".concat(String.valueOf(z)));
            this.mEnableDualGame = z;
            ThreadUtils.invokeAtFrontUninterruptibly(this.mWorkThreadHandler, new LiveStream$$Lambda$1(this, z));
        }
    }

    private String getStackTrack(String str) {
        StackTraceElement[] stackTrace = Thread.currentThread().getStackTrace();
        String str2 = "\n";
        for (StackTraceElement stackTraceElement : stackTrace) {
            str2 = str2 + str + "    at " + stackTraceElement.getClassName() + "." + stackTraceElement.getMethodName() + "(" + stackTraceElement.getFileName() + " :" + stackTraceElement.getLineNumber() + ")\n";
        }
        return str2;
    }

    private boolean isNodeOptDisabled(String str) {
        LiveStreamBuilder liveStreamBuilder = this.mLiveStreamBuilder;
        if (!(liveStreamBuilder == null || liveStreamBuilder.getNodeOptParams() == null)) {
            NodeOptParams nodeOptParams = this.mLiveStreamBuilder.getNodeOptParams();
            String pushUrlPrefix = this.mLiveStreamBuilder.getPushUrlPrefix();
            if (pushUrlPrefix.length() > 0 && this.mLiveStreamBuilder.getRtmpPort() > 0) {
                str = pushUrlPrefix;
            }
            if (str.startsWith("rtmp://") && !NumberInitializer.isDefined(Integer.valueOf(nodeOptParams.getRtmp()))) {
                return true;
            }
            if (str.startsWith("rtmps://") && !NumberInitializer.isDefined(Integer.valueOf(nodeOptParams.getRtmps()))) {
                return true;
            }
            if (!str.startsWith("rtmpq://") || NumberInitializer.isDefined(Integer.valueOf(nodeOptParams.getRtmpq()))) {
                return false;
            }
            return true;
        }
        return false;
    }

    private void removeStreamsFromEncodeStream(boolean z) {
        AudioTrack audioTrack;
        VideoTrack videoTrack;
        MethodCollector.i(11616);
        MediaEncodeStream mediaEncodeStream = this.mMediaEncodeStream;
        if (mediaEncodeStream == null) {
            MethodCollector.o(11616);
            return;
        }
        removeKaraokeTrack(this.mIsKaraokeMovie, this.mKaraokeMovie);
        if (z) {
            synchronized (this.mInputStreamListFence) {
                try {
                    Iterator<IInputVideoStream> it = this.mInputVideoStreams.iterator();
                    while (it.hasNext()) {
                        IInputVideoStream next = it.next();
                        if ((next instanceof InputVideoStream) && (videoTrack = ((InputVideoStream) next).getVideoTrack()) != null) {
                            mediaEncodeStream.removeTrack(videoTrack);
                        }
                    }
                } finally {
                    MethodCollector.o(11616);
                }
            }
            return;
        }
        synchronized (this.mInputStreamListFence) {
            try {
                Iterator<IInputAudioStream> it2 = this.mInputAudioStreams.iterator();
                while (it2.hasNext()) {
                    IInputAudioStream next2 = it2.next();
                    if ((next2 instanceof InputAudioStream) && (audioTrack = ((InputAudioStream) next2).getAudioTrack()) != null) {
                        mediaEncodeStream.removeTrack(audioTrack);
                    }
                }
            } finally {
                MethodCollector.o(11616);
            }
        }
    }

    public IDualGameEngine getDualGameEngine(ILayerControlExt iLayerControlExt) {
        if (this.mDualGameEngine == null) {
            try {
                Constructor<?> constructor = Class.forName("com.ss.avframework.livestreamv2.core.interact.dualgame.DualGameEngineBuilderImpl").getConstructor(new Class[0]);
                constructor.setAccessible(true);
                IDualGameEngineBuilder mediaEngineFactory = ((IDualGameEngineBuilder) constructor.newInstance(new Object[0])).setAdm(this.mAudioDeviceModule).setBuilder(getLiveStreamBuilder()).setMediaEngineFactory(this.mMediaEngineFactory);
                Handler handler = this.mVideoCaptureHandler;
                if (handler == null) {
                    handler = this.mWorkThreadHandler;
                }
                this.mDualGameEngine = mediaEngineFactory.setHandler(handler).setInputAudioStream(createInputAudioStream()).setLayerControl(iLayerControlExt).setOnDualGameStatusChange(new LiveStream$$Lambda$14(this)).create();
            } catch (Throwable unused) {
                AVLog.iow("LiveStream", "DualGameEngineBuilderImpl not found !! ");
            }
        }
        return this.mDualGameEngine;
    }

    @Override // com.ss.avframework.livestreamv2.ILiveStream
    public boolean getLiveStreamInfo(LiveStreamReport liveStreamReport) {
        try {
            if (!this.mReportFence.readLock().tryLock(100, TimeUnit.MILLISECONDS)) {
                AVLog.w("LiveStream", "Maybe be stream will be release.");
                return false;
            }
            liveStreamReport.clear();
            liveStreamReport.setTransportAdjustBps(this.mAdjustBitrate);
            MediaEncodeStream mediaEncodeStream = this.mMediaEncodeStream;
            if (mediaEncodeStream != null) {
                mediaEncodeStream.getStaticsReport(liveStreamReport);
                liveStreamReport.setAudioMixerCostTimePerFrameMs((double) this.mMediaEncodeStream.getAudioMixer().getAvgCostTimePerFrameMs());
                liveStreamReport.setVideoMixerCostTimePerFrameMs((double) this.mMediaEncodeStream.getVideoMixer().getAvgCostTimePerFrameMs());
            }
            VideoTrack videoTrack = this.mVideoTrack;
            if (videoTrack != null) {
                videoTrack.getStaticsReport(liveStreamReport);
            }
            AudioTrack audioTrack = this.mAudioTrack;
            if (audioTrack != null) {
                audioTrack.getStaticsReport(liveStreamReport);
            }
            LiveStreamVideoCapture liveStreamVideoCapture = this.mVideoCapturer;
            if (liveStreamVideoCapture != null) {
                liveStreamVideoCapture.getStaticsReport(liveStreamReport);
            }
            Transport transport = this.mRTMPTransport;
            if (transport != null) {
                transport.getStaticsReport(liveStreamReport);
            }
            VideoFrameStatistics videoFrameStatistics = this.mVideoFrameStatics;
            if (videoFrameStatistics != null) {
                videoFrameStatistics.getStaticsReport(liveStreamReport);
            }
            this.mReportFence.readLock().unlock();
            return true;
        } catch (InterruptedException unused) {
        }
    }

    /* access modifiers changed from: package-private */
    public final /* synthetic */ void lambda$switchVideoCapture$7$LiveStream(int i2) {
        boolean z;
        LiveStreamBuilder liveStreamBuilder = this.mLiveStreamBuilder;
        if (this.mStatus.get() != 7 && liveStreamBuilder != null) {
            if (i2 == 5) {
                z = true;
            } else {
                z = false;
            }
            this.mIsRadioMode = z;
            AVLog.logKibana(4, "LiveStream", "Call switchVideoCapture. from " + this.mLiveStreamBuilder.getVideoCaptureDevice() + ", to " + i2, null);
            liveStreamBuilder.setVideoCaptureDevice(i2);
            LiveStreamVideoCapture liveStreamVideoCapture = this.mVideoCapturer;
            if (liveStreamVideoCapture == null) {
                AVLog.logKibana(6, "LiveStream-VideoCapture", "Maybe video capture already to stopped.", null);
            } else if (liveStreamVideoCapture.status() != 2) {
                AVLog.ioi("LiveStream", "Switch video capture to ".concat(String.valueOf(i2)));
                this.mVideoCapturer.switchVideoCaptureDevice(i2, liveStreamBuilder.getScreenCaptureIntent());
            } else {
                AVLog.logKibana(6, "LiveStream-VideoCapture", "mVideoCapturer status error.", null);
            }
        }
    }

    /* access modifiers changed from: package-private */
    /* JADX WARNING: Code restructure failed: missing block: B:11:0x0051, code lost:
        if (r5 != false) goto L_0x0015;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final /* synthetic */ void lambda$switchVideoSinkForDualGame$1$LiveStream(boolean r5) {
        /*
            r4 = this;
            com.ss.avframework.engine.VideoTrack r3 = r4.mVideoTrack
            r2 = 1
            if (r3 == 0) goto L_0x0051
            com.ss.avframework.engine.VideoSink r0 = r4.mRenderView
            if (r0 == 0) goto L_0x0051
            if (r5 == 0) goto L_0x0054
            r3.removeVideoSink(r0)
            com.ss.avframework.livestreamv2.IDualGameEngine r1 = r4.mDualGameEngine
            com.ss.avframework.engine.VideoTrack r0 = r4.mVideoTrack
            r1.connectVideoTrack(r0, r2)
        L_0x0015:
            com.ss.avframework.livestreamv2.IDualGameEngine r0 = r4.mDualGameEngine
            com.ss.avframework.engine.VideoTrack r3 = r0.getEncodeVideoTrack()
        L_0x001b:
            com.ss.avframework.engine.MediaEncodeStream r1 = r4.mMediaEncodeStream
            if (r1 == 0) goto L_0x0050
            if (r3 == 0) goto L_0x0050
            com.ss.avframework.engine.VideoTrack r0 = r4.mVideoTrack
            r1.removeTrack(r0)
            com.ss.avframework.engine.MediaEncodeStream r1 = r4.mMediaEncodeStream
            com.ss.avframework.livestreamv2.IDualGameEngine r0 = r4.mDualGameEngine
            com.ss.avframework.engine.VideoTrack r0 = r0.getEncodeVideoTrack()
            r1.removeTrack(r0)
            r4.removeStreamsFromEncodeStream(r2)
            com.ss.avframework.engine.MediaEncodeStream r0 = r4.mMediaEncodeStream
            r0.addTrack(r3)
            com.ss.avframework.engine.MediaEncodeStream r1 = r4.mMediaEncodeStream
            java.lang.String r0 = r3.id()
            r1.setOriginVideoTrack(r0)
            r4.addStreamsToEncodeStream(r2)
            com.ss.avframework.engine.MediaEncodeStream r2 = r4.mMediaEncodeStream
            java.lang.String r1 = r3.id()
            com.ss.avframework.mixer.VideoMixer$VideoMixerDescription r0 = r4.mOriginVideoStreamDescription
            r2.setVideoMixerDescription(r1, r0)
        L_0x0050:
            return
        L_0x0051:
            if (r5 == 0) goto L_0x0061
            goto L_0x0015
        L_0x0054:
            com.ss.avframework.livestreamv2.IDualGameEngine r1 = r4.mDualGameEngine
            r0 = 0
            r1.connectVideoTrack(r3, r0)
            com.ss.avframework.engine.VideoTrack r1 = r4.mVideoTrack
            com.ss.avframework.engine.VideoSink r0 = r4.mRenderView
            r1.addVideoSink(r0)
        L_0x0061:
            com.ss.avframework.engine.VideoTrack r3 = r4.mVideoTrack
            goto L_0x001b
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ss.avframework.livestreamv2.LiveStream.lambda$switchVideoSinkForDualGame$1$LiveStream(boolean):void");
    }

    @Override // com.ss.avframework.livestreamv2.ILiveStream
    public void sendSdkControlMsg(String str) {
        try {
            if (!TextUtils.isEmpty(str)) {
                JSONObject jSONObject = new JSONObject(str);
                if (!jSONObject.isNull(StringSet.type) && "push".equals(jSONObject.getString(StringSet.type))) {
                    sendSdkControlMsgInternal(jSONObject.getString("command"), new JSONObject(jSONObject.getString("params")));
                }
            }
        } catch (Exception e2) {
            AVLog.ioe("LiveStream", "sendSdkControlMsg error:".concat(String.valueOf(e2)));
        }
    }

    @Override // com.ss.avframework.livestreamv2.ILiveStream
    public void start(List<String> list) {
        if (this.mStatus.get() != 7) {
            this.mUris = list;
            AVLog.ioi("LiveStream", "Try to start live stream with ".concat(String.valueOf(list)));
            int i2 = 0;
            while (i2 < this.mUris.size()) {
                if (this.mUris.get(i2).isEmpty()) {
                    this.mUris.remove(i2);
                } else {
                    i2++;
                }
            }
            if (!this.mUris.isEmpty()) {
                this.mWorkThreadHandler.post(new Runnable() {
                    /* class com.ss.avframework.livestreamv2.LiveStream.AnonymousClass4 */

                    static {
                        Covode.recordClassIndex(99926);
                    }

                    public void run() {
                        LiveStreamLogService liveStreamLogService = LiveStream.this.mStreamLogService;
                        if (liveStreamLogService != null) {
                            liveStreamLogService.reset();
                            liveStreamLogService.addOrRemoveStatus(1, false);
                            liveStreamLogService.setReportStallLog(LiveStream.this.mEanbleReportStallLog);
                        }
                        LiveStream.this.doStart();
                    }
                });
            }
        }
    }

    public void startRecorder(final String str) {
        boolean z;
        if (this.mStatus.get() != 7) {
            z = this.mWorkThreadHandler.post(new Runnable() {
                /* class com.ss.avframework.livestreamv2.LiveStream.AnonymousClass36 */

                static {
                    Covode.recordClassIndex(99922);
                }

                public void run() {
                    if (LiveStream.this.mMediaEncodeStream != null) {
                        LiveStream.this.mMediaEncodeStream.startRecord(str);
                        return;
                    }
                    IRecorderManager externRecordMgr = LiveStream.this.mRecorderManager.getExternRecordMgr();
                    if (externRecordMgr instanceof SharedEncoderRecorder) {
                        ((SharedEncoderRecorder) externRecordMgr).onEvent(11, 0, 0, "EncodeStream is null, maybe publish no start.");
                    }
                }
            });
        } else {
            z = false;
        }
        RecorderManager recorderManager = this.mRecorderManager;
        if (!z && recorderManager != null) {
            IRecorderManager externRecordMgr = recorderManager.getExternRecordMgr();
            if (externRecordMgr instanceof SharedEncoderRecorder) {
                ((SharedEncoderRecorder) externRecordMgr).onEvent(11, 0, 0, "Publiser status exception(" + this.mStatus + ")");
            }
        }
    }

    @Override // com.ss.avframework.livestreamv2.ILiveStream
    public void switchAudioMode(int i2) {
        Object obj;
        if (i2 == 6 || this.mLiveStreamBuilder.getVideoCaptureDevice() != 3) {
            setAudioRecordMode(i2);
            AudioCapturer audioCapturer = this.mAudioCapture;
            if (audioCapturer != null && (audioCapturer instanceof LiveStreamAudioCapture)) {
                ((LiveStreamAudioCapture) audioCapturer).switchAudioMode(i2);
                return;
            }
            return;
        }
        StringBuilder append = new StringBuilder("Screen mode ignore switch, current mode ").append(this.mAudioRecordMode).append(", mode=");
        AudioCapturer audioCapturer2 = this.mAudioCapture;
        if (audioCapturer2 != null) {
            obj = Integer.valueOf(audioCapturer2.getMode());
        } else {
            obj = "-1";
        }
        AVLog.iod("LiveStream", append.append(obj).toString());
    }

    @Override // com.ss.avframework.livestreamv2.ILiveStream
    public void switchVideoCapture(int i2) {
        AVLog.ioi("CameraVideoCapturer", "Call switchVideoCapture.from" + this.mLiveStreamBuilder.getVideoCaptureDevice() + " ,to " + i2);
        if (this.mStatus.get() != 7) {
            this.mWorkThreadHandler.post(new PrivacyCertManager.RunnableWithCert(new LiveStream$$Lambda$9(this, i2), new int[]{0}));
        }
    }

    @Override // com.ss.avframework.livestreamv2.ILiveStream
    public void updateSdkParams(TEBundle tEBundle) {
        if (tEBundle == null) {
            AVLog.ioe("LiveStream", "updateSdkParams with a null TEBundle");
            return;
        }
        boolean checkParamsForUpdate = this.mLiveStreamBuilder.checkParamsForUpdate(tEBundle);
        AVLog.logKibana(5, "LiveStream", "updateSdkParams-Bundle" + tEBundle.toString(), null);
        adaptedVideoResolution(this.mLiveStreamBuilder.getCaptureAdaptedWidth(), this.mLiveStreamBuilder.getCaptureAdaptedHeight(), this.mLiveStreamBuilder.getVideoFps());
        if (checkParamsForUpdate && this.mStatus.get() != 7) {
            this.mWorkThreadHandler.post(new LiveStream$$Lambda$13(this));
        }
    }

    private void addStreamsToEncodeStream(boolean z) {
        AudioTrack audioTrack;
        VideoTrack videoTrack;
        MethodCollector.i(11613);
        MediaEncodeStream mediaEncodeStream = this.mMediaEncodeStream;
        if (mediaEncodeStream == null) {
            MethodCollector.o(11613);
        } else if (z) {
            synchronized (this.mInputStreamListFence) {
                try {
                    Iterator<IInputVideoStream> it = this.mInputVideoStreams.iterator();
                    while (it.hasNext()) {
                        IInputVideoStream next = it.next();
                        if ((next instanceof InputVideoStream) && (videoTrack = ((InputVideoStream) next).getVideoTrack()) != null) {
                            mediaEncodeStream.addTrack(videoTrack);
                            mediaEncodeStream.setVideoMixerDescription(next.name(), next.getMixerDescription());
                        }
                    }
                } finally {
                    MethodCollector.o(11613);
                }
            }
        } else {
            synchronized (this.mInputStreamListFence) {
                try {
                    Iterator<IInputAudioStream> it2 = this.mInputAudioStreams.iterator();
                    while (it2.hasNext()) {
                        IInputAudioStream next2 = it2.next();
                        if ((next2 instanceof InputAudioStream) && (audioTrack = ((InputAudioStream) next2).getAudioTrack()) != null) {
                            mediaEncodeStream.addTrack(audioTrack);
                            mediaEncodeStream.setAudioMixerDescription(next2.name(), next2.getMixerDescription());
                        }
                    }
                } finally {
                    MethodCollector.o(11613);
                }
            }
        }
    }

    private void adjustParameters(LiveStreamBuilder liveStreamBuilder) {
        int videoMaxBitrate = liveStreamBuilder.getVideoMaxBitrate();
        int videoMinBitrate = liveStreamBuilder.getVideoMinBitrate();
        int videoBitrate = liveStreamBuilder.getVideoBitrate();
        if (videoMaxBitrate < videoBitrate) {
            videoMaxBitrate = (videoBitrate * 5) / 3;
        }
        if (videoMinBitrate <= 0 || videoMinBitrate > videoBitrate) {
            videoMinBitrate = (videoBitrate * 2) / 5;
        }
        this.mLiveStreamBuilder.setVideoMaxBitrate(videoMaxBitrate);
        this.mLiveStreamBuilder.setVideoMinBitrate(videoMinBitrate);
        int[] iArr = this.mLiveBitrateSave;
        iArr[0] = videoBitrate;
        iArr[1] = videoMinBitrate;
        iArr[2] = videoMaxBitrate;
        getVideoGop();
        int videoWidth = liveStreamBuilder.getVideoWidth();
        int videoHeight = liveStreamBuilder.getVideoHeight();
        int align = align(videoWidth);
        int align2 = align(videoHeight);
        this.mLiveStreamBuilder.setVideoWidth(align);
        this.mLiveStreamBuilder.setVideoHeight(align2);
        this.mAdjustBitrate = (long) this.mLiveStreamBuilder.getVideoBitrate();
        int vsyncModuleMaxIntevalOnNowMs = this.mLiveStreamBuilder.getVsyncModuleMaxIntevalOnNowMs();
        if (this.mLiveStreamBuilder.getVsyncModuleMaxIntevalOnFrameMs() < 300) {
            this.mLiveStreamBuilder.setVsyncModuleMaxIntevalOnFrameMs(300);
        }
        if (vsyncModuleMaxIntevalOnNowMs < 300) {
            this.mLiveStreamBuilder.setVsyncModuleMaxIntevalOnNowMs(300);
        }
        int captureAdaptedWidth = this.mLiveStreamBuilder.getCaptureAdaptedWidth();
        if (this.mLiveStreamBuilder.getCaptureAdaptedHeight() <= 0 || captureAdaptedWidth <= 0) {
            int videoHeight2 = this.mLiveStreamBuilder.getVideoHeight();
            this.mLiveStreamBuilder.setCaptureAdaptedWidth(this.mLiveStreamBuilder.getVideoWidth());
            this.mLiveStreamBuilder.setCaptureAdaptedHeight(videoHeight2);
        }
    }

    @Override // com.ss.avframework.livestreamv2.ILiveStream
    public void updateSdkParams(String str) {
        try {
            JSONObject jSONObject = new JSONObject(str).getJSONObject("PushBase");
            TEBundle tEBundle = new TEBundle();
            boolean z = false;
            if (!jSONObject.isNull("width") && !jSONObject.isNull("height")) {
                tEBundle.setInt("width", jSONObject.getInt("width"));
                tEBundle.setInt("height", jSONObject.getInt("height"));
                z = true;
            }
            if (!jSONObject.isNull("cap_adapted_width") && !jSONObject.isNull("cap_adapted_height")) {
                tEBundle.setInt("cap_adapted_width", jSONObject.getInt("cap_adapted_width"));
                tEBundle.setInt("cap_adapted_height", jSONObject.getInt("cap_adapted_height"));
                z = true;
            }
            if (!jSONObject.isNull("fps")) {
                tEBundle.setInt("fps", jSONObject.getInt("fps"));
                z = true;
            }
            if (!jSONObject.isNull("cap_adapted_quirks")) {
                tEBundle.setInt("cap_adapted_quirks", jSONObject.getInt("cap_adapted_quirks") & 1);
                z = true;
            }
            if (!jSONObject.isNull("defaultBitrate") && !jSONObject.isNull("minBitrate") && !jSONObject.isNull("maxBitrate")) {
                tEBundle.setInt("defaultBitrate", jSONObject.getInt("defaultBitrate"));
                tEBundle.setInt("minBitrate", jSONObject.getInt("minBitrate"));
                tEBundle.setInt("maxBitrate", jSONObject.getInt("maxBitrate"));
                z = true;
            }
            if (!jSONObject.isNull("useHardware")) {
                tEBundle.setBool("useHardware", jSONObject.getBoolean("useHardware"));
            } else {
                if (z) {
                }
                tEBundle.release();
            }
            updateSdkParams(tEBundle);
            tEBundle.release();
        } catch (JSONException e2) {
            e2.printStackTrace();
        }
    }

    @Override // com.ss.avframework.livestreamv2.ILiveStream
    public void catchVideo(Bundle bundle, ILiveStream.CatchVideoCallback catchVideoCallback) {
        catchMediaData(bundle, catchVideoCallback);
    }

    @Override // com.ss.avframework.livestreamv2.ILiveStream
    public void adaptedVideoResolution(int i2, int i3) {
        adaptedVideoResolution(i2, i3, 0);
    }

    @Override // com.ss.avframework.livestreamv2.ILiveStream
    public void enableMixer(boolean z, boolean z2) {
        if (z) {
            enableInternalMixer(z, z2);
        }
    }

    @Override // com.ss.avframework.livestreamv2.ILiveStream
    public void registerScreenAudioPlayBack(AudioRecordThread.IAudioRecordThreadObserver iAudioRecordThreadObserver, int i2) {
        LiveStreamVideoCapture liveStreamVideoCapture = this.mVideoCapturer;
        if (liveStreamVideoCapture != null) {
            liveStreamVideoCapture.registerScreenAudioPlayBack(iAudioRecordThreadObserver, i2);
        }
    }

    @Override // com.ss.avframework.livestreamv2.ILiveStream
    public void enableMirror(final boolean z, final boolean z2) {
        final Throwable th = new Throwable();
        this.mWorkThreadHandler.post(new Runnable() {
            /* class com.ss.avframework.livestreamv2.LiveStream.AnonymousClass18 */

            static {
                Covode.recordClassIndex(99898);
            }

            public void run() {
                Object obj;
                StringBuilder append = new StringBuilder("Call enableMirror(").append(z).append(", ").append(z2).append("), last mirror status: ");
                if (LiveStream.this.mVideoCapturer != null) {
                    obj = Boolean.valueOf(LiveStream.this.mVideoCapturer.isMirror(z2));
                } else {
                    obj = "null";
                }
                AVLog.logKibana(4, "LiveStream", append.append(obj).append(". ").toString(), th);
                if (LiveStream.this.mVideoCapturer != null) {
                    LiveStream.this.mVideoCapturer.enableMirror(z, z2);
                }
            }
        });
    }

    @Override // com.ss.avframework.livestreamv2.ILiveStream
    public void registerAudioRecordingCallback(Executor executor, AudioManager.AudioRecordingCallback audioRecordingCallback) {
        AudioCapturer audioCapturer = this.mAudioCapture;
        if (audioCapturer != null && (audioCapturer instanceof LiveStreamAudioCapture)) {
            ((LiveStreamAudioCapture) audioCapturer).registerAudioRecordingCallback(executor, audioRecordingCallback);
        }
    }

    private void removeKaraokeTrack(boolean z, final IKaraokeMovie iKaraokeMovie) {
        if (this.mLiveStreamBuilder.isEnableKTV()) {
            ThreadUtils.invokeAtFrontUninterruptibly(this.mWorkThreadHandler, new Runnable() {
                /* class com.ss.avframework.livestreamv2.LiveStream.AnonymousClass41 */

                static {
                    Covode.recordClassIndex(99928);
                }

                public void run() {
                    IKaraokeMovie iKaraokeMovie;
                    VideoTrack videoTrack;
                    if (LiveStream.this.mMediaEncodeStream != null && (iKaraokeMovie = iKaraokeMovie) != null && (videoTrack = iKaraokeMovie.getVideoTrack()) != null) {
                        LiveStream.this.mMediaEncodeStream.removeTrack(videoTrack);
                    }
                }
            });
        }
    }

    private void uploadVideoEncoderChangeLog(String str, String str2) {
        JSONObject jSONObject = new JSONObject();
        try {
            jSONObject.put("key", "Change videoEncoder");
            jSONObject.put("lastEncoder", str);
            jSONObject.put("newEncoder", str2);
        } catch (Exception unused) {
        }
        AVLog.logKibana(4, "Change videoEncoder", jSONObject.toString(), null);
    }

    public void changeToKTVMode(final boolean z, final IKaraokeMovie iKaraokeMovie) {
        if (this.mLiveStreamBuilder.isEnableKTV()) {
            ThreadUtils.invokeAtFrontUninterruptibly(this.mWorkThreadHandler, new Runnable() {
                /* class com.ss.avframework.livestreamv2.LiveStream.AnonymousClass42 */

                static {
                    Covode.recordClassIndex(99929);
                }

                public void run() {
                    VideoTrack videoTrack;
                    LiveStream.this.mKaraokeMovie = iKaraokeMovie;
                    LiveStream.this.mIsKaraokeMovie = z;
                    if (!z) {
                        if (!(LiveStream.this.mVideoTrack == null || iKaraokeMovie == null)) {
                            LiveStream.this.mVideoTrack.removeVideoSink(iKaraokeMovie.getCameraVideoSink());
                        }
                        if (!(LiveStream.this.mMediaEncodeStream == null || LiveStream.this.mVideoTrack == null)) {
                            if (iKaraokeMovie != null) {
                                LiveStream.this.mMediaEncodeStream.removeTrack(iKaraokeMovie.getVideoTrack());
                            }
                            if (!LiveStream.this.mMediaEncodeStream.containTrack(LiveStream.this.mVideoTrack)) {
                                LiveStream.this.mMediaEncodeStream.addTrack(LiveStream.this.mVideoTrack);
                                LiveStream.this.mMediaEncodeStream.setOriginVideoTrack(LiveStream.this.mVideoTrack.id());
                            }
                        }
                        if (LiveStream.this.mTextureFrameAvailableSink != null && LiveStream.this.mVideoTrack != null) {
                            IKaraokeMovie iKaraokeMovie = iKaraokeMovie;
                            if (!(iKaraokeMovie == null || (videoTrack = iKaraokeMovie.getVideoTrack()) == null)) {
                                videoTrack.removeVideoSink(LiveStream.this.mTextureFrameAvailableSink);
                            }
                            if (!LiveStream.this.mVideoTrack.containVideoSink(LiveStream.this.mTextureFrameAvailableSink)) {
                                LiveStream.this.mVideoTrack.addVideoSink(LiveStream.this.mTextureFrameAvailableSink);
                            }
                        }
                    } else if (LiveStream.this.mKaraokeMovie != null) {
                        if (LiveStream.this.mVideoTrack != null && !LiveStream.this.mVideoTrack.containVideoSink(iKaraokeMovie.getCameraVideoSink())) {
                            LiveStream.this.mVideoTrack.addVideoSink(iKaraokeMovie.getCameraVideoSink());
                        }
                        if (!(LiveStream.this.mMediaEncodeStream == null || LiveStream.this.mVideoTrack == null)) {
                            LiveStream.this.mMediaEncodeStream.removeTrack(LiveStream.this.mVideoTrack);
                            if (!LiveStream.this.mMediaEncodeStream.containTrack(iKaraokeMovie.getVideoTrack())) {
                                LiveStream.this.mMediaEncodeStream.addTrack(iKaraokeMovie.getVideoTrack());
                                LiveStream.this.mMediaEncodeStream.setOriginVideoTrack(iKaraokeMovie.getVideoTrack().id());
                            }
                        }
                        if (LiveStream.this.mTextureFrameAvailableSink != null && LiveStream.this.mVideoTrack != null) {
                            LiveStream.this.mVideoTrack.removeVideoSink(LiveStream.this.mTextureFrameAvailableSink);
                            if (!iKaraokeMovie.getVideoTrack().containVideoSink(LiveStream.this.mTextureFrameAvailableSink)) {
                                iKaraokeMovie.getVideoTrack().addVideoSink(LiveStream.this.mTextureFrameAvailableSink);
                            }
                        }
                    }
                }
            });
        }
    }

    @Override // com.ss.avframework.livestreamv2.ILiveStream
    public void changeVideoResolution(int i2, int i3) {
        TEBundle tEBundle = new TEBundle();
        tEBundle.setInt("width", align(i2));
        tEBundle.setInt("height", align(i3));
        updateSdkParams(tEBundle);
        tEBundle.release();
    }

    public MediaTrack createTrack(MediaSource mediaSource, String str) {
        MediaEngineFactory mediaEngineFactory = this.mMediaEngineFactory;
        if (mediaEngineFactory == null || mediaSource == null) {
            return null;
        }
        if (mediaSource instanceof VideoSource) {
            return mediaEngineFactory.createVideoTrack((VideoSource) mediaSource, str);
        }
        if (mediaSource instanceof AudioSource) {
            return mediaEngineFactory.createAudioTrack((AudioSource) mediaSource, str);
        }
        return null;
    }

    @Override // com.ss.avframework.capture.audio.AudioCapturer.AudioCaptureObserver
    public void onAudioCaptureError(final int i2, final Exception exc) {
        if (this.mStatus.get() != 7) {
            this.mWorkThreadHandler.post(new Runnable() {
                /* class com.ss.avframework.livestreamv2.LiveStream.AnonymousClass26 */

                static {
                    Covode.recordClassIndex(99907);
                }

                public void run() {
                    AVLog.ioe("LiveStream", "onAudioCaptureError: code " + i2 + ", message " + exc.toString());
                    LiveStream.this.mStatus.set(8);
                    LiveStream.this.mErrorListener.onError(3, i2, exc);
                    LiveStreamLogService liveStreamLogService = LiveStream.this.mStreamLogService;
                    if (liveStreamLogService != null) {
                        liveStreamLogService.setDeviceOpenErrorCode(true, i2);
                    }
                }
            });
        }
    }

    @Override // com.ss.avframework.livestreamv2.capture.LiveStreamVideoCapture.Observer
    public void onVideoCaptureError(final int i2, final Exception exc) {
        if (this.mStatus.get() != 7) {
            this.mWorkThreadHandler.post(new Runnable() {
                /* class com.ss.avframework.livestreamv2.LiveStream.AnonymousClass22 */

                static {
                    Covode.recordClassIndex(99903);
                }

                public void run() {
                    AVLog.ioe("LiveStream", "onVideoCaptureError: code " + i2 + ", message " + exc.toString());
                    AVLog.logKibana(6, "LiveStream", "onVideoCaptureError: code " + i2, exc);
                    LiveStream.this.mStatus.set(8);
                    LiveStream.this.mErrorListener.onError(2, i2, exc);
                    LiveStreamLogService liveStreamLogService = LiveStream.this.mStreamLogService;
                    if (liveStreamLogService != null) {
                        liveStreamLogService.setDeviceOpenErrorCode(false, i2);
                    }
                }
            });
        }
    }

    private void catchAudioInternal(Bundle bundle, ILiveStream.CatchMediaDataCallback catchMediaDataCallback) {
        Handler handler;
        AudioCapturer audioCapturer = this.mAudioCapture;
        if (audioCapturer != null && audioCapturer.status() == 1) {
            AudioDeviceModule audioDeviceModule = this.mAudioDeviceModule;
            if (audioDeviceModule != null && (handler = this.mWorkThreadHandler) != null) {
                AudioCatcher.CatchAudio(audioDeviceModule, handler, bundle, catchMediaDataCallback);
            } else if (catchMediaDataCallback != null) {
                catchMediaDataCallback.onError(-202, "AudioDeviceModule is not ready.");
            }
        } else if (catchMediaDataCallback != null) {
            catchMediaDataCallback.onError(-202, "Maybe AudioCapture not started.");
        }
    }

    private void disableAudioEncoder(String str, boolean z) {
        if (this.mAvailableAudioEncoders != null) {
            int i2 = 0;
            while (true) {
                String[] strArr = this.mAvailableAudioEncoders;
                if (i2 < strArr.length) {
                    if (strArr[i2].contains("audio_type=".concat(String.valueOf(str))) && z == this.mAvailableAudioEncoders[i2].contains("audio_enable_accelera=true")) {
                        this.mAvailableAudioEncoders[i2] = "";
                    }
                    i2++;
                } else {
                    return;
                }
            }
        }
    }

    private void disableVideoEncoder(String str, boolean z) {
        if (this.mAvailableVideoEncoders != null) {
            int i2 = 0;
            while (true) {
                String[] strArr = this.mAvailableVideoEncoders;
                if (i2 < strArr.length) {
                    if (strArr[i2].contains("video_type=".concat(String.valueOf(str))) && z == this.mAvailableVideoEncoders[i2].contains("video_enable_accelera=true")) {
                        this.mAvailableVideoEncoders[i2] = "";
                    }
                    i2++;
                } else {
                    return;
                }
            }
        }
    }

    private void enableInternalMixer(boolean z, boolean z2) {
        if (!z && this.mIsRadioMode) {
            AVLog.iow("LiveStream", "Can not set VideoMixerMode In BlackFrameMode,Set it to false.");
            z2 = false;
        }
        MediaEncodeStream mediaEncodeStream = this.mMediaEncodeStream;
        if (mediaEncodeStream != null) {
            if (z) {
                mediaEncodeStream.getAudioMixer().setEnable(z2);
            } else {
                return;
            }
        } else if (!z) {
            return;
        }
        this.mAudioMixer = z2;
    }

    @Override // com.ss.avframework.livestreamv2.ILiveStream
    public void catchMediaData(Bundle bundle, ILiveStream.CatchMediaDataCallback catchMediaDataCallback) {
        int i2;
        if (bundle != null) {
            i2 = bundle.getInt("mode", -1);
            if (i2 >= 0) {
                if (i2 == 10) {
                    catchAudioInternal(bundle, catchMediaDataCallback);
                    return;
                } else {
                    catchVideoInternal(bundle, catchMediaDataCallback);
                    return;
                }
            }
        } else {
            i2 = -2;
        }
        if (catchMediaDataCallback != null) {
            catchMediaDataCallback.onError(-1, i2 + "param error: mode " + i2 + ", param " + bundle);
        }
    }

    @Override // com.ss.avframework.strategy.LiveStreamBaseStrategy.IStrategyNotify
    public void onLiveOptionChanged(TEBundle tEBundle, TEBundle tEBundle2) {
        if (tEBundle != null) {
            AVLog.logKibana(5, "LiveStream", "onLiveOptionChanged:Encode:" + tEBundle.toString(), null);
            this.mMediaEncodeStream.setParameter(tEBundle);
        }
        if (tEBundle2 != null) {
            AVLog.logKibana(5, "LiveStream", "onLiveOptionChanged:Transport:" + tEBundle2.toString(), null);
            this.mRTMPTransport.setParameter(tEBundle2);
        }
    }

    public void onVideoEncodeFpsAdjust(int i2, int i3) {
        EncodeFpsAdjustStrategy encodeFpsAdjustStrategy = this.mEncodeFpsAdjustStrategy;
        if (encodeFpsAdjustStrategy != null) {
            int adjustFps = encodeFpsAdjustStrategy.getAdjustFps(i2, i3);
            if (adjustFps != 0) {
                changeVideoFps(adjustFps);
                LiveStreamLogService liveStreamLogService = this.mStreamLogService;
                if (liveStreamLogService != null) {
                    liveStreamLogService.uploadVideoEncodeFpsAdjustLog(i2, adjustFps);
                }
            }
        } else if (this.mLiveStreamBuilder != null) {
            this.mEncodeFpsAdjustStrategy = new EncoderFpsAdjustStrategyAvg(this.mLiveStreamBuilder.getChangeEncodeFpsThreshold(), this.mLiveStreamBuilder.getMaxChangeEncodeFpsTimes());
        }
    }

    public void onVideoEncodeFpsAdjustForNetAdpt(int i2, int i3) {
        String str;
        if (i3 != 0) {
            if (this.mStatus.get() != 7) {
                this.mLiveStreamBuilder.setVideoFps(i3);
                adaptedVideoResolution(this.mLiveStreamBuilder.getCaptureAdaptedWidth(), this.mLiveStreamBuilder.getCaptureAdaptedHeight(), i3);
            }
            LiveStreamLogService liveStreamLogService = this.mStreamLogService;
            if (liveStreamLogService != null) {
                if (i3 > i2) {
                    str = "up";
                } else {
                    str = "down";
                }
                liveStreamLogService.onFpsAdjust(i2, i3, str);
            }
        }
    }

    private void catchVideoInternal(Bundle bundle, ILiveStream.CatchMediaDataCallback catchMediaDataCallback) {
        IFilterManager iFilterManager;
        LiveStreamVideoCapture liveStreamVideoCapture = this.mVideoCapturer;
        if (liveStreamVideoCapture == null || liveStreamVideoCapture.status() != 1) {
            if (catchMediaDataCallback != null) {
                catchMediaDataCallback.onError(-2, "Maybe VideoCapture not started.");
            }
        } else if (this.mMediaEngineFactory != null && (iFilterManager = this.mFilterManager) != null && (iFilterManager instanceof FilterManager)) {
            int[] iArr = new int[2];
            if (getAdaptedVideoResolution(iArr) && iArr[0] > 0 && iArr[1] > 0) {
                bundle.putInt("width", iArr[0]);
                bundle.putInt("height", iArr[1]);
                bundle.putInt("fps", this.mLiveStreamBuilder.getVideoFps());
                ((FilterManager) this.mFilterManager).catchVideo(this.mMediaEngineFactory, bundle, catchMediaDataCallback);
            } else if (catchMediaDataCallback != null) {
                catchMediaDataCallback.onError(-2, "getAdaptedVideoResolution fail.");
            }
        } else if (catchMediaDataCallback != null) {
            catchMediaDataCallback.onError(-2, "FilterManager is not ready.");
        }
    }

    private boolean checkAudioCaptureCert(int i2, boolean z) {
        PrivacyCertManager.CertUnit popCert;
        if ((i2 != 1 && i2 != 2 && i2 != 5) || (popCert = PrivacyCertManager.getInstance().popCert(1)) == null) {
            return true;
        }
        try {
            popCert.check();
        } catch (Exception e2) {
            AVLog.logToIODevice(6, "LiveStream", "Method \"" + popCert.methodName + "\" check audio cert failed.", e2);
            if (!z) {
                return false;
            }
            this.mStatus.set(8);
            this.mErrorListener.onError(3, 1128616533, e2);
            return false;
        }
        return true;
    }

    private void sendSdkControlMsgInternal(String str, JSONObject jSONObject) {
        String str2;
        if ("push_restart".equals(str)) {
            boolean z = false;
            String str3 = null;
            if (!jSONObject.isNull("sdk_params")) {
                str2 = jSONObject.getString("sdk_params");
                AVLog.ioi("LiveStream", "sdkParams:".concat(String.valueOf(str2)));
            } else {
                str2 = null;
            }
            if (!jSONObject.isNull("force_switch_node")) {
                z = jSONObject.getBoolean("force_switch_node");
                AVLog.ioi("LiveStream", "forceSwitchNode:".concat(String.valueOf(z)));
            }
            if (!jSONObject.isNull("url")) {
                str3 = jSONObject.getString("url");
                AVLog.ioi("LiveStream", "url:".concat(String.valueOf(z)));
            }
            restartPublish(str2, z, str3);
        }
    }

    @Override // com.ss.avframework.livestreamv2.ILiveStream
    public void catchMediaData(Bundle bundle, ILiveStream.CatchPicCallback catchPicCallback) {
        LiveStreamVideoCapture liveStreamVideoCapture = this.mVideoCapturer;
        if (liveStreamVideoCapture == null || liveStreamVideoCapture.status() != 1) {
            if (catchPicCallback != null) {
                catchPicCallback.onError(-2, "Maybe VideoCapture not started.");
            }
        } else if (this.mFilterManager instanceof FilterManager) {
            bundle.putInt("width", this.mLiveStreamBuilder.getVideoWidth());
            bundle.putInt("height", this.mLiveStreamBuilder.getVideoHeight());
            ((FilterManager) this.mFilterManager).catchPic(bundle, catchPicCallback);
        } else if (catchPicCallback != null) {
            catchPicCallback.onError(-2, "FilterManager is not ready.");
        }
    }

    /* access modifiers changed from: package-private */
    public final /* synthetic */ void lambda$new$0$LiveStream(int i2, String str) {
        String[] split = str.split("\\|")[0].split(",");
        int parseInt = Integer.parseInt(split[0]);
        int parseInt2 = Integer.parseInt(split[2]);
        AVLog.logKibana(5, "LiveStream", "SITIHelper trigger encode params catgory:" + i2 + ",bitrates:" + parseInt + "," + parseInt2, null);
        TEBundle tEBundle = new TEBundle();
        tEBundle.setInt("minBitrate", parseInt);
        tEBundle.setInt("maxBitrate", parseInt2);
        if (this.mLiveStreamBuilder.getVideoBitrate() < parseInt) {
            tEBundle.setInt("defaultBitrate", parseInt);
        } else if (this.mLiveStreamBuilder.getVideoBitrate() > parseInt2) {
            tEBundle.setInt("defaultBitrate", parseInt2);
        }
        updateSdkParams(tEBundle);
        tEBundle.release();
    }

    public static void dumpJavaThreadStackIfNeed(Thread thread, String str) {
        if (thread != null) {
            String str2 = "{status:" + thread.getState() + ",id:" + thread.getId() + ",name:" + thread.getName() + "}";
            String str3 = str + ".ANR";
            AVLog.iow(str3, str2);
            AVLog.w(str3, str2);
            try {
                StackTraceElement[] stackTrace = thread.getStackTrace();
                for (StackTraceElement stackTraceElement : stackTrace) {
                    String str4 = "    at " + stackTraceElement.getClassName() + "." + stackTraceElement.getMethodName() + "(" + stackTraceElement.getFileName() + " :" + stackTraceElement.getLineNumber() + ")";
                    AVLog.iow(str3, str4);
                    AVLog.w(str3, str4);
                }
            } catch (Throwable unused) {
            }
        }
    }

    private String getNodeOptResultFromStrategySDK(String str, String str2) {
        JSONArray optJSONArray;
        String str3 = null;
        JSONObject jSONObject = (JSONObject) LiveStrategyManager.inst().getConfigAndStrategyByKeyInt(1, 13, null, str);
        AVLog.ioi("LiveStream", "get strategy node optimizer infos: ".concat(String.valueOf(jSONObject)));
        if (jSONObject != null) {
            if (jSONObject.has("Ip")) {
                str3 = jSONObject.optString("Ip");
                AVLog.ioi("LiveStream", "get ip from strategy sdk, ip: ".concat(String.valueOf(str3)));
            }
            if (!(!jSONObject.has("RemoteResult") || this.mPreparedIpList == null || (optJSONArray = jSONObject.optJSONArray("RemoteResult")) == null)) {
                ArrayList arrayList = new ArrayList();
                for (int i2 = 0; i2 < optJSONArray.length(); i2++) {
                    arrayList.add(optJSONArray.optString(i2));
                }
                this.mPreparedIpList.put(str2, arrayList);
            }
            if (jSONObject.has("RequestId")) {
                this.mRequestId = jSONObject.optString("RequestId");
            }
            if (jSONObject.has("EvaluatorSymbol")) {
                JSONObject optJSONObject = jSONObject.optJSONObject("EvaluatorSymbol");
                this.mEvaluatorSymbolMap = optJSONObject;
                if (optJSONObject != null && optJSONObject.has(str3)) {
                    this.mEvaluatorSymbol = this.mEvaluatorSymbolMap.optString(str3);
                }
            }
        }
        return str3;
    }

    /* JADX WARNING: Removed duplicated region for block: B:17:0x0036 A[LOOP:0: B:4:0x0019->B:17:0x0036, LOOP_END] */
    /* JADX WARNING: Removed duplicated region for block: B:81:0x0042 A[EDGE_INSN: B:81:0x0042->B:22:0x0042 ?: BREAK  , SYNTHETIC] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private java.lang.String[] getOptUrlAndEvaluateSymbol(com.ss.optimizer.live.sdk.dns.e r13, java.lang.String r14) {
        /*
        // Method dump skipped, instructions count: 465
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ss.avframework.livestreamv2.LiveStream.getOptUrlAndEvaluateSymbol(com.ss.optimizer.live.sdk.dns.e, java.lang.String):java.lang.String[]");
    }

    protected LiveStream(LiveStreamBuilder liveStreamBuilder, Handler handler, Handler handler2) {
        this(liveStreamBuilder, handler, handler2, null, null);
    }

    @Override // com.ss.avframework.livestreamv2.ILiveStream
    public int addSeiField(String str, Object obj, int i2) {
        return addSeiField(str, obj, i2, true, true);
    }

    @Override // com.ss.avframework.livestreamv2.ILiveStream
    public void addUserMetaData(String str, String str2, int i2) {
        this.mUserMetadata.put(str, new UserMetadata(str, str2, i2));
        Transport transport = this.mRTMPTransport;
        if (transport != null) {
            transport.addUserMetaData(str, str2, i2);
        }
    }

    @Override // com.ss.avframework.livestreamv2.ILiveStream
    public void changeVideoBitrate(int i2, int i3, int i4) {
        TEBundle tEBundle = new TEBundle();
        tEBundle.setInt("defaultBitrate", i2);
        tEBundle.setInt("minBitrate", i3);
        tEBundle.setInt("maxBitrate", i4);
        updateSdkParams(tEBundle);
        tEBundle.release();
    }

    public void onAVFrameSyncError(int i2, int i3, long j2) {
        if (i2 == 8) {
            AVLog.ioe("LiveStream", "avSync error before encoding: audio timestamp " + (((long) i3) + j2) + ", video timestamp " + j2);
        }
    }

    private String setUrlPrefixAndPort(String str, int i2, String str2) {
        String str3;
        int indexOf = str2.indexOf("://");
        if (indexOf > 0) {
            str2 = str2.substring(indexOf + 3);
        }
        int indexOf2 = str2.indexOf("/", 0);
        int indexOf3 = str2.indexOf(":", 0);
        if (indexOf2 > 0) {
            if (indexOf3 <= 0) {
                indexOf3 = indexOf2;
            }
            String substring = str2.substring(0, indexOf3);
            str3 = str2.substring(indexOf2);
            str2 = substring;
        } else {
            str3 = "";
        }
        return str + str2 + ":" + i2 + str3;
    }

    private boolean shouldReconnectWitchCurrentUrl(int i2, int i3, long j2) {
        if (isUsingOptimizedUrl()) {
            if (this.mOptUrlReachable != 1) {
                this.mOptUrlReachable = 0;
            }
        } else if (this.mUriReachable != 1) {
            this.mUriReachable = 0;
        }
        if (isUsingOptimizedUrl()) {
            if (this.mRtmpReConnectCounts >= (this.mLiveStreamBuilder.getRtmpReconnectCounts() + 1) / 2) {
                invalidateOptimizedUrl();
            }
            return true;
        } else if (this.mUri != null) {
            if (this.mRtmpReConnectCounts < this.mLiveStreamBuilder.getRtmpReconnectCounts()) {
                return true;
            }
            return false;
        } else if (this.mUris == null || ((enableUrlFallBack(i2) && this.mUris.size() > 1 && this.mUriReachable == 0) || this.mRtmpReConnectCounts >= this.mLiveStreamBuilder.getRtmpReconnectCounts())) {
            return false;
        } else {
            return true;
        }
    }

    @Override // com.ss.avframework.livestreamv2.ILiveStream
    public void adaptedVideoResolution(final int i2, final int i3, final int i4) {
        AVLog.iod("LiveStream", "Encode Params changed(changeAdaptedResolution): Change to:(" + i2 + "," + i3 + "," + i4 + ")");
        Handler handler = this.mWorkThreadHandler;
        AnonymousClass39 r2 = new Runnable() {
            /* class com.ss.avframework.livestreamv2.LiveStream.AnonymousClass39 */

            static {
                Covode.recordClassIndex(99925);
            }

            public void run() {
                LiveStreamVideoCapture liveStreamVideoCapture = LiveStream.this.mVideoCapturer;
                int i2 = i4;
                LiveStreamBuilder liveStreamBuilder = LiveStream.this.mLiveStreamBuilder;
                if (liveStreamBuilder != null) {
                    int resolutionAdaptedQuirks = liveStreamBuilder.getResolutionAdaptedQuirks();
                    if (i2 <= 0) {
                        i2 = liveStreamBuilder.getVideoFps();
                    }
                    if (liveStreamVideoCapture != null) {
                        int[] iArr = {0, 0};
                        if ((resolutionAdaptedQuirks & 1) != 0) {
                            iArr[0] = i2;
                            iArr[1] = i3;
                        }
                        if (!MiscUtils.chooseBestResolution(LiveStream.this.mLiveStreamBuilder.getVideoCaptureWidth(), LiveStream.this.mLiveStreamBuilder.getVideoCaptureHeight(), i2, i3, iArr) || iArr[0] <= 1 || iArr[1] <= 1) {
                            liveStreamVideoCapture.adaptOutputFormat(i2, i3, i2, liveStreamBuilder.isDropFramesDisabled());
                        } else {
                            liveStreamVideoCapture.adaptOutputFormat(iArr[0], iArr[1], i2, liveStreamBuilder.isDropFramesDisabled());
                        }
                    }
                }
            }
        };
        if (handler == null) {
            return;
        }
        if (handler.getLooper().getThread() == Thread.currentThread()) {
            r2.run();
        } else {
            handler.post(r2);
        }
    }

    public void onRtmpFailed(int i2, int i3, long j2) {
        LiveStreamBuilder liveStreamBuilder;
        if (this.mStatus.get() != 8 && (liveStreamBuilder = this.mLiveStreamBuilder) != null) {
            destroyEncodeStream();
            this.mWorkThreadHandler.removeCallbacks(this.rtmpReconnectRunnable);
            if (shouldReconnectWitchCurrentUrl(i2, i3, j2)) {
                this.mWorkThreadHandler.postDelayed(this.rtmpReconnectRunnable, (long) (liveStreamBuilder.getRtmpReconnectIntervalSeconds() * 1000));
                return;
            }
            List<String> list = this.mUris;
            if (list != null) {
                boolean z = true;
                if (list.size() > 1 && enableUrlFallBack(i2)) {
                    this.mUris.remove(0);
                    this.mUriReachable = -1;
                    this.mOptUrlReachable = -1;
                    this.mFirstConnect = true;
                    this.mRtmpReConnectCounts = -1;
                    if (this.mDns == null && !this.mStrategyDnsOptOpen) {
                        z = false;
                    }
                    this.mDnsOptOpen = z;
                    this.mDnsOptHit = false;
                    this.mEvaluatorSymbol = "";
                    this.mWorkThreadHandler.postDelayed(this.rtmpReconnectRunnable, (long) (liveStreamBuilder.getRtmpReconnectIntervalSeconds() * 1000));
                    AVLog.iow("LiveStream", "Switched to next url: " + getLiveStreamUrl());
                    return;
                }
            }
            AVLog.ioe("LiveStream", "Rtmp connecting failed too many times");
            this.mErrorListener.onError(4, i2, new Exception("Rtmp connection fail"));
            doStop();
        }
    }

    public void restartPublish(final String str, final boolean z, final String str2) {
        if (this.mStatus.get() != 2 && this.mStatus.get() != 3) {
            AVLog.ioe("LiveStream", "mStatus status is " + this.mStatus.get() + " on restartPublish");
            doStop();
        } else if (Thread.currentThread() != this.mWorkThreadHandler.getLooper().getThread()) {
            this.mWorkThreadHandler.post(new Runnable() {
                /* class com.ss.avframework.livestreamv2.LiveStream.AnonymousClass40 */

                static {
                    Covode.recordClassIndex(99927);
                }

                public void run() {
                    LiveStream.this.restartPublish(str, z, str2);
                }
            });
        } else {
            destroyEncodeStream();
            if (!TextUtils.isEmpty(str2)) {
                this.mUri = str2;
            }
            getOptimizedUrl();
            updateUrlPriority();
            if (!TextUtils.isEmpty(str)) {
                LiveStreamBuilder liveStreamBuilder = this.mLiveStreamBuilder.setupSdkParams(str);
                this.mLiveStreamBuilder = liveStreamBuilder;
                adjustParameters(liveStreamBuilder);
                AVLog.ioi("LiveStream", a.a("publish params change to [fps:%d,width:%d,height:%d,mix_width:%d,mix_height:%d,min_bitrate:%d,max_bitrate:%d]", new Object[]{Integer.valueOf(this.mLiveStreamBuilder.getVideoFps()), Integer.valueOf(this.mLiveStreamBuilder.getVideoWidth()), Integer.valueOf(this.mLiveStreamBuilder.getVideoHeight()), 0, 0, Integer.valueOf(this.mLiveStreamBuilder.getVideoMinBitrate()), Integer.valueOf(this.mLiveStreamBuilder.getVideoMaxBitrate())}));
            }
            createEncoderStream();
            setupTransport();
            AVLog.ioi("LiveStream", "restart publish");
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:19:0x005f, code lost:
        if (r0 == 4) goto L_0x0041;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void onEncodeCreateEvent(int r23, int r24, long r25) {
        /*
        // Method dump skipped, instructions count: 738
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ss.avframework.livestreamv2.LiveStream.onEncodeCreateEvent(int, int, long):void");
    }

    /* access modifiers changed from: package-private */
    public class UserMetadata {
        public int flag;
        public String key;
        public String value;

        static {
            Covode.recordClassIndex(99938);
        }

        UserMetadata(String str, String str2, int i2) {
            this.key = str;
            this.value = str2;
            this.flag = i2;
        }
    }

    protected LiveStream(LiveStreamBuilder liveStreamBuilder, Handler handler, Handler handler2, AudioDeviceModule audioDeviceModule) {
        this(liveStreamBuilder, handler, handler2, audioDeviceModule, null);
    }

    public void onRecorderEvent(int i2, int i3, long j2, String str) {
        IRecorderManager externRecordMgr;
        RecorderManager recorderManager = this.mRecorderManager;
        if (recorderManager != null && (externRecordMgr = recorderManager.getExternRecordMgr()) != null && (externRecordMgr instanceof SharedEncoderRecorder)) {
            ((SharedEncoderRecorder) externRecordMgr).onEvent(i2, i3, j2, str);
        }
    }

    @Override // com.ss.avframework.engine.MediaEncodeStream.Observer
    public void onMediaEncodeStreamEvent(final int i2, final int i3, final long j2, final String str) {
        if (this.mStatus.get() != 7 && this.mStatus.get() != 8) {
            this.mWorkThreadHandler.post(new Runnable() {
                /* class com.ss.avframework.livestreamv2.LiveStream.AnonymousClass25 */

                static {
                    Covode.recordClassIndex(99906);
                }

                /* JADX INFO: Can't fix incorrect switch cases order, some code will duplicate */
                public void run() {
                    String str;
                    String str2;
                    int i2 = i2;
                    boolean z = true;
                    switch (i2) {
                        case 1:
                            LiveStream.this.mVideoEncodeVsyncName = str;
                            LiveStream.this.mAudioEncodeVsyncName = str;
                            break;
                        case 2:
                        case 4:
                            break;
                        case 3:
                            LiveStream.this.mAudioEncodeVsyncName = str;
                            break;
                        case ABRConfig.ABR_STARTUP_MODEL_KEY:
                        case ABRConfig.ABR_PLAYER_DISPLAY_WIDTH_KEY:
                            LiveStream.this.onEncodeFormatChanged(i2, i3, j2, str);
                            return;
                        case ABRConfig.ABR_PLAYER_DISPLAY_HEIGHT_KEY:
                        case ABRConfig.ABR_DEFAULT_WIFI_BITRATE:
                        case ABRConfig.ABR_STARTUP_MAX_BITRATE:
                        default:
                            return;
                        case ABRConfig.ABR_STARTUP_BANDWIDTH_PARAMETER_KEY:
                            LiveStream.this.onAVFrameSyncError(i2, i3, j2);
                            return;
                        case ABRConfig.ABR_STALL_PENALTY_PARAMETER_KEY:
                        case ABRConfig.ABR_SWITCH_PENALTY_PARAMETER_KEY:
                        case ABRConfig.ABR_BANDWIDTH_PARAMETER_KEY:
                            LiveStream.this.onRecorderEvent(i2, i3, j2, str);
                            return;
                        case ABRConfig.ABR_SELECT_SCENE:
                        case 15:
                            if (i2 == 15) {
                                str2 = "Audio";
                            } else {
                                str2 = "Video Encoder Error: code" + i3;
                            }
                            AVLog.logKibana(6, "LiveStream", str2, null);
                            LiveStreamLogService liveStreamLogService = LiveStream.this.mStreamLogService;
                            if (liveStreamLogService != null) {
                                if (i2 != 15) {
                                    z = false;
                                }
                                liveStreamLogService.setEncoderErrorCode(z, (long) i3);
                                return;
                            }
                            return;
                        case 16:
                            StringBuilder sb = new StringBuilder();
                            if (LiveStream.this.mLiveStreamBuilder.isEnableVideoEncodeAccelera()) {
                                str = "Hardware ";
                            } else {
                                str = "Software ";
                            }
                            AVLog.iow("LiveStream", sb.append(str).append("roi is disabled, reason: ").append(i3).toString());
                            if (LiveStream.this.mLiveStreamBuilder.getRoiOn() == 1) {
                                LiveStream.this.mLiveStreamBuilder.setRoiOn(i3);
                            }
                            LiveStream.this.mInfoListener.onInfo(16, 16, i3);
                            return;
                        case 17:
                            AVLog.logToIODevice2(5, "LiveStream", "Encode frame invalid(" + i3 + "x" + j2 + ") VS Encoder(" + LiveStream.this.mLiveStreamBuilder.getVideoWidth() + "x" + LiveStream.this.mLiveStreamBuilder.getVideoHeight() + ")", null, "EVENT_VIDEO_ENCODE_FRAME_SIZE_INVALID", 1000);
                            return;
                        case LiveRechargeAgeThresholdSetting.DEFAULT:
                            LiveStream.this.onVideoEncodeFpsAdjust(i3, (int) j2);
                            return;
                        case 19:
                            LiveStream.this.onVideoEncodeFpsAdjustForNetAdpt(i3, (int) j2);
                            return;
                    }
                    LiveStream.this.onEncodeCreateEvent(i2, i3, j2);
                }
            });
        }
    }

    @Override // com.ss.avframework.engine.Transport.EventObserver
    public void onTransportEvent(final int i2, final int i3, final long j2, final String str) {
        if (this.mStatus.get() != 7 && this.mStatus.get() != 8) {
            this.mWorkThreadHandler.post(new Runnable() {
                /* class com.ss.avframework.livestreamv2.LiveStream.AnonymousClass24 */

                static {
                    Covode.recordClassIndex(99905);
                }

                public void run() {
                    long j2;
                    long j3;
                    long j4;
                    if (LiveStream.this.mStatus.get() != 7 && LiveStream.this.mStatus.get() != 8) {
                        String str = "";
                        long j5 = -1;
                        boolean z = false;
                        switch (i2) {
                            case 0:
                                AVLog.ioi("LiveStream", "Rtmp start connecting");
                                LiveStream.this.mInfoListener.onInfo(10, 0, 0);
                                LiveStream.this.mStreamLogService.onRTMPConnecting();
                                return;
                            case 1:
                                LiveStream.this.mInfoListener.onInfo(11, 0, 0);
                                if (LiveStream.this.mRTMPTransport != null) {
                                    str = LiveStream.this.mRTMPTransport.getRemoteIP();
                                    j5 = LiveStream.this.mRTMPTransport.getInt64Value(2);
                                }
                                AVLog.ioi("LiveStream", "Rtmp connected: reconnect counts " + LiveStream.this.mRtmpReConnectCounts + ", first connect " + LiveStream.this.mFirstConnect + ", remote ip " + str + ", dns time " + j5);
                                LiveStream.this.mStreamLogService.onRTMPEnd(200, LiveStream.this.mRtmpReConnectCounts, LiveStream.this.mFirstConnect, str, j5);
                                LiveStream.this.onRtmpConncted();
                                return;
                            case 2:
                                AVLog.ioi("LiveStream", "Rtmp send too slow: send delay " + i3);
                                LiveStream.this.mInfoListener.onInfo(13, i3, 0);
                                LiveStream.this.mStreamLogService.onSendPktSlow(i3);
                                LiveStream.this.onRtmpSendTooSlow();
                                return;
                            case 3:
                                if (LiveStream.this.mRtmpReConnectCounts >= LiveStream.this.mLiveStreamBuilder.getRtmpReconnectCounts()) {
                                    if (LiveStream.this.mRTMPTransport != null) {
                                        str = LiveStream.this.mRTMPTransport.getRemoteIP();
                                        j5 = LiveStream.this.mRTMPTransport.getInt64Value(2);
                                    }
                                    LiveStream.this.mStreamLogService.onRTMPEnd(i3, LiveStream.this.mRtmpReConnectCounts, LiveStream.this.mFirstConnect, str, j5);
                                }
                                AVLog.ioe("LiveStream", "Rtmp connecting failed: code2 " + i3 + ", code3 " + j2 + ", reconnect counts " + LiveStream.this.mRtmpReConnectCounts + ", first connect " + LiveStream.this.mFirstConnect);
                                LiveStream.this.onRtmpFailed(i2, i3, j2);
                                return;
                            case 4:
                                long j6 = j2;
                                long j7 = ((long) i3) + j6;
                                VsyncModule vsyncModule = null;
                                MediaEncodeStream mediaEncodeStream = LiveStream.this.mMediaEncodeStream;
                                if (mediaEncodeStream != null) {
                                    vsyncModule = mediaEncodeStream.getVsyncModule();
                                }
                                long j8 = 0;
                                if (vsyncModule != null) {
                                    j3 = vsyncModule.getFirstFrameTimestampMs(LiveStream.this.getOriginInputVideoStream().name());
                                    j8 = vsyncModule.getFirstFrameTimestampMs(LiveStream.this.getOriginInputAudioStream().name());
                                    j4 = vsyncModule.lastTimeMills(LiveStream.this.getOriginInputVideoStream().name());
                                    j2 = vsyncModule.getMaxIntevalMs(LiveStream.this.getOriginInputVideoStream().name());
                                } else {
                                    j2 = 0;
                                    j3 = 0;
                                    j4 = 0;
                                }
                                if (LiveStream.this.mVideoCapturer != null) {
                                    z = LiveStream.this.mVideoCapturer.backgroundMode();
                                }
                                String str2 = "avSync error: audio pts " + j7 + ", video pts " + j6 + " last vpts " + j4 + " video maxFI " + j2 + " bgm " + z + " CurrTimeMs " + (VsyncModule.nowNanos() / 1000000) + " vFirst " + j3 + " aFirst " + j8;
                                AVLog.ioe("LiveStream", str2);
                                LiveStream.this.mStreamLogService.onPushStreamFail(i3, str2);
                                LiveStream.this.onRtmpFailed(i2, i3, j2);
                                return;
                            case ABRConfig.ABR_STARTUP_MODEL_KEY:
                                AVLog.ioe("LiveStream", "interleave fail: error code " + i3);
                                LiveStream.this.mStreamLogService.onPushStreamFail(i3, "interleave fail");
                                LiveStream.this.onRtmpFailed(i2, i3, j2);
                                return;
                            case ABRConfig.ABR_PLAYER_DISPLAY_WIDTH_KEY:
                                AVLog.ioe("LiveStream", "Rtmp send package failed: error code " + i3);
                                LiveStream.this.mStreamLogService.onPushStreamFail(i3, "send package fail");
                                LiveStream.this.onRtmpFailed(i2, i3, j2);
                                return;
                            case ABRConfig.ABR_PLAYER_DISPLAY_HEIGHT_KEY:
                                AVLog.ioi("LiveStream", "Rtmp pushing stopped");
                                LiveStream.this.mInfoListener.onInfo(14, 0, 0);
                                return;
                            case ABRConfig.ABR_STARTUP_BANDWIDTH_PARAMETER_KEY:
                                LiveStream.this.mStreamLogService.onKCPMessage(str);
                                return;
                            case ABRConfig.ABR_STALL_PENALTY_PARAMETER_KEY:
                                LiveStream.this.mStreamLogService.onQUICMessage(str);
                                return;
                            case ABRConfig.ABR_SWITCH_PENALTY_PARAMETER_KEY:
                                AVLog.ioe("LiveStream", "Rtmp connecting failed: error code " + i3);
                                LiveStream.this.onRtmpFailed(i2, i3, j2);
                                return;
                            case ABRConfig.ABR_BANDWIDTH_PARAMETER_KEY:
                            case ABRConfig.ABR_DEFAULT_WIFI_BITRATE:
                            case ABRConfig.ABR_STARTUP_MAX_BITRATE:
                            case 15:
                            default:
                                return;
                            case ABRConfig.ABR_SELECT_SCENE:
                                LiveStream.this.mStreamLogService.onOtherMessage(str);
                                return;
                            case 16:
                                LiveStream.this.mStreamLogService.setSandboxProceedCost(j2);
                                return;
                            case 17:
                                LiveStream.this.mStreamLogService.onPushStreamStall(true, i3, j2);
                                return;
                            case LiveRechargeAgeThresholdSetting.DEFAULT:
                                LiveStream.this.mStreamLogService.onPushStreamStall(false, i3, j2);
                                return;
                        }
                    }
                }
            });
        }
    }

    public void onEncodeFormatChanged(int i2, int i3, long j2, String str) {
        String str2;
        TEBundle tEBundle;
        if (i2 == 5) {
            boolean z = false;
            if (i3 == 1) {
                z = true;
            } else if (i3 != 2) {
                if (i3 == 5) {
                    try {
                        int indexOf = str.indexOf(120);
                        int parseInt = Integer.parseInt(str.substring(0, indexOf));
                        int parseInt2 = Integer.parseInt(str.substring(indexOf + 1));
                        AVLog.ioi("LiveStream", "Video encode size change to ".concat(String.valueOf(str)));
                        TEBundle tEBundle2 = this.mEncodeStreamOpt;
                        if (!(tEBundle2 == null || this.mMediaEncodeStream == null)) {
                            tEBundle2.setInt("video_width", parseInt);
                            this.mEncodeStreamOpt.setInt("video_height", parseInt2);
                            this.mMediaEncodeStream.setParameter(this.mEncodeStreamOpt);
                        }
                        if (!(this.mRTMPTransport == null || (tEBundle = this.mTransportOpt) == null)) {
                            tEBundle.setInt("video_width", parseInt);
                            this.mTransportOpt.setInt("video_height", parseInt2);
                            this.mRTMPTransport.setParameter(this.mTransportOpt);
                        }
                        this.mInfoListener.onInfo(27, parseInt, parseInt2);
                    } catch (Exception e2) {
                        e2.printStackTrace();
                    }
                }
                this.mInfoListener.onInfo(16, i2, i3);
            }
            AVLog.ioi("LiveStream", "Video encode bitrate adjust from " + this.mAdjustBitrate + " to " + j2);
            LiveStreamLogService liveStreamLogService = this.mStreamLogService;
            if (z) {
                str2 = "up";
            } else {
                str2 = "down";
            }
            liveStreamLogService.onBitrateAdjust(j2, str2);
            this.mAdjustBitrate = j2;
            TEBundle tEBundle3 = this.mEncodeStreamOpt;
            if (tEBundle3 != null) {
                tEBundle3.setLong("video_bitrate", this.mAdjustBitrate);
            }
            if (this.mEncodeStreamOpt != null && this.mMediaEncodeStream != null && this.mLiveStreamBuilder.isEnableVideoEncodeAccelera() && Build.VERSION.SDK_INT < 21 && Math.abs(this.lastEstBitrate - j2) >= 81920) {
                this.mEncodeStreamOpt.setLong("video_bitrate", 1 + j2);
                this.mMediaEncodeStream.setParameter(this.mEncodeStreamOpt);
                this.lastEstBitrate = j2;
            }
            this.mInfoListener.onInfo(16, i2, i3);
        }
    }

    @Override // com.ss.avframework.livestreamv2.ILiveStream
    public int addSeiField(String str, Object obj, int i2, boolean z, boolean z2) {
        return addSeiField(str, obj, i2, z, z2, 0);
    }

    @Override // com.ss.avframework.livestreamv2.ILiveStream
    public int pushVideoFrame(ByteBuffer byteBuffer, int i2, int i3, int i4, long j2) {
        LiveStreamVideoCapture liveStreamVideoCapture = this.mVideoCapturer;
        if (liveStreamVideoCapture != null) {
            return liveStreamVideoCapture.pushVideoFrame(byteBuffer, i2, i3, i4, j2);
        }
        return -1;
    }

    public void vsyncEvent(VsyncModule vsyncModule, int i2, int i3, long j2, String str) {
        AVLog.iod("LiveStream", "Vsync event  arg1 " + i2 + " arg2 " + i3 + " arg3 " + j2 + " msg " + str);
        if (i2 == 100) {
            AVLog.logToIODevice2(5, "LiveStream", "Timestamp exception(diff:" + i3 + ") at track(" + str + ") with reset stream", null, "LiveStream.java:vsyncEvent:2", 10000);
            vsyncModule.reset(str);
        } else if (i2 == 101) {
            AVLog.logToIODevice2(5, "LiveStream", "Timestamp exception(diff:" + i3 + ") at track(" + str + ")", null, "LiveStream.java:vsyncEvent:1", 10000);
        }
    }

    protected LiveStream(LiveStreamBuilder liveStreamBuilder, Handler handler, Handler handler2, AudioDeviceModule audioDeviceModule, IVideoEffectProcessor iVideoEffectProcessor) {
        IVideoEffectProcessor videoEffectProcessor;
        LiveStreamBuilder liveStreamBuilder2;
        this.STATUS_INIT = 1;
        this.STATUS_STARTED = 2;
        this.STATUS_STARTING = 3;
        this.STATUS_STOPED = 4;
        this.STATUS_END = 7;
        this.STATUS_ERROR = 8;
        this.TRI_STATE_DEFAULT = -1;
        this.TRI_STATE_TRUE = 1;
        this.tryOpenAudioCaptureOnLater = true;
        this.mUriReachable = -1;
        this.mOptUrlReachable = -1;
        this.mReportFence = new ReentrantReadWriteLock();
        this.mFirstConnect = true;
        this.mRoiSwitch = new RoiSwitch(this);
        this.mInputStreamListFence = new Object();
        IFilterManager iFilterManager = null;
        this.mPreparedIpList = null;
        this.mNodeIndex = 0;
        this.mUploadLogInterval = 0;
        this.lastEstBitrate = 0;
        this.mEnableUrlFallBack = true;
        this.mDnsOptOpen = false;
        this.mDnsOptHit = false;
        this.mStrategyDnsOptOpen = false;
        this.mEvaluatorSymbol = "";
        this.mEvaluatorSymbolMap = null;
        this.mRequestId = "none";
        this.mInvalidOptUrl = "INVALID_URL";
        this.mReleaseFence = new Object();
        this.mVideoMixer = true;
        this.mVideoMixBgColor = 0;
        this.mAudioRecordMode = 1;
        this.mIsRadioMode = false;
        this.mFirstFrameRendered = false;
        this.mEnableDualGame = false;
        this.mLiveBitrateSave = new int[3];
        this.mSeiCurrentShiftDiffTime = 0;
        this.mAddSeiCount = 0;
        this.mLastAddSeiStatTime = 0;
        this.mEanbleReportStallLog = 0;
        this.mCreateEncodeCount = 0;
        this.mQuicFlag = -1;
        this.effectProcessor = iVideoEffectProcessor;
        this.mLiveStreamBuilder = liveStreamBuilder;
        this.mMediaEngineFactory = MediaEngineFactory.create();
        Transport.ResetSeiMgr();
        Transport.EnableVideoFrameStatistics(liveStreamBuilder.isEnableVideoFrameStatistics());
        Transport.SetSeiSourceAble(liveStreamBuilder.isSeiNeedSource());
        SafeHandlerThread lockThread = SafeHandlerThreadPoolExecutor.lockThread("LiveDataNotify");
        this.dataNotifyThread = lockThread;
        lockThread.start();
        this.mAudioDeviceModule = audioDeviceModule;
        this.mUserMetadata = new HashMap<>();
        this.mEnableUrlFallBack = liveStreamBuilder.enableProtocolDegrade();
        if (handler != null) {
            this.mWorkThreadHandler = handler;
            AVLog.w("LiveStream", " Using extern thread as workThread");
        } else {
            GLThread lockGLThread = SafeHandlerThreadPoolExecutor.lockGLThread("LiveStream");
            this.workThread = lockGLThread;
            lockGLThread.start();
            this.mWorkThreadHandler = this.workThread.getHandler();
        }
        this.mVideoCaptureHandler = handler2;
        if (handler2 != null) {
            try {
                if (handler2.getLooper().getThread().getName().equals("LiveCoreWorkThread")) {
                    AVLog.logKibana(6, "LiveStream", "Why work thread be used as video capture thread? ", new Throwable());
                }
            } catch (Exception e2) {
                AVLog.logKibana(6, "LiveStream", "exception occurs when get mVideoCaptureHandler's thread name", e2);
            }
        }
        this.mDataNotifyThreadHandler = this.dataNotifyThread.getHandler();
        this.mStatus = new AtomicInteger(1);
        adjustParameters(this.mLiveStreamBuilder);
        this.mRtmpReConnectCounts = 0;
        this.mUploadLogInterval = liveStreamBuilder.getUploadLogInterval();
        if (liveStreamBuilder.isUseShareRecorder()) {
            this.mRecorderManager = new RecorderManager(this.mLiveStreamBuilder, this.mMediaEngineFactory, new SharedEncoderRecorder(new WeakReference(this)));
        } else {
            this.mRecorderManager = new RecorderManager(this.mLiveStreamBuilder, this.mMediaEngineFactory);
        }
        this.mInputAudioStreams = new ArrayList<>();
        this.mInputVideoStreams = new ArrayList<>();
        this.mOriginAudioStreamDescription = new AudioMixer.AudioMixerDescription();
        this.mOriginVideoStreamDescription = new VideoMixer.VideoMixerDescription();
        if (this.mLiveStreamBuilder.getEffectModePath() == null && this.mLiveStreamBuilder.getEffectResourceFinder() == null && iVideoEffectProcessor == null) {
            this.mFilterManager = FilterManager.createDummy();
        } else {
            IFilterManager create = FilterManager.create(createInputAudioStream(), this.mLiveStreamBuilder.getContext(), handler2, iVideoEffectProcessor, audioDeviceModule, this.mLiveStreamBuilder.getEdgeRender());
            this.mFilterManager = create;
            if (!(create == null || (videoEffectProcessor = create.getVideoEffectProcessor()) == null || !(videoEffectProcessor instanceof EffectWrapper) || (liveStreamBuilder2 = this.mLiveStreamBuilder) == null)) {
                ((EffectWrapper) videoEffectProcessor).setParamsForEdgeRender(liveStreamBuilder2.getVideoCaptureFps(), this.mLiveStreamBuilder.getVideoMaxBitrate());
            }
            this.mWorkThreadHandler.post(new Runnable() {
                /* class com.ss.avframework.livestreamv2.LiveStream.AnonymousClass1 */

                static {
                    Covode.recordClassIndex(99889);
                }

                public void run() {
                    if (LiveStream.this.mAudioFrameAvailableSink == null) {
                        LiveStream.this.mAudioFrameAvailableSink = new AudioFrameAvailableSink();
                    }
                    LiveStream.this.mAudioFrameAvailableSink.addListener((FilterManager) LiveStream.this.mFilterManager);
                }
            });
            IFilterManager iFilterManager2 = this.mFilterManager;
            if (iFilterManager2 instanceof FilterManager) {
                ((FilterManager) iFilterManager2).setEnableVpassEnableFindContour(liveStreamBuilder.isEnableFindContour());
            }
        }
        AVLog.iod("LiveStream", "FilterManager " + this.mFilterManager + " is enable " + this.mFilterManager.isEnable() + " is valid " + this.mFilterManager.isValid());
        IAudioFilterManager create2 = IAudioFilterManager.create(this.mLiveStreamBuilder.getContext(), this.mWorkThreadHandler, this.mAudioDeviceModule, liveStreamBuilder, this.mFilterManager.isValid() ? this.mFilterManager : iFilterManager);
        this.mAudioFilterManager = create2;
        if (this.mAudioDeviceModule != null && !create2.isDummy()) {
            this.mAudioDeviceModule.setAudioProcessor(this.mAudioFilterManager);
        }
        this.rtmpReconnectRunnable = new Runnable() {
            /* class com.ss.avframework.livestreamv2.LiveStream.AnonymousClass2 */

            static {
                Covode.recordClassIndex(99900);
            }

            public void run() {
                LiveStream.this.rtmpReconnect();
                AVLog.iod("LiveStream", "Rtmp reconnecting... with current status " + LiveStream.this.mStatus);
            }
        };
        this.mVideoFrameStatics = new VideoFrameStatistics();
        if (this.mLiveStreamBuilder.getSdkSetting().enableSiti) {
            SITICalculator sITICalculator = new SITICalculator(this.mWorkThreadHandler, this.mLiveStreamBuilder.getSdkParams().optInt("siti_strategy_ver", 0), -1);
            this.mSITICalculator = sITICalculator;
            if (sITICalculator.isValid()) {
                setupSITIParameter();
                this.mSITICalculator.setSITIEventObserver(new LiveStream$$Lambda$0(this));
                AVLog.ioi("LiveStream", "STIICalculator Created");
                return;
            }
            AVLog.ioe("LiveStream", "STIICalculator is not valid");
        }
    }

    @Override // com.ss.avframework.livestreamv2.ILiveStream
    public int pushAudioFrame(ByteBuffer byteBuffer, int i2, int i3, int i4, int i5, long j2) {
        AudioCapturer audioCapturer = this.mAudioCapture;
        if (audioCapturer == null || !(audioCapturer instanceof AudioCapturerExternal)) {
            return -1;
        }
        return ((AudioCapturerExternal) audioCapturer).pushAudioFrame(byteBuffer, i2, i3, i4, i5, j2);
    }

    @Override // com.ss.avframework.livestreamv2.ILiveStream
    public int addSeiField(String str, Object obj, int i2, boolean z, boolean z2, int i3) {
        return addSeiFieldWithNs(str, obj, i2, z, z2, i3, 0);
    }

    @Override // com.ss.avframework.livestreamv2.ILiveStream
    public int pushVideoFrame(int i2, boolean z, int i3, int i4, int i5, float[] fArr, long j2) {
        return pushVideoFrame(i2, z, i3, i4, i5, fArr, j2, null);
    }

    public int addSeiFieldWithNs(String str, Object obj, int i2, boolean z, boolean z2, int i3, long j2) {
        long currentTimeMillis = System.currentTimeMillis();
        if (this.mLastAddSeiStatTime == 0) {
            this.mLastAddSeiStatTime = currentTimeMillis;
        }
        if (currentTimeMillis - this.mLastAddSeiStatTime > 30000) {
            AVLog.ioi("LiveStream", "addSeiField is called " + this.mAddSeiCount + " times in last 30s.");
            this.mLastAddSeiStatTime = currentTimeMillis;
            this.mAddSeiCount = 0;
        }
        this.mAddSeiCount++;
        if (this.mRTMPTransport == null) {
            return -1;
        }
        int[] iArr = {0};
        String str2 = this.mVideoEncodeVsyncName;
        if (str2 == null && j2 > 0) {
            return -1;
        }
        this.mWorkThreadHandler.post(new LiveStream$$Lambda$11(this, z, j2, str2, iArr, str, obj, i2, z2, i3));
        return iArr[0];
    }

    @Override // com.ss.avframework.livestreamv2.ILiveStream
    public int pushVideoFrame(int i2, boolean z, int i3, int i4, int i5, float[] fArr, long j2, Bundle bundle) {
        LiveStreamVideoCapture liveStreamVideoCapture = this.mVideoCapturer;
        if (liveStreamVideoCapture != null) {
            return liveStreamVideoCapture.pushVideoFrame(i2, z, i3, i4, i5, fArr, j2, bundle);
        }
        return -1;
    }

    /* access modifiers changed from: package-private */
    public final /* synthetic */ void lambda$addSeiFieldWithNs$9$LiveStream(boolean z, long j2, String str, int[] iArr, String str2, Object obj, int i2, boolean z2, int i3) {
        long j3;
        VsyncModule vsyncModule;
        Transport transport = this.mRTMPTransport;
        if (transport != null) {
            VideoTrack videoTrack = this.mVideoTrack;
            if (!(z || videoTrack == null || (vsyncModule = transport.getVsyncModule()) == null)) {
                if (j2 > 0) {
                    j3 = vsyncModule.convertToNowMills(str, j2 / 1000000);
                } else if (str != null) {
                    j3 = vsyncModule.lastTimeMills(str);
                }
                iArr[0] = transport.addSeiField(str2, obj, i2, j3, z, z2, i3);
                return;
            }
            j3 = 0;
            iArr[0] = transport.addSeiField(str2, obj, i2, j3, z, z2, i3);
            return;
        }
        iArr[0] = -1;
    }
}
