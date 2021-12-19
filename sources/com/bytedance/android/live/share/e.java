package com.bytedance.android.live.share;

import android.os.Bundle;
import android.text.TextUtils;
import androidx.lifecycle.m;
import com.bytedance.android.live.base.model.user.User;
import com.bytedance.android.live.core.f.y;
import com.bytedance.android.live.network.response.d;
import com.bytedance.android.livesdk.ab.b;
import com.bytedance.android.livesdk.chatroom.model.ShareReportResult;
import com.bytedance.android.livesdk.j.aq;
import com.bytedance.android.livesdk.j.cd;
import com.bytedance.android.livesdk.j.cg;
import com.bytedance.android.livesdk.j.dl;
import com.bytedance.android.livesdk.j.dn;
import com.bytedance.android.livesdk.j.ee;
import com.bytedance.android.livesdk.model.Hashtag;
import com.bytedance.android.livesdk.model.ba;
import com.bytedance.android.livesdk.userservice.u;
import com.bytedance.android.livesdk.util.rxutils.autodispose.z;
import com.bytedance.android.livesdk.util.rxutils.i;
import com.bytedance.android.livesdkapi.depend.e.c;
import com.bytedance.android.livesdkapi.depend.model.live.Room;
import com.bytedance.android.livesdkapi.depend.model.live.j;
import com.bytedance.android.livesdkapi.host.IHostApp;
import com.bytedance.android.livesdkapi.host.IHostShare;
import com.bytedance.covode.number.Covode;
import com.bytedance.ies.sdk.datachannel.DataChannel;
import com.ss.android.ugc.effectmanager.common.utils.MD5Utils;
import com.ss.ugc.live.sdk.message.interfaces.IMessageManager;
import f.a.d.f;
import h.f.b.l;
import java.util.HashMap;
import java.util.Map;

public final class e {

    /* renamed from: a  reason: collision with root package name */
    public static final e f12603a = new e();

    public static final class b<T> implements f {

        /* renamed from: a  reason: collision with root package name */
        public static final b f12606a = new b();

        static {
            Covode.recordClassIndex(7031);
        }

        b() {
        }

        @Override // f.a.d.f
        public final /* bridge */ /* synthetic */ void accept(Object obj) {
        }
    }

    public static final class c<T> implements f {

        /* renamed from: a  reason: collision with root package name */
        public static final c f12607a = new c();

        static {
            Covode.recordClassIndex(7032);
        }

        c() {
        }

        @Override // f.a.d.f
        public final /* bridge */ /* synthetic */ void accept(Object obj) {
        }
    }

    private e() {
    }

    static {
        Covode.recordClassIndex(7029);
    }

    /* access modifiers changed from: package-private */
    public static final class a<T> implements f {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ Room f12604a;

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ DataChannel f12605b;

        static {
            Covode.recordClassIndex(7030);
        }

        a(Room room, DataChannel dataChannel) {
            this.f12604a = room;
            this.f12605b = dataChannel;
        }

        @Override // f.a.d.f
        public final /* synthetic */ void accept(Object obj) {
            IMessageManager iMessageManager;
            d dVar = (d) obj;
            l.d(dVar, "");
            Room room = this.f12604a;
            DataChannel dataChannel = this.f12605b;
            ShareReportResult shareReportResult = (ShareReportResult) dVar.data;
            if (shareReportResult != null && shareReportResult.getDeltaIntimacy() > 0 && (iMessageManager = (IMessageManager) dataChannel.b(cg.class)) != null) {
                iMessageManager.insertMessage(com.bytedance.android.livesdk.chatroom.b.b.a(room.getId(), shareReportResult.getDisplayText(), (User) dataChannel.b(dn.class)), true);
            }
        }
    }

    private static String a(Bundle bundle) {
        String str;
        if (bundle != null) {
            str = bundle.getString(((IHostShare) com.bytedance.android.live.t.a.a(IHostShare.class)).getBundleKey(3));
        } else {
            str = null;
        }
        if (TextUtils.equals(str, "top_supporters")) {
            return "top_supporters";
        }
        if (TextUtils.equals(str, "recently_shared")) {
            return "recently_shared";
        }
        return "none";
    }

    public static final String a(User user) {
        String str;
        if (user == null) {
            return "";
        }
        com.bytedance.android.live.base.a a2 = com.bytedance.android.live.t.a.a(IHostApp.class);
        l.b(a2, "");
        if (((IHostApp) a2).isInMusicallyRegion()) {
            str = "h5_m";
        } else {
            str = "h5_t";
        }
        return "www.tiktok.com/@" + user.displayId + "/live?source=" + str + "&_r=1";
    }

    public static final void a(Room room, DataChannel dataChannel, String str) {
        l.d(room, "");
        l.d(dataChannel, "");
        l.d(str, "");
        if (com.bytedance.android.livesdk.utils.a.a(dataChannel) && room.author() != null && !TextUtils.equals(str, "chat_merge")) {
            HashMap hashMap = new HashMap();
            com.bytedance.android.live.base.model.user.b author = room.author();
            l.b(author, "");
            hashMap.put("anchor_id", String.valueOf(author.getId()));
            hashMap.put("room_id", String.valueOf(room.getId()));
            com.bytedance.android.livesdk.utils.a.a("live_ad", "live_share", null, hashMap);
        }
    }

    public static final c.a a(Room room, DataChannel dataChannel, String str, String str2, Map<String, String> map) {
        boolean z;
        String userShareText;
        ba userAttr;
        l.d(room, "");
        l.d(dataChannel, "");
        l.d(str2, "");
        com.bytedance.android.livesdk.at.f b2 = u.a().b();
        c.a a2 = com.bytedance.android.livesdkapi.depend.e.c.a(room);
        if (!TextUtils.isEmpty(str)) {
            a2.f22989l = str;
        }
        l.b(b2, "");
        a2.f22981d = b2.c();
        a2.v = room.getId();
        a2.w = room.getOwnerUserId();
        a2.t = com.bytedance.android.livesdk.ab.e.k();
        a2.E = com.bytedance.android.livesdk.ab.e.a();
        a2.F = com.bytedance.android.livesdk.ab.e.d();
        a2.G = str2;
        User user = (User) dataChannel.b(dn.class);
        if (user == null || (userAttr = user.getUserAttr()) == null || !userAttr.f19030b) {
            z = false;
        } else {
            z = true;
        }
        boolean a3 = l.a(dataChannel.b(ee.class), (Object) true);
        if (a3) {
            userShareText = room.getAnchorShareText();
        } else {
            userShareText = room.getUserShareText();
        }
        a2.n = userShareText;
        a2.q = a3;
        a2.r = z;
        a2.s = com.bytedance.android.live.p.l.SHARE.isRedDotShowing(dataChannel);
        a2.A = map;
        a2.u = (String) dataChannel.b(cd.class);
        l.b(a2, "");
        return a2;
    }

    public static final void a(Room room, DataChannel dataChannel, m mVar, String str, String str2, Bundle bundle) {
        String string;
        String str3 = "";
        l.d(room, str3);
        l.d(dataChannel, str3);
        l.d(mVar, str3);
        l.d(str, str3);
        if (!(bundle == null || (string = bundle.getString("shareIdList", str3)) == null)) {
            str3 = string;
        }
        ((z) ((c) com.bytedance.android.live.t.a.a(c.class)).sendShare(room.getId(), str, 1, str2, str3).a(com.bytedance.android.livesdk.util.rxutils.autodispose.e.a(mVar))).a(new a(room, dataChannel), i.f22196a);
    }

    public static final void a(Room room, DataChannel dataChannel, String str, String str2, Bundle bundle, String str3, Map<String, String> map) {
        String str4;
        int i2;
        int i3;
        int i4;
        String str5;
        String str6;
        int i5;
        Long l2;
        l.d(room, "");
        l.d(dataChannel, "");
        l.d(str, "");
        l.d(str2, "");
        l.d(str3, "");
        String mD5String = MD5Utils.getMD5String("share_success" + System.currentTimeMillis());
        if (bundle != null) {
            str4 = bundle.getString("shareIdList", "");
            i2 = bundle.getInt(((IHostShare) com.bytedance.android.live.t.a.a(IHostShare.class)).getBundleKey(2));
        } else {
            str4 = "";
            i2 = 0;
        }
        if (bundle != null) {
            i3 = bundle.getInt(((IHostShare) com.bytedance.android.live.t.a.a(IHostShare.class)).getBundleKey(1));
        } else {
            i3 = 0;
        }
        String str7 = "portrait";
        if (l.a(dataChannel.b(ee.class), (Object) true)) {
            Hashtag hashtag = (Hashtag) dataChannel.b(aq.class);
            if (hashtag == null || (str5 = hashtag.title) == null) {
                str5 = "";
            }
            Hashtag hashtag2 = (Hashtag) dataChannel.b(aq.class);
            if (hashtag2 == null || (l2 = hashtag2.id) == null || (str6 = String.valueOf(l2.longValue())) == null) {
                str6 = "";
            }
            com.bytedance.android.livesdk.ab.b a2 = b.a.a("share").a(dataChannel).a("request_page", str3).a("is_create_group_chat", i2).a("friends_shared_cnt", i3).a("batch_share_type", a(bundle));
            com.bytedance.android.livesdkapi.depend.model.live.i streamType = room.getStreamType();
            l.b(streamType, "");
            com.bytedance.android.livesdk.ab.b a3 = a2.a("live_type", j.a(streamType)).a("share_platform", str).a("user_type", "anchor").a("bind_id", mD5String);
            if (!y.f()) {
                str7 = "landscape";
            }
            com.bytedance.android.livesdk.ab.b a4 = a3.a("room_orientation", str7).a("hashtag_type", str5).a("hash_id", str6).a("initiator", "anchor");
            Integer num = (Integer) dataChannel.b(dl.class);
            if (num != null) {
                i5 = num.intValue();
            } else {
                i5 = 0;
            }
            a4.a("share_num", i5).b();
        } else {
            HashMap hashMap = new HashMap();
            hashMap.put("share_platform", str);
            hashMap.put("share_type", str2);
            hashMap.put("user_type", "user");
            hashMap.put("request_page", str3);
            l.b(mD5String, "");
            hashMap.put("bind_id", mD5String);
            com.bytedance.android.livesdk.chatroom.d a5 = com.bytedance.android.livesdk.chatroom.d.a();
            l.b(a5, "");
            if (!com.bytedance.common.utility.m.a(a5.e())) {
                com.bytedance.android.livesdk.chatroom.d a6 = com.bytedance.android.livesdk.chatroom.d.a();
                l.b(a6, "");
                String e2 = a6.e();
                l.b(e2, "");
                hashMap.put("enter_live_method", e2);
            }
            if (TextUtils.equals(com.bytedance.android.livesdk.ab.e.g(), "click_push_live_cd_user")) {
                hashMap.put("is_subscribe", "1");
            } else {
                hashMap.put("is_subscribe", "0");
            }
            if (y.f()) {
                hashMap.put("room_orientation", str7);
            } else {
                hashMap.put("room_orientation", "landscape");
            }
            com.bytedance.android.livesdk.ab.b a7 = b.a.a("livesdk_share").a(dataChannel).a("is_create_group_chat", i2).a("friends_shared_cnt", i3).a("batch_share_type", a(bundle)).a(map).a((Map<String, String>) hashMap);
            Integer num2 = (Integer) dataChannel.b(dl.class);
            if (num2 != null) {
                i4 = num2.intValue();
            } else {
                i4 = 0;
            }
            a7.a("share_num", i4).b();
        }
        b.a.a("share_info").a("bind_id", mD5String).a("to_user_id", str4).b();
    }
}
