package com.ss.android.ugc.aweme.player.sdk.a;

import android.text.TextUtils;
import com.bytedance.covode.number.Covode;
import com.ss.android.ugc.aweme.player.sdk.b.e;
import com.ss.ttvideoengine.j.a;
import com.ss.ttvideoengine.j.b;
import com.ss.ttvideoengine.j.e;
import java.util.Iterator;
import java.util.Map;

public final class o {
    static {
        Covode.recordClassIndex(74051);
    }

    /* JADX WARNING: Code restructure failed: missing block: B:26:0x00a3, code lost:
        if (r6.f115353f.get(0).endsWith(r1) != false) goto L_0x002e;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private static com.ss.ttvideoengine.j.a a(com.ss.android.ugc.aweme.player.sdk.b.e.a r6) {
        /*
        // Method dump skipped, instructions count: 169
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ss.android.ugc.aweme.player.sdk.a.o.a(com.ss.android.ugc.aweme.player.sdk.b.e$a):com.ss.ttvideoengine.j.a");
    }

    public static e a(com.ss.android.ugc.aweme.player.sdk.b.e eVar) {
        a a2;
        if (eVar == null) {
            return null;
        }
        b.a aVar = new b.a();
        aVar.f152874a = eVar.f115335a;
        aVar.f152875b = (long) (((int) eVar.f115338d) / 1000);
        if (eVar.f115342h == null || eVar.f115342h.size() == 0) {
            if (!(eVar.f115343i == null || (a2 = a(eVar.f115343i)) == null)) {
                aVar.a(a2);
            }
            return aVar.a();
        }
        for (e.a aVar2 : eVar.f115342h) {
            a a3 = a(aVar2);
            if (a3 != null) {
                aVar.a(a3);
            }
        }
        return aVar.a();
    }

    public static String a(Map<String, Object> map, String str) {
        if (map == null || !map.containsKey(str)) {
            return null;
        }
        Object obj = map.get(str);
        if (obj instanceof String) {
            return (String) obj;
        }
        return null;
    }

    public static com.ss.android.ugc.aweme.player.sdk.b.e a(Map<String, String> map, com.ss.android.ugc.aweme.player.sdk.b.e eVar) {
        if (eVar != null && eVar.f115342h != null && map != null) {
            Iterator<e.a> it = eVar.f115341g.iterator();
            while (true) {
                if (!it.hasNext()) {
                    break;
                }
                e.a next = it.next();
                if (TextUtils.equals(String.valueOf(next.f115348a), map.get("video_bitrarte"))) {
                    eVar.f115343i = next;
                    String str = map.get("speed");
                    if (!TextUtils.isEmpty(str)) {
                        try {
                            eVar.f115343i.o = Float.parseFloat(str);
                        } catch (Throwable unused) {
                        }
                    }
                }
            }
        }
        return eVar;
    }
}
