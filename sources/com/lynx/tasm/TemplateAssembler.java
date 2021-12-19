package com.lynx.tasm;

import android.os.Bundle;
import android.os.Handler;
import android.os.Looper;
import android.text.TextUtils;
import android.util.DisplayMetrics;
import android.util.SparseArray;
import com.bytedance.covode.number.Covode;
import com.bytedance.frameworks.apm.trace.MethodCollector;
import com.lynx.jsbridge.LynxModuleManager;
import com.lynx.react.bridge.JavaOnlyMap;
import com.lynx.react.bridge.ReadableMap;
import com.lynx.tasm.base.LLog;
import com.lynx.tasm.behavior.LayoutContext;
import com.lynx.tasm.behavior.PaintingContext;
import com.lynx.tasm.behavior.j;
import com.lynx.tasm.c.b;
import com.lynx.tasm.component.DynamicComponentLoader;
import com.lynx.tasm.core.ExternalSourceLoader;
import com.lynx.tasm.core.JSProxy;
import com.lynx.tasm.core.ResourceLoader;
import com.lynx.tasm.h;
import com.lynx.tasm.provider.c;
import com.lynx.tasm.provider.g;
import com.lynx.tasm.provider.i;
import com.lynx.tasm.utils.m;
import java.lang.ref.WeakReference;
import java.nio.ByteBuffer;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Locale;
import java.util.Map;
import java.util.concurrent.atomic.AtomicInteger;

public class TemplateAssembler {

    /* renamed from: a  reason: collision with root package name */
    public long f55571a;

    /* renamed from: b  reason: collision with root package name */
    a f55572b;

    /* renamed from: c  reason: collision with root package name */
    public o f55573c;

    /* renamed from: d  reason: collision with root package name */
    String f55574d;

    /* renamed from: e  reason: collision with root package name */
    public JSProxy f55575e;

    /* renamed from: f  reason: collision with root package name */
    public int f55576f;

    /* renamed from: g  reason: collision with root package name */
    public volatile boolean f55577g;

    /* renamed from: h  reason: collision with root package name */
    l f55578h;

    /* renamed from: i  reason: collision with root package name */
    public WeakReference<j> f55579i;

    /* renamed from: j  reason: collision with root package name */
    public q f55580j;

    /* renamed from: k  reason: collision with root package name */
    public r f55581k;

    /* renamed from: l  reason: collision with root package name */
    AtomicInteger f55582l = new AtomicInteger(0);

    /* renamed from: m  reason: collision with root package name */
    SparseArray<k> f55583m = new SparseArray<>();
    private PaintingContext n;
    private LayoutContext o;
    private boolean p;
    private boolean q;
    private DynamicComponentLoader r;

    /* access modifiers changed from: package-private */
    public interface a {
        static {
            Covode.recordClassIndex(34806);
        }

        String a(String str);

        void a();

        void a(int i2, String str);

        void a(LynxPerfMetric lynxPerfMetric);

        void a(com.lynx.tasm.g.a aVar);

        void a(q qVar);

        void a(String str, String str2, int i2);

        void a(HashMap<String, Object> hashMap);

        void b();

        void b(LynxPerfMetric lynxPerfMetric);
    }

    static {
        Covode.recordClassIndex(34801);
    }

    private native long nativeCreate(Object obj, Object obj2, Object obj3, int i2, boolean z, boolean z2, int i3, int i4, String str);

    private native void nativeDestroy(long j2);

    private native void nativeSendCustomEvent(long j2, String str, int i2, ByteBuffer byteBuffer, int i3, String str2);

    private native void nativeSetGlobalProps(long j2, long j3);

    private native void nativeUpdateConfig(long j2, ByteBuffer byteBuffer, int i2);

    /* access modifiers changed from: package-private */
    public native JavaOnlyMap nativeGetAllJsSource(long j2);

    /* access modifiers changed from: package-private */
    public native void nativeGetDataAsync(long j2, int i2);

    public native JavaOnlyMap nativeGetListPlatformInfo(long j2, int i2);

    /* access modifiers changed from: package-private */
    public native void nativeHotModuleReplace(long j2, byte[] bArr, String str);

    /* access modifiers changed from: package-private */
    public native void nativeInitRuntime(long j2, ResourceLoader resourceLoader, ExternalSourceLoader externalSourceLoader, LynxModuleManager lynxModuleManager, String str, String[] strArr, boolean z, boolean z2, boolean z3, boolean z4);

    /* access modifiers changed from: package-private */
    public native void nativeLoadComponent(long j2, String str, byte[] bArr, int i2);

    /* access modifiers changed from: package-private */
    public native void nativeLoadTemplate(long j2, String str, byte[] bArr, ByteBuffer byteBuffer, int i2);

    /* access modifiers changed from: package-private */
    public native void nativeLoadTemplateByJson(long j2, String str, byte[] bArr, String str2);

    /* access modifiers changed from: package-private */
    public native void nativeLoadTemplateByPreParsedData(long j2, String str, byte[] bArr, long j3, boolean z, String str2);

    public native int nativeObtainChild(long j2, int i2, int i3, long j3);

    /* access modifiers changed from: package-private */
    public native void nativeOnEnterBackground(long j2);

    /* access modifiers changed from: package-private */
    public native void nativeOnEnterForeground(long j2);

    /* access modifiers changed from: package-private */
    public native void nativeOnFirstScreen(long j2);

    public native void nativeRecycleChild(long j2, int i2, int i3);

    /* access modifiers changed from: package-private */
    public native long nativeRegisterCanvasManager(long j2, long j3);

    public native void nativeRemoveChild(long j2, int i2, int i3);

    public native void nativeRenderChild(long j2, int i2, int i3, long j3);

    /* access modifiers changed from: package-private */
    public native void nativeResetDataByPreParsedData(long j2, long j3, String str, boolean z);

    /* access modifiers changed from: package-private */
    public native void nativeRunOnTasmThread(long j2, Runnable runnable);

    /* access modifiers changed from: package-private */
    public native void nativeSendGlobalEventToLepus(long j2, String str, ByteBuffer byteBuffer, int i2);

    /* access modifiers changed from: package-private */
    public native void nativeSendInternalEvent(long j2, int i2, int i3, ByteBuffer byteBuffer, int i4);

    /* access modifiers changed from: package-private */
    public native void nativeSendTouchEvent(long j2, String str, int i2, float f2, float f3, float f4, float f5, float f6, float f7);

    /* access modifiers changed from: package-private */
    public native void nativeSetFontScale(long j2, float f2);

    /* access modifiers changed from: package-private */
    public native void nativeSyncFetchLayoutResult(long j2);

    /* access modifiers changed from: package-private */
    public native void nativeUnRegisterCanvasManager(long j2, long j3);

    public native void nativeUpdateChild(long j2, int i2, int i3, int i4, long j3);

    /* access modifiers changed from: package-private */
    public native void nativeUpdateDataByPreParsedData(long j2, long j3, String str, boolean z);

    /* access modifiers changed from: package-private */
    public native void nativeUpdateFontScale(long j2, float f2);

    public native void nativeUpdateI18nResource(long j2, String str, String str2, int i2);

    /* access modifiers changed from: package-private */
    public native void nativeUpdateScreenMetrics(long j2, int i2, int i3, float f2);

    /* access modifiers changed from: package-private */
    public native void nativeUpdateViewport(long j2, int i2, int i3, int i4, int i5);

    private long getPtr() {
        return this.f55571a;
    }

    private void dispatchOnLoaded() {
        a aVar = this.f55572b;
        if (aVar != null) {
            aVar.a();
        }
    }

    public void onRuntimeReady() {
        a aVar = this.f55572b;
        if (aVar != null) {
            aVar.b();
        }
    }

    public final String a() {
        q qVar = this.f55580j;
        if (qVar != null) {
            return qVar.f56829d;
        }
        LLog.a(6, "TemplateAssembler", "PageConfig is null.GetPageVersion get default error;");
        return "error";
    }

    /* access modifiers changed from: package-private */
    public final boolean c() {
        if (!this.p) {
            return false;
        }
        q qVar = this.f55580j;
        if (qVar != null) {
            return qVar.f56826a;
        }
        LLog.a(6, "TemplateAssembler", "PageConfig is null.GetAutoExpose get default true!");
        return true;
    }

    /* access modifiers changed from: package-private */
    public final void b() {
        MethodCollector.i(12764);
        this.o.f55779b = true;
        this.n.f55780a.f55823b = true;
        this.f55577g = true;
        nativeDestroy(this.f55571a);
        new Handler(Looper.getMainLooper()).post(new Runnable() {
            /* class com.lynx.tasm.TemplateAssembler.AnonymousClass1 */

            static {
                Covode.recordClassIndex(34802);
            }

            public final void run() {
                new Handler(Looper.getMainLooper()).post(new Runnable() {
                    /* class com.lynx.tasm.TemplateAssembler.AnonymousClass1.AnonymousClass1 */

                    static {
                        Covode.recordClassIndex(34803);
                    }

                    public final void run() {
                        if (TemplateAssembler.this.f55573c != null) {
                            TemplateAssembler.this.f55573c.e();
                        }
                    }
                });
            }
        });
        this.f55575e.a();
        this.f55571a = 0;
        MethodCollector.o(12764);
    }

    /* access modifiers changed from: package-private */
    public final h d() {
        if (this.f55580j == null) {
            return new h.a().a();
        }
        HashSet hashSet = new HashSet();
        for (com.lynx.tasm.behavior.a aVar : LynxEnv.b().c()) {
            hashSet.add(aVar.f55782b);
        }
        h.a aVar2 = new h.a();
        aVar2.f56635a = this.f55580j.f56829d;
        aVar2.f56636b = this.f55580j.f56831f;
        aVar2.f56637c = this.f55580j.f56832g;
        aVar2.f56638d = this.f55580j.f56833h;
        aVar2.f56639e = this.f55574d;
        aVar2.f56640f = this.f55580j.f56835j;
        aVar2.f56641g = this.f55580j.f56836k;
        aVar2.f56642h = this.f55581k;
        aVar2.f56643i = this.f55580j.f56837l;
        aVar2.f56644j = this.f55580j.f56838m;
        aVar2.f56645k = this.f55580j.r;
        aVar2.f56646l = hashSet;
        return aVar2.a();
    }

    public void executeRunnable(Runnable runnable) {
        runnable.run();
    }

    public void onDynamicComponentPerfReady(ReadableMap readableMap) {
        a aVar = this.f55572b;
        if (aVar != null) {
            aVar.a(readableMap.toHashMap());
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:3:0x0010, code lost:
        if (r2 == 0) goto L_0x0012;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void a(com.lynx.tasm.TemplateData r8) {
        /*
            r7 = this;
            r6 = 12409(0x3079, float:1.7389E-41)
            com.bytedance.frameworks.apm.trace.MethodCollector.i(r6)
            r4 = 0
            if (r8 == 0) goto L_0x0023
            r8.b()
            long r2 = r8.f55591a
            int r0 = (r2 > r4 ? 1 : (r2 == r4 ? 0 : -1))
            if (r0 != 0) goto L_0x001a
        L_0x0012:
            r4 = 6
            java.lang.String r1 = "TA"
            java.lang.String r0 = "SetGlobalProps with zero templatedata"
            com.lynx.tasm.base.LLog.a(r4, r1, r0)
        L_0x001a:
            long r0 = r7.f55571a
            r7.nativeSetGlobalProps(r0, r2)
            com.bytedance.frameworks.apm.trace.MethodCollector.o(r6)
            return
        L_0x0023:
            r2 = 0
            goto L_0x0012
        */
        throw new UnsupportedOperationException("Method not decompiled: com.lynx.tasm.TemplateAssembler.a(com.lynx.tasm.TemplateData):void");
    }

    public void onPageConfigDecoded(ReadableMap readableMap) {
        q qVar = new q(readableMap);
        this.f55580j = qVar;
        a aVar = this.f55572b;
        if (aVar != null) {
            aVar.a(qVar);
        }
        j jVar = this.f55579i.get();
        if (jVar != null) {
            jVar.r = this.f55580j.q;
            jVar.s = this.f55580j.f56828c;
            return;
        }
        LLog.a(6, "TemplateAssembler", "lynx context free in used: default overflow visible may be not valid");
    }

    public final void a(b bVar) {
        int position;
        MethodCollector.i(12545);
        String str = bVar.f56492e;
        if (this.f55577g) {
            LLog.a(6, "TemplateAssembler", "SendCustomEvent: " + str + " error: TemplateAssemble is destroyed.");
            MethodCollector.o(12545);
            return;
        }
        ByteBuffer a2 = com.lynx.tasm.b.a.f55742a.a(bVar.a());
        if (a2 == null) {
            position = 0;
        } else {
            position = a2.position();
        }
        nativeSendCustomEvent(this.f55571a, str, bVar.f56491d, a2, position, bVar.b());
        MethodCollector.o(12545);
    }

    public final void a(com.lynx.tasm.g.a aVar) {
        MethodCollector.i(12643);
        if (aVar == null) {
            MethodCollector.o(12643);
            return;
        }
        HashMap hashMap = new HashMap();
        aVar.a(hashMap, "theme");
        ByteBuffer a2 = com.lynx.tasm.b.a.f55742a.a(hashMap);
        if (a2 != null) {
            nativeUpdateConfig(this.f55571a, a2, a2.position());
        }
        MethodCollector.o(12643);
    }

    public void reportError(int i2, String str) {
        a aVar = this.f55572b;
        if (aVar != null) {
            aVar.a(i2, str);
        }
    }

    public String translateResourceForTheme(String str, String str2) {
        a aVar = this.f55572b;
        if (aVar != null) {
            return aVar.a(str2);
        }
        return null;
    }

    public void getDataBack(ByteBuffer byteBuffer, int i2) {
        this.f55583m.get(i2);
        Object a2 = com.lynx.tasm.b.a.f55742a.a(byteBuffer);
        if (a2 instanceof Map) {
            JavaOnlyMap.from((Map) a2);
        }
    }

    public void onFirstLoadPerfReady(ReadableMap readableMap, ReadableMap readableMap2) {
        LynxPerfMetric lynxPerfMetric = new LynxPerfMetric(readableMap, readableMap2, this.f55574d, d());
        a aVar = this.f55572b;
        if (aVar != null) {
            aVar.a(lynxPerfMetric);
        }
    }

    public void onUpdatePerfReady(ReadableMap readableMap, ReadableMap readableMap2) {
        LynxPerfMetric lynxPerfMetric = new LynxPerfMetric(readableMap, readableMap2, this.f55574d, d());
        a aVar = this.f55572b;
        if (aVar != null) {
            aVar.b(lynxPerfMetric);
        }
    }

    public void getI18nResourceByNative(final String str, String str2) {
        com.lynx.tasm.provider.h hVar;
        j jVar = this.f55579i.get();
        if (jVar != null) {
            c cVar = jVar.t;
            if (!TextUtils.isEmpty("I18N_TEXT") && (hVar = cVar.f56810a.get("I18N_TEXT")) != null) {
                Bundle bundle = new Bundle();
                bundle.putString("fallbackUrl", str2);
                hVar.a(new i(str.toLowerCase(), bundle), new g<String>() {
                    /* class com.lynx.tasm.TemplateAssembler.AnonymousClass2 */

                    /* renamed from: a  reason: collision with root package name */
                    final WeakReference<TemplateAssembler> f55586a;

                    static {
                        Covode.recordClassIndex(34804);
                    }

                    @Override // com.lynx.tasm.provider.g
                    public final void a(final com.lynx.tasm.provider.j<String> jVar) {
                        super.a(jVar);
                        if (!m.a()) {
                            m.a(new Runnable() {
                                /* class com.lynx.tasm.TemplateAssembler.AnonymousClass2.AnonymousClass1 */

                                static {
                                    Covode.recordClassIndex(34805);
                                }

                                public final void run() {
                                    AnonymousClass2.this.b(jVar);
                                }
                            });
                        } else {
                            b(jVar);
                        }
                    }

                    /* access modifiers changed from: package-private */
                    public final void b(com.lynx.tasm.provider.j<String> jVar) {
                        j jVar2;
                        MethodCollector.i(13952);
                        TemplateAssembler templateAssembler = this.f55586a.get();
                        if (templateAssembler != null && !templateAssembler.f55577g) {
                            if (!TextUtils.isEmpty(jVar.f56825c) || (jVar2 = templateAssembler.f55579i.get()) == null) {
                                templateAssembler.nativeUpdateI18nResource(TemplateAssembler.this.f55571a, str, jVar.f56825c, jVar.f56824b);
                            } else {
                                jVar2.a(str, "I18nResource", "empty i18n resource return");
                                templateAssembler.nativeUpdateI18nResource(TemplateAssembler.this.f55571a, str, "", -1);
                                MethodCollector.o(13952);
                                return;
                            }
                        }
                        MethodCollector.o(13952);
                    }

                    {
                        this.f55586a = new WeakReference<>(TemplateAssembler.this);
                    }
                });
                return;
            }
            jVar.a(str, "I18nResource", "no i18n provider found");
        }
    }

    /* JADX DEBUG: Multi-variable search result rejected for r0v11, resolved type: java.util.HashMap<java.lang.String, java.lang.String> */
    /* JADX WARN: Multi-variable type inference failed */
    public void onConfigUpdatedByJS(String str, Object obj) {
        if (!(str == null || obj == null || !(obj instanceof HashMap))) {
            HashMap hashMap = (HashMap) obj;
            if ("theme".equals(str)) {
                com.lynx.tasm.g.a aVar = new com.lynx.tasm.g.a();
                for (Map.Entry entry : hashMap.entrySet()) {
                    String str2 = (String) entry.getKey();
                    Object value = entry.getValue();
                    if (str2 != null && !str2.isEmpty() && !str2.startsWith("__")) {
                        if (value == null) {
                            aVar.f56621a.remove(str2);
                        } else {
                            aVar.f56621a.put(str2, value);
                        }
                        aVar.f56622b++;
                    }
                }
                a aVar2 = this.f55572b;
                if (aVar2 != null) {
                    aVar2.a(aVar);
                }
            }
        }
    }

    public void onModuleFunctionInvoked(String str, String str2, int i2) {
        a aVar = this.f55572b;
        if (aVar != null) {
            try {
                aVar.a(str, str2, i2);
            } catch (Exception e2) {
                reportError(904, "onModuleFunctionInvoked threw an exception: " + e2.getMessage());
            }
        }
    }

    TemplateAssembler(PaintingContext paintingContext, LayoutContext layoutContext, DynamicComponentLoader dynamicComponentLoader, l lVar, r rVar, boolean z, boolean z2, boolean z3) {
        int id;
        MethodCollector.i(12408);
        this.n = paintingContext;
        this.o = layoutContext;
        this.f55578h = lVar;
        this.r = dynamicComponentLoader;
        DisplayMetrics a2 = layoutContext.a();
        this.f55581k = rVar;
        DynamicComponentLoader dynamicComponentLoader2 = this.r;
        if (rVar == null) {
            id = r.ALL_ON_UI.id();
        } else {
            id = rVar.id();
        }
        int i2 = a2.widthPixels;
        int i3 = a2.heightPixels;
        LynxEnv b2 = LynxEnv.b();
        if (b2.w == null) {
            b2.w = Locale.getDefault().getLanguage() + "-" + Locale.getDefault().getCountry();
        }
        this.f55571a = nativeCreate(paintingContext, layoutContext, dynamicComponentLoader2, id, z, z3, i2, i3, b2.w);
        this.f55577g = false;
        this.p = z2;
        this.q = z3;
        MethodCollector.o(12408);
    }
}
