package com.google.i18n.phonenumbers;

import com.bytedance.covode.number.Covode;
import java.io.Externalizable;
import java.io.ObjectInput;
import java.io.ObjectOutput;
import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

public final class Phonemetadata {
    static {
        Covode.recordClassIndex(34101);
    }

    public static class NumberFormat implements Externalizable {
        private static final long serialVersionUID = 1;
        private String domesticCarrierCodeFormattingRule_ = "";
        private String format_ = "";
        private boolean hasDomesticCarrierCodeFormattingRule;
        private boolean hasFormat;
        private boolean hasNationalPrefixFormattingRule;
        private boolean hasNationalPrefixOptionalWhenFormatting;
        private boolean hasPattern;
        private List<String> leadingDigitsPattern_ = new ArrayList();
        private String nationalPrefixFormattingRule_ = "";
        private boolean nationalPrefixOptionalWhenFormatting_ = false;
        private String pattern_ = "";

        static {
            Covode.recordClassIndex(34102);
        }

        public String getDomesticCarrierCodeFormattingRule() {
            return this.domesticCarrierCodeFormattingRule_;
        }

        public String getFormat() {
            return this.format_;
        }

        public String getNationalPrefixFormattingRule() {
            return this.nationalPrefixFormattingRule_;
        }

        public boolean getNationalPrefixOptionalWhenFormatting() {
            return this.nationalPrefixOptionalWhenFormatting_;
        }

        public String getPattern() {
            return this.pattern_;
        }

        public boolean hasDomesticCarrierCodeFormattingRule() {
            return this.hasDomesticCarrierCodeFormattingRule;
        }

        public boolean hasFormat() {
            return this.hasFormat;
        }

        public boolean hasNationalPrefixFormattingRule() {
            return this.hasNationalPrefixFormattingRule;
        }

        public boolean hasNationalPrefixOptionalWhenFormatting() {
            return this.hasNationalPrefixOptionalWhenFormatting;
        }

        public boolean hasPattern() {
            return this.hasPattern;
        }

        public List<String> leadingDigitPatterns() {
            return this.leadingDigitsPattern_;
        }

        public static Builder newBuilder() {
            return new Builder();
        }

        public NumberFormat clearNationalPrefixFormattingRule() {
            this.hasNationalPrefixFormattingRule = false;
            this.nationalPrefixFormattingRule_ = "";
            return this;
        }

        public int leadingDigitsPatternSize() {
            return this.leadingDigitsPattern_.size();
        }

        public NumberFormat setDomesticCarrierCodeFormattingRule(String str) {
            this.hasDomesticCarrierCodeFormattingRule = true;
            this.domesticCarrierCodeFormattingRule_ = str;
            return this;
        }

        public NumberFormat setFormat(String str) {
            this.hasFormat = true;
            this.format_ = str;
            return this;
        }

        public NumberFormat setNationalPrefixFormattingRule(String str) {
            this.hasNationalPrefixFormattingRule = true;
            this.nationalPrefixFormattingRule_ = str;
            return this;
        }

        public NumberFormat setNationalPrefixOptionalWhenFormatting(boolean z) {
            this.hasNationalPrefixOptionalWhenFormatting = true;
            this.nationalPrefixOptionalWhenFormatting_ = z;
            return this;
        }

        public NumberFormat setPattern(String str) {
            this.hasPattern = true;
            this.pattern_ = str;
            return this;
        }

        public NumberFormat addLeadingDigitsPattern(String str) {
            Objects.requireNonNull(str);
            this.leadingDigitsPattern_.add(str);
            return this;
        }

        public String getLeadingDigitsPattern(int i2) {
            return this.leadingDigitsPattern_.get(i2);
        }

        public static final class Builder extends NumberFormat {
            static {
                Covode.recordClassIndex(34103);
            }

            public final NumberFormat build() {
                return this;
            }

            public final Builder mergeFrom(NumberFormat numberFormat) {
                if (numberFormat.hasPattern()) {
                    setPattern(numberFormat.getPattern());
                }
                if (numberFormat.hasFormat()) {
                    setFormat(numberFormat.getFormat());
                }
                for (int i2 = 0; i2 < numberFormat.leadingDigitsPatternSize(); i2++) {
                    addLeadingDigitsPattern(numberFormat.getLeadingDigitsPattern(i2));
                }
                if (numberFormat.hasNationalPrefixFormattingRule()) {
                    setNationalPrefixFormattingRule(numberFormat.getNationalPrefixFormattingRule());
                }
                if (numberFormat.hasDomesticCarrierCodeFormattingRule()) {
                    setDomesticCarrierCodeFormattingRule(numberFormat.getDomesticCarrierCodeFormattingRule());
                }
                if (numberFormat.hasNationalPrefixOptionalWhenFormatting()) {
                    setNationalPrefixOptionalWhenFormatting(numberFormat.getNationalPrefixOptionalWhenFormatting());
                }
                return this;
            }
        }

        @Override // java.io.Externalizable
        public void readExternal(ObjectInput objectInput) {
            setPattern(objectInput.readUTF());
            setFormat(objectInput.readUTF());
            int readInt = objectInput.readInt();
            for (int i2 = 0; i2 < readInt; i2++) {
                this.leadingDigitsPattern_.add(objectInput.readUTF());
            }
            if (objectInput.readBoolean()) {
                setNationalPrefixFormattingRule(objectInput.readUTF());
            }
            if (objectInput.readBoolean()) {
                setDomesticCarrierCodeFormattingRule(objectInput.readUTF());
            }
            setNationalPrefixOptionalWhenFormatting(objectInput.readBoolean());
        }

        @Override // java.io.Externalizable
        public void writeExternal(ObjectOutput objectOutput) {
            objectOutput.writeUTF(this.pattern_);
            objectOutput.writeUTF(this.format_);
            int leadingDigitsPatternSize = leadingDigitsPatternSize();
            objectOutput.writeInt(leadingDigitsPatternSize);
            for (int i2 = 0; i2 < leadingDigitsPatternSize; i2++) {
                objectOutput.writeUTF(this.leadingDigitsPattern_.get(i2));
            }
            objectOutput.writeBoolean(this.hasNationalPrefixFormattingRule);
            if (this.hasNationalPrefixFormattingRule) {
                objectOutput.writeUTF(this.nationalPrefixFormattingRule_);
            }
            objectOutput.writeBoolean(this.hasDomesticCarrierCodeFormattingRule);
            if (this.hasDomesticCarrierCodeFormattingRule) {
                objectOutput.writeUTF(this.domesticCarrierCodeFormattingRule_);
            }
            objectOutput.writeBoolean(this.nationalPrefixOptionalWhenFormatting_);
        }
    }

    public static class PhoneMetadata implements Externalizable {
        private static final long serialVersionUID = 1;
        private PhoneNumberDesc carrierSpecific_;
        private int countryCode_;
        private PhoneNumberDesc emergency_;
        private PhoneNumberDesc fixedLine_;
        private PhoneNumberDesc generalDesc_;
        private boolean hasCarrierSpecific;
        private boolean hasCountryCode;
        private boolean hasEmergency;
        private boolean hasFixedLine;
        private boolean hasGeneralDesc;
        private boolean hasId;
        private boolean hasInternationalPrefix;
        private boolean hasLeadingDigits;
        private boolean hasLeadingZeroPossible;
        private boolean hasMainCountryForCode;
        private boolean hasMobile;
        private boolean hasMobileNumberPortableRegion;
        private boolean hasNationalPrefix;
        private boolean hasNationalPrefixForParsing;
        private boolean hasNationalPrefixTransformRule;
        private boolean hasNoInternationalDialling;
        private boolean hasPager;
        private boolean hasPersonalNumber;
        private boolean hasPreferredExtnPrefix;
        private boolean hasPreferredInternationalPrefix;
        private boolean hasPremiumRate;
        private boolean hasSameMobileAndFixedLinePattern;
        private boolean hasSharedCost;
        private boolean hasShortCode;
        private boolean hasSmsServices;
        private boolean hasStandardRate;
        private boolean hasTollFree;
        private boolean hasUan;
        private boolean hasVoicemail;
        private boolean hasVoip;
        private String id_ = "";
        private String internationalPrefix_ = "";
        private List<NumberFormat> intlNumberFormat_ = new ArrayList();
        private String leadingDigits_ = "";
        private boolean leadingZeroPossible_ = false;
        private boolean mainCountryForCode_ = false;
        private boolean mobileNumberPortableRegion_ = false;
        private PhoneNumberDesc mobile_;
        private String nationalPrefixForParsing_ = "";
        private String nationalPrefixTransformRule_ = "";
        private String nationalPrefix_ = "";
        private PhoneNumberDesc noInternationalDialling_;
        private List<NumberFormat> numberFormat_ = new ArrayList();
        private PhoneNumberDesc pager_;
        private PhoneNumberDesc personalNumber_;
        private String preferredExtnPrefix_ = "";
        private String preferredInternationalPrefix_ = "";
        private PhoneNumberDesc premiumRate_;
        private boolean sameMobileAndFixedLinePattern_;
        private PhoneNumberDesc sharedCost_;
        private PhoneNumberDesc shortCode_;
        private PhoneNumberDesc smsServices_;
        private PhoneNumberDesc standardRate_;
        private PhoneNumberDesc tollFree_;
        private PhoneNumberDesc uan_;
        private PhoneNumberDesc voicemail_;
        private PhoneNumberDesc voip_;

        public static final class Builder extends PhoneMetadata {
            static {
                Covode.recordClassIndex(34105);
            }

            public final PhoneMetadata build() {
                return this;
            }
        }

        static {
            Covode.recordClassIndex(34104);
        }

        public PhoneNumberDesc getCarrierSpecific() {
            return this.carrierSpecific_;
        }

        public int getCountryCode() {
            return this.countryCode_;
        }

        public PhoneNumberDesc getEmergency() {
            return this.emergency_;
        }

        public PhoneNumberDesc getFixedLine() {
            return this.fixedLine_;
        }

        public PhoneNumberDesc getGeneralDesc() {
            return this.generalDesc_;
        }

        public String getId() {
            return this.id_;
        }

        public String getInternationalPrefix() {
            return this.internationalPrefix_;
        }

        public String getLeadingDigits() {
            return this.leadingDigits_;
        }

        public boolean getMainCountryForCode() {
            return this.mainCountryForCode_;
        }

        public PhoneNumberDesc getMobile() {
            return this.mobile_;
        }

        public String getNationalPrefix() {
            return this.nationalPrefix_;
        }

        public String getNationalPrefixForParsing() {
            return this.nationalPrefixForParsing_;
        }

        public String getNationalPrefixTransformRule() {
            return this.nationalPrefixTransformRule_;
        }

        public PhoneNumberDesc getNoInternationalDialling() {
            return this.noInternationalDialling_;
        }

        public PhoneNumberDesc getPager() {
            return this.pager_;
        }

        public PhoneNumberDesc getPersonalNumber() {
            return this.personalNumber_;
        }

        public String getPreferredExtnPrefix() {
            return this.preferredExtnPrefix_;
        }

        public String getPreferredInternationalPrefix() {
            return this.preferredInternationalPrefix_;
        }

        public PhoneNumberDesc getPremiumRate() {
            return this.premiumRate_;
        }

        public boolean getSameMobileAndFixedLinePattern() {
            return this.sameMobileAndFixedLinePattern_;
        }

        public PhoneNumberDesc getSharedCost() {
            return this.sharedCost_;
        }

        public PhoneNumberDesc getShortCode() {
            return this.shortCode_;
        }

        public PhoneNumberDesc getSmsServices() {
            return this.smsServices_;
        }

        public PhoneNumberDesc getStandardRate() {
            return this.standardRate_;
        }

        public PhoneNumberDesc getTollFree() {
            return this.tollFree_;
        }

        public PhoneNumberDesc getUan() {
            return this.uan_;
        }

        public PhoneNumberDesc getVoicemail() {
            return this.voicemail_;
        }

        public PhoneNumberDesc getVoip() {
            return this.voip_;
        }

        public boolean hasCarrierSpecific() {
            return this.hasCarrierSpecific;
        }

        public boolean hasCountryCode() {
            return this.hasCountryCode;
        }

        public boolean hasEmergency() {
            return this.hasEmergency;
        }

        public boolean hasFixedLine() {
            return this.hasFixedLine;
        }

        public boolean hasGeneralDesc() {
            return this.hasGeneralDesc;
        }

        public boolean hasId() {
            return this.hasId;
        }

        public boolean hasInternationalPrefix() {
            return this.hasInternationalPrefix;
        }

        public boolean hasLeadingDigits() {
            return this.hasLeadingDigits;
        }

        public boolean hasLeadingZeroPossible() {
            return this.hasLeadingZeroPossible;
        }

        public boolean hasMainCountryForCode() {
            return this.hasMainCountryForCode;
        }

        public boolean hasMobile() {
            return this.hasMobile;
        }

        public boolean hasMobileNumberPortableRegion() {
            return this.hasMobileNumberPortableRegion;
        }

        public boolean hasNationalPrefix() {
            return this.hasNationalPrefix;
        }

        public boolean hasNationalPrefixForParsing() {
            return this.hasNationalPrefixForParsing;
        }

        public boolean hasNationalPrefixTransformRule() {
            return this.hasNationalPrefixTransformRule;
        }

        public boolean hasNoInternationalDialling() {
            return this.hasNoInternationalDialling;
        }

        public boolean hasPager() {
            return this.hasPager;
        }

        public boolean hasPersonalNumber() {
            return this.hasPersonalNumber;
        }

        public boolean hasPreferredExtnPrefix() {
            return this.hasPreferredExtnPrefix;
        }

        public boolean hasPreferredInternationalPrefix() {
            return this.hasPreferredInternationalPrefix;
        }

        public boolean hasPremiumRate() {
            return this.hasPremiumRate;
        }

        public boolean hasSameMobileAndFixedLinePattern() {
            return this.hasSameMobileAndFixedLinePattern;
        }

        public boolean hasSharedCost() {
            return this.hasSharedCost;
        }

        public boolean hasShortCode() {
            return this.hasShortCode;
        }

        public boolean hasSmsServices() {
            return this.hasSmsServices;
        }

        public boolean hasStandardRate() {
            return this.hasStandardRate;
        }

        public boolean hasTollFree() {
            return this.hasTollFree;
        }

        public boolean hasUan() {
            return this.hasUan;
        }

        public boolean hasVoicemail() {
            return this.hasVoicemail;
        }

        public boolean hasVoip() {
            return this.hasVoip;
        }

        public List<NumberFormat> intlNumberFormats() {
            return this.intlNumberFormat_;
        }

        public boolean isLeadingZeroPossible() {
            return this.leadingZeroPossible_;
        }

        public boolean isMainCountryForCode() {
            return this.mainCountryForCode_;
        }

        public boolean isMobileNumberPortableRegion() {
            return this.mobileNumberPortableRegion_;
        }

        public List<NumberFormat> numberFormats() {
            return this.numberFormat_;
        }

        public static Builder newBuilder() {
            return new Builder();
        }

        public PhoneMetadata clearIntlNumberFormat() {
            this.intlNumberFormat_.clear();
            return this;
        }

        public PhoneMetadata clearLeadingZeroPossible() {
            this.hasLeadingZeroPossible = false;
            this.leadingZeroPossible_ = false;
            return this;
        }

        public PhoneMetadata clearMainCountryForCode() {
            this.hasMainCountryForCode = false;
            this.mainCountryForCode_ = false;
            return this;
        }

        public PhoneMetadata clearMobileNumberPortableRegion() {
            this.hasMobileNumberPortableRegion = false;
            this.mobileNumberPortableRegion_ = false;
            return this;
        }

        public PhoneMetadata clearNationalPrefix() {
            this.hasNationalPrefix = false;
            this.nationalPrefix_ = "";
            return this;
        }

        public PhoneMetadata clearNationalPrefixTransformRule() {
            this.hasNationalPrefixTransformRule = false;
            this.nationalPrefixTransformRule_ = "";
            return this;
        }

        public PhoneMetadata clearPreferredExtnPrefix() {
            this.hasPreferredExtnPrefix = false;
            this.preferredExtnPrefix_ = "";
            return this;
        }

        public PhoneMetadata clearPreferredInternationalPrefix() {
            this.hasPreferredInternationalPrefix = false;
            this.preferredInternationalPrefix_ = "";
            return this;
        }

        public PhoneMetadata clearSameMobileAndFixedLinePattern() {
            this.hasSameMobileAndFixedLinePattern = false;
            this.sameMobileAndFixedLinePattern_ = false;
            return this;
        }

        public int intlNumberFormatSize() {
            return this.intlNumberFormat_.size();
        }

        public int numberFormatSize() {
            return this.numberFormat_.size();
        }

        public PhoneMetadata setCountryCode(int i2) {
            this.hasCountryCode = true;
            this.countryCode_ = i2;
            return this;
        }

        public PhoneMetadata setId(String str) {
            this.hasId = true;
            this.id_ = str;
            return this;
        }

        public PhoneMetadata setInternationalPrefix(String str) {
            this.hasInternationalPrefix = true;
            this.internationalPrefix_ = str;
            return this;
        }

        public PhoneMetadata setLeadingDigits(String str) {
            this.hasLeadingDigits = true;
            this.leadingDigits_ = str;
            return this;
        }

        public PhoneMetadata setLeadingZeroPossible(boolean z) {
            this.hasLeadingZeroPossible = true;
            this.leadingZeroPossible_ = z;
            return this;
        }

        public PhoneMetadata setMainCountryForCode(boolean z) {
            this.hasMainCountryForCode = true;
            this.mainCountryForCode_ = z;
            return this;
        }

        public PhoneMetadata setMobileNumberPortableRegion(boolean z) {
            this.hasMobileNumberPortableRegion = true;
            this.mobileNumberPortableRegion_ = z;
            return this;
        }

        public PhoneMetadata setNationalPrefix(String str) {
            this.hasNationalPrefix = true;
            this.nationalPrefix_ = str;
            return this;
        }

        public PhoneMetadata setNationalPrefixForParsing(String str) {
            this.hasNationalPrefixForParsing = true;
            this.nationalPrefixForParsing_ = str;
            return this;
        }

        public PhoneMetadata setNationalPrefixTransformRule(String str) {
            this.hasNationalPrefixTransformRule = true;
            this.nationalPrefixTransformRule_ = str;
            return this;
        }

        public PhoneMetadata setPreferredExtnPrefix(String str) {
            this.hasPreferredExtnPrefix = true;
            this.preferredExtnPrefix_ = str;
            return this;
        }

        public PhoneMetadata setPreferredInternationalPrefix(String str) {
            this.hasPreferredInternationalPrefix = true;
            this.preferredInternationalPrefix_ = str;
            return this;
        }

        public PhoneMetadata setSameMobileAndFixedLinePattern(boolean z) {
            this.hasSameMobileAndFixedLinePattern = true;
            this.sameMobileAndFixedLinePattern_ = z;
            return this;
        }

        public PhoneMetadata addIntlNumberFormat(NumberFormat numberFormat) {
            Objects.requireNonNull(numberFormat);
            this.intlNumberFormat_.add(numberFormat);
            return this;
        }

        public PhoneMetadata addNumberFormat(NumberFormat numberFormat) {
            Objects.requireNonNull(numberFormat);
            this.numberFormat_.add(numberFormat);
            return this;
        }

        public NumberFormat getIntlNumberFormat(int i2) {
            return this.intlNumberFormat_.get(i2);
        }

        public NumberFormat getNumberFormat(int i2) {
            return this.numberFormat_.get(i2);
        }

        public PhoneMetadata setCarrierSpecific(PhoneNumberDesc phoneNumberDesc) {
            Objects.requireNonNull(phoneNumberDesc);
            this.hasCarrierSpecific = true;
            this.carrierSpecific_ = phoneNumberDesc;
            return this;
        }

        public PhoneMetadata setEmergency(PhoneNumberDesc phoneNumberDesc) {
            Objects.requireNonNull(phoneNumberDesc);
            this.hasEmergency = true;
            this.emergency_ = phoneNumberDesc;
            return this;
        }

        public PhoneMetadata setFixedLine(PhoneNumberDesc phoneNumberDesc) {
            Objects.requireNonNull(phoneNumberDesc);
            this.hasFixedLine = true;
            this.fixedLine_ = phoneNumberDesc;
            return this;
        }

        public PhoneMetadata setGeneralDesc(PhoneNumberDesc phoneNumberDesc) {
            Objects.requireNonNull(phoneNumberDesc);
            this.hasGeneralDesc = true;
            this.generalDesc_ = phoneNumberDesc;
            return this;
        }

        public PhoneMetadata setMobile(PhoneNumberDesc phoneNumberDesc) {
            Objects.requireNonNull(phoneNumberDesc);
            this.hasMobile = true;
            this.mobile_ = phoneNumberDesc;
            return this;
        }

        public PhoneMetadata setNoInternationalDialling(PhoneNumberDesc phoneNumberDesc) {
            Objects.requireNonNull(phoneNumberDesc);
            this.hasNoInternationalDialling = true;
            this.noInternationalDialling_ = phoneNumberDesc;
            return this;
        }

        public PhoneMetadata setPager(PhoneNumberDesc phoneNumberDesc) {
            Objects.requireNonNull(phoneNumberDesc);
            this.hasPager = true;
            this.pager_ = phoneNumberDesc;
            return this;
        }

        public PhoneMetadata setPersonalNumber(PhoneNumberDesc phoneNumberDesc) {
            Objects.requireNonNull(phoneNumberDesc);
            this.hasPersonalNumber = true;
            this.personalNumber_ = phoneNumberDesc;
            return this;
        }

        public PhoneMetadata setPremiumRate(PhoneNumberDesc phoneNumberDesc) {
            Objects.requireNonNull(phoneNumberDesc);
            this.hasPremiumRate = true;
            this.premiumRate_ = phoneNumberDesc;
            return this;
        }

        public PhoneMetadata setSharedCost(PhoneNumberDesc phoneNumberDesc) {
            Objects.requireNonNull(phoneNumberDesc);
            this.hasSharedCost = true;
            this.sharedCost_ = phoneNumberDesc;
            return this;
        }

        public PhoneMetadata setShortCode(PhoneNumberDesc phoneNumberDesc) {
            Objects.requireNonNull(phoneNumberDesc);
            this.hasShortCode = true;
            this.shortCode_ = phoneNumberDesc;
            return this;
        }

        public PhoneMetadata setSmsServices(PhoneNumberDesc phoneNumberDesc) {
            Objects.requireNonNull(phoneNumberDesc);
            this.hasSmsServices = true;
            this.smsServices_ = phoneNumberDesc;
            return this;
        }

        public PhoneMetadata setStandardRate(PhoneNumberDesc phoneNumberDesc) {
            Objects.requireNonNull(phoneNumberDesc);
            this.hasStandardRate = true;
            this.standardRate_ = phoneNumberDesc;
            return this;
        }

        public PhoneMetadata setTollFree(PhoneNumberDesc phoneNumberDesc) {
            Objects.requireNonNull(phoneNumberDesc);
            this.hasTollFree = true;
            this.tollFree_ = phoneNumberDesc;
            return this;
        }

        public PhoneMetadata setUan(PhoneNumberDesc phoneNumberDesc) {
            Objects.requireNonNull(phoneNumberDesc);
            this.hasUan = true;
            this.uan_ = phoneNumberDesc;
            return this;
        }

        public PhoneMetadata setVoicemail(PhoneNumberDesc phoneNumberDesc) {
            Objects.requireNonNull(phoneNumberDesc);
            this.hasVoicemail = true;
            this.voicemail_ = phoneNumberDesc;
            return this;
        }

        public PhoneMetadata setVoip(PhoneNumberDesc phoneNumberDesc) {
            Objects.requireNonNull(phoneNumberDesc);
            this.hasVoip = true;
            this.voip_ = phoneNumberDesc;
            return this;
        }

        @Override // java.io.Externalizable
        public void readExternal(ObjectInput objectInput) {
            if (objectInput.readBoolean()) {
                PhoneNumberDesc phoneNumberDesc = new PhoneNumberDesc();
                phoneNumberDesc.readExternal(objectInput);
                setGeneralDesc(phoneNumberDesc);
            }
            if (objectInput.readBoolean()) {
                PhoneNumberDesc phoneNumberDesc2 = new PhoneNumberDesc();
                phoneNumberDesc2.readExternal(objectInput);
                setFixedLine(phoneNumberDesc2);
            }
            if (objectInput.readBoolean()) {
                PhoneNumberDesc phoneNumberDesc3 = new PhoneNumberDesc();
                phoneNumberDesc3.readExternal(objectInput);
                setMobile(phoneNumberDesc3);
            }
            if (objectInput.readBoolean()) {
                PhoneNumberDesc phoneNumberDesc4 = new PhoneNumberDesc();
                phoneNumberDesc4.readExternal(objectInput);
                setTollFree(phoneNumberDesc4);
            }
            if (objectInput.readBoolean()) {
                PhoneNumberDesc phoneNumberDesc5 = new PhoneNumberDesc();
                phoneNumberDesc5.readExternal(objectInput);
                setPremiumRate(phoneNumberDesc5);
            }
            if (objectInput.readBoolean()) {
                PhoneNumberDesc phoneNumberDesc6 = new PhoneNumberDesc();
                phoneNumberDesc6.readExternal(objectInput);
                setSharedCost(phoneNumberDesc6);
            }
            if (objectInput.readBoolean()) {
                PhoneNumberDesc phoneNumberDesc7 = new PhoneNumberDesc();
                phoneNumberDesc7.readExternal(objectInput);
                setPersonalNumber(phoneNumberDesc7);
            }
            if (objectInput.readBoolean()) {
                PhoneNumberDesc phoneNumberDesc8 = new PhoneNumberDesc();
                phoneNumberDesc8.readExternal(objectInput);
                setVoip(phoneNumberDesc8);
            }
            if (objectInput.readBoolean()) {
                PhoneNumberDesc phoneNumberDesc9 = new PhoneNumberDesc();
                phoneNumberDesc9.readExternal(objectInput);
                setPager(phoneNumberDesc9);
            }
            if (objectInput.readBoolean()) {
                PhoneNumberDesc phoneNumberDesc10 = new PhoneNumberDesc();
                phoneNumberDesc10.readExternal(objectInput);
                setUan(phoneNumberDesc10);
            }
            if (objectInput.readBoolean()) {
                PhoneNumberDesc phoneNumberDesc11 = new PhoneNumberDesc();
                phoneNumberDesc11.readExternal(objectInput);
                setEmergency(phoneNumberDesc11);
            }
            if (objectInput.readBoolean()) {
                PhoneNumberDesc phoneNumberDesc12 = new PhoneNumberDesc();
                phoneNumberDesc12.readExternal(objectInput);
                setVoicemail(phoneNumberDesc12);
            }
            if (objectInput.readBoolean()) {
                PhoneNumberDesc phoneNumberDesc13 = new PhoneNumberDesc();
                phoneNumberDesc13.readExternal(objectInput);
                setShortCode(phoneNumberDesc13);
            }
            if (objectInput.readBoolean()) {
                PhoneNumberDesc phoneNumberDesc14 = new PhoneNumberDesc();
                phoneNumberDesc14.readExternal(objectInput);
                setStandardRate(phoneNumberDesc14);
            }
            if (objectInput.readBoolean()) {
                PhoneNumberDesc phoneNumberDesc15 = new PhoneNumberDesc();
                phoneNumberDesc15.readExternal(objectInput);
                setCarrierSpecific(phoneNumberDesc15);
            }
            if (objectInput.readBoolean()) {
                PhoneNumberDesc phoneNumberDesc16 = new PhoneNumberDesc();
                phoneNumberDesc16.readExternal(objectInput);
                setSmsServices(phoneNumberDesc16);
            }
            if (objectInput.readBoolean()) {
                PhoneNumberDesc phoneNumberDesc17 = new PhoneNumberDesc();
                phoneNumberDesc17.readExternal(objectInput);
                setNoInternationalDialling(phoneNumberDesc17);
            }
            setId(objectInput.readUTF());
            setCountryCode(objectInput.readInt());
            setInternationalPrefix(objectInput.readUTF());
            if (objectInput.readBoolean()) {
                setPreferredInternationalPrefix(objectInput.readUTF());
            }
            if (objectInput.readBoolean()) {
                setNationalPrefix(objectInput.readUTF());
            }
            if (objectInput.readBoolean()) {
                setPreferredExtnPrefix(objectInput.readUTF());
            }
            if (objectInput.readBoolean()) {
                setNationalPrefixForParsing(objectInput.readUTF());
            }
            if (objectInput.readBoolean()) {
                setNationalPrefixTransformRule(objectInput.readUTF());
            }
            setSameMobileAndFixedLinePattern(objectInput.readBoolean());
            int readInt = objectInput.readInt();
            for (int i2 = 0; i2 < readInt; i2++) {
                NumberFormat numberFormat = new NumberFormat();
                numberFormat.readExternal(objectInput);
                this.numberFormat_.add(numberFormat);
            }
            int readInt2 = objectInput.readInt();
            for (int i3 = 0; i3 < readInt2; i3++) {
                NumberFormat numberFormat2 = new NumberFormat();
                numberFormat2.readExternal(objectInput);
                this.intlNumberFormat_.add(numberFormat2);
            }
            setMainCountryForCode(objectInput.readBoolean());
            if (objectInput.readBoolean()) {
                setLeadingDigits(objectInput.readUTF());
            }
            setLeadingZeroPossible(objectInput.readBoolean());
            setMobileNumberPortableRegion(objectInput.readBoolean());
        }

        @Override // java.io.Externalizable
        public void writeExternal(ObjectOutput objectOutput) {
            objectOutput.writeBoolean(this.hasGeneralDesc);
            if (this.hasGeneralDesc) {
                this.generalDesc_.writeExternal(objectOutput);
            }
            objectOutput.writeBoolean(this.hasFixedLine);
            if (this.hasFixedLine) {
                this.fixedLine_.writeExternal(objectOutput);
            }
            objectOutput.writeBoolean(this.hasMobile);
            if (this.hasMobile) {
                this.mobile_.writeExternal(objectOutput);
            }
            objectOutput.writeBoolean(this.hasTollFree);
            if (this.hasTollFree) {
                this.tollFree_.writeExternal(objectOutput);
            }
            objectOutput.writeBoolean(this.hasPremiumRate);
            if (this.hasPremiumRate) {
                this.premiumRate_.writeExternal(objectOutput);
            }
            objectOutput.writeBoolean(this.hasSharedCost);
            if (this.hasSharedCost) {
                this.sharedCost_.writeExternal(objectOutput);
            }
            objectOutput.writeBoolean(this.hasPersonalNumber);
            if (this.hasPersonalNumber) {
                this.personalNumber_.writeExternal(objectOutput);
            }
            objectOutput.writeBoolean(this.hasVoip);
            if (this.hasVoip) {
                this.voip_.writeExternal(objectOutput);
            }
            objectOutput.writeBoolean(this.hasPager);
            if (this.hasPager) {
                this.pager_.writeExternal(objectOutput);
            }
            objectOutput.writeBoolean(this.hasUan);
            if (this.hasUan) {
                this.uan_.writeExternal(objectOutput);
            }
            objectOutput.writeBoolean(this.hasEmergency);
            if (this.hasEmergency) {
                this.emergency_.writeExternal(objectOutput);
            }
            objectOutput.writeBoolean(this.hasVoicemail);
            if (this.hasVoicemail) {
                this.voicemail_.writeExternal(objectOutput);
            }
            objectOutput.writeBoolean(this.hasShortCode);
            if (this.hasShortCode) {
                this.shortCode_.writeExternal(objectOutput);
            }
            objectOutput.writeBoolean(this.hasStandardRate);
            if (this.hasStandardRate) {
                this.standardRate_.writeExternal(objectOutput);
            }
            objectOutput.writeBoolean(this.hasCarrierSpecific);
            if (this.hasCarrierSpecific) {
                this.carrierSpecific_.writeExternal(objectOutput);
            }
            objectOutput.writeBoolean(this.hasSmsServices);
            if (this.hasSmsServices) {
                this.smsServices_.writeExternal(objectOutput);
            }
            objectOutput.writeBoolean(this.hasNoInternationalDialling);
            if (this.hasNoInternationalDialling) {
                this.noInternationalDialling_.writeExternal(objectOutput);
            }
            objectOutput.writeUTF(this.id_);
            objectOutput.writeInt(this.countryCode_);
            objectOutput.writeUTF(this.internationalPrefix_);
            objectOutput.writeBoolean(this.hasPreferredInternationalPrefix);
            if (this.hasPreferredInternationalPrefix) {
                objectOutput.writeUTF(this.preferredInternationalPrefix_);
            }
            objectOutput.writeBoolean(this.hasNationalPrefix);
            if (this.hasNationalPrefix) {
                objectOutput.writeUTF(this.nationalPrefix_);
            }
            objectOutput.writeBoolean(this.hasPreferredExtnPrefix);
            if (this.hasPreferredExtnPrefix) {
                objectOutput.writeUTF(this.preferredExtnPrefix_);
            }
            objectOutput.writeBoolean(this.hasNationalPrefixForParsing);
            if (this.hasNationalPrefixForParsing) {
                objectOutput.writeUTF(this.nationalPrefixForParsing_);
            }
            objectOutput.writeBoolean(this.hasNationalPrefixTransformRule);
            if (this.hasNationalPrefixTransformRule) {
                objectOutput.writeUTF(this.nationalPrefixTransformRule_);
            }
            objectOutput.writeBoolean(this.sameMobileAndFixedLinePattern_);
            int numberFormatSize = numberFormatSize();
            objectOutput.writeInt(numberFormatSize);
            for (int i2 = 0; i2 < numberFormatSize; i2++) {
                this.numberFormat_.get(i2).writeExternal(objectOutput);
            }
            int intlNumberFormatSize = intlNumberFormatSize();
            objectOutput.writeInt(intlNumberFormatSize);
            for (int i3 = 0; i3 < intlNumberFormatSize; i3++) {
                this.intlNumberFormat_.get(i3).writeExternal(objectOutput);
            }
            objectOutput.writeBoolean(this.mainCountryForCode_);
            objectOutput.writeBoolean(this.hasLeadingDigits);
            if (this.hasLeadingDigits) {
                objectOutput.writeUTF(this.leadingDigits_);
            }
            objectOutput.writeBoolean(this.leadingZeroPossible_);
            objectOutput.writeBoolean(this.mobileNumberPortableRegion_);
        }
    }

    public static class PhoneMetadataCollection implements Externalizable {
        private static final long serialVersionUID = 1;
        private List<PhoneMetadata> metadata_ = new ArrayList();

        public static final class Builder extends PhoneMetadataCollection {
            static {
                Covode.recordClassIndex(34107);
            }

            public final PhoneMetadataCollection build() {
                return this;
            }
        }

        static {
            Covode.recordClassIndex(34106);
        }

        public List<PhoneMetadata> getMetadataList() {
            return this.metadata_;
        }

        public static Builder newBuilder() {
            return new Builder();
        }

        public PhoneMetadataCollection clear() {
            this.metadata_.clear();
            return this;
        }

        public int getMetadataCount() {
            return this.metadata_.size();
        }

        public PhoneMetadataCollection addMetadata(PhoneMetadata phoneMetadata) {
            Objects.requireNonNull(phoneMetadata);
            this.metadata_.add(phoneMetadata);
            return this;
        }

        @Override // java.io.Externalizable
        public void readExternal(ObjectInput objectInput) {
            int readInt = objectInput.readInt();
            for (int i2 = 0; i2 < readInt; i2++) {
                PhoneMetadata phoneMetadata = new PhoneMetadata();
                phoneMetadata.readExternal(objectInput);
                this.metadata_.add(phoneMetadata);
            }
        }

        @Override // java.io.Externalizable
        public void writeExternal(ObjectOutput objectOutput) {
            int metadataCount = getMetadataCount();
            objectOutput.writeInt(metadataCount);
            for (int i2 = 0; i2 < metadataCount; i2++) {
                this.metadata_.get(i2).writeExternal(objectOutput);
            }
        }
    }

    public static class PhoneNumberDesc implements Externalizable {
        private static final long serialVersionUID = 1;
        private String exampleNumber_ = "";
        private boolean hasExampleNumber;
        private boolean hasNationalNumberPattern;
        private String nationalNumberPattern_ = "";
        private List<Integer> possibleLengthLocalOnly_ = new ArrayList();
        private List<Integer> possibleLength_ = new ArrayList();

        static {
            Covode.recordClassIndex(34108);
        }

        public String getExampleNumber() {
            return this.exampleNumber_;
        }

        public String getNationalNumberPattern() {
            return this.nationalNumberPattern_;
        }

        public List<Integer> getPossibleLengthList() {
            return this.possibleLength_;
        }

        public List<Integer> getPossibleLengthLocalOnlyList() {
            return this.possibleLengthLocalOnly_;
        }

        public boolean hasExampleNumber() {
            return this.hasExampleNumber;
        }

        public boolean hasNationalNumberPattern() {
            return this.hasNationalNumberPattern;
        }

        public static Builder newBuilder() {
            return new Builder();
        }

        public PhoneNumberDesc clearExampleNumber() {
            this.hasExampleNumber = false;
            this.exampleNumber_ = "";
            return this;
        }

        public PhoneNumberDesc clearNationalNumberPattern() {
            this.hasNationalNumberPattern = false;
            this.nationalNumberPattern_ = "";
            return this;
        }

        public PhoneNumberDesc clearPossibleLength() {
            this.possibleLength_.clear();
            return this;
        }

        public PhoneNumberDesc clearPossibleLengthLocalOnly() {
            this.possibleLengthLocalOnly_.clear();
            return this;
        }

        public int getPossibleLengthCount() {
            return this.possibleLength_.size();
        }

        public int getPossibleLengthLocalOnlyCount() {
            return this.possibleLengthLocalOnly_.size();
        }

        public PhoneNumberDesc setExampleNumber(String str) {
            this.hasExampleNumber = true;
            this.exampleNumber_ = str;
            return this;
        }

        public PhoneNumberDesc setNationalNumberPattern(String str) {
            this.hasNationalNumberPattern = true;
            this.nationalNumberPattern_ = str;
            return this;
        }

        public PhoneNumberDesc addPossibleLength(int i2) {
            this.possibleLength_.add(Integer.valueOf(i2));
            return this;
        }

        public PhoneNumberDesc addPossibleLengthLocalOnly(int i2) {
            this.possibleLengthLocalOnly_.add(Integer.valueOf(i2));
            return this;
        }

        public int getPossibleLength(int i2) {
            return this.possibleLength_.get(i2).intValue();
        }

        public int getPossibleLengthLocalOnly(int i2) {
            return this.possibleLengthLocalOnly_.get(i2).intValue();
        }

        public static final class Builder extends PhoneNumberDesc {
            static {
                Covode.recordClassIndex(34109);
            }

            public final PhoneNumberDesc build() {
                return this;
            }

            public final Builder mergeFrom(PhoneNumberDesc phoneNumberDesc) {
                if (phoneNumberDesc.hasNationalNumberPattern()) {
                    setNationalNumberPattern(phoneNumberDesc.getNationalNumberPattern());
                }
                for (int i2 = 0; i2 < phoneNumberDesc.getPossibleLengthCount(); i2++) {
                    addPossibleLength(phoneNumberDesc.getPossibleLength(i2));
                }
                for (int i3 = 0; i3 < phoneNumberDesc.getPossibleLengthLocalOnlyCount(); i3++) {
                    addPossibleLengthLocalOnly(phoneNumberDesc.getPossibleLengthLocalOnly(i3));
                }
                if (phoneNumberDesc.hasExampleNumber()) {
                    setExampleNumber(phoneNumberDesc.getExampleNumber());
                }
                return this;
            }
        }

        public boolean exactlySameAs(PhoneNumberDesc phoneNumberDesc) {
            if (!this.nationalNumberPattern_.equals(phoneNumberDesc.nationalNumberPattern_) || !this.possibleLength_.equals(phoneNumberDesc.possibleLength_) || !this.possibleLengthLocalOnly_.equals(phoneNumberDesc.possibleLengthLocalOnly_) || !this.exampleNumber_.equals(phoneNumberDesc.exampleNumber_)) {
                return false;
            }
            return true;
        }

        @Override // java.io.Externalizable
        public void readExternal(ObjectInput objectInput) {
            if (objectInput.readBoolean()) {
                setNationalNumberPattern(objectInput.readUTF());
            }
            int readInt = objectInput.readInt();
            for (int i2 = 0; i2 < readInt; i2++) {
                this.possibleLength_.add(Integer.valueOf(objectInput.readInt()));
            }
            int readInt2 = objectInput.readInt();
            for (int i3 = 0; i3 < readInt2; i3++) {
                this.possibleLengthLocalOnly_.add(Integer.valueOf(objectInput.readInt()));
            }
            if (objectInput.readBoolean()) {
                setExampleNumber(objectInput.readUTF());
            }
        }

        @Override // java.io.Externalizable
        public void writeExternal(ObjectOutput objectOutput) {
            objectOutput.writeBoolean(this.hasNationalNumberPattern);
            if (this.hasNationalNumberPattern) {
                objectOutput.writeUTF(this.nationalNumberPattern_);
            }
            int possibleLengthCount = getPossibleLengthCount();
            objectOutput.writeInt(possibleLengthCount);
            for (int i2 = 0; i2 < possibleLengthCount; i2++) {
                objectOutput.writeInt(this.possibleLength_.get(i2).intValue());
            }
            int possibleLengthLocalOnlyCount = getPossibleLengthLocalOnlyCount();
            objectOutput.writeInt(possibleLengthLocalOnlyCount);
            for (int i3 = 0; i3 < possibleLengthLocalOnlyCount; i3++) {
                objectOutput.writeInt(this.possibleLengthLocalOnly_.get(i3).intValue());
            }
            objectOutput.writeBoolean(this.hasExampleNumber);
            if (this.hasExampleNumber) {
                objectOutput.writeUTF(this.exampleNumber_);
            }
        }
    }

    private Phonemetadata() {
    }
}
