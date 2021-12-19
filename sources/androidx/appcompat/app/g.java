package androidx.appcompat.app;

import android.app.Activity;
import android.app.Dialog;
import android.app.UiModeManager;
import android.content.BroadcastReceiver;
import android.content.ClipboardManager;
import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import android.content.pm.PackageManager;
import android.content.res.Configuration;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.os.Build;
import android.os.Bundle;
import android.os.Handler;
import android.os.Looper;
import android.text.TextUtils;
import android.util.AndroidRuntimeException;
import android.util.AttributeSet;
import android.util.DisplayMetrics;
import android.util.TypedValue;
import android.view.ActionMode;
import android.view.KeyCharacterMap;
import android.view.KeyEvent;
import android.view.KeyboardShortcutGroup;
import android.view.LayoutInflater;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewConfiguration;
import android.view.ViewGroup;
import android.view.ViewParent;
import android.view.Window;
import android.view.WindowManager;
import android.widget.PopupWindow;
import android.widget.TextView;
import androidx.appcompat.app.b;
import androidx.appcompat.view.b;
import androidx.appcompat.view.f;
import androidx.appcompat.view.i;
import androidx.appcompat.view.menu.h;
import androidx.appcompat.view.menu.o;
import androidx.appcompat.view.menu.p;
import androidx.appcompat.widget.ActionBarContextView;
import androidx.appcompat.widget.ContentFrameLayout;
import androidx.appcompat.widget.Toolbar;
import androidx.appcompat.widget.ViewStubCompat;
import androidx.appcompat.widget.al;
import androidx.appcompat.widget.u;
import androidx.core.h.aa;
import androidx.core.h.ab;
import androidx.core.h.v;
import androidx.core.h.z;
import com.bytedance.covode.number.Covode;
import com.bytedance.sysoptimizer.ReceiverRegisterCrashOptimizer;
import com.ss.android.ugc.aweme.lancet.i;
import com.zhiliaoapp.musically.R;
import java.lang.Thread;
import java.lang.reflect.Field;
import java.util.List;

/* access modifiers changed from: package-private */
public final class g extends f implements LayoutInflater.Factory2, h.a {
    private static final boolean x;
    private static final int[] y = {16842836};
    private static boolean z = true;
    private CharSequence A;
    private u B;
    private b C;
    private h D;
    private boolean E;
    private TextView F;
    private View G;
    private boolean H;
    private boolean I;
    private boolean J;
    private C0019g[] K;
    private C0019g L;
    private boolean M;
    private int N = -100;
    private boolean O;
    private e P;
    private final Runnable Q = new Runnable() {
        /* class androidx.appcompat.app.g.AnonymousClass2 */

        static {
            Covode.recordClassIndex(257);
        }

        public final void run() {
            if ((g.this.w & 1) != 0) {
                g.this.f(0);
            }
            if ((g.this.w & 4096) != 0) {
                g.this.f(108);
            }
            g.this.v = false;
            g.this.w = 0;
        }
    };
    private boolean R;
    private Rect S;
    private Rect T;
    private AppCompatViewInflater U;

    /* renamed from: b  reason: collision with root package name */
    final Context f906b;

    /* renamed from: c  reason: collision with root package name */
    final Window f907c;

    /* renamed from: d  reason: collision with root package name */
    final Window.Callback f908d;

    /* renamed from: e  reason: collision with root package name */
    final Window.Callback f909e;

    /* renamed from: f  reason: collision with root package name */
    final e f910f;

    /* renamed from: g  reason: collision with root package name */
    public a f911g;

    /* renamed from: h  reason: collision with root package name */
    MenuInflater f912h;

    /* renamed from: i  reason: collision with root package name */
    androidx.appcompat.view.b f913i;

    /* renamed from: j  reason: collision with root package name */
    ActionBarContextView f914j;

    /* renamed from: k  reason: collision with root package name */
    PopupWindow f915k;

    /* renamed from: l  reason: collision with root package name */
    Runnable f916l;

    /* renamed from: m  reason: collision with root package name */
    z f917m;
    boolean n = true;
    public ViewGroup o;
    boolean p;
    boolean q;
    boolean r;
    boolean s;
    boolean t;
    boolean u;
    boolean v;
    int w;

    private static void a(WindowManager windowManager, View view) {
        if (!((Boolean) com.bytedance.helios.sdk.a.a(windowManager, new Object[]{view}, 102801, "void", false, null).first).booleanValue()) {
            windowManager.removeView(view);
            com.bytedance.helios.sdk.a.a(null, windowManager, new Object[]{view}, 102801, "androidx_appcompat_app_AppCompatDelegateImpl_android_view_WindowManager_removeView(Landroid/view/WindowManager;Landroid/view/View;)V");
        }
    }

    private static void a(WindowManager windowManager, View view, ViewGroup.LayoutParams layoutParams) {
        if (!((Boolean) com.bytedance.helios.sdk.a.a(windowManager, new Object[]{view, layoutParams}, 102800, "void", false, null).first).booleanValue()) {
            windowManager.addView(view, layoutParams);
            com.bytedance.helios.sdk.a.a(null, windowManager, new Object[]{view, layoutParams}, 102800, "androidx_appcompat_app_AppCompatDelegateImpl_android_view_WindowManager_addView(Landroid/view/WindowManager;Landroid/view/View;Landroid/view/ViewGroup$LayoutParams;)V");
        }
    }

    private static int i(int i2) {
        if (i2 == 8) {
            return 108;
        }
        if (i2 == 9) {
            return 109;
        }
        return i2;
    }

    @Override // androidx.appcompat.app.f
    public final void c() {
        r();
    }

    @Override // androidx.appcompat.app.f
    public final void d() {
        k();
    }

    @Override // androidx.appcompat.app.f
    public final void a(Bundle bundle) {
        Window.Callback callback = this.f908d;
        if (callback instanceof Activity) {
            String str = null;
            try {
                str = androidx.core.app.g.b((Activity) callback);
            } catch (IllegalArgumentException unused) {
            }
            if (str != null) {
                a aVar = this.f911g;
                if (aVar == null) {
                    this.R = true;
                } else {
                    aVar.b(true);
                }
            }
        }
        if (bundle != null && this.N == -100) {
            this.N = bundle.getInt("appcompat:local_night_mode", -100);
        }
    }

    @Override // androidx.appcompat.app.f
    public final void a(Toolbar toolbar) {
        if (this.f908d instanceof Activity) {
            a a2 = a();
            if (!(a2 instanceof m)) {
                this.f912h = null;
                if (a2 != null) {
                    a2.j();
                }
                if (toolbar != null) {
                    j jVar = new j(toolbar, ((Activity) this.f908d).getTitle(), this.f909e);
                    this.f911g = jVar;
                    this.f907c.setCallback(jVar.f958c);
                } else {
                    this.f911g = null;
                    this.f907c.setCallback(this.f909e);
                }
                g();
                return;
            }
            throw new IllegalStateException("This Activity already has an action bar supplied by the window decor. Do not request Window.FEATURE_SUPPORT_ACTION_BAR and set windowActionBar to false in your theme to use a Toolbar instead.");
        }
    }

    @Override // androidx.appcompat.app.f
    public final void a(Configuration configuration) {
        a a2;
        if (this.p && this.E && (a2 = a()) != null) {
            a2.a(configuration);
        }
        androidx.appcompat.widget.h.a().a(this.f906b);
        k();
    }

    @Override // androidx.appcompat.app.f
    public final void a(View view) {
        r();
        ViewGroup viewGroup = (ViewGroup) this.o.findViewById(16908290);
        viewGroup.removeAllViews();
        viewGroup.addView(view);
        this.f908d.onContentChanged();
    }

    @Override // androidx.appcompat.app.f
    public final void a(View view, ViewGroup.LayoutParams layoutParams) {
        r();
        ViewGroup viewGroup = (ViewGroup) this.o.findViewById(16908290);
        viewGroup.removeAllViews();
        viewGroup.addView(view, layoutParams);
        this.f908d.onContentChanged();
    }

    @Override // androidx.appcompat.app.f
    public final void a(CharSequence charSequence) {
        this.A = charSequence;
        u uVar = this.B;
        if (uVar != null) {
            uVar.setWindowTitle(charSequence);
            return;
        }
        a aVar = this.f911g;
        if (aVar != null) {
            aVar.a(charSequence);
            return;
        }
        TextView textView = this.F;
        if (textView != null) {
            textView.setText(charSequence);
        }
    }

    @Override // androidx.appcompat.app.f
    public final androidx.appcompat.view.b a(b.a aVar) {
        e eVar;
        if (aVar != null) {
            androidx.appcompat.view.b bVar = this.f913i;
            if (bVar != null) {
                bVar.c();
            }
            c cVar = new c(aVar);
            a a2 = a();
            if (a2 != null) {
                androidx.appcompat.view.b a3 = a2.a(cVar);
                this.f913i = a3;
                if (!(a3 == null || (eVar = this.f910f) == null)) {
                    eVar.onSupportActionModeStarted(a3);
                }
            }
            if (this.f913i == null) {
                this.f913i = b(cVar);
            }
            return this.f913i;
        }
        throw new IllegalArgumentException("ActionMode callback can not be null.");
    }

    /* access modifiers changed from: package-private */
    public final boolean a(int i2, KeyEvent keyEvent) {
        a a2 = a();
        if (a2 != null && a2.a(i2, keyEvent)) {
            return true;
        }
        C0019g gVar = this.L;
        if (gVar == null || !a(gVar, keyEvent.getKeyCode(), keyEvent)) {
            if (this.L == null) {
                C0019g e2 = e(0);
                b(e2, keyEvent);
                boolean a3 = a(e2, keyEvent.getKeyCode(), keyEvent);
                e2.f951m = false;
                if (a3) {
                    return true;
                }
            }
            return false;
        }
        C0019g gVar2 = this.L;
        if (gVar2 != null) {
            gVar2.n = true;
        }
        return true;
    }

    /* access modifiers changed from: package-private */
    /* JADX WARNING: Code restructure failed: missing block: B:66:0x00c4, code lost:
        if (r0 != false) goto L_0x00c6;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:82:0x00f9, code lost:
        if (b(r1, r7) != false) goto L_0x00fb;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final boolean a(android.view.KeyEvent r7) {
        /*
        // Method dump skipped, instructions count: 256
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.appcompat.app.g.a(android.view.KeyEvent):boolean");
    }

    /* access modifiers changed from: package-private */
    public final void a(C0019g gVar, boolean z2) {
        u uVar;
        if (!z2 || gVar.f939a != 0 || (uVar = this.B) == null || !uVar.c()) {
            WindowManager windowManager = (WindowManager) a(this.f906b, "window");
            if (!(windowManager == null || !gVar.o || gVar.f945g == null)) {
                a(windowManager, gVar.f945g);
                if (z2) {
                    a(gVar.f939a, gVar, (Menu) null);
                }
            }
            gVar.f951m = false;
            gVar.n = false;
            gVar.o = false;
            gVar.f946h = null;
            gVar.q = true;
            if (this.L == gVar) {
                this.L = null;
                return;
            }
            return;
        }
        b(gVar.f948j);
    }

    /* access modifiers changed from: package-private */
    /* JADX WARNING: Code restructure failed: missing block: B:11:0x0016, code lost:
        if (r4 != null) goto L_0x0011;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:6:0x000d, code lost:
        if (r4 != null) goto L_0x000f;
     */
    /* JADX WARNING: Removed duplicated region for block: B:14:0x001d  */
    /* JADX WARNING: Removed duplicated region for block: B:16:? A[RETURN, SYNTHETIC] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void a(int r3, androidx.appcompat.app.g.C0019g r4, android.view.Menu r5) {
        /*
            r2 = this;
            if (r5 != 0) goto L_0x0016
            if (r4 != 0) goto L_0x000f
            if (r3 < 0) goto L_0x0019
            androidx.appcompat.app.g$g[] r1 = r2.K
            int r0 = r1.length
            if (r3 >= r0) goto L_0x0019
            r4 = r1[r3]
            if (r4 == 0) goto L_0x0019
        L_0x000f:
            androidx.appcompat.view.menu.h r5 = r4.f948j
        L_0x0011:
            boolean r0 = r4.o
            if (r0 != 0) goto L_0x0019
            return
        L_0x0016:
            if (r4 == 0) goto L_0x0019
            goto L_0x0011
        L_0x0019:
            boolean r0 = r2.u
            if (r0 != 0) goto L_0x0022
            android.view.Window$Callback r0 = r2.f908d
            r0.onPanelClosed(r3, r5)
        L_0x0022:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.appcompat.app.g.a(int, androidx.appcompat.app.g$g, android.view.Menu):void");
    }

    /* access modifiers changed from: package-private */
    public final C0019g a(Menu menu) {
        C0019g[] gVarArr = this.K;
        if (gVarArr == null) {
            return null;
        }
        for (C0019g gVar : gVarArr) {
            if (gVar != null && gVar.f948j == menu) {
                return gVar;
            }
        }
        return null;
    }

    @Override // androidx.appcompat.view.menu.h.a
    public final boolean a(androidx.appcompat.view.menu.h hVar, MenuItem menuItem) {
        C0019g a2;
        Window.Callback callback = this.f907c.getCallback();
        if (callback == null || this.u || (a2 = a((Menu) hVar.l())) == null) {
            return false;
        }
        return callback.onMenuItemSelected(a2.f939a, menuItem);
    }

    @Override // androidx.appcompat.view.menu.h.a
    public final void a(androidx.appcompat.view.menu.h hVar) {
        u uVar = this.B;
        if (uVar == null || !uVar.b() || (ViewConfiguration.get(this.f906b).hasPermanentMenuKey() && !this.B.d())) {
            C0019g e2 = e(0);
            e2.q = true;
            a(e2, false);
            a(e2, (KeyEvent) null);
            return;
        }
        Window.Callback callback = this.f907c.getCallback();
        if (this.B.c()) {
            this.B.f();
            if (!this.u) {
                callback.onPanelClosed(108, e(0).f948j);
            }
        } else if (callback != null && !this.u) {
            if (this.v && (1 & this.w) != 0) {
                this.f907c.getDecorView().removeCallbacks(this.Q);
                this.Q.run();
            }
            C0019g e3 = e(0);
            if (e3.f948j != null && !e3.r && callback.onPreparePanel(0, e3.f947i, e3.f948j)) {
                callback.onMenuOpened(108, e3.f948j);
                this.B.e();
            }
        }
    }

    @Override // androidx.appcompat.app.f
    public final a a() {
        p();
        return this.f911g;
    }

    @Override // androidx.appcompat.app.f
    public final b.a i() {
        return new a();
    }

    /* access modifiers changed from: package-private */
    public final void m() {
        z zVar = this.f917m;
        if (zVar != null) {
            zVar.b();
        }
    }

    /* access modifiers changed from: package-private */
    public final class e {

        /* renamed from: a  reason: collision with root package name */
        l f932a;

        /* renamed from: b  reason: collision with root package name */
        boolean f933b;

        /* renamed from: d  reason: collision with root package name */
        private BroadcastReceiver f935d;

        /* renamed from: e  reason: collision with root package name */
        private IntentFilter f936e;

        static {
            Covode.recordClassIndex(269);
        }

        /* access modifiers changed from: package-private */
        public final int a() {
            boolean a2 = this.f932a.a();
            this.f933b = a2;
            if (a2) {
                return 2;
            }
            return 1;
        }

        /* access modifiers changed from: package-private */
        public final void c() {
            if (this.f935d != null) {
                g.this.f906b.unregisterReceiver(this.f935d);
                this.f935d = null;
            }
        }

        /* access modifiers changed from: package-private */
        public final void b() {
            c();
            if (this.f935d == null) {
                this.f935d = new BroadcastReceiver() {
                    /* class androidx.appcompat.app.g.e.AnonymousClass1 */

                    static {
                        Covode.recordClassIndex(270);
                    }

                    public final void onReceive(Context context, Intent intent) {
                        e eVar = e.this;
                        boolean a2 = eVar.f932a.a();
                        if (a2 != eVar.f933b) {
                            eVar.f933b = a2;
                            g.this.k();
                        }
                    }
                };
            }
            if (this.f936e == null) {
                IntentFilter intentFilter = new IntentFilter();
                this.f936e = intentFilter;
                intentFilter.addAction("android.intent.action.TIME_SET");
                this.f936e.addAction("android.intent.action.TIMEZONE_CHANGED");
                this.f936e.addAction("android.intent.action.TIME_TICK");
            }
            b(g.this.f906b, this.f935d, this.f936e);
        }

        e(l lVar) {
            this.f932a = lVar;
            this.f933b = lVar.a();
        }

        private static Intent a(Context context, BroadcastReceiver broadcastReceiver, IntentFilter intentFilter) {
            try {
                return context.registerReceiver(broadcastReceiver, intentFilter);
            } catch (Exception e2) {
                if (ReceiverRegisterCrashOptimizer.fixedOpen()) {
                    return ReceiverRegisterCrashOptimizer.registerReceiver(broadcastReceiver, intentFilter);
                }
                throw e2;
            }
        }

        /* JADX DEBUG: Multi-variable search result rejected for r2v3, resolved type: java.lang.IllegalArgumentException */
        /* JADX WARN: Multi-variable type inference failed */
        /* JADX WARNING: Code restructure failed: missing block: B:10:0x0018, code lost:
            r0 = r2.getMessage().contains("regist too many Broadcast Receivers");
            r2 = r2;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:11:0x0022, code lost:
            if (r0 != false) goto L_0x0025;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:12:0x0025, code lost:
            throw r2;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:13:0x0026, code lost:
            r2 = move-exception;
            r2 = r2;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:14:0x0027, code lost:
            com.bytedance.c.a.a.a.b.a(r2, "Register Receiver Exception");
         */
        /* JADX WARNING: Code restructure failed: missing block: B:15:0x002d, code lost:
            return null;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:6:0x0010, code lost:
            return com.ss.android.ugc.aweme.lancet.receiver.ReceiverRegisterLancetHelper.registerReceiver(r2, r3);
         */
        /* JADX WARNING: Code restructure failed: missing block: B:7:0x0011, code lost:
            r2 = move-exception;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:8:0x0012, code lost:
            r0 = r2.getMessage();
            r2 = r2;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:9:0x0016, code lost:
            if (r0 != null) goto L_0x0018;
         */
        /* JADX WARNING: Failed to process nested try/catch */
        /* JADX WARNING: Missing exception handler attribute for start block: B:4:0x000c */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        private static android.content.Intent b(android.content.Context r1, android.content.BroadcastReceiver r2, android.content.IntentFilter r3) {
            /*
                android.app.Application r0 = com.bytedance.ies.ugc.appcontext.g.a()
                com.ss.android.ugc.aweme.lancet.receiver.a.a(r0)
                android.content.Intent r0 = a(r1, r2, r3)     // Catch:{ Exception -> 0x000c }
                return r0
            L_0x000c:
                android.content.Intent r0 = com.ss.android.ugc.aweme.lancet.receiver.ReceiverRegisterLancetHelper.registerReceiver(r2, r3)     // Catch:{ SecurityException -> 0x0026, IllegalArgumentException -> 0x0011 }
                return r0
            L_0x0011:
                r2 = move-exception
                java.lang.String r0 = r2.getMessage()
                if (r0 == 0) goto L_0x0027
                java.lang.String r1 = r2.getMessage()
                java.lang.String r0 = "regist too many Broadcast Receivers"
                boolean r0 = r1.contains(r0)
                if (r0 != 0) goto L_0x0025
                goto L_0x0027
            L_0x0025:
                throw r2
            L_0x0026:
                r2 = move-exception
            L_0x0027:
                java.lang.String r0 = "Register Receiver Exception"
                com.bytedance.c.a.a.a.b.a(r2, r0)
                r0 = 0
                return r0
            */
            throw new UnsupportedOperationException("Method not decompiled: androidx.appcompat.app.g.e.b(android.content.Context, android.content.BroadcastReceiver, android.content.IntentFilter):android.content.Intent");
        }
    }

    private Context q() {
        Context d2;
        a a2 = a();
        if (a2 == null || (d2 = a2.d()) == null) {
            return this.f906b;
        }
        return d2;
    }

    private CharSequence u() {
        Window.Callback callback = this.f908d;
        if (callback instanceof Activity) {
            return ((Activity) callback).getTitle();
        }
        return this.A;
    }

    private void v() {
        if (this.E) {
            throw new AndroidRuntimeException("Window feature must be requested before adding content");
        }
    }

    private int w() {
        int i2 = this.N;
        if (i2 != -100) {
            return i2;
        }
        return f.f905a;
    }

    @Override // androidx.appcompat.app.f
    public final void f() {
        a a2 = a();
        if (a2 != null) {
            a2.c(true);
        }
    }

    /* access modifiers changed from: package-private */
    public final void n() {
        a(e(0), true);
    }

    private void x() {
        if (this.P == null) {
            this.P = new e(l.a(this.f906b));
        }
    }

    @Override // androidx.appcompat.app.f
    public final MenuInflater b() {
        Context context;
        if (this.f912h == null) {
            p();
            a aVar = this.f911g;
            if (aVar != null) {
                context = aVar.d();
            } else {
                context = this.f906b;
            }
            this.f912h = new androidx.appcompat.view.g(context);
        }
        return this.f912h;
    }

    @Override // androidx.appcompat.app.f
    public final void e() {
        a a2 = a();
        if (a2 != null) {
            a2.c(false);
        }
        e eVar = this.P;
        if (eVar != null) {
            eVar.c();
        }
    }

    @Override // androidx.appcompat.app.f
    public final void g() {
        a a2 = a();
        if (a2 == null || !a2.h()) {
            h(0);
        }
    }

    @Override // androidx.appcompat.app.f
    public final void j() {
        LayoutInflater from = LayoutInflater.from(this.f906b);
        if (from.getFactory() == null) {
            androidx.core.h.g.a(from, this);
        } else {
            from.getFactory2();
        }
    }

    @Override // androidx.appcompat.app.f
    public final boolean k() {
        boolean z2;
        int w2 = w();
        int j2 = j(w2);
        if (j2 != -1) {
            z2 = k(j2);
        } else {
            z2 = false;
        }
        if (w2 == 0) {
            x();
            this.P.b();
        }
        this.O = true;
        return z2;
    }

    /* access modifiers changed from: package-private */
    public final boolean l() {
        ViewGroup viewGroup;
        if (!this.E || (viewGroup = this.o) == null || !v.v(viewGroup)) {
            return false;
        }
        return true;
    }

    static {
        boolean z2;
        Covode.recordClassIndex(255);
        if (Build.VERSION.SDK_INT < 21) {
            z2 = true;
        } else {
            z2 = false;
        }
        x = z2;
        if (z2 && !z) {
            final Thread.UncaughtExceptionHandler defaultUncaughtExceptionHandler = Thread.getDefaultUncaughtExceptionHandler();
            Thread.setDefaultUncaughtExceptionHandler(new Thread.UncaughtExceptionHandler() {
                /* class androidx.appcompat.app.g.AnonymousClass1 */

                static {
                    Covode.recordClassIndex(256);
                }

                public final void uncaughtException(Thread thread, Throwable th) {
                    String message;
                    if (!(th instanceof Resources.NotFoundException) || (message = th.getMessage()) == null || (!message.contains("drawable") && !message.contains("Drawable"))) {
                        defaultUncaughtExceptionHandler.uncaughtException(thread, th);
                        return;
                    }
                    Resources.NotFoundException notFoundException = new Resources.NotFoundException(th.getMessage() + ". If the resource you are trying to use is a vector resource, you may be referencing it in an unsupported way. See AppCompatDelegate.setCompatVectorFromResourcesEnabled() for more info.");
                    notFoundException.initCause(th.getCause());
                    notFoundException.setStackTrace(th.getStackTrace());
                    defaultUncaughtExceptionHandler.uncaughtException(thread, notFoundException);
                }
            });
        }
    }

    private void p() {
        r();
        if (this.p && this.f911g == null) {
            Window.Callback callback = this.f908d;
            if (callback instanceof Activity) {
                this.f911g = new m((Activity) this.f908d, this.q);
            } else if (callback instanceof Dialog) {
                this.f911g = new m((Dialog) this.f908d);
            }
            a aVar = this.f911g;
            if (aVar != null) {
                aVar.b(this.R);
            }
        }
    }

    private boolean y() {
        if (this.O) {
            Context context = this.f906b;
            if (context instanceof Activity) {
                PackageManager packageManager = context.getPackageManager();
                try {
                    Context context2 = this.f906b;
                    if ((packageManager.getActivityInfo(new ComponentName(context2, context2.getClass()), 0).configChanges & 512) == 0) {
                        return true;
                    }
                    return false;
                } catch (PackageManager.NameNotFoundException unused) {
                    return true;
                }
            }
        }
        return false;
    }

    @Override // androidx.appcompat.app.f
    public final void h() {
        if (this.v) {
            this.f907c.getDecorView().removeCallbacks(this.Q);
        }
        this.u = true;
        a aVar = this.f911g;
        if (aVar != null) {
            aVar.j();
        }
        e eVar = this.P;
        if (eVar != null) {
            eVar.c();
        }
    }

    /* access modifiers changed from: package-private */
    public final void o() {
        u uVar = this.B;
        if (uVar != null) {
            uVar.h();
        }
        if (this.f915k != null) {
            this.f907c.getDecorView().removeCallbacks(this.f916l);
            if (this.f915k.isShowing()) {
                try {
                    this.f915k.dismiss();
                } catch (IllegalArgumentException unused) {
                }
            }
            this.f915k = null;
        }
        m();
        C0019g e2 = e(0);
        if (e2 != null && e2.f948j != null) {
            e2.f948j.close();
        }
    }

    /* access modifiers changed from: protected */
    /* renamed from: androidx.appcompat.app.g$g  reason: collision with other inner class name */
    public static final class C0019g {

        /* renamed from: a  reason: collision with root package name */
        int f939a;

        /* renamed from: b  reason: collision with root package name */
        int f940b;

        /* renamed from: c  reason: collision with root package name */
        int f941c;

        /* renamed from: d  reason: collision with root package name */
        int f942d;

        /* renamed from: e  reason: collision with root package name */
        int f943e;

        /* renamed from: f  reason: collision with root package name */
        int f944f;

        /* renamed from: g  reason: collision with root package name */
        ViewGroup f945g;

        /* renamed from: h  reason: collision with root package name */
        View f946h;

        /* renamed from: i  reason: collision with root package name */
        View f947i;

        /* renamed from: j  reason: collision with root package name */
        androidx.appcompat.view.menu.h f948j;

        /* renamed from: k  reason: collision with root package name */
        androidx.appcompat.view.menu.f f949k;

        /* renamed from: l  reason: collision with root package name */
        Context f950l;

        /* renamed from: m  reason: collision with root package name */
        boolean f951m;
        boolean n;
        boolean o;
        public boolean p;
        boolean q;
        boolean r;
        Bundle s;

        static {
            Covode.recordClassIndex(272);
        }

        public final boolean a() {
            if (this.f946h == null) {
                return false;
            }
            if (this.f947i == null && this.f949k.c().getCount() <= 0) {
                return false;
            }
            return true;
        }

        C0019g(int i2) {
            this.f939a = i2;
        }

        /* access modifiers changed from: package-private */
        public final void a(androidx.appcompat.view.menu.h hVar) {
            androidx.appcompat.view.menu.f fVar;
            androidx.appcompat.view.menu.h hVar2 = this.f948j;
            if (hVar != hVar2) {
                if (hVar2 != null) {
                    hVar2.b(this.f949k);
                }
                this.f948j = hVar;
                if (hVar != null && (fVar = this.f949k) != null) {
                    hVar.a(fVar);
                }
            }
        }

        /* access modifiers changed from: package-private */
        public final p a(o.a aVar) {
            if (this.f948j == null) {
                return null;
            }
            if (this.f949k == null) {
                androidx.appcompat.view.menu.f fVar = new androidx.appcompat.view.menu.f(this.f950l);
                this.f949k = fVar;
                fVar.f1200h = aVar;
                this.f948j.a(this.f949k);
            }
            return this.f949k.a(this.f945g);
        }

        /* access modifiers changed from: package-private */
        public final void a(Context context) {
            TypedValue typedValue = new TypedValue();
            Resources.Theme newTheme = context.getResources().newTheme();
            newTheme.setTo(context.getTheme());
            newTheme.resolveAttribute(R.attr.gz, typedValue, true);
            if (typedValue.resourceId != 0) {
                newTheme.applyStyle(typedValue.resourceId, true);
            }
            newTheme.resolveAttribute(R.attr.a6w, typedValue, true);
            if (typedValue.resourceId != 0) {
                newTheme.applyStyle(typedValue.resourceId, true);
            } else {
                newTheme.applyStyle(R.style.ku, true);
            }
            androidx.appcompat.view.d dVar = new androidx.appcompat.view.d(context, 0);
            dVar.getTheme().setTo(newTheme);
            this.f950l = dVar;
            TypedArray obtainStyledAttributes = dVar.obtainStyledAttributes(new int[]{16842839, 16842926, R.attr.gx, R.attr.gy, R.attr.gz, R.attr.h0, R.attr.h1, R.attr.h2, R.attr.h3, R.attr.h4, R.attr.h5, R.attr.h6, R.attr.h7, R.attr.h8, R.attr.h9, R.attr.ha, R.attr.hb, R.attr.hc, R.attr.hd, R.attr.he, R.attr.hf, R.attr.hg, R.attr.hh, R.attr.hi, R.attr.hj, R.attr.hk, R.attr.hl, R.attr.hm, R.attr.hn, R.attr.ho, R.attr.hp, R.attr.hq, R.attr.ht, R.attr.i5, R.attr.i6, R.attr.i7, R.attr.i8, R.attr.ir, R.attr.kp, R.attr.lp, R.attr.lq, R.attr.lr, R.attr.ls, R.attr.lt, R.attr.lz, R.attr.m0, R.attr.mp, R.attr.mu, R.attr.oe, R.attr.of, R.attr.og, R.attr.oh, R.attr.oi, R.attr.oj, R.attr.ok, R.attr.ol, R.attr.om, R.attr.op, R.attr.pz, R.attr.rb, R.attr.rc, R.attr.rd, R.attr.rn, R.attr.ru, R.attr.s3, R.attr.s4, R.attr.sd, R.attr.se, R.attr.sf, R.attr.vs, R.attr.wn, R.attr.a2m, R.attr.a2p, R.attr.a2s, R.attr.a2t, R.attr.a2u, R.attr.a2v, R.attr.a2w, R.attr.a2x, R.attr.a2y, R.attr.a6v, R.attr.a6w, R.attr.a6x, R.attr.a7k, R.attr.a7m, R.attr.a8o, R.attr.a94, R.attr.a95, R.attr.a96, R.attr.ab2, R.attr.ab6, R.attr.ab_, R.attr.aba, R.attr.ad2, R.attr.ad3, R.attr.ag7, R.attr.ahx, R.attr.ahy, R.attr.ahz, R.attr.ai0, R.attr.ai2, R.attr.ai3, R.attr.ai4, R.attr.ai5, R.attr.aia, R.attr.aib, R.attr.ajd, R.attr.aje, R.attr.ajo, R.attr.ajp, R.attr.at3, R.attr.au3, R.attr.au4, R.attr.au5, R.attr.au6, R.attr.au7, R.attr.au8, R.attr.au9, R.attr.aua, R.attr.aub, R.attr.auc});
            this.f940b = obtainStyledAttributes.getResourceId(80, 0);
            this.f944f = obtainStyledAttributes.getResourceId(1, 0);
            obtainStyledAttributes.recycle();
        }
    }

    private void r() {
        if (!this.E) {
            this.o = s();
            CharSequence u2 = u();
            if (!TextUtils.isEmpty(u2)) {
                u uVar = this.B;
                if (uVar != null) {
                    uVar.setWindowTitle(u2);
                } else {
                    a aVar = this.f911g;
                    if (aVar != null) {
                        aVar.a(u2);
                    } else {
                        TextView textView = this.F;
                        if (textView != null) {
                            textView.setText(u2);
                        }
                    }
                }
            }
            t();
            this.E = true;
            C0019g e2 = e(0);
            if (this.u) {
                return;
            }
            if (e2 == null || e2.f948j == null) {
                h(108);
            }
        }
    }

    private void t() {
        ContentFrameLayout contentFrameLayout = (ContentFrameLayout) this.o.findViewById(16908290);
        View decorView = this.f907c.getDecorView();
        contentFrameLayout.a(decorView.getPaddingLeft(), decorView.getPaddingTop(), decorView.getPaddingRight(), decorView.getPaddingBottom());
        TypedArray obtainStyledAttributes = this.f906b.obtainStyledAttributes(new int[]{16842839, 16842926, R.attr.gx, R.attr.gy, R.attr.gz, R.attr.h0, R.attr.h1, R.attr.h2, R.attr.h3, R.attr.h4, R.attr.h5, R.attr.h6, R.attr.h7, R.attr.h8, R.attr.h9, R.attr.ha, R.attr.hb, R.attr.hc, R.attr.hd, R.attr.he, R.attr.hf, R.attr.hg, R.attr.hh, R.attr.hi, R.attr.hj, R.attr.hk, R.attr.hl, R.attr.hm, R.attr.hn, R.attr.ho, R.attr.hp, R.attr.hq, R.attr.ht, R.attr.i5, R.attr.i6, R.attr.i7, R.attr.i8, R.attr.ir, R.attr.kp, R.attr.lp, R.attr.lq, R.attr.lr, R.attr.ls, R.attr.lt, R.attr.lz, R.attr.m0, R.attr.mp, R.attr.mu, R.attr.oe, R.attr.of, R.attr.og, R.attr.oh, R.attr.oi, R.attr.oj, R.attr.ok, R.attr.ol, R.attr.om, R.attr.op, R.attr.pz, R.attr.rb, R.attr.rc, R.attr.rd, R.attr.rn, R.attr.ru, R.attr.s3, R.attr.s4, R.attr.sd, R.attr.se, R.attr.sf, R.attr.vs, R.attr.wn, R.attr.a2m, R.attr.a2p, R.attr.a2s, R.attr.a2t, R.attr.a2u, R.attr.a2v, R.attr.a2w, R.attr.a2x, R.attr.a2y, R.attr.a6v, R.attr.a6w, R.attr.a6x, R.attr.a7k, R.attr.a7m, R.attr.a8o, R.attr.a94, R.attr.a95, R.attr.a96, R.attr.ab2, R.attr.ab6, R.attr.ab_, R.attr.aba, R.attr.ad2, R.attr.ad3, R.attr.ag7, R.attr.ahx, R.attr.ahy, R.attr.ahz, R.attr.ai0, R.attr.ai2, R.attr.ai3, R.attr.ai4, R.attr.ai5, R.attr.aia, R.attr.aib, R.attr.ajd, R.attr.aje, R.attr.ajo, R.attr.ajp, R.attr.at3, R.attr.au3, R.attr.au4, R.attr.au5, R.attr.au6, R.attr.au7, R.attr.au8, R.attr.au9, R.attr.aua, R.attr.aub, R.attr.auc});
        obtainStyledAttributes.getValue(118, contentFrameLayout.getMinWidthMajor());
        obtainStyledAttributes.getValue(119, contentFrameLayout.getMinWidthMinor());
        if (obtainStyledAttributes.hasValue(116)) {
            obtainStyledAttributes.getValue(116, contentFrameLayout.getFixedWidthMajor());
        }
        if (obtainStyledAttributes.hasValue(117)) {
            obtainStyledAttributes.getValue(117, contentFrameLayout.getFixedWidthMinor());
        }
        if (obtainStyledAttributes.hasValue(114)) {
            obtainStyledAttributes.getValue(114, contentFrameLayout.getFixedHeightMajor());
        }
        if (obtainStyledAttributes.hasValue(115)) {
            obtainStyledAttributes.getValue(115, contentFrameLayout.getFixedHeightMinor());
        }
        obtainStyledAttributes.recycle();
        contentFrameLayout.requestLayout();
    }

    /* JADX WARNING: Code restructure failed: missing block: B:16:0x0066, code lost:
        if (r4 != null) goto L_0x0068;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private android.view.ViewGroup s() {
        /*
        // Method dump skipped, instructions count: 692
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.appcompat.app.g.s():android.view.ViewGroup");
    }

    class a implements b.a {
        static {
            Covode.recordClassIndex(264);
        }

        a() {
        }

        @Override // androidx.appcompat.app.b.a
        public final void a(int i2) {
            a a2 = g.this.a();
            if (a2 != null) {
                a2.a(i2);
            }
        }
    }

    /* access modifiers changed from: package-private */
    public final class b implements o.a {
        static {
            Covode.recordClassIndex(265);
        }

        b() {
        }

        @Override // androidx.appcompat.view.menu.o.a
        public final boolean a(androidx.appcompat.view.menu.h hVar) {
            Window.Callback callback = g.this.f907c.getCallback();
            if (callback == null) {
                return true;
            }
            callback.onMenuOpened(108, hVar);
            return true;
        }

        @Override // androidx.appcompat.view.menu.o.a
        public final void a(androidx.appcompat.view.menu.h hVar, boolean z) {
            g.this.b(hVar);
        }
    }

    /* access modifiers changed from: package-private */
    public final class h implements o.a {
        static {
            Covode.recordClassIndex(273);
        }

        h() {
        }

        @Override // androidx.appcompat.view.menu.o.a
        public final boolean a(androidx.appcompat.view.menu.h hVar) {
            Window.Callback callback;
            if (hVar != null || !g.this.p || (callback = g.this.f907c.getCallback()) == null || g.this.u) {
                return true;
            }
            callback.onMenuOpened(108, hVar);
            return true;
        }

        @Override // androidx.appcompat.view.menu.o.a
        public final void a(androidx.appcompat.view.menu.h hVar, boolean z) {
            boolean z2;
            androidx.appcompat.view.menu.h l2 = hVar.l();
            if (l2 != hVar) {
                z2 = true;
            } else {
                z2 = false;
            }
            g gVar = g.this;
            if (z2) {
                hVar = l2;
            }
            C0019g a2 = gVar.a((Menu) hVar);
            if (a2 == null) {
                return;
            }
            if (z2) {
                g.this.a(a2.f939a, a2, l2);
                g.this.a(a2, true);
                return;
            }
            g.this.a(a2, z);
        }
    }

    /* access modifiers changed from: package-private */
    public class f extends ContentFrameLayout {
        static {
            Covode.recordClassIndex(271);
        }

        public final void setBackgroundResource(int i2) {
            setBackgroundDrawable(androidx.appcompat.a.a.a.b(getContext(), i2));
        }

        public final boolean dispatchKeyEvent(KeyEvent keyEvent) {
            if (g.this.a(keyEvent) || super.dispatchKeyEvent(keyEvent)) {
                return true;
            }
            return false;
        }

        public final boolean onInterceptTouchEvent(MotionEvent motionEvent) {
            if (motionEvent.getAction() == 0) {
                int x = (int) motionEvent.getX();
                int y = (int) motionEvent.getY();
                if (x < -5 || y < -5 || x > getWidth() + 5 || y > getHeight() + 5) {
                    g.this.n();
                    return true;
                }
            }
            return super.onInterceptTouchEvent(motionEvent);
        }

        public f(Context context) {
            super(context);
        }
    }

    @Override // androidx.appcompat.app.f
    public final <T extends View> T a(int i2) {
        r();
        return (T) this.f907c.findViewById(i2);
    }

    @Override // androidx.appcompat.app.f
    public final void b(Bundle bundle) {
        int i2 = this.N;
        if (i2 != -100) {
            bundle.putInt("appcompat:local_night_mode", i2);
        }
    }

    class d extends i {
        static {
            Covode.recordClassIndex(268);
        }

        @Override // androidx.appcompat.view.i
        public final void onContentChanged() {
        }

        private ActionMode a(ActionMode.Callback callback) {
            f.a aVar = new f.a(g.this.f906b, callback);
            androidx.appcompat.view.b a2 = g.this.a(aVar);
            if (a2 != null) {
                return aVar.b(a2);
            }
            return null;
        }

        @Override // androidx.appcompat.view.i
        public final boolean dispatchKeyEvent(KeyEvent keyEvent) {
            if (g.this.a(keyEvent) || super.dispatchKeyEvent(keyEvent)) {
                return true;
            }
            return false;
        }

        @Override // androidx.appcompat.view.i
        public final boolean dispatchKeyShortcutEvent(KeyEvent keyEvent) {
            if (super.dispatchKeyShortcutEvent(keyEvent) || g.this.a(keyEvent.getKeyCode(), keyEvent)) {
                return true;
            }
            return false;
        }

        @Override // androidx.appcompat.view.i
        public final ActionMode onWindowStartingActionMode(ActionMode.Callback callback) {
            if (Build.VERSION.SDK_INT >= 23) {
                return null;
            }
            if (g.this.n) {
                return a(callback);
            }
            return super.onWindowStartingActionMode(callback);
        }

        d(Window.Callback callback) {
            super(callback);
        }

        @Override // androidx.appcompat.view.i
        public final boolean onCreatePanelMenu(int i2, Menu menu) {
            if (i2 != 0 || (menu instanceof androidx.appcompat.view.menu.h)) {
                return super.onCreatePanelMenu(i2, menu);
            }
            return false;
        }

        @Override // androidx.appcompat.view.i
        public final void onPanelClosed(int i2, Menu menu) {
            super.onPanelClosed(i2, menu);
            g.this.d(i2);
        }

        @Override // androidx.appcompat.view.i
        public final boolean onMenuOpened(int i2, Menu menu) {
            a a2;
            super.onMenuOpened(i2, menu);
            g gVar = g.this;
            if (i2 == 108 && (a2 = gVar.a()) != null) {
                a2.d(true);
            }
            return true;
        }

        @Override // androidx.appcompat.view.i
        public final ActionMode onWindowStartingActionMode(ActionMode.Callback callback, int i2) {
            if (!g.this.n || i2 != 0) {
                return super.onWindowStartingActionMode(callback, i2);
            }
            return a(callback);
        }

        /* JADX WARNING: Code restructure failed: missing block: B:8:0x000f, code lost:
            if (r2 != null) goto L_0x0011;
         */
        @Override // androidx.appcompat.view.i
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public final boolean onPreparePanel(int r4, android.view.View r5, android.view.Menu r6) {
            /*
                r3 = this;
                boolean r0 = r6 instanceof androidx.appcompat.view.menu.h
                if (r0 == 0) goto L_0x000d
                r2 = r6
                androidx.appcompat.view.menu.h r2 = (androidx.appcompat.view.menu.h) r2
            L_0x0007:
                r1 = 0
                if (r4 != 0) goto L_0x000f
                if (r2 != 0) goto L_0x0011
                return r1
            L_0x000d:
                r2 = 0
                goto L_0x0007
            L_0x000f:
                if (r2 == 0) goto L_0x0014
            L_0x0011:
                r0 = 1
                r2.f1223m = r0
            L_0x0014:
                boolean r0 = super.onPreparePanel(r4, r5, r6)
                if (r2 == 0) goto L_0x001c
                r2.f1223m = r1
            L_0x001c:
                return r0
            */
            throw new UnsupportedOperationException("Method not decompiled: androidx.appcompat.app.g.d.onPreparePanel(int, android.view.View, android.view.Menu):boolean");
        }

        @Override // androidx.appcompat.view.i, android.view.Window.Callback
        public final void onProvideKeyboardShortcuts(List<KeyboardShortcutGroup> list, Menu menu, int i2) {
            C0019g e2 = g.this.e(0);
            if (e2 == null || e2.f948j == null) {
                super.onProvideKeyboardShortcuts(list, menu, i2);
            } else {
                super.onProvideKeyboardShortcuts(list, e2.f948j, i2);
            }
        }
    }

    private boolean a(C0019g gVar) {
        gVar.a(q());
        gVar.f945g = new f(gVar.f950l);
        gVar.f941c = 81;
        return true;
    }

    private void h(int i2) {
        this.w = (1 << i2) | this.w;
        if (!this.v) {
            v.a(this.f907c.getDecorView(), this.Q);
            this.v = true;
        }
    }

    /* access modifiers changed from: package-private */
    public final void d(int i2) {
        if (i2 == 108) {
            a a2 = a();
            if (a2 != null) {
                a2.d(false);
            }
        } else if (i2 == 0) {
            C0019g e2 = e(i2);
            if (e2.o) {
                a(e2, false);
            }
        }
    }

    private boolean c(C0019g gVar) {
        if (gVar.f947i != null) {
            gVar.f946h = gVar.f947i;
            return true;
        } else if (gVar.f948j == null) {
            return false;
        } else {
            if (this.D == null) {
                this.D = new h();
            }
            gVar.f946h = (View) gVar.a(this.D);
            if (gVar.f946h != null) {
                return true;
            }
            return false;
        }
    }

    private int j(int i2) {
        if (i2 == -100) {
            return -1;
        }
        if (i2 != 0) {
            return i2;
        }
        if (Build.VERSION.SDK_INT >= 23 && ((UiModeManager) this.f906b.getSystemService(UiModeManager.class)).getNightMode() == 0) {
            return -1;
        }
        x();
        return this.P.a();
    }

    @Override // androidx.appcompat.app.f
    public final void b(int i2) {
        r();
        ViewGroup viewGroup = (ViewGroup) this.o.findViewById(16908290);
        viewGroup.removeAllViews();
        LayoutInflater.from(this.f906b).inflate(i2, viewGroup);
        this.f908d.onContentChanged();
    }

    /* access modifiers changed from: protected */
    public final C0019g e(int i2) {
        C0019g[] gVarArr = this.K;
        if (gVarArr == null || gVarArr.length <= i2) {
            C0019g[] gVarArr2 = new C0019g[(i2 + 1)];
            if (gVarArr != null) {
                System.arraycopy(gVarArr, 0, gVarArr2, 0, gVarArr.length);
            }
            this.K = gVarArr2;
            gVarArr = gVarArr2;
        }
        C0019g gVar = gVarArr[i2];
        if (gVar != null) {
            return gVar;
        }
        C0019g gVar2 = new C0019g(i2);
        gVarArr[i2] = gVar2;
        return gVar2;
    }

    /* access modifiers changed from: package-private */
    public class c implements b.a {

        /* renamed from: b  reason: collision with root package name */
        private b.a f929b;

        static {
            Covode.recordClassIndex(266);
        }

        @Override // androidx.appcompat.view.b.a
        public final void a(androidx.appcompat.view.b bVar) {
            this.f929b.a(bVar);
            if (g.this.f915k != null) {
                g.this.f907c.getDecorView().removeCallbacks(g.this.f916l);
            }
            if (g.this.f914j != null) {
                g.this.m();
                g gVar = g.this;
                gVar.f917m = v.j(gVar.f914j).a(0.0f);
                g.this.f917m.a(new ab() {
                    /* class androidx.appcompat.app.g.c.AnonymousClass1 */

                    static {
                        Covode.recordClassIndex(267);
                    }

                    @Override // androidx.core.h.aa, androidx.core.h.ab
                    public final void b(View view) {
                        g.this.f914j.setVisibility(8);
                        if (g.this.f915k != null) {
                            g.this.f915k.dismiss();
                        } else if (g.this.f914j.getParent() instanceof View) {
                            v.n((View) g.this.f914j.getParent());
                        }
                        g.this.f914j.removeAllViews();
                        g.this.f917m.a((aa) null);
                        g.this.f917m = null;
                    }
                });
            }
            if (g.this.f910f != null) {
                g.this.f910f.onSupportActionModeFinished(g.this.f913i);
            }
            g.this.f913i = null;
        }

        public c(b.a aVar) {
            this.f929b = aVar;
        }

        @Override // androidx.appcompat.view.b.a
        public final boolean a(androidx.appcompat.view.b bVar, Menu menu) {
            return this.f929b.a(bVar, menu);
        }

        @Override // androidx.appcompat.view.b.a
        public final boolean b(androidx.appcompat.view.b bVar, Menu menu) {
            return this.f929b.b(bVar, menu);
        }

        @Override // androidx.appcompat.view.b.a
        public final boolean a(androidx.appcompat.view.b bVar, MenuItem menuItem) {
            return this.f929b.a(bVar, menuItem);
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:17:0x006b, code lost:
        if (r2 != null) goto L_0x0051;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private boolean b(androidx.appcompat.app.g.C0019g r8) {
        /*
        // Method dump skipped, instructions count: 114
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.appcompat.app.g.b(androidx.appcompat.app.g$g):boolean");
    }

    private boolean k(int i2) {
        int i3;
        Resources resources = this.f906b.getResources();
        Configuration configuration = resources.getConfiguration();
        int i4 = configuration.uiMode & 48;
        if (i2 == 2) {
            i3 = 32;
        } else {
            i3 = 16;
        }
        if (i4 == i3) {
            return false;
        }
        if (y()) {
            ((Activity) this.f906b).recreate();
            return true;
        }
        Configuration configuration2 = new Configuration(configuration);
        DisplayMetrics displayMetrics = resources.getDisplayMetrics();
        configuration2.uiMode = i3 | (configuration2.uiMode & -49);
        resources.updateConfiguration(configuration2, displayMetrics);
        if (Build.VERSION.SDK_INT >= 26) {
            return true;
        }
        ResourcesFlusher.flush(resources);
        return true;
    }

    @Override // androidx.appcompat.app.f
    public final boolean c(int i2) {
        int i3 = i(i2);
        if (this.t && i3 == 108) {
            return false;
        }
        if (this.p && i3 == 1) {
            this.p = false;
        } else if (i3 != 1) {
            if (i3 == 2) {
                v();
                this.H = true;
                return true;
            } else if (i3 == 5) {
                v();
                this.I = true;
                return true;
            } else if (i3 == 10) {
                v();
                this.r = true;
                return true;
            } else if (i3 == 108) {
                v();
                this.p = true;
                return true;
            } else if (i3 != 109) {
                return this.f907c.requestFeature(i3);
            } else {
                v();
                this.q = true;
                return true;
            }
        }
        v();
        this.t = true;
        return true;
    }

    /* access modifiers changed from: package-private */
    public final void f(int i2) {
        C0019g e2;
        C0019g e3 = e(i2);
        if (e3.f948j != null) {
            Bundle bundle = new Bundle();
            e3.f948j.c(bundle);
            if (bundle.size() > 0) {
                e3.s = bundle;
            }
            e3.f948j.e();
            e3.f948j.clear();
        }
        e3.r = true;
        e3.q = true;
        if ((i2 == 108 || i2 == 0) && this.B != null && (e2 = e(0)) != null) {
            e2.f951m = false;
            b(e2, (KeyEvent) null);
        }
    }

    /* access modifiers changed from: package-private */
    /* JADX WARNING: Code restructure failed: missing block: B:24:0x007d, code lost:
        if (r1 != false) goto L_0x007f;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final int g(int r8) {
        /*
        // Method dump skipped, instructions count: 180
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.appcompat.app.g.g(int):int");
    }

    private androidx.appcompat.view.b b(b.a aVar) {
        androidx.appcompat.view.b bVar;
        e eVar;
        Context context;
        m();
        androidx.appcompat.view.b bVar2 = this.f913i;
        if (bVar2 != null) {
            bVar2.c();
        }
        e eVar2 = this.f910f;
        if (eVar2 != null && !this.u) {
            try {
                androidx.appcompat.view.b onWindowStartingSupportActionMode = eVar2.onWindowStartingSupportActionMode(aVar);
                if (onWindowStartingSupportActionMode != null) {
                    this.f913i = onWindowStartingSupportActionMode;
                    bVar = this.f913i;
                    if (!(bVar == null || (eVar = this.f910f) == null)) {
                        eVar.onSupportActionModeStarted(bVar);
                    }
                    return this.f913i;
                }
            } catch (AbstractMethodError unused) {
            }
        }
        boolean z2 = true;
        if (this.f914j == null) {
            if (this.s) {
                TypedValue typedValue = new TypedValue();
                Resources.Theme theme = this.f906b.getTheme();
                theme.resolveAttribute(R.attr.h6, typedValue, true);
                if (typedValue.resourceId != 0) {
                    Resources.Theme newTheme = this.f906b.getResources().newTheme();
                    newTheme.setTo(theme);
                    newTheme.applyStyle(typedValue.resourceId, true);
                    context = new androidx.appcompat.view.d(this.f906b, 0);
                    context.getTheme().setTo(newTheme);
                } else {
                    context = this.f906b;
                }
                this.f914j = new ActionBarContextView(context);
                PopupWindow popupWindow = new PopupWindow(context, (AttributeSet) null, (int) R.attr.hj);
                this.f915k = popupWindow;
                androidx.core.widget.g.a(popupWindow, 2);
                this.f915k.setContentView(this.f914j);
                this.f915k.setWidth(-1);
                context.getTheme().resolveAttribute(R.attr.h0, typedValue, true);
                this.f914j.setContentHeight(TypedValue.complexToDimensionPixelSize(typedValue.data, context.getResources().getDisplayMetrics()));
                this.f915k.setHeight(-2);
                this.f916l = new Runnable() {
                    /* class androidx.appcompat.app.g.AnonymousClass6 */

                    static {
                        Covode.recordClassIndex(261);
                    }

                    public final void run() {
                        g.this.f915k.showAtLocation(g.this.f914j, 55, 0, 0);
                        g.this.m();
                        if (g.this.l()) {
                            g.this.f914j.setAlpha(0.0f);
                            g gVar = g.this;
                            gVar.f917m = v.j(gVar.f914j).a(1.0f);
                            g.this.f917m.a(new ab() {
                                /* class androidx.appcompat.app.g.AnonymousClass6.AnonymousClass1 */

                                static {
                                    Covode.recordClassIndex(262);
                                }

                                @Override // androidx.core.h.aa, androidx.core.h.ab
                                public final void a(View view) {
                                    g.this.f914j.setVisibility(0);
                                }

                                @Override // androidx.core.h.aa, androidx.core.h.ab
                                public final void b(View view) {
                                    g.this.f914j.setAlpha(1.0f);
                                    g.this.f917m.a((aa) null);
                                    g.this.f917m = null;
                                }
                            });
                            return;
                        }
                        g.this.f914j.setAlpha(1.0f);
                        g.this.f914j.setVisibility(0);
                    }
                };
            } else {
                ViewStubCompat viewStubCompat = (ViewStubCompat) this.o.findViewById(R.id.ce);
                if (viewStubCompat != null) {
                    viewStubCompat.setLayoutInflater(LayoutInflater.from(q()));
                    this.f914j = (ActionBarContextView) viewStubCompat.a();
                }
            }
        }
        if (this.f914j != null) {
            m();
            this.f914j.c();
            Context context2 = this.f914j.getContext();
            ActionBarContextView actionBarContextView = this.f914j;
            if (this.f915k != null) {
                z2 = false;
            }
            androidx.appcompat.view.e eVar3 = new androidx.appcompat.view.e(context2, actionBarContextView, aVar, z2);
            if (aVar.a(eVar3, eVar3.b())) {
                eVar3.d();
                this.f914j.a(eVar3);
                this.f913i = eVar3;
                if (l()) {
                    this.f914j.setAlpha(0.0f);
                    z a2 = v.j(this.f914j).a(1.0f);
                    this.f917m = a2;
                    a2.a(new ab() {
                        /* class androidx.appcompat.app.g.AnonymousClass7 */

                        static {
                            Covode.recordClassIndex(263);
                        }

                        @Override // androidx.core.h.aa, androidx.core.h.ab
                        public final void b(View view) {
                            g.this.f914j.setAlpha(1.0f);
                            g.this.f917m.a((aa) null);
                            g.this.f917m = null;
                        }

                        @Override // androidx.core.h.aa, androidx.core.h.ab
                        public final void a(View view) {
                            g.this.f914j.setVisibility(0);
                            g.this.f914j.sendAccessibilityEvent(32);
                            if (g.this.f914j.getParent() instanceof View) {
                                v.n((View) g.this.f914j.getParent());
                            }
                        }
                    });
                } else {
                    this.f914j.setAlpha(1.0f);
                    this.f914j.setVisibility(0);
                    this.f914j.sendAccessibilityEvent(32);
                    if (this.f914j.getParent() instanceof View) {
                        v.n((View) this.f914j.getParent());
                    }
                }
                if (this.f915k != null) {
                    this.f907c.getDecorView().post(this.f916l);
                }
            } else {
                this.f913i = null;
            }
        }
        bVar = this.f913i;
        eVar.onSupportActionModeStarted(bVar);
        return this.f913i;
    }

    /* access modifiers changed from: package-private */
    public final void b(androidx.appcompat.view.menu.h hVar) {
        if (!this.J) {
            this.J = true;
            this.B.h();
            Window.Callback callback = this.f907c.getCallback();
            if (callback != null && !this.u) {
                callback.onPanelClosed(108, hVar);
            }
            this.J = false;
        }
    }

    private static Object a(Context context, String str) {
        Object systemService;
        if (Build.VERSION.SDK_INT > 27 || !"clipboard".equals(str)) {
            if (!com.ss.android.ugc.aweme.lancet.i.f107220b && "connectivity".equals(str)) {
                try {
                    new com.bytedance.platform.godzilla.b.b.b().a();
                    com.ss.android.ugc.aweme.lancet.i.f107220b = true;
                    return context.getSystemService(str);
                } catch (Throwable unused) {
                }
            }
            return context.getSystemService(str);
        } else if (!com.ss.android.ugc.aweme.lancet.i.f107219a) {
            return context.getSystemService(str);
        } else {
            synchronized (ClipboardManager.class) {
                systemService = context.getSystemService(str);
                if (Thread.currentThread() != Looper.getMainLooper().getThread()) {
                    try {
                        Field declaredField = ClipboardManager.class.getDeclaredField("mHandler");
                        declaredField.setAccessible(true);
                        declaredField.set(systemService, new i.a((Handler) declaredField.get(systemService)));
                    } catch (Exception e2) {
                        com.bytedance.crash.d.a(e2, "ClipboardManager Handler Reflect Fail");
                    }
                }
                com.ss.android.ugc.aweme.lancet.i.f107219a = false;
            }
            return systemService;
        }
    }

    private boolean b(C0019g gVar, KeyEvent keyEvent) {
        boolean z2;
        int i2;
        boolean z3;
        u uVar;
        u uVar2;
        if (this.u) {
            return false;
        }
        if (gVar.f951m) {
            return true;
        }
        C0019g gVar2 = this.L;
        if (!(gVar2 == null || gVar2 == gVar)) {
            a(gVar2, false);
        }
        Window.Callback callback = this.f907c.getCallback();
        if (callback != null) {
            gVar.f947i = callback.onCreatePanelView(gVar.f939a);
        }
        if (gVar.f939a == 0 || gVar.f939a == 108) {
            z2 = true;
            u uVar3 = this.B;
            if (uVar3 != null) {
                uVar3.g();
            }
        } else {
            z2 = false;
        }
        if (gVar.f947i == null && (!z2 || !(this.f911g instanceof j))) {
            if (gVar.f948j == null || gVar.r) {
                if (gVar.f948j == null) {
                    b(gVar);
                    if (gVar.f948j == null) {
                        return false;
                    }
                }
                if (z2 && this.B != null) {
                    if (this.C == null) {
                        this.C = new b();
                    }
                    this.B.a(gVar.f948j, this.C);
                }
                gVar.f948j.e();
                if (!callback.onCreatePanelMenu(gVar.f939a, gVar.f948j)) {
                    gVar.a((androidx.appcompat.view.menu.h) null);
                    if (z2 && (uVar2 = this.B) != null) {
                        uVar2.a(null, this.C);
                    }
                    return false;
                }
                gVar.r = false;
            }
            gVar.f948j.e();
            if (gVar.s != null) {
                gVar.f948j.d(gVar.s);
                gVar.s = null;
            }
            if (!callback.onPreparePanel(0, gVar.f947i, gVar.f948j)) {
                if (z2 && (uVar = this.B) != null) {
                    uVar.a(null, this.C);
                }
                gVar.f948j.f();
                return false;
            }
            if (keyEvent != null) {
                i2 = keyEvent.getDeviceId();
            } else {
                i2 = -1;
            }
            if (KeyCharacterMap.load(i2).getKeyboardType() != 1) {
                z3 = true;
            } else {
                z3 = false;
            }
            gVar.p = z3;
            gVar.f948j.setQwertyMode(gVar.p);
            gVar.f948j.f();
        }
        gVar.f951m = true;
        gVar.n = false;
        this.L = gVar;
        return true;
    }

    private void a(C0019g gVar, KeyEvent keyEvent) {
        int i2;
        ViewGroup.LayoutParams layoutParams;
        if (!gVar.o && !this.u) {
            if (gVar.f939a != 0 || (this.f906b.getResources().getConfiguration().screenLayout & 15) != 4) {
                Window.Callback callback = this.f907c.getCallback();
                if (callback == null || callback.onMenuOpened(gVar.f939a, gVar.f948j)) {
                    WindowManager windowManager = (WindowManager) a(this.f906b, "window");
                    if (windowManager != null && b(gVar, keyEvent)) {
                        if (gVar.f945g == null || gVar.q) {
                            if (gVar.f945g == null) {
                                a(gVar);
                                if (gVar.f945g == null) {
                                    return;
                                }
                            } else if (gVar.q && gVar.f945g.getChildCount() > 0) {
                                gVar.f945g.removeAllViews();
                            }
                            if (c(gVar) && gVar.a()) {
                                ViewGroup.LayoutParams layoutParams2 = gVar.f946h.getLayoutParams();
                                if (layoutParams2 == null) {
                                    layoutParams2 = new ViewGroup.LayoutParams(-2, -2);
                                }
                                gVar.f945g.setBackgroundResource(gVar.f940b);
                                ViewParent parent = gVar.f946h.getParent();
                                if (parent != null && (parent instanceof ViewGroup)) {
                                    ((ViewGroup) parent).removeView(gVar.f946h);
                                }
                                gVar.f945g.addView(gVar.f946h, layoutParams2);
                                if (!gVar.f946h.hasFocus()) {
                                    gVar.f946h.requestFocus();
                                }
                                i2 = -2;
                            } else {
                                return;
                            }
                        } else {
                            if (!(gVar.f947i == null || (layoutParams = gVar.f947i.getLayoutParams()) == null || layoutParams.width != -1)) {
                                i2 = -1;
                            }
                            i2 = -2;
                        }
                        gVar.n = false;
                        WindowManager.LayoutParams layoutParams3 = new WindowManager.LayoutParams(i2, -2, gVar.f942d, gVar.f943e, 1002, 8519680, -3);
                        layoutParams3.gravity = gVar.f941c;
                        layoutParams3.windowAnimations = gVar.f944f;
                        a(windowManager, gVar.f945g, layoutParams3);
                        gVar.o = true;
                        return;
                    }
                    return;
                }
                a(gVar, true);
            }
        }
    }

    @Override // androidx.appcompat.app.f
    public final void b(View view, ViewGroup.LayoutParams layoutParams) {
        r();
        ((ViewGroup) this.o.findViewById(16908290)).addView(view, layoutParams);
        this.f908d.onContentChanged();
    }

    public final View onCreateView(String str, Context context, AttributeSet attributeSet) {
        return onCreateView(null, str, context, attributeSet);
    }

    g(Context context, Window window, e eVar) {
        this.f906b = context;
        this.f907c = window;
        this.f910f = eVar;
        Window.Callback callback = window.getCallback();
        this.f908d = callback;
        if (!(callback instanceof d)) {
            d dVar = new d(callback);
            this.f909e = dVar;
            window.setCallback(dVar);
            al a2 = al.a(context, (AttributeSet) null, y);
            Drawable b2 = a2.b(0);
            if (b2 != null) {
                window.setBackgroundDrawable(b2);
            }
            a2.f1549a.recycle();
            return;
        }
        throw new IllegalStateException("AppCompat has already installed itself into the Window");
    }

    private boolean a(C0019g gVar, int i2, KeyEvent keyEvent) {
        if (keyEvent.isSystem()) {
            return false;
        }
        if ((gVar.f951m || b(gVar, keyEvent)) && gVar.f948j != null) {
            return gVar.f948j.performShortcut(i2, keyEvent, 1);
        }
        return false;
    }

    public final View onCreateView(View view, String str, Context context, AttributeSet attributeSet) {
        return a(view, str, context, attributeSet);
    }

    /* JADX WARNING: Code restructure failed: missing block: B:12:0x003f, code lost:
        if (((org.xmlpull.v1.XmlPullParser) r15).getDepth() > 1) goto L_0x0041;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private android.view.View a(android.view.View r12, java.lang.String r13, android.content.Context r14, android.util.AttributeSet r15) {
        /*
        // Method dump skipped, instructions count: 396
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.appcompat.app.g.a(android.view.View, java.lang.String, android.content.Context, android.util.AttributeSet):android.view.View");
    }
}
