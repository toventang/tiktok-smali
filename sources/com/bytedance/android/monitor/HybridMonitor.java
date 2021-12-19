package com.bytedance.android.monitor;

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
import com.bytedance.android.monitor.b.d;
import com.bytedance.android.monitor.b.h;
import com.bytedance.android.monitor.l.c;
import com.bytedance.android.monitor.l.g;
import com.bytedance.android.monitor.l.i;
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

public class HybridMonitor {
    private static volatile HybridMonitor instance;
    public boolean AB_TEST = false;
    private Application application;
    private d exceptionHandler;
    private List<h> interceptorList;
    private boolean isInitialized;
    private boolean isRegisterTouchCallback;
    private a normalCustomMonitor = new a();
    private com.bytedance.android.monitor.j.b settingManager;
    private a touchTraceCallback;

    static {
        Covode.recordClassIndex(13919);
    }

    public static boolean isDebuggable() {
        return com.bytedance.android.monitor.c.a.f23426a;
    }

    public static boolean isOutputFile() {
        return com.bytedance.android.monitor.c.a.f23427b;
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
        private Window.Callback f23414a;

        static {
            Covode.recordClassIndex(13925);
        }

        public final void onAttachedToWindow() {
            this.f23414a.onAttachedToWindow();
        }

        public final void onContentChanged() {
            this.f23414a.onContentChanged();
        }

        public final void onDetachedFromWindow() {
            this.f23414a.onDetachedFromWindow();
        }

        public final boolean onSearchRequested() {
            return this.f23414a.onSearchRequested();
        }

        private b(Window.Callback callback) {
            this.f23414a = callback;
        }

        public final boolean dispatchGenericMotionEvent(MotionEvent motionEvent) {
            return this.f23414a.dispatchGenericMotionEvent(motionEvent);
        }

        public final boolean dispatchKeyEvent(KeyEvent keyEvent) {
            return this.f23414a.dispatchKeyEvent(keyEvent);
        }

        public final boolean dispatchKeyShortcutEvent(KeyEvent keyEvent) {
            return this.f23414a.dispatchKeyShortcutEvent(keyEvent);
        }

        public final boolean dispatchPopulateAccessibilityEvent(AccessibilityEvent accessibilityEvent) {
            return this.f23414a.dispatchPopulateAccessibilityEvent(accessibilityEvent);
        }

        public final boolean dispatchTrackballEvent(MotionEvent motionEvent) {
            return this.f23414a.dispatchTrackballEvent(motionEvent);
        }

        public final void onActionModeFinished(ActionMode actionMode) {
            this.f23414a.onActionModeFinished(actionMode);
        }

        public final void onActionModeStarted(ActionMode actionMode) {
            this.f23414a.onActionModeStarted(actionMode);
        }

        public final View onCreatePanelView(int i2) {
            return this.f23414a.onCreatePanelView(i2);
        }

        public final void onWindowAttributesChanged(WindowManager.LayoutParams layoutParams) {
            this.f23414a.onWindowAttributesChanged(layoutParams);
        }

        public final void onWindowFocusChanged(boolean z) {
            this.f23414a.onWindowFocusChanged(z);
        }

        public final ActionMode onWindowStartingActionMode(ActionMode.Callback callback) {
            return this.f23414a.onWindowStartingActionMode(callback);
        }

        public final boolean onSearchRequested(SearchEvent searchEvent) {
            return this.f23414a.onSearchRequested(searchEvent);
        }

        public final boolean dispatchTouchEvent(MotionEvent motionEvent) {
            if (motionEvent != null && motionEvent.getAction() == 0) {
                i.f23542a = System.currentTimeMillis();
            }
            return this.f23414a.dispatchTouchEvent(motionEvent);
        }

        /* synthetic */ b(Window.Callback callback, byte b2) {
            this(callback);
        }

        public final boolean onCreatePanelMenu(int i2, Menu menu) {
            return this.f23414a.onCreatePanelMenu(i2, menu);
        }

        public final boolean onMenuItemSelected(int i2, MenuItem menuItem) {
            return this.f23414a.onMenuItemSelected(i2, menuItem);
        }

        public final boolean onMenuOpened(int i2, Menu menu) {
            return this.f23414a.onMenuOpened(i2, menu);
        }

        public final void onPanelClosed(int i2, Menu menu) {
            this.f23414a.onPanelClosed(i2, menu);
        }

        public final ActionMode onWindowStartingActionMode(ActionMode.Callback callback, int i2) {
            return this.f23414a.onWindowStartingActionMode(callback, i2);
        }

        public final boolean onPreparePanel(int i2, View view, Menu menu) {
            return this.f23414a.onPreparePanel(i2, view, menu);
        }
    }

    private void initComponent() {
        injectWebOffline();
        injectFalconX();
    }

    public void clearSetting() {
        if (this.settingManager != null) {
            this.settingManager = null;
        }
    }

    public com.bytedance.android.monitor.webview.a getCustomReportMonitor() {
        return this.normalCustomMonitor.f23415a;
    }

    /* access modifiers changed from: package-private */
    public static class a implements Application.ActivityLifecycleCallbacks {

        /* renamed from: a  reason: collision with root package name */
        private Set<Integer> f23413a;

        static {
            Covode.recordClassIndex(13924);
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
            this.f23413a = new HashSet();
        }

        /* synthetic */ a(byte b2) {
            this();
        }

        public void onActivityStarted(Activity activity) {
            a(activity);
        }

        public void onActivityDestroyed(Activity activity) {
            this.f23413a.remove(Integer.valueOf(activity.hashCode()));
        }

        private boolean b(Activity activity) {
            if (activity != null && !this.f23413a.contains(Integer.valueOf(activity.hashCode()))) {
                return true;
            }
            return false;
        }

        public final void a(Activity activity) {
            try {
                if (b(activity)) {
                    this.f23413a.add(Integer.valueOf(activity.hashCode()));
                    Window window = activity.getWindow();
                    window.setCallback(new b(window.getCallback(), (byte) 0));
                }
            } catch (Exception unused) {
                HybridMonitor.getInstance().getExceptionHandler();
            }
        }

        public void onActivityCreated(Activity activity, Bundle bundle) {
            a(activity);
        }
    }

    private void initDebugEnvir() {
        com.bytedance.android.monitor.f.a.a(new Runnable() {
            /* class com.bytedance.android.monitor.HybridMonitor.AnonymousClass2 */

            static {
                Covode.recordClassIndex(13921);
            }

            public final void run() {
                Application application = HybridMonitor.this.getApplication();
                if (application != null) {
                    try {
                        File a2 = c.a(application, "monitor_data_switch");
                        File file = new File(a2, "is_debug");
                        if (file.isFile() && file.exists()) {
                            com.bytedance.android.monitor.c.a.a(true, false);
                        }
                        File file2 = new File(a2, "is_output_file");
                        if (file2.isFile() && file2.exists()) {
                            com.bytedance.android.monitor.c.a.b(true, false);
                        }
                    } catch (Throwable unused) {
                        HybridMonitor.getInstance().getExceptionHandler();
                    }
                }
            }
        });
    }

    private void initFileRecord() {
        registerReportInterceptor(new h() {
            /* class com.bytedance.android.monitor.HybridMonitor.AnonymousClass1 */

            static {
                Covode.recordClassIndex(13920);
            }

            @Override // com.bytedance.android.monitor.b.h
            public final void a(String str, String str2, JSONObject jSONObject) {
                boolean z;
                com.bytedance.android.monitor.h.b.b("HybridMonitor", "fileRecord, outputFile: " + HybridMonitor.isOutputFile() + ", service: " + str + ", eventType: " + str2);
                if (HybridMonitor.isOutputFile()) {
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
                            HybridMonitor instance = HybridMonitor.getInstance();
                            l.a((Object) instance, "");
                            File a2 = c.a(instance.getApplication(), "monitor_data_debug");
                            if (a2 != null && a2.exists()) {
                                c.a(new File(a2, "custom_with_".concat(String.valueOf(Uri.parse(optString).getQueryParameter("bytest_case_id")))).getAbsolutePath(), p.b("\n     " + jSONObject + "\n     \n     "));
                            }
                        } catch (Exception e2) {
                            e2.printStackTrace();
                        }
                    } else {
                        try {
                            JSONObject jSONObject2 = jSONObject.getJSONObject("extra").getJSONObject("nativeBase");
                            String string = jSONObject2.getString("navigation_id");
                            String optString2 = jSONObject2.optString("url", "");
                            HybridMonitor instance2 = HybridMonitor.getInstance();
                            l.a((Object) instance2, "");
                            File a3 = c.a(instance2.getApplication(), "monitor_data_debug");
                            if (a3 != null && a3.exists()) {
                                c.a(new File(a3, string + "_with_" + Uri.parse(optString2).getQueryParameter("bytest_case_id")).getAbsolutePath(), p.b("\n     " + jSONObject + "\n     \n     "));
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
        com.bytedance.android.monitor.f.a.a().execute(new Runnable() {
            /* class com.bytedance.android.monitor.HybridMonitor.AnonymousClass4 */

            static {
                Covode.recordClassIndex(13923);
            }

            public final void run() {
                try {
                    Class<?> cls = Class.forName("com.bytedance.webx.monitor.falconx.FalconXMonitor");
                    com.bytedance.android.monitor.l.h.a(cls, "beginMonitor", com.bytedance.android.monitor.l.h.a(cls, "getInstance", new Object[0]));
                } catch (Exception unused) {
                    HybridMonitor.getInstance().getExceptionHandler();
                }
            }
        });
    }

    private void injectWebOffline() {
        com.bytedance.android.monitor.f.a.a().execute(new Runnable() {
            /* class com.bytedance.android.monitor.HybridMonitor.AnonymousClass3 */

            static {
                Covode.recordClassIndex(13922);
            }

            public final void run() {
                try {
                    Class<?> cls = Class.forName("com.bytedance.webx.monitor.weboffline.WebOfflineMonitor");
                    com.bytedance.android.monitor.l.h.a(cls, "beginMonitor", com.bytedance.android.monitor.l.h.a(cls, "getInstance", new Object[0]));
                } catch (Exception unused) {
                    HybridMonitor.getInstance().getExceptionHandler();
                }
            }
        });
    }

    public void DisableReportInfo() {
        c.a().f23425a.clear();
    }

    public com.bytedance.android.monitor.j.b getSettingManager() {
        com.bytedance.android.monitor.j.b bVar = this.settingManager;
        if (bVar != null) {
            return bVar;
        }
        return com.bytedance.android.monitor.j.a.a();
    }

    public void registerTouchCallback() {
        if (this.application != null && !this.isRegisterTouchCallback) {
            a aVar = new a((byte) 0);
            this.touchTraceCallback = aVar;
            this.application.registerActivityLifecycleCallbacks(aVar);
            this.isRegisterTouchCallback = true;
        }
    }

    public static HybridMonitor getInstance() {
        MethodCollector.i(3490);
        if (instance == null) {
            synchronized (HybridMonitor.class) {
                try {
                    if (instance == null) {
                        instance = new HybridMonitor();
                    }
                } catch (Throwable th) {
                    MethodCollector.o(3490);
                    throw th;
                }
            }
        }
        HybridMonitor hybridMonitor = instance;
        MethodCollector.o(3490);
        return hybridMonitor;
    }

    public void setAbTestEnable(boolean z) {
        this.AB_TEST = z;
    }

    public void setExceptionHandler(d dVar) {
        this.exceptionHandler = dVar;
    }

    public static void setDebuggable(boolean z) {
        com.bytedance.android.monitor.c.a.a(z, false);
    }

    public static void setOutputFile(boolean z) {
        com.bytedance.android.monitor.c.a.b(z, false);
    }

    public void customReport(com.bytedance.android.monitor.d.c cVar) {
        this.normalCustomMonitor.a(cVar);
    }

    public void init(Application application2) {
        init(application2, true);
    }

    public void initSetting(com.bytedance.android.monitor.j.b bVar) {
        if (bVar != null) {
            this.settingManager = bVar;
        }
    }

    public void clearDisableReportInfo(String str) {
        c a2 = c.a();
        if (!TextUtils.isEmpty(str)) {
            a2.f23425a.remove(str);
        }
    }

    public void wrapTouchTraceCallback(Activity activity) {
        a aVar;
        if (activity != null && this.isRegisterTouchCallback && (aVar = this.touchTraceCallback) != null) {
            aVar.a(activity);
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

    public void setCustomReportMonitor(com.bytedance.android.monitor.webview.a aVar) {
        this.normalCustomMonitor.f23415a = aVar;
        com.bytedance.android.monitor.h.b.b("CustomMonitor", "use new Monitor: ".concat(String.valueOf(aVar)));
    }

    public void unregisterReportInterceptor(h hVar) {
        List<h> list;
        if (hVar != null && (list = this.interceptorList) != null && list.size() != 0) {
            this.interceptorList.remove(hVar);
        }
    }

    public static void setDebuggable(boolean z, boolean z2) {
        com.bytedance.android.monitor.c.a.a(z, z2);
    }

    public static void setOutputFile(boolean z, boolean z2) {
        com.bytedance.android.monitor.c.a.b(z, z2);
    }

    public void init(Application application2, boolean z) {
        if (application2 != null && !this.isInitialized) {
            this.isInitialized = true;
            this.application = application2;
            if (z) {
                registerTouchCallback();
            }
            com.bytedance.android.monitor.h.b.b("HybridMonitor", "init sdkinfo: 1.2.5, 1020590, false");
            com.bytedance.android.monitor.h.b.b("HybridMonitor", "init hostinfo: " + g.a(application2) + ", " + g.b(application2));
            initComponent();
            initFileRecord();
            initDebugEnvir();
        }
    }

    public void registerDisableReportInfo(String str, List<String> list) {
        MethodCollector.i(3802);
        c a2 = c.a();
        if (TextUtils.isEmpty(str)) {
            MethodCollector.o(3802);
        } else if (list == null || list.size() == 0) {
            MethodCollector.o(3802);
        } else {
            Set<String> set = a2.f23425a.get(str);
            if (set == null) {
                set = Collections.synchronizedSet(new HashSet());
                a2.f23425a.put(str, set);
            }
            synchronized (a2) {
                try {
                    set.addAll(list);
                } finally {
                    MethodCollector.o(3802);
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

    public void customReport(String str, String str2, String str3, JSONObject jSONObject, JSONObject jSONObject2, JSONObject jSONObject3, JSONObject jSONObject4, boolean z) {
        a aVar = this.normalCustomMonitor;
        aVar.a(str, str2, str3, jSONObject, jSONObject2, jSONObject3, jSONObject4, z, aVar.f23415a);
    }

    public void customReport(String str, String str2, String str3, JSONObject jSONObject, JSONObject jSONObject2, JSONObject jSONObject3, JSONObject jSONObject4, boolean z, com.bytedance.android.monitor.webview.a aVar) {
        this.normalCustomMonitor.a(str, str2, str3, jSONObject, jSONObject2, jSONObject3, jSONObject4, z, aVar);
    }
}
