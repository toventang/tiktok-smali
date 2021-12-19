package com.ss.android.ugc.aweme.choosemusic.model;

import com.bytedance.covode.number.Covode;
import com.ss.android.ugc.aweme.search.g.b;

public final class aj {

    /* renamed from: a  reason: collision with root package name */
    public String f70625a;

    /* renamed from: b  reason: collision with root package name */
    public int f70626b;

    /* renamed from: c  reason: collision with root package name */
    public String f70627c;

    /* renamed from: d  reason: collision with root package name */
    public boolean f70628d;

    /* renamed from: e  reason: collision with root package name */
    public int f70629e;

    /* renamed from: f  reason: collision with root package name */
    public boolean f70630f = true;

    /* renamed from: g  reason: collision with root package name */
    public b f70631g;

    /* renamed from: h  reason: collision with root package name */
    public long f70632h;

    /* renamed from: i  reason: collision with root package name */
    public long f70633i;

    static {
        Covode.recordClassIndex(43552);
    }

    public final long b() {
        long j2 = this.f70633i;
        if (j2 > 0) {
            return j2;
        }
        return this.f70632h;
    }

    public final boolean c() {
        if (this.f70633i > 0) {
            return true;
        }
        return false;
    }

    public final String a() {
        int i2 = this.f70626b;
        if (i2 == 1) {
            return "normal_search";
        }
        if (i2 == 2) {
            return "search_history";
        }
        if (i2 != 3) {
            return "";
        }
        return "search_sug";
    }
}
