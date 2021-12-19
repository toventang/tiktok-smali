package com.ss.android.ugc.aweme.shortvideo.festival;

import android.os.Build;
import android.text.SpannableString;
import android.text.TextUtils;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.core.f.a;
import androidx.core.h.v;
import com.bytedance.common.utility.n;
import com.bytedance.covode.number.Covode;
import com.ss.android.ugc.aweme.port.in.IFestivalService;
import com.ss.android.ugc.aweme.utils.gb;
import com.ss.android.ugc.b;
import java.text.Bidi;

public class FestivalService implements IFestivalService {
    static {
        Covode.recordClassIndex(84244);
    }

    @Override // com.ss.android.ugc.aweme.port.in.IFestivalService
    public final String a() {
        return n.a().c();
    }

    public static IFestivalService b() {
        Object a2 = b.a(IFestivalService.class, false);
        if (a2 != null) {
            return (IFestivalService) a2;
        }
        return new FestivalService();
    }

    @Override // com.ss.android.ugc.aweme.port.in.IFestivalService
    public final void a(String str, TextView textView, ViewGroup viewGroup, TextView textView2, ImageView imageView) {
        int i2;
        int i3;
        String replaceAll;
        String charSequence;
        int i4;
        if (!TextUtils.isEmpty(str)) {
            int a2 = (int) (((float) n.a(textView.getContext())) - n.b(textView.getContext(), 32.0f));
            if (gb.a(textView.getContext())) {
                i2 = -1;
            } else {
                i2 = -2;
            }
            boolean baseIsLeftToRight = new Bidi(str, i2).baseIsLeftToRight();
            boolean a3 = gb.a(viewGroup.getContext());
            v.b((View) textView.getParent(), !baseIsLeftToRight);
            int i5 = 3;
            if (baseIsLeftToRight != 0) {
                i3 = 3;
            } else {
                i3 = 5;
            }
            textView.setGravity(i3);
            int i6 = Build.VERSION.SDK_INT;
            if (baseIsLeftToRight == 0) {
                i5 = 2;
            }
            textView.setTextDirection(i5);
            viewGroup.setLayoutDirection(a3 ? 1 : 0);
            String b2 = a.a(!baseIsLeftToRight).b(str);
            if (baseIsLeftToRight != 0) {
                replaceAll = "‭" + b2 + (char) 8237;
            } else {
                replaceAll = b2.replaceAll("(?<!^)(#)([a-zA-Z0-9])", "‎$1‎$2");
            }
            SpannableString spannableString = new SpannableString(replaceAll);
            if (textView2 == null) {
                charSequence = "";
            } else {
                charSequence = textView2.getText().toString();
            }
            k kVar = new k(textView.getPaint(), a2, charSequence);
            SpannableString a4 = kVar.a(spannableString);
            boolean z = kVar.f128501b;
            textView.setText(a4);
            int i7 = 8;
            if (z) {
                if (!TextUtils.isEmpty(replaceAll)) {
                    i4 = 0;
                } else {
                    i4 = 8;
                }
                textView2.setVisibility(i4);
                if (!TextUtils.isEmpty(replaceAll)) {
                    i7 = 0;
                }
                imageView.setVisibility(i7);
                textView.post(new b(textView, spannableString, imageView, textView2, viewGroup, a4));
                return;
            }
            imageView.setVisibility(8);
            textView2.setVisibility(8);
        }
    }
}
