package com.ss.android.ugc.aweme.shortvideo.ae;

import android.text.TextUtils;
import com.bytedance.covode.number.Covode;
import com.google.c.a.f;
import com.ss.android.ugc.aweme.music.model.Music;
import com.ss.android.ugc.aweme.shortvideo.c;
import com.ss.android.ugc.aweme.shortvideo.model.MusicModel;

public final class b implements f<MusicModel, c> {
    static {
        Covode.recordClassIndex(82054);
    }

    /* Return type fixed from 'java.lang.Object' to match base method */
    /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
    @Override // com.google.c.a.f
    public final /* bridge */ /* synthetic */ c a(MusicModel musicModel) {
        return a(musicModel);
    }

    public static c a(MusicModel musicModel) {
        c cVar = new c();
        Music convertToMusic = musicModel.convertToMusic();
        cVar.setCommerceMusic(musicModel.isCommerceMusic());
        cVar.setOriginalSound(musicModel.isOriginalSound());
        cVar.id = convertToMusic.getId();
        cVar.musicName = convertToMusic.getMusicName();
        cVar.album = convertToMusic.getAlbum();
        cVar.path = musicModel.getLocalPath();
        if (!TextUtils.isEmpty(musicModel.getLocalPath())) {
            cVar.path = musicModel.getLocalPath();
        } else if (musicModel.isPlayUrlValid()) {
            cVar.path = musicModel.getUrl().getUrlList().get(0);
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
        cVar.userCount = musicModel.getUserCount();
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
        cVar.setNeedSetCookie(musicModel.isNeedSetCookie());
        cVar.setVideoDuration(musicModel.getVideoDuration());
        cVar.setMusicBeat(musicModel.getBeatInfo());
        cVar.setLocalMusicDuration(musicModel.getLocalMusicDuration());
        cVar.setLocalMusicId(musicModel.getLocalMusicId());
        cVar.setMuteShare(musicModel.isMuteShare());
        return cVar;
    }
}
