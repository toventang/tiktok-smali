package com.ss.android.ugc.aweme.ca;

import android.app.Activity;
import android.content.Context;
import com.bytedance.covode.number.Covode;
import com.ss.android.ugc.aweme.experiment.bh;
import com.ss.android.ugc.aweme.experiment.ev;
import com.ss.android.ugc.aweme.experiment.k;
import com.ss.android.ugc.aweme.feed.s;
import com.ss.android.ugc.aweme.s.d;
import com.ss.android.ugc.aweme.s.e;
import java.util.ArrayList;
import java.util.List;

public class c {

    /* renamed from: a  reason: collision with root package name */
    public static boolean f69594a;

    /* renamed from: b  reason: collision with root package name */
    private static final String[] f69595b = {"homepage_common_black_mask_layer_tmp_wrapper", "homepage_common_ad_half_web_page_container_tmp_wrapper"};

    /* renamed from: c  reason: collision with root package name */
    private static final List<String> f69596c;

    /* renamed from: d  reason: collision with root package name */
    private static final String[] f69597d = {"common_feed_item_feed", "story_item_story_list", "common_feed_layout_video_desc", "layout_video_multi_tag", "common_feed_layout_video_digg", "common_feed_view_video_progress_bar", "common_feed_layout_video_comment_count", "common_feed_layout_video_share", "common_feed_layout_video_more", "common_feed_addiction_hint", "common_feed_layout_feed_avatar", "common_feed_view_video_caution", "common_feed_layout_video_title_with_relation", "common_feed_layout_video_title_music", "common_feed_layout_video_cover_music"};

    /* renamed from: e  reason: collision with root package name */
    private static final String[] f69598e = {"common_feed_item_feed"};

    public static void b() {
        String[] strArr;
        if (e.a() == 2) {
            strArr = f69598e;
        } else {
            strArr = f69597d;
        }
        for (String str : strArr) {
            com.a.b.c.a(str);
        }
    }

    public static void a() {
        if (!com.a.b.c.b(null, "detail_feed_activity_video_detail")) {
            com.a.b.c.a((Context) null, "detail_feed_activity_video_detail");
        }
        if (!com.a.b.c.b(null, "detail_feed_fragment_detail_page")) {
            com.a.b.c.a((Context) null, "detail_feed_fragment_detail_page");
        }
        if (!com.a.b.c.b(null, "detail_feed_insights_bottom")) {
            com.a.b.c.a((Context) null, "detail_feed_insights_bottom");
        }
        if (!com.a.b.c.b(null, "detail_feed_video_seek_bar")) {
            com.a.b.c.a((Context) null, "detail_feed_video_seek_bar");
        }
        if (!com.a.b.c.b(null, "aweme_comment_fragment_input_detail")) {
            com.a.b.c.a((Context) null, "aweme_comment_fragment_input_detail");
        }
    }

    static {
        Covode.recordClassIndex(42934);
        ArrayList arrayList = new ArrayList();
        f69596c = arrayList;
        if (e.b()) {
            arrayList.add("homepage_common_fragment_main_page_opt");
        } else {
            arrayList.add("homepage_common_fragment_main_page");
        }
        if (e.c()) {
            arrayList.add("homepage_common_fragment_main_opt");
        } else {
            arrayList.add("homepage_common_fragment_main");
        }
        if (e.e()) {
            arrayList.add("homepage_common_view_main_tab_item_follow_opt");
        } else {
            arrayList.add("homepage_common_view_main_tab_item_follow");
        }
        if (e.d()) {
            arrayList.add("common_feed_fragment_feed_opt");
        } else {
            arrayList.add("common_feed_fragment_feed");
        }
    }

    private static void a(Context context) {
        for (String str : f69595b) {
            com.a.b.c.a(context, str);
        }
    }

    private static void b(Context context) {
        for (String str : f69596c) {
            com.a.b.c.a(context, str);
        }
    }

    public static void a(Activity activity) {
        if (!f69594a) {
            if (!k.f90255d) {
                if (!d.c()) {
                    a((Context) activity);
                }
                com.a.b.c.a(activity);
                b(activity);
            }
            f69594a = true;
        } else if (!k.f90253b) {
            if (!d.c()) {
                a((Context) activity);
            }
            com.a.b.c.a(activity);
            b(activity);
        }
        if (ev.a()) {
            com.a.b.c.a(activity, "common_feed_swipe_up_strengthen_layout");
        }
        if (s.a().booleanValue()) {
            a(activity, ev.b());
        } else {
            a(activity, bh.a());
        }
    }

    public static void a(Context context, int i2) {
        String[] strArr;
        if (e.a() == 2) {
            strArr = f69598e;
        } else {
            strArr = f69597d;
        }
        for (int i3 = 0; i3 < i2; i3++) {
            for (String str : strArr) {
                com.a.b.c.a(context, str);
            }
        }
    }
}
