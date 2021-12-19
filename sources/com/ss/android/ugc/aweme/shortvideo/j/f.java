package com.ss.android.ugc.aweme.shortvideo.j;

import com.bytedance.covode.number.Covode;
import com.ss.android.ugc.aweme.profile.model.User;
import com.ss.android.ugc.aweme.shortvideo.ai;
import com.ss.android.ugc.d.a.b;
import java.util.List;

public final class f implements b {

    /* renamed from: a  reason: collision with root package name */
    public int f128577a;

    /* renamed from: b  reason: collision with root package name */
    public int f128578b;

    /* renamed from: c  reason: collision with root package name */
    public int f128579c;

    /* renamed from: d  reason: collision with root package name */
    public Object f128580d;

    /* renamed from: e  reason: collision with root package name */
    public String f128581e;

    /* renamed from: f  reason: collision with root package name */
    public boolean f128582f;

    /* renamed from: g  reason: collision with root package name */
    public boolean f128583g;

    /* renamed from: h  reason: collision with root package name */
    public ai f128584h;

    /* renamed from: i  reason: collision with root package name */
    public List<User> f128585i;

    /* renamed from: j  reason: collision with root package name */
    public String f128586j;

    /* renamed from: k  reason: collision with root package name */
    public boolean f128587k;

    /* renamed from: l  reason: collision with root package name */
    public boolean f128588l;

    /* renamed from: m  reason: collision with root package name */
    public String f128589m;

    static {
        Covode.recordClassIndex(84311);
    }

    public final String toString() {
        return "PublishStatus{status=" + this.f128578b + ", progress=" + this.f128579c + ", params=" + this.f128580d + '}';
    }

    public f(int i2) {
        this.f128578b = i2;
    }

    public f(Object obj) {
        this(10, 100, obj, null);
    }

    public f(int i2, int i3, Object obj, String str) {
        this.f128580d = obj;
        this.f128579c = i3;
        this.f128578b = i2;
        this.f128581e = str;
    }
}
