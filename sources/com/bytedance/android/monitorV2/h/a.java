package com.bytedance.android.monitorV2.h;

import com.bytedance.covode.number.Covode;
import java.util.Iterator;
import java.util.Vector;

public abstract class a {

    /* renamed from: a  reason: collision with root package name */
    private Vector<e> f23921a = new Vector<>();

    static {
        Covode.recordClassIndex(14128);
    }

    public final void a(e eVar) {
        this.f23921a.add(eVar);
    }

    public final void a(int i2) {
        Iterator<e> it = this.f23921a.iterator();
        while (it.hasNext()) {
            it.next().a(i2);
        }
    }
}
