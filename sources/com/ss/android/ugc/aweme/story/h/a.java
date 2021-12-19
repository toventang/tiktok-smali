package com.ss.android.ugc.aweme.story.h;

import com.bytedance.covode.number.Covode;
import com.ss.android.ugc.aweme.editSticker.text.bean.u;
import com.ss.android.ugc.aweme.port.in.g;
import com.ss.android.ugc.aweme.sticker.data.CreateAnchorInfo;
import com.ss.android.ugc.tools.utils.q;
import h.f.b.l;
import org.json.JSONObject;

public final class a {
    static {
        Covode.recordClassIndex(90138);
    }

    public static final CreateAnchorInfo a(com.ss.android.ugc.aweme.common.a aVar) {
        u uVar;
        String str = "";
        l.d(aVar, str);
        try {
            uVar = (u) g.a().G().a(aVar.getAnchorContent(), u.class);
        } catch (Exception unused) {
            uVar = new u(str, str);
        }
        try {
            JSONObject jSONObject = new JSONObject();
            jSONObject.put("add_from", 1);
            String jSONObject2 = jSONObject.toString();
            l.b(jSONObject2, str);
            str = jSONObject2;
        } catch (Exception e2) {
            q.a(e2);
        }
        return new CreateAnchorInfo(aVar.getBusinessType(), uVar.f88455a, "", uVar.f88456b, str, "https://p16.tiktokcdn.com/obj/tiktok-obj/wiki_anchor_new.png", null, null, null, null, null, null, 4032, null);
    }
}
