package com.google.ar.core.exceptions;

import com.bytedance.covode.number.Covode;
import java.io.IOException;

public class PlaybackFailedException extends IOException {
    static {
        Covode.recordClassIndex(33087);
    }

    public PlaybackFailedException() {
    }

    public PlaybackFailedException(String str) {
        super(str);
    }
}
