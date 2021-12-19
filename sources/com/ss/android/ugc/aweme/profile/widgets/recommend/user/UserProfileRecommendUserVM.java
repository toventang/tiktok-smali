package com.ss.android.ugc.aweme.profile.widgets.recommend.user;

import android.text.TextUtils;
import com.bytedance.assem.arch.viewModel.AssemViewModel;
import com.bytedance.covode.number.Covode;
import com.ss.android.ugc.aweme.common.r;
import com.ss.android.ugc.aweme.friends.model.RecommendList;
import com.ss.android.ugc.aweme.newfollow.c.e;
import com.ss.android.ugc.aweme.profile.f.ad;
import com.ss.android.ugc.aweme.profile.model.User;
import com.ss.android.ugc.aweme.profile.ui.v2.ac;
import com.ss.android.ugc.aweme.utils.eu;
import h.f.b.ab;
import h.z;
import java.util.List;
import kotlinx.coroutines.am;
import kotlinx.coroutines.bz;

public final class UserProfileRecommendUserVM extends AssemViewModel<e> {
    public static final a n = new a((byte) 0);

    /* renamed from: j  reason: collision with root package name */
    public final f.a.b.a f118037j = new f.a.b.a();

    /* renamed from: k  reason: collision with root package name */
    public User f118038k;

    /* renamed from: l  reason: collision with root package name */
    public boolean f118039l;

    /* renamed from: m  reason: collision with root package name */
    public final com.bytedance.assem.arch.a.a<c> f118040m;
    private final h.h o = h.i.a((h.f.a.a) new c(this));

    static {
        Covode.recordClassIndex(76596);
    }

    public final String g() {
        return (String) this.o.getValue();
    }

    public static final class a {
        static {
            Covode.recordClassIndex(76597);
        }

        private a() {
        }

        public /* synthetic */ a(byte b2) {
            this();
        }
    }

    /* Return type fixed from 'com.bytedance.assem.arch.viewModel.j' to match base method */
    @Override // com.bytedance.assem.arch.viewModel.AssemViewModel
    public final /* synthetic */ e f() {
        return new e();
    }

    static final class c extends h.f.b.m implements h.f.a.a<String> {
        final /* synthetic */ UserProfileRecommendUserVM this$0;

        static {
            Covode.recordClassIndex(76599);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        c(UserProfileRecommendUserVM userProfileRecommendUserVM) {
            super(0);
            this.this$0 = userProfileRecommendUserVM;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        @Override // h.f.a.a
        public final /* synthetic */ String invoke() {
            if (!this.this$0.i()) {
                return "[\"private_account\", \"no_content_account\"]";
            }
            return "";
        }
    }

    public final void k() {
        if (j()) {
            b(new i(this));
        }
    }

    public final void l() {
        b(new h(this));
    }

    public final void m() {
        b(new d(this));
    }

    public static boolean j() {
        if (!com.ss.android.ugc.aweme.recommend.users.b.f120122a.b()) {
            return com.ss.android.ugc.aweme.recommend.users.b.f120122a.f();
        }
        if (com.bytedance.ies.abmock.b.a().a(true, "other_page_recommend_users", 0) == 1) {
            return true;
        }
        return false;
    }

    private final boolean n() {
        User user = this.f118038k;
        if (user == null || user.getFollowerCount() >= 1000 || user.getAccountType() == 2 || user.getAccountType() == 3) {
            return true;
        }
        return false;
    }

    public final boolean h() {
        if (n()) {
            return false;
        }
        if (com.ss.android.ugc.aweme.profile.experiment.k.b() && !com.ss.android.ugc.aweme.profile.experiment.k.c()) {
            return true;
        }
        if (this.f118039l || !com.ss.android.ugc.aweme.profile.experiment.k.c()) {
            return false;
        }
        return true;
    }

    public final boolean i() {
        if ((((Boolean) com.ss.android.ugc.aweme.profile.experiment.k.f116357a.getValue()).booleanValue() || com.ss.android.ugc.aweme.profile.experiment.k.c()) && this.f118039l && !n()) {
            return false;
        }
        return true;
    }

    public final void a(boolean z) {
        b(new p(this, z));
    }

    static final class l extends h.f.b.m implements h.f.a.b<e, z> {
        final /* synthetic */ UserProfileRecommendUserVM this$0;

        static {
            Covode.recordClassIndex(76621);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        l(UserProfileRecommendUserVM userProfileRecommendUserVM) {
            super(1);
            this.this$0 = userProfileRecommendUserVM;
        }

        static final class a extends h.f.b.m implements h.f.a.b<User, Boolean> {

            /* renamed from: a  reason: collision with root package name */
            public static final a f118049a = new a();

            static {
                Covode.recordClassIndex(76623);
            }

            a() {
                super(1);
            }

            /* Return type fixed from 'java.lang.Object' to match base method */
            /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
            @Override // h.f.a.b
            public final /* synthetic */ Boolean invoke(User user) {
                boolean z;
                User user2 = user;
                h.f.b.l.b(user2, "");
                if (user2.getFollowStatus() != 0) {
                    z = true;
                } else {
                    z = false;
                }
                return Boolean.valueOf(z);
            }
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
        /* JADX WARNING: Code restructure failed: missing block: B:7:0x001a, code lost:
            r2 = r0.clone();
         */
        @Override // h.f.a.b
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public final /* synthetic */ h.z invoke(com.ss.android.ugc.aweme.profile.widgets.recommend.user.e r4) {
            /*
                r3 = this;
                com.ss.android.ugc.aweme.profile.widgets.recommend.user.e r4 = (com.ss.android.ugc.aweme.profile.widgets.recommend.user.e) r4
                java.lang.String r0 = ""
                h.f.b.l.d(r4, r0)
                com.ss.android.ugc.aweme.friends.model.RecommendList r1 = r4.f118057b
                r0 = 0
                if (r1 == 0) goto L_0x0010
                java.util.List r0 = r1.getUserList()
            L_0x0010:
                boolean r0 = com.ss.android.ugc.tools.utils.d.a(r0)
                if (r0 != 0) goto L_0x0038
                com.ss.android.ugc.aweme.friends.model.RecommendList r0 = r4.f118057b
                if (r0 == 0) goto L_0x0038
                com.ss.android.ugc.aweme.friends.model.RecommendList r2 = r0.clone()
                if (r2 == 0) goto L_0x0038
                java.util.List r1 = r2.getUserList()
                if (r1 == 0) goto L_0x0038
                com.ss.android.ugc.aweme.profile.widgets.recommend.user.UserProfileRecommendUserVM$l$a r0 = com.ss.android.ugc.aweme.profile.widgets.recommend.user.UserProfileRecommendUserVM.l.a.f118049a
                boolean r0 = h.a.n.a(r1, r0)
                if (r0 == 0) goto L_0x0038
                com.ss.android.ugc.aweme.profile.widgets.recommend.user.UserProfileRecommendUserVM r1 = r3.this$0
                com.ss.android.ugc.aweme.profile.widgets.recommend.user.UserProfileRecommendUserVM$l$1 r0 = new com.ss.android.ugc.aweme.profile.widgets.recommend.user.UserProfileRecommendUserVM$l$1
                r0.<init>(r2)
                r1.a(r0)
            L_0x0038:
                h.z r0 = h.z.f158842a
                return r0
            */
            throw new UnsupportedOperationException("Method not decompiled: com.ss.android.ugc.aweme.profile.widgets.recommend.user.UserProfileRecommendUserVM.l.invoke(java.lang.Object):java.lang.Object");
        }
    }

    static final class b extends h.f.b.m implements h.f.a.b<e, e> {

        /* renamed from: a  reason: collision with root package name */
        public static final b f118041a = new b();

        static {
            Covode.recordClassIndex(76598);
        }

        b() {
            super(1);
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
        @Override // h.f.a.b
        public final /* synthetic */ e invoke(e eVar) {
            e eVar2 = eVar;
            h.f.b.l.d(eVar2, "");
            return e.a(eVar2, null, null, 0, null, false, 0, 0, 125);
        }
    }

    /* access modifiers changed from: package-private */
    public static final class d extends h.f.b.m implements h.f.a.b<e, z> {
        final /* synthetic */ UserProfileRecommendUserVM this$0;

        static {
            Covode.recordClassIndex(76600);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        d(UserProfileRecommendUserVM userProfileRecommendUserVM) {
            super(1);
            this.this$0 = userProfileRecommendUserVM;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
        @Override // h.f.a.b
        public final /* synthetic */ z invoke(e eVar) {
            e eVar2 = eVar;
            h.f.b.l.d(eVar2, "");
            if (eVar2.f118061f == 2) {
                this.this$0.a(AnonymousClass1.f118042a);
            }
            return z.f158842a;
        }
    }

    static final class n extends h.f.b.m implements h.f.a.b<e, e> {
        final /* synthetic */ long $time;

        static {
            Covode.recordClassIndex(76625);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        n(long j2) {
            super(1);
            this.$time = j2;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
        @Override // h.f.a.b
        public final /* synthetic */ e invoke(e eVar) {
            e eVar2 = eVar;
            h.f.b.l.d(eVar2, "");
            return e.a(eVar2, null, null, this.$time, null, false, 0, 0, 123);
        }
    }

    static final class o extends h.f.b.m implements h.f.a.b<e, e> {
        final /* synthetic */ boolean $direct;

        static {
            Covode.recordClassIndex(76626);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        o(boolean z) {
            super(1);
            this.$direct = z;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
        @Override // h.f.a.b
        public final /* synthetic */ e invoke(e eVar) {
            e eVar2 = eVar;
            h.f.b.l.d(eVar2, "");
            return e.a(eVar2, null, null, 0, null, this.$direct, 0, 0, 111);
        }
    }

    public UserProfileRecommendUserVM(com.bytedance.assem.arch.a.a<c> aVar) {
        h.f.b.l.d(aVar, "");
        this.f118040m = aVar;
    }

    /* access modifiers changed from: package-private */
    public static final class e extends h.f.b.m implements h.f.a.b<e, z> {
        final /* synthetic */ int $cursor;
        final /* synthetic */ UserProfileRecommendUserVM this$0;

        static {
            Covode.recordClassIndex(76602);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        e(UserProfileRecommendUserVM userProfileRecommendUserVM, int i2) {
            super(1);
            this.this$0 = userProfileRecommendUserVM;
            this.$cursor = i2;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
        @Override // h.f.a.b
        public final /* synthetic */ z invoke(e eVar) {
            final e eVar2 = eVar;
            h.f.b.l.d(eVar2, "");
            final ac acVar = (ac) com.bytedance.assem.arch.service.d.a(this.this$0, ab.a(com.ss.android.ugc.aweme.profile.ui.v2.ab.class));
            bz unused = kotlinx.coroutines.i.a(this.this$0.aH_(), null, null, new h.f.a.m<am, h.c.d<? super z>, Object>(this, null) {
                /* class com.ss.android.ugc.aweme.profile.widgets.recommend.user.UserProfileRecommendUserVM.e.AnonymousClass1 */
                int label;
                final /* synthetic */ e this$0;

                static {
                    Covode.recordClassIndex(76603);
                }

                {
                    this.this$0 = r2;
                }

                @Override // h.c.b.a.a
                public final h.c.d<z> create(Object obj, h.c.d<?> dVar) {
                    h.f.b.l.d(dVar, "");
                    return 

                    /* access modifiers changed from: package-private */
                    public static final class k extends h.f.b.m implements h.f.a.b<e, z> {
                        final /* synthetic */ int $addressBookAccess;
                        final /* synthetic */ int $moonAccess;
                        final /* synthetic */ String $puid;
                        final /* synthetic */ int $recommendType = 1;
                        final /* synthetic */ String $secUserId;
                        final /* synthetic */ String $targetUserId;
                        final /* synthetic */ UserProfileRecommendUserVM this$0;

                        static {
                            Covode.recordClassIndex(76613);
                        }

                        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
                        k(UserProfileRecommendUserVM userProfileRecommendUserVM, String str, int i2) {
                            super(1);
                            this.this$0 = userProfileRecommendUserVM;
                            this.$targetUserId = str;
                            this.$addressBookAccess = i2;
                            this.$puid = null;
                            this.$moonAccess = 2;
                            this.$secUserId = null;
                        }

                        /* Return type fixed from 'java.lang.Object' to match base method */
                        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
                        @Override // h.f.a.b
                        public final /* synthetic */ z invoke(e eVar) {
                            final e eVar2 = eVar;
                            h.f.b.l.d(eVar2, "");
                            if (!(eVar2.f118056a instanceof com.bytedance.assem.arch.extensions.n)) {
                                this.this$0.a(AnonymousClass1.f118045a);
                                bz unused = kotlinx.coroutines.i.a(this.this$0.aH_(), null, null, new h.f.a.m<am, h.c.d<? super z>, Object>(this, null) {
                                    /* class com.ss.android.ugc.aweme.profile.widgets.recommend.user.UserProfileRecommendUserVM.k.AnonymousClass2 */
                                    int label;
                                    final /* synthetic */ k this$0;

                                    static {
                                        Covode.recordClassIndex(76615);
                                    }

                                    {
                                        this.this$0 = r2;
                                    }

                                    @Override // h.c.b.a.a
                                    public final h.c.d<z> create(Object obj, h.c.d<?> dVar) {
                                        h.f.b.l.d(dVar, "");
                                        return 

                                        /* access modifiers changed from: package-private */
                                        public static final class h extends h.f.b.m implements h.f.a.b<e, z> {
                                            final /* synthetic */ UserProfileRecommendUserVM this$0;

                                            static {
                                                Covode.recordClassIndex(76609);
                                            }

                                            /* JADX INFO: super call moved to the top of the method (can break code semantics) */
                                            h(UserProfileRecommendUserVM userProfileRecommendUserVM) {
                                                super(1);
                                                this.this$0 = userProfileRecommendUserVM;
                                            }

                                            /* Return type fixed from 'java.lang.Object' to match base method */
                                            /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
                                            @Override // h.f.a.b
                                            public final /* synthetic */ z invoke(e eVar) {
                                                User user;
                                                String recType;
                                                e eVar2 = eVar;
                                                String str = "";
                                                h.f.b.l.d(eVar2, str);
                                                if (eVar2.f118061f != 2) {
                                                    com.ss.android.ugc.aweme.profile.widgets.common.i iVar = (com.ss.android.ugc.aweme.profile.widgets.common.i) com.bytedance.assem.arch.service.d.a(this.this$0, ab.a(com.ss.android.ugc.aweme.profile.widgets.common.j.class));
                                                    String str2 = null;
                                                    if (iVar != null) {
                                                        user = iVar.f117705a;
                                                    } else {
                                                        user = null;
                                                    }
                                                    ac acVar = (ac) com.bytedance.assem.arch.service.d.a(this.this$0, ab.a(com.ss.android.ugc.aweme.profile.ui.v2.ab.class));
                                                    if (acVar != null) {
                                                        str2 = acVar.f117243a;
                                                    }
                                                    if (!(user == null || (recType = user.getRecType()) == null)) {
                                                        str = recType;
                                                    }
                                                    ad.a(str2, str, Boolean.valueOf(eVar2.f118060e));
                                                    this.this$0.a(AnonymousClass1.f118044a);
                                                }
                                                return z.f158842a;
                                            }
                                        }

                                        static final class i extends h.f.b.m implements h.f.a.b<e, z> {
                                            final /* synthetic */ UserProfileRecommendUserVM this$0;

                                            static {
                                                Covode.recordClassIndex(76611);
                                            }

                                            /* JADX INFO: super call moved to the top of the method (can break code semantics) */
                                            i(UserProfileRecommendUserVM userProfileRecommendUserVM) {
                                                super(1);
                                                this.this$0 = userProfileRecommendUserVM;
                                            }

                                            /* Return type fixed from 'java.lang.Object' to match base method */
                                            /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
                                            @Override // h.f.a.b
                                            public final /* synthetic */ z invoke(e eVar) {
                                                e eVar2 = eVar;
                                                h.f.b.l.d(eVar2, "");
                                                if (System.currentTimeMillis() - eVar2.f118058c >= 500) {
                                                    this.this$0.a(new n(System.currentTimeMillis()));
                                                    if (eVar2.f118061f == -1 || eVar2.f118061f == 0 || eVar2.f118061f == 3) {
                                                        this.this$0.a(true);
                                                    } else if (eVar2.f118061f == 2) {
                                                        this.this$0.m();
                                                    }
                                                }
                                                return z.f158842a;
                                            }
                                        }

                                        static final class f extends h.f.b.m implements h.f.a.b<e, z> {
                                            final /* synthetic */ User $user;
                                            final /* synthetic */ UserProfileRecommendUserVM this$0;

                                            static {
                                                Covode.recordClassIndex(76607);
                                            }

                                            /* JADX INFO: super call moved to the top of the method (can break code semantics) */
                                            f(UserProfileRecommendUserVM userProfileRecommendUserVM, User user) {
                                                super(1);
                                                this.this$0 = userProfileRecommendUserVM;
                                                this.$user = user;
                                            }

                                            /* Return type fixed from 'java.lang.Object' to match base method */
                                            /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
                                            @Override // h.f.a.b
                                            public final /* synthetic */ z invoke(e eVar) {
                                                String str;
                                                int i2;
                                                List<User> userList;
                                                e eVar2 = eVar;
                                                h.f.b.l.d(eVar2, "");
                                                String requestId = this.$user.getRequestId();
                                                User user = this.$user;
                                                ac acVar = (ac) com.bytedance.assem.arch.service.d.a(this.this$0, ab.a(com.ss.android.ugc.aweme.profile.ui.v2.ab.class));
                                                if (acVar != null) {
                                                    str = acVar.f117243a;
                                                } else {
                                                    str = null;
                                                }
                                                String recType = this.$user.getRecType();
                                                RecommendList recommendList = eVar2.f118057b;
                                                if (recommendList == null || (userList = recommendList.getUserList()) == null) {
                                                    i2 = -1;
                                                } else {
                                                    i2 = userList.indexOf(this.$user);
                                                }
                                                com.ss.android.ugc.aweme.app.f.d a2 = new com.ss.android.ugc.aweme.app.f.d().a("enter_method", "click_card").a("enter_from", "others_homepage").a("to_user_id", user.getUid()).a("req_id", requestId).a("impr_order", i2).a("impr_id", requestId).a("rec_type", recType).a("from_user_id", str);
                                                eu.a(a2, user);
                                                r.a("enter_personal_detail", a2.f66730a);
                                                return z.f158842a;
                                            }
                                        }

                                        static final class j extends h.f.b.m implements h.f.a.b<e, z> {
                                            final /* synthetic */ User $user;
                                            final /* synthetic */ UserProfileRecommendUserVM this$0;

                                            static {
                                                Covode.recordClassIndex(76612);
                                            }

                                            /* JADX INFO: super call moved to the top of the method (can break code semantics) */
                                            j(UserProfileRecommendUserVM userProfileRecommendUserVM, User user) {
                                                super(1);
                                                this.this$0 = userProfileRecommendUserVM;
                                                this.$user = user;
                                            }

                                            /* Return type fixed from 'java.lang.Object' to match base method */
                                            /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
                                            @Override // h.f.a.b
                                            public final /* synthetic */ z invoke(e eVar) {
                                                int i2;
                                                String str;
                                                List<User> userList;
                                                e eVar2 = eVar;
                                                h.f.b.l.d(eVar2, "");
                                                ac acVar = (ac) com.bytedance.assem.arch.service.d.a(this.this$0, ab.a(com.ss.android.ugc.aweme.profile.ui.v2.ab.class));
                                                String requestId = this.$user.getRequestId();
                                                RecommendList recommendList = eVar2.f118057b;
                                                if (recommendList == null || (userList = recommendList.getUserList()) == null) {
                                                    i2 = 0;
                                                } else {
                                                    i2 = userList.indexOf(this.$user);
                                                }
                                                String uid = this.$user.getUid();
                                                if (acVar != null) {
                                                    str = acVar.f117243a;
                                                } else {
                                                    str = null;
                                                }
                                                r.a("follow_card", new com.ss.android.ugc.aweme.app.f.d().a("enter_from", "others_homepage").a("event_type", "impression").a("req_id", requestId).a("impr_order", i2).a("rec_type", this.$user.getRecType()).a("relation_type", this.$user.getFriendTypeStr()).a("rec_uid", uid).a("from_user_id", str).f66730a);
                                                if (!eVar2.f118059d.contains(this.$user.getUid())) {
                                                    e.a.f112592a.a(1, this.$user.getUid());
                                                    List<String> list = eVar2.f118059d;
                                                    String uid2 = this.$user.getUid();
                                                    h.f.b.l.b(uid2, "");
                                                    list.add(uid2);
                                                }
                                                return z.f158842a;
                                            }
                                        }

                                        static final class m extends h.f.b.m implements h.f.a.b<e, e> {
                                            final /* synthetic */ String $uid;
                                            final /* synthetic */ User $user;

                                            static {
                                                Covode.recordClassIndex(76624);
                                            }

                                            /* JADX INFO: super call moved to the top of the method (can break code semantics) */
                                            m(User user, String str) {
                                                super(1);
                                                this.$user = user;
                                                this.$uid = str;
                                            }

                                            /* Return type fixed from 'java.lang.Object' to match base method */
                                            /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
                                            @Override // h.f.a.b
                                            public final /* synthetic */ e invoke(e eVar) {
                                                int i2;
                                                RecommendList recommendList;
                                                List<User> userList;
                                                List<User> userList2;
                                                e eVar2 = eVar;
                                                h.f.b.l.d(eVar2, "");
                                                String uid = this.$user.getUid();
                                                RecommendList recommendList2 = eVar2.f118057b;
                                                if (recommendList2 == null || (userList2 = recommendList2.getUserList()) == null) {
                                                    i2 = 0;
                                                } else {
                                                    i2 = userList2.indexOf(this.$user);
                                                }
                                                String requestId = this.$user.getRequestId();
                                                r.a("follow_card", new com.ss.android.ugc.aweme.app.f.d().a("rec_uid", uid).a("enter_from", "others_homepage").a("event_type", "delete").a("impr_order", i2).a("rec_type", this.$user.getRecType()).a("relation_type", this.$user.getFriendTypeStr()).a("req_id", requestId).a("from_user_id", this.$uid).f66730a);
                                                RecommendList recommendList3 = eVar2.f118057b;
                                                if (recommendList3 != null) {
                                                    recommendList = recommendList3.clone();
                                                } else {
                                                    recommendList = null;
                                                }
                                                if (!(recommendList == null || (userList = recommendList.getUserList()) == null)) {
                                                    userList.remove(this.$user);
                                                }
                                                return e.a(eVar2, null, recommendList, 0, null, false, 0, 0, 125);
                                            }
                                        }

                                        /* access modifiers changed from: package-private */
                                        public static final class p extends h.f.b.m implements h.f.a.b<e, z> {
                                            final /* synthetic */ boolean $manual;
                                            final /* synthetic */ UserProfileRecommendUserVM this$0;

                                            static {
                                                Covode.recordClassIndex(76627);
                                            }

                                            /* JADX INFO: super call moved to the top of the method (can break code semantics) */
                                            p(UserProfileRecommendUserVM userProfileRecommendUserVM, boolean z) {
                                                super(1);
                                                this.this$0 = userProfileRecommendUserVM;
                                                this.$manual = z;
                                            }

                                            /* Return type fixed from 'java.lang.Object' to match base method */
                                            /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
                                            @Override // h.f.a.b
                                            public final /* synthetic */ z invoke(e eVar) {
                                                String str;
                                                String str2;
                                                User user;
                                                e eVar2 = eVar;
                                                h.f.b.l.d(eVar2, "");
                                                if (eVar2.f118061f != 2) {
                                                    this.this$0.a(new o(!this.$manual));
                                                    com.ss.android.ugc.aweme.profile.widgets.common.i iVar = (com.ss.android.ugc.aweme.profile.widgets.common.i) com.bytedance.assem.arch.service.d.a(this.this$0, ab.a(com.ss.android.ugc.aweme.profile.widgets.common.j.class));
                                                    ac acVar = (ac) com.bytedance.assem.arch.service.d.a(this.this$0, ab.a(com.ss.android.ugc.aweme.profile.ui.v2.ab.class));
                                                    String str3 = null;
                                                    if (acVar != null) {
                                                        str = acVar.f117244b;
                                                    } else {
                                                        str = null;
                                                    }
                                                    if (!TextUtils.isEmpty(str)) {
                                                        eVar2.f118059d.clear();
                                                        if (eVar2.f118057b == null) {
                                                            UserProfileRecommendUserVM userProfileRecommendUserVM = this.this$0;
                                                            if (acVar != null) {
                                                                str3 = acVar.f117244b;
                                                            }
                                                            userProfileRecommendUserVM.b(new k(userProfileRecommendUserVM, str3, com.ss.android.ugc.aweme.utils.permission.d.a()));
                                                        } else {
                                                            UserProfileRecommendUserVM userProfileRecommendUserVM2 = this.this$0;
                                                            userProfileRecommendUserVM2.b(new l(userProfileRecommendUserVM2));
                                                            final RecommendList recommendList = eVar2.f118057b;
                                                            if (!com.ss.android.ugc.tools.utils.d.a(recommendList.getUserList())) {
                                                                if (this.$manual || recommendList.getUserList().size() >= 3) {
                                                                    if (acVar != null) {
                                                                        str2 = acVar.f117243a;
                                                                    } else {
                                                                        str2 = null;
                                                                    }
                                                                    if (!(iVar == null || (user = iVar.f117705a) == null)) {
                                                                        str3 = user.getRecType();
                                                                    }
                                                                    ad.a(str2, str3, Boolean.valueOf(!this.$manual));
                                                                    this.this$0.l();
                                                                } else {
                                                                    this.this$0.a(AnonymousClass1.f118050a);
                                                                }
                                                            } else if (this.$manual) {
                                                                this.this$0.a(new h.f.a.b<e, e>() {
                                                                    /* class com.ss.android.ugc.aweme.profile.widgets.recommend.user.UserProfileRecommendUserVM.p.AnonymousClass2 */

                                                                    static {
                                                                        Covode.recordClassIndex(76629);
                                                                    }

                                                                    /* Return type fixed from 'java.lang.Object' to match base method */
                                                                    /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
                                                                    @Override // h.f.a.b
                                                                    public final /* synthetic */ e invoke(e eVar) {
                                                                        e eVar2 = eVar;
                                                                        h.f.b.l.d(eVar2, "");
                                                                        return e.a(eVar2, null, recommendList, 0, null, false, 3, eVar2.f118062g + 1, 29);
                                                                    }
                                                                });
                                                            }
                                                        }
                                                    }
                                                }
                                                return z.f158842a;
                                            }
                                        }

                                        static final class g extends h.f.b.m implements h.f.a.b<e, z> {
                                            final /* synthetic */ int $followStatus;
                                            final /* synthetic */ User $user;
                                            final /* synthetic */ UserProfileRecommendUserVM this$0;

                                            static {
                                                Covode.recordClassIndex(76608);
                                            }

                                            /* JADX INFO: super call moved to the top of the method (can break code semantics) */
                                            g(UserProfileRecommendUserVM userProfileRecommendUserVM, int i2, User user) {
                                                super(1);
                                                this.this$0 = userProfileRecommendUserVM;
                                                this.$followStatus = i2;
                                                this.$user = user;
                                            }

                                            /* Return type fixed from 'java.lang.Object' to match base method */
                                            /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
                                            /* JADX WARNING: Removed duplicated region for block: B:40:0x020b  */
                                            /* JADX WARNING: Removed duplicated region for block: B:42:0x021c  */
                                            @Override // h.f.a.b
                                            /* Code decompiled incorrectly, please refer to instructions dump. */
                                            public final /* synthetic */ h.z invoke(com.ss.android.ugc.aweme.profile.widgets.recommend.user.e r32) {
                                                /*
                                                // Method dump skipped, instructions count: 558
                                                */
                                                throw new UnsupportedOperationException("Method not decompiled: com.ss.android.ugc.aweme.profile.widgets.recommend.user.UserProfileRecommendUserVM.g.invoke(java.lang.Object):java.lang.Object");
                                            }
                                        }
                                    }
