package com.bytedance.android.monitorV2;

import android.os.Looper;
import android.text.TextUtils;
import com.bytedance.android.monitorV2.d.d;
import com.bytedance.android.monitorV2.h.a.a;
import com.bytedance.android.monitorV2.webview.b;
import com.bytedance.covode.number.Covode;
import org.json.JSONObject;

public class a {

    /* renamed from: a  reason: collision with root package name */
    public b f23821a = new com.bytedance.android.monitorV2.webview.a();

    static {
        Covode.recordClassIndex(14096);
    }

    private static boolean d(d dVar) {
        a.C0514a a2 = HybridMultiMonitor.getInstance().getHybridSettingManager().b().a(dVar.f23848b);
        if (a2 == null) {
            return false;
        }
        return com.bytedance.android.monitorV2.l.b.a(a2, dVar.n);
    }

    private static boolean c(d dVar) {
        String str = dVar.f23849c;
        if (com.bytedance.android.monitorV2.l.b.b(str) == 1) {
            com.bytedance.android.monitorV2.i.b.b("CustomMonitor", com.a.a("event: %s, sample hit", new Object[]{str}));
            return true;
        } else if (com.bytedance.android.monitorV2.l.b.b(str) == 0) {
            com.bytedance.android.monitorV2.i.b.b("CustomMonitor", com.a.a("event: %s, sample not hit", new Object[]{str}));
            return false;
        } else {
            com.bytedance.android.monitorV2.i.b.b("CustomMonitor", com.a.a("event: %s, sample not found, checking canSample level...", new Object[]{str}));
            return d(dVar);
        }
    }

    /* access modifiers changed from: package-private */
    public final void a(final d dVar) {
        if (b(dVar)) {
            com.bytedance.android.monitorV2.i.b.b("CustomMonitor", com.a.a("do report bid: %s, event: %s", new Object[]{dVar.f23848b, dVar.f23849c}));
            if (Looper.getMainLooper() == Looper.myLooper()) {
                com.bytedance.android.monitorV2.f.a.a().submit(new Runnable() {
                    /* class com.bytedance.android.monitorV2.a.AnonymousClass1 */

                    static {
                        Covode.recordClassIndex(14097);
                    }

                    public final void run() {
                        b.a(dVar);
                    }
                });
            } else {
                b.a(dVar);
            }
        }
    }

    private static boolean b(d dVar) {
        String str = dVar.f23848b;
        String str2 = dVar.f23849c;
        if (TextUtils.isEmpty(str2)) {
            return false;
        }
        if (com.bytedance.android.monitorV2.l.b.a(str, str2) == 1) {
            com.bytedance.android.monitorV2.i.b.b("CustomMonitor", com.a.a("bid: %s, event: %s, sample hit", new Object[]{str, str2}));
            return true;
        } else if (com.bytedance.android.monitorV2.l.b.a(str, str2) == 0) {
            com.bytedance.android.monitorV2.i.b.b("CustomMonitor", com.a.a("bid: %s, event: %s, sample not hit", new Object[]{str, str2}));
            return false;
        } else {
            com.bytedance.android.monitorV2.i.b.b("CustomMonitor", com.a.a("bid: %s, event: %s, sample not found, checking all...", new Object[]{str, str2}));
            return c(dVar);
        }
    }

    /* access modifiers changed from: package-private */
    public final void a(String str, String str2, String str3, JSONObject jSONObject, JSONObject jSONObject2, JSONObject jSONObject3, JSONObject jSONObject4, int i2, b bVar) {
        JSONObject jSONObject5 = new JSONObject();
        d.a aVar = new d.a(str3);
        aVar.f23860a = str;
        aVar.f23861b = str2;
        aVar.f23862c = jSONObject;
        aVar.f23863d = jSONObject2;
        aVar.f23864e = jSONObject3;
        aVar.f23865f = jSONObject5;
        aVar.f23867h = jSONObject4;
        d.a a2 = aVar.a(i2);
        a2.f23871l = bVar;
        a(a2.a());
    }
}
