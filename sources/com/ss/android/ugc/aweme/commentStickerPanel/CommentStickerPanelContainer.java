package com.ss.android.ugc.aweme.commentStickerPanel;

import android.content.Context;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.MotionEvent;
import android.widget.RelativeLayout;
import com.a;
import com.bytedance.covode.number.Covode;
import com.bytedance.frameworks.apm.trace.MethodCollector;
import com.zhiliaoapp.musically.R;
import h.f.a.b;
import h.f.b.l;

public final class CommentStickerPanelContainer extends RelativeLayout {

    /* renamed from: a  reason: collision with root package name */
    private b<? super MotionEvent, Boolean> f73106a;

    static {
        Covode.recordClassIndex(45043);
    }

    /* JADX DEBUG: Type inference failed for r0v0. Raw type applied. Possible types: h.f.a.b<? super android.view.MotionEvent, java.lang.Boolean>, h.f.a.b<android.view.MotionEvent, java.lang.Boolean> */
    public final b<MotionEvent, Boolean> getMOnInterceptorHandler() {
        return this.f73106a;
    }

    public final void setMOnInterceptorHandler(b<? super MotionEvent, Boolean> bVar) {
        this.f73106a = bVar;
    }

    public final void setOnInterceptorHandler(b<? super MotionEvent, Boolean> bVar) {
        l.d(bVar, "");
        this.f73106a = bVar;
    }

    public final boolean dispatchTouchEvent(MotionEvent motionEvent) {
        l.d(motionEvent, "");
        b<? super MotionEvent, Boolean> bVar = this.f73106a;
        if (bVar != null) {
            bVar.invoke(motionEvent);
        }
        return super.dispatchTouchEvent(motionEvent);
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public CommentStickerPanelContainer(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        l.d(context, "");
        MethodCollector.i(1707);
        a.a(LayoutInflater.from(context), R.layout.ni, this, true);
        MethodCollector.o(1707);
    }
}
