package com.tt.appbrandimpl;

import com.bytedance.covode.number.Covode;
import com.bytedance.ies.ugc.aweme.network.ext.a;
import com.bytedance.ies.ugc.aweme.network.f;
import com.google.c.h.a.q;
import l.b.t;
import l.b.x;

public final class MicroAppApi {

    /* renamed from: a  reason: collision with root package name */
    private static final f f155065a = a.a("https://");

    public interface RealApi {
        static {
            Covode.recordClassIndex(103222);
        }

        @l.b.f
        q<String> executeGet(int i2, @x String str);

        @l.b.f(a = "https:///aweme/v1/microapp/follow/relation/")
        q<Object> getFollowRelation(@t(a = "from_user_token") String str, @t(a = "to_user_id") long j2);

        @l.b.f(a = "/developer/api/get_gid/")
        q<Object> getGid(@t(a = "alias_id") String str);

        @l.b.f(a = "https:///aweme/v1/microapp/record/list/")
        q<Object> getMicroAppList(@t(a = "page") int i2, @t(a = "page_size") int i3, @t(a = "list_type") int i4);

        @l.b.f(a = "https:///aweme/v1/microapp/mutual/follow/")
        q<Object> mutualFollowUser(@t(a = "from_user_id") long j2, @t(a = "to_user_id") long j3, @t(a = "sec_from_user_id") String str);

        @l.b.f(a = "https:///aweme/v1/microapp/record/update/")
        q<Object> updateMicroRecord(@t(a = "schema") String str);
    }

    static {
        Covode.recordClassIndex(103221);
    }
}
