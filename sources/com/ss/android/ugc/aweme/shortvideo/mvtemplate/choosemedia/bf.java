package com.ss.android.ugc.aweme.shortvideo.mvtemplate.choosemedia;

import com.bytedance.covode.number.Covode;
import com.ss.android.ugc.aweme.shortvideo.mvtemplate.choosemedia.MvImageChooseAdapter;
import com.ss.android.ugc.tools.utils.q;

final /* synthetic */ class bf implements MvImageChooseAdapter.a {

    /* renamed from: a  reason: collision with root package name */
    private final MvImageChooseAdapter f129058a;

    /* renamed from: b  reason: collision with root package name */
    private final MvImageChooseAdapter.e f129059b;

    static {
        Covode.recordClassIndex(84704);
    }

    bf(MvImageChooseAdapter mvImageChooseAdapter, MvImageChooseAdapter.e eVar) {
        this.f129058a = mvImageChooseAdapter;
        this.f129059b = eVar;
    }

    @Override // com.ss.android.ugc.aweme.shortvideo.mvtemplate.choosemedia.MvImageChooseAdapter.a
    public final void a() {
        MvImageChooseAdapter mvImageChooseAdapter = this.f129058a;
        MvImageChooseAdapter.e eVar = this.f129059b;
        if (mvImageChooseAdapter.f128848d.size() == mvImageChooseAdapter.f128845a) {
            mvImageChooseAdapter.d();
            if (mvImageChooseAdapter.f128851g != null) {
                mvImageChooseAdapter.f128855k = mvImageChooseAdapter.f128851g.a(eVar.f128877i, true);
                mvImageChooseAdapter.f128851g.a(mvImageChooseAdapter.f128848d, MvImageChooseAdapter.b.THUMBNAIL, eVar.f128877i);
            }
        } else if (!mvImageChooseAdapter.f128848d.contains(eVar.f128877i)) {
            mvImageChooseAdapter.f128848d.add(eVar.f128877i);
            if (mvImageChooseAdapter.f128851g != null) {
                mvImageChooseAdapter.f128855k = mvImageChooseAdapter.f128851g.a(eVar.f128877i, true);
                mvImageChooseAdapter.f128851g.a(mvImageChooseAdapter.f128848d, MvImageChooseAdapter.b.THUMBNAIL, eVar.f128877i);
            }
            eVar.f128877i.v = mvImageChooseAdapter.f128855k;
            if (mvImageChooseAdapter.f128848d.size() == mvImageChooseAdapter.f128845a) {
                mvImageChooseAdapter.d();
            }
            q.d("MvImageChooseAdapter notifyImageClick select originIndex " + eVar.f128877i.u + " selectIndex " + eVar.f128877i.v);
            mvImageChooseAdapter.notifyItemChanged(eVar.f128879k, new Object());
        }
    }
}
