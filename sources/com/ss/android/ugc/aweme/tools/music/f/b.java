package com.ss.android.ugc.aweme.tools.music.f;

import android.text.TextUtils;
import com.bytedance.covode.number.Covode;
import com.google.c.a.f;
import com.google.c.c.ap;
import com.ss.android.ugc.aweme.base.model.UrlModel;
import com.ss.android.ugc.aweme.common.LogPbBean;
import com.ss.android.ugc.aweme.music.model.Music;
import com.ss.android.ugc.aweme.shortvideo.c;
import com.ss.android.ugc.aweme.shortvideo.model.MusicModel;
import h.f.b.l;
import java.util.ArrayList;
import java.util.Collection;
import java.util.List;

public final class b implements f<MusicModel, c> {

    /* renamed from: a  reason: collision with root package name */
    public static final a f140592a = new a((byte) 0);

    static {
        Covode.recordClassIndex(91822);
    }

    public static final class a {
        static {
            Covode.recordClassIndex(91823);
        }

        private a() {
        }

        public /* synthetic */ a(byte b2) {
            this();
        }

        public static ArrayList<c> a(List<? extends MusicModel> list) {
            if (list == null || list.isEmpty()) {
                return new ArrayList<>();
            }
            ArrayList<c> a2 = ap.a((Iterable) ap.a(list, new b()));
            l.b(a2, "");
            return a2;
        }

        public static MusicModel a(c cVar) {
            MusicModel.CollectionType collectionType;
            l.d(cVar, "");
            MusicModel musicModel = new MusicModel();
            musicModel.setMusicId(cVar.getMusicId());
            musicModel.setId(cVar.getId());
            musicModel.setAlbum(cVar.getAlbum());
            musicModel.setName(cVar.getMusicName());
            musicModel.setAlbum(cVar.getAlbum());
            if (cVar.getCoverMedium() != null) {
                UrlModel coverMedium = cVar.getCoverMedium();
                l.b(coverMedium, "");
                if (!com.bytedance.common.utility.collection.b.a((Collection) coverMedium.getUrlList())) {
                    UrlModel coverMedium2 = cVar.getCoverMedium();
                    l.b(coverMedium2, "");
                    musicModel.setPicPremium(coverMedium2.getUrlList().get(0));
                }
            }
            if (cVar.getCoverThumb() != null) {
                UrlModel coverThumb = cVar.getCoverThumb();
                l.b(coverThumb, "");
                if (!com.bytedance.common.utility.collection.b.a((Collection) coverThumb.getUrlList())) {
                    UrlModel coverThumb2 = cVar.getCoverThumb();
                    l.b(coverThumb2, "");
                    musicModel.setPicSmall(coverThumb2.getUrlList().get(0));
                }
            }
            musicModel.setLocalPath(cVar.getPath());
            musicModel.setSinger(cVar.getSinger());
            if (cVar.getMusicType() == MusicModel.MusicType.ONLINE.ordinal()) {
                musicModel.setUrl(cVar.getPlayUrl());
            }
            musicModel.setDuration(cVar.duration);
            musicModel.setShootDuration(Integer.valueOf(cVar.shootDuration));
            musicModel.setAuditionDuration(Integer.valueOf(cVar.auditionDuration));
            if (cVar.getMusicType() == MusicModel.MusicType.LOCAL.ordinal()) {
                musicModel.setMusicType(MusicModel.MusicType.LOCAL);
            }
            if (cVar.getMusicType() == MusicModel.MusicType.ONLINE.ordinal()) {
                musicModel.setMusicType(MusicModel.MusicType.ONLINE);
            }
            musicModel.setOfflineDesc(cVar.getOfflineDesc());
            musicModel.setMusicStatus(cVar.getMusicStatus());
            musicModel.setStrongBeatUrl(cVar.getStrongBeatUrl());
            musicModel.setLrcUrl(cVar.getLrcUrl());
            musicModel.setLrcType(cVar.getLrcType());
            musicModel.setPreviewStartTime(cVar.getPreviewStartTime());
            musicModel.setExtra(cVar.extra);
            if (cVar.isCollected()) {
                collectionType = MusicModel.CollectionType.COLLECTED;
            } else {
                collectionType = MusicModel.CollectionType.NOT_COLLECTED;
            }
            musicModel.setCollectionType(collectionType);
            musicModel.setNeedSetCookie(cVar.isNeedSetCookie());
            musicModel.setVideoDuration(cVar.getVideoDuration());
            musicModel.setPgc(cVar.isPgc());
            musicModel.setBeatInfo(cVar.getMusicBeat());
            musicModel.setLocalMusicDuration(cVar.getLocalMusicDuration());
            musicModel.setLocalMusicId(cVar.getLocalMusicId());
            musicModel.setMuteShare(cVar.isMuteShare());
            return musicModel;
        }
    }

    /* Return type fixed from 'java.lang.Object' to match base method */
    /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
    @Override // com.google.c.a.f
    public final /* bridge */ /* synthetic */ c a(MusicModel musicModel) {
        return a(musicModel);
    }

    public static c a(MusicModel musicModel) {
        String str;
        String str2 = null;
        if (musicModel == null) {
            return null;
        }
        c cVar = new c();
        Music convertToMusic = musicModel.convertToMusic();
        l.b(convertToMusic, "");
        cVar.id = convertToMusic.getId();
        cVar.setCommerceMusic(convertToMusic.isCommercialMusic());
        cVar.setOriginalSound(convertToMusic.isOriginalSound());
        cVar.musicName = convertToMusic.getMusicName();
        cVar.album = convertToMusic.getAlbum();
        boolean z = false;
        if (!TextUtils.isEmpty(musicModel.getLocalPath())) {
            cVar.path = musicModel.getLocalPath();
        } else if (musicModel.isPlayUrlValid()) {
            UrlModel url = musicModel.getUrl();
            l.b(url, "");
            cVar.path = url.getUrlList().get(0);
        }
        cVar.authorName = convertToMusic.getAuthorName();
        cVar.playUrl = convertToMusic.getPlayUrl();
        cVar.coverThumb = convertToMusic.getCoverThumb();
        cVar.coverMedium = convertToMusic.getCoverMedium();
        cVar.coverLarge = convertToMusic.getCoverLarge();
        cVar.duration = convertToMusic.getDuration();
        cVar.shootDuration = convertToMusic.getShootDuration();
        cVar.auditionDuration = convertToMusic.getAuditionDuration();
        cVar.musicType = musicModel.getMusicType().ordinal();
        cVar.offlineDesc = musicModel.getOfflineDesc();
        cVar.musicStatus = convertToMusic.getMusicStatus();
        if (convertToMusic.getChallenge() != null) {
            cVar.challenge = a.a(convertToMusic.getChallenge());
        }
        cVar.strongBeatUrl = convertToMusic.getStrongBeatUrl();
        cVar.setLrcUrl(convertToMusic.getLrcUrl());
        cVar.setLrcType(convertToMusic.getLrcType());
        cVar.setPreviewStartTime(convertToMusic.getPreviewStartTime());
        cVar.setPreventDownload(musicModel.isPreventDownload());
        if (musicModel.getMusicWaveBean() != null) {
            cVar.setMusicWaveData(musicModel.getMusicWaveBean().getMusicWavePointArray());
        }
        cVar.setMvThemeMusic(musicModel.isMvThemeMusic());
        LogPbBean logPbBean = new LogPbBean();
        com.ss.android.ugc.aweme.feed.model.LogPbBean logPb = musicModel.getLogPb();
        if (logPb != null) {
            str = logPb.getImprId();
        } else {
            str = null;
        }
        logPbBean.setImprId(str);
        cVar.setLogPb(logPbBean);
        cVar.setComeFromForMod(musicModel.getComeFromForMod());
        cVar.setCategoryID(musicModel.getCategoryID());
        cVar.setSearchKeyWords(musicModel.getSearchKeyWords());
        cVar.setSongId(musicModel.getSongId());
        cVar.extra = musicModel.getExtra();
        cVar.setDmvAutoShow(musicModel.getDmvAutoShow());
        if (musicModel.getCollectionType() == MusicModel.CollectionType.COLLECTED) {
            z = true;
        }
        cVar.setCollected(z);
        if (TextUtils.isEmpty(cVar.extra)) {
            Music music = musicModel.getMusic();
            if (music != null) {
                str2 = music.getExtra();
            }
            cVar.extra = str2;
        }
        cVar.setNeedSetCookie(musicModel.isNeedSetCookie());
        cVar.setVideoDuration(musicModel.getVideoDuration());
        cVar.setPgc(musicModel.isPgc());
        cVar.setMusicBeat(musicModel.getBeatInfo());
        cVar.setLocalMusicDuration(musicModel.getLocalMusicDuration());
        cVar.setLocalMusicId(musicModel.getLocalMusicId());
        cVar.setMuteShare(musicModel.isMuteShare());
        return cVar;
    }
}
