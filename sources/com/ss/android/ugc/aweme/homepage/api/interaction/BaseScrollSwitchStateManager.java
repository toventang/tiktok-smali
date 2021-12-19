package com.ss.android.ugc.aweme.homepage.api.interaction;

import android.text.TextUtils;
import androidx.fragment.app.Fragment;
import androidx.lifecycle.ac;
import androidx.lifecycle.m;
import androidx.lifecycle.t;
import com.bytedance.covode.number.Covode;
import com.ss.android.ugc.aweme.arch.widgets.base.c;
import com.ss.android.ugc.aweme.base.ui.ScrollableViewPager;
import com.ss.android.ugc.aweme.base.ui.e;
import com.ss.android.ugc.aweme.base.ui.j;
import h.f.b.l;
import h.u;
import java.lang.ref.WeakReference;
import java.util.HashMap;
import java.util.List;

public class BaseScrollSwitchStateManager extends ac {

    /* renamed from: a  reason: collision with root package name */
    public final a f99139a = new a();

    /* renamed from: b  reason: collision with root package name */
    public final t<List<j>> f99140b = new t<>();

    /* renamed from: c  reason: collision with root package name */
    public final t<Boolean> f99141c;

    /* renamed from: d  reason: collision with root package name */
    public final t<String> f99142d;

    /* renamed from: e  reason: collision with root package name */
    public final t<Integer> f99143e;

    /* renamed from: f  reason: collision with root package name */
    public final t<u<Integer, Float, Integer>> f99144f;

    /* renamed from: g  reason: collision with root package name */
    public final c<String> f99145g;

    /* renamed from: h  reason: collision with root package name */
    public final c<String> f99146h;

    /* renamed from: i  reason: collision with root package name */
    public t<Fragment> f99147i;

    /* renamed from: j  reason: collision with root package name */
    public String f99148j;

    /* renamed from: k  reason: collision with root package name */
    public WeakReference<Fragment> f99149k;

    /* renamed from: l  reason: collision with root package name */
    public final t<Integer> f99150l;

    /* renamed from: m  reason: collision with root package name */
    public final t<Integer> f99151m;
    public final t<u<Integer, Float, Integer>> n;
    public final t<Boolean> o;
    private final t<HashMap<Integer, e>> p = new t<>();
    private final t<Boolean> q;
    private final t<Integer> r;
    private final t<c> s;
    private final t<ScrollableViewPager.a> t;

    static {
        Covode.recordClassIndex(63160);
    }

    public final void a(List<? extends j> list) {
        l.d(list, "");
        this.f99140b.setValue(list);
    }

    public final boolean a() {
        Boolean value = this.q.getValue();
        if (value == null) {
            l.b();
        }
        return value.booleanValue();
    }

    public final void a(boolean z) {
        this.q.setValue(Boolean.valueOf(z));
    }

    private String c() {
        if (!this.f99139a.f99152a) {
            return "";
        }
        return a(this.f99139a.getValue().intValue());
    }

    public final Fragment b() {
        Fragment value = this.f99147i.getValue();
        if (this.f99147i.getValue() == null) {
            return null;
        }
        return value;
    }

    public BaseScrollSwitchStateManager() {
        t<Boolean> tVar = new t<>();
        this.q = tVar;
        t<Boolean> tVar2 = new t<>();
        this.f99141c = tVar2;
        this.f99142d = new t<>();
        this.r = new t<>();
        this.f99143e = new t<>();
        this.f99144f = new t<>();
        this.s = new t<>();
        this.f99145g = new c<>();
        this.f99146h = new c<>();
        this.t = new t<>();
        this.f99147i = new t<>();
        this.f99150l = new t<>();
        this.f99151m = new t<>();
        this.n = new t<>();
        this.o = new t<>();
        tVar.setValue(true);
        tVar2.setValue(true);
    }

    public final void c(int i2) {
        this.r.setValue(Integer.valueOf(i2));
    }

    public final e d(String str) {
        l.d(str, "");
        return b(c(str));
    }

    public final void d(int i2) {
        this.f99143e.setValue(Integer.valueOf(i2));
    }

    public final void e(String str) {
        l.d(str, "");
        this.f99145g.setValue(str);
    }

    public final void a(ScrollableViewPager.a aVar) {
        l.d(aVar, "");
        this.t.setValue(aVar);
    }

    public final e b(int i2) {
        if (this.p.getValue() == null) {
            return null;
        }
        HashMap<Integer, e> value = this.p.getValue();
        if (value == null) {
            l.b();
        }
        if (value.isEmpty()) {
            return null;
        }
        HashMap<Integer, e> value2 = this.p.getValue();
        if (value2 == null) {
            l.b();
        }
        return value2.get(Integer.valueOf(i2));
    }

    public final int c(String str) {
        if (this.f99140b.getValue() != null) {
            List<j> value = this.f99140b.getValue();
            if (value == null) {
                l.b();
            }
            int size = value.size();
            for (int i2 = 0; i2 < size; i2++) {
                List<j> value2 = this.f99140b.getValue();
                if (value2 == null) {
                    l.b();
                }
                if (TextUtils.equals(str, value2.get(i2).f68370b)) {
                    return i2;
                }
            }
        }
        return 0;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:10:0x0022, code lost:
        if (r0 == null) goto L_0x0024;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final java.lang.String a(int r3) {
        /*
            r2 = this;
            androidx.lifecycle.t<java.util.List<com.ss.android.ugc.aweme.base.ui.j>> r0 = r2.f99140b
            java.lang.Object r0 = r0.getValue()
            if (r0 != 0) goto L_0x0010
            r0 = 0
        L_0x0009:
            java.lang.String r1 = ""
            if (r3 < 0) goto L_0x000f
            if (r3 < r0) goto L_0x002e
        L_0x000f:
            return r1
        L_0x0010:
            androidx.lifecycle.t<java.util.List<com.ss.android.ugc.aweme.base.ui.j>> r0 = r2.f99140b
            java.lang.Object r0 = r0.getValue()
            java.util.List r0 = (java.util.List) r0
            if (r0 == 0) goto L_0x002c
            int r0 = r0.size()
            java.lang.Integer r0 = java.lang.Integer.valueOf(r0)
            if (r0 != 0) goto L_0x0027
        L_0x0024:
            h.f.b.l.b()
        L_0x0027:
            int r0 = r0.intValue()
            goto L_0x0009
        L_0x002c:
            r0 = 0
            goto L_0x0024
        L_0x002e:
            androidx.lifecycle.t<java.util.List<com.ss.android.ugc.aweme.base.ui.j>> r0 = r2.f99140b
            java.lang.Object r0 = r0.getValue()
            if (r0 != 0) goto L_0x0039
            h.f.b.l.b()
        L_0x0039:
            java.util.List r0 = (java.util.List) r0
            java.lang.Object r0 = r0.get(r3)
            com.ss.android.ugc.aweme.base.ui.j r0 = (com.ss.android.ugc.aweme.base.ui.j) r0
            java.lang.String r0 = r0.f68370b
            h.f.b.l.b(r0, r1)
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ss.android.ugc.aweme.homepage.api.interaction.BaseScrollSwitchStateManager.a(int):java.lang.String");
    }

    public final boolean b(String str) {
        l.d(str, "");
        return TextUtils.equals(str, c());
    }

    public final void a(b bVar) {
        l.d(bVar, "");
        this.f99139a.a(bVar);
    }

    public final void a(c cVar) {
        l.d(cVar, "");
        this.s.setValue(cVar);
    }

    public final void a(String str) {
        l.d(str, "");
        this.f99139a.a(c(str));
    }

    public final void a(HashMap<Integer, e> hashMap) {
        l.d(hashMap, "");
        this.p.setValue(hashMap);
    }

    public final void a(m mVar, androidx.lifecycle.u<Boolean> uVar) {
        l.d(mVar, "");
        l.d(uVar, "");
        this.q.observe(mVar, uVar);
    }

    public final void b(m mVar, androidx.lifecycle.u<Integer> uVar) {
        l.d(mVar, "");
        l.d(uVar, "");
        this.r.observe(mVar, uVar);
    }

    public final void e(m mVar, androidx.lifecycle.u<ScrollableViewPager.a> uVar) {
        l.d(mVar, "");
        l.d(uVar, "");
        this.t.observe(mVar, uVar);
    }

    public final void f(m mVar, androidx.lifecycle.u<Integer> uVar) {
        l.d(mVar, "");
        l.d(uVar, "");
        this.f99151m.observe(mVar, uVar);
    }

    public final void g(m mVar, androidx.lifecycle.u<Integer> uVar) {
        l.d(mVar, "");
        l.d(uVar, "");
        this.f99150l.observe(mVar, uVar);
    }

    public final void d(m mVar, androidx.lifecycle.u<c> uVar) {
        l.d(mVar, "");
        l.d(uVar, "");
        this.s.observe(mVar, uVar);
    }

    public final void c(m mVar, androidx.lifecycle.u<Integer> uVar) {
        l.d(mVar, "");
        l.d(uVar, "");
        this.f99143e.observe(mVar, uVar);
    }

    public final void a(String str, boolean z) {
        l.d(str, "");
        this.f99139a.a(c(str), z);
    }

    public final void a(int i2, float f2, int i3) {
        this.f99144f.setValue(new u<>(Integer.valueOf(i2), Float.valueOf(f2), Integer.valueOf(i3)));
    }
}
