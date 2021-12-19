package com.google.firebase.installations.a;

import android.content.SharedPreferences;
import android.util.Base64;
import com.bytedance.covode.number.Covode;
import com.bytedance.frameworks.apm.trace.MethodCollector;
import java.security.KeyFactory;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;
import java.security.PublicKey;
import java.security.spec.InvalidKeySpecException;
import java.security.spec.X509EncodedKeySpec;
import org.json.JSONException;
import org.json.JSONObject;

public final class b {

    /* renamed from: a  reason: collision with root package name */
    private static final String[] f54530a = {"*", "FCM", "GCM", ""};

    /* renamed from: b  reason: collision with root package name */
    private final SharedPreferences f54531b;

    /* renamed from: c  reason: collision with root package name */
    private final String f54532c;

    static {
        Covode.recordClassIndex(33835);
    }

    private String c() {
        String string;
        MethodCollector.i(11415);
        synchronized (this.f54531b) {
            try {
                string = this.f54531b.getString("|S|id", null);
            } finally {
                MethodCollector.o(11415);
            }
        }
        return string;
    }

    private String d() {
        MethodCollector.i(11416);
        synchronized (this.f54531b) {
            try {
                String string = this.f54531b.getString("|S||P|", null);
                if (string == null) {
                    return null;
                }
                PublicKey b2 = b(string);
                if (b2 == null) {
                    MethodCollector.o(11416);
                    return null;
                }
                String a2 = a(b2);
                MethodCollector.o(11416);
                return a2;
            } finally {
                MethodCollector.o(11416);
            }
        }
    }

    public final String b() {
        MethodCollector.i(11414);
        synchronized (this.f54531b) {
            try {
                String c2 = c();
                if (c2 != null) {
                    return c2;
                }
                String d2 = d();
                MethodCollector.o(11414);
                return d2;
            } finally {
                MethodCollector.o(11414);
            }
        }
    }

    public final String a() {
        MethodCollector.i(11257);
        synchronized (this.f54531b) {
            try {
                String[] strArr = f54530a;
                int length = strArr.length;
                for (int i2 = 0; i2 < length; i2++) {
                    String string = this.f54531b.getString("|T|" + this.f54532c + "|" + strArr[i2], null);
                    if (string != null && !string.isEmpty()) {
                        if (string.startsWith("{")) {
                            string = a(string);
                        }
                        return string;
                    }
                }
                MethodCollector.o(11257);
                return null;
            } finally {
                MethodCollector.o(11257);
            }
        }
    }

    private static String a(String str) {
        try {
            return new JSONObject(str).getString("token");
        } catch (JSONException unused) {
            return null;
        }
    }

    private static PublicKey b(String str) {
        try {
            return KeyFactory.getInstance("RSA").generatePublic(new X509EncodedKeySpec(Base64.decode(str, 8)));
        } catch (IllegalArgumentException | NoSuchAlgorithmException | InvalidKeySpecException unused) {
            return null;
        }
    }

    private static String a(PublicKey publicKey) {
        try {
            byte[] digest = MessageDigest.getInstance("SHA1").digest(publicKey.getEncoded());
            digest[0] = (byte) (((digest[0] & 15) + 112) & 255);
            return Base64.encodeToString(digest, 0, 8, 11);
        } catch (NoSuchAlgorithmException unused) {
            return null;
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:12:0x0045, code lost:
        if (r1.isEmpty() != false) goto L_0x003c;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public b(com.google.firebase.b r5) {
        /*
            r4 = this;
            r4.<init>()
            android.content.Context r2 = r5.a()
            java.lang.String r1 = "com.google.android.gms.appid"
            r0 = 0
            android.content.SharedPreferences r0 = com.ss.android.ugc.aweme.bf.d.a(r2, r1, r0)
            r4.f54531b = r0
            com.google.firebase.e r0 = r5.c()
            java.lang.String r1 = r0.f54360e
            r3 = 0
            if (r1 == 0) goto L_0x001c
        L_0x0019:
            r4.f54532c = r1
            return
        L_0x001c:
            com.google.firebase.e r0 = r5.c()
            java.lang.String r1 = r0.f54357b
            java.lang.String r0 = "1:"
            boolean r0 = r1.startsWith(r0)
            if (r0 != 0) goto L_0x0032
            java.lang.String r0 = "2:"
            boolean r0 = r1.startsWith(r0)
            if (r0 == 0) goto L_0x0019
        L_0x0032:
            java.lang.String r0 = ":"
            java.lang.String[] r2 = r1.split(r0)
            int r1 = r2.length
            r0 = 4
            if (r1 == r0) goto L_0x003e
        L_0x003c:
            r1 = r3
            goto L_0x0019
        L_0x003e:
            r0 = 1
            r1 = r2[r0]
            boolean r0 = r1.isEmpty()
            if (r0 == 0) goto L_0x0019
            goto L_0x003c
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.firebase.installations.a.b.<init>(com.google.firebase.b):void");
    }
}
