package com.bytedance.android.livesdk.ab.b;

import com.bytedance.covode.number.Covode;
import h.a.ag;
import h.a.n;
import h.v;
import java.util.Collections;
import java.util.List;
import java.util.Map;

public final class h {

    /* renamed from: a  reason: collision with root package name */
    public static final List<String> f13450a = n.a("livesdk_send_gift");

    /* renamed from: b  reason: collision with root package name */
    public static final List<String> f13451b = n.a("livesdk_recharge_success");

    /* renamed from: c  reason: collision with root package name */
    public static final a f13452c = new a((byte) 0);

    /* renamed from: d  reason: collision with root package name */
    private static Map<String, List<String>> f13453d = ag.b(v.a("livesdk_send_gift", n.b("money", "gift_info", "gift_cnt")), v.a("livesdk_recharge_success", Collections.singletonList("money")));

    public static final class a {
        static {
            Covode.recordClassIndex(7486);
        }

        private a() {
        }

        public /* synthetic */ a(byte b2) {
            this();
        }
    }

    static {
        Covode.recordClassIndex(7485);
    }

    public static void a(Map<String, String> map, String str) {
        List<String> list = f13453d.get(str);
        if (!(list == null || list.isEmpty())) {
            for (String str2 : list) {
                map.remove(str2);
            }
        }
    }
}
