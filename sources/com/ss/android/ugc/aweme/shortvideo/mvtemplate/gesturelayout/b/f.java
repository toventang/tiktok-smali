package com.ss.android.ugc.aweme.shortvideo.mvtemplate.gesturelayout.b;

import com.bytedance.covode.number.Covode;
import com.ss.android.ugc.aweme.comment.model.CommentVideoModel;
import com.ss.android.ugc.aweme.common.r;
import com.ss.android.ugc.aweme.shortvideo.ShortVideoContext;
import com.ss.android.ugc.aweme.shortvideo.model.CommentUtils;
import com.ss.android.ugc.tools.f.b;
import h.f.b.l;

public final class f {

    /* renamed from: b  reason: collision with root package name */
    public static final a f129281b = new a((byte) 0);

    /* renamed from: a  reason: collision with root package name */
    public final b f129282a;

    /* renamed from: c  reason: collision with root package name */
    private final ShortVideoContext f129283c;

    static {
        Covode.recordClassIndex(84855);
    }

    public static final class a {
        static {
            Covode.recordClassIndex(84856);
        }

        private a() {
        }

        public /* synthetic */ a(byte b2) {
            this();
        }
    }

    public final void a() {
        r.a("upload_content_next", this.f129282a.f149193a);
    }

    public final f a(int i2) {
        this.f129282a.a("duration_ms", i2);
        return this;
    }

    public final f b(int i2) {
        this.f129282a.a("is_add_more", i2);
        return this;
    }

    public final f a(ShortVideoContext shortVideoContext) {
        String str;
        String enterMethod;
        if (shortVideoContext != null) {
            CommentVideoModel commentVideoModel = shortVideoContext.f124767l;
            b bVar = this.f129282a;
            String str2 = null;
            String str3 = "";
            if (!CommentUtils.needMob(shortVideoContext)) {
                str = str3;
            } else if (commentVideoModel != null) {
                str = commentVideoModel.getCommentId();
            } else {
                str = null;
            }
            b a2 = bVar.a("reply_comment_id", str);
            if (!CommentUtils.needMob(shortVideoContext)) {
                str2 = str3;
            } else if (commentVideoModel != null) {
                str2 = commentVideoModel.getUserId();
            }
            b a3 = a2.a("reply_user_id", str2);
            if (!(commentVideoModel == null || (enterMethod = commentVideoModel.getEnterMethod()) == null)) {
                str3 = enterMethod;
            }
            a3.a("enter_method", str3);
        }
        return this;
    }

    public f(ShortVideoContext shortVideoContext, String str, String str2, int i2, int i3, String str3, boolean z) {
        String str4;
        String str5;
        String str6 = "";
        l.d(str, str6);
        l.d(str2, str6);
        l.d(str3, str6);
        this.f129283c = shortVideoContext;
        b bVar = new b();
        this.f129282a = bVar;
        b a2 = bVar.a("content_type", str);
        if (!(shortVideoContext == null || (str5 = shortVideoContext.f124759d) == null)) {
            str6 = str5;
        }
        b a3 = a2.a("upload_method", str6).a("content_source", "upload").a("upload_type", str2).a("mix_type", str3).a("is_multi_content", z ? 1 : 0).a("pic_cnt", i3).a("video_cnt", i2);
        if (shortVideoContext != null) {
            a3.a("shoot_way", shortVideoContext.r);
            a3.a("creation_id", shortVideoContext.q);
            if (shortVideoContext.aD) {
                str4 = "album_content_detail";
            } else {
                str4 = "album_panel";
            }
            a3.a("enter_from", str4);
        }
    }
}
