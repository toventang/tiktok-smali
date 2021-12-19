package com.ss.android.ugc.aweme.discover.ui;

import androidx.fragment.app.e;
import com.bytedance.covode.number.Covode;
import com.ss.android.ugc.aweme.discover.a.t;
import com.ss.android.ugc.aweme.discover.viewmodel.SearchEnterViewModel;
import com.ss.android.ugc.aweme.search.model.b;
import h.f.b.l;

public final class bj {
    static {
        Covode.recordClassIndex(51326);
    }

    public static final boolean c(e eVar) {
        l.d(eVar, "");
        b bVar = SearchEnterViewModel.a.a(eVar).f82794a;
        if (bVar != null) {
            return bVar.isFromDiscoverSuggestSearch();
        }
        return false;
    }

    public static final boolean a(e eVar) {
        String str;
        b bVar = SearchEnterViewModel.a.a(eVar).f82794a;
        String str2 = null;
        if (bVar != null) {
            str = bVar.getEnterSearchFrom();
        } else {
            str = null;
        }
        if (l.a((Object) str, (Object) "homepage_hot")) {
            return true;
        }
        b bVar2 = SearchEnterViewModel.a.a(eVar).f82794a;
        if (bVar2 != null) {
            str2 = bVar2.getEnterSearchFrom();
        }
        if (l.a((Object) str2, (Object) "homepage_follow")) {
            return true;
        }
        return false;
    }

    public static final boolean b(e eVar) {
        String str;
        l.d(eVar, "");
        b bVar = SearchEnterViewModel.a.a(eVar).f82794a;
        if (bVar != null) {
            str = bVar.getEnterSearchFrom();
        } else {
            str = null;
        }
        if (l.a((Object) str, (Object) "discovery")) {
            return true;
        }
        if (!a(eVar) || !t.a()) {
            return false;
        }
        return true;
    }
}
