package com.lynx.tasm.behavior.ui.utils;

import com.bytedance.covode.number.Covode;
import com.lynx.react.bridge.ReadableArray;

public class g {

    /* renamed from: c  reason: collision with root package name */
    public static final g f56421c = new g();

    /* renamed from: a  reason: collision with root package name */
    public final float f56422a;

    /* renamed from: b  reason: collision with root package name */
    public final float f56423b;

    /* renamed from: d  reason: collision with root package name */
    private final int f56424d;

    /* renamed from: e  reason: collision with root package name */
    private final int f56425e;

    public final boolean c() {
        if (this.f56424d == 1) {
            return true;
        }
        return false;
    }

    public final boolean d() {
        if (this.f56425e == 1) {
            return true;
        }
        return false;
    }

    static {
        Covode.recordClassIndex(35196);
    }

    private g() {
        this.f56422a = 0.5f;
        this.f56424d = 1;
        this.f56423b = 0.5f;
        this.f56425e = 1;
    }

    public final boolean a() {
        if (this.f56422a == 0.5f && this.f56424d == 1) {
            return false;
        }
        return true;
    }

    public final boolean b() {
        if (this.f56423b == 0.5f && this.f56425e == 1) {
            return false;
        }
        return true;
    }

    public final boolean e() {
        if (c() || d()) {
            return true;
        }
        return false;
    }

    public g(ReadableArray readableArray) {
        this.f56422a = (float) readableArray.getDouble(0);
        this.f56424d = readableArray.getInt(1);
        if (readableArray.size() >= 4) {
            this.f56423b = (float) readableArray.getDouble(2);
            this.f56425e = readableArray.getInt(3);
            return;
        }
        this.f56423b = 0.5f;
        this.f56425e = 1;
    }

    public g(float f2, float f3) {
        this.f56422a = f2;
        this.f56423b = f3;
    }
}
