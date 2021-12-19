package com.ss.android.ugc.aweme.ecommerce.api.model;

import android.os.Parcel;
import android.os.Parcelable;
import com.bytedance.covode.number.Covode;
import com.google.gson.a.c;
import h.f.b.g;
import h.f.b.l;
import java.util.ArrayList;
import java.util.List;

public final class DialogContent implements Parcelable {
    public static final Parcelable.Creator<DialogContent> CREATOR = new a();
    @c(a = "button_direction")
    private final Integer buttonDirection;
    @c(a = "dialog_button")
    private final List<DialogButton> dialogButtons;
    @c(a = "dialog_type")
    private final Integer dialogType;
    @c(a = "has_close_button")
    private final Boolean hasCloseButton;
    @c(a = "message")
    private final String message;
    @c(a = "title")
    private final String title;

    static {
        Covode.recordClassIndex(52834);
    }

    /* JADX DEBUG: Multi-variable search result rejected for r1v0, resolved type: com.ss.android.ugc.aweme.ecommerce.api.model.DialogContent */
    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ DialogContent copy$default(DialogContent dialogContent, String str, String str2, Integer num, Boolean bool, Integer num2, List list, int i2, Object obj) {
        if ((i2 & 1) != 0) {
            str = dialogContent.title;
        }
        if ((i2 & 2) != 0) {
            str2 = dialogContent.message;
        }
        if ((i2 & 4) != 0) {
            num = dialogContent.dialogType;
        }
        if ((i2 & 8) != 0) {
            bool = dialogContent.hasCloseButton;
        }
        if ((i2 & 16) != 0) {
            num2 = dialogContent.buttonDirection;
        }
        if ((i2 & 32) != 0) {
            list = dialogContent.dialogButtons;
        }
        return dialogContent.copy(str, str2, num, bool, num2, list);
    }

    public final String component1() {
        return this.title;
    }

    public final String component2() {
        return this.message;
    }

    public final Integer component3() {
        return this.dialogType;
    }

    public final Boolean component4() {
        return this.hasCloseButton;
    }

    public final Integer component5() {
        return this.buttonDirection;
    }

    public final List<DialogButton> component6() {
        return this.dialogButtons;
    }

    public final DialogContent copy(String str, String str2, Integer num, Boolean bool, Integer num2, List<DialogButton> list) {
        l.d(str2, "");
        return new DialogContent(str, str2, num, bool, num2, list);
    }

    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof DialogContent)) {
            return false;
        }
        DialogContent dialogContent = (DialogContent) obj;
        return l.a(this.title, dialogContent.title) && l.a(this.message, dialogContent.message) && l.a(this.dialogType, dialogContent.dialogType) && l.a(this.hasCloseButton, dialogContent.hasCloseButton) && l.a(this.buttonDirection, dialogContent.buttonDirection) && l.a(this.dialogButtons, dialogContent.dialogButtons);
    }

    public final int hashCode() {
        String str = this.title;
        int i2 = 0;
        int hashCode = (str != null ? str.hashCode() : 0) * 31;
        String str2 = this.message;
        int hashCode2 = (hashCode + (str2 != null ? str2.hashCode() : 0)) * 31;
        Integer num = this.dialogType;
        int hashCode3 = (hashCode2 + (num != null ? num.hashCode() : 0)) * 31;
        Boolean bool = this.hasCloseButton;
        int hashCode4 = (hashCode3 + (bool != null ? bool.hashCode() : 0)) * 31;
        Integer num2 = this.buttonDirection;
        int hashCode5 = (hashCode4 + (num2 != null ? num2.hashCode() : 0)) * 31;
        List<DialogButton> list = this.dialogButtons;
        if (list != null) {
            i2 = list.hashCode();
        }
        return hashCode5 + i2;
    }

    public final String toString() {
        return "DialogContent(title=" + this.title + ", message=" + this.message + ", dialogType=" + this.dialogType + ", hasCloseButton=" + this.hasCloseButton + ", buttonDirection=" + this.buttonDirection + ", dialogButtons=" + this.dialogButtons + ")";
    }

    public final void writeToParcel(Parcel parcel, int i2) {
        l.d(parcel, "");
        parcel.writeString(this.title);
        parcel.writeString(this.message);
        Integer num = this.dialogType;
        if (num != null) {
            parcel.writeInt(1);
            parcel.writeInt(num.intValue());
        } else {
            parcel.writeInt(0);
        }
        Boolean bool = this.hasCloseButton;
        if (bool != null) {
            parcel.writeInt(1);
            parcel.writeInt(bool.booleanValue() ? 1 : 0);
        } else {
            parcel.writeInt(0);
        }
        Integer num2 = this.buttonDirection;
        if (num2 != null) {
            parcel.writeInt(1);
            parcel.writeInt(num2.intValue());
        } else {
            parcel.writeInt(0);
        }
        List<DialogButton> list = this.dialogButtons;
        if (list != null) {
            parcel.writeInt(1);
            parcel.writeInt(list.size());
            for (DialogButton dialogButton : list) {
                dialogButton.writeToParcel(parcel, 0);
            }
            return;
        }
        parcel.writeInt(0);
    }

    public final Integer getButtonDirection() {
        return this.buttonDirection;
    }

    public final List<DialogButton> getDialogButtons() {
        return this.dialogButtons;
    }

    public final Integer getDialogType() {
        return this.dialogType;
    }

    public final Boolean getHasCloseButton() {
        return this.hasCloseButton;
    }

    public final String getMessage() {
        return this.message;
    }

    public final String getTitle() {
        return this.title;
    }

    public static class a implements Parcelable.Creator<DialogContent> {
        static {
            Covode.recordClassIndex(52835);
        }

        /* Return type fixed from 'java.lang.Object[]' to match base method */
        @Override // android.os.Parcelable.Creator
        public final /* bridge */ /* synthetic */ DialogContent[] newArray(int i2) {
            return new DialogContent[i2];
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        @Override // android.os.Parcelable.Creator
        public final /* synthetic */ DialogContent createFromParcel(Parcel parcel) {
            Boolean bool;
            l.d(parcel, "");
            String readString = parcel.readString();
            String readString2 = parcel.readString();
            ArrayList arrayList = null;
            Integer valueOf = parcel.readInt() != 0 ? Integer.valueOf(parcel.readInt()) : null;
            if (parcel.readInt() != 0) {
                bool = Boolean.valueOf(parcel.readInt() != 0);
            } else {
                bool = null;
            }
            Integer valueOf2 = parcel.readInt() != 0 ? Integer.valueOf(parcel.readInt()) : null;
            if (parcel.readInt() != 0) {
                int readInt = parcel.readInt();
                arrayList = new ArrayList(readInt);
                while (readInt != 0) {
                    arrayList.add(DialogButton.CREATOR.createFromParcel(parcel));
                    readInt--;
                }
            }
            return new DialogContent(readString, readString2, valueOf, bool, valueOf2, arrayList);
        }
    }

    public DialogContent(String str, String str2, Integer num, Boolean bool, Integer num2, List<DialogButton> list) {
        l.d(str2, "");
        this.title = str;
        this.message = str2;
        this.dialogType = num;
        this.hasCloseButton = bool;
        this.buttonDirection = num2;
        this.dialogButtons = list;
    }

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    public /* synthetic */ DialogContent(String str, String str2, Integer num, Boolean bool, Integer num2, List list, int i2, g gVar) {
        this(str, str2, (i2 & 4) != 0 ? 0 : num, bool, (i2 & 16) == 0 ? num2 : 0, list);
    }
}
