package com.ss.android.ugc.aweme.profile.widgets;

import com.bytedance.covode.number.Covode;
import com.ss.android.ugc.aweme.profile.viewmodel.ProfileState;
import h.f.b.y;
import h.k.k;

/* access modifiers changed from: package-private */
public final /* synthetic */ class g extends y {

    /* renamed from: a  reason: collision with root package name */
    public static final k f117826a = new g();

    static {
        Covode.recordClassIndex(76322);
    }

    g() {
        super(ProfileState.class, "currentDownloadSetting", "getCurrentDownloadSetting()Ljava/lang/Integer;", 0);
    }

    @Override // h.k.k, h.f.b.y
    public final Object get(Object obj) {
        return ((ProfileState) obj).getCurrentDownloadSetting();
    }
}
