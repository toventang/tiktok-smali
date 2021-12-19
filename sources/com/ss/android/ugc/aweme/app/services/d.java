package com.ss.android.ugc.aweme.app.services;

import android.content.Context;
import com.bytedance.covode.number.Covode;
import com.ss.android.ugc.aweme.commercialize.api.CommerceSettingsApi;
import com.ss.android.ugc.aweme.commercialize.model.ad;
import com.ss.android.ugc.aweme.commercialize.model.t;
import com.ss.android.ugc.aweme.commercialize.utils.w;
import com.ss.android.ugc.aweme.main.service.ICommerceService;
import h.f.b.l;

public final class d implements ICommerceService {
    static {
        Covode.recordClassIndex(41198);
    }

    public static class a {

        /* renamed from: a  reason: collision with root package name */
        public static final d f66888a = new d();

        static {
            Covode.recordClassIndex(41199);
        }
    }

    @Override // com.ss.android.ugc.aweme.main.service.ICommerceService
    public final ad a(String str) {
        boolean z;
        t tVar;
        ad[] adVarArr;
        if (str == null || str.length() == 0) {
            z = true;
        } else {
            z = false;
        }
        if (!(z || (tVar = CommerceSettingsApi.f73696a) == null || (adVarArr = tVar.f74911b) == null)) {
            for (ad adVar : adVarArr) {
                if (l.a((Object) adVar.f74850a, (Object) str)) {
                    return adVar;
                }
            }
        }
        return null;
    }

    @Override // com.ss.android.ugc.aweme.main.service.ICommerceService
    public final boolean a(Context context, String str, String str2) {
        return w.a(context, str, str2);
    }

    @Override // com.ss.android.ugc.aweme.main.service.ICommerceService
    public final boolean a(Context context, String str, boolean z) {
        return w.a(context, str, z);
    }
}
