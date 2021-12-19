package com.bytedance.android.livesdk.chatroom.ui;

import android.os.Build;
import com.bytedance.android.live.base.model.ImageModel;
import com.bytedance.android.live.core.f.k;
import com.bytedance.android.livesdk.chatroom.ui.a.b;
import com.bytedance.android.livesdk.utils.z;
import com.bytedance.common.utility.h;
import com.bytedance.common.utility.n;
import com.bytedance.covode.number.Covode;

/* access modifiers changed from: package-private */
public final /* synthetic */ class cc implements Runnable {

    /* renamed from: a  reason: collision with root package name */
    private final br f16058a;

    static {
        Covode.recordClassIndex(8882);
    }

    cc(br brVar) {
        this.f16058a = brVar;
    }

    public final void run() {
        br brVar = this.f16058a;
        brVar.am = true;
        if (brVar.f15994d != null && brVar.f15994d.background != null) {
            if (Build.VERSION.SDK_INT >= 23) {
                brVar.E.setForeground(null);
            }
            k.a(brVar.E, brVar.f15994d.background);
        } else if (h.b(brVar.f15996f)) {
            k.a(brVar.E, new ImageModel(null, brVar.f15996f), new z(5, ((float) n.a(brVar.getContext())) / ((float) n.b(brVar.getContext()))));
        } else if (brVar.aj == null || brVar.aj.f23299c == null || brVar.aj.f23299c.ay == null) {
            k.a(brVar.E, "res://" + brVar.a(brVar.getContext()) + "/2131234475");
        } else {
            k.a(brVar.E, brVar.aj.f23299c.ay, new z(5, ((float) n.a(brVar.getContext())) / ((float) n.b(brVar.getContext()))));
        }
        if (brVar.E != null) {
            brVar.E.setVisibility(0);
            b.a.a("live_room_ctr").a(null, 3);
        }
    }
}
