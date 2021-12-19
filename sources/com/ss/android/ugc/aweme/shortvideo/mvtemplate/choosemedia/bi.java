package com.ss.android.ugc.aweme.shortvideo.mvtemplate.choosemedia;

import android.app.Activity;
import com.bytedance.covode.number.Covode;
import com.bytedance.tux.g.b;
import com.ss.android.ugc.aweme.mediachoose.helper.MediaModel;
import com.ss.android.ugc.aweme.shortvideo.mvtemplate.choosemedia.MvImageChooseAdapter;
import com.ss.android.ugc.aweme.tux.a.i.a;
import com.ss.android.ugc.tools.utils.h;
import com.zhiliaoapp.musically.R;

/* access modifiers changed from: package-private */
public final /* synthetic */ class bi implements h.b {

    /* renamed from: a  reason: collision with root package name */
    private final MvImageChooseAdapter f129065a;

    /* renamed from: b  reason: collision with root package name */
    private final MvImageChooseAdapter.MyMediaModel f129066b;

    static {
        Covode.recordClassIndex(84707);
    }

    bi(MvImageChooseAdapter mvImageChooseAdapter, MvImageChooseAdapter.MyMediaModel myMediaModel) {
        this.f129065a = mvImageChooseAdapter;
        this.f129066b = myMediaModel;
    }

    @Override // com.ss.android.ugc.tools.utils.h.b
    public final void a(Object obj) {
        MvImageChooseAdapter mvImageChooseAdapter = this.f129065a;
        MvImageChooseAdapter.MyMediaModel myMediaModel = this.f129066b;
        if (obj == null || !((Boolean) obj).booleanValue()) {
            if (myMediaModel.b()) {
                new a(mvImageChooseAdapter.f128847c).a(mvImageChooseAdapter.f128847c.getString(R.string.cd4)).a();
                MvImageChooseAdapter.a((MediaModel) myMediaModel, false);
                return;
            }
            new a(mvImageChooseAdapter.f128847c).a(mvImageChooseAdapter.f128847c.getString(R.string.dq6)).a();
        } else if (mvImageChooseAdapter.f128851g.b()) {
            if (mvImageChooseAdapter.f128847c instanceof Activity) {
                new b((Activity) mvImageChooseAdapter.f128847c).a(mvImageChooseAdapter.f128846b).b();
            } else {
                new a(mvImageChooseAdapter.f128847c).a(mvImageChooseAdapter.f128846b).a();
            }
            if (myMediaModel.b()) {
                MvImageChooseAdapter.a((MediaModel) myMediaModel, false);
            }
        } else if (mvImageChooseAdapter.f128851g.b(myMediaModel) && mvImageChooseAdapter.f128851g.a(myMediaModel)) {
            mvImageChooseAdapter.a(myMediaModel, new bj(mvImageChooseAdapter, myMediaModel));
        }
    }
}
