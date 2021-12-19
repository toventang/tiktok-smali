package com.bytedance.android.live.copyrightreview.helper;

import com.bytedance.android.livesdk.j.ac;
import com.bytedance.android.livesdkapi.depend.model.live.Room;
import com.bytedance.covode.number.Covode;
import com.bytedance.ies.sdk.datachannel.DataChannelGlobal;
import f.a.d.f;

final /* synthetic */ class c implements f {

    /* renamed from: a  reason: collision with root package name */
    private final CopyrightViolationHelper f8840a;

    static {
        Covode.recordClassIndex(4523);
    }

    c(CopyrightViolationHelper copyrightViolationHelper) {
        this.f8840a = copyrightViolationHelper;
    }

    @Override // f.a.d.f
    public final void accept(Object obj) {
        CopyrightViolationHelper copyrightViolationHelper = this.f8840a;
        copyrightViolationHelper.f8832b.dismiss();
        Room room = (Room) DataChannelGlobal.f34575d.b(ac.class);
        if (room != null) {
            copyrightViolationHelper.a(room, CopyrightViolationHelper.b(room), 103);
            CopyrightViolationHelper.a(room);
        }
    }
}
