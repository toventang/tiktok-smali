package com.google.i18n.phonenumbers;

import com.bytedance.covode.number.Covode;
import com.google.i18n.phonenumbers.Phonemetadata;
import java.util.List;
import java.util.concurrent.ConcurrentHashMap;

/* access modifiers changed from: package-private */
public final class MultiFileMetadataSourceImpl implements MetadataSource {
    private final ConcurrentHashMap<String, Phonemetadata.PhoneMetadata> geographicalRegions;
    private final MetadataLoader metadataLoader;
    private final ConcurrentHashMap<Integer, Phonemetadata.PhoneMetadata> nonGeographicalRegions;
    private final String phoneNumberMetadataFilePrefix;

    static {
        Covode.recordClassIndex(34080);
    }

    MultiFileMetadataSourceImpl(MetadataLoader metadataLoader2) {
        this("/com/google/i18n/phonenumbers/data/PhoneNumberMetadataProto", metadataLoader2);
    }

    @Override // com.google.i18n.phonenumbers.MetadataSource
    public final Phonemetadata.PhoneMetadata getMetadataForRegion(String str) {
        return MetadataManager.getMetadataFromMultiFilePrefix(str, this.geographicalRegions, this.phoneNumberMetadataFilePrefix, this.metadataLoader);
    }

    @Override // com.google.i18n.phonenumbers.MetadataSource
    public final Phonemetadata.PhoneMetadata getMetadataForNonGeographicalRegion(int i2) {
        if (!isNonGeographical(i2)) {
            return null;
        }
        return MetadataManager.getMetadataFromMultiFilePrefix(Integer.valueOf(i2), this.nonGeographicalRegions, this.phoneNumberMetadataFilePrefix, this.metadataLoader);
    }

    private boolean isNonGeographical(int i2) {
        List<String> list = CountryCodeToRegionCodeMap.getCountryCodeToRegionCodeMap().get(Integer.valueOf(i2));
        if (list.size() != 1 || !"001".equals(list.get(0))) {
            return false;
        }
        return true;
    }

    MultiFileMetadataSourceImpl(String str, MetadataLoader metadataLoader2) {
        this.geographicalRegions = new ConcurrentHashMap<>();
        this.nonGeographicalRegions = new ConcurrentHashMap<>();
        this.phoneNumberMetadataFilePrefix = str;
        this.metadataLoader = metadataLoader2;
    }
}
