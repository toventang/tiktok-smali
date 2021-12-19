package com.ss.android.ugc.aweme.ad.utils;

import android.graphics.Rect;
import android.view.View;
import android.view.ViewParent;
import androidx.core.h.v;
import com.bytedance.covode.number.Covode;
import com.bytedance.ies.ugc.appcontext.f;
import com.ss.android.ugc.aweme.commercialize_x.service.CommercializeAdServiceImpl;
import h.f.b.l;
import h.f.b.m;
import h.h;
import h.i;

public final class d {

    /* renamed from: a  reason: collision with root package name */
    public static final d f66167a = new d();

    /* renamed from: b  reason: collision with root package name */
    private static final h f66168b = i.a((h.f.a.a) a.f66169a);

    private static com.ss.android.ugc.aweme.ad.feed.e.a a() {
        return (com.ss.android.ugc.aweme.ad.feed.e.a) f66168b.getValue();
    }

    private d() {
    }

    /* access modifiers changed from: package-private */
    public static final class b implements Runnable {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ View f66170a;

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ Runnable f66171b;

        static {
            Covode.recordClassIndex(40679);
        }

        b(View view, Runnable runnable) {
            this.f66170a = view;
            this.f66171b = runnable;
        }

        public final void run() {
            d.a(this.f66170a, this.f66171b);
        }
    }

    static final class a extends m implements h.f.a.a<com.ss.android.ugc.aweme.ad.feed.e.a> {

        /* renamed from: a  reason: collision with root package name */
        public static final a f66169a = new a();

        static {
            Covode.recordClassIndex(40678);
        }

        a() {
            super(0);
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        @Override // h.f.a.a
        public final /* synthetic */ com.ss.android.ugc.aweme.ad.feed.e.a invoke() {
            return CommercializeAdServiceImpl.a().a(4);
        }
    }

    static {
        Covode.recordClassIndex(40677);
    }

    private static boolean a(View view) {
        if (view == null || !v.y(view)) {
            return false;
        }
        return true;
    }

    private static boolean c(View view) {
        l.d(view, "");
        Rect rect = new Rect();
        if (!b(view) || !view.getGlobalVisibleRect(rect) || rect.isEmpty()) {
            return false;
        }
        return true;
    }

    private static boolean b(View view) {
        l.d(view, "");
        if (!a(view)) {
            return false;
        }
        while (view.getVisibility() == 0 && view.getAlpha() >= 1.0E-6f) {
            if (view.getId() == 16908290) {
                return true;
            }
            ViewParent parent = view.getParent();
            if (!(parent instanceof View)) {
                return true;
            }
            view = (View) parent;
        }
        return false;
    }

    public static final void a(View view, Runnable runnable) {
        com.ss.android.ugc.aweme.ad.feed.e.a a2;
        l.d(view, "");
        if (runnable == null || !a(view)) {
            return;
        }
        if (!c(view) || f.f34637l || (a2 = a()) == null || !a2.a(view.getContext())) {
            view.postDelayed(new b(view, runnable), 100);
        } else {
            runnable.run();
        }
    }
}
