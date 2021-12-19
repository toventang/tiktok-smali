package com.google.android.material.i;

import android.graphics.Matrix;
import android.graphics.Path;
import android.graphics.RectF;
import com.bytedance.covode.number.Covode;
import java.util.List;

public final class d {

    /* renamed from: a  reason: collision with root package name */
    public float f52461a;

    /* renamed from: b  reason: collision with root package name */
    public float f52462b;

    /* renamed from: c  reason: collision with root package name */
    public float f52463c;

    /* renamed from: d  reason: collision with root package name */
    public float f52464d;

    /* renamed from: e  reason: collision with root package name */
    final List<c> f52465e;

    public static abstract class c {

        /* renamed from: g  reason: collision with root package name */
        protected final Matrix f52475g = new Matrix();

        static {
            Covode.recordClassIndex(32529);
        }

        public abstract void a(Matrix matrix, Path path);
    }

    static {
        Covode.recordClassIndex(32526);
    }

    public static class a extends c {

        /* renamed from: h  reason: collision with root package name */
        private static final RectF f52466h = new RectF();

        /* renamed from: a  reason: collision with root package name */
        public float f52467a;

        /* renamed from: b  reason: collision with root package name */
        public float f52468b;

        /* renamed from: c  reason: collision with root package name */
        public float f52469c;

        /* renamed from: d  reason: collision with root package name */
        public float f52470d;

        /* renamed from: e  reason: collision with root package name */
        public float f52471e;

        /* renamed from: f  reason: collision with root package name */
        public float f52472f;

        static {
            Covode.recordClassIndex(32527);
        }

        @Override // com.google.android.material.i.d.c
        public final void a(Matrix matrix, Path path) {
            Matrix matrix2 = this.f52475g;
            matrix.invert(matrix2);
            path.transform(matrix2);
            RectF rectF = f52466h;
            rectF.set(this.f52467a, this.f52468b, this.f52469c, this.f52470d);
            path.arcTo(rectF, this.f52471e, this.f52472f, false);
            path.transform(matrix);
        }

        public a(float f2, float f3, float f4, float f5) {
            this.f52467a = f2;
            this.f52468b = f3;
            this.f52469c = f4;
            this.f52470d = f5;
        }
    }

    public final void a(float f2) {
        b bVar = new b();
        bVar.f52473a = f2;
        bVar.f52474b = 0.0f;
        this.f52465e.add(bVar);
        this.f52463c = f2;
        this.f52464d = 0.0f;
    }

    public static class b extends c {

        /* renamed from: a  reason: collision with root package name */
        public float f52473a;

        /* renamed from: b  reason: collision with root package name */
        public float f52474b;

        static {
            Covode.recordClassIndex(32528);
        }

        @Override // com.google.android.material.i.d.c
        public final void a(Matrix matrix, Path path) {
            Matrix matrix2 = this.f52475g;
            matrix.invert(matrix2);
            path.transform(matrix2);
            path.lineTo(this.f52473a, this.f52474b);
            path.transform(matrix);
        }
    }

    public final void a(Matrix matrix, Path path) {
        int size = this.f52465e.size();
        for (int i2 = 0; i2 < size; i2++) {
            this.f52465e.get(i2).a(matrix, path);
        }
    }

    public final void a(float f2, float f3, float f4, float f5, float f6, float f7) {
        a aVar = new a(f2, f3, f4, f5);
        aVar.f52471e = f6;
        aVar.f52472f = f7;
        this.f52465e.add(aVar);
        double d2 = (double) (f6 + f7);
        this.f52463c = ((f2 + f4) * 0.5f) + (((f4 - f2) / 2.0f) * ((float) Math.cos(Math.toRadians(d2))));
        this.f52464d = ((f3 + f5) * 0.5f) + (((f5 - f3) / 2.0f) * ((float) Math.sin(Math.toRadians(d2))));
    }
}
