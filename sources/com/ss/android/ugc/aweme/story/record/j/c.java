package com.ss.android.ugc.aweme.story.record.j;

import com.bytedance.covode.number.Covode;
import com.bytedance.ugc.glue.monitor.UGCMonitor;
import com.ss.android.ugc.aweme.common.r;
import com.ss.android.ugc.aweme.story.record.f.a;
import com.ss.android.ugc.aweme.utils.d;
import com.ss.android.ugc.tools.f.b;
import h.a.n;
import h.f.b.l;
import java.util.List;
import java.util.Map;

public final class c {

    /* renamed from: a  reason: collision with root package name */
    public static long f138377a = -1;

    /* renamed from: b  reason: collision with root package name */
    public static String f138378b = "";

    /* renamed from: c  reason: collision with root package name */
    public static final c f138379c = new c();

    /* renamed from: d  reason: collision with root package name */
    private static final List<String> f138380d = n.b("enter_video_shoot_page", "enter_video_edit_page");

    private c() {
    }

    static {
        Covode.recordClassIndex(90506);
    }

    public static void a(String str) {
        l.d(str, "");
        List<String> list = f138380d;
        if (list.contains(str)) {
            if (!list.contains(f138378b)) {
                f138378b = str;
            } else if (list.indexOf(f138378b) < list.indexOf(str)) {
                f138378b = str;
            }
        }
    }

    public static void a(a aVar, String str) {
        l.d(aVar, "");
        l.d(str, "");
        r.a("click_upload_entrance", new b().a("creation_id", aVar.f138279b).a("shoot_way", aVar.f138280c).a("is_westwindow_exist", aVar.f138286i).a("enter_from", "video_shoot_page").a("enter_method", str).a("shoot_page", "story_shoot_page").a("shoot_tab_name", "story").f149193a);
    }

    public static void b(a aVar, String str) {
        Object obj;
        l.d(aVar, "");
        l.d(str, "");
        b a2 = new b().a("creation_id", aVar.f138279b).a("shoot_way", "story").a("shoot_page", "story_shoot_page").a("is_westwindow_exist", aVar.f138286i).a("shoot_enter_method", aVar.f138281d).a("exit_method", str);
        if (f138377a >= 0) {
            obj = Long.valueOf(System.currentTimeMillis() - f138377a);
        } else {
            obj = "-1";
        }
        Map<String, String> map = a2.a("shoot_exit_duration", obj).a("furthest_page", f138378b).f149193a;
        f138377a = -1;
        d.a("shoot_exit", map);
    }

    public static void a(a aVar, boolean z) {
        String str;
        l.d(aVar, "");
        b a2 = new b().a("creation_id", aVar.f138279b).a("shoot_way", aVar.f138280c).a("is_westwindow_exist", aVar.f138286i).a("shoot_page", "story_shoot_page").a("shoot_tab_name", "story");
        if (z) {
            str = "video";
        } else {
            str = UGCMonitor.TYPE_PHOTO;
        }
        d.a("record_video", a2.a("record_type", str).f149193a);
    }
}
