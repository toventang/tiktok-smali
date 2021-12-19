package com.ss.android.newmedia.eplatform.api;

import b.i;
import com.bytedance.covode.number.Covode;
import com.bytedance.retrofit2.b.g;
import l.b.c;
import l.b.o;

public interface EPlatformApi {

    /* renamed from: a  reason: collision with root package name */
    public static final a f59972a = a.f59973a;

    static {
        Covode.recordClassIndex(37058);
    }

    @o(a = "/aweme/v1/saiyan/seclink/verify/")
    @g
    i<Object> hostVerify(@c(a = "target") String str);

    public static final class a {

        /* renamed from: a  reason: collision with root package name */
        static final /* synthetic */ a f59973a = new a();

        private a() {
        }

        static {
            Covode.recordClassIndex(37059);
        }
    }
}
