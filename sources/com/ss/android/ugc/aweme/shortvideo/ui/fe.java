package com.ss.android.ugc.aweme.shortvideo.ui;

import android.os.Bundle;
import android.text.TextUtils;
import com.bytedance.covode.number.Covode;
import com.bytedance.scene.j;
import com.bytedance.scene.l;
import com.ss.android.ugc.aweme.shortvideo.ch;

/* access modifiers changed from: package-private */
public final /* synthetic */ class fe implements l {

    /* renamed from: a  reason: collision with root package name */
    private final VideoRecordNewActivity f131753a;

    static {
        Covode.recordClassIndex(86294);
    }

    fe(VideoRecordNewActivity videoRecordNewActivity) {
        this.f131753a = videoRecordNewActivity;
    }

    @Override // com.bytedance.scene.l
    public final j instantiateScene(ClassLoader classLoader, String str, Bundle bundle) {
        VideoRecordNewActivity videoRecordNewActivity = this.f131753a;
        if (TextUtils.equals(ch.class.getName(), str)) {
            return videoRecordNewActivity.u;
        }
        return null;
    }
}
