package com.ss.android.ugc.aweme.publish.f;

import com.bytedance.covode.number.Covode;
import com.google.gson.a.c;
import com.ss.android.ugc.aweme.base.api.b;

public class d extends h {
    @b
    @c(a = "video_config")

    /* renamed from: a  reason: collision with root package name */
    public g f118722a;
    @c(a = "settings_config")

    /* renamed from: b  reason: collision with root package name */
    public f f118723b;
    @c(a = "img_config")

    /* renamed from: c  reason: collision with root package name */
    public e f118724c;
    @c(a = "vframe_config")

    /* renamed from: d  reason: collision with root package name */
    public e f118725d;

    static {
        Covode.recordClassIndex(77135);
    }

    @Override // com.ss.android.ugc.aweme.publish.f.h, com.ss.android.ugc.aweme.base.api.BaseResponse
    public String toString() {
        return "UploadAuthKeyConfig{videoConfig=" + this.f118722a + ", uploadSettingConfig=" + this.f118723b + ", imgConfig=" + this.f118724c + ", frameUploadConfig=" + this.f118725d + '}';
    }
}
