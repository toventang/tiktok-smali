package com.ss.android.ugc.aweme.ttep;

import android.os.Bundle;
import android.text.TextUtils;
import com.bytedance.covode.number.Covode;
import com.bytedance.scene.j;
import com.bytedance.scene.l;
import com.ss.android.ugc.aweme.shortvideo.ch;

/* access modifiers changed from: package-private */
public final /* synthetic */ class d implements l {

    /* renamed from: a  reason: collision with root package name */
    private final TTEPEffectPreviewActivity f141332a;

    static {
        Covode.recordClassIndex(92298);
    }

    d(TTEPEffectPreviewActivity tTEPEffectPreviewActivity) {
        this.f141332a = tTEPEffectPreviewActivity;
    }

    @Override // com.bytedance.scene.l
    public final j instantiateScene(ClassLoader classLoader, String str, Bundle bundle) {
        TTEPEffectPreviewActivity tTEPEffectPreviewActivity = this.f141332a;
        if (TextUtils.equals(ch.class.getName(), str)) {
            return tTEPEffectPreviewActivity.s;
        }
        return null;
    }
}
