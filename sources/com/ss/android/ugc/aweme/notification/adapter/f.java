package com.ss.android.ugc.aweme.notification.adapter;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.fragment.app.Fragment;
import androidx.lifecycle.u;
import androidx.recyclerview.widget.RecyclerView;
import com.bytedance.android.livesdk.livesetting.pullstream.LiveNetAdaptiveHurryTimeSetting;
import com.bytedance.apm.agent.v2.instrumentation.ClickAgent;
import com.bytedance.covode.number.Covode;
import com.bytedance.ies.dmt.ui.widget.DmtStatusView;
import com.bytedance.tux.sheet.a.a;
import com.bytedance.vcloud.abrmodule.ABRConfig;
import com.ss.android.ugc.aweme.base.a.k;
import com.ss.android.ugc.aweme.notice.repo.list.bean.MusNotice;
import com.ss.android.ugc.aweme.notification.bean.q;
import com.ss.android.ugc.aweme.notification.h.aa;
import com.ss.android.ugc.aweme.notification.h.ab;
import com.ss.android.ugc.aweme.notification.h.ac;
import com.ss.android.ugc.aweme.notification.h.ad;
import com.ss.android.ugc.aweme.notification.h.ah;
import com.ss.android.ugc.aweme.notification.h.ai;
import com.ss.android.ugc.aweme.notification.h.aj;
import com.ss.android.ugc.aweme.notification.h.ak;
import com.ss.android.ugc.aweme.notification.h.al;
import com.ss.android.ugc.aweme.notification.h.am;
import com.ss.android.ugc.aweme.notification.h.an;
import com.ss.android.ugc.aweme.notification.h.ao;
import com.ss.android.ugc.aweme.notification.h.ap;
import com.ss.android.ugc.aweme.notification.h.aq;
import com.ss.android.ugc.aweme.notification.h.ar;
import com.ss.android.ugc.aweme.notification.h.as;
import com.ss.android.ugc.aweme.notification.h.at;
import com.ss.android.ugc.aweme.notification.h.au;
import com.ss.android.ugc.aweme.notification.h.av;
import com.ss.android.ugc.aweme.notification.h.aw;
import com.ss.android.ugc.aweme.notification.h.o;
import com.ss.android.ugc.aweme.notification.h.p;
import com.ss.android.ugc.aweme.notification.h.r;
import com.ss.android.ugc.aweme.notification.h.s;
import com.ss.android.ugc.aweme.notification.h.t;
import com.ss.android.ugc.aweme.notification.h.v;
import com.ss.android.ugc.aweme.notification.h.x;
import com.ss.android.ugc.aweme.notification.vm.BaseNotificationVM;
import com.ss.android.ugc.aweme.profile.model.User;
import com.zhiliaoapp.musically.R;
import h.a.af;
import h.a.n;
import h.f.b.l;
import h.f.b.m;
import h.h;
import h.i;
import h.j.e;
import h.z;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.Objects;

public final class f implements com.ss.android.ugc.aweme.notification.h.e {

    /* renamed from: a  reason: collision with root package name */
    public final a f113194a;

    /* renamed from: b  reason: collision with root package name */
    private final h f113195b = i.a((h.f.a.a) b.f113197a);

    /* renamed from: c  reason: collision with root package name */
    private final h f113196c = i.a((h.f.a.a) c.f113198a);

    public interface a {
        static {
            Covode.recordClassIndex(72771);
        }

        List<MusNotice> a();

        void a(int i2);

        BaseNotificationVM b();

        Fragment c();

        DmtStatusView d();

        k<User> e();

        as.b f();

        void g();
    }

    static {
        Covode.recordClassIndex(72770);
    }

    private final com.ss.android.ugc.aweme.notification.view.template.c e() {
        return (com.ss.android.ugc.aweme.notification.view.template.c) this.f113195b.getValue();
    }

    private final com.ss.android.ugc.aweme.notification.view.template.c f() {
        return (com.ss.android.ugc.aweme.notification.view.template.c) this.f113196c.getValue();
    }

    static final class b extends m implements h.f.a.a<com.ss.android.ugc.aweme.notification.c.a> {

        /* renamed from: a  reason: collision with root package name */
        public static final b f113197a = new b();

        static {
            Covode.recordClassIndex(72772);
        }

        b() {
            super(0);
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        @Override // h.f.a.a
        public final /* synthetic */ com.ss.android.ugc.aweme.notification.c.a invoke() {
            return new com.ss.android.ugc.aweme.notification.c.a();
        }
    }

    static final class c extends m implements h.f.a.a<com.ss.android.ugc.aweme.notification.c.e> {

        /* renamed from: a  reason: collision with root package name */
        public static final c f113198a = new c();

        static {
            Covode.recordClassIndex(72773);
        }

        c() {
            super(0);
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        @Override // h.f.a.a
        public final /* synthetic */ com.ss.android.ugc.aweme.notification.c.e invoke() {
            return new com.ss.android.ugc.aweme.notification.c.e();
        }
    }

    private final List<MusNotice> b() {
        return this.f113194a.a();
    }

    private final BaseNotificationVM c() {
        return this.f113194a.b();
    }

    /* access modifiers changed from: package-private */
    public final Fragment a() {
        return this.f113194a.c();
    }

    private final long[] d() {
        User user;
        Long valueOf;
        List<MusNotice> b2 = b();
        ArrayList<MusNotice> arrayList = new ArrayList();
        for (T t : b2) {
            if (((MusNotice) t).type == 1001) {
                arrayList.add(t);
            }
        }
        ArrayList arrayList2 = new ArrayList();
        for (MusNotice musNotice : arrayList) {
            if (!(musNotice instanceof com.ss.android.ugc.aweme.notification.bean.f)) {
                musNotice = null;
            }
            com.ss.android.ugc.aweme.notification.bean.f fVar = (com.ss.android.ugc.aweme.notification.bean.f) musNotice;
            if (!(fVar == null || (user = fVar.f113246a) == null || (valueOf = Long.valueOf(user.roomId)) == null)) {
                arrayList2.add(valueOf);
            }
        }
        return n.f((Collection<Long>) arrayList2);
    }

    private int e(int i2) {
        return i2 - d(i2);
    }

    /* access modifiers changed from: package-private */
    public static final class d implements View.OnClickListener {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ f f113199a;

        static {
            Covode.recordClassIndex(72774);
        }

        d(f fVar) {
            this.f113199a = fVar;
        }

        public final void onClick(View view) {
            ClickAgent.onClick(view);
            this.f113199a.f113194a.g();
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: com.ss.android.ugc.aweme.notification.adapter.f$f  reason: collision with other inner class name */
    public static final class C2892f extends m implements h.f.a.b<Integer, z> {
        final /* synthetic */ f this$0;

        static {
            Covode.recordClassIndex(72776);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C2892f(f fVar) {
            super(1);
            this.this$0 = fVar;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
        @Override // h.f.a.b
        public final /* synthetic */ z invoke(Integer num) {
            this.this$0.f113194a.a(num.intValue());
            return z.f158842a;
        }
    }

    /* access modifiers changed from: package-private */
    public static final class e<T> implements u {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ DmtStatusView f113200a;

        static {
            Covode.recordClassIndex(72775);
        }

        e(DmtStatusView dmtStatusView) {
            this.f113200a = dmtStatusView;
        }

        @Override // androidx.lifecycle.u
        public final /* synthetic */ void onChanged(Object obj) {
            Boolean bool = (Boolean) obj;
            l.b(bool, "");
            if (bool.booleanValue()) {
                this.f113200a.f();
            } else {
                this.f113200a.d();
            }
        }
    }

    public f(a aVar) {
        l.d(aVar, "");
        this.f113194a = aVar;
    }

    private final List<com.ss.android.ugc.aweme.notification.view.template.c> b(int i2) {
        ArrayList arrayList = new ArrayList();
        if (i2 == 212) {
            arrayList.add(e());
        } else if (i2 == 225) {
            arrayList.add(f());
        }
        return arrayList;
    }

    static final class g implements View.OnClickListener {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ f f113201a;

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ int f113202b;

        static {
            Covode.recordClassIndex(72777);
        }

        g(f fVar, int i2) {
            this.f113201a = fVar;
            this.f113202b = i2;
        }

        public final void onClick(View view) {
            ClickAgent.onClick(view);
            this.f113201a.f113194a.a(this.f113202b);
            androidx.fragment.app.i fragmentManager = this.f113201a.a().getFragmentManager();
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

    private final int d(int i2) {
        List<Object> d2 = n.d((Iterable) b(), i2);
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

    private final boolean c(int i2) {
        if (i2 > 0) {
            h.j.e a2 = e.a.a(i2 - 1, 0, -1);
            ArrayList<MusNotice> arrayList = new ArrayList(n.a(a2, 10));
            Iterator it = a2.iterator();
            while (it.hasNext()) {
                arrayList.add(b().get(((af) it).a()));
            }
            for (MusNotice musNotice : arrayList) {
                if (musNotice instanceof com.ss.android.ugc.aweme.notice.repo.list.bean.i) {
                    if (musNotice.timeLineType == 0) {
                        return true;
                    }
                    return false;
                }
            }
        }
        return true;
    }

    /* JADX DEBUG: Multi-variable search result rejected for r3v0, resolved type: com.bytedance.tux.sheet.a.a$e[] */
    /* JADX WARN: Multi-variable type inference failed */
    @Override // com.ss.android.ugc.aweme.notification.h.e
    public final void a(int i2) {
        if (i2 < b().size() && a().getContext() != null) {
            g gVar = new g(this, i2);
            new a.b().a(new a.e().a(R.string.b5g).b(1).a(gVar)).b().show(a().getFragmentManager(), "DELETE_NOTICE_ACTION_SHEET_TAG");
        }
    }

    public static View a(int i2, ViewGroup viewGroup) {
        l.d(viewGroup, "");
        View a2 = com.a.a(LayoutInflater.from(viewGroup.getContext()), i2, viewGroup, false);
        l.b(a2, "");
        return a2;
    }

    private static void b(RecyclerView.ViewHolder viewHolder, int i2) {
        if (viewHolder != null) {
            try {
                ((p) viewHolder).c(i2);
            } catch (Exception e2) {
                e2.printStackTrace();
            }
        } else {
            throw new NullPointerException("null cannot be cast to non-null type com.ss.android.ugc.aweme.notification.vh.MTNewBaseNotificationHolder");
        }
    }

    /* JADX WARNING: Removed duplicated region for block: B:20:0x0049  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final androidx.recyclerview.widget.RecyclerView.ViewHolder a(android.view.ViewGroup r6, int r7) {
        /*
        // Method dump skipped, instructions count: 794
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ss.android.ugc.aweme.notification.adapter.f.a(android.view.ViewGroup, int):androidx.recyclerview.widget.RecyclerView$ViewHolder");
    }

    /* JADX INFO: Can't fix incorrect switch cases order, some code will duplicate */
    public final void a(RecyclerView.ViewHolder viewHolder, int i2) {
        String string;
        RecyclerView.ViewHolder viewHolder2 = viewHolder;
        if (!(viewHolder2 instanceof aa)) {
            if (viewHolder2 instanceof com.ss.android.ugc.aweme.notification.h.k) {
                ((com.ss.android.ugc.aweme.notification.h.k) viewHolder2).a(b().get(i2), i2);
            }
            String a2 = com.ss.android.ugc.aweme.notification.utils.f.a(b().get(i2).timeLineType);
            int a3 = g.a(b().get(i2));
            boolean z = true;
            if (a3 != 1) {
                if (a3 != 2) {
                    if (a3 == 81) {
                        Objects.requireNonNull(viewHolder2, "null cannot be cast to non-null type com.ss.android.ugc.aweme.notification.vh.MusNewPromoteNotificationHolder");
                        an anVar = (an) viewHolder2;
                        MusNotice musNotice = b().get(i2);
                        if (com.ss.android.ugc.aweme.notification.redpoint.h.b().a(81) > 0) {
                            z = false;
                        }
                        anVar.a(musNotice, z, i2, com.ss.android.ugc.aweme.notification.utils.f.a(Integer.valueOf(c().a())));
                        return;
                    } else if (a3 != 82) {
                        com.ss.android.ugc.aweme.notification.bean.a aVar = null;
                        switch (a3) {
                            case -10000:
                                if (!(viewHolder2 instanceof x)) {
                                    viewHolder2 = null;
                                }
                                x xVar = (x) viewHolder2;
                                if (xVar != null) {
                                    xVar.a(b().get(i2), i2, a2, com.ss.android.ugc.aweme.notification.utils.f.a(Integer.valueOf(c().a())), c().f114045a, false, (List<? extends com.ss.android.ugc.aweme.notification.view.template.c>) b(b().get(i2).type));
                                    return;
                                }
                                return;
                            case ABRConfig.ABR_PLAYER_DISPLAY_WIDTH_KEY:
                                Objects.requireNonNull(viewHolder2, "null cannot be cast to non-null type com.ss.android.ugc.aweme.notification.vh.MusAdHelperNotificationHolder");
                                ((ac) viewHolder2).a(b().get(i2));
                                return;
                            case ABRConfig.ABR_STALL_PENALTY_PARAMETER_KEY:
                                Objects.requireNonNull(viewHolder2, "null cannot be cast to non-null type com.ss.android.ugc.aweme.notification.vh.MTVoteNotificationHolder");
                                ((ab) viewHolder2).a(b().get(i2), c(i2), com.ss.android.ugc.aweme.notification.utils.f.a(Integer.valueOf(c().a())), c().f114045a);
                                return;
                            case 31:
                                Objects.requireNonNull(viewHolder2, "null cannot be cast to non-null type com.ss.android.ugc.aweme.notification.vh.MTNewCommentsNotificationHolder");
                                ((r) viewHolder2).a(b().get(i2), com.ss.android.ugc.aweme.notification.utils.f.a(Integer.valueOf(c().a())), c().f114045a);
                                b(viewHolder2, a3);
                                return;
                            case 33:
                                Objects.requireNonNull(viewHolder2, "null cannot be cast to non-null type com.ss.android.ugc.aweme.notification.vh.MTNewFansNotificationHolder");
                                ((t) viewHolder2).a(b().get(i2), com.ss.android.ugc.aweme.notification.utils.f.a(Integer.valueOf(c().a())), c().f114045a);
                                b(viewHolder2, a3);
                                return;
                            case 41:
                                Objects.requireNonNull(viewHolder2, "null cannot be cast to non-null type com.ss.android.ugc.aweme.notification.vh.MTNewLikesNotificationHolder");
                                ((com.ss.android.ugc.aweme.notification.h.u) viewHolder2).a(b().get(i2), c(i2), com.ss.android.ugc.aweme.notification.utils.f.a(Integer.valueOf(c().a())), c().f114045a);
                                b(viewHolder2, a3);
                                return;
                            case 45:
                                Objects.requireNonNull(viewHolder2, "null cannot be cast to non-null type com.ss.android.ugc.aweme.notification.vh.MTNewMentionNotificationHolder");
                                ((v) viewHolder2).a(b().get(i2), com.ss.android.ugc.aweme.notification.utils.f.a(Integer.valueOf(c().a())), c().f114045a);
                                b(viewHolder2, a3);
                                return;
                            case 50:
                                Objects.requireNonNull(viewHolder2, "null cannot be cast to non-null type com.ss.android.ugc.aweme.notification.vh.MusLiveRecommendAvatarNotificationHolder");
                                com.ss.android.ugc.aweme.notification.h.af afVar = (com.ss.android.ugc.aweme.notification.h.af) viewHolder2;
                                MusNotice musNotice2 = b().get(i2);
                                if (musNotice2 instanceof com.ss.android.ugc.aweme.notification.bean.p) {
                                    aVar = musNotice2;
                                }
                                afVar.a(aVar);
                                return;
                            case 61:
                                Objects.requireNonNull(viewHolder2, "null cannot be cast to non-null type com.ss.android.ugc.aweme.notification.vh.MusNewTcmNotificationHolder");
                                ao aoVar = (ao) viewHolder2;
                                MusNotice musNotice3 = b().get(i2);
                                if (com.ss.android.ugc.aweme.notification.redpoint.h.b().a(61) > 0) {
                                    z = false;
                                }
                                aoVar.a(musNotice3, z);
                                return;
                            case 69:
                                if (viewHolder2 instanceof o) {
                                    ((o) viewHolder2).a(b().get(i2), com.ss.android.ugc.aweme.notification.utils.f.a(Integer.valueOf(c().a())), c().f114045a);
                                    return;
                                }
                                return;
                            case 101:
                                Objects.requireNonNull(viewHolder2, "null cannot be cast to non-null type com.ss.android.ugc.aweme.notification.vh.MusNewAssistantNotificationHolder");
                                ((aj) viewHolder2).a(b().get(i2));
                                return;
                            default:
                                switch (a3) {
                                    case ABRConfig.ABR_BANDWIDTH_PARAMETER_KEY:
                                        break;
                                    case ABRConfig.ABR_DEFAULT_WIFI_BITRATE:
                                        break;
                                    case ABRConfig.ABR_STARTUP_MAX_BITRATE:
                                        Objects.requireNonNull(viewHolder2, "null cannot be cast to non-null type com.ss.android.ugc.aweme.notification.vh.MusMixedFollowRequestHolder");
                                        MusNotice musNotice4 = b().get(i2);
                                        Objects.requireNonNull(musNotice4, "null cannot be cast to non-null type com.ss.android.ugc.aweme.notification.bean.FollowRequestNotice");
                                        c();
                                        ((ah) viewHolder2).a((com.ss.android.ugc.aweme.notification.bean.d) musNotice4);
                                        return;
                                    default:
                                        switch (a3) {
                                            case 21:
                                                Objects.requireNonNull(viewHolder2, "null cannot be cast to non-null type com.ss.android.ugc.aweme.notification.vh.MTNewDuetNotificationHolder");
                                                ((s) viewHolder2).a(b().get(i2));
                                                b(viewHolder2, a3);
                                                return;
                                            case 22:
                                                Objects.requireNonNull(viewHolder2, "null cannot be cast to non-null type com.ss.android.ugc.aweme.notification.vh.MusNewCreateAwemeNotificationHolder");
                                                ((al) viewHolder2).a(b().get(i2));
                                                return;
                                            case 23:
                                                Objects.requireNonNull(viewHolder2, "null cannot be cast to non-null type com.ss.android.ugc.aweme.notification.vh.MusNewApproveFollowNotificationHolder");
                                                ((ai) viewHolder2).a(b().get(i2));
                                                return;
                                            case 24:
                                                Objects.requireNonNull(viewHolder2, "null cannot be cast to non-null type com.ss.android.ugc.aweme.notification.vh.MusFriendNotificationHolder");
                                                ((ad) viewHolder2).a(b().get(i2));
                                                return;
                                            default:
                                                switch (a3) {
                                                    case 999:
                                                        Objects.requireNonNull(viewHolder2, "null cannot be cast to non-null type com.ss.android.ugc.aweme.notification.vh.MTTitleHeadHolder");
                                                        MusNotice musNotice5 = b().get(i2);
                                                        Objects.requireNonNull(musNotice5, "null cannot be cast to non-null type com.ss.android.ugc.aweme.notice.repo.list.bean.NoticeTitle");
                                                        ((com.ss.android.ugc.aweme.notification.h.z) viewHolder2).a((com.ss.android.ugc.aweme.notice.repo.list.bean.i) musNotice5);
                                                        return;
                                                    case 1000:
                                                        Objects.requireNonNull(viewHolder2, "null cannot be cast to non-null type com.ss.android.ugc.aweme.notification.vh.MusTutorialVideoHolder");
                                                        aq aqVar = (aq) viewHolder2;
                                                        MusNotice musNotice6 = b().get(i2);
                                                        if (musNotice6 instanceof com.ss.android.ugc.aweme.notification.bean.t) {
                                                            aVar = musNotice6;
                                                        }
                                                        aqVar.a(aVar);
                                                        return;
                                                    case 1001:
                                                        Objects.requireNonNull(viewHolder2, "null cannot be cast to non-null type com.ss.android.ugc.aweme.notification.vh.MusNewLiveNotificationHolder");
                                                        am amVar = (am) viewHolder2;
                                                        MusNotice musNotice7 = b().get(i2);
                                                        if (musNotice7 instanceof com.ss.android.ugc.aweme.notification.bean.f) {
                                                            aVar = musNotice7;
                                                        }
                                                        amVar.a(aVar, d(), e(i2));
                                                        return;
                                                    case 1002:
                                                        Objects.requireNonNull(viewHolder2, "null cannot be cast to non-null type com.ss.android.ugc.aweme.notification.vh.MusNewCheckProfileNotificationHolder");
                                                        ((ak) viewHolder2).a(b().get(i2));
                                                        return;
                                                    case 1003:
                                                        Objects.requireNonNull(viewHolder2, "null cannot be cast to non-null type com.ss.android.ugc.aweme.notification.vh.MTCommentReplyWithVideoNotificationHolder");
                                                        ((com.ss.android.ugc.aweme.notification.h.n) viewHolder2).a(b().get(i2), com.ss.android.ugc.aweme.notification.utils.f.a(Integer.valueOf(c().a())), c().f114045a);
                                                        return;
                                                    default:
                                                        switch (a3) {
                                                            case LiveNetAdaptiveHurryTimeSetting.DEFAULT:
                                                                if (viewHolder2 instanceof au) {
                                                                    if (com.ss.android.ugc.aweme.inbox.b.b.c()) {
                                                                        string = a().getString(R.string.c1x);
                                                                    } else {
                                                                        string = a().getString(R.string.ey_);
                                                                    }
                                                                    l.b(string, "");
                                                                    ((au) viewHolder2).b(string);
                                                                    return;
                                                                }
                                                                return;
                                                            case 2001:
                                                                break;
                                                            case 2002:
                                                                if (viewHolder2 instanceof ar) {
                                                                    String string2 = a().getString(R.string.fjt);
                                                                    l.b(string2, "");
                                                                    ((ar) viewHolder2).b(string2);
                                                                    viewHolder2.itemView.setOnClickListener(new d(this));
                                                                    return;
                                                                }
                                                                return;
                                                            case 2003:
                                                                if (viewHolder2 instanceof as) {
                                                                    com.ss.android.ugc.aweme.notice.repo.list.bean.f f2 = c().f();
                                                                    if (f2 != null) {
                                                                        ((as) viewHolder2).a(f2.f112859d, f2.f112860e, f2.f112861f);
                                                                    } else {
                                                                        ((as) viewHolder2).a(R.string.djs, R.string.dk4, 2131231278);
                                                                    }
                                                                    as.b f3 = this.f113194a.f();
                                                                    if (f3 != null) {
                                                                        ((as) viewHolder2).f113576a = f3;
                                                                        return;
                                                                    }
                                                                    return;
                                                                }
                                                                return;
                                                            default:
                                                                switch (a3) {
                                                                    case 2006:
                                                                        MusNotice musNotice8 = b().get(i2);
                                                                        Objects.requireNonNull(musNotice8, "null cannot be cast to non-null type com.ss.android.ugc.aweme.notification.bean.RecommendNotice");
                                                                        q qVar = (q) musNotice8;
                                                                        Objects.requireNonNull(viewHolder2, "null cannot be cast to non-null type com.ss.android.ugc.aweme.notification.vh.RecommendAggregateViewHolder");
                                                                        ((at) viewHolder2).a(qVar.f113283c, qVar.f113284d);
                                                                        return;
                                                                    case 2007:
                                                                        Objects.requireNonNull(viewHolder2, "null cannot be cast to non-null type com.ss.android.ugc.aweme.notification.vh.ThirdPartInvitationViewHolder");
                                                                        aw awVar = (aw) viewHolder2;
                                                                        if (awVar != null) {
                                                                            awVar.c();
                                                                            return;
                                                                        }
                                                                        return;
                                                                    case 2008:
                                                                        Objects.requireNonNull(viewHolder2, "null cannot be cast to non-null type com.ss.android.ugc.aweme.notification.vh.ContactPermissionVH");
                                                                        com.ss.android.ugc.aweme.notification.h.b bVar = (com.ss.android.ugc.aweme.notification.h.b) viewHolder2;
                                                                        if (bVar != null) {
                                                                            bVar.c();
                                                                            return;
                                                                        }
                                                                        return;
                                                                    case 2009:
                                                                        Objects.requireNonNull(viewHolder2, "null cannot be cast to non-null type com.ss.android.ugc.aweme.notification.vh.MTTitleHeadHolder");
                                                                        com.ss.android.ugc.aweme.notification.h.z zVar = (com.ss.android.ugc.aweme.notification.h.z) viewHolder2;
                                                                        if (zVar != null) {
                                                                            String string3 = a().getString(R.string.cm8);
                                                                            l.b(string3, "");
                                                                            zVar.b(string3);
                                                                            return;
                                                                        }
                                                                        return;
                                                                    case 2010:
                                                                        Objects.requireNonNull(viewHolder2, "null cannot be cast to non-null type com.ss.android.ugc.aweme.notification.vh.ContactViewHolder");
                                                                        com.ss.android.ugc.aweme.notification.h.c cVar = (com.ss.android.ugc.aweme.notification.h.c) viewHolder2;
                                                                        if (cVar != null) {
                                                                            MusNotice musNotice9 = b().get(i2);
                                                                            if (musNotice9 instanceof com.ss.android.ugc.aweme.notification.bean.a) {
                                                                                aVar = musNotice9;
                                                                            }
                                                                            cVar.a(aVar);
                                                                            return;
                                                                        }
                                                                        return;
                                                                    case 2011:
                                                                        break;
                                                                    default:
                                                                        return;
                                                                }
                                                        }
                                                        if (viewHolder2 instanceof av) {
                                                            MusNotice musNotice10 = b().get(i2);
                                                            Objects.requireNonNull(musNotice10, "null cannot be cast to non-null type com.ss.android.ugc.aweme.notification.bean.RecommendNotice");
                                                            User user = ((q) musNotice10).f113282b;
                                                            av avVar = (av) viewHolder2;
                                                            avVar.a(this.f113194a.e());
                                                            avVar.a(user, a3);
                                                            return;
                                                        }
                                                        return;
                                                }
                                        }
                                }
                        }
                    } else {
                        Objects.requireNonNull(viewHolder2, "null cannot be cast to non-null type com.ss.android.ugc.aweme.notification.vh.MTBusinessAccountHolder");
                        com.ss.android.ugc.aweme.notification.h.m mVar = (com.ss.android.ugc.aweme.notification.h.m) viewHolder2;
                        MusNotice musNotice11 = b().get(i2);
                        if (com.ss.android.ugc.aweme.notification.redpoint.h.b().a(82) > 0) {
                            z = false;
                        }
                        mVar.a(musNotice11, z, i2, com.ss.android.ugc.aweme.notification.utils.f.a(Integer.valueOf(c().a())));
                        return;
                    }
                }
                Objects.requireNonNull(viewHolder2, "null cannot be cast to non-null type com.ss.android.ugc.aweme.notification.vh.MusNewTextNotificationHolder");
                ((ap) viewHolder2).a(b().get(i2));
                return;
            }
            Objects.requireNonNull(viewHolder2, "null cannot be cast to non-null type com.ss.android.ugc.aweme.notification.vh.MusNewAssistantNotificationHolder");
            ((aj) viewHolder2).a(b().get(i2));
        }
    }
}
