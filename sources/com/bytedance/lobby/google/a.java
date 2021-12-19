package com.bytedance.lobby.google;

import androidx.fragment.app.e;
import com.bytedance.covode.number.Covode;
import com.google.android.gms.common.api.i;
import com.google.android.gms.common.api.p;
import com.google.android.gms.common.api.q;

final /* synthetic */ class a implements q {

    /* renamed from: a  reason: collision with root package name */
    private final GoogleAuth f40207a;

    /* renamed from: b  reason: collision with root package name */
    private final e f40208b;

    /* renamed from: c  reason: collision with root package name */
    private final i f40209c;

    static {
        Covode.recordClassIndex(24787);
    }

    a(GoogleAuth googleAuth, e eVar, i iVar) {
        this.f40207a = googleAuth;
        this.f40208b = eVar;
        this.f40209c = iVar;
    }

    @Override // com.google.android.gms.common.api.q
    public final void a(p pVar) {
        GoogleAuth.a(this.f40208b, this.f40209c);
    }
}
