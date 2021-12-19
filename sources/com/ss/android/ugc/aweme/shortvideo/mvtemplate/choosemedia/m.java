package com.ss.android.ugc.aweme.shortvideo.mvtemplate.choosemedia;

import android.app.Activity;
import android.content.Intent;
import com.bytedance.covode.number.Covode;
import com.ss.android.ugc.aweme.mediachoose.helper.MediaModel;
import com.ss.android.ugc.aweme.mediachoose.helper.c;
import com.ss.android.ugc.aweme.port.in.g;
import com.ss.android.ugc.aweme.shortvideo.ShortVideoContext;
import com.ss.android.ugc.aweme.shortvideo.mvtemplate.choosemedia.bs;
import h.f.b.l;
import h.h;
import h.i;
import h.u;
import java.util.ArrayList;

public final class m implements v {

    /* renamed from: a  reason: collision with root package name */
    public final Activity f129149a;

    /* renamed from: b  reason: collision with root package name */
    public final long f129150b;

    /* renamed from: c  reason: collision with root package name */
    public final long f129151c;

    /* renamed from: d  reason: collision with root package name */
    private final h f129152d = i.a((h.f.a.a) new a(this));

    static {
        Covode.recordClassIndex(84778);
    }

    @Override // com.ss.android.ugc.aweme.shortvideo.mvtemplate.choosemedia.v
    public final void a() {
    }

    static final class a extends h.f.b.m implements h.f.a.a<com.ss.android.ugc.aweme.ak.a> {
        final /* synthetic */ m this$0;

        static {
            Covode.recordClassIndex(84779);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        a(m mVar) {
            super(0);
            this.this$0 = mVar;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        @Override // h.f.a.a
        public final /* synthetic */ com.ss.android.ugc.aweme.ak.a invoke() {
            return g.a().L().a(this.this$0.f129149a, this.this$0.f129150b, this.this$0.f129151c);
        }
    }

    public m(Activity activity, long j2, long j3) {
        l.d(activity, "");
        this.f129149a = activity;
        this.f129150b = j2;
        this.f129151c = j3;
    }

    @Override // com.ss.android.ugc.aweme.shortvideo.mvtemplate.choosemedia.v
    public final void a(int i2, int i3, Intent intent) {
        ShortVideoContext shortVideoContext;
        l.d(intent, "");
        if (i3 == -1 && i2 == 1) {
            long longExtra = intent.getLongExtra("extra_start_enter_edit_page", -1);
            int intExtra = intent.getIntExtra("extra_stick_point_type", 0);
            ArrayList parcelableArrayListExtra = intent.getParcelableArrayListExtra("key_choose_media_data");
            if (!(parcelableArrayListExtra == null || (shortVideoContext = (ShortVideoContext) intent.getParcelableExtra("key_short_video_context")) == null)) {
                u uVar = bq.a(this.f129149a, parcelableArrayListExtra, this.f129150b, 3600000);
                boolean booleanValue = ((Boolean) uVar.component1()).booleanValue();
                int intValue = ((Number) uVar.component2()).intValue();
                long longValue = ((Number) uVar.component3()).longValue();
                if (booleanValue) {
                    c.f109414a.b();
                    int size = parcelableArrayListExtra.size();
                    for (int i4 = 0; i4 < size; i4++) {
                        c.f109414a.a((MediaModel) parcelableArrayListExtra.get(i4));
                    }
                    com.ss.android.ugc.aweme.shortvideo.cut.stickingpoint.h.a(shortVideoContext.r, shortVideoContext.q);
                    bt.a(shortVideoContext, parcelableArrayListExtra, intValue, (int) longValue);
                    bt.a(parcelableArrayListExtra);
                    ((com.ss.android.ugc.aweme.ak.a) this.f129152d.getValue()).a(parcelableArrayListExtra, intent, bs.a.a(this.f129149a, shortVideoContext, intExtra, longExtra), null);
                }
            }
        }
    }
}
