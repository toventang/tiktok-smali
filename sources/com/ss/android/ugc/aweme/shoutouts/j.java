package com.ss.android.ugc.aweme.shoutouts;

import android.text.InputFilter;
import android.text.Spanned;
import android.text.TextUtils;
import com.bytedance.covode.number.Covode;
import com.ss.android.ugc.aweme.shortvideo.view.MentionEditText;
import com.ss.android.ugc.aweme.tux.a.i.a;
import com.zhiliaoapp.musically.R;

public final class j implements InputFilter {

    /* renamed from: a  reason: collision with root package name */
    public boolean f133184a;

    /* renamed from: b  reason: collision with root package name */
    private final int f133185b = 150;

    /* renamed from: c  reason: collision with root package name */
    private MentionEditText f133186c;

    static {
        Covode.recordClassIndex(87093);
    }

    public j(MentionEditText mentionEditText) {
        this.f133186c = mentionEditText;
    }

    public final CharSequence filter(CharSequence charSequence, int i2, int i3, Spanned spanned, int i4, int i5) {
        int length;
        MentionEditText.AdSpan[] adSpanArr = (MentionEditText.AdSpan[]) spanned.getSpans(0, spanned.length(), MentionEditText.AdSpan.class);
        if (TextUtils.isEmpty(this.f133186c.getAdTag())) {
            length = this.f133185b - (spanned.length() - (i5 - i4));
        } else if (adSpanArr.length == 0) {
            return null;
        } else {
            length = this.f133185b - (this.f133186c.getNoAdTagText().length() - (i5 - i4));
        }
        if (length <= 0) {
            if (!TextUtils.isEmpty(charSequence)) {
                new a(com.ss.android.ugc.aweme.framework.d.a.f96678a).a(R.string.hfi).a();
                this.f133184a = true;
            }
            return "";
        } else if (length >= i3 - i2) {
            return null;
        } else {
            int i6 = length + i2;
            if (!Character.isHighSurrogate(charSequence.charAt(i6 - 1)) || i6 - 1 != i2) {
                new a(com.ss.android.ugc.aweme.framework.d.a.f96678a).a(R.string.hfi).a();
                this.f133184a = true;
                return charSequence.subSequence(i2, i6);
            }
            new a(com.ss.android.ugc.aweme.framework.d.a.f96678a).a(R.string.hfi).a();
            this.f133184a = true;
            return "";
        }
    }
}
