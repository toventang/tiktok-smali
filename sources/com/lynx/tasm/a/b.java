package com.lynx.tasm.a;

import com.bytedance.covode.number.Covode;
import com.lynx.react.bridge.ReadableArray;

public class b implements Cloneable {

    /* renamed from: a  reason: collision with root package name */
    public String f55633a;

    /* renamed from: b  reason: collision with root package name */
    public long f55634b;

    /* renamed from: c  reason: collision with root package name */
    public long f55635c;

    /* renamed from: d  reason: collision with root package name */
    public int f55636d;

    /* renamed from: e  reason: collision with root package name */
    public int f55637e;

    /* renamed from: f  reason: collision with root package name */
    public float f55638f;

    /* renamed from: g  reason: collision with root package name */
    public float f55639g;

    /* renamed from: h  reason: collision with root package name */
    public float f55640h;

    /* renamed from: i  reason: collision with root package name */
    public float f55641i;

    /* renamed from: j  reason: collision with root package name */
    public int f55642j;

    /* renamed from: k  reason: collision with root package name */
    public int f55643k;

    /* renamed from: l  reason: collision with root package name */
    public int f55644l = -1;

    /* renamed from: m  reason: collision with root package name */
    public int f55645m;
    public int n = -1;
    public int o;

    static {
        Covode.recordClassIndex(34823);
    }

    public b() {
    }

    public final boolean a(b bVar) {
        if (!b(bVar) || this.n != bVar.n) {
            return false;
        }
        return true;
    }

    public b(b bVar) {
        this.f55633a = bVar.f55633a;
        this.f55634b = bVar.f55634b;
        this.f55635c = bVar.f55635c;
        this.f55636d = bVar.f55636d;
        this.f55637e = bVar.f55637e;
        this.f55638f = bVar.f55638f;
        this.f55639g = bVar.f55639g;
        this.f55640h = bVar.f55640h;
        this.f55641i = bVar.f55641i;
        this.f55642j = bVar.f55642j;
        this.f55643k = bVar.f55643k;
        this.f55644l = bVar.f55644l;
        this.f55645m = bVar.f55645m;
        this.n = bVar.n;
        this.o = bVar.o;
    }

    public static b a(ReadableArray readableArray) {
        if (readableArray == null) {
            return null;
        }
        readableArray.size();
        b bVar = new b();
        bVar.f55633a = readableArray.getString(0);
        bVar.f55634b = readableArray.getLong(1);
        int a2 = bVar.a(readableArray, 2);
        int i2 = a2 + 1;
        bVar.f55635c = readableArray.getLong(a2);
        int i3 = i2 + 1;
        bVar.f55643k = readableArray.getInt(i2) - 1;
        int i4 = i3 + 1;
        bVar.f55645m = readableArray.getInt(i3);
        bVar.f55644l = readableArray.getInt(i4);
        bVar.n = readableArray.getInt(i4 + 1);
        return bVar;
    }

    public final boolean b(b bVar) {
        if (bVar != null && this.f55633a.equals(bVar.f55633a) && this.f55634b == bVar.f55634b && this.f55635c == bVar.f55635c && this.f55636d == bVar.f55636d && this.f55637e == bVar.f55637e && this.f55638f == bVar.f55638f && this.f55639g == bVar.f55639g && this.f55640h == bVar.f55640h && this.f55641i == bVar.f55641i && this.f55642j == bVar.f55642j && this.f55643k == bVar.f55643k && this.f55644l == bVar.f55644l && this.f55645m == bVar.f55645m && this.o == bVar.o) {
            return true;
        }
        return false;
    }

    public final int a(ReadableArray readableArray, int i2) {
        if (readableArray == null || readableArray.size() < 6) {
            this.f55637e = 0;
            this.f55642j = 0;
            this.f55638f = 0.0f;
            this.f55639g = 0.0f;
            this.f55640h = 0.0f;
            this.f55641i = 0.0f;
            return i2;
        }
        this.f55637e = readableArray.getInt(i2);
        this.f55642j = readableArray.getInt(i2 + 1);
        this.f55638f = (float) readableArray.getDouble(i2 + 2);
        this.f55639g = (float) readableArray.getDouble(i2 + 3);
        this.f55640h = (float) readableArray.getDouble(i2 + 4);
        this.f55641i = (float) readableArray.getDouble(i2 + 5);
        return i2 + 6;
    }

    public final void a(int i2, float f2, float f3, float f4, float f5, int i3) {
        this.f55637e = i2;
        this.f55642j = i3;
        this.f55638f = f2;
        this.f55639g = f3;
        this.f55640h = f4;
        this.f55641i = f5;
    }
}
