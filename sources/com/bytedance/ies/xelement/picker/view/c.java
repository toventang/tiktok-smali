package com.bytedance.ies.xelement.picker.view;

import android.content.Context;
import android.text.TextUtils;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.LinearLayout;
import android.widget.RelativeLayout;
import android.widget.TextView;
import com.bytedance.covode.number.Covode;
import com.bytedance.frameworks.apm.trace.MethodCollector;
import com.bytedance.ies.xelement.picker.c.a;
import com.bytedance.ies.xelement.picker.c.b;
import com.zhiliaoapp.musically.R;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;

public final class c extends a implements View.OnClickListener {

    /* renamed from: j  reason: collision with root package name */
    private f f37316j;

    /* renamed from: k  reason: collision with root package name */
    private b f37317k;

    static {
        Covode.recordClassIndex(22433);
    }

    /* access modifiers changed from: protected */
    @Override // com.bytedance.ies.xelement.picker.view.a
    public final a a() {
        return this.f37317k;
    }

    @Override // com.bytedance.ies.xelement.picker.view.a
    public final boolean h() {
        return this.f37317k.w;
    }

    public final void onClick(View view) {
        String str = (String) view.getTag();
        if (str.equals("submit")) {
            if (this.f37317k.E != null) {
                this.f37317k.E.a(new ArrayList(this.f37316j.f37340d));
            }
            this.f37302i = true;
        } else if (str.equals("cancel")) {
            if (this.f37317k.f37256a != null) {
                this.f37317k.f37256a.a();
            }
            this.f37302i = true;
        }
        e();
    }

    public c(b bVar) {
        super(bVar.f37261f);
        String str;
        String str2;
        String str3;
        MethodCollector.i(10039);
        this.f37317k = bVar;
        Context context = bVar.f37261f;
        g();
        b();
        c();
        if (this.f37317k.f37257b == null) {
            LayoutInflater.from(context).inflate(this.f37317k.f37258c, this.f37294a);
            TextView textView = (TextView) a(R.id.ev1);
            RelativeLayout relativeLayout = (RelativeLayout) a(R.id.drr);
            Button button = (Button) a(R.id.xl);
            Button button2 = (Button) a(R.id.xj);
            button.setTag("submit");
            button2.setTag("cancel");
            button.setOnClickListener(this);
            button2.setOnClickListener(this);
            Map<String, String> a2 = this.f37317k.L.a();
            if (TextUtils.isEmpty(this.f37317k.f37262g)) {
                str = a2.get("confirm");
            } else {
                str = this.f37317k.f37262g;
            }
            button.setText(str);
            if (TextUtils.isEmpty(this.f37317k.f37263h)) {
                str2 = a2.get("cancel");
            } else {
                str2 = this.f37317k.f37263h;
            }
            button2.setText(str2);
            if (TextUtils.isEmpty(this.f37317k.f37264i)) {
                str3 = "";
            } else {
                str3 = this.f37317k.f37264i;
            }
            textView.setText(str3);
            button.setTextColor(this.f37317k.f37265j);
            button2.setTextColor(this.f37317k.f37266k);
            textView.setTextColor(this.f37317k.f37267l);
            relativeLayout.setBackgroundColor(this.f37317k.n);
            button.setTextSize((float) this.f37317k.o);
            button2.setTextSize((float) this.f37317k.o);
            textView.setTextSize((float) this.f37317k.p);
        } else {
            LayoutInflater.from(context).inflate(this.f37317k.f37258c, this.f37294a);
        }
        LinearLayout linearLayout = (LinearLayout) a(R.id.czy);
        linearLayout.setBackgroundColor(this.f37317k.f37268m);
        f fVar = new f(linearLayout);
        this.f37316j = fVar;
        fVar.f37342f = this.f37317k;
        if (this.f37317k.D != null) {
            this.f37316j.f37341e = this.f37317k.D;
        }
        List<List<String>> list = this.f37317k.F;
        f fVar2 = this.f37316j;
        if (fVar2 != null) {
            if (list == null) {
                fVar2.f37339c = null;
                fVar2.f37338b.clear();
                if (fVar2.f37337a instanceof ViewGroup) {
                    ((ViewGroup) fVar2.f37337a).removeAllViews();
                }
            } else {
                if (fVar2.f37339c == null) {
                    fVar2.f37339c = new ArrayList();
                } else {
                    fVar2.f37339c.clear();
                }
                fVar2.f37339c.addAll(list);
                for (int i2 = 0; i2 < list.size(); i2++) {
                    List<String> list2 = list.get(i2);
                    if (list2 != null) {
                        while (fVar2.f37338b.size() <= i2) {
                            WheelView wheelView = new WheelView(fVar2.f37337a.getContext());
                            wheelView.setLocalizeAdapter(fVar2.f37342f.L);
                            LinearLayout.LayoutParams layoutParams = new LinearLayout.LayoutParams(0, -1);
                            layoutParams.weight = 1.0f;
                            wheelView.setLayoutParams(layoutParams);
                            wheelView.setOnItemSelectedListener(
                            /*  JADX ERROR: Method code generation error
                                jadx.core.utils.exceptions.CodegenException: Error generate insn: 0x020a: INVOKE  
                                  (r8v0 'wheelView' com.bytedance.ies.xelement.picker.view.WheelView)
                                  (wrap: com.bytedance.ies.xelement.picker.view.f$1 : 0x0207: CONSTRUCTOR  (r0v67 com.bytedance.ies.xelement.picker.view.f$1) = (r3v0 'fVar2' com.bytedance.ies.xelement.picker.view.f), (r5v1 'i2' int) call: com.bytedance.ies.xelement.picker.view.f.1.<init>(com.bytedance.ies.xelement.picker.view.f, int):void type: CONSTRUCTOR)
                                 type: VIRTUAL call: com.bytedance.ies.xelement.picker.view.WheelView.setOnItemSelectedListener(com.bytedance.ies.xelement.picker.e.f):void in method: com.bytedance.ies.xelement.picker.view.c.<init>(com.bytedance.ies.xelement.picker.c.b):void, file: classes9.dex
                                	at jadx.core.codegen.InsnGen.makeInsn(InsnGen.java:255)
                                	at jadx.core.codegen.InsnGen.makeInsn(InsnGen.java:217)
                                	at jadx.core.codegen.RegionGen.makeSimpleBlock(RegionGen.java:110)
                                	at jadx.core.codegen.RegionGen.makeRegion(RegionGen.java:56)
                                	at jadx.core.codegen.RegionGen.makeSimpleRegion(RegionGen.java:93)
                                	at jadx.core.codegen.RegionGen.makeRegion(RegionGen.java:59)
                                	at jadx.core.codegen.RegionGen.makeRegionIndent(RegionGen.java:99)
                                	at jadx.core.codegen.RegionGen.makeLoop(RegionGen.java:239)
                                	at jadx.core.codegen.RegionGen.makeRegion(RegionGen.java:67)
                                	at jadx.core.codegen.RegionGen.makeSimpleRegion(RegionGen.java:93)
                                	at jadx.core.codegen.RegionGen.makeRegion(RegionGen.java:59)
                                	at jadx.core.codegen.RegionGen.makeRegionIndent(RegionGen.java:99)
                                	at jadx.core.codegen.RegionGen.makeIf(RegionGen.java:143)
                                	at jadx.core.codegen.RegionGen.makeRegion(RegionGen.java:63)
                                	at jadx.core.codegen.RegionGen.makeSimpleRegion(RegionGen.java:93)
                                	at jadx.core.codegen.RegionGen.makeRegion(RegionGen.java:59)
                                	at jadx.core.codegen.RegionGen.makeRegionIndent(RegionGen.java:99)
                                	at jadx.core.codegen.RegionGen.makeLoop(RegionGen.java:210)
                                	at jadx.core.codegen.RegionGen.makeRegion(RegionGen.java:67)
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
                                	at jadx.core.codegen.MethodGen.addRegionInsns(MethodGen.java:244)
                                	at jadx.core.codegen.MethodGen.addInstructions(MethodGen.java:237)
                                	at jadx.core.codegen.ClassGen.addMethodCode(ClassGen.java:342)
                                	at jadx.core.codegen.ClassGen.addMethod(ClassGen.java:295)
                                	at jadx.core.codegen.ClassGen.lambda$addInnerClsAndMethods$2(ClassGen.java:264)
                                	at java.base/java.util.stream.ForEachOps$ForEachOp$OfRef.accept(ForEachOps.java:183)
                                	at java.base/java.util.ArrayList.forEach(ArrayList.java:1511)
                                	at java.base/java.util.stream.SortedOps$RefSortingSink.end(SortedOps.java:395)
                                	at java.base/java.util.stream.Sink$ChainedReference.end(Sink.java:258)
                                Caused by: jadx.core.utils.exceptions.CodegenException: Error generate insn: 0x0207: CONSTRUCTOR  (r0v67 com.bytedance.ies.xelement.picker.view.f$1) = (r3v0 'fVar2' com.bytedance.ies.xelement.picker.view.f), (r5v1 'i2' int) call: com.bytedance.ies.xelement.picker.view.f.1.<init>(com.bytedance.ies.xelement.picker.view.f, int):void type: CONSTRUCTOR in method: com.bytedance.ies.xelement.picker.view.c.<init>(com.bytedance.ies.xelement.picker.c.b):void, file: classes9.dex
                                	at jadx.core.codegen.InsnGen.makeInsn(InsnGen.java:255)
                                	at jadx.core.codegen.InsnGen.addWrappedArg(InsnGen.java:119)
                                	at jadx.core.codegen.InsnGen.addArg(InsnGen.java:103)
                                	at jadx.core.codegen.InsnGen.generateMethodArguments(InsnGen.java:806)
                                	at jadx.core.codegen.InsnGen.makeInvoke(InsnGen.java:746)
                                	at jadx.core.codegen.InsnGen.makeInsnBody(InsnGen.java:367)
                                	at jadx.core.codegen.InsnGen.makeInsn(InsnGen.java:249)
                                	... 41 more
                                Caused by: jadx.core.utils.exceptions.JadxRuntimeException: Expected class to be processed at this point, class: com.bytedance.ies.xelement.picker.view.f, state: GENERATED_AND_UNLOADED
                                	at jadx.core.dex.nodes.ClassNode.ensureProcessed(ClassNode.java:215)
                                	at jadx.core.codegen.InsnGen.makeConstructor(InsnGen.java:630)
                                	at jadx.core.codegen.InsnGen.makeInsnBody(InsnGen.java:363)
                                	at jadx.core.codegen.InsnGen.makeInsn(InsnGen.java:230)
                                	... 47 more
                                */
                            /*
                            // Method dump skipped, instructions count: 632
                            */
                            throw new UnsupportedOperationException("Method not decompiled: com.bytedance.ies.xelement.picker.view.c.<init>(com.bytedance.ies.xelement.picker.c.b):void");
                        }
                    }
