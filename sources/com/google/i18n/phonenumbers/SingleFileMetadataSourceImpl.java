package com.google.i18n.phonenumbers;

import com.bytedance.covode.number.Covode;
import com.google.i18n.phonenumbers.MetadataManager;
import com.google.i18n.phonenumbers.Phonemetadata;
import java.util.concurrent.atomic.AtomicReference;

final class SingleFileMetadataSourceImpl implements MetadataSource {
    private final MetadataLoader metadataLoader;
    private final String phoneNumberMetadataFileName;
    private final AtomicReference<MetadataManager.SingleFileMetadataMaps> phoneNumberMetadataRef;

    static {
        Covode.recordClassIndex(34117);
    }

    SingleFileMetadataSourceImpl(MetadataLoader metadataLoader2) {
        this("/com/google/i18n/phonenumbers/data/SingleFilePhoneNumberMetadataProto", metadataLoader2);
    }

    @Override // com.google.i18n.phonenumbers.MetadataSource
    public final Phonemetadata.PhoneMetadata getMetadataForNonGeographicalRegion(int i2) {
        return MetadataManager.getSingleFileMetadataMaps(this.phoneNumberMetadataRef, this.phoneNumberMetadataFileName, this.metadataLoader).get(i2);
    }

    @Override // com.google.i18n.phonenumbers.MetadataSource
    public final Phonemetadata.PhoneMetadata getMetadataForRegion(String str) {
        return MetadataManager.getSingleFileMetadataMaps(this.phoneNumberMetadataRef, this.phoneNumberMetadataFileName, this.metadataLoader).get(str);
    }

    SingleFileMetadataSourceImpl(String str, MetadataLoader metadataLoader2) {
        this.phoneNumberMetadataRef = new AtomicReference<>();
        this.phoneNumberMetadataFileName = str;
        this.metadataLoader = metadataLoader2;
    }
}
