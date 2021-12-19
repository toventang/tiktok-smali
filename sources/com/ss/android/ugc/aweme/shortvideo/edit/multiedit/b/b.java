package com.ss.android.ugc.aweme.shortvideo.edit.multiedit.b;

import com.bytedance.covode.number.Covode;
import com.ss.android.ugc.aweme.common.r;
import com.ss.android.ugc.aweme.shortvideo.ShortVideoContext;
import h.f.b.l;

public final class b {

    /* renamed from: a  reason: collision with root package name */
    public static final b f127860a = new b();

    /* renamed from: b  reason: collision with root package name */
    private static String f127861b;

    /* renamed from: c  reason: collision with root package name */
    private static String f127862c;

    /* renamed from: d  reason: collision with root package name */
    private static String f127863d;

    /* renamed from: e  reason: collision with root package name */
    private static String f127864e;

    /* renamed from: f  reason: collision with root package name */
    private static String f127865f;

    private b() {
    }

    static {
        Covode.recordClassIndex(83812);
    }

    public static void a() {
        r.a("cancel_video_trim", c().f149193a);
    }

    public static void b() {
        r.a("exit_video_trim", c().f149193a);
    }

    public static com.ss.android.ugc.tools.f.b c() {
        com.ss.android.ugc.tools.f.b a2 = new com.ss.android.ugc.tools.f.b().a("shoot_way", f127862c).a("creation_id", f127861b).a("enter_from", f127863d).a("content_type", f127864e).a("content_source", f127865f).a("enter_from", "video_edit_page");
        l.b(a2, "");
        return a2;
    }

    public static void a(int i2) {
        r.a("reshoot_video_section", c().a("order", String.valueOf(i2 + 1)).f149193a);
    }

    public static final void b(int i2) {
        r.a("back_to_video_trim", c().a("videoSegment", i2).f149193a);
    }

    public static void a(ShortVideoContext shortVideoContext) {
        if (shortVideoContext != null) {
            f127861b = shortVideoContext.q;
            f127862c = shortVideoContext.r;
            f127863d = shortVideoContext.x;
            f127864e = "video";
            f127865f = "shoot";
        }
    }

    public static void a(boolean z, boolean z2, int i2, int i3, int i4) {
        String str;
        if (z2) {
            str = "single";
        } else if (z) {
            str = "multi_part";
        } else {
            str = "multi_entire";
        }
        r.a("edit_video_length", c().a("trim_type", str).a("order", String.valueOf(i2 + 1)).a("from_length", String.valueOf(i3)).a("to_length", String.valueOf(i4)).f149193a);
    }
}
