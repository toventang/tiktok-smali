package com.ss.android.ugc.aweme.profile.widgets;

import com.bytedance.covode.number.Covode;
import com.ss.android.ugc.aweme.profile.viewmodel.ProfileState;
import h.f.b.y;
import h.k.k;

/* access modifiers changed from: package-private */
public final /* synthetic */ class d extends y {

    /* renamed from: a  reason: collision with root package name */
    public static final k f117717a = new d();

    static {
        Covode.recordClassIndex(76206);
    }

    d() {
        super(ProfileState.class, "onHiddenChanged", "getOnHiddenChanged()Z", 0);
    }

    @Override // h.k.k, h.f.b.y
    public final Object get(Object obj) {
        return Boolean.valueOf(((ProfileState) obj).getOnHiddenChanged());
    }
}
