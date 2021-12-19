package com.ss.android.ugc.aweme.homepage.ui.view.tab;

import android.view.View;
import androidx.fragment.app.e;
import androidx.lifecycle.ac;
import androidx.lifecycle.ad;
import androidx.lifecycle.ae;
import com.bytedance.covode.number.Covode;
import com.ss.android.ugc.aweme.by;
import h.f.b.l;
import java.util.HashMap;
import java.util.List;

public final class HomeTabViewModel extends ac {

    /* renamed from: b  reason: collision with root package name */
    public static final a f99528b = new a((byte) 0);

    /* renamed from: a  reason: collision with root package name */
    public final HashMap<String, by> f99529a = new HashMap<>();

    /* renamed from: c  reason: collision with root package name */
    private final e f99530c;

    /* renamed from: d  reason: collision with root package name */
    private final HashMap<by, View> f99531d = new HashMap<>();

    /* renamed from: e  reason: collision with root package name */
    private List<? extends by> f99532e;

    /* renamed from: f  reason: collision with root package name */
    private List<? extends by> f99533f;

    static {
        Covode.recordClassIndex(63477);
    }

    public static final class a {
        static {
            Covode.recordClassIndex(63478);
        }

        private a() {
        }

        /* renamed from: com.ss.android.ugc.aweme.homepage.ui.view.tab.HomeTabViewModel$a$a  reason: collision with other inner class name */
        public static final class C2435a implements ad.b {

            /* renamed from: a  reason: collision with root package name */
            final /* synthetic */ e f99534a;

            static {
                Covode.recordClassIndex(63479);
            }

            C2435a(e eVar) {
                this.f99534a = eVar;
            }

            @Override // androidx.lifecycle.ad.b
            public final <T extends ac> T a(Class<T> cls) {
                l.d(cls, "");
                return new HomeTabViewModel(this.f99534a);
            }
        }

        public /* synthetic */ a(byte b2) {
            this();
        }

        public static HomeTabViewModel a(e eVar) {
            l.d(eVar, "");
            ac a2 = ae.a(eVar, new C2435a(eVar)).a(HomeTabViewModel.class);
            l.b(a2, "");
            return (HomeTabViewModel) a2;
        }
    }

    /* JADX DEBUG: Type inference failed for r0v1. Raw type applied. Possible types: java.util.List<? extends com.ss.android.ugc.aweme.by>, java.util.List<com.ss.android.ugc.aweme.by> */
    public final List<by> a() {
        if (this.f99532e == null) {
            this.f99532e = a.f99535a.a(this.f99530c);
        }
        List list = this.f99532e;
        if (list == null) {
            l.b();
        }
        return list;
    }

    /* JADX DEBUG: Type inference failed for r0v1. Raw type applied. Possible types: java.util.List<? extends com.ss.android.ugc.aweme.by>, java.util.List<com.ss.android.ugc.aweme.by> */
    public final List<by> b() {
        if (this.f99533f == null) {
            this.f99533f = b.f99536a.a(this.f99530c);
        }
        List list = this.f99533f;
        if (list == null) {
            l.b();
        }
        return list;
    }

    public final <T extends View> T a(by byVar) {
        View view = this.f99531d.get(byVar);
        if (!(view instanceof View)) {
            view = null;
        }
        return (T) view;
    }

    public HomeTabViewModel(e eVar) {
        if (eVar == null) {
            l.b();
        }
        this.f99530c = eVar;
    }

    public final <T extends by> T a(String str) {
        l.d(str, "");
        by byVar = this.f99529a.get(str);
        if (!(byVar instanceof by)) {
            byVar = null;
        }
        return (T) byVar;
    }

    public final <T extends View> T b(String str) {
        View view = this.f99531d.get(this.f99529a.get(str));
        if (!(view instanceof View)) {
            view = null;
        }
        return (T) view;
    }

    public final void a(by byVar, View view) {
        l.d(view, "");
        this.f99531d.put(byVar, view);
    }

    public final void a(String str, by byVar) {
        l.d(str, "");
        this.f99529a.put(str, byVar);
    }
}
