package com.ss.android.ugc.aweme.sticker.d.a;

import com.bytedance.covode.number.Covode;
import com.ss.android.ugc.aweme.sticker.d.b.c;
import h.f.a.b;
import h.f.b.l;
import h.z;

public abstract class a implements d {

    /* renamed from: a  reason: collision with root package name */
    public String f134739a;

    /* renamed from: b  reason: collision with root package name */
    public Boolean f134740b;

    /* renamed from: c  reason: collision with root package name */
    private Object f134741c;

    /* renamed from: d  reason: collision with root package name */
    private final b<com.ss.android.ugc.aweme.sticker.d.b.b<?>, z> f134742d;

    static {
        Covode.recordClassIndex(88072);
    }

    public abstract boolean a();

    @Override // com.ss.android.ugc.aweme.sticker.d.a.d
    public final <T> boolean a(com.ss.android.ugc.aweme.sticker.d.b.b<T> bVar) {
        l.d(bVar, "");
        if (!(!l.a(this.f134741c, bVar)) || !(bVar instanceof c)) {
            this.f134740b = false;
            return false;
        }
        this.f134741c = bVar;
        if (a()) {
            this.f134740b = true;
            return true;
        }
        this.f134740b = false;
        this.f134739a = ((c) bVar).f134767a.getEffectId();
        b<com.ss.android.ugc.aweme.sticker.d.b.b<?>, z> bVar2 = this.f134742d;
        if (bVar2 == null) {
            return false;
        }
        bVar2.invoke(bVar);
        return true;
    }
}
