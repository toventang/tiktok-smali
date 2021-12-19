package com.ss.android.ugc.aweme.shortvideo.ui;

import com.bytedance.covode.number.Covode;
import com.ss.android.ugc.aweme.shortvideo.model.CheckBADetagBA;
import com.ss.android.ugc.aweme.shortvideo.util.ay;

/* access modifiers changed from: package-private */
public final /* synthetic */ class dr implements CheckBADetagBA {

    /* renamed from: a  reason: collision with root package name */
    private final cj f131695a;

    static {
        Covode.recordClassIndex(86247);
    }

    dr(cj cjVar) {
        this.f131695a = cjVar;
    }

    @Override // com.ss.android.ugc.aweme.shortvideo.model.CheckBADetagBA
    public final void detagBA() {
        cj cjVar = this.f131695a;
        ay.a(cjVar.getContext(), cjVar.y, true);
    }
}
