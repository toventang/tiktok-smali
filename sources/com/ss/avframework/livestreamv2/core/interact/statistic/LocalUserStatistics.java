package com.ss.avframework.livestreamv2.core.interact.statistic;

import com.bytedance.covode.number.Covode;
import com.bytedance.frameworks.apm.trace.MethodCollector;
import com.ss.avframework.engine.AudioDeviceModule;
import com.ss.avframework.livestreamv2.control.IVideoCapturerControl;
import com.ss.avframework.livestreamv2.core.IAudioDeviceControl;
import com.ss.avframework.livestreamv2.core.InteractEngine;
import com.ss.avframework.livestreamv2.core.LiveCore;
import com.ss.bytertc.engine.handler.IRTCEngineEventHandler;
import org.json.JSONObject;

public class LocalUserStatistics {
    private long mLastStatTimestamp;
    private LocalUserInteractConnectionStatisticInfo mLocalUserInteractConnectionStatisticInfo;
    private int mNetWorkQuality;
    private int mOnLocalVideoStatsCount;
    private int mOnRtcStatsCount;
    private float mReceiveAudioBitrate;
    private float mReceiveVideoBitrate;
    private float mSendAudioBitrate;
    private float mSendVideoBitrate;
    private float mSendVideoEncoderOutputFrameRate;
    private float mSendVideoFrameRate;
    private float mSendVideoRendererOutputFrameRate;
    private int mUserCount;
    private int mVideoSourceFrameCount;
    private int mVideoSourceHeight;
    private int mVideoSourceWidth;

    static {
        Covode.recordClassIndex(100293);
    }

    public LocalUserInteractConnectionStatisticInfo getInteractConnectionStatistic() {
        if (this.mLocalUserInteractConnectionStatisticInfo == null) {
            this.mLocalUserInteractConnectionStatisticInfo = new LocalUserInteractConnectionStatisticInfo();
        }
        return this.mLocalUserInteractConnectionStatisticInfo;
    }

    public class LocalUserStatisticInfo {
        public JSONObject mAdmStatus;
        public int mAudioSourceFrameRate;
        public JSONObject mCameraStatus;
        public float mInCapFps;
        public String mLastMessage;
        public boolean mLiveCoreAecStatus;
        public boolean mLiveCoreHeadset;
        public String mLocalMicVolumedB;
        public int mNetWorkQuality;
        public String mRMS;
        public int mReceiveAudioBitrate;
        public int mReceiveVideoBitrate;
        public int mRtcPushElapseMs;
        public int mSendAudioBitrate;
        public int mSendVideoBitrate;
        public int mSendVideoEncoderOutputFrameRate;
        public int mSendVideoFrameRate;
        public int mSendVideoRendererOutputFrameRate;
        public int mUserCount;
        public int mVideoSourceFrameRate;
        public int mVideoSourceHeight;
        public int mVideoSourceWidth;

        static {
            Covode.recordClassIndex(100294);
        }

        public LocalUserStatisticInfo() {
        }
    }

    public synchronized void onLocalAudioStats(IRTCEngineEventHandler.LocalAudioStats localAudioStats) {
        MethodCollector.i(11896);
        MethodCollector.o(11896);
    }

    public synchronized void onLocalNetworkQuality(int i2) {
        MethodCollector.i(11899);
        this.mNetWorkQuality = i2;
        MethodCollector.o(11899);
    }

    public synchronized void onLocalVideoStats(IRTCEngineEventHandler.LocalVideoStats localVideoStats) {
        MethodCollector.i(11574);
        float f2 = this.mSendVideoFrameRate;
        int i2 = this.mOnLocalVideoStatsCount;
        this.mSendVideoFrameRate = (((float) localVideoStats.sentFrameRate) + (f2 * ((float) i2))) / ((float) (i2 + 1));
        float f3 = this.mSendVideoEncoderOutputFrameRate;
        int i3 = this.mOnLocalVideoStatsCount;
        this.mSendVideoEncoderOutputFrameRate = (((float) localVideoStats.encoderOutputFrameRate) + (f3 * ((float) i3))) / ((float) (i3 + 1));
        float f4 = this.mSendVideoRendererOutputFrameRate;
        int i4 = this.mOnLocalVideoStatsCount;
        this.mSendVideoRendererOutputFrameRate = (((float) localVideoStats.rendererOutputFrameRate) + (f4 * ((float) i4))) / ((float) (i4 + 1));
        this.mOnLocalVideoStatsCount = i4 + 1;
        MethodCollector.o(11574);
    }

    public synchronized void onRtcStats(IRTCEngineEventHandler.RTCRoomStats rTCRoomStats) {
        MethodCollector.i(11400);
        float f2 = this.mSendAudioBitrate;
        int i2 = this.mOnRtcStatsCount;
        this.mSendAudioBitrate = (((float) rTCRoomStats.txAudioKBitRate) + (f2 * ((float) i2))) / ((float) (i2 + 1));
        float f3 = this.mReceiveAudioBitrate;
        int i3 = this.mOnRtcStatsCount;
        this.mReceiveAudioBitrate = (((float) rTCRoomStats.rxAudioKBitRate) + (f3 * ((float) i3))) / ((float) (i3 + 1));
        float f4 = this.mSendVideoBitrate;
        int i4 = this.mOnRtcStatsCount;
        this.mSendVideoBitrate = (((float) rTCRoomStats.txVideoKBitRate) + (f4 * ((float) i4))) / ((float) (i4 + 1));
        float f5 = this.mReceiveVideoBitrate;
        int i5 = this.mOnRtcStatsCount;
        this.mReceiveVideoBitrate = (((float) rTCRoomStats.rxVideoKBitRate) + (f5 * ((float) i5))) / ((float) (i5 + 1));
        this.mUserCount = rTCRoomStats.users;
        this.mOnRtcStatsCount++;
        MethodCollector.o(11400);
    }

    public synchronized LocalUserStatisticInfo getStatisticResult(LiveCore liveCore) {
        LocalUserStatisticInfo localUserStatisticInfo;
        long j2;
        double d2;
        IAudioDeviceControl.IAudioTrack track;
        MethodCollector.i(12053);
        localUserStatisticInfo = new LocalUserStatisticInfo();
        long currentTimeMillis = System.currentTimeMillis();
        long j3 = this.mLastStatTimestamp;
        if (j3 <= 0 || currentTimeMillis <= j3) {
            j2 = 0;
        } else {
            j2 = currentTimeMillis - j3;
        }
        localUserStatisticInfo.mSendAudioBitrate = (int) this.mSendAudioBitrate;
        localUserStatisticInfo.mReceiveAudioBitrate = (int) this.mReceiveAudioBitrate;
        localUserStatisticInfo.mSendVideoBitrate = (int) this.mSendVideoBitrate;
        localUserStatisticInfo.mReceiveVideoBitrate = (int) this.mReceiveVideoBitrate;
        localUserStatisticInfo.mUserCount = this.mUserCount;
        localUserStatisticInfo.mSendVideoFrameRate = (int) this.mSendVideoFrameRate;
        localUserStatisticInfo.mSendVideoEncoderOutputFrameRate = (int) this.mSendVideoEncoderOutputFrameRate;
        localUserStatisticInfo.mSendVideoRendererOutputFrameRate = (int) this.mSendVideoRendererOutputFrameRate;
        localUserStatisticInfo.mNetWorkQuality = this.mNetWorkQuality;
        localUserStatisticInfo.mVideoSourceWidth = this.mVideoSourceWidth;
        localUserStatisticInfo.mVideoSourceHeight = this.mVideoSourceHeight;
        if (j2 > 0) {
            double d3 = (double) this.mVideoSourceFrameCount;
            Double.isNaN(d3);
            double d4 = (double) j2;
            Double.isNaN(d4);
            d2 = (d3 * 1000.0d) / d4;
        } else {
            d2 = 0.0d;
        }
        localUserStatisticInfo.mVideoSourceFrameRate = (int) d2;
        if (liveCore != null) {
            AudioDeviceModule adm = liveCore.getADM();
            if (adm != null) {
                int option = (int) adm.getOption(1);
                int option2 = (int) adm.getOption(2);
                int option3 = (int) adm.getOption(3);
                int option4 = (int) adm.getOption(8);
                int option5 = (int) adm.getOption(9);
                IAudioDeviceControl audioDeviceControl = liveCore.getAudioDeviceControl();
                if (!(audioDeviceControl == null || (track = audioDeviceControl.getTrack(InteractEngine.AUDIO_LAYER_NAME)) == null)) {
                    option5 = (int) track.getOption(1);
                }
                localUserStatisticInfo.mRMS = option + "," + option2 + "," + option3 + ",0," + option5 + "," + option4;
                localUserStatisticInfo.mLocalMicVolumedB = option + "," + option2 + "," + option3 + ",-";
                localUserStatisticInfo.mLiveCoreAecStatus = adm.isEnableBuiltInAEC();
                localUserStatisticInfo.mLiveCoreHeadset = adm.isHeadSet();
                localUserStatisticInfo.mAdmStatus = adm.getReportJsonStats();
            }
            IVideoCapturerControl videoCapturerControl = liveCore.getVideoCapturerControl();
            if (videoCapturerControl != null) {
                localUserStatisticInfo.mInCapFps = videoCapturerControl.getInCaptureRealFps();
                JSONObject realCameraStatus = videoCapturerControl.getRealCameraStatus();
                if (realCameraStatus != null) {
                    localUserStatisticInfo.mCameraStatus = new JSONObject();
                    try {
                        synchronized (realCameraStatus) {
                            try {
                                if (!realCameraStatus.isNull("mipmap")) {
                                    localUserStatisticInfo.mCameraStatus.put("mipmap", realCameraStatus.get("mipmap"));
                                }
                            } catch (Throwable th) {
                                MethodCollector.o(12053);
                                throw th;
                            }
                        }
                    } catch (Exception unused) {
                    }
                }
            }
        }
        this.mLastStatTimestamp = currentTimeMillis;
        this.mOnRtcStatsCount = 0;
        this.mSendAudioBitrate = 0.0f;
        this.mReceiveAudioBitrate = 0.0f;
        this.mSendVideoBitrate = 0.0f;
        this.mReceiveVideoBitrate = 0.0f;
        this.mUserCount = 0;
        this.mOnLocalVideoStatsCount = 0;
        this.mSendVideoFrameRate = 0.0f;
        this.mSendVideoEncoderOutputFrameRate = 0.0f;
        this.mSendVideoRendererOutputFrameRate = 0.0f;
        this.mNetWorkQuality = 0;
        this.mVideoSourceWidth = 0;
        this.mVideoSourceHeight = 0;
        this.mVideoSourceFrameCount = 0;
        MethodCollector.o(12053);
        return localUserStatisticInfo;
    }

    public synchronized void onVideoSourceFrame(int i2, int i3, long j2) {
        MethodCollector.i(11900);
        this.mVideoSourceWidth = i2;
        this.mVideoSourceHeight = i3;
        this.mVideoSourceFrameCount++;
        MethodCollector.o(11900);
    }
}
