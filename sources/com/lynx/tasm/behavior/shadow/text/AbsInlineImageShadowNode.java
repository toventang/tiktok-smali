package com.lynx.tasm.behavior.shadow.text;

import com.bytedance.covode.number.Covode;
import com.lynx.tasm.behavior.m;
import com.lynx.tasm.behavior.shadow.ShadowNode;
import com.lynx.tasm.behavior.shadow.text.BaseTextShadowNode;
import com.lynx.tasm.behavior.ui.text.a;
import com.lynx.tasm.c.c;
import java.util.List;
import java.util.Map;

public abstract class AbsInlineImageShadowNode extends ShadowNode {

    /* renamed from: a  reason: collision with root package name */
    private boolean f55976a;

    /* renamed from: b  reason: collision with root package name */
    private boolean f55977b;

    static {
        Covode.recordClassIndex(34974);
    }

    @Override // com.lynx.tasm.behavior.shadow.ShadowNode
    public final boolean a() {
        return true;
    }

    public abstract a b();

    @m(a = "mode")
    public abstract void setMode(String str);

    @m(a = "src")
    public abstract void setSource(String str);

    public final void a(String str) {
        if (this.f55977b) {
            c cVar = new c(this.f55957h, "error");
            cVar.a("errMsg", str);
            h().f55897e.a(cVar);
        }
    }

    @Override // com.lynx.tasm.behavior.shadow.ShadowNode
    public final void a(Map<String, com.lynx.tasm.c.a> map) {
        super.a(map);
        if (map != null) {
            this.f55976a = map.containsKey("load");
            this.f55977b = map.containsKey("error");
        }
    }

    public final void a(int i2, int i3) {
        if (this.f55976a) {
            c cVar = new c(this.f55957h, "load");
            cVar.a("height", Integer.valueOf(i3));
            cVar.a("width", Integer.valueOf(i2));
            h().f55897e.a(cVar);
        }
    }

    /* access modifiers changed from: protected */
    public final void a(int i2, int i3, List<BaseTextShadowNode.b> list) {
        list.add(new BaseTextShadowNode.b(i2, i3, b()));
        list.add(new BaseTextShadowNode.b(i2, i3, new f(this.f55957h, this.n, this.o)));
    }
}
