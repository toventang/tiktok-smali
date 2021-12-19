package com.lynx.tasm.image.b;

import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.Matrix;
import android.graphics.Paint;
import android.graphics.Rect;
import com.bytedance.covode.number.Covode;
import com.lynx.tasm.image.b;
import com.lynx.tasm.image.d;

/* access modifiers changed from: package-private */
public final class g extends d {

    /* renamed from: b  reason: collision with root package name */
    private final Matrix f56705b = new Matrix();

    /* renamed from: c  reason: collision with root package name */
    private final Rect f56706c = new Rect();

    /* renamed from: d  reason: collision with root package name */
    private final Rect f56707d = new Rect();

    static {
        Covode.recordClassIndex(35338);
    }

    public g() {
        super(null);
    }

    /* renamed from: com.lynx.tasm.image.b.g$1  reason: invalid class name */
    static /* synthetic */ class AnonymousClass1 {

        /* renamed from: a  reason: collision with root package name */
        static final /* synthetic */ int[] f56708a;

        /* JADX WARNING: Can't wrap try/catch for region: R(8:0|1|2|3|4|5|6|8) */
        /* JADX WARNING: Code restructure failed: missing block: B:9:?, code lost:
            return;
         */
        /* JADX WARNING: Failed to process nested try/catch */
        /* JADX WARNING: Missing exception handler attribute for start block: B:3:0x0018 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:5:0x0023 */
        static {
            /*
                r0 = 35339(0x8a0b, float:4.952E-41)
                com.bytedance.covode.number.Covode.recordClassIndex(r0)
                com.lynx.tasm.image.b$b[] r0 = com.lynx.tasm.image.b.EnumC1270b.values()
                int r0 = r0.length
                int[] r2 = new int[r0]
                com.lynx.tasm.image.b.g.AnonymousClass1.f56708a = r2
                com.lynx.tasm.image.b$b r0 = com.lynx.tasm.image.b.EnumC1270b.ASPECT_FIT     // Catch:{ NoSuchFieldError -> 0x0018 }
                int r1 = r0.ordinal()     // Catch:{ NoSuchFieldError -> 0x0018 }
                r0 = 1
                r2[r1] = r0     // Catch:{ NoSuchFieldError -> 0x0018 }
            L_0x0018:
                int[] r2 = com.lynx.tasm.image.b.g.AnonymousClass1.f56708a     // Catch:{ NoSuchFieldError -> 0x0023 }
                com.lynx.tasm.image.b$b r0 = com.lynx.tasm.image.b.EnumC1270b.ASPECT_FILL     // Catch:{ NoSuchFieldError -> 0x0023 }
                int r1 = r0.ordinal()     // Catch:{ NoSuchFieldError -> 0x0023 }
                r0 = 2
                r2[r1] = r0     // Catch:{ NoSuchFieldError -> 0x0023 }
            L_0x0023:
                int[] r2 = com.lynx.tasm.image.b.g.AnonymousClass1.f56708a     // Catch:{ NoSuchFieldError -> 0x002e }
                com.lynx.tasm.image.b$b r0 = com.lynx.tasm.image.b.EnumC1270b.SCALE_TO_FILL     // Catch:{ NoSuchFieldError -> 0x002e }
                int r1 = r0.ordinal()     // Catch:{ NoSuchFieldError -> 0x002e }
                r0 = 3
                r2[r1] = r0     // Catch:{ NoSuchFieldError -> 0x002e }
            L_0x002e:
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: com.lynx.tasm.image.b.g.AnonymousClass1.<clinit>():void");
        }
    }

    @Override // com.lynx.tasm.image.d
    public final void b(Canvas canvas, Bitmap bitmap, b bVar) {
        boolean z;
        float f2;
        int i2 = bVar.f56686l;
        int i3 = bVar.f56687m;
        int i4 = bVar.n;
        int i5 = bVar.o;
        int i6 = bVar.f56678d;
        int i7 = bVar.f56679e;
        if (i2 == 0 && i3 == 0 && i4 == 0 && i5 == 0) {
            z = false;
        } else {
            z = true;
            i6 = Math.max(0, (i6 - i2) - i4);
            i7 = Math.max(0, (i7 - i3) - i5);
            canvas.save();
            canvas.translate((float) i2, (float) i3);
            canvas.clipRect(0, 0, i6, i7);
        }
        float[] fArr = bVar.f56680f;
        if (fArr != null) {
            int width = bitmap.getWidth();
            int height = bitmap.getHeight();
            float f3 = (float) height;
            int ceil = (int) Math.ceil((double) (fArr[0] * f3));
            float f4 = (float) width;
            int floor = (int) Math.floor((double) (fArr[1] * f4));
            int floor2 = (int) Math.floor((double) (fArr[2] * f3));
            int ceil2 = (int) Math.ceil((double) (fArr[3] * f4));
            this.f56706c.left = 0;
            this.f56706c.top = 0;
            this.f56706c.right = ceil2;
            this.f56706c.bottom = ceil;
            Rect rect = this.f56706c;
            canvas.drawBitmap(bitmap, rect, rect, (Paint) null);
            int i8 = width - floor;
            this.f56706c.left = i8;
            this.f56706c.top = 0;
            this.f56706c.right = width;
            this.f56706c.bottom = ceil;
            int i9 = i6 - floor;
            this.f56707d.left = i9;
            this.f56707d.top = 0;
            this.f56707d.right = i6;
            this.f56707d.bottom = ceil;
            canvas.drawBitmap(bitmap, this.f56706c, this.f56707d, (Paint) null);
            this.f56706c.left = i8;
            int i10 = height - floor2;
            this.f56706c.top = i10;
            this.f56706c.right = width;
            this.f56706c.bottom = height;
            this.f56707d.left = i9;
            int i11 = i7 - floor2;
            this.f56707d.top = i11;
            this.f56707d.right = i6;
            this.f56707d.bottom = i7;
            canvas.drawBitmap(bitmap, this.f56706c, this.f56707d, (Paint) null);
            this.f56706c.left = 0;
            this.f56706c.top = i10;
            this.f56706c.right = ceil2;
            this.f56706c.bottom = height;
            this.f56707d.left = 0;
            this.f56707d.top = i11;
            this.f56707d.right = ceil2;
            this.f56707d.bottom = i7;
            canvas.drawBitmap(bitmap, this.f56706c, this.f56707d, (Paint) null);
            this.f56706c.left = ceil2;
            this.f56706c.top = 0;
            this.f56706c.right = i8;
            this.f56706c.bottom = ceil;
            this.f56707d.left = ceil2;
            this.f56707d.top = 0;
            this.f56707d.right = i9;
            this.f56707d.bottom = ceil;
            canvas.drawBitmap(bitmap, this.f56706c, this.f56707d, (Paint) null);
            this.f56706c.left = i8;
            this.f56706c.top = ceil;
            this.f56706c.right = width;
            this.f56706c.bottom = i10;
            this.f56707d.left = i9;
            this.f56707d.top = ceil;
            this.f56707d.right = i6;
            this.f56707d.bottom = i11;
            canvas.drawBitmap(bitmap, this.f56706c, this.f56707d, (Paint) null);
            this.f56706c.left = ceil2;
            this.f56706c.top = i10;
            this.f56706c.right = i8;
            this.f56706c.bottom = height;
            this.f56707d.left = ceil2;
            this.f56707d.top = i11;
            this.f56707d.right = i9;
            this.f56707d.bottom = i7;
            canvas.drawBitmap(bitmap, this.f56706c, this.f56707d, (Paint) null);
            this.f56706c.left = 0;
            this.f56706c.top = ceil;
            this.f56706c.right = ceil2;
            this.f56706c.bottom = i10;
            this.f56707d.left = 0;
            this.f56707d.top = ceil;
            this.f56707d.right = ceil2;
            this.f56707d.bottom = i11;
            canvas.drawBitmap(bitmap, this.f56706c, this.f56707d, (Paint) null);
            this.f56706c.left = ceil2;
            this.f56706c.top = ceil;
            this.f56706c.right = i8;
            this.f56706c.bottom = i10;
            this.f56707d.left = ceil2;
            this.f56707d.top = ceil;
            this.f56707d.right = i9;
            this.f56707d.bottom = i11;
            canvas.drawBitmap(bitmap, this.f56706c, this.f56707d, (Paint) null);
        } else {
            this.f56705b.reset();
            int width2 = bitmap.getWidth();
            int height2 = bitmap.getHeight();
            int i12 = AnonymousClass1.f56708a[bVar.f56676b.ordinal()];
            float f5 = 1.0f;
            if (i12 == 1) {
                f5 = Math.min(((float) i6) / ((float) width2), ((float) i7) / ((float) height2));
                f2 = f5;
            } else if (i12 == 2) {
                f5 = Math.max(((float) i6) / ((float) width2), ((float) i7) / ((float) height2));
                f2 = f5;
            } else if (i12 != 3) {
                f2 = 1.0f;
            } else {
                f5 = ((float) i6) / ((float) width2);
                f2 = ((float) i7) / ((float) height2);
            }
            this.f56705b.setTranslate(((float) (i6 - width2)) / 2.0f, ((float) (i7 - height2)) / 2.0f);
            this.f56705b.preScale(f5, f2, ((float) width2) / 2.0f, ((float) height2) / 2.0f);
            canvas.drawBitmap(bitmap, this.f56705b, null);
        }
        if (z) {
            canvas.restore();
        }
    }
}
