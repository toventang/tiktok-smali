package com.bytedance.android.live.liveinteract.platform.common.g;

import com.bytedance.android.live.liveinteract.api.a.b;
import com.bytedance.android.live.network.e;
import com.bytedance.android.livesdk.b.a.d;
import com.bytedance.android.livesdk.chatroom.api.LinkApi;
import com.bytedance.android.livesdk.j.ac;
import com.bytedance.android.livesdk.userservice.u;
import com.bytedance.android.livesdk.util.rxutils.f;
import com.bytedance.android.livesdkapi.depend.model.live.Room;
import com.bytedance.covode.number.Covode;
import com.bytedance.ies.sdk.datachannel.DataChannelGlobal;
import com.ss.avframework.livestreamv2.core.interact.model.Config;

public final class p {

    /* renamed from: a  reason: collision with root package name */
    public static int f11998a = 5;

    /* renamed from: b  reason: collision with root package name */
    public static int f11999b;

    /* renamed from: c  reason: collision with root package name */
    public static int f12000c = 1;

    /* renamed from: d  reason: collision with root package name */
    private static int f12001d = 4;

    static {
        Covode.recordClassIndex(6543);
    }

    public enum a {
        FAILED_REPLY("server", "reply_fail"),
        FAILED_JOIN_CHANNEL("server", "join_channel_fail"),
        FAILED_RTC_TIMEOUT("rtc", "rtc_timeout"),
        FAILED_RTC_ERROR("rtc", "rtc_error"),
        FAILED_PERMIT("server", "permit_fail");
        
        public String mIssueCategory;
        public String mIssueContent;

        static {
            Covode.recordClassIndex(6544);
        }

        private a(String str, String str2) {
            this.mIssueCategory = str;
            this.mIssueContent = str2;
        }
    }

    public static long a(Throwable th) {
        if (!(th instanceof com.bytedance.android.live.a.a.a)) {
            return -1;
        }
        com.bytedance.android.live.a.a.a aVar = (com.bytedance.android.live.a.a.a) th;
        if (aVar.getErrorCode() != 0) {
            return (long) aVar.getErrorCode();
        }
        return -1;
    }

    public static void a(int i2, long j2) {
        String str = a.FAILED_RTC_TIMEOUT.mIssueCategory;
        String str2 = a.FAILED_RTC_TIMEOUT.mIssueContent;
        String str3 = a.FAILED_RTC_TIMEOUT.mIssueContent + ":" + j2;
        if (i2 == f11999b) {
            b(str, str2, -1, str3);
        } else if (i2 == f12000c) {
            a(str, str2, -1, str3);
        }
    }

    public static void a(int i2, Throwable th) {
        String str = a.FAILED_JOIN_CHANNEL.mIssueCategory;
        String str2 = a.FAILED_JOIN_CHANNEL.mIssueContent;
        long a2 = a(th);
        String th2 = th.toString();
        if (i2 == f11999b) {
            b(str, str2, a2, th2);
        } else if (i2 == f12000c) {
            a(str, str2, a2, th2);
        }
    }

    public static void a(int i2, long j2, String str) {
        String str2 = a.FAILED_RTC_ERROR.mIssueCategory;
        String str3 = a.FAILED_RTC_ERROR.mIssueContent;
        if (i2 == f11999b) {
            b(str2, str3, j2, str);
        } else if (i2 == f12000c) {
            a(str2, str3, j2, str);
        }
    }

    private static void b(String str, String str2, long j2, String str3) {
        long j3;
        String str4;
        long id;
        String secUid;
        long id2 = ((Room) DataChannelGlobal.f34575d.b(ac.class)).getId();
        long j4 = b.a.a().f9940e;
        b a2 = b.a.a();
        com.bytedance.android.live.base.model.user.b a3 = u.a().b().a();
        if (a2.q) {
            j3 = a3.getId();
        } else {
            j3 = a2.f9941f;
        }
        if (a2.q) {
            str4 = a3.getSecUid();
        } else {
            str4 = a2.f9942g;
        }
        if (a2.q) {
            id = a2.f9941f;
        } else {
            id = a3.getId();
        }
        if (a2.q) {
            secUid = a2.f9942g;
        } else {
            secUid = a3.getSecUid();
        }
        a(id2, j4, j3, str4, id, secUid, String.valueOf(f11998a), b.a.a().d().getValue(), str, str2, j2, str3);
    }

    public static void a(String str, String str2, long j2, String str3) {
        long id = ((Room) DataChannelGlobal.f34575d.b(ac.class)).getId();
        ((LinkApi) e.a().a(LinkApi.class)).reportAudienceLinkIssue(id, id, f12001d, Config.Vendor.fromValue(d.a().f14186g).getValue(), str, str2, j2, str3).a(new f()).a(s.f12010a, t.f12011a);
    }

    public static void a(long j2, long j3, long j4, String str, long j5, String str2, String str3, int i2, String str4, String str5, long j6, String str6) {
        ((LinkApi) e.a().a(LinkApi.class)).reportBroadcasterLinkIssue(j2, j3, j4, str, j5, str2, str3, i2, str4, str5, j6, str6).a(new f()).a(q.f12008a, r.f12009a);
    }
}
