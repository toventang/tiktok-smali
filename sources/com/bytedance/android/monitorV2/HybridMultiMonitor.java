package com.bytedance.android.monitorV2;

import android.app.Activity;
import android.app.Application;
import android.net.Uri;
import android.os.Bundle;
import android.text.TextUtils;
import android.view.ActionMode;
import android.view.KeyEvent;
import android.view.Menu;
import android.view.MenuItem;
import android.view.MotionEvent;
import android.view.SearchEvent;
import android.view.View;
import android.view.Window;
import android.view.WindowManager;
import android.view.accessibility.AccessibilityEvent;
import com.bytedance.android.monitorV2.a.d;
import com.bytedance.android.monitorV2.a.h;
import com.bytedance.android.monitorV2.h.a.a;
import com.bytedance.android.monitorV2.h.a.c;
import com.bytedance.android.monitorV2.h.f;
import com.bytedance.android.monitorV2.l.i;
import com.bytedance.android.monitorV2.l.j;
import com.bytedance.covode.number.Covode;
import com.bytedance.frameworks.apm.trace.MethodCollector;
import h.f.b.l;
import h.m.p;
import java.io.File;
import java.util.Collections;
import java.util.HashSet;
import java.util.List;
import java.util.Set;
import java.util.concurrent.CopyOnWriteArrayList;
import org.json.JSONObject;

public class HybridMultiMonitor {
    private static volatile HybridMultiMonitor instance;
    public boolean AB_TEST = false;
    private Application application;
    private d exceptionHandler;
    private f hybridSettingManager;
    private List<h> interceptorList;
    private boolean isInitialized;
    private boolean isRegisterTouchCallback;
    private a normalCustomMonitor = new a();
    private a touchTraceCallback;

    static {
        Covode.recordClassIndex(14089);
    }

    public static boolean isDebuggable() {
        return com.bytedance.android.monitorV2.c.a.f23839a;
    }

    public static boolean isOutputFile() {
        return com.bytedance.android.monitorV2.c.a.f23840b;
    }

    public Application getApplication() {
        return this.application;
    }

    public d getExceptionHandler() {
        return this.exceptionHandler;
    }

    public boolean isAbTestEnable() {
        return this.AB_TEST;
    }

    /* access modifiers changed from: package-private */
    public static class b implements Window.Callback {

        /* renamed from: a  reason: collision with root package name */
        private Window.Callback f23820a;

        static {
            Covode.recordClassIndex(14095);
        }

        public final void onAttachedToWindow() {
            this.f23820a.onAttachedToWindow();
        }

        public final void onContentChanged() {
            this.f23820a.onContentChanged();
        }

        public final void onDetachedFromWindow() {
            this.f23820a.onDetachedFromWindow();
        }

        public final boolean onSearchRequested() {
            return this.f23820a.onSearchRequested();
        }

        private b(Window.Callback callback) {
            this.f23820a = callback;
        }

        public final boolean dispatchGenericMotionEvent(MotionEvent motionEvent) {
            return this.f23820a.dispatchGenericMotionEvent(motionEvent);
        }

        public final boolean dispatchKeyEvent(KeyEvent keyEvent) {
            return this.f23820a.dispatchKeyEvent(keyEvent);
        }

        public final boolean dispatchKeyShortcutEvent(KeyEvent keyEvent) {
            return this.f23820a.dispatchKeyShortcutEvent(keyEvent);
        }

        public final boolean dispatchPopulateAccessibilityEvent(AccessibilityEvent accessibilityEvent) {
            return this.f23820a.dispatchPopulateAccessibilityEvent(accessibilityEvent);
        }

        public final boolean dispatchTrackballEvent(MotionEvent motionEvent) {
            return this.f23820a.dispatchTrackballEvent(motionEvent);
        }

        public final void onActionModeFinished(ActionMode actionMode) {
            this.f23820a.onActionModeFinished(actionMode);
        }

        public final void onActionModeStarted(ActionMode actionMode) {
            this.f23820a.onActionModeStarted(actionMode);
        }

        public final View onCreatePanelView(int i2) {
            return this.f23820a.onCreatePanelView(i2);
        }

        public final void onWindowAttributesChanged(WindowManager.LayoutParams layoutParams) {
            this.f23820a.onWindowAttributesChanged(layoutParams);
        }

        public final void onWindowFocusChanged(boolean z) {
            this.f23820a.onWindowFocusChanged(z);
        }

        public final ActionMode onWindowStartingActionMode(ActionMode.Callback callback) {
            return this.f23820a.onWindowStartingActionMode(callback);
        }

        public final boolean onSearchRequested(SearchEvent searchEvent) {
            return this.f23820a.onSearchRequested(searchEvent);
        }

        public final boolean dispatchTouchEvent(MotionEvent motionEvent) {
            if (motionEvent != null && motionEvent.getAction() == 0) {
                j.f24021a = System.currentTimeMillis();
            }
            return this.f23820a.dispatchTouchEvent(motionEvent);
        }

        /* synthetic */ b(Window.Callback callback, byte b2) {
            this(callback);
        }

        public final boolean onCreatePanelMenu(int i2, Menu menu) {
            return this.f23820a.onCreatePanelMenu(i2, menu);
        }

        public final boolean onMenuItemSelected(int i2, MenuItem menuItem) {
            return this.f23820a.onMenuItemSelected(i2, menuItem);
        }

        public final boolean onMenuOpened(int i2, Menu menu) {
            return this.f23820a.onMenuOpened(i2, menu);
        }

        public final void onPanelClosed(int i2, Menu menu) {
            this.f23820a.onPanelClosed(i2, menu);
        }

        public final ActionMode onWindowStartingActionMode(ActionMode.Callback callback, int i2) {
            return this.f23820a.onWindowStartingActionMode(callback, i2);
        }

        public final boolean onPreparePanel(int i2, View view, Menu menu) {
            return this.f23820a.onPreparePanel(i2, view, menu);
        }
    }

    private void initComponent() {
        injectWebOffline();
        injectFalconX();
    }

    public com.bytedance.android.monitorV2.webview.b getCustomReportMonitor() {
        return this.normalCustomMonitor.f23821a;
    }

    /* access modifiers changed from: package-private */
    public static class a implements Application.ActivityLifecycleCallbacks {

        /* renamed from: a  reason: collision with root package name */
        private Set<Integer> f23819a;

        static {
            Covode.recordClassIndex(14094);
        }

        public void onActivityPaused(Activity activity) {
        }

        public void onActivityResumed(Activity activity) {
        }

        public void onActivitySaveInstanceState(Activity activity, Bundle bundle) {
        }

        public void onActivityStopped(Activity activity) {
        }

        private a() {
            this.f23819a = new HashSet();
        }

        /* synthetic */ a(byte b2) {
            this();
        }

        public void onActivityStarted(Activity activity) {
            a(activity);
        }

        public void onActivityDestroyed(Activity activity) {
            this.f23819a.remove(Integer.valueOf(activity.hashCode()));
        }

        private boolean b(Activity activity) {
            if (activity != null && !this.f23819a.contains(Integer.valueOf(activity.hashCode()))) {
                return true;
            }
            return false;
        }

        public final void a(Activity activity) {
            try {
                if (b(activity)) {
                    this.f23819a.add(Integer.valueOf(activity.hashCode()));
                    Window window = activity.getWindow();
                    window.setCallback(new b(window.getCallback(), (byte) 0));
                }
            } catch (Exception unused) {
                HybridMultiMonitor.getInstance().getExceptionHandler();
            }
        }

        public void onActivityCreated(Activity activity, Bundle bundle) {
            a(activity);
        }
    }

    private void initDebugEnvir() {
        com.bytedance.android.monitorV2.f.a.a(new Runnable() {
            /* class com.bytedance.android.monitorV2.HybridMultiMonitor.AnonymousClass2 */

            static {
                Covode.recordClassIndex(14091);
            }

            public final void run() {
                Application application = HybridMultiMonitor.this.getApplication();
                if (application != null) {
                    try {
                        File a2 = com.bytedance.android.monitorV2.l.d.a(application, "monitor_data_switch");
                        File file = new File(a2, "is_debug");
                        if (file.isFile() && file.exists()) {
                            com.bytedance.android.monitorV2.c.a.a(true, false);
                        }
                        File file2 = new File(a2, "is_output_file");
                        if (file2.isFile() && file2.exists()) {
                            com.bytedance.android.monitorV2.c.a.b(true, false);
                        }
                    } catch (Throwable unused) {
                        HybridMultiMonitor.getInstance().getExceptionHandler();
                    }
                }
            }
        });
    }

    private void initFileRecord() {
        registerReportInterceptor(new h() {
            /* class com.bytedance.android.monitorV2.HybridMultiMonitor.AnonymousClass1 */

            static {
                Covode.recordClassIndex(14090);
            }

            @Override // com.bytedance.android.monitorV2.a.h
            public final void a(String str, String str2, JSONObject jSONObject) {
                boolean z;
                com.bytedance.android.monitorV2.i.b.b("HybridMultiMonitor", "fileRecord, outputFile: " + HybridMultiMonitor.isOutputFile() + ", service: " + str + ", eventType: " + str2);
                if (HybridMultiMonitor.isOutputFile()) {
                    l.c(str2, "");
                    l.c(jSONObject, "");
                    if (l.a((Object) "samplecustom", (Object) str2) || l.a((Object) "newcustom", (Object) str2) || l.a((Object) "custom", (Object) str2)) {
                        z = true;
                    } else {
                        z = false;
                    }
                    if (z) {
                        try {
                            String optString = jSONObject.getJSONObject("extra").optString("url", "");
                            HybridMultiMonitor instance = HybridMultiMonitor.getInstance();
                            l.a((Object) instance, "");
                            File a2 = com.bytedance.android.monitorV2.l.d.a(instance.getApplication(), "monitor_data_debug");
                            if (a2 != null && a2.exists()) {
                                com.bytedance.android.monitorV2.l.d.a(new File(a2, "custom_with_".concat(String.valueOf(Uri.parse(optString).getQueryParameter("bytest_case_id")))).getAbsolutePath(), p.b("\n     " + jSONObject + "\n     \n     "));
                            }
                        } catch (Exception e2) {
                            e2.printStackTrace();
                        }
                    } else {
                        try {
                            JSONObject jSONObject2 = jSONObject.getJSONObject("extra").getJSONObject("nativeBase");
                            String string = jSONObject2.getString("navigation_id");
                            String optString2 = jSONObject2.optString("url", "");
                            HybridMultiMonitor instance2 = HybridMultiMonitor.getInstance();
                            l.a((Object) instance2, "");
                            File a3 = com.bytedance.android.monitorV2.l.d.a(instance2.getApplication(), "monitor_data_debug");
                            if (a3 != null && a3.exists()) {
                                com.bytedance.android.monitorV2.l.d.a(new File(a3, string + "_with_" + Uri.parse(optString2).getQueryParameter("bytest_case_id")).getAbsolutePath(), p.b("\n     " + jSONObject + "\n     \n     "));
                            }
                        } catch (Exception e3) {
                            e3.printStackTrace();
                        }
                    }
                }
            }
        });
    }

    private void injectFalconX() {
        com.bytedance.android.monitorV2.f.a.a().execute(new Runnable() {
            /* class com.bytedance.android.monitorV2.HybridMultiMonitor.AnonymousClass4 */

            static {
                Covode.recordClassIndex(14093);
            }

            public final void run() {
                try {
                    Class<?> cls = Class.forName("com.bytedance.webx.monitor.falconx.NewFalconXMonitor");
                    i.a(cls, "beginMonitor", i.a(cls, "getInstance", new Object[0]));
                } catch (Exception unused) {
                    HybridMultiMonitor.getInstance().getExceptionHandler();
                }
            }
        });
    }

    private void injectWebOffline() {
        com.bytedance.android.monitorV2.f.a.a().execute(new Runnable() {
            /* class com.bytedance.android.monitorV2.HybridMultiMonitor.AnonymousClass3 */

            static {
                Covode.recordClassIndex(14092);
            }

            public final void run() {
                try {
                    Class<?> cls = Class.forName("com.bytedance.webx.monitor.weboffline.NewWebOfflineMonitor");
                    i.a(cls, "beginMonitor", i.a(cls, "getInstance", new Object[0]));
                } catch (Exception unused) {
                    HybridMultiMonitor.getInstance().getExceptionHandler();
                }
            }
        });
    }

    public void DisableReportInfo() {
        c.a().f23838a.clear();
    }

    public f getHybridSettingManager() {
        f fVar = this.hybridSettingManager;
        if (fVar != null) {
            return fVar;
        }
        return com.bytedance.android.monitorV2.h.b.a();
    }

    public void registerTouchCallback() {
        if (this.application != null && !this.isRegisterTouchCallback) {
            a aVar = new a((byte) 0);
            this.touchTraceCallback = aVar;
            this.application.registerActivityLifecycleCallbacks(aVar);
            this.isRegisterTouchCallback = true;
        }
    }

    public static HybridMultiMonitor getInstance() {
        MethodCollector.i(12932);
        if (instance == null) {
            synchronized (HybridMultiMonitor.class) {
                try {
                    if (instance == null) {
                        instance = new HybridMultiMonitor();
                    }
                } catch (Throwable th) {
                    MethodCollector.o(12932);
                    throw th;
                }
            }
        }
        HybridMultiMonitor hybridMultiMonitor = instance;
        MethodCollector.o(12932);
        return hybridMultiMonitor;
    }

    public void setAbTestEnable(boolean z) {
        this.AB_TEST = z;
    }

    public void setExceptionHandler(d dVar) {
        this.exceptionHandler = dVar;
    }

    public static void setDebuggable(boolean z) {
        com.bytedance.android.monitorV2.c.a.a(z, false);
    }

    public static void setOutputFile(boolean z) {
        com.bytedance.android.monitorV2.c.a.b(z, false);
    }

    public void customReportInner(com.bytedance.android.monitorV2.d.d dVar) {
        this.normalCustomMonitor.a(dVar);
    }

    public void init(Application application2) {
        init(application2, true);
    }

    public void clearDisableReportInfo(String str) {
        c a2 = c.a();
        if (!TextUtils.isEmpty(str)) {
            a2.f23838a.remove(str);
        }
    }

    public void setConfig(c cVar) {
        initHybridSetting(new com.bytedance.android.monitorV2.h.c(cVar));
    }

    public void wrapTouchTraceCallback(Activity activity) {
        a aVar;
        if (activity != null && this.isRegisterTouchCallback && (aVar = this.touchTraceCallback) != null) {
            aVar.a(activity);
        }
    }

    public void initHybridSetting(f fVar) {
        if (fVar != null) {
            this.hybridSettingManager = fVar;
            try {
                fVar.a(this.application);
            } catch (Throwable unused) {
                getInstance().getExceptionHandler();
            }
        }
    }

    public void registerReportInterceptor(h hVar) {
        if (hVar != null) {
            if (this.interceptorList == null) {
                this.interceptorList = new CopyOnWriteArrayList();
            }
            this.interceptorList.add(hVar);
        }
    }

    public void setCustomReportMonitor(com.bytedance.android.monitorV2.webview.b bVar) {
        this.normalCustomMonitor.f23821a = bVar;
        com.bytedance.android.monitorV2.i.b.b("CustomMonitor", "use new Monitor: ".concat(String.valueOf(bVar)));
    }

    public void unregisterReportInterceptor(h hVar) {
        List<h> list;
        if (hVar != null && (list = this.interceptorList) != null && list.size() != 0) {
            this.interceptorList.remove(hVar);
        }
    }

    public void customReport(com.bytedance.android.monitorV2.d.d dVar) {
        a.C0514a a2;
        if (dVar != null && (a2 = getInstance().getHybridSettingManager().b().a(dVar.f23848b)) != null) {
            if (dVar.f23853g.length() == 0) {
                JSONObject jSONObject = new JSONObject();
                com.bytedance.android.monitorV2.l.f.a(jSONObject, "bid", dVar.f23848b);
                com.bytedance.android.monitorV2.l.f.a(jSONObject, "setting_bid", a2.f23925a);
                com.bytedance.android.monitorV2.l.f.a(jSONObject, "hit_sample", a2.f23926b);
                com.bytedance.android.monitorV2.l.f.a(jSONObject, "setting_id", a2.f23927c);
                com.bytedance.android.monitorV2.l.f.a(jSONObject, "can_sample", dVar.n);
                dVar.f23853g = jSONObject;
            }
            this.normalCustomMonitor.a(dVar);
        }
    }

    public static void setDebuggable(boolean z, boolean z2) {
        com.bytedance.android.monitorV2.c.a.a(z, z2);
    }

    public static void setOutputFile(boolean z, boolean z2) {
        com.bytedance.android.monitorV2.c.a.b(z, z2);
    }

    public void init(Application application2, boolean z) {
        if (application2 != null && !this.isInitialized) {
            this.isInitialized = true;
            this.application = application2;
            if (z) {
                registerTouchCallback();
            }
            com.bytedance.android.monitorV2.i.b.b("HybridMultiMonitor", "init sdkinfo: 1.2.0-alpha.4, 1020024, false");
            com.bytedance.android.monitorV2.i.b.b("HybridMultiMonitor", "init hostinfo: " + com.bytedance.android.monitorV2.l.h.a() + ", " + com.bytedance.android.monitorV2.l.h.b());
            initComponent();
            initFileRecord();
            initDebugEnvir();
        }
    }

    public void registerDisableReportInfo(String str, List<String> list) {
        MethodCollector.i(13033);
        c a2 = c.a();
        if (TextUtils.isEmpty(str)) {
            MethodCollector.o(13033);
        } else if (list == null || list.size() == 0) {
            MethodCollector.o(13033);
        } else {
            Set<String> set = a2.f23838a.get(str);
            if (set == null) {
                set = Collections.synchronizedSet(new HashSet());
                a2.f23838a.put(str, set);
            }
            synchronized (a2) {
                try {
                    set.addAll(list);
                } finally {
                    MethodCollector.o(13033);
                }
            }
        }
    }

    public void notifyReportInterceptor(String str, String str2, String str3, JSONObject jSONObject) {
        List<h> list = this.interceptorList;
        if (list != null && list.size() > 0) {
            for (h hVar : this.interceptorList) {
                if (hVar != null) {
                    hVar.a(str, str2, jSONObject);
                }
            }
        }
    }

    public void customReport(String str, String str2, String str3, JSONObject jSONObject, JSONObject jSONObject2, JSONObject jSONObject3, JSONObject jSONObject4, int i2) {
        a aVar = this.normalCustomMonitor;
        aVar.a(str, str2, str3, jSONObject, jSONObject2, jSONObject3, jSONObject4, i2, aVar.f23821a);
    }

    public void customReport(String str, String str2, String str3, JSONObject jSONObject, JSONObject jSONObject2, JSONObject jSONObject3, JSONObject jSONObject4, int i2, com.bytedance.android.monitorV2.webview.b bVar) {
        this.normalCustomMonitor.a(str, str2, str3, jSONObject, jSONObject2, jSONObject3, jSONObject4, i2, bVar);
    }
}
