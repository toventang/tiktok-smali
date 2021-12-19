package com.kakao.network.storage;

import android.net.Uri;
import com.bytedance.covode.number.Covode;
import com.bytedance.d.a.a.a.a.a;
import com.kakao.common.IConfiguration;
import com.kakao.common.PhaseInfo;
import com.kakao.network.ApiRequest;
import com.kakao.network.ServerProtocol;

public class ImageDeleteRequest extends ApiRequest {
    protected final String IMAGE_TOKEN = "image_token";
    protected final String IMAGE_URL = "image_url";
    private String imageToken;
    private String imageUrl;

    static {
        Covode.recordClassIndex(34391);
    }

    @Override // com.kakao.network.ApiRequest, com.kakao.network.IRequest
    public String getMethod() {
        return a.f28514d;
    }

    @Override // com.kakao.network.ApiRequest
    public Uri.Builder getUriBuilder() {
        Uri.Builder builder = new Uri.Builder();
        builder.scheme("https");
        builder.authority(ServerProtocol.apiAuthority());
        String str = this.imageUrl;
        if (str != null) {
            builder.appendQueryParameter("image_url", str);
        }
        String str2 = this.imageToken;
        if (str2 != null) {
            builder.appendQueryParameter("image_token", str2);
        }
        return builder;
    }

    public ImageDeleteRequest(PhaseInfo phaseInfo, IConfiguration iConfiguration, String str, String str2) {
        super(phaseInfo, iConfiguration);
        this.imageUrl = str;
        this.imageToken = str2;
    }
}
