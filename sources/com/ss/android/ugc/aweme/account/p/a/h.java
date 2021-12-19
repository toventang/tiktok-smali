package com.ss.android.ugc.aweme.account.p.a;

import android.content.Context;
import com.bytedance.covode.number.Covode;
import com.bytedance.ies.web.a.a;
import com.bytedance.ies.web.a.d;
import com.bytedance.sdk.a.a.a.f;
import com.bytedance.sdk.a.h.b.a.p;
import com.ss.android.ugc.aweme.account.util.l;
import java.lang.ref.WeakReference;
import org.json.JSONException;
import org.json.JSONObject;

public final class h implements d {

    /* renamed from: a  reason: collision with root package name */
    protected WeakReference<Context> f65278a;

    /* renamed from: b  reason: collision with root package name */
    public boolean f65279b;

    /* renamed from: c  reason: collision with root package name */
    private a f65280c;

    /* renamed from: d  reason: collision with root package name */
    private p f65281d;

    /* renamed from: e  reason: collision with root package name */
    private String f65282e;

    /* renamed from: f  reason: collision with root package name */
    private com.bytedance.ies.web.a.h f65283f;

    static {
        Covode.recordClassIndex(40142);
    }

    public h(WeakReference<Context> weakReference, a aVar) {
        this.f65278a = weakReference;
        this.f65280c = aVar;
    }

    public final void a(com.bytedance.ies.web.a.h hVar, int i2) {
        int i3;
        if (hVar != null) {
            JSONObject jSONObject = new JSONObject();
            if (i2 == 0) {
                i3 = 1;
            } else {
                i3 = 0;
            }
            try {
                jSONObject.put("code", i3);
                jSONObject.put("errorCode", i2);
            } catch (JSONException e2) {
                e2.printStackTrace();
            }
            this.f65280c.a(hVar.f35531b, jSONObject);
        }
    }

    @Override // com.bytedance.ies.web.a.d
    public final void call(final com.bytedance.ies.web.a.h hVar, JSONObject jSONObject) {
        if (this.f65278a.get() != null) {
            this.f65283f = hVar;
            hVar.f35538i = false;
            this.f65282e = hVar.f35533d.getString("code");
            try {
                this.f65279b = hVar.f35533d.getBoolean("ignoreErrorToast");
            } catch (JSONException unused) {
            }
            this.f65281d = new p() {
                /* class com.ss.android.ugc.aweme.account.p.a.h.AnonymousClass1 */

                static {
                    Covode.recordClassIndex(40143);
                }

                /* JADX DEBUG: Method arguments types fixed to match base method, original types: [com.bytedance.sdk.a.a.a.b] */
                @Override // com.bytedance.sdk.a.c
                public final /* synthetic */ void e(f fVar) {
                    h.this.a(hVar, 0);
                }

                /* JADX DEBUG: Method arguments types fixed to match base method, original types: [com.bytedance.sdk.a.a.a.b, int] */
                @Override // com.bytedance.sdk.a.c
                public final /* synthetic */ void a(f fVar, int i2) {
                    if (h.this.f65278a != null && !h.this.f65279b) {
                        new com.ss.android.ugc.aweme.tux.a.i.a(h.this.f65278a.get()).a(l.a(fVar)).a();
                    }
                    h.this.a(hVar, i2);
                }
            };
            com.bytedance.sdk.a.f.d.a(com.ss.android.ugc.aweme.a.f62426a).a(this.f65282e, this.f65281d);
        }
    }
}
