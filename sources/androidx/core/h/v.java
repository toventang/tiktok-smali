package androidx.core.h;

import android.content.ClipboardManager;
import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.TypedArray;
import android.graphics.PorterDuff;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.os.Build;
import android.os.Handler;
import android.os.Looper;
import android.util.AttributeSet;
import android.util.SparseArray;
import android.view.Display;
import android.view.KeyEvent;
import android.view.PointerIcon;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewParent;
import android.view.ViewTreeObserver;
import android.view.WindowInsets;
import android.view.accessibility.AccessibilityEvent;
import android.view.accessibility.AccessibilityManager;
import androidx.core.h.a;
import com.bytedance.covode.number.Covode;
import com.ss.android.ugc.aweme.lancet.i;
import com.zhiliaoapp.musically.R;
import java.lang.ref.WeakReference;
import java.lang.reflect.Field;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.ArrayList;
import java.util.Map;
import java.util.WeakHashMap;
import java.util.concurrent.atomic.AtomicInteger;

public class v {

    /* renamed from: a  reason: collision with root package name */
    private static final AtomicInteger f2556a = new AtomicInteger(1);

    /* renamed from: b  reason: collision with root package name */
    private static Field f2557b;

    /* renamed from: c  reason: collision with root package name */
    private static boolean f2558c;

    /* renamed from: d  reason: collision with root package name */
    private static Field f2559d;

    /* renamed from: e  reason: collision with root package name */
    private static boolean f2560e;

    /* renamed from: f  reason: collision with root package name */
    private static WeakHashMap<View, String> f2561f;

    /* renamed from: g  reason: collision with root package name */
    private static WeakHashMap<View, z> f2562g = null;

    /* renamed from: h  reason: collision with root package name */
    private static Method f2563h;

    /* renamed from: i  reason: collision with root package name */
    private static Field f2564i;

    /* renamed from: j  reason: collision with root package name */
    private static boolean f2565j = false;

    /* renamed from: k  reason: collision with root package name */
    private static ThreadLocal<Rect> f2566k;

    /* renamed from: l  reason: collision with root package name */
    private static final int[] f2567l = {R.id.aq, R.id.ar, R.id.b2, R.id.bc, R.id.bf, R.id.bg, R.id.bh, R.id.bi, R.id.bj, R.id.bk, R.id.as, R.id.at, R.id.au, R.id.av, R.id.aw, R.id.ax, R.id.ay, R.id.az, R.id.b0, R.id.b1, R.id.b3, R.id.b4, R.id.b5, R.id.b6, R.id.b7, R.id.b8, R.id.b9, R.id.b_, R.id.ba, R.id.bb, R.id.bd, R.id.be};

    /* renamed from: m  reason: collision with root package name */
    private static a f2568m = new a();

    public interface d {
        static {
            Covode.recordClassIndex(881);
        }

        boolean a();
    }

    /* access modifiers changed from: package-private */
    public static class e {

        /* renamed from: a  reason: collision with root package name */
        private static final ArrayList<WeakReference<View>> f2574a = new ArrayList<>();

        /* renamed from: b  reason: collision with root package name */
        private WeakHashMap<View, Boolean> f2575b;

        /* renamed from: c  reason: collision with root package name */
        private SparseArray<WeakReference<View>> f2576c;

        /* renamed from: d  reason: collision with root package name */
        private WeakReference<KeyEvent> f2577d;

        e() {
        }

        static {
            Covode.recordClassIndex(882);
        }

        private SparseArray<WeakReference<View>> a() {
            if (this.f2576c == null) {
                this.f2576c = new SparseArray<>();
            }
            return this.f2576c;
        }

        private void b() {
            WeakHashMap<View, Boolean> weakHashMap = this.f2575b;
            if (weakHashMap != null) {
                weakHashMap.clear();
            }
            ArrayList<WeakReference<View>> arrayList = f2574a;
            if (!arrayList.isEmpty()) {
                synchronized (arrayList) {
                    if (this.f2575b == null) {
                        this.f2575b = new WeakHashMap<>();
                    }
                    for (int size = arrayList.size() - 1; size >= 0; size--) {
                        ArrayList<WeakReference<View>> arrayList2 = f2574a;
                        View view = arrayList2.get(size).get();
                        if (view == null) {
                            arrayList2.remove(size);
                        } else {
                            this.f2575b.put(view, Boolean.TRUE);
                            for (ViewParent parent = view.getParent(); parent instanceof View; parent = parent.getParent()) {
                                this.f2575b.put((View) parent, Boolean.TRUE);
                            }
                        }
                    }
                }
            }
        }

        static e a(View view) {
            e eVar = (e) view.getTag(R.id.ei8);
            if (eVar != null) {
                return eVar;
            }
            e eVar2 = new e();
            view.setTag(R.id.ei8, eVar2);
            return eVar2;
        }

        /* access modifiers changed from: package-private */
        /* JADX WARNING: Code restructure failed: missing block: B:10:0x0032, code lost:
            if (r0 == null) goto L_0x0034;
         */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public final boolean a(android.view.KeyEvent r6) {
            /*
                r5 = this;
                java.lang.ref.WeakReference<android.view.KeyEvent> r0 = r5.f2577d
                r4 = 0
                if (r0 == 0) goto L_0x000c
                java.lang.Object r0 = r0.get()
                if (r0 != r6) goto L_0x000c
                return r4
            L_0x000c:
                java.lang.ref.WeakReference r0 = new java.lang.ref.WeakReference
                r0.<init>(r6)
                r5.f2577d = r0
                r0 = 0
                android.util.SparseArray r3 = r5.a()
                int r0 = r6.getAction()
                r2 = 1
                if (r0 != r2) goto L_0x0034
                int r0 = r6.getKeyCode()
                int r1 = r3.indexOfKey(r0)
                if (r1 < 0) goto L_0x0034
                java.lang.Object r0 = r3.valueAt(r1)
                java.lang.ref.WeakReference r0 = (java.lang.ref.WeakReference) r0
                r3.removeAt(r1)
                if (r0 != 0) goto L_0x0040
            L_0x0034:
                int r0 = r6.getKeyCode()
                java.lang.Object r0 = r3.get(r0)
                java.lang.ref.WeakReference r0 = (java.lang.ref.WeakReference) r0
                if (r0 == 0) goto L_0x0052
            L_0x0040:
                java.lang.Object r1 = r0.get()
                android.view.View r1 = (android.view.View) r1
                if (r1 == 0) goto L_0x0051
                boolean r0 = androidx.core.h.v.y(r1)
                if (r0 == 0) goto L_0x0051
                b(r1)
            L_0x0051:
                return r2
            L_0x0052:
                return r4
            */
            throw new UnsupportedOperationException("Method not decompiled: androidx.core.h.v.e.a(android.view.KeyEvent):boolean");
        }

        private static boolean b(View view) {
            ArrayList arrayList = (ArrayList) view.getTag(R.id.ei9);
            if (arrayList == null) {
                return false;
            }
            for (int size = arrayList.size() - 1; size >= 0; size--) {
                if (((d) arrayList.get(size)).a()) {
                    return true;
                }
            }
            return false;
        }

        private View b(View view, KeyEvent keyEvent) {
            WeakHashMap<View, Boolean> weakHashMap = this.f2575b;
            if (weakHashMap != null && weakHashMap.containsKey(view)) {
                if (view instanceof ViewGroup) {
                    ViewGroup viewGroup = (ViewGroup) view;
                    for (int childCount = viewGroup.getChildCount() - 1; childCount >= 0; childCount--) {
                        View b2 = b(viewGroup.getChildAt(childCount), keyEvent);
                        if (b2 != null) {
                            return b2;
                        }
                    }
                }
                if (b(view)) {
                    return view;
                }
            }
            return null;
        }

        /* access modifiers changed from: package-private */
        public final boolean a(View view, KeyEvent keyEvent) {
            if (keyEvent.getAction() == 0) {
                b();
            }
            View b2 = b(view, keyEvent);
            if (keyEvent.getAction() == 0) {
                int keyCode = keyEvent.getKeyCode();
                if (b2 == null) {
                    return false;
                }
                if (KeyEvent.isModifierKey(keyCode)) {
                    return true;
                }
                a().put(keyCode, new WeakReference<>(b2));
                return true;
            } else if (b2 != null) {
                return true;
            } else {
                return false;
            }
        }
    }

    protected v() {
    }

    public static void a(View view, a aVar) {
        View.AccessibilityDelegate accessibilityDelegate;
        if (aVar == null) {
            if (a(view) instanceof a.C0034a) {
                aVar = new a();
            } else {
                accessibilityDelegate = null;
                view.setAccessibilityDelegate(accessibilityDelegate);
            }
        }
        accessibilityDelegate = aVar.f2476a;
        view.setAccessibilityDelegate(accessibilityDelegate);
    }

    public static void a(View view, boolean z) {
        int i2 = Build.VERSION.SDK_INT;
        view.setHasTransientState(z);
    }

    public static void a(View view, Runnable runnable) {
        int i2 = Build.VERSION.SDK_INT;
        view.postOnAnimation(runnable);
    }

    public static void a(View view, Runnable runnable, long j2) {
        int i2 = Build.VERSION.SDK_INT;
        view.postOnAnimationDelayed(runnable, j2);
    }

    public static void a(View view, String str) {
        if (Build.VERSION.SDK_INT >= 21) {
            view.setTransitionName(str);
            return;
        }
        if (f2561f == null) {
            f2561f = new WeakHashMap<>();
        }
        f2561f.put(view, str);
    }

    public static void a(ViewGroup viewGroup) {
        if (f2563h == null) {
            try {
                f2563h = ViewGroup.class.getDeclaredMethod("setChildrenDrawingOrderEnabled", Boolean.TYPE);
            } catch (NoSuchMethodException unused) {
            }
            f2563h.setAccessible(true);
        }
        try {
            f2563h.invoke(viewGroup, true);
        } catch (IllegalAccessException | IllegalArgumentException | InvocationTargetException unused2) {
        }
    }

    public static void a(View view, final r rVar) {
        if (Build.VERSION.SDK_INT < 21) {
            return;
        }
        if (rVar == null) {
            view.setOnApplyWindowInsetsListener(null);
        } else {
            view.setOnApplyWindowInsetsListener(new View.OnApplyWindowInsetsListener() {
                /* class androidx.core.h.v.AnonymousClass1 */

                static {
                    Covode.recordClassIndex(874);
                }

                public final WindowInsets onApplyWindowInsets(View view, WindowInsets windowInsets) {
                    return r.this.a(view, ad.a(windowInsets)).e();
                }
            });
        }
    }

    public static void a(View view, Drawable drawable) {
        int i2 = Build.VERSION.SDK_INT;
        view.setBackground(drawable);
    }

    public static void a(View view, PorterDuff.Mode mode) {
        if (Build.VERSION.SDK_INT >= 21) {
            view.setBackgroundTintMode(mode);
            if (Build.VERSION.SDK_INT == 21) {
                Drawable background = view.getBackground();
                boolean z = (view.getBackgroundTintList() == null && view.getBackgroundTintMode() == null) ? false : true;
                if (background != null && z) {
                    if (background.isStateful()) {
                        background.setState(view.getDrawableState());
                    }
                    view.setBackground(background);
                }
            }
        } else if (view instanceof u) {
            ((u) view).setSupportBackgroundTintMode(mode);
        }
    }

    public static void a(View view, Rect rect) {
        int i2 = Build.VERSION.SDK_INT;
        view.setClipBounds(rect);
    }

    public static void a(View view, s sVar) {
        if (Build.VERSION.SDK_INT >= 24) {
            view.setPointerIcon((PointerIcon) (sVar != null ? sVar.f2555a : null));
        }
    }

    public static boolean a(View view, KeyEvent keyEvent) {
        if (Build.VERSION.SDK_INT >= 28) {
            return false;
        }
        return e.a(view).a(keyEvent);
    }

    /* access modifiers changed from: package-private */
    public static abstract class b<T> {

        /* renamed from: a  reason: collision with root package name */
        private final int f2571a;

        /* renamed from: b  reason: collision with root package name */
        private final Class<T> f2572b;

        /* renamed from: c  reason: collision with root package name */
        private final int f2573c;

        static {
            Covode.recordClassIndex(879);
        }

        /* access modifiers changed from: package-private */
        public abstract T a(View view);

        private static boolean b() {
            int i2 = Build.VERSION.SDK_INT;
            return true;
        }

        private boolean a() {
            if (Build.VERSION.SDK_INT >= this.f2573c) {
                return true;
            }
            return false;
        }

        /* access modifiers changed from: package-private */
        public final T b(View view) {
            if (a()) {
                return a(view);
            }
            if (!b()) {
                return null;
            }
            T t = (T) view.getTag(this.f2571a);
            if (this.f2572b.isInstance(t)) {
                return t;
            }
            return null;
        }

        b(int i2, Class<T> cls) {
            this(i2, cls, 28);
        }

        b(int i2, Class<T> cls, int i3) {
            this.f2571a = i2;
            this.f2572b = cls;
            this.f2573c = 28;
        }
    }

    private static b<CharSequence> c() {
        return new b<CharSequence>(CharSequence.class) {
            /* class androidx.core.h.v.AnonymousClass3 */

            static {
                Covode.recordClassIndex(876);
            }

            /* Return type fixed from 'java.lang.Object' to match base method */
            /* access modifiers changed from: package-private */
            @Override // androidx.core.h.v.b
            public final /* synthetic */ CharSequence a(View view) {
                return view.getAccessibilityPaneTitle();
            }
        };
    }

    static class a implements View.OnAttachStateChangeListener, ViewTreeObserver.OnGlobalLayoutListener {

        /* renamed from: a  reason: collision with root package name */
        private WeakHashMap<View, Boolean> f2570a = new WeakHashMap<>();

        static {
            Covode.recordClassIndex(878);
        }

        public final void onViewDetachedFromWindow(View view) {
        }

        a() {
        }

        public final void onGlobalLayout() {
            boolean z;
            int i2;
            for (Map.Entry<View, Boolean> entry : this.f2570a.entrySet()) {
                View key = entry.getKey();
                boolean booleanValue = entry.getValue().booleanValue();
                boolean z2 = true;
                if (key.getVisibility() == 0) {
                    z = true;
                } else {
                    z = false;
                }
                if (booleanValue != z) {
                    if (z && ((AccessibilityManager) v.a(key.getContext(), "accessibility")).isEnabled()) {
                        if (v.A(key) == null) {
                            z2 = false;
                        }
                        int i3 = Build.VERSION.SDK_INT;
                        if (key.getAccessibilityLiveRegion() != 0 || (z2 && key.getVisibility() == 0)) {
                            AccessibilityEvent obtain = AccessibilityEvent.obtain();
                            if (z2) {
                                i2 = 32;
                            } else {
                                i2 = 2048;
                            }
                            obtain.setEventType(i2);
                            obtain.setContentChangeTypes(16);
                            key.sendAccessibilityEventUnchecked(obtain);
                        } else if (key.getParent() != null) {
                            try {
                                key.getParent().notifySubtreeAccessibilityStateChanged(key, key, 16);
                            } catch (AbstractMethodError unused) {
                                key.getParent().getClass().getSimpleName();
                            }
                        }
                    }
                    this.f2570a.put(key, Boolean.valueOf(z));
                }
            }
        }

        public final void onViewAttachedToWindow(View view) {
            view.getViewTreeObserver().addOnGlobalLayoutListener(this);
        }
    }

    public static int a() {
        int i2 = Build.VERSION.SDK_INT;
        return View.generateViewId();
    }

    private static Rect b() {
        if (f2566k == null) {
            f2566k = new ThreadLocal<>();
        }
        Rect rect = f2566k.get();
        if (rect == null) {
            rect = new Rect();
            f2566k.set(rect);
        }
        rect.setEmpty();
        return rect;
    }

    static {
        Covode.recordClassIndex(873);
    }

    public static CharSequence A(View view) {
        return c().b(view);
    }

    private static void C(View view) {
        float translationY = view.getTranslationY();
        view.setTranslationY(1.0f + translationY);
        view.setTranslationY(translationY);
    }

    public static void c(View view) {
        int i2 = Build.VERSION.SDK_INT;
        view.postInvalidateOnAnimation();
    }

    public static int d(View view) {
        int i2 = Build.VERSION.SDK_INT;
        return view.getImportantForAccessibility();
    }

    public static int e(View view) {
        int i2 = Build.VERSION.SDK_INT;
        return view.getLayoutDirection();
    }

    public static int f(View view) {
        int i2 = Build.VERSION.SDK_INT;
        return view.getPaddingStart();
    }

    public static int g(View view) {
        int i2 = Build.VERSION.SDK_INT;
        return view.getPaddingEnd();
    }

    public static int h(View view) {
        int i2 = Build.VERSION.SDK_INT;
        return view.getMinimumWidth();
    }

    public static int i(View view) {
        int i2 = Build.VERSION.SDK_INT;
        return view.getMinimumHeight();
    }

    public static float k(View view) {
        if (Build.VERSION.SDK_INT >= 21) {
            return view.getElevation();
        }
        return 0.0f;
    }

    public static int m(View view) {
        int i2 = Build.VERSION.SDK_INT;
        return view.getWindowSystemUiVisibility();
    }

    public static boolean o(View view) {
        int i2 = Build.VERSION.SDK_INT;
        return view.getFitsSystemWindows();
    }

    public static boolean p(View view) {
        int i2 = Build.VERSION.SDK_INT;
        return view.hasOverlappingRendering();
    }

    public static boolean q(View view) {
        int i2 = Build.VERSION.SDK_INT;
        return view.isPaddingRelative();
    }

    public static void u(View view) {
        if (view instanceof k) {
            ((k) view).a(1);
        }
    }

    public static boolean v(View view) {
        int i2 = Build.VERSION.SDK_INT;
        return view.isLaidOut();
    }

    public static float w(View view) {
        if (Build.VERSION.SDK_INT >= 21) {
            return view.getZ();
        }
        return 0.0f;
    }

    public static Rect x(View view) {
        int i2 = Build.VERSION.SDK_INT;
        return view.getClipBounds();
    }

    public static boolean y(View view) {
        int i2 = Build.VERSION.SDK_INT;
        return view.isAttachedToWindow();
    }

    public static Display z(View view) {
        int i2 = Build.VERSION.SDK_INT;
        return view.getDisplay();
    }

    public static View.AccessibilityDelegate a(View view) {
        if (Build.VERSION.SDK_INT >= 29) {
            return view.getAccessibilityDelegate();
        }
        return B(view);
    }

    public static z j(View view) {
        if (f2562g == null) {
            f2562g = new WeakHashMap<>();
        }
        z zVar = f2562g.get(view);
        if (zVar != null) {
            return zVar;
        }
        z zVar2 = new z(view);
        f2562g.put(view, zVar2);
        return zVar2;
    }

    public static String l(View view) {
        if (Build.VERSION.SDK_INT >= 21) {
            return view.getTransitionName();
        }
        WeakHashMap<View, String> weakHashMap = f2561f;
        if (weakHashMap == null) {
            return null;
        }
        return weakHashMap.get(view);
    }

    public static void n(View view) {
        if (Build.VERSION.SDK_INT >= 20) {
            view.requestApplyInsets();
            return;
        }
        int i2 = Build.VERSION.SDK_INT;
        view.requestFitSystemWindows();
    }

    public static ColorStateList r(View view) {
        if (Build.VERSION.SDK_INT >= 21) {
            return view.getBackgroundTintList();
        }
        if (view instanceof u) {
            return ((u) view).getSupportBackgroundTintList();
        }
        return null;
    }

    public static PorterDuff.Mode s(View view) {
        if (Build.VERSION.SDK_INT >= 21) {
            return view.getBackgroundTintMode();
        }
        if (view instanceof u) {
            return ((u) view).getSupportBackgroundTintMode();
        }
        return null;
    }

    public static boolean t(View view) {
        if (Build.VERSION.SDK_INT >= 21) {
            return view.isNestedScrollingEnabled();
        }
        if (view instanceof j) {
            return ((j) view).isNestedScrollingEnabled();
        }
        return false;
    }

    private static View.AccessibilityDelegate B(View view) {
        if (f2565j) {
            return null;
        }
        if (f2564i == null) {
            try {
                Field declaredField = View.class.getDeclaredField("mAccessibilityDelegate");
                f2564i = declaredField;
                declaredField.setAccessible(true);
            } catch (Throwable unused) {
                f2565j = true;
                return null;
            }
        }
        try {
            Object obj = f2564i.get(view);
            if (obj instanceof View.AccessibilityDelegate) {
                return (View.AccessibilityDelegate) obj;
            }
            return null;
        } catch (Throwable unused2) {
            f2565j = true;
            return null;
        }
    }

    public static boolean b(View view) {
        int i2 = Build.VERSION.SDK_INT;
        return view.hasTransientState();
    }

    public static void a(View view, int i2) {
        int i3 = Build.VERSION.SDK_INT;
        view.setImportantForAccessibility(i2);
    }

    public static void b(View view, int i2) {
        int i3 = Build.VERSION.SDK_INT;
        view.setLayoutDirection(i2);
    }

    public static void b(View view, float f2) {
        if (Build.VERSION.SDK_INT >= 21) {
            view.setTranslationZ(f2);
        }
    }

    public static ad b(View view, ad adVar) {
        WindowInsets e2;
        if (Build.VERSION.SDK_INT < 21 || (e2 = adVar.e()) == null || view.dispatchApplyWindowInsets(e2).equals(e2)) {
            return adVar;
        }
        return ad.a(e2);
    }

    public static <T extends View> T c(View view, int i2) {
        if (Build.VERSION.SDK_INT >= 28) {
            return (T) view.requireViewById(i2);
        }
        T t = (T) view.findViewById(i2);
        if (t != null) {
            return t;
        }
        throw new IllegalArgumentException("ID does not reference a View inside this View");
    }

    private static void f(View view, int i2) {
        view.offsetTopAndBottom(i2);
        if (view.getVisibility() == 0) {
            C(view);
            ViewParent parent = view.getParent();
            if (parent instanceof View) {
                C((View) parent);
            }
        }
    }

    private static void g(View view, int i2) {
        view.offsetLeftAndRight(i2);
        if (view.getVisibility() == 0) {
            C(view);
            ViewParent parent = view.getParent();
            if (parent instanceof View) {
                C((View) parent);
            }
        }
    }

    public static ad a(View view, ad adVar) {
        WindowInsets e2;
        if (Build.VERSION.SDK_INT >= 21 && (e2 = adVar.e()) != null) {
            WindowInsets onApplyWindowInsets = view.onApplyWindowInsets(e2);
            if (!onApplyWindowInsets.equals(e2)) {
                return ad.a(onApplyWindowInsets);
            }
        }
        return adVar;
    }

    public static void c(View view, float f2) {
        if (Build.VERSION.SDK_INT >= 21) {
            view.setZ(f2);
        }
    }

    static Object a(Context context, String str) {
        Object systemService;
        if (Build.VERSION.SDK_INT > 27 || !"clipboard".equals(str)) {
            if (!i.f107220b && "connectivity".equals(str)) {
                try {
                    new com.bytedance.platform.godzilla.b.b.b().a();
                    i.f107220b = true;
                    return context.getSystemService(str);
                } catch (Throwable unused) {
                }
            }
            return context.getSystemService(str);
        } else if (!i.f107219a) {
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
                i.f107219a = false;
            }
            return systemService;
        }
    }

    public static void d(View view, int i2) {
        if (Build.VERSION.SDK_INT >= 23) {
            view.offsetTopAndBottom(i2);
        } else if (Build.VERSION.SDK_INT >= 21) {
            Rect b2 = b();
            boolean z = false;
            ViewParent parent = view.getParent();
            if (parent instanceof View) {
                View view2 = (View) parent;
                b2.set(view2.getLeft(), view2.getTop(), view2.getRight(), view2.getBottom());
                z = !b2.intersects(view.getLeft(), view.getTop(), view.getRight(), view.getBottom());
            }
            f(view, i2);
            if (z && b2.intersect(view.getLeft(), view.getTop(), view.getRight(), view.getBottom())) {
                ((View) parent).invalidate(b2);
            }
        } else {
            f(view, i2);
        }
    }

    public static void e(View view, int i2) {
        if (Build.VERSION.SDK_INT >= 23) {
            view.offsetLeftAndRight(i2);
        } else if (Build.VERSION.SDK_INT >= 21) {
            Rect b2 = b();
            boolean z = false;
            ViewParent parent = view.getParent();
            if (parent instanceof View) {
                View view2 = (View) parent;
                b2.set(view2.getLeft(), view2.getTop(), view2.getRight(), view2.getBottom());
                z = !b2.intersects(view.getLeft(), view.getTop(), view.getRight(), view.getBottom());
            }
            g(view, i2);
            if (z && b2.intersect(view.getLeft(), view.getTop(), view.getRight(), view.getBottom())) {
                ((View) parent).invalidate(b2);
            }
        } else {
            g(view, i2);
        }
    }

    public static void a(View view, float f2) {
        if (Build.VERSION.SDK_INT >= 21) {
            view.setElevation(f2);
        }
    }

    static boolean b(View view, KeyEvent keyEvent) {
        if (Build.VERSION.SDK_INT >= 28) {
            return false;
        }
        return e.a(view).a(view, keyEvent);
    }

    public static void a(View view, ColorStateList colorStateList) {
        boolean z;
        if (Build.VERSION.SDK_INT >= 21) {
            view.setBackgroundTintList(colorStateList);
            if (Build.VERSION.SDK_INT == 21) {
                Drawable background = view.getBackground();
                if (view.getBackgroundTintList() == null && view.getBackgroundTintMode() == null) {
                    z = false;
                } else {
                    z = true;
                }
                if (background != null && z) {
                    if (background.isStateful()) {
                        background.setState(view.getDrawableState());
                    }
                    view.setBackground(background);
                }
            }
        } else if (view instanceof u) {
            ((u) view).setSupportBackgroundTintList(colorStateList);
        }
    }

    public static void a(View view, int i2, int i3, int i4, int i5) {
        int i6 = Build.VERSION.SDK_INT;
        view.setPaddingRelative(i2, i3, i4, i5);
    }

    public static void a(View view, Context context, int[] iArr, AttributeSet attributeSet, TypedArray typedArray, int i2) {
        if (Build.VERSION.SDK_INT >= 29) {
            c.a(view, context, iArr, attributeSet, typedArray, i2, 0);
        }
    }

    static class c {
        static {
            Covode.recordClassIndex(880);
        }

        static void a(View view, Context context, int[] iArr, AttributeSet attributeSet, TypedArray typedArray, int i2, int i3) {
            view.saveAttributeDataForStyleable(context, iArr, attributeSet, typedArray, i2, i3);
        }
    }
}
