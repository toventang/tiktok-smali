package com.ss.android.ugc.aweme.profile;

import android.text.TextUtils;
import com.bytedance.covode.number.Covode;
import java.util.HashMap;
import java.util.Map;

public final class ak {

    /* renamed from: a  reason: collision with root package name */
    public String f115960a;

    /* renamed from: b  reason: collision with root package name */
    public String f115961b;

    /* renamed from: c  reason: collision with root package name */
    public String f115962c;

    /* renamed from: d  reason: collision with root package name */
    public String f115963d;

    /* renamed from: e  reason: collision with root package name */
    public String f115964e;

    /* renamed from: f  reason: collision with root package name */
    public String f115965f;

    /* renamed from: g  reason: collision with root package name */
    public String f115966g;

    /* renamed from: h  reason: collision with root package name */
    public String f115967h;

    /* renamed from: i  reason: collision with root package name */
    public String f115968i;

    /* renamed from: j  reason: collision with root package name */
    public String f115969j;

    /* renamed from: k  reason: collision with root package name */
    public String f115970k;

    /* renamed from: l  reason: collision with root package name */
    public String f115971l;

    /* renamed from: m  reason: collision with root package name */
    public String f115972m;
    public String n;
    private boolean o;
    private int p;
    private int q = -1;

    static {
        Covode.recordClassIndex(74788);
    }

    public final Map<String, String> a() {
        HashMap hashMap = new HashMap();
        if (!TextUtils.isEmpty(this.f115960a)) {
            hashMap.put("nickname", this.f115960a);
        }
        String str = this.f115961b;
        if (str != null) {
            hashMap.put("signature", str);
        }
        if (!TextUtils.isEmpty(this.f115962c)) {
            hashMap.put("unique_id", this.f115962c);
        }
        if (!TextUtils.isEmpty(this.f115963d)) {
            hashMap.put("avatar_uri", this.f115963d);
        }
        if (this.o) {
            hashMap.put("video_icon_virtual_URI", "");
        } else if (!TextUtils.isEmpty(this.f115964e)) {
            hashMap.put("video_icon_virtual_URI", this.f115964e);
        }
        if (!TextUtils.isEmpty(this.f115965f)) {
            hashMap.put("school_name", this.f115965f);
        }
        hashMap.put("school_type", String.valueOf(this.p));
        if (!TextUtils.isEmpty(this.f115966g)) {
            hashMap.put("ins_id", this.f115966g);
        }
        if (!TextUtils.isEmpty(this.f115967h)) {
            hashMap.put("google_account", this.f115967h);
        }
        if (!TextUtils.isEmpty(this.f115968i)) {
            hashMap.put("youtube_channel_id", this.f115968i);
        }
        if (!TextUtils.isEmpty(this.f115969j)) {
            hashMap.put("youtube_channel_title", this.f115969j);
        }
        int i2 = this.q;
        if (i2 != -1) {
            hashMap.put("secret", String.valueOf(i2));
        }
        String str2 = this.f115970k;
        if (str2 != null) {
            hashMap.put("bio_url", str2);
        }
        String str3 = this.f115971l;
        if (str3 != null) {
            hashMap.put("bio_email", str3);
        }
        String str4 = this.f115972m;
        if (str4 != null) {
            hashMap.put("bio_phone", str4);
        }
        String str5 = this.n;
        if (str5 != null) {
            hashMap.put("bio_location", str5);
        }
        return hashMap;
    }

    public final void a(String str) {
        this.o = TextUtils.isEmpty(str);
        this.f115964e = str;
    }
}
