package com.ss.android.ugc.aweme.relation.viewmodel;

import androidx.f.a.b;
import com.bytedance.covode.number.Covode;
import javax.a.a;

public final class c implements b<RecFriendsListViewModel> {

    /* renamed from: a  reason: collision with root package name */
    private final a<com.bytedance.assem.arch.a.a<com.ss.android.ugc.aweme.relation.api.c>> f120571a;

    static {
        Covode.recordClassIndex(78507);
    }

    /* Return type fixed from 'androidx.lifecycle.ac' to match base method */
    @Override // androidx.f.a.b
    public final /* synthetic */ RecFriendsListViewModel a() {
        return new RecFriendsListViewModel(this.f120571a.get());
    }

    c(a<com.bytedance.assem.arch.a.a<com.ss.android.ugc.aweme.relation.api.c>> aVar) {
        this.f120571a = aVar;
    }
}
