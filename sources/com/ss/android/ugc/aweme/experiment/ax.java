package com.ss.android.ugc.aweme.experiment;

import com.bytedance.covode.number.Covode;
import com.bytedance.keva.Keva;

public final class ax {

    /* renamed from: a  reason: collision with root package name */
    public static final ax f89578a = new ax();

    /* renamed from: b  reason: collision with root package name */
    private static int f89579b = Keva.getRepoSync("ab_repo_cold_boot", 1).getInt("cold_boot_mainfragment_opt", 2);

    private ax() {
    }

    public static boolean a() {
        if (f89579b == 1) {
            return true;
        }
        return false;
    }

    public static boolean b() {
        if (f89579b == 2) {
            return true;
        }
        return false;
    }

    static {
        Covode.recordClassIndex(56300);
    }
}
