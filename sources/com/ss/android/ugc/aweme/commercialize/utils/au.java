package com.ss.android.ugc.aweme.commercialize.utils;

import com.bytedance.covode.number.Covode;
import java.util.LinkedHashMap;

public final class au {

    /* renamed from: a  reason: collision with root package name */
    public static final LinkedHashMap<Integer, k> f75618a = new LinkedHashMap<>();

    /* renamed from: b  reason: collision with root package name */
    public static final au f75619b = new au();

    private au() {
    }

    static {
        Covode.recordClassIndex(46643);
    }

    public static k a() {
        LinkedHashMap<Integer, k> linkedHashMap = f75618a;
        if (!linkedHashMap.isEmpty()) {
            return linkedHashMap.values().iterator().next();
        }
        return null;
    }
}
