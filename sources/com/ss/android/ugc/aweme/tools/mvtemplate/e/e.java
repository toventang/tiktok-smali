package com.ss.android.ugc.aweme.tools.mvtemplate.e;

import com.bytedance.covode.number.Covode;
import com.ss.android.ugc.aweme.draft.model.c;
import com.ss.android.ugc.aweme.mvtheme.MvNetFileBean;
import com.ss.android.ugc.tools.utils.k;
import java.util.ArrayList;
import java.util.concurrent.Callable;

public final /* synthetic */ class e implements Callable {

    /* renamed from: a  reason: collision with root package name */
    private final c f140826a;

    static {
        Covode.recordClassIndex(91957);
    }

    public e(c cVar) {
        this.f140826a = cVar;
    }

    @Override // java.util.concurrent.Callable
    public final Object call() {
        c cVar = this.f140826a;
        ArrayList<String> arrayList = cVar.W.M.selectMediaList;
        if (!k.a(arrayList)) {
            for (String str : arrayList) {
                com.ss.android.ugc.aweme.video.e.c(str);
            }
        }
        ArrayList<MvNetFileBean> arrayList2 = cVar.W.M.newMaskFileData;
        if (!k.a(arrayList2)) {
            for (MvNetFileBean mvNetFileBean : arrayList2) {
                com.ss.android.ugc.aweme.video.e.c(mvNetFileBean.getFilePath());
            }
        }
        ArrayList<com.ss.android.ugc.aweme.mvtheme.e> arrayList3 = cVar.W.M.sourceItemList;
        if (!k.a(arrayList3)) {
            for (com.ss.android.ugc.aweme.mvtheme.e eVar : arrayList3) {
                com.ss.android.ugc.aweme.video.e.c(eVar.getOriginFilePath());
            }
        }
        com.ss.android.ugc.aweme.video.e.c(cVar.W.M.videoCoverImgPath);
        com.ss.android.ugc.aweme.video.e.c(cVar.W.M.contactVideoPath);
        return null;
    }
}
