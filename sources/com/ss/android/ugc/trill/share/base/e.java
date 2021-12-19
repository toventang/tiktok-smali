package com.ss.android.ugc.trill.share.base;

import android.content.Context;
import com.bytedance.covode.number.Covode;
import com.bytedance.ies.ugc.appcontext.d;
import com.ss.android.ugc.aweme.app.u;
import com.ss.android.ugc.aweme.base.utils.f;
import com.ss.android.ugc.aweme.feed.model.Aweme;
import com.ss.android.ugc.aweme.lancet.j;
import com.ss.android.ugc.aweme.share.d.c;
import com.ss.android.ugc.aweme.tux.a.i.a;
import com.zhiliaoapp.musically.R;
import h.f.b.l;

public final class e {

    /* renamed from: a  reason: collision with root package name */
    public static final e f150651a = new e();

    private e() {
    }

    static {
        Covode.recordClassIndex(99067);
    }

    private static boolean a() {
        try {
            return f.a.f68431a.c();
        } catch (Exception unused) {
            return false;
        }
    }

    private static boolean b() {
        if (j.f107229h && j.b() && !j.c()) {
            return j.f107229h;
        }
        boolean a2 = a();
        j.f107229h = a2;
        return a2;
    }

    public static boolean a(Context context) {
        l.d(context, "");
        if (!com.ss.android.ugc.aweme.video.e.e()) {
            new a(context).a(R.string.fhb).a();
            return false;
        } else if (com.ss.android.ugc.aweme.video.e.f() >= 20971520) {
            return true;
        } else {
            new a(context).a(R.string.fhc).a();
            return false;
        }
    }

    public static boolean a(Context context, Aweme aweme) {
        l.d(context, "");
        if (c.b()) {
            if (aweme == null || !c.a() || !c.b("download")) {
                new a(d.a()).a(context.getString(R.string.bvh)).a();
            } else {
                new a(d.a()).a(context.getString(R.string.bvi)).a();
            }
            return false;
        } else if (!b()) {
            new a(context).a(R.string.de8).a();
            u.a(u.a.NETWORK, aweme);
            return false;
        } else if (a(context)) {
            return true;
        } else {
            u.a(u.a.SDCARD, aweme);
            return false;
        }
    }

    public static final boolean b(Context context, Aweme aweme) {
        l.d(context, "");
        if (c.b()) {
            if (aweme == null || !c.a() || !c.b("download")) {
                new a(d.a()).a(context.getString(R.string.bvh)).a();
            } else {
                new a(d.a()).a(context.getString(R.string.bvi)).a();
            }
            return false;
        } else if (!com.ss.android.ugc.aweme.feed.share.a.a.a(context, aweme)) {
            u.a(u.a.AUDITING, aweme);
            return false;
        } else if (aweme == null || aweme.getVideo() == null || aweme.getAuthor() == null) {
            u.a(u.a.AWEME, aweme);
            return false;
        } else if (!a(context)) {
            u.a(u.a.SDCARD, aweme);
            return false;
        } else if (b()) {
            return true;
        } else {
            new a(context).a(R.string.de8).a();
            u.a(u.a.NETWORK, aweme);
            return false;
        }
    }
}
