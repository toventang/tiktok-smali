package com.kakao.network.response;

import com.bytedance.covode.number.Covode;

public class JSONObjectResponse {
    private ResponseBody body;

    static {
        Covode.recordClassIndex(34381);
    }

    public JSONObjectResponse() {
    }

    /* access modifiers changed from: protected */
    public ResponseBody getBody() {
        return this.body;
    }

    public JSONObjectResponse(String str) {
        this.body = new ResponseBody(str);
    }
}
