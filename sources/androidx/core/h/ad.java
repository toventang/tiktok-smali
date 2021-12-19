package androidx.core.h;

import android.graphics.Insets;
import android.graphics.Rect;
import android.os.Build;
import android.view.DisplayCutout;
import android.view.WindowInsets;
import com.bytedance.covode.number.Covode;
import java.lang.reflect.Constructor;
import java.lang.reflect.Field;
import java.util.Objects;

public class ad {

    /* renamed from: a  reason: collision with root package name */
    public static final ad f2506a = new a().f2508a.a().f2507b.f().f2507b.d().f2507b.c();

    /* renamed from: b  reason: collision with root package name */
    public final e f2507b;

    /* access modifiers changed from: package-private */
    public static class b {

        /* renamed from: a  reason: collision with root package name */
        private final ad f2509a;

        static {
            Covode.recordClassIndex(836);
        }

        /* access modifiers changed from: package-private */
        public void a(androidx.core.graphics.b bVar) {
        }

        /* access modifiers changed from: package-private */
        public ad a() {
            return this.f2509a;
        }

        b() {
            this(new ad((ad) null));
        }

        b(ad adVar) {
            this.f2509a = adVar;
        }
    }

    public static class e {

        /* renamed from: a  reason: collision with root package name */
        final ad f2516a;

        static {
            Covode.recordClassIndex(839);
        }

        /* access modifiers changed from: package-private */
        public boolean a() {
            return false;
        }

        public boolean b() {
            return false;
        }

        /* access modifiers changed from: package-private */
        public c e() {
            return null;
        }

        public ad c() {
            return this.f2516a;
        }

        /* access modifiers changed from: package-private */
        public ad d() {
            return this.f2516a;
        }

        /* access modifiers changed from: package-private */
        public ad f() {
            return this.f2516a;
        }

        public androidx.core.graphics.b g() {
            return androidx.core.graphics.b.f2405a;
        }

        /* access modifiers changed from: package-private */
        public androidx.core.graphics.b h() {
            return androidx.core.graphics.b.f2405a;
        }

        public int hashCode() {
            return androidx.core.g.d.a(Boolean.valueOf(a()), Boolean.valueOf(b()), g(), h(), e());
        }

        e(ad adVar) {
            this.f2516a = adVar;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof e)) {
                return false;
            }
            e eVar = (e) obj;
            if (a() != eVar.a() || b() != eVar.b() || !androidx.core.g.d.a(g(), eVar.g()) || !androidx.core.g.d.a(h(), eVar.h()) || !androidx.core.g.d.a(e(), eVar.e())) {
                return false;
            }
            return true;
        }
    }

    static class c extends b {

        /* renamed from: a  reason: collision with root package name */
        private static Field f2510a;

        /* renamed from: b  reason: collision with root package name */
        private static boolean f2511b;

        /* renamed from: c  reason: collision with root package name */
        private static Constructor<WindowInsets> f2512c;

        /* renamed from: d  reason: collision with root package name */
        private static boolean f2513d;

        /* renamed from: e  reason: collision with root package name */
        private WindowInsets f2514e;

        static {
            Covode.recordClassIndex(837);
        }

        public static int a(String str, String str2, Throwable th) {
            return 0;
        }

        /* access modifiers changed from: package-private */
        @Override // androidx.core.h.ad.b
        public final ad a() {
            return ad.a(this.f2514e);
        }

        c() {
            this.f2514e = b();
        }

        private static WindowInsets b() {
            if (!f2511b) {
                try {
                    f2510a = WindowInsets.class.getDeclaredField("CONSUMED");
                } catch (ReflectiveOperationException e2) {
                    a("WindowInsetsCompat", "Could not retrieve WindowInsets.CONSUMED field", e2);
                }
                f2511b = true;
            }
            Field field = f2510a;
            if (field != null) {
                try {
                    WindowInsets windowInsets = (WindowInsets) field.get(null);
                    if (windowInsets != null) {
                        return new WindowInsets(windowInsets);
                    }
                } catch (ReflectiveOperationException e3) {
                    a("WindowInsetsCompat", "Could not get value from WindowInsets.CONSUMED field", e3);
                }
            }
            if (!f2513d) {
                try {
                    f2512c = WindowInsets.class.getConstructor(Rect.class);
                } catch (ReflectiveOperationException e4) {
                    a("WindowInsetsCompat", "Could not retrieve WindowInsets(Rect) constructor", e4);
                }
                f2513d = true;
            }
            Constructor<WindowInsets> constructor = f2512c;
            if (constructor != null) {
                try {
                    return constructor.newInstance(new Rect());
                } catch (ReflectiveOperationException e5) {
                    a("WindowInsetsCompat", "Could not invoke WindowInsets(Rect) constructor", e5);
                }
            }
            return null;
        }

        c(ad adVar) {
            this.f2514e = adVar.e();
        }

        /* access modifiers changed from: package-private */
        @Override // androidx.core.h.ad.b
        public final void a(androidx.core.graphics.b bVar) {
            WindowInsets windowInsets = this.f2514e;
            if (windowInsets != null) {
                this.f2514e = windowInsets.replaceSystemWindowInsets(bVar.f2406b, bVar.f2407c, bVar.f2408d, bVar.f2409e);
            }
        }
    }

    /* access modifiers changed from: package-private */
    public static class f extends e {

        /* renamed from: b  reason: collision with root package name */
        final WindowInsets f2517b;

        /* renamed from: c  reason: collision with root package name */
        private androidx.core.graphics.b f2518c;

        static {
            Covode.recordClassIndex(840);
        }

        /* access modifiers changed from: package-private */
        @Override // androidx.core.h.ad.e
        public boolean a() {
            return this.f2517b.isRound();
        }

        /* access modifiers changed from: package-private */
        @Override // androidx.core.h.ad.e
        public final androidx.core.graphics.b g() {
            if (this.f2518c == null) {
                this.f2518c = androidx.core.graphics.b.a(this.f2517b.getSystemWindowInsetLeft(), this.f2517b.getSystemWindowInsetTop(), this.f2517b.getSystemWindowInsetRight(), this.f2517b.getSystemWindowInsetBottom());
            }
            return this.f2518c;
        }

        f(ad adVar, WindowInsets windowInsets) {
            super(adVar);
            this.f2517b = windowInsets;
        }

        f(ad adVar, f fVar) {
            this(adVar, new WindowInsets(fVar.f2517b));
        }
    }

    static class g extends f {

        /* renamed from: c  reason: collision with root package name */
        private androidx.core.graphics.b f2519c;

        static {
            Covode.recordClassIndex(841);
        }

        /* access modifiers changed from: package-private */
        @Override // androidx.core.h.ad.e
        public boolean b() {
            return this.f2517b.isConsumed();
        }

        /* access modifiers changed from: package-private */
        @Override // androidx.core.h.ad.e
        public ad c() {
            return ad.a(this.f2517b.consumeSystemWindowInsets());
        }

        /* access modifiers changed from: package-private */
        @Override // androidx.core.h.ad.e
        public ad d() {
            return ad.a(this.f2517b.consumeStableInsets());
        }

        /* access modifiers changed from: package-private */
        @Override // androidx.core.h.ad.e
        public final androidx.core.graphics.b h() {
            if (this.f2519c == null) {
                this.f2519c = androidx.core.graphics.b.a(this.f2517b.getStableInsetLeft(), this.f2517b.getStableInsetTop(), this.f2517b.getStableInsetRight(), this.f2517b.getStableInsetBottom());
            }
            return this.f2519c;
        }

        g(ad adVar, WindowInsets windowInsets) {
            super(adVar, windowInsets);
        }

        g(ad adVar, g gVar) {
            super(adVar, gVar);
        }
    }

    static class h extends g {
        static {
            Covode.recordClassIndex(842);
        }

        @Override // androidx.core.h.ad.e
        public int hashCode() {
            return this.f2517b.hashCode();
        }

        /* access modifiers changed from: package-private */
        @Override // androidx.core.h.ad.e
        public c e() {
            DisplayCutout displayCutout = this.f2517b.getDisplayCutout();
            if (displayCutout == null) {
                return null;
            }
            return new c(displayCutout);
        }

        /* access modifiers changed from: package-private */
        @Override // androidx.core.h.ad.e
        public ad f() {
            return ad.a(this.f2517b.consumeDisplayCutout());
        }

        @Override // androidx.core.h.ad.e
        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof h)) {
                return false;
            }
            return Objects.equals(this.f2517b, ((h) obj).f2517b);
        }

        h(ad adVar, WindowInsets windowInsets) {
            super(adVar, windowInsets);
        }

        h(ad adVar, h hVar) {
            super(adVar, hVar);
        }
    }

    static class d extends b {

        /* renamed from: a  reason: collision with root package name */
        final WindowInsets.Builder f2515a;

        static {
            Covode.recordClassIndex(838);
        }

        d() {
            this.f2515a = new WindowInsets.Builder();
        }

        /* access modifiers changed from: package-private */
        @Override // androidx.core.h.ad.b
        public final ad a() {
            return ad.a(this.f2515a.build());
        }

        d(ad adVar) {
            WindowInsets.Builder builder;
            WindowInsets e2 = adVar.e();
            if (e2 != null) {
                builder = new WindowInsets.Builder(e2);
            } else {
                builder = new WindowInsets.Builder();
            }
            this.f2515a = builder;
        }

        /* access modifiers changed from: package-private */
        @Override // androidx.core.h.ad.b
        public final void a(androidx.core.graphics.b bVar) {
            this.f2515a.setSystemWindowInsets(Insets.of(bVar.f2406b, bVar.f2407c, bVar.f2408d, bVar.f2409e));
        }
    }

    public final int b() {
        return this.f2507b.g().f2407c;
    }

    public final int c() {
        return this.f2507b.g().f2408d;
    }

    public final int d() {
        return this.f2507b.g().f2409e;
    }

    public final WindowInsets e() {
        e eVar = this.f2507b;
        if (eVar instanceof f) {
            return ((f) eVar).f2517b;
        }
        return null;
    }

    public int hashCode() {
        e eVar = this.f2507b;
        if (eVar == null) {
            return 0;
        }
        return eVar.hashCode();
    }

    public final int a() {
        return this.f2507b.g().f2406b;
    }

    public static final class a {

        /* renamed from: a  reason: collision with root package name */
        final b f2508a;

        static {
            Covode.recordClassIndex(835);
        }

        public a() {
            if (Build.VERSION.SDK_INT >= 29) {
                this.f2508a = new d();
            } else if (Build.VERSION.SDK_INT >= 20) {
                this.f2508a = new c();
            } else {
                this.f2508a = new b();
            }
        }

        public final a a(androidx.core.graphics.b bVar) {
            this.f2508a.a(bVar);
            return this;
        }

        public a(ad adVar) {
            if (Build.VERSION.SDK_INT >= 29) {
                this.f2508a = new d(adVar);
            } else if (Build.VERSION.SDK_INT >= 20) {
                this.f2508a = new c(adVar);
            } else {
                this.f2508a = new b(adVar);
            }
        }
    }

    static {
        Covode.recordClassIndex(834);
    }

    public static ad a(WindowInsets windowInsets) {
        return new ad((WindowInsets) androidx.core.g.g.a(windowInsets));
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ad)) {
            return false;
        }
        return androidx.core.g.d.a(this.f2507b, ((ad) obj).f2507b);
    }

    private ad(WindowInsets windowInsets) {
        if (Build.VERSION.SDK_INT >= 29) {
            this.f2507b = new i(this, windowInsets);
        } else if (Build.VERSION.SDK_INT >= 28) {
            this.f2507b = new h(this, windowInsets);
        } else if (Build.VERSION.SDK_INT >= 21) {
            this.f2507b = new g(this, windowInsets);
        } else if (Build.VERSION.SDK_INT >= 20) {
            this.f2507b = new f(this, windowInsets);
        } else {
            this.f2507b = new e(this);
        }
    }

    public ad(ad adVar) {
        if (adVar != null) {
            e eVar = adVar.f2507b;
            if (Build.VERSION.SDK_INT >= 29 && (eVar instanceof i)) {
                this.f2507b = new i(this, (i) eVar);
            } else if (Build.VERSION.SDK_INT >= 28 && (eVar instanceof h)) {
                this.f2507b = new h(this, (h) eVar);
            } else if (Build.VERSION.SDK_INT >= 21 && (eVar instanceof g)) {
                this.f2507b = new g(this, (g) eVar);
            } else if (Build.VERSION.SDK_INT < 20 || !(eVar instanceof f)) {
                this.f2507b = new e(this);
            } else {
                this.f2507b = new f(this, (f) eVar);
            }
        } else {
            this.f2507b = new e(this);
        }
    }

    static class i extends h {
        static {
            Covode.recordClassIndex(843);
        }

        i(ad adVar, WindowInsets windowInsets) {
            super(adVar, windowInsets);
        }

        i(ad adVar, i iVar) {
            super(adVar, iVar);
        }
    }

    public final ad a(int i2, int i3, int i4, int i5) {
        return new a(this).a(androidx.core.graphics.b.a(i2, i3, i4, i5)).f2508a.a();
    }
}
