package com.bytedance.ies.xelement.picker.view;

import android.content.Context;
import android.text.TextUtils;
import android.view.LayoutInflater;
import android.view.View;
import android.widget.Button;
import android.widget.LinearLayout;
import android.widget.RelativeLayout;
import android.widget.TextView;
import com.bytedance.covode.number.Covode;
import com.bytedance.frameworks.apm.trace.MethodCollector;
import com.bytedance.ies.xelement.picker.a.b;
import com.bytedance.ies.xelement.picker.c.a;
import com.bytedance.ies.xelement.picker.c.c;
import com.bytedance.ies.xelement.picker.e.f;
import com.zhiliaoapp.musically.R;
import java.util.Calendar;
import java.util.Locale;
import java.util.Map;

public final class d extends a implements View.OnClickListener {

    /* renamed from: j  reason: collision with root package name */
    public c f37318j;

    /* renamed from: k  reason: collision with root package name */
    private g f37319k;

    static {
        Covode.recordClassIndex(22434);
    }

    /* access modifiers changed from: protected */
    @Override // com.bytedance.ies.xelement.picker.view.a
    public final a a() {
        return this.f37318j;
    }

    @Override // com.bytedance.ies.xelement.picker.view.a
    public final boolean h() {
        return this.f37318j.w;
    }

    public final String i() {
        String str;
        if (this.f37318j.Y != null) {
            str = this.f37318j.Y;
        } else {
            str = ":";
        }
        boolean[] zArr = this.f37318j.G;
        Calendar calendar = this.f37319k.f37351g;
        int i2 = calendar.get(11);
        int i3 = calendar.get(12);
        int i4 = calendar.get(13);
        if (zArr == null || zArr.length != 3) {
            return com.a.a(Locale.getDefault(), "%02d%s%02d%s%02d", new Object[]{Integer.valueOf(i2), str, Integer.valueOf(i3), str, Integer.valueOf(i4)});
        } else if (zArr[2]) {
            return com.a.a(Locale.getDefault(), "%02d%s%02d%s%02d", new Object[]{Integer.valueOf(i2), str, Integer.valueOf(i3), str, Integer.valueOf(i4)});
        } else if (zArr[1]) {
            return com.a.a(Locale.getDefault(), "%02d%s%02d", new Object[]{Integer.valueOf(i2), str, Integer.valueOf(i3)});
        } else {
            return com.a.a(Locale.getDefault(), "%02d", new Object[]{Integer.valueOf(i2)});
        }
    }

    public final void onClick(View view) {
        String str = (String) view.getTag();
        if (str.equals("submit")) {
            if (this.f37318j.D != null) {
                this.f37318j.D.a(i());
            }
            this.f37302i = true;
        } else if (str.equals("cancel")) {
            if (this.f37318j.f37256a != null) {
                this.f37318j.f37256a.a();
            }
            this.f37302i = true;
        }
        e();
    }

    public d(c cVar) {
        super(cVar.f37261f);
        String str;
        String str2;
        String str3;
        MethodCollector.i(8400);
        this.f37318j = cVar;
        Context context = cVar.f37261f;
        g();
        b();
        c();
        if (this.f37318j.f37257b == null) {
            LayoutInflater.from(context).inflate(R.layout.ak8, this.f37294a);
            TextView textView = (TextView) a(R.id.ev1);
            RelativeLayout relativeLayout = (RelativeLayout) a(R.id.drr);
            Button button = (Button) a(R.id.xl);
            Button button2 = (Button) a(R.id.xj);
            button.setTag("submit");
            button2.setTag("cancel");
            button.setOnClickListener(this);
            button2.setOnClickListener(this);
            Map<String, String> a2 = this.f37318j.X.a();
            if (TextUtils.isEmpty(this.f37318j.f37262g)) {
                str = a2.get("confirm");
            } else {
                str = this.f37318j.f37262g;
            }
            button.setText(str);
            if (TextUtils.isEmpty(this.f37318j.f37263h)) {
                str2 = a2.get("cancel");
            } else {
                str2 = this.f37318j.f37263h;
            }
            button2.setText(str2);
            if (TextUtils.isEmpty(this.f37318j.f37264i)) {
                str3 = "";
            } else {
                str3 = this.f37318j.f37264i;
            }
            textView.setText(str3);
            button.setTextColor(this.f37318j.f37265j);
            button2.setTextColor(this.f37318j.f37266k);
            textView.setTextColor(this.f37318j.f37267l);
            relativeLayout.setBackgroundColor(this.f37318j.n);
            button.setTextSize((float) this.f37318j.o);
            button2.setTextSize((float) this.f37318j.o);
            textView.setTextSize((float) this.f37318j.p);
        } else {
            LayoutInflater.from(context).inflate(this.f37318j.f37258c, this.f37294a);
        }
        LinearLayout linearLayout = (LinearLayout) a(R.id.elc);
        linearLayout.setBackgroundColor(this.f37318j.f37268m);
        this.f37319k = new g(linearLayout, this.f37318j.G, this.f37318j.f37260e, this.f37318j.q, this.f37318j.X);
        if (this.f37318j.E != null) {
            this.f37319k.f37352h = new com.bytedance.ies.xelement.picker.e.c() {
                /* class com.bytedance.ies.xelement.picker.view.d.AnonymousClass1 */

                static {
                    Covode.recordClassIndex(22435);
                }

                @Override // com.bytedance.ies.xelement.picker.e.c
                public final void a() {
                    d.this.i();
                }
            };
        }
        Calendar calendar = this.f37318j.I;
        Calendar calendar2 = this.f37318j.J;
        g gVar = this.f37319k;
        calendar = calendar == null ? Calendar.getInstance() : calendar;
        calendar2 = calendar2 == null ? Calendar.getInstance() : calendar2;
        Calendar b2 = g.b(calendar);
        Calendar b3 = g.b(calendar2);
        if (b2.getTimeInMillis() > b3.getTimeInMillis()) {
            b3.add(5, 1);
        }
        gVar.f37346b.setAdapter(new com.bytedance.ies.xelement.picker.a.c(b2.get(11), b3.get(11)));
        gVar.f37347c.setAdapter(new b(0, 59));
        gVar.f37348d.setAdapter(new b(0, 59));
        gVar.f37349e = b2;
        gVar.f37350f = b3;
        gVar.f37346b.setOnItemSelectedListener(new f() {
            /* class com.bytedance.ies.xelement.picker.view.g.AnonymousClass1 */

            static {
                Covode.recordClassIndex(22443);
            }

            @Override // com.bytedance.ies.xelement.picker.e.f
            public final void a(int i2) {
                Calendar b2 = g.b(g.this.f37351g);
                int currentItem = g.this.f37349e.get(11) + g.this.f37346b.getCurrentItem();
                if (currentItem >= 24) {
                    b2.set(11, currentItem - 24);
                    b2.add(5, 1);
                } else {
                    b2.set(11, currentItem);
                }
                g.this.a(b2);
                if (g.this.f37352h != null) {
                    g.this.f37352h.a();
                }
            }
        });
        gVar.f37347c.setOnItemSelectedListener(
        /*  JADX ERROR: Method code generation error
            jadx.core.utils.exceptions.CodegenException: Error generate insn: 0x0175: INVOKE  
              (wrap: com.bytedance.ies.xelement.picker.view.WheelView : 0x016e: IGET  (r1v10 com.bytedance.ies.xelement.picker.view.WheelView) = (r4v1 'gVar' com.bytedance.ies.xelement.picker.view.g) com.bytedance.ies.xelement.picker.view.g.c com.bytedance.ies.xelement.picker.view.WheelView)
              (wrap: com.bytedance.ies.xelement.picker.view.g$2 : 0x0172: CONSTRUCTOR  (r0v24 com.bytedance.ies.xelement.picker.view.g$2) = (r4v1 'gVar' com.bytedance.ies.xelement.picker.view.g) call: com.bytedance.ies.xelement.picker.view.g.2.<init>(com.bytedance.ies.xelement.picker.view.g):void type: CONSTRUCTOR)
             type: VIRTUAL call: com.bytedance.ies.xelement.picker.view.WheelView.setOnItemSelectedListener(com.bytedance.ies.xelement.picker.e.f):void in method: com.bytedance.ies.xelement.picker.view.d.<init>(com.bytedance.ies.xelement.picker.c.c):void, file: classes9.dex
            	at jadx.core.codegen.InsnGen.makeInsn(InsnGen.java:255)
            	at jadx.core.codegen.InsnGen.makeInsn(InsnGen.java:217)
            	at jadx.core.codegen.RegionGen.makeSimpleBlock(RegionGen.java:110)
            	at jadx.core.codegen.RegionGen.makeRegion(RegionGen.java:56)
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
            Caused by: jadx.core.utils.exceptions.CodegenException: Error generate insn: 0x0172: CONSTRUCTOR  (r0v24 com.bytedance.ies.xelement.picker.view.g$2) = (r4v1 'gVar' com.bytedance.ies.xelement.picker.view.g) call: com.bytedance.ies.xelement.picker.view.g.2.<init>(com.bytedance.ies.xelement.picker.view.g):void type: CONSTRUCTOR in method: com.bytedance.ies.xelement.picker.view.d.<init>(com.bytedance.ies.xelement.picker.c.c):void, file: classes9.dex
            	at jadx.core.codegen.InsnGen.makeInsn(InsnGen.java:255)
            	at jadx.core.codegen.InsnGen.addWrappedArg(InsnGen.java:119)
            	at jadx.core.codegen.InsnGen.addArg(InsnGen.java:103)
            	at jadx.core.codegen.InsnGen.generateMethodArguments(InsnGen.java:806)
            	at jadx.core.codegen.InsnGen.makeInvoke(InsnGen.java:746)
            	at jadx.core.codegen.InsnGen.makeInsnBody(InsnGen.java:367)
            	at jadx.core.codegen.InsnGen.makeInsn(InsnGen.java:249)
            	... 16 more
            Caused by: jadx.core.utils.exceptions.JadxRuntimeException: Expected class to be processed at this point, class: com.bytedance.ies.xelement.picker.view.g, state: GENERATED_AND_UNLOADED
            	at jadx.core.dex.nodes.ClassNode.ensureProcessed(ClassNode.java:215)
            	at jadx.core.codegen.InsnGen.makeConstructor(InsnGen.java:630)
            	at jadx.core.codegen.InsnGen.makeInsnBody(InsnGen.java:363)
            	at jadx.core.codegen.InsnGen.makeInsn(InsnGen.java:230)
            	... 22 more
            */
        /*
        // Method dump skipped, instructions count: 709
        */
        throw new UnsupportedOperationException("Method not decompiled: com.bytedance.ies.xelement.picker.view.d.<init>(com.bytedance.ies.xelement.picker.c.c):void");
    }
}
