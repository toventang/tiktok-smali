package com.ss.android.ugc.aweme.requesttask.idle;

import android.content.Context;
import com.bytedance.covode.number.Covode;
import com.ss.android.common.applog.AppLog;
import com.ss.android.common.c.c;
import com.ss.android.ugc.aweme.co.b;
import com.ss.android.ugc.aweme.lego.aa;
import com.ss.android.ugc.aweme.lego.ab;
import com.ss.android.ugc.aweme.lego.ad;
import com.ss.android.ugc.aweme.lego.r;
import com.ss.android.ugc.aweme.lego.s;
import h.f.b.l;
import java.util.List;

public final class d implements r {

    /* renamed from: a  reason: collision with root package name */
    public static final String f120698a = "is_active";

    /* renamed from: b  reason: collision with root package name */
    public static final String f120699b = "last_active_version";

    /* renamed from: c  reason: collision with root package name */
    public static final String f120700c = "last_channel";

    /* renamed from: d  reason: collision with root package name */
    public static final String f120701d = "last_device_id";

    /* renamed from: e  reason: collision with root package name */
    public static final String f120702e = "last_install_id";

    /* renamed from: f  reason: collision with root package name */
    public static final a f120703f = new a((byte) 0);

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

    public static final class a {
        static {
            Covode.recordClassIndex(78633);
        }

        private a() {
        }

        public /* synthetic */ a(byte b2) {
            this();
        }
    }

    @Override // com.ss.android.ugc.aweme.lego.r
    public final aa b() {
        return aa.NORMAL;
    }

    @Override // com.ss.android.ugc.aweme.lego.n
    public final ab k() {
        return ab.DEFAULT;
    }

    @Override // com.ss.android.ugc.aweme.lego.n
    public final String h() {
        return getClass().getSimpleName();
    }

    static {
        Covode.recordClassIndex(78632);
    }

    @Override // com.ss.android.ugc.aweme.lego.r
    public final void a(Context context, boolean z) {
        l.d(context, "");
        AppLog.activeUser(com.bytedance.ies.ugc.appcontext.d.a());
        b.b().a(com.bytedance.ies.ugc.appcontext.d.a(), f120699b, com.bytedance.ies.ugc.appcontext.d.f());
        b.b().a(com.bytedance.ies.ugc.appcontext.d.a(), f120700c, com.bytedance.ies.ugc.appcontext.d.s);
        b.b().a(com.bytedance.ies.ugc.appcontext.d.a(), f120701d, AppLog.getServerDeviceId());
        b.b().a(com.bytedance.ies.ugc.appcontext.d.a(), f120702e, AppLog.getInstallId());
        c.a(context, "monitor", "app_alert", 0, 0);
    }
}
