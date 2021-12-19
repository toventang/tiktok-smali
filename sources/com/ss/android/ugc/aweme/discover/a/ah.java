package com.ss.android.ugc.aweme.discover.a;

import com.bytedance.covode.number.Covode;
import com.bytedance.ies.abmock.b;

public final class ah {

    /* renamed from: a  reason: collision with root package name */
    public static final boolean f80145a;

    /* renamed from: b  reason: collision with root package name */
    public static final boolean f80146b;

    /* renamed from: c  reason: collision with root package name */
    static final boolean f80147c;

    /* renamed from: d  reason: collision with root package name */
    public static final ah f80148d = new ah();

    private ah() {
    }

    static {
        boolean z;
        boolean z2;
        Covode.recordClassIndex(49885);
        boolean z3 = true;
        if (b.a().a(true, "show_account_sug_histories", 0) == 2 || b.a().a(true, "show_account_sug_histories", 0) == 3) {
            z = true;
        } else {
            z = false;
        }
        f80145a = z;
        if (b.a().a(true, "show_account_sug_histories", 0) == 3) {
            z2 = true;
        } else {
            z2 = false;
        }
        f80146b = z2;
        if (b.a().a(true, "show_account_sug_histories", 0) == 0) {
            z3 = false;
        }
        f80147c = z3;
    }
}
