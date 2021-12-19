package com.google.ar.core.exceptions;

import com.bytedance.covode.number.Covode;

public class MetadataNotFoundException extends Exception {
    static {
        Covode.recordClassIndex(33083);
    }

    public MetadataNotFoundException() {
    }

    public MetadataNotFoundException(String str) {
        super(str);
    }
}
