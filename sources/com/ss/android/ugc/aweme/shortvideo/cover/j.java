package com.ss.android.ugc.aweme.shortvideo.cover;

import com.bytedance.covode.number.Covode;
import com.ss.android.ugc.aweme.shortvideo.edit.VideoPublishEditModel;
import com.ss.android.ugc.aweme.shortvideo.mvtemplate.a.b;
import com.ss.android.ugc.aweme.shortvideo.mvtemplate.a.c;
import com.ss.android.ugc.aweme.shortvideo.widget.o;

final /* synthetic */ class j implements Runnable {

    /* renamed from: a  reason: collision with root package name */
    private final b f125257a;

    /* renamed from: b  reason: collision with root package name */
    private final VideoPublishEditModel f125258b;

    static {
        Covode.recordClassIndex(82254);
    }

    j(b bVar, VideoPublishEditModel videoPublishEditModel) {
        this.f125257a = bVar;
        this.f125258b = videoPublishEditModel;
    }

    public final void run() {
        b bVar = this.f125257a;
        VideoPublishEditModel videoPublishEditModel = this.f125258b;
        int measuredHeight = bVar.f125230a.getMeasuredHeight();
        int oneThumbWidth = (int) bVar.f125230a.getOneThumbWidth();
        if (bVar.a(videoPublishEditModel)) {
            b bVar2 = new b(oneThumbWidth, measuredHeight);
            bVar.f125230a.setAdapter(bVar2);
            c cVar = new c();
            cVar.f128780b = h.f125255a;
            c a2 = cVar.a(oneThumbWidth, measuredHeight);
            a2.f128790l = bVar.s;
            a2.f128791m = bVar.t;
            a2.a(bVar.getActivity(), bVar.f125241l.a(), 7, new i(bVar2));
            return;
        }
        bVar.f125230a.setAdapter(new o(bVar.f125239j, oneThumbWidth, measuredHeight));
    }
}
