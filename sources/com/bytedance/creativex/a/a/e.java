package com.bytedance.creativex.a.a;

import android.os.Bundle;
import android.os.Parcelable;
import com.bytedance.covode.number.Covode;
import com.google.gson.c.a;
import com.google.gson.c.c;
import com.google.gson.f;
import com.google.gson.v;
import h.f.b.l;
import java.io.Serializable;
import java.util.Set;

public final class e extends v<Bundle> {

    /* renamed from: a  reason: collision with root package name */
    private final f f28032a;

    /* renamed from: b  reason: collision with root package name */
    private final c f28033b;

    static {
        Covode.recordClassIndex(16416);
    }

    /* Return type fixed from 'java.lang.Object' to match base method */
    @Override // com.google.gson.v
    public final /* synthetic */ Bundle read(a aVar) {
        l.d(aVar, "");
        Bundle bundle = new Bundle(getClass().getClassLoader());
        aVar.c();
        while (aVar.e()) {
            String h2 = aVar.h();
            c cVar = this.f28033b;
            l.b(h2, "");
            Object a2 = this.f28032a.a(aVar.i(), (Class) cVar.a(h2));
            if (a2 == null) {
                bundle.putSerializable(h2, null);
            } else if (a2 instanceof Parcelable) {
                bundle.putParcelable(h2, (Parcelable) a2);
            } else if (a2 instanceof Serializable) {
                bundle.putSerializable(h2, (Serializable) a2);
            } else if (a2 instanceof Byte) {
                bundle.putByte(h2, ((Number) a2).byteValue());
            } else if (a2 instanceof Character) {
                bundle.putChar(h2, ((Character) a2).charValue());
            } else if (a2 instanceof Boolean) {
                bundle.putBoolean(h2, ((Boolean) a2).booleanValue());
            } else if (a2 instanceof Integer) {
                bundle.putInt(h2, ((Number) a2).intValue());
            } else if (a2 instanceof Short) {
                bundle.putShort(h2, ((Number) a2).shortValue());
            } else if (a2 instanceof Long) {
                bundle.putLong(h2, ((Number) a2).longValue());
            } else if (a2 instanceof Float) {
                bundle.putFloat(h2, ((Number) a2).floatValue());
            } else if (a2 instanceof Double) {
                bundle.putDouble(h2, ((Number) a2).doubleValue());
            } else if (a2 instanceof String) {
                bundle.putString(h2, (String) a2);
            } else {
                throw new IllegalStateException("type not supported yet".toString());
            }
        }
        aVar.d();
        return bundle;
    }

    private static Object a(Bundle bundle, String str) {
        try {
            return bundle.get(str);
        } catch (Exception | OutOfMemoryError unused) {
            return null;
        }
    }

    public e(f fVar, c cVar) {
        l.d(fVar, "");
        l.d(cVar, "");
        this.f28032a = fVar;
        this.f28033b = cVar;
    }

    /* JADX DEBUG: Method arguments types fixed to match base method, original types: [com.google.gson.c.c, java.lang.Object] */
    @Override // com.google.gson.v
    public final /* synthetic */ void write(c cVar, Bundle bundle) {
        Bundle bundle2 = bundle;
        l.d(cVar, "");
        l.d(bundle2, "");
        cVar.d();
        if (bundle2.getClassLoader() == null) {
            bundle2.setClassLoader(getClass().getClassLoader());
        }
        Set<String> keySet = bundle2.keySet();
        l.b(keySet, "");
        for (T t : keySet) {
            c cVar2 = this.f28033b;
            l.b(t, "");
            Class<?> a2 = cVar2.a(t);
            Object a3 = a(bundle2, t);
            cVar.a((String) t);
            cVar.b(this.f28032a.b(a3, a2));
        }
        cVar.e();
    }
}
