package com.lynx.tasm.behavior.shadow.text;

import android.graphics.Typeface;
import android.text.TextUtils;
import com.bytedance.covode.number.Covode;
import com.lynx.tasm.behavior.m;
import com.lynx.tasm.behavior.shadow.text.BaseTextShadowNode;
import com.lynx.tasm.behavior.shadow.text.TextShadowNode;
import com.lynx.tasm.d.c;
import java.util.List;

public class InlineTextShadowNode extends BaseTextShadowNode {

    /* renamed from: a  reason: collision with root package name */
    private int f55987a;

    static {
        Covode.recordClassIndex(34982);
    }

    @Override // com.lynx.tasm.behavior.shadow.ShadowNode
    public final boolean a() {
        return true;
    }

    @m(a = "background-color", e = 0)
    public void setBackgroundColor(int i2) {
        this.f55987a = i2;
    }

    /* access modifiers changed from: protected */
    @Override // com.lynx.tasm.behavior.shadow.text.BaseTextShadowNode
    public final void a(int i2, int i3, List<BaseTextShadowNode.b> list) {
        super.a(i2, i3, list);
        list.add(new BaseTextShadowNode.b(i2, i3, new BackgroundColorSpan(this.f55987a)));
        list.add(new BaseTextShadowNode.b(i2, i3, new f(this.f55957h, this.n, this.o)));
        if (this.f55987a != 0) {
            list.add(new BaseTextShadowNode.b(i2, i3, new BackgroundColorSpan(this.f55987a)));
        }
        if (this.p.n != 1.0E21f) {
            list.add(new BaseTextShadowNode.b(i2, i3, new AbsoluteSizeSpan(Math.round(this.p.n))));
        }
        if (!TextUtils.isEmpty(this.p.q)) {
            String str = this.p.q;
            int a2 = this.p.a();
            Typeface a3 = r.a(h(), str, a2);
            if (a3 == null) {
                c.a.f56597a.a(h(), str, a2, new TextShadowNode.a(this));
                a3 = Typeface.defaultFromStyle(this.p.a());
            }
            list.add(new BaseTextShadowNode.b(i2, i3, new g(a3)));
        }
    }
}
