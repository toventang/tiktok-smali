package com.ss.android.ugc.aweme.crossplatform.business;

import com.bytedance.covode.number.Covode;
import com.bytedance.ies.web.a.a;
import com.ss.android.ugc.aweme.crossplatform.business.BusinessService;
import org.json.JSONException;
import org.json.JSONObject;

public class PlayableBusiness extends BusinessService.Business {

    /* renamed from: a  reason: collision with root package name */
    public boolean f78644a;

    /* renamed from: b  reason: collision with root package name */
    private a f78645b;

    static {
        Covode.recordClassIndex(48831);
    }

    public PlayableBusiness(e eVar) {
        super(eVar);
    }

    public final void a(a aVar) {
        this.f78645b = aVar;
        a(false, true);
    }

    public final void a(boolean z, boolean z2) {
        if (this.f78617k.f78742b.B == 1 && this.f78645b != null) {
            JSONObject jSONObject = new JSONObject();
            try {
                jSONObject.put("endcard_mute", z);
                jSONObject.put("endcard_show", z2);
                this.f78645b.b("endcard_control_event", jSONObject);
            } catch (JSONException e2) {
                e2.printStackTrace();
            }
        }
    }
}
