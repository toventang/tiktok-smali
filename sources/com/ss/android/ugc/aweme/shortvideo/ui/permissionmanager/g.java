package com.ss.android.ugc.aweme.shortvideo.ui.permissionmanager;

import android.content.Context;
import android.content.Intent;
import com.bytedance.covode.number.Covode;
import com.ss.android.ugc.aweme.port.in.v;
import com.zhiliaoapp.musically.R;
import h.a.ag;
import h.a.n;
import h.f.b.l;
import h.f.b.m;
import h.z;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.Map;

public final class g {

    /* renamed from: a  reason: collision with root package name */
    public static final g f131875a = new g();

    /* access modifiers changed from: package-private */
    public static final class c extends m implements h.f.a.a<z> {

        /* renamed from: a  reason: collision with root package name */
        public static final c f131879a = new c();

        static {
            Covode.recordClassIndex(86403);
        }

        c() {
            super(0);
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        @Override // h.f.a.a
        public final /* bridge */ /* synthetic */ z invoke() {
            return z.f158842a;
        }
    }

    /* access modifiers changed from: package-private */
    public static final class d extends m implements h.f.a.a<z> {

        /* renamed from: a  reason: collision with root package name */
        public static final d f131880a = new d();

        static {
            Covode.recordClassIndex(86404);
        }

        d() {
            super(0);
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        @Override // h.f.a.a
        public final /* bridge */ /* synthetic */ z invoke() {
            return z.f158842a;
        }
    }

    public static final class f extends m implements h.f.a.a<z> {

        /* renamed from: a  reason: collision with root package name */
        public static final f f131881a = new f();

        static {
            Covode.recordClassIndex(86406);
        }

        f() {
            super(0);
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        @Override // h.f.a.a
        public final /* bridge */ /* synthetic */ z invoke() {
            return z.f158842a;
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.shortvideo.ui.permissionmanager.g$g  reason: collision with other inner class name */
    public static final class C3424g extends m implements h.f.a.a<z> {

        /* renamed from: a  reason: collision with root package name */
        public static final C3424g f131882a = new C3424g();

        static {
            Covode.recordClassIndex(86407);
        }

        C3424g() {
            super(0);
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        @Override // h.f.a.a
        public final /* bridge */ /* synthetic */ z invoke() {
            return z.f158842a;
        }
    }

    /* access modifiers changed from: package-private */
    public static final class h extends m implements h.f.a.a<z> {

        /* renamed from: a  reason: collision with root package name */
        public static final h f131883a = new h();

        static {
            Covode.recordClassIndex(86408);
        }

        h() {
            super(0);
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        @Override // h.f.a.a
        public final /* bridge */ /* synthetic */ z invoke() {
            return z.f158842a;
        }
    }

    private g() {
    }

    public static void a(androidx.fragment.app.e eVar, String[] strArr, Map<String, String> map, v.a aVar, h.f.a.a<z> aVar2, h.f.a.a<z> aVar3) {
        l.d(eVar, "");
        l.d(strArr, "");
        l.d(map, "");
        l.d(aVar, "");
        l.d(aVar2, "");
        l.d(aVar3, "");
        a(eVar, strArr, new b(eVar, strArr, map, aVar2, aVar3), aVar);
    }

    static {
        Covode.recordClassIndex(86400);
    }

    /* access modifiers changed from: package-private */
    public static final class i extends m implements h.f.a.b<com.bytedance.tux.dialog.a, z> {
        final /* synthetic */ h.f.a.a $onDismissed;

        static {
            Covode.recordClassIndex(86409);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        i(h.f.a.a aVar) {
            super(1);
            this.$onDismissed = aVar;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
        @Override // h.f.a.b
        public final /* synthetic */ z invoke(com.bytedance.tux.dialog.a aVar) {
            l.d(aVar, "");
            this.$onDismissed.invoke();
            return z.f158842a;
        }
    }

    /* access modifiers changed from: package-private */
    public static final class j extends m implements h.f.a.b<com.bytedance.tux.dialog.b.b, z> {
        final /* synthetic */ androidx.fragment.app.e $activity;
        final /* synthetic */ h.f.a.a $onCancelled;
        final /* synthetic */ String[] $permissions;

        static {
            Covode.recordClassIndex(86410);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        j(String[] strArr, androidx.fragment.app.e eVar, h.f.a.a aVar) {
            super(1);
            this.$permissions = strArr;
            this.$activity = eVar;
            this.$onCancelled = aVar;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
        @Override // h.f.a.b
        public final /* synthetic */ z invoke(com.bytedance.tux.dialog.b.b bVar) {
            com.bytedance.tux.dialog.b.b bVar2 = bVar;
            l.d(bVar2, "");
            bVar2.a(R.string.g_n, new h.f.a.b<com.bytedance.tux.dialog.b.a, z>(this) {
                /* class com.ss.android.ugc.aweme.shortvideo.ui.permissionmanager.g.j.AnonymousClass1 */
                final /* synthetic */ j this$0;

                static {
                    Covode.recordClassIndex(86411);
                }

                {
                    this.this$0 = r2;
                }

                /* Return type fixed from 'java.lang.Object' to match base method */
                /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
                @Override // h.f.a.b
                public final /* synthetic */ z invoke(com.bytedance.tux.dialog.b.a aVar) {
                    com.bytedance.tux.dialog.b.a aVar2 = aVar;
                    l.d(aVar2, "");
                    b.a(this.this$0.$permissions, this.this$0.$activity, true);
                    aVar2.f44816b = false;
                    com.ss.android.ugc.aweme.port.in.l.f115658a.c().d(this.this$0.$activity);
                    return z.f158842a;
                }
            });
            bVar2.b(R.string.g_m, new h.f.a.b<com.bytedance.tux.dialog.b.a, z>(this) {
                /* class com.ss.android.ugc.aweme.shortvideo.ui.permissionmanager.g.j.AnonymousClass2 */
                final /* synthetic */ j this$0;

                static {
                    Covode.recordClassIndex(86412);
                }

                {
                    this.this$0 = r2;
                }

                /* Return type fixed from 'java.lang.Object' to match base method */
                /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
                @Override // h.f.a.b
                public final /* synthetic */ z invoke(com.bytedance.tux.dialog.b.a aVar) {
                    l.d(aVar, "");
                    b.a(this.this$0.$permissions, this.this$0.$activity, false);
                    this.this$0.$onCancelled.invoke();
                    return z.f158842a;
                }
            });
            return z.f158842a;
        }
    }

    public static Map<String, String> a(Context context) {
        l.d(context, "");
        return ag.a(h.v.a("android.permission.CAMERA", context.getString(R.string.g_p)), h.v.a("android.permission.RECORD_AUDIO", context.getString(R.string.g_t)), h.v.a("android.permission.WRITE_EXTERNAL_STORAGE", context.getString(R.string.g_r)));
    }

    /* access modifiers changed from: package-private */
    public static final class e extends m implements h.f.a.m<String[], int[], z> {
        final /* synthetic */ androidx.fragment.app.e $activity;
        final /* synthetic */ h.f.a.a $onSettingCancelled;
        final /* synthetic */ h.f.a.a $onSettingDismissed;

        static {
            Covode.recordClassIndex(86405);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        e(androidx.fragment.app.e eVar, h.f.a.a aVar, h.f.a.a aVar2) {
            super(2);
            this.$activity = eVar;
            this.$onSettingCancelled = aVar;
            this.$onSettingDismissed = aVar2;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object, java.lang.Object] */
        @Override // h.f.a.m
        public final /* synthetic */ z invoke(String[] strArr, int[] iArr) {
            g.a(this.$activity, this.$onSettingCancelled, this.$onSettingDismissed);
            return z.f158842a;
        }
    }

    public static final class a implements v.a {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ androidx.fragment.app.e f131876a;

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ v.a f131877b;

        /* renamed from: c  reason: collision with root package name */
        final /* synthetic */ h.f.a.m f131878c;

        static {
            Covode.recordClassIndex(86401);
        }

        @Override // com.ss.android.ugc.aweme.port.in.v.a
        public final void a(String[] strArr, int[] iArr) {
            b.a(strArr, iArr, this.f131876a);
            if (f.a(iArr)) {
                this.f131877b.a(strArr, iArr);
            } else {
                this.f131878c.invoke(strArr, iArr);
            }
        }

        a(androidx.fragment.app.e eVar, v.a aVar, h.f.a.m mVar) {
            this.f131876a = eVar;
            this.f131877b = aVar;
            this.f131878c = mVar;
        }
    }

    /* access modifiers changed from: package-private */
    public static final class b extends m implements h.f.a.m<String[], int[], z> {
        final /* synthetic */ androidx.fragment.app.e $activity;
        final /* synthetic */ h.f.a.a $onSettingCancelled;
        final /* synthetic */ h.f.a.a $onSettingDismissed;
        final /* synthetic */ String[] $permissions;
        final /* synthetic */ Map $permissionsToText;

        static {
            Covode.recordClassIndex(86402);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        b(androidx.fragment.app.e eVar, String[] strArr, Map map, h.f.a.a aVar, h.f.a.a aVar2) {
            super(2);
            this.$activity = eVar;
            this.$permissions = strArr;
            this.$permissionsToText = map;
            this.$onSettingCancelled = aVar;
            this.$onSettingDismissed = aVar2;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object, java.lang.Object] */
        @Override // h.f.a.m
        public final /* synthetic */ z invoke(String[] strArr, int[] iArr) {
            String[] a2 = f.a(strArr, iArr);
            androidx.fragment.app.e eVar = this.$activity;
            String[] strArr2 = this.$permissions;
            String string = eVar.getString(R.string.g_u);
            l.b(string, "");
            g.a(eVar, strArr2, string, g.a(this.$activity, this.$permissionsToText, a2), this.$onSettingCancelled, this.$onSettingDismissed);
            return z.f158842a;
        }
    }

    public static void a(androidx.fragment.app.e eVar, h.f.a.a<z> aVar) {
        l.d(eVar, "");
        l.d(aVar, "");
        Intent intent = eVar.getIntent();
        l.b(intent, "");
        String[] a2 = e.a(intent);
        if (!f.a(a2)) {
            String[] b2 = f.b(a2);
            Map<String, String> a3 = a(eVar);
            String string = eVar.getString(R.string.g_u);
            l.b(string, "");
            a(eVar, b2, string, a(eVar, a3, b2), aVar);
        }
    }

    public static String a(Context context, Map<String, String> map, String[] strArr) {
        int length = strArr.length;
        if (length == 1) {
            String string = context.getString(R.string.g_v, map.get(strArr[0]));
            l.b(string, "");
            return string;
        } else if (length == 2) {
            String string2 = context.getString(R.string.g_w, map.get(strArr[0]), map.get(strArr[1]));
            l.b(string2, "");
            return string2;
        } else if (length != 3) {
            return "";
        } else {
            String string3 = context.getString(R.string.g_x, map.get(strArr[0]), map.get(strArr[1]), map.get(strArr[2]));
            l.b(string3, "");
            return string3;
        }
    }

    public static void a(androidx.fragment.app.e eVar, h.f.a.a<z> aVar, h.f.a.a<z> aVar2) {
        l.d(eVar, "");
        l.d(aVar, "");
        l.d(aVar2, "");
        String string = eVar.getString(R.string.g_k);
        l.b(string, "");
        String string2 = eVar.getString(R.string.g_j);
        l.b(string2, "");
        a(eVar, new String[]{"android.permission.WRITE_EXTERNAL_STORAGE"}, string, string2, aVar, aVar2);
    }

    public static void a(androidx.fragment.app.e eVar, v.a aVar, h.f.a.a<z> aVar2, h.f.a.a<z> aVar3) {
        l.d(eVar, "");
        l.d(aVar, "");
        l.d(aVar2, "");
        l.d(aVar3, "");
        a(eVar, new String[]{"android.permission.WRITE_EXTERNAL_STORAGE"}, new e(eVar, aVar2, aVar3), aVar);
    }

    private static void a(androidx.fragment.app.e eVar, String[] strArr, h.f.a.m<? super String[], ? super int[], z> mVar, v.a aVar) {
        if (f.a(strArr)) {
            ArrayList arrayList = new ArrayList(strArr.length);
            int length = strArr.length;
            for (int i2 = 0; i2 < length; i2++) {
                arrayList.add(0);
            }
            aVar.a(strArr, n.e((Collection<Integer>) arrayList));
        } else if (com.ss.android.ugc.aweme.port.in.c.D.c().a()) {
            b.a(strArr, eVar);
            com.ss.android.ugc.aweme.port.in.c.C.b().a(eVar, new a(eVar, aVar, mVar), (String[]) Arrays.copyOf(strArr, strArr.length));
        } else {
            mVar.invoke(strArr, null);
        }
    }

    private static /* synthetic */ void a(androidx.fragment.app.e eVar, String[] strArr, String str, String str2, h.f.a.a aVar) {
        a(eVar, strArr, str, str2, h.f131883a, aVar);
    }

    public static void a(androidx.fragment.app.e eVar, String[] strArr, String str, String str2, h.f.a.a<z> aVar, h.f.a.a<z> aVar2) {
        b.b(strArr, eVar);
        AutoDismissPermissionDialog autoDismissPermissionDialog = new AutoDismissPermissionDialog(eVar, com.bytedance.tux.dialog.b.c.a(new com.bytedance.tux.dialog.b(eVar).b(str).d(str2), new j(strArr, eVar, aVar)));
        autoDismissPermissionDialog.f131860b = new i(aVar2);
        autoDismissPermissionDialog.a();
    }
}
