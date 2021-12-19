package com.bytedance.im.core.internal.b.a;

import android.os.Looper;
import android.os.Message;
import android.os.SystemClock;
import android.text.TextUtils;
import com.bytedance.covode.number.Covode;
import com.bytedance.frameworks.apm.trace.MethodCollector;
import com.bytedance.im.core.a.a.b;
import com.bytedance.im.core.a.d;
import com.bytedance.im.core.c.f;
import com.bytedance.im.core.d.ai;
import com.bytedance.im.core.d.h;
import com.bytedance.im.core.d.u;
import com.bytedance.im.core.internal.d.c;
import com.bytedance.im.core.internal.d.j;
import com.bytedance.im.core.internal.d.k;
import com.bytedance.im.core.internal.utils.l;
import com.bytedance.im.core.internal.utils.t;
import com.bytedance.im.core.internal.utils.x;
import com.bytedance.im.core.proto.RequestBody;
import com.bytedance.im.core.proto.UnReadCountReportRequestBody;
import java.util.ArrayList;
import java.util.List;

public final class x implements x.a {

    /* renamed from: c  reason: collision with root package name */
    private static x f38630c;

    /* renamed from: d  reason: collision with root package name */
    private static List<a> f38631d = new ArrayList();

    /* renamed from: a  reason: collision with root package name */
    public com.bytedance.im.core.internal.utils.x f38632a = new com.bytedance.im.core.internal.utils.x(Looper.getMainLooper(), this);

    /* renamed from: b  reason: collision with root package name */
    public boolean f38633b;

    public interface a {
        static {
            Covode.recordClassIndex(23059);
        }

        w a();
    }

    @Override // com.bytedance.im.core.internal.utils.x.a
    public final void a(Message message) {
        if (message.obj instanceof k) {
            k kVar = (k) message.obj;
            if (kVar.f38727h != null) {
                kVar.f38727h.c(kVar);
            }
        }
    }

    static {
        Covode.recordClassIndex(23055);
    }

    private x() {
        c.a().a(this.f38632a);
    }

    public static x a() {
        MethodCollector.i(11472);
        if (f38630c == null) {
            synchronized (x.class) {
                try {
                    if (f38630c == null) {
                        f38630c = new x();
                    }
                } catch (Throwable th) {
                    MethodCollector.o(11472);
                    throw th;
                }
            }
        }
        x xVar = f38630c;
        MethodCollector.o(11472);
        return xVar;
    }

    public final void a(Runnable runnable) {
        this.f38632a.post(runnable);
    }

    public static void a(String str) {
        new o().a(str);
    }

    public static void b(String str) {
        new ad().a(str, 0, (j) null);
    }

    public static void a(long j2) {
        ar arVar = new ar();
        if (d.a().b().T) {
            UnReadCountReportRequestBody.Builder builder = new UnReadCountReportRequestBody.Builder();
            if (j2 != -1) {
                builder.total_unread_count(Long.valueOf(j2));
            }
            arVar.a(0, new RequestBody.Builder().unread_count_report_body(builder.build()).build(), null, new Object[0]);
        }
    }

    public static void b(int i2, int i3) {
        if (a("getMessageByUser", 0, i2, i3)) {
            new u(i2).a(i3);
        }
    }

    public final void c(final int i2, final int i3) {
        if (a("pullRecentAndCmdMessage", 1, i2, i3)) {
            if (d.a().b().ak) {
                new v(i2).a(i3);
                new m(i2).a(i3);
                return;
            }
            new v(i2, new b<Boolean>() {
                /* class com.bytedance.im.core.internal.b.a.x.AnonymousClass1 */

                static {
                    Covode.recordClassIndex(23056);
                }

                @Override // com.bytedance.im.core.a.a.b
                public final void a(u uVar) {
                }

                /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
                @Override // com.bytedance.im.core.a.a.b
                public final /* synthetic */ void a(Boolean bool) {
                    new m(i2).a(i3);
                }
            }).a(i3);
        }
    }

    /* JADX WARNING: Removed duplicated region for block: B:11:0x0023  */
    /* JADX WARNING: Removed duplicated region for block: B:24:0x0032 A[EDGE_INSN: B:24:0x0032->B:15:0x0032 ?: BREAK  , SYNTHETIC] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static com.bytedance.im.core.internal.d.k a(com.bytedance.im.core.proto.IMCMD r2, com.bytedance.im.core.internal.d.k r3) {
        /*
            com.bytedance.im.core.proto.IMCMD r1 = com.bytedance.im.core.proto.IMCMD.NEW_MSG_NOTIFY
            r0 = 1
            if (r2 != r1) goto L_0x0036
            com.bytedance.im.core.internal.b.a.ai r0 = new com.bytedance.im.core.internal.b.a.ai
            r0.<init>()
            r3.f38727h = r0
        L_0x000c:
            r2 = 1
        L_0x000d:
            java.util.List<com.bytedance.im.core.internal.b.a.x$a> r0 = com.bytedance.im.core.internal.b.a.x.f38631d
            if (r0 == 0) goto L_0x0032
            boolean r0 = r0.isEmpty()
            if (r0 != 0) goto L_0x0032
            java.util.List<com.bytedance.im.core.internal.b.a.x$a> r0 = com.bytedance.im.core.internal.b.a.x.f38631d
            java.util.Iterator r1 = r0.iterator()
        L_0x001d:
            boolean r0 = r1.hasNext()
            if (r0 == 0) goto L_0x0032
            java.lang.Object r0 = r1.next()
            com.bytedance.im.core.internal.b.a.x$a r0 = (com.bytedance.im.core.internal.b.a.x.a) r0
            com.bytedance.im.core.internal.b.a.w r0 = r0.a()
            if (r0 == 0) goto L_0x001d
            r3.f38727h = r0
        L_0x0031:
            return r3
        L_0x0032:
            if (r2 != 0) goto L_0x0031
            r0 = 0
            return r0
        L_0x0036:
            com.bytedance.im.core.proto.IMCMD r0 = com.bytedance.im.core.proto.IMCMD.STRANGER_NEW_MSG_NOTIFY
            if (r2 != r0) goto L_0x0042
            com.bytedance.im.core.internal.b.a.aq r0 = new com.bytedance.im.core.internal.b.a.aq
            r0.<init>()
            r3.f38727h = r0
            goto L_0x000c
        L_0x0042:
            com.bytedance.im.core.proto.IMCMD r0 = com.bytedance.im.core.proto.IMCMD.NEW_P2P_MSG_NOTIFY
            if (r2 != r0) goto L_0x004e
            com.bytedance.im.core.internal.b.a.aj r0 = new com.bytedance.im.core.internal.b.a.aj
            r0.<init>()
            r3.f38727h = r0
            goto L_0x000c
        L_0x004e:
            r2 = 0
            goto L_0x000d
        */
        throw new UnsupportedOperationException("Method not decompiled: com.bytedance.im.core.internal.b.a.x.a(com.bytedance.im.core.proto.IMCMD, com.bytedance.im.core.internal.d.k):com.bytedance.im.core.internal.d.k");
    }

    public static void a(ai aiVar, b<ai> bVar) {
        al alVar = new al(bVar);
        if (aiVar == null) {
            alVar.b(k.a(-1015));
            return;
        }
        aiVar.setMsgStatus(1);
        alVar.f38367a.f37853a = SystemClock.uptimeMillis();
        f.b("imsdk", "SendMsgHandler save with opt:" + t.b(), (Throwable) null);
        if (t.b()) {
            t a2 = t.a();
            if (!TextUtils.isEmpty(aiVar.getUuid())) {
                f.b("imsdk", "SendMsgCache cacheMsg: uuid:" + aiVar.getUuid(), (Throwable) null);
                a2.f38865a.put(aiVar.getUuid(), aiVar);
            }
            com.bytedance.im.core.internal.e.d.a(
            /*  JADX ERROR: Method code generation error
                jadx.core.utils.exceptions.CodegenException: Error generate insn: 0x0077: INVOKE  
                  (wrap: com.bytedance.im.core.internal.b.a.al$5 : 0x006b: CONSTRUCTOR  (r2v3 com.bytedance.im.core.internal.b.a.al$5) = (r3v0 'alVar' com.bytedance.im.core.internal.b.a.al), (r7v0 'aiVar' com.bytedance.im.core.d.ai) call: com.bytedance.im.core.internal.b.a.al.5.<init>(com.bytedance.im.core.internal.b.a.al, com.bytedance.im.core.d.ai):void type: CONSTRUCTOR)
                  (wrap: com.bytedance.im.core.internal.b.a.al$6 : 0x0070: CONSTRUCTOR  (r1v2 com.bytedance.im.core.internal.b.a.al$6) = (r3v0 'alVar' com.bytedance.im.core.internal.b.a.al) call: com.bytedance.im.core.internal.b.a.al.6.<init>(com.bytedance.im.core.internal.b.a.al):void type: CONSTRUCTOR)
                  (wrap: java.util.concurrent.Executor : 0x0073: INVOKE  (r0v9 java.util.concurrent.Executor) =  type: STATIC call: com.bytedance.im.core.internal.e.a.b():java.util.concurrent.Executor)
                 type: STATIC call: com.bytedance.im.core.internal.e.d.a(com.bytedance.im.core.internal.e.c, com.bytedance.im.core.internal.e.b, java.util.concurrent.Executor):void in method: com.bytedance.im.core.internal.b.a.x.a(com.bytedance.im.core.d.ai, com.bytedance.im.core.a.a.b<com.bytedance.im.core.d.ai>):void, file: classes10.dex
                	at jadx.core.codegen.InsnGen.makeInsn(InsnGen.java:255)
                	at jadx.core.codegen.InsnGen.makeInsn(InsnGen.java:217)
                	at jadx.core.codegen.RegionGen.makeSimpleBlock(RegionGen.java:110)
                	at jadx.core.codegen.RegionGen.makeRegion(RegionGen.java:56)
                	at jadx.core.codegen.RegionGen.makeSimpleRegion(RegionGen.java:93)
                	at jadx.core.codegen.RegionGen.makeRegion(RegionGen.java:59)
                	at jadx.core.codegen.RegionGen.makeRegionIndent(RegionGen.java:99)
                	at jadx.core.codegen.RegionGen.makeIf(RegionGen.java:143)
                	at jadx.core.codegen.RegionGen.makeRegion(RegionGen.java:63)
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
                Caused by: jadx.core.utils.exceptions.CodegenException: Error generate insn: 0x006b: CONSTRUCTOR  (r2v3 com.bytedance.im.core.internal.b.a.al$5) = (r3v0 'alVar' com.bytedance.im.core.internal.b.a.al), (r7v0 'aiVar' com.bytedance.im.core.d.ai) call: com.bytedance.im.core.internal.b.a.al.5.<init>(com.bytedance.im.core.internal.b.a.al, com.bytedance.im.core.d.ai):void type: CONSTRUCTOR in method: com.bytedance.im.core.internal.b.a.x.a(com.bytedance.im.core.d.ai, com.bytedance.im.core.a.a.b<com.bytedance.im.core.d.ai>):void, file: classes10.dex
                	at jadx.core.codegen.InsnGen.makeInsn(InsnGen.java:255)
                	at jadx.core.codegen.InsnGen.addWrappedArg(InsnGen.java:119)
                	at jadx.core.codegen.InsnGen.addArg(InsnGen.java:103)
                	at jadx.core.codegen.InsnGen.generateMethodArguments(InsnGen.java:806)
                	at jadx.core.codegen.InsnGen.makeInvoke(InsnGen.java:746)
                	at jadx.core.codegen.InsnGen.makeInsnBody(InsnGen.java:367)
                	at jadx.core.codegen.InsnGen.makeInsn(InsnGen.java:249)
                	... 23 more
                Caused by: jadx.core.utils.exceptions.JadxRuntimeException: Expected class to be processed at this point, class: com.bytedance.im.core.internal.b.a.al, state: GENERATED_AND_UNLOADED
                	at jadx.core.dex.nodes.ClassNode.ensureProcessed(ClassNode.java:215)
                	at jadx.core.codegen.InsnGen.makeConstructor(InsnGen.java:630)
                	at jadx.core.codegen.InsnGen.makeInsnBody(InsnGen.java:363)
                	at jadx.core.codegen.InsnGen.makeInsn(InsnGen.java:230)
                	... 29 more
                */
            /*
            // Method dump skipped, instructions count: 171
            */
            throw new UnsupportedOperationException("Method not decompiled: com.bytedance.im.core.internal.b.a.x.a(com.bytedance.im.core.d.ai, com.bytedance.im.core.a.a.b):void");
        }

        public final void a(int i2, int i3) {
            if (l.a().f38777b) {
                f.b("imsdk", "IMHandlerCenter getMessageByLinkMode migrating now", (Throwable) null);
                return;
            }
            int b2 = l.a().b();
            if (b2 == 0) {
                b(i2, i3);
            } else if (b2 == 1) {
                c(i2, i3);
            } else {
                f.b("imsdk", "IMHandlerCenter getMessageByLinkMode invalid mode:".concat(String.valueOf(b2)), (Throwable) null);
            }
        }

        static boolean a(String str, int i2, int i3, int i4) {
            boolean z = l.a().f38777b;
            int b2 = l.a().b();
            if (i4 == 9) {
                return true;
            }
            if (!z && i2 == b2) {
                return true;
            }
            f.b("imsdk", "IMHandlerCenter " + str + " illegal state, inbox:" + i3 + ", reason:" + i4 + ", isMigrating:" + z + ", linkMode:" + b2, (Throwable) null);
            return false;
        }

        public static void a(int i2, String str, long j2, int i3, b<h> bVar) {
            new o(bVar).a(i2, str, j2, i3, System.currentTimeMillis(), true);
        }
    }
