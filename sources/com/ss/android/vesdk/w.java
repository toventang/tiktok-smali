package com.ss.android.vesdk;

import com.bytedance.covode.number.Covode;

public final class w {

    /* renamed from: a  reason: collision with root package name */
    public String f151503a;

    /* renamed from: b  reason: collision with root package name */
    public String f151504b;

    /* renamed from: c  reason: collision with root package name */
    public float f151505c;

    /* renamed from: d  reason: collision with root package name */
    public float f151506d;

    /* renamed from: e  reason: collision with root package name */
    public float f151507e;

    /* renamed from: f  reason: collision with root package name */
    public boolean f151508f;

    /* renamed from: g  reason: collision with root package name */
    public boolean f151509g;

    /* renamed from: h  reason: collision with root package name */
    public a f151510h = a.ATTACH;

    static {
        Covode.recordClassIndex(99613);
    }

    public enum a {
        ATTACH,
        DETACH;

        static {
            Covode.recordClassIndex(99614);
        }
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("{");
        sb.append("\"mDuetVideoPath\":\"").append(this.f151503a).append('\"');
        sb.append(",\"mDuetAudioPath\":\"").append(this.f151504b).append('\"');
        sb.append(",\"mXInPercent\":").append(this.f151505c);
        sb.append(",\"mYInPercent\":").append(this.f151506d);
        sb.append(",\"mAlpha\":").append(this.f151507e);
        sb.append(",\"mIsFitMode\":").append(this.f151508f);
        sb.append(",\"enableV2\":").append(this.f151509g);
        sb.append('}');
        return sb.toString();
    }

    public w(String str, String str2, boolean z) {
        this.f151503a = str;
        this.f151504b = str2;
        this.f151505c = 0.0f;
        this.f151506d = 0.16f;
        this.f151507e = 0.6f;
        this.f151508f = z;
    }
}
