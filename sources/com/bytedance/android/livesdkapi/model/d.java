package com.bytedance.android.livesdkapi.model;

import android.net.Uri;
import android.text.TextUtils;
import com.bytedance.android.live.base.model.user.b;
import com.bytedance.android.livesdk.ab.e;
import com.bytedance.android.livesdk.j.ar;
import com.bytedance.android.livesdk.model.Hashtag;
import com.bytedance.android.livesdk.userservice.u;
import com.bytedance.covode.number.Covode;
import com.bytedance.ies.sdk.datachannel.DataChannelGlobal;

public class d {

    /* renamed from: a  reason: collision with root package name */
    public String f23274a = "half_screen";

    /* renamed from: b  reason: collision with root package name */
    public long f23275b;

    /* renamed from: c  reason: collision with root package name */
    public long f23276c;

    /* renamed from: d  reason: collision with root package name */
    public long f23277d;

    /* renamed from: e  reason: collision with root package name */
    public int f23278e;

    /* renamed from: f  reason: collision with root package name */
    public int f23279f;

    /* renamed from: g  reason: collision with root package name */
    public String f23280g;

    /* renamed from: h  reason: collision with root package name */
    public String f23281h;

    /* renamed from: i  reason: collision with root package name */
    public String f23282i = "";

    /* renamed from: j  reason: collision with root package name */
    public String f23283j = "";

    /* renamed from: k  reason: collision with root package name */
    public String f23284k = "";

    /* renamed from: l  reason: collision with root package name */
    public String f23285l = "";

    /* renamed from: m  reason: collision with root package name */
    public boolean f23286m = true;
    public final String n;
    public String o = "1";
    public long p;
    public String q;
    public boolean r;
    public String s;

    static {
        Covode.recordClassIndex(13843);
    }

    public final String a() {
        b a2;
        if (u.a().b() == null || (a2 = u.a().b().a()) == null) {
            return "";
        }
        if (a2.getId() == this.f23276c) {
            return "anchor";
        }
        if (a2.getUserAttr() != null && a2.getUserAttr().f19030b) {
            return "admin";
        }
        if (this.r) {
            return "guest_viewer";
        }
        return "viewer";
    }

    public final String a(String str) {
        String str2;
        String str3;
        String str4 = "";
        if (TextUtils.isEmpty(str)) {
            return str4;
        }
        Uri.Builder buildUpon = Uri.parse(str).buildUpon();
        buildUpon.appendQueryParameter("room_id", String.valueOf(this.f23275b));
        buildUpon.appendQueryParameter("anchor_id", String.valueOf(this.f23276c));
        if (TextUtils.isEmpty(this.f23280g)) {
            buildUpon.appendQueryParameter("reported_user_id", String.valueOf(this.f23277d));
        } else {
            buildUpon.appendQueryParameter("sec_reported_user_id", this.f23280g);
        }
        if (DataChannelGlobal.f34575d.b(ar.class) != null) {
            str4 = ((Hashtag) DataChannelGlobal.f34575d.b(ar.class)).title;
            str2 = String.valueOf(((Hashtag) DataChannelGlobal.f34575d.b(ar.class)).id);
        } else {
            str2 = str4;
        }
        buildUpon.appendQueryParameter("to_user_id", String.valueOf(this.f23277d));
        buildUpon.appendQueryParameter("admin_type", a());
        buildUpon.appendQueryParameter("report_type", this.n);
        buildUpon.appendQueryParameter("request_page", this.f23281h);
        buildUpon.appendQueryParameter("enter_from_merge", this.f23282i);
        buildUpon.appendQueryParameter("enter_method", this.f23283j);
        if (this.f23286m) {
            str3 = "0";
        } else {
            str3 = "1";
        }
        buildUpon.appendQueryParameter("landscape", str3);
        buildUpon.appendQueryParameter("action_type", this.f23284k);
        buildUpon.appendQueryParameter("event_page", "live_detail");
        buildUpon.appendQueryParameter("hashtag_type", str4);
        buildUpon.appendQueryParameter("hashtag_id", str2);
        buildUpon.appendQueryParameter("event_page", "live_detail");
        buildUpon.appendQueryParameter("page_style", this.f23274a);
        buildUpon.appendQueryParameter("timestamp", String.valueOf(System.currentTimeMillis()));
        if (!TextUtils.isEmpty(this.s)) {
            buildUpon.appendQueryParameter("scene", this.s);
        }
        if (!TextUtils.isEmpty(this.f23285l)) {
            buildUpon.appendQueryParameter("request_id", this.f23285l);
        }
        if ("report_message".equals(this.n) || "report_question".equals(this.n)) {
            buildUpon.appendQueryParameter("chat_type", String.valueOf(this.o));
            long j2 = this.p;
            if (j2 > 0) {
                buildUpon.appendQueryParameter("msg_id", String.valueOf(j2));
            }
            if (!TextUtils.isEmpty(this.q)) {
                buildUpon.appendQueryParameter("content", this.q);
            }
        }
        if (!TextUtils.isEmpty(e.b())) {
            buildUpon.appendQueryParameter("toplive_position", e.b());
        }
        return buildUpon.toString();
    }

    public d(long j2, long j3, long j4, String str, String str2, String str3, String str4, String str5, String str6, String str7) {
        this.f23275b = j2;
        this.f23276c = j3;
        this.f23277d = j4;
        this.f23280g = str;
        this.f23281h = str2;
        this.n = str6;
        this.f23282i = str3;
        this.f23283j = str4;
        this.f23284k = str5;
        this.f23285l = str7;
    }

    public d(long j2, long j3, long j4, String str, String str2, long j5, String str3, String str4, String str5, String str6, String str7, String str8) {
        this.f23275b = j2;
        this.f23276c = j3;
        this.f23277d = j4;
        this.f23280g = str;
        this.f23281h = str2;
        this.p = j5;
        this.q = str3;
        this.n = str7;
        this.o = str8;
        this.f23285l = str4;
        this.f23282i = str5;
        this.f23283j = str6;
    }
}
