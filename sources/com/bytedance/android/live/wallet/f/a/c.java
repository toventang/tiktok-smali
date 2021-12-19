package com.bytedance.android.live.wallet.f.a;

import android.app.Activity;
import com.bytedance.android.live.wallet.f.b.a;
import com.bytedance.covode.number.Covode;
import org.json.JSONObject;

public final class c extends a<a> {

    /* renamed from: a  reason: collision with root package name */
    private Activity f13147a;

    /* renamed from: b  reason: collision with root package name */
    private final com.bytedance.android.live.wallet.api.a f13148b;

    /* renamed from: c  reason: collision with root package name */
    private final JSONObject f13149c = new JSONObject();

    /* renamed from: d  reason: collision with root package name */
    private String f13150d;

    static {
        Covode.recordClassIndex(7297);
    }

    @Override // com.bytedance.ies.a.b
    public final void b() {
        this.f13147a = null;
    }

    public final void a(a aVar) {
        super.a((com.bytedance.ies.a.a) aVar);
    }

    @Override // com.bytedance.ies.a.b
    public final /* bridge */ /* synthetic */ void a(com.bytedance.ies.a.a aVar) {
        super.a(aVar);
    }

    public c(Activity activity, com.bytedance.android.live.wallet.api.a aVar, String str) {
        this.f13147a = activity;
        this.f13148b = aVar;
        this.f13150d = str;
    }
}
