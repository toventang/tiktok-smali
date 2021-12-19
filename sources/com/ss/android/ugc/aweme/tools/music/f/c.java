package com.ss.android.ugc.aweme.tools.music.f;

import com.bytedance.covode.number.Covode;
import com.ss.android.ugc.aweme.music.model.Music;
import com.ss.android.ugc.aweme.shortvideo.model.MusicModel;
import java.util.ArrayList;
import java.util.List;

public final class c {

    /* renamed from: a  reason: collision with root package name */
    public static final a f140593a = new a((byte) 0);

    static {
        Covode.recordClassIndex(91824);
    }

    public static final class a {
        static {
            Covode.recordClassIndex(91825);
        }

        private a() {
        }

        public /* synthetic */ a(byte b2) {
            this();
        }

        public static List<MusicModel> a(List<? extends Music> list) {
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
    }
}
