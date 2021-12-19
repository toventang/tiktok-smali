package com.ss.android.ugc.aweme.legoImp.task;

import android.content.Context;
import com.bytedance.covode.number.Covode;
import com.ss.android.ugc.aweme.IAccountUserService;
import com.ss.android.ugc.aweme.account.b;
import com.ss.android.ugc.aweme.app.f.d;
import com.ss.android.ugc.aweme.common.r;
import com.ss.android.ugc.aweme.compliance.api.services.familypairing.IFamilyPairingService;
import com.ss.android.ugc.aweme.lego.ab;
import com.ss.android.ugc.aweme.lego.ad;
import com.ss.android.ugc.aweme.lego.ae;
import com.ss.android.ugc.aweme.lego.w;
import com.ss.android.ugc.aweme.lego.x;
import h.f.b.l;
import java.util.List;

public final class SyncProtectionSettingTask implements w {
    static {
        Covode.recordClassIndex(69146);
    }

    @Override // com.ss.android.ugc.aweme.lego.n
    public final int bK_() {
        return 1;
    }

    @Override // com.ss.android.ugc.aweme.lego.n
    public final ad f() {
        return x.a(this);
    }

    @Override // com.ss.android.ugc.aweme.lego.n
    public final String g() {
        return "task_";
    }

    @Override // com.ss.android.ugc.aweme.lego.n
    public final boolean i() {
        return true;
    }

    @Override // com.ss.android.ugc.aweme.lego.n
    public final List j() {
        return null;
    }

    public static final class a implements com.ss.android.ugc.aweme.compliance.api.services.teenmode.a {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ SyncProtectionSettingTask f107893a;

        static {
            Covode.recordClassIndex(69147);
        }

        @Override // com.ss.android.ugc.aweme.compliance.api.services.teenmode.a
        public final void a() {
            SyncProtectionSettingTask.c();
        }

        /* JADX WARN: Incorrect args count in method signature: ()V */
        a(SyncProtectionSettingTask syncProtectionSettingTask) {
            this.f107893a = syncProtectionSettingTask;
        }

        @Override // com.ss.android.ugc.aweme.compliance.api.services.teenmode.a
        public final void a(Exception exc) {
            l.d(exc, "");
            SyncProtectionSettingTask.c();
        }
    }

    @Override // com.ss.android.ugc.aweme.lego.w
    public final ae b() {
        return ae.BOOT_FINISH;
    }

    @Override // com.ss.android.ugc.aweme.lego.n
    public final ab k() {
        return ab.DEFAULT;
    }

    @Override // com.ss.android.ugc.aweme.lego.n
    public final String h() {
        return getClass().getSimpleName();
    }

    public static void c() {
        String str;
        String str2;
        String str3 = "on";
        if (com.ss.android.ugc.aweme.compliance.api.a.o().c()) {
            str = str3;
        } else {
            str = "off";
        }
        if (com.ss.android.ugc.aweme.compliance.api.a.o().a()) {
            str2 = str3;
        } else {
            str2 = "off";
        }
        if (!(com.ss.android.ugc.aweme.compliance.api.a.p().a() == IFamilyPairingService.a.CHILD || com.ss.android.ugc.aweme.compliance.api.a.p().a() == IFamilyPairingService.a.PARENT)) {
            str3 = "off";
        }
        int i2 = ac.f107943a[com.ss.android.ugc.aweme.compliance.api.a.p().a().ordinal()];
        int i3 = 2;
        if (i2 == 1) {
            i3 = 1;
        } else if (i2 != 2) {
            i3 = 0;
        }
        r.a("time_lock_status", new d().a("status", str).f66730a);
        r.a("teen_mode_status", new d().a("status", str2).f66730a);
        r.a("kid_platform_status", new d().a("status", str3).a("role", i3).f66730a);
    }

    @Override // com.ss.android.ugc.aweme.lego.n
    public final void a(Context context) {
        IAccountUserService g2 = b.g();
        l.b(g2, "");
        if (g2.isLogin()) {
            com.ss.android.ugc.aweme.compliance.api.a.o().a(new a(this));
        }
    }
}
