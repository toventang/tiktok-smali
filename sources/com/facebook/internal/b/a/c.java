package com.facebook.internal.b.a;

import android.os.Build;
import com.bytedance.covode.number.Covode;
import com.bytedance.frameworks.apm.trace.MethodCollector;
import com.facebook.AccessToken;
import com.facebook.GraphRequest;
import com.facebook.internal.a.b.a;
import com.facebook.internal.ad;
import com.facebook.internal.ae;
import com.facebook.internal.b.d;
import com.facebook.internal.b.e;
import com.facebook.m;
import com.facebook.q;
import com.ss.android.ugc.aweme.cw.g;
import com.ss.android.ugc.aweme.cw.l;
import com.ss.android.ugc.aweme.cw.o;
import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.ScheduledFuture;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

public final class c implements d {

    /* renamed from: e  reason: collision with root package name */
    private static final Integer f48578e = 100;

    /* renamed from: f  reason: collision with root package name */
    private static c f48579f;

    /* renamed from: h  reason: collision with root package name */
    private static String f48580h = Build.VERSION.RELEASE;

    /* renamed from: i  reason: collision with root package name */
    private static String f48581i = Build.MODEL;

    /* renamed from: a  reason: collision with root package name */
    public final ScheduledExecutorService f48582a;

    /* renamed from: b  reason: collision with root package name */
    public com.facebook.internal.b.c f48583b;

    /* renamed from: c  reason: collision with root package name */
    public ScheduledFuture f48584c;

    /* renamed from: d  reason: collision with root package name */
    public final Runnable f48585d = new Runnable() {
        /* class com.facebook.internal.b.a.c.AnonymousClass1 */

        static {
            Covode.recordClassIndex(29291);
        }

        public final void run() {
            if (!a.a(this)) {
                try {
                    c.this.b();
                } catch (Throwable th) {
                    a.a(th, this);
                }
            }
        }
    };

    /* renamed from: g  reason: collision with root package name */
    private e f48586g;

    @Override // com.facebook.internal.b.d
    public final void a() {
        this.f48583b.a(this.f48586g.a());
        b();
    }

    static {
        Covode.recordClassIndex(29290);
    }

    public final void b() {
        ScheduledFuture scheduledFuture = this.f48584c;
        if (scheduledFuture != null) {
            scheduledFuture.cancel(true);
        }
        com.facebook.internal.b.c cVar = this.f48583b;
        ArrayList arrayList = new ArrayList();
        ae.a();
        if (!ad.a(m.f48915a)) {
            while (!cVar.a()) {
                ArrayList arrayList2 = new ArrayList();
                for (int i2 = 0; i2 < f48578e.intValue() && !cVar.a(); i2++) {
                    arrayList2.add(cVar.b());
                }
                GraphRequest a2 = a(arrayList2);
                if (a2 != null) {
                    arrayList.add(a2);
                }
            }
        }
        try {
            new q(arrayList).a();
        } catch (Exception unused) {
        }
    }

    private static GraphRequest a(List<? extends com.facebook.internal.b.a> list) {
        ae.a();
        String packageName = m.f48921g.getPackageName();
        JSONArray jSONArray = new JSONArray();
        for (com.facebook.internal.b.a aVar : list) {
            jSONArray.put(aVar.convertToJSONObject());
        }
        if (jSONArray.length() == 0) {
            return null;
        }
        JSONObject jSONObject = new JSONObject();
        try {
            jSONObject.put("device_os_version", f48580h);
            jSONObject.put("device_model", f48581i);
            jSONObject.put("unique_application_identifier", packageName);
            jSONObject.put("entries", jSONArray.toString());
            ae.a();
            return GraphRequest.a((AccessToken) null, com.a.a("%s/monitorings", new Object[]{m.f48915a}), jSONObject, (GraphRequest.b) null);
        } catch (JSONException unused) {
            return null;
        }
    }

    public static synchronized c a(com.facebook.internal.b.c cVar, e eVar) {
        c cVar2;
        synchronized (c.class) {
            MethodCollector.i(507);
            if (f48579f == null) {
                f48579f = new c(cVar, eVar);
            }
            cVar2 = f48579f;
            MethodCollector.o(507);
        }
        return cVar2;
    }

    private c(com.facebook.internal.b.c cVar, e eVar) {
        l.a a2 = l.a(o.SCHEDULED);
        a2.f79174c = 1;
        this.f48582a = (ScheduledExecutorService) g.a(a2.a());
        if (this.f48583b == null) {
            this.f48583b = cVar;
        }
        if (this.f48586g == null) {
            this.f48586g = eVar;
        }
    }
}
