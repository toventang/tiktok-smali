package com.ss.android.ugc.aweme.geofencing.d;

import android.content.Intent;
import com.bytedance.covode.number.Covode;
import h.a.i;
import h.f.b.l;
import java.io.Serializable;
import java.util.List;
import java.util.Objects;

public final class a {
    static {
        Covode.recordClassIndex(62982);
    }

    public static final List<com.ss.android.ugc.aweme.geofencing.c.a> a(Intent intent) {
        l.d(intent, "");
        Serializable serializableExtra = intent.getSerializableExtra("extra.region.list");
        if (serializableExtra == null) {
            return null;
        }
        l.b(serializableExtra, "");
        if (!(serializableExtra instanceof com.ss.android.ugc.aweme.geofencing.c.a[])) {
            serializableExtra = null;
        }
        Object[] objArr = (Object[]) serializableExtra;
        if (objArr != null) {
            return i.j(objArr);
        }
        return null;
    }

    public static final void a(Intent intent, List<com.ss.android.ugc.aweme.geofencing.c.a> list) {
        l.d(intent, "");
        l.d(list, "");
        Object[] array = list.toArray(new com.ss.android.ugc.aweme.geofencing.c.a[0]);
        Objects.requireNonNull(array, "null cannot be cast to non-null type kotlin.Array<T>");
        intent.putExtra("extra.region.list", (Serializable) array);
    }
}
