package com.lynx.tasm.behavior.ui.utils;

import android.graphics.Canvas;
import android.graphics.ColorFilter;
import android.graphics.Outline;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.PathEffect;
import android.graphics.PointF;
import android.graphics.Rect;
import android.graphics.RectF;
import android.graphics.Region;
import android.graphics.drawable.Drawable;
import android.os.Build;
import com.bytedance.covode.number.Covode;
import com.lynx.tasm.behavior.j;
import com.lynx.tasm.behavior.shadow.g;
import com.lynx.tasm.behavior.ui.a.d;
import com.lynx.tasm.behavior.ui.utils.b;
import com.lynx.tasm.utils.c;
import java.util.Map;

public class BackgroundDrawable extends Drawable {

    /* renamed from: a  reason: collision with root package name */
    public f f56366a;

    /* renamed from: b  reason: collision with root package name */
    public c[] f56367b;

    /* renamed from: c  reason: collision with root package name */
    public b f56368c;

    /* renamed from: d  reason: collision with root package name */
    public boolean f56369d = true;

    /* renamed from: e  reason: collision with root package name */
    public int f56370e = 0;

    /* renamed from: f  reason: collision with root package name */
    public d f56371f = null;

    /* renamed from: g  reason: collision with root package name */
    public b f56372g;

    /* renamed from: h  reason: collision with root package name */
    public int f56373h;

    /* renamed from: i  reason: collision with root package name */
    private f f56374i;

    /* renamed from: j  reason: collision with root package name */
    private f f56375j;

    /* renamed from: k  reason: collision with root package name */
    private f f56376k;

    /* renamed from: l  reason: collision with root package name */
    private PathEffect f56377l;

    /* renamed from: m  reason: collision with root package name */
    private b f56378m;
    private Map<b.a, b> n;
    private Path o;
    private Path p;
    private PointF q;
    private PointF r;
    private PointF s;
    private PointF t;
    private final Paint u = new Paint(1);
    private int v = 255;
    private final j w;
    private float x;

    static {
        Covode.recordClassIndex(35181);
    }

    private static int a(float f2, float f3) {
        return ((((int) f2) << 24) & -16777216) | (((int) f3) & 16777215);
    }

    private static int a(int i2) {
        return (i2 & -16777216) | ((16711422 & i2) >> 1);
    }

    public void setColorFilter(ColorFilter colorFilter) {
    }

    public int getAlpha() {
        return this.v;
    }

    public final void a(int i2, float f2) {
        if (this.f56374i == null) {
            this.f56374i = new f();
        }
        if (!c.a(this.f56374i.f56417a[i2], f2)) {
            this.f56374i.a(i2, f2);
            if (i2 == 0 || i2 == 1 || i2 == 2 || i2 == 3 || i2 == 4 || i2 == 5 || i2 == 8) {
                this.f56369d = true;
            }
            invalidateSelf();
        }
    }

    public final void a(int i2, b.a aVar) {
        if (i2 > 0 && i2 <= 8) {
            b bVar = this.f56372g;
            if (bVar == null) {
                this.f56372g = new b();
                c();
            } else {
                bVar.f56399d = null;
            }
            b bVar2 = this.f56372g;
            int i3 = i2 - 1;
            if (i3 >= 0 && i3 < 8) {
                if (bVar2.f56398c == null) {
                    bVar2.f56398c = new b.a[8];
                }
                if (aVar == null) {
                    aVar = new b.a();
                }
                b.a aVar2 = bVar2.f56398c[i3];
                if (aVar2 == null || !c.a(aVar.f56403a, aVar2.f56403a) || !c.a(aVar.f56404b, aVar2.f56404b) || aVar.f56405c != aVar2.f56405c || aVar.f56406d != aVar2.f56406d) {
                    bVar2.f56398c[i3] = aVar;
                    this.f56369d = true;
                    invalidateSelf();
                }
            }
        }
    }

    public final boolean a() {
        int i2 = 0;
        if (this.f56372g == null) {
            return false;
        }
        if (!this.f56369d) {
            return true;
        }
        Rect bounds = getBounds();
        if (bounds.width() == 0 || bounds.height() == 0) {
            return false;
        }
        this.f56369d = false;
        RectF b2 = b();
        c();
        b bVar = this.f56372g;
        float[] a2 = bVar != null ? bVar.a() : null;
        if (this.f56368c == null) {
            this.f56368c = new b();
        }
        this.f56368c.a(bounds, a2, b2, 1.0f);
        if (this.f56378m == null) {
            this.f56378m = new b();
        }
        this.f56378m.a(bounds, a2, b2, 0.0f);
        b bVar2 = this.f56372g;
        if (bVar2 != null && bVar2.b()) {
            a(b.a.CENTER, bounds, a2, b2);
            if (this.f56367b != null) {
                boolean z = false;
                boolean z2 = false;
                do {
                    c cVar = this.f56367b[i2];
                    if (cVar != null) {
                        if (cVar == c.DOUBLE) {
                            z = true;
                        } else if (cVar == c.GROOVE || cVar == c.RIDGE) {
                            z2 = true;
                        }
                    }
                    i2++;
                } while (i2 <= 8);
                if (z) {
                    a(b.a.INNER3, bounds, a2, b2);
                    a(b.a.OUTER3, bounds, a2, b2);
                }
                if (z2) {
                    a(b.a.INNER2, bounds, a2, b2);
                    a(b.a.OUTER2, bounds, a2, b2);
                }
            }
        }
        Path path = this.o;
        if (path == null) {
            this.o = new Path();
        } else {
            path.reset();
        }
        this.o.addRoundRect(new RectF(bounds), b.a(a2, b2, -0.5f), Path.Direction.CW);
        d();
        return true;
    }

    private void a(Canvas canvas, int i2, float f2, int i3, int i4, boolean z) {
        this.u.setPathEffect(null);
        this.u.setStyle(Paint.Style.STROKE);
        this.u.setStrokeWidth(f2);
        boolean z2 = true;
        if (!(i2 == 1 || i2 == 0)) {
            z2 = false;
        }
        this.u.setColor(d.a(z2 ? i4 : i3, this.v));
        b a2 = a(z ? b.a.OUTER3 : b.a.OUTER2);
        if (a2 != null) {
            a2.a(canvas, this.u);
        }
        Paint paint = this.u;
        if (!z2) {
            i3 = i4;
        }
        paint.setColor(d.a(i3, this.v));
        b a3 = a(z ? b.a.INNER3 : b.a.INNER2);
        if (a3 != null) {
            a3.a(canvas, this.u);
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:22:0x007a, code lost:
        if (r5 == null) goto L_0x000d;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private void a(android.graphics.Canvas r18, int r19, int r20, float r21, float r22) {
        /*
        // Method dump skipped, instructions count: 192
        */
        throw new UnsupportedOperationException("Method not decompiled: com.lynx.tasm.behavior.ui.utils.BackgroundDrawable.a(android.graphics.Canvas, int, int, float, float):void");
    }

    public final void a(int i2, float f2, float f3) {
        if (this.f56375j == null) {
            this.f56375j = new f(0.0f);
        }
        if (!c.a(this.f56375j.f56417a[i2], f2)) {
            this.f56375j.a(i2, f2);
            invalidateSelf();
        }
        if (this.f56376k == null) {
            this.f56376k = new f(255.0f);
        }
        if (!c.a(this.f56376k.f56417a[i2], f3)) {
            this.f56376k.a(i2, f3);
            invalidateSelf();
        }
    }

    public int getOpacity() {
        int a2 = d.a(this.f56370e, this.v) >>> 24;
        if (a2 == 255) {
            return -1;
        }
        if (a2 == 0) {
            return -2;
        }
        return -3;
    }

    private void c() {
        if (this.f56372g != null) {
            Rect bounds = getBounds();
            int i2 = 0;
            if (this.f56373h == 1) {
                i2 = 0 | b.f56396a;
            }
            this.f56372g.a(i2);
            this.f56372g.a((float) bounds.width(), (float) bounds.height());
        }
    }

    private boolean e() {
        c cVar;
        c cVar2;
        c cVar3;
        c[] cVarArr = this.f56367b;
        if (cVarArr == null) {
            return true;
        }
        c cVar4 = cVarArr[8];
        if (cVarArr[0] != null) {
            cVar = cVarArr[0];
        } else {
            cVar = cVar4;
        }
        if (cVarArr[2] != null) {
            cVar2 = cVarArr[2];
        } else {
            cVar2 = cVar4;
        }
        if (cVar2 != cVar) {
            return false;
        }
        if (cVarArr[1] != null) {
            cVar3 = cVarArr[1];
        } else {
            cVar3 = cVar4;
        }
        if (cVar3 != cVar) {
            return false;
        }
        if (cVarArr[3] != null) {
            cVar4 = cVarArr[3];
        }
        if (cVar4 != cVar) {
            return false;
        }
        if (cVar == null || cVar.isSolidDashedOrDotted()) {
            return true;
        }
        return false;
    }

    public static class b {

        /* renamed from: a  reason: collision with root package name */
        public RectF f56382a;

        /* renamed from: b  reason: collision with root package name */
        public float[] f56383b;

        /* renamed from: c  reason: collision with root package name */
        public Path f56384c;

        /* renamed from: d  reason: collision with root package name */
        public boolean f56385d;

        static {
            Covode.recordClassIndex(35184);
        }

        /* access modifiers changed from: package-private */
        public enum a {
            CENTER,
            INNER2,
            OUTER2,
            INNER3,
            OUTER3;

            static {
                Covode.recordClassIndex(35185);
            }
        }

        private static boolean a(float[] fArr) {
            for (int i2 = 2; i2 <= 6; i2 += 2) {
                float f2 = fArr[i2] - fArr[0];
                if (f2 <= 1.0E-4f && f2 >= -1.0E-4f) {
                    float f3 = fArr[i2 + 1] - fArr[1];
                    if (f3 <= 1.0E-4f && f3 >= -1.0E-4f) {
                    }
                }
                return false;
            }
            return true;
        }

        public final void a(Canvas canvas, Paint paint) {
            if (this.f56385d) {
                RectF rectF = this.f56382a;
                float[] fArr = this.f56383b;
                canvas.drawRoundRect(rectF, fArr[0], fArr[1], paint);
                return;
            }
            canvas.drawPath(this.f56384c, paint);
        }

        public static float[] a(float[] fArr, RectF rectF, float f2) {
            return new float[]{Math.max(fArr[0] - (rectF.left * f2), 0.0f), Math.max(fArr[1] - (rectF.top * f2), 0.0f), Math.max(fArr[2] - (rectF.right * f2), 0.0f), Math.max(fArr[3] - (rectF.top * f2), 0.0f), Math.max(fArr[4] - (rectF.right * f2), 0.0f), Math.max(fArr[5] - (rectF.bottom * f2), 0.0f), Math.max(fArr[6] - (rectF.left * f2), 0.0f), Math.max(fArr[7] - (rectF.bottom * f2), 0.0f)};
        }

        public final void a(Rect rect, float[] fArr, RectF rectF, float f2) {
            if (this.f56382a == null) {
                this.f56382a = new RectF();
            }
            this.f56382a.left = ((float) rect.left) + (rectF.left * f2);
            this.f56382a.top = ((float) rect.top) + (rectF.top * f2);
            this.f56382a.right = ((float) rect.right) - (rectF.right * f2);
            this.f56382a.bottom = ((float) rect.bottom) - (rectF.bottom * f2);
            float[] a2 = a(fArr, rectF, f2);
            this.f56383b = a2;
            this.f56385d = a(a2);
            Path path = this.f56384c;
            if (path == null) {
                this.f56384c = new Path();
            } else {
                path.reset();
            }
            this.f56384c.addRoundRect(this.f56382a, this.f56383b, Path.Direction.CW);
        }
    }

    public enum a {
        TOP_LEFT,
        TOP_RIGHT,
        BOTTOM_RIGHT,
        BOTTOM_LEFT,
        TOP_START,
        TOP_END,
        BOTTOM_START,
        BOTTOM_END;

        static {
            Covode.recordClassIndex(35183);
        }
    }

    public final RectF b() {
        float a2 = a(0.0f, 8);
        float a3 = a(a2, 1);
        float a4 = a(a2, 3);
        float a5 = a(a2, 0);
        float a6 = a(a2, 2);
        Rect bounds = getBounds();
        float f2 = a5 + a6;
        if (f2 > ((float) bounds.width()) && bounds.width() > 0) {
            float width = ((float) bounds.width()) / f2;
            a5 *= width;
            a6 *= width;
        }
        float f3 = a3 + a4;
        if (f3 > ((float) bounds.height()) && bounds.height() > 0) {
            float height = ((float) bounds.height()) / f3;
            a3 *= height;
            a4 *= height;
        }
        return new RectF(a5, a3, a6, a4);
    }

    /* access modifiers changed from: package-private */
    /* renamed from: com.lynx.tasm.behavior.ui.utils.BackgroundDrawable$1  reason: invalid class name */
    public static /* synthetic */ class AnonymousClass1 {

        /* renamed from: a  reason: collision with root package name */
        static final /* synthetic */ int[] f56379a;

        /* renamed from: b  reason: collision with root package name */
        static final /* synthetic */ int[] f56380b;

        /* JADX WARNING: Can't wrap try/catch for region: R(30:0|(2:1|2)|3|(2:5|6)|7|(2:9|10)|11|(2:13|14)|15|17|18|19|20|21|22|23|24|25|26|(2:27|28)|29|31|32|33|34|35|36|37|38|(3:39|40|42)) */
        /* JADX WARNING: Can't wrap try/catch for region: R(31:0|(2:1|2)|3|5|6|7|(2:9|10)|11|(2:13|14)|15|17|18|19|20|21|22|23|24|25|26|(2:27|28)|29|31|32|33|34|35|36|37|38|(3:39|40|42)) */
        /* JADX WARNING: Can't wrap try/catch for region: R(34:0|1|2|3|5|6|7|(2:9|10)|11|13|14|15|17|18|19|20|21|22|23|24|25|26|27|28|29|31|32|33|34|35|36|37|38|(3:39|40|42)) */
        /* JADX WARNING: Can't wrap try/catch for region: R(36:0|1|2|3|5|6|7|(2:9|10)|11|13|14|15|17|18|19|20|21|22|23|24|25|26|27|28|29|31|32|33|34|35|36|37|38|39|40|42) */
        /* JADX WARNING: Can't wrap try/catch for region: R(37:0|1|2|3|5|6|7|9|10|11|13|14|15|17|18|19|20|21|22|23|24|25|26|27|28|29|31|32|33|34|35|36|37|38|39|40|42) */
        /* JADX WARNING: Failed to process nested try/catch */
        /* JADX WARNING: Missing exception handler attribute for start block: B:19:0x0044 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:21:0x004f */
        /* JADX WARNING: Missing exception handler attribute for start block: B:23:0x005a */
        /* JADX WARNING: Missing exception handler attribute for start block: B:25:0x0066 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:27:0x0072 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:33:0x008f */
        /* JADX WARNING: Missing exception handler attribute for start block: B:35:0x0099 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:37:0x00a3 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:39:0x00ad */
        static {
            /*
            // Method dump skipped, instructions count: 184
            */
            throw new UnsupportedOperationException("Method not decompiled: com.lynx.tasm.behavior.ui.utils.BackgroundDrawable.AnonymousClass1.<clinit>():void");
        }
    }

    private void d() {
        RectF rectF = this.f56368c.f56382a;
        RectF rectF2 = this.f56378m.f56382a;
        float[] fArr = this.f56368c.f56383b;
        if (this.q == null) {
            this.q = new PointF();
        }
        this.q.x = this.f56368c.f56382a.left;
        this.q.y = this.f56368c.f56382a.top;
        a((double) rectF.left, (double) rectF.top, (double) (rectF.left + (fArr[0] * 2.0f)), (double) (rectF.top + (fArr[1] * 2.0f)), (double) rectF2.left, (double) rectF2.top, (double) rectF.left, (double) rectF.top, this.q);
        if (this.t == null) {
            this.t = new PointF();
        }
        this.t.x = rectF.left;
        this.t.y = rectF.bottom;
        a((double) rectF.left, (double) (rectF.bottom - (fArr[6] * 2.0f)), (double) (rectF.left + (fArr[7] * 2.0f)), (double) rectF.bottom, (double) rectF2.left, (double) rectF2.bottom, (double) rectF.left, (double) rectF.bottom, this.t);
        if (this.r == null) {
            this.r = new PointF();
        }
        this.r.x = rectF.right;
        this.r.y = rectF.top;
        a((double) (rectF.right - (fArr[2] * 2.0f)), (double) rectF.top, (double) rectF.right, (double) (rectF.top + (fArr[3] * 2.0f)), (double) rectF2.right, (double) rectF2.top, (double) rectF.right, (double) rectF.top, this.r);
        if (this.s == null) {
            this.s = new PointF();
        }
        this.s.x = rectF.right;
        this.s.y = rectF.bottom;
        a((double) (rectF.right - (fArr[4] * 2.0f)), (double) (rectF.bottom - (fArr[5] * 2.0f)), (double) rectF.right, (double) rectF.bottom, (double) rectF2.right, (double) rectF2.bottom, (double) rectF.right, (double) rectF.bottom, this.s);
    }

    public void setColor(int i2) {
        this.f56370e = i2;
        invalidateSelf();
    }

    /* access modifiers changed from: protected */
    public void onBoundsChange(Rect rect) {
        super.onBoundsChange(rect);
        this.f56369d = true;
        this.f56371f.a(rect);
    }

    public void setAlpha(int i2) {
        if (i2 != this.v) {
            this.v = i2;
            invalidateSelf();
        }
    }

    private c b(int i2) {
        c cVar;
        c[] cVarArr = this.f56367b;
        if (cVarArr != null) {
            if (cVarArr[i2] != null) {
                cVar = cVarArr[i2];
            } else {
                cVar = cVarArr[8];
            }
            if (cVar != null) {
                return cVar;
            }
        }
        return c.SOLID;
    }

    private int c(int i2) {
        float f2;
        float f3;
        f fVar = this.f56375j;
        if (fVar != null) {
            f2 = fVar.a(i2);
        } else {
            f2 = 0.0f;
        }
        f fVar2 = this.f56376k;
        if (fVar2 != null) {
            f3 = fVar2.a(i2);
        } else {
            f3 = 255.0f;
        }
        return a(f3, f2);
    }

    private static int a(float f2) {
        if (f2 <= 0.1f || f2 >= 1.0f) {
            return Math.round(f2);
        }
        return 1;
    }

    public void getOutline(Outline outline) {
        Path path;
        if (Build.VERSION.SDK_INT < 21) {
            super.getOutline(outline);
        } else if (this.f56372g == null || !a() || (path = this.o) == null) {
            outline.setRect(getBounds());
        } else {
            outline.setConvexPath(path);
        }
    }

    private b a(b.a aVar) {
        Map<b.a, b> map;
        if (aVar == null || (map = this.n) == null) {
            return null;
        }
        return map.get(aVar);
    }

    /* JADX WARNING: Code restructure failed: missing block: B:162:0x0496, code lost:
        if (r15 != false) goto L_0x0473;
     */
    /* JADX WARNING: Removed duplicated region for block: B:123:0x03c3  */
    /* JADX WARNING: Removed duplicated region for block: B:134:0x03f6  */
    /* JADX WARNING: Removed duplicated region for block: B:140:0x0406  */
    /* JADX WARNING: Removed duplicated region for block: B:15:0x0086  */
    /* JADX WARNING: Removed duplicated region for block: B:18:0x0093  */
    /* JADX WARNING: Removed duplicated region for block: B:21:0x0098  */
    /* JADX WARNING: Removed duplicated region for block: B:27:0x00a5  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void draw(android.graphics.Canvas r58) {
        /*
        // Method dump skipped, instructions count: 1873
        */
        throw new UnsupportedOperationException("Method not decompiled: com.lynx.tasm.behavior.ui.utils.BackgroundDrawable.draw(android.graphics.Canvas):void");
    }

    private float a(float f2, int i2) {
        f fVar = this.f56366a;
        if (fVar == null) {
            return f2;
        }
        float f3 = fVar.f56417a[i2];
        if (g.a(f3)) {
            return f2;
        }
        return f3;
    }

    public BackgroundDrawable(j jVar, float f2) {
        this.w = jVar;
        this.x = f2;
        this.f56371f = new d(jVar, this, f2);
    }

    /* JADX WARNING: Code restructure failed: missing block: B:7:0x000f, code lost:
        if (r3 == null) goto L_0x0011;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private com.lynx.tasm.behavior.ui.utils.BackgroundDrawable.b a(com.lynx.tasm.behavior.ui.utils.BackgroundDrawable.b.a r5, android.graphics.Rect r6, float[] r7, android.graphics.RectF r8) {
        /*
        // Method dump skipped, instructions count: 112
        */
        throw new UnsupportedOperationException("Method not decompiled: com.lynx.tasm.behavior.ui.utils.BackgroundDrawable.a(com.lynx.tasm.behavior.ui.utils.BackgroundDrawable$b$a, android.graphics.Rect, float[], android.graphics.RectF):com.lynx.tasm.behavior.ui.utils.BackgroundDrawable$b");
    }

    private static void a(double d2, double d3, double d4, double d5, double d6, double d7, double d8, double d9, PointF pointF) {
        double d10 = (d2 + d4) / 2.0d;
        double d11 = (d3 + d5) / 2.0d;
        double d12 = d6 - d10;
        double d13 = d7 - d11;
        double abs = Math.abs(d4 - d2) / 2.0d;
        double abs2 = Math.abs(d5 - d3) / 2.0d;
        double d14 = ((d9 - d11) - d13) / ((d8 - d10) - d12);
        double d15 = d13 - (d12 * d14);
        double d16 = abs2 * abs2;
        double d17 = abs * abs;
        double d18 = d16 + (d17 * d14 * d14);
        double d19 = abs * 2.0d * abs * d15 * d14;
        double d20 = (-(d17 * ((d15 * d15) - d16))) / d18;
        double d21 = d18 * 2.0d;
        double sqrt = ((-d19) / d21) - Math.sqrt(d20 + Math.pow(d19 / d21, 2.0d));
        double d22 = sqrt + d10;
        double d23 = (d14 * sqrt) + d15 + d11;
        if (!Double.isNaN(d22) && !Double.isNaN(d23)) {
            pointF.x = (float) d22;
            pointF.y = (float) d23;
        }
    }

    private void a(Canvas canvas, float f2, float f3, float f4, float f5, float f6, float f7, float f8, float f9, boolean z) {
        if (z) {
            b bVar = this.f56378m;
            if (bVar != null) {
                canvas.clipPath(bVar.f56384c, Region.Op.INTERSECT);
            }
            b bVar2 = this.f56368c;
            if (bVar2 != null) {
                canvas.clipPath(bVar2.f56384c, Region.Op.DIFFERENCE);
            }
        }
        if (this.p == null) {
            this.p = new Path();
        }
        this.p.reset();
        this.p.moveTo(f2, f3);
        this.p.lineTo(f4, f5);
        this.p.lineTo(f6, f7);
        this.p.lineTo(f8, f9);
        this.p.lineTo(f2, f3);
        canvas.clipPath(this.p);
    }
}
