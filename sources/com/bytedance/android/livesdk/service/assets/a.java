package com.bytedance.android.livesdk.service.assets;

import android.text.TextUtils;
import com.bytedance.android.livesdk.gift.assets.AssetsModel;
import com.bytedance.android.livesdk.gift.assets.c;
import com.bytedance.covode.number.Covode;
import java.util.List;

public final class a {
    static {
        Covode.recordClassIndex(12540);
    }

    private static boolean a(AssetsModel assetsModel) {
        c resourceModel;
        List<String> list;
        if (assetsModel == null || TextUtils.isEmpty(assetsModel.getMD5()) || (resourceModel = assetsModel.getResourceModel()) == null || (list = resourceModel.f17833b) == null || list.isEmpty()) {
            return false;
        }
        return true;
    }

    public static com.ss.ugc.live.a.a.c a(AssetsModel assetsModel, int i2) {
        if (!a(assetsModel)) {
            return null;
        }
        c resourceModel = assetsModel.getResourceModel();
        String[] strArr = new String[resourceModel.f17833b.size()];
        resourceModel.f17833b.toArray(strArr);
        return new com.ss.ugc.live.a.a.c(resourceModel.f17832a, assetsModel.getId(), strArr, assetsModel.getMD5(), (long) i2);
    }
}
