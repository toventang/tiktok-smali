package com.bytedance.tux.dialog.b;

import com.bytedance.covode.number.Covode;
import com.bytedance.tux.button.TuxButton;
import com.bytedance.tux.dialog.internal.d;
import h.f.a.b;
import h.f.b.l;
import h.z;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public final class f {

    /* renamed from: a  reason: collision with root package name */
    public final List<TuxButton> f44835a = new ArrayList();

    /* renamed from: b  reason: collision with root package name */
    public b<? super TuxButton, z> f44836b;

    /* renamed from: c  reason: collision with root package name */
    public boolean f44837c = true;

    /* renamed from: d  reason: collision with root package name */
    public CharSequence f44838d;

    /* renamed from: e  reason: collision with root package name */
    public final int f44839e;

    /* renamed from: f  reason: collision with root package name */
    public final b<a, z> f44840f;

    static {
        Covode.recordClassIndex(27373);
    }

    public final void a(b<? super TuxButton, z> bVar) {
        l.c(bVar, "");
        this.f44836b = bVar;
        Iterator<T> it = this.f44835a.iterator();
        while (it.hasNext()) {
            bVar.invoke(it.next());
        }
    }

    public final void a(CharSequence charSequence) {
        l.c(charSequence, "");
        Iterator<T> it = this.f44835a.iterator();
        while (it.hasNext()) {
            it.next().setText(charSequence);
        }
        this.f44838d = charSequence;
    }

    public final void a(boolean z) {
        Iterator<T> it = this.f44835a.iterator();
        while (it.hasNext()) {
            it.next().setEnabled(z);
        }
        this.f44837c = z;
    }

    /* JADX DEBUG: Multi-variable search result rejected for r5v0, resolved type: h.f.a.b<? super com.bytedance.tux.dialog.b.a, h.z> */
    /* JADX WARN: Multi-variable type inference failed */
    public f(d dVar, int i2, CharSequence charSequence, b<? super a, z> bVar) {
        l.c(dVar, "");
        l.c(charSequence, "");
        this.f44839e = i2;
        this.f44840f = bVar;
        this.f44838d = charSequence;
    }
}
