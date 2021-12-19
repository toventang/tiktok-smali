package com.ss.android.ugc.aweme.settingsrequest.api;

import com.bytedance.covode.number.Covode;
import com.bytedance.ies.abmock.b;
import com.google.gson.l;
import com.google.gson.o;
import com.ss.android.ugc.aweme.logger.a;
import f.a.v;
import f.a.w;

public final /* synthetic */ class d implements w {

    /* renamed from: a  reason: collision with root package name */
    private final l f123165a;

    static {
        Covode.recordClassIndex(80894);
    }

    public d(l lVar) {
        this.f123165a = lVar;
    }

    @Override // f.a.w
    public final void subscribe(v vVar) {
        l lVar = this.f123165a;
        try {
            a.a(lVar.j());
            o f2 = lVar.j().f("data");
            if (f2 != null) {
                a.b.f109011a.a("method_save_abtest_keva", false);
                b.a().a(f2);
                a.b.f109011a.b("method_save_abtest_keva", false);
                com.ss.android.ugc.aweme.setting.a.f122009a.a();
            }
            vVar.a((Object) true);
        } catch (Exception e2) {
            e2.printStackTrace();
        }
    }
}
