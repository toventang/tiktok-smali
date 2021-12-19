package com.ss.android.ugc.aweme.favorites.ui;

import android.graphics.Rect;
import android.os.Bundle;
import android.text.TextUtils;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import com.bytedance.covode.number.Covode;
import com.bytedance.tux.status.TuxStatusView;
import com.ss.android.ugc.aweme.base.utils.f;
import com.ss.android.ugc.aweme.common.a.f;
import com.ss.android.ugc.aweme.common.a.h;
import com.ss.android.ugc.aweme.common.e.b;
import com.ss.android.ugc.aweme.common.e.c;
import com.ss.android.ugc.aweme.common.e.d;
import com.ss.android.ugc.aweme.common.e.i;
import com.ss.android.ugc.aweme.favorites.i.a;
import com.ss.android.ugc.aweme.feed.n.o;
import com.ss.android.ugc.aweme.lancet.j;
import com.ss.android.ugc.aweme.profile.ui.cs;
import com.ss.android.ugc.aweme.utils.gc;
import com.ss.android.ugc.aweme.views.WrapLinearLayoutManager;
import com.zhiliaoapp.musically.R;
import java.util.Collection;
import java.util.List;

public abstract class a extends cs implements c, d, o {

    /* renamed from: a  reason: collision with root package name */
    RecyclerView f90808a;

    /* renamed from: b  reason: collision with root package name */
    TuxStatusView f90809b;

    /* renamed from: c  reason: collision with root package name */
    f f90810c;

    /* renamed from: d  reason: collision with root package name */
    protected String f90811d;

    /* renamed from: e  reason: collision with root package name */
    protected boolean f90812e = true;

    /* renamed from: j  reason: collision with root package name */
    public b<com.ss.android.ugc.aweme.common.e.a> f90813j;

    /* renamed from: k  reason: collision with root package name */
    private boolean f90814k = true;

    static {
        Covode.recordClassIndex(57062);
    }

    @Override // com.ss.android.ugc.aweme.common.e.c
    public final void a(Exception exc) {
    }

    @Override // com.ss.android.ugc.aweme.common.e.d
    public final boolean a(i iVar) {
        return false;
    }

    @Override // com.ss.android.ugc.aweme.common.e.c
    public final void bh_() {
    }

    /* access modifiers changed from: protected */
    public abstract void c();

    @Override // com.ss.android.ugc.aweme.common.e.c
    public final void c(List list, boolean z) {
    }

    /* access modifiers changed from: protected */
    public abstract void k();

    /* access modifiers changed from: protected */
    public abstract void l();

    /* access modifiers changed from: protected */
    public abstract f n();

    @Override // com.ss.android.ugc.aweme.feed.n.o
    public final void aS_() {
        k();
    }

    @Override // com.ss.android.ugc.aweme.profile.c.a
    public final void bM_() {
        o();
    }

    @Override // com.ss.android.ugc.aweme.feed.n.o
    public final boolean bi_() {
        return this.f90814k;
    }

    @Override // com.ss.android.ugc.aweme.profile.c.a
    public final boolean cb_() {
        return this.f90812e;
    }

    @Override // com.ss.android.ugc.aweme.base.f.a, com.bytedance.ies.uikit.a.b, androidx.fragment.app.Fragment
    public void onDestroyView() {
        super.onDestroyView();
        this.f90812e = true;
    }

    private static boolean a() {
        try {
            return f.a.f68431a.c();
        } catch (Exception unused) {
            return false;
        }
    }

    @Override // com.ss.android.ugc.aweme.common.e.c
    public final void aO_() {
        if (ab_()) {
            this.f90810c.ag_();
        }
    }

    @Override // com.ss.android.ugc.aweme.common.e.c
    public final void b() {
        if (ab_()) {
            this.f90809b.a();
        }
    }

    @Override // com.ss.android.ugc.aweme.common.widget.scrollablelayout.a.AbstractC1744a
    public final View m() {
        if (!ab_()) {
            return null;
        }
        return this.f90808a;
    }

    /* access modifiers changed from: protected */
    public void p() {
        com.ss.android.ugc.aweme.common.a.f n = n();
        this.f90810c = n;
        this.f90808a.setAdapter(n);
    }

    @Override // com.ss.android.ugc.aweme.profile.ui.cs
    public void s() {
        b<com.ss.android.ugc.aweme.common.e.a> bVar = this.f90813j;
        if (bVar != null && bVar.f76396h != null) {
            this.f90813j.c();
        }
    }

    @Override // com.ss.android.ugc.aweme.common.e.c
    public void f() {
        if (ab_()) {
            q();
            this.f90808a.setVisibility(4);
        }
    }

    /* access modifiers changed from: protected */
    public void q() {
        TuxStatusView.c cVar = new TuxStatusView.c();
        cVar.a((CharSequence) getString(R.string.bnb));
        this.f90809b.setStatus(cVar);
        this.f90809b.setVisibility(0);
    }

    @Override // com.ss.android.ugc.aweme.profile.ui.cs
    public final void g() {
        RecyclerView recyclerView;
        LinearLayoutManager linearLayoutManager;
        View childAt;
        if (!(!getUserVisibleHint() || (recyclerView = this.f90808a) == null || (linearLayoutManager = (LinearLayoutManager) recyclerView.getLayoutManager()) == null)) {
            int k2 = linearLayoutManager.k();
            int m2 = linearLayoutManager.m();
            for (int i2 = k2; i2 <= m2; i2++) {
                if (i2 >= 0 && i2 < linearLayoutManager.A() && (childAt = this.f90808a.getChildAt(i2 - k2)) != null && this.f90808a.a(childAt) != null && (this.f90808a.a(childAt) instanceof a.AbstractC2193a)) {
                    ((a.AbstractC2193a) this.f90808a.a(childAt)).c();
                }
            }
        }
    }

    public final boolean o() {
        if (!ab_()) {
            return false;
        }
        getActivity();
        if (!j.f107229h || !j.b() || j.c()) {
            j.f107229h = a();
        }
        if (!j.f107229h) {
            if (!this.f90812e) {
                new com.bytedance.tux.g.b(this).e(R.string.de8).b();
            }
            this.f90812e = true;
            return false;
        }
        this.f90812e = false;
        this.f90809b.a();
        boolean z = !this.f90813j.j();
        if (TextUtils.isEmpty(this.f90811d)) {
            this.f90811d = com.ss.android.ugc.aweme.account.b.g().getCurUserId();
        }
        if (!TextUtils.isEmpty(this.f90811d)) {
            c();
        }
        return z;
    }

    @Override // com.ss.android.ugc.b.a.a.a, com.ss.android.ugc.aweme.base.f.a, com.bytedance.ies.uikit.a.b, androidx.fragment.app.Fragment
    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
    }

    @Override // com.ss.android.ugc.aweme.common.e.c
    public final void c(Exception exc) {
        if (ab_()) {
            this.f90810c.i();
        }
    }

    @Override // com.ss.android.ugc.aweme.feed.n.o
    public final void a(boolean z) {
        if (!z) {
            this.f90810c.a((h.a) null);
            this.f90810c.k();
            this.f90810c.d(false);
        }
    }

    @Override // com.ss.android.ugc.aweme.common.e.d
    public final void b(int i2) {
        if (ab_()) {
            this.f90810c.notifyItemRemoved(i2);
            if (this.f90810c.c() == 0) {
                q();
            }
        }
    }

    /* access modifiers changed from: protected */
    public void a(View view) {
        this.f90808a = (RecyclerView) view.findViewById(R.id.a8i);
        this.f90809b = (TuxStatusView) view.findViewById(R.id.e_o);
        this.f90808a.setOverScrollMode(2);
        getActivity();
        WrapLinearLayoutManager wrapLinearLayoutManager = new WrapLinearLayoutManager();
        wrapLinearLayoutManager.b(1);
        this.f90808a.setLayoutManager(wrapLinearLayoutManager);
        this.f90808a.a(new C2196a());
        this.f90808a = gc.a(this.f90808a, this, 2);
    }

    @Override // com.ss.android.ugc.aweme.common.e.c
    public final void b(Exception exc) {
        if (ab_()) {
            this.f90809b.setVisibility(0);
            this.f90809b.setStatus(com.ss.android.ugc.aweme.tux.a.g.a.a(new TuxStatusView.c(), new b(this)));
            this.f90812e = true;
        }
    }

    @Override // com.ss.android.ugc.aweme.base.f.a, com.bytedance.ies.uikit.a.b, androidx.fragment.app.Fragment
    public void onViewCreated(View view, Bundle bundle) {
        super.onViewCreated(view, bundle);
        a(view);
        p();
        b<com.ss.android.ugc.aweme.common.e.a> bVar = new b<>();
        this.f90813j = bVar;
        bVar.a_(this);
        this.f90813j.a((d) this);
        l();
        if (this.N) {
            o();
        }
    }

    @Override // com.ss.android.ugc.aweme.common.e.d
    public final void a(List list, int i2) {
        if (!ab_() || com.bytedance.common.utility.collection.b.a((Collection) list)) {
            return;
        }
        if (this.f90810c.c() == 0) {
            this.f90810c.b_(list);
            return;
        }
        this.f90810c.notifyItemInserted(i2);
        RecyclerView recyclerView = this.f90808a;
        if (recyclerView != null) {
            recyclerView.post(new Runnable() {
                /* class com.ss.android.ugc.aweme.favorites.ui.a.AnonymousClass1 */

                static {
                    Covode.recordClassIndex(57063);
                }

                public final void run() {
                    a.this.f90808a.b(0);
                    a.this.f90808a.requestFocus();
                }
            });
        }
    }

    @Override // com.ss.android.ugc.aweme.common.e.c
    public final void b(List list, boolean z) {
        if (ab_()) {
            this.f90810c.ai_();
            this.f90810c.b(list);
            this.f90809b.setVisibility(4);
            if (this.f90808a.getVisibility() == 4) {
                this.f90808a.setVisibility(0);
            }
            this.f90814k = z;
            a(z);
        }
    }

    @Override // com.ss.android.ugc.aweme.common.e.c
    public void a(List list, boolean z) {
        if (ab_()) {
            this.f90810c.ai_();
            this.f90810c.d(true);
            this.f90810c.b_(list);
            this.f90814k = z;
            this.f90809b.setVisibility(4);
            if (this.f90808a.getVisibility() == 4) {
                this.f90808a.setVisibility(0);
            }
            a(z);
        }
    }

    @Override // com.ss.android.ugc.b.a.a.a, androidx.fragment.app.Fragment
    public View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        return com.a.a(layoutInflater, R.layout.mn, viewGroup, false);
    }

    /* renamed from: com.ss.android.ugc.aweme.favorites.ui.a$a  reason: collision with other inner class name */
    public static class C2196a extends RecyclerView.h {

        /* renamed from: a  reason: collision with root package name */
        private int f90816a = 1;

        static {
            Covode.recordClassIndex(57064);
        }

        @Override // androidx.recyclerview.widget.RecyclerView.h
        public final void getItemOffsets(Rect rect, View view, RecyclerView recyclerView, RecyclerView.s sVar) {
            rect.bottom = this.f90816a;
        }
    }
}
