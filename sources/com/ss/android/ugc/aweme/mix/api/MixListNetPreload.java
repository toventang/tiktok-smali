package com.ss.android.ugc.aweme.mix.api;

import android.os.Bundle;
import com.bytedance.common.utility.m;
import com.bytedance.covode.number.Covode;
import com.bytedance.ies.powerpreload.b.c;
import com.bytedance.ies.powerpreload.b.i;
import com.ss.android.c.b;
import com.ss.android.ugc.aweme.mix.api.response.e;
import com.ss.android.ugc.aweme.mix.c.a;
import com.ss.android.ugc.aweme.mix.mixdetail.viewmodel.g;
import f.a.t;
import h.f.b.l;
import java.io.Serializable;

public final class MixListNetPreload implements c<MixFeedApi, t<e>> {
    static {
        Covode.recordClassIndex(70304);
    }

    @Override // com.bytedance.ies.powerpreload.b.d
    public final boolean enable(Bundle bundle) {
        if (a.a() == 0 || a.a() == 1) {
            return false;
        }
        return true;
    }

    @Override // com.bytedance.ies.powerpreload.b.c
    public final i getPreloadStrategy(Bundle bundle) {
        return new i(0, b.f59141e, false, 5);
    }

    @Override // com.bytedance.ies.powerpreload.b.c
    public final boolean handleException(Exception exc) {
        l.d(exc, "");
        exc.printStackTrace();
        return true;
    }

    @Override // com.bytedance.ies.powerpreload.b.c
    public final t<e> preload(Bundle bundle, h.f.a.b<? super Class<MixFeedApi>, ? extends MixFeedApi> bVar) {
        Serializable serializable;
        String str;
        String str2;
        String str3;
        String str4 = "";
        l.d(bVar, str4);
        String str5 = null;
        if (bundle != null) {
            serializable = bundle.getSerializable("mix_video_list_params");
        } else {
            serializable = null;
        }
        if (!(serializable instanceof com.ss.android.ugc.aweme.mix.e.a)) {
            serializable = null;
        }
        com.ss.android.ugc.aweme.mix.e.a aVar = (com.ss.android.ugc.aweme.mix.e.a) serializable;
        if (aVar != null) {
            str = aVar.getMUsrId();
            str2 = aVar.getMSecUid();
            str3 = aVar.getMAid();
            str5 = aVar.getMixId();
        } else {
            str = null;
            str2 = null;
            str3 = null;
        }
        int i2 = g.f110157a;
        if (!m.a(str3)) {
            i2 = g.f110160d;
        }
        MixFeedApi mixFeedApi = (MixFeedApi) bVar.invoke(MixFeedApi.class);
        if (str5 == null) {
            str5 = str4;
        }
        if (str3 == null) {
            str3 = str4;
        }
        if (str == null) {
            str = str4;
        }
        if (str2 != null) {
            str4 = str2;
        }
        return mixFeedApi.getMixVideos2(str5, str3, 0, i2, str, str4);
    }
}
