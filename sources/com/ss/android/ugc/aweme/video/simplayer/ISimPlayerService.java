package com.ss.android.ugc.aweme.video.simplayer;

import com.bytedance.covode.number.Covode;
import com.ss.android.ugc.aweme.cf.a.c;
import com.ss.android.ugc.aweme.player.sdk.api.i;
import com.ss.android.ugc.aweme.video.config.ISimPlayerConfig;
import com.ss.android.ugc.aweme.video.config.a;
import h.f.b.l;
import java.util.concurrent.ExecutorService;

public interface ISimPlayerService {

    /* renamed from: a  reason: collision with root package name */
    public static final Companion f143827a = Companion.f143828a;

    public interface a {
        static {
            Covode.recordClassIndex(94124);
        }

        void a(String str);
    }

    static {
        Covode.recordClassIndex(94121);
    }

    f a();

    f a(boolean z, boolean z2);

    void a(int i2);

    void a(a aVar);

    void a(ExecutorService executorService);

    i b();

    void c();

    public static final class Companion {

        /* renamed from: a  reason: collision with root package name */
        static final /* synthetic */ Companion f143828a = new Companion();

        private Companion() {
        }

        static {
            Covode.recordClassIndex(94123);
        }

        public final ISimPlayerService get() {
            ISimPlayerService iSimPlayerService;
            ISimPlayerConfig a2 = a.C3820a.f143369a.a();
            l.a((Object) a2, "");
            int playerType = a2.getPlayerType();
            if (playerType == 0) {
                iSimPlayerService = (ISimPlayerService) c.a("com.ss.android.ugc.aweme.video.simplayer.tt.TTSimPlayerServiceImpl");
                if (iSimPlayerService == null) {
                    iSimPlayerService = (ISimPlayerService) c.a("com.ss.android.ugc.aweme.video.simplayer.ttcrop.TTCropSimPlayerServiceImpl");
                }
                return iSimPlayerService;
            } else if (playerType != 1) {
                iSimPlayerService = (ISimPlayerService) c.a("com.ss.android.ugc.aweme.video.simplayer.exo.ExoSimPlayerServiceImpl");
            } else {
                iSimPlayerService = (ISimPlayerService) c.a("com.ss.android.ugc.aweme.video.simplayer.exo.ExoSimPlayerServiceImpl");
            }
            if (iSimPlayerService == null) {
                throw new IllegalStateException("cannot find match player service, please check config: getPlayerType. need:".concat(String.valueOf(playerType)));
            }
            return iSimPlayerService;
        }
    }
}
