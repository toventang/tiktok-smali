package com.lynx.react.bridge;

import androidx.core.g.f;
import com.bytedance.covode.number.Covode;

public class c implements a {

    /* renamed from: a  reason: collision with root package name */
    private static final f.b<c> f55527a = new f.b<>(10);

    /* renamed from: b  reason: collision with root package name */
    private ReadableMap f55528b;

    /* renamed from: c  reason: collision with root package name */
    private String f55529c;

    private c() {
    }

    static {
        Covode.recordClassIndex(34778);
    }

    @Override // com.lynx.react.bridge.a
    public final void i() {
        this.f55528b = null;
        this.f55529c = null;
        f55527a.release(this);
    }

    @Override // com.lynx.react.bridge.a
    public final boolean b() {
        String str;
        ReadableMap readableMap = this.f55528b;
        if (readableMap != null && (str = this.f55529c) != null) {
            return readableMap.getBoolean(str);
        }
        throw new IllegalStateException("This dynamic value has been recycled");
    }

    @Override // com.lynx.react.bridge.a
    public final double c() {
        String str;
        ReadableMap readableMap = this.f55528b;
        if (readableMap != null && (str = this.f55529c) != null) {
            return readableMap.getDouble(str);
        }
        throw new IllegalStateException("This dynamic value has been recycled");
    }

    @Override // com.lynx.react.bridge.a
    public final int d() {
        String str;
        ReadableMap readableMap = this.f55528b;
        if (readableMap != null && (str = this.f55529c) != null) {
            return readableMap.getInt(str);
        }
        throw new IllegalStateException("This dynamic value has been recycled");
    }

    @Override // com.lynx.react.bridge.a
    public final String e() {
        String str;
        ReadableMap readableMap = this.f55528b;
        if (readableMap != null && (str = this.f55529c) != null) {
            return readableMap.getString(str);
        }
        throw new IllegalStateException("This dynamic value has been recycled");
    }

    @Override // com.lynx.react.bridge.a
    public final ReadableArray f() {
        String str;
        ReadableMap readableMap = this.f55528b;
        if (readableMap != null && (str = this.f55529c) != null) {
            return readableMap.getArray(str);
        }
        throw new IllegalStateException("This dynamic value has been recycled");
    }

    @Override // com.lynx.react.bridge.a
    public final ReadableMap g() {
        String str;
        ReadableMap readableMap = this.f55528b;
        if (readableMap != null && (str = this.f55529c) != null) {
            return readableMap.getMap(str);
        }
        throw new IllegalStateException("This dynamic value has been recycled");
    }

    @Override // com.lynx.react.bridge.a
    public final ReadableType h() {
        String str;
        ReadableMap readableMap = this.f55528b;
        if (readableMap != null && (str = this.f55529c) != null) {
            return readableMap.getType(str);
        }
        throw new IllegalStateException("This dynamic value has been recycled");
    }

    @Override // com.lynx.react.bridge.a
    public final boolean a() {
        String str;
        ReadableMap readableMap = this.f55528b;
        if (readableMap != null && (str = this.f55529c) != null) {
            return readableMap.isNull(str);
        }
        throw new IllegalStateException("This dynamic value has been recycled");
    }

    public static c a(ReadableMap readableMap, String str) {
        c acquire = f55527a.acquire();
        if (acquire == null) {
            acquire = new c();
        }
        acquire.f55528b = readableMap;
        acquire.f55529c = str;
        return acquire;
    }
}
