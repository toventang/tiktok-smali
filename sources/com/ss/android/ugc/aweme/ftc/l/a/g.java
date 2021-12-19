package com.ss.android.ugc.aweme.ftc.l.a;

import android.app.Activity;
import android.graphics.drawable.Drawable;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import com.bytedance.covode.number.Covode;
import com.bytedance.scene.j;
import com.ss.android.ugc.aweme.ftc.l.a.i;
import com.ss.android.ugc.aweme.port.in.i;
import com.ss.android.ugc.aweme.shortvideo.ap;
import com.ss.android.ugc.aweme.shortvideo.dh;
import com.ss.android.ugc.aweme.shortvideo.en;
import com.ss.android.ugc.tools.utils.q;
import com.zhiliaoapp.musically.R;
import h.f.b.l;
import h.f.b.m;
import h.h;
import h.z;
import java.util.List;
import java.util.Objects;

public final class g extends j {

    /* renamed from: c  reason: collision with root package name */
    public static final a f98718c = new a((byte) 0);

    /* renamed from: a  reason: collision with root package name */
    public b f98719a;

    /* renamed from: b  reason: collision with root package name */
    public final int f98720b = en.a(32.0d, i.f115645a);

    /* renamed from: d  reason: collision with root package name */
    private RecyclerView f98721d;

    /* renamed from: e  reason: collision with root package name */
    private final h f98722e = h.i.a((h.f.a.a) new c(this));

    /* renamed from: f  reason: collision with root package name */
    private final i f98723f;

    /* renamed from: g  reason: collision with root package name */
    private final com.bytedance.als.g<Boolean> f98724g;

    static {
        Covode.recordClassIndex(62782);
    }

    private final i.a b() {
        return (i.a) this.f98722e.getValue();
    }

    public static final class a {
        static {
            Covode.recordClassIndex(62783);
        }

        private a() {
        }

        public /* synthetic */ a(byte b2) {
            this();
        }
    }

    static final class c extends m implements h.f.a.a<a> {
        final /* synthetic */ g this$0;

        static {
            Covode.recordClassIndex(62785);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        c(g gVar) {
            super(0);
            this.this$0 = gVar;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        @Override // h.f.a.a
        public final /* synthetic */ a invoke() {
            return new a(new h.f.a.a<z>(this) {
                /* class com.ss.android.ugc.aweme.ftc.l.a.g.c.AnonymousClass1 */
                final /* synthetic */ c this$0;

                static {
                    Covode.recordClassIndex(62786);
                }

                {
                    this.this$0 = r2;
                }

                /* Return type fixed from 'java.lang.Object' to match base method */
                @Override // h.f.a.a
                public final /* synthetic */ z invoke() {
                    b bVar = this.this$0.this$0.f98719a;
                    if (bVar == null) {
                        l.a("toolbarAdapter");
                    }
                    bVar.a(this.this$0.this$0.a());
                    return z.f158842a;
                }
            });
        }
    }

    @Override // com.bytedance.scene.j
    public final void n_() {
        super.n_();
        this.f98723f.b(b());
    }

    public final List<com.ss.android.ugc.gamora.recorder.n.b> a() {
        return h.a(this.f98723f.a(), this.f98723f.c(), this.f98723f.b());
    }

    static final class b<T> implements com.bytedance.als.m {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ g f98725a;

        static {
            Covode.recordClassIndex(62784);
        }

        b(g gVar) {
            this.f98725a = gVar;
        }

        @Override // androidx.lifecycle.u, com.bytedance.als.m
        public final /* synthetic */ void onChanged(Object obj) {
            if (obj != null) {
                View view = this.f98725a.n;
                l.b(view, "");
                ViewGroup.LayoutParams layoutParams = view.getLayoutParams();
                Objects.requireNonNull(layoutParams, "null cannot be cast to non-null type android.widget.FrameLayout.LayoutParams");
                FrameLayout.LayoutParams layoutParams2 = (FrameLayout.LayoutParams) layoutParams;
                int i2 = this.f98725a.f98720b;
                Activity activity = this.f98725a.f42913m;
                if (activity == null) {
                    l.b();
                }
                layoutParams2.topMargin = i2 + dh.c(activity);
                View view2 = this.f98725a.n;
                l.b(view2, "");
                view2.setLayoutParams(layoutParams2);
                StringBuilder append = new StringBuilder("receive topMarginUpdate in RecordToolbarScene,now margin is:").append(layoutParams2.topMargin).append(",top is:");
                View view3 = this.f98725a.n;
                l.b(view3, "");
                q.a(append.append(view3.getTop()).toString());
            }
        }
    }

    @Override // com.bytedance.scene.j
    public final void a(Bundle bundle) {
        super.a(bundle);
        View c2 = c(R.id.djq);
        l.b(c2, "");
        RecyclerView recyclerView = (RecyclerView) c2;
        this.f98721d = recyclerView;
        if (recyclerView == null) {
            l.a("toolbarRecyclerView");
        }
        t();
        recyclerView.setLayoutManager(new LinearLayoutManager(1, false));
        this.f98719a = new b(a());
        RecyclerView recyclerView2 = this.f98721d;
        if (recyclerView2 == null) {
            l.a("toolbarRecyclerView");
        }
        b bVar = this.f98719a;
        if (bVar == null) {
            l.a("toolbarAdapter");
        }
        recyclerView2.setAdapter(bVar);
        ap apVar = new ap(t());
        Drawable a2 = androidx.core.content.b.a(t(), (int) R.drawable.ha);
        if (a2 == null) {
            l.b();
        }
        apVar.a(a2);
        RecyclerView recyclerView3 = this.f98721d;
        if (recyclerView3 == null) {
            l.a("toolbarRecyclerView");
        }
        recyclerView3.a(apVar);
        this.f98724g.a(this, new b(this));
        this.f98723f.a(b());
    }

    @Override // com.bytedance.scene.j
    public final View a(LayoutInflater layoutInflater, ViewGroup viewGroup) {
        l.d(layoutInflater, "");
        l.d(viewGroup, "");
        View a2 = com.a.a(layoutInflater, R.layout.a3c, viewGroup, false);
        l.b(a2, "");
        return a2;
    }

    public g(i iVar, com.bytedance.als.g<Boolean> gVar) {
        l.d(iVar, "");
        l.d(gVar, "");
        this.f98723f = iVar;
        this.f98724g = gVar;
    }
}
