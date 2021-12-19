package com.ss.android.ugc.aweme.ftc.components.sticker.info;

import android.graphics.Rect;
import android.view.MotionEvent;
import android.view.View;
import com.bytedance.common.utility.n;
import com.bytedance.covode.number.Covode;

final /* synthetic */ class j implements View.OnTouchListener {

    /* renamed from: a  reason: collision with root package name */
    private final i f98083a;

    static {
        Covode.recordClassIndex(62343);
    }

    j(i iVar) {
        this.f98083a = iVar;
    }

    public final boolean onTouch(View view, MotionEvent motionEvent) {
        i iVar = this.f98083a;
        Rect rect = new Rect();
        iVar.p.getHitRect(rect);
        if (motionEvent.getY() < ((float) rect.top) - n.b(iVar.f98068c, 20.0f) || motionEvent.getY() > ((float) rect.bottom) + n.b(iVar.f98068c, 20.0f)) {
            return false;
        }
        float height = (float) (rect.top + (rect.height() / 2));
        float x = motionEvent.getX() - ((float) rect.left);
        if (x < 0.0f) {
            x = 0.0f;
        } else if (x > ((float) rect.width())) {
            x = (float) rect.width();
        }
        return iVar.p.onTouchEvent(MotionEvent.obtain(motionEvent.getDownTime(), motionEvent.getEventTime(), motionEvent.getAction(), x, height, motionEvent.getMetaState()));
    }
}
