package com.bytedance.immersionbar;

import android.app.Activity;
import android.app.Dialog;
import android.view.View;
import android.view.ViewGroup;
import android.view.Window;
import android.view.WindowManager;
import android.widget.FrameLayout;
import androidx.core.content.b;
import androidx.core.graphics.a;
import androidx.drawerlayout.widget.DrawerLayout;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.d;
import androidx.lifecycle.m;
import com.bytedance.covode.number.Covode;
import com.bytedance.frameworks.apm.trace.MethodCollector;
import com.zhiliaoapp.musically.R;
import java.lang.reflect.Method;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;

public final class e {

    /* renamed from: a  reason: collision with root package name */
    static Map<String, e> f38899a = new HashMap();

    /* renamed from: e  reason: collision with root package name */
    private static final int f38900e = R.id.bnn;

    /* renamed from: b  reason: collision with root package name */
    public c f38901b;

    /* renamed from: c  reason: collision with root package name */
    String f38902c;

    /* renamed from: d  reason: collision with root package name */
    boolean f38903d = false;

    /* renamed from: f  reason: collision with root package name */
    private androidx.fragment.app.e f38904f;

    /* renamed from: g  reason: collision with root package name */
    private Fragment f38905g;

    /* renamed from: h  reason: collision with root package name */
    private Dialog f38906h;

    /* renamed from: i  reason: collision with root package name */
    private Window f38907i;

    /* renamed from: j  reason: collision with root package name */
    private ViewGroup f38908j;

    /* renamed from: k  reason: collision with root package name */
    private ViewGroup f38909k;

    /* renamed from: l  reason: collision with root package name */
    private e f38910l;

    /* renamed from: m  reason: collision with root package name */
    private a f38911m;
    private boolean n;
    private Map<String, c> o = new HashMap();
    private boolean p = false;

    public final e a(int i2) {
        return b(b.c(this.f38904f, i2));
    }

    public final e a(boolean z) {
        this.f38901b.f38891j = z;
        this.f38901b.f38893l = 0.2f;
        this.f38901b.f38892k = z;
        this.f38901b.f38894m = 0.2f;
        return this;
    }

    public final e a(b bVar) {
        this.f38901b.f38888g = bVar;
        if (f.f38913a == 19 || f.b()) {
            if (this.f38901b.f38888g == b.FLAG_HIDE_NAVIGATION_BAR || this.f38901b.f38888g == b.FLAG_HIDE_BAR) {
                this.f38901b.f38887f = true;
            } else {
                this.f38901b.f38887f = false;
            }
        }
        return this;
    }

    private static boolean a(View view) {
        if (view.getFitsSystemWindows()) {
            return true;
        }
        if (view instanceof ViewGroup) {
            ViewGroup viewGroup = (ViewGroup) view;
            int childCount = viewGroup.getChildCount();
            for (int i2 = 0; i2 < childCount; i2++) {
                View childAt = viewGroup.getChildAt(i2);
                if (((childAt instanceof DrawerLayout) && a(childAt)) || childAt.getFitsSystemWindows()) {
                    return true;
                }
            }
        }
        return false;
    }

    public final e a() {
        this.f38901b.f38882a = 0;
        return this;
    }

    private void n() {
        ViewGroup viewGroup = this.f38909k;
        if (viewGroup != null) {
            viewGroup.setPadding(0, 0, 0, 0);
        }
    }

    private static boolean p() {
        if (f.a() || f.f38913a >= 26) {
            return true;
        }
        return false;
    }

    public final e b() {
        this.f38901b.f38883b = 0;
        this.f38901b.f38886e = true;
        return this;
    }

    public final e c() {
        this.f38901b.f38882a = 0;
        this.f38901b.f38883b = 0;
        this.f38901b.f38886e = true;
        return this;
    }

    public final void d() {
        f();
        g();
        this.f38903d = true;
    }

    static {
        Covode.recordClassIndex(23843);
    }

    private void e() {
        if (this.f38910l == null) {
            this.f38910l = a(this.f38904f);
        }
        e eVar = this.f38910l;
        if (!eVar.f38903d) {
            eVar.d();
        }
    }

    private void h() {
        if (f.f38913a >= 28 && !this.p) {
            WindowManager.LayoutParams attributes = this.f38907i.getAttributes();
            attributes.layoutInDisplayCutoutMode = 1;
            this.f38907i.setAttributes(attributes);
            this.p = true;
        }
    }

    private void j() {
        this.f38907i.addFlags(67108864);
        k();
        this.f38907i.clearFlags(134217728);
    }

    private void m() {
        if (!a(this.f38908j.findViewById(16908290))) {
            n();
        }
    }

    private static boolean o() {
        if (f.a() || f.c() || f.f38913a >= 23) {
            return true;
        }
        return false;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: com.bytedance.immersionbar.e$1  reason: invalid class name */
    public static /* synthetic */ class AnonymousClass1 {

        /* renamed from: a  reason: collision with root package name */
        static final /* synthetic */ int[] f38912a;

        /* JADX WARNING: Can't wrap try/catch for region: R(8:0|1|2|3|4|5|6|(3:7|8|10)) */
        /* JADX WARNING: Failed to process nested try/catch */
        /* JADX WARNING: Missing exception handler attribute for start block: B:3:0x0017 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:5:0x0022 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:7:0x002d */
        static {
            /*
                r0 = 23844(0x5d24, float:3.3413E-41)
                com.bytedance.covode.number.Covode.recordClassIndex(r0)
                com.bytedance.immersionbar.b[] r0 = com.bytedance.immersionbar.b.values()
                int r0 = r0.length
                int[] r2 = new int[r0]
                com.bytedance.immersionbar.e.AnonymousClass1.f38912a = r2
                com.bytedance.immersionbar.b r0 = com.bytedance.immersionbar.b.FLAG_HIDE_BAR     // Catch:{ NoSuchFieldError -> 0x0017 }
                int r1 = r0.ordinal()     // Catch:{ NoSuchFieldError -> 0x0017 }
                r0 = 1
                r2[r1] = r0     // Catch:{ NoSuchFieldError -> 0x0017 }
            L_0x0017:
                int[] r2 = com.bytedance.immersionbar.e.AnonymousClass1.f38912a     // Catch:{ NoSuchFieldError -> 0x0022 }
                com.bytedance.immersionbar.b r0 = com.bytedance.immersionbar.b.FLAG_HIDE_STATUS_BAR     // Catch:{ NoSuchFieldError -> 0x0022 }
                int r1 = r0.ordinal()     // Catch:{ NoSuchFieldError -> 0x0022 }
                r0 = 2
                r2[r1] = r0     // Catch:{ NoSuchFieldError -> 0x0022 }
            L_0x0022:
                int[] r2 = com.bytedance.immersionbar.e.AnonymousClass1.f38912a     // Catch:{ NoSuchFieldError -> 0x002d }
                com.bytedance.immersionbar.b r0 = com.bytedance.immersionbar.b.FLAG_HIDE_NAVIGATION_BAR     // Catch:{ NoSuchFieldError -> 0x002d }
                int r1 = r0.ordinal()     // Catch:{ NoSuchFieldError -> 0x002d }
                r0 = 3
                r2[r1] = r0     // Catch:{ NoSuchFieldError -> 0x002d }
            L_0x002d:
                int[] r2 = com.bytedance.immersionbar.e.AnonymousClass1.f38912a     // Catch:{ NoSuchFieldError -> 0x0038 }
                com.bytedance.immersionbar.b r0 = com.bytedance.immersionbar.b.FLAG_SHOW_BAR     // Catch:{ NoSuchFieldError -> 0x0038 }
                int r1 = r0.ordinal()     // Catch:{ NoSuchFieldError -> 0x0038 }
                r0 = 4
                r2[r1] = r0     // Catch:{ NoSuchFieldError -> 0x0038 }
            L_0x0038:
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: com.bytedance.immersionbar.e.AnonymousClass1.<clinit>():void");
        }
    }

    private void f() {
        e eVar;
        l();
        if (f.f38913a >= 19) {
            this.f38911m = new a(this.f38904f);
            if (this.n && (eVar = f38899a.get(this.f38904f.toString())) != null) {
                eVar.f38901b = this.f38901b;
            }
        }
    }

    private void l() {
        boolean z;
        boolean z2 = true;
        if (this.f38901b.f38891j) {
            if (this.f38901b.f38882a == 0 || this.f38901b.f38882a <= -4539718) {
                z = false;
            } else {
                z = true;
            }
            a(z, this.f38901b.f38893l);
        }
        if (this.f38901b.f38892k) {
            if (this.f38901b.f38883b == 0 || this.f38901b.f38883b <= -4539718) {
                z2 = false;
            }
            b(z2, this.f38901b.f38894m);
        }
    }

    private void g() {
        if (f.f38913a >= 19) {
            int i2 = 256;
            if (f.f38913a < 21 || f.b()) {
                j();
            } else {
                h();
                i2 = g(f(i()));
            }
            int e2 = e(i2);
            m();
            this.f38908j.setSystemUiVisibility(e2);
        }
        if (f.a()) {
            a(this.f38907i, "EXTRA_FLAG_STATUS_BAR_DARK_MODE", this.f38901b.f38889h);
            if (this.f38901b.u) {
                a(this.f38907i, "EXTRA_FLAG_NAVIGATION_BAR_DARK_MODE", this.f38901b.f38890i);
            }
        }
        if (!f.c()) {
            return;
        }
        if (this.f38901b.t != 0) {
            d.a(this.f38904f, this.f38901b.t);
        } else {
            d.a((Activity) this.f38904f, this.f38901b.f38889h, true);
        }
    }

    private int i() {
        int i2;
        if (!this.f38901b.f38886e || !this.f38901b.u) {
            i2 = 1280;
        } else {
            i2 = 1792;
        }
        this.f38907i.clearFlags(67108864);
        this.f38907i.clearFlags(134217728);
        this.f38907i.addFlags(Integer.MIN_VALUE);
        if (this.f38901b.n) {
            this.f38907i.setStatusBarColor(a.b(this.f38901b.f38882a, this.f38901b.o, this.f38901b.f38884c));
        } else {
            this.f38907i.setStatusBarColor(a.b(this.f38901b.f38882a, 0, this.f38901b.f38884c));
        }
        if (this.f38901b.u && f.f38913a >= 26) {
            this.f38907i.setNavigationBarColor(a.b(this.f38901b.f38883b, this.f38901b.p, this.f38901b.f38885d));
        }
        return i2;
    }

    private void k() {
        MethodCollector.i(6927);
        ViewGroup viewGroup = this.f38908j;
        int i2 = f38900e;
        View findViewById = viewGroup.findViewById(i2);
        if (findViewById == null) {
            findViewById = new View(this.f38904f);
            FrameLayout.LayoutParams layoutParams = new FrameLayout.LayoutParams(-1, this.f38911m.f38880a);
            layoutParams.gravity = 48;
            findViewById.setLayoutParams(layoutParams);
            findViewById.setVisibility(0);
            findViewById.setId(i2);
            this.f38908j.addView(findViewById);
        }
        if (this.f38901b.n) {
            findViewById.setBackgroundColor(a.b(this.f38901b.f38882a, this.f38901b.o, this.f38901b.f38884c));
            MethodCollector.o(6927);
            return;
        }
        findViewById.setBackgroundColor(a.b(this.f38901b.f38882a, 0, this.f38901b.f38884c));
        MethodCollector.o(6927);
    }

    public final e b(int i2) {
        this.f38901b.f38882a = i2;
        return this;
    }

    public final e c(boolean z) {
        return b(z, 0.2f);
    }

    public final e d(int i2) {
        this.f38901b.f38883b = i2;
        return this;
    }

    private void a(m mVar) {
        mVar.getLifecycle().a(new ImmersionBar$1(this));
    }

    private int f(int i2) {
        if (f.f38913a < 23 || !this.f38901b.f38889h) {
            return i2;
        }
        return i2 | 8192;
    }

    private int g(int i2) {
        if (f.f38913a < 26 || !this.f38901b.f38890i) {
            return i2;
        }
        return i2 | 16;
    }

    public static e a(androidx.fragment.app.e eVar) {
        String obj = eVar.toString();
        e eVar2 = f38899a.get(obj);
        if (eVar2 != null) {
            return eVar2;
        }
        e eVar3 = new e(eVar, obj);
        f38899a.put(obj, eVar3);
        return eVar3;
    }

    public final e c(int i2) {
        return d(b.c(this.f38904f, i2));
    }

    public static e a(Fragment fragment) {
        a(fragment.getActivity(), "Activity cannot be null");
        String str = fragment.getActivity().toString() + fragment.toString();
        e eVar = f38899a.get(str);
        if (eVar != null) {
            return eVar;
        }
        e eVar2 = new e(fragment, str);
        f38899a.put(str, eVar2);
        return eVar2;
    }

    private int e(int i2) {
        if (f.f38913a >= 16) {
            int i3 = AnonymousClass1.f38912a[this.f38901b.f38888g.ordinal()];
            if (i3 == 1) {
                i2 |= 518;
            } else if (i3 == 2) {
                i2 |= 1028;
            } else if (i3 == 3) {
                i2 |= 514;
            } else if (i3 == 4) {
                i2 |= 0;
            }
        }
        return i2 | 4096;
    }

    public final e b(boolean z) {
        return a(z, 0.2f);
    }

    public static e a(d dVar) {
        a(dVar.getActivity(), "Activity cannot be null");
        String str = dVar.getActivity().toString() + dVar.toString();
        e eVar = f38899a.get(str);
        if (eVar != null) {
            return eVar;
        }
        e eVar2 = new e(dVar, str);
        f38899a.put(str, eVar2);
        return eVar2;
    }

    private static <T> void a(T t, String str) {
        Objects.requireNonNull(t, str);
    }

    private e b(boolean z, float f2) {
        this.f38901b.f38890i = z;
        if (!z || p()) {
            this.f38901b.f38885d = 0.0f;
        } else {
            this.f38901b.f38885d = f2;
        }
        return this;
    }

    private e(Fragment fragment, String str) {
        this.f38904f = fragment.getActivity();
        this.f38905g = fragment;
        this.n = true;
        e();
        a(this.f38904f.getWindow(), str);
        a((m) this.f38905g);
    }

    private e(d dVar, String str) {
        this.f38904f = dVar.getActivity();
        this.f38905g = dVar;
        Dialog dialog = dVar.getDialog();
        this.f38906h = dialog;
        a(dialog, "dialog in DialogFragment cannot be null");
        e();
        a(this.f38906h.getWindow(), str);
        a((m) this.f38905g);
    }

    public static e a(androidx.fragment.app.e eVar, Dialog dialog) {
        String str = eVar.toString() + dialog.toString();
        e eVar2 = f38899a.get(str);
        if (eVar2 != null) {
            return eVar2;
        }
        e eVar3 = new e(eVar, dialog, str);
        f38899a.put(str, eVar3);
        return eVar3;
    }

    private e(androidx.fragment.app.e eVar, String str) {
        this.f38904f = eVar;
        a(eVar.getWindow(), str);
        a((m) this.f38904f);
    }

    public static e a(androidx.fragment.app.e eVar, Window window) {
        String str = eVar.toString() + window.toString();
        e eVar2 = f38899a.get(str);
        if (eVar2 != null) {
            return eVar2;
        }
        e eVar3 = new e(eVar, window, str);
        f38899a.put(str, eVar3);
        return eVar3;
    }

    private e a(boolean z, float f2) {
        this.f38901b.f38889h = z;
        if (!z || o()) {
            this.f38901b.t = 0;
            this.f38901b.f38884c = 0.0f;
        } else {
            this.f38901b.f38884c = f2;
        }
        return this;
    }

    private void a(Window window, String str) {
        boolean z;
        this.f38907i = window;
        this.f38902c = str;
        ViewGroup viewGroup = (ViewGroup) window.getDecorView();
        this.f38908j = viewGroup;
        this.f38909k = (ViewGroup) viewGroup.findViewById(16908290);
        this.f38901b = new c();
        if (f.f38913a >= 21) {
            d(window.getNavigationBarColor());
            b(window.getStatusBarColor());
        }
        int systemUiVisibility = window.getDecorView().getSystemUiVisibility();
        boolean z2 = true;
        if (f.f38913a >= 23) {
            if ((systemUiVisibility & 8192) != 0) {
                z = true;
            } else {
                z = false;
            }
            b(z);
        }
        if (f.f38913a >= 26) {
            if ((systemUiVisibility & 16) == 0) {
                z2 = false;
            }
            c(z2);
        }
    }

    private e(androidx.fragment.app.e eVar, Window window, String str) {
        this.f38904f = eVar;
        e();
        a(window, str);
        a((m) this.f38904f);
    }

    private e(androidx.fragment.app.e eVar, Dialog dialog, String str) {
        this.f38904f = eVar;
        this.f38906h = dialog;
        e();
        a(this.f38906h.getWindow(), str);
        a((m) this.f38904f);
    }

    private static void a(Window window, String str, boolean z) {
        if (window != null) {
            Class<?> cls = window.getClass();
            try {
                Class<?> cls2 = Class.forName("android.view.MiuiWindowManager$LayoutParams");
                int i2 = cls2.getField(str).getInt(cls2);
                Method method = cls.getMethod("setExtraFlags", Integer.TYPE, Integer.TYPE);
                if (z) {
                    method.invoke(window, Integer.valueOf(i2), Integer.valueOf(i2));
                    return;
                }
                method.invoke(window, 0, Integer.valueOf(i2));
            } catch (Exception unused) {
            }
        }
    }
}
