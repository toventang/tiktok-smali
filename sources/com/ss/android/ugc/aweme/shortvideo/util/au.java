package com.ss.android.ugc.aweme.shortvideo.util;

import com.bytedance.covode.number.Covode;
import com.ss.android.ugc.aweme.comment.model.CommentVideoModel;
import com.ss.android.ugc.aweme.common.r;
import com.ss.android.ugc.aweme.port.in.g;
import com.ss.android.ugc.aweme.port.in.u;
import com.ss.android.ugc.aweme.port.in.z;
import com.ss.android.ugc.aweme.shortvideo.ShortVideoContext;
import com.ss.android.ugc.aweme.shortvideo.dv;
import com.ss.android.ugc.aweme.shortvideo.model.CommentUtils;
import com.ss.android.ugc.aweme.sticker.data.QaStruct;
import com.ss.android.ugc.tools.f.b;
import h.f.b.l;

public final class au {

    /* renamed from: a  reason: collision with root package name */
    public static final au f132237a = new au();

    private au() {
    }

    static {
        Covode.recordClassIndex(86600);
    }

    public static final void a(ShortVideoContext shortVideoContext) {
        String str;
        String awemeUserId;
        z A;
        Object obj;
        String str2 = "";
        l.d(shortVideoContext, str2);
        at.a();
        at.f132233a = System.currentTimeMillis();
        if (l.a((Object) "push", (Object) shortVideoContext.r)) {
            r.a("shoot", new b().a("creation_id", shortVideoContext.q).a("shoot_way", shortVideoContext.r).a("enter_from", shortVideoContext.r).a("enter_method", str2).a("prop_id", shortVideoContext.T).f149193a);
        } else if (l.a((Object) "comment_reply", (Object) shortVideoContext.r) || l.a((Object) "question_and_answer", (Object) shortVideoContext.r) || l.a((Object) "sticker_comment_reply", (Object) shortVideoContext.r)) {
            if (CommentUtils.isDataValid(shortVideoContext.f124767l)) {
                b a2 = new b().a("shoot_way", shortVideoContext.r).a("enter_method", shortVideoContext.f124767l.getEnterMethod()).a("enter_from", shortVideoContext.f124767l.getEnterFrom()).a("reply_comment_id", shortVideoContext.f124767l.getCommentId()).a("reply_user_id", shortVideoContext.f124767l.getUserId());
                if (l.a((Object) "comment_reply", (Object) shortVideoContext.r)) {
                    CommentVideoModel commentVideoModel = shortVideoContext.f124767l;
                    String str3 = null;
                    if (commentVideoModel != null) {
                        str = commentVideoModel.getAwemeUserId();
                    } else {
                        str = null;
                    }
                    u a3 = g.a();
                    if (!(a3 == null || (A = a3.A()) == null)) {
                        str3 = A.c();
                    }
                    if (l.a((Object) str, (Object) str3)) {
                        a2.a("is_others_video", 0);
                    } else {
                        CommentVideoModel commentVideoModel2 = shortVideoContext.f124767l;
                        if (!(commentVideoModel2 == null || (awemeUserId = commentVideoModel2.getAwemeUserId()) == null || awemeUserId.length() == 0)) {
                            a2.a("is_others_video", 1);
                        }
                    }
                }
                r.a("shoot", a2.f149193a);
            }
        } else if (l.a((Object) "answer", (Object) shortVideoContext.r) || l.a((Object) "question", (Object) shortVideoContext.r)) {
            b a4 = new b().a("shoot_way", shortVideoContext.r).a("enter_from", shortVideoContext.x).a("enter_method", shortVideoContext.y).a("qa_type", shortVideoContext.r);
            QaStruct qaStruct = shortVideoContext.f124768m;
            if (qaStruct != null) {
                obj = Long.valueOf(qaStruct.getQuestionId());
            } else {
                obj = str2;
            }
            b a5 = a4.a("question_id", obj);
            String a6 = dv.a();
            if (a6 == null) {
                a6 = str2;
            }
            b a7 = a5.a("from_group_id", a6);
            String str4 = dv.f126643b;
            if (str4 == null) {
                str4 = str2;
            }
            b a8 = a7.a("last_group_id", str4);
            String str5 = dv.f126644c;
            if (str5 != null) {
                str2 = str5;
            }
            r.a("shoot", a8.a("last_gid_from", str2).f149193a);
        } else if (l.a((Object) "story", (Object) shortVideoContext.r)) {
            r.a("shoot", new b().a("creation_id", shortVideoContext.q).a("shoot_way", shortVideoContext.r).a("shoot_entrance", "story").a("shoot_page", "video_shoot_page").a("enter_method", shortVideoContext.y).a("enter_from", shortVideoContext.x).a("is_westwindow_exist", shortVideoContext.aR).f149193a);
        }
    }

    public static final void a(String str, ShortVideoContext shortVideoContext) {
        Object obj;
        l.d(shortVideoContext, "");
        b a2 = new b().a("creation_id", shortVideoContext.q).a("shoot_way", shortVideoContext.r).a("shoot_page", "video_shoot_page").a("is_westwindow_exist", shortVideoContext.aR).a("shoot_enter_method", shortVideoContext.y).a("exit_method", str);
        if (at.f132233a >= 0) {
            obj = Long.valueOf(System.currentTimeMillis() - at.f132233a);
        } else {
            obj = "-1";
        }
        r.a("shoot_exit", a2.a("shoot_exit_duration", obj).a("furthest_page", at.f132234b).f149193a);
    }
}
