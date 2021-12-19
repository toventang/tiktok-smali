package com.ss.android.ugc.aweme.profile.widgets;

import com.bytedance.covode.number.Covode;
import com.ss.android.ugc.aweme.profile.viewmodel.ProfileState;
import h.f.b.y;
import h.k.k;

/* access modifiers changed from: package-private */
public final /* synthetic */ class e extends y {

    /* renamed from: a  reason: collision with root package name */
    public static final k f117737a = new e();

    static {
        Covode.recordClassIndex(76225);
    }

    e() {
        super(ProfileState.class, "loadAvatar", "getLoadAvatar()Lcom/bytedance/jedi/arch/Async;", 0);
    }

    @Override // h.k.k, h.f.b.y
    public final Object get(Object obj) {
        return ((ProfileState) obj).getLoadAvatar();
    }
}
