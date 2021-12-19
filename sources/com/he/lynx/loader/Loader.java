package com.he.lynx.loader;

import android.net.Uri;
import com.bytedance.covode.number.Covode;

public interface Loader {
    static {
        Covode.recordClassIndex(34211);
    }

    void load(String str, Resolver resolver);

    Uri loadMedia(String str);

    byte[] loadSync(String str);

    void loadUrl(String str, Resolver resolver);
}
