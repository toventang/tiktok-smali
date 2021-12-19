package com.ss.android.ugc.aweme.music.presenter;

import android.text.TextUtils;
import com.bytedance.covode.number.Covode;
import com.ss.android.common.util.g;
import com.ss.android.ugc.aweme.discover.model.DynamicMusicModel;
import com.ss.android.ugc.aweme.discover.model.MusicTitleModel;
import com.ss.android.ugc.aweme.music.model.AwemeSearchMusicList;
import com.ss.android.ugc.aweme.music.model.SearchMusic;
import com.ss.android.ugc.aweme.search.SearchServiceImpl;
import com.ss.android.ugc.aweme.shortvideo.model.MusicModel;
import com.ss.android.ugc.aweme.utils.dw;
import java.util.ArrayList;
import java.util.List;

public final class a {

    /* renamed from: a  reason: collision with root package name */
    public boolean f111568a;

    /* renamed from: b  reason: collision with root package name */
    private long f111569b;

    static {
        Covode.recordClassIndex(71697);
    }

    public static AwemeSearchMusicList a(String str) {
        if (TextUtils.isEmpty(str)) {
            return null;
        }
        try {
            return (AwemeSearchMusicList) dw.a(str, AwemeSearchMusicList.class);
        } catch (Exception e2) {
            e2.printStackTrace();
            return null;
        }
    }

    public final ArrayList<MusicModel> a(AwemeSearchMusicList awemeSearchMusicList) {
        ArrayList<MusicModel> arrayList = null;
        if (awemeSearchMusicList == null) {
            return null;
        }
        this.f111569b = (long) awemeSearchMusicList.cursor;
        List<SearchMusic> list = awemeSearchMusicList.searchMusicList;
        if (list != null) {
            arrayList = new ArrayList<>();
            for (SearchMusic searchMusic : list) {
                MusicModel convertToMusicModel = searchMusic.convertToMusicModel();
                if (convertToMusicModel != null) {
                    convertToMusicModel.setLogPb(awemeSearchMusicList.logPb);
                    arrayList.add(convertToMusicModel);
                }
                if ((convertToMusicModel instanceof DynamicMusicModel) && convertToMusicModel.getDynamicPatch() != null && convertToMusicModel.getDynamicPatch().getOriginType() == 1) {
                    arrayList.add(new MusicTitleModel());
                }
            }
            this.f111568a = awemeSearchMusicList.isHasMore();
        }
        return arrayList;
    }

    public final String a(String str, boolean z, String str2, boolean z2, int i2, int i3, int i4, long j2, boolean z3, String str3) {
        String str4;
        int i5;
        int i6;
        if (!z) {
            try {
                this.f111569b = 0;
            } catch (Exception e2) {
                e2.printStackTrace();
                return null;
            }
        }
        long j3 = this.f111569b;
        g gVar = new g(com.ss.android.ugc.aweme.music.api.a.f111102a);
        gVar.a("cursor", j3);
        gVar.a("count", 8);
        gVar.a("keyword", str);
        gVar.a("search_source", str2);
        if (i4 == 0) {
            str4 = "tiktok_music_create";
        } else {
            str4 = "tiktok_music_prolong";
        }
        gVar.a("search_channel", str4);
        gVar.a("enter_from", str2);
        int i7 = 1;
        if (z2) {
            i5 = 1;
        } else {
            i5 = 0;
        }
        gVar.a("query_correct_type", i5);
        gVar.a("filter_by", i2);
        gVar.a("sort_type", i3);
        if (i2 == 0 && i3 == 0) {
            i6 = 0;
        } else {
            i6 = 1;
        }
        gVar.a("is_filter_search", i6);
        gVar.a("user_video_length", j2);
        if (!z3) {
            i7 = 0;
        }
        gVar.a("user_video_created", i7);
        gVar.a("search_id", str3);
        if (j3 == 0) {
            gVar.a("search_context", SearchServiceImpl.t().n().a());
        }
        return gVar.toString();
    }
}
