package com.bytedance.android.livesdk.userservice;

import com.bytedance.android.live.core.d.c;
import com.bytedance.android.livesdk.ab.d.d;
import com.bytedance.android.livesdkapi.depend.model.b.a;
import com.bytedance.covode.number.Covode;
import f.a.d.f;
import java.util.HashMap;

final /* synthetic */ class k implements f {

    /* renamed from: a  reason: collision with root package name */
    private final c f22094a;

    /* renamed from: b  reason: collision with root package name */
    private final int f22095b;

    /* renamed from: c  reason: collision with root package name */
    private final long f22096c;

    /* renamed from: d  reason: collision with root package name */
    private final long f22097d;

    static {
        Covode.recordClassIndex(13011);
    }

    k(c cVar, int i2, long j2, long j3) {
        this.f22094a = cVar;
        this.f22095b = i2;
        this.f22096c = j2;
        this.f22097d = j3;
    }

    @Override // f.a.d.f
    public final void accept(Object obj) {
        String str;
        c cVar = this.f22094a;
        int i2 = this.f22095b;
        long j2 = this.f22096c;
        long j3 = this.f22097d;
        a aVar = (a) obj;
        cVar.f22059b.onFollowStatusChanged(aVar.f23023e, aVar.f23019a);
        cVar.f22062e.onNext(aVar);
        if (cVar.f22058a != null) {
            long id = cVar.f22058a.getId();
            if (i2 == 1) {
                str = "ttlive_follow";
            } else {
                str = "ttlive_unfollow";
            }
            HashMap hashMap = new HashMap();
            hashMap.put("proponent_id", Long.valueOf(id));
            hashMap.put("adopter_id", Long.valueOf(j2));
            hashMap.put("room_id", Long.valueOf(j3));
            c.a(d.a(str), 0, hashMap);
        }
    }
}
