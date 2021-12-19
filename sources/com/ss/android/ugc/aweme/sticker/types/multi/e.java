package com.ss.android.ugc.aweme.sticker.types.multi;

import androidx.lifecycle.u;
import com.bytedance.covode.number.Covode;
import com.ss.android.ugc.aweme.sticker.presenter.l;

/* access modifiers changed from: package-private */
public final /* synthetic */ class e implements u {

    /* renamed from: a  reason: collision with root package name */
    private final d f136173a;

    static {
        Covode.recordClassIndex(88934);
    }

    e(d dVar) {
        this.f136173a = dVar;
    }

    @Override // androidx.lifecycle.u
    public final void onChanged(Object obj) {
        d dVar = this.f136173a;
        l lVar = (l) obj;
        if (lVar != null) {
            int i2 = lVar.f135420a.f135419b;
            int i3 = lVar.f135421b.f135419b;
            if (i2 >= 0 && dVar.f136169c != null && i2 < dVar.f136169c.size()) {
                if (i3 != i2) {
                    dVar.f136167a.f136145c = i3;
                    dVar.f136167a.notifyItemChanged(i2, dVar.f136169c.get(i2));
                }
                if (dVar.f136169c != null && i3 < dVar.f136169c.size()) {
                    dVar.f136167a.notifyItemChanged(i3, dVar.f136169c.get(i3));
                    return;
                }
            }
            if (i3 < 0) {
                return;
            }
            if (dVar.f136169c != null) {
            }
        }
    }
}
