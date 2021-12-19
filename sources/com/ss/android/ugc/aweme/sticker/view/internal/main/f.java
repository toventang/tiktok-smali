package com.ss.android.ugc.aweme.sticker.view.internal.main;

import com.bytedance.covode.number.Covode;
import com.ss.android.ugc.aweme.sticker.panel.c;
import com.ss.android.ugc.aweme.sticker.view.internal.a;
import h.f.b.l;
import java.util.ArrayList;
import java.util.List;

public final class f implements a {

    /* renamed from: a  reason: collision with root package name */
    private final List<c> f136289a = new ArrayList();

    /* renamed from: b  reason: collision with root package name */
    private final List<c> f136290b = new ArrayList();

    static {
        Covode.recordClassIndex(89017);
    }

    @Override // com.ss.android.ugc.aweme.sticker.panel.f
    public final void a(c cVar) {
        l.d(cVar, "");
        if (!this.f136289a.contains(cVar)) {
            this.f136289a.add(cVar);
        }
    }

    @Override // com.ss.android.ugc.aweme.sticker.view.internal.a
    public final void a(boolean z) {
        if (z) {
            if (!this.f136289a.isEmpty()) {
                for (c cVar : this.f136289a) {
                    if (cVar.b()) {
                        cVar.d();
                        this.f136290b.add(cVar);
                    }
                }
            }
        } else if (!this.f136290b.isEmpty()) {
            for (c cVar2 : this.f136290b) {
                cVar2.c();
            }
            this.f136290b.clear();
        }
    }
}
