package com.ss.android.ugc.aweme.commerce.a.a.e;

import android.view.View;
import com.bytedance.covode.number.Covode;
import com.ss.android.ugc.aweme.commerce.a.a.a.c;
import java.lang.ref.WeakReference;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;

public final class a {

    /* renamed from: a  reason: collision with root package name */
    public final HashMap<View, String> f73357a = new HashMap<>();

    /* renamed from: b  reason: collision with root package name */
    public final HashMap<View, String> f73358b = new HashMap<>();

    /* renamed from: c  reason: collision with root package name */
    public final HashSet<View> f73359c = new HashSet<>();

    /* renamed from: d  reason: collision with root package name */
    final HashSet<String> f73360d = new HashSet<>();

    /* renamed from: e  reason: collision with root package name */
    public c f73361e;

    /* renamed from: f  reason: collision with root package name */
    boolean f73362f;

    static {
        Covode.recordClassIndex(45160);
    }

    public final void a() {
        this.f73361e = null;
        this.f73362f = false;
        this.f73357a.clear();
        this.f73358b.clear();
        this.f73359c.clear();
        this.f73360d.clear();
    }

    /* access modifiers changed from: package-private */
    public final void a(c cVar, String str) {
        Iterator<WeakReference<View>> it = cVar.f73323a.iterator();
        while (it.hasNext()) {
            WeakReference<View> next = it.next();
            if (next.get() != null) {
                this.f73358b.put(next.get(), str);
            }
        }
    }
}
