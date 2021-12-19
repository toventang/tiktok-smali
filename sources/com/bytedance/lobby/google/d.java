package com.bytedance.lobby.google;

import androidx.fragment.app.e;
import com.bytedance.covode.number.Covode;
import com.google.android.gms.common.api.i;
import com.google.android.gms.common.api.p;
import com.google.android.gms.common.api.q;

final /* synthetic */ class d implements q {

    /* renamed from: a  reason: collision with root package name */
    private final GoogleAuth f40212a;

    /* renamed from: b  reason: collision with root package name */
    private final e f40213b;

    /* renamed from: c  reason: collision with root package name */
    private final i f40214c;

    static {
        Covode.recordClassIndex(24790);
    }

    d(GoogleAuth googleAuth, e eVar, i iVar) {
        this.f40212a = googleAuth;
        this.f40213b = eVar;
        this.f40214c = iVar;
    }

    @Override // com.google.android.gms.common.api.q
    public final void a(p pVar) {
        GoogleAuth.a(this.f40213b, this.f40214c);
    }
}
