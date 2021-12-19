package com.ss.android.ugc.aweme.common;

import com.bytedance.covode.number.Covode;
import com.google.gson.c.a;
import com.google.gson.f;
import com.google.gson.internal.j;
import com.ss.android.ugc.effectmanager.common.listener.IJsonConverter;
import h.f.b.l;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.lang.reflect.Type;

public final class p implements IJsonConverter {
    static {
        Covode.recordClassIndex(47230);
    }

    @Override // com.ss.android.ugc.effectmanager.common.listener.IJsonConverter
    public final <T> String convertObjToJson(T t) {
        return new f().b(t);
    }

    @Override // com.ss.android.ugc.effectmanager.common.listener.IJsonConverter
    public final <T> T convertJsonToObj(InputStream inputStream, Class<T> cls) {
        l.d(inputStream, "");
        f fVar = new f();
        try {
            a aVar = new a(new InputStreamReader(inputStream));
            T t = (T) j.a(cls).cast(fVar.a(aVar, (Type) cls));
            aVar.close();
            inputStream.close();
            return t;
        } catch (Exception e2) {
            e2.printStackTrace();
            return null;
        }
    }
}
