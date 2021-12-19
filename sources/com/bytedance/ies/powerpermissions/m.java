package com.bytedance.ies.powerpermissions;

import com.bytedance.bpea.basics.PrivacyCert;
import com.bytedance.covode.number.Covode;
import h.f.b.l;
import java.lang.ref.WeakReference;
import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Objects;

public final class m {

    /* renamed from: a  reason: collision with root package name */
    final ArrayList<String> f34471a = new ArrayList<>();

    /* renamed from: b  reason: collision with root package name */
    final ArrayDeque<e> f34472b = new ArrayDeque<>();

    /* renamed from: c  reason: collision with root package name */
    WeakReference<d> f34473c;

    /* renamed from: d  reason: collision with root package name */
    public boolean f34474d = true;

    /* renamed from: e  reason: collision with root package name */
    public PrivacyCert f34475e;

    static {
        Covode.recordClassIndex(20616);
    }

    public final void b() {
        d c2 = c();
        if (c2 != null) {
            c2.a();
        }
        this.f34472b.clear();
    }

    public final d c() {
        WeakReference<d> weakReference = this.f34473c;
        if (weakReference != null) {
            return weakReference.get();
        }
        return null;
    }

    public final void a() {
        e poll;
        if ((!this.f34472b.isEmpty()) && (poll = this.f34472b.poll()) != null) {
            if (poll.f34458a.isEmpty()) {
                Object[] array = this.f34471a.toArray(new String[0]);
                Objects.requireNonNull(array, "null cannot be cast to non-null type kotlin.Array<T>");
                String[] strArr = (String[]) array;
                poll.a((String[]) Arrays.copyOf(strArr, strArr.length));
            }
            poll.a();
        }
    }

    public final void a(e eVar) {
        l.c(eVar, "");
        eVar.a(this);
        if (eVar instanceof i) {
            this.f34472b.addFirst(eVar);
        } else {
            this.f34472b.add(eVar);
        }
        if (!(eVar instanceof h)) {
            this.f34474d = false;
        }
    }
}
