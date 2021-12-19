package com.ss.android.socialbase.downloader.exception;

import android.os.Parcel;
import android.os.Parcelable;
import com.bytedance.covode.number.Covode;
import com.ss.android.socialbase.downloader.k.g;

public class BaseException extends Exception implements Parcelable {
    public static final Parcelable.Creator<BaseException> CREATOR = new Parcelable.Creator<BaseException>() {
        /* class com.ss.android.socialbase.downloader.exception.BaseException.AnonymousClass1 */

        static {
            Covode.recordClassIndex(37377);
        }

        /* Return type fixed from 'java.lang.Object[]' to match base method */
        @Override // android.os.Parcelable.Creator
        public final /* bridge */ /* synthetic */ BaseException[] newArray(int i2) {
            return new BaseException[i2];
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        @Override // android.os.Parcelable.Creator
        public final /* synthetic */ BaseException createFromParcel(Parcel parcel) {
            return new BaseException(parcel);
        }
    };
    private int errorCode;
    private String errorMsg;
    private String extraInfo;

    public int describeContents() {
        return 0;
    }

    public int getErrorCode() {
        return this.errorCode;
    }

    public String getErrorMessage() {
        return this.errorMsg;
    }

    public String getExtraInfo() {
        return this.extraInfo;
    }

    public BaseException() {
        this.extraInfo = "";
    }

    static {
        Covode.recordClassIndex(37376);
    }

    public String toString() {
        return "BaseException{errorCode=" + this.errorCode + ", errorMsg='" + this.errorMsg + '\'' + '}';
    }

    public void setErrorMsg(String str) {
        this.errorMsg = str;
    }

    public void setExtraInfo(String str) {
        this.extraInfo = str;
    }

    public void readFromParcel(Parcel parcel) {
        this.errorCode = parcel.readInt();
        this.errorMsg = parcel.readString();
        this.extraInfo = parcel.readString();
    }

    protected BaseException(Parcel parcel) {
        this.extraInfo = "";
        readFromParcel(parcel);
    }

    public BaseException(int i2, Throwable th) {
        this(i2, g.e(th));
    }

    public void writeToParcel(Parcel parcel, int i2) {
        parcel.writeInt(this.errorCode);
        parcel.writeString(this.errorMsg);
        parcel.writeString(this.extraInfo);
    }

    public BaseException(int i2, String str) {
        super("[d-ex]:".concat(String.valueOf(str)));
        this.extraInfo = "";
        this.errorMsg = "[d-ex]:".concat(String.valueOf(str));
        this.errorCode = i2;
    }

    public BaseException(int i2, String str, Throwable th) {
        super("[d-ex]:".concat(String.valueOf(str)), th);
        this.extraInfo = "";
        this.errorMsg = "[d-ex]:".concat(String.valueOf(str));
        this.errorCode = i2;
    }
}
