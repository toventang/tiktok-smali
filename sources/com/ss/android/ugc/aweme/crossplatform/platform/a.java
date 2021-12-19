package com.ss.android.ugc.aweme.crossplatform.platform;

import com.bytedance.apm.b;
import com.bytedance.covode.number.Covode;
import org.json.JSONObject;

public final class a {

    /* renamed from: a  reason: collision with root package name */
    public static final a f78850a = new a();

    private a() {
    }

    static {
        Covode.recordClassIndex(48916);
    }

    public static final void a(String str, boolean z, boolean z2) {
        JSONObject put = new JSONObject().put("jump_url", str).put("jump_has_click", z).put("jump_block_by", "blocked");
        if (z2) {
            put.put("container_type", "bullet");
        }
        b.a("h5_block_app_url", 0, put);
    }

    public static final void b(String str, boolean z, boolean z2) {
        JSONObject put = new JSONObject().put("jump_url", str).put("jump_has_click", z).put("jump_block_by", "apk_download");
        if (z2) {
            put.put("container_type", "bullet");
        }
        b.a("h5_block_app_url", 0, put);
    }

    public static final void c(String str, boolean z, boolean z2) {
        JSONObject put = new JSONObject().put("jump_url", str).put("jump_has_click", z);
        if (z2) {
            put.put("container_type", "bullet");
        }
        b.a("h5_block_app_url", 1, put);
    }
}
