package com.ss.android.ugc.playerkit.videoview;

import com.bytedance.covode.number.Covode;
import com.ss.android.ugc.aweme.base.model.UrlModel;
import com.ss.android.ugc.aweme.feed.model.BitRate;
import com.ss.android.ugc.aweme.feed.model.VideoUrlModel;
import com.ss.android.ugc.playerkit.simapicommon.a.g;
import com.ss.android.ugc.playerkit.simapicommon.a.i;
import java.util.ArrayList;

public final class e {
    static {
        Covode.recordClassIndex(98089);
    }

    private static com.ss.android.ugc.playerkit.simapicommon.a.e a(BitRate bitRate) {
        if (bitRate == null) {
            return null;
        }
        com.ss.android.ugc.playerkit.simapicommon.a.e eVar = new com.ss.android.ugc.playerkit.simapicommon.a.e();
        eVar.origin = bitRate;
        eVar.setBytevc1(bitRate.isBytevc1());
        eVar.setPlayAddr(a(bitRate.getPlayAddr()));
        eVar.setBitRate(bitRate.getBitRate());
        eVar.setGearName(bitRate.getGearName());
        eVar.setQualityType(bitRate.getQualityType());
        return eVar;
    }

    private static g a(UrlModel urlModel) {
        String uri;
        if (urlModel == null) {
            return null;
        }
        g gVar = new g();
        gVar.origin = urlModel;
        gVar.setFileHash(urlModel.getFileHash());
        gVar.setHeight(urlModel.getHeight());
        gVar.setWidth(urlModel.getWidth());
        gVar.setSize(urlModel.getSize());
        if (urlModel instanceof VideoUrlModel) {
            uri = ((VideoUrlModel) urlModel).getOriginUri();
        } else {
            uri = urlModel.getUri();
        }
        gVar.setUri(uri);
        gVar.setUrlKey(urlModel.getUrlKey());
        gVar.setUrlList(urlModel.getUrlList());
        return gVar;
    }

    public static i a(VideoUrlModel videoUrlModel) {
        if (videoUrlModel == null) {
            return null;
        }
        i iVar = new i();
        iVar.origin = videoUrlModel;
        ArrayList arrayList = new ArrayList();
        if (videoUrlModel.getBitRate() != null) {
            for (BitRate bitRate : new ArrayList(videoUrlModel.getBitRate())) {
                arrayList.add(a(bitRate));
            }
        }
        iVar.setBitRate(arrayList);
        iVar.setDashVideoId(videoUrlModel.getDashVideoId());
        iVar.setDashVideoModelStr(videoUrlModel.getDashVideoModelStr());
        iVar.setDashVideoId(videoUrlModel.getDashVideoId());
        iVar.setFileCheckSum(videoUrlModel.getFileCheckSum());
        iVar.setBytevc1(videoUrlModel.isBytevc1());
        iVar.setHitBitrate(videoUrlModel.getHitBitrate());
        iVar.setRatio(videoUrlModel.getRatio());
        iVar.setVr(videoUrlModel.isVr());
        iVar.setSourceId(videoUrlModel.getSourceId());
        iVar.setDuration(videoUrlModel.getDuration());
        iVar.setFileHash(videoUrlModel.getFileHash());
        iVar.setHeight(videoUrlModel.getHeight());
        iVar.setWidth(videoUrlModel.getWidth());
        iVar.setSize(videoUrlModel.getSize());
        iVar.setUri(videoUrlModel.getOriginUri());
        iVar.setUrlKey(videoUrlModel.getUrlKey());
        iVar.setUrlList(videoUrlModel.getUrlList());
        return iVar;
    }
}
