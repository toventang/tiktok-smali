package com.ss.android.ugc.aweme.canvas.a;

import android.graphics.Bitmap;
import android.graphics.Color;
import android.graphics.Rect;
import android.util.SparseBooleanArray;
import com.bytedance.covode.number.Covode;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Map;

public final class b {

    /* renamed from: c  reason: collision with root package name */
    static final AbstractC1577b f69632c = new AbstractC1577b() {
        /* class com.ss.android.ugc.aweme.canvas.a.b.AnonymousClass1 */

        static {
            Covode.recordClassIndex(42954);
        }

        @Override // com.ss.android.ugc.aweme.canvas.a.b.AbstractC1577b
        public final boolean a(float[] fArr) {
            if (fArr[2] < 0.95f && fArr[2] > 0.05f && (fArr[0] < 10.0f || fArr[0] > 37.0f || fArr[1] > 0.82f)) {
                return true;
            }
            return false;
        }
    };

    /* renamed from: a  reason: collision with root package name */
    public final List<c> f69633a;

    /* renamed from: b  reason: collision with root package name */
    public final c f69634b = b();

    /* renamed from: d  reason: collision with root package name */
    private final List<c> f69635d;

    /* renamed from: e  reason: collision with root package name */
    private final Map<c, c> f69636e = new androidx.c.a();

    /* renamed from: f  reason: collision with root package name */
    private final SparseBooleanArray f69637f = new SparseBooleanArray();

    /* renamed from: com.ss.android.ugc.aweme.canvas.a.b$b  reason: collision with other inner class name */
    public interface AbstractC1577b {
        static {
            Covode.recordClassIndex(42956);
        }

        boolean a(float[] fArr);
    }

    public static final class c {

        /* renamed from: a  reason: collision with root package name */
        public final int f69646a;

        /* renamed from: b  reason: collision with root package name */
        public final int f69647b;

        /* renamed from: c  reason: collision with root package name */
        private final int f69648c;

        /* renamed from: d  reason: collision with root package name */
        private final int f69649d;

        /* renamed from: e  reason: collision with root package name */
        private final int f69650e;

        /* renamed from: f  reason: collision with root package name */
        private boolean f69651f;

        /* renamed from: g  reason: collision with root package name */
        private int f69652g;

        /* renamed from: h  reason: collision with root package name */
        private int f69653h;

        /* renamed from: i  reason: collision with root package name */
        private float[] f69654i;

        static {
            Covode.recordClassIndex(42957);
        }

        public final int hashCode() {
            return (this.f69646a * 31) + this.f69647b;
        }

        public final float[] a() {
            if (this.f69654i == null) {
                this.f69654i = new float[3];
            }
            androidx.core.graphics.a.a(this.f69648c, this.f69649d, this.f69650e, this.f69654i);
            return this.f69654i;
        }

        private void b() {
            int b2;
            int b3;
            if (!this.f69651f) {
                int a2 = androidx.core.graphics.a.a(-1, this.f69646a, 4.5f);
                int a3 = androidx.core.graphics.a.a(-1, this.f69646a, 3.0f);
                if (a2 == -1 || a3 == -1) {
                    int a4 = androidx.core.graphics.a.a(-16777216, this.f69646a, 4.5f);
                    int a5 = androidx.core.graphics.a.a(-16777216, this.f69646a, 3.0f);
                    if (a4 == -1 || a5 == -1) {
                        if (a2 != -1) {
                            b2 = androidx.core.graphics.a.b(-1, a2);
                        } else {
                            b2 = androidx.core.graphics.a.b(-16777216, a4);
                        }
                        this.f69653h = b2;
                        if (a3 != -1) {
                            b3 = androidx.core.graphics.a.b(-1, a3);
                        } else {
                            b3 = androidx.core.graphics.a.b(-16777216, a5);
                        }
                        this.f69652g = b3;
                        this.f69651f = true;
                        return;
                    }
                    this.f69653h = androidx.core.graphics.a.b(-16777216, a4);
                    this.f69652g = androidx.core.graphics.a.b(-16777216, a5);
                    this.f69651f = true;
                    return;
                }
                this.f69653h = androidx.core.graphics.a.b(-1, a2);
                this.f69652g = androidx.core.graphics.a.b(-1, a3);
                this.f69651f = true;
            }
        }

        public final String toString() {
            StringBuilder append = new StringBuilder(getClass().getSimpleName()).append(" [RGB: #").append(Integer.toHexString(this.f69646a)).append(']').append(" [HSL: ").append(Arrays.toString(a())).append(']').append(" [Population: ").append(this.f69647b).append(']').append(" [Title Text: #");
            b();
            StringBuilder append2 = append.append(Integer.toHexString(this.f69652g)).append(']').append(" [Body Text: #");
            b();
            return append2.append(Integer.toHexString(this.f69653h)).append(']').toString();
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (obj != null && getClass() == obj.getClass()) {
                c cVar = (c) obj;
                if (this.f69647b == cVar.f69647b && this.f69646a == cVar.f69646a) {
                    return true;
                }
                return false;
            }
            return false;
        }

        public c(int i2, int i3) {
            this.f69648c = Color.red(i2);
            this.f69649d = Color.green(i2);
            this.f69650e = Color.blue(i2);
            this.f69646a = i2;
            this.f69647b = i3;
        }
    }

    static {
        Covode.recordClassIndex(42953);
    }

    private c b() {
        int size = this.f69633a.size();
        int i2 = Integer.MIN_VALUE;
        c cVar = null;
        for (int i3 = 0; i3 < size; i3++) {
            c cVar2 = this.f69633a.get(i3);
            if (cVar2.f69647b > i2) {
                i2 = cVar2.f69647b;
                cVar = cVar2;
            }
        }
        return cVar;
    }

    public final void a() {
        int i2;
        float f2;
        float f3;
        float f4;
        int size = this.f69635d.size();
        char c2 = 0;
        int i3 = 0;
        while (i3 < size) {
            c cVar = this.f69635d.get(i3);
            int length = cVar.f69663i.length;
            float f5 = 0.0f;
            float f6 = 0.0f;
            for (int i4 = 0; i4 < length; i4++) {
                float f7 = cVar.f69663i[i4];
                if (f7 > 0.0f) {
                    f6 += f7;
                }
            }
            if (f6 != 0.0f) {
                int length2 = cVar.f69663i.length;
                for (int i5 = 0; i5 < length2; i5++) {
                    if (cVar.f69663i[i5] > 0.0f) {
                        float[] fArr = cVar.f69663i;
                        fArr[i5] = fArr[i5] / f6;
                    }
                }
            }
            Map<c, c> map = this.f69636e;
            c cVar2 = null;
            int size2 = this.f69633a.size();
            int i6 = 0;
            float f8 = 0.0f;
            while (i6 < size2) {
                c cVar3 = this.f69633a.get(i6);
                float[] a2 = cVar3.a();
                if (a2[1] >= cVar.f69661g[c2] && a2[1] <= cVar.f69661g[2] && a2[2] >= cVar.f69662h[c2] && a2[2] <= cVar.f69662h[2] && !this.f69637f.get(cVar3.f69646a)) {
                    float[] a3 = cVar3.a();
                    c cVar4 = this.f69634b;
                    if (cVar4 != null) {
                        i2 = cVar4.f69647b;
                    } else {
                        i2 = 1;
                    }
                    if (cVar.f69663i[c2] > f5) {
                        f2 = cVar.f69663i[c2] * (1.0f - Math.abs(a3[1] - cVar.f69661g[1]));
                    } else {
                        f2 = 0.0f;
                    }
                    if (cVar.f69663i[1] > f5) {
                        f3 = cVar.f69663i[1] * (1.0f - Math.abs(a3[2] - cVar.f69662h[1]));
                    } else {
                        f3 = 0.0f;
                    }
                    if (cVar.f69663i[2] > 0.0f) {
                        f4 = cVar.f69663i[2] * (((float) cVar3.f69647b) / ((float) i2));
                    } else {
                        f4 = 0.0f;
                    }
                    float f9 = f2 + f3 + f4;
                    if (cVar2 == null || f9 > f8) {
                        cVar2 = cVar3;
                        f8 = f9;
                    }
                }
                i6++;
                c2 = 0;
                f5 = 0.0f;
            }
            if (cVar2 != null && cVar.f69664j) {
                this.f69637f.append(cVar2.f69646a, true);
            }
            map.put(cVar, cVar2);
            i3++;
            c2 = 0;
        }
        this.f69637f.clear();
    }

    public static final class a {

        /* renamed from: a  reason: collision with root package name */
        public final List<c> f69638a;

        /* renamed from: b  reason: collision with root package name */
        public final Bitmap f69639b;

        /* renamed from: c  reason: collision with root package name */
        public final List<c> f69640c;

        /* renamed from: d  reason: collision with root package name */
        public int f69641d = 16;

        /* renamed from: e  reason: collision with root package name */
        public int f69642e = 12544;

        /* renamed from: f  reason: collision with root package name */
        public int f69643f = -1;

        /* renamed from: g  reason: collision with root package name */
        public final List<AbstractC1577b> f69644g;

        /* renamed from: h  reason: collision with root package name */
        public Rect f69645h;

        static {
            Covode.recordClassIndex(42955);
        }

        public final int[] a(Bitmap bitmap) {
            int width = bitmap.getWidth();
            int height = bitmap.getHeight();
            int[] iArr = new int[(width * height)];
            bitmap.getPixels(iArr, 0, width, 0, 0, width, height);
            Rect rect = this.f69645h;
            if (rect == null) {
                return iArr;
            }
            int width2 = rect.width();
            int height2 = this.f69645h.height();
            int[] iArr2 = new int[(width2 * height2)];
            for (int i2 = 0; i2 < height2; i2++) {
                System.arraycopy(iArr, ((this.f69645h.top + i2) * width) + this.f69645h.left, iArr2, i2 * width2, width2);
            }
            return iArr2;
        }

        public a(Bitmap bitmap) {
            ArrayList arrayList = new ArrayList();
            this.f69640c = arrayList;
            ArrayList arrayList2 = new ArrayList();
            this.f69644g = arrayList2;
            if (bitmap == null || bitmap.isRecycled()) {
                throw new IllegalArgumentException("Bitmap is not valid");
            }
            arrayList2.add(b.f69632c);
            this.f69639b = bitmap;
            this.f69638a = null;
            arrayList.add(c.f69655a);
            arrayList.add(c.f69656b);
            arrayList.add(c.f69657c);
            arrayList.add(c.f69658d);
            arrayList.add(c.f69659e);
            arrayList.add(c.f69660f);
        }
    }

    public b(List<c> list, List<c> list2) {
        this.f69633a = list;
        this.f69635d = list2;
    }
}
