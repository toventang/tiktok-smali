package com.bytedance.ies.xbridge.base.runtime.depend;

import android.content.Context;
import android.content.DialogInterface;
import com.bytedance.covode.number.Covode;
import h.f.b.g;
import h.f.b.l;

public final class DialogBuilder {
    private final DialogInterface.OnCancelListener cancelListener;
    private final boolean cancelOnTouchOutside;
    private final Context context;
    private final String message;
    private final String negativeBtnText;
    private final DialogInterface.OnClickListener negativeClickListener;
    private final String positiveBtnText;
    private final DialogInterface.OnClickListener positiveClickListener;
    private final String title;

    static {
        Covode.recordClassIndex(21410);
    }

    public static /* synthetic */ DialogBuilder copy$default(DialogBuilder dialogBuilder, Context context2, String str, String str2, String str3, DialogInterface.OnClickListener onClickListener, String str4, DialogInterface.OnClickListener onClickListener2, DialogInterface.OnCancelListener onCancelListener, boolean z, int i2, Object obj) {
        if ((i2 & 1) != 0) {
            context2 = dialogBuilder.context;
        }
        if ((i2 & 2) != 0) {
            str = dialogBuilder.title;
        }
        if ((i2 & 4) != 0) {
            str2 = dialogBuilder.message;
        }
        if ((i2 & 8) != 0) {
            str3 = dialogBuilder.positiveBtnText;
        }
        if ((i2 & 16) != 0) {
            onClickListener = dialogBuilder.positiveClickListener;
        }
        if ((i2 & 32) != 0) {
            str4 = dialogBuilder.negativeBtnText;
        }
        if ((i2 & 64) != 0) {
            onClickListener2 = dialogBuilder.negativeClickListener;
        }
        if ((i2 & 128) != 0) {
            onCancelListener = dialogBuilder.cancelListener;
        }
        if ((i2 & 256) != 0) {
            z = dialogBuilder.cancelOnTouchOutside;
        }
        return dialogBuilder.copy(context2, str, str2, str3, onClickListener, str4, onClickListener2, onCancelListener, z);
    }

    public final Context component1() {
        return this.context;
    }

    public final String component2() {
        return this.title;
    }

    public final String component3() {
        return this.message;
    }

    public final String component4() {
        return this.positiveBtnText;
    }

    public final DialogInterface.OnClickListener component5() {
        return this.positiveClickListener;
    }

    public final String component6() {
        return this.negativeBtnText;
    }

    public final DialogInterface.OnClickListener component7() {
        return this.negativeClickListener;
    }

    public final DialogInterface.OnCancelListener component8() {
        return this.cancelListener;
    }

    public final boolean component9() {
        return this.cancelOnTouchOutside;
    }

    public final DialogBuilder copy(Context context2, String str, String str2, String str3, DialogInterface.OnClickListener onClickListener, String str4, DialogInterface.OnClickListener onClickListener2, DialogInterface.OnCancelListener onCancelListener, boolean z) {
        l.c(context2, "");
        return new DialogBuilder(context2, str, str2, str3, onClickListener, str4, onClickListener2, onCancelListener, z);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof DialogBuilder)) {
            return false;
        }
        DialogBuilder dialogBuilder = (DialogBuilder) obj;
        return l.a(this.context, dialogBuilder.context) && l.a(this.title, dialogBuilder.title) && l.a(this.message, dialogBuilder.message) && l.a(this.positiveBtnText, dialogBuilder.positiveBtnText) && l.a(this.positiveClickListener, dialogBuilder.positiveClickListener) && l.a(this.negativeBtnText, dialogBuilder.negativeBtnText) && l.a(this.negativeClickListener, dialogBuilder.negativeClickListener) && l.a(this.cancelListener, dialogBuilder.cancelListener) && this.cancelOnTouchOutside == dialogBuilder.cancelOnTouchOutside;
    }

    public final int hashCode() {
        Context context2 = this.context;
        int i2 = 0;
        int hashCode = (context2 != null ? context2.hashCode() : 0) * 31;
        String str = this.title;
        int hashCode2 = (hashCode + (str != null ? str.hashCode() : 0)) * 31;
        String str2 = this.message;
        int hashCode3 = (hashCode2 + (str2 != null ? str2.hashCode() : 0)) * 31;
        String str3 = this.positiveBtnText;
        int hashCode4 = (hashCode3 + (str3 != null ? str3.hashCode() : 0)) * 31;
        DialogInterface.OnClickListener onClickListener = this.positiveClickListener;
        int hashCode5 = (hashCode4 + (onClickListener != null ? onClickListener.hashCode() : 0)) * 31;
        String str4 = this.negativeBtnText;
        int hashCode6 = (hashCode5 + (str4 != null ? str4.hashCode() : 0)) * 31;
        DialogInterface.OnClickListener onClickListener2 = this.negativeClickListener;
        int hashCode7 = (hashCode6 + (onClickListener2 != null ? onClickListener2.hashCode() : 0)) * 31;
        DialogInterface.OnCancelListener onCancelListener = this.cancelListener;
        if (onCancelListener != null) {
            i2 = onCancelListener.hashCode();
        }
        int i3 = (hashCode7 + i2) * 31;
        boolean z = this.cancelOnTouchOutside;
        if (z) {
            z = true;
        }
        int i4 = z ? 1 : 0;
        int i5 = z ? 1 : 0;
        int i6 = z ? 1 : 0;
        return i3 + i4;
    }

    public final String toString() {
        return "DialogBuilder(context=" + this.context + ", title=" + this.title + ", message=" + this.message + ", positiveBtnText=" + this.positiveBtnText + ", positiveClickListener=" + this.positiveClickListener + ", negativeBtnText=" + this.negativeBtnText + ", negativeClickListener=" + this.negativeClickListener + ", cancelListener=" + this.cancelListener + ", cancelOnTouchOutside=" + this.cancelOnTouchOutside + ")";
    }

    public final DialogInterface.OnCancelListener getCancelListener() {
        return this.cancelListener;
    }

    public final boolean getCancelOnTouchOutside() {
        return this.cancelOnTouchOutside;
    }

    public final Context getContext() {
        return this.context;
    }

    public final String getMessage() {
        return this.message;
    }

    public final String getNegativeBtnText() {
        return this.negativeBtnText;
    }

    public final DialogInterface.OnClickListener getNegativeClickListener() {
        return this.negativeClickListener;
    }

    public final String getPositiveBtnText() {
        return this.positiveBtnText;
    }

    public final DialogInterface.OnClickListener getPositiveClickListener() {
        return this.positiveClickListener;
    }

    public final String getTitle() {
        return this.title;
    }

    public DialogBuilder(Context context2, String str, String str2, String str3, DialogInterface.OnClickListener onClickListener, String str4, DialogInterface.OnClickListener onClickListener2, DialogInterface.OnCancelListener onCancelListener, boolean z) {
        l.c(context2, "");
        this.context = context2;
        this.title = str;
        this.message = str2;
        this.positiveBtnText = str3;
        this.positiveClickListener = onClickListener;
        this.negativeBtnText = str4;
        this.negativeClickListener = onClickListener2;
        this.cancelListener = onCancelListener;
        this.cancelOnTouchOutside = z;
    }

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    public /* synthetic */ DialogBuilder(Context context2, String str, String str2, String str3, DialogInterface.OnClickListener onClickListener, String str4, DialogInterface.OnClickListener onClickListener2, DialogInterface.OnCancelListener onCancelListener, boolean z, int i2, g gVar) {
        this(context2, (i2 & 2) != 0 ? null : str, (i2 & 4) != 0 ? null : str2, (i2 & 8) != 0 ? null : str3, (i2 & 16) != 0 ? null : onClickListener, (i2 & 32) != 0 ? null : str4, (i2 & 64) != 0 ? null : onClickListener2, (i2 & 128) == 0 ? onCancelListener : null, (i2 & 256) != 0 ? true : z);
    }
}
