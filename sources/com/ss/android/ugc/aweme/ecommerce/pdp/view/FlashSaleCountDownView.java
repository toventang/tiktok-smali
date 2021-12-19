package com.ss.android.ugc.aweme.ecommerce.pdp.view;

import android.content.Context;
import android.content.res.Resources;
import android.text.SpannableString;
import android.text.SpannableStringBuilder;
import android.util.AttributeSet;
import android.util.TypedValue;
import androidx.core.content.b;
import com.bytedance.covode.number.Covode;
import com.bytedance.tux.f.d;
import com.bytedance.tux.h.i;
import com.bytedance.tux.input.TuxTextView;
import com.ss.android.ugc.aweme.ecommerce.util.n;
import com.zhiliaoapp.musically.R;
import h.f.b.l;
import h.m.p;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.List;
import java.util.Locale;
import java.util.TimeZone;

public final class FlashSaleCountDownView extends TuxTextView {

    /* renamed from: a  reason: collision with root package name */
    public static final SimpleDateFormat f86823a = new SimpleDateFormat("HH:mm:ss", Locale.ENGLISH);

    /* renamed from: b  reason: collision with root package name */
    public static final a f86824b = new a((byte) 0);

    public FlashSaleCountDownView(Context context) {
        this(context, (AttributeSet) null, 6);
    }

    public FlashSaleCountDownView(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 4);
    }

    public static final class a {
        static {
            Covode.recordClassIndex(54401);
        }

        private a() {
        }

        public /* synthetic */ a(byte b2) {
            this();
        }
    }

    static {
        Covode.recordClassIndex(54400);
    }

    private static /* synthetic */ a a(FlashSaleCountDownView flashSaleCountDownView) {
        Resources system = Resources.getSystem();
        l.a((Object) system, "");
        return flashSaleCountDownView.b(TypedValue.applyDimension(1, 2.0f, system.getDisplayMetrics()));
    }

    private final a b(float f2) {
        a aVar = new a();
        Resources system = Resources.getSystem();
        l.a((Object) system, "");
        aVar.f86834d.set(TypedValue.applyDimension(1, 2.0f, system.getDisplayMetrics()), 0.0f, f2, 0.0f);
        Resources system2 = Resources.getSystem();
        l.a((Object) system2, "");
        float applyDimension = TypedValue.applyDimension(1, 2.0f, system2.getDisplayMetrics());
        Resources system3 = Resources.getSystem();
        l.a((Object) system3, "");
        aVar.f86833c.set(applyDimension, 0.0f, TypedValue.applyDimension(1, 2.0f, system3.getDisplayMetrics()), 0.0f);
        Resources system4 = Resources.getSystem();
        l.a((Object) system4, "");
        aVar.f86835e = TypedValue.applyDimension(1, 2.0f, system4.getDisplayMetrics());
        Resources system5 = Resources.getSystem();
        l.a((Object) system5, "");
        aVar.f86831a = TypedValue.applyDimension(1, 16.0f, system5.getDisplayMetrics());
        Resources system6 = Resources.getSystem();
        l.a((Object) system6, "");
        aVar.f86836f = TypedValue.applyDimension(1, 12.0f, system6.getDisplayMetrics());
        aVar.f86832b = b.c(getContext(), R.color.bx);
        return aVar;
    }

    public final void a(long j2, TuxTextView tuxTextView) {
        if (j2 <= 0) {
            setText("");
        } else if (j2 >= 86400000) {
            String valueOf = String.valueOf((int) ((((((float) j2) / 1000.0f) / 60.0f) / 60.0f) / 24.0f));
            setTuxFont(71);
            Context context = getContext();
            l.b(context, "");
            SpannableString spannableString = new SpannableString(context.getResources().getQuantityString(R.plurals.bg, Integer.parseInt(valueOf), valueOf.toString()));
            int a2 = p.a((CharSequence) spannableString, valueOf, 0, false, 6);
            if (a2 != -1) {
                spannableString.setSpan(new com.bytedance.tux.f.a.b(72, true), a2, valueOf.length() + a2, 33);
            }
            setText(spannableString);
            if (tuxTextView != null) {
                tuxTextView.setVisibility(8);
            }
        } else {
            setTuxFont(92);
            if (tuxTextView != null) {
                tuxTextView.setVisibility(0);
            }
            String format = f86823a.format(new Date(j2));
            l.b(format, "");
            List c2 = p.c(format, new String[]{":"});
            String str = (String) c2.get(0);
            String str2 = (String) c2.get(1);
            String str3 = (String) c2.get(2);
            d dVar = new d(":");
            dVar.a(62);
            SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder();
            Context context2 = getContext();
            l.b(context2, "");
            if (i.a(context2)) {
                n.a(spannableStringBuilder, str3, a(this));
                spannableStringBuilder.append((CharSequence) dVar);
                n.a(spannableStringBuilder, str2, a(this));
                spannableStringBuilder.append((CharSequence) dVar);
                n.a(spannableStringBuilder, str, a(this));
            } else {
                n.a(spannableStringBuilder, str, a(this));
                spannableStringBuilder.append((CharSequence) dVar);
                n.a(spannableStringBuilder, str2, a(this));
                spannableStringBuilder.append((CharSequence) dVar);
                n.a(spannableStringBuilder, str3, b(0.0f));
            }
            setText(spannableStringBuilder);
        }
    }

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    private /* synthetic */ FlashSaleCountDownView(Context context, AttributeSet attributeSet, int i2) {
        this(context, (i2 & 2) != 0 ? null : attributeSet, (byte) 0);
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    private FlashSaleCountDownView(Context context, AttributeSet attributeSet, byte b2) {
        super(context, attributeSet, 0);
        l.d(context, "");
        if (isInEditMode()) {
            a(86339999, null);
        }
        f86823a.setTimeZone(TimeZone.getTimeZone("GMT"));
    }
}
