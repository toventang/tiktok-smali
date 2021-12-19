package com.ss.android.ugc.aweme.fe.method.upload;

import b.i;
import com.bytedance.covode.number.Covode;
import com.bytedance.ies.ugc.aweme.network.RetrofitFactory;
import com.ss.android.ugc.aweme.fe.method.upload.config.I18nUploadAuthConfig;
import com.ss.android.ugc.aweme.fe.method.upload.response.I18nUploadResponse;
import h.f.b.l;
import l.b.f;
import l.b.t;

public final class I18nGetUploadConfigService {

    /* renamed from: b  reason: collision with root package name */
    public static final a f91323b = new a((byte) 0);

    /* renamed from: a  reason: collision with root package name */
    public final UploadConfigService f91324a;

    public interface UploadConfigService {
        static {
            Covode.recordClassIndex(57480);
        }

        @f(a = "/aweme/v1/upload/authkey/")
        i<I18nUploadAuthConfig> getUploadAuthConfig();

        @f(a = "/aweme/v1/sign/gain/url/")
        i<I18nUploadResponse> getUploadPlayUrlResponse(@t(a = "video_id") String str, @t(a = "play_source") int i2);
    }

    static {
        Covode.recordClassIndex(57479);
    }

    public static final class a {
        static {
            Covode.recordClassIndex(57481);
        }

        private a() {
        }

        public /* synthetic */ a(byte b2) {
            this();
        }
    }

    public I18nGetUploadConfigService() {
        Object a2 = RetrofitFactory.a().a("https://api-va.tiktokv.com/").a(UploadConfigService.class);
        l.b(a2, "");
        this.f91324a = (UploadConfigService) a2;
    }
}
