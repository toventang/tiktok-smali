package com.ss.android.ugc.aweme.i18n.language.i18n;

import com.bytedance.covode.number.Covode;
import com.ss.android.ugc.aweme.language.b;
import java.util.Locale;

public final class a implements b {

    /* renamed from: a  reason: collision with root package name */
    public String f99793a;

    /* renamed from: b  reason: collision with root package name */
    public String f99794b;

    /* renamed from: c  reason: collision with root package name */
    private String f99795c;

    /* renamed from: d  reason: collision with root package name */
    private Locale f99796d;

    /* renamed from: e  reason: collision with root package name */
    private String[] f99797e;

    /* renamed from: f  reason: collision with root package name */
    private String f99798f;

    /* renamed from: g  reason: collision with root package name */
    private String f99799g;

    static {
        Covode.recordClassIndex(63626);
    }

    @Override // com.ss.android.ugc.aweme.language.b
    public final String a() {
        return this.f99795c;
    }

    @Override // com.ss.android.ugc.aweme.language.b
    public final String b() {
        return this.f99793a;
    }

    @Override // com.ss.android.ugc.aweme.language.b
    public final String e() {
        return this.f99798f;
    }

    @Override // com.ss.android.ugc.aweme.language.b
    public final String f() {
        return this.f99799g;
    }

    @Override // com.ss.android.ugc.aweme.language.b
    public final Locale c() {
        if (this.f99796d == null) {
            this.f99796d = new Locale(this.f99793a, this.f99794b);
        }
        return this.f99796d;
    }

    @Override // com.ss.android.ugc.aweme.language.b
    public final String[] d() {
        if (this.f99797e == null) {
            this.f99797e = new String[]{"chat_merge", "instagram", "instagram_story", "facebook", "facebook_lite", "messenger", "messenger_lite", "whatsapp", "sms", "snapchat", "email", "twitter", "line", "kakaotalk", "zalo", "band", "naver_blog", "naver_cafe", "kakao_story", "vk", "viber", "copy", "qr_code", "more"};
        }
        return this.f99797e;
    }

    public a(String str, String str2, String str3, String str4) {
        this(str, str2, str3, str4, str2);
    }

    public a(String str, String str2, String str3, String str4, String str5) {
        this.f99795c = str;
        this.f99793a = str2;
        this.f99794b = str3;
        this.f99798f = str4;
        this.f99799g = str5;
    }
}
