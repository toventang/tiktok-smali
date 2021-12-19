package com.bytedance.android.livesdk.widgets.giftwidget.b;

import com.bytedance.android.live.core.f.y;
import com.bytedance.android.livesdk.i;
import com.bytedance.android.livesdk.j.ac;
import com.bytedance.android.livesdk.j.cp;
import com.bytedance.android.livesdk.u.a;
import com.bytedance.android.livesdkapi.depend.model.live.Room;
import com.bytedance.covode.number.Covode;
import com.bytedance.ies.sdk.datachannel.DataChannelGlobal;
import f.a.d.f;

/* access modifiers changed from: package-private */
public final /* synthetic */ class m implements f {

    /* renamed from: a  reason: collision with root package name */
    private final b f22790a;

    static {
        Covode.recordClassIndex(13432);
    }

    m(b bVar) {
        this.f22790a = bVar;
    }

    @Override // f.a.d.f
    public final void accept(Object obj) {
        b bVar = this.f22790a;
        i iVar = (i) obj;
        Room room = (Room) DataChannelGlobal.f34575d.b(ac.class);
        boolean booleanValue = ((Boolean) bVar.f22767a.b(cp.class)).booleanValue();
        if ((room == null || !(room.getStreamType() == com.bytedance.android.livesdkapi.depend.model.live.i.THIRD_PARTY || a.b() == a.EnumC0481a.LINK_MIC_ANCHOR || a.b() == a.EnumC0481a.LINK_MIC_PK)) && booleanValue && iVar.f18198a != null) {
            bVar.f22768b.a(iVar.f18198a.intValue() + y.a(16.0f));
        }
    }
}
