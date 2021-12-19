package com.lynx.tasm.behavior.c;

import com.bytedance.covode.number.Covode;
import com.lynx.react.bridge.JavaOnlyMap;
import com.lynx.react.bridge.ReadableMap;
import com.lynx.tasm.base.TraceEvent;
import com.lynx.tasm.behavior.q;
import com.lynx.tasm.behavior.ui.LynxBaseUI;
import com.lynx.tasm.behavior.ui.UIShadowProxy;
import com.lynx.tasm.behavior.v;
import com.lynx.tasm.utils.m;

public final class o extends f {

    /* renamed from: a  reason: collision with root package name */
    private final ReadableMap f55863a;

    /* renamed from: c  reason: collision with root package name */
    private final boolean f55864c;

    static {
        Covode.recordClassIndex(34922);
    }

    @Override // com.lynx.tasm.behavior.c.f, com.lynx.tasm.behavior.c.k
    public final void a(k kVar) {
        ((JavaOnlyMap) this.f55863a).merge(((o) kVar).f55863a);
    }

    /* access modifiers changed from: protected */
    @Override // com.lynx.tasm.behavior.c.k
    public final void a(q qVar) {
        v vVar;
        int i2 = this.f55846b.f55847a;
        boolean z = this.f55864c;
        if (this.f55863a != null) {
            vVar = new v(this.f55863a);
        } else {
            vVar = null;
        }
        m.b();
        LynxBaseUI lynxBaseUI = qVar.f55935e.get(Integer.valueOf(i2));
        String str = "UIOwner.updateProps." + lynxBaseUI.mTagName;
        TraceEvent.a(0, str);
        if (qVar.f55933c.q) {
            lynxBaseUI.updateAttributes(vVar);
            return;
        }
        if (vVar != null) {
            if (qVar.f55933c.r && !z && lynxBaseUI.isFlatten()) {
                qVar.a(i2, z);
                lynxBaseUI = qVar.f55935e.get(Integer.valueOf(i2));
            }
            if (vVar.a("transition")) {
                if (lynxBaseUI instanceof UIShadowProxy) {
                    ((UIShadowProxy) lynxBaseUI).f56071a.initTransitionAnimator(vVar.f56468a);
                } else {
                    lynxBaseUI.initTransitionAnimator(vVar.f56468a);
                }
            }
            if (vVar.a("animation")) {
                if (lynxBaseUI instanceof UIShadowProxy) {
                    ((UIShadowProxy) lynxBaseUI).f56071a.setAnimation(vVar.d("animation"));
                } else {
                    lynxBaseUI.setAnimation(vVar.d("animation"));
                }
            }
            if (q.a(vVar) && (!(vVar.d("box-shadow") == null && vVar.a("outline-style", -1) == -1) && !(lynxBaseUI instanceof UIShadowProxy) && lynxBaseUI.mParent != null && !(lynxBaseUI.mParent instanceof UIShadowProxy))) {
                LynxBaseUI parentBaseUI = lynxBaseUI.getParentBaseUI();
                int index = parentBaseUI.getIndex(lynxBaseUI);
                qVar.a(parentBaseUI.getSign(), lynxBaseUI.getSign());
                UIShadowProxy uIShadowProxy = new UIShadowProxy(qVar.f55933c, lynxBaseUI);
                qVar.f55935e.put(Integer.valueOf(lynxBaseUI.getSign()), uIShadowProxy);
                qVar.a(parentBaseUI.getSign(), uIShadowProxy.getSign(), index);
            }
            lynxBaseUI.updateProperties(vVar);
        }
        TraceEvent.b(0, str);
    }

    public o(int i2, boolean z, ReadableMap readableMap) {
        super(i2, 4);
        this.f55863a = readableMap;
        this.f55864c = z;
    }
}
