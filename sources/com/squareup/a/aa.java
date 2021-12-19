package com.squareup.a;

import com.bytedance.covode.number.Covode;

public enum aa {
    TLS_1_2("TLSv1.2"),
    TLS_1_1("TLSv1.1"),
    TLS_1_0("TLSv1"),
    SSL_3_0("SSLv3");
    
    final String javaName;

    public final String javaName() {
        return this.javaName;
    }

    static {
        Covode.recordClassIndex(35985);
    }

    public static aa forJavaName(String str) {
        str.hashCode();
        switch (str.hashCode()) {
            case -503070503:
                if (str.equals("TLSv1.1")) {
                    return TLS_1_1;
                }
                break;
            case -503070502:
                if (str.equals("TLSv1.2")) {
                    return TLS_1_2;
                }
                break;
            case 79201641:
                if (str.equals("SSLv3")) {
                    return SSL_3_0;
                }
                break;
            case 79923350:
                if (str.equals("TLSv1")) {
                    return TLS_1_0;
                }
                break;
        }
        throw new IllegalArgumentException("Unexpected TLS version: ".concat(String.valueOf(str)));
    }

    private aa(String str) {
        this.javaName = str;
    }
}
