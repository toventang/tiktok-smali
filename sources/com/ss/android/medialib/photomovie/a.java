package com.ss.android.medialib.photomovie;

import com.bytedance.covode.number.Covode;

public class a {

    /* renamed from: a  reason: collision with root package name */
    public int f59766a;

    /* renamed from: b  reason: collision with root package name */
    public int f59767b;

    /* renamed from: c  reason: collision with root package name */
    public int f59768c;

    static {
        Covode.recordClassIndex(36926);
    }

    public a() {
        this.f59766a = 1;
        this.f59767b = 2500;
        this.f59768c = 500;
        this.f59766a = 1;
        this.f59767b = 2500;
        this.f59768c = 500;
    }

    public String toString() {
        StringBuilder sb = new StringBuilder("{");
        sb.append("\"id\":").append(this.f59766a);
        sb.append(",\"photoTime\":").append(this.f59767b);
        sb.append(",\"transitionTime\":").append(this.f59768c);
        sb.append('}');
        return sb.toString();
    }
}
