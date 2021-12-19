package com.ss.android.ugc.aweme.tools.music.f;

import com.bytedance.covode.number.Covode;
import com.google.gson.f;
import com.ss.android.ugc.aweme.initializer.AVServiceProxyImpl;
import com.ss.android.ugc.aweme.services.IAVServiceProxy;
import h.f.b.l;

public final class d {

    /* renamed from: a  reason: collision with root package name */
    public static final f f140594a;

    static {
        Covode.recordClassIndex(91826);
        IAVServiceProxy createIAVServiceProxybyMonsterPlugin = AVServiceProxyImpl.createIAVServiceProxybyMonsterPlugin(false);
        l.b(createIAVServiceProxybyMonsterPlugin, "");
        f140594a = createIAVServiceProxybyMonsterPlugin.getNetworkService().getRetrofitFactoryGson();
    }
}
