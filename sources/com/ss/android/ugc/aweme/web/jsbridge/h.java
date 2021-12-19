package com.ss.android.ugc.aweme.web.jsbridge;

import android.content.Context;
import b.g;
import b.i;
import com.bytedance.covode.number.Covode;
import com.bytedance.ies.web.a.a;
import com.bytedance.ies.web.a.d;
import java.lang.ref.WeakReference;
import org.json.JSONObject;

public final class h implements d {

    /* renamed from: a  reason: collision with root package name */
    WeakReference<Context> f145033a;

    /* renamed from: b  reason: collision with root package name */
    public a f145034b;

    static {
        Covode.recordClassIndex(94829);
    }

    public h(WeakReference<Context> weakReference, a aVar) {
        this.f145033a = weakReference;
        this.f145034b = aVar;
    }

    @Override // com.bytedance.ies.web.a.d
    public final void call(com.bytedance.ies.web.a.h hVar, JSONObject jSONObject) {
        if (hVar != null && hVar.f35533d != null) {
            hVar.f35538i = false;
            float scale = this.f145034b.f35513d.getScale();
            int i2 = (int) (((float) hVar.f35533d.getInt("width")) * scale);
            int i3 = (int) (((float) hVar.f35533d.getInt("height")) * scale);
            int i4 = (int) (((float) hVar.f35533d.getInt("left")) * scale);
            int i5 = (int) (((float) hVar.f35533d.getInt("top")) * scale);
            int optInt = hVar.f35533d.optInt("format", 0);
            final String str = hVar.f35531b;
            a aVar = this.f145034b;
            if (aVar != null && aVar.f35513d != null) {
                i.b(new i(this, i2, i3, i4, i5), i.f4826c).a(new j(this, optInt), i.f4824a, null).a(new g<JSONObject, Void>() {
                    /* class com.ss.android.ugc.aweme.web.jsbridge.h.AnonymousClass1 */

                    static {
                        Covode.recordClassIndex(94830);
                    }

                    /* access modifiers changed from: private */
                    /* renamed from: a */
                    public Void then(i<JSONObject> iVar) {
                        if (iVar.d() == null) {
                            return null;
                        }
                        h.this.f145034b.a(str, iVar.d());
                        return null;
                    }
                }, i.f4826c, null);
            }
        }
    }
}
