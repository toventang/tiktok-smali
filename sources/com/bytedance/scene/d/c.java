package com.bytedance.scene.d;

import com.bytedance.covode.number.Covode;
import java.util.ArrayList;
import java.util.List;

public final class c extends b {

    /* renamed from: a  reason: collision with root package name */
    private List<b> f42769a = new ArrayList();

    static {
        Covode.recordClassIndex(26260);
    }

    public final b c() {
        b bVar = new b();
        a(bVar);
        return bVar;
    }

    @Override // com.bytedance.scene.d.b
    public final void a() {
        for (b bVar : this.f42769a) {
            bVar.a();
        }
        super.a();
    }

    private void a(b bVar) {
        j.a();
        this.f42769a.add(bVar);
    }
}
