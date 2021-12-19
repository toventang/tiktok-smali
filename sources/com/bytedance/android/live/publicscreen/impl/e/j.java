package com.bytedance.android.live.publicscreen.impl.e;

import androidx.core.g.e;
import com.bytedance.android.live.publicscreen.a.d.h;
import com.bytedance.android.live.publicscreen.a.d.k;
import com.bytedance.android.live.publicscreen.impl.a.a;
import com.bytedance.android.live.publicscreen.impl.e.h;
import com.bytedance.covode.number.Covode;
import h.f.a.b;
import h.z;

/* access modifiers changed from: package-private */
public final /* synthetic */ class j implements b {

    /* renamed from: a  reason: collision with root package name */
    private final h f12352a;

    static {
        Covode.recordClassIndex(6789);
    }

    j(h hVar) {
        this.f12352a = hVar;
    }

    @Override // h.f.a.b
    public final Object invoke(Object obj) {
        h hVar = this.f12352a;
        e eVar = (e) obj;
        if (eVar.f2397a == null || eVar.f2398b == null || hVar.y == null || hVar.f12348m == null) {
            return z.f158842a;
        }
        int size = hVar.f12345j.size() - 1;
        while (true) {
            if (size < 0) {
                break;
            }
            h hVar2 = hVar.f12345j.get(size);
            if (!(hVar2 instanceof k) || ((k) hVar2).f12190d.getMessageId() != eVar.f2397a.getMessageId()) {
                size--;
            } else {
                a.a((com.bytedance.android.live.publicscreen.impl.model.chat.b) hVar.f12345j.get(size));
                hVar.a(size, new com.bytedance.android.live.publicscreen.impl.model.chat.b(eVar.f2398b));
                if (hVar.y != null) {
                    ((h.a) hVar.y).a(size);
                }
            }
        }
        return z.f158842a;
    }
}
