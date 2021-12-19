package com.bytedance.android.livesdk.f;

import android.graphics.Bitmap;
import android.text.TextUtils;
import com.airbnb.lottie.LottieAnimationView;
import com.airbnb.lottie.c;
import com.airbnb.lottie.e;
import com.airbnb.lottie.h;
import com.airbnb.lottie.n;
import com.bytedance.covode.number.Covode;
import h.f.b.l;
import java.util.HashMap;
import java.util.Map;
import java.util.WeakHashMap;

public final class a {

    /* renamed from: a  reason: collision with root package name */
    public static Map<String, e> f17211a = new WeakHashMap();

    /* renamed from: b  reason: collision with root package name */
    public static final a f17212b = new a();

    private a() {
    }

    static {
        Covode.recordClassIndex(9551);
    }

    /* renamed from: com.bytedance.android.livesdk.f.a$a  reason: collision with other inner class name */
    public static final class C0360a implements c {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ HashMap f17213a;

        static {
            Covode.recordClassIndex(9552);
        }

        public C0360a(HashMap hashMap) {
            this.f17213a = hashMap;
        }

        @Override // com.airbnb.lottie.c
        public final Bitmap a(h hVar) {
            Bitmap bitmap;
            if (hVar == null) {
                return null;
            }
            String str = hVar.f5657d;
            if (TextUtils.isEmpty(str) || !this.f17213a.containsKey(str) || (bitmap = (Bitmap) this.f17213a.get(str)) == null || bitmap.isRecycled()) {
                return null;
            }
            return bitmap;
        }
    }

    public static final class b implements n {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ com.bytedance.android.livesdk.aa.a f17214a;

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ LottieAnimationView f17215b;

        /* renamed from: c  reason: collision with root package name */
        final /* synthetic */ boolean f17216c = true;

        static {
            Covode.recordClassIndex(9553);
        }

        public b(com.bytedance.android.livesdk.aa.a aVar, LottieAnimationView lottieAnimationView) {
            this.f17214a = aVar;
            this.f17215b = lottieAnimationView;
        }

        @Override // com.airbnb.lottie.n
        public final void a(e eVar) {
            if (eVar != null) {
                try {
                    Map<String, e> map = a.f17211a;
                    String str = this.f17214a.f13387b;
                    l.b(str, "");
                    map.put(str, eVar);
                    this.f17215b.setComposition(eVar);
                    if (this.f17216c) {
                        this.f17215b.a();
                    }
                } catch (Exception unused) {
                }
            }
        }
    }
}
