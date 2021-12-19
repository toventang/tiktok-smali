package com.ss.android.ugc.effectmanager.effect.model.net;

import com.bytedance.covode.number.Covode;
import com.ss.android.ugc.effectmanager.common.model.BaseNetResponse;
import com.ss.android.ugc.effectmanager.effect.model.PlatformEffect;
import java.util.List;

public class ScanQRCodeResponse extends BaseNetResponse {
    public DataNode data;

    public static class DataNode {
        public PlatformEffect effect;
        public List<String> url_prefix;

        static {
            Covode.recordClassIndex(95436);
        }
    }

    static {
        Covode.recordClassIndex(95435);
    }

    @Override // com.ss.android.ugc.effectmanager.common.model.BaseNetResponse
    public boolean checkValue() {
        if (this.data != null) {
            return true;
        }
        return false;
    }
}
