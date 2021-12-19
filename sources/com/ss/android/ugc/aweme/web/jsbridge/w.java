package com.ss.android.ugc.aweme.web.jsbridge;

import android.app.Activity;
import android.content.Context;
import com.bytedance.covode.number.Covode;
import com.bytedance.ies.web.a.d;
import com.bytedance.ies.web.a.h;
import com.ss.android.ugc.aweme.ck.t;
import com.ss.android.ugc.aweme.ck.u;
import h.f.b.l;
import java.lang.ref.WeakReference;
import java.util.Objects;
import org.json.JSONObject;

public final class w implements d {

    /* renamed from: a  reason: collision with root package name */
    private final WeakReference<Context> f145052a;

    static {
        Covode.recordClassIndex(94845);
    }

    public w(WeakReference<Context> weakReference) {
        l.d(weakReference, "");
        this.f145052a = weakReference;
    }

    @Override // com.bytedance.ies.web.a.d
    public final void call(h hVar, JSONObject jSONObject) {
        l.d(hVar, "");
        l.d(jSONObject, "");
        if (this.f145052a.get() != null) {
            t a2 = t.a();
            Context context = this.f145052a.get();
            Objects.requireNonNull(context, "null cannot be cast to non-null type android.app.Activity");
            t.a(a2, (Activity) context, u.a("aweme://profile_edit").a("jump_school_edit", 1).a());
        }
    }
}
