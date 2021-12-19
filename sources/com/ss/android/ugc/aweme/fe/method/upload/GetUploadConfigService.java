package com.ss.android.ugc.aweme.fe.method.upload;

import b.i;
import com.bytedance.covode.number.Covode;
import com.bytedance.ies.ugc.aweme.network.RetrofitFactory;
import com.ss.android.ugc.aweme.fe.method.upload.config.UploadAuthConfig;
import com.ss.android.ugc.aweme.fe.method.upload.response.a;
import h.f.b.l;
import l.b.f;
import l.b.t;

public final class GetUploadConfigService {

    /* renamed from: a  reason: collision with root package name */
    public final UploadConfigService f91322a;

    public interface UploadConfigService {
        static {
            Covode.recordClassIndex(57478);
        }

        @f(a = "common/upload_settings")
        i<UploadAuthConfig> getUploadAuthConfig();

        @f(a = "common/play_url")
        i<a> getUploadPlayUrlResponse(@t(a = "video_id") String str);
    }

    static {
        Covode.recordClassIndex(57477);
    }

    public GetUploadConfigService() {
        Object a2 = RetrofitFactory.a().a("/").a(UploadConfigService.class);
        l.b(a2, "");
        this.f91322a = (UploadConfigService) a2;
    }
}
