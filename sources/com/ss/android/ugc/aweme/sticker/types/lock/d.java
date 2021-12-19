package com.ss.android.ugc.aweme.sticker.types.lock;

import android.content.Context;
import android.content.SharedPreferences;
import com.bytedance.covode.number.Covode;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public final class d {

    /* renamed from: a  reason: collision with root package name */
    Context f136135a;

    /* renamed from: b  reason: collision with root package name */
    public String f136136b;

    /* renamed from: c  reason: collision with root package name */
    SharedPreferences f136137c;

    /* renamed from: d  reason: collision with root package name */
    SharedPreferences.Editor f136138d;

    /* renamed from: e  reason: collision with root package name */
    Set<String> f136139e = this.f136137c.getStringSet("remindedIds", new HashSet());

    static {
        Covode.recordClassIndex(88921);
    }

    public final List<String> a() {
        return new ArrayList(this.f136139e);
    }

    public final void a(String str) {
        if (this.f136139e.add(str)) {
            this.f136138d.putStringSet("remindedIds", this.f136139e);
            this.f136138d.apply();
        }
    }

    public d(Context context, String str) {
        this.f136135a = context;
        this.f136136b = str;
        SharedPreferences a2 = com.ss.android.ugc.aweme.bf.d.a(context, str + "STICKER_RELATED", 0);
        this.f136137c = a2;
        this.f136138d = a2.edit();
    }
}
