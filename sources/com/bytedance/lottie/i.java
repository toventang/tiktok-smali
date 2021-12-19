package com.bytedance.lottie;

import android.animation.ValueAnimator;
import android.graphics.Canvas;
import android.graphics.ColorFilter;
import android.graphics.Matrix;
import android.graphics.drawable.Animatable;
import android.graphics.drawable.Drawable;
import android.os.Build;
import com.bytedance.covode.number.Covode;
import com.bytedance.lottie.b.b;
import com.bytedance.lottie.c.e;
import com.bytedance.lottie.e.q;
import com.bytedance.lottie.f.d;
import com.bytedance.lottie.g.c;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class i extends Drawable implements Animatable, Drawable.Callback {
    private static final String p = i.class.getSimpleName();

    /* renamed from: a  reason: collision with root package name */
    public g f40763a;

    /* renamed from: b  reason: collision with root package name */
    public final d f40764b;

    /* renamed from: c  reason: collision with root package name */
    public float f40765c;

    /* renamed from: d  reason: collision with root package name */
    final ArrayList<a> f40766d;

    /* renamed from: e  reason: collision with root package name */
    b f40767e;

    /* renamed from: f  reason: collision with root package name */
    public String f40768f;

    /* renamed from: g  reason: collision with root package name */
    c f40769g;

    /* renamed from: h  reason: collision with root package name */
    public com.bytedance.lottie.b.a f40770h;

    /* renamed from: i  reason: collision with root package name */
    public b f40771i;

    /* renamed from: j  reason: collision with root package name */
    public t f40772j;

    /* renamed from: k  reason: collision with root package name */
    public boolean f40773k;

    /* renamed from: l  reason: collision with root package name */
    public com.bytedance.lottie.c.c.b f40774l;

    /* renamed from: m  reason: collision with root package name */
    boolean f40775m;
    public boolean n;
    boolean o;
    private final Matrix q = new Matrix();
    private final Set<Object> r;
    private int s;

    /* access modifiers changed from: package-private */
    public interface a {
        static {
            Covode.recordClassIndex(25014);
        }

        void a();
    }

    public int getOpacity() {
        return -3;
    }

    public void setColorFilter(ColorFilter colorFilter) {
    }

    public int getAlpha() {
        return this.s;
    }

    public void start() {
        d();
    }

    public final void a() {
        b bVar = this.f40767e;
        if (bVar != null) {
            bVar.a();
        }
    }

    public boolean isRunning() {
        return this.f40764b.isRunning();
    }

    static {
        Covode.recordClassIndex(25003);
    }

    public final void h() {
        this.f40766d.clear();
        this.f40764b.cancel();
    }

    public final void i() {
        this.f40766d.clear();
        this.f40764b.g();
    }

    public void invalidateSelf() {
        Drawable.Callback callback = getCallback();
        if (callback != null) {
            callback.invalidateDrawable(this);
        }
    }

    /* access modifiers changed from: package-private */
    public final void b() {
        this.f40774l = new com.bytedance.lottie.c.c.b(this, q.a(this.f40763a), this.f40763a.f40711g, this.f40763a);
    }

    public final void d() {
        if (this.f40774l == null) {
            this.f40766d.add(new a() {
                /* class com.bytedance.lottie.i.AnonymousClass5 */

                static {
                    Covode.recordClassIndex(25009);
                }

                @Override // com.bytedance.lottie.i.a
                public final void a() {
                    i.this.d();
                }
            });
        } else {
            this.f40764b.f();
        }
    }

    public final void e() {
        if (this.f40774l == null) {
            this.f40766d.add(new a() {
                /* class com.bytedance.lottie.i.AnonymousClass6 */

                static {
                    Covode.recordClassIndex(25010);
                }

                @Override // com.bytedance.lottie.i.a
                public final void a() {
                    i.this.e();
                }
            });
        } else {
            this.f40764b.h();
        }
    }

    public final boolean f() {
        if (this.f40772j != null || this.f40763a.f40709e.b() <= 0) {
            return false;
        }
        return true;
    }

    /* access modifiers changed from: package-private */
    public final void g() {
        g gVar = this.f40763a;
        if (gVar != null) {
            float f2 = this.f40765c;
            setBounds(0, 0, (int) (((float) gVar.f40712h.width()) * f2), (int) (((float) this.f40763a.f40712h.height()) * f2));
        }
    }

    public int getIntrinsicHeight() {
        g gVar = this.f40763a;
        if (gVar == null) {
            return -1;
        }
        return (int) (((float) gVar.f40712h.height()) * this.f40765c);
    }

    public int getIntrinsicWidth() {
        g gVar = this.f40763a;
        if (gVar == null) {
            return -1;
        }
        return (int) (((float) gVar.f40712h.width()) * this.f40765c);
    }

    public void stop() {
        this.f40766d.clear();
        d dVar = this.f40764b;
        dVar.c(true);
        dVar.b(dVar.i());
    }

    public i() {
        d dVar = new d();
        this.f40764b = dVar;
        this.f40765c = 1.0f;
        this.r = new HashSet();
        this.f40766d = new ArrayList<>();
        this.s = 255;
        this.n = true;
        this.o = false;
        dVar.addUpdateListener(new ValueAnimator.AnimatorUpdateListener() {
            /* class com.bytedance.lottie.i.AnonymousClass1 */

            static {
                Covode.recordClassIndex(25004);
            }

            public final void onAnimationUpdate(ValueAnimator valueAnimator) {
                if (i.this.f40774l != null) {
                    i.this.f40774l.a(i.this.f40764b.d());
                }
            }
        });
    }

    public final void c() {
        if (this.n) {
            a();
        }
        if (this.f40764b.isRunning()) {
            this.f40764b.cancel();
        }
        this.f40763a = null;
        this.f40774l = null;
        this.f40767e = null;
        this.f40764b.e();
        invalidateSelf();
    }

    public void setAlpha(int i2) {
        this.s = i2;
    }

    public final void d(float f2) {
        this.f40765c = f2;
        g();
    }

    public final void d(int i2) {
        this.f40764b.setRepeatCount(i2);
    }

    public void invalidateDrawable(Drawable drawable) {
        Drawable.Callback callback = getCallback();
        if (callback != null) {
            callback.invalidateDrawable(this);
        }
    }

    public final void a(final float f2) {
        g gVar = this.f40763a;
        if (gVar == null) {
            this.f40766d.add(new a() {
                /* class com.bytedance.lottie.i.AnonymousClass8 */

                static {
                    Covode.recordClassIndex(25012);
                }

                @Override // com.bytedance.lottie.i.a
                public final void a() {
                    i.this.a(f2);
                }
            });
            return;
        }
        float f3 = gVar.f40713i;
        a((int) (f3 + (f2 * (this.f40763a.f40714j - f3))));
    }

    public final void c(final float f2) {
        g gVar = this.f40763a;
        if (gVar == null) {
            this.f40766d.add(new a() {
                /* class com.bytedance.lottie.i.AnonymousClass3 */

                static {
                    Covode.recordClassIndex(25007);
                }

                @Override // com.bytedance.lottie.i.a
                public final void a() {
                    i.this.c(f2);
                }
            });
            return;
        }
        float f3 = gVar.f40713i;
        c((int) (f3 + (f2 * (this.f40763a.f40714j - f3))));
    }

    public final void a(final int i2) {
        if (this.f40763a == null) {
            this.f40766d.add(new a() {
                /* class com.bytedance.lottie.i.AnonymousClass7 */

                static {
                    Covode.recordClassIndex(25011);
                }

                @Override // com.bytedance.lottie.i.a
                public final void a() {
                    i.this.a(i2);
                }
            });
        } else {
            this.f40764b.b(i2);
        }
    }

    public final void b(final float f2) {
        g gVar = this.f40763a;
        if (gVar == null) {
            this.f40766d.add(new a() {
                /* class com.bytedance.lottie.i.AnonymousClass10 */

                static {
                    Covode.recordClassIndex(25005);
                }

                @Override // com.bytedance.lottie.i.a
                public final void a() {
                    i.this.b(f2);
                }
            });
            return;
        }
        float f3 = gVar.f40713i;
        b((int) (f3 + (f2 * (this.f40763a.f40714j - f3))));
    }

    /* JADX WARNING: Code restructure failed: missing block: B:10:0x001c, code lost:
        if (r1 == null) goto L_0x001e;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:12:0x0020, code lost:
        if (r2.f40462a != null) goto L_0x0022;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:14:0x0028, code lost:
        if (r2.f40462a.equals(r1) == false) goto L_0x005c;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:27:0x005e, code lost:
        if (r6.o != false) goto L_0x002a;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:28:0x0060, code lost:
        r6.f40767e.a();
        r6.f40767e = null;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final android.graphics.Bitmap a(java.lang.String r7) {
        /*
        // Method dump skipped, instructions count: 106
        */
        throw new UnsupportedOperationException("Method not decompiled: com.bytedance.lottie.i.a(java.lang.String):android.graphics.Bitmap");
    }

    public final void b(final int i2) {
        if (this.f40763a == null) {
            this.f40766d.add(new a() {
                /* class com.bytedance.lottie.i.AnonymousClass9 */

                static {
                    Covode.recordClassIndex(25013);
                }

                @Override // com.bytedance.lottie.i.a
                public final void a() {
                    i.this.b(i2);
                }
            });
        } else {
            this.f40764b.c(i2);
        }
    }

    public final void c(final int i2) {
        if (this.f40763a == null) {
            this.f40766d.add(new a() {
                /* class com.bytedance.lottie.i.AnonymousClass2 */

                static {
                    Covode.recordClassIndex(25006);
                }

                @Override // com.bytedance.lottie.i.a
                public final void a() {
                    i.this.c(i2);
                }
            });
        } else {
            this.f40764b.a(i2);
        }
    }

    public void draw(Canvas canvas) {
        float f2;
        e.b("Drawable#draw");
        if (this.f40774l != null) {
            float f3 = this.f40765c;
            float min = Math.min(((float) canvas.getWidth()) / ((float) this.f40763a.f40712h.width()), ((float) canvas.getHeight()) / ((float) this.f40763a.f40712h.height()));
            if (f3 > min) {
                f2 = this.f40765c / min;
                if (f2 > 1.0f) {
                    canvas.save();
                    float width = ((float) this.f40763a.f40712h.width()) / 2.0f;
                    float height = ((float) this.f40763a.f40712h.height()) / 2.0f;
                    float f4 = width * min;
                    float f5 = height * min;
                    float f6 = this.f40765c;
                    canvas.translate((width * f6) - f4, (f6 * height) - f5);
                    canvas.scale(f2, f2, f4, f5);
                }
            } else {
                min = f3;
                f2 = 1.0f;
            }
            this.q.reset();
            this.q.preScale(min, min);
            this.f40774l.a(canvas, this.q, this.s);
            e.c("Drawable#draw");
            if (f2 > 1.0f) {
                canvas.restore();
            }
        }
    }

    public final void a(boolean z) {
        if (this.f40773k != z) {
            int i2 = Build.VERSION.SDK_INT;
            this.f40773k = z;
            if (this.f40763a != null) {
                b();
            }
        }
    }

    public void unscheduleDrawable(Drawable drawable, Runnable runnable) {
        Drawable.Callback callback = getCallback();
        if (callback != null) {
            callback.unscheduleDrawable(this, runnable);
        }
    }

    public void scheduleDrawable(Drawable drawable, Runnable runnable, long j2) {
        Drawable.Callback callback = getCallback();
        if (callback != null) {
            callback.scheduleDrawable(this, runnable, j2);
        }
    }

    public final <T> void a(final e eVar, final T t, final c<T> cVar) {
        List<e> arrayList;
        if (this.f40774l == null) {
            this.f40766d.add(new a() {
                /* class com.bytedance.lottie.i.AnonymousClass4 */

                static {
                    Covode.recordClassIndex(25008);
                }

                @Override // com.bytedance.lottie.i.a
                public final void a() {
                    i.this.a(eVar, t, cVar);
                }
            });
            return;
        }
        if (eVar.f40650a != null) {
            eVar.f40650a.a(t, cVar);
        } else {
            if (this.f40774l == null) {
                arrayList = Collections.emptyList();
            } else {
                arrayList = new ArrayList<>();
                this.f40774l.a(eVar, 0, arrayList, new e(new String[0]));
            }
            for (int i2 = 0; i2 < arrayList.size(); i2++) {
                arrayList.get(i2).f40650a.a(t, cVar);
            }
            if (arrayList.isEmpty()) {
                return;
            }
        }
        invalidateSelf();
        if (t == m.w) {
            c(this.f40764b.d());
        }
    }
}
