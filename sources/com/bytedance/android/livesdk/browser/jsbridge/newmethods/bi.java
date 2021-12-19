package com.bytedance.android.livesdk.browser.jsbridge.newmethods;

import com.bytedance.android.live.network.response.d;
import com.bytedance.android.livesdk.an.a;
import com.bytedance.android.livesdk.chatroom.c.x;
import com.bytedance.android.livesdk.chatroom.model.ShareReportResult;
import com.bytedance.covode.number.Covode;
import f.a.d.f;

/* access modifiers changed from: package-private */
public final /* synthetic */ class bi implements f {

    /* renamed from: a  reason: collision with root package name */
    static final f f14569a = new bi();

    static {
        Covode.recordClassIndex(8107);
    }

    private bi() {
    }

    @Override // f.a.d.f
    public final void accept(Object obj) {
        d dVar = (d) obj;
        if (dVar != null && dVar.data != null && ((ShareReportResult) dVar.data).getDeltaIntimacy() > 0) {
            a.a().a(new x((ShareReportResult) dVar.data));
        }
    }
}
