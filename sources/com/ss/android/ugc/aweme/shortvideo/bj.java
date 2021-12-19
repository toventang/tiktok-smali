package com.ss.android.ugc.aweme.shortvideo;

import android.os.Bundle;
import com.bytedance.covode.number.Covode;
import com.ss.android.ugc.aweme.initializer.AVServiceProxyImpl;
import com.ss.android.ugc.aweme.services.IAVServiceProxy;
import com.ss.android.ugc.aweme.shortvideo.edit.VideoPublishEditModel;
import com.ss.android.ugc.aweme.shortvideo.j.f;
import com.ss.android.ugc.aweme.shortvideo.publish.d;
import com.ss.android.ugc.aweme.shortvideo.publish.k;
import com.ss.android.ugc.d.a.c;
import com.ss.android.ugc.gamora.editor.lightening.a;
import h.f.b.l;
import java.io.Serializable;

public final class bj extends k {

    /* renamed from: a  reason: collision with root package name */
    private final Bundle f125035a;

    static {
        Covode.recordClassIndex(82143);
    }

    public bj(Bundle bundle) {
        l.d(bundle, "");
        this.f125035a = bundle;
    }

    @Override // com.ss.android.ugc.aweme.shortvideo.publish.k
    public final void onFinish(d dVar, Object obj) {
        l.d(dVar, "");
        if (dVar instanceof d.c) {
            ai aiVar = ((d.c) dVar).f129784a;
            Serializable serializable = this.f125035a.getSerializable("extra_video_publish_args");
            if (!(serializable instanceof VideoPublishEditModel)) {
                serializable = null;
            }
            VideoPublishEditModel videoPublishEditModel = (VideoPublishEditModel) serializable;
            if (videoPublishEditModel != null) {
                IAVServiceProxy createIAVServiceProxybyMonsterPlugin = AVServiceProxyImpl.createIAVServiceProxybyMonsterPlugin(false);
                l.b(createIAVServiceProxybyMonsterPlugin, "");
                createIAVServiceProxybyMonsterPlugin.getVideoCacheService().a(videoPublishEditModel.getOutputFile().toString(), aiVar);
            }
        } else if ((dVar instanceof d.b) && !a.b()) {
            c.a(new f(9));
        }
    }
}
