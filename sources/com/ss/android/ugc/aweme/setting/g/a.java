package com.ss.android.ugc.aweme.setting.g;

import com.bytedance.covode.number.Covode;
import com.ss.android.ugc.aweme.setting.serverpush.a.c;
import com.ss.android.ugc.aweme.setting.serverpush.a.f;
import h.f.b.l;

public final class a implements com.ss.android.ugc.aweme.setting.serverpush.a {

    /* renamed from: a  reason: collision with root package name */
    public static c f122197a;

    /* renamed from: b  reason: collision with root package name */
    public static final a f122198b = new a();

    private a() {
    }

    static {
        Covode.recordClassIndex(80112);
    }

    @Override // com.ss.android.ugc.aweme.setting.serverpush.a
    public final void a(f fVar) {
        l.d(fVar, "");
        f122197a = fVar.af;
    }

    @Override // com.ss.android.ugc.aweme.setting.serverpush.a
    public final void a(Exception exc) {
        l.d(exc, "");
        f122197a = null;
    }
}
