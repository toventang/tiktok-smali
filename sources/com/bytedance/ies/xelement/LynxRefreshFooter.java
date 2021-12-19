package com.bytedance.ies.xelement;

import android.content.Context;
import android.view.View;
import com.bytedance.covode.number.Covode;
import com.lynx.tasm.behavior.j;
import com.lynx.tasm.behavior.ui.UIGroup;
import com.lynx.tasm.behavior.ui.view.a;
import h.f.b.l;

public final class LynxRefreshFooter extends UIGroup<a> {
    static {
        Covode.recordClassIndex(21928);
    }

    @Override // com.lynx.tasm.behavior.ui.LynxUI
    public final /* synthetic */ View createView(Context context) {
        return new a(context);
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public LynxRefreshFooter(j jVar) {
        super(jVar);
        l.c(jVar, "");
    }
}
