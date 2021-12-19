package com.bytedance.android.livesdk.chatroom.ui;

import com.bytedance.android.live.core.c.a;
import com.bytedance.android.live.design.view.e;
import com.bytedance.android.livesdk.ai.c;
import com.bytedance.common.utility.n;
import com.bytedance.covode.number.Covode;
import h.f.a.b;
import h.z;

final /* synthetic */ class bu implements b {

    /* renamed from: a  reason: collision with root package name */
    private final br f16049a;

    static {
        Covode.recordClassIndex(8873);
    }

    bu(br brVar) {
        this.f16049a = brVar;
    }

    @Override // h.f.a.b
    public final Object invoke(Object obj) {
        br brVar = this.f16049a;
        Boolean bool = (Boolean) obj;
        c.b.a().f13752f = bool.booleanValue();
        if (bool.booleanValue()) {
            e.c.f9440a.a(false);
        } else {
            int[] iArr = new int[2];
            if (brVar.v != null) {
                brVar.v.getVideoSize(iArr);
            }
            a.a(4, "picture_in_picture", "{" + iArr[0] + "," + iArr[1] + "}");
            if (!(iArr[0] == 0 || iArr[1] == 0)) {
                brVar.a(iArr[0], iArr[1], n.a(brVar.getContext()));
            }
            if (brVar.f15994d == null || brVar.f15994d.maskLayer == null) {
                e.c.f9440a.a(true);
            }
        }
        return z.f158842a;
    }
}
