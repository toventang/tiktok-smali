package com.ss.android.ugc.aweme.notification.utils;

import android.content.Context;
import com.bytedance.covode.number.Covode;
import com.ss.android.ugc.aweme.services.AsyncAVService;
import com.ss.android.ugc.aweme.services.IExternalService;
import com.ss.android.ugc.aweme.services.external.ui.RecordConfig;
import h.f.b.l;

public final class s {

    /* renamed from: a  reason: collision with root package name */
    public static final s f113909a = new s();

    public static final class a implements IExternalService.ServiceLoadCallback {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ Context f113910a;

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ RecordConfig.Builder f113911b;

        static {
            Covode.recordClassIndex(73250);
        }

        @Override // com.ss.android.ugc.aweme.services.IExternalService.ServiceLoadCallback
        public final void onDismiss() {
            IExternalService.ServiceLoadCallback.DefaultImpls.onDismiss(this);
        }

        @Override // com.ss.android.ugc.aweme.services.IExternalService.ServiceLoadCallback
        public final void onFailed() {
            IExternalService.ServiceLoadCallback.DefaultImpls.onFailed(this);
        }

        @Override // com.ss.android.ugc.aweme.services.IExternalService.ServiceLoadCallback
        public final void onOK() {
            IExternalService.ServiceLoadCallback.DefaultImpls.onOK(this);
        }

        public a(Context context, RecordConfig.Builder builder) {
            this.f113910a = context;
            this.f113911b = builder;
        }

        @Override // com.ss.android.ugc.aweme.services.IExternalService.ServiceLoadCallback
        public final void onLoad(AsyncAVService asyncAVService, long j2) {
            l.d(asyncAVService, "");
            asyncAVService.uiService().recordService().startRecord(this.f113910a, this.f113911b.build());
        }
    }

    private s() {
    }

    static {
        Covode.recordClassIndex(73249);
    }
}
