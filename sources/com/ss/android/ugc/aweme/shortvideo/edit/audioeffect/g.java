package com.ss.android.ugc.aweme.shortvideo.edit.audioeffect;

import androidx.c.e;
import com.bytedance.covode.number.Covode;
import h.f.b.l;

public final class g {

    /* renamed from: a  reason: collision with root package name */
    public e<String, byte[]> f126814a;

    static {
        Covode.recordClassIndex(83199);
    }

    public final void a() {
        this.f126814a.a(1);
    }

    private g() {
        int min = Math.min((int) (Runtime.getRuntime().maxMemory() / 8), 1048576);
        this.f126814a = new e<String, byte[]>(min, min) {
            /* class com.ss.android.ugc.aweme.shortvideo.edit.audioeffect.g.AnonymousClass1 */

            /* renamed from: a  reason: collision with root package name */
            final /* synthetic */ int f126815a;

            static {
                Covode.recordClassIndex(83200);
            }

            {
                this.f126815a = r1;
            }

            /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object, java.lang.Object] */
            @Override // androidx.c.e
            public final /* synthetic */ int b(String str, byte[] bArr) {
                byte[] bArr2 = bArr;
                l.d(str, "");
                l.d(bArr2, "");
                return bArr2.length;
            }
        };
    }

    public /* synthetic */ g(byte b2) {
        this();
    }

    public final byte[] a(String str) {
        if (str == null) {
            return null;
        }
        return this.f126814a.a(str);
    }

    public final void a(String str, byte[] bArr) {
        if (str != null && bArr != null) {
            this.f126814a.a(str, bArr);
        }
    }
}
