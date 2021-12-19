package com.ss.android.ugc.aweme.request_combine.request;

import com.bytedance.covode.number.Covode;
import com.bytedance.ies.abmock.j;
import com.ss.android.ugc.aweme.app.f.d;
import com.ss.android.ugc.aweme.experiment.ee;
import com.ss.android.ugc.aweme.legacy.AbTestManagerImpl;
import com.ss.android.ugc.aweme.lego.f;
import com.ss.android.ugc.aweme.lego.r;
import com.ss.android.ugc.aweme.request_combine.model.SettingCombineDataModel;
import com.ss.android.ugc.aweme.request_combine.model.SettingCombineModel;
import com.ss.android.ugc.aweme.request_combine.model.UnifiedSettingCombineModel;
import com.ss.android.ugc.aweme.request_combine.request.a.e;
import com.ss.android.ugc.aweme.utils.fr;
import h.z;
import java.util.concurrent.Callable;

public final class l extends b {

    /* renamed from: a  reason: collision with root package name */
    private com.ss.android.ugc.aweme.request_combine.a f120678a;

    static {
        Covode.recordClassIndex(78599);
    }

    @Override // com.ss.android.ugc.aweme.request_combine.request.b
    public final String a() {
        return "/service/settings/v3/";
    }

    @Override // com.ss.android.ugc.aweme.request_combine.request.b
    public final com.ss.android.ugc.aweme.request_combine.a b() {
        return this.f120678a;
    }

    static final class a implements Runnable {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ UnifiedSettingCombineModel f120679a;

        static {
            Covode.recordClassIndex(78600);
        }

        a(UnifiedSettingCombineModel unifiedSettingCombineModel) {
            this.f120679a = unifiedSettingCombineModel;
        }

        /* renamed from: com.ss.android.ugc.aweme.request_combine.request.l$a$a  reason: collision with other inner class name */
        static final class CallableC3119a<V> implements Callable {

            /* renamed from: a  reason: collision with root package name */
            public static final CallableC3119a f120680a = new CallableC3119a();

            static {
                Covode.recordClassIndex(78601);
            }

            CallableC3119a() {
            }

            @Override // java.util.concurrent.Callable
            public final /* synthetic */ Object call() {
                if (ee.f89901a) {
                    fr.c(3000);
                }
                AbTestManagerImpl.b().a(true);
                return z.f158842a;
            }
        }

        /* JADX WARNING: Code restructure failed: missing block: B:27:0x008d, code lost:
            if (r6 != null) goto L_0x008f;
         */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public final void run() {
            /*
            // Method dump skipped, instructions count: 343
            */
            throw new UnsupportedOperationException("Method not decompiled: com.ss.android.ugc.aweme.request_combine.request.l.a.run():void");
        }
    }

    @Override // com.ss.android.ugc.aweme.request_combine.request.b
    public final boolean a(SettingCombineModel settingCombineModel) {
        UnifiedSettingCombineModel unifiedSettingCombineModel;
        SettingCombineDataModel data;
        if (settingCombineModel == null || (data = settingCombineModel.getData()) == null) {
            unifiedSettingCombineModel = null;
        } else {
            unifiedSettingCombineModel = data.getUnifiedSetting();
        }
        this.f120678a = unifiedSettingCombineModel;
        if (unifiedSettingCombineModel == null) {
            return false;
        }
        if (unifiedSettingCombineModel.httpCode == 200) {
            f.a.h.a.b(f.a.k.a.f158006c).a(new a(unifiedSettingCombineModel));
        }
        if (unifiedSettingCombineModel.httpCode == 200) {
            return true;
        }
        return false;
    }

    @Override // com.ss.android.ugc.aweme.request_combine.request.b
    public final void a(f.b bVar) {
        h.f.b.l.d(bVar, "");
        bVar.b((r) new e());
        com.ss.android.ugc.aweme.framework.a.a.a("creator_fund_investigate action = creator_fund_setting_finished, success = false, is_combine = true, is_v3 = " + j.a().c() + ", is_v3_api = true");
        com.ss.android.ugc.aweme.common.r.a("config_fetch_success", new d().a("status", "0").a("source", "0").a("is_combine", "1").f66730a);
    }
}
