package com.ss.android.ugc.aweme.search.view;

import android.content.Context;
import android.text.TextPaint;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.view.ViewTreeObserver;
import com.bytedance.covode.number.Covode;
import com.bytedance.ies.dmt.ui.widget.DmtTextView;

public class AutoLineTextView extends DmtTextView {

    /* renamed from: a  reason: collision with root package name */
    public Context f121746a;

    static {
        Covode.recordClassIndex(79293);
    }

    class a implements ViewTreeObserver.OnGlobalLayoutListener {
        static {
            Covode.recordClassIndex(79294);
        }

        public final void onGlobalLayout() {
            AutoLineTextView.this.getViewTreeObserver().removeOnGlobalLayoutListener(this);
            AutoLineTextView autoLineTextView = AutoLineTextView.this;
            String charSequence = autoLineTextView.getText().toString();
            TextPaint paint = autoLineTextView.getPaint();
            float width = (float) ((autoLineTextView.getWidth() - autoLineTextView.getPaddingLeft()) - autoLineTextView.getPaddingRight());
            String[] split = charSequence.replaceAll("\r", "").split("\n");
            StringBuilder sb = new StringBuilder();
            for (String str : split) {
                if (paint.measureText(str) <= width) {
                    sb.append(str);
                } else {
                    int i2 = 0;
                    float f2 = 0.0f;
                    while (i2 != str.length()) {
                        char charAt = str.charAt(i2);
                        f2 += paint.measureText(String.valueOf(charAt));
                        if (f2 <= width) {
                            sb.append(charAt);
                        } else {
                            sb.append("\n");
                            i2--;
                            f2 = 0.0f;
                        }
                        i2++;
                    }
                }
                sb.append("\n");
            }
            if (!charSequence.endsWith("\n")) {
                sb.deleteCharAt(sb.length() - 1);
            }
            String sb2 = sb.toString();
            if (!TextUtils.isEmpty(sb2)) {
                AutoLineTextView.this.setText(sb2);
            }
        }

        private a() {
        }

        /* synthetic */ a(AutoLineTextView autoLineTextView, byte b2) {
            this();
        }
    }

    public void setAutoLineText(CharSequence charSequence) {
        getViewTreeObserver().addOnGlobalLayoutListener(new a(this, (byte) 0));
        setText(charSequence);
    }

    public AutoLineTextView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.f121746a = context;
    }
}
