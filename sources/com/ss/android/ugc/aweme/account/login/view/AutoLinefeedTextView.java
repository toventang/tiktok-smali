package com.ss.android.ugc.aweme.account.login.view;

import android.content.Context;
import android.text.TextPaint;
import android.util.AttributeSet;
import com.bytedance.covode.number.Covode;
import com.bytedance.ies.dmt.ui.widget.DmtTextView;
import h.f.b.l;
import h.m.p;

public final class AutoLinefeedTextView extends DmtTextView {
    static {
        Covode.recordClassIndex(40014);
    }

    public AutoLinefeedTextView(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, (byte) 0);
    }

    static final class a implements Runnable {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ AutoLinefeedTextView f65103a;

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ String f65104b;

        static {
            Covode.recordClassIndex(40015);
        }

        a(AutoLinefeedTextView autoLinefeedTextView, String str) {
            this.f65103a = autoLinefeedTextView;
            this.f65104b = str;
        }

        public final void run() {
            String str = this.f65104b;
            if (str != null && str.length() != 0 && this.f65103a.getMeasuredWidth() != 0 && this.f65103a.getMeasuredHeight() != 0) {
                CharSequence text = this.f65103a.getText();
                l.b(text, "");
                int a2 = p.a(text, this.f65104b, 0, false, 6);
                if (a2 != -1) {
                    TextPaint paint = this.f65103a.getPaint();
                    CharSequence text2 = this.f65103a.getText();
                    l.b(text2, "");
                    int measureText = (int) paint.measureText(text2.subSequence(0, a2 + 2).toString());
                    TextPaint paint2 = this.f65103a.getPaint();
                    CharSequence text3 = this.f65103a.getText();
                    l.b(text3, "");
                    if (measureText / this.f65103a.getMeasuredWidth() != ((int) paint2.measureText(text3.subSequence(0, ((this.f65104b.length() + a2) - 1) + 1).toString())) / this.f65103a.getMeasuredWidth()) {
                        this.f65103a.setText(new StringBuffer(this.f65103a.getText().toString()).insert(a2, "\n").toString());
                    }
                }
            }
        }
    }

    private /* synthetic */ AutoLinefeedTextView(Context context, AttributeSet attributeSet, byte b2) {
        this(context, attributeSet, (char) 0);
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    private AutoLinefeedTextView(Context context, AttributeSet attributeSet, char c2) {
        super(context, attributeSet, 16842884);
        l.d(context, "");
    }
}
