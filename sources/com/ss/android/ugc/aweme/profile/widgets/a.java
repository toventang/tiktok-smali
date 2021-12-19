package com.ss.android.ugc.aweme.profile.widgets;

import com.bytedance.covode.number.Covode;
import com.ss.android.ugc.aweme.profile.viewmodel.ProfileState;
import h.f.b.y;
import h.k.k;

/* access modifiers changed from: package-private */
public final /* synthetic */ class a extends y {

    /* renamed from: a  reason: collision with root package name */
    public static final k f117568a = new a();

    static {
        Covode.recordClassIndex(75994);
    }

    a() {
        super(ProfileState.class, "isPostAwemeEmpty", "isPostAwemeEmpty()Ljava/lang/Boolean;", 0);
    }

    @Override // h.k.k, h.f.b.y
    public final Object get(Object obj) {
        return ((ProfileState) obj).isPostAwemeEmpty();
    }
}
