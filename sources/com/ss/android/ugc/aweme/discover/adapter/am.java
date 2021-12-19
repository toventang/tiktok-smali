package com.ss.android.ugc.aweme.discover.adapter;

import android.content.Context;
import android.graphics.drawable.Drawable;
import android.text.Spannable;
import android.text.SpannableStringBuilder;
import android.text.TextUtils;
import android.text.style.ForegroundColorSpan;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewStub;
import android.widget.TextView;
import androidx.lifecycle.u;
import com.bytedance.android.livesdkapi.depend.model.live.RoomInfo;
import com.bytedance.android.livesdkapi.session.EnterRoomConfig;
import com.bytedance.apm.agent.v2.instrumentation.ClickAgent;
import com.bytedance.covode.number.Covode;
import com.bytedance.ies.dmt.ui.widget.tablayout.DmtTabLayout;
import com.bytedance.tux.input.TuxTextView;
import com.ss.android.ugc.aweme.discover.a.ao;
import com.ss.android.ugc.aweme.discover.a.aq;
import com.ss.android.ugc.aweme.discover.helper.ah;
import com.ss.android.ugc.aweme.discover.helper.f;
import com.ss.android.ugc.aweme.discover.model.Position;
import com.ss.android.ugc.aweme.discover.model.SearchUser;
import com.ss.android.ugc.aweme.feed.AvatarImageWithLive;
import com.ss.android.ugc.aweme.feed.model.Aweme;
import com.ss.android.ugc.aweme.feed.ui.LiveCircleView;
import com.ss.android.ugc.aweme.follow.NewFollowButton;
import com.ss.android.ugc.aweme.follow.widet.a;
import com.ss.android.ugc.aweme.friends.model.MutualStruct;
import com.ss.android.ugc.aweme.im.sdk.common.controller.providedservices.IMService;
import com.ss.android.ugc.aweme.im.service.IIMService;
import com.ss.android.ugc.aweme.im.service.model.IMUser;
import com.ss.android.ugc.aweme.im.service.model.a;
import com.ss.android.ugc.aweme.live.ILiveOuterService;
import com.ss.android.ugc.aweme.live.LiveOuterService;
import com.ss.android.ugc.aweme.music.model.Music;
import com.ss.android.ugc.aweme.profile.f.aj;
import com.ss.android.ugc.aweme.profile.model.BlockStatus;
import com.ss.android.ugc.aweme.profile.model.FollowStatus;
import com.ss.android.ugc.aweme.profile.model.FollowStatusEvent;
import com.ss.android.ugc.aweme.profile.model.User;
import com.ss.android.ugc.aweme.search.ecom.ProductListView;
import com.ss.android.ugc.aweme.search.k.at;
import com.ss.android.ugc.aweme.search.k.au;
import com.ss.android.ugc.aweme.search.k.r;
import com.ss.android.ugc.aweme.services.BusinessComponentServiceUtils;
import com.ss.android.ugc.aweme.userservice.UserService;
import com.ss.android.ugc.aweme.userservice.api.IUserService;
import com.ss.android.ugc.aweme.utils.UserVerify;
import com.ss.android.ugc.aweme.utils.hl;
import com.ss.android.ugc.aweme.utils.io;
import com.ss.android.ugc.aweme.views.MutualRelationView;
import com.ss.android.ugc.aweme.views.RtlViewPager;
import com.ss.android.ugc.aweme.views.SuggestUserAvatarView;
import com.zhiliaoapp.musically.R;
import h.a.ag;
import h.p;
import h.v;
import h.z;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Objects;
import java.util.concurrent.Callable;
import org.greenrobot.eventbus.EventBus;
import org.greenrobot.eventbus.ThreadMode;

public final class am extends b implements View.OnClickListener, u<FollowStatus>, org.greenrobot.eventbus.i, org.greenrobot.eventbus.j {
    public static final c A = new c((byte) 0);
    private TextView B;
    private TuxTextView C;
    private MutualRelationView D;
    private ViewStub E;
    private com.ss.android.ugc.aweme.following.ui.adapter.d F;
    private final h.h G;
    private final h.h H;
    private final h.h I;

    /* renamed from: a  reason: collision with root package name */
    AvatarImageWithLive f80398a;

    /* renamed from: b  reason: collision with root package name */
    LiveCircleView f80399b;

    /* renamed from: c  reason: collision with root package name */
    public NewFollowButton f80400c;

    /* renamed from: d  reason: collision with root package name */
    TextView f80401d;

    /* renamed from: e  reason: collision with root package name */
    TextView f80402e;

    /* renamed from: f  reason: collision with root package name */
    ViewStub f80403f;

    /* renamed from: g  reason: collision with root package name */
    ViewStub f80404g;

    /* renamed from: h  reason: collision with root package name */
    public RtlViewPager f80405h;

    /* renamed from: i  reason: collision with root package name */
    ViewGroup f80406i;

    /* renamed from: m  reason: collision with root package name */
    com.ss.android.ugc.aweme.search.q.b f80407m;
    com.ss.android.ugc.aweme.search.q.c n;
    public ProductListView o;
    ViewStub p;
    com.ss.android.ugc.aweme.feed.ui.d q;
    com.ss.android.ugc.aweme.e.b r;
    public User s;
    public SearchUser t;
    com.ss.android.ugc.aweme.follow.widet.a u;
    com.ss.android.ugc.aweme.discover.helper.f v;
    public User w;
    public an x;
    final u<BlockStatus> y;
    final h.f.a.a<z> z;

    static {
        Covode.recordClassIndex(50033);
    }

    /* access modifiers changed from: package-private */
    public final IUserService a() {
        return (IUserService) this.G.getValue();
    }

    /* access modifiers changed from: package-private */
    public final com.ss.android.ugc.aweme.search.ecom.g b() {
        return (com.ss.android.ugc.aweme.search.ecom.g) this.H.getValue();
    }

    /* access modifiers changed from: package-private */
    public final com.ss.android.ugc.aweme.search.ecom.f c() {
        return (com.ss.android.ugc.aweme.search.ecom.f) this.I.getValue();
    }

    @Override // org.greenrobot.eventbus.i
    public final Map<Integer, Object> getSubscriberEventTypes() {
        HashMap hashMap = new HashMap();
        hashMap.put(179, new org.greenrobot.eventbus.g(am.class, "onFollowStatusEvent", FollowStatusEvent.class, ThreadMode.POSTING, 0, false));
        return hashMap;
    }

    public static final class c {
        static {
            Covode.recordClassIndex(50037);
        }

        private c() {
        }

        public /* synthetic */ c(byte b2) {
            this();
        }

        public static am a(ViewGroup viewGroup, com.ss.android.ugc.aweme.following.ui.adapter.d dVar) {
            h.f.b.l.d(viewGroup, "");
            h.f.b.l.d(dVar, "");
            return new am(com.ss.android.ugc.aweme.search.l.m.a(viewGroup, R.layout.awa), dVar);
        }
    }

    static final class n extends h.f.b.m implements h.f.a.a<IUserService> {

        /* renamed from: a  reason: collision with root package name */
        public static final n f80419a = new n();

        static {
            Covode.recordClassIndex(50058);
        }

        n() {
            super(0);
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        @Override // h.f.a.a
        public final /* synthetic */ IUserService invoke() {
            return UserService.d();
        }
    }

    static final class d implements Runnable {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ am f80411a;

        static {
            Covode.recordClassIndex(50038);
        }

        d(am amVar) {
            this.f80411a = amVar;
        }

        public final void run() {
            b.i.b(new i(this.f80411a), b.i.f4824a);
        }
    }

    public static final class h implements f.c {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ am f80415a;

        static {
            Covode.recordClassIndex(50042);
        }

        @Override // com.ss.android.ugc.aweme.discover.helper.f.c
        public final List<com.ss.android.ugc.aweme.search.d> a() {
            User user = this.f80415a.s;
            if (user != null) {
                return user.getHighlightInfoList();
            }
            return null;
        }

        /* JADX WARN: Incorrect args count in method signature: ()V */
        h(am amVar) {
            this.f80415a = amVar;
        }

        @Override // com.ss.android.ugc.aweme.discover.helper.f.c
        public final List<Object> a(String str, String str2, Position position) {
            h.f.b.l.d(str, "");
            h.f.b.l.d(str2, "");
            h.f.b.l.d(position, "");
            int hashCode = str2.hashCode();
            if (hashCode != -980688722) {
                if (hashCode != -980394840 || !str2.equals("search_user_name")) {
                    return null;
                }
            } else if (!str2.equals("search_user_desc")) {
                return null;
            }
            View view = this.f80415a.itemView;
            h.f.b.l.b(view, "");
            return h.a.n.b(new ForegroundColorSpan(androidx.core.content.b.c(view.getContext(), R.color.bx)), new com.ss.android.ugc.aweme.discover.m.a(com.bytedance.ies.dmt.ui.widget.util.a.a().a(com.bytedance.ies.dmt.ui.widget.util.d.f33801g)));
        }
    }

    static final class j implements Runnable {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ am f80417a;

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ FollowStatusEvent f80418b;

        static {
            Covode.recordClassIndex(50044);
        }

        j(am amVar, FollowStatusEvent followStatusEvent) {
            this.f80417a = amVar;
            this.f80418b = followStatusEvent;
        }

        public final void run() {
            FollowStatus followStatus;
            am amVar = this.f80417a;
            FollowStatusEvent followStatusEvent = this.f80418b;
            if (followStatusEvent != null) {
                followStatus = followStatusEvent.status;
            } else {
                followStatus = null;
            }
            amVar.onChanged(followStatus);
        }
    }

    static final class l extends h.f.b.m implements h.f.a.a<z> {
        final /* synthetic */ am this$0;

        static {
            Covode.recordClassIndex(50051);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        l(am amVar) {
            super(0);
            this.this$0 = amVar;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        @Override // h.f.a.a
        public final /* synthetic */ z invoke() {
            am.a(this.this$0, "8", null, 2);
            return z.f158842a;
        }
    }

    /* access modifiers changed from: protected */
    @Override // com.ss.android.ugc.aweme.discover.adapter.b
    public final void E() {
        b().a().clear();
    }

    public static final class a implements a.AbstractC2320a {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ am f80409a;

        static {
            Covode.recordClassIndex(50035);
        }

        @Override // com.ss.android.ugc.aweme.follow.widet.a.AbstractC2320a
        public final void a() {
            User user = this.f80409a.s;
            if (user != null) {
                com.ss.android.ugc.aweme.discover.mixfeed.b.c.a("search_popup_confirm_show", this.f80409a.F(), user).f();
            }
        }

        @Override // com.ss.android.ugc.aweme.follow.widet.a.AbstractC2320a
        public final void b() {
            User user = this.f80409a.s;
            if (user != null) {
                com.ss.android.ugc.aweme.discover.mixfeed.b.c.a("search_popup_confirm_click", this.f80409a.F(), user).c("button_type", "click_back").f();
            }
        }

        @Override // com.ss.android.ugc.aweme.follow.widet.a.AbstractC2320a
        public final void c() {
            User user = this.f80409a.s;
            if (user != null) {
                com.ss.android.ugc.aweme.discover.mixfeed.b.c.a("search_popup_confirm_click", this.f80409a.F(), user).c("button_type", "click_unfollow").f();
            }
        }

        a(am amVar) {
            this.f80409a = amVar;
        }
    }

    static final class k extends h.f.b.m implements h.f.a.a<com.ss.android.ugc.aweme.search.ecom.f> {
        final /* synthetic */ am this$0;

        static {
            Covode.recordClassIndex(50045);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        k(am amVar) {
            super(0);
            this.this$0 = amVar;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        @Override // h.f.a.a
        public final /* synthetic */ com.ss.android.ugc.aweme.search.ecom.f invoke() {
            return new com.ss.android.ugc.aweme.search.ecom.f(new h.f.a.a<Context>(this) {
                /* class com.ss.android.ugc.aweme.discover.adapter.am.k.AnonymousClass1 */
                final /* synthetic */ k this$0;

                static {
                    Covode.recordClassIndex(50046);
                }

                {
                    this.this$0 = r2;
                }

                /* Return type fixed from 'java.lang.Object' to match base method */
                @Override // h.f.a.a
                public final /* synthetic */ Context invoke() {
                    return this.this$0.this$0.G();
                }
            }, new h.f.a.a<User>(this) {
                /* class com.ss.android.ugc.aweme.discover.adapter.am.k.AnonymousClass2 */
                final /* synthetic */ k this$0;

                static {
                    Covode.recordClassIndex(50047);
                }

                {
                    this.this$0 = r2;
                }

                /* Return type fixed from 'java.lang.Object' to match base method */
                @Override // h.f.a.a
                public final /* bridge */ /* synthetic */ User invoke() {
                    return this.this$0.this$0.s;
                }
            }, new h.f.a.a<r>(this) {
                /* class com.ss.android.ugc.aweme.discover.adapter.am.k.AnonymousClass3 */
                final /* synthetic */ k this$0;

                static {
                    Covode.recordClassIndex(50048);
                }

                {
                    this.this$0 = r2;
                }

                /* Return type fixed from 'java.lang.Object' to match base method */
                @Override // h.f.a.a
                public final /* synthetic */ r invoke() {
                    return this.this$0.this$0.F();
                }
            }, new h.f.a.a<String>(this) {
                /* class com.ss.android.ugc.aweme.discover.adapter.am.k.AnonymousClass4 */
                final /* synthetic */ k this$0;

                static {
                    Covode.recordClassIndex(50049);
                }

                {
                    this.this$0 = r2;
                }

                /* Return type fixed from 'java.lang.Object' to match base method */
                @Override // h.f.a.a
                public final /* synthetic */ String invoke() {
                    return this.this$0.this$0.h();
                }
            }, new h.f.a.a<String>(this) {
                /* class com.ss.android.ugc.aweme.discover.adapter.am.k.AnonymousClass5 */
                final /* synthetic */ k this$0;

                static {
                    Covode.recordClassIndex(50050);
                }

                {
                    this.this$0 = r2;
                }

                /* Return type fixed from 'java.lang.Object' to match base method */
                @Override // h.f.a.a
                public final /* synthetic */ String invoke() {
                    return this.this$0.this$0.j();
                }
            });
        }
    }

    static final class m extends h.f.b.m implements h.f.a.a<com.ss.android.ugc.aweme.search.ecom.g> {
        final /* synthetic */ am this$0;

        static {
            Covode.recordClassIndex(50052);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        m(am amVar) {
            super(0);
            this.this$0 = amVar;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        @Override // h.f.a.a
        public final /* synthetic */ com.ss.android.ugc.aweme.search.ecom.g invoke() {
            return new com.ss.android.ugc.aweme.search.ecom.g(new h.f.a.a<User>(this) {
                /* class com.ss.android.ugc.aweme.discover.adapter.am.m.AnonymousClass1 */
                final /* synthetic */ m this$0;

                static {
                    Covode.recordClassIndex(50053);
                }

                {
                    this.this$0 = r2;
                }

                /* Return type fixed from 'java.lang.Object' to match base method */
                @Override // h.f.a.a
                public final /* bridge */ /* synthetic */ User invoke() {
                    return this.this$0.this$0.s;
                }
            }, new h.f.a.a<r>(this) {
                /* class com.ss.android.ugc.aweme.discover.adapter.am.m.AnonymousClass2 */
                final /* synthetic */ m this$0;

                static {
                    Covode.recordClassIndex(50054);
                }

                {
                    this.this$0 = r2;
                }

                /* Return type fixed from 'java.lang.Object' to match base method */
                @Override // h.f.a.a
                public final /* synthetic */ r invoke() {
                    return this.this$0.this$0.F();
                }
            }, new h.f.a.a<String>(this) {
                /* class com.ss.android.ugc.aweme.discover.adapter.am.m.AnonymousClass3 */
                final /* synthetic */ m this$0;

                static {
                    Covode.recordClassIndex(50055);
                }

                {
                    this.this$0 = r2;
                }

                /* Return type fixed from 'java.lang.Object' to match base method */
                @Override // h.f.a.a
                public final /* synthetic */ String invoke() {
                    return this.this$0.this$0.h();
                }
            }, new h.f.a.a<String>(this) {
                /* class com.ss.android.ugc.aweme.discover.adapter.am.m.AnonymousClass4 */
                final /* synthetic */ m this$0;

                static {
                    Covode.recordClassIndex(50056);
                }

                {
                    this.this$0 = r2;
                }

                /* Return type fixed from 'java.lang.Object' to match base method */
                @Override // h.f.a.a
                public final /* synthetic */ String invoke() {
                    return this.this$0.this$0.j();
                }
            }, new h.f.a.a<Boolean>(this) {
                /* class com.ss.android.ugc.aweme.discover.adapter.am.m.AnonymousClass5 */
                final /* synthetic */ m this$0;

                static {
                    Covode.recordClassIndex(50057);
                }

                {
                    this.this$0 = r2;
                }

                /* Return type fixed from 'java.lang.Object' to match base method */
                @Override // h.f.a.a
                public final /* synthetic */ Boolean invoke() {
                    boolean z;
                    boolean z2;
                    RtlViewPager rtlViewPager = this.this$0.this$0.f80405h;
                    boolean z3 = false;
                    if (rtlViewPager == null || rtlViewPager.getCurrentItem() != 1) {
                        z = false;
                    } else {
                        z = true;
                    }
                    ProductListView productListView = this.this$0.this$0.o;
                    if (productListView == null || productListView.getVisibility() != 0) {
                        z2 = false;
                    } else {
                        z2 = true;
                    }
                    if (z || z2) {
                        z3 = true;
                    }
                    return Boolean.valueOf(z3);
                }
            });
        }
    }

    static boolean g() {
        try {
            ILiveOuterService s2 = LiveOuterService.s();
            h.f.b.l.b(s2, "");
            com.ss.android.ugc.aweme.live.c d2 = s2.d();
            h.f.b.l.b(d2, "");
            return d2.s().a();
        } catch (Exception unused) {
            return false;
        }
    }

    public final String i() {
        User user;
        String uid;
        String str = F().B;
        if (str.length() > 0) {
            return str;
        }
        SearchUser searchUser = this.t;
        if (searchUser == null || (user = searchUser.user) == null || (uid = user.getUid()) == null) {
            return "";
        }
        return uid;
    }

    public final String j() {
        if (F().C != null) {
            return "1";
        }
        SearchUser searchUser = this.t;
        if (searchUser == null || !searchUser.isAladdin()) {
            return "0";
        }
        return "1";
    }

    private final String m() {
        User user = this.s;
        if (user == null) {
            return "";
        }
        String a2 = com.ss.android.ugc.aweme.i18n.b.a((long) user.getFollowerCount());
        String quantityString = G().getResources().getQuantityString(R.plurals.ho, user.getFollowerCount(), a2);
        h.f.b.l.b(quantityString, "");
        return quantityString;
    }

    private final String n() {
        User user = this.s;
        if (user == null) {
            return "";
        }
        String a2 = com.ss.android.ugc.aweme.i18n.b.a((long) user.getAwemeCount());
        String quantityString = G().getResources().getQuantityString(R.plurals.hu, user.getAwemeCount(), a2);
        h.f.b.l.b(quantityString, "");
        return quantityString;
    }

    /* access modifiers changed from: package-private */
    public final String f() {
        try {
            ILiveOuterService s2 = LiveOuterService.s();
            h.f.b.l.b(s2, "");
            com.ss.android.ugc.aweme.live.c d2 = s2.d();
            h.f.b.l.b(d2, "");
            com.bytedance.android.livesdkapi.depend.d.f r2 = d2.r();
            View view = this.itemView;
            h.f.b.l.b(view, "");
            return r2.a(view.getContext());
        } catch (Exception unused) {
            return null;
        }
    }

    public final String h() {
        List<Aweme> list;
        List<Music> list2;
        if (!TextUtils.isEmpty(F().A)) {
            return F().A;
        }
        SearchUser searchUser = this.t;
        if (searchUser != null && (list2 = searchUser.musicCards) != null && (!list2.isEmpty())) {
            return "musician";
        }
        SearchUser searchUser2 = this.t;
        if (searchUser2 == null || (list = searchUser2.awemeCards) == null || !(!list.isEmpty())) {
            return "person";
        }
        return "hot_user";
    }

    private final void l() {
        User user;
        if (this.x == an.SHOW_BLOCK && com.ss.android.ugc.aweme.discover.a.e.a()) {
            User user2 = this.s;
            if ((user2 != null && user2.getBlockStatus() == 1) || ((user = this.s) != null && user.getBlockStatus() == 4)) {
                TuxTextView tuxTextView = this.C;
                if (tuxTextView == null) {
                    h.f.b.l.a("descText");
                }
                Drawable e2 = aq.e();
                if (e2 != null) {
                    int b2 = aq.b();
                    int c2 = aq.c();
                    com.bytedance.tux.h.i.a((View) tuxTextView, Integer.valueOf(b2), Integer.valueOf(c2), Integer.valueOf(b2), Integer.valueOf(c2), false, 16);
                    tuxTextView.setBackground(e2);
                }
                Integer d2 = aq.d();
                if (d2 != null) {
                    tuxTextView.setTextColor(d2.intValue());
                }
                tuxTextView.setText(R.string.fj9);
                tuxTextView.setTuxFont(72);
            }
        }
    }

    private final boolean k() {
        User user;
        MutualStruct mutualStruct;
        if (this.x != an.EMPTY || (user = this.s) == null) {
            return false;
        }
        if ((user.getFollowStatus() != 0 && com.ss.android.ugc.aweme.discover.a.l.a()) || (mutualStruct = user.getMutualStruct()) == null || mutualStruct.getTotal() <= 0) {
            return false;
        }
        TuxTextView tuxTextView = this.C;
        if (tuxTextView == null) {
            h.f.b.l.a("descText");
        }
        tuxTextView.setVisibility(8);
        MutualRelationView mutualRelationView = this.D;
        if (mutualRelationView == null) {
            h.f.b.l.a("mutualRelationView");
        }
        mutualRelationView.setVisibility(0);
        mutualRelationView.setTextColor(androidx.core.content.b.c(mutualRelationView.getContext(), R.color.c5));
        mutualRelationView.setTuxTextSize(61);
        int i2 = aq.a().f80162a;
        if (i2 == 2 || i2 == 3) {
            if (this.D == null) {
                h.f.b.l.a("mutualRelationView");
            }
            h.f.b.l.b(mutualStruct, "");
            h.f.b.l.d(mutualStruct, "");
            if (!SuggestUserAvatarView.a(mutualStruct)) {
                Drawable e2 = aq.e();
                if (e2 != null) {
                    int b2 = aq.b();
                    int c2 = aq.c();
                    mutualRelationView.a(Integer.valueOf(b2), Integer.valueOf(c2), Integer.valueOf(b2), Integer.valueOf(c2));
                    mutualRelationView.setRootBackground(e2);
                }
                Integer d2 = aq.d();
                if (d2 != null) {
                    mutualRelationView.setTextColor(d2.intValue());
                }
                mutualRelationView.b(androidx.core.content.b.c(mutualRelationView.getContext(), R.color.f159928l), androidx.core.content.b.c(mutualRelationView.getContext(), R.color.bx));
                mutualRelationView.a(((Number) aq.f80166b.getValue()).intValue(), ((Number) aq.f80167c.getValue()).intValue());
                mutualRelationView.b();
                mutualRelationView.setTuxTextSize(72);
            }
        }
        mutualRelationView.a(mutualStruct, 4);
        return true;
    }

    /* access modifiers changed from: package-private */
    public final void d() {
        SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder();
        User user = this.s;
        if (user != null) {
            String searchUserName = user.getSearchUserName();
            if (searchUserName == null || !hl.a(searchUserName)) {
                searchUserName = "";
            }
            spannableStringBuilder.append((CharSequence) searchUserName);
            com.ss.android.ugc.aweme.discover.helper.f fVar = this.v;
            if (fVar != null) {
                fVar.a((com.ss.android.ugc.aweme.discover.helper.f) spannableStringBuilder, (Spannable) "search_user_name", (String) 0);
            }
            if (io.a(new UserVerify(null, user.getCustomVerify(), user.getEnterpriseVerifyReason(), -1))) {
                spannableStringBuilder.append((CharSequence) " T");
                spannableStringBuilder.setSpan(new aj(G(), R.drawable.abm), (spannableStringBuilder.length() - 2) + 1, spannableStringBuilder.length(), 17);
            }
            if (user.isPrivateAccount() && ao.a() && ah.a(user.getFollowStatus())) {
                String string = G().getString(R.string.evo);
                h.f.b.l.b(string, "");
                spannableStringBuilder.append((CharSequence) " · ");
                spannableStringBuilder.append((CharSequence) string);
                spannableStringBuilder.setSpan(new ForegroundColorSpan(androidx.core.content.b.c(G(), R.color.c5)), (spannableStringBuilder.length() - 3) - string.length(), spannableStringBuilder.length(), 33);
            }
        }
        TextView textView = this.f80401d;
        if (textView == null) {
            h.f.b.l.a("usernameText");
        }
        textView.setText(spannableStringBuilder);
    }

    static final class i<V> implements Callable {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ am f80416a;

        static {
            Covode.recordClassIndex(50043);
        }

        i(am amVar) {
            this.f80416a = amVar;
        }

        @Override // java.util.concurrent.Callable
        public final /* synthetic */ Object call() {
            User user;
            String str;
            String str2;
            String str3;
            User user2;
            User user3;
            String uid;
            String str4;
            User user4;
            User user5;
            User user6;
            User user7;
            SearchUser searchUser = this.f80416a.t;
            Integer num = null;
            if (searchUser != null) {
                user = searchUser.user;
            } else {
                user = null;
            }
            String a2 = com.ss.android.ugc.aweme.discover.mixfeed.a.e.a(user);
            String str5 = "blocked";
            if (this.f80416a.x == an.SHOW_BLOCK) {
                a2 = str5;
            }
            String str6 = this.f80416a.F().q;
            String str7 = "";
            if (TextUtils.isEmpty(str6) && ((user7 = this.f80416a.w) == null || (str6 = user7.getUid()) == null)) {
                str6 = str7;
            }
            au a3 = com.ss.android.ugc.aweme.discover.mixfeed.b.b.a(this.f80416a.F());
            a3.t(a2);
            a3.l(str6);
            String h2 = this.f80416a.h();
            SearchUser searchUser2 = this.f80416a.t;
            if (searchUser2 == null || (user6 = searchUser2.user) == null) {
                str = null;
            } else {
                str = user6.getUniqueId();
            }
            a3.u(str);
            SearchUser searchUser3 = this.f80416a.t;
            if (searchUser3 == null || (user5 = searchUser3.user) == null) {
                str2 = null;
            } else {
                str2 = com.ss.android.ugc.aweme.discover.mixfeed.a.e.a(user5);
            }
            if (this.f80416a.x != an.SHOW_BLOCK) {
                str5 = str2;
            }
            SearchUser searchUser4 = this.f80416a.t;
            if (!(searchUser4 == null || (user4 = searchUser4.user) == null)) {
                num = Integer.valueOf(com.ss.android.ugc.aweme.discover.mixfeed.b.d.a(user4));
            }
            a3.c(num);
            if (hl.a(str5)) {
                a3.a("user_tag", str5);
            }
            SearchUser searchUser5 = this.f80416a.t;
            if (searchUser5 != null && !searchUser5.isAladdin() && this.f80416a.F().f121266a) {
                a3.y(String.valueOf(this.f80416a.getAdapterPosition()));
            }
            if (this.f80416a.F().C != null) {
                com.ss.android.ugc.aweme.search.k.d dVar = (com.ss.android.ugc.aweme.search.k.d) ((com.ss.android.ugc.aweme.search.k.d) a3.r("user")).d(Integer.valueOf(this.f80416a.getAdapterPosition()));
                User user8 = this.f80416a.s;
                if (user8 == null || (str4 = user8.getSearchUserDesc()) == null) {
                    str4 = str7;
                }
                dVar.s(str4);
            }
            SearchUser searchUser6 = this.f80416a.t;
            if (searchUser6 != null && searchUser6.isAladdin()) {
                SearchUser searchUser7 = this.f80416a.t;
                if (!(searchUser7 == null || (user3 = searchUser7.user) == null || (uid = user3.getUid()) == null)) {
                    str7 = uid;
                }
                a3.v(str7);
            }
            a3.x(h2);
            a3.w(this.f80416a.j());
            a3.g(this.f80416a.i());
            SearchUser searchUser8 = this.f80416a.t;
            if (searchUser8 == null || (user2 = searchUser8.user) == null || !user2.isLive()) {
                str3 = "0";
            } else {
                str3 = "1";
            }
            a3.c("is_live", str3);
            Objects.requireNonNull(a3, "null cannot be cast to non-null type T");
            a3.f();
            return a3;
        }
    }

    /* access modifiers changed from: package-private */
    /* JADX WARNING: Code restructure failed: missing block: B:73:0x0141, code lost:
        if (r1.isPrivateAccount() != false) goto L_0x0143;
     */
    /* JADX WARNING: Removed duplicated region for block: B:46:0x0096  */
    /* JADX WARNING: Removed duplicated region for block: B:63:0x0113  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void e() {
        /*
        // Method dump skipped, instructions count: 361
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ss.android.ugc.aweme.discover.adapter.am.e():void");
    }

    static final class f implements DmtTabLayout.b {

        /* renamed from: a  reason: collision with root package name */
        public static final f f80413a = new f();

        static {
            Covode.recordClassIndex(50040);
        }

        f() {
        }

        @Override // com.bytedance.ies.dmt.ui.widget.tablayout.DmtTabLayout.b
        public final void a(DmtTabLayout.f fVar) {
            fVar.a();
        }
    }

    @org.greenrobot.eventbus.r
    public final void onFollowStatusEvent(FollowStatusEvent followStatusEvent) {
        this.itemView.post(new j(this, followStatusEvent));
    }

    @Override // com.ss.android.ugc.aweme.discover.adapter.b
    public final void onViewAttachedToWindow(View view) {
        h.f.b.l.d(view, "");
        super.onViewAttachedToWindow(view);
        EventBus.a(EventBus.a(), this);
    }

    @Override // com.ss.android.ugc.aweme.discover.adapter.b
    public final void onViewDetachedFromWindow(View view) {
        h.f.b.l.d(view, "");
        super.onViewDetachedFromWindow(view);
        EventBus.a().b(this);
    }

    static final class b implements a.b {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ am f80410a;

        static {
            Covode.recordClassIndex(50036);
        }

        b(am amVar) {
            this.f80410a = amVar;
        }

        @Override // com.ss.android.ugc.aweme.follow.widet.a.b
        public final void a(FollowStatus followStatus) {
            User user;
            User user2;
            h.f.b.l.b(followStatus, "");
            if (followStatus.followStatus != 0 && (user = this.f80410a.s) != null && user.getBlockStatus() == 1 && (user2 = this.f80410a.s) != null) {
                user2.setBlockStatus(0);
            }
        }
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    private am(View view) {
        super(view);
        h.f.b.l.d(view, "");
        this.G = h.i.a((h.f.a.a) n.f80419a);
        this.y = new g(this);
        this.H = h.i.a((h.f.a.a) new m(this));
        this.I = h.i.a((h.f.a.a) new k(this));
        this.z = new l(this);
    }

    static final class g<T> implements u {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ am f80414a;

        static {
            Covode.recordClassIndex(50041);
        }

        g(am amVar) {
            this.f80414a = amVar;
        }

        @Override // androidx.lifecycle.u
        public final /* synthetic */ void onChanged(Object obj) {
            User user;
            BlockStatus blockStatus = (BlockStatus) obj;
            am amVar = this.f80414a;
            if (blockStatus != null && (user = amVar.s) != null && !(!h.f.b.l.a((Object) blockStatus.userId, (Object) user.getUid()))) {
                if (blockStatus.blockStatus == 1) {
                    amVar.x = an.SHOW_BLOCK;
                    if (com.ss.android.ugc.aweme.discover.a.l.a()) {
                        user.setFollowStatus(0);
                        NewFollowButton newFollowButton = amVar.f80400c;
                        if (newFollowButton == null) {
                            h.f.b.l.a("followButton");
                        }
                        newFollowButton.a(0, user.getFollowerStatus());
                    }
                } else if (amVar.x == an.SHOW_BLOCK) {
                    amVar.x = an.EMPTY;
                }
                user.getBlockStatus();
                user.setBlockStatus(blockStatus.blockStatus);
                amVar.e();
            }
        }
    }

    /* renamed from: a */
    public final void onChanged(FollowStatus followStatus) {
        User user;
        if (com.ss.android.ugc.aweme.search.b.a.b() != 1 && followStatus != null && (user = this.s) != null && TextUtils.equals(followStatus.userId, user.getUid())) {
            if (followStatus.followStatus == 1 || followStatus.followStatus == 2 || followStatus.followStatus == 4) {
                this.x = an.SHOW_FOLLOW;
            }
            if (followStatus.followStatus == 0) {
                this.x = an.EMPTY;
            }
            int followStatus2 = user.getFollowStatus();
            user.setFollowStatus(followStatus.followStatus);
            if (followStatus2 != followStatus.followStatus) {
                d();
            }
            e();
        }
    }

    static final class e implements a.c {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ am f80412a;

        static {
            Covode.recordClassIndex(50039);
        }

        e(am amVar) {
            this.f80412a = amVar;
        }

        @Override // com.ss.android.ugc.aweme.follow.widet.a.c
        public final boolean a(int i2) {
            String str;
            IIMService createIIMServicebyMonsterPlugin;
            User user = this.f80412a.s;
            if (user == null) {
                return false;
            }
            am amVar = this.f80412a;
            h.f.b.l.d(user, "");
            int followStatus = user.getFollowStatus();
            String str2 = "click_cancel_follow";
            if (followStatus == 0) {
                str2 = user.isPrivateAccount() ? "click_request" : "click_follow_button";
            } else if (followStatus != 1) {
                if (followStatus != 2) {
                    if (followStatus != 4) {
                        str2 = "";
                    }
                } else if (!com.ss.android.ugc.aweme.discover.m.f.a(user)) {
                    str2 = "click_message";
                }
            }
            amVar.a(str2, null);
            Context G = this.f80412a.G();
            if (this.f80412a.F().f121266a) {
                str = "general_search";
            } else {
                str = "search_result";
            }
            User user2 = this.f80412a.s;
            NewFollowButton newFollowButton = this.f80412a.f80400c;
            if (newFollowButton == null) {
                h.f.b.l.a("followButton");
            }
            boolean shouldShowMessageText = newFollowButton.getShouldShowMessageText();
            h.f.b.l.d(str, "");
            if (user2 == null || !shouldShowMessageText || user2.getFollowStatus() != 2) {
                return false;
            }
            IMUser fromUser = IMUser.fromUser(user2);
            if (!(fromUser == null || (createIIMServicebyMonsterPlugin = IMService.createIIMServicebyMonsterPlugin(false)) == null)) {
                createIIMServicebyMonsterPlugin.startChat(a.b.a(G, fromUser).c(str).b("button").f103883a);
            }
            return true;
        }
    }

    public final void onClick(View view) {
        User user;
        String str;
        ClickAgent.onClick(view);
        if (com.ss.android.ugc.aweme.l.a.a.a(view, 1200) || (user = this.s) == null) {
            return;
        }
        if (view == null || view.getId() != R.id.bu0 || !BusinessComponentServiceUtils.getLiveAllService().a(this.s)) {
            a(this, null, ag.a(v.a("list_result_type", "user")), 1);
            return;
        }
        p[] pVarArr = new p[2];
        User user2 = this.s;
        if (user2 == null || (str = String.valueOf(user2.roomId)) == null) {
            str = "";
        }
        pVarArr[0] = v.a("room_id", str);
        pVarArr[1] = v.a("list_result_type", "live");
        a("click_into_live", ag.a(pVarArr));
        User user3 = this.s;
        if (user3 == null) {
            h.f.b.l.b();
        }
        long j2 = user3.roomId;
        String str2 = F().f121274i;
        String str3 = F().f121271f;
        String str4 = F().f121269d;
        User user4 = this.s;
        if (user4 == null) {
            h.f.b.l.b();
        }
        String uid = user4.getUid();
        StringBuilder sb = new StringBuilder();
        User user5 = this.s;
        if (user5 == null) {
            h.f.b.l.b();
        }
        String sb2 = sb.append(String.valueOf(user5.roomId)).toString();
        EnterRoomConfig enterRoomConfig = new EnterRoomConfig();
        enterRoomConfig.f23298b.x = str2;
        enterRoomConfig.f23298b.y = str3;
        enterRoomConfig.f23298b.A = str4;
        enterRoomConfig.f23298b.z = uid;
        SearchUser searchUser = this.t;
        if (searchUser != null && searchUser.isAladdin()) {
            enterRoomConfig.f23298b.B = sb2;
        }
        enterRoomConfig.f23298b.f23309a = str2;
        enterRoomConfig.f23298b.f23310b = user.getUid();
        enterRoomConfig.f23299c.L = "others_photo";
        com.ss.android.ugc.aweme.discover.ui.c.a.a(G(), j2, h.a.n.d(Long.valueOf(j2)), h.a.n.d(new RoomInfo(j2, user.getUid())), enterRoomConfig, "general_search");
    }

    private final void b(String str, Map<String, String> map) {
        String str2;
        a("click_info", map);
        User user = this.s;
        if (user != null) {
            str2 = com.ss.android.ugc.aweme.discover.mixfeed.a.e.a(user);
        } else {
            str2 = null;
        }
        if (this.x == an.SHOW_BLOCK) {
            str2 = "blocked";
        }
        com.ss.android.ugc.aweme.following.ui.adapter.d dVar = this.F;
        if (dVar != null) {
            dVar.a(this.itemView, this.s, getAdapterPosition(), str2, str);
        }
    }

    public final void a(String str, Map<String, String> map) {
        User user;
        String str2;
        String str3;
        String str4;
        String searchUserName;
        User user2;
        User user3;
        User user4;
        at b2 = com.ss.android.ugc.aweme.discover.mixfeed.b.b.b(F());
        String h2 = h();
        SearchUser searchUser = this.t;
        Integer num = null;
        if (searchUser != null) {
            user = searchUser.user;
        } else {
            user = null;
        }
        String a2 = com.ss.android.ugc.aweme.discover.mixfeed.a.e.a(user);
        if (this.x == an.SHOW_BLOCK) {
            a2 = "blocked";
        }
        com.ss.android.ugc.aweme.search.k.d dVar = (com.ss.android.ugc.aweme.search.k.d) ((com.ss.android.ugc.aweme.search.k.d) b2.x(h2)).t(a2);
        SearchUser searchUser2 = this.t;
        if (searchUser2 == null || (user4 = searchUser2.user) == null) {
            str2 = null;
        } else {
            str2 = user4.getUniqueId();
        }
        com.ss.android.ugc.aweme.search.k.c u2 = dVar.u(str2);
        SearchUser searchUser3 = this.t;
        if (searchUser3 == null || (user3 = searchUser3.user) == null) {
            str3 = null;
        } else {
            str3 = user3.getUid();
        }
        com.ss.android.ugc.aweme.search.k.d dVar2 = (com.ss.android.ugc.aweme.search.k.d) ((com.ss.android.ugc.aweme.search.k.d) u2.l(str3)).w(j()).g(i());
        User user5 = this.s;
        if (user5 != null) {
            num = Integer.valueOf(com.ss.android.ugc.aweme.discover.mixfeed.b.d.a(user5));
        }
        dVar2.c(num);
        SearchUser searchUser4 = this.t;
        if (searchUser4 == null || !searchUser4.isAladdin()) {
            b2.A(str);
            if (F().f121266a) {
                b2.y(String.valueOf(getAdapterPosition()));
            }
        } else {
            b2.B(str);
            SearchUser searchUser5 = this.t;
            String str5 = "";
            if (searchUser5 == null || (user2 = searchUser5.user) == null || (str4 = user2.getUid()) == null) {
                str4 = str5;
            }
            com.ss.android.ugc.aweme.search.k.d dVar3 = (com.ss.android.ugc.aweme.search.k.d) ((com.ss.android.ugc.aweme.search.k.d) b2.v(str4)).d(Integer.valueOf(getAdapterPosition()));
            User user6 = this.s;
            if (!(user6 == null || (searchUserName = user6.getSearchUserName()) == null)) {
                str5 = searchUserName;
            }
            dVar3.s(str5);
        }
        if (map != null) {
            b2.a(map);
        }
        b2.f();
    }

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    public am(View view, com.ss.android.ugc.aweme.following.ui.adapter.d dVar) {
        this(view);
        h.f.b.l.d(view, "");
        View findViewById = view.findViewById(R.id.bu0);
        h.f.b.l.b(findViewById, "");
        this.f80398a = (AvatarImageWithLive) findViewById;
        View findViewById2 = view.findViewById(R.id.bsf);
        h.f.b.l.b(findViewById2, "");
        this.f80399b = (LiveCircleView) findViewById2;
        View findViewById3 = view.findViewById(R.id.yf);
        h.f.b.l.b(findViewById3, "");
        this.f80400c = (NewFollowButton) findViewById3;
        View findViewById4 = view.findViewById(R.id.f_d);
        h.f.b.l.b(findViewById4, "");
        this.f80401d = (TextView) findViewById4;
        View findViewById5 = view.findViewById(R.id.evx);
        h.f.b.l.b(findViewById5, "");
        this.f80402e = (TextView) findViewById5;
        View findViewById6 = view.findViewById(R.id.ezd);
        h.f.b.l.b(findViewById6, "");
        this.B = (TextView) findViewById6;
        View findViewById7 = view.findViewById(R.id.eyc);
        h.f.b.l.b(findViewById7, "");
        this.C = (TuxTextView) findViewById7;
        View findViewById8 = view.findViewById(R.id.crv);
        h.f.b.l.b(findViewById8, "");
        this.D = (MutualRelationView) findViewById8;
        View findViewById9 = view.findViewById(R.id.fdy);
        h.f.b.l.b(findViewById9, "");
        this.E = (ViewStub) findViewById9;
        View findViewById10 = view.findViewById(R.id.fdq);
        h.f.b.l.b(findViewById10, "");
        this.f80403f = (ViewStub) findViewById10;
        View findViewById11 = view.findViewById(R.id.crl);
        h.f.b.l.b(findViewById11, "");
        this.p = (ViewStub) findViewById11;
        View findViewById12 = view.findViewById(R.id.fdz);
        h.f.b.l.b(findViewById12, "");
        this.f80404g = (ViewStub) findViewById12;
        ViewStub viewStub = this.E;
        if (viewStub == null) {
            h.f.b.l.a("videoAndPlaylistStub");
        }
        this.n = new com.ss.android.ugc.aweme.search.q.c(viewStub, null, 2);
        view.setOnClickListener(this);
        AvatarImageWithLive avatarImageWithLive = this.f80398a;
        if (avatarImageWithLive == null) {
            h.f.b.l.a("avatarImage");
        }
        avatarImageWithLive.setOnClickListener(this);
        this.F = dVar;
        NewFollowButton newFollowButton = this.f80400c;
        if (newFollowButton == null) {
            h.f.b.l.a("followButton");
        }
        com.ss.android.ugc.aweme.follow.widet.a aVar = new com.ss.android.ugc.aweme.follow.widet.a(newFollowButton, new a.f(this) {
            /* class com.ss.android.ugc.aweme.discover.adapter.am.AnonymousClass1 */

            /* renamed from: a  reason: collision with root package name */
            final /* synthetic */ am f80408a;

            static {
                Covode.recordClassIndex(50034);
            }

            @Override // com.ss.android.ugc.aweme.follow.widet.a.f
            public final String getEnterMethod() {
                return "click_follow";
            }

            @Override // com.ss.android.ugc.aweme.follow.widet.a.f
            public final int getFollowFromType() {
                return 14;
            }

            @Override // com.ss.android.ugc.aweme.follow.widet.a.f
            public final String getEnterFrom() {
                if (this.f80408a.F().f121266a) {
                    return "general_search";
                }
                return "search_result";
            }

            /* JADX WARN: Incorrect args count in method signature: ()V */
            {
                this.f80408a = r1;
            }

            @Override // com.ss.android.ugc.aweme.follow.widet.a.f
            public final void a(int i2, User user) {
                String str;
                String str2;
                String str3;
                if (user != null) {
                    if (i2 == 0) {
                        str = "follow_cancel";
                        str2 = "search_follow_cancel";
                    } else {
                        str = "follow";
                        str2 = "search_follow";
                    }
                    com.ss.android.ugc.aweme.discover.mixfeed.b.c.a(this.f80408a.F(), str, i2, user, null, false).f();
                    if (this.f80408a.F().f121266a) {
                        str3 = "general";
                    } else {
                        str3 = "user";
                    }
                    com.ss.android.ugc.aweme.discover.mixfeed.b.c.a(this.f80408a.F(), str2, i2, user, ag.a(v.a("search_type", str3)), true).f();
                }
            }
        });
        if (com.ss.android.ugc.aweme.discover.a.l.a()) {
            aVar.f96290g = new a(this);
            aVar.f96286c = new b(this);
            aVar.f96291h = true;
            this.u = aVar;
        }
    }

    /* JADX DEBUG: Multi-variable search result rejected for r2v0, resolved type: com.ss.android.ugc.aweme.discover.adapter.am */
    /* JADX WARN: Multi-variable type inference failed */
    static /* synthetic */ void a(am amVar, String str, Map map, int i2) {
        if ((i2 & 1) != 0) {
            str = null;
        }
        if ((i2 & 2) != 0) {
            map = null;
        }
        amVar.b(str, map);
    }
}
