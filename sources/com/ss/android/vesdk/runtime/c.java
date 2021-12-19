package com.ss.android.vesdk.runtime;

import android.text.TextUtils;
import com.bytedance.covode.number.Covode;
import com.ss.android.vesdk.runtime.a.a;

public final class c {

    /* renamed from: a  reason: collision with root package name */
    public String f151438a;

    /* renamed from: b  reason: collision with root package name */
    private String f151439b;

    static {
        Covode.recordClassIndex(99577);
    }

    public final String a() {
        if (TextUtils.isEmpty(this.f151439b)) {
            this.f151439b = (String) a.EnumC4060a.INSTANCE.mInstance.a("vesdk_models_dir_sp_key", "");
        }
        return this.f151439b;
    }
}
