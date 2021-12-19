package com.google.android.datatransport.runtime;

import android.util.Base64;
import com.bytedance.covode.number.Covode;
import com.google.android.datatransport.d;
import com.google.android.datatransport.runtime.c;

public abstract class k {

    public static abstract class a {
        static {
            Covode.recordClassIndex(30949);
        }

        public abstract a a(d dVar);

        public abstract a a(String str);

        public abstract a a(byte[] bArr);

        public abstract k a();
    }

    static {
        Covode.recordClassIndex(30948);
    }

    public abstract String a();

    public abstract byte[] b();

    public abstract d c();

    public static a d() {
        return new c.a().a(d.DEFAULT);
    }

    public final String toString() {
        String encodeToString;
        Object[] objArr = new Object[3];
        objArr[0] = a();
        objArr[1] = c();
        if (b() == null) {
            encodeToString = "";
        } else {
            encodeToString = Base64.encodeToString(b(), 2);
        }
        objArr[2] = encodeToString;
        return com.a.a("TransportContext(%s, %s, %s)", objArr);
    }
}
