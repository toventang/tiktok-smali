package com.ss.android.ugc.aweme.challenge.service;

import com.bytedance.covode.number.Covode;
import com.ss.android.ugc.aweme.discover.model.Challenge;
import com.ss.android.ugc.aweme.music.model.Music;

public interface IChallengeService {

    public interface a {
        static {
            Covode.recordClassIndex(43187);
        }

        void a(String str, Music music, boolean z);

        boolean a(String str, Challenge challenge);
    }

    static {
        Covode.recordClassIndex(43186);
    }

    void a(String str, String str2, String str3, Music music, a aVar);
}
