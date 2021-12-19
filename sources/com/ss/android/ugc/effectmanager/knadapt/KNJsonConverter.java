package com.ss.android.ugc.effectmanager.knadapt;

import com.bytedance.covode.number.Covode;
import com.bytedance.frameworks.apm.trace.MethodCollector;
import com.ss.android.ugc.effectmanager.common.listener.IJsonConverter;
import com.ss.ugc.effectplatform.a.b.a;
import h.e.c;
import h.f.b.l;
import h.m.d;
import java.io.ByteArrayInputStream;

public final class KNJsonConverter implements a {
    private final IJsonConverter jsonConverter;

    static {
        Covode.recordClassIndex(95548);
    }

    @Override // com.ss.ugc.effectplatform.a.b.a
    public final <T> String convertObjToJson(T t) {
        return this.jsonConverter.convertObjToJson(t);
    }

    public KNJsonConverter(IJsonConverter iJsonConverter) {
        l.c(iJsonConverter, "");
        this.jsonConverter = iJsonConverter;
    }

    @Override // com.ss.ugc.effectplatform.a.b.a
    public final <T> T convertJsonToObj(String str, Class<T> cls) {
        MethodCollector.i(3129);
        l.c(str, "");
        l.c(cls, "");
        byte[] bytes = str.getBytes(d.f158808a);
        l.a((Object) bytes, "");
        ByteArrayInputStream byteArrayInputStream = new ByteArrayInputStream(bytes);
        try {
            IJsonConverter iJsonConverter = this.jsonConverter;
            byte[] bytes2 = str.getBytes(d.f158808a);
            l.a((Object) bytes2, "");
            T t = (T) iJsonConverter.convertJsonToObj(new ByteArrayInputStream(bytes2), cls);
            c.a(byteArrayInputStream, null);
            MethodCollector.o(3129);
            return t;
        } catch (Throwable th) {
            c.a(byteArrayInputStream, th);
            MethodCollector.o(3129);
            throw th;
        }
    }
}
