package com.kakao.network.storage;

import android.net.Uri;
import com.bytedance.covode.number.Covode;
import com.kakao.common.IConfiguration;
import com.kakao.common.PhaseInfo;
import com.kakao.network.ApiRequest;
import com.kakao.network.ServerProtocol;

public class ImageScrapRequest extends ApiRequest {
    private String imageUrl;
    private Boolean secureResource;

    static {
        Covode.recordClassIndex(34397);
    }

    @Override // com.kakao.network.ApiRequest, com.kakao.network.IRequest
    public String getMethod() {
        return "POST";
    }

    @Override // com.kakao.network.ApiRequest
    public Uri.Builder getUriBuilder() {
        Uri.Builder builder = new Uri.Builder();
        builder.scheme("https");
        builder.authority(ServerProtocol.apiAuthority());
        if (this.secureResource.booleanValue()) {
            builder.appendQueryParameter("secure_resource", String.valueOf(this.secureResource));
        }
        String str = this.imageUrl;
        if (str != null) {
            builder.appendQueryParameter("image_url", str);
        }
        return builder;
    }

    protected ImageScrapRequest(PhaseInfo phaseInfo, IConfiguration iConfiguration, String str, Boolean bool) {
        super(phaseInfo, iConfiguration);
        this.imageUrl = str;
        this.secureResource = bool;
    }
}
