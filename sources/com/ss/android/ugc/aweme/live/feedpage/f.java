package com.ss.android.ugc.aweme.live.feedpage;

import com.bytedance.common.utility.collection.b;
import com.bytedance.covode.number.Covode;
import com.ss.android.ugc.aweme.profile.model.User;
import java.util.Collection;
import java.util.List;
import java.util.Map;

final /* synthetic */ class f implements f.a.d.f {

    /* renamed from: a  reason: collision with root package name */
    private final e f108397a;

    /* renamed from: b  reason: collision with root package name */
    private final f.a.d.f f108398b;

    /* renamed from: c  reason: collision with root package name */
    private final long f108399c;

    /* renamed from: d  reason: collision with root package name */
    private final List f108400d;

    static {
        Covode.recordClassIndex(69448);
    }

    f(e eVar, f.a.d.f fVar, long j2, List list) {
        this.f108397a = eVar;
        this.f108398b = fVar;
        this.f108399c = j2;
        this.f108400d = list;
    }

    @Override // f.a.d.f
    public final void accept(Object obj) {
        Map<Long, Long> a2;
        long j2;
        e eVar = this.f108397a;
        f.a.d.f fVar = this.f108398b;
        long j3 = this.f108399c;
        List<User> list = this.f108400d;
        j jVar = (j) obj;
        if (!(jVar == null || fVar == null || (a2 = jVar.f108405a.a()) == null)) {
            Long l2 = a2.get(Long.valueOf(j3));
            if (l2 == null) {
                l2 = 0L;
            }
            if (l2.longValue() != 0) {
                eVar.f108382c.put(Long.valueOf(j3), l2);
                eVar.f108383d.put(Long.valueOf(j3), Long.valueOf(System.currentTimeMillis()));
            }
            eVar.f108386g.put(Long.valueOf(j3), l2);
            eVar.f108385f.put(Long.valueOf(j3), Long.valueOf(System.currentTimeMillis()));
            if (!b.a((Collection) list)) {
                for (User user : list) {
                    if (user != null) {
                        try {
                            j2 = Long.parseLong(user.getUid());
                        } catch (Exception e2) {
                            e2.printStackTrace();
                            j2 = 0;
                        }
                        Long l3 = a2.get(Long.valueOf(j2));
                        if (l3 == null) {
                            l3 = 0L;
                        }
                        if (l3.longValue() != 0) {
                            eVar.f108382c.put(Long.valueOf(j2), l3);
                            eVar.f108383d.put(Long.valueOf(j2), Long.valueOf(System.currentTimeMillis()));
                        }
                        eVar.f108386g.put(Long.valueOf(j2), l3);
                        eVar.f108385f.put(Long.valueOf(j2), Long.valueOf(System.currentTimeMillis()));
                    }
                }
            }
            fVar.accept(l2);
        }
    }
}
