package com.ss.android.ugc.aweme.i18n.xbridge.d.a;

import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.net.Uri;
import android.os.Environment;
import b.i;
import b.j;
import com.bytedance.covode.number.Covode;
import com.bytedance.ies.xbridge.base.runtime.a.e;
import com.ss.android.ugc.aweme.ce.b;
import com.ss.android.ugc.aweme.common.r;
import com.ss.android.ugc.aweme.cw.g;
import com.ss.android.ugc.aweme.cw.l;
import com.ss.android.ugc.aweme.cw.o;
import com.ss.android.ugc.aweme.fe.method.ImageChooseActivity;
import com.ss.android.ugc.aweme.out.AVExternalServiceImpl;
import com.ss.android.ugc.aweme.profile.ae;
import com.ss.android.ugc.aweme.services.external.ability.IAVProcessService;
import com.ss.android.ugc.aweme.utils.cs;
import com.zhiliaoapp.musically.R;
import h.a.n;
import h.f.b.l;
import h.f.b.m;
import h.z;
import java.io.File;
import java.io.IOException;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.Objects;
import java.util.concurrent.ExecutorService;

public final class a implements com.ss.android.ugc.aweme.i18n.xbridge.a.a {

    /* renamed from: c  reason: collision with root package name */
    public static final C2451a f99989c = new C2451a((byte) 0);

    /* renamed from: a  reason: collision with root package name */
    public final com.ss.android.ugc.aweme.i18n.xbridge.a.b f99990a;

    /* renamed from: b  reason: collision with root package name */
    public boolean f99991b;

    /* renamed from: d  reason: collision with root package name */
    private final WeakReference<Activity> f99992d;

    /* renamed from: e  reason: collision with root package name */
    private int f99993e = 1;

    /* renamed from: f  reason: collision with root package name */
    private boolean f99994f;

    /* renamed from: g  reason: collision with root package name */
    private String f99995g = "";

    /* renamed from: h  reason: collision with root package name */
    private boolean f99996h = true;

    /* renamed from: i  reason: collision with root package name */
    private String f99997i = "";

    /* renamed from: j  reason: collision with root package name */
    private boolean f99998j = true;

    /* renamed from: k  reason: collision with root package name */
    private boolean f99999k;

    /* renamed from: l  reason: collision with root package name */
    private int f100000l;

    /* renamed from: m  reason: collision with root package name */
    private int f100001m;
    private float n = 1.0f;
    private final ExecutorService o;

    static {
        Covode.recordClassIndex(63738);
    }

    /* renamed from: com.ss.android.ugc.aweme.i18n.xbridge.d.a.a$a  reason: collision with other inner class name */
    public static final class C2451a {
        static {
            Covode.recordClassIndex(63739);
        }

        private C2451a() {
        }

        public /* synthetic */ C2451a(byte b2) {
            this();
        }

        public static String a(Context context, String str) {
            String a2 = c.d.a.a(context, Uri.parse(str));
            if (a2 == null) {
                a2 = "";
            }
            try {
                String b2 = cs.b(a2);
                l.b(b2, "");
                return b2;
            } catch (IOException unused) {
                return "";
            }
        }
    }

    public static final class b implements Runnable {

        /* renamed from: a  reason: collision with root package name */
        public final Activity f100002a;

        /* renamed from: b  reason: collision with root package name */
        public final List<String> f100003b;

        /* renamed from: c  reason: collision with root package name */
        public final h.f.a.b<List<String>, z> f100004c;

        /* renamed from: d  reason: collision with root package name */
        private final WeakReference<com.ss.android.ugc.aweme.i18n.xbridge.a.b> f100005d;

        static {
            Covode.recordClassIndex(63740);
        }

        public final void run() {
            i<List<String>> a2 = a(this.f100003b);
            try {
                a2.f();
            } catch (InterruptedException e2) {
                e2.printStackTrace();
            }
            List<String> d2 = a2.d();
            h.f.a.b<List<String>, z> bVar = this.f100004c;
            l.b(d2, "");
            bVar.invoke(d2);
        }

        /* renamed from: com.ss.android.ugc.aweme.i18n.xbridge.d.a.a$b$a  reason: collision with other inner class name */
        public static final class C2452a implements IAVProcessService.IProcessCallback<String> {

            /* renamed from: a  reason: collision with root package name */
            final /* synthetic */ IAVProcessService f100006a;

            /* renamed from: b  reason: collision with root package name */
            final /* synthetic */ ArrayList f100007b;

            /* renamed from: c  reason: collision with root package name */
            final /* synthetic */ List f100008c;

            /* renamed from: d  reason: collision with root package name */
            final /* synthetic */ j f100009d;

            static {
                Covode.recordClassIndex(63741);
            }

            /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
            @Override // com.ss.android.ugc.aweme.services.external.ability.IAVProcessService.IProcessCallback
            public final /* synthetic */ void finish(String str) {
                this.f100007b.add(str);
                if (this.f100007b.size() == this.f100008c.size()) {
                    this.f100009d.a(this.f100007b);
                }
            }

            C2452a(IAVProcessService iAVProcessService, ArrayList arrayList, List list, j jVar) {
                this.f100006a = iAVProcessService;
                this.f100007b = arrayList;
                this.f100008c = list;
                this.f100009d = jVar;
            }
        }

        private static i<List<String>> a(List<String> list) {
            j jVar = new j();
            try {
                IAVProcessService processService = AVExternalServiceImpl.a().abilityService().processService();
                ArrayList arrayList = new ArrayList();
                Iterator<T> it = list.iterator();
                while (it.hasNext()) {
                    processService.compressPhoto(it.next(), 216, 384, new C2452a(processService, arrayList, list, jVar));
                }
            } catch (Exception e2) {
                e2.printStackTrace();
                jVar.a((Object) null);
            }
            i<TResult> iVar = jVar.f4869a;
            l.b(iVar, "");
            return iVar;
        }

        /* JADX DEBUG: Multi-variable search result rejected for r5v0, resolved type: h.f.a.b<? super java.util.List<java.lang.String>, h.z> */
        /* JADX WARN: Multi-variable type inference failed */
        public b(Activity activity, List<String> list, com.ss.android.ugc.aweme.i18n.xbridge.a.b bVar, h.f.a.b<? super List<String>, z> bVar2) {
            l.d(activity, "");
            l.d(list, "");
            l.d(bVar, "");
            l.d(bVar2, "");
            this.f100002a = activity;
            this.f100003b = list;
            this.f100004c = bVar2;
            this.f100005d = new WeakReference<>(bVar);
        }
    }

    public static void b(Activity activity) {
        if (!(!l.a((Object) "mounted", (Object) Environment.getExternalStorageState()))) {
            Intent intent = new Intent();
            intent.setType("image/*");
            intent.setAction("android.intent.action.PICK");
            activity.startActivityForResult(intent, 10003);
        }
    }

    public final void a(Activity activity) {
        Intent intent = new Intent(activity, ImageChooseActivity.class);
        intent.putExtra("maxSelectNum", this.f99993e);
        intent.putExtra("enter_from", this.f99997i);
        activity.startActivityForResult(intent, 10003);
        r.a("enter_image_choose", new com.ss.android.ugc.aweme.app.f.d().a("enter_from", this.f99997i).f66730a);
    }

    /* access modifiers changed from: package-private */
    public static final class c extends m implements h.f.a.b<List<? extends String>, z> {
        final /* synthetic */ Activity $ctx;
        final /* synthetic */ a this$0;

        static {
            Covode.recordClassIndex(63742);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        c(a aVar, Activity activity) {
            super(1);
            this.this$0 = aVar;
            this.$ctx = activity;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
        @Override // h.f.a.b
        public final /* synthetic */ z invoke(List<? extends String> list) {
            e.a aVar;
            List<? extends String> list2 = list;
            l.d(list2, "");
            ArrayList arrayList = new ArrayList(n.a((Iterable) list2, 10));
            for (T t : list2) {
                if (t == null) {
                    aVar = new e.a("", 0, "image");
                    if (this.this$0.f99991b) {
                        aVar.f35801a = "";
                    }
                } else {
                    aVar = new e.a(t, new File((String) t).length(), "image");
                    if (this.this$0.f99991b) {
                        aVar.f35801a = C2451a.a(this.$ctx, t);
                    }
                }
                arrayList.add(aVar);
            }
            final ArrayList arrayList2 = arrayList;
            this.$ctx.runOnUiThread(new Runnable(this) {
                /* class com.ss.android.ugc.aweme.i18n.xbridge.d.a.a.c.AnonymousClass1 */

                /* renamed from: a  reason: collision with root package name */
                final /* synthetic */ c f100010a;

                static {
                    Covode.recordClassIndex(63743);
                }

                {
                    this.f100010a = r1;
                }

                public final void run() {
                    com.ss.android.ugc.aweme.i18n.xbridge.a.b bVar = this.f100010a.this$0.f99990a;
                    com.bytedance.ies.xbridge.base.runtime.a.e eVar = new com.bytedance.ies.xbridge.base.runtime.a.e();
                    eVar.f35800a = arrayList2;
                    bVar.a(eVar);
                }
            });
            return z.f158842a;
        }
    }

    @Override // com.ss.android.ugc.aweme.i18n.xbridge.a.a
    public final void a(com.bytedance.ies.xbridge.base.runtime.a.d dVar) {
        boolean z;
        l.d(dVar, "");
        this.f99993e = dVar.f35793g;
        boolean z2 = false;
        if (dVar.f35794h || dVar.f35790d) {
            z = true;
        } else {
            z = false;
        }
        this.f99994f = z;
        this.f99999k = dVar.f35787a;
        this.f100001m = dVar.f35789c;
        int i2 = dVar.f35788b;
        this.f100000l = i2;
        int i3 = this.f100001m;
        if (i3 * i2 != 0) {
            this.n = (((float) i3) * 1.0f) / ((float) i2);
        }
        if (this.f99993e > 1) {
            z2 = true;
        }
        this.f99996h = z2;
        this.f99991b = dVar.f35790d;
        if (this.f99996h) {
            Activity activity = this.f99992d.get();
            Objects.requireNonNull(activity, "null cannot be cast to non-null type android.app.Activity");
            Activity activity2 = activity;
            if (androidx.core.content.b.a(activity2, "android.permission.WRITE_EXTERNAL_STORAGE") == 0) {
                a(activity2);
            } else {
                com.ss.android.ugc.aweme.ce.b.a(activity2, new String[]{"android.permission.WRITE_EXTERNAL_STORAGE"}, new e(this, activity2));
            }
        } else {
            Activity activity3 = this.f99992d.get();
            Objects.requireNonNull(activity3, "null cannot be cast to non-null type android.app.Activity");
            Activity activity4 = activity3;
            if (androidx.core.content.b.a(activity4, "android.permission.WRITE_EXTERNAL_STORAGE") == 0) {
                b(activity4);
            } else {
                com.ss.android.ugc.aweme.ce.b.a(activity4, new String[]{"android.permission.WRITE_EXTERNAL_STORAGE"}, new d(this, activity4));
            }
        }
    }

    static final class d implements b.AbstractC1579b {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ a f100012a;

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ Activity f100013b;

        static {
            Covode.recordClassIndex(63744);
        }

        d(a aVar, Activity activity) {
            this.f100012a = aVar;
            this.f100013b = activity;
        }

        @Override // com.ss.android.ugc.aweme.ce.b.AbstractC1579b
        public final void a(String[] strArr, int[] iArr) {
            l.b(iArr, "");
            if (iArr.length != 0) {
                if (iArr[0] == 0) {
                    a.b(this.f100013b);
                } else {
                    this.f100012a.f99990a.a(-6, "Permission rejected");
                }
            }
        }
    }

    static final class e implements b.AbstractC1579b {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ a f100014a;

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ Activity f100015b;

        static {
            Covode.recordClassIndex(63745);
        }

        e(a aVar, Activity activity) {
            this.f100014a = aVar;
            this.f100015b = activity;
        }

        @Override // com.ss.android.ugc.aweme.ce.b.AbstractC1579b
        public final void a(String[] strArr, int[] iArr) {
            l.b(iArr, "");
            if (iArr.length != 0) {
                if (iArr[0] == 0) {
                    this.f100014a.a(this.f100015b);
                    return;
                }
                new com.ss.android.ugc.aweme.tux.a.i.a(this.f100015b).a(this.f100015b.getString(R.string.doy)).a();
                this.f100014a.f99990a.a(-1, "no permission");
            }
        }
    }

    public a(WeakReference<Activity> weakReference, com.ss.android.ugc.aweme.i18n.xbridge.a.b bVar) {
        l.d(weakReference, "");
        l.d(bVar, "");
        this.f99992d = weakReference;
        this.f99990a = bVar;
        l.a a2 = com.ss.android.ugc.aweme.cw.l.a(o.SERIAL);
        a2.f79173b = "compressPhoto";
        this.o = g.a(a2.a());
    }

    private void a(Activity activity, List<? extends Uri> list) {
        long j2;
        h.f.b.l.d(activity, "");
        h.f.b.l.d(list, "");
        if (list.isEmpty()) {
            this.f99990a.a(0, "Path empty");
        } else {
            if (!(list instanceof Collection) || !list.isEmpty()) {
                Iterator<T> it = list.iterator();
                while (it.hasNext()) {
                    if (com.bytedance.common.utility.m.a(it.next().toString())) {
                    }
                }
            }
            if (this.f99994f) {
                ExecutorService executorService = this.o;
                ArrayList arrayList = new ArrayList(n.a((Iterable) list, 10));
                Iterator<T> it2 = list.iterator();
                while (it2.hasNext()) {
                    String uri = it2.next().toString();
                    h.f.b.l.b(uri, "");
                    arrayList.add(uri);
                }
                executorService.execute(new b(activity, arrayList, this.f99990a, new c(this, activity)));
                return;
            }
            ArrayList arrayList2 = new ArrayList(n.a((Iterable) list, 10));
            for (T t : list) {
                Long a2 = com.ss.android.ugc.aweme.fe.a.b.a(com.bytedance.ies.ugc.appcontext.d.a(), t);
                if (a2 != null) {
                    j2 = a2.longValue();
                } else {
                    j2 = 0;
                }
                String uri2 = t.toString();
                h.f.b.l.b(uri2, "");
                arrayList2.add(new e.a(uri2, j2, "image"));
            }
            com.ss.android.ugc.aweme.i18n.xbridge.a.b bVar = this.f99990a;
            com.bytedance.ies.xbridge.base.runtime.a.e eVar = new com.bytedance.ies.xbridge.base.runtime.a.e();
            eVar.f35800a = arrayList2;
            bVar.a(eVar);
            return;
        }
        this.f99990a.a(0, "Path empty");
    }

    @Override // com.ss.android.ugc.aweme.i18n.xbridge.a.a
    public final boolean a(int i2, int i3, Intent intent) {
        ArrayList arrayList;
        if (i3 == 0 || intent == null) {
            this.f99990a.a(-7, "User cancelled");
            return true;
        }
        Activity activity = this.f99992d.get();
        if (activity == null) {
            this.f99990a.a(0, "Activity not found");
            return true;
        } else if (this.f99999k) {
            Uri data = intent.getData();
            if (data == null || com.bytedance.common.utility.m.a(data.toString())) {
                this.f99990a.a(0, "Path empty");
                return true;
            }
            String uri = data.toString();
            h.f.b.l.b(uri, "");
            if (i2 == 10003) {
                ae.f115954a.gotoCropActivity(activity, uri, false, this.n, (int) com.bytedance.common.utility.n.b(activity, 16.0f), 10004, 0, 0, -1, false);
            } else if (i2 == 10004) {
                a(activity, n.a(data));
            }
            return true;
        } else {
            if (i3 == 41312) {
                String[] stringArrayExtra = intent.getStringArrayExtra("images");
                if (stringArrayExtra != null) {
                    ArrayList arrayList2 = new ArrayList(stringArrayExtra.length);
                    for (String str : stringArrayExtra) {
                        arrayList2.add(Uri.parse(str));
                    }
                    arrayList = arrayList2;
                } else {
                    arrayList = new ArrayList();
                }
            } else {
                arrayList = n.d(intent.getData());
            }
            a(activity, arrayList);
            return true;
        }
    }
}
