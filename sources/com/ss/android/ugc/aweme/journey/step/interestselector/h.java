package com.ss.android.ugc.aweme.journey.step.interestselector;

import android.app.Activity;
import com.bytedance.covode.number.Covode;
import com.bytedance.frameworks.apm.trace.MethodCollector;
import com.ss.android.ugc.aweme.journey.ai;
import com.ss.android.ugc.aweme.utils.dg;
import h.e.c;
import h.e.q;
import h.f.b.l;
import h.m.d;
import java.io.BufferedReader;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.Reader;
import java.util.LinkedList;
import java.util.List;

public final class h {
    static {
        Covode.recordClassIndex(67402);
    }

    public static final class a extends com.google.gson.b.a<List<? extends ai>> {
        static {
            Covode.recordClassIndex(67403);
        }

        a() {
        }
    }

    public static final List<ai> a(Activity activity) {
        MethodCollector.i(6222);
        l.d(activity, "");
        InputStream open = activity.getAssets().open("interest_list/topic_interest_list_US.json");
        l.b(open, "");
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(open, d.f158808a), 8192);
        try {
            String a2 = q.a((Reader) bufferedReader);
            c.a(bufferedReader, null);
            List<ai> list = (List) dg.a().a(a2, new a().type);
            if (list == null || list.isEmpty()) {
                LinkedList linkedList = new LinkedList();
                MethodCollector.o(6222);
                return linkedList;
            }
            MethodCollector.o(6222);
            return list;
        } catch (Throwable th) {
            c.a(bufferedReader, th);
            MethodCollector.o(6222);
            throw th;
        }
    }
}
