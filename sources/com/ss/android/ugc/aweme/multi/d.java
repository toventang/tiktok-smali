package com.ss.android.ugc.aweme.multi;

import android.app.Activity;
import com.bytedance.covode.number.Covode;
import com.ss.android.ugc.aweme.feed.i.ag;
import com.ss.android.ugc.aweme.feed.i.s;
import com.ss.android.ugc.aweme.feed.model.Aweme;
import h.f.b.l;
import java.util.Iterator;
import java.util.List;
import org.json.JSONObject;

public final class d implements b {

    /* renamed from: a  reason: collision with root package name */
    public final List<c> f110896a;

    /* renamed from: b  reason: collision with root package name */
    public final Aweme f110897b;

    /* renamed from: c  reason: collision with root package name */
    private boolean f110898c = true;

    /* renamed from: d  reason: collision with root package name */
    private final Activity f110899d;

    /* renamed from: e  reason: collision with root package name */
    private final String f110900e;

    /* renamed from: f  reason: collision with root package name */
    private final String f110901f;

    /* renamed from: g  reason: collision with root package name */
    private final JSONObject f110902g;

    /* renamed from: h  reason: collision with root package name */
    private final s<ag> f110903h;

    /* renamed from: i  reason: collision with root package name */
    private final boolean f110904i;

    static {
        Covode.recordClassIndex(71150);
    }

    @Override // com.ss.android.ugc.aweme.multi.b
    public final Aweme b() {
        return this.f110897b;
    }

    @Override // com.ss.android.ugc.aweme.multi.b
    public final String c() {
        return this.f110900e;
    }

    @Override // com.ss.android.ugc.aweme.multi.b
    public final String d() {
        return this.f110901f;
    }

    @Override // com.ss.android.ugc.aweme.multi.b
    public final Activity e() {
        return this.f110899d;
    }

    @Override // com.ss.android.ugc.aweme.multi.b
    public final JSONObject f() {
        return this.f110902g;
    }

    @Override // com.ss.android.ugc.aweme.multi.b
    public final boolean a() {
        return this.f110898c;
    }

    public final int g() {
        Iterator<T> it = this.f110896a.iterator();
        int i2 = 0;
        while (it.hasNext()) {
            i2 += it.next().d();
        }
        return i2;
    }

    @Override // com.ss.android.ugc.aweme.multi.b
    public final void a(boolean z) {
        this.f110898c = z;
    }

    public d(Aweme aweme, Activity activity, String str, String str2, JSONObject jSONObject, s<ag> sVar, boolean z) {
        l.d(aweme, "");
        l.d(activity, "");
        l.d(str, "");
        l.d(str2, "");
        l.d(jSONObject, "");
        this.f110897b = aweme;
        this.f110899d = activity;
        this.f110900e = str;
        this.f110901f = str2;
        this.f110902g = jSONObject;
        this.f110903h = sVar;
        this.f110904i = z;
        this.f110896a = h.a(aweme, z, this);
    }
}
