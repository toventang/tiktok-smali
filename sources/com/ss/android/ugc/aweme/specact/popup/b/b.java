package com.ss.android.ugc.aweme.specact.popup.b;

import android.content.Context;
import b.g;
import com.bytedance.covode.number.Covode;
import com.ss.android.ugc.aweme.specact.popup.a.h;
import com.ss.android.ugc.aweme.specact.popup.a.i;
import com.ss.android.ugc.aweme.specact.popup.api.SpecActRedPacketApi;
import com.ss.android.ugc.aweme.utils.dg;
import com.zhiliaoapp.musically.R;
import h.a.ag;
import h.f.b.l;
import h.f.b.m;
import h.z;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.concurrent.Callable;
import org.json.JSONException;
import org.json.JSONObject;

public final class b {

    /* renamed from: d  reason: collision with root package name */
    public static final a f134505d = new a((byte) 0);

    /* renamed from: a  reason: collision with root package name */
    public com.ss.android.ugc.aweme.specact.popup.a.b f134506a;

    /* renamed from: b  reason: collision with root package name */
    public Context f134507b;

    /* renamed from: c  reason: collision with root package name */
    public final i f134508c;

    public enum c {
        JUMP,
        TOAST,
        DIALOG,
        NONE;

        static {
            Covode.recordClassIndex(87908);
        }
    }

    static {
        Covode.recordClassIndex(87905);
    }

    public static final class a {
        static {
            Covode.recordClassIndex(87906);
        }

        private a() {
        }

        public /* synthetic */ a(byte b2) {
            this();
        }
    }

    static final class d<V> implements Callable {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ b f134514a;

        static {
            Covode.recordClassIndex(87909);
        }

        d(b bVar) {
            this.f134514a = bVar;
        }

        /* JADX WARNING: Code restructure failed: missing block: B:14:0x0059, code lost:
            if (r2 == null) goto L_0x005b;
         */
        @Override // java.util.concurrent.Callable
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public final /* synthetic */ java.lang.Object call() {
            /*
            // Method dump skipped, instructions count: 108
            */
            throw new UnsupportedOperationException("Method not decompiled: com.ss.android.ugc.aweme.specact.popup.b.b.d.call():java.lang.Object");
        }
    }

    public final Integer a() {
        com.ss.android.ugc.aweme.specact.popup.a.b bVar = this.f134506a;
        if (bVar == null) {
            l.a("buttonAction");
        }
        Integer num = null;
        if (!bVar.f134414g.isEmpty()) {
            com.ss.android.ugc.aweme.specact.popup.a.b bVar2 = this.f134506a;
            if (bVar2 == null) {
                l.a("buttonAction");
            }
            for (h hVar : bVar2.f134414g) {
                JSONObject a2 = a(hVar.f134429b, hVar.f134428a, a(hVar.f134430c));
                try {
                    if (a2.getInt("status_code") == 0) {
                        int i2 = a2.getJSONObject("data").getInt("amount");
                        if (num == null) {
                            num = Integer.valueOf(i2);
                        } else {
                            num = Integer.valueOf(num.intValue() + i2);
                        }
                    }
                } catch (JSONException e2) {
                    e2.printStackTrace();
                }
            }
        }
        return num;
    }

    public b(i iVar) {
        l.d(iVar, "");
        this.f134508c = iVar;
    }

    public static final /* synthetic */ com.ss.android.ugc.aweme.specact.popup.a.b a(b bVar) {
        com.ss.android.ugc.aweme.specact.popup.a.b bVar2 = bVar.f134506a;
        if (bVar2 == null) {
            l.a("buttonAction");
        }
        return bVar2;
    }

    private final String b(int i2) {
        String string;
        Context context = this.f134507b;
        if (context == null || (string = context.getString(i2)) == null) {
            return "";
        }
        return string;
    }

    private final Map<String, String> a(List<String> list) {
        if (list.isEmpty()) {
            return ag.a();
        }
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        try {
            JSONObject jSONObject = new JSONObject(dg.a().b(this.f134508c));
            for (String str : list) {
                try {
                    String string = jSONObject.getString(str);
                    l.b(string, "");
                    linkedHashMap.put(str, string);
                } catch (JSONException unused) {
                }
            }
        } catch (JSONException unused2) {
        }
        return linkedHashMap;
    }

    static final class f extends m implements h.f.a.b<Integer, z> {
        final /* synthetic */ j $dialog;
        final /* synthetic */ b this$0;

        static {
            Covode.recordClassIndex(87911);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        f(b bVar, j jVar) {
            super(1);
            this.this$0 = bVar;
            this.$dialog = jVar;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
        /* JADX WARNING: Code restructure failed: missing block: B:8:0x0018, code lost:
            if (r5 != 6) goto L_0x001a;
         */
        @Override // h.f.a.b
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public final /* synthetic */ h.z invoke(java.lang.Integer r7) {
            /*
                r6 = this;
                java.lang.Number r7 = (java.lang.Number) r7
                int r5 = r7.intValue()
                r0 = -1
                r4 = 0
                java.lang.String r3 = "is_succ"
                java.lang.String r1 = "warmup_schedule_result_show"
                r2 = 1
                if (r5 == r0) goto L_0x0034
                if (r5 == r2) goto L_0x001d
                r0 = 2
                if (r5 == r0) goto L_0x0034
                r0 = 5
                if (r5 == r0) goto L_0x001d
                r0 = 6
                if (r5 == r0) goto L_0x0034
            L_0x001a:
                h.z r0 = h.z.f158842a
                return r0
            L_0x001d:
                com.ss.android.ugc.aweme.app.f.d r0 = new com.ss.android.ugc.aweme.app.f.d
                r0.<init>()
                com.ss.android.ugc.aweme.app.f.d r0 = r0.a(r3, r2)
                java.util.Map<java.lang.String, java.lang.String> r0 = r0.f66730a
                com.ss.android.ugc.aweme.common.r.a(r1, r0)
                com.ss.android.ugc.aweme.specact.popup.b.j r1 = r6.$dialog
                r0 = 2131824567(0x7f110fb7, float:1.9281966E38)
                com.ss.android.ugc.aweme.specact.popup.b.b.a(r1, r0, r4)
                goto L_0x001a
            L_0x0034:
                com.ss.android.ugc.aweme.app.f.d r0 = new com.ss.android.ugc.aweme.app.f.d
                r0.<init>()
                com.ss.android.ugc.aweme.app.f.d r0 = r0.a(r3, r4)
                java.util.Map<java.lang.String, java.lang.String> r0 = r0.f66730a
                com.ss.android.ugc.aweme.common.r.a(r1, r0)
                com.ss.android.ugc.aweme.specact.popup.b.j r1 = r6.$dialog
                r0 = 2131824568(0x7f110fb8, float:1.9281968E38)
                com.ss.android.ugc.aweme.specact.popup.b.b.a(r1, r0, r2)
                goto L_0x001a
            */
            throw new UnsupportedOperationException("Method not decompiled: com.ss.android.ugc.aweme.specact.popup.b.b.f.invoke(java.lang.Object):java.lang.Object");
        }
    }

    static final class e<TTaskResult, TContinuationResult> implements g {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ b f134515a;

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ j f134516b;

        static {
            Covode.recordClassIndex(87910);
        }

        e(b bVar, j jVar) {
            this.f134515a = bVar;
            this.f134516b = jVar;
        }

        /* JADX WARNING: Code restructure failed: missing block: B:17:0x0038, code lost:
            if (r4 != null) goto L_0x003a;
         */
        @Override // b.g
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public final /* synthetic */ java.lang.Object then(b.i r7) {
            /*
            // Method dump skipped, instructions count: 131
            */
            throw new UnsupportedOperationException("Method not decompiled: com.ss.android.ugc.aweme.specact.popup.b.b.e.then(b.i):java.lang.Object");
        }
    }

    public final C3496b a(int i2) {
        if (i2 != 0 && i2 != 2) {
            return null;
        }
        com.ss.android.ugc.aweme.specact.popup.a.b bVar = this.f134506a;
        if (bVar == null) {
            l.a("buttonAction");
        }
        String str = bVar.f134409b;
        com.ss.android.ugc.aweme.specact.popup.a.b bVar2 = this.f134506a;
        if (bVar2 == null) {
            l.a("buttonAction");
        }
        try {
            if (a(i2, str, a(bVar2.f134411d)).getInt("status_code") == 0) {
                if (this.f134508c.o.f134424b != null) {
                    return new C3496b("", c.DIALOG);
                }
                com.ss.android.ugc.aweme.specact.popup.a.b bVar3 = this.f134506a;
                if (bVar3 == null) {
                    l.a("buttonAction");
                }
                return new C3496b(bVar3.f134409b, c.JUMP);
            } else if (l.a((Object) this.f134508c.f134433c, (Object) "limit_time_task_reservation_reminder")) {
                return new C3496b(b(R.string.c5u), c.TOAST, false, true);
            } else {
                return new C3496b(b(R.string.dd6), c.TOAST, false, true);
            }
        } catch (JSONException unused) {
            return new C3496b(b(R.string.dd6), c.TOAST, false, true);
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.specact.popup.b.b$b  reason: collision with other inner class name */
    public static final class C3496b {

        /* renamed from: a  reason: collision with root package name */
        public final String f134509a;

        /* renamed from: b  reason: collision with root package name */
        public final c f134510b;

        /* renamed from: c  reason: collision with root package name */
        public final boolean f134511c;

        /* renamed from: d  reason: collision with root package name */
        public final boolean f134512d;

        static {
            Covode.recordClassIndex(87907);
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof C3496b)) {
                return false;
            }
            C3496b bVar = (C3496b) obj;
            return l.a(this.f134509a, bVar.f134509a) && l.a(this.f134510b, bVar.f134510b) && this.f134511c == bVar.f134511c && this.f134512d == bVar.f134512d;
        }

        public final int hashCode() {
            String str = this.f134509a;
            int i2 = 0;
            int hashCode = (str != null ? str.hashCode() : 0) * 31;
            c cVar = this.f134510b;
            if (cVar != null) {
                i2 = cVar.hashCode();
            }
            int i3 = (hashCode + i2) * 31;
            boolean z = this.f134511c;
            int i4 = 1;
            if (z) {
                z = true;
            }
            int i5 = z ? 1 : 0;
            int i6 = z ? 1 : 0;
            int i7 = z ? 1 : 0;
            int i8 = (i3 + i5) * 31;
            if (!this.f134512d) {
                i4 = 0;
            }
            return i8 + i4;
        }

        public final String toString() {
            return "NextAction(data=" + this.f134509a + ", actionType=" + this.f134510b + ", needDismiss=" + this.f134511c + ", isError=" + this.f134512d + ")";
        }

        public /* synthetic */ C3496b(String str, c cVar) {
            this(str, cVar, true, false);
        }

        public C3496b(String str, c cVar, boolean z, boolean z2) {
            l.d(str, "");
            l.d(cVar, "");
            this.f134509a = str;
            this.f134510b = cVar;
            this.f134511c = z;
            this.f134512d = z2;
        }
    }

    public static void a(j jVar, int i2, boolean z) {
        String string = jVar.getContext().getString(i2);
        l.b(string, "");
        a(jVar, string, false, z);
    }

    private static JSONObject a(int i2, String str, Map<String, String> map) {
        if (i2 == 0) {
            return new JSONObject((String) SpecActRedPacketApi.f134499b.doPost(str, map).execute().f42630b);
        }
        if (i2 == 2) {
            return new JSONObject((String) SpecActRedPacketApi.f134499b.doGet(str, map).execute().f42630b);
        }
        try {
            JSONObject jSONObject = new JSONObject();
            jSONObject.put("status_code", -77777);
            return jSONObject;
        } catch (Exception e2) {
            JSONObject jSONObject2 = new JSONObject();
            jSONObject2.put("status_code", -88888);
            jSONObject2.put("err_msg", e2.getMessage());
            return jSONObject2;
        }
    }

    public static void a(j jVar, String str, boolean z, boolean z2) {
        com.bytedance.tux.g.b bVar;
        if (z) {
            bVar = new com.bytedance.tux.g.b(jVar);
        } else {
            bVar = new com.bytedance.tux.g.b(jVar.f134575d);
        }
        if (z2) {
            bVar.a(str).b(R.raw.icon_x_mark_small).d(R.attr.av);
        } else {
            bVar.a(str).b(R.raw.icon_tick_fill_small).d(R.attr.aw);
        }
        bVar.b();
    }
}
