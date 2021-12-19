package com.ss.android.ugc.aweme.discover.mixfeed;

import android.text.TextUtils;
import b.i;
import com.bytedance.covode.number.Covode;
import com.ss.android.ugc.aweme.commercialize.log.RawURLGetter;
import com.ss.android.ugc.aweme.discover.api.SearchApiNew;
import com.ss.android.ugc.aweme.discover.jedi.viewmodel.f;
import com.ss.android.ugc.aweme.search.g.b;
import com.ss.android.ugc.aweme.search.model.d;
import h.f.b.l;
import java.util.LinkedHashMap;

public final class o {
    static {
        Covode.recordClassIndex(50825);
    }

    public static final i<m> a(n nVar) {
        String str;
        String str2;
        int i2;
        int i3;
        String str3;
        String str4;
        LinkedHashMap<String, Integer> linkedHashMap;
        d dVar;
        d dVar2;
        String str5 = "";
        l.d(nVar, str5);
        SearchApiNew.RealApi realApi = SearchApiNew.RealApi.a.f80781a;
        String str6 = nVar.f81836b;
        int i4 = nVar.f81837c;
        int i5 = nVar.f81838d;
        if (!TextUtils.isEmpty(nVar.f81844j)) {
            str = nVar.f81844j;
        } else {
            str = null;
        }
        int i6 = nVar.f81845k;
        if (!TextUtils.isEmpty(nVar.f81840f)) {
            str2 = nVar.f81840f;
        } else {
            str2 = null;
        }
        String str7 = nVar.f81841g;
        int i7 = nVar.f81842h;
        int i8 = nVar.s;
        String str8 = nVar.t;
        String str9 = nVar.u;
        Integer num = nVar.f81846l;
        int i9 = 0;
        if (num != null) {
            i2 = num.intValue();
        } else {
            i2 = 0;
        }
        Integer num2 = nVar.n;
        if (num2 != null) {
            i3 = num2.intValue();
        } else {
            i3 = 0;
        }
        Integer num3 = nVar.f81847m;
        if (num3 != null) {
            i9 = num3.intValue();
        }
        String str10 = nVar.r;
        f fVar = nVar.w;
        if (fVar == null || (dVar2 = fVar.r) == null) {
            str3 = null;
        } else {
            str3 = dVar2.getGuideSearchBaseWord();
        }
        String str11 = nVar.v;
        if (str11 == null) {
            f fVar2 = nVar.w;
            if (fVar2 == null || (dVar = fVar2.r) == null) {
                str11 = null;
            } else {
                str11 = dVar.getWordType();
            }
        }
        String str12 = nVar.x;
        if (str12 != null) {
            str5 = str12;
        }
        String a2 = RawURLGetter.a("other");
        d dVar3 = nVar.f81835a;
        if (dVar3 != null) {
            str4 = dVar3.getTrendingEventId();
        } else {
            str4 = null;
        }
        b bVar = nVar.f81843i;
        if (bVar == null || (linkedHashMap = bVar.activityToFieldMap()) == null) {
            linkedHashMap = new LinkedHashMap<>();
        }
        return realApi.searchMTMixFeedList(str6, i4, i5, str, i6, str2, str7, i7, i8, str8, str9, i2, i3, i9, str10, str3, str11, str5, a2, str4, linkedHashMap);
    }
}
