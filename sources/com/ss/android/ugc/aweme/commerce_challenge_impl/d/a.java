package com.ss.android.ugc.aweme.commerce_challenge_impl.d;

import android.net.Uri;
import com.bytedance.covode.number.Covode;
import com.ss.android.ugc.aweme.discover.model.Challenge;
import h.f.b.l;
import h.m.p;
import java.util.LinkedList;
import java.util.concurrent.locks.ReentrantReadWriteLock;

public final class a {

    /* renamed from: a  reason: collision with root package name */
    public static final ReentrantReadWriteLock f73550a = new ReentrantReadWriteLock();

    /* renamed from: b  reason: collision with root package name */
    public static final a f73551b = new a();

    /* renamed from: c  reason: collision with root package name */
    private static final LinkedList<String> f73552c = new LinkedList<>();

    private a() {
    }

    static {
        Covode.recordClassIndex(45267);
    }

    public static void c(String str) {
        if (str != null && str.length() != 0) {
            LinkedList<String> linkedList = f73552c;
            linkedList.remove(str);
            linkedList.add(str);
            while (true) {
                LinkedList<String> linkedList2 = f73552c;
                if (linkedList2.size() > 100) {
                    linkedList2.removeFirst();
                } else {
                    return;
                }
            }
        }
    }

    public static final boolean b(String str) {
        if (str == null || str.length() == 0) {
            return false;
        }
        ReentrantReadWriteLock.ReadLock readLock = f73550a.readLock();
        readLock.lock();
        try {
            return f73552c.contains(str);
        } finally {
            readLock.unlock();
        }
    }

    /*  JADX ERROR: StackOverflowError in pass: MarkFinallyVisitor
        java.lang.StackOverflowError
        	at jadx.core.dex.nodes.InsnNode.isSame(InsnNode.java:303)
        	at jadx.core.dex.instructions.IfNode.isSame(IfNode.java:122)
        	at jadx.core.dex.visitors.MarkFinallyVisitor.sameInsns(MarkFinallyVisitor.java:451)
        	at jadx.core.dex.visitors.MarkFinallyVisitor.compareBlocks(MarkFinallyVisitor.java:436)
        	at jadx.core.dex.visitors.MarkFinallyVisitor.checkBlocksTree(MarkFinallyVisitor.java:408)
        	at jadx.core.dex.visitors.MarkFinallyVisitor.checkBlocksTree(MarkFinallyVisitor.java:411)
        */
    public static final void a(java.lang.String r5) {
        /*
            r4 = 0
            if (r5 == 0) goto L_0x0009
            int r0 = r5.length()
            if (r0 != 0) goto L_0x000a
        L_0x0009:
            return
        L_0x000a:
            java.util.concurrent.locks.ReentrantReadWriteLock r1 = com.ss.android.ugc.aweme.commerce_challenge_impl.d.a.f73550a
            java.util.concurrent.locks.ReentrantReadWriteLock$ReadLock r3 = r1.readLock()
            int r0 = r1.getWriteHoldCount()
            if (r0 != 0) goto L_0x0023
            int r2 = r1.getReadHoldCount()
            r0 = 0
        L_0x001b:
            if (r0 >= r2) goto L_0x0024
            r3.unlock()
            int r0 = r0 + 1
            goto L_0x001b
        L_0x0023:
            r2 = 0
        L_0x0024:
            java.util.concurrent.locks.ReentrantReadWriteLock$WriteLock r1 = r1.writeLock()
            r1.lock()
            c(r5)     // Catch:{ all -> 0x002f }
            goto L_0x003c
        L_0x002f:
            r0 = move-exception
        L_0x0030:
            if (r4 >= r2) goto L_0x0038
            r3.lock()
            int r4 = r4 + 1
            goto L_0x0030
        L_0x0038:
            r1.unlock()
            throw r0
        L_0x003c:
            if (r4 >= r2) goto L_0x0044
            r3.lock()
            int r4 = r4 + 1
            goto L_0x003c
        L_0x0044:
            r1.unlock()
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ss.android.ugc.aweme.commerce_challenge_impl.d.a.a(java.lang.String):void");
    }

    public static final boolean a(Challenge challenge) {
        l.d(challenge, "");
        if (challenge.isCommerce() || challenge.isCommerceAndValid()) {
            return true;
        }
        String schema = challenge.getSchema();
        if (!(schema == null || schema.length() == 0)) {
            String queryParameter = Uri.parse(challenge.getSchema()).getQueryParameter("is_commerce");
            if (l.a((Object) queryParameter, (Object) "1") || p.a("true", queryParameter, true)) {
                return true;
            }
        }
        return false;
    }

    /*  JADX ERROR: StackOverflowError in pass: MarkFinallyVisitor
        java.lang.StackOverflowError
        	at jadx.core.dex.nodes.InsnNode.isSame(InsnNode.java:303)
        	at jadx.core.dex.instructions.IfNode.isSame(IfNode.java:122)
        	at jadx.core.dex.visitors.MarkFinallyVisitor.sameInsns(MarkFinallyVisitor.java:451)
        	at jadx.core.dex.visitors.MarkFinallyVisitor.compareBlocks(MarkFinallyVisitor.java:436)
        	at jadx.core.dex.visitors.MarkFinallyVisitor.checkBlocksTree(MarkFinallyVisitor.java:408)
        	at jadx.core.dex.visitors.MarkFinallyVisitor.checkBlocksTree(MarkFinallyVisitor.java:411)
        */
    public static final void a(android.net.Uri r5, java.lang.String r6) {
        /*
            if (r5 == 0) goto L_0x000c
            r4 = 0
            r2 = 1
            if (r6 == 0) goto L_0x000c
            int r0 = r6.length()
            if (r0 != 0) goto L_0x000d
        L_0x000c:
            return
        L_0x000d:
            java.lang.String r0 = "is_commerce"
            java.lang.String r1 = r5.getQueryParameter(r0)
            java.lang.String r0 = "1"
            boolean r0 = h.f.b.l.a(r1, r0)
            if (r0 != 0) goto L_0x0023
            java.lang.String r0 = "true"
            boolean r0 = h.m.p.a(r0, r1, r2)
            if (r0 == 0) goto L_0x0061
        L_0x0023:
            java.util.concurrent.locks.ReentrantReadWriteLock r1 = com.ss.android.ugc.aweme.commerce_challenge_impl.d.a.f73550a
            java.util.concurrent.locks.ReentrantReadWriteLock$ReadLock r3 = r1.readLock()
            int r0 = r1.getWriteHoldCount()
            if (r0 != 0) goto L_0x003c
            int r2 = r1.getReadHoldCount()
            r0 = 0
        L_0x0034:
            if (r0 >= r2) goto L_0x003d
            r3.unlock()
            int r0 = r0 + 1
            goto L_0x0034
        L_0x003c:
            r2 = 0
        L_0x003d:
            java.util.concurrent.locks.ReentrantReadWriteLock$WriteLock r1 = r1.writeLock()
            r1.lock()
            c(r6)     // Catch:{ all -> 0x0048 }
            goto L_0x0055
        L_0x0048:
            r0 = move-exception
        L_0x0049:
            if (r4 >= r2) goto L_0x0051
            r3.lock()
            int r4 = r4 + 1
            goto L_0x0049
        L_0x0051:
            r1.unlock()
            throw r0
        L_0x0055:
            if (r4 >= r2) goto L_0x005d
            r3.lock()
            int r4 = r4 + 1
            goto L_0x0055
        L_0x005d:
            r1.unlock()
            return
        L_0x0061:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ss.android.ugc.aweme.commerce_challenge_impl.d.a.a(android.net.Uri, java.lang.String):void");
    }
}
