package com.ss.android.ugc.aweme.compliance.common.enums;

import com.bytedance.covode.number.Covode;
import h.a.n;
import java.util.List;

public enum ConfigTypeEnum {
    API_DENY("api:deny"),
    API_ALLOW("api:allow"),
    PARAM_REMOVE("param:remove"),
    PARAM_ALLOW("param:allow"),
    PARAM_REPLACE("param:replace");
    
    public static final a Companion = new a((byte) 0);
    private final String type;

    public static final class a {
        static {
            Covode.recordClassIndex(47825);
        }

        private a() {
        }

        public static List<String> a() {
            return n.b(ConfigTypeEnum.API_DENY.getType(), ConfigTypeEnum.API_ALLOW.getType());
        }

        public static List<String> b() {
            return n.b(ConfigTypeEnum.PARAM_REMOVE.getType(), ConfigTypeEnum.PARAM_ALLOW.getType(), ConfigTypeEnum.PARAM_REPLACE.getType());
        }

        public /* synthetic */ a(byte b2) {
            this();
        }
    }

    public final String getType() {
        return this.type;
    }

    static {
        Covode.recordClassIndex(47824);
    }

    private ConfigTypeEnum(String str) {
        this.type = str;
    }
}
