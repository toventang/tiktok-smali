package com.google.android.gms.internal.measurement;

import android.net.Uri;
import androidx.c.a;
import com.bytedance.covode.number.Covode;
import com.bytedance.frameworks.apm.trace.MethodCollector;

public final class bs {

    /* renamed from: a  reason: collision with root package name */
    private static final a<String, Uri> f50729a = new a<>();

    static {
        Covode.recordClassIndex(31685);
    }

    public static synchronized Uri a(String str) {
        Uri uri;
        String str2;
        synchronized (bs.class) {
            MethodCollector.i(6732);
            a<String, Uri> aVar = f50729a;
            uri = aVar.get(str);
            if (uri == null) {
                String valueOf = String.valueOf(Uri.encode(str));
                if (valueOf.length() != 0) {
                    str2 = "content://com.google.android.gms.phenotype/".concat(valueOf);
                } else {
                    str2 = new String("content://com.google.android.gms.phenotype/");
                }
                uri = Uri.parse(str2);
                aVar.put(str, uri);
            }
            MethodCollector.o(6732);
        }
        return uri;
    }
}
