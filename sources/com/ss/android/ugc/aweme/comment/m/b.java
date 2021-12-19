package com.ss.android.ugc.aweme.comment.m;

import android.text.TextUtils;
import com.bytedance.covode.number.Covode;
import com.bytedance.ugc.glue.monitor.UGCMonitor;
import com.ss.android.ugc.aweme.app.f.c;
import com.ss.android.ugc.aweme.app.f.d;
import com.ss.android.ugc.aweme.awemeservice.AwemeService;
import com.ss.android.ugc.aweme.comment.model.Comment;
import com.ss.android.ugc.aweme.common.r;
import com.ss.android.ugc.aweme.detail.i;
import com.ss.android.ugc.aweme.discover.mob.h;
import com.ss.android.ugc.aweme.feed.ac;
import com.ss.android.ugc.aweme.feed.model.Aweme;
import com.ss.android.ugc.aweme.forward.statistics.ForwardStatisticsServiceImpl;
import com.ss.android.ugc.aweme.metrics.ac;
import com.ss.android.ugc.aweme.profile.model.User;
import com.ss.android.ugc.aweme.story.d.a;
import com.ss.android.ugc.aweme.utils.eu;
import java.util.Collection;
import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;

public final class b {
    static {
        Covode.recordClassIndex(44283);
    }

    public static void a(LinkedHashMap<String, Integer> linkedHashMap) {
        if (!linkedHashMap.isEmpty()) {
            StringBuilder sb = new StringBuilder();
            StringBuilder sb2 = new StringBuilder();
            for (Map.Entry<String, Integer> entry : linkedHashMap.entrySet()) {
                sb.append(entry.getKey()).append(',');
                sb2.append(entry.getValue()).append(',');
            }
            if (sb.length() > 0 && sb.charAt(sb.length() - 1) == ',') {
                sb.deleteCharAt(sb.length() - 1);
            }
            if (sb2.length() > 0 && sb2.charAt(sb2.length() - 1) == ',') {
                sb2.deleteCharAt(sb2.length() - 1);
            }
            r.a("send_emoji", new d().a("enter_from", UGCMonitor.EVENT_COMMENT).a("cnt", sb2.toString()).f66730a);
        }
    }

    public static void a(String str, String str2, String str3, String str4, String str5, int i2, int i3, String str6, String str7, String str8, int i4) {
        d a2 = a(str, str2, str3, str4, str5, i2, i3, str6);
        a2.a("enter_from", str7).a("reply_type", (!"message".equals(str7) || str3 == null || str8 == null || !str3.equals(str8)) ? "0" : "1").a("is_others_video", i4);
        r.a("reply_via_video", a2.f66730a);
    }

    public static void a(String str, String str2, String str3, String str4) {
        c a2 = new c().a("return_method", str).a("group_id", str3).a("enter_from", str2).a("author_id", str4);
        com.bytedance.ies.ugc.appcontext.d.a();
        r.a("emoji_to_keyboard", str2, str3, 0, a2.a());
        r.a("emoji_to_keyboard", new d().a("enter_from", str2).a("return_method", str).a("group_id", str3).a("author_id", str4).f66730a);
    }

    public static String a(Comment comment) {
        if (comment == null) {
            return "original";
        }
        String replyId = comment.getReplyId();
        boolean a2 = com.bytedance.common.utility.collection.b.a((Collection) comment.getReplyComments());
        if (comment.getCommentType() == 0) {
            return "reply";
        }
        if (!TextUtils.isEmpty(replyId) && !TextUtils.equals(replyId, "0")) {
            return "reply_to_reply";
        }
        if (a2) {
            return "reply";
        }
        return "original";
    }

    public static d a(String str, String str2) {
        d dVar = new d();
        dVar.a("enter_from", str).a("group_id", str2);
        Aweme b2 = AwemeService.b().b(str2);
        if (b2 != null) {
            dVar.a("author_id", b2.getAuthorUid());
        }
        return dVar;
    }

    public static void b(String str, String str2, String str3, String str4) {
        d a2 = a(str, str2);
        a2.a("enter_from", str);
        a2.a("group_id", str2);
        a2.a("author_id", str3);
        a2.a("comment_id", str4);
        r.a("creator_like_comment_show", a2.f66730a);
    }

    public static void a(String str, int i2, String str2, String str3, String str4) {
        if (i2 == 2) {
            r.a("click_fast_emoji", new d().a("enter_from", str2).a("group_id", str3).a("author_id", str4).a("emoji_code", str).f66730a);
        }
    }

    private static d a(String str, String str2, String str3, String str4, String str5, int i2, int i3, String str6) {
        return new d().a("enter_method", str).a("group_id", str2).a("comment_id", str3).a("comment_user_id", str4).a("author_id", com.ss.android.ugc.aweme.account.b.g().getCurUserId()).a("parent_id", str5).a("parent_position", i2).a("secondary_position", i3).a("comment_category", str6);
    }

    /* JADX DEBUG: Multi-variable search result rejected for r22v0, resolved type: boolean */
    /* JADX WARN: Multi-variable type inference failed */
    public static void a(Aweme aweme, String str, String str2, String str3, String str4, String str5, boolean z, boolean z2, String str6) {
        User user;
        String str7 = str2;
        if ("opus".equals(str7) || "collection".equals(str7)) {
            if (z) {
                str7 = "personal_homepage";
            } else {
                str7 = "others_homepage";
            }
        }
        c a2 = new c().a("reply_uid", str5).a("reply_comment_id", str4).a("is_photo", Integer.valueOf(z2 ? 1 : 0)).a("is_retry", (Integer) 0);
        com.bytedance.ies.ugc.appcontext.d.a();
        r.a(str, str7, str3, 0, a2.a());
        d dVar = new d();
        dVar.a("reply_uid", str5);
        dVar.a("reply_comment_id", str4);
        dVar.a("is_photo", (int) z2);
        dVar.a("is_retry", 0);
        dVar.a("enter_from", str7);
        dVar.a("group_id", str3);
        if (!TextUtils.isEmpty(str6)) {
            dVar.a("news_id", str6);
        }
        if (aweme != null) {
            user = aweme.getAuthor();
        } else {
            user = null;
        }
        eu.a(dVar, user);
        r.a(str, dVar.f66730a);
    }

    public static void a(String str, String str2, String str3, String str4, String str5, int i2, int i3, String str6, String str7, String str8) {
        d a2 = a(str, str2, str3, str4, str5, i2, i3, str6);
        a2.a("enter_from", str7).a("comment_group_id", str8);
        r.a("video_comment_show", a2.f66730a);
    }

    public static void a(String str, String str2, Aweme aweme, String str3, boolean z, String str4, String str5, boolean z2, String str6, int i2, String str7, String str8, int i3, String str9, String str10, String str11) {
        User user;
        String str12;
        String str13;
        d a2 = new d().a((HashMap<? extends String, ? extends String>) ForwardStatisticsServiceImpl.b().a(str, aweme)).a((HashMap<? extends String, ? extends String>) ForwardStatisticsServiceImpl.b().a(aweme, str4)).a("is_success", z ? 1 : 0);
        if ("homepage_country".equals(str) && aweme.getAuthor() != null) {
            a2.a("country_name", aweme.getAuthor().getRegion());
        }
        String str14 = "";
        if (TextUtils.equals(str, "general_search")) {
            if (h.f81916a) {
                if (aweme == null || aweme.getVideo() == null || aweme.getVideo().getVideoTag() == null) {
                    a2.a("video_tag", str14);
                } else {
                    a2.a("video_tag", aweme.getVideo().getVideoTag().getTitle());
                }
            }
            if (i.f79764a) {
                str13 = "1";
            } else {
                str13 = "0";
            }
            a2.a("is_fullscreen", str13);
            a2.a("rank", ac.b(aweme, 9));
        }
        if (z) {
            a2.a("comment_id", str3);
        }
        if (aweme != null) {
            user = aweme.getAuthor();
        } else {
            user = null;
        }
        eu.a(a2, user);
        a2.a("user_level", str10);
        a2.a("comment_author_level", str11);
        if (aweme != null) {
            com.ss.android.ugc.aweme.upvote.event.c.a(a2, aweme, str);
        }
        if (z2 && !TextUtils.equals(str, "homepage_fresh_topic")) {
            a2.a("enter_from", "trending_page");
            a2.a("is_fullscreen", "0");
        }
        if (aweme != null) {
            d a3 = a2.a("enter_method", str2).a("follow_status", com.ss.android.ugc.aweme.story.b.h.a(aweme.getAuthor())).a("follow_status_to_user", i2);
            if (a.d(aweme)) {
                str12 = "story";
            } else {
                str12 = UGCMonitor.TYPE_POST;
            }
            a3.a("story_type", str12).a("story_collection_id", a.b(aweme));
        }
        if (TextUtils.equals("1", str6)) {
            if (!TextUtils.isEmpty(str) && (TextUtils.equals(str, "click_comment_chain") || TextUtils.equals(str, "click_comment_bubble") || TextUtils.equals(str, "push"))) {
                a2.a("comment_enter_method", str);
                a2.a("last_group_id", str7);
            } else if (!TextUtils.isEmpty(str) && TextUtils.equals(str, "notification_page")) {
                a2.a("comment_enter_method", "notification");
                a2.a("last_group_id", str7);
            } else if (!TextUtils.isEmpty(str) && TextUtils.equals(str, UGCMonitor.EVENT_COMMENT)) {
                a2.a("comment_enter_method", "comment_panel");
                a2.a("last_group_id", str7);
            }
            if (!TextUtils.isEmpty(str8)) {
                a2.a("is_video", str8);
                if (TextUtils.equals(str8, "1")) {
                    a2.a("is_others_video", i3);
                }
            }
        }
        String str15 = "like_comment";
        if (ac.a(str)) {
            a2.a("log_pb", ac.a.f91473a.a(com.ss.android.ugc.aweme.metrics.ac.b(aweme)));
            if (!TextUtils.isEmpty(str5)) {
                str14 = str5;
            }
            a2.a("comment_user_id", str14);
            if (!TextUtils.isEmpty(str8)) {
                a2.a("is_video", str8);
                if (TextUtils.equals(str8, "1")) {
                    a2.a("is_others_video", i3);
                }
            }
            if (!TextUtils.equals("1", str6)) {
                str15 = "cancel_like_comment";
            }
            r.a(str15, com.ss.android.ugc.aweme.metrics.ac.a(a2.f66730a));
            return;
        }
        if (!TextUtils.isEmpty(str8)) {
            a2.a("is_video", str8);
            if (TextUtils.equals(str8, "1")) {
                a2.a("is_others_video", i3);
            }
        }
        if (!TextUtils.isEmpty(str9)) {
            a2.a("news_id", str9);
        }
        if (!TextUtils.equals("1", str6)) {
            str15 = "cancel_like_comment";
        }
        r.a(str15, a2.f66730a);
    }
}
