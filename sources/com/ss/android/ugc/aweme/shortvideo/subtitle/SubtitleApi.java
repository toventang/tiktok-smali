package com.ss.android.ugc.aweme.shortvideo.subtitle;

import b.i;
import com.bytedance.covode.number.Covode;
import com.bytedance.retrofit2.b.b;
import com.bytedance.retrofit2.b.h;
import com.bytedance.retrofit2.b.n;
import com.bytedance.retrofit2.b.t;
import com.bytedance.retrofit2.b.z;

public interface SubtitleApi {
    static {
        Covode.recordClassIndex(85803);
    }

    @t(a = "/tiktok/v1/videocaption/feedback/")
    @n(a = {"Content-Type: application/json"})
    i<Object> feedback(@z(a = "vid") String str, @z(a = "aweme_id") String str2, @z(a = "task_id") String str3, @b j jVar);

    @h(a = "/tiktok/v1/videocaption/query/")
    com.bytedance.retrofit2.b<s> query(@z(a = "task_id") String str);

    @t(a = "/tiktok/v1/videocaption/submit/")
    com.bytedance.retrofit2.b<s> submit(@z(a = "tos_key") String str, @z(a = "max_lines") int i2, @z(a = "words_per_line") int i3);
}
