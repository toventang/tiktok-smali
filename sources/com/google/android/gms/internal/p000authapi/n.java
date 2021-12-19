package com.google.android.gms.internal.p000authapi;

import android.util.Base64;
import com.bytedance.covode.number.Covode;
import java.util.Random;

/* renamed from: com.google.android.gms.internal.auth-api.n  reason: invalid package */
public final class n {

    /* renamed from: a  reason: collision with root package name */
    private static final Random f50570a = new Random();

    static {
        Covode.recordClassIndex(31527);
    }

    public static String a() {
        byte[] bArr = new byte[16];
        f50570a.nextBytes(bArr);
        return Base64.encodeToString(bArr, 11);
    }
}
