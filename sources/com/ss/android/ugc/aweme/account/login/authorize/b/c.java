package com.ss.android.ugc.aweme.account.login.authorize.b;

import android.text.TextUtils;
import com.bytedance.covode.number.Covode;
import com.bytedance.sdk.a.a.a.a;
import com.bytedance.sdk.a.a.a.e;
import java.lang.ref.WeakReference;
import org.json.JSONObject;

public final class c extends a<e> {

    /* renamed from: c  reason: collision with root package name */
    private final WeakReference<a> f63351c;

    static {
        Covode.recordClassIndex(39044);
    }

    public c(a aVar) {
        this.f63351c = new WeakReference<>(aVar);
    }

    /* JADX DEBUG: Method arguments types fixed to match base method, original types: [com.bytedance.sdk.a.a.a.b] */
    @Override // com.bytedance.sdk.a.a.a.a
    public final /* synthetic */ void a(e eVar) {
        e eVar2 = eVar;
        if (eVar2.f43071b) {
            if (this.f63351c.get() != null) {
                this.f63351c.get().a(eVar2.f43082j);
            }
        } else if (this.f63351c.get() != null) {
            String str = eVar2.u;
            if (eVar2.f43077h != null) {
                JSONObject optJSONObject = eVar2.f43077h.optJSONObject("data");
                if (TextUtils.isEmpty(str) && optJSONObject != null && optJSONObject.has("profile_key")) {
                    str = optJSONObject.optString("profile_key", "");
                }
            }
            this.f63351c.get().a(eVar2.f43073d, eVar2.f43075f, str, eVar2);
        }
    }
}
