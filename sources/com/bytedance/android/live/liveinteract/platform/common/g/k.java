package com.bytedance.android.live.liveinteract.platform.common.g;

import android.content.Context;
import android.os.SystemClock;
import android.text.TextUtils;
import com.bytedance.android.live.core.f.w;
import com.bytedance.android.live.core.f.y;
import com.bytedance.android.live.core.performance.a;
import com.bytedance.android.livesdk.livesetting.performance.LiveMtEnableCpuRateSetting;
import com.bytedance.android.livesdk.livesetting.performance.LiveMtEnableUseProcFileCpuRateSetting;
import com.bytedance.android.livesdk.userservice.u;
import com.bytedance.android.livesdkapi.host.IHostContext;
import com.bytedance.common.utility.l;
import com.bytedance.covode.number.Covode;
import com.ss.android.ugc.aweme.lancet.j;
import f.a.d.g;
import org.json.JSONObject;

/* access modifiers changed from: package-private */
public final /* synthetic */ class k implements g {

    /* renamed from: a  reason: collision with root package name */
    private final j f11992a;

    static {
        Covode.recordClassIndex(6538);
    }

    k(j jVar) {
        this.f11992a = jVar;
    }

    @Override // f.a.d.g
    public final Object apply(Object obj) {
        j jVar = this.f11992a;
        JSONObject jSONObject = new JSONObject();
        float a2 = ((float) w.a()) / 1024.0f;
        float f2 = a2 - jVar.f11985c;
        y.e().getPackageName();
        if (LiveMtEnableCpuRateSetting.INSTANCE.enable() && SystemClock.elapsedRealtime() - w.f9112a > 5000) {
            double d2 = 0.0d;
            if (a.b() && LiveMtEnableUseProcFileCpuRateSetting.INSTANCE.enable()) {
                d2 = a.a();
            }
            w.f9113b = String.valueOf(d2);
            w.f9112a = SystemClock.elapsedRealtime();
        }
        String str = w.f9113b;
        Context e2 = y.e();
        jSONObject.put("vendor", jVar.f11983a);
        jSONObject.put("server_ip", jVar.f11984b);
        jSONObject.put("resolution_ratio", jVar.f11987e * jVar.f11988f);
        jSONObject.put("memory", a2 + "MB");
        jSONObject.put("live_push_memory", f2 + "MB");
        jSONObject.put("cpu", str);
        jSONObject.put("room_id", jVar.f11986d);
        jSONObject.put("video_bitrate", jVar.f11989g);
        jSONObject.put("video_fps", jVar.f11990h);
        jSONObject.put("rtmp_type", 2);
        com.bytedance.android.live.liveinteract.multiguest.e.a aVar = new com.bytedance.android.live.liveinteract.multiguest.e.a();
        aVar.f11178a = jSONObject.toString();
        aVar.f11180c = u.a().b().c();
        aVar.f11179b = ((IHostContext) com.bytedance.android.live.t.a.a(IHostContext.class)).getServerDeviceId();
        if (TextUtils.isEmpty(j.f107222a) || !j.b() || j.c()) {
            j.f107222a = l.a(l.a(e2));
        }
        aVar.f11181d = j.f107222a;
        return aVar;
    }
}
