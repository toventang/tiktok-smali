package com.ss.ugc.live.sdk.msg.d;

import com.bytedance.covode.number.Covode;
import com.ss.ugc.live.sdk.msg.b.e;
import h.f.b.l;
import java.util.Map;

public final class d {

    /* renamed from: a  reason: collision with root package name */
    public static final d f154181a = new d();

    private d() {
    }

    static {
        Covode.recordClassIndex(102821);
    }

    public static final byte[] a(e eVar) {
        byte[] bArr;
        l.c(eVar, "");
        if (eVar.f154113e != null) {
            bArr = eVar.f154113e;
        } else if (eVar.f154114f != null) {
            bArr = eVar.f154114f.a();
        } else {
            Map<String, String> map = eVar.f154116h;
            if (map == null || map.isEmpty()) {
                bArr = new byte[0];
            } else {
                bArr = b.a(eVar.f154116h);
            }
        }
        l.a((Object) bArr, "");
        return bArr;
    }
}
