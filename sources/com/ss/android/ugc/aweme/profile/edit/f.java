package com.ss.android.ugc.aweme.profile.edit;

import android.net.Uri;
import android.text.TextUtils;
import com.bytedance.covode.number.Covode;
import com.ss.android.ugc.aweme.utils.ai;
import java.util.HashMap;
import org.json.JSONObject;

final /* synthetic */ class f implements Runnable {

    /* renamed from: a  reason: collision with root package name */
    private final InstagramPresenter f116105a;

    /* renamed from: b  reason: collision with root package name */
    private final String f116106b;

    static {
        Covode.recordClassIndex(74900);
    }

    f(InstagramPresenter instagramPresenter, String str) {
        this.f116105a = instagramPresenter;
        this.f116106b = str;
    }

    public final void run() {
        String str;
        InstagramPresenter instagramPresenter = this.f116105a;
        String str2 = this.f116106b;
        instagramPresenter.f116073g = true;
        try {
            HashMap hashMap = new HashMap();
            hashMap.put("code", Uri.encode(str2));
            hashMap.put("new_flow", "true");
            String str3 = instagramPresenter.f116072f.doPost(InstagramPresenter.f116066a, hashMap).get();
            if (!TextUtils.isEmpty(str3)) {
                String string = new JSONObject(str3).getString("status_code");
                if (TextUtils.equals(string, "0")) {
                    instagramPresenter.f116071e.queryUser(instagramPresenter.f116070d);
                    return;
                }
                str = "Failure response, status: ".concat(String.valueOf(string));
            } else {
                str = "Empty response";
            }
        } catch (Exception e2) {
            str = e2.getMessage();
        }
        instagramPresenter.a(str, "send_token_to_sever");
        ai.b(new e(instagramPresenter), "BoltsUtils");
    }
}
