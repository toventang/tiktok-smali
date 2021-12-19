package com.ss.android.ugc.aweme.commercialize.log;

import android.view.View;
import com.bytedance.android.a.a.d.b;
import com.bytedance.covode.number.Covode;
import com.ss.android.ad.splash.core.i.b;
import com.ss.android.ad.splash.core.i.c;
import java.util.List;
import org.json.JSONObject;

public final class ak implements b {

    /* renamed from: a  reason: collision with root package name */
    public static final ak f74739a = new ak();

    private ak() {
    }

    static {
        Covode.recordClassIndex(46094);
    }

    @Override // com.ss.android.ad.splash.core.i.b
    public final void a(View view, long j2, List<String> list, String str, boolean z, long j3, JSONObject jSONObject, c cVar) {
        a(view, "show", j2, list, str, z, j3, jSONObject, cVar);
    }

    @Override // com.ss.android.ad.splash.core.i.b
    public final void b(View view, long j2, List<String> list, String str, boolean z, long j3, JSONObject jSONObject, c cVar) {
        a(view, "click", j2, list, str, z, j3, jSONObject, cVar);
    }

    @Override // com.ss.android.ad.splash.core.i.b
    public final void c(View view, long j2, List<String> list, String str, boolean z, long j3, JSONObject jSONObject, c cVar) {
        a(view, "play", j2, list, str, z, j3, jSONObject, cVar);
    }

    @Override // com.ss.android.ad.splash.core.i.b
    public final void d(View view, long j2, List<String> list, String str, boolean z, long j3, JSONObject jSONObject, c cVar) {
        a(view, "play_over", j2, list, str, z, j3, jSONObject, cVar);
    }

    @Override // com.ss.android.ad.splash.core.i.b
    public final void a(View view, String str, long j2, List<String> list, String str2, boolean z, long j3, JSONObject jSONObject, c cVar) {
        long j4;
        b.a aVar = new b.a();
        aVar.f6637f = str;
        aVar.f6632a = j2;
        b.a a2 = aVar.a(list);
        a2.f6635d = str2;
        a2.f6633b = z;
        a2.f6634c = j3;
        a2.f6636e = jSONObject;
        a2.f6639h = true;
        if (cVar != null) {
            j4 = cVar.f58597a;
        } else {
            j4 = -1;
        }
        a2.f6638g = j4;
        am.f74745b.a().a(a2.a());
    }
}
