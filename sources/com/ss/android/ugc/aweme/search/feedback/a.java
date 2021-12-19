package com.ss.android.ugc.aweme.search.feedback;

import android.content.Intent;
import androidx.fragment.app.e;
import com.bytedance.covode.number.Covode;
import com.ss.android.ugc.aweme.discover.helper.ag;
import com.ss.android.ugc.aweme.search.i;
import com.ss.android.ugc.aweme.utils.ef;
import h.f.b.l;
import java.util.LinkedHashMap;
import java.util.Map;

public final class a {

    /* renamed from: a  reason: collision with root package name */
    public static Integer f121121a;

    /* renamed from: b  reason: collision with root package name */
    static boolean f121122b;

    /* renamed from: c  reason: collision with root package name */
    public static final a f121123c = new a();

    private a() {
    }

    static {
        Covode.recordClassIndex(78896);
    }

    public static void a(e eVar) {
        ef.a(eVar, new FeedbackHelper$startObserver$1(eVar));
    }

    private static Map<String, String> a(Map<String, String> map) {
        String value;
        if (map == null || !(!map.isEmpty())) {
            return null;
        }
        if (!l.a((Object) map.get("search_type"), (Object) i.HASHTAG.getTabName())) {
            return map;
        }
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        for (Map.Entry<String, String> entry : map.entrySet()) {
            if (l.a((Object) entry.getKey(), (Object) "search_type")) {
                value = ag.a(entry.getValue());
            } else {
                value = entry.getValue();
            }
            linkedHashMap.put(entry.getKey(), value);
        }
        return linkedHashMap;
    }

    private static void a(e eVar, Intent intent) {
        com.ss.android.ugc.tiktok.security.a.a.a(intent, eVar);
        eVar.startActivity(intent);
    }

    /* JADX WARNING: Code restructure failed: missing block: B:57:0x0127, code lost:
        if (r5 != null) goto L_0x00d4;
     */
    /* JADX WARNING: Removed duplicated region for block: B:48:0x00ee  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static boolean a(android.content.Context r9, java.lang.String r10, boolean r11, java.util.Map<java.lang.String, java.lang.String> r12, java.lang.String r13) {
        /*
        // Method dump skipped, instructions count: 325
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ss.android.ugc.aweme.search.feedback.a.a(android.content.Context, java.lang.String, boolean, java.util.Map, java.lang.String):boolean");
    }
}
