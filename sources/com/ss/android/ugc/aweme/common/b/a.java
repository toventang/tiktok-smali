package com.ss.android.ugc.aweme.common.b;

import com.bytedance.covode.number.Covode;
import com.google.gson.f;
import com.ss.android.ugc.aweme.port.in.g;
import h.f.b.l;
import java.lang.reflect.Type;

public final class a<T> implements b<String, T> {
    static {
        Covode.recordClassIndex(47149);
    }

    /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object, java.lang.reflect.Type] */
    @Override // com.ss.android.ugc.aweme.common.b.b
    public final /* synthetic */ Object a(String str, Type type) {
        String str2 = str;
        l.d(str2, "");
        l.d(type, "");
        f G = g.a().G();
        com.google.gson.b.a<?> aVar = com.google.gson.b.a.get(type);
        l.b(aVar, "");
        return G.a(str2, aVar.type);
    }
}
