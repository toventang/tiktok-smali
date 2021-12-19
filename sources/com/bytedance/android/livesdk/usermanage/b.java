package com.bytedance.android.livesdk.usermanage;

import android.content.Context;
import android.os.Bundle;
import com.bytedance.android.live.s.a.c;
import com.bytedance.android.live.s.f;
import com.bytedance.android.livesdk.an.a;
import com.bytedance.android.livesdk.event.o;
import com.bytedance.android.livesdk.userservice.u;
import com.bytedance.covode.number.Covode;
import com.ss.android.ugc.aweme.base.utils.f;
import com.zhiliaoapp.musically.R;
import java.util.HashMap;
import java.util.Map;

public final class b extends com.bytedance.android.livesdk.l.b implements com.bytedance.android.live.s.b {
    long Q;
    long R;
    Context S;
    f T;
    private long U;

    static {
        Covode.recordClassIndex(12962);
    }

    @Override // com.bytedance.android.live.s.b
    public final void a() {
    }

    @Override // com.bytedance.android.live.s.b
    public final void b(c cVar, Exception exc) {
    }

    @Override // com.bytedance.android.live.s.b
    public final void d() {
    }

    public static boolean b() {
        try {
            return f.a.f68431a.c();
        } catch (Exception unused) {
            return false;
        }
    }

    /* access modifiers changed from: package-private */
    public final Map<String, String> c() {
        String str;
        HashMap hashMap = new HashMap();
        hashMap.put("anchor_id", String.valueOf(this.U));
        hashMap.put("room_id", String.valueOf(this.Q));
        hashMap.put("user_id", String.valueOf(this.R));
        if (u.a().b().c() == this.U) {
            str = "anchor";
        } else {
            str = "admin";
        }
        hashMap.put("admin_type", str);
        return hashMap;
    }

    @Override // com.bytedance.android.live.s.b
    public final void b(boolean z) {
        if (isShowing()) {
            dismiss();
            a.a().a(new e(0));
        }
        a.a().a(new o(true, this.R));
    }

    @Override // com.bytedance.android.livesdk.l.b
    public final void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        this.f18272b = getContext().getString(R.string.goo);
        String string = getContext().getString(R.string.gz9);
        c cVar = new c(this);
        this.f18280j = string;
        this.r = cVar;
        String string2 = getContext().getString(R.string.gz7);
        d dVar = new d(this);
        this.f18281k = string2;
        this.s = dVar;
    }

    @Override // com.bytedance.android.live.s.b
    public final void a(boolean z, Exception exc) {
        com.bytedance.android.livesdk.utils.f.a(getContext(), exc);
        if (isShowing()) {
            dismiss();
            a.a().a(new e(0));
        }
    }

    public b(Context context, long j2, long j3, long j4, com.bytedance.android.live.s.f fVar) {
        super(context);
        this.S = context;
        this.Q = j2;
        this.U = j3;
        this.R = j4;
        this.T = fVar;
    }
}
