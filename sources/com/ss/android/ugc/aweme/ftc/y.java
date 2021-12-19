package com.ss.android.ugc.aweme.ftc;

import android.os.Bundle;
import android.text.TextUtils;
import com.bytedance.covode.number.Covode;
import com.bytedance.scene.j;
import com.bytedance.scene.l;

/* access modifiers changed from: package-private */
public final /* synthetic */ class y implements l {

    /* renamed from: a  reason: collision with root package name */
    private final FTCVideoRecordNewActivity f98929a;

    static {
        Covode.recordClassIndex(62899);
    }

    y(FTCVideoRecordNewActivity fTCVideoRecordNewActivity) {
        this.f98929a = fTCVideoRecordNewActivity;
    }

    @Override // com.bytedance.scene.l
    public final j instantiateScene(ClassLoader classLoader, String str, Bundle bundle) {
        FTCVideoRecordNewActivity fTCVideoRecordNewActivity = this.f98929a;
        if (TextUtils.equals(c.class.getName(), str)) {
            return fTCVideoRecordNewActivity.t;
        }
        return null;
    }
}
