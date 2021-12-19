package com.ss.android.ugc.aweme.base.model;

import com.bytedance.covode.number.Covode;

public final class a {

    /* renamed from: a  reason: collision with root package name */
    public EnumC1542a f68152a;

    /* renamed from: b  reason: collision with root package name */
    public Object f68153b;

    static {
        Covode.recordClassIndex(41990);
    }

    public final int a() {
        Object obj = this.f68153b;
        if (obj == null) {
            return 0;
        }
        return ((Integer) obj).intValue();
    }

    /* renamed from: com.ss.android.ugc.aweme.base.model.a$a  reason: collision with other inner class name */
    public enum EnumC1542a {
        RES_ID,
        URL,
        URL_MODEL;

        static {
            Covode.recordClassIndex(41991);
        }
    }

    public static a a(int i2) {
        return new a(EnumC1542a.RES_ID, Integer.valueOf(i2));
    }

    private a(EnumC1542a aVar, Object obj) {
        this.f68152a = aVar;
        this.f68153b = obj;
    }
}
