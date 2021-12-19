package com.bytedance.android.live.network.b;

import com.bytedance.android.livesdkapi.host.IHostAction;
import com.bytedance.covode.number.Covode;
import com.bytedance.frameworks.baselib.network.http.cronet.b.f;
import com.bytedance.frameworks.baselib.network.http.cronet.b.g;
import com.bytedance.ttnet.TTNetInit;
import h.f.b.l;
import org.json.JSONObject;

public final class a {

    /* renamed from: a  reason: collision with root package name */
    public static final a f12102a = new a();

    private a() {
    }

    static {
        Covode.recordClassIndex(6624);
    }

    public static final JSONObject a() {
        JSONObject jSONObject = new JSONObject();
        try {
            com.bytedance.android.live.base.a a2 = com.bytedance.android.live.t.a.a(IHostAction.class);
            l.b(a2, "");
            IHostAction.c videoOnDemandParams = ((IHostAction) a2).getVideoOnDemandParams();
            jSONObject.put("network_speed_in_kbps", videoOnDemandParams.f23240b * 8);
            jSONObject.put("recommend_bitrate", videoOnDemandParams.f23239a);
            f networkQuality = TTNetInit.getNetworkQuality();
            if (networkQuality != null) {
                jSONObject.put("tcp_rtt", networkQuality.f29065a);
                jSONObject.put("quic_rtt", networkQuality.f29065a);
                jSONObject.put("http_rtt", networkQuality.f29066b);
                jSONObject.put("downstream_throughput_kbps", networkQuality.f29067c);
            }
            g packetLossRateMetrics = TTNetInit.getPacketLossRateMetrics(1);
            if (packetLossRateMetrics != null) {
                jSONObject.put("quic_send_loss_rate", packetLossRateMetrics.f29069b);
                jSONObject.put("quic_receive_loss_rate", packetLossRateMetrics.f29071d);
            }
            jSONObject.put("net_effective_connection_type", TTNetInit.getEffectiveConnectionType());
            jSONObject.put("video_download_speed", com.ss.android.ugc.h.g.f());
        } catch (Exception e2) {
            com.bytedance.android.live.core.c.a.a("GetNetworkParams", e2);
        }
        return jSONObject;
    }
}
