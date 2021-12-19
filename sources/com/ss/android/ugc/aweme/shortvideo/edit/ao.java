package com.ss.android.ugc.aweme.shortvideo.edit;

import android.os.Bundle;
import android.text.TextUtils;
import com.bytedance.covode.number.Covode;
import com.bytedance.scene.j;
import com.bytedance.scene.l;

final /* synthetic */ class ao implements l {

    /* renamed from: a  reason: collision with root package name */
    private final VEVideoPublishEditActivity f126745a;

    /* renamed from: b  reason: collision with root package name */
    private final Class f126746b;

    static {
        Covode.recordClassIndex(83151);
    }

    ao(VEVideoPublishEditActivity vEVideoPublishEditActivity, Class cls) {
        this.f126745a = vEVideoPublishEditActivity;
        this.f126746b = cls;
    }

    @Override // com.bytedance.scene.l
    public final j instantiateScene(ClassLoader classLoader, String str, Bundle bundle) {
        VEVideoPublishEditActivity vEVideoPublishEditActivity = this.f126745a;
        if (TextUtils.equals(this.f126746b.getName(), str)) {
            return vEVideoPublishEditActivity.u;
        }
        return null;
    }
}
