package com.ss.android.ugc.aweme.services;

import android.os.Bundle;
import android.text.TextUtils;
import com.bytedance.covode.number.Covode;
import com.bytedance.scene.j;
import com.bytedance.scene.l;
import com.ss.android.ugc.aweme.shortvideo.mvtemplate.choosemedia.ao;

final class AlbumServiceImpl$openAlbum$delegate$1 implements l {
    final /* synthetic */ ao $scene;

    static {
        Covode.recordClassIndex(79411);
    }

    AlbumServiceImpl$openAlbum$delegate$1(ao aoVar) {
        this.$scene = aoVar;
    }

    @Override // com.bytedance.scene.l
    public final j instantiateScene(ClassLoader classLoader, String str, Bundle bundle) {
        h.f.b.l.d(classLoader, "");
        h.f.b.l.d(str, "");
        if (TextUtils.equals("com.ss.android.ugc.aweme.shortvideo.mvtemplate.choosemedia.ao", str)) {
            return this.$scene;
        }
        return null;
    }
}
