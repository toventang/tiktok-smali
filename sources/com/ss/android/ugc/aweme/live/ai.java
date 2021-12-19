package com.ss.android.ugc.aweme.live;

import android.content.Context;
import android.os.Bundle;
import android.view.View;
import android.view.ViewGroup;
import com.bytedance.covode.number.Covode;
import com.bytedance.frameworks.apm.trace.MethodCollector;
import com.ss.android.ugc.aweme.live.sdk.chatroom.ui.TTLiveBroadcastView;
import com.ss.android.ugc.aweme.live.sdk.chatroom.ui.a;
import com.ss.android.ugc.aweme.port.internal.g;
import com.ss.android.ugc.aweme.services.recording.IRecordingOperationPanel;

public final class ai implements g {

    /* renamed from: a  reason: collision with root package name */
    public a f108101a;

    /* renamed from: b  reason: collision with root package name */
    public volatile boolean f108102b;

    static {
        Covode.recordClassIndex(69314);
    }

    @Override // com.ss.android.ugc.aweme.port.internal.g
    public final View a() {
        return this.f108101a.a();
    }

    @Override // com.ss.android.ugc.aweme.port.internal.g
    public final void a(g.a aVar) {
        a aVar2 = this.f108101a;
        if (aVar2 != null) {
            aVar2.a(aVar);
        }
    }

    @Override // com.ss.android.ugc.aweme.port.internal.g
    public final void a(final ViewGroup viewGroup) {
        if (this.f108101a != null && this.f108102b) {
            this.f108101a.b();
            this.f108102b = false;
            viewGroup.postDelayed(new Runnable() {
                /* class com.ss.android.ugc.aweme.live.ai.AnonymousClass1 */

                static {
                    Covode.recordClassIndex(69315);
                }

                public final void run() {
                    MethodCollector.i(10471);
                    if (viewGroup != null && !ai.this.f108102b) {
                        viewGroup.removeView(ai.this.f108101a.a());
                    }
                    MethodCollector.o(10471);
                }
            }, 300);
        }
    }

    @Override // com.ss.android.ugc.aweme.port.internal.g
    public final void a(View... viewArr) {
        a aVar = this.f108101a;
        if (aVar != null) {
            aVar.a(viewArr);
        }
    }

    @Override // com.ss.android.ugc.aweme.port.internal.g
    public final void a(Context context, IRecordingOperationPanel iRecordingOperationPanel) {
        if (this.f108101a == null && Live.getService() != null) {
            this.f108101a = new TTLiveBroadcastView(context, iRecordingOperationPanel);
        }
    }

    @Override // com.ss.android.ugc.aweme.port.internal.g
    public final void a(ViewGroup viewGroup, Bundle bundle) {
        MethodCollector.i(12698);
        if (this.f108101a != null) {
            viewGroup.removeAllViews();
            this.f108102b = true;
            viewGroup.addView(this.f108101a.a());
            this.f108101a.a(bundle);
        }
        MethodCollector.o(12698);
    }
}
