package com.bytedance.android.livesdk.model.message;

import com.bytedance.android.livesdk.ac.b.a;
import com.bytedance.android.livesdk.model.message.c.b;
import com.bytedance.covode.number.Covode;
import com.google.gson.a.c;

public class bv extends a {
    @c(a = "content")

    /* renamed from: a  reason: collision with root package name */
    public String f19367a;
    @c(a = "notice_type")

    /* renamed from: f  reason: collision with root package name */
    public int f19368f;
    @c(a = "style")

    /* renamed from: g  reason: collision with root package name */
    public String f19369g;
    @c(a = "title")

    /* renamed from: h  reason: collision with root package name */
    public b f19370h;
    @c(a = "violation_reason")

    /* renamed from: i  reason: collision with root package name */
    public b f19371i;
    @c(a = "display_text")

    /* renamed from: j  reason: collision with root package name */
    public b f19372j;
    @c(a = "tips_title")

    /* renamed from: k  reason: collision with root package name */
    public b f19373k;
    @c(a = "tips_url")

    /* renamed from: l  reason: collision with root package name */
    public String f19374l;
    @c(a = "notice_title")

    /* renamed from: m  reason: collision with root package name */
    public b f19375m;
    @c(a = "notice_content")
    public b n;

    static {
        Covode.recordClassIndex(11493);
    }

    public bv() {
        this.L = com.bytedance.android.livesdk.model.message.a.a.REMIND;
    }

    @Override // com.bytedance.android.livesdk.ac.b.a
    public final boolean a() {
        if (this.O == null || this.O.f23218j == null) {
            return false;
        }
        return true;
    }
}
