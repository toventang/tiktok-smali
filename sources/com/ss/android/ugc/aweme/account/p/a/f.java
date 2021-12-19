package com.ss.android.ugc.aweme.account.p.a;

import android.content.Context;
import android.text.TextUtils;
import com.bytedance.covode.number.Covode;
import com.bytedance.ies.web.a.a;
import com.bytedance.ies.web.a.d;
import com.bytedance.ies.web.a.h;
import com.bytedance.sdk.a.h.a.n;
import com.bytedance.sdk.a.h.b.a.l;
import com.ss.android.ugc.aweme.account.experiment.o;
import com.ss.android.ugc.aweme.account.login.c.b;
import com.ss.android.ugc.aweme.cj;
import com.zhiliaoapp.musically.R;
import java.lang.ref.WeakReference;
import java.util.HashMap;
import org.json.JSONException;
import org.json.JSONObject;

public final class f implements d {

    /* renamed from: a  reason: collision with root package name */
    protected WeakReference<Context> f65268a;

    /* renamed from: b  reason: collision with root package name */
    private a f65269b;

    /* renamed from: c  reason: collision with root package name */
    private l f65270c;

    /* renamed from: d  reason: collision with root package name */
    private h f65271d;

    static {
        Covode.recordClassIndex(40137);
    }

    public f(WeakReference<Context> weakReference, a aVar) {
        this.f65268a = weakReference;
        this.f65269b = aVar;
    }

    public final void a(h hVar, boolean z) {
        int i2;
        if (hVar != null) {
            JSONObject jSONObject = new JSONObject();
            if (z) {
                i2 = 1;
            } else {
                i2 = 0;
            }
            try {
                jSONObject.put("code", i2);
            } catch (JSONException e2) {
                e2.printStackTrace();
            }
            this.f65269b.a(hVar.f35531b, jSONObject);
        }
    }

    @Override // com.bytedance.ies.web.a.d
    public final void call(final h hVar, JSONObject jSONObject) {
        if (this.f65268a.get() != null) {
            if (TextUtils.isEmpty(cj.f71084b.e().getCurUser().getBindPhone())) {
                new com.ss.android.ugc.aweme.tux.a.i.a(this.f65268a.get()).a(R.string.ca4).a();
                a(hVar, false);
                return;
            }
            this.f65271d = hVar;
            hVar.f35538i = false;
            this.f65270c = new b() {
                /* class com.ss.android.ugc.aweme.account.p.a.f.AnonymousClass1 */

                static {
                    Covode.recordClassIndex(40138);
                }

                @Override // com.bytedance.sdk.a.c
                public final /* bridge */ /* synthetic */ void a(com.bytedance.sdk.a.a.a.b bVar, String str) {
                }

                @Override // com.bytedance.sdk.a.e, com.ss.android.ugc.aweme.account.login.c.b
                /* renamed from: a */
                public final void e(com.bytedance.sdk.a.a.a.d<n> dVar) {
                    super.a(dVar);
                    f.this.a(hVar, true);
                }

                @Override // com.bytedance.sdk.a.e, com.ss.android.ugc.aweme.account.login.c.b
                public final void a(com.bytedance.sdk.a.a.a.d<n> dVar, int i2) {
                    super.a(dVar, i2);
                    if (f.this.f65268a != null) {
                        new com.ss.android.ugc.aweme.tux.a.i.a(f.this.f65268a.get()).a(com.ss.android.ugc.aweme.account.util.l.a(dVar)).a();
                    }
                    f.this.a(hVar, false);
                }
            };
            HashMap hashMap = new HashMap();
            if (o.a()) {
                hashMap.put("is6Digits", "1");
            }
            com.bytedance.sdk.a.f.d.a(com.ss.android.ugc.aweme.a.f62426a).a("", 22, hashMap, this.f65270c);
        }
    }
}
