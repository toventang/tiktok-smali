package com.bytedance.tiktok.homepage.mainactivity;

import com.bytedance.covode.number.Covode;
import com.ss.android.ugc.aweme.main.MainActivity;
import com.ss.android.ugc.aweme.out.AVExternalServiceImpl;
import h.f.a.b;

public final /* synthetic */ class p implements b {

    /* renamed from: a  reason: collision with root package name */
    private final o f44185a;

    static {
        Covode.recordClassIndex(27073);
    }

    public p(o oVar) {
        this.f44185a = oVar;
    }

    @Override // h.f.a.b
    public final Object invoke(Object obj) {
        o oVar = this.f44185a;
        Boolean bool = (Boolean) obj;
        if (AVExternalServiceImpl.a().configService().shortVideoConfig().isRecording()) {
            o.a();
            return null;
        } else if (bool.booleanValue()) {
            oVar.f44180c = true;
            oVar.f44179b.a((MainActivity) oVar.f44178a);
            return null;
        } else {
            o.a();
            oVar.b(oVar.f44178a.getIntent(), true);
            return null;
        }
    }
}
