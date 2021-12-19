package com.google.ar.core.exceptions;

import com.bytedance.covode.number.Covode;
import java.io.IOException;

public class RecordingFailedException extends IOException {
    static {
        Covode.recordClassIndex(33088);
    }

    public RecordingFailedException() {
    }

    public RecordingFailedException(String str) {
        super(str);
    }
}
