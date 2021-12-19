package com.ss.android.ugc.aweme.detail.api;

import com.bytedance.covode.number.Covode;
import com.bytedance.retrofit2.b;
import com.bytedance.retrofit2.b.h;
import com.bytedance.retrofit2.b.z;

public final class CheckDuetReactPermissionApi {

    /* renamed from: a  reason: collision with root package name */
    public static final String f79605a = "https://api-va.tiktokv.com";

    /* renamed from: b  reason: collision with root package name */
    public static final a f79606b = new a((byte) 0);

    public interface CheckDuetReactPermissionRequest {
        static {
            Covode.recordClassIndex(49449);
        }

        @h(a = "/aweme/v1/permission/check/")
        b<com.ss.android.ugc.aweme.shortvideo.duet.b> checkDuetReactPermission(@z(a = "aweme_id") String str, @z(a = "check_type") int i2);
    }

    public static final class a {
        static {
            Covode.recordClassIndex(49450);
        }

        private a() {
        }

        public /* synthetic */ a(byte b2) {
            this();
        }
    }

    static {
        Covode.recordClassIndex(49448);
    }
}
