package com.bytedance.android.livesdk.chatroom.b;

import android.util.Base64;
import com.bytedance.android.e.a.a.d;
import com.bytedance.android.e.a.a.f;
import com.bytedance.android.live.base.model.emoji.EmoteModel;
import com.bytedance.android.live.base.model.user.User;
import com.bytedance.android.live.core.c.a;
import com.bytedance.android.live.network.h;
import com.bytedance.android.livesdk.chatroom.model.Barrage;
import com.bytedance.android.livesdk.model.message.ai;
import com.bytedance.android.livesdk.model.message.bx;
import com.bytedance.android.livesdk.model.message.cc;
import com.bytedance.android.livesdk.model.message.ce;
import com.bytedance.android.livesdk.model.message.n;
import com.bytedance.android.livesdk.model.message.s;
import com.bytedance.covode.number.Covode;
import java.util.List;

public final class b {
    static {
        Covode.recordClassIndex(8297);
    }

    public static cc a(Barrage barrage) {
        try {
            com.bytedance.android.e.a.a.b a2 = h.a().a(cc.class);
            if (a2 == null) {
                return null;
            }
            return (cc) a2.a(new f().a(d.a(Base64.decode(barrage.getScreenChatMsg(), 0))));
        } catch (Exception e2) {
            a.a(6, "ttlive_msg", e2.toString());
            return null;
        }
    }

    public static n a(long j2) {
        n nVar = new n();
        com.bytedance.android.livesdkapi.h.b bVar = new com.bytedance.android.livesdkapi.h.b();
        bVar.f23211c = j2;
        bVar.f23212d = -1;
        bVar.f23215g = true;
        nVar.O = bVar;
        nVar.f19656a = 1;
        return nVar;
    }

    public static ai a(long j2, User user) {
        com.bytedance.android.livesdkapi.h.b bVar = new com.bytedance.android.livesdkapi.h.b();
        bVar.f23211c = j2;
        bVar.f23215g = true;
        ai aiVar = new ai(true, user);
        aiVar.O = bVar;
        return aiVar;
    }

    public static bx a(long j2, String str) {
        bx bxVar = new bx();
        com.bytedance.android.livesdkapi.h.b bVar = new com.bytedance.android.livesdkapi.h.b();
        bVar.f23211c = j2;
        bVar.f23215g = true;
        bxVar.O = bVar;
        bxVar.f19385a = str;
        return bxVar;
    }

    public static ce a(long j2, com.bytedance.android.livesdk.model.message.c.b bVar, User user) {
        if (bVar == null) {
            return null;
        }
        com.bytedance.android.livesdkapi.h.b bVar2 = new com.bytedance.android.livesdkapi.h.b();
        bVar2.f23211c = j2;
        bVar2.f23215g = true;
        bVar2.f23218j = bVar;
        ce ceVar = new ce();
        ceVar.O = bVar2;
        ceVar.f19471f = user;
        return ceVar;
    }

    public static s a(long j2, List<EmoteModel> list, long j3, com.bytedance.android.live.base.model.user.b bVar, User user) {
        s sVar = new s();
        sVar.f19686a = list;
        com.bytedance.android.livesdkapi.h.b bVar2 = new com.bytedance.android.livesdkapi.h.b();
        bVar2.f23211c = j2;
        bVar2.f23212d = j3;
        bVar2.f23215g = true;
        sVar.O = bVar2;
        if (user != null) {
            sVar.f19687f = user;
        } else {
            sVar.f19687f = User.from(bVar);
        }
        return sVar;
    }
}
