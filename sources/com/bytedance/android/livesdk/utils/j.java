package com.bytedance.android.livesdk.utils;

import android.content.Context;
import com.bytedance.android.livesdkapi.host.IHostContext;
import com.bytedance.covode.number.Covode;
import java.util.ArrayList;
import java.util.Map;

final class j {

    /* renamed from: a  reason: collision with root package name */
    public Context f22323a;

    /* renamed from: b  reason: collision with root package name */
    ArrayList<a> f22324b;

    static {
        Covode.recordClassIndex(13183);
    }

    j() {
    }

    class c extends a {
        static {
            Covode.recordClassIndex(13186);
        }

        /* access modifiers changed from: protected */
        @Override // com.bytedance.android.livesdk.utils.j.a
        public final String a() {
            return com.bytedance.android.livesdk.util.d.a(((IHostContext) com.bytedance.android.live.t.a.a(IHostContext.class)).currentLocale());
        }

        c(String str) {
            super(j.this, (byte) 0);
            this.f22325a = str;
        }
    }

    class d extends a {
        static {
            Covode.recordClassIndex(13187);
        }

        /* access modifiers changed from: protected */
        @Override // com.bytedance.android.livesdk.utils.j.a
        public final String a() {
            return com.bytedance.android.livesdk.util.d.a(((IHostContext) com.bytedance.android.live.t.a.a(IHostContext.class)).currentLocale());
        }

        d(String str) {
            super(j.this, (byte) 0);
            this.f22325a = str;
        }
    }

    class b extends a {

        /* renamed from: d  reason: collision with root package name */
        private String f22328d;

        static {
            Covode.recordClassIndex(13185);
        }

        /* access modifiers changed from: protected */
        @Override // com.bytedance.android.livesdk.utils.j.a
        public final String a() {
            try {
                if (this.f22328d == null) {
                    this.f22328d = String.valueOf(j.this.f22323a.getPackageManager().getPackageInfo(j.this.f22323a.getPackageName(), 0).versionName);
                }
                return this.f22328d;
            } catch (Exception unused) {
                return "";
            }
        }

        b(String str) {
            super(j.this, (byte) 0);
            this.f22325a = str;
        }
    }

    abstract class a {

        /* renamed from: a  reason: collision with root package name */
        String f22325a;

        static {
            Covode.recordClassIndex(13184);
        }

        /* access modifiers changed from: protected */
        public abstract String a();

        private a() {
            this.f22325a = "";
        }

        /* access modifiers changed from: package-private */
        public final void a(Map<String, String> map) {
            map.put(this.f22325a, a());
        }

        /* synthetic */ a(j jVar, byte b2) {
            this();
        }
    }

    class e extends a {
        static {
            Covode.recordClassIndex(13188);
        }

        /* access modifiers changed from: protected */
        @Override // com.bytedance.android.livesdk.utils.j.a
        public final String a() {
            return "2160";
        }

        e(String str) {
            super(j.this, (byte) 0);
            this.f22325a = str;
        }
    }
}
