package com.facebook.common.k;

import android.util.Base64;
import com.bytedance.covode.number.Covode;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;

public final class d {

    /* renamed from: a  reason: collision with root package name */
    static final byte[] f47132a = {48, 49, 50, 51, 52, 53, 54, 55, 56, 57, 97, 98, 99, 100, 101, 102};

    static {
        Covode.recordClassIndex(28678);
    }

    public static String a(byte[] bArr) {
        try {
            MessageDigest instance = MessageDigest.getInstance("SHA-1");
            instance.update(bArr, 0, bArr.length);
            return Base64.encodeToString(instance.digest(), 11);
        } catch (NoSuchAlgorithmException e2) {
            throw new RuntimeException(e2);
        }
    }
}
