package com.ss.android.ugc.gamora.recorder.sticker;

import com.bytedance.covode.number.Covode;
import com.ss.android.ugc.aweme.account.model.a;
import com.ss.android.ugc.aweme.base.model.UrlModel;
import com.ss.android.ugc.aweme.port.in.g;
import com.ss.android.ugc.aweme.sticker.panel.c.c;
import h.f.b.l;

public final class b implements c {

    /* renamed from: a  reason: collision with root package name */
    private final a f148313a;

    static {
        Covode.recordClassIndex(97737);
    }

    @Override // com.ss.android.ugc.aweme.sticker.panel.c.c
    public final int f() {
        return this.f148313a.n();
    }

    @Override // com.ss.android.ugc.aweme.sticker.panel.c.c
    public final int g() {
        return this.f148313a.o();
    }

    @Override // com.ss.android.ugc.aweme.sticker.panel.c.c
    public final int h() {
        return this.f148313a.m();
    }

    @Override // com.ss.android.ugc.aweme.sticker.panel.c.c
    public final boolean i() {
        return this.f148313a.p();
    }

    @Override // com.ss.android.ugc.aweme.sticker.panel.c.c
    public final boolean j() {
        return this.f148313a.q();
    }

    @Override // com.ss.android.ugc.aweme.sticker.panel.c.c
    public final String a() {
        String a2 = this.f148313a.a();
        l.b(a2, "");
        return a2;
    }

    @Override // com.ss.android.ugc.aweme.sticker.panel.c.c
    public final String b() {
        String b2 = this.f148313a.b();
        l.b(b2, "");
        return b2;
    }

    @Override // com.ss.android.ugc.aweme.sticker.panel.c.c
    public final String c() {
        String c2 = this.f148313a.c();
        l.b(c2, "");
        return c2;
    }

    @Override // com.ss.android.ugc.aweme.sticker.panel.c.c
    public final UrlModel d() {
        UrlModel f2 = this.f148313a.f();
        l.b(f2, "");
        return f2;
    }

    @Override // com.ss.android.ugc.aweme.sticker.panel.c.c
    public final String e() {
        String h2 = this.f148313a.h();
        l.b(h2, "");
        return h2;
    }

    @Override // com.ss.android.ugc.aweme.sticker.panel.c.c
    public final String k() {
        return g.a().A().c();
    }

    public b(a aVar) {
        l.d(aVar, "");
        this.f148313a = aVar;
    }
}
