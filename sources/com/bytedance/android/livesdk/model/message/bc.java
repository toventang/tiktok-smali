package com.bytedance.android.livesdk.model.message;

import android.graphics.Color;
import android.text.SpannableStringBuilder;
import android.text.TextUtils;
import android.text.style.ForegroundColorSpan;
import com.bytedance.covode.number.Covode;
import com.google.gson.a.c;
import java.util.List;

public class bc {
    @c(a = "high_light_color")

    /* renamed from: a  reason: collision with root package name */
    public String f19304a;
    @c(a = "contents")

    /* renamed from: b  reason: collision with root package name */
    public List<bb> f19305b;

    static {
        Covode.recordClassIndex(11468);
    }

    public final CharSequence a() {
        List<bb> list = this.f19305b;
        if (list == null || list.size() <= 0) {
            return "";
        }
        int i2 = -1;
        boolean z = false;
        String str = this.f19304a;
        if (str != null) {
            try {
                i2 = Color.parseColor(str);
                z = true;
            } catch (IllegalArgumentException unused) {
            }
        }
        SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder();
        ForegroundColorSpan foregroundColorSpan = new ForegroundColorSpan(i2);
        for (bb bbVar : this.f19305b) {
            if (bbVar != null && !TextUtils.isEmpty(bbVar.f19302a)) {
                spannableStringBuilder.append((CharSequence) bbVar.f19302a);
                if (z && bbVar.f19303b) {
                    spannableStringBuilder.setSpan(foregroundColorSpan, spannableStringBuilder.length() - bbVar.f19302a.length(), spannableStringBuilder.length(), 33);
                }
            }
        }
        return spannableStringBuilder;
    }
}
