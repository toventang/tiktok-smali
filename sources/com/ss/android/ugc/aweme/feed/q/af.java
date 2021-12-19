package com.ss.android.ugc.aweme.feed.q;

import androidx.lifecycle.u;
import com.bytedance.covode.number.Covode;
import com.ss.android.ugc.aweme.feed.model.Aweme;

/* access modifiers changed from: package-private */
public final /* synthetic */ class af implements u {

    /* renamed from: a  reason: collision with root package name */
    private final w f93754a;

    static {
        Covode.recordClassIndex(59646);
    }

    af(w wVar) {
        this.f93754a = wVar;
    }

    @Override // androidx.lifecycle.u
    public final void onChanged(Object obj) {
        this.f93754a.b((Aweme) obj);
    }
}
