package com.bytedance.android.livesdk.browser.jsbridge.d;

import com.bytedance.android.live.liveinteract.api.a.b;
import com.bytedance.android.live.liveinteract.api.b.b;
import com.bytedance.android.live.liveinteract.api.b.c;
import com.bytedance.android.live.liveinteract.api.m;
import com.bytedance.covode.number.Covode;
import com.bytedance.ies.web.jsbridge2.e;
import com.bytedance.ies.web.jsbridge2.g;
import f.a.d.f;
import java.util.ArrayList;
import java.util.List;
import org.json.JSONArray;
import org.json.JSONObject;

public final class a extends e<JSONObject, Object> {

    /* renamed from: a  reason: collision with root package name */
    private f.a.b.a f14458a;

    static {
        Covode.recordClassIndex(8013);
    }

    @Override // com.bytedance.ies.web.jsbridge2.e
    public final void onTerminate() {
        this.f14458a.dispose();
    }

    public a() {
        f.a.b.a aVar = new f.a.b.a();
        this.f14458a = aVar;
        aVar.a(com.bytedance.android.livesdk.an.a.a().a(b.class).d(new f<b>() {
            /* class com.bytedance.android.livesdk.browser.jsbridge.d.a.AnonymousClass1 */

            static {
                Covode.recordClassIndex(8014);
            }

            /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
            @Override // f.a.d.f
            public final /* synthetic */ void accept(b bVar) {
                b bVar2 = bVar;
                com.bytedance.android.live.core.c.a.a(3, "InviteCohostMethod", "receive CohostInviteResultEvent success = " + bVar2.f9965a + " code = " + bVar2.f9966b);
                JSONObject jSONObject = new JSONObject();
                jSONObject.put("errorCode", bVar2.f9966b);
                jSONObject.put("errorMsg", bVar2.f9967c);
                a aVar = a.this;
                if (bVar2.f9965a) {
                    jSONObject = null;
                }
                aVar.finishWithResult(jSONObject);
            }
        }));
    }

    /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object, com.bytedance.ies.web.jsbridge2.g] */
    @Override // com.bytedance.ies.web.jsbridge2.e
    public final /* synthetic */ void invoke(JSONObject jSONObject, g gVar) {
        JSONObject jSONObject2 = jSONObject;
        com.bytedance.android.live.core.c.a.a(3, "InviteCohostMethod", "invoke msg = ".concat(String.valueOf(jSONObject2)));
        String optString = jSONObject2.optString("receiveUid");
        String optString2 = jSONObject2.optString("receiveSecUid");
        String optString3 = jSONObject2.optString("invitedRoomID");
        String optString4 = jSONObject2.optString("inviteeName");
        int optInt = jSONObject2.optInt("inviteType");
        JSONArray optJSONArray = jSONObject2.optJSONArray("avatarUrlList");
        ArrayList arrayList = new ArrayList();
        if (optJSONArray != null && optJSONArray.length() > 0) {
            for (int i2 = 0; i2 < optJSONArray.length(); i2++) {
                arrayList.add(optJSONArray.getString(i2));
            }
        }
        b.a.a().p = m.ACTIVITY;
        b.a.a().p.setType(optInt);
        b.a.a().V = "rank";
        com.bytedance.android.livesdk.an.a.a().a(new com.bytedance.android.live.liveinteract.api.b.a(new c(optString, optString2, optString3, optString4, m.ACTIVITY, (List<String>) arrayList, (char) 0)));
    }
}
