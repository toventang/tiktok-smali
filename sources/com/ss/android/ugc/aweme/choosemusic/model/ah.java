package com.ss.android.ugc.aweme.choosemusic.model;

import com.bytedance.covode.number.Covode;
import com.google.gson.a.c;
import com.ss.android.ugc.aweme.base.api.BaseResponse;
import com.ss.android.ugc.aweme.discover.model.Banner;
import com.ss.android.ugc.aweme.music.model.Music;
import com.ss.android.ugc.aweme.music.model.MusicCollectionItem;
import java.util.List;

public final class ah extends BaseResponse {
    @c(a = "banner_list")

    /* renamed from: a  reason: collision with root package name */
    public List<Banner> f70617a;
    @c(a = "mc_list")

    /* renamed from: b  reason: collision with root package name */
    public List<MusicCollectionItem> f70618b;
    @c(a = "music_list")

    /* renamed from: c  reason: collision with root package name */
    public List<Music> f70619c;
    @c(a = "extra_music_list")

    /* renamed from: d  reason: collision with root package name */
    public List<Music> f70620d;
    @c(a = "music_list_type")

    /* renamed from: e  reason: collision with root package name */
    public int f70621e;
    @c(a = "radio_cursor")

    /* renamed from: f  reason: collision with root package name */
    public int f70622f;

    static {
        Covode.recordClassIndex(43550);
    }
}
