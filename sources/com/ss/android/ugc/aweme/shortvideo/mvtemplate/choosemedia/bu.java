package com.ss.android.ugc.aweme.shortvideo.mvtemplate.choosemedia;

import android.content.Intent;
import androidx.fragment.app.e;
import com.bytedance.covode.number.Covode;
import com.ss.android.ugc.aweme.port.in.g;
import h.f.b.l;
import h.f.b.m;
import h.h;
import h.i;
import h.z;
import java.util.ArrayList;

public final class bu implements v {

    /* renamed from: a  reason: collision with root package name */
    final h f129122a = i.a((h.f.a.a) new a(this));

    /* renamed from: b  reason: collision with root package name */
    final h f129123b = i.a((h.f.a.a) new c(this));

    /* renamed from: c  reason: collision with root package name */
    public final e f129124c;

    /* renamed from: d  reason: collision with root package name */
    public final int f129125d;

    /* renamed from: e  reason: collision with root package name */
    public final long f129126e;

    /* renamed from: f  reason: collision with root package name */
    public final long f129127f;

    static {
        Covode.recordClassIndex(84744);
    }

    @Override // com.ss.android.ugc.aweme.shortvideo.mvtemplate.choosemedia.v
    public final void a() {
    }

    static final class a extends m implements h.f.a.a<bs> {
        final /* synthetic */ bu this$0;

        static {
            Covode.recordClassIndex(84745);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        a(bu buVar) {
            super(0);
            this.this$0 = buVar;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        @Override // h.f.a.a
        public final /* synthetic */ bs invoke() {
            return new bs(this.this$0.f129124c, this.this$0.f129126e, this.this$0.f129127f);
        }
    }

    static final class c extends m implements h.f.a.a<m> {
        final /* synthetic */ bu this$0;

        static {
            Covode.recordClassIndex(84747);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        c(bu buVar) {
            super(0);
            this.this$0 = buVar;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        @Override // h.f.a.a
        public final /* synthetic */ m invoke() {
            return new m(this.this$0.f129124c, this.this$0.f129126e, this.this$0.f129127f);
        }
    }

    static final class b extends m implements h.f.a.b<Boolean, z> {
        final /* synthetic */ Intent $data;
        final /* synthetic */ int $requestCode;
        final /* synthetic */ int $resultCode;
        final /* synthetic */ bu this$0;

        static {
            Covode.recordClassIndex(84746);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        b(bu buVar, int i2, int i3, Intent intent) {
            super(1);
            this.this$0 = buVar;
            this.$requestCode = i2;
            this.$resultCode = i3;
            this.$data = intent;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
        @Override // h.f.a.b
        public final /* synthetic */ z invoke(Boolean bool) {
            if (bool.booleanValue()) {
                ((m) this.this$0.f129123b.getValue()).a(this.$requestCode, this.$resultCode, this.$data);
            } else {
                ((bs) this.this$0.f129122a.getValue()).a(this.$requestCode, this.$resultCode, this.$data);
            }
            return z.f158842a;
        }
    }

    @Override // com.ss.android.ugc.aweme.shortvideo.mvtemplate.choosemedia.v
    public final void a(int i2, int i3, Intent intent) {
        l.d(intent, "");
        ArrayList parcelableArrayListExtra = intent.getParcelableArrayListExtra("key_choose_media_data");
        if (parcelableArrayListExtra != null && !parcelableArrayListExtra.isEmpty()) {
            g.a().L().a(this.f129124c, parcelableArrayListExtra, new b(this, i2, i3, intent));
        }
    }

    public bu(e eVar, int i2, long j2, long j3) {
        l.d(eVar, "");
        this.f129124c = eVar;
        this.f129125d = i2;
        this.f129126e = j2;
        this.f129127f = j3;
    }
}
