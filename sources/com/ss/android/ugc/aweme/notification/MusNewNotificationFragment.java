package com.ss.android.ugc.aweme.notification;

import android.animation.ObjectAnimator;
import android.content.Context;
import android.content.Intent;
import android.graphics.Rect;
import android.os.Bundle;
import android.os.Handler;
import android.text.SpannableString;
import android.text.SpannableStringBuilder;
import android.text.TextUtils;
import android.text.style.ForegroundColorSpan;
import android.text.style.StyleSpan;
import android.util.SparseArray;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.PopupWindow;
import android.widget.RelativeLayout;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.fragment.app.Fragment;
import androidx.legacy.widget.Space;
import androidx.lifecycle.ad;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import androidx.swiperefreshlayout.widget.SwipeRefreshLayout;
import com.bytedance.analytics.page.d;
import com.bytedance.apm.agent.v2.instrumentation.ClickAgent;
import com.bytedance.covode.number.Covode;
import com.bytedance.frameworks.apm.trace.MethodCollector;
import com.bytedance.hox.Hox;
import com.bytedance.ies.dmt.ui.widget.DmtStatusView;
import com.bytedance.ies.dmt.ui.widget.MtEmptyView;
import com.bytedance.ies.dmt.ui.widget.d;
import com.bytedance.keva.Keva;
import com.bytedance.router.SmartRoute;
import com.bytedance.router.SmartRouter;
import com.bytedance.tux.e.a;
import com.bytedance.tux.icon.TuxIconView;
import com.bytedance.tux.input.TuxTextView;
import com.bytedance.tux.status.TuxStatusView;
import com.ss.android.ugc.aweme.IAccountUserService;
import com.ss.android.ugc.aweme.UgAllServiceImpl;
import com.ss.android.ugc.aweme.analysis.Analysis;
import com.ss.android.ugc.aweme.base.utils.f;
import com.ss.android.ugc.aweme.be;
import com.ss.android.ugc.aweme.benchmark.BenchmarkServiceImpl;
import com.ss.android.ugc.aweme.commercialize.log.LogHelperImpl;
import com.ss.android.ugc.aweme.common.a.h;
import com.ss.android.ugc.aweme.discover.ui.NoticeView;
import com.ss.android.ugc.aweme.friends.ui.au;
import com.ss.android.ugc.aweme.homepage.msadapt.MSAdaptionService;
import com.ss.android.ugc.aweme.im.sdk.common.controller.providedservices.IMService;
import com.ss.android.ugc.aweme.im.service.IIMService;
import com.ss.android.ugc.aweme.inbox.d.e;
import com.ss.android.ugc.aweme.inbox.d.l;
import com.ss.android.ugc.aweme.inbox.e;
import com.ss.android.ugc.aweme.live.ILiveOuterService;
import com.ss.android.ugc.aweme.live.LiveOuterService;
import com.ss.android.ugc.aweme.metrics.u;
import com.ss.android.ugc.aweme.newfollow.c.e;
import com.ss.android.ugc.aweme.newfollow.ui.e;
import com.ss.android.ugc.aweme.notice.DmNoticeProxyImpl;
import com.ss.android.ugc.aweme.notice.api.a;
import com.ss.android.ugc.aweme.notice.api.helper.DmNoticeProxy;
import com.ss.android.ugc.aweme.notice.api.helper.LogHelper;
import com.ss.android.ugc.aweme.notice.repo.TutorialVideoResp;
import com.ss.android.ugc.aweme.notice.repo.list.bean.CombineLiveNotice;
import com.ss.android.ugc.aweme.notice.repo.list.bean.MusNotice;
import com.ss.android.ugc.aweme.notice.repo.list.bean.NoticeCombineDatas;
import com.ss.android.ugc.aweme.notification.adapter.d;
import com.ss.android.ugc.aweme.notification.bean.LiveMessage;
import com.ss.android.ugc.aweme.notification.bean.LiveNoticeMessageResponse;
import com.ss.android.ugc.aweme.notification.e.c;
import com.ss.android.ugc.aweme.notification.h.as;
import com.ss.android.ugc.aweme.notification.model.MusNewNotificationModel;
import com.ss.android.ugc.aweme.notification.service.a;
import com.ss.android.ugc.aweme.notification.tutorial.TutorialVideoViewModel;
import com.ss.android.ugc.aweme.notification.utils.AnalysisStayTimeFragmentComponent;
import com.ss.android.ugc.aweme.notification.utils.p;
import com.ss.android.ugc.aweme.notification.view.FixedLinearlayoutManager;
import com.ss.android.ugc.aweme.notification.vm.NotificationCombineVM;
import com.ss.android.ugc.aweme.profile.model.FollowStatus;
import com.ss.android.ugc.aweme.profile.model.User;
import com.ss.android.ugc.aweme.qna.services.QnaService;
import com.ss.android.ugc.aweme.recommend.g;
import com.ss.android.ugc.aweme.ug.UgCommonServiceImpl;
import com.zhiliaoapp.musically.R;
import java.util.ArrayList;
import java.util.Collection;
import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.concurrent.atomic.AtomicInteger;
import org.greenrobot.eventbus.EventBus;
import org.greenrobot.eventbus.ThreadMode;

@com.bytedance.ies.powerpage.a.a
public final class MusNewNotificationFragment extends com.ss.android.ugc.aweme.base.f.a implements SwipeRefreshLayout.b, com.bytedance.analytics.page.d, com.bytedance.hox.a.d, com.ss.android.ugc.aweme.base.a.k<User>, h.a, com.ss.android.ugc.aweme.common.e.c<MusNotice>, d.a, com.ss.android.ugc.aweme.notification.adapter.i, b, com.ss.android.ugc.aweme.notification.followrequest.a.b, as.b, org.greenrobot.eventbus.i, org.greenrobot.eventbus.j {
    public static final b z = new b((byte) 0);
    private final h.h A = h.i.a((h.f.a.a) s.f112960a);
    private final h.h B = h.i.a((h.f.a.a) u.f112962a);
    private final h.h C = h.i.a((h.f.a.a) t.f112961a);
    private final h.h D;
    private boolean E;
    private a F;
    private final h.h G;
    private final h.h H;
    private boolean I;
    private boolean J;
    private final Set<String> K;
    private SparseArray L;

    /* renamed from: a  reason: collision with root package name */
    public com.ss.android.ugc.aweme.notification.adapter.d f112926a;

    /* renamed from: b  reason: collision with root package name */
    public AnalysisStayTimeFragmentComponent f112927b;

    /* renamed from: c  reason: collision with root package name */
    TutorialVideoViewModel f112928c;

    /* renamed from: d  reason: collision with root package name */
    LinearLayoutManager f112929d;

    /* renamed from: e  reason: collision with root package name */
    com.ss.android.ugc.aweme.notification.view.c f112930e;

    /* renamed from: j  reason: collision with root package name */
    final List<com.ss.android.ugc.aweme.notice.repo.list.bean.f> f112931j = com.ss.android.ugc.aweme.notification.utils.d.a();

    /* renamed from: k  reason: collision with root package name */
    public int f112932k;

    /* renamed from: l  reason: collision with root package name */
    public int f112933l = a.b.a();

    /* renamed from: m  reason: collision with root package name */
    public final AtomicInteger f112934m = new AtomicInteger(2);
    public boolean n;
    com.ss.android.ugc.aweme.newfollow.ui.e o;
    public boolean p;
    public boolean q;
    public boolean r;
    public boolean s;
    public final boolean t;
    public boolean u;
    View v;
    public boolean w;
    final List<com.ss.android.ugc.aweme.friends.widget.contact.e> y;

    public enum a {
        ORIGIN_DATA,
        ADAPTER_DATA;

        static {
            Covode.recordClassIndex(72593);
        }
    }

    static final class k implements View.OnClickListener {

        /* renamed from: a  reason: collision with root package name */
        public static final k f112953a = new k();

        static {
            Covode.recordClassIndex(72618);
        }

        k() {
        }

        public final void onClick(View view) {
            ClickAgent.onClick(view);
        }
    }

    static {
        Covode.recordClassIndex(72592);
    }

    public final View a(int i2) {
        if (this.L == null) {
            this.L = new SparseArray();
        }
        View view = (View) this.L.get(i2);
        if (view != null) {
            return view;
        }
        View view2 = getView();
        if (view2 == null) {
            return null;
        }
        View findViewById = view2.findViewById(i2);
        this.L.put(i2, findViewById);
        return findViewById;
    }

    @Override // com.ss.android.ugc.aweme.base.a.k
    public final void a(FollowStatus followStatus, String str, String str2) {
    }

    @Override // com.ss.android.ugc.aweme.common.e.c
    public final void a(Exception exc) {
    }

    @Override // com.ss.android.ugc.aweme.notification.followrequest.a.b
    public final void a(List<User> list, boolean z2, boolean z3) {
        h.f.b.l.d(list, "");
    }

    @Override // com.bytedance.analytics.page.d
    public final String ad_() {
        return "MainTabPage";
    }

    @Override // com.ss.android.ugc.aweme.common.e.c
    public final void b() {
    }

    @Override // com.ss.android.ugc.aweme.notification.followrequest.a.b
    public final void b(boolean z2) {
    }

    @Override // com.ss.android.ugc.aweme.common.e.c
    public final void bh_() {
    }

    @Override // com.bytedance.analytics.page.b
    public final String bp_() {
        return "9018";
    }

    @Override // com.ss.android.ugc.aweme.common.e.c
    public final void c(List<MusNotice> list, boolean z2) {
    }

    @Override // org.greenrobot.eventbus.i
    public final Map<Integer, Object> getSubscriberEventTypes() {
        HashMap hashMap = new HashMap();
        hashMap.put(148, new org.greenrobot.eventbus.g(MusNewNotificationFragment.class, "onSwitchInbox", com.ss.android.ugc.aweme.notice.api.b.d.class, ThreadMode.MAIN, 0, true));
        hashMap.put(142, new org.greenrobot.eventbus.g(MusNewNotificationFragment.class, "onNotificationIndicatorEvent", com.ss.android.ugc.aweme.notice.api.bean.m.class, ThreadMode.MAIN, 0, false));
        hashMap.put(211, new org.greenrobot.eventbus.g(MusNewNotificationFragment.class, "onResumeRefreshEvent", com.ss.android.ugc.aweme.notice.api.bean.n.class, ThreadMode.POSTING, 0, false));
        hashMap.put(88, new org.greenrobot.eventbus.g(MusNewNotificationFragment.class, "onUnder16RefreshEvent", com.ss.android.ugc.aweme.im.service.b.e.class, ThreadMode.MAIN, 0, false));
        hashMap.put(68, new org.greenrobot.eventbus.g(MusNewNotificationFragment.class, "onRefreshMessageButton", com.ss.android.ugc.aweme.im.service.b.c.class, ThreadMode.MAIN, 0, false));
        return hashMap;
    }

    /* access modifiers changed from: package-private */
    public final com.ss.android.ugc.aweme.notification.followrequest.a.a i() {
        return (com.ss.android.ugc.aweme.notification.followrequest.a.a) this.A.getValue();
    }

    /* access modifiers changed from: package-private */
    public final com.ss.android.ugc.aweme.notification.f.b j() {
        return (com.ss.android.ugc.aweme.notification.f.b) this.B.getValue();
    }

    /* access modifiers changed from: package-private */
    public final MusNewNotificationModel k() {
        return (MusNewNotificationModel) this.C.getValue();
    }

    public final DmNoticeProxy m() {
        return (DmNoticeProxy) this.D.getValue();
    }

    public final NotificationCombineVM n() {
        return (NotificationCombineVM) this.G.getValue();
    }

    /* access modifiers changed from: package-private */
    public final com.ss.android.ugc.aweme.friends.widget.contact.c o() {
        return (com.ss.android.ugc.aweme.friends.widget.contact.c) this.H.getValue();
    }

    public static final class b {
        static {
            Covode.recordClassIndex(72609);
        }

        private b() {
        }

        public /* synthetic */ b(byte b2) {
            this();
        }
    }

    public static final class g implements e.b {
        static {
            Covode.recordClassIndex(72614);
        }

        g() {
        }

        @Override // com.ss.android.ugc.aweme.newfollow.ui.e.b
        public final void b(Context context) {
            UgAllServiceImpl.c().c(context);
        }

        @Override // com.ss.android.ugc.aweme.newfollow.ui.e.b
        public final boolean a(Context context) {
            return UgAllServiceImpl.c().d(context);
        }
    }

    public final void a(a aVar) {
        this.F = aVar;
        NotificationCombineVM n2 = n();
        n2.f114066g = true;
        ArrayList arrayList = new ArrayList();
        if (n2.i()) {
            arrayList.add(n2.r().b());
        }
        if (com.ss.android.ugc.aweme.inbox.b.b.c() && n2.a() == a.b.a() && com.ss.android.ugc.aweme.friends.service.a.f97047a.d().c()) {
            arrayList.add(n2.s().b());
        }
        if (arrayList.isEmpty()) {
            f.a.t a2 = f.a.t.a(NotificationCombineVM.m.f114083a);
            h.f.b.l.b(a2, "");
            arrayList.add(a2);
        }
        com.ss.android.ugc.aweme.notification.vm.a aVar2 = new com.ss.android.ugc.aweme.notification.vm.a(null, null, 3);
        f.a.t.a(arrayList).b(f.a.h.a.b(f.a.k.a.f158006c)).d(NotificationCombineVM.n.f114084a).a(f.a.a.a.a.a(f.a.a.b.a.f157156a)).a(new NotificationCombineVM.o(aVar2), new NotificationCombineVM.p(n2, aVar2), new NotificationCombineVM.q(n2, aVar2));
    }

    @Override // com.ss.android.ugc.aweme.common.e.c
    public final void a(List<MusNotice> list, boolean z2) {
        com.ss.android.ugc.aweme.inbox.d.e.a(new com.ss.android.ugc.aweme.inbox.d.l(list != null ? Integer.valueOf(list.size()) : null, null, k().lastGroupApiLogId));
        if (list != null && !list.isEmpty() && com.bytedance.ies.abmock.b.a().a(true, "i18n_following_live_skylight_type", 0) == 1) {
            Iterator<MusNotice> it = list.iterator();
            while (it.hasNext()) {
                if (it.next().type == 1001) {
                    it.remove();
                }
            }
        }
        if (!ab_()) {
            this.E = false;
            return;
        }
        com.ss.android.ugc.aweme.notification.adapter.d dVar = this.f112926a;
        if (dVar == null) {
            h.f.b.l.a("mAdapter");
        }
        dVar.f113159f = k().mTotal;
        this.w = !z2;
        n().q().clear();
        if (list != null) {
            n().q().addAll(list);
        }
        if (this.f112933l != a.b.a() || (!this.w && !com.ss.android.ugc.aweme.inbox.e.b().d())) {
            this.F = a.ORIGIN_DATA;
            a(new com.ss.android.ugc.aweme.notification.vm.a(null, null));
            return;
        }
        com.ss.android.ugc.aweme.inbox.d.e.c();
        a(a.ORIGIN_DATA);
    }

    /* JADX WARNING: Code restructure failed: missing block: B:34:0x00a2, code lost:
        if (r6.w == false) goto L_0x00b7;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void a(com.ss.android.ugc.aweme.notification.vm.a r7) {
        /*
        // Method dump skipped, instructions count: 257
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ss.android.ugc.aweme.notification.MusNewNotificationFragment.a(com.ss.android.ugc.aweme.notification.vm.a):void");
    }

    public final void a(MusNotice musNotice) {
        if (musNotice != null) {
            k().getItems().remove(musNotice);
        }
    }

    @Override // com.ss.android.ugc.aweme.notification.adapter.i
    public final void a(com.ss.android.ugc.aweme.notice.repo.list.bean.f fVar) {
        h.f.b.l.d(fVar, "");
        this.f112933l = fVar.f112856a;
        k().setCurrentNoticeGroup(this.f112933l);
        com.ss.android.ugc.aweme.notification.adapter.d dVar = this.f112926a;
        if (dVar == null) {
            h.f.b.l.a("mAdapter");
        }
        dVar.a(this.f112933l, fVar);
        n().a(fVar);
        if (this.f112933l == a.b.a()) {
            TuxTextView tuxTextView = (TuxTextView) a(R.id.f08);
            h.f.b.l.b(tuxTextView, "");
            Context context = getContext();
            if (context == null) {
                h.f.b.l.b();
            }
            tuxTextView.setText(context.getString(R.string.djs));
        } else {
            TuxTextView tuxTextView2 = (TuxTextView) a(R.id.f08);
            h.f.b.l.b(tuxTextView2, "");
            Context context2 = getContext();
            if (context2 == null) {
                h.f.b.l.b();
            }
            tuxTextView2.setText(context2.getString(fVar.f112857b));
        }
        a(fVar.f112859d, fVar.f112860e, fVar.f112861f);
        C();
        com.ss.android.ugc.aweme.notification.view.c cVar = this.f112930e;
        if (cVar != null) {
            cVar.dismiss();
        }
        com.ss.android.ugc.aweme.notification.utils.e.a(n().b());
    }

    @Override // com.ss.android.ugc.aweme.notification.followrequest.a.b
    public final void a(List<User> list, int i2) {
        h.f.b.l.d(list, "");
        this.f112934m.decrementAndGet();
        com.ss.android.ugc.aweme.notification.adapter.d dVar = this.f112926a;
        if (dVar == null) {
            h.f.b.l.a("mAdapter");
        }
        com.ss.android.ugc.aweme.notification.adapter.d.a(dVar, list, i2, this.f112932k);
        if (this.f112934m.get() == 0) {
            ((DmtStatusView) a(R.id.eg_)).d();
            TuxStatusView tuxStatusView = (TuxStatusView) a(R.id.ega);
            h.f.b.l.b(tuxStatusView, "");
            tuxStatusView.setVisibility(8);
        }
    }

    @Override // com.ss.android.ugc.aweme.notification.followrequest.a.b
    public final void a(boolean z2) {
        this.f112934m.decrementAndGet();
        if (this.n) {
            v();
        } else {
            w();
        }
    }

    static final class ac extends h.f.b.m implements h.f.a.a<com.ss.android.ugc.aweme.friends.widget.contact.c> {

        /* renamed from: a  reason: collision with root package name */
        public static final ac f112936a = new ac();

        static {
            Covode.recordClassIndex(72596);
        }

        ac() {
            super(0);
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        @Override // h.f.a.a
        public final /* synthetic */ com.ss.android.ugc.aweme.friends.widget.contact.c invoke() {
            return com.ss.android.ugc.aweme.friends.service.a.f97047a.n();
        }
    }

    static final class d extends h.f.b.m implements h.f.a.a<NotificationCombineVM> {
        final /* synthetic */ MusNewNotificationFragment this$0;

        static {
            Covode.recordClassIndex(72611);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        d(MusNewNotificationFragment musNewNotificationFragment) {
            super(0);
            this.this$0 = musNewNotificationFragment;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        @Override // h.f.a.a
        public final /* synthetic */ NotificationCombineVM invoke() {
            return NotificationCombineVM.a.a(this.this$0);
        }
    }

    static final class e extends h.f.b.m implements h.f.a.a<DmNoticeProxy> {

        /* renamed from: a  reason: collision with root package name */
        public static final e f112948a = new e();

        static {
            Covode.recordClassIndex(72612);
        }

        e() {
            super(0);
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        @Override // h.f.a.a
        public final /* synthetic */ DmNoticeProxy invoke() {
            return DmNoticeProxyImpl.e();
        }
    }

    static final class s extends h.f.b.m implements h.f.a.a<com.ss.android.ugc.aweme.notification.followrequest.a.a> {

        /* renamed from: a  reason: collision with root package name */
        public static final s f112960a = new s();

        static {
            Covode.recordClassIndex(72626);
        }

        s() {
            super(0);
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        @Override // h.f.a.a
        public final /* synthetic */ com.ss.android.ugc.aweme.notification.followrequest.a.a invoke() {
            return new com.ss.android.ugc.aweme.notification.followrequest.a.a();
        }
    }

    static final class t extends h.f.b.m implements h.f.a.a<MusNewNotificationModel> {

        /* renamed from: a  reason: collision with root package name */
        public static final t f112961a = new t();

        static {
            Covode.recordClassIndex(72627);
        }

        t() {
            super(0);
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        @Override // h.f.a.a
        public final /* synthetic */ MusNewNotificationModel invoke() {
            return new MusNewNotificationModel();
        }
    }

    static final class u extends h.f.b.m implements h.f.a.a<com.ss.android.ugc.aweme.notification.f.b> {

        /* renamed from: a  reason: collision with root package name */
        public static final u f112962a = new u();

        static {
            Covode.recordClassIndex(72628);
        }

        u() {
            super(0);
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        @Override // h.f.a.a
        public final /* synthetic */ com.ss.android.ugc.aweme.notification.f.b invoke() {
            return new com.ss.android.ugc.aweme.notification.f.b();
        }
    }

    @Override // com.bytedance.analytics.page.b
    public final String ac_() {
        return d.a.a(this);
    }

    @Override // com.bytedance.analytics.page.b
    public final Map<String, String> c() {
        return d.a.b(this);
    }

    @Override // com.bytedance.ies.uikit.a.b, androidx.fragment.app.Fragment, com.ss.android.ugc.b.a.a.a
    public final void onPause() {
        super.onPause();
        c(false);
    }

    @Override // com.bytedance.ies.uikit.a.b, androidx.fragment.app.Fragment, com.ss.android.ugc.b.a.a.a
    public final void onStop() {
        super.onStop();
        I();
    }

    /* access modifiers changed from: package-private */
    public static final class an implements Runnable {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ MusNewNotificationFragment f112945a;

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ com.ss.android.ugc.aweme.notification.vm.b f112946b;

        static {
            Covode.recordClassIndex(72607);
        }

        an(MusNewNotificationFragment musNewNotificationFragment, com.ss.android.ugc.aweme.notification.vm.b bVar) {
            this.f112945a = musNewNotificationFragment;
            this.f112946b = bVar;
        }

        public final void run() {
            com.ss.android.ugc.aweme.inbox.f.b(new h.f.a.b<e.a, h.z>(this) {
                /* class com.ss.android.ugc.aweme.notification.MusNewNotificationFragment.an.AnonymousClass1 */
                final /* synthetic */ an this$0;

                static {
                    Covode.recordClassIndex(72608);
                }

                {
                    this.this$0 = r2;
                }

                /* Return type fixed from 'java.lang.Object' to match base method */
                /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
                @Override // h.f.a.b
                public final /* synthetic */ h.z invoke(e.a aVar) {
                    e.a aVar2 = aVar;
                    h.f.b.l.d(aVar2, "");
                    aVar2.a(!this.this$0.f112946b.f114224b.isEmpty(), MusNewNotificationFragment.c(this.this$0.f112945a).f113156c);
                    return h.z.f158842a;
                }
            });
        }
    }

    private static boolean A() {
        try {
            return f.a.f68431a.c();
        } catch (Exception unused) {
            return false;
        }
    }

    private final void I() {
        if (this.J) {
            BenchmarkServiceImpl.c().a();
        }
    }

    @Override // com.ss.android.ugc.aweme.common.e.c
    public final void aO_() {
        com.ss.android.ugc.aweme.notification.adapter.d dVar = this.f112926a;
        if (dVar == null) {
            h.f.b.l.a("mAdapter");
        }
        dVar.ag_();
    }

    @Override // com.ss.android.ugc.aweme.notification.b
    public final String h() {
        return n().b();
    }

    @Override // com.bytedance.ies.uikit.a.b, androidx.fragment.app.Fragment, com.ss.android.ugc.b.a.a.a
    public final void onResume() {
        com.ss.android.ugc.aweme.inbox.d.e.a(com.ss.android.ugc.aweme.inbox.d.a.ON_RESUME, new z(this));
    }

    @Override // androidx.fragment.app.Fragment, com.ss.android.ugc.b.a.a.a
    public final void onStart() {
        com.ss.android.ugc.aweme.inbox.d.e.a(com.ss.android.ugc.aweme.inbox.d.a.ON_START, new aa(this));
    }

    /* access modifiers changed from: package-private */
    public final void t() {
        com.ss.android.ugc.aweme.notification.adapter.d dVar = this.f112926a;
        if (dVar == null) {
            h.f.b.l.a("mAdapter");
        }
        dVar.d(false);
    }

    public final void z() {
        if (this.J) {
            BenchmarkServiceImpl.c().a(3);
        }
    }

    static final class aa extends h.f.b.m implements h.f.a.a<h.z> {
        final /* synthetic */ MusNewNotificationFragment this$0;

        static {
            Covode.recordClassIndex(72594);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        aa(MusNewNotificationFragment musNewNotificationFragment) {
            super(0);
            this.this$0 = musNewNotificationFragment;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        @Override // h.f.a.a
        public final /* synthetic */ h.z invoke() {
            MusNewNotificationFragment.super.onStart();
            UgCommonServiceImpl.j().b(this.this$0.getContext());
            this.this$0.z();
            return h.z.f158842a;
        }
    }

    static final class l extends h.f.b.m implements h.f.a.a<h.z> {
        final /* synthetic */ MusNewNotificationFragment this$0;

        static {
            Covode.recordClassIndex(72619);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        l(MusNewNotificationFragment musNewNotificationFragment) {
            super(0);
            this.this$0 = musNewNotificationFragment;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        @Override // h.f.a.a
        public final /* synthetic */ h.z invoke() {
            DmtStatusView dmtStatusView = (DmtStatusView) this.this$0.a(R.id.eg_);
            dmtStatusView.g();
            dmtStatusView.setFocusable(false);
            dmtStatusView.setFocusableInTouchMode(false);
            return h.z.f158842a;
        }
    }

    static final class v extends h.f.b.m implements h.f.a.a<h.z> {
        final /* synthetic */ Bundle $savedInstanceState;
        final /* synthetic */ MusNewNotificationFragment this$0;

        static {
            Covode.recordClassIndex(72629);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        v(MusNewNotificationFragment musNewNotificationFragment, Bundle bundle) {
            super(0);
            this.this$0 = musNewNotificationFragment;
            this.$savedInstanceState = bundle;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        @Override // h.f.a.a
        public final /* synthetic */ h.z invoke() {
            MusNewNotificationFragment.super.onActivityCreated(this.$savedInstanceState);
            this.this$0.f112927b = new AnalysisStayTimeFragmentComponent(this.this$0);
            return h.z.f158842a;
        }
    }

    static final class w extends h.f.b.m implements h.f.a.a<h.z> {
        final /* synthetic */ Bundle $savedInstanceState;
        final /* synthetic */ MusNewNotificationFragment this$0;

        static {
            Covode.recordClassIndex(72630);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        w(MusNewNotificationFragment musNewNotificationFragment, Bundle bundle) {
            super(0);
            this.this$0 = musNewNotificationFragment;
            this.$savedInstanceState = bundle;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        @Override // h.f.a.a
        public final /* synthetic */ h.z invoke() {
            MusNewNotificationFragment.super.onCreate(this.$savedInstanceState);
            EventBus.a(EventBus.a(), this.this$0);
            return h.z.f158842a;
        }
    }

    static final class x extends h.f.b.m implements h.f.a.a<View> {
        final /* synthetic */ ViewGroup $container;
        final /* synthetic */ LayoutInflater $inflater;

        static {
            Covode.recordClassIndex(72631);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        x(LayoutInflater layoutInflater, ViewGroup viewGroup) {
            super(0);
            this.$inflater = layoutInflater;
            this.$container = viewGroup;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        @Override // h.f.a.a
        public final /* synthetic */ View invoke() {
            View a2 = com.a.a(this.$inflater, R.layout.kj, this.$container, false);
            h.f.b.l.b(a2, "");
            a2.setBackgroundColor(androidx.core.content.b.c(a2.getContext(), R.color.f159928l));
            return a2;
        }
    }

    private static boolean B() {
        if (com.ss.android.ugc.aweme.lancet.j.f107229h && com.ss.android.ugc.aweme.lancet.j.b() && !com.ss.android.ugc.aweme.lancet.j.c()) {
            return com.ss.android.ugc.aweme.lancet.j.f107229h;
        }
        boolean A2 = A();
        com.ss.android.ugc.aweme.lancet.j.f107229h = A2;
        return A2;
    }

    @Override // com.ss.android.ugc.aweme.base.f.a, com.ss.android.ugc.aweme.analysis.c
    public final Analysis F() {
        Analysis labelName = new Analysis().setLabelName("message");
        h.f.b.l.b(labelName, "");
        return labelName;
    }

    @Override // com.bytedance.ies.uikit.a.b, androidx.fragment.app.Fragment, com.ss.android.ugc.b.a.a.a
    public final void onDestroy() {
        super.onDestroy();
        if (com.ss.android.ugc.aweme.inbox.b.b.b()) {
            com.ss.android.ugc.aweme.notification.e.c.c();
        }
        EventBus.a().b(this);
        com.ss.android.ugc.aweme.notification.utils.n.a((Bundle) null, 0);
    }

    /* access modifiers changed from: package-private */
    public final void p() {
        if (com.ss.android.ugc.aweme.notice.api.b.b().isChatFunOfflineUnder16()) {
            View view = this.v;
            if (view != null) {
                view.setVisibility(8);
                return;
            }
            return;
        }
        View view2 = this.v;
        if (view2 != null) {
            view2.setVisibility(0);
        }
    }

    public final void s() {
        com.ss.android.ugc.aweme.inbox.d.e.b(l.a.a(new IllegalStateException("Mus unknown error")));
        a(new com.ss.android.ugc.aweme.notification.vm.a(null, null, 3));
    }

    @Override // com.ss.android.ugc.aweme.notification.adapter.d.a
    public final void y() {
        com.ss.android.ugc.aweme.inbox.f.b(c.f112947a);
        if (this.w) {
            a(a.ADAPTER_DATA);
        } else {
            l();
        }
        com.ss.android.ugc.aweme.notification.utils.e.c(n().b());
    }

    static final class ah implements PopupWindow.OnDismissListener {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ MusNewNotificationFragment f112939a;

        static {
            Covode.recordClassIndex(72601);
        }

        ah(MusNewNotificationFragment musNewNotificationFragment) {
            this.f112939a = musNewNotificationFragment;
        }

        public final void onDismiss() {
            this.f112939a.u();
            this.f112939a.r();
            ObjectAnimator ofFloat = ObjectAnimator.ofFloat(this.f112939a.a(R.id.bx0), "rotation", 180.0f, 0.0f);
            h.f.b.l.b(ofFloat, "");
            ofFloat.setDuration(200L);
            ofFloat.start();
        }
    }

    @Override // com.ss.android.ugc.aweme.base.f.a, com.bytedance.ies.uikit.a.b, androidx.fragment.app.Fragment
    public final void onDestroyView() {
        super.onDestroyView();
        j().h();
        j().cd_();
        i().h();
        i().cd_();
        m().a("notification_page");
        SparseArray sparseArray = this.L;
        if (sparseArray != null) {
            sparseArray.clear();
        }
    }

    public final void u() {
        if (((RecyclerView) a(R.id.drj)).canScrollVertically(-1)) {
            View a2 = a(R.id.fem);
            h.f.b.l.b(a2, "");
            a2.setVisibility(0);
            return;
        }
        View a3 = a(R.id.fem);
        h.f.b.l.b(a3, "");
        a3.setVisibility(4);
    }

    @Override // com.ss.android.ugc.aweme.notification.h.as.b
    public final void x() {
        IAccountUserService g2 = com.ss.android.ugc.aweme.account.b.g();
        h.f.b.l.b(g2, "");
        User curUser = g2.getCurUser();
        h.f.b.l.b(curUser, "");
        SmartRouter.buildRoute(this, "aweme://user/qna/profile/" + curUser.getUid()).withParam("enter_from", "notification_page").withParam("enter_method", "click_turn_on_qna").open();
    }

    static final class z extends h.f.b.m implements h.f.a.a<h.z> {
        final /* synthetic */ MusNewNotificationFragment this$0;

        static {
            Covode.recordClassIndex(72633);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        z(MusNewNotificationFragment musNewNotificationFragment) {
            super(0);
            this.this$0 = musNewNotificationFragment;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        @Override // h.f.a.a
        public final /* synthetic */ h.z invoke() {
            MusNewNotificationFragment.super.onResume();
            this.this$0.c(true);
            this.this$0.q();
            if (this.this$0.s) {
                this.this$0.onRefresh();
                this.this$0.s = false;
            }
            if (this.this$0.p) {
                this.this$0.onRefresh();
                this.this$0.p = false;
            }
            if (this.this$0.q) {
                this.this$0.onRefresh();
                this.this$0.q = false;
            }
            if (this.this$0.r) {
                this.this$0.onRefresh();
                this.this$0.r = false;
            }
            this.this$0.m().b("notification_page");
            if (this.this$0.f112933l == a.b.a() && this.this$0.t) {
                this.this$0.f112934m.incrementAndGet();
                this.this$0.k().startFetchLive();
            }
            return h.z.f158842a;
        }
    }

    private final void C() {
        com.ss.android.ugc.aweme.notification.e.a.b.f113350a = null;
        List<MusNotice> itemsFromGroup = k().getItemsFromGroup(this.f112933l);
        com.ss.android.ugc.aweme.notification.adapter.d dVar = this.f112926a;
        if (dVar == null) {
            h.f.b.l.a("mAdapter");
        }
        dVar.b_(itemsFromGroup);
        com.ss.android.ugc.aweme.notification.adapter.d dVar2 = this.f112926a;
        if (dVar2 == null) {
            h.f.b.l.a("mAdapter");
        }
        dVar2.notifyDataSetChanged();
        getActivity();
        if (!B()) {
            this.f112934m.set(0);
            new com.bytedance.tux.g.b(this).e(R.string.de8).b();
            if (ab_()) {
                v();
                return;
            }
            return;
        }
        com.ss.android.ugc.aweme.notification.adapter.d dVar3 = this.f112926a;
        if (dVar3 == null) {
            h.f.b.l.a("mAdapter");
        }
        if (dVar3.getItemCount() > 0) {
            TuxStatusView tuxStatusView = (TuxStatusView) a(R.id.ega);
            h.f.b.l.b(tuxStatusView, "");
            tuxStatusView.setVisibility(0);
            ((TuxStatusView) a(R.id.ega)).a();
        }
        onRefresh();
    }

    private final void D() {
        if (ab_()) {
            com.ss.android.ugc.aweme.notification.adapter.d dVar = this.f112926a;
            if (dVar == null) {
                h.f.b.l.a("mAdapter");
            }
            if (dVar.v) {
                com.ss.android.ugc.aweme.notification.adapter.d dVar2 = this.f112926a;
                if (dVar2 == null) {
                    h.f.b.l.a("mAdapter");
                }
                dVar2.notifyDataSetChanged();
                t();
            }
            SwipeRefreshLayout swipeRefreshLayout = (SwipeRefreshLayout) a(R.id.e92);
            h.f.b.l.b(swipeRefreshLayout, "");
            swipeRefreshLayout.setRefreshing(false);
            w();
            TuxStatusView tuxStatusView = (TuxStatusView) a(R.id.ega);
            h.f.b.l.b(tuxStatusView, "");
            tuxStatusView.setVisibility(8);
        }
    }

    private final boolean E() {
        com.ss.android.ugc.aweme.notification.adapter.d dVar = this.f112926a;
        if (dVar == null) {
            h.f.b.l.a("mAdapter");
        }
        List e2 = dVar.e();
        if (e2 != null && !e2.isEmpty()) {
            com.ss.android.ugc.aweme.notification.adapter.d dVar2 = this.f112926a;
            if (dVar2 == null) {
                h.f.b.l.a("mAdapter");
            }
            List<MusNotice> e3 = dVar2.e();
            if (!(e3 instanceof Collection) || !e3.isEmpty()) {
                int i2 = 0;
                for (MusNotice musNotice : e3) {
                    if (musNotice.type != 50 && (i2 = i2 + 1) < 0) {
                        h.a.n.b();
                    }
                }
                if (i2 == 0) {
                    return true;
                }
                return false;
            }
        }
        return true;
    }

    @Override // com.ss.android.ugc.aweme.common.e.c
    public final void f() {
        com.ss.android.ugc.aweme.notification.adapter.d dVar = this.f112926a;
        if (dVar == null) {
            h.f.b.l.a("mAdapter");
        }
        if (dVar.v) {
            t();
        }
        TuxStatusView tuxStatusView = (TuxStatusView) a(R.id.ega);
        h.f.b.l.b(tuxStatusView, "");
        tuxStatusView.setVisibility(0);
        ((TuxStatusView) a(R.id.ega)).a();
        com.ss.android.ugc.aweme.inbox.d.e.a(new com.ss.android.ugc.aweme.inbox.d.l(0, null, k().lastGroupApiLogId));
        n().q().clear();
        this.w = true;
        if (this.f112933l == a.b.a()) {
            com.ss.android.ugc.aweme.inbox.d.e.c();
            a(a.ORIGIN_DATA);
            return;
        }
        this.F = a.ORIGIN_DATA;
        a(new com.ss.android.ugc.aweme.notification.vm.a(null, null, 3));
    }

    public final void q() {
        if (ab_()) {
            androidx.fragment.app.e activity = getActivity();
            if (activity == null) {
                h.f.b.l.b();
            }
            h.f.b.l.b(activity, "");
            Intent intent = activity.getIntent();
            if (intent != null) {
                String a2 = a(intent, "label");
                String a3 = a(intent, "uid");
                if (intent.getBooleanExtra("is_from_push", false) && this.f112933l != a.b.a()) {
                    com.ss.android.ugc.aweme.notification.view.c cVar = this.f112930e;
                    if (cVar != null) {
                        cVar.a();
                    }
                    a(this.f112931j.get(0));
                }
                intent.putExtra("label", "");
                if (TextUtils.equals(a2, "follow_request")) {
                    startActivityForResult(SmartRouter.buildRoute(getContext(), "aweme://follow_request").withParam("label", a2).withParam("uid", a3).buildIntent(), 1024);
                }
            }
        }
    }

    public final void r() {
        if (com.ss.android.ugc.aweme.inbox.a.a.d()) {
            ImageView imageView = (ImageView) a(R.id.c25);
            h.f.b.l.b(imageView, "");
            imageView.setVisibility(8);
            return;
        }
        if (this.f112933l != a.b.a()) {
            int a2 = com.ss.android.ugc.aweme.notice.api.b.a(a.b.a());
            int a3 = com.ss.android.ugc.aweme.notice.api.b.a(this.f112933l);
            if (a2 > 0 && a2 > a3) {
                ImageView imageView2 = (ImageView) a(R.id.c25);
                h.f.b.l.b(imageView2, "");
                imageView2.setVisibility(0);
                return;
            }
        }
        ImageView imageView3 = (ImageView) a(R.id.c25);
        h.f.b.l.b(imageView3, "");
        imageView3.setVisibility(8);
    }

    public final void v() {
        if (this.f112934m.get() <= 0) {
            ((DmtStatusView) a(R.id.eg_)).d();
            SwipeRefreshLayout swipeRefreshLayout = (SwipeRefreshLayout) a(R.id.e92);
            h.f.b.l.b(swipeRefreshLayout, "");
            swipeRefreshLayout.setRefreshing(false);
            TuxStatusView tuxStatusView = (TuxStatusView) a(R.id.ega);
            h.f.b.l.b(tuxStatusView, "");
            tuxStatusView.setVisibility(8);
            if (E()) {
                ((DmtStatusView) a(R.id.eg_)).h();
                RecyclerView recyclerView = (RecyclerView) a(R.id.drj);
                h.f.b.l.b(recyclerView, "");
                recyclerView.getVisibility();
            }
        }
    }

    public final void w() {
        if (this.f112934m.get() <= 0) {
            ((DmtStatusView) a(R.id.eg_)).d();
            SwipeRefreshLayout swipeRefreshLayout = (SwipeRefreshLayout) a(R.id.e92);
            h.f.b.l.b(swipeRefreshLayout, "");
            swipeRefreshLayout.setRefreshing(false);
            TuxStatusView tuxStatusView = (TuxStatusView) a(R.id.ega);
            h.f.b.l.b(tuxStatusView, "");
            tuxStatusView.setVisibility(8);
            if (E()) {
                DmtStatusView dmtStatusView = (DmtStatusView) a(R.id.eg_);
                dmtStatusView.g();
                dmtStatusView.setFocusable(false);
                dmtStatusView.setFocusableInTouchMode(false);
            }
        }
    }

    public MusNewNotificationFragment() {
        Boolean bool;
        ILiveOuterService s2 = LiveOuterService.s();
        h.f.b.l.b(s2, "");
        com.ss.android.ugc.aweme.live.c d2 = s2.d();
        boolean z2 = false;
        if (!(d2 == null || (bool = (Boolean) d2.a("live_square_inbox_refresh", (Object) false)) == null)) {
            z2 = bool.booleanValue();
        }
        this.t = z2;
        this.D = h.i.a((h.f.a.a) e.f112948a);
        this.F = a.ORIGIN_DATA;
        this.G = h.i.a((h.f.a.a) new d(this));
        this.H = h.i.a((h.f.a.a) ac.f112936a);
        this.y = new ArrayList();
        this.J = true;
        this.K = new LinkedHashSet();
        com.ss.android.ugc.aweme.inbox.e.a();
        com.ss.android.ugc.aweme.inbox.d.e.b();
        c.HandlerC2905c b2 = com.ss.android.ugc.aweme.notification.e.c.b();
        if (b2 != null) {
            b2.j();
        }
    }

    @Override // com.ss.android.ugc.aweme.notification.followrequest.a.b
    public final void a() {
        this.f112934m.decrementAndGet();
        com.ss.android.ugc.aweme.notification.adapter.d dVar = this.f112926a;
        if (dVar == null) {
            h.f.b.l.a("mAdapter");
        }
        com.ss.android.ugc.aweme.notification.adapter.d.a(dVar, new ArrayList(), 0, 0);
        if (this.n) {
            v();
        } else {
            w();
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:22:0x006a, code lost:
        if (r1.f113156c == false) goto L_0x0039;
     */
    @Override // com.ss.android.ugc.aweme.common.a.h.a
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void l() {
        /*
        // Method dump skipped, instructions count: 168
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ss.android.ugc.aweme.notification.MusNewNotificationFragment.l():void");
    }

    @Override // androidx.swiperefreshlayout.widget.SwipeRefreshLayout.b
    public final void onRefresh() {
        if (ab_() && !this.E) {
            if (com.ss.android.ugc.aweme.notification.utils.l.a()) {
                this.f112934m.set(0);
                SwipeRefreshLayout swipeRefreshLayout = (SwipeRefreshLayout) a(R.id.e92);
                h.f.b.l.b(swipeRefreshLayout, "");
                swipeRefreshLayout.setRefreshing(false);
                w();
                return;
            }
            com.ss.android.ugc.aweme.notification.e.a.b.c();
            getActivity();
            if (B()) {
                this.E = true;
                this.n = false;
                com.ss.android.ugc.aweme.notification.adapter.d dVar = this.f112926a;
                if (dVar == null) {
                    h.f.b.l.a("mAdapter");
                }
                if (dVar.getItemCount() == 0) {
                    ((DmtStatusView) a(R.id.eg_)).f();
                }
                this.f112934m.set(1);
                if (this.f112933l == a.b.a() && !com.ss.android.ugc.aweme.notification.utils.l.a() && com.bytedance.ies.abmock.b.a().a(true, "inbox_has_top_msg", false)) {
                    TutorialVideoViewModel tutorialVideoViewModel = this.f112928c;
                    if (tutorialVideoViewModel == null) {
                        h.f.b.l.a("mTutorialVideoModel");
                    }
                    f.a.b.b a2 = tutorialVideoViewModel.a().b(f.a.h.a.b(f.a.k.a.f158006c)).a(new TutorialVideoViewModel.b(tutorialVideoViewModel), TutorialVideoViewModel.c.f113837a);
                    h.f.b.l.b(a2, "");
                    f.a.j.a.a(a2, (f.a.b.a) tutorialVideoViewModel.f113833b.getValue());
                }
                this.s = false;
                com.ss.android.ugc.aweme.inbox.d.e.a(e.C2651e.f104125a);
                j().a(1, Integer.valueOf(this.f112933l), null);
                int i2 = this.f112933l;
                if (i2 == a.b.a()) {
                    this.f112932k = com.ss.android.ugc.aweme.notice.api.b.a(12);
                }
                Keva a3 = com.ss.android.ugc.aweme.inbox.i.a();
                Map<String, ?> all = a3.getAll();
                if (all != null) {
                    LinkedHashMap linkedHashMap = new LinkedHashMap();
                    for (Map.Entry<String, ?> entry : all.entrySet()) {
                        String key = entry.getKey();
                        h.f.b.l.b(key, "");
                        if (h.m.p.b(key, "key_live_notice_status_", false)) {
                            linkedHashMap.put(entry.getKey(), entry.getValue());
                        }
                    }
                    for (Map.Entry entry2 : linkedHashMap.entrySet()) {
                        a3.storeInt((String) entry2.getKey(), 0);
                    }
                }
                n();
                NotificationCombineVM.a(i2);
                com.ss.android.ugc.d.a.c.a(new com.ss.android.ugc.aweme.notice.api.bean.m(6, com.ss.android.ugc.aweme.notice.api.b.a(6)));
            } else {
                this.f112934m.set(0);
                new com.bytedance.tux.g.b(this).e(R.string.de8).b();
                b.i.a(100).a(new y(this), b.i.f4826c, null);
            }
            n().d().clear();
            this.K.clear();
        }
    }

    static final class ab extends h.f.b.m implements h.f.a.a<h.z> {
        final /* synthetic */ Bundle $savedInstanceState;
        final /* synthetic */ View $view;
        final /* synthetic */ MusNewNotificationFragment this$0;

        static {
            Covode.recordClassIndex(72595);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        ab(MusNewNotificationFragment musNewNotificationFragment, View view, Bundle bundle) {
            super(0);
            this.this$0 = musNewNotificationFragment;
            this.$view = view;
            this.$savedInstanceState = bundle;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        @Override // h.f.a.a
        public final /* synthetic */ h.z invoke() {
            int i2;
            String str;
            Object obj;
            com.ss.android.ugc.aweme.newfollow.ui.e eVar;
            int identifier;
            MethodCollector.i(2175);
            MusNewNotificationFragment.super.onViewCreated(this.$view, this.$savedInstanceState);
            com.ss.android.ugc.aweme.notification.utils.g.b(this.$view.getContext());
            MusNewNotificationFragment musNewNotificationFragment = this.this$0;
            musNewNotificationFragment.f112933l = a.b.a();
            View a2 = musNewNotificationFragment.a(R.id.fej);
            h.f.b.l.b(a2, "");
            ViewGroup.LayoutParams layoutParams = a2.getLayoutParams();
            Context context = musNewNotificationFragment.getContext();
            boolean z = false;
            if (context == null || (identifier = context.getResources().getIdentifier("status_bar_height", "dimen", "android")) <= 0) {
                i2 = 0;
            } else {
                i2 = context.getResources().getDimensionPixelSize(identifier);
            }
            layoutParams.height = i2;
            musNewNotificationFragment.getContext();
            musNewNotificationFragment.f112929d = new FixedLinearlayoutManager();
            RecyclerView recyclerView = (RecyclerView) musNewNotificationFragment.a(R.id.drj);
            h.f.b.l.b(recyclerView, "");
            LinearLayoutManager linearLayoutManager = musNewNotificationFragment.f112929d;
            if (linearLayoutManager == null) {
                h.f.b.l.a("mLinearLayoutManager");
            }
            recyclerView.setLayoutManager(linearLayoutManager);
            ((RecyclerView) musNewNotificationFragment.a(R.id.drj)).a(new com.ss.android.ugc.aweme.framework.b.a(musNewNotificationFragment.getContext()));
            com.ss.android.ugc.aweme.notification.utils.q.a((RecyclerView) musNewNotificationFragment.a(R.id.drj), (SwipeRefreshLayout) musNewNotificationFragment.a(R.id.e92));
            ((RecyclerView) musNewNotificationFragment.a(R.id.drj)).a(new f(musNewNotificationFragment));
            ((SwipeRefreshLayout) musNewNotificationFragment.a(R.id.e92)).setOnRefreshListener(musNewNotificationFragment);
            if (!com.ss.android.ugc.aweme.notification.utils.l.a()) {
                com.ss.android.ugc.aweme.notification.g.a.a(musNewNotificationFragment.a(R.id.c93));
                ((ConstraintLayout) musNewNotificationFragment.a(R.id.c93)).setOnClickListener(new j(musNewNotificationFragment));
                TuxIconView tuxIconView = (TuxIconView) musNewNotificationFragment.a(R.id.bx0);
                h.f.b.l.b(tuxIconView, "");
                tuxIconView.setVisibility(0);
                if (!com.ss.android.ugc.aweme.inbox.b.b.b()) {
                    musNewNotificationFragment.v = IMService.createIIMServicebyMonsterPlugin(false).getDmEntranceView(musNewNotificationFragment.getActivity(), "notification_page");
                    View view = musNewNotificationFragment.v;
                    if (view != null) {
                        view.setOnClickListener(new r(musNewNotificationFragment));
                        ((RelativeLayout) musNewNotificationFragment.a(R.id.dp_)).addView(view);
                    }
                }
            }
            ((RelativeLayout) musNewNotificationFragment.a(R.id.dp_)).setOnClickListener(k.f112953a);
            musNewNotificationFragment.a(R.string.djs, R.string.dk4, 2131231278);
            musNewNotificationFragment.j().a((com.ss.android.ugc.aweme.common.b) musNewNotificationFragment.k());
            musNewNotificationFragment.j().a((com.ss.android.ugc.aweme.common.e.c<?>) musNewNotificationFragment);
            musNewNotificationFragment.i().a(new com.ss.android.ugc.aweme.notification.followrequest.model.a());
            musNewNotificationFragment.i().a_(musNewNotificationFragment);
            musNewNotificationFragment.n().j().observe(musNewNotificationFragment, new ai(musNewNotificationFragment));
            musNewNotificationFragment.n().l().observe(musNewNotificationFragment, new aj(musNewNotificationFragment));
            musNewNotificationFragment.n().k().observe(musNewNotificationFragment, new ak(musNewNotificationFragment));
            musNewNotificationFragment.n().m().observe(musNewNotificationFragment, new al(musNewNotificationFragment));
            musNewNotificationFragment.n().n().observe(musNewNotificationFragment, new am(musNewNotificationFragment));
            androidx.fragment.app.e activity = musNewNotificationFragment.getActivity();
            if (activity == null) {
                h.f.b.l.b();
            }
            h.f.b.l.b(activity, "");
            Intent intent = activity.getIntent();
            if (intent != null) {
                if (intent.getBooleanExtra("is_from_push", false)) {
                    str = "push";
                } else {
                    str = "message";
                }
                musNewNotificationFragment.n().a(str);
                musNewNotificationFragment.f112926a = new com.ss.android.ugc.aweme.notification.adapter.d(musNewNotificationFragment, str, new l(musNewNotificationFragment));
                com.ss.android.ugc.aweme.notification.adapter.d dVar = musNewNotificationFragment.f112926a;
                if (dVar == null) {
                    h.f.b.l.a("mAdapter");
                }
                DmtStatusView dmtStatusView = (DmtStatusView) musNewNotificationFragment.a(R.id.eg_);
                h.f.b.l.b(dmtStatusView, "");
                h.f.b.l.d(dmtStatusView, "");
                dVar.f113160g = dmtStatusView;
                com.ss.android.ugc.aweme.notification.adapter.d dVar2 = musNewNotificationFragment.f112926a;
                if (dVar2 == null) {
                    h.f.b.l.a("mAdapter");
                }
                dVar2.a((h.a) musNewNotificationFragment);
                com.ss.android.ugc.aweme.notification.adapter.d dVar3 = musNewNotificationFragment.f112926a;
                if (dVar3 == null) {
                    h.f.b.l.a("mAdapter");
                }
                dVar3.d(false);
                com.ss.android.ugc.aweme.notification.adapter.d dVar4 = musNewNotificationFragment.f112926a;
                if (dVar4 == null) {
                    h.f.b.l.a("mAdapter");
                }
                dVar4.a((CharSequence) "");
                musNewNotificationFragment.t();
                RecyclerView recyclerView2 = (RecyclerView) musNewNotificationFragment.a(R.id.drj);
                h.f.b.l.b(recyclerView2, "");
                com.ss.android.ugc.aweme.notification.adapter.d dVar5 = musNewNotificationFragment.f112926a;
                if (dVar5 == null) {
                    h.f.b.l.a("mAdapter");
                }
                recyclerView2.setAdapter(dVar5);
                ((RecyclerView) musNewNotificationFragment.a(R.id.drj)).a(new m(musNewNotificationFragment));
                LogHelper a3 = LogHelperImpl.a();
                RecyclerView recyclerView3 = (RecyclerView) musNewNotificationFragment.a(R.id.drj);
                h.f.b.l.b(recyclerView3, "");
                a3.a("mus_new_notification", recyclerView3);
                musNewNotificationFragment.k().liveData.observe(musNewNotificationFragment, new n(musNewNotificationFragment));
                musNewNotificationFragment.k().updateLiveData.observe(musNewNotificationFragment, new o(musNewNotificationFragment));
                androidx.lifecycle.ac a4 = androidx.lifecycle.ae.a(musNewNotificationFragment, (ad.b) null).a(TutorialVideoViewModel.class);
                h.f.b.l.b(a4, "");
                musNewNotificationFragment.f112928c = (TutorialVideoViewModel) a4;
                TutorialVideoViewModel tutorialVideoViewModel = musNewNotificationFragment.f112928c;
                if (tutorialVideoViewModel == null) {
                    h.f.b.l.a("mTutorialVideoModel");
                }
                tutorialVideoViewModel.a(musNewNotificationFragment.getContext());
                TutorialVideoViewModel tutorialVideoViewModel2 = musNewNotificationFragment.f112928c;
                if (tutorialVideoViewModel2 == null) {
                    h.f.b.l.a("mTutorialVideoModel");
                }
                tutorialVideoViewModel2.f113832a.observe(musNewNotificationFragment, new p(musNewNotificationFragment));
                com.ss.android.ugc.aweme.notification.utils.p pVar = new com.ss.android.ugc.aweme.notification.utils.p();
                RecyclerView recyclerView4 = (RecyclerView) musNewNotificationFragment.a(R.id.drj);
                h.f.b.l.b(recyclerView4, "");
                LinearLayoutManager linearLayoutManager2 = musNewNotificationFragment.f112929d;
                if (linearLayoutManager2 == null) {
                    h.f.b.l.a("mLinearLayoutManager");
                }
                pVar.a(recyclerView4, linearLayoutManager2, new q(musNewNotificationFragment));
                ((NoticeView) musNewNotificationFragment.a(R.id.bcf)).setIconImage(2131231267);
                SpannableString spannableString = new SpannableString(com.ss.android.ugc.aweme.base.utils.h.b(R.string.cld));
                SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder(com.ss.android.ugc.aweme.base.utils.h.b(R.string.cle) + " ");
                if (musNewNotificationFragment.getContext() != null) {
                    Context context2 = musNewNotificationFragment.getContext();
                    if (context2 == null) {
                        h.f.b.l.b();
                    }
                    spannableString.setSpan(new ForegroundColorSpan(androidx.core.content.b.c(context2, R.color.bh)), 0, spannableString.length(), 34);
                    spannableString.setSpan(new StyleSpan(1), 0, spannableString.length(), 18);
                    spannableStringBuilder.append((CharSequence) spannableString);
                }
                ((NoticeView) musNewNotificationFragment.a(R.id.bcf)).setTitleText(spannableStringBuilder);
                NoticeView noticeView = (NoticeView) musNewNotificationFragment.a(R.id.bcf);
                h.f.b.l.b(noticeView, "");
                com.ss.android.ugc.aweme.notification.utils.n.a(noticeView);
                musNewNotificationFragment.o = new com.ss.android.ugc.aweme.newfollow.ui.e((NoticeView) musNewNotificationFragment.a(R.id.bcf), new g());
                com.ss.android.ugc.aweme.newfollow.ui.e eVar2 = musNewNotificationFragment.o;
                if (eVar2 != null) {
                    eVar2.f112625f = e.a.Message;
                }
                com.ss.android.ugc.aweme.notification.ab.b.f113114a.getEnablePushGuide();
                if (!(com.ss.android.ugc.aweme.notification.ab.b.f113114a.getEnablePushGuide() == 0 || (eVar = musNewNotificationFragment.o) == null)) {
                    eVar.a();
                }
                musNewNotificationFragment.p();
                com.ss.android.ugc.aweme.notification.adapter.d dVar6 = musNewNotificationFragment.f112926a;
                if (dVar6 == null) {
                    h.f.b.l.a("mAdapter");
                }
                h.f.b.l.d(musNewNotificationFragment, "");
                dVar6.f113155b = musNewNotificationFragment;
                com.ss.android.ugc.aweme.notification.adapter.d dVar7 = musNewNotificationFragment.f112926a;
                if (dVar7 == null) {
                    h.f.b.l.a("mAdapter");
                }
                h.f.b.l.d(musNewNotificationFragment, "");
                dVar7.f113154a = musNewNotificationFragment;
                com.ss.android.ugc.aweme.notification.adapter.d dVar8 = musNewNotificationFragment.f112926a;
                if (dVar8 == null) {
                    h.f.b.l.a("mAdapter");
                }
                h.f.b.l.d(musNewNotificationFragment, "");
                dVar8.f113158e = musNewNotificationFragment;
                if (com.ss.android.ugc.aweme.inbox.b.b.b()) {
                    TuxIconView tuxIconView2 = (TuxIconView) musNewNotificationFragment.a(R.id.qa);
                    h.f.b.l.b(tuxIconView2, "");
                    tuxIconView2.setVisibility(0);
                    Space space = (Space) musNewNotificationFragment.a(R.id.v2);
                    h.f.b.l.b(space, "");
                    space.setVisibility(8);
                    ((TuxIconView) musNewNotificationFragment.a(R.id.qa)).setOnClickListener(new h(musNewNotificationFragment));
                    a.C1099a.a(musNewNotificationFragment).c(R.attr.f159902m).f(R.attr.f159902m).a(true).f44923a.d();
                }
                com.ss.android.ugc.aweme.friends.service.a.f97047a.a(new i(musNewNotificationFragment));
                try {
                    com.ss.android.ugc.aweme.friends.widget.contact.c o = musNewNotificationFragment.o();
                    if (o != null) {
                        Fragment fragment = (Fragment) o;
                        if (fragment.isAdded() || musNewNotificationFragment.getChildFragmentManager().a("SearchFragment") != null) {
                            z = true;
                        }
                        if (!z) {
                            musNewNotificationFragment.getChildFragmentManager().a().a(R.id.dut, fragment, "SearchFragment").c(fragment).f().c();
                        }
                        obj = h.q.m223constructorimpl(h.z.f158842a);
                        Throwable r2 = h.q.m226exceptionOrNullimpl(obj);
                        if (r2 != null) {
                            com.ss.android.ugc.aweme.common.f.a("NotificationFragment", "add search fragment error!", r2);
                        }
                    } else {
                        NullPointerException nullPointerException = new NullPointerException("null cannot be cast to non-null type androidx.fragment.app.Fragment");
                        MethodCollector.o(2175);
                        throw nullPointerException;
                    }
                } catch (Throwable th) {
                    obj = h.q.m223constructorimpl(h.r.a(th));
                }
            }
            this.this$0.onRefresh();
            h.z zVar = h.z.f158842a;
            MethodCollector.o(2175);
            return zVar;
        }
    }

    public static final class ad extends h.f.b.m implements h.f.a.b<Object, Boolean> {
        public static final ad INSTANCE = new ad();

        static {
            Covode.recordClassIndex(72597);
        }

        public ad() {
            super(1);
        }

        /* Return type fixed from 'boolean' to match base method */
        @Override // h.f.a.b
        public final Boolean invoke(Object obj) {
            return obj instanceof com.ss.android.ugc.aweme.notification.h.af;
        }
    }

    static final class ak<T> implements androidx.lifecycle.u {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ MusNewNotificationFragment f112942a;

        static {
            Covode.recordClassIndex(72604);
        }

        ak(MusNewNotificationFragment musNewNotificationFragment) {
            this.f112942a = musNewNotificationFragment;
        }

        @Override // androidx.lifecycle.u
        public final /* synthetic */ void onChanged(Object obj) {
            this.f112942a.s();
        }
    }

    static final class al<T> implements androidx.lifecycle.u {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ MusNewNotificationFragment f112943a;

        static {
            Covode.recordClassIndex(72605);
        }

        al(MusNewNotificationFragment musNewNotificationFragment) {
            this.f112943a = musNewNotificationFragment;
        }

        @Override // androidx.lifecycle.u
        public final /* synthetic */ void onChanged(Object obj) {
            this.f112943a.s();
        }
    }

    public static final class f extends RecyclerView.n {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ MusNewNotificationFragment f112949a;

        static {
            Covode.recordClassIndex(72613);
        }

        /* JADX WARN: Incorrect args count in method signature: ()V */
        f(MusNewNotificationFragment musNewNotificationFragment) {
            this.f112949a = musNewNotificationFragment;
        }

        @Override // androidx.recyclerview.widget.RecyclerView.n
        public final void a(RecyclerView recyclerView, int i2) {
            h.f.b.l.d(recyclerView, "");
            c.HandlerC2905c b2 = com.ss.android.ugc.aweme.notification.e.c.b();
            if (b2 != null) {
                boolean z = true;
                if (!(i2 == 1 || i2 == 2)) {
                    z = false;
                }
                b2.a(z);
            }
        }

        @Override // androidx.recyclerview.widget.RecyclerView.n
        public final void a(RecyclerView recyclerView, int i2, int i3) {
            h.f.b.l.d(recyclerView, "");
            this.f112949a.u();
            MusNewNotificationFragment musNewNotificationFragment = this.f112949a;
            LinearLayoutManager linearLayoutManager = musNewNotificationFragment.f112929d;
            if (linearLayoutManager == null) {
                h.f.b.l.a("mLinearLayoutManager");
            }
            int k2 = linearLayoutManager.k();
            com.ss.android.ugc.aweme.notification.adapter.d dVar = musNewNotificationFragment.f112926a;
            if (dVar == null) {
                h.f.b.l.a("mAdapter");
            }
            int size = dVar.e().size();
            if (k2 >= 0 && size > k2) {
                com.ss.android.ugc.aweme.notification.adapter.d dVar2 = musNewNotificationFragment.f112926a;
                if (dVar2 == null) {
                    h.f.b.l.a("mAdapter");
                }
                if (dVar2.e().get(k2) instanceof com.ss.android.ugc.aweme.notification.bean.a) {
                    List<com.ss.android.ugc.aweme.friends.widget.contact.e> list = musNewNotificationFragment.y;
                    if (list == null || list.isEmpty()) {
                        com.ss.android.ugc.aweme.notification.adapter.d dVar3 = musNewNotificationFragment.f112926a;
                        if (dVar3 == null) {
                            h.f.b.l.a("mAdapter");
                        }
                        for (MusNotice musNotice : dVar3.e()) {
                            if (musNotice instanceof com.ss.android.ugc.aweme.notification.bean.a) {
                                com.ss.android.ugc.aweme.notification.bean.a aVar = (com.ss.android.ugc.aweme.notification.bean.a) musNotice;
                                if (aVar.f113233a == 2010 && aVar.f113234b != null) {
                                    musNewNotificationFragment.y.add(new com.ss.android.ugc.aweme.friends.widget.contact.e(aVar.f113234b));
                                }
                            }
                        }
                    }
                    musNewNotificationFragment.o().a(musNewNotificationFragment.y);
                    return;
                }
                musNewNotificationFragment.o().a();
            }
        }
    }

    public static final class i implements com.ss.android.ugc.aweme.friends.g {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ MusNewNotificationFragment f112951a;

        static {
            Covode.recordClassIndex(72616);
        }

        /* JADX WARN: Incorrect args count in method signature: ()V */
        i(MusNewNotificationFragment musNewNotificationFragment) {
            this.f112951a = musNewNotificationFragment;
        }

        @Override // com.ss.android.ugc.aweme.friends.g
        public final void a(com.ss.android.ugc.aweme.recommend.f fVar) {
            h.f.b.l.d(fVar, "");
            if (fVar == com.ss.android.ugc.aweme.recommend.f.CONTACT && !this.f112951a.n().f114064e) {
                this.f112951a.n().n().postValue(Boolean.valueOf(com.ss.android.ugc.aweme.friends.service.a.f97047a.d().c()));
            }
        }
    }

    public static final class m extends RecyclerView.h {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ MusNewNotificationFragment f112954a;

        static {
            Covode.recordClassIndex(72620);
        }

        /* JADX WARN: Incorrect args count in method signature: ()V */
        m(MusNewNotificationFragment musNewNotificationFragment) {
            this.f112954a = musNewNotificationFragment;
        }

        @Override // androidx.recyclerview.widget.RecyclerView.h
        public final void getItemOffsets(Rect rect, View view, RecyclerView recyclerView, RecyclerView.s sVar) {
            h.f.b.l.d(rect, "");
            h.f.b.l.d(view, "");
            h.f.b.l.d(recyclerView, "");
            h.f.b.l.d(sVar, "");
            if (RecyclerView.d(view) == MusNewNotificationFragment.c(this.f112954a).getItemCount() - 1) {
                rect.bottom = (int) com.bytedance.common.utility.n.b(this.f112954a.getContext(), 19.0f);
            }
        }
    }

    public static final class q implements p.a {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ MusNewNotificationFragment f112958a;

        static {
            Covode.recordClassIndex(72624);
        }

        /* JADX WARN: Incorrect args count in method signature: ()V */
        q(MusNewNotificationFragment musNewNotificationFragment) {
            this.f112958a = musNewNotificationFragment;
        }

        @Override // com.ss.android.ugc.aweme.notification.utils.p.a
        public final void a(int i2) {
            MusNewNotificationFragment.c(this.f112958a).d(i2);
        }
    }

    /* access modifiers changed from: package-private */
    public static final class af implements View.OnClickListener {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ MusNewNotificationFragment f112937a;

        static {
            Covode.recordClassIndex(72599);
        }

        af(MusNewNotificationFragment musNewNotificationFragment) {
            this.f112937a = musNewNotificationFragment;
        }

        public final void onClick(View view) {
            ClickAgent.onClick(view);
            this.f112937a.x();
        }
    }

    /* access modifiers changed from: package-private */
    public static final class ag implements View.OnClickListener {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ MusNewNotificationFragment f112938a;

        static {
            Covode.recordClassIndex(72600);
        }

        ag(MusNewNotificationFragment musNewNotificationFragment) {
            this.f112938a = musNewNotificationFragment;
        }

        public final void onClick(View view) {
            ClickAgent.onClick(view);
            this.f112938a.onRefresh();
        }
    }

    static final class c extends h.f.b.m implements h.f.a.b<e.a, h.z> {

        /* renamed from: a  reason: collision with root package name */
        public static final c f112947a = new c();

        static {
            Covode.recordClassIndex(72610);
        }

        c() {
            super(1);
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
        @Override // h.f.a.b
        public final /* synthetic */ h.z invoke(e.a aVar) {
            e.a aVar2 = aVar;
            h.f.b.l.d(aVar2, "");
            aVar2.c();
            return h.z.f158842a;
        }
    }

    static final class h implements View.OnClickListener {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ MusNewNotificationFragment f112950a;

        static {
            Covode.recordClassIndex(72615);
        }

        h(MusNewNotificationFragment musNewNotificationFragment) {
            this.f112950a = musNewNotificationFragment;
        }

        public final void onClick(View view) {
            ClickAgent.onClick(view);
            this.f112950a.requireActivity().finish();
        }
    }

    static final class p<T> implements androidx.lifecycle.u {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ MusNewNotificationFragment f112957a;

        static {
            Covode.recordClassIndex(72623);
        }

        p(MusNewNotificationFragment musNewNotificationFragment) {
            this.f112957a = musNewNotificationFragment;
        }

        @Override // androidx.lifecycle.u
        public final /* synthetic */ void onChanged(Object obj) {
            MusNewNotificationFragment.c(this.f112957a).a((TutorialVideoResp) obj);
        }
    }

    /* access modifiers changed from: package-private */
    public static final class y<TTaskResult, TContinuationResult> implements b.g {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ MusNewNotificationFragment f112963a;

        static {
            Covode.recordClassIndex(72632);
        }

        y(MusNewNotificationFragment musNewNotificationFragment) {
            this.f112963a = musNewNotificationFragment;
        }

        @Override // b.g
        public final /* synthetic */ Object then(b.i iVar) {
            if (this.f112963a.ab_()) {
                this.f112963a.v();
            }
            return h.z.f158842a;
        }
    }

    public static final /* synthetic */ com.ss.android.ugc.aweme.notification.adapter.d c(MusNewNotificationFragment musNewNotificationFragment) {
        com.ss.android.ugc.aweme.notification.adapter.d dVar = musNewNotificationFragment.f112926a;
        if (dVar == null) {
            h.f.b.l.a("mAdapter");
        }
        return dVar;
    }

    @Override // com.ss.android.ugc.aweme.base.f.a, androidx.fragment.app.Fragment
    public final void onActivityCreated(Bundle bundle) {
        com.ss.android.ugc.aweme.inbox.d.e.a(com.ss.android.ugc.aweme.inbox.d.a.ON_ACTIVITY_CREATED, new v(this, bundle));
    }

    @Override // com.ss.android.ugc.aweme.base.f.a, com.bytedance.ies.uikit.a.b, androidx.fragment.app.Fragment, com.ss.android.ugc.b.a.a.a
    public final void onCreate(Bundle bundle) {
        com.ss.android.ugc.aweme.inbox.d.e.a(com.ss.android.ugc.aweme.inbox.d.a.ON_CREATE, new w(this, bundle));
    }

    @org.greenrobot.eventbus.r
    public final void onResumeRefreshEvent(com.ss.android.ugc.aweme.notice.api.bean.n nVar) {
        h.f.b.l.d(nVar, "");
        if (ab_()) {
            this.s = true;
        }
    }

    @org.greenrobot.eventbus.r(a = ThreadMode.MAIN)
    public final void onUnder16RefreshEvent(com.ss.android.ugc.aweme.im.service.b.e eVar) {
        h.f.b.l.d(eVar, "");
        p();
    }

    /* access modifiers changed from: package-private */
    public static final class ae extends h.f.b.m implements h.f.a.b<Integer, RecyclerView.ViewHolder> {
        final /* synthetic */ MusNewNotificationFragment this$0;

        static {
            Covode.recordClassIndex(72598);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        ae(MusNewNotificationFragment musNewNotificationFragment) {
            super(1);
            this.this$0 = musNewNotificationFragment;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
        @Override // h.f.a.b
        public final /* synthetic */ RecyclerView.ViewHolder invoke(Integer num) {
            return ((RecyclerView) this.this$0.a(R.id.drj)).f(num.intValue());
        }
    }

    static final class am<T> implements androidx.lifecycle.u {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ MusNewNotificationFragment f112944a;

        static {
            Covode.recordClassIndex(72606);
        }

        am(MusNewNotificationFragment musNewNotificationFragment) {
            this.f112944a = musNewNotificationFragment;
        }

        @Override // androidx.lifecycle.u
        public final /* synthetic */ void onChanged(Object obj) {
            ((DmtStatusView) this.f112944a.a(R.id.eg_)).f();
            this.f112944a.a(a.ORIGIN_DATA);
        }
    }

    @Override // com.ss.android.ugc.aweme.common.e.c
    public final void c(Exception exc) {
        com.ss.android.ugc.aweme.notification.adapter.d dVar = this.f112926a;
        if (dVar == null) {
            h.f.b.l.a("mAdapter");
        }
        dVar.j();
    }

    @org.greenrobot.eventbus.r(a = ThreadMode.MAIN)
    public final void onNotificationIndicatorEvent(com.ss.android.ugc.aweme.notice.api.bean.m mVar) {
        com.ss.android.ugc.aweme.notification.view.c cVar;
        h.f.b.l.d(mVar, "");
        if (ab_() && (cVar = this.f112930e) != null) {
            cVar.b();
        }
    }

    @org.greenrobot.eventbus.r(a = ThreadMode.MAIN)
    public final void onRefreshMessageButton(com.ss.android.ugc.aweme.im.service.b.c cVar) {
        h.f.b.l.d(cVar, "");
        com.ss.android.ugc.aweme.notification.adapter.d dVar = this.f112926a;
        if (dVar == null) {
            h.f.b.l.a("mAdapter");
        }
        dVar.notifyDataSetChanged();
    }

    static final class ai<T> implements androidx.lifecycle.u {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ MusNewNotificationFragment f112940a;

        static {
            Covode.recordClassIndex(72602);
        }

        ai(MusNewNotificationFragment musNewNotificationFragment) {
            this.f112940a = musNewNotificationFragment;
        }

        /* JADX WARNING: Code restructure failed: missing block: B:15:0x003b, code lost:
            if (r4 != null) goto L_0x0015;
         */
        @Override // androidx.lifecycle.u
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public final /* synthetic */ void onChanged(java.lang.Object r6) {
            /*
                r5 = this;
                com.ss.android.ugc.aweme.notification.vm.a r6 = (com.ss.android.ugc.aweme.notification.vm.a) r6
                com.ss.android.ugc.aweme.friends.model.RecommendList r4 = r6.f114105a
                r3 = 0
                if (r4 == 0) goto L_0x003a
                java.util.List r0 = r4.getUserList()
                if (r0 == 0) goto L_0x003a
                int r0 = r0.size()
                java.lang.Integer r2 = java.lang.Integer.valueOf(r0)
            L_0x0015:
                com.ss.android.ugc.aweme.base.api.BaseResponse$ServerTimeExtra r0 = r4.extra
                if (r0 == 0) goto L_0x001d
                java.lang.String r1 = r0.logid
                if (r1 != 0) goto L_0x0027
            L_0x001d:
                com.ss.android.ugc.aweme.feed.model.LogPbBean r0 = r4.getLogPb()
                if (r0 == 0) goto L_0x003e
                java.lang.String r1 = r0.getImprId()
            L_0x0027:
                com.ss.android.ugc.aweme.inbox.d.l r0 = new com.ss.android.ugc.aweme.inbox.d.l
                r0.<init>(r2, r3, r1)
                com.ss.android.ugc.aweme.inbox.d.e.b(r0)
                com.ss.android.ugc.aweme.notification.MusNewNotificationFragment r1 = r5.f112940a
                java.lang.String r0 = ""
                h.f.b.l.b(r6, r0)
                r1.a(r6)
                return
            L_0x003a:
                r2 = r3
                if (r4 == 0) goto L_0x003e
                goto L_0x0015
            L_0x003e:
                r1 = r3
                goto L_0x0027
            */
            throw new UnsupportedOperationException("Method not decompiled: com.ss.android.ugc.aweme.notification.MusNewNotificationFragment.ai.onChanged(java.lang.Object):void");
        }
    }

    static final class n<T> implements androidx.lifecycle.u {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ MusNewNotificationFragment f112955a;

        static {
            Covode.recordClassIndex(72621);
        }

        n(MusNewNotificationFragment musNewNotificationFragment) {
            this.f112955a = musNewNotificationFragment;
        }

        @Override // androidx.lifecycle.u
        public final /* synthetic */ void onChanged(Object obj) {
            NoticeCombineDatas noticeCombineDatas = (NoticeCombineDatas) obj;
            if (noticeCombineDatas != null) {
                MusNewNotificationFragment.c(this.f112955a).a(noticeCombineDatas, this.f112955a.f112932k);
            }
            if (this.f112955a.n) {
                this.f112955a.v();
                return;
            }
            this.f112955a.w();
            if (!this.f112955a.u) {
                this.f112955a.u = true;
                com.ss.android.ugc.aweme.cc.c.a("mus_new_notification", (com.ss.android.ugc.aweme.cc.b) null, 6);
            }
        }
    }

    static final class o<T> implements androidx.lifecycle.u {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ MusNewNotificationFragment f112956a;

        static {
            Covode.recordClassIndex(72622);
        }

        o(MusNewNotificationFragment musNewNotificationFragment) {
            this.f112956a = musNewNotificationFragment;
        }

        @Override // androidx.lifecycle.u
        public final /* synthetic */ void onChanged(Object obj) {
            List<CombineLiveNotice> list;
            LiveNoticeMessageResponse liveNoticeMessageResponse = (LiveNoticeMessageResponse) obj;
            this.f112956a.f112934m.decrementAndGet();
            if (liveNoticeMessageResponse != null) {
                com.ss.android.ugc.aweme.notification.adapter.d c2 = MusNewNotificationFragment.c(this.f112956a);
                LiveMessage liveMessage = liveNoticeMessageResponse.liveMessage;
                if (liveMessage != null) {
                    list = liveMessage.liveNotice;
                } else {
                    list = null;
                }
                c2.e(list);
            }
            if (this.f112956a.n) {
                this.f112956a.v();
            } else {
                this.f112956a.w();
            }
        }
    }

    private final void a(com.ss.android.ugc.aweme.notification.vm.b bVar) {
        if (this.I) {
            new Handler().post(new an(this, bVar));
            this.I = false;
        }
    }

    @org.greenrobot.eventbus.r(a = ThreadMode.MAIN, b = true)
    public final void onSwitchInbox(com.ss.android.ugc.aweme.notice.api.b.d dVar) {
        h.f.b.l.d(dVar, "");
        c.HandlerC2905c b2 = com.ss.android.ugc.aweme.notification.e.c.b();
        if (b2 != null) {
            b2.j();
        }
        if (com.ss.android.ugc.aweme.inbox.b.b.c()) {
            NotificationCombineVM n2 = n();
            com.ss.android.ugc.aweme.inbox.q.CONTACTS.markEnterInbox();
            com.ss.android.ugc.aweme.inbox.q.THIRD_PLATFORM.markEnterInbox();
            n2.f114046b = false;
            n2.f114065f = false;
            n2.g().clear();
            this.I = true;
        }
    }

    static final class aj<T> implements androidx.lifecycle.u {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ MusNewNotificationFragment f112941a;

        static {
            Covode.recordClassIndex(72603);
        }

        aj(MusNewNotificationFragment musNewNotificationFragment) {
            this.f112941a = musNewNotificationFragment;
        }

        @Override // androidx.lifecycle.u
        public final /* synthetic */ void onChanged(Object obj) {
            com.ss.android.ugc.aweme.notification.vm.a aVar = (com.ss.android.ugc.aweme.notification.vm.a) obj;
            MusNewNotificationFragment musNewNotificationFragment = this.f112941a;
            h.f.b.l.b(aVar, "");
            if (musNewNotificationFragment.ab_()) {
                NotificationCombineVM n = musNewNotificationFragment.n();
                com.ss.android.ugc.aweme.notification.adapter.d dVar = musNewNotificationFragment.f112926a;
                if (dVar == null) {
                    h.f.b.l.a("mAdapter");
                }
                com.ss.android.ugc.aweme.notification.vm.b a2 = n.a(dVar.l(), aVar);
                if (!a2.f114225c) {
                    musNewNotificationFragment.t();
                } else {
                    com.ss.android.ugc.aweme.notification.adapter.d dVar2 = musNewNotificationFragment.f112926a;
                    if (dVar2 == null) {
                        h.f.b.l.a("mAdapter");
                    }
                    dVar2.d(true);
                    com.ss.android.ugc.aweme.notification.adapter.d dVar3 = musNewNotificationFragment.f112926a;
                    if (dVar3 == null) {
                        h.f.b.l.a("mAdapter");
                    }
                    dVar3.ai_();
                }
                com.ss.android.ugc.aweme.notification.adapter.d dVar4 = musNewNotificationFragment.f112926a;
                if (dVar4 == null) {
                    h.f.b.l.a("mAdapter");
                }
                dVar4.f(a2.f114223a);
            }
        }
    }

    static final class r implements View.OnClickListener {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ MusNewNotificationFragment f112959a;

        static {
            Covode.recordClassIndex(72625);
        }

        r(MusNewNotificationFragment musNewNotificationFragment) {
            this.f112959a = musNewNotificationFragment;
        }

        public final void onClick(View view) {
            ClickAgent.onClick(view);
            if (com.ss.android.ugc.aweme.notice.api.b.b().shouldRedictToTipsPage()) {
                com.ss.android.ugc.aweme.notice.api.b.b().goToTipsPage();
                return;
            }
            IIMService a2 = a.C2916a.a();
            Context requireContext = this.f112959a.requireContext();
            h.f.b.l.b(requireContext, "");
            Bundle bundle = new Bundle();
            bundle.putString("enter_from", "notification_page");
            bundle.putString("enter_method", "button");
            bundle.putString("notice_type", this.f112959a.m().c());
            bundle.putInt("message_cnt", this.f112959a.m().d());
            a2.openSessionListActivity(requireContext, bundle);
        }
    }

    @Override // com.bytedance.hox.a.d
    public final void b(Bundle bundle) {
        h.f.b.l.d(bundle, "");
        String string = bundle.getString(be.f68530b, "");
        androidx.fragment.app.e activity = getActivity();
        if (activity == null) {
            h.f.b.l.b();
        }
        h.f.b.l.b(activity, "");
        String d2 = Hox.a.a(activity).d("HOME");
        if (h.f.b.l.a((Object) string, (Object) be.f68532d) || bundle.getBoolean(d2)) {
            if (ab_()) {
                r();
                c(false);
                AnalysisStayTimeFragmentComponent analysisStayTimeFragmentComponent = this.f112927b;
                if (analysisStayTimeFragmentComponent == null) {
                    h.f.b.l.a("mStayTimeFragmentComponent");
                }
                analysisStayTimeFragmentComponent.a(true);
            } else {
                return;
            }
        }
        I();
        this.J = false;
    }

    public final void c(boolean z2) {
        com.ss.android.ugc.aweme.notification.adapter.d dVar = this.f112926a;
        if (dVar == null) {
            h.f.b.l.a("mAdapter");
        }
        com.ss.android.ugc.aweme.notification.h.af afVar = (com.ss.android.ugc.aweme.notification.h.af) h.l.k.d(h.l.k.a(h.l.k.f(h.a.n.t(h.j.h.a(0, dVar.getItemCount())), new ae(this)), (h.f.a.b) ad.INSTANCE));
        if (afVar != null) {
            if (z2) {
                if (afVar.f113507a != null) {
                    afVar.f113507a.a();
                }
            } else if (afVar.f113507a != null) {
                com.ss.android.ugc.aweme.notification.view.e eVar = afVar.f113507a;
                if (eVar.f113953f != null) {
                    eVar.f113953f.cancel();
                }
            }
        }
    }

    static final class j implements View.OnClickListener {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ MusNewNotificationFragment f112952a;

        static {
            Covode.recordClassIndex(72617);
        }

        j(MusNewNotificationFragment musNewNotificationFragment) {
            this.f112952a = musNewNotificationFragment;
        }

        public final void onClick(View view) {
            com.ss.android.ugc.aweme.notification.view.c cVar;
            ClickAgent.onClick(view);
            MusNewNotificationFragment musNewNotificationFragment = this.f112952a;
            RelativeLayout relativeLayout = (RelativeLayout) musNewNotificationFragment.a(R.id.dp_);
            h.f.b.l.b(relativeLayout, "");
            if (musNewNotificationFragment.ab_()) {
                if (musNewNotificationFragment.f112930e == null) {
                    Context context = musNewNotificationFragment.getContext();
                    if (context == null) {
                        h.f.b.l.b();
                    }
                    h.f.b.l.b(context, "");
                    musNewNotificationFragment.f112930e = new com.ss.android.ugc.aweme.notification.view.c(context, musNewNotificationFragment);
                    if (MSAdaptionService.c().c((Context) musNewNotificationFragment.getActivity()) && (cVar = musNewNotificationFragment.f112930e) != null) {
                        cVar.setWidth(com.ss.android.ugc.aweme.base.utils.i.c(musNewNotificationFragment.getActivity()));
                    }
                    com.ss.android.ugc.aweme.notification.view.c cVar2 = musNewNotificationFragment.f112930e;
                    if (cVar2 != null) {
                        cVar2.a(musNewNotificationFragment.f112931j);
                    }
                    com.ss.android.ugc.aweme.notification.view.c cVar3 = musNewNotificationFragment.f112930e;
                    if (cVar3 != null) {
                        cVar3.setOnDismissListener(new ah(musNewNotificationFragment));
                    }
                }
                com.ss.android.ugc.aweme.notification.view.c cVar4 = musNewNotificationFragment.f112930e;
                if (cVar4 != null) {
                    cVar4.showAsDropDown(relativeLayout);
                }
                View a2 = musNewNotificationFragment.a(R.id.fem);
                h.f.b.l.b(a2, "");
                a2.setVisibility(0);
                ImageView imageView = (ImageView) musNewNotificationFragment.a(R.id.c25);
                h.f.b.l.b(imageView, "");
                imageView.setVisibility(8);
                ObjectAnimator ofFloat = ObjectAnimator.ofFloat(musNewNotificationFragment.a(R.id.bx0), "rotation", 0.0f, 180.0f);
                h.f.b.l.b(ofFloat, "");
                ofFloat.setDuration(200L);
                ofFloat.start();
            }
            com.ss.android.ugc.aweme.notification.utils.e.b(this.f112952a.n().b());
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:34:0x00a2, code lost:
        if (r6 == null) goto L_0x00a4;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:43:0x00ca, code lost:
        if (r1 != 2004) goto L_0x00a4;
     */
    @Override // com.ss.android.ugc.aweme.common.e.c
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void b(java.lang.Exception r8) {
        /*
        // Method dump skipped, instructions count: 319
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ss.android.ugc.aweme.notification.MusNewNotificationFragment.b(java.lang.Exception):void");
    }

    @Override // com.bytedance.hox.a.d
    public final void a(Bundle bundle) {
        com.ss.android.ugc.aweme.newfollow.ui.e eVar;
        h.f.b.l.d(bundle, "");
        com.bytedance.analytics.b.a(this);
        String string = bundle.getString(be.f68530b, "");
        androidx.fragment.app.e activity = getActivity();
        if (activity == null) {
            h.f.b.l.b();
        }
        h.f.b.l.b(activity, "");
        String d2 = Hox.a.a(activity).d("HOME");
        androidx.fragment.app.e activity2 = getActivity();
        if (activity2 == null) {
            h.f.b.l.b();
        }
        h.f.b.l.b(activity2, "");
        Hox.a.a(activity2).d(d2);
        if (h.f.b.l.a((Object) string, (Object) be.f68532d) || bundle.getBoolean(d2)) {
            if (ab_()) {
                com.ss.android.ugc.aweme.notification.adapter.d dVar = this.f112926a;
                if (dVar == null) {
                    h.f.b.l.a("mAdapter");
                }
                if (!com.bytedance.common.utility.collection.b.a((Collection) dVar.e())) {
                    SwipeRefreshLayout swipeRefreshLayout = (SwipeRefreshLayout) a(R.id.e92);
                    h.f.b.l.b(swipeRefreshLayout, "");
                    if (!swipeRefreshLayout.mRefreshing) {
                        onRefresh();
                    }
                }
                r();
                c(true);
                AnalysisStayTimeFragmentComponent analysisStayTimeFragmentComponent = this.f112927b;
                if (analysisStayTimeFragmentComponent == null) {
                    h.f.b.l.a("mStayTimeFragmentComponent");
                }
                analysisStayTimeFragmentComponent.a(false);
                com.ss.android.ugc.aweme.notification.ab.b.f113114a.getEnablePushGuide();
                if (!(com.ss.android.ugc.aweme.notification.ab.b.f113114a.getEnablePushGuide() == 0 || (eVar = this.o) == null)) {
                    eVar.a();
                }
            } else {
                return;
            }
        }
        this.J = true;
        z();
    }

    private static String a(Intent intent, String str) {
        try {
            return intent.getStringExtra(str);
        } catch (Exception unused) {
            return null;
        }
    }

    @Override // com.ss.android.ugc.aweme.base.f.a, com.bytedance.ies.uikit.a.b, androidx.fragment.app.Fragment
    public final void onViewCreated(View view, Bundle bundle) {
        h.f.b.l.d(view, "");
        com.ss.android.ugc.aweme.inbox.d.e.a(com.ss.android.ugc.aweme.inbox.d.a.ON_VIEW_CREATED, new ab(this, view, bundle));
    }

    @Override // com.ss.android.ugc.aweme.common.e.c
    public final void b(List<MusNotice> list, boolean z2) {
        if (ab_()) {
            n().q().size();
            if (list != null) {
                Integer.valueOf(list.size());
            }
            if (!com.bytedance.common.utility.collection.b.a((Collection) list)) {
                int size = n().q().size();
                if (list == null) {
                    h.f.b.l.b();
                }
                if (size < list.size() && (!((Boolean) com.ss.android.ugc.aweme.notification.ab.a.f113111b.getValue()).booleanValue() || z2)) {
                    List g2 = h.a.n.g((Collection) list);
                    g2.removeAll(n().q());
                    n().q().addAll(g2);
                    com.ss.android.ugc.aweme.notification.adapter.d dVar = this.f112926a;
                    if (dVar == null) {
                        h.f.b.l.a("mAdapter");
                    }
                    List e2 = dVar.e();
                    e2.addAll(g2);
                    com.ss.android.ugc.aweme.notification.adapter.d dVar2 = this.f112926a;
                    if (dVar2 == null) {
                        h.f.b.l.a("mAdapter");
                    }
                    dVar2.b(e2);
                    if (this.f112933l != a.b.a()) {
                        com.ss.android.ugc.aweme.notification.adapter.d dVar3 = this.f112926a;
                        if (dVar3 == null) {
                            h.f.b.l.a("mAdapter");
                        }
                        if (dVar3.f113156c) {
                            t();
                            return;
                        }
                    }
                    com.ss.android.ugc.aweme.notification.adapter.d dVar4 = this.f112926a;
                    if (dVar4 == null) {
                        h.f.b.l.a("mAdapter");
                    }
                    dVar4.d(true);
                    com.ss.android.ugc.aweme.notification.adapter.d dVar5 = this.f112926a;
                    if (dVar5 == null) {
                        h.f.b.l.a("mAdapter");
                    }
                    dVar5.ai_();
                    return;
                }
            }
            this.w = true;
            a(a.ADAPTER_DATA);
        }
    }

    @Override // androidx.fragment.app.Fragment, com.ss.android.ugc.b.a.a.a
    public final View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        h.f.b.l.d(layoutInflater, "");
        return (View) com.ss.android.ugc.aweme.inbox.d.e.a(com.ss.android.ugc.aweme.inbox.d.a.ON_CREATE_VIEW, new x(layoutInflater, viewGroup));
    }

    @Override // androidx.fragment.app.Fragment
    public final void onActivityResult(int i2, int i3, Intent intent) {
        super.onActivityResult(i2, i3, intent);
        if (i2 == 1024) {
            this.f112934m.incrementAndGet();
            com.ss.android.ugc.aweme.notification.followrequest.model.a aVar = (com.ss.android.ugc.aweme.notification.followrequest.model.a) i().f76396h;
            if (aVar != null) {
                aVar.f113476d = true;
                aVar.f113475c = false;
                aVar.a(System.currentTimeMillis() / 1000, 1, 0);
            }
        } else if (i2 == 996) {
            com.ss.android.ugc.d.a.c.a(new com.ss.android.ugc.aweme.profile.b.e());
        }
    }

    /* access modifiers changed from: package-private */
    public final void a(int i2, int i3, int i4) {
        androidx.fragment.app.e activity = getActivity();
        if (activity == null) {
            h.f.b.l.b();
        }
        MtEmptyView a2 = MtEmptyView.a(activity);
        androidx.fragment.app.e activity2 = getActivity();
        if (activity2 == null) {
            h.f.b.l.b();
        }
        d.a c2 = new d.a(activity2).a(i4).b(i2).c(i3);
        h.f.b.l.b(c2, "");
        if (i2 == R.string.ct && QnaService.a().enablePublicQna()) {
            c2.a(com.bytedance.ies.dmt.ui.widget.a.SOLID, R.string.cr, new af(this));
        }
        a2.setStatus(c2.f33648a);
        h.f.b.l.b(a2, "");
        a2.a(androidx.core.content.b.c(a2.getContext(), R.color.bx), getResources().getDrawable(R.drawable.nb), (int) com.bytedance.common.utility.n.b(getContext(), 30.0f), (int) com.bytedance.common.utility.n.b(getContext(), 84.0f));
        androidx.fragment.app.e activity3 = getActivity();
        if (activity3 == null) {
            h.f.b.l.b();
        }
        com.bytedance.ies.dmt.ui.widget.d dVar = new d.a(activity3).b(R.string.cso).b("").f33648a;
        DmtStatusView.a a3 = DmtStatusView.a.a(getActivity()).a().a(R.string.h2z, R.string.h2y, R.string.h35, new ag(this));
        if (!com.ss.android.ugc.aweme.notification.utils.l.a()) {
            a3.b(a2);
        } else {
            a3.a(dVar);
        }
        ((DmtStatusView) a(R.id.eg_)).setBuilder(a3);
    }

    /* JADX DEBUG: Method arguments types fixed to match base method, original types: [int, java.lang.Object, int] */
    @Override // com.ss.android.ugc.aweme.base.a.k
    public final /* synthetic */ void a(int i2, User user, int i3) {
        User user2 = user;
        if (ab_()) {
            String str = "";
            if (i2 == au.f97190c) {
                if (user2 != null) {
                    SmartRoute withParam = SmartRouter.buildRoute(getActivity(), "aweme://user/profile/" + user2.getUid()).withParam("sec_user_id", user2.getSecUid()).withParam("from_recommend_card", 1).withParam("need_track_compare_recommend_reason", 1).withParam("previous_recommend_reason", user2.getRecommendReason()).withParam("extra_mutual_relation", user2.getMutualStruct()).withParam("extra_from_mutual", true).withParam("recommend_from_type", "list");
                    String h2 = n().r().h();
                    if (h2 != null) {
                        str = h2;
                    }
                    withParam.withParam("enter_from_request_id", str).withParam("recommend_enter_profile_params", new com.ss.android.ugc.aweme.recommend.g("notification_page", null, u.c.CARD, user2.getRecType(), g.a.a(user2), user2.getUid(), null, null, user2.getRequestId(), null, user2.getFriendTypeStr(), user2.getSocialInfo())).open();
                    com.ss.android.ugc.aweme.notification.utils.e.d(user2, Integer.valueOf(n().b(user2.getUid())), n().b());
                }
            } else if (i2 == au.f97195h) {
                if (ab_()) {
                    getContext();
                    if (!B()) {
                        new com.bytedance.tux.g.b(this).e(R.string.de8).b();
                    } else if (user2 != null) {
                        com.ss.android.ugc.aweme.notification.utils.e.c(user2, Integer.valueOf(n().b(user2.getUid())), n().b());
                    }
                }
            } else if (i2 == au.f97192e) {
                if (ab_()) {
                    getContext();
                    if (!B()) {
                        new com.bytedance.tux.g.b(this).e(R.string.de8).b();
                    } else if (user2 != null) {
                        com.ss.android.ugc.aweme.notification.adapter.d dVar = this.f112926a;
                        if (dVar == null) {
                            h.f.b.l.a("mAdapter");
                        }
                        dVar.a(user2);
                        com.ss.android.ugc.aweme.recommend.users.b bVar = com.ss.android.ugc.aweme.recommend.users.b.f120122a;
                        String uid = user2.getUid();
                        h.f.b.l.b(uid, str);
                        bVar.a(uid, user2.getSecUid());
                        com.ss.android.ugc.aweme.notification.utils.e.b(user2, Integer.valueOf(n().b(user2.getUid())), n().b());
                    }
                }
            } else if (i2 == au.f97194g && user2 != null && !this.K.contains(user2.getUid())) {
                if (user2.isShould_write_impr()) {
                    e.a.f112592a.a(1, user2.getUid());
                }
                com.ss.android.ugc.aweme.notification.utils.e.a(user2, Integer.valueOf(n().b(user2.getUid())), n().b());
                Set<String> set = this.K;
                String uid2 = user2.getUid();
                h.f.b.l.b(uid2, str);
                set.add(uid2);
            }
        }
    }
}
