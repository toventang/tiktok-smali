package com.ss.android.ugc.aweme.publish.f;

import com.bytedance.covode.number.Covode;
import com.google.gson.a.c;
import com.ss.android.ugc.aweme.base.api.BaseResponse;

public class h extends BaseResponse {

    /* renamed from: e  reason: collision with root package name */
    public String f118763e;

    /* renamed from: f  reason: collision with root package name */
    public int f118764f;

    /* renamed from: g  reason: collision with root package name */
    public int f118765g;

    /* renamed from: h  reason: collision with root package name */
    public String f118766h;
    @c(a = "material_id")

    /* renamed from: i  reason: collision with root package name */
    public String f118767i;

    static {
        Covode.recordClassIndex(77139);
    }

    @Override // com.ss.android.ugc.aweme.base.api.BaseResponse
    public String toString() {
        return "VideoCreation{mCoverUri='" + this.f118763e + '\'' + ", videoWidth=" + this.f118764f + ", videoHeight=" + this.f118765g + ", mCoverTextImageUri='" + this.f118766h + '\'' + ", materialId='" + this.f118767i + '\'' + ", status_code=" + this.status_code + ", error_code=" + this.error_code + ", message='" + this.message + '\'' + ", status_msg='" + this.status_msg + '\'' + ", prompts='" + this.prompts + '\'' + ", extra=" + this.extra + '}';
    }
}
