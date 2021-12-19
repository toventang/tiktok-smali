package com.bytedance.android.live.publicscreen.impl.e;

import com.bytedance.android.live.publicscreen.a.d.h;
import com.bytedance.android.live.publicscreen.impl.e.h;
import com.bytedance.android.livesdk.ac.b.a;
import com.bytedance.covode.number.Covode;
import h.f.a.b;
import h.z;

/* access modifiers changed from: package-private */
public final /* synthetic */ class k implements b {

    /* renamed from: a  reason: collision with root package name */
    private final h f12353a;

    static {
        Covode.recordClassIndex(6790);
    }

    k(h hVar) {
        this.f12353a = hVar;
    }

    @Override // h.f.a.b
    public final Object invoke(Object obj) {
        h hVar = this.f12353a;
        a aVar = (a) obj;
        int size = hVar.f12345j.size() - 1;
        while (true) {
            if (size < 0) {
                break;
            }
            h hVar2 = hVar.f12345j.get(size);
            if (!(hVar2 instanceof com.bytedance.android.live.publicscreen.a.d.k) || ((com.bytedance.android.live.publicscreen.a.d.k) hVar2).f12190d.getMessageId() != aVar.getMessageId()) {
                size--;
            } else {
                com.bytedance.android.live.publicscreen.impl.a.a.a((com.bytedance.android.live.publicscreen.impl.model.chat.b) hVar.f12345j.remove(size));
                if (hVar.y != null) {
                    ((h.a) hVar.y).c(size);
                }
            }
        }
        return z.f158842a;
    }
}
