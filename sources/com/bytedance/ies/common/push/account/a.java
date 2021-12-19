package com.bytedance.ies.common.push.account;

import android.content.Context;
import android.text.TextUtils;
import com.bytedance.covode.number.Covode;

public final class a {

    /* renamed from: a  reason: collision with root package name */
    public Context f33140a;

    /* renamed from: b  reason: collision with root package name */
    private int f33141b;

    /* renamed from: c  reason: collision with root package name */
    private boolean f33142c;

    /* renamed from: d  reason: collision with root package name */
    private long f33143d;

    static {
        Covode.recordClassIndex(19803);
    }

    public final String a() {
        return TextUtils.concat(this.f33140a.getPackageName(), ".AccountProvider").toString();
    }

    /* renamed from: com.bytedance.ies.common.push.account.a$a  reason: collision with other inner class name */
    public static final class C0725a {

        /* renamed from: a  reason: collision with root package name */
        public Context f33144a;

        /* renamed from: b  reason: collision with root package name */
        public int f33145b = 1;

        /* renamed from: c  reason: collision with root package name */
        public boolean f33146c = true;

        /* renamed from: d  reason: collision with root package name */
        public long f33147d = 900;

        static {
            Covode.recordClassIndex(19804);
        }

        public C0725a(Context context) {
            this.f33144a = context;
        }
    }

    private a(C0725a aVar) {
        this.f33140a = aVar.f33144a;
        this.f33141b = aVar.f33145b;
        this.f33142c = aVar.f33146c;
        this.f33143d = aVar.f33147d;
    }

    public /* synthetic */ a(C0725a aVar, byte b2) {
        this(aVar);
    }
}
