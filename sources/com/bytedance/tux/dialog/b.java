package com.bytedance.tux.dialog;

import android.content.Context;
import com.bytedance.covode.number.Covode;
import com.bytedance.tux.dialog.a.e;
import com.bytedance.tux.dialog.b.g;
import com.bytedance.tux.dialog.c.a;
import com.bytedance.tux.dialog.d.c;
import com.bytedance.tux.dialog.e.h;
import h.f.b.l;

public final class b extends com.bytedance.tux.dialog.internal.b<b, a> {

    /* renamed from: a  reason: collision with root package name */
    public boolean f44808a;

    /* renamed from: b  reason: collision with root package name */
    public boolean f44809b;

    /* renamed from: c  reason: collision with root package name */
    public h f44810c;

    /* renamed from: d  reason: collision with root package name */
    public c f44811d;

    /* renamed from: e  reason: collision with root package name */
    public e f44812e;

    /* renamed from: f  reason: collision with root package name */
    public g f44813f;

    /* renamed from: g  reason: collision with root package name */
    public a f44814g;

    static {
        Covode.recordClassIndex(27363);
    }

    public final a a() {
        return new a(this);
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public b(Context context) {
        super(context);
        l.c(context, "");
    }

    public final b a(e eVar) {
        l.c(eVar, "");
        this.f44812e = eVar;
        return this;
    }

    /* renamed from: c */
    public final b d(CharSequence charSequence) {
        c cVar = this.f44811d;
        if (cVar == null) {
            cVar = new com.bytedance.tux.dialog.d.b(this.o);
            this.f44811d = cVar;
        }
        cVar.b(charSequence);
        return this;
    }

    public final b a(g gVar) {
        l.c(gVar, "");
        this.f44813f = gVar;
        return this;
    }

    public final b a(c cVar) {
        l.c(cVar, "");
        this.f44811d = cVar;
        return this;
    }

    public final b a(h hVar) {
        l.c(hVar, "");
        this.f44810c = hVar;
        return this;
    }

    /* renamed from: a */
    public final b b(CharSequence charSequence) {
        c cVar = this.f44811d;
        if (cVar == null) {
            cVar = new com.bytedance.tux.dialog.d.b(this.o);
            this.f44811d = cVar;
        }
        cVar.a(charSequence);
        return this;
    }

    public static /* synthetic */ b a(b bVar, boolean z) {
        bVar.f44808a = z;
        bVar.f44809b = false;
        return bVar;
    }
}
