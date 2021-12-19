package com.kakao.auth.authorization;

import android.net.Uri;
import com.bytedance.covode.number.Covode;
import com.kakao.auth.authorization.accesstoken.AccessToken;

public class AuthorizationResult {
    private AccessToken accessToken;
    private Exception exception;
    private String redirectURL;
    private final RESULT_CODE resultCode;
    private String resultMessage;

    static {
        Covode.recordClassIndex(34269);
    }

    public AccessToken getAccessToken() {
        return this.accessToken;
    }

    public Exception getException() {
        return this.exception;
    }

    public String getRedirectURL() {
        return this.redirectURL;
    }

    public String getResultMessage() {
        return this.resultMessage;
    }

    public static AuthorizationResult createAuthCodePassResult() {
        return new AuthorizationResult(RESULT_CODE.PASS);
    }

    public Uri getRedirectUri() {
        String str = this.redirectURL;
        if (str == null) {
            return null;
        }
        return Uri.parse(str);
    }

    public boolean isAuthError() {
        if (this.resultCode == RESULT_CODE.OAUTH_ERROR) {
            return true;
        }
        return false;
    }

    public boolean isCanceled() {
        if (this.resultCode == RESULT_CODE.CANCEL) {
            return true;
        }
        return false;
    }

    public boolean isError() {
        if (this.resultCode == RESULT_CODE.ERROR) {
            return true;
        }
        return false;
    }

    public boolean isPass() {
        if (this.resultCode == RESULT_CODE.PASS) {
            return true;
        }
        return false;
    }

    public boolean isSuccess() {
        if (this.resultCode == RESULT_CODE.SUCCESS) {
            return true;
        }
        return false;
    }

    public enum RESULT_CODE {
        SUCCESS,
        CANCEL,
        PASS,
        OAUTH_ERROR,
        ERROR;

        static {
            Covode.recordClassIndex(34270);
        }
    }

    private AuthorizationResult setAccessToken(AccessToken accessToken2) {
        this.accessToken = accessToken2;
        return this;
    }

    private AuthorizationResult setRedirectURL(String str) {
        this.redirectURL = str;
        return this;
    }

    private AuthorizationResult setResultMessage(String str) {
        this.resultMessage = str;
        return this;
    }

    private AuthorizationResult(RESULT_CODE result_code) {
        this.resultCode = result_code;
    }

    public static AuthorizationResult createAuthCodeCancelResult(String str) {
        return new AuthorizationResult(RESULT_CODE.CANCEL).setResultMessage(str);
    }

    public static AuthorizationResult createAuthCodeOAuthErrorResult(Exception exc) {
        return new AuthorizationResult(RESULT_CODE.OAUTH_ERROR, exc).setResultMessage(exc.getMessage());
    }

    public static AuthorizationResult createSuccessAuthCodeResult(String str) {
        return new AuthorizationResult(RESULT_CODE.SUCCESS).setRedirectURL(str);
    }

    public static AuthorizationResult createAuthCodeOAuthErrorResult(String str) {
        return new AuthorizationResult(RESULT_CODE.OAUTH_ERROR).setResultMessage(str);
    }

    private AuthorizationResult(RESULT_CODE result_code, Exception exc) {
        this.resultCode = result_code;
        this.exception = exc;
    }
}
