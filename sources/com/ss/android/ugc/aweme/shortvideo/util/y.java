package com.ss.android.ugc.aweme.shortvideo.util;

import android.text.TextUtils;
import com.bytedance.covode.number.Covode;
import com.bytedance.frameworks.apm.trace.MethodCollector;
import com.google.gson.b.a;
import com.google.gson.f;
import com.ss.android.ugc.aweme.app.s;
import com.ss.android.ugc.aweme.services.BaseUserService;
import com.ss.android.ugc.aweme.shortvideo.model.BusinessGoodsPublishModel;
import com.ss.android.ugc.aweme.shortvideo.model.BusinessGoodsPublishSetting;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public final class y {

    /* renamed from: a  reason: collision with root package name */
    public static BusinessGoodsPublishSetting f132385a;

    static {
        Covode.recordClassIndex(86684);
    }

    public static List<BusinessGoodsPublishSetting> a() {
        String c2 = s.a.f66880a.e().c();
        if (!TextUtils.isEmpty(c2)) {
            return (List) new f().a(c2, new a<List<BusinessGoodsPublishSetting>>() {
                /* class com.ss.android.ugc.aweme.shortvideo.util.y.AnonymousClass1 */

                static {
                    Covode.recordClassIndex(86685);
                }
            }.type);
        }
        return new ArrayList();
    }

    public static synchronized BusinessGoodsPublishSetting b() {
        BusinessGoodsPublishSetting businessGoodsPublishSetting;
        synchronized (y.class) {
            MethodCollector.i(5209);
            if (f132385a == null) {
                Iterator<BusinessGoodsPublishSetting> it = a().iterator();
                while (true) {
                    if (!it.hasNext()) {
                        break;
                    }
                    BusinessGoodsPublishSetting next = it.next();
                    try {
                        if (BaseUserService.createIUserServicebyMonsterPlugin(false).getCurrentUserID().equals(next.getUserId())) {
                            f132385a = next;
                            break;
                        }
                    } catch (Exception e2) {
                        e2.printStackTrace();
                    }
                }
            }
            businessGoodsPublishSetting = f132385a;
            MethodCollector.o(5209);
        }
        return businessGoodsPublishSetting;
    }

    public static void a(String str) {
        BusinessGoodsPublishSetting b2;
        List<BusinessGoodsPublishModel> goodsPublishModels;
        if (!TextUtils.isEmpty(str) && (b2 = b()) != null && (goodsPublishModels = b2.getGoodsPublishModels()) != null && goodsPublishModels.size() != 0) {
            Iterator<BusinessGoodsPublishModel> it = goodsPublishModels.iterator();
            while (true) {
                if (it.hasNext()) {
                    BusinessGoodsPublishModel next = it.next();
                    if (next != null && TextUtils.equals(str, next.videoPath)) {
                        goodsPublishModels.remove(next);
                        break;
                    }
                } else {
                    break;
                }
            }
            b2.setGoodsPublishModels(goodsPublishModels);
            List<BusinessGoodsPublishSetting> a2 = a();
            a2.remove(b2);
            a2.add(b2);
            s.a.f66880a.e().b(new f().b(a2));
        }
    }
}
