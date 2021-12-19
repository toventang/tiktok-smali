package com.ss.android.ad.splash.core.video;

import android.content.Context;
import android.os.Build;
import android.os.Message;
import android.view.LayoutInflater;
import android.view.MotionEvent;
import android.view.SurfaceHolder;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.RelativeLayout;
import com.bytedance.covode.number.Covode;
import com.bytedance.frameworks.apm.trace.MethodCollector;
import com.ss.android.ad.splash.core.h;
import com.ss.android.ad.splash.core.i.c;
import com.ss.android.ad.splash.core.v;
import com.ss.android.ad.splash.core.video.b;
import com.ss.android.ad.splash.core.video.e;
import com.ss.android.ad.splash.f.j;
import com.ss.android.ad.splash.f.l;
import com.ss.android.ad.splash.f.m;
import com.ss.android.ad.splash.f.o;
import com.ss.android.ad.splash.f.q;
import com.ss.android.ugc.aweme.lancet.a.a;
import com.zhiliaoapp.musically.R;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.List;
import org.json.JSONException;
import org.json.JSONObject;

public final class g implements b, e.a, q.a {

    /* renamed from: a  reason: collision with root package name */
    public e f58801a;

    /* renamed from: b  reason: collision with root package name */
    public q f58802b = new q(this);

    /* renamed from: c  reason: collision with root package name */
    public long f58803c = 0;

    /* renamed from: d  reason: collision with root package name */
    public c f58804d;

    /* renamed from: e  reason: collision with root package name */
    public b.a f58805e;

    /* renamed from: f  reason: collision with root package name */
    public boolean f58806f = false;

    /* renamed from: g  reason: collision with root package name */
    public Runnable f58807g = new Runnable() {
        /* class com.ss.android.ad.splash.core.video.g.AnonymousClass2 */

        static {
            Covode.recordClassIndex(36414);
        }

        public final void run() {
            if (g.this.f58804d != null) {
                c cVar = g.this.f58804d;
                if (cVar.f58744d != null) {
                    cVar.f58744d.obtainMessage(108).sendToTarget();
                }
            }
        }
    };

    /* renamed from: h  reason: collision with root package name */
    private long f58808h;

    /* renamed from: i  reason: collision with root package name */
    private int f58809i;

    /* renamed from: j  reason: collision with root package name */
    private ViewGroup f58810j;

    /* renamed from: k  reason: collision with root package name */
    private long f58811k = 0;

    /* renamed from: l  reason: collision with root package name */
    private String f58812l;

    /* renamed from: m  reason: collision with root package name */
    private long f58813m = 0;
    private long n;
    private List<String> o;
    private int[] p = new int[2];
    private ArrayList<Runnable> q;
    private boolean r;
    private WeakReference<Context> s;
    private boolean t;
    private boolean u = false;
    private long v = 0;
    private long w = 0;
    private Runnable x = new Runnable() {
        /* class com.ss.android.ad.splash.core.video.g.AnonymousClass3 */

        static {
            Covode.recordClassIndex(36415);
        }

        public final void run() {
            if (g.this.f58805e != null) {
                g.this.f58805e.c();
            }
        }
    };

    static {
        Covode.recordClassIndex(36412);
    }

    public final void c() {
        c cVar = this.f58804d;
        if (cVar != null) {
            cVar.b();
        }
    }

    @Override // com.ss.android.ad.splash.core.video.e.a
    public final void a() {
        this.r = false;
        com.ss.android.ad.splash.f.g.b("surfaceDestroyed");
    }

    @Override // com.ss.android.ad.splash.core.video.e.a
    public final void b() {
        if (this.f58805e != null) {
            this.f58811k = System.currentTimeMillis() - this.f58803c;
            b.a aVar = this.f58805e;
            m.a(this.f58813m, this.n);
            aVar.b();
        }
    }

    public final void d() {
        c cVar = this.f58804d;
        if (cVar != null) {
            cVar.c();
        }
        e eVar = this.f58801a;
        if (eVar != null) {
            eVar.e();
        }
        this.f58802b.removeCallbacks(this.x);
    }

    private void e() {
        JSONObject jSONObject = new JSONObject();
        JSONObject jSONObject2 = new JSONObject();
        try {
            jSONObject.put("show_expected", this.f58809i);
            String str = "not_real_time";
            if (this.f58806f) {
                str = "real_time";
            }
            jSONObject.put("show_type", str);
            jSONObject.put("ad_sequence", v.a().p());
            int i2 = 1;
            jSONObject.putOpt("play_order", 1);
            if (h.X != -1) {
                if (h.X != 1) {
                    i2 = 2;
                }
                jSONObject.put("awemelaunch", i2);
            }
            jSONObject2.putOpt("ad_extra_data", jSONObject);
            jSONObject2.putOpt("is_ad_event", "1");
            if (!l.a(this.f58812l)) {
                jSONObject2.put("log_extra", this.f58812l);
            }
            jSONObject2.put("ad_fetch_time", this.v);
        } catch (JSONException e2) {
            e2.printStackTrace();
            jSONObject2 = null;
        }
        h.a(this.f58808h, "splash_ad", "play", jSONObject2);
        c.a aVar = new c.a();
        aVar.f58598a = this.w;
        c a2 = aVar.a();
        if (h.a().f58910b) {
            h.g().a(null, "play", this.f58808h, this.o, this.f58812l, true, -1, null, a2);
        } else {
            h.g().c(null, this.f58808h, this.o, this.f58812l, true, -1, null, a2);
        }
    }

    @Override // com.ss.android.ad.splash.core.video.e.a
    public final void a(MotionEvent motionEvent) {
        b.a aVar = this.f58805e;
        if (aVar != null) {
            m.a(this.f58813m, this.n);
            aVar.a((int) motionEvent.getRawX(), (int) motionEvent.getRawY());
        }
    }

    @Override // com.ss.android.ad.splash.core.video.e.a
    public final void a(SurfaceHolder surfaceHolder) {
        this.r = true;
        c cVar = this.f58804d;
        if (cVar != null) {
            cVar.a(
            /*  JADX ERROR: Method code generation error
                jadx.core.utils.exceptions.CodegenException: Error generate insn: 0x000d: INVOKE  
                  (r1v0 'cVar' com.ss.android.ad.splash.core.video.c)
                  (wrap: com.ss.android.ad.splash.core.video.c$2 : 0x000a: CONSTRUCTOR  (r0v1 com.ss.android.ad.splash.core.video.c$2) = (r1v0 'cVar' com.ss.android.ad.splash.core.video.c), (r3v0 'surfaceHolder' android.view.SurfaceHolder) call: com.ss.android.ad.splash.core.video.c.2.<init>(com.ss.android.ad.splash.core.video.c, android.view.SurfaceHolder):void type: CONSTRUCTOR)
                 type: VIRTUAL call: com.ss.android.ad.splash.core.video.c.a(java.lang.Runnable):void in method: com.ss.android.ad.splash.core.video.g.a(android.view.SurfaceHolder):void, file: classes10.dex
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
                	at jadx.core.codegen.MethodGen.addRegionInsns(MethodGen.java:244)
                	at jadx.core.codegen.MethodGen.addInstructions(MethodGen.java:237)
                	at jadx.core.codegen.ClassGen.addMethodCode(ClassGen.java:342)
                	at jadx.core.codegen.ClassGen.addMethod(ClassGen.java:295)
                	at jadx.core.codegen.ClassGen.lambda$addInnerClsAndMethods$2(ClassGen.java:264)
                	at java.base/java.util.stream.ForEachOps$ForEachOp$OfRef.accept(ForEachOps.java:183)
                	at java.base/java.util.ArrayList.forEach(ArrayList.java:1511)
                	at java.base/java.util.stream.SortedOps$RefSortingSink.end(SortedOps.java:395)
                	at java.base/java.util.stream.Sink$ChainedReference.end(Sink.java:258)
                Caused by: jadx.core.utils.exceptions.CodegenException: Error generate insn: 0x000a: CONSTRUCTOR  (r0v1 com.ss.android.ad.splash.core.video.c$2) = (r1v0 'cVar' com.ss.android.ad.splash.core.video.c), (r3v0 'surfaceHolder' android.view.SurfaceHolder) call: com.ss.android.ad.splash.core.video.c.2.<init>(com.ss.android.ad.splash.core.video.c, android.view.SurfaceHolder):void type: CONSTRUCTOR in method: com.ss.android.ad.splash.core.video.g.a(android.view.SurfaceHolder):void, file: classes10.dex
                	at jadx.core.codegen.InsnGen.makeInsn(InsnGen.java:255)
                	at jadx.core.codegen.InsnGen.addWrappedArg(InsnGen.java:119)
                	at jadx.core.codegen.InsnGen.addArg(InsnGen.java:103)
                	at jadx.core.codegen.InsnGen.generateMethodArguments(InsnGen.java:806)
                	at jadx.core.codegen.InsnGen.makeInvoke(InsnGen.java:746)
                	at jadx.core.codegen.InsnGen.makeInsnBody(InsnGen.java:367)
                	at jadx.core.codegen.InsnGen.makeInsn(InsnGen.java:249)
                	... 21 more
                Caused by: jadx.core.utils.exceptions.JadxRuntimeException: Expected class to be processed at this point, class: com.ss.android.ad.splash.core.video.c, state: GENERATED_AND_UNLOADED
                	at jadx.core.dex.nodes.ClassNode.ensureProcessed(ClassNode.java:215)
                	at jadx.core.codegen.InsnGen.makeConstructor(InsnGen.java:630)
                	at jadx.core.codegen.InsnGen.makeInsnBody(InsnGen.java:363)
                	at jadx.core.codegen.InsnGen.makeInsn(InsnGen.java:230)
                	... 27 more
                */
            /*
                this = this;
                r0 = 1
                r2.r = r0
                com.ss.android.ad.splash.core.video.c r1 = r2.f58804d
                if (r1 != 0) goto L_0x0008
                return
            L_0x0008:
                com.ss.android.ad.splash.core.video.c$2 r0 = new com.ss.android.ad.splash.core.video.c$2
                r0.<init>(r3)
                r1.a(r0)
                java.util.ArrayList<java.lang.Runnable> r0 = r2.q
                if (r0 == 0) goto L_0x001a
                boolean r0 = r0.isEmpty()
                if (r0 == 0) goto L_0x001b
            L_0x001a:
                return
            L_0x001b:
                java.util.ArrayList r1 = new java.util.ArrayList
                java.util.ArrayList<java.lang.Runnable> r0 = r2.q
                r1.<init>(r0)
                java.util.Iterator r1 = r1.iterator()
            L_0x0026:
                boolean r0 = r1.hasNext()
                if (r0 == 0) goto L_0x0036
                java.lang.Object r0 = r1.next()
                java.lang.Runnable r0 = (java.lang.Runnable) r0
                r0.run()
                goto L_0x0026
            L_0x0036:
                java.util.ArrayList<java.lang.Runnable> r0 = r2.q
                r0.clear()
                goto L_0x001a
            */
            throw new UnsupportedOperationException("Method not decompiled: com.ss.android.ad.splash.core.video.g.a(android.view.SurfaceHolder):void");
        }

        @Override // com.ss.android.ad.splash.f.q.a
        public final void a(Message message) {
            WeakReference<Context> weakReference;
            e eVar;
            if (this.f58801a != null && message != null && (weakReference = this.s) != null && weakReference.get() != null) {
                int i2 = message.what;
                if (i2 != 108) {
                    if (i2 != 109) {
                        switch (i2) {
                            case 302:
                                int i3 = message.what;
                                WeakReference<Context> weakReference2 = this.s;
                                if (weakReference2 != null && weakReference2.get() != null && (eVar = this.f58801a) != null) {
                                    eVar.c();
                                    b.a aVar = this.f58805e;
                                    if (aVar != null) {
                                        aVar.a(this.f58811k);
                                        return;
                                    }
                                    return;
                                }
                                return;
                            case 303:
                                e eVar2 = this.f58801a;
                                if (eVar2 != null) {
                                    eVar2.c();
                                }
                                b.a aVar2 = this.f58805e;
                                if (aVar2 != null) {
                                    m.a(this.f58813m, this.n);
                                    aVar2.a();
                                    return;
                                }
                                return;
                            case 304:
                                int i4 = message.arg1;
                                e eVar3 = this.f58801a;
                                if (eVar3 != null) {
                                    eVar3.c();
                                }
                                if (this.t && i4 == 3 && !this.u) {
                                    e();
                                    this.u = true;
                                    return;
                                }
                                return;
                            case 305:
                                q qVar = this.f58802b;
                                if (qVar != null) {
                                    qVar.removeCallbacks(this.x);
                                }
                                if (!this.t && !this.u) {
                                    e();
                                    this.u = true;
                                }
                                e eVar4 = this.f58801a;
                                if (eVar4 != null) {
                                    eVar4.c();
                                    return;
                                }
                                return;
                            case 306:
                                e eVar5 = this.f58801a;
                                if (eVar5 != null) {
                                    eVar5.c();
                                    return;
                                }
                                return;
                            default:
                                return;
                        }
                    } else if (message.obj instanceof Long) {
                        this.f58813m = ((Long) message.obj).longValue();
                    }
                } else if (message.obj instanceof Long) {
                    this.n = ((Long) message.obj).longValue();
                }
            }
        }

        public final boolean a(f fVar) {
            int i2;
            MethodCollector.i(5359);
            if (l.a(fVar.f58776b) || l.a(fVar.f58775a)) {
                com.ss.android.ad.splash.f.g.e("No video info");
                MethodCollector.o(5359);
                return false;
            }
            this.f58812l = fVar.f58781g;
            this.f58808h = fVar.f58777c;
            this.f58809i = fVar.f58786l;
            this.v = fVar.f58782h;
            this.f58801a.s = fVar.o;
            if (fVar.f58784j) {
                e eVar = this.f58801a;
                int i3 = fVar.f58787m;
                int i4 = fVar.n;
                if (!(eVar.f58764f == null || (i3 == 0 && i4 == 0))) {
                    ((RelativeLayout.LayoutParams) eVar.f58764f.getLayoutParams()).setMargins(i3, i4, i3, i4);
                }
            }
            e eVar2 = this.f58801a;
            boolean z = fVar.f58784j;
            boolean z2 = fVar.f58785k;
            if (eVar2.s) {
                eVar2.f58765g.setVisibility(8);
                if (z) {
                    eVar2.f58762d.setVisibility(0);
                    eVar2.r.setVisibility(0);
                    if (h.D) {
                        eVar2.q.setVisibility(0);
                    }
                }
                if (z2) {
                    RelativeLayout.LayoutParams layoutParams = (RelativeLayout.LayoutParams) eVar2.p.getLayoutParams();
                    layoutParams.height = j.h() - 4;
                    eVar2.p.setLayoutParams(layoutParams);
                    eVar2.p.setVisibility(4);
                    eVar2.n.setPadding(4, 4, 0, 4);
                    eVar2.n.setVisibility(0);
                    eVar2.o.setBackgroundResource(R.drawable.bju);
                    eVar2.o.setTextColor(eVar2.f58769k.getResources().getColor(R.color.pa));
                }
            } else {
                eVar2.f58765g.setVisibility(8);
                if (z) {
                    eVar2.f58762d.setVisibility(0);
                    if (h.D) {
                        eVar2.f58760b.setVisibility(0);
                    }
                }
                if (z2) {
                    eVar2.f58759a.setVisibility(0);
                    eVar2.f58761c.setVisibility(0);
                }
                if (z && h.B == 1) {
                    RelativeLayout.LayoutParams layoutParams2 = new RelativeLayout.LayoutParams(-2, -2);
                    layoutParams2.addRule(12);
                    layoutParams2.addRule(11);
                    layoutParams2.setMargins(0, 0, (int) o.a(eVar2.f58769k, 10.0f), 0);
                    eVar2.f58759a.setLayoutParams(layoutParams2);
                    eVar2.f58759a.setPadding(0, 0, 0, (int) o.a(eVar2.f58769k, 10.0f));
                    eVar2.b();
                } else if (!z2) {
                    eVar2.b();
                }
            }
            e eVar3 = this.f58801a;
            int i5 = fVar.f58778d;
            int i6 = fVar.f58779e;
            eVar3.f58766h = i5;
            eVar3.f58767i = i6;
            e eVar4 = this.f58801a;
            int i7 = fVar.p;
            if (h.u != null) {
                eVar4.f58762d.setImageResource(h.u.a(i7));
            }
            e eVar5 = this.f58801a;
            ViewGroup viewGroup = this.f58810j;
            if (eVar5.f58768j.getParent() != null) {
                ((ViewGroup) eVar5.f58768j.getParent()).removeView(eVar5.f58768j);
            }
            viewGroup.addView(eVar5.f58768j);
            eVar5.b(0);
            int i8 = fVar.f58783i;
            if (!(this.f58801a.a() instanceof FrameLayout.LayoutParams)) {
                com.ss.android.ad.splash.f.g.b("syncPositionForSplash layout params!");
            } else {
                this.f58810j.getLocationInWindow(this.p);
                FrameLayout.LayoutParams a2 = this.f58801a.a();
                if (a2 != null) {
                    a2.topMargin = i8;
                    a2.leftMargin = 0;
                    a2.gravity = 51;
                    this.f58801a.f58768j.setLayoutParams(a2);
                }
            }
            this.f58802b = new q(this);
            this.f58804d = new c(this.f58802b);
            e eVar6 = this.f58801a;
            int i9 = fVar.f58778d;
            if (i9 == -1) {
                i9 = eVar6.f58769k.getResources().getDisplayMetrics().widthPixels;
            }
            if (i9 > 0) {
                if (eVar6.f58766h <= 0 || eVar6.f58767i <= 0) {
                    i2 = 0;
                } else {
                    i2 = eVar6.f58769k.getResources().getDimensionPixelSize(R.dimen.su);
                    int dimensionPixelSize = eVar6.f58769k.getResources().getDimensionPixelSize(R.dimen.sv);
                    int i10 = (int) (((float) eVar6.f58767i) * ((((float) i9) * 1.0f) / ((float) eVar6.f58766h)));
                    if (i10 <= i2) {
                        if (i10 < dimensionPixelSize) {
                            i2 = dimensionPixelSize;
                        } else {
                            i2 = i10;
                        }
                    }
                }
                ViewGroup.LayoutParams layoutParams3 = eVar6.f58768j.getLayoutParams();
                layoutParams3.width = i9;
                if (i2 == -1 || i2 == -2 || i2 > 0) {
                    layoutParams3.height = i2;
                }
                eVar6.f58768j.setLayoutParams(layoutParams3);
            }
            this.f58811k = 0;
            this.f58801a.f58765g.setVisibility(0);
            try {
                String str = fVar.f58775a;
                c cVar = this.f58804d;
                if (cVar != null) {
                    cVar.a(
                    /*  JADX ERROR: Method code generation error
                        jadx.core.utils.exceptions.CodegenException: Error generate insn: 0x0215: INVOKE  
                          (r1v9 'cVar' com.ss.android.ad.splash.core.video.c)
                          (wrap: com.ss.android.ad.splash.core.video.c$3 : 0x0212: CONSTRUCTOR  (r0v58 com.ss.android.ad.splash.core.video.c$3) = (r1v9 'cVar' com.ss.android.ad.splash.core.video.c), (r4v6 'str' java.lang.String) call: com.ss.android.ad.splash.core.video.c.3.<init>(com.ss.android.ad.splash.core.video.c, java.lang.String):void type: CONSTRUCTOR)
                         type: VIRTUAL call: com.ss.android.ad.splash.core.video.c.a(java.lang.Runnable):void in method: com.ss.android.ad.splash.core.video.g.a(com.ss.android.ad.splash.core.video.f):boolean, file: classes10.dex
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
                        	at jadx.core.codegen.RegionGen.makeTryCatch(RegionGen.java:306)
                        	at jadx.core.codegen.RegionGen.makeRegion(RegionGen.java:69)
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
                        Caused by: jadx.core.utils.exceptions.CodegenException: Error generate insn: 0x0212: CONSTRUCTOR  (r0v58 com.ss.android.ad.splash.core.video.c$3) = (r1v9 'cVar' com.ss.android.ad.splash.core.video.c), (r4v6 'str' java.lang.String) call: com.ss.android.ad.splash.core.video.c.3.<init>(com.ss.android.ad.splash.core.video.c, java.lang.String):void type: CONSTRUCTOR in method: com.ss.android.ad.splash.core.video.g.a(com.ss.android.ad.splash.core.video.f):boolean, file: classes10.dex
                        	at jadx.core.codegen.InsnGen.makeInsn(InsnGen.java:255)
                        	at jadx.core.codegen.InsnGen.addWrappedArg(InsnGen.java:119)
                        	at jadx.core.codegen.InsnGen.addArg(InsnGen.java:103)
                        	at jadx.core.codegen.InsnGen.generateMethodArguments(InsnGen.java:806)
                        	at jadx.core.codegen.InsnGen.makeInvoke(InsnGen.java:746)
                        	at jadx.core.codegen.InsnGen.makeInsnBody(InsnGen.java:367)
                        	at jadx.core.codegen.InsnGen.makeInsn(InsnGen.java:249)
                        	... 28 more
                        Caused by: jadx.core.utils.exceptions.JadxRuntimeException: Expected class to be processed at this point, class: com.ss.android.ad.splash.core.video.c, state: GENERATED_AND_UNLOADED
                        	at jadx.core.dex.nodes.ClassNode.ensureProcessed(ClassNode.java:215)
                        	at jadx.core.codegen.InsnGen.makeConstructor(InsnGen.java:630)
                        	at jadx.core.codegen.InsnGen.makeInsnBody(InsnGen.java:363)
                        	at jadx.core.codegen.InsnGen.makeInsn(InsnGen.java:230)
                        	... 34 more
                        */
                    /*
                    // Method dump skipped, instructions count: 609
                    */
                    throw new UnsupportedOperationException("Method not decompiled: com.ss.android.ad.splash.core.video.g.a(com.ss.android.ad.splash.core.video.f):boolean");
                }

                public g(Context context, ViewGroup viewGroup) {
                    this.f58810j = viewGroup;
                    this.s = new WeakReference<>(context);
                    Context applicationContext = context.getApplicationContext();
                    if (a.f107168c && applicationContext == null) {
                        applicationContext = a.f107166a;
                    }
                    e eVar = new e(context, com.a.a(LayoutInflater.from(applicationContext), R.layout.b1m, null, false));
                    this.f58801a = eVar;
                    eVar.f58771m = this;
                    int i2 = Build.VERSION.SDK_INT;
                    this.t = true;
                }

                @Override // com.ss.android.ad.splash.core.video.e.a
                public final void a(int i2, int i3, int i4) {
                    com.ss.android.ad.splash.f.g.b("surfaceChanged, format = " + i2 + ", width = " + i3 + ", height = " + i4);
                }
            }
