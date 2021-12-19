package com.ss.android.ugc.gamora.recorder.n.a;

import android.app.Activity;
import android.content.Context;
import android.graphics.drawable.Drawable;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import com.bytedance.als.g;
import com.bytedance.covode.number.Covode;
import com.bytedance.scene.j;
import com.ss.android.ugc.aweme.commentStickerPanel.j;
import com.ss.android.ugc.aweme.property.df;
import com.ss.android.ugc.aweme.property.dt;
import com.ss.android.ugc.aweme.property.u;
import com.ss.android.ugc.aweme.shortvideo.ShortVideoContext;
import com.ss.android.ugc.aweme.shortvideo.ap;
import com.ss.android.ugc.aweme.shortvideo.dh;
import com.ss.android.ugc.aweme.shortvideo.en;
import com.ss.android.ugc.aweme.utils.d;
import com.ss.android.ugc.gamora.recorder.n.a.b;
import com.ss.android.ugc.tools.utils.q;
import com.zhiliaoapp.musically.R;
import h.a.n;
import h.f.b.l;
import h.f.b.m;
import h.h;
import h.z;
import java.util.List;
import java.util.Objects;

public final class i extends j {

    /* renamed from: c  reason: collision with root package name */
    public static final int f148147c = dt.a();

    /* renamed from: d  reason: collision with root package name */
    public static final a f148148d = new a((byte) 0);

    /* renamed from: a  reason: collision with root package name */
    public c f148149a;

    /* renamed from: b  reason: collision with root package name */
    public final int f148150b = en.a(32.0d, com.ss.android.ugc.aweme.port.in.i.f115645a);

    /* renamed from: e  reason: collision with root package name */
    private RecyclerView f148151e;

    /* renamed from: f  reason: collision with root package name */
    private final h f148152f = h.i.a((h.f.a.a) new c(this));

    /* renamed from: g  reason: collision with root package name */
    private final b f148153g;

    /* renamed from: h  reason: collision with root package name */
    private final g<Boolean> f148154h;

    /* renamed from: i  reason: collision with root package name */
    private final ShortVideoContext f148155i;

    private final b.a C() {
        return (b.a) this.f148152f.getValue();
    }

    public static final class a {
        static {
            Covode.recordClassIndex(97652);
        }

        private a() {
        }

        public /* synthetic */ a(byte b2) {
            this();
        }
    }

    static final class c extends m implements h.f.a.a<a> {
        final /* synthetic */ i this$0;

        static {
            Covode.recordClassIndex(97654);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        c(i iVar) {
            super(0);
            this.this$0 = iVar;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        @Override // h.f.a.a
        public final /* synthetic */ a invoke() {
            return new a(new h.f.a.a<z>(this) {
                /* class com.ss.android.ugc.gamora.recorder.n.a.i.c.AnonymousClass1 */
                final /* synthetic */ c this$0;

                static {
                    Covode.recordClassIndex(97655);
                }

                {
                    this.this$0 = r2;
                }

                /* Return type fixed from 'java.lang.Object' to match base method */
                @Override // h.f.a.a
                public final /* synthetic */ z invoke() {
                    this.this$0.this$0.a().a(this.this$0.this$0.d());
                    return z.f158842a;
                }
            });
        }
    }

    public final c a() {
        c cVar = this.f148149a;
        if (cVar == null) {
            l.a("toolbarAdapter");
        }
        return cVar;
    }

    public final void b() {
        View D = D();
        if (D != null && D.getVisibility() == 0) {
            a(D);
        }
    }

    @Override // com.bytedance.scene.j
    public final void n_() {
        super.n_();
        this.f148153g.b(C());
    }

    static {
        Covode.recordClassIndex(97651);
    }

    public final List<com.ss.android.ugc.gamora.recorder.n.b> d() {
        return j.a(this.f148153g.a(), this.f148153g.c(), this.f148153g.b());
    }

    private final View D() {
        int i2 = 0;
        for (T t : this.f148153g.a()) {
            int i3 = i2 + 1;
            if (i2 < 0) {
                n.a();
            }
            if (t.f148158a != 11) {
                i2 = i3;
            } else if (i2 >= this.f148153g.c() - 1) {
                RecyclerView recyclerView = this.f148151e;
                if (recyclerView == null) {
                    l.a("toolbarRecyclerView");
                }
                return recyclerView.getChildAt(this.f148153g.c() - 1);
            } else {
                RecyclerView recyclerView2 = this.f148151e;
                if (recyclerView2 == null) {
                    l.a("toolbarRecyclerView");
                }
                return recyclerView2.getChildAt(i2);
            }
        }
        return null;
    }

    static final class b<T> implements com.bytedance.als.m {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ i f148156a;

        static {
            Covode.recordClassIndex(97653);
        }

        b(i iVar) {
            this.f148156a = iVar;
        }

        @Override // androidx.lifecycle.u, com.bytedance.als.m
        public final /* synthetic */ void onChanged(Object obj) {
            if (obj != null) {
                View view = this.f148156a.n;
                l.b(view, "");
                ViewGroup.LayoutParams layoutParams = view.getLayoutParams();
                Objects.requireNonNull(layoutParams, "null cannot be cast to non-null type android.widget.FrameLayout.LayoutParams");
                FrameLayout.LayoutParams layoutParams2 = (FrameLayout.LayoutParams) layoutParams;
                int i2 = this.f148156a.f148150b;
                Activity activity = this.f148156a.f42913m;
                if (activity == null) {
                    l.b();
                }
                layoutParams2.topMargin = i2 + dh.c(activity);
                View view2 = this.f148156a.n;
                l.b(view2, "");
                view2.setLayoutParams(layoutParams2);
                StringBuilder append = new StringBuilder("receive topMarginUpdate in RecordToolbarScene,now margin is:").append(layoutParams2.topMargin).append(",top is:");
                View view3 = this.f148156a.n;
                l.b(view3, "");
                q.a(append.append(view3.getTop()).toString());
            }
        }
    }

    private final void a(View view) {
        boolean z;
        int i2;
        String str;
        if (!u.b() || !com.ss.android.ugc.aweme.commentStickerPanel.net.a.b() || !com.ss.android.ugc.aweme.commentStickerPanel.net.a.a()) {
            z = true;
        } else {
            z = false;
        }
        if (!u.d() && z && j.a.b()) {
            if (df.e()) {
                i2 = R.string.f69;
            } else {
                i2 = R.string.bwv;
            }
            Context s = s();
            l.b(s, "");
            com.bytedance.tux.tooltip.a.b.a aVar = (com.bytedance.tux.tooltip.a.b.a) new com.bytedance.tux.tooltip.a.b.a(s).b(view).a(com.bytedance.tux.tooltip.h.START);
            Context r = r();
            if (r == null || (str = r.getString(i2)) == null) {
                str = "";
            }
            l.b(str, "");
            com.bytedance.tux.tooltip.a.b.a a2 = aVar.a(str);
            Context s2 = s();
            l.b(s2, "");
            a2.a(s2.getResources().getColor(R.color.bm)).a(5000L).d().a();
            d.a("reply_tooltip_show", new com.ss.android.ugc.tools.f.b().a("shoot_way", this.f148155i.r).a("enter_from", "video_shoot_page").a("creation_id", this.f148155i.q).a("user_id", com.ss.android.ugc.aweme.port.in.g.a().A().c()).a("content_source", "shoot").a("content_type", "video").f149193a);
        }
    }

    @Override // com.bytedance.scene.j
    public final void a(Bundle bundle) {
        super.a(bundle);
        View c2 = c(R.id.djq);
        l.b(c2, "");
        RecyclerView recyclerView = (RecyclerView) c2;
        this.f148151e = recyclerView;
        if (recyclerView == null) {
            l.a("toolbarRecyclerView");
        }
        t();
        recyclerView.setLayoutManager(new LinearLayoutManager(1, false));
        this.f148149a = new c(d());
        RecyclerView recyclerView2 = this.f148151e;
        if (recyclerView2 == null) {
            l.a("toolbarRecyclerView");
        }
        c cVar = this.f148149a;
        if (cVar == null) {
            l.a("toolbarAdapter");
        }
        recyclerView2.setAdapter(cVar);
        ap apVar = new ap(t());
        Drawable a2 = androidx.core.content.b.a(t(), (int) R.drawable.ha);
        if (a2 == null) {
            l.b();
        }
        apVar.a(a2);
        RecyclerView recyclerView3 = this.f148151e;
        if (recyclerView3 == null) {
            l.a("toolbarRecyclerView");
        }
        recyclerView3.a(apVar);
        RecyclerView recyclerView4 = this.f148151e;
        if (recyclerView4 == null) {
            l.a("toolbarRecyclerView");
        }
        recyclerView4.setItemAnimator(null);
        this.f148154h.a(this, new b(this));
        this.f148153g.a(C());
    }

    @Override // com.bytedance.scene.j
    public final View a(LayoutInflater layoutInflater, ViewGroup viewGroup) {
        l.d(layoutInflater, "");
        l.d(viewGroup, "");
        View a2 = com.a.a(layoutInflater, R.layout.bj3, viewGroup, false);
        l.b(a2, "");
        return a2;
    }

    public i(b bVar, g<Boolean> gVar, ShortVideoContext shortVideoContext) {
        l.d(bVar, "");
        l.d(gVar, "");
        l.d(shortVideoContext, "");
        this.f148153g = bVar;
        this.f148154h = gVar;
        this.f148155i = shortVideoContext;
    }
}
