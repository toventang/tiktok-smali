package com.google.vr.dynamite.client;

import com.bytedance.covode.number.Covode;

public final class d extends Exception {

    /* renamed from: a  reason: collision with root package name */
    private final int f54904a = 1;

    static {
        Covode.recordClassIndex(34133);
    }

    public final String getMessage() {
        String str;
        if (this.f54904a != 1) {
            str = "Unknown error";
        } else {
            str = "Package not available";
        }
        StringBuilder sb = new StringBuilder(str.length() + 17);
        sb.append("LoaderException{");
        sb.append(str);
        sb.append("}");
        return sb.toString();
    }
}
