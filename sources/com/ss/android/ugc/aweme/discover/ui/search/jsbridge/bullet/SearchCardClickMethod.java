package com.ss.android.ugc.aweme.discover.ui.search.jsbridge.bullet;

import androidx.lifecycle.i;
import androidx.lifecycle.m;
import com.bytedance.covode.number.Covode;
import com.bytedance.ies.bullet.c.c.a.k;
import com.bytedance.ies.bullet.c.e.a.b;
import com.bytedance.ies.bullet.c.e.a.c;
import com.bytedance.ies.bullet.ui.common.BulletContainerView;
import com.ss.android.ugc.aweme.au;
import com.ss.android.ugc.aweme.bullet.bridge.BaseBridgeMethod;
import com.ss.android.ugc.aweme.discover.mob.d;
import com.ss.android.ugc.aweme.discover.mob.j;
import h.f.b.l;
import java.util.Iterator;
import java.util.LinkedHashMap;
import org.json.JSONObject;

public final class SearchCardClickMethod extends BaseBridgeMethod implements au {

    /* renamed from: b  reason: collision with root package name */
    public static final a f82704b = new a((byte) 0);

    /* renamed from: c  reason: collision with root package name */
    private final String f82705c = "click_search_card";

    /* renamed from: d  reason: collision with root package name */
    private k.a f82706d = k.a.PRIVATE;

    /* renamed from: e  reason: collision with root package name */
    private String f82707e = "";

    static {
        Covode.recordClassIndex(51513);
    }

    @Override // com.ss.android.ugc.aweme.bullet.bridge.BaseBridgeMethod, androidx.lifecycle.k
    public final void onStateChanged(m mVar, i.a aVar) {
        super.onStateChanged(mVar, aVar);
    }

    public static final class a {
        static {
            Covode.recordClassIndex(51514);
        }

        private a() {
        }

        public /* synthetic */ a(byte b2) {
            this();
        }
    }

    @Override // com.bytedance.ies.bullet.c.c.a.q, com.bytedance.ies.bullet.c.c.a.e
    public final k.a b() {
        return this.f82706d;
    }

    @Override // com.bytedance.ies.bullet.c.c.a.q
    public final String d() {
        return this.f82705c;
    }

    @Override // com.bytedance.ies.bullet.c.c.a.e
    public final void a(k.a aVar) {
        l.d(aVar, "");
        this.f82706d = aVar;
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public SearchCardClickMethod(b bVar) {
        super(bVar);
        l.d(bVar, "");
    }

    @Override // com.ss.android.ugc.aweme.bullet.bridge.BaseBridgeMethod
    public final void a(JSONObject jSONObject, BaseBridgeMethod.a aVar) {
        BulletContainerView bulletContainerView;
        Iterator<String> keys;
        l.d(jSONObject, "");
        l.d(aVar, "");
        if (jSONObject.has("card_params")) {
            this.f82707e = jSONObject.optString("react_id");
            try {
                JSONObject optJSONObject = jSONObject.optJSONObject("card_params");
                LinkedHashMap linkedHashMap = new LinkedHashMap();
                if (!(optJSONObject == null || (keys = optJSONObject.keys()) == null)) {
                    while (keys.hasNext()) {
                        String next = keys.next();
                        l.b(next, "");
                        String string = optJSONObject.getString(next);
                        if (string == null) {
                            string = "";
                        }
                        linkedHashMap.put(next, string);
                    }
                }
                c b2 = this.f32005a.b(BulletContainerView.class);
                if (!(b2 == null || (bulletContainerView = (BulletContainerView) b2.b()) == null)) {
                    d.a(bulletContainerView, (String) linkedHashMap.get("search_result_id"), j.a.a(bulletContainerView).f121278m, linkedHashMap);
                }
            } catch (Exception e2) {
                aVar.a(0, e2.getMessage());
            }
        }
        JSONObject jSONObject2 = new JSONObject();
        jSONObject2.put("code", 1);
        aVar.a(jSONObject2);
    }
}
