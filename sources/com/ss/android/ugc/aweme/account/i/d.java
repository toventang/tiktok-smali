package com.ss.android.ugc.aweme.account.i;

import com.bytedance.covode.number.Covode;
import h.f.b.l;
import java.util.HashMap;

public final class d extends c {

    /* renamed from: a  reason: collision with root package name */
    public static final d f63064a = new d();

    @Override // com.ss.android.ugc.aweme.account.i.c
    public final String a() {
        return "VerifyCode";
    }

    private d() {
    }

    static {
        Covode.recordClassIndex(38850);
    }

    public static final void b() {
        HashMap hashMap = new HashMap();
        hashMap.put("event", "on send code success");
        d dVar = f63064a;
        String hashMap2 = hashMap.toString();
        l.b(hashMap2, "");
        dVar.b(hashMap2);
    }

    public static final void a(String str, String str2) {
        HashMap hashMap = new HashMap();
        hashMap.put("event", "on send code error");
        if (str == null) {
            str = "";
        }
        hashMap.put("errorCode", str);
        if (str2 == null) {
            str2 = "";
        }
        hashMap.put("errorMsg", str2);
        d dVar = f63064a;
        String hashMap2 = hashMap.toString();
        l.b(hashMap2, "");
        dVar.b(hashMap2);
    }
}
