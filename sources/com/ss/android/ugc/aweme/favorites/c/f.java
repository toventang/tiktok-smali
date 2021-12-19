package com.ss.android.ugc.aweme.favorites.c;

import android.content.Context;
import android.content.res.Resources;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.CheckBox;
import android.widget.TextView;
import androidx.lifecycle.ad;
import androidx.lifecycle.ag;
import androidx.recyclerview.widget.GridLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import com.bytedance.apm.agent.v2.instrumentation.ClickAgent;
import com.bytedance.assem.arch.extensions.u;
import com.bytedance.assem.arch.viewModel.AssemViewModel;
import com.bytedance.assem.arch.viewModel.i;
import com.bytedance.covode.number.Covode;
import com.bytedance.lighten.loader.SmartImageView;
import com.bytedance.router.SmartRouter;
import com.bytedance.tux.icon.TuxIconView;
import com.ss.android.agilelogger.ALog;
import com.ss.android.ugc.aweme.common.a.h;
import com.ss.android.ugc.aweme.common.r;
import com.ss.android.ugc.aweme.favorites.api.d;
import com.ss.android.ugc.aweme.favorites.viewmodel.VideoCollectionContentViewModel;
import com.ss.android.ugc.aweme.feed.model.Aweme;
import com.ss.android.ugc.aweme.feed.model.AwemeStatistics;
import com.ss.android.ugc.aweme.feed.model.Video;
import com.ss.android.ugc.aweme.utils.em;
import com.zhiliaoapp.musically.R;
import h.f.b.ab;
import h.v;
import h.z;
import java.util.List;

public final class f extends com.bytedance.assem.arch.d.a {

    /* renamed from: k  reason: collision with root package name */
    public static final e f90486k = new e((byte) 0);

    /* renamed from: j  reason: collision with root package name */
    public boolean f90487j;

    /* renamed from: l  reason: collision with root package name */
    private final com.bytedance.assem.arch.extensions.i f90488l = new com.bytedance.assem.arch.extensions.i(bQ_(), new c(this, null));

    /* renamed from: m  reason: collision with root package name */
    private final com.bytedance.assem.arch.extensions.i f90489m = new com.bytedance.assem.arch.extensions.i(bQ_(), new d(this, null));
    private final com.bytedance.assem.arch.viewModel.b n;
    private final h.h o;

    public static final class b extends h.f.b.m implements h.f.a.b<com.ss.android.ugc.aweme.favorites.viewmodel.d, com.ss.android.ugc.aweme.favorites.viewmodel.d> {
        public static final b INSTANCE = new b();

        static {
            Covode.recordClassIndex(56810);
        }

        public b() {
            super(1);
        }

        public final com.ss.android.ugc.aweme.favorites.viewmodel.d invoke(com.ss.android.ugc.aweme.favorites.viewmodel.d dVar) {
            h.f.b.l.c(dVar, "");
            return dVar;
        }
    }

    public interface g extends com.bytedance.assem.arch.service.c {
        static {
            Covode.recordClassIndex(56815);
        }

        void a(View view, Aweme aweme);

        void a(Aweme aweme);
    }

    static {
        Covode.recordClassIndex(56808);
    }

    public final com.ss.android.ugc.aweme.favorites.api.d u() {
        return (com.ss.android.ugc.aweme.favorites.api.d) this.f90488l.getValue();
    }

    public final C2186f v() {
        return (C2186f) this.f90489m.getValue();
    }

    public final VideoCollectionContentViewModel w() {
        return (VideoCollectionContentViewModel) this.n.getValue();
    }

    public final g x() {
        return (g) this.o.getValue();
    }

    public static final class e {
        static {
            Covode.recordClassIndex(56813);
        }

        private e() {
        }

        public /* synthetic */ e(byte b2) {
            this();
        }
    }

    final class j extends com.ss.android.ugc.aweme.common.a.a {

        /* renamed from: a  reason: collision with root package name */
        public final TextView f90504a;

        /* renamed from: b  reason: collision with root package name */
        public final CheckBox f90505b;

        /* renamed from: c  reason: collision with root package name */
        public final View f90506c;

        /* renamed from: d  reason: collision with root package name */
        public final View f90507d;

        /* renamed from: e  reason: collision with root package name */
        final /* synthetic */ f f90508e;

        static {
            Covode.recordClassIndex(56820);
        }

        @Override // com.ss.android.ugc.aweme.common.a.a
        public final int[] b() {
            return em.a(200);
        }

        @Override // com.ss.android.ugc.aweme.common.a.g
        public final void c() {
            if (this.f76353m != null) {
                Object obj = this.f76353m;
                h.f.b.l.b(obj, "");
                Video video = ((Aweme) obj).getVideo();
                if (video == null) {
                    return;
                }
                if (a(video, "AbsAwemeViewHolder")) {
                    this.o = true;
                } else {
                    a(video.getCover(), "AbsAwemeViewHolder");
                }
            }
        }

        static final class b implements View.OnClickListener {

            /* renamed from: a  reason: collision with root package name */
            final /* synthetic */ j f90513a;

            static {
                Covode.recordClassIndex(56822);
            }

            b(j jVar) {
                this.f90513a = jVar;
            }

            public final void onClick(View view) {
                ClickAgent.onClick(view);
                this.f90513a.f90506c.callOnClick();
            }
        }

        static final class a implements View.OnClickListener {

            /* renamed from: a  reason: collision with root package name */
            final /* synthetic */ j f90509a;

            /* renamed from: b  reason: collision with root package name */
            final /* synthetic */ boolean f90510b;

            /* renamed from: c  reason: collision with root package name */
            final /* synthetic */ androidx.fragment.app.e f90511c;

            /* renamed from: d  reason: collision with root package name */
            final /* synthetic */ com.ss.android.ugc.aweme.favorites.viewmodel.a f90512d;

            static {
                Covode.recordClassIndex(56821);
            }

            a(j jVar, boolean z, androidx.fragment.app.e eVar, com.ss.android.ugc.aweme.favorites.viewmodel.a aVar) {
                this.f90509a = jVar;
                this.f90510b = z;
                this.f90511c = eVar;
                this.f90512d = aVar;
            }

            public final void onClick(View view) {
                ClickAgent.onClick(view);
                if (this.f90510b) {
                    new com.bytedance.tux.g.b(this.f90511c).e(R.string.bt_).b();
                    this.f90509a.f90505b.setChecked(false);
                    return;
                }
                VideoCollectionContentViewModel w = this.f90509a.f90508e.w();
                Aweme aweme = this.f90512d.f91001a;
                int i2 = 2;
                if (this.f90512d.f91002b == 2) {
                    i2 = 1;
                }
                com.ss.android.ugc.aweme.favorites.viewmodel.a aVar = new com.ss.android.ugc.aweme.favorites.viewmodel.a(aweme, i2);
                h.f.b.l.d(aVar, "");
                w.a(new VideoCollectionContentViewModel.g(aVar));
            }
        }

        static final class c implements View.OnClickListener {

            /* renamed from: a  reason: collision with root package name */
            final /* synthetic */ j f90514a;

            /* renamed from: b  reason: collision with root package name */
            final /* synthetic */ com.ss.android.ugc.aweme.favorites.viewmodel.a f90515b;

            /* renamed from: c  reason: collision with root package name */
            final /* synthetic */ boolean f90516c;

            /* renamed from: d  reason: collision with root package name */
            final /* synthetic */ androidx.fragment.app.e f90517d;

            /* renamed from: e  reason: collision with root package name */
            final /* synthetic */ boolean f90518e;

            static {
                Covode.recordClassIndex(56823);
            }

            c(j jVar, com.ss.android.ugc.aweme.favorites.viewmodel.a aVar, boolean z, androidx.fragment.app.e eVar, boolean z2) {
                this.f90514a = jVar;
                this.f90515b = aVar;
                this.f90516c = z;
                this.f90517d = eVar;
                this.f90518e = z2;
            }

            public final void onClick(View view) {
                ClickAgent.onClick(view);
                r.a("click_personal_collection", new com.ss.android.ugc.aweme.app.f.d().a("enter_from", "collection_video").a("content", "video").a("video_id", this.f90515b.f91001a.getAid()).f66730a);
                if (!this.f90516c) {
                    new com.bytedance.tux.g.b(this.f90517d).e(R.string.btn).b();
                } else if (!this.f90518e) {
                    g x = this.f90514a.f90508e.x();
                    View view2 = this.f90514a.itemView;
                    h.f.b.l.b(view2, "");
                    x.a(view2, this.f90515b.f91001a);
                } else if (this.f90515b.f91002b == 0) {
                    this.f90514a.f90508e.x().a(this.f90515b.f91001a);
                }
            }
        }

        /* access modifiers changed from: package-private */
        public final void a(Aweme aweme, int i2) {
            if (aweme != null) {
                super.a((Object) aweme, i2);
                this.f76353m = aweme;
                c();
            }
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public j(f fVar, ViewGroup viewGroup) {
            super(com.a.a(LayoutInflater.from(viewGroup.getContext()), R.layout.a06, viewGroup, false));
            h.f.b.l.d(viewGroup, "");
            this.f90508e = fVar;
            View findViewById = this.itemView.findViewById(R.id.epo);
            h.f.b.l.b(findViewById, "");
            this.f90504a = (TextView) findViewById;
            View findViewById2 = this.itemView.findViewById(R.id.dxw);
            h.f.b.l.b(findViewById2, "");
            this.f90505b = (CheckBox) findViewById2;
            View findViewById3 = this.itemView.findViewById(R.id.dy4);
            h.f.b.l.b(findViewById3, "");
            this.f90506c = findViewById3;
            View findViewById4 = this.itemView.findViewById(R.id.ame);
            h.f.b.l.b(findViewById4, "");
            this.f90507d = findViewById4;
            this.n = (SmartImageView) this.itemView.findViewById(R.id.agf);
            if (com.bytedance.ies.abmock.b.a().a(true, "stop_main_anim_when_invisible", false)) {
                this.n.setAnimationListener(this.f76348l);
            }
        }
    }

    static final class l extends h.f.b.m implements h.f.a.a<g> {
        final /* synthetic */ f this$0;

        static {
            Covode.recordClassIndex(56825);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        l(f fVar) {
            super(0);
            this.this$0 = fVar;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        @Override // h.f.a.a
        public final /* synthetic */ g invoke() {
            return com.bytedance.assem.arch.service.d.b(this.this$0, ab.a(g.class));
        }
    }

    static final class m implements h.a {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ i f90519a;

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ f f90520b;

        static {
            Covode.recordClassIndex(56826);
        }

        m(i iVar, f fVar) {
            this.f90519a = iVar;
            this.f90520b = fVar;
        }

        @Override // com.ss.android.ugc.aweme.common.a.h.a
        public final void l() {
            f.a(this.f90520b.w(), new h.f.a.b<com.ss.android.ugc.aweme.favorites.viewmodel.d, z>(this) {
                /* class com.ss.android.ugc.aweme.favorites.c.f.m.AnonymousClass1 */
                final /* synthetic */ m this$0;

                static {
                    Covode.recordClassIndex(56827);
                }

                {
                    this.this$0 = r2;
                }

                /* Return type fixed from 'java.lang.Object' to match base method */
                /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
                @Override // h.f.a.b
                public final /* synthetic */ z invoke(com.ss.android.ugc.aweme.favorites.viewmodel.d dVar) {
                    Integer num;
                    com.ss.android.ugc.aweme.favorites.viewmodel.d dVar2 = dVar;
                    h.f.b.l.d(dVar2, "");
                    StringBuilder sb = new StringBuilder("load more videos: type = ");
                    C2186f v = this.this$0.f90520b.v();
                    if (v != null) {
                        num = Integer.valueOf(v.f90490a);
                    } else {
                        num = null;
                    }
                    ALog.d("Collections", sb.append(num).append(", hasMore = ").append(dVar2.f91009c).append(", cursor = ").append(dVar2.f91008b).toString());
                    if (dVar2.f91009c) {
                        this.this$0.f90519a.ag_();
                        this.this$0.f90520b.a(false);
                    }
                    return z.f158842a;
                }
            });
        }
    }

    static final class o extends h.f.b.m implements h.f.a.a<z> {
        final /* synthetic */ i $adapter;
        final /* synthetic */ RecyclerView $rv;

        static {
            Covode.recordClassIndex(56829);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        o(RecyclerView recyclerView, i iVar) {
            super(0);
            this.$rv = recyclerView;
            this.$adapter = iVar;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        @Override // h.f.a.a
        public final /* synthetic */ z invoke() {
            this.$rv.setVisibility(8);
            this.$adapter.f();
            return z.f158842a;
        }
    }

    public static final class a extends h.f.b.m implements h.f.a.a<String> {
        final /* synthetic */ h.k.c $viewModelClass;

        static {
            Covode.recordClassIndex(56809);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public a(h.k.c cVar) {
            super(0);
            this.$viewModelClass = cVar;
        }

        @Override // h.f.a.a
        public final String invoke() {
            return "assem_" + h.f.a.a(this.$viewModelClass).getName();
        }
    }

    public static final class c extends h.f.b.m implements h.f.a.a<com.ss.android.ugc.aweme.favorites.api.d> {
        final /* synthetic */ String $identify;
        final /* synthetic */ com.bytedance.assem.arch.core.a $this_hierarchyData;

        static {
            Covode.recordClassIndex(56811);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public c(com.bytedance.assem.arch.core.a aVar, String str) {
            super(0);
            this.$this_hierarchyData = aVar;
            this.$identify = str;
        }

        /* JADX WARN: Type inference failed for: r0v3, types: [com.ss.android.ugc.aweme.favorites.api.d, java.lang.Object] */
        /* JADX WARNING: Unknown variable types count: 1 */
        @Override // h.f.a.a
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public final com.ss.android.ugc.aweme.favorites.api.d invoke() {
            /*
                r3 = this;
                com.bytedance.assem.arch.core.a r0 = r3.$this_hierarchyData
                com.bytedance.assem.arch.core.AssemSupervisor r0 = r0.bx_()
                com.bytedance.assem.arch.core.d r2 = r0.f25533f
                java.lang.Class<com.ss.android.ugc.aweme.favorites.api.d> r1 = com.ss.android.ugc.aweme.favorites.api.d.class
                java.lang.String r0 = r3.$identify
                java.lang.Object r0 = r2.a(r1, r0)
                return r0
            */
            throw new UnsupportedOperationException("Method not decompiled: com.ss.android.ugc.aweme.favorites.c.f.c.invoke():java.lang.Object");
        }
    }

    public static final class d extends h.f.b.m implements h.f.a.a<C2186f> {
        final /* synthetic */ String $identify;
        final /* synthetic */ com.bytedance.assem.arch.core.a $this_hierarchyDataOrNull;

        static {
            Covode.recordClassIndex(56812);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public d(com.bytedance.assem.arch.core.a aVar, String str) {
            super(0);
            this.$this_hierarchyDataOrNull = aVar;
            this.$identify = str;
        }

        /* JADX WARN: Type inference failed for: r0v3, types: [com.ss.android.ugc.aweme.favorites.c.f$f, java.lang.Object] */
        /* JADX WARNING: Unknown variable types count: 1 */
        @Override // h.f.a.a
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public final com.ss.android.ugc.aweme.favorites.c.f.C2186f invoke() {
            /*
                r3 = this;
                com.bytedance.assem.arch.core.a r0 = r3.$this_hierarchyDataOrNull
                com.bytedance.assem.arch.core.AssemSupervisor r0 = r0.bx_()
                com.bytedance.assem.arch.core.d r2 = r0.f25533f
                java.lang.Class<com.ss.android.ugc.aweme.favorites.c.f$f> r1 = com.ss.android.ugc.aweme.favorites.c.f.C2186f.class
                java.lang.String r0 = r3.$identify
                java.lang.Object r0 = r2.b(r1, r0)
                return r0
            */
            throw new UnsupportedOperationException("Method not decompiled: com.ss.android.ugc.aweme.favorites.c.f.d.invoke():java.lang.Object");
        }
    }

    static final class k extends h.f.b.m implements h.f.a.a<ad.b> {
        final /* synthetic */ f this$0;

        static {
            Covode.recordClassIndex(56824);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        k(f fVar) {
            super(0);
            this.this$0 = fVar;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        @Override // h.f.a.a
        public final /* synthetic */ ad.b invoke() {
            String str = this.this$0.u().f90449a;
            if (str == null) {
                str = "";
            }
            return VideoCollectionContentViewModel.a.a(str);
        }
    }

    public f() {
        com.bytedance.assem.arch.viewModel.b bVar;
        i.d dVar = i.d.f25721a;
        k kVar = new k(this);
        h.k.c a2 = ab.a(VideoCollectionContentViewModel.class);
        a aVar = new a(a2);
        b bVar2 = b.INSTANCE;
        if (h.f.b.l.a(dVar, i.a.f25718a)) {
            bVar = new com.bytedance.assem.arch.viewModel.b(a2, aVar, u.j.f25671a, u.b((com.bytedance.assem.arch.core.a) this, true), u.c(this, true), kVar, bVar2, u.a((com.bytedance.assem.arch.core.a) this, true), u.d(this, true));
        } else if (h.f.b.l.a(dVar, i.d.f25721a)) {
            bVar = new com.bytedance.assem.arch.viewModel.b(a2, aVar, u.j.f25671a, u.b((com.bytedance.assem.arch.core.a) this, false), u.c(this, false), kVar, bVar2, u.a((com.bytedance.assem.arch.core.a) this, false), u.d(this, false));
        } else if (dVar == null || h.f.b.l.a(dVar, i.b.f25719a)) {
            bVar = new com.bytedance.assem.arch.viewModel.b(a2, aVar, u.j.f25671a, u.a((androidx.lifecycle.m) this, false), u.a((ag) this, false), kVar, bVar2, u.b(this), u.c(this));
        } else {
            throw new IllegalArgumentException("Don't support this VMScope here.");
        }
        this.n = bVar;
        this.o = h.i.a((h.f.a.a) new l(this));
    }

    public static final class q extends GridLayoutManager.c {

        /* renamed from: e  reason: collision with root package name */
        final /* synthetic */ i f90521e;

        static {
            Covode.recordClassIndex(56831);
        }

        q(i iVar) {
            this.f90521e = iVar;
        }

        @Override // androidx.recyclerview.widget.GridLayoutManager.c
        public final int a(int i2) {
            if (this.f90521e.getItemViewType(i2) == 0) {
                return 3;
            }
            return 1;
        }
    }

    final class i extends com.ss.android.ugc.aweme.base.widget.g<com.ss.android.ugc.aweme.favorites.viewmodel.a> {

        /* renamed from: d  reason: collision with root package name */
        public final androidx.fragment.app.e f90501d;

        /* renamed from: e  reason: collision with root package name */
        public final boolean f90502e;

        /* renamed from: f  reason: collision with root package name */
        final /* synthetic */ f f90503f;

        static {
            Covode.recordClassIndex(56819);
        }

        @Override // com.ss.android.ugc.aweme.common.a.l, com.ss.android.ugc.aweme.base.widget.g
        public final int c(int i2) {
            if (this.f90502e || i2 != 0) {
                return 1;
            }
            return 0;
        }

        @Override // androidx.recyclerview.widget.RecyclerView.a, com.ss.android.ugc.aweme.common.a.h
        public final void onViewAttachedToWindow(RecyclerView.ViewHolder viewHolder) {
            h.f.b.l.d(viewHolder, "");
            super.onViewAttachedToWindow(viewHolder);
            if (viewHolder instanceof j) {
                ((com.ss.android.ugc.aweme.common.a.e) viewHolder).b(true);
            }
        }

        @Override // androidx.recyclerview.widget.RecyclerView.a, com.ss.android.ugc.aweme.common.a.h
        public final void onViewDetachedFromWindow(RecyclerView.ViewHolder viewHolder) {
            h.f.b.l.d(viewHolder, "");
            super.onViewDetachedFromWindow(viewHolder);
            if (viewHolder instanceof j) {
                com.ss.android.ugc.aweme.common.a.e eVar = (com.ss.android.ugc.aweme.common.a.e) viewHolder;
                eVar.b(false);
                eVar.n.c();
            }
        }

        @Override // com.ss.android.ugc.aweme.common.a.l, com.ss.android.ugc.aweme.base.widget.g
        public final RecyclerView.ViewHolder a(ViewGroup viewGroup, int i2) {
            h.f.b.l.d(viewGroup, "");
            if (i2 == 0) {
                return new h(this.f90503f, viewGroup);
            }
            if (i2 == 1) {
                return new j(this.f90503f, viewGroup);
            }
            throw new Exception("not match view type");
        }

        @Override // com.ss.android.ugc.aweme.common.a.l, com.ss.android.ugc.aweme.base.widget.g
        public final void a(RecyclerView.ViewHolder viewHolder, int i2) {
            long j2;
            int i3;
            boolean z;
            boolean z2;
            boolean z3;
            boolean z4;
            int i4;
            Long l2;
            List e2 = e();
            Long l3 = null;
            if (e2 != null && h.a.n.b(e2, i2) != null) {
                int i5 = 0;
                if (viewHolder instanceof h) {
                    h hVar = (h) viewHolder;
                    androidx.fragment.app.e eVar = this.f90501d;
                    if (e().size() == 1 || ((com.ss.android.ugc.aweme.favorites.viewmodel.a) e().get(i2)).f91002b != 0) {
                        z4 = true;
                    } else {
                        z4 = false;
                    }
                    h.f.b.l.d(eVar, "");
                    hVar.f90492a.setText(hVar.f90497f.u().f90450b);
                    TextView textView = hVar.f90493b;
                    View view = hVar.itemView;
                    h.f.b.l.b(view, "");
                    Context context = view.getContext();
                    h.f.b.l.b(context, "");
                    Resources resources = context.getResources();
                    d.a aVar = hVar.f90497f.u().f90453e;
                    if (aVar == null || (l2 = aVar.f90454a) == null) {
                        i4 = 0;
                    } else {
                        i4 = (int) l2.longValue();
                    }
                    Object[] objArr = new Object[1];
                    d.a aVar2 = hVar.f90497f.u().f90453e;
                    if (aVar2 != null) {
                        l3 = aVar2.f90454a;
                    }
                    objArr[0] = String.valueOf(l3);
                    textView.setText(resources.getQuantityString(R.plurals.co, i4, objArr));
                    if (z4) {
                        hVar.f90495d.setIconRes(R.raw.icon_plus);
                        hVar.f90496e.setText(R.string.btu);
                        hVar.f90494c.setOnClickListener(new h.a(hVar, eVar));
                    } else {
                        hVar.f90495d.setIconRes(R.raw.icon_gear);
                        hVar.f90496e.setText(R.string.btx);
                        hVar.f90494c.setOnClickListener(new h.b(hVar));
                    }
                    hVar.f90496e.requestLayout();
                } else if (viewHolder instanceof j) {
                    j jVar = (j) viewHolder;
                    androidx.fragment.app.e eVar2 = this.f90501d;
                    Object obj = e().get(i2);
                    h.f.b.l.b(obj, "");
                    com.ss.android.ugc.aweme.favorites.viewmodel.a aVar3 = (com.ss.android.ugc.aweme.favorites.viewmodel.a) obj;
                    h.f.b.l.d(eVar2, "");
                    h.f.b.l.d(aVar3, "");
                    jVar.p = true;
                    TextView textView2 = jVar.f90504a;
                    AwemeStatistics statistics = aVar3.f91001a.getStatistics();
                    if (statistics != null) {
                        j2 = statistics.getPlayCount();
                    } else {
                        j2 = 0;
                    }
                    textView2.setText(com.ss.android.ugc.aweme.i18n.b.a(j2));
                    View view2 = jVar.f90506c;
                    if (aVar3.f91002b != 0) {
                        i3 = 0;
                    } else {
                        i3 = 8;
                    }
                    view2.setVisibility(i3);
                    CheckBox checkBox = jVar.f90505b;
                    if (aVar3.f91002b == 2) {
                        z = true;
                    } else {
                        z = false;
                    }
                    checkBox.setChecked(z);
                    if (aVar3.f91001a.isDelete() || !aVar3.f91001a.isCanPlay()) {
                        z2 = true;
                    } else {
                        z2 = false;
                    }
                    if (aVar3.f91002b != 1) {
                        z3 = true;
                    } else {
                        z3 = jVar.f90508e.f90487j;
                    }
                    View view3 = jVar.f90507d;
                    if (z3 && (aVar3.f91002b != 1 || !z2)) {
                        i5 = 8;
                    }
                    view3.setVisibility(i5);
                    jVar.f90505b.setEnabled(z3);
                    jVar.f90506c.setEnabled(z3);
                    jVar.f90506c.setOnClickListener(new j.a(jVar, z2, eVar2, aVar3));
                    jVar.f90505b.setOnClickListener(new j.b(jVar));
                    jVar.a(aVar3.f91001a, i2);
                    jVar.itemView.setOnClickListener(new j.c(jVar, aVar3, z3, eVar2, z2));
                } else {
                    throw new Exception("not match view type");
                }
            }
        }

        public i(f fVar, androidx.fragment.app.e eVar, boolean z) {
            h.f.b.l.d(eVar, "");
            this.f90503f = fVar;
            this.f90501d = eVar;
            this.f90502e = z;
        }
    }

    static final class p extends h.f.b.m implements h.f.a.b<Throwable, z> {
        final /* synthetic */ RecyclerView $rv;

        static {
            Covode.recordClassIndex(56830);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        p(RecyclerView recyclerView) {
            super(1);
            this.$rv = recyclerView;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
        @Override // h.f.a.b
        public final /* synthetic */ z invoke(Throwable th) {
            h.f.b.l.d(th, "");
            this.$rv.setVisibility(8);
            return z.f158842a;
        }
    }

    final class h extends RecyclerView.ViewHolder {

        /* renamed from: a  reason: collision with root package name */
        public final TextView f90492a;

        /* renamed from: b  reason: collision with root package name */
        public final TextView f90493b;

        /* renamed from: c  reason: collision with root package name */
        public final View f90494c;

        /* renamed from: d  reason: collision with root package name */
        public final TuxIconView f90495d;

        /* renamed from: e  reason: collision with root package name */
        public final TextView f90496e;

        /* renamed from: f  reason: collision with root package name */
        final /* synthetic */ f f90497f;

        static {
            Covode.recordClassIndex(56816);
        }

        static final class a implements View.OnClickListener {

            /* renamed from: a  reason: collision with root package name */
            final /* synthetic */ h f90498a;

            /* renamed from: b  reason: collision with root package name */
            final /* synthetic */ androidx.fragment.app.e f90499b;

            static {
                Covode.recordClassIndex(56817);
            }

            a(h hVar, androidx.fragment.app.e eVar) {
                this.f90498a = hVar;
                this.f90499b = eVar;
            }

            public final void onClick(View view) {
                ClickAgent.onClick(view);
                SmartRouter.buildRoute(this.f90499b, "aweme://favorite/videos/collections/add/video").withParam("collectionId", this.f90498a.f90497f.u().f90449a).withParam("from", "COLLECTION_CONTENT").open();
            }
        }

        static final class b implements View.OnClickListener {

            /* renamed from: a  reason: collision with root package name */
            final /* synthetic */ h f90500a;

            static {
                Covode.recordClassIndex(56818);
            }

            b(h hVar) {
                this.f90500a = hVar;
            }

            public final void onClick(View view) {
                ClickAgent.onClick(view);
                r.a("collection_manage_videos", v.a("collection_video", "enter_from"), v.a(this.f90500a.f90497f.u().f90449a, "collection_id"));
                this.f90500a.f90497f.w().a(true);
            }
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public h(f fVar, ViewGroup viewGroup) {
            super(com.a.a(LayoutInflater.from(viewGroup.getContext()), R.layout.a03, viewGroup, false));
            h.f.b.l.d(viewGroup, "");
            this.f90497f = fVar;
            View findViewById = this.itemView.findViewById(R.id.a8l);
            h.f.b.l.b(findViewById, "");
            this.f90492a = (TextView) findViewById;
            View findViewById2 = this.itemView.findViewById(R.id.a8m);
            h.f.b.l.b(findViewById2, "");
            this.f90493b = (TextView) findViewById2;
            View findViewById3 = this.itemView.findViewById(R.id.z3);
            h.f.b.l.b(findViewById3, "");
            this.f90494c = findViewById3;
            View findViewById4 = this.itemView.findViewById(R.id.yo);
            h.f.b.l.b(findViewById4, "");
            this.f90495d = (TuxIconView) findViewById4;
            View findViewById5 = this.itemView.findViewById(R.id.zy);
            h.f.b.l.b(findViewById5, "");
            this.f90496e = (TextView) findViewById5;
        }
    }

    /* access modifiers changed from: package-private */
    public final void a(boolean z) {
        Integer valueOf;
        C2186f v = v();
        if (v != null && (valueOf = Integer.valueOf(v.f90490a)) != null) {
            if (valueOf.intValue() == 1) {
                w().b(z);
            } else if (valueOf.intValue() == 0) {
                w().d(z);
            } else if (valueOf.intValue() == 2) {
                w().c(z);
            }
        }
    }

    @Override // com.bytedance.assem.arch.core.p
    public final void b(View view) {
        boolean z;
        h.f.b.l.d(view, "");
        RecyclerView recyclerView = (RecyclerView) view;
        androidx.fragment.app.e b2 = com.bytedance.assem.arch.extensions.b.b(this);
        if (b2 != null) {
            C2186f v = v();
            if (v == null || v.f90490a != 0) {
                z = true;
            } else {
                z = false;
            }
            i iVar = new i(this, b2, z);
            iVar.a((h.a) new m(iVar, this));
            iVar.s = new q(iVar);
            ar_();
            recyclerView.setLayoutManager(new GridLayoutManager(3));
            recyclerView.setAdapter(iVar);
            VideoCollectionContentViewModel w = w();
            h.k.k kVar = g.f90522a;
            n nVar = new n(this, iVar, recyclerView);
            AssemViewModel.a(w, kVar, null, new p(recyclerView), new o(recyclerView, iVar), nVar, 2);
            a(true);
        }
    }

    static final class n extends h.f.b.m implements h.f.a.b<List<? extends com.ss.android.ugc.aweme.favorites.viewmodel.a>, z> {
        final /* synthetic */ i $adapter;
        final /* synthetic */ RecyclerView $rv;
        final /* synthetic */ f this$0;

        static {
            Covode.recordClassIndex(56828);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        n(f fVar, i iVar, RecyclerView recyclerView) {
            super(1);
            this.this$0 = fVar;
            this.$adapter = iVar;
            this.$rv = recyclerView;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
        /* JADX WARNING: Removed duplicated region for block: B:25:0x0074  */
        /* JADX WARNING: Removed duplicated region for block: B:27:0x0078  */
        /* JADX WARNING: Removed duplicated region for block: B:30:0x007e  */
        /* JADX WARNING: Removed duplicated region for block: B:34:0x008d  */
        @Override // h.f.a.b
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public final /* synthetic */ h.z invoke(java.util.List<? extends com.ss.android.ugc.aweme.favorites.viewmodel.a> r9) {
            /*
            // Method dump skipped, instructions count: 162
            */
            throw new UnsupportedOperationException("Method not decompiled: com.ss.android.ugc.aweme.favorites.c.f.n.invoke(java.lang.Object):java.lang.Object");
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.favorites.c.f$f  reason: collision with other inner class name */
    public static final class C2186f implements com.bytedance.assem.arch.extensions.c {

        /* renamed from: a  reason: collision with root package name */
        public final int f90490a;

        /* renamed from: b  reason: collision with root package name */
        public final int f90491b;

        static {
            Covode.recordClassIndex(56814);
        }

        public C2186f() {
            this(0, 0, 3);
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof C2186f)) {
                return false;
            }
            C2186f fVar = (C2186f) obj;
            return this.f90490a == fVar.f90490a && this.f90491b == fVar.f90491b;
        }

        public final int hashCode() {
            return (this.f90490a * 31) + this.f90491b;
        }

        public final String toString() {
            return "Config(type=" + this.f90490a + ", maxEnableSelectCount=" + this.f90491b + ")";
        }

        public C2186f(int i2, int i3) {
            this.f90490a = i2;
            this.f90491b = i3;
        }

        /* JADX INFO: this call moved to the top of the method (can break code semantics) */
        public /* synthetic */ C2186f(int i2, int i3, int i4) {
            this((i4 & 1) != 0 ? 0 : i2, (i4 & 2) != 0 ? Integer.MAX_VALUE : i3);
        }
    }
}
