package com.bytedance.android.livesdk.userservice;

import com.bytedance.android.live.a.a.a;
import com.bytedance.android.live.core.d.c;
import com.bytedance.android.livesdk.ab.d.d;
import com.bytedance.covode.number.Covode;
import f.a.d.f;
import java.util.HashMap;

final /* synthetic */ class l implements f {

    /* renamed from: a  reason: collision with root package name */
    private final c f22098a;

    /* renamed from: b  reason: collision with root package name */
    private final int f22099b;

    /* renamed from: c  reason: collision with root package name */
    private final long f22100c;

    /* renamed from: d  reason: collision with root package name */
    private final long f22101d;

    static {
        Covode.recordClassIndex(13012);
    }

    l(c cVar, int i2, long j2, long j3) {
        this.f22098a = cVar;
        this.f22099b = i2;
        this.f22100c = j2;
        this.f22101d = j3;
    }

    @Override // f.a.d.f
    public final void accept(Object obj) {
        String str;
        String str2;
        c cVar = this.f22098a;
        int i2 = this.f22099b;
        long j2 = this.f22100c;
        long j3 = this.f22101d;
        Throwable th = (Throwable) obj;
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
            if (th != null) {
                str2 = th.getMessage();
                if (th instanceof a) {
                    hashMap.put("error_code", Integer.valueOf(((a) th).getErrorCode()));
                }
            } else {
                str2 = "";
            }
            hashMap.put("error_msg", str2);
            c.a(d.a(str), 1, hashMap);
            c.a(d.b(str), 1, hashMap);
        }
    }
}
