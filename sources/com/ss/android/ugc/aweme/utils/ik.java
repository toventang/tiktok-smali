package com.ss.android.ugc.aweme.utils;

import android.text.TextUtils;
import com.bytedance.covode.number.Covode;
import com.google.i18n.phonenumbers.NumberParseException;
import com.google.i18n.phonenumbers.PhoneNumberUtil;
import com.google.i18n.phonenumbers.Phonenumber;

public final class ik {

    /* renamed from: a  reason: collision with root package name */
    public static final ik f143102a = new ik();

    private ik() {
    }

    static {
        Covode.recordClassIndex(93672);
    }

    public static Phonenumber.PhoneNumber b(String str) {
        if (TextUtils.isEmpty(str)) {
            return null;
        }
        try {
            return PhoneNumberUtil.getInstance().parse(str, null);
        } catch (NumberParseException e2) {
            e2.printStackTrace();
            return null;
        }
    }

    public static final String a(String str) {
        if (!TextUtils.isEmpty(str)) {
            try {
                Phonenumber.PhoneNumber parse = PhoneNumberUtil.getInstance().parse(str, null);
                if (parse != null) {
                    return String.valueOf(parse.getNationalNumber());
                }
            } catch (NumberParseException e2) {
                e2.printStackTrace();
            }
            if (str == null) {
                return "";
            }
            return str;
        } else if (str == null) {
            return "";
        } else {
            return str;
        }
    }
}
