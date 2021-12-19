package com.ss.android.ugc.aweme.request_combine.request.a;

import android.content.Context;
import android.content.SharedPreferences;
import com.bytedance.covode.number.Covode;
import com.ss.android.ugc.aweme.IAccountUserService;
import com.ss.android.ugc.aweme.SettingsRequestServiceImpl;
import com.ss.android.ugc.aweme.account.b;
import com.ss.android.ugc.aweme.app.f.d;
import com.ss.android.ugc.aweme.im.g;
import com.ss.android.ugc.aweme.lego.aa;
import com.ss.android.ugc.aweme.lego.ab;
import com.ss.android.ugc.aweme.lego.ad;
import com.ss.android.ugc.aweme.lego.r;
import com.ss.android.ugc.aweme.lego.s;
import h.f.b.l;
import java.util.List;

public final class f implements r {

    /* renamed from: a  reason: collision with root package name */
    private int f120644a = 1;

    static {
        Covode.recordClassIndex(78571);
    }

    @Override // com.ss.android.ugc.aweme.lego.n
    public final void a(Context context) {
    }

    @Override // com.ss.android.ugc.aweme.lego.n
    public final int bK_() {
        return 1048575;
    }

    @Override // com.ss.android.ugc.aweme.lego.n
    public final ad f() {
        return s.a(this);
    }

    @Override // com.ss.android.ugc.aweme.lego.n
    public final String g() {
        return "request_";
    }

    @Override // com.ss.android.ugc.aweme.lego.n
    public final boolean i() {
        return true;
    }

    @Override // com.ss.android.ugc.aweme.lego.n
    public final List j() {
        return null;
    }

    @Override // com.ss.android.ugc.aweme.lego.r
    public final aa b() {
        return aa.IDLE;
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
        if (com.ss.android.ugc.aweme.compliance.api.a.d().h() == 1) {
            str = "on";
        } else {
            str = "off";
        }
        com.ss.android.ugc.aweme.common.r.a("tns_remove_photosensitive_status", new d().a("status", str).f66730a);
    }

    public static final class a implements com.ss.android.ugc.aweme.setting.serverpush.a {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ f f120645a;

        static {
            Covode.recordClassIndex(78572);
        }

        /* JADX WARN: Incorrect args count in method signature: ()V */
        a(f fVar) {
            this.f120645a = fVar;
        }

        @Override // com.ss.android.ugc.aweme.setting.serverpush.a
        public final void a(Exception exc) {
            l.d(exc, "");
            f.c();
        }

        @Override // com.ss.android.ugc.aweme.setting.serverpush.a
        public final void a(com.ss.android.ugc.aweme.setting.serverpush.a.f fVar) {
            l.d(fVar, "");
            g.a.a();
            g.c(Integer.valueOf(fVar.n));
            boolean z = false;
            SharedPreferences.Editor edit = com.ss.android.ugc.aweme.bf.d.a(com.bytedance.ies.ugc.appcontext.d.a(), "imbase_" + com.ss.android.ugc.aweme.emoji.utils.a.c(), 0).edit();
            if (fVar.n == 1) {
                z = true;
            }
            edit.putBoolean("key_mt_inner_push_switch_on", z).commit();
            g.a.a();
            g.a(Integer.valueOf(fVar.q));
            g.a.a();
            g.d(Integer.valueOf(fVar.f122566e));
            g.a.a();
            g.b(Integer.valueOf(fVar.V));
            f.c();
        }
    }

    @Override // com.ss.android.ugc.aweme.lego.r
    public final void a(Context context, boolean z) {
        l.d(context, "");
        IAccountUserService g2 = b.g();
        l.b(g2, "");
        if (g2.isLogin()) {
            SettingsRequestServiceImpl.i().a(new a(this));
        }
    }
}
