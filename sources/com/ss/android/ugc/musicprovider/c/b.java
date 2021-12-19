package com.ss.android.ugc.musicprovider.c;

import android.content.Context;
import com.bytedance.covode.number.Covode;
import com.ss.android.ugc.aweme.music.service.c;
import com.ss.android.ugc.musicprovider.b.a;
import com.ss.android.ugc.musicprovider.interfaces.d;

public class b {

    /* renamed from: f  reason: collision with root package name */
    private static final String f148559f = b.class.getName();

    /* renamed from: a  reason: collision with root package name */
    public d f148560a;

    /* renamed from: b  reason: collision with root package name */
    public Context f148561b;

    /* renamed from: c  reason: collision with root package name */
    public String f148562c;

    /* renamed from: d  reason: collision with root package name */
    public c f148563d;

    /* renamed from: e  reason: collision with root package name */
    private a f148564e;

    public final void a() {
        c cVar = this.f148563d;
        if (cVar != null) {
            cVar.c();
        }
    }

    public final void b() {
        c cVar = this.f148563d;
        if (cVar != null) {
            cVar.a();
        }
    }

    static {
        Covode.recordClassIndex(97925);
    }

    public final void a(com.ss.android.ugc.musicprovider.interfaces.a aVar) {
        c cVar = this.f148563d;
        if (cVar != null) {
            cVar.a(aVar);
        }
    }

    public final void a(com.ss.android.ugc.musicprovider.interfaces.b bVar) {
        c cVar = this.f148563d;
        if (cVar != null) {
            cVar.a(bVar);
        }
    }

    public final void a(com.ss.android.ugc.musicprovider.interfaces.c cVar) {
        c cVar2 = this.f148563d;
        if (cVar2 != null) {
            cVar2.a(cVar);
        }
    }

    public final void a(com.ss.android.ugc.musicprovider.a.a aVar, boolean z) {
        c cVar;
        if (aVar != null && (cVar = this.f148563d) != null) {
            cVar.a(aVar, z);
        }
    }

    public final void a(String str, boolean z) {
        if (this.f148564e == null) {
            this.f148564e = new a(this.f148560a);
        }
        this.f148564e.a(str, z);
    }
}
