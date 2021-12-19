package com.ss.android.socialbase.downloader.segment;

import com.bytedance.covode.number.Covode;
import org.json.JSONObject;

public final class m {

    /* renamed from: a  reason: collision with root package name */
    final JSONObject f60967a;

    /* renamed from: b  reason: collision with root package name */
    public int f60968b;

    static {
        Covode.recordClassIndex(37570);
    }

    /* access modifiers changed from: package-private */
    public final int a() {
        return this.f60967a.optInt("url_balance", 2);
    }

    public final boolean b() {
        if (a() > 0) {
            return true;
        }
        return false;
    }

    public final boolean c() {
        if (this.f60967a.optInt("segment_mode", 1) == 0) {
            return true;
        }
        return false;
    }

    public final int f() {
        return this.f60967a.optInt("ip_strategy", 0);
    }

    public final long d() {
        long optInt = ((long) this.f60967a.optInt("segment_min_kb", 512)) * 1024;
        if (optInt < 65536) {
            return 65536;
        }
        return optInt;
    }

    public final long e() {
        long optInt = (long) this.f60967a.optInt("read_timeout", -1);
        if (optInt >= 4000) {
            return optInt;
        }
        return -1;
    }

    public m(JSONObject jSONObject) {
        this.f60967a = jSONObject;
    }

    public final void a(int i2) {
        this.f60968b = b(i2);
    }

    private int b(int i2) {
        int optInt = this.f60967a.optInt("thread_count", 4);
        if (optInt > 16) {
            optInt = 16;
        }
        if (optInt <= 0) {
            if (a() > 0) {
                return i2;
            }
            return 1;
        } else if (a() == 1) {
            return Math.min(optInt, i2);
        } else {
            return optInt;
        }
    }
}
