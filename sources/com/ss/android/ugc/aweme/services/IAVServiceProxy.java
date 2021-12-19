package com.ss.android.ugc.aweme.services;

import com.bytedance.covode.number.Covode;
import com.ss.android.ugc.aweme.port.in.IHashTagService;
import com.ss.android.ugc.aweme.port.in.ISchedulerService;
import com.ss.android.ugc.aweme.port.in.ab;
import com.ss.android.ugc.aweme.port.in.ac;
import com.ss.android.ugc.aweme.port.in.ad;
import com.ss.android.ugc.aweme.port.in.ae;
import com.ss.android.ugc.aweme.port.in.af;
import com.ss.android.ugc.aweme.port.in.ai;
import com.ss.android.ugc.aweme.port.in.ak;
import com.ss.android.ugc.aweme.port.in.am;
import com.ss.android.ugc.aweme.port.in.ao;
import com.ss.android.ugc.aweme.port.in.as;
import com.ss.android.ugc.aweme.port.in.av;
import com.ss.android.ugc.aweme.port.in.ax;
import com.ss.android.ugc.aweme.port.in.ay;
import com.ss.android.ugc.aweme.port.in.az;
import com.ss.android.ugc.aweme.port.in.ba;
import com.ss.android.ugc.aweme.port.in.bb;
import com.ss.android.ugc.aweme.port.in.bd;
import com.ss.android.ugc.aweme.port.in.be;
import com.ss.android.ugc.aweme.port.in.bf;
import com.ss.android.ugc.aweme.port.in.bg;
import com.ss.android.ugc.aweme.port.in.bi;
import com.ss.android.ugc.aweme.port.in.bn;
import com.ss.android.ugc.aweme.port.in.bp;
import com.ss.android.ugc.aweme.port.in.n;
import com.ss.android.ugc.aweme.port.in.t;
import com.ss.android.ugc.aweme.services.connection.IConnectionEntranceService;
import com.ss.android.ugc.aweme.services.superentrance.ISuperEntrancePrivacyService;

public interface IAVServiceProxy extends IFoundationAVServiceProxy {
    static {
        Covode.recordClassIndex(79454);
    }

    @Override // com.ss.android.ugc.aweme.services.IFoundationAVServiceProxy
    n getABService();

    t getAVConverter();

    @Override // com.ss.android.ugc.aweme.services.IFoundationAVServiceProxy
    ab getApplicationService();

    @Override // com.ss.android.ugc.aweme.services.IFoundationAVServiceProxy
    ac getBridgeService();

    ad getBusiStickerService();

    ae getBusinessGoodsService();

    af getCaptureService();

    @Override // com.ss.android.ugc.aweme.services.IFoundationAVServiceProxy
    ai getCommerceService();

    ak getDmtChallengeService();

    IHashTagService getHashTagService();

    am getLiveService();

    ao getMiniAppService();

    as getMusicService();

    IToolsProfileService getProfileService();

    ax getPublishService();

    @Override // com.ss.android.ugc.aweme.services.IFoundationAVServiceProxy
    ay getRegionService();

    ISchedulerService getSchedulerService();

    ba getShareService();

    @Override // com.ss.android.ugc.aweme.services.IFoundationAVServiceProxy
    bb getShortVideoPluginService();

    az getSpService();

    bd getStickerShareService();

    be getStoryService();

    bf getSummonFriendService();

    bg getSyncShareService();

    bi getToolsComponentService();

    bn getVideoCacheService();

    bp getWikiService();

    IConnectionEntranceService getXsEntranceService();

    av openSDKService();

    ISuperEntrancePrivacyService superEntrancePrivacyService();
}
