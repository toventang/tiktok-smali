package com.google.i18n.phonenumbers;

import com.bytedance.covode.number.Covode;
import com.bytedance.frameworks.apm.trace.MethodCollector;
import com.google.i18n.phonenumbers.Phonemetadata;
import java.io.IOException;
import java.io.InputStream;
import java.io.ObjectInputStream;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.atomic.AtomicReference;
import java.util.logging.Level;
import java.util.logging.Logger;

/* access modifiers changed from: package-private */
public final class MetadataManager {
    static final MetadataLoader DEFAULT_METADATA_LOADER = new MetadataLoader() {
        /* class com.google.i18n.phonenumbers.MetadataManager.AnonymousClass1 */

        static {
            Covode.recordClassIndex(34077);
        }

        @Override // com.google.i18n.phonenumbers.MetadataLoader
        public final InputStream loadMetadata(String str) {
            return MetadataManager.class.getResourceAsStream(str);
        }
    };
    private static final Set<Integer> alternateFormatsCountryCodes = AlternateFormatsCountryCodeSet.getCountryCodeSet();
    private static final ConcurrentHashMap<Integer, Phonemetadata.PhoneMetadata> alternateFormatsMap = new ConcurrentHashMap<>();
    private static final Logger logger = Logger.getLogger(MetadataManager.class.getName());
    private static final ConcurrentHashMap<String, Phonemetadata.PhoneMetadata> shortNumberMetadataMap = new ConcurrentHashMap<>();
    private static final Set<String> shortNumberMetadataRegionCodes = ShortNumbersRegionCodeSet.getRegionCodeSet();

    private MetadataManager() {
    }

    static Set<String> getSupportedShortNumberRegions() {
        return Collections.unmodifiableSet(shortNumberMetadataRegionCodes);
    }

    static {
        Covode.recordClassIndex(34076);
    }

    static class SingleFileMetadataMaps {
        private final Map<Integer, Phonemetadata.PhoneMetadata> countryCallingCodeToMetadata;
        private final Map<String, Phonemetadata.PhoneMetadata> regionCodeToMetadata;

        static {
            Covode.recordClassIndex(34078);
        }

        /* access modifiers changed from: package-private */
        public Phonemetadata.PhoneMetadata get(int i2) {
            return this.countryCallingCodeToMetadata.get(Integer.valueOf(i2));
        }

        /* access modifiers changed from: package-private */
        public Phonemetadata.PhoneMetadata get(String str) {
            return this.regionCodeToMetadata.get(str);
        }

        private SingleFileMetadataMaps(Map<String, Phonemetadata.PhoneMetadata> map, Map<Integer, Phonemetadata.PhoneMetadata> map2) {
            this.regionCodeToMetadata = Collections.unmodifiableMap(map);
            this.countryCallingCodeToMetadata = Collections.unmodifiableMap(map2);
        }

        static SingleFileMetadataMaps load(String str, MetadataLoader metadataLoader) {
            List<Phonemetadata.PhoneMetadata> metadataFromSingleFileName = MetadataManager.getMetadataFromSingleFileName(str, metadataLoader);
            HashMap hashMap = new HashMap();
            HashMap hashMap2 = new HashMap();
            for (Phonemetadata.PhoneMetadata phoneMetadata : metadataFromSingleFileName) {
                String id = phoneMetadata.getId();
                if ("001".equals(id)) {
                    hashMap2.put(Integer.valueOf(phoneMetadata.getCountryCode()), phoneMetadata);
                } else {
                    hashMap.put(id, phoneMetadata);
                }
            }
            return new SingleFileMetadataMaps(hashMap, hashMap2);
        }
    }

    static Phonemetadata.PhoneMetadata getAlternateFormatsForCountry(int i2) {
        if (!alternateFormatsCountryCodes.contains(Integer.valueOf(i2))) {
            return null;
        }
        return getMetadataFromMultiFilePrefix(Integer.valueOf(i2), alternateFormatsMap, "/com/google/i18n/phonenumbers/data/PhoneNumberAlternateFormatsProto", DEFAULT_METADATA_LOADER);
    }

    static Phonemetadata.PhoneMetadata getShortNumberMetadataForRegion(String str) {
        if (!shortNumberMetadataRegionCodes.contains(str)) {
            return null;
        }
        return getMetadataFromMultiFilePrefix(str, shortNumberMetadataMap, "/com/google/i18n/phonenumbers/data/ShortNumberMetadataProto", DEFAULT_METADATA_LOADER);
    }

    private static Phonemetadata.PhoneMetadataCollection loadMetadataAndCloseInput(InputStream inputStream) {
        Throwable th;
        MethodCollector.i(4912);
        try {
            ObjectInputStream objectInputStream = new ObjectInputStream(inputStream);
            try {
                Phonemetadata.PhoneMetadataCollection phoneMetadataCollection = new Phonemetadata.PhoneMetadataCollection();
                try {
                    phoneMetadataCollection.readExternal(objectInputStream);
                    try {
                        objectInputStream.close();
                    } catch (IOException e2) {
                        logger.log(Level.WARNING, "error closing input stream (ignored)", (Throwable) e2);
                    }
                    MethodCollector.o(4912);
                    return phoneMetadataCollection;
                } catch (IOException e3) {
                    RuntimeException runtimeException = new RuntimeException("cannot load/parse metadata", e3);
                    MethodCollector.o(4912);
                    throw runtimeException;
                }
            } catch (Throwable th2) {
                th = th2;
                try {
                    objectInputStream.close();
                } catch (IOException e4) {
                    logger.log(Level.WARNING, "error closing input stream (ignored)", (Throwable) e4);
                }
                MethodCollector.o(4912);
                throw th;
            }
        } catch (IOException e5) {
            RuntimeException runtimeException2 = new RuntimeException("cannot load/parse metadata", e5);
            MethodCollector.o(4912);
            throw runtimeException2;
        } catch (Throwable th3) {
            th = th3;
            inputStream.close();
            MethodCollector.o(4912);
            throw th;
        }
    }

    public static List<Phonemetadata.PhoneMetadata> getMetadataFromSingleFileName(String str, MetadataLoader metadataLoader) {
        InputStream loadMetadata = metadataLoader.loadMetadata(str);
        if (loadMetadata != null) {
            List<Phonemetadata.PhoneMetadata> metadataList = loadMetadataAndCloseInput(loadMetadata).getMetadataList();
            if (metadataList.size() != 0) {
                return metadataList;
            }
            throw new IllegalStateException("empty metadata: ".concat(String.valueOf(str)));
        }
        throw new IllegalStateException("missing metadata: ".concat(String.valueOf(str)));
    }

    static SingleFileMetadataMaps getSingleFileMetadataMaps(AtomicReference<SingleFileMetadataMaps> atomicReference, String str, MetadataLoader metadataLoader) {
        SingleFileMetadataMaps singleFileMetadataMaps = atomicReference.get();
        if (singleFileMetadataMaps != null) {
            return singleFileMetadataMaps;
        }
        atomicReference.compareAndSet(null, SingleFileMetadataMaps.load(str, metadataLoader));
        return atomicReference.get();
    }

    static <T> Phonemetadata.PhoneMetadata getMetadataFromMultiFilePrefix(T t, ConcurrentHashMap<T, Phonemetadata.PhoneMetadata> concurrentHashMap, String str, MetadataLoader metadataLoader) {
        Phonemetadata.PhoneMetadata phoneMetadata = concurrentHashMap.get(t);
        if (phoneMetadata != null) {
            return phoneMetadata;
        }
        String str2 = str + "_" + ((Object) t);
        List<Phonemetadata.PhoneMetadata> metadataFromSingleFileName = getMetadataFromSingleFileName(str2, metadataLoader);
        if (metadataFromSingleFileName.size() > 1) {
            logger.log(Level.WARNING, "more than one metadata in file ".concat(String.valueOf(str2)));
        }
        Phonemetadata.PhoneMetadata phoneMetadata2 = metadataFromSingleFileName.get(0);
        Phonemetadata.PhoneMetadata putIfAbsent = concurrentHashMap.putIfAbsent(t, phoneMetadata2);
        if (putIfAbsent != null) {
            return putIfAbsent;
        }
        return phoneMetadata2;
    }
}
