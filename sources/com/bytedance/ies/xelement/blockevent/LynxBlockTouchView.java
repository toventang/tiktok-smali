package com.bytedance.ies.xelement.blockevent;

import android.content.Context;
import android.view.MotionEvent;
import android.view.View;
import com.bytedance.covode.number.Covode;
import com.lynx.tasm.behavior.ui.view.UISimpleView;
import h.f.b.l;

public final class LynxBlockTouchView extends UISimpleView<com.lynx.tasm.behavior.ui.view.a> {
    static {
        Covode.recordClassIndex(22061);
    }

    public static final class a extends com.lynx.tasm.behavior.ui.view.a {
        static {
            Covode.recordClassIndex(22064);
        }

        public final boolean onTouchEvent(MotionEvent motionEvent) {
            return true;
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public a(Context context) {
            super(context);
            l.c(context, "");
        }
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public LynxBlockTouchView(Context context) {
        super(context);
        l.c(context, "");
    }

    @Override // com.lynx.tasm.behavior.ui.LynxUI
    public final /* synthetic */ View createView(Context context) {
        l.c(context, "");
        return new a(context);
    }
}
