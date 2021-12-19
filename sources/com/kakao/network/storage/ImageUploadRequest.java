package com.kakao.network.storage;

import android.net.Uri;
import com.bytedance.covode.number.Covode;
import com.kakao.common.IConfiguration;
import com.kakao.common.PhaseInfo;
import com.kakao.network.ApiRequest;
import com.kakao.network.ServerProtocol;
import com.kakao.network.multipart.FilePart;
import com.kakao.network.multipart.Part;
import java.io.File;
import java.util.List;
import java.util.Map;

public class ImageUploadRequest extends ApiRequest {
    private File imageFile;
    private Boolean secureResource;

    static {
        Covode.recordClassIndex(34398);
    }

    @Override // com.kakao.network.ApiRequest, com.kakao.network.IRequest
    public String getMethod() {
        return "POST";
    }

    @Override // com.kakao.network.ApiRequest, com.kakao.network.IRequest
    public Map<String, String> getParams() {
        return super.getParams();
    }

    @Override // com.kakao.network.ApiRequest, com.kakao.network.IRequest
    public List<Part> getMultiPartList() {
        List<Part> multiPartList = super.getMultiPartList();
        File file = this.imageFile;
        if (file != null && file.exists()) {
            multiPartList.add(new FilePart("file", this.imageFile));
        }
        return multiPartList;
    }

    @Override // com.kakao.network.ApiRequest
    public Uri.Builder getUriBuilder() {
        Uri.Builder authority = super.getUriBuilder().authority(ServerProtocol.apiAuthority());
        if (this.secureResource.booleanValue()) {
            authority.appendQueryParameter("secure_resource", String.valueOf(this.secureResource));
        }
        return authority;
    }

    protected ImageUploadRequest(PhaseInfo phaseInfo, IConfiguration iConfiguration, Boolean bool, File file) {
        super(phaseInfo, iConfiguration);
        this.secureResource = bool;
        this.imageFile = file;
    }
}
