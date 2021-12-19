package com.bytedance.android.livesdk.browser.k;

import android.os.SystemClock;
import com.bytedance.android.live.b.h;
import com.bytedance.android.live.core.d.c;
import com.bytedance.android.livesdk.ab.d.d;
import com.bytedance.covode.number.Covode;
import java.util.HashMap;

public final class a {

    /* renamed from: a  reason: collision with root package name */
    private long f14830a;

    /* renamed from: b  reason: collision with root package name */
    private final String f14831b;

    /* renamed from: c  reason: collision with root package name */
    private final String f14832c;

    /* renamed from: d  reason: collision with root package name */
    private h f14833d;

    static {
        Covode.recordClassIndex(8220);
    }

    public a(String str, String str2, h hVar) {
        this.f14831b = str;
        this.f14832c = str2;
        this.f14833d = hVar;
    }

    public final void a(int i2, int i3, String str) {
        long j2 = 0;
        if (i2 == 0) {
            this.f14830a = SystemClock.uptimeMillis();
        } else {
            long j3 = this.f14830a;
            if (j3 > 0) {
                this.f14830a = 0;
                j2 = SystemClock.uptimeMillis() - j3;
            } else {
                return;
            }
        }
        HashMap<String, Object> hashMap = new HashMap<>();
        hashMap.put("webview_scene", this.f14831b);
        hashMap.put("url", this.f14832c);
        if (i3 != 0) {
            hashMap.put("error_code", Integer.valueOf(i3));
            hashMap.put("error_msg", str);
        }
        c.a(d.a("ttlive_webview_load_status"), i2, j2, hashMap);
        if (i2 == 2) {
            c.a(d.b("ttlive_webview_load_status"), i2, hashMap);
        }
        h hVar = this.f14833d;
        if (hVar == null) {
            return;
        }
        if (i2 == 0) {
            hVar.a(hashMap);
        } else if (i2 == 1) {
            hVar.a(j2, hashMap);
        } else if (i2 == 2) {
            hVar.b(j2, hashMap);
        } else if (i2 == 3) {
            hVar.c(j2, hashMap);
        }
    }
}
