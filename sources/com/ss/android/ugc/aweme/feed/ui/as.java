package com.ss.android.ugc.aweme.feed.ui;

import android.content.Intent;
import b.g;
import b.i;
import com.bytedance.covode.number.Covode;
import com.ss.android.ugc.aweme.ba;
import java.util.concurrent.Callable;

public final class as {

    public interface a {
        static {
            Covode.recordClassIndex(59902);
        }

        void a(com.ss.android.ugc.aweme.detail.g.a aVar);
    }

    static {
        Covode.recordClassIndex(59901);
    }

    /* access modifiers changed from: package-private */
    public static final class b<V> implements Callable {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ String f94289a;

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ String f94290b;

        /* renamed from: c  reason: collision with root package name */
        final /* synthetic */ String f94291c;

        static {
            Covode.recordClassIndex(59903);
        }

        b(String str, String str2, String str3) {
            this.f94289a = str;
            this.f94290b = str2;
            this.f94291c = str3;
        }

        /* access modifiers changed from: private */
        /* renamed from: a */
        public com.ss.android.ugc.aweme.detail.g.a call() {
            try {
                return ba.a().a("[" + this.f94289a + ']', this.f94290b, this.f94291c);
            } catch (Exception unused) {
                return null;
            }
        }
    }

    /* access modifiers changed from: package-private */
    public static final class c<TTaskResult, TContinuationResult> implements g {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ a f94292a;

        static {
            Covode.recordClassIndex(59904);
        }

        c(a aVar) {
            this.f94292a = aVar;
        }

        @Override // b.g
        public final /* synthetic */ Object then(i iVar) {
            com.ss.android.ugc.aweme.detail.g.a aVar;
            a aVar2 = this.f94292a;
            if (iVar != null) {
                aVar = (com.ss.android.ugc.aweme.detail.g.a) iVar.d();
            } else {
                aVar = null;
            }
            aVar2.a(aVar);
            return iVar;
        }
    }

    public static String a(Intent intent, String str) {
        try {
            return intent.getStringExtra(str);
        } catch (Exception unused) {
            return null;
        }
    }
}
