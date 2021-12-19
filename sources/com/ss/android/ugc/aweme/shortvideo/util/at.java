package com.ss.android.ugc.aweme.shortvideo.util;

import com.bytedance.covode.number.Covode;
import h.a.n;
import h.f.b.l;
import java.util.List;

public final class at {

    /* renamed from: a  reason: collision with root package name */
    static long f132233a = -1;

    /* renamed from: b  reason: collision with root package name */
    static String f132234b = "";

    /* renamed from: c  reason: collision with root package name */
    public static final at f132235c = new at();

    /* renamed from: d  reason: collision with root package name */
    private static final List<String> f132236d = n.b("enter_video_shoot_page", "enter_clip_edit_page", "enter_video_edit_page", "enter_video_post_page");

    private at() {
    }

    public static final void a() {
        f132233a = -1;
        f132234b = "";
    }

    static {
        Covode.recordClassIndex(86599);
    }

    public static final void a(String str) {
        l.d(str, "");
        List<String> list = f132236d;
        if (list.contains(str)) {
            if (!list.contains(f132234b)) {
                f132234b = str;
            } else if (list.indexOf(f132234b) < list.indexOf(str)) {
                f132234b = str;
            }
        }
    }
}
