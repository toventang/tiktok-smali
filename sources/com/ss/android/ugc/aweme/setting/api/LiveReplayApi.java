package com.ss.android.ugc.aweme.setting.api;

import com.bytedance.covode.number.Covode;
import com.google.c.h.a.q;
import com.ss.android.ugc.aweme.setting.model.j;
import l.b.f;

public interface LiveReplayApi {

    /* renamed from: a  reason: collision with root package name */
    public static final a f122058a = a.f122059a;

    static {
        Covode.recordClassIndex(80019);
    }

    @f(a = "/aweme/v1/settings/manual/")
    q<j> getLiveReplayEntrance();

    public static final class a {

        /* renamed from: a  reason: collision with root package name */
        static final /* synthetic */ a f122059a = new a();

        private a() {
        }

        static {
            Covode.recordClassIndex(80020);
        }
    }
}
