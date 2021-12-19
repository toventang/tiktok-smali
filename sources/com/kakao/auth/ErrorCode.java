package com.kakao.auth;

import android.util.SparseArray;
import com.bytedance.covode.number.Covode;

public enum ErrorCode {
    AUTH_ERROR_CODE(-776),
    CLIENT_ERROR_CODE(-777),
    UNDEFINED_ERROR_CODE(-888),
    INTERNAL_ERROR_CODE(-1),
    INVALID_PARAM_CODE(-2),
    NOT_SUPPORTED_API_CODE(-3),
    BLOCKED_ACTION_CODE(-4),
    ACCESS_DENIED_CODE(-5),
    DEPRECATED_API(-9),
    EXCEED_LIMIT_CODE(-10),
    NOT_REGISTERED_USER_CODE(-101),
    ALREADY_REGISTERED_USER_CODE(-102),
    NOT_EXIST_KAKAO_ACCOUNT_CODE(-103),
    NOT_REGISTERED_PROPERTY_KEY_CODE(-201),
    NOT_EXIST_APP_CODE(-301),
    NOT_EXIST_APP_CATEGORY_CODE(-302),
    INVALID_TOKEN_CODE(-401),
    INVALID_SCOPE_CODE(-402),
    NOT_REGISTERED_ORIGIN_CODE(-403),
    NEED_TO_AGE_AUTHENTICATION(-405),
    UNDER_AGE_LIMIT(-406),
    NOT_EXIST_KAKAOTALK_USER_CODE(-501),
    NOT_SUPPORTED_OS(-504),
    MSG_DISABLED(-530),
    MSG_SENDER_RECEIVER_MONTHLY(-531),
    MSG_SENDER_DAILY(-532),
    NOT_EXIST_KAKAOSTORY_USER_CODE(-601),
    EXCEED_MAX_UPLOAD_SIZE(-602),
    EXECUTION_TIMED_OUT(-603),
    INVALID_STORY_SCRAP_URL(-604),
    INVALID_STORY_ACTIVITY_ID(-605),
    EXCEED_MAX_UPLOAD_NUMBER(-606),
    NOT_EXIST_DEVELOPER_CODE(-701),
    NOT_EXIST_PUSH_TOKEN(-901),
    DEVELOPER_NOT_EXISTENT_CODE(-903),
    INVALID_FRIENDS_RESULT_ID(-904),
    KAKAO_MAINTENANCE_CODE(-9798);
    
    private static final SparseArray<ErrorCode> reverseMap = new SparseArray<>();
    private final int errorCode;

    public final int getErrorCode() {
        return this.errorCode;
    }

    static {
        Covode.recordClassIndex(34237);
        ErrorCode[] values = values();
        for (ErrorCode errorCode2 : values) {
            reverseMap.put(errorCode2.getErrorCode(), errorCode2);
        }
    }

    public static ErrorCode valueOf(Integer num) {
        if (num == null) {
            return null;
        }
        ErrorCode errorCode2 = reverseMap.get(num.intValue());
        if (errorCode2 != null) {
            return errorCode2;
        }
        return UNDEFINED_ERROR_CODE;
    }

    private ErrorCode(int i2) {
        this.errorCode = i2;
    }
}
