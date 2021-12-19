package com.ss.android.ugc.aweme.notification;

import android.os.Build;
import android.os.Bundle;
import android.util.SparseArray;
import android.view.View;
import android.widget.FrameLayout;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import androidx.recyclerview.widget.ab;
import com.bytedance.apm.agent.v2.instrumentation.ActivityAgent;
import com.bytedance.apm.agent.v2.instrumentation.ClickAgent;
import com.bytedance.covode.number.Covode;
import com.bytedance.ies.dmt.ui.widget.AutoRTLImageView;
import com.bytedance.ies.foundation.activity.BaseActivityViewModel;
import com.bytedance.router.arg.RouteArgExtension;
import com.bytedance.sysoptimizer.EnterTransitionCrashOptimizer;
import com.bytedance.tux.status.TuxStatusView;
import com.ss.android.ugc.aweme.base.utils.f;
import com.ss.android.ugc.aweme.ck.t;
import com.ss.android.ugc.aweme.ck.u;
import com.ss.android.ugc.aweme.common.a.h;
import com.ss.android.ugc.aweme.common.r;
import com.ss.android.ugc.aweme.inbox.d.j;
import com.ss.android.ugc.aweme.notification.model.TranslationLikeListModel;
import com.ss.android.ugc.aweme.profile.model.User;
import com.zhiliaoapp.musically.R;
import h.z;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.Objects;

public final class TranslationLikeListDetailActivity extends com.bytedance.ies.foundation.activity.a implements h.a, com.ss.android.ugc.aweme.common.e.c<User> {

    /* renamed from: c  reason: collision with root package name */
    public static final a f113008c = new a((byte) 0);

    /* renamed from: m  reason: collision with root package name */
    private static final int f113009m = ((int) com.bytedance.common.utility.n.b(com.bytedance.ies.ugc.appcontext.d.a(), 8.0f));

    /* renamed from: a  reason: collision with root package name */
    final h.h f113010a = RouteArgExtension.INSTANCE.optionalArgNotNull(this, j.f113028a, "last_read_time", Long.class);

    /* renamed from: b  reason: collision with root package name */
    final h.h f113011b = RouteArgExtension.INSTANCE.optionalArgNotNull(this, m.f113030a, "subtitle_id", String.class);

    /* renamed from: d  reason: collision with root package name */
    private final h.h f113012d = h.i.a(h.m.NONE, e.f113023a);

    /* renamed from: e  reason: collision with root package name */
    private final h.h f113013e = h.i.a(h.m.NONE, new l(this));

    /* renamed from: f  reason: collision with root package name */
    private final h.h f113014f = RouteArgExtension.INSTANCE.optionalArg(this, k.f113029a, "nid", String.class);

    /* renamed from: g  reason: collision with root package name */
    private final h.h f113015g = RouteArgExtension.INSTANCE.optionalArgNotNull(this, f.f113024a, "aweme_id", String.class);

    /* renamed from: h  reason: collision with root package name */
    private final h.h f113016h = RouteArgExtension.INSTANCE.optionalArgNotNull(this, h.f113026a, "digg_type", Integer.class);

    /* renamed from: i  reason: collision with root package name */
    private final h.h f113017i = RouteArgExtension.INSTANCE.optionalArg(this, g.f113025a, "cover_url", String.class);

    /* renamed from: j  reason: collision with root package name */
    private final h.h f113018j = RouteArgExtension.INSTANCE.optionalArg(this, n.f113031a, "tab_name", String.class);

    /* renamed from: k  reason: collision with root package name */
    private final h.h f113019k = RouteArgExtension.INSTANCE.optionalArg(this, i.f113027a, "item_url", String.class);

    /* renamed from: l  reason: collision with root package name */
    private List<? extends User> f113020l;
    private SparseArray n;

    private final com.ss.android.ugc.aweme.notification.adapter.k d() {
        return (com.ss.android.ugc.aweme.notification.adapter.k) this.f113012d.getValue();
    }

    private final com.ss.android.ugc.aweme.notification.f.d h() {
        return (com.ss.android.ugc.aweme.notification.f.d) this.f113013e.getValue();
    }

    @Override // com.bytedance.ies.foundation.activity.a, com.bytedance.ies.powerpage.a
    public final void _$_clearFindViewByIdCache() {
        SparseArray sparseArray = this.n;
        if (sparseArray != null) {
            sparseArray.clear();
        }
    }

    @Override // com.bytedance.ies.foundation.activity.a, com.bytedance.ies.powerpage.a
    public final View _$_findCachedViewById(int i2) {
        if (this.n == null) {
            this.n = new SparseArray();
        }
        View view = (View) this.n.get(i2);
        if (view != null) {
            return view;
        }
        View findViewById = findViewById(i2);
        this.n.put(i2, findViewById);
        return findViewById;
    }

    public final String a() {
        return (String) this.f113015g.getValue();
    }

    @Override // com.ss.android.ugc.aweme.common.e.c
    public final void a(Exception exc) {
    }

    @Override // com.ss.android.ugc.aweme.common.e.c
    public final void bh_() {
    }

    @Override // com.ss.android.ugc.aweme.common.e.c
    public final void c(List<User> list, boolean z) {
    }

    @Override // androidx.fragment.app.e, com.bytedance.ies.foundation.activity.a
    public final void onPause() {
        com.bytedance.helios.sdk.utils.a.c(this);
        super.onPause();
    }

    @Override // androidx.fragment.app.e, com.bytedance.ies.foundation.activity.a
    public final void onResume() {
        com.bytedance.helios.sdk.utils.a.b(this);
        ActivityAgent.onTrace("com.ss.android.ugc.aweme.notification.TranslationLikeListDetailActivity", "onResume", true);
        super.onResume();
        ActivityAgent.onTrace("com.ss.android.ugc.aweme.notification.TranslationLikeListDetailActivity", "onResume", false);
    }

    @Override // androidx.fragment.app.e, com.bytedance.ies.foundation.activity.a, androidx.appcompat.app.d
    public final void onStart() {
        com.bytedance.helios.sdk.utils.a.a(this);
        super.onStart();
    }

    @Override // com.bytedance.ies.foundation.activity.a
    public final void onWindowFocusChanged(boolean z) {
        ActivityAgent.onTrace("com.ss.android.ugc.aweme.notification.TranslationLikeListDetailActivity", "onWindowFocusChanged", true);
        super.onWindowFocusChanged(z);
    }

    public static final class a {
        static {
            Covode.recordClassIndex(72656);
        }

        private a() {
        }

        public /* synthetic */ a(byte b2) {
            this();
        }
    }

    static final class e extends h.f.b.m implements h.f.a.a<com.ss.android.ugc.aweme.notification.adapter.k> {

        /* renamed from: a  reason: collision with root package name */
        public static final e f113023a = new e();

        static {
            Covode.recordClassIndex(72661);
        }

        e() {
            super(0);
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        @Override // h.f.a.a
        public final /* synthetic */ com.ss.android.ugc.aweme.notification.adapter.k invoke() {
            return new com.ss.android.ugc.aweme.notification.adapter.k((byte) 0);
        }
    }

    @Override // com.ss.android.ugc.aweme.common.e.c
    public final void aO_() {
        d().ag_();
    }

    static final /* synthetic */ class p extends h.f.b.j implements h.f.a.a<z> {
        static {
            Covode.recordClassIndex(72673);
        }

        p(TranslationLikeListDetailActivity translationLikeListDetailActivity) {
            super(0, translationLikeListDetailActivity, TranslationLikeListDetailActivity.class, "doRefresh", "doRefresh()V", 0);
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        @Override // h.f.a.a
        public final /* synthetic */ z invoke() {
            ((TranslationLikeListDetailActivity) this.receiver).c();
            return z.f158842a;
        }
    }

    private static boolean i() {
        try {
            return f.a.f68431a.c();
        } catch (Exception unused) {
            return false;
        }
    }

    private final void k() {
        d().ah_();
        d().d(false);
    }

    @Override // androidx.fragment.app.e, com.bytedance.ies.foundation.activity.a, androidx.appcompat.app.d
    public final void onDestroy() {
        com.bytedance.helios.sdk.utils.a.e(this);
        super.onDestroy();
        h().cd_();
    }

    static {
        Covode.recordClassIndex(72655);
    }

    private static boolean j() {
        if (com.ss.android.ugc.aweme.lancet.j.f107226e && com.ss.android.ugc.aweme.lancet.j.b() && !com.ss.android.ugc.aweme.lancet.j.c()) {
            return com.ss.android.ugc.aweme.lancet.j.f107226e;
        }
        boolean i2 = i();
        com.ss.android.ugc.aweme.lancet.j.f107226e = i2;
        return i2;
    }

    @Override // com.ss.android.ugc.aweme.common.e.c
    public final void b() {
        TuxStatusView tuxStatusView = (TuxStatusView) _$_findCachedViewById(R.id.e_o);
        h.f.b.l.b(tuxStatusView, "");
        tuxStatusView.setVisibility(0);
        ((TuxStatusView) _$_findCachedViewById(R.id.e_o)).a();
    }

    @Override // com.ss.android.ugc.aweme.common.a.h.a
    public final void l() {
        com.ss.android.ugc.aweme.notification.f.d h2 = h();
        TranslationLikeListModel translationLikeListModel = (TranslationLikeListModel) h2.f76396h;
        if (translationLikeListModel != null) {
            translationLikeListModel.loadMore();
        }
        h2.b();
    }

    static final class d extends h.f.b.m implements h.f.a.a<z> {
        final /* synthetic */ TranslationLikeListDetailActivity this$0;

        static {
            Covode.recordClassIndex(72660);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        d(TranslationLikeListDetailActivity translationLikeListDetailActivity) {
            super(0);
            this.this$0 = translationLikeListDetailActivity;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        @Override // h.f.a.a
        public final /* synthetic */ z invoke() {
            t.a(t.a(), u.a("aweme://aweme/detail/" + this.this$0.a()).a("refer", "message").a());
            return z.f158842a;
        }
    }

    static final class l extends h.f.b.m implements h.f.a.a<com.ss.android.ugc.aweme.notification.f.d> {
        final /* synthetic */ TranslationLikeListDetailActivity this$0;

        static {
            Covode.recordClassIndex(72668);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        l(TranslationLikeListDetailActivity translationLikeListDetailActivity) {
            super(0);
            this.this$0 = translationLikeListDetailActivity;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        @Override // h.f.a.a
        public final /* synthetic */ com.ss.android.ugc.aweme.notification.f.d invoke() {
            com.ss.android.ugc.aweme.notification.f.d dVar = new com.ss.android.ugc.aweme.notification.f.d();
            dVar.a(new TranslationLikeListModel((String) this.this$0.f113011b.getValue(), this.this$0.a(), ((Number) this.this$0.f113010a.getValue()).longValue()));
            dVar.a_(this.this$0);
            return dVar;
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

    public final void c() {
        if (j()) {
            if (d().getItemCount() == 0) {
                TuxStatusView tuxStatusView = (TuxStatusView) _$_findCachedViewById(R.id.e_o);
                h.f.b.l.b(tuxStatusView, "");
                tuxStatusView.setVisibility(0);
                ((TuxStatusView) _$_findCachedViewById(R.id.e_o)).a();
            }
            h().e();
            com.ss.android.ugc.aweme.inbox.d.j.a();
            return;
        }
        if (d().getItemCount() == 0) {
            b.i.a(100).a(new c(this), b.i.f4826c, null);
        }
        com.ss.android.ugc.aweme.inbox.d.j.f104183a = null;
    }

    @Override // com.ss.android.ugc.aweme.common.e.c
    public final void f() {
        if (d().v) {
            d().d(false);
            d().notifyDataSetChanged();
            k();
        }
        if (d().getItemCount() == 0) {
            TuxStatusView tuxStatusView = (TuxStatusView) _$_findCachedViewById(R.id.e_o);
            h.f.b.l.b(tuxStatusView, "");
            tuxStatusView.setVisibility(0);
            TuxStatusView.c cVar = new TuxStatusView.c();
            String string = getString(R.string.cfg);
            h.f.b.l.b(string, "");
            TuxStatusView.c a2 = cVar.a(string);
            String string2 = getString(R.string.cff);
            h.f.b.l.b(string2, "");
            ((TuxStatusView) _$_findCachedViewById(R.id.e_o)).setStatus(a2.a((CharSequence) string2));
        }
        com.ss.android.ugc.aweme.inbox.d.j.a(0);
    }

    static final class f extends h.f.b.m implements h.f.a.b<Boolean, String> {

        /* renamed from: a  reason: collision with root package name */
        public static final f f113024a = new f();

        static {
            Covode.recordClassIndex(72662);
        }

        f() {
            super(1);
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
        @Override // h.f.a.b
        public final /* synthetic */ String invoke(Boolean bool) {
            bool.booleanValue();
            return "";
        }
    }

    static final class g extends h.f.b.m implements h.f.a.b<Boolean, String> {

        /* renamed from: a  reason: collision with root package name */
        public static final g f113025a = new g();

        static {
            Covode.recordClassIndex(72663);
        }

        g() {
            super(1);
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
        @Override // h.f.a.b
        public final /* synthetic */ String invoke(Boolean bool) {
            bool.booleanValue();
            return null;
        }
    }

    static final class i extends h.f.b.m implements h.f.a.b<Boolean, String> {

        /* renamed from: a  reason: collision with root package name */
        public static final i f113027a = new i();

        static {
            Covode.recordClassIndex(72665);
        }

        i() {
            super(1);
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
        @Override // h.f.a.b
        public final /* synthetic */ String invoke(Boolean bool) {
            bool.booleanValue();
            return null;
        }
    }

    static final class k extends h.f.b.m implements h.f.a.b<Boolean, String> {

        /* renamed from: a  reason: collision with root package name */
        public static final k f113029a = new k();

        static {
            Covode.recordClassIndex(72667);
        }

        k() {
            super(1);
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
        @Override // h.f.a.b
        public final /* synthetic */ String invoke(Boolean bool) {
            bool.booleanValue();
            return null;
        }
    }

    static final class m extends h.f.b.m implements h.f.a.b<Boolean, String> {

        /* renamed from: a  reason: collision with root package name */
        public static final m f113030a = new m();

        static {
            Covode.recordClassIndex(72669);
        }

        m() {
            super(1);
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
        @Override // h.f.a.b
        public final /* synthetic */ String invoke(Boolean bool) {
            bool.booleanValue();
            return "";
        }
    }

    static final class n extends h.f.b.m implements h.f.a.b<Boolean, String> {

        /* renamed from: a  reason: collision with root package name */
        public static final n f113031a = new n();

        static {
            Covode.recordClassIndex(72670);
        }

        n() {
            super(1);
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
        @Override // h.f.a.b
        public final /* synthetic */ String invoke(Boolean bool) {
            bool.booleanValue();
            return null;
        }
    }

    @Override // com.ss.android.ugc.aweme.common.e.c
    public final void c(Exception exc) {
        d().j();
    }

    static final class b implements View.OnClickListener {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ TranslationLikeListDetailActivity f113021a;

        static {
            Covode.recordClassIndex(72657);
        }

        b(TranslationLikeListDetailActivity translationLikeListDetailActivity) {
            this.f113021a = translationLikeListDetailActivity;
        }

        public final void onClick(View view) {
            ClickAgent.onClick(view);
            this.f113021a.finish();
        }
    }

    static final class h extends h.f.b.m implements h.f.a.b<Boolean, Integer> {

        /* renamed from: a  reason: collision with root package name */
        public static final h f113026a = new h();

        static {
            Covode.recordClassIndex(72664);
        }

        h() {
            super(1);
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
        @Override // h.f.a.b
        public final /* synthetic */ Integer invoke(Boolean bool) {
            bool.booleanValue();
            return 9;
        }
    }

    static final class j extends h.f.b.m implements h.f.a.b<Boolean, Long> {

        /* renamed from: a  reason: collision with root package name */
        public static final j f113028a = new j();

        static {
            Covode.recordClassIndex(72666);
        }

        j() {
            super(1);
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
        @Override // h.f.a.b
        public final /* synthetic */ Long invoke(Boolean bool) {
            bool.booleanValue();
            return 0L;
        }
    }

    static final class o extends h.f.b.m implements h.f.a.b<BaseActivityViewModel, z> {

        /* renamed from: a  reason: collision with root package name */
        public static final o f113032a = new o();

        static {
            Covode.recordClassIndex(72671);
        }

        o() {
            super(1);
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
        @Override // h.f.a.b
        public final /* synthetic */ z invoke(BaseActivityViewModel baseActivityViewModel) {
            BaseActivityViewModel baseActivityViewModel2 = baseActivityViewModel;
            h.f.b.l.d(baseActivityViewModel2, "");
            baseActivityViewModel2.config(AnonymousClass1.f113033a);
            return z.f158842a;
        }
    }

    /* access modifiers changed from: package-private */
    public static final class c<TTaskResult, TContinuationResult> implements b.g {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ TranslationLikeListDetailActivity f113022a;

        static {
            Covode.recordClassIndex(72658);
        }

        c(TranslationLikeListDetailActivity translationLikeListDetailActivity) {
            this.f113022a = translationLikeListDetailActivity;
        }

        @Override // b.g
        public final /* synthetic */ Object then(b.i iVar) {
            if (!this.f113022a.isDestroyed()) {
                TuxStatusView tuxStatusView = (TuxStatusView) this.f113022a._$_findCachedViewById(R.id.e_o);
                h.f.b.l.b(tuxStatusView, "");
                tuxStatusView.setVisibility(0);
                ((TuxStatusView) this.f113022a._$_findCachedViewById(R.id.e_o)).setStatus(com.ss.android.ugc.aweme.tux.a.g.a.a(new TuxStatusView.c(), new h.f.a.a<z>(this.f113022a) {
                    /* class com.ss.android.ugc.aweme.notification.TranslationLikeListDetailActivity.c.AnonymousClass1 */

                    static {
                        Covode.recordClassIndex(72659);
                    }

                    /* Return type fixed from 'java.lang.Object' to match base method */
                    @Override // h.f.a.a
                    public final /* synthetic */ z invoke() {
                        ((TranslationLikeListDetailActivity) this.receiver).c();
                        return z.f158842a;
                    }
                }));
                new com.bytedance.tux.g.b(this.f113022a).e(R.string.de8).b();
            }
            return z.f158842a;
        }
    }

    @Override // com.ss.android.ugc.aweme.common.e.c
    public final void b(Exception exc) {
        if (d().v) {
            d().d(false);
            d().notifyDataSetChanged();
        }
        if (d().getItemCount() == 0) {
            TuxStatusView tuxStatusView = (TuxStatusView) _$_findCachedViewById(R.id.e_o);
            h.f.b.l.b(tuxStatusView, "");
            tuxStatusView.setVisibility(0);
            ((TuxStatusView) _$_findCachedViewById(R.id.e_o)).setStatus(com.ss.android.ugc.aweme.tux.a.g.a.a(new TuxStatusView.c(), new p(this)));
        }
        com.ss.android.ugc.aweme.inbox.d.j.a(0);
    }

    @Override // androidx.core.app.d, androidx.fragment.app.e, com.bytedance.ies.foundation.activity.a, androidx.appcompat.app.d, com.bytedance.ies.powerpage.a
    public final void onCreate(Bundle bundle) {
        com.bytedance.helios.sdk.utils.a.a(this, bundle);
        ActivityAgent.onTrace("com.ss.android.ugc.aweme.notification.TranslationLikeListDetailActivity", "onCreate", true);
        activityConfiguration(o.f113032a);
        super.onCreate(bundle);
        com.ss.android.ugc.aweme.inbox.d.j.a(j.a.DETAIL_TYPE_TRANSLATION_LIKE_LIST, ((Number) this.f113016h.getValue()).intValue(), (String) this.f113014f.getValue());
        setContentView(R.layout.k2);
        RecyclerView recyclerView = (RecyclerView) _$_findCachedViewById(R.id.cxr);
        h.f.b.l.b(recyclerView, "");
        RecyclerView.f itemAnimator = recyclerView.getItemAnimator();
        Objects.requireNonNull(itemAnimator, "null cannot be cast to non-null type androidx.recyclerview.widget.SimpleItemAnimator");
        ((ab) itemAnimator).f3953m = false;
        RecyclerView recyclerView2 = (RecyclerView) _$_findCachedViewById(R.id.cxr);
        h.f.b.l.b(recyclerView2, "");
        recyclerView2.setLayoutManager(new LinearLayoutManager());
        ((RecyclerView) _$_findCachedViewById(R.id.cxr)).b(new com.ss.android.ugc.aweme.base.ui.l((int) com.bytedance.common.utility.n.b(this, 1.0f), 0));
        ((RecyclerView) _$_findCachedViewById(R.id.cxr)).a(new com.ss.android.ugc.aweme.framework.b.a(this));
        ((AutoRTLImageView) _$_findCachedViewById(R.id.qb)).setOnClickListener(new b(this));
        String a2 = a();
        if (!(a2 == null || a2.length() == 0)) {
            d().f113210b = (String) this.f113017i.getValue();
            com.ss.android.ugc.aweme.notification.adapter.k d2 = d();
            d dVar = new d(this);
            h.f.b.l.d(dVar, "");
            d2.f113212d = dVar;
        }
        d().a((h.a) this);
        d().d(true);
        d().ah_();
        RecyclerView recyclerView3 = (RecyclerView) _$_findCachedViewById(R.id.cxr);
        h.f.b.l.b(recyclerView3, "");
        recyclerView3.setAdapter(d());
        TuxStatusView tuxStatusView = (TuxStatusView) _$_findCachedViewById(R.id.e_o);
        h.f.b.l.b(tuxStatusView, "");
        tuxStatusView.setVisibility(0);
        ((TuxStatusView) _$_findCachedViewById(R.id.e_o)).a();
        c();
        ActivityAgent.onTrace("com.ss.android.ugc.aweme.notification.TranslationLikeListDetailActivity", "onCreate", false);
    }

    @Override // com.ss.android.ugc.aweme.common.e.c
    public final void a(List<User> list, boolean z) {
        int i2;
        ArrayList arrayList;
        d().d(true);
        if (!z) {
            k();
        } else {
            d().ai_();
        }
        int i3 = 0;
        if (h().d() == 0) {
            i2 = f113009m;
        } else {
            i2 = 0;
        }
        ((FrameLayout) _$_findCachedViewById(R.id.cxe)).setPadding(0, i2, 0, 0);
        d().f113213e = h().d();
        com.ss.android.ugc.aweme.notification.adapter.k d2 = d();
        if (list != null) {
            ArrayList arrayList2 = new ArrayList(h.a.n.a((Iterable) list, 10));
            Iterator<T> it = list.iterator();
            while (it.hasNext()) {
                arrayList2.add(it.next());
            }
            arrayList = arrayList2;
        } else {
            arrayList = h.a.z.INSTANCE;
        }
        d2.b_(arrayList);
        this.f113020l = list;
        TuxStatusView tuxStatusView = (TuxStatusView) _$_findCachedViewById(R.id.e_o);
        h.f.b.l.b(tuxStatusView, "");
        tuxStatusView.setVisibility(8);
        if (list != null) {
            i3 = list.size();
        }
        com.ss.android.ugc.aweme.inbox.d.j.a(i3);
    }

    @Override // com.ss.android.ugc.aweme.common.e.c
    public final void b(List<User> list, boolean z) {
        Object obj;
        if (list == null || list.isEmpty() || !z) {
            k();
        } else {
            d().ai_();
        }
        d().f113213e = h().d();
        com.ss.android.ugc.aweme.notification.adapter.k d2 = d();
        if (list != null) {
            ArrayList arrayList = new ArrayList();
            for (T t : list) {
                if (t != null) {
                    arrayList.add(t);
                }
            }
            obj = h.a.n.g((Collection) arrayList);
        } else {
            obj = new ArrayList();
        }
        d2.c((List) obj);
        this.f113020l = list;
    }

    public final void a(int i2, String str, User user) {
        String str2;
        com.ss.android.ugc.aweme.app.f.d a2 = new com.ss.android.ugc.aweme.app.f.d().a("action_type", str).a("enter_from", "notification_page").a("account_type", "like_translation").a("client_order", i2).a("tab_name", (String) this.f113018j.getValue());
        if (user != null) {
            str2 = user.getUid();
        } else {
            str2 = null;
        }
        r.a("notification_message_folded_message", a2.a("from_user_id", str2).a("button_type", com.ss.android.ugc.aweme.notification.utils.i.a(this, user)).a("group_id", a()).f66730a);
    }
}
