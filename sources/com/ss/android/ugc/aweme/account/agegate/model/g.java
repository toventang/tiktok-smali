package com.ss.android.ugc.aweme.account.agegate.model;

import com.bytedance.covode.number.Covode;
import com.zhiliaoapp.musically.R;
import h.f.b.l;

public final class g {

    /* renamed from: c  reason: collision with root package name */
    public static final g f62789c = new g("^.{0,24}$", R.string.ae4);

    /* renamed from: d  reason: collision with root package name */
    public static final g f62790d = new g("^\\S*$", R.string.ae7);

    /* renamed from: e  reason: collision with root package name */
    public static final g f62791e = new g("^[\\w.]*$", R.string.ae8);

    /* renamed from: f  reason: collision with root package name */
    public static final a f62792f = new a((byte) 0);

    /* renamed from: a  reason: collision with root package name */
    public final String f62793a;

    /* renamed from: b  reason: collision with root package name */
    public final int f62794b;

    public static final class a {
        static {
            Covode.recordClassIndex(38690);
        }

        private a() {
        }

        public /* synthetic */ a(byte b2) {
            this();
        }
    }

    static {
        Covode.recordClassIndex(38689);
    }

    private g(String str, int i2) {
        l.d(str, "");
        this.f62793a = str;
        this.f62794b = i2;
    }
}
