package com.ss.android.ugc.aweme.choosemusic;

import android.app.Activity;
import android.os.Bundle;
import android.text.TextUtils;
import com.bytedance.covode.number.Covode;
import com.ss.android.ugc.aweme.choosemusic.viewholder.s;
import com.ss.android.ugc.aweme.common.a.f;
import com.ss.android.ugc.aweme.component.music.MusicService;
import com.ss.android.ugc.aweme.login.c;
import com.ss.android.ugc.aweme.search.SearchServiceImpl;
import com.ss.android.ugc.aweme.shortvideo.model.MusicModel;
import com.zhiliaoapp.musically.R;
import h.f.a.b;
import h.f.b.l;
import h.f.b.m;
import h.z;

public final class a {

    /* renamed from: a  reason: collision with root package name */
    public static final a f70269a = new a();

    private a() {
    }

    public static void a() {
        MusicService.m().k();
    }

    static {
        Covode.recordClassIndex(43353);
    }

    /* renamed from: com.ss.android.ugc.aweme.choosemusic.a$a  reason: collision with other inner class name */
    public static final class C1590a extends m implements b<com.bytedance.tux.c.a, z> {

        /* renamed from: a  reason: collision with root package name */
        public static final C1590a f70278a = new C1590a();

        static {
            Covode.recordClassIndex(43354);
        }

        C1590a() {
            super(1);
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
        @Override // h.f.a.b
        public final /* synthetic */ z invoke(com.bytedance.tux.c.a aVar) {
            com.bytedance.tux.c.a aVar2 = aVar;
            l.d(aVar2, "");
            aVar2.f44749a = R.raw.icon_large_music_note;
            aVar2.f44753e = Integer.valueOf((int) R.attr.bd);
            return z.f158842a;
        }
    }

    public static final <T> void a(f<T> fVar) {
        if (fVar != null) {
            fVar.d(false);
        }
    }

    public static final void a(Activity activity, String str, String str2) {
        a();
        if (str == null) {
            str = "";
        }
        c.a(activity, str, str2, (Bundle) null, (com.ss.android.ugc.aweme.base.component.f) null);
    }

    public static final void a(s sVar, MusicModel musicModel, b bVar, boolean z) {
        String str;
        String str2;
        String str3;
        if (sVar != null) {
            if (bVar != null) {
                str = bVar.f70379a;
            } else {
                str = null;
            }
            if (TextUtils.equals("search_music", str)) {
                com.ss.android.ugc.aweme.discover.h.b f2 = SearchServiceImpl.t().f();
                if (bVar == null || (str2 = bVar.f70379a) == null) {
                    str2 = "";
                }
                int position = sVar.getPosition();
                if (z) {
                    str3 = "click_pause_music";
                } else {
                    str3 = "click_play_music";
                }
                f2.a(str2, musicModel, position, str3);
            }
        }
    }
}
