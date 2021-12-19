package com.ss.android.ugc.aweme.sticker.view.internal.a;

import com.bytedance.covode.number.Covode;
import com.ss.android.ugc.aweme.sticker.view.a.i;
import com.ss.android.ugc.effectmanager.effect.model.Effect;
import h.f.a.b;
import h.f.b.l;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public final class d implements c {

    /* renamed from: a  reason: collision with root package name */
    private final List<i> f136236a = new ArrayList();

    static {
        Covode.recordClassIndex(88979);
    }

    public final void a(i iVar) {
        l.d(iVar, "");
        this.f136236a.add(iVar);
    }

    @Override // com.ss.android.ugc.aweme.sticker.view.a.i
    public final void a(int i2) {
        Iterator<T> it = this.f136236a.iterator();
        while (it.hasNext()) {
            it.next().a(i2);
        }
    }

    @Override // com.ss.android.ugc.aweme.sticker.view.a.i
    public final void a(String str) {
        Iterator<T> it = this.f136236a.iterator();
        while (it.hasNext()) {
            it.next().a(str);
        }
    }

    @Override // com.ss.android.ugc.aweme.sticker.view.a.i
    public final void a(int i2, String str, b<? super Integer, ? extends Effect> bVar) {
        l.d(bVar, "");
        Iterator<T> it = this.f136236a.iterator();
        while (it.hasNext()) {
            it.next().a(i2, str, bVar);
        }
    }

    @Override // com.ss.android.ugc.aweme.sticker.view.a.i
    public final void a(int i2, int i3, String str, b<? super Integer, ? extends Effect> bVar) {
        l.d(bVar, "");
        Iterator<T> it = this.f136236a.iterator();
        while (it.hasNext()) {
            it.next().a(i2, i3, str, bVar);
        }
    }
}
