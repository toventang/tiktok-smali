package com.ss.android.ugc.aweme;

import android.content.Context;
import com.bytedance.covode.number.Covode;
import com.ss.android.ugc.aweme.services.ITakeInSameOptimize;
import h.f.b.l;

public final class dg implements ITakeInSameOptimize {

    /* renamed from: a  reason: collision with root package name */
    public static final dg f80070a = new dg();

    /* renamed from: b  reason: collision with root package name */
    public static final a f80071b = new a((byte) 0);

    @Override // com.ss.android.ugc.aweme.services.ITakeInSameOptimize
    public final boolean enableCombineMusicAndEffectDownload() {
        return true;
    }

    @Override // com.ss.android.ugc.aweme.services.ITakeInSameOptimize
    public final boolean enableTakeInSameRecordOptimize(Context context) {
        l.d(context, "");
        return true;
    }

    public static final class a {
        static {
            Covode.recordClassIndex(49844);
        }

        private a() {
        }

        public /* synthetic */ a(byte b2) {
            this();
        }
    }

    static {
        Covode.recordClassIndex(49843);
    }
}
