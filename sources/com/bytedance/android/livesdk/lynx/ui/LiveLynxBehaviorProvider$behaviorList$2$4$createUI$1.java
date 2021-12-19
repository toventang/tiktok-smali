package com.bytedance.android.livesdk.lynx.ui;

import android.content.Context;
import android.view.View;
import com.bytedance.covode.number.Covode;
import com.lynx.tasm.behavior.j;
import com.lynx.tasm.behavior.ui.view.UISimpleView;
import com.lynx.tasm.behavior.ui.view.a;

public final class LiveLynxBehaviorProvider$behaviorList$2$4$createUI$1 extends UISimpleView<a> {

    /* renamed from: a  reason: collision with root package name */
    final /* synthetic */ j f18802a;

    static {
        Covode.recordClassIndex(11133);
    }

    @Override // com.lynx.tasm.behavior.ui.LynxUI
    public final /* synthetic */ View createView(Context context) {
        return new a(context);
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    LiveLynxBehaviorProvider$behaviorList$2$4$createUI$1(j jVar, j jVar2) {
        super(jVar2);
        this.f18802a = jVar;
    }
}
