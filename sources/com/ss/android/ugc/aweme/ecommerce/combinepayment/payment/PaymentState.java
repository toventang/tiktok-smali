package com.ss.android.ugc.aweme.ecommerce.combinepayment.payment;

import com.bytedance.covode.number.Covode;
import com.bytedance.jedi.arch.af;
import com.ss.android.ugc.aweme.ecommerce.combinepayment.payment.dto.n;
import com.ss.android.ugc.aweme.ecommerce.combinepayment.payment.dto.o;
import h.a.z;
import h.f.b.g;
import h.f.b.l;
import java.util.List;

public final class PaymentState implements af {
    private final boolean autoCloseFrag;
    private final o checkedPaymentMethod;
    private final boolean emailHintVisible;
    private final n paymentInfo;
    private final n paymentInfoForNextStep;
    private final n paymentInfoForThreeStepCache;
    private final List<Object> paymentList;
    private final Object resendPayAction;
    private final boolean showLoading;
    private final String systemError;

    static {
        Covode.recordClassIndex(53321);
    }

    public PaymentState() {
        this(null, null, null, null, false, null, null, false, false, null, 1023, null);
    }

    /* JADX DEBUG: Multi-variable search result rejected for r1v0, resolved type: com.ss.android.ugc.aweme.ecommerce.combinepayment.payment.PaymentState */
    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ PaymentState copy$default(PaymentState paymentState, o oVar, List list, n nVar, String str, boolean z, n nVar2, n nVar3, boolean z2, boolean z3, Object obj, int i2, Object obj2) {
        if ((i2 & 1) != 0) {
            oVar = paymentState.checkedPaymentMethod;
        }
        if ((i2 & 2) != 0) {
            list = paymentState.paymentList;
        }
        if ((i2 & 4) != 0) {
            nVar = paymentState.paymentInfo;
        }
        if ((i2 & 8) != 0) {
            str = paymentState.systemError;
        }
        if ((i2 & 16) != 0) {
            z = paymentState.emailHintVisible;
        }
        if ((i2 & 32) != 0) {
            nVar2 = paymentState.paymentInfoForThreeStepCache;
        }
        if ((i2 & 64) != 0) {
            nVar3 = paymentState.paymentInfoForNextStep;
        }
        if ((i2 & 128) != 0) {
            z2 = paymentState.autoCloseFrag;
        }
        if ((i2 & 256) != 0) {
            z3 = paymentState.showLoading;
        }
        if ((i2 & 512) != 0) {
            obj = paymentState.resendPayAction;
        }
        return paymentState.copy(oVar, list, nVar, str, z, nVar2, nVar3, z2, z3, obj);
    }

    public final o component1() {
        return this.checkedPaymentMethod;
    }

    public final Object component10() {
        return this.resendPayAction;
    }

    public final List<Object> component2() {
        return this.paymentList;
    }

    public final n component3() {
        return this.paymentInfo;
    }

    public final String component4() {
        return this.systemError;
    }

    public final boolean component5() {
        return this.emailHintVisible;
    }

    public final n component6() {
        return this.paymentInfoForThreeStepCache;
    }

    public final n component7() {
        return this.paymentInfoForNextStep;
    }

    public final boolean component8() {
        return this.autoCloseFrag;
    }

    public final boolean component9() {
        return this.showLoading;
    }

    public final PaymentState copy(o oVar, List<? extends Object> list, n nVar, String str, boolean z, n nVar2, n nVar3, boolean z2, boolean z3, Object obj) {
        l.d(list, "");
        return new PaymentState(oVar, list, nVar, str, z, nVar2, nVar3, z2, z3, obj);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof PaymentState)) {
            return false;
        }
        PaymentState paymentState = (PaymentState) obj;
        return l.a(this.checkedPaymentMethod, paymentState.checkedPaymentMethod) && l.a(this.paymentList, paymentState.paymentList) && l.a(this.paymentInfo, paymentState.paymentInfo) && l.a(this.systemError, paymentState.systemError) && this.emailHintVisible == paymentState.emailHintVisible && l.a(this.paymentInfoForThreeStepCache, paymentState.paymentInfoForThreeStepCache) && l.a(this.paymentInfoForNextStep, paymentState.paymentInfoForNextStep) && this.autoCloseFrag == paymentState.autoCloseFrag && this.showLoading == paymentState.showLoading && l.a(this.resendPayAction, paymentState.resendPayAction);
    }

    public final int hashCode() {
        o oVar = this.checkedPaymentMethod;
        int i2 = 0;
        int hashCode = (oVar != null ? oVar.hashCode() : 0) * 31;
        List<Object> list = this.paymentList;
        int hashCode2 = (hashCode + (list != null ? list.hashCode() : 0)) * 31;
        n nVar = this.paymentInfo;
        int hashCode3 = (hashCode2 + (nVar != null ? nVar.hashCode() : 0)) * 31;
        String str = this.systemError;
        int hashCode4 = (hashCode3 + (str != null ? str.hashCode() : 0)) * 31;
        boolean z = this.emailHintVisible;
        int i3 = 1;
        if (z) {
            z = true;
        }
        int i4 = z ? 1 : 0;
        int i5 = z ? 1 : 0;
        int i6 = z ? 1 : 0;
        int i7 = (hashCode4 + i4) * 31;
        n nVar2 = this.paymentInfoForThreeStepCache;
        int hashCode5 = (i7 + (nVar2 != null ? nVar2.hashCode() : 0)) * 31;
        n nVar3 = this.paymentInfoForNextStep;
        int hashCode6 = (hashCode5 + (nVar3 != null ? nVar3.hashCode() : 0)) * 31;
        boolean z2 = this.autoCloseFrag;
        if (z2) {
            z2 = true;
        }
        int i8 = z2 ? 1 : 0;
        int i9 = z2 ? 1 : 0;
        int i10 = z2 ? 1 : 0;
        int i11 = (hashCode6 + i8) * 31;
        if (!this.showLoading) {
            i3 = 0;
        }
        int i12 = (i11 + i3) * 31;
        Object obj = this.resendPayAction;
        if (obj != null) {
            i2 = obj.hashCode();
        }
        return i12 + i2;
    }

    public final String toString() {
        return "PaymentState(checkedPaymentMethod=" + this.checkedPaymentMethod + ", paymentList=" + this.paymentList + ", paymentInfo=" + this.paymentInfo + ", systemError=" + this.systemError + ", emailHintVisible=" + this.emailHintVisible + ", paymentInfoForThreeStepCache=" + this.paymentInfoForThreeStepCache + ", paymentInfoForNextStep=" + this.paymentInfoForNextStep + ", autoCloseFrag=" + this.autoCloseFrag + ", showLoading=" + this.showLoading + ", resendPayAction=" + this.resendPayAction + ")";
    }

    public final boolean getAutoCloseFrag() {
        return this.autoCloseFrag;
    }

    public final o getCheckedPaymentMethod() {
        return this.checkedPaymentMethod;
    }

    public final boolean getEmailHintVisible() {
        return this.emailHintVisible;
    }

    public final n getPaymentInfo() {
        return this.paymentInfo;
    }

    public final n getPaymentInfoForNextStep() {
        return this.paymentInfoForNextStep;
    }

    public final n getPaymentInfoForThreeStepCache() {
        return this.paymentInfoForThreeStepCache;
    }

    public final List<Object> getPaymentList() {
        return this.paymentList;
    }

    public final Object getResendPayAction() {
        return this.resendPayAction;
    }

    public final boolean getShowLoading() {
        return this.showLoading;
    }

    public final String getSystemError() {
        return this.systemError;
    }

    public PaymentState(o oVar, List<? extends Object> list, n nVar, String str, boolean z, n nVar2, n nVar3, boolean z2, boolean z3, Object obj) {
        l.d(list, "");
        this.checkedPaymentMethod = oVar;
        this.paymentList = list;
        this.paymentInfo = nVar;
        this.systemError = str;
        this.emailHintVisible = z;
        this.paymentInfoForThreeStepCache = nVar2;
        this.paymentInfoForNextStep = nVar3;
        this.autoCloseFrag = z2;
        this.showLoading = z3;
        this.resendPayAction = obj;
    }

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    public /* synthetic */ PaymentState(o oVar, List list, n nVar, String str, boolean z, n nVar2, n nVar3, boolean z2, boolean z3, Object obj, int i2, g gVar) {
        this((i2 & 1) != 0 ? null : oVar, (i2 & 2) != 0 ? z.INSTANCE : list, (i2 & 4) != 0 ? null : nVar, (i2 & 8) != 0 ? null : str, (i2 & 16) != 0 ? false : z, (i2 & 32) != 0 ? null : nVar2, (i2 & 64) != 0 ? null : nVar3, (i2 & 128) != 0 ? false : z2, (i2 & 256) == 0 ? z3 : false, (i2 & 512) == 0 ? obj : null);
    }
}
