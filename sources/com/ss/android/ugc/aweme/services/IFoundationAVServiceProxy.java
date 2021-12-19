package com.ss.android.ugc.aweme.services;

import com.bytedance.covode.number.Covode;
import com.ss.android.ugc.aweme.port.in.ag;
import com.ss.android.ugc.aweme.port.in.an;
import com.ss.android.ugc.aweme.port.in.au;
import com.ss.android.ugc.aweme.port.in.bc;
import com.ss.android.ugc.aweme.port.in.bj;
import com.ss.android.ugc.aweme.port.in.bk;
import com.ss.android.ugc.aweme.port.in.o;
import com.ss.android.ugc.aweme.port.in.q;
import com.ss.android.ugc.aweme.port.in.r;
import com.ss.android.ugc.aweme.port.in.s;
import com.ss.android.ugc.aweme.port.in.x;
import com.ss.android.ugc.aweme.port.in.y;
import com.ss.android.ugc.aweme.port.in.z;
import com.ss.android.ugc.aweme.services.appcontext.IAVAppContextManager;

public interface IFoundationAVServiceProxy {
    static {
        Covode.recordClassIndex(79465);
    }

    o getABService();

    IAVAppContextManager getAVAppContextManager();

    z getAccountService();

    q getApplicationService();

    r getBridgeService();

    ag getChallengeService();

    s getCommerceService();

    bc getIStickerPropService();

    an getLocalHashTagService();

    au getNetworkService();

    x getRegionService();

    y getShortVideoPluginService();

    bj getUiService();

    bk unlockStickerService();
}
