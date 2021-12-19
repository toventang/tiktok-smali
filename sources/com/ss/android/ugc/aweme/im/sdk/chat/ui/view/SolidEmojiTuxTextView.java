package com.ss.android.ugc.aweme.im.sdk.chat.ui.view;

import android.content.Context;
import android.text.SpannableString;
import android.text.style.ForegroundColorSpan;
import android.util.AttributeSet;
import android.widget.TextView;
import com.bytedance.covode.number.Covode;
import com.bytedance.tux.input.TuxTextView;
import com.ss.android.ugc.aweme.emoji.a.a;
import com.ss.android.ugc.aweme.emoji.lego.EmojiCompatTask;
import h.f.b.l;
import h.j.g;

public final class SolidEmojiTuxTextView extends TuxTextView {

    /* renamed from: a  reason: collision with root package name */
    private final String f101250a;

    /* renamed from: b  reason: collision with root package name */
    private int f101251b;

    static {
        Covode.recordClassIndex(64768);
    }

    public SolidEmojiTuxTextView(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, (byte) 0);
    }

    private final boolean getEnableEmojiCompat() {
        if (!a.a() || !EmojiCompatTask.f89353a) {
            return false;
        }
        return true;
    }

    @Override // android.widget.TextView
    public final void setTextColor(int i2) {
        if (getEnableEmojiCompat()) {
            this.f101251b = i2;
        } else {
            super.setTextColor(i2);
        }
    }

    @Override // com.bytedance.tux.input.TuxTextView, android.widget.TextView
    public final void setText(CharSequence charSequence, TextView.BufferType bufferType) {
        if (!getEnableEmojiCompat() || charSequence == null || charSequence.length() == 0) {
            super.setText(charSequence, bufferType);
            return;
        }
        if (EmojiCompatTask.f89353a) {
            try {
                CharSequence a2 = androidx.emoji.a.a.a().a(charSequence);
                l.b(a2, "");
                SpannableString valueOf = SpannableString.valueOf(a2);
                l.a((Object) valueOf, "");
                g gVar = new g(0, valueOf.length());
                valueOf.setSpan(new ForegroundColorSpan(this.f101251b), Integer.valueOf(gVar.f158747a).intValue(), Integer.valueOf(gVar.f158748b).intValue(), 17);
                charSequence = valueOf;
            } catch (IllegalAccessException unused) {
                String str = this.f101250a;
                l.b(str, "");
                com.ss.android.ugc.aweme.im.service.m.a.e(str, "EmojiCompat not initialized");
            }
        }
        super.setText(charSequence, bufferType);
    }

    private /* synthetic */ SolidEmojiTuxTextView(Context context, AttributeSet attributeSet, byte b2) {
        this(context, attributeSet, (char) 0);
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    private SolidEmojiTuxTextView(Context context, AttributeSet attributeSet, char c2) {
        super(context, attributeSet, 0);
        l.d(context, "");
        this.f101250a = getClass().getSimpleName();
    }
}
