package com.ss.avframework.livestreamv2;

import com.bytedance.covode.number.Covode;
import org.json.JSONException;
import org.json.JSONObject;

public class TransportSendStallStatics {
    private int mTotalPtsAudioStallCount;
    private long mTotalPtsAudioStallTime;
    private int mTotalPtsVideoStallCount;
    private long mTotalPtsVideoStallTime;
    private long mTotalReConnectCostTime;
    private int mTotalReConnectCount;
    private int mTotalSendAudioStallCount;
    private long mTotalSendAudioStallTime;
    private int mTotalSendVideoStallCount;
    private long mTotalSendVideoStallTime;

    static {
        Covode.recordClassIndex(99947);
    }

    public void reset() {
        this.mTotalSendVideoStallTime = 0;
        this.mTotalPtsVideoStallTime = 0;
        this.mTotalSendAudioStallTime = 0;
        this.mTotalPtsAudioStallTime = 0;
        this.mTotalSendAudioStallCount = 0;
        this.mTotalPtsAudioStallCount = 0;
        this.mTotalSendVideoStallCount = 0;
        this.mTotalPtsVideoStallCount = 0;
        this.mTotalReConnectCostTime = 0;
        this.mTotalReConnectCount = 0;
    }

    public void setReconnectCost(long j2) {
        this.mTotalReConnectCostTime += j2;
        this.mTotalReConnectCount++;
    }

    public void accumulate(TransportSendStallStatics transportSendStallStatics) {
        if (transportSendStallStatics != null) {
            this.mTotalSendVideoStallTime += transportSendStallStatics.mTotalSendVideoStallTime;
            this.mTotalPtsVideoStallTime += transportSendStallStatics.mTotalPtsVideoStallTime;
            this.mTotalSendAudioStallTime += transportSendStallStatics.mTotalSendAudioStallTime;
            this.mTotalPtsAudioStallTime += transportSendStallStatics.mTotalPtsAudioStallTime;
            this.mTotalSendAudioStallCount += transportSendStallStatics.mTotalSendAudioStallCount;
            this.mTotalPtsAudioStallCount += transportSendStallStatics.mTotalPtsAudioStallCount;
            this.mTotalSendVideoStallCount += transportSendStallStatics.mTotalSendVideoStallCount;
            this.mTotalPtsVideoStallCount += transportSendStallStatics.mTotalPtsVideoStallCount;
            this.mTotalReConnectCostTime += transportSendStallStatics.mTotalReConnectCostTime;
            this.mTotalReConnectCount += transportSendStallStatics.mTotalReConnectCount;
        }
    }

    public void getTransportSendStallLog(JSONObject jSONObject) {
        try {
            jSONObject.put("transport_send_audio_stall_time", this.mTotalSendAudioStallTime).put("transport_send_audio_stall_count", this.mTotalSendAudioStallCount).put("transport_send_video_stall_time", this.mTotalSendVideoStallTime).put("transport_send_video_stall_count", this.mTotalSendVideoStallCount).put("transport_pts_audio_stall_time", this.mTotalPtsAudioStallTime).put("transport_pts_audio_stall_count", this.mTotalPtsAudioStallCount).put("transport_pts_video_stall_time", this.mTotalPtsVideoStallTime).put("transport_pts_video_stall_count", this.mTotalPtsVideoStallCount).put("transport_reconnect_count", this.mTotalReConnectCount).put("transport_reconnect_time", this.mTotalReConnectCostTime);
        } catch (ArrayIndexOutOfBoundsException | JSONException unused) {
        }
    }

    public void setTransportSendStallParam(boolean z, int i2, long j2) {
        if (z) {
            if (i2 == 1) {
                this.mTotalPtsAudioStallTime += j2;
                this.mTotalPtsAudioStallCount++;
            } else if (i2 == 0) {
                this.mTotalSendAudioStallTime += j2;
                this.mTotalSendAudioStallCount++;
            }
        } else if (i2 == 1) {
            this.mTotalPtsVideoStallTime += j2;
            this.mTotalPtsVideoStallCount++;
        } else if (i2 == 0) {
            this.mTotalSendVideoStallTime += j2;
            this.mTotalSendVideoStallCount++;
        }
    }
}
