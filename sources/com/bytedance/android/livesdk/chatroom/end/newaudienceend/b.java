package com.bytedance.android.livesdk.chatroom.end.newaudienceend;

import com.bytedance.android.live.core.f.y;
import com.bytedance.covode.number.Covode;
import com.zhiliaoapp.musically.R;

final /* synthetic */ class b implements Runnable {

    /* renamed from: a  reason: collision with root package name */
    private final a f15473a;

    static {
        Covode.recordClassIndex(8541);
    }

    b(a aVar) {
        this.f15473a = aVar;
    }

    public final void run() {
        a aVar = this.f15473a;
        if (aVar.f15468l == null) {
            return;
        }
        if (aVar.f15469m == 0) {
            if (aVar.f15464c != null) {
                p.a(aVar.f15464c, aVar.getContext(), aVar.f15462a, true);
            }
            aVar.f15469m--;
            aVar.f15468l.setText(y.a((int) R.string.e1o));
        } else if (aVar.f15469m > 0) {
            aVar.f15469m--;
            aVar.f15468l.setText(y.a((int) R.string.e1n, Integer.valueOf(aVar.f15469m)));
            if (aVar.n) {
                aVar.f15463b.removeCallbacksAndMessages(null);
            } else if (aVar.f15463b != null) {
                aVar.f15463b.postDelayed(aVar.o, 1000);
            }
        }
    }
}
