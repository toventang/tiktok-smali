package com.lynx.tasm;

import android.content.ClipboardManager;
import android.content.Context;
import android.os.Build;
import android.os.Handler;
import android.os.Looper;
import android.util.AttributeSet;
import android.view.MotionEvent;
import android.view.View;
import com.bytedance.covode.number.Covode;
import com.bytedance.frameworks.apm.trace.MethodCollector;
import com.lynx.devtoolwrapper.a;
import com.lynx.devtoolwrapper.d;
import com.lynx.react.bridge.JavaOnlyArray;
import com.lynx.tasm.base.LLog;
import com.lynx.tasm.behavior.b.b;
import com.lynx.tasm.behavior.f;
import com.lynx.tasm.behavior.j;
import com.lynx.tasm.behavior.ui.LynxBaseUI;
import com.lynx.tasm.behavior.ui.UIBody;
import com.lynx.tasm.behavior.ui.UIGroup;
import com.lynx.tasm.core.VSyncMonitor;
import com.lynx.tasm.h;
import com.lynx.tasm.utils.DisplayMetricsHolder;
import com.lynx.tasm.utils.m;
import com.ss.android.ugc.aweme.lancet.i;
import h.p;
import java.lang.ref.WeakReference;
import java.lang.reflect.Field;
import java.util.List;
import java.util.Map;

public class LynxView extends UIBody.a {
    private boolean mAttached;
    private boolean mCanDispatchTouchEvent;
    protected boolean mDispatchTouchEventToDev = true;
    private boolean mIsDevtoolConfigView;
    public LynxTemplateRender mLynxTemplateRender;

    static {
        Covode.recordClassIndex(34799);
    }

    public static int com_lynx_tasm_LynxView_com_ss_android_ugc_aweme_lancet_LogLancet_e(String str, String str2) {
        return 0;
    }

    public LynxPerfMetric forceGetPerf() {
        return null;
    }

    public Object getTag() {
        return "lynxview";
    }

    public void renderTemplateUrl(String str, String str2) {
        com_lynx_tasm_LynxView_com_ss_android_ugc_tiktok_security_lancet_lynx_LynxSecLancet_renderTemplateUrl(this, str, str2);
    }

    public void renderTemplateUrl(String str, Map map) {
        com_lynx_tasm_LynxView_com_ss_android_ugc_tiktok_security_lancet_lynx_LynxSecLancet_renderTemplateUrl(this, str, map);
    }

    public void renderTemplateWithBaseUrl(byte[] bArr, TemplateData templateData, String str) {
        com_lynx_tasm_LynxView_com_ss_android_ugc_tiktok_security_lancet_lynx_LynxSecLancet_renderTemplateWithBaseUrl(this, bArr, templateData, str);
    }

    public void renderTemplateWithBaseUrl(byte[] bArr, String str, String str2) {
        com_lynx_tasm_LynxView_com_ss_android_ugc_tiktok_security_lancet_lynx_LynxSecLancet_renderTemplateWithBaseUrl(this, bArr, str, str2);
    }

    public void renderTemplateWithBaseUrl(byte[] bArr, Map map, String str) {
        com_lynx_tasm_LynxView_com_ss_android_ugc_tiktok_security_lancet_lynx_LynxSecLancet_renderTemplateWithBaseUrl(this, bArr, map, str);
    }

    public void setIsLynxDevtoolConfigView() {
        this.mIsDevtoolConfigView = true;
    }

    public boolean isLynxDevtoolConfigView() {
        return this.mIsDevtoolConfigView;
    }

    public static n builder() {
        return new n();
    }

    public void syncFlush() {
        LynxTemplateRender lynxTemplateRender = this.mLynxTemplateRender;
        if (lynxTemplateRender != null) {
            lynxTemplateRender.syncFlush();
        }
    }

    public a getBaseInspectorOwner() {
        d devTool;
        LynxTemplateRender lynxTemplateRender = this.mLynxTemplateRender;
        if (lynxTemplateRender == null || (devTool = lynxTemplateRender.getDevTool()) == null) {
            return null;
        }
        return devTool.f55440a;
    }

    public long getFirstMeasureTime() {
        LynxTemplateRender lynxTemplateRender = this.mLynxTemplateRender;
        if (lynxTemplateRender == null) {
            return -1;
        }
        return lynxTemplateRender.getFirstMeasureTime();
    }

    public j getLynxContext() {
        LynxTemplateRender lynxTemplateRender = this.mLynxTemplateRender;
        if (lynxTemplateRender != null) {
            return lynxTemplateRender.getLynxContext();
        }
        return null;
    }

    public UIGroup<UIBody.a> getLynxUIRoot() {
        LynxTemplateRender lynxTemplateRender = this.mLynxTemplateRender;
        if (lynxTemplateRender == null) {
            return null;
        }
        return lynxTemplateRender.getLynxRootUI();
    }

    public String getPageVersion() {
        LynxTemplateRender lynxTemplateRender = this.mLynxTemplateRender;
        if (lynxTemplateRender == null) {
            return "";
        }
        return lynxTemplateRender.getPageVersion();
    }

    public String getTemplateUrl() {
        LynxTemplateRender lynxTemplateRender = this.mLynxTemplateRender;
        if (lynxTemplateRender == null) {
            return null;
        }
        return lynxTemplateRender.getTemplateUrl();
    }

    public com.lynx.tasm.g.a getTheme() {
        LynxTemplateRender lynxTemplateRender = this.mLynxTemplateRender;
        if (lynxTemplateRender == null) {
            return null;
        }
        return lynxTemplateRender.getTheme();
    }

    public r getThreadStrategyForRendering() {
        LynxTemplateRender lynxTemplateRender = this.mLynxTemplateRender;
        if (lynxTemplateRender == null) {
            return null;
        }
        return lynxTemplateRender.getThreadStrategyForRendering();
    }

    public void pauseRootLayoutAnimation() {
        LynxTemplateRender lynxTemplateRender = this.mLynxTemplateRender;
        if (lynxTemplateRender != null) {
            lynxTemplateRender.pauseRootLayoutAnimation();
        }
    }

    public void resumeRootLayoutAnimation() {
        LynxTemplateRender lynxTemplateRender = this.mLynxTemplateRender;
        if (lynxTemplateRender != null) {
            lynxTemplateRender.resumeRootLayoutAnimation();
        }
    }

    public h getLynxConfigInfo() {
        LynxTemplateRender lynxTemplateRender = this.mLynxTemplateRender;
        if (lynxTemplateRender == null) {
            return new h.a().a();
        }
        return lynxTemplateRender.getLynxConfigInfo();
    }

    public void destroy() {
        LLog.a(4, "LynxView", "lynxview destroy " + toString());
        LynxTemplateRender lynxTemplateRender = this.mLynxTemplateRender;
        if (lynxTemplateRender != null) {
            lynxTemplateRender.destroy();
            this.mLynxTemplateRender = null;
            b bVar = b.a.f55815a;
            b.a(bVar.f55806e, this);
            b.a(bVar.f55803b, this);
            b.a(bVar.f55802a, this);
            b.a(bVar.f55805d, this);
            b.a(bVar.f55804c, this);
        }
    }

    /* access modifiers changed from: protected */
    public void onAttachedToWindow() {
        super.onAttachedToWindow();
        LLog.a(4, "Lynx", "onAttachedToWindow:" + hashCode());
        this.mAttached = true;
        LynxTemplateRender lynxTemplateRender = this.mLynxTemplateRender;
        if (lynxTemplateRender != null) {
            lynxTemplateRender.onAttachedToWindow();
        }
    }

    /* access modifiers changed from: protected */
    public void onDetachedFromWindow() {
        LLog.a(4, "Lynx", "onDetachedFromWindow:" + hashCode());
        this.mAttached = false;
        LynxTemplateRender lynxTemplateRender = this.mLynxTemplateRender;
        if (lynxTemplateRender != null) {
            lynxTemplateRender.onDetachedFromWindow();
        }
        super.onDetachedFromWindow();
    }

    public void onEnterBackground() {
        LLog.a(4, "LynxView", "onEnterBackground" + toString());
        LynxTemplateRender lynxTemplateRender = this.mLynxTemplateRender;
        if (lynxTemplateRender != null) {
            lynxTemplateRender.onEnterBackground();
        }
    }

    public void onEnterForeground() {
        LLog.a(4, "LynxView", "onEnterForeground " + toString());
        LynxTemplateRender lynxTemplateRender = this.mLynxTemplateRender;
        if (lynxTemplateRender != null) {
            lynxTemplateRender.onEnterForeground();
        }
    }

    public LynxView(Context context) {
        super(context);
    }

    public void addStateListener(e eVar) {
        LynxTemplateRender lynxTemplateRender = this.mLynxTemplateRender;
        if (lynxTemplateRender != null) {
            lynxTemplateRender.addLStateListener(eVar);
        }
    }

    public void removeStateListener(e eVar) {
        LynxTemplateRender lynxTemplateRender = this.mLynxTemplateRender;
        if (lynxTemplateRender != null) {
            lynxTemplateRender.removeStateListener(eVar);
        }
    }

    public void updateData(String str) {
        updateData(str, (String) null);
    }

    public static n builder(Context context) {
        return new n();
    }

    public void addLynxViewClient(o oVar) {
        LynxTemplateRender lynxTemplateRender = this.mLynxTemplateRender;
        if (lynxTemplateRender != null) {
            lynxTemplateRender.addLynxViewClient(oVar);
        }
    }

    public LynxBaseUI findUIByIdSelector(String str) {
        LynxTemplateRender lynxTemplateRender = this.mLynxTemplateRender;
        if (lynxTemplateRender == null) {
            return null;
        }
        return lynxTemplateRender.findUIByIdSelector(str);
    }

    public LynxBaseUI findUIByIndex(int i2) {
        LynxTemplateRender lynxTemplateRender = this.mLynxTemplateRender;
        if (lynxTemplateRender != null) {
            return lynxTemplateRender.findUIByIndex(i2);
        }
        return null;
    }

    public LynxBaseUI findUIByName(String str) {
        LynxTemplateRender lynxTemplateRender = this.mLynxTemplateRender;
        if (lynxTemplateRender == null) {
            return null;
        }
        return lynxTemplateRender.findUIByName(str);
    }

    public View findViewByIdSelector(String str) {
        LynxTemplateRender lynxTemplateRender = this.mLynxTemplateRender;
        if (lynxTemplateRender == null) {
            return null;
        }
        return lynxTemplateRender.findViewByIdSelector(str);
    }

    public View findViewByName(String str) {
        LynxTemplateRender lynxTemplateRender = this.mLynxTemplateRender;
        if (lynxTemplateRender == null) {
            return null;
        }
        return lynxTemplateRender.findViewByName(str);
    }

    public void getCurrentData(k kVar) {
        LynxTemplateRender lynxTemplateRender = this.mLynxTemplateRender;
        if (lynxTemplateRender != null) {
            lynxTemplateRender.getCurrentData(kVar);
        }
    }

    public com.lynx.jsbridge.b getJSModule(String str) {
        LynxTemplateRender lynxTemplateRender = this.mLynxTemplateRender;
        if (lynxTemplateRender == null) {
            return null;
        }
        return lynxTemplateRender.getJSModule(str);
    }

    public void removeLynxViewClient(o oVar) {
        LynxTemplateRender lynxTemplateRender = this.mLynxTemplateRender;
        if (lynxTemplateRender != null) {
            lynxTemplateRender.removeLynxViewClient(oVar);
        }
    }

    public void runOnTasmThread(Runnable runnable) {
        LynxTemplateRender lynxTemplateRender = this.mLynxTemplateRender;
        if (lynxTemplateRender != null) {
            lynxTemplateRender.runOnTasmThread(runnable);
        }
    }

    public void setGlobalProps(TemplateData templateData) {
        LynxTemplateRender lynxTemplateRender = this.mLynxTemplateRender;
        if (lynxTemplateRender != null) {
            lynxTemplateRender.setGlobalProps(templateData);
        }
    }

    public void setImageInterceptor(f fVar) {
        LynxTemplateRender lynxTemplateRender = this.mLynxTemplateRender;
        if (lynxTemplateRender != null) {
            lynxTemplateRender.setImageInterceptor(fVar);
        }
    }

    public void setOnClickListener(View.OnClickListener onClickListener) {
        boolean z;
        if (onClickListener == null) {
            z = true;
        } else {
            z = false;
        }
        setFocusableInTouchMode(z);
        super.setOnClickListener(onClickListener);
    }

    public void setTheme(com.lynx.tasm.g.a aVar) {
        LynxTemplateRender lynxTemplateRender = this.mLynxTemplateRender;
        if (lynxTemplateRender != null) {
            lynxTemplateRender.setTheme(aVar);
        }
    }

    public void updateData(Map<String, Object> map) {
        updateData(map, (String) null);
    }

    public void updateFontScacle(float f2) {
        LynxTemplateRender lynxTemplateRender = this.mLynxTemplateRender;
        if (lynxTemplateRender != null) {
            lynxTemplateRender.updateFontScale(f2);
        }
    }

    public void setGlobalProps(Map<String, Object> map) {
        LynxTemplateRender lynxTemplateRender = this.mLynxTemplateRender;
        if (lynxTemplateRender != null) {
            lynxTemplateRender.setGlobalProps(map);
        }
    }

    public boolean onInterceptTouchEvent(MotionEvent motionEvent) {
        try {
            LynxTemplateRender lynxTemplateRender = this.mLynxTemplateRender;
            if (lynxTemplateRender != null && this.mCanDispatchTouchEvent) {
                lynxTemplateRender.onInterceptTouchEvent(motionEvent);
            }
            return super.onInterceptTouchEvent(motionEvent);
        } catch (Throwable th) {
            LynxTemplateRender lynxTemplateRender2 = this.mLynxTemplateRender;
            if (lynxTemplateRender2 == null) {
                return false;
            }
            lynxTemplateRender2.onErrorOccurred(1801, "An exception occurred during the execution of the onInterceptTouchEvent function，and the error message is " + th.getMessage());
            return false;
        }
    }

    public boolean onTouchEvent(MotionEvent motionEvent) {
        try {
            LynxTemplateRender lynxTemplateRender = this.mLynxTemplateRender;
            if (lynxTemplateRender != null && this.mCanDispatchTouchEvent) {
                lynxTemplateRender.onTouchEvent(motionEvent);
            }
            if (this.mLynxTemplateRender.blockNativeEvent() && getParent() != null) {
                return true;
            }
            super.onTouchEvent(motionEvent);
            return true;
        } catch (Throwable th) {
            LynxTemplateRender lynxTemplateRender2 = this.mLynxTemplateRender;
            if (lynxTemplateRender2 == null) {
                return false;
            }
            lynxTemplateRender2.onErrorOccurred(1801, "An exception occurred during the execution of the onTouchEvent function，and the error message is " + th.getMessage());
            return false;
        }
    }

    public void resetData(TemplateData templateData) {
        LLog.a(4, "LynxView", "resetData with json in " + templateData.toString());
        LynxTemplateRender lynxTemplateRender = this.mLynxTemplateRender;
        if (lynxTemplateRender != null) {
            lynxTemplateRender.resetData(templateData);
        }
    }

    public void setVisibility(int i2) {
        super.setVisibility(i2);
        LLog.a(4, "Lynx", "setVisibility:" + hashCode() + " " + i2);
    }

    public void updateData(TemplateData templateData) {
        LLog.a(4, "LynxView", "updateData with data in " + templateData.toString());
        LynxTemplateRender lynxTemplateRender = this.mLynxTemplateRender;
        if (lynxTemplateRender != null) {
            lynxTemplateRender.updateData(templateData);
        }
    }

    public void attachTemplateRender(final LynxTemplateRender lynxTemplateRender) {
        if (lynxTemplateRender == null) {
            LLog.a(5, "Lynx", "render is null! in " + toString());
        } else if (!m.a()) {
            m.a(new Runnable() {
                /* class com.lynx.tasm.LynxView.AnonymousClass1 */

                static {
                    Covode.recordClassIndex(34800);
                }

                public final void run() {
                    LynxView.this.attachTemplateRender(lynxTemplateRender);
                }
            });
        } else if (this.mLynxTemplateRender != null) {
            LLog.a(5, "Lynx", "already attached" + toString());
        } else if (lynxTemplateRender.attach(this)) {
            if (this.mAttached) {
                lynxTemplateRender.onAttachedToWindow();
            }
            this.mLynxTemplateRender = lynxTemplateRender;
        }
    }

    public boolean dispatchTouchEvent(MotionEvent motionEvent) {
        boolean z;
        try {
            if (this.mLynxTemplateRender == null) {
                return super.dispatchTouchEvent(motionEvent);
            }
            int action = motionEvent.getAction();
            if (action == 0) {
                this.mCanDispatchTouchEvent = true;
            }
            if (this.mCanDispatchTouchEvent) {
                z = this.mLynxTemplateRender.dispatchTouchEvent(motionEvent);
                if (this.mLynxTemplateRender.blockNativeEvent() && getParent() != null) {
                    getParent().requestDisallowInterceptTouchEvent(true);
                }
            } else {
                z = false;
            }
            if (action == 1 || action == 3) {
                this.mCanDispatchTouchEvent = false;
            }
            if (!this.mLynxTemplateRender.enableEventThrough() || z) {
                if (this.mDispatchTouchEventToDev) {
                    this.mLynxTemplateRender.onDispatchTouchEvent(motionEvent);
                }
                return super.dispatchTouchEvent(motionEvent);
            }
            return false;
        } catch (Throwable th) {
            LynxTemplateRender lynxTemplateRender = this.mLynxTemplateRender;
            if (lynxTemplateRender != null) {
                lynxTemplateRender.onErrorOccurred(1801, "An exception occurred during the execution of the dispatchTouchEvent function，and the error message is " + th.getMessage());
            }
        }
    }

    /* access modifiers changed from: package-private */
    public void innerSetMeasuredDimension(int i2, int i3) {
        setMeasuredDimension(i2, i3);
    }

    public void hotModuleReplace(String str, String str2) {
        LynxTemplateRender lynxTemplateRender = this.mLynxTemplateRender;
        if (lynxTemplateRender != null) {
            lynxTemplateRender.hotModuleReplace(str, str2);
        }
    }

    public LynxView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
    }

    public void sendGlobalEvent(String str, JavaOnlyArray javaOnlyArray) {
        LynxTemplateRender lynxTemplateRender = this.mLynxTemplateRender;
        if (lynxTemplateRender != null) {
            lynxTemplateRender.sendGlobalEvent(str, javaOnlyArray);
        }
    }

    public void sendGlobalEventToLepus(String str, List<Object> list) {
        LynxTemplateRender lynxTemplateRender = this.mLynxTemplateRender;
        if (lynxTemplateRender != null) {
            lynxTemplateRender.sendGlobalEventToLepus(str, list);
        }
    }

    public void updateViewport(int i2, int i3) {
        LynxTemplateRender lynxTemplateRender = this.mLynxTemplateRender;
        if (lynxTemplateRender != null) {
            lynxTemplateRender.updateViewport(i2, i3);
        }
    }

    public LynxView(Context context, n nVar) {
        super(context);
        LLog.a(4, "LynxView", "new lynxview  " + toString());
        setFocusableInTouchMode(true);
        VSyncMonitor.f56542a = new WeakReference<>(com_lynx_tasm_LynxView_com_ss_android_ugc_aweme_lancet_GetSystemServiceLancet_getSystemService(context, "window"));
        this.mLynxTemplateRender = new LynxTemplateRender(context, this, nVar);
    }

    public void LynxView__renderTemplateUrl$___twin___(String str, String str2) {
        LLog.a(4, "LynxView", "renderTemplateUrl " + str + "with jsonData in" + toString());
        LynxTemplateRender lynxTemplateRender = this.mLynxTemplateRender;
        if (lynxTemplateRender != null) {
            lynxTemplateRender.renderTemplateUrl(str, str2);
        }
    }

    public void renderTemplate(byte[] bArr, TemplateData templateData) {
        LLog.a(4, "LynxView", "renderTemplate with templateData in " + toString());
        LynxTemplateRender lynxTemplateRender = this.mLynxTemplateRender;
        if (lynxTemplateRender != null) {
            lynxTemplateRender.renderTemplate(bArr, templateData);
        }
    }

    public void renderTemplateUrl(String str, TemplateData templateData) {
        LLog.a(4, "LynxView", "renderTemplateUrl " + str + "with templatedata in" + toString());
        LynxTemplateRender lynxTemplateRender = this.mLynxTemplateRender;
        if (lynxTemplateRender != null) {
            lynxTemplateRender.renderTemplateUrl(str, templateData);
        }
    }

    public void updateScreenMetrics(int i2, int i3) {
        if (this.mLynxTemplateRender != null) {
            if (DisplayMetricsHolder.f57022a != null) {
                DisplayMetricsHolder.f57022a.widthPixels = i2;
                DisplayMetricsHolder.f57022a.heightPixels = i3;
            }
            if (DisplayMetricsHolder.f57023b != null) {
                DisplayMetricsHolder.f57023b.widthPixels = i2;
                DisplayMetricsHolder.f57023b.heightPixels = i3;
            }
            this.mLynxTemplateRender.updateScreenMetrics(i2, i3);
        }
    }

    public static Object com_lynx_tasm_LynxView_com_ss_android_ugc_aweme_lancet_GetSystemServiceLancet_getSystemService(Context context, String str) {
        Object obj;
        MethodCollector.i(13929);
        if (Build.VERSION.SDK_INT > 27 || !"clipboard".equals(str)) {
            if (!i.f107220b && "connectivity".equals(str)) {
                try {
                    new com.bytedance.platform.godzilla.b.b.b().a();
                    i.f107220b = true;
                    obj = context.getSystemService(str);
                } catch (Throwable unused) {
                }
            }
            obj = context.getSystemService(str);
        } else if (i.f107219a) {
            synchronized (ClipboardManager.class) {
                try {
                    obj = context.getSystemService(str);
                    if (Thread.currentThread() != Looper.getMainLooper().getThread()) {
                        try {
                            Field declaredField = ClipboardManager.class.getDeclaredField("mHandler");
                            declaredField.setAccessible(true);
                            declaredField.set(obj, new i.a((Handler) declaredField.get(obj)));
                        } catch (Exception e2) {
                            com.bytedance.crash.d.a(e2, "ClipboardManager Handler Reflect Fail");
                        }
                    }
                    i.f107219a = false;
                } finally {
                    MethodCollector.o(13929);
                }
            }
        } else {
            obj = context.getSystemService(str);
        }
        return obj;
    }

    public void LynxView__renderTemplateUrl$___twin___(String str, Map<String, Object> map) {
        LLog.a(4, "LynxView", "renderTemplateUrl " + str + "with Map in" + toString());
        LynxTemplateRender lynxTemplateRender = this.mLynxTemplateRender;
        if (lynxTemplateRender != null) {
            lynxTemplateRender.renderTemplateUrl(str, map);
        }
    }

    /* access modifiers changed from: protected */
    public void onMeasure(int i2, int i3) {
        LLog.a(4, "Lynx", "onMeasure:" + hashCode() + ", width" + View.MeasureSpec.toString(i2) + ", height" + View.MeasureSpec.toString(i3));
        LynxTemplateRender lynxTemplateRender = this.mLynxTemplateRender;
        if (lynxTemplateRender == null) {
            super.onMeasure(i2, i3);
        } else {
            lynxTemplateRender.onMeasure(i2, i3);
        }
    }

    public void renderTemplate(byte[] bArr, Map<String, Object> map) {
        LLog.a(4, "LynxView", "renderTemplate with initdata in " + toString());
        LynxTemplateRender lynxTemplateRender = this.mLynxTemplateRender;
        if (lynxTemplateRender != null) {
            lynxTemplateRender.renderTemplate(bArr, map);
        }
    }

    public void updateData(String str, String str2) {
        LLog.a(4, "LynxView", "updateData with json in " + toString());
        LynxTemplateRender lynxTemplateRender = this.mLynxTemplateRender;
        if (lynxTemplateRender != null) {
            lynxTemplateRender.updateData(str, str2);
        }
    }

    public void updateData(Map<String, Object> map, String str) {
        LLog.a(4, "LynxView", "updateData with map in " + toString());
        LynxTemplateRender lynxTemplateRender = this.mLynxTemplateRender;
        if (lynxTemplateRender != null) {
            lynxTemplateRender.updateData(map, str);
        }
    }

    public static void com_lynx_tasm_LynxView_com_ss_android_ugc_tiktok_security_lancet_lynx_LynxSecLancet_renderTemplateUrl(LynxView lynxView, String str, String str2) {
        com_lynx_tasm_LynxView_com_ss_android_ugc_aweme_lancet_LogLancet_e("Security.lynx", "renderTemplateUrl " + str + "with jsonData");
        p<String, Boolean> a2 = com.ss.android.ugc.tiktok.security.b.h.f149026a.a(str, lynxView);
        if (a2.getSecond().booleanValue()) {
            lynxView.LynxView__renderTemplateUrl$___twin___(a2.getFirst(), str2);
        }
    }

    public void LynxView__renderTemplateWithBaseUrl$___twin___(byte[] bArr, TemplateData templateData, String str) {
        LLog.a(4, "LynxView", "renderTemplateWithBaseUrl " + str + "with templateData in " + toString());
        LynxTemplateRender lynxTemplateRender = this.mLynxTemplateRender;
        if (lynxTemplateRender != null) {
            lynxTemplateRender.renderTemplateWithBaseUrl(bArr, templateData, str);
        }
    }

    public static void com_lynx_tasm_LynxView_com_ss_android_ugc_tiktok_security_lancet_lynx_LynxSecLancet_renderTemplateUrl(LynxView lynxView, String str, Map map) {
        com_lynx_tasm_LynxView_com_ss_android_ugc_aweme_lancet_LogLancet_e("Security.lynx", "renderTemplateUrl " + str + " with Map");
        p<String, Boolean> a2 = com.ss.android.ugc.tiktok.security.b.h.f149026a.a(str, lynxView);
        if (a2.getSecond().booleanValue()) {
            lynxView.LynxView__renderTemplateUrl$___twin___(a2.getFirst(), map);
        }
    }

    public void LynxView__renderTemplateWithBaseUrl$___twin___(byte[] bArr, String str, String str2) {
        LLog.a(4, "LynxView", "renderTemplateWithBaseUrl " + str2 + "with stringdata in" + toString());
        LynxTemplateRender lynxTemplateRender = this.mLynxTemplateRender;
        if (lynxTemplateRender != null) {
            lynxTemplateRender.renderTemplateWithBaseUrl(bArr, str, str2);
        }
    }

    public void LynxView__renderTemplateWithBaseUrl$___twin___(byte[] bArr, Map<String, Object> map, String str) {
        LLog.a(4, "LynxView", "renderTemplateWithBaseUrl " + str + "with map in " + toString());
        LynxTemplateRender lynxTemplateRender = this.mLynxTemplateRender;
        if (lynxTemplateRender != null) {
            lynxTemplateRender.renderTemplateWithBaseUrl(bArr, map, str);
        }
    }

    public static void com_lynx_tasm_LynxView_com_ss_android_ugc_tiktok_security_lancet_lynx_LynxSecLancet_renderTemplateWithBaseUrl(LynxView lynxView, byte[] bArr, TemplateData templateData, String str) {
        com_lynx_tasm_LynxView_com_ss_android_ugc_aweme_lancet_LogLancet_e("Security.lynx", "renderTemplateWithBaseUrl " + str + " with templateData");
        p<String, Boolean> a2 = com.ss.android.ugc.tiktok.security.b.h.f149026a.a(str, lynxView);
        if (a2.getSecond().booleanValue()) {
            lynxView.LynxView__renderTemplateWithBaseUrl$___twin___(bArr, templateData, a2.getFirst());
        }
    }

    public static void com_lynx_tasm_LynxView_com_ss_android_ugc_tiktok_security_lancet_lynx_LynxSecLancet_renderTemplateWithBaseUrl(LynxView lynxView, byte[] bArr, String str, String str2) {
        com_lynx_tasm_LynxView_com_ss_android_ugc_aweme_lancet_LogLancet_e("Security.lynx", "renderTemplateWithBaseUrl " + str2 + " with stringdata");
        p<String, Boolean> a2 = com.ss.android.ugc.tiktok.security.b.h.f149026a.a(str2, lynxView);
        if (a2.getSecond().booleanValue()) {
            lynxView.LynxView__renderTemplateWithBaseUrl$___twin___(bArr, str, a2.getFirst());
        }
    }

    public static void com_lynx_tasm_LynxView_com_ss_android_ugc_tiktok_security_lancet_lynx_LynxSecLancet_renderTemplateWithBaseUrl(LynxView lynxView, byte[] bArr, Map map, String str) {
        com_lynx_tasm_LynxView_com_ss_android_ugc_aweme_lancet_LogLancet_e("Security.lynx", "renderTemplateWithBaseUrl " + str + " with map");
        p<String, Boolean> a2 = com.ss.android.ugc.tiktok.security.b.h.f149026a.a(str, lynxView);
        if (a2.getSecond().booleanValue()) {
            lynxView.LynxView__renderTemplateWithBaseUrl$___twin___(bArr, map, a2.getFirst());
        }
    }

    /* access modifiers changed from: protected */
    public void onLayout(boolean z, int i2, int i3, int i4, int i5) {
        LynxTemplateRender lynxTemplateRender = this.mLynxTemplateRender;
        if (lynxTemplateRender != null) {
            lynxTemplateRender.onLayout(z, i2, i3, i4, i5);
            LLog.a(4, "Lynx", "onLayout:" + hashCode() + i2 + " " + i3 + " " + i4 + " " + i5);
        }
    }
}
