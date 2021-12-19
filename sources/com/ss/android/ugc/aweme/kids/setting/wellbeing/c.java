package com.ss.android.ugc.aweme.kids.setting.wellbeing;

import com.bytedance.covode.number.Covode;
import com.ss.android.ugc.aweme.kids.setting.wellbeing.a;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.concurrent.atomic.AtomicBoolean;

public final class c {

    /* renamed from: f  reason: collision with root package name */
    public static final a f107144f = new a((byte) 0);

    /* renamed from: a  reason: collision with root package name */
    public long f107145a = a.C2751a.a().getLong("play_time", 0);

    /* renamed from: b  reason: collision with root package name */
    Long f107146b;

    /* renamed from: c  reason: collision with root package name */
    Long f107147c;

    /* renamed from: d  reason: collision with root package name */
    final SimpleDateFormat f107148d = new SimpleDateFormat("yyyy-MM-dd");

    /* renamed from: e  reason: collision with root package name */
    final AtomicBoolean f107149e = new AtomicBoolean(false);

    static {
        Covode.recordClassIndex(68539);
    }

    public static final class a {
        static {
            Covode.recordClassIndex(68540);
        }

        private a() {
        }

        public /* synthetic */ a(byte b2) {
            this();
        }
    }

    public static boolean a() {
        int i2 = Calendar.getInstance().get(11);
        if (i2 >= 23 || i2 < 5) {
            return true;
        }
        return false;
    }
}
