package com.bytedance.lobby;

import android.text.TextUtils;
import com.bytedance.covode.number.Covode;

public final class c extends Exception {
    private int mErrorCode;
    private String mErrorMessage;
    private String mErrorStage;
    private boolean mIsCancelled;
    private boolean mIsFromLobby;
    private int mProviderErrorCode;

    static {
        Covode.recordClassIndex(24760);
    }

    public final int getErrorCode() {
        return this.mErrorCode;
    }

    public final String getErrorStage() {
        return this.mErrorStage;
    }

    public final int getProviderErrorCode() {
        return this.mProviderErrorCode;
    }

    public final boolean isCancelled() {
        return this.mIsCancelled;
    }

    public final boolean isFromLobby() {
        return this.mIsFromLobby;
    }

    public final String getMessage() {
        if (getCause() != null) {
            return super.getMessage();
        }
        return this.mErrorMessage;
    }

    public final String toString() {
        if (getCause() != null) {
            return super.toString();
        }
        return "LobbyException{code: " + getErrorCode() + ", providerCode: " + getProviderErrorCode() + ", message: " + getMessage() + ", cancelled: " + isCancelled() + ", fromLobby: " + isFromLobby() + "}";
    }

    public final c setCancelled(boolean z) {
        this.mIsCancelled = z;
        return this;
    }

    public c(Exception exc) {
        super(exc);
        this.mErrorCode = -999;
    }

    public c(int i2, String str) {
        this(i2, 0, str, "");
    }

    public c(int i2, int i3, String str) {
        this(i2, i3, str, "");
    }

    public c(int i2, String str, String str2) {
        this(i2, 0, str, str2);
    }

    public c(int i2, int i3, String str, String str2) {
        this.mErrorCode = -999;
        this.mErrorCode = i2;
        this.mProviderErrorCode = i3;
        this.mErrorMessage = TextUtils.isEmpty(str) ? "" : str;
        this.mIsFromLobby = true;
        this.mErrorStage = str2;
        if (i2 == 4) {
            setCancelled(true);
        }
    }
}
