package com.lynx.jsbridge;

import android.app.Activity;
import com.bytedance.covode.number.Covode;
import com.lynx.react.bridge.Callback;
import com.lynx.tasm.LynxEnv;
import com.lynx.tasm.base.LLog;
import com.lynx.tasm.behavior.g;
import com.lynx.tasm.behavior.h;
import com.lynx.tasm.behavior.j;
import com.lynx.tasm.o;
import java.lang.reflect.Field;
import java.lang.reflect.InvocationTargetException;

public class LynxSetModule extends LynxContextModule {
    static {
        Covode.recordClassIndex(34745);
    }

    @d
    public boolean getEnableRadonCompatible() {
        return LynxEnv.b().f55539i;
    }

    @d
    public boolean isDebugModeEnabled() {
        return LynxEnv.b().f55538h;
    }

    @d
    public boolean getDevtoolDebug() {
        return LynxEnv.b().d();
    }

    @d
    public boolean getDevtoolNextSupport() {
        return LynxEnv.b().b("enable_devtool_next", true);
    }

    @d
    public boolean getRedBoxSupport() {
        return LynxEnv.b().e();
    }

    @d
    public boolean isDevtoolBadgeEnabled() {
        return LynxEnv.b().b("show_devtool_badge", false);
    }

    @d
    public boolean isDomTreeEnabled() {
        return LynxEnv.b().b("enable_dom_tree", true);
    }

    @d
    public boolean isLongPressMenuEnabled() {
        return LynxEnv.b().b("enable_long_press_menu", true);
    }

    @d
    public boolean isQuickjsCacheEnabled() {
        return LynxEnv.b().b("enable_quickjs_cache", true);
    }

    @d
    public boolean isV8Enabled() {
        return LynxEnv.b().b("enable_v8", true);
    }

    @d
    public boolean getLogToSystemStatus() {
        try {
            Class<?> cls = Class.forName("com.ss.android.agilelogger.ALog");
            Field declaredField = cls.getDeclaredField("sDebug");
            declaredField.setAccessible(true);
            return declaredField.getBoolean(cls);
        } catch (ClassNotFoundException e2) {
            e2.printStackTrace();
            return false;
        } catch (IllegalAccessException e3) {
            e3.printStackTrace();
            return false;
        } catch (NoSuchFieldException e4) {
            e4.printStackTrace();
            return false;
        }
    }

    public LynxSetModule(j jVar) {
        super(jVar);
    }

    @d
    public void enableDomTree(Boolean bool) {
        LynxEnv.b().a("enable_dom_tree", bool.booleanValue());
    }

    @d
    public void switchDevtoolBadge(Boolean bool) {
        LynxEnv.b().a("show_devtool_badge", bool.booleanValue());
    }

    @d
    public void switchDevtoolDebug(Boolean bool) {
        LynxEnv.b().b(bool.booleanValue());
    }

    @d
    public void switchDevtoolNextSupport(Boolean bool) {
        LynxEnv.b().a("enable_devtool_next", bool.booleanValue());
    }

    @d
    public void switchLongPressMenu(Boolean bool) {
        LynxEnv.b().a("enable_long_press_menu", bool.booleanValue());
    }

    @d
    public void switchQuickjsCache(Boolean bool) {
        LynxEnv.b().a("enable_quickjs_cache", bool.booleanValue());
    }

    @d
    public void switchRedBoxSupport(Boolean bool) {
        LynxEnv.b().c(bool.booleanValue());
    }

    @d
    public void switchV8(Boolean bool) {
        LynxEnv.b().a("enable_v8", bool.booleanValue());
    }

    @d
    public void switchEnableRadonCompatible(Boolean bool) {
        String str;
        LynxEnv b2 = LynxEnv.b();
        boolean booleanValue = bool.booleanValue();
        if (booleanValue) {
            str = "Turn on RadonCompatible";
        } else {
            str = "Turn off RadonCompatible";
        }
        LLog.a(4, "LynxEnv", str);
        b2.f55539i = booleanValue;
    }

    @d
    public void switchDebugModeEnable(Boolean bool) {
        String str;
        LynxEnv b2 = LynxEnv.b();
        boolean booleanValue = bool.booleanValue();
        if (booleanValue) {
            str = "Turn on DebugMode";
        } else {
            str = "Turn off DebugMode";
        }
        LLog.a(4, "LynxEnv", str);
        b2.f55538h = booleanValue;
        if (b2.u == null) {
            LLog.a(6, "LynxEnv", "enableDebugMode() must be called after init()");
        } else {
            b2.u.edit().putBoolean("enable_debug_mode", booleanValue).apply();
        }
    }

    @d
    public void switchLogToSystem(boolean z) {
        try {
            Class.forName("com.ss.android.agilelogger.ALog").getMethod("setDebug", Boolean.TYPE).invoke(null, Boolean.valueOf(z));
        } catch (ClassNotFoundException e2) {
            e2.printStackTrace();
        } catch (IllegalAccessException e3) {
            e3.printStackTrace();
        } catch (NoSuchMethodException e4) {
            e4.printStackTrace();
        } catch (InvocationTargetException e5) {
            e5.printStackTrace();
        }
    }

    @d
    public void switchKeyBoardDetect(boolean z) {
        if (z) {
            h a2 = h.a();
            j jVar = this.mLynxContext;
            if (!(jVar.a() instanceof Activity)) {
                LLog.a(6, "Lynx", "context is not a Activity, KeyBoardEventDispatcher is not functional.");
            } else if (a2.f55889a.containsKey(jVar)) {
                a2.f55889a.get(jVar).a();
            } else {
                g gVar = new g(jVar);
                gVar.a();
                a2.f55889a.put(jVar, gVar);
                jVar.b().addLynxViewClient(new o(jVar) {
                    /* class com.lynx.tasm.behavior.h.AnonymousClass1 */

                    /* renamed from: a  reason: collision with root package name */
                    final /* synthetic */ j f55890a;

                    static {
                        Covode.recordClassIndex(34942);
                    }

                    @Override // com.lynx.tasm.o
                    public final void e() {
                        h.this.a(this.f55890a);
                        super.e();
                    }

                    {
                        this.f55890a = r2;
                    }
                });
            }
        } else {
            h.a().a(this.mLynxContext);
        }
    }

    @d
    public void invokeCdp(String str, String str2, Callback callback) {
        j jVar = this.mLynxContext;
        if (jVar.n.get() != null) {
            jVar.n.get().getBaseInspectorOwner();
        }
    }
}
