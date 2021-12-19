package com.ss.android.ugc.aweme.shortvideo.cover;

import com.bytedance.covode.number.Covode;
import h.f.a.b;
import h.z;

final /* synthetic */ class c implements b {

    /* renamed from: a  reason: collision with root package name */
    private final b f125246a;

    static {
        Covode.recordClassIndex(82247);
    }

    c(b bVar) {
        this.f125246a = bVar;
    }

    @Override // h.f.a.b
    public final Object invoke(Object obj) {
        b bVar = this.f125246a;
        Boolean bool = (Boolean) obj;
        if (bool != null) {
            if (bool.booleanValue()) {
                bVar.f125233d.setVisibility(4);
            } else {
                bVar.f125233d.setVisibility(0);
            }
        }
        return z.f158842a;
    }
}
