package com.ss.android.ugc.aweme.social.service;

import com.bytedance.covode.number.Covode;
import com.bytedance.tux.input.TuxTextView;
import com.ss.android.ugc.aweme.feed.model.Aweme;
import com.ss.android.ugc.aweme.profile.model.User;

public interface IRelationExtService {
    static {
        Covode.recordClassIndex(87469);
    }

    void a(TuxTextView tuxTextView, User user, Aweme aweme, Integer num);
}
