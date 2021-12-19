package com.bytedance.android.livesdk.chatroom.ui;

import android.content.DialogInterface;
import androidx.fragment.app.e;
import com.bytedance.android.live.core.f.y;
import com.bytedance.android.livesdk.ap.a;
import com.bytedance.android.livesdk.ap.c;
import com.bytedance.android.livesdk.l.b;
import com.bytedance.covode.number.Covode;
import com.zhiliaoapp.musically.R;

final /* synthetic */ class q implements Runnable {

    /* renamed from: a  reason: collision with root package name */
    private final a f16216a;

    static {
        Covode.recordClassIndex(8980);
    }

    q(a aVar) {
        this.f16216a = aVar;
    }

    public final void run() {
        a aVar = this.f16216a;
        e activity = aVar.getActivity();
        if (activity != null && !activity.isFinishing()) {
            b.a aVar2 = new b.a(aVar.getActivity());
            aVar2.f18284a = y.a((int) R.string.ehn);
            aVar2.f18285b = y.a((int) R.string.ehl);
            b a2 = aVar2.a((CharSequence) y.a((int) R.string.eho), (DialogInterface.OnClickListener) new t(activity), false).b((CharSequence) y.a((int) R.string.ehm), u.f16220a, false).a();
            a2.setOnCancelListener(v.f16221a);
            a2.show();
            c.a((com.bytedance.android.livesdk.ao.c) a.cs, (Object) true);
        }
    }
}
