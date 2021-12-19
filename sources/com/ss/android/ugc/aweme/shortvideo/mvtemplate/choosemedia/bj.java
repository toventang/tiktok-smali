package com.ss.android.ugc.aweme.shortvideo.mvtemplate.choosemedia;

import com.bytedance.covode.number.Covode;
import com.ss.android.ugc.aweme.shortvideo.mvtemplate.choosemedia.MvImageChooseAdapter;
import com.ss.android.ugc.tools.utils.q;

final /* synthetic */ class bj implements MvImageChooseAdapter.a {

    /* renamed from: a  reason: collision with root package name */
    private final MvImageChooseAdapter f129067a;

    /* renamed from: b  reason: collision with root package name */
    private final MvImageChooseAdapter.MyMediaModel f129068b;

    static {
        Covode.recordClassIndex(84708);
    }

    bj(MvImageChooseAdapter mvImageChooseAdapter, MvImageChooseAdapter.MyMediaModel myMediaModel) {
        this.f129067a = mvImageChooseAdapter;
        this.f129068b = myMediaModel;
    }

    @Override // com.ss.android.ugc.aweme.shortvideo.mvtemplate.choosemedia.MvImageChooseAdapter.a
    public final void a() {
        MvImageChooseAdapter mvImageChooseAdapter = this.f129067a;
        MvImageChooseAdapter.MyMediaModel myMediaModel = this.f129068b;
        q.d("MvImageChooseAdapter notifyMediaClick select originIndex " + myMediaModel.u + " selectIndex " + myMediaModel.v);
        if (mvImageChooseAdapter.f128848d.size() == mvImageChooseAdapter.f128845a) {
            mvImageChooseAdapter.notifyDataSetChanged();
            if (mvImageChooseAdapter.f128851g != null) {
                mvImageChooseAdapter.f128855k = mvImageChooseAdapter.f128851g.a(myMediaModel, true);
                mvImageChooseAdapter.f128851g.a(mvImageChooseAdapter.f128848d, MvImageChooseAdapter.b.PREVIEW, myMediaModel);
                return;
            }
            return;
        }
        mvImageChooseAdapter.f128848d.add(myMediaModel);
        if (mvImageChooseAdapter.f128851g != null) {
            mvImageChooseAdapter.f128855k = mvImageChooseAdapter.f128851g.a(myMediaModel, true);
            mvImageChooseAdapter.f128851g.a(mvImageChooseAdapter.f128848d, MvImageChooseAdapter.b.PREVIEW, myMediaModel);
        }
        myMediaModel.v = mvImageChooseAdapter.f128855k;
        if (mvImageChooseAdapter.f128848d.size() == mvImageChooseAdapter.f128845a) {
            mvImageChooseAdapter.notifyDataSetChanged();
        } else {
            mvImageChooseAdapter.e();
        }
    }
}
