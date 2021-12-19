package com.bytedance.common.wschannel.channel.a.a;

import android.content.Context;
import android.database.ContentObserver;
import android.os.Handler;
import android.os.Message;
import com.bytedance.common.utility.collection.WeakHandler;
import com.bytedance.common.wschannel.WsChannelMultiProcessSharedProvider;
import com.bytedance.common.wschannel.channel.IWsChannelClient;
import com.bytedance.common.wschannel.channel.a.a.a.c;
import com.bytedance.common.wschannel.channel.a.a.b;
import com.bytedance.common.wschannel.j;
import com.bytedance.common.wschannel.l;
import com.bytedance.covode.number.Covode;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import k.i;
import org.json.JSONObject;

public final class a implements WeakHandler.IHandler, IWsChannelClient {

    /* renamed from: a  reason: collision with root package name */
    public Context f27039a;

    /* renamed from: b  reason: collision with root package name */
    public Map<String, Object> f27040b = new HashMap();

    /* renamed from: c  reason: collision with root package name */
    public List<String> f27041c;

    /* renamed from: d  reason: collision with root package name */
    private final int f27042d;

    /* renamed from: e  reason: collision with root package name */
    private Handler f27043e;

    /* renamed from: f  reason: collision with root package name */
    private b f27044f;

    /* renamed from: g  reason: collision with root package name */
    private boolean f27045g;

    /* renamed from: h  reason: collision with root package name */
    private ContentObserver f27046h;

    static {
        Covode.recordClassIndex(15968);
    }

    @Override // com.bytedance.common.utility.collection.WeakHandler.IHandler
    public final void handleMsg(Message message) {
    }

    @Override // com.bytedance.common.wschannel.channel.IWsChannelClient
    public final void onConnection(JSONObject jSONObject) {
    }

    @Override // com.bytedance.common.wschannel.channel.IWsChannelClient
    public final void onMessage(byte[] bArr) {
    }

    @Override // com.bytedance.common.wschannel.channel.IWsChannelClient
    public final boolean isConnected() {
        return this.f27044f.f();
    }

    @Override // com.bytedance.common.wschannel.channel.IWsChannelClient
    public final void stopConnection() {
        this.f27044f.a();
    }

    @Override // com.bytedance.common.wschannel.channel.IWsChannelClient
    public final void destroy() {
        b bVar = this.f27044f;
        bVar.f27054c.removeMessages(2);
        bVar.f27054c.removeMessages(1);
        bVar.f27054c.removeMessages(3);
        bVar.f27054c.removeMessages(5);
        bVar.a(
        /*  JADX ERROR: Method code generation error
            jadx.core.utils.exceptions.CodegenException: Error generate insn: 0x001f: INVOKE  
              (r2v0 'bVar' com.bytedance.common.wschannel.channel.a.a.b)
              (wrap: com.bytedance.common.wschannel.channel.a.a.b$5 : 0x001c: CONSTRUCTOR  (r0v4 com.bytedance.common.wschannel.channel.a.a.b$5) = (r2v0 'bVar' com.bytedance.common.wschannel.channel.a.a.b) call: com.bytedance.common.wschannel.channel.a.a.b.5.<init>(com.bytedance.common.wschannel.channel.a.a.b):void type: CONSTRUCTOR)
             type: VIRTUAL call: com.bytedance.common.wschannel.channel.a.a.b.a(java.lang.Runnable):void in method: com.bytedance.common.wschannel.channel.a.a.a.destroy():void, file: classes9.dex
            	at jadx.core.codegen.InsnGen.makeInsn(InsnGen.java:255)
            	at jadx.core.codegen.InsnGen.makeInsn(InsnGen.java:217)
            	at jadx.core.codegen.RegionGen.makeSimpleBlock(RegionGen.java:110)
            	at jadx.core.codegen.RegionGen.makeRegion(RegionGen.java:56)
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
            Caused by: jadx.core.utils.exceptions.CodegenException: Error generate insn: 0x001c: CONSTRUCTOR  (r0v4 com.bytedance.common.wschannel.channel.a.a.b$5) = (r2v0 'bVar' com.bytedance.common.wschannel.channel.a.a.b) call: com.bytedance.common.wschannel.channel.a.a.b.5.<init>(com.bytedance.common.wschannel.channel.a.a.b):void type: CONSTRUCTOR in method: com.bytedance.common.wschannel.channel.a.a.a.destroy():void, file: classes9.dex
            	at jadx.core.codegen.InsnGen.makeInsn(InsnGen.java:255)
            	at jadx.core.codegen.InsnGen.addWrappedArg(InsnGen.java:119)
            	at jadx.core.codegen.InsnGen.addArg(InsnGen.java:103)
            	at jadx.core.codegen.InsnGen.generateMethodArguments(InsnGen.java:806)
            	at jadx.core.codegen.InsnGen.makeInvoke(InsnGen.java:746)
            	at jadx.core.codegen.InsnGen.makeInsnBody(InsnGen.java:367)
            	at jadx.core.codegen.InsnGen.makeInsn(InsnGen.java:249)
            	... 14 more
            Caused by: jadx.core.utils.exceptions.JadxRuntimeException: Expected class to be processed at this point, class: com.bytedance.common.wschannel.channel.a.a.b, state: GENERATED_AND_UNLOADED
            	at jadx.core.dex.nodes.ClassNode.ensureProcessed(ClassNode.java:215)
            	at jadx.core.codegen.InsnGen.makeConstructor(InsnGen.java:630)
            	at jadx.core.codegen.InsnGen.makeInsnBody(InsnGen.java:363)
            	at jadx.core.codegen.InsnGen.makeInsn(InsnGen.java:230)
            	... 20 more
            */
        /*
            this = this;
            com.bytedance.common.wschannel.channel.a.a.b r2 = r3.f27044f
            android.os.Handler r1 = r2.f27054c
            r0 = 2
            r1.removeMessages(r0)
            android.os.Handler r1 = r2.f27054c
            r0 = 1
            r1.removeMessages(r0)
            android.os.Handler r1 = r2.f27054c
            r0 = 3
            r1.removeMessages(r0)
            android.os.Handler r1 = r2.f27054c
            r0 = 5
            r1.removeMessages(r0)
            com.bytedance.common.wschannel.channel.a.a.b$5 r0 = new com.bytedance.common.wschannel.channel.a.a.b$5
            r0.<init>()
            r2.a(r0)
            android.content.Context r0 = r3.f27039a     // Catch:{ all -> 0x002f }
            if (r0 == 0) goto L_0x002f
            android.content.ContentResolver r1 = r0.getContentResolver()     // Catch:{ all -> 0x002f }
            android.database.ContentObserver r0 = r3.f27046h     // Catch:{ all -> 0x002f }
            r1.unregisterContentObserver(r0)     // Catch:{ all -> 0x002f }
        L_0x002f:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.bytedance.common.wschannel.channel.a.a.a.destroy():void");
    }

    public static boolean a(Context context) {
        return l.a(context).f27243a.a("key_ok_impl_enable", true);
    }

    @Override // com.bytedance.common.wschannel.channel.IWsChannelClient
    public final void onAppStateChanged(int i2) {
        if (a(this.f27039a)) {
            b bVar = this.f27044f;
            boolean z = true;
            if (i2 != 1) {
                z = false;
            }
            bVar.f27054c.obtainMessage(5, Boolean.valueOf(z)).sendToTarget();
        }
    }

    @Override // com.bytedance.common.wschannel.channel.IWsChannelClient
    public final void onNetworkStateChanged(int i2) {
        if (a(this.f27039a)) {
            this.f27044f.f27054c.obtainMessage(3, Integer.valueOf(i2)).sendToTarget();
        }
    }

    @Override // com.bytedance.common.wschannel.channel.IWsChannelClient
    public final boolean sendMessage(byte[] bArr) {
        if (!a(this.f27039a)) {
            return false;
        }
        b bVar = this.f27044f;
        i of = i.of(bArr);
        if (bVar.f27056e == null || !bVar.f() || !(of instanceof i)) {
            return false;
        }
        return bVar.f27056e.send(of);
    }

    public a(int i2, Handler handler) {
        this.f27042d = i2;
        this.f27043e = handler;
        this.f27046h = new ContentObserver(this.f27043e) {
            /* class com.bytedance.common.wschannel.channel.a.a.a.AnonymousClass1 */

            static {
                Covode.recordClassIndex(15969);
            }

            public final void onChange(boolean z) {
                super.onChange(z);
                if (a.a(a.this.f27039a)) {
                    a aVar = a.this;
                    aVar.openConnection(aVar.f27040b, a.this.f27041c);
                    return;
                }
                a.this.stopConnection();
            }
        };
    }

    @Override // com.bytedance.common.wschannel.channel.IWsChannelClient
    public final void onParameterChange(Map<String, Object> map, List<String> list) {
        if (map != null) {
            this.f27040b.putAll(map);
        }
        this.f27041c = list;
        if (a(this.f27039a)) {
            b bVar = this.f27044f;
            if (!list.isEmpty()) {
                bVar.a(
                /*  JADX ERROR: Method code generation error
                    jadx.core.utils.exceptions.CodegenException: Error generate insn: 0x001f: INVOKE  
                      (r1v0 'bVar' com.bytedance.common.wschannel.channel.a.a.b)
                      (wrap: com.bytedance.common.wschannel.channel.a.a.b$7 : 0x001c: CONSTRUCTOR  (r0v3 com.bytedance.common.wschannel.channel.a.a.b$7) = 
                      (r1v0 'bVar' com.bytedance.common.wschannel.channel.a.a.b)
                      (r3v0 'map' java.util.Map<java.lang.String, java.lang.Object>)
                      (r4v0 'list' java.util.List<java.lang.String>)
                     call: com.bytedance.common.wschannel.channel.a.a.b.7.<init>(com.bytedance.common.wschannel.channel.a.a.b, java.util.Map, java.util.List):void type: CONSTRUCTOR)
                     type: VIRTUAL call: com.bytedance.common.wschannel.channel.a.a.b.a(java.lang.Runnable):void in method: com.bytedance.common.wschannel.channel.a.a.a.onParameterChange(java.util.Map<java.lang.String, java.lang.Object>, java.util.List<java.lang.String>):void, file: classes9.dex
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
                    	at jadx.core.codegen.RegionGen.makeRegionIndent(RegionGen.java:99)
                    	at jadx.core.codegen.RegionGen.makeIf(RegionGen.java:143)
                    	at jadx.core.codegen.RegionGen.makeRegion(RegionGen.java:63)
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
                    Caused by: jadx.core.utils.exceptions.CodegenException: Error generate insn: 0x001c: CONSTRUCTOR  (r0v3 com.bytedance.common.wschannel.channel.a.a.b$7) = 
                      (r1v0 'bVar' com.bytedance.common.wschannel.channel.a.a.b)
                      (r3v0 'map' java.util.Map<java.lang.String, java.lang.Object>)
                      (r4v0 'list' java.util.List<java.lang.String>)
                     call: com.bytedance.common.wschannel.channel.a.a.b.7.<init>(com.bytedance.common.wschannel.channel.a.a.b, java.util.Map, java.util.List):void type: CONSTRUCTOR in method: com.bytedance.common.wschannel.channel.a.a.a.onParameterChange(java.util.Map<java.lang.String, java.lang.Object>, java.util.List<java.lang.String>):void, file: classes9.dex
                    	at jadx.core.codegen.InsnGen.makeInsn(InsnGen.java:255)
                    	at jadx.core.codegen.InsnGen.addWrappedArg(InsnGen.java:119)
                    	at jadx.core.codegen.InsnGen.addArg(InsnGen.java:103)
                    	at jadx.core.codegen.InsnGen.generateMethodArguments(InsnGen.java:806)
                    	at jadx.core.codegen.InsnGen.makeInvoke(InsnGen.java:746)
                    	at jadx.core.codegen.InsnGen.makeInsnBody(InsnGen.java:367)
                    	at jadx.core.codegen.InsnGen.makeInsn(InsnGen.java:249)
                    	... 28 more
                    Caused by: jadx.core.utils.exceptions.JadxRuntimeException: Expected class to be processed at this point, class: com.bytedance.common.wschannel.channel.a.a.b, state: GENERATED_AND_UNLOADED
                    	at jadx.core.dex.nodes.ClassNode.ensureProcessed(ClassNode.java:215)
                    	at jadx.core.codegen.InsnGen.makeConstructor(InsnGen.java:630)
                    	at jadx.core.codegen.InsnGen.makeInsnBody(InsnGen.java:363)
                    	at jadx.core.codegen.InsnGen.makeInsn(InsnGen.java:230)
                    	... 34 more
                    */
                /*
                    this = this;
                    if (r3 == 0) goto L_0x0007
                    java.util.Map<java.lang.String, java.lang.Object> r0 = r2.f27040b
                    r0.putAll(r3)
                L_0x0007:
                    r2.f27041c = r4
                    android.content.Context r0 = r2.f27039a
                    boolean r0 = a(r0)
                    if (r0 != 0) goto L_0x0012
                    return
                L_0x0012:
                    com.bytedance.common.wschannel.channel.a.a.b r1 = r2.f27044f
                    boolean r0 = r4.isEmpty()
                    if (r0 != 0) goto L_0x0022
                    com.bytedance.common.wschannel.channel.a.a.b$7 r0 = new com.bytedance.common.wschannel.channel.a.a.b$7
                    r0.<init>(r3, r4)
                    r1.a(r0)
                L_0x0022:
                    return
                */
                throw new UnsupportedOperationException("Method not decompiled: com.bytedance.common.wschannel.channel.a.a.a.onParameterChange(java.util.Map, java.util.List):void");
            }

            @Override // com.bytedance.common.wschannel.channel.IWsChannelClient
            public final void openConnection(Map<String, Object> map, List<String> list) {
                if (map != null) {
                    this.f27040b.putAll(map);
                }
                this.f27041c = list;
                if (a(this.f27039a)) {
                    b bVar = this.f27044f;
                    if (!list.isEmpty()) {
                        bVar.a(
                        /*  JADX ERROR: Method code generation error
                            jadx.core.utils.exceptions.CodegenException: Error generate insn: 0x001f: INVOKE  
                              (r1v0 'bVar' com.bytedance.common.wschannel.channel.a.a.b)
                              (wrap: com.bytedance.common.wschannel.channel.a.a.b$4 : 0x001c: CONSTRUCTOR  (r0v3 com.bytedance.common.wschannel.channel.a.a.b$4) = 
                              (r1v0 'bVar' com.bytedance.common.wschannel.channel.a.a.b)
                              (r3v0 'map' java.util.Map<java.lang.String, java.lang.Object>)
                              (r4v0 'list' java.util.List<java.lang.String>)
                             call: com.bytedance.common.wschannel.channel.a.a.b.4.<init>(com.bytedance.common.wschannel.channel.a.a.b, java.util.Map, java.util.List):void type: CONSTRUCTOR)
                             type: VIRTUAL call: com.bytedance.common.wschannel.channel.a.a.b.a(java.lang.Runnable):void in method: com.bytedance.common.wschannel.channel.a.a.a.openConnection(java.util.Map<java.lang.String, java.lang.Object>, java.util.List<java.lang.String>):void, file: classes9.dex
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
                            	at jadx.core.codegen.RegionGen.makeRegionIndent(RegionGen.java:99)
                            	at jadx.core.codegen.RegionGen.makeIf(RegionGen.java:143)
                            	at jadx.core.codegen.RegionGen.makeRegion(RegionGen.java:63)
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
                            Caused by: jadx.core.utils.exceptions.CodegenException: Error generate insn: 0x001c: CONSTRUCTOR  (r0v3 com.bytedance.common.wschannel.channel.a.a.b$4) = 
                              (r1v0 'bVar' com.bytedance.common.wschannel.channel.a.a.b)
                              (r3v0 'map' java.util.Map<java.lang.String, java.lang.Object>)
                              (r4v0 'list' java.util.List<java.lang.String>)
                             call: com.bytedance.common.wschannel.channel.a.a.b.4.<init>(com.bytedance.common.wschannel.channel.a.a.b, java.util.Map, java.util.List):void type: CONSTRUCTOR in method: com.bytedance.common.wschannel.channel.a.a.a.openConnection(java.util.Map<java.lang.String, java.lang.Object>, java.util.List<java.lang.String>):void, file: classes9.dex
                            	at jadx.core.codegen.InsnGen.makeInsn(InsnGen.java:255)
                            	at jadx.core.codegen.InsnGen.addWrappedArg(InsnGen.java:119)
                            	at jadx.core.codegen.InsnGen.addArg(InsnGen.java:103)
                            	at jadx.core.codegen.InsnGen.generateMethodArguments(InsnGen.java:806)
                            	at jadx.core.codegen.InsnGen.makeInvoke(InsnGen.java:746)
                            	at jadx.core.codegen.InsnGen.makeInsnBody(InsnGen.java:367)
                            	at jadx.core.codegen.InsnGen.makeInsn(InsnGen.java:249)
                            	... 28 more
                            Caused by: jadx.core.utils.exceptions.JadxRuntimeException: Expected class to be processed at this point, class: com.bytedance.common.wschannel.channel.a.a.b, state: GENERATED_AND_UNLOADED
                            	at jadx.core.dex.nodes.ClassNode.ensureProcessed(ClassNode.java:215)
                            	at jadx.core.codegen.InsnGen.makeConstructor(InsnGen.java:630)
                            	at jadx.core.codegen.InsnGen.makeInsnBody(InsnGen.java:363)
                            	at jadx.core.codegen.InsnGen.makeInsn(InsnGen.java:230)
                            	... 34 more
                            */
                        /*
                            this = this;
                            if (r3 == 0) goto L_0x0007
                            java.util.Map<java.lang.String, java.lang.Object> r0 = r2.f27040b
                            r0.putAll(r3)
                        L_0x0007:
                            r2.f27041c = r4
                            android.content.Context r0 = r2.f27039a
                            boolean r0 = a(r0)
                            if (r0 != 0) goto L_0x0012
                            return
                        L_0x0012:
                            com.bytedance.common.wschannel.channel.a.a.b r1 = r2.f27044f
                            boolean r0 = r4.isEmpty()
                            if (r0 != 0) goto L_0x0022
                            com.bytedance.common.wschannel.channel.a.a.b$4 r0 = new com.bytedance.common.wschannel.channel.a.a.b$4
                            r0.<init>(r3, r4)
                            r1.a(r0)
                        L_0x0022:
                            return
                        */
                        throw new UnsupportedOperationException("Method not decompiled: com.bytedance.common.wschannel.channel.a.a.a.openConnection(java.util.Map, java.util.List):void");
                    }

                    @Override // com.bytedance.common.wschannel.channel.IWsChannelClient
                    public final void init(Context context, IWsChannelClient iWsChannelClient) {
                        if (!this.f27045g) {
                            this.f27045g = true;
                            Context applicationContext = context.getApplicationContext();
                            if (com.ss.android.ugc.aweme.lancet.a.a.f107168c && applicationContext == null) {
                                applicationContext = com.ss.android.ugc.aweme.lancet.a.a.f107166a;
                            }
                            this.f27039a = applicationContext;
                            b.a aVar = new b.a(context);
                            aVar.f27079d = new c(context);
                            com.bytedance.common.wschannel.c.a aVar2 = j.f27228e.get(Integer.valueOf(this.f27042d));
                            if (aVar2 != null) {
                                aVar.f27080e = aVar2;
                            }
                            b bVar = new b(new b.C0583b(aVar.f27076a, aVar.f27077b, aVar.f27078c, aVar.f27079d, aVar.f27080e), (byte) 0);
                            this.f27044f = bVar;
                            bVar.f27055d = new d(this.f27039a, this.f27044f, iWsChannelClient);
                            try {
                                context.getContentResolver().registerContentObserver(WsChannelMultiProcessSharedProvider.a(context, "key_ok_impl_enable", "boolean"), true, this.f27046h);
                            } catch (Throwable unused) {
                            }
                        }
                    }
                }
