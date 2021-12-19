package com.bytedance.common.wschannel.client;

import android.content.Intent;
import android.text.TextUtils;
import com.bytedance.common.wschannel.WsConstants;
import com.bytedance.common.wschannel.client.c;
import com.bytedance.common.wschannel.model.a;
import com.bytedance.covode.number.Covode;
import org.json.JSONObject;

/* access modifiers changed from: package-private */
public final class g extends b {
    static {
        Covode.recordClassIndex(16020);
    }

    public g(c.a aVar) {
        super(aVar);
    }

    private static String a(Intent intent, String str) {
        try {
            return intent.getStringExtra(str);
        } catch (Exception unused) {
            return null;
        }
    }

    @Override // com.bytedance.common.wschannel.client.d
    public final void a(Intent intent, a aVar) {
        try {
            JSONObject jSONObject = new JSONObject(a(intent, "link_progress"));
            String str = (String) jSONObject.remove("link_progress");
            if (!TextUtils.isEmpty(str) && WsConstants.getLinkProgressChangeListener() != null) {
                WsConstants.getLinkProgressChangeListener().a(str, jSONObject);
            }
        } catch (Exception unused) {
        }
    }
}
