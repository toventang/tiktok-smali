package com.bytedance.ies.xelement.reveal;

import android.content.Context;
import android.view.View;
import com.bytedance.covode.number.Covode;
import com.lynx.tasm.behavior.j;
import com.lynx.tasm.behavior.ui.UIGroup;
import h.f.b.l;

public final class LynxRevealInnerRight extends UIGroup<com.lynx.tasm.behavior.ui.view.a> {

    /* renamed from: a  reason: collision with root package name */
    public static final a f37410a = new a((byte) 0);

    static {
        Covode.recordClassIndex(22486);
    }

    public static final class a {
        static {
            Covode.recordClassIndex(22489);
        }

        private a() {
        }

        public /* synthetic */ a(byte b2) {
            this();
        }
    }

    @Override // com.lynx.tasm.behavior.ui.LynxUI
    public final /* synthetic */ View createView(Context context) {
        return new com.lynx.tasm.behavior.ui.view.a(context);
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public LynxRevealInnerRight(j jVar) {
        super(jVar);
        l.c(jVar, "");
    }
}
