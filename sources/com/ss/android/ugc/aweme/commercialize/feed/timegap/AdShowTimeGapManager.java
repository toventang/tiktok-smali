package com.ss.android.ugc.aweme.commercialize.feed.timegap;

import android.text.TextUtils;
import androidx.lifecycle.i;
import androidx.lifecycle.m;
import androidx.lifecycle.v;
import com.bytedance.covode.number.Covode;
import com.google.gson.f;
import com.ss.android.ugc.aweme.au;
import com.ss.android.ugc.aweme.feed.adapter.b;
import com.ss.android.ugc.aweme.feed.model.Aweme;
import com.ss.android.ugc.aweme.feed.q.w;
import h.a.ag;
import h.a.n;
import h.f.b.l;
import h.j.h;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.Comparator;
import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;

public final class AdShowTimeGapManager implements au {

    /* renamed from: a  reason: collision with root package name */
    public static boolean f74417a;

    /* renamed from: b  reason: collision with root package name */
    public static WeakReference<com.ss.android.ugc.aweme.feed.q.a> f74418b;

    /* renamed from: c  reason: collision with root package name */
    public static int f74419c = -1;

    /* renamed from: d  reason: collision with root package name */
    public static long f74420d = -1;

    /* renamed from: e  reason: collision with root package name */
    public static long f74421e = -1;

    /* renamed from: f  reason: collision with root package name */
    public static ArrayList<Long> f74422f = new ArrayList<>();

    /* renamed from: g  reason: collision with root package name */
    public static ArrayList<b> f74423g = new ArrayList<>();

    /* renamed from: h  reason: collision with root package name */
    public static int f74424h = -1;

    /* renamed from: i  reason: collision with root package name */
    public static int f74425i = -1;

    /* renamed from: j  reason: collision with root package name */
    public static int f74426j = -1;

    /* renamed from: k  reason: collision with root package name */
    public static b f74427k;

    /* renamed from: l  reason: collision with root package name */
    public static ArrayList<a> f74428l = new ArrayList<>();

    /* renamed from: m  reason: collision with root package name */
    public static int f74429m = -1;
    public static c n;
    public static boolean o;
    public static boolean p;
    public static boolean q;
    public static final AdShowTimeGapManager r = new AdShowTimeGapManager();
    private static ArrayList<Long> s = new ArrayList<>();

    private static boolean a(int i2, int i3) {
        return i2 >= 0 && i3 > i2;
    }

    @Override // androidx.lifecycle.k
    public final void onStateChanged(m mVar, i.a aVar) {
        if (aVar == i.a.ON_DESTROY) {
            unBind();
        }
    }

    private AdShowTimeGapManager() {
    }

    public static boolean a() {
        c cVar = n;
        if (cVar == null || !cVar.isEnableGapAdjust()) {
            return false;
        }
        return true;
    }

    @v(a = i.a.ON_DESTROY)
    public final void unBind() {
        f74425i = -1;
        f74426j = -1;
        f74429m = -1;
        f74422f.clear();
    }

    private static int g() {
        int i2;
        c cVar = n;
        if (cVar != null) {
            i2 = cVar.getMinGap();
        } else {
            i2 = 0;
        }
        return Math.max(i2 + f74425i + 1, f74424h + 2);
    }

    static {
        Covode.recordClassIndex(45898);
    }

    private static int d() {
        com.ss.android.ugc.aweme.feed.q.a aVar;
        b bVar;
        List<Aweme> e2;
        Aweme aweme;
        WeakReference<com.ss.android.ugc.aweme.feed.q.a> weakReference = f74418b;
        if (!(weakReference == null || (aVar = weakReference.get()) == null || (bVar = aVar.W) == null || (e2 = bVar.e()) == null)) {
            int size = e2.size();
            do {
                size--;
                if (size >= 0) {
                    aweme = e2.get(size);
                    l.b(aweme, "");
                }
            } while (!aweme.isAd());
            e2.size();
            return e2.size() - size;
        }
        return -1;
    }

    private static boolean e() {
        com.ss.android.ugc.aweme.feed.q.a aVar;
        b bVar;
        List<Aweme> e2;
        WeakReference<com.ss.android.ugc.aweme.feed.q.a> weakReference = f74418b;
        if (weakReference == null || (aVar = weakReference.get()) == null || (bVar = aVar.W) == null || (e2 = bVar.e()) == null) {
            return false;
        }
        int size = e2.size();
        for (int i2 = f74426j + 1; i2 < size; i2++) {
            if (com.ss.android.ugc.aweme.commercialize.e.a.b.aW(e2.get(i2))) {
                return false;
            }
        }
        return true;
    }

    private static int h() {
        int i2;
        com.ss.android.ugc.aweme.feed.q.a aVar;
        c cVar = n;
        int i3 = 0;
        if (cVar != null) {
            i2 = cVar.getMinGap();
        } else {
            i2 = 0;
        }
        WeakReference<com.ss.android.ugc.aweme.feed.q.a> weakReference = f74418b;
        b bVar = null;
        if (!(weakReference == null || (aVar = weakReference.get()) == null)) {
            bVar = aVar.W;
        }
        if ((bVar instanceof b) && bVar != null) {
            i3 = bVar.getCount();
        }
        int i4 = f74429m;
        if (i4 == -1) {
            return i3 - 1;
        }
        return (i4 - i2) - 1;
    }

    private static int f() {
        ArrayList<Aweme> arrayList;
        com.ss.android.ugc.aweme.feed.q.a aVar;
        WeakReference<com.ss.android.ugc.aweme.feed.q.a> weakReference = f74418b;
        b bVar = null;
        if (!(weakReference == null || (aVar = weakReference.get()) == null)) {
            bVar = aVar.W;
        }
        if (!(bVar instanceof b) || bVar == null || (arrayList = bVar.f91651a.f91808a) == null) {
            return Integer.MAX_VALUE;
        }
        long j2 = f74421e - f74420d;
        int i2 = f74424h;
        int i3 = f74426j;
        if (i2 <= i3) {
            while (a(i2, arrayList.size())) {
                j2 += (long) arrayList.get(i2).getPredPlaytime();
                if (i2 == i3) {
                    break;
                }
                i2++;
            }
        }
        return (int) j2;
    }

    private static boolean i() {
        int i2;
        c cVar = n;
        if (cVar == null || cVar.isUserFastBrowseModel() || f74424h < cVar.getViewVidNumForFastBrowse() || f74422f.size() < (i2 = f74424h)) {
            return false;
        }
        int i3 = f74424h;
        for (int viewVidNumForFastBrowse = i2 - cVar.getViewVidNumForFastBrowse(); viewVidNumForFastBrowse < i3; viewVidNumForFastBrowse++) {
            if (!a(viewVidNumForFastBrowse, f74422f.size())) {
                return false;
            }
            if (f74422f.get(viewVidNumForFastBrowse).longValue() >= ((long) cVar.getSingleVidViewTime())) {
                f74422f.get(viewVidNumForFastBrowse);
                cVar.getSingleVidViewTime();
                return false;
            }
        }
        return true;
    }

    public final String b() {
        int i2;
        b bVar;
        com.ss.android.ugc.aweme.feed.q.a aVar;
        com.ss.android.ugc.aweme.feed.q.a aVar2;
        com.ss.android.ugc.aweme.feed.q.a aVar3;
        WeakReference<com.ss.android.ugc.aweme.feed.q.a> weakReference = f74418b;
        int i3 = -1;
        if (weakReference == null || (aVar3 = weakReference.get()) == null) {
            i2 = -1;
        } else {
            i2 = aVar3.aF();
        }
        WeakReference<com.ss.android.ugc.aweme.feed.q.a> weakReference2 = f74418b;
        if (weakReference2 == null || (aVar2 = weakReference2.get()) == null) {
            bVar = null;
        } else {
            bVar = aVar2.W;
        }
        if (!(bVar instanceof b)) {
            return null;
        }
        if (i2 > f74419c) {
            f74426j = a((List<? extends Aweme>) bVar.f91651a.f91808a, f74425i, true);
            f74429m = a((List<? extends Aweme>) bVar.f91651a.f91808a, f74426j, false);
            c();
        }
        b bVar2 = f74427k;
        if (bVar2 != null && !f74423g.contains(bVar2)) {
            f74423g.add(bVar2);
        }
        Iterator<b> it = f74423g.iterator();
        while (it.hasNext()) {
            b next = it.next();
            if (!next.isDrop()) {
                next.setFinalPos(next.getFinalPos() - f74424h);
            }
        }
        f fVar = new f();
        WeakReference<com.ss.android.ugc.aweme.feed.q.a> weakReference3 = f74418b;
        if (!(weakReference3 == null || (aVar = weakReference3.get()) == null)) {
            int aF = aVar.aF();
            int i4 = f74424h;
            if (i4 != -1) {
                i3 = (aF - i4) - 1;
            }
        }
        String b2 = fVar.b(new d(i3, d(), s, f74423g));
        s.clear();
        f74423g.clear();
        f74427k = null;
        f74428l.clear();
        return b2;
    }

    public static void c() {
        int i2;
        int i3;
        int i4;
        com.ss.android.ugc.aweme.feed.q.a aVar;
        ArrayList<Aweme> arrayList;
        boolean z;
        c cVar = n;
        if (cVar != null && cVar.isEnableGapAdjust() && (i2 = f74425i) != -1 && (i3 = f74426j) != -1 && i2 != (i4 = f74424h) && i3 != i4 + 1) {
            WeakReference<com.ss.android.ugc.aweme.feed.q.a> weakReference = f74418b;
            if (weakReference != null) {
                aVar = weakReference.get();
            } else {
                aVar = null;
            }
            if (!(aVar instanceof w)) {
                aVar = null;
            }
            w wVar = (w) aVar;
            if (wVar != null) {
                b bVar = wVar.W;
                if ((bVar instanceof b) && bVar != null && (arrayList = bVar.f91651a.f91808a) != null && f74426j - f74424h <= cVar.getDownstreamRange() + 2) {
                    int i5 = Integer.MAX_VALUE;
                    if (f74426j != f74424h + 2 || !i() || !cVar.isEnableFastBrowseAdjust()) {
                        if (cVar.isEnableShowTimeGap() && f74420d != -1) {
                            i5 = a(f(), g(), h());
                        }
                        z = false;
                    } else {
                        i5 = 1;
                        z = true;
                    }
                    if (a(i5)) {
                        a(i5, z);
                    } else if (a(f74424h, arrayList.size()) && arrayList.get(f74426j).isEnableAdDrop() && z && cVar.isEnableFastBrowseAdjust() && f74426j == f74424h + 2 && e()) {
                        s.add(Long.valueOf(System.currentTimeMillis()));
                        com.bytedance.ies.ugc.aweme.rich.a.a.a("draw_ad", "drop_ads", arrayList.get(f74426j).getAwemeRawAd()).b();
                        q = true;
                        int i6 = f74426j;
                        wVar.a(i6, arrayList.get(i6));
                        f74428l.add(new a(1, 2));
                        b bVar2 = f74427k;
                        if (bVar2 == null) {
                            f74427k = new b(3, f74428l, true);
                        } else {
                            bVar2.setFinalPos(3);
                            b bVar3 = f74427k;
                            if (bVar3 != null) {
                                bVar3.setDrop(true);
                            }
                        }
                        b bVar4 = f74427k;
                        if (bVar4 != null) {
                            f74423g.add(bVar4);
                        }
                        f74427k = null;
                        f74428l = new ArrayList<>();
                        int i7 = f74429m;
                        f74426j = i7;
                        f74429m = a((List<? extends Aweme>) arrayList, i7, false);
                        q = false;
                    }
                }
            }
        }
    }

    private static boolean a(int i2) {
        int g2;
        int h2;
        int i3;
        if (i2 == Integer.MAX_VALUE || i2 == 0 || (h2 = h()) < (g2 = g()) || g2 > (i3 = f74426j + i2) || h2 < i3) {
            return false;
        }
        return true;
    }

    private static int b(int i2) {
        com.ss.android.ugc.aweme.feed.q.a aVar;
        Aweme c2;
        List<Integer> gapList;
        WeakReference<com.ss.android.ugc.aweme.feed.q.a> weakReference = f74418b;
        if (!(weakReference == null || (aVar = weakReference.get()) == null)) {
            int i3 = f74426j;
            if (!(aVar.W == null || (c2 = aVar.W.c(i3)) == null || (gapList = c2.getGapList()) == null)) {
                for (Integer num : gapList) {
                    l.b(num, "");
                    i2 += num.intValue();
                }
            }
        }
        return i2;
    }

    public static int a(String str) {
        WeakReference<com.ss.android.ugc.aweme.feed.q.a> weakReference;
        com.ss.android.ugc.aweme.feed.q.a aVar;
        b bVar;
        List<Aweme> e2;
        if (f74425i == -1 || (weakReference = f74418b) == null || (aVar = weakReference.get()) == null || (bVar = aVar.W) == null || (e2 = bVar.e()) == null || !a(f74425i, e2.size())) {
            return -1;
        }
        int size = e2.size();
        for (int i2 = f74425i + 1; i2 < size; i2++) {
            Aweme aweme = e2.get(i2);
            l.b(aweme, "");
            if (TextUtils.equals(aweme.getAid(), str)) {
                return i2 - f74425i;
            }
        }
        return -1;
    }

    public static final class a<T> implements Comparator {
        static {
            Covode.recordClassIndex(45899);
        }

        @Override // java.util.Comparator
        public final int compare(T t, T t2) {
            return h.b.a.a(Integer.valueOf(Integer.parseInt((String) t.getKey())), Integer.valueOf(Integer.parseInt((String) t2.getKey())));
        }
    }

    private static void a(int i2, boolean z) {
        com.ss.android.ugc.aweme.feed.q.a aVar;
        WeakReference<com.ss.android.ugc.aweme.feed.q.a> weakReference = f74418b;
        if (weakReference != null) {
            aVar = weakReference.get();
        } else {
            aVar = null;
        }
        if (!(aVar instanceof w)) {
            aVar = null;
        }
        w wVar = (w) aVar;
        if (wVar != null) {
            b bVar = wVar.W;
            if ((bVar instanceof b) && bVar != null && a(f74426j, bVar.getCount())) {
                Aweme aweme = bVar.f91651a.f91808a.get(f74426j);
                Aweme c2 = bVar.c(f74426j + i2);
                if (c2 != null) {
                    c2.getAid();
                }
                int i3 = 1;
                q = true;
                wVar.a(f74426j, aweme);
                wVar.b(aweme, f74426j + i2);
                q = false;
                Aweme c3 = bVar.c(f74426j + i2);
                if (c3 != null) {
                    c3.getAid();
                }
                f74426j += i2;
                ArrayList<a> arrayList = f74428l;
                if (z) {
                    i3 = 2;
                }
                arrayList.add(new a(i2, i3));
                b bVar2 = f74427k;
                if (bVar2 == null) {
                    f74427k = new b(f74426j, f74428l, false);
                } else {
                    bVar2.setFinalPos(f74426j);
                }
            }
        }
    }

    private static int a(int i2, int i3, int i4) {
        String str;
        if (i2 == Integer.MAX_VALUE) {
            return Integer.MAX_VALUE;
        }
        HashMap hashMap = new HashMap();
        f fVar = new f();
        c cVar = n;
        if (cVar != null) {
            str = cVar.getDeltaGapTimeMap();
        } else {
            str = null;
        }
        Map map = (Map) fVar.a(str, (Class) hashMap.getClass());
        if (map == null) {
            return Integer.MAX_VALUE;
        }
        List<Map.Entry> a2 = n.a((Iterable) map.entrySet(), (Comparator) new a());
        int i5 = 10;
        LinkedHashMap linkedHashMap = new LinkedHashMap(h.b(ag.a(n.a((Iterable) a2, 10)), 16));
        for (Map.Entry entry : a2) {
            linkedHashMap.put(entry.getKey(), Double.valueOf(((Number) entry.getValue()).doubleValue()));
        }
        String str2 = "-1";
        for (String str3 : linkedHashMap.keySet()) {
            if (i2 < Integer.parseInt(str3)) {
                break;
            }
            str2 = str3;
        }
        Double d2 = (Double) linkedHashMap.get(str2);
        if (d2 == null) {
            return Integer.MAX_VALUE;
        }
        int b2 = b((int) d2.doubleValue());
        if (b2 == Integer.MAX_VALUE || b2 == 0) {
            return b2;
        }
        if (b2 <= 10) {
            i5 = b2;
        }
        while (true) {
            int i6 = f74426j;
            if ((i5 + i6 < i3 || i6 + i5 > i4) && i5 != 0) {
                i5 = i5 > 0 ? i5 - 1 : i5 + 1;
            }
        }
        return i5;
    }

    public static int a(List<? extends Aweme> list, int i2, boolean z) {
        if (list == null || !a(i2, list.size())) {
            return -1;
        }
        int size = list.size();
        for (int i3 = i2 + 1; i3 < size; i3++) {
            if (!z) {
                if (((Aweme) list.get(i3)).isAd()) {
                    return i3;
                }
            } else if (((Aweme) list.get(i3)).isAd() && ((Aweme) list.get(i3)).isEnablePosAdjust() && !com.ss.android.ugc.aweme.commercialize.e.a.b.aW((Aweme) list.get(i3))) {
                return i3;
            }
        }
        return -1;
    }
}
