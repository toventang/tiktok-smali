package com.lynx.tasm;

import android.app.Application;
import android.content.ClipboardManager;
import android.content.Context;
import android.content.SharedPreferences;
import android.os.Build;
import android.os.Handler;
import android.os.Looper;
import android.os.SystemClock;
import android.view.inputmethod.InputMethodManager;
import com.bytedance.covode.number.Covode;
import com.bytedance.crash.d;
import com.bytedance.frameworks.apm.trace.MethodCollector;
import com.bytedance.librarian.Librarian;
import com.lynx.jsbridge.LynxModule;
import com.lynx.jsbridge.LynxModuleManager;
import com.lynx.jsbridge.NetworkingModule;
import com.lynx.tasm.base.LLog;
import com.lynx.tasm.base.TraceEvent;
import com.lynx.tasm.base.e;
import com.lynx.tasm.behavior.a;
import com.lynx.tasm.behavior.utils.PropsHolderAutoRegister;
import com.lynx.tasm.behavior.utils.c;
import com.lynx.tasm.i;
import com.lynx.tasm.provider.CanvasProvider;
import com.lynx.tasm.provider.b;
import com.lynx.tasm.provider.h;
import com.lynx.tasm.provider.k;
import com.lynx.tasm.provider.l;
import com.ss.android.ugc.aweme.lancet.i;
import com.ss.android.ugc.aweme.lancet.m;
import java.lang.reflect.Field;
import java.lang.reflect.InvocationTargetException;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.concurrent.atomic.AtomicBoolean;

public class LynxEnv {
    private static a G;
    private static volatile LynxEnv x;
    private boolean A = false;
    private boolean B = true;
    private boolean C = false;
    private boolean D = true;
    private volatile boolean E = false;
    private HashMap<String, Object> F = new HashMap<>();
    private volatile boolean H = false;
    private Boolean I = false;

    /* renamed from: a  reason: collision with root package name */
    public Application f55531a;

    /* renamed from: b  reason: collision with root package name */
    public b f55532b;

    /* renamed from: c  reason: collision with root package name */
    public k f55533c;

    /* renamed from: d  reason: collision with root package name */
    public l f55534d;

    /* renamed from: e  reason: collision with root package name */
    public com.lynx.tasm.behavior.b f55535e;

    /* renamed from: f  reason: collision with root package name */
    public final AtomicBoolean f55536f = new AtomicBoolean(false);

    /* renamed from: g  reason: collision with root package name */
    public boolean f55537g = false;

    /* renamed from: h  reason: collision with root package name */
    public boolean f55538h = false;

    /* renamed from: i  reason: collision with root package name */
    public boolean f55539i = true;

    /* renamed from: j  reason: collision with root package name */
    public boolean f55540j = true;

    /* renamed from: k  reason: collision with root package name */
    public boolean f55541k = false;

    /* renamed from: l  reason: collision with root package name */
    public boolean f55542l = false;

    /* renamed from: m  reason: collision with root package name */
    public LynxModuleManager f55543m;
    public List<com.lynx.tasm.behavior.a> n;
    public final p o = new p();
    public com.lynx.tasm.behavior.ui.a.b p = null;
    public CanvasProvider q = null;
    public InputMethodManager r = null;
    public boolean s = true;
    public f t = null;
    public SharedPreferences u;
    public Map<String, h> v = new HashMap();
    public String w = null;
    private boolean y = false;
    private boolean z = true;

    public interface a {
        static {
            Covode.recordClassIndex(34782);
        }
    }

    public static String g() {
        return "2.1.5-rc.33-cxxshared";
    }

    public native boolean nativeGetEnv(String str, boolean z2);

    public native void nativeSetEnv(String str, boolean z2);

    public final boolean f() {
        a();
        return this.E;
    }

    static {
        Covode.recordClassIndex(34781);
        if (!c.f56453a) {
            c.f56453a = true;
        }
    }

    /* access modifiers changed from: package-private */
    public final synchronized List<com.lynx.tasm.behavior.a> c() {
        List<com.lynx.tasm.behavior.a> list;
        MethodCollector.i(13695);
        list = this.n;
        MethodCollector.o(13695);
        return list;
    }

    public final boolean d() {
        SharedPreferences sharedPreferences = this.u;
        if (sharedPreferences != null) {
            return sharedPreferences.getBoolean("enable_devtool", this.y);
        }
        LLog.a(6, "LynxEnv", "isDevtoolEnabled() must be called after init()");
        return false;
    }

    public final boolean e() {
        SharedPreferences sharedPreferences = this.u;
        if (sharedPreferences != null) {
            return sharedPreferences.getBoolean("enable_redbox", this.z);
        }
        LLog.a(6, "LynxEnv", "isRedBoxEnabled() must be called after init()");
        return false;
    }

    public static LynxEnv b() {
        MethodCollector.i(13630);
        if (x == null) {
            synchronized (LynxEnv.class) {
                try {
                    if (x == null) {
                        x = new LynxEnv();
                    }
                } catch (Throwable th) {
                    MethodCollector.o(13630);
                    throw th;
                }
            }
        }
        LynxEnv lynxEnv = x;
        MethodCollector.o(13630);
        return lynxEnv;
    }

    private LynxEnv() {
    }

    private void h() {
        if (f()) {
            try {
                Class<?> cls = Class.forName("com.lynx.devtool.LynxDevtoolEnv");
                Object invoke = cls.getMethod("inst", new Class[0]).invoke(null, new Object[0]);
                cls.getMethod("init", Context.class).invoke(invoke, this.f55531a);
            } catch (Exception e2) {
                LLog.a(6, "LynxEnv", "initDevtoolEnv failed: " + e2.toString());
            }
        }
    }

    public final synchronized void a() {
        MethodCollector.i(13628);
        if (this.f55536f.get() || this.H) {
            MethodCollector.o(13628);
            return;
        }
        i.a aVar = i.f56647a;
        if (aVar != null) {
            this.H = true;
            aVar.a();
            MethodCollector.o(13628);
            return;
        }
        if (G != null) {
            this.H = true;
        }
        MethodCollector.o(13628);
    }

    private void a(Map<String, Object> map) {
        this.o.a(map);
    }

    private static void a(String str) {
        long uptimeMillis = SystemClock.uptimeMillis();
        Librarian.a(str, false, (Context) null);
        m.a(uptimeMillis, str);
    }

    public final void b(boolean z2) {
        String str;
        if (z2) {
            str = "Turn on devtool";
        } else {
            str = "Turn off devtool";
        }
        LLog.a(4, "LynxEnv", str);
        this.y = z2;
        if (z2) {
            LLog.a(2);
        } else {
            LLog.a(4);
        }
        a("enable_devtool", z2);
    }

    public final void c(boolean z2) {
        String str;
        if (z2) {
            str = "Turn on redbox";
        } else {
            str = "Turn off redbox";
        }
        LLog.a(4, "LynxEnv", str);
        this.z = z2;
        a("enable_redbox", z2);
    }

    private boolean a(f fVar) {
        if (this.f55538h) {
            if (fVar != null) {
                try {
                    fVar.a("lynx_debug");
                    this.t = fVar;
                    return true;
                } catch (UnsatisfiedLinkError e2) {
                    LLog.a(6, "LynxEnv", "Debug Lynx Library load from system with error message " + e2.getMessage());
                }
            } else {
                a("lynx_debug");
                return true;
            }
        }
        return false;
    }

    public final void a(HashMap<String, Object> hashMap) {
        MethodCollector.i(13865);
        synchronized (this) {
            try {
                this.F = hashMap;
            } finally {
                MethodCollector.o(13865);
            }
        }
    }

    public final void a(boolean z2) {
        String str;
        if (z2) {
            str = "enable lynx debug";
        } else {
            str = "disable lynx debug";
        }
        LLog.a(4, "LynxEnv", str);
        this.f55537g = z2;
        if (z2 && this.f55531a != null) {
            h();
        }
    }

    public static Object a(Application application, String str) {
        Object obj;
        MethodCollector.i(13810);
        if (Build.VERSION.SDK_INT > 27 || !"clipboard".equals(str)) {
            if (!com.ss.android.ugc.aweme.lancet.i.f107220b && "connectivity".equals(str)) {
                try {
                    new com.bytedance.platform.godzilla.b.b.b().a();
                    com.ss.android.ugc.aweme.lancet.i.f107220b = true;
                    obj = application.getSystemService(str);
                } catch (Throwable unused) {
                }
            }
            obj = application.getSystemService(str);
        } else if (com.ss.android.ugc.aweme.lancet.i.f107219a) {
            synchronized (ClipboardManager.class) {
                try {
                    obj = application.getSystemService(str);
                    if (Thread.currentThread() != Looper.getMainLooper().getThread()) {
                        try {
                            Field declaredField = ClipboardManager.class.getDeclaredField("mHandler");
                            declaredField.setAccessible(true);
                            declaredField.set(obj, new i.a((Handler) declaredField.get(obj)));
                        } catch (Exception e2) {
                            d.a(e2, "ClipboardManager Handler Reflect Fail");
                        }
                    }
                    com.ss.android.ugc.aweme.lancet.i.f107219a = false;
                } finally {
                    MethodCollector.o(13810);
                }
            }
        } else {
            obj = application.getSystemService(str);
        }
        return obj;
    }

    public final boolean b(String str, boolean z2) {
        if (!f()) {
            return z2;
        }
        try {
            Class<?> cls = Class.forName("com.lynx.devtool.LynxDevtoolEnv");
            Object invoke = cls.getMethod("inst", new Class[0]).invoke(null, new Object[0]);
            z2 = ((Boolean) cls.getMethod("getDevtoolEnv", String.class, Boolean.class).invoke(invoke, str, Boolean.valueOf(z2))).booleanValue();
            return z2;
        } catch (Exception e2) {
            LLog.a(6, "LynxEnv", "getDevtoolEnv failed: " + e2.toString());
            return z2;
        }
    }

    public final void a(String str, boolean z2) {
        if (f()) {
            try {
                Class<?> cls = Class.forName("com.lynx.devtool.LynxDevtoolEnv");
                Object invoke = cls.getMethod("inst", new Class[0]).invoke(null, new Object[0]);
                cls.getMethod("setDevtoolEnv", String.class, Boolean.class).invoke(invoke, str, Boolean.valueOf(z2));
            } catch (Exception e2) {
                LLog.a(6, "LynxEnv", "setDevtoolEnv failed: " + e2.toString());
            }
        }
    }

    public final void a(String str, Class<? extends LynxModule> cls, Object obj) {
        if (this.f55543m == null) {
            this.f55543m = new LynxModuleManager(this.f55531a);
        }
        this.f55543m.a(str, cls, obj);
    }

    public static void reportPiperInvoked(String str, String str2, String str3, String str4) {
        HashMap hashMap = new HashMap();
        hashMap.put("module-name", str);
        hashMap.put("method-name", str2);
        hashMap.put("url", str4);
        if (!str3.isEmpty()) {
            ArrayList arrayList = new ArrayList();
            arrayList.add(str3);
            hashMap.put("params", arrayList);
        }
        b().a((Map<String, Object>) hashMap);
    }

    public final synchronized void a(Application application, f fVar, b bVar, com.lynx.tasm.behavior.b bVar2) {
        int i2;
        MethodCollector.i(13627);
        if (this.f55536f.get()) {
            LLog.a(5, "LynxEnv", "LynxEnv is already initialized");
            MethodCollector.o(13627);
            return;
        }
        LLog.a(4, "LynxEnv", "LynxEnv start init");
        this.f55536f.set(true);
        if (TraceEvent.a() && com.lynx.a.f55044d.booleanValue()) {
            try {
                Class.forName("android.os.Trace").getDeclaredMethod("setAppTracingAllowed", Boolean.TYPE).invoke(null, true);
            } catch (ClassNotFoundException | NoSuchMethodException e2) {
                e2.printStackTrace();
            } catch (IllegalAccessException e3) {
                e3.printStackTrace();
            } catch (InvocationTargetException e4) {
                e4.printStackTrace();
            }
        }
        if (!PropsHolderAutoRegister.f56446a) {
            PropsHolderAutoRegister.f56446a = true;
        }
        this.f55531a = application;
        SharedPreferences a2 = com.ss.android.ugc.aweme.bf.d.a(application, "lynx_env_config", 0);
        this.u = a2;
        this.f55538h = a2.getBoolean("enable_debug_mode", com.lynx.a.f55041a.booleanValue());
        this.f55535e = bVar2;
        this.f55532b = bVar;
        ArrayList arrayList = new ArrayList();
        this.n = arrayList;
        arrayList.addAll(new com.lynx.tasm.behavior.d().a());
        if (b().f55535e != null) {
            this.n.addAll(b().f55535e.a());
        }
        com.lynx.tasm.core.a.a().execute(new Runnable(this.n) {
            /* class com.lynx.tasm.b.AnonymousClass1 */

            /* renamed from: a  reason: collision with root package name */
            final /* synthetic */ List f55741a;

            static {
                Covode.recordClassIndex(34855);
            }

            public final void run() {
                SystemClock.uptimeMillis();
                try {
                    for (a aVar : this.f55741a) {
                        a b2 = aVar.b();
                        if (b2 != null) {
                            b2.a();
                        }
                    }
                    SystemClock.uptimeMillis();
                } catch (Throwable unused) {
                }
            }

            {
                this.f55741a = r1;
            }
        });
        LynxModuleManager lynxModuleManager = new LynxModuleManager(application);
        this.f55543m = lynxModuleManager;
        lynxModuleManager.a("NetworkingModule", NetworkingModule.class, null);
        if (!this.E) {
            try {
                if (a(fVar)) {
                    LLog.a(4, "LynxEnv", "Debug Lynx Library load success ");
                    this.E = true;
                } else {
                    if (fVar != null) {
                        fVar.a("lynx");
                        this.t = fVar;
                    } else {
                        a("lynx");
                    }
                    this.E = true;
                    e eVar = LLog.f55753b.get(Integer.valueOf(LLog.f55752a));
                    if (eVar != null) {
                        i2 = eVar.b();
                    } else {
                        i2 = 4;
                    }
                    LLog.a(i2);
                    LLog.a(4, "LynxEnv", "Native Lynx Library load success ");
                }
            } catch (UnsatisfiedLinkError e5) {
                if (fVar == null) {
                    LLog.a(6, "LynxEnv", "Native Lynx Library load from system with error message " + e5.getMessage());
                } else {
                    LLog.a(6, "LynxEnv", "Native Lynx Library load from " + fVar.getClass().getName() + " with error message " + e5.getMessage());
                }
                this.E = false;
            }
        }
        LynxSettingsManager.inst().initSettings(application);
        if (this.f55537g) {
            h();
        }
        MethodCollector.o(13627);
    }
}
