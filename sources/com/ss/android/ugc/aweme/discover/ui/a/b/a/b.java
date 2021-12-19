package com.ss.android.ugc.aweme.discover.ui.a.b.a;

import android.text.TextUtils;
import com.bytedance.covode.number.Covode;
import com.bytedance.frameworks.apm.trace.MethodCollector;
import com.bytedance.ies.abmock.SettingsManager;
import com.google.gson.g;
import com.ss.android.ugc.aweme.search.g.c;
import h.a.n;
import h.f.b.l;
import java.util.ArrayList;
import java.util.List;

public final class b {

    /* renamed from: a  reason: collision with root package name */
    public static final String f82220a = "";

    /* renamed from: b  reason: collision with root package name */
    public static final b f82221b = new b();

    /* renamed from: c  reason: collision with root package name */
    private static List<a> f82222c;

    public static final class a extends com.google.gson.b.a<List<? extends a>> {
        static {
            Covode.recordClassIndex(51170);
        }

        a() {
        }
    }

    private b() {
    }

    static {
        Covode.recordClassIndex(51169);
    }

    public final synchronized List<a> a() {
        List<a> list;
        MethodCollector.i(6791);
        try {
            String a2 = SettingsManager.a().a("search_filter_options_config", "");
            l.b(a2, "");
            g gVar = new g();
            gVar.f54714d = true;
            gVar.f54716f = true;
            f82222c = (List) gVar.b().a(a2, new a().type);
        } catch (Throwable unused) {
        }
        list = f82222c;
        MethodCollector.o(6791);
        return list;
    }

    public final a a(String str) {
        l.d(str, "");
        if (f82222c == null) {
            a();
        }
        List<a> list = f82222c;
        if (list == null) {
            return null;
        }
        ArrayList arrayList = new ArrayList();
        for (T t : list) {
            if (TextUtils.equals(t.f82215a, str)) {
                arrayList.add(t);
            }
        }
        return (a) n.h((List) arrayList);
    }

    public static boolean a(a aVar) {
        if (!(aVar == null || aVar.f82216b == null)) {
            c cVar = aVar.f82216b;
            if (cVar == null) {
                l.b();
            }
            if (cVar.getOptionStructList() != null) {
                c cVar2 = aVar.f82216b;
                if (cVar2 == null) {
                    l.b();
                }
                List<com.ss.android.ugc.aweme.search.g.g> optionStructList = cVar2.getOptionStructList();
                if (!(optionStructList == null || optionStructList.isEmpty() || aVar.f82217c == null)) {
                    c cVar3 = aVar.f82217c;
                    if (cVar3 == null) {
                        l.b();
                    }
                    if (cVar3.getOptionStructList() != null) {
                        c cVar4 = aVar.f82217c;
                        if (cVar4 == null) {
                            l.b();
                        }
                        List<com.ss.android.ugc.aweme.search.g.g> optionStructList2 = cVar4.getOptionStructList();
                        if (optionStructList2 == null || optionStructList2.isEmpty()) {
                            return false;
                        }
                        return true;
                    }
                }
            }
        }
        return false;
    }
}
