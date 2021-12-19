package com.ss.android.ugc.aweme.fe.method.upload.config;

import com.bytedance.covode.number.Covode;
import com.google.gson.a.c;
import com.ss.android.ugc.aweme.base.api.a;
import com.ss.android.ugc.aweme.base.api.b;
import h.f.b.l;

public final class UploadConfig extends a {
    @b
    @c(a = "appKey")
    private String appKey = "";
    @b
    @c(a = "authorization")
    private String authKey = "";
    @c(a = "authorization2")
    private STSAuthConfig authorizationV2;
    @c(a = "enableHttps")
    private int enableHttps;
    @c(a = "fileRetryCount")
    private int fileRetryCount;
    @b
    @c(a = "imageHostName")
    private String imageHostName = "";
    @c(a = "maxFailTime")
    private int maxFailTime;
    @c(a = "maxFileSize")
    private int maxFileSize;
    @c(a = "sliceRetryCount")
    private int sliceRetryCount;
    @c(a = "sliceSize")
    private int sliceSize;
    @c(a = "sliceTimeout")
    private int sliceTimeout;
    @c(a = "socketNumber")
    private int socketNumber;
    @b
    @c(a = "videoHostName")
    private String videoHostName = "";

    static {
        Covode.recordClassIndex(57503);
    }

    public static final class STSAuthConfig extends a {
        @b
        @c(a = "access_key_id")
        private String accessKeyId;
        @b
        @c(a = "secret_access_key")
        private String secretAccessKey;
        @b
        @c(a = "session_token")
        private String sessionToken;
        @b
        @c(a = "space_name")
        private String spaceName;

        static {
            Covode.recordClassIndex(57504);
        }

        public final String getAccessKeyId() {
            return this.accessKeyId;
        }

        public final String getSecretAccessKey() {
            return this.secretAccessKey;
        }

        public final String getSessionToken() {
            return this.sessionToken;
        }

        public final String getSpaceName() {
            return this.spaceName;
        }

        public final void setAccessKeyId(String str) {
            this.accessKeyId = str;
        }

        public final void setSecretAccessKey(String str) {
            this.secretAccessKey = str;
        }

        public final void setSessionToken(String str) {
            this.sessionToken = str;
        }

        public final void setSpaceName(String str) {
            this.spaceName = str;
        }
    }

    public final String getAppKey() {
        return this.appKey;
    }

    public final String getAuthKey() {
        return this.authKey;
    }

    public final STSAuthConfig getAuthorizationV2() {
        return this.authorizationV2;
    }

    public final int getEnableHttps() {
        return this.enableHttps;
    }

    public final int getFileRetryCount() {
        return this.fileRetryCount;
    }

    public final String getImageHostName() {
        return this.imageHostName;
    }

    public final int getMaxFailTime() {
        return this.maxFailTime;
    }

    public final int getMaxFileSize() {
        return this.maxFileSize;
    }

    public final int getSliceRetryCount() {
        return this.sliceRetryCount;
    }

    public final int getSliceSize() {
        return this.sliceSize;
    }

    public final int getSliceTimeout() {
        return this.sliceTimeout;
    }

    public final int getSocketNumber() {
        return this.socketNumber;
    }

    public final String getVideoHostName() {
        return this.videoHostName;
    }

    public final void setAuthorizationV2(STSAuthConfig sTSAuthConfig) {
        this.authorizationV2 = sTSAuthConfig;
    }

    public final void setEnableHttps(int i2) {
        this.enableHttps = i2;
    }

    public final void setFileRetryCount(int i2) {
        this.fileRetryCount = i2;
    }

    public final void setImageHostName(String str) {
        this.imageHostName = str;
    }

    public final void setMaxFailTime(int i2) {
        this.maxFailTime = i2;
    }

    public final void setMaxFileSize(int i2) {
        this.maxFileSize = i2;
    }

    public final void setSliceRetryCount(int i2) {
        this.sliceRetryCount = i2;
    }

    public final void setSliceSize(int i2) {
        this.sliceSize = i2;
    }

    public final void setSliceTimeout(int i2) {
        this.sliceTimeout = i2;
    }

    public final void setSocketNumber(int i2) {
        this.socketNumber = i2;
    }

    public final void setVideoHostName(String str) {
        this.videoHostName = str;
    }

    public final void setAppKey(String str) {
        l.d(str, "");
        this.appKey = str;
    }

    public final void setAuthKey(String str) {
        l.d(str, "");
        this.authKey = str;
    }
}
