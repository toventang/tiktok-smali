package com.bytedance.ies.xelement.text.inlinetext;

import android.text.SpannableStringBuilder;
import com.bytedance.covode.number.Covode;
import com.bytedance.ies.xelement.text.a.e;
import com.bytedance.ies.xelement.text.text.LynxTextShadowNode;
import com.lynx.tasm.behavior.j;
import com.lynx.tasm.behavior.m;
import com.lynx.tasm.behavior.shadow.g;
import com.lynx.tasm.behavior.shadow.text.InlineTextShadowNode;
import com.lynx.tasm.behavior.shadow.text.RawTextShadowNode;
import com.lynx.tasm.behavior.shadow.text.k;
import h.f.b.l;

public final class LynxInlineTextShadowNode extends InlineTextShadowNode {

    /* renamed from: b  reason: collision with root package name */
    public static final a f37444b = new a((byte) 0);

    /* renamed from: a  reason: collision with root package name */
    public String f37445a = "none";

    /* renamed from: c  reason: collision with root package name */
    private boolean f37446c;

    static {
        Covode.recordClassIndex(22515);
    }

    public static final class a {
        static {
            Covode.recordClassIndex(22517);
        }

        private a() {
        }

        public /* synthetic */ a(byte b2) {
            this();
        }
    }

    @m(a = "no-trim", f = true)
    public final void setNoTrim(boolean z) {
        this.f37446c = z;
        d();
    }

    @Override // com.lynx.tasm.behavior.shadow.text.BaseTextShadowNode
    public final void a(SpannableStringBuilder spannableStringBuilder, RawTextShadowNode rawTextShadowNode) {
        int i2;
        l.c(spannableStringBuilder, "");
        l.c(rawTextShadowNode, "");
        String str = rawTextShadowNode.f55988a;
        if (!this.f37446c) {
            str = LynxTextShadowNode.a.a(str);
        }
        if (l.a((Object) this.f37445a, (Object) "bracket")) {
            j h2 = h();
            k kVar = this.p;
            l.a((Object) kVar, "");
            if (g.a(kVar.f56017k)) {
                i2 = 40;
            } else {
                k kVar2 = this.p;
                l.a((Object) kVar2, "");
                i2 = (int) kVar2.f56017k;
            }
            spannableStringBuilder.append(e.a(h2, str, i2));
            return;
        }
        spannableStringBuilder.append((CharSequence) str);
    }
}
