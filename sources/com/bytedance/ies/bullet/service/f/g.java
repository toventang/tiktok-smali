package com.bytedance.ies.bullet.service.f;

import android.net.Uri;
import android.os.Bundle;
import com.bytedance.covode.number.Covode;
import com.bytedance.ies.bullet.service.a.e;
import com.bytedance.ies.bullet.service.base.ae;
import com.bytedance.ies.bullet.service.base.af;
import com.bytedance.ies.bullet.service.base.b.e;
import com.bytedance.ies.bullet.service.base.d;
import h.a.n;
import h.f.b.l;
import h.m.p;
import java.util.Collection;
import java.util.List;
import java.util.Set;

public final class g extends com.bytedance.ies.bullet.service.base.b.a implements af {

    /* renamed from: a  reason: collision with root package name */
    public static final a f32768a = new a((byte) 0);

    /* renamed from: b  reason: collision with root package name */
    private final ae f32769b;

    static {
        Covode.recordClassIndex(19580);
    }

    public static final class a {
        static {
            Covode.recordClassIndex(19581);
        }

        private a() {
        }

        public /* synthetic */ a(byte b2) {
            this();
        }
    }

    @Override // com.bytedance.ies.bullet.service.base.af
    public final ae b() {
        return this.f32769b;
    }

    public g(ae aeVar) {
        l.c(aeVar, "");
        this.f32769b = aeVar;
    }

    public static final class b {

        /* renamed from: a  reason: collision with root package name */
        public final Uri f32770a;

        /* renamed from: b  reason: collision with root package name */
        public final com.bytedance.ies.bullet.service.f.a.b.b f32771b;

        static {
            Covode.recordClassIndex(19582);
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof b)) {
                return false;
            }
            b bVar = (b) obj;
            return l.a(this.f32770a, bVar.f32770a) && l.a(this.f32771b, bVar.f32771b);
        }

        public final int hashCode() {
            Uri uri = this.f32770a;
            int i2 = 0;
            int hashCode = (uri != null ? uri.hashCode() : 0) * 31;
            com.bytedance.ies.bullet.service.f.a.b.b bVar = this.f32771b;
            if (bVar != null) {
                i2 = bVar.hashCode();
            }
            return hashCode + i2;
        }

        public final String toString() {
            return "SchemaInfo(realHostUri=" + this.f32770a + ", type=" + this.f32771b + ")";
        }

        public b(Uri uri, com.bytedance.ies.bullet.service.f.a.b.b bVar) {
            l.c(uri, "");
            l.c(bVar, "");
            this.f32770a = uri;
            this.f32771b = bVar;
        }
    }

    @Override // com.bytedance.ies.bullet.service.base.af
    public final d a(String str, List<String> list) {
        l.c(str, "");
        return d.a(str, list);
    }

    private static List<String> a(Uri uri, List<String> list) {
        List<String> g2 = n.g((Collection) list);
        String a2 = com.bytedance.ies.bullet.service.f.b.a.a(uri, "package_name");
        if (a2 != null) {
            for (T t : p.b(a2, new String[]{","})) {
                if (t.length() > 0 && !g2.contains(t)) {
                    g2.add(t);
                }
            }
        }
        return g2;
    }

    private static String a(Uri uri, Bundle bundle) {
        Set<String> a2;
        String a3;
        String string = bundle.getString("__x_session_id");
        if (string == null || string.length() == 0) {
            string = com.bytedance.ies.bullet.service.base.a.n.a();
            bundle.putString("__x_session_id", string);
        }
        e<String, Object> a4 = e.a.a().a(string);
        if (!(a4 == null || (a2 = com.bytedance.ies.bullet.service.f.b.a.a(uri)) == null)) {
            for (T t : a2) {
                if (!(t == null || (a3 = com.bytedance.ies.bullet.service.f.b.a.a(uri, (String) t)) == null || a3.length() == 0)) {
                    a4.putStringIfAbsent(t, a3);
                }
            }
        }
        return string;
    }

    /* JADX INFO: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARNING: Code restructure failed: missing block: B:56:0x01a0, code lost:
        if (r11.equals("webview_page") != false) goto L_0x023c;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:58:0x01aa, code lost:
        if (r11.equals("lynxview_page") != false) goto L_0x0213;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:60:0x01b1, code lost:
        if (r11.equals("webview") != false) goto L_0x023c;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:62:0x01bb, code lost:
        if (r11.equals("lynx_popup") != false) goto L_0x0213;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:64:0x01c4, code lost:
        if (r11.equals("lynx_page") != false) goto L_0x0213;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:66:0x01cd, code lost:
        if (r11.equals("reactnative_popup") != false) goto L_0x01ea;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:68:0x01d6, code lost:
        if (r11.equals("lynxview_popup") != false) goto L_0x0213;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:70:0x01df, code lost:
        if (r11.equals("reactnative") != false) goto L_0x01ea;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:72:0x01e8, code lost:
        if (r11.equals("reactnative_page") != false) goto L_0x01ea;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:73:0x01ea, code lost:
        if (r15 == null) goto L_0x01f2;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:75:0x01f0, code lost:
        if (r15.length() != 0) goto L_0x01fb;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:76:0x01f2, code lost:
        r11 = new com.bytedance.ies.bullet.service.f.g.b(r1, com.bytedance.ies.bullet.service.f.a.b.b.RN);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:77:0x01fb, code lost:
        r1 = android.net.Uri.parse(r15);
        h.f.b.l.a((java.lang.Object) r1, "");
        r11 = new com.bytedance.ies.bullet.service.f.g.b(r1, com.bytedance.ies.bullet.service.f.a.b.b.RN);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:79:0x0211, code lost:
        if (r11.equals("lynxview") != false) goto L_0x0213;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:80:0x0213, code lost:
        if (r13 == null) goto L_0x021b;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:82:0x0219, code lost:
        if (r13.length() != 0) goto L_0x0224;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:83:0x021b, code lost:
        r11 = new com.bytedance.ies.bullet.service.f.g.b(r1, com.bytedance.ies.bullet.service.f.a.b.b.LYNX);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:84:0x0224, code lost:
        r1 = android.net.Uri.parse(r13);
        h.f.b.l.a((java.lang.Object) r1, "");
        r11 = new com.bytedance.ies.bullet.service.f.g.b(r1, com.bytedance.ies.bullet.service.f.a.b.b.LYNX);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:86:0x023a, code lost:
        if (r11.equals("webview_popup") != false) goto L_0x023c;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:87:0x023c, code lost:
        if (r13 == null) goto L_0x0244;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:89:0x0242, code lost:
        if (r13.length() != 0) goto L_0x0265;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:90:0x0244, code lost:
        if (r15 == null) goto L_0x024c;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:92:0x024a, code lost:
        if (r15.length() != 0) goto L_0x0255;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:93:0x024c, code lost:
        r11 = new com.bytedance.ies.bullet.service.f.g.b(r1, com.bytedance.ies.bullet.service.f.a.b.b.WEB);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:94:0x0255, code lost:
        r1 = android.net.Uri.parse(r15);
        h.f.b.l.a((java.lang.Object) r1, "");
        r11 = new com.bytedance.ies.bullet.service.f.g.b(r1, com.bytedance.ies.bullet.service.f.a.b.b.RN);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:95:0x0265, code lost:
        r1 = android.net.Uri.parse(r13);
        h.f.b.l.a((java.lang.Object) r1, "");
        r11 = new com.bytedance.ies.bullet.service.f.g.b(r1, com.bytedance.ies.bullet.service.f.a.b.b.LYNX);
     */
    /* JADX WARNING: Removed duplicated region for block: B:23:0x00ce  */
    /* JADX WARNING: Removed duplicated region for block: B:29:0x00fd  */
    /* JADX WARNING: Removed duplicated region for block: B:37:0x0133  */
    /* JADX WARNING: Removed duplicated region for block: B:44:0x0158  */
    /* JADX WARNING: Removed duplicated region for block: B:50:0x0183  */
    @Override // com.bytedance.ies.bullet.service.base.af
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final android.net.Uri a(android.net.Uri r19, android.os.Bundle r20, java.util.List<java.lang.String> r21, java.util.List<? extends com.bytedance.ies.bullet.service.base.g> r22) {
        /*
        // Method dump skipped, instructions count: 682
        */
        throw new UnsupportedOperationException("Method not decompiled: com.bytedance.ies.bullet.service.f.g.a(android.net.Uri, android.os.Bundle, java.util.List, java.util.List):android.net.Uri");
    }
}
