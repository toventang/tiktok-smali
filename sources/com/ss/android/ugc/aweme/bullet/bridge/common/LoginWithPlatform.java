package com.ss.android.ugc.aweme.bullet.bridge.common;

import androidx.lifecycle.i;
import androidx.lifecycle.m;
import com.bytedance.covode.number.Covode;
import com.bytedance.ies.bullet.c.e.a.b;
import com.ss.android.ugc.aweme.au;
import h.f.b.l;

public final class LoginWithPlatform extends LoginMethod implements au {

    /* renamed from: c  reason: collision with root package name */
    public static final a f69003c = new a((byte) 0);

    static {
        Covode.recordClassIndex(42545);
    }

    @Override // com.bytedance.ies.bullet.c.c.a.q, com.ss.android.ugc.aweme.bullet.bridge.common.LoginMethod
    public final String d() {
        return "loginWithPlatform";
    }

    @Override // com.ss.android.ugc.aweme.bullet.bridge.common.LoginMethod, com.ss.android.ugc.aweme.bullet.bridge.BaseBridgeMethod, androidx.lifecycle.k
    public final void onStateChanged(m mVar, i.a aVar) {
        super.onStateChanged(mVar, aVar);
    }

    public static final class a {
        static {
            Covode.recordClassIndex(42546);
        }

        private a() {
        }

        public /* synthetic */ a(byte b2) {
            this();
        }
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public LoginWithPlatform(b bVar) {
        super(bVar);
        l.d(bVar, "");
    }
}
