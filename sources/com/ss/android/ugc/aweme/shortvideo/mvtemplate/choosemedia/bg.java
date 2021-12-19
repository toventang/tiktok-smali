package com.ss.android.ugc.aweme.shortvideo.mvtemplate.choosemedia;

import com.bytedance.covode.number.Covode;
import com.ss.android.ugc.aweme.mediachoose.f;
import com.ss.android.ugc.aweme.mediachoose.helper.MediaModel;
import com.ss.android.ugc.aweme.shortvideo.mvtemplate.choosemedia.MvImageChooseAdapter;
import h.f.a.b;

final /* synthetic */ class bg implements b {

    /* renamed from: a  reason: collision with root package name */
    private final MvImageChooseAdapter f129060a;

    /* renamed from: b  reason: collision with root package name */
    private final MvImageChooseAdapter.a f129061b;

    /* renamed from: c  reason: collision with root package name */
    private final MediaModel f129062c;

    static {
        Covode.recordClassIndex(84705);
    }

    bg(MvImageChooseAdapter mvImageChooseAdapter, MvImageChooseAdapter.a aVar, MediaModel mediaModel) {
        this.f129060a = mvImageChooseAdapter;
        this.f129061b = aVar;
        this.f129062c = mediaModel;
    }

    @Override // h.f.a.b
    public final Object invoke(Object obj) {
        return MvImageChooseAdapter.a(this.f129061b, this.f129062c, (f) obj);
    }
}
