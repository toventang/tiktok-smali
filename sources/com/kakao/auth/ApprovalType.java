package com.kakao.auth;

import com.bytedance.covode.number.Covode;
import java.security.InvalidParameterException;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Locale;
import java.util.Map;

public enum ApprovalType {
    INDIVIDUAL,
    PROJECT;
    
    private static final Map<String, ApprovalType> REVERSE_MAP = new HashMap();

    public final String toString() {
        return super.toString().toLowerCase(Locale.ROOT);
    }

    static {
        Covode.recordClassIndex(34227);
        ApprovalType[] values = values();
        for (ApprovalType approvalType : values) {
            REVERSE_MAP.put(approvalType.toString(), approvalType);
        }
    }

    public static ApprovalType getApprovalTypeByString(String str) {
        if (str == null) {
            return null;
        }
        ApprovalType approvalType = REVERSE_MAP.get(str);
        if (approvalType != null) {
            return approvalType;
        }
        throw new InvalidParameterException("ApprovalType is one of " + Arrays.toString(values()));
    }
}
