package com.ss.android.ugc.aweme.profile.survey;

import b.g;
import b.i;
import com.bytedance.covode.number.Covode;
import com.ss.android.ugc.aweme.cu.a;
import com.ss.android.ugc.aweme.profile.survey.d;
import com.ss.android.ugc.aweme.utils.ai;

public final /* synthetic */ class e implements g {

    /* renamed from: a  reason: collision with root package name */
    private final d f116643a;

    static {
        Covode.recordClassIndex(75364);
    }

    public e(d dVar) {
        this.f116643a = dVar;
    }

    @Override // b.g
    public final Object then(i iVar) {
        d dVar = this.f116643a;
        if (!ai.a(iVar)) {
            if (dVar.f116642b != null) {
                d.a aVar = dVar.f116642b;
                iVar.e();
                aVar.a();
            }
            return null;
        }
        a aVar2 = (a) iVar.d();
        if (dVar.f116642b != null) {
            d.a aVar3 = dVar.f116642b;
            if (aVar2 == null || aVar2.f79085a == 0) {
                aVar2 = null;
            }
            aVar3.a(aVar2);
        }
        return null;
    }
}
