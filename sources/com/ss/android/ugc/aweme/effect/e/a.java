package com.ss.android.ugc.aweme.effect.e;

import android.graphics.Bitmap;
import androidx.fragment.app.e;
import androidx.lifecycle.LiveData;
import androidx.lifecycle.t;
import com.bytedance.covode.number.Covode;
import com.ss.android.ugc.asve.editor.g;
import com.ss.android.ugc.aweme.effect.EffectPointModel;
import com.ss.android.ugc.aweme.services.video.VEVolumeChangeOp;
import com.ss.android.ugc.aweme.shortvideo.edit.VideoPublishEditModel;
import dmt.av.video.k;
import dmt.av.video.p;
import dmt.av.video.u;
import dmt.av.video.w;
import java.util.ArrayList;

public interface a {
    static {
        Covode.recordClassIndex(55935);
    }

    e a();

    void a(VEVolumeChangeOp vEVolumeChangeOp);

    VideoPublishEditModel b();

    t<Boolean> c();

    t<Bitmap> d();

    LiveData<g> e();

    t<Boolean> f();

    ArrayList<EffectPointModel> g();

    dmt.av.video.g<p> h();

    t<dmt.av.video.t> i();

    LiveData<Boolean> j();

    t<u> k();

    k<w> l();

    LiveData<w> m();
}
