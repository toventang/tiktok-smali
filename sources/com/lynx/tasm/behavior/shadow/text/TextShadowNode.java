package com.lynx.tasm.behavior.shadow.text;

import android.text.SpannableStringBuilder;
import com.bytedance.covode.number.Covode;
import com.lynx.tasm.behavior.PaintingContext;
import com.lynx.tasm.behavior.m;
import com.lynx.tasm.behavior.shadow.LayoutNode;
import com.lynx.tasm.behavior.shadow.ShadowNode;
import com.lynx.tasm.behavior.shadow.d;
import com.lynx.tasm.behavior.shadow.f;
import com.lynx.tasm.behavior.shadow.g;
import com.lynx.tasm.behavior.shadow.text.BaseTextShadowNode;
import com.lynx.tasm.behavior.shadow.text.n;
import com.lynx.tasm.behavior.shadow.text.o;
import com.lynx.tasm.behavior.shadow.text.r;
import com.lynx.tasm.behavior.utils.e;
import com.lynx.tasm.d.c;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.List;

public class TextShadowNode extends BaseTextShadowNode implements d {

    /* renamed from: a  reason: collision with root package name */
    private boolean f55991a;
    public n s;
    public CharSequence t;

    static {
        Covode.recordClassIndex(34990);
    }

    /* access modifiers changed from: package-private */
    public static class a implements r.b {

        /* renamed from: a  reason: collision with root package name */
        private WeakReference<ShadowNode> f55992a;

        static {
            Covode.recordClassIndex(34992);
        }

        @Override // com.lynx.tasm.behavior.shadow.text.r.b
        public final void a() {
            ShadowNode shadowNode = this.f55992a.get();
            if (shadowNode != null) {
                shadowNode.d();
            }
        }

        a(ShadowNode shadowNode) {
            this.f55992a = new WeakReference<>(shadowNode);
        }
    }

    public TextShadowNode() {
        if (!a()) {
            a(this);
        }
    }

    /* access modifiers changed from: protected */
    public boolean b() {
        if (f() != 1 || !(b(0) instanceof RawTextShadowNode) || !g.a(this.p.f56017k)) {
            return false;
        }
        return true;
    }

    @Override // com.lynx.tasm.behavior.shadow.LayoutNode
    public final void c() {
        if (!a()) {
            this.s = null;
            if (b()) {
                RawTextShadowNode rawTextShadowNode = (RawTextShadowNode) b(0);
                String str = rawTextShadowNode.f55988a;
                if (rawTextShadowNode.f55989b) {
                    this.t = e.a(str);
                } else {
                    this.t = e.b(str);
                }
                if (this.t != null) {
                    ArrayList<BaseTextShadowNode.b> arrayList = new ArrayList();
                    SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder();
                    spannableStringBuilder.append(this.t);
                    a(0, this.t.length(), arrayList);
                    for (BaseTextShadowNode.b bVar : arrayList) {
                        bVar.a(spannableStringBuilder);
                    }
                    this.t = spannableStringBuilder;
                    return;
                }
                return;
            }
            SpannableStringBuilder spannableStringBuilder2 = new SpannableStringBuilder();
            ArrayList arrayList2 = new ArrayList();
            a(spannableStringBuilder2, arrayList2);
            for (int size = arrayList2.size() - 1; size >= 0; size--) {
                arrayList2.get(size).a(spannableStringBuilder2);
            }
            this.t = spannableStringBuilder2;
        }
    }

    @m(a = "tail-color-convert")
    public void setEnableTailColorConvert(boolean z) {
        this.f55991a = z;
        d();
    }

    @Override // com.lynx.tasm.behavior.shadow.ShadowNode
    public void a(PaintingContext paintingContext) {
        super.a(paintingContext);
        if (this.s != null) {
            q qVar = new q(this.s.f56024a, this.p.o);
            paintingContext.f55780a.a(this.f55957h, qVar);
        }
    }

    /* access modifiers changed from: protected */
    @Override // com.lynx.tasm.behavior.shadow.text.BaseTextShadowNode
    public final void a(int i2, int i3, List<BaseTextShadowNode.b> list) {
        super.a(i2, i3, list);
        if (this.p.f56009c == null) {
            list.add(new BaseTextShadowNode.b(i2, i3, new h(-16777216)));
        }
    }

    @Override // com.lynx.tasm.behavior.shadow.LayoutNode
    public final void a(int i2, int i3, int i4, int i5) {
        super.a(i2, i3, i4, i5);
        if (this.s == null) {
            a(this, (float) i4, com.lynx.tasm.behavior.shadow.e.EXACTLY, (float) i5, com.lynx.tasm.behavior.shadow.e.EXACTLY);
        }
    }

    @Override // com.lynx.tasm.behavior.shadow.d
    public long a(LayoutNode layoutNode, float f2, com.lynx.tasm.behavior.shadow.e eVar, float f3, com.lynx.tasm.behavior.shadow.e eVar2) {
        int i2;
        this.s = null;
        if (eVar != com.lynx.tasm.behavior.shadow.e.UNDEFINED && eVar2 != com.lynx.tasm.behavior.shadow.e.UNDEFINED && f2 == 0.0f && f3 == 0.0f) {
            return f.a(0.0f, 0.0f);
        }
        CharSequence charSequence = this.t;
        if (charSequence == null) {
            return f.a(0.0f, 0.0f);
        }
        k kVar = this.p;
        k kVar2 = new k();
        kVar2.f56007a = kVar.f56007a;
        kVar2.f56008b = kVar.f56008b;
        kVar2.f56009c = kVar.f56009c;
        kVar2.f56010d = kVar.f56010d;
        kVar2.f56012f = kVar.f56012f;
        kVar2.f56013g = kVar.f56013g;
        kVar2.f56014h = kVar.f56014h;
        kVar2.f56015i = kVar.f56015i;
        kVar2.f56016j = kVar.f56016j;
        kVar2.f56017k = kVar.f56017k;
        kVar2.f56018l = kVar.f56018l;
        kVar2.f56019m = kVar.f56019m;
        kVar2.n = kVar.n;
        kVar2.o = kVar.o;
        kVar2.p = kVar.p;
        kVar2.q = kVar.q;
        kVar2.r = kVar.r;
        kVar2.s = kVar.s;
        kVar2.f56011e = kVar.f56011e;
        p pVar = new p(charSequence, kVar2, eVar, eVar2, f2, f3, this.r, this.f55991a);
        try {
            this.s = o.a.f56032a.a(h(), pVar);
        } catch (n.a unused) {
            c.a.f56597a.a(h(), kVar2.q, kVar2.f56014h, new a(this));
            pVar.f56033a.f56041b.q = null;
            try {
                this.s = o.a.f56032a.a(h(), pVar);
            } catch (n.a e2) {
                throw new RuntimeException(e2);
            }
        }
        n nVar = this.s;
        int i3 = nVar.f56025b.f56033a.f56041b.f56007a;
        if (i3 == -1 || i3 > nVar.f56024a.getLineCount()) {
            i2 = nVar.f56024a.getHeight();
        } else {
            i2 = nVar.f56024a.getLineBottom(i3 - 1);
        }
        return f.a((float) this.s.f56024a.getWidth(), (float) i2);
    }
}
