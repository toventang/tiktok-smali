package com.ss.android.ugc.aweme.services;

import com.bytedance.covode.number.Covode;
import com.bytedance.ies.ugc.aweme.network.RetrofitFactory;
import com.bytedance.retrofit2.c.a;
import com.google.gson.f;
import com.ss.android.c.b;
import com.ss.android.ugc.aweme.port.in.au;
import com.ss.android.ugc.aweme.utils.GsonHolder;
import h.f.b.l;
import java.util.List;

public final class NetworkServiceImpl implements au {
    static {
        Covode.recordClassIndex(79530);
    }

    @Override // com.ss.android.ugc.aweme.port.in.au
    public final String getApiHost() {
        String str = b.f59138b;
        l.b(str, "");
        return str;
    }

    @Override // com.ss.android.ugc.aweme.port.in.au
    public final f getRetrofitFactoryGson() {
        f b2 = GsonHolder.c().b();
        l.b(b2, "");
        return b2;
    }

    @Override // com.ss.android.ugc.aweme.port.in.au
    public final <T> T createDefaultRetrofit(Class<T> cls) {
        l.d(cls, "");
        return (T) RetrofitFactory.a().a(getApiHost()).a(cls);
    }

    @Override // com.ss.android.ugc.aweme.port.in.au
    public final <T> T retrofitCreate(String str, Class<T> cls) {
        l.d(str, "");
        l.d(cls, "");
        return (T) RetrofitService.createIRetrofitServicebyMonsterPlugin(false).createNewRetrofit(str).create(cls);
    }

    @Override // com.ss.android.ugc.aweme.port.in.au
    public final <T> T createRetrofit(String str, boolean z, Class<T> cls) {
        l.d(str, "");
        l.d(cls, "");
        return (T) RetrofitFactory.a().b(str).a(z).d().a(cls);
    }

    @Override // com.ss.android.ugc.aweme.port.in.au
    public final <T> T createRetrofitWithInterceptors(String str, boolean z, Class<T> cls, List<? extends a> list) {
        l.d(str, "");
        l.d(cls, "");
        l.d(list, "");
        return (T) RetrofitFactory.a().b(str).a(z).a((List<a>) list).d().a(cls);
    }
}
