package com.ss.android.ugc.aweme.profile.widgets;

import com.bytedance.covode.number.Covode;
import com.ss.android.ugc.aweme.profile.viewmodel.ProfileState;
import h.f.b.y;
import h.k.k;

/* access modifiers changed from: package-private */
public final /* synthetic */ class l extends y {

    /* renamed from: a  reason: collision with root package name */
    public static final k f117925a = new l();

    static {
        Covode.recordClassIndex(76419);
    }

    l() {
        super(ProfileState.class, "curTabType", "getCurTabType()I", 0);
    }

    @Override // h.k.k, h.f.b.y
    public final Object get(Object obj) {
        return Integer.valueOf(((ProfileState) obj).getCurTabType());
    }
}
