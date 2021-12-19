package com.ss.android.ugc.aweme.comment.page.tag.api;

import com.bytedance.covode.number.Covode;
import com.bytedance.retrofit2.b;
import com.ss.android.ugc.aweme.base.api.BaseResponse;
import f.a.t;
import h.f.b.l;
import l.b.c;
import l.b.e;
import l.b.f;
import l.b.o;

public interface VideoTagApi {

    /* renamed from: a  reason: collision with root package name */
    public static final a f72226a = a.f72227a;

    static {
        Covode.recordClassIndex(44514);
    }

    @f(a = "/tiktok/interaction/mention/general/aweme/check/v1")
    t<b> mentionAwemeCheck(@l.b.t(a = "aweme_id") long j2);

    @f(a = "/tiktok/interaction/mention/general/check/v1")
    t<b> mentionCheck(@l.b.t(a = "uids") String str, @l.b.t(a = "mention_type") String str2, @l.b.t(a = "is_check_aweme") boolean z, @l.b.t(a = "aweme_id") long j2);

    @f(a = "/tiktok/interaction/mention/recent/contact/query/v1")
    b<e> mentionRecentContactQuery(@l.b.t(a = "mention_type") int i2, @l.b.t(a = "aweme_id") long j2, @l.b.t(a = "is_check_aweme") boolean z);

    @o(a = "/tiktok/interaction/mention/tag/update/v1")
    @e
    t<BaseResponse> tagUpdate(@c(a = "add_uids") String str, @c(a = "remove_uids") String str2, @c(a = "aweme_id") long j2);

    public static final class a {

        /* renamed from: a  reason: collision with root package name */
        static final /* synthetic */ a f72227a = new a();

        private a() {
        }

        static {
            Covode.recordClassIndex(44515);
        }

        public static VideoTagApi a() {
            String str = com.ss.android.c.b.f59141e;
            l.b(str, "");
            return (VideoTagApi) com.bytedance.ies.ugc.aweme.network.ext.a.a().a(str).a(VideoTagApi.class);
        }
    }
}
