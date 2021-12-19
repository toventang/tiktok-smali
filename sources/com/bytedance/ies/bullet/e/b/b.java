package com.bytedance.ies.bullet.e.b;

import android.net.Uri;
import com.bytedance.covode.number.Covode;
import com.bytedance.ies.bullet.service.base.al;
import com.bytedance.ies.bullet.service.base.x;
import com.bytedance.ies.bullet.ui.common.BulletContainerView;
import h.f.b.l;
import h.f.b.m;
import h.z;

public final class b {

    /* renamed from: a  reason: collision with root package name */
    public final a f32125a;

    /* renamed from: b  reason: collision with root package name */
    private final int f32126b;

    static {
        Covode.recordClassIndex(18840);
    }

    public b(int i2) {
        this.f32126b = i2;
        this.f32125a = new a(i2);
    }

    public static final class a extends m implements h.f.a.m<Boolean, com.bytedance.ies.bullet.service.base.b, z> {
        final /* synthetic */ x $callback;
        final /* synthetic */ Uri $uniqueSchema;
        final /* synthetic */ b this$0;

        static {
            Covode.recordClassIndex(18841);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public a(b bVar, x xVar, Uri uri) {
            super(2);
            this.this$0 = bVar;
            this.$callback = xVar;
            this.$uniqueSchema = uri;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object, java.lang.Object] */
        @Override // h.f.a.m
        public final /* synthetic */ z invoke(Boolean bool, com.bytedance.ies.bullet.service.base.b bVar) {
            boolean booleanValue = bool.booleanValue();
            com.bytedance.ies.bullet.service.base.b bVar2 = bVar;
            l.c(bVar2, "");
            if (booleanValue) {
                this.$callback.a();
                this.this$0.f32125a.a(this.$uniqueSchema, bVar2);
            } else {
                x.a.a(this.$callback, al.FAIL_LOAD_ERROR);
                BulletContainerView a2 = com.bytedance.ies.bullet.e.c.a.a(bVar2.f32570c);
                if (a2 != null) {
                    a2.a();
                }
            }
            return z.f158842a;
        }
    }
}
