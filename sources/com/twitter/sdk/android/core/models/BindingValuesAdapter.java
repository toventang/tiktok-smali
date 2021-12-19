package com.twitter.sdk.android.core.models;

import com.bytedance.covode.number.Covode;
import com.google.gson.j;
import com.google.gson.k;
import com.google.gson.l;
import com.google.gson.o;
import com.google.gson.r;
import com.google.gson.s;
import com.kakao.usermgmt.StringSet;
import java.lang.reflect.Type;
import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class BindingValuesAdapter implements k<c>, s<c> {
    static {
        Covode.recordClassIndex(103711);
    }

    /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
    @Override // com.google.gson.s
    public final /* bridge */ /* synthetic */ l a(c cVar) {
        return null;
    }

    /* Return type fixed from 'java.lang.Object' to match base method */
    @Override // com.google.gson.k
    public final /* synthetic */ c a(l lVar, Type type, j jVar) {
        if (!(lVar instanceof o)) {
            return new c();
        }
        Set<Map.Entry<String, l>> entrySet = lVar.j().f54898a.entrySet();
        HashMap hashMap = new HashMap(32);
        for (Map.Entry<String, l> entry : entrySet) {
            String key = entry.getKey();
            o j2 = entry.getValue().j();
            l c2 = j2.c(StringSet.type);
            Object obj = null;
            if (c2 != null && (c2 instanceof r)) {
                String c3 = c2.c();
                c3.hashCode();
                switch (c3.hashCode()) {
                    case -1838656495:
                        if (!c3.equals("STRING")) {
                            break;
                        } else {
                            obj = jVar.a(j2.c("string_value"), String.class);
                            continue;
                        }
                    case 2614219:
                        if (!c3.equals("USER")) {
                            break;
                        } else {
                            obj = jVar.a(j2.c("user_value"), e.class);
                            continue;
                        }
                    case 69775675:
                        if (!c3.equals("IMAGE")) {
                            break;
                        } else {
                            obj = jVar.a(j2.c("image_value"), d.class);
                            continue;
                        }
                    case 782694408:
                        if (!c3.equals("BOOLEAN")) {
                            break;
                        } else {
                            obj = jVar.a(j2.c("boolean_value"), Boolean.class);
                            continue;
                        }
                }
            }
            hashMap.put(key, obj);
        }
        return new c(hashMap);
    }
}
