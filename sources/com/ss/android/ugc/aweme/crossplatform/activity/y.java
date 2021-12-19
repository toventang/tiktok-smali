package com.ss.android.ugc.aweme.crossplatform.activity;

import android.app.Activity;
import android.os.MessageQueue;
import com.bytedance.covode.number.Covode;
import com.ss.android.ugc.aweme.crossplatform.activity.v;
import com.ss.android.ugc.aweme.crossplatform.platform.webview.SingleWebView;

final /* synthetic */ class y implements MessageQueue.IdleHandler {

    /* renamed from: a  reason: collision with root package name */
    private final v.AnonymousClass1 f78588a;

    /* renamed from: b  reason: collision with root package name */
    private final Activity f78589b;

    /* renamed from: c  reason: collision with root package name */
    private final v.a f78590c;

    static {
        Covode.recordClassIndex(48798);
    }

    y(v.AnonymousClass1 r1, Activity activity, v.a aVar) {
        this.f78588a = r1;
        this.f78589b = activity;
        this.f78590c = aVar;
    }

    public final boolean queueIdle() {
        v.AnonymousClass1 r3 = this.f78588a;
        Activity activity = this.f78589b;
        v.a aVar = this.f78590c;
        v.this.f78578b.offer(new SingleWebView(activity));
        aVar.a();
        return false;
    }
}
