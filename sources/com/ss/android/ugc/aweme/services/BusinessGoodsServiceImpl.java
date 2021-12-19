package com.ss.android.ugc.aweme.services;

import android.text.TextUtils;
import com.bytedance.covode.number.Covode;
import com.bytedance.frameworks.apm.trace.MethodCollector;
import com.bytedance.ies.bullet.c.c.a.k;
import com.bytedance.ies.bullet.c.e.a.b;
import com.google.gson.f;
import com.ss.android.ugc.aweme.app.s;
import com.ss.android.ugc.aweme.bullet.module.p001default.a;
import com.ss.android.ugc.aweme.shortvideo.model.BusinessGoodsPublishModel;
import com.ss.android.ugc.aweme.shortvideo.model.BusinessGoodsPublishSetting;
import com.ss.android.ugc.aweme.shortvideo.util.y;
import h.f.b.l;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public final class BusinessGoodsServiceImpl implements IBusinessGoodsService {
    static {
        Covode.recordClassIndex(79439);
    }

    @Override // com.ss.android.ugc.aweme.services.IBusinessGoodsService
    public final void clearCache() {
        y.f132385a = null;
    }

    @Override // com.ss.android.ugc.aweme.services.IBusinessGoodsService
    public final List<k> createBridges(b bVar) {
        l.d(bVar, "");
        return a.a(bVar);
    }

    @Override // com.ss.android.ugc.aweme.services.IBusinessGoodsService
    public final void removeUserSetting(String str) {
        l.d(str, "");
        y.a(str);
    }

    public static IBusinessGoodsService createIBusinessGoodsServicebyMonsterPlugin(boolean z) {
        MethodCollector.i(3044);
        Object a2 = com.ss.android.ugc.b.a(IBusinessGoodsService.class, z);
        if (a2 != null) {
            IBusinessGoodsService iBusinessGoodsService = (IBusinessGoodsService) a2;
            MethodCollector.o(3044);
            return iBusinessGoodsService;
        }
        if (com.ss.android.ugc.b.dq == null) {
            synchronized (IBusinessGoodsService.class) {
                try {
                    if (com.ss.android.ugc.b.dq == null) {
                        com.ss.android.ugc.b.dq = new BusinessGoodsServiceImpl();
                    }
                } catch (Throwable th) {
                    MethodCollector.o(3044);
                    throw th;
                }
            }
        }
        BusinessGoodsServiceImpl businessGoodsServiceImpl = (BusinessGoodsServiceImpl) com.ss.android.ugc.b.dq;
        MethodCollector.o(3044);
        return businessGoodsServiceImpl;
    }

    @Override // com.ss.android.ugc.aweme.services.IBusinessGoodsService
    public final BusinessGoodsPublishModel getCurBusinessDraftModel(String str) {
        BusinessGoodsPublishModel businessGoodsPublishModel;
        l.d(str, "");
        if (y.b() != null) {
            Iterator<BusinessGoodsPublishModel> it = y.f132385a.getGoodsPublishModels().iterator();
            while (true) {
                if (!it.hasNext()) {
                    break;
                }
                businessGoodsPublishModel = it.next();
                if (businessGoodsPublishModel != null && TextUtils.equals(str, businessGoodsPublishModel.videoPath)) {
                    break;
                }
            }
            l.b(businessGoodsPublishModel, "");
            return businessGoodsPublishModel;
        }
        businessGoodsPublishModel = null;
        l.b(businessGoodsPublishModel, "");
        return businessGoodsPublishModel;
    }

    @Override // com.ss.android.ugc.aweme.services.IBusinessGoodsService
    public final void saveBusinessGoodsInfo(BusinessGoodsPublishModel businessGoodsPublishModel) {
        l.d(businessGoodsPublishModel, "");
        BusinessGoodsPublishSetting b2 = y.b();
        if (b2 == null) {
            b2 = new BusinessGoodsPublishSetting();
            b2.setUserId(BaseUserService.createIUserServicebyMonsterPlugin(false).getCurrentUserID());
        }
        List<BusinessGoodsPublishModel> goodsPublishModels = b2.getGoodsPublishModels();
        if (goodsPublishModels == null) {
            goodsPublishModels = new ArrayList<>();
        } else {
            goodsPublishModels.remove(businessGoodsPublishModel);
        }
        if (businessGoodsPublishModel != null) {
            goodsPublishModels.add(businessGoodsPublishModel);
        }
        b2.setGoodsPublishModels(goodsPublishModels);
        List<BusinessGoodsPublishSetting> a2 = y.a();
        a2.remove(b2);
        a2.add(b2);
        s.a.f66880a.e().b(new f().b(a2));
        y.f132385a = b2;
    }
}
