package com.google.i18n.phonenumbers.internal;

import com.bytedance.covode.number.Covode;
import com.google.i18n.phonenumbers.Phonemetadata;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public final class RegexBasedMatcher implements MatcherApi {
    private final RegexCache regexCache = new RegexCache(100);

    static {
        Covode.recordClassIndex(34119);
    }

    public static MatcherApi create() {
        return new RegexBasedMatcher();
    }

    private RegexBasedMatcher() {
    }

    private static boolean match(CharSequence charSequence, Pattern pattern, boolean z) {
        Matcher matcher = pattern.matcher(charSequence);
        if (!matcher.lookingAt()) {
            return false;
        }
        if (matcher.matches()) {
            return true;
        }
        return z;
    }

    @Override // com.google.i18n.phonenumbers.internal.MatcherApi
    public final boolean matchNationalNumber(CharSequence charSequence, Phonemetadata.PhoneNumberDesc phoneNumberDesc, boolean z) {
        String nationalNumberPattern = phoneNumberDesc.getNationalNumberPattern();
        if (nationalNumberPattern.length() == 0) {
            return false;
        }
        return match(charSequence, this.regexCache.getPatternForRegex(nationalNumberPattern), z);
    }
}
