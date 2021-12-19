package androidx.appcompat.b.a;

import android.content.res.ColorStateList;
import android.content.res.Resources;
import android.graphics.Canvas;
import android.graphics.ColorFilter;
import android.graphics.Outline;
import android.graphics.PorterDuff;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.os.Build;
import android.os.SystemClock;
import android.util.SparseArray;
import com.bytedance.covode.number.Covode;

public class b extends Drawable implements Drawable.Callback {

    /* renamed from: a  reason: collision with root package name */
    public int f1020a = -1;

    /* renamed from: b  reason: collision with root package name */
    private AbstractC0021b f1021b;

    /* renamed from: c  reason: collision with root package name */
    private Rect f1022c;

    /* renamed from: d  reason: collision with root package name */
    private Drawable f1023d;

    /* renamed from: e  reason: collision with root package name */
    private Drawable f1024e;

    /* renamed from: f  reason: collision with root package name */
    private int f1025f = 255;

    /* renamed from: g  reason: collision with root package name */
    private boolean f1026g;

    /* renamed from: h  reason: collision with root package name */
    private int f1027h = -1;

    /* renamed from: i  reason: collision with root package name */
    private boolean f1028i;

    /* renamed from: j  reason: collision with root package name */
    private Runnable f1029j;

    /* renamed from: k  reason: collision with root package name */
    private long f1030k;

    /* renamed from: l  reason: collision with root package name */
    private long f1031l;

    /* renamed from: m  reason: collision with root package name */
    private a f1032m;

    static {
        Covode.recordClassIndex(298);
    }

    /* access modifiers changed from: package-private */
    public static class a implements Drawable.Callback {

        /* renamed from: a  reason: collision with root package name */
        Drawable.Callback f1034a;

        static {
            Covode.recordClassIndex(300);
        }

        public final void invalidateDrawable(Drawable drawable) {
        }

        a() {
        }

        public final Drawable.Callback a() {
            Drawable.Callback callback = this.f1034a;
            this.f1034a = null;
            return callback;
        }

        public final void unscheduleDrawable(Drawable drawable, Runnable runnable) {
            Drawable.Callback callback = this.f1034a;
            if (callback != null) {
                callback.unscheduleDrawable(drawable, runnable);
            }
        }

        public final void scheduleDrawable(Drawable drawable, Runnable runnable, long j2) {
            Drawable.Callback callback = this.f1034a;
            if (callback != null) {
                callback.scheduleDrawable(drawable, runnable, j2);
            }
        }
    }

    /* access modifiers changed from: package-private */
    public AbstractC0021b b() {
        return this.f1021b;
    }

    public int getAlpha() {
        return this.f1025f;
    }

    public Drawable getCurrent() {
        return this.f1023d;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: androidx.appcompat.b.a.b$b  reason: collision with other inner class name */
    public static abstract class AbstractC0021b extends Drawable.ConstantState {
        boolean A;
        int B;
        public int C;
        public int D;
        boolean E;
        ColorFilter F;
        boolean G;
        ColorStateList H;
        PorterDuff.Mode I;
        boolean J;
        boolean K;

        /* renamed from: c  reason: collision with root package name */
        final b f1035c;

        /* renamed from: d  reason: collision with root package name */
        Resources f1036d;

        /* renamed from: e  reason: collision with root package name */
        int f1037e = 160;

        /* renamed from: f  reason: collision with root package name */
        int f1038f;

        /* renamed from: g  reason: collision with root package name */
        int f1039g;

        /* renamed from: h  reason: collision with root package name */
        SparseArray<Drawable.ConstantState> f1040h;

        /* renamed from: i  reason: collision with root package name */
        Drawable[] f1041i;

        /* renamed from: j  reason: collision with root package name */
        public int f1042j;

        /* renamed from: k  reason: collision with root package name */
        public boolean f1043k;

        /* renamed from: l  reason: collision with root package name */
        boolean f1044l;

        /* renamed from: m  reason: collision with root package name */
        Rect f1045m;
        public boolean n;
        boolean o;
        int p;
        int q;
        int r;
        int s;
        boolean t;
        int u;
        boolean v;
        boolean w;
        boolean x;
        boolean y;
        boolean z = true;

        static {
            Covode.recordClassIndex(301);
        }

        /* access modifiers changed from: package-private */
        public final void b() {
            this.t = false;
            this.v = false;
        }

        public int getChangingConfigurations() {
            return this.f1038f | this.f1039g;
        }

        /* access modifiers changed from: package-private */
        public void a() {
            int i2 = this.f1042j;
            Drawable[] drawableArr = this.f1041i;
            for (int i3 = 0; i3 < i2; i3++) {
                if (drawableArr[i3] != null) {
                    drawableArr[i3].mutate();
                }
            }
            this.A = true;
        }

        /* access modifiers changed from: package-private */
        public final void c() {
            SparseArray<Drawable.ConstantState> sparseArray = this.f1040h;
            if (sparseArray != null) {
                int size = sparseArray.size();
                for (int i2 = 0; i2 < size; i2++) {
                    this.f1041i[this.f1040h.keyAt(i2)] = b(this.f1040h.valueAt(i2).newDrawable(this.f1036d));
                }
                this.f1040h = null;
            }
        }

        public boolean canApplyTheme() {
            int i2 = this.f1042j;
            Drawable[] drawableArr = this.f1041i;
            for (int i3 = 0; i3 < i2; i3++) {
                Drawable drawable = drawableArr[i3];
                if (drawable == null) {
                    Drawable.ConstantState constantState = this.f1040h.get(i3);
                    if (constantState != null && constantState.canApplyTheme()) {
                        return true;
                    }
                } else if (drawable.canApplyTheme()) {
                    return true;
                }
            }
            return false;
        }

        public final synchronized boolean e() {
            if (this.x) {
                return this.y;
            }
            c();
            this.x = true;
            int i2 = this.f1042j;
            Drawable[] drawableArr = this.f1041i;
            for (int i3 = 0; i3 < i2; i3++) {
                if (drawableArr[i3].getConstantState() == null) {
                    this.y = false;
                    return false;
                }
            }
            this.y = true;
            return true;
        }

        /* access modifiers changed from: package-private */
        public final void d() {
            this.o = true;
            c();
            int i2 = this.f1042j;
            Drawable[] drawableArr = this.f1041i;
            this.q = -1;
            this.p = -1;
            this.s = 0;
            this.r = 0;
            for (int i3 = 0; i3 < i2; i3++) {
                Drawable drawable = drawableArr[i3];
                int intrinsicWidth = drawable.getIntrinsicWidth();
                if (intrinsicWidth > this.p) {
                    this.p = intrinsicWidth;
                }
                int intrinsicHeight = drawable.getIntrinsicHeight();
                if (intrinsicHeight > this.q) {
                    this.q = intrinsicHeight;
                }
                int minimumWidth = drawable.getMinimumWidth();
                if (minimumWidth > this.r) {
                    this.r = minimumWidth;
                }
                int minimumHeight = drawable.getMinimumHeight();
                if (minimumHeight > this.s) {
                    this.s = minimumHeight;
                }
            }
        }

        private Drawable b(Drawable drawable) {
            if (Build.VERSION.SDK_INT >= 23) {
                drawable.setLayoutDirection(this.B);
            }
            Drawable mutate = drawable.mutate();
            mutate.setCallback(this.f1035c);
            return mutate;
        }

        public final int a(Drawable drawable) {
            int i2 = this.f1042j;
            if (i2 >= this.f1041i.length) {
                b(i2, i2 + 10);
            }
            drawable.mutate();
            drawable.setVisible(false, true);
            drawable.setCallback(this.f1035c);
            this.f1041i[i2] = drawable;
            this.f1042j++;
            this.f1039g = drawable.getChangingConfigurations() | this.f1039g;
            b();
            this.f1045m = null;
            this.f1044l = false;
            this.o = false;
            this.x = false;
            return i2;
        }

        public final Drawable b(int i2) {
            int indexOfKey;
            Drawable drawable = this.f1041i[i2];
            if (drawable != null) {
                return drawable;
            }
            SparseArray<Drawable.ConstantState> sparseArray = this.f1040h;
            if (sparseArray == null || (indexOfKey = sparseArray.indexOfKey(i2)) < 0) {
                return null;
            }
            Drawable b2 = b(this.f1040h.valueAt(indexOfKey).newDrawable(this.f1036d));
            this.f1041i[i2] = b2;
            this.f1040h.removeAt(indexOfKey);
            if (this.f1040h.size() == 0) {
                this.f1040h = null;
            }
            return b2;
        }

        /* access modifiers changed from: package-private */
        public final void a(Resources resources) {
            if (resources != null) {
                this.f1036d = resources;
                int a2 = b.a(resources, this.f1037e);
                int i2 = this.f1037e;
                this.f1037e = a2;
                if (i2 != a2) {
                    this.o = false;
                    this.f1044l = false;
                }
            }
        }

        public void b(int i2, int i3) {
            Drawable[] drawableArr = new Drawable[i3];
            System.arraycopy(this.f1041i, 0, drawableArr, 0, i2);
            this.f1041i = drawableArr;
        }

        AbstractC0021b(AbstractC0021b bVar, b bVar2, Resources resources) {
            Resources resources2;
            int i2;
            this.f1035c = bVar2;
            if (resources != null) {
                resources2 = resources;
            } else if (bVar != null) {
                resources2 = bVar.f1036d;
            } else {
                resources2 = null;
            }
            this.f1036d = resources2;
            if (bVar != null) {
                i2 = bVar.f1037e;
            } else {
                i2 = 0;
            }
            int a2 = b.a(resources, i2);
            this.f1037e = a2;
            if (bVar != null) {
                this.f1038f = bVar.f1038f;
                this.f1039g = bVar.f1039g;
                this.x = true;
                this.y = true;
                this.f1043k = bVar.f1043k;
                this.n = bVar.n;
                this.z = bVar.z;
                this.A = bVar.A;
                this.B = bVar.B;
                this.C = bVar.C;
                this.D = bVar.D;
                this.E = bVar.E;
                this.F = bVar.F;
                this.G = bVar.G;
                this.H = bVar.H;
                this.I = bVar.I;
                this.J = bVar.J;
                this.K = bVar.K;
                if (bVar.f1037e == a2) {
                    if (bVar.f1044l) {
                        this.f1045m = new Rect(bVar.f1045m);
                        this.f1044l = true;
                    }
                    if (bVar.o) {
                        this.p = bVar.p;
                        this.q = bVar.q;
                        this.r = bVar.r;
                        this.s = bVar.s;
                        this.o = true;
                    }
                }
                if (bVar.t) {
                    this.u = bVar.u;
                    this.t = true;
                }
                if (bVar.v) {
                    this.w = bVar.w;
                    this.v = true;
                }
                Drawable[] drawableArr = bVar.f1041i;
                this.f1041i = new Drawable[drawableArr.length];
                this.f1042j = bVar.f1042j;
                SparseArray<Drawable.ConstantState> sparseArray = bVar.f1040h;
                if (sparseArray != null) {
                    this.f1040h = sparseArray.clone();
                } else {
                    this.f1040h = new SparseArray<>(this.f1042j);
                }
                int i3 = this.f1042j;
                for (int i4 = 0; i4 < i3; i4++) {
                    if (drawableArr[i4] != null) {
                        Drawable.ConstantState constantState = drawableArr[i4].getConstantState();
                        if (constantState != null) {
                            this.f1040h.put(i4, constantState);
                        } else {
                            this.f1041i[i4] = drawableArr[i4];
                        }
                    }
                }
                return;
            }
            this.f1041i = new Drawable[10];
            this.f1042j = 0;
        }
    }

    public boolean canApplyTheme() {
        return this.f1021b.canApplyTheme();
    }

    public boolean isAutoMirrored() {
        return this.f1021b.E;
    }

    b() {
    }

    public int getChangingConfigurations() {
        return super.getChangingConfigurations() | this.f1021b.getChangingConfigurations();
    }

    public final Drawable.ConstantState getConstantState() {
        if (!this.f1021b.e()) {
            return null;
        }
        this.f1021b.f1038f = getChangingConfigurations();
        return this.f1021b;
    }

    public int getIntrinsicHeight() {
        if (this.f1021b.n) {
            AbstractC0021b bVar = this.f1021b;
            if (!bVar.o) {
                bVar.d();
            }
            return bVar.q;
        }
        Drawable drawable = this.f1023d;
        if (drawable != null) {
            return drawable.getIntrinsicHeight();
        }
        return -1;
    }

    public int getIntrinsicWidth() {
        if (this.f1021b.n) {
            AbstractC0021b bVar = this.f1021b;
            if (!bVar.o) {
                bVar.d();
            }
            return bVar.p;
        }
        Drawable drawable = this.f1023d;
        if (drawable != null) {
            return drawable.getIntrinsicWidth();
        }
        return -1;
    }

    public int getMinimumHeight() {
        if (this.f1021b.n) {
            AbstractC0021b bVar = this.f1021b;
            if (!bVar.o) {
                bVar.d();
            }
            return bVar.s;
        }
        Drawable drawable = this.f1023d;
        if (drawable != null) {
            return drawable.getMinimumHeight();
        }
        return 0;
    }

    public int getMinimumWidth() {
        if (this.f1021b.n) {
            AbstractC0021b bVar = this.f1021b;
            if (!bVar.o) {
                bVar.d();
            }
            return bVar.r;
        }
        Drawable drawable = this.f1023d;
        if (drawable != null) {
            return drawable.getMinimumWidth();
        }
        return 0;
    }

    public Drawable mutate() {
        if (!this.f1028i && super.mutate() == this) {
            AbstractC0021b b2 = b();
            b2.a();
            a(b2);
            this.f1028i = true;
        }
        return this;
    }

    public int getOpacity() {
        Drawable drawable = this.f1023d;
        int i2 = -2;
        if (drawable != null && drawable.isVisible()) {
            AbstractC0021b bVar = this.f1021b;
            if (bVar.t) {
                return bVar.u;
            }
            bVar.c();
            int i3 = bVar.f1042j;
            Drawable[] drawableArr = bVar.f1041i;
            if (i3 > 0) {
                i2 = drawableArr[0].getOpacity();
            }
            for (int i4 = 1; i4 < i3; i4++) {
                i2 = Drawable.resolveOpacity(i2, drawableArr[i4].getOpacity());
            }
            bVar.u = i2;
            bVar.t = true;
        }
        return i2;
    }

    public boolean isStateful() {
        AbstractC0021b bVar = this.f1021b;
        if (bVar.v) {
            return bVar.w;
        }
        bVar.c();
        int i2 = bVar.f1042j;
        Drawable[] drawableArr = bVar.f1041i;
        boolean z = false;
        int i3 = 0;
        while (true) {
            if (i3 >= i2) {
                break;
            } else if (drawableArr[i3].isStateful()) {
                z = true;
                break;
            } else {
                i3++;
            }
        }
        bVar.w = z;
        bVar.v = true;
        return z;
    }

    public void jumpToCurrentState() {
        boolean z;
        Drawable drawable = this.f1024e;
        if (drawable != null) {
            drawable.jumpToCurrentState();
            this.f1024e = null;
            this.f1027h = -1;
            z = true;
        } else {
            z = false;
        }
        Drawable drawable2 = this.f1023d;
        if (drawable2 != null) {
            drawable2.jumpToCurrentState();
            if (this.f1026g) {
                this.f1023d.setAlpha(this.f1025f);
            }
        }
        if (this.f1031l != 0) {
            this.f1031l = 0;
            z = true;
        }
        if (this.f1030k != 0) {
            this.f1030k = 0;
        } else if (!z) {
            return;
        }
        invalidateSelf();
    }

    /* access modifiers changed from: package-private */
    public final void a(Resources resources) {
        this.f1021b.a(resources);
    }

    public void getOutline(Outline outline) {
        Drawable drawable = this.f1023d;
        if (drawable != null) {
            drawable.getOutline(outline);
        }
    }

    public void draw(Canvas canvas) {
        Drawable drawable = this.f1023d;
        if (drawable != null) {
            drawable.draw(canvas);
        }
        Drawable drawable2 = this.f1024e;
        if (drawable2 != null) {
            drawable2.draw(canvas);
        }
    }

    public void getHotspotBounds(Rect rect) {
        Rect rect2 = this.f1022c;
        if (rect2 != null) {
            rect.set(rect2);
        } else {
            super.getHotspotBounds(rect);
        }
    }

    /* access modifiers changed from: protected */
    public void onBoundsChange(Rect rect) {
        Drawable drawable = this.f1024e;
        if (drawable != null) {
            drawable.setBounds(rect);
        }
        Drawable drawable2 = this.f1023d;
        if (drawable2 != null) {
            drawable2.setBounds(rect);
        }
    }

    /* access modifiers changed from: protected */
    public void a(AbstractC0021b bVar) {
        this.f1021b = bVar;
        int i2 = this.f1020a;
        if (i2 >= 0) {
            Drawable b2 = bVar.b(i2);
            this.f1023d = b2;
            if (b2 != null) {
                a(b2);
            }
        }
        this.f1027h = -1;
        this.f1024e = null;
    }

    public void invalidateDrawable(Drawable drawable) {
        AbstractC0021b bVar = this.f1021b;
        if (bVar != null) {
            bVar.b();
        }
        if (drawable == this.f1023d && getCallback() != null) {
            getCallback().invalidateDrawable(this);
        }
    }

    /* access modifiers changed from: protected */
    public boolean onLevelChange(int i2) {
        Drawable drawable = this.f1024e;
        if (drawable != null) {
            return drawable.setLevel(i2);
        }
        Drawable drawable2 = this.f1023d;
        if (drawable2 != null) {
            return drawable2.setLevel(i2);
        }
        return false;
    }

    /* access modifiers changed from: protected */
    public boolean onStateChange(int[] iArr) {
        Drawable drawable = this.f1024e;
        if (drawable != null) {
            return drawable.setState(iArr);
        }
        Drawable drawable2 = this.f1023d;
        if (drawable2 != null) {
            return drawable2.setState(iArr);
        }
        return false;
    }

    public void setAutoMirrored(boolean z) {
        if (this.f1021b.E != z) {
            this.f1021b.E = z;
            Drawable drawable = this.f1023d;
            if (drawable != null) {
                androidx.core.graphics.drawable.a.a(drawable, this.f1021b.E);
            }
        }
    }

    public void setColorFilter(ColorFilter colorFilter) {
        this.f1021b.G = true;
        if (this.f1021b.F != colorFilter) {
            this.f1021b.F = colorFilter;
            Drawable drawable = this.f1023d;
            if (drawable != null) {
                drawable.setColorFilter(colorFilter);
            }
        }
    }

    public void setDither(boolean z) {
        if (this.f1021b.z != z) {
            this.f1021b.z = z;
            Drawable drawable = this.f1023d;
            if (drawable != null) {
                drawable.setDither(this.f1021b.z);
            }
        }
    }

    public void setTintList(ColorStateList colorStateList) {
        this.f1021b.J = true;
        if (this.f1021b.H != colorStateList) {
            this.f1021b.H = colorStateList;
            androidx.core.graphics.drawable.a.a(this.f1023d, colorStateList);
        }
    }

    public void setTintMode(PorterDuff.Mode mode) {
        this.f1021b.K = true;
        if (this.f1021b.I != mode) {
            this.f1021b.I = mode;
            androidx.core.graphics.drawable.a.a(this.f1023d, mode);
        }
    }

    public void applyTheme(Resources.Theme theme) {
        AbstractC0021b bVar = this.f1021b;
        if (theme != null) {
            bVar.c();
            int i2 = bVar.f1042j;
            Drawable[] drawableArr = bVar.f1041i;
            for (int i3 = 0; i3 < i2; i3++) {
                if (drawableArr[i3] != null && drawableArr[i3].canApplyTheme()) {
                    drawableArr[i3].applyTheme(theme);
                    bVar.f1039g |= drawableArr[i3].getChangingConfigurations();
                }
            }
            bVar.a(theme.getResources());
        }
    }

    public boolean onLayoutDirectionChanged(int i2) {
        boolean z;
        AbstractC0021b bVar = this.f1021b;
        int i3 = this.f1020a;
        int i4 = bVar.f1042j;
        Drawable[] drawableArr = bVar.f1041i;
        boolean z2 = false;
        for (int i5 = 0; i5 < i4; i5++) {
            if (drawableArr[i5] != null) {
                if (Build.VERSION.SDK_INT >= 23) {
                    z = drawableArr[i5].setLayoutDirection(i2);
                } else {
                    z = false;
                }
                if (i5 == i3) {
                    z2 = z;
                }
            }
        }
        bVar.B = i2;
        return z2;
    }

    public void setAlpha(int i2) {
        if (!this.f1026g || this.f1025f != i2) {
            this.f1026g = true;
            this.f1025f = i2;
            Drawable drawable = this.f1023d;
            if (drawable == null) {
                return;
            }
            if (this.f1030k == 0) {
                drawable.setAlpha(i2);
            } else {
                a(false);
            }
        }
    }

    /* access modifiers changed from: package-private */
    /* JADX WARNING: Removed duplicated region for block: B:11:0x0026  */
    /* JADX WARNING: Removed duplicated region for block: B:19:0x003e A[ADDED_TO_REGION] */
    /* JADX WARNING: Removed duplicated region for block: B:24:? A[ADDED_TO_REGION, RETURN, SYNTHETIC] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void a(boolean r14) {
        /*
        // Method dump skipped, instructions count: 114
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.appcompat.b.a.b.a(boolean):void");
    }

    private void a(Drawable drawable) {
        if (this.f1032m == null) {
            this.f1032m = new a();
        }
        a aVar = this.f1032m;
        aVar.f1034a = drawable.getCallback();
        drawable.setCallback(aVar);
        try {
            if (this.f1021b.C <= 0 && this.f1026g) {
                drawable.setAlpha(this.f1025f);
            }
            if (this.f1021b.G) {
                drawable.setColorFilter(this.f1021b.F);
            } else {
                if (this.f1021b.J) {
                    androidx.core.graphics.drawable.a.a(drawable, this.f1021b.H);
                }
                if (this.f1021b.K) {
                    androidx.core.graphics.drawable.a.a(drawable, this.f1021b.I);
                }
            }
            drawable.setVisible(isVisible(), true);
            drawable.setDither(this.f1021b.z);
            drawable.setState(getState());
            drawable.setLevel(getLevel());
            drawable.setBounds(getBounds());
            if (Build.VERSION.SDK_INT >= 23) {
                drawable.setLayoutDirection(getLayoutDirection());
            }
            int i2 = Build.VERSION.SDK_INT;
            drawable.setAutoMirrored(this.f1021b.E);
            Rect rect = this.f1022c;
            if (Build.VERSION.SDK_INT >= 21 && rect != null) {
                drawable.setHotspotBounds(rect.left, rect.top, rect.right, rect.bottom);
            }
        } finally {
            drawable.setCallback(this.f1032m.a());
        }
    }

    public boolean getPadding(Rect rect) {
        boolean z;
        AbstractC0021b bVar = this.f1021b;
        Rect rect2 = null;
        if (!bVar.f1043k) {
            if (bVar.f1045m != null || bVar.f1044l) {
                rect2 = bVar.f1045m;
            } else {
                bVar.c();
                Rect rect3 = new Rect();
                int i2 = bVar.f1042j;
                Drawable[] drawableArr = bVar.f1041i;
                for (int i3 = 0; i3 < i2; i3++) {
                    if (drawableArr[i3].getPadding(rect3)) {
                        if (rect2 == null) {
                            rect2 = new Rect(0, 0, 0, 0);
                        }
                        if (rect3.left > rect2.left) {
                            rect2.left = rect3.left;
                        }
                        if (rect3.top > rect2.top) {
                            rect2.top = rect3.top;
                        }
                        if (rect3.right > rect2.right) {
                            rect2.right = rect3.right;
                        }
                        if (rect3.bottom > rect2.bottom) {
                            rect2.bottom = rect3.bottom;
                        }
                    }
                }
                bVar.f1044l = true;
                bVar.f1045m = rect2;
            }
            if (rect2 != null) {
                rect.set(rect2);
                if ((rect2.left | rect2.top | rect2.bottom | rect2.right) != 0) {
                    z = true;
                } else {
                    z = false;
                }
                if (isAutoMirrored() && getLayoutDirection() == 1) {
                    int i4 = rect.left;
                    rect.left = rect.right;
                    rect.right = i4;
                }
                return z;
            }
        }
        Drawable drawable = this.f1023d;
        if (drawable != null) {
            z = drawable.getPadding(rect);
        } else {
            z = super.getPadding(rect);
        }
        int i42 = rect.left;
        rect.left = rect.right;
        rect.right = i42;
        return z;
    }

    /* access modifiers changed from: package-private */
    public final boolean a(int i2) {
        if (i2 == this.f1020a) {
            return false;
        }
        long uptimeMillis = SystemClock.uptimeMillis();
        if (this.f1021b.D > 0) {
            Drawable drawable = this.f1024e;
            if (drawable != null) {
                drawable.setVisible(false, false);
            }
            Drawable drawable2 = this.f1023d;
            if (drawable2 != null) {
                this.f1024e = drawable2;
                this.f1027h = this.f1020a;
                this.f1031l = ((long) this.f1021b.D) + uptimeMillis;
            } else {
                this.f1024e = null;
                this.f1027h = -1;
                this.f1031l = 0;
            }
        } else {
            Drawable drawable3 = this.f1023d;
            if (drawable3 != null) {
                drawable3.setVisible(false, false);
            }
        }
        if (i2 < 0 || i2 >= this.f1021b.f1042j) {
            this.f1023d = null;
            this.f1020a = -1;
        } else {
            Drawable b2 = this.f1021b.b(i2);
            this.f1023d = b2;
            this.f1020a = i2;
            if (b2 != null) {
                if (this.f1021b.C > 0) {
                    this.f1030k = uptimeMillis + ((long) this.f1021b.C);
                }
                a(b2);
            }
        }
        if (!(this.f1030k == 0 && this.f1031l == 0)) {
            Runnable runnable = this.f1029j;
            if (runnable == null) {
                this.f1029j = new Runnable() {
                    /* class androidx.appcompat.b.a.b.AnonymousClass1 */

                    static {
                        Covode.recordClassIndex(299);
                    }

                    public final void run() {
                        b.this.a(true);
                        b.this.invalidateSelf();
                    }
                };
            } else {
                unscheduleSelf(runnable);
            }
            a(true);
        }
        invalidateSelf();
        return true;
    }

    public void setHotspot(float f2, float f3) {
        Drawable drawable = this.f1023d;
        if (drawable != null) {
            androidx.core.graphics.drawable.a.a(drawable, f2, f3);
        }
    }

    static int a(Resources resources, int i2) {
        if (resources != null) {
            i2 = resources.getDisplayMetrics().densityDpi;
        }
        if (i2 == 0) {
            return 160;
        }
        return i2;
    }

    public boolean setVisible(boolean z, boolean z2) {
        boolean visible = super.setVisible(z, z2);
        Drawable drawable = this.f1024e;
        if (drawable != null) {
            drawable.setVisible(z, z2);
        }
        Drawable drawable2 = this.f1023d;
        if (drawable2 != null) {
            drawable2.setVisible(z, z2);
        }
        return visible;
    }

    public void unscheduleDrawable(Drawable drawable, Runnable runnable) {
        if (drawable == this.f1023d && getCallback() != null) {
            getCallback().unscheduleDrawable(this, runnable);
        }
    }

    public void scheduleDrawable(Drawable drawable, Runnable runnable, long j2) {
        if (drawable == this.f1023d && getCallback() != null) {
            getCallback().scheduleDrawable(this, runnable, j2);
        }
    }

    public void setHotspotBounds(int i2, int i3, int i4, int i5) {
        Rect rect = this.f1022c;
        if (rect == null) {
            this.f1022c = new Rect(i2, i3, i4, i5);
        } else {
            rect.set(i2, i3, i4, i5);
        }
        Drawable drawable = this.f1023d;
        if (drawable != null) {
            androidx.core.graphics.drawable.a.a(drawable, i2, i3, i4, i5);
        }
    }
}
