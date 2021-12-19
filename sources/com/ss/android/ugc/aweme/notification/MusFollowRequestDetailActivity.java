package com.ss.android.ugc.aweme.notification;

import android.content.Intent;
import android.os.Build;
import android.os.Bundle;
import android.util.SparseArray;
import android.view.View;
import androidx.fragment.app.Fragment;
import androidx.recyclerview.widget.RecyclerView;
import androidx.recyclerview.widget.ab;
import androidx.swiperefreshlayout.widget.SwipeRefreshLayout;
import com.bytedance.apm.agent.v2.instrumentation.ActivityAgent;
import com.bytedance.apm.agent.v2.instrumentation.ClickAgent;
import com.bytedance.common.utility.n;
import com.bytedance.covode.number.Covode;
import com.bytedance.ies.dmt.ui.titlebar.TextTitleBar;
import com.bytedance.ies.dmt.ui.widget.DmtStatusView;
import com.bytedance.ies.foundation.activity.BaseActivityViewModel;
import com.bytedance.sysoptimizer.EnterTransitionCrashOptimizer;
import com.ss.android.ugc.aweme.base.api.BaseResponse;
import com.ss.android.ugc.aweme.base.utils.f;
import com.ss.android.ugc.aweme.common.a.h;
import com.ss.android.ugc.aweme.inbox.d.j;
import com.ss.android.ugc.aweme.notification.utils.q;
import com.ss.android.ugc.aweme.profile.model.User;
import com.ss.android.ugc.aweme.views.WrapLinearLayoutManager;
import com.zhiliaoapp.musically.R;
import h.a.ac;
import h.f.b.l;
import h.f.b.m;
import h.z;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Objects;
import org.greenrobot.eventbus.EventBus;
import org.greenrobot.eventbus.ThreadMode;
import org.greenrobot.eventbus.i;
import org.greenrobot.eventbus.j;
import org.greenrobot.eventbus.r;

public final class MusFollowRequestDetailActivity extends com.bytedance.ies.foundation.activity.a implements SwipeRefreshLayout.b, h.a, com.ss.android.ugc.aweme.notification.followrequest.a, com.ss.android.ugc.aweme.notification.followrequest.a.b, i, j {

    /* renamed from: a  reason: collision with root package name */
    public static final a f112914a = new a((byte) 0);

    /* renamed from: b  reason: collision with root package name */
    private com.ss.android.ugc.aweme.notification.adapter.c f112915b;

    /* renamed from: c  reason: collision with root package name */
    private final h.h f112916c = h.i.a((h.f.a.a) new d(this));

    /* renamed from: d  reason: collision with root package name */
    private final h.h f112917d = h.i.a((h.f.a.a) new e(this));

    /* renamed from: e  reason: collision with root package name */
    private SparseArray f112918e;

    static {
        Covode.recordClassIndex(72581);
    }

    private final com.ss.android.ugc.aweme.notification.followrequest.a.a b() {
        return (com.ss.android.ugc.aweme.notification.followrequest.a.a) this.f112916c.getValue();
    }

    @Override // com.bytedance.ies.foundation.activity.a, com.bytedance.ies.powerpage.a
    public final void _$_clearFindViewByIdCache() {
        SparseArray sparseArray = this.f112918e;
        if (sparseArray != null) {
            sparseArray.clear();
        }
    }

    @Override // com.bytedance.ies.foundation.activity.a, com.bytedance.ies.powerpage.a
    public final View _$_findCachedViewById(int i2) {
        if (this.f112918e == null) {
            this.f112918e = new SparseArray();
        }
        View view = (View) this.f112918e.get(i2);
        if (view != null) {
            return view;
        }
        View findViewById = findViewById(i2);
        this.f112918e.put(i2, findViewById);
        return findViewById;
    }

    @Override // com.ss.android.ugc.aweme.notification.followrequest.a.b
    public final void a(List<User> list, int i2) {
        l.d(list, "");
    }

    @Override // org.greenrobot.eventbus.i
    public final Map<Integer, Object> getSubscriberEventTypes() {
        HashMap hashMap = new HashMap();
        hashMap.put(84, new org.greenrobot.eventbus.g(MusFollowRequestDetailActivity.class, "onUserPageHandleRequest", com.ss.android.ugc.aweme.notice.api.b.b.class, ThreadMode.MAIN, 0, false));
        hashMap.put(68, new org.greenrobot.eventbus.g(MusFollowRequestDetailActivity.class, "onRefreshMessageButton", com.ss.android.ugc.aweme.im.service.b.c.class, ThreadMode.MAIN, 0, false));
        return hashMap;
    }

    @Override // androidx.fragment.app.e, com.bytedance.ies.foundation.activity.a
    public final void onPause() {
        com.bytedance.helios.sdk.utils.a.c(this);
        super.onPause();
    }

    @Override // androidx.fragment.app.e, com.bytedance.ies.foundation.activity.a
    public final void onResume() {
        com.bytedance.helios.sdk.utils.a.b(this);
        ActivityAgent.onTrace("com.ss.android.ugc.aweme.notification.MusFollowRequestDetailActivity", "onResume", true);
        super.onResume();
        ActivityAgent.onTrace("com.ss.android.ugc.aweme.notification.MusFollowRequestDetailActivity", "onResume", false);
    }

    @Override // androidx.fragment.app.e, com.bytedance.ies.foundation.activity.a, androidx.appcompat.app.d
    public final void onStart() {
        com.bytedance.helios.sdk.utils.a.a(this);
        super.onStart();
    }

    @Override // com.bytedance.ies.foundation.activity.a
    public final void onWindowFocusChanged(boolean z) {
        ActivityAgent.onTrace("com.ss.android.ugc.aweme.notification.MusFollowRequestDetailActivity", "onWindowFocusChanged", true);
        super.onWindowFocusChanged(z);
    }

    public static final class a {
        static {
            Covode.recordClassIndex(72582);
        }

        private a() {
        }

        public /* synthetic */ a(byte b2) {
            this();
        }

        public static void a(Fragment fragment, Integer num) {
            l.d(fragment, "");
            Intent intent = new Intent(fragment.getContext(), MusFollowRequestDetailActivity.class);
            intent.putExtra("unread_count", num);
            fragment.startActivityForResult(intent, 1024);
        }
    }

    private static boolean c() {
        try {
            return f.a.f68431a.c();
        } catch (Exception unused) {
            return false;
        }
    }

    static final class d extends m implements h.f.a.a<com.ss.android.ugc.aweme.notification.followrequest.a.a> {
        final /* synthetic */ MusFollowRequestDetailActivity this$0;

        static {
            Covode.recordClassIndex(72585);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        d(MusFollowRequestDetailActivity musFollowRequestDetailActivity) {
            super(0);
            this.this$0 = musFollowRequestDetailActivity;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        @Override // h.f.a.a
        public final /* synthetic */ com.ss.android.ugc.aweme.notification.followrequest.a.a invoke() {
            com.ss.android.ugc.aweme.notification.followrequest.a.a aVar = new com.ss.android.ugc.aweme.notification.followrequest.a.a();
            aVar.a(new com.ss.android.ugc.aweme.notification.followrequest.model.a());
            aVar.a_(this.this$0);
            return aVar;
        }
    }

    static final class e extends m implements h.f.a.a<Integer> {
        final /* synthetic */ MusFollowRequestDetailActivity this$0;

        static {
            Covode.recordClassIndex(72586);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        e(MusFollowRequestDetailActivity musFollowRequestDetailActivity) {
            super(0);
            this.this$0 = musFollowRequestDetailActivity;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        @Override // h.f.a.a
        public final /* synthetic */ Integer invoke() {
            return Integer.valueOf(this.this$0.getIntent().getIntExtra("unread_count", 0));
        }
    }

    private final void d() {
        com.ss.android.ugc.aweme.notification.adapter.c cVar = this.f112915b;
        if (cVar == null) {
            l.a("mAdapter");
        }
        cVar.ah_();
        com.ss.android.ugc.aweme.notification.adapter.c cVar2 = this.f112915b;
        if (cVar2 == null) {
            l.a("mAdapter");
        }
        cVar2.d(false);
    }

    @Override // androidx.fragment.app.e, com.bytedance.ies.foundation.activity.a, androidx.appcompat.app.d
    public final void onDestroy() {
        com.bytedance.helios.sdk.utils.a.e(this);
        super.onDestroy();
        b().cd_();
        EventBus.a().b(this);
    }

    @Override // com.ss.android.ugc.aweme.common.a.h.a
    public final void l() {
        long currentTimeMillis;
        com.ss.android.ugc.aweme.notification.followrequest.a.a b2 = b();
        com.ss.android.ugc.aweme.notification.followrequest.model.a aVar = (com.ss.android.ugc.aweme.notification.followrequest.model.a) b2.f76396h;
        if (aVar != null) {
            T t = aVar.mData;
            if (t != null) {
                currentTimeMillis = t.minTime;
            } else {
                currentTimeMillis = System.currentTimeMillis() / 1000;
            }
            aVar.f113473a = currentTimeMillis;
            aVar.f113474b = 1;
            aVar.f113476d = false;
            aVar.f113475c = true;
            aVar.a(aVar.f113473a, aVar.f113474b, 20);
        }
        b2.b();
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

    @Override // com.ss.android.ugc.aweme.notification.followrequest.a.b, com.ss.android.ugc.aweme.notification.followrequest.a
    public final void a() {
        com.ss.android.ugc.aweme.notification.adapter.c cVar = this.f112915b;
        if (cVar == null) {
            l.a("mAdapter");
        }
        cVar.f();
        com.ss.android.ugc.aweme.notification.adapter.c cVar2 = this.f112915b;
        if (cVar2 == null) {
            l.a("mAdapter");
        }
        if (cVar2.v) {
            com.ss.android.ugc.aweme.notification.adapter.c cVar3 = this.f112915b;
            if (cVar3 == null) {
                l.a("mAdapter");
            }
            cVar3.d(false);
            com.ss.android.ugc.aweme.notification.adapter.c cVar4 = this.f112915b;
            if (cVar4 == null) {
                l.a("mAdapter");
            }
            cVar4.notifyDataSetChanged();
            d();
        }
        SwipeRefreshLayout swipeRefreshLayout = (SwipeRefreshLayout) _$_findCachedViewById(R.id.egh);
        l.b(swipeRefreshLayout, "");
        swipeRefreshLayout.setRefreshing(false);
        com.ss.android.ugc.aweme.notification.adapter.c cVar5 = this.f112915b;
        if (cVar5 == null) {
            l.a("mAdapter");
        }
        if (cVar5.getItemCount() == 0) {
            ((DmtStatusView) _$_findCachedViewById(R.id.e_o)).g();
        }
        T t = b().f76396h;
        l.b(t, "");
        com.ss.android.ugc.aweme.inbox.d.j.a((BaseResponse) t.mData);
        com.ss.android.ugc.aweme.inbox.d.j.a(0);
    }

    @Override // androidx.swiperefreshlayout.widget.SwipeRefreshLayout.b
    public final void onRefresh() {
        if (!com.ss.android.ugc.aweme.lancet.j.f107226e || !com.ss.android.ugc.aweme.lancet.j.b() || com.ss.android.ugc.aweme.lancet.j.c()) {
            com.ss.android.ugc.aweme.lancet.j.f107226e = c();
        }
        if (com.ss.android.ugc.aweme.lancet.j.f107226e) {
            com.ss.android.ugc.aweme.notification.adapter.c cVar = this.f112915b;
            if (cVar == null) {
                l.a("mAdapter");
            }
            if (cVar.getItemCount() == 0) {
                ((DmtStatusView) _$_findCachedViewById(R.id.e_o)).f();
            }
            com.ss.android.ugc.aweme.notification.followrequest.a.a b2 = b();
            com.ss.android.ugc.aweme.notification.followrequest.model.a aVar = (com.ss.android.ugc.aweme.notification.followrequest.model.a) b2.f76396h;
            if (aVar != null) {
                aVar.f113473a = System.currentTimeMillis() / 1000;
                aVar.f113474b = 1;
                aVar.f113476d = false;
                aVar.f113475c = false;
                aVar.a(aVar.f113473a, aVar.f113474b, 20);
            }
            b2.b();
            com.ss.android.ugc.aweme.inbox.d.j.a();
            return;
        }
        com.ss.android.ugc.aweme.notification.adapter.c cVar2 = this.f112915b;
        if (cVar2 == null) {
            l.a("mAdapter");
        }
        if (cVar2.getItemCount() == 0) {
            b.i.a(100).a(new g(this), b.i.f4826c, null);
        }
        com.ss.android.ugc.aweme.inbox.d.j.f104183a = null;
    }

    public static final class b implements com.bytedance.ies.dmt.ui.titlebar.a.a {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ MusFollowRequestDetailActivity f112919a;

        static {
            Covode.recordClassIndex(72583);
        }

        @Override // com.bytedance.ies.dmt.ui.titlebar.a.a
        public final void b(View view) {
            l.d(view, "");
        }

        /* JADX WARN: Incorrect args count in method signature: ()V */
        b(MusFollowRequestDetailActivity musFollowRequestDetailActivity) {
            this.f112919a = musFollowRequestDetailActivity;
        }

        @Override // com.bytedance.ies.dmt.ui.titlebar.a.a
        public final void a(View view) {
            l.d(view, "");
            this.f112919a.finish();
        }
    }

    static final class c implements View.OnClickListener {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ MusFollowRequestDetailActivity f112920a;

        static {
            Covode.recordClassIndex(72584);
        }

        c(MusFollowRequestDetailActivity musFollowRequestDetailActivity) {
            this.f112920a = musFollowRequestDetailActivity;
        }

        public final void onClick(View view) {
            ClickAgent.onClick(view);
            this.f112920a.onRefresh();
        }
    }

    static final class f extends m implements h.f.a.b<BaseActivityViewModel, z> {

        /* renamed from: a  reason: collision with root package name */
        public static final f f112921a = new f();

        static {
            Covode.recordClassIndex(72587);
        }

        f() {
            super(1);
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
        @Override // h.f.a.b
        public final /* synthetic */ z invoke(BaseActivityViewModel baseActivityViewModel) {
            BaseActivityViewModel baseActivityViewModel2 = baseActivityViewModel;
            l.d(baseActivityViewModel2, "");
            baseActivityViewModel2.config(AnonymousClass1.f112922a);
            baseActivityViewModel2.config(AnonymousClass2.f112923a);
            baseActivityViewModel2.config(AnonymousClass3.f112924a);
            return z.f158842a;
        }
    }

    @Override // com.ss.android.ugc.aweme.notification.followrequest.a.b
    public final void b(boolean z) {
        if (z) {
            com.ss.android.ugc.aweme.notification.adapter.c cVar = this.f112915b;
            if (cVar == null) {
                l.a("mAdapter");
            }
            cVar.ag_();
        }
    }

    @r(a = ThreadMode.MAIN)
    public final void onRefreshMessageButton(com.ss.android.ugc.aweme.im.service.b.c cVar) {
        l.d(cVar, "");
        com.ss.android.ugc.aweme.notification.adapter.c cVar2 = this.f112915b;
        if (cVar2 == null) {
            l.a("mAdapter");
        }
        cVar2.notifyDataSetChanged();
    }

    /* access modifiers changed from: package-private */
    public static final class g<TTaskResult, TContinuationResult> implements b.g {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ MusFollowRequestDetailActivity f112925a;

        static {
            Covode.recordClassIndex(72591);
        }

        g(MusFollowRequestDetailActivity musFollowRequestDetailActivity) {
            this.f112925a = musFollowRequestDetailActivity;
        }

        @Override // b.g
        public final /* synthetic */ Object then(b.i iVar) {
            if (!this.f112925a.isDestroyed()) {
                ((DmtStatusView) this.f112925a._$_findCachedViewById(R.id.e_o)).h();
                new com.bytedance.tux.g.b(this.f112925a).e(R.string.de8).b();
            }
            return z.f158842a;
        }
    }

    @Override // com.ss.android.ugc.aweme.notification.followrequest.a.b
    public final void a(boolean z) {
        if (z) {
            com.ss.android.ugc.aweme.notification.adapter.c cVar = this.f112915b;
            if (cVar == null) {
                l.a("mAdapter");
            }
            cVar.j();
            return;
        }
        com.ss.android.ugc.aweme.notification.adapter.c cVar2 = this.f112915b;
        if (cVar2 == null) {
            l.a("mAdapter");
        }
        if (cVar2.v) {
            com.ss.android.ugc.aweme.notification.adapter.c cVar3 = this.f112915b;
            if (cVar3 == null) {
                l.a("mAdapter");
            }
            cVar3.d(false);
            com.ss.android.ugc.aweme.notification.adapter.c cVar4 = this.f112915b;
            if (cVar4 == null) {
                l.a("mAdapter");
            }
            cVar4.notifyDataSetChanged();
        }
        SwipeRefreshLayout swipeRefreshLayout = (SwipeRefreshLayout) _$_findCachedViewById(R.id.egh);
        l.b(swipeRefreshLayout, "");
        swipeRefreshLayout.setRefreshing(false);
        com.ss.android.ugc.aweme.notification.adapter.c cVar5 = this.f112915b;
        if (cVar5 == null) {
            l.a("mAdapter");
        }
        if (cVar5.getItemCount() == 0) {
            ((DmtStatusView) _$_findCachedViewById(R.id.e_o)).h();
        }
        T t = b().f76396h;
        l.b(t, "");
        com.ss.android.ugc.aweme.inbox.d.j.a((BaseResponse) t.mData);
        com.ss.android.ugc.aweme.inbox.d.j.a(0);
    }

    @Override // androidx.core.app.d, androidx.fragment.app.e, com.bytedance.ies.foundation.activity.a, androidx.appcompat.app.d, com.bytedance.ies.powerpage.a
    public final void onCreate(Bundle bundle) {
        com.bytedance.helios.sdk.utils.a.a(this, bundle);
        ActivityAgent.onTrace("com.ss.android.ugc.aweme.notification.MusFollowRequestDetailActivity", "onCreate", true);
        activityConfiguration(f.f112921a);
        super.onCreate(bundle);
        com.ss.android.ugc.aweme.inbox.d.j.a(j.a.DETAIL_TYPE_FOLLOW_REQUEST, 0, "");
        setContentView(R.layout.jz);
        RecyclerView recyclerView = (RecyclerView) _$_findCachedViewById(R.id.djs);
        l.b(recyclerView, "");
        RecyclerView.f itemAnimator = recyclerView.getItemAnimator();
        Objects.requireNonNull(itemAnimator, "null cannot be cast to non-null type androidx.recyclerview.widget.SimpleItemAnimator");
        ((ab) itemAnimator).f3953m = false;
        RecyclerView recyclerView2 = (RecyclerView) _$_findCachedViewById(R.id.djs);
        l.b(recyclerView2, "");
        recyclerView2.setLayoutManager(new WrapLinearLayoutManager());
        ((RecyclerView) _$_findCachedViewById(R.id.djs)).b(new com.ss.android.ugc.aweme.base.ui.l((int) n.b(this, 1.0f), 0));
        ((RecyclerView) _$_findCachedViewById(R.id.djs)).a(new com.ss.android.ugc.aweme.framework.b.a(this));
        ((DmtStatusView) _$_findCachedViewById(R.id.e_o)).setBuilder(DmtStatusView.a.a(this).a().a(R.string.bq, R.string.evm).a(R.string.h2z, R.string.h2y, R.string.h35, new c(this)));
        q.a((RecyclerView) _$_findCachedViewById(R.id.djs), (SwipeRefreshLayout) _$_findCachedViewById(R.id.egh));
        ((SwipeRefreshLayout) _$_findCachedViewById(R.id.egh)).setOnRefreshListener(this);
        ((com.bytedance.ies.dmt.ui.titlebar.a) _$_findCachedViewById(R.id.em8)).setTitle(R.string.bq);
        ((TextTitleBar) _$_findCachedViewById(R.id.em8)).setOnTitleBarClickListener(new b(this));
        com.ss.android.ugc.aweme.notification.adapter.c cVar = new com.ss.android.ugc.aweme.notification.adapter.c(this);
        this.f112915b = cVar;
        cVar.f113149a = ((Number) this.f112917d.getValue()).intValue();
        com.ss.android.ugc.aweme.notification.adapter.c cVar2 = this.f112915b;
        if (cVar2 == null) {
            l.a("mAdapter");
        }
        cVar2.a((h.a) this);
        com.ss.android.ugc.aweme.notification.adapter.c cVar3 = this.f112915b;
        if (cVar3 == null) {
            l.a("mAdapter");
        }
        cVar3.d(true);
        com.ss.android.ugc.aweme.notification.adapter.c cVar4 = this.f112915b;
        if (cVar4 == null) {
            l.a("mAdapter");
        }
        cVar4.ah_();
        RecyclerView recyclerView3 = (RecyclerView) _$_findCachedViewById(R.id.djs);
        l.b(recyclerView3, "");
        com.ss.android.ugc.aweme.notification.adapter.c cVar5 = this.f112915b;
        if (cVar5 == null) {
            l.a("mAdapter");
        }
        recyclerView3.setAdapter(cVar5);
        ((DmtStatusView) _$_findCachedViewById(R.id.e_o)).f();
        onRefresh();
        EventBus.a(EventBus.a(), this);
        ActivityAgent.onTrace("com.ss.android.ugc.aweme.notification.MusFollowRequestDetailActivity", "onCreate", false);
    }

    @r(a = ThreadMode.MAIN)
    public final void onUserPageHandleRequest(com.ss.android.ugc.aweme.notice.api.b.b bVar) {
        Integer valueOf;
        l.d(bVar, "");
        if (bVar.f112672b == -101) {
            com.ss.android.ugc.aweme.notification.adapter.c cVar = this.f112915b;
            if (cVar == null) {
                l.a("mAdapter");
            }
            String str = bVar.f112671a;
            l.d(str, "");
            List e2 = cVar.e();
            l.b(e2, "");
            Iterable n = h.a.n.n(e2);
            ArrayList arrayList = new ArrayList();
            for (Object obj : n) {
                T t = ((ac) obj).f158623b;
                l.b(t, "");
                if (l.a((Object) t.getUid(), (Object) str)) {
                    arrayList.add(obj);
                }
            }
            ac acVar = (ac) h.a.n.h((List) arrayList);
            if (!(acVar == null || (valueOf = Integer.valueOf(acVar.f158622a)) == null)) {
                cVar.d(valueOf.intValue());
                return;
            }
            return;
        }
        com.ss.android.ugc.aweme.notification.adapter.c cVar2 = this.f112915b;
        if (cVar2 == null) {
            l.a("mAdapter");
        }
        List e3 = cVar2.e();
        l.b(e3, "");
        Iterable n2 = h.a.n.n(e3);
        ArrayList arrayList2 = new ArrayList();
        for (Object obj2 : n2) {
            T t2 = ((ac) obj2).f158623b;
            l.b(t2, "");
            if (l.a((Object) t2.getUid(), (Object) bVar.f112671a)) {
                arrayList2.add(obj2);
            }
        }
        ac acVar2 = (ac) h.a.n.h((List) arrayList2);
        if (acVar2 != null) {
            int i2 = bVar.f112672b;
            if (i2 == -100) {
                T t3 = acVar2.f158623b;
                l.b(t3, "");
                t3.setFollowerStatus(1);
            } else if (i2 == 4) {
                T t4 = acVar2.f158623b;
                l.b(t4, "");
                t4.setFollowStatus(4);
            } else if (i2 == 0) {
                T t5 = acVar2.f158623b;
                l.b(t5, "");
                t5.setFollowStatus(0);
            } else if (i2 == 1) {
                T t6 = acVar2.f158623b;
                l.b(t6, "");
                t6.setFollowStatus(1);
            } else if (i2 == 2) {
                T t7 = acVar2.f158623b;
                l.b(t7, "");
                t7.setFollowStatus(2);
            }
            com.ss.android.ugc.aweme.notification.adapter.c cVar3 = this.f112915b;
            if (cVar3 == null) {
                l.a("mAdapter");
            }
            cVar3.notifyItemChanged(acVar2.f158622a);
        }
    }

    @Override // com.ss.android.ugc.aweme.notification.followrequest.a.b
    public final void a(List<User> list, boolean z, boolean z2) {
        l.d(list, "");
        if (z) {
            if (!list.isEmpty() && z2) {
                com.ss.android.ugc.aweme.notification.adapter.c cVar = this.f112915b;
                if (cVar == null) {
                    l.a("mAdapter");
                }
                cVar.ai_();
            } else {
                d();
            }
            com.ss.android.ugc.aweme.notification.adapter.c cVar2 = this.f112915b;
            if (cVar2 == null) {
                l.a("mAdapter");
            }
            cVar2.b(list);
            return;
        }
        com.ss.android.ugc.aweme.notification.adapter.c cVar3 = this.f112915b;
        if (cVar3 == null) {
            l.a("mAdapter");
        }
        cVar3.d(true);
        if (!z2) {
            d();
        } else {
            com.ss.android.ugc.aweme.notification.adapter.c cVar4 = this.f112915b;
            if (cVar4 == null) {
                l.a("mAdapter");
            }
            cVar4.ai_();
        }
        SwipeRefreshLayout swipeRefreshLayout = (SwipeRefreshLayout) _$_findCachedViewById(R.id.egh);
        l.b(swipeRefreshLayout, "");
        swipeRefreshLayout.setRefreshing(false);
        com.ss.android.ugc.aweme.notification.adapter.c cVar5 = this.f112915b;
        if (cVar5 == null) {
            l.a("mAdapter");
        }
        cVar5.f113149a = com.ss.android.ugc.aweme.notice.api.b.a(12);
        com.ss.android.ugc.aweme.notification.adapter.c cVar6 = this.f112915b;
        if (cVar6 == null) {
            l.a("mAdapter");
        }
        cVar6.b_(list);
        ((DmtStatusView) _$_findCachedViewById(R.id.e_o)).d();
        T t = b().f76396h;
        l.b(t, "");
        com.ss.android.ugc.aweme.inbox.d.j.a((BaseResponse) t.mData);
        com.ss.android.ugc.aweme.inbox.d.j.a(list.size());
    }
}
