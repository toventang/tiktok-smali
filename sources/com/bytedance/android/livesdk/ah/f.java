package com.bytedance.android.livesdk.ah;

import android.app.Activity;
import android.app.FragmentManager;
import android.content.DialogInterface;
import android.os.Build;
import com.bytedance.android.livesdk.ah.b;
import com.bytedance.android.livesdk.ah.c.e;
import com.bytedance.android.livesdk.ah.e;
import com.bytedance.android.livesdk.l.b;
import com.bytedance.covode.number.Covode;
import com.zhiliaoapp.musically.R;
import java.util.ArrayList;
import java.util.Iterator;

public final class f {

    /* renamed from: a  reason: collision with root package name */
    private b f13727a;

    static {
        Covode.recordClassIndex(7636);
    }

    public static abstract class a implements com.bytedance.android.livesdk.ah.b.b {
        static {
            Covode.recordClassIndex(7637);
        }

        /* access modifiers changed from: protected */
        public abstract String a(Activity activity);

        /* access modifiers changed from: protected */
        public abstract String a(Activity activity, String... strArr);

        /* access modifiers changed from: protected */
        public String b(Activity activity) {
            return activity.getString(R.string.gwr);
        }

        @Override // com.bytedance.android.livesdk.ah.b.b
        public final void a(Activity activity, com.bytedance.android.livesdk.ah.b.c cVar, String[] strArr) {
            b.a aVar = new b.a(activity);
            aVar.f18284a = a(activity);
            aVar.f18285b = a(activity, strArr);
            b.a b2 = aVar.a((CharSequence) b(activity), (DialogInterface.OnClickListener) new g(this, cVar), false).b((CharSequence) activity.getString(R.string.gle), h.f13735a, false);
            b2.p = i.f13736a;
            b2.f18296m = false;
            b2.q = new j(this, cVar);
            b2.a().show();
        }
    }

    public static class d extends a {
        static {
            Covode.recordClassIndex(7640);
        }

        /* access modifiers changed from: protected */
        @Override // com.bytedance.android.livesdk.ah.f.a
        public final String a(Activity activity) {
            return activity.getString(R.string.gxf);
        }

        /* access modifiers changed from: protected */
        @Override // com.bytedance.android.livesdk.ah.f.a
        public final String b(Activity activity) {
            return activity.getString(R.string.gyi);
        }

        /* access modifiers changed from: protected */
        @Override // com.bytedance.android.livesdk.ah.f.a
        public final String a(Activity activity, String... strArr) {
            Object[] objArr = new Object[1];
            ArrayList<Integer> arrayList = new ArrayList();
            for (String str : strArr) {
                if (d.f13724a.containsKey(str)) {
                    Integer num = d.f13724a.get(str);
                    if (!arrayList.contains(num)) {
                        arrayList.add(num);
                    }
                }
            }
            StringBuilder sb = new StringBuilder();
            for (Integer num2 : arrayList) {
                if (sb.length() > 0) {
                    sb.append(", ");
                }
                sb.append(activity.getString(num2.intValue()));
            }
            objArr[0] = sb.toString();
            return activity.getString(R.string.gxe, objArr);
        }
    }

    public static b a(Activity activity) {
        return new b(activity);
    }

    public static class b {

        /* renamed from: a  reason: collision with root package name */
        Activity f13728a;

        /* renamed from: b  reason: collision with root package name */
        com.bytedance.android.livesdk.ah.b.b f13729b = new c();

        /* renamed from: c  reason: collision with root package name */
        com.bytedance.android.livesdk.ah.b.b f13730c = new d();

        /* renamed from: d  reason: collision with root package name */
        public Runnable f13731d = k.f13739a;

        /* renamed from: e  reason: collision with root package name */
        Runnable f13732e = l.f13740a;

        static {
            Covode.recordClassIndex(7638);
        }

        public b(Activity activity) {
            this.f13728a = activity;
        }

        public final void a(com.bytedance.android.livesdk.ah.b.d dVar, String... strArr) {
            Activity activity = this.f13728a;
            if (activity != null && !activity.isFinishing()) {
                try {
                    new f(this.f13728a, (byte) 0).a(dVar, this.f13731d, this.f13729b, this.f13730c, this.f13732e, strArr);
                } catch (Exception e2) {
                    e2.printStackTrace();
                }
            }
        }
    }

    private f(Activity activity) {
        FragmentManager fragmentManager = activity.getFragmentManager();
        b bVar = (b) fragmentManager.findFragmentByTag("PermissionsRequest");
        if (bVar == null) {
            bVar = new b();
            fragmentManager.beginTransaction().add(bVar, "PermissionsRequest").commitAllowingStateLoss();
            fragmentManager.executePendingTransactions();
        }
        this.f13727a = bVar;
    }

    /* synthetic */ f(Activity activity, byte b2) {
        this(activity);
    }

    public static class c implements com.bytedance.android.livesdk.ah.b.b {
        static {
            Covode.recordClassIndex(7639);
        }

        @Override // com.bytedance.android.livesdk.ah.b.b
        public final void a(Activity activity, com.bytedance.android.livesdk.ah.b.c cVar, String[] strArr) {
            cVar.a();
        }
    }

    public final void a(com.bytedance.android.livesdk.ah.b.d dVar, Runnable runnable, com.bytedance.android.livesdk.ah.b.b bVar, com.bytedance.android.livesdk.ah.b.b bVar2, Runnable runnable2, String... strArr) {
        b bVar3 = this.f13727a;
        com.bytedance.android.live.core.c.a.a(3, "PermissionFragment", "requestPermissions: ");
        b.a aVar = new b.a(strArr, runnable, dVar, bVar, runnable2, bVar2);
        String[] a2 = d.a(bVar3.getActivity(), aVar.f13713a);
        if (a2.length == 0) {
            aVar.a(false);
            return;
        }
        aVar.f13714b = a2;
        aVar.f13716d.run();
        e eVar = e.a.f13726a;
        String[] strArr2 = aVar.f13714b;
        if (strArr2 != null) {
            for (String str : strArr2) {
                Iterator<Object> it = eVar.a(str).iterator();
                while (it.hasNext()) {
                    it.next();
                }
            }
        }
        if (Build.VERSION.SDK_INT < 23 || e.a.f13723a.a()) {
            bVar3.a(aVar);
            return;
        }
        aVar.f13715c.a(bVar3.getActivity(), 
        /*  JADX ERROR: Method code generation error
            jadx.core.utils.exceptions.CodegenException: Error generate insn: 0x0073: INVOKE  
              (wrap: com.bytedance.android.livesdk.ah.b.b : 0x006f: IGET  (r1v4 com.bytedance.android.livesdk.ah.b.b) = (r7v0 'aVar' com.bytedance.android.livesdk.ah.b$a) com.bytedance.android.livesdk.ah.b.a.c com.bytedance.android.livesdk.ah.b.b)
              (wrap: android.app.Activity : 0x006b: INVOKE  (r2v1 android.app.Activity) = (r6v0 'bVar3' com.bytedance.android.livesdk.ah.b) type: VIRTUAL call: com.bytedance.android.livesdk.ah.b.getActivity():android.app.Activity)
              (wrap: com.bytedance.android.livesdk.ah.b$1 : 0x0068: CONSTRUCTOR  (r3v1 com.bytedance.android.livesdk.ah.b$1) = (r6v0 'bVar3' com.bytedance.android.livesdk.ah.b), (r7v0 'aVar' com.bytedance.android.livesdk.ah.b$a) call: com.bytedance.android.livesdk.ah.b.1.<init>(com.bytedance.android.livesdk.ah.b, com.bytedance.android.livesdk.ah.b$a):void type: CONSTRUCTOR)
              (wrap: java.lang.String[] : 0x0071: IGET  (r0v8 java.lang.String[]) = (r7v0 'aVar' com.bytedance.android.livesdk.ah.b$a) com.bytedance.android.livesdk.ah.b.a.a java.lang.String[])
             type: INTERFACE call: com.bytedance.android.livesdk.ah.b.b.a(android.app.Activity, com.bytedance.android.livesdk.ah.b.c, java.lang.String[]):void in method: com.bytedance.android.livesdk.ah.f.a(com.bytedance.android.livesdk.ah.b.d, java.lang.Runnable, com.bytedance.android.livesdk.ah.b.b, com.bytedance.android.livesdk.ah.b.b, java.lang.Runnable, java.lang.String[]):void, file: classes7.dex
            	at jadx.core.codegen.InsnGen.makeInsn(InsnGen.java:255)
            	at jadx.core.codegen.InsnGen.makeInsn(InsnGen.java:217)
            	at jadx.core.codegen.RegionGen.makeSimpleBlock(RegionGen.java:110)
            	at jadx.core.codegen.RegionGen.makeRegion(RegionGen.java:56)
            	at jadx.core.codegen.RegionGen.makeSimpleRegion(RegionGen.java:93)
            	at jadx.core.codegen.RegionGen.makeRegion(RegionGen.java:59)
            	at jadx.core.codegen.RegionGen.makeSimpleRegion(RegionGen.java:93)
            	at jadx.core.codegen.RegionGen.makeRegion(RegionGen.java:59)
            	at jadx.core.codegen.RegionGen.makeSimpleRegion(RegionGen.java:93)
            	at jadx.core.codegen.RegionGen.makeRegion(RegionGen.java:59)
            	at jadx.core.codegen.RegionGen.makeSimpleRegion(RegionGen.java:93)
            	at jadx.core.codegen.RegionGen.makeRegion(RegionGen.java:59)
            	at jadx.core.codegen.RegionGen.makeSimpleRegion(RegionGen.java:93)
            	at jadx.core.codegen.RegionGen.makeRegion(RegionGen.java:59)
            	at jadx.core.codegen.MethodGen.addRegionInsns(MethodGen.java:244)
            	at jadx.core.codegen.MethodGen.addInstructions(MethodGen.java:237)
            	at jadx.core.codegen.ClassGen.addMethodCode(ClassGen.java:342)
            	at jadx.core.codegen.ClassGen.addMethod(ClassGen.java:295)
            	at jadx.core.codegen.ClassGen.lambda$addInnerClsAndMethods$2(ClassGen.java:264)
            	at java.base/java.util.stream.ForEachOps$ForEachOp$OfRef.accept(ForEachOps.java:183)
            	at java.base/java.util.ArrayList.forEach(ArrayList.java:1511)
            	at java.base/java.util.stream.SortedOps$RefSortingSink.end(SortedOps.java:395)
            	at java.base/java.util.stream.Sink$ChainedReference.end(Sink.java:258)
            Caused by: jadx.core.utils.exceptions.CodegenException: Error generate insn: 0x0068: CONSTRUCTOR  (r3v1 com.bytedance.android.livesdk.ah.b$1) = (r6v0 'bVar3' com.bytedance.android.livesdk.ah.b), (r7v0 'aVar' com.bytedance.android.livesdk.ah.b$a) call: com.bytedance.android.livesdk.ah.b.1.<init>(com.bytedance.android.livesdk.ah.b, com.bytedance.android.livesdk.ah.b$a):void type: CONSTRUCTOR in method: com.bytedance.android.livesdk.ah.f.a(com.bytedance.android.livesdk.ah.b.d, java.lang.Runnable, com.bytedance.android.livesdk.ah.b.b, com.bytedance.android.livesdk.ah.b.b, java.lang.Runnable, java.lang.String[]):void, file: classes7.dex
            	at jadx.core.codegen.InsnGen.makeInsn(InsnGen.java:255)
            	at jadx.core.codegen.InsnGen.addWrappedArg(InsnGen.java:119)
            	at jadx.core.codegen.InsnGen.addArg(InsnGen.java:103)
            	at jadx.core.codegen.InsnGen.generateMethodArguments(InsnGen.java:806)
            	at jadx.core.codegen.InsnGen.makeInvoke(InsnGen.java:746)
            	at jadx.core.codegen.InsnGen.makeInsnBody(InsnGen.java:367)
            	at jadx.core.codegen.InsnGen.makeInsn(InsnGen.java:249)
            	... 22 more
            Caused by: jadx.core.utils.exceptions.JadxRuntimeException: Expected class to be processed at this point, class: com.bytedance.android.livesdk.ah.b, state: GENERATED_AND_UNLOADED
            	at jadx.core.dex.nodes.ClassNode.ensureProcessed(ClassNode.java:215)
            	at jadx.core.codegen.InsnGen.makeConstructor(InsnGen.java:630)
            	at jadx.core.codegen.InsnGen.makeInsnBody(InsnGen.java:363)
            	at jadx.core.codegen.InsnGen.makeInsn(InsnGen.java:230)
            	... 28 more
            */
        /*
        // Method dump skipped, instructions count: 119
        */
        throw new UnsupportedOperationException("Method not decompiled: com.bytedance.android.livesdk.ah.f.a(com.bytedance.android.livesdk.ah.b.d, java.lang.Runnable, com.bytedance.android.livesdk.ah.b.b, com.bytedance.android.livesdk.ah.b.b, java.lang.Runnable, java.lang.String[]):void");
    }
}
