package com.google.android.gms.internal.measurement;

import com.bytedance.covode.number.Covode;
import java.nio.ByteBuffer;
import java.nio.charset.Charset;
import java.util.Objects;

public final class gp {

    /* renamed from: a  reason: collision with root package name */
    static final Charset f50957a = Charset.forName("UTF-8");

    /* renamed from: b  reason: collision with root package name */
    public static final byte[] f50958b;

    /* renamed from: c  reason: collision with root package name */
    private static final Charset f50959c = Charset.forName("ISO-8859-1");

    /* renamed from: d  reason: collision with root package name */
    private static final ByteBuffer f50960d;

    /* renamed from: e  reason: collision with root package name */
    private static final fq f50961e;

    public static int a(boolean z) {
        return z ? 1231 : 1237;
    }

    static {
        Covode.recordClassIndex(31828);
        byte[] bArr = new byte[0];
        f50958b = bArr;
        f50960d = ByteBuffer.wrap(bArr);
        f50961e = fq.a(bArr, bArr.length);
    }

    static <T> T a(T t) {
        Objects.requireNonNull(t);
        return t;
    }

    public static String a(byte[] bArr) {
        return new String(bArr, f50957a);
    }

    static Object a(Object obj, Object obj2) {
        return ((ht) obj).n().a((ht) obj2).v();
    }

    static <T> T a(T t, String str) {
        Objects.requireNonNull(t, str);
        return t;
    }

    static int a(int i2, byte[] bArr, int i3, int i4) {
        for (int i5 = i3; i5 < i3 + i4; i5++) {
            i2 = (i2 * 31) + bArr[i5];
        }
        return i2;
    }
}
