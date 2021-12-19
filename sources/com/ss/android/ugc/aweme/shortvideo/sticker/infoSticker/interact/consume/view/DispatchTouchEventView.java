package com.ss.android.ugc.aweme.shortvideo.sticker.infoSticker.interact.consume.view;

import android.content.Context;
import android.util.AttributeSet;
import android.view.MotionEvent;
import android.widget.ProgressBar;
import com.bytedance.covode.number.Covode;
import com.bytedance.frameworks.apm.trace.MethodCollector;
import com.ss.android.ugc.aweme.sticker.k.c;
import h.f.b.l;

public final class DispatchTouchEventView extends ProgressBar {

    /* renamed from: a  reason: collision with root package name */
    private c f130424a;

    /* renamed from: b  reason: collision with root package name */
    private m f130425b;

    /* renamed from: c  reason: collision with root package name */
    private a f130426c;

    public interface a {
        static {
            Covode.recordClassIndex(85534);
        }

        void a(int i2);
    }

    static {
        Covode.recordClassIndex(85532);
    }

    public final a getClickListener() {
        return this.f130426c;
    }

    public final c getListener() {
        return this.f130424a;
    }

    public final m getStatusView() {
        return this.f130425b;
    }

    public final void setClickListener(a aVar) {
        this.f130426c = aVar;
    }

    public final void setListener(c cVar) {
        this.f130424a = cVar;
    }

    public final void setStatusView(m mVar) {
        this.f130425b = mVar;
    }

    public final boolean dispatchTouchEvent(MotionEvent motionEvent) {
        Integer valueOf;
        Integer status;
        Integer status2;
        if (!(motionEvent == null || (valueOf = Integer.valueOf(motionEvent.getAction())) == null)) {
            if (valueOf.intValue() == 0) {
                m mVar = this.f130425b;
                if (mVar == null || (status2 = mVar.getStatus()) == null || status2.intValue() != 0) {
                    return false;
                }
            } else if (valueOf.intValue() == 1) {
                m mVar2 = this.f130425b;
                if (mVar2 == null || (status = mVar2.getStatus()) == null || status.intValue() != 0) {
                    return false;
                }
                a aVar = this.f130426c;
                if (aVar != null) {
                    aVar.a(getId());
                }
            }
        }
        return super.dispatchTouchEvent(motionEvent);
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public DispatchTouchEventView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        l.d(context, "");
        MethodCollector.i(2451);
        setOnClickListener(AnonymousClass1.f130427a);
        MethodCollector.o(2451);
    }
}
