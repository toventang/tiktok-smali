package com.ss.android.ugc.aweme.setting.m;

import com.bytedance.covode.number.Covode;
import com.bytedance.jedi.a.f.d;
import com.ss.android.ugc.aweme.setting.api.AuthListApi;
import f.a.h.a;
import f.a.t;
import h.f.b.l;
import h.z;

public final class b extends d<z, com.ss.android.ugc.aweme.setting.model.b> {

    /* renamed from: a  reason: collision with root package name */
    private final AuthListApi f122285a = AuthListApi.a.a();

    static {
        Covode.recordClassIndex(80199);
    }

    @Override // com.bytedance.jedi.a.f.a
    public final /* synthetic */ t a(Object obj) {
        l.d(obj, "");
        t<com.ss.android.ugc.aweme.setting.model.b> b2 = this.f122285a.getAuthInfoList().b(a.b(f.a.k.a.f158006c));
        l.b(b2, "");
        return b2;
    }
}
