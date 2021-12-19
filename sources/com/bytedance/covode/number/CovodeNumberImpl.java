package com.bytedance.covode.number;

import com.bytedance.covode.a.a;
import com.bytedance.covode.a.b;
import com.bytedance.covode.a.c;
import com.bytedance.covode.number.Covode;
import com.ss.android.ugc.aweme.cw.g;
import com.ss.android.ugc.aweme.cw.l;
import com.ss.android.ugc.aweme.cw.o;
import java.io.File;
import java.util.Iterator;
import java.util.concurrent.LinkedBlockingQueue;

/* access modifiers changed from: package-private */
public class CovodeNumberImpl extends Covode {

    /* renamed from: a  reason: collision with root package name */
    static CovodeNumberImpl f27397a = new CovodeNumberImpl();

    /* renamed from: c  reason: collision with root package name */
    public static a f27398c = new a();

    /* renamed from: b  reason: collision with root package name */
    public Covode.a f27399b;

    static native void initRecorder(String str, int i2, boolean z);

    /* access modifiers changed from: package-private */
    public native void clearBitmap();

    /* access modifiers changed from: package-private */
    public native void recordClassIndexToFile(int i2);

    CovodeNumberImpl() {
    }

    private static boolean a() {
        if (MaxIndexGetter.getMaxIndex() == Integer.MIN_VALUE) {
            return false;
        }
        return true;
    }

    /* access modifiers changed from: protected */
    @Override // com.bytedance.covode.number.Covode
    public synchronized boolean report(Covode.b bVar) {
        if (!a()) {
            return false;
        }
        Covode.a aVar = this.f27399b;
        if (aVar == null) {
            return false;
        }
        a aVar2 = aVar.f27395a;
        if (!aVar2.f27392c) {
            return false;
        }
        if (b.a(aVar2) == null) {
            c.a("tag_dex_read");
            return false;
        }
        File a2 = b.a(new b.a() {
            /* class com.bytedance.covode.number.CovodeNumberImpl.AnonymousClass2 */

            @Override // com.bytedance.covode.a.b.a
            public final void a() {
                CovodeNumberImpl.this.clearBitmap();
            }
        });
        if (a2 == null) {
            return false;
        }
        c.f27394a.put("tag_upload", Long.valueOf(System.currentTimeMillis()));
        boolean a3 = bVar.a(a2);
        c.a("tag_upload");
        return a3;
    }

    /* access modifiers changed from: protected */
    @Override // com.bytedance.covode.number.Covode
    public synchronized boolean start(Covode.a aVar) {
        if (!a()) {
            return false;
        }
        if (!aVar.f27396b) {
            this.f27399b = aVar;
            f27398c.f27402a.clear();
            f27398c.f27403b.clear();
            return false;
        }
        a aVar2 = aVar.f27395a;
        File a2 = b.a(aVar2);
        if (a2 == null) {
            c.a("tag_dex_read");
            return false;
        }
        try {
            System.loadLibrary("covode_number");
            initRecorder(new File(a2, "record").getPath(), MaxIndexGetter.getMaxIndex(), aVar2.f27392c);
            this.f27399b = aVar;
            l.a a3 = l.a(o.FIXED);
            a3.f79174c = 1;
            g.a(a3.a()).execute(new Runnable() {
                /* class com.bytedance.covode.number.CovodeNumberImpl.AnonymousClass1 */

                public final void run() {
                    if (CovodeNumberImpl.f27398c != null) {
                        LinkedBlockingQueue<Integer> linkedBlockingQueue = CovodeNumberImpl.f27398c.f27402a;
                        LinkedBlockingQueue<Short> linkedBlockingQueue2 = CovodeNumberImpl.f27398c.f27403b;
                        if (linkedBlockingQueue != null) {
                            if (CovodeNumberImpl.this.f27399b.f27396b) {
                                linkedBlockingQueue.size();
                                Iterator<Integer> it = linkedBlockingQueue.iterator();
                                while (it.hasNext()) {
                                    CovodeNumberImpl.this.recordClassIndexToFile(it.next().intValue());
                                }
                            }
                            linkedBlockingQueue.clear();
                        }
                        if (linkedBlockingQueue2 != null) {
                            if (CovodeNumberImpl.this.f27399b.f27396b) {
                                linkedBlockingQueue2.size();
                                Iterator<Short> it2 = linkedBlockingQueue2.iterator();
                                while (it2.hasNext()) {
                                    CovodeNumberImpl.this.recordClassIndexToFile(it2.next().shortValue());
                                }
                            }
                            linkedBlockingQueue2.clear();
                        }
                        CovodeNumberImpl.f27398c = null;
                    }
                }
            });
        } catch (UnsatisfiedLinkError e2) {
            e2.printStackTrace();
        }
        return true;
    }
}
