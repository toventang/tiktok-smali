package com.ss.android.ugc.aweme.profile.widgets.follow;

import com.bytedance.assem.arch.extensions.o;
import com.bytedance.assem.arch.viewModel.AssemViewModel;
import com.bytedance.covode.number.Covode;
import com.bytedance.ies.ugc.aweme.rich.a.a;
import com.ss.android.ugc.aweme.IAccountUserService;
import com.ss.android.ugc.aweme.base.api.BaseResponse;
import com.ss.android.ugc.aweme.common.r;
import com.ss.android.ugc.aweme.feed.model.Aweme;
import com.ss.android.ugc.aweme.profile.model.FollowStatus;
import com.ss.android.ugc.aweme.profile.model.GeneralPermission;
import com.ss.android.ugc.aweme.profile.model.User;
import com.ss.android.ugc.aweme.profile.presenter.n;
import com.ss.android.ugc.aweme.profile.ui.ae;
import com.ss.android.ugc.aweme.profile.ui.v2.ac;
import com.ss.android.ugc.aweme.utils.in;
import h.f.b.ab;
import h.f.b.m;
import h.z;
import kotlinx.coroutines.am;
import kotlinx.coroutines.bz;

public final class UserProfileFollowVM extends AssemViewModel<o> {

    /* renamed from: k  reason: collision with root package name */
    public static final b f117758k = new b((byte) 0);

    /* renamed from: j  reason: collision with root package name */
    public final com.bytedance.assem.arch.a.a<m> f117759j;

    /* renamed from: l  reason: collision with root package name */
    private final com.bytedance.assem.arch.extensions.i f117760l = new com.bytedance.assem.arch.extensions.i(true, new a(this, null));

    static {
        Covode.recordClassIndex(76246);
    }

    /* access modifiers changed from: package-private */
    public final com.ss.android.ugc.aweme.profile.widgets.h.a.b g() {
        return (com.ss.android.ugc.aweme.profile.widgets.h.a.b) this.f117760l.getValue();
    }

    public static final class b {
        static {
            Covode.recordClassIndex(76248);
        }

        private b() {
        }

        public /* synthetic */ b(byte b2) {
            this();
        }
    }

    /* Return type fixed from 'com.bytedance.assem.arch.viewModel.j' to match base method */
    @Override // com.bytedance.assem.arch.viewModel.AssemViewModel
    public final /* synthetic */ o f() {
        return new o();
    }

    static final class k<T> implements f.a.d.f {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ UserProfileFollowVM f117769a;

        static {
            Covode.recordClassIndex(76262);
        }

        k(UserProfileFollowVM userProfileFollowVM) {
            this.f117769a = userProfileFollowVM;
        }

        static final /* synthetic */ class a extends h.f.b.j implements h.f.a.a<Integer> {
            static {
                Covode.recordClassIndex(76265);
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

        static final /* synthetic */ class c extends h.f.b.j implements h.f.a.a<Integer> {
            static {
                Covode.recordClassIndex(76267);
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

        static final /* synthetic */ class b extends h.f.b.j implements h.f.a.b<Integer, z> {
            static {
                Covode.recordClassIndex(76266);
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

        static final /* synthetic */ class d extends h.f.b.j implements h.f.a.b<Integer, z> {
            static {
                Covode.recordClassIndex(76268);
            }

            d(User user) {
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

        @Override // f.a.d.f
        public final /* synthetic */ void accept(Object obj) {
            final BaseResponse baseResponse = (BaseResponse) obj;
            IAccountUserService g2 = com.ss.android.ugc.aweme.account.b.g();
            h.f.b.l.b(g2, "");
            User curUser = g2.getCurUser();
            AnonymousClass1 r2 = AnonymousClass1.f117770a;
            if (ae.a(curUser)) {
                r2.invoke(new a(curUser), new b(curUser));
            } else {
                r2.invoke(new c(curUser), new d(curUser));
            }
            this.f117769a.a(new h.f.a.b<o, o>() {
                /* class com.ss.android.ugc.aweme.profile.widgets.follow.UserProfileFollowVM.k.AnonymousClass2 */

                static {
                    Covode.recordClassIndex(76264);
                }

                /* Return type fixed from 'java.lang.Object' to match base method */
                /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
                @Override // h.f.a.b
                public final /* synthetic */ o invoke(o oVar) {
                    o oVar2 = oVar;
                    h.f.b.l.d(oVar2, "");
                    return o.a(oVar2, null, null, new o(baseResponse), null, 11);
                }
            });
        }
    }

    public static final class a extends m implements h.f.a.a<com.ss.android.ugc.aweme.profile.widgets.h.a.b> {
        final /* synthetic */ String $identify;
        final /* synthetic */ AssemViewModel $this_hierarchyDataOrNull;

        static {
            Covode.recordClassIndex(76247);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public a(AssemViewModel assemViewModel, String str) {
            super(0);
            this.$this_hierarchyDataOrNull = assemViewModel;
            this.$identify = str;
        }

        /* JADX WARN: Type inference failed for: r0v3, types: [com.ss.android.ugc.aweme.profile.widgets.h.a.b, java.lang.Object] */
        /* JADX WARNING: Unknown variable types count: 1 */
        @Override // h.f.a.a
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public final com.ss.android.ugc.aweme.profile.widgets.h.a.b invoke() {
            /*
                r3 = this;
                com.bytedance.assem.arch.viewModel.AssemViewModel r0 = r3.$this_hierarchyDataOrNull
                com.bytedance.assem.arch.core.d r2 = r0.f25687d
                if (r2 == 0) goto L_0x000f
                java.lang.Class<com.ss.android.ugc.aweme.profile.widgets.h.a.b> r1 = com.ss.android.ugc.aweme.profile.widgets.h.a.b.class
                java.lang.String r0 = r3.$identify
                java.lang.Object r0 = r2.b(r1, r0)
                return r0
            L_0x000f:
                r0 = 0
                return r0
            */
            throw new UnsupportedOperationException("Method not decompiled: com.ss.android.ugc.aweme.profile.widgets.follow.UserProfileFollowVM.a.invoke():java.lang.Object");
        }
    }

    private final User i() {
        com.ss.android.ugc.aweme.profile.widgets.common.i iVar = (com.ss.android.ugc.aweme.profile.widgets.common.i) com.bytedance.assem.arch.service.d.a(this, ab.a(com.ss.android.ugc.aweme.profile.widgets.common.j.class));
        if (iVar != null) {
            return iVar.f117705a;
        }
        return null;
    }

    /* access modifiers changed from: package-private */
    public final String h() {
        ac acVar = (ac) com.bytedance.assem.arch.service.d.a(this, ab.a(com.ss.android.ugc.aweme.profile.ui.v2.ab.class));
        if (acVar != null) {
            return acVar.f117245c;
        }
        return null;
    }

    static final class l<T> implements f.a.d.f {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ UserProfileFollowVM f117771a;

        static {
            Covode.recordClassIndex(76269);
        }

        l(UserProfileFollowVM userProfileFollowVM) {
            this.f117771a = userProfileFollowVM;
        }

        @Override // f.a.d.f
        public final /* synthetic */ void accept(Object obj) {
            final Throwable th = (Throwable) obj;
            this.f117771a.a(new h.f.a.b<o, o>() {
                /* class com.ss.android.ugc.aweme.profile.widgets.follow.UserProfileFollowVM.l.AnonymousClass1 */

                static {
                    Covode.recordClassIndex(76270);
                }

                /* Return type fixed from 'java.lang.Object' to match base method */
                /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
                @Override // h.f.a.b
                public final /* synthetic */ o invoke(o oVar) {
                    o oVar2 = oVar;
                    h.f.b.l.d(oVar2, "");
                    Throwable th = th;
                    h.f.b.l.b(th, "");
                    return o.a(oVar2, null, null, new com.bytedance.assem.arch.extensions.h(th), null, 11);
                }
            });
        }
    }

    /* access modifiers changed from: package-private */
    public static final class d extends m implements h.f.a.b<o, o> {

        /* renamed from: a  reason: collision with root package name */
        public static final d f117762a = new d();

        static {
            Covode.recordClassIndex(76255);
        }

        d() {
            super(1);
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
        @Override // h.f.a.b
        public final /* synthetic */ o invoke(o oVar) {
            o oVar2 = oVar;
            h.f.b.l.d(oVar2, "");
            return o.a(oVar2, null, null, null, new com.bytedance.assem.arch.extensions.a(a.LOGIN), 7);
        }
    }

    /* access modifiers changed from: package-private */
    public static final class e extends m implements h.f.a.b<o, o> {

        /* renamed from: a  reason: collision with root package name */
        public static final e f117763a = new e();

        static {
            Covode.recordClassIndex(76256);
        }

        e() {
            super(1);
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
        @Override // h.f.a.b
        public final /* synthetic */ o invoke(o oVar) {
            o oVar2 = oVar;
            h.f.b.l.d(oVar2, "");
            return o.a(oVar2, null, null, null, new com.bytedance.assem.arch.extensions.a(a.BLOCK), 7);
        }
    }

    /* access modifiers changed from: package-private */
    public static final class f extends m implements h.f.a.b<o, o> {

        /* renamed from: a  reason: collision with root package name */
        public static final f f117764a = new f();

        static {
            Covode.recordClassIndex(76257);
        }

        f() {
            super(1);
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
        @Override // h.f.a.b
        public final /* synthetic */ o invoke(o oVar) {
            o oVar2 = oVar;
            h.f.b.l.d(oVar2, "");
            return o.a(oVar2, null, null, null, new com.bytedance.assem.arch.extensions.a(a.BAN), 7);
        }
    }

    /* access modifiers changed from: package-private */
    public static final class g extends m implements h.f.a.b<o, o> {

        /* renamed from: a  reason: collision with root package name */
        public static final g f117765a = new g();

        static {
            Covode.recordClassIndex(76258);
        }

        g() {
            super(1);
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
        @Override // h.f.a.b
        public final /* synthetic */ o invoke(o oVar) {
            o oVar2 = oVar;
            h.f.b.l.d(oVar2, "");
            return o.a(oVar2, null, null, null, new com.bytedance.assem.arch.extensions.a(a.TEMPORARY_BAN), 7);
        }
    }

    /* access modifiers changed from: package-private */
    public static final class h extends m implements h.f.a.b<o, o> {

        /* renamed from: a  reason: collision with root package name */
        public static final h f117766a = new h();

        static {
            Covode.recordClassIndex(76259);
        }

        h() {
            super(1);
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
        @Override // h.f.a.b
        public final /* synthetic */ o invoke(o oVar) {
            o oVar2 = oVar;
            h.f.b.l.d(oVar2, "");
            return o.a(oVar2, null, null, null, new com.bytedance.assem.arch.extensions.a(a.DOUBLE_CANCEL), 7);
        }
    }

    /* access modifiers changed from: package-private */
    public static final class i extends m implements h.f.a.b<o, o> {

        /* renamed from: a  reason: collision with root package name */
        public static final i f117767a = new i();

        static {
            Covode.recordClassIndex(76260);
        }

        i() {
            super(1);
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
        @Override // h.f.a.b
        public final /* synthetic */ o invoke(o oVar) {
            o oVar2 = oVar;
            h.f.b.l.d(oVar2, "");
            return o.a(oVar2, null, null, null, new com.bytedance.assem.arch.extensions.a(a.REQUESTED), 7);
        }
    }

    /* access modifiers changed from: package-private */
    public static final class j extends m implements h.f.a.b<o, o> {

        /* renamed from: a  reason: collision with root package name */
        public static final j f117768a = new j();

        static {
            Covode.recordClassIndex(76261);
        }

        j() {
            super(1);
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
        @Override // h.f.a.b
        public final /* synthetic */ o invoke(o oVar) {
            o oVar2 = oVar;
            h.f.b.l.d(oVar2, "");
            return o.a(oVar2, null, null, null, new com.bytedance.assem.arch.extensions.a(a.FINISH), 7);
        }
    }

    public UserProfileFollowVM(com.bytedance.assem.arch.a.a<m> aVar) {
        h.f.b.l.d(aVar, "");
        this.f117759j = aVar;
    }

    public static void a(int i2) {
        r.a("choose_punish_pop", new com.ss.android.ugc.aweme.app.f.d().a("is_follow", i2).f66730a);
    }

    /* access modifiers changed from: package-private */
    public static final class c extends m implements h.f.a.b<o, z> {
        final /* synthetic */ n $params;
        final /* synthetic */ UserProfileFollowVM this$0;

        static {
            Covode.recordClassIndex(76249);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        c(UserProfileFollowVM userProfileFollowVM, n nVar) {
            super(1);
            this.this$0 = userProfileFollowVM;
            this.$params = nVar;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
        @Override // h.f.a.b
        public final /* synthetic */ z invoke(o oVar) {
            o oVar2 = oVar;
            h.f.b.l.d(oVar2, "");
            if (!(oVar2.f117821b instanceof com.bytedance.assem.arch.extensions.n)) {
                this.this$0.a(AnonymousClass1.f117761a);
                bz unused = kotlinx.coroutines.i.a(this.this$0.aH_(), null, null, new h.f.a.m<am, h.c.d<? super z>, Object>(this, null) {
                    /* class com.ss.android.ugc.aweme.profile.widgets.follow.UserProfileFollowVM.c.AnonymousClass2 */
                    Object L$0;
                    Object L$1;
                    Object L$2;
                    Object L$3;
                    int label;
                    final /* synthetic */ c this$0;

                    static {
                        Covode.recordClassIndex(76251);
                    }

                    {
                        this.this$0 = r2;
                    }

                    @Override // h.c.b.a.a
                    public final h.c.d<z> create(Object obj, h.c.d<?> dVar) {
                        h.f.b.l.d(dVar, "");
                        return 

                        public static void a(User user) {
                            r.a("show_punish_pop", new com.ss.android.ugc.aweme.app.f.d().a("enter_from", "others_homepage").a("show_type", b(user)).f66730a);
                        }

                        private static String b(User user) {
                            GeneralPermission generalPermission;
                            if (user != null) {
                                generalPermission = user.getGeneralPermission();
                            } else {
                                generalPermission = null;
                            }
                            if (generalPermission == null) {
                                return "";
                            }
                            GeneralPermission generalPermission2 = user.getGeneralPermission();
                            h.f.b.l.b(generalPermission2, "");
                            int followToastType = generalPermission2.getFollowToastType();
                            if (followToastType == 1) {
                                return "ban";
                            }
                            if (followToastType == 2) {
                                return "suspend";
                            }
                            if (followToastType == 3) {
                                return "viewmodeA";
                            }
                            if (followToastType != 4) {
                                return "";
                            }
                            return "viewmodeB";
                        }

                        public final void a(a aVar) {
                            User i2;
                            User i3;
                            User i4;
                            User i5;
                            GeneralPermission generalPermission;
                            User i6;
                            int i7;
                            h.f.b.l.d(aVar, "");
                            if (aVar.compareTo((Enum) a.LOGIN) < 0) {
                                IAccountUserService g2 = com.ss.android.ugc.aweme.account.b.g();
                                h.f.b.l.b(g2, "");
                                if (!g2.isLogin()) {
                                    a(d.f117762a);
                                    return;
                                }
                            }
                            if (aVar.compareTo((Enum) a.BLOCK) < 0 && (i6 = i()) != null && i6.isBlock) {
                                User i8 = i();
                                if (i8 != null) {
                                    i7 = i8.getFollowStatus();
                                } else {
                                    i7 = 0;
                                }
                                if (!in.a(i7)) {
                                    a(e.f117763a);
                                    return;
                                }
                            }
                            if (!(aVar.compareTo((Enum) a.BAN) >= 0 || (i4 = i()) == null || i4.getFollowStatus() != 0 || (i5 = i()) == null || (generalPermission = i5.getGeneralPermission()) == null)) {
                                int followToastType = generalPermission.getFollowToastType();
                                if (followToastType == 1) {
                                    a(f.f117764a);
                                    return;
                                } else if (followToastType == 2 || followToastType == 3 || followToastType == 4) {
                                    a(g.f117765a);
                                    return;
                                }
                            }
                            if (aVar.compareTo((Enum) a.DOUBLE_CANCEL) < 0 && (i3 = i()) != null && i3.getFollowStatus() == 2) {
                                a(h.f117766a);
                            } else if (aVar.compareTo((Enum) a.REQUESTED) >= 0 || (i2 = i()) == null || i2.getFollowStatus() != 4) {
                                a(j.f117768a);
                            } else {
                                a(i.f117767a);
                            }
                        }

                        /* access modifiers changed from: package-private */
                        /* JADX WARNING: Removed duplicated region for block: B:15:0x0033 A[RETURN] */
                        /* JADX WARNING: Removed duplicated region for block: B:16:0x0034  */
                        /* Code decompiled incorrectly, please refer to instructions dump. */
                        public final void a(com.ss.android.ugc.aweme.metrics.u.a r8, com.ss.android.ugc.aweme.profile.model.User r9) {
                            /*
                            // Method dump skipped, instructions count: 134
                            */
                            throw new UnsupportedOperationException("Method not decompiled: com.ss.android.ugc.aweme.profile.widgets.follow.UserProfileFollowVM.a(com.ss.android.ugc.aweme.metrics.u$a, com.ss.android.ugc.aweme.profile.model.User):void");
                        }

                        public static void a(int i2, Aweme aweme, String str, FollowStatus followStatus) {
                            if (str != null) {
                                int i3 = 1;
                                if (i2 == 1 && com.ss.android.ugc.aweme.commercialize.e.a.b.Y(aweme)) {
                                    int hashCode = str.hashCode();
                                    int i4 = 0;
                                    if (hashCode != -485371922) {
                                        if (hashCode == 3138974 && str.equals("feed")) {
                                            com.ss.android.ugc.aweme.commercialize.g.a().a(com.bytedance.ies.ugc.appcontext.d.a(), aweme, followStatus);
                                            a.C0791a a2 = com.bytedance.ies.ugc.aweme.rich.a.a.a("draw_ad", "follow", aweme.getAwemeRawAd());
                                            if (followStatus != null && followStatus.isCheating()) {
                                                i4 = 1;
                                            }
                                            a.C0791a a3 = a2.a("is_cheated_follow", Integer.valueOf(i4));
                                            if (followStatus != null) {
                                                i3 = followStatus.followStatus;
                                            }
                                            a3.a("follow_status", Integer.valueOf(i3)).c();
                                        }
                                    } else if (str.equals("homepage")) {
                                        com.ss.android.ugc.aweme.commercialize.g.a().b(com.bytedance.ies.ugc.appcontext.d.a(), aweme, followStatus);
                                        a.C0791a a4 = com.bytedance.ies.ugc.aweme.rich.a.a.a("homepage_ad", "follow", aweme.getAwemeRawAd());
                                        if (followStatus != null && followStatus.isCheating()) {
                                            i4 = 1;
                                        }
                                        a.C0791a a5 = a4.a("is_cheated_follow", Integer.valueOf(i4));
                                        if (followStatus != null) {
                                            i3 = followStatus.followStatus;
                                        }
                                        a5.a("follow_status", Integer.valueOf(i3)).c();
                                    }
                                }
                            }
                        }
                    }
