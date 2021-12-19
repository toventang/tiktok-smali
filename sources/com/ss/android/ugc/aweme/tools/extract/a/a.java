package com.ss.android.ugc.aweme.tools.extract.a;

import com.bytedance.covode.number.Covode;
import com.ss.android.ugc.aweme.shortvideo.edit.VideoPublishEditModel;
import com.ss.android.ugc.aweme.tools.extract.ab;
import h.f.b.l;
import h.p;
import h.v;
import java.util.List;

public final class a implements e {

    /* renamed from: a  reason: collision with root package name */
    public static final a f139987a = new a();

    private a() {
    }

    static {
        Covode.recordClassIndex(91481);
    }

    @Override // com.ss.android.ugc.aweme.tools.extract.a.e
    public final p<Integer, String> a(VideoPublishEditModel videoPublishEditModel, int i2) {
        int i3;
        List<Integer> photoDurationList;
        l.d(videoPublishEditModel, "");
        j jVar = ab.f140003a;
        if (jVar == null || (photoDurationList = jVar.getPhotoDurationList()) == null) {
            i3 = 1;
        } else {
            i3 = photoDurationList.size();
        }
        if (i2 != i3) {
            return v.a(20, "CanvasChecker: frame count:" + i2 + ", expect size:" + i3);
        }
        return v.a(-1, "");
    }
}
