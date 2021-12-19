package com.ss.android.ugc.aweme.discover.lynx.b;

import android.net.Uri;
import com.bytedance.covode.number.Covode;
import com.ss.android.ugc.aweme.discover.mixfeed.d;
import com.ss.android.ugc.aweme.utils.dc;

public final class c {

    /* renamed from: a  reason: collision with root package name */
    public static final c f81446a = new c();

    private c() {
    }

    static {
        Covode.recordClassIndex(50610);
    }

    public static int a(d dVar) {
        String schema;
        String rawData;
        if (dVar == null || (schema = dVar.getSchema()) == null || schema.length() == 0 || (rawData = dVar.getRawData()) == null || rawData.length() == 0) {
            return 3;
        }
        Uri parse = Uri.parse(dVar.getSchema());
        String queryParameter = parse.getQueryParameter("channel");
        String queryParameter2 = parse.getQueryParameter("bundle");
        if (queryParameter == null || queryParameter2 == null) {
            return 2;
        }
        if (dc.b(queryParameter)) {
            return 0;
        }
        return 1;
    }
}
