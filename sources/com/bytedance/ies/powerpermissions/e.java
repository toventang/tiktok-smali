package com.bytedance.ies.powerpermissions;

import com.bytedance.covode.number.Covode;
import h.a.n;
import h.f.b.l;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.Objects;

public abstract class e {

    /* renamed from: a  reason: collision with root package name */
    final ArrayList<String> f34458a = new ArrayList<>();

    /* renamed from: b  reason: collision with root package name */
    private m f34459b;

    static {
        Covode.recordClassIndex(20605);
    }

    public abstract void a(m mVar, String... strArr);

    public final void a() {
        m mVar = this.f34459b;
        Object[] array = this.f34458a.toArray(new String[0]);
        Objects.requireNonNull(array, "null cannot be cast to non-null type kotlin.Array<T>");
        String[] strArr = (String[]) array;
        a(mVar, (String[]) Arrays.copyOf(strArr, strArr.length));
    }

    public final void a(m mVar) {
        l.c(mVar, "");
        this.f34459b = mVar;
    }

    public final void a(String... strArr) {
        l.c(strArr, "");
        if (strArr.length != 0) {
            n.a((Collection) this.f34458a, (Object[]) strArr);
        }
    }
}
