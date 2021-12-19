package com.ss.ugc.effectplatform.g;

import com.bytedance.covode.number.Covode;
import com.ss.ugc.effectplatform.a.c.a;
import com.ss.ugc.effectplatform.util.b;
import h.f.b.l;
import java.util.Arrays;

public final class c {
    static {
        Covode.recordClassIndex(102407);
    }

    public static final String a(a aVar) {
        l.c(aVar, "");
        if (!aVar.available()) {
            return "";
        }
        d.a.d.a.a aVar2 = new d.a.d.a.a();
        byte[] bArr = new byte[1024];
        int read = aVar.read(bArr, 0, 1024);
        while (read >= 0) {
            aVar2.a(bArr, 0, read);
            read = aVar.read(bArr, 0, 1024);
        }
        aVar.close();
        byte[] copyOf = Arrays.copyOf(aVar2.f156615a, aVar2.f156616b);
        l.a((Object) copyOf, "");
        return b.a(copyOf, d.a.d.a.b.Utf8);
    }
}
