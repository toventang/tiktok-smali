package com.bytedance.tux.f;

import android.content.Context;
import android.graphics.Color;
import android.text.Spannable;
import android.text.SpannableStringBuilder;
import android.text.TextPaint;
import android.text.style.ForegroundColorSpan;
import android.view.View;
import android.widget.TextView;
import com.bytedance.covode.number.Covode;
import com.bytedance.tux.b.e;
import com.bytedance.tux.b.f;
import com.bytedance.tux.b.g;
import com.bytedance.tux.c.a;
import com.bytedance.tux.f.a.a;
import com.bytedance.tux.h.d;
import com.bytedance.tux.h.i;
import com.zhiliaoapp.musically.R;
import h.f.b.l;
import h.f.b.m;
import h.f.b.z;
import h.z;
import java.util.Map;

public final class c {

    /* renamed from: a  reason: collision with root package name */
    public com.bytedance.tux.c.a f45049a;

    /* renamed from: b  reason: collision with root package name */
    public boolean f45050b = true;

    /* renamed from: c  reason: collision with root package name */
    public int f45051c;

    /* renamed from: d  reason: collision with root package name */
    public int f45052d;

    /* renamed from: e  reason: collision with root package name */
    public boolean f45053e = true;

    /* renamed from: f  reason: collision with root package name */
    public h.f.a.a<z> f45054f;

    /* renamed from: g  reason: collision with root package name */
    private String f45055g;

    /* renamed from: h  reason: collision with root package name */
    private Integer f45056h;

    static final class a extends com.bytedance.tux.f.a.a implements a.AbstractC1104a {

        /* renamed from: a  reason: collision with root package name */
        public static final C1106a f45057a = new C1106a((byte) 0);

        /* renamed from: b  reason: collision with root package name */
        private int f45058b;

        /* renamed from: c  reason: collision with root package name */
        private final h.f.a.a<z> f45059c;

        /* renamed from: d  reason: collision with root package name */
        private final int f45060d;

        static {
            Covode.recordClassIndex(27487);
        }

        /* renamed from: com.bytedance.tux.f.c$a$a  reason: collision with other inner class name */
        public static final class C1106a {
            static {
                Covode.recordClassIndex(27488);
            }

            private C1106a() {
            }

            public /* synthetic */ C1106a(byte b2) {
                this();
            }
        }

        public final void onClick(View view) {
            l.c(view, "");
            h.f.a.a<z> aVar = this.f45059c;
            if (aVar != null) {
                aVar.invoke();
            }
        }

        private final void a(Spannable spannable) {
            Object[] spans = spannable.getSpans(0, spannable.length(), com.bytedance.tux.f.a.c.class);
            l.a((Object) spans, "");
            for (Object obj : spans) {
                ((com.bytedance.tux.f.a.c) obj).a(this.f45058b);
            }
        }

        public final void updateDrawState(TextPaint textPaint) {
            l.c(textPaint, "");
            textPaint.setColor(Color.argb(this.f45058b, Color.red(this.f45060d), Color.green(this.f45060d), Color.blue(this.f45060d)));
        }

        public a(h.f.a.a<z> aVar, int i2) {
            this.f45059c = aVar;
            this.f45060d = i2;
            this.f45058b = Color.alpha(i2);
        }

        @Override // com.bytedance.tux.f.a.a.AbstractC1104a
        public final void b(TextView textView, Spannable spannable) {
            l.c(textView, "");
            l.c(spannable, "");
            this.f45058b = Color.alpha(this.f45060d);
            a(spannable);
        }

        @Override // com.bytedance.tux.f.a.a.AbstractC1104a
        public final void a(TextView textView, Spannable spannable) {
            l.c(textView, "");
            l.c(spannable, "");
            double alpha = (double) Color.alpha(this.f45060d);
            Double.isNaN(alpha);
            this.f45058b = (int) (alpha * 0.75d);
            a(spannable);
        }
    }

    static {
        Covode.recordClassIndex(27486);
    }

    public final c a(int i2) {
        this.f45056h = Integer.valueOf(i2);
        return this;
    }

    /* renamed from: com.bytedance.tux.f.c$c  reason: collision with other inner class name */
    public static final class C1107c extends m implements h.f.a.b<com.bytedance.tux.c.a, z> {
        final /* synthetic */ int $iconRes = R.raw.icon_tips;

        static {
            Covode.recordClassIndex(27490);
        }

        public C1107c() {
            super(1);
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
        @Override // h.f.a.b
        public final /* synthetic */ z invoke(com.bytedance.tux.c.a aVar) {
            com.bytedance.tux.c.a aVar2 = aVar;
            l.c(aVar2, "");
            aVar2.f44749a = this.$iconRes;
            return z.f158842a;
        }
    }

    public final c a(String str) {
        l.c(str, "");
        this.f45055g = str;
        return this;
    }

    static final class b extends m implements h.f.a.b<com.bytedance.tux.c.a, z> {
        final /* synthetic */ z.c $chevronIcon;
        final /* synthetic */ z.c $chevronSize;
        final /* synthetic */ z.c $colorRes;

        static {
            Covode.recordClassIndex(27489);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        b(z.c cVar, z.c cVar2, z.c cVar3) {
            super(1);
            this.$chevronIcon = cVar;
            this.$colorRes = cVar2;
            this.$chevronSize = cVar3;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
        @Override // h.f.a.b
        public final /* synthetic */ h.z invoke(com.bytedance.tux.c.a aVar) {
            com.bytedance.tux.c.a aVar2 = aVar;
            l.c(aVar2, "");
            aVar2.f44749a = this.$chevronIcon.element;
            aVar2.f44753e = Integer.valueOf(this.$colorRes.element);
            aVar2.f44750b = this.$chevronSize.element;
            aVar2.f44751c = this.$chevronSize.element;
            return h.z.f158842a;
        }
    }

    public final CharSequence a(Context context) {
        int i2;
        String str;
        Map<Integer, Object> a2;
        Map<Integer, Object> map;
        l.c(context, "");
        SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder();
        String str2 = this.f45055g;
        Integer num = this.f45056h;
        if (str2 == null) {
            if (num != null) {
                str2 = context.getResources().getString(num.intValue());
                l.a((Object) str2, "");
            } else {
                str2 = "";
            }
        }
        d dVar = new d(str2);
        com.bytedance.tux.c.a aVar = this.f45049a;
        com.bytedance.tux.c.a a3 = aVar != null ? com.bytedance.tux.c.c.a(new a.C1092a(aVar)) : null;
        z.c cVar = new z.c();
        cVar.element = 0;
        z.c cVar2 = new z.c();
        cVar2.element = 0;
        z.c cVar3 = new z.c();
        cVar3.element = 0;
        com.bytedance.tux.b.b a4 = f.a((int) R.attr.apy, this.f45051c);
        if (a4 == null || (map = a4.f44666a) == null) {
            i2 = 0;
        } else {
            i2 = 0;
            for (Map.Entry<Integer, Object> entry : map.entrySet()) {
                int intValue = entry.getKey().intValue();
                if (intValue == R.attr.ap4) {
                    g.l();
                    Object value = entry.getValue();
                    l.c(value, "");
                    dVar.a(((Number) value).intValue());
                } else if (intValue == R.attr.apn) {
                    g.m();
                    Object value2 = entry.getValue();
                    l.c(value2, "");
                    int intValue2 = ((Number) value2).intValue();
                    if (a3 != null) {
                        if (a3.f44750b < 0) {
                            a3.f44750b = intValue2;
                        }
                        if (a3.f44751c < 0) {
                            a3.f44751c = intValue2;
                        }
                    }
                } else if (intValue == R.attr.apw) {
                    g.z();
                    Object value3 = entry.getValue();
                    l.c(value3, "");
                    cVar.element = ((Number) value3).intValue();
                } else if (intValue == R.attr.apx) {
                    g.y();
                    Object value4 = entry.getValue();
                    l.c(value4, "");
                    i2 = ((Number) value4).intValue();
                }
            }
        }
        com.bytedance.tux.b.b a5 = f.a((int) R.attr.apz, this.f45052d);
        if (!(a5 == null || (a2 = a5.a(new e(null, Boolean.valueOf(this.f45053e), 55))) == null)) {
            for (Map.Entry<Integer, Object> entry2 : a2.entrySet()) {
                int intValue3 = entry2.getKey().intValue();
                if (intValue3 == 16842904) {
                    g.g();
                    Object value5 = entry2.getValue();
                    l.c(value5, "");
                    cVar3.element = ((Number) value5).intValue();
                } else if (intValue3 == R.attr.ap8) {
                    g.o();
                    Object value6 = entry2.getValue();
                    l.c(value6, "");
                    cVar2.element = ((Number) value6).intValue();
                }
            }
        }
        if (i.a(context)) {
            str = "‏";
        } else {
            str = "‎";
        }
        spannableStringBuilder.append((CharSequence) str);
        if (a3 != null) {
            l.c(a3, "");
            if (a3.f44752d == null && a3.f44753e == null) {
                a3.f44753e = Integer.valueOf(cVar3.element);
            }
            if (a3.f44749a > 0) {
                com.bytedance.tux.f.a.c b2 = a3.b(context);
                b2.a(i.a(context), i2);
                spannableStringBuilder.append((CharSequence) "*");
                spannableStringBuilder.setSpan(b2, spannableStringBuilder.length() - 1, spannableStringBuilder.length(), 17);
            }
        }
        spannableStringBuilder.append((CharSequence) dVar);
        if (this.f45050b) {
            com.bytedance.tux.f.a.c b3 = com.bytedance.tux.c.c.a(new b(cVar2, cVar3, cVar)).b(context);
            spannableStringBuilder.append((CharSequence) "*");
            int length = spannableStringBuilder.length();
            spannableStringBuilder.setSpan(b3, length - 1, length, 17);
        }
        Integer a6 = d.a(context, cVar3.element);
        if (a6 != null) {
            int intValue4 = a6.intValue();
            if (this.f45054f == null || !this.f45053e) {
                spannableStringBuilder.setSpan(new ForegroundColorSpan(intValue4), 0, spannableStringBuilder.length(), 17);
            } else {
                spannableStringBuilder.setSpan(new a(this.f45054f, intValue4), 0, spannableStringBuilder.length(), 17);
            }
        }
        return spannableStringBuilder;
    }
}
