package com.ss.android.ugc.aweme.app.f;

import b.i;
import com.bytedance.covode.number.Covode;
import com.ss.android.ugc.aweme.common.r;
import com.ss.android.ugc.aweme.feed.model.Aweme;
import com.ss.android.ugc.aweme.feed.model.AwemeStatus;
import com.ss.android.ugc.aweme.feed.model.VideoControl;
import com.ss.android.ugc.aweme.profile.model.User;
import com.ss.android.ugc.aweme.share.AwemeACLStruct;
import com.ss.android.ugc.aweme.utils.dg;
import com.ss.android.ugc.aweme.utils.in;
import h.f.b.l;
import h.z;
import java.util.concurrent.Callable;

public final class b {

    /* renamed from: a  reason: collision with root package name */
    static final String f66716a = "download_tns";

    /* renamed from: b  reason: collision with root package name */
    static final String f66717b = "is_author";

    /* renamed from: c  reason: collision with root package name */
    static final String f66718c = "is_friend";

    /* renamed from: d  reason: collision with root package name */
    static final String f66719d = "click_btn";

    /* renamed from: e  reason: collision with root package name */
    static final String f66720e = "gid";

    /* renamed from: f  reason: collision with root package name */
    static final String f66721f = "download_addr";

    /* renamed from: g  reason: collision with root package name */
    static final String f66722g = "monitor_type";

    /* renamed from: h  reason: collision with root package name */
    static final String f66723h = "server_ctx";

    /* renamed from: i  reason: collision with root package name */
    public static final b f66724i = new b();

    private b() {
    }

    static {
        Covode.recordClassIndex(41070);
    }

    static final class a<V> implements Callable {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ Aweme f66725a;

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ String f66726b;

        /* renamed from: c  reason: collision with root package name */
        final /* synthetic */ String f66727c;

        static {
            Covode.recordClassIndex(41071);
        }

        a(Aweme aweme, String str, String str2) {
            this.f66725a = aweme;
            this.f66726b = str;
            this.f66727c = str2;
        }

        @Override // java.util.concurrent.Callable
        public final /* synthetic */ Object call() {
            User author;
            if (!com.ss.android.ugc.aweme.account.b.g().isMe(this.f66725a.getAuthorUid())) {
                d dVar = new d();
                dVar.a(b.f66717b, (Object) false);
                dVar.a(b.f66718c, Boolean.valueOf(b.a(this.f66725a)));
                dVar.a(b.f66719d, this.f66726b);
                dVar.a(b.f66720e, this.f66725a.getAid());
                dVar.a(b.f66721f, this.f66727c);
                String str = b.f66722g;
                Aweme aweme = this.f66725a;
                l.d(aweme, "");
                StringBuilder sb = new StringBuilder();
                AwemeStatus status = aweme.getStatus();
                if (status != null && status.getReviewStatus() == 1) {
                    sb.append("1,");
                }
                if (aweme.getStatus() != null) {
                    AwemeStatus status2 = aweme.getStatus();
                    l.b(status2, "");
                    if (status2.isDelete()) {
                        sb.append("2,");
                    }
                }
                if (in.b(aweme.getAuthor(), com.ss.android.ugc.aweme.account.b.g().isMe(aweme.getAuthorUid()))) {
                    sb.append("3,");
                }
                AwemeStatus status3 = aweme.getStatus();
                if (status3 != null && status3.getReviewStatus() == 2) {
                    sb.append("4,");
                }
                if (aweme.isPrivate()) {
                    sb.append("5,");
                }
                AwemeStatus status4 = aweme.getStatus();
                if (status4 != null && status4.getPrivateStatus() == 2 && !b.a(aweme)) {
                    sb.append("6,");
                }
                VideoControl videoControl = aweme.getVideoControl();
                if ((videoControl != null && videoControl.preventDownloadType == 3) || ((author = aweme.getAuthor()) != null && author.getDownloadSetting() == 3)) {
                    sb.append("7,");
                }
                String sb2 = sb.toString();
                l.b(sb2, "");
                if (sb.length() > 0) {
                    sb2 = sb.substring(0, sb.length() - 1);
                    l.b(sb2, "");
                }
                dVar.a(str, sb2);
                dVar.a(b.f66723h, dg.a().b(new AwemeACLStruct.ServerExtra().buildServerExtraJson(this.f66725a)));
                r.a(b.f66716a, dVar.f66730a);
            }
            return z.f158842a;
        }
    }

    public static boolean a(Aweme aweme) {
        if (aweme == null || aweme.getAuthor() == null) {
            return false;
        }
        User author = aweme.getAuthor();
        l.b(author, "");
        if (author.getFollowStatus() == 2) {
            return true;
        }
        return false;
    }

    public static final void a(Aweme aweme, String str, String str2) {
        if (aweme != null) {
            i.b(new a(aweme, str, str2), i.f4824a);
        }
    }
}
