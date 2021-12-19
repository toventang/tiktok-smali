package com.ss.android.ugc.aweme.de;

import android.content.Context;
import com.bytedance.covode.number.Covode;
import com.bytedance.ies.ugc.appcontext.d;
import com.ss.android.ugc.aweme.feedback.c;
import f.a.b.b;
import f.a.t;
import f.a.z;
import org.json.JSONObject;

public final class a {

    /* renamed from: a  reason: collision with root package name */
    public static a f79387a;

    /* renamed from: b  reason: collision with root package name */
    final Context f79388b = d.a();

    static {
        Covode.recordClassIndex(49302);
    }

    public a() {
        t.a(new b(this)).a(f.a.a.a.a.a(f.a.a.b.a.f157156a)).b(f.a.h.a.b(f.a.k.a.f158006c)).b((z) new z<c>() {
            /* class com.ss.android.ugc.aweme.de.a.AnonymousClass1 */

            static {
                Covode.recordClassIndex(49303);
            }

            @Override // f.a.z
            public final void onComplete() {
            }

            @Override // f.a.z
            public final void onError(Throwable th) {
            }

            /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
            @Override // f.a.z
            public final /* bridge */ /* synthetic */ void onNext(c cVar) {
            }

            @Override // f.a.z
            public final void onSubscribe(b bVar) {
            }
        });
    }

    public final void a(JSONObject jSONObject) {
        if (jSONObject != null) {
            c cVar = new c();
            cVar.f95381a = jSONObject.optInt("update_sdk", 1);
            cVar.f95382b = jSONObject.optInt("pre_download_version", 0);
            cVar.f95383c = jSONObject.optInt("pre_download_start_time", 0);
            cVar.f95384d = jSONObject.optInt("pre_download_delay_days", 0);
            cVar.f95385e = jSONObject.optLong("pre_download_delay_second", -1);
            com.ss.android.ugc.aweme.co.b.b().a(this.f79388b, "update_params", cVar);
        }
    }
}
