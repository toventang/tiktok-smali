package com.ss.android.ugc.aweme.notification.model;

import android.os.SystemClock;
import androidx.lifecycle.t;
import b.g;
import b.i;
import com.bytedance.covode.number.Covode;
import com.ss.android.ugc.aweme.notification.bean.LiveNoticeMessageResponse;
import com.ss.android.ugc.aweme.notification.utils.e;
import h.f.b.l;

/* access modifiers changed from: package-private */
public final class MusNewNotificationModel$startFetchLive$1<TTaskResult, TContinuationResult> implements g {
    final /* synthetic */ long $currentTime;
    final /* synthetic */ MusNewNotificationModel this$0;

    static {
        Covode.recordClassIndex(73166);
    }

    MusNewNotificationModel$startFetchLive$1(MusNewNotificationModel musNewNotificationModel, long j2) {
        this.this$0 = musNewNotificationModel;
        this.$currentTime = j2;
    }

    @Override // b.g
    public final void then(i<LiveNoticeMessageResponse> iVar) {
        t<LiveNoticeMessageResponse> tVar = this.this$0.updateLiveData;
        l.b(iVar, "");
        tVar.postValue(iVar.d());
        e.a(iVar.d(), SystemClock.elapsedRealtime() - this.$currentTime);
    }
}
