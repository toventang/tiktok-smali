package com.bytedance.android.livesdk.verify.model;

import com.bytedance.covode.number.Covode;

public class ZhimaStatusResponse {
    public String cert_id;
    public int certification_step;
    public boolean is_verified;
    public String real_name;

    static {
        Covode.recordClassIndex(13219);
    }
}
