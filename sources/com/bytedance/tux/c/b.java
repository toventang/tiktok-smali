package com.bytedance.tux.c;

import android.content.Context;
import android.content.res.Resources;
import android.graphics.Canvas;
import android.graphics.Color;
import android.graphics.ColorFilter;
import android.graphics.ColorMatrixColorFilter;
import android.graphics.Paint;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffXfermode;
import android.graphics.Rect;
import android.graphics.drawable.BitmapDrawable;
import android.graphics.drawable.Drawable;
import android.os.Build;
import android.util.TypedValue;
import com.bytedance.covode.number.Covode;
import com.bytedance.tux.b.f;
import com.bytedance.tux.b.g;
import com.bytedance.tux.h.d;
import com.zhiliaoapp.musically.R;
import h.f.b.l;
import h.f.b.m;
import h.h;
import h.i;
import java.util.Map;

public class b extends Drawable {

    /* renamed from: e  reason: collision with root package name */
    public static boolean f44755e;

    /* renamed from: f  reason: collision with root package name */
    public static final a f44756f = new a((byte) 0);

    /* renamed from: a  reason: collision with root package name */
    public Drawable f44757a;

    /* renamed from: b  reason: collision with root package name */
    public boolean f44758b;

    /* renamed from: c  reason: collision with root package name */
    public boolean f44759c;

    /* renamed from: d  reason: collision with root package name */
    public Integer f44760d;

    /* renamed from: g  reason: collision with root package name */
    private final int f44761g;

    /* renamed from: h  reason: collision with root package name */
    private Drawable f44762h;

    /* renamed from: i  reason: collision with root package name */
    private int f44763i;

    /* renamed from: j  reason: collision with root package name */
    private boolean f44764j;

    /* renamed from: k  reason: collision with root package name */
    private final boolean f44765k;

    /* renamed from: l  reason: collision with root package name */
    private final h f44766l = i.a((h.f.a.a) c.f44770a);

    /* renamed from: m  reason: collision with root package name */
    private int f44767m = -1;
    private int n = -1;
    private final C1093b o;
    private int p = -1;
    private int q = -1;

    static {
        Covode.recordClassIndex(27341);
    }

    public int getOpacity() {
        return -1;
    }

    public static final class a {
        static {
            Covode.recordClassIndex(27342);
        }

        private a() {
        }

        public /* synthetic */ a(byte b2) {
            this();
        }
    }

    /* renamed from: com.bytedance.tux.c.b$b  reason: collision with other inner class name */
    public final class C1093b extends Drawable.ConstantState {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ b f44768a;

        /* renamed from: b  reason: collision with root package name */
        private final b f44769b;

        static {
            Covode.recordClassIndex(27343);
        }

        public final int getChangingConfigurations() {
            return 0;
        }

        public final Drawable newDrawable() {
            return this.f44769b;
        }

        public C1093b(b bVar, b bVar2) {
            l.c(bVar2, "");
            this.f44768a = bVar;
            this.f44769b = bVar2;
        }
    }

    public int getIntrinsicHeight() {
        return this.n;
    }

    public int getIntrinsicWidth() {
        return this.f44767m;
    }

    static final class c extends m implements h.f.a.a<PorterDuffXfermode> {

        /* renamed from: a  reason: collision with root package name */
        public static final c f44770a = new c();

        static {
            Covode.recordClassIndex(27344);
        }

        c() {
            super(0);
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        @Override // h.f.a.a
        public final /* synthetic */ PorterDuffXfermode invoke() {
            return new PorterDuffXfermode(PorterDuff.Mode.XOR);
        }
    }

    public final int a() {
        int i2 = this.p;
        if (i2 <= 0) {
            return getBounds().width();
        }
        return i2;
    }

    public final int b() {
        int i2 = this.q;
        if (i2 <= 0) {
            return getBounds().height();
        }
        return i2;
    }

    public Drawable.ConstantState getConstantState() {
        if (Build.VERSION.SDK_INT <= 23) {
            return this.o;
        }
        return null;
    }

    public final boolean c() {
        if (!this.f44764j || !this.f44765k) {
            return false;
        }
        return true;
    }

    public final void a(int i2) {
        this.p = i2;
        this.f44767m = i2;
        invalidateSelf();
    }

    public final void b(int i2) {
        this.q = i2;
        this.n = i2;
        invalidateSelf();
    }

    public final void c(int i2) {
        this.f44760d = Integer.valueOf(i2);
        a(this.f44757a, i2);
        invalidateSelf();
    }

    public void setAlpha(int i2) {
        Drawable drawable = this.f44757a;
        if (drawable != null) {
            drawable.setAlpha(i2);
        }
        Drawable drawable2 = this.f44762h;
        if (drawable2 != null) {
            drawable2.setAlpha(i2);
        }
    }

    public void setColorFilter(ColorFilter colorFilter) {
        Drawable drawable = this.f44757a;
        if (drawable != null) {
            drawable.setColorFilter(colorFilter);
        }
        invalidateSelf();
    }

    private static Drawable a(Drawable drawable) {
        Drawable.ConstantState constantState;
        Drawable newDrawable;
        if (drawable instanceof com.bytedance.h.a) {
            return (Drawable) drawable.getClass().newInstance();
        }
        if (drawable == null || (constantState = drawable.getConstantState()) == null || (newDrawable = constantState.newDrawable()) == null) {
            return null;
        }
        return newDrawable.mutate();
    }

    public final void b(boolean z) {
        this.f44759c = z;
        if (z) {
            Resources system = Resources.getSystem();
            l.a((Object) system, "");
            this.f44763i = h.g.a.a(TypedValue.applyDimension(1, 1.0f, system.getDisplayMetrics()));
            Drawable a2 = a(this.f44757a);
            this.f44762h = a2;
            if (a2 != null) {
                a2.setAlpha(30);
            }
            Drawable drawable = this.f44762h;
            if (drawable != null) {
                drawable.setColorFilter(null);
            }
        } else {
            this.f44762h = null;
        }
        invalidateSelf();
    }

    public final void a(boolean z) {
        this.f44758b = z;
        invalidateSelf();
    }

    public void draw(Canvas canvas) {
        PorterDuffXfermode porterDuffXfermode;
        l.c(canvas, "");
        Drawable drawable = this.f44757a;
        if (drawable != null) {
            int width = getBounds().width();
            int height = getBounds().height();
            boolean c2 = c();
            if (c2) {
                canvas.save();
                canvas.translate((float) width, 0.0f);
                canvas.scale(-1.0f, 1.0f);
            }
            if (a() <= 0 || b() <= 0) {
                drawable.setBounds(getBounds().left, getBounds().top, getBounds().left + width, getBounds().top + height);
            } else {
                drawable.setBounds(getBounds().left + ((width - a()) / 2), getBounds().top + ((height - b()) / 2), getBounds().left + ((width + a()) / 2), getBounds().top + ((height + b()) / 2));
            }
            if (this.f44759c) {
                Rect bounds = drawable.getBounds();
                l.a((Object) bounds, "");
                Drawable drawable2 = this.f44762h;
                if (drawable2 != null) {
                    drawable2.setBounds(bounds.left, bounds.top + this.f44763i, bounds.right, bounds.bottom + this.f44763i);
                }
                Drawable drawable3 = this.f44762h;
                if (drawable3 != null) {
                    drawable3.draw(canvas);
                }
            }
            if (this.f44758b) {
                porterDuffXfermode = (PorterDuffXfermode) this.f44766l.getValue();
            } else {
                porterDuffXfermode = null;
            }
            if (drawable instanceof BitmapDrawable) {
                Paint paint = ((BitmapDrawable) drawable).getPaint();
                l.a((Object) paint, "");
                paint.setXfermode(porterDuffXfermode);
            } else if (drawable instanceof com.bytedance.h.a) {
                ((com.bytedance.h.a) drawable).a(porterDuffXfermode);
            }
            drawable.draw(canvas);
            if (c2) {
                canvas.restore();
            }
        }
    }

    public final void a(Context context, int i2) {
        l.c(context, "");
        Integer a2 = d.a(context, i2);
        if (a2 != null) {
            c(a2.intValue());
        }
    }

    private static void a(Drawable drawable, int i2) {
        if (drawable != null) {
            drawable.setColorFilter(new ColorMatrixColorFilter(new float[]{0.0f, 0.0f, 0.0f, 0.0f, (float) Color.red(i2), 0.0f, 0.0f, 0.0f, 0.0f, (float) Color.green(i2), 0.0f, 0.0f, 0.0f, 0.0f, (float) Color.blue(i2), 0.0f, 0.0f, 0.0f, 1.0f, 0.0f}));
            drawable.setAlpha(Color.alpha(i2));
        }
    }

    public b(Context context, int i2) {
        Drawable drawable;
        Map<Integer, Object> map;
        l.c(context, "");
        com.bytedance.tux.b.b a2 = f.a((int) R.attr.ap8, i2);
        Drawable drawable2 = null;
        if (a2 == null || (map = a2.f44666a) == null) {
            drawable = null;
        } else {
            drawable = null;
            for (Map.Entry<Integer, Object> entry : map.entrySet()) {
                int intValue = entry.getKey().intValue();
                if (intValue == g.r().f44668a) {
                    g.r();
                    Object value = entry.getValue();
                    l.c(value, "");
                    this.f44764j = ((Boolean) value).booleanValue();
                } else if (intValue == g.s().f44668a && f44755e) {
                    g.s();
                    Object value2 = entry.getValue();
                    l.c(value2, "");
                    Object newInstance = h.f.a.a((h.k.c) value2).newInstance();
                    if (newInstance instanceof Drawable) {
                        drawable = (Drawable) newInstance;
                    }
                }
            }
        }
        this.f44765k = com.bytedance.tux.h.i.a(context);
        if (drawable == null) {
            if (i2 > 0) {
                try {
                    Drawable a3 = androidx.core.content.b.a(context, i2);
                    if (a3 != null) {
                        drawable2 = a3.mutate();
                    }
                } catch (Exception unused) {
                }
            }
            drawable = drawable2;
        }
        this.f44757a = drawable;
        this.f44761g = i2;
        this.o = new C1093b(this, this);
    }
}
