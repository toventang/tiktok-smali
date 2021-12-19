package com.linecorp.a.a.a;

import android.content.Context;
import android.content.SharedPreferences;
import android.os.Build;
import android.provider.Settings;
import android.text.TextUtils;
import android.util.Base64;
import com.bytedance.covode.number.Covode;
import com.bytedance.frameworks.apm.trace.MethodCollector;
import com.ss.android.ugc.aweme.bf.d;
import java.io.UnsupportedEncodingException;
import java.security.InvalidAlgorithmParameterException;
import java.security.InvalidKeyException;
import java.security.NoSuchAlgorithmException;
import java.security.SecureRandom;
import java.security.spec.InvalidKeySpecException;
import java.util.Arrays;
import javax.crypto.BadPaddingException;
import javax.crypto.Cipher;
import javax.crypto.IllegalBlockSizeException;
import javax.crypto.Mac;
import javax.crypto.NoSuchPaddingException;
import javax.crypto.SecretKey;
import javax.crypto.SecretKeyFactory;
import javax.crypto.spec.IvParameterSpec;
import javax.crypto.spec.PBEKeySpec;
import javax.crypto.spec.SecretKeySpec;

public final class b {

    /* renamed from: a  reason: collision with root package name */
    private final Object f54916a = new Object();

    /* renamed from: b  reason: collision with root package name */
    private final String f54917b;

    /* renamed from: c  reason: collision with root package name */
    private final int f54918c;

    /* renamed from: d  reason: collision with root package name */
    private final SecureRandom f54919d;

    /* renamed from: e  reason: collision with root package name */
    private final SecretKeyFactory f54920e;

    /* renamed from: f  reason: collision with root package name */
    private final Cipher f54921f;

    /* renamed from: g  reason: collision with root package name */
    private final Mac f54922g;

    /* renamed from: h  reason: collision with root package name */
    private a f54923h;

    static {
        Covode.recordClassIndex(34497);
    }

    public final void a(Context context) {
        MethodCollector.i(14532);
        synchronized (this.f54916a) {
            try {
                if (this.f54923h == null) {
                    this.f54923h = b(context);
                }
            } finally {
                MethodCollector.o(14532);
            }
        }
    }

    public b(String str) {
        this.f54917b = str;
        this.f54918c = 5000;
        try {
            this.f54919d = new SecureRandom();
            this.f54920e = SecretKeyFactory.getInstance("PBKDF2WithHmacSHA1");
            this.f54921f = Cipher.getInstance("AES/CBC/PKCS5Padding");
            this.f54922g = Mac.getInstance("HmacSHA256");
        } catch (NoSuchAlgorithmException | NoSuchPaddingException e2) {
            throw new RuntimeException(e2);
        }
    }

    private a b(Context context) {
        byte[] bArr;
        String str = Build.MODEL + Build.MANUFACTURER + Settings.Secure.getString(context.getContentResolver(), "android_id") + context.getPackageName();
        SharedPreferences a2 = d.a(context, this.f54917b, 0);
        String string = a2.getString("salt", null);
        if (!TextUtils.isEmpty(string)) {
            bArr = Base64.decode(string, 0);
        } else {
            bArr = new byte[16];
            this.f54919d.nextBytes(bArr);
            a2.edit().putString("salt", Base64.encodeToString(bArr, 0)).apply();
        }
        try {
            byte[] encoded = this.f54920e.generateSecret(new PBEKeySpec(str.toCharArray(), bArr, this.f54918c, 512)).getEncoded();
            return new a(new SecretKeySpec(Arrays.copyOfRange(encoded, 0, 32), "AES"), new SecretKeySpec(Arrays.copyOfRange(encoded, 32, encoded.length), "HmacSHA256"));
        } catch (InvalidKeySpecException e2) {
            throw new RuntimeException(e2);
        }
    }

    /* access modifiers changed from: package-private */
    public static class a {

        /* renamed from: a  reason: collision with root package name */
        final SecretKey f54924a;

        /* renamed from: b  reason: collision with root package name */
        final SecretKey f54925b;

        static {
            Covode.recordClassIndex(34498);
        }

        a(SecretKey secretKey, SecretKey secretKey2) {
            this.f54924a = secretKey;
            this.f54925b = secretKey2;
        }
    }

    public final String a(Context context, String str) {
        String encodeToString;
        MethodCollector.i(14545);
        synchronized (this.f54916a) {
            try {
                a(context);
                try {
                    int blockSize = this.f54921f.getBlockSize();
                    byte[] bArr = new byte[blockSize];
                    this.f54919d.nextBytes(bArr);
                    this.f54921f.init(1, this.f54923h.f54924a, new IvParameterSpec(bArr));
                    byte[] doFinal = this.f54921f.doFinal(str.getBytes("UTF-8"));
                    byte[] bArr2 = new byte[(doFinal.length + blockSize + 32)];
                    System.arraycopy(bArr, 0, bArr2, 0, blockSize);
                    int i2 = blockSize + 0;
                    System.arraycopy(doFinal, 0, bArr2, i2, doFinal.length);
                    this.f54922g.init(this.f54923h.f54925b);
                    this.f54922g.update(bArr2, 0, blockSize + doFinal.length);
                    byte[] doFinal2 = this.f54922g.doFinal();
                    System.arraycopy(doFinal2, 0, bArr2, i2 + doFinal.length, doFinal2.length);
                    encodeToString = Base64.encodeToString(bArr2, 0);
                } catch (BadPaddingException e2) {
                    a aVar = new a(e2);
                    MethodCollector.o(14545);
                    throw aVar;
                } catch (UnsupportedEncodingException | InvalidAlgorithmParameterException | InvalidKeyException | IllegalBlockSizeException e3) {
                    RuntimeException runtimeException = new RuntimeException(e3);
                    MethodCollector.o(14545);
                    throw runtimeException;
                }
            } finally {
                MethodCollector.o(14545);
            }
        }
        return encodeToString;
    }
}
