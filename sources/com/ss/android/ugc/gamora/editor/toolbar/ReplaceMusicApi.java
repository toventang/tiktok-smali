package com.ss.android.ugc.gamora.editor.toolbar;

import com.bytedance.covode.number.Covode;
import com.bytedance.retrofit2.b;
import com.ss.android.ugc.aweme.base.api.BaseResponse;
import l.b.c;
import l.b.e;
import l.b.o;

public final class ReplaceMusicApi {

    /* renamed from: a  reason: collision with root package name */
    public static final a f146992a = new a((byte) 0);

    public interface Api {
        static {
            Covode.recordClassIndex(96824);
        }

        @o(a = "tiktok/video/music/edit/v1/")
        @e
        b<BaseResponse> get(@c(a = "item_id") String str, @c(a = "original_vid") String str2, @c(a = "new_music_info") String str3);
    }

    static {
        Covode.recordClassIndex(96823);
    }

    public static final class a {
        static {
            Covode.recordClassIndex(96825);
        }

        private a() {
        }

        public /* synthetic */ a(byte b2) {
            this();
        }
    }
}
