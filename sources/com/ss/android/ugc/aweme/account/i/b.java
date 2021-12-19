package com.ss.android.ugc.aweme.account.i;

import com.bytedance.covode.number.Covode;
import h.f.b.l;
import java.util.HashMap;

public final class b extends c {

    /* renamed from: a  reason: collision with root package name */
    public static final b f63061a = new b();

    /* renamed from: c  reason: collision with root package name */
    private static final String f63062c = "SwitchAccount";

    private b() {
    }

    @Override // com.ss.android.ugc.aweme.account.i.c
    public final String a() {
        return f63062c;
    }

    static {
        Covode.recordClassIndex(38847);
    }

    public static final void b() {
        HashMap hashMap = new HashMap();
        hashMap.put("event", "switch account successfully");
        b bVar = f63061a;
        String hashMap2 = hashMap.toString();
        l.b(hashMap2, "");
        bVar.b(hashMap2);
    }

    public static final void a(Integer num, String str) {
        HashMap hashMap = new HashMap();
        hashMap.put("event", "switch account failed");
        hashMap.put("errorCode", String.valueOf(num));
        if (str == null) {
            str = "";
        }
        hashMap.put("errorMsg", str);
        b bVar = f63061a;
        String hashMap2 = hashMap.toString();
        l.b(hashMap2, "");
        bVar.b(hashMap2);
    }

    public static final void a(String str, String str2, String str3, String str4) {
        l.d(str, "");
        l.d(str2, "");
        l.d(str4, "");
        HashMap hashMap = new HashMap();
        hashMap.put("event", "start switch account");
        hashMap.put("from", str4);
        hashMap.put("extra", "from " + str + " to " + str2 + " with " + str3);
        b bVar = f63061a;
        String hashMap2 = hashMap.toString();
        l.b(hashMap2, "");
        bVar.b(hashMap2);
    }
}
