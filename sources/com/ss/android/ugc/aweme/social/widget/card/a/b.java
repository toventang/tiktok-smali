package com.ss.android.ugc.aweme.social.widget.card.a;

import com.bytedance.common.utility.collection.e;
import com.bytedance.covode.number.Covode;
import com.bytedance.keva.Keva;
import com.ss.android.ugc.aweme.IAccountUserService;
import h.f.b.l;
import java.util.LinkedHashMap;
import java.util.LinkedHashSet;
import java.util.Map;
import java.util.Set;

public class b {

    /* renamed from: e  reason: collision with root package name */
    public static final b f133725e = new b();

    /* renamed from: f  reason: collision with root package name */
    public static final a f133726f = new a((byte) 0);

    /* renamed from: a  reason: collision with root package name */
    public final c f133727a = ((c) d.f133736b.getValue());

    /* renamed from: b  reason: collision with root package name */
    public String f133728b = "";

    /* renamed from: c  reason: collision with root package name */
    public final Set<e<Object>> f133729c = new LinkedHashSet();

    /* renamed from: d  reason: collision with root package name */
    public final Map<f, Boolean> f133730d = new LinkedHashMap();

    public static final class a {
        static {
            Covode.recordClassIndex(87487);
        }

        private a() {
        }

        public /* synthetic */ a(byte b2) {
            this();
        }

        public static b a(int i2) {
            b bVar;
            if (i2 == 5 || i2 == 7) {
                bVar = j.f133764g;
            } else {
                bVar = b.f133725e;
            }
            bVar.b();
            return bVar;
        }
    }

    static {
        Covode.recordClassIndex(87486);
    }

    public final Keva a() {
        Keva repo = Keva.getRepo("social_permission_card_freq_" + this.f133728b);
        l.b(repo, "");
        return repo;
    }

    public final void b() {
        boolean z;
        IAccountUserService g2 = com.ss.android.ugc.aweme.account.b.g();
        String str = "";
        l.b(g2, str);
        String curUserId = g2.getCurUserId();
        if (curUserId != null) {
            str = curUserId;
        }
        if (!l.a((Object) str, (Object) this.f133728b)) {
            this.f133728b = str;
            f[] values = f.values();
            for (f fVar : values) {
                Map<f, Boolean> map = this.f133730d;
                if (com.ss.android.ugc.aweme.social.widget.card.e.b(fVar) || !c(fVar)) {
                    z = false;
                } else {
                    z = true;
                }
                map.put(fVar, Boolean.valueOf(z));
            }
            new StringBuilder().append(getClass().getSimpleName()).append(" current uid: ").append(str).append(',').append(" state: ").append(this.f133730d).append(". settings: ").append(this.f133727a);
        }
    }

    public void a(f fVar) {
        l.d(fVar, "");
        b();
        Keva a2 = a();
        int i2 = 0;
        int i3 = a2.getInt(a("key_exp_count_", fVar), 0) + 1;
        if (i3 >= this.f133727a.f133731a) {
            a2.storeLong(a("key_auto_hide_ts_", fVar), System.currentTimeMillis());
        } else {
            i2 = i3;
        }
        a2.storeInt(a("key_exp_count_", fVar), i2);
    }

    public final void b(f fVar) {
        l.d(fVar, "");
        b();
        Keva a2 = a();
        int i2 = a2.getInt(a("key_delete_count_", fVar), 0) + 1;
        a2.storeInt(a("key_delete_count_", fVar), i2);
        a2.storeInt(a("key_exp_count_", fVar), 0);
        a2.storeLong(a("key_auto_hide_ts_", fVar), -1);
        if (i2 >= this.f133727a.f133734d) {
            a2.storeLong(a("key_delete_hide_ts_", fVar), -1);
        } else {
            a2.storeLong(a("key_delete_hide_ts_", fVar), System.currentTimeMillis());
        }
        this.f133730d.put(fVar, false);
    }

    public final boolean c(f fVar) {
        boolean z;
        if (a().getInt(a("key_delete_count_", fVar), 0) >= this.f133727a.f133734d) {
            return false;
        }
        long currentTimeMillis = System.currentTimeMillis();
        Long valueOf = Long.valueOf(a().getLong(a("key_delete_hide_ts_", fVar), -1));
        long longValue = valueOf.longValue();
        if (longValue == -1 || a(currentTimeMillis, longValue) >= ((long) this.f133727a.f133733c)) {
            z = false;
        } else {
            z = true;
        }
        if (!z || valueOf == null) {
            Long valueOf2 = Long.valueOf(a().getLong(a("key_auto_hide_ts_", fVar), -1));
            long longValue2 = valueOf2.longValue();
            if (longValue2 == -1 || a(currentTimeMillis, longValue2) >= ((long) this.f133727a.f133732b) || valueOf2 == null) {
                return true;
            }
            a(currentTimeMillis, valueOf2.longValue());
            return false;
        }
        a(currentTimeMillis, valueOf.longValue());
        return false;
    }

    private static long a(long j2, long j3) {
        return Math.abs((j2 - j3) / 86400000);
    }

    public static String a(String str, f fVar) {
        return str + fVar.name();
    }
}
