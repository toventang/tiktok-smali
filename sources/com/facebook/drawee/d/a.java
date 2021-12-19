package com.facebook.drawee.d;

import android.graphics.Canvas;
import android.graphics.ColorFilter;
import android.graphics.Matrix;
import android.graphics.Paint;
import android.graphics.Rect;
import android.graphics.RectF;
import android.graphics.drawable.Drawable;
import com.bytedance.covode.number.Covode;
import com.facebook.drawee.d.a.b;
import com.facebook.drawee.e.q;

public final class a extends Drawable implements b {

    /* renamed from: a  reason: collision with root package name */
    public int f47334a;

    /* renamed from: b  reason: collision with root package name */
    public String f47335b;

    /* renamed from: c  reason: collision with root package name */
    public q.b f47336c;

    /* renamed from: d  reason: collision with root package name */
    public long f47337d;

    /* renamed from: e  reason: collision with root package name */
    private String f47338e;

    /* renamed from: f  reason: collision with root package name */
    private String f47339f;

    /* renamed from: g  reason: collision with root package name */
    private int f47340g;

    /* renamed from: h  reason: collision with root package name */
    private int f47341h;

    /* renamed from: i  reason: collision with root package name */
    private int f47342i;

    /* renamed from: j  reason: collision with root package name */
    private int f47343j;

    /* renamed from: k  reason: collision with root package name */
    private int f47344k = 80;

    /* renamed from: l  reason: collision with root package name */
    private final Paint f47345l = new Paint(1);

    /* renamed from: m  reason: collision with root package name */
    private final Matrix f47346m = new Matrix();
    private final Rect n = new Rect();
    private final RectF o = new RectF();
    private int p;
    private int q;
    private int r;
    private int s;
    private int t;
    private String u;

    static {
        Covode.recordClassIndex(28758);
    }

    public final int getOpacity() {
        return -3;
    }

    public final void setAlpha(int i2) {
    }

    public final void setColorFilter(ColorFilter colorFilter) {
    }

    public a() {
        a();
    }

    public final void a() {
        this.f47340g = -1;
        this.f47341h = -1;
        this.f47334a = -1;
        this.f47342i = -1;
        this.f47343j = -1;
        this.f47335b = null;
        a((String) null);
        this.f47337d = -1;
        this.u = null;
        invalidateSelf();
    }

    public final void b(String str) {
        this.u = str;
        invalidateSelf();
    }

    @Override // com.facebook.drawee.d.a.b
    public final void a(long j2) {
        this.f47337d = j2;
        invalidateSelf();
    }

    public final void a(String str) {
        if (str == null) {
            str = "none";
        }
        this.f47338e = str;
        invalidateSelf();
    }

    /* access modifiers changed from: protected */
    public final void onBoundsChange(Rect rect) {
        int i2;
        super.onBoundsChange(rect);
        int min = Math.min(40, Math.max(10, Math.min(rect.width() / 8, rect.height() / 9)));
        this.f47345l.setTextSize((float) min);
        int i3 = min + 8;
        this.r = i3;
        if (this.f47344k == 80) {
            this.r = i3 * -1;
        }
        this.p = rect.left + 10;
        if (this.f47344k == 80) {
            i2 = rect.bottom - 10;
        } else {
            i2 = rect.top + 10 + 10;
        }
        this.q = i2;
    }

    /* JADX WARNING: Removed duplicated region for block: B:12:0x00eb  */
    /* JADX WARNING: Removed duplicated region for block: B:15:0x00f8  */
    /* JADX WARNING: Removed duplicated region for block: B:18:0x0111  */
    /* JADX WARNING: Removed duplicated region for block: B:21:0x0122  */
    /* JADX WARNING: Removed duplicated region for block: B:24:0x0133  */
    /* JADX WARNING: Removed duplicated region for block: B:25:0x013d  */
    /* JADX WARNING: Removed duplicated region for block: B:40:? A[RETURN, SYNTHETIC] */
    /* JADX WARNING: Removed duplicated region for block: B:9:0x0097  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void draw(android.graphics.Canvas r22) {
        /*
        // Method dump skipped, instructions count: 474
        */
        throw new UnsupportedOperationException("Method not decompiled: com.facebook.drawee.d.a.draw(android.graphics.Canvas):void");
    }

    public final void a(int i2, int i3) {
        this.f47340g = i2;
        this.f47341h = i3;
        invalidateSelf();
    }

    private void a(Canvas canvas, String str, Object... objArr) {
        canvas.drawText(com.a.a(str, objArr), (float) this.s, (float) this.t, this.f47345l);
        this.t += this.r;
    }
}
