package com.ss.android.ugc.aweme.im.sdk.iescore.b;

import android.content.Context;
import android.text.TextUtils;
import com.bytedance.covode.number.Covode;
import com.bytedance.ies.ugc.statisticlogger.a;
import com.ss.android.common.applog.AppLog;
import com.ss.android.common.util.f;
import com.ss.android.ugc.aweme.im.sdk.common.controller.utils.c;
import h.f.b.l;
import okhttp3.internal.Version;

public final class d implements com.bytedance.ies.im.core.api.d.d {

    /* renamed from: a  reason: collision with root package name */
    public static final d f102814a = new d();

    private d() {
    }

    @Override // com.bytedance.ies.im.core.api.d.d
    public final int b() {
        return com.bytedance.ies.ugc.appcontext.d.n;
    }

    @Override // com.bytedance.ies.im.core.api.d.d
    public final String f() {
        return com.bytedance.ies.ugc.appcontext.d.s;
    }

    @Override // com.bytedance.ies.im.core.api.d.d
    public final Context a() {
        return com.bytedance.ies.ugc.appcontext.d.a();
    }

    @Override // com.bytedance.ies.im.core.api.d.d
    public final int c() {
        return (int) com.bytedance.ies.ugc.appcontext.d.e();
    }

    @Override // com.bytedance.ies.im.core.api.d.d
    public final String h() {
        l.b("https://im-va.tiktokv.com/", "");
        return "https://im-va.tiktokv.com/";
    }

    static {
        Covode.recordClassIndex(65918);
    }

    @Override // com.bytedance.ies.im.core.api.d.d
    public final String e() {
        String installId = AppLog.getInstallId();
        if (installId == null) {
            return "";
        }
        return installId;
    }

    @Override // com.bytedance.ies.im.core.api.d.d
    public final boolean g() {
        return l.a((Object) com.bytedance.ies.ugc.appcontext.d.s, (Object) "local_test");
    }

    @Override // com.bytedance.ies.im.core.api.d.d
    public final String i() {
        String userAgent = Version.userAgent();
        l.b(userAgent, "");
        return userAgent;
    }

    @Override // com.bytedance.ies.im.core.api.d.d
    public final String j() {
        String g2 = c.g();
        l.b(g2, "");
        return g2;
    }

    @Override // com.bytedance.ies.im.core.api.d.d
    public final String k() {
        String f2 = c.f();
        l.b(f2, "");
        return f2;
    }

    @Override // com.bytedance.ies.im.core.api.d.d
    public final boolean l() {
        return f.a(com.bytedance.ies.ugc.appcontext.d.a());
    }

    @Override // com.bytedance.ies.im.core.api.d.d
    public final String d() {
        String a2 = a.a();
        if (TextUtils.isEmpty(a2)) {
            a2 = "-1";
        }
        return a2.toString();
    }
}
