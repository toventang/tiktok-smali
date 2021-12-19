package com.ss.android.ugc.aweme.commercialize.utils;

import com.bytedance.covode.number.Covode;
import com.ss.android.ugc.aweme.commercialize.AdCardServiceImpl;
import com.ss.android.ugc.aweme.commercialize.IAdCardService;
import com.ss.android.ugc.aweme.feed.model.CardStruct;

public final class c {

    /* renamed from: a  reason: collision with root package name */
    public static final c f75745a = new c();

    private c() {
    }

    static {
        Covode.recordClassIndex(46723);
    }

    public static final boolean a(CardStruct cardStruct) {
        IAdCardService c2;
        if (cardStruct == null || (c2 = AdCardServiceImpl.c()) == null) {
            return false;
        }
        return c2.b(cardStruct);
    }
}
