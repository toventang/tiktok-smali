package com.ss.android.ugc.aweme.relation.api;

import com.bytedance.covode.number.Covode;
import com.ss.android.ugc.aweme.relation.api.RelationApi;
import dagger.a.c;
import dagger.a.f;

public final class b implements c<RelationApi> {
    static {
        Covode.recordClassIndex(78285);
    }

    @Override // javax.a.a
    public final /* synthetic */ Object get() {
        return a();
    }

    public static RelationApi a() {
        return (RelationApi) f.a(RelationApi.a.a(), "Cannot return null from a non-@Nullable @Provides method");
    }
}
