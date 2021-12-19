package com.ss.android.ugc.aweme.discover.ui;

import android.util.SparseArray;
import android.view.View;
import androidx.fragment.app.e;
import com.bytedance.covode.number.Covode;
import com.ss.android.ugc.aweme.keyword.SearchKeywordPresenter;
import com.ss.android.ugc.aweme.keyword.a;
import com.ss.android.ugc.aweme.lego.c.a;
import com.ss.android.ugc.aweme.search.model.d;
import h.f.b.l;
import h.f.b.m;
import h.h;
import h.i;

public abstract class am extends com.ss.android.ugc.aweme.base.f.a implements a.AbstractC2762a {
    public static final String F = "SearchFragment";
    public static final String G = "search_key";
    public static final int H = 0;
    public static final int I = 2483;
    public static final a J = new a((byte) 0);
    public String A = "";
    public int B;
    public int C = 1;
    public com.ss.android.ugc.aweme.search.g.b D;
    public boolean E = true;

    /* renamed from: a  reason: collision with root package name */
    private final h f82290a = i.a((h.f.a.a) new b(this));

    /* renamed from: b  reason: collision with root package name */
    private String f82291b = "";

    /* renamed from: c  reason: collision with root package name */
    private boolean f82292c;

    /* renamed from: d  reason: collision with root package name */
    private SparseArray f82293d;
    public final com.ss.android.ugc.aweme.search.n.b p = new com.ss.android.ugc.aweme.search.n.b();
    public final com.ss.android.ugc.aweme.search.n.h q = new com.ss.android.ugc.aweme.search.n.h(0, null, null, null, null, 31, null);
    public d r;
    public d s;
    public int t;
    public String u = "";
    public String v = "";
    public String w = "";
    public String y = "";
    public String z = "";

    public View a(int i2) {
        if (this.f82293d == null) {
            this.f82293d = new SparseArray();
        }
        View view = (View) this.f82293d.get(i2);
        if (view != null) {
            return view;
        }
        View view2 = getView();
        if (view2 == null) {
            return null;
        }
        View findViewById = view2.findViewById(i2);
        this.f82293d.put(i2, findViewById);
        return findViewById;
    }

    public void a(d dVar) {
        l.d(dVar, "");
    }

    public void aT_() {
        SparseArray sparseArray = this.f82293d;
        if (sparseArray != null) {
            sparseArray.clear();
        }
    }

    public abstract String c();

    public an e() {
        return null;
    }

    @Override // com.bytedance.ies.uikit.a.b, androidx.fragment.app.Fragment, com.ss.android.ugc.aweme.base.f.a
    public /* synthetic */ void onDestroyView() {
        super.onDestroyView();
        aT_();
    }

    /* access modifiers changed from: protected */
    public final a.AbstractC2689a v() {
        return (a.AbstractC2689a) this.f82290a.getValue();
    }

    public static final class a {
        static {
            Covode.recordClassIndex(51221);
        }

        private a() {
        }

        public /* synthetic */ a(byte b2) {
            this();
        }
    }

    public boolean r() {
        return this.f82292c;
    }

    public final String u() {
        return v().a().f105233a;
    }

    static final class b extends m implements h.f.a.a<a.AbstractC2689a> {
        final /* synthetic */ am this$0;

        static {
            Covode.recordClassIndex(51222);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        b(am amVar) {
            super(0);
            this.this$0 = amVar;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        @Override // h.f.a.a
        public final /* synthetic */ a.AbstractC2689a invoke() {
            e activity = this.this$0.getActivity();
            if (activity == null) {
                l.b();
            }
            l.b(activity, "");
            return new SearchKeywordPresenter(activity);
        }
    }

    static {
        Covode.recordClassIndex(51220);
    }

    public final void c(String str) {
        l.d(str, "");
        this.u = str;
    }

    public final void d(String str) {
        l.d(str, "");
        this.v = str;
    }

    /* access modifiers changed from: protected */
    public final void e(String str) {
        l.d(str, "");
        this.w = str;
    }

    /* access modifiers changed from: protected */
    public final void f(String str) {
        l.d(str, "");
        this.y = str;
    }

    /* access modifiers changed from: protected */
    public final void g(String str) {
        l.d(str, "");
        this.z = str;
    }

    public final void b(String str) {
        l.d(str, "");
        v().a(new com.ss.android.ugc.aweme.keyword.b(str, null, 2));
    }
}
