package com.ss.android.ugc.aweme.search.m;

import android.net.Uri;
import android.text.TextUtils;
import com.bytedance.covode.number.Covode;
import com.ss.android.ugc.aweme.search.g.b;
import com.ss.android.ugc.aweme.search.model.d;
import h.f.b.l;
import h.m.p;
import java.util.Set;

public final class a {

    /* renamed from: a  reason: collision with root package name */
    public static final a f121448a = new a();

    private a() {
    }

    static {
        Covode.recordClassIndex(79122);
    }

    /* JADX WARNING: Removed duplicated region for block: B:120:0x0028 A[SYNTHETIC] */
    /* JADX WARNING: Removed duplicated region for block: B:63:0x011a  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static com.ss.android.ugc.aweme.search.n.d a(android.net.Uri r17, com.ss.android.ugc.aweme.search.model.b.a r18) {
        /*
        // Method dump skipped, instructions count: 506
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ss.android.ugc.aweme.search.m.a.a(android.net.Uri, com.ss.android.ugc.aweme.search.model.b$a):com.ss.android.ugc.aweme.search.n.d");
    }

    public static void a(Uri uri, d dVar) {
        String queryParameter;
        String queryParameter2;
        String queryParameter3;
        String queryParameter4;
        String queryParameter5;
        String queryParameter6;
        String queryParameter7;
        String queryParameter8;
        Integer e2;
        String queryParameter9;
        String queryParameter10;
        String queryParameter11;
        Set<String> queryParameterNames = uri.getQueryParameterNames();
        dVar.setFilterOption(new b());
        if (!(queryParameterNames == null || queryParameterNames.isEmpty())) {
            for (String str : queryParameterNames) {
                if (str != null) {
                    switch (str.hashCode()) {
                        case -1841902086:
                            if (str.equals("is_filter_search") && (queryParameter = uri.getQueryParameter(str)) != null) {
                                dVar.getFilterOption().setDefaultOption(l.a((Object) "0", (Object) queryParameter));
                                break;
                            }
                        case -1780004746:
                            if (str.equals("pre_search_id") && (queryParameter2 = uri.getQueryParameter(str)) != null) {
                                dVar.setLastSearchId(queryParameter2);
                                break;
                            }
                        case -814408215:
                            if (str.equals("keyword") && (queryParameter3 = uri.getQueryParameter(str)) != null) {
                                if (!queryParameterNames.contains("display_keyword")) {
                                    dVar.setKeyword(queryParameter3);
                                    break;
                                } else {
                                    String queryParameter12 = uri.getQueryParameter("display_keyword");
                                    if (!TextUtils.isEmpty(queryParameter12)) {
                                        queryParameter3 = queryParameter12;
                                    }
                                    dVar.setKeyword(queryParameter3);
                                    break;
                                }
                            }
                        case -685906904:
                            if (str.equals("enter_method") && (queryParameter4 = uri.getQueryParameter(str)) != null) {
                                dVar.setEnterMethod(queryParameter4);
                                break;
                            }
                        case -539642911:
                            if (str.equals("search_from") && (queryParameter5 = uri.getQueryParameter(str)) != null) {
                                dVar.setSearchFrom(queryParameter5);
                                break;
                            }
                        case -429654716:
                            if (str.equals("event_keyword") && (queryParameter6 = uri.getQueryParameter(str)) != null) {
                                dVar.setEventKeyword(queryParameter6);
                                break;
                            }
                        case -346952694:
                            if (str.equals("switch_tab") && (queryParameter7 = uri.getQueryParameter(str)) != null) {
                                dVar.setSwitchTab(queryParameter7);
                                break;
                            }
                        case -11918021:
                            if (!(!str.equals("sort_type") || (queryParameter8 = uri.getQueryParameter(str)) == null || (e2 = p.e(queryParameter8)) == null)) {
                                dVar.getFilterOption().setSortType(e2.intValue());
                                break;
                            }
                        case 3151786:
                            if (str.equals("from") && (queryParameter9 = uri.getQueryParameter(str)) != null && l.a((Object) queryParameter9, (Object) "push")) {
                                dVar.setSearchFrom("push");
                                break;
                            }
                        case 765499066:
                            if (str.equals("trending_event_id") && (queryParameter10 = uri.getQueryParameter(str)) != null) {
                                dVar.setTrendingEventId(queryParameter10);
                                break;
                            }
                        case 2071166924:
                            if (str.equals("utm_source") && (queryParameter11 = uri.getQueryParameter(str)) != null) {
                                dVar.setUtmSource(queryParameter11);
                                break;
                            }
                    }
                }
            }
        }
    }
}
