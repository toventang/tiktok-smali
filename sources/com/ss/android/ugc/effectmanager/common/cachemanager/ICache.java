package com.ss.android.ugc.effectmanager.common.cachemanager;

import com.bytedance.covode.number.Covode;
import java.io.InputStream;
import java.util.regex.Pattern;

public interface ICache {
    static {
        Covode.recordClassIndex(95273);
    }

    void clear();

    boolean has(String str);

    InputStream queryToStream(String str);

    String queryToValue(String str);

    boolean remove(String str);

    void removePattern(String str);

    void removePattern(Pattern pattern);

    long save(String str, InputStream inputStream);

    long save(String str, String str2);
}
