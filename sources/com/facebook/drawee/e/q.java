package com.facebook.drawee.e;

import android.graphics.Matrix;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import com.bytedance.covode.number.Covode;

public final class q {

    public interface l {
        static {
            Covode.recordClassIndex(28792);
        }

        Object a();
    }

    static {
        Covode.recordClassIndex(28780);
    }

    static class c extends a {

        /* renamed from: a  reason: collision with root package name */
        public static final b f47445a = new c();

        public final String toString() {
            return "center";
        }

        private c() {
        }

        static {
            Covode.recordClassIndex(28783);
        }

        @Override // com.facebook.drawee.e.q.a
        public final void a(Matrix matrix, Rect rect, int i2, int i3, float f2, float f3, float f4, float f5) {
            matrix.setTranslate((float) ((int) (((float) rect.left) + (((float) (rect.width() - i2)) * 0.5f) + 0.5f)), (float) ((int) (((float) rect.top) + (((float) (rect.height() - i3)) * 0.5f) + 0.5f)));
        }
    }

    static class d extends a {

        /* renamed from: a  reason: collision with root package name */
        public static final b f47446a = new d();

        public final String toString() {
            return "center_crop";
        }

        private d() {
        }

        static {
            Covode.recordClassIndex(28784);
        }

        @Override // com.facebook.drawee.e.q.a
        public final void a(Matrix matrix, Rect rect, int i2, int i3, float f2, float f3, float f4, float f5) {
            float f6;
            float height;
            if (f5 > f4) {
                f6 = ((float) rect.left) + ((((float) rect.width()) - (((float) i2) * f5)) * 0.5f);
                height = (float) rect.top;
                f4 = f5;
            } else {
                f6 = (float) rect.left;
                height = ((((float) rect.height()) - (((float) i3) * f4)) * 0.5f) + ((float) rect.top);
            }
            matrix.setScale(f4, f4);
            matrix.postTranslate((float) ((int) (f6 + 0.5f)), (float) ((int) (height + 0.5f)));
        }
    }

    static class e extends a {

        /* renamed from: a  reason: collision with root package name */
        public static final b f47447a = new e();

        public final String toString() {
            return "center_inside";
        }

        private e() {
        }

        static {
            Covode.recordClassIndex(28785);
        }

        @Override // com.facebook.drawee.e.q.a
        public final void a(Matrix matrix, Rect rect, int i2, int i3, float f2, float f3, float f4, float f5) {
            float min = Math.min(Math.min(f4, f5), 1.0f);
            float width = ((float) rect.left) + ((((float) rect.width()) - (((float) i2) * min)) * 0.5f);
            float height = ((float) rect.top) + ((((float) rect.height()) - (((float) i3) * min)) * 0.5f);
            matrix.setScale(min, min);
            matrix.postTranslate((float) ((int) (width + 0.5f)), (float) ((int) (height + 0.5f)));
        }
    }

    static class f extends a {

        /* renamed from: a  reason: collision with root package name */
        public static final b f47448a = new f();

        public final String toString() {
            return "fit_bottom_start";
        }

        private f() {
        }

        static {
            Covode.recordClassIndex(28786);
        }

        @Override // com.facebook.drawee.e.q.a
        public final void a(Matrix matrix, Rect rect, int i2, int i3, float f2, float f3, float f4, float f5) {
            float min = Math.min(f4, f5);
            float f6 = (float) rect.left;
            float height = ((float) rect.top) + (((float) rect.height()) - (((float) i3) * min));
            matrix.setScale(min, min);
            matrix.postTranslate((float) ((int) (f6 + 0.5f)), (float) ((int) (height + 0.5f)));
        }
    }

    static class g extends a {

        /* renamed from: a  reason: collision with root package name */
        public static final b f47449a = new g();

        public final String toString() {
            return "fit_center";
        }

        private g() {
        }

        static {
            Covode.recordClassIndex(28787);
        }

        @Override // com.facebook.drawee.e.q.a
        public final void a(Matrix matrix, Rect rect, int i2, int i3, float f2, float f3, float f4, float f5) {
            float min = Math.min(f4, f5);
            float width = ((float) rect.left) + ((((float) rect.width()) - (((float) i2) * min)) * 0.5f);
            float height = ((float) rect.top) + ((((float) rect.height()) - (((float) i3) * min)) * 0.5f);
            matrix.setScale(min, min);
            matrix.postTranslate((float) ((int) (width + 0.5f)), (float) ((int) (height + 0.5f)));
        }
    }

    static class h extends a {

        /* renamed from: a  reason: collision with root package name */
        public static final b f47450a = new h();

        public final String toString() {
            return "fit_end";
        }

        private h() {
        }

        static {
            Covode.recordClassIndex(28788);
        }

        @Override // com.facebook.drawee.e.q.a
        public final void a(Matrix matrix, Rect rect, int i2, int i3, float f2, float f3, float f4, float f5) {
            float min = Math.min(f4, f5);
            float width = ((float) rect.left) + (((float) rect.width()) - (((float) i2) * min));
            float height = ((float) rect.top) + (((float) rect.height()) - (((float) i3) * min));
            matrix.setScale(min, min);
            matrix.postTranslate((float) ((int) (width + 0.5f)), (float) ((int) (height + 0.5f)));
        }
    }

    static class i extends a {

        /* renamed from: a  reason: collision with root package name */
        public static final b f47451a = new i();

        public final String toString() {
            return "fit_start";
        }

        private i() {
        }

        static {
            Covode.recordClassIndex(28789);
        }

        @Override // com.facebook.drawee.e.q.a
        public final void a(Matrix matrix, Rect rect, int i2, int i3, float f2, float f3, float f4, float f5) {
            float min = Math.min(f4, f5);
            float f6 = (float) rect.left;
            float f7 = (float) rect.top;
            matrix.setScale(min, min);
            matrix.postTranslate((float) ((int) (f6 + 0.5f)), (float) ((int) (f7 + 0.5f)));
        }
    }

    static class j extends a {

        /* renamed from: a  reason: collision with root package name */
        public static final b f47452a = new j();

        public final String toString() {
            return "fit_xy";
        }

        private j() {
        }

        static {
            Covode.recordClassIndex(28790);
        }

        @Override // com.facebook.drawee.e.q.a
        public final void a(Matrix matrix, Rect rect, int i2, int i3, float f2, float f3, float f4, float f5) {
            float f6 = (float) rect.left;
            float f7 = (float) rect.top;
            matrix.setScale(f4, f5);
            matrix.postTranslate((float) ((int) (f6 + 0.5f)), (float) ((int) (f7 + 0.5f)));
        }
    }

    static class k extends a {

        /* renamed from: a  reason: collision with root package name */
        public static final b f47453a = new k();

        public final String toString() {
            return "focus_crop";
        }

        private k() {
        }

        static {
            Covode.recordClassIndex(28791);
        }

        @Override // com.facebook.drawee.e.q.a
        public final void a(Matrix matrix, Rect rect, int i2, int i3, float f2, float f3, float f4, float f5) {
            float f6;
            float max;
            if (f5 > f4) {
                float f7 = ((float) i2) * f5;
                f6 = ((float) rect.left) + Math.max(Math.min((((float) rect.width()) * 0.5f) - (f2 * f7), 0.0f), ((float) rect.width()) - f7);
                max = (float) rect.top;
                f4 = f5;
            } else {
                f6 = (float) rect.left;
                float f8 = ((float) i3) * f4;
                max = Math.max(Math.min((((float) rect.height()) * 0.5f) - (f3 * f8), 0.0f), ((float) rect.height()) - f8) + ((float) rect.top);
            }
            matrix.setScale(f4, f4);
            matrix.postTranslate((float) ((int) (f6 + 0.5f)), (float) ((int) (max + 0.5f)));
        }
    }

    public interface b {

        /* renamed from: b  reason: collision with root package name */
        public static final b f47436b = j.f47452a;

        /* renamed from: c  reason: collision with root package name */
        public static final b f47437c = i.f47451a;

        /* renamed from: d  reason: collision with root package name */
        public static final b f47438d = g.f47449a;

        /* renamed from: e  reason: collision with root package name */
        public static final b f47439e = h.f47450a;

        /* renamed from: f  reason: collision with root package name */
        public static final b f47440f = c.f47445a;

        /* renamed from: g  reason: collision with root package name */
        public static final b f47441g = e.f47447a;

        /* renamed from: h  reason: collision with root package name */
        public static final b f47442h = d.f47446a;

        /* renamed from: i  reason: collision with root package name */
        public static final b f47443i = k.f47453a;

        /* renamed from: j  reason: collision with root package name */
        public static final b f47444j = f.f47448a;

        Matrix a(Matrix matrix, Rect rect, int i2, int i3, float f2, float f3);

        static {
            Covode.recordClassIndex(28782);
        }
    }

    public static p a(Drawable drawable) {
        while (drawable != null) {
            if (drawable instanceof p) {
                return (p) drawable;
            }
            if (drawable instanceof c) {
                drawable = ((c) drawable).getDrawable();
            } else {
                if (drawable instanceof a) {
                    a aVar = (a) drawable;
                    int length = aVar.f47350a.length;
                    for (int i2 = 0; i2 < length; i2++) {
                        p a2 = a(aVar.a(i2));
                        if (a2 != null) {
                            return a2;
                        }
                    }
                }
                return null;
            }
        }
        return null;
    }

    public static abstract class a implements b {
        static {
            Covode.recordClassIndex(28781);
        }

        public abstract void a(Matrix matrix, Rect rect, int i2, int i3, float f2, float f3, float f4, float f5);

        @Override // com.facebook.drawee.e.q.b
        public final Matrix a(Matrix matrix, Rect rect, int i2, int i3, float f2, float f3) {
            a(matrix, rect, i2, i3, f2, f3, ((float) rect.width()) / ((float) i2), ((float) rect.height()) / ((float) i3));
            return matrix;
        }
    }
}
