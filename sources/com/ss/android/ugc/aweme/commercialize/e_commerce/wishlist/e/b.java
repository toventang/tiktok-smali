package com.ss.android.ugc.aweme.commercialize.e_commerce.wishlist.e;

import android.app.Activity;
import android.content.Context;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import androidx.fragment.app.n;
import com.bytedance.apm.agent.v2.instrumentation.ClickAgent;
import com.bytedance.covode.number.Covode;
import com.bytedance.ies.bullet.ui.common.BulletActivityWrapper;
import com.bytedance.ies.bullet.ui.common.d;
import com.bytedance.ies.dmt.ui.widget.DmtStatusView;
import com.bytedance.ies.dmt.ui.widget.d;
import com.bytedance.ies.dmt.ui.widget.e;
import com.ss.android.ugc.aweme.base.utils.f;
import com.ss.android.ugc.aweme.bullet.impl.BulletService;
import com.ss.android.ugc.aweme.commercialize.e_commerce.wishlist.manager.b;
import com.ss.android.ugc.aweme.common.r;
import com.ss.android.ugc.aweme.lancet.j;
import com.ss.android.ugc.aweme.views.h;
import com.zhiliaoapp.musically.R;
import f.a.t;
import h.f.b.l;
import h.f.b.m;
import h.z;
import java.util.HashMap;
import java.util.Objects;

public final class b extends a implements com.ss.android.ugc.aweme.commercialize.e_commerce.wishlist.a.a {

    /* renamed from: c  reason: collision with root package name */
    public static final a f73876c = new a((byte) 0);

    /* renamed from: a  reason: collision with root package name */
    public com.ss.android.ugc.aweme.commercialize.e_commerce.wishlist.manager.b f73877a;

    /* renamed from: b  reason: collision with root package name */
    public com.bytedance.ies.bullet.ui.common.d f73878b;

    /* renamed from: d  reason: collision with root package name */
    private DmtStatusView f73879d;

    /* renamed from: e  reason: collision with root package name */
    private FrameLayout f73880e;

    /* renamed from: j  reason: collision with root package name */
    private boolean f73881j;

    /* renamed from: k  reason: collision with root package name */
    private h.f.a.a<? extends Object> f73882k;

    /* renamed from: l  reason: collision with root package name */
    private HashMap f73883l;

    static {
        Covode.recordClassIndex(45512);
    }

    public static final class a {
        static {
            Covode.recordClassIndex(45513);
        }

        private a() {
        }

        public /* synthetic */ a(byte b2) {
            this();
        }
    }

    private static boolean e() {
        try {
            return f.a.f68431a.c();
        } catch (Exception unused) {
            return false;
        }
    }

    public final com.ss.android.ugc.aweme.commercialize.e_commerce.wishlist.manager.b d() {
        com.ss.android.ugc.aweme.commercialize.e_commerce.wishlist.manager.b bVar = this.f73877a;
        if (bVar == null) {
            l.a("wishListManager");
        }
        return bVar;
    }

    @Override // com.ss.android.ugc.aweme.base.f.a, com.bytedance.ies.uikit.a.b, androidx.fragment.app.Fragment
    public final /* synthetic */ void onDestroyView() {
        super.onDestroyView();
        HashMap hashMap = this.f73883l;
        if (hashMap != null) {
            hashMap.clear();
        }
    }

    @Override // com.ss.android.ugc.b.a.a.a, com.bytedance.ies.uikit.a.b, androidx.fragment.app.Fragment
    public final void onPause() {
        super.onPause();
        if (getUserVisibleHint()) {
            r.onEventV3("ads_wishlist_tab_exit");
        }
    }

    @Override // com.ss.android.ugc.b.a.a.a, com.bytedance.ies.uikit.a.b, androidx.fragment.app.Fragment
    public final void onResume() {
        super.onResume();
        if (getUserVisibleHint()) {
            r.onEventV3("ads_wishlist_tab_enter");
        }
    }

    static final class d extends m implements h.f.a.a<z> {
        final /* synthetic */ b this$0;

        static {
            Covode.recordClassIndex(45516);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        d(b bVar) {
            super(0);
            this.this$0 = bVar;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        @Override // h.f.a.a
        public final /* synthetic */ z invoke() {
            com.ss.android.ugc.aweme.commercialize.e_commerce.wishlist.manager.b d2 = this.this$0.d();
            com.bytedance.ies.bullet.ui.common.d dVar = this.this$0.f73878b;
            if (dVar == null) {
                l.a("bulletContainerFragment");
            }
            d2.a(dVar);
            return z.f158842a;
        }
    }

    private static boolean g() {
        if (j.f107226e && j.b() && !j.c()) {
            return j.f107226e;
        }
        boolean e2 = e();
        j.f107226e = e2;
        return e2;
    }

    @Override // com.ss.android.ugc.aweme.commercialize.e_commerce.wishlist.a.a
    public final void a() {
        DmtStatusView dmtStatusView = this.f73879d;
        if (dmtStatusView == null) {
            l.a("dmtStatusView");
        }
        dmtStatusView.f();
        FrameLayout frameLayout = this.f73880e;
        if (frameLayout == null) {
            l.a("wishListContentContainer");
        }
        frameLayout.setVisibility(8);
    }

    @Override // com.ss.android.ugc.b.a.a.a, com.bytedance.ies.uikit.a.b, androidx.fragment.app.Fragment
    public final void onDestroy() {
        super.onDestroy();
        com.ss.android.ugc.aweme.commercialize.e_commerce.wishlist.manager.b bVar = this.f73877a;
        if (bVar == null) {
            l.a("wishListManager");
        }
        bVar.f73898a.dispose();
        bVar.f73903f.a().c();
    }

    @Override // com.ss.android.ugc.aweme.commercialize.e_commerce.wishlist.a.a
    public final void b() {
        getContext();
        if (g()) {
            DmtStatusView dmtStatusView = this.f73879d;
            if (dmtStatusView == null) {
                l.a("dmtStatusView");
            }
            dmtStatusView.h();
        } else {
            DmtStatusView dmtStatusView2 = this.f73879d;
            if (dmtStatusView2 == null) {
                l.a("dmtStatusView");
            }
            dmtStatusView2.i();
        }
        FrameLayout frameLayout = this.f73880e;
        if (frameLayout == null) {
            l.a("wishListContentContainer");
        }
        frameLayout.setVisibility(8);
    }

    @Override // com.ss.android.ugc.aweme.commercialize.e_commerce.wishlist.a.a
    public final void c() {
        getContext();
        if (g()) {
            DmtStatusView dmtStatusView = this.f73879d;
            if (dmtStatusView == null) {
                l.a("dmtStatusView");
            }
            dmtStatusView.setVisibility(8);
            FrameLayout frameLayout = this.f73880e;
            if (frameLayout == null) {
                l.a("wishListContentContainer");
            }
            frameLayout.setVisibility(0);
            return;
        }
        DmtStatusView dmtStatusView2 = this.f73879d;
        if (dmtStatusView2 == null) {
            l.a("dmtStatusView");
        }
        dmtStatusView2.i();
        FrameLayout frameLayout2 = this.f73880e;
        if (frameLayout2 == null) {
            l.a("wishListContentContainer");
        }
        frameLayout2.setVisibility(8);
    }

    /* renamed from: com.ss.android.ugc.aweme.commercialize.e_commerce.wishlist.e.b$b  reason: collision with other inner class name */
    static final class View$OnClickListenerC1659b implements View.OnClickListener {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ b f73884a;

        static {
            Covode.recordClassIndex(45514);
        }

        View$OnClickListenerC1659b(b bVar) {
            this.f73884a = bVar;
        }

        public final void onClick(View view) {
            ClickAgent.onClick(view);
            this.f73884a.d().a();
        }
    }

    static final class c implements View.OnClickListener {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ b f73885a;

        static {
            Covode.recordClassIndex(45515);
        }

        c(b bVar) {
            this.f73885a = bVar;
        }

        public final void onClick(View view) {
            ClickAgent.onClick(view);
            this.f73885a.d().a();
        }
    }

    @Override // androidx.fragment.app.Fragment
    public final void setUserVisibleHint(boolean z) {
        super.setUserVisibleHint(z);
        if (z) {
            if (this.f73877a == null || this.f73878b == null) {
                this.f73882k = new d(this);
            } else {
                com.ss.android.ugc.aweme.commercialize.e_commerce.wishlist.manager.b bVar = this.f73877a;
                if (bVar == null) {
                    l.a("wishListManager");
                }
                com.bytedance.ies.bullet.ui.common.d dVar = this.f73878b;
                if (dVar == null) {
                    l.a("bulletContainerFragment");
                }
                bVar.a(dVar);
            }
            this.f73881j = true;
            r.onEventV3("ads_wishlist_tab_enter");
        } else if (this.f73881j) {
            r.onEventV3("ads_wishlist_tab_exit");
        }
    }

    @Override // com.ss.android.ugc.aweme.base.f.a, com.bytedance.ies.uikit.a.b, androidx.fragment.app.Fragment
    public final void onViewCreated(View view, Bundle bundle) {
        l.d(view, "");
        super.onViewCreated(view, bundle);
        l.d(view, "");
        View findViewById = view.findViewById(R.id.fn9);
        l.b(findViewById, "");
        this.f73879d = (DmtStatusView) findViewById;
        com.bytedance.ies.dmt.ui.widget.d dVar = new d.a(getContext()).a(2131232658).b(R.string.hfc).b("").a(com.bytedance.ies.dmt.ui.widget.a.BORDER, R.string.hfe, new View$OnClickListenerC1659b(this)).f33648a;
        com.bytedance.ies.dmt.ui.widget.d a2 = h.a(getContext(), new c(this));
        DmtStatusView dmtStatusView = this.f73879d;
        if (dmtStatusView == null) {
            l.a("dmtStatusView");
        }
        DmtStatusView.a b2 = DmtStatusView.a.a(getContext()).b(dVar);
        e eVar = new e(b2.f33599a);
        eVar.setLayoutParams(new FrameLayout.LayoutParams(-1, -1));
        eVar.setStatus(a2);
        b2.f33603e = eVar;
        dmtStatusView.setBuilder(b2);
        View findViewById2 = view.findViewById(R.id.fn8);
        l.b(findViewById2, "");
        this.f73880e = (FrameLayout) findViewById2;
        com.bytedance.ies.bullet.ui.common.d dVar2 = new com.bytedance.ies.bullet.ui.common.d();
        d.a a3 = new d.a(dVar2).a(BulletService.f().a());
        Context a4 = dagger.hilt.android.internal.managers.e.a(view.getContext());
        Objects.requireNonNull(a4, "null cannot be cast to non-null type android.app.Activity");
        a3.a(new BulletActivityWrapper((Activity) a4)).a();
        this.f73878b = dVar2;
        n a5 = getChildFragmentManager().a();
        l.b(a5, "");
        com.bytedance.ies.bullet.ui.common.d dVar3 = this.f73878b;
        if (dVar3 == null) {
            l.a("bulletContainerFragment");
        }
        a5.b(R.id.fn8, dVar3).b();
        com.ss.android.ugc.aweme.commercialize.e_commerce.wishlist.manager.b bVar = this.f73877a;
        if (bVar == null) {
            l.a("wishListManager");
        }
        l.d(this, "");
        f.a.b.b a6 = bVar.f73899b.c().a(b.e.f73910a).b(f.a.h.a.b(f.a.k.a.f158006c)).a(new b.f(bVar), b.g.f73912a);
        l.b(a6, "");
        f.a.j.a.a(a6, bVar.f73898a);
        f.a.b.b a7 = t.a(bVar.f73899b.c(), bVar.f73903f.a().b(), bVar.f73900c.c()).b(f.a.h.a.b(f.a.k.a.f158006c)).a(f.a.a.a.a.a(f.a.a.b.a.f157156a)).a(new b.h(this), b.i.f73914a);
        l.b(a7, "");
        f.a.j.a.a(a7, bVar.f73898a);
        com.ss.android.ugc.aweme.commercialize.e_commerce.wishlist.manager.b bVar2 = this.f73877a;
        if (bVar2 == null) {
            l.a("wishListManager");
        }
        bVar2.a();
        h.f.a.a<? extends Object> aVar = this.f73882k;
        if (aVar != null) {
            aVar.invoke();
        }
        this.f73882k = null;
    }

    @Override // com.ss.android.ugc.b.a.a.a, androidx.fragment.app.Fragment
    public final View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        l.d(layoutInflater, "");
        return com.a.a(layoutInflater, R.layout.a1w, viewGroup, false);
    }
}
