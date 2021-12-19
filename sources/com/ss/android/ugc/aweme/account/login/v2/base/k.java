package com.ss.android.ugc.aweme.account.login.v2.base;

import com.bytedance.covode.number.Covode;
import h.a.ag;
import h.j.h;
import java.util.LinkedHashMap;
import java.util.Map;

public enum k {
    FINISH(-2),
    NONE(-1),
    AGE_GATE(0),
    FTC_CREATE_ACCOUNT(1),
    PHONE_EMAIL_SIGN_UP(2),
    PHONE_SMS_SIGN_UP(3),
    CREATE_PASSWORD_FOR_PHONE(4),
    CREATE_USERNAME(5),
    PHONE_EMAIL_LOGIN(6),
    PHONE_SMS_LOGIN(7),
    PHONE_PASSWORD_LOGIN(8),
    INPUT_PHONE_FIND_PASSWORD(9),
    INPUT_EMAIL_FIND_PASSWORD(10),
    PHONE_SMS_FIND_PASSWORD(11),
    EMAIL_SMS_FIND_PASSWORD(12),
    RESET_PASSWORD_FOR_EMAIL(13),
    CREATE_PASSWORD_FOR_EMAIL(14),
    THIRD_PARTY_FTC_AGE_GATE(15),
    THIRD_PARTY_AGE_GATE(16),
    EMAIL_PASSWORD_LOGIN(17),
    INPUT_PHONE_SIGN_UP(18),
    INPUT_EMAIL_SIGN_UP(19),
    INPUT_PHONE_LOGIN(20),
    INPUT_EMAIL_LOGIN(21),
    RESET_PASSWORD_FOR_PHONE(22),
    AGE_GATE_LOGIN(23),
    AGE_GATE_SIGN_UP(24),
    EMAIL_SMS_SIGN_UP(25),
    INPUT_PHONE_BIND(26),
    PHONE_SMS_BIND(27),
    PHONE_SMS_VERIFY(28),
    INPUT_PHONE_MODIFY(29),
    PHONE_SMS_MODIFY(30),
    PHONE_EMAIL_USERNAME_RECOVER(31),
    RECOVER_VERIFY_EMAIL_PHONE_THIRD_PARTY(32),
    RECOVER_PHONE_LOGIN(33),
    RECOVER_EMAIL_LOGIN(34),
    RECOVER_PHONE_SEND_CODE(35),
    PHONE_SMS_CHANGE_PASSWORD(37),
    EMAIL_SMS_CHANGE_PASSWORD(38),
    CHANGE_PASSWORD(39),
    EMAIL_SMS_BIND(40),
    INPUT_EMAIL_BIND(41),
    CONFIRM_EMAIL_BEFORE_VERIFY(42),
    EMAIL_SMS_VERIFY(43),
    INPUT_EMAIL_CHANGE(44),
    EMAIL_SMS_CHANGE(45),
    VERIFY_EMAIL_BEFORE_CHANGE(46),
    VERIFY_PHONE(47),
    TERMS_CONSENT_SIGN_UP(48),
    TERMS_CONSENT_NEW_PHONE_USER(49),
    TERMS_CONSENT_SIGN_UP_THIRD_PARTY(50),
    ONE_KEY_LOGIN(51),
    FTC_CREATE_PASSWORD(52),
    DELETE_VIDEO_ALERT(53),
    CHANGE_PASSWORD_FOR_CHILDREN(54),
    TWO_STEP_PHONE_VERIFY_EMAIL_CODE_2SV(55),
    TWO_STEP_EMAIL_PASSWORD_VERIFY_SMS_2SV(56),
    VERIFY_EMAIL_FOR_TICKET(57),
    VERIFY_PHONE_FOR_TICKET(58),
    QRCODE_LOGIN(59),
    PRIVATE_ACCOUNT_TIPS(60),
    VERIFY_PASSWORD(61),
    TWO_STEP_PHONE_VERIFY_PASSWORD_2SV(62),
    TWO_STEP_EMAIL_PASSWORD_VERIFY_EMAIL_CODE_2SV(64),
    PUSH_VERIFY(65),
    EDIT_DOB_AGE_GATE(66),
    UNBIND_PHONE_CONFIRM(67),
    UNBIND_EMAIL_CONFIRM(68),
    UNBIND_PHONE_VERIFY(69),
    UNBIND_EMAIL_VERIFY_USING_EMAIL(70),
    UNBIND_EMAIL_VERIFY_USING_PHONE(71),
    EMAIL_VERIFICATION_WHEN_SIGN_UP(72);
    
    public static final a Companion = new a((byte) 0);
    public static final Map<Integer, k> MAP;
    private final int value;

    public static final class a {
        static {
            Covode.recordClassIndex(39793);
        }

        private a() {
        }

        public /* synthetic */ a(byte b2) {
            this();
        }

        public static k a(int i2) {
            k kVar = k.MAP.get(Integer.valueOf(i2));
            if (kVar == null) {
                return k.PHONE_SMS_LOGIN;
            }
            return kVar;
        }
    }

    public final int getValue() {
        return this.value;
    }

    static {
        Covode.recordClassIndex(39792);
        k[] values = values();
        LinkedHashMap linkedHashMap = new LinkedHashMap(h.b(ag.a(values.length), 16));
        for (k kVar : values) {
            linkedHashMap.put(Integer.valueOf(kVar.value), kVar);
        }
        MAP = linkedHashMap;
    }

    private k(int i2) {
        this.value = i2;
    }
}
