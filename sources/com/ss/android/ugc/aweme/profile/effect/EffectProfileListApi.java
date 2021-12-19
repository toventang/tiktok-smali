package com.ss.android.ugc.aweme.profile.effect;

import com.bytedance.covode.number.Covode;
import f.a.t;
import l.b.f;

public interface EffectProfileListApi {

    /* renamed from: a  reason: collision with root package name */
    public static final a f116266a = a.f116267a;

    static {
        Covode.recordClassIndex(75051);
    }

    @f(a = "/aweme/v1/original/effect/list/")
    t<StickerItemList> fetch(@l.b.t(a = "user_id") String str, @l.b.t(a = "cursor") long j2, @l.b.t(a = "count") int i2);

    public static final class a {

        /* renamed from: a  reason: collision with root package name */
        static final /* synthetic */ a f116267a = new a();

        private a() {
        }

        static {
            Covode.recordClassIndex(75052);
        }
    }
}
