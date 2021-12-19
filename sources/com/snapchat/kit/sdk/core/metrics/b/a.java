package com.snapchat.kit.sdk.core.metrics.b;

import android.util.Base64;
import com.bytedance.covode.number.Covode;
import com.google.gson.f;
import com.google.gson.p;
import com.snapchat.kit.sdk.core.metrics.d;
import com.squareup.wire.Message;
import com.squareup.wire.ProtoAdapter;
import java.lang.reflect.Type;
import java.util.ArrayList;
import java.util.List;

public final class a {

    /* renamed from: a  reason: collision with root package name */
    private static final Type f57153a = new com.google.gson.b.a<List<d<String>>>() {
        /* class com.snapchat.kit.sdk.core.metrics.b.a.AnonymousClass1 */

        static {
            Covode.recordClassIndex(35617);
        }
    }.type;

    /* renamed from: b  reason: collision with root package name */
    private final f f57154b;

    static {
        Covode.recordClassIndex(35616);
    }

    a(f fVar) {
        this.f57154b = fVar;
    }

    public final <T extends Message> String a(List<d<T>> list) {
        try {
            return this.f57154b.b(b(list), f57153a);
        } catch (p unused) {
            return null;
        }
    }

    private static <T extends Message> List<d<String>> b(List<d<T>> list) {
        ArrayList arrayList = new ArrayList(list.size());
        for (d<T> dVar : list) {
            try {
                arrayList.add(new d(Base64.encodeToString(dVar.f57185b.encode(), 0), dVar.f57184a));
            } catch (Exception unused) {
            }
        }
        return arrayList;
    }

    public final <T extends Message> List<d<T>> a(ProtoAdapter<T> protoAdapter, String str) {
        try {
            List list = (List) this.f57154b.a(str, f57153a);
            if (list == null) {
                return null;
            }
            return a(protoAdapter, list);
        } catch (p unused) {
            return null;
        }
    }

    private static <T extends Message> List<d<T>> a(ProtoAdapter<T> protoAdapter, List<d<String>> list) {
        ArrayList arrayList = new ArrayList(list.size());
        for (d<String> dVar : list) {
            T t = dVar.f57185b;
            if (t != null) {
                try {
                    arrayList.add(new d(protoAdapter.decode(Base64.decode(t, 0)), dVar.f57184a));
                } catch (Exception unused) {
                }
            }
        }
        return arrayList;
    }
}
