package com.ss.android.ugc.aweme.notification.model;

import b.g;
import b.i;
import com.bytedance.covode.number.Covode;
import com.ss.android.ugc.aweme.common.o;
import com.ss.android.ugc.aweme.inbox.d.j;
import com.ss.android.ugc.aweme.notification.bean.e;
import h.f.b.l;

/* access modifiers changed from: package-private */
public final class LikeListModel$fetchLikeList$1<TTaskResult, TContinuationResult> implements g {
    final /* synthetic */ LikeListModel this$0;

    static {
        Covode.recordClassIndex(73161);
    }

    LikeListModel$fetchLikeList$1(LikeListModel likeListModel) {
        this.this$0 = likeListModel;
    }

    @Override // b.g
    public final void then(i<e> iVar) {
        l.b(iVar, "");
        j.a(iVar.d());
        if (!iVar.c()) {
            this.this$0.handleData(iVar.d());
            if (this.this$0.mNotifyListeners != null) {
                for (o oVar : this.this$0.mNotifyListeners) {
                    oVar.c();
                }
            }
        } else if (this.this$0.mNotifyListeners != null) {
            for (o oVar2 : this.this$0.mNotifyListeners) {
                oVar2.a_(iVar.e());
            }
        }
    }
}
