package com.ss.avframework.livestreamv2.log;

import android.os.Handler;
import android.os.HandlerThread;
import android.os.Message;
import android.util.Log;
import com.bytedance.bpea.entry.common.DataType;
import com.bytedance.covode.number.Covode;
import com.ss.avframework.engine.AudioDeviceModule;
import com.ss.avframework.engine.MediaEngineFactory;
import com.ss.avframework.engine.VideoFrameStatistics;
import com.ss.avframework.livestreamv2.LiveStream;
import com.ss.avframework.livestreamv2.LiveStreamBuilder;
import com.ss.avframework.livestreamv2.LiveStreamReport;
import com.ss.avframework.livestreamv2.TransportSendStallStatics;
import com.ss.avframework.livestreamv2.control.IVideoCapturerControl;
import com.ss.avframework.livestreamv2.core.LayerControl;
import com.ss.avframework.livestreamv2.core.LiveCore;
import com.ss.avframework.opengl.VideoColorRange;
import com.ss.avframework.utils.AVLog;
import com.ss.avframework.utils.Monitor;
import com.ss.avframework.utils.TEBundle;
import com.ss.avframework.utils.TimeUtils;
import java.lang.ref.WeakReference;
import java.util.concurrent.atomic.AtomicInteger;
import org.json.JSONException;
import org.json.JSONObject;

public class LiveStreamLogService implements Handler.Callback {
    private int mAudioDeviceOpenErrorCode = 0;
    public long mAudioEncoderErrorCode = 0;
    public TransportSendStallStatics mConnectEndStatistic;
    public int mEnableCertVerify = 0;
    public int mEnableReportSenStallLog = 0;
    private double mEncodeFps;
    public int mErrorCount = 0;
    public int mFpsAdjustTimes;
    public long mInCapFps0Count;
    private final long mInterval;
    public boolean mIsFirstConnect = false;
    public long mLastBitRate;
    public int mLastErrorCode = 200;
    private WeakReference<LayerControl> mLayerControlWeakReference;
    private LiveCore mLiveCore;
    public TransportSendStallStatics mLiveCoreEndStatistic;
    private LiveStream mLiveStream;
    protected Handler mLogUploadThreadHandler;
    public ILogUploader mLogUploader;
    public int mLongerPackageDelayTimes;
    private Monitor mMonitor;
    public long mPreFpsNon0EncFps0Count;
    private double mPreviewFps;
    public long mPushStartTime;
    public long mPushStreamCount;
    public TransportSendStallStatics mPushStreamStatistic;
    public int mRateAdjustTimes;
    private double mRealBitrate;
    private double mRealFps;
    public int mReconnectTimes;
    private String mRemoteIP = "";
    private long mRtmpConnectingTime = 0;
    private long mRtmpReConnectingTime = 0;
    public long mSandboxProceedCost = -1;
    private LiveStreamReport mStaticsReport;
    private AtomicInteger mStatus;
    private StringBuffer mTransportStats = new StringBuffer();
    private int mVideoDeviceOpenErrorCode = 0;
    public long mVideoEncoderErrorCode = 0;
    protected Handler mWorkThreadHandler;

    static {
        Covode.recordClassIndex(100413);
    }

    private boolean needReport() {
        return haveMode(3);
    }

    public void onRTMPConnecting() {
        this.mRtmpConnectingTime = System.currentTimeMillis();
    }

    public void onReconnect() {
        this.mReconnectTimes++;
    }

    private void report() {
        if (this.mLiveCore != null && this.mLogUploader != null && this.mStaticsReport != null && needReport()) {
            try {
                LiveCore liveCore = this.mLiveCore;
                if (liveCore != null) {
                    liveCore.getLiveStreamInfo(this.mStaticsReport);
                }
                this.mLogUploader.uploadLog(createLog(this.mStaticsReport));
            } catch (JSONException unused) {
            }
            this.mLogUploadThreadHandler.sendEmptyMessageDelayed(101, this.mInterval);
        }
    }

    public String getPushType() {
        LiveStreamBuilder liveStreamBuilder;
        boolean z;
        LiveStream liveStream = this.mLiveStream;
        if (liveStream != null) {
            liveStreamBuilder = liveStream.getLiveStreamBuilder();
        } else {
            liveStreamBuilder = null;
        }
        if (liveStreamBuilder == null) {
            return "none";
        }
        if (liveStreamBuilder.getVideoCaptureDevice() != 0) {
            z = true;
        } else {
            z = false;
        }
        if (liveStreamBuilder.getAudioCaptureDevice() != 0) {
            if (!z) {
                return DataType.AUDIO;
            }
            return "avo";
        } else if (z) {
            return "video";
        } else {
            return "none";
        }
    }

    public void reset() {
        this.mLastBitRate = 0;
        this.mRateAdjustTimes = 0;
        this.mFpsAdjustTimes = 0;
        this.mLongerPackageDelayTimes = 0;
        this.mReconnectTimes = 0;
        this.mRtmpConnectingTime = 0;
        this.mRtmpReConnectingTime = 0;
        this.mLastErrorCode = 200;
        this.mErrorCount = 0;
        this.mIsFirstConnect = false;
        this.mAudioEncoderErrorCode = 0;
        this.mVideoEncoderErrorCode = 0;
        this.mAudioDeviceOpenErrorCode = 0;
        this.mVideoDeviceOpenErrorCode = 0;
        this.mSandboxProceedCost = -1;
        this.mEnableReportSenStallLog = 0;
    }

    public void staticAverageLog() {
        LiveStreamReport liveStreamReport;
        LiveStream liveStream = this.mLiveStream;
        if (liveStream != null && this.mLogUploader != null && (liveStreamReport = this.mStaticsReport) != null) {
            liveStream.getLiveStreamInfo(liveStreamReport);
            if (isZero(this.mRealFps)) {
                this.mRealFps = this.mStaticsReport.getVideoTransportRealFps();
            } else {
                this.mRealFps = (this.mRealFps + this.mStaticsReport.getVideoTransportRealFps()) / 2.0d;
            }
            if (isZero(this.mPreviewFps)) {
                this.mPreviewFps = this.mStaticsReport.getVideoSourceDeliverFps();
            } else {
                this.mPreviewFps = (this.mPreviewFps + this.mStaticsReport.getVideoSourceDeliverFps()) / 2.0d;
            }
            if (isZero(this.mEncodeFps)) {
                this.mEncodeFps = this.mStaticsReport.getVideoEncodeRealFps();
            } else {
                this.mEncodeFps = (this.mEncodeFps + this.mStaticsReport.getVideoEncodeRealFps()) / 2.0d;
            }
            if (isZero(this.mRealBitrate)) {
                this.mRealBitrate = this.mStaticsReport.getVideoTransportRealBps();
            } else {
                this.mRealBitrate = (this.mRealBitrate + this.mStaticsReport.getVideoTransportRealBps()) / 2.0d;
            }
            if (needReport()) {
                this.mLogUploadThreadHandler.sendEmptyMessageDelayed(102, 1000);
            }
        }
    }

    public void setEnableCertVerify(int i2) {
        this.mEnableCertVerify = i2;
    }

    public void setReportStallLog(int i2) {
        this.mEnableReportSenStallLog = i2;
    }

    public void setSandboxProceedCost(long j2) {
        this.mSandboxProceedCost = j2;
    }

    static class LiveStreamLogFilter implements AVLog.ILogFilter {
        private WeakReference<LiveStreamLogService> mLogService;

        static {
            Covode.recordClassIndex(100432);
        }

        public LiveStreamLogFilter(LiveStreamLogService liveStreamLogService) {
            setLogService(liveStreamLogService);
        }

        public void setLogService(LiveStreamLogService liveStreamLogService) {
            this.mLogService = new WeakReference<>(liveStreamLogService);
        }

        @Override // com.ss.avframework.utils.AVLog.ILogFilter
        public void print(int i2, String str, String str2, Throwable th) {
            if (th != null) {
                str2 = str2 + " Cause:" + Log.getStackTraceString(th);
            }
            LiveStreamLogService liveStreamLogService = this.mLogService.get();
            if (liveStreamLogService != null) {
                liveStreamLogService.uploadSDKLog(i2, str, str2);
            }
        }

        @Override // com.ss.avframework.utils.AVLog.ILogFilter
        public void print(int i2, String str, String str2, String str3, Throwable th) {
            if (th != null) {
                str3 = str3 + " Cause:" + Log.getStackTraceString(th);
            }
            LiveStreamLogService liveStreamLogService = this.mLogService.get();
            if (liveStreamLogService != null) {
                liveStreamLogService.uploadSDKLogEvent(i2, str, str2, str3);
            }
        }
    }

    public void setupLayerControl(LayerControl layerControl) {
        this.mLayerControlWeakReference = new WeakReference<>(layerControl);
    }

    private boolean haveMode(int i2) {
        if ((i2 & this.mStatus.get()) > 0) {
            return true;
        }
        return false;
    }

    private boolean isZero(double d2) {
        return String.valueOf(d2).equals("0.0");
    }

    public void getLiveCoreEndLog(JSONObject jSONObject) {
        TransportSendStallStatics transportSendStallStatics;
        if (this.mEnableReportSenStallLog > 0 && (transportSendStallStatics = this.mLiveCoreEndStatistic) != null) {
            transportSendStallStatics.getTransportSendStallLog(jSONObject);
        }
    }

    public boolean handleMessage(Message message) {
        if (101 != message.what) {
            return true;
        }
        report();
        return true;
    }

    public void onKCPMessage(String str) {
        this.mTransportStats.append(str).append("\n");
    }

    public void onOtherMessage(String str) {
        this.mTransportStats.append(str).append("\n");
    }

    public void onQUICMessage(String str) {
        this.mTransportStats.append(str).append("\n");
    }

    public void onGamePreload(final String str) {
        if (this.mLiveStream != null && this.mLogUploader != null) {
            final long currentTimeMillis = System.currentTimeMillis();
            this.mLogUploadThreadHandler.post(new Runnable() {
                /* class com.ss.avframework.livestreamv2.log.LiveStreamLogService.AnonymousClass15 */

                static {
                    Covode.recordClassIndex(100420);
                }

                public void run() {
                    try {
                        JSONObject createCommonLog = LiveStreamLogService.this.createCommonLog(currentTimeMillis);
                        if (createCommonLog != null) {
                            createCommonLog.put("event_key", "game_preload").put("message", str);
                        }
                        LiveStreamLogService.this.mLogUploader.uploadLog(createCommonLog);
                    } catch (Exception unused) {
                    }
                }
            });
        }
    }

    public void onGameStart(final String str) {
        if (this.mLogUploader != null) {
            final long currentTimeMillis = System.currentTimeMillis();
            this.mLogUploadThreadHandler.post(new Runnable() {
                /* class com.ss.avframework.livestreamv2.log.LiveStreamLogService.AnonymousClass13 */

                static {
                    Covode.recordClassIndex(100418);
                }

                public void run() {
                    try {
                        JSONObject createCommonLog = LiveStreamLogService.this.createCommonLog(currentTimeMillis);
                        if (createCommonLog != null) {
                            createCommonLog.put("event_key", "game_start").put("message", str);
                        }
                        LiveStreamLogService.this.mLogUploader.uploadLog(createCommonLog);
                    } catch (Exception unused) {
                    }
                }
            });
        }
    }

    public void onGameStop(final String str) {
        if (this.mLiveStream != null && this.mLogUploader != null) {
            final long currentTimeMillis = System.currentTimeMillis();
            this.mLogUploadThreadHandler.post(new Runnable() {
                /* class com.ss.avframework.livestreamv2.log.LiveStreamLogService.AnonymousClass14 */

                static {
                    Covode.recordClassIndex(100419);
                }

                public void run() {
                    try {
                        JSONObject createCommonLog = LiveStreamLogService.this.createCommonLog(currentTimeMillis);
                        if (createCommonLog != null) {
                            createCommonLog.put("event_key", "game_stop").put("message", str);
                        }
                        LiveStreamLogService.this.mLogUploader.uploadLog(createCommonLog);
                    } catch (Exception unused) {
                    }
                }
            });
        }
    }

    public void onSendPktSlow(final int i2) {
        this.mLongerPackageDelayTimes++;
        final long currentTimeMillis = System.currentTimeMillis();
        this.mLogUploadThreadHandler.post(new Runnable() {
            /* class com.ss.avframework.livestreamv2.log.LiveStreamLogService.AnonymousClass12 */

            static {
                Covode.recordClassIndex(100417);
            }

            public void run() {
                JSONObject createCommonLog = LiveStreamLogService.this.createCommonLog(currentTimeMillis);
                if (createCommonLog != null) {
                    try {
                        createCommonLog.put("event_key", "send_package_slow").put("send_package_duration", i2);
                        LiveStreamLogService.this.mLogUploader.uploadLog(createCommonLog);
                    } catch (JSONException e2) {
                        e2.printStackTrace();
                    }
                }
            }
        });
    }

    public void onSessionInterrupt(final boolean z) {
        final long nanoTime = TimeUtils.nanoTime() / 1000000;
        final long currentTimeMillis = System.currentTimeMillis();
        this.mLogUploadThreadHandler.post(new Runnable() {
            /* class com.ss.avframework.livestreamv2.log.LiveStreamLogService.AnonymousClass2 */

            static {
                Covode.recordClassIndex(100424);
            }

            public void run() {
                JSONObject createCommonLog = LiveStreamLogService.this.createCommonLog(currentTimeMillis);
                if (createCommonLog != null) {
                    try {
                        JSONObject jSONObject = new JSONObject();
                        jSONObject.put("clockMs", nanoTime);
                        jSONObject.put("interrupt", z);
                        createCommonLog.put("event_key", "session_interrupt").put("message", jSONObject.toString());
                    } catch (JSONException unused) {
                        return;
                    }
                }
                if (LiveStreamLogService.this.mLogUploader != null) {
                    LiveStreamLogService.this.mLogUploader.uploadLog(createCommonLog);
                }
            }
        });
    }

    public void onSwitchGameStream(final String str) {
        if (this.mLiveStream != null && this.mLogUploader != null) {
            final long currentTimeMillis = System.currentTimeMillis();
            this.mLogUploadThreadHandler.post(new Runnable() {
                /* class com.ss.avframework.livestreamv2.log.LiveStreamLogService.AnonymousClass17 */

                static {
                    Covode.recordClassIndex(100422);
                }

                public void run() {
                    try {
                        JSONObject createCommonLog = LiveStreamLogService.this.createCommonLog(currentTimeMillis);
                        if (createCommonLog != null) {
                            createCommonLog.put("event_key", "video_pipeline_changed").put("message", str);
                        }
                        LiveStreamLogService.this.mLogUploader.uploadLog(createCommonLog);
                    } catch (Exception unused) {
                    }
                }
            });
        }
    }

    public void onConnectEnd(final int i2) {
        final float f2;
        final float f3;
        if (this.mPushStartTime != 0) {
            final long j2 = this.mPushStreamCount;
            if (j2 == 0) {
                f2 = 0.0f;
            } else {
                f2 = (((float) this.mInCapFps0Count) * 1.0f) / ((float) j2);
            }
            if (j2 == 0) {
                f3 = 0.0f;
            } else {
                f3 = (((float) this.mPreFpsNon0EncFps0Count) * 1.0f) / ((float) j2);
            }
            final long currentTimeMillis = System.currentTimeMillis();
            if (this.mEnableReportSenStallLog > 0 && this.mRtmpReConnectingTime == 0) {
                this.mRtmpReConnectingTime = currentTimeMillis;
            }
            this.mLogUploadThreadHandler.post(new Runnable() {
                /* class com.ss.avframework.livestreamv2.log.LiveStreamLogService.AnonymousClass18 */

                static {
                    Covode.recordClassIndex(100423);
                }

                public void run() {
                    JSONObject createCommonLog = LiveStreamLogService.this.createCommonLog(currentTimeMillis);
                    if (createCommonLog != null) {
                        try {
                            createCommonLog.put("event_key", "connect_end").put("state", i2).put("reconnect_count", LiveStreamLogService.this.mReconnectTimes).put("error_code", LiveStreamLogService.this.mLastErrorCode).put("error_count", LiveStreamLogService.this.mErrorCount).put("first_connect", LiveStreamLogService.this.mIsFirstConnect).put("rate_adjust_times", LiveStreamLogService.this.mRateAdjustTimes).put("fps_adjust_times", LiveStreamLogService.this.mFpsAdjustTimes).put("video_encode_error_code", LiveStreamLogService.this.mVideoEncoderErrorCode).put("audio_encode_error_code", LiveStreamLogService.this.mAudioEncoderErrorCode).put("send_package_slow_times", LiveStreamLogService.this.mLongerPackageDelayTimes).put("push_duration", currentTimeMillis - LiveStreamLogService.this.mPushStartTime).put("push_stream_count", j2).put("capture_0fps_ratio", (double) f2).put("encode_0fps_ratio", (double) f3);
                            if (!(LiveStreamLogService.this.mEnableReportSenStallLog <= 0 || LiveStreamLogService.this.mPushStreamStatistic == null || LiveStreamLogService.this.mConnectEndStatistic == null || LiveStreamLogService.this.mLiveCoreEndStatistic == null)) {
                                LiveStreamLogService.this.mConnectEndStatistic.accumulate(LiveStreamLogService.this.mPushStreamStatistic);
                                LiveStreamLogService.this.mConnectEndStatistic.getTransportSendStallLog(createCommonLog);
                                LiveStreamLogService.this.mLiveCoreEndStatistic.accumulate(LiveStreamLogService.this.mConnectEndStatistic);
                                LiveStreamLogService.this.mConnectEndStatistic.reset();
                            }
                            LiveStreamLogService.this.appendAVCodecProfileToLog(createCommonLog);
                            LiveStreamLogService.this.mLogUploader.uploadLog(createCommonLog);
                        } catch (JSONException e2) {
                            e2.printStackTrace();
                        }
                        LiveStreamLogService.this.mPushStartTime = 0;
                        LiveStreamLogService.this.mLastErrorCode = 200;
                        LiveStreamLogService.this.mErrorCount = 0;
                        LiveStreamLogService.this.mIsFirstConnect = false;
                        LiveStreamLogService.this.mPushStreamCount = 0;
                        LiveStreamLogService.this.mInCapFps0Count = 0;
                        LiveStreamLogService.this.mPreFpsNon0EncFps0Count = 0;
                    }
                }
            });
        }
    }

    public void appendAVCodecProfileToLog(JSONObject jSONObject) {
        LiveStreamBuilder liveStreamBuilder;
        LiveStream liveStream = this.mLiveStream;
        if (liveStream != null && (liveStreamBuilder = liveStream.getLiveStreamBuilder()) != null) {
            String[] strArr = {"", "h264", "bytevc1"};
            String[] strArr2 = {"", "base", "main", "high", "main", "main10"};
            String[] strArr3 = {"", "LC", "HE", "HEv2"};
            String[] strArr4 = {"", "", "", ""};
            strArr4[2] = "aacFdk";
            int i2 = 1;
            strArr4[1] = "aacMediaCodec";
            strArr4[3] = "aacFFmpeg";
            try {
                JSONObject put = jSONObject.put("audio_codec", strArr4[liveStreamBuilder.getAudioEncoder()]).put("audio_profile", strArr3[liveStreamBuilder.getAudioProfile()]).put("video_codec", strArr[liveStreamBuilder.getVideoEncoder()]).put("video_profile", strArr2[liveStreamBuilder.getVideoProfile()]);
                if (!liveStreamBuilder.isEnableVideoEncodeAccelera()) {
                    i2 = 0;
                }
                put.put("hardware", i2);
            } catch (ArrayIndexOutOfBoundsException | JSONException unused) {
            }
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r2v0 */
    /* JADX WARN: Type inference failed for: r2v1 */
    /* JADX WARN: Type inference failed for: r2v8 */
    /* JADX WARNING: Removed duplicated region for block: B:19:0x0089  */
    /* JADX WARNING: Removed duplicated region for block: B:22:0x00a3  */
    /* JADX WARNING: Removed duplicated region for block: B:28:0x00bc  */
    /* JADX WARNING: Removed duplicated region for block: B:29:0x00bf  */
    /* JADX WARNING: Unknown variable types count: 1 */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public org.json.JSONObject createCommonLog(long r23) {
        /*
        // Method dump skipped, instructions count: 430
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ss.avframework.livestreamv2.log.LiveStreamLogService.createCommonLog(long):org.json.JSONObject");
    }

    private JSONObject createLog(LiveStreamReport liveStreamReport) {
        LiveStream liveStream;
        int inCaptureRealFps;
        String str;
        LayerControl layerControl;
        int i2;
        int i3;
        String str2;
        Object obj;
        JSONObject jSONObject;
        int i4;
        AudioDeviceModule adm;
        TransportSendStallStatics transportSendStallStatics;
        JSONObject createCommonLog = createCommonLog(System.currentTimeMillis());
        if (createCommonLog == null || liveStreamReport == null || (liveStream = this.mLiveStream) == null) {
            return null;
        }
        LiveStreamBuilder liveStreamBuilder = liveStream.getLiveStreamBuilder();
        IVideoCapturerControl videoCapturerControl = this.mLiveStream.getVideoCapturerControl();
        if (liveStreamBuilder == null) {
            return null;
        }
        if (haveMode(3)) {
            appendAVCodecProfileToLog(createCommonLog);
            createCommonLog = createCommonLog.put("video_capture_type", liveStreamBuilder.getVideoCaptureDevice()).put("audio_capture_type", liveStreamBuilder.getAudioCaptureDevice()).put("cpu", this.mMonitor.getAppPrecentageOnCPU()).put("memory", this.mMonitor.getAppRSSKB());
        }
        int i5 = -1;
        if (videoCapturerControl == null) {
            inCaptureRealFps = -1;
        } else {
            inCaptureRealFps = (int) videoCapturerControl.getInCaptureRealFps();
        }
        int videoSourceDeliverFps = (int) liveStreamReport.getVideoSourceDeliverFps();
        int videoEncodeRealFps = (int) liveStreamReport.getVideoEncodeRealFps();
        if (this.mPushStartTime != 0) {
            this.mPushStreamCount++;
            if (inCaptureRealFps == 0) {
                this.mInCapFps0Count++;
            }
            if (videoSourceDeliverFps != 0 && videoEncodeRealFps == 0) {
                this.mPreFpsNon0EncFps0Count++;
            }
        }
        if (!liveStreamBuilder.isEnableVideoEncodeAccelera()) {
            i5 = VideoColorRange.checkRgb2YuvFormulaColorRange();
        }
        if (i5 == 0) {
            str = "FullRange";
        } else if (i5 == 1) {
            str = "VideoRange";
        } else {
            str = "Unknown";
        }
        if (haveMode(1)) {
            JSONObject put = createCommonLog.put("event_key", "push_stream").put("audio_channel", liveStreamBuilder.getAudioChannel()).put("audio_enc_bitrate", ((int) liveStreamReport.getAudioEncodeRealBps()) / 1000).put("audio_sample_rate", liveStreamBuilder.getAudioSampleHZ()).put("audio_source_live", this.mLiveStream.isAudioLive() ? 1 : 0).put("audio_capture_channel", liveStreamBuilder.getAudioCaptureChannel()).put("audio_capture_sample", liveStreamBuilder.getAudioCaptureSampleHZ()).put("drop_source_fps", (int) liveStreamReport.getVideoSourceDropFps()).put("drop_count", ((int) liveStreamReport.getVideoDropCount()) + ((int) liveStreamReport.getTransportDropCount())).put("duration", liveStreamReport.getTransportDuration()).put("encode_fps", videoEncodeRealFps).put("height", liveStreamBuilder.getVideoHeight());
            if (liveStreamBuilder.getVideoFps() != 0) {
                i3 = this.mLiveStream.getVideoGop() / liveStreamBuilder.getVideoFps();
            } else {
                i3 = 0;
            }
            JSONObject put2 = put.put("i_key_frame_max", i3).put("in_cap_fps", inCaptureRealFps).put("live_status", this.mLiveStream.status()).put("meta_audio_bitrate", liveStreamBuilder.getAudioBitrate() / 1000).put("meta_video_bitrate", this.mLiveStream.getVideoMetaBitRate() / 1000).put("meta_video_framerate", liveStreamBuilder.getVideoFps()).put("preview_fps", videoSourceDeliverFps).put("out_cap_fps", (int) liveStreamReport.getVideoSourceDeliverFps()).put("package_delay", (int) (liveStreamReport.getTransportPackageAverageDelay() + 0.5d)).put("push_type", getPushType()).put("real_bitrate", ((int) liveStreamReport.getVideoTransportRealBps()) / 1000).put("real_video_framerate", (int) liveStreamReport.getVideoTransportRealFps()).put("rtmp_buffer_time", this.mLiveStream.getInt64Value(1));
            StringBuffer stringBuffer = this.mTransportStats;
            if (stringBuffer == null || stringBuffer.length() == 0) {
                str2 = "null";
            } else {
                str2 = this.mTransportStats.toString();
            }
            createCommonLog = put2.put("transport_layer_status", str2).put("video_capture_width", liveStreamBuilder.getVideoCaptureWidth()).put("video_capture_height", liveStreamBuilder.getVideoCaptureHeight()).put("video_capture_fps", liveStreamBuilder.getVideoCaptureFps()).put("video_enc_bitrate", ((int) liveStreamReport.getVideoEncodeRealBps()) / 1000).put("video_source_live", this.mLiveStream.isVideoLive() ? 1 : 0).put("camera_start_error_code", this.mVideoDeviceOpenErrorCode).put("mic_start_error_code", this.mAudioDeviceOpenErrorCode).put("width", liveStreamBuilder.getVideoWidth()).put("transform_color_range", str).put("iframe_psnr", liveStreamReport.getVideoEncodePSNRFromKeyFrame()).put("pframe_psnr", liveStreamReport.getVideoEncodePSNRFromNoKeyFrame());
            if (!(this.mEnableReportSenStallLog <= 0 || (transportSendStallStatics = this.mPushStreamStatistic) == null || this.mConnectEndStatistic == null)) {
                transportSendStallStatics.getTransportSendStallLog(createCommonLog);
                this.mConnectEndStatistic.accumulate(this.mPushStreamStatistic);
                this.mPushStreamStatistic.reset();
            }
            if (this.mPushStartTime != 0) {
                createCommonLog.put("time_diff", System.currentTimeMillis() - this.mPushStartTime);
            }
            JSONObject jSONObject2 = new JSONObject();
            LiveCore liveCore = this.mLiveCore;
            if (!(liveCore == null || (adm = liveCore.getADM()) == null)) {
                int option = (int) adm.getOption(1);
                int option2 = (int) adm.getOption(2);
                int option3 = (int) adm.getOption(3);
                int audioStreamdB = liveStreamReport.getAudioStreamdB();
                createCommonLog.put("rms", option + "," + option2 + "," + option3 + "," + audioStreamdB + "," + ((int) adm.getOption(9)) + "," + ((int) adm.getOption(8)));
                jSONObject2.put("local_mic_db", option + "," + option2 + "," + option3 + "," + audioStreamdB);
                jSONObject2.put("adm_status", adm.getReportJsonStats());
                jSONObject2.put("mic_start_error_code", (int) adm.getOption(10));
                jSONObject2.put("au_ahs", adm.isHeadSet());
                jSONObject2.put("enable_ear_monitoring", adm.isEchoMode());
                jSONObject2.put("au_rnfe", (int) adm.getOption(12));
                jSONObject2.put("au_pnfe", (int) adm.getOption(13));
                jSONObject2.put("au_pe", (int) adm.getOption(14));
                jSONObject2.put("au_iee", (int) adm.getOption(15));
                adm.clearLogState();
            }
            int videoCaptureDevice = liveStreamBuilder.getVideoCaptureDevice();
            if (videoCaptureDevice == 1 || videoCaptureDevice == 2) {
                if (videoCapturerControl == null || (jSONObject = videoCapturerControl.getRealCameraStatus()) == null) {
                    jSONObject = new JSONObject();
                }
                if (liveStreamBuilder.isVECamera2API()) {
                    i4 = 2;
                } else {
                    i4 = 1;
                }
                jSONObject.put("expected_camera_type", i4);
                jSONObject2.put("camera", jSONObject);
            }
            if (liveStreamBuilder.getVideoEncoder() == 1 && !liveStreamBuilder.isEnableVideoEncodeAccelera()) {
                if (liveStreamBuilder.isSelfInnovateSoftEncode()) {
                    obj = "bytevc0";
                } else {
                    obj = "x264";
                }
                jSONObject2.put("video_codec", obj);
            }
            int roiOn = liveStreamBuilder.getRoiOn();
            if (roiOn != 0) {
                TEBundle roiSettings = liveStreamBuilder.getRoiSettings();
                JSONObject jSONObject3 = new JSONObject();
                jSONObject3.put("roi_on", roiOn);
                jSONObject3.put("roi_qp", roiSettings.getInt("roi_qp"));
                jSONObject3.put("roi_bitrate_ratio", roiSettings.getDouble("roi_bitrate_ratio"));
                jSONObject2.put("roi", jSONObject3);
            }
            jSONObject2.put("native_live_sdk_version", MediaEngineFactory.getVersion());
            if (liveStreamBuilder.isEnableVideoFrameStatistics()) {
                jSONObject2.put("video_frame_elapse", liveStreamReport.getVideoFrameElapse());
            }
            jSONObject2.put("cur_categoty", this.mLiveStream.getCurCplxCategory());
            Object stringValue = this.mLiveStream.getStringValue(3);
            if (stringValue != null) {
                jSONObject2.put("video_cplx_performance", stringValue);
            }
            createCommonLog.put("message", jSONObject2.toString());
        }
        if (haveMode(2)) {
            WeakReference<LayerControl> weakReference = this.mLayerControlWeakReference;
            if (weakReference != null) {
                layerControl = weakReference.get();
            } else {
                layerControl = null;
            }
            JSONObject put3 = createCommonLog.put("event_key", "game_stream").put("render_fps", (int) (liveStreamReport.getMiniGameRenderFps() + 0.5d));
            if (layerControl == null || !layerControl.isDirectRenderMode()) {
                i2 = 2;
            } else {
                i2 = 1;
            }
            createCommonLog = put3.put("stream_type", i2);
        }
        this.mTransportStats.setLength(0);
        if (liveStreamBuilder.isEnableVideoFrameStatistics()) {
            VideoFrameStatistics.reset();
        }
        return createCommonLog;
    }

    public void setDeviceOpenErrorCode(boolean z, int i2) {
        if (z) {
            this.mAudioDeviceOpenErrorCode = i2;
        } else {
            this.mVideoDeviceOpenErrorCode = i2;
        }
    }

    public void setEncoderErrorCode(boolean z, long j2) {
        if (z) {
            this.mAudioEncoderErrorCode = j2;
        } else {
            this.mVideoEncoderErrorCode = j2;
        }
    }

    public void onBitrateAdjust(final long j2, final String str) {
        this.mRateAdjustTimes++;
        final long currentTimeMillis = System.currentTimeMillis();
        this.mLogUploadThreadHandler.post(new Runnable() {
            /* class com.ss.avframework.livestreamv2.log.LiveStreamLogService.AnonymousClass7 */

            static {
                Covode.recordClassIndex(100429);
            }

            public void run() {
                JSONObject createCommonLog = LiveStreamLogService.this.createCommonLog(currentTimeMillis);
                if (createCommonLog != null) {
                    try {
                        createCommonLog.put("event_key", "bitrate_adjust").put("bitrate_beforeadjust", LiveStreamLogService.this.mLastBitRate).put("bitrate_afteradjust", j2).put("adjustment", str);
                        LiveStreamLogService.this.mLogUploader.uploadLog(createCommonLog);
                    } catch (JSONException e2) {
                        e2.printStackTrace();
                    }
                }
                LiveStreamLogService.this.mLastBitRate = j2;
            }
        });
    }

    public void onPushStreamFail(final int i2, final String str) {
        this.mLastErrorCode = i2;
        final long currentTimeMillis = System.currentTimeMillis();
        this.mLogUploadThreadHandler.post(new Runnable() {
            /* class com.ss.avframework.livestreamv2.log.LiveStreamLogService.AnonymousClass10 */

            static {
                Covode.recordClassIndex(100415);
            }

            public void run() {
                JSONObject createCommonLog = LiveStreamLogService.this.createCommonLog(currentTimeMillis);
                if (createCommonLog != null) {
                    try {
                        createCommonLog.put("event_key", "push_stream_fail").put("message", str).put("error_code", i2);
                        LiveStreamLogService.this.mLogUploader.uploadLog(createCommonLog);
                    } catch (JSONException e2) {
                        e2.printStackTrace();
                    }
                }
            }
        });
    }

    public void uploadVideoEncodeFpsAdjustLog(int i2, int i3) {
        final JSONObject jSONObject = new JSONObject();
        try {
            jSONObject.put("key", "Adjust videoEncodeFps");
            jSONObject.put("lastEncodeFps", i2);
            jSONObject.put("newEncodeFps", i3);
            jSONObject.put("timestamp", System.currentTimeMillis());
        } catch (Exception unused) {
        }
        this.mLogUploadThreadHandler.post(new Runnable() {
            /* class com.ss.avframework.livestreamv2.log.LiveStreamLogService.AnonymousClass1 */

            static {
                Covode.recordClassIndex(100414);
            }

            public void run() {
                AVLog.logKibana(4, "Adjust videoEncodeFps", jSONObject.toString(), null);
            }
        });
    }

    public void addOrRemoveStatus(int i2, boolean z) {
        if (i2 != 2 && i2 != 1) {
            return;
        }
        if (z) {
            AtomicInteger atomicInteger = this.mStatus;
            atomicInteger.set((i2 ^ 65535) & atomicInteger.get());
        } else if (!needReport()) {
            this.mLogUploadThreadHandler.removeMessages(101);
            AtomicInteger atomicInteger2 = this.mStatus;
            atomicInteger2.set(i2 | atomicInteger2.get());
            this.mLogUploadThreadHandler.sendEmptyMessageDelayed(101, this.mInterval);
        } else {
            AtomicInteger atomicInteger3 = this.mStatus;
            atomicInteger3.set(i2 | atomicInteger3.get());
        }
    }

    public void extError(final int i2, final int i3, Exception exc) {
        final String str;
        final long currentTimeMillis = System.currentTimeMillis();
        if (exc != null) {
            str = exc.toString();
        } else {
            str = null;
        }
        this.mLogUploadThreadHandler.post(new Runnable() {
            /* class com.ss.avframework.livestreamv2.log.LiveStreamLogService.AnonymousClass6 */

            static {
                Covode.recordClassIndex(100428);
            }

            public void run() {
                JSONObject createCommonLog = LiveStreamLogService.this.createCommonLog(currentTimeMillis);
                if (createCommonLog != null) {
                    try {
                        createCommonLog.put("event_key", "live_ext_shutdown").put("error_type", i2).put("error_code", i3).put("msg", str);
                        LiveStreamLogService.this.mLogUploader.uploadLog(createCommonLog);
                    } catch (JSONException e2) {
                        e2.printStackTrace();
                    }
                }
            }
        });
    }

    public void onFpsAdjust(final int i2, final int i3, final String str) {
        this.mFpsAdjustTimes++;
        final long currentTimeMillis = System.currentTimeMillis();
        this.mLogUploadThreadHandler.post(new Runnable() {
            /* class com.ss.avframework.livestreamv2.log.LiveStreamLogService.AnonymousClass8 */

            static {
                Covode.recordClassIndex(100430);
            }

            public void run() {
                JSONObject createCommonLog = LiveStreamLogService.this.createCommonLog(currentTimeMillis);
                if (createCommonLog != null) {
                    try {
                        createCommonLog.put("event_key", "fps_adjust").put("fps_beforeadjust", i2).put("fps_afteradjust", i3).put("adjustment", str);
                        LiveStreamLogService.this.mLogUploader.uploadLog(createCommonLog);
                    } catch (JSONException e2) {
                        e2.printStackTrace();
                    }
                }
            }
        });
    }

    public void onGameError(final String str, final String str2, final Throwable th) {
        if (this.mLiveStream != null && this.mLogUploader != null) {
            final long currentTimeMillis = System.currentTimeMillis();
            this.mLogUploadThreadHandler.post(new Runnable() {
                /* class com.ss.avframework.livestreamv2.log.LiveStreamLogService.AnonymousClass16 */

                static {
                    Covode.recordClassIndex(100421);
                }

                public void run() {
                    String str;
                    try {
                        JSONObject createCommonLog = LiveStreamLogService.this.createCommonLog(currentTimeMillis);
                        if (createCommonLog != null) {
                            JSONObject put = createCommonLog.put("event_key", "game_error");
                            StringBuilder append = new StringBuilder("gameId:").append(str).append(",msg:").append(str2).append(",cause:");
                            Throwable th = th;
                            if (th != null) {
                                str = th.getMessage();
                            } else {
                                str = "";
                            }
                            put.put("message", append.append(str).toString());
                        }
                        LiveStreamLogService.this.mLogUploader.uploadLog(createCommonLog);
                    } catch (Exception unused) {
                    }
                }
            });
        }
    }

    public void onPushModeChangeBitrateAdjust(final int i2, final int i3, final int i4) {
        final long currentTimeMillis = System.currentTimeMillis();
        this.mLogUploadThreadHandler.post(new Runnable() {
            /* class com.ss.avframework.livestreamv2.log.LiveStreamLogService.AnonymousClass9 */

            static {
                Covode.recordClassIndex(100431);
            }

            public void run() {
                JSONObject createCommonLog = LiveStreamLogService.this.createCommonLog(currentTimeMillis);
                if (createCommonLog != null) {
                    try {
                        createCommonLog.put("event_key", "bitrate_adjust").put("default_bitrate", i2 / 1000).put("min_bitrate", i3 / 1000).put("max_bitrate", i4 / 1000);
                        LiveStreamLogService.this.mLogUploader.uploadLog(createCommonLog);
                    } catch (JSONException e2) {
                        e2.printStackTrace();
                    }
                }
            }
        });
        this.mLastBitRate = (long) i2;
    }

    public void onPushStreamStall(final boolean z, final int i2, final long j2) {
        TransportSendStallStatics transportSendStallStatics;
        if (this.mEnableReportSenStallLog > 0 && (transportSendStallStatics = this.mPushStreamStatistic) != null) {
            transportSendStallStatics.setTransportSendStallParam(z, i2, j2);
        }
        final long currentTimeMillis = System.currentTimeMillis();
        this.mLogUploadThreadHandler.post(new Runnable() {
            /* class com.ss.avframework.livestreamv2.log.LiveStreamLogService.AnonymousClass11 */

            static {
                Covode.recordClassIndex(100416);
            }

            public void run() {
                JSONObject createCommonLog = LiveStreamLogService.this.createCommonLog(currentTimeMillis);
                if (createCommonLog != null) {
                    try {
                        createCommonLog.put("event_key", "push_stream_stall").put("stall_type", "send_stall").put("is_audio", z).put("stall_time", j2).put("stall_reason", i2);
                        LiveStreamLogService.this.mLogUploader.uploadLog(createCommonLog);
                    } catch (JSONException e2) {
                        e2.printStackTrace();
                    }
                }
            }
        });
    }

    public void uploadSDKLog(final int i2, final String str, final String str2) {
        final long nanoTime = TimeUtils.nanoTime() / 1000000;
        final long currentTimeMillis = System.currentTimeMillis();
        this.mLogUploadThreadHandler.post(new Runnable() {
            /* class com.ss.avframework.livestreamv2.log.LiveStreamLogService.AnonymousClass3 */

            static {
                Covode.recordClassIndex(100425);
            }

            public void run() {
                JSONObject createCommonLog = LiveStreamLogService.this.createCommonLog(currentTimeMillis);
                if (createCommonLog != null) {
                    try {
                        JSONObject jSONObject = new JSONObject();
                        jSONObject.put("clockMs", nanoTime);
                        jSONObject.put("level", i2);
                        jSONObject.put("tag", str);
                        jSONObject.put("msg", str2);
                        createCommonLog.put("event_key", "live_sdk_log").put("message", jSONObject.toString());
                    } catch (JSONException unused) {
                        return;
                    }
                }
                if (LiveStreamLogService.this.mLogUploader != null) {
                    LiveStreamLogService.this.mLogUploader.uploadLog(createCommonLog);
                }
            }
        });
    }

    public void uploadSDKLogEvent(final int i2, final String str, final String str2, final String str3) {
        final long nanoTime = TimeUtils.nanoTime() / 1000000;
        final long currentTimeMillis = System.currentTimeMillis();
        this.mLogUploadThreadHandler.post(new Runnable() {
            /* class com.ss.avframework.livestreamv2.log.LiveStreamLogService.AnonymousClass4 */

            static {
                Covode.recordClassIndex(100426);
            }

            public void run() {
                JSONObject createCommonLog = LiveStreamLogService.this.createCommonLog(currentTimeMillis);
                if (createCommonLog != null) {
                    try {
                        JSONObject jSONObject = new JSONObject();
                        jSONObject.put("clockMs", nanoTime);
                        jSONObject.put("level", i2);
                        jSONObject.put("tag", str);
                        jSONObject.put("msg", str3);
                        createCommonLog.put("event_key", str2).put("message", jSONObject.toString());
                    } catch (JSONException unused) {
                        return;
                    }
                }
                if (LiveStreamLogService.this.mLogUploader != null) {
                    LiveStreamLogService.this.mLogUploader.uploadLog(createCommonLog);
                }
            }
        });
    }

    public void onRTMPEnd(final int i2, final int i3, final boolean z, String str, final long j2) {
        final long j3;
        final int i4;
        final int i5;
        TransportSendStallStatics transportSendStallStatics;
        long currentTimeMillis = System.currentTimeMillis();
        this.mLastErrorCode = i2;
        this.mErrorCount = i3;
        this.mIsFirstConnect = z;
        if (i2 == 200) {
            this.mPushStartTime = currentTimeMillis;
        }
        long j4 = this.mRtmpConnectingTime;
        if (j4 != 0) {
            j3 = currentTimeMillis - j4;
        } else {
            j3 = 0;
        }
        if (this.mEnableReportSenStallLog > 0) {
            long j5 = this.mRtmpReConnectingTime;
            if (j5 > 0 && (transportSendStallStatics = this.mPushStreamStatistic) != null) {
                transportSendStallStatics.setReconnectCost(currentTimeMillis - j5);
                this.mRtmpReConnectingTime = 0;
            }
        }
        if (str != null) {
            this.mRemoteIP = str;
        }
        final JSONObject jSONObject = new JSONObject();
        LiveCore liveCore = this.mLiveCore;
        final int i6 = 0;
        if (liveCore != null) {
            LiveCore.Builder builder = liveCore.getBuilder();
            if (builder != null) {
                i6 = builder.getVideoBitrate() / 1000;
                i4 = builder.getVideoMinBitrate() / 1000;
                i5 = builder.getVideoMaxBitrate() / 1000;
            } else {
                i4 = 0;
                i5 = 0;
            }
            if (this.mLiveStream.getLiveStreamUrl().startsWith("rtmp://") && builder != null) {
                try {
                    jSONObject.put("selfDevelopedRtmp", builder.isUseSelfDevelopedRtmp()).put("native_live_sdk_version", MediaEngineFactory.getVersion());
                } catch (JSONException e2) {
                    e2.printStackTrace();
                }
            }
        } else {
            i5 = 0;
            i6 = 0;
            i4 = 0;
        }
        final long currentTimeMillis2 = System.currentTimeMillis();
        this.mLogUploadThreadHandler.post(new Runnable() {
            /* class com.ss.avframework.livestreamv2.log.LiveStreamLogService.AnonymousClass5 */

            static {
                Covode.recordClassIndex(100427);
            }

            public void run() {
                boolean z;
                JSONObject createCommonLog = LiveStreamLogService.this.createCommonLog(currentTimeMillis2);
                if (createCommonLog != null) {
                    try {
                        JSONObject put = createCommonLog.put("event_key", "connect_start");
                        if (i2 == 200) {
                            z = true;
                        } else {
                            z = false;
                        }
                        put.put("connect_status", z).put("connect_elapse", j3).put("error_code", i2).put("error_count", i3).put("first_connect", z).put("dns_parse_time", j2).put("push_type", LiveStreamLogService.this.getPushType()).put("default_bitrate", i6).put("min_bitrate", i4).put("max_bitrate", i5).put("message", jSONObject.toString()).put("enable_cert_verify", LiveStreamLogService.this.mEnableCertVerify).put("sandbox_proceed_cost", LiveStreamLogService.this.mSandboxProceedCost);
                        LiveStreamLogService.this.mLogUploader.uploadLog(createCommonLog);
                    } catch (JSONException e2) {
                        e2.printStackTrace();
                    }
                }
            }
        });
    }

    public LiveStreamLogService(LiveStream liveStream, ILogUploader iLogUploader, long j2, LiveCore liveCore, HandlerThread handlerThread, HandlerThread handlerThread2) {
        Handler handler;
        Handler handler2;
        this.mLiveCore = liveCore;
        if (handlerThread2 != null) {
            handlerThread2.getLooper();
        } else {
            handler = new Handler(this);
        }
        this.mLogUploadThreadHandler = handler;
        if (handlerThread != null) {
            handlerThread.getLooper();
        } else {
            handler2 = new Handler(this);
        }
        this.mWorkThreadHandler = handler2;
        this.mInterval = j2 <= 0 ? 5000 : j2;
        this.mLiveStream = liveStream;
        this.mLogUploader = iLogUploader;
        this.mMonitor = new Monitor();
        this.mStaticsReport = new LiveStreamReport();
        this.mPushStreamStatistic = new TransportSendStallStatics();
        this.mConnectEndStatistic = new TransportSendStallStatics();
        this.mLiveCoreEndStatistic = new TransportSendStallStatics();
        this.mStatus = new AtomicInteger(0);
        if (!AVLog.isLogKibanaDeviceSet()) {
            AVLog.setupLogKibanaDevice(new LiveStreamLogFilter(this));
        }
        AVLog.ILogFilter logKibanaDevice = AVLog.getLogKibanaDevice();
        if (logKibanaDevice instanceof LiveStreamLogFilter) {
            ((LiveStreamLogFilter) logKibanaDevice).setLogService(this);
        }
    }
}
