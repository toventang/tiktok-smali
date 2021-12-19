package com.ss.android.ugc.gamora.editor.sticker.read;

import com.bytedance.covode.number.Covode;
import com.google.gson.a.c;
import h.f.b.l;

public final class e {

    /* renamed from: a  reason: collision with root package name */
    public boolean f146905a;

    /* renamed from: b  reason: collision with root package name */
    public String f146906b;
    @c(a = "speakerID")

    /* renamed from: c  reason: collision with root package name */
    public String f146907c;
    @c(a = "lock_keywords_easteregg")

    /* renamed from: d  reason: collision with root package name */
    public String f146908d;
    @c(a = "lock_easteregg")

    /* renamed from: e  reason: collision with root package name */
    public int f146909e;
    @c(a = "voice_use_commercial")

    /* renamed from: f  reason: collision with root package name */
    public int f146910f;

    static {
        Covode.recordClassIndex(96757);
    }

    public e() {
        this(false, null, null, null, 63);
    }

    private e(boolean z, String str, String str2, String str3) {
        l.d(str, "");
        l.d(str2, "");
        l.d(str3, "");
        this.f146905a = z;
        this.f146906b = str;
        this.f146907c = str2;
        this.f146908d = str3;
        this.f146909e = 0;
        this.f146910f = 0;
    }

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    public /* synthetic */ e(boolean z, String str, String str2, String str3, int i2) {
        this((i2 & 1) != 0 ? false : z, (i2 & 2) != 0 ? "" : str, (i2 & 4) != 0 ? "" : str2, (i2 & 8) != 0 ? "" : str3);
    }
}
