package com.ss.android.ugc.aweme.video.simcommon;

import android.os.SystemClock;
import com.bytedance.covode.number.Covode;
import com.ss.android.ugc.aweme.base.model.UrlModel;
import com.ss.android.ugc.aweme.feed.model.BitRate;
import com.ss.android.ugc.aweme.feed.model.CaptionItemModel;
import com.ss.android.ugc.aweme.feed.model.CaptionModel;
import com.ss.android.ugc.aweme.feed.model.TtsInfos;
import com.ss.android.ugc.aweme.feed.model.Video;
import com.ss.android.ugc.aweme.feed.model.VideoUrlModel;
import com.ss.android.ugc.aweme.feed.model.video.PlayTokenAuth;
import com.ss.android.ugc.playerkit.simapicommon.a.b;
import com.ss.android.ugc.playerkit.simapicommon.a.c;
import com.ss.android.ugc.playerkit.simapicommon.a.d;
import com.ss.android.ugc.playerkit.simapicommon.a.e;
import com.ss.android.ugc.playerkit.simapicommon.a.f;
import com.ss.android.ugc.playerkit.simapicommon.a.g;
import com.ss.android.ugc.playerkit.simapicommon.a.h;
import com.ss.android.ugc.playerkit.simapicommon.a.i;
import java.util.ArrayList;

public final class a {
    static {
        Covode.recordClassIndex(94070);
    }

    public static VideoUrlModel a(i iVar) {
        if (iVar == null) {
            return null;
        }
        VideoUrlModel videoUrlModel = (VideoUrlModel) iVar.origin;
        ArrayList arrayList = new ArrayList();
        if (iVar.getBitRate() != null) {
            for (e eVar : new ArrayList(iVar.getBitRate())) {
                arrayList.add(a(eVar));
            }
        }
        videoUrlModel.setBitRate(arrayList);
        videoUrlModel.setDashVideoId(iVar.getDashVideoId());
        videoUrlModel.setDashVideoModelStr(iVar.getDashVideoModelStr());
        videoUrlModel.setDashVideoId(iVar.getDashVideoId());
        videoUrlModel.setFileCheckSum(iVar.getFileCheckSum());
        videoUrlModel.setBytevc1(iVar.isBytevc1());
        videoUrlModel.setHitBitrate(iVar.getHitBitrate());
        videoUrlModel.setRatio(iVar.getRatio());
        videoUrlModel.setVr(iVar.isVr());
        videoUrlModel.setSourceId(iVar.getSourceId());
        videoUrlModel.setDuration(iVar.getDuration());
        videoUrlModel.setFileHash(iVar.getFileHash());
        videoUrlModel.setHeight(iVar.getHeight());
        videoUrlModel.setWidth(iVar.getWidth());
        videoUrlModel.setSize(iVar.getSize());
        videoUrlModel.setUri(iVar.getOriginUri());
        videoUrlModel.setUrlKey(iVar.getUrlKey());
        videoUrlModel.setUrlList(iVar.getUrlList());
        return videoUrlModel;
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

    public static g a(UrlModel urlModel) {
        if (urlModel == null) {
            return null;
        }
        g gVar = new g();
        gVar.origin = urlModel;
        gVar.setFileHash(urlModel.getFileHash());
        gVar.setHeight(urlModel.getHeight());
        gVar.setWidth(urlModel.getWidth());
        gVar.setSize(urlModel.getSize());
        gVar.setUri(urlModel instanceof VideoUrlModel ? ((VideoUrlModel) urlModel).getOriginUri() : urlModel.getUri());
        gVar.setUrlKey(urlModel.getUrlKey());
        gVar.setUrlList(urlModel.getUrlList());
        return gVar;
    }

    private static e a(BitRate bitRate) {
        if (bitRate == null) {
            return null;
        }
        e eVar = new e();
        eVar.origin = bitRate;
        eVar.setBytevc1(bitRate.isBytevc1());
        eVar.setPlayAddr(a(bitRate.getPlayAddr()));
        eVar.setBitRate(bitRate.getBitRate());
        eVar.setGearName(bitRate.getGearName());
        eVar.setQualityType(bitRate.getQualityType());
        return eVar;
    }

    public static h a(Video video) {
        if (video == null) {
            return null;
        }
        h hVar = new h();
        hVar.origin = video;
        ArrayList arrayList = new ArrayList();
        if (video.getBitRate() != null) {
            for (BitRate bitRate : new ArrayList(video.getBitRate())) {
                arrayList.add(a(bitRate));
            }
        }
        hVar.setBitRate(arrayList);
        hVar.setDrmTokenAuth(a(video.getDrmTokenAuth()));
        hVar.setDuration((double) video.getDuration());
        hVar.setHeight(video.getHeight());
        hVar.setNeedSetCookie(video.isNeedSetCookie());
        hVar.setPlayAddr(a(video.getPlayAddr()));
        hVar.setPlayAddrBytevc1(a(video.getPlayAddrBytevc1()));
        hVar.setRatio(video.getRatio());
        hVar.setEnableIntertrustDrm(video.enableIntertrustDrm());
        hVar.setMeta(video.getMeta());
        hVar.setVideoLength(video.getVideoLength());
        hVar.setVideoModelStr(video.getVideoModelStr());
        hVar.setWidth(video.getWidth());
        hVar.setClaInfo(a(video.getCaptionModel()));
        return hVar;
    }

    private static f a(PlayTokenAuth playTokenAuth) {
        if (playTokenAuth == null) {
            return null;
        }
        f fVar = new f();
        fVar.origin = playTokenAuth;
        fVar.setAuth(playTokenAuth.getAuth());
        fVar.setVersion(playTokenAuth.getVersionN());
        fVar.setHostIndex(playTokenAuth.getHostIndex());
        fVar.setHosts(playTokenAuth.getHosts());
        fVar.setVid(playTokenAuth.getVid());
        fVar.setToken(playTokenAuth.getToken());
        return fVar;
    }

    private static b a(CaptionModel captionModel) {
        if (captionModel == null || captionModel.getCaptionList() == null || captionModel.getOriginalCaptionLanguage() == null) {
            return null;
        }
        ArrayList arrayList = new ArrayList();
        int i2 = 0;
        for (CaptionItemModel captionItemModel : captionModel.getCaptionList()) {
            arrayList.add(new com.ss.android.ugc.playerkit.simapicommon.a.a(captionItemModel.getExpire(), captionItemModel.getFormat(), captionItemModel.getLanguageName(), captionItemModel.getSubId(), captionItemModel.getVersionType(), captionItemModel.getUrl(), captionItemModel.getLanguageId(), captionItemModel.isAutoGenerated(), captionItemModel.getComplaintId(), SystemClock.elapsedRealtime(), i2, ""));
            i2++;
        }
        boolean z = true;
        boolean z2 = captionModel.getEnableAutoCaption() != 0;
        if (captionModel.getHasOriginalAudio() == 0) {
            z = false;
        }
        return new b(z2, z, new c(captionModel.getOriginalCaptionLanguage().getLanguageName(), (long) ((int) captionModel.getOriginalCaptionLanguage().getLanguageId())), arrayList);
    }

    private static BitRate a(e eVar) {
        if (eVar == null) {
            return null;
        }
        BitRate bitRate = (BitRate) eVar.origin;
        bitRate.setBytevc1(eVar.getIsBytevc1());
        bitRate.setPlayAddr(a(eVar.playAddrBytevc1));
        bitRate.setPlayAddr(a(eVar.getPlayAddr()));
        bitRate.setBitRate(eVar.getBitRate());
        bitRate.setGearName(eVar.getGearName());
        bitRate.setQualityType(eVar.getQualityType());
        return bitRate;
    }

    private static UrlModel a(g gVar) {
        String uri;
        if (gVar == null) {
            return null;
        }
        UrlModel urlModel = (UrlModel) gVar.origin;
        urlModel.setFileHash(gVar.getFileHash());
        urlModel.setHeight(gVar.getHeight());
        urlModel.setWidth(gVar.getWidth());
        urlModel.setSize(gVar.getSize());
        if (gVar instanceof i) {
            uri = ((i) gVar).getOriginUri();
        } else {
            uri = gVar.getUri();
        }
        urlModel.setUri(uri);
        urlModel.setUrlKey(gVar.getUrlKey());
        urlModel.setUrlList(gVar.getUrlList());
        return urlModel;
    }

    public static VideoUrlModel a(CaptionItemModel captionItemModel) {
        if (captionItemModel == null) {
            return null;
        }
        VideoUrlModel videoUrlModel = new VideoUrlModel();
        videoUrlModel.setSourceId(String.valueOf(captionItemModel.getSubId()));
        ArrayList arrayList = new ArrayList();
        arrayList.add(captionItemModel.getUrl());
        videoUrlModel.setUrlList(arrayList);
        videoUrlModel.setUrlList(arrayList);
        videoUrlModel.setUri(String.valueOf(captionItemModel.getSubId()));
        videoUrlModel.setUrlKey(String.valueOf(captionItemModel.getSubId()));
        return videoUrlModel;
    }

    public static VideoUrlModel a(TtsInfos ttsInfos) {
        long j2;
        if (ttsInfos == null || ttsInfos.getPlayAddress() == null) {
            return null;
        }
        VideoUrlModel videoUrlModel = new VideoUrlModel();
        if (ttsInfos.getPlayAddress() != null) {
            if (ttsInfos.getPlayAddress().getUrlKey() != null) {
                videoUrlModel.setSourceId(ttsInfos.getPlayAddress().getUrlKey());
            }
            if (ttsInfos.getPlayAddress().getFileHash() != null) {
                videoUrlModel.setFileHash(ttsInfos.getPlayAddress().getFileHash());
            }
            if (ttsInfos.getPlayAddress().getHeight() != null) {
                videoUrlModel.setHeight(ttsInfos.getPlayAddress().getHeight().intValue());
            }
            if (ttsInfos.getPlayAddress().getWidth() != null) {
                videoUrlModel.setWidth(ttsInfos.getPlayAddress().getWidth().intValue());
            }
            if (ttsInfos.getPlayAddress().getDataSize() != null) {
                j2 = ttsInfos.getPlayAddress().getDataSize().longValue();
            } else {
                j2 = 0;
            }
            videoUrlModel.setSize(j2);
            if (ttsInfos.getPlayAddress().getUri() != null) {
                videoUrlModel.setUri(ttsInfos.getPlayAddress().getUri());
            }
            if (ttsInfos.getPlayAddress().getUrlKey() != null) {
                videoUrlModel.setUrlKey(ttsInfos.getPlayAddress().getUrlKey());
            }
            if (ttsInfos.getPlayAddress().getUrlList() != null) {
                videoUrlModel.setUrlList(ttsInfos.getPlayAddress().getUrlList());
            }
            if (ttsInfos.getPlayAddress().getUrlKey() != null) {
                videoUrlModel.setUri(ttsInfos.getPlayAddress().getUrlKey());
            }
        }
        return videoUrlModel;
    }

    public static VideoUrlModel a(com.ss.android.ugc.playerkit.simapicommon.a.a aVar) {
        if (aVar == null) {
            return null;
        }
        VideoUrlModel videoUrlModel = new VideoUrlModel();
        videoUrlModel.setSourceId(String.valueOf(aVar.getSubId()));
        ArrayList arrayList = new ArrayList();
        arrayList.add(aVar.getUrl());
        videoUrlModel.setUrlList(arrayList);
        return videoUrlModel;
    }

    public static VideoUrlModel a(d dVar) {
        if (dVar == null) {
            return null;
        }
        VideoUrlModel videoUrlModel = new VideoUrlModel();
        if (dVar.getUrlKey() != null) {
            videoUrlModel.setSourceId(dVar.getUrlKey());
        }
        if (dVar.getFileHash() != null) {
            videoUrlModel.setFileHash(dVar.getFileHash());
        }
        videoUrlModel.setHeight(dVar.getHeight());
        videoUrlModel.setWidth(dVar.getWidth());
        videoUrlModel.setSize(dVar.getSize());
        if (dVar.getUri() != null) {
            videoUrlModel.setUri(dVar.getUri());
        }
        if (dVar.getUrlKey() != null) {
            videoUrlModel.setUrlKey(dVar.getUrlKey());
        }
        if (dVar.getUrlList() != null) {
            videoUrlModel.setUrlList(dVar.getUrlList());
        }
        return videoUrlModel;
    }
}
