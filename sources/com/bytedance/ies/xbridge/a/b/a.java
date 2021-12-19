package com.bytedance.ies.xbridge.a.b;

import com.bytedance.covode.number.Covode;
import com.bytedance.ies.xbridge.a.a.a;
import com.bytedance.ies.xbridge.a.c.a;
import com.bytedance.ies.xbridge.base.runtime.depend.IHostUserDepend;
import com.bytedance.ies.xbridge.base.runtime.depend.b;
import com.bytedance.ies.xbridge.e;
import com.bytedance.ies.xbridge.model.params.c;
import h.f.b.l;

public final class a extends com.bytedance.ies.xbridge.a.a.a {
    static {
        Covode.recordClassIndex(21336);
    }

    @Override // com.bytedance.ies.xbridge.a.a.a
    public final void a(c cVar, a.AbstractC0810a aVar, e eVar) {
        IHostUserDepend iHostUserDepend;
        boolean z;
        b bVar;
        l.c(cVar, "");
        l.c(aVar, "");
        l.c(eVar, "");
        b bVar2 = (b) a(b.class);
        if ((bVar2 == null || (iHostUserDepend = bVar2.f35879h) == null) && ((bVar = b.f35870l) == null || (iHostUserDepend = bVar.f35879h) == null)) {
            aVar.a("hostUserDepend is null");
            return;
        }
        com.bytedance.ies.xbridge.a.c.a aVar2 = new com.bytedance.ies.xbridge.a.c.a();
        a.b bVar3 = new a.b();
        String userId = iHostUserDepend.getUserId();
        if (userId == null) {
            userId = "";
        }
        bVar3.f35752a = userId;
        String secUid = iHostUserDepend.getSecUid();
        if (secUid == null) {
            secUid = "";
        }
        bVar3.f35753b = secUid;
        String uniqueID = iHostUserDepend.getUniqueID();
        if (uniqueID == null) {
            uniqueID = "";
        }
        bVar3.f35754c = uniqueID;
        String nickname = iHostUserDepend.getNickname();
        if (nickname == null) {
            nickname = "";
        }
        bVar3.f35755d = nickname;
        String avatarURL = iHostUserDepend.getAvatarURL();
        if (avatarURL == null) {
            avatarURL = "";
        }
        bVar3.f35756e = avatarURL;
        String boundPhone = iHostUserDepend.getBoundPhone();
        if (boundPhone == null) {
            boundPhone = "";
        }
        if (boundPhone.length() > 0) {
            z = true;
        } else {
            z = false;
        }
        bVar3.f35757f = Boolean.valueOf(z);
        aVar2.f35750a = bVar3;
        aVar2.f35751b = Boolean.valueOf(iHostUserDepend.hasLogin());
        aVar.a(aVar2, "");
    }
}
