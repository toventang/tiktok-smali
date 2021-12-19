package com.ss.android.ugc.aweme.utils;

import android.content.Context;
import android.content.res.Resources;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.text.Spannable;
import android.text.SpannableStringBuilder;
import android.util.TypedValue;
import android.widget.TextView;
import com.bytedance.covode.number.Covode;
import com.bytedance.tux.h.i;
import h.f.b.l;
import h.f.b.m;
import h.m.p;
import h.z;
import java.util.Objects;

public final class hv {
    static {
        Covode.recordClassIndex(93649);
    }

    static final class a extends m implements h.f.a.a<z> {
        final /* synthetic */ h.f.a.b $reorderTask;
        final /* synthetic */ SpannableStringBuilder $spannable;

        static {
            Covode.recordClassIndex(93650);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        a(h.f.a.b bVar, SpannableStringBuilder spannableStringBuilder) {
            super(0);
            this.$reorderTask = bVar;
            this.$spannable = spannableStringBuilder;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        @Override // h.f.a.a
        public final /* bridge */ /* synthetic */ z invoke() {
            this.$reorderTask.invoke(this.$spannable);
            return z.f158842a;
        }
    }

    static final class b extends m implements h.f.a.b<CharSequence, z> {
        final /* synthetic */ Drawable $drawable;
        final /* synthetic */ int $drawableStartMarginDp = 2;
        final /* synthetic */ TextView $this_setTextWithBeautyBreakLine;

        static {
            Covode.recordClassIndex(93651);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        b(TextView textView, Drawable drawable, int i2) {
            super(1);
            this.$this_setTextWithBeautyBreakLine = textView;
            this.$drawable = drawable;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
        @Override // h.f.a.b
        public final /* synthetic */ z invoke(CharSequence charSequence) {
            int a2;
            CharSequence charSequence2 = charSequence;
            l.d(charSequence2, "");
            int lineCount = this.$this_setTextWithBeautyBreakLine.getLineCount() - 1;
            if (lineCount > 0) {
                String a3 = hv.a(charSequence2, this.$this_setTextWithBeautyBreakLine.getLayout().getLineStart(lineCount), this.$this_setTextWithBeautyBreakLine.getLayout().getLineEnd(lineCount));
                if (a3.length() != 0 && !(!p.a((CharSequence) a3))) {
                    int i2 = lineCount - 1;
                    String a4 = hv.a(charSequence2, this.$this_setTextWithBeautyBreakLine.getLayout().getLineStart(i2), this.$this_setTextWithBeautyBreakLine.getLayout().getLineEnd(i2));
                    String a5 = hv.a(a4, p.a((CharSequence) a4, " ") + 1, a4.length());
                    Objects.requireNonNull(a5, "null cannot be cast to non-null type kotlin.CharSequence");
                    String obj = p.b((CharSequence) a5).toString();
                    int a6 = p.a(charSequence2, obj);
                    SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder();
                    spannableStringBuilder.append((CharSequence) hv.a(charSequence2, 0, a6));
                    spannableStringBuilder.append((CharSequence) "\n");
                    spannableStringBuilder.append((CharSequence) obj);
                    spannableStringBuilder.append((CharSequence) "  ");
                    int length = spannableStringBuilder.length() - 2;
                    int length2 = spannableStringBuilder.length() - 1;
                    boolean a7 = i.a(this.$this_setTextWithBeautyBreakLine);
                    com.bytedance.ies.dmt.ui.common.a aVar = new com.bytedance.ies.dmt.ui.common.a(this.$drawable);
                    if (a7) {
                        float f2 = (float) this.$drawableStartMarginDp;
                        Resources system = Resources.getSystem();
                        l.a((Object) system, "");
                        a2 = h.g.a.a(TypedValue.applyDimension(1, f2, system.getDisplayMetrics())) * -1;
                    } else {
                        float f3 = (float) this.$drawableStartMarginDp;
                        Resources system2 = Resources.getSystem();
                        l.a((Object) system2, "");
                        a2 = h.g.a.a(TypedValue.applyDimension(1, f3, system2.getDisplayMetrics()));
                    }
                    aVar.f33344a = a2;
                    spannableStringBuilder.setSpan(aVar, length, length2, 18);
                    hv.a(this.$this_setTextWithBeautyBreakLine, spannableStringBuilder);
                }
            }
            return z.f158842a;
        }
    }

    public static final void a(TextView textView, Spannable spannable) {
        l.d(textView, "");
        l.d(spannable, "");
        textView.setText(spannable, TextView.BufferType.SPANNABLE);
    }

    public static final String a(CharSequence charSequence, int i2, int i3) {
        l.d(charSequence, "");
        if (i2 < 0 || i3 > charSequence.length() || i2 > i3) {
            return "";
        }
        return charSequence.subSequence(i2, i3).toString();
    }

    /* JADX WARNING: Code restructure failed: missing block: B:25:0x0065, code lost:
        if (h.m.l.find$default(r0, r3, 0, 2, null) != null) goto L_0x0029;
     */
    /* JADX WARNING: Removed duplicated region for block: B:27:0x006a  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static final void a(android.widget.TextView r7, java.lang.String r8, android.graphics.drawable.Drawable r9) {
        /*
        // Method dump skipped, instructions count: 152
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ss.android.ugc.aweme.utils.hv.a(android.widget.TextView, java.lang.String, android.graphics.drawable.Drawable):void");
    }

    private static SpannableStringBuilder a(Context context, String str, Drawable drawable, int i2) {
        int a2;
        if (str != null) {
            Objects.requireNonNull(str, "null cannot be cast to non-null type kotlin.CharSequence");
            String obj = p.b((CharSequence) str).toString();
            if (obj == null) {
                obj = "";
            }
            boolean z = false;
            if (!(str == null || str.length() == 0 || drawable == null)) {
                Rect bounds = drawable.getBounds();
                l.b(bounds, "");
                if (!bounds.isEmpty()) {
                    SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder();
                    spannableStringBuilder.append((CharSequence) obj);
                    spannableStringBuilder.append((CharSequence) "  ");
                    int length = (obj.length() + 2) - 1;
                    if (context != null && i.a(context)) {
                        z = true;
                    }
                    com.bytedance.ies.dmt.ui.common.a aVar = new com.bytedance.ies.dmt.ui.common.a(drawable);
                    if (z) {
                        Resources system = Resources.getSystem();
                        l.a((Object) system, "");
                        a2 = h.g.a.a(TypedValue.applyDimension(1, 2.0f, system.getDisplayMetrics())) * -1;
                    } else {
                        Resources system2 = Resources.getSystem();
                        l.a((Object) system2, "");
                        a2 = h.g.a.a(TypedValue.applyDimension(1, 2.0f, system2.getDisplayMetrics()));
                    }
                    aVar.f33344a = a2;
                    spannableStringBuilder.setSpan(aVar, length - 1, length, 18);
                    return spannableStringBuilder;
                }
            }
        }
        return new SpannableStringBuilder();
    }
}
