package com.bytedance.android.live.network;

import android.content.res.Resources;
import android.text.TextUtils;
import android.util.Pair;
import com.bytedance.android.live.network.b;
import com.bytedance.android.livesdk.ao.e;
import com.bytedance.android.livesdk.livesetting.other.FakeRegionsSetting;
import com.bytedance.android.livesdk.livesetting.other.LiveMtTikcastSwitcherParamSetting;
import com.bytedance.android.livesdk.util.d;
import com.bytedance.android.livesdkapi.host.IHostContext;
import com.bytedance.covode.number.Covode;
import com.bytedance.frameworks.baselib.network.http.cronet.b.f;
import com.bytedance.frameworks.baselib.network.http.cronet.b.g;
import com.bytedance.ttnet.TTNetInit;
import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.Locale;
import java.util.Map;
import org.json.JSONObject;

public final class a implements b {

    /* renamed from: a  reason: collision with root package name */
    private final String[] f12100a = {"CN", "MR", "SA", "FR", "AE"};

    static {
        Covode.recordClassIndex(6618);
    }

    @Override // com.bytedance.android.live.network.b
    public final b.a a(b.a aVar) {
        String str = aVar.f12103a;
        if (!TextUtils.isEmpty(str)) {
            StringBuilder sb = new StringBuilder(str);
            a(sb);
            aVar.f12103a = sb.toString();
        }
        return aVar;
    }

    private void a(StringBuilder sb) {
        if (sb.toString().indexOf(63) < 0) {
            sb.append("?");
        } else {
            sb.append("&");
        }
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        a(linkedHashMap);
        ArrayList arrayList = new ArrayList();
        for (Map.Entry<String, String> entry : linkedHashMap.entrySet()) {
            arrayList.add(new Pair(entry.getKey(), entry.getValue()));
        }
        sb.append(c.a(arrayList, "UTF-8"));
    }

    private static void b(Map<String, String> map) {
        JSONObject jSONObject = new JSONObject();
        try {
            f networkQuality = TTNetInit.getNetworkQuality();
            jSONObject.put("tcp_rtt", networkQuality.f29065a);
            jSONObject.put("quic_rtt", networkQuality.f29065a);
            jSONObject.put("http_rtt", networkQuality.f29066b);
            jSONObject.put("downstream_throughput_kbps", networkQuality.f29067c);
            g packetLossRateMetrics = TTNetInit.getPacketLossRateMetrics(1);
            jSONObject.put("quic_send_loss_rate", packetLossRateMetrics.f29069b);
            jSONObject.put("quic_receive_loss_rate", packetLossRateMetrics.f29071d);
            jSONObject.put("net_effective_connection_type", TTNetInit.getEffectiveConnectionType());
            jSONObject.put("video_download_speed", com.ss.android.ugc.h.g.f());
        } catch (Exception e2) {
            com.bytedance.android.live.core.c.a.a("GetNetworkParams", e2);
        }
        map.put("current_network_quality_info", jSONObject.toString());
    }

    @Override // com.bytedance.android.live.network.b
    public final void a(Map<String, String> map) {
        Locale locale;
        String str;
        map.put("webcast_sdk_version", "2160");
        if (com.bytedance.android.live.t.a.a(IHostContext.class) != null) {
            locale = ((IHostContext) com.bytedance.android.live.t.a.a(IHostContext.class)).currentLocale();
        } else {
            locale = null;
        }
        map.put("webcast_language", d.a(locale));
        map.put("webcast_locale", Resources.getSystem().getConfiguration().locale.toString());
        if (e.f13998b) {
            int value = FakeRegionsSetting.INSTANCE.getValue();
            if (value >= 0) {
                String[] strArr = this.f12100a;
                if (value < strArr.length) {
                    str = strArr[value];
                    map.put("fake_region", str);
                }
            }
            str = "";
            map.put("fake_region", str);
        }
        if (com.bytedance.android.live.t.a.a(IHostContext.class) != null && ((IHostContext) com.bytedance.android.live.t.a.a(IHostContext.class)).isLocalTest() && LiveMtTikcastSwitcherParamSetting.INSTANCE.getValue() == 1) {
            map.put("tikcast", "1");
        }
        b(map);
    }
}
