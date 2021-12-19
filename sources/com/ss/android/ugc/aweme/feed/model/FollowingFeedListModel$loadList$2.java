package com.ss.android.ugc.aweme.feed.model;

import android.os.Message;
import com.bytedance.covode.number.Covode;
import f.a.d.f;
import h.f.b.l;

/* access modifiers changed from: package-private */
public final class FollowingFeedListModel$loadList$2<T> implements f {
    final /* synthetic */ FollowingFeedListModel this$0;

    static {
        Covode.recordClassIndex(59387);
    }

    FollowingFeedListModel$loadList$2(FollowingFeedListModel followingFeedListModel) {
        this.this$0 = followingFeedListModel;
    }

    public final void accept(Throwable th) {
        Message obtainMessage = this.this$0.mHandler.obtainMessage(0);
        l.b(obtainMessage, "");
        obtainMessage.obj = new RuntimeException(th);
        this.this$0.mHandler.sendMessage(obtainMessage);
    }
}
