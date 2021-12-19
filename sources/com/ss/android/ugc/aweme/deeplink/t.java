package com.ss.android.ugc.aweme.deeplink;

import com.bytedance.covode.number.Covode;
import com.ss.android.ugc.aweme.deeplink.c.a;
import com.ss.android.ugc.aweme.deeplink.c.c;
import com.ss.android.ugc.aweme.deeplink.c.e;
import com.ss.android.ugc.aweme.deeplink.c.f;
import com.ss.android.ugc.aweme.deeplink.c.g;
import h.f.b.l;
import java.util.HashMap;

public final class t {

    /* renamed from: a  reason: collision with root package name */
    public HashMap<String, Integer> f79531a = new HashMap<>();

    /* renamed from: b  reason: collision with root package name */
    public final s f79532b;

    static {
        Covode.recordClassIndex(49400);
    }

    public t(c cVar) {
        l.d(cVar, "");
        s sVar = new s();
        this.f79532b = sVar;
        sVar.a(new c());
        this.f79531a.put("EntryNode", 1);
        sVar.a(new f());
        int i2 = 2;
        this.f79531a.put("NewUserJourneyNode", 2);
        if (cVar.f79449a) {
            sVar.a(new a());
            this.f79531a.put("AppLinkNode", 3);
            i2 = 3;
        }
        sVar.a(new e());
        int i3 = i2 + 1;
        this.f79531a.put("LoginNode", Integer.valueOf(i3));
        sVar.a(new g());
        this.f79531a.put("TerminalNode", Integer.valueOf(i3 + 1));
    }
}
