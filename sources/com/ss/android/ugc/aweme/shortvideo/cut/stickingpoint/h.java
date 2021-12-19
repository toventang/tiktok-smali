package com.ss.android.ugc.aweme.shortvideo.cut.stickingpoint;

import com.bytedance.covode.number.Covode;
import com.ss.android.ugc.aweme.common.r;
import com.ss.android.ugc.aweme.shortvideo.cut.model.VideoSegment;
import com.ss.android.ugc.aweme.shortvideo.util.at;
import com.ss.android.ugc.tools.f.b;
import com.ss.android.ugc.tools.utils.k;
import h.f.b.l;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Objects;

public final class h {

    /* renamed from: a  reason: collision with root package name */
    public static String f125961a;

    /* renamed from: b  reason: collision with root package name */
    public static String f125962b;

    /* renamed from: c  reason: collision with root package name */
    public static String f125963c = "";

    /* renamed from: d  reason: collision with root package name */
    public static String f125964d = "";

    /* renamed from: e  reason: collision with root package name */
    public static final h f125965e = new h();

    /* renamed from: f  reason: collision with root package name */
    private static String f125966f;

    /* renamed from: g  reason: collision with root package name */
    private static String f125967g = "video_sync_page";

    /* renamed from: h  reason: collision with root package name */
    private static String f125968h;

    private h() {
    }

    static {
        Covode.recordClassIndex(82757);
    }

    public static b a() {
        b a2 = new b().a("shoot_way", f125961a).a("creation_id", f125966f).a("enter_from", f125967g);
        l.b(a2, "");
        return a2;
    }

    public static String a(boolean z) {
        if (z) {
            return "sound_sync";
        }
        String str = f125968h;
        if (str == null) {
            return "video";
        }
        Objects.requireNonNull(str, "null cannot be cast to non-null type kotlin.String");
        return str;
    }

    private static b b(boolean z) {
        b a2 = new b().a("shoot_way", f125961a).a("creation_id", f125966f).a("content_source", "upload").a("content_type", a(z));
        l.b(a2, "");
        return a2;
    }

    public static void c(List<? extends VideoSegment> list) {
        if (!k.a(list)) {
            long j2 = 0;
            if (list == null) {
                l.b();
            }
            Iterator<T> it = list.iterator();
            while (it.hasNext()) {
                j2 += it.next().f125478b;
            }
            r.a("smart_sync_cancel", a().a("content_duration_ms", j2).f149193a);
        }
    }

    public static void a(List<? extends VideoSegment> list) {
        if (!k.a(list)) {
            long j2 = 0;
            if (list == null) {
                l.b();
            }
            int i2 = 0;
            int i3 = 0;
            for (T t : list) {
                j2 += t.f125478b;
                if (t.x) {
                    i3++;
                }
            }
            if (!l.a((Object) "comment_reply", (Object) f125961a)) {
                f125963c = "";
                f125964d = "";
            }
            at.a("enter_clip_edit_page");
            b a2 = a().a("content_type", "sound_sync").a("content_source", "upload").a("content_duration_ms", j2).a("reply_comment_id", f125963c).a("reply_user_id", f125964d).a("video_cnt", list.size() - i3).a("pic_cnt", i3);
            if (list.size() > 1) {
                i2 = 1;
            }
            r.a("enter_clip_edit_page", a2.a("is_multi_content", i2).a("mix_type", com.ss.android.ugc.aweme.shortvideo.ac.b.a(list.size() - i3, i3)).a("enter_from", "video_sync_page").f149193a);
        }
    }

    public static void b(List<? extends VideoSegment> list) {
        int i2;
        if (!k.a(list)) {
            long j2 = 0;
            if (list == null) {
                l.b();
            }
            int i3 = 0;
            for (T t : list) {
                j2 += t.f125478b;
                if (t.x) {
                    i3++;
                }
            }
            if (!l.a((Object) "comment_reply", (Object) f125961a)) {
                f125963c = "";
                f125964d = "";
            }
            b a2 = a().a("content_type", a(false)).a("content_source", "upload").a("content_duration_ms", j2).a("reply_comment_id", f125963c).a("reply_user_id", f125964d).a("video_cnt", list.size() - i3).a("pic_cnt", i3);
            if (list.size() > 1) {
                i2 = 1;
            } else {
                i2 = 0;
            }
            b a3 = a2.a("is_multi_content", i2).a("mix_type", com.ss.android.ugc.aweme.shortvideo.ac.b.a(list.size() - i3, i3)).a("enter_from", "clip_edit_page");
            String str = f125962b;
            if (!(str == null || str.length() == 0)) {
                a3.a("enter_method", f125962b);
            }
            at.a("enter_clip_edit_page");
            r.a("enter_clip_edit_page", a3.f149193a);
        }
    }

    public static void a(String str, String str2) {
        f125961a = str;
        f125966f = str2;
    }

    public static void a(List<? extends VideoSegment> list, String str, boolean z) {
        if (!k.a(list)) {
            ArrayList<VideoSegment> arrayList = new ArrayList();
            if (list == null) {
                l.b();
            }
            for (T t : list) {
                if (!t.f125485i) {
                    arrayList.add(t);
                }
            }
            long j2 = 0;
            for (VideoSegment videoSegment : arrayList) {
                j2 += videoSegment.f125478b;
            }
            r.a(str, a().a("content_type", a(z)).a("content_source", "upload").a("content_duration_ms", j2).f149193a);
        }
    }

    public static void a(boolean z, int i2, String str) {
        l.d(str, "");
        r.a("single_fast_import_cover_rate", new b().a("fast_import", z ? 1 : 0).a("clip_mode", i2).a("fast_import_fail", str).f149193a);
    }

    public static void a(boolean z, boolean z2, boolean z3, boolean z4, boolean z5, boolean z6) {
        if (z2) {
            r.a("edit_clip", b(z).a("edit_way", "click").f149193a);
        } else if (z5) {
            r.a("edit_clip_delete", b(z).f149193a);
        } else if (z3) {
            r.a("edit_clip_complete", b(z).f149193a);
        } else if (z4) {
            r.a("edit_clip_cancel", b(z).f149193a);
        } else if (z6) {
            r.a("edit_clips_order", b(z).a("edit_way", "press").f149193a);
        }
    }
}
