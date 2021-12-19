package com.ss.android.ugc.aweme.sticker.types.multi;

import androidx.lifecycle.u;
import com.bytedance.covode.number.Covode;
import com.ss.android.ugc.aweme.sticker.view.internal.viewmodels.b;

/* access modifiers changed from: package-private */
public final /* synthetic */ class f implements u {

    /* renamed from: a  reason: collision with root package name */
    private final d f136174a;

    /* renamed from: b  reason: collision with root package name */
    private final b f136175b;

    static {
        Covode.recordClassIndex(88935);
    }

    f(d dVar, b bVar) {
        this.f136174a = dVar;
        this.f136175b = bVar;
    }

    @Override // androidx.lifecycle.u
    public final void onChanged(Object obj) {
        d dVar = this.f136174a;
        b bVar = this.f136175b;
        Object first = ((h.u) obj).getFirst();
        int b2 = bVar.b(first);
        if (b2 >= 0) {
            dVar.f136167a.notifyItemChanged(b2, first);
        }
    }
}
