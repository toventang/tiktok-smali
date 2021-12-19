package com.ss.android.ugc.aweme.mix.profile.entry;

import android.content.Context;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.os.Build;
import android.os.Bundle;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import com.bytedance.apm.agent.v2.instrumentation.ClickAgent;
import com.bytedance.covode.number.Covode;
import com.bytedance.ies.powerlist.PowerList;
import com.bytedance.ies.powerlist.page.f;
import com.bytedance.router.SmartRouter;
import com.ss.android.ugc.aweme.base.utils.n;
import com.ss.android.ugc.aweme.mix.api.MixFeedApi;
import com.ss.android.ugc.aweme.mix.api.h;
import com.ss.android.ugc.aweme.mix.services.IMixFeedService;
import com.ss.android.ugc.aweme.mix.services.MixFeedService;
import com.zhiliaoapp.musically.R;
import f.a.ab;
import h.f.b.l;
import h.f.b.m;
import h.i;
import h.q;
import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

public final class c extends RecyclerView.ViewHolder implements h {

    /* renamed from: j  reason: collision with root package name */
    public static final int f110243j = n.a(36.0d);

    /* renamed from: k  reason: collision with root package name */
    public static final int f110244k = n.a(16.0d);

    /* renamed from: l  reason: collision with root package name */
    public static final int f110245l = n.a(8.0d);

    /* renamed from: m  reason: collision with root package name */
    public static final int f110246m = n.a(16.0d);
    public static final int n = n.a(40.5d);
    public static int o = n.a(88.0d);
    public static final int p = n.a(102.0d);
    public static final int q = n.a(82.0d);
    public static int r;
    public static boolean s = true;
    public static boolean t;
    public static int u;
    public static int v;
    public static boolean w;
    public static final a x = new a((byte) 0);
    private final TextView A;
    private final TextView B;
    private final FrameLayout C;
    private final FrameLayout D;
    private final View E;
    private final h.h F;
    private final com.ss.android.ugc.aweme.mix.api.g G;

    /* renamed from: a  reason: collision with root package name */
    public final ArrayList<com.ss.android.ugc.aweme.mix.model.d> f110247a = new ArrayList<>();

    /* renamed from: b  reason: collision with root package name */
    public String f110248b = "";

    /* renamed from: c  reason: collision with root package name */
    public String f110249c = "";

    /* renamed from: d  reason: collision with root package name */
    public final PowerList f110250d;

    /* renamed from: e  reason: collision with root package name */
    public com.ss.android.ugc.aweme.mix.model.a f110251e;

    /* renamed from: f  reason: collision with root package name */
    public final View f110252f;

    /* renamed from: g  reason: collision with root package name */
    public final boolean f110253g;

    /* renamed from: h  reason: collision with root package name */
    public final boolean f110254h;

    /* renamed from: i  reason: collision with root package name */
    public final String f110255i;
    private final ConstraintLayout y;
    private final ConstraintLayout z;

    private final com.bytedance.ies.powerlist.page.config.b<com.ss.android.ugc.aweme.mix.model.a> a() {
        return (com.bytedance.ies.powerlist.page.config.b) this.F.getValue();
    }

    public static final class a {
        static {
            Covode.recordClassIndex(70752);
        }

        private a() {
        }

        public /* synthetic */ a(byte b2) {
            this();
        }
    }

    static final class b extends m implements h.f.a.a<AnonymousClass1> {
        final /* synthetic */ c this$0;

        static {
            Covode.recordClassIndex(70753);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        b(c cVar) {
            super(0);
            this.this$0 = cVar;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        @Override // h.f.a.a
        public final /* synthetic */ AnonymousClass1 invoke() {
            com.bytedance.ies.powerlist.page.config.c cVar = new com.bytedance.ies.powerlist.page.config.c();
            cVar.f34357b = false;
            cVar.f34356a = 3;
            return new com.bytedance.ies.powerlist.page.config.b<com.ss.android.ugc.aweme.mix.model.a>(this, cVar) {
                /* class com.ss.android.ugc.aweme.mix.profile.entry.c.b.AnonymousClass1 */

                /* renamed from: a  reason: collision with root package name */
                final /* synthetic */ b f110256a;

                static {
                    Covode.recordClassIndex(70754);
                }

                /* renamed from: com.ss.android.ugc.aweme.mix.profile.entry.c$b$1$b  reason: collision with other inner class name */
                static final class C2821b<T> implements f.a.d.f {

                    /* renamed from: a  reason: collision with root package name */
                    final /* synthetic */ h.c.d f110259a;

                    static {
                        Covode.recordClassIndex(70756);
                    }

                    C2821b(h.c.d dVar) {
                        this.f110259a = dVar;
                    }

                    @Override // f.a.d.f
                    public final /* synthetic */ void accept(Object obj) {
                        this.f110259a.resumeWith(q.m223constructorimpl(f.a.a(new Exception(((Throwable) obj).getMessage()))));
                    }
                }

                @Override // com.bytedance.ies.powerlist.page.config.d
                public final void a(h.c.d<? super com.bytedance.ies.powerlist.page.f<com.ss.android.ugc.aweme.mix.model.a>> dVar) {
                    l.d(dVar, "");
                    List<com.bytedance.ies.powerlist.b.a> a2 = this.f110256a.this$0.a(this.f110256a.this$0.f110247a);
                    if (this.f110256a.this$0.f110253g) {
                        a2.add(0, new a());
                    }
                    dVar.resumeWith(q.m223constructorimpl(f.a.a(null, this.f110256a.this$0.f110251e, a2)));
                }

                /* renamed from: com.ss.android.ugc.aweme.mix.profile.entry.c$b$1$a */
                static final class a<T> implements f.a.d.f {

                    /* renamed from: a  reason: collision with root package name */
                    final /* synthetic */ AnonymousClass1 f110257a;

                    /* renamed from: b  reason: collision with root package name */
                    final /* synthetic */ h.c.d f110258b;

                    static {
                        Covode.recordClassIndex(70755);
                    }

                    a(AnonymousClass1 r1, h.c.d dVar) {
                        this.f110257a = r1;
                        this.f110258b = dVar;
                    }

                    @Override // f.a.d.f
                    public final /* synthetic */ void accept(Object obj) {
                        List<com.ss.android.ugc.aweme.mix.model.d> list;
                        List<com.ss.android.ugc.aweme.mix.model.d> mixList;
                        List<com.ss.android.ugc.aweme.mix.model.d> list2;
                        List<com.ss.android.ugc.aweme.mix.model.d> list3;
                        com.ss.android.ugc.aweme.mix.model.a aVar = (com.ss.android.ugc.aweme.mix.model.a) obj;
                        if (!(aVar == null || (mixList = aVar.getMixList()) == null)) {
                            this.f110257a.f110256a.this$0.f110247a.addAll(mixList);
                            com.ss.android.ugc.aweme.mix.model.a aVar2 = this.f110257a.f110256a.this$0.f110251e;
                            if (aVar2 != null) {
                                list2 = aVar2.getMixList();
                            } else {
                                list2 = null;
                            }
                            if (list2 instanceof ArrayList) {
                                com.ss.android.ugc.aweme.mix.model.a aVar3 = this.f110257a.f110256a.this$0.f110251e;
                                if (aVar3 != null) {
                                    list3 = aVar3.getMixList();
                                } else {
                                    list3 = null;
                                }
                                Objects.requireNonNull(list3, "null cannot be cast to non-null type java.util.ArrayList<com.ss.android.ugc.aweme.mix.model.MixStruct>");
                                ArrayList arrayList = (ArrayList) list3;
                                if (arrayList != null) {
                                    arrayList.addAll(mixList);
                                }
                            }
                        }
                        h.c.d dVar = this.f110258b;
                        c cVar = this.f110257a.f110256a.this$0;
                        if (aVar != null) {
                            list = aVar.getMixList();
                        } else {
                            list = null;
                        }
                        dVar.resumeWith(q.m223constructorimpl(f.a.a(null, aVar, cVar.a(list))));
                        this.f110257a.f110256a.this$0.f110250d.o();
                    }
                }

                {
                    this.f110256a = r1;
                }

                @Override // com.bytedance.ies.powerlist.page.config.d
                public final /* synthetic */ void b(h.c.d dVar, Object obj) {
                    ab<com.ss.android.ugc.aweme.mix.model.a> userMixList;
                    String str;
                    com.ss.android.ugc.aweme.mix.model.a aVar = (com.ss.android.ugc.aweme.mix.model.a) obj;
                    l.d(dVar, "");
                    l.d(aVar, "");
                    if (this.f110256a.this$0.f110254h) {
                        MixFeedApi a2 = MixFeedApi.a.a();
                        String str2 = this.f110256a.this$0.f110248b;
                        long cursor = aVar.getCursor();
                        com.ss.android.ugc.aweme.mix.model.a aVar2 = this.f110256a.this$0.f110251e;
                        if (aVar2 == null || (str = aVar2.getKeyWord()) == null) {
                            str = "";
                        }
                        userMixList = a2.searchLodeMore(str2, cursor, 10, 16, str);
                    } else {
                        userMixList = MixFeedApi.a.a().getUserMixList(this.f110256a.this$0.f110248b, aVar.getCursor(), this.f110256a.this$0.f110249c);
                    }
                    if (aVar.getHasMore()) {
                        l.b(userMixList.b(f.a.h.a.b(f.a.k.a.f158006c)).a(f.a.a.a.a.a(f.a.a.b.a.f157156a)).a(new a(this, dVar), new C2821b(dVar)), "");
                    }
                }
            };
        }
    }

    static {
        Covode.recordClassIndex(70751);
    }

    private final void b() {
        this.f110250d.a(PlayListNameCell.class, PlayListNameAddCell.class);
        this.f110252f.getContext();
        LinearLayoutManager linearLayoutManager = new LinearLayoutManager();
        linearLayoutManager.b(0);
        this.f110250d.setLayoutManager(linearLayoutManager);
        this.D.setOnClickListener(View$OnClickListenerC2822c.f110260a);
        this.C.setOnClickListener(d.f110261a);
        this.y.setOnClickListener(new e(this));
        this.z.setOnClickListener(f.f110263a);
        View findViewById = this.f110252f.findViewById(R.id.bn);
        l.b(findViewById, "");
        ImageView imageView = (ImageView) findViewById;
        View findViewById2 = this.f110252f.findViewById(R.id.avu);
        l.b(findViewById2, "");
        ImageView imageView2 = (ImageView) findViewById2;
        Context context = this.f110252f.getContext();
        l.b(context, "");
        Drawable drawable = context.getResources().getDrawable(2131233473);
        if (Build.VERSION.SDK_INT > 19) {
            l.b(drawable, "");
            drawable.setAutoMirrored(true);
        }
        imageView.setImageDrawable(drawable);
        imageView2.setImageDrawable(drawable);
        this.f110250d.a(new g(this));
        this.B.setMaxWidth(com.bytedance.common.utility.n.a(this.f110252f.getContext()) - q);
        this.A.setMaxWidth(com.bytedance.common.utility.n.a(this.f110252f.getContext()) - p);
    }

    public static final class g extends RecyclerView.h {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ c f110264a;

        static {
            Covode.recordClassIndex(70761);
        }

        /* JADX WARN: Incorrect args count in method signature: ()V */
        g(c cVar) {
            this.f110264a = cVar;
        }

        @Override // androidx.recyclerview.widget.RecyclerView.h
        public final void getItemOffsets(Rect rect, View view, RecyclerView recyclerView, RecyclerView.s sVar) {
            l.d(rect, "");
            l.d(view, "");
            l.d(recyclerView, "");
            l.d(sVar, "");
            super.getItemOffsets(rect, view, recyclerView, sVar);
            int d2 = RecyclerView.d(view);
            if (d2 == 0) {
                ViewGroup.LayoutParams layoutParams = view.getLayoutParams();
                Objects.requireNonNull(layoutParams, "null cannot be cast to non-null type androidx.recyclerview.widget.RecyclerView.LayoutParams");
                RecyclerView.j jVar = (RecyclerView.j) layoutParams;
                jVar.setMarginStart(c.f110244k);
                jVar.leftMargin = c.f110244k;
                jVar.rightMargin = 0;
                jVar.setMarginEnd(0);
                view.setLayoutParams(jVar);
            } else if (d2 == this.f110264a.f110250d.getState().b() - 1) {
                ViewGroup.LayoutParams layoutParams2 = view.getLayoutParams();
                Objects.requireNonNull(layoutParams2, "null cannot be cast to non-null type androidx.recyclerview.widget.RecyclerView.LayoutParams");
                RecyclerView.j jVar2 = (RecyclerView.j) layoutParams2;
                jVar2.setMarginStart(c.f110245l);
                jVar2.leftMargin = c.f110245l;
                jVar2.rightMargin = c.f110246m;
                jVar2.setMarginEnd(c.f110246m);
                view.setLayoutParams(jVar2);
            } else {
                ViewGroup.LayoutParams layoutParams3 = view.getLayoutParams();
                Objects.requireNonNull(layoutParams3, "null cannot be cast to non-null type androidx.recyclerview.widget.RecyclerView.LayoutParams");
                RecyclerView.j jVar3 = (RecyclerView.j) layoutParams3;
                jVar3.setMarginStart(c.f110245l);
                jVar3.leftMargin = c.f110245l;
                jVar3.rightMargin = 0;
                jVar3.setMarginEnd(0);
                view.setLayoutParams(jVar3);
            }
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: com.ss.android.ugc.aweme.mix.profile.entry.c$c  reason: collision with other inner class name */
    public static final class View$OnClickListenerC2822c implements View.OnClickListener {

        /* renamed from: a  reason: collision with root package name */
        public static final View$OnClickListenerC2822c f110260a = new View$OnClickListenerC2822c();

        static {
            Covode.recordClassIndex(70757);
        }

        View$OnClickListenerC2822c() {
        }

        public final void onClick(View view) {
            ClickAgent.onClick(view);
            MixFeedService.k().e();
            com.ss.android.ugc.d.a.c.a(new com.ss.android.ugc.aweme.mix.b.b());
        }
    }

    /* access modifiers changed from: package-private */
    public static final class d implements View.OnClickListener {

        /* renamed from: a  reason: collision with root package name */
        public static final d f110261a = new d();

        static {
            Covode.recordClassIndex(70758);
        }

        d() {
        }

        public final void onClick(View view) {
            ClickAgent.onClick(view);
            MixFeedService.k().a(false);
            com.ss.android.ugc.d.a.c.a(new com.ss.android.ugc.aweme.mix.b.b());
        }
    }

    /* access modifiers changed from: package-private */
    public static final class f implements View.OnClickListener {

        /* renamed from: a  reason: collision with root package name */
        public static final f f110263a = new f();

        static {
            Covode.recordClassIndex(70760);
        }

        f() {
        }

        public final void onClick(View view) {
            ClickAgent.onClick(view);
            l.b(view, "");
            SmartRouter.buildRoute(view.getContext(), "//account/setting").open();
        }
    }

    /* access modifiers changed from: package-private */
    public static final class e implements View.OnClickListener {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ c f110262a;

        static {
            Covode.recordClassIndex(70759);
        }

        e(c cVar) {
            this.f110262a = cVar;
        }

        public final void onClick(View view) {
            int i2;
            ClickAgent.onClick(view);
            if (com.ss.android.ugc.aweme.mix.c.b.a() == 1 || com.ss.android.ugc.aweme.mix.c.b.a() == 2) {
                i2 = 2;
            } else {
                i2 = 1;
            }
            IMixFeedService k2 = MixFeedService.k();
            l.b(view, "");
            Context context = view.getContext();
            l.b(context, "");
            k2.a(context, new Bundle(), i2, this.f110262a.f110255i, "profile");
        }
    }

    public final List<com.bytedance.ies.powerlist.b.a> a(List<? extends com.ss.android.ugc.aweme.mix.model.d> list) {
        ArrayList arrayList = new ArrayList();
        if (list != null) {
            for (com.ss.android.ugc.aweme.mix.model.d dVar : list) {
                b bVar = new b();
                bVar.f110230a = dVar.icon;
                bVar.f110231b = dVar.getMixName();
                bVar.f110233d = dVar.mixId;
                String str = this.f110248b;
                l.d(str, "");
                bVar.f110235f = str;
                String str2 = this.f110249c;
                l.d(str2, "");
                bVar.f110236g = str2;
                bVar.f110238i = this.f110254h;
                com.ss.android.ugc.aweme.mix.model.a aVar = this.f110251e;
                String str3 = null;
                bVar.f110239j = aVar != null ? aVar.getKeyWord() : null;
                com.ss.android.ugc.aweme.mix.model.a aVar2 = this.f110251e;
                bVar.f110240k = aVar2 != null ? aVar2.getSearchId() : null;
                com.ss.android.ugc.aweme.mix.model.a aVar3 = this.f110251e;
                bVar.f110241l = aVar3 != null ? aVar3.getSearchResultId() : null;
                String str4 = this.f110255i;
                l.d(str4, "");
                bVar.f110237h = str4;
                bVar.n = this.G;
                com.ss.android.ugc.aweme.mix.model.a aVar4 = this.f110251e;
                if (aVar4 != null) {
                    str3 = aVar4.getSearchType();
                }
                bVar.f110242m = str3;
                arrayList.add(bVar);
            }
        }
        return arrayList;
    }

    /* JADX WARN: Type inference failed for: r1v0, types: [int, boolean] */
    /* JADX WARNING: Unknown variable types count: 1 */
    @Override // com.ss.android.ugc.aweme.mix.api.h
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void a(java.lang.String r9, java.lang.String r10, com.ss.android.ugc.aweme.mix.model.a r11) {
        /*
        // Method dump skipped, instructions count: 300
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ss.android.ugc.aweme.mix.profile.entry.c.a(java.lang.String, java.lang.String, com.ss.android.ugc.aweme.mix.model.a):void");
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public c(View view, boolean z2, boolean z3, String str, com.ss.android.ugc.aweme.mix.api.g gVar) {
        super(view);
        int a2;
        l.d(view, "");
        l.d(str, "");
        this.f110252f = view;
        this.f110253g = z2;
        this.f110254h = z3;
        this.f110255i = str;
        this.G = gVar;
        View findViewById = view.findViewById(R.id.d7z);
        l.b(findViewById, "");
        PowerList powerList = (PowerList) findViewById;
        this.f110250d = powerList;
        View findViewById2 = view.findViewById(R.id.d5p);
        l.b(findViewById2, "");
        this.y = (ConstraintLayout) findViewById2;
        View findViewById3 = view.findViewById(R.id.d5m);
        l.b(findViewById3, "");
        this.z = (ConstraintLayout) findViewById3;
        View findViewById4 = view.findViewById(R.id.d5o);
        l.b(findViewById4, "");
        this.A = (TextView) findViewById4;
        View findViewById5 = view.findViewById(R.id.d5l);
        l.b(findViewById5, "");
        this.B = (TextView) findViewById5;
        View findViewById6 = view.findViewById(R.id.bs);
        l.b(findViewById6, "");
        this.C = (FrameLayout) findViewById6;
        View findViewById7 = view.findViewById(R.id.bhp);
        l.b(findViewById7, "");
        this.D = (FrameLayout) findViewById7;
        View findViewById8 = view.findViewById(R.id.ca6);
        l.b(findViewById8, "");
        this.E = findViewById8;
        this.F = i.a((h.f.a.a) new b(this));
        b();
        powerList.a(a());
        if (!com.ss.android.ugc.aweme.setting.services.f.f122672a.f() || z2) {
            findViewById8.setVisibility(8);
        } else {
            findViewById8.setVisibility(0);
        }
        if (z3) {
            a2 = n.a(109.0d);
        } else {
            a2 = n.a(88.0d);
        }
        o = a2;
    }
}
