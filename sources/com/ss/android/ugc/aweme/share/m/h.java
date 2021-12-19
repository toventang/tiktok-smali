package com.ss.android.ugc.aweme.share.m;

import com.bytedance.covode.number.Covode;
import com.ss.android.ugc.aweme.sharer.b;
import h.a.ag;
import h.f.b.l;
import h.f.b.m;
import h.i;
import h.v;
import java.util.Map;

public final class h {

    /* renamed from: a  reason: collision with root package name */
    public static final h f124087a = new h();

    /* renamed from: b  reason: collision with root package name */
    private static final h.h f124088b = i.a((h.f.a.a) a.f124089a);

    private static Map<String, Integer> a() {
        return (Map) f124088b.getValue();
    }

    private h() {
    }

    static {
        Covode.recordClassIndex(81493);
    }

    static final class a extends m implements h.f.a.a<Map<String, ? extends Integer>> {

        /* renamed from: a  reason: collision with root package name */
        public static final a f124089a = new a();

        static {
            Covode.recordClassIndex(81494);
        }

        a() {
            super(0);
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        @Override // h.f.a.a
        public final /* synthetic */ Map<String, ? extends Integer> invoke() {
            return ag.a(v.a("user", 1), v.a("aweme", 2), v.a("challenge", 3), v.a("music", 4), v.a("sticker", 5), v.a("invite_friends", 6), v.a("live", 7), v.a("search", 8), v.a("qna", 9), v.a("group", 10));
        }
    }

    public final String a(b bVar, String str, String str2) {
        l.d(bVar, "");
        l.d(str2, "");
        if (!a(bVar, str, 0)) {
            return "";
        }
        String a2 = bVar.a();
        if (a2.hashCode() != -916346253 || !a2.equals("twitter")) {
            return str2;
        }
        String a3 = b.a(str2);
        l.b(a3, "");
        return a3;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:27:0x0070, code lost:
        if (r3 != null) goto L_0x0078;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static boolean a(com.ss.android.ugc.aweme.sharer.b r9, java.lang.String r10, int r11) {
        /*
        // Method dump skipped, instructions count: 148
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ss.android.ugc.aweme.share.m.h.a(com.ss.android.ugc.aweme.sharer.b, java.lang.String, int):boolean");
    }
}
