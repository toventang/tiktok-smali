package com.ss.android.ugc.aweme.promote;

import android.app.Activity;
import android.content.SharedPreferences;
import android.os.Message;
import android.text.Layout;
import android.text.SpannableString;
import android.text.TextPaint;
import android.text.TextUtils;
import android.text.style.ClickableSpan;
import android.view.LayoutInflater;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import android.view.Window;
import android.view.WindowManager;
import android.widget.TextView;
import com.bytedance.apm.agent.v2.instrumentation.ClickAgent;
import com.bytedance.common.utility.collection.WeakHandler;
import com.bytedance.common.utility.n;
import com.bytedance.covode.number.Covode;
import com.bytedance.frameworks.apm.trace.MethodCollector;
import com.bytedance.ies.dmt.ui.dialog.a;
import com.bytedance.tux.g.b;
import com.ss.android.ugc.aweme.app.SharePrefCache;
import com.ss.android.ugc.aweme.app.f.d;
import com.ss.android.ugc.aweme.views.TextClickable;
import com.ss.android.ugc.aweme.views.o;
import com.zhiliaoapp.musically.R;
import java.util.HashMap;
import java.util.Map;
import java.util.regex.Pattern;
import org.greenrobot.eventbus.EventBus;
import org.greenrobot.eventbus.ThreadMode;
import org.greenrobot.eventbus.g;
import org.greenrobot.eventbus.i;
import org.greenrobot.eventbus.j;
import org.greenrobot.eventbus.r;

public class e extends o implements WeakHandler.IHandler, i, j {

    /* renamed from: a  reason: collision with root package name */
    String f118148a;

    /* renamed from: b  reason: collision with root package name */
    public String f118149b;

    /* renamed from: c  reason: collision with root package name */
    TextView f118150c;

    /* renamed from: d  reason: collision with root package name */
    TextView f118151d;

    /* renamed from: e  reason: collision with root package name */
    TextView f118152e;

    /* renamed from: f  reason: collision with root package name */
    View f118153f;

    /* renamed from: g  reason: collision with root package name */
    View f118154g;

    /* renamed from: h  reason: collision with root package name */
    View f118155h;

    /* renamed from: i  reason: collision with root package name */
    public Activity f118156i;

    /* renamed from: j  reason: collision with root package name */
    public a f118157j;

    /* renamed from: k  reason: collision with root package name */
    public WeakHandler f118158k;
    private String n;
    private View o;
    private com.ss.android.ugc.aweme.views.i p;

    static {
        Covode.recordClassIndex(76732);
    }

    @Override // org.greenrobot.eventbus.i
    public Map<Integer, Object> getSubscriberEventTypes() {
        HashMap hashMap = new HashMap();
        hashMap.put(170, new g(e.class, "closeKrCopyright", f.class, ThreadMode.POSTING, 0, false));
        return hashMap;
    }

    public void dismiss() {
        super.dismiss();
        a(false);
    }

    public void show() {
        super.show();
        a.a(true, this.f118155h);
    }

    public void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        EventBus a2 = EventBus.a();
        if (a2.a(this)) {
            a2.b(this);
        }
    }

    @r
    public void closeKrCopyright(f fVar) {
        dismiss();
    }

    public final void a(boolean z) {
        if (z) {
            if (this.p == null) {
                this.p = new com.ss.android.ugc.aweme.views.i(this.f118156i);
            }
            this.p.show();
            return;
        }
        com.ss.android.ugc.aweme.views.i iVar = this.p;
        if (iVar != null) {
            iVar.dismiss();
        }
    }

    @Override // com.bytedance.common.utility.collection.WeakHandler.IHandler
    public void handleMsg(Message message) {
        a(false);
        Object obj = message.obj;
        int i2 = message.what;
        if (obj instanceof com.ss.android.ugc.aweme.base.api.a.b.a) {
            new b(this.f118156i).a(((com.ss.android.ugc.aweme.base.api.a.b.a) obj).getErrorMsg()).b();
        } else if (obj instanceof Exception) {
            new b(this.f118156i).a(getContext().getResources().getString(R.string.de9)).b();
        } else if ((obj instanceof PromoteProgramResponse) && i2 == 1 && ((PromoteProgramResponse) obj).isConfirmedSuccess()) {
            dismiss();
            SharedPreferences.Editor edit = g.a().edit();
            edit.putBoolean("joined", true);
            edit.apply();
        }
    }

    public e(Activity activity, String str) {
        super(activity, R.style.zo, false, true, true);
        MethodCollector.i(3150);
        this.f118156i = activity;
        this.n = str;
        setCancelable(false);
        EventBus a2 = EventBus.a();
        if (!a2.a(this)) {
            EventBus.a(a2, this);
        }
        View inflate = LayoutInflater.from(activity).inflate(R.layout.xk, (ViewGroup) null);
        this.o = inflate;
        setContentView(inflate);
        Window window = getWindow();
        WindowManager.LayoutParams attributes = window.getAttributes();
        attributes.dimAmount = a.f33386h;
        window.addFlags(2);
        window.setAttributes(attributes);
        window.setWindowAnimations(0);
        attributes.width = (int) n.b(getContext(), 280.0f);
        this.f118148a = this.o.getContext().getString(R.string.ezu);
        this.f118150c = (TextView) this.o.findViewById(R.id.f9l);
        this.f118151d = (TextView) this.o.findViewById(R.id.f2z);
        this.f118152e = (TextView) this.o.findViewById(R.id.f52);
        this.f118153f = this.o.findViewById(R.id.yu);
        this.f118154g = this.o.findViewById(R.id.z8);
        this.f118155h = this.o.findViewById(R.id.dqe);
        this.f118157j = new h();
        String c2 = SharePrefCache.inst().getPromoteDialogPopupPopupUrl().c();
        this.f118149b = TextUtils.isEmpty(c2) ? "" : c2;
        String c3 = SharePrefCache.inst().getPromoteDialogPopupPopupLinkText().c();
        this.f118148a = TextUtils.isEmpty(c3) ? this.f118148a : c3;
        this.f118158k = new WeakHandler(this);
        final Integer c4 = SharePrefCache.inst().getPromoteDialogPopupClickType().c();
        this.f118153f.setOnClickListener(new View.OnClickListener() {
            /* class com.ss.android.ugc.aweme.promote.e.AnonymousClass1 */

            static {
                Covode.recordClassIndex(76733);
            }

            public final void onClick(View view) {
                ClickAgent.onClick(view);
                com.ss.android.ugc.aweme.common.r.a("creative_permission_yes", new d().f66730a);
                if (c4.intValue() == 0) {
                    e.this.a(true);
                    com.ss.android.ugc.aweme.base.n.a().a(e.this.f118158k, 
                    /*  JADX ERROR: Method code generation error
                        jadx.core.utils.exceptions.CodegenException: Error generate insn: 0x002a: INVOKE  
                          (wrap: com.ss.android.ugc.aweme.base.n : 0x0021: INVOKE  (r1v2 com.ss.android.ugc.aweme.base.n) =  type: STATIC call: com.ss.android.ugc.aweme.base.n.a():com.ss.android.ugc.aweme.base.n)
                          (wrap: com.bytedance.common.utility.collection.WeakHandler : 0x001f: IGET  (r2v1 com.bytedance.common.utility.collection.WeakHandler) = 
                          (wrap: com.ss.android.ugc.aweme.promote.e : 0x001d: IGET  (r0v12 com.ss.android.ugc.aweme.promote.e) = (r4v0 'this' com.ss.android.ugc.aweme.promote.e$1 A[IMMUTABLE_TYPE, THIS]) com.ss.android.ugc.aweme.promote.e.1.b com.ss.android.ugc.aweme.promote.e)
                         com.ss.android.ugc.aweme.promote.e.k com.bytedance.common.utility.collection.WeakHandler)
                          (wrap: com.ss.android.ugc.aweme.promote.PromoteProgramRequestApiManager$1 : 0x0027: CONSTRUCTOR  (r0v13 com.ss.android.ugc.aweme.promote.PromoteProgramRequestApiManager$1) =  call: com.ss.android.ugc.aweme.promote.PromoteProgramRequestApiManager.1.<init>():void type: CONSTRUCTOR)
                          (1 int)
                         type: VIRTUAL call: com.ss.android.ugc.aweme.base.n.a(android.os.Handler, java.util.concurrent.Callable, int):void in method: com.ss.android.ugc.aweme.promote.e.1.onClick(android.view.View):void, file: classes2.dex
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
                        	at jadx.core.codegen.MethodGen.addRegionInsns(MethodGen.java:244)
                        	at jadx.core.codegen.MethodGen.addInstructions(MethodGen.java:237)
                        	at jadx.core.codegen.ClassGen.addMethodCode(ClassGen.java:342)
                        	at jadx.core.codegen.ClassGen.addMethod(ClassGen.java:295)
                        	at jadx.core.codegen.ClassGen.lambda$addInnerClsAndMethods$2(ClassGen.java:264)
                        	at java.base/java.util.stream.ForEachOps$ForEachOp$OfRef.accept(ForEachOps.java:183)
                        	at java.base/java.util.ArrayList.forEach(ArrayList.java:1511)
                        	at java.base/java.util.stream.SortedOps$RefSortingSink.end(SortedOps.java:395)
                        	at java.base/java.util.stream.Sink$ChainedReference.end(Sink.java:258)
                        Caused by: jadx.core.utils.exceptions.CodegenException: Error generate insn: 0x0027: CONSTRUCTOR  (r0v13 com.ss.android.ugc.aweme.promote.PromoteProgramRequestApiManager$1) =  call: com.ss.android.ugc.aweme.promote.PromoteProgramRequestApiManager.1.<init>():void type: CONSTRUCTOR in method: com.ss.android.ugc.aweme.promote.e.1.onClick(android.view.View):void, file: classes2.dex
                        	at jadx.core.codegen.InsnGen.makeInsn(InsnGen.java:255)
                        	at jadx.core.codegen.InsnGen.addWrappedArg(InsnGen.java:119)
                        	at jadx.core.codegen.InsnGen.addArg(InsnGen.java:103)
                        	at jadx.core.codegen.InsnGen.generateMethodArguments(InsnGen.java:806)
                        	at jadx.core.codegen.InsnGen.makeInvoke(InsnGen.java:746)
                        	at jadx.core.codegen.InsnGen.makeInsnBody(InsnGen.java:367)
                        	at jadx.core.codegen.InsnGen.makeInsn(InsnGen.java:249)
                        	... 19 more
                        Caused by: jadx.core.utils.exceptions.JadxRuntimeException: Expected class to be processed at this point, class: com.ss.android.ugc.aweme.promote.PromoteProgramRequestApiManager, state: GENERATED_AND_UNLOADED
                        	at jadx.core.dex.nodes.ClassNode.ensureProcessed(ClassNode.java:215)
                        	at jadx.core.codegen.InsnGen.makeConstructor(InsnGen.java:630)
                        	at jadx.core.codegen.InsnGen.makeInsnBody(InsnGen.java:363)
                        	at jadx.core.codegen.InsnGen.makeInsn(InsnGen.java:230)
                        	... 25 more
                        */
                    /*
                        this = this;
                        com.bytedance.apm.agent.v2.instrumentation.ClickAgent.onClick(r5)
                        com.ss.android.ugc.aweme.app.f.d r0 = new com.ss.android.ugc.aweme.app.f.d
                        r0.<init>()
                        java.util.Map<java.lang.String, java.lang.String> r1 = r0.f66730a
                        java.lang.String r0 = "creative_permission_yes"
                        com.ss.android.ugc.aweme.common.r.a(r0, r1)
                        java.lang.Integer r0 = r2
                        int r0 = r0.intValue()
                        r3 = 1
                        if (r0 != 0) goto L_0x002e
                        com.ss.android.ugc.aweme.promote.e r0 = com.ss.android.ugc.aweme.promote.e.this
                        r0.a(r3)
                        com.ss.android.ugc.aweme.promote.e r0 = com.ss.android.ugc.aweme.promote.e.this
                        com.bytedance.common.utility.collection.WeakHandler r2 = r0.f118158k
                        com.ss.android.ugc.aweme.base.n r1 = com.ss.android.ugc.aweme.base.n.a()
                        com.ss.android.ugc.aweme.promote.PromoteProgramRequestApiManager$1 r0 = new com.ss.android.ugc.aweme.promote.PromoteProgramRequestApiManager$1
                        r0.<init>()
                        r1.a(r2, r0, r3)
                        return
                    L_0x002e:
                        java.lang.Integer r0 = r2
                        int r0 = r0.intValue()
                        if (r0 != r3) goto L_0x0049
                        com.ss.android.ugc.aweme.promote.e r0 = com.ss.android.ugc.aweme.promote.e.this
                        com.ss.android.ugc.aweme.promote.a r3 = r0.f118157j
                        com.ss.android.ugc.aweme.promote.e r0 = com.ss.android.ugc.aweme.promote.e.this
                        android.app.Activity r2 = r0.f118156i
                        com.ss.android.ugc.aweme.promote.e r0 = com.ss.android.ugc.aweme.promote.e.this
                        java.lang.String r1 = r0.f118149b
                        com.ss.android.ugc.aweme.promote.e r0 = com.ss.android.ugc.aweme.promote.e.this
                        java.lang.String r0 = r0.f118148a
                        r3.a(r2, r1, r0)
                    L_0x0049:
                        return
                    */
                    throw new UnsupportedOperationException("Method not decompiled: com.ss.android.ugc.aweme.promote.e.AnonymousClass1.onClick(android.view.View):void");
                }
            });
            this.f118154g.setOnClickListener(new View.OnClickListener() {
                /* class com.ss.android.ugc.aweme.promote.e.AnonymousClass2 */

                static {
                    Covode.recordClassIndex(76734);
                }

                public final void onClick(View view) {
                    ClickAgent.onClick(view);
                    e.this.a(true);
                    com.ss.android.ugc.aweme.common.r.a("creative_permission_no", new d().f66730a);
                    com.ss.android.ugc.aweme.base.n.a().a(null, 
                    /*  JADX ERROR: Method code generation error
                        jadx.core.utils.exceptions.CodegenException: Error generate insn: 0x001f: INVOKE  
                          (wrap: com.ss.android.ugc.aweme.base.n : 0x0015: INVOKE  (r2v0 com.ss.android.ugc.aweme.base.n) =  type: STATIC call: com.ss.android.ugc.aweme.base.n.a():com.ss.android.ugc.aweme.base.n)
                          (null android.os.Handler)
                          (wrap: com.ss.android.ugc.aweme.promote.PromoteProgramRequestApiManager$2 : 0x001b: CONSTRUCTOR  (r1v1 com.ss.android.ugc.aweme.promote.PromoteProgramRequestApiManager$2) =  call: com.ss.android.ugc.aweme.promote.PromoteProgramRequestApiManager.2.<init>():void type: CONSTRUCTOR)
                          (1 int)
                         type: VIRTUAL call: com.ss.android.ugc.aweme.base.n.a(android.os.Handler, java.util.concurrent.Callable, int):void in method: com.ss.android.ugc.aweme.promote.e.2.onClick(android.view.View):void, file: classes2.dex
                        	at jadx.core.codegen.InsnGen.makeInsn(InsnGen.java:255)
                        	at jadx.core.codegen.InsnGen.makeInsn(InsnGen.java:217)
                        	at jadx.core.codegen.RegionGen.makeSimpleBlock(RegionGen.java:110)
                        	at jadx.core.codegen.RegionGen.makeRegion(RegionGen.java:56)
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
                        Caused by: jadx.core.utils.exceptions.CodegenException: Error generate insn: 0x001b: CONSTRUCTOR  (r1v1 com.ss.android.ugc.aweme.promote.PromoteProgramRequestApiManager$2) =  call: com.ss.android.ugc.aweme.promote.PromoteProgramRequestApiManager.2.<init>():void type: CONSTRUCTOR in method: com.ss.android.ugc.aweme.promote.e.2.onClick(android.view.View):void, file: classes2.dex
                        	at jadx.core.codegen.InsnGen.makeInsn(InsnGen.java:255)
                        	at jadx.core.codegen.InsnGen.addWrappedArg(InsnGen.java:119)
                        	at jadx.core.codegen.InsnGen.addArg(InsnGen.java:103)
                        	at jadx.core.codegen.InsnGen.generateMethodArguments(InsnGen.java:806)
                        	at jadx.core.codegen.InsnGen.makeInvoke(InsnGen.java:746)
                        	at jadx.core.codegen.InsnGen.makeInsnBody(InsnGen.java:367)
                        	at jadx.core.codegen.InsnGen.makeInsn(InsnGen.java:249)
                        	... 14 more
                        Caused by: jadx.core.utils.exceptions.JadxRuntimeException: Expected class to be processed at this point, class: com.ss.android.ugc.aweme.promote.PromoteProgramRequestApiManager, state: GENERATED_AND_UNLOADED
                        	at jadx.core.dex.nodes.ClassNode.ensureProcessed(ClassNode.java:215)
                        	at jadx.core.codegen.InsnGen.makeConstructor(InsnGen.java:630)
                        	at jadx.core.codegen.InsnGen.makeInsnBody(InsnGen.java:363)
                        	at jadx.core.codegen.InsnGen.makeInsn(InsnGen.java:230)
                        	... 20 more
                        */
                    /*
                        this = this;
                        com.bytedance.apm.agent.v2.instrumentation.ClickAgent.onClick(r5)
                        com.ss.android.ugc.aweme.promote.e r0 = com.ss.android.ugc.aweme.promote.e.this
                        r3 = 1
                        r0.a(r3)
                        com.ss.android.ugc.aweme.app.f.d r0 = new com.ss.android.ugc.aweme.app.f.d
                        r0.<init>()
                        java.util.Map<java.lang.String, java.lang.String> r1 = r0.f66730a
                        java.lang.String r0 = "creative_permission_no"
                        com.ss.android.ugc.aweme.common.r.a(r0, r1)
                        com.ss.android.ugc.aweme.base.n r2 = com.ss.android.ugc.aweme.base.n.a()
                        com.ss.android.ugc.aweme.promote.PromoteProgramRequestApiManager$2 r1 = new com.ss.android.ugc.aweme.promote.PromoteProgramRequestApiManager$2
                        r1.<init>()
                        r0 = 0
                        r2.a(r0, r1, r3)
                        com.ss.android.ugc.aweme.promote.e r0 = com.ss.android.ugc.aweme.promote.e.this
                        r0.dismiss()
                        return
                    */
                    throw new UnsupportedOperationException("Method not decompiled: com.ss.android.ugc.aweme.promote.e.AnonymousClass2.onClick(android.view.View):void");
                }
            });
            String c5 = SharePrefCache.inst().getPromoteDialogPopupPopupTitle().c();
            String c6 = SharePrefCache.inst().getPromoteDialogPopupPopupMsg().c();
            String c7 = SharePrefCache.inst().getPromoteDialogPopupPopupContent().c();
            if (!TextUtils.isEmpty(c5)) {
                this.f118150c.setText(c5);
            }
            if (this.f118150c.getText() != null) {
                if (c4.intValue() == 0) {
                    TextView textView = this.f118150c;
                    textView.setText(textView.getText().toString().replaceAll("!", "").replaceAll("！", ""));
                }
                TextView textView2 = this.f118150c;
                textView2.setText(textView2.getText().toString().replaceAll("\\\\n", "\n"));
            }
            if (!TextUtils.isEmpty(c6)) {
                this.f118151d.setText(c6);
            } else {
                this.f118151d.setVisibility(8);
            }
            if (!TextUtils.isEmpty(c7)) {
                this.f118152e.setText(c7);
            }
            TextClickable textClickable = new TextClickable();
            textClickable.f144569d = Pattern.compile(this.f118148a);
            textClickable.f144567b = 0;
            TextView textView3 = this.f118152e;
            if (textView3 != null) {
                SpannableString spannableString = new SpannableString(textView3.getText());
                if (textClickable.a(spannableString)) {
                    textView3.setText(spannableString);
                    textView3.setOnTouchListener(new View.OnTouchListener(spannableString) {
                        /* class com.ss.android.ugc.aweme.views.TextClickable.AnonymousClass1 */

                        /* renamed from: a  reason: collision with root package name */
                        final /* synthetic */ SpannableString f144573a;

                        static {
                            Covode.recordClassIndex(94606);
                        }

                        {
                            this.f144573a = r2;
                        }

                        public final boolean onTouch(View view, MotionEvent motionEvent) {
                            TextView textView = (TextView) view;
                            if (motionEvent.getAction() == 1) {
                                int x = (int) motionEvent.getX();
                                int y = (int) motionEvent.getY();
                                int totalPaddingLeft = x - textView.getTotalPaddingLeft();
                                int totalPaddingTop = y - textView.getTotalPaddingTop();
                                int scrollX = totalPaddingLeft + textView.getScrollX();
                                int scrollY = totalPaddingTop + textView.getScrollY();
                                Layout layout = textView.getLayout();
                                if (layout == null) {
                                    return false;
                                }
                                int offsetForHorizontal = layout.getOffsetForHorizontal(layout.getLineForVertical(scrollY), (float) scrollX);
                                ClickableSpan[] clickableSpanArr = (ClickableSpan[]) this.f144573a.getSpans(offsetForHorizontal, offsetForHorizontal, ClickableSpan.class);
                                if (clickableSpanArr.length != 0) {
                                    clickableSpanArr[0].onClick(textView);
                                }
                            }
                            return true;
                        }
                    });
                }
            }
            textClickable.f144568c = new TextClickable.a() {
                /* class com.ss.android.ugc.aweme.promote.e.AnonymousClass3 */

                static {
                    Covode.recordClassIndex(76735);
                }

                @Override // com.ss.android.ugc.aweme.views.TextClickable.a
                public final void a(TextPaint textPaint) {
                    textPaint.setFakeBoldText(true);
                    textPaint.setColor(androidx.core.content.b.c(e.this.f118156i, R.color.c1));
                    textPaint.setUnderlineText(true);
                }

                @Override // com.ss.android.ugc.aweme.views.TextClickable.a
                public final void a(String str) {
                    if (e.this.f118148a.equals(str)) {
                        e.this.f118157j.a(e.this.f118156i, e.this.f118149b, e.this.f118148a);
                    }
                }
            };
            MethodCollector.o(3150);
        }
    }
