package com.facebook.imagepipeline.n;

import android.net.Uri;
import android.util.Base64;
import com.bytedance.covode.number.Covode;
import com.bytedance.frameworks.apm.trace.MethodCollector;
import com.facebook.common.b.a;
import com.facebook.common.g.i;
import com.facebook.imagepipeline.j.e;
import com.facebook.imagepipeline.o.b;
import java.io.ByteArrayInputStream;

public final class l extends aa {
    static {
        Covode.recordClassIndex(29161);
    }

    /* access modifiers changed from: protected */
    @Override // com.facebook.imagepipeline.n.aa
    public final String a() {
        return "DataFetchProducer";
    }

    public l(i iVar) {
        super(a.f47054a, iVar);
    }

    /* access modifiers changed from: protected */
    @Override // com.facebook.imagepipeline.n.aa
    public final e a(b bVar) {
        byte[] decode;
        MethodCollector.i(14165);
        String uri = bVar.mSourceUri.toString();
        com.facebook.common.d.i.a(uri.substring(0, 5).equals("data:"));
        int indexOf = uri.indexOf(44);
        String substring = uri.substring(indexOf + 1, uri.length());
        String substring2 = uri.substring(0, indexOf);
        if (substring2.contains(";")) {
            String[] split = substring2.split(";");
            if (split[split.length - 1].equals("base64")) {
                decode = Base64.decode(substring, 0);
                e a2 = a(new ByteArrayInputStream(decode), decode.length);
                MethodCollector.o(14165);
                return a2;
            }
        }
        decode = Uri.decode(substring).getBytes();
        e a22 = a(new ByteArrayInputStream(decode), decode.length);
        MethodCollector.o(14165);
        return a22;
    }
}
