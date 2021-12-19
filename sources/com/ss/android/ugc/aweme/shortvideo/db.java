package com.ss.android.ugc.aweme.shortvideo;

import com.bytedance.covode.number.Covode;
import com.bytedance.ies.abmock.b;
import com.ss.android.ugc.aweme.property.d;
import com.ss.android.ugc.tools.utils.q;
import h.f.b.l;

public final class db {

    /* renamed from: a  reason: collision with root package name */
    public static final db f126449a = new db();

    private db() {
    }

    static {
        Covode.recordClassIndex(82946);
    }

    public static final boolean b() {
        if (a() != 0) {
            return true;
        }
        return false;
    }

    public static final int a() {
        cr a2 = cr.a();
        l.b(a2, "");
        Boolean bool = a2.o;
        l.b(bool, "");
        if (bool.booleanValue()) {
            q.a("record 3min disabled, reason: shoutout");
            return 0;
        } else if (!d.a()) {
            q.a("record 3min disabled, reason: long video not allowed");
            return 0;
        } else {
            int a3 = b.a().a(true, "studio_long_video_record_type", 0);
            if (a3 == 0) {
                q.a("record 3min disabled, reason: ab config");
            } else {
                q.a("record 3min enabled");
            }
            return a3;
        }
    }
}
