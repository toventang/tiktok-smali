package com.ss.android.ugc.aweme.commerce_challenge_impl.d;

import android.graphics.Bitmap;
import android.graphics.Matrix;
import android.graphics.drawable.BitmapDrawable;
import android.text.SpannableStringBuilder;
import android.text.TextUtils;
import android.widget.TextView;
import com.bytedance.covode.number.Covode;
import com.bytedance.frameworks.apm.trace.MethodCollector;
import com.ss.android.ugc.aweme.base.model.UrlModel;
import com.ss.android.ugc.aweme.common.r;
import com.ss.android.ugc.aweme.feed.model.Aweme;
import com.ss.android.ugc.aweme.model.TextExtraStruct;
import com.ss.android.ugc.aweme.views.MentionTextView;
import h.f.b.l;
import h.f.b.z;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.Objects;
import java.util.concurrent.ConcurrentHashMap;

public final class c {

    /* renamed from: a  reason: collision with root package name */
    public static ConcurrentHashMap<String, com.ss.android.ugc.aweme.commerce_challenge_api.b.b> f73554a = new ConcurrentHashMap<>();

    /* renamed from: b  reason: collision with root package name */
    public static boolean f73555b;

    /* renamed from: c  reason: collision with root package name */
    public static LinkedHashMap<String, Bitmap> f73556c = new LinkedHashMap<>(30, 0.75f, true);

    /* renamed from: d  reason: collision with root package name */
    public static final c f73557d = new c();

    /* renamed from: e  reason: collision with root package name */
    private static boolean f73558e;

    private c() {
    }

    public static final ConcurrentHashMap<String, com.ss.android.ugc.aweme.commerce_challenge_api.b.b> a() {
        if (f73558e) {
            return f73554a;
        }
        f73558e = true;
        ConcurrentHashMap<String, com.ss.android.ugc.aweme.commerce_challenge_api.b.b> a2 = com.ss.android.ugc.aweme.commerce_challenge_impl.c.c.a();
        f73554a = a2;
        return a2;
    }

    static {
        Covode.recordClassIndex(45270);
    }

    public static final class b<T> implements com.ss.android.ugc.aweme.base.e.a.a {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ MentionTextView f73565a;

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ TextExtraStruct f73566b;

        /* renamed from: c  reason: collision with root package name */
        final /* synthetic */ String f73567c;

        static {
            Covode.recordClassIndex(45272);
        }

        public b(MentionTextView mentionTextView, TextExtraStruct textExtraStruct, String str) {
            this.f73565a = mentionTextView;
            this.f73566b = textExtraStruct;
            this.f73567c = str;
        }

        @Override // com.ss.android.ugc.aweme.base.e.a.a
        public final /* synthetic */ void a(Object obj) {
            Bitmap bitmap = (Bitmap) obj;
            if (bitmap != null && !bitmap.isRecycled()) {
                BitmapDrawable bitmapDrawable = new BitmapDrawable(bitmap);
                bitmapDrawable.setBounds(0, 0, (int) this.f73565a.getTextSize(), (int) this.f73565a.getTextSize());
                final com.bytedance.ies.dmt.ui.common.a aVar = new com.bytedance.ies.dmt.ui.common.a(bitmapDrawable);
                this.f73565a.post(new Runnable(this) {
                    /* class com.ss.android.ugc.aweme.commerce_challenge_impl.d.c.b.AnonymousClass1 */

                    /* renamed from: a  reason: collision with root package name */
                    final /* synthetic */ b f73568a;

                    static {
                        Covode.recordClassIndex(45273);
                    }

                    {
                        this.f73568a = r1;
                    }

                    public final void run() {
                        this.f73568a.f73565a.a(this.f73568a.f73566b.getEnd() - 1, this.f73568a.f73566b.getEnd(), aVar);
                    }
                });
                c.a(this.f73567c, this.f73566b.getHashTagName());
            }
        }
    }

    public static final class d extends com.bytedance.lighten.a.c.e {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ int f73574a;

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ SpannableStringBuilder f73575b;

        /* renamed from: c  reason: collision with root package name */
        final /* synthetic */ TextView f73576c;

        /* renamed from: d  reason: collision with root package name */
        final /* synthetic */ String f73577d;

        /* renamed from: e  reason: collision with root package name */
        final /* synthetic */ String f73578e;

        static {
            Covode.recordClassIndex(45275);
        }

        @Override // com.bytedance.lighten.a.c.n
        public final void a(Throwable th) {
        }

        @Override // com.bytedance.lighten.a.c.n
        public final void a(Bitmap bitmap) {
            if (bitmap != null) {
                BitmapDrawable bitmapDrawable = new BitmapDrawable(bitmap);
                int i2 = this.f73574a;
                bitmapDrawable.setBounds(0, 0, i2, i2);
                com.bytedance.ies.dmt.ui.common.a aVar = new com.bytedance.ies.dmt.ui.common.a(bitmapDrawable);
                SpannableStringBuilder spannableStringBuilder = this.f73575b;
                spannableStringBuilder.setSpan(aVar, spannableStringBuilder.length() - 1, this.f73575b.length(), 33);
                this.f73576c.setText(this.f73575b);
                String str = this.f73577d;
                if (str != null && str.length() != 0) {
                    c.a(this.f73578e, this.f73577d);
                }
            }
        }

        public d(int i2, SpannableStringBuilder spannableStringBuilder, TextView textView, String str, String str2) {
            this.f73574a = i2;
            this.f73575b = spannableStringBuilder;
            this.f73576c = textView;
            this.f73577d = str;
            this.f73578e = str2;
        }
    }

    public static final class a extends com.bytedance.lighten.a.c.e {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ int f73559a;

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ z.e f73560b;

        /* renamed from: c  reason: collision with root package name */
        final /* synthetic */ TextView f73561c;

        /* renamed from: d  reason: collision with root package name */
        final /* synthetic */ String f73562d;

        /* renamed from: e  reason: collision with root package name */
        final /* synthetic */ String f73563e;

        /* renamed from: f  reason: collision with root package name */
        final /* synthetic */ boolean f73564f;

        static {
            Covode.recordClassIndex(45271);
        }

        @Override // com.bytedance.lighten.a.c.n
        public final void a(Throwable th) {
        }

        @Override // com.bytedance.lighten.a.c.n
        public final void a(Bitmap bitmap) {
            String str;
            if (bitmap != null) {
                BitmapDrawable bitmapDrawable = new BitmapDrawable(bitmap);
                int i2 = this.f73559a;
                bitmapDrawable.setBounds(0, 0, i2, i2);
                this.f73560b.element.setSpan(new com.bytedance.ies.dmt.ui.common.a(bitmapDrawable), this.f73560b.element.length() - 1, this.f73560b.element.length(), 33);
                this.f73561c.setText(this.f73560b.element);
                String str2 = this.f73562d;
                if (str2 != null && str2.length() != 0) {
                    String str3 = this.f73563e;
                    if (this.f73564f) {
                        String str4 = this.f73562d;
                        Objects.requireNonNull(str4, "null cannot be cast to non-null type java.lang.String");
                        str = str4.substring(1);
                        l.b(str, "");
                    } else {
                        str = this.f73562d;
                    }
                    c.a(str3, str);
                }
            }
        }

        public a(int i2, z.e eVar, TextView textView, String str, String str2, boolean z) {
            this.f73559a = i2;
            this.f73560b = eVar;
            this.f73561c = textView;
            this.f73562d = str;
            this.f73563e = str2;
            this.f73564f = z;
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.commerce_challenge_impl.d.c$c  reason: collision with other inner class name */
    public static final class C1645c extends com.bytedance.lighten.a.c.e {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ TextView f73570a;

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ z.e f73571b;

        /* renamed from: c  reason: collision with root package name */
        final /* synthetic */ TextExtraStruct f73572c;

        /* renamed from: d  reason: collision with root package name */
        final /* synthetic */ String f73573d;

        static {
            Covode.recordClassIndex(45274);
        }

        @Override // com.bytedance.lighten.a.c.n
        public final void a(Throwable th) {
        }

        @Override // com.bytedance.lighten.a.c.n
        public final void a(Bitmap bitmap) {
            if (bitmap != null) {
                BitmapDrawable bitmapDrawable = new BitmapDrawable(bitmap);
                bitmapDrawable.setBounds(0, 0, (int) this.f73570a.getTextSize(), (int) this.f73570a.getTextSize());
                com.bytedance.ies.dmt.ui.common.a aVar = new com.bytedance.ies.dmt.ui.common.a(bitmapDrawable);
                z.e eVar = this.f73571b;
                T t = eVar.element;
                TextExtraStruct textExtraStruct = this.f73572c;
                l.b(textExtraStruct, "");
                int end = textExtraStruct.getEnd();
                TextExtraStruct textExtraStruct2 = this.f73572c;
                l.b(textExtraStruct2, "");
                int end2 = textExtraStruct2.getEnd() + 1;
                l.d(t, "");
                int length = t.length();
                if (end <= length && end2 <= length && end <= end2) {
                    t.setSpan(aVar, end, end2, 33);
                }
                eVar.element = t;
                this.f73570a.setText(this.f73571b.element);
                String str = this.f73573d;
                TextExtraStruct textExtraStruct3 = this.f73572c;
                l.b(textExtraStruct3, "");
                c.a(str, textExtraStruct3.getHashTagName());
            }
        }

        public C1645c(TextView textView, z.e eVar, TextExtraStruct textExtraStruct, String str) {
            this.f73570a = textView;
            this.f73571b = eVar;
            this.f73572c = textExtraStruct;
            this.f73573d = str;
        }
    }

    public static final class e extends com.bytedance.lighten.a.c.e {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ String f73579a;

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ int f73580b;

        static {
            Covode.recordClassIndex(45276);
        }

        @Override // com.bytedance.lighten.a.c.n
        public final void a(Throwable th) {
        }

        @Override // com.bytedance.lighten.a.c.n
        public final void a(Bitmap bitmap) {
            MethodCollector.i(1724);
            if (bitmap == null) {
                MethodCollector.o(1724);
                return;
            }
            LinkedHashMap<String, Bitmap> linkedHashMap = c.f73556c;
            String str = this.f73579a;
            l.b(str, "");
            int i2 = this.f73580b;
            l.d(bitmap, "");
            int width = bitmap.getWidth();
            int height = bitmap.getHeight();
            Matrix matrix = new Matrix();
            matrix.postScale(((float) i2) / ((float) width), ((float) i2) / ((float) height));
            Bitmap createBitmap = Bitmap.createBitmap(bitmap, 0, 0, width, height, matrix, true);
            l.b(createBitmap, "");
            linkedHashMap.put(str, createBitmap);
            MethodCollector.o(1724);
        }

        public e(String str, int i2) {
            this.f73579a = str;
            this.f73580b = i2;
        }
    }

    public static void a(String str, String str2) {
        if (str2 != null && str2.length() != 0) {
            com.ss.android.ugc.aweme.app.f.d dVar = new com.ss.android.ugc.aweme.app.f.d();
            Objects.requireNonNull(str2, "null cannot be cast to non-null type java.lang.String");
            String lowerCase = str2.toLowerCase();
            l.b(lowerCase, "");
            com.ss.android.ugc.aweme.app.f.d a2 = dVar.a("tag_name", lowerCase);
            if (str == null) {
                str = "";
            }
            r.a("show_commercial_emoji", a2.a("enter_from", str).f66730a);
        }
    }

    public static boolean a(Aweme aweme, TextExtraStruct textExtraStruct) {
        if (aweme == null || aweme.getDesc() == null || textExtraStruct.getStart() < 0 || textExtraStruct.getEnd() < 0 || textExtraStruct.getEnd() > aweme.getDesc().length() || textExtraStruct.getStart() >= aweme.getDesc().length() || textExtraStruct.getStart() >= textExtraStruct.getEnd()) {
            return false;
        }
        return true;
    }

    public static final UrlModel a(String str, boolean z, boolean z2) {
        String str2;
        String str3;
        long currentTimeMillis;
        long currentTimeMillis2;
        Long l2;
        Long l3;
        if (TextUtils.isEmpty(str)) {
            return null;
        }
        if (!com.ss.android.ugc.aweme.commerce_challenge_impl.c.b.a() && !z) {
            return null;
        }
        a();
        if (f73554a.isEmpty()) {
            return null;
        }
        Iterator<String> it = f73554a.keySet().iterator();
        while (true) {
            if (!it.hasNext()) {
                break;
            }
            String next = it.next();
            l.b(next, "");
            if (z2) {
                str2 = "#".concat(String.valueOf(next));
            } else {
                str2 = next;
            }
            if (str != null) {
                Objects.requireNonNull(str, "null cannot be cast to non-null type java.lang.String");
                str3 = str.toLowerCase();
                l.b(str3, "");
            } else {
                str3 = null;
            }
            if (l.a((Object) str2, (Object) str3)) {
                com.ss.android.ugc.aweme.commerce_challenge_api.b.b bVar = f73554a.get(next);
                if (bVar == null || (l3 = bVar.f73512a) == null) {
                    currentTimeMillis = (System.currentTimeMillis() / 1000) + 1;
                } else {
                    currentTimeMillis = l3.longValue();
                }
                if (currentTimeMillis >= System.currentTimeMillis() / 1000) {
                    continue;
                } else {
                    com.ss.android.ugc.aweme.commerce_challenge_api.b.b bVar2 = f73554a.get(next);
                    if (bVar2 == null || (l2 = bVar2.f73513b) == null) {
                        currentTimeMillis2 = (System.currentTimeMillis() / 1000) - 1;
                    } else {
                        currentTimeMillis2 = l2.longValue();
                    }
                    if (currentTimeMillis2 > System.currentTimeMillis() / 1000) {
                        com.ss.android.ugc.aweme.commerce_challenge_api.b.b bVar3 = f73554a.get(next);
                        if (bVar3 != null) {
                            return bVar3.f73514c;
                        }
                    }
                }
            }
        }
        return null;
    }
}
