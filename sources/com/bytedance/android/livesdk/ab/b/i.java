package com.bytedance.android.livesdk.ab.b;

import com.bytedance.android.livesdk.ab.c.k;
import com.bytedance.android.livesdk.ab.c.o;
import com.bytedance.android.livesdk.gift.model.Prop;
import com.bytedance.android.livesdk.model.u;
import com.bytedance.covode.number.Covode;
import java.util.Map;
import org.json.JSONObject;

public final class i implements b<o> {
    static {
        Covode.recordClassIndex(7487);
    }

    /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.util.Map, java.lang.Object] */
    @Override // com.bytedance.android.livesdk.ab.b.b
    public final /* synthetic */ void a(Map map, o oVar) {
        String str;
        String str2;
        String str3;
        String str4;
        long j2;
        o oVar2 = oVar;
        if (oVar2 != null) {
            u uVar = oVar2.f13545c;
            Prop prop = oVar2.f13546d;
            if (k.f13539b == oVar2.f13547e) {
                str = "guest_";
            } else {
                str = "";
            }
            if (uVar != null && uVar.a()) {
                str2 = "animation_gift";
            } else if (oVar2.f13549g == 1) {
                str2 = "single_gift";
            } else if (oVar2.f13550h > 1) {
                str2 = "bunching_gift";
            } else {
                str2 = "running_gift";
            }
            if (!map.containsKey("request_page")) {
                map.put("request_page", "normal");
            }
            if (oVar2.f13544b > 0) {
                str3 = "prop_type";
            } else {
                str3 = "gift_type";
            }
            if (oVar2.f13544b > 0) {
                str4 = "prop_id";
            } else {
                str4 = "gift_id";
            }
            map.put(str3, str + str2);
            if (oVar2.f13544b > 0) {
                j2 = oVar2.f13544b;
            } else {
                j2 = oVar2.f13543a;
            }
            map.put(str4, String.valueOf(j2));
            if (oVar2.f13544b <= 0) {
                map.put("gift_cnt", String.valueOf(oVar2.f13549g));
            } else {
                map.put("prop_cnt", String.valueOf(oVar2.f13549g));
            }
            map.put("group_cnt", String.valueOf(oVar2.f13550h));
            map.put("combo_cnt", String.valueOf(oVar2.f13548f));
            if (k.f13539b == oVar2.f13547e) {
                map.put("guest_id", String.valueOf(oVar2.f13552j));
            }
            if (oVar2.f13544b <= 0 && uVar != null) {
                map.put("money", String.valueOf(oVar2.f13549g * uVar.f19763f));
            } else if (!(oVar2.f13544b <= 0 || prop == null || uVar == null)) {
                map.put("income", String.valueOf(oVar2.f13549g * uVar.f19763f));
                map.put("money", String.valueOf(oVar2.f13549g * uVar.f19763f));
            }
            try {
                JSONObject jSONObject = new JSONObject();
                if (oVar2.f13544b <= 0) {
                    jSONObject.put(String.valueOf(oVar2.f13543a), String.valueOf(oVar2.f13549g));
                    map.put("gift_info", jSONObject.toString());
                    return;
                }
                jSONObject.put(String.valueOf(oVar2.f13544b), String.valueOf(oVar2.f13549g));
                map.put("prop_info", jSONObject.toString());
            } catch (Exception e2) {
                e2.printStackTrace();
            }
        }
    }
}
