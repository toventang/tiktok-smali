package com.ss.android.ugc.aweme.im.sdk.chatlist.feature.recommend.c.b;

import android.view.View;
import androidx.recyclerview.widget.RecyclerView;
import com.bytedance.covode.number.Covode;
import com.ss.android.ugc.aweme.base.a.k;
import com.ss.android.ugc.aweme.common.r;
import com.ss.android.ugc.aweme.follow.widet.a;
import com.ss.android.ugc.aweme.friends.ui.au;
import com.ss.android.ugc.aweme.im.sdk.chatlist.feature.recommend.viewmodel.RecommendFriendInDMViewModel;
import com.ss.android.ugc.aweme.im.sdk.common.controller.providedservices.IMService;
import com.ss.android.ugc.aweme.metrics.u;
import com.ss.android.ugc.aweme.notice.api.services.INoticeService;
import com.ss.android.ugc.aweme.notification.service.NoticeServiceImpl;
import com.ss.android.ugc.aweme.profile.model.FollowStatus;
import com.ss.android.ugc.aweme.profile.model.User;
import h.f.b.l;
import h.f.b.m;
import h.z;

public final class a extends RecyclerView.ViewHolder {

    /* renamed from: a  reason: collision with root package name */
    public k<User> f101977a;

    /* renamed from: b  reason: collision with root package name */
    public com.ss.android.ugc.aweme.follow.widet.a f101978b = new com.ss.android.ugc.aweme.follow.widet.a(this.f101981e, new a.g(this) {
        /* class com.ss.android.ugc.aweme.im.sdk.chatlist.feature.recommend.c.b.a.AnonymousClass1 */

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ a f101982a;

        static {
            Covode.recordClassIndex(65253);
        }

        /* JADX WARN: Incorrect args count in method signature: ()V */
        {
            this.f101982a = r1;
        }

        @Override // com.ss.android.ugc.aweme.follow.widet.a.g, com.ss.android.ugc.aweme.follow.widet.a.f
        public final void a(int i2, User user) {
            k<User> kVar = this.f101982a.f101977a;
            if (kVar != null) {
                int position = this.f101982a.getPosition();
                this.f101982a.f101979c.getView();
                kVar.a(100, user, position);
            }
        }
    });

    /* renamed from: c  reason: collision with root package name */
    public final com.ss.android.ugc.aweme.recommend.a f101979c;

    /* renamed from: d  reason: collision with root package name */
    public final RecommendFriendInDMViewModel f101980d;

    /* renamed from: e  reason: collision with root package name */
    private com.ss.android.ugc.aweme.following.ui.view.a f101981e;

    static {
        Covode.recordClassIndex(65252);
    }

    public static final class b implements a.d {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ a f101986a;

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ User f101987b;

        static {
            Covode.recordClassIndex(65255);
        }

        @Override // com.ss.android.ugc.aweme.follow.widet.a.d
        public final void a() {
        }

        @Override // com.ss.android.ugc.aweme.follow.widet.a.d
        public final void b() {
        }

        @Override // com.ss.android.ugc.aweme.follow.widet.a.d
        public final void a(FollowStatus followStatus) {
            if (followStatus != null) {
                IMService.createIIMServicebyMonsterPlugin(false).storeFollowStatus(followStatus);
                this.f101986a.f101979c.a(followStatus.followStatus, followStatus.followerStatus, followStatus.userId);
            }
        }

        public b(a aVar, User user) {
            this.f101986a = aVar;
            this.f101987b = user;
        }
    }

    public static final class d extends m implements h.f.a.b<Integer, z> {
        final /* synthetic */ User $user;
        final /* synthetic */ a this$0;

        static {
            Covode.recordClassIndex(65257);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public d(a aVar, User user) {
            super(1);
            this.this$0 = aVar;
            this.$user = user;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
        @Override // h.f.a.b
        public final /* synthetic */ z invoke(Integer num) {
            int i2;
            int intValue = num.intValue();
            if (intValue == au.f97190c) {
                i2 = 101;
            } else if (intValue == au.f97192e) {
                i2 = 102;
            } else if (intValue == au.f97194g) {
                i2 = 103;
            } else {
                i2 = -1;
            }
            k<User> kVar = this.this$0.f101977a;
            if (kVar != null) {
                User user = this.$user;
                int position = this.this$0.getPosition();
                this.this$0.f101979c.getView();
                kVar.a(i2, user, position);
            }
            return z.f158842a;
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.im.sdk.chatlist.feature.recommend.c.b.a$a  reason: collision with other inner class name */
    public static final class C2546a implements a.c {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ a f101983a;

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ User f101984b;

        /* renamed from: c  reason: collision with root package name */
        final /* synthetic */ boolean f101985c;

        static {
            Covode.recordClassIndex(65254);
        }

        public C2546a(a aVar, User user, boolean z) {
            this.f101983a = aVar;
            this.f101984b = user;
            this.f101985c = z;
        }

        @Override // com.ss.android.ugc.aweme.follow.widet.a.c
        public final boolean a(int i2) {
            INoticeService f2 = NoticeServiceImpl.f();
            View view = this.f101983a.itemView;
            l.b(view, "");
            boolean a2 = INoticeService.a.a(f2, view.getContext(), this.f101984b, "message_rec", null, !this.f101985c, 8);
            if (a2) {
                User user = this.f101984b;
                u a3 = new u().q("notification_page").a("message_rec");
                a3.f109596a = u.c.CARD;
                a3.f109597b = u.a.ENTER_CHAT;
                a3.a(user).s(user.getRequestId()).f();
            }
            return a2;
        }
    }

    public static final class c implements a.e {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ a f101988a;

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ User f101989b;

        static {
            Covode.recordClassIndex(65256);
        }

        public c(a aVar, User user) {
            this.f101988a = aVar;
            this.f101989b = user;
        }

        @Override // com.ss.android.ugc.aweme.follow.widet.a.e
        public final void a(FollowStatus followStatus) {
            String uid = this.f101989b.getUid();
            l.b(uid, "");
            l.b(followStatus, "");
            if (followStatus.followStatus == 0) {
                r.a("follow_cancel_finish", new com.ss.android.ugc.aweme.app.f.d().a("enter_from", "message_rec").a("to_user_id", uid).f66730a);
            } else {
                r.a("follow_finish", new com.ss.android.ugc.aweme.app.f.d().a("enter_from", "message_rec").a("to_user_id", uid).f66730a);
            }
        }
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public a(com.ss.android.ugc.aweme.recommend.a aVar, RecommendFriendInDMViewModel recommendFriendInDMViewModel) {
        super(aVar.getView());
        l.d(aVar, "");
        l.d(recommendFriendInDMViewModel, "");
        this.f101979c = aVar;
        this.f101980d = recommendFriendInDMViewModel;
        this.f101981e = aVar.getFollowBtn();
    }
}
