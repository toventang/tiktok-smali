package com.ss.ugc.live.barrage.view;

import android.content.Context;
import android.graphics.Canvas;
import android.util.AttributeSet;
import android.view.MotionEvent;
import android.view.View;
import com.bytedance.covode.number.Covode;
import com.bytedance.frameworks.apm.trace.MethodCollector;
import com.ss.ugc.live.barrage.b.a;
import h.f.b.l;
import java.util.ArrayList;
import java.util.Iterator;

public final class BarrageLayout extends View {

    /* renamed from: a */
    private final ArrayList<a> f154102a;

    /* renamed from: b */
    private a f154103b;

    static {
        Covode.recordClassIndex(102752);
    }

    public BarrageLayout(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 4);
    }

    public final void a() {
        Iterator<a> it = this.f154102a.iterator();
        while (it.hasNext()) {
            it.next().a();
        }
    }

    public final void draw(Canvas canvas) {
        l.c(canvas, "");
        super.draw(canvas);
        Iterator<a> it = this.f154102a.iterator();
        while (it.hasNext()) {
            l.c(canvas, "");
            Iterator it2 = it.next().f154086e.iterator();
            while (it2.hasNext()) {
                ((com.ss.ugc.live.barrage.a.a) it2.next()).a(canvas);
            }
        }
    }

    public final boolean onTouchEvent(MotionEvent motionEvent) {
        a aVar;
        l.c(motionEvent, "");
        int action = motionEvent.getAction();
        if (action == 0) {
            Iterator<a> it = this.f154102a.iterator();
            while (it.hasNext()) {
                a next = it.next();
                if (next.a(motionEvent)) {
                    this.f154103b = next;
                    return true;
                }
            }
        } else if (action == 1) {
            a aVar2 = this.f154103b;
            if (aVar2 != null) {
                return aVar2.a(motionEvent);
            }
            this.f154103b = null;
        } else if ((action == 2 || action == 3) && (aVar = this.f154103b) != null) {
            return aVar.a(motionEvent);
        }
        return super.onTouchEvent(motionEvent);
    }

    /* access modifiers changed from: public */
    private void a(a aVar, int i2) {
        if (aVar != null) {
            if (i2 > this.f154102a.size() || i2 < 0) {
                throw new ArrayIndexOutOfBoundsException();
            }
            this.f154102a.add(i2, aVar);
        }
    }

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    public /* synthetic */ BarrageLayout(Context context, AttributeSet attributeSet, int i2) {
        this(context, (i2 & 2) != 0 ? null : attributeSet, (byte) 0);
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    private BarrageLayout(Context context, AttributeSet attributeSet, byte b2) {
        super(context, attributeSet, 0);
        l.c(context, "");
        MethodCollector.i(10604);
        this.f154102a = new ArrayList<>();
        MethodCollector.o(10604);
    }
}
