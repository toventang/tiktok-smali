package com.ss.android.ugc.aweme.profile.preload;

import android.os.Bundle;
import android.os.Parcelable;
import com.bytedance.covode.number.Covode;
import com.bytedance.ies.powerpreload.b.c;
import com.bytedance.ies.powerpreload.b.i;
import com.google.c.h.a.q;
import com.ss.android.ugc.aweme.app.api.Api;
import h.f.a.b;
import h.f.b.l;
import java.util.ArrayList;
import java.util.concurrent.Future;

public final class ProfilePagePreload implements c<Api.NetApi, Future<String>> {
    static {
        Covode.recordClassIndex(75294);
    }

    @Override // com.bytedance.ies.powerpreload.b.d
    public final boolean enable(Bundle bundle) {
        if (bundle == null || bundle.getString("preload_profile_page_url") == null) {
            return false;
        }
        return true;
    }

    @Override // com.bytedance.ies.powerpreload.b.c
    public final boolean handleException(Exception exc) {
        l.d(exc, "");
        exc.printStackTrace();
        return true;
    }

    @Override // com.bytedance.ies.powerpreload.b.c
    public final i getPreloadStrategy(Bundle bundle) {
        if (bundle == null || !bundle.containsKey("profile_aweme_ttl")) {
            return new i(0, Api.f66569d, false, 5);
        }
        return new i(bundle.getInt("profile_aweme_ttl"), Api.f66569d, false);
    }

    /* Return type fixed from 'com.google.c.h.a.q<java.lang.String>' to match base method */
    @Override // com.bytedance.ies.powerpreload.b.c
    public final Future<String> preload(Bundle bundle, b<? super Class<Api.NetApi>, ? extends Api.NetApi> bVar) {
        String str;
        l.d(bVar, "");
        Parcelable parcelable = null;
        if (bundle != null) {
            str = bundle.getString("preload_profile_page_url");
        } else {
            str = null;
        }
        ArrayList arrayList = new ArrayList();
        if (bundle != null) {
            parcelable = bundle.getParcelable("preload_profile_page_extra_info");
        }
        q<String> doGet = ((Api.NetApi) bVar.invoke(Api.NetApi.class)).doGet(str, arrayList, parcelable);
        l.b(doGet, "");
        return doGet;
    }
}
