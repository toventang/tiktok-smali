package com.ss.android.ugc.aweme.dsp.playpage.subpage.shuffle;

import com.bytedance.covode.number.Covode;
import com.ss.android.ugc.aweme.dsp.common.arch.a.a;
import com.ss.android.ugc.aweme.dsp.playpage.base.BasePlayerViewModel;
import f.a.d.f;
import h.f.b.l;
import java.util.List;
import org.greenrobot.eventbus.j;

public final class ShufflePlayerViewModel extends BasePlayerViewModel implements j {

    /* renamed from: j  reason: collision with root package name */
    public static final a f83923j = new a((byte) 0);

    static {
        Covode.recordClassIndex(52343);
    }

    public static final class a {
        static {
            Covode.recordClassIndex(52344);
        }

        private a() {
        }

        public /* synthetic */ a(byte b2) {
            this();
        }
    }

    @Override // com.ss.android.ugc.aweme.dsp.playpage.base.BasePlayerViewModel
    public final com.ss.android.ugc.aweme.dsp.playerservice.f.a e() {
        return a.C1960a.a(this.f83687i).f83291b.f83362b;
    }

    @Override // com.ss.android.ugc.aweme.dsp.playpage.base.BasePlayerViewModel
    public final void i() {
        com.ss.android.ugc.aweme.dsp.playerservice.e.b w = e().m();
        if (w != null) {
            f.a.b.b a2 = w.e().b().a(f.a.a.a.a.a(f.a.a.b.a.f157156a)).a(new b(this), new c(this));
            l.b(a2, "");
            a(a2);
        }
    }

    @Override // com.ss.android.ugc.aweme.dsp.playpage.base.BasePlayerViewModel
    public final void a(String str) {
        l.d(str, "");
        super.a(str);
        e().b(com.ss.android.ugc.aweme.dsp.playerservice.c.c.SEQUENCE);
    }

    static final class c<T> implements f {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ ShufflePlayerViewModel f83925a;

        static {
            Covode.recordClassIndex(52346);
        }

        c(ShufflePlayerViewModel shufflePlayerViewModel) {
            this.f83925a = shufflePlayerViewModel;
        }

        @Override // f.a.d.f
        public final /* synthetic */ void accept(Object obj) {
            Throwable th = (Throwable) obj;
            ((BasePlayerViewModel) this.f83925a).f83679a.setValue(false);
            this.f83925a.f83680b.setValue(true);
            l.b(th, "");
            com.ss.android.ugc.aweme.dsp.common.b.b.a("loadData", th);
        }
    }

    static final class b<T> implements f {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ ShufflePlayerViewModel f83924a;

        static {
            Covode.recordClassIndex(52345);
        }

        b(ShufflePlayerViewModel shufflePlayerViewModel) {
            this.f83924a = shufflePlayerViewModel;
        }

        @Override // f.a.d.f
        public final /* synthetic */ void accept(Object obj) {
            List list = (List) obj;
            l.b(list, "");
            if (!list.isEmpty()) {
                this.f83924a.f83681c.setValue(null);
                this.f83924a.f83680b.setValue(false);
            } else {
                this.f83924a.f83680b.setValue(true);
            }
            String.valueOf("loadData " + (!list.isEmpty()));
        }
    }
}
