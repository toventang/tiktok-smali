package com.bytedance.android.livesdk.chatroom.ui;

import com.bytedance.android.livesdk.ap;
import com.bytedance.android.livesdk.s;
import com.bytedance.covode.number.Covode;

final /* synthetic */ class ci implements Runnable {

    /* renamed from: a  reason: collision with root package name */
    private final br f16064a;

    /* renamed from: b  reason: collision with root package name */
    private final int[] f16065b;

    static {
        Covode.recordClassIndex(8888);
    }

    ci(br brVar, int[] iArr) {
        this.f16064a = brVar;
        this.f16065b = iArr;
    }

    public final void run() {
        br brVar = this.f16064a;
        int[] iArr = this.f16065b;
        int[] iArr2 = new int[4];
        brVar.a(iArr2, iArr[0], iArr[1]);
        if (brVar.V != null) {
            ap apVar = new ap();
            apVar.f14003a = iArr2[0];
            apVar.f14004b = iArr2[1];
            apVar.f14005c = iArr2[2];
            apVar.f14006d = iArr2[3];
            brVar.V.b(s.class, apVar);
        }
    }
}
