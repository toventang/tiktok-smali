package com.bytedance.android.livesdkapi.service;

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
import com.bytedance.covode.number.Covode;

public interface c {
    static {
        Covode.recordClassIndex(13855);
    }

    IHostContext a();

    b b();

    IHostApp c();

    a d();

    g e();

    IHostPlugin f();

    IHostWallet g();

    IHostShare h();

    IHostNetwork i();

    IHostAction j();

    j k();

    IHostUser l();

    k m();

    e n();

    com.bytedance.android.livesdkapi.c.a o();

    com.bytedance.android.livesdkapi.host.c p();

    h q();

    i r();
}
