package com.ss.android.ugc.aweme.notification;

import android.content.DialogInterface;
import android.os.Build;
import android.os.Bundle;
import android.util.SparseArray;
import android.view.View;
import android.widget.TextView;
import androidx.lifecycle.ac;
import androidx.lifecycle.ad;
import androidx.lifecycle.ae;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import androidx.recyclerview.widget.ab;
import androidx.swiperefreshlayout.widget.SwipeRefreshLayout;
import com.bytedance.apm.agent.v2.instrumentation.ActivityAgent;
import com.bytedance.apm.agent.v2.instrumentation.ClickAgent;
import com.bytedance.covode.number.Covode;
import com.bytedance.frameworks.apm.trace.MethodCollector;
import com.bytedance.ies.dmt.ui.titlebar.TextTitleBar;
import com.bytedance.ies.foundation.activity.BaseActivityViewModel;
import com.bytedance.router.arg.RouteArgExtension;
import com.bytedance.sysoptimizer.EnterTransitionCrashOptimizer;
import com.bytedance.tux.input.TuxSwitch;
import com.bytedance.tux.navigation.TuxNavBar;
import com.bytedance.tux.sheet.sheet.a;
import com.bytedance.tux.status.TuxStatusView;
import com.bytedance.ugc.glue.monitor.UGCMonitor;
import com.ss.android.ugc.aweme.analysis.Analysis;
import com.ss.android.ugc.aweme.base.utils.f;
import com.ss.android.ugc.aweme.common.a.h;
import com.ss.android.ugc.aweme.inbox.d.j;
import com.ss.android.ugc.aweme.notice.repo.list.bean.BaseNotice;
import com.ss.android.ugc.aweme.notification.api.NotificationApi;
import com.ss.android.ugc.aweme.notification.bean.MusNotificationDetailArg;
import com.ss.android.ugc.aweme.notification.bean.o;
import com.ss.android.ugc.aweme.notification.model.MusNewNotificationModel;
import com.ss.android.ugc.aweme.notification.vm.NotificationDetailVM;
import com.zhiliaoapp.musically.R;
import h.f.b.z;
import h.z;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import org.greenrobot.eventbus.ThreadMode;
import org.greenrobot.eventbus.r;

public final class MusNotificationDetailActivity extends com.bytedance.ies.foundation.activity.a implements SwipeRefreshLayout.b, com.ss.android.ugc.aweme.analysis.c, h.a, com.ss.android.ugc.aweme.common.e.c<BaseNotice>, org.greenrobot.eventbus.i, org.greenrobot.eventbus.j {

    /* renamed from: b  reason: collision with root package name */
    public static final a f112964b = new a((byte) 0);

    /* renamed from: a  reason: collision with root package name */
    public boolean f112965a;

    /* renamed from: c  reason: collision with root package name */
    private final h.h f112966c = RouteArgExtension.INSTANCE.navArg(this);

    /* renamed from: d  reason: collision with root package name */
    private final com.ss.android.ugc.aweme.notification.a.m f112967d = com.ss.android.ugc.aweme.notification.a.m.f113106b;

    /* renamed from: e  reason: collision with root package name */
    private com.ss.android.ugc.aweme.notification.a.c f112968e;

    /* renamed from: f  reason: collision with root package name */
    private com.ss.android.ugc.aweme.notification.a.f f112969f;

    /* renamed from: g  reason: collision with root package name */
    private com.ss.android.ugc.aweme.notification.a.f f112970g;

    /* renamed from: h  reason: collision with root package name */
    private com.ss.android.ugc.aweme.notification.adapter.h f112971h;

    /* renamed from: i  reason: collision with root package name */
    private final h.h f112972i = h.i.a((h.f.a.a) j.f113002a);

    /* renamed from: j  reason: collision with root package name */
    private MusNewNotificationModel f112973j;

    /* renamed from: k  reason: collision with root package name */
    private final h.h f112974k = h.i.a((h.f.a.a) new n(this));

    /* renamed from: l  reason: collision with root package name */
    private final h.h f112975l = h.i.a((h.f.a.a) b.f112977a);

    /* renamed from: m  reason: collision with root package name */
    private boolean f112976m;
    private SparseArray n;

    static final class f<T> implements f.a.d.f {

        /* renamed from: a  reason: collision with root package name */
        public static final f f112993a = new f();

        static {
            Covode.recordClassIndex(72642);
        }

        f() {
        }

        @Override // f.a.d.f
        public final /* bridge */ /* synthetic */ void accept(Object obj) {
        }
    }

    static {
        Covode.recordClassIndex(72634);
    }

    private final com.ss.android.ugc.aweme.notification.f.c d() {
        return (com.ss.android.ugc.aweme.notification.f.c) this.f112972i.getValue();
    }

    private final NotificationDetailVM h() {
        return (NotificationDetailVM) this.f112974k.getValue();
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

    public final f.a.b.a a() {
        return (f.a.b.a) this.f112975l.getValue();
    }

    @Override // com.ss.android.ugc.aweme.common.e.c
    public final void a(Exception exc) {
    }

    @Override // com.ss.android.ugc.aweme.common.e.c
    public final void b() {
    }

    @Override // com.ss.android.ugc.aweme.common.e.c
    public final void bh_() {
    }

    @Override // com.ss.android.ugc.aweme.common.e.c
    public final void c(List<BaseNotice> list, boolean z) {
    }

    @Override // org.greenrobot.eventbus.i
    public final Map<Integer, Object> getSubscriberEventTypes() {
        HashMap hashMap = new HashMap();
        hashMap.put(55, new org.greenrobot.eventbus.g(MusNotificationDetailActivity.class, "onSwitchBusinessAccountSuccessEvent", com.ss.android.ugc.aweme.setting.d.e.class, ThreadMode.MAIN, 0, false));
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
        ActivityAgent.onTrace("com.ss.android.ugc.aweme.notification.MusNotificationDetailActivity", "onResume", true);
        super.onResume();
        ActivityAgent.onTrace("com.ss.android.ugc.aweme.notification.MusNotificationDetailActivity", "onResume", false);
    }

    @Override // androidx.fragment.app.e, com.bytedance.ies.foundation.activity.a, androidx.appcompat.app.d
    public final void onStart() {
        com.bytedance.helios.sdk.utils.a.a(this);
        super.onStart();
    }

    @Override // com.bytedance.ies.foundation.activity.a
    public final void onWindowFocusChanged(boolean z) {
        ActivityAgent.onTrace("com.ss.android.ugc.aweme.notification.MusNotificationDetailActivity", "onWindowFocusChanged", true);
        super.onWindowFocusChanged(z);
    }

    public static final class a {
        static {
            Covode.recordClassIndex(72635);
        }

        private a() {
        }

        public /* synthetic */ a(byte b2) {
            this();
        }
    }

    static final class b extends h.f.b.m implements h.f.a.a<f.a.b.a> {

        /* renamed from: a  reason: collision with root package name */
        public static final b f112977a = new b();

        static {
            Covode.recordClassIndex(72636);
        }

        b() {
            super(0);
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        @Override // h.f.a.a
        public final /* synthetic */ f.a.b.a invoke() {
            return new f.a.b.a();
        }
    }

    static final class j extends h.f.b.m implements h.f.a.a<com.ss.android.ugc.aweme.notification.f.c> {

        /* renamed from: a  reason: collision with root package name */
        public static final j f113002a = new j();

        static {
            Covode.recordClassIndex(72646);
        }

        j() {
            super(0);
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        @Override // h.f.a.a
        public final /* synthetic */ com.ss.android.ugc.aweme.notification.f.c invoke() {
            return new com.ss.android.ugc.aweme.notification.f.c();
        }
    }

    static final /* synthetic */ class m extends h.f.b.j implements h.f.a.a<z> {
        static {
            Covode.recordClassIndex(72653);
        }

        m(MusNotificationDetailActivity musNotificationDetailActivity) {
            super(0, musNotificationDetailActivity, MusNotificationDetailActivity.class, "onRefresh", "onRefresh()V", 0);
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        @Override // h.f.a.a
        public final /* synthetic */ z invoke() {
            ((MusNotificationDetailActivity) this.receiver).onRefresh();
            return z.f158842a;
        }
    }

    private static boolean j() {
        try {
            return f.a.f68431a.c();
        } catch (Exception unused) {
            return false;
        }
    }

    @Override // com.ss.android.ugc.aweme.common.e.c
    public final void aO_() {
        com.ss.android.ugc.aweme.notification.adapter.h hVar = this.f112971h;
        if (hVar == null) {
            h.f.b.l.a("mAdapter");
        }
        hVar.ag_();
    }

    static final class h extends h.f.b.m implements h.f.a.a<z> {
        final /* synthetic */ View $view;
        final /* synthetic */ MusNotificationDetailActivity this$0;

        static {
            Covode.recordClassIndex(72644);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        h(MusNotificationDetailActivity musNotificationDetailActivity, View view) {
            super(0);
            this.this$0 = musNotificationDetailActivity;
            this.$view = view;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        @Override // h.f.a.a
        public final /* synthetic */ z invoke() {
            this.this$0.f112965a = true;
            View view = this.$view;
            h.f.b.l.b(view, "");
            a.b.a(view);
            return z.f158842a;
        }
    }

    static final class n extends h.f.b.m implements h.f.a.a<NotificationDetailVM> {
        final /* synthetic */ MusNotificationDetailActivity this$0;

        static {
            Covode.recordClassIndex(72654);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        n(MusNotificationDetailActivity musNotificationDetailActivity) {
            super(0);
            this.this$0 = musNotificationDetailActivity;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        @Override // h.f.a.a
        public final /* synthetic */ NotificationDetailVM invoke() {
            MusNotificationDetailActivity musNotificationDetailActivity = this.this$0;
            h.f.b.l.d(musNotificationDetailActivity, "");
            ac a2 = ae.a(musNotificationDetailActivity, (ad.b) null).a(NotificationDetailVM.class);
            h.f.b.l.b(a2, "");
            return a2;
        }
    }

    private final MusNotificationDetailArg c() {
        MusNotificationDetailArg musNotificationDetailArg = (MusNotificationDetailArg) this.f112966c.getValue();
        if (musNotificationDetailArg == null) {
            return new MusNotificationDetailArg(0, 0, null, null, null, 31, null);
        }
        return musNotificationDetailArg;
    }

    private final com.ss.android.ugc.aweme.notification.a.l i() {
        com.ss.android.ugc.aweme.notification.a.l lVar = new com.ss.android.ugc.aweme.notification.a.l(c().groupType, c().title, c().tabName);
        lVar.a(h());
        return lVar;
    }

    private final void k() {
        com.ss.android.ugc.aweme.notification.adapter.h hVar = this.f112971h;
        if (hVar == null) {
            h.f.b.l.a("mAdapter");
        }
        hVar.ah_();
        com.ss.android.ugc.aweme.notification.adapter.h hVar2 = this.f112971h;
        if (hVar2 == null) {
            h.f.b.l.a("mAdapter");
        }
        hVar2.d(false);
    }

    @Override // androidx.fragment.app.e, com.bytedance.ies.foundation.activity.a, androidx.appcompat.app.d
    public final void onDestroy() {
        com.bytedance.helios.sdk.utils.a.e(this);
        super.onDestroy();
        d().cd_();
        a().dispose();
    }

    @Override // com.ss.android.ugc.aweme.analysis.c
    public final Analysis F() {
        Analysis analysis = new Analysis();
        int i2 = c().groupType;
        String str = "fans";
        if (i2 == 2) {
            str = UGCMonitor.EVENT_COMMENT;
        } else if (i2 == 3) {
            str = "like";
        } else if (i2 == 6) {
            str = "at";
        }
        Analysis labelName = analysis.setLabelName(str);
        h.f.b.l.b(labelName, "");
        return labelName;
    }

    @Override // com.ss.android.ugc.aweme.common.a.h.a
    public final void l() {
        d().a(4, Integer.valueOf(c().groupType), null);
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

    @Override // com.ss.android.ugc.aweme.common.e.c
    public final void f() {
        com.ss.android.ugc.aweme.notification.adapter.h hVar = this.f112971h;
        if (hVar == null) {
            h.f.b.l.a("mAdapter");
        }
        if (hVar.v) {
            com.ss.android.ugc.aweme.notification.adapter.h hVar2 = this.f112971h;
            if (hVar2 == null) {
                h.f.b.l.a("mAdapter");
            }
            hVar2.d(false);
            com.ss.android.ugc.aweme.notification.adapter.h hVar3 = this.f112971h;
            if (hVar3 == null) {
                h.f.b.l.a("mAdapter");
            }
            hVar3.notifyDataSetChanged();
            k();
        }
        SwipeRefreshLayout swipeRefreshLayout = (SwipeRefreshLayout) _$_findCachedViewById(R.id.cy1);
        h.f.b.l.b(swipeRefreshLayout, "");
        swipeRefreshLayout.setRefreshing(false);
        com.ss.android.ugc.aweme.notification.adapter.h hVar4 = this.f112971h;
        if (hVar4 == null) {
            h.f.b.l.a("mAdapter");
        }
        if (hVar4.getItemCount() == 0) {
            TuxStatusView tuxStatusView = (TuxStatusView) _$_findCachedViewById(R.id.e_o);
            TuxStatusView.c cVar = new TuxStatusView.c();
            com.ss.android.ugc.aweme.notification.a.f fVar = this.f112969f;
            if (fVar == null) {
                h.f.b.l.a("mDetailProxy");
            }
            TuxStatusView.c a2 = cVar.a(fVar.b());
            com.ss.android.ugc.aweme.notification.a.f fVar2 = this.f112969f;
            if (fVar2 == null) {
                h.f.b.l.a("mDetailProxy");
            }
            tuxStatusView.setStatus(a2.a((CharSequence) fVar2.c()));
            TuxStatusView tuxStatusView2 = (TuxStatusView) _$_findCachedViewById(R.id.e_o);
            h.f.b.l.b(tuxStatusView2, "");
            tuxStatusView2.setVisibility(0);
        }
        com.ss.android.ugc.aweme.inbox.d.j.a(0);
    }

    @Override // androidx.swiperefreshlayout.widget.SwipeRefreshLayout.b
    public final void onRefresh() {
        if (!com.ss.android.ugc.aweme.lancet.j.f107226e || !com.ss.android.ugc.aweme.lancet.j.b() || com.ss.android.ugc.aweme.lancet.j.c()) {
            com.ss.android.ugc.aweme.lancet.j.f107226e = j();
        }
        if (com.ss.android.ugc.aweme.lancet.j.f107226e) {
            com.ss.android.ugc.aweme.notification.adapter.h hVar = this.f112971h;
            if (hVar == null) {
                h.f.b.l.a("mAdapter");
            }
            if (hVar.getItemCount() == 0) {
                ((TuxStatusView) _$_findCachedViewById(R.id.e_o)).a();
                TuxStatusView tuxStatusView = (TuxStatusView) _$_findCachedViewById(R.id.e_o);
                h.f.b.l.b(tuxStatusView, "");
                tuxStatusView.setVisibility(0);
            }
            d().a(1, Integer.valueOf(c().groupType), null);
            com.ss.android.ugc.aweme.inbox.d.j.a();
            return;
        }
        com.ss.android.ugc.aweme.notification.adapter.h hVar2 = this.f112971h;
        if (hVar2 == null) {
            h.f.b.l.a("mAdapter");
        }
        if (hVar2.getItemCount() == 0) {
            b.i.a(100).a(new l(this), b.i.f4826c, null);
        }
        com.ss.android.ugc.aweme.inbox.d.j.f104183a = null;
    }

    @r(a = ThreadMode.MAIN)
    public final void onSwitchBusinessAccountSuccessEvent(com.ss.android.ugc.aweme.setting.d.e eVar) {
        finish();
    }

    public static final class c implements com.bytedance.ies.dmt.ui.titlebar.a.a {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ MusNotificationDetailActivity f112978a;

        static {
            Covode.recordClassIndex(72637);
        }

        @Override // com.bytedance.ies.dmt.ui.titlebar.a.a
        public final void b(View view) {
            h.f.b.l.d(view, "");
        }

        /* JADX WARN: Incorrect args count in method signature: ()V */
        c(MusNotificationDetailActivity musNotificationDetailActivity) {
            this.f112978a = musNotificationDetailActivity;
        }

        @Override // com.bytedance.ies.dmt.ui.titlebar.a.a
        public final void a(View view) {
            h.f.b.l.d(view, "");
            this.f112978a.finish();
        }
    }

    @Override // com.ss.android.ugc.aweme.common.e.c
    public final void c(Exception exc) {
        com.ss.android.ugc.aweme.notification.adapter.h hVar = this.f112971h;
        if (hVar == null) {
            h.f.b.l.a("mAdapter");
        }
        hVar.j();
    }

    static final class k extends h.f.b.m implements h.f.a.b<BaseActivityViewModel, z> {

        /* renamed from: a  reason: collision with root package name */
        public static final k f113003a = new k();

        static {
            Covode.recordClassIndex(72647);
        }

        k() {
            super(1);
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
        @Override // h.f.a.b
        public final /* synthetic */ z invoke(BaseActivityViewModel baseActivityViewModel) {
            BaseActivityViewModel baseActivityViewModel2 = baseActivityViewModel;
            h.f.b.l.d(baseActivityViewModel2, "");
            baseActivityViewModel2.config(AnonymousClass1.f113004a);
            baseActivityViewModel2.config(AnonymousClass2.f113005a);
            baseActivityViewModel2.config(AnonymousClass3.f113006a);
            return z.f158842a;
        }
    }

    static final class d implements View.OnClickListener {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ MusNotificationDetailActivity f112979a;

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ TuxSwitch f112980b;

        /* renamed from: c  reason: collision with root package name */
        final /* synthetic */ String f112981c;

        /* renamed from: d  reason: collision with root package name */
        final /* synthetic */ TextView f112982d;

        /* renamed from: e  reason: collision with root package name */
        final /* synthetic */ z.e f112983e;

        static {
            Covode.recordClassIndex(72638);
        }

        d(MusNotificationDetailActivity musNotificationDetailActivity, TuxSwitch tuxSwitch, String str, TextView textView, z.e eVar) {
            this.f112979a = musNotificationDetailActivity;
            this.f112980b = tuxSwitch;
            this.f112981c = str;
            this.f112982d = textView;
            this.f112983e = eVar;
        }

        public final void onClick(View view) {
            ClickAgent.onClick(view);
            TuxSwitch tuxSwitch = this.f112980b;
            h.f.b.l.b(tuxSwitch, "");
            final boolean isChecked = tuxSwitch.isChecked();
            this.f112979a.a().a(NotificationApi.a().setSubscribeMarketingStatus(!isChecked).b(f.a.h.a.b(f.a.k.a.f158006c)).a(f.a.a.a.a.a(f.a.a.b.a.f157156a)).a(new f.a.d.f(this) {
                /* class com.ss.android.ugc.aweme.notification.MusNotificationDetailActivity.d.AnonymousClass1 */

                /* renamed from: a  reason: collision with root package name */
                final /* synthetic */ d f112984a;

                static {
                    Covode.recordClassIndex(72639);
                }

                {
                    this.f112984a = r1;
                }

                @Override // f.a.d.f
                public final /* synthetic */ void accept(Object obj) {
                    String str;
                    String str2;
                    com.ss.android.ugc.aweme.app.f.d dVar = new com.ss.android.ugc.aweme.app.f.d();
                    TuxSwitch tuxSwitch = this.f112984a.f112980b;
                    h.f.b.l.b(tuxSwitch, "");
                    if (tuxSwitch.isChecked()) {
                        str = "subscribed";
                    } else {
                        str = "unsubscribed";
                    }
                    com.ss.android.ugc.aweme.app.f.d a2 = dVar.a("status_type", str);
                    TuxSwitch tuxSwitch2 = this.f112984a.f112980b;
                    h.f.b.l.b(tuxSwitch2, "");
                    if (tuxSwitch2.isChecked()) {
                        str2 = "on";
                    } else {
                        str2 = "off";
                    }
                    com.ss.android.ugc.aweme.common.r.a("click_inbox_notification_setting", a2.a("to_status", str2).a("channel_type", this.f112984a.f112981c).f66730a);
                    TextView textView = this.f112984a.f112982d;
                    h.f.b.l.b(textView, "");
                    TuxSwitch tuxSwitch3 = this.f112984a.f112980b;
                    h.f.b.l.b(tuxSwitch3, "");
                    String str3 = null;
                    if (tuxSwitch3.isChecked()) {
                        T t = this.f112984a.f112983e.element;
                        if (t != null) {
                            str3 = t.f113270d;
                        }
                    } else {
                        T t2 = this.f112984a.f112983e.element;
                        if (t2 != null) {
                            str3 = t2.f113269c;
                        }
                    }
                    textView.setText(str3);
                }
            }, new f.a.d.f(this) {
                /* class com.ss.android.ugc.aweme.notification.MusNotificationDetailActivity.d.AnonymousClass2 */

                /* renamed from: a  reason: collision with root package name */
                final /* synthetic */ d f112985a;

                static {
                    Covode.recordClassIndex(72640);
                }

                {
                    this.f112985a = r1;
                }

                @Override // f.a.d.f
                public final /* synthetic */ void accept(Object obj) {
                    new com.bytedance.tux.g.b(this.f112985a.f112979a).e(R.string.bpc).b();
                    TuxSwitch tuxSwitch = this.f112985a.f112980b;
                    h.f.b.l.b(tuxSwitch, "");
                    tuxSwitch.setChecked(!isChecked);
                }
            }));
        }
    }

    static final class g implements View.OnClickListener {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ MusNotificationDetailActivity f112994a;

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ z.e f112995b;

        /* renamed from: c  reason: collision with root package name */
        final /* synthetic */ a.C1112a f112996c;

        /* renamed from: d  reason: collision with root package name */
        final /* synthetic */ TuxSwitch f112997d;

        /* renamed from: e  reason: collision with root package name */
        final /* synthetic */ String f112998e;

        static {
            Covode.recordClassIndex(72643);
        }

        g(MusNotificationDetailActivity musNotificationDetailActivity, z.e eVar, a.C1112a aVar, TuxSwitch tuxSwitch, String str) {
            this.f112994a = musNotificationDetailActivity;
            this.f112995b = eVar;
            this.f112996c = aVar;
            this.f112997d = tuxSwitch;
            this.f112998e = str;
        }

        public final void onClick(View view) {
            String str;
            ClickAgent.onClick(view);
            if (this.f112995b.element != null) {
                this.f112996c.f45299a.show(this.f112994a.getSupportFragmentManager(), "notification_marketing_subscribe");
                com.ss.android.ugc.aweme.app.f.d dVar = new com.ss.android.ugc.aweme.app.f.d();
                TuxSwitch tuxSwitch = this.f112997d;
                h.f.b.l.b(tuxSwitch, "");
                if (tuxSwitch.isChecked()) {
                    str = "subscribed";
                } else {
                    str = "unsubscribed";
                }
                com.ss.android.ugc.aweme.common.r.a("show_inbox_notification_setting", dVar.a("status_type", str).a("channel_type", this.f112998e).f66730a);
                return;
            }
            new com.bytedance.tux.g.b(this.f112994a).e(R.string.bpc).b();
        }
    }

    static final class i implements DialogInterface.OnDismissListener {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ MusNotificationDetailActivity f112999a;

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ TuxSwitch f113000b;

        /* renamed from: c  reason: collision with root package name */
        final /* synthetic */ String f113001c;

        static {
            Covode.recordClassIndex(72645);
        }

        i(MusNotificationDetailActivity musNotificationDetailActivity, TuxSwitch tuxSwitch, String str) {
            this.f112999a = musNotificationDetailActivity;
            this.f113000b = tuxSwitch;
            this.f113001c = str;
        }

        public final void onDismiss(DialogInterface dialogInterface) {
            String str;
            String str2;
            com.ss.android.ugc.aweme.app.f.d dVar = new com.ss.android.ugc.aweme.app.f.d();
            TuxSwitch tuxSwitch = this.f113000b;
            h.f.b.l.b(tuxSwitch, "");
            if (tuxSwitch.isChecked()) {
                str = "subscribed";
            } else {
                str = "unsubscribed";
            }
            com.ss.android.ugc.aweme.app.f.d a2 = dVar.a("status_type", str).a("channel_type", this.f113001c);
            if (this.f112999a.f112965a) {
                str2 = "button";
            } else {
                str2 = "other";
            }
            com.ss.android.ugc.aweme.common.r.a("close_inbox_notification_setting", a2.a("action_type", str2).f66730a);
            this.f112999a.f112965a = false;
        }
    }

    /* access modifiers changed from: package-private */
    public static final class l<TTaskResult, TContinuationResult> implements b.g {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ MusNotificationDetailActivity f113007a;

        static {
            Covode.recordClassIndex(72651);
        }

        l(MusNotificationDetailActivity musNotificationDetailActivity) {
            this.f113007a = musNotificationDetailActivity;
        }

        @Override // b.g
        public final /* synthetic */ Object then(b.i iVar) {
            if (!this.f113007a.isDestroyed()) {
                ((TuxStatusView) this.f113007a._$_findCachedViewById(R.id.e_o)).setStatus(com.ss.android.ugc.aweme.tux.a.g.a.a(new TuxStatusView.c(), new h.f.a.a<h.z>(this.f113007a) {
                    /* class com.ss.android.ugc.aweme.notification.MusNotificationDetailActivity.l.AnonymousClass1 */

                    static {
                        Covode.recordClassIndex(72652);
                    }

                    /* Return type fixed from 'java.lang.Object' to match base method */
                    @Override // h.f.a.a
                    public final /* synthetic */ h.z invoke() {
                        ((MusNotificationDetailActivity) this.receiver).onRefresh();
                        return h.z.f158842a;
                    }
                }));
                TuxStatusView tuxStatusView = (TuxStatusView) this.f113007a._$_findCachedViewById(R.id.e_o);
                h.f.b.l.b(tuxStatusView, "");
                tuxStatusView.setVisibility(0);
                new com.bytedance.tux.g.b(this.f113007a).e(R.string.de8).b();
            }
            return h.z.f158842a;
        }
    }

    @Override // com.ss.android.ugc.aweme.common.e.c
    public final void b(Exception exc) {
        com.ss.android.ugc.aweme.notification.adapter.h hVar = this.f112971h;
        if (hVar == null) {
            h.f.b.l.a("mAdapter");
        }
        if (hVar.v) {
            com.ss.android.ugc.aweme.notification.adapter.h hVar2 = this.f112971h;
            if (hVar2 == null) {
                h.f.b.l.a("mAdapter");
            }
            hVar2.d(false);
            com.ss.android.ugc.aweme.notification.adapter.h hVar3 = this.f112971h;
            if (hVar3 == null) {
                h.f.b.l.a("mAdapter");
            }
            hVar3.notifyDataSetChanged();
        }
        SwipeRefreshLayout swipeRefreshLayout = (SwipeRefreshLayout) _$_findCachedViewById(R.id.cy1);
        h.f.b.l.b(swipeRefreshLayout, "");
        swipeRefreshLayout.setRefreshing(false);
        com.ss.android.ugc.aweme.notification.adapter.h hVar4 = this.f112971h;
        if (hVar4 == null) {
            h.f.b.l.a("mAdapter");
        }
        if (hVar4.getItemCount() == 0) {
            ((TuxStatusView) _$_findCachedViewById(R.id.e_o)).setStatus(com.ss.android.ugc.aweme.tux.a.g.a.a(new TuxStatusView.c(), new m(this)));
            TuxStatusView tuxStatusView = (TuxStatusView) _$_findCachedViewById(R.id.e_o);
            h.f.b.l.b(tuxStatusView, "");
            tuxStatusView.setVisibility(0);
        }
        com.ss.android.ugc.aweme.inbox.d.j.a(0);
    }

    static final class e<T> implements f.a.d.f {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ a.C1112a f112987a;

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ TuxNavBar.a f112988b;

        /* renamed from: c  reason: collision with root package name */
        final /* synthetic */ z.e f112989c;

        /* renamed from: d  reason: collision with root package name */
        final /* synthetic */ TuxSwitch f112990d;

        /* renamed from: e  reason: collision with root package name */
        final /* synthetic */ TextView f112991e;

        /* renamed from: f  reason: collision with root package name */
        final /* synthetic */ TextView f112992f;

        static {
            Covode.recordClassIndex(72641);
        }

        e(a.C1112a aVar, TuxNavBar.a aVar2, z.e eVar, TuxSwitch tuxSwitch, TextView textView, TextView textView2) {
            this.f112987a = aVar;
            this.f112988b = aVar2;
            this.f112989c = eVar;
            this.f112990d = tuxSwitch;
            this.f112991e = textView;
            this.f112992f = textView2;
        }

        @Override // f.a.d.f
        public final /* synthetic */ void accept(Object obj) {
            String str;
            boolean z;
            String str2;
            Integer num;
            o oVar = (o) obj;
            a.C1112a aVar = this.f112987a;
            TuxNavBar.a aVar2 = this.f112988b;
            com.bytedance.tux.navigation.a.g gVar = new com.bytedance.tux.navigation.a.g();
            com.ss.android.ugc.aweme.notification.bean.n nVar = oVar.f113273a;
            if (nVar == null || (str = nVar.f113271a) == null) {
                str = "";
            }
            aVar.a(aVar2.a(gVar.a(str)));
            z.e eVar = this.f112989c;
            com.ss.android.ugc.aweme.notification.bean.n nVar2 = oVar.f113273a;
            String str3 = null;
            eVar.element = nVar2 != null ? (T) nVar2.f113272b : null;
            TuxSwitch tuxSwitch = this.f112990d;
            h.f.b.l.b(tuxSwitch, "");
            T t = this.f112989c.element;
            if (t == null || (num = t.f113267a) == null || num.intValue() != 0) {
                z = false;
            } else {
                z = true;
            }
            tuxSwitch.setChecked(z);
            TextView textView = this.f112991e;
            h.f.b.l.b(textView, "");
            T t2 = this.f112989c.element;
            if (t2 != null) {
                str2 = t2.f113268b;
            } else {
                str2 = null;
            }
            textView.setText(str2);
            TextView textView2 = this.f112992f;
            h.f.b.l.b(textView2, "");
            TuxSwitch tuxSwitch2 = this.f112990d;
            h.f.b.l.b(tuxSwitch2, "");
            if (tuxSwitch2.isChecked()) {
                T t3 = this.f112989c.element;
                if (t3 != null) {
                    str3 = t3.f113270d;
                }
            } else {
                T t4 = this.f112989c.element;
                if (t4 != null) {
                    str3 = t4.f113269c;
                }
            }
            textView2.setText(str3);
        }
    }

    @Override // androidx.core.app.d, androidx.fragment.app.e, com.bytedance.ies.foundation.activity.a, androidx.appcompat.app.d, com.bytedance.ies.powerpage.a
    public final void onCreate(Bundle bundle) {
        com.ss.android.ugc.aweme.notice.api.bean.c cVar;
        com.ss.android.ugc.aweme.notification.a.c cVar2;
        boolean z;
        String str;
        com.ss.android.ugc.aweme.notification.a.c cVar3;
        MethodCollector.i(656);
        com.bytedance.helios.sdk.utils.a.a(this, bundle);
        ActivityAgent.onTrace("com.ss.android.ugc.aweme.notification.MusNotificationDetailActivity", "onCreate", true);
        activityConfiguration(k.f113003a);
        super.onCreate(bundle);
        com.ss.android.ugc.aweme.inbox.d.j.a(j.a.DETAIL_TYPE_NOTIFICATION, c().groupType, c().nid);
        setContentView(R.layout.k1);
        com.ss.android.ugc.aweme.notice.api.bean.j e2 = com.ss.android.ugc.aweme.notification.redpoint.f.e(c().groupType);
        if (e2 != null) {
            cVar = e2.f112691a;
        } else {
            cVar = null;
        }
        if (cVar == com.ss.android.ugc.aweme.notice.api.bean.c.AfterClick) {
            com.ss.android.ugc.aweme.notice.api.b.d(c().groupType);
            c();
            com.ss.android.ugc.d.a.c.a(new com.ss.android.ugc.aweme.notice.api.bean.n());
        }
        if (c().groupType == -1) {
            ActivityAgent.onTrace("com.ss.android.ugc.aweme.notification.MusNotificationDetailActivity", "onCreate", false);
            MethodCollector.o(656);
            return;
        }
        if (com.ss.android.ugc.aweme.notification.a.m.f113105a.get(Integer.valueOf(c().groupType)) == null || (cVar3 = com.ss.android.ugc.aweme.notification.a.m.f113105a.get(Integer.valueOf(c().groupType))) == null || cVar3.a() == null) {
            cVar2 = i();
            z = true;
        } else {
            cVar2 = com.ss.android.ugc.aweme.notification.a.m.f113105a.get(Integer.valueOf(c().groupType));
            if (cVar2 == null) {
                h.f.b.l.b();
            }
            z = false;
        }
        com.ss.android.ugc.aweme.notification.a.c cVar4 = cVar2;
        this.f112968e = cVar4;
        if (cVar4 == null) {
            h.f.b.l.a("mDelegate");
        }
        cVar4.a(h());
        com.ss.android.ugc.aweme.notification.a.c cVar5 = this.f112968e;
        if (cVar5 == null) {
            h.f.b.l.a("mDelegate");
        }
        com.ss.android.ugc.aweme.notification.a.f a2 = cVar5.a();
        if (a2 == null) {
            h.f.b.l.b();
        }
        this.f112969f = a2;
        if (!z) {
            a2 = i().a();
            if (a2 == null) {
                h.f.b.l.b();
            }
        } else if (a2 == null) {
            h.f.b.l.a("mDetailProxy");
        }
        this.f112970g = a2;
        RecyclerView recyclerView = (RecyclerView) _$_findCachedViewById(R.id.cxr);
        h.f.b.l.b(recyclerView, "");
        RecyclerView.f itemAnimator = recyclerView.getItemAnimator();
        if (itemAnimator != null) {
            ((ab) itemAnimator).f3953m = false;
            RecyclerView recyclerView2 = (RecyclerView) _$_findCachedViewById(R.id.cxr);
            h.f.b.l.b(recyclerView2, "");
            recyclerView2.setLayoutManager(new LinearLayoutManager());
            ((RecyclerView) _$_findCachedViewById(R.id.cxr)).b(new com.ss.android.ugc.aweme.base.ui.l((int) com.bytedance.common.utility.n.b(this, 1.0f), 0));
            ((RecyclerView) _$_findCachedViewById(R.id.cxr)).a(new com.ss.android.ugc.aweme.framework.b.a(this));
            ((SwipeRefreshLayout) _$_findCachedViewById(R.id.cy1)).setOnRefreshListener(this);
            com.bytedance.ies.dmt.ui.titlebar.a aVar = (com.bytedance.ies.dmt.ui.titlebar.a) _$_findCachedViewById(R.id.em8);
            com.ss.android.ugc.aweme.notification.a.f fVar = this.f112969f;
            if (fVar == null) {
                h.f.b.l.a("mDetailProxy");
            }
            aVar.setTitle(fVar.a());
            ((TextTitleBar) _$_findCachedViewById(R.id.em8)).setOnTitleBarClickListener(new c(this));
            if (c().groupType == 81) {
                View inflate = View.inflate(this, R.layout.ki, null);
                TuxSwitch tuxSwitch = (TuxSwitch) inflate.findViewById(R.id.cy2);
                TextView textView = (TextView) inflate.findViewById(R.id.cy4);
                TextView textView2 = (TextView) inflate.findViewById(R.id.cxb);
                ((TextTitleBar) _$_findCachedViewById(R.id.em8)).setEndBtnVisibility(0);
                int i2 = c().groupType;
                if (i2 == 81) {
                    str = "promote_assistant";
                } else if (i2 != 82) {
                    str = "other";
                } else {
                    str = "business_account";
                }
                z.e eVar = new z.e();
                eVar.element = null;
                tuxSwitch.setOnClickListener(new d(this, tuxSwitch, str, textView2, eVar));
                a.C1112a aVar2 = new a.C1112a();
                h.f.b.l.b(inflate, "");
                a.C1112a a3 = aVar2.a(inflate).a(0).a(new i(this, tuxSwitch, str));
                TuxNavBar.a aVar3 = new TuxNavBar.a();
                aVar3.f45188d = true;
                a().a(NotificationApi.a().getSubscribeMarketingStatus().b(f.a.h.a.b(f.a.k.a.f158006c)).a(f.a.a.a.a.a(f.a.a.b.a.f157156a)).a(new e(a3, aVar3.b(new com.bytedance.tux.navigation.a.b().a(R.raw.icon_x_mark_small).a((h.f.a.a<h.z>) new h(this, inflate))), eVar, tuxSwitch, textView, textView2), f.f112993a));
                ((TextTitleBar) _$_findCachedViewById(R.id.em8)).setEndBtnClickListener(new g(this, eVar, a3, tuxSwitch, str));
            }
            com.ss.android.ugc.aweme.notification.a.f fVar2 = this.f112969f;
            if (fVar2 == null) {
                h.f.b.l.a("mDetailProxy");
            }
            com.ss.android.ugc.aweme.notification.a.f fVar3 = this.f112970g;
            if (fVar3 == null) {
                h.f.b.l.a("mTemplateProxy");
            }
            this.f112971h = new com.ss.android.ugc.aweme.notification.adapter.h(fVar2, fVar3, c().unReadMessageCount);
            MusNewNotificationModel musNewNotificationModel = new MusNewNotificationModel();
            this.f112973j = musNewNotificationModel;
            musNewNotificationModel.setCurrentNoticeGroup(c().groupType);
            com.ss.android.ugc.aweme.notification.f.c d2 = d();
            MusNewNotificationModel musNewNotificationModel2 = this.f112973j;
            if (musNewNotificationModel2 == null) {
                h.f.b.l.a("mNoticeModel");
            }
            d2.a((com.ss.android.ugc.aweme.common.b) musNewNotificationModel2);
            d().a_(this);
            com.ss.android.ugc.aweme.notification.adapter.h hVar = this.f112971h;
            if (hVar == null) {
                h.f.b.l.a("mAdapter");
            }
            hVar.a((h.a) this);
            com.ss.android.ugc.aweme.notification.adapter.h hVar2 = this.f112971h;
            if (hVar2 == null) {
                h.f.b.l.a("mAdapter");
            }
            hVar2.d(true);
            com.ss.android.ugc.aweme.notification.adapter.h hVar3 = this.f112971h;
            if (hVar3 == null) {
                h.f.b.l.a("mAdapter");
            }
            hVar3.ah_();
            RecyclerView recyclerView3 = (RecyclerView) _$_findCachedViewById(R.id.cxr);
            h.f.b.l.b(recyclerView3, "");
            com.ss.android.ugc.aweme.notification.adapter.h hVar4 = this.f112971h;
            if (hVar4 == null) {
                h.f.b.l.a("mAdapter");
            }
            recyclerView3.setAdapter(hVar4);
            ((TuxStatusView) _$_findCachedViewById(R.id.e_o)).a();
            TuxStatusView tuxStatusView = (TuxStatusView) _$_findCachedViewById(R.id.e_o);
            h.f.b.l.b(tuxStatusView, "");
            tuxStatusView.setVisibility(0);
            onRefresh();
            ActivityAgent.onTrace("com.ss.android.ugc.aweme.notification.MusNotificationDetailActivity", "onCreate", false);
            MethodCollector.o(656);
            return;
        }
        NullPointerException nullPointerException = new NullPointerException("null cannot be cast to non-null type androidx.recyclerview.widget.SimpleItemAnimator");
        MethodCollector.o(656);
        throw nullPointerException;
    }

    @Override // com.ss.android.ugc.aweme.common.e.c
    public final void b(List<BaseNotice> list, boolean z) {
        if (list == null || list.isEmpty()) {
            z = false;
        }
        if (!z) {
            k();
        } else {
            com.ss.android.ugc.aweme.notification.adapter.h hVar = this.f112971h;
            if (hVar == null) {
                h.f.b.l.a("mAdapter");
            }
            hVar.ai_();
        }
        com.ss.android.ugc.aweme.notification.adapter.h hVar2 = this.f112971h;
        if (hVar2 == null) {
            h.f.b.l.a("mAdapter");
        }
        hVar2.b(list);
    }

    @Override // com.ss.android.ugc.aweme.common.e.c
    public final void a(List<BaseNotice> list, boolean z) {
        com.ss.android.ugc.aweme.notification.adapter.h hVar = this.f112971h;
        if (hVar == null) {
            h.f.b.l.a("mAdapter");
        }
        hVar.d(true);
        int i2 = 0;
        if (this.f112976m) {
            com.ss.android.ugc.aweme.notification.adapter.h hVar2 = this.f112971h;
            if (hVar2 == null) {
                h.f.b.l.a("mAdapter");
            }
            hVar2.f113203a = 0;
        }
        this.f112976m = true;
        if (!z) {
            k();
        } else {
            com.ss.android.ugc.aweme.notification.adapter.h hVar3 = this.f112971h;
            if (hVar3 == null) {
                h.f.b.l.a("mAdapter");
            }
            hVar3.ai_();
        }
        SwipeRefreshLayout swipeRefreshLayout = (SwipeRefreshLayout) _$_findCachedViewById(R.id.cy1);
        h.f.b.l.b(swipeRefreshLayout, "");
        swipeRefreshLayout.setRefreshing(false);
        com.ss.android.ugc.aweme.notification.adapter.h hVar4 = this.f112971h;
        if (hVar4 == null) {
            h.f.b.l.a("mAdapter");
        }
        hVar4.b_(list);
        TuxStatusView tuxStatusView = (TuxStatusView) _$_findCachedViewById(R.id.e_o);
        h.f.b.l.b(tuxStatusView, "");
        tuxStatusView.setVisibility(8);
        if (list != null) {
            i2 = list.size();
        }
        com.ss.android.ugc.aweme.inbox.d.j.a(i2);
    }
}
