package com.ss.android.ugc.aweme.commercialize.preview.service;

import android.content.Context;
import android.view.ViewGroup;
import com.bytedance.covode.number.Covode;
import com.bytedance.frameworks.apm.trace.MethodCollector;
import com.bytedance.keva.Keva;
import com.bytedance.tux.dialog.b.c;
import com.ss.android.ugc.aweme.commercialize.preview.d.a;
import com.ss.android.ugc.aweme.commercialize.preview.manager.AdsPreviewStateManager;
import com.ss.android.ugc.aweme.commercialize.preview.manager.a;
import com.ss.android.ugc.aweme.common.r;
import com.ss.android.ugc.b;
import com.zhiliaoapp.musically.R;
import h.a.i;
import h.f.b.l;
import h.z;
import java.util.List;
import java.util.concurrent.TimeUnit;

public final class AdsPreviewServiceImpl implements IAdsPreviewService {
    static {
        Covode.recordClassIndex(46267);
    }

    public static IAdsPreviewService a() {
        MethodCollector.i(8573);
        Object a2 = b.a(IAdsPreviewService.class, false);
        if (a2 != null) {
            IAdsPreviewService iAdsPreviewService = (IAdsPreviewService) a2;
            MethodCollector.o(8573);
            return iAdsPreviewService;
        }
        if (b.at == null) {
            synchronized (IAdsPreviewService.class) {
                try {
                    if (b.at == null) {
                        b.at = new AdsPreviewServiceImpl();
                    }
                } catch (Throwable th) {
                    MethodCollector.o(8573);
                    throw th;
                }
            }
        }
        AdsPreviewServiceImpl adsPreviewServiceImpl = (AdsPreviewServiceImpl) b.at;
        MethodCollector.o(8573);
        return adsPreviewServiceImpl;
    }

    @Override // com.ss.android.ugc.aweme.commercialize.preview.service.IAdsPreviewService
    public final void b(ViewGroup viewGroup) {
        l.d(viewGroup, "");
        a.C1707a.a(viewGroup);
    }

    @Override // com.ss.android.ugc.aweme.commercialize.preview.service.IAdsPreviewService
    public final void a(ViewGroup viewGroup) {
        l.d(viewGroup, "");
        l.d(viewGroup, "");
        com.bytedance.tux.dialog.a aVar = com.ss.android.ugc.aweme.commercialize.preview.manager.a.f75045a;
        if (aVar != null) {
            aVar.dismiss();
        }
        com.ss.android.ugc.aweme.commercialize.preview.manager.a.f75045a = null;
        a.C1707a.a(viewGroup);
    }

    private static boolean b(String str, String str2) {
        Keva repo = Keva.getRepo("ads_preview_keva");
        long j2 = repo.getLong("preview_timestamp", 0);
        if (j2 != 0 && TimeUnit.MILLISECONDS.toMinutes(System.currentTimeMillis() - j2) <= ((long) com.ss.android.ugc.aweme.commercialize.preview.experiment.a.a().getValidationDurationInMinute())) {
            int hashCode = str.hashCode();
            if (hashCode != 98494) {
                if (hashCode == 2989182 && str.equals("adid")) {
                    String[] stringArray = repo.getStringArray("preview_adids", new String[0]);
                    l.b(stringArray, "");
                    if (i.a(stringArray, str2)) {
                        return true;
                    }
                }
            } else if (str.equals("cid")) {
                String[] stringArray2 = repo.getStringArray("preview_cids", new String[0]);
                l.b(stringArray2, "");
                if (i.a(stringArray2, str2)) {
                    return true;
                }
            }
        }
        return false;
    }

    @Override // com.ss.android.ugc.aweme.commercialize.preview.service.IAdsPreviewService
    public final boolean a(String str, String str2) {
        List<String> list;
        List<String> list2;
        if (str != null && (list2 = AdsPreviewStateManager.f75031f) != null && list2.contains(str)) {
            return true;
        }
        if (str != null && (((list = AdsPreviewStateManager.f75031f) == null || list.isEmpty()) && b("adid", str))) {
            return true;
        }
        if (str2 != null) {
            List<String> list3 = AdsPreviewStateManager.f75032g;
            if (list3 != null && list3.contains(str2)) {
                return true;
            }
            List<String> list4 = AdsPreviewStateManager.f75032g;
            if ((list4 == null || list4.isEmpty()) && b("cid", str2)) {
                return true;
            }
        }
        return false;
    }

    @Override // com.ss.android.ugc.aweme.commercialize.preview.service.IAdsPreviewService
    public final void a(Context context, ViewGroup viewGroup, com.ss.android.ugc.aweme.commercialize.preview.d.a.a aVar) {
        l.d(context, "");
        l.d(viewGroup, "");
        a.C1707a.a(context, viewGroup, aVar);
    }

    @Override // com.ss.android.ugc.aweme.commercialize.preview.service.IAdsPreviewService
    public final void a(Context context, ViewGroup viewGroup, h.f.a.a<z> aVar, h.f.a.a<z> aVar2) {
        l.d(context, "");
        l.d(viewGroup, "");
        l.d(context, "");
        l.d(viewGroup, "");
        a.C1707a.a(context, viewGroup, null);
        com.bytedance.tux.dialog.a a2 = ((com.bytedance.tux.dialog.b) c.a((com.bytedance.tux.dialog.b) new com.bytedance.tux.dialog.b(context).a(R.string.q3).b(R.string.q2), new a.C1708a(aVar2)).a(false).b(new a.b(aVar))).a();
        com.ss.android.ugc.aweme.commercialize.preview.manager.a.f75045a = a2;
        a2.b().show();
        r.onEventV3("ads_interface_preview_ad_successfully");
    }
}
