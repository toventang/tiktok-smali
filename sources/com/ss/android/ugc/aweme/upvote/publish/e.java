package com.ss.android.ugc.aweme.upvote.publish;

import com.bytedance.assem.arch.a.d;
import com.bytedance.covode.number.Covode;
import com.ss.android.ugc.aweme.base.api.BaseResponse;
import com.ss.android.ugc.aweme.upvote.c.c;
import com.ss.android.ugc.aweme.upvote.c.g;
import f.a.ab;
import java.util.List;

public interface e extends d {

    public static final class a {
        static {
            Covode.recordClassIndex(93075);
        }
    }

    static {
        Covode.recordClassIndex(93074);
    }

    ab<BaseResponse> a(String str);

    ab<g> a(String str, String str2);

    ab<c> a(List<String> list);

    ab<g> b(String str, String str2);
}
