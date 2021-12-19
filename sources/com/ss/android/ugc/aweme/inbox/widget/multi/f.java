package com.ss.android.ugc.aweme.inbox.widget.multi;

import android.content.Context;
import android.os.Message;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.fragment.app.Fragment;
import androidx.recyclerview.widget.RecyclerView;
import com.bytedance.apm.agent.v2.instrumentation.ClickAgent;
import com.bytedance.common.utility.collection.WeakHandler;
import com.bytedance.covode.number.Covode;
import com.bytedance.ies.dmt.ui.d.a;
import com.bytedance.keva.Keva;
import com.bytedance.tux.sheet.a.a;
import com.ss.android.ugc.aweme.commercialize.log.LogHelperImpl;
import com.ss.android.ugc.aweme.common.r;
import com.ss.android.ugc.aweme.inbox.t;
import com.ss.android.ugc.aweme.notice.api.helper.LogHelper;
import com.ss.android.ugc.aweme.notice.repo.list.bean.FollowPageData;
import com.ss.android.ugc.aweme.notice.repo.list.bean.FollowRequestData;
import com.ss.android.ugc.aweme.notice.repo.list.bean.MusNotice;
import com.ss.android.ugc.aweme.notification.api.MusNotificationApiManager;
import com.ss.android.ugc.aweme.notification.followrequest.api.FollowRequestApiManager;
import com.ss.android.ugc.aweme.notification.h.aa;
import com.ss.android.ugc.aweme.notification.h.ar;
import com.ss.android.ugc.aweme.notification.h.x;
import com.ss.android.ugc.aweme.notification.vm.NotificationVM;
import com.ss.android.ugc.aweme.profile.model.User;
import com.zhiliaoapp.musically.R;
import h.a.n;
import h.f.b.l;
import h.f.b.m;
import h.z;
import java.util.ArrayList;
import java.util.Collection;
import java.util.LinkedHashMap;
import java.util.List;

public final class f extends com.ss.android.ugc.aweme.common.a.f<FollowPageData> implements com.ss.android.ugc.aweme.notification.adapter.j, com.ss.android.ugc.aweme.notification.h.e {

    /* renamed from: a  reason: collision with root package name */
    public final com.ss.android.ugc.aweme.notification.utils.c f104455a = new com.ss.android.ugc.aweme.notification.utils.c();

    /* renamed from: b  reason: collision with root package name */
    public final NotificationVM f104456b;

    /* renamed from: c  reason: collision with root package name */
    boolean f104457c;

    /* renamed from: d  reason: collision with root package name */
    boolean f104458d;

    /* renamed from: e  reason: collision with root package name */
    FollowPageData f104459e;

    /* renamed from: f  reason: collision with root package name */
    List<FollowPageData> f104460f;

    /* renamed from: g  reason: collision with root package name */
    public final Fragment f104461g;

    /* renamed from: h  reason: collision with root package name */
    private final h.h f104462h = h.i.a((h.f.a.a) d.f104469a);

    /* renamed from: i  reason: collision with root package name */
    private final h.h f104463i = h.i.a((h.f.a.a) a.f104466a);

    /* renamed from: j  reason: collision with root package name */
    private final h.h f104464j = h.i.a((h.f.a.a) b.f104467a);

    /* renamed from: k  reason: collision with root package name */
    private final h.h f104465k = h.i.a((h.f.a.a) c.f104468a);
    private FollowPageData w;
    private int x;

    public enum e {
        UNKNOWN,
        EMPTY,
        SOME;

        static {
            Covode.recordClassIndex(66894);
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.inbox.widget.multi.f$f  reason: collision with other inner class name */
    public enum EnumC2659f {
        INVALID,
        FOLLOW_REQUEST,
        FOLLOWER,
        EMPTY,
        COLLAPSE,
        TEMPLATE;

        static {
            Covode.recordClassIndex(66895);
        }
    }

    /* access modifiers changed from: package-private */
    public static final class j implements WeakHandler.IHandler {

        /* renamed from: a  reason: collision with root package name */
        public static final j f104475a = new j();

        static {
            Covode.recordClassIndex(66899);
        }

        j() {
        }

        @Override // com.bytedance.common.utility.collection.WeakHandler.IHandler
        public final void handleMsg(Message message) {
        }
    }

    static {
        Covode.recordClassIndex(66889);
    }

    static final class a extends m implements h.f.a.a<String> {

        /* renamed from: a  reason: collision with root package name */
        public static final a f104466a = new a();

        static {
            Covode.recordClassIndex(66890);
        }

        a() {
            super(0);
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        @Override // h.f.a.a
        public final /* synthetic */ String invoke() {
            return com.ss.android.ugc.aweme.base.utils.h.b(R.string.fjt);
        }
    }

    static final class b extends m implements h.f.a.a<Integer> {

        /* renamed from: a  reason: collision with root package name */
        public static final b f104467a = new b();

        static {
            Covode.recordClassIndex(66891);
        }

        b() {
            super(0);
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        @Override // h.f.a.a
        public final /* synthetic */ Integer invoke() {
            return Integer.valueOf(t.a().f104288c);
        }
    }

    static final class c extends m implements h.f.a.a<Long> {

        /* renamed from: a  reason: collision with root package name */
        public static final c f104468a = new c();

        static {
            Covode.recordClassIndex(66892);
        }

        c() {
            super(0);
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        @Override // h.f.a.a
        public final /* synthetic */ Long invoke() {
            return Long.valueOf(((long) t.a().f104289d) * 3600000);
        }
    }

    static final class d extends m implements h.f.a.a<String> {

        /* renamed from: a  reason: collision with root package name */
        public static final d f104469a = new d();

        static {
            Covode.recordClassIndex(66893);
        }

        d() {
            super(0);
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        @Override // h.f.a.a
        public final /* synthetic */ String invoke() {
            return com.ss.android.ugc.aweme.base.utils.h.b(R.string.flb) + " ";
        }
    }

    private final void m() {
        this.f104458d = false;
        List<FollowPageData> list = this.f104460f;
        if (list != null) {
            e().addAll(list);
            d(this.f104457c);
            notifyDataSetChanged();
        }
    }

    public final void l() {
        List e2 = e();
        if (e2 == null || e2.isEmpty()) {
            b_(n.c(this.w));
        } else {
            e().clear();
            e().add(this.w);
        }
        notifyDataSetChanged();
    }

    static final class h extends m implements h.f.a.b<Integer, z> {
        final /* synthetic */ f this$0;

        static {
            Covode.recordClassIndex(66897);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        h(f fVar) {
            super(1);
            this.this$0 = fVar;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
        @Override // h.f.a.b
        public final /* synthetic */ z invoke(Integer num) {
            this.this$0.b(num.intValue());
            return z.f158842a;
        }
    }

    @Override // androidx.recyclerview.widget.RecyclerView.a, com.ss.android.ugc.aweme.common.a.h
    public final void onViewAttachedToWindow(RecyclerView.ViewHolder viewHolder) {
        l.d(viewHolder, "");
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

    /* access modifiers changed from: package-private */
    public static final class i<TTaskResult, TContinuationResult> implements b.g {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ f f104473a;

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ Context f104474b;

        static {
            Covode.recordClassIndex(66898);
        }

        i(f fVar, Context context) {
            this.f104473a = fVar;
            this.f104474b = context;
        }

        @Override // b.g
        public final /* synthetic */ Object then(b.i iVar) {
            l.b(iVar, "");
            if (iVar.e() != null) {
                new com.bytedance.tux.g.b(this.f104473a.f104461g).a(this.f104474b.getString(R.string.cml)).b();
            }
            return z.f158842a;
        }
    }

    static final class k implements View.OnClickListener {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ f f104476a;

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ int f104477b;

        static {
            Covode.recordClassIndex(66900);
        }

        k(f fVar, int i2) {
            this.f104476a = fVar;
            this.f104477b = i2;
        }

        public final void onClick(View view) {
            ClickAgent.onClick(view);
            this.f104476a.b(this.f104477b);
            androidx.fragment.app.i fragmentManager = this.f104476a.f104461g.getFragmentManager();
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

    @Override // com.ss.android.ugc.aweme.common.a.l
    public final int c(int i2) {
        FollowPageData followPageData = (FollowPageData) e().get(i2);
        MusNotice notice = followPageData.getNotice();
        if (notice != null && notice.templateNotice != null) {
            return EnumC2659f.TEMPLATE.ordinal();
        }
        if (followPageData.getNotice() != null) {
            return EnumC2659f.FOLLOWER.ordinal();
        }
        if (followPageData.getFollowRequest() != null) {
            return EnumC2659f.FOLLOW_REQUEST.ordinal();
        }
        return followPageData.getType();
    }

    @Override // com.ss.android.ugc.aweme.notification.adapter.j
    public final void d(int i2) {
        if (i2 >= 0 && i2 < e().size()) {
            e().remove(i2);
            if (e().isEmpty()) {
                notifyDataSetChanged();
            } else {
                notifyItemRemoved(i2);
            }
        }
    }

    static final class g implements View.OnClickListener {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ f f104472a;

        static {
            Covode.recordClassIndex(66896);
        }

        g(f fVar) {
            this.f104472a = fVar;
        }

        public final void onClick(View view) {
            List<FollowPageData> list;
            ClickAgent.onClick(view);
            Keva b2 = com.ss.android.ugc.aweme.inbox.k.b();
            b2.storeInt("expand_times", b2.getInt("expand_times", 0) + 1);
            LinkedHashMap linkedHashMap = new LinkedHashMap();
            linkedHashMap.put("enter_from", "notification_page");
            r.a("click_see_all_followers", linkedHashMap);
            f fVar = this.f104472a;
            fVar.f104458d = false;
            int indexOf = fVar.e().indexOf(fVar.f104459e);
            if (indexOf != -1 && (list = fVar.f104460f) != null) {
                fVar.e().remove(indexOf);
                fVar.e().addAll(indexOf, list);
                fVar.d(fVar.f104457c);
                fVar.notifyDataSetChanged();
            }
        }
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public f(Fragment fragment) {
        super((byte) 0);
        l.d(fragment, "");
        this.f104461g = fragment;
        this.f104456b = NotificationVM.a.a(fragment);
        this.w = new FollowPageData(EnumC2659f.EMPTY.ordinal(), null, null, 0, 14, null);
        this.f104458d = true;
        this.f104459e = new FollowPageData(EnumC2659f.COLLAPSE.ordinal(), null, null, 0, 14, null);
    }

    public final void b(int i2) {
        User user;
        Context context = this.f104461g.getContext();
        if (context != null) {
            l.b(context, "");
            int size = this.f76354l.size();
            if (size > 0 && i2 >= 0 && i2 < size) {
                FollowPageData followPageData = (FollowPageData) this.f76354l.get(i2);
                MusNotice notice = followPageData.getNotice();
                if (notice != null) {
                    MusNotificationApiManager.a(notice.nid).a(new i(this, context), b.i.f4826c, null);
                }
                FollowRequestData followRequest = followPageData.getFollowRequest();
                if (!(followRequest == null || (user = followRequest.getUser()) == null)) {
                    FollowRequestApiManager.a(new WeakHandler(j.f104475a), user.getUid());
                    LogHelper a2 = LogHelperImpl.a();
                    String uid = user.getUid();
                    l.b(uid, "");
                    a2.d("follow_request_page", uid);
                }
                this.f76354l.remove(i2);
                notifyItemRemoved(i2);
            }
            List e2 = e();
            if (e2 == null || e2.isEmpty()) {
                l();
            }
        }
    }

    /* JADX DEBUG: Multi-variable search result rejected for r3v0, resolved type: com.bytedance.tux.sheet.a.a$e[] */
    /* JADX WARN: Multi-variable type inference failed */
    @Override // com.ss.android.ugc.aweme.notification.h.e
    public final void a(int i2) {
        if (i2 < e().size()) {
            FollowPageData followPageData = (FollowPageData) e().get(i2);
            if ((followPageData.getNotice() != null || followPageData.getFollowRequest() != null) && this.f104461g.getContext() != null) {
                k kVar = new k(this, i2);
                new a.b().a(new a.e().a(R.string.b5g).b(1).a(kVar)).b().show(this.f104461g.getFragmentManager(), "DELETE_NOTICE_ACTION_SHEET_TAG");
            }
        }
    }

    public final void a(e eVar) {
        List<FollowPageData> list;
        List e2;
        l.d(eVar, "");
        List e3 = e();
        if (e3 != null && !e3.isEmpty()) {
            int i2 = g.f104478a[eVar.ordinal()];
            if (i2 == 1) {
                m();
            } else if (i2 == 2 && this.f104458d && (list = this.f104460f) != null && !list.isEmpty() && (e2 = e()) != null) {
                e2.add(this.f104459e);
                notifyDataSetChanged();
            }
        }
    }

    private static View a(int i2, ViewGroup viewGroup) {
        View a2 = com.a.a(LayoutInflater.from(viewGroup.getContext()), i2, viewGroup, false);
        l.b(a2, "");
        return a2;
    }

    private final void a(List<FollowPageData> list, List<FollowPageData> list2) {
        int i2;
        int size = list.size() - 1;
        long currentTimeMillis = System.currentTimeMillis();
        int i3 = -1;
        int i4 = 0;
        for (T t : list) {
            int i5 = i4 + 1;
            if (i4 < 0) {
                n.a();
            }
            if (currentTimeMillis - (t.getCreateTime() * 1000) <= ((Number) this.f104465k.getValue()).longValue()) {
                i3 = i5;
            }
            i4 = i5;
        }
        if (i3 < 0) {
            i3 = ((Number) this.f104464j.getValue()).intValue();
        }
        if (i3 >= size) {
            this.f104460f = null;
            return;
        }
        List<FollowPageData> g2 = n.g((Collection) list.subList(i3, size));
        this.f104460f = g2;
        if (g2 != null) {
            i2 = g2.size();
        } else {
            i2 = 0;
        }
        this.x = i2;
        list2.clear();
        list2.addAll(list.subList(0, i3));
    }

    @Override // com.ss.android.ugc.aweme.common.a.l
    public final RecyclerView.ViewHolder a(ViewGroup viewGroup, int i2) {
        com.ss.android.ugc.aweme.notification.h.a aaVar;
        l.d(viewGroup, "");
        if (i2 == EnumC2659f.FOLLOW_REQUEST.ordinal()) {
            aaVar = new com.ss.android.ugc.aweme.notification.followrequest.b.b(a((int) R.layout.kf, viewGroup), this, this.f104455a);
            aaVar.a(this);
        } else if (i2 == EnumC2659f.TEMPLATE.ordinal()) {
            aaVar = new x(a((int) R.layout.l5, viewGroup), new h(this));
            aaVar.a(this);
        } else if (i2 == EnumC2659f.FOLLOWER.ordinal()) {
            aaVar = new com.ss.android.ugc.aweme.notification.h.t(a((int) R.layout.kx, viewGroup));
            aaVar.a(this);
        } else if (i2 == EnumC2659f.EMPTY.ordinal()) {
            aaVar = new com.ss.android.ugc.aweme.notification.h.a(a((int) R.layout.k7, viewGroup));
        } else if (i2 == EnumC2659f.COLLAPSE.ordinal()) {
            aaVar = new ar(a((int) R.layout.kc, viewGroup));
        } else {
            aaVar = new aa(a((int) R.layout.la, viewGroup));
        }
        aaVar.f113487h = this.f104456b;
        return aaVar;
    }

    @Override // com.ss.android.ugc.aweme.common.a.l
    public final void a(RecyclerView.ViewHolder viewHolder, int i2) {
        MusNotice notice;
        FollowPageData followPageData = (FollowPageData) e().get(i2);
        com.ss.android.ugc.aweme.notification.h.k kVar = null;
        if (!(followPageData == null || (notice = followPageData.getNotice()) == null)) {
            if (viewHolder instanceof com.ss.android.ugc.aweme.notification.h.k) {
                kVar = viewHolder;
            }
            com.ss.android.ugc.aweme.notification.h.k kVar2 = kVar;
            if (kVar2 != null) {
                kVar2.a(notice, i2);
            }
        }
        if (viewHolder instanceof x) {
            MusNotice notice2 = ((FollowPageData) e().get(i2)).getNotice();
            if (notice2 != null) {
                ((x) viewHolder).a(notice2, i2, "", "", "notification_page", false, (List<? extends com.ss.android.ugc.aweme.notification.view.template.c>) h.a.z.INSTANCE);
            }
        } else if (viewHolder instanceof com.ss.android.ugc.aweme.notification.h.t) {
            MusNotice notice3 = ((FollowPageData) e().get(i2)).getNotice();
            if (notice3 != null) {
                ((com.ss.android.ugc.aweme.notification.h.t) viewHolder).a(notice3, "", "notification_page");
            }
        } else if (viewHolder instanceof com.ss.android.ugc.aweme.notification.followrequest.b.b) {
            FollowRequestData followRequest = ((FollowPageData) e().get(i2)).getFollowRequest();
            if (followRequest != null && followRequest.getUser() != null) {
                followRequest.getUser().setFollowFrom(29);
                User user = followRequest.getUser();
                a.C0730a b2 = new a.C0730a().b((String) this.f104462h.getValue());
                com.ss.android.ugc.aweme.notification.followrequest.b.b bVar = (com.ss.android.ugc.aweme.notification.followrequest.b.b) viewHolder;
                String a2 = com.ss.android.ugc.aweme.notification.h.k.a(followRequest.getCreateTime(), bVar.f113647i);
                l.b(a2, "");
                user.setFollowFromMsg(b2.a(a2).f33382a.toString());
                bVar.a(followRequest.getUser(), "notification_page");
            }
        } else if (viewHolder instanceof ar) {
            ((ar) viewHolder).b((String) this.f104463i.getValue());
            viewHolder.itemView.setOnClickListener(new g(this));
        }
    }

    public final void a(List<FollowPageData> list, boolean z, e eVar) {
        l.d(eVar, "");
        this.f104457c = z;
        ArrayList arrayList = new ArrayList();
        if (list != null) {
            arrayList.addAll(list);
            if (this.f104458d && eVar != e.EMPTY) {
                if (!com.ss.android.ugc.aweme.inbox.k.a()) {
                    this.f104458d = false;
                } else {
                    a(list, arrayList);
                    if (eVar == e.SOME && this.x > 0) {
                        arrayList.add(this.f104459e);
                    }
                }
            }
        }
        super.b_(arrayList);
    }
}
