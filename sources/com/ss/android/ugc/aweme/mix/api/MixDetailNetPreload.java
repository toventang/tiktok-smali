package com.ss.android.ugc.aweme.mix.api;

import android.os.Bundle;
import com.bytedance.covode.number.Covode;
import com.bytedance.ies.powerpreload.b.c;
import com.bytedance.ies.powerpreload.b.i;
import com.ss.android.c.b;
import com.ss.android.ugc.aweme.mix.api.response.d;
import com.ss.android.ugc.aweme.mix.c.a;
import f.a.ab;
import h.f.b.l;
import java.io.Serializable;

public final class MixDetailNetPreload implements c<MixFeedApi, ab<d>> {
    static {
        Covode.recordClassIndex(70300);
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
    public final ab<d> preload(Bundle bundle, h.f.a.b<? super Class<MixFeedApi>, ? extends MixFeedApi> bVar) {
        Serializable serializable;
        String str;
        String str2;
        String str3 = "";
        l.d(bVar, str3);
        String str4 = null;
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
            aVar.getMAid();
            str4 = aVar.getMixId();
        } else {
            str = null;
            str2 = null;
        }
        MixFeedApi mixFeedApi = (MixFeedApi) bVar.invoke(MixFeedApi.class);
        if (str == null) {
            str = str3;
        }
        if (str2 == null) {
            str2 = str3;
        }
        if (str4 != null) {
            str3 = str4;
        }
        return mixFeedApi.getMixDetail(str, str2, str3);
    }
}
