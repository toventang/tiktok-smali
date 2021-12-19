package com.bytedance.android.livesdk.x;

import com.bytedance.android.livesdk.ab.i;
import com.bytedance.android.livesdk.ac.b.a;
import com.bytedance.covode.number.Covode;
import f.a.v;
import f.a.w;
import java.util.HashMap;
import java.util.List;

/* access modifiers changed from: package-private */
public final /* synthetic */ class h implements w {

    /* renamed from: a  reason: collision with root package name */
    private final List f22909a;

    static {
        Covode.recordClassIndex(13538);
    }

    h(List list) {
        this.f22909a = list;
    }

    @Override // f.a.w
    public final void subscribe(v vVar) {
        for (a aVar : this.f22909a) {
            if (aVar != null) {
                HashMap hashMap = new HashMap();
                hashMap.put("msg_id", Long.valueOf(aVar.getMessageId()));
                hashMap.put("msg_type", aVar.getClass().getSimpleName());
                hashMap.put("msg_time", Long.valueOf(aVar.M));
                i.b().a("ttlive_msgtype", hashMap);
            }
        }
    }
}
