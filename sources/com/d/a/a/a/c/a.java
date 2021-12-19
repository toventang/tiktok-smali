package com.d.a.a.a.c;

import com.bytedance.covode.number.Covode;
import com.d.a.a.a.b.l;
import java.util.ArrayList;

public final class a {

    /* renamed from: a  reason: collision with root package name */
    public static a f46367a = new a();

    /* renamed from: b  reason: collision with root package name */
    public final ArrayList<l> f46368b = new ArrayList<>();

    /* renamed from: c  reason: collision with root package name */
    public final ArrayList<l> f46369c = new ArrayList<>();

    static {
        Covode.recordClassIndex(28311);
    }

    private a() {
    }

    public final void a(l lVar) {
        boolean a2 = a();
        this.f46369c.add(lVar);
        if (!a2) {
            f.a().b();
        }
    }

    public final boolean a() {
        return this.f46369c.size() > 0;
    }
}
