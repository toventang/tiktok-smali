package com.ss.android.ugc.aweme.choosemusic.utils;

import com.bytedance.common.utility.collection.b;
import com.bytedance.common.utility.m;
import com.bytedance.covode.number.Covode;
import com.ss.android.ugc.aweme.music.model.Music;
import com.ss.android.ugc.aweme.shortvideo.model.MusicModel;
import java.util.ArrayList;
import java.util.Collection;
import java.util.List;

public final class c {
    static {
        Covode.recordClassIndex(43601);
    }

    public static String a(int i2) {
        return i2 == 0 ? "popular_song" : i2 == 3 ? "song_category" : i2 == 2 ? "search_result" : "";
    }

    public static List<MusicModel> b(List<Music> list) {
        ArrayList arrayList = new ArrayList();
        for (Music music : list) {
            if (music != null) {
                MusicModel convertToMusicModel = music.convertToMusicModel();
                convertToMusicModel.setChallengeUserCount(music.getUserCount());
                convertToMusicModel.setChallengeMusic(true);
                convertToMusicModel.setDataType(0);
                arrayList.add(convertToMusicModel);
            }
        }
        return arrayList;
    }

    public static List<MusicModel> a(List<Music> list) {
        if (list == null) {
            return null;
        }
        ArrayList arrayList = new ArrayList();
        for (Music music : list) {
            if (music != null) {
                arrayList.add(music.convertToMusicModel());
            }
        }
        return arrayList;
    }

    public static MusicModel a(List<MusicModel> list, String str) {
        if (b.a((Collection) list)) {
            return null;
        }
        for (MusicModel musicModel : list) {
            if (musicModel != null && m.a(musicModel.getMusicId(), str)) {
                return musicModel;
            }
        }
        return null;
    }
}
