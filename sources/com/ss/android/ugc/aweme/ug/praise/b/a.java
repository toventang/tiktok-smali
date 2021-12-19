package com.ss.android.ugc.aweme.ug.praise.b;

import android.app.Activity;
import android.content.Context;
import android.os.Bundle;
import android.text.TextUtils;
import b.g;
import b.i;
import com.bytedance.covode.number.Covode;
import com.ss.android.ugc.aweme.IAccountUserService;
import com.ss.android.ugc.aweme.global.config.settings.pojo.AppStoreMessage;
import com.ss.android.ugc.aweme.global.config.settings.pojo.IESSettingsProxy;
import com.ss.android.ugc.aweme.global.config.settings.pojo.LikePraiseDialogInfo;
import com.ss.android.ugc.aweme.notification.service.NoticeServiceImpl;
import com.ss.android.ugc.aweme.ug.praise.b;
import com.ss.android.ugc.aweme.ug.praise.c;
import h.f.b.l;
import h.z;
import java.util.concurrent.TimeUnit;

public final class a {

    /* renamed from: a  reason: collision with root package name */
    public static boolean f141967a;

    /* renamed from: b  reason: collision with root package name */
    public static final a f141968b = new a();

    private a() {
    }

    static {
        Covode.recordClassIndex(92768);
    }

    public static boolean a() {
        com.ss.android.ugc.aweme.ug.praise.c cVar = new com.ss.android.ugc.aweme.ug.praise.c(b.EnumC3781b.LIKE);
        if (cVar.f141980e == 0) {
            cVar.b(System.currentTimeMillis());
        }
        if (System.currentTimeMillis() - cVar.f141980e >= TimeUnit.DAYS.toMillis(7)) {
            return true;
        }
        return false;
    }

    /* renamed from: com.ss.android.ugc.aweme.ug.praise.b.a$a  reason: collision with other inner class name */
    public static final class C3780a<TTaskResult, TContinuationResult> implements g {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ Context f141969a;

        static {
            Covode.recordClassIndex(92769);
        }

        public C3780a(Context context) {
            this.f141969a = context;
        }

        @Override // b.g
        public final /* synthetic */ Object then(i iVar) {
            return Boolean.valueOf(a.f141968b.a(this.f141969a));
        }
    }

    public static final class b<TTaskResult, TContinuationResult> implements g {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ Context f141970a;

        static {
            Covode.recordClassIndex(92770);
        }

        public b(Context context) {
            this.f141970a = context;
        }

        @Override // b.g
        public final /* synthetic */ Object then(i iVar) {
            l.b(iVar, "");
            Boolean bool = (Boolean) iVar.d();
            l.b(bool, "");
            if (bool.booleanValue()) {
                Context context = this.f141970a;
                if (context == null) {
                    l.b();
                }
                new com.ss.android.ugc.aweme.ug.praise.b(new b(context, b.EnumC3781b.ACTIVATION)).a();
            }
            return z.f158842a;
        }
    }

    public static final class c<TTaskResult, TContinuationResult> implements g {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ Context f141971a;

        static {
            Covode.recordClassIndex(92771);
        }

        public c(Context context) {
            this.f141971a = context;
        }

        @Override // b.g
        public final /* synthetic */ Object then(i iVar) {
            boolean z = false;
            if (a.a(this.f141971a, b.EnumC3781b.LIKE)) {
                com.ss.android.ugc.aweme.ug.praise.c cVar = new com.ss.android.ugc.aweme.ug.praise.c(b.EnumC3781b.LIKE);
                if (cVar.f141977b || cVar.f141978c) {
                    c.a.a(b.EnumC3781b.LIKE + " :Clicked the like dialog feedback or submit button");
                } else if (new com.ss.android.ugc.aweme.ug.praise.c(b.EnumC3781b.ACTIVATION).f141978c) {
                    c.a.a(b.EnumC3781b.ACTIVATION + " :Clicked the active dialog submit button");
                } else if (b.a.a()) {
                    z = true;
                }
            }
            return Boolean.valueOf(z);
        }
    }

    public static final class d<TTaskResult, TContinuationResult> implements g {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ Context f141972a;

        static {
            Covode.recordClassIndex(92772);
        }

        public d(Context context) {
            this.f141972a = context;
        }

        @Override // b.g
        public final /* synthetic */ Object then(i iVar) {
            l.b(iVar, "");
            Boolean bool = (Boolean) iVar.d();
            l.b(bool, "");
            if (bool.booleanValue()) {
                Context context = this.f141972a;
                if (context == null) {
                    l.b();
                }
                new com.ss.android.ugc.aweme.ug.praise.b(new b(context, b.EnumC3781b.LIKE)).a();
                NoticeServiceImpl.f().a((Bundle) null, 0);
            } else if (this.f141972a != null) {
                NoticeServiceImpl.f().a(this.f141972a);
            }
            return null;
        }
    }

    private static boolean a(b.EnumC3781b bVar) {
        int a2 = com.ss.android.ugc.aweme.ug.praise.a.a.a();
        if (a2 != 1 && (bVar != b.EnumC3781b.ACTIVATION ? a2 != 2 : a2 != 0)) {
            return false;
        }
        try {
            IESSettingsProxy iESSettingsProxy = com.ss.android.ugc.aweme.global.config.settings.c.f99077a.f99078b;
            l.b(iESSettingsProxy, "");
            AppStoreMessage appStoreScore = iESSettingsProxy.getAppStoreScore();
            l.b(appStoreScore, "");
            Integer switcher = appStoreScore.getSwitcher();
            if (switcher != null) {
                if (switcher.intValue() != 0) {
                    return true;
                }
                return false;
            }
            return true;
        } catch (com.bytedance.ies.a unused) {
            return false;
        }
    }

    public final boolean a(Context context) {
        int i2;
        if (!a(context, b.EnumC3781b.ACTIVATION)) {
            return false;
        }
        com.ss.android.ugc.aweme.ug.praise.c cVar = new com.ss.android.ugc.aweme.ug.praise.c(b.EnumC3781b.ACTIVATION);
        if (cVar.f141977b || cVar.f141978c) {
            c.a.a(b.EnumC3781b.ACTIVATION + " :Clicked the active dialog feedback or submit button");
            return false;
        }
        com.ss.android.ugc.aweme.ug.praise.c cVar2 = new com.ss.android.ugc.aweme.ug.praise.c(b.EnumC3781b.LIKE);
        if (cVar2.f141977b || cVar2.f141978c) {
            c.a.a(b.EnumC3781b.ACTIVATION + " :Clicked the like dialog feedback or submit button");
            return false;
        }
        int i3 = 7;
        try {
            IESSettingsProxy iESSettingsProxy = com.ss.android.ugc.aweme.global.config.settings.c.f99077a.f99078b;
            l.b(iESSettingsProxy, "");
            AppStoreMessage appStoreScore = iESSettingsProxy.getAppStoreScore();
            l.b(appStoreScore, "");
            Integer section = appStoreScore.getSection();
            l.b(section, "");
            i3 = section.intValue();
            Integer threshold = appStoreScore.getThreshold();
            l.b(threshold, "");
            i2 = threshold.intValue();
        } catch (com.bytedance.ies.a unused) {
            i2 = 1;
        }
        if (context == null) {
            l.b();
        }
        if (!com.ss.android.ugc.aweme.pendant.b.a(context, i3, i2)) {
            c.a.a(b.EnumC3781b.ACTIVATION + " :not conditions " + i3 + " day " + i2 + " active");
            return false;
        } else if (!b.a.a()) {
            return false;
        } else {
            return true;
        }
    }

    static boolean a(Context context, b.EnumC3781b bVar) {
        if (context == null || ((context instanceof Activity) && ((Activity) context).isFinishing())) {
            c.a.a(bVar + " :context invalid");
            return false;
        } else if (!a(bVar)) {
            c.a.a(bVar + " :switch is close，current showType：" + com.ss.android.ugc.aweme.ug.praise.a.a.a());
            return false;
        } else {
            IAccountUserService g2 = com.ss.android.ugc.aweme.account.b.g();
            l.b(g2, "");
            if (!g2.isLogin()) {
                c.a.a(bVar + " :not login");
                return false;
            }
            com.ss.android.ugc.aweme.ug.praise.c cVar = new com.ss.android.ugc.aweme.ug.praise.c(bVar);
            long currentTimeMillis = System.currentTimeMillis();
            if (currentTimeMillis - cVar.f141976a < TimeUnit.DAYS.toMillis(14)) {
                c.a.a(bVar + " :It happened in 14 days");
                return false;
            } else if (!a()) {
                c.a.a(bVar + " :Installation time is less than 7 days");
                return false;
            } else if (TextUtils.equals(String.valueOf(com.bytedance.ies.ugc.appcontext.d.e()), cVar.f141979d)) {
                c.a.a(bVar + " :This version was shown");
                return false;
            } else {
                com.ss.android.ugc.aweme.ug.praise.c cVar2 = new com.ss.android.ugc.aweme.ug.praise.c(bVar);
                long j2 = 48;
                try {
                    IESSettingsProxy iESSettingsProxy = com.ss.android.ugc.aweme.global.config.settings.c.f99077a.f99078b;
                    l.b(iESSettingsProxy, "");
                    LikePraiseDialogInfo likePraiseDialogInfo = iESSettingsProxy.getLikePraiseDialogInfo();
                    l.b(likePraiseDialogInfo, "");
                    j2 = (long) likePraiseDialogInfo.getTwoDialogInterval().intValue();
                } catch (com.bytedance.ies.a unused) {
                }
                if (cVar2.f141976a == 0 || Math.abs(currentTimeMillis - cVar2.f141976a) >= TimeUnit.HOURS.toMillis(j2)) {
                    return true;
                }
                c.a.a(bVar + " :Two popovers should be spaced apart " + j2 + " hour");
                return false;
            }
        }
    }
}
