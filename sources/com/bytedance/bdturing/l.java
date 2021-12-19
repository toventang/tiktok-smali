package com.bytedance.bdturing;

import android.animation.ValueAnimator;
import android.app.Dialog;
import android.content.ComponentCallbacks;
import android.content.Context;
import android.content.DialogInterface;
import android.content.res.Configuration;
import android.os.Bundle;
import android.text.TextUtils;
import android.util.DisplayMetrics;
import android.view.KeyEvent;
import android.view.LayoutInflater;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewParent;
import android.view.WindowManager;
import android.view.animation.LinearInterpolator;
import android.view.animation.RotateAnimation;
import android.webkit.WebView;
import android.widget.Button;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.TextView;
import com.bytedance.bdturing.a;
import com.bytedance.bdturing.c.b;
import com.bytedance.bdturing.c.c;
import com.bytedance.bdturing.e;
import com.bytedance.bdturing.m;
import com.bytedance.bdturing.verify.a.a;
import com.bytedance.bdturing.verify.a.j;
import com.bytedance.bdturing.verify.a.k;
import com.bytedance.covode.number.Covode;
import com.bytedance.frameworks.apm.trace.MethodCollector;
import com.ss.android.ugc.tiktok.security.b.h;
import com.zhiliaoapp.musically.R;
import org.json.JSONException;
import org.json.JSONObject;

public class l extends Dialog {

    /* renamed from: a  reason: collision with root package name */
    ImageView f26518a;

    /* renamed from: b  reason: collision with root package name */
    public VerifyWebView f26519b;

    /* renamed from: c  reason: collision with root package name */
    public ViewGroup f26520c;

    /* renamed from: d  reason: collision with root package name */
    Context f26521d;

    /* renamed from: e  reason: collision with root package name */
    FrameLayout f26522e;

    /* renamed from: f  reason: collision with root package name */
    public boolean f26523f = false;

    /* renamed from: g  reason: collision with root package name */
    public boolean f26524g = false;

    /* renamed from: h  reason: collision with root package name */
    public boolean f26525h = false;

    /* renamed from: i  reason: collision with root package name */
    public boolean f26526i = false;

    /* renamed from: j  reason: collision with root package name */
    public String f26527j = null;

    /* renamed from: k  reason: collision with root package name */
    public b f26528k;

    /* renamed from: l  reason: collision with root package name */
    public DialogInterface.OnDismissListener f26529l;

    /* renamed from: m  reason: collision with root package name */
    public e.a f26530m = e.a.CLOSE_REASON_APP;
    public int n;
    public a o;
    private b p;
    private TextView q;
    private Button r;
    private Button s;
    private String t;
    private i u = null;
    private h v;
    private int w;
    private com.bytedance.bdturing.c.a x = new com.bytedance.bdturing.c.e() {
        /* class com.bytedance.bdturing.l.AnonymousClass5 */

        static {
            Covode.recordClassIndex(15584);
        }

        @Override // com.bytedance.bdturing.c.e
        public final void a() {
            l.this.a();
        }

        @Override // com.bytedance.bdturing.c.e
        public final void b() {
            JSONObject jSONObject;
            if ((l.this.o instanceof k) && (jSONObject = ((k) l.this.o).f26591g) != null) {
                l.this.a(c.a("bytedcert.verifyData", "call", jSONObject, "bytedcert.verifyData"));
            }
        }

        @Override // com.bytedance.bdturing.c.e
        public final void a(c cVar) {
            JSONObject jSONObject;
            c cVar2 = a.C0562a.f26400a.f26393a;
            int i2 = l.this.n;
            if (i2 == 1) {
                jSONObject = cVar2.s;
            } else if (i2 != 3) {
                jSONObject = cVar2.t;
            } else {
                jSONObject = cVar2.r;
            }
            cVar.a(1, jSONObject);
        }

        @Override // com.bytedance.bdturing.c.e
        public final void a(String str, b bVar) {
            j jVar = new j(str, (byte) 0);
            jVar.f26577e = false;
            jVar.f26576d = false;
            l.this.f26529l.onDismiss(l.this);
            a.C0562a.f26400a.a(l.this.o.f26573a, jVar, bVar);
        }

        @Override // com.bytedance.bdturing.c.e
        public final void a(int i2, int i3) {
            l lVar = l.this;
            g.d("changeDialog width = " + i2 + ", height = " + i3);
            if (!lVar.f26525h && lVar.isShowing()) {
                if (lVar.o.a()) {
                    i2 = -1;
                    i3 = -1;
                } else if (i2 > 0 && i3 > 0) {
                    float a2 = com.bytedance.bdturing.f.b.a(lVar.f26521d);
                    i2 = Math.round(((float) i2) * a2);
                    i3 = Math.round(a2 * ((float) i3));
                }
                ViewGroup.LayoutParams layoutParams = lVar.f26519b.getLayoutParams();
                if (!lVar.f26526i || layoutParams.width <= 0 || layoutParams.height <= 0) {
                    lVar.f26519b.post(new Runnable(layoutParams, i2, i3) {
                        /* class com.bytedance.bdturing.l.AnonymousClass2 */

                        /* renamed from: a  reason: collision with root package name */
                        final /* synthetic */ ViewGroup.LayoutParams f26532a;

                        /* renamed from: b  reason: collision with root package name */
                        final /* synthetic */ int f26533b;

                        /* renamed from: c  reason: collision with root package name */
                        final /* synthetic */ int f26534c;

                        static {
                            Covode.recordClassIndex(15581);
                        }

                        public final void run() {
                            if (!l.this.f26525h) {
                                l lVar = l.this;
                                if (lVar.o.f26577e) {
                                    lVar.f26518a.clearAnimation();
                                    lVar.f26518a.setVisibility(8);
                                }
                                if (lVar.o.f26576d) {
                                    lVar.f26522e.setBackgroundColor(-2013265920);
                                }
                                this.f26532a.width = this.f26533b;
                                this.f26532a.height = this.f26534c;
                                l.this.f26519b.setLayoutParams(this.f26532a);
                                l.this.f26519b.setVisibility(0);
                            }
                        }

                        {
                            this.f26532a = r2;
                            this.f26533b = r3;
                            this.f26534c = r4;
                        }
                    });
                    return;
                }
                VerifyWebView verifyWebView = lVar.f26519b;
                int i4 = layoutParams.width;
                int i5 = layoutParams.height;
                ValueAnimator ofObject = ValueAnimator.ofObject(
                /*  JADX ERROR: Method code generation error
                    jadx.core.utils.exceptions.CodegenException: Error generate insn: 0x0066: INVOKE  (r2v2 'ofObject' android.animation.ValueAnimator) = 
                      (wrap: com.bytedance.bdturing.VerifyWebView$1 : 0x004e: CONSTRUCTOR  (r6v0 com.bytedance.bdturing.VerifyWebView$1) = (r8v0 'verifyWebView' com.bytedance.bdturing.VerifyWebView) call: com.bytedance.bdturing.VerifyWebView.1.<init>(com.bytedance.bdturing.VerifyWebView):void type: CONSTRUCTOR)
                      (wrap: java.lang.Object[] : ?: FILLED_NEW_ARRAY  (r2v1 java.lang.Object[]) = 
                      (wrap: int[] : ?: FILLED_NEW_ARRAY  (r0v18 int[]) = (r1v6 'i4' int), (r7v0 'i5' int) elemType: int)
                      (wrap: int[] : ?: FILLED_NEW_ARRAY  (r0v19 int[]) = (r10v2 'i2' int), (r11v2 'i3' int) elemType: int)
                     elemType: java.lang.Object)
                     type: STATIC call: android.animation.ValueAnimator.ofObject(android.animation.TypeEvaluator, java.lang.Object[]):android.animation.ValueAnimator in method: com.bytedance.bdturing.l.5.a(int, int):void, file: classes9.dex
                    	at jadx.core.codegen.InsnGen.makeInsn(InsnGen.java:255)
                    	at jadx.core.codegen.InsnGen.makeInsn(InsnGen.java:217)
                    	at jadx.core.codegen.RegionGen.makeSimpleBlock(RegionGen.java:110)
                    	at jadx.core.codegen.RegionGen.makeRegion(RegionGen.java:56)
                    	at jadx.core.codegen.RegionGen.makeSimpleRegion(RegionGen.java:93)
                    	at jadx.core.codegen.RegionGen.makeRegion(RegionGen.java:59)
                    	at jadx.core.codegen.RegionGen.makeSimpleRegion(RegionGen.java:93)
                    	at jadx.core.codegen.RegionGen.makeRegion(RegionGen.java:59)
                    	at jadx.core.codegen.RegionGen.makeSimpleRegion(RegionGen.java:93)
                    	at jadx.core.codegen.RegionGen.makeRegion(RegionGen.java:59)
                    	at jadx.core.codegen.RegionGen.makeRegionIndent(RegionGen.java:99)
                    	at jadx.core.codegen.RegionGen.makeIf(RegionGen.java:143)
                    	at jadx.core.codegen.RegionGen.makeRegion(RegionGen.java:63)
                    	at jadx.core.codegen.RegionGen.makeSimpleRegion(RegionGen.java:93)
                    	at jadx.core.codegen.RegionGen.makeRegion(RegionGen.java:59)
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
                    Caused by: jadx.core.utils.exceptions.CodegenException: Error generate insn: 0x004e: CONSTRUCTOR  (r6v0 com.bytedance.bdturing.VerifyWebView$1) = (r8v0 'verifyWebView' com.bytedance.bdturing.VerifyWebView) call: com.bytedance.bdturing.VerifyWebView.1.<init>(com.bytedance.bdturing.VerifyWebView):void type: CONSTRUCTOR in method: com.bytedance.bdturing.l.5.a(int, int):void, file: classes9.dex
                    	at jadx.core.codegen.InsnGen.makeInsn(InsnGen.java:255)
                    	at jadx.core.codegen.InsnGen.addWrappedArg(InsnGen.java:119)
                    	at jadx.core.codegen.InsnGen.addArg(InsnGen.java:103)
                    	at jadx.core.codegen.InsnGen.generateMethodArguments(InsnGen.java:806)
                    	at jadx.core.codegen.InsnGen.makeInvoke(InsnGen.java:746)
                    	at jadx.core.codegen.InsnGen.makeInsnBody(InsnGen.java:367)
                    	at jadx.core.codegen.InsnGen.makeInsn(InsnGen.java:249)
                    	... 25 more
                    Caused by: jadx.core.utils.exceptions.JadxRuntimeException: Expected class to be processed at this point, class: com.bytedance.bdturing.VerifyWebView, state: GENERATED_AND_UNLOADED
                    	at jadx.core.dex.nodes.ClassNode.ensureProcessed(ClassNode.java:215)
                    	at jadx.core.codegen.InsnGen.makeConstructor(InsnGen.java:630)
                    	at jadx.core.codegen.InsnGen.makeInsnBody(InsnGen.java:363)
                    	at jadx.core.codegen.InsnGen.makeInsn(InsnGen.java:230)
                    	... 31 more
                    */
                /*
                // Method dump skipped, instructions count: 160
                */
                throw new UnsupportedOperationException("Method not decompiled: com.bytedance.bdturing.l.AnonymousClass5.a(int, int):void");
            }

            @Override // com.bytedance.bdturing.c.e
            public final void a(int i2, String str, String str2) {
                boolean z;
                if (i2 == 0) {
                    z = true;
                } else {
                    z = false;
                }
                JSONObject jSONObject = new JSONObject();
                try {
                    jSONObject.put("duration", System.currentTimeMillis() - e.f26465a);
                    jSONObject.put("result", i2);
                    jSONObject.put("key", "result");
                    e.a("turing_verify_sdk", jSONObject);
                } catch (JSONException e2) {
                    g.a(e2);
                }
                if (l.this.f26528k != null) {
                    if (z) {
                        JSONObject jSONObject2 = new JSONObject();
                        try {
                            jSONObject2.put("token", str);
                            jSONObject2.put("mobile", str2);
                        } catch (JSONException e3) {
                            g.a(e3);
                        }
                        l.this.f26528k.b(i2);
                    } else {
                        l.this.f26528k.a(i2);
                    }
                    l.this.f26528k = null;
                }
                l.this.f26524g = true;
                l.this.dismiss();
            }
        };
        private n y = new n() {
            /* class com.bytedance.bdturing.l.AnonymousClass6 */

            static {
                Covode.recordClassIndex(15585);
            }

            @Override // com.bytedance.bdturing.n
            public final void a() {
                l.this.f26523f = true;
                e.a(0, "success");
            }

            @Override // com.bytedance.bdturing.n
            public final void a(int i2, String str) {
                l.this.f26523f = false;
                if (!l.this.f26525h) {
                    l.this.f26527j = "Service error" + i2 + ", Please feed back to us";
                }
                e.a(i2, str);
            }
        };
        private ComponentCallbacks z = new ComponentCallbacks() {
            /* class com.bytedance.bdturing.l.AnonymousClass7 */

            static {
                Covode.recordClassIndex(15586);
            }

            public final void onLowMemory() {
            }

            public final void onConfigurationChanged(Configuration configuration) {
                int i2;
                boolean z;
                if (configuration.orientation == 1 || configuration.orientation == 2) {
                    if (configuration.orientation == 1) {
                        i2 = 2;
                    } else {
                        i2 = 1;
                    }
                    if (l.this.o.b() == 2) {
                        z = true;
                    } else {
                        z = false;
                    }
                    g.d("canOrientation: ".concat(String.valueOf(z)));
                    if (z) {
                        JSONObject jSONObject = new JSONObject();
                        try {
                            jSONObject.put("orientation", i2);
                        } catch (JSONException e2) {
                            e2.printStackTrace();
                        }
                        String a2 = c.a("bytedcert.orientation_changing", "call", jSONObject, "bytedcert.orientation_changing");
                        l.this.f26526i = true;
                        l.this.a(a2);
                        JSONObject jSONObject2 = new JSONObject();
                        try {
                            jSONObject2.put("result", i2);
                            jSONObject2.put("key", "orientation_change");
                            e.a("turing_verify_sdk", jSONObject2);
                        } catch (JSONException e3) {
                            g.a(e3);
                        }
                    }
                }
            }
        };

        static {
            Covode.recordClassIndex(15579);
        }

        public final synchronized void a() {
            MethodCollector.i(1347);
            g.a("clearResource()");
            if (this.f26521d == null && this.p == null) {
                MethodCollector.o(1347);
                return;
            }
            this.f26521d = null;
            b bVar = this.p;
            if (bVar.f26433a != null) {
                bVar.f26434b.post(
                /*  JADX ERROR: Method code generation error
                    jadx.core.utils.exceptions.CodegenException: Error generate insn: 0x0028: INVOKE  
                      (wrap: android.os.Handler : 0x0021: IGET  (r1v0 android.os.Handler) = (r2v0 'bVar' com.bytedance.bdturing.c.b) com.bytedance.bdturing.c.b.b android.os.Handler)
                      (wrap: com.bytedance.bdturing.c.b$2 : 0x0025: CONSTRUCTOR  (r0v4 com.bytedance.bdturing.c.b$2) = (r2v0 'bVar' com.bytedance.bdturing.c.b) call: com.bytedance.bdturing.c.b.2.<init>(com.bytedance.bdturing.c.b):void type: CONSTRUCTOR)
                     type: VIRTUAL call: android.os.Handler.post(java.lang.Runnable):boolean in method: com.bytedance.bdturing.l.a():void, file: classes9.dex
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
                    	at jadx.core.codegen.RegionGen.makeSimpleRegion(RegionGen.java:93)
                    	at jadx.core.codegen.RegionGen.makeRegion(RegionGen.java:59)
                    	at jadx.core.codegen.RegionGen.makeSimpleRegion(RegionGen.java:93)
                    	at jadx.core.codegen.RegionGen.makeRegion(RegionGen.java:59)
                    	at jadx.core.codegen.RegionGen.makeSimpleRegion(RegionGen.java:93)
                    	at jadx.core.codegen.RegionGen.makeRegion(RegionGen.java:59)
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
                    Caused by: jadx.core.utils.exceptions.CodegenException: Error generate insn: 0x0025: CONSTRUCTOR  (r0v4 com.bytedance.bdturing.c.b$2) = (r2v0 'bVar' com.bytedance.bdturing.c.b) call: com.bytedance.bdturing.c.b.2.<init>(com.bytedance.bdturing.c.b):void type: CONSTRUCTOR in method: com.bytedance.bdturing.l.a():void, file: classes9.dex
                    	at jadx.core.codegen.InsnGen.makeInsn(InsnGen.java:255)
                    	at jadx.core.codegen.InsnGen.addWrappedArg(InsnGen.java:119)
                    	at jadx.core.codegen.InsnGen.addArg(InsnGen.java:103)
                    	at jadx.core.codegen.InsnGen.generateMethodArguments(InsnGen.java:806)
                    	at jadx.core.codegen.InsnGen.makeInvoke(InsnGen.java:746)
                    	at jadx.core.codegen.InsnGen.makeInsnBody(InsnGen.java:367)
                    	at jadx.core.codegen.InsnGen.makeInsn(InsnGen.java:249)
                    	... 27 more
                    Caused by: jadx.core.utils.exceptions.JadxRuntimeException: Expected class to be processed at this point, class: com.bytedance.bdturing.c.b, state: GENERATED_AND_UNLOADED
                    	at jadx.core.dex.nodes.ClassNode.ensureProcessed(ClassNode.java:215)
                    	at jadx.core.codegen.InsnGen.makeConstructor(InsnGen.java:630)
                    	at jadx.core.codegen.InsnGen.makeInsnBody(InsnGen.java:363)
                    	at jadx.core.codegen.InsnGen.makeInsn(InsnGen.java:230)
                    	... 33 more
                    */
                /*
                    this = this;
                    monitor-enter(r5)
                    r4 = 1347(0x543, float:1.888E-42)
                    com.bytedance.frameworks.apm.trace.MethodCollector.i(r4)     // Catch:{ all -> 0x0036 }
                    java.lang.String r0 = "clearResource()"
                    com.bytedance.bdturing.g.a(r0)     // Catch:{ all -> 0x0036 }
                    android.content.Context r0 = r5.f26521d     // Catch:{ all -> 0x0036 }
                    if (r0 != 0) goto L_0x0018
                    com.bytedance.bdturing.c.b r0 = r5.p     // Catch:{ all -> 0x0036 }
                    if (r0 != 0) goto L_0x0018
                    com.bytedance.frameworks.apm.trace.MethodCollector.o(r4)     // Catch:{ all -> 0x0036 }
                    monitor-exit(r5)
                    return
                L_0x0018:
                    r3 = 0
                    r5.f26521d = r3
                    com.bytedance.bdturing.c.b r2 = r5.p
                    android.webkit.WebView r0 = r2.f26433a
                    if (r0 == 0) goto L_0x002f
                    android.os.Handler r1 = r2.f26434b
                    com.bytedance.bdturing.c.b$2 r0 = new com.bytedance.bdturing.c.b$2
                    r0.<init>()
                    r1.post(r0)
                    r2.f26434b = r3
                    r2.f26433a = r3
                L_0x002f:
                    r5.p = r3
                    com.bytedance.frameworks.apm.trace.MethodCollector.o(r4)
                    monitor-exit(r5)
                    return
                L_0x0036:
                    r0 = move-exception
                    monitor-exit(r5)
                    throw r0
                */
                throw new UnsupportedOperationException("Method not decompiled: com.bytedance.bdturing.l.a():void");
            }

            public void dismiss() {
                if (this.f26519b != null) {
                    getWindow().getDecorView().post(new Runnable() {
                        /* class com.bytedance.bdturing.l.AnonymousClass3 */

                        /* renamed from: b  reason: collision with root package name */
                        private WebView f26537b;

                        static {
                            Covode.recordClassIndex(15582);
                        }

                        public final void run() {
                            MethodCollector.i(1112);
                            g.b("remove webview");
                            WebView webView = this.f26537b;
                            if (webView == null) {
                                MethodCollector.o(1112);
                                return;
                            }
                            ViewParent parent = webView.getParent();
                            if (parent != null && (parent instanceof ViewGroup)) {
                                ((ViewGroup) parent).removeView(this.f26537b);
                            }
                            MethodCollector.o(1112);
                        }

                        {
                            this.f26537b = l.this.f26519b;
                        }
                    });
                    this.f26519b = null;
                }
                if (!this.f26525h) {
                    this.f26525h = true;
                    super.dismiss();
                    if (this.o.f26573a != null) {
                        this.o.f26573a.unregisterComponentCallbacks(this.z);
                    }
                    h hVar = this.v;
                    if (hVar != null) {
                        if (hVar.f26497a != null) {
                            hVar.f26497a.getApplication().unregisterActivityLifecycleCallbacks(hVar);
                        }
                        this.v = null;
                    }
                    DialogInterface.OnDismissListener onDismissListener = this.f26529l;
                    if (onDismissListener != null) {
                        onDismissListener.onDismiss(this);
                    }
                    m mVar = m.a.f26544a;
                    if (mVar.f26543b != null) {
                        mVar.f26543b.sendMessageDelayed(mVar.f26543b.obtainMessage(1, this), 10000);
                    }
                    b bVar = this.f26528k;
                    if (bVar != null && !this.f26523f) {
                        bVar.a(3);
                        this.f26528k = null;
                    }
                    if (!this.f26524g) {
                        String name = this.f26530m.getName();
                        JSONObject jSONObject = new JSONObject();
                        try {
                            jSONObject.put("style", name);
                        } catch (JSONException e2) {
                            e2.printStackTrace();
                        }
                        a(c.a("bytedcert.goToClose", "call", jSONObject, "bytedcert.goToClose"));
                    }
                    if (!this.f26523f) {
                        e.a aVar = this.f26530m;
                        JSONObject jSONObject2 = new JSONObject();
                        try {
                            jSONObject2.put("duration", System.currentTimeMillis() - e.f26465a);
                            jSONObject2.put("result", aVar.getName());
                            jSONObject2.put("key", "close");
                            e.a("turing_verify_sdk", jSONObject2);
                        } catch (JSONException e3) {
                            g.a(e3);
                        }
                        a();
                    }
                    m.a.f26544a.a(3, null);
                }
            }

            public void setOnDismissListener(DialogInterface.OnDismissListener onDismissListener) {
                this.f26529l = onDismissListener;
            }

            public final boolean a(String str) {
                b bVar = this.p;
                if (bVar == null) {
                    g.c("(mJsBridge == null) ");
                    return false;
                }
                bVar.a(str);
                return true;
            }

            public boolean onTouchEvent(MotionEvent motionEvent) {
                this.u.a(motionEvent);
                if (this.o.f26575c) {
                    if (this.f26520c.getVisibility() == 0) {
                        this.f26530m = e.a.CLOSE_FB_MASK;
                    } else {
                        this.f26530m = e.a.CLOSE_REASON_MASK;
                    }
                }
                return super.onTouchEvent(motionEvent);
            }

            /* access modifiers changed from: protected */
            public void onCreate(Bundle bundle) {
                MethodCollector.i(1331);
                super.onCreate(bundle);
                setContentView(LayoutInflater.from(this.f26521d).inflate(R.layout.aj2, (ViewGroup) null));
                WindowManager.LayoutParams attributes = getWindow().getAttributes();
                attributes.width = -1;
                attributes.height = -1;
                getWindow().setAttributes(attributes);
                this.f26520c = (ViewGroup) findViewById(R.id.fis);
                this.q = (TextView) findViewById(R.id.ejj);
                this.r = (Button) findViewById(R.id.yd);
                this.s = (Button) findViewById(R.id.ye);
                this.f26518a = (ImageView) findViewById(R.id.chg);
                this.f26519b = (VerifyWebView) findViewById(R.id.ff1);
                this.f26522e = (FrameLayout) findViewById(R.id.alk);
                AnonymousClass1 r1 = new View.OnClickListener() {
                    /* class com.bytedance.bdturing.l.AnonymousClass1 */

                    static {
                        Covode.recordClassIndex(15580);
                    }

                    public final void onClick(View view) {
                        int id = view.getId();
                        if (id == R.id.ye) {
                            l.this.f26530m = e.a.CLOSE_FB_CLOSE;
                        } else if (id == R.id.yd) {
                            l.this.f26530m = e.a.CLOSE_FB_FEEDBACK;
                        }
                        l.this.dismiss();
                    }
                };
                this.r.setOnClickListener(r1);
                this.s.setOnClickListener(r1);
                this.f26519b.a(this.y);
                i iVar = new i(this.o.d());
                this.u = iVar;
                this.f26519b.setOnTouchListener(iVar);
                if (this.o.f26577e) {
                    RotateAnimation rotateAnimation = new RotateAnimation(0.0f, 360.0f, 1, 0.5f, 1, 0.5f);
                    rotateAnimation.setDuration(1000);
                    rotateAnimation.setRepeatCount(-1);
                    rotateAnimation.setInterpolator(new LinearInterpolator());
                    this.f26518a.startAnimation(rotateAnimation);
                    this.f26522e.setBackgroundColor(-2013265920);
                } else {
                    this.f26518a.setVisibility(8);
                }
                if (this.o.f26573a != null) {
                    this.o.f26573a.registerComponentCallbacks(this.z);
                }
                h hVar = this.v;
                if (hVar.f26497a != null) {
                    hVar.f26497a.getApplication().registerActivityLifecycleCallbacks(hVar);
                }
                setCanceledOnTouchOutside(this.o.f26575c);
                setCancelable(true);
                this.p = new b(this.x, this.f26519b);
                g.a("loadUrl = " + this.t);
                VerifyWebView verifyWebView = this.f26519b;
                String str = this.t;
                String a2 = h.f149026a.a(verifyWebView, str);
                if (!TextUtils.isEmpty(a2)) {
                    str = a2;
                }
                verifyWebView.loadUrl(str);
                if (this.o.a()) {
                    DisplayMetrics displayMetrics = this.f26521d.getResources().getDisplayMetrics();
                    ViewGroup.LayoutParams layoutParams = this.f26519b.getLayoutParams();
                    layoutParams.width = displayMetrics.widthPixels;
                    layoutParams.height = displayMetrics.heightPixels;
                    this.f26519b.setLayoutParams(layoutParams);
                    this.f26519b.setVisibility(0);
                }
                MethodCollector.o(1331);
            }

            public l(com.bytedance.bdturing.verify.a.a aVar, b bVar) {
                super(aVar.f26573a, R.style.ov);
                this.o = aVar;
                this.n = aVar.b();
                this.t = this.o.e();
                this.f26528k = bVar;
                this.w = com.bytedance.bdturing.f.b.a(this.o.f26573a);
                this.v = new h(this.o.f26573a);
                this.f26521d = aVar.f26573a;
                setOnKeyListener(new DialogInterface.OnKeyListener() {
                    /* class com.bytedance.bdturing.l.AnonymousClass4 */

                    static {
                        Covode.recordClassIndex(15583);
                    }

                    public final boolean onKey(DialogInterface dialogInterface, int i2, KeyEvent keyEvent) {
                        int keyCode = keyEvent.getKeyCode();
                        int action = keyEvent.getAction();
                        if (keyCode != 4 || action != 1) {
                            return false;
                        }
                        if (l.this.f26520c.getVisibility() == 0) {
                            l.this.f26530m = e.a.CLOSE_FB_SYSTEM;
                            return false;
                        } else if (l.this.f26519b == null || !l.this.f26519b.canGoBack()) {
                            l.this.f26530m = e.a.CLOSE_REASON_BACK;
                            return false;
                        } else {
                            l.this.f26519b.goBack();
                            return true;
                        }
                    }
                });
            }
        }
