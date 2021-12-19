package com.ss.android.ugc.aweme.favorites.ui;

import android.os.Bundle;
import android.util.SparseArray;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.e;
import com.bytedance.covode.number.Covode;
import com.bytedance.tux.sheet.sheet.a;
import com.ss.android.ugc.aweme.awemeservice.AwemeService;
import com.ss.android.ugc.aweme.base.api.BaseResponse;
import com.ss.android.ugc.aweme.favorites.g.d;
import com.ss.android.ugc.aweme.feed.model.Aweme;
import com.zhiliaoapp.musically.R;
import h.f.b.l;

public final class r extends Fragment implements d {

    /* renamed from: d  reason: collision with root package name */
    public static final a f90931d = new a((byte) 0);

    /* renamed from: a  reason: collision with root package name */
    public String f90932a;

    /* renamed from: b  reason: collision with root package name */
    public Aweme f90933b;

    /* renamed from: c  reason: collision with root package name */
    final com.ss.android.ugc.aweme.favorites.g.a f90934c = new com.ss.android.ugc.aweme.favorites.g.a();

    /* renamed from: e  reason: collision with root package name */
    private SparseArray f90935e;

    static {
        Covode.recordClassIndex(57155);
    }

    public static final class a {
        static {
            Covode.recordClassIndex(57156);
        }

        private a() {
        }

        public /* synthetic */ a(byte b2) {
            this();
        }

        public static void a(e eVar, Aweme aweme, String str) {
            l.d(eVar, "");
            r rVar = new r();
            rVar.f90932a = str;
            rVar.f90933b = aweme;
            new a.C1112a().a(rVar).a(false).a(1).f45299a.show(eVar.getSupportFragmentManager(), "UnFavouritesFragment");
        }
    }

    @Override // androidx.fragment.app.Fragment
    public final /* synthetic */ void onDestroyView() {
        super.onDestroyView();
        SparseArray sparseArray = this.f90935e;
        if (sparseArray != null) {
            sparseArray.clear();
        }
    }

    static final class c implements View.OnClickListener {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ r f90937a;

        static {
            Covode.recordClassIndex(57158);
        }

        c(r rVar) {
            this.f90937a = rVar;
        }

        /*  JADX ERROR: IndexOutOfBoundsException in pass: MethodInvokeVisitor
            java.lang.IndexOutOfBoundsException: Index 1 out of bounds for length 1
            	at java.base/jdk.internal.util.Preconditions.outOfBounds(Preconditions.java:64)
            	at java.base/jdk.internal.util.Preconditions.outOfBoundsCheckIndex(Preconditions.java:70)
            	at java.base/jdk.internal.util.Preconditions.checkIndex(Preconditions.java:266)
            	at java.base/java.util.Objects.checkIndex(Objects.java:359)
            	at java.base/java.util.ArrayList.get(ArrayList.java:427)
            	at jadx.core.dex.visitors.MethodInvokeVisitor.searchCastTypes(MethodInvokeVisitor.java:267)
            	at jadx.core.dex.visitors.MethodInvokeVisitor.processOverloaded(MethodInvokeVisitor.java:127)
            	at jadx.core.dex.visitors.MethodInvokeVisitor.processInvoke(MethodInvokeVisitor.java:102)
            	at jadx.core.dex.visitors.MethodInvokeVisitor.processInsn(MethodInvokeVisitor.java:73)
            	at jadx.core.dex.visitors.MethodInvokeVisitor.visit(MethodInvokeVisitor.java:66)
            */
        public final void onClick(android.view.View r2) {
            /*
                r1 = this;
                com.bytedance.apm.agent.v2.instrumentation.ClickAgent.onClick(r2)
                com.ss.android.ugc.aweme.favorites.ui.r r0 = r1.f90937a
                com.bytedance.tux.sheet.sheet.a.b.a(r0)
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: com.ss.android.ugc.aweme.favorites.ui.r.c.onClick(android.view.View):void");
        }
    }

    @Override // com.ss.android.ugc.aweme.favorites.g.d
    public final void a(BaseResponse baseResponse) {
        String aid;
        Aweme aweme = this.f90933b;
        if (aweme != null) {
            aweme.setCollectStatus(0);
        }
        Aweme aweme2 = this.f90933b;
        if (aweme2 != null && (aid = aweme2.getAid()) != null) {
            AwemeService.b().c(aid, 0);
        }
    }

    @Override // com.ss.android.ugc.aweme.favorites.g.d
    public final void e_(Exception exc) {
        new com.bytedance.tux.g.b(this).e(R.string.a9i).b();
    }

    @Override // com.ss.android.ugc.aweme.favorites.g.d
    public final void a(String str) {
        if (str != null) {
            new com.bytedance.tux.g.b(this).a(str).b();
        }
    }

    static final class b implements View.OnClickListener {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ r f90936a;

        static {
            Covode.recordClassIndex(57157);
        }

        b(r rVar) {
            this.f90936a = rVar;
        }

        /*  JADX ERROR: IndexOutOfBoundsException in pass: MethodInvokeVisitor
            java.lang.IndexOutOfBoundsException: Index 1 out of bounds for length 1
            	at java.base/jdk.internal.util.Preconditions.outOfBounds(Preconditions.java:64)
            	at java.base/jdk.internal.util.Preconditions.outOfBoundsCheckIndex(Preconditions.java:70)
            	at java.base/jdk.internal.util.Preconditions.checkIndex(Preconditions.java:266)
            	at java.base/java.util.Objects.checkIndex(Objects.java:359)
            	at java.base/java.util.ArrayList.get(ArrayList.java:427)
            	at jadx.core.dex.visitors.MethodInvokeVisitor.searchCastTypes(MethodInvokeVisitor.java:267)
            	at jadx.core.dex.visitors.MethodInvokeVisitor.processOverloaded(MethodInvokeVisitor.java:127)
            	at jadx.core.dex.visitors.MethodInvokeVisitor.processInvoke(MethodInvokeVisitor.java:102)
            	at jadx.core.dex.visitors.MethodInvokeVisitor.processInsn(MethodInvokeVisitor.java:73)
            	at jadx.core.dex.visitors.MethodInvokeVisitor.visit(MethodInvokeVisitor.java:66)
            */
        public final void onClick(android.view.View r8) {
            /*
                r7 = this;
                com.bytedance.apm.agent.v2.instrumentation.ClickAgent.onClick(r8)
                com.ss.android.ugc.aweme.favorites.ui.r r1 = r7.f90936a
                com.ss.android.ugc.aweme.feed.model.Aweme r0 = r1.f90933b
                if (r0 == 0) goto L_0x000f
                java.lang.String r6 = r0.getAid()
                if (r6 != 0) goto L_0x0015
            L_0x000f:
                com.ss.android.ugc.aweme.favorites.ui.r r0 = r7.f90936a
                com.bytedance.tux.sheet.sheet.a.b.a(r0)
                return
            L_0x0015:
                java.lang.String r5 = r1.f90932a
                if (r5 != 0) goto L_0x001a
                goto L_0x000f
            L_0x001a:
                com.ss.android.ugc.aweme.favorites.g.a r4 = r1.f90934c
                r0 = 3
                java.lang.Object[] r3 = new java.lang.Object[r0]
                r2 = 2
                java.lang.Integer r0 = java.lang.Integer.valueOf(r2)
                r1 = 0
                r3[r1] = r0
                r0 = 1
                r3[r0] = r6
                java.lang.Integer r0 = java.lang.Integer.valueOf(r1)
                r3[r2] = r0
                r4.a(r3)
                com.ss.android.ugc.aweme.app.f.d r1 = new com.ss.android.ugc.aweme.app.f.d
                r1.<init>()
                java.lang.String r0 = "enter_from"
                com.ss.android.ugc.aweme.app.f.d r1 = r1.a(r0, r5)
                java.lang.String r0 = "group_id"
                com.ss.android.ugc.aweme.app.f.d r0 = r1.a(r0, r6)
                java.util.Map<java.lang.String, java.lang.String> r1 = r0.f66730a
                java.lang.String r0 = "cancel_favourite_video"
                com.ss.android.ugc.aweme.common.r.a(r0, r1)
                goto L_0x000f
            */
            throw new UnsupportedOperationException("Method not decompiled: com.ss.android.ugc.aweme.favorites.ui.r.b.onClick(android.view.View):void");
        }
    }

    @Override // androidx.fragment.app.Fragment
    public final void onViewCreated(View view, Bundle bundle) {
        l.d(view, "");
        super.onViewCreated(view, bundle);
        this.f90934c.a_(this);
        view.findViewById(R.id.fbp).setOnClickListener(new b(this));
        view.findViewById(R.id.fbm).setOnClickListener(new c(this));
    }

    @Override // androidx.fragment.app.Fragment
    public final View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        l.d(layoutInflater, "");
        return com.a.a(layoutInflater, R.layout.ry, viewGroup, false);
    }
}
