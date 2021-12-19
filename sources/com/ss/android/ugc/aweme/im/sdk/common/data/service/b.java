package com.ss.android.ugc.aweme.im.sdk.common.data.service;

import com.bytedance.covode.number.Covode;
import com.ss.android.ugc.aweme.im.sdk.common.controller.e.g;
import com.ss.android.ugc.aweme.im.sdk.common.controller.utils.c;
import com.ss.android.ugc.aweme.im.sdk.relations.data.b.d;
import com.ss.android.ugc.aweme.im.service.j.a;
import com.ss.android.ugc.aweme.im.service.model.IMUser;
import h.f.b.l;
import h.z;
import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.Map;

public final class b implements a {

    /* renamed from: a  reason: collision with root package name */
    private Map<String, Integer> f102493a = new LinkedHashMap();

    /* renamed from: b  reason: collision with root package name */
    private final com.ss.android.ugc.aweme.im.sdk.relations.data.b.b f102494b = com.ss.android.ugc.aweme.im.sdk.relations.data.b.b.f102978c;

    static {
        Covode.recordClassIndex(65635);
    }

    @Override // com.ss.android.ugc.aweme.im.service.j.a
    public final void a() {
        if (c.a()) {
            com.ss.android.ugc.aweme.im.sdk.relations.data.core.c.a();
        }
    }

    @Override // com.ss.android.ugc.aweme.im.service.j.a
    public final com.ss.android.ugc.aweme.im.service.model.c b(com.ss.android.ugc.aweme.im.service.model.b bVar) {
        l.d(bVar, "");
        l.d(bVar, "");
        return new com.ss.android.ugc.aweme.im.service.model.c();
    }

    @Override // com.ss.android.ugc.aweme.im.service.j.a
    public final void a(com.ss.android.ugc.aweme.im.service.model.b bVar) {
        l.d(bVar, "");
        l.d(bVar, "");
    }

    @Override // com.ss.android.ugc.aweme.im.service.j.a
    public final String a(String str, String str2, IMUser iMUser) {
        l.d(str, "");
        if (this.f102493a.isEmpty()) {
            com.ss.android.ugc.aweme.im.sdk.common.data.b.c.a.a();
            Map<String, Integer> c2 = com.ss.android.ugc.aweme.im.sdk.common.data.b.c.a.c();
            Map<String, Integer> map = this.f102493a;
            l.b(c2, "");
            map.putAll(c2);
        }
        if (iMUser == null && (iMUser = g.b(str, str2)) == null) {
            return "";
        }
        d[] dVarArr = com.ss.android.ugc.aweme.im.sdk.relations.data.b.b.f102977b;
        ArrayList arrayList = new ArrayList(dVarArr.length);
        for (d dVar : dVarArr) {
            int i2 = dVar.f102994a;
            Integer num = this.f102493a.get(iMUser.getSecUid());
            if (num != null && i2 == num.intValue()) {
                return dVar.f102995b;
            }
            arrayList.add(z.f158842a);
        }
        return "";
    }
}
