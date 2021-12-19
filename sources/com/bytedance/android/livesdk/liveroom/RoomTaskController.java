package com.bytedance.android.livesdk.liveroom;

import com.bytedance.android.live.network.e;
import com.bytedance.android.live.network.response.d;
import com.bytedance.android.live.t.a;
import com.bytedance.android.livesdk.live.api.LIveTaskApi;
import com.bytedance.android.livesdk.util.rxutils.i;
import com.bytedance.android.livesdkapi.host.IHostAction;
import com.bytedance.android.livesdkapi.session.EnterRoomConfig;
import com.bytedance.android.livesdkapi.session.f;
import com.bytedance.common.utility.m;
import com.bytedance.covode.number.Covode;
import f.a.b.b;
import f.a.d.g;
import f.a.t;
import f.a.x;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.concurrent.TimeUnit;

public class RoomTaskController implements ISubController {
    private List<b> taskDisposable = new ArrayList();

    static {
        Covode.recordClassIndex(10486);
    }

    @Override // com.bytedance.android.livesdk.liveroom.ISubController
    public void init() {
    }

    @Override // com.bytedance.android.livesdk.liveroom.ISubController
    public void onResume() {
    }

    @Override // com.bytedance.android.livesdk.liveroom.ISubController
    public void onDestory() {
        for (b bVar : this.taskDisposable) {
            bVar.dispose();
        }
    }

    @Override // com.bytedance.android.livesdk.liveroom.ISubController
    public void onCreate() {
        List<com.bytedance.android.livesdkapi.model.b> liveActivityTasksSetting = ((IHostAction) a.a(IHostAction.class)).getLiveActivityTasksSetting();
        EnterRoomConfig enterRoomConfig = f.a.f23366a.a().f23354b;
        if (!(liveActivityTasksSetting == null || liveActivityTasksSetting.size() <= 0 || enterRoomConfig == null || enterRoomConfig.f23299c == null || !m.a("referral_task", enterRoomConfig.f23299c.J))) {
            for (final com.bytedance.android.livesdkapi.model.b bVar : liveActivityTasksSetting) {
                if (bVar.f23271b.intValue() == 2) {
                    this.taskDisposable.add(t.a(bVar.f23272c.longValue(), TimeUnit.SECONDS, f.a.a.a.a.a(f.a.a.b.a.f157156a)).d(new f.a.d.f<Long>() {
                        /* class com.bytedance.android.livesdk.liveroom.RoomTaskController.AnonymousClass1 */

                        static {
                            Covode.recordClassIndex(10487);
                        }

                        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
                        @Override // f.a.d.f
                        public final /* synthetic */ void accept(Long l2) {
                            if (bVar.f23273d != null) {
                                for (String str : bVar.f23273d) {
                                    ((LIveTaskApi) e.a().a(LIveTaskApi.class)).report(str, new HashMap()).a((g<? super d<com.bytedance.android.live.base.model.live.d>, ? extends x<? extends R>>) new g<d<com.bytedance.android.live.base.model.live.d>, x<?>>() {
                                        /* class com.bytedance.android.livesdk.liveroom.RoomTaskController.AnonymousClass1.AnonymousClass1 */

                                        static {
                                            Covode.recordClassIndex(10488);
                                        }

                                        /* Return type fixed from 'java.lang.Object' to match base method */
                                        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
                                        @Override // f.a.d.g
                                        public final /* synthetic */ x<?> apply(d<com.bytedance.android.live.base.model.live.d> dVar) {
                                            d<com.bytedance.android.live.base.model.live.d> dVar2 = dVar;
                                            if (((com.bytedance.android.live.base.model.live.d) dVar2.data).f7414a == 0 || ((com.bytedance.android.live.base.model.live.d) dVar2.data).f7414a == 51) {
                                                return t.b(dVar2);
                                            }
                                            return t.a(new Exception("retry"));
                                        }
                                    }, false).g(i.a((long) ((int) ((Math.random() * 1001.0d) + 4000.0d)))).a(e.f18700a, f.f18701a);
                                }
                            }
                        }
                    }));
                }
            }
        }
    }
}
