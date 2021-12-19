package com.ss.android.ugc.aweme.userservice.jedi.model;

import com.bytedance.covode.number.Covode;
import com.ss.android.ugc.aweme.profile.model.CommitRemarkNameResponse;
import f.a.t;
import l.b.c;
import l.b.e;
import l.b.o;

public interface JediRemarkApi {

    /* renamed from: a  reason: collision with root package name */
    public static final a f142477a = a.f142478a;

    static {
        Covode.recordClassIndex(93182);
    }

    @o(a = "/aweme/v1/user/remark/name/")
    @e
    t<CommitRemarkNameResponse> commitRemarkName(@c(a = "remark_name") String str, @c(a = "user_id") String str2, @c(a = "sec_user_id") String str3);

    public static final class a {

        /* renamed from: a  reason: collision with root package name */
        static final /* synthetic */ a f142478a = new a();

        private a() {
        }

        static {
            Covode.recordClassIndex(93183);
        }
    }
}
