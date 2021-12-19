package com.bytedance.ies.ugc.aweme.network;

import com.bytedance.covode.number.Covode;
import java.util.Map;

public interface IPowerPreload {
    static {
        Covode.recordClassIndex(20986);
    }

    void a(String str, Map<String, String> map);
}
