package com.bytedance.android.livesdk.chatroom.d;

import android.graphics.Bitmap;
import android.graphics.Matrix;
import com.bytedance.android.live.base.model.ImageModel;
import com.bytedance.android.live.base.model.user.User;
import com.bytedance.android.live.core.f.k;
import com.bytedance.android.live.core.f.p;
import com.bytedance.android.live.core.f.y;
import com.bytedance.android.livesdk.j.co;
import com.bytedance.android.livesdk.j.df;
import com.bytedance.android.livesdk.utils.z;
import com.bytedance.android.livesdkapi.depend.model.live.Room;
import com.bytedance.bpea.basics.PrivacyCert;
import com.bytedance.bpea.store.policy.PrivacyPolicyStore;
import com.bytedance.covode.number.Covode;
import com.bytedance.frameworks.apm.trace.MethodCollector;
import com.bytedance.ies.sdk.datachannel.DataChannel;
import h.f.b.l;

public final class b {

    /* renamed from: a  reason: collision with root package name */
    final com.bytedance.android.live.broadcast.api.d.a f15197a;

    /* renamed from: b  reason: collision with root package name */
    final com.bytedance.android.live.broadcast.stream.c.b f15198b;

    /* renamed from: c  reason: collision with root package name */
    private final DataChannel f15199c;

    static {
        Covode.recordClassIndex(8417);
    }

    public static final class a implements p.b {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ b f15200a;

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ PrivacyCert f15201b;

        static {
            Covode.recordClassIndex(8419);
        }

        @Override // com.bytedance.android.live.core.f.p.b
        public final void a() {
            this.f15200a.a(null, this.f15201b);
        }

        @Override // com.bytedance.android.live.core.f.p.b
        public final void a(Bitmap bitmap) {
            Bitmap createBitmap;
            MethodCollector.i(7402);
            b bVar = this.f15200a;
            if (bitmap == null) {
                createBitmap = null;
            } else {
                Matrix matrix = new Matrix();
                matrix.postScale(1.0f, -1.0f);
                createBitmap = Bitmap.createBitmap(bitmap, 0, 0, bitmap.getWidth(), bitmap.getHeight(), matrix, true);
            }
            bVar.a(createBitmap, this.f15201b);
            MethodCollector.o(7402);
        }

        a(b bVar, PrivacyCert privacyCert) {
            this.f15200a = bVar;
            this.f15201b = privacyCert;
        }
    }

    public final void a(PrivacyCert privacyCert) {
        User owner;
        ImageModel avatarThumb;
        l.d(privacyCert, "");
        float c2 = ((float) y.c()) / ((float) y.b());
        Room room = (Room) this.f15199c.b(df.class);
        if (room != null && (owner = room.getOwner()) != null && (avatarThumb = owner.getAvatarThumb()) != null) {
            k.a(avatarThumb, y.c(), y.b(), new z(5, c2), new a(this, privacyCert));
        }
    }

    public final void a(Bitmap bitmap, PrivacyCert privacyCert) {
        if (bitmap != null) {
            com.bytedance.android.live.broadcast.api.d.a aVar = this.f15197a;
            if (aVar != null) {
                aVar.a(bitmap, privacyCert);
                return;
            }
            return;
        }
        com.bytedance.android.live.broadcast.api.d.a aVar2 = this.f15197a;
        if (aVar2 != null) {
            aVar2.b(privacyCert);
        }
    }

    public b(DataChannel dataChannel, com.bytedance.android.live.broadcast.api.d.a aVar, com.bytedance.android.live.broadcast.stream.c.b bVar) {
        l.d(dataChannel, "");
        this.f15199c = dataChannel;
        this.f15197a = aVar;
        this.f15198b = bVar;
        dataChannel.a(co.class, (h.f.a.b) new h.f.a.b<Boolean, h.z>(this) {
            /* class com.bytedance.android.livesdk.chatroom.d.b.AnonymousClass1 */

            static {
                Covode.recordClassIndex(8418);
            }

            /* Return type fixed from 'java.lang.Object' to match base method */
            /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
            @Override // h.f.a.b
            public final /* synthetic */ h.z invoke(Boolean bool) {
                boolean booleanValue = bool.booleanValue();
                b bVar = (b) this.receiver;
                if (booleanValue) {
                    bVar.a(PrivacyCert.Builder.Companion.with("bpea-782").usage("").tag("click pause live").policies(PrivacyPolicyStore.getVideoPrivacyPolicy(), PrivacyPolicyStore.getAudioPrivacyPolicy()).build());
                    com.bytedance.android.live.broadcast.stream.c.b bVar2 = bVar.f15198b;
                    if (bVar2 != null) {
                        bVar2.c();
                    }
                } else {
                    com.bytedance.android.live.broadcast.api.d.a aVar = bVar.f15197a;
                    if (aVar != null) {
                        aVar.k(PrivacyCert.Builder.Companion.with("bpea-781").usage("").tag("click continue live").policies(PrivacyPolicyStore.getVideoPrivacyPolicy(), PrivacyPolicyStore.getAudioPrivacyPolicy()).build());
                    }
                    com.bytedance.android.live.broadcast.stream.c.b bVar3 = bVar.f15198b;
                    if (bVar3 != null) {
                        bVar3.b();
                    }
                }
                return h.z.f158842a;
            }
        });
    }
}
