package com.ss.android.ugc.aweme.shortvideo.mvtemplate.choosemedia;

import android.app.Activity;
import com.bytedance.covode.number.Covode;
import com.bytedance.tux.g.b;
import com.ss.android.ugc.aweme.mediachoose.helper.MediaModel;
import com.ss.android.ugc.aweme.shortvideo.mvtemplate.choosemedia.MvImageChooseAdapter;
import com.ss.android.ugc.aweme.tux.a.i.a;
import com.ss.android.ugc.tools.utils.h;
import com.zhiliaoapp.musically.R;

final /* synthetic */ class be implements h.b {

    /* renamed from: a  reason: collision with root package name */
    private final MvImageChooseAdapter f129056a;

    /* renamed from: b  reason: collision with root package name */
    private final MvImageChooseAdapter.e f129057b;

    static {
        Covode.recordClassIndex(84703);
    }

    be(MvImageChooseAdapter mvImageChooseAdapter, MvImageChooseAdapter.e eVar) {
        this.f129056a = mvImageChooseAdapter;
        this.f129057b = eVar;
    }

    @Override // com.ss.android.ugc.tools.utils.h.b
    public final void a(Object obj) {
        MvImageChooseAdapter mvImageChooseAdapter = this.f129056a;
        MvImageChooseAdapter.e eVar = this.f129057b;
        if (obj != null && ((Boolean) obj).booleanValue()) {
            mvImageChooseAdapter.f128851g.a();
            if (mvImageChooseAdapter.f128851g.b()) {
                if (mvImageChooseAdapter.f128847c instanceof Activity) {
                    new b((Activity) mvImageChooseAdapter.f128847c).a(mvImageChooseAdapter.f128846b).b();
                } else {
                    new a(mvImageChooseAdapter.f128847c).a(mvImageChooseAdapter.f128846b).a();
                }
                if (eVar.f128877i.b()) {
                    MvImageChooseAdapter.a((MediaModel) eVar.f128877i, false);
                }
            } else if (mvImageChooseAdapter.f128851g.b(eVar.f128877i) && mvImageChooseAdapter.f128851g.a(eVar.f128877i)) {
                mvImageChooseAdapter.a(eVar.f128877i, new bf(mvImageChooseAdapter, eVar));
            }
        } else if (eVar.f128877i.b()) {
            new a(mvImageChooseAdapter.f128847c).a(mvImageChooseAdapter.f128847c.getString(R.string.cd4)).a();
            MvImageChooseAdapter.a((MediaModel) eVar.f128877i, false);
        } else {
            new a(mvImageChooseAdapter.f128847c).a(mvImageChooseAdapter.f128847c.getString(R.string.dq6)).a();
        }
    }
}
