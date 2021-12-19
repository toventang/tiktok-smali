package com.bytedance.android.monitor;

import android.os.Looper;
import com.bytedance.android.monitor.d.c;
import com.bytedance.android.monitor.webview.h;
import com.bytedance.covode.number.Covode;
import org.json.JSONObject;

public class a {

    /* renamed from: a  reason: collision with root package name */
    public com.bytedance.android.monitor.webview.a f23415a = new h();

    static {
        Covode.recordClassIndex(13926);
    }

    /* access modifiers changed from: package-private */
    public final void a(final c cVar) {
        if (Looper.getMainLooper() == Looper.myLooper()) {
            com.bytedance.android.monitor.f.a.a().submit(new Runnable() {
                /* class com.bytedance.android.monitor.a.AnonymousClass1 */

                static {
                    Covode.recordClassIndex(13927);
                }

                public final void run() {
                    b.a(cVar);
                }
            });
        } else {
            b.a(cVar);
        }
    }

    /* access modifiers changed from: package-private */
    public final void a(String str, String str2, String str3, JSONObject jSONObject, JSONObject jSONObject2, JSONObject jSONObject3, JSONObject jSONObject4, boolean z, com.bytedance.android.monitor.webview.a aVar) {
        c.a aVar2 = new c.a(str3);
        aVar2.f23441a = str;
        aVar2.f23442b = str2;
        aVar2.f23443c = jSONObject;
        aVar2.f23444d = jSONObject2;
        aVar2.f23445e = jSONObject3;
        aVar2.f23447g = jSONObject4;
        aVar2.f23448h = z;
        aVar2.f23449i = aVar;
        a(aVar2.a());
    }
}
