package com.ss.android.ugc.aweme.services.ttuploader;

import com.bytedance.covode.number.Covode;
import com.ss.android.ugc.aweme.services.upload.ExternalUploadVideoConfig;

public interface IExternalUploaderService {
    static {
        Covode.recordClassIndex(79838);
    }

    void cacheUploadAuthKeyConfig();

    String getSdkV4AuthKey();

    int getUploadBackupNetworkType();

    int getUploadMainNetworkType();

    ExternalUploadVideoConfig getUploadVideoConfig(String str);

    boolean uploaderUpdateEnable();
}
