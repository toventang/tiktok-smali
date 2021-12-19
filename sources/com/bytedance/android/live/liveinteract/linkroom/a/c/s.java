package com.bytedance.android.live.liveinteract.linkroom.a.c;

import com.bytedance.android.livesdk.livesetting.linkmic.MtCoHostInviteTimeOutSetting;
import com.bytedance.android.livesdk.util.rxutils.autodispose.z;
import com.bytedance.covode.number.Covode;
import f.a.a.a.a;
import h.f.a.b;
import java.util.concurrent.TimeUnit;

final /* synthetic */ class s implements b {

    /* renamed from: a  reason: collision with root package name */
    private final b f10526a;

    static {
        Covode.recordClassIndex(5609);
    }

    s(b bVar) {
        this.f10526a = bVar;
    }

    @Override // h.f.a.b
    public final Object invoke(Object obj) {
        b bVar = this.f10526a;
        if (bVar.y != null) {
            if (bVar.f10497b != null && !bVar.f10497b.isDisposed()) {
                bVar.f10497b.dispose();
            }
            int value = MtCoHostInviteTimeOutSetting.INSTANCE.getValue();
            bVar.f10497b = ((z) com.bytedance.android.livesdk.utils.b.b.a(1, TimeUnit.SECONDS).b((long) (value + 1)).d(new k(value)).a(a.a(f.a.a.b.a.f157156a)).a(bVar.t())).a(new l(bVar), new m(bVar), new n(bVar, value));
        }
        return h.z.f158842a;
    }
}
