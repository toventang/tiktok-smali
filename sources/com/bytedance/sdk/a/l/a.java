package com.bytedance.sdk.a.l;

import android.text.TextUtils;
import com.bytedance.covode.number.Covode;
import com.bytedance.sdk.a.l.d.c;
import java.util.Date;
import java.util.Map;

public final class a {

    /* renamed from: a  reason: collision with root package name */
    private static Integer f43398a;

    /* renamed from: b  reason: collision with root package name */
    private static String f43399b;

    static {
        Covode.recordClassIndex(26590);
    }

    public static c a(com.bytedance.sdk.a.n.a aVar) {
        c cVar;
        try {
            if (f43398a != null) {
                c.a aVar2 = new c.a();
                aVar2.f43428a = new Date().getTime();
                if (!(aVar == null || aVar.f43475m == null)) {
                    aVar2.f43431d = aVar.f43463a;
                    aVar2.f43432e = aVar.f43465c;
                    String optString = aVar.f43475m.optString("screen_name");
                    String optString2 = aVar.f43475m.optString("avatar_url");
                    aVar2.f43434g = optString;
                    aVar2.f43433f = optString2;
                    if (f43398a.intValue() == 6) {
                        Map<String, com.ss.android.account.b.a> map = aVar.f43464b;
                        if (map != null) {
                            for (String str : map.keySet()) {
                                if (str.contains(f43399b)) {
                                    f43399b = str;
                                    com.ss.android.account.b.a aVar3 = map.get(str);
                                    if (aVar3 != null) {
                                        String str2 = aVar3.f58181d;
                                        aVar2.f43435h = aVar3.f58182e;
                                        aVar2.f43436i = str2;
                                    }
                                }
                            }
                        }
                    } else if (f43398a.intValue() == 1) {
                        f43399b = aVar.f43469g;
                        aVar2.a(Integer.valueOf(aVar.f43466d));
                    } else if (f43398a.intValue() == 2 || f43398a.intValue() == 3) {
                        int i2 = aVar.f43466d;
                        if (!TextUtils.isEmpty(f43399b) && f43399b.startsWith("+")) {
                            f43399b = f43399b.replace("+".concat(String.valueOf(i2)), "");
                        }
                        aVar2.a(Integer.valueOf(i2));
                    }
                }
                aVar2.f43429b = f43398a.intValue();
                aVar2.f43430c = f43399b;
                cVar = new c(aVar2.f43428a, aVar2.f43429b, aVar2.f43430c, aVar2.f43431d, aVar2.f43432e, aVar2.f43433f, aVar2.f43434g, aVar2.f43435h, aVar2.f43436i, aVar2.f43437j);
                f43398a = null;
                f43399b = null;
                return cVar;
            }
        } catch (Exception e2) {
            e2.printStackTrace();
        }
        cVar = null;
        f43398a = null;
        f43399b = null;
        return cVar;
    }

    /* renamed from: com.bytedance.sdk.a.l.a$a  reason: collision with other inner class name */
    static class C1048a {

        /* renamed from: a  reason: collision with root package name */
        public int f43409a;

        /* renamed from: b  reason: collision with root package name */
        public String f43410b;

        static {
            Covode.recordClassIndex(26593);
        }

        C1048a(int i2, String str) {
            this.f43409a = i2;
            this.f43410b = str;
        }
    }

    public static void a(Integer num, String str) {
        f43398a = num;
        f43399b = str;
    }
}
