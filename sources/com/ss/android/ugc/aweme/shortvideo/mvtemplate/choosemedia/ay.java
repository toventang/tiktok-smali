package com.ss.android.ugc.aweme.shortvideo.mvtemplate.choosemedia;

import androidx.recyclerview.widget.j;
import com.bytedance.covode.number.Covode;
import f.a.v;
import f.a.w;
import java.util.List;

final /* synthetic */ class ay implements w {

    /* renamed from: a  reason: collision with root package name */
    private final MvImageChooseAdapter f129041a;

    /* renamed from: b  reason: collision with root package name */
    private final List f129042b;

    static {
        Covode.recordClassIndex(84692);
    }

    ay(MvImageChooseAdapter mvImageChooseAdapter, List list) {
        this.f129041a = mvImageChooseAdapter;
        this.f129042b = list;
    }

    @Override // f.a.w
    public final void subscribe(v vVar) {
        MvImageChooseAdapter mvImageChooseAdapter = this.f129041a;
        vVar.a(j.a(new ab(mvImageChooseAdapter.f128857m, this.f129042b), false));
    }
}
