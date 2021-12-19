package com.bytedance.ies.bullet.kit.lynx.b;

import com.bytedance.covode.number.Covode;

public final class b {

    /* renamed from: a  reason: collision with root package name */
    public String f32317a = "unknown";

    /* renamed from: b  reason: collision with root package name */
    public String f32318b;

    /* renamed from: c  reason: collision with root package name */
    public final String f32319c;

    /* renamed from: d  reason: collision with root package name */
    public final int f32320d;

    static {
        Covode.recordClassIndex(18962);
    }

    public final String toString() {
        StringBuilder append = new StringBuilder("{\"code\": ").append(this.f32320d).append(",\"msg\": ");
        String str = this.f32319c;
        String str2 = "";
        if (str == null) {
            str = str2;
        }
        StringBuilder append2 = append.append(str).append(", \"templateLoadFrom\": ").append(this.f32317a).append(", \"templateFilePath\":");
        String str3 = this.f32318b;
        if (str3 != null) {
            str2 = str3;
        }
        return append2.append(str2).append(' ').toString();
    }

    public b(String str, int i2) {
        this.f32319c = str;
        this.f32320d = i2;
    }
}
