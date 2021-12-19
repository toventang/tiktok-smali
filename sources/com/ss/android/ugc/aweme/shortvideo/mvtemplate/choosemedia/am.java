package com.ss.android.ugc.aweme.shortvideo.mvtemplate.choosemedia;

import android.view.View;
import com.bytedance.covode.number.Covode;
import com.ss.android.ugc.aweme.mediachoose.helper.MediaModel;
import com.ss.android.ugc.aweme.shortvideo.mvtemplate.choosemedia.MvImageChooseAdapter;
import com.ss.android.ugc.tools.utils.i;

final /* synthetic */ class am implements MvImageChooseAdapter.d {

    /* renamed from: a  reason: collision with root package name */
    private final al f128943a;

    static {
        Covode.recordClassIndex(84611);
    }

    am(al alVar) {
        this.f128943a = alVar;
    }

    @Override // com.ss.android.ugc.aweme.shortvideo.mvtemplate.choosemedia.MvImageChooseAdapter.d
    public final void a(View view, MediaModel mediaModel) {
        al alVar = this.f128943a;
        if (mediaModel != null) {
            i.a(mediaModel.f109390b, new an(alVar, view, mediaModel));
        }
    }
}
