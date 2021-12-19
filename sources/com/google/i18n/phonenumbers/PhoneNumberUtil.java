package com.google.i18n.phonenumbers;

import com.bytedance.covode.number.Covode;
import com.bytedance.frameworks.apm.trace.MethodCollector;
import com.bytedance.vcloud.abrmodule.ABRConfig;
import com.google.i18n.phonenumbers.NumberParseException;
import com.google.i18n.phonenumbers.PhoneNumberMatcher;
import com.google.i18n.phonenumbers.Phonemetadata;
import com.google.i18n.phonenumbers.Phonenumber;
import com.google.i18n.phonenumbers.internal.MatcherApi;
import com.google.i18n.phonenumbers.internal.RegexBasedMatcher;
import com.google.i18n.phonenumbers.internal.RegexCache;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.TreeSet;
import java.util.logging.Level;
import java.util.logging.Logger;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class PhoneNumberUtil {
    private static final Map<Character, Character> ALL_PLUS_NUMBER_GROUPING_SYMBOLS;
    private static final Map<Character, Character> ALPHA_MAPPINGS;
    private static final Map<Character, Character> ALPHA_PHONE_MAPPINGS;
    private static final Pattern CAPTURING_DIGIT_PATTERN = Pattern.compile("(\\p{Nd})");
    private static final Map<Character, Character> DIALLABLE_CHAR_MAPPINGS;
    private static final Pattern EXTN_PATTERN;
    static final String EXTN_PATTERNS_FOR_MATCHING = createExtnPattern("xｘ#＃~～");
    private static final String EXTN_PATTERNS_FOR_PARSING;
    private static final Pattern FIRST_GROUP_ONLY_PREFIX_PATTERN = Pattern.compile("\\(?\\$1\\)?");
    private static final Pattern FIRST_GROUP_PATTERN = Pattern.compile("(\\$\\d)");
    private static final Set<Integer> GEO_MOBILE_COUNTRIES;
    private static final Set<Integer> GEO_MOBILE_COUNTRIES_WITHOUT_MOBILE_AREA_CODES;
    private static final Map<Integer, String> MOBILE_TOKEN_MAPPINGS;
    static final Pattern NON_DIGITS_PATTERN = Pattern.compile("(\\D+)");
    static final Pattern PLUS_CHARS_PATTERN = Pattern.compile("[+＋]+");
    static final Pattern SECOND_NUMBER_START_PATTERN = Pattern.compile("[\\\\/] *x");
    private static final Pattern SEPARATOR_PATTERN = Pattern.compile("[-x‐-―−ー－-／  ­​⁠　()（）［］.\\[\\]/~⁓∼～]+");
    private static final Pattern SINGLE_INTERNATIONAL_PREFIX = Pattern.compile("[\\d]+(?:[~⁓∼～][\\d]+)?");
    static final Pattern UNWANTED_END_CHAR_PATTERN = Pattern.compile("[[\\P{N}&&\\P{L}]&&[^#]]+$");
    private static final String VALID_ALPHA;
    private static final Pattern VALID_ALPHA_PHONE_PATTERN = Pattern.compile("(?:.*?[A-Za-z]){3}.*");
    private static final String VALID_PHONE_NUMBER;
    private static final Pattern VALID_PHONE_NUMBER_PATTERN;
    private static final Pattern VALID_START_CHAR_PATTERN = Pattern.compile("[+＋\\p{Nd}]");
    private static PhoneNumberUtil instance = null;
    private static final Logger logger = Logger.getLogger(PhoneNumberUtil.class.getName());
    private final Map<Integer, List<String>> countryCallingCodeToRegionCodeMap;
    private final Set<Integer> countryCodesForNonGeographicalRegion = new HashSet();
    private final MatcherApi matcherApi = RegexBasedMatcher.create();
    private final MetadataSource metadataSource;
    private final Set<String> nanpaRegions = new HashSet(35);
    private final RegexCache regexCache = new RegexCache(100);
    private final Set<String> supportedRegions = new HashSet(320);

    public Set<Integer> getSupportedGlobalNetworkCallingCodes() {
        return Collections.unmodifiableSet(this.countryCodesForNonGeographicalRegion);
    }

    public Set<String> getSupportedRegions() {
        return Collections.unmodifiableSet(this.supportedRegions);
    }

    public Set<Integer> getSupportedCallingCodes() {
        return Collections.unmodifiableSet(this.countryCallingCodeToRegionCodeMap.keySet());
    }

    public static synchronized PhoneNumberUtil getInstance() {
        PhoneNumberUtil phoneNumberUtil;
        synchronized (PhoneNumberUtil.class) {
            MethodCollector.i(7403);
            if (instance == null) {
                setInstance(createInstance(MetadataManager.DEFAULT_METADATA_LOADER));
            }
            phoneNumberUtil = instance;
            MethodCollector.o(7403);
        }
        return phoneNumberUtil;
    }

    public enum Leniency {
        POSSIBLE {
            /* access modifiers changed from: package-private */
            @Override // com.google.i18n.phonenumbers.PhoneNumberUtil.Leniency
            public final boolean verify(Phonenumber.PhoneNumber phoneNumber, CharSequence charSequence, PhoneNumberUtil phoneNumberUtil) {
                return phoneNumberUtil.isPossibleNumber(phoneNumber);
            }
        },
        VALID {
            /* access modifiers changed from: package-private */
            @Override // com.google.i18n.phonenumbers.PhoneNumberUtil.Leniency
            public final boolean verify(Phonenumber.PhoneNumber phoneNumber, CharSequence charSequence, PhoneNumberUtil phoneNumberUtil) {
                if (!phoneNumberUtil.isValidNumber(phoneNumber) || !PhoneNumberMatcher.containsOnlyValidXChars(phoneNumber, charSequence.toString(), phoneNumberUtil)) {
                    return false;
                }
                return PhoneNumberMatcher.isNationalPrefixPresentIfRequired(phoneNumber, phoneNumberUtil);
            }
        },
        STRICT_GROUPING {
            /* access modifiers changed from: package-private */
            @Override // com.google.i18n.phonenumbers.PhoneNumberUtil.Leniency
            public final boolean verify(Phonenumber.PhoneNumber phoneNumber, CharSequence charSequence, PhoneNumberUtil phoneNumberUtil) {
                String charSequence2 = charSequence.toString();
                if (!phoneNumberUtil.isValidNumber(phoneNumber) || !PhoneNumberMatcher.containsOnlyValidXChars(phoneNumber, charSequence2, phoneNumberUtil) || PhoneNumberMatcher.containsMoreThanOneSlashInNationalNumber(phoneNumber, charSequence2) || !PhoneNumberMatcher.isNationalPrefixPresentIfRequired(phoneNumber, phoneNumberUtil)) {
                    return false;
                }
                return PhoneNumberMatcher.checkNumberGroupingIsValid(phoneNumber, charSequence, phoneNumberUtil, new PhoneNumberMatcher.NumberGroupingChecker() {
                    /* class com.google.i18n.phonenumbers.PhoneNumberUtil.Leniency.AnonymousClass3.AnonymousClass1 */

                    static {
                        Covode.recordClassIndex(34094);
                    }

                    @Override // com.google.i18n.phonenumbers.PhoneNumberMatcher.NumberGroupingChecker
                    public boolean checkGroups(PhoneNumberUtil phoneNumberUtil, Phonenumber.PhoneNumber phoneNumber, StringBuilder sb, String[] strArr) {
                        return PhoneNumberMatcher.allNumberGroupsRemainGrouped(phoneNumberUtil, phoneNumber, sb, strArr);
                    }
                });
            }
        },
        EXACT_GROUPING {
            /* access modifiers changed from: package-private */
            @Override // com.google.i18n.phonenumbers.PhoneNumberUtil.Leniency
            public final boolean verify(Phonenumber.PhoneNumber phoneNumber, CharSequence charSequence, PhoneNumberUtil phoneNumberUtil) {
                String charSequence2 = charSequence.toString();
                if (!phoneNumberUtil.isValidNumber(phoneNumber) || !PhoneNumberMatcher.containsOnlyValidXChars(phoneNumber, charSequence2, phoneNumberUtil) || PhoneNumberMatcher.containsMoreThanOneSlashInNationalNumber(phoneNumber, charSequence2) || !PhoneNumberMatcher.isNationalPrefixPresentIfRequired(phoneNumber, phoneNumberUtil)) {
                    return false;
                }
                return PhoneNumberMatcher.checkNumberGroupingIsValid(phoneNumber, charSequence, phoneNumberUtil, new PhoneNumberMatcher.NumberGroupingChecker() {
                    /* class com.google.i18n.phonenumbers.PhoneNumberUtil.Leniency.AnonymousClass4.AnonymousClass1 */

                    static {
                        Covode.recordClassIndex(34096);
                    }

                    @Override // com.google.i18n.phonenumbers.PhoneNumberMatcher.NumberGroupingChecker
                    public boolean checkGroups(PhoneNumberUtil phoneNumberUtil, Phonenumber.PhoneNumber phoneNumber, StringBuilder sb, String[] strArr) {
                        return PhoneNumberMatcher.allNumberGroupsAreExactlyPresent(phoneNumberUtil, phoneNumber, sb, strArr);
                    }
                });
            }
        };

        /* access modifiers changed from: package-private */
        public abstract boolean verify(Phonenumber.PhoneNumber phoneNumber, CharSequence charSequence, PhoneNumberUtil phoneNumberUtil);

        static {
            Covode.recordClassIndex(34090);
        }
    }

    public enum PhoneNumberFormat {
        E164,
        INTERNATIONAL,
        NATIONAL,
        RFC3966;

        static {
            Covode.recordClassIndex(34098);
        }
    }

    public enum MatchType {
        NOT_A_NUMBER,
        NO_MATCH,
        SHORT_NSN_MATCH,
        NSN_MATCH,
        EXACT_MATCH;

        static {
            Covode.recordClassIndex(34097);
        }
    }

    public enum ValidationResult {
        IS_POSSIBLE,
        IS_POSSIBLE_LOCAL_ONLY,
        INVALID_COUNTRY_CODE,
        TOO_SHORT,
        INVALID_LENGTH,
        TOO_LONG;

        static {
            Covode.recordClassIndex(34100);
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: com.google.i18n.phonenumbers.PhoneNumberUtil$2  reason: invalid class name */
    public static /* synthetic */ class AnonymousClass2 {
        static final /* synthetic */ int[] $SwitchMap$com$google$i18n$phonenumbers$PhoneNumberUtil$PhoneNumberFormat;
        static final /* synthetic */ int[] $SwitchMap$com$google$i18n$phonenumbers$PhoneNumberUtil$PhoneNumberType;
        static final /* synthetic */ int[] $SwitchMap$com$google$i18n$phonenumbers$Phonenumber$PhoneNumber$CountryCodeSource;

        /* JADX WARNING: Can't wrap try/catch for region: R(41:0|(2:1|2)|3|(2:5|6)|7|(2:9|10)|11|13|14|15|16|17|18|19|20|21|22|23|24|25|26|27|28|29|31|32|33|34|35|36|(2:37|38)|39|41|42|43|44|45|46|47|48|50) */
        /* JADX WARNING: Can't wrap try/catch for region: R(42:0|(2:1|2)|3|5|6|7|(2:9|10)|11|13|14|15|16|17|18|19|20|21|22|23|24|25|26|27|28|29|31|32|33|34|35|36|(2:37|38)|39|41|42|43|44|45|46|47|48|50) */
        /* JADX WARNING: Can't wrap try/catch for region: R(44:0|1|2|3|5|6|7|(2:9|10)|11|13|14|15|16|17|18|19|20|21|22|23|24|25|26|27|28|29|31|32|33|34|35|36|37|38|39|41|42|43|44|45|46|47|48|50) */
        /* JADX WARNING: Failed to process nested try/catch */
        /* JADX WARNING: Missing exception handler attribute for start block: B:15:0x0039 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:17:0x0044 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:19:0x004f */
        /* JADX WARNING: Missing exception handler attribute for start block: B:21:0x005a */
        /* JADX WARNING: Missing exception handler attribute for start block: B:23:0x0066 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:25:0x0072 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:27:0x007e */
        /* JADX WARNING: Missing exception handler attribute for start block: B:33:0x009b */
        /* JADX WARNING: Missing exception handler attribute for start block: B:35:0x00a5 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:37:0x00af */
        /* JADX WARNING: Missing exception handler attribute for start block: B:43:0x00ca */
        /* JADX WARNING: Missing exception handler attribute for start block: B:45:0x00d4 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:47:0x00de */
        static {
            /*
            // Method dump skipped, instructions count: 233
            */
            throw new UnsupportedOperationException("Method not decompiled: com.google.i18n.phonenumbers.PhoneNumberUtil.AnonymousClass2.<clinit>():void");
        }
    }

    public enum PhoneNumberType {
        FIXED_LINE,
        MOBILE,
        FIXED_LINE_OR_MOBILE,
        TOLL_FREE,
        PREMIUM_RATE,
        SHARED_COST,
        VOIP,
        PERSONAL_NUMBER,
        PAGER,
        UAN,
        VOICEMAIL,
        UNKNOWN;

        static {
            Covode.recordClassIndex(34099);
        }
    }

    static {
        Covode.recordClassIndex(34087);
        HashMap hashMap = new HashMap();
        hashMap.put(52, "1");
        hashMap.put(54, "9");
        MOBILE_TOKEN_MAPPINGS = Collections.unmodifiableMap(hashMap);
        HashSet hashSet = new HashSet();
        hashSet.add(86);
        GEO_MOBILE_COUNTRIES_WITHOUT_MOBILE_AREA_CODES = Collections.unmodifiableSet(hashSet);
        HashSet hashSet2 = new HashSet();
        hashSet2.add(52);
        hashSet2.add(54);
        hashSet2.add(55);
        hashSet2.add(62);
        hashSet2.addAll(hashSet);
        GEO_MOBILE_COUNTRIES = Collections.unmodifiableSet(hashSet2);
        HashMap hashMap2 = new HashMap();
        hashMap2.put('0', '0');
        hashMap2.put('1', '1');
        hashMap2.put('2', '2');
        hashMap2.put('3', '3');
        hashMap2.put('4', '4');
        hashMap2.put('5', '5');
        hashMap2.put('6', '6');
        hashMap2.put('7', '7');
        hashMap2.put('8', '8');
        hashMap2.put('9', '9');
        HashMap hashMap3 = new HashMap(40);
        hashMap3.put('A', '2');
        hashMap3.put('B', '2');
        hashMap3.put('C', '2');
        hashMap3.put('D', '3');
        hashMap3.put('E', '3');
        hashMap3.put('F', '3');
        hashMap3.put('G', '4');
        hashMap3.put('H', '4');
        hashMap3.put('I', '4');
        hashMap3.put('J', '5');
        hashMap3.put('K', '5');
        hashMap3.put('L', '5');
        hashMap3.put('M', '6');
        hashMap3.put('N', '6');
        hashMap3.put('O', '6');
        hashMap3.put('P', '7');
        hashMap3.put('Q', '7');
        hashMap3.put('R', '7');
        hashMap3.put('S', '7');
        hashMap3.put('T', '8');
        hashMap3.put('U', '8');
        hashMap3.put('V', '8');
        hashMap3.put('W', '9');
        hashMap3.put('X', '9');
        hashMap3.put('Y', '9');
        hashMap3.put('Z', '9');
        Map<Character, Character> unmodifiableMap = Collections.unmodifiableMap(hashMap3);
        ALPHA_MAPPINGS = unmodifiableMap;
        HashMap hashMap4 = new HashMap(100);
        hashMap4.putAll(unmodifiableMap);
        hashMap4.putAll(hashMap2);
        ALPHA_PHONE_MAPPINGS = Collections.unmodifiableMap(hashMap4);
        HashMap hashMap5 = new HashMap();
        hashMap5.putAll(hashMap2);
        hashMap5.put('+', '+');
        hashMap5.put('*', '*');
        hashMap5.put('#', '#');
        DIALLABLE_CHAR_MAPPINGS = Collections.unmodifiableMap(hashMap5);
        HashMap hashMap6 = new HashMap();
        for (Character ch : unmodifiableMap.keySet()) {
            char charValue = ch.charValue();
            hashMap6.put(Character.valueOf(Character.toLowerCase(charValue)), Character.valueOf(charValue));
            hashMap6.put(Character.valueOf(charValue), Character.valueOf(charValue));
        }
        hashMap6.putAll(hashMap2);
        hashMap6.put('-', '-');
        hashMap6.put((char) 65293, '-');
        hashMap6.put((char) 8208, '-');
        hashMap6.put((char) 8209, '-');
        hashMap6.put((char) 8210, '-');
        hashMap6.put((char) 8211, '-');
        hashMap6.put((char) 8212, '-');
        hashMap6.put((char) 8213, '-');
        hashMap6.put((char) 8722, '-');
        hashMap6.put('/', '/');
        hashMap6.put((char) 65295, '/');
        hashMap6.put(' ', ' ');
        hashMap6.put((char) 12288, ' ');
        hashMap6.put((char) 8288, ' ');
        hashMap6.put('.', '.');
        hashMap6.put((char) 65294, '.');
        ALL_PLUS_NUMBER_GROUPING_SYMBOLS = Collections.unmodifiableMap(hashMap6);
        StringBuilder sb = new StringBuilder();
        Map<Character, Character> map = ALPHA_MAPPINGS;
        String sb2 = sb.append(Arrays.toString(map.keySet().toArray()).replaceAll("[, \\[\\]]", "")).append(Arrays.toString(map.keySet().toArray()).toLowerCase().replaceAll("[, \\[\\]]", "")).toString();
        VALID_ALPHA = sb2;
        String str = "\\p{Nd}{2}|[+＋]*+(?:[-x‐-―−ー－-／  ­​⁠　()（）［］.\\[\\]/~⁓∼～*]*\\p{Nd}){3,}[-x‐-―−ー－-／  ­​⁠　()（）［］.\\[\\]/~⁓∼～*" + sb2 + "\\p{Nd}]*";
        VALID_PHONE_NUMBER = str;
        String createExtnPattern = createExtnPattern(",;".concat("xｘ#＃~～"));
        EXTN_PATTERNS_FOR_PARSING = createExtnPattern;
        EXTN_PATTERN = Pattern.compile("(?:" + createExtnPattern + ")$", 66);
        VALID_PHONE_NUMBER_PATTERN = Pattern.compile(str + "(?:" + createExtnPattern + ")?", 66);
    }

    public static String convertAlphaCharactersInNumber(CharSequence charSequence) {
        return normalizeHelper(charSequence, ALPHA_PHONE_MAPPINGS, false);
    }

    public static String normalizeDiallableCharsOnly(CharSequence charSequence) {
        return normalizeHelper(charSequence, DIALLABLE_CHAR_MAPPINGS, true);
    }

    public AsYouTypeFormatter getAsYouTypeFormatter(String str) {
        return new AsYouTypeFormatter(str);
    }

    public Phonenumber.PhoneNumber getExampleNumber(String str) {
        return getExampleNumberForType(str, PhoneNumberType.FIXED_LINE);
    }

    public boolean isNANPACountry(String str) {
        return this.nanpaRegions.contains(str);
    }

    public ValidationResult isPossibleNumberWithReason(Phonenumber.PhoneNumber phoneNumber) {
        return isPossibleNumberForTypeWithReason(phoneNumber, PhoneNumberType.UNKNOWN);
    }

    private boolean hasValidCountryCallingCode(int i2) {
        return this.countryCallingCodeToRegionCodeMap.containsKey(Integer.valueOf(i2));
    }

    private boolean isValidRegionCode(String str) {
        if (str == null || !this.supportedRegions.contains(str)) {
            return false;
        }
        return true;
    }

    public static String normalizeDigitsOnly(CharSequence charSequence) {
        return normalizeDigits(charSequence, false).toString();
    }

    /* access modifiers changed from: package-private */
    public Phonemetadata.PhoneMetadata getMetadataForRegion(String str) {
        if (!isValidRegionCode(str)) {
            return null;
        }
        return this.metadataSource.getMetadataForRegion(str);
    }

    public boolean isNumberGeographical(Phonenumber.PhoneNumber phoneNumber) {
        return isNumberGeographical(getNumberType(phoneNumber), phoneNumber.getCountryCode());
    }

    public boolean isPossibleNumber(Phonenumber.PhoneNumber phoneNumber) {
        ValidationResult isPossibleNumberWithReason = isPossibleNumberWithReason(phoneNumber);
        if (isPossibleNumberWithReason == ValidationResult.IS_POSSIBLE || isPossibleNumberWithReason == ValidationResult.IS_POSSIBLE_LOCAL_ONLY) {
            return true;
        }
        return false;
    }

    public boolean isValidNumber(Phonenumber.PhoneNumber phoneNumber) {
        return isValidNumberForRegion(phoneNumber, getRegionCodeForNumber(phoneNumber));
    }

    private static String createExtnPattern(String str) {
        return ";ext=(\\p{Nd}{1,7})|[  \\t,]*(?:e?xt(?:ensi(?:ó?|ó))?n?|ｅ?ｘｔｎ?|доб|[" + str + "]|int|anexo|ｉｎｔ)[:\\.．]?[  \\t,-]*(\\p{Nd}{1,7})#?|[- ]+(\\p{Nd}{1,5})#";
    }

    public static PhoneNumberUtil createInstance(MetadataLoader metadataLoader) {
        if (metadataLoader != null) {
            return createInstance(new MultiFileMetadataSourceImpl(metadataLoader));
        }
        throw new IllegalArgumentException("metadataLoader could not be null.");
    }

    private static boolean descHasData(Phonemetadata.PhoneNumberDesc phoneNumberDesc) {
        if (phoneNumberDesc.hasExampleNumber() || descHasPossibleNumberData(phoneNumberDesc) || phoneNumberDesc.hasNationalNumberPattern()) {
            return true;
        }
        return false;
    }

    private static boolean descHasPossibleNumberData(Phonemetadata.PhoneNumberDesc phoneNumberDesc) {
        if (phoneNumberDesc.getPossibleLengthCount() == 1 && phoneNumberDesc.getPossibleLength(0) == -1) {
            return false;
        }
        return true;
    }

    static boolean formattingRuleHasFirstGroupOnly(String str) {
        if (str.length() == 0 || FIRST_GROUP_ONLY_PREFIX_PATTERN.matcher(str).matches()) {
            return true;
        }
        return false;
    }

    private int getCountryCodeForValidRegion(String str) {
        Phonemetadata.PhoneMetadata metadataForRegion = getMetadataForRegion(str);
        if (metadataForRegion != null) {
            return metadataForRegion.getCountryCode();
        }
        throw new IllegalArgumentException("Invalid region code: ".concat(String.valueOf(str)));
    }

    public static String getCountryMobileToken(int i2) {
        Map<Integer, String> map = MOBILE_TOKEN_MAPPINGS;
        if (map.containsKey(Integer.valueOf(i2))) {
            return map.get(Integer.valueOf(i2));
        }
        return "";
    }

    static boolean isViablePhoneNumber(CharSequence charSequence) {
        if (charSequence.length() < 2) {
            return false;
        }
        return VALID_PHONE_NUMBER_PATTERN.matcher(charSequence).matches();
    }

    static synchronized void setInstance(PhoneNumberUtil phoneNumberUtil) {
        synchronized (PhoneNumberUtil.class) {
            MethodCollector.i(7360);
            instance = phoneNumberUtil;
            MethodCollector.o(7360);
        }
    }

    public boolean canBeInternationallyDialled(Phonenumber.PhoneNumber phoneNumber) {
        Phonemetadata.PhoneMetadata metadataForRegion = getMetadataForRegion(getRegionCodeForNumber(phoneNumber));
        if (metadataForRegion != null && isNumberMatchingDesc(getNationalSignificantNumber(phoneNumber), metadataForRegion.getNoInternationalDialling())) {
            return false;
        }
        return true;
    }

    /* access modifiers changed from: package-private */
    public Phonemetadata.PhoneMetadata getMetadataForNonGeographicalRegion(int i2) {
        if (!this.countryCallingCodeToRegionCodeMap.containsKey(Integer.valueOf(i2))) {
            return null;
        }
        return this.metadataSource.getMetadataForNonGeographicalRegion(i2);
    }

    public PhoneNumberType getNumberType(Phonenumber.PhoneNumber phoneNumber) {
        Phonemetadata.PhoneMetadata metadataForRegionOrCallingCode = getMetadataForRegionOrCallingCode(phoneNumber.getCountryCode(), getRegionCodeForNumber(phoneNumber));
        if (metadataForRegionOrCallingCode == null) {
            return PhoneNumberType.UNKNOWN;
        }
        return getNumberTypeHelper(getNationalSignificantNumber(phoneNumber), metadataForRegionOrCallingCode);
    }

    public String getRegionCodeForCountryCode(int i2) {
        List<String> list = this.countryCallingCodeToRegionCodeMap.get(Integer.valueOf(i2));
        if (list == null) {
            return "ZZ";
        }
        return list.get(0);
    }

    public List<String> getRegionCodesForCountryCode(int i2) {
        List<String> list = this.countryCallingCodeToRegionCodeMap.get(Integer.valueOf(i2));
        if (list == null) {
            list = new ArrayList<>(0);
        }
        return Collections.unmodifiableList(list);
    }

    public boolean isAlphaNumber(CharSequence charSequence) {
        if (!isViablePhoneNumber(charSequence)) {
            return false;
        }
        StringBuilder sb = new StringBuilder(charSequence);
        maybeStripExtension(sb);
        return VALID_ALPHA_PHONE_PATTERN.matcher(sb).matches();
    }

    public boolean isMobileNumberPortableRegion(String str) {
        Phonemetadata.PhoneMetadata metadataForRegion = getMetadataForRegion(str);
        if (metadataForRegion != null) {
            return metadataForRegion.isMobileNumberPortableRegion();
        }
        logger.log(Level.WARNING, "Invalid or unknown region code provided: ".concat(String.valueOf(str)));
        return false;
    }

    private static Phonenumber.PhoneNumber copyCoreFieldsOnly(Phonenumber.PhoneNumber phoneNumber) {
        Phonenumber.PhoneNumber phoneNumber2 = new Phonenumber.PhoneNumber();
        phoneNumber2.setCountryCode(phoneNumber.getCountryCode());
        phoneNumber2.setNationalNumber(phoneNumber.getNationalNumber());
        if (phoneNumber.getExtension().length() > 0) {
            phoneNumber2.setExtension(phoneNumber.getExtension());
        }
        if (phoneNumber.isItalianLeadingZero()) {
            phoneNumber2.setItalianLeadingZero(true);
            phoneNumber2.setNumberOfLeadingZeros(phoneNumber.getNumberOfLeadingZeros());
        }
        return phoneNumber2;
    }

    private static PhoneNumberUtil createInstance(MetadataSource metadataSource2) {
        if (metadataSource2 != null) {
            return new PhoneNumberUtil(metadataSource2, CountryCodeToRegionCodeMap.getCountryCodeToRegionCodeMap());
        }
        throw new IllegalArgumentException("metadataSource could not be null.");
    }

    private Set<PhoneNumberType> getSupportedTypesForMetadata(Phonemetadata.PhoneMetadata phoneMetadata) {
        TreeSet treeSet = new TreeSet();
        PhoneNumberType[] values = PhoneNumberType.values();
        for (PhoneNumberType phoneNumberType : values) {
            if (!(phoneNumberType == PhoneNumberType.FIXED_LINE_OR_MOBILE || phoneNumberType == PhoneNumberType.UNKNOWN || !descHasData(getNumberDescByType(phoneMetadata, phoneNumberType)))) {
                treeSet.add(phoneNumberType);
            }
        }
        return Collections.unmodifiableSet(treeSet);
    }

    private boolean hasFormattingPatternForNumber(Phonenumber.PhoneNumber phoneNumber) {
        int countryCode = phoneNumber.getCountryCode();
        Phonemetadata.PhoneMetadata metadataForRegionOrCallingCode = getMetadataForRegionOrCallingCode(countryCode, getRegionCodeForCountryCode(countryCode));
        if (metadataForRegionOrCallingCode == null) {
            return false;
        }
        if (chooseFormattingPatternForNumber(metadataForRegionOrCallingCode.numberFormats(), getNationalSignificantNumber(phoneNumber)) != null) {
            return true;
        }
        return false;
    }

    static StringBuilder normalize(StringBuilder sb) {
        if (VALID_ALPHA_PHONE_PATTERN.matcher(sb).matches()) {
            sb.replace(0, sb.length(), normalizeHelper(sb, ALPHA_PHONE_MAPPINGS, true));
        } else {
            sb.replace(0, sb.length(), normalizeDigitsOnly(sb));
        }
        return sb;
    }

    public int getCountryCodeForRegion(String str) {
        if (isValidRegionCode(str)) {
            return getCountryCodeForValidRegion(str);
        }
        Logger logger2 = logger;
        Level level = Level.WARNING;
        StringBuilder sb = new StringBuilder("Invalid or missing region code (");
        if (str == null) {
            str = "null";
        }
        logger2.log(level, sb.append(str).append(") provided.").toString());
        return 0;
    }

    public int getLengthOfGeographicalAreaCode(Phonenumber.PhoneNumber phoneNumber) {
        Phonemetadata.PhoneMetadata metadataForRegion = getMetadataForRegion(getRegionCodeForNumber(phoneNumber));
        if (metadataForRegion == null) {
            return 0;
        }
        if (!metadataForRegion.hasNationalPrefix() && !phoneNumber.isItalianLeadingZero()) {
            return 0;
        }
        PhoneNumberType numberType = getNumberType(phoneNumber);
        int countryCode = phoneNumber.getCountryCode();
        if ((numberType != PhoneNumberType.MOBILE || !GEO_MOBILE_COUNTRIES_WITHOUT_MOBILE_AREA_CODES.contains(Integer.valueOf(countryCode))) && isNumberGeographical(numberType, countryCode)) {
            return getLengthOfNationalDestinationCode(phoneNumber);
        }
        return 0;
    }

    public String getNationalSignificantNumber(Phonenumber.PhoneNumber phoneNumber) {
        StringBuilder sb = new StringBuilder();
        if (phoneNumber.isItalianLeadingZero() && phoneNumber.getNumberOfLeadingZeros() > 0) {
            char[] cArr = new char[phoneNumber.getNumberOfLeadingZeros()];
            Arrays.fill(cArr, '0');
            sb.append(new String(cArr));
        }
        sb.append(phoneNumber.getNationalNumber());
        return sb.toString();
    }

    public Set<PhoneNumberType> getSupportedTypesForNonGeoEntity(int i2) {
        Phonemetadata.PhoneMetadata metadataForNonGeographicalRegion = getMetadataForNonGeographicalRegion(i2);
        if (metadataForNonGeographicalRegion != null) {
            return getSupportedTypesForMetadata(metadataForNonGeographicalRegion);
        }
        logger.log(Level.WARNING, "Unknown country calling code for a non-geographical entity provided: ".concat(String.valueOf(i2)));
        return Collections.unmodifiableSet(new TreeSet());
    }

    public Set<PhoneNumberType> getSupportedTypesForRegion(String str) {
        if (isValidRegionCode(str)) {
            return getSupportedTypesForMetadata(getMetadataForRegion(str));
        }
        logger.log(Level.WARNING, "Invalid or unknown region code provided: ".concat(String.valueOf(str)));
        return Collections.unmodifiableSet(new TreeSet());
    }

    /* access modifiers changed from: package-private */
    public String maybeStripExtension(StringBuilder sb) {
        Matcher matcher = EXTN_PATTERN.matcher(sb);
        if (!matcher.find() || !isViablePhoneNumber(sb.substring(0, matcher.start()))) {
            return "";
        }
        int groupCount = matcher.groupCount();
        for (int i2 = 1; i2 <= groupCount; i2++) {
            if (matcher.group(i2) != null) {
                String group = matcher.group(i2);
                sb.delete(matcher.start(), sb.length());
                return group;
            }
        }
        return "";
    }

    public boolean truncateTooLongNumber(Phonenumber.PhoneNumber phoneNumber) {
        if (isValidNumber(phoneNumber)) {
            return true;
        }
        Phonenumber.PhoneNumber phoneNumber2 = new Phonenumber.PhoneNumber();
        phoneNumber2.mergeFrom(phoneNumber);
        long nationalNumber = phoneNumber.getNationalNumber();
        do {
            nationalNumber /= 10;
            phoneNumber2.setNationalNumber(nationalNumber);
            if (isPossibleNumberWithReason(phoneNumber2) == ValidationResult.TOO_SHORT || nationalNumber == 0) {
                return false;
            }
        } while (!isValidNumber(phoneNumber2));
        phoneNumber.setNationalNumber(nationalNumber);
        return true;
    }

    static CharSequence extractPossibleNumber(CharSequence charSequence) {
        Matcher matcher = VALID_START_CHAR_PATTERN.matcher(charSequence);
        if (!matcher.find()) {
            return "";
        }
        CharSequence subSequence = charSequence.subSequence(matcher.start(), charSequence.length());
        Matcher matcher2 = UNWANTED_END_CHAR_PATTERN.matcher(subSequence);
        if (matcher2.find()) {
            subSequence = subSequence.subSequence(0, matcher2.start());
        }
        Matcher matcher3 = SECOND_NUMBER_START_PATTERN.matcher(subSequence);
        if (matcher3.find()) {
            return subSequence.subSequence(0, matcher3.start());
        }
        return subSequence;
    }

    public Phonenumber.PhoneNumber getExampleNumberForType(PhoneNumberType phoneNumberType) {
        for (String str : getSupportedRegions()) {
            Phonenumber.PhoneNumber exampleNumberForType = getExampleNumberForType(str, phoneNumberType);
            if (exampleNumberForType != null) {
                return exampleNumberForType;
            }
        }
        for (Integer num : getSupportedGlobalNetworkCallingCodes()) {
            int intValue = num.intValue();
            Phonemetadata.PhoneNumberDesc numberDescByType = getNumberDescByType(getMetadataForNonGeographicalRegion(intValue), phoneNumberType);
            try {
                if (numberDescByType.hasExampleNumber()) {
                    return parse("+" + intValue + numberDescByType.getExampleNumber(), "ZZ");
                }
            } catch (NumberParseException e2) {
                logger.log(Level.SEVERE, e2.toString());
            }
        }
        return null;
    }

    public Phonenumber.PhoneNumber getInvalidExampleNumber(String str) {
        if (!isValidRegionCode(str)) {
            logger.log(Level.WARNING, "Invalid or unknown region code provided: ".concat(String.valueOf(str)));
            return null;
        }
        Phonemetadata.PhoneNumberDesc numberDescByType = getNumberDescByType(getMetadataForRegion(str), PhoneNumberType.FIXED_LINE);
        if (!numberDescByType.hasExampleNumber()) {
            return null;
        }
        String exampleNumber = numberDescByType.getExampleNumber();
        for (int length = exampleNumber.length() - 1; length >= 2; length--) {
            try {
                Phonenumber.PhoneNumber parse = parse(exampleNumber.substring(0, length), str);
                if (!isValidNumber(parse)) {
                    return parse;
                }
            } catch (NumberParseException unused) {
            }
        }
        return null;
    }

    public int getLengthOfNationalDestinationCode(Phonenumber.PhoneNumber phoneNumber) {
        Phonenumber.PhoneNumber phoneNumber2;
        if (phoneNumber.hasExtension()) {
            phoneNumber2 = new Phonenumber.PhoneNumber();
            phoneNumber2.mergeFrom(phoneNumber);
            phoneNumber2.clearExtension();
        } else {
            phoneNumber2 = phoneNumber;
        }
        String[] split = NON_DIGITS_PATTERN.split(format(phoneNumber2, PhoneNumberFormat.INTERNATIONAL));
        if (split.length <= 3) {
            return 0;
        }
        if (getNumberType(phoneNumber) != PhoneNumberType.MOBILE || getCountryMobileToken(phoneNumber.getCountryCode()).equals("")) {
            return split[2].length();
        }
        return split[2].length() + split[3].length();
    }

    public String getRegionCodeForNumber(Phonenumber.PhoneNumber phoneNumber) {
        int countryCode = phoneNumber.getCountryCode();
        List<String> list = this.countryCallingCodeToRegionCodeMap.get(Integer.valueOf(countryCode));
        if (list == null) {
            logger.log(Level.INFO, "Missing/invalid country_code (" + countryCode + ")");
            return null;
        } else if (list.size() == 1) {
            return list.get(0);
        } else {
            return getRegionCodeForNumberFromRegionList(phoneNumber, list);
        }
    }

    public Phonenumber.PhoneNumber getExampleNumberForNonGeoEntity(int i2) {
        Phonemetadata.PhoneMetadata metadataForNonGeographicalRegion = getMetadataForNonGeographicalRegion(i2);
        if (metadataForNonGeographicalRegion != null) {
            for (Phonemetadata.PhoneNumberDesc phoneNumberDesc : Arrays.asList(metadataForNonGeographicalRegion.getMobile(), metadataForNonGeographicalRegion.getTollFree(), metadataForNonGeographicalRegion.getSharedCost(), metadataForNonGeographicalRegion.getVoip(), metadataForNonGeographicalRegion.getVoicemail(), metadataForNonGeographicalRegion.getUan(), metadataForNonGeographicalRegion.getPremiumRate())) {
                if (phoneNumberDesc != null) {
                    try {
                        if (phoneNumberDesc.hasExampleNumber()) {
                            return parse("+" + i2 + phoneNumberDesc.getExampleNumber(), "ZZ");
                        }
                    } catch (NumberParseException e2) {
                        logger.log(Level.SEVERE, e2.toString());
                    }
                }
            }
            return null;
        }
        logger.log(Level.WARNING, "Invalid or unknown country calling code provided: ".concat(String.valueOf(i2)));
        return null;
    }

    private ValidationResult testNumberLength(CharSequence charSequence, Phonemetadata.PhoneMetadata phoneMetadata) {
        return testNumberLength(charSequence, phoneMetadata, PhoneNumberType.UNKNOWN);
    }

    public Iterable<PhoneNumberMatch> findNumbers(CharSequence charSequence, String str) {
        return findNumbers(charSequence, str, Leniency.VALID, Long.MAX_VALUE);
    }

    public boolean isPossibleNumberForType(Phonenumber.PhoneNumber phoneNumber, PhoneNumberType phoneNumberType) {
        ValidationResult isPossibleNumberForTypeWithReason = isPossibleNumberForTypeWithReason(phoneNumber, phoneNumberType);
        if (isPossibleNumberForTypeWithReason == ValidationResult.IS_POSSIBLE || isPossibleNumberForTypeWithReason == ValidationResult.IS_POSSIBLE_LOCAL_ONLY) {
            return true;
        }
        return false;
    }

    public Phonenumber.PhoneNumber parse(CharSequence charSequence, String str) {
        Phonenumber.PhoneNumber phoneNumber = new Phonenumber.PhoneNumber();
        parse(charSequence, str, phoneNumber);
        return phoneNumber;
    }

    public Phonenumber.PhoneNumber parseAndKeepRawInput(CharSequence charSequence, String str) {
        Phonenumber.PhoneNumber phoneNumber = new Phonenumber.PhoneNumber();
        parseAndKeepRawInput(charSequence, str, phoneNumber);
        return phoneNumber;
    }

    private boolean checkRegionForParsing(CharSequence charSequence, String str) {
        if (isValidRegionCode(str)) {
            return true;
        }
        if (charSequence == null || charSequence.length() == 0 || !PLUS_CHARS_PATTERN.matcher(charSequence).lookingAt()) {
            return false;
        }
        return true;
    }

    private Phonemetadata.PhoneMetadata getMetadataForRegionOrCallingCode(int i2, String str) {
        if ("001".equals(str)) {
            return getMetadataForNonGeographicalRegion(i2);
        }
        return getMetadataForRegion(str);
    }

    private boolean isNationalNumberSuffixOfTheOther(Phonenumber.PhoneNumber phoneNumber, Phonenumber.PhoneNumber phoneNumber2) {
        String valueOf = String.valueOf(phoneNumber.getNationalNumber());
        String valueOf2 = String.valueOf(phoneNumber2.getNationalNumber());
        if (valueOf.endsWith(valueOf2) || valueOf2.endsWith(valueOf)) {
            return true;
        }
        return false;
    }

    public String formatNationalNumberWithPreferredCarrierCode(Phonenumber.PhoneNumber phoneNumber, CharSequence charSequence) {
        if (phoneNumber.getPreferredDomesticCarrierCode().length() > 0) {
            charSequence = phoneNumber.getPreferredDomesticCarrierCode();
        }
        return formatNationalNumberWithCarrierCode(phoneNumber, charSequence);
    }

    public boolean isNumberGeographical(PhoneNumberType phoneNumberType, int i2) {
        if (phoneNumberType == PhoneNumberType.FIXED_LINE || phoneNumberType == PhoneNumberType.FIXED_LINE_OR_MOBILE) {
            return true;
        }
        if (!GEO_MOBILE_COUNTRIES.contains(Integer.valueOf(i2)) || phoneNumberType != PhoneNumberType.MOBILE) {
            return false;
        }
        return true;
    }

    public boolean isPossibleNumber(CharSequence charSequence, String str) {
        try {
            return isPossibleNumber(parse(charSequence, str));
        } catch (NumberParseException unused) {
            return false;
        }
    }

    public ValidationResult isPossibleNumberForTypeWithReason(Phonenumber.PhoneNumber phoneNumber, PhoneNumberType phoneNumberType) {
        String nationalSignificantNumber = getNationalSignificantNumber(phoneNumber);
        int countryCode = phoneNumber.getCountryCode();
        if (!hasValidCountryCallingCode(countryCode)) {
            return ValidationResult.INVALID_COUNTRY_CODE;
        }
        return testNumberLength(nationalSignificantNumber, getMetadataForRegionOrCallingCode(countryCode, getRegionCodeForCountryCode(countryCode)), phoneNumberType);
    }

    private String getRegionCodeForNumberFromRegionList(Phonenumber.PhoneNumber phoneNumber, List<String> list) {
        String nationalSignificantNumber = getNationalSignificantNumber(phoneNumber);
        for (String str : list) {
            Phonemetadata.PhoneMetadata metadataForRegion = getMetadataForRegion(str);
            if (metadataForRegion.hasLeadingDigits()) {
                if (this.regexCache.getPatternForRegex(metadataForRegion.getLeadingDigits()).matcher(nationalSignificantNumber).lookingAt()) {
                    return str;
                }
            } else if (getNumberTypeHelper(nationalSignificantNumber, metadataForRegion) != PhoneNumberType.UNKNOWN) {
                return str;
            }
        }
        return null;
    }

    static StringBuilder normalizeDigits(CharSequence charSequence, boolean z) {
        StringBuilder sb = new StringBuilder(charSequence.length());
        for (int i2 = 0; i2 < charSequence.length(); i2++) {
            char charAt = charSequence.charAt(i2);
            int digit = Character.digit(charAt, 10);
            if (digit != -1) {
                sb.append(digit);
            } else if (z) {
                sb.append(charAt);
            }
        }
        return sb;
    }

    private boolean parsePrefixAsIdd(Pattern pattern, StringBuilder sb) {
        Matcher matcher = pattern.matcher(sb);
        if (!matcher.lookingAt()) {
            return false;
        }
        int end = matcher.end();
        Matcher matcher2 = CAPTURING_DIGIT_PATTERN.matcher(sb.substring(end));
        if (matcher2.find() && normalizeDigitsOnly(matcher2.group(1)).equals("0")) {
            return false;
        }
        sb.delete(0, end);
        return true;
    }

    static void setItalianLeadingZerosForPhoneNumber(CharSequence charSequence, Phonenumber.PhoneNumber phoneNumber) {
        if (charSequence.length() > 1 && charSequence.charAt(0) == '0') {
            phoneNumber.setItalianLeadingZero(true);
            int i2 = 1;
            while (i2 < charSequence.length() - 1 && charSequence.charAt(i2) == '0') {
                i2++;
            }
            if (i2 != 1) {
                phoneNumber.setNumberOfLeadingZeros(i2);
            }
        }
    }

    /* access modifiers changed from: package-private */
    public int extractCountryCode(StringBuilder sb, StringBuilder sb2) {
        if (sb.length() != 0 && sb.charAt(0) != '0') {
            int length = sb.length();
            int i2 = 1;
            while (i2 <= length) {
                int parseInt = Integer.parseInt(sb.substring(0, i2));
                if (!this.countryCallingCodeToRegionCodeMap.containsKey(Integer.valueOf(parseInt))) {
                    i2++;
                    if (i2 > 3) {
                        break;
                    }
                } else {
                    sb2.append(sb.substring(i2));
                    return parseInt;
                }
            }
        }
        return 0;
    }

    public String format(Phonenumber.PhoneNumber phoneNumber, PhoneNumberFormat phoneNumberFormat) {
        if (phoneNumber.getNationalNumber() == 0 && phoneNumber.hasRawInput()) {
            String rawInput = phoneNumber.getRawInput();
            if (rawInput.length() > 0) {
                return rawInput;
            }
        }
        StringBuilder sb = new StringBuilder(20);
        format(phoneNumber, phoneNumberFormat, sb);
        return sb.toString();
    }

    public String formatNationalNumberWithCarrierCode(Phonenumber.PhoneNumber phoneNumber, CharSequence charSequence) {
        int countryCode = phoneNumber.getCountryCode();
        String nationalSignificantNumber = getNationalSignificantNumber(phoneNumber);
        if (!hasValidCountryCallingCode(countryCode)) {
            return nationalSignificantNumber;
        }
        Phonemetadata.PhoneMetadata metadataForRegionOrCallingCode = getMetadataForRegionOrCallingCode(countryCode, getRegionCodeForCountryCode(countryCode));
        StringBuilder sb = new StringBuilder(20);
        sb.append(formatNsn(nationalSignificantNumber, metadataForRegionOrCallingCode, PhoneNumberFormat.NATIONAL, charSequence));
        maybeAppendFormattedExtension(phoneNumber, metadataForRegionOrCallingCode, PhoneNumberFormat.NATIONAL, sb);
        prefixNumberWithCountryCallingCode(countryCode, PhoneNumberFormat.NATIONAL, sb);
        return sb.toString();
    }

    public Phonenumber.PhoneNumber getExampleNumberForType(String str, PhoneNumberType phoneNumberType) {
        if (!isValidRegionCode(str)) {
            logger.log(Level.WARNING, "Invalid or unknown region code provided: ".concat(String.valueOf(str)));
            return null;
        }
        Phonemetadata.PhoneNumberDesc numberDescByType = getNumberDescByType(getMetadataForRegion(str), phoneNumberType);
        try {
            if (numberDescByType.hasExampleNumber()) {
                return parse(numberDescByType.getExampleNumber(), str);
            }
        } catch (NumberParseException e2) {
            logger.log(Level.SEVERE, e2.toString());
        }
        return null;
    }

    public String getNddPrefixForRegion(String str, boolean z) {
        Phonemetadata.PhoneMetadata metadataForRegion = getMetadataForRegion(str);
        if (metadataForRegion == null) {
            Logger logger2 = logger;
            Level level = Level.WARNING;
            StringBuilder sb = new StringBuilder("Invalid or missing region code (");
            if (str == null) {
                str = "null";
            }
            logger2.log(level, sb.append(str).append(") provided.").toString());
            return null;
        }
        String nationalPrefix = metadataForRegion.getNationalPrefix();
        if (nationalPrefix.length() == 0) {
            return null;
        }
        if (z) {
            return nationalPrefix.replace("~", "");
        }
        return nationalPrefix;
    }

    /* access modifiers changed from: package-private */
    public boolean isNumberMatchingDesc(String str, Phonemetadata.PhoneNumberDesc phoneNumberDesc) {
        int length = str.length();
        List<Integer> possibleLengthList = phoneNumberDesc.getPossibleLengthList();
        if (possibleLengthList.size() <= 0 || possibleLengthList.contains(Integer.valueOf(length))) {
            return this.matcherApi.matchNationalNumber(str, phoneNumberDesc, false);
        }
        return false;
    }

    public boolean isValidNumberForRegion(Phonenumber.PhoneNumber phoneNumber, String str) {
        int countryCode = phoneNumber.getCountryCode();
        Phonemetadata.PhoneMetadata metadataForRegionOrCallingCode = getMetadataForRegionOrCallingCode(countryCode, str);
        if (metadataForRegionOrCallingCode == null || ((!"001".equals(str) && countryCode != getCountryCodeForValidRegion(str)) || getNumberTypeHelper(getNationalSignificantNumber(phoneNumber), metadataForRegionOrCallingCode) == PhoneNumberType.UNKNOWN)) {
            return false;
        }
        return true;
    }

    /* access modifiers changed from: package-private */
    public Phonenumber.PhoneNumber.CountryCodeSource maybeStripInternationalPrefixAndNormalize(StringBuilder sb, String str) {
        if (sb.length() == 0) {
            return Phonenumber.PhoneNumber.CountryCodeSource.FROM_DEFAULT_COUNTRY;
        }
        Matcher matcher = PLUS_CHARS_PATTERN.matcher(sb);
        if (matcher.lookingAt()) {
            sb.delete(0, matcher.end());
            normalize(sb);
            return Phonenumber.PhoneNumber.CountryCodeSource.FROM_NUMBER_WITH_PLUS_SIGN;
        }
        Pattern patternForRegex = this.regexCache.getPatternForRegex(str);
        normalize(sb);
        if (parsePrefixAsIdd(patternForRegex, sb)) {
            return Phonenumber.PhoneNumber.CountryCodeSource.FROM_NUMBER_WITH_IDD;
        }
        return Phonenumber.PhoneNumber.CountryCodeSource.FROM_DEFAULT_COUNTRY;
    }

    private void buildNationalNumberForParsing(String str, StringBuilder sb) {
        int i2;
        int indexOf = str.indexOf(";phone-context=");
        if (indexOf >= 0) {
            int i3 = indexOf + 15;
            if (i3 < str.length() - 1 && str.charAt(i3) == '+') {
                int indexOf2 = str.indexOf(59, i3);
                if (indexOf2 > 0) {
                    sb.append(str.substring(i3, indexOf2));
                } else {
                    sb.append(str.substring(i3));
                }
            }
            int indexOf3 = str.indexOf("tel:");
            if (indexOf3 >= 0) {
                i2 = indexOf3 + 4;
            } else {
                i2 = 0;
            }
            sb.append(str.substring(i2, indexOf));
        } else {
            sb.append(extractPossibleNumber(str));
        }
        int indexOf4 = sb.indexOf(";isub=");
        if (indexOf4 > 0) {
            sb.delete(indexOf4, sb.length());
        }
    }

    /* access modifiers changed from: package-private */
    public Phonemetadata.NumberFormat chooseFormattingPatternForNumber(List<Phonemetadata.NumberFormat> list, String str) {
        for (Phonemetadata.NumberFormat numberFormat : list) {
            int leadingDigitsPatternSize = numberFormat.leadingDigitsPatternSize();
            if ((leadingDigitsPatternSize == 0 || this.regexCache.getPatternForRegex(numberFormat.getLeadingDigitsPattern(leadingDigitsPatternSize - 1)).matcher(str).lookingAt()) && this.regexCache.getPatternForRegex(numberFormat.getPattern()).matcher(str).matches()) {
                return numberFormat;
            }
        }
        return null;
    }

    /* access modifiers changed from: package-private */
    public Phonemetadata.PhoneNumberDesc getNumberDescByType(Phonemetadata.PhoneMetadata phoneMetadata, PhoneNumberType phoneNumberType) {
        switch (AnonymousClass2.$SwitchMap$com$google$i18n$phonenumbers$PhoneNumberUtil$PhoneNumberType[phoneNumberType.ordinal()]) {
            case 1:
                return phoneMetadata.getPremiumRate();
            case 2:
                return phoneMetadata.getTollFree();
            case 3:
                return phoneMetadata.getMobile();
            case 4:
            case ABRConfig.ABR_STARTUP_MODEL_KEY:
                return phoneMetadata.getFixedLine();
            case ABRConfig.ABR_PLAYER_DISPLAY_WIDTH_KEY:
                return phoneMetadata.getSharedCost();
            case ABRConfig.ABR_PLAYER_DISPLAY_HEIGHT_KEY:
                return phoneMetadata.getVoip();
            case ABRConfig.ABR_STARTUP_BANDWIDTH_PARAMETER_KEY:
                return phoneMetadata.getPersonalNumber();
            case ABRConfig.ABR_STALL_PENALTY_PARAMETER_KEY:
                return phoneMetadata.getPager();
            case ABRConfig.ABR_SWITCH_PENALTY_PARAMETER_KEY:
                return phoneMetadata.getUan();
            case ABRConfig.ABR_BANDWIDTH_PARAMETER_KEY:
                return phoneMetadata.getVoicemail();
            default:
                return phoneMetadata.getGeneralDesc();
        }
    }

    public MatchType isNumberMatch(Phonenumber.PhoneNumber phoneNumber, Phonenumber.PhoneNumber phoneNumber2) {
        Phonenumber.PhoneNumber copyCoreFieldsOnly = copyCoreFieldsOnly(phoneNumber);
        Phonenumber.PhoneNumber copyCoreFieldsOnly2 = copyCoreFieldsOnly(phoneNumber2);
        if (copyCoreFieldsOnly.hasExtension() && copyCoreFieldsOnly2.hasExtension() && !copyCoreFieldsOnly.getExtension().equals(copyCoreFieldsOnly2.getExtension())) {
            return MatchType.NO_MATCH;
        }
        int countryCode = copyCoreFieldsOnly.getCountryCode();
        int countryCode2 = copyCoreFieldsOnly2.getCountryCode();
        if (countryCode == 0 || countryCode2 == 0) {
            copyCoreFieldsOnly.setCountryCode(countryCode2);
            if (copyCoreFieldsOnly.exactlySameAs(copyCoreFieldsOnly2)) {
                return MatchType.NSN_MATCH;
            }
            if (isNationalNumberSuffixOfTheOther(copyCoreFieldsOnly, copyCoreFieldsOnly2)) {
                return MatchType.SHORT_NSN_MATCH;
            }
            return MatchType.NO_MATCH;
        } else if (copyCoreFieldsOnly.exactlySameAs(copyCoreFieldsOnly2)) {
            return MatchType.EXACT_MATCH;
        } else {
            if (countryCode != countryCode2 || !isNationalNumberSuffixOfTheOther(copyCoreFieldsOnly, copyCoreFieldsOnly2)) {
                return MatchType.NO_MATCH;
            }
            return MatchType.SHORT_NSN_MATCH;
        }
    }

    PhoneNumberUtil(MetadataSource metadataSource2, Map<Integer, List<String>> map) {
        this.metadataSource = metadataSource2;
        this.countryCallingCodeToRegionCodeMap = map;
        for (Map.Entry<Integer, List<String>> entry : map.entrySet()) {
            List<String> value = entry.getValue();
            if (value.size() != 1 || !"001".equals(value.get(0))) {
                this.supportedRegions.addAll(value);
            } else {
                this.countryCodesForNonGeographicalRegion.add(entry.getKey());
            }
        }
        if (this.supportedRegions.remove("001")) {
            logger.log(Level.WARNING, "invalid metadata (country calling code was mapped to the non-geo entity as well as specific region(s))");
        }
        this.nanpaRegions.addAll(map.get(1));
    }

    private PhoneNumberType getNumberTypeHelper(String str, Phonemetadata.PhoneMetadata phoneMetadata) {
        if (!isNumberMatchingDesc(str, phoneMetadata.getGeneralDesc())) {
            return PhoneNumberType.UNKNOWN;
        }
        if (isNumberMatchingDesc(str, phoneMetadata.getPremiumRate())) {
            return PhoneNumberType.PREMIUM_RATE;
        }
        if (isNumberMatchingDesc(str, phoneMetadata.getTollFree())) {
            return PhoneNumberType.TOLL_FREE;
        }
        if (isNumberMatchingDesc(str, phoneMetadata.getSharedCost())) {
            return PhoneNumberType.SHARED_COST;
        }
        if (isNumberMatchingDesc(str, phoneMetadata.getVoip())) {
            return PhoneNumberType.VOIP;
        }
        if (isNumberMatchingDesc(str, phoneMetadata.getPersonalNumber())) {
            return PhoneNumberType.PERSONAL_NUMBER;
        }
        if (isNumberMatchingDesc(str, phoneMetadata.getPager())) {
            return PhoneNumberType.PAGER;
        }
        if (isNumberMatchingDesc(str, phoneMetadata.getUan())) {
            return PhoneNumberType.UAN;
        }
        if (isNumberMatchingDesc(str, phoneMetadata.getVoicemail())) {
            return PhoneNumberType.VOICEMAIL;
        }
        if (isNumberMatchingDesc(str, phoneMetadata.getFixedLine())) {
            if (phoneMetadata.getSameMobileAndFixedLinePattern()) {
                return PhoneNumberType.FIXED_LINE_OR_MOBILE;
            }
            if (isNumberMatchingDesc(str, phoneMetadata.getMobile())) {
                return PhoneNumberType.FIXED_LINE_OR_MOBILE;
            }
            return PhoneNumberType.FIXED_LINE;
        } else if (phoneMetadata.getSameMobileAndFixedLinePattern() || !isNumberMatchingDesc(str, phoneMetadata.getMobile())) {
            return PhoneNumberType.UNKNOWN;
        } else {
            return PhoneNumberType.MOBILE;
        }
    }

    public String formatInOriginalFormat(Phonenumber.PhoneNumber phoneNumber, String str) {
        String format;
        String nationalPrefixFormattingRule;
        int indexOf;
        if (phoneNumber.hasRawInput() && !hasFormattingPatternForNumber(phoneNumber)) {
            return phoneNumber.getRawInput();
        }
        if (!phoneNumber.hasCountryCodeSource()) {
            return format(phoneNumber, PhoneNumberFormat.NATIONAL);
        }
        int i2 = AnonymousClass2.$SwitchMap$com$google$i18n$phonenumbers$Phonenumber$PhoneNumber$CountryCodeSource[phoneNumber.getCountryCodeSource().ordinal()];
        if (i2 == 1) {
            format = format(phoneNumber, PhoneNumberFormat.INTERNATIONAL);
        } else if (i2 == 2) {
            format = formatOutOfCountryCallingNumber(phoneNumber, str);
        } else if (i2 != 3) {
            String regionCodeForCountryCode = getRegionCodeForCountryCode(phoneNumber.getCountryCode());
            String nddPrefixForRegion = getNddPrefixForRegion(regionCodeForCountryCode, true);
            format = format(phoneNumber, PhoneNumberFormat.NATIONAL);
            if (!(nddPrefixForRegion == null || nddPrefixForRegion.length() == 0 || rawInputContainsNationalPrefix(phoneNumber.getRawInput(), nddPrefixForRegion, regionCodeForCountryCode))) {
                Phonemetadata.NumberFormat chooseFormattingPatternForNumber = chooseFormattingPatternForNumber(getMetadataForRegion(regionCodeForCountryCode).numberFormats(), getNationalSignificantNumber(phoneNumber));
                if (!(chooseFormattingPatternForNumber == null || (indexOf = (nationalPrefixFormattingRule = chooseFormattingPatternForNumber.getNationalPrefixFormattingRule()).indexOf("$1")) <= 0 || normalizeDigitsOnly(nationalPrefixFormattingRule.substring(0, indexOf)).length() == 0)) {
                    Phonemetadata.NumberFormat.Builder newBuilder = Phonemetadata.NumberFormat.newBuilder();
                    newBuilder.mergeFrom(chooseFormattingPatternForNumber);
                    newBuilder.clearNationalPrefixFormattingRule();
                    List<Phonemetadata.NumberFormat> arrayList = new ArrayList<>(1);
                    arrayList.add(newBuilder);
                    format = formatByPattern(phoneNumber, PhoneNumberFormat.NATIONAL, arrayList);
                }
            }
        } else {
            format = format(phoneNumber, PhoneNumberFormat.INTERNATIONAL).substring(1);
        }
        String rawInput = phoneNumber.getRawInput();
        return (format == null || rawInput.length() <= 0 || normalizeDiallableCharsOnly(format).equals(normalizeDiallableCharsOnly(rawInput))) ? format : rawInput;
    }

    public String formatOutOfCountryCallingNumber(Phonenumber.PhoneNumber phoneNumber, String str) {
        if (!isValidRegionCode(str)) {
            logger.log(Level.WARNING, "Trying to format number from invalid region " + str + ". International formatting applied.");
            return format(phoneNumber, PhoneNumberFormat.INTERNATIONAL);
        }
        int countryCode = phoneNumber.getCountryCode();
        String nationalSignificantNumber = getNationalSignificantNumber(phoneNumber);
        if (!hasValidCountryCallingCode(countryCode)) {
            return nationalSignificantNumber;
        }
        if (countryCode == 1) {
            if (isNANPACountry(str)) {
                return countryCode + " " + format(phoneNumber, PhoneNumberFormat.NATIONAL);
            }
        } else if (countryCode == getCountryCodeForValidRegion(str)) {
            return format(phoneNumber, PhoneNumberFormat.NATIONAL);
        }
        Phonemetadata.PhoneMetadata metadataForRegion = getMetadataForRegion(str);
        String internationalPrefix = metadataForRegion.getInternationalPrefix();
        if (!SINGLE_INTERNATIONAL_PREFIX.matcher(internationalPrefix).matches()) {
            if (metadataForRegion.hasPreferredInternationalPrefix()) {
                internationalPrefix = metadataForRegion.getPreferredInternationalPrefix();
            } else {
                internationalPrefix = "";
            }
        }
        Phonemetadata.PhoneMetadata metadataForRegionOrCallingCode = getMetadataForRegionOrCallingCode(countryCode, getRegionCodeForCountryCode(countryCode));
        StringBuilder sb = new StringBuilder(formatNsn(nationalSignificantNumber, metadataForRegionOrCallingCode, PhoneNumberFormat.INTERNATIONAL));
        maybeAppendFormattedExtension(phoneNumber, metadataForRegionOrCallingCode, PhoneNumberFormat.INTERNATIONAL, sb);
        if (internationalPrefix.length() > 0) {
            sb.insert(0, " ").insert(0, countryCode).insert(0, " ").insert(0, internationalPrefix);
        } else {
            prefixNumberWithCountryCallingCode(countryCode, PhoneNumberFormat.INTERNATIONAL, sb);
        }
        return sb.toString();
    }

    /* JADX WARNING: Code restructure failed: missing block: B:27:0x008e, code lost:
        if (r1 != null) goto L_0x0090;
     */
    /* JADX WARNING: Removed duplicated region for block: B:32:0x00b8  */
    /* JADX WARNING: Removed duplicated region for block: B:35:0x00cc  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public java.lang.String formatOutOfCountryKeepingAlphaChars(com.google.i18n.phonenumbers.Phonenumber.PhoneNumber r9, java.lang.String r10) {
        /*
        // Method dump skipped, instructions count: 249
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.i18n.phonenumbers.PhoneNumberUtil.formatOutOfCountryKeepingAlphaChars(com.google.i18n.phonenumbers.Phonenumber$PhoneNumber, java.lang.String):java.lang.String");
    }

    public MatchType isNumberMatch(Phonenumber.PhoneNumber phoneNumber, CharSequence charSequence) {
        try {
            return isNumberMatch(phoneNumber, parse(charSequence, "ZZ"));
        } catch (NumberParseException e2) {
            if (e2.getErrorType() == NumberParseException.ErrorType.INVALID_COUNTRY_CODE) {
                String regionCodeForCountryCode = getRegionCodeForCountryCode(phoneNumber.getCountryCode());
                try {
                    if (!regionCodeForCountryCode.equals("ZZ")) {
                        MatchType isNumberMatch = isNumberMatch(phoneNumber, parse(charSequence, regionCodeForCountryCode));
                        if (isNumberMatch == MatchType.EXACT_MATCH) {
                            return MatchType.NSN_MATCH;
                        }
                        return isNumberMatch;
                    }
                    Phonenumber.PhoneNumber phoneNumber2 = new Phonenumber.PhoneNumber();
                    parseHelper(charSequence, null, false, false, phoneNumber2);
                    return isNumberMatch(phoneNumber, phoneNumber2);
                } catch (NumberParseException unused) {
                    return MatchType.NOT_A_NUMBER;
                }
            }
            return MatchType.NOT_A_NUMBER;
        }
    }

    public MatchType isNumberMatch(CharSequence charSequence, CharSequence charSequence2) {
        try {
            return isNumberMatch(parse(charSequence, "ZZ"), charSequence2);
        } catch (NumberParseException e2) {
            if (e2.getErrorType() == NumberParseException.ErrorType.INVALID_COUNTRY_CODE) {
                try {
                    return isNumberMatch(parse(charSequence2, "ZZ"), charSequence);
                } catch (NumberParseException e3) {
                    if (e3.getErrorType() == NumberParseException.ErrorType.INVALID_COUNTRY_CODE) {
                        try {
                            Phonenumber.PhoneNumber phoneNumber = new Phonenumber.PhoneNumber();
                            Phonenumber.PhoneNumber phoneNumber2 = new Phonenumber.PhoneNumber();
                            parseHelper(charSequence, null, false, false, phoneNumber);
                            parseHelper(charSequence2, null, false, false, phoneNumber2);
                            return isNumberMatch(phoneNumber, phoneNumber2);
                        } catch (NumberParseException unused) {
                            return MatchType.NOT_A_NUMBER;
                        }
                    }
                    return MatchType.NOT_A_NUMBER;
                }
            }
            return MatchType.NOT_A_NUMBER;
        }
    }

    private String formatNsn(String str, Phonemetadata.PhoneMetadata phoneMetadata, PhoneNumberFormat phoneNumberFormat) {
        return formatNsn(str, phoneMetadata, phoneNumberFormat, null);
    }

    /* access modifiers changed from: package-private */
    public String formatNsnUsingPattern(String str, Phonemetadata.NumberFormat numberFormat, PhoneNumberFormat phoneNumberFormat) {
        return formatNsnUsingPattern(str, numberFormat, phoneNumberFormat, null);
    }

    private boolean rawInputContainsNationalPrefix(String str, String str2, String str3) {
        String normalizeDigitsOnly = normalizeDigitsOnly(str);
        if (normalizeDigitsOnly.startsWith(str2)) {
            try {
                return isValidNumber(parse(normalizeDigitsOnly.substring(str2.length()), str3));
            } catch (NumberParseException unused) {
            }
        }
        return false;
    }

    public void parse(CharSequence charSequence, String str, Phonenumber.PhoneNumber phoneNumber) {
        parseHelper(charSequence, str, false, true, phoneNumber);
    }

    public void parseAndKeepRawInput(CharSequence charSequence, String str, Phonenumber.PhoneNumber phoneNumber) {
        parseHelper(charSequence, str, true, true, phoneNumber);
    }

    private static String normalizeHelper(CharSequence charSequence, Map<Character, Character> map, boolean z) {
        StringBuilder sb = new StringBuilder(charSequence.length());
        for (int i2 = 0; i2 < charSequence.length(); i2++) {
            char charAt = charSequence.charAt(i2);
            Character ch = map.get(Character.valueOf(Character.toUpperCase(charAt)));
            if (ch != null) {
                sb.append(ch);
            } else if (!z) {
                sb.append(charAt);
            }
        }
        return sb.toString();
    }

    private void prefixNumberWithCountryCallingCode(int i2, PhoneNumberFormat phoneNumberFormat, StringBuilder sb) {
        int i3 = AnonymousClass2.$SwitchMap$com$google$i18n$phonenumbers$PhoneNumberUtil$PhoneNumberFormat[phoneNumberFormat.ordinal()];
        if (i3 == 1) {
            sb.insert(0, i2).insert(0, '+');
        } else if (i3 == 2) {
            sb.insert(0, " ").insert(0, i2).insert(0, '+');
        } else if (i3 == 3) {
            sb.insert(0, "-").insert(0, i2).insert(0, '+').insert(0, "tel:");
        }
    }

    public void format(Phonenumber.PhoneNumber phoneNumber, PhoneNumberFormat phoneNumberFormat, StringBuilder sb) {
        sb.setLength(0);
        int countryCode = phoneNumber.getCountryCode();
        String nationalSignificantNumber = getNationalSignificantNumber(phoneNumber);
        if (phoneNumberFormat == PhoneNumberFormat.E164) {
            sb.append(nationalSignificantNumber);
            prefixNumberWithCountryCallingCode(countryCode, PhoneNumberFormat.E164, sb);
        } else if (!hasValidCountryCallingCode(countryCode)) {
            sb.append(nationalSignificantNumber);
        } else {
            Phonemetadata.PhoneMetadata metadataForRegionOrCallingCode = getMetadataForRegionOrCallingCode(countryCode, getRegionCodeForCountryCode(countryCode));
            sb.append(formatNsn(nationalSignificantNumber, metadataForRegionOrCallingCode, phoneNumberFormat));
            maybeAppendFormattedExtension(phoneNumber, metadataForRegionOrCallingCode, phoneNumberFormat, sb);
            prefixNumberWithCountryCallingCode(countryCode, phoneNumberFormat, sb);
        }
    }

    public String formatByPattern(Phonenumber.PhoneNumber phoneNumber, PhoneNumberFormat phoneNumberFormat, List<Phonemetadata.NumberFormat> list) {
        int countryCode = phoneNumber.getCountryCode();
        String nationalSignificantNumber = getNationalSignificantNumber(phoneNumber);
        if (!hasValidCountryCallingCode(countryCode)) {
            return nationalSignificantNumber;
        }
        Phonemetadata.PhoneMetadata metadataForRegionOrCallingCode = getMetadataForRegionOrCallingCode(countryCode, getRegionCodeForCountryCode(countryCode));
        StringBuilder sb = new StringBuilder(20);
        Phonemetadata.NumberFormat chooseFormattingPatternForNumber = chooseFormattingPatternForNumber(list, nationalSignificantNumber);
        if (chooseFormattingPatternForNumber == null) {
            sb.append(nationalSignificantNumber);
        } else {
            Phonemetadata.NumberFormat.Builder newBuilder = Phonemetadata.NumberFormat.newBuilder();
            newBuilder.mergeFrom(chooseFormattingPatternForNumber);
            String nationalPrefixFormattingRule = chooseFormattingPatternForNumber.getNationalPrefixFormattingRule();
            if (nationalPrefixFormattingRule.length() > 0) {
                String nationalPrefix = metadataForRegionOrCallingCode.getNationalPrefix();
                if (nationalPrefix.length() > 0) {
                    newBuilder.setNationalPrefixFormattingRule(nationalPrefixFormattingRule.replace("$NP", nationalPrefix).replace("$FG", "$1"));
                } else {
                    newBuilder.clearNationalPrefixFormattingRule();
                }
            }
            sb.append(formatNsnUsingPattern(nationalSignificantNumber, newBuilder, phoneNumberFormat));
        }
        maybeAppendFormattedExtension(phoneNumber, metadataForRegionOrCallingCode, phoneNumberFormat, sb);
        prefixNumberWithCountryCallingCode(countryCode, phoneNumberFormat, sb);
        return sb.toString();
    }

    private ValidationResult testNumberLength(CharSequence charSequence, Phonemetadata.PhoneMetadata phoneMetadata, PhoneNumberType phoneNumberType) {
        ArrayList possibleLengthList;
        List<Integer> possibleLengthLocalOnlyList;
        List<Integer> possibleLengthList2;
        while (true) {
            Phonemetadata.PhoneNumberDesc numberDescByType = getNumberDescByType(phoneMetadata, phoneNumberType);
            if (numberDescByType.getPossibleLengthList().isEmpty()) {
                possibleLengthList = phoneMetadata.getGeneralDesc().getPossibleLengthList();
            } else {
                possibleLengthList = numberDescByType.getPossibleLengthList();
            }
            possibleLengthLocalOnlyList = numberDescByType.getPossibleLengthLocalOnlyList();
            if (phoneNumberType != PhoneNumberType.FIXED_LINE_OR_MOBILE) {
                break;
            } else if (!descHasPossibleNumberData(getNumberDescByType(phoneMetadata, PhoneNumberType.FIXED_LINE))) {
                phoneNumberType = PhoneNumberType.MOBILE;
            } else {
                Phonemetadata.PhoneNumberDesc numberDescByType2 = getNumberDescByType(phoneMetadata, PhoneNumberType.MOBILE);
                if (descHasPossibleNumberData(numberDescByType2)) {
                    ArrayList arrayList = new ArrayList(possibleLengthList);
                    if (numberDescByType2.getPossibleLengthList().size() == 0) {
                        possibleLengthList2 = phoneMetadata.getGeneralDesc().getPossibleLengthList();
                    } else {
                        possibleLengthList2 = numberDescByType2.getPossibleLengthList();
                    }
                    arrayList.addAll(possibleLengthList2);
                    Collections.sort(arrayList);
                    if (possibleLengthLocalOnlyList.isEmpty()) {
                        possibleLengthLocalOnlyList = numberDescByType2.getPossibleLengthLocalOnlyList();
                    } else {
                        ArrayList arrayList2 = new ArrayList(possibleLengthLocalOnlyList);
                        arrayList2.addAll(numberDescByType2.getPossibleLengthLocalOnlyList());
                        Collections.sort(arrayList2);
                        possibleLengthLocalOnlyList = arrayList2;
                    }
                    possibleLengthList = arrayList;
                }
            }
        }
        if (possibleLengthList.get(0).intValue() == -1) {
            return ValidationResult.INVALID_LENGTH;
        }
        int length = charSequence.length();
        if (possibleLengthLocalOnlyList.contains(Integer.valueOf(length))) {
            return ValidationResult.IS_POSSIBLE_LOCAL_ONLY;
        }
        int intValue = possibleLengthList.get(0).intValue();
        if (intValue == length) {
            return ValidationResult.IS_POSSIBLE;
        }
        if (intValue > length) {
            return ValidationResult.TOO_SHORT;
        }
        if (possibleLengthList.get(possibleLengthList.size() - 1).intValue() < length) {
            return ValidationResult.TOO_LONG;
        }
        if (possibleLengthList.subList(1, possibleLengthList.size()).contains(Integer.valueOf(length))) {
            return ValidationResult.IS_POSSIBLE;
        }
        return ValidationResult.INVALID_LENGTH;
    }

    /* access modifiers changed from: package-private */
    public boolean maybeStripNationalPrefixAndCarrierCode(StringBuilder sb, Phonemetadata.PhoneMetadata phoneMetadata, StringBuilder sb2) {
        int length = sb.length();
        String nationalPrefixForParsing = phoneMetadata.getNationalPrefixForParsing();
        if (!(length == 0 || nationalPrefixForParsing.length() == 0)) {
            Matcher matcher = this.regexCache.getPatternForRegex(nationalPrefixForParsing).matcher(sb);
            if (matcher.lookingAt()) {
                Phonemetadata.PhoneNumberDesc generalDesc = phoneMetadata.getGeneralDesc();
                boolean matchNationalNumber = this.matcherApi.matchNationalNumber(sb, generalDesc, false);
                int groupCount = matcher.groupCount();
                String nationalPrefixTransformRule = phoneMetadata.getNationalPrefixTransformRule();
                if (nationalPrefixTransformRule != null && nationalPrefixTransformRule.length() != 0 && matcher.group(groupCount) != null) {
                    StringBuilder sb3 = new StringBuilder(sb);
                    sb3.replace(0, length, matcher.replaceFirst(nationalPrefixTransformRule));
                    if (matchNationalNumber && !this.matcherApi.matchNationalNumber(sb3.toString(), generalDesc, false)) {
                        return false;
                    }
                    if (sb2 != null && groupCount > 1) {
                        sb2.append(matcher.group(1));
                    }
                    sb.replace(0, sb.length(), sb3.toString());
                    return true;
                } else if (matchNationalNumber && !this.matcherApi.matchNationalNumber(sb.substring(matcher.end()), generalDesc, false)) {
                    return false;
                } else {
                    if (!(sb2 == null || groupCount <= 0 || matcher.group(groupCount) == null)) {
                        sb2.append(matcher.group(1));
                    }
                    sb.delete(0, matcher.end());
                    return true;
                }
            }
        }
        return false;
    }

    public String formatNumberForMobileDialing(Phonenumber.PhoneNumber phoneNumber, String str, boolean z) {
        boolean z2;
        int countryCode = phoneNumber.getCountryCode();
        String str2 = "";
        if (hasValidCountryCallingCode(countryCode)) {
            Phonenumber.PhoneNumber clearExtension = new Phonenumber.PhoneNumber().mergeFrom(phoneNumber).clearExtension();
            String regionCodeForCountryCode = getRegionCodeForCountryCode(countryCode);
            PhoneNumberType numberType = getNumberType(clearExtension);
            boolean z3 = false;
            if (numberType != PhoneNumberType.UNKNOWN) {
                z2 = true;
            } else {
                z2 = false;
            }
            if (str.equals(regionCodeForCountryCode)) {
                if (numberType == PhoneNumberType.FIXED_LINE || numberType == PhoneNumberType.MOBILE || numberType == PhoneNumberType.FIXED_LINE_OR_MOBILE) {
                    z3 = true;
                }
                if (regionCodeForCountryCode.equals("CO") && numberType == PhoneNumberType.FIXED_LINE) {
                    str2 = formatNationalNumberWithCarrierCode(clearExtension, "3");
                } else if (!regionCodeForCountryCode.equals("BR") || !z3) {
                    if (z2 && regionCodeForCountryCode.equals("HU")) {
                        str2 = getNddPrefixForRegion(regionCodeForCountryCode, true) + " " + format(clearExtension, PhoneNumberFormat.NATIONAL);
                    } else if (countryCode == 1) {
                        str2 = (!canBeInternationallyDialled(clearExtension) || testNumberLength(getNationalSignificantNumber(clearExtension), getMetadataForRegion(str)) == ValidationResult.TOO_SHORT) ? format(clearExtension, PhoneNumberFormat.NATIONAL) : format(clearExtension, PhoneNumberFormat.INTERNATIONAL);
                    } else {
                        str2 = ((regionCodeForCountryCode.equals("001") || ((regionCodeForCountryCode.equals("MX") || regionCodeForCountryCode.equals("CL") || regionCodeForCountryCode.equals("UZ")) && z3)) && canBeInternationallyDialled(clearExtension)) ? format(clearExtension, PhoneNumberFormat.INTERNATIONAL) : format(clearExtension, PhoneNumberFormat.NATIONAL);
                    }
                } else if (clearExtension.getPreferredDomesticCarrierCode().length() > 0) {
                    str2 = formatNationalNumberWithPreferredCarrierCode(clearExtension, str2);
                }
            } else if (z2 && canBeInternationallyDialled(clearExtension)) {
                if (z) {
                    return format(clearExtension, PhoneNumberFormat.INTERNATIONAL);
                }
                return format(clearExtension, PhoneNumberFormat.E164);
            }
            if (z) {
                return str2;
            }
            return normalizeDiallableCharsOnly(str2);
        } else if (phoneNumber.hasRawInput()) {
            return phoneNumber.getRawInput();
        } else {
            return str2;
        }
    }

    public Iterable<PhoneNumberMatch> findNumbers(final CharSequence charSequence, final String str, final Leniency leniency, final long j2) {
        return new Iterable<PhoneNumberMatch>() {
            /* class com.google.i18n.phonenumbers.PhoneNumberUtil.AnonymousClass1 */

            static {
                Covode.recordClassIndex(34088);
            }

            @Override // java.lang.Iterable
            public Iterator<PhoneNumberMatch> iterator() {
                return new PhoneNumberMatcher(PhoneNumberUtil.this, charSequence, str, leniency, j2);
            }
        };
    }

    private String formatNsn(String str, Phonemetadata.PhoneMetadata phoneMetadata, PhoneNumberFormat phoneNumberFormat, CharSequence charSequence) {
        List<Phonemetadata.NumberFormat> list;
        if (phoneMetadata.intlNumberFormats().size() == 0 || phoneNumberFormat == PhoneNumberFormat.NATIONAL) {
            list = phoneMetadata.numberFormats();
        } else {
            list = phoneMetadata.intlNumberFormats();
        }
        Phonemetadata.NumberFormat chooseFormattingPatternForNumber = chooseFormattingPatternForNumber(list, str);
        if (chooseFormattingPatternForNumber == null) {
            return str;
        }
        return formatNsnUsingPattern(str, chooseFormattingPatternForNumber, phoneNumberFormat, charSequence);
    }

    /* JADX WARNING: Removed duplicated region for block: B:11:0x0044  */
    /* JADX WARNING: Removed duplicated region for block: B:22:? A[RETURN, SYNTHETIC] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private java.lang.String formatNsnUsingPattern(java.lang.String r5, com.google.i18n.phonenumbers.Phonemetadata.NumberFormat r6, com.google.i18n.phonenumbers.PhoneNumberUtil.PhoneNumberFormat r7, java.lang.CharSequence r8) {
        /*
        // Method dump skipped, instructions count: 128
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.i18n.phonenumbers.PhoneNumberUtil.formatNsnUsingPattern(java.lang.String, com.google.i18n.phonenumbers.Phonemetadata$NumberFormat, com.google.i18n.phonenumbers.PhoneNumberUtil$PhoneNumberFormat, java.lang.CharSequence):java.lang.String");
    }

    private void maybeAppendFormattedExtension(Phonenumber.PhoneNumber phoneNumber, Phonemetadata.PhoneMetadata phoneMetadata, PhoneNumberFormat phoneNumberFormat, StringBuilder sb) {
        if (phoneNumber.hasExtension() && phoneNumber.getExtension().length() > 0) {
            if (phoneNumberFormat == PhoneNumberFormat.RFC3966) {
                sb.append(";ext=").append(phoneNumber.getExtension());
            } else if (phoneMetadata.hasPreferredExtnPrefix()) {
                sb.append(phoneMetadata.getPreferredExtnPrefix()).append(phoneNumber.getExtension());
            } else {
                sb.append(" ext. ").append(phoneNumber.getExtension());
            }
        }
    }

    /* access modifiers changed from: package-private */
    public int maybeExtractCountryCode(CharSequence charSequence, Phonemetadata.PhoneMetadata phoneMetadata, StringBuilder sb, boolean z, Phonenumber.PhoneNumber phoneNumber) {
        String str;
        if (charSequence.length() == 0) {
            return 0;
        }
        StringBuilder sb2 = new StringBuilder(charSequence);
        if (phoneMetadata != null) {
            str = phoneMetadata.getInternationalPrefix();
        } else {
            str = "NonMatch";
        }
        Phonenumber.PhoneNumber.CountryCodeSource maybeStripInternationalPrefixAndNormalize = maybeStripInternationalPrefixAndNormalize(sb2, str);
        if (z) {
            phoneNumber.setCountryCodeSource(maybeStripInternationalPrefixAndNormalize);
        }
        if (maybeStripInternationalPrefixAndNormalize == Phonenumber.PhoneNumber.CountryCodeSource.FROM_DEFAULT_COUNTRY) {
            if (phoneMetadata != null) {
                int countryCode = phoneMetadata.getCountryCode();
                String valueOf = String.valueOf(countryCode);
                String sb3 = sb2.toString();
                if (sb3.startsWith(valueOf)) {
                    StringBuilder sb4 = new StringBuilder(sb3.substring(valueOf.length()));
                    Phonemetadata.PhoneNumberDesc generalDesc = phoneMetadata.getGeneralDesc();
                    maybeStripNationalPrefixAndCarrierCode(sb4, phoneMetadata, null);
                    if ((!this.matcherApi.matchNationalNumber(sb2, generalDesc, false) && this.matcherApi.matchNationalNumber(sb4, generalDesc, false)) || testNumberLength(sb2, phoneMetadata) == ValidationResult.TOO_LONG) {
                        sb.append((CharSequence) sb4);
                        if (z) {
                            phoneNumber.setCountryCodeSource(Phonenumber.PhoneNumber.CountryCodeSource.FROM_NUMBER_WITHOUT_PLUS_SIGN);
                        }
                        phoneNumber.setCountryCode(countryCode);
                        return countryCode;
                    }
                }
            }
            phoneNumber.setCountryCode(0);
            return 0;
        } else if (sb2.length() > 2) {
            int extractCountryCode = extractCountryCode(sb2, sb);
            if (extractCountryCode != 0) {
                phoneNumber.setCountryCode(extractCountryCode);
                return extractCountryCode;
            }
            throw new NumberParseException(NumberParseException.ErrorType.INVALID_COUNTRY_CODE, "Country calling code supplied was not recognised.");
        } else {
            throw new NumberParseException(NumberParseException.ErrorType.TOO_SHORT_AFTER_IDD, "Phone number had an IDD, but after this was not long enough to be a viable phone number.");
        }
    }

    /* JADX WARNING: Removed duplicated region for block: B:36:0x009b  */
    /* JADX WARNING: Removed duplicated region for block: B:58:0x00f5  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private void parseHelper(java.lang.CharSequence r11, java.lang.String r12, boolean r13, boolean r14, com.google.i18n.phonenumbers.Phonenumber.PhoneNumber r15) {
        /*
        // Method dump skipped, instructions count: 317
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.i18n.phonenumbers.PhoneNumberUtil.parseHelper(java.lang.CharSequence, java.lang.String, boolean, boolean, com.google.i18n.phonenumbers.Phonenumber$PhoneNumber):void");
    }
}
