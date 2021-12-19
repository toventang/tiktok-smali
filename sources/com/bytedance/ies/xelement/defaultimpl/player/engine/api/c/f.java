package com.bytedance.ies.xelement.defaultimpl.player.engine.api.c;

import com.bytedance.covode.number.Covode;
import com.bytedance.ies.xelement.defaultimpl.player.engine.api.common.PlayModel;

public interface f {
    static {
        Covode.recordClassIndex(22230);
    }

    String getAlbumName();

    String getArtistName();

    String getCoverUrl();

    long getDuration();

    String getId();

    String getLocalPath();

    PlayModel getPlayModel();

    String getPlayUrl();

    String getSongName();
}
