package com.lynx.tasm.behavior.ui;

import android.graphics.Color;
import com.bytedance.covode.number.Covode;
import com.lynx.react.bridge.ReadableArray;
import java.util.ArrayList;
import java.util.List;

public final class c {

    /* renamed from: a  reason: collision with root package name */
    public int f56144a;

    /* renamed from: b  reason: collision with root package name */
    public float f56145b;

    /* renamed from: c  reason: collision with root package name */
    public float f56146c;

    /* renamed from: d  reason: collision with root package name */
    public float f56147d;

    /* renamed from: e  reason: collision with root package name */
    public float f56148e;

    /* renamed from: f  reason: collision with root package name */
    public float f56149f;

    /* renamed from: g  reason: collision with root package name */
    public int f56150g;

    static {
        Covode.recordClassIndex(35064);
    }

    public final boolean a() {
        if (this.f56150g == 1) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        int i2;
        int i3;
        int i4;
        int i5;
        int i6 = ((this.f56150g * 31) + this.f56144a) * 31;
        float f2 = this.f56145b;
        int i7 = 0;
        if (f2 != 0.0f) {
            i2 = Float.floatToIntBits(f2);
        } else {
            i2 = 0;
        }
        int i8 = (i6 + i2) * 31;
        float f3 = this.f56146c;
        if (f3 != 0.0f) {
            i3 = Float.floatToIntBits(f3);
        } else {
            i3 = 0;
        }
        int i9 = (i8 + i3) * 31;
        float f4 = this.f56147d;
        if (f4 != 0.0f) {
            i4 = Float.floatToIntBits(f4);
        } else {
            i4 = 0;
        }
        int i10 = (i9 + i4) * 31;
        float f5 = this.f56148e;
        if (f5 != 0.0f) {
            i5 = Float.floatToIntBits(f5);
        } else {
            i5 = 0;
        }
        int i11 = (i10 + i5) * 31;
        float f6 = this.f56149f;
        if (f6 != 0.0f) {
            i7 = Float.floatToIntBits(f6);
        }
        return i11 + i7;
    }

    public final String toString() {
        return "ShadowData: Color: red " + Color.red(this.f56144a) + " green: " + Color.green(this.f56144a) + " blue: " + Color.blue(Color.blue(this.f56144a)) + " OffsetX: " + this.f56145b + " offsetY: " + this.f56146c + " blurRadius: " + this.f56147d + " spreadRadius: " + this.f56148e + "option: " + this.f56150g;
    }

    private static boolean a(c cVar) {
        if ((cVar.f56145b == 0.0f && cVar.f56146c == 0.0f && cVar.f56147d == 0.0f && cVar.f56148e == 0.0f) || Color.alpha(cVar.f56144a) == 0 || cVar.f56147d < 0.0f) {
            return false;
        }
        return true;
    }

    public static List<c> a(ReadableArray readableArray) {
        if (readableArray == null || readableArray.size() == 0) {
            return null;
        }
        ArrayList arrayList = new ArrayList();
        for (int i2 = 0; i2 < readableArray.size(); i2++) {
            ReadableArray array = readableArray.getArray(i2);
            c cVar = new c();
            cVar.f56145b = (float) array.getDouble(0);
            cVar.f56146c = (float) array.getDouble(1);
            float f2 = (float) array.getDouble(2);
            cVar.f56147d = f2;
            cVar.f56149f = f2 * 1.25f;
            cVar.f56148e = (float) array.getDouble(3);
            cVar.f56150g = (int) array.getDouble(4);
            cVar.f56144a = (int) array.getLong(5);
            if (a(cVar)) {
                arrayList.add(cVar);
            }
        }
        return arrayList;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && getClass() == obj.getClass()) {
            c cVar = (c) obj;
            if (this.f56144a == cVar.f56144a && Float.compare(cVar.f56145b, this.f56145b) == 0 && Float.compare(cVar.f56146c, this.f56146c) == 0 && Float.compare(cVar.f56147d, this.f56147d) == 0 && Float.compare(cVar.f56148e, this.f56148e) == 0 && Float.compare(cVar.f56149f, this.f56149f) == 0 && this.f56150g == cVar.f56150g) {
                return true;
            }
        }
        return false;
    }
}
