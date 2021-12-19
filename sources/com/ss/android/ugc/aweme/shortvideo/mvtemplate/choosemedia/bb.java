package com.ss.android.ugc.aweme.shortvideo.mvtemplate.choosemedia;

import androidx.recyclerview.widget.j;
import com.bytedance.covode.number.Covode;
import java.util.List;

final /* synthetic */ class bb implements Runnable {

    /* renamed from: a  reason: collision with root package name */
    private final MvImageChooseAdapter f129050a;

    /* renamed from: b  reason: collision with root package name */
    private final j.d f129051b;

    /* renamed from: c  reason: collision with root package name */
    private final List f129052c;

    static {
        Covode.recordClassIndex(84700);
    }

    bb(MvImageChooseAdapter mvImageChooseAdapter, j.d dVar, List list) {
        this.f129050a = mvImageChooseAdapter;
        this.f129051b = dVar;
        this.f129052c = list;
    }

    public final void run() {
        this.f129050a.a(this.f129051b, this.f129052c);
    }
}
