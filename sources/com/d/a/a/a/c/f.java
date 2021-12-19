package com.d.a.a.a.c;

import com.bytedance.covode.number.Covode;
import com.d.a.a.a.a.c;
import com.d.a.a.a.a.d;
import com.d.a.a.a.a.e;
import com.d.a.a.a.b.l;
import com.d.a.a.a.c.b;
import com.d.a.a.a.h.a;
import java.util.Collections;

public final class f implements c, b.a {

    /* renamed from: c  reason: collision with root package name */
    private static f f46387c;

    /* renamed from: a  reason: collision with root package name */
    public float f46388a;

    /* renamed from: b  reason: collision with root package name */
    public d f46389b;

    /* renamed from: d  reason: collision with root package name */
    private final e f46390d;

    /* renamed from: e  reason: collision with root package name */
    private final com.d.a.a.a.a.b f46391e;

    /* renamed from: f  reason: collision with root package name */
    private a f46392f;

    static {
        Covode.recordClassIndex(28319);
    }

    private f(e eVar, com.d.a.a.a.a.b bVar) {
        this.f46390d = eVar;
        this.f46391e = bVar;
    }

    public static f a() {
        if (f46387c == null) {
            f46387c = new f(new e(), new com.d.a.a.a.a.b());
        }
        return f46387c;
    }

    public final void b() {
        b.f46370a.f46375f = this;
        b.f46370a.a();
        if (b.f46370a.b()) {
            a.a();
        }
        this.f46389b.a();
    }

    @Override // com.d.a.a.a.c.b.a
    public final void a(boolean z) {
        if (z) {
            a.a();
        } else {
            a.b();
        }
    }

    @Override // com.d.a.a.a.a.c
    public final void a(float f2) {
        this.f46388a = f2;
        if (this.f46392f == null) {
            this.f46392f = a.f46367a;
        }
        for (l lVar : Collections.unmodifiableCollection(this.f46392f.f46369c)) {
            lVar.f46358c.a(f2);
        }
    }
}
