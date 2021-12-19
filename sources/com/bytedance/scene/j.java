package com.bytedance.scene;

import android.app.Activity;
import android.content.ClipboardManager;
import android.content.Context;
import android.content.res.Resources;
import android.os.Build;
import android.os.Bundle;
import android.os.Handler;
import android.os.Looper;
import android.os.Parcelable;
import android.text.TextUtils;
import android.util.Pair;
import android.util.SparseArray;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewParent;
import androidx.core.h.v;
import androidx.lifecycle.af;
import androidx.lifecycle.ag;
import androidx.lifecycle.i;
import androidx.lifecycle.l;
import androidx.lifecycle.m;
import androidx.lifecycle.n;
import com.bytedance.covode.number.Covode;
import com.bytedance.frameworks.apm.trace.MethodCollector;
import com.bytedance.scene.d.h;
import com.bytedance.scene.e.d;
import com.bytedance.scene.t;
import com.ss.android.ugc.aweme.lancet.i;
import com.zhiliaoapp.musically.R;
import java.lang.reflect.Field;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.ArrayList;
import java.util.List;

public abstract class j implements ag, m {

    /* renamed from: a  reason: collision with root package name */
    private Context f42904a;

    /* renamed from: b  reason: collision with root package name */
    private LayoutInflater f42905b;

    /* renamed from: c  reason: collision with root package name */
    private t f42906c;

    /* renamed from: d  reason: collision with root package name */
    private final StringBuilder f42907d = new StringBuilder(this.q.name);

    /* renamed from: e  reason: collision with root package name */
    private final Handler f42908e = new Handler(Looper.getMainLooper());

    /* renamed from: f  reason: collision with root package name */
    private final List<Runnable> f42909f = new ArrayList();

    /* renamed from: g  reason: collision with root package name */
    private boolean f42910g = false;

    /* renamed from: h  reason: collision with root package name */
    private boolean f42911h = false;

    /* renamed from: i  reason: collision with root package name */
    private final a f42912i = new a(new n(this), (byte) 0);

    /* renamed from: m  reason: collision with root package name */
    public Activity f42913m;
    public View n;
    public j o;
    public t.a p = t.f43033a;
    public w q = w.NONE;
    public Bundle r;
    public int s;

    static {
        Covode.recordClassIndex(26319);
    }

    public abstract View a(LayoutInflater layoutInflater, ViewGroup viewGroup);

    public void l() {
        this.o = null;
    }

    public void n() {
        this.f42910g = true;
    }

    public void n_() {
        this.f42910g = true;
    }

    public void o() {
        this.f42910g = true;
    }

    public void v() {
        this.f42910g = true;
    }

    public void x() {
        this.f42910g = true;
    }

    @Override // androidx.lifecycle.m
    public final i getLifecycle() {
        return this.f42912i;
    }

    /* access modifiers changed from: package-private */
    public static class a extends i {

        /* renamed from: b  reason: collision with root package name */
        final n f42916b;

        /* renamed from: c  reason: collision with root package name */
        final List<l> f42917c;

        static {
            Covode.recordClassIndex(26322);
        }

        @Override // androidx.lifecycle.i
        public final i.b a() {
            return this.f42916b.a();
        }

        private a(n nVar) {
            this.f42917c = new ArrayList();
            this.f42916b = nVar;
        }

        /* access modifiers changed from: package-private */
        public final void a(i.a aVar) {
            this.f42916b.a(aVar);
        }

        @Override // androidx.lifecycle.i
        public final void b(l lVar) {
            this.f42917c.remove(lVar);
            this.f42916b.b(lVar);
        }

        @Override // androidx.lifecycle.i
        public final void a(l lVar) {
            this.f42917c.add(lVar);
            this.f42916b.a(lVar);
        }

        /* synthetic */ a(n nVar, byte b2) {
            this(nVar);
        }
    }

    static class b implements t.b {

        /* renamed from: a  reason: collision with root package name */
        public af f42918a;

        static {
            Covode.recordClassIndex(26323);
        }

        @Override // com.bytedance.scene.t.b
        public final void a() {
            this.f42918a.a();
        }

        private b(af afVar) {
            this.f42918a = afVar;
        }

        /* synthetic */ b(af afVar, byte b2) {
            this(afVar);
        }
    }

    public final int hashCode() {
        return super.hashCode();
    }

    public void y() {
        this.f42910g = true;
        A();
    }

    /* access modifiers changed from: protected */
    public final void A() {
        boolean z = z();
        if (z != this.f42911h) {
            this.f42911h = z;
        }
    }

    public final t B() {
        t tVar = this.f42906c;
        if (tVar != null) {
            return tVar;
        }
        throw new IllegalStateException("Scope is not created, you can't call before onCreate");
    }

    public final View p() {
        View view = this.n;
        if (view != null) {
            return view;
        }
        throw new IllegalStateException("requireView() should not be called before onCreateView() or after onDestroyView()");
    }

    public boolean z() {
        if (this.q.value >= w.STARTED.value) {
            return true;
        }
        return false;
    }

    /* access modifiers changed from: protected */
    public final LayoutInflater cq_() {
        if (this.f42905b == null) {
            if (this.f42913m != null) {
                this.f42905b = new o(t(), this);
            } else {
                throw new IllegalStateException("onGetLayoutInflater() cannot be executed until the Scene is attached to the Activity.");
            }
        }
        return this.f42905b;
    }

    public void m() {
        Activity activity = this.f42913m;
        this.f42913m = null;
        this.f42904a = null;
        this.f42910g = false;
        this.f42910g = true;
        if (!activity.isChangingConfigurations()) {
            this.f42906c.b();
        }
        this.f42906c = null;
        this.f42909f.clear();
    }

    public final Context q() {
        Activity activity = this.f42913m;
        if (activity == null) {
            return null;
        }
        Context applicationContext = activity.getApplicationContext();
        if (com.ss.android.ugc.aweme.lancet.a.a.f107168c && applicationContext == null) {
            return com.ss.android.ugc.aweme.lancet.a.a.f107166a;
        }
        return applicationContext;
    }

    public final Activity t() {
        Activity activity = this.f42913m;
        if (activity != null) {
            return activity;
        }
        throw new IllegalStateException("Scene " + this + " not attached to an activity.");
    }

    public void cl_() {
        this.f42910g = false;
        v();
        if (this.f42910g) {
            a(this, false);
            a(w.STARTED);
            A();
            this.f42912i.a(i.a.ON_START);
            return;
        }
        throw new x("Scene " + this + " did not call through to super.onStart()");
    }

    public void cm_() {
        this.f42910g = false;
        w();
        if (this.f42910g) {
            b(this, false);
            a(w.RESUMED);
            this.f42912i.a(i.a.ON_RESUME);
            return;
        }
        throw new x("Scene " + this + " did not call through to super.onResume()");
    }

    public void cn_() {
        this.f42912i.a(i.a.ON_PAUSE);
        a(w.STARTED);
        this.f42910g = false;
        x();
        if (this.f42910g) {
            d(this, false);
            return;
        }
        throw new x("Scene " + this + " did not call through to super.onPause()");
    }

    public void co_() {
        this.f42912i.a(i.a.ON_STOP);
        a(w.ACTIVITY_CREATED);
        this.f42910g = false;
        y();
        if (this.f42910g) {
            c(this, false);
            return;
        }
        throw new x("Scene " + this + " did not call through to super.onStop()");
    }

    @Override // androidx.lifecycle.ag
    public final af getViewModelStore() {
        t B = B();
        if (B.f43037d.containsKey(b.class)) {
            return ((b) B.a(b.class)).f42918a;
        }
        af afVar = new af();
        B.a(b.class, new b(afVar, (byte) 0));
        return afVar;
    }

    public void k() {
        this.f42910g = false;
        o();
        if (this.f42910g) {
            f(this, false);
            return;
        }
        throw new x("Scene " + this + " did not call through to super.onDestroy()");
    }

    public final Context r() {
        Context r2;
        if (this.f42913m == null) {
            return null;
        }
        if (this.f42904a == null) {
            if (this.s > 0) {
                r2 = new d(this.f42913m, this.s) {
                    /* class com.bytedance.scene.j.AnonymousClass1 */

                    static {
                        Covode.recordClassIndex(26320);
                    }

                    @Override // android.content.Context, com.bytedance.scene.e.d, android.content.ContextWrapper
                    public final Object getSystemService(String str) {
                        if ("scene".equals(str)) {
                            return j.this;
                        }
                        if (!"layout_inflater".equals(str) || j.this.f42913m == null) {
                            return a((d) this, str);
                        }
                        return j.this.cq_();
                    }

                    private static Object a(d dVar, String str) {
                        Object obj;
                        MethodCollector.i(1959);
                        if (Build.VERSION.SDK_INT > 27 || !"clipboard".equals(str)) {
                            if (!com.ss.android.ugc.aweme.lancet.i.f107220b && "connectivity".equals(str)) {
                                try {
                                    new com.bytedance.platform.godzilla.b.b.b().a();
                                    com.ss.android.ugc.aweme.lancet.i.f107220b = true;
                                    obj = super.getSystemService(str);
                                } catch (Throwable unused) {
                                }
                            }
                            obj = super.getSystemService(str);
                        } else if (com.ss.android.ugc.aweme.lancet.i.f107219a) {
                            synchronized (ClipboardManager.class) {
                                try {
                                    obj = super.getSystemService(str);
                                    if (Thread.currentThread() != Looper.getMainLooper().getThread()) {
                                        try {
                                            Field declaredField = ClipboardManager.class.getDeclaredField("mHandler");
                                            declaredField.setAccessible(true);
                                            declaredField.set(obj, new i.a((Handler) declaredField.get(obj)));
                                        } catch (Exception e2) {
                                            com.bytedance.crash.d.a(e2, "ClipboardManager Handler Reflect Fail");
                                        }
                                    }
                                    com.ss.android.ugc.aweme.lancet.i.f107219a = false;
                                } finally {
                                    MethodCollector.o(1959);
                                }
                            }
                        } else {
                            obj = super.getSystemService(str);
                        }
                        return obj;
                    }
                };
            } else {
                Activity activity = this.f42913m;
                r2 = new d(activity, activity.getTheme()) {
                    /* class com.bytedance.scene.j.AnonymousClass2 */

                    static {
                        Covode.recordClassIndex(26321);
                    }

                    @Override // android.content.Context, com.bytedance.scene.e.d, android.content.ContextWrapper
                    public final Object getSystemService(String str) {
                        if ("scene".equals(str)) {
                            return j.this;
                        }
                        if (!"layout_inflater".equals(str) || j.this.f42913m == null) {
                            return a((d) this, str);
                        }
                        return j.this.cq_();
                    }

                    private static Object a(d dVar, String str) {
                        Object obj;
                        MethodCollector.i(3258);
                        if (Build.VERSION.SDK_INT > 27 || !"clipboard".equals(str)) {
                            if (!com.ss.android.ugc.aweme.lancet.i.f107220b && "connectivity".equals(str)) {
                                try {
                                    new com.bytedance.platform.godzilla.b.b.b().a();
                                    com.ss.android.ugc.aweme.lancet.i.f107220b = true;
                                    obj = super.getSystemService(str);
                                } catch (Throwable unused) {
                                }
                            }
                            obj = super.getSystemService(str);
                        } else if (com.ss.android.ugc.aweme.lancet.i.f107219a) {
                            synchronized (ClipboardManager.class) {
                                try {
                                    obj = super.getSystemService(str);
                                    if (Thread.currentThread() != Looper.getMainLooper().getThread()) {
                                        try {
                                            Field declaredField = ClipboardManager.class.getDeclaredField("mHandler");
                                            declaredField.setAccessible(true);
                                            declaredField.set(obj, new i.a((Handler) declaredField.get(obj)));
                                        } catch (Exception e2) {
                                            com.bytedance.crash.d.a(e2, "ClipboardManager Handler Reflect Fail");
                                        }
                                    }
                                    com.ss.android.ugc.aweme.lancet.i.f107219a = false;
                                } finally {
                                    MethodCollector.o(3258);
                                }
                            }
                        } else {
                            obj = super.getSystemService(str);
                        }
                        return obj;
                    }
                };
            }
            this.f42904a = r2;
        }
        return this.f42904a;
    }

    public final Context s() {
        Context r2 = r();
        if (r2 != null) {
            return r2;
        }
        throw new IllegalStateException("Scene " + this + " not attached to an activity.");
    }

    public final Context u() {
        Context q2 = q();
        if (q2 != null) {
            return q2;
        }
        throw new IllegalStateException("Scene " + this + " not attached to a context.");
    }

    public void w() {
        this.f42910g = true;
        if (this.f42909f.size() > 0) {
            ArrayList<Runnable> arrayList = new ArrayList(this.f42909f);
            for (Runnable runnable : arrayList) {
                runnable.run();
            }
            this.f42909f.removeAll(arrayList);
        }
    }

    public String toString() {
        int lastIndexOf;
        StringBuilder sb = new StringBuilder(128);
        String simpleName = getClass().getSimpleName();
        if ((simpleName == null || simpleName.length() <= 0) && (lastIndexOf = (simpleName = getClass().getName()).lastIndexOf(46)) > 0) {
            simpleName = simpleName.substring(lastIndexOf + 1);
        }
        sb.append(simpleName);
        sb.append('{');
        sb.append(Integer.toHexString(System.identityHashCode(this)));
        sb.append('}');
        return sb.toString();
    }

    public void cp_() {
        ViewParent parent;
        int i2 = Build.VERSION.SDK_INT;
        View view = this.n;
        if (com.bytedance.scene.d.l.f42773a == 0) {
            try {
                com.bytedance.scene.d.l.f42773a = 2;
                Method declaredMethod = ViewGroup.class.getDeclaredMethod("cancelTouchTarget", View.class);
                com.bytedance.scene.d.l.f42774b = declaredMethod;
                declaredMethod.setAccessible(true);
                com.bytedance.scene.d.l.f42773a = 1;
            } catch (NoSuchMethodException e2) {
                e2.printStackTrace();
            }
        }
        if (com.bytedance.scene.d.l.f42773a == 1 && (parent = view.getParent()) != null) {
            try {
                Method method = com.bytedance.scene.d.l.f42774b;
                Object[] objArr = {view};
                Pair<Boolean, Object> a2 = com.bytedance.helios.sdk.a.a(method, new Object[]{parent, objArr}, 110000, "java.lang.Object", true, "com_bytedance_scene_utlity_ViewRefUtility_java_lang_reflect_Method_invoke(Ljava/lang/reflect/Method;Ljava/lang/Object;[Ljava/lang/Object;)Ljava/lang/Object;");
                if (((Boolean) a2.first).booleanValue()) {
                    Object obj = a2.second;
                } else {
                    com.bytedance.helios.sdk.a.a(method.invoke(parent, objArr), method, new Object[]{parent, objArr}, "com_bytedance_scene_utlity_ViewRefUtility_java_lang_reflect_Method_invoke(Ljava/lang/reflect/Method;Ljava/lang/Object;[Ljava/lang/Object;)Ljava/lang/Object;");
                }
            } catch (IllegalAccessException e3) {
                e3.printStackTrace();
            } catch (InvocationTargetException e4) {
                e4.printStackTrace();
            }
        }
        this.f42912i.a(i.a.ON_DESTROY);
        a(w.NONE);
        this.f42910g = false;
        n_();
        if (this.f42910g) {
            e(this, false);
            int i3 = Build.VERSION.SDK_INT;
            this.n.cancelPendingInputEvents();
            this.n = null;
            this.f42905b = null;
            return;
        }
        throw new x("Scene " + this + " did not call through to super.onDestroyView()");
    }

    public void e(Bundle bundle) {
        this.f42910g = true;
    }

    public final boolean equals(Object obj) {
        return super.equals(obj);
    }

    public final <T extends View> T b(int i2) {
        View view = this.n;
        if (view == null) {
            return null;
        }
        return (T) view.findViewById(i2);
    }

    public final String c_(int i2) {
        return t().getResources().getString(i2);
    }

    public void a(Bundle bundle) {
        View decorView = t().getWindow().getDecorView();
        int systemUiVisibility = decorView.getSystemUiVisibility();
        if ((systemUiVisibility & 1024) != 0) {
            v.n(decorView);
        } else if ((systemUiVisibility & 512) != 0) {
            v.n(decorView);
        }
        this.f42910g = true;
    }

    public void d(Bundle bundle) {
        this.f42910g = false;
        f(bundle);
        if (!this.f42910g) {
            throw new x("Scene " + this + " did not call through to super.onSaveInstanceState()");
        }
    }

    public final <T extends View> T c(int i2) {
        T t = (T) p().findViewById(i2);
        if (t != null) {
            return t;
        }
        try {
            throw new IllegalArgumentException(" " + t().getResources().getResourceName(i2) + " view not found");
        } catch (Resources.NotFoundException unused) {
            throw new IllegalArgumentException(" " + i2 + " view not found");
        }
    }

    public void f(Bundle bundle) {
        this.f42910g = true;
        if (this.r != null) {
            bundle.putBoolean("bd-scene-nav:scene_argument_has", true);
            bundle.putBundle("bd-scene-nav:scene_argument", this.r);
        } else {
            bundle.putBoolean("bd-scene-nav:scene_argument_has", false);
        }
        bundle.putString("scope_key", this.f42906c.f43035b);
        SparseArray<Parcelable> sparseArray = new SparseArray<>();
        this.n.saveHierarchyState(sparseArray);
        bundle.putSparseParcelableArray("bd-scene:views", sparseArray);
        View findFocus = this.n.findFocus();
        if (!(findFocus == null || findFocus.getId() == -1)) {
            bundle.putInt("bd-scene:focusedViewId", findFocus.getId());
        }
        d(this, bundle, false);
    }

    private void a(w wVar) {
        w wVar2 = this.q;
        if (wVar.value > wVar2.value) {
            if (wVar.value - wVar2.value != 1) {
                throw new h("Cant setState from " + wVar2.name + " to " + wVar.name);
            }
        } else if (wVar.value < wVar2.value && !((wVar2 == w.ACTIVITY_CREATED && wVar == w.NONE) || wVar.value - wVar2.value == -1)) {
            throw new h("Cant setState from " + wVar2.name + " to " + wVar.name);
        }
        this.q = wVar;
        this.f42907d.append(" - " + wVar.name);
    }

    public void b(Bundle bundle) {
        j jVar = this.o;
        if (jVar == null) {
            this.f42906c = this.p.a();
        } else {
            t B = jVar.B();
            String str = null;
            if (bundle != null) {
                str = bundle.getString("scope_key");
            }
            if (TextUtils.isEmpty(str)) {
                str = t.a();
            }
            t tVar = B.f43036c.get(str);
            if (tVar == null) {
                tVar = new t(B, str);
                B.f43036c.put(str, tVar);
            }
            this.f42906c = tVar;
        }
        if (bundle != null && bundle.getBoolean("bd-scene-nav:scene_argument_has")) {
            Bundle bundle2 = bundle.getBundle("bd-scene-nav:scene_argument");
            if (bundle2 != null) {
                bundle2.setClassLoader(getClass().getClassLoader());
                this.r = bundle2;
            } else {
                throw new IllegalStateException("can't get Scene arguments from savedInstanceState");
            }
        }
        this.f42910g = false;
        e(bundle);
        if (this.f42910g) {
            a(this, bundle, false);
            return;
        }
        throw new x("Scene " + this + " did not call through to super.onCreate()");
    }

    public void c(Bundle bundle) {
        View findViewById;
        this.f42910g = false;
        a(bundle);
        if (this.f42910g) {
            c(this, bundle, false);
            if (bundle != null) {
                this.f42910g = false;
                this.f42910g = true;
                SparseArray<Parcelable> sparseParcelableArray = bundle.getSparseParcelableArray("bd-scene:views");
                if (sparseParcelableArray != null) {
                    this.n.restoreHierarchyState(sparseParcelableArray);
                }
                int i2 = bundle.getInt("bd-scene:focusedViewId", -1);
                if (!(i2 == -1 || (findViewById = this.n.findViewById(i2)) == null)) {
                    findViewById.requestFocus();
                }
                if (!this.f42910g) {
                    throw new x("Scene " + this + " did not call through to super.onViewStateRestored()");
                }
            }
            a(w.ACTIVITY_CREATED);
            this.f42912i.a(i.a.ON_CREATE);
            return;
        }
        throw new x("Scene " + this + " did not call through to super.onActivityCreated()");
    }

    public void a(Activity activity) {
        this.f42913m = activity;
        if (this.f42912i.a() != i.b.INITIALIZED) {
            a aVar = this.f42912i;
            for (l lVar : aVar.f42917c) {
                aVar.f42916b.b(lVar);
            }
            aVar.f42916b.a(i.b.INITIALIZED);
            for (l lVar2 : aVar.f42917c) {
                aVar.f42916b.a(lVar2);
            }
        }
    }

    public void a(j jVar) {
        if (jVar != null) {
            this.o = jVar;
        }
        this.f42910g = false;
        n();
        if (!this.f42910g) {
            throw new x("Scene " + this + " did not call through to super.onAttach()");
        }
    }

    public void a(View view, Bundle bundle) {
        this.f42910g = true;
    }

    public final String a(int i2, Object... objArr) {
        return t().getResources().getString(i2, objArr);
    }

    public void e(j jVar, boolean z) {
        boolean z2;
        j jVar2 = this.o;
        if (jVar2 != null) {
            if (jVar == this) {
                z2 = true;
            } else {
                z2 = false;
            }
            jVar2.e(jVar, z2);
        }
    }

    public void f(j jVar, boolean z) {
        boolean z2;
        j jVar2 = this.o;
        if (jVar2 != null) {
            if (jVar == this) {
                z2 = true;
            } else {
                z2 = false;
            }
            jVar2.f(jVar, z2);
        }
    }

    public void c(j jVar, boolean z) {
        boolean z2;
        j jVar2 = this.o;
        if (jVar2 != null) {
            if (jVar == this) {
                z2 = true;
            } else {
                z2 = false;
            }
            jVar2.c(jVar, z2);
        }
    }

    public void d(j jVar, boolean z) {
        boolean z2;
        j jVar2 = this.o;
        if (jVar2 != null) {
            if (jVar == this) {
                z2 = true;
            } else {
                z2 = false;
            }
            jVar2.d(jVar, z2);
        }
    }

    public void b(j jVar, boolean z) {
        boolean z2;
        j jVar2 = this.o;
        if (jVar2 != null) {
            if (jVar == this) {
                z2 = true;
            } else {
                z2 = false;
            }
            jVar2.b(jVar, z2);
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

    public void a(Bundle bundle, ViewGroup viewGroup) {
        if (this.n == null) {
            View a2 = a(cq_(), viewGroup);
            if (a2 == null) {
                throw new IllegalArgumentException("onCreateView cant return null");
            } else if (a2.getParent() == null) {
                a2.getId();
                Context s2 = s();
                Context context = a2.getContext();
                if (context == s2 || this.s == 0 || a(context, "scene") == this) {
                    a2.setTag(R.id.a1f, this);
                    a2.setSaveFromParentEnabled(false);
                    this.n = a2;
                    this.f42910g = false;
                    a(a2, bundle);
                    if (this.f42910g) {
                        b(this, bundle, false);
                        a(w.VIEW_CREATED);
                        return;
                    }
                    throw new x("Scene " + this + " did not call through to super.onViewCreated()");
                }
                throw new IllegalArgumentException("Scene view's context is incorrect, you should create view with getLayoutInflater() or requireSceneContext() instead");
            } else {
                throw new IllegalArgumentException("onCreateView returned view already has a parent. You must call removeView() on the view's parent first.");
            }
        } else {
            throw new IllegalArgumentException("Scene already call onCreateView");
        }
    }

    public void a(j jVar, boolean z) {
        boolean z2;
        j jVar2 = this.o;
        if (jVar2 != null) {
            if (jVar == this) {
                z2 = true;
            } else {
                z2 = false;
            }
            jVar2.a(jVar, z2);
        }
    }

    public void c(j jVar, Bundle bundle, boolean z) {
        boolean z2;
        j jVar2 = this.o;
        if (jVar2 != null) {
            if (jVar == this) {
                z2 = true;
            } else {
                z2 = false;
            }
            jVar2.c(jVar, bundle, z2);
        }
    }

    public void d(j jVar, Bundle bundle, boolean z) {
        boolean z2;
        j jVar2 = this.o;
        if (jVar2 != null) {
            if (jVar == this) {
                z2 = true;
            } else {
                z2 = false;
            }
            jVar2.d(jVar, bundle, z2);
        }
    }

    public void a(j jVar, Bundle bundle, boolean z) {
        boolean z2;
        j jVar2 = this.o;
        if (jVar2 != null) {
            if (jVar == this) {
                z2 = true;
            } else {
                z2 = false;
            }
            jVar2.a(jVar, bundle, z2);
        }
    }

    public void b(j jVar, Bundle bundle, boolean z) {
        boolean z2;
        j jVar2 = this.o;
        if (jVar2 != null) {
            if (jVar == this) {
                z2 = true;
            } else {
                z2 = false;
            }
            jVar2.b(jVar, bundle, z2);
        }
    }
}
