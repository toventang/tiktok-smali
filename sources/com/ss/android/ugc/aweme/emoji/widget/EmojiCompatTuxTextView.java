package com.ss.android.ugc.aweme.emoji.widget;

import android.content.Context;
import android.text.InputFilter;
import android.util.AttributeSet;
import androidx.emoji.widget.g;
import com.bytedance.covode.number.Covode;
import com.bytedance.tux.input.TuxTextView;
import com.ss.android.ugc.aweme.emoji.a.a;
import com.ss.android.ugc.aweme.emoji.lego.EmojiCompatTask;
import h.f.b.l;
import java.util.Objects;

public class EmojiCompatTuxTextView extends TuxTextView {

    /* renamed from: a  reason: collision with root package name */
    private g f89505a;

    static {
        Covode.recordClassIndex(56244);
    }

    public EmojiCompatTuxTextView(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, (byte) 0);
    }

    private final boolean getEnableEmojiCompat() {
        if (!a.a() || !EmojiCompatTask.f89353a) {
            return false;
        }
        return true;
    }

    private final g getEmojiTextViewHelper() {
        if (this.f89505a == null) {
            this.f89505a = new g(this);
        }
        g gVar = this.f89505a;
        Objects.requireNonNull(gVar, "null cannot be cast to non-null type androidx.emoji.widget.EmojiTextViewHelper");
        return gVar;
    }

    public void setAllCaps(boolean z) {
        super.setAllCaps(z);
        if (getEnableEmojiCompat()) {
            getEmojiTextViewHelper().a(z);
        }
    }

    public void setFilters(InputFilter[] inputFilterArr) {
        l.d(inputFilterArr, "");
        if (getEnableEmojiCompat()) {
            super.setFilters(getEmojiTextViewHelper().a(inputFilterArr));
        } else {
            super.setFilters(inputFilterArr);
        }
    }

    private /* synthetic */ EmojiCompatTuxTextView(Context context, AttributeSet attributeSet, byte b2) {
        this(context, attributeSet, (char) 0);
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public EmojiCompatTuxTextView(Context context, AttributeSet attributeSet, char c2) {
        super(context, attributeSet, 0);
        l.d(context, "");
        if (getEnableEmojiCompat()) {
            getEmojiTextViewHelper().f2835a.a();
        }
    }
}
