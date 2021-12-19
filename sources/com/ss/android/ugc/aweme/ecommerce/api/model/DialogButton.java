package com.ss.android.ugc.aweme.ecommerce.api.model;

import android.os.Parcel;
import android.os.Parcelable;
import com.bytedance.covode.number.Covode;
import com.google.gson.a.c;
import h.f.b.g;
import h.f.b.l;

public final class DialogButton implements Parcelable {
    public static final Parcelable.Creator<DialogButton> CREATOR = new a();
    @c(a = "button_action")
    private final ButtonAction buttonAction;
    @c(a = "dialog_button_style")
    private final Integer dialogButtonStyle;
    @c(a = "text")
    private final String text;

    static {
        Covode.recordClassIndex(52832);
    }

    public static /* synthetic */ DialogButton copy$default(DialogButton dialogButton, String str, Integer num, ButtonAction buttonAction2, int i2, Object obj) {
        if ((i2 & 1) != 0) {
            str = dialogButton.text;
        }
        if ((i2 & 2) != 0) {
            num = dialogButton.dialogButtonStyle;
        }
        if ((i2 & 4) != 0) {
            buttonAction2 = dialogButton.buttonAction;
        }
        return dialogButton.copy(str, num, buttonAction2);
    }

    public final String component1() {
        return this.text;
    }

    public final Integer component2() {
        return this.dialogButtonStyle;
    }

    public final ButtonAction component3() {
        return this.buttonAction;
    }

    public final DialogButton copy(String str, Integer num, ButtonAction buttonAction2) {
        return new DialogButton(str, num, buttonAction2);
    }

    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof DialogButton)) {
            return false;
        }
        DialogButton dialogButton = (DialogButton) obj;
        return l.a(this.text, dialogButton.text) && l.a(this.dialogButtonStyle, dialogButton.dialogButtonStyle) && l.a(this.buttonAction, dialogButton.buttonAction);
    }

    public final int hashCode() {
        String str = this.text;
        int i2 = 0;
        int hashCode = (str != null ? str.hashCode() : 0) * 31;
        Integer num = this.dialogButtonStyle;
        int hashCode2 = (hashCode + (num != null ? num.hashCode() : 0)) * 31;
        ButtonAction buttonAction2 = this.buttonAction;
        if (buttonAction2 != null) {
            i2 = buttonAction2.hashCode();
        }
        return hashCode2 + i2;
    }

    public final String toString() {
        return "DialogButton(text=" + this.text + ", dialogButtonStyle=" + this.dialogButtonStyle + ", buttonAction=" + this.buttonAction + ")";
    }

    public final void writeToParcel(Parcel parcel, int i2) {
        l.d(parcel, "");
        parcel.writeString(this.text);
        Integer num = this.dialogButtonStyle;
        if (num != null) {
            parcel.writeInt(1);
            parcel.writeInt(num.intValue());
        } else {
            parcel.writeInt(0);
        }
        ButtonAction buttonAction2 = this.buttonAction;
        if (buttonAction2 != null) {
            parcel.writeInt(1);
            buttonAction2.writeToParcel(parcel, 0);
            return;
        }
        parcel.writeInt(0);
    }

    public final ButtonAction getButtonAction() {
        return this.buttonAction;
    }

    public final Integer getDialogButtonStyle() {
        return this.dialogButtonStyle;
    }

    public final String getText() {
        return this.text;
    }

    public static class a implements Parcelable.Creator<DialogButton> {
        static {
            Covode.recordClassIndex(52833);
        }

        /* Return type fixed from 'java.lang.Object[]' to match base method */
        @Override // android.os.Parcelable.Creator
        public final /* bridge */ /* synthetic */ DialogButton[] newArray(int i2) {
            return new DialogButton[i2];
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        @Override // android.os.Parcelable.Creator
        public final /* synthetic */ DialogButton createFromParcel(Parcel parcel) {
            l.d(parcel, "");
            String readString = parcel.readString();
            ButtonAction buttonAction = null;
            Integer valueOf = parcel.readInt() != 0 ? Integer.valueOf(parcel.readInt()) : null;
            if (parcel.readInt() != 0) {
                buttonAction = ButtonAction.CREATOR.createFromParcel(parcel);
            }
            return new DialogButton(readString, valueOf, buttonAction);
        }
    }

    public DialogButton(String str, Integer num, ButtonAction buttonAction2) {
        this.text = str;
        this.dialogButtonStyle = num;
        this.buttonAction = buttonAction2;
    }

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    public /* synthetic */ DialogButton(String str, Integer num, ButtonAction buttonAction2, int i2, g gVar) {
        this(str, (i2 & 2) != 0 ? 0 : num, buttonAction2);
    }
}
