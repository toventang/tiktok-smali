package com.ss.android.ugc.aweme.sticker.view.internal.search;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewParent;
import androidx.lifecycle.LiveData;
import androidx.lifecycle.u;
import androidx.recyclerview.widget.LinearLayoutManager;
import com.bytedance.covode.number.Covode;
import com.bytedance.frameworks.apm.trace.MethodCollector;
import com.ss.android.ugc.aweme.sticker.view.internal.search.f;
import com.ss.android.ugc.aweme.sticker.view.internal.search.m;
import f.a.d.f;
import f.a.t;
import h.p;
import h.z;

public final class l extends com.ss.android.ugc.aweme.sticker.view.internal.pager.pages.a<com.ss.android.ugc.aweme.sticker.view.internal.pager.a.b> {
    public static final a q = new a((byte) 0);

    /* renamed from: l  reason: collision with root package name */
    SearchStickerViewContainer f136584l;

    /* renamed from: m  reason: collision with root package name */
    a f136585m;
    LiveData<z> n;
    public h.f.a.a<z> o;
    public boolean p;
    private f.a.b.b r;

    static {
        Covode.recordClassIndex(89205);
    }

    @Override // com.ss.android.ugc.aweme.sticker.view.internal.pager.pages.a
    public final void k() {
    }

    public static final class a {
        static {
            Covode.recordClassIndex(89206);
        }

        private a() {
        }

        public /* synthetic */ a(byte b2) {
            this();
        }
    }

    private final boolean o() {
        if (this.f136584l == null || this.f136585m == null || this.n == null) {
            return true;
        }
        return false;
    }

    @Override // androidx.fragment.app.Fragment
    public final void onStop() {
        super.onStop();
        f.a.b.b bVar = this.r;
        if (bVar != null) {
            bVar.dispose();
        }
    }

    public final SearchStickerViewContainer n() {
        SearchStickerViewContainer searchStickerViewContainer = this.f136584l;
        if (searchStickerViewContainer != null) {
            return searchStickerViewContainer;
        }
        throw new IllegalArgumentException("Required value was null.".toString());
    }

    @Override // androidx.fragment.app.Fragment
    public final void onStart() {
        super.onStart();
        if (!o()) {
            n().n();
            t<p<Integer, Integer>> tVar = g().f136204g;
            if (tVar != null) {
                this.r = tVar.d(new b(this));
            }
            LiveData<z> liveData = this.n;
            if (liveData != null) {
                liveData.observe(this, new c(this));
                return;
            }
            throw new IllegalArgumentException("Required value was null.".toString());
        }
    }

    static final class c<T> implements u<z> {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ l f136587a;

        static {
            Covode.recordClassIndex(89208);
        }

        c(l lVar) {
            this.f136587a = lVar;
        }

        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
        @Override // androidx.lifecycle.u
        public final /* synthetic */ void onChanged(z zVar) {
            this.f136587a.p = true;
            this.f136587a.d().a(this.f136587a.f136430e);
        }
    }

    @Override // com.ss.android.ugc.aweme.sticker.view.internal.pager.pages.a
    public final LinearLayoutManager a(View view) {
        h.f.b.l.d(view, "");
        LinearLayoutManager linearLayoutManager = n().s;
        if (linearLayoutManager == null) {
            return new LinearLayoutManager();
        }
        return linearLayoutManager;
    }

    static final class b<T> implements f<p<? extends Integer, ? extends Integer>> {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ l f136586a;

        static {
            Covode.recordClassIndex(89207);
        }

        b(l lVar) {
            this.f136586a = lVar;
        }

        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
        @Override // f.a.d.f
        public final /* synthetic */ void accept(p<? extends Integer, ? extends Integer> pVar) {
            String str;
            p<? extends Integer, ? extends Integer> pVar2 = pVar;
            if (((Number) pVar2.getSecond()).intValue() == this.f136586a.f136430e) {
                a aVar = this.f136586a.f136585m;
                if (aVar == null) {
                    throw new IllegalArgumentException("Required value was null.".toString());
                } else if (h.f.b.l.a(aVar.c(), m.a.f136588a)) {
                    SearchStickerViewContainer n = this.f136586a.n();
                    if (this.f136586a.p) {
                        str = "click_icon";
                    } else {
                        str = "slide";
                    }
                    n.a(new f.b(str));
                    h.f.a.a<z> aVar2 = this.f136586a.o;
                    if (aVar2 != null) {
                        aVar2.invoke();
                    }
                    this.f136586a.p = false;
                }
            }
            if (((Number) pVar2.getSecond()).intValue() == this.f136586a.f136430e) {
                this.f136586a.n();
            }
            if (((Number) pVar2.getFirst()).intValue() == this.f136586a.f136430e) {
                this.f136586a.n();
            }
        }
    }

    @Override // androidx.fragment.app.Fragment, com.ss.android.ugc.aweme.sticker.view.internal.pager.pages.a
    public final View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        MethodCollector.i(11070);
        h.f.b.l.d(layoutInflater, "");
        if (o()) {
            MethodCollector.o(11070);
            return null;
        }
        if (n().v.getParent() != null) {
            ViewParent parent = n().v.getParent();
            if (parent != null) {
                ((ViewGroup) parent).removeView(n().v);
            } else {
                NullPointerException nullPointerException = new NullPointerException("null cannot be cast to non-null type android.view.ViewGroup");
                MethodCollector.o(11070);
                throw nullPointerException;
            }
        }
        View view = n().v;
        MethodCollector.o(11070);
        return view;
    }
}
