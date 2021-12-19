package com.ss.android.ugc.aweme.i18n.musically.cut;

import com.bytedance.covode.number.Covode;
import com.ss.android.b.a.a.a;
import com.ss.android.ugc.aweme.i18n.musically.cut.AvatarCutActivity;
import com.ss.android.ugc.aweme.services.external.ability.IAVTransformService;

final /* synthetic */ class h implements IAVTransformService.ITransformProgress {

    /* renamed from: a  reason: collision with root package name */
    private final AvatarCutActivity.AnonymousClass1 f99855a;

    static {
        Covode.recordClassIndex(63659);
    }

    h(AvatarCutActivity.AnonymousClass1 r1) {
        this.f99855a = r1;
    }

    @Override // com.ss.android.ugc.aweme.services.external.ability.IAVTransformService.ITransformProgress
    public final void update(int i2) {
        a.b(new i(this.f99855a, i2));
    }
}
