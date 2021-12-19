package com.ss.android.ugc.aweme.sharer;

import android.os.Bundle;
import com.bytedance.covode.number.Covode;
import h.f.b.l;

public abstract class g {

    /* renamed from: a  reason: collision with root package name */
    private final Bundle f124570a = new Bundle();

    static {
        Covode.recordClassIndex(81864);
    }

    public final g a(String str, String str2) {
        l.d(str, "");
        l.d(str2, "");
        this.f124570a.putString(str, str2);
        return this;
    }

    public final String b(String str, String str2) {
        l.d(str, "");
        String string = this.f124570a.getString(str, str2);
        l.b(string, "");
        return string;
    }
}
