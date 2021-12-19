package com.ss.android.ugc.aweme.im.sdk.common.controller.e;

import android.text.TextUtils;
import com.bytedance.covode.number.Covode;
import com.bytedance.ies.im.core.api.b.b;
import com.bytedance.ies.im.core.api.h.b;
import com.bytedance.im.core.a.e;
import com.bytedance.im.core.d.ah;
import com.bytedance.im.core.d.s;
import com.ss.android.ugc.aweme.im.service.model.IMUser;
import h.f.b.l;
import java.util.List;
import java.util.concurrent.ConcurrentHashMap;

public final class j {

    /* renamed from: a  reason: collision with root package name */
    static ConcurrentHashMap<String, String> f102260a = new ConcurrentHashMap<>();

    /* renamed from: b  reason: collision with root package name */
    public static final j f102261b = new j();

    /* renamed from: c  reason: collision with root package name */
    private static s f102262c;

    private j() {
    }

    static {
        Covode.recordClassIndex(65432);
    }

    public static void b() {
        if (f102262c != null) {
            b a2 = com.bytedance.ies.im.core.api.b.a();
            s sVar = f102262c;
            if (sVar == null) {
                l.b();
            }
            a2.b(sVar);
            f102262c = null;
        }
    }

    public static void a() {
        if (f102262c == null) {
            f102262c = a.f102263a;
        }
        b a2 = com.bytedance.ies.im.core.api.b.a();
        s sVar = f102262c;
        if (sVar == null) {
            l.b();
        }
        a2.a(sVar);
    }

    public static String a(String str) {
        String c2 = c(str);
        if (c2 != null && c2.length() != 0) {
            return c2;
        }
        IMUser b2 = g.b(str, null);
        if (b2 != null) {
            return b2.getSecUid();
        }
        return null;
    }

    private static String c(String str) {
        if (TextUtils.isEmpty(str)) {
            return "";
        }
        String str2 = f102260a.get(str);
        if (TextUtils.isEmpty(str2)) {
            return "";
        }
        return str2;
    }

    public final void b(String str) {
        if (!TextUtils.isEmpty(str)) {
            b.b().putSecUidToMap(str, a(g.b(str, null), str));
        }
    }

    public static String a(IMUser iMUser) {
        if (iMUser == null || TextUtils.isEmpty(iMUser.getUid())) {
            return "";
        }
        if (!TextUtils.isEmpty(iMUser.getSecUid())) {
            return iMUser.getSecUid();
        }
        IMUser b2 = g.b(iMUser.getUid(), null);
        if (b2 == null || TextUtils.isEmpty(b2.getSecUid())) {
            return c(iMUser.getUid());
        }
        return b2.getSecUid();
    }

    static final class a implements s {

        /* renamed from: a  reason: collision with root package name */
        public static final a f102263a = new a();

        static {
            Covode.recordClassIndex(65433);
        }

        a() {
        }

        @Override // com.bytedance.im.core.d.s
        public final void a(List<ah> list) {
            l.b(list, "");
            for (T t : list) {
                l.b(t, "");
                if (t.getUid() > 0 && !TextUtils.isEmpty(t.getSecUid()) && t.getConversationType() != e.a.f37582b) {
                    IMUser a2 = g.a(String.valueOf(t.getUid()), t.getSecUid());
                    if (a2 != null) {
                        if (TextUtils.isEmpty(a2.getSecUid())) {
                            a2.setSecUid(t.getSecUid());
                            g.a(a2);
                        }
                        String uid = a2.getUid();
                        l.b(uid, "");
                        String a3 = b.a.a(Long.parseLong(uid));
                        if (!TextUtils.isEmpty(a3)) {
                            l.d(a3, "");
                            List<String> list2 = i.f102257a;
                            if (list2 != null && list2.contains(a3)) {
                                List<String> list3 = i.f102257a;
                                if (list3 == null) {
                                    l.b();
                                }
                                list3.remove(a3);
                            }
                        }
                    } else {
                        ConcurrentHashMap<String, String> concurrentHashMap = j.f102260a;
                        String valueOf = String.valueOf(t.getUid());
                        String secUid = t.getSecUid();
                        l.b(secUid, "");
                        concurrentHashMap.put(valueOf, secUid);
                    }
                }
            }
        }
    }

    private static String a(IMUser iMUser, String str) {
        if (iMUser == null) {
            return c(str);
        }
        return a(iMUser);
    }
}
