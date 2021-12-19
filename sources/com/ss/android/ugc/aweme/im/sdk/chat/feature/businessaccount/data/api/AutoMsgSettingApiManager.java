package com.ss.android.ugc.aweme.im.sdk.chat.feature.businessaccount.data.api;

import com.bytedance.covode.number.Covode;
import com.bytedance.ies.ugc.appcontext.d;
import com.bytedance.ies.ugc.aweme.network.RetrofitFactory;
import com.google.c.h.a.q;
import com.ss.android.ugc.aweme.base.api.BaseResponse;
import com.ss.android.ugc.aweme.im.sdk.chat.feature.businessaccount.data.a.b;
import com.ss.android.ugc.aweme.im.sdk.chat.feature.businessaccount.data.a.e;
import h.f.b.l;
import l.b.c;
import l.b.f;
import l.b.o;
import l.b.t;

public final class AutoMsgSettingApiManager {

    /* renamed from: a  reason: collision with root package name */
    public static final AutoMsgSettingApi f100406a;

    /* renamed from: b  reason: collision with root package name */
    public static final AutoMsgSettingApiManager f100407b = new AutoMsgSettingApiManager();

    public interface AutoMsgSettingApi {

        /* renamed from: a  reason: collision with root package name */
        public static final a f100408a = a.f100410b;

        static {
            Covode.recordClassIndex(64142);
        }

        @f(a = "/tiktok/v1/ba/auto_reply/get/review_status/")
        q<b> getAutoReply();

        @f(a = "/tiktok/v1/ba/get/message_switch/")
        q<e> getMsgSwitches();

        @f(a = "/tiktok/v1/ba/wel_message/get/review_status/")
        q<com.ss.android.ugc.aweme.im.sdk.chat.feature.businessaccount.data.a.f> getWelMsgReviewStatus();

        @o(a = "/tiktok/v1/ba/open/dm_dialog/report/")
        q<BaseResponse> reportOpenDmDialog(@t(a = "ba_uid") String str);

        @o(a = "/tiktok/v1/ba/set/auto_reply/")
        @l.b.e
        q<BaseResponse> setAutoReply(@c(a = "operation_type") int i2, @c(a = "auto_reply_struct") String str);

        @o(a = "/tiktok/v1/ba/set/message_switch/")
        q<BaseResponse> setMsgSwitch(@t(a = "message_type") int i2, @t(a = "message_switch") int i3);

        @o(a = "/tiktok/v1/ba/set/wel_message/")
        q<BaseResponse> setWelMsg(@t(a = "operation_type") int i2, @t(a = "content") String str, @t(a = "message_id") Long l2);

        public static final class a {

            /* renamed from: a  reason: collision with root package name */
            static final String f100409a = ("https://" + d.f34604k.f34586a);

            /* renamed from: b  reason: collision with root package name */
            static final /* synthetic */ a f100410b = new a();

            private a() {
            }

            static {
                Covode.recordClassIndex(64143);
            }
        }
    }

    private AutoMsgSettingApiManager() {
    }

    static {
        Covode.recordClassIndex(64141);
        Object a2 = RetrofitFactory.a().a(AutoMsgSettingApi.a.f100409a).a(AutoMsgSettingApi.class);
        l.b(a2, "");
        f100406a = (AutoMsgSettingApi) a2;
    }

    public static q<BaseResponse> a(int i2, com.ss.android.ugc.aweme.im.sdk.chat.feature.businessaccount.data.a.d dVar) {
        l.d(dVar, "");
        AutoMsgSettingApi autoMsgSettingApi = f100406a;
        String b2 = com.ss.android.ugc.aweme.live.b.a().b(dVar);
        l.b(b2, "");
        return autoMsgSettingApi.setAutoReply(i2, b2);
    }

    public static q<BaseResponse> a(int i2, String str, Long l2) {
        l.d(str, "");
        return f100406a.setWelMsg(i2, str, l2);
    }
}
