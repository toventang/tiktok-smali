package com.bytedance.android.livesdk.feed.tab.b;

import android.content.Context;
import android.content.SharedPreferences;
import com.bytedance.android.live.core.f.y;
import com.bytedance.android.livesdk.feed.o;
import com.bytedance.android.livesdk.feed.tab.a.b;
import com.bytedance.android.livesdk.feed.tab.a.c;
import com.bytedance.android.livesdk.model.ah;
import com.bytedance.common.utility.h;
import com.bytedance.covode.number.Covode;
import com.bytedance.frameworks.apm.trace.MethodCollector;
import com.google.gson.b.a;
import com.google.gson.m;
import com.google.gson.p;
import com.ss.android.ugc.aweme.bf.d;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;

public class f implements h {

    /* renamed from: a  reason: collision with root package name */
    private Context f17674a;

    /* renamed from: b  reason: collision with root package name */
    private c f17675b;

    /* renamed from: c  reason: collision with root package name */
    private List<ah> f17676c;

    /* renamed from: d  reason: collision with root package name */
    private o<ah> f17677d;

    /* renamed from: e  reason: collision with root package name */
    private com.google.gson.f f17678e;

    /* renamed from: f  reason: collision with root package name */
    private Map<Long, ah> f17679f = new ConcurrentHashMap();

    /* renamed from: g  reason: collision with root package name */
    private com.bytedance.android.livesdk.feed.feed.f f17680g = null;

    /* renamed from: h  reason: collision with root package name */
    private b f17681h;

    /* renamed from: i  reason: collision with root package name */
    private List<ah> f17682i;

    /* renamed from: j  reason: collision with root package name */
    private com.bytedance.android.livesdk.feed.feed.f f17683j;

    static {
        Covode.recordClassIndex(9806);
    }

    private boolean d() {
        if (this.f17674a == null) {
            if (y.e() == null) {
                return false;
            }
            this.f17674a = a(y.e());
        }
        return true;
    }

    @Override // com.bytedance.android.livesdk.feed.tab.b.h
    public final List<ah> b() {
        if (!d(this.f17682i)) {
            return null;
        }
        return new ArrayList(this.f17682i);
    }

    private synchronized void c() {
        MethodCollector.i(2219);
        if (!d(this.f17676c)) {
            c((List) a(new a<List<ah>>() {
                /* class com.bytedance.android.livesdk.feed.tab.b.f.AnonymousClass1 */

                static {
                    Covode.recordClassIndex(9807);
                }
            }, this.f17681h.a(), ""));
            if (!d(this.f17676c)) {
                c(this.f17675b.a());
            }
            MethodCollector.o(2219);
            return;
        }
        MethodCollector.o(2219);
    }

    @Override // com.bytedance.android.livesdk.feed.tab.b.h
    public final List<ah> a() {
        c();
        return new ArrayList(this.f17676c);
    }

    private static Context a(Context context) {
        Context applicationContext = context.getApplicationContext();
        if (com.ss.android.ugc.aweme.lancet.a.a.f107168c && applicationContext == null) {
            return com.ss.android.ugc.aweme.lancet.a.a.f107166a;
        }
        return applicationContext;
    }

    private static boolean d(List<ah> list) {
        if (list == null || list.isEmpty()) {
            return false;
        }
        return true;
    }

    @Override // com.bytedance.android.livesdk.feed.tab.b.h
    public final ah a(long j2) {
        c();
        return this.f17679f.get(Long.valueOf(j2));
    }

    private synchronized void c(List<ah> list) {
        MethodCollector.i(2209);
        this.f17676c = list;
        if (!h.a(list)) {
            for (ah ahVar : list) {
                if (ahVar != null) {
                    this.f17679f.put(Long.valueOf(ahVar.getId()), ahVar);
                }
            }
        }
        MethodCollector.o(2209);
    }

    /* JADX WARNING: Removed duplicated region for block: B:6:0x0012  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private static boolean e(java.util.List<com.bytedance.android.livesdk.model.ah> r3) {
        /*
            boolean r0 = d(r3)
            r2 = 0
            if (r0 != 0) goto L_0x0008
            return r2
        L_0x0008:
            java.util.Iterator r1 = r3.iterator()
        L_0x000c:
            boolean r0 = r1.hasNext()
            if (r0 == 0) goto L_0x0021
            java.lang.Object r0 = r1.next()
            com.bytedance.android.livesdk.model.ah r0 = (com.bytedance.android.livesdk.model.ah) r0
            if (r0 == 0) goto L_0x0020
            boolean r0 = r0.isItemValid()
            if (r0 != 0) goto L_0x000c
        L_0x0020:
            return r2
        L_0x0021:
            r0 = 1
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.bytedance.android.livesdk.feed.tab.b.f.e(java.util.List):boolean");
    }

    @Override // com.bytedance.android.livesdk.feed.tab.b.h
    public final synchronized boolean b(com.bytedance.android.livesdk.feed.feed.f fVar) {
        MethodCollector.i(2249);
        if (fVar == null) {
            MethodCollector.o(2249);
            return true;
        } else if (this.f17683j == null || fVar.now >= this.f17683j.now) {
            this.f17683j = fVar;
            MethodCollector.o(2249);
            return true;
        } else {
            MethodCollector.o(2249);
            return true;
        }
    }

    @Override // com.bytedance.android.livesdk.feed.tab.b.h
    public final synchronized boolean b(List<ah> list) {
        MethodCollector.i(2248);
        if (!e(list)) {
            this.f17682i = null;
            MethodCollector.o(2248);
            return false;
        } else if (this.f17677d.a(list, this.f17682i)) {
            MethodCollector.o(2248);
            return false;
        } else {
            this.f17682i = new ArrayList(list);
            MethodCollector.o(2248);
            return true;
        }
    }

    @Override // com.bytedance.android.livesdk.feed.tab.b.h
    public final boolean a(com.bytedance.android.livesdk.feed.feed.f fVar) {
        if (fVar == null) {
            return true;
        }
        if (this.f17680g != null && fVar.now < this.f17680g.now) {
            return true;
        }
        try {
            String b2 = this.f17678e.b(fVar);
            if (!d()) {
                return false;
            }
            SharedPreferences.Editor edit = d.a(this.f17674a, "ttlive_tabs_cache", 0).edit();
            edit.putString(this.f17681h.b(), b2);
            com.bytedance.common.utility.e.a.a(edit);
            this.f17680g = fVar;
            return true;
        } catch (m e2) {
            com.bytedance.android.live.core.c.a.b("BaseLocalFeedTabDataSource", "saveFeedTabExtra: ", e2);
            return false;
        }
    }

    @Override // com.bytedance.android.livesdk.feed.tab.b.h
    public final synchronized boolean a(List<ah> list) {
        MethodCollector.i(2230);
        if (list == null || list.isEmpty() || !e(list)) {
            MethodCollector.o(2230);
            return false;
        } else if (this.f17677d.a(list, this.f17676c)) {
            MethodCollector.o(2230);
            return false;
        } else {
            c(new ArrayList(list));
            try {
                String b2 = this.f17678e.b(list);
                if (!d()) {
                    MethodCollector.o(2230);
                    return false;
                }
                SharedPreferences.Editor edit = d.a(this.f17674a, "ttlive_tabs_cache", 0).edit();
                edit.putString(this.f17681h.a(), b2);
                com.bytedance.common.utility.e.a.a(edit);
                MethodCollector.o(2230);
                return true;
            } catch (m e2) {
                com.bytedance.android.live.core.c.a.b("BaseLocalFeedTabDataSource", "saveFeedTab: ", e2);
                MethodCollector.o(2230);
                return false;
            }
        }
    }

    public f(b bVar, c cVar, o<ah> oVar) {
        this.f17681h = bVar;
        this.f17675b = cVar;
        this.f17677d = oVar;
        this.f17678e = (com.google.gson.f) com.bytedance.android.livesdk.feed.services.b.a().a(com.google.gson.f.class);
    }

    private <T> T a(a<T> aVar, String str, String str2) {
        if (!d()) {
            return null;
        }
        String string = d.a(this.f17674a, "ttlive_tabs_cache", 0).getString(str, str2);
        if (com.bytedance.common.utility.m.a(string)) {
            return null;
        }
        try {
            return (T) com.bytedance.android.livesdk.util.a.a(string, aVar.type);
        } catch (p e2) {
            com.bytedance.android.live.core.c.a.a("ALogger", e2);
            return null;
        }
    }
}
