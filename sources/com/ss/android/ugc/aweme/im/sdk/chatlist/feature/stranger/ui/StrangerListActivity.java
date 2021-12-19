package com.ss.android.ugc.aweme.im.sdk.chatlist.feature.stranger.ui;

import android.os.Build;
import android.os.Bundle;
import android.view.View;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import com.bytedance.apm.agent.v2.instrumentation.ActivityAgent;
import com.bytedance.covode.number.Covode;
import com.bytedance.ies.foundation.activity.BaseActivityViewModel;
import com.bytedance.ies.im.core.api.b.i;
import com.bytedance.sysoptimizer.EnterTransitionCrashOptimizer;
import com.bytedance.tux.navigation.TuxNavBar;
import com.bytedance.tux.navigation.a.g;
import com.bytedance.tux.status.TuxStatusView;
import com.ss.android.ugc.aweme.base.f;
import com.ss.android.ugc.aweme.base.utils.f;
import com.ss.android.ugc.aweme.common.a.h;
import com.zhiliaoapp.musically.R;
import h.c.b.a.k;
import h.f.b.j;
import h.f.b.l;
import h.f.b.m;
import h.r;
import h.z;
import java.util.HashMap;
import kotlinx.coroutines.am;
import kotlinx.coroutines.an;
import kotlinx.coroutines.ay;
import kotlinx.coroutines.bz;

public final class StrangerListActivity extends com.bytedance.ies.foundation.activity.a implements f, h.a {

    /* renamed from: a  reason: collision with root package name */
    public static final a f102003a = new a((byte) 0);

    /* renamed from: b  reason: collision with root package name */
    private d f102004b;

    /* renamed from: c  reason: collision with root package name */
    private i f102005c;

    /* renamed from: d  reason: collision with root package name */
    private HashMap f102006d;

    static {
        Covode.recordClassIndex(65267);
    }

    @Override // com.bytedance.ies.foundation.activity.a, com.bytedance.ies.powerpage.a
    public final void _$_clearFindViewByIdCache() {
        HashMap hashMap = this.f102006d;
        if (hashMap != null) {
            hashMap.clear();
        }
    }

    @Override // com.bytedance.ies.foundation.activity.a, com.bytedance.ies.powerpage.a
    public final View _$_findCachedViewById(int i2) {
        if (this.f102006d == null) {
            this.f102006d = new HashMap();
        }
        View view = (View) this.f102006d.get(Integer.valueOf(i2));
        if (view != null) {
            return view;
        }
        View findViewById = findViewById(i2);
        this.f102006d.put(Integer.valueOf(i2), findViewById);
        return findViewById;
    }

    @Override // com.ss.android.ugc.aweme.base.f
    public final String c() {
        return "message_box";
    }

    @Override // androidx.fragment.app.e, com.bytedance.ies.foundation.activity.a
    public final void onPause() {
        com.bytedance.helios.sdk.utils.a.c(this);
        super.onPause();
    }

    @Override // androidx.fragment.app.e, com.bytedance.ies.foundation.activity.a
    public final void onResume() {
        com.bytedance.helios.sdk.utils.a.b(this);
        ActivityAgent.onTrace("com.ss.android.ugc.aweme.im.sdk.chatlist.feature.stranger.ui.StrangerListActivity", "onResume", true);
        super.onResume();
        ActivityAgent.onTrace("com.ss.android.ugc.aweme.im.sdk.chatlist.feature.stranger.ui.StrangerListActivity", "onResume", false);
    }

    @Override // androidx.fragment.app.e, com.bytedance.ies.foundation.activity.a, androidx.appcompat.app.d
    public final void onStart() {
        com.bytedance.helios.sdk.utils.a.a(this);
        super.onStart();
    }

    @Override // com.bytedance.ies.foundation.activity.a
    public final void onWindowFocusChanged(boolean z) {
        ActivityAgent.onTrace("com.ss.android.ugc.aweme.im.sdk.chatlist.feature.stranger.ui.StrangerListActivity", "onWindowFocusChanged", true);
        super.onWindowFocusChanged(z);
    }

    public static final class a {
        static {
            Covode.recordClassIndex(65268);
        }

        private a() {
        }

        public /* synthetic */ a(byte b2) {
            this();
        }
    }

    static final class c extends m implements h.f.a.a<z> {
        final /* synthetic */ StrangerListActivity this$0;

        static {
            Covode.recordClassIndex(65270);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        c(StrangerListActivity strangerListActivity) {
            super(0);
            this.this$0 = strangerListActivity;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        @Override // h.f.a.a
        public final /* synthetic */ z invoke() {
            this.this$0.onBackPressed();
            return z.f158842a;
        }
    }

    static final /* synthetic */ class b extends j implements h.f.a.a<z> {
        static {
            Covode.recordClassIndex(65269);
        }

        b(StrangerListActivity strangerListActivity) {
            super(0, strangerListActivity, StrangerListActivity.class, "refreshData", "refreshData()V", 0);
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        @Override // h.f.a.a
        public final /* synthetic */ z invoke() {
            ((StrangerListActivity) this.receiver).a();
            return z.f158842a;
        }
    }

    private static boolean b() {
        try {
            return f.a.f68431a.c();
        } catch (Exception unused) {
            return false;
        }
    }

    private static boolean d() {
        if (com.ss.android.ugc.aweme.lancet.j.f107226e && com.ss.android.ugc.aweme.lancet.j.b() && !com.ss.android.ugc.aweme.lancet.j.c()) {
            return com.ss.android.ugc.aweme.lancet.j.f107226e;
        }
        boolean b2 = b();
        com.ss.android.ugc.aweme.lancet.j.f107226e = b2;
        return b2;
    }

    @Override // com.ss.android.ugc.aweme.common.a.h.a
    public final void l() {
        i iVar = this.f102005c;
        if (iVar == null) {
            l.a("strangerModel");
        }
        if (!iVar.a()) {
            d dVar = this.f102004b;
            if (dVar == null) {
                l.a("adapter");
            }
            dVar.ag_();
            i iVar2 = this.f102005c;
            if (iVar2 == null) {
                l.a("strangerModel");
            }
            iVar2.d();
        }
    }

    @Override // androidx.fragment.app.e, com.bytedance.ies.foundation.activity.a, androidx.appcompat.app.d
    public final void onDestroy() {
        com.bytedance.helios.sdk.utils.a.e(this);
        super.onDestroy();
        i iVar = this.f102005c;
        if (iVar == null) {
            l.a("strangerModel");
        }
        iVar.b();
        d dVar = this.f102004b;
        if (dVar == null) {
            l.a("adapter");
        }
        an.b(dVar.f102014a);
        if (_$_findCachedViewById(R.id.ecl) != null) {
            RecyclerView recyclerView = (RecyclerView) _$_findCachedViewById(R.id.ecl);
            l.b(recyclerView, "");
            recyclerView.setAdapter(null);
        }
    }

    @Override // androidx.fragment.app.e, com.bytedance.ies.foundation.activity.a, androidx.appcompat.app.d
    public final void onStop() {
        com.bytedance.helios.sdk.utils.a.d(this);
        super.onStop();
        if (EnterTransitionCrashOptimizer.getContext() != null && Build.VERSION.SDK_INT >= 21) {
            try {
                getWindow().getDecorView().getViewTreeObserver().dispatchOnPreDraw();
            } catch (Throwable unused) {
            }
        }
        if (Build.VERSION.SDK_INT >= 21) {
            try {
                getWindow().getDecorView().getViewTreeObserver().dispatchOnPreDraw();
            } catch (Throwable unused2) {
            }
        }
    }

    public final void a() {
        i iVar = this.f102005c;
        if (iVar == null) {
            l.a("strangerModel");
        }
        if (!iVar.a()) {
            if (d()) {
                d dVar = this.f102004b;
                if (dVar == null) {
                    l.a("adapter");
                }
                if (dVar.getItemCount() == 0) {
                    ((TuxStatusView) _$_findCachedViewById(R.id.e_o)).a();
                }
                i iVar2 = this.f102005c;
                if (iVar2 == null) {
                    l.a("strangerModel");
                }
                iVar2.c();
                return;
            }
            d dVar2 = this.f102004b;
            if (dVar2 == null) {
                l.a("adapter");
            }
            if (dVar2.getItemCount() == 0) {
                bz unused = kotlinx.coroutines.i.a(an.a(com.ss.android.ugc.aweme.af.a.f66269a), null, null, new e(this, null), 3);
            }
        }
    }

    static final class d extends m implements h.f.a.b<BaseActivityViewModel, z> {

        /* renamed from: a  reason: collision with root package name */
        public static final d f102007a = new d();

        static {
            Covode.recordClassIndex(65271);
        }

        d() {
            super(1);
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
        @Override // h.f.a.b
        public final /* synthetic */ z invoke(BaseActivityViewModel baseActivityViewModel) {
            BaseActivityViewModel baseActivityViewModel2 = baseActivityViewModel;
            l.d(baseActivityViewModel2, "");
            baseActivityViewModel2.config(AnonymousClass1.f102008a);
            return z.f158842a;
        }
    }

    /* access modifiers changed from: package-private */
    public static final class e extends k implements h.f.a.m<am, h.c.d<? super z>, Object> {
        int label;
        final /* synthetic */ StrangerListActivity this$0;

        static {
            Covode.recordClassIndex(65273);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        e(StrangerListActivity strangerListActivity, h.c.d dVar) {
            super(2, dVar);
            this.this$0 = strangerListActivity;
        }

        @Override // h.c.b.a.a
        public final h.c.d<z> create(Object obj, h.c.d<?> dVar) {
            l.d(dVar, "");
            return new e(this.this$0, dVar);
        }

        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object, java.lang.Object] */
        @Override // h.f.a.m
        public final Object invoke(am amVar, h.c.d<? super z> dVar) {
            return ((e) create(amVar, dVar)).invokeSuspend(z.f158842a);
        }

        @Override // h.c.b.a.a
        public final Object invokeSuspend(Object obj) {
            h.c.a.a aVar = h.c.a.a.COROUTINE_SUSPENDED;
            int i2 = this.label;
            if (i2 == 0) {
                r.a(obj);
                this.label = 1;
                if (ay.a(100, this) == aVar) {
                    return aVar;
                }
            } else if (i2 == 1) {
                r.a(obj);
            } else {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            if (this.this$0.isDestroyed()) {
                return z.f158842a;
            }
            ((TuxStatusView) this.this$0._$_findCachedViewById(R.id.e_o)).setStatus(com.ss.android.ugc.aweme.tux.a.g.a.a(new TuxStatusView.c(), new h.f.a.a<z>(this) {
                /* class com.ss.android.ugc.aweme.im.sdk.chatlist.feature.stranger.ui.StrangerListActivity.e.AnonymousClass1 */
                final /* synthetic */ e this$0;

                static {
                    Covode.recordClassIndex(65274);
                }

                {
                    this.this$0 = r2;
                }

                /* Return type fixed from 'java.lang.Object' to match base method */
                @Override // h.f.a.a
                public final /* synthetic */ z invoke() {
                    this.this$0.this$0.a();
                    return z.f158842a;
                }
            }));
            new com.bytedance.tux.g.b(this.this$0).e(R.string.de8).b();
            return z.f158842a;
        }
    }

    @Override // androidx.core.app.d, androidx.fragment.app.e, com.bytedance.ies.foundation.activity.a, androidx.appcompat.app.d, com.bytedance.ies.powerpage.a
    public final void onCreate(Bundle bundle) {
        com.bytedance.helios.sdk.utils.a.a(this, bundle);
        ActivityAgent.onTrace("com.ss.android.ugc.aweme.im.sdk.chatlist.feature.stranger.ui.StrangerListActivity", "onCreate", true);
        activityConfiguration(d.f102007a);
        super.onCreate(bundle);
        setContentView(R.layout.a4c);
        com.ss.android.ugc.aweme.im.sdk.common.controller.e.b.d().setupStatusBar(this);
        com.ss.android.ugc.aweme.im.sdk.common.controller.e.b.f();
        TuxNavBar.a a2 = new TuxNavBar.a().a(new com.bytedance.tux.navigation.a.b().a(R.raw.icon_arrow_left_ltr).a((h.f.a.a<z>) new c(this)));
        g gVar = new g();
        String string = getString(R.string.d44);
        l.b(string, "");
        TuxNavBar.a a3 = a2.a(gVar.a(string));
        a3.f45188d = true;
        ((TuxNavBar) _$_findCachedViewById(R.id.csl)).setNavActions(a3);
        RecyclerView recyclerView = (RecyclerView) _$_findCachedViewById(R.id.ecl);
        l.b(recyclerView, "");
        recyclerView.setLayoutManager(new LinearLayoutManager());
        TuxStatusView tuxStatusView = (TuxStatusView) _$_findCachedViewById(R.id.e_o);
        l.b(tuxStatusView, "");
        this.f102004b = new d(tuxStatusView, this, new com.ss.android.ugc.aweme.im.sdk.chatlist.controller.b.b(this, "message_box", "cell"), new b(this));
        RecyclerView recyclerView2 = (RecyclerView) _$_findCachedViewById(R.id.ecl);
        l.b(recyclerView2, "");
        d dVar = this.f102004b;
        if (dVar == null) {
            l.a("adapter");
        }
        recyclerView2.setAdapter(dVar);
        ((RecyclerView) _$_findCachedViewById(R.id.ecl)).a(new com.ss.android.ugc.aweme.framework.b.a(this));
        d dVar2 = this.f102004b;
        if (dVar2 == null) {
            l.a("adapter");
        }
        dVar2.a((h.a) this);
        d dVar3 = this.f102004b;
        if (dVar3 == null) {
            l.a("adapter");
        }
        dVar3.d(com.ss.android.ugc.aweme.im.sdk.common.controller.e.b.d().needSessionListShowMore());
        i c2 = com.bytedance.ies.im.core.api.c.f33958a.c();
        this.f102005c = c2;
        if (c2 == null) {
            l.a("strangerModel");
        }
        d dVar4 = this.f102004b;
        if (dVar4 == null) {
            l.a("adapter");
        }
        c2.a(dVar4);
        a();
        ActivityAgent.onTrace("com.ss.android.ugc.aweme.im.sdk.chatlist.feature.stranger.ui.StrangerListActivity", "onCreate", false);
    }
}
