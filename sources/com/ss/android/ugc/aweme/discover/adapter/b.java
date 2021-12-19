package com.ss.android.ugc.aweme.discover.adapter;

import android.app.Activity;
import android.content.Context;
import android.view.View;
import androidx.recyclerview.widget.RecyclerView;
import com.bytedance.covode.number.Covode;
import com.ss.android.ugc.aweme.base.utils.o;
import com.ss.android.ugc.aweme.discover.mob.j;
import com.ss.android.ugc.aweme.feed.model.LogPbBean;
import com.ss.android.ugc.aweme.search.k.bh;
import com.ss.android.ugc.aweme.search.k.p;
import h.f.b.l;
import h.f.b.m;
import h.f.b.r;
import h.h;
import h.h.c;
import h.h.e;
import h.k.i;
import java.util.Objects;

public abstract class b extends RecyclerView.ViewHolder implements View.OnAttachStateChangeListener, p {

    /* renamed from: j  reason: collision with root package name */
    static final /* synthetic */ i[] f80421j = {new r(b.class, "_itemMobParam", "get_itemMobParam()Lcom/ss/android/ugc/aweme/search/mob/ItemMobParam;", 0)};

    /* renamed from: a  reason: collision with root package name */
    private final e f80422a = new a(this);

    /* renamed from: b  reason: collision with root package name */
    private final h f80423b;

    /* renamed from: k  reason: collision with root package name */
    public boolean f80424k = true;

    /* renamed from: l  reason: collision with root package name */
    public boolean f80425l;

    static {
        Covode.recordClassIndex(50060);
    }

    private final com.ss.android.ugc.aweme.search.k.r a() {
        return (com.ss.android.ugc.aweme.search.k.r) this.f80422a.a(this, f80421j[0]);
    }

    /* access modifiers changed from: protected */
    public void E() {
    }

    /* renamed from: com.ss.android.ugc.aweme.discover.adapter.b$b  reason: collision with other inner class name */
    static final class C1875b extends m implements h.f.a.a<com.ss.android.ugc.aweme.autoplay.c.a> {
        final /* synthetic */ View $itemView;

        static {
            Covode.recordClassIndex(50062);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C1875b(View view) {
            super(0);
            this.$itemView = view;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        @Override // h.f.a.a
        public final /* synthetic */ com.ss.android.ugc.aweme.autoplay.c.a invoke() {
            return new com.ss.android.ugc.aweme.autoplay.c.a(this.$itemView);
        }
    }

    public View I() {
        View view = this.itemView;
        l.b(view, "");
        return view;
    }

    public final Context G() {
        View view = this.itemView;
        l.b(view, "");
        Context context = view.getContext();
        l.b(context, "");
        return context;
    }

    public final androidx.fragment.app.e H() {
        Activity d2 = o.d(I());
        Objects.requireNonNull(d2, "null cannot be cast to non-null type androidx.fragment.app.FragmentActivity");
        return (androidx.fragment.app.e) d2;
    }

    @Override // com.ss.android.ugc.aweme.search.k.p
    public final com.ss.android.ugc.aweme.search.k.r F() {
        com.ss.android.ugc.aweme.search.k.r a2 = a();
        if (a2 != null) {
            return a2;
        }
        View view = this.itemView;
        l.b(view, "");
        return j.a.a(view);
    }

    public static final class a extends c<com.ss.android.ugc.aweme.search.k.r> {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ Object f80426a = null;

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ b f80427b;

        static {
            Covode.recordClassIndex(50061);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public a(b bVar) {
            super(null);
            this.f80427b = bVar;
        }

        @Override // h.h.c
        public final void a(i<?> iVar, com.ss.android.ugc.aweme.search.k.r rVar, com.ss.android.ugc.aweme.search.k.r rVar2) {
            String str;
            LogPbBean logPbBean;
            LogPbBean logPbBean2;
            l.d(iVar, "");
            com.ss.android.ugc.aweme.search.k.r rVar3 = rVar2;
            com.ss.android.ugc.aweme.search.k.r rVar4 = rVar;
            String str2 = null;
            if (rVar4 == null || (logPbBean2 = rVar4.f121276k) == null) {
                str = null;
            } else {
                str = logPbBean2.getImprId();
            }
            if (!(rVar3 == null || (logPbBean = rVar3.f121276k) == null)) {
                str2 = logPbBean.getImprId();
            }
            if (!h.m.p.a(str, str2, false)) {
                this.f80427b.f80424k = true;
                this.f80427b.E();
            }
        }
    }

    @Override // com.ss.android.ugc.aweme.search.k.p
    public final void a(com.ss.android.ugc.aweme.search.k.r rVar) {
        l.d(rVar, "");
        this.f80422a.a(f80421j[0], rVar);
        View view = this.itemView;
        l.b(view, "");
        j.a.a(view, F());
    }

    public void onViewAttachedToWindow(View view) {
        l.d(view, "");
        View view2 = this.itemView;
        l.b(view2, "");
        j.a.a(view2, F());
        this.f80425l = true;
    }

    public void onViewDetachedFromWindow(View view) {
        l.d(view, "");
        View view2 = this.itemView;
        l.b(view2, "");
        j.a.b(view2);
        com.ss.android.ugc.aweme.search.r.b.a(null);
        this.f80425l = false;
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public b(View view) {
        super(view);
        l.d(view, "");
        view.addOnAttachStateChangeListener(this);
        this.f80423b = h.i.a((h.f.a.a) new C1875b(view));
    }

    public final void a(String str) {
        String str2 = "";
        l.d(str, str2);
        bh bhVar = new bh(str, F());
        String str3 = F().t;
        if (str3 == null) {
            str3 = "else";
        }
        bhVar.a("use_scenario", str3);
        String str4 = F().f121275j;
        if (str4 != null) {
            str2 = str4;
        }
        bhVar.a("search_id", str2);
        String str5 = F().f121272g;
        if (str5 == null) {
            str5 = "general";
        }
        bhVar.a("search_type", str5);
        bhVar.f();
    }
}
