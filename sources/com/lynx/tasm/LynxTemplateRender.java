package com.lynx.tasm;

import android.content.Context;
import android.os.Build;
import android.os.Looper;
import android.text.TextUtils;
import android.util.DisplayMetrics;
import android.util.Log;
import android.view.MotionEvent;
import android.view.View;
import com.bytedance.covode.number.Covode;
import com.bytedance.frameworks.apm.trace.MethodCollector;
import com.lynx.jsbridge.LynxIntersectionObserverModule;
import com.lynx.jsbridge.LynxModuleManager;
import com.lynx.jsbridge.LynxSetModule;
import com.lynx.jsbridge.LynxUIMethodModule;
import com.lynx.react.bridge.JavaOnlyArray;
import com.lynx.react.bridge.JavaOnlyMap;
import com.lynx.tasm.TemplateAssembler;
import com.lynx.tasm.base.LLog;
import com.lynx.tasm.base.TraceEvent;
import com.lynx.tasm.base.h;
import com.lynx.tasm.base.i;
import com.lynx.tasm.behavior.PaintingContext;
import com.lynx.tasm.behavior.b.b;
import com.lynx.tasm.behavior.f;
import com.lynx.tasm.behavior.j;
import com.lynx.tasm.behavior.l;
import com.lynx.tasm.behavior.q;
import com.lynx.tasm.behavior.shadow.e;
import com.lynx.tasm.behavior.shadow.k;
import com.lynx.tasm.behavior.t;
import com.lynx.tasm.behavior.ui.LynxBaseUI;
import com.lynx.tasm.behavior.ui.LynxUI;
import com.lynx.tasm.behavior.ui.UIBody;
import com.lynx.tasm.behavior.ui.UIGroup;
import com.lynx.tasm.behavior.w;
import com.lynx.tasm.c;
import com.lynx.tasm.component.DynamicComponentLoader;
import com.lynx.tasm.core.ExternalSourceLoader;
import com.lynx.tasm.core.JSProxy;
import com.lynx.tasm.core.ResourceLoader;
import com.lynx.tasm.h;
import com.lynx.tasm.provider.CanvasProvider;
import com.lynx.tasm.provider.b;
import com.lynx.tasm.utils.DisplayMetricsHolder;
import com.lynx.tasm.utils.m;
import com.lynx.tasm.utils.n;
import java.lang.ref.WeakReference;
import java.nio.ByteBuffer;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.concurrent.atomic.AtomicInteger;
import org.json.JSONObject;

public class LynxTemplateRender {
    static boolean sIsFirstRender = true;
    private TemplateData globalProps;
    private boolean mAsyncRender;
    private n mBuilder;
    public final p mClient = new p();
    private Context mContext;
    public com.lynx.devtoolwrapper.d mDevtool;
    public w mEventDispatcher;
    private long mFirstMeasureTime = -1;
    public boolean mFirstScreen = false;
    private float mFontScale = 1.0f;
    private l mGroup;
    private boolean mHasDestory;
    private boolean mHasEnvPrepared;
    private boolean mHasPageStart;
    public long mInitEnd;
    public long mInitStart;
    private l mIntersectionObserverManager;
    private com.lynx.tasm.behavior.ui.b.b mKryptonHelper;
    private ExternalSourceLoader mLoader;
    private j mLynxContext;
    public q mLynxUIOwner;
    public LynxView mLynxView;
    private LynxModuleManager mModuleManager;
    private long mPageLoadedTime;
    private PaintingContext mPaintingContext;
    private int mPreHeightMeasureSpec;
    private int mPreWidthMeasureSpec;
    private t mShadowNodeOwner;
    private boolean mShouldUpdateViewport = true;
    private List<e> mStateListeners;
    public TemplateAssembler mTemplateAssembler;
    public com.lynx.tasm.g.a mTheme;
    private r mThreadStrategyForRendering;
    private String mUrl;
    private k mViewLayoutTick;
    private boolean mWillContentSizeChange;
    private boolean reload;

    public void onDispatchTouchEvent(MotionEvent motionEvent) {
    }

    /* access modifiers changed from: package-private */
    public void onInterceptTouchEvent(MotionEvent motionEvent) {
    }

    /* access modifiers changed from: package-private */
    public void onTouchEvent(MotionEvent motionEvent) {
    }

    /* access modifiers changed from: package-private */
    public void showErrorMessage(String str) {
    }

    /* access modifiers changed from: package-private */
    public static class c extends o {

        /* renamed from: a  reason: collision with root package name */
        private long f55566a;

        static {
            Covode.recordClassIndex(34797);
        }

        c() {
        }

        @Override // com.lynx.tasm.o
        public final void a() {
            LLog.a(3, "LynxTemplateRender", "onLoadSuccess time: " + (System.currentTimeMillis() - this.f55566a));
        }

        @Override // com.lynx.tasm.o
        public final void b() {
            LLog.a(3, "LynxTemplateRender", "onFirstScreen time: " + (System.currentTimeMillis() - this.f55566a));
        }

        @Override // com.lynx.tasm.o
        public final void c() {
            LLog.a(3, "LynxTemplateRender", "onPageUpdate time:" + (System.currentTimeMillis() - this.f55566a));
        }

        @Override // com.lynx.tasm.o
        public final void a(String str) {
            this.f55566a = System.currentTimeMillis();
        }
    }

    private boolean checkIfEnvPrepared() {
        return this.mHasEnvPrepared;
    }

    public com.lynx.devtoolwrapper.d getDevTool() {
        return this.mDevtool;
    }

    /* access modifiers changed from: package-private */
    public long getFirstMeasureTime() {
        return this.mFirstMeasureTime;
    }

    public j getLynxContext() {
        return this.mLynxContext;
    }

    public com.lynx.tasm.g.a getTheme() {
        return this.mTheme;
    }

    public final r getThreadStrategyForRendering() {
        return this.mThreadStrategyForRendering;
    }

    /* access modifiers changed from: protected */
    public void finalize() {
        super.finalize();
        destroyNative();
    }

    public UIGroup<UIBody.a> getLynxRootUI() {
        return this.mLynxUIOwner.f55932b;
    }

    public String getTemplateUrl() {
        String str = this.mUrl;
        if (str == null) {
            return "";
        }
        return str;
    }

    public void onEnterBackground() {
        onEnterBackground(true);
    }

    public void onEnterForeground() {
        onEnterForeground(true);
    }

    public void pauseRootLayoutAnimation() {
        this.mLynxUIOwner.f55938h = false;
    }

    public void resumeRootLayoutAnimation() {
        this.mLynxUIOwner.f55938h = true;
    }

    /* access modifiers changed from: package-private */
    public class b implements h {
        static {
            Covode.recordClassIndex(34793);
        }

        @Override // com.lynx.tasm.base.h
        public final void c() {
            try {
                m.a(new Runnable() {
                    /* class com.lynx.tasm.LynxTemplateRender.b.AnonymousClass3 */

                    static {
                        Covode.recordClassIndex(34796);
                    }

                    public final void run() {
                        if (LynxTemplateRender.this.mClient != null) {
                            TraceEvent.a(0, "Client.onUpdateDataWithoutChange");
                            LynxTemplateRender.this.mClient.f();
                            TraceEvent.b(0, "Client.onUpdateDataWithoutChange");
                        }
                    }
                });
            } catch (Throwable unused) {
            }
        }

        @Override // com.lynx.tasm.base.h
        public final void a() {
            LLog.a(4, "LynxTemplateRender", "onFirstScreen");
            LynxTemplateRender.this.mLynxUIOwner.f55937g = false;
            try {
                m.a(new Runnable() {
                    /* class com.lynx.tasm.LynxTemplateRender.b.AnonymousClass1 */

                    static {
                        Covode.recordClassIndex(34794);
                    }

                    public final void run() {
                        MethodCollector.i(12401);
                        LynxTemplateRender.this.mFirstScreen = true;
                        if (LynxTemplateRender.this.mTemplateAssembler != null) {
                            TemplateAssembler templateAssembler = LynxTemplateRender.this.mTemplateAssembler;
                            templateAssembler.nativeOnFirstScreen(templateAssembler.f55571a);
                        }
                        if (LynxTemplateRender.this.mClient != null) {
                            TraceEvent.a(0, "Client.onFirstScreen");
                            LynxTemplateRender.this.mClient.b();
                            TraceEvent.b(0, "Client.onFirstScreen");
                        }
                        MethodCollector.o(12401);
                    }
                });
            } catch (Throwable unused) {
            }
        }

        @Override // com.lynx.tasm.base.h
        public final void b() {
            try {
                LLog.a(4, "LynxTemplateRender", "onPageUpdate");
                m.a(new Runnable() {
                    /* class com.lynx.tasm.LynxTemplateRender.b.AnonymousClass2 */

                    static {
                        Covode.recordClassIndex(34795);
                    }

                    public final void run() {
                        if (LynxTemplateRender.this.mClient != null) {
                            TraceEvent.a(0, "Client.onPageUpdate");
                            LynxTemplateRender.this.mClient.c();
                            TraceEvent.b(0, "Client.onPageUpdate");
                        }
                    }
                });
            } catch (Throwable unused) {
            }
        }

        private b() {
        }

        /* synthetic */ b(LynxTemplateRender lynxTemplateRender, byte b2) {
            this();
        }
    }

    static {
        Covode.recordClassIndex(34785);
    }

    public String getPageVersion() {
        TemplateAssembler templateAssembler = this.mTemplateAssembler;
        if (templateAssembler == null) {
            return "";
        }
        return templateAssembler.a();
    }

    /* access modifiers changed from: package-private */
    public class d implements TemplateAssembler.a {

        /* renamed from: b  reason: collision with root package name */
        private TemplateAssembler f55568b;

        static {
            Covode.recordClassIndex(34798);
        }

        @Override // com.lynx.tasm.TemplateAssembler.a
        public final void b() {
            if (LynxTemplateRender.this.mClient != null) {
                TraceEvent.a(0, "Client.onRuntimeReady");
                LynxTemplateRender.this.mClient.d();
                TraceEvent.b(0, "Client.onRuntimeReady");
            }
        }

        @Override // com.lynx.tasm.TemplateAssembler.a
        public final void a() {
            com.lynx.tasm.behavior.b.b bVar = b.a.f55815a;
            LynxView lynxView = LynxTemplateRender.this.mLynxView;
            AtomicInteger atomicInteger = new AtomicInteger(0);
            for (LynxUI lynxUI : bVar.f55803b.keySet()) {
                if (lynxUI.mContext.f55901i.f56067a == lynxView) {
                    atomicInteger.incrementAndGet();
                    lynxUI.execEnterAnim(
                    /*  JADX ERROR: Method code generation error
                        jadx.core.utils.exceptions.CodegenException: Error generate insn: 0x0032: INVOKE  
                          (r1v2 'lynxUI' com.lynx.tasm.behavior.ui.LynxUI)
                          (wrap: com.lynx.tasm.behavior.b.b$1 : 0x002f: CONSTRUCTOR  (r0v12 com.lynx.tasm.behavior.b.b$1) = (r5v0 'bVar' com.lynx.tasm.behavior.b.b), (r3v0 'atomicInteger' java.util.concurrent.atomic.AtomicInteger) call: com.lynx.tasm.behavior.b.b.1.<init>(com.lynx.tasm.behavior.b.b, java.util.concurrent.atomic.AtomicInteger):void type: CONSTRUCTOR)
                         type: VIRTUAL call: com.lynx.tasm.behavior.ui.LynxUI.execEnterAnim(com.lynx.tasm.behavior.b.b$b):void in method: com.lynx.tasm.LynxTemplateRender.d.a():void, file: classes9.dex
                        	at jadx.core.codegen.InsnGen.makeInsn(InsnGen.java:255)
                        	at jadx.core.codegen.InsnGen.makeInsn(InsnGen.java:217)
                        	at jadx.core.codegen.RegionGen.makeSimpleBlock(RegionGen.java:110)
                        	at jadx.core.codegen.RegionGen.makeRegion(RegionGen.java:56)
                        	at jadx.core.codegen.RegionGen.makeSimpleRegion(RegionGen.java:93)
                        	at jadx.core.codegen.RegionGen.makeRegion(RegionGen.java:59)
                        	at jadx.core.codegen.RegionGen.makeRegionIndent(RegionGen.java:99)
                        	at jadx.core.codegen.RegionGen.makeIf(RegionGen.java:143)
                        	at jadx.core.codegen.RegionGen.makeRegion(RegionGen.java:63)
                        	at jadx.core.codegen.RegionGen.makeSimpleRegion(RegionGen.java:93)
                        	at jadx.core.codegen.RegionGen.makeRegion(RegionGen.java:59)
                        	at jadx.core.codegen.RegionGen.makeRegionIndent(RegionGen.java:99)
                        	at jadx.core.codegen.RegionGen.makeLoop(RegionGen.java:221)
                        	at jadx.core.codegen.RegionGen.makeRegion(RegionGen.java:67)
                        	at jadx.core.codegen.RegionGen.makeSimpleRegion(RegionGen.java:93)
                        	at jadx.core.codegen.RegionGen.makeRegion(RegionGen.java:59)
                        	at jadx.core.codegen.MethodGen.addRegionInsns(MethodGen.java:244)
                        	at jadx.core.codegen.MethodGen.addInstructions(MethodGen.java:237)
                        	at jadx.core.codegen.ClassGen.addMethodCode(ClassGen.java:342)
                        	at jadx.core.codegen.ClassGen.addMethod(ClassGen.java:295)
                        	at jadx.core.codegen.ClassGen.lambda$addInnerClsAndMethods$2(ClassGen.java:264)
                        	at java.base/java.util.stream.ForEachOps$ForEachOp$OfRef.accept(ForEachOps.java:183)
                        	at java.base/java.util.ArrayList.forEach(ArrayList.java:1511)
                        	at java.base/java.util.stream.SortedOps$RefSortingSink.end(SortedOps.java:395)
                        	at java.base/java.util.stream.Sink$ChainedReference.end(Sink.java:258)
                        Caused by: jadx.core.utils.exceptions.CodegenException: Error generate insn: 0x002f: CONSTRUCTOR  (r0v12 com.lynx.tasm.behavior.b.b$1) = (r5v0 'bVar' com.lynx.tasm.behavior.b.b), (r3v0 'atomicInteger' java.util.concurrent.atomic.AtomicInteger) call: com.lynx.tasm.behavior.b.b.1.<init>(com.lynx.tasm.behavior.b.b, java.util.concurrent.atomic.AtomicInteger):void type: CONSTRUCTOR in method: com.lynx.tasm.LynxTemplateRender.d.a():void, file: classes9.dex
                        	at jadx.core.codegen.InsnGen.makeInsn(InsnGen.java:255)
                        	at jadx.core.codegen.InsnGen.addWrappedArg(InsnGen.java:119)
                        	at jadx.core.codegen.InsnGen.addArg(InsnGen.java:103)
                        	at jadx.core.codegen.InsnGen.generateMethodArguments(InsnGen.java:806)
                        	at jadx.core.codegen.InsnGen.makeInvoke(InsnGen.java:746)
                        	at jadx.core.codegen.InsnGen.makeInsnBody(InsnGen.java:367)
                        	at jadx.core.codegen.InsnGen.makeInsn(InsnGen.java:249)
                        	... 24 more
                        Caused by: jadx.core.utils.exceptions.JadxRuntimeException: Expected class to be processed at this point, class: com.lynx.tasm.behavior.b.b, state: GENERATED_AND_UNLOADED
                        	at jadx.core.dex.nodes.ClassNode.ensureProcessed(ClassNode.java:215)
                        	at jadx.core.codegen.InsnGen.makeConstructor(InsnGen.java:630)
                        	at jadx.core.codegen.InsnGen.makeInsnBody(InsnGen.java:363)
                        	at jadx.core.codegen.InsnGen.makeInsn(InsnGen.java:230)
                        	... 30 more
                        */
                    /*
                        this = this;
                        com.lynx.tasm.behavior.b.b r5 = com.lynx.tasm.behavior.b.b.a.f55815a
                        com.lynx.tasm.LynxTemplateRender r0 = com.lynx.tasm.LynxTemplateRender.this
                        com.lynx.tasm.LynxView r4 = r0.mLynxView
                        java.util.concurrent.atomic.AtomicInteger r3 = new java.util.concurrent.atomic.AtomicInteger
                        r0 = 0
                        r3.<init>(r0)
                        java.util.WeakHashMap<com.lynx.tasm.behavior.ui.LynxUI, com.lynx.tasm.a.b> r0 = r5.f55803b
                        java.util.Set r0 = r0.keySet()
                        java.util.Iterator r2 = r0.iterator()
                    L_0x0016:
                        boolean r0 = r2.hasNext()
                        if (r0 == 0) goto L_0x0036
                        java.lang.Object r1 = r2.next()
                        com.lynx.tasm.behavior.ui.LynxUI r1 = (com.lynx.tasm.behavior.ui.LynxUI) r1
                        com.lynx.tasm.behavior.j r0 = r1.mContext
                        com.lynx.tasm.behavior.ui.UIBody r0 = r0.f55901i
                        com.lynx.tasm.behavior.ui.UIBody$a r0 = r0.f56067a
                        if (r0 != r4) goto L_0x0016
                        r3.incrementAndGet()
                        com.lynx.tasm.behavior.b.b$1 r0 = new com.lynx.tasm.behavior.b.b$1
                        r0.<init>(r3)
                        r1.execEnterAnim(r0)
                        goto L_0x0016
                    L_0x0036:
                        r3.get()
                        com.lynx.tasm.LynxTemplateRender r0 = com.lynx.tasm.LynxTemplateRender.this
                        com.lynx.tasm.p r0 = r0.mClient
                        if (r0 == 0) goto L_0x0048
                        com.lynx.tasm.LynxTemplateRender r1 = com.lynx.tasm.LynxTemplateRender.this
                        com.lynx.tasm.TemplateAssembler r0 = r6.f55568b
                        int r0 = r0.f55576f
                        r1.dispatchLoadSuccess(r0)
                    L_0x0048:
                        return
                    */
                    throw new UnsupportedOperationException("Method not decompiled: com.lynx.tasm.LynxTemplateRender.d.a():void");
                }

                @Override // com.lynx.tasm.TemplateAssembler.a
                public final void a(com.lynx.tasm.g.a aVar) {
                    if (LynxTemplateRender.this.mTheme == null) {
                        LynxTemplateRender.this.mTheme = aVar;
                    } else {
                        LynxTemplateRender.this.mTheme.a(aVar);
                    }
                }

                @Override // com.lynx.tasm.TemplateAssembler.a
                public final String a(String str) {
                    com.lynx.tasm.provider.l lVar = LynxEnv.b().f55534d;
                    if (lVar == null) {
                        return null;
                    }
                    if (str != null) {
                        try {
                            str.isEmpty();
                        } catch (Throwable th) {
                            LLog.a(3, "LynxTemplateRender", "translateResourceForTheme exception " + th.toString());
                            return null;
                        }
                    }
                    return lVar.a();
                }

                @Override // com.lynx.tasm.TemplateAssembler.a
                public final void b(LynxPerfMetric lynxPerfMetric) {
                    if (LynxTemplateRender.this.mClient != null) {
                        TraceEvent.a(0, "Client.onUpdatePerfReady");
                        LynxTemplateRender.this.mClient.b(lynxPerfMetric);
                        TraceEvent.b(0, "Client.onUpdatePerfReady");
                    }
                }

                @Override // com.lynx.tasm.TemplateAssembler.a
                public final void a(LynxPerfMetric lynxPerfMetric) {
                    lynxPerfMetric.setInitTiming(LynxTemplateRender.this.mInitStart, LynxTemplateRender.this.mInitEnd);
                    lynxPerfMetric.setIsColdBoot(LynxTemplateRender.sIsFirstRender);
                    if (!(LynxTemplateRender.this.mLynxView == null || LynxTemplateRender.this.mLynxView.getLynxUIRoot() == null || LynxTemplateRender.this.mLynxView.getLynxUIRoot().mView == null)) {
                        lynxPerfMetric.correctFirstPageLayout(((UIBody.a) LynxTemplateRender.this.mLynxView.getLynxUIRoot().mView).getMeaningfulPaintTiming());
                    }
                    LynxTemplateRender.sIsFirstRender = false;
                    if (LynxTemplateRender.this.mClient != null) {
                        TraceEvent.a(0, "Client.onFirstLoadPerfReady");
                        LynxTemplateRender.this.mClient.a(lynxPerfMetric);
                        TraceEvent.b(0, "Client.onFirstLoadPerfReady");
                    }
                }

                @Override // com.lynx.tasm.TemplateAssembler.a
                public final void a(q qVar) {
                    if (LynxTemplateRender.this.mEventDispatcher != null) {
                        if (qVar != null) {
                            LynxTemplateRender.this.mEventDispatcher.f56471c = n.a(qVar.n, LynxTemplateRender.this.getLynxContext().p);
                        } else {
                            return;
                        }
                    } else if (qVar == null) {
                        return;
                    }
                    LynxTemplateRender.this.mLynxUIOwner.f55932b.f56068b.f56133f = qVar.p;
                }

                @Override // com.lynx.tasm.TemplateAssembler.a
                public final void a(HashMap<String, Object> hashMap) {
                    if (LynxTemplateRender.this.mClient != null) {
                        TraceEvent.a(0, "Client.onDynamicComponentPerf");
                        LynxTemplateRender.this.mClient.a(hashMap);
                        TraceEvent.b(0, "Client.onDynamicComponentPerf");
                    }
                }

                public d(TemplateAssembler templateAssembler) {
                    this.f55568b = templateAssembler;
                }

                @Override // com.lynx.tasm.TemplateAssembler.a
                public final void a(int i2, String str) {
                    LynxTemplateRender.this.onNativeErrorOccurred(i2, str);
                }

                @Override // com.lynx.tasm.TemplateAssembler.a
                public final void a(String str, String str2, int i2) {
                    if (LynxTemplateRender.this.mClient != null) {
                        TraceEvent.a(0, "Client.onModuleMethodInvoked");
                        LynxTemplateRender.this.mClient.a(str, str2, i2);
                        TraceEvent.b(0, "Client.onModuleMethodInvoked");
                    }
                }
            }

            private void requestLayoutWhenSafepointEnable() {
                if (this.mLynxView != null && this.mBuilder.f56759e && getThreadStrategyForRendering() == r.PART_ON_LAYOUT) {
                    this.mLynxView.requestLayout();
                }
            }

            /* access modifiers changed from: package-private */
            public boolean blockNativeEvent() {
                w wVar = this.mEventDispatcher;
                if (wVar.f56469a == null) {
                    return false;
                }
                com.lynx.tasm.behavior.a.a aVar = wVar.f56469a;
                while (aVar != null && aVar.parent() != aVar) {
                    if (aVar.blockNativeEvent()) {
                        return true;
                    }
                    aVar = aVar.parent();
                }
                return false;
            }

            public boolean enableEventThrough() {
                TemplateAssembler templateAssembler = this.mTemplateAssembler;
                if (templateAssembler != null) {
                    if (templateAssembler.f55580j == null) {
                        LLog.a(6, "TemplateAssembler", "PageConfig is null. EnableEventThrough get default false!");
                    } else if (templateAssembler.f55580j.f56827b) {
                        return true;
                    }
                }
                return false;
            }

            public Map<String, Object> getAllJsSource() {
                JavaOnlyMap javaOnlyMap;
                MethodCollector.i(13124);
                TemplateAssembler templateAssembler = this.mTemplateAssembler;
                if (templateAssembler != null) {
                    javaOnlyMap = templateAssembler.nativeGetAllJsSource(templateAssembler.f55571a);
                } else {
                    javaOnlyMap = null;
                }
                MethodCollector.o(13124);
                return javaOnlyMap;
            }

            /* access modifiers changed from: package-private */
            public h getLynxConfigInfo() {
                TemplateAssembler templateAssembler = this.mTemplateAssembler;
                if (templateAssembler == null) {
                    return new h.a().a();
                }
                return templateAssembler.d();
            }

            public void syncFlush() {
                m.b();
                if (this.mAsyncRender && this.mPaintingContext != null) {
                    LLog.a(4, "LynxTemplateRender", "syncFlush wait layout finish");
                    this.mPaintingContext.flush();
                }
            }

            /* access modifiers changed from: package-private */
            public void onAttachedToWindow() {
                UIBody uIBody;
                LLog.a(4, "LynxTemplateRender", "lynxview onAttachedToWindow " + toString());
                TraceEvent.a("onAttachedToWindow", "#e6ee9c");
                onEnterForeground(false);
                q qVar = this.mLynxUIOwner;
                if (qVar != null && (uIBody = qVar.f55932b) != null) {
                    uIBody.onAttach();
                }
            }

            private void destroyNative() {
                LLog.a(4, "LynxTemplateRender", "destroyNative url " + getTemplateUrl() + " in " + toString());
                com.lynx.devtoolwrapper.d dVar = this.mDevtool;
                if (dVar != null) {
                    if (dVar.f55444e != null) {
                        dVar.f55444e = null;
                    }
                    if (dVar.f55440a != null) {
                        dVar.f55440a = null;
                    }
                    if (dVar.f55441b != null) {
                        dVar.f55441b = null;
                    }
                    this.mDevtool = null;
                }
                TemplateAssembler templateAssembler = this.mTemplateAssembler;
                if (templateAssembler != null) {
                    templateAssembler.b();
                    this.mTemplateAssembler = null;
                }
                this.mHasDestory = true;
            }

            public void destroy() {
                LynxBaseUI value;
                destroyNative();
                TraceEvent.a(0, "Client.onReportComponentInfo");
                this.mClient.a(this.mLynxUIOwner.a());
                TraceEvent.b(0, "Client.onReportComponentInfo");
                for (Map.Entry<Integer, LynxBaseUI> entry : this.mLynxUIOwner.f55935e.entrySet()) {
                    if ((entry.getValue() instanceof LynxBaseUI) && (value = entry.getValue()) != null) {
                        value.destroy();
                    }
                }
                this.mShadowNodeOwner = null;
                if (this.mLynxContext.t != null) {
                    this.mLynxContext.t.f56810a.clear();
                }
                this.mLynxContext = null;
            }

            /* access modifiers changed from: package-private */
            public void onDetachedFromWindow() {
                UIBody uIBody;
                LLog.a(4, "LynxTemplateRender", "lynxview onDetachedFromWindow " + toString());
                TraceEvent.a("onDetachedFromWindow", "#fff59d");
                TraceEvent.a(0, "Client.onReportComponentInfo");
                this.mClient.a(this.mLynxUIOwner.a());
                TraceEvent.b(0, "Client.onReportComponentInfo");
                q qVar = this.mLynxUIOwner;
                if (!(qVar == null || (uIBody = qVar.f55932b) == null)) {
                    uIBody.onDetach();
                }
                onEnterBackground(false);
            }

            private void reloadAndInit() {
                MethodCollector.i(11705);
                if (this.mHasDestory) {
                    MethodCollector.o(11705);
                } else if (this.reload) {
                    this.mHasPageStart = false;
                    this.mFirstScreen = false;
                    if (this.mLynxView != null) {
                        if (m.a()) {
                            this.mLynxView.removeAllViews();
                        } else {
                            m.a(new Runnable() {
                                /* class com.lynx.tasm.LynxTemplateRender.AnonymousClass2 */

                                static {
                                    Covode.recordClassIndex(34787);
                                }

                                public final void run() {
                                    LynxTemplateRender.this.mLynxView.removeAllViews();
                                }
                            });
                        }
                    }
                    PaintingContext paintingContext = this.mPaintingContext;
                    if (paintingContext != null) {
                        paintingContext.f55780a.f55823b = true;
                    }
                    TemplateAssembler templateAssembler = this.mTemplateAssembler;
                    if (templateAssembler != null) {
                        templateAssembler.b();
                        this.mTemplateAssembler = null;
                    }
                    TemplateData templateData = this.globalProps;
                    if (templateData != null) {
                        templateData.b();
                        TemplateData templateData2 = new TemplateData(TemplateData.nativeClone(templateData.f55591a), null);
                        templateData2.f55592b = templateData.f55592b;
                        templateData2.f55594d = templateData.f55594d;
                        templateData2.f55593c = templateData.f55593c;
                        this.globalProps = templateData2;
                    }
                    int i2 = this.mPreWidthMeasureSpec;
                    int i3 = this.mPreHeightMeasureSpec;
                    this.mPreWidthMeasureSpec = 0;
                    this.mPreHeightMeasureSpec = 0;
                    q qVar = this.mLynxUIOwner;
                    qVar.f55937g = true;
                    qVar.f55931a = -1;
                    if (qVar.f55935e != null) {
                        for (LynxBaseUI lynxBaseUI : qVar.f55935e.values()) {
                            lynxBaseUI.onReset();
                        }
                        qVar.f55935e.clear();
                    }
                    if (qVar.f55932b != null) {
                        qVar.f55932b.removeAll();
                    }
                    if (qVar.f55936f != null) {
                        qVar.f55936f.clear();
                    }
                    createTemplateAssembler();
                    updateViewport(i2, i3);
                    MethodCollector.o(11705);
                } else {
                    this.reload = true;
                    MethodCollector.o(11705);
                }
            }

            /* JADX DEBUG: Multi-variable search result rejected for r10v4, resolved type: com.lynx.tasm.behavior.shadow.k */
            /* JADX WARN: Multi-variable type inference failed */
            private void createTemplateAssembler() {
                com.lynx.tasm.behavior.c.a.a aVar;
                com.lynx.tasm.behavior.shadow.a aVar2;
                String str;
                boolean z;
                boolean z2;
                j jVar;
                MethodCollector.i(11872);
                if (!checkIfEnvPrepared()) {
                    MethodCollector.o(11872);
                    return;
                }
                if (this.mThreadStrategyForRendering == r.MULTI_THREADS) {
                    aVar = new com.lynx.tasm.behavior.c.a.b(this.mLynxUIOwner);
                } else {
                    aVar = new com.lynx.tasm.behavior.c.a.a(this.mLynxUIOwner, this.mBuilder.f56766m);
                }
                if (this.mThreadStrategyForRendering == r.ALL_ON_UI) {
                    k kVar = new k(this.mLynxView);
                    this.mViewLayoutTick = kVar;
                    aVar2 = kVar;
                } else {
                    int i2 = Build.VERSION.SDK_INT;
                    aVar2 = new com.lynx.tasm.behavior.shadow.a();
                }
                this.mPaintingContext = new PaintingContext(this.mLynxUIOwner, aVar);
                t tVar = new t(this.mLynxContext, this.mBuilder.f56756b, this.mPaintingContext, aVar2, new b(this, (byte) 0));
                this.mShadowNodeOwner = tVar;
                this.mLynxContext.o = new WeakReference<>(tVar);
                TemplateAssembler templateAssembler = new TemplateAssembler(this.mPaintingContext, this.mShadowNodeOwner, new DynamicComponentLoader(this.mBuilder.f56762h, this), this.mGroup, this.mThreadStrategyForRendering, this.mBuilder.f56759e, this.mBuilder.f56764k, this.mBuilder.f56765l);
                this.mTemplateAssembler = templateAssembler;
                this.mLynxUIOwner.f55939i = templateAssembler;
                this.mLynxContext.f55897e = new c(this.mTemplateAssembler);
                this.mLynxContext.n = new WeakReference<>(this.mLynxView);
                this.mLynxContext.f55899g = new g(this.mTemplateAssembler);
                com.lynx.tasm.provider.c cVar = new com.lynx.tasm.provider.c();
                for (Map.Entry<String, com.lynx.tasm.provider.h> entry : LynxEnv.b().v.entrySet()) {
                    cVar.a(entry.getKey(), entry.getValue());
                }
                for (Map.Entry<String, com.lynx.tasm.provider.h> entry2 : this.mBuilder.f56763i.entrySet()) {
                    cVar.a(entry2.getKey(), entry2.getValue());
                }
                this.mLynxContext.t = cVar;
                this.mTemplateAssembler.f55579i = new WeakReference<>(this.mLynxContext);
                LynxModuleManager lynxModuleManager = new LynxModuleManager(this.mLynxContext);
                this.mModuleManager = lynxModuleManager;
                lynxModuleManager.a(this.mBuilder.f56757c);
                String[] strArr = null;
                this.mModuleManager.a("IntersectionObserverModule", LynxIntersectionObserverModule.class, null);
                this.mModuleManager.a("LynxUIMethodModule", LynxUIMethodModule.class, null);
                this.mModuleManager.a("LynxSetModule", LynxSetModule.class, null);
                ExternalSourceLoader externalSourceLoader = new ExternalSourceLoader(this.mBuilder.f56763i.get("EXTERNAL_JS_SOURCE"), this.mBuilder.f56763i.get("DYNAMIC_COMPONENT"), this.mBuilder.f56762h, this);
                this.mLoader = externalSourceLoader;
                TemplateAssembler templateAssembler2 = this.mTemplateAssembler;
                LynxModuleManager lynxModuleManager2 = this.mModuleManager;
                boolean z3 = this.mBuilder.o;
                boolean z4 = this.mBuilder.f56760f;
                long j2 = templateAssembler2.f55571a;
                ResourceLoader resourceLoader = new ResourceLoader();
                if (templateAssembler2.f55578h != null) {
                    str = templateAssembler2.f55578h.f56749a;
                } else {
                    str = l.f56748f;
                }
                if (templateAssembler2.f55578h != null) {
                    strArr = templateAssembler2.f55578h.f56751c;
                }
                if (templateAssembler2.f55578h == null || !templateAssembler2.f55578h.f56750b) {
                    z = false;
                } else {
                    z = true;
                }
                if (templateAssembler2.f55578h == null || !templateAssembler2.f55578h.f56752d) {
                    z2 = false;
                } else {
                    z2 = true;
                }
                templateAssembler2.nativeInitRuntime(j2, resourceLoader, externalSourceLoader, lynxModuleManager2, str, strArr, z, z2, z4, z3);
                templateAssembler2.f55575e = new JSProxy(templateAssembler2.f55571a, templateAssembler2.f55579i);
                this.mLynxContext.f55900h = new WeakReference<>(this.mTemplateAssembler.f55575e);
                this.mLoader.f56514b = new WeakReference<>(this.mTemplateAssembler.f55575e);
                l lVar = new l(this.mLynxContext, this.mTemplateAssembler.f55575e);
                this.mIntersectionObserverManager = lVar;
                this.mLynxContext.f55903k = new WeakReference<>(lVar);
                c cVar2 = this.mLynxContext.f55897e;
                l lVar2 = this.mIntersectionObserverManager;
                if (!cVar2.f56482a.contains(lVar2)) {
                    cVar2.f56482a.add(lVar2);
                }
                com.lynx.tasm.g.a aVar3 = this.mTheme;
                if (aVar3 != null) {
                    this.mTemplateAssembler.a(aVar3);
                }
                TemplateData templateData = this.globalProps;
                if (templateData != null) {
                    this.mTemplateAssembler.a(templateData);
                }
                float f2 = this.mFontScale;
                if (f2 != 1.0f) {
                    TemplateAssembler templateAssembler3 = this.mTemplateAssembler;
                    templateAssembler3.nativeSetFontScale(templateAssembler3.f55571a, f2);
                }
                if (!(this.mDevtool == null || (jVar = this.mLynxContext) == null)) {
                    jVar.d().longValue();
                }
                MethodCollector.o(11872);
            }

            public void addLStateListener(e eVar) {
                if (eVar != null) {
                    this.mStateListeners.add(eVar);
                }
            }

            /* access modifiers changed from: package-private */
            public boolean dispatchTouchEvent(MotionEvent motionEvent) {
                return this.mEventDispatcher.a(motionEvent, (UIGroup) null);
            }

            public void removeStateListener(e eVar) {
                if (eVar != null) {
                    this.mStateListeners.remove(eVar);
                }
            }

            public void setImageInterceptor(f fVar) {
                this.mLynxContext.f55894b = fVar;
            }

            /* access modifiers changed from: package-private */
            public class a implements b.a {

                /* renamed from: a  reason: collision with root package name */
                public TemplateData f55557a;

                /* renamed from: b  reason: collision with root package name */
                public String f55558b;

                /* renamed from: c  reason: collision with root package name */
                public Map<String, Object> f55559c;

                /* renamed from: e  reason: collision with root package name */
                private String f55561e;

                static {
                    Covode.recordClassIndex(34792);
                }

                @Override // com.lynx.tasm.provider.b.a
                public final void a(String str) {
                    b("onFailed");
                    LynxTemplateRender.this.onErrorOccurred(103, str);
                }

                private static void b(String str) {
                    if (!Thread.currentThread().equals(Looper.getMainLooper().getThread())) {
                        throw new IllegalThreadStateException("Callback " + str + "must be fired on main thread.");
                    }
                }

                @Override // com.lynx.tasm.provider.b.a
                public final void a(byte[] bArr) {
                    b("onSuccess");
                    if (bArr == null || bArr.length == 0) {
                        a("Source is null!");
                        return;
                    }
                    TemplateData templateData = this.f55557a;
                    if (templateData != null) {
                        LynxTemplateRender.this.renderTemplate(bArr, templateData);
                        return;
                    }
                    Map<String, Object> map = this.f55559c;
                    if (map != null) {
                        LynxTemplateRender.this.renderTemplate(bArr, map);
                        return;
                    }
                    LynxTemplateRender lynxTemplateRender = LynxTemplateRender.this;
                    String str = this.f55558b;
                    if (str == null) {
                        str = "";
                    }
                    lynxTemplateRender.renderTemplate(bArr, str);
                }

                public a(String str, TemplateData templateData) {
                    this.f55557a = templateData;
                    this.f55561e = str;
                }

                public a(String str, String str2) {
                    this.f55558b = str2;
                    this.f55561e = str;
                }

                public a(String str, Map<String, Object> map) {
                    this.f55559c = map;
                    this.f55561e = str;
                }
            }

            public void addLynxViewClient(o oVar) {
                if (oVar != null) {
                    this.mClient.a(oVar);
                }
            }

            public LynxBaseUI findUIByIndex(int i2) {
                return this.mLynxUIOwner.f55935e.get(Integer.valueOf(i2));
            }

            /* access modifiers changed from: package-private */
            public View findViewByIdSelector(String str) {
                LynxBaseUI findUIByIdSelector = findUIByIdSelector(str);
                if (findUIByIdSelector instanceof LynxUI) {
                    return ((LynxUI) findUIByIdSelector).mView;
                }
                return null;
            }

            /* access modifiers changed from: package-private */
            public View findViewByName(String str) {
                LynxBaseUI findUIByName = findUIByName(str);
                if (findUIByName instanceof LynxUI) {
                    return ((LynxUI) findUIByName).mView;
                }
                return null;
            }

            /* access modifiers changed from: package-private */
            public com.lynx.jsbridge.b getJSModule(String str) {
                j jVar = this.mLynxContext;
                if (jVar != null) {
                    return jVar.a(str);
                }
                return null;
            }

            public void removeLynxViewClient(o oVar) {
                p pVar;
                if (oVar != null && (pVar = this.mClient) != null) {
                    pVar.f56809a.remove(oVar);
                }
            }

            private void setUrl(String str) {
                this.mUrl = str;
                j jVar = this.mLynxContext;
                if (jVar != null) {
                    LLog.a(6, "LynxContext", "setTemplateUrl: ".concat(String.valueOf(str)));
                    jVar.f55904l = str;
                }
            }

            public long registerNativeCanvasManager(long j2) {
                MethodCollector.i(13279);
                TemplateAssembler templateAssembler = this.mTemplateAssembler;
                if (templateAssembler != null) {
                    long nativeRegisterCanvasManager = templateAssembler.nativeRegisterCanvasManager(templateAssembler.f55571a, j2);
                    MethodCollector.o(13279);
                    return nativeRegisterCanvasManager;
                }
                MethodCollector.o(13279);
                return 0;
            }

            public void resetData(TemplateData templateData) {
                MethodCollector.i(12471);
                if (prepareUpdateData(templateData)) {
                    TemplateAssembler templateAssembler = this.mTemplateAssembler;
                    templateAssembler.nativeResetDataByPreParsedData(templateAssembler.f55571a, templateData.f55591a, templateData.f55592b, templateData.f55594d);
                }
                MethodCollector.o(12471);
            }

            public void runOnTasmThread(Runnable runnable) {
                MethodCollector.i(13205);
                TemplateAssembler templateAssembler = this.mTemplateAssembler;
                if (templateAssembler == null) {
                    MethodCollector.o(13205);
                    return;
                }
                templateAssembler.nativeRunOnTasmThread(templateAssembler.f55571a, runnable);
                MethodCollector.o(13205);
            }

            /* access modifiers changed from: package-private */
            public void setGlobalProps(TemplateData templateData) {
                TemplateAssembler templateAssembler;
                if (templateData != null) {
                    this.globalProps = templateData;
                    if (checkIfEnvPrepared() && (templateAssembler = this.mTemplateAssembler) != null) {
                        templateAssembler.a(this.globalProps);
                    }
                }
            }

            public void unRegisterNativeCanvasManager(long j2) {
                MethodCollector.i(13360);
                TemplateAssembler templateAssembler = this.mTemplateAssembler;
                if (templateAssembler != null) {
                    templateAssembler.nativeUnRegisterCanvasManager(templateAssembler.f55571a, j2);
                }
                MethodCollector.o(13360);
            }

            public void updateData(TemplateData templateData) {
                MethodCollector.i(12470);
                if (prepareUpdateData(templateData)) {
                    TemplateAssembler templateAssembler = this.mTemplateAssembler;
                    templateAssembler.nativeUpdateDataByPreParsedData(templateAssembler.f55571a, templateData.f55591a, templateData.f55592b, templateData.f55594d);
                }
                MethodCollector.o(12470);
            }

            /* access modifiers changed from: package-private */
            public void updateFontScale(float f2) {
                TemplateAssembler templateAssembler;
                MethodCollector.i(12835);
                if (!checkIfEnvPrepared() || (templateAssembler = this.mTemplateAssembler) == null) {
                    MethodCollector.o(12835);
                    return;
                }
                templateAssembler.nativeUpdateFontScale(templateAssembler.f55571a, f2);
                MethodCollector.o(12835);
            }

            private void onEnterBackground(boolean z) {
                MethodCollector.i(13035);
                TemplateAssembler templateAssembler = this.mTemplateAssembler;
                if (templateAssembler != null && (z || templateAssembler.c())) {
                    templateAssembler.nativeOnEnterBackground(templateAssembler.f55571a);
                }
                Iterator<e> it = this.mStateListeners.iterator();
                while (it.hasNext()) {
                    it.next();
                }
                MethodCollector.o(13035);
            }

            private void onEnterForeground(boolean z) {
                MethodCollector.i(12939);
                TemplateAssembler templateAssembler = this.mTemplateAssembler;
                if (templateAssembler != null && (z || templateAssembler.c())) {
                    templateAssembler.nativeOnEnterForeground(templateAssembler.f55571a);
                }
                Iterator<e> it = this.mStateListeners.iterator();
                while (it.hasNext()) {
                    it.next();
                }
                MethodCollector.o(12939);
            }

            /* access modifiers changed from: package-private */
            public boolean attach(LynxView lynxView) {
                if (this.mLynxView != null) {
                    LLog.a(5, "Lynx", "already attached " + lynxView.toString());
                    return false;
                }
                this.mLynxView = lynxView;
                lynxView.removeAllViews();
                k kVar = this.mViewLayoutTick;
                if (kVar != null) {
                    kVar.f55974a = lynxView;
                }
                UIBody uIBody = this.mLynxUIOwner.f55932b;
                uIBody.f56067a = lynxView;
                uIBody.initialize();
                com.lynx.devtoolwrapper.d dVar = this.mDevtool;
                if (dVar == null) {
                    return true;
                }
                dVar.f55443d = new WeakReference<>(lynxView);
                return true;
            }

            public void dispatchLoadSuccess(int i2) {
                LLog.a(4, "LynxTemplateRender", "dispatchLoadSuccess templateSize in " + toString());
                if (this.mClient != null) {
                    TraceEvent.a(0, "Client.onLoadSuccess");
                    this.mClient.a();
                    TraceEvent.b(0, "Client.onLoadSuccess");
                    TraceEvent.a(0, "Client.onReportLynxConfigInfo");
                    this.mClient.a(getLynxConfigInfo());
                    TraceEvent.b(0, "Client.onReportLynxConfigInfo");
                }
            }

            public LynxBaseUI findUIByIdSelector(String str) {
                q qVar = this.mLynxUIOwner;
                for (Integer num : qVar.f55935e.keySet()) {
                    LynxBaseUI lynxBaseUI = qVar.f55935e.get(num);
                    if (lynxBaseUI != null && str.equals(lynxBaseUI.mIdSelector)) {
                        return lynxBaseUI;
                    }
                }
                return null;
            }

            public LynxBaseUI findUIByName(String str) {
                q qVar = this.mLynxUIOwner;
                for (Integer num : qVar.f55935e.keySet()) {
                    LynxBaseUI lynxBaseUI = qVar.f55935e.get(num);
                    if (lynxBaseUI != null && str.equals(lynxBaseUI.mName)) {
                        return lynxBaseUI;
                    }
                }
                return null;
            }

            public void getCurrentData(k kVar) {
                TemplateAssembler templateAssembler;
                MethodCollector.i(12473);
                if (!checkIfEnvPrepared() || (templateAssembler = this.mTemplateAssembler) == null) {
                    MethodCollector.o(12473);
                    return;
                }
                int incrementAndGet = templateAssembler.f55582l.incrementAndGet();
                templateAssembler.f55583m.put(incrementAndGet, kVar);
                templateAssembler.nativeGetDataAsync(templateAssembler.f55571a, incrementAndGet);
                MethodCollector.o(12473);
            }

            /* access modifiers changed from: package-private */
            public void setGlobalProps(Map<String, Object> map) {
                TraceEvent.a(0, "TemplateRender.setGlobalProps");
                if (checkIfEnvPrepared() && this.mTemplateAssembler != null) {
                    setGlobalProps(TemplateData.a(map));
                }
                TraceEvent.b(0, "TemplateRender.setGlobalProps");
            }

            public void setTheme(com.lynx.tasm.g.a aVar) {
                if (aVar != null) {
                    com.lynx.tasm.g.a aVar2 = this.mTheme;
                    if (aVar2 == null) {
                        this.mTheme = aVar;
                    } else {
                        aVar2.a(aVar);
                    }
                    if (checkIfEnvPrepared() && this.mTemplateAssembler != null) {
                        this.mWillContentSizeChange = true;
                        this.mPaintingContext.f55780a.b();
                        requestLayoutWhenSafepointEnable();
                        this.mTemplateAssembler.a(aVar);
                    }
                }
            }

            private void dispatchOnPageStart(String str) {
                LLog.a(4, "LynxTemplateRender", "dispatchOnPageStart url " + str + " in " + toString());
                if (!this.mHasPageStart && this.mClient != null) {
                    this.mHasPageStart = true;
                    TraceEvent.a("StartLoad", "#4caf50");
                    TraceEvent.a(0, "Client.onPageStart");
                    this.mClient.a(str);
                    TraceEvent.b(0, "Client.onPageStart");
                }
            }

            private void init(Context context) {
                this.reload = false;
                this.mHasPageStart = false;
                this.mHasDestory = false;
                this.mLynxContext.f55894b = this.mClient;
                this.mLynxContext.f55905m = this.mClient;
                l lVar = this.mGroup;
                if (lVar != null && lVar.f56752d) {
                    com.lynx.tasm.behavior.ui.b.b bVar = new com.lynx.tasm.behavior.ui.b.b();
                    this.mKryptonHelper = bVar;
                    this.mLynxContext.v = new WeakReference<>(bVar);
                }
                q qVar = new q(this.mLynxContext, this.mBuilder.f56756b, this.mLynxView);
                this.mLynxUIOwner = qVar;
                this.mLynxContext.f55902j = new WeakReference<>(qVar);
                w wVar = new w(this.mLynxUIOwner);
                this.mEventDispatcher = wVar;
                this.mLynxContext.f55898f = wVar;
                this.mDevtool = new com.lynx.devtoolwrapper.d(this.mLynxView, this);
                createTemplateAssembler();
            }

            private boolean prepareUpdateData(TemplateData templateData) {
                if (!checkIfEnvPrepared() || this.mTemplateAssembler == null) {
                    return false;
                }
                if (templateData == null) {
                    LLog.a(6, "LynxTemplateRender", "updateData with null TemplateData");
                    return false;
                }
                templateData.b();
                if (templateData.f55591a == 0) {
                    LLog.a(6, "LynxTemplateRender", "updateData with TemplateData after flush is nullptr");
                    return false;
                }
                com.lynx.devtoolwrapper.d dVar = this.mDevtool;
                if (!(dVar == null || dVar.f55442c == null)) {
                    dVar.f55442c.f55768d.f55773c = templateData;
                }
                this.mWillContentSizeChange = true;
                this.mPaintingContext.f55780a.b();
                requestLayoutWhenSafepointEnable();
                return true;
            }

            private String[] processUrl(String str) {
                ArrayList arrayList = new ArrayList();
                String[] split = str.split("=|&");
                String str2 = "";
                int i2 = 0;
                while (true) {
                    int i3 = i2 + 1;
                    if (i3 < split.length) {
                        if (split[i2].equalsIgnoreCase("compile_path") || split[i2].equalsIgnoreCase("compilePath")) {
                            str = split[i3];
                        } else if (split[i2].equalsIgnoreCase("post_url") || split[i2].equalsIgnoreCase("postUrl")) {
                            str2 = split[i3];
                        }
                        i2 += 2;
                    } else {
                        arrayList.add(str);
                        arrayList.add(str2);
                        return (String[]) arrayList.toArray(new String[arrayList.size()]);
                    }
                }
            }

            public void onErrorOccurred(int i2, String str) {
                onErrorOccurred(-3, i2, str, null);
            }

            public void onNativeErrorOccurred(int i2, String str) {
                onErrorOccurred(-1, i2, str, null);
            }

            public void renderTemplateUrl(String str, TemplateData templateData) {
                renderTemplateUrlInternal(str, new a(str, templateData));
            }

            /* access modifiers changed from: package-private */
            public void updateData(String str, String str2) {
                TemplateData a2 = TemplateData.a(str);
                a2.f55592b = str2;
                a2.f55594d = true;
                updateData(a2);
            }

            public void hotModuleReplace(String str, final String str2) {
                if (this.mBuilder.f56755a != null) {
                    this.mBuilder.f56755a.a(str, new b.a() {
                        /* class com.lynx.tasm.LynxTemplateRender.AnonymousClass6 */

                        static {
                            Covode.recordClassIndex(34791);
                        }

                        @Override // com.lynx.tasm.provider.b.a
                        public final void a(String str) {
                            LLog.a(6, "LynxTemplateRender", "failed to load template: ".concat(String.valueOf(str)));
                        }

                        @Override // com.lynx.tasm.provider.b.a
                        public final void a(byte[] bArr) {
                            MethodCollector.i(12405);
                            if (LynxTemplateRender.this.mTemplateAssembler != null) {
                                TemplateAssembler templateAssembler = LynxTemplateRender.this.mTemplateAssembler;
                                templateAssembler.nativeHotModuleReplace(templateAssembler.f55571a, bArr, str2);
                            }
                            MethodCollector.o(12405);
                        }
                    });
                }
            }

            /* access modifiers changed from: package-private */
            public void renderTemplateUrl(String str, String str2) {
                renderTemplateUrlInternal(str, new a(str, str2));
            }

            LynxTemplateRender(Context context, m mVar) {
                init(context, null, mVar);
            }

            /* access modifiers changed from: package-private */
            public void renderTemplateUrl(String str, Map<String, Object> map) {
                renderTemplateUrlInternal(str, new a(str, map));
            }

            /* access modifiers changed from: package-private */
            public void sendGlobalEvent(String str, JavaOnlyArray javaOnlyArray) {
                j jVar;
                if (!checkIfEnvPrepared() || (jVar = this.mLynxContext) == null) {
                    LLog.a(6, "LynxTemplateRender", "sendGlobalEvent error, can't get GlobalEventEmitter in " + toString());
                } else {
                    jVar.a(str, javaOnlyArray);
                }
            }

            /* access modifiers changed from: package-private */
            public void updateData(Map<String, Object> map, String str) {
                TemplateData a2 = TemplateData.a(map);
                a2.f55592b = str;
                a2.f55594d = true;
                updateData(a2);
            }

            public void updateScreenMetrics(int i2, int i3) {
                MethodCollector.i(11703);
                if (!(i2 == this.mLynxContext.p.widthPixels && i3 == this.mLynxContext.p.heightPixels)) {
                    this.mShouldUpdateViewport = true;
                    j jVar = this.mLynxContext;
                    jVar.p.widthPixels = i2;
                    jVar.p.heightPixels = i3;
                    TemplateAssembler templateAssembler = this.mTemplateAssembler;
                    templateAssembler.nativeUpdateScreenMetrics(templateAssembler.f55571a, i2, i3, 1.0f);
                    if (this.mDevtool != null) {
                        float f2 = this.mLynxContext.p.density;
                    }
                }
                MethodCollector.o(11703);
            }

            private void dispatchError(int i2, j jVar) {
                TraceEvent.a(0, "TemplateRender.dispatchError");
                int i3 = jVar.f56744a;
                if (i3 == 100 || i3 == 103) {
                    this.mClient.b(jVar.a());
                } else {
                    this.mClient.c(jVar.a());
                }
                this.mClient.a(jVar);
                if (i3 == 201) {
                    this.mClient.b(jVar);
                } else if (i2 == -1) {
                    this.mClient.d(jVar);
                } else {
                    this.mClient.c(jVar);
                }
                TraceEvent.b(0, "TemplateRender.dispatchError");
            }

            private void renderTemplateUrlInternal(String str, a aVar) {
                if (!checkIfEnvPrepared()) {
                    onErrorOccurred(100, "LynxEnv has not been prepared successfully!");
                    return;
                }
                setUrl(processUrl(str)[0]);
                com.lynx.devtoolwrapper.d dVar = this.mDevtool;
                if (dVar != null) {
                    String str2 = this.mUrl;
                    TemplateData templateData = aVar.f55557a;
                    Map<String, Object> map = aVar.f55559c;
                    String str3 = aVar.f55558b;
                    if (dVar.f55442c != null) {
                        i iVar = dVar.f55442c;
                        if (templateData != null) {
                            iVar.a(str2, templateData);
                        } else if (map != null) {
                            iVar.a(str2, TemplateData.a(map));
                        } else if (str3 != null) {
                            iVar.a(str2, TemplateData.a(str3));
                        } else {
                            iVar.a(str2, null);
                        }
                    }
                }
                if (this.mBuilder.f56755a == null || TextUtils.isEmpty(str)) {
                    throw new IllegalArgumentException("LynxTemplateRender template url is null or TemplateProvider is not init");
                }
                dispatchOnPageStart(this.mUrl);
                this.mBuilder.f56755a.a(this.mUrl, aVar);
            }

            public void renderTemplate(final byte[] bArr, final String str) {
                MethodCollector.i(12333);
                if ((!this.mAsyncRender || this.reload) && !m.a()) {
                    m.a(new Runnable() {
                        /* class com.lynx.tasm.LynxTemplateRender.AnonymousClass5 */

                        static {
                            Covode.recordClassIndex(34790);
                        }

                        public final void run() {
                            LynxTemplateRender.this.renderTemplate(bArr, str);
                        }
                    });
                    MethodCollector.o(12333);
                } else if (!checkIfEnvPrepared()) {
                    onErrorOccurred(100, "LynxEnv has not been prepared successfully!");
                    MethodCollector.o(12333);
                } else {
                    this.mWillContentSizeChange = true;
                    this.mPaintingContext.f55780a.b();
                    reloadAndInit();
                    TemplateAssembler templateAssembler = this.mTemplateAssembler;
                    if (templateAssembler != null) {
                        templateAssembler.f55573c = this.mClient;
                        dispatchOnPageStart(this.mUrl);
                        TemplateAssembler templateAssembler2 = this.mTemplateAssembler;
                        String templateUrl = getTemplateUrl();
                        d dVar = new d(this.mTemplateAssembler);
                        if (bArr == null) {
                            LLog.a(6, "TA", "Load Template with null template");
                            MethodCollector.o(12333);
                            return;
                        }
                        templateAssembler2.f55574d = templateUrl;
                        templateAssembler2.f55572b = dVar;
                        templateAssembler2.f55576f = bArr.length;
                        templateAssembler2.nativeLoadTemplateByJson(templateAssembler2.f55571a, templateAssembler2.f55574d, bArr, str);
                    }
                    MethodCollector.o(12333);
                }
            }

            /* access modifiers changed from: package-private */
            public void sendGlobalEventToLepus(String str, List<Object> list) {
                TemplateAssembler templateAssembler;
                int position;
                MethodCollector.i(12030);
                if (!checkIfEnvPrepared() || (templateAssembler = this.mTemplateAssembler) == null) {
                    LLog.a(6, "LynxTemplateRender", "sendGlobalEventToLepus error, Env not prepared or mTemplateAssembler is null in " + toString());
                    MethodCollector.o(12030);
                    return;
                }
                ByteBuffer a2 = com.lynx.tasm.b.a.f55742a.a(list);
                long j2 = templateAssembler.f55571a;
                if (a2 == null) {
                    position = 0;
                } else {
                    position = a2.position();
                }
                templateAssembler.nativeSendGlobalEventToLepus(j2, str, a2, position);
                MethodCollector.o(12030);
            }

            /* access modifiers changed from: package-private */
            public void updateViewport(int i2, int i3) {
                MethodCollector.i(12712);
                if (!checkIfEnvPrepared() || this.mTemplateAssembler == null) {
                    MethodCollector.o(12712);
                } else if (this.mPreWidthMeasureSpec == i2 && this.mPreHeightMeasureSpec == i3 && !this.mShouldUpdateViewport) {
                    MethodCollector.o(12712);
                } else {
                    if (this.mShouldUpdateViewport) {
                        this.mShouldUpdateViewport = false;
                    }
                    int fromMeasureSpec = e.fromMeasureSpec(i2);
                    int size = View.MeasureSpec.getSize(i2);
                    int fromMeasureSpec2 = e.fromMeasureSpec(i3);
                    int size2 = View.MeasureSpec.getSize(i3);
                    TemplateAssembler templateAssembler = this.mTemplateAssembler;
                    templateAssembler.nativeUpdateViewport(templateAssembler.f55571a, size, fromMeasureSpec, size2, fromMeasureSpec2);
                    this.mPreWidthMeasureSpec = i2;
                    this.mPreHeightMeasureSpec = i3;
                    MethodCollector.o(12712);
                }
            }

            /* access modifiers changed from: package-private */
            public void onMeasure(int i2, int i3) {
                long j2;
                int i4;
                int i5;
                TemplateAssembler templateAssembler;
                MethodCollector.i(12595);
                if (this.mFirstMeasureTime == -1) {
                    j2 = System.currentTimeMillis();
                } else {
                    j2 = 0;
                }
                TraceEvent.a(1, "Platform.onMeasure");
                if (this.mBuilder.n) {
                    syncFlush();
                }
                updateViewport(i2, i3);
                if (this.mThreadStrategyForRendering == r.PART_ON_LAYOUT && (templateAssembler = this.mTemplateAssembler) != null && !this.mFirstScreen && this.mWillContentSizeChange) {
                    templateAssembler.nativeSyncFetchLayoutResult(templateAssembler.f55571a);
                    this.mFirstScreen = true;
                    this.mWillContentSizeChange = false;
                }
                k kVar = this.mViewLayoutTick;
                if (kVar != null) {
                    if (kVar.f55975b != null) {
                        kVar.f55975b.run();
                    }
                    kVar.f55975b = null;
                }
                q qVar = this.mLynxUIOwner;
                if (qVar.f55933c.q) {
                    for (LynxBaseUI lynxBaseUI : qVar.f55932b.getChildren()) {
                        lynxBaseUI.measure();
                    }
                } else {
                    qVar.f55932b.measureChildren();
                }
                int mode = View.MeasureSpec.getMode(i2);
                if (mode == Integer.MIN_VALUE || mode == 0) {
                    i4 = this.mLynxUIOwner.f55932b.getWidth();
                } else {
                    i4 = View.MeasureSpec.getSize(i2);
                }
                int mode2 = View.MeasureSpec.getMode(i3);
                if (mode2 == Integer.MIN_VALUE || mode2 == 0) {
                    i5 = this.mLynxUIOwner.f55932b.getHeight();
                } else {
                    i5 = View.MeasureSpec.getSize(i3);
                }
                this.mLynxView.innerSetMeasuredDimension(i4, i5);
                TraceEvent.b(1, "Platform.onMeasure");
                if (this.mFirstMeasureTime == -1) {
                    this.mFirstMeasureTime = System.currentTimeMillis() - j2;
                }
                MethodCollector.o(12595);
            }

            /* access modifiers changed from: package-private */
            /* JADX WARNING: Code restructure failed: missing block: B:21:0x007c, code lost:
                if (r15 == 0) goto L_0x007e;
             */
            /* Code decompiled incorrectly, please refer to instructions dump. */
            public void renderTemplate(final byte[] r20, final com.lynx.tasm.TemplateData r21) {
                /*
                // Method dump skipped, instructions count: 157
                */
                throw new UnsupportedOperationException("Method not decompiled: com.lynx.tasm.LynxTemplateRender.renderTemplate(byte[], com.lynx.tasm.TemplateData):void");
            }

            /* access modifiers changed from: package-private */
            public void renderTemplate(final byte[] bArr, final Map<String, Object> map) {
                int position;
                MethodCollector.i(12033);
                if ((!this.mAsyncRender || this.reload) && !m.a()) {
                    m.a(new Runnable() {
                        /* class com.lynx.tasm.LynxTemplateRender.AnonymousClass3 */

                        static {
                            Covode.recordClassIndex(34788);
                        }

                        public final void run() {
                            LynxTemplateRender.this.renderTemplate(bArr, map);
                        }
                    });
                    MethodCollector.o(12033);
                } else if (!checkIfEnvPrepared()) {
                    onErrorOccurred(100, "LynxEnv has not been prepared successfully!");
                    MethodCollector.o(12033);
                } else {
                    this.mWillContentSizeChange = true;
                    this.mPaintingContext.f55780a.b();
                    reloadAndInit();
                    TemplateAssembler templateAssembler = this.mTemplateAssembler;
                    if (templateAssembler != null) {
                        templateAssembler.f55573c = this.mClient;
                        dispatchOnPageStart(this.mUrl);
                        TemplateAssembler templateAssembler2 = this.mTemplateAssembler;
                        String templateUrl = getTemplateUrl();
                        d dVar = new d(this.mTemplateAssembler);
                        if (bArr == null) {
                            LLog.a(6, "TA", "Load Template with null template");
                            MethodCollector.o(12033);
                            return;
                        }
                        ByteBuffer a2 = com.lynx.tasm.b.a.f55742a.a(map);
                        templateAssembler2.f55574d = templateUrl;
                        templateAssembler2.f55572b = dVar;
                        templateAssembler2.f55576f = bArr.length;
                        long j2 = templateAssembler2.f55571a;
                        String str = templateAssembler2.f55574d;
                        if (a2 == null) {
                            position = 0;
                        } else {
                            position = a2.position();
                        }
                        templateAssembler2.nativeLoadTemplate(j2, str, bArr, a2, position);
                    }
                    MethodCollector.o(12033);
                }
            }

            public void renderTemplateWithBaseUrl(byte[] bArr, TemplateData templateData, String str) {
                com.lynx.devtoolwrapper.d dVar = this.mDevtool;
                if (dVar != null) {
                    dVar.a(bArr, templateData, str);
                }
                setUrl(str);
                renderTemplate(bArr, templateData);
            }

            LynxTemplateRender(Context context, LynxView lynxView, n nVar) {
                init(context, lynxView, nVar);
            }

            public void loadComponent(String str, byte[] bArr, int i2) {
                MethodCollector.i(12334);
                TemplateAssembler templateAssembler = this.mTemplateAssembler;
                if (templateAssembler != null) {
                    templateAssembler.nativeLoadComponent(templateAssembler.f55571a, str, bArr, i2);
                }
                MethodCollector.o(12334);
            }

            /* access modifiers changed from: package-private */
            public void renderTemplateWithBaseUrl(byte[] bArr, String str, String str2) {
                TemplateData a2 = TemplateData.a(str);
                com.lynx.devtoolwrapper.d dVar = this.mDevtool;
                if (dVar != null) {
                    dVar.a(bArr, a2, str2);
                }
                setUrl(str2);
                renderTemplate(bArr, a2);
            }

            /* access modifiers changed from: package-private */
            public void renderTemplateWithBaseUrl(byte[] bArr, Map<String, Object> map, String str) {
                TemplateData a2 = TemplateData.a(map);
                com.lynx.devtoolwrapper.d dVar = this.mDevtool;
                if (dVar != null) {
                    dVar.a(bArr, a2, str);
                }
                setUrl(str);
                renderTemplate(bArr, a2);
            }

            /* access modifiers changed from: package-private */
            public void init(Context context, LynxView lynxView, n nVar) {
                boolean z;
                boolean z2;
                boolean z3;
                MethodCollector.i(11537);
                TraceEvent.a(0, "TemplateRender.init");
                this.mInitStart = System.currentTimeMillis();
                this.mContext = context;
                this.mLynxView = lynxView;
                this.mGroup = nVar.f56758d;
                r rVar = nVar.p;
                this.mThreadStrategyForRendering = rVar;
                boolean z4 = false;
                if (rVar == r.MULTI_THREADS) {
                    z = true;
                } else {
                    z = false;
                }
                this.mAsyncRender = z;
                this.mBuilder = nVar;
                this.mHasEnvPrepared = LynxEnv.b().f();
                this.mFontScale = nVar.u;
                Float f2 = nVar.f56761g;
                DisplayMetrics displayMetrics = context.getResources().getDisplayMetrics();
                if (DisplayMetricsHolder.f57023b == null || (displayMetrics.widthPixels == DisplayMetricsHolder.f57023b.widthPixels && displayMetrics.heightPixels == DisplayMetricsHolder.f57023b.heightPixels)) {
                    z2 = false;
                } else {
                    z2 = true;
                }
                if (f2 != null) {
                    displayMetrics.density = f2.floatValue();
                }
                if (DisplayMetricsHolder.f57022a == null) {
                    DisplayMetricsHolder.f57022a = new DisplayMetrics();
                }
                DisplayMetricsHolder.f57022a.setTo(displayMetrics);
                int i2 = context.getResources().getConfiguration().orientation;
                if (DisplayMetricsHolder.f57024c != i2) {
                    z3 = true;
                } else {
                    z3 = false;
                }
                DisplayMetricsHolder.f57024c = i2;
                if (DisplayMetricsHolder.f57025d != displayMetrics.scaledDensity) {
                    z4 = true;
                }
                DisplayMetricsHolder.f57025d = displayMetrics.scaledDensity;
                if (DisplayMetricsHolder.a() == null || z3 || z4 || z2 || !DisplayMetricsHolder.f57026e) {
                    DisplayMetrics a2 = DisplayMetricsHolder.a(context);
                    if (f2 != null) {
                        a2.density = f2.floatValue();
                    }
                    boolean f3 = LynxEnv.b().f();
                    synchronized (DisplayMetricsHolder.class) {
                        try {
                            DisplayMetricsHolder.f57023b = a2;
                            if (f3) {
                                DisplayMetricsHolder.f57026e = true;
                                DisplayMetricsHolder.nativeUpdateDevice(a2.widthPixels, a2.heightPixels, a2.density, String.valueOf(Build.VERSION.SDK_INT));
                            }
                        } catch (Throwable th) {
                            MethodCollector.o(11537);
                            throw th;
                        }
                    }
                }
                DisplayMetrics a3 = DisplayMetricsHolder.a();
                if (!(nVar.s == -1 || nVar.t == -1)) {
                    a3.widthPixels = nVar.s;
                    a3.heightPixels = nVar.t;
                }
                AnonymousClass1 r3 = new j(context, a3) {
                    /* class com.lynx.tasm.LynxTemplateRender.AnonymousClass1 */

                    static {
                        Covode.recordClassIndex(34786);
                    }

                    @Override // com.lynx.tasm.behavior.e, com.lynx.tasm.behavior.j
                    public final void a(Exception exc) {
                        LynxTemplateRender.this.onErrorOccurred(-3, 601, null, exc);
                    }
                };
                this.mLynxContext = r3;
                r3.q = com.lynx.a.f55042b.booleanValue();
                init(context);
                if (!(this.mLynxContext.q && e.fromMeasureSpec(nVar.q) == 0 && e.fromMeasureSpec(nVar.r) == 0)) {
                    updateViewport(nVar.q, nVar.r);
                }
                this.mClient.a(LynxEnv.b().o);
                this.mClient.a(new c());
                CanvasProvider canvasProvider = LynxEnv.b().q;
                if (canvasProvider != null) {
                    canvasProvider.onLynxViewFrameCallbackInit(context);
                }
                this.mInitEnd = System.currentTimeMillis();
                this.mStateListeners = new ArrayList();
                TraceEvent.b(0, "TemplateRender.init");
                MethodCollector.o(11537);
            }

            public void onErrorOccurred(int i2, int i3, String str, Throwable th) {
                String str2 = "error";
                if (TextUtils.isEmpty(str)) {
                    if (th != null) {
                        str2 = "throwable";
                        str = Log.getStackTraceString(th);
                        if (str.length() > 300) {
                            str = str.substring(0, 300);
                        }
                    } else {
                        str = "Unknown error";
                    }
                }
                JSONObject jSONObject = new JSONObject();
                try {
                    jSONObject.put("url", this.mUrl);
                    jSONObject.put(str2, str);
                    TemplateAssembler templateAssembler = this.mTemplateAssembler;
                    if (templateAssembler != null) {
                        jSONObject.put("card_version", templateAssembler.a());
                    }
                    LynxEnv.b();
                    jSONObject.put("sdk", "2.1.5-rc.33-cxxshared");
                } catch (Throwable unused) {
                }
                dispatchError(i2, new j(jSONObject, i3));
                LLog.a(6, "LynxTemplateRender", "LynxTemplateRender " + toString() + ": onErrorOccurred type " + i2 + ",errCode:" + i3 + ",detail:" + jSONObject.toString());
                showErrorMessage(str);
            }

            /* access modifiers changed from: package-private */
            public void onLayout(boolean z, int i2, int i3, int i4, int i5) {
                TraceEvent.a(1, "Platform.onLayout");
                q qVar = this.mLynxUIOwner;
                if (qVar.f55933c.q) {
                    for (LynxBaseUI lynxBaseUI : qVar.f55932b.getChildren()) {
                        lynxBaseUI.layout();
                    }
                } else {
                    qVar.f55932b.layoutChildren();
                }
                if (qVar.f55932b.mContext.f55897e != null) {
                    qVar.f55932b.mContext.f55897e.a(c.EnumC1267c.kLynxEventTypeLayoutEvent, null);
                }
                TraceEvent.b(1, "Platform.onLayout");
            }
        }
