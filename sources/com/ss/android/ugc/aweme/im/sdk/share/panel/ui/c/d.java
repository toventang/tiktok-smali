package com.ss.android.ugc.aweme.im.sdk.share.panel.ui.c;

import android.os.Bundle;
import android.view.View;
import androidx.recyclerview.widget.RecyclerView;
import com.bytedance.apm.agent.v2.instrumentation.ClickAgent;
import com.bytedance.covode.number.Covode;
import com.bytedance.tux.input.TuxTextView;
import com.ss.android.ugc.aweme.base.ui.AvatarImageWithVerify;
import com.ss.android.ugc.aweme.follow.widet.a;
import com.ss.android.ugc.aweme.im.sdk.share.panel.ui.view.SharePanelFollowButton;
import com.ss.android.ugc.aweme.im.sdk.share.panel.viewmodel.SharePanelViewModel;
import com.ss.android.ugc.aweme.metrics.c;
import com.ss.android.ugc.aweme.metrics.u;
import com.ss.android.ugc.aweme.metrics.v;
import com.ss.android.ugc.aweme.profile.model.FollowStatus;
import com.ss.android.ugc.aweme.profile.model.User;
import com.ss.android.ugc.aweme.sharer.ui.SharePackage;
import com.ss.android.ugc.aweme.views.MutualRelationView;
import com.zhiliaoapp.musically.R;
import h.a.n;
import h.f.b.l;
import h.f.b.m;

public final class d extends RecyclerView.ViewHolder {

    /* renamed from: j  reason: collision with root package name */
    public static final a f103449j = new a((byte) 0);

    /* renamed from: a  reason: collision with root package name */
    public com.ss.android.ugc.aweme.social.c.a f103450a;

    /* renamed from: b  reason: collision with root package name */
    public final com.ss.android.ugc.aweme.im.sdk.share.panel.viewmodel.c f103451b;

    /* renamed from: c  reason: collision with root package name */
    public final h.h f103452c;

    /* renamed from: d  reason: collision with root package name */
    public final h.h f103453d;

    /* renamed from: e  reason: collision with root package name */
    public final h.h f103454e;

    /* renamed from: f  reason: collision with root package name */
    public final h.h f103455f;

    /* renamed from: g  reason: collision with root package name */
    public final a.g f103456g = new a.g();

    /* renamed from: h  reason: collision with root package name */
    public final e f103457h = new e(this);

    /* renamed from: i  reason: collision with root package name */
    public final SharePanelViewModel f103458i;

    /* renamed from: k  reason: collision with root package name */
    private final h.h f103459k;

    /* renamed from: l  reason: collision with root package name */
    private final h.h f103460l = h.i.a((h.f.a.a) new f(this));

    /* renamed from: m  reason: collision with root package name */
    private final com.ss.android.ugc.aweme.im.service.share.a.b f103461m;

    static {
        Covode.recordClassIndex(66291);
    }

    public final SharePanelFollowButton a() {
        return (SharePanelFollowButton) this.f103459k.getValue();
    }

    public final com.ss.android.ugc.aweme.follow.widet.a b() {
        return (com.ss.android.ugc.aweme.follow.widet.a) this.f103460l.getValue();
    }

    public static final class a {
        static {
            Covode.recordClassIndex(66292);
        }

        private a() {
        }

        public /* synthetic */ a(byte b2) {
            this();
        }
    }

    static final class b extends m implements h.f.a.a<AvatarImageWithVerify> {
        final /* synthetic */ View $itemView;

        static {
            Covode.recordClassIndex(66293);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        b(View view) {
            super(0);
            this.$itemView = view;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        @Override // h.f.a.a
        public final /* synthetic */ AvatarImageWithVerify invoke() {
            return this.$itemView.findViewById(R.id.pf);
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.im.sdk.share.panel.ui.c.d$d  reason: collision with other inner class name */
    static final class C2630d extends m implements h.f.a.a<SharePanelFollowButton> {
        final /* synthetic */ View $itemView;

        static {
            Covode.recordClassIndex(66295);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C2630d(View view) {
            super(0);
            this.$itemView = view;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        @Override // h.f.a.a
        public final /* synthetic */ SharePanelFollowButton invoke() {
            return this.$itemView.findViewById(R.id.b7g);
        }
    }

    public static final class e implements a.d {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ d f103464a;

        static {
            Covode.recordClassIndex(66296);
        }

        @Override // com.ss.android.ugc.aweme.follow.widet.a.d
        public final void a() {
        }

        @Override // com.ss.android.ugc.aweme.follow.widet.a.d
        public final void b() {
            this.f103464a.a().setFollowStatus(0);
        }

        /* JADX WARN: Incorrect args count in method signature: ()V */
        e(d dVar) {
            this.f103464a = dVar;
        }

        @Override // com.ss.android.ugc.aweme.follow.widet.a.d
        public final void a(FollowStatus followStatus) {
            com.ss.android.ugc.aweme.social.c.a aVar;
            String str;
            Bundle bundle;
            if (followStatus != null && followStatus.isFollowSucess && this.f103464a.a().getStatus() == 4 && (aVar = this.f103464a.f103450a) != null) {
                SharePanelViewModel sharePanelViewModel = this.f103464a.f103458i;
                l.d(aVar, "");
                com.ss.android.ugc.aweme.social.widget.b.a aVar2 = sharePanelViewModel.f103600g;
                if (aVar2 != null) {
                    aVar2.a(n.a(com.ss.android.ugc.aweme.social.c.b.a(aVar)));
                }
                SharePackage sharePackage = sharePanelViewModel.f103597d;
                if (sharePackage == null || (bundle = sharePackage.f124595i) == null || (str = bundle.getString("enter_from")) == null) {
                    str = "";
                }
                l.b(str, "");
                User a2 = com.ss.android.ugc.aweme.social.c.b.a(aVar);
                u a3 = new u().a(str);
                a3.f109596a = u.c.CARD;
                u a4 = a3.a(a2);
                a4.f109597b = u.a.FOLLOW;
                a4.o("long_press").f();
                v a5 = new v().a(str);
                a5.s = "long_press";
                a5.v = u.b(a2).getType();
                a5.f109608e = a2.getUid();
                v a6 = a5.a(a2);
                a6.r = a2.getRequestId();
                a6.a("relation_type", a2.getFriendTypeStr(), c.a.f109562a);
                a6.a("author_id", a2.getUid(), c.a.f109563b);
                a6.f();
            }
        }
    }

    static final class g extends m implements h.f.a.a<MutualRelationView> {
        final /* synthetic */ View $itemView;

        static {
            Covode.recordClassIndex(66298);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        g(View view) {
            super(0);
            this.$itemView = view;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        @Override // h.f.a.a
        public final /* synthetic */ MutualRelationView invoke() {
            return this.$itemView.findViewById(R.id.crv);
        }
    }

    static final class h extends m implements h.f.a.a<TuxTextView> {
        final /* synthetic */ View $itemView;

        static {
            Covode.recordClassIndex(66299);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        h(View view) {
            super(0);
            this.$itemView = view;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        @Override // h.f.a.a
        public final /* synthetic */ TuxTextView invoke() {
            return this.$itemView.findViewById(R.id.csg);
        }
    }

    static final class i extends m implements h.f.a.a<TuxTextView> {
        final /* synthetic */ View $itemView;

        static {
            Covode.recordClassIndex(66300);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        i(View view) {
            super(0);
            this.$itemView = view;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        @Override // h.f.a.a
        public final /* synthetic */ TuxTextView invoke() {
            return this.$itemView.findViewById(R.id.di4);
        }
    }

    static final class f extends m implements h.f.a.a<com.ss.android.ugc.aweme.follow.widet.a> {
        final /* synthetic */ d this$0;

        static {
            Covode.recordClassIndex(66297);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        f(d dVar) {
            super(0);
            this.this$0 = dVar;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        @Override // h.f.a.a
        public final /* synthetic */ com.ss.android.ugc.aweme.follow.widet.a invoke() {
            com.ss.android.ugc.aweme.follow.widet.a aVar = new com.ss.android.ugc.aweme.follow.widet.a(this.this$0.a(), this.this$0.f103456g);
            aVar.f96287d = this.this$0.f103457h;
            return aVar;
        }
    }

    public final View.OnClickListener a(User user) {
        return new c(this, user);
    }

    static final class c implements View.OnClickListener {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ d f103462a;

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ User f103463b;

        static {
            Covode.recordClassIndex(66294);
        }

        c(d dVar, User user) {
            this.f103462a = dVar;
            this.f103463b = user;
        }

        public final void onClick(View view) {
            boolean z;
            com.ss.android.ugc.aweme.social.c.a aVar;
            ClickAgent.onClick(view);
            int status = this.f103462a.a().getStatus();
            if (status == 0) {
                d dVar = this.f103462a;
                User user = this.f103463b;
                dVar.a().setFollowStatus(4);
                com.ss.android.ugc.aweme.follow.widet.a b2 = dVar.b();
                String uid = user.getUid();
                String secUid = user.getSecUid();
                int followerStatus = user.getFollowerStatus();
                if (user.isSecret() || user.isPrivateAccount()) {
                    z = true;
                } else {
                    z = false;
                }
                b2.a(uid, secUid, 1, followerStatus, z);
            } else if ((status == 1 || status == 2) && (aVar = this.f103462a.f103450a) != null) {
                this.f103462a.f103451b.a(aVar);
            }
        }
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public d(View view, SharePanelViewModel sharePanelViewModel, com.ss.android.ugc.aweme.im.service.share.a.b bVar) {
        super(view);
        l.d(view, "");
        l.d(sharePanelViewModel, "");
        this.f103458i = sharePanelViewModel;
        this.f103461m = bVar;
        this.f103451b = new com.ss.android.ugc.aweme.im.sdk.share.panel.viewmodel.c(sharePanelViewModel, bVar);
        this.f103452c = h.i.a(h.m.NONE, new b(view));
        this.f103453d = h.i.a(h.m.NONE, new h(view));
        this.f103454e = h.i.a(h.m.NONE, new i(view));
        this.f103455f = h.i.a(h.m.NONE, new g(view));
        this.f103459k = h.i.a(h.m.NONE, new C2630d(view));
    }
}
