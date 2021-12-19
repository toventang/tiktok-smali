package com.ss.avframework.livestreamv2.sdkparams;

import com.bytedance.covode.number.Covode;
import com.ss.avframework.livestreamv2.tinyjson.Serialized;

public final class RtmpCacheConfig {
    @Serialized(name = "audio_send_stall_threshold")
    private int audioSendStallThreshold = Integer.MAX_VALUE;
    @Serialized(name = "drop_video_frame_threshold_B")
    private int dropVideoFrameThresholdB = Integer.MAX_VALUE;
    @Serialized(name = "drop_video_frame_threshold_I")
    private int dropVideoFrameThresholdI = Integer.MAX_VALUE;
    @Serialized(name = "drop_video_frame_threshold_P")
    private int dropVideoFrameThresholdP = Integer.MAX_VALUE;
    @Serialized(name = "enable_report_stall_log")
    private int enableReportStallLog = Integer.MAX_VALUE;
    @Serialized(name = "max_interleave_delta")
    private int maxInterLeaveDelta = Integer.MAX_VALUE;
    @Serialized(name = "max_video_fps")
    private int maxVideoFps = Integer.MAX_VALUE;
    @Serialized(name = "min_video_fps")
    private int minVideoFps = Integer.MAX_VALUE;
    @Serialized(name = "video_send_stall_threshold")
    private int videoSendStallThreshold = Integer.MAX_VALUE;

    static {
        Covode.recordClassIndex(100466);
    }

    public final int getAudioSendStallThreshold() {
        return this.audioSendStallThreshold;
    }

    public final int getDropVideoFrameThresholdB() {
        return this.dropVideoFrameThresholdB;
    }

    public final int getDropVideoFrameThresholdI() {
        return this.dropVideoFrameThresholdI;
    }

    public final int getDropVideoFrameThresholdP() {
        return this.dropVideoFrameThresholdP;
    }

    public final int getEnableReportStallLog() {
        return this.enableReportStallLog;
    }

    public final int getMaxInterLeaveDelta() {
        return this.maxInterLeaveDelta;
    }

    public final int getMaxVideoFps() {
        return this.maxVideoFps;
    }

    public final int getMinVideoFps() {
        return this.minVideoFps;
    }

    public final int getVideoSendStallThreshold() {
        return this.videoSendStallThreshold;
    }

    public final void setAudioSendStallThreshold(int i2) {
        this.audioSendStallThreshold = i2;
    }

    public final void setDropVideoFrameThresholdB(int i2) {
        this.dropVideoFrameThresholdB = i2;
    }

    public final void setDropVideoFrameThresholdI(int i2) {
        this.dropVideoFrameThresholdI = i2;
    }

    public final void setDropVideoFrameThresholdP(int i2) {
        this.dropVideoFrameThresholdP = i2;
    }

    public final void setEnableReportStallLog(int i2) {
        this.enableReportStallLog = i2;
    }

    public final void setMaxInterLeaveDelta(int i2) {
        this.maxInterLeaveDelta = i2;
    }

    public final void setMaxVideoFps(int i2) {
        this.maxVideoFps = i2;
    }

    public final void setMinVideoFps(int i2) {
        this.minVideoFps = i2;
    }

    public final void setVideoSendStallThreshold(int i2) {
        this.videoSendStallThreshold = i2;
    }
}
