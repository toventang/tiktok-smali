package com.ss.avframework.livestreamv2;

import com.bytedance.covode.number.Covode;
import com.ss.avframework.statics.StaticsReport;

public class LiveStreamReport extends StaticsReport {
    static {
        Covode.recordClassIndex(99942);
    }

    public int getADMMicVolumedB() {
        return getInt("adm_mic_rec_db");
    }

    public double getAudioMixerCostTimePerFrameMs() {
        return getDouble("audio_mixer_cost_time_per_frame_ms");
    }

    public double getMiniGameRenderFps() {
        return getDouble("mini_game_render_fps");
    }

    public long getTransportAdjustBitrate() {
        return getLong("trans_adjust_bps");
    }

    public double getVideoMixerCostTimePerFrameMs() {
        return getDouble("video_mixer_cost_time_per_frame_ms");
    }

    public void setADMMicVolumedB(int i2) {
        setInt("adm_mic_rec_db", i2);
    }

    public void setAudioMixerCostTimePerFrameMs(double d2) {
        setDouble("audio_mixer_cost_time_per_frame_ms", d2);
    }

    public void setMiniGameRenderFps(double d2) {
        setDouble("mini_game_render_fps", d2);
    }

    public void setTransportAdjustBps(long j2) {
        setLong("trans_adjust_bps", j2);
    }

    public void setVideoMixerCostTimePerFrameMs(double d2) {
        setDouble("video_mixer_cost_time_per_frame_ms", d2);
    }
}
