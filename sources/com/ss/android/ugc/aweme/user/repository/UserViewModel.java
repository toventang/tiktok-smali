package com.ss.android.ugc.aweme.user.repository;

import com.bytedance.covode.number.Covode;
import com.bytedance.jedi.arch.JediViewModel;
import com.bytedance.jedi.arch.ah;
import com.bytedance.jedi.arch.aj;
import com.bytedance.jedi.arch.aq;
import com.bytedance.jedi.arch.f;
import com.ss.android.ugc.aweme.IAccountUserService;
import com.ss.android.ugc.aweme.base.api.BaseResponse;
import com.ss.android.ugc.aweme.common.r;
import com.ss.android.ugc.aweme.feedback.runtime.behavior.RuntimeBehaviorServiceImpl;
import com.ss.android.ugc.aweme.profile.model.FollowStatus;
import com.ss.android.ugc.aweme.profile.model.User;
import com.ss.android.ugc.aweme.profile.presenter.n;
import com.ss.android.ugc.aweme.profile.ui.ae;
import com.ss.android.ugc.aweme.userservice.UserService;
import com.ss.android.ugc.aweme.userservice.api.IUserService;
import h.f.b.j;
import h.f.b.l;
import h.f.b.m;
import h.z;

public final class UserViewModel extends JediViewModel<UserState> {

    /* renamed from: a  reason: collision with root package name */
    public final String f142419a = "follow_user";

    /* renamed from: b  reason: collision with root package name */
    public final String f142420b = "unfollow_user";

    static {
        Covode.recordClassIndex(93139);
    }

    public final void a() {
        c(e.f142425a);
    }

    public static final class d extends m implements h.f.a.m<UserState, com.bytedance.jedi.arch.a<? extends BaseResponse>, UserState> {

        /* renamed from: a  reason: collision with root package name */
        public static final d f142423a = new d();

        static {
            Covode.recordClassIndex(93145);
        }

        d() {
            super(2);
        }

        static final /* synthetic */ class a extends j implements h.f.a.a<Integer> {
            static {
                Covode.recordClassIndex(93147);
            }

            a(User user) {
                super(0, user, User.class, "getFansCount", "getFansCount()I", 0);
            }

            /* Return type fixed from 'java.lang.Object' to match base method */
            @Override // h.f.a.a
            public final /* synthetic */ Integer invoke() {
                return Integer.valueOf(((User) this.receiver).getFansCount());
            }
        }

        static final /* synthetic */ class c extends j implements h.f.a.a<Integer> {
            static {
                Covode.recordClassIndex(93149);
            }

            c(User user) {
                super(0, user, User.class, "getFollowerCount", "getFollowerCount()I", 0);
            }

            /* Return type fixed from 'java.lang.Object' to match base method */
            @Override // h.f.a.a
            public final /* synthetic */ Integer invoke() {
                return Integer.valueOf(((User) this.receiver).getFollowerCount());
            }
        }

        static final /* synthetic */ class b extends j implements h.f.a.b<Integer, z> {
            static {
                Covode.recordClassIndex(93148);
            }

            b(User user) {
                super(1, user, User.class, "setFansCount", "setFansCount(I)V", 0);
            }

            /* Return type fixed from 'java.lang.Object' to match base method */
            /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
            @Override // h.f.a.b
            public final /* synthetic */ z invoke(Integer num) {
                ((User) this.receiver).setFansCount(num.intValue());
                return z.f158842a;
            }
        }

        /* renamed from: com.ss.android.ugc.aweme.user.repository.UserViewModel$d$d  reason: collision with other inner class name */
        static final /* synthetic */ class C3808d extends j implements h.f.a.b<Integer, z> {
            static {
                Covode.recordClassIndex(93150);
            }

            C3808d(User user) {
                super(1, user, User.class, "setFollowerCount", "setFollowerCount(I)V", 0);
            }

            /* Return type fixed from 'java.lang.Object' to match base method */
            /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
            @Override // h.f.a.b
            public final /* synthetic */ z invoke(Integer num) {
                ((User) this.receiver).setFollowerCount(num.intValue());
                return z.f158842a;
            }
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object, java.lang.Object] */
        @Override // h.f.a.m
        public final /* synthetic */ UserState invoke(UserState userState, com.bytedance.jedi.arch.a<? extends BaseResponse> aVar) {
            UserState userState2 = userState;
            com.bytedance.jedi.arch.a<? extends BaseResponse> aVar2 = aVar;
            l.d(userState2, "");
            l.d(aVar2, "");
            if (aVar2 instanceof aj) {
                Object a2 = aVar2.a();
                if (a2 == null) {
                    l.b();
                }
                if (((BaseResponse) a2).status_code == 0) {
                    IAccountUserService g2 = com.ss.android.ugc.aweme.account.b.g();
                    l.b(g2, "");
                    User curUser = g2.getCurUser();
                    AnonymousClass1 r2 = AnonymousClass1.f142424a;
                    if (ae.a(curUser)) {
                        r2.invoke(new a(curUser), new b(curUser));
                    } else {
                        r2.invoke(new c(curUser), new C3808d(curUser));
                    }
                    return UserState.copy$default(userState2, null, true, null, null, null, 29, null);
                }
            }
            if (aVar2 instanceof f) {
                return UserState.copy$default(userState2, null, false, null, null, ((f) aVar2).f39461a, 15, null);
            }
            return userState2;
        }
    }

    /* Return type fixed from 'com.bytedance.jedi.arch.af' to match base method */
    @Override // com.bytedance.jedi.arch.JediViewModel
    public final /* synthetic */ UserState d() {
        return new UserState(null, false, null, null, null, 31, null);
    }

    @Override // com.bytedance.jedi.arch.JediViewModel
    public final void bg_() {
        super.bg_();
        b_(new c(this));
        a(a(a.f142426a, new ah(), b.f142421a));
    }

    static final class b extends m implements h.f.a.b<Throwable, z> {

        /* renamed from: a  reason: collision with root package name */
        public static final b f142421a = new b();

        static {
            Covode.recordClassIndex(93141);
        }

        b() {
            super(1);
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
        @Override // h.f.a.b
        public final /* synthetic */ z invoke(Throwable th) {
            Throwable th2 = th;
            if (th2 instanceof com.ss.android.ugc.aweme.base.api.a.b.a) {
                com.ss.android.ugc.aweme.app.api.b.a.a(com.bytedance.ies.ugc.appcontext.d.a(), (com.ss.android.ugc.aweme.base.api.a.b.a) th2);
            } else if (th2 != null) {
                com.ss.android.ugc.aweme.framework.a.a.a(th2);
            }
            return z.f158842a;
        }
    }

    /* access modifiers changed from: package-private */
    public static final class e extends m implements h.f.a.b<UserState, UserState> {

        /* renamed from: a  reason: collision with root package name */
        public static final e f142425a = new e();

        static {
            Covode.recordClassIndex(93151);
        }

        e() {
            super(1);
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
        @Override // h.f.a.b
        public final /* synthetic */ UserState invoke(UserState userState) {
            UserState userState2 = userState;
            l.d(userState2, "");
            return UserState.copy$default(userState2, null, false, aq.f39400a, null, null, 27, null);
        }
    }

    static final class c extends m implements h.f.a.b<UserState, z> {
        final /* synthetic */ UserViewModel this$0;

        static {
            Covode.recordClassIndex(93142);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        c(UserViewModel userViewModel) {
            super(1);
            this.this$0 = userViewModel;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
        @Override // h.f.a.b
        public final /* synthetic */ z invoke(UserState userState) {
            UserState userState2 = userState;
            l.d(userState2, "");
            String uid = userState2.getUser().getUid();
            if (uid == null || uid.length() == 0) {
                com.ss.android.ugc.aweme.framework.a.a.a(6, "UserViewModel", "Uid is unexpected null or empty when observer user change.");
            } else {
                UserViewModel userViewModel = this.this$0;
                IUserService d2 = UserService.d();
                String uid2 = userState2.getUser().getUid();
                l.b(uid2, "");
                f.a.b.b d3 = d2.a(uid2).d(new f.a.d.f(this) {
                    /* class com.ss.android.ugc.aweme.user.repository.UserViewModel.c.AnonymousClass1 */

                    /* renamed from: a  reason: collision with root package name */
                    final /* synthetic */ c f142422a;

                    static {
                        Covode.recordClassIndex(93143);
                    }

                    {
                        this.f142422a = r1;
                    }

                    /* renamed from: com.ss.android.ugc.aweme.user.repository.UserViewModel$c$1$a */
                    static final class a extends m implements h.f.a.b<UserState, UserState> {
                        final /* synthetic */ User $user;

                        static {
                            Covode.recordClassIndex(93144);
                        }

                        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
                        a(User user) {
                            super(1);
                            this.$user = user;
                        }

                        /* Return type fixed from 'java.lang.Object' to match base method */
                        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
                        @Override // h.f.a.b
                        public final /* synthetic */ UserState invoke(UserState userState) {
                            UserState userState2 = userState;
                            l.d(userState2, "");
                            return UserState.copy$default(userState2, this.$user, false, null, null, null, 30, null);
                        }
                    }

                    @Override // f.a.d.f
                    public final /* synthetic */ void accept(Object obj) {
                        User user = (User) ((com.bytedance.jedi.a.c.f) obj).a();
                        if (user != null) {
                            this.f142422a.this$0.c(new a(user));
                        }
                    }
                });
                l.b(d3, "");
                userViewModel.a(d3);
            }
            return z.f158842a;
        }
    }

    public final void a(n nVar) {
        l.d(nVar, "");
        a(UserService.d().a(nVar.f116590a, nVar.f116591b, nVar.f116592c, com.ss.android.ugc.aweme.app.c.c.a(nVar.f116595f), nVar.f116593d, nVar.f116596g, nVar.f116594e), new a(this, nVar));
    }

    /* access modifiers changed from: package-private */
    public static final class a extends m implements h.f.a.m<UserState, com.bytedance.jedi.arch.a<? extends FollowStatus>, UserState> {
        final /* synthetic */ n $param;
        final /* synthetic */ UserViewModel this$0;

        static {
            Covode.recordClassIndex(93140);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        a(UserViewModel userViewModel, n nVar) {
            super(2);
            this.this$0 = userViewModel;
            this.$param = nVar;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object, java.lang.Object] */
        @Override // h.f.a.m
        public final /* synthetic */ UserState invoke(UserState userState, com.bytedance.jedi.arch.a<? extends FollowStatus> aVar) {
            UserState userState2 = userState;
            com.bytedance.jedi.arch.a<? extends FollowStatus> aVar2 = aVar;
            l.d(userState2, "");
            l.d(aVar2, "");
            if (aVar2 instanceof aj) {
                User clone = userState2.getUser().clone();
                l.b(clone, "");
                clone.setFollowStatus(((aj) aVar2).f39383a.followStatus);
                l.b(clone, "");
                return UserState.copy$default(userState2, clone, false, aVar2, null, null, 26, null);
            }
            if (aVar2 instanceof f) {
                Throwable th = ((f) aVar2).f39461a;
                if (th instanceof com.ss.android.ugc.aweme.base.api.a.b.a) {
                    if (this.$param.f116592c == 0) {
                        RuntimeBehaviorServiceImpl.c().a(this.this$0.f142420b, String.valueOf(((com.ss.android.ugc.aweme.base.api.a.a) th).getErrorCode()));
                    } else if (this.$param.f116592c == 0) {
                        RuntimeBehaviorServiceImpl.c().a(this.this$0.f142419a, String.valueOf(((com.ss.android.ugc.aweme.base.api.a.a) th).getErrorCode()));
                    }
                }
            }
            return UserState.copy$default(userState2, null, false, aVar2, null, null, 27, null);
        }
    }

    public static void a(String str, String str2, int i2) {
        l.d(str, "");
        l.d(str2, "");
        if (i2 == 0) {
            r.a("follow_cancel_finish", new com.ss.android.ugc.aweme.app.f.d().a("enter_from", str).a("to_user_id", str2).f66730a);
        } else {
            r.a("follow_finish", new com.ss.android.ugc.aweme.app.f.d().a("enter_from", str).a("to_user_id", str2).f66730a);
        }
    }
}
