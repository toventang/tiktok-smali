package com.ss.android.ugc.aweme.social.widget.card.view;

import android.content.Context;
import android.util.AttributeSet;
import com.bytedance.covode.number.Covode;
import com.ss.android.ugc.aweme.common.r;
import com.ss.android.ugc.aweme.follow.NewFollowButton;
import com.ss.android.ugc.aweme.follow.widet.a;
import com.ss.android.ugc.aweme.notice.api.services.INoticeService;
import com.ss.android.ugc.aweme.notification.service.NoticeServiceImpl;
import com.ss.android.ugc.aweme.profile.model.FollowStatus;
import com.ss.android.ugc.aweme.profile.model.User;
import com.zhiliaoapp.musically.R;
import h.f.b.l;
import h.f.b.m;
import h.h;
import h.i;
import h.z;

public final class FollowButtonWithBlock extends NewFollowButton implements a.f {

    /* renamed from: e  reason: collision with root package name */
    public h.f.a.b<? super FollowStatus, z> f133925e;

    /* renamed from: f  reason: collision with root package name */
    private h.f.a.b<? super Integer, z> f133926f;

    /* renamed from: g  reason: collision with root package name */
    private final h f133927g;

    static {
        Covode.recordClassIndex(87623);
    }

    public FollowButtonWithBlock(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, (byte) 0);
    }

    @Override // com.ss.android.ugc.aweme.follow.widet.a.f
    public final String getEnterFrom() {
        return "";
    }

    @Override // com.ss.android.ugc.aweme.follow.widet.a.f
    public final String getEnterMethod() {
        return "";
    }

    public final com.ss.android.ugc.aweme.follow.widet.a getFollowBlock() {
        return (com.ss.android.ugc.aweme.follow.widet.a) this.f133927g.getValue();
    }

    @Override // com.ss.android.ugc.aweme.follow.widet.a.f
    public final int getFollowFromType() {
        return 0;
    }

    static final class a extends m implements h.f.a.a<com.ss.android.ugc.aweme.follow.widet.a> {
        final /* synthetic */ FollowButtonWithBlock this$0;

        static {
            Covode.recordClassIndex(87624);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        a(FollowButtonWithBlock followButtonWithBlock) {
            super(0);
            this.this$0 = followButtonWithBlock;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        @Override // h.f.a.a
        public final /* synthetic */ com.ss.android.ugc.aweme.follow.widet.a invoke() {
            FollowButtonWithBlock followButtonWithBlock = this.this$0;
            return new com.ss.android.ugc.aweme.follow.widet.a(followButtonWithBlock, followButtonWithBlock);
        }
    }

    public static final class c implements a.d {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ FollowButtonWithBlock f133930a;

        static {
            Covode.recordClassIndex(87626);
        }

        @Override // com.ss.android.ugc.aweme.follow.widet.a.d
        public final void a() {
        }

        @Override // com.ss.android.ugc.aweme.follow.widet.a.d
        public final void b() {
        }

        /* JADX WARN: Incorrect args count in method signature: ()V */
        c(FollowButtonWithBlock followButtonWithBlock) {
            this.f133930a = followButtonWithBlock;
        }

        @Override // com.ss.android.ugc.aweme.follow.widet.a.d
        public final void a(FollowStatus followStatus) {
            l.d(followStatus, "");
            h.f.a.b<? super FollowStatus, z> bVar = this.f133930a.f133925e;
            if (bVar != null) {
                bVar.invoke(followStatus);
            }
            this.f133930a.a(followStatus.followStatus, followStatus.followerStatus);
        }
    }

    public final void setMobListener(h.f.a.b<? super Integer, z> bVar) {
        l.d(bVar, "");
        this.f133926f = bVar;
    }

    public final void setOnClickListener(h.f.a.b<? super FollowStatus, z> bVar) {
        l.d(bVar, "");
        this.f133925e = bVar;
    }

    /* access modifiers changed from: package-private */
    public static final class b implements a.c {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ FollowButtonWithBlock f133928a;

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ User f133929b;

        static {
            Covode.recordClassIndex(87625);
        }

        b(FollowButtonWithBlock followButtonWithBlock, User user) {
            this.f133928a = followButtonWithBlock;
            this.f133929b = user;
        }

        @Override // com.ss.android.ugc.aweme.follow.widet.a.c
        public final boolean a(int i2) {
            return INoticeService.a.a(NoticeServiceImpl.f(), this.f133928a.getContext(), this.f133929b, null, null, this.f133928a.getShouldShowMessageText(), 12);
        }
    }

    public final void setListener(User user) {
        getFollowBlock().f96288e = new b(this, user);
        getFollowBlock().f96287d = new c(this);
        getFollowBlock().f96289f = d.f133931a;
    }

    /* access modifiers changed from: package-private */
    public static final class d implements a.e {

        /* renamed from: a  reason: collision with root package name */
        public static final d f133931a = new d();

        static {
            Covode.recordClassIndex(87627);
        }

        d() {
        }

        @Override // com.ss.android.ugc.aweme.follow.widet.a.e
        public final void a(FollowStatus followStatus) {
            l.b(followStatus, "");
            if (followStatus.followStatus == 0) {
                r.a("follow_cancel_finish", new com.ss.android.ugc.aweme.app.f.d().a("enter_from", "following_list").a("to_user_id", followStatus.userId).f66730a);
            } else {
                r.a("follow_finish", new com.ss.android.ugc.aweme.app.f.d().a("enter_from", "following_list").a("to_user_id", followStatus.userId).f66730a);
            }
        }
    }

    @Override // com.ss.android.ugc.aweme.follow.widet.a.f
    public final void a(int i2, User user) {
        h.f.a.b<? super Integer, z> bVar = this.f133926f;
        if (bVar != null) {
            bVar.invoke(Integer.valueOf(i2));
        }
    }

    private /* synthetic */ FollowButtonWithBlock(Context context, AttributeSet attributeSet, byte b2) {
        this(context, attributeSet, (char) 0);
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    private FollowButtonWithBlock(Context context, AttributeSet attributeSet, char c2) {
        super(context, attributeSet, (int) R.attr.bo);
        l.d(context, "");
        this.f133927g = i.a((h.f.a.a) new a(this));
    }
}
