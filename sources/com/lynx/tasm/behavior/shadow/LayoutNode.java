package com.lynx.tasm.behavior.shadow;

import com.bytedance.covode.number.Covode;
import com.bytedance.frameworks.apm.trace.MethodCollector;

public class LayoutNode {

    /* renamed from: a  reason: collision with root package name */
    private boolean f55951a = true;

    /* renamed from: d  reason: collision with root package name */
    public long f55952d;

    /* renamed from: e  reason: collision with root package name */
    public boolean f55953e;

    /* renamed from: f  reason: collision with root package name */
    public d f55954f;

    /* renamed from: g  reason: collision with root package name */
    public j f55955g;

    static {
        Covode.recordClassIndex(34958);
    }

    private native boolean nativeIsDirty(long j2);

    private native void nativeMarkDirty(long j2);

    private native void nativeSetMeasureFunc(long j2);

    public void c() {
    }

    /* access modifiers changed from: package-private */
    public native int nativeGetFlexDirection(long j2);

    public native float nativeGetHeight(long j2);

    public native int[] nativeGetMargin(long j2);

    /* access modifiers changed from: package-private */
    public native int[] nativeGetPadding(long j2);

    public native float nativeGetWidth(long j2);

    public void d() {
        MethodCollector.i(13066);
        if (!this.f55951a) {
            this.f55951a = true;
            nativeMarkDirty(this.f55952d);
        }
        MethodCollector.o(13066);
    }

    public final void a(d dVar) {
        MethodCollector.i(12980);
        this.f55954f = dVar;
        long j2 = this.f55952d;
        if (j2 != 0) {
            this.f55953e = true;
            nativeSetMeasureFunc(j2);
        }
        MethodCollector.o(12980);
    }

    public void a(int i2, int i3, int i4, int i5) {
        this.f55951a = false;
    }

    private long measure(float f2, int i2, float f3, int i3) {
        return this.f55954f.a(this, f2, e.fromInt(i2), f3, e.fromInt(i3));
    }
}
