package com.facebook.share.model;

import android.os.Parcel;
import android.os.Parcelable;
import com.bytedance.covode.number.Covode;
import com.facebook.share.model.CameraEffectArguments;
import com.facebook.share.model.CameraEffectTextures;

public class ShareCameraEffectContent extends ShareContent<ShareCameraEffectContent, Object> {
    public static final Parcelable.Creator<ShareCameraEffectContent> CREATOR = new Parcelable.Creator<ShareCameraEffectContent>() {
        /* class com.facebook.share.model.ShareCameraEffectContent.AnonymousClass1 */

        static {
            Covode.recordClassIndex(30699);
        }

        /* Return type fixed from 'java.lang.Object[]' to match base method */
        @Override // android.os.Parcelable.Creator
        public final /* bridge */ /* synthetic */ ShareCameraEffectContent[] newArray(int i2) {
            return new ShareCameraEffectContent[i2];
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        @Override // android.os.Parcelable.Creator
        public final /* synthetic */ ShareCameraEffectContent createFromParcel(Parcel parcel) {
            return new ShareCameraEffectContent(parcel);
        }
    };

    /* renamed from: a  reason: collision with root package name */
    public String f49094a;

    /* renamed from: b  reason: collision with root package name */
    public CameraEffectArguments f49095b;

    /* renamed from: c  reason: collision with root package name */
    public CameraEffectTextures f49096c;

    static {
        Covode.recordClassIndex(30698);
    }

    ShareCameraEffectContent(Parcel parcel) {
        super(parcel);
        this.f49094a = parcel.readString();
        CameraEffectArguments.a aVar = new CameraEffectArguments.a();
        CameraEffectArguments cameraEffectArguments = (CameraEffectArguments) parcel.readParcelable(CameraEffectArguments.class.getClassLoader());
        if (cameraEffectArguments != null) {
            aVar.f49091a.putAll(cameraEffectArguments.f49090a);
        }
        this.f49095b = new CameraEffectArguments(aVar, (byte) 0);
        CameraEffectTextures.a aVar2 = new CameraEffectTextures.a();
        CameraEffectTextures cameraEffectTextures = (CameraEffectTextures) parcel.readParcelable(CameraEffectTextures.class.getClassLoader());
        if (cameraEffectTextures != null) {
            aVar2.f49093a.putAll(cameraEffectTextures.f49092a);
        }
        this.f49096c = new CameraEffectTextures(aVar2, (byte) 0);
    }

    @Override // com.facebook.share.model.ShareContent
    public void writeToParcel(Parcel parcel, int i2) {
        super.writeToParcel(parcel, i2);
        parcel.writeString(this.f49094a);
        parcel.writeParcelable(this.f49095b, 0);
        parcel.writeParcelable(this.f49096c, 0);
    }
}
