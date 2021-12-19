package com.ss.android.ugc.aweme.miniapp.a;

import com.bytedance.covode.number.Covode;
import com.bytedance.ies.abmock.SettingsManager;
import com.google.gson.o;
import com.kakao.usermgmt.StringSet;

public final class b {

    /* renamed from: a  reason: collision with root package name */
    public static final o f109633a;

    /* renamed from: b  reason: collision with root package name */
    public static final b f109634b = new b();

    /* renamed from: c  reason: collision with root package name */
    private static final o f109635c;

    private b() {
    }

    public static o a() {
        return (o) SettingsManager.a().a("resso_control_list", o.class, f109633a);
    }

    static {
        Covode.recordClassIndex(70160);
        o oVar = new o();
        f109635c = oVar;
        o oVar2 = new o();
        oVar2.a(StringSet.name, "UMG");
        oVar2.a("show_interval_in_millSeconds", (Number) 86400000);
        oVar2.a("max_finish_count", (Number) 10);
        oVar.a("id1", oVar2);
        f109633a = oVar;
    }
}
