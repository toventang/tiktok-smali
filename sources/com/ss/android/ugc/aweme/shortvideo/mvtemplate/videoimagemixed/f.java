package com.ss.android.ugc.aweme.shortvideo.mvtemplate.videoimagemixed;

import com.bytedance.covode.number.Covode;
import com.bytedance.ugc.glue.monitor.UGCMonitor;
import com.ss.android.ugc.aweme.common.r;
import com.ss.android.ugc.tools.f.b;
import h.f.b.l;

public final class f {

    /* renamed from: a  reason: collision with root package name */
    public static final f f129504a = new f();

    /* renamed from: b  reason: collision with root package name */
    private static String f129505b;

    /* renamed from: c  reason: collision with root package name */
    private static String f129506c;

    private f() {
    }

    static {
        Covode.recordClassIndex(85002);
    }

    public static void a(boolean z) {
        r.a("edit_clips_order", b(z).a("edit_way", "press").f149193a);
    }

    static b b(boolean z) {
        String str;
        b a2 = new b().a("shoot_way", f129506c).a("creation_id", f129505b).a("content_source", "upload").a("enter_from", "album_panel");
        if (z) {
            str = "video";
        } else {
            str = UGCMonitor.TYPE_PHOTO;
        }
        b a3 = a2.a("content_type", str);
        l.b(a3, "");
        return a3;
    }

    public static void a(String str, String str2) {
        f129505b = str;
        f129506c = str2;
    }
}
