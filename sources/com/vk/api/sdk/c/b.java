package com.vk.api.sdk.c;

import android.os.Bundle;
import com.bytedance.covode.number.Covode;
import h.a.n;
import h.f.b.g;
import h.f.b.l;
import java.util.Iterator;
import java.util.List;
import org.json.JSONObject;

public final class b extends a {
    public static final a Companion = new a((byte) 0);
    public static final long serialVersionUID = 7524047853274172872L;
    private final String apiMethod;
    private final int code;
    private final String detailMessage;
    private final String errorMsg;
    private final List<b> executeErrors;
    private final Bundle extra;
    private final boolean hasLocalizedMessage;

    static {
        Covode.recordClassIndex(103780);
    }

    public b(int i2, String str, boolean z, String str2) {
        this(i2, str, z, str2, null, null, null, 112, null);
    }

    public b(int i2, String str, boolean z, String str2, Bundle bundle) {
        this(i2, str, z, str2, bundle, null, null, 96, null);
    }

    public b(int i2, String str, boolean z, String str2, Bundle bundle, List<? extends b> list) {
        this(i2, str, z, str2, bundle, list, null, 64, null);
    }

    public static final class a {
        static {
            Covode.recordClassIndex(103781);
        }

        private a() {
        }

        public /* synthetic */ a(byte b2) {
            this();
        }
    }

    public final String getApiMethod() {
        return this.apiMethod;
    }

    public final int getCode() {
        return this.code;
    }

    public final String getDetailMessage() {
        return this.detailMessage;
    }

    public final String getErrorMsg() {
        return this.errorMsg;
    }

    public final List<b> getExecuteErrors() {
        return this.executeErrors;
    }

    public final Bundle getExtra() {
        return this.extra;
    }

    public final boolean getHasLocalizedMessage() {
        return this.hasLocalizedMessage;
    }

    public final String getExtensionHash() {
        String string;
        Bundle bundle = this.extra;
        if (bundle == null || (string = bundle.getString("extend_hash", null)) == null) {
            return "";
        }
        return string;
    }

    public final int hashCode() {
        int i2;
        int i3 = this.code * 31;
        Bundle bundle = this.extra;
        if (bundle != null) {
            i2 = bundle.hashCode();
        } else {
            i2 = 0;
        }
        return i3 + i2;
    }

    public final boolean isCaptchaError() {
        if (this.code == 14) {
            return true;
        }
        return false;
    }

    public final boolean isCompositeError() {
        if (this.code == Integer.MIN_VALUE) {
            return true;
        }
        return false;
    }

    public final boolean isInternalServerError() {
        int i2 = this.code;
        if (i2 == 1 || i2 == 10 || i2 == 13) {
            return true;
        }
        return false;
    }

    public final boolean isInvalidCredentialsError() {
        int i2 = this.code;
        if (i2 == 4 || i2 == 5) {
            return true;
        }
        return false;
    }

    public final boolean isPasswordConfirmRequired() {
        if (this.code == 3609) {
            return true;
        }
        return false;
    }

    public final boolean isTokenConfirmationRequired() {
        if (this.code == 25) {
            return true;
        }
        return false;
    }

    public final boolean isTooManyRequestsError() {
        if (this.code != 6) {
            return false;
        }
        return true;
    }

    public final boolean isUserConfirmRequired() {
        if (this.code == 24) {
            return true;
        }
        return false;
    }

    public final boolean isValidationRequired() {
        if (this.code == 17) {
            return true;
        }
        return false;
    }

    public final String getCaptchaImg() {
        String string;
        Bundle bundle = this.extra;
        if (bundle == null || (string = bundle.getString("captcha_img", "")) == null) {
            return "";
        }
        return string;
    }

    public final String getCaptchaSid() {
        String string;
        Bundle bundle = this.extra;
        if (bundle == null || (string = bundle.getString("captcha_sid", "")) == null) {
            return "";
        }
        return string;
    }

    public final JSONObject getUserBanInfo() {
        String string;
        Bundle bundle = this.extra;
        if (bundle == null || (string = bundle.getString("user_ban_info")) == null) {
            return null;
        }
        return new JSONObject(string);
    }

    public final String getUserConfirmText() {
        String string;
        Bundle bundle = this.extra;
        if (bundle == null || (string = bundle.getString("confirmation_text", "")) == null) {
            return "";
        }
        return string;
    }

    public final String getValidationUrl() {
        String string;
        Bundle bundle = this.extra;
        if (bundle == null || (string = bundle.getString("validation_url", "")) == null) {
            return "";
        }
        return string;
    }

    public final boolean hasExtra() {
        Bundle bundle = this.extra;
        if (bundle == null || !(!l.a(bundle, Bundle.EMPTY))) {
            return false;
        }
        return true;
    }

    public final boolean isAccessError() {
        int i2 = this.code;
        if (i2 == 15 || i2 == 30 || i2 == 203 || i2 == 200 || i2 == 201) {
            return true;
        }
        return false;
    }

    public final String toString() {
        String str;
        StringBuilder append = new StringBuilder("VKApiExecutionException{code=").append(this.code).append(", extra=").append(this.extra).append(", method=").append(this.apiMethod).append(", executeErrors=");
        List<b> list = this.executeErrors;
        if (list != null) {
            str = n.a(list, (CharSequence) null, "[", "]", 0, (CharSequence) null, (h.f.a.b) null, 57);
        } else {
            str = null;
        }
        return append.append(str).append(", super=").append(super.toString()).append("}").toString();
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof b)) {
            return false;
        }
        b bVar = (b) obj;
        if (this.code == bVar.code) {
            Bundle bundle = this.extra;
            Bundle bundle2 = bVar.extra;
            if (bundle == null ? bundle2 == null : !(!l.a(bundle, bundle2))) {
                return true;
            }
        }
        return false;
    }

    public final boolean hasError(int i2) {
        if (this.code == i2) {
            return true;
        }
        List<b> list = this.executeErrors;
        if (list != null) {
            Iterator<T> it = list.iterator();
            while (true) {
                if (!it.hasNext()) {
                    break;
                }
                T next = it.next();
                if (next.code == i2) {
                    if (next != null) {
                        return true;
                    }
                }
            }
        }
        return false;
    }

    /* JADX DEBUG: Multi-variable search result rejected for r7v0, resolved type: java.util.List<? extends com.vk.api.sdk.c.b> */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public b(int i2, String str, boolean z, String str2, Bundle bundle, List<? extends b> list, String str3) {
        super(str2);
        l.c(str, "");
        l.c(str2, "");
        this.code = i2;
        this.apiMethod = str;
        this.hasLocalizedMessage = z;
        this.detailMessage = str2;
        this.extra = bundle;
        this.executeErrors = list;
        this.errorMsg = str3;
    }

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    public /* synthetic */ b(int i2, String str, boolean z, String str2, Bundle bundle, List list, String str3, int i3, g gVar) {
        this(i2, str, z, str2, (i3 & 16) != 0 ? Bundle.EMPTY : bundle, (i3 & 32) != 0 ? null : list, (i3 & 64) == 0 ? str3 : null);
    }
}
