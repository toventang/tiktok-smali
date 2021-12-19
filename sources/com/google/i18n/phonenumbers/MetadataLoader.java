package com.google.i18n.phonenumbers;

import com.bytedance.covode.number.Covode;
import java.io.InputStream;

public interface MetadataLoader {
    static {
        Covode.recordClassIndex(34075);
    }

    InputStream loadMetadata(String str);
}
