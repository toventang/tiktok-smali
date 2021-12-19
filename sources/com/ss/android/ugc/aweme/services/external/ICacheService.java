package com.ss.android.ugc.aweme.services.external;

import com.bytedance.covode.number.Covode;
import java.io.File;
import java.util.ArrayList;
import java.util.Collection;

public interface ICacheService {
    static {
        Covode.recordClassIndex(79627);
    }

    Collection<String> allowList();

    String cacheDir();

    void clearDraftEffectCache();

    void clearEffectCache();

    void clearFilterCache();

    void clearMvCache();

    String compatMusDraftDir();

    Collection<String> draftAllowList();

    ArrayList<String> draftEffectList();

    ArrayList<String> draftMusicList();

    String effectCacheDir();

    String filterDir();

    String musicDir();

    String mvRootDir();

    Collection<String> originSoundFile();

    File[] outputFile();

    File[] rawDuetFile();

    File[] rawVideoFile();

    String rootDir();

    String shareDir();

    String stickerDir();

    File[] synthesisFile();

    File[] tempDuetFile();

    Collection<String> tempVideoFile();

    File[] voiceFile();
}
