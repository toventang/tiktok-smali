package com.bytedance.tiktok.homepage.mainactivity;

import com.bytedance.covode.number.Covode;
import com.ss.android.ugc.aweme.journey.z;

public final /* synthetic */ class j implements Runnable {

    /* renamed from: a  reason: collision with root package name */
    private final i f44171a;

    static {
        Covode.recordClassIndex(27066);
    }

    public j(i iVar) {
        this.f44171a = iVar;
    }

    public final void run() {
        i iVar = this.f44171a;
        z.f105220a.a(iVar.f44168a, iVar.f44168a.getIntent());
        iVar.b();
    }
}
