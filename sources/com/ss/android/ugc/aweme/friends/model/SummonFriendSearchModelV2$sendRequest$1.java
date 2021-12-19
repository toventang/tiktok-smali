package com.ss.android.ugc.aweme.friends.model;

import com.bytedance.covode.number.Covode;
import com.ss.android.ugc.aweme.search.model.g;
import java.util.concurrent.Callable;

final class SummonFriendSearchModelV2$sendRequest$1<V> implements Callable {
    final /* synthetic */ g $request;
    final /* synthetic */ SummonFriendSearchModelV2 this$0;

    static {
        Covode.recordClassIndex(61611);
    }

    SummonFriendSearchModelV2$sendRequest$1(SummonFriendSearchModelV2 summonFriendSearchModelV2, g gVar) {
        this.this$0 = summonFriendSearchModelV2;
        this.$request = gVar;
    }

    @Override // java.util.concurrent.Callable
    public final Object call() {
        return this.this$0.getSearchUserService().b(this.$request);
    }
}
