package com.lynx.tasm.behavior.ui.canvas;

import android.content.Context;
import com.bytedance.covode.number.Covode;
import com.lynx.tasm.behavior.m;
import com.lynx.tasm.behavior.ui.LynxUI;

public class LynxHeliumCanvas extends LynxUI<LynxHeliumCanvasView> {
    private boolean mConsumeAllEvents = false;
    private Long mRuntimeId = this.mContext.d();

    static {
        Covode.recordClassIndex(35083);
    }

    public Long getRuntimeId() {
        return this.mRuntimeId;
    }

    @m(a = "consume-android-events")
    public void setConsumeAllEvents(boolean z) {
        this.mConsumeAllEvents = z;
        if (this.mView != null) {
            ((LynxHeliumCanvasView) this.mView).setConsumeAllEvents(this.mConsumeAllEvents);
        }
    }

    public LynxHeliumCanvas(Context context) {
        super(context);
        LynxHelium.getInstance().onLynxCanvasUIInit(this);
    }

    /* access modifiers changed from: protected */
    @Override // com.lynx.tasm.behavior.ui.LynxUI
    public LynxHeliumCanvasView createView(Context context) {
        LynxHeliumCanvasView lynxHeliumCanvasView = new LynxHeliumCanvasView(context);
        lynxHeliumCanvasView.setCanvasUI(this);
        lynxHeliumCanvasView.setConsumeAllEvents(this.mConsumeAllEvents);
        this.mView = lynxHeliumCanvasView;
        ((LynxHeliumCanvasView) this.mView).setOpaque(false);
        return (LynxHeliumCanvasView) this.mView;
    }
}
