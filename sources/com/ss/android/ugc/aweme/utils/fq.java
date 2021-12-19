package com.ss.android.ugc.aweme.utils;

import com.bytedance.covode.number.Covode;
import java.util.concurrent.ConcurrentHashMap;

public final class fq {

    /* renamed from: a  reason: collision with root package name */
    private ConcurrentHashMap<String, Boolean> f142945a;

    static {
        Covode.recordClassIndex(93534);
    }

    public static class a {

        /* renamed from: a  reason: collision with root package name */
        public static final fq f142946a = new fq((byte) 0);

        static {
            Covode.recordClassIndex(93535);
        }
    }

    private fq() {
        this.f142945a = new ConcurrentHashMap<>();
    }

    /* synthetic */ fq(byte b2) {
        this();
    }

    public final boolean a(fp fpVar) {
        if (this.f142945a.get(fpVar.getName()) != null && this.f142945a.get(fpVar.getName()).booleanValue()) {
            return false;
        }
        this.f142945a.put(fpVar.getName(), true);
        return true;
    }
}
