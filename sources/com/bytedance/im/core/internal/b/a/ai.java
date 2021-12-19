package com.bytedance.im.core.internal.b.a;

import android.os.SystemClock;
import android.text.TextUtils;
import android.util.Pair;
import com.bytedance.covode.number.Covode;
import com.bytedance.im.core.c.f;
import com.bytedance.im.core.c.g;
import com.bytedance.im.core.d.aa;
import com.bytedance.im.core.d.ar;
import com.bytedance.im.core.d.as;
import com.bytedance.im.core.d.at;
import com.bytedance.im.core.d.aw;
import com.bytedance.im.core.d.bd;
import com.bytedance.im.core.d.h;
import com.bytedance.im.core.d.j;
import com.bytedance.im.core.d.u;
import com.bytedance.im.core.d.w;
import com.bytedance.im.core.internal.e.b;
import com.bytedance.im.core.internal.e.c;
import com.bytedance.im.core.internal.e.d;
import com.bytedance.im.core.internal.utils.e;
import com.bytedance.im.core.internal.utils.l;
import com.bytedance.im.core.internal.utils.n;
import com.bytedance.im.core.internal.utils.q;
import com.bytedance.im.core.internal.utils.s;
import com.bytedance.im.core.proto.IMCMD;
import com.bytedance.im.core.proto.MsgTrace;
import com.bytedance.im.core.proto.MsgTracePath;
import com.bytedance.im.core.proto.NewMessageNotify;
import com.bytedance.im.core.proto.NewMessageNotifyType;
import com.bytedance.im.core.proto.ResponseBody;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.Map;
import org.json.JSONObject;

public final class ai extends b {
    static {
        Covode.recordClassIndex(22946);
    }

    /* access modifiers changed from: package-private */
    public static class a {

        /* renamed from: a  reason: collision with root package name */
        boolean f38350a;

        /* renamed from: b  reason: collision with root package name */
        boolean f38351b;

        /* renamed from: c  reason: collision with root package name */
        boolean f38352c;

        /* renamed from: d  reason: collision with root package name */
        boolean f38353d;

        /* renamed from: e  reason: collision with root package name */
        boolean f38354e;

        /* renamed from: f  reason: collision with root package name */
        boolean f38355f;

        /* renamed from: g  reason: collision with root package name */
        com.bytedance.im.core.d.ai f38356g;

        /* renamed from: h  reason: collision with root package name */
        h f38357h;

        /* renamed from: i  reason: collision with root package name */
        bd f38358i;

        /* renamed from: j  reason: collision with root package name */
        MsgTracePath f38359j;

        static {
            Covode.recordClassIndex(22955);
        }

        private a() {
        }

        public final String toString() {
            String str;
            StringBuilder append = new StringBuilder("ProcessNotifyResult{isIgnored=").append(this.f38350a).append(", isCursorDiscontinuous=").append(this.f38351b).append(", isSucceed=").append(this.f38352c).append(", isMessageNew=").append(this.f38353d).append(", isProcessedBySendHandler=").append(this.f38355f).append(", message=");
            com.bytedance.im.core.d.ai aiVar = this.f38356g;
            String str2 = null;
            if (aiVar != null) {
                str = aiVar.getUuid();
            } else {
                str = null;
            }
            StringBuilder append2 = append.append(str).append(", conversation=");
            h hVar = this.f38357h;
            if (hVar != null) {
                str2 = hVar.getConversationId();
            }
            return append2.append(str2).append("}").toString();
        }

        /* synthetic */ a(byte b2) {
            this();
        }
    }

    /* access modifiers changed from: protected */
    @Override // com.bytedance.im.core.internal.b.a.b
    public final void a(final int i2, ResponseBody responseBody, final bd bdVar) {
        int[] a2;
        final NewMessageNotify newMessageNotify = responseBody.has_new_message_notify;
        if (newMessageNotify.notify_type == NewMessageNotifyType.PER_USER && (a2 = e.a()) != null) {
            g a3 = com.bytedance.im.core.c.h.a(newMessageNotify.message.server_message_id.longValue());
            if (this.f38421a.f38725f.start_time_stamp != null) {
                a3.f37635a = this.f38421a.f38725f.start_time_stamp;
            } else {
                a3.f37635a = newMessageNotify.message.create_time;
            }
            a3.f37637c = Long.valueOf(System.currentTimeMillis());
            a3.f37636b = newMessageNotify.message.create_time;
            a3.f37638d = Long.valueOf(a3.f37637c.longValue() - a3.f37635a.longValue());
            a3.f37642h = true;
            a3.f37643i = this.f38421a.f();
            for (int i3 : a2) {
                if (i2 == i3) {
                    Iterator<w> it = q.a().f38792f.iterator();
                    while (true) {
                        if (it.hasNext()) {
                            w next = it.next();
                            if (next != null && next.a(newMessageNotify)) {
                                break;
                            }
                        } else if (newMessageNotify.message == null) {
                            f.b("imsdk", "NewMsgNotifyHandler notifyByUser message null", (Throwable) null);
                        } else if (l.a().b() == 1) {
                            if (!h.a(newMessageNotify.message)) {
                                d.a(new c<a>() {
                                    /* class com.bytedance.im.core.internal.b.a.ai.AnonymousClass1 */

                                    static {
                                        Covode.recordClassIndex(22947);
                                    }

                                    /* access modifiers changed from: private */
                                    /* renamed from: b */
                                    public a a() {
                                        a aVar = new a((byte) 0);
                                        s.a();
                                        long b2 = s.b(i2);
                                        f.b("imsdk", "NewMsgNotifyHandler notifyNormalByRecentLink, localVersion:" + b2 + ", pre_version:" + newMessageNotify.previous_conversation_version + ", version:" + newMessageNotify.conversation_version, (Throwable) null);
                                        MsgTrace msgTrace = newMessageNotify.trace;
                                        aVar.f38358i = ai.a(bdVar, msgTrace);
                                        if (msgTrace != null) {
                                            aVar.f38359j = msgTrace.path;
                                        }
                                        if (newMessageNotify.conversation_version == null || newMessageNotify.previous_conversation_version == null) {
                                            aVar.f38351b = true;
                                            f.b("imsdk", "NewMsgNotifyHandler notifyNormalByRecentLink version discontinuous", (Throwable) null);
                                        } else if (newMessageNotify.conversation_version.longValue() <= b2) {
                                            f.b("imsdk", "NewMsgNotifyHandler notifyNormalByRecentLink, local already exist, ignore", (Throwable) null);
                                            aVar.f38350a = true;
                                        } else if (newMessageNotify.previous_conversation_version.longValue() <= b2) {
                                            ai.a(aVar, newMessageNotify);
                                            if (aVar.f38352c) {
                                                s.a();
                                                s.b(i2, newMessageNotify.conversation_version.longValue());
                                            }
                                        } else {
                                            aVar.f38351b = true;
                                            f.b("imsdk", "NewMsgNotifyHandler notifyNormalByRecentLink version discontinuous", (Throwable) null);
                                        }
                                        f.b("imsdk", "NewMsgNotifyHandler notifyNormalByRecentLink, result:".concat(String.valueOf(aVar)), (Throwable) null);
                                        return aVar;
                                    }
                                }, new b<a>() {
                                    /* class com.bytedance.im.core.internal.b.a.ai.AnonymousClass2 */

                                    static {
                                        Covode.recordClassIndex(22948);
                                    }

                                    /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
                                    @Override // com.bytedance.im.core.internal.e.b
                                    public final /* synthetic */ void a(a aVar) {
                                        final a aVar2 = aVar;
                                        f.b("imsdk", "NewMsgNotifyHandler notifyNormalByRecentLink onCallback", (Throwable) null);
                                        if (aVar2.f38351b) {
                                            x.a();
                                            int i2 = i2;
                                            if (x.a("pullRecentMessage", 1, i2, 2)) {
                                                new v(i2).a(2);
                                            }
                                        } else if (aVar2.f38352c && aVar2.f38356g != null) {
                                            if (aVar2.f38357h != null && aVar2.f38357h.isReadBadgeCountUpdated()) {
                                                ai.a(aVar2);
                                            } else if (!com.bytedance.im.core.a.d.a().b().aO) {
                                                new o().a(i2, aVar2.f38356g, newMessageNotify.badge_count.intValue());
                                            } else {
                                                new o(new com.bytedance.im.core.a.a.b<h>() {
                                                    /* class com.bytedance.im.core.internal.b.a.ai.AnonymousClass2.AnonymousClass1 */

                                                    static {
                                                        Covode.recordClassIndex(22949);
                                                    }

                                                    @Override // com.bytedance.im.core.a.a.b
                                                    public final void a(u uVar) {
                                                        f.b("imsdk", "NewMsgNotifyHandler  GetConversationInfo fail", (Throwable) null);
                                                    }

                                                    /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
                                                    @Override // com.bytedance.im.core.a.a.b
                                                    public final /* synthetic */ void a(h hVar) {
                                                        h hVar2 = hVar;
                                                        if (hVar2 != null && hVar2.isReadBadgeCountUpdated()) {
                                                            ai.a(aVar2);
                                                        }
                                                    }
                                                }).a(i2, aVar2.f38356g, newMessageNotify.badge_count.intValue());
                                            }
                                        }
                                        com.bytedance.im.core.internal.b.a.a(false);
                                    }
                                }, com.bytedance.im.core.internal.e.a.c());
                            } else if (com.bytedance.im.core.i.f.a(newMessageNotify.message)) {
                                com.bytedance.im.core.i.f.a().a(i2, newMessageNotify.message);
                                x.a().c(i2, 2);
                            } else {
                                d.a(new c<a>() {
                                    /* class com.bytedance.im.core.internal.b.a.ai.AnonymousClass3 */

                                    static {
                                        Covode.recordClassIndex(22950);
                                    }

                                    /* access modifiers changed from: private */
                                    /* renamed from: b */
                                    public a a() {
                                        a aVar = new a((byte) 0);
                                        s.a();
                                        long c2 = s.c(i2);
                                        s.a();
                                        long d2 = s.d(i2);
                                        f.b("imsdk", "NewMsgNotifyHandler notifyCommandByRecentLink, localCmdIndex:" + c2 + ", cmdIndex:" + newMessageNotify.cmd_message_index + ", localUserCursor:" + d2 + ", userCursor:" + newMessageNotify.next_cursor, (Throwable) null);
                                        if (newMessageNotify.cmd_message_index != null) {
                                            if (newMessageNotify.cmd_message_index.longValue() < c2) {
                                                f.b("imsdk", "NewMsgNotifyHandler notifyCommandByRecentLink, local already exist, ignore", (Throwable) null);
                                                aVar.f38350a = true;
                                            } else if (newMessageNotify.cmd_message_index.longValue() == c2) {
                                                ai.a(aVar, newMessageNotify);
                                                if (aVar.f38352c) {
                                                    s.a();
                                                    s.c(i2, newMessageNotify.cmd_message_index.longValue() + 1);
                                                }
                                                if (newMessageNotify.next_cursor == null || newMessageNotify.next_cursor.longValue() <= d2) {
                                                    f.b("imsdk", "NewMsgNotifyHandler notifyCommandByRecentLink mix cursor invalid", (Throwable) null);
                                                } else {
                                                    s.a();
                                                    s.d(i2, newMessageNotify.next_cursor.longValue());
                                                }
                                            }
                                            f.b("imsdk", "NewMsgNotifyHandler notifyCommandByRecentLink, result:".concat(String.valueOf(aVar)), (Throwable) null);
                                            return aVar;
                                        }
                                        aVar.f38351b = true;
                                        f.b("imsdk", "NewMsgNotifyHandler notifyCommandByRecentLink index discontinuous", (Throwable) null);
                                        f.b("imsdk", "NewMsgNotifyHandler notifyCommandByRecentLink, result:".concat(String.valueOf(aVar)), (Throwable) null);
                                        return aVar;
                                    }
                                }, new b<a>() {
                                    /* class com.bytedance.im.core.internal.b.a.ai.AnonymousClass4 */

                                    static {
                                        Covode.recordClassIndex(22951);
                                    }

                                    /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
                                    @Override // com.bytedance.im.core.internal.e.b
                                    public final /* synthetic */ void a(a aVar) {
                                        f.b("imsdk", "NewMsgNotifyHandler notifyCommandByRecentLink onCallback", (Throwable) null);
                                        if (aVar.f38351b) {
                                            x.a();
                                            int i2 = i2;
                                            if (x.a("pullCmdMessage", 1, i2, 2)) {
                                                new m(i2).a(2);
                                            }
                                        }
                                        com.bytedance.im.core.internal.b.a.a(false);
                                    }
                                }, com.bytedance.im.core.internal.e.a.c());
                            }
                        } else if (com.bytedance.im.core.i.f.a(newMessageNotify.message)) {
                            com.bytedance.im.core.i.f.a().a(i2, newMessageNotify.message);
                            x.a();
                            x.b(i2, 2);
                        } else {
                            d.a(new c<a>() {
                                /* class com.bytedance.im.core.internal.b.a.ai.AnonymousClass5 */

                                static {
                                    Covode.recordClassIndex(22952);
                                }

                                /* access modifiers changed from: private */
                                /* renamed from: b */
                                public a a() {
                                    a aVar = new a((byte) 0);
                                    s.a();
                                    long a2 = s.a(i2);
                                    MsgTrace msgTrace = newMessageNotify.trace;
                                    aVar.f38358i = ai.a(bdVar, msgTrace);
                                    if (msgTrace != null) {
                                        aVar.f38359j = msgTrace.path;
                                    }
                                    f.b("imsdk", "NewMsgNotifyHandler notifyByUserLink, localCursor:" + a2 + ", preCursor:" + newMessageNotify.previous_cursor + ", nextCursor:" + newMessageNotify.next_cursor, (Throwable) null);
                                    if (newMessageNotify.next_cursor.longValue() <= a2) {
                                        f.b("imsdk", "NewMsgNotifyHandler notifyByUserLink, local already exist, ignore", (Throwable) null);
                                        aVar.f38350a = true;
                                    } else if (newMessageNotify.previous_cursor.longValue() == a2) {
                                        ai.a(aVar, newMessageNotify);
                                        if (aVar.f38352c) {
                                            s.a();
                                            s.a(i2, newMessageNotify.next_cursor.longValue());
                                        }
                                    } else {
                                        f.b("imsdk", "NewMsgNotifyHandler notifyByUserLink, cursor discontinuous", (Throwable) null);
                                        aVar.f38351b = true;
                                    }
                                    f.b("imsdk", "NewMsgNotifyHandler notifyByUserLink, result=".concat(String.valueOf(aVar)), (Throwable) null);
                                    return aVar;
                                }
                            }, new b<a>() {
                                /* class com.bytedance.im.core.internal.b.a.ai.AnonymousClass6 */

                                static {
                                    Covode.recordClassIndex(22953);
                                }

                                /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
                                /* JADX WARNING: Code restructure failed: missing block: B:19:0x004c, code lost:
                                    if (com.bytedance.im.core.internal.utils.s.c() == false) goto L_0x004e;
                                 */
                                @Override // com.bytedance.im.core.internal.e.b
                                /* Code decompiled incorrectly, please refer to instructions dump. */
                                public final /* synthetic */ void a(com.bytedance.im.core.internal.b.a.ai.a r6) {
                                    /*
                                    // Method dump skipped, instructions count: 157
                                    */
                                    throw new UnsupportedOperationException("Method not decompiled: com.bytedance.im.core.internal.b.a.ai.AnonymousClass6.a(java.lang.Object):void");
                                }
                            }, com.bytedance.im.core.internal.e.a.c());
                        }
                    }
                }
            }
        }
    }

    ai() {
        super(IMCMD.NEW_MSG_NOTIFY.getValue());
    }

    static void a(String str) {
        h a2;
        if (com.bytedance.im.core.internal.a.c.a(str) && (a2 = j.a().a(str)) != null) {
            a2.setHasMore(false);
        }
    }

    static void a(a aVar) {
        com.bytedance.im.core.d.ai aiVar = aVar.f38356g;
        boolean z = aVar.f38353d;
        h a2 = j.a().a(aiVar.getConversationId());
        ArrayList arrayList = new ArrayList();
        arrayList.add(aiVar);
        if (z) {
            ar arVar = new ar();
            arVar.f37824a = new as(aVar.f38358i, aVar.f38359j);
            q.a().a(arrayList, 0, arVar);
            g b2 = com.bytedance.im.core.c.h.b(aiVar.getMsgId());
            if (b2 != null) {
                b2.f37639e = Long.valueOf(System.currentTimeMillis() - b2.f37637c.longValue());
                b2.f37640f = Long.valueOf(System.currentTimeMillis() - b2.f37636b.longValue());
            }
            com.bytedance.im.core.c.h.a(aVar.f38356g);
            com.bytedance.im.core.c.h.b(aVar.f38356g);
        } else {
            if (com.bytedance.im.core.internal.b.a.e(aiVar.getUuid())) {
                q.a().a(aiVar, aVar.f38354e);
            }
            aa a3 = aa.a();
            String conversationId = aiVar.getConversationId();
            if (!TextUtils.isEmpty(conversationId) && !com.bytedance.im.core.internal.utils.d.a(arrayList)) {
                s.a();
                if (s.c()) {
                    f.b("imsdk", "LeakMsgRepairManager onUpdateMsg, cid:" + conversationId + ", list:" + arrayList.size(), (Throwable) null);
                    com.bytedance.im.core.internal.e.a.d().execute(
                    /*  JADX ERROR: Method code generation error
                        jadx.core.utils.exceptions.CodegenException: Error generate insn: 0x00f1: INVOKE  
                          (wrap: java.util.concurrent.Executor : 0x00e8: INVOKE  (r1v5 java.util.concurrent.Executor) =  type: STATIC call: com.bytedance.im.core.internal.e.a.d():java.util.concurrent.Executor)
                          (wrap: com.bytedance.im.core.d.aa$4 : 0x00ee: CONSTRUCTOR  (r0v12 com.bytedance.im.core.d.aa$4) = 
                          (r7v0 'a3' com.bytedance.im.core.d.aa)
                          (r3v0 'arrayList' java.util.ArrayList)
                          (r2v0 'conversationId' java.lang.String)
                         call: com.bytedance.im.core.d.aa.4.<init>(com.bytedance.im.core.d.aa, java.util.List, java.lang.String):void type: CONSTRUCTOR)
                         type: INTERFACE call: java.util.concurrent.Executor.execute(java.lang.Runnable):void in method: com.bytedance.im.core.internal.b.a.ai.a(com.bytedance.im.core.internal.b.a.ai$a):void, file: classes10.dex
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
                        	at jadx.core.codegen.RegionGen.makeRegionIndent(RegionGen.java:99)
                        	at jadx.core.codegen.RegionGen.makeIf(RegionGen.java:143)
                        	at jadx.core.codegen.RegionGen.makeRegion(RegionGen.java:63)
                        	at jadx.core.codegen.RegionGen.makeSimpleRegion(RegionGen.java:93)
                        	at jadx.core.codegen.RegionGen.makeRegion(RegionGen.java:59)
                        	at jadx.core.codegen.RegionGen.makeRegionIndent(RegionGen.java:99)
                        	at jadx.core.codegen.RegionGen.makeIf(RegionGen.java:157)
                        	at jadx.core.codegen.RegionGen.makeRegion(RegionGen.java:63)
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
                        Caused by: jadx.core.utils.exceptions.CodegenException: Error generate insn: 0x00ee: CONSTRUCTOR  (r0v12 com.bytedance.im.core.d.aa$4) = 
                          (r7v0 'a3' com.bytedance.im.core.d.aa)
                          (r3v0 'arrayList' java.util.ArrayList)
                          (r2v0 'conversationId' java.lang.String)
                         call: com.bytedance.im.core.d.aa.4.<init>(com.bytedance.im.core.d.aa, java.util.List, java.lang.String):void type: CONSTRUCTOR in method: com.bytedance.im.core.internal.b.a.ai.a(com.bytedance.im.core.internal.b.a.ai$a):void, file: classes10.dex
                        	at jadx.core.codegen.InsnGen.makeInsn(InsnGen.java:255)
                        	at jadx.core.codegen.InsnGen.addWrappedArg(InsnGen.java:119)
                        	at jadx.core.codegen.InsnGen.addArg(InsnGen.java:103)
                        	at jadx.core.codegen.InsnGen.generateMethodArguments(InsnGen.java:806)
                        	at jadx.core.codegen.InsnGen.makeInvoke(InsnGen.java:746)
                        	at jadx.core.codegen.InsnGen.makeInsnBody(InsnGen.java:367)
                        	at jadx.core.codegen.InsnGen.makeInsn(InsnGen.java:249)
                        	... 29 more
                        Caused by: jadx.core.utils.exceptions.JadxRuntimeException: Expected class to be processed at this point, class: com.bytedance.im.core.d.aa, state: GENERATED_AND_UNLOADED
                        	at jadx.core.dex.nodes.ClassNode.ensureProcessed(ClassNode.java:215)
                        	at jadx.core.codegen.InsnGen.makeConstructor(InsnGen.java:630)
                        	at jadx.core.codegen.InsnGen.makeInsnBody(InsnGen.java:363)
                        	at jadx.core.codegen.InsnGen.makeInsn(InsnGen.java:230)
                        	... 35 more
                        */
                    /*
                    // Method dump skipped, instructions count: 245
                    */
                    throw new UnsupportedOperationException("Method not decompiled: com.bytedance.im.core.internal.b.a.ai.a(com.bytedance.im.core.internal.b.a.ai$a):void");
                }

                public static bd a(bd bdVar, MsgTrace msgTrace) {
                    Map<Integer, Long> map;
                    if (bdVar == null) {
                        return null;
                    }
                    if (msgTrace == null || (map = msgTrace.metrics) == null) {
                        return bdVar;
                    }
                    for (Map.Entry<Integer, Long> entry : map.entrySet()) {
                        bdVar.a(entry.getKey().intValue(), entry.getValue().longValue());
                    }
                    return bdVar;
                }

                public static void a(a aVar, NewMessageNotify newMessageNotify) {
                    com.bytedance.im.core.d.ai aiVar;
                    WeakReference<al> weakReference;
                    al alVar;
                    try {
                        f.b("imsdk", "NewMsgNotifyHandler processNotify, start save", (Throwable) null);
                        long uptimeMillis = SystemClock.uptimeMillis();
                        bd bdVar = aVar.f38358i;
                        if (bdVar != null) {
                            bdVar.a(at.f37835h, com.bytedance.im.core.internal.utils.w.a());
                        }
                        aw a2 = a(newMessageNotify.message, false, (Pair<String, String>) null, 0);
                        if (bdVar != null) {
                            bdVar.a(at.f37836i, com.bytedance.im.core.internal.utils.w.a());
                        }
                        try {
                            JSONObject jSONObject = new JSONObject();
                            jSONObject.put("duration", SystemClock.uptimeMillis() - uptimeMillis);
                            jSONObject.put("msg_count", 1);
                            jSONObject.put("msg_source", 0);
                            com.bytedance.im.core.c.e.a("im_save_msg_list_duration", jSONObject);
                        } catch (Exception unused) {
                        }
                        if (a2 == null || a2.f37851c) {
                            aVar.f38352c = true;
                            if (a2 == null) {
                                return;
                            }
                        }
                        if (a2.f37849a != null && a2.f37851c) {
                            if (!(newMessageNotify.message == null || newMessageNotify.message.status.intValue() != 0 || (aiVar = a2.f37849a) == null || TextUtils.isEmpty(aiVar.getUuid()) || (weakReference = com.bytedance.im.core.internal.b.a.f38239m.get(aiVar.getUuid())) == null || (alVar = weakReference.get()) == null)) {
                                com.bytedance.im.core.internal.b.a.d(aiVar.getUuid());
                                alVar.f38367a.t = true;
                                if (!com.bytedance.im.core.a.d.a().b().z) {
                                    f.b("imsdk", "SendMsgHandler handleSendMsgByPush but options disabled", (Throwable) null);
                                } else if (alVar.f38369c) {
                                    f.b("imsdk", "SendMsgHandler handleSendMsgByPush response handled", (Throwable) null);
                                } else {
                                    alVar.f38368b = aiVar;
                                    f.b("imsdk", "SendMsgHandler handleSendMsgByPush push ahead response, waiting", (Throwable) null);
                                    aVar.f38355f = true;
                                    f.b("imsdk", "NewMsgNotifyHandler processNotify receive self sent message, processed by SendMsgHandler", (Throwable) null);
                                    return;
                                }
                            }
                            aVar.f38356g = a2.f37849a;
                            aVar.f38353d = a2.f37850b;
                            aVar.f38354e = a2.f37852d;
                            if (bdVar != null) {
                                bdVar.a(at.f37837j, com.bytedance.im.core.internal.utils.w.a());
                            }
                            h a3 = com.bytedance.im.core.internal.a.c.a(a2.f37849a.getConversationId(), true);
                            if (a3 != null && !a3.isWaitingInfo() && !a3.isTemp()) {
                                a(a3, a2.f37849a, newMessageNotify.badge_count);
                                aVar.f38357h = a3;
                            }
                            if (bdVar != null) {
                                bdVar.a(at.f37838k, com.bytedance.im.core.internal.utils.w.a());
                            }
                        }
                    } catch (Exception e2) {
                        f.b("imsdk", "NewMsgNotifyHandler ", e2);
                        com.bytedance.im.core.g.b.a(0, e2);
                    }
                }

                static void a(h hVar, com.bytedance.im.core.d.ai aiVar, Integer num) {
                    int i2;
                    long b2 = n.b(aiVar);
                    if (b2 > hVar.getUpdatedTime()) {
                        hVar.setUpdatedTime(b2);
                    }
                    hVar.setLastMessageIndex(n.d(aiVar));
                    hVar.setMaxIndexV2(n.e(aiVar));
                    if (num != null) {
                        i2 = num.intValue();
                    } else {
                        i2 = 0;
                    }
                    hVar.setBadgeCount(i2);
                    if (j.a().c(hVar.getConversationId())) {
                        hVar.setReadIndex(hVar.getLastMessageIndex());
                        hVar.setReadIndexV2(hVar.getMaxIndexV2());
                        hVar.setReadBadgeCount(hVar.getBadgeCount());
                        hVar.setUnreadCount(0);
                    } else {
                        hVar.setUnreadCount(com.bytedance.im.core.internal.a.c.e(hVar));
                    }
                    boolean a2 = com.bytedance.im.core.internal.a.c.a(hVar.getConversationId(), hVar.getUpdatedTime(), hVar.getLastMessageIndex(), hVar.getMaxIndexV2(), hVar.getBadgeCount(), hVar.getUnreadCount());
                    f.b("NewMsgNotifyHandler syncUpdateConversation, id:", hVar.getConversationId() + ", result:" + a2, (Throwable) null);
                    if (a2) {
                        h a3 = j.a().a(hVar.getConversationId());
                        if (a3 != null) {
                            hVar.setDraftContent(a3.getDraftContent());
                            hVar.setDraftTime(a3.getDraftTime());
                        }
                        j.a().a(hVar);
                    }
                    if (hVar.isStranger()) {
                        com.bytedance.im.core.i.f.a().a(hVar.getInboxType(), hVar.getConversationId(), hVar.getConversationShortId(), hVar.getConversationType());
                    }
                }

                /* JADX WARN: Type inference failed for: r1v29, types: [java.lang.Object] */
                /* JADX WARN: Type inference failed for: r0v95, types: [java.lang.Object] */
                /* JADX WARNING: Code restructure failed: missing block: B:33:0x00b3, code lost:
                    if (r11.version.longValue() > r1.getVersion()) goto L_0x00d7;
                 */
                /* JADX WARNING: Unknown variable types count: 2 */
                /* Code decompiled incorrectly, please refer to instructions dump. */
                public static com.bytedance.im.core.d.aw a(com.bytedance.im.core.proto.MessageBody r11, boolean r12, android.util.Pair<java.lang.String, java.lang.String> r13, int r14) {
                    /*
                    // Method dump skipped, instructions count: 776
                    */
                    throw new UnsupportedOperationException("Method not decompiled: com.bytedance.im.core.internal.b.a.ai.a(com.bytedance.im.core.proto.MessageBody, boolean, android.util.Pair, int):com.bytedance.im.core.d.aw");
                }
            }
