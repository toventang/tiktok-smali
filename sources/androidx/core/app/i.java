package androidx.core.app;

import android.app.Notification;
import android.app.PendingIntent;
import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.Resources;
import android.graphics.Bitmap;
import android.graphics.drawable.Icon;
import android.media.AudioAttributes;
import android.net.Uri;
import android.os.Build;
import android.os.Bundle;
import android.os.Parcelable;
import android.text.SpannableStringBuilder;
import android.text.TextUtils;
import android.text.style.TextAppearanceSpan;
import android.util.SparseArray;
import android.widget.RemoteViews;
import androidx.core.app.m;
import androidx.core.graphics.drawable.IconCompat;
import com.bytedance.covode.number.Covode;
import com.bytedance.sysoptimizer.java.ResourcesProtector;
import com.kakao.usermgmt.StringSet;
import com.zhiliaoapp.musically.R;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public final class i {

    public static final class d {

        /* renamed from: a  reason: collision with root package name */
        public PendingIntent f2172a;

        /* renamed from: b  reason: collision with root package name */
        public PendingIntent f2173b;

        /* renamed from: c  reason: collision with root package name */
        public IconCompat f2174c;

        /* renamed from: d  reason: collision with root package name */
        public int f2175d;

        /* renamed from: e  reason: collision with root package name */
        public int f2176e;

        /* renamed from: f  reason: collision with root package name */
        int f2177f;

        static {
            Covode.recordClassIndex(677);
        }
    }

    static {
        Covode.recordClassIndex(673);
    }

    public static class e {
        boolean A;
        public String B;
        Bundle C;
        public int D;
        public int E;
        Notification F;
        public RemoteViews G;
        public RemoteViews H;
        public RemoteViews I;
        public String J;
        int K;
        String L;
        long M;
        int N;
        boolean O;
        public d P;
        Notification Q;
        boolean R;
        public ArrayList<String> S;

        /* renamed from: a  reason: collision with root package name */
        public Context f2178a;

        /* renamed from: b  reason: collision with root package name */
        public ArrayList<a> f2179b;

        /* renamed from: c  reason: collision with root package name */
        ArrayList<a> f2180c;

        /* renamed from: d  reason: collision with root package name */
        CharSequence f2181d;

        /* renamed from: e  reason: collision with root package name */
        CharSequence f2182e;

        /* renamed from: f  reason: collision with root package name */
        public PendingIntent f2183f;

        /* renamed from: g  reason: collision with root package name */
        public PendingIntent f2184g;

        /* renamed from: h  reason: collision with root package name */
        RemoteViews f2185h;

        /* renamed from: i  reason: collision with root package name */
        Bitmap f2186i;

        /* renamed from: j  reason: collision with root package name */
        CharSequence f2187j;

        /* renamed from: k  reason: collision with root package name */
        public int f2188k;

        /* renamed from: l  reason: collision with root package name */
        public int f2189l;

        /* renamed from: m  reason: collision with root package name */
        public boolean f2190m;
        boolean n;
        boolean o;
        h p;
        CharSequence q;
        CharSequence[] r;
        int s;
        int t;
        boolean u;
        public String v;
        public boolean w;
        String x;
        public boolean y;
        boolean z;

        static {
            Covode.recordClassIndex(678);
        }

        public final e a() {
            this.f2190m = false;
            return this;
        }

        public final e c() {
            this.E = 1;
            return this;
        }

        public final e a(long[] jArr) {
            this.Q.vibrate = jArr;
            return this;
        }

        public final e a(boolean z2) {
            a(2, z2);
            return this;
        }

        public final void a(int i2, boolean z2) {
            if (z2) {
                Notification notification = this.Q;
                notification.flags = i2 | notification.flags;
                return;
            }
            Notification notification2 = this.Q;
            notification2.flags = (i2 ^ -1) & notification2.flags;
        }

        public final e a(String str) {
            this.v = str;
            return this;
        }

        public final Bundle b() {
            if (this.C == null) {
                this.C = new Bundle();
            }
            return this.C;
        }

        public final long e() {
            if (this.f2190m) {
                return this.Q.when;
            }
            return 0;
        }

        public final Notification d() {
            RemoteViews remoteViews;
            Notification build;
            Bundle a2;
            RemoteViews b2;
            j jVar = new j(this);
            h hVar = jVar.f2207b.p;
            if (hVar != null) {
                hVar.a(jVar);
                remoteViews = hVar.a();
            } else {
                remoteViews = null;
            }
            if (Build.VERSION.SDK_INT >= 26) {
                build = jVar.f2206a.build();
            } else if (Build.VERSION.SDK_INT >= 24) {
                build = jVar.f2206a.build();
                if (jVar.f2212g != 0) {
                    if (!(build.getGroup() == null || (build.flags & 512) == 0 || jVar.f2212g != 2)) {
                        j.a(build);
                    }
                    if (build.getGroup() != null && (build.flags & 512) == 0 && jVar.f2212g == 1) {
                        j.a(build);
                    }
                }
            } else if (Build.VERSION.SDK_INT >= 21) {
                jVar.f2206a.setExtras(jVar.f2211f);
                build = jVar.f2206a.build();
                if (jVar.f2208c != null) {
                    build.contentView = jVar.f2208c;
                }
                if (jVar.f2209d != null) {
                    build.bigContentView = jVar.f2209d;
                }
                if (jVar.f2213h != null) {
                    build.headsUpContentView = jVar.f2213h;
                }
                if (jVar.f2212g != 0) {
                    if (!(build.getGroup() == null || (build.flags & 512) == 0 || jVar.f2212g != 2)) {
                        j.a(build);
                    }
                    if (build.getGroup() != null && (build.flags & 512) == 0 && jVar.f2212g == 1) {
                        j.a(build);
                    }
                }
            } else if (Build.VERSION.SDK_INT >= 20) {
                jVar.f2206a.setExtras(jVar.f2211f);
                build = jVar.f2206a.build();
                if (jVar.f2208c != null) {
                    build.contentView = jVar.f2208c;
                }
                if (jVar.f2209d != null) {
                    build.bigContentView = jVar.f2209d;
                }
                if (jVar.f2212g != 0) {
                    if (!(build.getGroup() == null || (build.flags & 512) == 0 || jVar.f2212g != 2)) {
                        j.a(build);
                    }
                    if (build.getGroup() != null && (build.flags & 512) == 0 && jVar.f2212g == 1) {
                        j.a(build);
                    }
                }
            } else {
                int i2 = Build.VERSION.SDK_INT;
                SparseArray<Bundle> a3 = k.a(jVar.f2210e);
                if (a3 != null) {
                    jVar.f2211f.putSparseParcelableArray("android.support.actionExtras", a3);
                }
                jVar.f2206a.setExtras(jVar.f2211f);
                build = jVar.f2206a.build();
                if (jVar.f2208c != null) {
                    build.contentView = jVar.f2208c;
                }
                if (jVar.f2209d != null) {
                    build.bigContentView = jVar.f2209d;
                }
            }
            if (remoteViews != null) {
                build.contentView = remoteViews;
            } else if (jVar.f2207b.G != null) {
                build.contentView = jVar.f2207b.G;
            }
            int i3 = Build.VERSION.SDK_INT;
            if (!(hVar == null || (b2 = hVar.b()) == null)) {
                build.bigContentView = b2;
            }
            int i4 = Build.VERSION.SDK_INT;
            if (!(hVar == null || (a2 = i.a(build)) == null)) {
                hVar.a(a2);
            }
            return build;
        }

        public e(Context context) {
            this(context, null);
        }

        public final e a(int i2) {
            this.Q.icon = i2;
            return this;
        }

        public final e b(PendingIntent pendingIntent) {
            this.Q.deleteIntent = pendingIntent;
            return this;
        }

        public final e c(CharSequence charSequence) {
            this.q = e(charSequence);
            return this;
        }

        public final e d(CharSequence charSequence) {
            this.Q.tickerText = e(charSequence);
            return this;
        }

        protected static CharSequence e(CharSequence charSequence) {
            if (charSequence != null && charSequence.length() > 5120) {
                return charSequence.subSequence(0, 5120);
            }
            return charSequence;
        }

        public final e a(long j2) {
            this.Q.when = j2;
            return this;
        }

        public final e b(int i2) {
            this.s = 100;
            this.t = i2;
            this.u = false;
            return this;
        }

        public final e c(int i2) {
            this.Q.defaults = i2;
            if ((i2 & 4) != 0) {
                this.Q.flags |= 1;
            }
            return this;
        }

        public final e b(CharSequence charSequence) {
            this.f2182e = e(charSequence);
            return this;
        }

        public final e a(PendingIntent pendingIntent) {
            this.f2183f = pendingIntent;
            return this;
        }

        public final e b(boolean z2) {
            a(16, z2);
            return this;
        }

        public final e a(Bitmap bitmap) {
            if (bitmap != null && Build.VERSION.SDK_INT < 27) {
                Resources resources = this.f2178a.getResources();
                int dimensionPixelSize = resources.getDimensionPixelSize(R.dimen.gd);
                int dimensionPixelSize2 = resources.getDimensionPixelSize(R.dimen.gc);
                if (bitmap.getWidth() > dimensionPixelSize || bitmap.getHeight() > dimensionPixelSize2) {
                    double d2 = (double) dimensionPixelSize;
                    double max = (double) Math.max(1, bitmap.getWidth());
                    Double.isNaN(d2);
                    Double.isNaN(max);
                    double d3 = d2 / max;
                    double d4 = (double) dimensionPixelSize2;
                    double max2 = (double) Math.max(1, bitmap.getHeight());
                    Double.isNaN(d4);
                    Double.isNaN(max2);
                    double min = Math.min(d3, d4 / max2);
                    double width = (double) bitmap.getWidth();
                    Double.isNaN(width);
                    int ceil = (int) Math.ceil(width * min);
                    double height = (double) bitmap.getHeight();
                    Double.isNaN(height);
                    bitmap = Bitmap.createScaledBitmap(bitmap, ceil, (int) Math.ceil(height * min), true);
                }
            }
            this.f2186i = bitmap;
            return this;
        }

        public final e a(Uri uri) {
            this.Q.sound = uri;
            this.Q.audioStreamType = -1;
            if (Build.VERSION.SDK_INT >= 21) {
                this.Q.audioAttributes = new AudioAttributes.Builder().setContentType(4).setUsage(5).build();
            }
            return this;
        }

        public final e a(h hVar) {
            if (this.p != hVar) {
                this.p = hVar;
                if (hVar != null) {
                    hVar.a(this);
                }
            }
            return this;
        }

        public final e a(CharSequence charSequence) {
            this.f2181d = e(charSequence);
            return this;
        }

        public e(Context context, String str) {
            this.f2179b = new ArrayList<>();
            this.f2180c = new ArrayList<>();
            this.f2190m = true;
            this.y = false;
            this.D = 0;
            this.E = 0;
            this.K = 0;
            this.N = 0;
            Notification notification = new Notification();
            this.Q = notification;
            this.f2178a = context;
            this.J = str;
            notification.when = System.currentTimeMillis();
            this.Q.audioStreamType = -1;
            this.f2189l = 0;
            this.S = new ArrayList<>();
            this.O = true;
        }

        public final e a(int i2, CharSequence charSequence, PendingIntent pendingIntent) {
            this.f2179b.add(new a(i2, charSequence, pendingIntent));
            return this;
        }

        public final e a(int i2, int i3, int i4) {
            int i5;
            this.Q.ledARGB = i2;
            this.Q.ledOnMS = i3;
            this.Q.ledOffMS = i4;
            if (this.Q.ledOnMS == 0 || this.Q.ledOffMS == 0) {
                i5 = 0;
            } else {
                i5 = 1;
            }
            Notification notification = this.Q;
            notification.flags = i5 | (notification.flags & -2);
            return this;
        }
    }

    public static class g extends h {

        /* renamed from: a  reason: collision with root package name */
        public final List<a> f2192a = new ArrayList();

        /* renamed from: b  reason: collision with root package name */
        public m f2193b;

        /* renamed from: c  reason: collision with root package name */
        public CharSequence f2194c;

        /* renamed from: h  reason: collision with root package name */
        private Boolean f2195h;

        static {
            Covode.recordClassIndex(680);
        }

        private g() {
        }

        private a c() {
            for (int size = this.f2192a.size() - 1; size >= 0; size--) {
                a aVar = this.f2192a.get(size);
                if (!(aVar.f2198c == null || TextUtils.isEmpty(aVar.f2198c.f2245a))) {
                    return aVar;
                }
            }
            if (this.f2192a.isEmpty()) {
                return null;
            }
            List<a> list = this.f2192a;
            return list.get(list.size() - 1);
        }

        private boolean d() {
            for (int size = this.f2192a.size() - 1; size >= 0; size--) {
                a aVar = this.f2192a.get(size);
                if (aVar.f2198c != null && aVar.f2198c.f2245a == null) {
                    return true;
                }
            }
            return false;
        }

        private static TextAppearanceSpan a(int i2) {
            return new TextAppearanceSpan(null, 0, 0, ColorStateList.valueOf(i2), null);
        }

        public g(CharSequence charSequence) {
            m.a aVar = new m.a();
            aVar.f2251a = charSequence;
            this.f2193b = aVar.a();
        }

        private CharSequence a(a aVar) {
            boolean z;
            int i2;
            CharSequence charSequence;
            androidx.core.f.a a2 = androidx.core.f.a.a();
            SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder();
            if (Build.VERSION.SDK_INT >= 21) {
                z = true;
                i2 = -16777216;
            } else {
                z = false;
                i2 = -1;
            }
            CharSequence charSequence2 = "";
            if (aVar.f2198c == null) {
                charSequence = charSequence2;
            } else {
                charSequence = aVar.f2198c.f2245a;
            }
            if (TextUtils.isEmpty(charSequence)) {
                charSequence = this.f2193b.f2245a;
                if (z && this.f2202d.D != 0) {
                    i2 = this.f2202d.D;
                }
            }
            CharSequence a3 = a2.a(charSequence);
            spannableStringBuilder.append(a3);
            spannableStringBuilder.setSpan(a(i2), spannableStringBuilder.length() - a3.length(), spannableStringBuilder.length(), 33);
            if (aVar.f2196a != null) {
                charSequence2 = aVar.f2196a;
            }
            spannableStringBuilder.append((CharSequence) "  ").append(a2.a(charSequence2));
            return spannableStringBuilder;
        }

        @Override // androidx.core.app.i.h
        public final void a(Bundle bundle) {
            super.a(bundle);
            bundle.putCharSequence("android.selfDisplayName", this.f2193b.f2245a);
            bundle.putBundle("android.messagingStyleUser", this.f2193b.a());
            bundle.putCharSequence("android.hiddenConversationTitle", this.f2194c);
            if (this.f2194c != null && this.f2195h.booleanValue()) {
                bundle.putCharSequence("android.conversationTitle", this.f2194c);
            }
            if (!this.f2192a.isEmpty()) {
                List<a> list = this.f2192a;
                Parcelable[] parcelableArr = new Bundle[list.size()];
                int size = list.size();
                for (int i2 = 0; i2 < size; i2++) {
                    a aVar = list.get(i2);
                    Bundle bundle2 = new Bundle();
                    if (aVar.f2196a != null) {
                        bundle2.putCharSequence("text", aVar.f2196a);
                    }
                    bundle2.putLong("time", aVar.f2197b);
                    if (aVar.f2198c != null) {
                        bundle2.putCharSequence("sender", aVar.f2198c.f2245a);
                        if (Build.VERSION.SDK_INT >= 28) {
                            bundle2.putParcelable("sender_person", aVar.f2198c.b());
                        } else {
                            bundle2.putBundle("person", aVar.f2198c.a());
                        }
                    }
                    if (aVar.f2200e != null) {
                        bundle2.putString(StringSet.type, aVar.f2200e);
                    }
                    if (aVar.f2201f != null) {
                        bundle2.putParcelable("uri", aVar.f2201f);
                    }
                    if (aVar.f2199d != null) {
                        bundle2.putBundle("extras", aVar.f2199d);
                    }
                    parcelableArr[i2] = bundle2;
                }
                bundle.putParcelableArray("android.messages", parcelableArr);
            }
            Boolean bool = this.f2195h;
            if (bool != null) {
                bundle.putBoolean("android.isGroupConversation", bool.booleanValue());
            }
        }

        /* JADX WARNING: Code restructure failed: missing block: B:53:0x00db, code lost:
            if (r3 != null) goto L_0x00dd;
         */
        /* JADX WARNING: Removed duplicated region for block: B:65:0x0109  */
        @Override // androidx.core.app.i.h
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public final void a(androidx.core.app.h r11) {
            /*
            // Method dump skipped, instructions count: 351
            */
            throw new UnsupportedOperationException("Method not decompiled: androidx.core.app.i.g.a(androidx.core.app.h):void");
        }

        public static final class a {

            /* renamed from: a  reason: collision with root package name */
            public final CharSequence f2196a;

            /* renamed from: b  reason: collision with root package name */
            public final long f2197b;

            /* renamed from: c  reason: collision with root package name */
            public final m f2198c;

            /* renamed from: d  reason: collision with root package name */
            public Bundle f2199d = new Bundle();

            /* renamed from: e  reason: collision with root package name */
            public String f2200e;

            /* renamed from: f  reason: collision with root package name */
            public Uri f2201f;

            static {
                Covode.recordClassIndex(681);
            }

            public a(CharSequence charSequence, long j2, m mVar) {
                this.f2196a = charSequence;
                this.f2197b = j2;
                this.f2198c = mVar;
            }
        }
    }

    public static class a {

        /* renamed from: a  reason: collision with root package name */
        public final Bundle f2157a;

        /* renamed from: b  reason: collision with root package name */
        public final n[] f2158b;

        /* renamed from: c  reason: collision with root package name */
        public final n[] f2159c;

        /* renamed from: d  reason: collision with root package name */
        public boolean f2160d;

        /* renamed from: e  reason: collision with root package name */
        public boolean f2161e;

        /* renamed from: f  reason: collision with root package name */
        public final int f2162f;

        /* renamed from: g  reason: collision with root package name */
        public final boolean f2163g;

        /* renamed from: h  reason: collision with root package name */
        public int f2164h;

        /* renamed from: i  reason: collision with root package name */
        public CharSequence f2165i;

        /* renamed from: j  reason: collision with root package name */
        public PendingIntent f2166j;

        /* renamed from: k  reason: collision with root package name */
        private IconCompat f2167k;

        static {
            Covode.recordClassIndex(674);
        }

        public final IconCompat a() {
            int i2;
            if (this.f2167k == null && (i2 = this.f2164h) != 0) {
                this.f2167k = IconCompat.a("", i2);
            }
            return this.f2167k;
        }

        /* JADX WARNING: Illegal instructions before constructor call */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public a(int r2, java.lang.CharSequence r3, android.app.PendingIntent r4) {
            /*
                r1 = this;
                if (r2 != 0) goto L_0x0007
                r0 = 0
            L_0x0003:
                r1.<init>(r0, r3, r4)
                return
            L_0x0007:
                java.lang.String r0 = ""
                androidx.core.graphics.drawable.IconCompat r0 = androidx.core.graphics.drawable.IconCompat.a(r0, r2)
                goto L_0x0003
            */
            throw new UnsupportedOperationException("Method not decompiled: androidx.core.app.i.a.<init>(int, java.lang.CharSequence, android.app.PendingIntent):void");
        }

        private a(IconCompat iconCompat, CharSequence charSequence, PendingIntent pendingIntent) {
            this(iconCompat, charSequence, pendingIntent, new Bundle());
        }

        private a(IconCompat iconCompat, CharSequence charSequence, PendingIntent pendingIntent, Bundle bundle) {
            int i2;
            this.f2161e = true;
            this.f2167k = iconCompat;
            if (iconCompat != null) {
                if (iconCompat.f2416a != -1 || Build.VERSION.SDK_INT < 23) {
                    i2 = iconCompat.f2416a;
                } else {
                    i2 = IconCompat.a((Icon) iconCompat.f2417b);
                }
                if (i2 == 2) {
                    this.f2164h = iconCompat.a();
                }
            }
            this.f2165i = e.e(charSequence);
            this.f2166j = pendingIntent;
            this.f2157a = bundle;
            this.f2158b = null;
            this.f2159c = null;
            this.f2160d = true;
            this.f2162f = 0;
            this.f2161e = true;
            this.f2163g = false;
        }
    }

    public static class b extends h {

        /* renamed from: a  reason: collision with root package name */
        public Bitmap f2168a;

        /* renamed from: b  reason: collision with root package name */
        private Bitmap f2169b;

        /* renamed from: c  reason: collision with root package name */
        private boolean f2170c;

        static {
            Covode.recordClassIndex(675);
        }

        public final b a(Bitmap bitmap) {
            this.f2169b = bitmap;
            this.f2170c = true;
            return this;
        }

        public final b a(CharSequence charSequence) {
            this.f2203e = e.e(charSequence);
            return this;
        }

        public final b b(CharSequence charSequence) {
            this.f2204f = e.e(charSequence);
            this.f2205g = true;
            return this;
        }

        @Override // androidx.core.app.i.h
        public final void a(h hVar) {
            int i2 = Build.VERSION.SDK_INT;
            Notification.BigPictureStyle bigPicture = new Notification.BigPictureStyle(hVar.a()).setBigContentTitle(this.f2203e).bigPicture(this.f2168a);
            if (this.f2170c) {
                bigPicture.bigLargeIcon(this.f2169b);
            }
            if (this.f2205g) {
                bigPicture.setSummaryText(this.f2204f);
            }
        }
    }

    public static class c extends h {

        /* renamed from: a  reason: collision with root package name */
        private CharSequence f2171a;

        static {
            Covode.recordClassIndex(676);
        }

        public final c a(CharSequence charSequence) {
            this.f2203e = e.e(charSequence);
            return this;
        }

        public final c c(CharSequence charSequence) {
            this.f2171a = e.e(charSequence);
            return this;
        }

        public final c b(CharSequence charSequence) {
            this.f2204f = e.e(charSequence);
            this.f2205g = true;
            return this;
        }

        @Override // androidx.core.app.i.h
        public final void a(h hVar) {
            int i2 = Build.VERSION.SDK_INT;
            Notification.BigTextStyle bigText = new Notification.BigTextStyle(hVar.a()).setBigContentTitle(this.f2203e).bigText(this.f2171a);
            if (this.f2205g) {
                bigText.setSummaryText(this.f2204f);
            }
        }
    }

    public static class f extends h {

        /* renamed from: a  reason: collision with root package name */
        private ArrayList<CharSequence> f2191a = new ArrayList<>();

        static {
            Covode.recordClassIndex(679);
        }

        public final f a(CharSequence charSequence) {
            this.f2203e = e.e(charSequence);
            return this;
        }

        public final f b(CharSequence charSequence) {
            this.f2204f = e.e(charSequence);
            this.f2205g = true;
            return this;
        }

        public final f c(CharSequence charSequence) {
            this.f2191a.add(e.e(charSequence));
            return this;
        }

        @Override // androidx.core.app.i.h
        public final void a(h hVar) {
            int i2 = Build.VERSION.SDK_INT;
            Notification.InboxStyle bigContentTitle = new Notification.InboxStyle(hVar.a()).setBigContentTitle(this.f2203e);
            if (this.f2205g) {
                bigContentTitle.setSummaryText(this.f2204f);
            }
            Iterator<CharSequence> it = this.f2191a.iterator();
            while (it.hasNext()) {
                bigContentTitle.addLine(it.next());
            }
        }
    }

    public static Bundle a(Notification notification) {
        int i2 = Build.VERSION.SDK_INT;
        return notification.extras;
    }

    public static abstract class h {

        /* renamed from: d  reason: collision with root package name */
        protected e f2202d;

        /* renamed from: e  reason: collision with root package name */
        CharSequence f2203e;

        /* renamed from: f  reason: collision with root package name */
        CharSequence f2204f;

        /* renamed from: g  reason: collision with root package name */
        boolean f2205g;

        static {
            Covode.recordClassIndex(682);
        }

        public RemoteViews a() {
            return null;
        }

        public void a(Bundle bundle) {
        }

        public void a(h hVar) {
        }

        public RemoteViews b() {
            return null;
        }

        public final void a(e eVar) {
            if (this.f2202d != eVar) {
                this.f2202d = eVar;
                if (eVar != null) {
                    eVar.a(this);
                }
            }
        }

        private static int a(Resources resources) {
            ResourcesProtector.Config matchConfig = ResourcesProtector.getMatchConfig(R.integer.bh);
            if (matchConfig == null) {
                return resources.getInteger(R.integer.bh);
            }
            try {
                if (!matchConfig.mockCrash) {
                    return resources.getInteger(R.integer.bh);
                }
                throw new Resources.NotFoundException("unknown resource from mocked");
            } catch (Throwable th) {
                StackTraceElement[] stackTrace = th.getStackTrace();
                int min = Math.min(stackTrace.length, matchConfig.mMaxStep);
                for (int i2 = 0; i2 < min; i2++) {
                    StackTraceElement stackTraceElement = stackTrace[i2];
                    if (stackTraceElement != null) {
                        if (matchConfig.mProtectClassName.equals(stackTraceElement.getClassName())) {
                            if (matchConfig.mProtectMethodName.equals(stackTraceElement.getMethodName())) {
                                return matchConfig.mReturnIdWhenException;
                            }
                        } else {
                            continue;
                        }
                    }
                }
                return resources.getInteger(R.integer.bh);
            }
        }

        /* JADX WARNING: Removed duplicated region for block: B:28:0x009e  */
        /* JADX WARNING: Removed duplicated region for block: B:36:0x00e2  */
        /* JADX WARNING: Removed duplicated region for block: B:45:0x0122  */
        /* JADX WARNING: Removed duplicated region for block: B:50:0x012f  */
        /* JADX WARNING: Removed duplicated region for block: B:51:0x0132  */
        /* JADX WARNING: Removed duplicated region for block: B:53:0x0147  */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public final android.widget.RemoteViews a(int r19, boolean r20) {
            /*
            // Method dump skipped, instructions count: 409
            */
            throw new UnsupportedOperationException("Method not decompiled: androidx.core.app.i.h.a(int, boolean):android.widget.RemoteViews");
        }
    }
}
