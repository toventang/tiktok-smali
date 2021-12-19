package com.bytedance.android.livesdk.browser.jsbridge.newmethods;

import com.bytedance.android.live.base.a;
import com.bytedance.android.live.gift.IGiftService;
import com.bytedance.android.livesdk.gift.model.GiftPage;
import com.bytedance.android.livesdk.gift.model.k;
import com.bytedance.android.livesdk.model.u;
import com.bytedance.covode.number.Covode;
import com.bytedance.ies.web.jsbridge2.ai;
import com.bytedance.ies.web.jsbridge2.e;
import com.bytedance.ies.web.jsbridge2.g;
import h.f.b.l;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import org.json.JSONObject;

public final class ax extends e<JSONObject, k> {
    static {
        Covode.recordClassIndex(8082);
    }

    @Override // com.bytedance.ies.web.jsbridge2.e
    public final void onTerminate() {
    }

    @Override // com.bytedance.ies.web.jsbridge2.c
    public final ai getPermissionGroup() {
        return ai.PRIVATE;
    }

    /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object, com.bytedance.ies.web.jsbridge2.g] */
    @Override // com.bytedance.ies.web.jsbridge2.e
    public final /* synthetic */ void invoke(JSONObject jSONObject, g gVar) {
        int i2;
        T t;
        List<u> list;
        JSONObject jSONObject2 = jSONObject;
        l.d(jSONObject2, "");
        l.d(gVar, "");
        Object obj = jSONObject2.get("pageType");
        if (!(obj instanceof Integer)) {
            obj = null;
        }
        Integer num = (Integer) obj;
        int i3 = 0;
        if (num != null) {
            i2 = num.intValue();
        } else {
            i2 = 0;
        }
        a a2 = com.bytedance.android.live.t.a.a(IGiftService.class);
        l.b(a2, "");
        List<GiftPage> giftPages = ((IGiftService) a2).getGiftPages();
        l.b(giftPages, "");
        Iterator<T> it = giftPages.iterator();
        while (true) {
            if (!it.hasNext()) {
                t = null;
                break;
            }
            t = it.next();
            if (t.pageType == i2) {
                break;
            }
        }
        T t2 = t;
        k kVar = new k();
        if (!(t2 == null || t2.gifts == null)) {
            i3 = 1;
        }
        kVar.f17901b = i3;
        if (t2 == null || t2.gifts == null) {
            list = new ArrayList<>();
        } else {
            list = t2.gifts;
        }
        kVar.f17900a = list;
        finishWithResult(kVar);
    }
}
