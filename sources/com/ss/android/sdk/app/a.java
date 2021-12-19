package com.ss.android.sdk.app;

import com.bytedance.covode.number.Covode;
import com.bytedance.g.g;
import com.bytedance.keva.Keva;
import com.ss.android.common.applog.AppLog;
import h.f.b.l;
import h.m.p;
import h.w;
import java.util.List;

final /* synthetic */ class a implements g {

    /* renamed from: a  reason: collision with root package name */
    static final g f60151a = new a();

    static {
        Covode.recordClassIndex(37157);
    }

    private a() {
    }

    @Override // com.bytedance.g.g
    public final void a(String str) {
        l.c(str, "");
        if (str.length() > 0) {
            List<String> b2 = p.b(str, new String[]{","});
            Keva keva = com.bytedance.ies.abmock.datacenter.b.a.f31802a;
            if (b2 != null) {
                Object[] array = b2.toArray(new String[0]);
                if (array != null) {
                    keva.storeStringArray("__client_exp_vids", (String[]) array);
                } else {
                    throw new w("null cannot be cast to non-null type");
                }
            } else {
                throw new w("null cannot be cast to non-null type");
            }
        } else {
            com.bytedance.ies.abmock.datacenter.b.a.f31802a.storeStringArray("__client_exp_vids", new String[0]);
        }
        AppLog.setAbSDKVersion(com.bytedance.ies.abmock.datacenter.b.a.c());
    }
}
