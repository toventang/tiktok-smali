package com.ss.android.ugc.aweme.shortvideo.mvtemplate.choosemedia;

import android.graphics.Bitmap;
import com.bytedance.covode.number.Covode;
import com.ss.android.ugc.aweme.mediachoose.helper.MediaModel;
import com.ss.android.ugc.aweme.shortvideo.mvtemplate.choosemedia.aw;
import com.ss.android.ugc.tools.c.a;
import com.ss.android.ugc.tools.utils.h;

final /* synthetic */ class ax implements h.b {

    /* renamed from: a  reason: collision with root package name */
    private final aw.c f129039a;

    /* renamed from: b  reason: collision with root package name */
    private final MediaModel f129040b;

    static {
        Covode.recordClassIndex(84691);
    }

    ax(aw.c cVar, MediaModel mediaModel) {
        this.f129039a = cVar;
        this.f129040b = mediaModel;
    }

    @Override // com.ss.android.ugc.tools.utils.h.b
    public final void a(Object obj) {
        aw.c cVar = this.f129039a;
        MediaModel mediaModel = this.f129040b;
        if (obj != null && ((Boolean) obj).booleanValue()) {
            int i2 = cVar.f129036b.getLayoutParams().width > 0 ? cVar.f129036b.getLayoutParams().width : -1;
            a.a(cVar.f129036b, h.d(mediaModel.f109390b).toString(), i2, i2, Bitmap.Config.ARGB_4444);
        }
    }
}
