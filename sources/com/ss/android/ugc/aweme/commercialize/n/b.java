package com.ss.android.ugc.aweme.commercialize.n;

import com.bytedance.covode.number.Covode;
import java.lang.ref.WeakReference;

public final class b implements a {

    /* renamed from: a  reason: collision with root package name */
    public static boolean f74917a;

    /* renamed from: b  reason: collision with root package name */
    public static final b f74918b = new b();

    /* renamed from: c  reason: collision with root package name */
    private static WeakReference<a> f74919c;

    private b() {
    }

    static {
        Covode.recordClassIndex(46197);
    }

    public static final a c() {
        WeakReference<a> weakReference = f74919c;
        if (weakReference != null) {
            return weakReference.get();
        }
        return null;
    }

    @Override // com.ss.android.ugc.aweme.commercialize.n.a
    public final void b() {
        a c2 = c();
        if (c2 != null) {
            c2.b();
        }
    }

    @Override // com.ss.android.ugc.aweme.commercialize.n.a
    public final void a() {
        a c2 = c();
        if (c2 != null) {
            c2.a();
        }
    }

    public static final void a(a aVar) {
        WeakReference<a> weakReference;
        if (aVar == null) {
            weakReference = null;
        } else {
            weakReference = new WeakReference<>(aVar);
        }
        f74919c = weakReference;
    }
}
