package com.ss.android.ugc.aweme.live.feedpage;

import com.bytedance.covode.number.Covode;
import com.ss.android.ugc.aweme.live.feedpage.e;
import f.a.d.f;
import java.util.Map;
import java.util.Set;

/* access modifiers changed from: package-private */
public final /* synthetic */ class h implements f {

    /* renamed from: a  reason: collision with root package name */
    private final e.a f108402a;

    /* renamed from: b  reason: collision with root package name */
    private final long f108403b;

    static {
        Covode.recordClassIndex(69450);
    }

    h(e.a aVar, long j2) {
        this.f108402a = aVar;
        this.f108403b = j2;
    }

    @Override // f.a.d.f
    public final void accept(Object obj) {
        e.a aVar = this.f108402a;
        long j2 = this.f108403b;
        j jVar = (j) obj;
        if (!jVar.a().isEmpty()) {
            Set<Long> keySet = jVar.a().keySet();
            Map<Long, Long> a2 = jVar.a();
            for (Long l2 : keySet) {
                e.this.f108383d.put(l2, Long.valueOf(j2));
                Long l3 = a2.get(l2);
                if (l3 == null) {
                    l3 = 0L;
                }
                if (!e.f108380b.equals(l3)) {
                    e.this.f108382c.put(l2, l3);
                } else {
                    e.this.f108382c.remove(l2);
                }
            }
        } else {
            e.this.f108382c.put(aVar.f108391b, 0L);
        }
        aVar.a();
    }
}
