package com.bytedance.android.livesdk.widgets.giftwidget.b;

import com.bytedance.android.livesdk.bd;
import com.bytedance.android.livesdk.be;
import com.bytedance.android.livesdk.dialogv2.viewmodel.a;
import com.bytedance.android.livesdk.gift.d.i;
import com.bytedance.covode.number.Covode;
import com.bytedance.ies.sdk.datachannel.DataChannel;
import f.a.d.f;

/* access modifiers changed from: package-private */
public final /* synthetic */ class k implements f {

    /* renamed from: a  reason: collision with root package name */
    private final b f22788a;

    static {
        Covode.recordClassIndex(13430);
    }

    k(b bVar) {
        this.f22788a = bVar;
    }

    @Override // f.a.d.f
    public final void accept(Object obj) {
        String str;
        b bVar = this.f22788a;
        i iVar = (i) obj;
        if (bVar.f22767a != null) {
            DataChannel dataChannel = bVar.f22767a;
            if (iVar.f17855a != null) {
                str = iVar.f17855a;
            } else {
                str = "first_recharge";
            }
            dataChannel.c(be.class, new bd(str, 0, "other_recharge", a.C0355a.C0356a.f17017a.f17009e));
        }
    }
}
