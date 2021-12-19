package com.ss.android.ugc.aweme.commercialize.adsetting;

import com.bytedance.covode.number.Covode;
import com.bytedance.retrofit2.b;
import l.b.f;
import l.b.o;
import l.b.t;

public interface AdSettingsApi {

    /* renamed from: a  reason: collision with root package name */
    public static final a f73667a = a.f73668a;

    static {
        Covode.recordClassIndex(45325);
    }

    @f(a = "/aweme/v1/ad/settings/")
    b<String> requestAdSettings(@t(a = "item_id") String str);

    @o(a = "/aweme/v1/ad/settings/code/delete/")
    b<String> requestCodeDelete(@t(a = "item_id") String str, @t(a = "confirm") boolean z);

    @o(a = "/tiktok/v1/ad/auth/extend/")
    b<String> requestCodeExtend(@t(a = "item_id") String str, @t(a = "extend_time") long j2);

    @o(a = "/aweme/v1/ad/settings/code/generate/")
    b<String> requestCodeGenerate(@t(a = "item_id") String str, @t(a = "start_time") long j2, @t(a = "end_time") long j3);

    @o(a = "/tiktok/v1/ad/dark/post/update/")
    b<String> requestDarkPostUpdate(@t(a = "item_id") String str, @t(a = "status") int i2);

    @o(a = "/aweme/v1/ad/settings/promote/update/")
    b<String> requestPromoteUpdate(@t(a = "item_id") String str, @t(a = "promotable") boolean z);

    public static final class a {

        /* renamed from: a  reason: collision with root package name */
        static final /* synthetic */ a f73668a = new a();

        private a() {
        }

        static {
            Covode.recordClassIndex(45326);
        }
    }
}
