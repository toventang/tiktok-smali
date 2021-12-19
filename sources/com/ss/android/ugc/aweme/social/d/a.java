package com.ss.android.ugc.aweme.social.d;

import android.os.Build;
import android.os.Looper;
import android.os.SystemClock;
import android.text.Layout;
import android.text.StaticLayout;
import android.text.TextDirectionHeuristic;
import android.text.TextDirectionHeuristics;
import android.text.TextUtils;
import com.bytedance.covode.number.Covode;
import com.bytedance.tux.input.TuxTextView;
import h.f.b.l;
import h.f.b.m;
import h.z;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Objects;
import java.util.concurrent.Callable;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public final class a {
    static {
        Covode.recordClassIndex(87447);
    }

    public static final class c<V> implements Callable {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ TuxTextView f133677a;

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ String f133678b;

        /* renamed from: c  reason: collision with root package name */
        final /* synthetic */ String f133679c;

        /* renamed from: d  reason: collision with root package name */
        final /* synthetic */ int f133680d;

        /* renamed from: e  reason: collision with root package name */
        final /* synthetic */ b f133681e;

        static {
            Covode.recordClassIndex(87451);
        }

        public c(TuxTextView tuxTextView, String str, String str2, int i2, b bVar) {
            this.f133677a = tuxTextView;
            this.f133678b = str;
            this.f133679c = str2;
            this.f133680d = i2;
            this.f133681e = bVar;
        }

        @Override // java.util.concurrent.Callable
        public final /* synthetic */ Object call() {
            ArrayList arrayList;
            TuxTextView tuxTextView = this.f133677a;
            String str = this.f133678b;
            String str2 = this.f133679c;
            int i2 = this.f133680d;
            if (TextUtils.isEmpty(str2)) {
                arrayList = null;
            } else {
                ArrayList<String> arrayList2 = new ArrayList();
                Matcher matcher = Pattern.compile("(?:[\\uD83C\\uDF00-\\uD83D\\uDDFF]|[\\uD83E\\uDD00-\\uD83E\\uDDFF]|[\\uD83D\\uDE00-\\uD83D\\uDE4F]|[\\uD83D\\uDE80-\\uD83D\\uDEFF]|[\\u2600-\\u26FF]\\uFE0F?|[\\u2700-\\u27BF]\\uFE0F?|\\u24C2\\uFE0F?|[\\uD83C\\uDDE6-\\uD83C\\uDDFF]{1,2}|[\\uD83C\\uDD70\\uD83C\\uDD71\\uD83C\\uDD7E\\uD83C\\uDD7F\\uD83C\\uDD8E\\uD83C\\uDD91-\\uD83C\\uDD9A]\\uFE0F?|[\\u0023\\u002A\\u0030-\\u0039]\\uFE0F?\\u20E3|[\\u2194-\\u2199\\u21A9-\\u21AA]\\uFE0F?|[\\u2B05-\\u2B07\\u2B1B\\u2B1C\\u2B50\\u2B55]\\uFE0F?|[\\u2934\\u2935]\\uFE0F?|[\\u3030\\u303D]\\uFE0F?|[\\u3297\\u3299]\\uFE0F?|[\\uD83C\\uDE01\\uD83C\\uDE02\\uD83C\\uDE1A\\uD83C\\uDE2F\\uD83C\\uDE32-\\uD83C\\uDE3A\\uD83C\\uDE50\\uD83C\\uDE51]\\uFE0F?|[\\u203C\\u2049]\\uFE0F?|[\\u25AA\\u25AB\\u25B6\\u25C0\\u25FB-\\u25FE]\\uFE0F?|[\\u00A9\\u00AE]\\uFE0F?|[\\u2122\\u2139]\\uFE0F?|\\uD83C\\uDC04\\uFE0F?|\\uD83C\\uDCCF\\uFE0F?|[\\u231A\\u231B\\u2328\\u23CF\\u23E9-\\u23F3\\u23F8-\\u23FA]\\uFE0F?)").matcher(str2);
                while (matcher.find()) {
                    arrayList2.add(matcher.group());
                }
                StringBuilder sb = new StringBuilder(str2);
                arrayList = new ArrayList();
                for (String str3 : arrayList2) {
                    int indexOf = sb.indexOf(str3);
                    int length = str3.length() + indexOf;
                    arrayList.add(new int[]{indexOf, length});
                    sb.delete(0, length);
                }
            }
            l.b(arrayList, "");
            C3464a aVar = new C3464a(arrayList);
            int length2 = str2.length() - 1;
            while (true) {
                if (length2 < 0) {
                    break;
                }
                if (!aVar.a(length2)) {
                    StringBuilder sb2 = new StringBuilder();
                    Objects.requireNonNull(str2, "null cannot be cast to non-null type java.lang.String");
                    String substring = str2.substring(0, length2);
                    l.b(substring, "");
                    String a2 = com.a.a(str, Arrays.copyOf(new Object[]{sb2.append(substring).append("…").toString()}, 1));
                    l.b(a2, "");
                    if (!a.a(tuxTextView, a2, i2)) {
                        str = a2;
                        break;
                    }
                }
                length2--;
            }
            this.f133681e.a(str);
            return z.f158842a;
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.social.d.a$a  reason: collision with other inner class name */
    static final class C3464a extends m implements h.f.a.b<Integer, Boolean> {
        final /* synthetic */ List $emojiRange;

        static {
            Covode.recordClassIndex(87448);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C3464a(List list) {
            super(1);
            this.$emojiRange = list;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
        @Override // h.f.a.b
        public final /* synthetic */ Boolean invoke(Integer num) {
            return Boolean.valueOf(a(num.intValue()));
        }

        public final boolean a(int i2) {
            for (int[] iArr : this.$emojiRange) {
                if (iArr.length >= 2) {
                    int i3 = iArr[0];
                    int i4 = iArr[1];
                    if (i3 <= i2 && i4 >= i2) {
                        return true;
                    }
                }
            }
            return false;
        }
    }

    public static final class b extends m implements h.f.a.b<CharSequence, z> {
        final /* synthetic */ long $start;
        final /* synthetic */ TuxTextView $this_setOptimizeReasonInternal;

        static {
            Covode.recordClassIndex(87449);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public b(TuxTextView tuxTextView, long j2) {
            super(1);
            this.$this_setOptimizeReasonInternal = tuxTextView;
            this.$start = j2;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
        @Override // h.f.a.b
        public final /* synthetic */ z invoke(CharSequence charSequence) {
            a(charSequence);
            return z.f158842a;
        }

        public final void a(final CharSequence charSequence) {
            l.d(charSequence, "");
            new StringBuilder("final set text: ").append(charSequence).append(". cost: ").append(SystemClock.uptimeMillis() - this.$start);
            if (l.a(Looper.myLooper(), Looper.getMainLooper())) {
                this.$this_setOptimizeReasonInternal.setText(charSequence);
            } else {
                this.$this_setOptimizeReasonInternal.post(new Runnable(this) {
                    /* class com.ss.android.ugc.aweme.social.d.a.b.AnonymousClass1 */

                    /* renamed from: a  reason: collision with root package name */
                    final /* synthetic */ b f133675a;

                    static {
                        Covode.recordClassIndex(87450);
                    }

                    {
                        this.f133675a = r1;
                    }

                    public final void run() {
                        this.f133675a.$this_setOptimizeReasonInternal.setText(charSequence);
                    }
                });
            }
        }
    }

    public static final boolean a(TuxTextView tuxTextView, String str, int i2) {
        TextDirectionHeuristic textDirectionHeuristic;
        int maxLines;
        StaticLayout build;
        if (Build.VERSION.SDK_INT < 23) {
            build = new StaticLayout(str, tuxTextView.getPaint(), i2, Layout.Alignment.ALIGN_NORMAL, tuxTextView.getLineSpacingMultiplier(), tuxTextView.getLineSpacingExtra(), tuxTextView.getIncludeFontPadding());
        } else {
            if (Build.VERSION.SDK_INT >= 29) {
                textDirectionHeuristic = tuxTextView.getTextDirectionHeuristic();
            } else {
                textDirectionHeuristic = TextDirectionHeuristics.FIRSTSTRONG_LTR;
            }
            StaticLayout.Builder hyphenationFrequency = StaticLayout.Builder.obtain(str, 0, str.length(), tuxTextView.getPaint(), i2).setLineSpacing(tuxTextView.getLineSpacingExtra(), tuxTextView.getLineSpacingMultiplier()).setIncludePad(tuxTextView.getIncludeFontPadding()).setBreakStrategy(tuxTextView.getBreakStrategy()).setHyphenationFrequency(tuxTextView.getHyphenationFrequency());
            if (tuxTextView.getMaxLines() == -1) {
                maxLines = Integer.MAX_VALUE;
            } else {
                maxLines = tuxTextView.getMaxLines();
            }
            build = hyphenationFrequency.setMaxLines(maxLines).setTextDirection(textDirectionHeuristic).build();
            l.b(build, "");
        }
        if (tuxTextView.getMaxLines() == -1 || (build.getLineCount() <= tuxTextView.getMaxLines() && build.getLineEnd(build.getLineCount() - 1) == str.length())) {
            return false;
        }
        return true;
    }
}
