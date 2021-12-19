package com.ss.android.ugc.aweme.setting.page.diskmanager;

import android.os.Bundle;
import android.view.View;
import androidx.fragment.app.e;
import com.bytedance.covode.number.Covode;
import com.ss.android.ugc.aweme.be.d;
import com.ss.android.ugc.aweme.out.AVExternalServiceImpl;
import com.ss.android.ugc.aweme.services.AsyncAVService;
import com.ss.android.ugc.aweme.services.IExternalService;
import com.ss.android.ugc.aweme.services.external.ui.IDraftService;
import com.zhiliaoapp.musically.R;
import h.f.b.l;
import h.f.b.m;

public final class c extends e {
    static {
        Covode.recordClassIndex(80344);
    }

    public static final class b implements IExternalService.ServiceLoadCallback {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ c f122498a;

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ Bundle f122499b;

        static {
            Covode.recordClassIndex(80346);
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

        b(c cVar, Bundle bundle) {
            this.f122498a = cVar;
            this.f122499b = bundle;
        }

        @Override // com.ss.android.ugc.aweme.services.IExternalService.ServiceLoadCallback
        public final void onLoad(AsyncAVService asyncAVService, long j2) {
            l.d(asyncAVService, "");
            e g2 = this.f122498a.g();
            if (g2 != null) {
                IDraftService draftService = asyncAVService.uiService().draftService();
                l.b(g2, "");
                draftService.enterDraftBoxActivity(g2, this.f122499b);
            }
        }
    }

    /* Return type fixed from 'com.ss.android.ugc.aweme.be.a' to match base method */
    @Override // com.ss.android.ugc.aweme.dc.c, com.ss.android.ugc.aweme.dc.a
    public final /* synthetic */ d b() {
        return b();
    }

    @Override // com.ss.android.ugc.aweme.dc.c
    public final d a() {
        return new d(a(R.string.fpm, new Object[0]), null, this, null, false, j(), i(), false, null, true, a(R.string.fpt, new Object[0]), false, null, 127898);
    }

    @Override // com.ss.android.ugc.aweme.setting.page.diskmanager.e
    public final void f() {
        a(R.string.fpm);
        a("DRAFT");
        a(new a(AVExternalServiceImpl.a().draftService().draftList(false).size()));
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public c(com.ss.android.ugc.aweme.setting.page.a aVar) {
        super(aVar);
        l.d(aVar, "");
    }

    @Override // com.ss.android.ugc.aweme.setting.page.diskmanager.e
    public final void a(View view) {
        l.d(view, "");
        IExternalService a2 = AVExternalServiceImpl.a();
        Bundle bundle = new Bundle();
        bundle.putBoolean("is_disk_manage_mode", true);
        a2.asyncService("CleanDraft", new b(this, bundle));
    }

    static final class a extends m implements h.f.a.b<d, d> {
        final /* synthetic */ int $draftCount;

        static {
            Covode.recordClassIndex(80345);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        a(int i2) {
            super(1);
            this.$draftCount = i2;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
        @Override // h.f.a.b
        public final /* synthetic */ d invoke(d dVar) {
            boolean z;
            d dVar2 = dVar;
            l.d(dVar2, "");
            if (this.$draftCount > 0) {
                z = true;
            } else {
                z = false;
            }
            return d.a(dVar2, null, null, null, null, z, null, null, null, false, null, false, null, false, false, null, false, 0, 131055);
        }
    }
}
