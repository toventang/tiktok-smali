package com.ss.avframework.statics;

import com.a;
import com.bytedance.covode.number.Covode;
import com.ss.avframework.utils.TEBundle;

public class StaticsReport extends TEBundle {

    public interface StaticReportInterface {
        static {
            Covode.recordClassIndex(100559);
        }

        boolean getStaticsReport(StaticsReport staticsReport);
    }

    static {
        Covode.recordClassIndex(100558);
    }

    public double getAudioEncodeRealBps() {
        return getDouble("estream_aenc_real_bps");
    }

    public int getAudioStreamdB() {
        return getInt("estream_audio_stream_db");
    }

    public double getCostTimeProessPerFrame() {
        return getDouble("vtrack_cost_time_ppf");
    }

    public int getFrameCostCaptureToEffect() {
        return getInt("cost_capture_to_effect");
    }

    public int getFrameCostEffect() {
        return getInt("cost_capture_pure_effect");
    }

    public int getFrameCostEffectToEncode() {
        return getInt("cost_effect_to_encode");
    }

    public int getFrameCostEncode() {
        return getInt("cost_capture_pure_encode");
    }

    public int getFrameCostEncodeToSend() {
        return getInt("cost_capture_encode_to_send");
    }

    public double getTransportDropCount() {
        return getDouble("estream_transport_video_drop_count");
    }

    public double getTransportDuration() {
        return getDouble("estream_transport_duration");
    }

    public double getTransportPackageAverageDelay() {
        return getDouble("estream_transport_package_delay");
    }

    public double getVideoDropCount() {
        return getDouble("estream_video_drop_count");
    }

    public int getVideoEncodePSNRFromKeyFrame() {
        return getInt("estream_video_enc_psnr_key_frame");
    }

    public int getVideoEncodePSNRFromNoKeyFrame() {
        return getInt("estream_video_enc_psnr_no_key_frame");
    }

    public double getVideoEncodeRealBps() {
        return getDouble("estream_venc_real_bps");
    }

    public double getVideoEncodeRealFps() {
        return getDouble("estream_venc_real_fps");
    }

    public double getVideoSourceDeliverFps() {
        return getDouble("vsourc_deliver_fps");
    }

    public double getVideoSourceDropFps() {
        return getDouble("vsourc_drop_fps");
    }

    public double getVideoTransportRealBps() {
        return getDouble("estream_transport_real_bps");
    }

    public double getVideoTransportRealFps() {
        return getDouble("estream_transport_real_fps");
    }

    public double getVideoSourceFps() {
        return getVideoSourceDeliverFps() + getVideoSourceDropFps();
    }

    public String getVideoFrameElapse() {
        return a.a("[%d, %d, %d, %d, %d]", new Object[]{Integer.valueOf(getFrameCostCaptureToEffect()), Integer.valueOf(getFrameCostEffect()), Integer.valueOf(getFrameCostEffectToEncode()), Integer.valueOf(getFrameCostEncode()), Integer.valueOf(getFrameCostEncodeToSend())});
    }
}
