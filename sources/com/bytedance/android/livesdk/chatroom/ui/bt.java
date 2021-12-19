package com.bytedance.android.livesdk.chatroom.ui;

import com.bytedance.android.livesdk.ap;
import com.bytedance.android.livesdk.s;
import com.bytedance.covode.number.Covode;

final /* synthetic */ class bt implements Runnable {

    /* renamed from: a  reason: collision with root package name */
    private final br f16048a;

    static {
        Covode.recordClassIndex(8872);
    }

    bt(br brVar) {
        this.f16048a = brVar;
    }

    public final void run() {
        br brVar = this.f16048a;
        int[] iArr = new int[4];
        int[] iArr2 = new int[2];
        if (brVar.v != null) {
            brVar.v.getVideoSize(iArr2);
        }
        brVar.a(iArr, iArr2[0], iArr2[1]);
        if (brVar.V != null) {
            ap apVar = new ap();
            apVar.f14003a = iArr[0];
            apVar.f14004b = iArr[1];
            apVar.f14005c = iArr[2];
            apVar.f14006d = iArr[3];
            brVar.V.b(s.class, apVar);
        }
    }
}
