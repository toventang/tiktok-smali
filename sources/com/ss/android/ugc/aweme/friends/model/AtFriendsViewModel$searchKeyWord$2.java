package com.ss.android.ugc.aweme.friends.model;

import b.g;
import b.i;
import com.bytedance.covode.number.Covode;
import com.ss.android.ugc.aweme.im.service.model.IMUser;
import h.f.b.l;
import java.util.List;

/* access modifiers changed from: package-private */
public final class AtFriendsViewModel$searchKeyWord$2<TTaskResult, TContinuationResult> implements g {
    final /* synthetic */ AtFriendsViewModel this$0;

    static {
        Covode.recordClassIndex(61565);
    }

    AtFriendsViewModel$searchKeyWord$2(AtFriendsViewModel atFriendsViewModel) {
        this.this$0 = atFriendsViewModel;
    }

    @Override // b.g
    public final i<List<IMUser>> then(i<List<IMUser>> iVar) {
        List<IMUser> d2;
        l.b(iVar, "");
        if (!iVar.c() && !iVar.b() && (d2 = iVar.d()) != null) {
            this.this$0.latestSearchUsers.clear();
            this.this$0.latestSearchUsers.addAll(d2);
        }
        return iVar;
    }
}
