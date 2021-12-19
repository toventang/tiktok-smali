package com.ss.android.ugc.aweme.choosemusic.model;

import com.bytedance.covode.number.Covode;
import com.ss.android.ugc.aweme.music.model.MusicCollectionItem;
import com.ss.android.ugc.aweme.shortvideo.model.MusicModel;
import java.util.List;

public final class ad {

    /* renamed from: a  reason: collision with root package name */
    public MusicCollectionItem f70608a;

    /* renamed from: b  reason: collision with root package name */
    public List<MusicModel> f70609b;

    /* renamed from: c  reason: collision with root package name */
    public int f70610c;

    static {
        Covode.recordClassIndex(43546);
    }

    public ad(List<MusicModel> list, MusicCollectionItem musicCollectionItem, int i2) {
        this.f70609b = list;
        this.f70610c = i2;
        this.f70608a = musicCollectionItem;
    }
}
