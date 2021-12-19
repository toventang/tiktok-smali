package com.ss.android.ugc.aweme.ecommerce.api.model;

import android.os.Parcel;
import android.os.Parcelable;
import com.bytedance.covode.number.Covode;
import com.google.gson.a.c;
import h.f.b.g;
import h.f.b.l;

public final class ButtonAction implements Parcelable {
    public static final Parcelable.Creator<ButtonAction> CREATOR = new a();
    @c(a = "button_action_info")
    private final ButtonActionInfo buttonActionInfo;
    @c(a = "button_action_type")
    private final Integer buttonActionType;

    static {
        Covode.recordClassIndex(52828);
    }

    public static /* synthetic */ ButtonAction copy$default(ButtonAction buttonAction, Integer num, ButtonActionInfo buttonActionInfo2, int i2, Object obj) {
        if ((i2 & 1) != 0) {
            num = buttonAction.buttonActionType;
        }
        if ((i2 & 2) != 0) {
            buttonActionInfo2 = buttonAction.buttonActionInfo;
        }
        return buttonAction.copy(num, buttonActionInfo2);
    }

    public final Integer component1() {
        return this.buttonActionType;
    }

    public final ButtonActionInfo component2() {
        return this.buttonActionInfo;
    }

    public final ButtonAction copy(Integer num, ButtonActionInfo buttonActionInfo2) {
        return new ButtonAction(num, buttonActionInfo2);
    }

    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ButtonAction)) {
            return false;
        }
        ButtonAction buttonAction = (ButtonAction) obj;
        return l.a(this.buttonActionType, buttonAction.buttonActionType) && l.a(this.buttonActionInfo, buttonAction.buttonActionInfo);
    }

    public final int hashCode() {
        Integer num = this.buttonActionType;
        int i2 = 0;
        int hashCode = (num != null ? num.hashCode() : 0) * 31;
        ButtonActionInfo buttonActionInfo2 = this.buttonActionInfo;
        if (buttonActionInfo2 != null) {
            i2 = buttonActionInfo2.hashCode();
        }
        return hashCode + i2;
    }

    public final String toString() {
        return "ButtonAction(buttonActionType=" + this.buttonActionType + ", buttonActionInfo=" + this.buttonActionInfo + ")";
    }

    public final void writeToParcel(Parcel parcel, int i2) {
        l.d(parcel, "");
        Integer num = this.buttonActionType;
        if (num != null) {
            parcel.writeInt(1);
            parcel.writeInt(num.intValue());
        } else {
            parcel.writeInt(0);
        }
        ButtonActionInfo buttonActionInfo2 = this.buttonActionInfo;
        if (buttonActionInfo2 != null) {
            parcel.writeInt(1);
            buttonActionInfo2.writeToParcel(parcel, 0);
            return;
        }
        parcel.writeInt(0);
    }

    public final ButtonActionInfo getButtonActionInfo() {
        return this.buttonActionInfo;
    }

    public final Integer getButtonActionType() {
        return this.buttonActionType;
    }

    public static class a implements Parcelable.Creator<ButtonAction> {
        static {
            Covode.recordClassIndex(52829);
        }

        /* Return type fixed from 'java.lang.Object[]' to match base method */
        @Override // android.os.Parcelable.Creator
        public final /* bridge */ /* synthetic */ ButtonAction[] newArray(int i2) {
            return new ButtonAction[i2];
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        @Override // android.os.Parcelable.Creator
        public final /* synthetic */ ButtonAction createFromParcel(Parcel parcel) {
            l.d(parcel, "");
            ButtonActionInfo buttonActionInfo = null;
            Integer valueOf = parcel.readInt() != 0 ? Integer.valueOf(parcel.readInt()) : null;
            if (parcel.readInt() != 0) {
                buttonActionInfo = ButtonActionInfo.CREATOR.createFromParcel(parcel);
            }
            return new ButtonAction(valueOf, buttonActionInfo);
        }
    }

    public ButtonAction(Integer num, ButtonActionInfo buttonActionInfo2) {
        this.buttonActionType = num;
        this.buttonActionInfo = buttonActionInfo2;
    }

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    public /* synthetic */ ButtonAction(Integer num, ButtonActionInfo buttonActionInfo2, int i2, g gVar) {
        this((i2 & 1) != 0 ? 0 : num, buttonActionInfo2);
    }
}
