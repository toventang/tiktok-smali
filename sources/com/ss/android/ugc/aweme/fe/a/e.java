package com.ss.android.ugc.aweme.fe.a;

import com.bytedance.covode.number.Covode;
import com.bytedance.ies.ugc.appcontext.d;
import com.bytedance.keva.Keva;

public final class e {

    /* renamed from: a  reason: collision with root package name */
    private Keva f91017a;

    static {
        Covode.recordClassIndex(57236);
    }

    public static class a {

        /* renamed from: a  reason: collision with root package name */
        public static e f91018a = new e((byte) 0);

        static {
            Covode.recordClassIndex(57237);
        }
    }

    private e() {
        this.f91017a = Keva.getRepoFromSp(d.a(), "fe-storage", 0);
    }

    /* synthetic */ e(byte b2) {
        this();
    }

    public final String a(String str, String str2) {
        return this.f91017a.getString(str, str2);
    }

    public final void b(String str, String str2) {
        this.f91017a.storeString(str, str2);
    }

    public final Boolean a(String str, Boolean bool) {
        return Boolean.valueOf(this.f91017a.getBoolean(str, bool.booleanValue()));
    }

    public final void b(String str, Boolean bool) {
        this.f91017a.storeBoolean(str, bool.booleanValue());
    }

    public final Integer a(String str, Integer num) {
        return Integer.valueOf(this.f91017a.getInt(str, num.intValue()));
    }

    public final void b(String str, Integer num) {
        this.f91017a.storeInt(str, num.intValue());
    }

    public final boolean a(String str, Object obj) {
        if (!(str == null || obj == null)) {
            try {
                if (!(obj instanceof String)) {
                    return false;
                }
                b(str, (String) obj);
                return true;
            } catch (Exception e2) {
                e2.printStackTrace();
            }
        }
        return false;
    }
}
