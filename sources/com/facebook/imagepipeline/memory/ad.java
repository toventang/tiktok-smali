package com.facebook.imagepipeline.memory;

import android.util.SparseIntArray;
import com.bytedance.covode.number.Covode;
import com.facebook.common.d.i;

public final class ad {

    /* renamed from: a  reason: collision with root package name */
    public final int f48062a;

    /* renamed from: b  reason: collision with root package name */
    public final int f48063b;

    /* renamed from: c  reason: collision with root package name */
    public final SparseIntArray f48064c;

    /* renamed from: d  reason: collision with root package name */
    public final int f48065d;

    /* renamed from: e  reason: collision with root package name */
    public final int f48066e;

    /* renamed from: f  reason: collision with root package name */
    public boolean f48067f;

    /* renamed from: g  reason: collision with root package name */
    public final int f48068g;

    static {
        Covode.recordClassIndex(29044);
    }

    public ad(int i2, int i3, SparseIntArray sparseIntArray) {
        this(i2, i3, sparseIntArray, 0, Integer.MAX_VALUE, -1);
    }

    public ad(int i2, int i3, SparseIntArray sparseIntArray, int i4, int i5, int i6) {
        boolean z;
        if (i2 < 0 || i3 < i2) {
            z = false;
        } else {
            z = true;
        }
        i.b(z);
        this.f48063b = i2;
        this.f48062a = i3;
        this.f48064c = sparseIntArray;
        this.f48065d = i4;
        this.f48066e = i5;
        this.f48068g = i6;
    }
}
