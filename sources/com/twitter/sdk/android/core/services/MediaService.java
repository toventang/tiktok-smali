package com.twitter.sdk.android.core.services;

import com.bytedance.covode.number.Covode;
import l.b;
import l.b.l;
import l.b.o;
import l.b.q;
import okhttp3.RequestBody;

public interface MediaService {
    static {
        Covode.recordClassIndex(103733);
    }

    @o(a = "https://upload.twitter.com/1.1/media/upload.json")
    @l
    b<Object> upload(@q(a = "media") RequestBody requestBody, @q(a = "media_data") RequestBody requestBody2, @q(a = "additional_owners") RequestBody requestBody3);
}
