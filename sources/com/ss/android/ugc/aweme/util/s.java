package com.ss.android.ugc.aweme.util;

import com.bytedance.covode.number.Covode;
import com.bytedance.keva.Keva;
import h.a.i;
import h.f.b.l;
import java.util.Calendar;
import java.util.List;

public final class s {

    /* renamed from: c  reason: collision with root package name */
    public static final a f142551c = new a((byte) 0);

    /* renamed from: a  reason: collision with root package name */
    public final Keva f142552a;

    /* renamed from: b  reason: collision with root package name */
    public final String f142553b;

    static {
        Covode.recordClassIndex(93225);
    }

    public static final class a {
        static {
            Covode.recordClassIndex(93226);
        }

        private a() {
        }

        public /* synthetic */ a(byte b2) {
            this();
        }
    }

    public final List<String> a() {
        String[] stringArray = this.f142552a.getStringArray(this.f142553b, new String[0]);
        l.b(stringArray, "");
        return i.k(stringArray);
    }

    public static long b() {
        Calendar instance = Calendar.getInstance();
        l.b(instance, "");
        instance.setTimeInMillis(System.currentTimeMillis());
        instance.set(11, 0);
        instance.set(12, 0);
        instance.set(13, 0);
        instance.set(14, 0);
        return instance.getTimeInMillis();
    }

    public s(String str) {
        l.d(str, "");
        this.f142553b = str;
        Keva repo = Keva.getRepo("time_stamp_count_helper");
        l.b(repo, "");
        this.f142552a = repo;
    }
}
