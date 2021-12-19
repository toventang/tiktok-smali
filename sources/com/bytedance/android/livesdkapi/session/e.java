package com.bytedance.android.livesdkapi.session;

import com.bytedance.android.live.t.a;
import com.bytedance.android.livesdk.livesetting.performance.LiveEnableSlardarSetting;
import com.bytedance.android.livesdkapi.host.IHostContext;
import com.bytedance.covode.number.Covode;
import org.json.JSONObject;

/* access modifiers changed from: package-private */
public final /* synthetic */ class e implements Runnable {

    /* renamed from: a  reason: collision with root package name */
    private final ILinkSession f23362a;

    /* renamed from: b  reason: collision with root package name */
    private final int f23363b;

    static {
        Covode.recordClassIndex(13890);
    }

    e(ILinkSession iLinkSession, int i2) {
        this.f23362a = iLinkSession;
        this.f23363b = i2;
    }

    public final void run() {
        String c2;
        ILinkSession iLinkSession = this.f23362a;
        int i2 = this.f23363b;
        if (!LiveEnableSlardarSetting.INSTANCE.isDisable()) {
            JSONObject b2 = iLinkSession.b();
            if (b2 == null) {
                b2 = new JSONObject();
            }
            JSONObject jSONObject = new JSONObject();
            d.a(jSONObject, "status", String.valueOf(i2));
            if (d.f23360a == null || !d.f23360a.contains(Integer.valueOf(i2))) {
                c2 = iLinkSession.c();
            } else {
                c2 = "ttlive_room_enter_link_monitor_error";
            }
            if (((IHostContext) a.a(IHostContext.class)).isOffline()) {
                com.bytedance.android.live.core.c.a.a(3, "ttlive_room_enter_link_monitor", b2.toString());
            }
            d.a(c2, jSONObject, null, b2);
        }
    }
}
