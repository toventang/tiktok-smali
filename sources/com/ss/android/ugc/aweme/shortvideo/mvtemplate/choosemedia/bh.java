package com.ss.android.ugc.aweme.shortvideo.mvtemplate.choosemedia;

import com.bytedance.covode.number.Covode;
import com.ss.android.ugc.aweme.mediachoose.f;
import com.ss.android.ugc.aweme.mediachoose.helper.MediaModel;
import h.f.a.b;

final /* synthetic */ class bh implements b {

    /* renamed from: a  reason: collision with root package name */
    private final MvImageChooseAdapter f129063a;

    /* renamed from: b  reason: collision with root package name */
    private final MediaModel f129064b;

    static {
        Covode.recordClassIndex(84706);
    }

    bh(MvImageChooseAdapter mvImageChooseAdapter, MediaModel mediaModel) {
        this.f129063a = mvImageChooseAdapter;
        this.f129064b = mediaModel;
    }

    @Override // h.f.a.b
    public final Object invoke(Object obj) {
        return this.f129063a.a(this.f129064b, (f) obj);
    }
}
