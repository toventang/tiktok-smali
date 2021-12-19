package com.google.i18n.phonenumbers;

import com.bytedance.covode.number.Covode;
import com.google.i18n.phonenumbers.Phonemetadata;

/* access modifiers changed from: package-private */
public interface MetadataSource {
    static {
        Covode.recordClassIndex(34079);
    }

    Phonemetadata.PhoneMetadata getMetadataForNonGeographicalRegion(int i2);

    Phonemetadata.PhoneMetadata getMetadataForRegion(String str);
}
