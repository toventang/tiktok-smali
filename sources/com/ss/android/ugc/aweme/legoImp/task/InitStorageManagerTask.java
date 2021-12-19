package com.ss.android.ugc.aweme.legoImp.task;

import android.content.Context;
import android.os.Build;
import com.bytedance.covode.number.Covode;
import com.bytedance.u.d;
import com.bytedance.u.e;
import com.bytedance.u.g;
import com.ss.android.ugc.aweme.lego.ab;
import com.ss.android.ugc.aweme.lego.ad;
import com.ss.android.ugc.aweme.lego.ae;
import com.ss.android.ugc.aweme.lego.w;
import com.ss.android.ugc.aweme.lego.x;
import h.f.b.m;
import h.h;
import h.i;
import java.util.List;

public final class InitStorageManagerTask implements w {

    /* renamed from: c  reason: collision with root package name */
    private static final a f107799c = new a((byte) 0);

    /* renamed from: a  reason: collision with root package name */
    public final String f107800a = "InitStorageManagerTask";

    /* renamed from: b  reason: collision with root package name */
    final h f107801b = i.a((h.f.a.a) new c(this));

    static {
        Covode.recordClassIndex(69020);
    }

    @Override // com.ss.android.ugc.aweme.lego.n
    public final int bK_() {
        return 1;
    }

    @Override // com.ss.android.ugc.aweme.lego.n
    public final ad f() {
        return x.a(this);
    }

    @Override // com.ss.android.ugc.aweme.lego.n
    public final String g() {
        return "task_";
    }

    @Override // com.ss.android.ugc.aweme.lego.n
    public final boolean i() {
        return true;
    }

    @Override // com.ss.android.ugc.aweme.lego.n
    public final List j() {
        return null;
    }

    static final class a {
        static {
            Covode.recordClassIndex(69021);
        }

        private a() {
        }

        public /* synthetic */ a(byte b2) {
            this();
        }
    }

    @Override // com.ss.android.ugc.aweme.lego.w
    public final ae b() {
        return ae.MAIN;
    }

    @Override // com.ss.android.ugc.aweme.lego.n
    public final ab k() {
        return ab.DEFAULT;
    }

    static final class c extends m implements h.f.a.a<e> {
        final /* synthetic */ InitStorageManagerTask this$0;

        static {
            Covode.recordClassIndex(69023);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        c(InitStorageManagerTask initStorageManagerTask) {
            super(0);
            this.this$0 = initStorageManagerTask;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        @Override // h.f.a.a
        public final /* synthetic */ e invoke() {
            return a();
        }

        private static e a() {
            if (Build.VERSION.SDK_INT > 22) {
                return null;
            }
            try {
                e eVar = new e();
                eVar.f45714a = 52428800;
                eVar.f45715b = 52428800;
                eVar.f45716c = 52428800;
                return eVar;
            } catch (Throwable th) {
                th.getMessage();
                return null;
            }
        }
    }

    static final class b<T> implements g {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ InitStorageManagerTask f107802a;

        static {
            Covode.recordClassIndex(69022);
        }

        b(InitStorageManagerTask initStorageManagerTask) {
            this.f107802a = initStorageManagerTask;
        }

        @Override // com.bytedance.u.g
        public final /* synthetic */ Object a() {
            return this.f107802a.f107801b.getValue();
        }
    }

    @Override // com.ss.android.ugc.aweme.lego.n
    public final String h() {
        return getClass().getSimpleName();
    }

    @Override // com.ss.android.ugc.aweme.lego.n
    public final void a(Context context) {
        d.f45709a = new b(this);
    }
}
