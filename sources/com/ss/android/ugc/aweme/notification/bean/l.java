package com.ss.android.ugc.aweme.notification.bean;

import android.text.TextUtils;
import com.bytedance.covode.number.Covode;
import com.google.gson.f;
import com.ss.android.ugc.aweme.common.r;
import com.ss.android.ugc.aweme.feed.model.LogPbBean;
import java.util.HashMap;
import java.util.Map;

public final class l {

    /* renamed from: a  reason: collision with root package name */
    public String f113254a;

    /* renamed from: b  reason: collision with root package name */
    public String f113255b;

    /* renamed from: c  reason: collision with root package name */
    public int f113256c;

    /* renamed from: d  reason: collision with root package name */
    public String f113257d;

    /* renamed from: e  reason: collision with root package name */
    public String f113258e;

    /* renamed from: f  reason: collision with root package name */
    public String f113259f;

    /* renamed from: g  reason: collision with root package name */
    public long f113260g;

    /* renamed from: h  reason: collision with root package name */
    public String f113261h;

    /* renamed from: i  reason: collision with root package name */
    public String f113262i;

    /* renamed from: j  reason: collision with root package name */
    public String f113263j;

    /* renamed from: k  reason: collision with root package name */
    public int f113264k;

    /* renamed from: l  reason: collision with root package name */
    public LogPbBean f113265l;

    /* renamed from: m  reason: collision with root package name */
    public String f113266m;
    public String n;
    public String o;
    public String p;
    public String q;
    public String r;
    public int s = -1;
    public String t;
    public String u;
    public String v;
    public String w;
    private Map<String, String> x = new HashMap();

    static {
        Covode.recordClassIndex(72823);
    }

    public final void a() {
        a("action_type", this.f113254a);
        a("account_type", this.f113255b);
        a("client_order", String.valueOf(this.f113256c));
        a("notice_type", this.f113257d);
        a("notification_type", this.f113258e);
        a("message_time", String.valueOf(this.f113260g));
        a("from_user_id", this.f113261h);
        a("from_item", this.f113262i);
        a("from_item_id", this.f113263j);
        a("is_together", String.valueOf(this.f113264k));
        a("enter_from", this.o);
        a("with_follow_button", this.w);
        a("rec_type", this.v);
        if (!TextUtils.isEmpty(this.n)) {
            a("scene_id", this.n);
        }
        if (!TextUtils.isEmpty(this.q)) {
            a("tab_name", this.q);
        }
        if (!TextUtils.isEmpty(this.f113266m)) {
            a("timeline", this.f113266m);
        }
        if (!TextUtils.isEmpty(this.f113259f)) {
            a("follow_button", this.f113259f);
        }
        if (!TextUtils.isEmpty(this.r)) {
            a("explain_relation", this.r);
        }
        if (this.f113265l != null) {
            a("log_pb", new f().b(this.f113265l));
        }
        int i2 = this.s;
        if (i2 != -1) {
            a("is_read", String.valueOf(i2));
        }
        if (!TextUtils.isEmpty(this.p)) {
            a("button_type", this.p);
        }
        if (!TextUtils.isEmpty(this.t)) {
            a("group_id", this.t);
            a("story_type", this.u);
        }
        r.a("notification_message_inner_message", this.x);
    }

    private void a(String str, String str2) {
        this.x.put(str, str2);
    }
}
