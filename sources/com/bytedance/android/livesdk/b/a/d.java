package com.bytedance.android.livesdk.b.a;

import android.text.TextUtils;
import android.view.SurfaceView;
import com.bytedance.android.livesdk.ab.i;
import com.bytedance.android.livesdk.b.a.g;
import com.bytedance.covode.number.Covode;
import java.util.HashSet;
import java.util.Set;
import org.json.JSONObject;

public final class d extends a<Boolean> {
    private static d A;

    /* renamed from: a  reason: collision with root package name */
    public a f14180a;

    /* renamed from: b  reason: collision with root package name */
    public boolean f14181b;

    /* renamed from: c  reason: collision with root package name */
    public boolean f14182c;

    /* renamed from: d  reason: collision with root package name */
    public boolean f14183d;

    /* renamed from: e  reason: collision with root package name */
    public String f14184e;

    /* renamed from: f  reason: collision with root package name */
    public String f14185f;

    /* renamed from: g  reason: collision with root package name */
    public int f14186g;

    /* renamed from: h  reason: collision with root package name */
    public String f14187h;

    /* renamed from: i  reason: collision with root package name */
    public e f14188i;

    /* renamed from: j  reason: collision with root package name */
    public long f14189j;

    /* renamed from: k  reason: collision with root package name */
    public long f14190k;

    /* renamed from: l  reason: collision with root package name */
    public boolean f14191l;
    public boolean o = true;
    public boolean p;
    public boolean q;
    public int r = 1;
    public SurfaceView s;
    public Set<Long> t = new HashSet();
    public int u = 0;
    public String v;
    public com.bytedance.android.livesdk.chatroom.model.c.a w;
    public int x = 2;
    public volatile boolean y;
    public volatile boolean z;

    public interface a {
        static {
            Covode.recordClassIndex(7860);
        }

        void a(boolean z);
    }

    static {
        Covode.recordClassIndex(7859);
    }

    public static d a() {
        if (A == null) {
            A = new d();
        }
        return A;
    }

    private d() {
        this.n = false;
        this.f14188i = new e();
    }

    public final void b() {
        i.b();
        i.b("invite_issue_check", "rtcExtInfo reset");
        this.n = false;
        this.f14185f = null;
        this.f14186g = 0;
        this.f14184e = null;
        this.f14187h = "";
        this.f14191l = false;
        this.y = false;
        this.o = true;
        this.f14189j = 0;
        this.r = 1;
        this.s = null;
        this.t.clear();
        this.u = 0;
        this.v = null;
        this.f14182c = false;
        g.a.f14199a.a();
        this.x = 2;
    }

    public final long b(long j2) {
        return this.f14188i.a(j2);
    }

    public final void b(String str) {
        if (!TextUtils.isEmpty(str)) {
            this.v = str;
        }
    }

    public final void a(long j2) {
        this.f14188i.b(j2, System.currentTimeMillis());
    }

    private static int c(String str) {
        if (TextUtils.isEmpty(str)) {
            return 0;
        }
        try {
            JSONObject jSONObject = new JSONObject(str);
            if (!jSONObject.has("live_rtc_engine_config")) {
                return 0;
            }
            try {
                JSONObject optJSONObject = jSONObject.optJSONObject("live_rtc_engine_config");
                if (optJSONObject.has("rtc_vendor")) {
                    return optJSONObject.optInt("rtc_vendor");
                }
                return 0;
            } catch (Exception e2) {
                e2.printStackTrace();
                return 0;
            }
        } catch (Exception e3) {
            e3.printStackTrace();
            return 0;
        }
    }

    public final void a(String str) {
        this.f14187h = str;
        int c2 = c(str);
        if (c2 > 0) {
            this.f14186g = c2;
        }
    }

    public final void a(boolean z2) {
        this.f14182c = z2;
        a aVar = this.f14180a;
        if (aVar != null) {
            aVar.a(z2);
        }
    }
}
