package com.ss.android.ugc.aweme.shortvideo.mvtemplate.choosemedia;

import android.os.Looper;
import androidx.recyclerview.widget.j;
import com.bytedance.covode.number.Covode;
import com.ss.android.ugc.aweme.shortvideo.mvtemplate.choosemedia.MvImageChooseAdapter;
import com.ss.android.ugc.aweme.utils.hz;
import f.a.d.f;
import java.util.List;

final /* synthetic */ class az implements f {

    /* renamed from: a  reason: collision with root package name */
    private final MvImageChooseAdapter f129043a;

    /* renamed from: b  reason: collision with root package name */
    private final List f129044b;

    static {
        Covode.recordClassIndex(84693);
    }

    az(MvImageChooseAdapter mvImageChooseAdapter, List list) {
        this.f129043a = mvImageChooseAdapter;
        this.f129044b = list;
    }

    @Override // f.a.d.f
    public final void accept(Object obj) {
        MvImageChooseAdapter mvImageChooseAdapter = this.f129043a;
        List<MvImageChooseAdapter.MyMediaModel> list = this.f129044b;
        j.d dVar = (j.d) obj;
        if (Looper.getMainLooper().getThread() == Thread.currentThread()) {
            mvImageChooseAdapter.a(dVar, list);
        } else {
            hz.a(new bb(mvImageChooseAdapter, dVar, list));
        }
    }
}
