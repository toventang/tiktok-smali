package com.ss.android.ugc.aweme.friends.a;

import android.text.TextUtils;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.TextView;
import androidx.recyclerview.widget.RecyclerView;
import com.bytedance.apm.agent.v2.instrumentation.ClickAgent;
import com.bytedance.covode.number.Covode;
import com.bytedance.frameworks.apm.trace.MethodCollector;
import com.bytedance.ies.abmock.SettingsManager;
import com.bytedance.tux.icon.TuxIconView;
import com.ss.android.ugc.aweme.IAccountUserService;
import com.ss.android.ugc.aweme.base.ui.AvatarImageWithVerify;
import com.ss.android.ugc.aweme.common.MobClick;
import com.ss.android.ugc.aweme.common.r;
import com.ss.android.ugc.aweme.feed.ac;
import com.ss.android.ugc.aweme.friends.c.e;
import com.ss.android.ugc.aweme.friends.model.AtFriendsViewModel;
import com.ss.android.ugc.aweme.friends.model.HotSoonRelationNotice;
import com.ss.android.ugc.aweme.im.service.model.IMUser;
import com.ss.android.ugc.aweme.profile.ai;
import com.ss.android.ugc.aweme.profile.model.User;
import com.ss.android.ugc.aweme.search.service.ISearchUserService;
import com.ss.android.ugc.aweme.search.service.SearchUserService;
import com.ss.android.ugc.aweme.utils.eu;
import com.ss.android.ugc.aweme.utils.gg;
import com.zhiliaoapp.musically.R;
import h.f.b.l;
import h.f.b.m;
import h.h;
import h.i;
import java.util.ArrayList;
import java.util.List;

public final class a extends RecyclerView.a<com.bytedance.ies.dmt.ui.a.a<IMUser>> {

    /* renamed from: g  reason: collision with root package name */
    public static final b f96694g = new b((byte) 0);

    /* renamed from: a  reason: collision with root package name */
    public int f96695a;

    /* renamed from: b  reason: collision with root package name */
    public List<? extends IMUser> f96696b;

    /* renamed from: c  reason: collision with root package name */
    public List<String> f96697c = new ArrayList();

    /* renamed from: d  reason: collision with root package name */
    public AtFriendsViewModel.Companion.AllFriends f96698d;

    /* renamed from: e  reason: collision with root package name */
    public int f96699e = -1;

    /* renamed from: f  reason: collision with root package name */
    final h f96700f = i.a((h.f.a.a) d.f96717a);

    static {
        Covode.recordClassIndex(61387);
    }

    /* Return type fixed from 'androidx.recyclerview.widget.RecyclerView$ViewHolder' to match base method */
    @Override // androidx.recyclerview.widget.RecyclerView.a
    public final /* synthetic */ com.bytedance.ies.dmt.ui.a.a<IMUser> onCreateViewHolder(ViewGroup viewGroup, int i2) {
        return a(this, viewGroup, i2);
    }

    public static final class b {
        static {
            Covode.recordClassIndex(61390);
        }

        private b() {
        }

        public /* synthetic */ b(byte b2) {
            this();
        }

        public static User a(IMUser iMUser) {
            l.d(iMUser, "");
            User user = new User();
            user.setUid(iMUser.getUid());
            user.setNickname(iMUser.getNickName());
            user.setSignature(iMUser.getSignature());
            user.setAvatarThumb(iMUser.getAvatarThumb());
            user.setUniqueId(iMUser.getUniqueId());
            user.setShortId(iMUser.getShortId());
            user.setFollowStatus(iMUser.getFollowStatus());
            user.setCustomVerify(iMUser.getCustomVerify());
            user.setEnterpriseVerifyReason(iMUser.getEnterpriseVerifyReason());
            user.setVerificationType(iMUser.getVerificationType());
            user.setRemarkName(iMUser.getRemarkName());
            user.isBlock = iMUser.isBlock();
            user.setSecUid(iMUser.getSecUid());
            user.setRegion("");
            return user;
        }
    }

    static final class d extends m implements h.f.a.a<ISearchUserService> {

        /* renamed from: a  reason: collision with root package name */
        public static final d f96717a = new d();

        static {
            Covode.recordClassIndex(61392);
        }

        d() {
            super(0);
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        @Override // h.f.a.a
        public final /* synthetic */ ISearchUserService invoke() {
            return SearchUserService.b();
        }
    }

    @Override // androidx.recyclerview.widget.RecyclerView.a
    public final int getItemCount() {
        List<? extends IMUser> list = this.f96696b;
        if (list != null) {
            return list.size();
        }
        return 0;
    }

    public static final class c extends com.bytedance.ies.dmt.ui.a.a<IMUser> {

        /* renamed from: a  reason: collision with root package name */
        private final TextView f96716a;

        static {
            Covode.recordClassIndex(61391);
        }

        @Override // com.bytedance.ies.dmt.ui.a.a
        public final void a() {
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public c(View view) {
            super(view);
            l.d(view, "");
            View findViewById = view.findViewById(R.id.f3p);
            l.b(findViewById, "");
            this.f96716a = (TextView) findViewById;
        }

        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object, int] */
        @Override // com.bytedance.ies.dmt.ui.a.a
        public final /* synthetic */ void a(IMUser iMUser, int i2) {
            String notice;
            IMUser iMUser2 = iMUser;
            l.d(iMUser2, "");
            if (!(iMUser2 instanceof HotSoonRelationNotice)) {
                iMUser2 = null;
            }
            HotSoonRelationNotice hotSoonRelationNotice = (HotSoonRelationNotice) iMUser2;
            if (hotSoonRelationNotice != null && (notice = hotSoonRelationNotice.getNotice()) != null) {
                this.f96716a.setText(notice);
            }
        }
    }

    @Override // androidx.recyclerview.widget.RecyclerView.a
    public final int getItemViewType(int i2) {
        Object obj;
        List<? extends IMUser> list = this.f96696b;
        if (list != null) {
            obj = list.get(i2);
        } else {
            obj = null;
        }
        if (obj instanceof HotSoonRelationNotice) {
            return 1;
        }
        if (this.f96695a == 1) {
            return 2;
        }
        return 0;
    }

    /* renamed from: com.ss.android.ugc.aweme.friends.a.a$a  reason: collision with other inner class name */
    public final class C2330a extends com.bytedance.ies.dmt.ui.a.a<IMUser> {

        /* renamed from: a  reason: collision with root package name */
        public TextView f96701a;

        /* renamed from: b  reason: collision with root package name */
        public TextView f96702b;

        /* renamed from: c  reason: collision with root package name */
        public AvatarImageWithVerify f96703c;

        /* renamed from: d  reason: collision with root package name */
        public TextView f96704d;

        /* renamed from: e  reason: collision with root package name */
        public TextView f96705e;

        /* renamed from: f  reason: collision with root package name */
        public TuxIconView f96706f;

        /* renamed from: g  reason: collision with root package name */
        public FrameLayout f96707g;

        /* renamed from: h  reason: collision with root package name */
        public int f96708h = -1;

        /* renamed from: i  reason: collision with root package name */
        public final View f96709i;

        /* renamed from: j  reason: collision with root package name */
        public final a f96710j;

        /* renamed from: k  reason: collision with root package name */
        final /* synthetic */ a f96711k;

        static {
            Covode.recordClassIndex(61388);
        }

        @Override // com.bytedance.ies.dmt.ui.a.a
        public final void a() {
        }

        /* renamed from: com.ss.android.ugc.aweme.friends.a.a$a$a  reason: collision with other inner class name */
        static final class View$OnClickListenerC2331a implements View.OnClickListener {

            /* renamed from: a  reason: collision with root package name */
            final /* synthetic */ C2330a f96712a;

            /* renamed from: b  reason: collision with root package name */
            final /* synthetic */ IMUser f96713b;

            /* renamed from: c  reason: collision with root package name */
            final /* synthetic */ User f96714c;

            /* renamed from: d  reason: collision with root package name */
            final /* synthetic */ String f96715d;

            static {
                Covode.recordClassIndex(61389);
            }

            View$OnClickListenerC2331a(C2330a aVar, IMUser iMUser, User user, String str) {
                this.f96712a = aVar;
                this.f96713b = iMUser;
                this.f96714c = user;
                this.f96715d = str;
            }

            public final void onClick(View view) {
                ClickAgent.onClick(view);
                if (this.f96712a.f96708h == 0) {
                    com.ss.android.ugc.aweme.app.f.d a2 = new com.ss.android.ugc.aweme.app.f.d().a("search_keyword", "").a("log_pb", ac.a.f91473a.c(this.f96713b.getUid())).a("to_user_id", this.f96713b.getUid()).a("relation_tag", this.f96713b.getFollowStatus());
                    l.b(a2, "");
                    r.b("add_video_at", com.ss.android.ugc.aweme.metrics.ac.a(eu.a(a2, this.f96714c).f66730a));
                }
                if (!this.f96713b.isMentionEnabled()) {
                    View view2 = this.f96712a.itemView;
                    l.b(view2, "");
                    new com.bytedance.tux.g.b(view2).e(R.string.d3f).b();
                } else {
                    IAccountUserService g2 = com.ss.android.ugc.aweme.account.b.g();
                    l.b(g2, "");
                    if (!TextUtils.equals(g2.getCurUserId(), this.f96713b.getUid())) {
                        r.onEvent(MobClick.obtain().setEventName("at_friend").setLabelName("friend_list").setValue(this.f96713b.getUid()));
                        com.ss.android.ugc.d.a.c.a(new e(this.f96714c));
                    } else {
                        View view3 = this.f96712a.itemView;
                        l.b(view3, "");
                        new com.bytedance.tux.g.b(view3).e(R.string.dh8).b();
                    }
                }
                r.a("tag_mention_head_click", new com.ss.android.ugc.aweme.app.f.d().a("previous_page", "video_edit_page").a("to_user_id", this.f96713b.getUid()).a("user_type", this.f96715d).a("search_keyword", "").a("function", "mention").a("is_valid", String.valueOf(this.f96713b.isMentionEnabled() ? 1 : 0)).a("click_type", "choose").a("enter_from", "video_post_page").f66730a);
            }
        }

        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object, int] */
        /* JADX WARNING: Code restructure failed: missing block: B:64:0x0211, code lost:
            if (android.text.TextUtils.equals(r0, r10) == false) goto L_0x0213;
         */
        @Override // com.bytedance.ies.dmt.ui.a.a
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public final /* synthetic */ void a(com.ss.android.ugc.aweme.im.service.model.IMUser r13, int r14) {
            /*
            // Method dump skipped, instructions count: 656
            */
            throw new UnsupportedOperationException("Method not decompiled: com.ss.android.ugc.aweme.friends.a.a.C2330a.a(java.lang.Object, int):void");
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C2330a(a aVar, View view, a aVar2) {
            super(view);
            l.d(view, "");
            l.d(aVar2, "");
            this.f96711k = aVar;
            this.f96709i = view;
            this.f96710j = aVar2;
            View findViewById = view.findViewById(R.id.dwp);
            l.b(findViewById, "");
            this.f96701a = (TextView) findViewById;
            View findViewById2 = view.findViewById(R.id.bnt);
            l.b(findViewById2, "");
            this.f96702b = (TextView) findViewById2;
            View findViewById3 = view.findViewById(R.id.or);
            l.b(findViewById3, "");
            this.f96703c = (AvatarImageWithVerify) findViewById3;
            View findViewById4 = view.findViewById(R.id.cs_);
            l.b(findViewById4, "");
            this.f96704d = (TextView) findViewById4;
            View findViewById5 = view.findViewById(R.id.ak7);
            l.b(findViewById5, "");
            this.f96705e = (TextView) findViewById5;
            View findViewById6 = view.findViewById(R.id.dkc);
            l.b(findViewById6, "");
            this.f96706f = (TuxIconView) findViewById6;
            View findViewById7 = view.findViewById(R.id.brw);
            l.b(findViewById7, "");
            this.f96707g = (FrameLayout) findViewById7;
        }
    }

    /* JADX DEBUG: Method arguments types fixed to match base method, original types: [androidx.recyclerview.widget.RecyclerView$ViewHolder, int] */
    /* JADX DEBUG: Multi-variable search result rejected for r3v0, resolved type: com.bytedance.ies.dmt.ui.a.a<com.ss.android.ugc.aweme.im.service.model.IMUser> */
    /* JADX WARN: Multi-variable type inference failed */
    @Override // androidx.recyclerview.widget.RecyclerView.a
    public final /* synthetic */ void onBindViewHolder(com.bytedance.ies.dmt.ui.a.a<IMUser> aVar, int i2) {
        com.bytedance.ies.dmt.ui.a.a aVar2;
        com.bytedance.ies.dmt.ui.a.a<IMUser> aVar3 = aVar;
        l.d(aVar3, "");
        if (!(aVar3 instanceof C2330a)) {
            aVar2 = null;
        } else {
            aVar2 = aVar3;
        }
        C2330a aVar4 = (C2330a) aVar2;
        if (aVar4 != null) {
            aVar4.f96708h = this.f96699e;
        }
        List<? extends IMUser> list = this.f96696b;
        if (list == null) {
            l.b();
        }
        aVar3.a(list.get(i2), i2);
    }

    private static RecyclerView.ViewHolder a(a aVar, ViewGroup viewGroup, int i2) {
        RecyclerView.ViewHolder viewHolder;
        MethodCollector.i(2166);
        l.d(viewGroup, "");
        boolean z = true;
        if (i2 == 1) {
            View a2 = com.a.a(LayoutInflater.from(viewGroup.getContext()), R.layout.a_o, viewGroup, false);
            l.b(a2, "");
            viewHolder = new c(a2);
        } else if (i2 == 2) {
            View a3 = com.a.a(LayoutInflater.from(viewGroup.getContext()), R.layout.a9n, viewGroup, false);
            l.b(a3, "");
            viewHolder = new C2330a(aVar, a3, aVar);
        } else {
            View a4 = com.a.a(LayoutInflater.from(viewGroup.getContext()), R.layout.a9l, viewGroup, false);
            l.b(a4, "");
            viewHolder = new C2330a(aVar, a4, aVar);
        }
        try {
            if (viewHolder.itemView.getParent() != null) {
                try {
                    z = SettingsManager.a().a("catch_onCreateViewHolder_crash", true);
                } catch (Exception unused) {
                }
                if (z) {
                    StringBuffer stringBuffer = new StringBuffer();
                    stringBuffer.append("onCreateViewHolder getParent() != null crash hook, holder ").append(viewHolder.getClass().getName()).append(" parent ").append(viewGroup.getClass().getName()).append(" viewType ").append(i2);
                    com.bytedance.services.apm.api.a.a(stringBuffer.toString());
                    ViewGroup viewGroup2 = (ViewGroup) viewHolder.itemView.getParent();
                    if (viewGroup2 != null) {
                        viewGroup2.removeView(viewHolder.itemView);
                    }
                }
            }
        } catch (Exception e2) {
            ai.a(e2);
            com.ss.android.ugc.aweme.framework.a.a.a(e2);
        }
        gg.f143005a = viewHolder.getClass().getName();
        MethodCollector.o(2166);
        return viewHolder;
    }
}
