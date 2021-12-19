package com.ss.android.ugc.aweme.feed.q;

import com.bytedance.covode.number.Covode;
import com.bytedance.ies.abmock.SettingsManager;
import h.f.b.l;
import h.f.b.m;
import h.h;
import h.i;
import java.util.Collection;
import java.util.HashMap;
import java.util.Iterator;

public final class aq {

    /* renamed from: a  reason: collision with root package name */
    public static final aq f93764a = new aq();

    /* renamed from: b  reason: collision with root package name */
    private static final h f93765b = i.a((h.f.a.a) a.f93766a);

    public static HashMap<String, String> a() {
        return (HashMap) f93765b.getValue();
    }

    private aq() {
    }

    static final class a extends m implements h.f.a.a<HashMap<String, String>> {

        /* renamed from: a  reason: collision with root package name */
        public static final a f93766a = new a();

        static {
            Covode.recordClassIndex(59658);
        }

        a() {
            super(0);
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        @Override // h.f.a.a
        public final /* synthetic */ HashMap<String, String> invoke() {
            return new HashMap();
        }
    }

    static {
        Covode.recordClassIndex(59657);
    }

    public static boolean a(String str) {
        l.d(str, "");
        if (ar.f93767a == null) {
            ar.f93767a = Boolean.valueOf(SettingsManager.a().a("player_duplicate_detector", true));
        }
        Boolean bool = ar.f93767a;
        if (bool == null) {
            l.b();
        }
        if (!bool.booleanValue() || a().size() <= 0) {
            return false;
        }
        Collection<String> values = a().values();
        l.b(values, "");
        Iterator<T> it = values.iterator();
        while (it.hasNext()) {
            if (l.a((Object) str, (Object) it.next())) {
                return true;
            }
        }
        return false;
    }
}
