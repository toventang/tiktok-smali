package com.ss.android.ugc.aweme.notification.adapter;

import android.content.Context;
import android.util.Log;
import android.view.View;
import android.view.ViewGroup;
import androidx.fragment.app.Fragment;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import com.bytedance.android.livesdk.livesetting.pullstream.LiveNetAdaptiveHurryTimeSetting;
import com.bytedance.apm.agent.v2.instrumentation.ClickAgent;
import com.bytedance.covode.number.Covode;
import com.bytedance.ies.dmt.ui.widget.DmtStatusView;
import com.bytedance.tux.input.TuxTextView;
import com.bytedance.tux.sheet.a.a;
import com.bytedance.vcloud.abrmodule.ABRConfig;
import com.ss.android.ugc.aweme.base.api.BaseResponse;
import com.ss.android.ugc.aweme.base.model.UrlModel;
import com.ss.android.ugc.aweme.comment.model.Comment;
import com.ss.android.ugc.aweme.commercialize.log.LogHelperImpl;
import com.ss.android.ugc.aweme.common.r;
import com.ss.android.ugc.aweme.live.ILiveOuterService;
import com.ss.android.ugc.aweme.live.LiveOuterService;
import com.ss.android.ugc.aweme.metrics.u;
import com.ss.android.ugc.aweme.notice.api.a;
import com.ss.android.ugc.aweme.notice.repo.TutorialVideoInfo;
import com.ss.android.ugc.aweme.notice.repo.TutorialVideoResp;
import com.ss.android.ugc.aweme.notice.repo.list.bean.AtMe;
import com.ss.android.ugc.aweme.notice.repo.list.bean.CheckProfileNotice;
import com.ss.android.ugc.aweme.notice.repo.list.bean.CombineLiveNotice;
import com.ss.android.ugc.aweme.notice.repo.list.bean.CommentNotice;
import com.ss.android.ugc.aweme.notice.repo.list.bean.DiggNotice;
import com.ss.android.ugc.aweme.notice.repo.list.bean.DuetNotice;
import com.ss.android.ugc.aweme.notice.repo.list.bean.FollowApproveNotice;
import com.ss.android.ugc.aweme.notice.repo.list.bean.FollowRequest;
import com.ss.android.ugc.aweme.notice.repo.list.bean.FriendNotice;
import com.ss.android.ugc.aweme.notice.repo.list.bean.MusNotice;
import com.ss.android.ugc.aweme.notice.repo.list.bean.NoticeCombineDatas;
import com.ss.android.ugc.aweme.notice.repo.list.bean.PostNotice;
import com.ss.android.ugc.aweme.notification.MusNewNotificationFragment;
import com.ss.android.ugc.aweme.notification.adapter.f;
import com.ss.android.ugc.aweme.notification.api.MusNotificationApiManager;
import com.ss.android.ugc.aweme.notification.bean.a;
import com.ss.android.ugc.aweme.notification.bean.p;
import com.ss.android.ugc.aweme.notification.bean.q;
import com.ss.android.ugc.aweme.notification.bean.t;
import com.ss.android.ugc.aweme.notification.h.as;
import com.ss.android.ugc.aweme.notification.h.w;
import com.ss.android.ugc.aweme.notification.vm.BaseNotificationVM;
import com.ss.android.ugc.aweme.notification.vm.NotificationCombineVM;
import com.ss.android.ugc.aweme.profile.model.User;
import com.ss.android.ugc.aweme.services.function.FunctionSupportService;
import com.ss.android.ugc.aweme.services.function.IFunctionKey;
import com.zhiliaoapp.musically.R;
import h.a.n;
import h.f.b.ad;
import h.f.b.l;
import h.f.b.m;
import h.v;
import h.z;
import java.util.ArrayList;
import java.util.Collection;
import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Objects;
import org.json.JSONObject;

public final class d extends com.ss.android.ugc.aweme.common.a.f<MusNotice> implements com.ss.android.ugc.aweme.notification.h.e {

    /* renamed from: i */
    public static final b f113153i = new b((byte) 0);
    private boolean A = true;
    private List<MusNotice> B;
    private int C;
    private final HashMap<String, Boolean> D = new HashMap<>();
    private int E;
    private List<MusNotice> F;
    private boolean G;
    private boolean H;
    private boolean I = true;
    private q J = new q(2002, null, null, 0, 12);
    private final h.h K = h.i.a((h.f.a.a) f.f113165a);
    private final h.h L = h.i.a((h.f.a.a) new e(this));
    private RecyclerView M;
    private final f N = new f(new C2890d(this));
    private LinearLayoutManager O;
    private final String P;
    private final h.f.a.a<z> Q;

    /* renamed from: a */
    public com.ss.android.ugc.aweme.base.a.k<User> f113154a;

    /* renamed from: b */
    public as.b f113155b;

    /* renamed from: c */
    public boolean f113156c;

    /* renamed from: d */
    public boolean f113157d;

    /* renamed from: e */
    public a f113158e;

    /* renamed from: f */
    public int f113159f;

    /* renamed from: g */
    public DmtStatusView f113160g;

    /* renamed from: h */
    public final Fragment f113161h;

    /* renamed from: j */
    private MusNotice f113162j;

    /* renamed from: k */
    private MusNotice f113163k;
    private List<MusNotice> w;
    private com.ss.android.ugc.aweme.notification.bean.d x;
    private int y = a.b.a();
    private com.ss.android.ugc.aweme.notice.repo.list.bean.f z;

    public interface a {
        static {
            Covode.recordClassIndex(72749);
        }

        void y();
    }

    static {
        Covode.recordClassIndex(72748);
    }

    public final List<MusNotice> l() {
        return (List) this.K.getValue();
    }

    public final NotificationCombineVM m() {
        return (NotificationCombineVM) this.L.getValue();
    }

    public static final class b {
        static {
            Covode.recordClassIndex(72750);
        }

        private b() {
        }

        public /* synthetic */ b(byte b2) {
            this();
        }
    }

    @Override // com.ss.android.ugc.aweme.common.a.h
    public final void a(Exception exc) {
        l.d(exc, "");
        RecyclerView recyclerView = this.M;
        if (recyclerView != null) {
            Boolean.valueOf(recyclerView.l());
            if (recyclerView.l() && com.ss.android.ugc.aweme.notification.e.a.a.a().f113344a) {
                l.d(exc, "");
                com.ss.android.ugc.aweme.common.f.c("AdapterNotifyCrashFixer", "catch notify when recyclerview scroll or layout, stack:" + Log.getStackTraceString(exc));
                if (com.ss.android.ugc.aweme.notification.e.a.a.a().f113345b) {
                    com.ss.android.ugc.aweme.framework.a.a.a(exc);
                }
                try {
                    if (com.ss.android.ugc.aweme.inbox.d.f.a("inbox_adapter_notify_error", 1.0f)) {
                        String stackTraceString = Log.getStackTraceString(exc);
                        l.b(stackTraceString, "");
                        if (stackTraceString.length() > 2000) {
                            stackTraceString = stackTraceString.substring(0, LiveNetAdaptiveHurryTimeSetting.DEFAULT);
                            l.b(stackTraceString, "");
                        }
                        LinkedHashMap linkedHashMap = new LinkedHashMap();
                        linkedHashMap.put("stack", stackTraceString);
                        r.a("inbox_adapter_notify_error", linkedHashMap);
                    }
                    h.q.m223constructorimpl(z.f158842a);
                } catch (Throwable th) {
                    h.q.m223constructorimpl(h.r.a(th));
                }
                recyclerView.post(new g(this, exc));
                return;
            }
        }
        super.a(exc);
    }

    public final void a(TutorialVideoResp tutorialVideoResp) {
        if (tutorialVideoResp == null || tutorialVideoResp.getInfo() == null) {
            this.f113163k = null;
        } else {
            TutorialVideoInfo info = tutorialVideoResp.getInfo();
            if (info == null) {
                l.b();
            }
            this.f113163k = t.a.a(info);
        }
        super.b_(h(j(e())));
    }

    public final void a(NoticeCombineDatas noticeCombineDatas, int i2) {
        List<UrlModel> list;
        l.d(noticeCombineDatas, "");
        com.ss.android.ugc.aweme.notice.repo.list.bean.k recommendAvatars = noticeCombineDatas.getRecommendAvatars();
        LiveOuterService.s();
        if (recommendAvatars == null || (list = recommendAvatars.f112868a) == null || list.isEmpty()) {
            this.f113162j = null;
        } else {
            this.f113162j = p.a.a(recommendAvatars);
            ILiveOuterService s = LiveOuterService.s();
            l.b(s, "");
            com.ss.android.ugc.aweme.live.c d2 = s.d();
            if (d2 != null) {
                d2.a(1);
            }
            com.ss.android.ugc.aweme.story.live.d.a("message");
            LogHelperImpl.a().a("message");
            ILiveOuterService s2 = LiveOuterService.s();
            l.b(s2, "");
            s2.m().a("ttlive_inbox_topLives_entrance", 0, new HashMap());
        }
        ArrayList arrayList = new ArrayList();
        FollowRequest followRequest = noticeCombineDatas.getFollowRequest();
        a((List<User>) arrayList, followRequest != null ? followRequest.getFollowRequestCount() : 0, i2, false);
        g(noticeCombineDatas.getLiveNotices());
        List<MusNotice> h2 = h(j(e()));
        RecyclerView recyclerView = this.M;
        if (recyclerView == null || !recyclerView.l() || !com.ss.android.ugc.aweme.notification.e.a.a.a().f113344a) {
            super.b_(h2);
        } else {
            recyclerView.post(new j(this, h2));
        }
    }

    public final void a(User user) {
        String str;
        l.d(user, "");
        List<MusNotice> list = this.f76354l;
        l.b(list, "");
        boolean z2 = false;
        int i2 = 0;
        for (MusNotice musNotice : list) {
            if (musNotice instanceof q) {
                User user2 = ((q) musNotice).f113282b;
                if (user2 != null) {
                    str = user2.getUid();
                } else {
                    str = null;
                }
                if (l.a((Object) str, (Object) user.getUid())) {
                    if (i2 >= 0 && i2 < this.f76354l.size()) {
                        if (i2 == this.f76354l.size() - 1) {
                            MusNotice musNotice2 = (MusNotice) this.f76354l.get(i2 - 1);
                            if ((musNotice2 instanceof q) && ((q) musNotice2).f113281a == 2000) {
                                z2 = true;
                            }
                        }
                        this.f76354l.remove(i2);
                        notifyItemRemoved(i2);
                        if (z2) {
                            int i3 = i2 - 1;
                            this.f76354l.remove(i3);
                            notifyItemRemoved(i3);
                            super.b_(h(j(e())));
                            return;
                        }
                        return;
                    }
                    return;
                }
            }
            i2++;
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.notification.adapter.d$d */
    public static final class C2890d implements f.a {

        /* renamed from: a */
        final /* synthetic */ d f113164a;

        static {
            Covode.recordClassIndex(72752);
        }

        @Override // com.ss.android.ugc.aweme.notification.adapter.f.a
        public final BaseNotificationVM b() {
            return this.f113164a.m();
        }

        @Override // com.ss.android.ugc.aweme.notification.adapter.f.a
        public final Fragment c() {
            return this.f113164a.f113161h;
        }

        @Override // com.ss.android.ugc.aweme.notification.adapter.f.a
        public final com.ss.android.ugc.aweme.base.a.k<User> e() {
            return this.f113164a.f113154a;
        }

        @Override // com.ss.android.ugc.aweme.notification.adapter.f.a
        public final as.b f() {
            return this.f113164a.f113155b;
        }

        @Override // com.ss.android.ugc.aweme.notification.adapter.f.a
        public final void g() {
            this.f113164a.n();
        }

        @Override // com.ss.android.ugc.aweme.notification.adapter.f.a
        public final List<MusNotice> a() {
            List<MusNotice> list = this.f113164a.f76354l;
            l.b(list, "");
            return list;
        }

        @Override // com.ss.android.ugc.aweme.notification.adapter.f.a
        public final DmtStatusView d() {
            DmtStatusView dmtStatusView = this.f113164a.f113160g;
            if (dmtStatusView == null) {
                l.b();
            }
            return dmtStatusView;
        }

        C2890d(d dVar) {
            this.f113164a = dVar;
        }

        @Override // com.ss.android.ugc.aweme.notification.adapter.f.a
        public final void a(int i2) {
            this.f113164a.b(i2);
        }
    }

    /* access modifiers changed from: package-private */
    public static final class f extends m implements h.f.a.a<List<MusNotice>> {

        /* renamed from: a */
        public static final f f113165a = new f();

        static {
            Covode.recordClassIndex(72754);
        }

        f() {
            super(0);
        }

        @Override // h.f.a.a
        public final /* synthetic */ List<MusNotice> invoke() {
            return new ArrayList();
        }
    }

    static final class g implements Runnable {

        /* renamed from: a */
        final /* synthetic */ d f113166a;

        /* renamed from: b */
        final /* synthetic */ Exception f113167b;

        static {
            Covode.recordClassIndex(72755);
        }

        g(d dVar, Exception exc) {
            this.f113166a = dVar;
            this.f113167b = exc;
        }

        public final void run() {
            d.super.a((d) this.f113167b);
        }
    }

    public static final class j implements Runnable {

        /* renamed from: a */
        final /* synthetic */ d f113176a;

        /* renamed from: b */
        final /* synthetic */ List f113177b;

        static {
            Covode.recordClassIndex(72758);
        }

        j(d dVar, List list) {
            this.f113176a = dVar;
            this.f113177b = list;
        }

        public final void run() {
            d.super.b_(this.f113177b);
        }
    }

    /* access modifiers changed from: package-private */
    public static final class e extends m implements h.f.a.a<NotificationCombineVM> {
        final /* synthetic */ d this$0;

        static {
            Covode.recordClassIndex(72753);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        e(d dVar) {
            super(0);
            this.this$0 = dVar;
        }

        @Override // h.f.a.a
        public final /* synthetic */ NotificationCombineVM invoke() {
            return NotificationCombineVM.a.a(this.this$0.f113161h);
        }
    }

    public static final class i implements Runnable {

        /* renamed from: a */
        final /* synthetic */ d f113173a;

        /* renamed from: b */
        final /* synthetic */ int f113174b;

        /* renamed from: c */
        final /* synthetic */ MusNotice f113175c;

        static {
            Covode.recordClassIndex(72757);
        }

        i(d dVar, int i2, MusNotice musNotice) {
            this.f113173a = dVar;
            this.f113174b = i2;
            this.f113175c = musNotice;
        }

        public final void run() {
            this.f113173a.a(this.f113174b, this.f113175c);
        }
    }

    @Override // com.ss.android.ugc.aweme.common.a.f
    public final List<MusNotice> e() {
        List<MusNotice> e2 = super.e();
        if (e2 == null) {
            return new ArrayList();
        }
        return e2;
    }

    private final boolean o() {
        if (com.bytedance.common.utility.collection.b.a((Collection) this.f76354l)) {
            return false;
        }
        if (this.f76354l.size() != 1) {
            int size = this.f76354l.size() - 2;
            if (size >= 0) {
                int i2 = 0;
                while (true) {
                    if (!(this.f76354l.get(i2) instanceof com.ss.android.ugc.aweme.notice.repo.list.bean.i) || !(this.f76354l.get(i2 + 1) instanceof com.ss.android.ugc.aweme.notice.repo.list.bean.i)) {
                        if (i2 == size) {
                            break;
                        }
                        i2++;
                    } else {
                        this.f76354l.remove(i2);
                        if (i2 == 0 && ((MusNotice) this.f76354l.get(i2)).timeLineType == 5) {
                            this.f76354l.remove(i2);
                        }
                        return true;
                    }
                }
            }
            return false;
        } else if (!(this.f76354l.get(0) instanceof com.ss.android.ugc.aweme.notice.repo.list.bean.i)) {
            return false;
        } else {
            this.f76354l.remove(0);
            return true;
        }
    }

    public final void n() {
        if (this.f113156c) {
            int indexOf = e().indexOf(this.J);
            if (indexOf != -1) {
                this.f113156c = false;
                this.I = false;
                List<MusNotice> list = this.F;
                if (list != null) {
                    e().addAll(indexOf, list);
                    notifyItemRangeInserted(indexOf, list.size());
                }
            }
            this.f113156c = false;
        }
        int indexOf2 = e().indexOf(this.J);
        if (indexOf2 != -1) {
            int size = e().size();
            List g2 = n.g((Collection) e().subList(0, indexOf2));
            e().clear();
            e().addAll(g2);
            notifyItemRangeRemoved(indexOf2, size - e().size());
            i(e());
            a aVar = this.f113158e;
            if (aVar != null) {
                e();
                aVar.y();
            }
        }
    }

    public final void f(List<? extends MusNotice> list) {
        super.b(h(list));
    }

    @Override // com.ss.android.ugc.aweme.common.a.l
    public final int c(int i2) {
        return g.a((MusNotice) e().get(i2));
    }

    @Override // androidx.recyclerview.widget.RecyclerView.a, com.ss.android.ugc.aweme.common.a.h
    public final void onDetachedFromRecyclerView(RecyclerView recyclerView) {
        l.d(recyclerView, "");
        this.M = null;
        super.onDetachedFromRecyclerView(recyclerView);
        this.O = null;
    }

    private static int n(List<MusNotice> list) {
        int size = list.size();
        int i2 = 0;
        for (int i3 = 0; i3 < size; i3++) {
            if (!(list.get(i3) instanceof com.ss.android.ugc.aweme.notice.repo.list.bean.i) && (i2 = i2 + 1) >= 10) {
                return i3 + 1;
            }
        }
        return 0;
    }

    @Override // com.ss.android.ugc.aweme.common.a.f
    public final void b(List<MusNotice> list) {
        super.b(h(j(list)));
        com.ss.android.ugc.aweme.notification.e.a.b.a(this.y);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.a
    public final long getItemId(int i2) {
        if (i2 < e().size()) {
            return (long) ((MusNotice) e().get(i2)).hashCode();
        }
        return 0;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.a, com.ss.android.ugc.aweme.common.a.h
    public final void onAttachedToRecyclerView(RecyclerView recyclerView) {
        l.d(recyclerView, "");
        super.onAttachedToRecyclerView(recyclerView);
        this.M = recyclerView;
        if (recyclerView.getLayoutManager() instanceof LinearLayoutManager) {
            RecyclerView.i layoutManager = recyclerView.getLayoutManager();
            Objects.requireNonNull(layoutManager, "null cannot be cast to non-null type androidx.recyclerview.widget.LinearLayoutManager");
            this.O = (LinearLayoutManager) layoutManager;
        }
    }

    @Override // androidx.recyclerview.widget.RecyclerView.a, com.ss.android.ugc.aweme.common.a.h
    public final void onViewAttachedToWindow(RecyclerView.ViewHolder viewHolder) {
        l.d(viewHolder, "");
        com.ss.android.ugc.aweme.inbox.d.e.e();
        super.onViewAttachedToWindow(viewHolder);
        if (!(viewHolder instanceof com.ss.android.ugc.aweme.notification.h.a)) {
            viewHolder = null;
        }
        com.ss.android.ugc.aweme.notification.h.a aVar = (com.ss.android.ugc.aweme.notification.h.a) viewHolder;
        if (aVar != null) {
            aVar.bY_();
        }
    }

    @Override // androidx.recyclerview.widget.RecyclerView.a, com.ss.android.ugc.aweme.common.a.h
    public final void onViewDetachedFromWindow(RecyclerView.ViewHolder viewHolder) {
        l.d(viewHolder, "");
        super.onViewDetachedFromWindow(viewHolder);
        if (!(viewHolder instanceof com.ss.android.ugc.aweme.notification.h.a)) {
            viewHolder = null;
        }
        com.ss.android.ugc.aweme.notification.h.a aVar = (com.ss.android.ugc.aweme.notification.h.a) viewHolder;
        if (aVar != null) {
            aVar.d();
        }
    }

    public static final class c extends m implements h.f.a.b<MusNotice, Boolean> {
        final /* synthetic */ com.ss.android.ugc.aweme.notification.bean.d $followRequest$inlined;
        final /* synthetic */ boolean $isContactSyncTop$inlined;
        final /* synthetic */ boolean $isThirdPlatformSyncTop$inlined;
        final /* synthetic */ MusNotice $recommend$inlined;
        final /* synthetic */ MusNotice $tutorialVideo$inlined;
        final /* synthetic */ d this$0;

        static {
            Covode.recordClassIndex(72751);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        c(d dVar, boolean z, boolean z2, MusNotice musNotice, MusNotice musNotice2, com.ss.android.ugc.aweme.notification.bean.d dVar2) {
            super(1);
            this.this$0 = dVar;
            this.$isThirdPlatformSyncTop$inlined = z;
            this.$isContactSyncTop$inlined = z2;
            this.$tutorialVideo$inlined = musNotice;
            this.$recommend$inlined = musNotice2;
            this.$followRequest$inlined = dVar2;
        }

        @Override // h.f.a.b
        public final /* synthetic */ Boolean invoke(MusNotice musNotice) {
            boolean z;
            MusNotice musNotice2 = musNotice;
            l.d(musNotice2, "");
            if (musNotice2.type == 50 || musNotice2.type == 13 || musNotice2.type == 1000 || ((musNotice2.type == 2007 && this.$isThirdPlatformSyncTop$inlined) || (musNotice2.type == 2008 && this.$isContactSyncTop$inlined))) {
                z = true;
            } else {
                z = false;
            }
            return Boolean.valueOf(z);
        }
    }

    public static final class h<TTaskResult, TContinuationResult> implements b.g {

        /* renamed from: a */
        final /* synthetic */ MusNotice f113168a;

        /* renamed from: b */
        final /* synthetic */ d f113169b;

        /* renamed from: c */
        final /* synthetic */ MusNotice f113170c;

        /* renamed from: d */
        final /* synthetic */ int f113171d;

        /* renamed from: e */
        final /* synthetic */ Context f113172e;

        static {
            Covode.recordClassIndex(72756);
        }

        h(MusNotice musNotice, d dVar, MusNotice musNotice2, int i2, Context context) {
            this.f113168a = musNotice;
            this.f113169b = dVar;
            this.f113170c = musNotice2;
            this.f113171d = i2;
            this.f113172e = context;
        }

        @Override // b.g
        public final /* synthetic */ Object then(b.i iVar) {
            l.b(iVar, "");
            if (iVar.e() != null) {
                new com.bytedance.tux.g.b(this.f113169b.f113161h).a(this.f113172e.getString(R.string.cml)).b();
            }
            com.ss.android.ugc.aweme.notification.utils.e.a(this.f113168a, (BaseResponse) iVar.d(), iVar.e());
            return z.f158842a;
        }
    }

    static final class k implements View.OnClickListener {

        /* renamed from: a */
        final /* synthetic */ d f113178a;

        /* renamed from: b */
        final /* synthetic */ int f113179b;

        static {
            Covode.recordClassIndex(72759);
        }

        k(d dVar, int i2) {
            this.f113178a = dVar;
            this.f113179b = i2;
        }

        public final void onClick(View view) {
            ClickAgent.onClick(view);
            this.f113178a.b(this.f113179b);
            androidx.fragment.app.i fragmentManager = this.f113178a.f113161h.getFragmentManager();
            if (fragmentManager != null) {
                androidx.fragment.app.n a2 = fragmentManager.a();
                l.b(a2, "");
                Fragment a3 = fragmentManager.a("DELETE_NOTICE_ACTION_SHEET_TAG");
                if (a3 != null) {
                    a2.a(a3).c();
                }
            }
        }
    }

    private final int e(int i2) {
        List<Object> d2 = n.d((Iterable) e(), i2);
        int i3 = 0;
        if ((d2 instanceof Collection) && d2.isEmpty()) {
            return 0;
        }
        for (Object obj : d2) {
            if ((obj instanceof com.ss.android.ugc.aweme.notice.repo.list.bean.i) && (i3 = i3 + 1) < 0) {
                n.b();
            }
        }
        return i3;
    }

    private final void g(List<CombineLiveNotice> list) {
        if (list == null || list.isEmpty()) {
            this.w = null;
            return;
        }
        ArrayList arrayList = new ArrayList();
        Iterator<T> it = list.iterator();
        while (it.hasNext()) {
            arrayList.add(com.ss.android.ugc.aweme.notification.bean.g.a(it.next()));
        }
        this.w = arrayList;
    }

    public final void d(int i2) {
        if (i2 >= 0 && i2 < e().size() && c(i2) == 1001) {
            try {
                Object obj = e().get(i2);
                if (!(obj instanceof com.ss.android.ugc.aweme.notification.bean.f)) {
                    obj = null;
                }
                com.ss.android.ugc.aweme.notification.bean.f fVar = (com.ss.android.ugc.aweme.notification.bean.f) obj;
                if (fVar != null) {
                    com.ss.android.ugc.aweme.notification.utils.e.a(fVar, i2 - e(i2));
                }
            } catch (Exception e2) {
                e2.printStackTrace();
            }
        }
    }

    private static boolean a(MusNotice musNotice) {
        if (!q.a.a(musNotice) && !a.C2893a.a(musNotice)) {
            if (n.b(2007, 2008).contains(Integer.valueOf(musNotice.type))) {
                return true;
            }
            return false;
        }
        return true;
    }

    private final List<MusNotice> h(List<? extends MusNotice> list) {
        boolean z2;
        boolean z3;
        com.ss.android.ugc.aweme.notification.bean.d dVar = this.x;
        MusNotice musNotice = this.f113162j;
        MusNotice musNotice2 = this.f113163k;
        ArrayList arrayList = new ArrayList();
        if (list != null) {
            arrayList.addAll(list);
        }
        if (m().t() == com.ss.android.ugc.aweme.inbox.r.TOP) {
            z2 = true;
        } else {
            z2 = false;
        }
        if (m().h() == com.ss.android.ugc.aweme.inbox.r.TOP) {
            z3 = true;
        } else {
            z3 = false;
        }
        n.a((List) arrayList, (h.f.a.b) new c(this, z2, z3, musNotice2, musNotice, dVar));
        if (z2) {
            arrayList.add(0, m().p());
        }
        if (z3) {
            arrayList.add(0, m().o());
        }
        if (musNotice2 != null && this.A) {
            arrayList.add(0, musNotice2);
        }
        if (musNotice != null && this.A) {
            arrayList.add(0, musNotice);
        }
        if (dVar != null && this.A) {
            arrayList.add(0, dVar);
        }
        i(arrayList);
        a.a(n.g((Collection) arrayList));
        return arrayList;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:5:0x001a, code lost:
        if (r2 <= 0) goto L_0x001c;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private final void i(java.util.List<? extends com.ss.android.ugc.aweme.notice.repo.list.bean.MusNotice> r7) {
        /*
            r6 = this;
            java.util.Iterator r3 = r7.iterator()
            r5 = 0
            r2 = 0
        L_0x0006:
            boolean r1 = r3.hasNext()
            r4 = -1
            r0 = 1
            if (r1 == 0) goto L_0x001c
            java.lang.Object r0 = r3.next()
            com.ss.android.ugc.aweme.notice.repo.list.bean.MusNotice r0 = (com.ss.android.ugc.aweme.notice.repo.list.bean.MusNotice) r0
            int r1 = r0.type
            r0 = 2000(0x7d0, float:2.803E-42)
            if (r1 != r0) goto L_0x004d
            if (r2 > 0) goto L_0x0035
        L_0x001c:
            java.util.Iterator r3 = r7.iterator()
            r2 = 0
        L_0x0021:
            boolean r0 = r3.hasNext()
            if (r0 == 0) goto L_0x0034
            java.lang.Object r0 = r3.next()
            com.ss.android.ugc.aweme.notice.repo.list.bean.MusNotice r0 = (com.ss.android.ugc.aweme.notice.repo.list.bean.MusNotice) r0
            int r1 = r0.type
            r0 = 2009(0x7d9, float:2.815E-42)
            if (r1 != r0) goto L_0x004a
            r4 = r2
        L_0x0034:
            r2 = r4
        L_0x0035:
            java.util.List r0 = r6.l()
            r0.clear()
            if (r2 <= 0) goto L_0x0050
            java.util.List r1 = r6.l()
            java.util.List r0 = r7.subList(r5, r2)
            r1.addAll(r0)
            return
        L_0x004a:
            int r2 = r2 + 1
            goto L_0x0021
        L_0x004d:
            int r2 = r2 + 1
            goto L_0x0006
        L_0x0050:
            java.util.List r0 = r6.l()
            r0.addAll(r7)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ss.android.ugc.aweme.notification.adapter.d.i(java.util.List):void");
    }

    @Override // com.ss.android.ugc.aweme.common.a.l, com.ss.android.ugc.aweme.common.a.h
    public final RecyclerView.ViewHolder a_(ViewGroup viewGroup) {
        l.d(viewGroup, "");
        int c2 = androidx.core.content.b.c(viewGroup.getContext(), R.color.c5);
        f(c2);
        RecyclerView.ViewHolder a_ = super.a_(viewGroup);
        Context context = viewGroup.getContext();
        l.b(context, "");
        TuxTextView tuxTextView = new TuxTextView(context, null, 0, 6);
        tuxTextView.setTuxFont(61);
        tuxTextView.setGravity(17);
        tuxTextView.setTextColor(c2);
        tuxTextView.setText(R.string.cgj);
        View view = a_.itemView;
        Objects.requireNonNull(view, "null cannot be cast to non-null type com.bytedance.ies.dmt.ui.widget.DmtStatusView");
        DmtStatusView dmtStatusView = (DmtStatusView) view;
        dmtStatusView.setBuilder(dmtStatusView.c().b(tuxTextView));
        l.b(a_, "");
        return a_;
    }

    @Override // com.ss.android.ugc.aweme.common.a.f
    public final void b_(List<MusNotice> list) {
        Integer valueOf;
        int intValue;
        this.B = list;
        int i2 = 0;
        this.E = 0;
        this.F = null;
        this.G = false;
        this.f113156c = false;
        this.I = true;
        super.b_(h(j(list)));
        try {
            LinearLayoutManager linearLayoutManager = this.O;
            if (linearLayoutManager != null && (valueOf = Integer.valueOf(linearLayoutManager.m())) != null && valueOf.intValue() >= 0 && (intValue = valueOf.intValue()) >= 0) {
                while (true) {
                    d(i2);
                    if (i2 == intValue) {
                        break;
                    }
                    i2++;
                }
            }
        } catch (Exception e2) {
            e2.printStackTrace();
        }
        com.ss.android.ugc.aweme.notification.e.a.b.a(this.y);
        w.a.a(w.c.INBOX);
    }

    public final void e(List<CombineLiveNotice> list) {
        g(list);
        List e2 = e();
        for (int size = e2.size() - 1; size >= 0; size--) {
            if (((MusNotice) e2.get(size)).type == 1001 && (e2.get(size) instanceof com.ss.android.ugc.aweme.notification.bean.f)) {
                e2.remove(size);
            }
        }
        super.b_(h(j(e())));
    }

    /* JADX WARNING: Code restructure failed: missing block: B:13:0x0037, code lost:
        if (r2 <= 0) goto L_0x0039;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:47:0x00ca, code lost:
        if (r1 == null) goto L_0x000b;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:48:0x00cc, code lost:
        r7.add(r2 + 1, r6.J);
        h.a.n.f((java.util.List) r1);
        r7.removeAll(r1);
        notifyDataSetChanged();
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private final void m(java.util.List<com.ss.android.ugc.aweme.notice.repo.list.bean.MusNotice> r7) {
        /*
        // Method dump skipped, instructions count: 226
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ss.android.ugc.aweme.notification.adapter.d.m(java.util.List):void");
    }

    /* JADX DEBUG: Multi-variable search result rejected for r3v0, resolved type: com.bytedance.tux.sheet.a.a$e[] */
    /* JADX WARN: Multi-variable type inference failed */
    @Override // com.ss.android.ugc.aweme.notification.h.e
    public final void a(int i2) {
        if (i2 < e().size() && this.f113161h.getContext() != null) {
            k kVar = new k(this, i2);
            new a.b().a(new a.e().a(R.string.b5g).b(1).a(kVar)).b().show(this.f113161h.getFragmentManager(), "DELETE_NOTICE_ACTION_SHEET_TAG");
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:27:0x0084, code lost:
        if ((r7.getTimeInMillis() - r0) >= (((long) r11) * 86400000)) goto L_0x00a6;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private final void k(java.util.List<com.ss.android.ugc.aweme.notice.repo.list.bean.MusNotice> r15) {
        /*
        // Method dump skipped, instructions count: 360
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ss.android.ugc.aweme.notification.adapter.d.k(java.util.List):void");
    }

    private final void l(List<MusNotice> list) {
        List<MusNotice> list2;
        if (this.I && !this.f113156c) {
            this.F = null;
            if (m().a() == a.b.a() && com.ss.android.ugc.aweme.inbox.e.b().d()) {
                int i2 = -1;
                int i3 = -1;
                int i4 = 0;
                for (T t : list) {
                    int i5 = i4 + 1;
                    if (i4 < 0) {
                        n.a();
                    }
                    T t2 = t;
                    if (i2 < 0 && (((MusNotice) t2).type == 2000 || ((MusNotice) t2).type == 2009)) {
                        i2 = i4;
                    }
                    if (((MusNotice) t2).timeLineType == 0 || ((MusNotice) t2).timeLineType == 1) {
                        i3 = i5;
                    }
                    i4 = i5;
                }
                if (i2 > 0) {
                    int i6 = com.ss.android.ugc.aweme.inbox.t.a().f104288c;
                    if (i3 < 0) {
                        if (i6 > 0 && (list2 = this.B) != null && list2.size() > i6) {
                            List<MusNotice> list3 = this.B;
                            if (list3 == null) {
                                l.b();
                            }
                            i3 = list.indexOf(list3.get(i6 - 1)) + 1;
                        } else {
                            return;
                        }
                    }
                    if (i3 > 0 && i3 < list.size()) {
                        if (i3 >= i2) {
                            StringBuilder append = new StringBuilder("collapse invalid index, start:").append(i3).append(", end:").append(i2).append(", notices:");
                            ArrayList arrayList = new ArrayList(n.a((Iterable) list, 10));
                            for (T t3 : list) {
                                arrayList.add(v.a(Integer.valueOf(((MusNotice) t3).type), Integer.valueOf(((MusNotice) t3).timeLineType)));
                            }
                            com.ss.android.ugc.aweme.common.f.a("MusNewNotiAdapter", append.append(arrayList).toString(), new IllegalStateException());
                            return;
                        }
                        this.F = n.g((Collection) list.subList(i3, i2));
                        ArrayList arrayList2 = new ArrayList();
                        int i7 = 0;
                        for (T t4 : list) {
                            int i8 = i7 + 1;
                            if (i7 < 0) {
                                n.a();
                            } else if (i7 >= i3 && i7 < i2) {
                                i7 = i8;
                            }
                            arrayList2.add(t4);
                            i7 = i8;
                        }
                        list.clear();
                        list.addAll(arrayList2);
                        list.add(i3, this.J);
                        List<MusNotice> list4 = this.F;
                        if (!(list4 == null || list4.isEmpty())) {
                            this.f113156c = true;
                        }
                    }
                }
            }
        }
    }

    public final void b(int i2) {
        User user;
        JSONObject jSONObject;
        String str;
        com.ss.android.ugc.aweme.notice.repo.list.a.c cVar;
        com.ss.android.ugc.aweme.notice.repo.list.a.f fVar;
        List<User> list;
        Context context = this.f113161h.getContext();
        if (context != null) {
            l.b(context, "");
            int size = this.f76354l.size();
            if (size > 0 && i2 >= 0 && i2 < size) {
                MusNotice musNotice = (MusNotice) this.f76354l.get(i2);
                if (musNotice != null) {
                    User user2 = null;
                    if (musNotice.type == 2011) {
                        com.ss.android.ugc.aweme.base.a.k<User> kVar = this.f113154a;
                        if (kVar != null) {
                            if (!(musNotice instanceof q)) {
                                musNotice = null;
                            }
                            q qVar = (q) musNotice;
                            if (qVar != null) {
                                user2 = qVar.f113282b;
                            }
                            kVar.a(3, user2, i2);
                            return;
                        }
                        return;
                    } else if (musNotice.type == 2007) {
                        com.ss.android.ugc.aweme.inbox.q.THIRD_PLATFORM.markDelete();
                    } else if (musNotice.type == 2008) {
                        com.ss.android.ugc.aweme.notification.utils.e.a(m().h());
                        com.ss.android.ugc.aweme.inbox.q.CONTACTS.markDelete();
                    } else {
                        if (musNotice.type == 225) {
                            u uVar = new u();
                            uVar.f109597b = u.a.CLOSE;
                            u a2 = uVar.a("notification_page");
                            a2.f109596a = u.c.INBOX_NOTICE;
                            com.ss.android.ugc.aweme.notice.repo.list.bean.e eVar = musNotice.templateNotice;
                            if (eVar == null || (cVar = eVar.f112844b) == null || (fVar = cVar.f112805d) == null || (list = fVar.f112824a) == null) {
                                user = null;
                            } else {
                                user = (User) n.h((List) list);
                            }
                            u a3 = a2.a(user);
                            LinkedHashMap linkedHashMap = new LinkedHashMap();
                            com.ss.android.ugc.aweme.notice.repo.list.bean.e eVar2 = musNotice.templateNotice;
                            if (eVar2 == null || (str = eVar2.f112851i) == null) {
                                jSONObject = new JSONObject();
                            } else {
                                jSONObject = new JSONObject(str);
                            }
                            Iterator<String> keys = jSONObject.keys();
                            l.b(keys, "");
                            while (keys.hasNext()) {
                                String next = keys.next();
                                try {
                                    if (l.a((Object) next, (Object) "business_extra")) {
                                        JSONObject jSONObject2 = new JSONObject(jSONObject.optString(next));
                                        Iterator<String> keys2 = jSONObject2.keys();
                                        l.b(keys2, "");
                                        while (keys2.hasNext()) {
                                            String next2 = keys2.next();
                                            l.b(next2, "");
                                            String optString = jSONObject2.optString(next2);
                                            l.b(optString, "");
                                            linkedHashMap.put(next2, optString);
                                        }
                                    } else if (!linkedHashMap.containsKey(next)) {
                                        l.b(next, "");
                                        String optString2 = jSONObject.optString(next);
                                        l.b(optString2, "");
                                        linkedHashMap.put(next, optString2);
                                    }
                                    h.q.m223constructorimpl(z.f158842a);
                                } catch (Throwable th) {
                                    h.q.m223constructorimpl(h.r.a(th));
                                }
                            }
                            a3.a(linkedHashMap).f();
                        }
                        MusNotificationApiManager.a(musNotice.nid).a(new h(musNotice, this, musNotice, i2, context), b.i.f4826c, null);
                    }
                }
                RecyclerView recyclerView = this.M;
                if (recyclerView == null || !recyclerView.l()) {
                    a(i2, musNotice);
                } else {
                    recyclerView.post(new i(this, i2, musNotice));
                }
            }
        }
    }

    /* JADX INFO: Can't fix incorrect switch cases order, some code will duplicate */
    private final List<MusNotice> j(List<? extends MusNotice> list) {
        boolean z2;
        List<MusNotice> list2;
        List<MusNotice> list3;
        if ((list == null || list.isEmpty()) && ((list3 = this.w) == null || list3.isEmpty())) {
            return h.a.z.INSTANCE;
        }
        com.ss.android.ugc.aweme.notification.e.a.b.a();
        if (list == null) {
            list = h.a.z.INSTANCE;
        }
        List<MusNotice> arrayList = new ArrayList<>();
        ArrayList arrayList2 = new ArrayList();
        if (this.y != a.b.a() || com.bytedance.ies.abmock.b.a().a(true, "i18n_following_live_skylight_type", 0) == 1 || (list2 = this.w) == null || list2.isEmpty()) {
            z2 = false;
        } else {
            List<MusNotice> list4 = this.w;
            if (list4 == null) {
                l.b();
            }
            arrayList2.addAll(list4);
            z2 = true;
        }
        if (z2) {
            ArrayList arrayList3 = new ArrayList();
            for (T t : list) {
                T t2 = t;
                if (!(((MusNotice) t2).type == 1001 || ((MusNotice) t2).type == 50 || ((MusNotice) t2).type == 13 || ((MusNotice) t2).type == 1000)) {
                    arrayList3.add(t);
                }
            }
            arrayList2.addAll(arrayList3);
        } else {
            arrayList2.addAll(list);
        }
        ArrayList<Object> arrayList4 = new ArrayList();
        for (Object obj : arrayList2) {
            MusNotice musNotice = (MusNotice) obj;
            if (musNotice.templateNotice == null) {
                int i2 = musNotice.type;
                if (i2 != 1) {
                    if (i2 != 2) {
                        if (i2 != 6) {
                            if (i2 == 9) {
                                com.ss.android.ugc.aweme.notice.repo.list.bean.m mVar = musNotice.voteNotice;
                                if (mVar != null) {
                                    List<? extends User> list5 = mVar.f112878a;
                                    if (list5 != null) {
                                        if (list5.isEmpty()) {
                                        }
                                    }
                                }
                            } else if (i2 == 31) {
                                if (musNotice.commentNotice != null) {
                                    CommentNotice commentNotice = musNotice.commentNotice;
                                    l.b(commentNotice, "");
                                    if (commentNotice.isReplyWithVideo()) {
                                        CommentNotice commentNotice2 = musNotice.commentNotice;
                                        l.b(commentNotice2, "");
                                        Comment comment = commentNotice2.getComment();
                                        if (comment != null) {
                                            if (comment.getAliasAweme() == null) {
                                            }
                                        }
                                    }
                                }
                                CommentNotice commentNotice3 = musNotice.commentNotice;
                                if (commentNotice3 != null) {
                                    if (commentNotice3.getComment() == null) {
                                    }
                                }
                            } else if (i2 != 33) {
                                if (i2 == 41) {
                                    DiggNotice diggNotice = musNotice.diggNotice;
                                    if (diggNotice != null) {
                                        List<User> users = diggNotice.getUsers();
                                        if (users != null) {
                                            if (users.isEmpty()) {
                                            }
                                        }
                                    }
                                } else if (i2 == 45) {
                                    AtMe atMe = musNotice.atMe;
                                    if (atMe != null) {
                                        if (atMe.getUser() == null) {
                                        }
                                    }
                                } else if (i2 == 50) {
                                    LiveOuterService.s();
                                    if (!(musNotice instanceof p)) {
                                        musNotice = null;
                                    }
                                    p pVar = (p) musNotice;
                                    if (pVar != null) {
                                        List<UrlModel> list6 = pVar.f113275a;
                                        if (list6 != null) {
                                            if (list6.isEmpty()) {
                                            }
                                        }
                                    }
                                } else if (i2 == 61) {
                                    LiveOuterService.s();
                                    if (musNotice.tcmNotice == null) {
                                    }
                                } else if (i2 == 69) {
                                    com.ss.android.ugc.aweme.notice.repo.list.bean.d dVar = musNotice.donationNotice;
                                    if (dVar != null) {
                                        if (dVar.f112841a != null) {
                                            com.ss.android.ugc.aweme.notice.repo.list.bean.d dVar2 = musNotice.donationNotice;
                                            if (dVar2 != null) {
                                                if (dVar2.f112842b == null) {
                                                }
                                            }
                                        }
                                    }
                                } else if (i2 != 81) {
                                    if (i2 != 82) {
                                        switch (i2) {
                                            case ABRConfig.ABR_BANDWIDTH_PARAMETER_KEY:
                                                break;
                                            case ABRConfig.ABR_DEFAULT_WIFI_BITRATE:
                                                break;
                                            case ABRConfig.ABR_STARTUP_MAX_BITRATE:
                                                if (musNotice.followRequestNotice == null) {
                                                    break;
                                                }
                                            default:
                                                switch (i2) {
                                                    case 21:
                                                        DuetNotice duetNotice = musNotice.duetNotice;
                                                        if (duetNotice != null) {
                                                            if (duetNotice.getAweme() == null) {
                                                                break;
                                                            }
                                                        } else {
                                                            break;
                                                        }
                                                    case 22:
                                                        PostNotice postNotice = musNotice.postNotice;
                                                        if (postNotice != null) {
                                                            if (postNotice.getAweme() == null) {
                                                                break;
                                                            }
                                                        } else {
                                                            break;
                                                        }
                                                    case 23:
                                                        FollowApproveNotice followApproveNotice = musNotice.followApproveNotice;
                                                        if (followApproveNotice != null) {
                                                            if (followApproveNotice.getUser() == null) {
                                                                break;
                                                            }
                                                        } else {
                                                            break;
                                                        }
                                                    case 24:
                                                        FriendNotice friendNotice = musNotice.friendNotice;
                                                        if (friendNotice != null) {
                                                            if (friendNotice.getUser() == null) {
                                                                break;
                                                            }
                                                        } else {
                                                            break;
                                                        }
                                                    default:
                                                        switch (i2) {
                                                            case 1000:
                                                                if (!(musNotice instanceof t)) {
                                                                    break;
                                                                }
                                                            case 1001:
                                                                LiveOuterService.s();
                                                                if (!(musNotice instanceof com.ss.android.ugc.aweme.notification.bean.f)) {
                                                                    break;
                                                                }
                                                            case 1002:
                                                                CheckProfileNotice checkProfileNotice = musNotice.checkProfileNotice;
                                                                if (checkProfileNotice == null) {
                                                                    break;
                                                                } else {
                                                                    List<User> users2 = checkProfileNotice.getUsers();
                                                                    if (users2 != null) {
                                                                        if (users2.isEmpty()) {
                                                                            break;
                                                                        }
                                                                    } else {
                                                                        break;
                                                                    }
                                                                }
                                                            default:
                                                                switch (i2) {
                                                                    default:
                                                                        switch (i2) {
                                                                            case 2006:
                                                                            case 2009:
                                                                            case 2010:
                                                                            case 2011:
                                                                                break;
                                                                            case 2007:
                                                                                if (m().t() != com.ss.android.ugc.aweme.inbox.r.BOTTOM) {
                                                                                    break;
                                                                                }
                                                                            case 2008:
                                                                                if (m().h() != com.ss.android.ugc.aweme.inbox.r.BOTTOM) {
                                                                                    break;
                                                                                }
                                                                            default:
                                                                                if (musNotice.templateNotice == null) {
                                                                                    CommentNotice commentNotice4 = musNotice.commentNotice;
                                                                                    if (commentNotice4 != null) {
                                                                                        if (commentNotice4.getComment() == null) {
                                                                                            break;
                                                                                        }
                                                                                    } else {
                                                                                        break;
                                                                                    }
                                                                                }
                                                                        }
                                                                    case LiveNetAdaptiveHurryTimeSetting.DEFAULT:
                                                                    case 2001:
                                                                    case 2002:
                                                                    case 2003:
                                                                        arrayList4.add(obj);
                                                                        break;
                                                                }
                                                        }
                                                }
                                        }
                                    } else if (musNotice.businessAccountNotice == null) {
                                    }
                                } else if (musNotice.promoteNotice == null) {
                                }
                            } else if (musNotice.followNotice == null) {
                            }
                        } else if (!FunctionSupportService.INSTANCE.notSupport(IFunctionKey.AD)) {
                            com.ss.android.ugc.aweme.notice.repo.list.bean.b bVar = musNotice.adHelperNotice;
                            if (bVar != null) {
                                if (bVar.f112831a == null) {
                                }
                            }
                        }
                    }
                    if (musNotice.textNotice == null) {
                    }
                }
                if (musNotice.announcement == null) {
                }
            }
            arrayList4.add(obj);
        }
        for (Object obj2 : arrayList4) {
            arrayList.add(obj2);
        }
        k(arrayList);
        if (com.ss.android.ugc.aweme.inbox.b.b.c()) {
            l(arrayList);
        } else if (com.ss.android.ugc.aweme.recommend.users.b.f120122a.c()) {
            m(arrayList);
        }
        com.ss.android.ugc.aweme.notification.e.a.b.b();
        return arrayList;
    }

    @Override // com.ss.android.ugc.aweme.common.a.l
    public final RecyclerView.ViewHolder a(ViewGroup viewGroup, int i2) {
        l.d(viewGroup, "");
        return this.N.a(viewGroup, i2);
    }

    public final void a(int i2, MusNotice musNotice) {
        this.f76354l.remove(i2);
        List<MusNotice> list = this.B;
        if (list != null) {
            Objects.requireNonNull(list, "null cannot be cast to non-null type kotlin.collections.MutableCollection<T>");
            ad.b(list).remove(musNotice);
        }
        List<MusNotice> l2 = l();
        Objects.requireNonNull(l2, "null cannot be cast to non-null type kotlin.collections.MutableCollection<T>");
        ad.b(l2).remove(musNotice);
        Fragment fragment = this.f113161h;
        Objects.requireNonNull(fragment, "null cannot be cast to non-null type com.ss.android.ugc.aweme.notification.MusNewNotificationFragment");
        ((MusNewNotificationFragment) fragment).a(musNotice);
        List<MusNotice> q = m().q();
        Objects.requireNonNull(q, "null cannot be cast to non-null type kotlin.collections.MutableCollection<T>");
        ad.b(q).remove(musNotice);
        if (o()) {
            notifyDataSetChanged();
        } else {
            notifyItemRemoved(i2);
        }
        List e2 = e();
        if (e2 == null || e2.isEmpty()) {
            this.Q.invoke();
        }
    }

    public final void a(int i2, com.ss.android.ugc.aweme.notice.repo.list.bean.f fVar) {
        boolean z2;
        l.d(fVar, "");
        this.y = i2;
        this.z = fVar;
        if (i2 == a.b.a()) {
            z2 = true;
        } else {
            z2 = false;
        }
        this.A = z2;
    }

    @Override // com.ss.android.ugc.aweme.common.a.l
    public final void a(RecyclerView.ViewHolder viewHolder, int i2) {
        this.N.a(viewHolder, i2);
    }

    public d(Fragment fragment, String str, h.f.a.a<z> aVar) {
        l.d(fragment, "");
        l.d(str, "");
        l.d(aVar, "");
        this.f113161h = fragment;
        this.P = str;
        this.Q = aVar;
    }

    /* access modifiers changed from: public */
    private void a(List<User> list, int i2, int i3, boolean z2) {
        l.d(list, "");
        if (!com.ss.android.ugc.aweme.inbox.b.b.b()) {
            this.C = i3;
            if (i2 <= 0) {
                this.x = null;
            } else {
                this.x = new com.ss.android.ugc.aweme.notification.bean.d(i2, list);
            }
            if (z2) {
                super.b_(h(e()));
            }
        }
    }
}
