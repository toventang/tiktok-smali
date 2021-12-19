package com.ss.android.ugc.aweme.profile.f;

import com.bytedance.covode.number.Covode;
import com.kakao.usermgmt.StringSet;
import com.ss.android.ugc.aweme.app.f.d;
import com.ss.android.ugc.aweme.common.r;
import com.ss.android.ugc.aweme.profile.a.m;
import com.zhiliaoapp.musically.R;
import h.f.b.l;
import java.util.ArrayList;
import java.util.Iterator;

public final class n {

    /* renamed from: a  reason: collision with root package name */
    public static final n f116429a = new n();

    /* renamed from: b  reason: collision with root package name */
    private static boolean f116430b;

    private n() {
    }

    static {
        Covode.recordClassIndex(75164);
    }

    public static void a() {
        r.a("shoot_bubble_show", new d().a("enter_from", "personal_homepage").f66730a);
    }

    public static void a(boolean z) {
        int i2;
        int i3;
        String str;
        String str2;
        if (z != f116430b) {
            f116430b = z;
            ArrayList<m> g2 = o.g();
            int i4 = 0;
            int i5 = -1;
            if (!g2.get(0).f115869e || !o.f116432b) {
                i3 = -1;
                i2 = -1;
            } else {
                Iterator<T> it = g2.iterator();
                i5 = 0;
                i3 = 0;
                i2 = 0;
                while (it.hasNext()) {
                    int i6 = it.next().f115866b;
                    if (i6 == R.string.cn1) {
                        i5 = i4;
                    } else if (i6 == R.string.cmx) {
                        i3 = i4;
                    } else if (i6 == R.string.cmt) {
                        i2 = i4;
                    }
                    i4++;
                }
            }
            d dVar = new d();
            if (o.f()) {
                str = "set_up_profile";
            } else {
                str = "edit_profile";
            }
            d a2 = dVar.a("edit_profile_icon", str).a("create_video_show", o.f116433c ? 1 : 0).a("personal_videos_cnt", o.f116435e).a("photo_card_order", i5).a("photo_card_edited", o.a() ? 1 : 0).a("name_card_order", i3).a("name_card_edited", o.b() ? 1 : 0).a("bio_card_order", i2).a("bio_card_edited", o.c() ? 1 : 0);
            if (z) {
                str2 = "enter";
            } else {
                str2 = "leave";
            }
            r.a("personal_homepage_profile_status", a2.a("enter_from", str2).a("fans_1K", o.d() ? 1 : 0).f66730a);
        }
    }

    public static void a(String str, boolean z) {
        String str2;
        l.d(str, "");
        d a2 = new d().a(StringSet.type, str);
        if (z) {
            str2 = "edit";
        } else {
            str2 = "add";
        }
        r.a("enter_personal_homepage_click_add", a2.a("btn_name", str2).f66730a);
    }
}
