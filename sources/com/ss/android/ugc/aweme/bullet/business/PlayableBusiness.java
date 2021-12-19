package com.ss.android.ugc.aweme.bullet.business;

import com.bytedance.covode.number.Covode;
import com.bytedance.ies.bullet.kit.web.b.a;
import com.bytedance.ies.bullet.service.f.a.b;
import com.ss.android.ugc.aweme.bullet.business.BulletBusinessService;
import com.ss.android.ugc.aweme.bullet.module.ad.j;
import h.f.b.l;
import org.json.JSONException;
import org.json.JSONObject;

public final class PlayableBusiness extends BulletBusinessService.Business {

    /* renamed from: a  reason: collision with root package name */
    public boolean f69246a;

    static {
        Covode.recordClassIndex(42691);
    }

    public final void a() {
        a(false, true);
    }

    public final void b() {
        if (!this.f69246a) {
            a(false, true);
        }
    }

    public final void c() {
        if (!this.f69246a) {
            a(true, false);
        }
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public PlayableBusiness(a aVar) {
        super(aVar);
        l.d(aVar, "");
    }

    public final void a(boolean z, boolean z2) {
        Integer num;
        b bVar = this.f69222k.f69252a;
        if ((bVar instanceof j) && (num = (Integer) ((j) bVar).aa.b()) != null && num.intValue() == 1) {
            JSONObject jSONObject = new JSONObject();
            try {
                jSONObject.put(d.f69272b, z);
                jSONObject.put(d.f69273c, z2);
                a aVar = this.f69222k.f69254c;
                if (aVar != null) {
                    aVar.a(d.f69271a, jSONObject);
                }
            } catch (JSONException e2) {
                e2.printStackTrace();
            }
        }
    }
}
