package com.ss.android.ugc.aweme.shortvideo.model;

import com.bytedance.covode.number.Covode;

public class ID3InfoModel {
    public String songAlbum;
    public String songSinger;
    public String songTitle;

    static {
        Covode.recordClassIndex(84453);
    }
}
