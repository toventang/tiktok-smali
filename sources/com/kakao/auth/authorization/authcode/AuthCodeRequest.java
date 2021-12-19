package com.kakao.auth.authorization.authcode;

import android.net.Uri;
import com.bytedance.covode.number.Covode;
import com.kakao.auth.AuthCodeCallback;
import com.kakao.auth.network.request.AuthRequest;

class AuthCodeRequest extends AuthRequest {
    private Uri accountUri;
    private final AuthCodeCallback callback;
    private Integer requestCode;

    static {
        Covode.recordClassIndex(34286);
    }

    public Uri getAccountUri() {
        return this.accountUri;
    }

    public AuthCodeCallback getCallback() {
        return this.callback;
    }

    public Integer getRequestCode() {
        return this.requestCode;
    }

    public void setAccountUri(Uri uri) {
        this.accountUri = uri;
    }

    public AuthCodeRequest(String str, String str2, Integer num, AuthCodeCallback authCodeCallback) {
        super(str, str2);
        this.callback = authCodeCallback;
        this.requestCode = num;
    }
}
