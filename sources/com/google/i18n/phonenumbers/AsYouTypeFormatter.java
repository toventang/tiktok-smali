package com.google.i18n.phonenumbers;

import com.bytedance.covode.number.Covode;
import com.google.i18n.phonenumbers.Phonemetadata;
import com.google.i18n.phonenumbers.internal.RegexCache;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class AsYouTypeFormatter {
    private static final Pattern CHARACTER_CLASS_PATTERN = Pattern.compile("\\[([^\\[\\]])*\\]");
    private static final Pattern DIGIT_PATTERN = Pattern.compile(" ");
    private static final Pattern ELIGIBLE_FORMAT_PATTERN = Pattern.compile("[-x‐-―−ー－-／  ­​⁠　()（）［］.\\[\\]/~⁓∼～]*(\\$\\d[-x‐-―−ー－-／  ­​⁠　()（）［］.\\[\\]/~⁓∼～]*)+");
    private static final Phonemetadata.PhoneMetadata EMPTY_METADATA = new Phonemetadata.PhoneMetadata().setInternationalPrefix("NA");
    private static final Pattern NATIONAL_PREFIX_SEPARATORS_PATTERN = Pattern.compile("[- ]");
    private static final Pattern STANDALONE_DIGIT_PATTERN = Pattern.compile("\\d(?=[^,}][^,}])");
    private boolean ableToFormat = true;
    private StringBuilder accruedInput = new StringBuilder();
    private StringBuilder accruedInputWithoutFormatting = new StringBuilder();
    private String currentFormattingPattern = "";
    private Phonemetadata.PhoneMetadata currentMetadata;
    private String currentOutput = "";
    private String defaultCountry;
    private Phonemetadata.PhoneMetadata defaultMetadata;
    private String extractedNationalPrefix = "";
    private StringBuilder formattingTemplate = new StringBuilder();
    private boolean inputHasFormatting = false;
    private boolean isCompleteNumber = false;
    private boolean isExpectingCountryCallingCode = false;
    private int lastMatchPosition = 0;
    private StringBuilder nationalNumber = new StringBuilder();
    private int originalPosition = 0;
    private final PhoneNumberUtil phoneUtil = PhoneNumberUtil.getInstance();
    private int positionToRemember = 0;
    private List<Phonemetadata.NumberFormat> possibleFormats = new ArrayList();
    private StringBuilder prefixBeforeNationalNumber = new StringBuilder();
    private RegexCache regexCache = new RegexCache(64);
    private boolean shouldAddSpaceAfterNationalPrefix = false;

    /* access modifiers changed from: package-private */
    public String getExtractedNationalPrefix() {
        return this.extractedNationalPrefix;
    }

    private String attemptToChoosePatternWithPrefixExtracted() {
        this.ableToFormat = true;
        this.isExpectingCountryCallingCode = false;
        this.possibleFormats.clear();
        this.lastMatchPosition = 0;
        this.formattingTemplate.setLength(0);
        this.currentFormattingPattern = "";
        return attemptToChooseFormattingPattern();
    }

    static {
        Covode.recordClassIndex(34073);
    }

    private boolean ableToExtractLongerNdd() {
        if (this.extractedNationalPrefix.length() > 0) {
            this.nationalNumber.insert(0, this.extractedNationalPrefix);
            this.prefixBeforeNationalNumber.setLength(this.prefixBeforeNationalNumber.lastIndexOf(this.extractedNationalPrefix));
        }
        if (!this.extractedNationalPrefix.equals(removeNationalPrefixFromNationalNumber())) {
            return true;
        }
        return false;
    }

    private String attemptToChooseFormattingPattern() {
        if (this.nationalNumber.length() < 3) {
            return appendNationalNumber(this.nationalNumber.toString());
        }
        getAvailableFormats(this.nationalNumber.toString());
        String attemptToFormatAccruedDigits = attemptToFormatAccruedDigits();
        if (attemptToFormatAccruedDigits.length() > 0) {
            return attemptToFormatAccruedDigits;
        }
        if (maybeCreateNewTemplate()) {
            return inputAccruedNationalNumber();
        }
        return this.accruedInput.toString();
    }

    private String inputAccruedNationalNumber() {
        String inputDigitHelper;
        int length = this.nationalNumber.length();
        if (length <= 0) {
            return this.prefixBeforeNationalNumber.toString();
        }
        int i2 = 0;
        do {
            inputDigitHelper = inputDigitHelper(this.nationalNumber.charAt(i2));
            i2++;
        } while (i2 < length);
        if (this.ableToFormat) {
            return appendNationalNumber(inputDigitHelper);
        }
        return this.accruedInput.toString();
    }

    private boolean isNanpaNumberWithNationalPrefix() {
        if (this.currentMetadata.getCountryCode() != 1 || this.nationalNumber.charAt(0) != '1' || this.nationalNumber.charAt(1) == '0' || this.nationalNumber.charAt(1) == '1') {
            return false;
        }
        return true;
    }

    public int getRememberedPosition() {
        if (!this.ableToFormat) {
            return this.originalPosition;
        }
        int i2 = 0;
        int i3 = 0;
        while (i2 < this.positionToRemember && i3 < this.currentOutput.length()) {
            if (this.accruedInputWithoutFormatting.charAt(i2) == this.currentOutput.charAt(i3)) {
                i2++;
            }
            i3++;
        }
        return i3;
    }

    private boolean attemptToExtractCountryCallingCode() {
        StringBuilder sb;
        int extractCountryCode;
        if (this.nationalNumber.length() == 0 || (extractCountryCode = this.phoneUtil.extractCountryCode(this.nationalNumber, (sb = new StringBuilder()))) == 0) {
            return false;
        }
        this.nationalNumber.setLength(0);
        this.nationalNumber.append((CharSequence) sb);
        String regionCodeForCountryCode = this.phoneUtil.getRegionCodeForCountryCode(extractCountryCode);
        if ("001".equals(regionCodeForCountryCode)) {
            this.currentMetadata = this.phoneUtil.getMetadataForNonGeographicalRegion(extractCountryCode);
        } else if (!regionCodeForCountryCode.equals(this.defaultCountry)) {
            this.currentMetadata = getMetadataForRegion(regionCodeForCountryCode);
        }
        this.prefixBeforeNationalNumber.append(Integer.toString(extractCountryCode)).append(' ');
        this.extractedNationalPrefix = "";
        return true;
    }

    private boolean attemptToExtractIdd() {
        Matcher matcher = this.regexCache.getPatternForRegex("\\+|" + this.currentMetadata.getInternationalPrefix()).matcher(this.accruedInputWithoutFormatting);
        if (!matcher.lookingAt()) {
            return false;
        }
        this.isCompleteNumber = true;
        int end = matcher.end();
        this.nationalNumber.setLength(0);
        this.nationalNumber.append(this.accruedInputWithoutFormatting.substring(end));
        this.prefixBeforeNationalNumber.setLength(0);
        this.prefixBeforeNationalNumber.append(this.accruedInputWithoutFormatting.substring(0, end));
        if (this.accruedInputWithoutFormatting.charAt(0) != '+') {
            this.prefixBeforeNationalNumber.append(' ');
        }
        return true;
    }

    private boolean maybeCreateNewTemplate() {
        Iterator<Phonemetadata.NumberFormat> it = this.possibleFormats.iterator();
        while (it.hasNext()) {
            Phonemetadata.NumberFormat next = it.next();
            String pattern = next.getPattern();
            if (this.currentFormattingPattern.equals(pattern)) {
                return false;
            }
            if (createFormattingTemplate(next)) {
                this.currentFormattingPattern = pattern;
                this.shouldAddSpaceAfterNationalPrefix = NATIONAL_PREFIX_SEPARATORS_PATTERN.matcher(next.getNationalPrefixFormattingRule()).find();
                this.lastMatchPosition = 0;
                return true;
            }
            it.remove();
        }
        this.ableToFormat = false;
        return false;
    }

    private String removeNationalPrefixFromNationalNumber() {
        int i2 = 1;
        if (isNanpaNumberWithNationalPrefix()) {
            this.prefixBeforeNationalNumber.append('1').append(' ');
            this.isCompleteNumber = true;
        } else {
            if (this.currentMetadata.hasNationalPrefixForParsing()) {
                Matcher matcher = this.regexCache.getPatternForRegex(this.currentMetadata.getNationalPrefixForParsing()).matcher(this.nationalNumber);
                if (matcher.lookingAt() && matcher.end() > 0) {
                    this.isCompleteNumber = true;
                    i2 = matcher.end();
                    this.prefixBeforeNationalNumber.append(this.nationalNumber.substring(0, i2));
                }
            }
            i2 = 0;
        }
        String substring = this.nationalNumber.substring(0, i2);
        this.nationalNumber.delete(0, i2);
        return substring;
    }

    /* access modifiers changed from: package-private */
    public String attemptToFormatAccruedDigits() {
        for (Phonemetadata.NumberFormat numberFormat : this.possibleFormats) {
            Matcher matcher = this.regexCache.getPatternForRegex(numberFormat.getPattern()).matcher(this.nationalNumber);
            if (matcher.matches()) {
                this.shouldAddSpaceAfterNationalPrefix = NATIONAL_PREFIX_SEPARATORS_PATTERN.matcher(numberFormat.getNationalPrefixFormattingRule()).find();
                return appendNationalNumber(matcher.replaceAll(numberFormat.getFormat()));
            }
        }
        return "";
    }

    public void clear() {
        this.currentOutput = "";
        this.accruedInput.setLength(0);
        this.accruedInputWithoutFormatting.setLength(0);
        this.formattingTemplate.setLength(0);
        this.lastMatchPosition = 0;
        this.currentFormattingPattern = "";
        this.prefixBeforeNationalNumber.setLength(0);
        this.extractedNationalPrefix = "";
        this.nationalNumber.setLength(0);
        this.ableToFormat = true;
        this.inputHasFormatting = false;
        this.positionToRemember = 0;
        this.originalPosition = 0;
        this.isCompleteNumber = false;
        this.isExpectingCountryCallingCode = false;
        this.possibleFormats.clear();
        this.shouldAddSpaceAfterNationalPrefix = false;
        if (!this.currentMetadata.equals(this.defaultMetadata)) {
            this.currentMetadata = getMetadataForRegion(this.defaultCountry);
        }
    }

    public String inputDigit(char c2) {
        String inputDigitWithOptionToRememberPosition = inputDigitWithOptionToRememberPosition(c2, false);
        this.currentOutput = inputDigitWithOptionToRememberPosition;
        return inputDigitWithOptionToRememberPosition;
    }

    public String inputDigitAndRememberPosition(char c2) {
        String inputDigitWithOptionToRememberPosition = inputDigitWithOptionToRememberPosition(c2, true);
        this.currentOutput = inputDigitWithOptionToRememberPosition;
        return inputDigitWithOptionToRememberPosition;
    }

    private boolean isFormatEligible(String str) {
        return ELIGIBLE_FORMAT_PATTERN.matcher(str).matches();
    }

    private Phonemetadata.PhoneMetadata getMetadataForRegion(String str) {
        Phonemetadata.PhoneMetadata metadataForRegion = this.phoneUtil.getMetadataForRegion(this.phoneUtil.getRegionCodeForCountryCode(this.phoneUtil.getCountryCodeForRegion(str)));
        if (metadataForRegion != null) {
            return metadataForRegion;
        }
        return EMPTY_METADATA;
    }

    private boolean createFormattingTemplate(Phonemetadata.NumberFormat numberFormat) {
        String pattern = numberFormat.getPattern();
        if (pattern.indexOf(124) != -1) {
            return false;
        }
        String replaceAll = STANDALONE_DIGIT_PATTERN.matcher(CHARACTER_CLASS_PATTERN.matcher(pattern).replaceAll("\\\\d")).replaceAll("\\\\d");
        this.formattingTemplate.setLength(0);
        String formattingTemplate2 = getFormattingTemplate(replaceAll, numberFormat.getFormat());
        if (formattingTemplate2.length() <= 0) {
            return false;
        }
        this.formattingTemplate.append(formattingTemplate2);
        return true;
    }

    private boolean isDigitOrLeadingPlusSign(char c2) {
        if (Character.isDigit(c2) || (this.accruedInput.length() == 1 && PhoneNumberUtil.PLUS_CHARS_PATTERN.matcher(Character.toString(c2)).matches())) {
            return true;
        }
        return false;
    }

    AsYouTypeFormatter(String str) {
        this.defaultCountry = str;
        Phonemetadata.PhoneMetadata metadataForRegion = getMetadataForRegion(str);
        this.currentMetadata = metadataForRegion;
        this.defaultMetadata = metadataForRegion;
    }

    private String appendNationalNumber(String str) {
        int length = this.prefixBeforeNationalNumber.length();
        if (!this.shouldAddSpaceAfterNationalPrefix || length <= 0 || this.prefixBeforeNationalNumber.charAt(length - 1) == ' ') {
            return ((Object) this.prefixBeforeNationalNumber) + str;
        }
        return new String(this.prefixBeforeNationalNumber) + ' ' + str;
    }

    private void getAvailableFormats(String str) {
        List<Phonemetadata.NumberFormat> numberFormats;
        if (!this.isCompleteNumber || this.currentMetadata.intlNumberFormatSize() <= 0) {
            numberFormats = this.currentMetadata.numberFormats();
        } else {
            numberFormats = this.currentMetadata.intlNumberFormats();
        }
        boolean hasNationalPrefix = this.currentMetadata.hasNationalPrefix();
        for (Phonemetadata.NumberFormat numberFormat : numberFormats) {
            if ((!hasNationalPrefix || this.isCompleteNumber || numberFormat.getNationalPrefixOptionalWhenFormatting() || PhoneNumberUtil.formattingRuleHasFirstGroupOnly(numberFormat.getNationalPrefixFormattingRule())) && isFormatEligible(numberFormat.getFormat())) {
                this.possibleFormats.add(numberFormat);
            }
        }
        narrowDownPossibleFormats(str);
    }

    private String inputDigitHelper(char c2) {
        Matcher matcher = DIGIT_PATTERN.matcher(this.formattingTemplate);
        if (matcher.find(this.lastMatchPosition)) {
            String replaceFirst = matcher.replaceFirst(Character.toString(c2));
            this.formattingTemplate.replace(0, replaceFirst.length(), replaceFirst);
            int start = matcher.start();
            this.lastMatchPosition = start;
            return this.formattingTemplate.substring(0, start + 1);
        }
        if (this.possibleFormats.size() == 1) {
            this.ableToFormat = false;
        }
        this.currentFormattingPattern = "";
        return this.accruedInput.toString();
    }

    private void narrowDownPossibleFormats(String str) {
        int length = str.length() - 3;
        Iterator<Phonemetadata.NumberFormat> it = this.possibleFormats.iterator();
        while (it.hasNext()) {
            Phonemetadata.NumberFormat next = it.next();
            if (next.leadingDigitsPatternSize() != 0) {
                if (!this.regexCache.getPatternForRegex(next.getLeadingDigitsPattern(Math.min(length, next.leadingDigitsPatternSize() - 1))).matcher(str).lookingAt()) {
                    it.remove();
                }
            }
        }
    }

    private String getFormattingTemplate(String str, String str2) {
        Matcher matcher = this.regexCache.getPatternForRegex(str).matcher("999999999999999");
        matcher.find();
        String group = matcher.group();
        if (group.length() < this.nationalNumber.length()) {
            return "";
        }
        return group.replaceAll(str, str2).replaceAll("9", " ");
    }

    private char normalizeAndAccrueDigitsAndPlusSign(char c2, boolean z) {
        if (c2 == '+') {
            this.accruedInputWithoutFormatting.append(c2);
        } else {
            c2 = Character.forDigit(Character.digit(c2, 10), 10);
            this.accruedInputWithoutFormatting.append(c2);
            this.nationalNumber.append(c2);
        }
        if (z) {
            this.positionToRemember = this.accruedInputWithoutFormatting.length();
        }
        return c2;
    }

    private String inputDigitWithOptionToRememberPosition(char c2, boolean z) {
        this.accruedInput.append(c2);
        if (z) {
            this.originalPosition = this.accruedInput.length();
        }
        if (!isDigitOrLeadingPlusSign(c2)) {
            this.ableToFormat = false;
            this.inputHasFormatting = true;
        } else {
            c2 = normalizeAndAccrueDigitsAndPlusSign(c2, z);
        }
        if (this.ableToFormat) {
            int length = this.accruedInputWithoutFormatting.length();
            if (length == 0 || length == 1 || length == 2) {
                return this.accruedInput.toString();
            }
            if (length == 3) {
                if (attemptToExtractIdd()) {
                    this.isExpectingCountryCallingCode = true;
                } else {
                    this.extractedNationalPrefix = removeNationalPrefixFromNationalNumber();
                    return attemptToChooseFormattingPattern();
                }
            }
            if (this.isExpectingCountryCallingCode) {
                if (attemptToExtractCountryCallingCode()) {
                    this.isExpectingCountryCallingCode = false;
                }
                return ((Object) this.prefixBeforeNationalNumber) + this.nationalNumber.toString();
            } else if (this.possibleFormats.size() <= 0) {
                return attemptToChooseFormattingPattern();
            } else {
                String inputDigitHelper = inputDigitHelper(c2);
                String attemptToFormatAccruedDigits = attemptToFormatAccruedDigits();
                if (attemptToFormatAccruedDigits.length() > 0) {
                    return attemptToFormatAccruedDigits;
                }
                narrowDownPossibleFormats(this.nationalNumber.toString());
                if (maybeCreateNewTemplate()) {
                    return inputAccruedNationalNumber();
                }
                if (this.ableToFormat) {
                    return appendNationalNumber(inputDigitHelper);
                }
                return this.accruedInput.toString();
            }
        } else if (this.inputHasFormatting) {
            return this.accruedInput.toString();
        } else {
            if (attemptToExtractIdd()) {
                if (attemptToExtractCountryCallingCode()) {
                    return attemptToChoosePatternWithPrefixExtracted();
                }
            } else if (ableToExtractLongerNdd()) {
                this.prefixBeforeNationalNumber.append(' ');
                return attemptToChoosePatternWithPrefixExtracted();
            }
            return this.accruedInput.toString();
        }
    }
}
