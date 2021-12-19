package com.google.i18n.phonenumbers;

import com.bytedance.covode.number.Covode;
import com.google.i18n.phonenumbers.PhoneNumberUtil;
import com.google.i18n.phonenumbers.Phonemetadata;
import com.google.i18n.phonenumbers.Phonenumber;
import java.lang.Character;
import java.util.Iterator;
import java.util.NoSuchElementException;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

final class PhoneNumberMatcher implements Iterator<PhoneNumberMatch> {
    private static final Pattern[] INNER_MATCHES = {Pattern.compile("/+(.*)"), Pattern.compile("(\\([^(]*)"), Pattern.compile("(?:\\p{Z}-|-\\p{Z})\\p{Z}*(.+)"), Pattern.compile("[‒-―－]\\p{Z}*(.+)"), Pattern.compile("\\.+\\p{Z}*([^.]+)"), Pattern.compile("\\p{Z}+(\\P{Z}+)")};
    private static final Pattern LEAD_CLASS;
    private static final Pattern MATCHING_BRACKETS;
    private static final Pattern PATTERN;
    private static final Pattern PUB_PAGES = Pattern.compile("\\d{1,5}-+\\d{1,5}\\s{0,4}\\(\\d{1,4}");
    private static final Pattern SLASH_SEPARATED_DATES = Pattern.compile("(?:(?:[0-3]?\\d/[01]?\\d)|(?:[01]?\\d/[0-3]?\\d))/(?:[12]\\d)?\\d{2}");
    private static final Pattern TIME_STAMPS = Pattern.compile("[12]\\d{3}[-/]?[01]\\d[-/]?[0-3]\\d +[0-2]\\d$");
    private static final Pattern TIME_STAMPS_SUFFIX = Pattern.compile(":[0-5]\\d");
    private PhoneNumberMatch lastMatch;
    private final PhoneNumberUtil.Leniency leniency;
    private long maxTries;
    private final PhoneNumberUtil phoneUtil;
    private final String preferredRegion;
    private int searchIndex;
    private State state = State.NOT_READY;
    private final CharSequence text;

    /* access modifiers changed from: package-private */
    public interface NumberGroupingChecker {
        static {
            Covode.recordClassIndex(34085);
        }

        boolean checkGroups(PhoneNumberUtil phoneNumberUtil, Phonenumber.PhoneNumber phoneNumber, StringBuilder sb, String[] strArr);
    }

    public final void remove() {
        throw new UnsupportedOperationException();
    }

    @Override // java.util.Iterator
    public final PhoneNumberMatch next() {
        if (hasNext()) {
            PhoneNumberMatch phoneNumberMatch = this.lastMatch;
            this.lastMatch = null;
            this.state = State.NOT_READY;
            return phoneNumberMatch;
        }
        throw new NoSuchElementException();
    }

    /* access modifiers changed from: package-private */
    public enum State {
        NOT_READY,
        READY,
        DONE;

        static {
            Covode.recordClassIndex(34086);
        }
    }

    public final boolean hasNext() {
        if (this.state == State.NOT_READY) {
            PhoneNumberMatch find = find(this.searchIndex);
            this.lastMatch = find;
            if (find == null) {
                this.state = State.DONE;
            } else {
                this.searchIndex = find.end();
                this.state = State.READY;
            }
        }
        if (this.state == State.READY) {
            return true;
        }
        return false;
    }

    static {
        Covode.recordClassIndex(34084);
        String str = "[^" + "(\\[（［" + ")\\]）］" + "]";
        MATCHING_BRACKETS = Pattern.compile("(?:[" + "(\\[（［" + "])?(?:" + str + "+[" + ")\\]）］" + "])?" + str + "+(?:[" + "(\\[（［" + "]" + str + "+[" + ")\\]）］" + "])" + limit(0, 3) + str + "*");
        String limit = limit(0, 2);
        String limit2 = limit(0, 4);
        String limit3 = limit(0, 20);
        String concat = "[-x‐-―−ー－-／  ­​⁠　()（）［］.\\[\\]/~⁓∼～]".concat(String.valueOf(limit2));
        String str2 = "\\p{Nd}" + limit(1, 20);
        String str3 = "[" + ("(\\[（［" + "+＋") + "]";
        LEAD_CLASS = Pattern.compile(str3);
        PATTERN = Pattern.compile("(?:" + str3 + concat + ")" + limit + str2 + "(?:" + concat + str2 + ")" + limit3 + "(?:" + PhoneNumberUtil.EXTN_PATTERNS_FOR_MATCHING + ")?", 66);
    }

    private static boolean isInvalidPunctuationSymbol(char c2) {
        if (c2 == '%' || Character.getType(c2) == 26) {
            return true;
        }
        return false;
    }

    private PhoneNumberMatch find(int i2) {
        Matcher matcher = PATTERN.matcher(this.text);
        while (this.maxTries > 0 && matcher.find(i2)) {
            int start = matcher.start();
            CharSequence trimAfterFirstMatch = trimAfterFirstMatch(PhoneNumberUtil.SECOND_NUMBER_START_PATTERN, this.text.subSequence(start, matcher.end()));
            PhoneNumberMatch extractMatch = extractMatch(trimAfterFirstMatch, start);
            if (extractMatch != null) {
                return extractMatch;
            }
            i2 = start + trimAfterFirstMatch.length();
            this.maxTries--;
        }
        return null;
    }

    static boolean isLatinLetter(char c2) {
        if (!Character.isLetter(c2) && Character.getType(c2) != 6) {
            return false;
        }
        Character.UnicodeBlock of = Character.UnicodeBlock.of(c2);
        if (of.equals(Character.UnicodeBlock.BASIC_LATIN) || of.equals(Character.UnicodeBlock.LATIN_1_SUPPLEMENT) || of.equals(Character.UnicodeBlock.LATIN_EXTENDED_A) || of.equals(Character.UnicodeBlock.LATIN_EXTENDED_ADDITIONAL) || of.equals(Character.UnicodeBlock.LATIN_EXTENDED_B) || of.equals(Character.UnicodeBlock.COMBINING_DIACRITICAL_MARKS)) {
            return true;
        }
        return false;
    }

    private static CharSequence trimAfterFirstMatch(Pattern pattern, CharSequence charSequence) {
        Matcher matcher = pattern.matcher(charSequence);
        if (matcher.find()) {
            return charSequence.subSequence(0, matcher.start());
        }
        return charSequence;
    }

    private static String limit(int i2, int i3) {
        if (i2 >= 0 && i3 > 0 && i3 >= i2) {
            return "{" + i2 + "," + i3 + "}";
        }
        throw new IllegalArgumentException();
    }

    static boolean containsMoreThanOneSlashInNationalNumber(Phonenumber.PhoneNumber phoneNumber, String str) {
        int indexOf;
        int indexOf2 = str.indexOf(47);
        if (indexOf2 < 0 || (indexOf = str.indexOf(47, indexOf2 + 1)) < 0) {
            return false;
        }
        if ((phoneNumber.getCountryCodeSource() == Phonenumber.PhoneNumber.CountryCodeSource.FROM_NUMBER_WITH_PLUS_SIGN || phoneNumber.getCountryCodeSource() == Phonenumber.PhoneNumber.CountryCodeSource.FROM_NUMBER_WITHOUT_PLUS_SIGN) && PhoneNumberUtil.normalizeDigitsOnly(str.substring(0, indexOf2)).equals(Integer.toString(phoneNumber.getCountryCode()))) {
            return str.substring(indexOf + 1).contains("/");
        }
        return true;
    }

    private PhoneNumberMatch extractInnerMatch(CharSequence charSequence, int i2) {
        for (Pattern pattern : INNER_MATCHES) {
            Matcher matcher = pattern.matcher(charSequence);
            boolean z = true;
            while (matcher.find() && this.maxTries > 0) {
                if (z) {
                    PhoneNumberMatch parseAndVerify = parseAndVerify(trimAfterFirstMatch(PhoneNumberUtil.UNWANTED_END_CHAR_PATTERN, charSequence.subSequence(0, matcher.start())), i2);
                    if (parseAndVerify != null) {
                        return parseAndVerify;
                    }
                    this.maxTries--;
                    z = false;
                }
                PhoneNumberMatch parseAndVerify2 = parseAndVerify(trimAfterFirstMatch(PhoneNumberUtil.UNWANTED_END_CHAR_PATTERN, matcher.group(1)), matcher.start(1) + i2);
                if (parseAndVerify2 != null) {
                    return parseAndVerify2;
                }
                this.maxTries--;
            }
        }
        return null;
    }

    private PhoneNumberMatch extractMatch(CharSequence charSequence, int i2) {
        if (SLASH_SEPARATED_DATES.matcher(charSequence).find()) {
            return null;
        }
        if (TIME_STAMPS.matcher(charSequence).find()) {
            if (TIME_STAMPS_SUFFIX.matcher(this.text.toString().substring(charSequence.length() + i2)).lookingAt()) {
                return null;
            }
        }
        PhoneNumberMatch parseAndVerify = parseAndVerify(charSequence, i2);
        if (parseAndVerify != null) {
            return parseAndVerify;
        }
        return extractInnerMatch(charSequence, i2);
    }

    static boolean isNationalPrefixPresentIfRequired(Phonenumber.PhoneNumber phoneNumber, PhoneNumberUtil phoneNumberUtil) {
        Phonemetadata.PhoneMetadata metadataForRegion;
        Phonemetadata.NumberFormat chooseFormattingPatternForNumber;
        if (phoneNumber.getCountryCodeSource() == Phonenumber.PhoneNumber.CountryCodeSource.FROM_DEFAULT_COUNTRY && (metadataForRegion = phoneNumberUtil.getMetadataForRegion(phoneNumberUtil.getRegionCodeForCountryCode(phoneNumber.getCountryCode()))) != null && (chooseFormattingPatternForNumber = phoneNumberUtil.chooseFormattingPatternForNumber(metadataForRegion.numberFormats(), phoneNumberUtil.getNationalSignificantNumber(phoneNumber))) != null && chooseFormattingPatternForNumber.getNationalPrefixFormattingRule().length() > 0 && !chooseFormattingPatternForNumber.getNationalPrefixOptionalWhenFormatting() && !PhoneNumberUtil.formattingRuleHasFirstGroupOnly(chooseFormattingPatternForNumber.getNationalPrefixFormattingRule())) {
            return phoneNumberUtil.maybeStripNationalPrefixAndCarrierCode(new StringBuilder(PhoneNumberUtil.normalizeDigitsOnly(phoneNumber.getRawInput())), metadataForRegion, null);
        }
        return true;
    }

    private PhoneNumberMatch parseAndVerify(CharSequence charSequence, int i2) {
        try {
            if (MATCHING_BRACKETS.matcher(charSequence).matches()) {
                if (!PUB_PAGES.matcher(charSequence).find()) {
                    if (this.leniency.compareTo((Enum) PhoneNumberUtil.Leniency.VALID) >= 0) {
                        if (i2 > 0 && !LEAD_CLASS.matcher(charSequence).lookingAt()) {
                            char charAt = this.text.charAt(i2 - 1);
                            if (isInvalidPunctuationSymbol(charAt) || isLatinLetter(charAt)) {
                                return null;
                            }
                        }
                        int length = charSequence.length() + i2;
                        if (length < this.text.length()) {
                            char charAt2 = this.text.charAt(length);
                            if (isInvalidPunctuationSymbol(charAt2) || isLatinLetter(charAt2)) {
                                return null;
                            }
                        }
                    }
                    Phonenumber.PhoneNumber parseAndKeepRawInput = this.phoneUtil.parseAndKeepRawInput(charSequence, this.preferredRegion);
                    if ((!this.phoneUtil.getRegionCodeForCountryCode(parseAndKeepRawInput.getCountryCode()).equals("IL") || this.phoneUtil.getNationalSignificantNumber(parseAndKeepRawInput).length() != 4 || (i2 != 0 && (i2 <= 0 || this.text.charAt(i2 - 1) == '*'))) && this.leniency.verify(parseAndKeepRawInput, charSequence, this.phoneUtil)) {
                        parseAndKeepRawInput.clearCountryCodeSource();
                        parseAndKeepRawInput.clearRawInput();
                        parseAndKeepRawInput.clearPreferredDomesticCarrierCode();
                        return new PhoneNumberMatch(i2, charSequence.toString(), parseAndKeepRawInput);
                    }
                }
            }
        } catch (NumberParseException unused) {
        }
        return null;
    }

    private static String[] getNationalNumberGroups(PhoneNumberUtil phoneNumberUtil, Phonenumber.PhoneNumber phoneNumber, Phonemetadata.NumberFormat numberFormat) {
        if (numberFormat != null) {
            return phoneNumberUtil.formatNsnUsingPattern(phoneNumberUtil.getNationalSignificantNumber(phoneNumber), numberFormat, PhoneNumberUtil.PhoneNumberFormat.RFC3966).split("-");
        }
        String format = phoneNumberUtil.format(phoneNumber, PhoneNumberUtil.PhoneNumberFormat.RFC3966);
        int indexOf = format.indexOf(59);
        if (indexOf < 0) {
            indexOf = format.length();
        }
        return format.substring(format.indexOf(45) + 1, indexOf).split("-");
    }

    static boolean containsOnlyValidXChars(Phonenumber.PhoneNumber phoneNumber, String str, PhoneNumberUtil phoneNumberUtil) {
        int i2 = 0;
        while (i2 < str.length() - 1) {
            char charAt = str.charAt(i2);
            if (charAt == 'x' || charAt == 'X') {
                int i3 = i2 + 1;
                char charAt2 = str.charAt(i3);
                if (charAt2 == 'x' || charAt2 == 'X') {
                    if (phoneNumberUtil.isNumberMatch(phoneNumber, str.substring(i3)) != PhoneNumberUtil.MatchType.NSN_MATCH) {
                        return false;
                    }
                    i2 = i3;
                } else if (!PhoneNumberUtil.normalizeDigitsOnly(str.substring(i2)).equals(phoneNumber.getExtension())) {
                    return false;
                }
            }
            i2++;
        }
        return true;
    }

    static boolean checkNumberGroupingIsValid(Phonenumber.PhoneNumber phoneNumber, CharSequence charSequence, PhoneNumberUtil phoneNumberUtil, NumberGroupingChecker numberGroupingChecker) {
        StringBuilder normalizeDigits = PhoneNumberUtil.normalizeDigits(charSequence, true);
        if (numberGroupingChecker.checkGroups(phoneNumberUtil, phoneNumber, normalizeDigits, getNationalNumberGroups(phoneNumberUtil, phoneNumber, null))) {
            return true;
        }
        Phonemetadata.PhoneMetadata alternateFormatsForCountry = MetadataManager.getAlternateFormatsForCountry(phoneNumber.getCountryCode());
        if (alternateFormatsForCountry == null) {
            return false;
        }
        for (Phonemetadata.NumberFormat numberFormat : alternateFormatsForCountry.numberFormats()) {
            if (numberGroupingChecker.checkGroups(phoneNumberUtil, phoneNumber, normalizeDigits, getNationalNumberGroups(phoneNumberUtil, phoneNumber, numberFormat))) {
                return true;
            }
        }
        return false;
    }

    static boolean allNumberGroupsAreExactlyPresent(PhoneNumberUtil phoneNumberUtil, Phonenumber.PhoneNumber phoneNumber, StringBuilder sb, String[] strArr) {
        int length;
        String[] split = PhoneNumberUtil.NON_DIGITS_PATTERN.split(sb.toString());
        if (phoneNumber.hasExtension()) {
            length = split.length - 2;
        } else {
            length = split.length - 1;
        }
        if (split.length == 1 || split[length].contains(phoneNumberUtil.getNationalSignificantNumber(phoneNumber))) {
            return true;
        }
        int length2 = strArr.length - 1;
        while (true) {
            if (length2 > 0) {
                if (length < 0 || !split[length].equals(strArr[length2])) {
                    return false;
                }
                length2--;
                length--;
            } else if (length < 0 || !split[length].endsWith(strArr[0])) {
                return false;
            } else {
                return true;
            }
        }
        return false;
    }

    static boolean allNumberGroupsRemainGrouped(PhoneNumberUtil phoneNumberUtil, Phonenumber.PhoneNumber phoneNumber, StringBuilder sb, String[] strArr) {
        int i2;
        if (phoneNumber.getCountryCodeSource() != Phonenumber.PhoneNumber.CountryCodeSource.FROM_DEFAULT_COUNTRY) {
            String num = Integer.toString(phoneNumber.getCountryCode());
            i2 = sb.indexOf(num) + num.length();
        } else {
            i2 = 0;
        }
        for (int i3 = 0; i3 < strArr.length; i3++) {
            int indexOf = sb.indexOf(strArr[i3], i2);
            if (indexOf < 0) {
                return false;
            }
            i2 = indexOf + strArr[i3].length();
            if (i3 == 0 && i2 < sb.length() && phoneNumberUtil.getNddPrefixForRegion(phoneNumberUtil.getRegionCodeForCountryCode(phoneNumber.getCountryCode()), true) != null && Character.isDigit(sb.charAt(i2))) {
                return sb.substring(i2 - strArr[i3].length()).startsWith(phoneNumberUtil.getNationalSignificantNumber(phoneNumber));
            }
        }
        return sb.substring(i2).contains(phoneNumber.getExtension());
    }

    PhoneNumberMatcher(PhoneNumberUtil phoneNumberUtil, CharSequence charSequence, String str, PhoneNumberUtil.Leniency leniency2, long j2) {
        if (phoneNumberUtil == null || leniency2 == null) {
            throw null;
        } else if (j2 >= 0) {
            this.phoneUtil = phoneNumberUtil;
            this.text = charSequence == null ? "" : charSequence;
            this.preferredRegion = str;
            this.leniency = leniency2;
            this.maxTries = j2;
        } else {
            throw new IllegalArgumentException();
        }
    }
}
