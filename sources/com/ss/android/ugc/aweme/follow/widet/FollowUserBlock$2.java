package com.ss.android.ugc.aweme.follow.widet;

import androidx.lifecycle.i;
import androidx.lifecycle.m;
import androidx.lifecycle.v;
import com.bytedance.covode.number.Covode;
import com.ss.android.ugc.aweme.au;
import com.ss.android.ugc.aweme.friends.ui.w;

/* access modifiers changed from: package-private */
public class FollowUserBlock$2 implements au {

    /* renamed from: a  reason: collision with root package name */
    final /* synthetic */ w f96282a;

    /* renamed from: b  reason: collision with root package name */
    final /* synthetic */ a f96283b;

    static {
        Covode.recordClassIndex(60973);
    }

    @Override // androidx.lifecycle.k
    public void onStateChanged(m mVar, i.a aVar) {
        if (aVar == i.a.ON_DESTROY) {
            onDestroy();
        }
    }

    /* access modifiers changed from: protected */
    @v(a = i.a.ON_DESTROY)
    public void onDestroy() {
        this.f96282a.cd_();
    }

    FollowUserBlock$2(a aVar, w wVar) {
        this.f96283b = aVar;
        this.f96282a = wVar;
    }
}
