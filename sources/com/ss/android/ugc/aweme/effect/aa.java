package com.ss.android.ugc.aweme.effect;

import android.view.MotionEvent;
import android.view.View;
import com.bytedance.covode.number.Covode;
import com.ss.android.ugc.aweme.effect.z;

/* access modifiers changed from: package-private */
public final /* synthetic */ class aa implements View.OnTouchListener {

    /* renamed from: a  reason: collision with root package name */
    private final z.b f88776a;

    static {
        Covode.recordClassIndex(55846);
    }

    aa(z.b bVar) {
        this.f88776a = bVar;
    }

    public final boolean onTouch(View view, MotionEvent motionEvent) {
        z.b bVar = this.f88776a;
        int adapterPosition = bVar.getAdapterPosition();
        if (-1 == adapterPosition) {
            return false;
        }
        int action = motionEvent.getAction();
        if (action == 0) {
            bVar.f89008c.animate().scaleX(1.2f).scaleY(1.2f).setDuration(100).start();
            if (z.this.f89005a != null) {
                z.this.f89005a.a(0, adapterPosition, z.this.f88774c.get(adapterPosition));
            }
        } else if (action == 1 || action == 3) {
            bVar.f89008c.animate().scaleX(1.0f).scaleY(1.0f).setDuration(100).start();
            if (z.this.f89005a != null) {
                z.this.f89005a.a(1, adapterPosition, z.this.f88774c.get(adapterPosition));
            }
        }
        return true;
    }
}
