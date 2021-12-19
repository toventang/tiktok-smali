package androidx.core.f;

import android.os.Build;
import android.text.PrecomputedText;
import android.text.Spannable;
import android.text.TextDirectionHeuristic;
import android.text.TextDirectionHeuristics;
import android.text.TextPaint;
import android.text.TextUtils;
import android.text.style.MetricAffectingSpan;
import com.bytedance.covode.number.Covode;
import java.util.concurrent.Executor;

public class d implements Spannable {

    /* renamed from: b  reason: collision with root package name */
    private static final Object f2368b = new Object();

    /* renamed from: c  reason: collision with root package name */
    private static Executor f2369c = null;

    /* renamed from: a  reason: collision with root package name */
    public final a f2370a;

    /* renamed from: d  reason: collision with root package name */
    private final Spannable f2371d;

    /* renamed from: e  reason: collision with root package name */
    private final PrecomputedText f2372e;

    public int length() {
        return this.f2371d.length();
    }

    public String toString() {
        return this.f2371d.toString();
    }

    public static final class a {

        /* renamed from: a  reason: collision with root package name */
        public final TextPaint f2373a;

        /* renamed from: b  reason: collision with root package name */
        public final TextDirectionHeuristic f2374b;

        /* renamed from: c  reason: collision with root package name */
        public final int f2375c;

        /* renamed from: d  reason: collision with root package name */
        public final int f2376d;

        /* renamed from: e  reason: collision with root package name */
        final PrecomputedText.Params f2377e;

        static {
            Covode.recordClassIndex(756);
        }

        /* renamed from: androidx.core.f.d$a$a  reason: collision with other inner class name */
        public static class C0032a {

            /* renamed from: a  reason: collision with root package name */
            public TextDirectionHeuristic f2378a;

            /* renamed from: b  reason: collision with root package name */
            public int f2379b;

            /* renamed from: c  reason: collision with root package name */
            public int f2380c;

            /* renamed from: d  reason: collision with root package name */
            private final TextPaint f2381d;

            static {
                Covode.recordClassIndex(757);
            }

            public final a a() {
                return new a(this.f2381d, this.f2378a, this.f2379b, this.f2380c);
            }

            public C0032a(TextPaint textPaint) {
                this.f2381d = textPaint;
                if (Build.VERSION.SDK_INT >= 23) {
                    this.f2379b = 1;
                    this.f2380c = 1;
                } else {
                    this.f2380c = 0;
                    this.f2379b = 0;
                }
                int i2 = Build.VERSION.SDK_INT;
                this.f2378a = TextDirectionHeuristics.FIRSTSTRONG_LTR;
            }
        }

        public final int hashCode() {
            if (Build.VERSION.SDK_INT >= 24) {
                return androidx.core.g.d.a(Float.valueOf(this.f2373a.getTextSize()), Float.valueOf(this.f2373a.getTextScaleX()), Float.valueOf(this.f2373a.getTextSkewX()), Float.valueOf(this.f2373a.getLetterSpacing()), Integer.valueOf(this.f2373a.getFlags()), this.f2373a.getTextLocales(), this.f2373a.getTypeface(), Boolean.valueOf(this.f2373a.isElegantTextHeight()), this.f2374b, Integer.valueOf(this.f2375c), Integer.valueOf(this.f2376d));
            } else if (Build.VERSION.SDK_INT >= 21) {
                return androidx.core.g.d.a(Float.valueOf(this.f2373a.getTextSize()), Float.valueOf(this.f2373a.getTextScaleX()), Float.valueOf(this.f2373a.getTextSkewX()), Float.valueOf(this.f2373a.getLetterSpacing()), Integer.valueOf(this.f2373a.getFlags()), this.f2373a.getTextLocale(), this.f2373a.getTypeface(), Boolean.valueOf(this.f2373a.isElegantTextHeight()), this.f2374b, Integer.valueOf(this.f2375c), Integer.valueOf(this.f2376d));
            } else {
                int i2 = Build.VERSION.SDK_INT;
                return androidx.core.g.d.a(Float.valueOf(this.f2373a.getTextSize()), Float.valueOf(this.f2373a.getTextScaleX()), Float.valueOf(this.f2373a.getTextSkewX()), Integer.valueOf(this.f2373a.getFlags()), this.f2373a.getTextLocale(), this.f2373a.getTypeface(), this.f2374b, Integer.valueOf(this.f2375c), Integer.valueOf(this.f2376d));
            }
        }

        public final String toString() {
            StringBuilder sb = new StringBuilder("{");
            sb.append("textSize=" + this.f2373a.getTextSize());
            sb.append(", textScaleX=" + this.f2373a.getTextScaleX());
            sb.append(", textSkewX=" + this.f2373a.getTextSkewX());
            if (Build.VERSION.SDK_INT >= 21) {
                sb.append(", letterSpacing=" + this.f2373a.getLetterSpacing());
                sb.append(", elegantTextHeight=" + this.f2373a.isElegantTextHeight());
            }
            if (Build.VERSION.SDK_INT >= 24) {
                sb.append(", textLocale=" + this.f2373a.getTextLocales());
            } else {
                int i2 = Build.VERSION.SDK_INT;
                sb.append(", textLocale=" + this.f2373a.getTextLocale());
            }
            sb.append(", typeface=" + this.f2373a.getTypeface());
            if (Build.VERSION.SDK_INT >= 26) {
                sb.append(", variationSettings=" + this.f2373a.getFontVariationSettings());
            }
            sb.append(", textDir=" + this.f2374b);
            sb.append(", breakStrategy=" + this.f2375c);
            sb.append(", hyphenationFrequency=" + this.f2376d);
            sb.append("}");
            return sb.toString();
        }

        public final boolean equals(Object obj) {
            if (obj == this) {
                return true;
            }
            if (!(obj instanceof a)) {
                return false;
            }
            a aVar = (a) obj;
            if (!a(aVar)) {
                return false;
            }
            int i2 = Build.VERSION.SDK_INT;
            if (this.f2374b != aVar.f2374b) {
                return false;
            }
            return true;
        }

        public a(PrecomputedText.Params params) {
            this.f2373a = params.getTextPaint();
            this.f2374b = params.getTextDirection();
            this.f2375c = params.getBreakStrategy();
            this.f2376d = params.getHyphenationFrequency();
            this.f2377e = Build.VERSION.SDK_INT < 29 ? null : params;
        }

        public final boolean a(a aVar) {
            if ((Build.VERSION.SDK_INT >= 23 && (this.f2375c != aVar.f2375c || this.f2376d != aVar.f2376d)) || this.f2373a.getTextSize() != aVar.f2373a.getTextSize() || this.f2373a.getTextScaleX() != aVar.f2373a.getTextScaleX() || this.f2373a.getTextSkewX() != aVar.f2373a.getTextSkewX()) {
                return false;
            }
            if ((Build.VERSION.SDK_INT >= 21 && (this.f2373a.getLetterSpacing() != aVar.f2373a.getLetterSpacing() || !TextUtils.equals(this.f2373a.getFontFeatureSettings(), aVar.f2373a.getFontFeatureSettings()))) || this.f2373a.getFlags() != aVar.f2373a.getFlags()) {
                return false;
            }
            if (Build.VERSION.SDK_INT < 24) {
                int i2 = Build.VERSION.SDK_INT;
                if (!this.f2373a.getTextLocale().equals(aVar.f2373a.getTextLocale())) {
                    return false;
                }
            } else if (!this.f2373a.getTextLocales().equals(aVar.f2373a.getTextLocales())) {
                return false;
            }
            if (this.f2373a.getTypeface() == null) {
                if (aVar.f2373a.getTypeface() != null) {
                    return false;
                }
                return true;
            } else if (!this.f2373a.getTypeface().equals(aVar.f2373a.getTypeface())) {
                return false;
            } else {
                return true;
            }
        }

        a(TextPaint textPaint, TextDirectionHeuristic textDirectionHeuristic, int i2, int i3) {
            if (Build.VERSION.SDK_INT >= 29) {
                this.f2377e = new PrecomputedText.Params.Builder(textPaint).setBreakStrategy(i2).setHyphenationFrequency(i3).setTextDirection(textDirectionHeuristic).build();
            } else {
                this.f2377e = null;
            }
            this.f2373a = textPaint;
            this.f2374b = textDirectionHeuristic;
            this.f2375c = i2;
            this.f2376d = i3;
        }
    }

    static {
        Covode.recordClassIndex(755);
    }

    public final PrecomputedText a() {
        Spannable spannable = this.f2371d;
        if (spannable instanceof PrecomputedText) {
            return (PrecomputedText) spannable;
        }
        return null;
    }

    public char charAt(int i2) {
        return this.f2371d.charAt(i2);
    }

    public int getSpanEnd(Object obj) {
        return this.f2371d.getSpanEnd(obj);
    }

    public int getSpanFlags(Object obj) {
        return this.f2371d.getSpanFlags(obj);
    }

    public int getSpanStart(Object obj) {
        return this.f2371d.getSpanStart(obj);
    }

    public void removeSpan(Object obj) {
        if (obj instanceof MetricAffectingSpan) {
            throw new IllegalArgumentException("MetricAffectingSpan can not be removed from PrecomputedText.");
        } else if (Build.VERSION.SDK_INT >= 29) {
            this.f2372e.removeSpan(obj);
        } else {
            this.f2371d.removeSpan(obj);
        }
    }

    public CharSequence subSequence(int i2, int i3) {
        return this.f2371d.subSequence(i2, i3);
    }

    public int nextSpanTransition(int i2, int i3, Class cls) {
        return this.f2371d.nextSpanTransition(i2, i3, cls);
    }

    @Override // android.text.Spanned
    public <T> T[] getSpans(int i2, int i3, Class<T> cls) {
        return Build.VERSION.SDK_INT >= 29 ? (T[]) this.f2372e.getSpans(i2, i3, cls) : (T[]) this.f2371d.getSpans(i2, i3, cls);
    }

    public void setSpan(Object obj, int i2, int i3, int i4) {
        if (obj instanceof MetricAffectingSpan) {
            throw new IllegalArgumentException("MetricAffectingSpan can not be set to PrecomputedText.");
        } else if (Build.VERSION.SDK_INT >= 29) {
            this.f2372e.setSpan(obj, i2, i3, i4);
        } else {
            this.f2371d.setSpan(obj, i2, i3, i4);
        }
    }
}
