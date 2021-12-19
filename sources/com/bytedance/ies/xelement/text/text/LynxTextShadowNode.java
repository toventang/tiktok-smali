package com.bytedance.ies.xelement.text.text;

import android.content.Context;
import android.text.Layout;
import android.text.SpannableStringBuilder;
import android.text.Spanned;
import android.text.TextPaint;
import android.text.TextUtils;
import com.bytedance.covode.number.Covode;
import com.bytedance.ies.xelement.text.a.c;
import com.bytedance.ies.xelement.text.a.d;
import com.bytedance.ies.xelement.text.inlinetext.LynxInlineTextShadowNode;
import com.bytedance.ies.xelement.text.inlinetruncation.LynxInlineTruncationShadowNode;
import com.lynx.tasm.behavior.j;
import com.lynx.tasm.behavior.shadow.LayoutNode;
import com.lynx.tasm.behavior.shadow.ShadowNode;
import com.lynx.tasm.behavior.shadow.g;
import com.lynx.tasm.behavior.shadow.text.BaseTextShadowNode;
import com.lynx.tasm.behavior.shadow.text.RawTextShadowNode;
import com.lynx.tasm.behavior.shadow.text.TextShadowNode;
import com.lynx.tasm.behavior.shadow.text.k;
import com.lynx.tasm.behavior.utils.e;
import h.a.n;
import h.f.b.m;
import h.m.l;
import java.util.ArrayList;
import java.util.List;

public final class LynxTextShadowNode extends TextShadowNode {

    /* renamed from: b  reason: collision with root package name */
    public static final l f37447b = new l("^[\\s]+|[\\s]+$");

    /* renamed from: c  reason: collision with root package name */
    public static final a f37448c = new a((byte) 0);

    /* renamed from: a  reason: collision with root package name */
    public h.f.a.b<? super Context, ? extends com.bytedance.ies.xelement.text.a.b> f37449a = b.f37450a;
    private String u = "none";
    private int v;

    @Override // com.lynx.tasm.behavior.shadow.text.TextShadowNode
    public final boolean b() {
        return false;
    }

    public static final class a {
        static {
            Covode.recordClassIndex(22522);
        }

        private a() {
        }

        public /* synthetic */ a(byte b2) {
            this();
        }

        public static String a(String str) {
            if (str != null) {
                return e.b(LynxTextShadowNode.f37447b.replace(str, ""));
            }
            return null;
        }
    }

    static {
        Covode.recordClassIndex(22520);
    }

    static final class b extends m implements h.f.a.b<Context, com.bytedance.ies.xelement.text.a.a> {

        /* renamed from: a  reason: collision with root package name */
        public static final b f37450a = new b();

        static {
            Covode.recordClassIndex(22523);
        }

        b() {
            super(1);
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
        @Override // h.f.a.b
        public final /* synthetic */ com.bytedance.ies.xelement.text.a.a invoke(Context context) {
            h.f.b.l.c(context, "");
            return new com.bytedance.ies.xelement.text.a.a();
        }
    }

    @Override // com.lynx.tasm.behavior.shadow.ShadowNode
    public final void a(j jVar) {
        super.a(jVar);
        c a2 = c.a.a();
        h.f.a.b<? super Context, ? extends com.bytedance.ies.xelement.text.a.b> bVar = this.f37449a;
        if (jVar == null) {
            h.f.b.l.a();
        }
        a2.a((com.bytedance.ies.xelement.text.a.b) bVar.invoke(jVar));
    }

    @Override // com.lynx.tasm.behavior.shadow.text.BaseTextShadowNode
    @com.lynx.tasm.behavior.m(a = "text-maxline")
    public final void setTextMaxLine(String str) {
        h.f.b.l.c(str, "");
        super.setTextMaxLine(str);
        this.v = Integer.parseInt(str);
        d();
    }

    @com.lynx.tasm.behavior.m(a = "ellipsize-mode")
    public final void setEllipsizeMode(String str) {
        h.f.b.l.c(str, "");
        int hashCode = str.hashCode();
        if (hashCode != 3056464) {
            if (hashCode == 3552336 && str.equals("tail")) {
                setTextOverflow(1);
            }
        } else if (str.equals("clip")) {
            setTextOverflow(0);
        }
        d();
    }

    @com.lynx.tasm.behavior.m(a = "richtype")
    public final void setRichType(String str) {
        float f2;
        h.f.b.l.c(str, "");
        this.u = str;
        if (h.f.b.l.a((Object) str, (Object) "bracket")) {
            k kVar = this.p;
            h.f.b.l.a((Object) kVar, "");
            if (g.a(kVar.f56017k)) {
                f2 = 40.0f;
            } else {
                k kVar2 = this.p;
                h.f.b.l.a((Object) kVar2, "");
                f2 = kVar2.f56017k;
            }
            setLineHeight(f2);
        }
        d();
    }

    /* JADX WARNING: Removed duplicated region for block: B:32:0x00d7  */
    /* JADX WARNING: Removed duplicated region for block: B:50:0x0145  */
    /* JADX WARNING: Removed duplicated region for block: B:60:0x0186  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private final boolean a(float r24) {
        /*
        // Method dump skipped, instructions count: 494
        */
        throw new UnsupportedOperationException("Method not decompiled: com.bytedance.ies.xelement.text.text.LynxTextShadowNode.a(float):boolean");
    }

    private static int a(List<? extends List<Integer>> list, int i2) {
        int size = list.size();
        while (true) {
            size--;
            if (size < 0) {
                return 0;
            }
            List list2 = (List) list.get(size);
            if (((Number) list2.get(0)).intValue() <= i2 && i2 <= ((Number) list2.get(1)).intValue()) {
                return ((Number) list2.get(1)).intValue() - ((Number) list2.get(0)).intValue();
            }
        }
    }

    @Override // com.lynx.tasm.behavior.shadow.text.BaseTextShadowNode
    public final void a(SpannableStringBuilder spannableStringBuilder, RawTextShadowNode rawTextShadowNode) {
        h.f.b.l.c(spannableStringBuilder, "");
        h.f.b.l.c(rawTextShadowNode, "");
        String a2 = a.a(rawTextShadowNode.f55988a);
        if (h.f.b.l.a((Object) this.u, (Object) "bracket")) {
            j h2 = h();
            k kVar = this.p;
            h.f.b.l.a((Object) kVar, "");
            spannableStringBuilder.append(com.bytedance.ies.xelement.text.a.e.a(h2, a2, (int) kVar.f56017k));
            return;
        }
        spannableStringBuilder.append((CharSequence) a2);
    }

    @Override // com.lynx.tasm.behavior.shadow.text.BaseTextShadowNode
    public final void a(SpannableStringBuilder spannableStringBuilder, List<BaseTextShadowNode.b> list) {
        int f2 = f();
        for (int i2 = 0; i2 < f2; i2++) {
            ShadowNode b2 = b(i2);
            if (b2 instanceof LynxInlineTextShadowNode) {
                String str = this.u;
                h.f.b.l.c(str, "");
                ((LynxInlineTextShadowNode) b2).f37445a = str;
            }
        }
        super.a(spannableStringBuilder, list);
    }

    private static List<Integer> a(int i2, CharSequence charSequence, TextPaint textPaint) {
        ArrayList d2 = n.d(0, 0);
        if (TextUtils.isEmpty(charSequence)) {
            return d2;
        }
        ArrayList arrayList = new ArrayList();
        if (!TextUtils.isEmpty(charSequence) && (charSequence instanceof Spanned)) {
            Spanned spanned = (Spanned) charSequence;
            d[] dVarArr = (d[]) spanned.getSpans(0, charSequence.length(), d.class);
            for (d dVar : dVarArr) {
                arrayList.add(n.b(Integer.valueOf(spanned.getSpanStart(dVar)), Integer.valueOf(spanned.getSpanEnd(dVar))));
            }
        }
        int length = charSequence.length();
        float f2 = 0.0f;
        while (length > 0 && ((float) i2) > f2) {
            int a2 = a(arrayList, length);
            if (a2 <= 0) {
                a2 = 1;
            }
            length -= a2;
            f2 = Layout.getDesiredWidth(charSequence.subSequence(length, charSequence.length()), textPaint);
        }
        d2.set(0, Integer.valueOf(charSequence.length() - length));
        d2.set(1, Integer.valueOf((int) f2));
        return d2;
    }

    @Override // com.lynx.tasm.behavior.shadow.d, com.lynx.tasm.behavior.shadow.text.TextShadowNode
    public final long a(LayoutNode layoutNode, float f2, com.lynx.tasm.behavior.shadow.e eVar, float f3, com.lynx.tasm.behavior.shadow.e eVar2) {
        float f4;
        if (eVar == com.lynx.tasm.behavior.shadow.e.UNDEFINED) {
            f4 = Float.MAX_VALUE;
        } else {
            f4 = f2;
        }
        if (a(f4)) {
            CharSequence charSequence = this.t;
            h.f.b.l.a((Object) charSequence, "");
            SpannableStringBuilder spannableStringBuilder = null;
            if ((charSequence instanceof SpannableStringBuilder) && charSequence != null) {
                spannableStringBuilder = (SpannableStringBuilder) charSequence;
            }
            int f5 = f();
            for (int i2 = 0; i2 < f5; i2++) {
                ShadowNode b2 = b(i2);
                if ((b2 instanceof LynxInlineTruncationShadowNode) && spannableStringBuilder != null) {
                    spannableStringBuilder.append(((LynxInlineTruncationShadowNode) b2).t);
                }
            }
        }
        return super.a(layoutNode, f2, eVar, f3, eVar2);
    }
}
