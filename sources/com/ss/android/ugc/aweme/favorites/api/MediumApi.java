package com.ss.android.ugc.aweme.favorites.api;

import com.bytedance.covode.number.Covode;
import com.google.c.h.a.q;
import com.ss.android.ugc.aweme.app.api.Api;
import h.f.b.l;
import l.b.f;
import l.b.t;

public final class MediumApi {

    /* renamed from: a  reason: collision with root package name */
    public static final String f90434a;

    /* renamed from: b  reason: collision with root package name */
    public static MediumDataApi f90435b;

    /* renamed from: c  reason: collision with root package name */
    public static final a f90436c = new a((byte) 0);

    public interface MediumDataApi {
        static {
            Covode.recordClassIndex(56769);
        }

        @f(a = "/aweme/v1/anchor/medium/collect/")
        q<Object> changeMediumState(@t(a = "medium_id") String str, @t(a = "action") int i2);

        @f(a = "/aweme/v1/anchor/medium/collection/")
        q<Object> getMediumList(@t(a = "cursor") int i2, @t(a = "count") int i3);
    }

    public static final class a {
        static {
            Covode.recordClassIndex(56770);
        }

        private a() {
        }

        public /* synthetic */ a(byte b2) {
            this();
        }
    }

    static {
        Covode.recordClassIndex(56768);
        String str = Api.f66569d;
        f90434a = str;
        l.b(str, "");
        f90435b = (MediumDataApi) com.bytedance.ies.ugc.aweme.network.ext.a.a().a(str).a(MediumDataApi.class);
    }
}
