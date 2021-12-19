package com.ss.android.ugc.aweme.feed.t;

import android.util.SparseArray;
import com.bytedance.covode.number.Covode;

public final class d {

    /* renamed from: a  reason: collision with root package name */
    public static final d f93914a = new d();

    /* renamed from: b  reason: collision with root package name */
    private SparseArray<c> f93915b = new SparseArray<>();

    static {
        Covode.recordClassIndex(59742);
    }

    private d() {
        a(4, new e());
        a(5, new i());
    }

    public final c a(int i2) {
        c cVar = this.f93915b.get(i2);
        if (cVar == null) {
            return null;
        }
        return cVar;
    }

    private void a(int i2, c cVar) {
        this.f93915b.put(i2, cVar);
    }
}
