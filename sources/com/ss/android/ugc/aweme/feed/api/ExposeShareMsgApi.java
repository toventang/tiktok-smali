package com.ss.android.ugc.aweme.feed.api;

import android.text.TextUtils;
import com.bytedance.covode.number.Covode;
import com.bytedance.ies.ugc.aweme.network.RetrofitFactory;
import com.ss.android.c.b;
import com.ss.android.ugc.aweme.feed.model.ExposeSharerData;
import f.a.t;
import l.b.f;

public final class ExposeShareMsgApi {

    /* renamed from: a  reason: collision with root package name */
    public static final ExposeShareMsgApi f91920a = new ExposeShareMsgApi();

    /* renamed from: b  reason: collision with root package name */
    private static final RealApi f91921b = ((RealApi) RetrofitFactory.a().b(b.f59141e).d().a(RealApi.class));

    public interface RealApi {
        static {
            Covode.recordClassIndex(57865);
        }

        @f(a = "/tiktok/v1/sharer/info/")
        t<ExposeSharerData> getSharerMsg(@l.b.t(a = "link_id") String str, @l.b.t(a = "share_source") String str2, @l.b.t(a = "from_uid") String str3, @l.b.t(a = "sec_from_uid") String str4, @l.b.t(a = "item_id") String str5, @l.b.t(a = "checksum") String str6, @l.b.t(a = "timestamp") String str7);
    }

    private ExposeShareMsgApi() {
    }

    static {
        Covode.recordClassIndex(57864);
    }

    public static t<ExposeSharerData> a(String str, String str2, String str3, String str4, String str5, String str6, String str7) {
        if (!TextUtils.isEmpty(str4)) {
            str3 = "";
        }
        return f91921b.getSharerMsg(str, str2, str3, str4, str5, str6, str7);
    }
}
