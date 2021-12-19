package com.ss.android.ugc.aweme.influencer.ecommercelive.bridgemethods;

import android.text.TextUtils;
import androidx.lifecycle.i;
import androidx.lifecycle.m;
import com.bytedance.covode.number.Covode;
import com.bytedance.ies.bullet.c.e.a.b;
import com.ss.android.ugc.aweme.au;
import com.ss.android.ugc.aweme.bullet.bridge.BaseBridgeMethod;
import com.ss.android.ugc.aweme.web.k;
import h.f.b.l;
import h.m.p;
import java.io.File;
import org.json.JSONObject;

public final class GetGeckoChannelVersionMethod extends BaseBridgeMethod implements au {

    /* renamed from: b  reason: collision with root package name */
    public static final a f104511b = new a((byte) 0);

    /* renamed from: c  reason: collision with root package name */
    private final String f104512c = "getGeckoChannelVersion";

    static {
        Covode.recordClassIndex(66941);
    }

    @Override // com.ss.android.ugc.aweme.bullet.bridge.BaseBridgeMethod, androidx.lifecycle.k
    public final void onStateChanged(m mVar, i.a aVar) {
        super.onStateChanged(mVar, aVar);
    }

    public static final class a {
        static {
            Covode.recordClassIndex(66942);
        }

        private a() {
        }

        public /* synthetic */ a(byte b2) {
            this();
        }
    }

    @Override // com.bytedance.ies.bullet.c.c.a.q
    public final String d() {
        return this.f104512c;
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public GetGeckoChannelVersionMethod(b bVar) {
        super(bVar);
        l.d(bVar, "");
    }

    @Override // com.ss.android.ugc.aweme.bullet.bridge.BaseBridgeMethod
    public final void a(JSONObject jSONObject, BaseBridgeMethod.a aVar) {
        l.d(jSONObject, "");
        l.d(aVar, "");
        try {
            String optString = jSONObject.optString("channel");
            l.b(optString, "");
            if (p.a((CharSequence) optString, (CharSequence) "../", false)) {
                aVar.a(-1, "channel is wrong, should not contain ../");
                return;
            }
            File b2 = k.b();
            k kVar = k.f145061a;
            l.b(kVar, "");
            String c2 = kVar.c();
            l.b(c2, "");
            l.d(c2, "");
            l.d(optString, "");
            if (!TextUtils.isEmpty(c2) && !TextUtils.isEmpty(optString) && b2.exists()) {
                if (b2.isDirectory()) {
                    File file = new File(b2, File.separator + c2);
                    if (file.exists()) {
                        File file2 = new File(file.getAbsolutePath(), optString);
                        if (file2.exists()) {
                            Long a2 = com.bytedance.geckox.utils.m.a(file2);
                            if (a2 != null) {
                                aVar.a(Long.valueOf(a2.longValue()), 0, "success");
                                return;
                            }
                        }
                    }
                }
            }
            aVar.a(-1, "GeckoxVersion is null, may have no file");
        } catch (Exception e2) {
            aVar.a(-1, e2.getMessage());
            e2.printStackTrace();
            com.ss.android.ugc.aweme.framework.a.a.a("getGeckoChannelVersion", e2);
        }
    }
}
