package com.ss.android.ugc.aweme.notification;

import android.content.Context;
import android.content.Intent;
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
import com.ss.android.ugc.aweme.base.model.UrlModel;
import com.ss.android.ugc.aweme.base.utils.f;
import com.ss.android.ugc.aweme.ck.t;
import com.ss.android.ugc.aweme.ck.u;
import com.ss.android.ugc.aweme.common.a.h;
import com.ss.android.ugc.aweme.im.sdk.common.controller.providedservices.IMService;
import com.ss.android.ugc.aweme.inbox.d.j;
import com.ss.android.ugc.aweme.notification.model.LikeListModel;
import com.ss.android.ugc.aweme.profile.model.FollowStatus;
import com.ss.android.ugc.aweme.profile.model.User;
import com.ss.android.ugc.aweme.userservice.UserService;
import com.zhiliaoapp.musically.R;
import h.z;
import java.util.ArrayList;
import java.util.Collection;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Objects;
import org.greenrobot.eventbus.EventBus;
import org.greenrobot.eventbus.ThreadMode;

public final class LikeListDetailActivity extends com.bytedance.ies.foundation.activity.a implements h.a, com.ss.android.ugc.aweme.common.e.c<com.ss.android.ugc.aweme.notification.bean.c>, org.greenrobot.eventbus.i, org.greenrobot.eventbus.j {

    /* renamed from: c  reason: collision with root package name */
    public static final a f112885c = new a((byte) 0);
    private static final int o = ((int) com.bytedance.common.utility.n.b(com.bytedance.ies.ugc.appcontext.d.a(), 8.0f));

    /* renamed from: a  reason: collision with root package name */
    final h.h f112886a = RouteArgExtension.INSTANCE.optionalArgNotNull(this, j.f112905a, "is_new", Boolean.class);

    /* renamed from: b  reason: collision with root package name */
    final h.h f112887b = RouteArgExtension.INSTANCE.optionalArgNotNull(this, k.f112906a, "last_read_time", Long.class);

    /* renamed from: d  reason: collision with root package name */
    private final h.h f112888d = h.i.a(h.m.NONE, e.f112900a);

    /* renamed from: e  reason: collision with root package name */
    private final h.h f112889e = h.i.a(h.m.NONE, new m(this));

    /* renamed from: f  reason: collision with root package name */
    private final h.h f112890f = RouteArgExtension.INSTANCE.optionalArg(this, l.f112907a, "nid", String.class);

    /* renamed from: g  reason: collision with root package name */
    private final h.h f112891g = RouteArgExtension.INSTANCE.optionalArg(this, f.f112901a, "aweme_id", String.class);

    /* renamed from: h  reason: collision with root package name */
    private final h.h f112892h = RouteArgExtension.INSTANCE.optionalArg(this, n.f112908a, "ref_id", String.class);

    /* renamed from: i  reason: collision with root package name */
    private final h.h f112893i = RouteArgExtension.INSTANCE.optionalArgNotNull(this, i.f112904a, "digg_type", Integer.class);

    /* renamed from: j  reason: collision with root package name */
    private final h.h f112894j = RouteArgExtension.INSTANCE.optionalArg(this, o.f112909a, "second_title", String.class);

    /* renamed from: k  reason: collision with root package name */
    private final h.h f112895k = RouteArgExtension.INSTANCE.optionalArg(this, g.f112902a, "cover", UrlModel.class);

    /* renamed from: l  reason: collision with root package name */
    private final h.h f112896l = RouteArgExtension.INSTANCE.optionalArg(this, h.f112903a, "cover_url", String.class);

    /* renamed from: m  reason: collision with root package name */
    private final h.h f112897m = RouteArgExtension.INSTANCE.optionalArg(this, p.f112910a, "tab_name", String.class);
    private List<com.ss.android.ugc.aweme.notification.bean.c> n;
    private SparseArray p;

    private final com.ss.android.ugc.aweme.notification.f.a j() {
        return (com.ss.android.ugc.aweme.notification.f.a) this.f112889e.getValue();
    }

    @Override // com.bytedance.ies.foundation.activity.a, com.bytedance.ies.powerpage.a
    public final void _$_clearFindViewByIdCache() {
        SparseArray sparseArray = this.p;
        if (sparseArray != null) {
            sparseArray.clear();
        }
    }

    @Override // com.bytedance.ies.foundation.activity.a, com.bytedance.ies.powerpage.a
    public final View _$_findCachedViewById(int i2) {
        if (this.p == null) {
            this.p = new SparseArray();
        }
        View view = (View) this.p.get(i2);
        if (view != null) {
            return view;
        }
        View findViewById = findViewById(i2);
        this.p.put(i2, findViewById);
        return findViewById;
    }

    public final com.ss.android.ugc.aweme.notification.adapter.b a() {
        return (com.ss.android.ugc.aweme.notification.adapter.b) this.f112888d.getValue();
    }

    @Override // com.ss.android.ugc.aweme.common.e.c
    public final void a(Exception exc) {
    }

    @Override // com.ss.android.ugc.aweme.common.e.c
    public final void bh_() {
    }

    public final String c() {
        return (String) this.f112891g.getValue();
    }

    @Override // com.ss.android.ugc.aweme.common.e.c
    public final void c(List<com.ss.android.ugc.aweme.notification.bean.c> list, boolean z) {
    }

    public final String d() {
        return (String) this.f112892h.getValue();
    }

    @Override // org.greenrobot.eventbus.i
    public final Map<Integer, Object> getSubscriberEventTypes() {
        HashMap hashMap = new HashMap();
        hashMap.put(68, new org.greenrobot.eventbus.g(LikeListDetailActivity.class, "onRefreshMessageButton", com.ss.android.ugc.aweme.im.service.b.c.class, ThreadMode.MAIN, 0, false));
        return hashMap;
    }

    public final int h() {
        return ((Number) this.f112893i.getValue()).intValue();
    }

    @Override // androidx.fragment.app.e, com.bytedance.ies.foundation.activity.a
    public final void onPause() {
        com.bytedance.helios.sdk.utils.a.c(this);
        super.onPause();
    }

    @Override // androidx.fragment.app.e, com.bytedance.ies.foundation.activity.a
    public final void onResume() {
        com.bytedance.helios.sdk.utils.a.b(this);
        ActivityAgent.onTrace("com.ss.android.ugc.aweme.notification.LikeListDetailActivity", "onResume", true);
        super.onResume();
        ActivityAgent.onTrace("com.ss.android.ugc.aweme.notification.LikeListDetailActivity", "onResume", false);
    }

    @Override // androidx.fragment.app.e, com.bytedance.ies.foundation.activity.a, androidx.appcompat.app.d
    public final void onStart() {
        com.bytedance.helios.sdk.utils.a.a(this);
        super.onStart();
    }

    @Override // com.bytedance.ies.foundation.activity.a
    public final void onWindowFocusChanged(boolean z) {
        ActivityAgent.onTrace("com.ss.android.ugc.aweme.notification.LikeListDetailActivity", "onWindowFocusChanged", true);
        super.onWindowFocusChanged(z);
    }

    public static final class a {
        static {
            Covode.recordClassIndex(72560);
        }

        private a() {
        }

        public /* synthetic */ a(byte b2) {
            this();
        }

        public static void a(Context context, String str, String str2, String str3, boolean z, int i2, long j2, String str4, UrlModel urlModel, String str5) {
            h.f.b.l.d(context, "");
            if (str2 != null && str2.length() != 0 && str3 != null && str3.length() != 0) {
                Intent intent = new Intent(context, LikeListDetailActivity.class);
                intent.putExtra("nid", str);
                intent.putExtra("aweme_id", str2);
                intent.putExtra("ref_id", str3);
                intent.putExtra("is_new", z);
                intent.putExtra("digg_type", i2);
                intent.putExtra("last_read_time", j2);
                intent.putExtra("second_title", str4);
                if (str5 == null) {
                    str5 = "";
                }
                intent.putExtra("tab_name", str5);
                if (urlModel != null) {
                    intent.putExtra("cover", urlModel);
                }
                com.ss.android.ugc.tiktok.security.a.a.a(intent, context);
                context.startActivity(intent);
            }
        }
    }

    static final class e extends h.f.b.m implements h.f.a.a<com.ss.android.ugc.aweme.notification.adapter.b> {

        /* renamed from: a  reason: collision with root package name */
        public static final e f112900a = new e();

        static {
            Covode.recordClassIndex(72565);
        }

        e() {
            super(0);
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        @Override // h.f.a.a
        public final /* synthetic */ com.ss.android.ugc.aweme.notification.adapter.b invoke() {
            return new com.ss.android.ugc.aweme.notification.adapter.b((byte) 0);
        }
    }

    @Override // com.ss.android.ugc.aweme.common.e.c
    public final void aO_() {
        a().ag_();
    }

    static final /* synthetic */ class s extends h.f.b.j implements h.f.a.a<z> {
        static {
            Covode.recordClassIndex(72580);
        }

        s(LikeListDetailActivity likeListDetailActivity) {
            super(0, likeListDetailActivity, LikeListDetailActivity.class, "doRefresh", "doRefresh()V", 0);
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        @Override // h.f.a.a
        public final /* synthetic */ z invoke() {
            ((LikeListDetailActivity) this.receiver).i();
            return z.f158842a;
        }
    }

    private static boolean k() {
        try {
            return f.a.f68431a.c();
        } catch (Exception unused) {
            return false;
        }
    }

    private final void n() {
        a().ah_();
        a().d(false);
    }

    static {
        Covode.recordClassIndex(72559);
    }

    private static boolean m() {
        if (com.ss.android.ugc.aweme.lancet.j.f107226e && com.ss.android.ugc.aweme.lancet.j.b() && !com.ss.android.ugc.aweme.lancet.j.c()) {
            return com.ss.android.ugc.aweme.lancet.j.f107226e;
        }
        boolean k2 = k();
        com.ss.android.ugc.aweme.lancet.j.f107226e = k2;
        return k2;
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
        com.ss.android.ugc.aweme.notification.f.a j2 = j();
        LikeListModel likeListModel = (LikeListModel) j2.f76396h;
        if (likeListModel != null) {
            likeListModel.loadMore();
        }
        j2.b();
    }

    @Override // androidx.fragment.app.e, com.bytedance.ies.foundation.activity.a, androidx.appcompat.app.d
    public final void onDestroy() {
        com.bytedance.helios.sdk.utils.a.e(this);
        super.onDestroy();
        j().cd_();
        EventBus.a().b(this);
    }

    static final class m extends h.f.b.m implements h.f.a.a<com.ss.android.ugc.aweme.notification.f.a> {
        final /* synthetic */ LikeListDetailActivity this$0;

        static {
            Covode.recordClassIndex(72573);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        m(LikeListDetailActivity likeListDetailActivity) {
            super(0);
            this.this$0 = likeListDetailActivity;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        @Override // h.f.a.a
        public final /* synthetic */ com.ss.android.ugc.aweme.notification.f.a invoke() {
            com.ss.android.ugc.aweme.notification.f.a aVar = new com.ss.android.ugc.aweme.notification.f.a();
            String d2 = this.this$0.d();
            if (d2 == null) {
                d2 = "";
            }
            aVar.a(new LikeListModel(d2, ((Boolean) this.this$0.f112886a.getValue()).booleanValue(), this.this$0.h(), ((Number) this.this$0.f112887b.getValue()).longValue()));
            aVar.a_(this.this$0);
            return aVar;
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

    static final class d extends h.f.b.m implements h.f.a.a<z> {
        final /* synthetic */ LikeListDetailActivity this$0;

        static {
            Covode.recordClassIndex(72564);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        d(LikeListDetailActivity likeListDetailActivity) {
            super(0);
            this.this$0 = likeListDetailActivity;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        @Override // h.f.a.a
        public final /* synthetic */ z invoke() {
            u a2 = u.a("aweme://aweme/detail/" + this.this$0.c()).a("refer", "message");
            if (this.this$0.h() == 3) {
                a2.a("cid", this.this$0.d());
            }
            t.a(t.a(), a2.a());
            return z.f158842a;
        }
    }

    @Override // com.ss.android.ugc.aweme.common.e.c
    public final void f() {
        if (a().v) {
            a().d(false);
            a().notifyDataSetChanged();
            n();
        }
        if (a().getItemCount() == 0) {
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

    public final void i() {
        if (m()) {
            if (a().getItemCount() == 0) {
                TuxStatusView tuxStatusView = (TuxStatusView) _$_findCachedViewById(R.id.e_o);
                h.f.b.l.b(tuxStatusView, "");
                tuxStatusView.setVisibility(0);
                ((TuxStatusView) _$_findCachedViewById(R.id.e_o)).a();
            }
            j().e();
            com.ss.android.ugc.aweme.inbox.d.j.a();
            return;
        }
        if (a().getItemCount() == 0) {
            b.i.a(100).a(new c(this), b.i.f4826c, null);
        }
        com.ss.android.ugc.aweme.inbox.d.j.f104183a = null;
    }

    static final class f extends h.f.b.m implements h.f.a.b<Boolean, String> {

        /* renamed from: a  reason: collision with root package name */
        public static final f f112901a = new f();

        static {
            Covode.recordClassIndex(72566);
        }

        f() {
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

    static final class g extends h.f.b.m implements h.f.a.b<Boolean, UrlModel> {

        /* renamed from: a  reason: collision with root package name */
        public static final g f112902a = new g();

        static {
            Covode.recordClassIndex(72567);
        }

        g() {
            super(1);
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
        @Override // h.f.a.b
        public final /* synthetic */ UrlModel invoke(Boolean bool) {
            bool.booleanValue();
            return null;
        }
    }

    static final class h extends h.f.b.m implements h.f.a.b<Boolean, String> {

        /* renamed from: a  reason: collision with root package name */
        public static final h f112903a = new h();

        static {
            Covode.recordClassIndex(72568);
        }

        h() {
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

    static final class l extends h.f.b.m implements h.f.a.b<Boolean, String> {

        /* renamed from: a  reason: collision with root package name */
        public static final l f112907a = new l();

        static {
            Covode.recordClassIndex(72572);
        }

        l() {
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

    static final class n extends h.f.b.m implements h.f.a.b<Boolean, String> {

        /* renamed from: a  reason: collision with root package name */
        public static final n f112908a = new n();

        static {
            Covode.recordClassIndex(72574);
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

    static final class o extends h.f.b.m implements h.f.a.b<Boolean, String> {

        /* renamed from: a  reason: collision with root package name */
        public static final o f112909a = new o();

        static {
            Covode.recordClassIndex(72575);
        }

        o() {
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

    static final class p extends h.f.b.m implements h.f.a.b<Boolean, String> {

        /* renamed from: a  reason: collision with root package name */
        public static final p f112910a = new p();

        static {
            Covode.recordClassIndex(72576);
        }

        p() {
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
        a().j();
    }

    static final class b implements View.OnClickListener {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ LikeListDetailActivity f112898a;

        static {
            Covode.recordClassIndex(72561);
        }

        b(LikeListDetailActivity likeListDetailActivity) {
            this.f112898a = likeListDetailActivity;
        }

        public final void onClick(View view) {
            ClickAgent.onClick(view);
            this.f112898a.finish();
        }
    }

    static final class i extends h.f.b.m implements h.f.a.b<Boolean, Integer> {

        /* renamed from: a  reason: collision with root package name */
        public static final i f112904a = new i();

        static {
            Covode.recordClassIndex(72569);
        }

        i() {
            super(1);
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
        @Override // h.f.a.b
        public final /* synthetic */ Integer invoke(Boolean bool) {
            bool.booleanValue();
            return 1;
        }
    }

    static final class j extends h.f.b.m implements h.f.a.b<Boolean, Boolean> {

        /* renamed from: a  reason: collision with root package name */
        public static final j f112905a = new j();

        static {
            Covode.recordClassIndex(72570);
        }

        j() {
            super(1);
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
        @Override // h.f.a.b
        public final /* synthetic */ Boolean invoke(Boolean bool) {
            bool.booleanValue();
            return true;
        }
    }

    static final class k extends h.f.b.m implements h.f.a.b<Boolean, Long> {

        /* renamed from: a  reason: collision with root package name */
        public static final k f112906a = new k();

        static {
            Covode.recordClassIndex(72571);
        }

        k() {
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

    static final class q extends h.f.b.m implements h.f.a.b<BaseActivityViewModel, z> {

        /* renamed from: a  reason: collision with root package name */
        public static final q f112911a = new q();

        static {
            Covode.recordClassIndex(72577);
        }

        q() {
            super(1);
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
        @Override // h.f.a.b
        public final /* synthetic */ z invoke(BaseActivityViewModel baseActivityViewModel) {
            BaseActivityViewModel baseActivityViewModel2 = baseActivityViewModel;
            h.f.b.l.d(baseActivityViewModel2, "");
            baseActivityViewModel2.config(AnonymousClass1.f112912a);
            return z.f158842a;
        }
    }

    @org.greenrobot.eventbus.r(a = ThreadMode.MAIN)
    public final void onRefreshMessageButton(com.ss.android.ugc.aweme.im.service.b.c cVar) {
        h.f.b.l.d(cVar, "");
        a().notifyDataSetChanged();
    }

    /* access modifiers changed from: package-private */
    public static final class c<TTaskResult, TContinuationResult> implements b.g {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ LikeListDetailActivity f112899a;

        static {
            Covode.recordClassIndex(72562);
        }

        c(LikeListDetailActivity likeListDetailActivity) {
            this.f112899a = likeListDetailActivity;
        }

        @Override // b.g
        public final /* synthetic */ Object then(b.i iVar) {
            if (!this.f112899a.isDestroyed()) {
                TuxStatusView tuxStatusView = (TuxStatusView) this.f112899a._$_findCachedViewById(R.id.e_o);
                h.f.b.l.b(tuxStatusView, "");
                tuxStatusView.setVisibility(0);
                ((TuxStatusView) this.f112899a._$_findCachedViewById(R.id.e_o)).setStatus(com.ss.android.ugc.aweme.tux.a.g.a.a(new TuxStatusView.c(), new h.f.a.a<z>(this.f112899a) {
                    /* class com.ss.android.ugc.aweme.notification.LikeListDetailActivity.c.AnonymousClass1 */

                    static {
                        Covode.recordClassIndex(72563);
                    }

                    /* Return type fixed from 'java.lang.Object' to match base method */
                    @Override // h.f.a.a
                    public final /* synthetic */ z invoke() {
                        ((LikeListDetailActivity) this.receiver).i();
                        return z.f158842a;
                    }
                }));
                new com.bytedance.tux.g.b(this.f112899a).e(R.string.de8).b();
            }
            return z.f158842a;
        }
    }

    static final class r<T> implements androidx.lifecycle.u {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ LikeListDetailActivity f112913a;

        static {
            Covode.recordClassIndex(72579);
        }

        r(LikeListDetailActivity likeListDetailActivity) {
            this.f112913a = likeListDetailActivity;
        }

        @Override // androidx.lifecycle.u
        public final /* synthetic */ void onChanged(Object obj) {
            String str;
            FollowStatus followStatus = (FollowStatus) obj;
            if (followStatus != null) {
                com.ss.android.ugc.aweme.notification.adapter.b a2 = this.f112913a.a();
                h.f.b.l.d(followStatus, "");
                List<T> e2 = a2.e();
                if (e2 != null) {
                    Iterator<T> it = e2.iterator();
                    int i2 = 0;
                    while (true) {
                        if (!it.hasNext()) {
                            break;
                        }
                        T next = it.next();
                        if (next != null) {
                            str = next.getUid();
                        } else {
                            str = null;
                        }
                        if (!h.f.b.l.a((Object) str, (Object) followStatus.userId)) {
                            i2++;
                        } else if (i2 >= 0) {
                            T t = e2.get(i2);
                            h.f.b.l.b(t, "");
                            t.setFollowStatus(followStatus.followStatus);
                            a2.notifyItemChanged(i2);
                        }
                    }
                    IMService.createIIMServicebyMonsterPlugin(false).storeFollowStatus(followStatus);
                }
            }
        }
    }

    @Override // com.ss.android.ugc.aweme.common.e.c
    public final void b(Exception exc) {
        if (a().v) {
            a().d(false);
            a().notifyDataSetChanged();
        }
        if (a().getItemCount() == 0) {
            TuxStatusView tuxStatusView = (TuxStatusView) _$_findCachedViewById(R.id.e_o);
            h.f.b.l.b(tuxStatusView, "");
            tuxStatusView.setVisibility(0);
            ((TuxStatusView) _$_findCachedViewById(R.id.e_o)).setStatus(com.ss.android.ugc.aweme.tux.a.g.a.a(new TuxStatusView.c(), new s(this)));
        }
        com.ss.android.ugc.aweme.inbox.d.j.a(0);
    }

    @Override // androidx.core.app.d, androidx.fragment.app.e, com.bytedance.ies.foundation.activity.a, androidx.appcompat.app.d, com.bytedance.ies.powerpage.a
    public final void onCreate(Bundle bundle) {
        com.bytedance.helios.sdk.utils.a.a(this, bundle);
        ActivityAgent.onTrace("com.ss.android.ugc.aweme.notification.LikeListDetailActivity", "onCreate", true);
        activityConfiguration(q.f112911a);
        super.onCreate(bundle);
        com.ss.android.ugc.aweme.inbox.d.j.a(j.a.DETAIL_TYPE_LIKE_LIST, h(), (String) this.f112890f.getValue());
        setContentView(R.layout.k0);
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
        String c2 = c();
        if (!(c2 == null || c2.length() == 0)) {
            a().f113142a = (UrlModel) this.f112895k.getValue();
            a().f113143b = (String) this.f112896l.getValue();
            a().f113144c = (String) this.f112894j.getValue();
            com.ss.android.ugc.aweme.notification.adapter.b a2 = a();
            d dVar = new d(this);
            h.f.b.l.d(dVar, "");
            a2.f113145d = dVar;
        }
        a().a((h.a) this);
        a().d(true);
        a().ah_();
        RecyclerView recyclerView3 = (RecyclerView) _$_findCachedViewById(R.id.cxr);
        h.f.b.l.b(recyclerView3, "");
        recyclerView3.setAdapter(a());
        TuxStatusView tuxStatusView = (TuxStatusView) _$_findCachedViewById(R.id.e_o);
        h.f.b.l.b(tuxStatusView, "");
        tuxStatusView.setVisibility(0);
        ((TuxStatusView) _$_findCachedViewById(R.id.e_o)).a();
        i();
        UserService.d().b().observe(this, new r(this));
        EventBus.a(EventBus.a(), this);
        ActivityAgent.onTrace("com.ss.android.ugc.aweme.notification.LikeListDetailActivity", "onCreate", false);
    }

    @Override // com.ss.android.ugc.aweme.common.e.c
    public final void b(List<com.ss.android.ugc.aweme.notification.bean.c> list, boolean z) {
        Object obj;
        if (list == null || list.isEmpty() || !z) {
            n();
        } else {
            a().ai_();
        }
        a().f113146e = j().d();
        com.ss.android.ugc.aweme.notification.adapter.b a2 = a();
        if (list != null) {
            ArrayList arrayList = new ArrayList();
            Iterator<T> it = list.iterator();
            while (it.hasNext()) {
                User user = it.next().f113236a;
                if (user != null) {
                    arrayList.add(user);
                }
            }
            obj = h.a.n.g((Collection) arrayList);
        } else {
            obj = new ArrayList();
        }
        a2.c((List) obj);
        this.n = list;
    }

    @Override // com.ss.android.ugc.aweme.common.e.c
    public final void a(List<com.ss.android.ugc.aweme.notification.bean.c> list, boolean z) {
        int i2;
        ArrayList arrayList;
        a().d(true);
        if (!z) {
            n();
        } else {
            a().ai_();
        }
        int i3 = 0;
        if (j().d() == 0) {
            i2 = o;
        } else {
            i2 = 0;
        }
        ((FrameLayout) _$_findCachedViewById(R.id.cxe)).setPadding(0, i2, 0, 0);
        a().f113146e = j().d();
        com.ss.android.ugc.aweme.notification.adapter.b a2 = a();
        if (list != null) {
            ArrayList arrayList2 = new ArrayList(h.a.n.a((Iterable) list, 10));
            Iterator<T> it = list.iterator();
            while (it.hasNext()) {
                arrayList2.add(it.next().f113236a);
            }
            arrayList = arrayList2;
        } else {
            arrayList = h.a.z.INSTANCE;
        }
        a2.b_(arrayList);
        this.n = list;
        TuxStatusView tuxStatusView = (TuxStatusView) _$_findCachedViewById(R.id.e_o);
        h.f.b.l.b(tuxStatusView, "");
        tuxStatusView.setVisibility(8);
        if (list != null) {
            i3 = list.size();
        }
        com.ss.android.ugc.aweme.inbox.d.j.a(i3);
    }

    public final void a(int i2, String str, User user) {
        String str2;
        T t;
        String str3;
        String str4;
        com.ss.android.ugc.aweme.app.f.d a2 = new com.ss.android.ugc.aweme.app.f.d().a("action_type", str).a("enter_from", "notification_page").a("account_type", "like").a("client_order", i2).a("tab_name", (String) this.f112897m.getValue());
        Long l2 = null;
        if (user != null) {
            str2 = user.getUid();
        } else {
            str2 = null;
        }
        com.ss.android.ugc.aweme.app.f.d a3 = a2.a("from_user_id", str2).a("button_type", com.ss.android.ugc.aweme.notification.utils.i.a(this, user)).a("group_id", c());
        List<com.ss.android.ugc.aweme.notification.bean.c> list = this.n;
        if (list != null) {
            Iterator<T> it = list.iterator();
            while (true) {
                if (!it.hasNext()) {
                    t = null;
                    break;
                }
                t = it.next();
                User user2 = t.f113236a;
                if (user2 != null) {
                    str3 = user2.getUid();
                } else {
                    str3 = null;
                }
                if (user != null) {
                    str4 = user.getUid();
                } else {
                    str4 = null;
                }
                if (h.f.b.l.a((Object) str3, (Object) str4)) {
                    break;
                }
            }
            T t2 = t;
            if (t2 != null) {
                l2 = Long.valueOf(t2.f113237b);
            }
        }
        com.ss.android.ugc.aweme.common.r.a("notification_message_folded_message", a3.a("message_time", l2).f66730a);
    }
}
