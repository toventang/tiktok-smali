package com.ss.android.ugc.aweme.notificationlive;

import android.app.Activity;
import android.app.NotificationChannel;
import android.app.NotificationManager;
import android.content.ClipboardManager;
import android.content.Context;
import android.content.pm.PackageManager;
import android.os.Build;
import android.os.Bundle;
import android.os.Handler;
import android.os.Looper;
import com.bytedance.covode.number.Covode;
import com.bytedance.frameworks.apm.trace.MethodCollector;
import com.bytedance.keva.Keva;
import com.bytedance.router.SmartRouter;
import com.bytedance.tux.sheet.sheet.a;
import com.ss.android.ugc.aweme.AccountService;
import com.ss.android.ugc.aweme.IAccountUserService;
import com.ss.android.ugc.aweme.common.r;
import com.ss.android.ugc.aweme.feed.model.AwemeRawAd;
import com.ss.android.ugc.aweme.lancet.i;
import com.ss.android.ugc.aweme.profile.model.GeneralPermission;
import com.ss.android.ugc.aweme.profile.model.User;
import com.ss.android.ugc.aweme.utils.fg;
import com.ss.android.ugc.aweme.utils.fh;
import com.ss.android.ugc.aweme.utils.in;
import com.zhiliaoapp.musically.R;
import h.f.b.l;
import h.f.b.m;
import h.f.b.z;
import java.lang.reflect.Field;
import java.util.Arrays;
import java.util.Objects;
import java.util.concurrent.TimeUnit;

public final class t {

    /* renamed from: a  reason: collision with root package name */
    public static PackageManager f114374a;

    /* renamed from: b  reason: collision with root package name */
    public static final t f114375b = new t();

    /* renamed from: c  reason: collision with root package name */
    private static final b f114376c = new b();

    /* renamed from: d  reason: collision with root package name */
    private static f.a.l.c<a> f114377d;

    public interface a {
        static {
            Covode.recordClassIndex(73565);
        }

        void a(User user);
    }

    public static final class b {
        static {
            Covode.recordClassIndex(73566);
        }

        b() {
        }
    }

    private t() {
    }

    public static boolean a(Activity activity, String str, User user, com.ss.android.ugc.aweme.profile.f fVar) {
        l.d(str, "");
        z.e eVar = new z.e();
        String str2 = null;
        eVar.element = fVar != null ? (T) fVar.a() : null;
        if (l.a((Object) str, (Object) "push_setting") && (!b() || !c())) {
            a(activity, user);
            return false;
        } else if (b() && c()) {
            return true;
        } else {
            if (eVar.element != null) {
                r.a("livesdk_push_pre_permission_show", new com.ss.android.ugc.aweme.app.f.d().a("enter_from_merge", eVar.element.f116377c).a("enter_method", eVar.element.f116378d).a("room_id", eVar.element.f116375a).a("anchor_id", eVar.element.f116376b).f66730a);
            } else {
                r.a("push_pre_permission_show", new com.ss.android.ugc.aweme.app.f.d().a("enter_from", str).a("enter_method", "notification_bell").a("enter_reason", "leave").f66730a);
            }
            if (activity != null) {
                com.bytedance.tux.dialog.b bVar = (com.bytedance.tux.dialog.b) new com.bytedance.tux.dialog.b(activity).a(R.string.cy1);
                String string = activity.getString(R.string.h05);
                l.b(string, "");
                Object[] objArr = new Object[1];
                if (user != null) {
                    str2 = user.getUniqueId();
                }
                objArr[0] = str2;
                String a2 = com.a.a(string, Arrays.copyOf(objArr, 1));
                l.b(a2, "");
                ((com.bytedance.tux.dialog.b) com.bytedance.tux.dialog.b.c.a(bVar.d(a2), new c(activity, user, str, eVar, fVar)).a(new d(user, str, eVar, fVar))).a().b().show();
            }
            return false;
        }
    }

    static {
        Covode.recordClassIndex(73564);
    }

    public static boolean b() {
        Keva repo = Keva.getRepo("push_live_" + d(), 0);
        l.b(repo, "");
        return repo.getBoolean("key_mt_live_push_switch", true);
    }

    public static boolean c() {
        NotificationChannel notificationChannel;
        String realChannelId = com.ss.android.di.push.a.a().getRealChannelId("live_push");
        Object a2 = a(com.bytedance.ies.ugc.appcontext.d.a(), "notification");
        Objects.requireNonNull(a2, "null cannot be cast to non-null type android.app.NotificationManager");
        NotificationManager notificationManager = (NotificationManager) a2;
        if (Build.VERSION.SDK_INT < 26 || realChannelId == null || realChannelId.length() == 0 || (notificationChannel = notificationManager.getNotificationChannel(realChannelId)) == null || notificationChannel.getImportance() != 0) {
            return true;
        }
        return false;
    }

    private static long d() {
        String curUserId;
        IAccountUserService e2 = AccountService.a().e();
        if (AccountService.a().e() == null) {
            curUserId = "-1";
        } else {
            l.b(e2, "");
            curUserId = e2.getCurUserId();
            l.b(curUserId, "");
        }
        return Long.parseLong(curUserId.toString());
    }

    public static f.a.l.c<a> a() {
        f.a.t<a> a2;
        if (f114377d == null) {
            f.a.l.c<a> cVar = new f.a.l.c<>();
            f114377d = cVar;
            f.a.t<a> g2 = cVar.g(400, TimeUnit.MILLISECONDS);
            if (!(g2 == null || (a2 = g2.a(f.a.a.a.a.a(f.a.a.b.a.f157156a))) == null)) {
                a2.d(g.f114379a);
            }
        }
        return f114377d;
    }

    /* access modifiers changed from: package-private */
    public static final class d extends m implements h.f.a.b<com.bytedance.tux.dialog.a, h.z> {
        final /* synthetic */ com.ss.android.ugc.aweme.profile.f $callback$inlined;
        final /* synthetic */ z.e $configs$inlined;
        final /* synthetic */ String $enterFrom$inlined;
        final /* synthetic */ User $user$inlined;

        static {
            Covode.recordClassIndex(73570);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        d(User user, String str, z.e eVar, com.ss.android.ugc.aweme.profile.f fVar) {
            super(1);
            this.$user$inlined = user;
            this.$enterFrom$inlined = str;
            this.$configs$inlined = eVar;
            this.$callback$inlined = fVar;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
        @Override // h.f.a.b
        public final /* synthetic */ h.z invoke(com.bytedance.tux.dialog.a aVar) {
            l.d(aVar, "");
            com.ss.android.ugc.aweme.profile.f fVar = this.$callback$inlined;
            if (fVar != null) {
                fVar.b();
            }
            return h.z.f158842a;
        }
    }

    /* access modifiers changed from: package-private */
    public static final class c extends m implements h.f.a.b<com.bytedance.tux.dialog.b.b, h.z> {
        final /* synthetic */ Activity $act;
        final /* synthetic */ com.ss.android.ugc.aweme.profile.f $callback$inlined;
        final /* synthetic */ z.e $configs$inlined;
        final /* synthetic */ String $enterFrom$inlined;
        final /* synthetic */ User $user$inlined;

        static {
            Covode.recordClassIndex(73567);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        c(Activity activity, User user, String str, z.e eVar, com.ss.android.ugc.aweme.profile.f fVar) {
            super(1);
            this.$act = activity;
            this.$user$inlined = user;
            this.$enterFrom$inlined = str;
            this.$configs$inlined = eVar;
            this.$callback$inlined = fVar;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
        @Override // h.f.a.b
        public final /* synthetic */ h.z invoke(com.bytedance.tux.dialog.b.b bVar) {
            com.bytedance.tux.dialog.b.b bVar2 = bVar;
            l.d(bVar2, "");
            bVar2.a(R.string.c5f, new h.f.a.b<com.bytedance.tux.dialog.b.a, h.z>(this) {
                /* class com.ss.android.ugc.aweme.notificationlive.t.c.AnonymousClass1 */
                final /* synthetic */ c this$0;

                static {
                    Covode.recordClassIndex(73568);
                }

                {
                    this.this$0 = r2;
                }

                /* Return type fixed from 'java.lang.Object' to match base method */
                /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
                @Override // h.f.a.b
                public final /* synthetic */ h.z invoke(com.bytedance.tux.dialog.b.a aVar) {
                    l.d(aVar, "");
                    SmartRouter.buildRoute(this.this$0.$act, "aweme://push_setting_notification_choice").withParam("enter_from", this.this$0.$enterFrom$inlined).open();
                    if (this.this$0.$configs$inlined.element != null) {
                        r.a("livesdk_push_pre_permission_auth", new com.ss.android.ugc.aweme.app.f.d().a("enter_from_merge", this.this$0.$configs$inlined.element.f116377c).a("enter_method", this.this$0.$configs$inlined.element.f116378d).a("room_id", this.this$0.$configs$inlined.element.f116375a).a("anchor_id", this.this$0.$configs$inlined.element.f116376b).f66730a);
                    } else {
                        r.a("push_pre_permission_auth", new com.ss.android.ugc.aweme.app.f.d().a("enter_from", this.this$0.$enterFrom$inlined).a("enter_method", "notification_bell").a("enter_reason", "leave").f66730a);
                    }
                    return h.z.f158842a;
                }
            });
            bVar2.b(R.string.dj3, new h.f.a.b<com.bytedance.tux.dialog.b.a, h.z>(this) {
                /* class com.ss.android.ugc.aweme.notificationlive.t.c.AnonymousClass2 */
                final /* synthetic */ c this$0;

                static {
                    Covode.recordClassIndex(73569);
                }

                {
                    this.this$0 = r2;
                }

                /* Return type fixed from 'java.lang.Object' to match base method */
                /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
                @Override // h.f.a.b
                public final /* synthetic */ h.z invoke(com.bytedance.tux.dialog.b.a aVar) {
                    l.d(aVar, "");
                    if (this.this$0.$configs$inlined.element != null) {
                        r.a("livesdk_push_pre_permission_deny", new com.ss.android.ugc.aweme.app.f.d().a("enter_from_merge", this.this$0.$configs$inlined.element.f116377c).a("enter_method", this.this$0.$configs$inlined.element.f116378d).a("room_id", this.this$0.$configs$inlined.element.f116375a).a("anchor_id", this.this$0.$configs$inlined.element.f116376b).f66730a);
                    } else {
                        r.a("push_pre_permission_deny", new com.ss.android.ugc.aweme.app.f.d().a("enter_from", this.this$0.$enterFrom$inlined).a("enter_method", "notification_bell").a("enter_reason", "leave").f66730a);
                    }
                    return h.z.f158842a;
                }
            });
            return h.z.f158842a;
        }
    }

    static final class e extends m implements h.f.a.b<com.bytedance.tux.dialog.b.b, h.z> {

        /* renamed from: a  reason: collision with root package name */
        public static final e f114378a = new e();

        static {
            Covode.recordClassIndex(73571);
        }

        e() {
            super(1);
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
        @Override // h.f.a.b
        public final /* synthetic */ h.z invoke(com.bytedance.tux.dialog.b.b bVar) {
            com.bytedance.tux.dialog.b.b bVar2 = bVar;
            l.d(bVar2, "");
            bVar2.a(R.string.d2g, (h.f.a.b<? super com.bytedance.tux.dialog.b.a, h.z>) null);
            return h.z.f158842a;
        }
    }

    static final class f extends m implements h.f.a.b<com.bytedance.tux.dialog.b.b, h.z> {
        final /* synthetic */ Activity $act;
        final /* synthetic */ AwemeRawAd $awemeRawAd$inlined;
        final /* synthetic */ String $clickFrom$inlined;
        final /* synthetic */ a $displayUI$inlined;
        final /* synthetic */ String $enterFrom$inlined;
        final /* synthetic */ String $previousPage$inlined;
        final /* synthetic */ String $previousPagePosition$inlined;
        final /* synthetic */ User $user$inlined;

        static {
            Covode.recordClassIndex(73572);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        f(Activity activity, User user, a aVar, String str, String str2, String str3, String str4, AwemeRawAd awemeRawAd) {
            super(1);
            this.$act = activity;
            this.$user$inlined = user;
            this.$displayUI$inlined = aVar;
            this.$enterFrom$inlined = str;
            this.$previousPage$inlined = str2;
            this.$previousPagePosition$inlined = str3;
            this.$clickFrom$inlined = str4;
            this.$awemeRawAd$inlined = awemeRawAd;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
        @Override // h.f.a.b
        public final /* synthetic */ h.z invoke(com.bytedance.tux.dialog.b.b bVar) {
            com.bytedance.tux.dialog.b.b bVar2 = bVar;
            l.d(bVar2, "");
            bVar2.a(R.string.dlz, new h.f.a.b<com.bytedance.tux.dialog.b.a, h.z>(this) {
                /* class com.ss.android.ugc.aweme.notificationlive.t.f.AnonymousClass1 */
                final /* synthetic */ f this$0;

                static {
                    Covode.recordClassIndex(73573);
                }

                {
                    this.this$0 = r2;
                }

                /* Return type fixed from 'java.lang.Object' to match base method */
                /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
                @Override // h.f.a.b
                public final /* synthetic */ h.z invoke(com.bytedance.tux.dialog.b.a aVar) {
                    l.d(aVar, "");
                    String string = this.this$0.$act.getString(R.string.a6q);
                    if (string == null) {
                        string = "";
                    }
                    l.b(string, "");
                    String a2 = com.a.a(string, Arrays.copyOf(new Object[]{this.this$0.$user$inlined.getUniqueId()}, 1));
                    l.b(a2, "");
                    new com.bytedance.tux.g.b(this.this$0.$act).a(a2).b();
                    String uid = this.this$0.$user$inlined.getUid();
                    l.b(uid, "");
                    String secUid = this.this$0.$user$inlined.getSecUid();
                    l.b(secUid, "");
                    com.ss.android.ugc.d.a.c.a(new z(uid, secUid));
                    t.a(this.this$0.$act, this.this$0.$user$inlined, this.this$0.$displayUI$inlined, this.this$0.$enterFrom$inlined, this.this$0.$previousPage$inlined, this.this$0.$previousPagePosition$inlined, this.this$0.$clickFrom$inlined, this.this$0.$awemeRawAd$inlined);
                    return h.z.f158842a;
                }
            });
            bVar2.b(R.string.a9e, (h.f.a.b<? super com.bytedance.tux.dialog.b.a, h.z>) null);
            return h.z.f158842a;
        }
    }

    /* access modifiers changed from: package-private */
    public static final class h extends m implements h.f.a.b<com.bytedance.tux.dialog.b.b, h.z> {

        /* renamed from: a  reason: collision with root package name */
        public static final h f114380a = new h();

        static {
            Covode.recordClassIndex(73575);
        }

        h() {
            super(1);
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
        @Override // h.f.a.b
        public final /* synthetic */ h.z invoke(com.bytedance.tux.dialog.b.b bVar) {
            com.bytedance.tux.dialog.b.b bVar2 = bVar;
            l.d(bVar2, "");
            bVar2.a(R.string.d2g, (h.f.a.b<? super com.bytedance.tux.dialog.b.a, h.z>) null);
            return h.z.f158842a;
        }
    }

    /* access modifiers changed from: package-private */
    public static final class i extends m implements h.f.a.b<com.bytedance.tux.dialog.b.b, h.z> {

        /* renamed from: a  reason: collision with root package name */
        public static final i f114381a = new i();

        static {
            Covode.recordClassIndex(73576);
        }

        i() {
            super(1);
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
        @Override // h.f.a.b
        public final /* synthetic */ h.z invoke(com.bytedance.tux.dialog.b.b bVar) {
            com.bytedance.tux.dialog.b.b bVar2 = bVar;
            l.d(bVar2, "");
            bVar2.a(R.string.d2g, (h.f.a.b<? super com.bytedance.tux.dialog.b.a, h.z>) null);
            return h.z.f158842a;
        }
    }

    public static com.bytedance.tux.sheet.sheet.a a(j jVar) {
        l.d(jVar, "");
        return new a.C1112a().a(1).a(jVar).a(jVar.f114337l).a(jVar.f114338m).f45299a;
    }

    /* access modifiers changed from: package-private */
    public static final class g<T> implements f.a.d.f {

        /* renamed from: a  reason: collision with root package name */
        public static final g f114379a = new g();

        static {
            Covode.recordClassIndex(73574);
        }

        g() {
        }

        @Override // f.a.d.f
        public final /* synthetic */ void accept(Object obj) {
            int i2;
            String str;
            String str2;
            String str3;
            int i3;
            String str4;
            String str5;
            String str6;
            String str7;
            String str8;
            String str9;
            GeneralPermission generalPermission;
            a aVar = (a) obj;
            User user = aVar.f114303a;
            Activity activity = aVar.f114304b;
            String str10 = aVar.f114305c;
            String str11 = aVar.f114306d;
            String str12 = aVar.f114307e;
            a aVar2 = aVar.f114308f;
            String str13 = aVar.f114309g;
            AwemeRawAd awemeRawAd = aVar.f114310h;
            boolean z = aVar.f114311i;
            com.ss.android.ugc.aweme.profile.f fVar = aVar.f114312j;
            if (user != null) {
                i2 = user.getFollowStatus();
            } else {
                i2 = 0;
            }
            String str14 = "";
            if (str10 == null) {
                str = str14;
            } else {
                str = str10;
            }
            if (user == null || (str2 = user.getUid()) == null) {
                str2 = str14;
            }
            if (str11 == null) {
                str3 = str14;
            } else {
                str3 = str11;
            }
            l.d(str, str14);
            l.d(str2, str14);
            l.d(str3, str14);
            r.a("click_notification_bell", new com.ss.android.ugc.aweme.app.f.d().a("enter_from", str).a("follow_status", i2).a("to_user_id", str2).a("previous_page", str3).f66730a);
            if (user == null || (generalPermission = user.getGeneralPermission()) == null) {
                i3 = 0;
            } else {
                i3 = generalPermission.getFollowToastType();
            }
            if (i3 != 1) {
                if (str10 == null) {
                    str4 = str14;
                } else {
                    str4 = str10;
                }
                if (str11 == null) {
                    str5 = str14;
                } else {
                    str5 = str11;
                }
                if (t.a(activity, str4, str5, fVar)) {
                    if (str10 == null) {
                        str6 = str14;
                    } else {
                        str6 = str10;
                    }
                    if (t.a(activity, str6, user, fVar)) {
                        if (str10 == null) {
                            str7 = str14;
                        } else {
                            str7 = str10;
                        }
                        if (str11 == null) {
                            str8 = str14;
                        } else {
                            str8 = str11;
                        }
                        if (str12 == null) {
                            str9 = str14;
                        } else {
                            str9 = str12;
                        }
                        l.d(str7, str14);
                        l.d(str8, str14);
                        l.d(str9, str14);
                        if (user == null || !user.isBlock || in.a(user.getFollowStatus())) {
                            if (i2 == 4) {
                                t.a(activity);
                            } else if (i2 == 0) {
                                if (str10 == null) {
                                    str10 = str14;
                                }
                                if (str11 == null) {
                                    str11 = str14;
                                }
                                if (str12 != null) {
                                    str14 = str12;
                                }
                                t.a(activity, user, aVar2, str10, str11, str14, str13, awemeRawAd);
                            } else if (i2 == 1 || i2 == 2) {
                                if (str10 == null) {
                                    str10 = str14;
                                }
                                if (str11 == null) {
                                    str11 = str14;
                                }
                                l.d(str10, str14);
                                l.d(str11, str14);
                                if (user != null && (activity instanceof androidx.fragment.app.e)) {
                                    if (z) {
                                        j jVar = new j(user, aVar2, false, str10, str11, "", str13, awemeRawAd, fVar);
                                        androidx.fragment.app.e eVar = (androidx.fragment.app.e) activity;
                                        androidx.fragment.app.i supportFragmentManager = eVar.getSupportFragmentManager();
                                        l.b(supportFragmentManager, str14);
                                        if (!supportFragmentManager.h()) {
                                            t.a(jVar).show(eVar.getSupportFragmentManager(), "NotificationBottomDialog");
                                            return;
                                        }
                                        return;
                                    }
                                    com.ss.android.ugc.aweme.notificationlive.ui.a aVar3 = new com.ss.android.ugc.aweme.notificationlive.ui.a();
                                    Bundle bundle = new Bundle();
                                    bundle.putSerializable(com.ss.android.ugc.aweme.notificationlive.ui.a.t, user);
                                    bundle.putString(com.ss.android.ugc.aweme.notificationlive.ui.a.u, str10);
                                    bundle.putString(com.ss.android.ugc.aweme.notificationlive.ui.a.v, str11);
                                    bundle.putString(com.ss.android.ugc.aweme.notificationlive.ui.a.w, str13);
                                    bundle.putSerializable(com.ss.android.ugc.aweme.notificationlive.ui.a.x, awemeRawAd);
                                    aVar3.setArguments(bundle);
                                    aVar3.f114404f = aVar2;
                                    aVar3.f114409k = fVar;
                                    aVar3.r = aVar3.f114411m;
                                    aVar3.f114410l = aVar3.n;
                                    androidx.fragment.app.i supportFragmentManager2 = ((androidx.fragment.app.e) activity).getSupportFragmentManager();
                                    l.b(supportFragmentManager2, str14);
                                    aVar3.show(supportFragmentManager2, "NotificationBottomDialog");
                                }
                            }
                        } else if (activity != null) {
                            com.bytedance.tux.dialog.b.c.a((com.bytedance.tux.dialog.b) new com.bytedance.tux.dialog.b(activity).b(R.string.h44), new f(activity, user, aVar2, str7, str8, str9, str13, awemeRawAd)).a().b().show();
                        }
                    }
                }
            } else if (activity != null) {
                com.bytedance.tux.dialog.b.c.a((com.bytedance.tux.dialog.b) new com.bytedance.tux.dialog.b(activity).a(R.string.brd).b(R.string.s_), e.f114378a).a().b().show();
            }
        }
    }

    public static void a(Activity activity) {
        if (activity != null) {
            com.bytedance.tux.dialog.b.c.a((com.bytedance.tux.dialog.b) new com.bytedance.tux.dialog.b(activity).a(R.string.bzt).b(R.string.evv), i.f114381a).a().b().show();
        }
    }

    public static void a(boolean z) {
        Keva repo = Keva.getRepo("push_live_" + d(), 0);
        l.b(repo, "");
        repo.storeBoolean("key_mt_live_push_switch", z);
    }

    private static Object a(Context context, String str) {
        Object obj;
        MethodCollector.i(7901);
        if (Build.VERSION.SDK_INT > 27 || !"clipboard".equals(str)) {
            if (!com.ss.android.ugc.aweme.lancet.i.f107220b && "connectivity".equals(str)) {
                try {
                    new com.bytedance.platform.godzilla.b.b.b().a();
                    com.ss.android.ugc.aweme.lancet.i.f107220b = true;
                    obj = context.getSystemService(str);
                } catch (Throwable unused) {
                }
            }
            obj = context.getSystemService(str);
        } else if (com.ss.android.ugc.aweme.lancet.i.f107219a) {
            synchronized (ClipboardManager.class) {
                try {
                    obj = context.getSystemService(str);
                    if (Thread.currentThread() != Looper.getMainLooper().getThread()) {
                        try {
                            Field declaredField = ClipboardManager.class.getDeclaredField("mHandler");
                            declaredField.setAccessible(true);
                            declaredField.set(obj, new i.a((Handler) declaredField.get(obj)));
                        } catch (Exception e2) {
                            com.bytedance.crash.d.a(e2, "ClipboardManager Handler Reflect Fail");
                        }
                    }
                    com.ss.android.ugc.aweme.lancet.i.f107219a = false;
                } finally {
                    MethodCollector.o(7901);
                }
            }
        } else {
            obj = context.getSystemService(str);
        }
        return obj;
    }

    public static void a(Context context, User user) {
        String str;
        r.a("push_pre_permission_show", new com.ss.android.ugc.aweme.app.f.d().a("enter_from", "push_setting").a("enter_method", "notification_bell").a("enter_reason", "leave").f66730a);
        if (context != null) {
            com.bytedance.tux.dialog.b bVar = (com.bytedance.tux.dialog.b) new com.bytedance.tux.dialog.b(context).a(R.string.h04);
            String string = context.getString(R.string.h05);
            l.b(string, "");
            Object[] objArr = new Object[1];
            if (user != null) {
                str = user.getUniqueId();
            } else {
                str = null;
            }
            objArr[0] = str;
            String a2 = com.a.a(string, Arrays.copyOf(objArr, 1));
            l.b(a2, "");
            com.bytedance.tux.dialog.b.c.a(bVar.d(a2), h.f114380a).a().b().show();
        }
    }

    public static boolean a(Activity activity, String str, String str2, com.ss.android.ugc.aweme.profile.f fVar) {
        l.d(str, "");
        l.d(str2, "");
        if (fg.a(activity)) {
            return true;
        }
        fh.a(activity, false, null, null, true, true, str, fVar);
        return false;
    }

    public static void a(Activity activity, User user, a aVar, String str, String str2, String str3, String str4, AwemeRawAd awemeRawAd) {
        l.d(str, "");
        l.d(str2, "");
        l.d(str3, "");
        if (user != null && (activity instanceof androidx.fragment.app.e)) {
            j jVar = new j(user, aVar, true, str, str2, str3, str4, awemeRawAd, 256);
            androidx.fragment.app.e eVar = (androidx.fragment.app.e) activity;
            androidx.fragment.app.i supportFragmentManager = eVar.getSupportFragmentManager();
            l.b(supportFragmentManager, "");
            if (!supportFragmentManager.h()) {
                a(jVar).show(eVar.getSupportFragmentManager(), "NotificationBottomDialog");
            }
        }
    }
}
