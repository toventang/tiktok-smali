package com.lynx.tasm.behavior;

import com.bytedance.covode.number.Covode;
import com.lynx.react.bridge.ReadableArray;
import com.lynx.react.bridge.ReadableMap;
import com.lynx.react.bridge.a;

public class v {

    /* renamed from: a  reason: collision with root package name */
    public final ReadableMap f56468a;

    static {
        Covode.recordClassIndex(35238);
    }

    public String toString() {
        return "{ " + getClass().getSimpleName() + ": " + this.f56468a.toString() + " }";
    }

    public v(ReadableMap readableMap) {
        this.f56468a = readableMap;
    }

    public final boolean a(String str) {
        return this.f56468a.hasKey(str);
    }

    public final boolean b(String str) {
        return this.f56468a.isNull(str);
    }

    public final String c(String str) {
        return this.f56468a.getString(str);
    }

    public final ReadableArray d(String str) {
        return this.f56468a.getArray(str);
    }

    public final ReadableMap e(String str) {
        return this.f56468a.getMap(str);
    }

    public final a f(String str) {
        return this.f56468a.getDynamic(str);
    }

    public final double a(String str, double d2) {
        if (this.f56468a.isNull(str)) {
            return d2;
        }
        return this.f56468a.getDouble(str);
    }

    public final float a(String str, float f2) {
        if (this.f56468a.isNull(str)) {
            return f2;
        }
        return (float) this.f56468a.getDouble(str);
    }

    public final int a(String str, int i2) {
        if (this.f56468a.isNull(str)) {
            return i2;
        }
        return this.f56468a.getInt(str);
    }

    public final boolean a(String str, boolean z) {
        if (this.f56468a.isNull(str)) {
            return z;
        }
        return this.f56468a.getBoolean(str);
    }
}
