package com.bytedance.android.livesdk.share;

import com.bytedance.android.live.network.response.d;
import com.bytedance.android.livesdk.chatroom.model.ShareReportResult;
import com.bytedance.android.livesdk.j.cg;
import com.bytedance.covode.number.Covode;
import com.ss.ugc.live.sdk.message.interfaces.IMessageManager;
import f.a.d.f;

final /* synthetic */ class b implements f {

    /* renamed from: a  reason: collision with root package name */
    private final LiveShareWidget f21444a;

    static {
        Covode.recordClassIndex(12626);
    }

    b(LiveShareWidget liveShareWidget) {
        this.f21444a = liveShareWidget;
    }

    @Override // f.a.d.f
    public final void accept(Object obj) {
        IMessageManager iMessageManager;
        LiveShareWidget liveShareWidget = this.f21444a;
        ShareReportResult shareReportResult = (ShareReportResult) ((d) obj).data;
        if (shareReportResult != null && shareReportResult.getDeltaIntimacy() > 0 && liveShareWidget.f21439b != null && (iMessageManager = (IMessageManager) liveShareWidget.dataChannel.b(cg.class)) != null) {
            iMessageManager.insertMessage(com.bytedance.android.livesdk.chatroom.b.b.a(liveShareWidget.f21439b.getId(), shareReportResult.getDisplayText(), liveShareWidget.f21440c), true);
        }
    }
}
