package com.lynx.tasm.behavior.ui.utils;

import android.os.Build;
import com.bytedance.covode.number.Covode;
import com.lynx.react.bridge.ReadableArray;
import com.lynx.tasm.behavior.shadow.g;

public class b {

    /* renamed from: a  reason: collision with root package name */
    public static int f56396a = 1;

    /* renamed from: b  reason: collision with root package name */
    public static int f56397b = 2;

    /* renamed from: c  reason: collision with root package name */
    a[] f56398c;

    /* renamed from: d  reason: collision with root package name */
    public float[] f56399d;

    /* renamed from: e  reason: collision with root package name */
    private float f56400e;

    /* renamed from: f  reason: collision with root package name */
    private float f56401f;

    /* renamed from: g  reason: collision with root package name */
    private int f56402g;

    static {
        Covode.recordClassIndex(35187);
    }

    public static class a {

        /* renamed from: a  reason: collision with root package name */
        public float f56403a = 1.0E21f;

        /* renamed from: b  reason: collision with root package name */
        public float f56404b = 1.0E21f;

        /* renamed from: c  reason: collision with root package name */
        public c f56405c;

        /* renamed from: d  reason: collision with root package name */
        public c f56406d;

        static {
            Covode.recordClassIndex(35188);
        }

        public a() {
            c cVar = c.NUMBER;
            this.f56406d = cVar;
            this.f56405c = cVar;
        }

        public static a a(ReadableArray readableArray, int i2) {
            c cVar;
            c cVar2;
            a aVar = new a();
            aVar.f56403a = (float) readableArray.getDouble(i2);
            if (readableArray.getInt(i2 + 1) == 1) {
                cVar = c.PERCENTAGE;
            } else {
                cVar = c.NUMBER;
            }
            aVar.f56405c = cVar;
            aVar.f56404b = (float) readableArray.getDouble(i2 + 2);
            if (readableArray.getInt(i2 + 3) == 1) {
                cVar2 = c.PERCENTAGE;
            } else {
                cVar2 = c.NUMBER;
            }
            aVar.f56406d = cVar2;
            return aVar;
        }
    }

    public enum c {
        NUMBER,
        PERCENTAGE;

        static {
            Covode.recordClassIndex(35190);
        }
    }

    public final boolean b() {
        a[] aVarArr = this.f56398c;
        if (aVarArr != null) {
            for (a aVar : aVarArr) {
                if (aVar != null) {
                    if (!g.a(aVar.f56403a) && aVar.f56403a > 0.0f) {
                        return true;
                    }
                    if (!g.a(aVar.f56404b) && aVar.f56404b > 0.0f) {
                        return true;
                    }
                }
            }
        }
        return false;
    }

    /* renamed from: com.lynx.tasm.behavior.ui.utils.b$b  reason: collision with other inner class name */
    public enum EnumC1265b {
        TOP_LEFT,
        TOP_RIGHT,
        BOTTOM_RIGHT,
        BOTTOM_LEFT,
        TOP_START,
        TOP_END,
        BOTTOM_START,
        BOTTOM_END;

        static {
            Covode.recordClassIndex(35189);
        }
    }

    private void c() {
        int i2;
        int i3;
        boolean z = true;
        float[] a2 = a(true, 1.0E21f);
        int[] iArr = {2, 3, 0, 1, 6, 7, 4, 5};
        float[] fArr = this.f56399d;
        int i4 = this.f56402g;
        int i5 = 0;
        if ((f56396a & i4) == 0) {
            z = false;
        }
        if ((i4 & f56397b) != 0) {
            int i6 = 0;
            do {
                if (g.a(a2[i6])) {
                    a2[i6] = fArr[i6];
                }
                i6++;
            } while (i6 < 8);
            do {
                if (z) {
                    i3 = iArr[i5];
                } else {
                    i3 = i5;
                }
                fArr[i5] = a2[i3];
                i5++;
            } while (i5 < 8);
            return;
        }
        do {
            if (z) {
                i2 = iArr[i5];
            } else {
                i2 = i5;
            }
            float f2 = a2[i2];
            if (!g.a(f2)) {
                fArr[i5] = f2;
            }
            i5++;
        } while (i5 < 8);
    }

    public final float[] a() {
        float[] fArr = this.f56399d;
        if (fArr != null) {
            return fArr;
        }
        this.f56399d = a(false, 0.0f);
        int i2 = Build.VERSION.SDK_INT;
        c();
        d();
        return this.f56399d;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:7:0x002c, code lost:
        if (r7 < 1.0f) goto L_0x002e;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private void d() {
        /*
        // Method dump skipped, instructions count: 134
        */
        throw new UnsupportedOperationException("Method not decompiled: com.lynx.tasm.behavior.ui.utils.b.d():void");
    }

    public final boolean a(int i2) {
        if (this.f56402g != i2) {
            this.f56402g = i2;
            this.f56399d = null;
            return true;
        } else if (this.f56399d == null) {
            return true;
        } else {
            return false;
        }
    }

    public final boolean a(float f2, float f3) {
        if (f2 < 0.0f || g.a(f2)) {
            f2 = 0.0f;
        }
        if (f3 < 0.0f || g.a(f3)) {
            f3 = 0.0f;
        }
        if (!com.lynx.tasm.utils.c.a(f2, this.f56400e) || !com.lynx.tasm.utils.c.a(f3, this.f56401f)) {
            this.f56400e = f2;
            this.f56401f = f3;
            this.f56399d = null;
            return true;
        } else if (this.f56399d == null) {
            return true;
        } else {
            return false;
        }
    }

    private float[] a(boolean z, float f2) {
        float[] fArr = new float[8];
        int i2 = 0;
        if (this.f56398c == null) {
            do {
                fArr[i2] = f2;
                i2++;
            } while (i2 < 8);
            return fArr;
        }
        EnumC1265b[] bVarArr = z ? new EnumC1265b[]{EnumC1265b.TOP_START, EnumC1265b.TOP_END, EnumC1265b.BOTTOM_END, EnumC1265b.BOTTOM_START} : new EnumC1265b[]{EnumC1265b.TOP_LEFT, EnumC1265b.TOP_RIGHT, EnumC1265b.BOTTOM_RIGHT, EnumC1265b.BOTTOM_LEFT};
        do {
            a aVar = this.f56398c[bVarArr[i2].ordinal()];
            int i3 = i2 * 2;
            int i4 = i3 + 1;
            if (aVar == null) {
                fArr[i4] = f2;
                fArr[i3] = f2;
            } else {
                if (g.a(aVar.f56403a)) {
                    fArr[i3] = f2;
                } else if (aVar.f56405c == c.PERCENTAGE) {
                    fArr[i3] = aVar.f56403a * this.f56400e * 0.01f;
                } else {
                    fArr[i3] = aVar.f56403a;
                }
                if (g.a(aVar.f56404b)) {
                    fArr[i4] = f2;
                } else if (aVar.f56406d == c.PERCENTAGE) {
                    fArr[i4] = aVar.f56404b * this.f56401f * 0.01f;
                } else {
                    fArr[i4] = aVar.f56404b;
                }
            }
            i2++;
        } while (i2 < 4);
        return fArr;
    }
}
