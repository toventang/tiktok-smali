package com.bytedance.android.livesdk.ab.c;

import com.bytedance.covode.number.Covode;

public class g {

    /* renamed from: a  reason: collision with root package name */
    public long f13515a;

    /* renamed from: b  reason: collision with root package name */
    public long f13516b;

    /* renamed from: c  reason: collision with root package name */
    public String f13517c;

    /* renamed from: d  reason: collision with root package name */
    public String f13518d;

    /* renamed from: e  reason: collision with root package name */
    public String f13519e;

    /* renamed from: f  reason: collision with root package name */
    public String f13520f;

    /* renamed from: g  reason: collision with root package name */
    public long f13521g;

    /* renamed from: h  reason: collision with root package name */
    public String f13522h;

    /* renamed from: i  reason: collision with root package name */
    public String f13523i;

    /* renamed from: j  reason: collision with root package name */
    public int f13524j;

    /* renamed from: k  reason: collision with root package name */
    public String f13525k;

    static {
        Covode.recordClassIndex(7497);
    }

    public final g a(int i2) {
        String str;
        String[] strArr = {"mutual_follow", "recommend", "recent", "other_follow"};
        int i3 = i2 - 1;
        if (i3 >= 4 || i3 < 0) {
            str = "";
        } else {
            str = strArr[i3];
        }
        this.f13519e = str;
        return this;
    }
}
