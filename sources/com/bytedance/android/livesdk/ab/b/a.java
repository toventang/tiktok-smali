package com.bytedance.android.livesdk.ab.b;

import android.text.TextUtils;
import com.bytedance.android.livesdk.ab.c.e;
import com.bytedance.covode.number.Covode;
import com.kakao.usermgmt.StringSet;
import java.util.Map;

public final class a implements b<e> {
    static {
        Covode.recordClassIndex(7476);
    }

    /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.util.Map, java.lang.Object] */
    @Override // com.bytedance.android.livesdk.ab.b.b
    public final /* synthetic */ void a(Map map, e eVar) {
        e eVar2 = eVar;
        if (eVar2 != null) {
            if (!TextUtils.isEmpty(eVar2.f13502a)) {
                map.put("request_page", eVar2.f13502a);
            }
            if (eVar2.f13503b > 0) {
                map.put("to_user_id", String.valueOf(eVar2.f13503b));
            }
            if (!TextUtils.isEmpty(eVar2.f13504c)) {
                map.put(StringSet.type, eVar2.f13504c);
            }
        }
    }
}
