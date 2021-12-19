package com.bytedance.android.live.effect;

import com.bytedance.android.live.effect.b.c;
import com.bytedance.android.live.effect.c.j;
import com.bytedance.android.live.effect.model.FilterModel;
import com.bytedance.android.live.effect.model.e;
import com.bytedance.android.livesdk.livesetting.effect.LiveNewEffectPanelSetting;
import com.bytedance.covode.number.Covode;
import com.bytedance.ies.sdk.datachannel.DataChannel;
import h.f.b.l;
import h.f.b.m;
import h.z;
import java.util.ArrayList;
import java.util.Collection;
import java.util.List;

public final class k implements com.bytedance.android.live.effect.api.a.k {

    /* renamed from: a  reason: collision with root package name */
    public static final k f9870a = new k();

    private k() {
    }

    static {
        Covode.recordClassIndex(5050);
    }

    static final class b extends m implements h.f.a.b<List<? extends FilterModel>, z> {
        final /* synthetic */ DataChannel $dataChannel;

        static {
            Covode.recordClassIndex(5052);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        b(DataChannel dataChannel) {
            super(1);
            this.$dataChannel = dataChannel;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
        @Override // h.f.a.b
        public final /* synthetic */ z invoke(List<? extends FilterModel> list) {
            l.d(list, "");
            j jVar = j.b.f9740a;
            DataChannel dataChannel = this.$dataChannel;
            com.bytedance.android.livesdk.ap.b<Integer> bVar = com.bytedance.android.livesdk.ap.a.O;
            l.b(bVar, "");
            Integer a2 = bVar.a();
            l.b(a2, "");
            jVar.a(dataChannel, a2.intValue(), true, false);
            return z.f158842a;
        }
    }

    static final class a extends m implements h.f.a.b<List<? extends e<com.bytedance.android.livesdkapi.depend.model.a>>, z> {
        final /* synthetic */ DataChannel $dataChannel;

        static {
            Covode.recordClassIndex(5051);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        a(DataChannel dataChannel) {
            super(1);
            this.$dataChannel = dataChannel;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
        @Override // h.f.a.b
        public final /* synthetic */ z invoke(List<? extends e<com.bytedance.android.livesdkapi.depend.model.a>> list) {
            List<? extends e<com.bytedance.android.livesdkapi.depend.model.a>> list2 = list;
            l.d(list2, "");
            ArrayList arrayList = new ArrayList();
            for (T t : list2) {
                arrayList.addAll(t.f9890b);
                for (T t2 : t.f9890b) {
                    Collection collection = t2.o;
                    if (collection == null) {
                        collection = h.a.z.INSTANCE;
                    }
                    arrayList.addAll(collection);
                }
            }
            c a2 = c.a.a();
            String str = com.bytedance.android.live.effect.api.a.f9639d;
            l.b(str, "");
            a2.a(str, arrayList);
            j.b.f9740a.a(this.$dataChannel);
            return z.f158842a;
        }
    }

    @Override // com.bytedance.android.live.effect.api.a.k
    public final void a(DataChannel dataChannel, androidx.lifecycle.m mVar, boolean z) {
        com.bytedance.android.live.effect.api.a.e f2;
        l.d(dataChannel, "");
        l.d(mVar, "");
        if (LiveNewEffectPanelSetting.INSTANCE.useNewPanel()) {
            g.a(dataChannel);
            if (z) {
                dataChannel.a(mVar, a.class, (h.f.a.b) new a(dataChannel)).a(mVar, e.class, (h.f.a.b) new b(dataChannel));
                return;
            }
            if (LiveNewEffectPanelSetting.INSTANCE.useNewPanel()) {
                f2 = c.a.a();
            } else {
                f2 = com.bytedance.android.live.effect.b.b.f();
                l.b(f2, "");
            }
            f2.c();
        } else if (z) {
            j.b.f9740a.a(dataChannel);
            return;
        }
        j jVar = j.b.f9740a;
        com.bytedance.android.livesdk.ap.b<Integer> bVar = com.bytedance.android.livesdk.ap.a.O;
        l.b(bVar, "");
        Integer a2 = bVar.a();
        l.b(a2, "");
        jVar.a(dataChannel, a2.intValue(), true, false);
    }
}
