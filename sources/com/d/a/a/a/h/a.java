package com.d.a.a.a.h;

import android.os.Handler;
import android.os.Looper;
import android.view.View;
import com.bytedance.covode.number.Covode;
import com.d.a.a.a.d.a;
import com.d.a.a.a.d.b;
import com.d.a.a.a.e.e;
import com.d.a.a.a.h.a.c;
import com.d.a.a.a.h.b;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.TimeUnit;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

public final class a implements a.AbstractC1153a {

    /* renamed from: a  reason: collision with root package name */
    public static a f46417a = new a();

    /* renamed from: b  reason: collision with root package name */
    public static Handler f46418b = new Handler(Looper.getMainLooper());

    /* renamed from: c  reason: collision with root package name */
    static Handler f46419c = null;

    /* renamed from: j  reason: collision with root package name */
    static final Runnable f46420j = new Runnable() {
        /* class com.d.a.a.a.h.a.AnonymousClass2 */

        static {
            Covode.recordClassIndex(28340);
        }

        /* JADX WARNING: Removed duplicated region for block: B:16:0x005b  */
        /* JADX WARNING: Removed duplicated region for block: B:50:0x003e A[EDGE_INSN: B:50:0x003e->B:12:0x003e ?: BREAK  , SYNTHETIC] */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public final void run() {
            /*
            // Method dump skipped, instructions count: 344
            */
            throw new UnsupportedOperationException("Method not decompiled: com.d.a.a.a.h.a.AnonymousClass2.run():void");
        }
    };

    /* renamed from: k  reason: collision with root package name */
    static final Runnable f46421k = new Runnable() {
        /* class com.d.a.a.a.h.a.AnonymousClass3 */

        static {
            Covode.recordClassIndex(28341);
        }

        public final void run() {
            if (a.f46419c != null) {
                a.f46419c.post(a.f46420j);
                a.f46419c.postDelayed(a.f46421k, 200);
            }
        }
    };

    /* renamed from: d  reason: collision with root package name */
    public List<Object> f46422d = new ArrayList();

    /* renamed from: e  reason: collision with root package name */
    int f46423e;

    /* renamed from: f  reason: collision with root package name */
    b f46424f = new b();

    /* renamed from: g  reason: collision with root package name */
    b f46425g = new b();

    /* renamed from: h  reason: collision with root package name */
    c f46426h = new c(new c());

    /* renamed from: i  reason: collision with root package name */
    long f46427i;

    static {
        Covode.recordClassIndex(28338);
    }

    a() {
    }

    public static void a() {
        if (f46419c == null) {
            Handler handler = new Handler(Looper.getMainLooper());
            f46419c = handler;
            handler.post(f46420j);
            f46419c.postDelayed(f46421k, 200);
        }
    }

    public static void b() {
        Handler handler = f46419c;
        if (handler != null) {
            handler.removeCallbacks(f46421k);
            f46419c = null;
        }
    }

    /* access modifiers changed from: package-private */
    public final void a(long j2) {
        if (this.f46422d.size() > 0) {
            Iterator<Object> it = this.f46422d.iterator();
            while (it.hasNext()) {
                it.next();
                TimeUnit.NANOSECONDS.toMillis(j2);
            }
        }
    }

    /* access modifiers changed from: package-private */
    public final void a(View view, com.d.a.a.a.d.a aVar, JSONObject jSONObject, d dVar) {
        aVar.a(view, jSONObject, this, dVar == d.PARENT_VIEW);
    }

    @Override // com.d.a.a.a.d.a.AbstractC1153a
    public final void a(View view, com.d.a.a.a.d.a aVar, JSONObject jSONObject) {
        String str;
        if (e.c(view) == null) {
            b bVar = this.f46425g;
            d dVar = bVar.f46441d.contains(view) ? d.PARENT_VIEW : bVar.f46445h ? d.OBSTRUCTION_VIEW : d.UNDERLYING_VIEW;
            if (dVar != d.UNDERLYING_VIEW) {
                JSONObject a2 = aVar.a(view);
                com.d.a.a.a.e.b.a(jSONObject, a2);
                b bVar2 = this.f46425g;
                if (!(bVar2.f46438a.size() == 0 || (str = bVar2.f46438a.get(view)) == null)) {
                    bVar2.f46438a.remove(view);
                    if (str != null) {
                        com.d.a.a.a.e.b.a(a2, str);
                        this.f46425g.f46445h = true;
                        this.f46423e++;
                    }
                }
                b bVar3 = this.f46425g;
                b.a aVar2 = bVar3.f46439b.get(view);
                if (aVar2 != null) {
                    bVar3.f46439b.remove(view);
                    com.d.a.a.a.c.c cVar = aVar2.f46446a;
                    JSONArray jSONArray = new JSONArray();
                    for (String str2 : aVar2.f46447b) {
                        jSONArray.put(str2);
                    }
                    try {
                        a2.put("isFriendlyObstructionFor", jSONArray);
                        a2.put("friendlyObstructionClass", cVar.f46378b);
                        a2.put("friendlyObstructionPurpose", cVar.f46379c);
                        a2.put("friendlyObstructionReason", cVar.f46380d);
                    } catch (JSONException unused) {
                        com.d.a.a.a.e.c.b("Error with setting friendly obstruction");
                    }
                }
                a(view, aVar, a2, dVar);
                this.f46423e++;
            }
        }
    }
}
