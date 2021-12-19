package com.ss.android.ugc.aweme.live.livehostimpl;

import com.bytedance.android.live.base.b.a;
import com.bytedance.android.livesdkapi.host.IHostAction;
import com.bytedance.android.livesdkapi.host.IHostApp;
import com.bytedance.android.livesdkapi.host.IHostContext;
import com.bytedance.android.livesdkapi.host.IHostNetwork;
import com.bytedance.android.livesdkapi.host.IHostPlugin;
import com.bytedance.android.livesdkapi.host.IHostShare;
import com.bytedance.android.livesdkapi.host.IHostUser;
import com.bytedance.android.livesdkapi.host.IHostWallet;
import com.bytedance.android.livesdkapi.host.b;
import com.bytedance.android.livesdkapi.host.e;
import com.bytedance.android.livesdkapi.host.g;
import com.bytedance.android.livesdkapi.host.h;
import com.bytedance.android.livesdkapi.host.i;
import com.bytedance.android.livesdkapi.host.j;
import com.bytedance.android.livesdkapi.host.k;
import com.bytedance.android.livesdkapi.service.c;
import com.bytedance.covode.number.Covode;

public final class ad implements c {
    static {
        Covode.recordClassIndex(69481);
    }

    @Override // com.bytedance.android.livesdkapi.service.c
    public final IHostContext a() {
        return new a();
    }

    @Override // com.bytedance.android.livesdkapi.service.c
    public final b b() {
        return new r();
    }

    @Override // com.bytedance.android.livesdkapi.service.c
    public final IHostApp c() {
        return new i();
    }

    @Override // com.bytedance.android.livesdkapi.service.c
    public final a d() {
        return new w();
    }

    @Override // com.bytedance.android.livesdkapi.service.c
    public final g e() {
        return new v();
    }

    @Override // com.bytedance.android.livesdkapi.service.c
    public final IHostPlugin f() {
        return new ab();
    }

    @Override // com.bytedance.android.livesdkapi.service.c
    public final IHostWallet g() {
        return new ai();
    }

    @Override // com.bytedance.android.livesdkapi.service.c
    public final IHostShare h() {
        return new ae();
    }

    @Override // com.bytedance.android.livesdkapi.service.c
    public final IHostNetwork i() {
        return new x();
    }

    @Override // com.bytedance.android.livesdkapi.service.c
    public final IHostAction j() {
        return new e();
    }

    @Override // com.bytedance.android.livesdkapi.service.c
    public final j k() {
        return new af();
    }

    @Override // com.bytedance.android.livesdkapi.service.c
    public final IHostUser l() {
        return new ag();
    }

    @Override // com.bytedance.android.livesdkapi.service.c
    public final k m() {
        return new aj();
    }

    @Override // com.bytedance.android.livesdkapi.service.c
    public final e n() {
        return new u();
    }

    @Override // com.bytedance.android.livesdkapi.service.c
    public final com.bytedance.android.livesdkapi.c.a o() {
        return new com.ss.android.ugc.aweme.live.d.a();
    }

    @Override // com.bytedance.android.livesdkapi.service.c
    public final com.bytedance.android.livesdkapi.host.c p() {
        return new t();
    }

    @Override // com.bytedance.android.livesdkapi.service.c
    public final h q() {
        return new y();
    }

    @Override // com.bytedance.android.livesdkapi.service.c
    public final i r() {
        return new ac();
    }
}
