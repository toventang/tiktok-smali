package com.ss.android.ugc.aweme.share;

import com.bytedance.covode.number.Covode;

public enum z {
    ShareDefault,
    ShareUser,
    ShareVideo,
    ShareChallenge,
    ShareMusic,
    ShareStickers,
    ShareInviteFriends,
    ShareLive,
    ShareSearch,
    ShareQA,
    ShareGroupChat;

    static {
        Covode.recordClassIndex(81698);
    }
}
