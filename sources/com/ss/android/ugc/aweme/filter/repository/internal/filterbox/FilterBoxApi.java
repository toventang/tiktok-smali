package com.ss.android.ugc.aweme.filter.repository.internal.filterbox;

import com.bytedance.covode.number.Covode;
import com.ss.android.ugc.effectmanager.common.model.BaseNetResponse;
import f.a.ab;
import l.b.a;
import l.b.f;
import l.b.o;
import l.b.t;

public interface FilterBoxApi {
    static {
        Covode.recordClassIndex(60577);
    }

    @f(a = "effect/api/filterbox/list")
    ab<g> listFilterBox(@t(a = "access_key") String str, @t(a = "sdk_version") String str2, @t(a = "app_version") String str3, @t(a = "region") String str4, @t(a = "panel") String str5);

    @o(a = "effect/api/filterbox/update")
    ab<BaseNetResponse> updateFilterBox(@a i iVar);
}
