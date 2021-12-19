package com.ss.android.ugc.aweme.friends.service;

import com.bytedance.covode.number.Covode;

public interface IFollowService {

    public interface a {
        static {
            Covode.recordClassIndex(61667);
        }

        void a();

        void a(Exception exc);
    }

    static {
        Covode.recordClassIndex(61666);
    }

    void sendRequest(String str, String str2, int i2, a aVar);
}
