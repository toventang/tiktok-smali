package com.lynx.react.bridge;

import androidx.core.g.f;
import com.bytedance.covode.number.Covode;

public class b implements a {

    /* renamed from: a  reason: collision with root package name */
    private static final f.b<b> f55524a = new f.b<>(10);

    /* renamed from: b  reason: collision with root package name */
    private ReadableArray f55525b;

    /* renamed from: c  reason: collision with root package name */
    private int f55526c = -1;

    private b() {
    }

    static {
        Covode.recordClassIndex(34777);
    }

    @Override // com.lynx.react.bridge.a
    public final void i() {
        this.f55525b = null;
        this.f55526c = -1;
        f55524a.release(this);
    }

    @Override // com.lynx.react.bridge.a
    public final boolean b() {
        ReadableArray readableArray = this.f55525b;
        if (readableArray != null) {
            return readableArray.getBoolean(this.f55526c);
        }
        throw new IllegalStateException("This dynamic value has been recycled");
    }

    @Override // com.lynx.react.bridge.a
    public final double c() {
        ReadableArray readableArray = this.f55525b;
        if (readableArray != null) {
            return readableArray.getDouble(this.f55526c);
        }
        throw new IllegalStateException("This dynamic value has been recycled");
    }

    @Override // com.lynx.react.bridge.a
    public final int d() {
        ReadableArray readableArray = this.f55525b;
        if (readableArray != null) {
            return readableArray.getInt(this.f55526c);
        }
        throw new IllegalStateException("This dynamic value has been recycled");
    }

    @Override // com.lynx.react.bridge.a
    public final String e() {
        ReadableArray readableArray = this.f55525b;
        if (readableArray != null) {
            return readableArray.getString(this.f55526c);
        }
        throw new IllegalStateException("This dynamic value has been recycled");
    }

    @Override // com.lynx.react.bridge.a
    public final ReadableArray f() {
        ReadableArray readableArray = this.f55525b;
        if (readableArray != null) {
            return readableArray.getArray(this.f55526c);
        }
        throw new IllegalStateException("This dynamic value has been recycled");
    }

    @Override // com.lynx.react.bridge.a
    public final ReadableMap g() {
        ReadableArray readableArray = this.f55525b;
        if (readableArray != null) {
            return readableArray.getMap(this.f55526c);
        }
        throw new IllegalStateException("This dynamic value has been recycled");
    }

    @Override // com.lynx.react.bridge.a
    public final ReadableType h() {
        ReadableArray readableArray = this.f55525b;
        if (readableArray != null) {
            return readableArray.getType(this.f55526c);
        }
        throw new IllegalStateException("This dynamic value has been recycled");
    }

    @Override // com.lynx.react.bridge.a
    public final boolean a() {
        ReadableArray readableArray = this.f55525b;
        if (readableArray != null) {
            return readableArray.isNull(this.f55526c);
        }
        throw new IllegalStateException("This dynamic value has been recycled");
    }

    public static b a(ReadableArray readableArray, int i2) {
        b acquire = f55524a.acquire();
        if (acquire == null) {
            acquire = new b();
        }
        acquire.f55525b = readableArray;
        acquire.f55526c = i2;
        return acquire;
    }
}
