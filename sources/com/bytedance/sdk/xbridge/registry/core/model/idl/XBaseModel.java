package com.bytedance.sdk.xbridge.registry.core.model.idl;

import com.bytedance.covode.number.Covode;
import h.a.ag;
import java.util.Map;
import org.json.JSONObject;

public interface XBaseModel {
    static {
        Covode.recordClassIndex(26913);
    }

    Map<String, Object> convert();

    JSONObject toJSON();

    public static final class a implements XBaseModel {
        static {
            Covode.recordClassIndex(26914);
        }

        @Override // com.bytedance.sdk.xbridge.registry.core.model.idl.XBaseModel
        public final Map<String, Object> convert() {
            return ag.a();
        }

        @Override // com.bytedance.sdk.xbridge.registry.core.model.idl.XBaseModel
        public final JSONObject toJSON() {
            return new JSONObject();
        }
    }
}
