package com.ss.android.ugc.aweme.shortvideo.stitch;

import com.bytedance.covode.number.Covode;
import com.ss.android.ugc.aweme.common.r;
import com.ss.android.ugc.tools.f.b;
import h.f.b.l;

public final class a {

    /* renamed from: a  reason: collision with root package name */
    public static final a f130809a = new a();

    private a() {
    }

    static {
        Covode.recordClassIndex(85723);
    }

    public static final void a(String str, long j2, long j3) {
        l.d(str, "");
        r.a("duration_adjust_complete", new b().a("shoot_way", "stitch").a("enter_from", "video_stitch_page").a("creation_id", str).a("content_source", "shoot").a("content_type", "video").a("duration", j2).a("duration_begin_at", j3).f149193a);
    }
}
