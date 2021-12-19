package com.ss.android.ugc.aweme.publish.f;

import com.bytedance.covode.number.Covode;
import com.ss.android.ugc.aweme.base.api.a;
import com.ss.android.ugc.aweme.base.api.b;

public final class c extends a {
    @b
    @com.google.gson.a.c(a = "access_key_id")

    /* renamed from: a  reason: collision with root package name */
    public String f118718a;
    @b
    @com.google.gson.a.c(a = "secret_access_key")

    /* renamed from: b  reason: collision with root package name */
    public String f118719b;
    @b
    @com.google.gson.a.c(a = "session_token")

    /* renamed from: c  reason: collision with root package name */
    public String f118720c;
    @b
    @com.google.gson.a.c(a = "space_name")

    /* renamed from: d  reason: collision with root package name */
    public String f118721d;

    static {
        Covode.recordClassIndex(77134);
    }

    public final String toString() {
        return "STSAuthConfig{accessKeyId='" + this.f118718a + '\'' + ", secretAccessKey='" + this.f118719b + '\'' + ", sessionToken='" + this.f118720c + '\'' + ", spaceName='" + this.f118721d + '\'' + '}';
    }
}
