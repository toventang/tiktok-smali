package com.bytedance.android.live.broadcast.preview.widget;

import android.os.Bundle;
import android.text.TextUtils;
import android.view.View;
import androidx.lifecycle.i;
import androidx.lifecycle.m;
import com.bytedance.android.live.base.model.user.User;
import com.bytedance.android.live.base.model.user.b;
import com.bytedance.android.live.base.model.user.d;
import com.bytedance.android.live.broadcast.preview.widget.base.PreviewToolBaseWidget;
import com.bytedance.android.live.core.f.y;
import com.bytedance.android.live.s.e;
import com.bytedance.android.livesdk.ab.b;
import com.bytedance.android.livesdk.at.f;
import com.bytedance.android.livesdk.j.aq;
import com.bytedance.android.livesdk.model.Hashtag;
import com.bytedance.android.livesdk.userservice.u;
import com.bytedance.android.livesdk.utils.p;
import com.bytedance.android.livesdkapi.depend.e.c;
import com.bytedance.android.livesdkapi.host.IHostApp;
import com.bytedance.android.livesdkapi.model.d;
import com.bytedance.covode.number.Covode;
import com.ss.android.ugc.aweme.au;
import com.ss.android.ugc.effectmanager.common.utils.MD5Utils;
import com.zhiliaoapp.musically.R;
import h.f.b.l;
import java.util.HashMap;
import java.util.Map;

public final class PreviewShareWidget extends PreviewToolBaseWidget implements au {

    /* renamed from: a  reason: collision with root package name */
    private final int f8401a = R.string.gyt;

    /* renamed from: b  reason: collision with root package name */
    private final int f8402b = 2131234583;

    /* renamed from: c  reason: collision with root package name */
    private final User f8403c;

    static {
        Covode.recordClassIndex(4299);
    }

    @Override // com.bytedance.ies.sdk.widgets.LiveWidget, com.bytedance.android.live.broadcast.preview.widget.base.PreviewToolBaseWidget, com.bytedance.android.widget.Widget, androidx.lifecycle.k
    public final void onStateChanged(m mVar, i.a aVar) {
        super.onStateChanged(mVar, aVar);
    }

    @Override // com.bytedance.android.live.broadcast.preview.widget.base.PreviewToolBaseWidget
    public final int a() {
        return this.f8401a;
    }

    @Override // com.bytedance.android.live.broadcast.preview.widget.base.PreviewToolBaseWidget
    public final int b() {
        return this.f8402b;
    }

    @Override // com.bytedance.android.widget.Widget
    public final void show() {
        User user = this.f8403c;
        if (user != null && user.getSecret() != 1) {
            super.show();
        }
    }

    public PreviewShareWidget(User user) {
        this.f8403c = user;
    }

    @Override // com.bytedance.android.live.broadcast.preview.widget.base.PreviewToolBaseWidget
    public final void a(View view) {
        User user;
        String str;
        l.d(view, "");
        f b2 = u.a().b();
        l.b(b2, "");
        b a2 = b2.a();
        if (a2 instanceof User) {
            user = (User) a2;
        } else {
            user = this.f8403c;
        }
        if (user != null && this.context != null) {
            if (user.getSecret() == 1) {
                ((e) com.bytedance.android.live.t.a.a(e.class)).report(p.a(this.context), new d(0, user.getId(), user.getId(), user.getSecUid(), "start_broadcast", com.bytedance.android.livesdk.ab.e.a(), com.bytedance.android.livesdk.ab.e.d(), "click", "report_anchor", ""));
            } else if (com.bytedance.android.live.broadcast.g.b.f7876a != null) {
                HashMap hashMap = new HashMap();
                com.bytedance.android.live.base.a a3 = com.bytedance.android.live.t.a.a(IHostApp.class);
                l.b(a3, "");
                if (((IHostApp) a3).isInMusicallyRegion()) {
                    str = "h5_m";
                } else {
                    str = "h5_t";
                }
                StringBuilder sb = new StringBuilder("www.tiktok.com/@");
                b a4 = b2.a();
                l.b(a4, "");
                StringBuilder sb2 = new StringBuilder(sb.append(a4.getDisplayId()).append("/live?prepare=1&source=").append(str).append("&_r=1").toString());
                b.a.a("anchor_share_click").a(this.dataChannel).a("request_page", "live_take").a("anchor_id", String.valueOf(b2.c())).b();
                c.a aVar = new c.a(d.a.a(), (byte) 0);
                aVar.f22979b = -1;
                com.bytedance.android.livesdkapi.j.a aVar2 = com.bytedance.android.live.broadcast.g.b.f7876a;
                androidx.fragment.app.e a5 = p.a(this.context);
                aVar.f22981d = b2.c();
                aVar.q = true;
                aVar.f22989l = sb2.toString();
                aVar.A = hashMap;
                aVar2.a(a5, aVar.a(), new a(this, b2));
            }
        }
    }

    public static final class a implements com.bytedance.android.livesdkapi.depend.e.b {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ PreviewShareWidget f8404a;

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ f f8405b;

        static {
            Covode.recordClassIndex(4300);
        }

        @Override // com.bytedance.android.livesdkapi.depend.e.b
        public final void a(Throwable th) {
            l.d(th, "");
        }

        a(PreviewShareWidget previewShareWidget, f fVar) {
            this.f8404a = previewShareWidget;
            this.f8405b = fVar;
        }

        @Override // com.bytedance.android.livesdkapi.depend.e.b
        public final void a(String str, String str2, Bundle bundle) {
            String str3;
            String valueOf;
            String str4 = "";
            l.d(str, str4);
            l.d(str2, str4);
            PreviewShareWidget previewShareWidget = this.f8404a;
            f fVar = this.f8405b;
            l.b(fVar, str4);
            if (bundle == null || (str3 = bundle.getString("shareIdList")) == null) {
                str3 = str4;
            }
            l.b(str3, str4);
            String mD5String = MD5Utils.getMD5String("share_success" + System.currentTimeMillis());
            b.a.a("share_info").a("bind_id", mD5String).a("to_user_id", str3).b();
            HashMap hashMap = new HashMap();
            hashMap.put("share_platform", str);
            hashMap.put("share_type", str2);
            hashMap.put("user_type", "anchor");
            hashMap.put("request_page", "live_take");
            l.b(mD5String, str4);
            hashMap.put("bind_id", mD5String);
            hashMap.put("anchor_id", String.valueOf(fVar.c()));
            hashMap.put("initiator", "anchor");
            String g2 = com.bytedance.android.livesdk.ab.e.g();
            if (TextUtils.isEmpty(g2) || !l.a((Object) "click_push_live_cd_user", (Object) g2)) {
                hashMap.put("is_subscribe", "0");
            } else {
                hashMap.put("is_subscribe", "1");
            }
            if (y.f()) {
                hashMap.put("room_orientation", "portrait");
            } else {
                hashMap.put("room_orientation", "landscape");
            }
            Hashtag hashtag = (Hashtag) previewShareWidget.dataChannel.b(aq.class);
            if (hashtag != null) {
                String str5 = hashtag.title;
                if (str5 == null) {
                    str5 = str4;
                }
                hashMap.put("hash_type", str5);
                Long l2 = hashtag.id;
                if (!(l2 == null || (valueOf = String.valueOf(l2.longValue())) == null)) {
                    str4 = valueOf;
                }
                hashMap.put("hashtag_id", str4);
            }
            b.a.a("share").a(previewShareWidget.dataChannel).a((Map<String, String>) hashMap).b();
        }
    }
}
