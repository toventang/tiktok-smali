package com.bytedance.bdturing.d;

import com.bytedance.covode.number.Covode;
import java.util.Map;

public interface a {
    static {
        Covode.recordClassIndex(15555);
    }

    byte[] get(String str, Map<String, String> map);

    byte[] post(String str, Map<String, String> map, byte[] bArr);
}
