package com.bytedance.ies.ugc.statisticlogger.a;

import android.app.Activity;
import com.bytedance.analytics.a;
import com.bytedance.analytics.page.c;
import com.bytedance.covode.number.Covode;
import com.bytedance.ies.foundation.base.e;
import com.ss.android.ugc.aweme.common.r;
import h.f.b.l;
import h.f.b.m;
import h.z;
import java.util.Iterator;
import java.util.Map;

public final class b {

    /* renamed from: a  reason: collision with root package name */
    public static final b f35318a = new b();

    private b() {
    }

    static {
        Covode.recordClassIndex(21144);
    }

    /* renamed from: com.bytedance.ies.ugc.statisticlogger.a.b$b  reason: collision with other inner class name */
    public static final class C0802b implements c<Activity> {
        static {
            Covode.recordClassIndex(21146);
        }

        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
        @Override // com.bytedance.analytics.page.c
        public final /* synthetic */ com.bytedance.analytics.a a(Activity activity) {
            String simpleName;
            T t;
            T t2;
            Activity activity2 = activity;
            l.d(activity2, "");
            a.C0087a aVar = new a.C0087a();
            aVar.a(String.valueOf(activity2.hashCode()));
            aVar.a(a.c.Activity);
            if (activity2 instanceof e) {
                Iterator<T> it = ((e) activity2).provideBaseViewModel().getConfiguration().b().iterator();
                while (true) {
                    t = null;
                    if (!it.hasNext()) {
                        t2 = null;
                        break;
                    }
                    t2 = it.next();
                    if (t2 instanceof a) {
                        break;
                    }
                }
                if (t2 instanceof a) {
                    t = t2;
                }
                T t3 = t;
                if (t3 == null || t3.f35316a.length() == 0) {
                    simpleName = activity2.getClass().getSimpleName();
                } else {
                    simpleName = t3.f35316a;
                }
                l.b(simpleName, "");
            } else {
                simpleName = activity2.getClass().getSimpleName();
                l.b(simpleName, "");
            }
            aVar.b(simpleName);
            return aVar.a();
        }
    }

    public static final class a extends m implements h.f.a.m<String, Map<String, ? extends String>, z> {

        /* renamed from: a  reason: collision with root package name */
        public static final a f35319a = new a();

        static {
            Covode.recordClassIndex(21145);
        }

        a() {
            super(2);
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object, java.lang.Object] */
        @Override // h.f.a.m
        public final /* synthetic */ z invoke(String str, Map<String, ? extends String> map) {
            String str2 = str;
            Map<String, ? extends String> map2 = map;
            l.d(str2, "");
            l.d(map2, "");
            if (str2.length() == 0) {
                r.a("btm_page_show", (Map<String, String>) map2);
            } else {
                r.a(str2, (Map<String, String>) map2);
            }
            return z.f158842a;
        }
    }
}
