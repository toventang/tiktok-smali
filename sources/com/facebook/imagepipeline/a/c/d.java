package com.facebook.imagepipeline.a.c;

import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffXfermode;
import com.bytedance.covode.number.Covode;
import com.facebook.imagepipeline.a.a.b;

public final class d {

    /* renamed from: a  reason: collision with root package name */
    private final com.facebook.imagepipeline.a.a.a f47690a;

    /* renamed from: b  reason: collision with root package name */
    private final a f47691b;

    /* renamed from: c  reason: collision with root package name */
    private final Paint f47692c;

    public interface a {
        static {
            Covode.recordClassIndex(28906);
        }

        com.facebook.common.h.a<Bitmap> a(int i2);
    }

    static {
        Covode.recordClassIndex(28904);
    }

    /* access modifiers changed from: package-private */
    /* renamed from: com.facebook.imagepipeline.a.c.d$1  reason: invalid class name */
    public static /* synthetic */ class AnonymousClass1 {

        /* renamed from: a  reason: collision with root package name */
        static final /* synthetic */ int[] f47693a;

        /* JADX WARNING: Can't wrap try/catch for region: R(8:0|1|2|3|4|5|6|(3:7|8|10)) */
        /* JADX WARNING: Failed to process nested try/catch */
        /* JADX WARNING: Missing exception handler attribute for start block: B:3:0x0017 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:5:0x0022 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:7:0x002d */
        static {
            /*
                r0 = 28905(0x70e9, float:4.0505E-41)
                com.bytedance.covode.number.Covode.recordClassIndex(r0)
                com.facebook.imagepipeline.a.c.d$b[] r0 = com.facebook.imagepipeline.a.c.d.b.values()
                int r0 = r0.length
                int[] r2 = new int[r0]
                com.facebook.imagepipeline.a.c.d.AnonymousClass1.f47693a = r2
                com.facebook.imagepipeline.a.c.d$b r0 = com.facebook.imagepipeline.a.c.d.b.REQUIRED     // Catch:{ NoSuchFieldError -> 0x0017 }
                int r1 = r0.ordinal()     // Catch:{ NoSuchFieldError -> 0x0017 }
                r0 = 1
                r2[r1] = r0     // Catch:{ NoSuchFieldError -> 0x0017 }
            L_0x0017:
                int[] r2 = com.facebook.imagepipeline.a.c.d.AnonymousClass1.f47693a     // Catch:{ NoSuchFieldError -> 0x0022 }
                com.facebook.imagepipeline.a.c.d$b r0 = com.facebook.imagepipeline.a.c.d.b.NOT_REQUIRED     // Catch:{ NoSuchFieldError -> 0x0022 }
                int r1 = r0.ordinal()     // Catch:{ NoSuchFieldError -> 0x0022 }
                r0 = 2
                r2[r1] = r0     // Catch:{ NoSuchFieldError -> 0x0022 }
            L_0x0022:
                int[] r2 = com.facebook.imagepipeline.a.c.d.AnonymousClass1.f47693a     // Catch:{ NoSuchFieldError -> 0x002d }
                com.facebook.imagepipeline.a.c.d$b r0 = com.facebook.imagepipeline.a.c.d.b.ABORT     // Catch:{ NoSuchFieldError -> 0x002d }
                int r1 = r0.ordinal()     // Catch:{ NoSuchFieldError -> 0x002d }
                r0 = 3
                r2[r1] = r0     // Catch:{ NoSuchFieldError -> 0x002d }
            L_0x002d:
                int[] r2 = com.facebook.imagepipeline.a.c.d.AnonymousClass1.f47693a     // Catch:{ NoSuchFieldError -> 0x0038 }
                com.facebook.imagepipeline.a.c.d$b r0 = com.facebook.imagepipeline.a.c.d.b.SKIP     // Catch:{ NoSuchFieldError -> 0x0038 }
                int r1 = r0.ordinal()     // Catch:{ NoSuchFieldError -> 0x0038 }
                r0 = 4
                r2[r1] = r0     // Catch:{ NoSuchFieldError -> 0x0038 }
            L_0x0038:
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: com.facebook.imagepipeline.a.c.d.AnonymousClass1.<clinit>():void");
        }
    }

    /* access modifiers changed from: package-private */
    public enum b {
        REQUIRED,
        NOT_REQUIRED,
        SKIP,
        ABORT;

        static {
            Covode.recordClassIndex(28907);
        }
    }

    private boolean a(int i2) {
        if (i2 == 0) {
            return true;
        }
        com.facebook.imagepipeline.a.a.b a2 = this.f47690a.a(i2);
        com.facebook.imagepipeline.a.a.b a3 = this.f47690a.a(i2 - 1);
        if (a2.f47645f == b.a.NO_BLEND && a(a2)) {
            return true;
        }
        if (a3.f47646g != b.EnumC1178b.DISPOSE_TO_BACKGROUND || !a(a3)) {
            return false;
        }
        return true;
    }

    private boolean a(com.facebook.imagepipeline.a.a.b bVar) {
        if (bVar.f47641b == 0 && bVar.f47642c == 0 && bVar.f47643d == this.f47690a.e() && bVar.f47644e == this.f47690a.f()) {
            return true;
        }
        return false;
    }

    private void a(Canvas canvas, com.facebook.imagepipeline.a.a.b bVar) {
        canvas.drawRect((float) bVar.f47641b, (float) bVar.f47642c, (float) (bVar.f47641b + bVar.f47643d), (float) (bVar.f47642c + bVar.f47644e), this.f47692c);
    }

    public d(com.facebook.imagepipeline.a.a.a aVar, a aVar2) {
        this.f47690a = aVar;
        this.f47691b = aVar2;
        Paint paint = new Paint();
        this.f47692c = paint;
        paint.setColor(0);
        paint.setStyle(Paint.Style.FILL);
        paint.setXfermode(new PorterDuffXfermode(PorterDuff.Mode.SRC));
    }

    private int a(int i2, Canvas canvas) {
        b bVar;
        while (i2 >= 0) {
            com.facebook.imagepipeline.a.a.b a2 = this.f47690a.a(i2);
            b.EnumC1178b bVar2 = a2.f47646g;
            if (bVar2 == b.EnumC1178b.DISPOSE_DO_NOT) {
                bVar = b.REQUIRED;
            } else if (bVar2 == b.EnumC1178b.DISPOSE_TO_BACKGROUND) {
                if (a(a2)) {
                    bVar = b.NOT_REQUIRED;
                } else {
                    bVar = b.REQUIRED;
                }
            } else if (bVar2 == b.EnumC1178b.DISPOSE_TO_PREVIOUS) {
                bVar = b.SKIP;
            } else {
                bVar = b.ABORT;
            }
            int i3 = AnonymousClass1.f47693a[bVar.ordinal()];
            if (i3 == 1) {
                com.facebook.imagepipeline.a.a.b a3 = this.f47690a.a(i2);
                com.facebook.common.h.a<Bitmap> a4 = this.f47691b.a(i2);
                if (a4 != null) {
                    try {
                        canvas.drawBitmap(a4.a(), 0.0f, 0.0f, (Paint) null);
                        if (a3.f47646g == b.EnumC1178b.DISPOSE_TO_BACKGROUND) {
                            a(canvas, a3);
                        }
                        return i2 + 1;
                    } finally {
                        a4.close();
                    }
                } else if (a(i2)) {
                    return i2;
                }
            } else if (i3 == 2) {
                return i2 + 1;
            } else {
                if (i3 == 3) {
                    return i2;
                }
            }
            i2--;
        }
        return 0;
    }

    public final void a(int i2, Bitmap bitmap) {
        int i3;
        Canvas canvas = new Canvas(bitmap);
        canvas.drawColor(0, PorterDuff.Mode.SRC);
        if (!a(i2)) {
            i3 = a(i2 - 1, canvas);
        } else {
            i3 = i2;
        }
        while (i3 < i2) {
            com.facebook.imagepipeline.a.a.b a2 = this.f47690a.a(i3);
            b.EnumC1178b bVar = a2.f47646g;
            if (bVar != b.EnumC1178b.DISPOSE_TO_PREVIOUS) {
                if (a2.f47645f == b.a.NO_BLEND) {
                    a(canvas, a2);
                }
                this.f47690a.a(i3, canvas);
                if (bVar == b.EnumC1178b.DISPOSE_TO_BACKGROUND) {
                    a(canvas, a2);
                }
            }
            i3++;
        }
        com.facebook.imagepipeline.a.a.b a3 = this.f47690a.a(i2);
        if (a3.f47645f == b.a.NO_BLEND) {
            a(canvas, a3);
        }
        this.f47690a.a(i2, canvas);
    }
}
