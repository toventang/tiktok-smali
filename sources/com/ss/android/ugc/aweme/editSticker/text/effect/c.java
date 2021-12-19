package com.ss.android.ugc.aweme.editSticker.text.effect;

import android.graphics.Point;
import android.graphics.PointF;
import android.graphics.RectF;
import android.view.ViewGroup;
import android.view.ViewParent;
import androidx.core.h.v;
import androidx.fragment.app.e;
import com.bytedance.covode.number.Covode;
import com.bytedance.f.a.a.j;
import com.bytedance.frameworks.apm.trace.MethodCollector;
import com.ss.android.ugc.aweme.editSticker.compile.TextStickerCompileResult;
import com.ss.android.ugc.aweme.editSticker.text.bean.InnerEffectTextConfig;
import com.ss.android.ugc.aweme.editSticker.text.bean.InnerEffectTextLayoutConfig;
import com.ss.android.ugc.aweme.editSticker.text.bean.TextStickerData;
import com.ss.android.ugc.aweme.editSticker.text.bean.TextStickerTextWrap;
import com.ss.android.ugc.aweme.editSticker.text.bean.o;
import com.ss.android.ugc.aweme.editSticker.text.bean.t;
import com.ss.android.ugc.aweme.editSticker.text.c.h;
import com.ss.android.ugc.aweme.editSticker.text.c.i;
import com.ss.android.ugc.aweme.editSticker.text.view.q;
import com.ss.android.ugc.effectmanager.effect.model.Effect;
import h.f.b.l;
import h.p;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Objects;

public final class c extends com.ss.android.ugc.aweme.editSticker.text.a {
    public com.ss.android.ugc.aweme.editSticker.d.b G;
    public String H = "0";
    public String I;
    public String J;
    public String K;
    public String L;
    public InnerEffectTextLayoutConfig M;
    public o N;
    public com.ss.android.ugc.aweme.editSticker.text.bean.c O;
    public final EffectTextStickerInputLayout P;
    private com.ss.android.ugc.aweme.editSticker.text.a.c Q;
    private p<com.ss.android.ugc.aweme.editSticker.text.bean.c, com.ss.android.ugc.aweme.editSticker.text.bean.c> R;
    private final e S;

    static {
        Covode.recordClassIndex(55694);
    }

    /* renamed from: com.ss.android.ugc.aweme.editSticker.text.effect.c$c  reason: collision with other inner class name */
    public static final class C2146c implements com.ss.android.ugc.aweme.editSticker.text.c.b {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ c f88477a;

        static {
            Covode.recordClassIndex(55697);
        }

        @Override // com.ss.android.ugc.aweme.editSticker.text.c.b
        public final void a() {
            this.f88477a.r();
        }

        @Override // com.ss.android.ugc.aweme.editSticker.text.c.b
        public final void b() {
            q qVar = (q) this.f88477a.f88251d;
            if (qVar != null) {
                qVar.a(true);
            }
        }

        @Override // com.ss.android.ugc.aweme.editSticker.text.c.b
        public final void c() {
            q qVar = (q) this.f88477a.f88251d;
            if (qVar != null) {
                qVar.a(true);
            }
        }

        @Override // com.ss.android.ugc.aweme.editSticker.text.c.b
        public final void d() {
            q qVar = (q) this.f88477a.f88251d;
            if (qVar != null) {
                qVar.a(false);
            }
        }

        /* JADX WARN: Incorrect args count in method signature: ()V */
        C2146c(c cVar) {
            this.f88477a = cVar;
        }
    }

    @Override // com.ss.android.ugc.aweme.editSticker.text.a
    public final void i() {
        super.i();
        this.P.setTextStickerInputMobListener(new a(this));
    }

    @Override // com.ss.android.ugc.aweme.editSticker.text.a
    public final void n() {
        q qVar = this.f88251d;
        if (qVar != null) {
            qVar.setOnEffectTextGestureListener(new C2146c(this));
        }
    }

    public final boolean u() {
        return !l.a(this.O, new com.ss.android.ugc.aweme.editSticker.text.bean.c(c(), this.L));
    }

    @Override // com.ss.android.ugc.aweme.editSticker.text.a
    public final int d() {
        int i2;
        com.ss.android.ugc.aweme.editSticker.text.a.b a2 = com.ss.android.ugc.aweme.editSticker.text.a.b.a();
        l.b(a2, "");
        if (a2.d() > 0) {
            com.ss.android.ugc.aweme.editSticker.text.a.b a3 = com.ss.android.ugc.aweme.editSticker.text.a.b.a();
            l.b(a3, "");
            i2 = a3.d();
        } else {
            i2 = 28;
        }
        return (int) (((float) i2) * this.N.a());
    }

    @Override // com.ss.android.ugc.aweme.editSticker.text.a
    public final void f() {
        String str;
        String str2;
        Effect effect;
        super.f();
        com.ss.android.ugc.aweme.editSticker.text.a.c d2 = com.ss.android.ugc.aweme.editSticker.text.a.b.a().d(0);
        this.Q = d2;
        String str3 = "";
        if (d2 == null || (effect = d2.f88301i) == null || (str = effect.getEffectId()) == null) {
            str = str3;
        }
        this.J = str;
        com.ss.android.ugc.aweme.editSticker.text.a.c cVar = this.Q;
        if (!(cVar == null || (str2 = cVar.f88294b) == null)) {
            str3 = str2;
        }
        this.K = str3;
    }

    public final void r() {
        InnerEffectTextLayoutConfig innerEffectTextLayoutConfig;
        TextStickerData data;
        EffectTextStickerInputLayout effectTextStickerInputLayout = this.P;
        q qVar = this.f88251d;
        if (qVar == null || (data = qVar.getData()) == null) {
            innerEffectTextLayoutConfig = null;
        } else {
            innerEffectTextLayoutConfig = data.getEffectTextLayoutConfig();
        }
        effectTextStickerInputLayout.setInnerLayoutConfig(innerEffectTextLayoutConfig);
        a(this.f88251d);
        com.ss.android.ugc.aweme.editSticker.d.b bVar = this.G;
        if (bVar != null) {
            String str = this.L;
            if (str == null) {
                str = "";
            }
            bVar.b(new com.ss.android.ugc.aweme.editSticker.d.a(str, null, null, null, null, 0, 0, 0, 254));
        }
    }

    public final boolean t() {
        Iterator<T> it = c().iterator();
        while (true) {
            if (!it.hasNext()) {
                break;
            }
            T next = it.next();
            String text = next.getText();
            if (text != null && text.length() != 0) {
                if (next != null) {
                    return true;
                }
            }
        }
        return false;
    }

    static final class d implements Runnable {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ c f88478a;

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ TextStickerData f88479b;

        /* renamed from: c  reason: collision with root package name */
        final /* synthetic */ String f88480c;

        static {
            Covode.recordClassIndex(55698);
        }

        d(c cVar, TextStickerData textStickerData, String str) {
            this.f88478a = cVar;
            this.f88479b = textStickerData;
            this.f88480c = str;
        }

        public final void run() {
            InnerEffectTextLayoutConfig innerEffectTextLayoutConfig;
            ViewParent parent = this.f88478a.y.getParent();
            if (parent != null) {
                Objects.requireNonNull(parent, "null cannot be cast to non-null type android.view.ViewGroup");
                ViewGroup viewGroup = (ViewGroup) parent;
                if (viewGroup.getTag() instanceof o) {
                    c cVar = this.f88478a;
                    Object tag = viewGroup.getTag();
                    Objects.requireNonNull(tag, "null cannot be cast to non-null type com.ss.android.ugc.aweme.editSticker.text.bean.EffectTextScaleInfo");
                    cVar.a((o) tag);
                }
            }
            TextStickerData textStickerData = this.f88479b;
            if (textStickerData != null) {
                this.f88478a.L = this.f88480c;
                this.f88478a.O = new com.ss.android.ugc.aweme.editSticker.text.bean.c(textStickerData.getTextWrapList(), this.f88478a.L);
                this.f88478a.M = this.f88479b.getEffectTextLayoutConfig();
                InnerEffectTextLayoutConfig effectTextLayoutConfig = this.f88479b.getEffectTextLayoutConfig();
                if (effectTextLayoutConfig != null) {
                    innerEffectTextLayoutConfig = d.a(effectTextLayoutConfig, this.f88478a.N.a());
                } else {
                    innerEffectTextLayoutConfig = null;
                }
                textStickerData.setEffectTextLayoutConfig(innerEffectTextLayoutConfig);
                this.f88478a.a(textStickerData, false);
                this.f88478a.P.a(textStickerData);
            }
        }
    }

    @Override // com.ss.android.ugc.aweme.editSticker.text.a
    public final void e() {
        com.ss.android.ugc.aweme.editSticker.interact.view.e eVar;
        MethodCollector.i(3059);
        super.e();
        com.ss.android.ugc.aweme.editSticker.interact.view.a aVar = com.ss.android.ugc.aweme.editSticker.d.c().f88097d;
        if (aVar != null) {
            eVar = aVar.a(this.S, 0);
        } else {
            eVar = null;
        }
        this.E = eVar;
        com.ss.android.ugc.aweme.editSticker.interact.view.e eVar2 = this.E;
        if (eVar2 != null) {
            eVar2.setEnableFakeFeedView(false);
        }
        com.ss.android.ugc.aweme.editSticker.interact.view.e eVar3 = this.E;
        if (eVar3 != null) {
            this.y.addView(eVar3.getContentView());
            v.c(eVar3.getContentView(), Float.MAX_VALUE);
            MethodCollector.o(3059);
            return;
        }
        MethodCollector.o(3059);
    }

    @Override // com.ss.android.ugc.aweme.editSticker.text.a
    public final void q() {
        a(c());
        this.q = false;
        String str = "";
        if (this.P.getInnerLayoutConfig() == null) {
            com.ss.android.ugc.aweme.editSticker.d.b bVar = this.G;
            if (bVar != null) {
                String str2 = this.L;
                if (str2 != null) {
                    str = str2;
                }
                bVar.c(new com.ss.android.ugc.aweme.editSticker.d.a(str, this.J, this.K, this.I, this.H, 0, 0, 0, 224));
                return;
            }
            return;
        }
        com.ss.android.ugc.aweme.editSticker.d.b bVar2 = this.G;
        if (bVar2 != null) {
            String str3 = this.L;
            if (str3 != null) {
                str = str3;
            }
            bVar2.c(new com.ss.android.ugc.aweme.editSticker.d.a(str, null, null, null, null, 0, 0, 0, 254));
        }
    }

    public final void s() {
        MethodCollector.i(3118);
        q qVar = this.f88251d;
        if (qVar != null) {
            this.y.removeView(qVar);
            a().a(qVar);
            this.f88251d = null;
        }
        EffectTextStickerInputLayout effectTextStickerInputLayout = this.P;
        effectTextStickerInputLayout.E.clear();
        effectTextStickerInputLayout.a();
        for (T t : effectTextStickerInputLayout.f88471f.f88544a) {
            t.f88555a.setText("");
            t.f88556b = null;
        }
        MethodCollector.o(3118);
    }

    public static final class a implements h {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ c f88475a;

        static {
            Covode.recordClassIndex(55695);
        }

        @Override // com.ss.android.ugc.aweme.editSticker.text.c.h
        public final void a() {
        }

        @Override // com.ss.android.ugc.aweme.editSticker.text.c.h
        public final void a(List<TextStickerTextWrap> list) {
            l.d(list, "");
        }

        /* JADX WARN: Incorrect args count in method signature: ()V */
        a(c cVar) {
            this.f88475a = cVar;
        }

        @Override // com.ss.android.ugc.aweme.editSticker.text.c.h
        public final void a(String str) {
            l.d(str, "");
            com.ss.android.ugc.aweme.editSticker.d.b bVar = this.f88475a.G;
            if (bVar != null) {
                bVar.a(str);
            }
        }

        @Override // com.ss.android.ugc.aweme.editSticker.text.c.h
        public final void a(int i2) {
            c cVar = this.f88475a;
            String hexString = Integer.toHexString(i2);
            l.b(hexString, "");
            cVar.I = hexString;
            com.ss.android.ugc.aweme.editSticker.d.b bVar = this.f88475a.G;
            if (bVar != null) {
                bVar.a(i2);
            }
        }

        @Override // com.ss.android.ugc.aweme.editSticker.text.c.h
        public final void b(int i2) {
            this.f88475a.H = String.valueOf(i2);
            com.ss.android.ugc.aweme.editSticker.d.b bVar = this.f88475a.G;
            if (bVar != null) {
                bVar.b(i2);
            }
        }

        @Override // com.ss.android.ugc.aweme.editSticker.text.c.h
        public final void a(com.ss.android.ugc.aweme.editSticker.text.a.c cVar) {
            l.d(cVar, "");
            this.f88475a.J = cVar.f88301i.getEffectId();
            c cVar2 = this.f88475a;
            String str = cVar.f88294b;
            l.b(str, "");
            cVar2.K = str;
            com.ss.android.ugc.aweme.editSticker.d.b bVar = this.f88475a.G;
            if (bVar != null) {
                String str2 = cVar.f88294b;
                l.b(str2, "");
                bVar.b(str2);
            }
        }
    }

    public static final class b implements com.ss.android.ugc.aweme.editSticker.text.c.d {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ c f88476a;

        static {
            Covode.recordClassIndex(55696);
        }

        @Override // com.ss.android.ugc.aweme.editSticker.text.c.d
        public final void a(q qVar) {
            l.d(qVar, "");
        }

        @Override // com.ss.android.ugc.aweme.editSticker.text.c.d
        public final void a(q qVar, RectF rectF, i iVar) {
            l.d(qVar, "");
            l.d(rectF, "");
            l.d(iVar, "");
        }

        @Override // com.ss.android.ugc.aweme.editSticker.text.c.d
        public final void a(q qVar, boolean z) {
            l.d(qVar, "");
        }

        @Override // com.ss.android.ugc.aweme.editSticker.text.c.d
        public final void b(q qVar) {
            l.d(qVar, "");
        }

        @Override // com.ss.android.ugc.aweme.editSticker.text.c.d
        public final void c(q qVar) {
            l.d(qVar, "");
        }

        @Override // com.ss.android.ugc.aweme.editSticker.text.c.d
        public final void d(q qVar) {
            l.d(qVar, "");
        }

        @Override // com.ss.android.ugc.aweme.editSticker.text.c.d
        public final void e(q qVar) {
            l.d(qVar, "");
        }

        /* JADX WARN: Incorrect args count in method signature: ()V */
        b(c cVar) {
            this.f88476a = cVar;
        }

        @Override // com.ss.android.ugc.aweme.editSticker.text.c.d
        public final float a(float f2) {
            com.ss.android.ugc.aweme.editSticker.interact.view.e eVar = this.f88476a.E;
            if (eVar != null) {
                return eVar.a(f2);
            }
            return 0.0f;
        }

        @Override // com.ss.android.ugc.aweme.editSticker.text.c.d
        public final int a(q qVar, boolean z, boolean z2) {
            l.d(qVar, "");
            if (z) {
                com.ss.android.ugc.aweme.editSticker.interact.view.e eVar = this.f88476a.E;
                if (eVar != null) {
                    eVar.b();
                }
                return -1;
            }
            com.ss.android.ugc.aweme.editSticker.interact.view.e eVar2 = this.f88476a.E;
            if (eVar2 != null) {
                return eVar2.a(qVar.getAnglePointListForBlock(), z2);
            }
            return -1;
        }

        @Override // com.ss.android.ugc.aweme.editSticker.text.c.d
        public final PointF a(q qVar, float f2, float f3) {
            l.d(qVar, "");
            PointF[] anglePointList = qVar.getAnglePointList();
            for (PointF pointF : anglePointList) {
                pointF.x += f2;
                pointF.y += f3;
            }
            com.ss.android.ugc.aweme.editSticker.interact.view.e eVar = this.f88476a.E;
            if (eVar != null) {
                return eVar.a(anglePointList, f2, f3);
            }
            return new PointF(0.0f, 0.0f);
        }
    }

    public final b.i<List<TextStickerCompileResult>> a(com.ss.android.ugc.aweme.editSticker.compile.a aVar) {
        l.d(aVar, "");
        return a().a(aVar, this.y);
    }

    @Override // com.ss.android.ugc.aweme.editSticker.text.a
    public final void c(TextStickerData textStickerData) {
        if (textStickerData != null) {
            textStickerData.setEffectTextLayoutConfig(this.P.getInnerLayoutConfig());
        }
    }

    public final void a(o oVar) {
        if (!l.a(this.N, oVar)) {
            this.N = oVar;
            this.P.setScaleInfo(oVar);
        }
    }

    public final void b(com.ss.android.ugc.aweme.editSticker.text.bean.a aVar) {
        l.d(aVar, "");
        if (l.a((Object) this.L, (Object) aVar.f88093b.getEffectId())) {
            a(aVar);
        }
    }

    public final void c(boolean z) {
        com.ss.android.ugc.aweme.editSticker.d.b bVar = this.G;
        if (bVar != null) {
            bVar.e(new com.ss.android.ugc.aweme.editSticker.d.a(null, null, null, null, null, 0, 0, z ? 1 : 0, 127));
        }
    }

    @Override // com.ss.android.ugc.aweme.editSticker.text.a
    public final void d(q qVar) {
        l.d(qVar, "");
        q qVar2 = this.f88251d;
        if (qVar2 != null) {
            qVar2.setOnEditClickListener(new b(this));
        }
    }

    @Override // com.ss.android.ugc.aweme.editSticker.text.a
    public final q b(TextStickerData textStickerData) {
        ViewParent parent = this.y.getParent();
        if (parent != null) {
            Objects.requireNonNull(parent, "null cannot be cast to non-null type android.view.ViewGroup");
            ViewGroup viewGroup = (ViewGroup) parent;
            if (viewGroup.getTag() instanceof o) {
                Object tag = viewGroup.getTag();
                Objects.requireNonNull(tag, "null cannot be cast to non-null type com.ss.android.ugc.aweme.editSticker.text.bean.EffectTextScaleInfo");
                a((o) tag);
            }
        }
        return new q(this.S, b(), textStickerData, this.N);
    }

    public final void a(com.ss.android.ugc.aweme.editSticker.text.bean.a aVar) {
        InnerEffectTextLayoutConfig innerEffectTextLayoutConfig;
        List<InnerEffectTextConfig> textConfigs;
        l.d(aVar, "");
        this.L = aVar.f88093b.getEffectId();
        this.M = aVar.f88417c;
        float a2 = this.N.a();
        l.d(aVar, "");
        InnerEffectTextLayoutConfig innerEffectTextLayoutConfig2 = aVar.f88417c;
        InnerEffectTextLayoutConfig innerEffectTextLayoutConfig3 = null;
        if (innerEffectTextLayoutConfig2 != null) {
            if (a2 == 0.0f) {
                a2 = 1.0f;
            }
            innerEffectTextLayoutConfig = d.a(innerEffectTextLayoutConfig2, a2);
        } else {
            innerEffectTextLayoutConfig = null;
        }
        q qVar = this.f88251d;
        if (qVar != null) {
            TextStickerData data = qVar.getData();
            if (data != null) {
                data.setEffectTextLayoutConfig(innerEffectTextLayoutConfig);
            }
            ArrayList arrayList = new ArrayList();
            arrayList.addAll(c());
            if (innerEffectTextLayoutConfig != null) {
                int size = innerEffectTextLayoutConfig.getTextConfigs().size();
                for (int size2 = arrayList.size(); size2 < size; size2++) {
                    arrayList.add(t.a("", false));
                }
            }
            int curTxtMode = this.P.getCurTxtMode();
            int curColor = this.P.getCurColor();
            int alignTxt = this.P.getAlignTxt();
            com.ss.android.ugc.aweme.editSticker.text.a.b a3 = com.ss.android.ugc.aweme.editSticker.text.a.b.a();
            l.b(a3, "");
            qVar.a(curTxtMode, curColor, alignTxt, a3.f88281d);
            qVar.setFontSize(d());
            TextStickerData data2 = qVar.getData();
            if (data2 != null) {
                innerEffectTextLayoutConfig3 = data2.getEffectTextLayoutConfig();
            }
            qVar.b(arrayList, innerEffectTextLayoutConfig3);
            return;
        }
        int curTxtMode2 = this.P.getCurTxtMode();
        int curColor2 = this.P.getCurColor();
        int alignTxt2 = this.P.getAlignTxt();
        com.ss.android.ugc.aweme.editSticker.text.a.b a4 = com.ss.android.ugc.aweme.editSticker.text.a.b.a();
        l.b(a4, "");
        TextStickerData textStickerData = new TextStickerData("", curTxtMode2, curColor2, alignTxt2, a4.f88281d, null, 0, 0, 0, 0, 0.0f, 0.0f, 0.0f, 0.0f, false, false, 0, null, null, 0, null, null, 0, null, null, null, null, null, false, 536870880, null);
        textStickerData.setEffectTextLayoutConfig(innerEffectTextLayoutConfig);
        Point editInputScreenCenterPoint = this.P.getEditInputScreenCenterPoint();
        l.b(editInputScreenCenterPoint, "");
        textStickerData.setEditCenterPoint(editInputScreenCenterPoint);
        ArrayList arrayList2 = new ArrayList();
        InnerEffectTextLayoutConfig effectTextLayoutConfig = textStickerData.getEffectTextLayoutConfig();
        if (effectTextLayoutConfig == null || (textConfigs = effectTextLayoutConfig.getTextConfigs()) == null) {
            arrayList2.add(t.a("", false));
        } else {
            Iterator<T> it = textConfigs.iterator();
            while (it.hasNext()) {
                it.next();
                arrayList2.add(t.a("", false));
            }
        }
        textStickerData.setTextWrapList(arrayList2);
        textStickerData.setFontSize(d());
        a(textStickerData, false);
    }

    public final void a(String str, TextStickerData textStickerData) {
        this.P.postDelayed(new d(this, textStickerData, str), 300);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r27v0, types: [int, boolean] */
    /* JADX WARN: Type inference failed for: r2v3 */
    /* JADX WARN: Type inference failed for: r2v4 */
    /* JADX WARN: Type inference failed for: r2v5 */
    /* JADX WARNING: Unknown variable types count: 1 */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void a(boolean r27, com.ss.android.ugc.aweme.editSticker.model.EffectTextModel r28) {
        /*
        // Method dump skipped, instructions count: 170
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ss.android.ugc.aweme.editSticker.text.effect.c.a(boolean, com.ss.android.ugc.aweme.editSticker.model.EffectTextModel):void");
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public c(e eVar, j jVar, EffectTextStickerInputLayout effectTextStickerInputLayout) {
        super(eVar, jVar, null, false, jVar.a(), effectTextStickerInputLayout, null, null, null, 1, null, false, false, 15820);
        l.d(eVar, "");
        l.d(jVar, "");
        l.d(effectTextStickerInputLayout, "");
        this.S = eVar;
        this.P = effectTextStickerInputLayout;
        String hexString = Integer.toHexString(-1);
        l.b(hexString, "");
        this.I = hexString;
        this.J = "";
        this.K = "";
        this.N = new o();
        this.R = new p<>(null, null);
    }
}
