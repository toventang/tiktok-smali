package com.twitter.sdk.android.core.identity;

import android.webkit.ConsoleMessage;
import android.webkit.WebChromeClient;
import com.bytedance.covode.number.Covode;

final class e extends WebChromeClient {
    static {
        Covode.recordClassIndex(103606);
    }

    public final boolean onConsoleMessage(ConsoleMessage consoleMessage) {
        return true;
    }

    e() {
    }
}
