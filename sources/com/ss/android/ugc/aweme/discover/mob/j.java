package com.ss.android.ugc.aweme.discover.mob;

import android.view.View;
import com.bytedance.covode.number.Covode;
import com.ss.android.ugc.aweme.search.k.r;
import h.f.b.l;
import java.util.WeakHashMap;

public final class j {

    /* renamed from: a  reason: collision with root package name */
    public static WeakHashMap<Integer, r> f81925a = new WeakHashMap<>();

    /* renamed from: b  reason: collision with root package name */
    public static final a f81926b = new a((byte) 0);

    public static final class a {
        static {
            Covode.recordClassIndex(50856);
        }

        private a() {
        }

        public /* synthetic */ a(byte b2) {
            this();
        }

        public static r a(View view) {
            l.d(view, "");
            r rVar = (r) i.f81924a.b(view);
            if (rVar == null) {
                return r.a.a();
            }
            return rVar;
        }

        public static void b(View view) {
            l.d(view, "");
            i.f81924a.a(view);
            j.f81925a.remove(Integer.valueOf(view.hashCode()));
        }

        public static void a(View view, r rVar) {
            l.d(view, "");
            l.d(rVar, "");
            i.f81924a.a(view, rVar);
            j.f81925a.put(Integer.valueOf(view.hashCode()), rVar);
        }
    }

    static {
        Covode.recordClassIndex(50855);
    }
}
