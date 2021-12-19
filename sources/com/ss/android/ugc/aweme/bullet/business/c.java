package com.ss.android.ugc.aweme.bullet.business;

import android.util.Base64;
import com.bytedance.covode.number.Covode;
import com.google.gson.o;
import h.f.b.l;
import h.m.d;
import java.nio.charset.Charset;
import java.util.concurrent.atomic.AtomicInteger;
import javax.crypto.Cipher;
import javax.crypto.spec.IvParameterSpec;
import javax.crypto.spec.SecretKeySpec;

public final class c {

    /* renamed from: a  reason: collision with root package name */
    public static volatile AtomicInteger f69269a = new AtomicInteger(0);

    /* renamed from: b  reason: collision with root package name */
    public static final c f69270b = new c();

    private c() {
    }

    static {
        Covode.recordClassIndex(42702);
    }

    public static String a(o oVar, String str) {
        boolean z;
        l.d(oVar, "");
        if (str == null || str.length() == 0) {
            z = true;
        } else {
            z = false;
        }
        if (z) {
            return null;
        }
        try {
            byte[] a2 = a(oVar.toString(), "UTF-8");
            if (a2 == null) {
                return null;
            }
            Charset charset = d.f158808a;
            if (str != null) {
                byte[] bytes = str.getBytes(charset);
                l.b(bytes, "");
                l.d(bytes, "");
                l.d(a2, "");
                SecretKeySpec secretKeySpec = new SecretKeySpec(bytes, "AES");
                Cipher instance = Cipher.getInstance("AES/GCM/NoPadding");
                IvParameterSpec ivParameterSpec = new IvParameterSpec(secretKeySpec.getEncoded(), 0, 16);
                instance.init(1, secretKeySpec, ivParameterSpec);
                byte[] doFinal = instance.doFinal(a2);
                byte[] bArr = new byte[(doFinal.length + 16)];
                System.arraycopy(ivParameterSpec.getIV(), 0, bArr, 0, 16);
                System.arraycopy(doFinal, 0, bArr, 16, doFinal.length);
                return Base64.encodeToString(bArr, 0);
            }
            throw new NullPointerException("null cannot be cast to non-null type java.lang.String");
        } catch (Exception e2) {
            e2.printStackTrace();
            return null;
        }
    }

    /* JADX WARNING: Removed duplicated region for block: B:33:0x005c  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private static byte[] a(java.lang.String r6, java.lang.String r7) {
        /*
        // Method dump skipped, instructions count: 103
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ss.android.ugc.aweme.bullet.business.c.a(java.lang.String, java.lang.String):byte[]");
    }
}
