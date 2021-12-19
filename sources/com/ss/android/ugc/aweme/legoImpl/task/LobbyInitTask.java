package com.ss.android.ugc.aweme.legoImpl.task;

import android.content.Context;
import com.bytedance.awemelobby.a;
import com.bytedance.covode.number.Covode;
import com.bytedance.lobby.internal.LobbyCore;
import com.bytedance.lobby.internal.c;
import com.ss.android.ugc.aweme.lego.ab;
import com.ss.android.ugc.aweme.lego.ad;
import com.ss.android.ugc.aweme.lego.ae;
import com.ss.android.ugc.aweme.lego.w;
import com.ss.android.ugc.aweme.lego.x;
import h.a.n;
import h.f.b.l;
import java.util.List;

public final class LobbyInitTask implements w {
    static {
        Covode.recordClassIndex(69258);
    }

    @Override // com.ss.android.ugc.aweme.lego.n
    public final int bK_() {
        return 1;
    }

    @Override // com.ss.android.ugc.aweme.lego.n
    public final ad f() {
        return x.a(this);
    }

    @Override // com.ss.android.ugc.aweme.lego.n
    public final String g() {
        return "task_";
    }

    @Override // com.ss.android.ugc.aweme.lego.n
    public final boolean i() {
        return true;
    }

    @Override // com.ss.android.ugc.aweme.lego.n
    public final List j() {
        return null;
    }

    @Override // com.ss.android.ugc.aweme.lego.w
    public final ae b() {
        return ae.MAIN;
    }

    @Override // com.ss.android.ugc.aweme.lego.n
    public final ab k() {
        return ab.DEFAULT;
    }

    @Override // com.ss.android.ugc.aweme.lego.n
    public final String h() {
        return getClass().getSimpleName();
    }

    @Override // com.ss.android.ugc.aweme.lego.n
    public final void a(Context context) {
        l.d(context, "");
        l.c(context, "");
        a.C0551a aVar = new a.C0551a();
        c.a.C0984a aVar2 = new c.a.C0984a();
        Context applicationContext = context.getApplicationContext();
        if (com.ss.android.ugc.aweme.lancet.a.a.f107168c && applicationContext == null) {
            applicationContext = com.ss.android.ugc.aweme.lancet.a.a.f107166a;
        }
        aVar2.f40242a = applicationContext;
        aVar2.f40243b = a.f25817a;
        aVar2.f40244c = aVar;
        int i2 = 0;
        LobbyCore.initialize(new c.a(aVar2, (byte) 0));
        if (a.f25817a) {
            StringBuilder sb = new StringBuilder();
            for (T t : aVar.b()) {
                int i3 = i2 + 1;
                if (i2 < 0) {
                    n.a();
                }
                T t2 = t;
                if (i2 > 0) {
                    sb.append(",");
                }
                sb.append(t2.f40176b);
                i2 = i3;
            }
            l.a((Object) sb.toString(), "");
            aVar.b().size();
        }
    }
}
