package com.ss.android.ugc.aweme.shortvideo.sticker.infoSticker.interact.consume.dialog;

import android.content.res.TypedArray;
import android.os.Build;
import android.os.Bundle;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewParent;
import android.view.Window;
import android.widget.FrameLayout;
import androidx.appcompat.app.h;
import androidx.coordinatorlayout.widget.CoordinatorLayout;
import androidx.core.h.a.d;
import androidx.core.h.v;
import com.a;
import com.bytedance.apm.agent.v2.instrumentation.ClickAgent;
import com.bytedance.covode.number.Covode;
import com.bytedance.frameworks.apm.trace.MethodCollector;
import com.ss.android.ugc.aweme.shortvideo.sticker.infoSticker.interact.consume.dialog.ViewPagerBottomSheetBehavior;
import com.zhiliaoapp.musically.R;

public final class c extends h {

    /* renamed from: a  reason: collision with root package name */
    boolean f130377a;

    /* renamed from: b  reason: collision with root package name */
    boolean f130378b;

    /* renamed from: c  reason: collision with root package name */
    boolean f130379c;

    /* renamed from: d  reason: collision with root package name */
    private ViewPagerBottomSheetBehavior<FrameLayout> f130380d;

    /* renamed from: e  reason: collision with root package name */
    private ViewPagerBottomSheetBehavior.a f130381e;

    static {
        Covode.recordClassIndex(85501);
    }

    /* access modifiers changed from: protected */
    public final void onStart() {
        super.onStart();
        ViewPagerBottomSheetBehavior<FrameLayout> viewPagerBottomSheetBehavior = this.f130380d;
        if (viewPagerBottomSheetBehavior != null && 4 != viewPagerBottomSheetBehavior.f130358f) {
            if (viewPagerBottomSheetBehavior.f130361i == null) {
                viewPagerBottomSheetBehavior.f130358f = 4;
                return;
            }
            V v = viewPagerBottomSheetBehavior.f130361i.get();
            if (v != null) {
                ViewParent parent = v.getParent();
                if (parent == null || !parent.isLayoutRequested() || !v.y(v)) {
                    viewPagerBottomSheetBehavior.b(v, 4);
                } else {
                    v.post(
                    /*  JADX ERROR: Method code generation error
                        jadx.core.utils.exceptions.CodegenException: Error generate insn: 0x0034: INVOKE  
                          (r1v1 'v' V extends android.view.View)
                          (wrap: com.ss.android.ugc.aweme.shortvideo.sticker.infoSticker.interact.consume.dialog.ViewPagerBottomSheetBehavior$1 : 0x0031: CONSTRUCTOR  (r0v6 com.ss.android.ugc.aweme.shortvideo.sticker.infoSticker.interact.consume.dialog.ViewPagerBottomSheetBehavior$1) = 
                          (r3v0 'viewPagerBottomSheetBehavior' com.ss.android.ugc.aweme.shortvideo.sticker.infoSticker.interact.consume.dialog.ViewPagerBottomSheetBehavior<android.widget.FrameLayout>)
                          (r1v1 'v' V extends android.view.View)
                         call: com.ss.android.ugc.aweme.shortvideo.sticker.infoSticker.interact.consume.dialog.ViewPagerBottomSheetBehavior.1.<init>(com.ss.android.ugc.aweme.shortvideo.sticker.infoSticker.interact.consume.dialog.ViewPagerBottomSheetBehavior, android.view.View):void type: CONSTRUCTOR)
                         type: VIRTUAL call: android.view.View.post(java.lang.Runnable):boolean in method: com.ss.android.ugc.aweme.shortvideo.sticker.infoSticker.interact.consume.dialog.c.onStart():void, file: classes10.dex
                        	at jadx.core.codegen.InsnGen.makeInsn(InsnGen.java:255)
                        	at jadx.core.codegen.InsnGen.makeInsn(InsnGen.java:217)
                        	at jadx.core.codegen.RegionGen.makeSimpleBlock(RegionGen.java:110)
                        	at jadx.core.codegen.RegionGen.makeRegion(RegionGen.java:56)
                        	at jadx.core.codegen.RegionGen.makeSimpleRegion(RegionGen.java:93)
                        	at jadx.core.codegen.RegionGen.makeRegion(RegionGen.java:59)
                        	at jadx.core.codegen.RegionGen.makeRegionIndent(RegionGen.java:99)
                        	at jadx.core.codegen.RegionGen.makeIf(RegionGen.java:157)
                        	at jadx.core.codegen.RegionGen.makeRegion(RegionGen.java:63)
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
                        	at jadx.core.codegen.RegionGen.makeRegionIndent(RegionGen.java:99)
                        	at jadx.core.codegen.RegionGen.makeIf(RegionGen.java:143)
                        	at jadx.core.codegen.RegionGen.makeRegion(RegionGen.java:63)
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
                        Caused by: jadx.core.utils.exceptions.CodegenException: Error generate insn: 0x0031: CONSTRUCTOR  (r0v6 com.ss.android.ugc.aweme.shortvideo.sticker.infoSticker.interact.consume.dialog.ViewPagerBottomSheetBehavior$1) = 
                          (r3v0 'viewPagerBottomSheetBehavior' com.ss.android.ugc.aweme.shortvideo.sticker.infoSticker.interact.consume.dialog.ViewPagerBottomSheetBehavior<android.widget.FrameLayout>)
                          (r1v1 'v' V extends android.view.View)
                         call: com.ss.android.ugc.aweme.shortvideo.sticker.infoSticker.interact.consume.dialog.ViewPagerBottomSheetBehavior.1.<init>(com.ss.android.ugc.aweme.shortvideo.sticker.infoSticker.interact.consume.dialog.ViewPagerBottomSheetBehavior, android.view.View):void type: CONSTRUCTOR in method: com.ss.android.ugc.aweme.shortvideo.sticker.infoSticker.interact.consume.dialog.c.onStart():void, file: classes10.dex
                        	at jadx.core.codegen.InsnGen.makeInsn(InsnGen.java:255)
                        	at jadx.core.codegen.InsnGen.addWrappedArg(InsnGen.java:119)
                        	at jadx.core.codegen.InsnGen.addArg(InsnGen.java:103)
                        	at jadx.core.codegen.InsnGen.generateMethodArguments(InsnGen.java:806)
                        	at jadx.core.codegen.InsnGen.makeInvoke(InsnGen.java:746)
                        	at jadx.core.codegen.InsnGen.makeInsnBody(InsnGen.java:367)
                        	at jadx.core.codegen.InsnGen.makeInsn(InsnGen.java:249)
                        	... 33 more
                        Caused by: jadx.core.utils.exceptions.JadxRuntimeException: Expected class to be processed at this point, class: com.ss.android.ugc.aweme.shortvideo.sticker.infoSticker.interact.consume.dialog.ViewPagerBottomSheetBehavior, state: GENERATED_AND_UNLOADED
                        	at jadx.core.dex.nodes.ClassNode.ensureProcessed(ClassNode.java:215)
                        	at jadx.core.codegen.InsnGen.makeConstructor(InsnGen.java:630)
                        	at jadx.core.codegen.InsnGen.makeInsnBody(InsnGen.java:363)
                        	at jadx.core.codegen.InsnGen.makeInsn(InsnGen.java:230)
                        	... 39 more
                        */
                    /*
                        this = this;
                        super.onStart()
                        com.ss.android.ugc.aweme.shortvideo.sticker.infoSticker.interact.consume.dialog.ViewPagerBottomSheetBehavior<android.widget.FrameLayout> r3 = r4.f130380d
                        if (r3 == 0) goto L_0x003b
                        int r0 = r3.f130358f
                        r2 = 4
                        if (r2 == r0) goto L_0x003b
                        java.lang.ref.WeakReference<V extends android.view.View> r0 = r3.f130361i
                        if (r0 != 0) goto L_0x0013
                        r3.f130358f = r2
                        return
                    L_0x0013:
                        java.lang.ref.WeakReference<V extends android.view.View> r0 = r3.f130361i
                        java.lang.Object r1 = r0.get()
                        android.view.View r1 = (android.view.View) r1
                        if (r1 == 0) goto L_0x003b
                        android.view.ViewParent r0 = r1.getParent()
                        if (r0 == 0) goto L_0x0038
                        boolean r0 = r0.isLayoutRequested()
                        if (r0 == 0) goto L_0x0038
                        boolean r0 = androidx.core.h.v.y(r1)
                        if (r0 == 0) goto L_0x0038
                        com.ss.android.ugc.aweme.shortvideo.sticker.infoSticker.interact.consume.dialog.ViewPagerBottomSheetBehavior$1 r0 = new com.ss.android.ugc.aweme.shortvideo.sticker.infoSticker.interact.consume.dialog.ViewPagerBottomSheetBehavior$1
                        r0.<init>(r1)
                        r1.post(r0)
                        return
                    L_0x0038:
                        r3.b(r1, r2)
                    L_0x003b:
                        return
                    */
                    throw new UnsupportedOperationException("Method not decompiled: com.ss.android.ugc.aweme.shortvideo.sticker.infoSticker.interact.consume.dialog.c.onStart():void");
                }

                public final void setCancelable(boolean z) {
                    super.setCancelable(z);
                    if (this.f130377a != z) {
                        this.f130377a = z;
                        ViewPagerBottomSheetBehavior<FrameLayout> viewPagerBottomSheetBehavior = this.f130380d;
                        if (viewPagerBottomSheetBehavior != null) {
                            viewPagerBottomSheetBehavior.f130356d = z;
                        }
                    }
                }

                @Override // androidx.appcompat.app.h, android.app.Dialog
                public final void setContentView(int i2) {
                    super.setContentView(a(i2, null, null));
                }

                @Override // androidx.appcompat.app.h
                public final void onCreate(Bundle bundle) {
                    super.onCreate(bundle);
                    Window window = getWindow();
                    if (window != null) {
                        if (Build.VERSION.SDK_INT >= 21) {
                            window.clearFlags(67108864);
                            window.addFlags(Integer.MIN_VALUE);
                        }
                        window.setLayout(-1, -1);
                    }
                }

                public final void setCanceledOnTouchOutside(boolean z) {
                    super.setCanceledOnTouchOutside(z);
                    if (z && !this.f130377a) {
                        this.f130377a = true;
                    }
                    this.f130378b = z;
                    this.f130379c = true;
                }

                @Override // androidx.appcompat.app.h, android.app.Dialog
                public final void setContentView(View view) {
                    super.setContentView(a(0, view, null));
                }

                /* JADX WARNING: Illegal instructions before constructor call */
                /* Code decompiled incorrectly, please refer to instructions dump. */
                public c(android.content.Context r5, int r6) {
                    /*
                        r4 = this;
                        r3 = 1
                        if (r6 != 0) goto L_0x0017
                        android.util.TypedValue r2 = new android.util.TypedValue
                        r2.<init>()
                        android.content.res.Resources$Theme r1 = r5.getTheme()
                        r0 = 2130969007(0x7f0401af, float:1.7546684E38)
                        boolean r0 = r1.resolveAttribute(r0, r2, r3)
                        if (r0 == 0) goto L_0x0029
                        int r6 = r2.resourceId
                    L_0x0017:
                        r4.<init>(r5, r6)
                        r4.f130377a = r3
                        r4.f130378b = r3
                        com.ss.android.ugc.aweme.shortvideo.sticker.infoSticker.interact.consume.dialog.c$4 r0 = new com.ss.android.ugc.aweme.shortvideo.sticker.infoSticker.interact.consume.dialog.c$4
                        r0.<init>()
                        r4.f130381e = r0
                        r4.cg_()
                        return
                    L_0x0029:
                        r6 = 2131886530(0x7f1201c2, float:1.9407641E38)
                        goto L_0x0017
                    */
                    throw new UnsupportedOperationException("Method not decompiled: com.ss.android.ugc.aweme.shortvideo.sticker.infoSticker.interact.consume.dialog.c.<init>(android.content.Context, int):void");
                }

                @Override // androidx.appcompat.app.h
                public final void setContentView(View view, ViewGroup.LayoutParams layoutParams) {
                    super.setContentView(a(0, view, layoutParams));
                }

                private View a(int i2, View view, ViewGroup.LayoutParams layoutParams) {
                    MethodCollector.i(3227);
                    FrameLayout frameLayout = (FrameLayout) View.inflate(getContext(), R.layout.vy, null);
                    CoordinatorLayout coordinatorLayout = (CoordinatorLayout) frameLayout.findViewById(R.id.af4);
                    if (i2 != 0 && view == null) {
                        view = a.a(getLayoutInflater(), i2, coordinatorLayout, false);
                    }
                    FrameLayout frameLayout2 = (FrameLayout) coordinatorLayout.findViewById(R.id.akq);
                    ViewPagerBottomSheetBehavior<FrameLayout> b2 = ViewPagerBottomSheetBehavior.b(frameLayout2);
                    this.f130380d = b2;
                    b2.a(this);
                    this.f130380d.f130364l = this.f130381e;
                    this.f130380d.f130356d = this.f130377a;
                    if (layoutParams == null) {
                        frameLayout2.addView(view);
                    } else {
                        frameLayout2.addView(view, layoutParams);
                    }
                    coordinatorLayout.findViewById(R.id.epv).setOnClickListener(new View.OnClickListener() {
                        /* class com.ss.android.ugc.aweme.shortvideo.sticker.infoSticker.interact.consume.dialog.c.AnonymousClass1 */

                        static {
                            Covode.recordClassIndex(85502);
                        }

                        public final void onClick(View view) {
                            ClickAgent.onClick(view);
                            if (c.this.f130377a && c.this.isShowing()) {
                                c cVar = c.this;
                                if (!cVar.f130379c) {
                                    int i2 = Build.VERSION.SDK_INT;
                                    TypedArray obtainStyledAttributes = cVar.getContext().obtainStyledAttributes(new int[]{16843611});
                                    cVar.f130378b = obtainStyledAttributes.getBoolean(0, true);
                                    obtainStyledAttributes.recycle();
                                    cVar.f130379c = true;
                                }
                                if (cVar.f130378b) {
                                    c.this.cancel();
                                }
                            }
                        }
                    });
                    v.a(frameLayout2, new androidx.core.h.a() {
                        /* class com.ss.android.ugc.aweme.shortvideo.sticker.infoSticker.interact.consume.dialog.c.AnonymousClass2 */

                        static {
                            Covode.recordClassIndex(85503);
                        }

                        @Override // androidx.core.h.a
                        public final void a(View view, d dVar) {
                            super.a(view, dVar);
                            if (c.this.f130377a) {
                                dVar.a(1048576);
                                dVar.e(true);
                                return;
                            }
                            dVar.e(false);
                        }

                        @Override // androidx.core.h.a
                        public final boolean a(View view, int i2, Bundle bundle) {
                            if (i2 != 1048576 || !c.this.f130377a) {
                                return super.a(view, i2, bundle);
                            }
                            c.this.cancel();
                            return true;
                        }
                    });
                    frameLayout2.setOnTouchListener(new View.OnTouchListener() {
                        /* class com.ss.android.ugc.aweme.shortvideo.sticker.infoSticker.interact.consume.dialog.c.AnonymousClass3 */

                        static {
                            Covode.recordClassIndex(85504);
                        }

                        public final boolean onTouch(View view, MotionEvent motionEvent) {
                            return true;
                        }
                    });
                    MethodCollector.o(3227);
                    return frameLayout;
                }
            }
