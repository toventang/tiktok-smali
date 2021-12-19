package com.ss.android.ugc.aweme.setting.m;

import com.bytedance.covode.number.Covode;
import com.bytedance.jedi.a.f.d;
import com.ss.android.ugc.aweme.app.api.Api;
import com.ss.android.ugc.aweme.base.api.BaseResponse;
import com.ss.android.ugc.aweme.setting.api.AuthDeleteApi;
import f.a.t;
import h.f.b.l;
import java.util.LinkedHashMap;

public final class a extends d<LinkedHashMap<String, String>, BaseResponse> {

    /* renamed from: a  reason: collision with root package name */
    private final AuthDeleteApi f122268a;

    static {
        Covode.recordClassIndex(80198);
    }

    public a() {
        String str = Api.f66569d;
        l.b(str, "");
        this.f122268a = (AuthDeleteApi) com.bytedance.ies.ugc.aweme.network.ext.a.a().a(str).a(AuthDeleteApi.class);
    }

    @Override // com.bytedance.jedi.a.f.a
    public final /* synthetic */ t a(Object obj) {
        LinkedHashMap<String, String> linkedHashMap = (LinkedHashMap) obj;
        l.d(linkedHashMap, "");
        t<BaseResponse> b2 = this.f122268a.deleteAuthInfoApp(linkedHashMap).b(f.a.h.a.b(f.a.k.a.f158006c));
        l.b(b2, "");
        return b2;
    }
}
