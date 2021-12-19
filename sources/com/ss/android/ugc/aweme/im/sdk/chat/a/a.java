package com.ss.android.ugc.aweme.im.sdk.chat.a;

import com.bytedance.covode.number.Covode;

public enum a {
    SEND_SUCCESS,
    SEND_FAIL,
    SEND_UNEXPECTED_FAIL,
    BIG_EMOJI_SUCCESS,
    BIG_EMOJI_FAIL,
    SELF_EMOJI_SUCCESS,
    SELF_EMOJI_FAIL,
    SEARCH_GIF_SUCCESS,
    SEARCH_GIF_FAIL,
    TEXT_SUCCESS,
    TEXT_FAIL,
    VIDEO_SUCCESS,
    VIDEO_FAIL;

    static {
        Covode.recordClassIndex(63796);
    }
}
