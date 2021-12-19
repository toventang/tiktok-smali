package com.ss.android.ugc.aweme.shortvideo.editcut.b.a;

import com.bytedance.covode.number.Covode;
import com.bytedance.o.f;
import com.bytedance.scene.group.b;
import com.bytedance.scene.j;
import com.ss.android.ugc.aweme.shortvideo.editcut.b.d;
import h.f.b.l;

public abstract class a extends j implements com.bytedance.o.a, d {

    /* renamed from: a  reason: collision with root package name */
    private final f f128111a;

    /* renamed from: b  reason: collision with root package name */
    private final b f128112b;

    /* renamed from: c  reason: collision with root package name */
    private final int f128113c;

    static {
        Covode.recordClassIndex(83982);
    }

    @Override // com.bytedance.o.a
    public f getDiContainer() {
        return this.f128111a;
    }

    public final void d() {
        if (this.f128112b.g(this)) {
            this.f128112b.d(this);
        }
    }

    public final void b() {
        if (!this.f128112b.f(this)) {
            this.f128112b.a(this.f128113c, this, a());
        }
        if (!this.f128112b.g(this)) {
            this.f128112b.e(this);
        }
    }

    public a(f fVar, b bVar, int i2) {
        l.d(fVar, "");
        l.d(bVar, "");
        this.f128111a = fVar;
        this.f128112b = bVar;
        this.f128113c = i2;
    }
}
