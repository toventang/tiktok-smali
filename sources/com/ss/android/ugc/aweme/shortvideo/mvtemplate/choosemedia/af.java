package com.ss.android.ugc.aweme.shortvideo.mvtemplate.choosemedia;

import android.text.TextUtils;
import com.bytedance.covode.number.Covode;
import com.ss.android.ugc.aweme.mediachoose.d;
import com.ss.android.ugc.aweme.mediachoose.e;
import com.ss.android.ugc.aweme.mediachoose.helper.MediaModel;
import com.ss.android.ugc.aweme.shortvideo.mvtemplate.choosemedia.MvImageChooseAdapter;
import com.ss.android.ugc.tools.utils.q;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

final /* synthetic */ class af implements e {

    /* renamed from: a  reason: collision with root package name */
    private final ae f128914a;

    static {
        Covode.recordClassIndex(84591);
    }

    af(ae aeVar) {
        this.f128914a = aeVar;
    }

    @Override // com.ss.android.ugc.aweme.mediachoose.e
    public final void a(boolean z, int i2, List list, d dVar) {
        ae aeVar = this.f128914a;
        q.a("MvChooseAlbumFragment", "onMediaPageLoadedCallback, success = " + z + " loadType = " + i2 + " hasMoreImage = " + aeVar.f128907h + " hasMoreVideo = " + aeVar.f128908i);
        if (i2 == 4) {
            if (!aeVar.f128908i || !z || list == null) {
                aeVar.f128908i = false;
                q.a("MvChooseAlbumFragment", "onMediaPageLoadedCallback, set hasMoreVideo = false and return");
                return;
            } else if (list.size() == 0 && dVar != d.a.f109380a) {
                aeVar.f128908i = false;
            }
        } else if (!aeVar.f128907h || !z || list == null) {
            aeVar.f128907h = false;
            q.a("MvChooseAlbumFragment", "onMediaPageLoadedCallback, set hasMoreImage = false and return");
            return;
        } else if (list.size() == 0 && dVar != d.a.f109380a) {
            aeVar.f128907h = false;
        }
        ArrayList arrayList = new ArrayList();
        Iterator it = list.iterator();
        while (it.hasNext()) {
            MediaModel mediaModel = (MediaModel) it.next();
            if (!(mediaModel == null || mediaModel.f109390b == null || TextUtils.isEmpty(mediaModel.f109390b))) {
                MvImageChooseAdapter.MyMediaModel myMediaModel = new MvImageChooseAdapter.MyMediaModel(mediaModel.f109389a);
                myMediaModel.f109390b = mediaModel.f109390b;
                myMediaModel.f109391c = mediaModel.f109391c;
                myMediaModel.f109392d = mediaModel.f109392d;
                myMediaModel.o = mediaModel.o;
                myMediaModel.f109393e = mediaModel.f109393e;
                myMediaModel.f109394f = mediaModel.f109394f;
                myMediaModel.f109395g = mediaModel.f109395g;
                myMediaModel.f109396h = mediaModel.f109396h;
                myMediaModel.f109397i = mediaModel.f109397i;
                myMediaModel.f109398j = mediaModel.f109398j;
                myMediaModel.f109399k = mediaModel.f109399k;
                myMediaModel.f109400l = mediaModel.f109400l;
                myMediaModel.f109401m = mediaModel.f109401m;
                myMediaModel.n = mediaModel.n;
                arrayList.add(myMediaModel);
            }
        }
        aw awVar = aeVar.f128903d;
        if (i2 == 4 || i2 == 3 || i2 == 1) {
            awVar.a(arrayList, i2, dVar);
        }
    }
}
