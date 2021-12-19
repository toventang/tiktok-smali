package com.ss.android.ugc.aweme.shortvideo.cut.stickingpoint;

import com.bytedance.covode.number.Covode;
import com.facebook.common.d.m;
import com.ss.android.ugc.aweme.df.q;
import com.ss.android.ugc.aweme.shortvideo.ar;
import com.ss.android.ugc.aweme.shortvideo.c;

public final class i {

    /* renamed from: a  reason: collision with root package name */
    public static final i f125969a = new i();

    private i() {
    }

    static {
        Covode.recordClassIndex(82758);
    }

    public static void a(boolean z, Exception exc) {
        String c2;
        int i2 = !z ? 1 : 0;
        ar arVar = new ar();
        if (exc == null) {
            c2 = "";
        } else {
            c2 = m.c(exc);
        }
        q.a("stickpoint_musiclist", i2, arVar.a("exception", c2).a());
    }

    public static void a(boolean z, c cVar, Exception exc) {
        String path;
        String str;
        int i2 = !z ? 1 : 0;
        ar arVar = new ar();
        String str2 = "";
        if (cVar == null) {
            path = str2;
        } else {
            path = cVar.getPath();
        }
        ar a2 = arVar.a("url", path);
        if (cVar == null || (str = cVar.getMusicId()) == null) {
            str = str2;
        }
        ar a3 = a2.a("music_id", str);
        if (exc != null) {
            str2 = m.c(exc);
        }
        q.a("stickpoint_download_music", i2, a3.a("exception", str2).a());
    }

    public static void a(boolean z, boolean z2, long j2) {
        q.a("stickpoint_smart", !z ? 1 : 0, new ar().a("cast_time", Long.valueOf(j2 / 1000)).a("cancel", Integer.valueOf(z2 ? 1 : 0)).a());
    }

    public static void a(boolean z, String str, String str2, Exception exc) {
        String c2;
        int i2 = !z ? 1 : 0;
        ar a2 = new ar().a("url", str).a("alg_type", str2);
        if (exc == null) {
            c2 = "";
        } else {
            c2 = m.c(exc);
        }
        q.a("stickpoint_download_alg", i2, a2.a("exception", c2).a());
    }
}
