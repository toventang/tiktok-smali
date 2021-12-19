package com.bytedance.analytics.page;

import android.app.Activity;
import android.os.Handler;
import android.os.Looper;
import android.text.TextUtils;
import android.view.View;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.e;
import com.bytedance.analytics.a;
import com.bytedance.analytics.a.b;
import com.bytedance.analytics.b.f;
import com.bytedance.covode.number.Covode;
import h.a.h;
import h.f.b.ad;
import h.f.b.l;
import java.lang.ref.WeakReference;
import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Objects;
import java.util.concurrent.CopyOnWriteArraySet;

public final class g {

    /* renamed from: a  reason: collision with root package name */
    public static final g f6583a = new g();

    /* renamed from: b  reason: collision with root package name */
    public static f f6584b;

    /* renamed from: c  reason: collision with root package name */
    static final Map<String, f> f6585c = new LinkedHashMap();

    /* renamed from: d  reason: collision with root package name */
    public static final CopyOnWriteArraySet<Object> f6586d = new CopyOnWriteArraySet<>();

    /* renamed from: e  reason: collision with root package name */
    private static final Handler f6587e = new Handler(Looper.getMainLooper());

    /* renamed from: f  reason: collision with root package name */
    private static final Map<String, a> f6588f = new HashMap();

    public /* synthetic */ class a {

        /* renamed from: a  reason: collision with root package name */
        public static final /* synthetic */ int[] f6589a;

        static {
            Covode.recordClassIndex(3168);
            int[] iArr = new int[a.c.values().length];
            iArr[a.c.Activity.ordinal()] = 1;
            iArr[a.c.Fragment.ordinal()] = 2;
            f6589a = iArr;
        }
    }

    private g() {
    }

    static {
        Covode.recordClassIndex(3167);
    }

    static void a(f fVar) {
        f fVar2 = fVar.f6572c;
        f fVar3 = fVar.u;
        if (fVar3 != null) {
            fVar3.f6572c = fVar2;
        }
        if (fVar2 != null) {
            fVar2.u = fVar3;
        }
        f6585c.remove(fVar.f6570a);
    }

    private static void b(f fVar) {
        fVar.f6582m = System.currentTimeMillis();
        Iterator<Object> it = f6586d.iterator();
        while (it.hasNext()) {
            it.next();
        }
    }

    private static void c(f fVar) {
        if (fVar.f6582m != 0) {
            fVar.n = System.currentTimeMillis() - fVar.f6582m;
        }
        fVar.f6582m = 0;
        f.a(fVar);
        com.bytedance.analytics.b.a.a(fVar);
        b.b();
    }

    public static f a(String str) {
        String str2;
        l.d(str, "");
        f fVar = f6585c.get(str);
        if (fVar == null) {
            return null;
        }
        a(fVar);
        if (fVar == f6584b) {
            c(fVar);
            f fVar2 = fVar.f6572c;
            if (fVar2 == null) {
                f6584b = null;
            } else {
                h<String> hVar = fVar.f6574e;
                hVar.add(fVar.p);
                fVar2.f6574e.clear();
                fVar2.a(hVar);
                fVar2.o = true;
                f fVar3 = f6584b;
                if (fVar3 == null) {
                    str2 = null;
                } else {
                    str2 = fVar3.p;
                }
                fVar2.s = str2;
                fVar2.u = null;
                f6584b = fVar2;
            }
            f fVar4 = f6584b;
            if (fVar4 != null) {
                b(fVar4);
            }
        }
        return fVar;
    }

    public static void a(com.bytedance.analytics.a aVar) {
        String str;
        Fragment fragment;
        Fragment fragment2;
        Fragment fragment3;
        e activity;
        f fVar;
        WeakReference<Fragment> weakReference;
        Fragment fragment4;
        boolean z;
        f fVar2;
        h<String> hVar;
        a aVar2;
        f next;
        h<String> hVar2;
        a aVar3;
        Fragment fragment5;
        l.d(aVar, "");
        f fVar3 = f6585c.get(aVar.f6503b);
        f fVar4 = f6584b;
        if (fVar4 == null || fVar3 != fVar4) {
            boolean z2 = false;
            Integer num = null;
            if (aVar.f6505d == a.c.Fragment) {
                WeakReference<Fragment> weakReference2 = aVar.f6506e;
                if (!(weakReference2 == null || (fragment5 = weakReference2.get()) == null)) {
                    if (aVar.f6510i > com.bytedance.analytics.a.a.f6514d) {
                        com.bytedance.analytics.b.a.a("retryLimit", "fragmentRetry");
                        return;
                    }
                    aVar.f6510i++;
                    if (fragment5.getView() == null || fragment5.getActivity() == null) {
                        f6587e.postDelayed(new h(aVar), 50);
                        return;
                    }
                    View view = fragment5.getView();
                    if (view != null && !view.isShown()) {
                        f6587e.postDelayed(new i(aVar), 50);
                        return;
                    }
                }
                if (!(aVar.f6505d != a.c.Fragment || (weakReference = aVar.f6506e) == null || (fragment4 = weakReference.get()) == null)) {
                    boolean z3 = false;
                    for (Fragment parentFragment = fragment4.getParentFragment(); parentFragment != null; parentFragment = parentFragment.getParentFragment()) {
                        if (!(parentFragment instanceof b)) {
                            Iterator<f> it = f6585c.values().iterator();
                            while (true) {
                                if (!it.hasNext()) {
                                    break;
                                }
                                next = it.next();
                                if (next.f6576g && next.f6579j == String.valueOf(parentFragment.hashCode())) {
                                    break;
                                }
                            }
                        } else {
                            next = f6585c.get(((b) parentFragment).ac_());
                            if (next == null) {
                            }
                        }
                        a(next);
                        if (l.a(next, f6584b)) {
                            f fVar5 = next.f6572c;
                            f6584b = fVar5;
                            if (!(fVar5 == null || (aVar3 = next.f6573d) == null)) {
                                f6588f.put(fVar5.f6570a, aVar3);
                            }
                        }
                        f fVar6 = f6584b;
                        if (!(fVar6 == null || (hVar2 = fVar6.f6574e) == null)) {
                            hVar2.remove(next.p);
                        }
                        z3 = true;
                    }
                    e activity2 = fragment4.getActivity();
                    if (activity2 != null) {
                        if (activity2 instanceof b) {
                            fVar2 = f6585c.get(((b) activity2).ac_());
                        } else {
                            c<Activity> cVar = e.f6569b;
                            if (cVar != null) {
                                com.bytedance.analytics.a a2 = cVar.a(activity2);
                                l.d(a2, "");
                                fVar2 = f6585c.get(a2.f6503b);
                            }
                        }
                        if (fVar2 != null) {
                            a(fVar2);
                            if (l.a(fVar2, f6584b)) {
                                f fVar7 = fVar2.f6572c;
                                f6584b = fVar7;
                                if (!(fVar7 == null || (aVar2 = fVar2.f6573d) == null)) {
                                    f6588f.put(fVar7.f6570a, aVar2);
                                }
                            }
                            f fVar8 = f6584b;
                            if (!(fVar8 == null || (hVar = fVar8.f6574e) == null)) {
                                hVar.remove(fVar2.p);
                            }
                            z = true;
                            if (z3 || z) {
                                z2 = true;
                            }
                        }
                    }
                    z = false;
                    z2 = true;
                }
            }
            f fVar9 = f6584b;
            if (fVar9 != null && !z2) {
                c(fVar9);
            }
            f fVar10 = f6584b;
            Map<String, a> map = f6588f;
            String str2 = fVar10 == null ? null : fVar10.f6570a;
            Objects.requireNonNull(map, "null cannot be cast to non-null type kotlin.collections.MutableMap<K, V>");
            Object remove = ad.h(map).remove(str2);
            if (!aVar.f6507f || (fVar = f6584b) == null || !fVar.f6580k || !TextUtils.equals(fVar.f6581l, aVar.f6508g)) {
                str = null;
            } else {
                fVar10 = fVar.f6572c;
                remove = fVar.f6573d;
                str = fVar.q;
            }
            if (fVar3 == null) {
                fVar3 = new f(aVar.f6503b, aVar.f6504c, fVar10, (a) remove);
                if (str != null) {
                    fVar3.q = str;
                }
                int i2 = a.f6589a[aVar.f6505d.ordinal()];
                if (i2 == 1) {
                    fVar3.f6575f = true;
                } else if (i2 != 2) {
                    fVar3.f6577h = true;
                } else {
                    fVar3.f6576g = true;
                    fVar3.f6580k = aVar.f6507f;
                    fVar3.f6581l = aVar.f6508g;
                    WeakReference<Fragment> weakReference3 = aVar.f6506e;
                    fVar3.f6579j = String.valueOf((weakReference3 == null || (fragment2 = weakReference3.get()) == null) ? null : Integer.valueOf(fragment2.hashCode()));
                    WeakReference<Fragment> weakReference4 = aVar.f6506e;
                    if (!(weakReference4 == null || (fragment3 = weakReference4.get()) == null || (activity = fragment3.getActivity()) == null || !TextUtils.isEmpty(fVar3.f6578i))) {
                        fVar3.f6578i = String.valueOf(activity.hashCode());
                    }
                }
            } else {
                f fVar11 = fVar3;
                if (!fVar11.f6576g || !fVar11.f6580k) {
                    for (f fVar12 = fVar11.u; fVar12 != null; fVar12 = fVar12.u) {
                        a(fVar12);
                    }
                    com.bytedance.analytics.b.a.a("pushNonTop", l.a("name:", (Object) fVar11.f6571b));
                } else {
                    f fVar13 = fVar11.f6572c;
                    if (fVar13 != null) {
                        fVar13.u = fVar11;
                    }
                }
                fVar11.o = true;
                f fVar14 = f6584b;
                fVar11.s = fVar14 == null ? null : fVar14.p;
            }
            f fVar15 = fVar3;
            if (fVar15.f6576g) {
                WeakReference<Fragment> weakReference5 = aVar.f6506e;
                if (!(weakReference5 == null || (fragment = weakReference5.get()) == null)) {
                    num = Integer.valueOf(fragment.hashCode());
                }
                fVar15.f6579j = String.valueOf(num);
            }
            fVar15.f6574e.clear();
            f fVar16 = f6584b;
            if (fVar16 != null) {
                fVar15.a(fVar16.f6574e);
                fVar15.a(fVar16.p);
            }
            f6584b = fVar15;
            b(fVar15);
            f6585c.put(fVar15.f6570a, fVar3);
        }
    }
}
