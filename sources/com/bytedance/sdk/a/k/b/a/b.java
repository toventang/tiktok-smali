package com.bytedance.sdk.a.k.b.a;

import android.content.Context;
import android.text.TextUtils;
import com.bytedance.covode.number.Covode;
import com.bytedance.sdk.a.k.c.d;
import com.bytedance.sdk.a.k.c.e;

public final class b implements e<com.bytedance.sdk.a.k.a.b> {

    /* renamed from: a  reason: collision with root package name */
    private String f43383a;

    /* renamed from: b  reason: collision with root package name */
    private String f43384b;

    /* renamed from: c  reason: collision with root package name */
    private String f43385c;

    /* renamed from: d  reason: collision with root package name */
    private String f43386d;

    static {
        Covode.recordClassIndex(26583);
    }

    @Override // com.bytedance.sdk.a.k.c.e
    public final void a(Context context) {
        a aVar;
        if (context == null) {
            aVar = null;
        } else if (TextUtils.isEmpty(this.f43383a) || TextUtils.isEmpty(this.f43384b)) {
            aVar = new a(this.f43385c, this.f43386d);
        } else {
            aVar = new a(this.f43383a, this.f43384b, this.f43386d);
        }
        d.a(com.bytedance.sdk.a.k.a.b.class, aVar);
    }

    public b(String str, String str2, String str3) {
        this.f43383a = str;
        this.f43384b = str2;
        this.f43386d = str3;
    }
}
