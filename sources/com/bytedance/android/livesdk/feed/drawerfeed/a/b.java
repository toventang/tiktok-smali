package com.bytedance.android.livesdk.feed.drawerfeed.a;

import android.view.MotionEvent;
import android.view.View;
import com.bytedance.covode.number.Covode;

/* access modifiers changed from: package-private */
public final /* synthetic */ class b implements View.OnTouchListener {

    /* renamed from: a  reason: collision with root package name */
    private final a f17372a;

    static {
        Covode.recordClassIndex(9629);
    }

    b(a aVar) {
        this.f17372a = aVar;
    }

    public final boolean onTouch(View view, MotionEvent motionEvent) {
        a aVar = this.f17372a;
        int action = motionEvent.getAction();
        if (action == 0) {
            aVar.f17353a.removeCallbacks(aVar.f17355c);
            return false;
        } else if (action != 3 && action != 1) {
            return false;
        } else {
            aVar.f17353a.postDelayed(aVar.f17355c, 5000);
            return false;
        }
    }
}
