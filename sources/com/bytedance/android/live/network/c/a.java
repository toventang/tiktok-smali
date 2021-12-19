package com.bytedance.android.live.network.c;

import com.bytedance.android.live.core.e.a.b;
import com.bytedance.android.live.core.f.y;
import com.bytedance.android.live.e;
import com.bytedance.android.live.network.response.RequestError;
import com.bytedance.android.livesdk.model.Extra;
import com.bytedance.covode.number.Covode;
import com.zhiliaoapp.musically.R;

public final class a {
    static {
        Covode.recordClassIndex(6626);
    }

    public static void a(int i2, b bVar, String str) {
        throw new com.bytedance.android.live.network.model.b(i2, bVar.f9006c, str).setPrompt(bVar.f9005b);
    }

    public static void a(int i2, RequestError requestError, Extra extra, String str) {
        a(i2, requestError, e.a.f9628b.b(extra), str);
    }

    public static void a(int i2, RequestError requestError, String str, String str2) {
        if (requestError == null) {
            requestError = new RequestError();
            requestError.prompts = y.a((int) R.string.gwg);
        }
        throw new com.bytedance.android.live.network.model.b(i2, requestError.url, str2).setErrorMsg(requestError.message).setPrompt(requestError.prompts).setAlert(requestError.alert).setExtra(str);
    }
}
