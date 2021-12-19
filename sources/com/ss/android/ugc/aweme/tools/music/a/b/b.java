package com.ss.android.ugc.aweme.tools.music.a.b;

import android.graphics.Bitmap;
import com.bytedance.covode.number.Covode;
import com.bytedance.frameworks.apm.trace.MethodCollector;
import com.ss.android.vesdk.ad;
import h.a.i;
import h.c.b.a.d;
import h.f.b.l;
import h.f.b.z;
import h.q;
import java.io.File;
import java.nio.ByteBuffer;
import java.util.List;
import java.util.NoSuchElementException;

public final class b extends a {

    /* renamed from: e  reason: collision with root package name */
    private final com.ss.android.ugc.aweme.c.b f140325e;

    /* access modifiers changed from: package-private */
    public static final class a extends d {
        Object L$0;
        int label;
        /* synthetic */ Object result;
        final /* synthetic */ b this$0;

        static {
            Covode.recordClassIndex(91681);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        a(b bVar, h.c.d dVar) {
            super(dVar);
            this.this$0 = bVar;
        }

        @Override // h.c.b.a.a
        public final Object invokeSuspend(Object obj) {
            this.result = obj;
            this.label |= Integer.MIN_VALUE;
            return this.this$0.a(this);
        }
    }

    static {
        Covode.recordClassIndex(91680);
    }

    public b(com.ss.android.ugc.aweme.c.b bVar) {
        l.d(bVar, "");
        this.f140325e = bVar;
    }

    /* JADX DEBUG: Failed to insert an additional move for type inference into block B:21:0x007b */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r7v0, types: [java.lang.Object, com.ss.android.ugc.aweme.tools.music.a.b.b] */
    /* JADX WARN: Type inference failed for: r7v1, types: [com.ss.android.ugc.aweme.tools.music.a.b.a] */
    /* JADX WARN: Type inference failed for: r7v3, types: [com.ss.android.ugc.aweme.tools.music.a.b.a] */
    /* access modifiers changed from: protected */
    /* JADX WARNING: Removed duplicated region for block: B:13:0x0037  */
    /* JADX WARNING: Removed duplicated region for block: B:7:0x0020  */
    /* JADX WARNING: Unknown variable types count: 1 */
    @Override // com.ss.android.ugc.aweme.tools.music.a.b.a
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final java.lang.Object a(h.c.d<? super java.lang.String> r24) {
        /*
        // Method dump skipped, instructions count: 275
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ss.android.ugc.aweme.tools.music.a.b.b.a(h.c.d):java.lang.Object");
    }

    /* access modifiers changed from: package-private */
    /* renamed from: com.ss.android.ugc.aweme.tools.music.a.b.b$b  reason: collision with other inner class name */
    public static final class C3704b implements ad {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ z.c f140326a;

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ List f140327b;

        /* renamed from: c  reason: collision with root package name */
        final /* synthetic */ int[] f140328c;

        /* renamed from: d  reason: collision with root package name */
        final /* synthetic */ h.c.d f140329d;

        /* renamed from: e  reason: collision with root package name */
        final /* synthetic */ b f140330e;

        /* renamed from: f  reason: collision with root package name */
        final /* synthetic */ long f140331f;

        /* renamed from: g  reason: collision with root package name */
        final /* synthetic */ long f140332g;

        /* renamed from: h  reason: collision with root package name */
        final /* synthetic */ String f140333h;

        static {
            Covode.recordClassIndex(91682);
        }

        C3704b(z.c cVar, List list, int[] iArr, h.c.d dVar, b bVar, long j2, long j3, String str) {
            this.f140326a = cVar;
            this.f140327b = list;
            this.f140328c = iArr;
            this.f140329d = dVar;
            this.f140330e = bVar;
            this.f140331f = j2;
            this.f140332g = j3;
            this.f140333h = str;
        }

        @Override // com.ss.android.vesdk.ad
        public final boolean processFrame(ByteBuffer byteBuffer, int i2, int i3, int i4) {
            boolean z;
            MethodCollector.i(1643);
            dmt.av.video.a.a("extracting_frame");
            Bitmap createBitmap = Bitmap.createBitmap(i2, i3, Bitmap.Config.ARGB_8888);
            createBitmap.copyPixelsFromBuffer(byteBuffer.position(0));
            File a2 = this.f140330e.a(createBitmap, this.f140326a.element);
            List list = this.f140327b;
            String absolutePath = a2.getAbsolutePath();
            l.b(absolutePath, "");
            list.add(absolutePath);
            this.f140326a.element++;
            int[] iArr = this.f140328c;
            l.d(iArr, "");
            if (iArr.length == 0) {
                NoSuchElementException noSuchElementException = new NoSuchElementException("Array is empty.");
                MethodCollector.o(1643);
                throw noSuchElementException;
            }
            if (iArr[i.b(iArr)] - i4 < 10) {
                z = true;
                this.f140329d.resumeWith(q.m223constructorimpl(this.f140327b));
            } else {
                z = false;
            }
            MethodCollector.o(1643);
            if (!z) {
                return true;
            }
            return false;
        }
    }
}
