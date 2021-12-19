package com.ss.android.ugc.aweme.account.login.v2.ui;

import com.appsflyer.BuildConfig;
import com.bytedance.android.livesdk.livesetting.wallet.LiveRechargeAgeThresholdSetting;
import com.bytedance.android.livesdk.livesetting.watchlive.AudiencePingIntervalSetting;
import com.bytedance.covode.number.Covode;
import com.bytedance.vcloud.abrmodule.ABRConfig;
import com.ss.android.ugc.aweme.account.l.a;
import com.ss.android.ugc.aweme.account.login.recover.b;
import com.ss.android.ugc.aweme.account.login.twostep.y;
import com.ss.android.ugc.aweme.account.login.twostep.z;
import com.ss.android.ugc.aweme.account.login.v2.base.c;
import com.ss.android.ugc.aweme.account.login.v2.base.k;
import com.ss.android.ugc.aweme.account.login.v2.ui.a.d;
import com.ss.android.ugc.aweme.account.login.v2.ui.a.f;
import com.ss.android.ugc.aweme.account.login.v2.ui.a.g;
import com.ss.android.ugc.aweme.account.login.v2.ui.a.h;
import com.ss.android.ugc.aweme.account.login.v2.ui.a.j;
import com.ss.android.ugc.aweme.account.login.v2.ui.a.n;
import com.ss.android.ugc.aweme.account.login.v2.ui.a.o;
import com.ss.android.ugc.aweme.account.login.v2.ui.a.p;
import com.ss.android.ugc.aweme.account.login.v2.ui.a.r;
import com.ss.android.ugc.aweme.account.login.v2.ui.a.s;
import com.ss.android.ugc.aweme.account.login.v2.ui.a.t;
import com.ss.android.ugc.aweme.account.login.v2.ui.a.u;
import com.ss.android.ugc.aweme.account.login.v2.ui.a.w;
import com.ss.android.ugc.playerkit.model.v;
import h.f.b.l;

public final class i {

    /* renamed from: a  reason: collision with root package name */
    public static final i f65080a = new i();

    private i() {
    }

    static {
        Covode.recordClassIndex(39996);
    }

    public static c a(k kVar) {
        l.d(kVar, "");
        switch (j.f65081a[kVar.ordinal()]) {
            case 1:
            case 2:
            case 3:
            case 4:
                return new d();
            case ABRConfig.ABR_STARTUP_MODEL_KEY:
            case ABRConfig.ABR_PLAYER_DISPLAY_WIDTH_KEY:
            case ABRConfig.ABR_PLAYER_DISPLAY_HEIGHT_KEY:
            case ABRConfig.ABR_STARTUP_BANDWIDTH_PARAMETER_KEY:
            case ABRConfig.ABR_STALL_PENALTY_PARAMETER_KEY:
            case ABRConfig.ABR_SWITCH_PENALTY_PARAMETER_KEY:
            case ABRConfig.ABR_BANDWIDTH_PARAMETER_KEY:
            case ABRConfig.ABR_DEFAULT_WIFI_BITRATE:
                return new j();
            case ABRConfig.ABR_STARTUP_MAX_BITRATE:
                return new com.ss.android.ugc.aweme.account.o.c();
            case ABRConfig.ABR_SELECT_SCENE:
            case 15:
            case 16:
            case 17:
            case LiveRechargeAgeThresholdSetting.DEFAULT:
            case 19:
                return new com.ss.android.ugc.aweme.account.agegate.b.c();
            case v.U /*{ENCODED_INT: 20}*/:
            case 21:
            case 22:
                return new p();
            case 23:
                return new n();
            case 24:
                return new o();
            case 25:
                return new r();
            case 26:
                return new s();
            case 27:
                return new com.ss.android.ugc.aweme.account.login.v2.ui.a.v();
            case 28:
            case 29:
                return new f();
            case 30:
                return new t();
            case 31:
                return new u();
            case 32:
                return new g();
            case 33:
                return new b();
            case 34:
                return new com.ss.android.ugc.aweme.account.login.recover.f();
            case 35:
                return new f();
            case 36:
                return new t();
            case 37:
                return new j();
            case 38:
                return new com.ss.android.ugc.aweme.account.l.g();
            case 39:
                return new a();
            case 40:
            case 41:
                return new com.ss.android.ugc.aweme.account.l.i();
            case 42:
                return new com.ss.android.ugc.aweme.account.b.b();
            case 43:
                return new com.ss.android.ugc.aweme.account.b.a();
            case BuildConfig.VERSION_CODE:
                return new com.ss.android.ugc.aweme.account.d.b();
            case 45:
                return new com.ss.android.ugc.aweme.account.d.c();
            case 46:
                return new com.ss.android.ugc.aweme.account.d.a();
            case 47:
                return new com.ss.android.ugc.aweme.account.o.a();
            case 48:
                return new com.ss.android.ugc.aweme.account.o.d();
            case 49:
                return new com.ss.android.ugc.aweme.account.l.c();
            case 50:
                return new com.ss.android.ugc.aweme.account.login.rememberaccount.b();
            case 51:
            case 52:
            case 53:
                return new w();
            case 54:
                return new com.ss.android.ugc.aweme.account.agegate.c.a();
            case 55:
                return new com.ss.android.ugc.aweme.account.agegate.c.d();
            case 56:
                return new com.ss.android.ugc.aweme.account.login.v2.ui.a.b();
            case 57:
            case 58:
                return new com.ss.android.ugc.aweme.account.login.twostep.r();
            case 59:
                return new com.ss.android.ugc.aweme.account.login.twostep.s();
            case AudiencePingIntervalSetting.DEFAULT:
                return new y();
            case 61:
                return new z();
            case 62:
                return new com.ss.android.ugc.aweme.account.login.d.b();
            case 63:
                return new a();
            case 64:
            case 65:
                return new com.ss.android.ugc.aweme.account.unbind.a();
            case 66:
            case 67:
            case 68:
                return new com.ss.android.ugc.aweme.account.unbind.c();
            case 69:
                return new h();
            default:
                throw new IllegalArgumentException("Unknown step " + kVar + " in LoginFlowFactory");
        }
    }
}
