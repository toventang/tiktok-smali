package androidx.l.a.a;

import android.content.res.ColorStateList;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.content.res.XmlResourceParser;
import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.Color;
import android.graphics.ColorFilter;
import android.graphics.Matrix;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.PathMeasure;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffColorFilter;
import android.graphics.Rect;
import android.graphics.Region;
import android.graphics.drawable.Drawable;
import android.os.Build;
import android.util.AttributeSet;
import android.util.Xml;
import androidx.core.graphics.d;
import com.bytedance.covode.number.Covode;
import com.bytedance.vcloud.abrmodule.ABRConfig;
import java.io.IOException;
import java.util.ArrayDeque;
import java.util.ArrayList;
import org.xmlpull.v1.XmlPullParser;
import org.xmlpull.v1.XmlPullParserException;

public final class i extends h {

    /* renamed from: a  reason: collision with root package name */
    static final PorterDuff.Mode f3405a = PorterDuff.Mode.SRC_IN;

    /* renamed from: c  reason: collision with root package name */
    g f3406c;

    /* renamed from: d  reason: collision with root package name */
    public boolean f3407d;

    /* renamed from: e  reason: collision with root package name */
    private PorterDuffColorFilter f3408e;

    /* renamed from: f  reason: collision with root package name */
    private ColorFilter f3409f;

    /* renamed from: g  reason: collision with root package name */
    private boolean f3410g;

    /* renamed from: h  reason: collision with root package name */
    private Drawable.ConstantState f3411h;

    /* renamed from: i  reason: collision with root package name */
    private final float[] f3412i;

    /* renamed from: j  reason: collision with root package name */
    private final Matrix f3413j;

    /* renamed from: k  reason: collision with root package name */
    private final Rect f3414k;

    /* access modifiers changed from: package-private */
    public static class a extends e {
        static {
            Covode.recordClassIndex(1262);
        }

        @Override // androidx.l.a.a.i.e
        public final boolean a() {
            return true;
        }

        public a() {
        }

        public a(a aVar) {
            super(aVar);
        }

        /* access modifiers changed from: package-private */
        public final void a(TypedArray typedArray) {
            String string = typedArray.getString(0);
            if (string != null) {
                this.n = string;
            }
            String string2 = typedArray.getString(1);
            if (string2 != null) {
                this.f3440m = androidx.core.graphics.d.b(string2);
            }
        }
    }

    /* access modifiers changed from: package-private */
    public static class b extends e {

        /* renamed from: a  reason: collision with root package name */
        androidx.core.content.a.b f3415a;

        /* renamed from: b  reason: collision with root package name */
        float f3416b;

        /* renamed from: c  reason: collision with root package name */
        androidx.core.content.a.b f3417c;

        /* renamed from: d  reason: collision with root package name */
        float f3418d = 1.0f;

        /* renamed from: e  reason: collision with root package name */
        int f3419e;

        /* renamed from: f  reason: collision with root package name */
        float f3420f = 1.0f;

        /* renamed from: g  reason: collision with root package name */
        float f3421g;

        /* renamed from: h  reason: collision with root package name */
        float f3422h = 1.0f;

        /* renamed from: i  reason: collision with root package name */
        float f3423i;

        /* renamed from: j  reason: collision with root package name */
        Paint.Cap f3424j = Paint.Cap.BUTT;

        /* renamed from: k  reason: collision with root package name */
        Paint.Join f3425k = Paint.Join.MITER;

        /* renamed from: l  reason: collision with root package name */
        float f3426l = 4.0f;
        private int[] p;

        static {
            Covode.recordClassIndex(1263);
        }

        /* access modifiers changed from: package-private */
        public final float getFillAlpha() {
            return this.f3420f;
        }

        /* access modifiers changed from: package-private */
        public final float getStrokeAlpha() {
            return this.f3418d;
        }

        /* access modifiers changed from: package-private */
        public final float getStrokeWidth() {
            return this.f3416b;
        }

        /* access modifiers changed from: package-private */
        public final float getTrimPathEnd() {
            return this.f3422h;
        }

        /* access modifiers changed from: package-private */
        public final float getTrimPathOffset() {
            return this.f3423i;
        }

        /* access modifiers changed from: package-private */
        public final float getTrimPathStart() {
            return this.f3421g;
        }

        /* access modifiers changed from: package-private */
        public final int getFillColor() {
            return this.f3417c.f2270b;
        }

        /* access modifiers changed from: package-private */
        public final int getStrokeColor() {
            return this.f3415a.f2270b;
        }

        public b() {
        }

        @Override // androidx.l.a.a.i.d
        public final boolean b() {
            if (this.f3417c.b() || this.f3415a.b()) {
                return true;
            }
            return false;
        }

        /* access modifiers changed from: package-private */
        public final void setFillAlpha(float f2) {
            this.f3420f = f2;
        }

        /* access modifiers changed from: package-private */
        public final void setStrokeAlpha(float f2) {
            this.f3418d = f2;
        }

        /* access modifiers changed from: package-private */
        public final void setStrokeWidth(float f2) {
            this.f3416b = f2;
        }

        /* access modifiers changed from: package-private */
        public final void setTrimPathEnd(float f2) {
            this.f3422h = f2;
        }

        /* access modifiers changed from: package-private */
        public final void setTrimPathOffset(float f2) {
            this.f3423i = f2;
        }

        /* access modifiers changed from: package-private */
        public final void setTrimPathStart(float f2) {
            this.f3421g = f2;
        }

        /* access modifiers changed from: package-private */
        public final void setFillColor(int i2) {
            this.f3417c.f2270b = i2;
        }

        /* access modifiers changed from: package-private */
        public final void setStrokeColor(int i2) {
            this.f3415a.f2270b = i2;
        }

        @Override // androidx.l.a.a.i.d
        public final boolean a(int[] iArr) {
            return this.f3415a.a(iArr) | this.f3417c.a(iArr);
        }

        public b(b bVar) {
            super(bVar);
            this.p = bVar.p;
            this.f3415a = bVar.f3415a;
            this.f3416b = bVar.f3416b;
            this.f3418d = bVar.f3418d;
            this.f3417c = bVar.f3417c;
            this.f3419e = bVar.f3419e;
            this.f3420f = bVar.f3420f;
            this.f3421g = bVar.f3421g;
            this.f3422h = bVar.f3422h;
            this.f3423i = bVar.f3423i;
            this.f3424j = bVar.f3424j;
            this.f3425k = bVar.f3425k;
            this.f3426l = bVar.f3426l;
        }

        /* access modifiers changed from: package-private */
        public final void a(TypedArray typedArray, XmlPullParser xmlPullParser, Resources.Theme theme) {
            this.p = null;
            if (androidx.core.content.a.h.a(xmlPullParser, "pathData")) {
                String string = typedArray.getString(0);
                if (string != null) {
                    this.n = string;
                }
                String string2 = typedArray.getString(2);
                if (string2 != null) {
                    this.f3440m = androidx.core.graphics.d.b(string2);
                }
                this.f3417c = androidx.core.content.a.h.a(typedArray, xmlPullParser, theme, "fillColor", 1);
                this.f3420f = androidx.core.content.a.h.a(typedArray, xmlPullParser, "fillAlpha", 12, this.f3420f);
                int a2 = androidx.core.content.a.h.a(typedArray, xmlPullParser, "strokeLineCap", 8, -1);
                Paint.Cap cap = this.f3424j;
                if (a2 == 0) {
                    cap = Paint.Cap.BUTT;
                } else if (a2 == 1) {
                    cap = Paint.Cap.ROUND;
                } else if (a2 == 2) {
                    cap = Paint.Cap.SQUARE;
                }
                this.f3424j = cap;
                int a3 = androidx.core.content.a.h.a(typedArray, xmlPullParser, "strokeLineJoin", 9, -1);
                Paint.Join join = this.f3425k;
                if (a3 == 0) {
                    join = Paint.Join.MITER;
                } else if (a3 == 1) {
                    join = Paint.Join.ROUND;
                } else if (a3 == 2) {
                    join = Paint.Join.BEVEL;
                }
                this.f3425k = join;
                this.f3426l = androidx.core.content.a.h.a(typedArray, xmlPullParser, "strokeMiterLimit", 10, this.f3426l);
                this.f3415a = androidx.core.content.a.h.a(typedArray, xmlPullParser, theme, "strokeColor", 3);
                this.f3418d = androidx.core.content.a.h.a(typedArray, xmlPullParser, "strokeAlpha", 11, this.f3418d);
                this.f3416b = androidx.core.content.a.h.a(typedArray, xmlPullParser, "strokeWidth", 4, this.f3416b);
                this.f3422h = androidx.core.content.a.h.a(typedArray, xmlPullParser, "trimPathEnd", 6, this.f3422h);
                this.f3423i = androidx.core.content.a.h.a(typedArray, xmlPullParser, "trimPathOffset", 7, this.f3423i);
                this.f3421g = androidx.core.content.a.h.a(typedArray, xmlPullParser, "trimPathStart", 5, this.f3421g);
                this.f3419e = androidx.core.content.a.h.a(typedArray, xmlPullParser, "fillType", 13, this.f3419e);
            }
        }
    }

    /* access modifiers changed from: package-private */
    public static class c extends d {

        /* renamed from: a  reason: collision with root package name */
        final Matrix f3427a;

        /* renamed from: b  reason: collision with root package name */
        final ArrayList<d> f3428b;

        /* renamed from: c  reason: collision with root package name */
        float f3429c;

        /* renamed from: d  reason: collision with root package name */
        float f3430d;

        /* renamed from: e  reason: collision with root package name */
        float f3431e;

        /* renamed from: f  reason: collision with root package name */
        float f3432f;

        /* renamed from: g  reason: collision with root package name */
        float f3433g;

        /* renamed from: h  reason: collision with root package name */
        float f3434h;

        /* renamed from: i  reason: collision with root package name */
        float f3435i;

        /* renamed from: j  reason: collision with root package name */
        final Matrix f3436j;

        /* renamed from: k  reason: collision with root package name */
        int f3437k;

        /* renamed from: l  reason: collision with root package name */
        int[] f3438l;

        /* renamed from: m  reason: collision with root package name */
        String f3439m;

        static {
            Covode.recordClassIndex(1264);
        }

        public final String getGroupName() {
            return this.f3439m;
        }

        public final Matrix getLocalMatrix() {
            return this.f3436j;
        }

        public final float getPivotX() {
            return this.f3430d;
        }

        public final float getPivotY() {
            return this.f3431e;
        }

        public final float getRotation() {
            return this.f3429c;
        }

        public final float getScaleX() {
            return this.f3432f;
        }

        public final float getScaleY() {
            return this.f3433g;
        }

        public final float getTranslateX() {
            return this.f3434h;
        }

        public final float getTranslateY() {
            return this.f3435i;
        }

        @Override // androidx.l.a.a.i.d
        public final boolean b() {
            for (int i2 = 0; i2 < this.f3428b.size(); i2++) {
                if (this.f3428b.get(i2).b()) {
                    return true;
                }
            }
            return false;
        }

        public c() {
            super((byte) 0);
            this.f3427a = new Matrix();
            this.f3428b = new ArrayList<>();
            this.f3429c = 0.0f;
            this.f3430d = 0.0f;
            this.f3431e = 0.0f;
            this.f3432f = 1.0f;
            this.f3433g = 1.0f;
            this.f3434h = 0.0f;
            this.f3435i = 0.0f;
            this.f3436j = new Matrix();
            this.f3439m = null;
        }

        /* access modifiers changed from: package-private */
        public final void a() {
            this.f3436j.reset();
            this.f3436j.postTranslate(-this.f3430d, -this.f3431e);
            this.f3436j.postScale(this.f3432f, this.f3433g);
            this.f3436j.postRotate(this.f3429c, 0.0f, 0.0f);
            this.f3436j.postTranslate(this.f3434h + this.f3430d, this.f3435i + this.f3431e);
        }

        public final void setPivotX(float f2) {
            if (f2 != this.f3430d) {
                this.f3430d = f2;
                a();
            }
        }

        public final void setPivotY(float f2) {
            if (f2 != this.f3431e) {
                this.f3431e = f2;
                a();
            }
        }

        public final void setRotation(float f2) {
            if (f2 != this.f3429c) {
                this.f3429c = f2;
                a();
            }
        }

        public final void setScaleX(float f2) {
            if (f2 != this.f3432f) {
                this.f3432f = f2;
                a();
            }
        }

        public final void setScaleY(float f2) {
            if (f2 != this.f3433g) {
                this.f3433g = f2;
                a();
            }
        }

        public final void setTranslateX(float f2) {
            if (f2 != this.f3434h) {
                this.f3434h = f2;
                a();
            }
        }

        public final void setTranslateY(float f2) {
            if (f2 != this.f3435i) {
                this.f3435i = f2;
                a();
            }
        }

        @Override // androidx.l.a.a.i.d
        public final boolean a(int[] iArr) {
            boolean z = false;
            for (int i2 = 0; i2 < this.f3428b.size(); i2++) {
                z |= this.f3428b.get(i2).a(iArr);
            }
            return z;
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public c(c cVar, androidx.c.a<String, Object> aVar) {
            super((byte) 0);
            e aVar2;
            this.f3427a = new Matrix();
            this.f3428b = new ArrayList<>();
            this.f3429c = 0.0f;
            this.f3430d = 0.0f;
            this.f3431e = 0.0f;
            this.f3432f = 1.0f;
            this.f3433g = 1.0f;
            this.f3434h = 0.0f;
            this.f3435i = 0.0f;
            Matrix matrix = new Matrix();
            this.f3436j = matrix;
            this.f3439m = null;
            this.f3429c = cVar.f3429c;
            this.f3430d = cVar.f3430d;
            this.f3431e = cVar.f3431e;
            this.f3432f = cVar.f3432f;
            this.f3433g = cVar.f3433g;
            this.f3434h = cVar.f3434h;
            this.f3435i = cVar.f3435i;
            this.f3438l = cVar.f3438l;
            String str = cVar.f3439m;
            this.f3439m = str;
            this.f3437k = cVar.f3437k;
            if (str != null) {
                aVar.put(str, this);
            }
            matrix.set(cVar.f3436j);
            ArrayList<d> arrayList = cVar.f3428b;
            for (int i2 = 0; i2 < arrayList.size(); i2++) {
                d dVar = arrayList.get(i2);
                if (dVar instanceof c) {
                    this.f3428b.add(new c((c) dVar, aVar));
                } else {
                    if (dVar instanceof b) {
                        aVar2 = new b((b) dVar);
                    } else if (dVar instanceof a) {
                        aVar2 = new a((a) dVar);
                    } else {
                        throw new IllegalStateException("Unknown object in the tree!");
                    }
                    this.f3428b.add(aVar2);
                    if (aVar2.n != null) {
                        aVar.put(aVar2.n, aVar2);
                    }
                }
            }
        }
    }

    /* access modifiers changed from: package-private */
    public static abstract class d {
        static {
            Covode.recordClassIndex(1265);
        }

        public boolean a(int[] iArr) {
            return false;
        }

        public boolean b() {
            return false;
        }

        private d() {
        }

        /* synthetic */ d(byte b2) {
            this();
        }
    }

    /* access modifiers changed from: package-private */
    public static abstract class e extends d {

        /* renamed from: m  reason: collision with root package name */
        protected d.b[] f3440m;
        String n;
        int o;

        static {
            Covode.recordClassIndex(1266);
        }

        public boolean a() {
            return false;
        }

        public d.b[] getPathData() {
            return this.f3440m;
        }

        public String getPathName() {
            return this.n;
        }

        public e() {
            super((byte) 0);
        }

        public final void a(Path path) {
            path.reset();
            d.b[] bVarArr = this.f3440m;
            if (bVarArr != null) {
                d.b.a(bVarArr, path);
            }
        }

        public e(e eVar) {
            super((byte) 0);
            this.n = eVar.n;
            this.o = eVar.o;
            this.f3440m = androidx.core.graphics.d.a(eVar.f3440m);
        }

        public void setPathData(d.b[] bVarArr) {
            if (!androidx.core.graphics.d.a(this.f3440m, bVarArr)) {
                this.f3440m = androidx.core.graphics.d.a(bVarArr);
                return;
            }
            d.b[] bVarArr2 = this.f3440m;
            for (int i2 = 0; i2 < bVarArr.length; i2++) {
                bVarArr2[i2].f2413a = bVarArr[i2].f2413a;
                for (int i3 = 0; i3 < bVarArr[i2].f2414b.length; i3++) {
                    bVarArr2[i2].f2414b[i3] = bVarArr[i2].f2414b[i3];
                }
            }
        }
    }

    /* access modifiers changed from: package-private */
    public static class f {
        private static final Matrix n = new Matrix();

        /* renamed from: a  reason: collision with root package name */
        Paint f3441a;

        /* renamed from: b  reason: collision with root package name */
        Paint f3442b;

        /* renamed from: c  reason: collision with root package name */
        final c f3443c;

        /* renamed from: d  reason: collision with root package name */
        float f3444d;

        /* renamed from: e  reason: collision with root package name */
        float f3445e;

        /* renamed from: f  reason: collision with root package name */
        float f3446f;

        /* renamed from: g  reason: collision with root package name */
        float f3447g;

        /* renamed from: h  reason: collision with root package name */
        int f3448h;

        /* renamed from: i  reason: collision with root package name */
        String f3449i;

        /* renamed from: j  reason: collision with root package name */
        Boolean f3450j;

        /* renamed from: k  reason: collision with root package name */
        final androidx.c.a<String, Object> f3451k;

        /* renamed from: l  reason: collision with root package name */
        private final Path f3452l;

        /* renamed from: m  reason: collision with root package name */
        private final Path f3453m;
        private final Matrix o;
        private PathMeasure p;
        private int q;

        public final int getRootAlpha() {
            return this.f3448h;
        }

        static {
            Covode.recordClassIndex(1267);
        }

        public final float getAlpha() {
            return ((float) getRootAlpha()) / 255.0f;
        }

        public final boolean a() {
            if (this.f3450j == null) {
                this.f3450j = Boolean.valueOf(this.f3443c.b());
            }
            return this.f3450j.booleanValue();
        }

        public f() {
            this.o = new Matrix();
            this.f3444d = 0.0f;
            this.f3445e = 0.0f;
            this.f3446f = 0.0f;
            this.f3447g = 0.0f;
            this.f3448h = 255;
            this.f3449i = null;
            this.f3450j = null;
            this.f3451k = new androidx.c.a<>();
            this.f3443c = new c();
            this.f3452l = new Path();
            this.f3453m = new Path();
        }

        public final void setRootAlpha(int i2) {
            this.f3448h = i2;
        }

        public final void setAlpha(float f2) {
            setRootAlpha((int) (f2 * 255.0f));
        }

        public f(f fVar) {
            this.o = new Matrix();
            this.f3444d = 0.0f;
            this.f3445e = 0.0f;
            this.f3446f = 0.0f;
            this.f3447g = 0.0f;
            this.f3448h = 255;
            this.f3449i = null;
            this.f3450j = null;
            androidx.c.a<String, Object> aVar = new androidx.c.a<>();
            this.f3451k = aVar;
            this.f3443c = new c(fVar.f3443c, aVar);
            this.f3452l = new Path(fVar.f3452l);
            this.f3453m = new Path(fVar.f3453m);
            this.f3444d = fVar.f3444d;
            this.f3445e = fVar.f3445e;
            this.f3446f = fVar.f3446f;
            this.f3447g = fVar.f3447g;
            this.q = fVar.q;
            this.f3448h = fVar.f3448h;
            this.f3449i = fVar.f3449i;
            String str = fVar.f3449i;
            if (str != null) {
                aVar.put(str, this);
            }
            this.f3450j = fVar.f3450j;
        }

        public final void a(Canvas canvas, int i2, int i3) {
            a(this.f3443c, n, canvas, i2, i3, null);
        }

        /* JADX DEBUG: Multi-variable search result rejected for r1v15, resolved type: android.graphics.PathMeasure */
        /* JADX WARN: Multi-variable type inference failed */
        /* JADX WARN: Type inference failed for: r6v0 */
        /* JADX WARN: Type inference failed for: r6v1, types: [boolean] */
        /* JADX WARN: Type inference failed for: r6v4 */
        /* JADX WARNING: Unknown variable types count: 1 */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        private void a(androidx.l.a.a.i.c r21, android.graphics.Matrix r22, android.graphics.Canvas r23, int r24, int r25, android.graphics.ColorFilter r26) {
            /*
            // Method dump skipped, instructions count: 526
            */
            throw new UnsupportedOperationException("Method not decompiled: androidx.l.a.a.i.f.a(androidx.l.a.a.i$c, android.graphics.Matrix, android.graphics.Canvas, int, int, android.graphics.ColorFilter):void");
        }
    }

    /* access modifiers changed from: package-private */
    public static class g extends Drawable.ConstantState {

        /* renamed from: a  reason: collision with root package name */
        int f3454a;

        /* renamed from: b  reason: collision with root package name */
        f f3455b;

        /* renamed from: c  reason: collision with root package name */
        ColorStateList f3456c;

        /* renamed from: d  reason: collision with root package name */
        PorterDuff.Mode f3457d;

        /* renamed from: e  reason: collision with root package name */
        boolean f3458e;

        /* renamed from: f  reason: collision with root package name */
        Bitmap f3459f;

        /* renamed from: g  reason: collision with root package name */
        ColorStateList f3460g;

        /* renamed from: h  reason: collision with root package name */
        PorterDuff.Mode f3461h;

        /* renamed from: i  reason: collision with root package name */
        int f3462i;

        /* renamed from: j  reason: collision with root package name */
        boolean f3463j;

        /* renamed from: k  reason: collision with root package name */
        boolean f3464k;

        /* renamed from: l  reason: collision with root package name */
        Paint f3465l;

        static {
            Covode.recordClassIndex(1268);
        }

        public final int getChangingConfigurations() {
            return this.f3454a;
        }

        public final Drawable newDrawable() {
            return new i(this);
        }

        public g() {
            this.f3457d = i.f3405a;
            this.f3455b = new f();
        }

        public final Drawable newDrawable(Resources resources) {
            return new i(this);
        }

        public g(g gVar) {
            this.f3457d = i.f3405a;
            if (gVar != null) {
                this.f3454a = gVar.f3454a;
                this.f3455b = new f(gVar.f3455b);
                if (gVar.f3455b.f3442b != null) {
                    this.f3455b.f3442b = new Paint(gVar.f3455b.f3442b);
                }
                if (gVar.f3455b.f3441a != null) {
                    this.f3455b.f3441a = new Paint(gVar.f3455b.f3441a);
                }
                this.f3456c = gVar.f3456c;
                this.f3457d = gVar.f3457d;
                this.f3458e = gVar.f3458e;
            }
        }

        public final void a(int i2, int i3) {
            this.f3459f.eraseColor(0);
            this.f3455b.a(new Canvas(this.f3459f), i2, i3);
        }
    }

    @Override // androidx.l.a.a.h
    public final /* bridge */ /* synthetic */ void clearColorFilter() {
        super.clearColorFilter();
    }

    @Override // androidx.l.a.a.h
    public final /* bridge */ /* synthetic */ void jumpToCurrentState() {
        super.jumpToCurrentState();
    }

    /* access modifiers changed from: package-private */
    public static class h extends Drawable.ConstantState {

        /* renamed from: a  reason: collision with root package name */
        private final Drawable.ConstantState f3466a;

        static {
            Covode.recordClassIndex(1269);
        }

        public final boolean canApplyTheme() {
            return this.f3466a.canApplyTheme();
        }

        public final int getChangingConfigurations() {
            return this.f3466a.getChangingConfigurations();
        }

        public final Drawable newDrawable() {
            i iVar = new i();
            iVar.f3404b = this.f3466a.newDrawable();
            return iVar;
        }

        public h(Drawable.ConstantState constantState) {
            this.f3466a = constantState;
        }

        public final Drawable newDrawable(Resources resources) {
            i iVar = new i();
            iVar.f3404b = this.f3466a.newDrawable(resources);
            return iVar;
        }

        public final Drawable newDrawable(Resources resources, Resources.Theme theme) {
            i iVar = new i();
            iVar.f3404b = this.f3466a.newDrawable(resources, theme);
            return iVar;
        }
    }

    @Override // androidx.l.a.a.h
    public final /* bridge */ /* synthetic */ ColorFilter getColorFilter() {
        return super.getColorFilter();
    }

    @Override // androidx.l.a.a.h
    public final /* bridge */ /* synthetic */ Drawable getCurrent() {
        return super.getCurrent();
    }

    @Override // androidx.l.a.a.h
    public final /* bridge */ /* synthetic */ int getMinimumHeight() {
        return super.getMinimumHeight();
    }

    @Override // androidx.l.a.a.h
    public final /* bridge */ /* synthetic */ int getMinimumWidth() {
        return super.getMinimumWidth();
    }

    @Override // androidx.l.a.a.h
    public final /* bridge */ /* synthetic */ int[] getState() {
        return super.getState();
    }

    @Override // androidx.l.a.a.h
    public final /* bridge */ /* synthetic */ Region getTransparentRegion() {
        return super.getTransparentRegion();
    }

    static {
        Covode.recordClassIndex(1261);
    }

    public final boolean canApplyTheme() {
        if (this.f3404b == null) {
            return false;
        }
        androidx.core.graphics.drawable.a.c(this.f3404b);
        return false;
    }

    public final int getOpacity() {
        if (this.f3404b != null) {
            return this.f3404b.getOpacity();
        }
        return -3;
    }

    public final void invalidateSelf() {
        if (this.f3404b != null) {
            this.f3404b.invalidateSelf();
        } else {
            super.invalidateSelf();
        }
    }

    public final boolean isAutoMirrored() {
        if (this.f3404b != null) {
            return androidx.core.graphics.drawable.a.a(this.f3404b);
        }
        return this.f3406c.f3458e;
    }

    public final int getAlpha() {
        if (this.f3404b != null) {
            return androidx.core.graphics.drawable.a.b(this.f3404b);
        }
        return this.f3406c.f3455b.getRootAlpha();
    }

    public final int getChangingConfigurations() {
        if (this.f3404b != null) {
            return this.f3404b.getChangingConfigurations();
        }
        return super.getChangingConfigurations() | this.f3406c.getChangingConfigurations();
    }

    public final int getIntrinsicHeight() {
        if (this.f3404b != null) {
            return this.f3404b.getIntrinsicHeight();
        }
        return (int) this.f3406c.f3455b.f3445e;
    }

    public final int getIntrinsicWidth() {
        if (this.f3404b != null) {
            return this.f3404b.getIntrinsicWidth();
        }
        return (int) this.f3406c.f3455b.f3444d;
    }

    i() {
        this.f3407d = true;
        this.f3412i = new float[9];
        this.f3413j = new Matrix();
        this.f3414k = new Rect();
        this.f3406c = new g();
    }

    public final Drawable.ConstantState getConstantState() {
        if (this.f3404b != null && Build.VERSION.SDK_INT >= 24) {
            return new h(this.f3404b.getConstantState());
        }
        this.f3406c.f3454a = getChangingConfigurations();
        return this.f3406c;
    }

    public final boolean isStateful() {
        if (this.f3404b != null) {
            return this.f3404b.isStateful();
        }
        if (super.isStateful()) {
            return true;
        }
        g gVar = this.f3406c;
        if (gVar == null) {
            return false;
        }
        if (gVar.f3455b.a()) {
            return true;
        }
        if (this.f3406c.f3456c == null || !this.f3406c.f3456c.isStateful()) {
            return false;
        }
        return true;
    }

    public final Drawable mutate() {
        if (this.f3404b != null) {
            this.f3404b.mutate();
            return this;
        }
        if (!this.f3410g && super.mutate() == this) {
            this.f3406c = new g(this.f3406c);
            this.f3410g = true;
        }
        return this;
    }

    @Override // androidx.l.a.a.h
    public final /* bridge */ /* synthetic */ void applyTheme(Resources.Theme theme) {
        super.applyTheme(theme);
    }

    @Override // androidx.l.a.a.h
    public final /* bridge */ /* synthetic */ void setChangingConfigurations(int i2) {
        super.setChangingConfigurations(i2);
    }

    @Override // androidx.l.a.a.h
    public final /* bridge */ /* synthetic */ void setFilterBitmap(boolean z) {
        super.setFilterBitmap(z);
    }

    @Override // androidx.l.a.a.h
    public final /* bridge */ /* synthetic */ boolean getPadding(Rect rect) {
        return super.getPadding(rect);
    }

    @Override // androidx.l.a.a.h
    public final /* bridge */ /* synthetic */ boolean setState(int[] iArr) {
        return super.setState(iArr);
    }

    /* access modifiers changed from: protected */
    @Override // androidx.l.a.a.h
    public final void onBoundsChange(Rect rect) {
        if (this.f3404b != null) {
            this.f3404b.setBounds(rect);
        }
    }

    public final void setAutoMirrored(boolean z) {
        if (this.f3404b != null) {
            androidx.core.graphics.drawable.a.a(this.f3404b, z);
        } else {
            this.f3406c.f3458e = z;
        }
    }

    public final void setColorFilter(ColorFilter colorFilter) {
        if (this.f3404b != null) {
            this.f3404b.setColorFilter(colorFilter);
            return;
        }
        this.f3409f = colorFilter;
        invalidateSelf();
    }

    public final void unscheduleSelf(Runnable runnable) {
        if (this.f3404b != null) {
            this.f3404b.unscheduleSelf(runnable);
        } else {
            super.unscheduleSelf(runnable);
        }
    }

    public final void setAlpha(int i2) {
        if (this.f3404b != null) {
            this.f3404b.setAlpha(i2);
        } else if (this.f3406c.f3455b.getRootAlpha() != i2) {
            this.f3406c.f3455b.setRootAlpha(i2);
            invalidateSelf();
        }
    }

    @Override // androidx.core.graphics.drawable.e
    public final void setTint(int i2) {
        if (this.f3404b != null) {
            androidx.core.graphics.drawable.a.a(this.f3404b, i2);
        } else {
            setTintList(ColorStateList.valueOf(i2));
        }
    }

    @Override // androidx.core.graphics.drawable.e
    public final void setTintList(ColorStateList colorStateList) {
        if (this.f3404b != null) {
            androidx.core.graphics.drawable.a.a(this.f3404b, colorStateList);
            return;
        }
        g gVar = this.f3406c;
        if (gVar.f3456c != colorStateList) {
            gVar.f3456c = colorStateList;
            this.f3408e = a(colorStateList, gVar.f3457d);
            invalidateSelf();
        }
    }

    @Override // androidx.core.graphics.drawable.e
    public final void setTintMode(PorterDuff.Mode mode) {
        if (this.f3404b != null) {
            androidx.core.graphics.drawable.a.a(this.f3404b, mode);
            return;
        }
        g gVar = this.f3406c;
        if (gVar.f3457d != mode) {
            gVar.f3457d = mode;
            this.f3408e = a(gVar.f3456c, mode);
            invalidateSelf();
        }
    }

    i(g gVar) {
        this.f3407d = true;
        this.f3412i = new float[9];
        this.f3413j = new Matrix();
        this.f3414k = new Rect();
        this.f3406c = gVar;
        this.f3408e = a(gVar.f3456c, gVar.f3457d);
    }

    /* access modifiers changed from: protected */
    public final boolean onStateChange(int[] iArr) {
        if (this.f3404b != null) {
            return this.f3404b.setState(iArr);
        }
        boolean z = false;
        g gVar = this.f3406c;
        if (!(gVar.f3456c == null || gVar.f3457d == null)) {
            this.f3408e = a(gVar.f3456c, gVar.f3457d);
            invalidateSelf();
            z = true;
        }
        if (gVar.f3455b.a()) {
            boolean a2 = gVar.f3455b.f3443c.a(iArr);
            gVar.f3464k |= a2;
            if (a2) {
                invalidateSelf();
                return true;
            }
        }
        return z;
    }

    public final void draw(Canvas canvas) {
        Paint paint;
        if (this.f3404b != null) {
            this.f3404b.draw(canvas);
            return;
        }
        copyBounds(this.f3414k);
        if (this.f3414k.width() > 0 && this.f3414k.height() > 0) {
            ColorFilter colorFilter = this.f3409f;
            if (colorFilter == null) {
                colorFilter = this.f3408e;
            }
            canvas.getMatrix(this.f3413j);
            this.f3413j.getValues(this.f3412i);
            boolean z = false;
            float abs = Math.abs(this.f3412i[0]);
            float abs2 = Math.abs(this.f3412i[4]);
            float abs3 = Math.abs(this.f3412i[1]);
            float abs4 = Math.abs(this.f3412i[3]);
            if (!(abs3 == 0.0f && abs4 == 0.0f)) {
                abs = 1.0f;
                abs2 = 1.0f;
            }
            int min = Math.min(2048, (int) (((float) this.f3414k.width()) * abs));
            int min2 = Math.min(2048, (int) (((float) this.f3414k.height()) * abs2));
            if (min > 0 && min2 > 0) {
                int save = canvas.save();
                canvas.translate((float) this.f3414k.left, (float) this.f3414k.top);
                int i2 = Build.VERSION.SDK_INT;
                if (isAutoMirrored() && androidx.core.graphics.drawable.a.f(this) == 1) {
                    canvas.translate((float) this.f3414k.width(), 0.0f);
                    canvas.scale(-1.0f, 1.0f);
                }
                this.f3414k.offsetTo(0, 0);
                g gVar = this.f3406c;
                if (!(gVar.f3459f != null && min == gVar.f3459f.getWidth() && min2 == gVar.f3459f.getHeight())) {
                    gVar.f3459f = Bitmap.createBitmap(min, min2, Bitmap.Config.ARGB_8888);
                    gVar.f3464k = true;
                }
                if (!this.f3407d) {
                    this.f3406c.a(min, min2);
                } else {
                    g gVar2 = this.f3406c;
                    if (!(!gVar2.f3464k && gVar2.f3460g == gVar2.f3456c && gVar2.f3461h == gVar2.f3457d && gVar2.f3463j == gVar2.f3458e && gVar2.f3462i == gVar2.f3455b.getRootAlpha())) {
                        this.f3406c.a(min, min2);
                        g gVar3 = this.f3406c;
                        gVar3.f3460g = gVar3.f3456c;
                        gVar3.f3461h = gVar3.f3457d;
                        gVar3.f3462i = gVar3.f3455b.getRootAlpha();
                        gVar3.f3463j = gVar3.f3458e;
                        gVar3.f3464k = false;
                    }
                }
                g gVar4 = this.f3406c;
                Rect rect = this.f3414k;
                if (gVar4.f3455b.getRootAlpha() < 255) {
                    z = true;
                }
                if (z || colorFilter != null) {
                    if (gVar4.f3465l == null) {
                        gVar4.f3465l = new Paint();
                        gVar4.f3465l.setFilterBitmap(true);
                    }
                    gVar4.f3465l.setAlpha(gVar4.f3455b.getRootAlpha());
                    gVar4.f3465l.setColorFilter(colorFilter);
                    paint = gVar4.f3465l;
                } else {
                    paint = null;
                }
                canvas.drawBitmap(gVar4.f3459f, (Rect) null, rect, paint);
                canvas.restoreToCount(save);
            }
        }
    }

    @Override // androidx.l.a.a.h
    public final /* bridge */ /* synthetic */ void setColorFilter(int i2, PorterDuff.Mode mode) {
        super.setColorFilter(i2, mode);
    }

    @Override // androidx.l.a.a.h
    public final /* bridge */ /* synthetic */ void setHotspot(float f2, float f3) {
        super.setHotspot(f2, f3);
    }

    static int a(int i2, float f2) {
        return (i2 & 16777215) | (((int) (((float) Color.alpha(i2)) * f2)) << 24);
    }

    public final void scheduleSelf(Runnable runnable, long j2) {
        if (this.f3404b != null) {
            this.f3404b.scheduleSelf(runnable, j2);
        } else {
            super.scheduleSelf(runnable, j2);
        }
    }

    public final boolean setVisible(boolean z, boolean z2) {
        if (this.f3404b != null) {
            return this.f3404b.setVisible(z, z2);
        }
        return super.setVisible(z, z2);
    }

    private PorterDuffColorFilter a(ColorStateList colorStateList, PorterDuff.Mode mode) {
        if (colorStateList == null || mode == null) {
            return null;
        }
        return new PorterDuffColorFilter(colorStateList.getColorForState(getState(), 0), mode);
    }

    @Override // android.graphics.drawable.Drawable
    public final void inflate(Resources resources, XmlPullParser xmlPullParser, AttributeSet attributeSet) {
        if (this.f3404b != null) {
            this.f3404b.inflate(resources, xmlPullParser, attributeSet);
        } else {
            inflate(resources, xmlPullParser, attributeSet, null);
        }
    }

    public static i a(Resources resources, int i2, Resources.Theme theme) {
        int next;
        if (Build.VERSION.SDK_INT >= 24) {
            i iVar = new i();
            iVar.f3404b = androidx.core.content.a.f.a(resources, i2, theme);
            iVar.f3411h = new h(iVar.f3404b.getConstantState());
            return iVar;
        }
        try {
            XmlResourceParser xml = resources.getXml(i2);
            AttributeSet asAttributeSet = Xml.asAttributeSet(xml);
            do {
                next = xml.next();
                if (next == 2) {
                    return a(resources, xml, asAttributeSet, theme);
                }
            } while (next != 1);
            throw new XmlPullParserException("No start tag found");
        } catch (IOException | XmlPullParserException unused) {
            return null;
        }
    }

    @Override // androidx.l.a.a.h
    public final /* bridge */ /* synthetic */ void setHotspotBounds(int i2, int i3, int i4, int i5) {
        super.setHotspotBounds(i2, i3, i4, i5);
    }

    public static i a(Resources resources, XmlPullParser xmlPullParser, AttributeSet attributeSet, Resources.Theme theme) {
        i iVar = new i();
        iVar.inflate(resources, xmlPullParser, attributeSet, theme);
        return iVar;
    }

    private void b(Resources resources, XmlPullParser xmlPullParser, AttributeSet attributeSet, Resources.Theme theme) {
        g gVar = this.f3406c;
        f fVar = gVar.f3455b;
        ArrayDeque arrayDeque = new ArrayDeque();
        arrayDeque.push(fVar.f3443c);
        int eventType = xmlPullParser.getEventType();
        int depth = xmlPullParser.getDepth() + 1;
        boolean z = true;
        for (int i2 = 1; eventType != i2 && (xmlPullParser.getDepth() >= depth || eventType != 3); i2 = 1) {
            if (eventType == 2) {
                String name = xmlPullParser.getName();
                c cVar = (c) arrayDeque.peek();
                if ("path".equals(name)) {
                    b bVar = new b();
                    TypedArray a2 = androidx.core.content.a.h.a(resources, theme, attributeSet, a.f3379c);
                    bVar.a(a2, xmlPullParser, theme);
                    a2.recycle();
                    cVar.f3428b.add(bVar);
                    if (bVar.getPathName() != null) {
                        fVar.f3451k.put(bVar.getPathName(), bVar);
                    }
                    gVar.f3454a = bVar.o | gVar.f3454a;
                    z = false;
                } else if ("clip-path".equals(name)) {
                    a aVar = new a();
                    if (androidx.core.content.a.h.a(xmlPullParser, "pathData")) {
                        TypedArray a3 = androidx.core.content.a.h.a(resources, theme, attributeSet, a.f3380d);
                        aVar.a(a3);
                        a3.recycle();
                    }
                    cVar.f3428b.add(aVar);
                    if (aVar.getPathName() != null) {
                        fVar.f3451k.put(aVar.getPathName(), aVar);
                    }
                    gVar.f3454a = aVar.o | gVar.f3454a;
                } else if ("group".equals(name)) {
                    c cVar2 = new c();
                    TypedArray a4 = androidx.core.content.a.h.a(resources, theme, attributeSet, a.f3378b);
                    cVar2.f3438l = null;
                    cVar2.f3429c = androidx.core.content.a.h.a(a4, xmlPullParser, "rotation", 5, cVar2.f3429c);
                    cVar2.f3430d = a4.getFloat(1, cVar2.f3430d);
                    cVar2.f3431e = a4.getFloat(2, cVar2.f3431e);
                    cVar2.f3432f = androidx.core.content.a.h.a(a4, xmlPullParser, "scaleX", 3, cVar2.f3432f);
                    cVar2.f3433g = androidx.core.content.a.h.a(a4, xmlPullParser, "scaleY", 4, cVar2.f3433g);
                    cVar2.f3434h = androidx.core.content.a.h.a(a4, xmlPullParser, "translateX", 6, cVar2.f3434h);
                    cVar2.f3435i = androidx.core.content.a.h.a(a4, xmlPullParser, "translateY", 7, cVar2.f3435i);
                    String string = a4.getString(0);
                    if (string != null) {
                        cVar2.f3439m = string;
                    }
                    cVar2.a();
                    a4.recycle();
                    cVar.f3428b.add(cVar2);
                    arrayDeque.push(cVar2);
                    if (cVar2.getGroupName() != null) {
                        fVar.f3451k.put(cVar2.getGroupName(), cVar2);
                    }
                    gVar.f3454a = cVar2.f3437k | gVar.f3454a;
                }
            } else if (eventType == 3 && "group".equals(xmlPullParser.getName())) {
                arrayDeque.pop();
            }
            eventType = xmlPullParser.next();
        }
        if (z) {
            throw new XmlPullParserException("no path defined");
        }
    }

    @Override // android.graphics.drawable.Drawable
    public final void inflate(Resources resources, XmlPullParser xmlPullParser, AttributeSet attributeSet, Resources.Theme theme) {
        if (this.f3404b != null) {
            androidx.core.graphics.drawable.a.a(this.f3404b, resources, xmlPullParser, attributeSet, theme);
            return;
        }
        g gVar = this.f3406c;
        gVar.f3455b = new f();
        TypedArray a2 = androidx.core.content.a.h.a(resources, theme, attributeSet, a.f3377a);
        g gVar2 = this.f3406c;
        f fVar = gVar2.f3455b;
        int a3 = androidx.core.content.a.h.a(a2, xmlPullParser, "tintMode", 6, -1);
        PorterDuff.Mode mode = PorterDuff.Mode.SRC_IN;
        if (a3 == 3) {
            mode = PorterDuff.Mode.SRC_OVER;
        } else if (a3 == 5) {
            mode = PorterDuff.Mode.SRC_IN;
        } else if (a3 != 9) {
            switch (a3) {
                case ABRConfig.ABR_SELECT_SCENE /*{ENCODED_INT: 14}*/:
                    mode = PorterDuff.Mode.MULTIPLY;
                    break;
                case 15:
                    mode = PorterDuff.Mode.SCREEN;
                    break;
                case 16:
                    mode = PorterDuff.Mode.ADD;
                    break;
            }
        } else {
            mode = PorterDuff.Mode.SRC_ATOP;
        }
        gVar2.f3457d = mode;
        ColorStateList colorStateList = a2.getColorStateList(1);
        if (colorStateList != null) {
            gVar2.f3456c = colorStateList;
        }
        boolean z = gVar2.f3458e;
        if (androidx.core.content.a.h.a(xmlPullParser, "autoMirrored")) {
            z = a2.getBoolean(5, z);
        }
        gVar2.f3458e = z;
        fVar.f3446f = androidx.core.content.a.h.a(a2, xmlPullParser, "viewportWidth", 7, fVar.f3446f);
        fVar.f3447g = androidx.core.content.a.h.a(a2, xmlPullParser, "viewportHeight", 8, fVar.f3447g);
        if (fVar.f3446f <= 0.0f) {
            throw new XmlPullParserException(a2.getPositionDescription() + "<vector> tag requires viewportWidth > 0");
        } else if (fVar.f3447g > 0.0f) {
            fVar.f3444d = a2.getDimension(3, fVar.f3444d);
            fVar.f3445e = a2.getDimension(2, fVar.f3445e);
            if (fVar.f3444d <= 0.0f) {
                throw new XmlPullParserException(a2.getPositionDescription() + "<vector> tag requires width > 0");
            } else if (fVar.f3445e > 0.0f) {
                fVar.setAlpha(androidx.core.content.a.h.a(a2, xmlPullParser, "alpha", 4, fVar.getAlpha()));
                String string = a2.getString(0);
                if (string != null) {
                    fVar.f3449i = string;
                    fVar.f3451k.put(string, fVar);
                }
                a2.recycle();
                gVar.f3454a = getChangingConfigurations();
                gVar.f3464k = true;
                b(resources, xmlPullParser, attributeSet, theme);
                this.f3408e = a(gVar.f3456c, gVar.f3457d);
            } else {
                throw new XmlPullParserException(a2.getPositionDescription() + "<vector> tag requires height > 0");
            }
        } else {
            throw new XmlPullParserException(a2.getPositionDescription() + "<vector> tag requires viewportHeight > 0");
        }
    }
}
