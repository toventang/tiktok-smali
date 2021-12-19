package com.bytedance.tiktok.homepage;

import android.content.DialogInterface;
import com.bytedance.covode.number.Covode;
import com.ss.android.ugc.aweme.base.AnchorListManager;
import com.ss.android.ugc.aweme.feed.i.aa;
import com.ss.android.ugc.aweme.main.MainActivity;
import com.ss.android.ugc.aweme.metrics.ah;
import com.ss.android.ugc.aweme.out.AVExternalServiceImpl;
import com.ss.android.ugc.aweme.services.AsyncAVService;
import com.ss.android.ugc.aweme.services.SimpleServiceLoadCallback;
import com.ss.android.ugc.aweme.services.external.ui.RecordConfig;
import com.ss.android.ugc.d.a.c;
import java.util.UUID;

final /* synthetic */ class d implements DialogInterface.OnClickListener {

    /* renamed from: a  reason: collision with root package name */
    private final a f44123a;

    /* renamed from: b  reason: collision with root package name */
    private final MainActivity f44124b;

    static {
        Covode.recordClassIndex(27038);
    }

    d(a aVar, MainActivity mainActivity) {
        this.f44123a = aVar;
        this.f44124b = mainActivity;
    }

    public final void onClick(DialogInterface dialogInterface, int i2) {
        a aVar = this.f44123a;
        MainActivity mainActivity = this.f44124b;
        AVExternalServiceImpl.a().abnormalExitLogService().logRestoreDialogClick(true);
        AnchorListManager.a();
        ah.f109483a = mainActivity.getEnterFrom();
        AVExternalServiceImpl.a().asyncService(mainActivity, "restore_crash", new SimpleServiceLoadCallback(mainActivity, new RecordConfig.Builder().shootWay("restore_crash").restoreType(2).creationId(UUID.randomUUID().toString())) {
            /* class com.bytedance.tiktok.homepage.a.AnonymousClass3 */

            /* renamed from: a  reason: collision with root package name */
            final /* synthetic */ MainActivity f44118a;

            /* renamed from: b  reason: collision with root package name */
            final /* synthetic */ RecordConfig.Builder f44119b;

            static {
                Covode.recordClassIndex(27035);
            }

            @Override // com.ss.android.ugc.aweme.services.IExternalService.ServiceLoadCallback
            public final void onLoad(AsyncAVService asyncAVService, long j2) {
                asyncAVService.uiService().recordService().startRecord(this.f44118a, this.f44119b.build());
            }

            {
                this.f44118a = r2;
                this.f44119b = r3;
            }
        });
        dialogInterface.dismiss();
        c.a(new aa());
    }
}
