package com.ss.android.ugc.aweme.find.viewholder;

import android.app.Activity;
import android.content.Context;
import android.text.TextUtils;
import android.view.View;
import androidx.lifecycle.i;
import androidx.lifecycle.m;
import com.bytedance.covode.number.Covode;
import com.bytedance.router.SmartRouter;
import com.ss.android.ugc.aweme.au;
import com.ss.android.ugc.aweme.find.viewmodel.FindFriendsState;
import com.ss.android.ugc.aweme.find.viewmodel.FindFriendsViewModel;
import com.ss.android.ugc.aweme.follow.widet.a;
import com.ss.android.ugc.aweme.im.IIMAdapterService;
import com.ss.android.ugc.aweme.im.sdk.common.controller.providedservices.IMService;
import com.ss.android.ugc.aweme.im.sdk.common.data.service.IMAdapterServiceImpl;
import com.ss.android.ugc.aweme.im.sdk.u16.controller.IMUnder16ProxyImpl;
import com.ss.android.ugc.aweme.im.service.IIMService;
import com.ss.android.ugc.aweme.im.service.model.IMUser;
import com.ss.android.ugc.aweme.im.service.model.a;
import com.ss.android.ugc.aweme.metrics.u;
import com.ss.android.ugc.aweme.newfollow.c.e;
import com.ss.android.ugc.aweme.notice.api.helper.IMainServiceHelper;
import com.ss.android.ugc.aweme.profile.model.FollowStatus;
import com.ss.android.ugc.aweme.profile.model.User;
import com.ss.android.ugc.aweme.recommend.g;
import com.ss.android.ugc.aweme.services.MainServiceHelperImpl;
import h.a.n;
import h.f.a.r;
import h.f.b.l;
import h.z;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Objects;

public final class RecommendFriendViewHolder extends FindFriendsBaseViewHolder implements au {

    /* renamed from: c  reason: collision with root package name */
    public com.ss.android.ugc.aweme.follow.widet.a f96108c = new com.ss.android.ugc.aweme.follow.widet.a(this.f96115j, new a.g(this) {
        /* class com.ss.android.ugc.aweme.find.viewholder.RecommendFriendViewHolder.AnonymousClass1 */

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ RecommendFriendViewHolder f96116a;

        static {
            Covode.recordClassIndex(60885);
        }

        /* JADX WARN: Incorrect args count in method signature: ()V */
        {
            this.f96116a = r1;
        }

        @Override // com.ss.android.ugc.aweme.follow.widet.a.g, com.ss.android.ugc.aweme.follow.widet.a.f
        public final void a(int i2, User user) {
            if (i2 == 1) {
                com.ss.android.ugc.aweme.friends.e.a.b(user, this.f96116a.f96110e, this.f96116a.f96111f, "find_friends");
                this.f96116a.a(user, u.a.FOLLOW);
                return;
            }
            com.ss.android.ugc.aweme.friends.e.a.c(user, this.f96116a.f96110e, this.f96116a.f96111f, "find_friends");
            this.f96116a.a(user, u.a.FOLLOW_CANCEL);
        }
    });

    /* renamed from: d  reason: collision with root package name */
    public User f96109d;

    /* renamed from: e  reason: collision with root package name */
    public int f96110e;

    /* renamed from: f  reason: collision with root package name */
    public String f96111f = "suggest_account";

    /* renamed from: g  reason: collision with root package name */
    public final com.ss.android.ugc.aweme.recommend.a f96112g;

    /* renamed from: h  reason: collision with root package name */
    public final h.f.a.a<Boolean> f96113h;

    /* renamed from: i  reason: collision with root package name */
    public final r<User, Integer, String, String, z> f96114i;

    /* renamed from: j  reason: collision with root package name */
    private com.ss.android.ugc.aweme.following.ui.view.a f96115j;

    static {
        Covode.recordClassIndex(60884);
    }

    @Override // com.ss.android.ugc.aweme.find.viewholder.FindFriendsBaseViewHolder, androidx.lifecycle.k
    public final void onStateChanged(m mVar, i.a aVar) {
        super.onStateChanged(mVar, aVar);
    }

    public static final class a implements a.d {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ RecommendFriendViewHolder f96119a;

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ User f96120b;

        static {
            Covode.recordClassIndex(60888);
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
                this.f96119a.f96112g.a(followStatus.followStatus, followStatus.followerStatus, null);
            }
        }

        public a(RecommendFriendViewHolder recommendFriendViewHolder, User user) {
            this.f96119a = recommendFriendViewHolder;
            this.f96120b = user;
        }
    }

    public static final class b implements a.e {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ RecommendFriendViewHolder f96121a;

        static {
            Covode.recordClassIndex(60889);
        }

        public b(RecommendFriendViewHolder recommendFriendViewHolder) {
            this.f96121a = recommendFriendViewHolder;
        }

        @Override // com.ss.android.ugc.aweme.follow.widet.a.e
        public final void a(FollowStatus followStatus) {
            l.b(followStatus, "");
            String str = followStatus.userId;
            l.b(str, "");
            if (followStatus.followStatus == 0) {
                com.ss.android.ugc.aweme.common.r.a("follow_cancel_finish", new com.ss.android.ugc.aweme.app.f.d().a("enter_from", "find_friends_page").a("to_user_id", str).f66730a);
            } else {
                com.ss.android.ugc.aweme.common.r.a("follow_finish", new com.ss.android.ugc.aweme.app.f.d().a("enter_from", "find_friends_page").a("to_user_id", str).f66730a);
            }
        }
    }

    public static final class d extends h.f.b.m implements h.f.a.b<FindFriendsState, z> {
        final /* synthetic */ String $uid;
        final /* synthetic */ RecommendFriendViewHolder this$0;

        static {
            Covode.recordClassIndex(60891);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public d(RecommendFriendViewHolder recommendFriendViewHolder, String str) {
            super(1);
            this.this$0 = recommendFriendViewHolder;
            this.$uid = str;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
        @Override // h.f.a.b
        public final /* synthetic */ z invoke(FindFriendsState findFriendsState) {
            int i2;
            String str;
            FindFriendsState findFriendsState2 = findFriendsState;
            l.d(findFriendsState2, "");
            List<com.ss.android.ugc.aweme.find.viewmodel.a> list = findFriendsState2.getList();
            ArrayList arrayList = new ArrayList();
            Iterator<T> it = list.iterator();
            while (true) {
                i2 = 0;
                if (!it.hasNext()) {
                    break;
                }
                T next = it.next();
                if (next.f96132b == 2) {
                    arrayList.add(next);
                }
            }
            for (Object obj : arrayList) {
                int i3 = i2 + 1;
                if (i2 < 0) {
                    n.a();
                }
                User user = ((com.ss.android.ugc.aweme.find.viewmodel.a) obj).f96131a;
                if (user != null) {
                    str = user.getUid();
                } else {
                    str = null;
                }
                if (TextUtils.equals(str, this.$uid)) {
                    this.this$0.f96110e = i2;
                }
                i2 = i3;
            }
            return z.f158842a;
        }
    }

    public static final class c extends h.f.b.m implements h.f.a.b<Integer, z> {
        final /* synthetic */ User $user;
        final /* synthetic */ RecommendFriendViewHolder this$0;

        static {
            Covode.recordClassIndex(60890);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public c(RecommendFriendViewHolder recommendFriendViewHolder, User user) {
            super(1);
            this.this$0 = recommendFriendViewHolder;
            this.$user = user;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
        @Override // h.f.a.b
        public final /* synthetic */ z invoke(Integer num) {
            int intValue = num.intValue();
            if (intValue == com.ss.android.ugc.aweme.friends.ui.au.f97190c) {
                com.ss.android.ugc.aweme.friends.e.a.d(this.$user, this.this$0.f96110e, this.this$0.f96111f, "find_friends");
                this.this$0.a(this.$user, u.a.ENTER_PROFILE);
                View view = this.this$0.itemView;
                l.b(view, "");
                Context context = view.getContext();
                Objects.requireNonNull(context, "null cannot be cast to non-null type android.app.Activity");
                SmartRouter.buildRoute((Activity) context, "aweme://user/profile/" + this.$user.getUid()).withParam("sec_user_id", this.$user.getSecUid()).withParam("enter_from", "find_friends_page").withParam("extra_mutual_relation", this.$user.getMutualStruct()).withParam("recommend_enter_profile_params", new g("find_friends_page", null, u.c.CARD, this.$user.getRecType(), g.a.a(this.$user), this.$user.getUid(), null, null, this.$user.getRequestId(), null, this.$user.getFriendTypeStr(), this.$user.getSocialInfo())).open();
            } else if (intValue == com.ss.android.ugc.aweme.friends.ui.au.f97192e) {
                com.ss.android.ugc.aweme.recommend.users.b bVar = com.ss.android.ugc.aweme.recommend.users.b.f120122a;
                String uid = this.$user.getUid();
                l.b(uid, "");
                bVar.a(uid, this.$user.getSecUid());
                User user = this.$user;
                int i2 = this.this$0.f96110e;
                String str = this.this$0.f96111f;
                l.d(str, "");
                if (user != null) {
                    com.ss.android.ugc.aweme.common.r.a("close_recommend_user_cell", new com.ss.android.ugc.aweme.app.f.d().a("enter_from", "find_friends_page").a("rec_type", user.getRecType()).a("rec_uid", user.getUid()).a("impr_order", i2).a("req_id", user.getRequestId()).a("relation_type", user.getFriendTypeStr()).a("tab_name", "find_friends").a("section", str).f66730a);
                }
                this.this$0.a(this.$user, u.a.CLOSE);
                FindFriendsViewModel findFriendsViewModel = this.this$0.f96077a;
                findFriendsViewModel.b_(new FindFriendsViewModel.b(findFriendsViewModel, this.this$0.getAdapterPosition() - 1));
            }
            return z.f158842a;
        }
    }

    public final void a(User user, u.a aVar) {
        String str;
        u a2 = new u().q(this.f96077a.f96128c).a("find_friends_page");
        a2.f109596a = u.c.CARD;
        a2.f109597b = aVar;
        u a3 = a2.a(user);
        if (user != null) {
            str = user.getRequestId();
        } else {
            str = null;
        }
        a3.s(str).f();
    }

    /* JADX DEBUG: Multi-variable search result rejected for r6v0, resolved type: h.f.a.r<? super com.ss.android.ugc.aweme.profile.model.User, ? super java.lang.Integer, ? super java.lang.String, ? super java.lang.String, h.z> */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public RecommendFriendViewHolder(com.ss.android.ugc.aweme.recommend.a aVar, h.f.a.a<Boolean> aVar2, r<? super User, ? super Integer, ? super String, ? super String, z> rVar) {
        super(aVar.getView());
        l.d(aVar, "");
        l.d(aVar2, "");
        l.d(rVar, "");
        this.f96112g = aVar;
        this.f96113h = aVar2;
        this.f96114i = rVar;
        this.f96115j = aVar.getFollowBtn();
        if (!IMUnder16ProxyImpl.n().d()) {
            aVar.a(true);
            com.ss.android.ugc.aweme.follow.widet.a aVar3 = this.f96108c;
            if (aVar3 != null) {
                aVar3.f96288e = new a.c(this) {
                    /* class com.ss.android.ugc.aweme.find.viewholder.RecommendFriendViewHolder.AnonymousClass2 */

                    /* renamed from: a  reason: collision with root package name */
                    final /* synthetic */ RecommendFriendViewHolder f96117a;

                    static {
                        Covode.recordClassIndex(60886);
                    }

                    {
                        this.f96117a = r1;
                    }

                    @Override // com.ss.android.ugc.aweme.follow.widet.a.c
                    public final boolean a(int i2) {
                        if (i2 != 2) {
                            return false;
                        }
                        if (this.f96117a.f96109d != null) {
                            RecommendFriendViewHolder recommendFriendViewHolder = this.f96117a;
                            User user = recommendFriendViewHolder.f96109d;
                            if (user == null) {
                                l.b();
                            }
                            IMainServiceHelper createIMainServiceHelperbyMonsterPlugin = MainServiceHelperImpl.createIMainServiceHelperbyMonsterPlugin(false);
                            if (createIMainServiceHelperbyMonsterPlugin == null || !createIMainServiceHelperbyMonsterPlugin.shouldRedictToTipsPage() || createIMainServiceHelperbyMonsterPlugin.isChatFunOfflineUnder16()) {
                                IIMService createIIMServicebyMonsterPlugin = IMService.createIIMServicebyMonsterPlugin(false);
                                l.b(createIIMServicebyMonsterPlugin, "");
                                IIMAdapterService d2 = IMAdapterServiceImpl.d();
                                if (!(d2 == null || !d2.a() || createIIMServicebyMonsterPlugin == null)) {
                                    IIMService createIIMServicebyMonsterPlugin2 = IMService.createIIMServicebyMonsterPlugin(false);
                                    View view = recommendFriendViewHolder.itemView;
                                    l.b(view, "");
                                    createIIMServicebyMonsterPlugin2.startChat(a.b.a(view.getContext(), IMUser.fromUser(user)).c("find_friends_page").b("button").f103883a);
                                    recommendFriendViewHolder.a(user, u.a.ENTER_CHAT);
                                }
                            } else {
                                createIMainServiceHelperbyMonsterPlugin.goToTipsPage();
                            }
                        }
                        return true;
                    }
                };
            }
        } else {
            aVar.a(false);
        }
        aVar.getView().addOnAttachStateChangeListener(new View.OnAttachStateChangeListener(this) {
            /* class com.ss.android.ugc.aweme.find.viewholder.RecommendFriendViewHolder.AnonymousClass3 */

            /* renamed from: a  reason: collision with root package name */
            final /* synthetic */ RecommendFriendViewHolder f96118a;

            static {
                Covode.recordClassIndex(60887);
            }

            public final void onViewDetachedFromWindow(View view) {
            }

            /* JADX WARN: Incorrect args count in method signature: ()V */
            {
                this.f96118a = r1;
            }

            public final void onViewAttachedToWindow(View view) {
                String str;
                User user;
                RecommendFriendViewHolder recommendFriendViewHolder = this.f96118a;
                if (!recommendFriendViewHolder.f96113h.invoke().booleanValue() && (user = recommendFriendViewHolder.f96109d) != null) {
                    recommendFriendViewHolder.f96114i.a(user, Integer.valueOf(recommendFriendViewHolder.f96110e), recommendFriendViewHolder.f96111f, recommendFriendViewHolder.f96077a.f96128c);
                }
                User user2 = recommendFriendViewHolder.f96109d;
                if (user2 != null && user2.isShould_write_impr()) {
                    e eVar = e.a.f112592a;
                    User user3 = recommendFriendViewHolder.f96109d;
                    if (user3 != null) {
                        str = user3.getUid();
                    } else {
                        str = null;
                    }
                    eVar.a(1, str);
                }
            }
        });
    }
}
