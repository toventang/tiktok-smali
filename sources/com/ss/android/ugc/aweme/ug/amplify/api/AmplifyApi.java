package com.ss.android.ugc.aweme.ug.amplify.api;

import com.bytedance.covode.number.Covode;
import f.a.b;
import l.b.c;
import l.b.e;
import l.b.o;
import l.b.x;

public interface AmplifyApi {

    /* renamed from: a  reason: collision with root package name */
    public static final a f141717a = a.f141718a;

    static {
        Covode.recordClassIndex(92627);
    }

    @o
    @e
    b confirmAction(@x String str, @c(a = "select_type") String str2);

    @o(a = "/aweme/v2/ug/ugc/permission/user/perm/refuse")
    b refuseAction();

    public static final class a {

        /* renamed from: a  reason: collision with root package name */
        static final /* synthetic */ a f141718a = new a();

        private a() {
        }

        static {
            Covode.recordClassIndex(92628);
        }
    }
}
