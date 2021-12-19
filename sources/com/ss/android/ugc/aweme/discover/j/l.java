package com.ss.android.ugc.aweme.discover.j;

import b.i;
import com.bytedance.covode.number.Covode;
import com.ss.android.ugc.aweme.discover.mixfeed.m;
import com.ss.android.ugc.aweme.discover.mixfeed.n;
import com.ss.android.ugc.aweme.search.l.a.g;
import com.ss.android.ugc.aweme.search.l.a.h;
import h.p;
import java.util.HashMap;
import java.util.Map;

public final class l {

    /* renamed from: a  reason: collision with root package name */
    public static final Map<n, p<n, i<?>>> f81272a = new HashMap();

    /* renamed from: b  reason: collision with root package name */
    public static long f81273b;

    /* renamed from: c  reason: collision with root package name */
    public static int f81274c;

    /* renamed from: d  reason: collision with root package name */
    public static int f81275d;

    /* renamed from: e  reason: collision with root package name */
    public static final l f81276e = new l();

    private l() {
    }

    public static void a() {
        f81275d++;
    }

    public static void b() {
        f81274c++;
    }

    static {
        Covode.recordClassIndex(50504);
    }

    public static void a(n nVar) {
        h.f.b.l.d(nVar, "");
        f81272a.remove(nVar);
    }

    public static p<n, i<m>> b(n nVar) {
        h.f.b.l.d(nVar, "");
        p<n, i<m>> c2 = c(nVar);
        a(nVar);
        return c2;
    }

    /* JADX DEBUG: Type inference failed for r1v1. Raw type applied. Possible types: h.p<com.ss.android.ugc.aweme.discover.mixfeed.n, b.i<?>>, h.p<com.ss.android.ugc.aweme.discover.mixfeed.n, b.i<com.ss.android.ugc.aweme.discover.mixfeed.m>> */
    private static p<n, i<m>> c(n nVar) {
        h.f.b.l.d(nVar, "");
        p pVar = f81272a.get(nVar);
        if (pVar == null) {
            return null;
        }
        g.a(nVar.f81835a).e();
        h.a(nVar.f81835a).d();
        return pVar;
    }
}
