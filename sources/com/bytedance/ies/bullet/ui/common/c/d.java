package com.bytedance.ies.bullet.ui.common.c;

import android.net.Uri;
import android.view.View;
import android.view.ViewGroup;
import com.bytedance.covode.number.Covode;
import com.bytedance.ies.bullet.service.base.as;
import com.bytedance.ies.bullet.ui.common.c.b;
import h.a.n;
import h.f.b.l;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Set;

public final class d<T extends View> {

    /* renamed from: a  reason: collision with root package name */
    public final T f33078a;

    /* renamed from: b  reason: collision with root package name */
    public final ViewGroup.LayoutParams f33079b;

    /* renamed from: c  reason: collision with root package name */
    private final Set<e<T>> f33080c;

    static {
        Covode.recordClassIndex(19755);
    }

    private List<e<T>> a() {
        return n.k(this.f33080c);
    }

    public /* synthetic */ d(View view) {
        this(view, b.a.f33075a);
    }

    public final void a(e<T> eVar) {
        l.c(eVar, "");
        this.f33080c.add(eVar);
    }

    public final void b(e<T> eVar) {
        l.c(eVar, "");
        this.f33080c.remove(eVar);
    }

    public final void a(Uri uri) {
        l.c(uri, "");
        Iterator<T> it = a().iterator();
        while (it.hasNext()) {
            try {
                it.next().a(this, uri);
            } catch (as unused) {
            }
        }
    }

    public final void b(Uri uri) {
        l.c(uri, "");
        Iterator<T> it = a().iterator();
        while (it.hasNext()) {
            try {
                it.next().b(this, uri);
            } catch (as unused) {
            }
        }
    }

    private d(T t, ViewGroup.LayoutParams layoutParams) {
        l.c(t, "");
        this.f33078a = t;
        this.f33079b = layoutParams;
        this.f33080c = new LinkedHashSet();
    }

    public final void a(Uri uri, Throwable th) {
        l.c(uri, "");
        l.c(th, "");
        Iterator<T> it = a().iterator();
        while (it.hasNext()) {
            try {
                it.next().a(this, uri, th);
            } catch (as unused) {
            }
        }
    }
}
