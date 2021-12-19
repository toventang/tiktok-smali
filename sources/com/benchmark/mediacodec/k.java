package com.benchmark.mediacodec;

import com.bytedance.covode.number.Covode;
import java.nio.ByteBuffer;
import java.nio.ByteOrder;
import java.nio.FloatBuffer;

public class k {

    /* renamed from: a  reason: collision with root package name */
    public static final float[] f6293a;

    /* renamed from: b  reason: collision with root package name */
    public static final int f6294b;
    private static final String p = k.class.getSimpleName();
    private static final float[] q = {0.0f, 1.0f, 0.0f, 1.0f, 1.0f, 0.0f, 0.0f, 0.0f, 0.0f, 1.0f, 0.0f, 0.0f};

    /* renamed from: c  reason: collision with root package name */
    public int f6295c;

    /* renamed from: d  reason: collision with root package name */
    public int f6296d;

    /* renamed from: e  reason: collision with root package name */
    public int f6297e;

    /* renamed from: f  reason: collision with root package name */
    public int[] f6298f;

    /* renamed from: g  reason: collision with root package name */
    public int f6299g;

    /* renamed from: h  reason: collision with root package name */
    public int f6300h;

    /* renamed from: i  reason: collision with root package name */
    public int f6301i;

    /* renamed from: j  reason: collision with root package name */
    public int[] f6302j;

    /* renamed from: k  reason: collision with root package name */
    public int f6303k;

    /* renamed from: l  reason: collision with root package name */
    public int f6304l;

    /* renamed from: m  reason: collision with root package name */
    public ByteBuffer f6305m;
    public ByteBuffer n;
    public ByteBuffer o;
    private FloatBuffer r;
    private FloatBuffer s;

    static {
        Covode.recordClassIndex(3023);
        float[] fArr = {-1.0f, -1.0f, 0.0f, 1.0f, -1.0f, 0.0f, -1.0f, 1.0f, 0.0f, 1.0f, 1.0f, 0.0f};
        f6293a = fArr;
        f6294b = fArr.length / 3;
    }

    public k() {
        float[] fArr = f6293a;
        FloatBuffer put = ByteBuffer.allocateDirect(fArr.length * 4).order(ByteOrder.nativeOrder()).asFloatBuffer().put(fArr);
        this.r = put;
        put.position(0);
        float[] fArr2 = q;
        FloatBuffer put2 = ByteBuffer.allocateDirect(fArr2.length * 4).order(ByteOrder.nativeOrder()).asFloatBuffer().put(fArr2);
        this.s = put2;
        put2.position(0);
    }

    /* JADX WARNING: Removed duplicated region for block: B:13:0x003f  */
    /* JADX WARNING: Removed duplicated region for block: B:5:0x0012 A[RETURN] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final int a() {
        /*
        // Method dump skipped, instructions count: 226
        */
        throw new UnsupportedOperationException("Method not decompiled: com.benchmark.mediacodec.k.a():int");
    }
}
