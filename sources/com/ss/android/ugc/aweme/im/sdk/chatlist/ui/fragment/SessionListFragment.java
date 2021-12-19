package com.ss.android.ugc.aweme.im.sdk.chatlist.ui.fragment;

import android.app.Activity;
import android.app.Dialog;
import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.text.SpannableString;
import android.text.TextPaint;
import android.text.TextUtils;
import android.text.method.LinkMovementMethod;
import android.text.style.ClickableSpan;
import android.text.style.StyleSpan;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import com.bytedance.covode.number.Covode;
import com.bytedance.frameworks.apm.trace.MethodCollector;
import com.bytedance.ies.foundation.activity.BaseActivityViewModel;
import com.bytedance.ies.foundation.fragment.BaseFragmentViewModel;
import com.bytedance.ies.im.core.api.c.a;
import com.bytedance.jedi.arch.JediViewModel;
import com.bytedance.jedi.arch.ae;
import com.bytedance.jedi.arch.af;
import com.bytedance.jedi.arch.ah;
import com.bytedance.jedi.arch.ak;
import com.bytedance.jedi.arch.al;
import com.bytedance.jedi.arch.q;
import com.bytedance.keva.Keva;
import com.bytedance.router.SmartRouter;
import com.bytedance.router.arg.RouteArgExtension;
import com.bytedance.router.arg.RouteArgInjector;
import com.bytedance.tux.status.TuxStatusView;
import com.bytedance.tux.tooltip.c;
import com.ss.android.ugc.aweme.base.utils.f;
import com.ss.android.ugc.aweme.friends.service.FriendsServiceImpl;
import com.ss.android.ugc.aweme.friends.service.IFriendsService;
import com.ss.android.ugc.aweme.im.sdk.chat.data.model.TopChatNoticeSourceType;
import com.ss.android.ugc.aweme.im.sdk.chatlist.a.b;
import com.ss.android.ugc.aweme.im.sdk.chatlist.controller.helper.SessionListNavArg;
import com.ss.android.ugc.aweme.im.sdk.chatlist.feature.recommend.c.b.b;
import com.ss.android.ugc.aweme.im.sdk.chatlist.feature.recommend.viewmodel.RecommendFriendInDMViewModel;
import com.ss.android.ugc.aweme.im.sdk.chatlist.feature.topnotice.viewmodel.SessionListTopNoticeViewModel;
import com.ss.android.ugc.aweme.im.sdk.chatlist.ui.b.a;
import com.ss.android.ugc.aweme.im.sdk.common.controller.e.l;
import com.ss.android.ugc.aweme.im.sdk.common.controller.providedservices.IMService;
import com.ss.android.ugc.aweme.im.sdk.common.ui.widget.ImTextTitleBar;
import com.ss.android.ugc.aweme.im.service.IIMService;
import com.ss.android.ugc.aweme.metrics.u;
import com.ss.android.ugc.aweme.profile.model.FollowStatus;
import com.ss.android.ugc.aweme.profile.model.User;
import com.ss.android.ugc.aweme.recommend.g;
import com.ss.android.ugc.aweme.recommend.users.IRecommendUsersService;
import com.ss.android.ugc.aweme.recommend.users.IRecommendUsersServiceImpl;
import com.ss.android.ugc.aweme.utils.da;
import com.ss.android.ugc.aweme.utils.eu;
import com.ss.android.ugc.aweme.utils.fg;
import com.ss.android.ugc.aweme.utils.fo;
import com.ss.android.ugc.aweme.utils.hl;
import com.ss.android.ugc.aweme.utils.in;
import com.zhiliaoapp.musically.R;
import h.z;
import java.util.Collection;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import kotlinx.coroutines.am;
import kotlinx.coroutines.an;
import kotlinx.coroutines.ay;
import kotlinx.coroutines.bz;
import org.greenrobot.eventbus.EventBus;
import org.greenrobot.eventbus.ThreadMode;

@com.bytedance.ies.powerpage.a.a(a = SessionListFragment$$Activity.class)
public final class SessionListFragment extends com.bytedance.ies.foundation.fragment.a implements com.bytedance.ies.powerpage.b, com.bytedance.jedi.arch.q, com.ss.android.ugc.aweme.base.a.k<User>, b.a, org.greenrobot.eventbus.i, org.greenrobot.eventbus.j {

    /* renamed from: i  reason: collision with root package name */
    public static final a f102139i = new a((byte) 0);

    /* renamed from: e  reason: collision with root package name */
    public com.ss.android.ugc.aweme.im.sdk.chatlist.ui.d.a f102140e;

    /* renamed from: f  reason: collision with root package name */
    public String f102141f = "";

    /* renamed from: g  reason: collision with root package name */
    public final SessionListTopNoticeViewModel f102142g = new SessionListTopNoticeViewModel(null, null, null, null, null, null, 63);

    /* renamed from: h  reason: collision with root package name */
    public final RecommendFriendInDMViewModel f102143h = new RecommendFriendInDMViewModel();

    /* renamed from: j  reason: collision with root package name */
    private final com.ss.android.ugc.aweme.im.sdk.chat.b.c.j f102144j = new com.ss.android.ugc.aweme.im.sdk.chat.b.c.j();

    /* renamed from: k  reason: collision with root package name */
    private final com.ss.android.ugc.aweme.im.sdk.chatlist.controller.helper.e f102145k = new com.ss.android.ugc.aweme.im.sdk.chatlist.controller.helper.e();

    /* renamed from: l  reason: collision with root package name */
    private final h.h f102146l = RouteArgExtension.INSTANCE.navArg(this);

    /* renamed from: m  reason: collision with root package name */
    private final h.h f102147m = h.i.a((h.f.a.a) n.f102159a);
    private final h.h n = h.i.a((h.f.a.a) new h(this));
    private final h.h o = h.i.a((h.f.a.a) new w(this));
    private final h.h p = h.i.a((h.f.a.a) new u(this));
    private final h.h q = h.i.a((h.f.a.a) new r(this));
    private final h.h r = h.i.a((h.f.a.a) new g(this));
    private final RecyclerView.n s = new t(this);
    private HashMap t;

    static {
        Covode.recordClassIndex(65350);
    }

    private final SessionListNavArg h() {
        return (SessionListNavArg) this.f102146l.getValue();
    }

    private final com.ss.android.ugc.aweme.im.sdk.group.a.b i() {
        return (com.ss.android.ugc.aweme.im.sdk.group.a.b) this.n.getValue();
    }

    @Override // com.bytedance.ies.foundation.fragment.a
    public final View a(int i2) {
        if (this.t == null) {
            this.t = new HashMap();
        }
        View view = (View) this.t.get(Integer.valueOf(i2));
        if (view != null) {
            return view;
        }
        View view2 = getView();
        if (view2 == null) {
            return null;
        }
        View findViewById = view2.findViewById(i2);
        this.t.put(Integer.valueOf(i2), findViewById);
        return findViewById;
    }

    @Override // com.ss.android.ugc.aweme.base.a.k
    public final void a(FollowStatus followStatus, String str, String str2) {
    }

    @Override // com.bytedance.ies.foundation.fragment.a
    public final void br_() {
        HashMap hashMap = this.t;
        if (hashMap != null) {
            hashMap.clear();
        }
    }

    @Override // com.bytedance.ies.foundation.fragment.a
    public final Keva c() {
        return (Keva) this.f102147m.getValue();
    }

    public final com.ss.android.ugc.aweme.im.sdk.chatlist.feature.topnotice.ui.a d() {
        return (com.ss.android.ugc.aweme.im.sdk.chatlist.feature.topnotice.ui.a) this.o.getValue();
    }

    public final com.ss.android.ugc.aweme.im.sdk.chatlist.ui.b.a e() {
        return (com.ss.android.ugc.aweme.im.sdk.chatlist.ui.b.a) this.p.getValue();
    }

    public final com.ss.android.ugc.aweme.im.sdk.chatlist.feature.recommend.c.a.a f() {
        return (com.ss.android.ugc.aweme.im.sdk.chatlist.feature.recommend.c.a.a) this.q.getValue();
    }

    @Override // org.greenrobot.eventbus.i
    public final Map<Integer, Object> getSubscriberEventTypes() {
        HashMap hashMap = new HashMap();
        hashMap.put(68, new org.greenrobot.eventbus.g(SessionListFragment.class, "onRefreshMessageButton", com.ss.android.ugc.aweme.im.service.b.c.class, ThreadMode.MAIN, 0, false));
        return hashMap;
    }

    @Override // com.bytedance.jedi.arch.h
    public final boolean getUniqueOnlyGlobal() {
        return true;
    }

    @Override // com.bytedance.ies.powerpage.b
    public final void onActivityResult_Activity(int i2, int i3, Intent intent) {
        com.bytedance.ies.powerpage.c.a(this, i2, i3, intent);
    }

    @Override // com.bytedance.ies.powerpage.b
    public final void onBackPressed_Activity() {
        com.bytedance.ies.powerpage.c.a(this);
    }

    @Override // com.bytedance.ies.powerpage.b
    public final void onBeforeActivityCreated(Activity activity) {
    }

    public static final class a {
        static {
            Covode.recordClassIndex(65352);
        }

        private a() {
        }

        public /* synthetic */ a(byte b2) {
            this();
        }
    }

    public static final class j extends RecyclerView.n {
        static {
            Covode.recordClassIndex(65361);
        }

        j() {
        }

        @Override // androidx.recyclerview.widget.RecyclerView.n
        public final void a(RecyclerView recyclerView, int i2) {
            h.f.b.l.d(recyclerView, "");
            super.a(recyclerView, i2);
            if (i2 == 0) {
                com.ss.android.ugc.aweme.im.sdk.common.controller.e.i.c();
            }
        }
    }

    @Override // com.bytedance.jedi.arch.v
    public final androidx.lifecycle.m getLifecycleOwner() {
        return this;
    }

    @Override // com.bytedance.jedi.arch.h
    public final com.bytedance.jedi.arch.v getLifecycleOwnerHolder() {
        return this;
    }

    /* Return type fixed from 'com.bytedance.jedi.arch.g' to match base method */
    @Override // com.bytedance.jedi.arch.ae
    public final /* bridge */ /* synthetic */ com.bytedance.jedi.arch.i getReceiver() {
        return this;
    }

    @Override // com.bytedance.jedi.arch.h
    public final ae<com.bytedance.jedi.arch.i> getReceiverHolder() {
        return this;
    }

    static final class n extends h.f.b.m implements h.f.a.a<Keva> {

        /* renamed from: a  reason: collision with root package name */
        public static final n f102159a = new n();

        static {
            Covode.recordClassIndex(65367);
        }

        n() {
            super(0);
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        @Override // h.f.a.a
        public final /* synthetic */ Keva invoke() {
            return Keva.getRepo("im_session_group_repo");
        }
    }

    @Override // androidx.fragment.app.Fragment
    public final void onResume() {
        super.onResume();
        com.ss.android.ugc.aweme.im.sdk.common.controller.utils.t.a();
    }

    static final class v implements Runnable {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ SessionListFragment f102168a;

        static {
            Covode.recordClassIndex(65378);
        }

        v(SessionListFragment sessionListFragment) {
            this.f102168a = sessionListFragment;
        }

        public static final class a implements c.AbstractC1121c {

            /* renamed from: a  reason: collision with root package name */
            final /* synthetic */ v f102169a;

            static {
                Covode.recordClassIndex(65379);
            }

            @Override // com.bytedance.tux.tooltip.c.AbstractC1121c
            public final void onShow() {
                this.f102169a.f102168a.c().storeBoolean("im_key_guide_show", true);
            }

            a(v vVar) {
                this.f102169a = vVar;
            }
        }

        public final void run() {
            if (this.f102168a.getContext() != null && (!this.f102168a.c().getBoolean("im_key_guide_show", false))) {
                Context context = this.f102168a.getContext();
                if (context == null) {
                    h.f.b.l.b();
                }
                h.f.b.l.b(context, "");
                com.bytedance.tux.tooltip.a.b.a aVar = new com.bytedance.tux.tooltip.a.b.a(context);
                ImTextTitleBar imTextTitleBar = (ImTextTitleBar) this.f102168a.a(R.id.em8);
                h.f.b.l.b(imTextTitleBar, "");
                View rightView = imTextTitleBar.getRightView();
                h.f.b.l.b(rightView, "");
                ((com.bytedance.tux.tooltip.a.b.a) aVar.b(rightView).a().a(com.bytedance.tux.tooltip.h.BOTTOM)).e(R.string.c9b).a(new a(this)).d().a();
            }
        }
    }

    static final class i implements Runnable {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ SessionListFragment f102153a;

        static {
            Covode.recordClassIndex(65360);
        }

        i(SessionListFragment sessionListFragment) {
            this.f102153a = sessionListFragment;
        }

        public final void run() {
            SessionListFragment.a(this.f102153a).a();
        }
    }

    public static final class m implements ImTextTitleBar.a {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ SessionListFragment f102158a;

        static {
            Covode.recordClassIndex(65366);
        }

        @Override // com.ss.android.ugc.aweme.im.sdk.common.ui.widget.ImTextTitleBar.a
        public final void b() {
        }

        @Override // com.ss.android.ugc.aweme.im.sdk.common.ui.widget.ImTextTitleBar.a
        public final void c() {
        }

        @Override // com.ss.android.ugc.aweme.im.sdk.common.ui.widget.ImTextTitleBar.a
        public final void a() {
            androidx.fragment.app.e activity = this.f102158a.getActivity();
            if (activity != null) {
                activity.finish();
                com.ss.android.ugc.aweme.push.a.a(activity);
            }
        }

        /* JADX WARN: Incorrect args count in method signature: ()V */
        m(SessionListFragment sessionListFragment) {
            this.f102158a = sessionListFragment;
        }

        @Override // com.ss.android.ugc.aweme.im.sdk.common.ui.widget.ImTextTitleBar.a
        public final void a(int i2) {
            SessionListFragment sessionListFragment = this.f102158a;
            IIMService createIIMServicebyMonsterPlugin = IMService.createIIMServicebyMonsterPlugin(false);
            Context requireContext = sessionListFragment.requireContext();
            h.f.b.l.b(requireContext, "");
            createIIMServicebyMonsterPlugin.enterCreateChatPage(requireContext, new Bundle());
        }
    }

    static final class r extends h.f.b.m implements h.f.a.a<com.ss.android.ugc.aweme.im.sdk.chatlist.feature.recommend.c.a.a> {
        final /* synthetic */ SessionListFragment this$0;

        static {
            Covode.recordClassIndex(65373);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        r(SessionListFragment sessionListFragment) {
            super(0);
            this.this$0 = sessionListFragment;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        @Override // h.f.a.a
        public final /* synthetic */ com.ss.android.ugc.aweme.im.sdk.chatlist.feature.recommend.c.a.a invoke() {
            return new com.ss.android.ugc.aweme.im.sdk.chatlist.feature.recommend.c.a.a(this.this$0.f102143h);
        }
    }

    static final class w extends h.f.b.m implements h.f.a.a<com.ss.android.ugc.aweme.im.sdk.chatlist.feature.topnotice.ui.a> {
        final /* synthetic */ SessionListFragment this$0;

        static {
            Covode.recordClassIndex(65380);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        w(SessionListFragment sessionListFragment) {
            super(0);
            this.this$0 = sessionListFragment;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        @Override // h.f.a.a
        public final /* synthetic */ com.ss.android.ugc.aweme.im.sdk.chatlist.feature.topnotice.ui.a invoke() {
            return new com.ss.android.ugc.aweme.im.sdk.chatlist.feature.topnotice.ui.a(TopChatNoticeSourceType.INBOX, this.this$0.f102142g);
        }
    }

    private static boolean j() {
        try {
            return f.a.f68431a.c();
        } catch (Exception unused) {
            return false;
        }
    }

    static final class h extends h.f.b.m implements h.f.a.a<com.ss.android.ugc.aweme.im.sdk.group.a.b> {
        final /* synthetic */ SessionListFragment this$0;

        static {
            Covode.recordClassIndex(65359);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        h(SessionListFragment sessionListFragment) {
            super(0);
            this.this$0 = sessionListFragment;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        @Override // h.f.a.a
        public final /* synthetic */ com.ss.android.ugc.aweme.im.sdk.group.a.b invoke() {
            androidx.fragment.app.e requireActivity = this.this$0.requireActivity();
            h.f.b.l.b(requireActivity, "");
            return new com.ss.android.ugc.aweme.im.sdk.group.a.b(requireActivity);
        }
    }

    static final class u extends h.f.b.m implements h.f.a.a<com.ss.android.ugc.aweme.im.sdk.chatlist.ui.b.a> {
        final /* synthetic */ SessionListFragment this$0;

        static {
            Covode.recordClassIndex(65377);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        u(SessionListFragment sessionListFragment) {
            super(0);
            this.this$0 = sessionListFragment;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        @Override // h.f.a.a
        public final /* synthetic */ com.ss.android.ugc.aweme.im.sdk.chatlist.ui.b.a invoke() {
            androidx.fragment.app.e requireActivity = this.this$0.requireActivity();
            h.f.b.l.b(requireActivity, "");
            return new com.ss.android.ugc.aweme.im.sdk.chatlist.ui.b.a(new com.ss.android.ugc.aweme.im.sdk.chatlist.controller.b.b(requireActivity, "chat_list", ""));
        }
    }

    private static boolean k() {
        if (com.ss.android.ugc.aweme.lancet.j.f107226e && com.ss.android.ugc.aweme.lancet.j.b() && !com.ss.android.ugc.aweme.lancet.j.c()) {
            return com.ss.android.ugc.aweme.lancet.j.f107226e;
        }
        boolean j2 = j();
        com.ss.android.ugc.aweme.lancet.j.f107226e = j2;
        return j2;
    }

    public static final class k implements fo.a {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ SessionListFragment f102154a;

        static {
            Covode.recordClassIndex(65362);
        }

        static final class a implements Runnable {

            /* renamed from: a  reason: collision with root package name */
            final /* synthetic */ com.ss.android.ugc.aweme.im.sdk.chatlist.feature.recommend.b.a.a f102155a;

            static {
                Covode.recordClassIndex(65363);
            }

            a(com.ss.android.ugc.aweme.im.sdk.chatlist.feature.recommend.b.a.a aVar) {
                this.f102155a = aVar;
            }

            public final void run() {
                IFriendsService s = FriendsServiceImpl.s();
                boolean z = true;
                if (this.f102155a.f101970c == 1) {
                    com.ss.android.ugc.aweme.im.sdk.chatlist.a.b.a("contact", s.d().c());
                    return;
                }
                com.ss.android.ugc.aweme.friends.d g2 = s.g();
                String obj = com.ss.android.ugc.aweme.im.sdk.common.controller.utils.c.b().toString();
                if (!g2.a() || !hl.a(g2.a(obj))) {
                    z = false;
                }
                com.ss.android.ugc.aweme.im.sdk.chatlist.a.b.a("fb", z);
            }
        }

        /* JADX WARN: Incorrect args count in method signature: ()V */
        k(SessionListFragment sessionListFragment) {
            this.f102154a = sessionListFragment;
        }

        @Override // com.ss.android.ugc.aweme.utils.fo.a
        public final void a(int i2, fo foVar) {
            h.f.b.l.d(foVar, "");
            T t = this.f102154a.f().f4207a.f4004f.get(i2);
            if (t != null && t.f101968a == 2) {
                foVar.a(String.valueOf(t.f101970c), new a(t));
            }
        }
    }

    public static final class l implements fo.a {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ SessionListFragment f102156a;

        static {
            Covode.recordClassIndex(65364);
        }

        static final class a implements Runnable {

            /* renamed from: a  reason: collision with root package name */
            final /* synthetic */ User f102157a;

            static {
                Covode.recordClassIndex(65365);
            }

            a(User user) {
                this.f102157a = user;
            }

            public final void run() {
                com.ss.android.ugc.aweme.metrics.u a2 = new com.ss.android.ugc.aweme.metrics.u().q("notification_page").a("message_rec");
                a2.f109596a = u.c.CARD;
                a2.f109597b = u.a.SHOW;
                a2.a(this.f102157a).s(this.f102157a.getRequestId()).f();
            }
        }

        /* JADX WARN: Incorrect args count in method signature: ()V */
        l(SessionListFragment sessionListFragment) {
            this.f102156a = sessionListFragment;
        }

        @Override // com.ss.android.ugc.aweme.utils.fo.a
        public final void a(int i2, fo foVar) {
            User user;
            h.f.b.l.d(foVar, "");
            T t = this.f102156a.f().f4207a.f4004f.get(i2);
            if (t != null && t.f101968a == 3 && (user = t.f101969b) != null) {
                String uid = user.getUid();
                h.f.b.l.b(uid, "");
                foVar.a(uid, new a(user));
            }
        }
    }

    static final class g extends h.f.b.m implements h.f.a.a<androidx.recyclerview.widget.g> {
        final /* synthetic */ SessionListFragment this$0;

        static {
            Covode.recordClassIndex(65358);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        g(SessionListFragment sessionListFragment) {
            super(0);
            this.this$0 = sessionListFragment;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        @Override // h.f.a.a
        public final /* synthetic */ androidx.recyclerview.widget.g invoke() {
            return new androidx.recyclerview.widget.g(this.this$0.d(), this.this$0.e(), this.this$0.f());
        }
    }

    @Override // com.bytedance.ies.foundation.fragment.a, androidx.fragment.app.Fragment
    public final void onDestroyView() {
        super.onDestroyView();
        this.f102144j.b();
        long c2 = this.f102144j.c();
        CharSequence b2 = com.ss.android.ugc.aweme.im.sdk.common.controller.utils.c.b();
        h.f.b.l.b(b2, "");
        String obj = b2.toString();
        androidx.c.a aVar = new androidx.c.a();
        aVar.put("user_id", obj);
        aVar.put("duration", String.valueOf(c2));
        com.ss.android.ugc.aweme.common.r.a("leave_chat_list", aVar);
        br_();
    }

    private final void l() {
        String str;
        int i2;
        String str2;
        String str3;
        Integer messageCount;
        SessionListNavArg h2 = h();
        if (h2 == null || (str = h2.getEnterFrom()) == null) {
            str = "";
        }
        SessionListNavArg h3 = h();
        if (h3 == null || (messageCount = h3.getMessageCount()) == null) {
            i2 = 0;
        } else {
            i2 = messageCount.intValue();
        }
        SessionListNavArg h4 = h();
        if (h4 == null || (str2 = h4.getEnterMethod()) == null) {
            str2 = "";
        }
        SessionListNavArg h5 = h();
        if (h5 == null || (str3 = h5.getNoticeType()) == null) {
            str3 = "";
        }
        com.ss.android.ugc.aweme.im.sdk.chatlist.a.a.a(str, i2, str2, str3);
        if (h() != null) {
            com.ss.android.ugc.aweme.im.sdk.chatlist.controller.helper.e eVar = this.f102145k;
            androidx.fragment.app.e requireActivity = requireActivity();
            h.f.b.l.b(requireActivity, "");
            eVar.a(requireActivity, h());
        }
    }

    public final void g() {
        getActivity();
        if (k()) {
            if (e().a()) {
                TuxStatusView tuxStatusView = (TuxStatusView) a(R.id.e_o);
                h.f.b.l.b(tuxStatusView, "");
                tuxStatusView.setVisibility(0);
                ((TuxStatusView) a(R.id.e_o)).a();
            }
            com.ss.android.ugc.aweme.im.sdk.common.controller.utils.t.a();
            com.ss.android.ugc.d.a.c.a(new com.ss.android.ugc.aweme.im.service.b.b());
        } else if (e().a()) {
            bz unused = kotlinx.coroutines.i.a(an.a(com.ss.android.ugc.aweme.af.a.f66269a), null, null, new s(this, null), 3);
        }
    }

    @Override // com.bytedance.ies.foundation.fragment.a, androidx.fragment.app.Fragment
    public final void onDestroy() {
        super.onDestroy();
        EventBus.a().b(this);
        com.ss.android.ugc.aweme.im.sdk.common.controller.e.i.b();
        com.ss.android.ugc.aweme.im.sdk.chat.feature.selectmsg.c.a();
        com.ss.android.ugc.aweme.im.sdk.chatlist.ui.d.a aVar = this.f102140e;
        if (aVar == null) {
            h.f.b.l.a("mSessionListView");
        }
        if (EventBus.a().a(aVar)) {
            EventBus.a().b(aVar);
        }
        com.ss.android.ugc.aweme.im.sdk.chatlist.ui.b.a aVar2 = aVar.f102107c;
        Iterator<T> it = aVar2.f102101b.iterator();
        while (it.hasNext()) {
            it.next().c();
        }
        h.a.n.a((List) aVar2.f102101b, (h.f.a.b) a.b.f102103a);
        an.b(aVar.f102105a);
        com.ss.android.ugc.aweme.im.sdk.common.controller.e.l a2 = l.a.a();
        if (a2 != null) {
            com.ss.android.ugc.aweme.im.sdk.chatlist.ui.d.a aVar3 = this.f102140e;
            if (aVar3 == null) {
                h.f.b.l.a("mSessionListView");
            }
            a2.b(aVar3);
        }
        RecyclerView recyclerView = (RecyclerView) a(R.id.dzg);
        if (recyclerView != null) {
            recyclerView.setAdapter(null);
        }
    }

    @Override // com.ss.android.ugc.aweme.im.sdk.chatlist.feature.recommend.c.b.b.a
    public final void a() {
        MethodCollector.i(5346);
        com.ss.android.ugc.aweme.im.sdk.chatlist.feature.recommend.a.a.a.b();
        if (getActivity() != null) {
            View inflate = LayoutInflater.from(getActivity()).inflate(R.layout.a4p, (ViewGroup) null);
            h.f.b.l.b(inflate, "");
            View findViewById = inflate.findViewById(R.id.f8h);
            h.f.b.l.b(findViewById, "");
            TextView textView = (TextView) findViewById;
            textView.setMovementMethod(LinkMovementMethod.getInstance());
            textView.setHighlightColor(androidx.core.content.b.c(textView.getContext(), R.color.c9));
            androidx.fragment.app.e activity = getActivity();
            if (activity == null) {
                h.f.b.l.b();
            }
            h.f.b.l.b(activity, "");
            Dialog a2 = com.ss.android.ugc.aweme.music.ui.d.a(activity, inflate, R.style.ye);
            String string = getResources().getString(R.string.cwj);
            h.f.b.l.b(string, "");
            String string2 = getResources().getString(R.string.cab, string);
            h.f.b.l.b(string2, "");
            int a3 = h.m.p.a((CharSequence) string2, string, 0, false, 6);
            int length = string.length() + a3;
            SpannableString spannableString = new SpannableString(string2);
            if (!TextUtils.isEmpty(string2) && !TextUtils.isEmpty(string) && a3 >= 0) {
                spannableString.setSpan(new q(a2, textView, this), a3, length, 34);
                spannableString.setSpan(new StyleSpan(1), a3, length, 34);
            }
            textView.setText(spannableString);
            a2.show();
        }
        MethodCollector.o(5346);
    }

    public static final class t extends RecyclerView.n {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ SessionListFragment f102167a;

        static {
            Covode.recordClassIndex(65376);
        }

        /* JADX WARN: Incorrect args count in method signature: ()V */
        t(SessionListFragment sessionListFragment) {
            this.f102167a = sessionListFragment;
        }

        @Override // androidx.recyclerview.widget.RecyclerView.n
        public final void a(RecyclerView recyclerView, int i2) {
            h.f.b.l.d(recyclerView, "");
            if (i2 == 2) {
                this.f102167a.a(recyclerView);
            } else if (i2 == 0) {
                this.f102167a.a(recyclerView);
            }
        }
    }

    static final class b<T> implements androidx.lifecycle.u {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ SessionListFragment f102148a;

        static {
            Covode.recordClassIndex(65353);
        }

        b(SessionListFragment sessionListFragment) {
            this.f102148a = sessionListFragment;
        }

        @Override // androidx.lifecycle.u
        public final /* synthetic */ void onChanged(Object obj) {
            SmartRouter.buildRoute(this.f102148a.requireContext(), "aweme://push_setting_manager").open();
        }
    }

    static final class c<T> implements androidx.lifecycle.u {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ SessionListFragment f102149a;

        static {
            Covode.recordClassIndex(65354);
        }

        c(SessionListFragment sessionListFragment) {
            this.f102149a = sessionListFragment;
        }

        @Override // androidx.lifecycle.u
        public final /* synthetic */ void onChanged(Object obj) {
            fg.b(this.f102149a.requireContext());
        }
    }

    static final class o extends h.f.b.m implements h.f.a.b<BaseActivityViewModel, z> {

        /* renamed from: a  reason: collision with root package name */
        public static final o f102160a = new o();

        static {
            Covode.recordClassIndex(65368);
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
            baseActivityViewModel2.config(AnonymousClass1.f102161a);
            return z.f158842a;
        }
    }

    static final class p extends h.f.b.m implements h.f.a.b<BaseFragmentViewModel, z> {

        /* renamed from: a  reason: collision with root package name */
        public static final p f102162a = new p();

        static {
            Covode.recordClassIndex(65370);
        }

        p() {
            super(1);
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
        @Override // h.f.a.b
        public final /* synthetic */ z invoke(BaseFragmentViewModel baseFragmentViewModel) {
            BaseFragmentViewModel baseFragmentViewModel2 = baseFragmentViewModel;
            h.f.b.l.d(baseFragmentViewModel2, "");
            baseFragmentViewModel2.config(AnonymousClass1.f102163a);
            return z.f158842a;
        }
    }

    public static final /* synthetic */ com.ss.android.ugc.aweme.im.sdk.chatlist.ui.d.a a(SessionListFragment sessionListFragment) {
        com.ss.android.ugc.aweme.im.sdk.chatlist.ui.d.a aVar = sessionListFragment.f102140e;
        if (aVar == null) {
            h.f.b.l.a("mSessionListView");
        }
        return aVar;
    }

    @Override // com.bytedance.ies.foundation.fragment.a, androidx.fragment.app.Fragment
    public final void onAttach(Context context) {
        h.f.b.l.d(context, "");
        super.onAttach(context);
        com.ss.android.ugc.aweme.im.sdk.common.controller.h.b.b.f102324a.a("chat_list");
    }

    @org.greenrobot.eventbus.r(a = ThreadMode.MAIN)
    public final void onRefreshMessageButton(com.ss.android.ugc.aweme.im.service.b.c cVar) {
        h.f.b.l.d(cVar, "");
        f().notifyDataSetChanged();
    }

    public static final class q extends ClickableSpan {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ Dialog f102164a;

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ TextView f102165b;

        /* renamed from: c  reason: collision with root package name */
        final /* synthetic */ SessionListFragment f102166c;

        static {
            Covode.recordClassIndex(65372);
        }

        public final void updateDrawState(TextPaint textPaint) {
            h.f.b.l.d(textPaint, "");
            textPaint.setColor(androidx.core.content.b.c(this.f102165b.getContext(), R.color.bx));
            textPaint.setUnderlineText(false);
        }

        public final void onClick(View view) {
            h.f.b.l.d(view, "");
            Dialog dialog = this.f102164a;
            if (dialog != null && dialog.isShowing()) {
                this.f102164a.dismiss();
            }
            SmartRouter.buildRoute(this.f102166c.getActivity(), "//privacy/suggest_account").withParam("enter_from", "message").withParam("previous_page", this.f102166c.f102141f).withParam("is_rec", 1).open();
        }

        q(Dialog dialog, TextView textView, SessionListFragment sessionListFragment) {
            this.f102164a = dialog;
            this.f102165b = textView;
            this.f102166c = sessionListFragment;
        }
    }

    public final void a(RecyclerView recyclerView) {
        int i2;
        boolean canScrollVertically = recyclerView.canScrollVertically(-1);
        View a2 = a(R.id.clt);
        h.f.b.l.b(a2, "");
        if (canScrollVertically) {
            i2 = 0;
        } else {
            i2 = 8;
        }
        a2.setVisibility(i2);
    }

    static final class d<T> implements androidx.lifecycle.u {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ SessionListFragment f102150a;

        static {
            Covode.recordClassIndex(65355);
        }

        d(SessionListFragment sessionListFragment) {
            this.f102150a = sessionListFragment;
        }

        @Override // androidx.lifecycle.u
        public final /* synthetic */ void onChanged(Object obj) {
            if (obj == com.ss.android.ugc.aweme.im.sdk.chatlist.feature.topnotice.ui.b.EmptyTopNoticeView) {
                this.f102150a.d().a(h.a.z.INSTANCE);
                return;
            }
            ((RecyclerView) this.f102150a.a(R.id.dzg)).b(0);
            this.f102150a.d().a(h.a.n.a(obj));
        }
    }

    static final class e<T> implements androidx.lifecycle.u {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ SessionListFragment f102151a;

        static {
            Covode.recordClassIndex(65356);
        }

        e(SessionListFragment sessionListFragment) {
            this.f102151a = sessionListFragment;
        }

        @Override // androidx.lifecycle.u
        public final /* synthetic */ void onChanged(Object obj) {
            Boolean bool = (Boolean) obj;
            h.f.b.l.b(bool, "");
            if (bool.booleanValue()) {
                TuxStatusView tuxStatusView = (TuxStatusView) this.f102151a.a(R.id.e_o);
                h.f.b.l.b(tuxStatusView, "");
                tuxStatusView.setVisibility(0);
                ((TuxStatusView) this.f102151a.a(R.id.e_o)).a();
                return;
            }
            SessionListFragment.a(this.f102151a).a();
        }
    }

    static final class f<T> implements androidx.lifecycle.u {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ SessionListFragment f102152a;

        static {
            Covode.recordClassIndex(65357);
        }

        f(SessionListFragment sessionListFragment) {
            this.f102152a = sessionListFragment;
        }

        @Override // androidx.lifecycle.u
        public final /* synthetic */ void onChanged(Object obj) {
            List list = (List) obj;
            SessionListFragment sessionListFragment = this.f102152a;
            h.f.b.l.b(list, "");
            List<T> g2 = h.a.n.g((Collection) list);
            if (g2.size() == 1 && g2.get(0).f101968a == 1) {
                g2.remove(0);
            }
            sessionListFragment.f().a(g2, new i(sessionListFragment));
        }
    }

    @Override // androidx.fragment.app.Fragment
    public final void onActivityCreated(Bundle bundle) {
        String str;
        super.onActivityCreated(bundle);
        b(o.f102160a);
        com.ss.android.ugc.aweme.im.sdk.common.controller.e.b.d().setupStatusBar(getActivity());
        com.ss.android.ugc.aweme.im.sdk.group.a.b i2 = i();
        SessionListNavArg h2 = h();
        if (h2 != null) {
            str = h2.getJumpedFromInviteId();
        } else {
            str = null;
        }
        i2.a(str);
    }

    @Override // com.bytedance.ies.foundation.fragment.a, androidx.fragment.app.Fragment
    public final void onCreate(Bundle bundle) {
        com.ss.android.ugc.aweme.cc.c.a("im_chat_list");
        super.onCreate(bundle);
        a(p.f102162a);
        com.bytedance.ies.im.core.api.b.a().a(a.EnumC0747a.ENTER_SESSION_LIST);
        com.ss.android.ugc.aweme.im.sdk.common.controller.e.i.a();
        l();
        EventBus.a(EventBus.a(), this);
    }

    @Override // com.bytedance.ies.powerpage.b
    public final void onNewIntent(Intent intent) {
        String str;
        androidx.fragment.app.e requireActivity = requireActivity();
        h.f.b.l.b(requireActivity, "");
        requireActivity.setIntent(intent);
        RouteArgInjector.INSTANCE.inject(this);
        l();
        com.ss.android.ugc.aweme.im.sdk.group.a.b i2 = i();
        SessionListNavArg h2 = h();
        if (h2 != null) {
            str = h2.getJumpedFromInviteId();
        } else {
            str = null;
        }
        i2.a(str);
    }

    /* access modifiers changed from: package-private */
    public static final class s extends h.c.b.a.k implements h.f.a.m<am, h.c.d<? super z>, Object> {
        int label;
        final /* synthetic */ SessionListFragment this$0;

        static {
            Covode.recordClassIndex(65374);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        s(SessionListFragment sessionListFragment, h.c.d dVar) {
            super(2, dVar);
            this.this$0 = sessionListFragment;
        }

        @Override // h.c.b.a.a
        public final h.c.d<z> create(Object obj, h.c.d<?> dVar) {
            h.f.b.l.d(dVar, "");
            return new s(this.this$0, dVar);
        }

        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object, java.lang.Object] */
        @Override // h.f.a.m
        public final Object invoke(am amVar, h.c.d<? super z> dVar) {
            return ((s) create(amVar, dVar)).invokeSuspend(z.f158842a);
        }

        @Override // h.c.b.a.a
        public final Object invokeSuspend(Object obj) {
            h.c.a.a aVar = h.c.a.a.COROUTINE_SUSPENDED;
            int i2 = this.label;
            if (i2 == 0) {
                h.r.a(obj);
                this.label = 1;
                if (ay.a(100, this) == aVar) {
                    return aVar;
                }
            } else if (i2 == 1) {
                h.r.a(obj);
            } else {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            if (!this.this$0.f33898a || !this.this$0.e().a()) {
                return z.f158842a;
            }
            TuxStatusView tuxStatusView = (TuxStatusView) this.this$0.a(R.id.e_o);
            h.f.b.l.b(tuxStatusView, "");
            tuxStatusView.setVisibility(0);
            ((TuxStatusView) this.this$0.a(R.id.e_o)).setStatus(com.ss.android.ugc.aweme.tux.a.g.a.a(new TuxStatusView.c(), new h.f.a.a<z>(this.this$0) {
                /* class com.ss.android.ugc.aweme.im.sdk.chatlist.ui.fragment.SessionListFragment.s.AnonymousClass1 */

                static {
                    Covode.recordClassIndex(65375);
                }

                /* Return type fixed from 'java.lang.Object' to match base method */
                @Override // h.f.a.a
                public final /* synthetic */ z invoke() {
                    ((SessionListFragment) this.receiver).g();
                    return z.f158842a;
                }
            }));
            new com.bytedance.tux.g.b(this.this$0).e(R.string.de8).b();
            return z.f158842a;
        }
    }

    @Override // com.bytedance.jedi.arch.h
    public final <VM1 extends JediViewModel<S1>, S1 extends af, R> R withState(VM1 vm1, h.f.a.b<? super S1, ? extends R> bVar) {
        h.f.b.l.d(vm1, "");
        h.f.b.l.d(bVar, "");
        return (R) q.a.a(vm1, bVar);
    }

    @Override // com.bytedance.ies.foundation.fragment.a, androidx.fragment.app.Fragment
    public final void onViewCreated(View view, Bundle bundle) {
        h.f.b.l.d(view, "");
        super.onViewCreated(view, bundle);
        com.ss.android.ugc.aweme.im.sdk.common.controller.h.b.b.f102324a.a(view, "chat_list");
        ((ImTextTitleBar) a(R.id.em8)).setOnTitlebarClickListener(new m(this));
        if (com.ss.android.ugc.aweme.im.sdk.common.controller.utils.i.a()) {
            ((ImTextTitleBar) a(R.id.em8)).setRightIcon(R.raw.icon_create_group);
            ((ImTextTitleBar) a(R.id.em8)).post(new v(this));
        } else {
            ((ImTextTitleBar) a(R.id.em8)).setRightIcon(R.raw.icon_plus_small);
        }
        RecyclerView recyclerView = (RecyclerView) a(R.id.dzg);
        h.f.b.l.b(recyclerView, "");
        getActivity();
        recyclerView.setLayoutManager(new LinearLayoutManager());
        ((RecyclerView) a(R.id.dzg)).setItemViewCacheSize(4);
        ((RecyclerView) a(R.id.dzg)).a(new com.ss.android.ugc.aweme.framework.b.a(getActivity()));
        ((RecyclerView) a(R.id.dzg)).a(this.s);
        f().f101972b = this;
        f().f101973c = this;
        RecyclerView recyclerView2 = (RecyclerView) a(R.id.dzg);
        h.f.b.l.b(recyclerView2, "");
        recyclerView2.setAdapter((androidx.recyclerview.widget.g) this.r.getValue());
        a(R.id.clt).setBackgroundColor(com.bytedance.ies.ugc.appcontext.d.a().getResources().getColor(R.color.b7));
        da.a.a("conversation_list").a((RecyclerView) a(R.id.dzg));
        ((RecyclerView) a(R.id.dzg)).a(new j());
        RecyclerView recyclerView3 = (RecyclerView) a(R.id.dzg);
        h.f.b.l.b(recyclerView3, "");
        new fo(recyclerView3, new k(this));
        RecyclerView recyclerView4 = (RecyclerView) a(R.id.dzg);
        h.f.b.l.b(recyclerView4, "");
        new fo(recyclerView4, new l(this));
        com.ss.android.ugc.aweme.im.sdk.chatlist.feature.recommend.c.a.a f2 = f();
        com.ss.android.ugc.aweme.im.sdk.chatlist.ui.b.a e2 = e();
        TuxStatusView tuxStatusView = (TuxStatusView) a(R.id.e_o);
        h.f.b.l.b(tuxStatusView, "");
        com.ss.android.ugc.aweme.im.sdk.chatlist.ui.d.a aVar = new com.ss.android.ugc.aweme.im.sdk.chatlist.ui.d.a(f2, e2, tuxStatusView);
        this.f102140e = aVar;
        String str = this.f102141f;
        h.f.b.l.d(str, "");
        aVar.f102106b = str;
        com.ss.android.ugc.aweme.im.sdk.common.controller.e.l a2 = l.a.a();
        if (a2 != null) {
            com.ss.android.ugc.aweme.im.sdk.chatlist.ui.d.a aVar2 = this.f102140e;
            if (aVar2 == null) {
                h.f.b.l.a("mSessionListView");
            }
            a2.a(aVar2);
        }
        g();
        this.f102143h.f101996c.observe(this, new f(this));
        this.f102143h.f101997d.observe(this, new e(this));
        this.f102142g.f102054e.observe(this, new b(this));
        this.f102142g.f102056g.observe(this, new c(this));
        this.f102142g.f102058i.observe(this, new d(this));
        this.f102143h.a();
        this.f102142g.a(com.ss.android.ugc.aweme.notice.api.b.a(99), fg.a(requireContext()));
        androidx.fragment.app.i fragmentManager = getFragmentManager();
        if (fragmentManager != null) {
            IIMService createIIMServicebyMonsterPlugin = IMService.createIIMServicebyMonsterPlugin(false);
            h.f.b.l.b(fragmentManager, "");
            createIIMServicebyMonsterPlugin.tryShowingChatPrivacyPanel("chat_list", fragmentManager, null);
        }
        if (!in.d()) {
            com.ss.android.ugc.aweme.im.service.m.a.b("AwemeImManager", "lazyFetch");
            com.ss.android.ugc.aweme.emoji.sysemoji.h.f89395e.c();
            com.ss.android.ugc.aweme.emoji.c.a.f89110a.a();
            if (!com.ss.android.ugc.aweme.im.sdk.common.controller.a.c.a()) {
                com.ss.android.ugc.aweme.emoji.systembigemoji.a.a(false);
            }
        }
        Context context = getContext();
        if (context != null) {
            com.ss.android.ugc.aweme.friends.service.a aVar3 = com.ss.android.ugc.aweme.friends.service.a.f97047a;
            h.f.b.l.b(context, "");
            aVar3.a(3, "chat_list", "auto", context);
        }
    }

    @Override // com.bytedance.jedi.arch.h
    public final <S extends af> f.a.b.b subscribe(JediViewModel<S> jediViewModel, ah<S> ahVar, h.f.a.m<? super com.bytedance.jedi.arch.i, ? super S, z> mVar) {
        h.f.b.l.d(jediViewModel, "");
        h.f.b.l.d(ahVar, "");
        h.f.b.l.d(mVar, "");
        return q.a.a(this, jediViewModel, ahVar, mVar);
    }

    @Override // androidx.fragment.app.Fragment
    public final View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        h.f.b.l.d(layoutInflater, "");
        com.ss.android.ugc.aweme.im.sdk.chat.b.c.j jVar = this.f102144j;
        jVar.f100218a = 0;
        jVar.f100219b = 0;
        this.f102144j.a();
        return com.a.a(layoutInflater, R.layout.a4v, viewGroup, false);
    }

    /* JADX DEBUG: Method arguments types fixed to match base method, original types: [int, java.lang.Object, int] */
    @Override // com.ss.android.ugc.aweme.base.a.k
    public final /* synthetic */ void a(int i2, User user, int i3) {
        u.a aVar;
        User user2 = user;
        com.ss.android.ugc.aweme.im.sdk.chatlist.feature.recommend.a.a.a.b();
        if (user2 != null) {
            switch (i2) {
                case com.bytedance.nita.c.a.f41622a:
                    b.d dVar = b.d.f101864a;
                    h.f.b.l.d(dVar, "");
                    androidx.c.a aVar2 = new androidx.c.a();
                    aVar2.put("enter_from", "message_rec");
                    dVar.invoke("follow", aVar2);
                    com.ss.android.ugc.aweme.metrics.u a2 = new com.ss.android.ugc.aweme.metrics.u().q("notification_page").a("message_rec");
                    a2.f109596a = u.c.CARD;
                    if (user2.getFollowStatus() == 0) {
                        aVar = u.a.FOLLOW;
                    } else {
                        aVar = u.a.FOLLOW_CANCEL;
                    }
                    a2.f109597b = aVar;
                    a2.a(user2).s(user2.getRequestId()).f();
                    return;
                case 101:
                    com.ss.android.ugc.aweme.metrics.u a3 = new com.ss.android.ugc.aweme.metrics.u().q("notification_page").a("message_rec");
                    a3.f109596a = u.c.CARD;
                    a3.f109597b = u.a.ENTER_PROFILE;
                    a3.a(user2).s(user2.getRequestId()).f();
                    com.ss.android.ugc.aweme.app.f.d a4 = new com.ss.android.ugc.aweme.app.f.d().a("enter_from", "message_rec");
                    eu.a(a4, user2);
                    com.ss.android.ugc.aweme.common.r.a("enter_personal_detail", a4.f66730a);
                    SmartRouter.buildRoute(getContext(), "aweme://user/profile/" + user2.getUid()).withParam("sec_user_id", user2.getSecUid()).withParam("from_recommend_card", 1).withParam("enter_from", "message_rec").withParam("recommend_from_type", "list").withParam("extra_mutual_relation", user2.getMutualStruct()).withParam("extra_from_mutual", true).withParam("recommend_enter_profile_params", new com.ss.android.ugc.aweme.recommend.g("message_rec", "notification_page", u.c.CARD, user2.getRecType(), g.a.a(user2), user2.getUid(), null, null, user2.getRequestId(), null, user2.getFriendTypeStr(), user2.getSocialInfo())).open();
                    return;
                case 102:
                    com.ss.android.ugc.aweme.metrics.u a5 = new com.ss.android.ugc.aweme.metrics.u().q("notification_page").a("message_rec");
                    a5.f109596a = u.c.CARD;
                    a5.f109597b = u.a.CLOSE;
                    a5.a(user2).s(user2.getRequestId()).f();
                    RecommendFriendInDMViewModel recommendFriendInDMViewModel = this.f102143h;
                    h.f.b.l.d(user2, "");
                    IRecommendUsersService j2 = IRecommendUsersServiceImpl.j();
                    if (j2 != null) {
                        String uid = user2.getUid();
                        h.f.b.l.b(uid, "");
                        j2.a(uid, user2.getSecUid());
                    }
                    List<com.ss.android.ugc.aweme.im.sdk.chatlist.feature.recommend.b.a.a> value = recommendFriendInDMViewModel.f101996c.getValue();
                    if (value != null) {
                        h.a.n.a((List) value, (h.f.a.b) new RecommendFriendInDMViewModel.a(user2));
                    }
                    recommendFriendInDMViewModel.f101996c.postValue(value);
                    return;
                default:
                    return;
            }
        }
    }

    @Override // com.bytedance.jedi.arch.h
    public final <S extends af, A> f.a.b.b selectSubscribe(JediViewModel<S> jediViewModel, h.k.k<S, ? extends A> kVar, ah<ak<A>> ahVar, h.f.a.m<? super com.bytedance.jedi.arch.i, ? super A, z> mVar) {
        h.f.b.l.d(jediViewModel, "");
        h.f.b.l.d(kVar, "");
        h.f.b.l.d(ahVar, "");
        h.f.b.l.d(mVar, "");
        return q.a.a(this, jediViewModel, kVar, ahVar, mVar);
    }

    @Override // com.bytedance.jedi.arch.h
    public final <S extends af, A, B> f.a.b.b selectSubscribe(JediViewModel<S> jediViewModel, h.k.k<S, ? extends A> kVar, h.k.k<S, ? extends B> kVar2, ah<al<A, B>> ahVar, h.f.a.q<? super com.bytedance.jedi.arch.i, ? super A, ? super B, z> qVar) {
        h.f.b.l.d(jediViewModel, "");
        h.f.b.l.d(kVar, "");
        h.f.b.l.d(kVar2, "");
        h.f.b.l.d(ahVar, "");
        h.f.b.l.d(qVar, "");
        return q.a.a(this, jediViewModel, kVar, kVar2, ahVar, qVar);
    }

    @Override // com.bytedance.jedi.arch.h
    public final <S extends af, T> f.a.b.b asyncSubscribe(JediViewModel<S> jediViewModel, h.k.k<S, ? extends com.bytedance.jedi.arch.a<? extends T>> kVar, ah<ak<com.bytedance.jedi.arch.a<T>>> ahVar, h.f.a.m<? super com.bytedance.jedi.arch.i, ? super Throwable, z> mVar, h.f.a.b<? super com.bytedance.jedi.arch.i, z> bVar, h.f.a.m<? super com.bytedance.jedi.arch.i, ? super T, z> mVar2) {
        h.f.b.l.d(jediViewModel, "");
        h.f.b.l.d(kVar, "");
        h.f.b.l.d(ahVar, "");
        return q.a.a(this, jediViewModel, kVar, ahVar, mVar, bVar, mVar2);
    }

    @Override // com.bytedance.jedi.arch.h
    public final <S extends af, A, B, C> f.a.b.b selectSubscribe(JediViewModel<S> jediViewModel, h.k.k<S, ? extends A> kVar, h.k.k<S, ? extends B> kVar2, h.k.k<S, ? extends C> kVar3, ah<com.bytedance.jedi.arch.am<A, B, C>> ahVar, h.f.a.r<? super com.bytedance.jedi.arch.i, ? super A, ? super B, ? super C, z> rVar) {
        h.f.b.l.d(jediViewModel, "");
        h.f.b.l.d(kVar, "");
        h.f.b.l.d(kVar2, "");
        h.f.b.l.d(kVar3, "");
        h.f.b.l.d(ahVar, "");
        h.f.b.l.d(rVar, "");
        return q.a.a(this, jediViewModel, kVar, kVar2, kVar3, ahVar, rVar);
    }

    @Override // com.bytedance.jedi.arch.h
    public final <S extends af, A, B, C, D> f.a.b.b selectSubscribe(JediViewModel<S> jediViewModel, h.k.k<S, ? extends A> kVar, h.k.k<S, ? extends B> kVar2, h.k.k<S, ? extends C> kVar3, h.k.k<S, ? extends D> kVar4, ah<com.bytedance.jedi.arch.an<A, B, C, D>> ahVar, h.f.a.s<? super com.bytedance.jedi.arch.i, ? super A, ? super B, ? super C, ? super D, z> sVar) {
        h.f.b.l.d(jediViewModel, "");
        h.f.b.l.d(kVar, "");
        h.f.b.l.d(kVar2, "");
        h.f.b.l.d(kVar3, "");
        h.f.b.l.d(kVar4, "");
        h.f.b.l.d(ahVar, "");
        h.f.b.l.d(sVar, "");
        return q.a.a(this, jediViewModel, kVar, kVar2, kVar3, kVar4, ahVar, sVar);
    }
}
