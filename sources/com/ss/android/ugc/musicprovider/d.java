package com.ss.android.ugc.musicprovider;

import android.content.Context;
import com.bytedance.covode.number.Covode;
import com.ss.android.ugc.aweme.component.music.MusicService;
import com.ss.android.ugc.musicprovider.c.b;
import com.ss.android.ugc.musicprovider.interfaces.a;
import com.ss.android.ugc.musicprovider.interfaces.c;

public final class d {

    /* renamed from: a  reason: collision with root package name */
    public b f148617a = new b();

    static {
        Covode.recordClassIndex(97942);
    }

    public final void a() {
        b bVar = this.f148617a;
        if (bVar != null) {
            bVar.a();
        }
    }

    public final void b() {
        b bVar = this.f148617a;
        if (bVar != null) {
            bVar.b();
        }
    }

    public d() {
        e a2 = e.a();
        if (a2.f148623c == null) {
            a2.b();
        }
        Context context = a2.f148623c;
        b bVar = this.f148617a;
        if (bVar != null) {
            bVar.f148561b = context;
            bVar.f148563d = MusicService.m().a(context);
        }
        String d2 = e.a().d();
        String c2 = e.a().c();
        if (!b.b(d2)) {
            b.a(d2);
        }
        if (!b.b(c2)) {
            b.a(c2);
        }
        b bVar2 = this.f148617a;
        if (bVar2 != null) {
            bVar2.f148562c = c2;
        }
    }

    public final void a(a aVar) {
        b bVar = this.f148617a;
        if (bVar != null) {
            bVar.a(aVar);
        }
    }

    public final void a(com.ss.android.ugc.musicprovider.interfaces.b bVar) {
        b bVar2 = this.f148617a;
        if (bVar2 != null) {
            bVar2.a(bVar);
        }
    }

    public final void a(c cVar) {
        b bVar = this.f148617a;
        if (bVar != null) {
            bVar.a(cVar);
        }
    }

    public final void a(com.ss.android.ugc.musicprovider.interfaces.d dVar) {
        b bVar = this.f148617a;
        if (bVar != null) {
            bVar.f148560a = dVar;
        }
    }

    public final void a(com.ss.android.ugc.musicprovider.a.a aVar, boolean z) {
        b bVar;
        if (aVar.f148533c == 4 && (bVar = this.f148617a) != null) {
            bVar.a(aVar, z);
        }
    }

    public final void a(String str, boolean z) {
        b bVar = this.f148617a;
        if (bVar != null) {
            bVar.a(str, z);
        }
    }
}
