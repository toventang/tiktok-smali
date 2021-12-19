package com.ss.android.ugc.aweme.shortvideo;

import android.content.Intent;
import com.bytedance.covode.number.Covode;
import com.ss.android.ugc.aweme.port.in.g;
import com.ss.android.ugc.aweme.shortvideo.ui.TimeSpeedModelExtension;
import com.ss.android.ugc.aweme.shortvideo.ui.bl;
import h.f.a.b;
import h.f.b.l;
import h.f.b.m;
import java.util.Collection;

public final class dm {
    static {
        Covode.recordClassIndex(82958);
    }

    public static final boolean c(ShortVideoContext shortVideoContext) {
        if (shortVideoContext == null || !shortVideoContext.aP) {
            return false;
        }
        return true;
    }

    static final class a extends m implements b<Boolean, Long> {
        final /* synthetic */ ShortVideoContext $this_adjustMaxDuration;

        static {
            Covode.recordClassIndex(82959);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        a(ShortVideoContext shortVideoContext) {
            super(1);
            this.$this_adjustMaxDuration = shortVideoContext;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
        @Override // h.f.a.b
        public final /* synthetic */ Long invoke(Boolean bool) {
            return Long.valueOf(a(bool.booleanValue()));
        }

        public final long a(boolean z) {
            return g.a().l().getMaxDurationResolver().getMaxShootingDuration(z, this.$this_adjustMaxDuration);
        }
    }

    public static final boolean a(ShortVideoContext shortVideoContext) {
        l.d(shortVideoContext, "");
        dt<TimeSpeedModelExtension> dtVar = shortVideoContext.f124757b.f124711f;
        l.b(dtVar, "");
        if ((dtVar instanceof Collection) && dtVar.isEmpty()) {
            return false;
        }
        for (TimeSpeedModelExtension timeSpeedModelExtension : dtVar) {
            l.b(timeSpeedModelExtension, "");
            if (bl.a(timeSpeedModelExtension)) {
                return true;
            }
        }
        return false;
    }

    public static final boolean b(ShortVideoContext shortVideoContext) {
        if (shortVideoContext == null) {
            return false;
        }
        if (shortVideoContext.f124757b.c() || com.ss.android.ugc.aweme.shortvideo.duet.a.a(shortVideoContext) || ((shortVideoContext.c() && com.ss.android.ugc.aweme.shortvideo.record.b.a.b(shortVideoContext.F.f124773a)) || shortVideoContext.f124757b.u == 1)) {
            return true;
        }
        return false;
    }

    public static final void d(ShortVideoContext shortVideoContext) {
        long min;
        long j2;
        if (shortVideoContext != null) {
            a aVar = new a(shortVideoContext);
            int i2 = shortVideoContext.Z;
            boolean z = true;
            if (i2 == 10) {
                min = Math.min(shortVideoContext.f124757b.f124707b, aVar.a(true));
            } else if (i2 == 11) {
                min = Math.min(shortVideoContext.f124757b.f124707b, aVar.a(false));
            } else if (i2 != 14) {
                min = shortVideoContext.f124757b.f124707b;
            } else {
                min = Math.min(shortVideoContext.f124757b.f124707b, aVar.a(false));
            }
            shortVideoContext.a(min);
            com.ss.android.ugc.aweme.sticker.model.a aVar2 = shortVideoContext.f124757b.r;
            if (aVar2 != null) {
                j2 = aVar2.getMaxDuration();
            } else {
                j2 = 0;
            }
            com.ss.android.ugc.aweme.sticker.model.a aVar3 = shortVideoContext.f124757b.r;
            if (aVar3 == null || aVar3.isMultiBgVideo()) {
                z = false;
            }
            if (j2 > 0 && z) {
                shortVideoContext.a(Math.min(shortVideoContext.f124757b.f124707b, j2));
            }
        }
    }

    public static final void a(Intent intent, ShortVideoContext shortVideoContext) {
        l.d(intent, "");
        l.d(shortVideoContext, "");
        intent.putExtra("is_west_window_exist", shortVideoContext.aR);
        intent.putExtra("record_timer", shortVideoContext.aK);
    }
}
