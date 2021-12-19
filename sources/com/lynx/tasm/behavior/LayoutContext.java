package com.lynx.tasm.behavior;

import android.util.DisplayMetrics;
import com.bytedance.covode.number.Covode;
import com.lynx.react.bridge.ReadableArray;
import com.lynx.react.bridge.ReadableMap;

public abstract class LayoutContext {

    /* renamed from: a  reason: collision with root package name */
    long f55778a;

    /* renamed from: b  reason: collision with root package name */
    public boolean f55779b;

    static {
        Covode.recordClassIndex(34885);
    }

    public abstract DisplayMetrics a();

    public abstract int createNode(int i2, String str, ReadableMap readableMap, long j2, ReadableArray readableArray);

    public abstract void destroyNodes(int[] iArr);

    public abstract void dispatchOnLayout(int i2, int i3, int i4, int i5, int i6);

    public abstract void dispatchOnLayoutBefore(int i2);

    public abstract void dispatchOnLayoutFinish();

    public abstract void insertNode(int i2, int i3, int i4);

    public long measure(int i2, float f2, int i3, float f3, int i4) {
        return 0;
    }

    public abstract void moveNode(int i2, int i3, int i4, int i5);

    /* access modifiers changed from: package-private */
    public native void nativeTriggerLayout(long j2, long j3);

    public abstract void removeNode(int i2, int i3, int i4);

    /* access modifiers changed from: protected */
    public abstract void scheduleLayout(long j2);

    public abstract void setFontFaces(ReadableMap readableMap);

    public void setTextStyleData(int i2, int[] iArr, double[] dArr, String str) {
    }

    /* access modifiers changed from: protected */
    public abstract void updateDataWithoutChange();

    public abstract void updateProps(int i2, ReadableMap readableMap);

    /* access modifiers changed from: protected */
    public void detachNativePtr() {
        this.f55778a = 0;
    }

    /* access modifiers changed from: protected */
    public void attachNativePtr(long j2) {
        this.f55778a = j2;
    }
}
