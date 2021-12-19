package androidx.appcompat.widget;

import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.Resources;
import android.content.res.XmlResourceParser;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffColorFilter;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.LayerDrawable;
import android.os.Build;
import android.util.AttributeSet;
import android.util.TypedValue;
import android.util.Xml;
import androidx.l.a.a.i;
import com.bytedance.covode.number.Covode;
import com.zhiliaoapp.musically.R;
import java.lang.ref.WeakReference;
import java.util.WeakHashMap;
import org.xmlpull.v1.XmlPullParser;
import org.xmlpull.v1.XmlPullParserException;

public final class h {

    /* renamed from: a  reason: collision with root package name */
    private static final PorterDuff.Mode f1630a = PorterDuff.Mode.SRC_IN;

    /* renamed from: b  reason: collision with root package name */
    private static h f1631b;

    /* renamed from: c  reason: collision with root package name */
    private static final c f1632c = new c();

    /* renamed from: d  reason: collision with root package name */
    private static final int[] f1633d = {R.drawable.c2, R.drawable.c0, R.drawable.v};

    /* renamed from: e  reason: collision with root package name */
    private static final int[] f1634e = {R.drawable.ag, R.drawable.bk, R.drawable.an, R.drawable.ai, R.drawable.aj, R.drawable.am, R.drawable.al};

    /* renamed from: f  reason: collision with root package name */
    private static final int[] f1635f = {R.drawable.bz, R.drawable.c1, 2131230756, R.drawable.bs, R.drawable.bt, R.drawable.bv, R.drawable.bx, R.drawable.bu, R.drawable.bw, R.drawable.by};

    /* renamed from: g  reason: collision with root package name */
    private static final int[] f1636g = {R.drawable.ba, R.drawable.a8, R.drawable.b_};

    /* renamed from: h  reason: collision with root package name */
    private static final int[] f1637h = {R.drawable.bq, R.drawable.c3};

    /* renamed from: i  reason: collision with root package name */
    private static final int[] f1638i = {R.drawable.y, R.drawable.a3};

    /* renamed from: j  reason: collision with root package name */
    private WeakHashMap<Context, androidx.c.h<ColorStateList>> f1639j;

    /* renamed from: k  reason: collision with root package name */
    private androidx.c.a<String, d> f1640k;

    /* renamed from: l  reason: collision with root package name */
    private androidx.c.h<String> f1641l;

    /* renamed from: m  reason: collision with root package name */
    private final WeakHashMap<Context, androidx.c.d<WeakReference<Drawable.ConstantState>>> f1642m = new WeakHashMap<>(0);
    private TypedValue n;
    private boolean o;

    /* access modifiers changed from: package-private */
    public interface d {
        static {
            Covode.recordClassIndex(497);
        }

        Drawable a(Context context, XmlPullParser xmlPullParser, AttributeSet attributeSet, Resources.Theme theme);
    }

    static class a implements d {
        static {
            Covode.recordClassIndex(494);
        }

        a() {
        }

        @Override // androidx.appcompat.widget.h.d
        public final Drawable a(Context context, XmlPullParser xmlPullParser, AttributeSet attributeSet, Resources.Theme theme) {
            try {
                return androidx.appcompat.b.a.a.a(context, context.getResources(), xmlPullParser, attributeSet, theme);
            } catch (Exception unused) {
                return null;
            }
        }
    }

    static class b implements d {
        static {
            Covode.recordClassIndex(495);
        }

        b() {
        }

        @Override // androidx.appcompat.widget.h.d
        public final Drawable a(Context context, XmlPullParser xmlPullParser, AttributeSet attributeSet, Resources.Theme theme) {
            try {
                return androidx.l.a.a.c.a(context, context.getResources(), xmlPullParser, attributeSet, theme);
            } catch (Exception unused) {
                return null;
            }
        }
    }

    static class e implements d {
        static {
            Covode.recordClassIndex(498);
        }

        e() {
        }

        @Override // androidx.appcompat.widget.h.d
        public final Drawable a(Context context, XmlPullParser xmlPullParser, AttributeSet attributeSet, Resources.Theme theme) {
            try {
                return i.a(context.getResources(), xmlPullParser, attributeSet, theme);
            } catch (Exception unused) {
                return null;
            }
        }
    }

    public final synchronized Drawable a(Context context, int i2) {
        return a(context, i2, false);
    }

    public final synchronized void a(Context context) {
        androidx.c.d<WeakReference<Drawable.ConstantState>> dVar = this.f1642m.get(context);
        if (dVar != null) {
            dVar.c();
        }
    }

    private synchronized boolean a(Context context, long j2, Drawable drawable) {
        Drawable.ConstantState constantState = drawable.getConstantState();
        if (constantState == null) {
            return false;
        }
        androidx.c.d<WeakReference<Drawable.ConstantState>> dVar = this.f1642m.get(context);
        if (dVar == null) {
            dVar = new androidx.c.d<>();
            this.f1642m.put(context, dVar);
        }
        dVar.b(j2, new WeakReference<>(constantState));
        return true;
    }

    /* access modifiers changed from: package-private */
    public final synchronized Drawable a(Context context, aq aqVar, int i2) {
        Drawable c2 = c(context, i2);
        if (c2 == null) {
            c2 = aqVar.a(i2);
        }
        if (c2 == null) {
            return null;
        }
        return a(context, i2, false, c2);
    }

    /* JADX WARNING: Removed duplicated region for block: B:6:0x001a  */
    /* JADX WARNING: Removed duplicated region for block: B:9:0x002b  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    static boolean a(android.content.Context r6, int r7, android.graphics.drawable.Drawable r8) {
        /*
            android.graphics.PorterDuff$Mode r4 = androidx.appcompat.widget.h.f1630a
            int[] r0 = androidx.appcompat.widget.h.f1633d
            boolean r0 = a(r0, r7)
            r5 = 16842801(0x1010031, float:2.3693695E-38)
            r3 = -1
            r1 = 0
            r2 = 1
            if (r0 == 0) goto L_0x002f
            r5 = 2130969140(0x7f040234, float:1.7546953E38)
        L_0x0013:
            r1 = -1
        L_0x0014:
            boolean r0 = androidx.appcompat.widget.w.c(r8)
            if (r0 == 0) goto L_0x001e
            android.graphics.drawable.Drawable r8 = r8.mutate()
        L_0x001e:
            int r0 = androidx.appcompat.widget.ah.a(r6, r5)
            android.graphics.PorterDuffColorFilter r0 = a(r0, r4)
            r8.setColorFilter(r0)
            if (r1 == r3) goto L_0x002e
            r8.setAlpha(r1)
        L_0x002e:
            return r2
        L_0x002f:
            int[] r0 = androidx.appcompat.widget.h.f1635f
            boolean r0 = a(r0, r7)
            if (r0 == 0) goto L_0x003b
            r5 = 2130969138(0x7f040232, float:1.754695E38)
            goto L_0x0013
        L_0x003b:
            int[] r0 = androidx.appcompat.widget.h.f1636g
            boolean r0 = a(r0, r7)
            if (r0 == 0) goto L_0x0046
            android.graphics.PorterDuff$Mode r4 = android.graphics.PorterDuff.Mode.MULTIPLY
            goto L_0x0013
        L_0x0046:
            r0 = 2131230782(0x7f08003e, float:1.8077626E38)
            if (r7 != r0) goto L_0x0056
            r5 = 16842800(0x1010030, float:2.3693693E-38)
            r0 = 1109603123(0x42233333, float:40.8)
            int r1 = java.lang.Math.round(r0)
            goto L_0x0014
        L_0x0056:
            r0 = 2131230758(0x7f080026, float:1.8077578E38)
            if (r7 != r0) goto L_0x005c
            goto L_0x0013
        L_0x005c:
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.appcompat.widget.h.a(android.content.Context, int, android.graphics.drawable.Drawable):boolean");
    }

    private void a(String str, d dVar) {
        if (this.f1640k == null) {
            this.f1640k = new androidx.c.a<>();
        }
        this.f1640k.put(str, dVar);
    }

    private static boolean a(int[] iArr, int i2) {
        for (int i3 : iArr) {
            if (i3 == i2) {
                return true;
            }
        }
        return false;
    }

    static void a(Drawable drawable, aj ajVar, int[] iArr) {
        if (!w.c(drawable) || drawable.mutate() == drawable) {
            if (ajVar.f1547d || ajVar.f1546c) {
                drawable.setColorFilter(a(ajVar.f1547d ? ajVar.f1544a : null, ajVar.f1546c ? ajVar.f1545b : f1630a, iArr));
            } else {
                drawable.clearColorFilter();
            }
            if (Build.VERSION.SDK_INT <= 23) {
                drawable.invalidateSelf();
            }
        }
    }

    /* access modifiers changed from: package-private */
    /* JADX WARNING: Removed duplicated region for block: B:14:0x002c  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final synchronized android.graphics.drawable.Drawable a(android.content.Context r9, int r10, boolean r11) {
        /*
        // Method dump skipped, instructions count: 154
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.appcompat.widget.h.a(android.content.Context, int, boolean):android.graphics.drawable.Drawable");
    }

    /* access modifiers changed from: package-private */
    public static class c extends androidx.c.e<Integer, PorterDuffColorFilter> {
        static {
            Covode.recordClassIndex(496);
        }

        public c() {
            super(6);
        }

        static int a(int i2, PorterDuff.Mode mode) {
            return ((i2 + 31) * 31) + mode.hashCode();
        }
    }

    static {
        Covode.recordClassIndex(493);
    }

    public static synchronized h a() {
        h hVar;
        synchronized (h.class) {
            if (f1631b == null) {
                h hVar2 = new h();
                f1631b = hVar2;
                if (Build.VERSION.SDK_INT < 24) {
                    hVar2.a("vector", new e());
                    hVar2.a("animated-vector", new b());
                    hVar2.a("animated-selector", new a());
                }
            }
            hVar = f1631b;
        }
        return hVar;
    }

    private static long a(TypedValue typedValue) {
        return (((long) typedValue.assetCookie) << 32) | ((long) typedValue.data);
    }

    private static PorterDuff.Mode a(int i2) {
        if (i2 == R.drawable.bo) {
            return PorterDuff.Mode.MULTIPLY;
        }
        return null;
    }

    public static synchronized PorterDuffColorFilter a(int i2, PorterDuff.Mode mode) {
        PorterDuffColorFilter porterDuffColorFilter;
        synchronized (h.class) {
            c cVar = f1632c;
            porterDuffColorFilter = (PorterDuffColorFilter) cVar.a(Integer.valueOf(c.a(i2, mode)));
            if (porterDuffColorFilter == null) {
                porterDuffColorFilter = new PorterDuffColorFilter(i2, mode);
                cVar.a(Integer.valueOf(c.a(i2, mode)), porterDuffColorFilter);
            }
        }
        return porterDuffColorFilter;
    }

    private static ColorStateList d(Context context, int i2) {
        int a2 = ah.a(context, R.attr.oi);
        int c2 = ah.c(context, R.attr.og);
        return new ColorStateList(new int[][]{ah.f1530a, ah.f1533d, ah.f1531b, ah.f1537h}, new int[]{c2, androidx.core.graphics.a.a(a2, i2), androidx.core.graphics.a.a(a2, i2), i2});
    }

    private Drawable c(Context context, int i2) {
        int next;
        androidx.c.a<String, d> aVar = this.f1640k;
        if (aVar == null || aVar.isEmpty()) {
            return null;
        }
        androidx.c.h<String> hVar = this.f1641l;
        if (hVar != null) {
            String a2 = hVar.a(i2, null);
            if ("appcompat_skip_skip".equals(a2) || (a2 != null && this.f1640k.get(a2) == null)) {
                return null;
            }
        } else {
            this.f1641l = new androidx.c.h<>();
        }
        if (this.n == null) {
            this.n = new TypedValue();
        }
        TypedValue typedValue = this.n;
        Resources resources = context.getResources();
        resources.getValue(i2, typedValue, true);
        long a3 = a(typedValue);
        Drawable a4 = a(context, a3);
        if (a4 != null) {
            return a4;
        }
        if (typedValue.string != null && typedValue.string.toString().endsWith(".xml")) {
            try {
                XmlResourceParser xml = resources.getXml(i2);
                AttributeSet asAttributeSet = Xml.asAttributeSet(xml);
                do {
                    next = xml.next();
                    if (next == 2) {
                        break;
                    }
                } while (next != 1);
                if (next == 2) {
                    String name = xml.getName();
                    this.f1641l.c(i2, name);
                    d dVar = this.f1640k.get(name);
                    if (dVar != null) {
                        a4 = dVar.a(context, xml, asAttributeSet, context.getTheme());
                    }
                    if (a4 != null) {
                        a4.setChangingConfigurations(typedValue.changingConfigurations);
                        a(context, a3, a4);
                    }
                } else {
                    throw new XmlPullParserException("No start tag found");
                }
            } catch (Exception unused) {
            }
        }
        if (a4 == null) {
            this.f1641l.c(i2, "appcompat_skip_skip");
        }
        return a4;
    }

    private synchronized Drawable a(Context context, long j2) {
        androidx.c.d<WeakReference<Drawable.ConstantState>> dVar = this.f1642m.get(context);
        if (dVar == null) {
            return null;
        }
        WeakReference<Drawable.ConstantState> a2 = dVar.a(j2, null);
        if (a2 != null) {
            Drawable.ConstantState constantState = a2.get();
            if (constantState != null) {
                return constantState.newDrawable(context.getResources());
            }
            dVar.b(j2);
        }
        return null;
    }

    /* access modifiers changed from: package-private */
    public final synchronized ColorStateList b(Context context, int i2) {
        ColorStateList colorStateList;
        androidx.c.h<ColorStateList> hVar;
        WeakHashMap<Context, androidx.c.h<ColorStateList>> weakHashMap = this.f1639j;
        colorStateList = null;
        if (!(weakHashMap == null || (hVar = weakHashMap.get(context)) == null)) {
            colorStateList = hVar.a(i2, null);
        }
        if (colorStateList == null) {
            if (i2 == R.drawable.ac) {
                colorStateList = androidx.appcompat.a.a.a.a(context, R.color.ct);
            } else if (i2 == R.drawable.bp) {
                colorStateList = androidx.appcompat.a.a.a.a(context, R.color.cw);
            } else if (i2 == R.drawable.bo) {
                int[][] iArr = new int[3][];
                int[] iArr2 = new int[3];
                ColorStateList b2 = ah.b(context, R.attr.op);
                if (b2 == null || !b2.isStateful()) {
                    iArr[0] = ah.f1530a;
                    iArr2[0] = ah.c(context, R.attr.op);
                    iArr[1] = ah.f1534e;
                    iArr2[1] = ah.a(context, R.attr.oh);
                    iArr[2] = ah.f1537h;
                    iArr2[2] = ah.a(context, R.attr.op);
                } else {
                    iArr[0] = ah.f1530a;
                    iArr2[0] = b2.getColorForState(iArr[0], 0);
                    iArr[1] = ah.f1534e;
                    iArr2[1] = ah.a(context, R.attr.oh);
                    iArr[2] = ah.f1537h;
                    iArr2[2] = b2.getDefaultColor();
                }
                colorStateList = new ColorStateList(iArr, iArr2);
            } else if (i2 == R.drawable.a2) {
                colorStateList = d(context, ah.a(context, R.attr.og));
            } else if (i2 == R.drawable.x) {
                colorStateList = d(context, 0);
            } else if (i2 == R.drawable.a1) {
                colorStateList = d(context, ah.a(context, R.attr.oe));
            } else {
                if (i2 != R.drawable.bm) {
                    if (i2 != R.drawable.bn) {
                        if (a(f1634e, i2)) {
                            colorStateList = ah.b(context, R.attr.oj);
                        } else if (a(f1637h, i2)) {
                            colorStateList = androidx.appcompat.a.a.a.a(context, R.color.cs);
                        } else if (a(f1638i, i2)) {
                            colorStateList = androidx.appcompat.a.a.a.a(context, R.color.cr);
                        } else if (i2 == R.drawable.bj) {
                            colorStateList = androidx.appcompat.a.a.a.a(context, R.color.cu);
                        }
                    }
                }
                colorStateList = androidx.appcompat.a.a.a.a(context, R.color.cv);
            }
            if (colorStateList != null) {
                if (this.f1639j == null) {
                    this.f1639j = new WeakHashMap<>();
                }
                androidx.c.h<ColorStateList> hVar2 = this.f1639j.get(context);
                if (hVar2 == null) {
                    hVar2 = new androidx.c.h<>();
                    this.f1639j.put(context, hVar2);
                }
                hVar2.c(i2, colorStateList);
            }
        }
        return colorStateList;
    }

    private static PorterDuffColorFilter a(ColorStateList colorStateList, PorterDuff.Mode mode, int[] iArr) {
        if (colorStateList == null || mode == null) {
            return null;
        }
        return a(colorStateList.getColorForState(iArr, 0), mode);
    }

    private static void a(Drawable drawable, int i2, PorterDuff.Mode mode) {
        if (w.c(drawable)) {
            drawable = drawable.mutate();
        }
        if (mode == null) {
            mode = f1630a;
        }
        drawable.setColorFilter(a(i2, mode));
    }

    private Drawable a(Context context, int i2, boolean z, Drawable drawable) {
        ColorStateList b2 = b(context, i2);
        if (b2 != null) {
            if (w.c(drawable)) {
                drawable = drawable.mutate();
            }
            Drawable e2 = androidx.core.graphics.drawable.a.e(drawable);
            androidx.core.graphics.drawable.a.a(e2, b2);
            PorterDuff.Mode a2 = a(i2);
            if (a2 == null) {
                return e2;
            }
            androidx.core.graphics.drawable.a.a(e2, a2);
            return e2;
        } else if (i2 == R.drawable.bl) {
            LayerDrawable layerDrawable = (LayerDrawable) drawable;
            Drawable findDrawableByLayerId = layerDrawable.findDrawableByLayerId(16908288);
            int a3 = ah.a(context, R.attr.oj);
            PorterDuff.Mode mode = f1630a;
            a(findDrawableByLayerId, a3, mode);
            a(layerDrawable.findDrawableByLayerId(16908303), ah.a(context, R.attr.oj), mode);
            a(layerDrawable.findDrawableByLayerId(16908301), ah.a(context, R.attr.oh), mode);
            return drawable;
        } else if (i2 == R.drawable.bc || i2 == R.drawable.bb || i2 == R.drawable.bd) {
            LayerDrawable layerDrawable2 = (LayerDrawable) drawable;
            Drawable findDrawableByLayerId2 = layerDrawable2.findDrawableByLayerId(16908288);
            int c2 = ah.c(context, R.attr.oj);
            PorterDuff.Mode mode2 = f1630a;
            a(findDrawableByLayerId2, c2, mode2);
            a(layerDrawable2.findDrawableByLayerId(16908303), ah.a(context, R.attr.oh), mode2);
            a(layerDrawable2.findDrawableByLayerId(16908301), ah.a(context, R.attr.oh), mode2);
            return drawable;
        } else if (a(context, i2, drawable) || !z) {
            return drawable;
        } else {
            return null;
        }
    }
}
